package com.google.android.exoplayer2.p001ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p000.AbstractC0896Uu;
import p000.InterfaceC0735R4;
import p000.RunnableC0778S4;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f4347d = 0;

    /* JADX INFO: renamed from: a */
    public final RunnableC0778S4 f4348a;

    /* JADX INFO: renamed from: b */
    public float f4349b;

    /* JADX INFO: renamed from: c */
    public int f4350c;

    public AspectRatioFrameLayout(Context r3, AttributeSet r4) {
        super(r3, r4);
        this.f4350c = 0;
        if (r4 == null) goto L10;
        TypedArray r32 = r3.getTheme().obtainStyledAttributes(r4, AbstractC0896Uu.f2790a, 0, 0);
        this.f4350c = r32.getInt(0, 0);     // Catch: Throwable -> L7
        r32.recycle();
    L7:
        th = move-exception;
        r32.recycle();
        throw th;
    L10:
        this.f4348a = new RunnableC0778S4(this);
    }

    public int getResizeMode() {
        return this.f4350c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r9, int r10) {
        super.onMeasure(r9, r10);
        if (this.f4349b <= 0.0f) goto L37;
        int r92 = getMeasuredWidth();
        int r0 = getMeasuredHeight();
        float r1 = r92;
        float r2 = r0;
        float r4 = (this.f4349b / (r1 / r2)) - 1.0f;
        float r3 = Math.abs(r4);
        RunnableC0778S4 r6 = this.f4348a;
        if (r3 <= 0.01f) goto L8;
        int r32 = this.f4350c;
        if (r32 == 0) goto L28;
        if (r32 != 1) goto L15;
        float r102 = this.f4349b;
    L24:
        r0 = (int) (r1 / r102);
    L32:
        if (r6.f2458b == true) goto L34;
        r6.f2458b = true;
        ((AspectRatioFrameLayout) r6.f2459c).post(r6);
    L34:
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r92, 1073741824), View.MeasureSpec.makeMeasureSpec(r0, 1073741824));
        return;
    L15:
        if (r32 != 2) goto L17;
        float r93 = this.f4349b;
    L22:
        r92 = (int) (r2 * r93);
        goto L32
    L17:
        if (r32 != 4) goto L32;
        if (r4 <= 0.0f) goto L23;
        r93 = this.f4349b;
        goto L22
    L23:
        r102 = this.f4349b;
        goto L24
    L28:
        if (r4 <= 0.0f) goto L30;
        r102 = this.f4349b;
        goto L24
    L30:
        r93 = this.f4349b;
        goto L22
    L8:
        if (r6.f2458b == true) goto L36;
        r6.f2458b = true;
        ((AspectRatioFrameLayout) r6.f2459c).post(r6);
        return;
    L36:
        return;
    }

    public void setAspectRatio(float r2) {
        if (this.f4349b == r2) goto L6;
        this.f4349b = r2;
        requestLayout();
        return;
    }

    public void setAspectRatioListener(InterfaceC0735R4 r1) {
    }

    public void setResizeMode(int r2) {
        if (this.f4350c == r2) goto L6;
        this.f4350c = r2;
        requestLayout();
        return;
    }
}
