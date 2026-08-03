package com.youth.banner.util;

import p000.EnumC0632On;
import p000.InterfaceC1018Xn;
import p000.InterfaceC1061Yn;
import p000.InterfaceC2429qt;

/* JADX INFO: loaded from: classes.dex */
public class BannerLifecycleObserverAdapter implements InterfaceC1018Xn {
    private final InterfaceC1061Yn mLifecycleOwner;
    private final BannerLifecycleObserver mObserver;

    public BannerLifecycleObserverAdapter(InterfaceC1061Yn r1, BannerLifecycleObserver r2) {
        this.mLifecycleOwner = r1;
        this.mObserver = r2;
    }

    @InterfaceC2429qt(EnumC0632On.ON_DESTROY)
    public void onDestroy() {
        LogUtils.m2523i("onDestroy");
        this.mObserver.onDestroy(this.mLifecycleOwner);
    }

    @InterfaceC2429qt(EnumC0632On.ON_START)
    public void onStart() {
        LogUtils.m2523i("onStart");
        this.mObserver.onStart(this.mLifecycleOwner);
    }

    @InterfaceC2429qt(EnumC0632On.ON_STOP)
    public void onStop() {
        LogUtils.m2523i("onStop");
        this.mObserver.onStop(this.mLifecycleOwner);
    }
}
