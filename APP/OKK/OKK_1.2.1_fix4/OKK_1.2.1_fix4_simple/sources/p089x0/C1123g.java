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
import java.util.BitSet;
import java.util.Objects;
import p006D.C0095d;
import p056f0.AbstractC0805P;
import p077q0.AbstractC1055a;
import p077q0.AbstractC1057c;
import p079r0.C1065a;
import p085v.AbstractC1100a;
import p088w0.C1116a;

/* JADX INFO: renamed from: x0.g */
/* JADX INFO: loaded from: classes.dex */
public class C1123g extends Drawable implements InterfaceC1138v {

    /* JADX INFO: renamed from: w */
    public static final Paint f4311w = null;

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
        Paint r02 = new Paint(1);
        f4311w = r02;
        r02.setColor(-1);
        r02.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C1123g() {
        this(new C1127k());
    }

    /* JADX INFO: renamed from: a */
    public final void m2642a(RectF r8, Path r9) {
        C1122f r02 = this.f4312a;
        C1127k r2 = r02.f4290a;
        float r3 = r02.f4299j;
        C0095d r5 = this.f4328q;
        this.f4329r.m2661a(r2, r3, r8, r5, r9);
        if (this.f4312a.f4298i == 1.0f) goto L5;
        Matrix r03 = this.f4317f;
        r03.reset();
        float r1 = this.f4312a.f4298i;
        r03.setScale(r1, r1, r8.width() / 2.0f, r8.height() / 2.0f);
        r9.transform(r03);
    L5:
        r9.computeBounds(this.f4332u, true);
    }

    /* JADX INFO: renamed from: b */
    public final PorterDuffColorFilter m2643b(ColorStateList r2, PorterDuff.Mode r3, Paint r4, boolean r5) {
        if (r2 == null) goto L9;
        if (r3 == null) goto L9;
        int r22 = r2.getColorForState(getState(), 0);
        if (r5 == false) goto L15;
        r22 = m2644c(r22);
    L15:
        return new PorterDuffColorFilter(r22, r3);
    L9:
        if (r5 == false) goto L14;
        int r23 = r4.getColor();
        int r32 = m2644c(r23);
        if (r32 == r23) goto L14;
        PorterDuffColorFilter r24 = new PorterDuffColorFilter(r32, PorterDuff.Mode.SRC_IN);
    L16:
        return r24;
    L14:
        r24 = null;
        goto L16
    }

