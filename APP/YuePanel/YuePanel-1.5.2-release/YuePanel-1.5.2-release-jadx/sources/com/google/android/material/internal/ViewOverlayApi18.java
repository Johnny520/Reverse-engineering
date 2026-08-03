package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(18)
class ViewOverlayApi18 implements ViewOverlayImpl {
    private final ViewOverlay viewOverlay;

    public ViewOverlayApi18(@InterfaceC6391 View view) {
        this.viewOverlay = view.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@InterfaceC6391 Drawable drawable) {
        this.viewOverlay.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@InterfaceC6391 Drawable drawable) {
        this.viewOverlay.remove(drawable);
    }
}
