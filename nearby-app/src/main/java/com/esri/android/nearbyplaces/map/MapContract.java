
package com.esri.android.nearbyplaces.map;

import android.widget.LinearLayout;
import com.esri.android.nearbyplaces.BasePresenter;
import com.esri.android.nearbyplaces.BaseView;
import com.esri.android.nearbyplaces.data.Place;
import com.esri.arcgisruntime.geometry.Envelope;
import com.esri.arcgisruntime.geometry.Point;
import com.esri.arcgisruntime.mapping.view.MapView;
import com.esri.arcgisruntime.tasks.networkanalysis.RouteResult;

import java.util.List;

public interface MapContract {

  interface View extends BaseView<Presenter>{

    void showNearbyPlaces(List<Place> placeList);

    MapView getMapView();

    void centerOnPlace(Place p);

    void setRoute(RouteResult routeResult, Point start, Point end);

    void showMessage(String message);

    void showProgressIndicator(String message);

    void showRouteDetail(int position);

    void restoreMapView();

  }

  interface Presenter extends BasePresenter {

    void findPlacesNearby();

    void centerOnPlace(Place p);

    Place findPlaceForPoint(Point p);

    void getRoute();

    void setCurrentExtent(Envelope envelope);
  }
}
