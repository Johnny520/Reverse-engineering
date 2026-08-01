package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p321.C9472;

/* JADX INFO: renamed from: com.google.android.material.textfield.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C4028 extends C9472 {

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f11126 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public C4029 f11127;

    @Override // p321.C9472, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.f11127 = new C4029(this.f11127);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void m7833(float f, float f2, float f3, float f4) {
        RectF rectF = this.f11127.f11128;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // p321.C9472
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo7834(Canvas canvas) {
        if (this.f11127.f11128.isEmpty()) {
            super.mo7834(canvas);
            return;
        }
        canvas.save();
        canvas.clipOutRect(this.f11127.f11128);
        super.mo7834(canvas);
        canvas.restore();
    }
}
