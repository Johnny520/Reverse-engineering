package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public class eu extends Drawable implements q30 {
    public static final Paint w = null;
    public du a;
    public final o30[] b;
    public final o30[] c;
    public final BitSet d;
    public boolean e;
    public final Matrix f;
    public final Path g;
    public final Path h;
    public final RectF i;
    public final RectF j;
    public final Region k;
    public final Region l;
    public f30 m;
    public final Paint n;
    public final Paint o;
    public final d30 p;
    public final l0 q;
    public final h30 r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public final RectF u;
    public final boolean v;

    static {
        Paint r0 = new Paint(1);
        w = r0;
        r0.setColor(-1);
        r0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public eu() {
        this(new f30());
    }

    public final void a(RectF r8, Path r9) {
        du r0 = this.a;
        f30 r2 = r0.a;
        float r3 = r0.i;
        l0 r5 = this.q;
        this.r.a(r2, r3, r8, r5, r9);
        if (this.a.h == 1.0f) goto L5;
        Matrix r82 = this.f;
        r82.reset();
        float r92 = this.a.h;
        r82.setScale(r92, r92, r8.width() / 2.0f, r8.height() / 2.0f);
        r9.transform(r82);
    L5:
        r9.computeBounds(this.u, true);
    }

    public final int b(int r7) {
        du r0 = this.a;
        float r1 = (r0.m + 0.0f) + r0.l;
        xh r02 = r0.b;
        if (r02 != null) goto L5;
        return r7;
    L5:
        if (r02.a == true) goto L7;
        return r7;
    L7:
        if (ib.d(r7, 255) == r02.d) goto L9;
        return r7;
    L9:
        if (r02.e > 0.0f) goto L11;
    L14:
        float r12 = 0.0f;
    L15:
        int r4 = Color.alpha(r7);
        int r72 = zt.E(r12, ib.d(r7, 255), r02.b);
        if (r12 <= 0.0f) goto L21;
        int r03 = r02.c;
        if (r03 == 0) goto L21;
        r72 = ib.b(ib.d(r03, xh.f), r72);
    L21:
        return ib.d(r72, r4);
    L11:
        if (r1 <= 0.0f) goto L14;
        r12 = Math.min(((((float) Math.log1p(r1 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        goto L15
    }

    public final void c(Canvas r9) {
        if (this.d.cardinality() <= 0) goto L5;
        Log.w("eu", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
    L5:
        int r0 = this.a.o;
        Path r1 = this.g;
        d30 r2 = this.p;
        if (r0 == 0) goto L8;
        r9.drawPath(r1, r2.a);
    L8:
        int r3 = 0;
    L10:
        if (r3 >= 4) goto L13;
        o30 r4 = this.b[r3];
        int r5 = this.a.n;
        Matrix r6 = o30.b;
        r4.a(r6, r2, r5, r9);
        this.c[r3].a(r6, r2, this.a.n, r9);
        r3 = r3 + 1;
        goto L10
    L13:
        if (this.v == false) goto L17;
        double r42 = 0;
        int r02 = (int) (Math.sin(Math.toRadians(r42)) * this.a.o);
        int r22 = (int) (Math.cos(Math.toRadians(r42)) * this.a.o);
        r9.translate(-r02, -r22);
        r9.drawPath(r1, w);
        r9.translate(r02, r22);
        return;
    }

    public final void d(Canvas r2, Paint r3, Path r4, f30 r5, RectF r6) {
        if (r5.d(r6) == false) goto L6;
        float r42 = r5.f.a(r6) * this.a.i;
        r2.drawRoundRect(r6, r42, r42, r3);
        return;
    L6:
        r2.drawPath(r4, r3);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r20) {
        PorterDuffColorFilter r2 = this.s;
        Paint r3 = this.n;
        r3.setColorFilter(r2);
        int r6 = r3.getAlpha();
        int r22 = this.a.k;
        r3.setAlpha(((r22 + (r22 >>> 7)) * r6) >>> 8);
        PorterDuffColorFilter r23 = this.t;
        Paint r7 = this.o;
        r7.setColorFilter(r23);
        r7.setStrokeWidth(this.a.j);
        int r8 = r7.getAlpha();
        int r24 = this.a.k;
        r7.setAlpha(((r24 + (r24 >>> 7)) * r8) >>> 8);
        boolean r25 = this.e;
        Path r32 = this.g;
        if (r25 == false) goto L28;
        float r9 = 0.0f;
        if (g() == false) goto L7;
        float r5 = r7.getStrokeWidth() / 2.0f;
    L8:
        float r52 = -r5;
        f30 r11 = this.a.a;
        e30 r12 = r11.e();
        de r13 = r11.e;
        if ((r13 instanceof l00) == true) goto L12;
        r13 = new z1(r52, r13);
    L12:
        r12.e = r13;
        de r132 = r11.f;
        if ((r132 instanceof l00) == true) goto L16;
        r132 = new z1(r52, r132);
    L16:
        r12.f = r132;
        de r133 = r11.h;
        if ((r133 instanceof l00) == true) goto L20;
        r133 = new z1(r52, r133);
    L20:
        r12.h = r133;
        de r112 = r11.g;
        if ((r112 instanceof l00) == true) goto L24;
        r112 = new z1(r52, r112);
    L24:
        r12.g = r112;
        f30 r14 = r12.a();
        this.m = r14;
        float r15 = this.a.i;
        RectF r53 = f();
        RectF r113 = this.j;
        r113.set(r53);
        if (g() == false) goto L27;
        r9 = r7.getStrokeWidth() / 2.0f;
    L27:
        r113.inset(r9, r9);
        this.r.a(r14, r15, r113, null, this.h);
        a(f(), r32);
        this.e = false;
        goto L28
    L7:
        r5 = 0.0f;
    L28:
        du r54 = this.a;
        r54.getClass();
        if (r54.n <= 0) goto L45;
        int r55 = Build.VERSION.SDK_INT;
        if (this.a.a.d(f()) == true) goto L45;
        if (r32.isConvex() == true) goto L45;
        if (r55 >= 29) goto L45;
        r20.save();
        int r92 = (int) (Math.sin(Math.toRadians(0)) * this.a.o);
        double r10 = this.a.o;
        r20.translate(r92, (int) (Math.cos(Math.toRadians(r4)) * r10));
        if (this.v == true) goto L39;
        c(r20);
        r20.restore();
        goto L45
    L39:
        RectF r4 = this.u;
        int r56 = (int) (r4.width() - getBounds().width());
        int r93 = (int) (r4.height() - getBounds().height());
        if (r56 < 0) goto L44;
        if (r93 < 0) goto L44;
        Bitmap r42 = Bitmap.createBitmap(((this.a.n * 2) + ((int) r4.width())) + r56, ((this.a.n * 2) + ((int) r4.height())) + r93, Bitmap.Config.ARGB_8888);
        Canvas r102 = new Canvas(r42);
        float r57 = (getBounds().left - this.a.n) - r56;
        float r94 = (getBounds().top - this.a.n) - r93;
        r102.translate(-r57, -r94);
        c(r102);
        r20.drawBitmap(r42, r57, r94, null);
        r42.recycle();
        r20.restore();
    L44:
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    L45:
        du r43 = this.a;
        Paint.Style r58 = r43.p;
        if (r58 != Paint.Style.FILL_AND_STROKE) goto L48;
    L49:
        d(r20, r3, r32, r43.a, f());
    L51:
        if (g() == false) goto L53;
        e(r20);
    L53:
        r3.setAlpha(r6);
        r7.setAlpha(r8);
        return;
    L48:
        if (r58 != Paint.Style.FILL) goto L51;
        goto L49
    }

    public void e(Canvas r7) {
        f30 r4 = this.m;
        RectF r0 = f();
        RectF r5 = this.j;
        r5.set(r0);
        boolean r02 = g();
        Paint r2 = this.o;
        if (r02 == false) goto L5;
        float r03 = r2.getStrokeWidth() / 2.0f;
    L6:
        r5.inset(r03, r03);
        d(r7, r2, this.h, r4, r5);
        return;
    L5:
        r03 = 0.0f;
        goto L6
    }

    public final RectF f() {
        Rect r0 = getBounds();
        RectF r1 = this.i;
        r1.set(r0);
        return r1;
    }

    public final boolean g() {
        Paint.Style r0 = this.a.p;
        if (r0 == Paint.Style.FILL_AND_STROKE) goto L7;
        if (r0 == Paint.Style.STROKE) goto L7;
        return false;
    L7:
        if (this.o.getStrokeWidth() <= 0.0f) goto L12;
        return true;
    L12:
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline r4) {
        this.a.getClass();
        if (this.a.a.d(f()) == false) goto L6;
        float r0 = this.a.a.e.a(f()) * this.a.i;
        r4.setRoundRect(getBounds(), r0);
        return;
    L6:
        RectF r02 = f();
        Path r1 = this.g;
        a(r02, r1);
        int r03 = Build.VERSION.SDK_INT;
        if (r03 < 30) goto L11;
        d0.n(r4, r1);
        return;
    L11:
        if (r03 < 29) goto L15;
        r4.setConvexPath(r1);     // Catch: IllegalArgumentException -> L18
        return;
    L21:
        return;
    L15:
        if (r1.isConvex() == false) goto L22;
        r4.setConvexPath(r1);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r2) {
        Rect r0 = this.a.g;
        if (r0 == null) goto L7;
        r2.set(r0);
        return true;
    L7:
        return super.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect r0 = getBounds();
        Region r1 = this.k;
        r1.set(r0);
        RectF r02 = f();
        Path r2 = this.g;
        a(r02, r2);
        Region r03 = this.l;
        r03.setPath(r2, r1);
        r1.op(r03, Region.Op.DIFFERENCE);
        return r1;
    }

    public final void h(Context r3) {
        du r0 = this.a;
        r0.b = new xh(r3);
        m();
    }

    public final void i(float r3) {
        du r0 = this.a;
        if (r0.m == r3) goto L6;
        r0.m = r3;
        m();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful() == true) goto L19;
        ColorStateList r0 = this.a.e;
        if (r0 != null) goto L7;
    L8:
        this.a.getClass();
        ColorStateList r02 = this.a.d;
        if (r02 != null) goto L11;
    L12:
        ColorStateList r03 = this.a.c;
        if (r03 != null) goto L15;
        return false;
    L15:
        if (r03.isStateful() == true) goto L24;
        return false;
    L24:
        return true;
    L11:
        if (r02.isStateful() == false) goto L12;
        return true;
    L7:
        if (r0.isStateful() == false) goto L8;
        return true;
    L19:
        return true;
    }

    public final void j(ColorStateList r3) {
        du r0 = this.a;
        if (r0.c == r3) goto L6;
        r0.c = r3;
        onStateChange(getState());
        return;
    }

    public final boolean k(int[] r6) {
        if (this.a.c == null) goto L7;
        Paint r0 = this.n;
        int r2 = r0.getColor();
        int r3 = this.a.c.getColorForState(r6, r2);
        if (r2 == r3) goto L7;
        r0.setColor(r3);
        boolean r02 = true;
    L9:
        if (this.a.d == null) goto L14;
        Paint r22 = this.o;
        int r32 = r22.getColor();
        int r62 = this.a.d.getColorForState(r6, r32);
        if (r32 == r62) goto L14;
        r22.setColor(r62);
        return true;
    L14:
        return r02;
    L7:
        r02 = false;
        goto L9
    }

    public final boolean l() {
        PorterDuffColorFilter r0 = this.s;
        PorterDuffColorFilter r1 = this.t;
        du r2 = this.a;
        ColorStateList r3 = r2.e;
        PorterDuff.Mode r22 = r2.f;
        if (r3 == null) goto L7;
        if (r22 == null) goto L7;
        PorterDuffColorFilter r5 = new PorterDuffColorFilter(b(r3.getColorForState(getState(), 0)), r22);
    L11:
        this.s = r5;
        this.a.getClass();
        this.t = null;
        this.a.getClass();
        if (pw.a(r0, this.s) == true) goto L14;
    L18:
        return true;
    L14:
        if (pw.a(r1, this.t) == false) goto L18;
        return false;
    L7:
        int r23 = this.n.getColor();
        int r32 = b(r23);
        if (r32 == r23) goto L10;
        r5 = new PorterDuffColorFilter(r32, PorterDuff.Mode.SRC_IN);
        goto L11
    L10:
        r5 = null;
        goto L11
    }

    public final void m() {
        du r0 = this.a;
        float r1 = r0.m + 0.0f;
        r0.n = (int) Math.ceil(0.75f * r1);
        this.a.o = (int) Math.ceil(r1 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new du(this.a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        this.e = true;
        super.onBoundsChange(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r2) {
        boolean r22 = k(r2);
        boolean r0 = l();
        if (r22 == true) goto L7;
        if (r0 == true) goto L7;
        boolean r23 = false;
    L8:
        if (r23 == false) goto L10;
        invalidateSelf();
    L10:
        return r23;
    L7:
        r23 = true;
        goto L8
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r3) {
        du r0 = this.a;
        if (r0.k == r3) goto L6;
        r0.k = r3;
        super.invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r1) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.q30
    public final void setShapeAppearanceModel(f30 r2) {
        this.a.a = r2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r1) {
        setTintList(ColorStateList.valueOf(r1));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList r2) {
        this.a.e = r2;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode r3) {
        du r0 = this.a;
        if (r0.f == r3) goto L6;
        r0.f = r3;
        l();
        super.invalidateSelf();
        return;
    }

    public eu(Context r1, AttributeSet r2, int r3, int r4) {
        this(f30.b(r1, r2, r3, r4).a());
    }

    public eu(f30 r2) {
        this(new du(r2));
    }

    public eu(du r6) {
        this.b = new o30[4];
        this.c = new o30[4];
        this.d = new BitSet(8);
        this.f = new Matrix();
        this.g = new Path();
        this.h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        Paint r0 = new Paint(1);
        this.n = r0;
        Paint r2 = new Paint(1);
        this.o = r2;
        this.p = new d30();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L5;
        h30 r3 = g30.a;
    L6:
        this.r = r3;
        this.u = new RectF();
        this.v = true;
        this.a = r6;
        r2.setStyle(Paint.Style.STROKE);
        r0.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.q = new l0(20, this);
        return;
    L5:
        r3 = new h30();
        goto L6
    }
}
