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
    public static final Paint f3234E = null;

    /* JADX INFO: renamed from: F */
    public static final C0978Wq[] f3235F = null;

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
        Paint r0 = new Paint(1);
        f3234E = r0;
        r0.setColor(-1);
        r0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        f3235F = new C0978Wq[4];
        int r02 = 0;
    L3:
        C0978Wq[] r1 = f3235F;
        if (r02 >= r1.length) goto L6;
        r1[r02] = new C0978Wq(r02);
        r02 = r02 + 1;
        goto L3
    }

    public C1021Xq() {
        this(new C0728Qx());
    }

    /* JADX INFO: renamed from: b */
    public static float m1915b(RectF r3, C0728Qx r4, float[] r5) {
        if (r5 == null) goto L4;
        int r1 = 1;
        if (r5.length <= 1) goto L18;
        float r32 = r5[0];
    L12:
        if (r1 >= r5.length) goto L18;
        if (r5[r1] != r32) goto L26;
        r1 = r1 + 1;
        goto L12
    L26:
        return -1.0f;
    L18:
        if (r4.m1514d() == true) goto L20;
        return -1.0f;
    L20:
        return r5[0];
    L4:
        if (r4.m1515e(r3) == true) goto L6;
        return -1.0f;
    L6:
        return r4.f2328e.mo1563a(r3);
    }

    /* JADX INFO: renamed from: a */
    public final void m1916a(RectF r9, Path r10) {
        C0935Vq r0 = this.f3241b;
        C0728Qx r2 = r0.f2902a;
        float[] r3 = this.f3237B;
        float r4 = r0.f2911j;
        C0892Uq r6 = this.f3257r;
        this.f3258s.m1615a(r2, r3, r4, r9, r6, r10);
        if (this.f3241b.f2910i == 1.0f) goto L5;
        Matrix r92 = this.f3247h;
        r92.reset();
        float r102 = this.f3241b.f2910i;
        r92.setScale(r102, r102, r9.width() / 2.0f, r9.height() / 2.0f);
        r10.transform(r92);
    L5:
        r10.computeBounds(this.f3261v, true);
    }

    /* JADX INFO: renamed from: c */
    public final int m1917c(int r7) {
        C0935Vq r0 = this.f3241b;
        float r1 = (r0.f2915n + 0.0f) + r0.f2914m;
        C2101jf r02 = r0.f2904c;
        if (r02 != null) goto L5;
        return r7;
    L5:
        if (r02.f7390a == true) goto L7;
        return r7;
    L7:
        if (AbstractC2797za.m5367e(r7, 255) == r02.f7393d) goto L9;
        return r7;
    L9:
        if (r02.f7394e > 0.0f) goto L11;
    L14:
        float r12 = 0.0f;
    L15:
        int r4 = Color.alpha(r7);
        int r72 = AbstractC0295Gu.m629v(AbstractC2797za.m5367e(r7, 255), r02.f7391b, r12);
        if (r12 <= 0.0f) goto L21;
        int r03 = r02.f7392c;
        if (r03 == 0) goto L21;
        r72 = AbstractC2797za.m5365c(AbstractC2797za.m5367e(r03, C2101jf.f7389f), r72);
    L21:
        return AbstractC2797za.m5367e(r72, r4);
    L11:
        if (r1 <= 0.0f) goto L14;
        r12 = Math.min(((((float) Math.log1p(r1 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        goto L15
    }

    /* JADX INFO: renamed from: d */
    public final void m1918d(Canvas r9) {
        this.f3244e.cardinality();
        int r0 = this.f3241b.f2917p;
        Path r1 = this.f3248i;
        C0642Ox r2 = this.f3256q;
        if (r0 == 0) goto L5;
        r9.drawPath(r1, r2.f2054a);
    L5:
        int r3 = 0;
    L7:
        if (r3 >= 4) goto L10;
        AbstractC1114Zx r4 = this.f3242c[r3];
        int r5 = this.f3241b.f2916o;
        Matrix r6 = AbstractC1114Zx.f3514b;
        r4.mo1690a(r6, r2, r5, r9);
        this.f3243d[r3].mo1690a(r6, r2, this.f3241b.f2916o, r9);
        r3 = r3 + 1;
        goto L7
    L10:
        if (this.f3262w == false) goto L14;
        double r42 = 0;
        int r02 = (int) (Math.sin(Math.toRadians(r42)) * this.f3241b.f2917p);
        int r22 = (int) (Math.cos(Math.toRadians(r42)) * this.f3241b.f2917p);
        r9.translate(-r02, -r22);
        r9.drawPath(r1, f3234E);
        r9.translate(r02, r22);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r20) {
        PorterDuffColorFilter r2 = this.f3259t;
        Paint r3 = this.f3254o;
        r3.setColorFilter(r2);
        int r7 = r3.getAlpha();
        int r22 = this.f3241b.f2913l;
        r3.setAlpha(((r22 + (r22 >>> 7)) * r7) >>> 8);
        PorterDuffColorFilter r23 = this.f3260u;
        Paint r8 = this.f3255p;
        r8.setColorFilter(r23);
        r8.setStrokeWidth(this.f3241b.f2912k);
        int r9 = r8.getAlpha();
        int r24 = this.f3241b.f2913l;
        r8.setAlpha(((r24 + (r24 >>> 7)) * r9) >>> 8);
        Paint.Style r25 = this.f3241b.f2918q;
        if (r25 != Paint.Style.FILL_AND_STROKE) goto L5;
    L8:
        boolean r26 = this.f3245f;
        Paint r27 = r3;
        Path r32 = this.f3248i;
        if (r26 == false) goto L11;
        m1916a(m1921g(), r32);
        this.f3245f = false;
    L11:
        C0935Vq r4 = this.f3241b;
        r4.getClass();
        if (r4.f2916o > 0) goto L14;
    L43:
        m1919e(r20, r27, r32, this.f3241b.f2902a, this.f3237B, m1921g());
    L45:
        if (m1924j() == true) goto L47;
    L60:
        r27.setAlpha(r7);
        r8.setAlpha(r9);
        return;
    L47:
        if (this.f3246g == false) goto L59;
        C0728Qx r1 = this.f3241b.f2902a;
        C0685Px r33 = r1.m1516f();
        InterfaceC1006Xb r42 = r1.f2328e;
        C0892Uq r5 = this.f3240a;
        r33.f2196e = r5.m1744a(r42);
        r33.f2197f = r5.m1744a(r1.f2329f);
        r33.f2199h = r5.m1744a(r1.f2331h);
        r33.f2198g = r5.m1744a(r1.f2330g);
        this.f3264y = r33.m1383a();
        float[] r12 = this.f3237B;
        if (r12 != null) goto L52;
        this.f3238C = null;
    L58:
        C0728Qx r13 = this.f3264y;
        float[] r14 = this.f3238C;
        float r15 = this.f3241b.f2911j;
        RectF r16 = m1921g();
        RectF r34 = this.f3251l;
        r34.set(r16);
        float r17 = m1923i();
        r34.inset(r17, r17);
        this.f3258s.m1615a(r13, r14, r15, r34, null, this.f3249j);
        this.f3246g = false;
        goto L59
    L52:
        if (this.f3238C != null) goto L54;
        this.f3238C = new float[r12.length];
    L54:
        float r18 = m1923i();
        int r35 = 0;
    L55:
        float[] r43 = this.f3237B;
        if (r35 >= r43.length) goto L58;
        this.f3238C[r35] = Math.max(0.0f, r43[r35] - r18);
        r35 = r35 + 1;
    L59:
        mo1920f(r20);
        goto L60
    L14:
        if (r4.f2902a.m1515e(m1921g()) == true) goto L43;
        float[] r44 = this.f3237B;
        if (r44 == null) goto L31;
        int r6 = 1;
        if (r44.length <= 1) goto L28;
        float r52 = r44[0];
    L22:
        if (r6 >= r44.length) goto L28;
        if (r44[r6] != r52) goto L31;
        r6 = r6 + 1;
    L28:
        if (this.f3241b.f2902a.m1514d() == true) goto L43;
    L31:
        if (r32.isConvex() == true) goto L43;
        if (Build.VERSION.SDK_INT >= 29) goto L43;
        r20.save();
        int r45 = (int) (Math.sin(Math.toRadians(0)) * this.f3241b.f2917p);
        double r53 = this.f3241b.f2917p;
        r20.translate(r45, (int) (Math.cos(Math.toRadians(r12)) * r53));
        if (this.f3262w == true) goto L37;
        m1918d(r20);
        r20.restore();
        goto L43
    L37:
        RectF r46 = this.f3261v;
        int r54 = (int) (r46.width() - getBounds().width());
        int r62 = (int) (r46.height() - getBounds().height());
        if (r54 < 0) goto L42;
        if (r62 < 0) goto L42;
        Bitmap r47 = Bitmap.createBitmap(((this.f3241b.f2916o * 2) + ((int) r46.width())) + r54, ((this.f3241b.f2916o * 2) + ((int) r46.height())) + r62, Bitmap.Config.ARGB_8888);
        Canvas r122 = new Canvas(r47);
        float r55 = (getBounds().left - this.f3241b.f2916o) - r54;
        float r63 = (getBounds().top - this.f3241b.f2916o) - r62;
        r122.translate(-r55, -r63);
        m1918d(r122);
        r20.drawBitmap(r47, r55, r63, null);
        r47.recycle();
        r20.restore();
    L42:
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    L5:
        if (r25 == Paint.Style.FILL) goto L8;
        r27 = r3;
        goto L45
    }

    /* JADX INFO: renamed from: e */
    public final void m1919e(Canvas r1, Paint r2, Path r3, C0728Qx r4, float[] r5, RectF r6) {
        float r42 = m1915b(r6, r4, r5);
        if (r42 < 0.0f) goto L6;
        float r43 = r42 * this.f3241b.f2911j;
        r1.drawRoundRect(r6, r43, r43, r2);
        return;
    L6:
        r1.drawPath(r3, r2);
    }

    /* JADX INFO: renamed from: f */
    public void mo1920f(Canvas r8) {
        C0728Qx r4 = this.f3264y;
        float[] r5 = this.f3238C;
        RectF r0 = m1921g();
        RectF r6 = this.f3251l;
        r6.set(r0);
        float r02 = m1923i();
        r6.inset(r02, r02);
        m1919e(r8, this.f3255p, this.f3249j, r4, r5, r6);
    }

    /* JADX INFO: renamed from: g */
    public final RectF m1921g() {
        Rect r0 = getBounds();
        RectF r1 = this.f3250k;
        r1.set(r0);
        return r1;
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
    public void getOutline(Outline r4) {
        this.f3241b.getClass();
        RectF r0 = m1921g();
        if (r0.isEmpty() == true) goto L29;
        float r1 = m1915b(r0, this.f3241b.f2902a, this.f3237B);
        if (r1 < 0.0f) goto L9;
        r4.setRoundRect(getBounds(), r1 * this.f3241b.f2911j);
        return;
    L9:
        boolean r12 = this.f3245f;
        Path r2 = this.f3248i;
        if (r12 == false) goto L12;
        m1916a(r0, r2);
        this.f3245f = false;
    L12:
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 30) goto L17;
        AbstractC0064Be.m100a(r4, r2);
        return;
    L17:
        if (r02 < 29) goto L21;
        AbstractC0021Ae.m31a(r4, r2);     // Catch: IllegalArgumentException -> L24
        return;
    L27:
        return;
    L21:
        if (r2.isConvex() == false) goto L28;
        AbstractC0021Ae.m31a(r4, r2);
        return;
    L28:
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r2) {
        Rect r0 = this.f3241b.f2909h;
        if (r0 == null) goto L7;
        r2.set(r0);
        return true;
    L7:
        return super.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect r0 = getBounds();
        Region r1 = this.f3252m;
        r1.set(r0);
        RectF r02 = m1921g();
        Path r2 = this.f3248i;
        m1916a(r02, r2);
        Region r03 = this.f3253n;
        r03.setPath(r2, r1);
        r1.op(r03, Region.Op.DIFFERENCE);
        return r1;
    }

    /* JADX INFO: renamed from: h */
    public final float m1922h() {
        float[] r0 = this.f3237B;
        if (r0 != null) goto L5;
        RectF r02 = m1921g();
        C0728Qx r2 = this.f3241b.f2902a;
        C0813Sx r3 = this.f3258s;
        r3.getClass();
        float r22 = r2.f2328e.mo1563a(r02);
        C0728Qx r4 = this.f3241b.f2902a;
        r3.getClass();
        float r42 = r4.f2331h.mo1563a(r02) + r22;
        C0728Qx r23 = this.f3241b.f2902a;
        r3.getClass();
        float r43 = r42 - r23.f2330g.mo1563a(r02);
        C0728Qx r24 = this.f3241b.f2902a;
        r3.getClass();
        return (r43 - r24.f2329f.mo1563a(r02)) / 2.0f;
    L5:
        return (((r0[3] + r0[2]) - r0[1]) - r0[0]) / 2.0f;
    }

    /* JADX INFO: renamed from: i */
    public final float m1923i() {
        if (m1924j() == true) goto L5;
        return 0.0f;
    L5:
        return this.f3255p.getStrokeWidth() / 2.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f3245f = true;
        this.f3246g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful() == true) goto L23;
        ColorStateList r0 = this.f3241b.f2907f;
        if (r0 != null) goto L7;
    L8:
        this.f3241b.getClass();
        ColorStateList r02 = this.f3241b.f2906e;
        if (r02 != null) goto L11;
    L12:
        ColorStateList r03 = this.f3241b.f2905d;
        if (r03 != null) goto L15;
    L16:
        C1301cz r04 = this.f3241b.f2903b;
        if (r04 != null) goto L19;
        return false;
    L19:
        if (r04.m2567d() == true) goto L29;
        return false;
    L29:
        return true;
    L15:
        if (r03.isStateful() == false) goto L16;
        return true;
    L11:
        if (r02.isStateful() == false) goto L12;
        return true;
    L7:
        if (r0.isStateful() == false) goto L8;
        return true;
    L23:
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1924j() {
        Paint.Style r0 = this.f3241b.f2918q;
        if (r0 == Paint.Style.FILL_AND_STROKE) goto L7;
        if (r0 == Paint.Style.STROKE) goto L7;
        return false;
    L7:
        if (this.f3255p.getStrokeWidth() <= 0.0f) goto L12;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m1925k(Context r3) {
        C0935Vq r0 = this.f3241b;
        r0.f2904c = new C2101jf(r3);
        m1933s();
    }

    /* JADX INFO: renamed from: l */
    public final void m1926l(C0686Py r9) {
        if (this.f3265z == r9) goto L24;
        this.f3265z = r9;
        int r1 = 0;
    L5:
        C0643Oy[] r2 = this.f3236A;
        if (r1 >= r2.length) goto L19;
        if (r2[r1] != null) goto L10;
        r2[r1] = new C0643Oy(this, f3235F[r1]);
    L10:
        C0643Oy r22 = r2[r1];
        C0686Py r3 = new C0686Py();
        float r4 = (float) r9.f2205b;
        if (r4 < 0.0f) goto L18;
        r3.f2205b = r4;
        r3.f2206c = false;
        double r6 = r9.f2204a;
        float r42 = (float) (r6 * r6);
        if (r42 <= 0.0f) goto L16;
        r3.f2204a = Math.sqrt(r42);
        r3.f2206c = false;
        r22.f2077j = r3;
        r1 = r1 + 1;
        goto L5
    L16:
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    L18:
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    L19:
        m1931q(getState(), true);
        invalidateSelf();
        return;
    }

    /* JADX INFO: renamed from: m */
    public final void m1927m(float r3) {
        C0935Vq r0 = this.f3241b;
        if (r0.f2915n == r3) goto L6;
        r0.f2915n = r3;
        m1933s();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f3241b = new C0935Vq(this.f3241b);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m1928n(ColorStateList r3) {
        C0935Vq r0 = this.f3241b;
        if (r0.f2905d == r3) goto L6;
        r0.f2905d = r3;
        onStateChange(getState());
        return;
    }

    /* JADX INFO: renamed from: o */
    public final void m1929o(C1301cz r3) {
        C0935Vq r0 = this.f3241b;
        if (r0.f2903b == r3) goto L6;
        r0.f2903b = r3;
        m1931q(getState(), true);
        invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r3) {
        this.f3245f = true;
        this.f3246g = true;
        super.onBoundsChange(r3);
        if (this.f3241b.f2903b != null) goto L5;
    L7:
        this.f3263x = r3.isEmpty();
        return;
    L5:
        if (r3.isEmpty() == true) goto L7;
        m1931q(getState(), this.f3263x);
        goto L7
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r3) {
        boolean r1 = false;
        if (this.f3241b.f2903b == null) goto L5;
        m1931q(r3, false);
    L5:
        boolean r32 = m1930p(r3);
        boolean r0 = m1932r();
        if (r32 == true) goto L8;
        if (r0 == true) goto L8;
    L9:
        if (r1 == false) goto L11;
        invalidateSelf();
    L11:
        return r1;
    L8:
        r1 = true;
        goto L9
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1930p(int[] r6) {
        if (this.f3241b.f2905d == null) goto L7;
        Paint r0 = this.f3254o;
        int r2 = r0.getColor();
        int r3 = this.f3241b.f2905d.getColorForState(r6, r2);
        if (r2 == r3) goto L7;
        r0.setColor(r3);
        boolean r02 = true;
    L9:
        if (this.f3241b.f2906e == null) goto L14;
        Paint r22 = this.f3255p;
        int r32 = r22.getColor();
        int r62 = this.f3241b.f2906e.getColorForState(r6, r32);
        if (r32 == r62) goto L14;
        r22.setColor(r62);
        return true;
    L14:
        return r02;
    L7:
        r02 = false;
        goto L9
    }

    /* JADX INFO: renamed from: q */
    public final void m1931q(int[] r17, boolean r18) {
        RectF r2 = m1921g();
        if (this.f3241b.f2903b != null) goto L5;
        return;
    L5:
        if (r2.isEmpty() == false) goto L8;
        return;
    L8:
        if (this.f3265z != null) goto L10;
        boolean r3 = true;
    L11:
        boolean r32 = r18 | r3;
        if (this.f3237B != null) goto L14;
        this.f3237B = new float[4];
    L14:
        C1301cz r6 = this.f3241b.f2903b;
        C0728Qx[] r8 = r6.f4739d;
        int r9 = r6.f4736a;
        int[][] r10 = r6.f4738c;
        C1196az r11 = r6.f4743h;
        C1196az r12 = r6.f4742g;
        C1196az r13 = r6.f4741f;
        C1196az r62 = r6.f4740e;
        int r14 = 0;
    L15:
        if (r14 >= r9) goto L20;
        if (StateSet.stateSetMatches(r10[r14], r17) == true) goto L21;
        r14 = r14 + 1;
    L21:
        if (r14 >= 0) goto L30;
        int[] r4 = StateSet.WILD_CARD;
        int r142 = 0;
    L23:
        if (r142 >= r9) goto L28;
        if (StateSet.stateSetMatches(r10[r142], r4) == true) goto L26;
        r142 = r142 + 1;
        goto L23
    L26:
        int r15 = r142;
    L29:
        r14 = r15;
        goto L30
    L28:
        r15 = -1;
    L30:
        if (r62 != null) goto L35;
        if (r13 != null) goto L35;
        if (r12 != null) goto L35;
        if (r11 != null) goto L35;
        C0728Qx r1 = r8[r14];
    L45:
        int r42 = 0;
    L46:
        if (r42 >= 4) goto L66;
        this.f3258s.getClass();
        if (r42 != 1) goto L50;
        InterfaceC1006Xb r63 = r1.f2330g;
    L57:
        float r64 = r63.mo1563a(r2);
        if (r32 == false) goto L60;
        this.f3237B[r42] = r64;
    L60:
        C0643Oy[] r82 = this.f3236A;
        C0643Oy r92 = r82[r42];
        if (r92 == null) goto L65;
        r92.m1266a(r64);
        if (r32 == false) goto L65;
        r82[r42].m1268d();
    L65:
        r42 = r42 + 1;
        goto L46
    L50:
        if (r42 != 2) goto L52;
        r63 = r1.f2331h;
        goto L57
    L52:
        if (r42 == 3) goto L54;
        r63 = r1.f2329f;
        goto L57
    L54:
        r63 = r1.f2328e;
        goto L57
    L66:
        if (r32 == false) goto L78;
        invalidateSelf();
        return;
    L78:
        return;
    L35:
        C0685Px r43 = r8[r14].m1516f();
        if (r62 == null) goto L38;
        r43.f2196e = r62.m2315c(r17);
    L38:
        if (r13 == null) goto L40;
        r43.f2197f = r13.m2315c(r17);
    L40:
        if (r12 == null) goto L42;
        r43.f2199h = r12.m2315c(r17);
    L42:
        if (r11 == null) goto L44;
        r43.f2198g = r11.m2315c(r17);
    L44:
        r1 = r43.m1383a();
        goto L45
    L20:
        r14 = -1;
        goto L21
    L10:
        r3 = false;
        goto L11
    }

    /* JADX INFO: renamed from: r */
    public final boolean m1932r() {
        PorterDuffColorFilter r0 = this.f3259t;
        PorterDuffColorFilter r1 = this.f3260u;
        C0935Vq r2 = this.f3241b;
        ColorStateList r3 = r2.f2907f;
        PorterDuff.Mode r22 = r2.f2908g;
        if (r3 == null) goto L7;
        if (r22 == null) goto L7;
        PorterDuffColorFilter r5 = new PorterDuffColorFilter(m1917c(r3.getColorForState(getState(), 0)), r22);
    L11:
        this.f3259t = r5;
        this.f3241b.getClass();
        this.f3260u = null;
        this.f3241b.getClass();
        if (Objects.equals(r0, this.f3259t) == true) goto L14;
    L18:
        return true;
    L14:
        if (Objects.equals(r1, this.f3260u) == false) goto L18;
        return false;
    L7:
        int r23 = this.f3254o.getColor();
        int r32 = m1917c(r23);
        if (r32 == r23) goto L10;
        r5 = new PorterDuffColorFilter(r32, PorterDuff.Mode.SRC_IN);
        goto L11
    L10:
        r5 = null;
        goto L11
    }

    /* JADX INFO: renamed from: s */
    public final void m1933s() {
        C0935Vq r0 = this.f3241b;
        float r1 = r0.f2915n + 0.0f;
        r0.f2916o = (int) Math.ceil(0.75f * r1);
        this.f3241b.f2917p = (int) Math.ceil(r1 * 0.25f);
        m1932r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r3) {
        C0935Vq r0 = this.f3241b;
        if (r0.f2913l == r3) goto L6;
        r0.f2913l = r3;
        super.invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r1) {
        this.f3241b.getClass();
        super.invalidateSelf();
    }

    @Override // p000.InterfaceC1300cy
    public final void setShapeAppearanceModel(C0728Qx r2) {
        C0935Vq r0 = this.f3241b;
        r0.f2902a = r2;
        r0.f2903b = null;
        this.f3237B = null;
        this.f3238C = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r1) {
        setTintList(ColorStateList.valueOf(r1));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList r2) {
        this.f3241b.f2907f = r2;
        m1932r();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode r3) {
        C0935Vq r0 = this.f3241b;
        if (r0.f2908g == r3) goto L6;
        r0.f2908g = r3;
        m1932r();
        super.invalidateSelf();
        return;
    }

    public C1021Xq(Context r1, AttributeSet r2, int r3, int r4) {
        this(C0728Qx.m1512b(r1, r2, r3, r4).m1383a());
    }

    public C1021Xq(C0728Qx r2) {
        this(new C0935Vq(r2));
    }

    public C1021Xq(C0935Vq r7) {
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
        Paint r1 = new Paint(1);
        this.f3254o = r1;
        Paint r3 = new Paint(1);
        this.f3255p = r3;
        this.f3256q = new C0642Ox();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L5;
        C0813Sx r4 = AbstractC0770Rx.f2443a;
    L6:
        this.f3258s = r4;
        this.f3261v = new RectF();
        this.f3262w = true;
        this.f3263x = true;
        this.f3236A = new C0643Oy[4];
        this.f3241b = r7;
        r3.setStyle(Paint.Style.STROKE);
        r1.setStyle(Paint.Style.FILL);
        m1932r();
        m1930p(getState());
        this.f3257r = new C0892Uq(this);
        return;
    L5:
        r4 = new C0813Sx();
        goto L6
    }
}
