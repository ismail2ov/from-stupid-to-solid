package com.github.ismail2ov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripServiceTest {
    public static final User GUEST = null;
    protected User loggedUser = null;

    @Test
    void should_throw_exception_when_user_is_not_logged_in() {
        TripService tripService = new TestableTripService();
        loggedUser = GUEST;

        assertThrows(UserNotLoggedInException.class, () -> tripService.getTripsByUser(GUEST));
    }

    private class TestableTripService extends TripService {
        @Override
        protected User getLoggedUser() {
            return loggedUser;
        }
    }
}