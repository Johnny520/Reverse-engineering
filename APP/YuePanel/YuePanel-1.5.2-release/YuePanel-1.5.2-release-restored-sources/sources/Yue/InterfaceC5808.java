package Yue;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: renamed from: Yue.ۥ۠ۧۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5808 extends LocationListener {
    @Override // android.location.LocationListener
    default void onFlushComplete(int i) {
    }

    @Override // android.location.LocationListener
    default void onLocationChanged(@InterfaceC6391 List<Location> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            onLocationChanged(list.get(i));
        }
    }

    @Override // android.location.LocationListener
    default void onProviderDisabled(@InterfaceC6391 String str) {
    }

    @Override // android.location.LocationListener
    default void onProviderEnabled(@InterfaceC6391 String str) {
    }

    @Override // android.location.LocationListener
    default void onStatusChanged(@InterfaceC6391 String str, int i, @InterfaceC6490 Bundle bundle) {
    }
}
