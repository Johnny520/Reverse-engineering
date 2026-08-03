package com.bumptech.glide.manager;

import Yue.C4187;
import Yue.InterfaceC6391;
import android.content.Context;
import android.util.Log;
import com.bumptech.glide.manager.ConnectivityMonitor;

/* JADX INFO: loaded from: classes.dex */
public class DefaultConnectivityMonitorFactory implements ConnectivityMonitorFactory {
    private static final String NETWORK_PERMISSION = "android.permission.ACCESS_NETWORK_STATE";
    private static final String TAG = "ConnectivityMonitor";

    @Override // com.bumptech.glide.manager.ConnectivityMonitorFactory
    @InterfaceC6391
    public ConnectivityMonitor build(@InterfaceC6391 Context context, @InterfaceC6391 ConnectivityMonitor.ConnectivityListener connectivityListener) {
        boolean z = C4187.m1143(context, NETWORK_PERMISSION) == 0;
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new DefaultConnectivityMonitor(context, connectivityListener) : new NullConnectivityMonitor();
    }
}
