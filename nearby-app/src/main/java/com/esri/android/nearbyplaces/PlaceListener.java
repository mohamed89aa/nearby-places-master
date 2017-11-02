
package com.esri.android.nearbyplaces;

import com.esri.android.nearbyplaces.data.Place;

public interface PlaceListener {
  void showDetail(Place place);
  void onMapViewChange();
}