    /* JADX INFO: renamed from: c */
    public final int m2644c(int r8) {
        C1122f r02 = this.f4312a;
        float r1 = (r02.f4303n + r02.f4304o) + r02.f4302m;
        C1065a r03 = r02.f4291b;
        if (r03 != null) goto L5;
        return r8;
    L5:
        if (r03.f4085a == true) goto L7;
        return r8;
    L7:
        if (AbstractC1100a.m2595d(r8, 255) == r03.f4088d) goto L9;
        return r8;
    L9:
        if (r03.f4089e > 0.0f) goto L11;
    L14:
        float r12 = 0.0f;
    L15:
        int r3 = Color.alpha(r8);
        int r82 = AbstractC0805P.m2033I(AbstractC1100a.m2595d(r8, 255), r03.f4086b, r12);
        if (r12 <= 0.0f) goto L21;
        int r04 = r03.f4087c;
        if (r04 == 0) goto L21;
        r82 = AbstractC1100a.m2593b(AbstractC1100a.m2595d(r04, C1065a.f4084f), r82);
    L21:
        return AbstractC1100a.m2595d(r82, r3);
    L11:
        if (r1 <= 0.0f) goto L14;
        r12 = Math.min(((((float) Math.log1p(r1 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        goto L15
    }

    /* JADX INFO: renamed from: d */
    public final void m2645d(Canvas r8) {
        this.f4315d.cardinality();
        int r02 = this.f4312a.f4307r;
        Path r1 = this.f4318g;
        C1116a r2 = this.f4327p;
        if (r02 == 0) goto L5;
        r8.drawPath(r1, r2.f4275a);
    L5:
        int r03 = 0;
    L7:
        if (r03 >= 4) goto L10;
        AbstractC1136t r3 = this.f4313b[r03];
        int r4 = this.f4312a.f4306q;
        Matrix r5 = AbstractC1136t.f4388b;
        r3.mo2663a(r5, r2, r4, r8);
        this.f4314c[r03].mo2663a(r5, r2, this.f4312a.f4306q, r8);
        r03 = r03 + 1;
        goto L7
    L10:
        if (this.f4333v == false) goto L14;
        int r04 = (int) (Math.sin(Math.toRadians(r0.f4308s)) * this.f4312a.f4307r);
        int r22 = (int) (Math.cos(Math.toRadians(r2.f4308s)) * this.f4312a.f4307r);
        r8.translate(-r04, -r22);
        r8.drawPath(r1, f4311w);
        r8.translate(r04, r22);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas r19) {
        Paint r8 = this.f4325n;
        r8.setColorFilter(this.f4330s);
        int r9 = r8.getAlpha();
        int r02 = this.f4312a.f4301l;
        r8.setAlpha(((r02 + (r02 >>> 7)) * r9) >>> 8);
        Paint r10 = this.f4326o;
        r10.setColorFilter(this.f4331t);
        r10.setStrokeWidth(this.f4312a.f4300k);
        int r11 = r10.getAlpha();
        int r03 = this.f4312a.f4301l;
        r10.setAlpha(((r03 + (r03 >>> 7)) * r11) >>> 8);
        boolean r04 = this.f4316e;
        Path r3 = this.f4318g;
        if (r04 == false) goto L28;
        float r1 = 0.0f;
        if (m2648h() == false) goto L7;
        float r05 = r10.getStrokeWidth() / 2.0f;
    L8:
        float r06 = -r05;
        C1127k r4 = this.f4312a.f4290a;
        C1126j r5 = r4.m2660d();
        InterfaceC1119c r12 = r4.f4351e;
        if ((r12 instanceof C1124h) == true) goto L12;
        r12 = new C1118b(r06, r12);
    L12:
        r5.f4339e = r12;
        InterfaceC1119c r122 = r4.f4352f;
        if ((r122 instanceof C1124h) == true) goto L16;
        r122 = new C1118b(r06, r122);
    L16:
        r5.f4340f = r122;
        InterfaceC1119c r123 = r4.f4354h;
        if ((r123 instanceof C1124h) == true) goto L20;
        r123 = new C1118b(r06, r123);
    L20:
        r5.f4342h = r123;
        InterfaceC1119c r42 = r4.f4353g;
        if ((r42 instanceof C1124h) == true) goto L24;
        r42 = new C1118b(r06, r42);
    L24:
        r5.f4341g = r42;
        C1127k r13 = r5.m2656a();
        this.f4324m = r13;
        float r14 = this.f4312a.f4299j;
        RectF r15 = this.f4321j;
        r15.set(m2647g());
        if (m2648h() == false) goto L27;
        r1 = r10.getStrokeWidth() / 2.0f;
    L27:
        r15.inset(r1, r1);
        this.f4329r.m2661a(r13, r14, r15, null, this.f4319h);
        m2642a(m2647g(), r3);
        this.f4316e = false;
        goto L28
    L7:
        r05 = 0.0f;
    L28:
        C1122f r07 = this.f4312a;
        int r16 = r07.f4305p;
        if (r16 != 1) goto L31;
    L49:
        C1122f r08 = this.f4312a;
        Paint.Style r17 = r08.f4310u;
        if (r17 != Paint.Style.FILL_AND_STROKE) goto L52;
    L53:
        m2646e(r19, r8, r3, r08.f4290a, m2647g());
    L55:
        if (m2648h() == false) goto L57;
        mo69f(r19);
    L57:
        r8.setAlpha(r9);
        r10.setAlpha(r11);
        return;
    L52:
        if (r17 != Paint.Style.FILL) goto L55;
    L31:
        if (r07.f4306q <= 0) goto L49;
        if (r16 == 2) goto L40;
        int r18 = Build.VERSION.SDK_INT;
        if (r07.f4290a.m2659c(m2647g()) == true) goto L49;
        if (r3.isConvex() == true) goto L49;
        if (r18 >= 29) goto L49;
    L40:
        r19.save();
        int r09 = (int) (Math.sin(Math.toRadians(r0.f4308s)) * this.f4312a.f4307r);
        double r43 = this.f4312a.f4307r;
        r19.translate(r09, (int) (Math.cos(Math.toRadians(r1.f4308s)) * r43));
        if (this.f4333v == true) goto L43;
        m2645d(r19);
        r19.restore();
        goto L49
    L43:
        RectF r010 = this.f4332u;
        int r110 = (int) (r010.width() - getBounds().width());
        int r44 = (int) (r010.height() - getBounds().height());
        if (r110 < 0) goto L48;
        if (r44 < 0) goto L48;
        Bitmap r011 = Bitmap.createBitmap(((this.f4312a.f4306q * 2) + ((int) r010.width())) + r110, ((this.f4312a.f4306q * 2) + ((int) r010.height())) + r44, Bitmap.Config.ARGB_8888);
        Canvas r2 = new Canvas(r011);
        float r111 = (getBounds().left - this.f4312a.f4306q) - r110;
        float r45 = (getBounds().top - this.f4312a.f4306q) - r44;
        r2.translate(-r111, -r45);
        m2645d(r2);
        r19.drawBitmap(r011, r111, r45, null);
        r011.recycle();
        r19.restore();
    L48:
        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
    }

    /* JADX INFO: renamed from: e */
    public final void m2646e(Canvas r2, Paint r3, Path r4, C1127k r5, RectF r6) {
        if (r5.m2659c(r6) == false) goto L5;
        float r42 = r5.f4352f.mo2634a(r6) * this.f4312a.f4299j;
        r2.drawRoundRect(r6, r42, r42, r3);
        return;
    L5:
        r2.drawPath(r4, r3);
    }

    /* JADX INFO: renamed from: f */
    public void mo69f(Canvas r7) {
        Paint r2 = this.f4326o;
        Path r3 = this.f4319h;
        C1127k r4 = this.f4324m;
        RectF r5 = this.f4321j;
        r5.set(m2647g());
        if (m2648h() == false) goto L5;
        float r02 = r2.getStrokeWidth() / 2.0f;
    L6:
        r5.inset(r02, r02);
        m2646e(r7, r2, r3, r4, r5);
        return;
    L5:
        r02 = 0.0f;
        goto L6
    }

    /* JADX INFO: renamed from: g */
    public final RectF m2647g() {
        RectF r02 = this.f4320i;
        r02.set(getBounds());
        return r02;
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
    public void getOutline(Outline r4) {
        C1122f r02 = this.f4312a;
        if (r02.f4305p != 2) goto L6;
        return;
    L6:
        if (r02.f4290a.m2659c(m2647g()) == false) goto L9;
        float r03 = this.f4312a.f4290a.f4351e.mo2634a(m2647g()) * this.f4312a.f4299j;
        r4.setRoundRect(getBounds(), r03);
        return;
    L9:
        RectF r04 = m2647g();
        Path r1 = this.f4318g;
        m2642a(r04, r1);
        int r05 = Build.VERSION.SDK_INT;
        if (r05 < 30) goto L13;
        AbstractC1057c.m2534a(r4, r1);
        return;
    L13:
        if (r05 < 29) goto L17;
        AbstractC1055a.m2531a(r4, r1);     // Catch: IllegalArgumentException -> L20
        return;
    L26:
        return;
    L17:
        if (r1.isConvex() == false) goto L24;
        AbstractC1055a.m2531a(r4, r1);
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect r2) {
        Rect r02 = this.f4312a.f4297h;
        if (r02 == null) goto L7;
        r2.set(r02);
        return true;
    L7:
        return super.getPadding(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect r02 = getBounds();
        Region r1 = this.f4322k;
        r1.set(r02);
        RectF r03 = m2647g();
        Path r2 = this.f4318g;
        m2642a(r03, r2);
        Region r04 = this.f4323l;
        r04.setPath(r2, r1);
        r1.op(r04, Region.Op.DIFFERENCE);
        return r1;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m2648h() {
        Paint.Style r02 = this.f4312a.f4310u;
        if (r02 == Paint.Style.FILL_AND_STROKE) goto L7;
        if (r02 == Paint.Style.STROKE) goto L7;
    L9:
        return false;
    L7:
        if (this.f4326o.getStrokeWidth() <= 0.0f) goto L9;
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m2649i(Context r3) {
        C1122f r02 = this.f4312a;
        r02.f4291b = new C1065a(r3);
        m2654n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f4316e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful() == true) goto L22;
        ColorStateList r02 = this.f4312a.f4295f;
        if (r02 != null) goto L7;
    L8:
        ColorStateList r03 = this.f4312a.f4294e;
        if (r03 != null) goto L11;
    L12:
        ColorStateList r04 = this.f4312a.f4293d;
        if (r04 != null) goto L15;
    L16:
        ColorStateList r05 = this.f4312a.f4292c;
        if (r05 != null) goto L19;
    L21:
        return false;
    L19:
        if (r05.isStateful() == false) goto L21;
    L15:
        if (r04.isStateful() == true) goto L22;
    L11:
        if (r03.isStateful() == true) goto L22;
    L7:
        if (r02.isStateful() == false) goto L8;
    L22:
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final void m2650j(float r3) {
        C1122f r02 = this.f4312a;
        if (r02.f4303n == r3) goto L6;
        r02.f4303n = r3;
        m2654n();
        return;
    }

    /* JADX INFO: renamed from: k */
    public final void m2651k(ColorStateList r3) {
        C1122f r02 = this.f4312a;
        if (r02.f4292c == r3) goto L6;
        r02.f4292c = r3;
        onStateChange(getState());
        return;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m2652l(int[] r6) {
        if (this.f4312a.f4292c == null) goto L7;
        Paint r02 = this.f4325n;
        int r2 = r02.getColor();
        int r3 = this.f4312a.f4292c.getColorForState(r6, r2);
        if (r2 == r3) goto L7;
        r02.setColor(r3);
        boolean r03 = true;
    L9:
        if (this.f4312a.f4293d == null) goto L14;
        Paint r22 = this.f4326o;
        int r32 = r22.getColor();
        int r62 = this.f4312a.f4293d.getColorForState(r6, r32);
        if (r32 == r62) goto L14;
        r22.setColor(r62);
        return true;
    L14:
        return r03;
    L7:
        r03 = false;
        goto L9
    }

    /* JADX INFO: renamed from: m */
    public final boolean m2653m() {
        PorterDuffColorFilter r02 = this.f4330s;
        PorterDuffColorFilter r1 = this.f4331t;
        C1122f r2 = this.f4312a;
        this.f4330s = m2643b(r2.f4295f, r2.f4296g, this.f4325n, true);
        C1122f r22 = this.f4312a;
        this.f4331t = m2643b(r22.f4294e, r22.f4296g, this.f4326o, false);
        C1122f r23 = this.f4312a;
        if (r23.f4309t == false) goto L6;
        int r24 = r23.f4295f.getColorForState(getState(), 0);
        C1116a r3 = this.f4327p;
        r3.getClass();
        r3.f4278d = AbstractC1100a.m2595d(r24, 68);
        r3.f4279e = AbstractC1100a.m2595d(r24, 20);
        r3.f4280f = AbstractC1100a.m2595d(r24, 0);
        r3.f4275a.setColor(r3.f4278d);
    L6:
        if (Objects.equals(r02, this.f4330s) == true) goto L8;
        return true;
    L8:
        if (Objects.equals(r1, this.f4331t) == true) goto L11;
        return true;
    L11:
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f4312a = new C1122f(this.f4312a);
        return this;
    }

    /* JADX INFO: renamed from: n */
    public final void m2654n() {
        C1122f r02 = this.f4312a;
        float r1 = r02.f4303n + r02.f4304o;
        r02.f4306q = (int) Math.ceil(0.75f * r1);
        this.f4312a.f4307r = (int) Math.ceil(r1 * 0.25f);
        m2653m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect r2) {
        this.f4316e = true;
        super.onBoundsChange(r2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] r2) {
        boolean r22 = m2652l(r2);
        boolean r02 = m2653m();
        if (r22 == true) goto L7;
        if (r02 == true) goto L7;
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
        C1122f r02 = this.f4312a;
        if (r02.f4301l == r3) goto L6;
        r02.f4301l = r3;
        super.invalidateSelf();
        return;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter r1) {
        this.f4312a.getClass();
        super.invalidateSelf();
    }

    @Override // p089x0.InterfaceC1138v
    public final void setShapeAppearanceModel(C1127k r2) {
        this.f4312a.f4290a = r2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int r1) {
        setTintList(ColorStateList.valueOf(r1));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList r2) {
        this.f4312a.f4295f = r2;
        m2653m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode r3) {
        C1122f r02 = this.f4312a;
        if (r02.f4296g == r3) goto L6;
        r02.f4296g = r3;
        m2653m();
        super.invalidateSelf();
        return;
    }

    public C1123g(C1127k r2) {
        this(new C1122f(r2));
    }

    public C1123g(C1122f r6) {
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
        Paint r02 = new Paint(1);
        this.f4325n = r02;
        Paint r2 = new Paint(1);
        this.f4326o = r2;
        this.f4327p = new C1116a();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) goto L5;
        C1129m r3 = AbstractC1128l.f4359a;
    L6:
        this.f4329r = r3;
        this.f4332u = new RectF();
        this.f4333v = true;
        this.f4312a = r6;
        r2.setStyle(Paint.Style.STROKE);
        r02.setStyle(Paint.Style.FILL);
        m2653m();
        m2652l(getState());
        this.f4328q = new C0095d(25, this);
        return;
    L5:
        r3 = new C1129m();
        goto L6
    }
}
