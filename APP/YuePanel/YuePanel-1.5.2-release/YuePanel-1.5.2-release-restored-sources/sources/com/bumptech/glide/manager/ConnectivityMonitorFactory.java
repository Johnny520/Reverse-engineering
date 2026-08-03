package com.bumptech.glide.manager;

import Yue.InterfaceC6391;
import android.content.Context;
import com.bumptech.glide.manager.ConnectivityMonitor;

/* JADX INFO: loaded from: classes.dex */
public interface ConnectivityMonitorFactory {
    @InterfaceC6391
    ConnectivityMonitor build(@InterfaceC6391 Context context, @InterfaceC6391 ConnectivityMonitor.ConnectivityListener connectivityListener);
}
