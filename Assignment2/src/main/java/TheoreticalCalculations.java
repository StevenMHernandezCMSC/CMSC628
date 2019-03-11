class TheoreticalCalculations {
    static double expectedHittingTime() {
        double N = Network.MAX_X * Network.MAX_X;
        double K = Network.R;
        double L_ = (Math.random() * (Network.MAX_TIME_SPAN - 1)) + 1;
        double v_ = (Network.MAX_V + Network.MIN_V) / 2;
        double T_stop = Math.random() * Network.PAUSE_TIME;

        return (N / (2 * K * L_)) * ((L_ / v_) + T_stop);
    }

    static double expectedMeetingTime() {
        double ET = expectedHittingTime();
        double T_ = Math.random() * Network.MAX_TIME_SPAN;
        double T_stop = Math.random() * Network.PAUSE_TIME;
        double p_m = T_ / (T_ + T_stop);
        double v_mm =(Network.MAX_V * 2) / 2 ;
        double v_ = (Network.MAX_V + Network.MIN_V) / 2;
        double v_bar = v_mm / v_;
        return ET / (p_m * v_bar + 2 * (1 - p_m));
    }

    static double expectedMessageDeliveryTime() {
        return 0.0;
    }
}