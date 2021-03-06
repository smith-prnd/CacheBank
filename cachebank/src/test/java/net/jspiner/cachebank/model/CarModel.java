package net.jspiner.cachebank.model;

import android.support.annotation.Nullable;

import net.jspiner.cachebank.DummyNetwork;
import net.jspiner.cachebank.Provider;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.annotations.NonNull;

/**
 * Created by JSpiner on 2017. 7. 13..
 * JSpiner
 * Contact : jspiner@naver.com
 */

public class CarModel extends Provider<CarModel> {

    public int index;
    public String carName;

    public CarModel(){

    }

    public CarModel(int index, String carName){
        this.index = index;
        this.carName = carName;
    }

    @Override
    public int getCacheTime() {
        return 1000;
    }

    @Override
    public CarModel fetchData(String key, @Nullable CarModel prevData) {
        return DummyNetwork.requestCar(key);
    }

}
