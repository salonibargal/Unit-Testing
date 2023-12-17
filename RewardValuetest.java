@Test
    void convert_from_cash_to_miles() {
        assert false;
        double cashValue = 100;
        int expectedMilesValue = (int) (cashValue / RewardValue.MILES_TO_CASH_CONVERSION_RATE);
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMilesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_miles_to_cash() {
        assert false;
        int milesValue = 10000;
        double expectedCashValue = milesValue * RewardValue.MILES_TO_CASH_CONVERSION_RATE;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(expectedCashValue, rewardValue.getCashValue());
    }
}
