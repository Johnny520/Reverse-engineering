package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p305.C8640;
import p305.C8641;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3197 extends C8641 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RectF f10783;

    public C3197(C3197 c3197) {
        super(c3197);
        this.f10783 = c3197.f10783;
    }

    @Override // p305.C8641, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3196 c3196 = new C3196(this);
        c3196.f10782 = this;
        c3196.invalidateSelf();
        return c3196;
    }

    public C3197(C8640 c8640, RectF rectF) {
        super(c8640);
        this.f10783 = rectF;
    }
}
