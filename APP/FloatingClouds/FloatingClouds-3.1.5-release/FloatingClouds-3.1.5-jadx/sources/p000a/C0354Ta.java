package p000a;

import android.annotation.TargetApi;
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
import java.util.Objects;
import p000a.C0393Vd;
import p000a.C0411Wd;
import p000a.C0447Yd;
import p000a.C0931y5;

/* JADX INFO: renamed from: a.Ta */
/* JADX INFO: loaded from: classes.dex */
public class C0354Ta extends Drawable implements InterfaceC0465Zd {

    /* JADX INFO: renamed from: x */
    public static final Paint f1309x;

    /* JADX INFO: renamed from: a */
    public b f1310a;

    /* JADX INFO: renamed from: b */
    public final C0447Yd.f[] f1311b;

    /* JADX INFO: renamed from: c */
    public final C0447Yd.f[] f1312c;

    /* JADX INFO: renamed from: d */
    public final BitSet f1313d;

    /* JADX INFO: renamed from: e */
    public boolean f1314e;

    /* JADX INFO: renamed from: f */
    public final Matrix f1315f;

    /* JADX INFO: renamed from: g */
    public final Path f1316g;

    /* JADX INFO: renamed from: h */
    public final Path f1317h;

    /* JADX INFO: renamed from: i */
    public final RectF f1318i;

    /* JADX INFO: renamed from: j */
    public final RectF f1319j;

    /* JADX INFO: renamed from: k */
    public final Region f1320k;

    /* JADX INFO: renamed from: l */
    public final Region f1321l;

    /* JADX INFO: renamed from: m */
    public C0393Vd f1322m;

    /* JADX INFO: renamed from: n */
    public final Paint f1323n;

    /* JADX INFO: renamed from: o */
    public final Paint f1324o;

    /* JADX INFO: renamed from: p */
    public final C0375Ud f1325p;

    /* JADX INFO: renamed from: q */
    public final a f1326q;

    /* JADX INFO: renamed from: r */
    public final C0411Wd f1327r;

    /* JADX INFO: renamed from: s */
    public PorterDuffColorFilter f1328s;

    /* JADX INFO: renamed from: t */
    public PorterDuffColorFilter f1329t;

    /* JADX INFO: renamed from: u */
    public int f1330u;

    /* JADX INFO: renamed from: v */
    public final RectF f1331v;

    /* JADX INFO: renamed from: w */
    public final boolean f1332w;

    /* JADX INFO: renamed from: a.Ta$a */
    public class a {
        public a() {
        }
    }

