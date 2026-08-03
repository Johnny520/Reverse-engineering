package p089x0;

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
import com.abc.core.runtime.AbstractC0805P;
import java.util.BitSet;
import java.util.Objects;
import p006D.C0095d;
import p077q0.AbstractC1055a;
import p077q0.AbstractC1057c;
import p079r0.C1065a;
import p085v.AbstractC1100a;
import p088w0.C1116a;

/* JADX INFO: renamed from: x0.g */
/* JADX INFO: loaded from: classes.dex */
public class C1123g extends Drawable implements InterfaceC1138v {

    /* JADX INFO: renamed from: w */
    public static final Paint f4311w;

    /* JADX INFO: renamed from: a */
    public C1122f f4312a;

    /* JADX INFO: renamed from: b */
    public final AbstractC1136t[] f4313b;

    /* JADX INFO: renamed from: c */
    public final AbstractC1136t[] f4314c;

    /* JADX INFO: renamed from: d */
    public final BitSet f4315d;

    /* JADX INFO: renamed from: e */
    public boolean f4316e;

    /* JADX INFO: renamed from: f */
    public final Matrix f4317f;

    /* JADX INFO: renamed from: g */
    public final Path f4318g;

    /* JADX INFO: renamed from: h */
    public final Path f4319h;

    /* JADX INFO: renamed from: i */
    public final RectF f4320i;

    /* JADX INFO: renamed from: j */
    public final RectF f4321j;

    /* JADX INFO: renamed from: k */
    public final Region f4322k;

    /* JADX INFO: renamed from: l */
    public final Region f4323l;

    /* JADX INFO: renamed from: m */
    public C1127k f4324m;

    /* JADX INFO: renamed from: n */
    public final Paint f4325n;

    /* JADX INFO: renamed from: o */
    public final Paint f4326o;

    /* JADX INFO: renamed from: p */
    public final C1116a f4327p;

    /* JADX INFO: renamed from: q */
    public final C0095d f4328q;

    /* JADX INFO: renamed from: r */
    public final C1129m f4329r;

    /* JADX INFO: renamed from: s */
    public PorterDuffColorFilter f4330s;

    /* JADX INFO: renamed from: t */
    public PorterDuffColorFilter f4331t;

    /* JADX INFO: renamed from: u */
    public final RectF f4332u;

    /* JADX INFO: renamed from: v */
    public final boolean f4333v;

