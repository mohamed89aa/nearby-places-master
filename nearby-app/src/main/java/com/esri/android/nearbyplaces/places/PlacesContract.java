

package com.esri.android.nearbyplaces.places;

import android.location.Location;
import com.esri.android.nearbyplaces.BasePresenter;
import com.esri.android.nearbyplaces.BaseView;
import com.esri.android.nearbyplaces.data.Place;
import com.esri.arcgisruntime.geometry.Envelope;

import java.util.List;


public interface PlacesContract {

  interface View extends BaseView<Presenter> {

    void showNearbyPlaces(List<Place> places);

    void showProgressIndicator(String message);

    void showMessage(String message);


  }

  interface Presenter extends BasePresenter {

    void setPlacesNearby(List<Place> places);

    void setLocation(Location location);

    void getPlacesNearby();

    Envelope getExtentForNearbyPlaces();

  }
}
