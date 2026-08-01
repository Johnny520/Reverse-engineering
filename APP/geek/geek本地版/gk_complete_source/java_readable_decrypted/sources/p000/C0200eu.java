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

/* JADX INFO: renamed from: eu */
/* JADX INFO: loaded from: classes.dex */
public class C0200eu extends Drawable implements q30 {

    /* JADX INFO: renamed from: w */
    public static final Paint f1841w;

    /* JADX INFO: renamed from: a */
    public C0163du f1842a;

    /* JADX INFO: renamed from: b */
    public final o30[] f1843b;

    /* JADX INFO: renamed from: c */
    public final o30[] f1844c;

    /* JADX INFO: renamed from: d */
    public final BitSet f1845d;

    /* JADX INFO: renamed from: e */
    public boolean f1846e;

    /* JADX INFO: renamed from: f */
    public final Matrix f1847f;

    /* JADX INFO: renamed from: g */
    public final Path f1848g;

    /* JADX INFO: renamed from: h */
    public final Path f1849h;

    /* JADX INFO: renamed from: i */
    public final RectF f1850i;

    /* JADX INFO: renamed from: j */
    public final RectF f1851j;

    /* JADX INFO: renamed from: k */
    public final Region f1852k;

    /* JADX INFO: renamed from: l */
    public final Region f1853l;

    /* JADX INFO: renamed from: m */
    public f30 f1854m;

    /* JADX INFO: renamed from: n */
    public final Paint f1855n;

    /* JADX INFO: renamed from: o */
    public final Paint f1856o;

    /* JADX INFO: renamed from: p */
    public final d30 f1857p;

    /* JADX INFO: renamed from: q */
    public final C0431l0 f1858q;

    /* JADX INFO: renamed from: r */
    public final h30 f1859r;

    /* JADX INFO: renamed from: s */
    public PorterDuffColorFilter f1860s;

    /* JADX INFO: renamed from: t */
    public PorterDuffColorFilter f1861t;

    /* JADX INFO: renamed from: u */
    public final RectF f1862u;

    /* JADX INFO: renamed from: v */
    public final boolean f1863v;

