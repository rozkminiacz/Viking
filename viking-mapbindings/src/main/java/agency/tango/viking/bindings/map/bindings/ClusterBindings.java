package agency.tango.viking.bindings.map.bindings;

import android.databinding.BindingAdapter;

import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.algo.Algorithm;

import java.util.Collection;

import agency.tango.viking.bindings.map.ClusterMapItem;
import agency.tango.viking.bindings.map.GoogleMapView;
import agency.tango.viking.bindings.map.RendererFactory;

public class ClusterBindings {
  private ClusterBindings() {
  }

  @BindingAdapter("clusterItems")
  public static <T extends ClusterMapItem> void clusterItems(GoogleMapView googleMapView,
      Collection<T> items) {
    if (items == null) {
      return;
    }

    googleMapView.clusterItems(items);
  }

  @BindingAdapter("rendererFactory")
  public static <T extends ClusterMapItem> void setRendererFactory(GoogleMapView googleMapView,
      RendererFactory<T> rendererFactory) {
    googleMapView.setRendererFactory(rendererFactory);
  }

  @BindingAdapter("algorithm")
  public static <T extends ClusterMapItem> void setAlgorithm(GoogleMapView googleMapView,
      Algorithm<T> algorithm) {
    googleMapView.setAlgorithm(algorithm);
  }

  @BindingAdapter("clusterClickListener")
  public static <T extends ClusterMapItem> void clusterClickListener(GoogleMapView googleMapView,
      ClusterManager.OnClusterClickListener<T> onClusterClickListener) {
    googleMapView.setOnClusterClickListener(onClusterClickListener);
  }

  @BindingAdapter("clusterItemClickListener")
  public static <T extends ClusterMapItem> void clusterItemClickListener(
      GoogleMapView googleMapView,
      ClusterManager.OnClusterItemClickListener<T> onClusterItemClickListener) {
    googleMapView.setOnClusterItemClickListener(onClusterItemClickListener);
  }

  @BindingAdapter("clusterInfoWindowClickListener")
  public static <T extends ClusterMapItem> void clusterInfoWindowClickListener(
      GoogleMapView googleMapView,
      ClusterManager.OnClusterInfoWindowClickListener<T> onClusterInfoWindowClickListener) {
    googleMapView.setOnClusterInfoWindowClickListener(onClusterInfoWindowClickListener);
  }

  @BindingAdapter("onClusterItemInfoWindowClickListener")
  public static <T extends ClusterMapItem> void onClusterItemInfoWindowClickListener(
      GoogleMapView googleMapView,
      ClusterManager.OnClusterItemInfoWindowClickListener<T> onClusterItemInfoWindowClickListener) {
    googleMapView.setOnClusterItemInfoWindowClickListener(onClusterItemInfoWindowClickListener);
  }
}