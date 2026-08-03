package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(18)
class ViewGroupOverlayApi18 implements com.google.android.material.internal.ViewGroupOverlayImpl {
    private final android.view.ViewGroupOverlay viewGroupOverlay;

    public ViewGroupOverlayApi18(@Yue.InterfaceC4410 android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            android.view.ViewGroupOverlay r1 = r1.getOverlay()
            r0.viewGroupOverlay = r1
            return
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.remove(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            android.view.ViewGroupOverlay r0 = r1.viewGroupOverlay
            r0.remove(r2)
            return
    }
}
