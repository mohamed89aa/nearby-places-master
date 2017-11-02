
package com.esri.android.nearbyplaces.filter;

import com.esri.android.nearbyplaces.BasePresenter;
import com.esri.android.nearbyplaces.BaseView;

import java.util.List;


public interface FilterContract {
  interface View extends BaseView<Presenter> {

  }
  interface Presenter extends BasePresenter {
    List<FilterItem> getFilteredCategories();
  }

  interface FilterView{
    void onFilterDialogClose(boolean applyFilter);
  }
}
