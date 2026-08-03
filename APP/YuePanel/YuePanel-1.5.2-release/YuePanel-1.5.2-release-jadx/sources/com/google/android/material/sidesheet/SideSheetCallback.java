package com.google.android.material.sidesheet;

import Yue.InterfaceC6391;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class SideSheetCallback implements SheetCallback {
    public void onLayout(@InterfaceC6391 View view) {
    }

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onSlide(@InterfaceC6391 View view, float f);

    @Override // com.google.android.material.sidesheet.SheetCallback
    public abstract void onStateChanged(@InterfaceC6391 View view, int i);
}
