package com.google.android.material.internal;

import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(18)
class ViewGroupOverlayApi18 implements ViewGroupOverlayImpl {
    private final ViewGroupOverlay viewGroupOverlay;

    public ViewGroupOverlayApi18(@InterfaceC6391 ViewGroup viewGroup) {
        this.viewGroupOverlay = viewGroup.getOverlay();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(@InterfaceC6391 Drawable drawable) {
        this.viewGroupOverlay.add(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(@InterfaceC6391 Drawable drawable) {
        this.viewGroupOverlay.remove(drawable);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(@InterfaceC6391 View view) {
        this.viewGroupOverlay.add(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(@InterfaceC6391 View view) {
        this.viewGroupOverlay.remove(view);
    }
}
