package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.StateSet;
import java.util.BitSet;
import java.util.Objects;

/* JADX INFO: renamed from: Xq */
/* JADX INFO: loaded from: classes.dex */
public class C1021Xq extends Drawable implements InterfaceC1300cy {

    /* JADX INFO: renamed from: E */
    public static final Paint f3234E;

    /* JADX INFO: renamed from: F */
    public static final C0978Wq[] f3235F;

    /* JADX INFO: renamed from: A */
    public final C0643Oy[] f3236A;

    /* JADX INFO: renamed from: B */
    public float[] f3237B;

    /* JADX INFO: renamed from: C */
    public float[] f3238C;

    /* JADX INFO: renamed from: D */
    public C2464rl f3239D;

    /* JADX INFO: renamed from: a */
    public final C0892Uq f3240a;

    /* JADX INFO: renamed from: b */
    public C0935Vq f3241b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1114Zx[] f3242c;

    /* JADX INFO: renamed from: d */
    public final AbstractC1114Zx[] f3243d;

    /* JADX INFO: renamed from: e */
    public final BitSet f3244e;

    /* JADX INFO: renamed from: f */
    public boolean f3245f;

    /* JADX INFO: renamed from: g */
    public boolean f3246g;

    /* JADX INFO: renamed from: h */
    public final Matrix f3247h;

    /* JADX INFO: renamed from: i */
    public final Path f3248i;

    /* JADX INFO: renamed from: j */
    public final Path f3249j;

    /* JADX INFO: renamed from: k */
    public final RectF f3250k;

    /* JADX INFO: renamed from: l */
    public final RectF f3251l;

    /* JADX INFO: renamed from: m */
    public final Region f3252m;

    /* JADX INFO: renamed from: n */
    public final Region f3253n;

    /* JADX INFO: renamed from: o */
    public final Paint f3254o;

    /* JADX INFO: renamed from: p */
    public final Paint f3255p;

    /* JADX INFO: renamed from: q */
    public final C0642Ox f3256q;

    /* JADX INFO: renamed from: r */
    public final C0892Uq f3257r;

    /* JADX INFO: renamed from: s */
    public final C0813Sx f3258s;

    /* JADX INFO: renamed from: t */
    public PorterDuffColorFilter f3259t;

    /* JADX INFO: renamed from: u */
    public PorterDuffColorFilter f3260u;

    /* JADX INFO: renamed from: v */
    public final RectF f3261v;

    /* JADX INFO: renamed from: w */
    public final boolean f3262w;

    /* JADX INFO: renamed from: x */
    public boolean f3263x;

    /* JADX INFO: renamed from: y */
    public C0728Qx f3264y;

    /* JADX INFO: renamed from: z */
    public C0686Py f3265z;

    static {
        Paint paint = new Paint(1);
        f3234E = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f3235F = new C0978Wq[4];
        int i = 0;
        while (true) {
            C0978Wq[] c0978WqArr = f3235F;
            if (i >= c0978WqArr.length) {
                return;
            }
            c0978WqArr[i] = new C0978Wq(i);
            i++;
        }
    }

    public C1021Xq() {
        this(new C0728Qx());
    }

    /* JADX INFO: renamed from: b */
    public static float m1915b(RectF rectF, C0728Qx c0728Qx, float[] fArr) {
        if (fArr == null) {
            if (c0728Qx.m1515e(rectF)) {
                return c0728Qx.f2328e.mo1563a(rectF);
            }
            return -1.0f;
        }
        if (fArr.length > 1) {
            float f = fArr[0];
            for (int i = 1; i < fArr.length; i++) {
                if (fArr[i] != f) {
                    return -1.0f;
                }
            }
        }
        if (c0728Qx.m1514d()) {
            return fArr[0];
        }
        return -1.0f;
    }

