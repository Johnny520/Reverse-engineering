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
import android.util.Log;
import java.util.BitSet;

/* JADX INFO: renamed from: iu */
/* JADX INFO: loaded from: classes.dex */
public class C0350iu extends Drawable implements x30 {

    /* JADX INFO: renamed from: w */
    public static final Paint f2584w;

    /* JADX INFO: renamed from: a */
    public C0311hu f2585a;

    /* JADX INFO: renamed from: b */
    public final v30[] f2586b;

    /* JADX INFO: renamed from: c */
    public final v30[] f2587c;

    /* JADX INFO: renamed from: d */
    public final BitSet f2588d;

    /* JADX INFO: renamed from: e */
    public boolean f2589e;

    /* JADX INFO: renamed from: f */
    public final Matrix f2590f;

    /* JADX INFO: renamed from: g */
    public final Path f2591g;

    /* JADX INFO: renamed from: h */
    public final Path f2592h;

    /* JADX INFO: renamed from: i */
    public final RectF f2593i;

    /* JADX INFO: renamed from: j */
    public final RectF f2594j;

    /* JADX INFO: renamed from: k */
    public final Region f2595k;

    /* JADX INFO: renamed from: l */
    public final Region f2596l;

    /* JADX INFO: renamed from: m */
    public m30 f2597m;

    /* JADX INFO: renamed from: n */
    public final Paint f2598n;

    /* JADX INFO: renamed from: o */
    public final Paint f2599o;

    /* JADX INFO: renamed from: p */
    public final k30 f2600p;

    /* JADX INFO: renamed from: q */
    public final C0431l0 f2601q;

    /* JADX INFO: renamed from: r */
    public final o30 f2602r;

    /* JADX INFO: renamed from: s */
    public PorterDuffColorFilter f2603s;

    /* JADX INFO: renamed from: t */
    public PorterDuffColorFilter f2604t;

    /* JADX INFO: renamed from: u */
    public final RectF f2605u;

    /* JADX INFO: renamed from: v */
    public final boolean f2606v;