    static {
        Paint paint = new Paint(1);
        f1841w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0200eu() {
        this(new f30());
    }

    /* JADX INFO: renamed from: a */
    public final void m1077a(RectF rectF, Path path) {
        C0163du c0163du = this.f1842a;
        this.f1859r.m1337a(c0163du.f1633a, c0163du.f1641i, rectF, this.f1858q, path);
        if (this.f1842a.f1640h != 1.0f) {
            Matrix matrix = this.f1847f;
            matrix.reset();
            float f = this.f1842a.f1640h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1862u, true);
    }

    /* JADX INFO: renamed from: b */
    public final int m1078b(int i) {
        int i2;
        C0163du c0163du = this.f1842a;
        float f = c0163du.f1645m + 0.0f + c0163du.f1644l;
        C0893xh c0893xh = c0163du.f1634b;
        if (c0893xh == null || !c0893xh.f5161a || AbstractC0329ib.m1428d(i, 255) != c0893xh.f5164d) {
            return i;
        }
        float fMin = (c0893xh.f5165e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM2814E = AbstractC0979zt.m2814E(fMin, AbstractC0329ib.m1428d(i, 255), c0893xh.f5162b);
        if (fMin > 0.0f && (i2 = c0893xh.f5163c) != 0) {
            iM2814E = AbstractC0329ib.m1426b(AbstractC0329ib.m1428d(i2, C0893xh.f5160f), iM2814E);
        }
        return AbstractC0329ib.m1428d(iM2814E, iAlpha);
    }

    /* JADX INFO: renamed from: c */
    public final void m1079c(Canvas canvas) {
        if (this.f1845d.cardinality() > 0) {
            Log.w("eu", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f1842a.f1647o;
        Path path = this.f1848g;
        d30 d30Var = this.f1857p;
        if (i != 0) {
            canvas.drawPath(path, d30Var.f1353a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            o30 o30Var = this.f1843b[i2];
            int i3 = this.f1842a.f1646n;
            Matrix matrix = o30.f3481b;
            o30Var.mo1390a(matrix, d30Var, i3, canvas);
            this.f1844c[i2].mo1390a(matrix, d30Var, this.f1842a.f1646n, canvas);
        }
        if (this.f1863v) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * ((double) this.f1842a.f1647o));
            int iCos = (int) (Math.cos(Math.toRadians(d)) * ((double) this.f1842a.f1647o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f1841w);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m1080d(Canvas canvas, Paint paint, Path path, f30 f30Var, RectF rectF) {
        if (!f30Var.m1138d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo940a = f30Var.f1880f.mo940a(rectF) * this.f1842a.f1641i;
            canvas.drawRoundRect(rectF, fMo940a, fMo940a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.f1860s;
        Paint paint = this.f1855n;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f1842a.f1643k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1861t;
        Paint paint2 = this.f1856o;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f1842a.f1642j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f1842a.f1643k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f1846e;
        Path path = this.f1848g;
        if (z) {
            float f = -(m1082g() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            f30 f30Var = this.f1842a.f1633a;
            e30 e30VarM1139e = f30Var.m1139e();
            InterfaceC0148de c0951z1 = f30Var.f1879e;
            if (!(c0951z1 instanceof l00)) {
                c0951z1 = new C0951z1(f, c0951z1);
            }
            e30VarM1139e.f1697e = c0951z1;
            InterfaceC0148de c0951z12 = f30Var.f1880f;
            if (!(c0951z12 instanceof l00)) {
                c0951z12 = new C0951z1(f, c0951z12);
            }
            e30VarM1139e.f1698f = c0951z12;
            InterfaceC0148de c0951z13 = f30Var.f1882h;
            if (!(c0951z13 instanceof l00)) {
                c0951z13 = new C0951z1(f, c0951z13);
            }
            e30VarM1139e.f1700h = c0951z13;
            InterfaceC0148de c0951z14 = f30Var.f1881g;
            if (!(c0951z14 instanceof l00)) {
                c0951z14 = new C0951z1(f, c0951z14);
            }
            e30VarM1139e.f1699g = c0951z14;
            f30 f30VarM982a = e30VarM1139e.m982a();
            this.f1854m = f30VarM982a;
            float f2 = this.f1842a.f1641i;
            RectF rectFM1081f = m1081f();
            RectF rectF = this.f1851j;
            rectF.set(rectFM1081f);
            float strokeWidth = m1082g() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f1859r.m1337a(f30VarM982a, f2, rectF, null, this.f1849h);
            m1077a(m1081f(), path);
            this.f1846e = false;
        }
        C0163du c0163du = this.f1842a;
        c0163du.getClass();
        if (c0163du.f1646n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f1842a.f1633a.m1138d(m1081f()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * ((double) this.f1842a.f1647o)), (int) (Math.cos(Math.toRadians(d)) * ((double) this.f1842a.f1647o)));
                if (this.f1863v) {
                    RectF rectF2 = this.f1862u;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f1842a.f1646n * 2) + ((int) rectF2.width()) + iWidth, (this.f1842a.f1646n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f3 = (getBounds().left - this.f1842a.f1646n) - iWidth;
                    float f4 = (getBounds().top - this.f1842a.f1646n) - iHeight;
                    canvas2.translate(-f3, -f4);
                    m1079c(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m1079c(canvas);
                    canvas.restore();
                }
            }
        }
        C0163du c0163du2 = this.f1842a;
        Paint.Style style = c0163du2.f1648p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m1080d(canvas, paint, path, c0163du2.f1633a, m1081f());
        }
        if (m1082g()) {
            mo553e(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public void mo553e(Canvas canvas) {
        f30 f30Var = this.f1854m;
        RectF rectFM1081f = m1081f();
        RectF rectF = this.f1851j;
        rectF.set(rectFM1081f);
        boolean zM1082g = m1082g();
        Paint paint = this.f1856o;
        float strokeWidth = zM1082g ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m1080d(canvas, paint, this.f1849h, f30Var, rectF);
    }

    /* JADX INFO: renamed from: f */
    public final RectF m1081f() {
        Rect bounds = getBounds();
        RectF rectF = this.f1850i;
        rectF.set(bounds);
        return rectF;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1082g() {
        Paint.Style style = this.f1842a.f1648p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1856o.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1842a.f1643k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1842a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f1842a.getClass();
        if (this.f1842a.f1633a.m1138d(m1081f())) {
            outline.setRoundRect(getBounds(), this.f1842a.f1633a.f1879e.mo940a(m1081f()) * this.f1842a.f1641i);
            return;
        }
        RectF rectFM1081f = m1081f();
        Path path = this.f1848g;
        m1077a(rectFM1081f, path);
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
        Rect rect2 = this.f1842a.f1639g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1852k;
        region.set(bounds);
        RectF rectFM1081f = m1081f();
        Path path = this.f1848g;
        m1077a(rectFM1081f, path);
        Region region2 = this.f1853l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final void m1083h(Context context) {
        this.f1842a.f1634b = new C0893xh(context);
        m1088m();
    }

    /* JADX INFO: renamed from: i */
    public final void m1084i(float f) {
        C0163du c0163du = this.f1842a;
        if (c0163du.f1645m != f) {
            c0163du.f1645m = f;
            m1088m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1846e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f1842a.f1637e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f1842a.getClass();
        ColorStateList colorStateList2 = this.f1842a.f1636d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f1842a.f1635c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public final void m1085j(ColorStateList colorStateList) {
        C0163du c0163du = this.f1842a;
        if (c0163du.f1635c != colorStateList) {
            c0163du.f1635c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1086k(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1842a.f1635c == null || color2 == (colorForState2 = this.f1842a.f1635c.getColorForState(iArr, (color2 = (paint2 = this.f1855n).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f1842a.f1636d == null || color == (colorForState = this.f1842a.f1636d.getColorForState(iArr, (color = (paint = this.f1856o).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1087l() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1860s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1861t;
        C0163du c0163du = this.f1842a;
        ColorStateList colorStateList = c0163du.f1637e;
        PorterDuff.Mode mode = c0163du.f1638f;
        if (colorStateList == null || mode == null) {
            int color = this.f1855n.getColor();
            int iM1078b = m1078b(color);
            porterDuffColorFilter = iM1078b != color ? new PorterDuffColorFilter(iM1078b, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m1078b(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f1860s = porterDuffColorFilter;
        this.f1842a.getClass();
        this.f1861t = null;
        this.f1842a.getClass();
        return (AbstractC0612pw.m2131a(porterDuffColorFilter2, this.f1860s) && AbstractC0612pw.m2131a(porterDuffColorFilter3, this.f1861t)) ? false : true;
    }

    /* JADX INFO: renamed from: m */
    public final void m1088m() {
        C0163du c0163du = this.f1842a;
        float f = c0163du.f1645m + 0.0f;
        c0163du.f1646n = (int) Math.ceil(0.75f * f);
        this.f1842a.f1647o = (int) Math.ceil(f * 0.25f);
        m1087l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1842a = new C0163du(this.f1842a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1846e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m1086k(iArr) || m1087l();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C0163du c0163du = this.f1842a;
        if (c0163du.f1643k != i) {
            c0163du.f1643k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1842a.getClass();
        super.invalidateSelf();
    }

    @Override // p000.q30
    public final void setShapeAppearanceModel(f30 f30Var) {
        this.f1842a.f1633a = f30Var;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1842a.f1637e = colorStateList;
        m1087l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0163du c0163du = this.f1842a;
        if (c0163du.f1638f != mode) {
            c0163du.f1638f = mode;
            m1087l();
            super.invalidateSelf();
        }
    }

    public C0200eu(Context context, AttributeSet attributeSet, int i, int i2) {
        this(f30.m1136b(context, attributeSet, i, i2).m982a());
    }

    public C0200eu(f30 f30Var) {
        this(new C0163du(f30Var));
    }

    public C0200eu(C0163du c0163du) {
        h30 h30Var;
        this.f1843b = new o30[4];
        this.f1844c = new o30[4];
        this.f1845d = new BitSet(8);
        this.f1847f = new Matrix();
        this.f1848g = new Path();
        this.f1849h = new Path();
        this.f1850i = new RectF();
        this.f1851j = new RectF();
        this.f1852k = new Region();
        this.f1853l = new Region();
        Paint paint = new Paint(1);
        this.f1855n = paint;
        Paint paint2 = new Paint(1);
        this.f1856o = paint2;
        this.f1857p = new d30();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            h30Var = g30.f2013a;
        } else {
            h30Var = new h30();
        }
        this.f1859r = h30Var;
        this.f1862u = new RectF();
        this.f1863v = true;
        this.f1842a = c0163du;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m1087l();
        m1086k(getState());
        this.f1858q = new C0431l0(20, this);
    }
}
