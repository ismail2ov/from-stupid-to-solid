package com.github.ismail2ov;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripServiceTest {
    @Test
    void should_throw_exception_when_user_is_not_logged_in() {
        TripService tripService = new TestableTripService();
        assertThrows(UserNotLoggedInException.class, () -> tripService.getTripsByUser(null));
    }

    private class TestableTripService extends TripService {
        @Override
        protected User getLoggedUser() {
            return null;
        }
    }
}