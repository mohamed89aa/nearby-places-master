
package com.esri.android.nearbyplaces.data;


import java.util.List;

/**
 * Main entry point for accessing places data.
 */
public interface PlacesRepository {
  interface LoadPlacesCallback{  // callback from server

    void onPlacesLoaded(List<Place> places);
  }


}
