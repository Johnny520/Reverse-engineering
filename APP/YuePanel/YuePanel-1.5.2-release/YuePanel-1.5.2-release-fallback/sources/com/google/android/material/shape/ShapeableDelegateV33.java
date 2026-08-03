package com.google.android.material.shape;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5336(33)
class ShapeableDelegateV33 extends com.google.android.material.shape.ShapeableDelegate {


    public ShapeableDelegateV33(@Yue.InterfaceC4410 android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.initMaskOutlineProvider(r1)
            return
    }

    @Yue.InterfaceC1947
    private void initMaskOutlineProvider(android.view.View r2) {
            r1 = this;
            com.google.android.material.shape.ShapeableDelegateV33$1 r0 = new com.google.android.material.shape.ShapeableDelegateV33$1
            r0.<init>(r1)
            r2.setOutlineProvider(r0)
            return
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public void invalidateClippingMethod(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            boolean r0 = r1.shouldUseCompatClipping()
            r0 = r0 ^ 1
            r2.setClipToOutline(r0)
            boolean r0 = r1.shouldUseCompatClipping()
            if (r0 == 0) goto L13
            r2.invalidate()
            goto L16
        L13:
            r2.invalidateOutline()
        L16:
            return
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public boolean shouldUseCompatClipping() {
            r1 = this;
            boolean r0 = r1.forceCompatClippingEnabled
            return r0
    }
}
