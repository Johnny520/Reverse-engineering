package com.google.android.material.textfield;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p305.C8648;
import p305.C8649;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3196 extends C8649 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final RectF f10778;

    public C3196(C3196 c3196) {
        super(c3196);
        this.f10778 = c3196.f10778;
    }

    @Override // p305.C8649, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C3195 c3195 = new C3195(this);
        c3195.f10777 = this;
        c3195.invalidateSelf();
        return c3195;
    }

    public C3196(C8648 c8648, RectF rectF) {
        super(c8648);
        this.f10778 = rectF;
    }
}
