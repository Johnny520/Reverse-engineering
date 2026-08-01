package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p321.C9469;
import p321.C9470;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4029 extends C9470 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RectF f11128;

    public C4029(C4029 c4029) {
        super(c4029);
        this.f11128 = c4029.f11128;
    }

    @Override // p321.C9470, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C4028 c4028 = new C4028(this);
        c4028.f11127 = this;
        c4028.invalidateSelf();
        return c4028;
    }

    public C4029(C9469 c9469, RectF rectF) {
        super(c9469);
        this.f11128 = rectF;
    }
}
