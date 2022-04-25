package racingcar.utils;

import static java.lang.String.join;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import racingcar.car.Car;
import racingcar.car.CarName;
import racingcar.car.Cars;
import racingcar.game.InputCarNames;

public class TestCarsUtils {

    public static final String DELIMITER = ", ";

    public static List<Car> testCarList() {
        List<Car> carList = new ArrayList<>();

        for (int i = 0; i < Randoms.pickNumberInRange(1, 10); i++) {
            carList.add(Car.of(randomCarName()));
        }

        return carList;
    }

    public static InputCarNames testInputCarNames() {
        List<String> carStringList = new ArrayList<>();
        for (int i = 0; i < Randoms.pickNumberInRange(1, 10); i++) {
            carStringList.add(randomCarName().getName());
        }

        return InputCarNames.valueOf(join(DELIMITER, carStringList));
    }

    public static Cars testCars() {
        return Cars.of(testCarList());
    }

    public static Car testCar() {
        return Car.of(randomCarName());
    }

    private static CarName randomCarName() {
        return CarName.of("car_" + Randoms.pickNumberInRange(1, 9));
    }
}
