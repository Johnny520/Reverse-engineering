package top.mmjz.floatingclouds.plugin;

import p000a.C0173J8;

/* JADX INFO: loaded from: classes.dex */
public interface IPlugin {
    void handleHook(C0173J8 c0173j8);

    default void onConfigChange() {
    }

    default void onCreate() {
    }
}