    static {
        Paint paint = new Paint(1);
        f4311w = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C1123g() {
        this(new C1127k());
    }

    /* JADX INFO: renamed from: a */
    public final void m2642a(RectF rectF, Path path) {
        C1122f c1122f = this.f4312a;
        this.f4329r.m2661a(c1122f.f4290a, c1122f.f4299j, rectF, this.f4328q, path);
        if (this.f4312a.f4298i != 1.0f) {
            Matrix matrix = this.f4317f;
            matrix.reset();
            float f2 = this.f4312a.f4298i;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f4332u, true);
    }

    /* JADX INFO: renamed from: b */
    public final PorterDuffColorFilter m2643b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z2) {
        int color;
        int iM2644c;
        if (colorStateList == null || mode == null) {
            return (!z2 || (iM2644c = m2644c((color = paint.getColor()))) == color) ? null : new PorterDuffColorFilter(iM2644c, PorterDuff.Mode.SRC_IN);
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z2) {
            colorForState = m2644c(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    /* JADX INFO: renamed from: c */
    public final int m2644c(int i2) {
        int i3;
        C1122f c1122f = this.f4312a;
        float f2 = c1122f.f4303n + c1122f.f4304o + c1122f.f4302m;
        C1065a c1065a = c1122f.f4291b;
        if (c1065a == null || !c1065a.f4085a || AbstractC1100a.m2595d(i2, 255) != c1065a.f4088d) {
            return i2;
        }
        float fMin = (c1065a.f4089e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i2);
        int iM2033I = AbstractC0805P.m2033I(AbstractC1100a.m2595d(i2, 255), c1065a.f4086b, fMin);
        if (fMin > 0.0f && (i3 = c1065a.f4087c) != 0) {
            iM2033I = AbstractC1100a.m2593b(AbstractC1100a.m2595d(i3, C1065a.f4084f), iM2033I);
        }
        return AbstractC1100a.m2595d(iM2033I, iAlpha);
    }

    /* JADX INFO: renamed from: d */
    public final void m2645d(Canvas canvas) {
        this.f4315d.cardinality();
        int i2 = this.f4312a.f4307r;
        Path path = this.f4318g;
        C1116a c1116a = this.f4327p;
        if (i2 != 0) {
            canvas.drawPath(path, c1116a.f4275a);
        }
        for (int i3 = 0; i3 < 4; i3++) {
            AbstractC1136t abstractC1136t = this.f4313b[i3];
            int i4 = this.f4312a.f4306q;
            Matrix matrix = AbstractC1136t.f4388b;
            abstractC1136t.mo2663a(matrix, c1116a, i4, canvas);
            this.f4314c[i3].mo2663a(matrix, c1116a, this.f4312a.f4306q, canvas);
        }
        if (this.f4333v) {
            int iSin = (int) (Math.sin(Math.toRadians(r0.f4308s)) * ((double) this.f4312a.f4307r));
            int iCos = (int) (Math.cos(Math.toRadians(r2.f4308s)) * ((double) this.f4312a.f4307r));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f4311w);
            canvas.translate(iSin, iCos);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00f3  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas) {
        Paint paint = this.f4325n;
        paint.setColorFilter(this.f4330s);
        int alpha = paint.getAlpha();
        int i2 = this.f4312a.f4301l;
        paint.setAlpha(((i2 + (i2 >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f4326o;
        paint2.setColorFilter(this.f4331t);
        paint2.setStrokeWidth(this.f4312a.f4300k);
        int alpha2 = paint2.getAlpha();
        int i3 = this.f4312a.f4301l;
        paint2.setAlpha(((i3 + (i3 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f4316e;
        Path path = this.f4318g;
        if (z2) {
            float f2 = -(m2648h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C1127k c1127k = this.f4312a.f4290a;
            C1126j c1126jM2660d = c1127k.m2660d();
            InterfaceC1119c c1118b = c1127k.f4351e;
            if (!(c1118b instanceof C1124h)) {
                c1118b = new C1118b(f2, c1118b);
            }
            c1126jM2660d.f4339e = c1118b;
            InterfaceC1119c c1118b2 = c1127k.f4352f;
            if (!(c1118b2 instanceof C1124h)) {
                c1118b2 = new C1118b(f2, c1118b2);
            }
            c1126jM2660d.f4340f = c1118b2;
            InterfaceC1119c c1118b3 = c1127k.f4354h;
            if (!(c1118b3 instanceof C1124h)) {
                c1118b3 = new C1118b(f2, c1118b3);
            }
            c1126jM2660d.f4342h = c1118b3;
            InterfaceC1119c c1118b4 = c1127k.f4353g;
            if (!(c1118b4 instanceof C1124h)) {
                c1118b4 = new C1118b(f2, c1118b4);
            }
            c1126jM2660d.f4341g = c1118b4;
            C1127k c1127kM2656a = c1126jM2660d.m2656a();
            this.f4324m = c1127kM2656a;
            float f3 = this.f4312a.f4299j;
            RectF rectF = this.f4321j;
            rectF.set(m2647g());
            float strokeWidth = m2648h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f4329r.m2661a(c1127kM2656a, f3, rectF, null, this.f4319h);
            m2642a(m2647g(), path);
            this.f4316e = false;
        }
        C1122f c1122f = this.f4312a;
        int i4 = c1122f.f4305p;
        if (i4 != 1 && c1122f.f4306q > 0) {
            if (i4 != 2) {
                int i5 = Build.VERSION.SDK_INT;
                if (!c1122f.f4290a.m2659c(m2647g()) && !path.isConvex() && i5 < 29) {
                    canvas.save();
                    int iSin = (int) (Math.sin(Math.toRadians(r0.f4308s)) * ((double) this.f4312a.f4307r));
                    C1122f c1122f2 = this.f4312a;
                    canvas.translate(iSin, (int) (Math.cos(Math.toRadians(c1122f2.f4308s)) * ((double) c1122f2.f4307r)));
                    if (this.f4333v) {
                        RectF rectF2 = this.f4332u;
                        int iWidth = (int) (rectF2.width() - getBounds().width());
                        int iHeight = (int) (rectF2.height() - getBounds().height());
                        if (iWidth < 0 || iHeight < 0) {
                            throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f4312a.f4306q * 2) + ((int) rectF2.width()) + iWidth, (this.f4312a.f4306q * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                        float f4 = (getBounds().left - this.f4312a.f4306q) - iWidth;
                        float f5 = (getBounds().top - this.f4312a.f4306q) - iHeight;
                        canvas2.translate(-f4, -f5);
                        m2645d(canvas2);
                        canvas.drawBitmap(bitmapCreateBitmap, f4, f5, (Paint) null);
                        bitmapCreateBitmap.recycle();
                        canvas.restore();
                    } else {
                        m2645d(canvas);
                        canvas.restore();
                    }
                }
            }
        }
        C1122f c1122f3 = this.f4312a;
        Paint.Style style = c1122f3.f4310u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m2646e(canvas, paint, path, c1122f3.f4290a, m2647g());
        }
        if (m2648h()) {
            mo69f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public final void m2646e(Canvas canvas, Paint paint, Path path, C1127k c1127k, RectF rectF) {
        if (!c1127k.m2659c(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo2634a = c1127k.f4352f.mo2634a(rectF) * this.f4312a.f4299j;
            canvas.drawRoundRect(rectF, fMo2634a, fMo2634a, paint);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo69f(Canvas canvas) {
        Paint paint = this.f4326o;
        Path path = this.f4319h;
        C1127k c1127k = this.f4324m;
        RectF rectF = this.f4321j;
        rectF.set(m2647g());
        float strokeWidth = m2648h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m2646e(canvas, paint, path, c1127k, rectF);
    }

    /* JADX INFO: renamed from: g */
    public final RectF m2647g() {
        RectF rectF = this.f4320i;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f4312a.f4301l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f4312a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        C1122f c1122f = this.f4312a;
        if (c1122f.f4305p == 2) {
            return;
        }
        if (c1122f.f4290a.m2659c(m2647g())) {
            outline.setRoundRect(getBounds(), this.f4312a.f4290a.f4351e.mo2634a(m2647g()) * this.f4312a.f4299j);
            return;
        }
        RectF rectFM2647g = m2647g();
        Path path = this.f4318g;
        m2642a(rectFM2647g, path);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            AbstractC1057c.m2534a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                AbstractC1055a.m2531a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC1055a.m2531a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f4312a.f4297h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f4322k;
        region.set(bounds);
        RectF rectFM2647g = m2647g();
        Path path = this.f4318g;
        m2642a(rectFM2647g, path);
        Region region2 = this.f4323l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2648h() {
        Paint.Style style = this.f4312a.f4310u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f4326o.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public final void m2649i(Context context) {
        this.f4312a.f4291b = new C1065a(context);
        m2654n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f4316e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f4312a.f4295f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f4312a.f4294e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f4312a.f4293d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f4312a.f4292c) != null && colorStateList4.isStateful())));
    }

    /* JADX INFO: renamed from: j */
    public final void m2650j(float f2) {
        C1122f c1122f = this.f4312a;
        if (c1122f.f4303n != f2) {
            c1122f.f4303n = f2;
            m2654n();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m2651k(ColorStateList colorStateList) {
        C1122f c1122f = this.f4312a;
        if (c1122f.f4292c != colorStateList) {
            c1122f.f4292c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2652l(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f4312a.f4292c == null || color2 == (colorForState2 = this.f4312a.f4292c.getColorForState(iArr, (color2 = (paint2 = this.f4325n).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f4312a.f4293d == null || color == (colorForState = this.f4312a.f4293d.getColorForState(iArr, (color = (paint = this.f4326o).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2653m() {
        PorterDuffColorFilter porterDuffColorFilter = this.f4330s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f4331t;
        C1122f c1122f = this.f4312a;
        this.f4330s = m2643b(c1122f.f4295f, c1122f.f4296g, this.f4325n, true);
        C1122f c1122f2 = this.f4312a;
        this.f4331t = m2643b(c1122f2.f4294e, c1122f2.f4296g, this.f4326o, false);
        C1122f c1122f3 = this.f4312a;
        if (c1122f3.f4309t) {
            int colorForState = c1122f3.f4295f.getColorForState(getState(), 0);
            C1116a c1116a = this.f4327p;
            c1116a.getClass();
            c1116a.f4278d = AbstractC1100a.m2595d(colorForState, 68);
            c1116a.f4279e = AbstractC1100a.m2595d(colorForState, 20);
            c1116a.f4280f = AbstractC1100a.m2595d(colorForState, 0);
            c1116a.f4275a.setColor(c1116a.f4278d);
        }
        return (Objects.equals(porterDuffColorFilter, this.f4330s) && Objects.equals(porterDuffColorFilter2, this.f4331t)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f4312a = new C1122f(this.f4312a);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m2654n() {
        C1122f c1122f = this.f4312a;
        float f2 = c1122f.f4303n + c1122f.f4304o;
        c1122f.f4306q = (int) Math.ceil(0.75f * f2);
        this.f4312a.f4307r = (int) Math.ceil(f2 * 0.25f);
        m2653m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f4316e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z2 = m2652l(iArr) || m2653m();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        C1122f c1122f = this.f4312a;
        if (c1122f.f4301l != i2) {
            c1122f.f4301l = i2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4312a.getClass();
        super.invalidateSelf();
    }

    @Override // p089x0.InterfaceC1138v
    public final void setShapeAppearanceModel(C1127k c1127k) {
        this.f4312a.f4290a = c1127k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f4312a.f4295f = colorStateList;
        m2653m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C1122f c1122f = this.f4312a;
        if (c1122f.f4296g != mode) {
            c1122f.f4296g = mode;
            m2653m();
            super.invalidateSelf();
        }
    }

    public C1123g(C1127k c1127k) {
        this(new C1122f(c1127k));
    }

    public C1123g(C1122f c1122f) {
        C1129m c1129m;
        this.f4313b = new AbstractC1136t[4];
        this.f4314c = new AbstractC1136t[4];
        this.f4315d = new BitSet(8);
        this.f4317f = new Matrix();
        this.f4318g = new Path();
        this.f4319h = new Path();
        this.f4320i = new RectF();
        this.f4321j = new RectF();
        this.f4322k = new Region();
        this.f4323l = new Region();
        Paint paint = new Paint(1);
        this.f4325n = paint;
        Paint paint2 = new Paint(1);
        this.f4326o = paint2;
        this.f4327p = new C1116a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c1129m = AbstractC1128l.f4359a;
        } else {
            c1129m = new C1129m();
        }
        this.f4329r = c1129m;
        this.f4332u = new RectF();
        this.f4333v = true;
        this.f4312a = c1122f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m2653m();
        m2652l(getState());
        this.f4328q = new C0095d(25, this);
    }
}
