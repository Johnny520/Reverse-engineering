package com.google.android.material.internal;

import Yue.InterfaceC6391;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
class ViewGroupOverlayApi14 extends ViewOverlayApi14 implements ViewGroupOverlayImpl {
    public ViewGroupOverlayApi14(Context context, ViewGroup viewGroup, View view) {
        super(context, viewGroup, view);
    }

    public static ViewGroupOverlayApi14 createFrom(ViewGroup viewGroup) {
        return (ViewGroupOverlayApi14) ViewOverlayApi14.createFrom(viewGroup);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(@InterfaceC6391 View view) {
        this.overlayViewGroup.add(view);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(@InterfaceC6391 View view) {
        this.overlayViewGroup.remove(view);
    }
}
