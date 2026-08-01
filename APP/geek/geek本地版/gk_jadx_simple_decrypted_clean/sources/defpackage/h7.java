package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ljx.wechatmod.R;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class h7 extends FrameLayout {
    public static final g7 i = null;
    public final f30 a;
    public int b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    static {
        i = new g7();
    }

    public h7(Context r5, AttributeSet r6) {
        super(ff.W(r5, r6, 0, 0), r6);
        Context r52 = getContext();
        TypedArray r1 = r52.obtainStyledAttributes(r6, wy.x);
        if (r1.hasValue(6) == false) goto L5;
        float r2 = r1.getDimensionPixelSize(6, 0);
        WeakHashMap r3 = ja0.a;
        y90.s(this, r2);
    L5:
        this.b = r1.getInt(2, 0);
        if (r1.hasValue(8) == false) goto L8;
    L9:
        this.a = f30.b(r52, r6, 0, 0).a();
    L10:
        this.c = r1.getFloat(3, 1.0f);
        setBackgroundTintList(ct.n(r52, r1, 4));
        setBackgroundTintMode(gt.v(r1.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.d = r1.getFloat(1, 1.0f);
        this.e = r1.getDimensionPixelSize(0, -1);
        this.f = r1.getDimensionPixelSize(7, -1);
        r1.recycle();
        setOnTouchListener(i);
        setFocusable(true);
        if (getBackground() != null) goto L21;
        int r53 = zt.E(getBackgroundOverlayColorAlpha(), zt.k(this, R.attr.colorSurface), zt.k(this, R.attr.colorOnSurface));
        f30 r62 = this.a;
        if (r62 == null) goto L15;
        int r0 = i7.a;
        eu r02 = new eu(r62);
        r02.j(ColorStateList.valueOf(r53));
        Drawable r03 = r02;
    L16:
        ColorStateList r54 = this.g;
        if (r54 == null) goto L19;
        ch.h(r03, r54);
    L19:
        WeakHashMap r55 = ja0.a;
        s90.q(this, r03);
        return;
    L15:
        Resources r63 = getResources();
        int r12 = i7.a;
        float r64 = r63.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
        GradientDrawable r13 = new GradientDrawable();
        r13.setShape(0);
        r13.setCornerRadius(r64);
        r13.setColor(r53);
        r03 = r13;
        goto L16
    L21:
        return;
    L8:
        if (r1.hasValue(9) == false) goto L10;
        goto L9
    }

    public float getActionTextColorAlpha() {
        return this.d;
    }

    public int getAnimationMode() {
        return this.b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.c;
    }

    public int getMaxInlineActionWidth() {
        return this.f;
    }

    public int getMaxWidth() {
        return this.e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap r0 = ja0.a;
        w90.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        super.onLayout(r1, r2, r3, r4, r5);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int r22 = this.e;
        if (r22 > 0) goto L5;
        return;
    L5:
        if (getMeasuredWidth() <= r22) goto L9;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r22, 1073741824), r3);
        return;
    }

    public void setAnimationMode(int r1) {
        this.b = r1;
    }

    @Override // android.view.View
    public void setBackground(Drawable r1) {
        setBackgroundDrawable(r1);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable r2) {
        if (r2 != null) goto L4;
    L6:
        super.setBackgroundDrawable(r2);
        return;
    L4:
        if (this.g == null) goto L6;
        r2 = r2.mutate();
        ch.h(r2, this.g);
        ch.i(r2, this.h);
        goto L6
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList r2) {
        this.g = r2;
        if (getBackground() == null) goto L8;
        Drawable r0 = getBackground().mutate();
        ch.h(r0, r2);
        ch.i(r0, this.h);
        if (r0 == getBackground()) goto L9;
        super.setBackgroundDrawable(r0);
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode r2) {
        this.h = r2;
        if (getBackground() == null) goto L8;
        Drawable r0 = getBackground().mutate();
        ch.i(r0, r2);
        if (r0 == getBackground()) goto L9;
        super.setBackgroundDrawable(r0);
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams r5) {
        super.setLayoutParams(r5);
        if ((r5 instanceof ViewGroup.MarginLayoutParams) == false) goto L6;
        ViewGroup.MarginLayoutParams r52 = (ViewGroup.MarginLayoutParams) r5;
        new Rect(r52.leftMargin, r52.topMargin, r52.rightMargin, r52.bottomMargin);
        return;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener r2) {
        if (r2 == null) goto L4;
        g7 r0 = null;
    L5:
        setOnTouchListener(r0);
        super.setOnClickListener(r2);
        return;
    L4:
        r0 = i;
        goto L5
    }

    private void setBaseTransientBottomBar(i7 r1) {
    }
}
