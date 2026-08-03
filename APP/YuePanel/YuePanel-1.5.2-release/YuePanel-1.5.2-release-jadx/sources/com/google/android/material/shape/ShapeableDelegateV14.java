package com.google.android.material.shape;

import Yue.InterfaceC6391;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ShapeableDelegateV14 extends ShapeableDelegate {
    @Override // com.google.android.material.shape.ShapeableDelegate
    public void invalidateClippingMethod(@InterfaceC6391 View view) {
        if (this.shapeAppearanceModel == null || this.maskBounds.isEmpty() || !shouldUseCompatClipping()) {
            return;
        }
        view.invalidate();
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public boolean shouldUseCompatClipping() {
        return true;
    }
}