    /* JADX INFO: renamed from: a */
    public final void m1916a(RectF rectF, Path path) {
        C0935Vq c0935Vq = this.f3241b;
        this.f3258s.m1615a(c0935Vq.f2902a, this.f3237B, c0935Vq.f2911j, rectF, this.f3257r, path);
        if (this.f3241b.f2910i != 1.0f) {
            Matrix matrix = this.f3247h;
            matrix.reset();
            float f = this.f3241b.f2910i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f3261v, true);
    }

    /* JADX INFO: renamed from: c */
    public final int m1917c(int i) {
        int i2;
        C0935Vq c0935Vq = this.f3241b;
        float f = c0935Vq.f2915n + 0.0f + c0935Vq.f2914m;
        C2101jf c2101jf = c0935Vq.f2904c;
        if (c2101jf == null || !c2101jf.f7390a || AbstractC2797za.m5367e(i, 255) != c2101jf.f7393d) {
            return i;
        }
        float fMin = (c2101jf.f7394e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM629v = AbstractC0295Gu.m629v(AbstractC2797za.m5367e(i, 255), c2101jf.f7391b, fMin);
        if (fMin > 0.0f && (i2 = c2101jf.f7392c) != 0) {
            iM629v = AbstractC2797za.m5365c(AbstractC2797za.m5367e(i2, C2101jf.f7389f), iM629v);
        }
        return AbstractC2797za.m5367e(iM629v, iAlpha);
    }

    /* JADX INFO: renamed from: d */
    public final void m1918d(Canvas canvas) {
        this.f3244e.cardinality();
        int i = this.f3241b.f2917p;
        Path path = this.f3248i;
        C0642Ox c0642Ox = this.f3256q;
        if (i != 0) {
            canvas.drawPath(path, c0642Ox.f2054a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC1114Zx abstractC1114Zx = this.f3242c[i2];
            int i3 = this.f3241b.f2916o;
            Matrix matrix = AbstractC1114Zx.f3514b;
            abstractC1114Zx.mo1690a(matrix, c0642Ox, i3, canvas);
            this.f3243d[i2].mo1690a(matrix, c0642Ox, this.f3241b.f2916o, canvas);
        }
        if (this.f3262w) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * ((double) this.f3241b.f2917p));
            int iCos = (int) (Math.cos(Math.toRadians(d)) * ((double) this.f3241b.f2917p));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f3234E);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0097 A[EDGE_INSN: B:64:0x0097->B:30:0x0097 BREAK  A[LOOP:1: B:21:0x007e->B:26:0x0088]] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Paint paint;
        PorterDuffColorFilter porterDuffColorFilter = this.f3259t;
        Paint paint2 = this.f3254o;
        paint2.setColorFilter(porterDuffColorFilter);
        int alpha = paint2.getAlpha();
        int i = this.f3241b.f2913l;
        paint2.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f3260u;
        Paint paint3 = this.f3255p;
        paint3.setColorFilter(porterDuffColorFilter2);
        paint3.setStrokeWidth(this.f3241b.f2912k);
        int alpha2 = paint3.getAlpha();
        int i2 = this.f3241b.f2913l;
        paint3.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        Paint.Style style = this.f3241b.f2918q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.f3245f;
            paint = paint2;
            Path path = this.f3248i;
            if (z) {
                m1916a(m1921g(), path);
                this.f3245f = false;
            }
            C0935Vq c0935Vq = this.f3241b;
            c0935Vq.getClass();
            if (c0935Vq.f2916o > 0 && !c0935Vq.f2902a.m1515e(m1921g())) {
                float[] fArr = this.f3237B;
                if (fArr != null) {
                    if (fArr.length > 1) {
                        float f = fArr[0];
                        for (int i3 = 1; i3 < fArr.length; i3++) {
                            if (fArr[i3] != f) {
                                break;
                            }
                        }
                        if (!this.f3241b.f2902a.m1514d()) {
                        }
                    } else if (!this.f3241b.f2902a.m1514d()) {
                        if (!path.isConvex() && Build.VERSION.SDK_INT < 29) {
                            canvas.save();
                            double d = 0;
                            canvas.translate((int) (Math.sin(Math.toRadians(d)) * ((double) this.f3241b.f2917p)), (int) (Math.cos(Math.toRadians(d)) * ((double) this.f3241b.f2917p)));
                            if (this.f3262w) {
                                RectF rectF = this.f3261v;
                                int iWidth = (int) (rectF.width() - getBounds().width());
                                int iHeight = (int) (rectF.height() - getBounds().height());
                                if (iWidth < 0 || iHeight < 0) {
                                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f3241b.f2916o * 2) + ((int) rectF.width()) + iWidth, (this.f3241b.f2916o * 2) + ((int) rectF.height()) + iHeight, Bitmap.Config.ARGB_8888);
                                Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                                float f2 = (getBounds().left - this.f3241b.f2916o) - iWidth;
                                float f3 = (getBounds().top - this.f3241b.f2916o) - iHeight;
                                canvas2.translate(-f2, -f3);
                                m1918d(canvas2);
                                canvas.drawBitmap(bitmapCreateBitmap, f2, f3, (Paint) null);
                                bitmapCreateBitmap.recycle();
                                canvas.restore();
                            } else {
                                m1918d(canvas);
                                canvas.restore();
                            }
                        }
                    }
                }
            }
            m1919e(canvas, paint, path, this.f3241b.f2902a, this.f3237B, m1921g());
        } else {
            paint = paint2;
        }
        if (m1924j()) {
            if (this.f3246g) {
                C0728Qx c0728Qx = this.f3241b.f2902a;
                C0685Px c0685PxM1516f = c0728Qx.m1516f();
                InterfaceC1006Xb interfaceC1006Xb = c0728Qx.f2328e;
                C0892Uq c0892Uq = this.f3240a;
                c0685PxM1516f.f2196e = c0892Uq.m1744a(interfaceC1006Xb);
                c0685PxM1516f.f2197f = c0892Uq.m1744a(c0728Qx.f2329f);
                c0685PxM1516f.f2199h = c0892Uq.m1744a(c0728Qx.f2331h);
                c0685PxM1516f.f2198g = c0892Uq.m1744a(c0728Qx.f2330g);
                this.f3264y = c0685PxM1516f.m1383a();
                float[] fArr2 = this.f3237B;
                if (fArr2 != null) {
                    if (this.f3238C == null) {
                        this.f3238C = new float[fArr2.length];
                    }
                    float fM1923i = m1923i();
                    int i4 = 0;
                    while (true) {
                        float[] fArr3 = this.f3237B;
                        if (i4 >= fArr3.length) {
                            break;
                        }
                        this.f3238C[i4] = Math.max(0.0f, fArr3[i4] - fM1923i);
                        i4++;
                    }
                } else {
                    this.f3238C = null;
                }
                C0728Qx c0728Qx2 = this.f3264y;
                float[] fArr4 = this.f3238C;
                float f4 = this.f3241b.f2911j;
                RectF rectFM1921g = m1921g();
                RectF rectF2 = this.f3251l;
                rectF2.set(rectFM1921g);
                float fM1923i2 = m1923i();
                rectF2.inset(fM1923i2, fM1923i2);
                this.f3258s.m1615a(c0728Qx2, fArr4, f4, rectF2, null, this.f3249j);
                this.f3246g = false;
            }
            mo1920f(canvas);
        }
        paint.setAlpha(alpha);
        paint3.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public final void m1919e(Canvas canvas, Paint paint, Path path, C0728Qx c0728Qx, float[] fArr, RectF rectF) {
        float fM1915b = m1915b(rectF, c0728Qx, fArr);
        if (fM1915b < 0.0f) {
            canvas.drawPath(path, paint);
        } else {
            float f = fM1915b * this.f3241b.f2911j;
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo1920f(Canvas canvas) {
        C0728Qx c0728Qx = this.f3264y;
        float[] fArr = this.f3238C;
        RectF rectFM1921g = m1921g();
        RectF rectF = this.f3251l;
        rectF.set(rectFM1921g);
        float fM1923i = m1923i();
        rectF.inset(fM1923i, fM1923i);
        m1919e(canvas, this.f3255p, this.f3249j, c0728Qx, fArr, rectF);
    }

    /* JADX INFO: renamed from: g */
    public final RectF m1921g() {
        Rect bounds = getBounds();
        RectF rectF = this.f3250k;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f3241b.f2913l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f3241b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f3241b.getClass();
        RectF rectFM1921g = m1921g();
        if (rectFM1921g.isEmpty()) {
            return;
        }
        float fM1915b = m1915b(rectFM1921g, this.f3241b.f2902a, this.f3237B);
        if (fM1915b >= 0.0f) {
            outline.setRoundRect(getBounds(), fM1915b * this.f3241b.f2911j);
            return;
        }
        boolean z = this.f3245f;
        Path path = this.f3248i;
        if (z) {
            m1916a(rectFM1921g, path);
            this.f3245f = false;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC0064Be.m100a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC0021Ae.m31a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0021Ae.m31a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f3241b.f2909h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f3252m;
        region.set(bounds);
        RectF rectFM1921g = m1921g();
        Path path = this.f3248i;
        m1916a(rectFM1921g, path);
        Region region2 = this.f3253n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final float m1922h() {
        float[] fArr = this.f3237B;
        if (fArr != null) {
            return (((fArr[3] + fArr[2]) - fArr[1]) - fArr[0]) / 2.0f;
        }
        RectF rectFM1921g = m1921g();
        C0728Qx c0728Qx = this.f3241b.f2902a;
        C0813Sx c0813Sx = this.f3258s;
        c0813Sx.getClass();
        float fMo1563a = c0728Qx.f2328e.mo1563a(rectFM1921g);
        C0728Qx c0728Qx2 = this.f3241b.f2902a;
        c0813Sx.getClass();
        float fMo1563a2 = c0728Qx2.f2331h.mo1563a(rectFM1921g) + fMo1563a;
        C0728Qx c0728Qx3 = this.f3241b.f2902a;
        c0813Sx.getClass();
        float fMo1563a3 = fMo1563a2 - c0728Qx3.f2330g.mo1563a(rectFM1921g);
        C0728Qx c0728Qx4 = this.f3241b.f2902a;
        c0813Sx.getClass();
        return (fMo1563a3 - c0728Qx4.f2329f.mo1563a(rectFM1921g)) / 2.0f;
    }

    /* JADX INFO: renamed from: i */
    public final float m1923i() {
        if (m1924j()) {
            return this.f3255p.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f3245f = true;
        this.f3246g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f3241b.f2907f;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f3241b.getClass();
        ColorStateList colorStateList2 = this.f3241b.f2906e;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f3241b.f2905d;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        C1301cz c1301cz = this.f3241b.f2903b;
        return c1301cz != null && c1301cz.m2567d();
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1924j() {
        Paint.Style style = this.f3241b.f2918q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f3255p.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: k */
    public final void m1925k(Context context) {
        this.f3241b.f2904c = new C2101jf(context);
        m1933s();
    }

    /* JADX INFO: renamed from: l */
    public final void m1926l(C0686Py c0686Py) {
        if (this.f3265z == c0686Py) {
            return;
        }
        this.f3265z = c0686Py;
        int i = 0;
        while (true) {
            C0643Oy[] c0643OyArr = this.f3236A;
            if (i >= c0643OyArr.length) {
                m1931q(getState(), true);
                invalidateSelf();
                return;
            }
            if (c0643OyArr[i] == null) {
                c0643OyArr[i] = new C0643Oy(this, f3235F[i]);
            }
            C0643Oy c0643Oy = c0643OyArr[i];
            C0686Py c0686Py2 = new C0686Py();
            float f = (float) c0686Py.f2205b;
            if (f < 0.0f) {
                throw new IllegalArgumentException("Damping ratio must be non-negative");
            }
            c0686Py2.f2205b = f;
            c0686Py2.f2206c = false;
            double d = c0686Py.f2204a;
            float f2 = (float) (d * d);
            if (f2 <= 0.0f) {
                throw new IllegalArgumentException("Spring stiffness constant must be positive.");
            }
            c0686Py2.f2204a = Math.sqrt(f2);
            c0686Py2.f2206c = false;
            c0643Oy.f2077j = c0686Py2;
            i++;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1927m(float f) {
        C0935Vq c0935Vq = this.f3241b;
        if (c0935Vq.f2915n != f) {
            c0935Vq.f2915n = f;
            m1933s();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f3241b = new C0935Vq(this.f3241b);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m1928n(ColorStateList colorStateList) {
        C0935Vq c0935Vq = this.f3241b;
        if (c0935Vq.f2905d != colorStateList) {
            c0935Vq.f2905d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1929o(C1301cz c1301cz) {
        C0935Vq c0935Vq = this.f3241b;
        if (c0935Vq.f2903b != c1301cz) {
            c0935Vq.f2903b = c1301cz;
            m1931q(getState(), true);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f3245f = true;
        this.f3246g = true;
        super.onBoundsChange(rect);
        if (this.f3241b.f2903b != null && !rect.isEmpty()) {
            m1931q(getState(), this.f3263x);
        }
        this.f3263x = rect.isEmpty();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        if (this.f3241b.f2903b != null) {
            m1931q(iArr, false);
        }
        boolean z = m1930p(iArr) || m1932r();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1930p(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f3241b.f2905d == null || color2 == (colorForState2 = this.f3241b.f2905d.getColorForState(iArr, (color2 = (paint2 = this.f3254o).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f3241b.f2906e == null || color == (colorForState = this.f3241b.f2906e.getColorForState(iArr, (color = (paint = this.f3255p).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: q */
    public final void m1931q(int[] iArr, boolean z) {
        C0728Qx c0728QxM1383a;
        int i;
        RectF rectFM1921g = m1921g();
        if (this.f3241b.f2903b == null || rectFM1921g.isEmpty()) {
            return;
        }
        boolean z2 = z | (this.f3265z == null);
        if (this.f3237B == null) {
            this.f3237B = new float[4];
        }
        C1301cz c1301cz = this.f3241b.f2903b;
        C0728Qx[] c0728QxArr = c1301cz.f4739d;
        int i2 = c1301cz.f4736a;
        int[][] iArr2 = c1301cz.f4738c;
        C1196az c1196az = c1301cz.f4743h;
        C1196az c1196az2 = c1301cz.f4742g;
        C1196az c1196az3 = c1301cz.f4741f;
        C1196az c1196az4 = c1301cz.f4740e;
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                i3 = -1;
                break;
            } else if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 < 0) {
            int[] iArr3 = StateSet.WILD_CARD;
            int i4 = 0;
            while (true) {
                if (i4 >= i2) {
                    i = -1;
                    break;
                } else {
                    if (StateSet.stateSetMatches(iArr2[i4], iArr3)) {
                        i = i4;
                        break;
                    }
                    i4++;
                }
            }
            i3 = i;
        }
        if (c1196az4 == null && c1196az3 == null && c1196az2 == null && c1196az == null) {
            c0728QxM1383a = c0728QxArr[i3];
        } else {
            C0685Px c0685PxM1516f = c0728QxArr[i3].m1516f();
            if (c1196az4 != null) {
                c0685PxM1516f.f2196e = c1196az4.m2315c(iArr);
            }
            if (c1196az3 != null) {
                c0685PxM1516f.f2197f = c1196az3.m2315c(iArr);
            }
            if (c1196az2 != null) {
                c0685PxM1516f.f2199h = c1196az2.m2315c(iArr);
            }
            if (c1196az != null) {
                c0685PxM1516f.f2198g = c1196az.m2315c(iArr);
            }
            c0728QxM1383a = c0685PxM1516f.m1383a();
        }
        int i5 = 0;
        while (i5 < 4) {
            this.f3258s.getClass();
            float fMo1563a = (i5 != 1 ? i5 != 2 ? i5 != 3 ? c0728QxM1383a.f2329f : c0728QxM1383a.f2328e : c0728QxM1383a.f2331h : c0728QxM1383a.f2330g).mo1563a(rectFM1921g);
            if (z2) {
                this.f3237B[i5] = fMo1563a;
            }
            C0643Oy[] c0643OyArr = this.f3236A;
            C0643Oy c0643Oy = c0643OyArr[i5];
            if (c0643Oy != null) {
                c0643Oy.m1266a(fMo1563a);
                if (z2) {
                    c0643OyArr[i5].m1268d();
                }
            }
            i5++;
        }
        if (z2) {
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1932r() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f3259t;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f3260u;
        C0935Vq c0935Vq = this.f3241b;
        ColorStateList colorStateList = c0935Vq.f2907f;
        PorterDuff.Mode mode = c0935Vq.f2908g;
        if (colorStateList == null || mode == null) {
            int color = this.f3254o.getColor();
            int iM1917c = m1917c(color);
            porterDuffColorFilter = iM1917c != color ? new PorterDuffColorFilter(iM1917c, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m1917c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f3259t = porterDuffColorFilter;
        this.f3241b.getClass();
        this.f3260u = null;
        this.f3241b.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f3259t) && Objects.equals(porterDuffColorFilter3, this.f3260u)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public final void m1933s() {
        C0935Vq c0935Vq = this.f3241b;
        float f = c0935Vq.f2915n + 0.0f;
        c0935Vq.f2916o = (int) Math.ceil(0.75f * f);
        this.f3241b.f2917p = (int) Math.ceil(f * 0.25f);
        m1932r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C0935Vq c0935Vq = this.f3241b;
        if (c0935Vq.f2913l != i) {
            c0935Vq.f2913l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f3241b.getClass();
        super.invalidateSelf();
    }

    @Override // p000.InterfaceC1300cy
    public final void setShapeAppearanceModel(C0728Qx c0728Qx) {
        C0935Vq c0935Vq = this.f3241b;
        c0935Vq.f2902a = c0728Qx;
        c0935Vq.f2903b = null;
        this.f3237B = null;
        this.f3238C = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f3241b.f2907f = colorStateList;
        m1932r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0935Vq c0935Vq = this.f3241b;
        if (c0935Vq.f2908g != mode) {
            c0935Vq.f2908g = mode;
            m1932r();
            super.invalidateSelf();
        }
    }

    public C1021Xq(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C0728Qx.m1512b(context, attributeSet, i, i2).m1383a());
    }

    public C1021Xq(C0728Qx c0728Qx) {
        this(new C0935Vq(c0728Qx));
    }

    public C1021Xq(C0935Vq c0935Vq) {
        C0813Sx c0813Sx;
        this.f3240a = new C0892Uq(this);
        this.f3242c = new AbstractC1114Zx[4];
        this.f3243d = new AbstractC1114Zx[4];
        this.f3244e = new BitSet(8);
        this.f3247h = new Matrix();
        this.f3248i = new Path();
        this.f3249j = new Path();
        this.f3250k = new RectF();
        this.f3251l = new RectF();
        this.f3252m = new Region();
        this.f3253n = new Region();
        Paint paint = new Paint(1);
        this.f3254o = paint;
        Paint paint2 = new Paint(1);
        this.f3255p = paint2;
        this.f3256q = new C0642Ox();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0813Sx = AbstractC0770Rx.f2443a;
        } else {
            c0813Sx = new C0813Sx();
        }
        this.f3258s = c0813Sx;
        this.f3261v = new RectF();
        this.f3262w = true;
        this.f3263x = true;
        this.f3236A = new C0643Oy[4];
        this.f3241b = c0935Vq;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m1932r();
        m1930p(getState());
        this.f3257r = new C0892Uq(this);
    }
}