    static {
        Paint paint = new Paint(1);
        f2584w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0350iu() {
        this(new m30());
    }

    /* JADX INFO: renamed from: a */
    public final void m1529a(RectF rectF, Path path) {
        C0311hu c0311hu = this.f2585a;
        this.f2602r.m1970a(c0311hu.f2266a, c0311hu.f2274i, rectF, this.f2601q, path);
        if (this.f2585a.f2273h != 1.0f) {
            Matrix matrix = this.f2590f;
            matrix.reset();
            float f = this.f2585a.f2273h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f2605u, true);
    }

    /* JADX INFO: renamed from: b */
    public final int m1530b(int i) {
        int i2;
        C0311hu c0311hu = this.f2585a;
        float f = c0311hu.f2278m + 0.0f + c0311hu.f2277l;
        C0967zh c0967zh = c0311hu.f2267b;
        if (c0967zh == null || !c0967zh.f5588a || AbstractC0627qb.m2144d(i, 255) != c0967zh.f5591d) {
            return i;
        }
        float fMin = (c0967zh.f5592e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM1207v = g80.m1207v(fMin, AbstractC0627qb.m2144d(i, 255), c0967zh.f5589b);
        if (fMin > 0.0f && (i2 = c0967zh.f5590c) != 0) {
            iM1207v = AbstractC0627qb.m2142b(AbstractC0627qb.m2144d(i2, C0967zh.f5587f), iM1207v);
        }
        return AbstractC0627qb.m2144d(iM1207v, iAlpha);
    }

    /* JADX INFO: renamed from: c */
    public final void m1531c(Canvas canvas) {
        if (this.f2588d.cardinality() > 0) {
            Log.w("iu", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f2585a.f2280o;
        Path path = this.f2591g;
        k30 k30Var = this.f2600p;
        if (i != 0) {
            canvas.drawPath(path, k30Var.f2768a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            v30 v30Var = this.f2586b[i2];
            int i3 = this.f2585a.f2279n;
            Matrix matrix = v30.f4886b;
            v30Var.mo2062a(matrix, k30Var, i3, canvas);
            this.f2587c[i2].mo2062a(matrix, k30Var, this.f2585a.f2279n, canvas);
        }
        if (this.f2606v) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * ((double) this.f2585a.f2280o));
            int iCos = (int) (Math.cos(Math.toRadians(d)) * ((double) this.f2585a.f2280o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f2584w);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1532d(Canvas canvas, Paint paint, Path path, m30 m30Var, RectF rectF) {
        if (!m30Var.m1801d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo943a = m30Var.f3066f.mo943a(rectF) * this.f2585a.f2274i;
            canvas.drawRoundRect(rectF, fMo943a, fMo943a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.f2603s;
        Paint paint = this.f2598n;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f2585a.f2276k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2604t;
        Paint paint2 = this.f2599o;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f2585a.f2275j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f2585a.f2276k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f2589e;
        Path path = this.f2591g;
        if (z) {
            float f = -(m1534g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            m30 m30Var = this.f2585a.f2266a;
            l30 l30VarM1802e = m30Var.m1802e();
            InterfaceC0184ee c0951z1 = m30Var.f3065e;
            if (!(c0951z1 instanceof s00)) {
                c0951z1 = new C0951z1(f, c0951z1);
            }
            l30VarM1802e.f2908e = c0951z1;
            InterfaceC0184ee c0951z12 = m30Var.f3066f;
            if (!(c0951z12 instanceof s00)) {
                c0951z12 = new C0951z1(f, c0951z12);
            }
            l30VarM1802e.f2909f = c0951z12;
            InterfaceC0184ee c0951z13 = m30Var.f3068h;
            if (!(c0951z13 instanceof s00)) {
                c0951z13 = new C0951z1(f, c0951z13);
            }
            l30VarM1802e.f2911h = c0951z13;
            InterfaceC0184ee c0951z14 = m30Var.f3067g;
            if (!(c0951z14 instanceof s00)) {
                c0951z14 = new C0951z1(f, c0951z14);
            }
            l30VarM1802e.f2910g = c0951z14;
            m30 m30VarM1731a = l30VarM1802e.m1731a();
            this.f2597m = m30VarM1731a;
            float f2 = this.f2585a.f2274i;
            RectF rectFM1533f = m1533f();
            RectF rectF = this.f2594j;
            rectF.set(rectFM1533f);
            float strokeWidth = m1534g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f2602r.m1970a(m30VarM1731a, f2, rectF, null, this.f2592h);
            m1529a(m1533f(), path);
            this.f2589e = false;
        }
        C0311hu c0311hu = this.f2585a;
        c0311hu.getClass();
        if (c0311hu.f2279n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f2585a.f2266a.m1801d(m1533f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * ((double) this.f2585a.f2280o)), (int) (Math.cos(Math.toRadians(d)) * ((double) this.f2585a.f2280o)));
                if (this.f2606v) {
                    RectF rectF2 = this.f2605u;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f2585a.f2279n * 2) + ((int) rectF2.width()) + iWidth, (this.f2585a.f2279n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f3 = (getBounds().left - this.f2585a.f2279n) - iWidth;
                    float f4 = (getBounds().top - this.f2585a.f2279n) - iHeight;
                    canvas2.translate(-f3, -f4);
                    m1531c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m1531c(canvas);
                    canvas.restore();
                }
            }
        }
        C0311hu c0311hu2 = this.f2585a;
        Paint.Style style = c0311hu2.f2281p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m1532d(canvas, paint, path, c0311hu2.f2266a, m1533f());
        }
        if (m1534g()) {
            mo632e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public void mo632e(Canvas canvas) {
        m30 m30Var = this.f2597m;
        RectF rectFM1533f = m1533f();
        RectF rectF = this.f2594j;
        rectF.set(rectFM1533f);
        boolean zM1534g = m1534g();
        Paint paint = this.f2599o;
        float strokeWidth = zM1534g ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m1532d(canvas, paint, this.f2592h, m30Var, rectF);
    }

    /* JADX INFO: renamed from: f */
    public final RectF m1533f() {
        Rect bounds = getBounds();
        RectF rectF = this.f2593i;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1534g() {
        Paint.Style style = this.f2585a.f2281p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f2599o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f2585a.f2276k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f2585a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f2585a.getClass();
        if (this.f2585a.f2266a.m1801d(m1533f())) {
            outline.setRoundRect(getBounds(), this.f2585a.f2266a.f3065e.mo943a(m1533f()) * this.f2585a.f2274i);
            return;
        }
        RectF rectFM1533f = m1533f();
        Path path = this.f2591g;
        m1529a(rectFM1533f, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            outline.setPath(path);
            return;
        }
        if (i >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f2585a.f2272g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f2595k;
        region.set(bounds);
        RectF rectFM1533f = m1533f();
        Path path = this.f2591g;
        m1529a(rectFM1533f, path);
        Region region2 = this.f2596l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final void m1535h(Context context) {
        this.f2585a.f2267b = new C0967zh(context);
        m1540m();
    }

    /* JADX INFO: renamed from: i */
    public final void m1536i(float f) {
        C0311hu c0311hu = this.f2585a;
        if (c0311hu.f2278m != f) {
            c0311hu.f2278m = f;
            m1540m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f2589e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f2585a.f2270e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f2585a.getClass();
        ColorStateList colorStateList2 = this.f2585a.f2269d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f2585a.f2268c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public final void m1537j(ColorStateList colorStateList) {
        C0311hu c0311hu = this.f2585a;
        if (c0311hu.f2268c != colorStateList) {
            c0311hu.f2268c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1538k(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f2585a.f2268c == null || color2 == (colorForState2 = this.f2585a.f2268c.getColorForState(iArr, (color2 = (paint2 = this.f2598n).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f2585a.f2269d == null || color == (colorForState = this.f2585a.f2269d.getColorForState(iArr, (color = (paint = this.f2599o).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1539l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f2603s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f2604t;
        C0311hu c0311hu = this.f2585a;
        ColorStateList colorStateList = c0311hu.f2270e;
        PorterDuff.Mode mode = c0311hu.f2271f;
        if (colorStateList == null || mode == null) {
            int color = this.f2598n.getColor();
            int iM1530b = m1530b(color);
            porterDuffColorFilter = iM1530b != color ? new PorterDuffColorFilter(iM1530b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m1530b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f2603s = porterDuffColorFilter;
        this.f2585a.getClass();
        this.f2604t = null;
        this.f2585a.getClass();
        return (AbstractC0908xw.m2709a(porterDuffColorFilter2, this.f2603s) && AbstractC0908xw.m2709a(porterDuffColorFilter3, this.f2604t)) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final void m1540m() {
        C0311hu c0311hu = this.f2585a;
        float f = c0311hu.f2278m + 0.0f;
        c0311hu.f2279n = (int) Math.ceil(0.75f * f);
        this.f2585a.f2280o = (int) Math.ceil(f * 0.25f);
        m1539l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f2585a = new C0311hu(this.f2585a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f2589e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m1538k(iArr) || m1539l();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C0311hu c0311hu = this.f2585a;
        if (c0311hu.f2276k != i) {
            c0311hu.f2276k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2585a.getClass();
        super.invalidateSelf();
    }

    @Override // p000.x30
    public final void setShapeAppearanceModel(m30 m30Var) {
        this.f2585a.f2266a = m30Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2585a.f2270e = colorStateList;
        m1539l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0311hu c0311hu = this.f2585a;
        if (c0311hu.f2271f != mode) {
            c0311hu.f2271f = mode;
            m1539l();
            super.invalidateSelf();
        }
    }

    public C0350iu(Context context, AttributeSet attributeSet, int i, int i2) {
        this(m30.m1799b(context, attributeSet, i, i2).m1731a());
    }

    public C0350iu(m30 m30Var) {
        this(new C0311hu(m30Var));
    }

    public C0350iu(C0311hu c0311hu) {
        o30 o30Var;
        this.f2586b = new v30[4];
        this.f2587c = new v30[4];
        this.f2588d = new BitSet(8);
        this.f2590f = new Matrix();
        this.f2591g = new Path();
        this.f2592h = new Path();
        this.f2593i = new RectF();
        this.f2594j = new RectF();
        this.f2595k = new Region();
        this.f2596l = new Region();
        Paint paint = new Paint(1);
        this.f2598n = paint;
        Paint paint2 = new Paint(1);
        this.f2599o = paint2;
        this.f2600p = new k30();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            o30Var = n30.f3213a;
        } else {
            o30Var = new o30();
        }
        this.f2602r = o30Var;
        this.f2605u = new RectF();
        this.f2606v = true;
        this.f2585a = c0311hu;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m1539l();
        m1538k(getState());
        this.f2601q = new C0431l0(20, this);
    }
}