    static {
        Paint paint = new Paint(1);
        f1309x = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0354Ta() {
        this(new C0393Vd());
    }

    /* JADX INFO: renamed from: b */
    public final void m959b(RectF rectF, Path path) {
        b bVar = this.f1310a;
        this.f1327r.m1055a(bVar.f1334a, bVar.f1342i, rectF, this.f1326q, path);
        if (this.f1310a.f1341h != 1.0f) {
            Matrix matrix = this.f1315f;
            matrix.reset();
            float f = this.f1310a.f1341h;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1331v, true);
    }

    /* JADX INFO: renamed from: c */
    public final int m960c(int i) {
        int i2;
        b bVar = this.f1310a;
        float f = bVar.f1346m + 0.0f + bVar.f1345l;
        C0170J5 c0170j5 = bVar.f1335b;
        if (c0170j5 == null || !c0170j5.f599a || C0872v3.m2086d(i, 255) != c0170j5.f602d) {
            return i;
        }
        float fMin = (c0170j5.f603e <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM686d = C0247Na.m686d(C0872v3.m2086d(i, 255), c0170j5.f600b, fMin);
        if (fMin > 0.0f && (i2 = c0170j5.f601c) != 0) {
            iM686d = C0872v3.m2084b(C0872v3.m2086d(i2, C0170J5.f598f), iM686d);
        }
        return C0872v3.m2086d(iM686d, iAlpha);
    }

    /* JADX INFO: renamed from: d */
    public final void m961d(Canvas canvas) {
        if (this.f1313d.cardinality() > 0) {
            Log.w("Ta", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f1310a.f1348o;
        Path path = this.f1316g;
        C0375Ud c0375Ud = this.f1325p;
        if (i != 0) {
            canvas.drawPath(path, c0375Ud.f1402a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            C0447Yd.f fVar = this.f1311b[i2];
            int i3 = this.f1310a.f1347n;
            Matrix matrix = C0447Yd.f.f1684b;
            fVar.mo1074a(matrix, c0375Ud, i3, canvas);
            this.f1312c[i2].mo1074a(matrix, c0375Ud, this.f1310a.f1347n, canvas);
        }
        if (this.f1332w) {
            double d = 0;
            int iSin = (int) (Math.sin(Math.toRadians(d)) * ((double) this.f1310a.f1348o));
            int iCos = (int) (Math.cos(Math.toRadians(d)) * ((double) this.f1310a.f1348o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, f1309x);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f1323n;
        paint.setColorFilter(this.f1328s);
        int alpha = paint.getAlpha();
        int i = this.f1310a.f1344k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f1324o;
        paint2.setColorFilter(this.f1329t);
        paint2.setStrokeWidth(this.f1310a.f1343j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f1310a.f1344k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.f1314e;
        Path path = this.f1316g;
        if (z) {
            float f = -(m964h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C0393Vd c0393Vd = this.f1310a.f1334a;
            C0393Vd.a aVarM1026e = c0393Vd.m1026e();
            InterfaceC0892w4 c0717n0 = c0393Vd.f1486e;
            if (!(c0717n0 instanceof C0428Xc)) {
                c0717n0 = new C0717n0(f, c0717n0);
            }
            aVarM1026e.f1498e = c0717n0;
            InterfaceC0892w4 c0717n02 = c0393Vd.f1487f;
            if (!(c0717n02 instanceof C0428Xc)) {
                c0717n02 = new C0717n0(f, c0717n02);
            }
            aVarM1026e.f1499f = c0717n02;
            InterfaceC0892w4 c0717n03 = c0393Vd.f1489h;
            if (!(c0717n03 instanceof C0428Xc)) {
                c0717n03 = new C0717n0(f, c0717n03);
            }
            aVarM1026e.f1501h = c0717n03;
            InterfaceC0892w4 c0717n04 = c0393Vd.f1488g;
            if (!(c0717n04 instanceof C0428Xc)) {
                c0717n04 = new C0717n0(f, c0717n04);
            }
            aVarM1026e.f1500g = c0717n04;
            C0393Vd c0393VdM1028a = aVarM1026e.m1028a();
            this.f1322m = c0393VdM1028a;
            float f2 = this.f1310a.f1342i;
            RectF rectF = this.f1319j;
            rectF.set(m963g());
            float strokeWidth = m964h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f1327r.m1055a(c0393VdM1028a, f2, rectF, null, this.f1317h);
            m959b(m963g(), path);
            this.f1314e = false;
        }
        b bVar = this.f1310a;
        bVar.getClass();
        if (bVar.f1347n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f1310a.f1334a.m1025d(m963g()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * ((double) this.f1310a.f1348o)), (int) (Math.cos(Math.toRadians(d)) * ((double) this.f1310a.f1348o)));
                if (this.f1332w) {
                    RectF rectF2 = this.f1331v;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f1310a.f1347n * 2) + ((int) rectF2.width()) + iWidth, (this.f1310a.f1347n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f3 = (getBounds().left - this.f1310a.f1347n) - iWidth;
                    float f4 = (getBounds().top - this.f1310a.f1347n) - iHeight;
                    canvas2.translate(-f3, -f4);
                    m961d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    m961d(canvas);
                    canvas.restore();
                }
            }
        }
        b bVar2 = this.f1310a;
        Paint.Style style = bVar2.f1349p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m962e(canvas, paint, path, bVar2.f1334a, m963g());
        }
        if (m964h()) {
            mo260f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* JADX INFO: renamed from: e */
    public final void m962e(Canvas canvas, Paint paint, Path path, C0393Vd c0393Vd, RectF rectF) {
        if (!c0393Vd.m1025d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fMo1073a = c0393Vd.f1487f.mo1073a(rectF) * this.f1310a.f1342i;
            canvas.drawRoundRect(rectF, fMo1073a, fMo1073a, paint);
        }
    }

    /* JADX INFO: renamed from: f */
    public void mo260f(Canvas canvas) {
        Paint paint = this.f1324o;
        Path path = this.f1317h;
        C0393Vd c0393Vd = this.f1322m;
        RectF rectF = this.f1319j;
        rectF.set(m963g());
        float strokeWidth = m964h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m962e(canvas, paint, path, c0393Vd, rectF);
    }

    /* JADX INFO: renamed from: g */
    public final RectF m963g() {
        RectF rectF = this.f1318i;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1310a.f1344k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1310a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        this.f1310a.getClass();
        if (this.f1310a.f1334a.m1025d(m963g())) {
            outline.setRoundRect(getBounds(), this.f1310a.f1334a.f1486e.mo1073a(m963g()) * this.f1310a.f1342i);
            return;
        }
        RectF rectFM963g = m963g();
        Path path = this.f1316g;
        m959b(rectFM963g, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            C0931y5.b.m2218a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                C0931y5.a.m2217a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            C0931y5.a.m2217a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1310a.f1340g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1320k;
        region.set(bounds);
        RectF rectFM963g = m963g();
        Path path = this.f1316g;
        m959b(rectFM963g, path);
        Region region2 = this.f1321l;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m964h() {
        Paint.Style style = this.f1310a.f1349p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1324o.getStrokeWidth() > 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public final void m965i(Context context) {
        this.f1310a.f1335b = new C0170J5(context);
        m970n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1314e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f1310a.f1338e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f1310a.getClass();
        ColorStateList colorStateList2 = this.f1310a.f1337d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f1310a.f1336c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    /* JADX INFO: renamed from: j */
    public final void m966j(float f) {
        b bVar = this.f1310a;
        if (bVar.f1346m != f) {
            bVar.f1346m = f;
            m970n();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m967k(ColorStateList colorStateList) {
        b bVar = this.f1310a;
        if (bVar.f1336c != colorStateList) {
            bVar.f1336c = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m968l(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1310a.f1336c == null || color2 == (colorForState2 = this.f1310a.f1336c.getColorForState(iArr, (color2 = (paint2 = this.f1323n).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.f1310a.f1337d == null || color == (colorForState = this.f1310a.f1337d.getColorForState(iArr, (color = (paint = this.f1324o).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m969m() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1328s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1329t;
        b bVar = this.f1310a;
        ColorStateList colorStateList = bVar.f1338e;
        PorterDuff.Mode mode = bVar.f1339f;
        Paint paint = this.f1323n;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int iM960c = m960c(color);
            this.f1330u = iM960c;
            porterDuffColorFilter = iM960c != color ? new PorterDuffColorFilter(iM960c, PorterDuff.Mode.SRC_IN) : null;
        } else {
            int iM960c2 = m960c(colorStateList.getColorForState(getState(), 0));
            this.f1330u = iM960c2;
            porterDuffColorFilter = new PorterDuffColorFilter(iM960c2, mode);
        }
        this.f1328s = porterDuffColorFilter;
        this.f1310a.getClass();
        this.f1329t = null;
        this.f1310a.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f1328s) && Objects.equals(porterDuffColorFilter3, this.f1329t)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1310a = new b(this.f1310a);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m970n() {
        b bVar = this.f1310a;
        float f = bVar.f1346m + 0.0f;
        bVar.f1347n = (int) Math.ceil(0.75f * f);
        this.f1310a.f1348o = (int) Math.ceil(f * 0.25f);
        m969m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1314e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = m968l(iArr) || m969m();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        b bVar = this.f1310a;
        if (bVar.f1344k != i) {
            bVar.f1344k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1310a.getClass();
        super.invalidateSelf();
    }

    @Override // p000a.InterfaceC0465Zd
    public final void setShapeAppearanceModel(C0393Vd c0393Vd) {
        this.f1310a.f1334a = c0393Vd;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1310a.f1338e = colorStateList;
        m969m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        b bVar = this.f1310a;
        if (bVar.f1339f != mode) {
            bVar.f1339f = mode;
            m969m();
            super.invalidateSelf();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C0354Ta(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C0393Vd.m1023b(context, attributeSet, i, i2).m1028a());
    }

    public C0354Ta(C0393Vd c0393Vd) {
        this(new b(c0393Vd));
    }

    public C0354Ta(b bVar) {
        C0411Wd c0411Wd;
        this.f1311b = new C0447Yd.f[4];
        this.f1312c = new C0447Yd.f[4];
        this.f1313d = new BitSet(8);
        this.f1315f = new Matrix();
        this.f1316g = new Path();
        this.f1317h = new Path();
        this.f1318i = new RectF();
        this.f1319j = new RectF();
        this.f1320k = new Region();
        this.f1321l = new Region();
        Paint paint = new Paint(1);
        this.f1323n = paint;
        Paint paint2 = new Paint(1);
        this.f1324o = paint2;
        this.f1325p = new C0375Ud();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0411Wd = C0411Wd.a.f1572a;
        } else {
            c0411Wd = new C0411Wd();
        }
        this.f1327r = c0411Wd;
        this.f1331v = new RectF();
        this.f1332w = true;
        this.f1310a = bVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m969m();
        m968l(getState());
        this.f1326q = new a();
    }

    /* JADX INFO: renamed from: a.Ta$b */
    public static class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public C0393Vd f1334a;

        /* JADX INFO: renamed from: b */
        public C0170J5 f1335b;

        /* JADX INFO: renamed from: c */
        public ColorStateList f1336c;

        /* JADX INFO: renamed from: d */
        public ColorStateList f1337d;

        /* JADX INFO: renamed from: e */
        public ColorStateList f1338e;

        /* JADX INFO: renamed from: f */
        public PorterDuff.Mode f1339f;

        /* JADX INFO: renamed from: g */
        public Rect f1340g;

        /* JADX INFO: renamed from: h */
        public final float f1341h;

        /* JADX INFO: renamed from: i */
        public float f1342i;

        /* JADX INFO: renamed from: j */
        public float f1343j;

        /* JADX INFO: renamed from: k */
        public int f1344k;

        /* JADX INFO: renamed from: l */
        public float f1345l;

        /* JADX INFO: renamed from: m */
        public float f1346m;

        /* JADX INFO: renamed from: n */
        public int f1347n;

        /* JADX INFO: renamed from: o */
        public int f1348o;

        /* JADX INFO: renamed from: p */
        public final Paint.Style f1349p;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public b(C0393Vd c0393Vd) {
            this.f1336c = null;
            this.f1337d = null;
            this.f1338e = null;
            this.f1339f = PorterDuff.Mode.SRC_IN;
            this.f1340g = null;
            this.f1341h = 1.0f;
            this.f1342i = 1.0f;
            this.f1344k = 255;
            this.f1345l = 0.0f;
            this.f1346m = 0.0f;
            this.f1347n = 0;
            this.f1348o = 0;
            this.f1349p = Paint.Style.FILL_AND_STROKE;
            this.f1334a = c0393Vd;
            this.f1335b = null;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C0354Ta c0354Ta = new C0354Ta(this);
            c0354Ta.f1314e = true;
            return c0354Ta;
        }

        public b(b bVar) {
            this.f1336c = null;
            this.f1337d = null;
            this.f1338e = null;
            this.f1339f = PorterDuff.Mode.SRC_IN;
            this.f1340g = null;
            this.f1341h = 1.0f;
            this.f1342i = 1.0f;
            this.f1344k = 255;
            this.f1345l = 0.0f;
            this.f1346m = 0.0f;
            this.f1347n = 0;
            this.f1348o = 0;
            this.f1349p = Paint.Style.FILL_AND_STROKE;
            this.f1334a = bVar.f1334a;
            this.f1335b = bVar.f1335b;
            this.f1343j = bVar.f1343j;
            this.f1336c = bVar.f1336c;
            this.f1337d = bVar.f1337d;
            this.f1339f = bVar.f1339f;
            this.f1338e = bVar.f1338e;
            this.f1344k = bVar.f1344k;
            this.f1341h = bVar.f1341h;
            this.f1348o = bVar.f1348o;
            this.f1342i = bVar.f1342i;
            this.f1345l = bVar.f1345l;
            this.f1346m = bVar.f1346m;
            this.f1347n = bVar.f1347n;
            this.f1349p = bVar.f1349p;
            if (bVar.f1340g != null) {
                this.f1340g = new Rect(bVar.f1340g);
            }
        }
    }
}
