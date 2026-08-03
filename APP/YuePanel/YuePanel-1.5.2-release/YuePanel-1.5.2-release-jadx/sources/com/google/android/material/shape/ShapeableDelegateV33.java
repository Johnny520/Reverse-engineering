package com.google.android.material.shape;

import Yue.InterfaceC4482;
import Yue.InterfaceC6391;
import Yue.InterfaceC7113;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(33)
class ShapeableDelegateV33 extends ShapeableDelegate {
    public ShapeableDelegateV33(@InterfaceC6391 View view) {
        initMaskOutlineProvider(view);
    }

    @InterfaceC4482
    private void initMaskOutlineProvider(View view) {
        view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.google.android.material.shape.ShapeableDelegateV33.1
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view2, Outline outline) {
                if (ShapeableDelegateV33.this.shapePath.isEmpty()) {
                    return;
                }
                outline.setPath(ShapeableDelegateV33.this.shapePath);
            }
        });
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public void invalidateClippingMethod(@InterfaceC6391 View view) {
        view.setClipToOutline(!shouldUseCompatClipping());
        if (shouldUseCompatClipping()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public boolean shouldUseCompatClipping() {
        return this.forceCompatClippingEnabled;
    }
}
