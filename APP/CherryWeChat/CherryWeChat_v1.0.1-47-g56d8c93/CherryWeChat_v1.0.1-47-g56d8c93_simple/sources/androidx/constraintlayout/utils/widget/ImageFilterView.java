package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.ColorMatrix;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import p000.AbstractC0639Ou;
import p000.AbstractC1406fG;
import p000.C0520M3;
import p000.C1146al;
import p000.C1226bl;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends C0520M3 {

    /* JADX INFO: renamed from: d */
    public final C1226bl f3854d;

    /* JADX INFO: renamed from: e */
    public boolean f3855e;

    /* JADX INFO: renamed from: f */
    public Drawable f3856f;

    /* JADX INFO: renamed from: g */
    public Drawable f3857g;

    /* JADX INFO: renamed from: h */
    public float f3858h;

    /* JADX INFO: renamed from: i */
    public float f3859i;

    /* JADX INFO: renamed from: j */
    public float f3860j;

    /* JADX INFO: renamed from: k */
    public Path f3861k;

    /* JADX INFO: renamed from: l */
    public ViewOutlineProvider f3862l;

    /* JADX INFO: renamed from: m */
    public RectF f3863m;

    /* JADX INFO: renamed from: n */
    public final Drawable[] f3864n;

    /* JADX INFO: renamed from: o */
    public LayerDrawable f3865o;

    /* JADX INFO: renamed from: p */
    public float f3866p;

    /* JADX INFO: renamed from: q */
    public float f3867q;

    /* JADX INFO: renamed from: r */
    public float f3868r;

    /* JADX INFO: renamed from: s */
    public float f3869s;

    public ImageFilterView(Context r10, AttributeSet r11) {
        super(r10, r11, 0);
        C1226bl r1 = new C1226bl();
        r1.f4183a = new float[20];
        r1.f4184b = new ColorMatrix();
        r1.f4185c = new ColorMatrix();
        r1.f4186d = 1.0f;
        r1.f4187e = 1.0f;
        r1.f4188f = 1.0f;
        r1.f4189g = 1.0f;
        this.f3854d = r1;
        this.f3855e = true;
        this.f3856f = null;
        this.f3857g = null;
        this.f3858h = 0.0f;
        this.f3859i = 0.0f;
        this.f3860j = Float.NaN;
        Drawable[] r6 = new Drawable[2];
        this.f3864n = r6;
        this.f3866p = Float.NaN;
        this.f3867q = Float.NaN;
        this.f3868r = Float.NaN;
        this.f3869s = Float.NaN;
        if (r11 == null) goto L68;
        TypedArray r102 = r10.obtainStyledAttributes(r11, AbstractC0639Ou.f2038e);
        int r112 = r102.getIndexCount();
        this.f3856f = r102.getDrawable(0);
        int r4 = 0;
    L5:
        if (r4 >= r112) goto L42;
        int r7 = r102.getIndex(r4);
        if (r7 != 4) goto L10;
        this.f3858h = r102.getFloat(r7, 0.0f);
    L41:
        r4 = r4 + 1;
        goto L5
    L10:
        if (r7 != 13) goto L13;
        setWarmth(r102.getFloat(r7, 0.0f));
        goto L41
    L13:
        if (r7 != 12) goto L16;
        setSaturation(r102.getFloat(r7, 0.0f));
        goto L41
    L16:
        if (r7 != 3) goto L18;
        setContrast(r102.getFloat(r7, 0.0f));
        goto L41
    L18:
        if (r7 != 2) goto L21;
        setBrightness(r102.getFloat(r7, 0.0f));
        goto L41
    L21:
        if (r7 != 10) goto L24;
        setRound(r102.getDimension(r7, 0.0f));
        goto L41
    L24:
        if (r7 != 11) goto L27;
        setRoundPercent(r102.getFloat(r7, 0.0f));
        goto L41
    L27:
        if (r7 != 9) goto L30;
        setOverlay(r102.getBoolean(r7, this.f3855e));
        goto L41
    L30:
        if (r7 != 5) goto L33;
        setImagePanX(r102.getFloat(r7, this.f3866p));
        goto L41
    L33:
        if (r7 != 6) goto L36;
        setImagePanY(r102.getFloat(r7, this.f3867q));
        goto L41
    L36:
        if (r7 != 7) goto L39;
        setImageRotate(r102.getFloat(r7, this.f3869s));
        goto L41
    L39:
        if (r7 != 8) goto L41;
        setImageZoom(r102.getFloat(r7, this.f3868r));
        goto L41
    L42:
        r102.recycle();
        Drawable r103 = getDrawable();
        this.f3857g = r103;
        if (this.f3856f == null) goto L50;
        if (r103 == null) goto L50;
        Drawable r104 = getDrawable().mutate();
        this.f3857g = r104;
        r6[0] = r104;
        r6[1] = this.f3856f.mutate();
        LayerDrawable r105 = new LayerDrawable(r6);
        this.f3865o = r105;
        r105.getDrawable(1).setAlpha((int) (this.f3858h * 255.0f));
        if (this.f3855e == true) goto L48;
        this.f3865o.getDrawable(0).setAlpha((int) ((1.0f - this.f3858h) * 255.0f));
    L48:
        super.setImageDrawable(this.f3865o);
        return;
    L50:
        Drawable r106 = getDrawable();
        this.f3857g = r106;
        if (r106 == null) goto L69;
        Drawable r107 = r106.mutate();
        this.f3857g = r107;
        r6[0] = r107;
        return;
    L69:
        return;
    }

    private void setOverlay(boolean r1) {
        this.f3855e = r1;
    }

    /* JADX INFO: renamed from: c */
    public final void m2121c() {
        if (Float.isNaN(this.f3866p) == true) goto L5;
    L11:
        float r1 = 0.0f;
        if (Float.isNaN(this.f3866p) == false) goto L14;
        float r0 = 0.0f;
    L16:
        if (Float.isNaN(this.f3867q) == false) goto L18;
        float r2 = 0.0f;
    L20:
        if (Float.isNaN(this.f3868r) == false) goto L22;
        float r3 = 1.0f;
    L24:
        if (Float.isNaN(this.f3869s) == true) goto L27;
        r1 = this.f3869s;
    L27:
        Matrix r4 = new Matrix();
        r4.reset();
        float r5 = getDrawable().getIntrinsicWidth();
        float r6 = getDrawable().getIntrinsicHeight();
        float r7 = getWidth();
        float r8 = getHeight();
        if ((r5 * r8) >= (r6 * r7)) goto L30;
        float r9 = r7 / r5;
    L31:
        float r32 = r3 * r9;
        r4.postScale(r32, r32);
        float r52 = r5 * r32;
        float r33 = r32 * r6;
        r4.postTranslate(((((r7 - r52) * r0) + r7) - r52) * 0.5f, ((((r8 - r33) * r2) + r8) - r33) * 0.5f);
        r4.postRotate(r1, r7 / 2.0f, r8 / 2.0f);
        setImageMatrix(r4);
        setScaleType(ImageView.ScaleType.MATRIX);
        return;
    L30:
        r9 = r8 / r6;
        goto L31
    L22:
        r3 = this.f3868r;
        goto L24
    L18:
        r2 = this.f3867q;
        goto L20
    L14:
        r0 = this.f3866p;
        goto L16
    L5:
        if (Float.isNaN(this.f3867q) == false) goto L11;
        if (Float.isNaN(this.f3868r) == false) goto L11;
        if (Float.isNaN(this.f3869s) == false) goto L11;
    }

    /* JADX INFO: renamed from: d */
    public final void m2122d() {
        if (Float.isNaN(this.f3866p) == true) goto L5;
    L12:
        m2121c();
        return;
    L5:
        if (Float.isNaN(this.f3867q) == false) goto L12;
        if (Float.isNaN(this.f3868r) == false) goto L12;
        if (Float.isNaN(this.f3869s) == false) goto L12;
        setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    public float getBrightness() {
        return this.f3854d.f4186d;
    }

    public float getContrast() {
        return this.f3854d.f4188f;
    }

    public float getCrossfade() {
        return this.f3858h;
    }

    public float getImagePanX() {
        return this.f3866p;
    }

    public float getImagePanY() {
        return this.f3867q;
    }

    public float getImageRotate() {
        return this.f3869s;
    }

    public float getImageZoom() {
        return this.f3868r;
    }

    public float getRound() {
        return this.f3860j;
    }

    public float getRoundPercent() {
        return this.f3859i;
    }

    public float getSaturation() {
        return this.f3854d.f4187e;
    }

    public float getWarmth() {
        return this.f3854d.f4189g;
    }

    @Override // android.view.View
    public final void layout(int r1, int r2, int r3, int r4) {
        super.layout(r1, r2, r3, r4);
        m2121c();
    }

    public void setAltImageDrawable(Drawable r4) {
        Drawable r42 = r4.mutate();
        this.f3856f = r42;
        Drawable r1 = this.f3857g;
        Drawable[] r2 = this.f3864n;
        r2[0] = r1;
        r2[1] = r42;
        LayerDrawable r43 = new LayerDrawable(r2);
        this.f3865o = r43;
        super.setImageDrawable(r43);
        setCrossfade(this.f3858h);
    }

    public void setAltImageResource(int r2) {
        Drawable r22 = AbstractC1406fG.m2695U(getContext(), r2);
        this.f3856f = r22;
        setAltImageDrawable(r22);
    }

    public void setBrightness(float r2) {
        C1226bl r0 = this.f3854d;
        r0.f4186d = r2;
        r0.m2353a(this);
    }

    public void setContrast(float r2) {
        C1226bl r0 = this.f3854d;
        r0.f4188f = r2;
        r0.m2353a(this);
    }

    public void setCrossfade(float r4) {
        this.f3858h = r4;
        if (this.f3864n != null) goto L5;
        return;
    L5:
        if (this.f3855e == true) goto L7;
        this.f3865o.getDrawable(0).setAlpha((int) ((1.0f - this.f3858h) * 255.0f));
    L7:
        this.f3865o.getDrawable(1).setAlpha((int) (this.f3858h * 255.0f));
        super.setImageDrawable(this.f3865o);
    }

    @Override // p000.C0520M3, android.widget.ImageView
    public void setImageDrawable(Drawable r3) {
        if (this.f3856f == null) goto L7;
        if (r3 == null) goto L7;
        Drawable r32 = r3.mutate();
        this.f3857g = r32;
        Drawable[] r1 = this.f3864n;
        r1[0] = r32;
        r1[1] = this.f3856f;
        LayerDrawable r33 = new LayerDrawable(r1);
        this.f3865o = r33;
        super.setImageDrawable(r33);
        setCrossfade(this.f3858h);
        return;
    L7:
        super.setImageDrawable(r3);
    }

    public void setImagePanX(float r1) {
        this.f3866p = r1;
        m2122d();
    }

    public void setImagePanY(float r1) {
        this.f3867q = r1;
        m2122d();
    }

    @Override // p000.C0520M3, android.widget.ImageView
    public void setImageResource(int r3) {
        if (this.f3856f == null) goto L6;
        Drawable r32 = AbstractC1406fG.m2695U(getContext(), r3).mutate();
        this.f3857g = r32;
        Drawable[] r1 = this.f3864n;
        r1[0] = r32;
        r1[1] = this.f3856f;
        LayerDrawable r33 = new LayerDrawable(r1);
        this.f3865o = r33;
        super.setImageDrawable(r33);
        setCrossfade(this.f3858h);
        return;
    L6:
        super.setImageResource(r3);
    }

    public void setImageRotate(float r1) {
        this.f3869s = r1;
        m2122d();
    }

    public void setImageZoom(float r1) {
        this.f3868r = r1;
        m2122d();
    }

    public void setRound(float r5) {
        if (Float.isNaN(r5) == false) goto L7;
        this.f3860j = r5;
        float r52 = this.f3859i;
        this.f3859i = -1.0f;
        setRoundPercent(r52);
        return;
    L7:
        if (this.f3860j == r5) goto L9;
        boolean r0 = true;
    L10:
        this.f3860j = r5;
        if (r5 != 0.0f) goto L13;
        setClipToOutline(false);
    L23:
        if (r0 == false) goto L26;
        invalidateOutline();
        return;
    L26:
        return;
    L13:
        if (this.f3861k != null) goto L16;
        this.f3861k = new Path();
    L16:
        if (this.f3863m != null) goto L19;
        this.f3863m = new RectF();
    L19:
        if (this.f3862l != null) goto L21;
        C1146al r53 = new C1146al(this, 1);
        this.f3862l = r53;
        setOutlineProvider(r53);
    L21:
        setClipToOutline(true);
        this.f3863m.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f3861k.reset();
        Path r54 = this.f3861k;
        RectF r1 = this.f3863m;
        float r2 = this.f3860j;
        r54.addRoundRect(r1, r2, r2, Path.Direction.CW);
        goto L23
    L9:
        r0 = false;
        goto L10
    }

    public void setRoundPercent(float r6) {
        if (this.f3859i == r6) goto L5;
        boolean r0 = true;
    L6:
        this.f3859i = r6;
        if (r6 != 0.0f) goto L9;
        setClipToOutline(false);
    L19:
        if (r0 == false) goto L22;
        invalidateOutline();
        return;
    L22:
        return;
    L9:
        if (this.f3861k != null) goto L12;
        this.f3861k = new Path();
    L12:
        if (this.f3863m != null) goto L15;
        this.f3863m = new RectF();
    L15:
        if (this.f3862l != null) goto L17;
        C1146al r62 = new C1146al(this, 0);
        this.f3862l = r62;
        setOutlineProvider(r62);
    L17:
        setClipToOutline(true);
        int r63 = getWidth();
        int r1 = getHeight();
        float r2 = (Math.min(r63, r1) * this.f3859i) / 2.0f;
        this.f3863m.set(0.0f, 0.0f, r63, r1);
        this.f3861k.reset();
        this.f3861k.addRoundRect(this.f3863m, r2, r2, Path.Direction.CW);
        goto L19
    L5:
        r0 = false;
        goto L6
    }

    public void setSaturation(float r2) {
        C1226bl r0 = this.f3854d;
        r0.f4187e = r2;
        r0.m2353a(this);
    }

    public void setWarmth(float r2) {
        C1226bl r0 = this.f3854d;
        r0.f4189g = r2;
        r0.m2353a(this);
    }
}
