package com.google.android.material.internal;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(18)
class ViewOverlayApi18 implements com.google.android.material.internal.ViewOverlayImpl {
    private final android.view.ViewOverlay viewOverlay;

    public ViewOverlayApi18(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            r0.<init>()
            android.view.ViewOverlay r1 = r1.getOverlay()
            r0.viewOverlay = r1
            return
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewOverlay r0 = r1.viewOverlay
            r0.add(r2)
            return
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@Yue.InterfaceC4410 android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.view.ViewOverlay r0 = r1.viewOverlay
            r0.remove(r2)
            return
    }
}
