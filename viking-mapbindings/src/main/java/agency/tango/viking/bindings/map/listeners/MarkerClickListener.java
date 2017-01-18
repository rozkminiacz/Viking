package agency.tango.viking.bindings.map.listeners;

import com.google.android.gms.maps.model.Marker;

import agency.tango.viking.bindings.map.adapters.MarkerClickAdapter;
import agency.tango.viking.bindings.map.clickHandlers.ItemClickListener;
import agency.tango.viking.bindings.map.managers.MarkerManager;
import agency.tango.viking.bindings.map.models.BindableMarker;

public class MarkerClickListener<T> extends MarkerClickAdapter<BindableMarker<T>> {
  private final MarkerManager<T> markerManager;

  public MarkerClickListener(ItemClickListener<BindableMarker<T>> itemClickListener,
      MarkerManager<T> markerManager) {
    super(itemClickListener);
    this.markerManager = markerManager;
  }

  @Override
  public BindableMarker<T> getModel(Marker marker) {
    return markerManager.retrieveBindableMarker(marker);
  }
}
