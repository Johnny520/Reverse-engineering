package com.youth.banner.indicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import com.youth.banner.C1288R;

/* JADX INFO: loaded from: classes.dex */
public class DrawableIndicator extends BaseIndicator {
    private Bitmap normalBitmap;
    private Bitmap selectedBitmap;

    public DrawableIndicator(Context r1, int r2, int r3) {
        super(r1);
        this.normalBitmap = BitmapFactory.decodeResource(getResources(), r2);
        this.selectedBitmap = BitmapFactory.decodeResource(getResources(), r3);
    }

    @Override // android.view.View
    public void onDraw(Canvas r7) {
        super.onDraw(r7);
        int r0 = this.config.getIndicatorSize();
        if (r0 > 1) goto L5;
        return;
    L5:
        if (this.normalBitmap != null) goto L7;
        return;
    L7:
        if (this.selectedBitmap == null) goto L21;
        int r2 = 0;
        float r3 = 0.0f;
    L10:
        if (r2 >= r0) goto L22;
        if (this.config.getCurrentPosition() != r2) goto L14;
        Bitmap r4 = this.selectedBitmap;
    L15:
        r7.drawBitmap(r4, r3, 0.0f, this.mPaint);
        int r42 = this.normalBitmap.getWidth();
        r3 = r3 + (this.config.getIndicatorSpace() + r42);
        r2 = r2 + 1;
        goto L10
    L14:
        r4 = this.normalBitmap;
        goto L15
    L22:
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int r22 = this.config.getIndicatorSize();
        if (r22 > 1) goto L5;
        return;
    L5:
        int r23 = r22 - 1;
        int r0 = this.selectedBitmap.getWidth() * r23;
        int r32 = this.selectedBitmap.getWidth() + r0;
        setMeasuredDimension((this.config.getIndicatorSpace() * r23) + r32, Math.max(this.normalBitmap.getHeight(), this.selectedBitmap.getHeight()));
    }

    public DrawableIndicator(Context r2) {
        this(r2, null);
    }

    public DrawableIndicator(Context r2, AttributeSet r3) {
        this(r2, r3, 0);
    }

    public DrawableIndicator(Context r1, AttributeSet r2, int r3) {
        super(r1, r2, r3);
        TypedArray r12 = r1.obtainStyledAttributes(r2, C1288R.styleable.DrawableIndicator);
        if (r12 == null) goto L6;
        BitmapDrawable r22 = (BitmapDrawable) r12.getDrawable(C1288R.styleable.DrawableIndicator_normal_drawable);
        BitmapDrawable r13 = (BitmapDrawable) r12.getDrawable(C1288R.styleable.DrawableIndicator_selected_drawable);
        this.normalBitmap = r22.getBitmap();
        this.selectedBitmap = r13.getBitmap();
        return;
    }
}
