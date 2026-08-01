package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p305.C8651;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C3195 extends C8651 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f10776 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C3196 f10777;

    @Override // p305.C8651, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f10777 = new C3196(this.f10777);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m7287(float f, float f2, float f3, float f4) {
        RectF rectF = this.f10777.f10778;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // p305.C8651
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo7288(Canvas canvas) {
        if (this.f10777.f10778.isEmpty()) {
            super.mo7288(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f10777.f10778);
        super.mo7288(canvas);
        canvas.restore();
    }
}
