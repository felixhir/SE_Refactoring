public class NewReleasePrice extends Price {

    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    @Override
    double getCharge(int daysRented){
        return daysRented * 3;
    }

}
