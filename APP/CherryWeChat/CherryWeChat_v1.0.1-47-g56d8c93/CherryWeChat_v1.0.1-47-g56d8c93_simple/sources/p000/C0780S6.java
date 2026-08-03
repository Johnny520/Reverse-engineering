package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: S6 */
/* JADX INFO: loaded from: classes.dex */
public class C0780S6 extends FrameLayout {

    /* JADX INFO: renamed from: f */
    public static final int[] f2460f = null;

    /* JADX INFO: renamed from: g */
    public static final C2220m6 f2461g = null;

    /* JADX INFO: renamed from: a */
    public boolean f2462a;

    /* JADX INFO: renamed from: b */
    public boolean f2463b;

    /* JADX INFO: renamed from: c */
    public final Rect f2464c;

    /* JADX INFO: renamed from: d */
    public final Rect f2465d;

    /* JADX INFO: renamed from: e */
    public final C0649P3 f2466e;

    static {
        f2460f = new int[]{R.attr.colorBackground};
        f2461g = new C2220m6(5);
    }

    public C0780S6(Context r11) {
        super(r11, null, io.github.cherrywechat.R.attr.cardViewStyle);
        Rect r2 = new Rect();
        this.f2464c = r2;
        this.f2465d = new Rect();
        C0649P3 r3 = new C0649P3(10, this);
        this.f2466e = r3;
        TypedArray r112 = r11.obtainStyledAttributes(null, AbstractC0596Nu.f1927a, io.github.cherrywechat.R.attr.cardViewStyle, io.github.cherrywechat.R.style.CardView);
        if (r112.hasValue(2) == false) goto L5;
        ColorStateList r0 = r112.getColorStateList(2);
    L10:
        float r4 = r112.getDimension(3, 0.0f);
        float r6 = r112.getDimension(4, 0.0f);
        float r1 = r112.getDimension(5, 0.0f);
        this.f2462a = r112.getBoolean(7, false);
        this.f2463b = r112.getBoolean(6, true);
        int r7 = r112.getDimensionPixelSize(8, 0);
        r2.left = r112.getDimensionPixelSize(10, r7);
        r2.top = r112.getDimensionPixelSize(12, r7);
        r2.right = r112.getDimensionPixelSize(11, r7);
        r2.bottom = r112.getDimensionPixelSize(9, r7);
        if (r6 <= r1) goto L13;
        r1 = r6;
    L13:
        r112.getDimensionPixelSize(0, 0);
        r112.getDimensionPixelSize(1, 0);
        r112.recycle();
        C0598Nw r113 = new C0598Nw(r0, r4);
        r3.f2089b = r113;
        setBackgroundDrawable(r113);
        setClipToOutline(true);
        setElevation(r6);
        f2461g.m4471n(r3, r1);
        return;
    L5:
        TypedArray r12 = getContext().obtainStyledAttributes(f2460f);
        int r62 = r12.getColor(0, 0);
        r12.recycle();
        float[] r13 = new float[3];
        Color.colorToHSV(r62, r13);
        if (r13[2] <= 0.5f) goto L8;
        int r02 = getResources().getColor(io.github.cherrywechat.R.color.cardview_light_background);
    L9:
        r0 = ColorStateList.valueOf(r02);
        goto L10
    L8:
        r02 = getResources().getColor(io.github.cherrywechat.R.color.cardview_dark_background);
        goto L9
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1602a(C0780S6 r0, int r1, int r2, int r3, int r4) {
        super.setPadding(r1, r2, r3, r4);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((C0598Nw) ((Drawable) this.f2466e.f2089b)).f1935h;
    }

    public float getCardElevation() {
        return ((C0780S6) this.f2466e.f2090c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f2464c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f2464c.left;
    }

    public int getContentPaddingRight() {
        return this.f2464c.right;
    }

    public int getContentPaddingTop() {
        return this.f2464c.top;
    }

    public float getMaxCardElevation() {
        return ((C0598Nw) ((Drawable) this.f2466e.f2089b)).f1932e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f2463b;
    }

    public float getRadius() {
        return ((C0598Nw) ((Drawable) this.f2466e.f2089b)).f1928a;
    }

    public boolean getUseCompatPadding() {
        return this.f2462a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
    }

    public void setCardBackgroundColor(int r5) {
        ColorStateList r52 = ColorStateList.valueOf(r5);
        C0598Nw r0 = (C0598Nw) ((Drawable) this.f2466e.f2089b);
        if (r52 != null) goto L5;
        r0.getClass();
        r52 = ColorStateList.valueOf(0);
    L5:
        r0.f1935h = r52;
        r0.f1929b.setColor(r52.getColorForState(r0.getState(), r0.f1935h.getDefaultColor()));
        r0.invalidateSelf();
    }

    public void setCardElevation(float r2) {
        ((C0780S6) this.f2466e.f2090c).setElevation(r2);
    }

    public void setMaxCardElevation(float r3) {
        f2461g.m4471n(this.f2466e, r3);
    }

    @Override // android.view.View
    public void setMinimumHeight(int r1) {
        super.setMinimumHeight(r1);
    }

    @Override // android.view.View
    public void setMinimumWidth(int r1) {
        super.setMinimumWidth(r1);
    }

    @Override // android.view.View
    public final void setPadding(int r1, int r2, int r3, int r4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int r1, int r2, int r3, int r4) {
    }

    public void setPreventCornerOverlap(boolean r3) {
        if (r3 == this.f2463b) goto L6;
        this.f2463b = r3;
        C0649P3 r32 = this.f2466e;
        float r0 = ((C0598Nw) ((Drawable) r32.f2089b)).f1932e;
        f2461g.m4471n(r32, r0);
        return;
    }

    public void setRadius(float r3) {
        C0598Nw r0 = (C0598Nw) ((Drawable) this.f2466e.f2089b);
        if (r3 != r0.f1928a) goto L5;
        return;
    L5:
        r0.f1928a = r3;
        r0.m1171b(null);
        r0.invalidateSelf();
    }

    public void setUseCompatPadding(boolean r3) {
        if (this.f2462a == r3) goto L6;
        this.f2462a = r3;
        C0649P3 r32 = this.f2466e;
        float r0 = ((C0598Nw) ((Drawable) r32.f2089b)).f1932e;
        f2461g.m4471n(r32, r0);
        return;
    }

    public void setCardBackgroundColor(ColorStateList r5) {
        C0598Nw r0 = (C0598Nw) ((Drawable) this.f2466e.f2089b);
        if (r5 != null) goto L5;
        r0.getClass();
        r5 = ColorStateList.valueOf(0);
    L5:
        r0.f1935h = r5;
        r0.f1929b.setColor(r5.getColorForState(r0.getState(), r0.f1935h.getDefaultColor()));
        r0.invalidateSelf();
    }
}
