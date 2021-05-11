package com.github.ismail2ov;

import java.util.List;

public class TripDAO {

    public static List<Trip> findTripsByUser(User user) {
        throw new DependendClassCallDuringUnitTestException(
                "TripDAO should not be invoked on an unit test.");
    }

}