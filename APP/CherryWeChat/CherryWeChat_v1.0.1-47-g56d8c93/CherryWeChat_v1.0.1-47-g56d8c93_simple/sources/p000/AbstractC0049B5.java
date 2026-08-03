package p000;

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
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: B5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0049B5 extends FrameLayout {

    /* JADX INFO: renamed from: i */
    public static final ViewOnTouchListenerC0006A5 f99i = null;

    /* JADX INFO: renamed from: a */
    public final C0728Qx f100a;

    /* JADX INFO: renamed from: b */
    public int f101b;

    /* JADX INFO: renamed from: c */
    public final float f102c;

    /* JADX INFO: renamed from: d */
    public final float f103d;

    /* JADX INFO: renamed from: e */
    public final int f104e;

    /* JADX INFO: renamed from: f */
    public final int f105f;

    /* JADX INFO: renamed from: g */
    public ColorStateList f106g;

    /* JADX INFO: renamed from: h */
    public PorterDuff.Mode f107h;

    static {
        f99i = new ViewOnTouchListenerC0006A5();
    }

    public AbstractC0049B5(Context r5, AttributeSet r6) {
        super(AbstractC0148Dc.m291y(r5, r6, 0, 0), r6);
        Context r52 = getContext();
        TypedArray r1 = r52.obtainStyledAttributes(r6, AbstractC0939Vu.f2927A);
        if (r1.hasValue(6) == false) goto L5;
        setElevation(r1.getDimensionPixelSize(6, 0));
    L5:
        this.f101b = r1.getInt(2, 0);
        if (r1.hasValue(8) == false) goto L8;
    L9:
        this.f100a = C0728Qx.m1512b(r52, r6, 0, 0).m1383a();
    L10:
        this.f102c = r1.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0828TB.m1643j(r52, r1, 4));
        setBackgroundTintMode(AbstractC0148Dc.m282p(r1.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f103d = r1.getFloat(1, 1.0f);
        this.f104e = r1.getDimensionPixelSize(0, -1);
        this.f105f = r1.getDimensionPixelSize(7, -1);
        r1.recycle();
        setOnTouchListener(f99i);
        setFocusable(true);
        if (getBackground() != null) goto L21;
        int r53 = AbstractC0295Gu.m629v(AbstractC0295Gu.m621n(this, R.attr.colorSurface), AbstractC0295Gu.m621n(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha());
        C0728Qx r62 = this.f100a;
        if (r62 == null) goto L15;
        int r0 = AbstractC0092C5.f207a;
        C1021Xq r02 = new C1021Xq(r62);
        r02.m1928n(ColorStateList.valueOf(r53));
        Drawable r03 = r02;
    L16:
        ColorStateList r54 = this.f106g;
        if (r54 == null) goto L19;
        r03.setTintList(r54);
    L19:
        setBackground(r03);
        return;
    L15:
        Resources r63 = getResources();
        int r12 = AbstractC0092C5.f207a;
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

    private void setBaseTransientBottomBar(AbstractC0092C5 r1) {
    }

    public float getActionTextColorAlpha() {
        return this.f103d;
    }

    public int getAnimationMode() {
        return this.f101b;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f102c;
    }

    public int getMaxInlineActionWidth() {
        return this.f105f;
    }

    public int getMaxWidth() {
        return this.f104e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestApplyInsets();
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
        int r22 = this.f104e;
        if (r22 > 0) goto L5;
        return;
    L5:
        if (getMeasuredWidth() <= r22) goto L9;
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(r22, 1073741824), r3);
        return;
    }

    public void setAnimationMode(int r1) {
        this.f101b = r1;
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
        if (this.f106g == null) goto L6;
        r2 = r2.mutate();
        r2.setTintList(this.f106g);
        r2.setTintMode(this.f107h);
        goto L6
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList r2) {
        this.f106g = r2;
        if (getBackground() == null) goto L8;
        Drawable r0 = getBackground().mutate();
        r0.setTintList(r2);
        r0.setTintMode(this.f107h);
        if (r0 == getBackground()) goto L9;
        super.setBackgroundDrawable(r0);
        return;
    L9:
        return;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode r2) {
        this.f107h = r2;
        if (getBackground() == null) goto L8;
        Drawable r0 = getBackground().mutate();
        r0.setTintMode(r2);
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
        ViewOnTouchListenerC0006A5 r0 = null;
    L5:
        setOnTouchListener(r0);
        super.setOnClickListener(r2);
        return;
    L4:
        r0 = f99i;
        goto L5
    }
}
