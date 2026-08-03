package p074o0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.luckypray.dexkit.C1031R;
import p060h0.C0946b;
import p081s0.C1075i;
import p081s0.InterfaceC1074h;
import p084u0.C1099d;
import p085v.AbstractC1100a;
import p086v0.AbstractC1110a;
import p087w.AbstractC1111a;
import p087w.AbstractC1112b;
import p087w.AbstractC1115e;
import p087w.InterfaceC1114d;
import p089x0.C1117a;
import p089x0.C1122f;
import p089x0.C1123g;
import p089x0.C1126j;
import p089x0.C1127k;

/* JADX INFO: renamed from: o0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1030f extends C1123g implements Drawable.Callback, InterfaceC1074h {

    /* JADX INFO: renamed from: G0 */
    public static final int[] f3777G0 = null;

    /* JADX INFO: renamed from: H0 */
    public static final ShapeDrawable f3778H0 = null;

    /* JADX INFO: renamed from: A */
    public float f3779A;

    /* JADX INFO: renamed from: A0 */
    public ColorStateList f3780A0;

    /* JADX INFO: renamed from: B */
    public ColorStateList f3781B;

    /* JADX INFO: renamed from: B0 */
    public WeakReference f3782B0;

    /* JADX INFO: renamed from: C */
    public float f3783C;

    /* JADX INFO: renamed from: C0 */
    public TextUtils.TruncateAt f3784C0;

    /* JADX INFO: renamed from: D */
    public ColorStateList f3785D;

    /* JADX INFO: renamed from: D0 */
    public boolean f3786D0;

    /* JADX INFO: renamed from: E */
    public CharSequence f3787E;

    /* JADX INFO: renamed from: E0 */
    public int f3788E0;

    /* JADX INFO: renamed from: F */
    public boolean f3789F;

    /* JADX INFO: renamed from: F0 */
    public boolean f3790F0;

    /* JADX INFO: renamed from: G */
    public Drawable f3791G;

    /* JADX INFO: renamed from: H */
    public ColorStateList f3792H;

    /* JADX INFO: renamed from: I */
    public float f3793I;

    /* JADX INFO: renamed from: J */
    public boolean f3794J;

    /* JADX INFO: renamed from: K */
    public boolean f3795K;

    /* JADX INFO: renamed from: L */
    public Drawable f3796L;

    /* JADX INFO: renamed from: M */
    public RippleDrawable f3797M;

    /* JADX INFO: renamed from: N */
    public ColorStateList f3798N;

    /* JADX INFO: renamed from: O */
    public float f3799O;

    /* JADX INFO: renamed from: P */
    public SpannableStringBuilder f3800P;

    /* JADX INFO: renamed from: Q */
    public boolean f3801Q;

    /* JADX INFO: renamed from: R */
    public boolean f3802R;

    /* JADX INFO: renamed from: S */
    public Drawable f3803S;

    /* JADX INFO: renamed from: T */
    public ColorStateList f3804T;

    /* JADX INFO: renamed from: U */
    public C0946b f3805U;

    /* JADX INFO: renamed from: V */
    public C0946b f3806V;

    /* JADX INFO: renamed from: W */
    public float f3807W;

    /* JADX INFO: renamed from: X */
    public float f3808X;

    /* JADX INFO: renamed from: Y */
    public float f3809Y;

    /* JADX INFO: renamed from: Z */
    public float f3810Z;

    /* JADX INFO: renamed from: a0 */
    public float f3811a0;

    /* JADX INFO: renamed from: b0 */
    public float f3812b0;

    /* JADX INFO: renamed from: c0 */
    public float f3813c0;

    /* JADX INFO: renamed from: d0 */
    public float f3814d0;

    /* JADX INFO: renamed from: e0 */
    public final Context f3815e0;

    /* JADX INFO: renamed from: f0 */
    public final Paint f3816f0;

    /* JADX INFO: renamed from: g0 */
    public final Paint.FontMetrics f3817g0;

    /* JADX INFO: renamed from: h0 */
    public final RectF f3818h0;

    /* JADX INFO: renamed from: i0 */
    public final PointF f3819i0;

    /* JADX INFO: renamed from: j0 */
    public final Path f3820j0;

    /* JADX INFO: renamed from: k0 */
    public final C1075i f3821k0;

    /* JADX INFO: renamed from: l0 */
    public int f3822l0;

    /* JADX INFO: renamed from: m0 */
    public int f3823m0;

    /* JADX INFO: renamed from: n0 */
    public int f3824n0;

    /* JADX INFO: renamed from: o0 */
    public int f3825o0;

    /* JADX INFO: renamed from: p0 */
    public int f3826p0;

    /* JADX INFO: renamed from: q0 */
    public int f3827q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f3828r0;

    /* JADX INFO: renamed from: s0 */
    public int f3829s0;

    /* JADX INFO: renamed from: t0 */
    public int f3830t0;

    /* JADX INFO: renamed from: u0 */
    public ColorFilter f3831u0;

    /* JADX INFO: renamed from: v0 */
    public PorterDuffColorFilter f3832v0;

    /* JADX INFO: renamed from: w0 */
    public ColorStateList f3833w0;

    /* JADX INFO: renamed from: x */
    public ColorStateList f3834x;

    /* JADX INFO: renamed from: x0 */
    public PorterDuff.Mode f3835x0;

    /* JADX INFO: renamed from: y */
    public ColorStateList f3836y;

    /* JADX INFO: renamed from: y0 */
    public int[] f3837y0;

    /* JADX INFO: renamed from: z */
    public float f3838z;

    /* JADX INFO: renamed from: z0 */
    public boolean f3839z0;

    static {
        f3777G0 = new int[]{R.attr.state_enabled};
        f3778H0 = new ShapeDrawable(new OvalShape());
    }

    public C1030f(Context r3, AttributeSet r4) {
        super(C1127k.m2657a(r3, r4, C1031R.attr.chipStyle, C1031R.style.Widget_MaterialComponents_Chip_Action).m2656a());
        this.f3779A = -1.0f;
        this.f3816f0 = new Paint(1);
        this.f3817g0 = new Paint.FontMetrics();
        this.f3818h0 = new RectF();
        this.f3819i0 = new PointF();
        this.f3820j0 = new Path();
        this.f3830t0 = 255;
        this.f3835x0 = PorterDuff.Mode.SRC_IN;
        this.f3782B0 = new WeakReference(null);
        m2649i(r3);
        this.f3815e0 = r3;
        C1075i r42 = new C1075i(this);
        this.f3821k0 = r42;
        this.f3787E = "";
        TextPaint r43 = r42.f4172a;
        r43.density = r3.getResources().getDisplayMetrics().density;
        int[] r32 = f3777G0;
        setState(r32);
        if (Arrays.equals(this.f3837y0, r32) == true) goto L7;
        this.f3837y0 = r32;
        if (m2500U() == false) goto L7;
        m2507w(getState(), r32);
    L7:
        this.f3786D0 = true;
        f3778H0.setTint(-1);
    }

    /* JADX INFO: renamed from: V */
    public static void m2477V(Drawable r1) {
        if (r1 == null) goto L5;
        r1.setCallback(null);
        return;
    }

    /* JADX INFO: renamed from: t */
    public static boolean m2478t(ColorStateList r02) {
        if (r02 != null) goto L4;
    L6:
        return false;
    L4:
        if (r02.isStateful() == false) goto L6;
        return true;
    }

    /* JADX INFO: renamed from: u */
    public static boolean m2479u(Drawable r02) {
        if (r02 != null) goto L4;
    L6:
        return false;
    L4:
        if (r02.isStateful() == false) goto L6;
        return true;
    }

    /* JADX INFO: renamed from: A */
    public final void m2480A(boolean r2) {
        if (this.f3802R == r2) goto L11;
        boolean r02 = m2498S();
        this.f3802R = r2;
        boolean r22 = m2498S();
        if (r02 == r22) goto L12;
        if (r22 == false) goto L8;
        m2501o(this.f3803S);
    L9:
        invalidateSelf();
        m2506v();
        return;
    L8:
        m2477V(this.f3803S);
        goto L9
    L12:
        return;
    }

    /* JADX INFO: renamed from: B */
    public final void m2481B(float r3) {
        if (this.f3779A == r3) goto L6;
        this.f3779A = r3;
        C1126j r02 = this.f4312a.f4290a.m2660d();
        r02.f4339e = new C1117a(r3);
        r02.f4340f = new C1117a(r3);
        r02.f4341g = new C1117a(r3);
        r02.f4342h = new C1117a(r3);
        setShapeAppearanceModel(r02.m2656a());
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: C */
    public final void m2482C(Drawable r4) {
        Object r02 = this.f3791G;
        Drawable r1 = null;
        if (r02 == null) goto L7;
        boolean r2 = r02 instanceof InterfaceC1114d;
        ?? r03 = r02;
        if (r2 == false) goto L8;
        ((AbstractC1115e) ((InterfaceC1114d) r02)).getClass();
        r03 = 0;
    L8:
        if (r03 == r4) goto L19;
        float r22 = m2503q();
        if (r4 == null) goto L12;
        r1 = r4.mutate();
    L12:
        this.f3791G = r1;
        float r42 = m2503q();
        m2477V(r03);
        if (m2499T() == false) goto L15;
        m2501o(this.f3791G);
    L15:
        invalidateSelf();
        if (r22 == r42) goto L20;
        m2506v();
        return;
    L20:
        return;
    L19:
        return;
    L7:
        r03 = 0;
        goto L8
    }

    /* JADX INFO: renamed from: D */
    public final void m2483D(float r2) {
        if (this.f3793I == r2) goto L8;
        float r02 = m2503q();
        this.f3793I = r2;
        float r22 = m2503q();
        invalidateSelf();
        if (r02 == r22) goto L9;
        m2506v();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: E */
    public final void m2484E(ColorStateList r2) {
        this.f3794J = true;
        if (this.f3792H == r2) goto L9;
        this.f3792H = r2;
        if (m2499T() == false) goto L7;
        AbstractC1111a.m2626h(this.f3791G, r2);
    L7:
        onStateChange(getState());
        return;
    }

    /* JADX INFO: renamed from: F */
    public final void m2485F(boolean r2) {
        if (this.f3789F == r2) goto L11;
        boolean r02 = m2499T();
        this.f3789F = r2;
        boolean r22 = m2499T();
        if (r02 == r22) goto L12;
        if (r22 == false) goto L8;
        m2501o(this.f3791G);
    L9:
        invalidateSelf();
        m2506v();
        return;
    L8:
        m2477V(this.f3791G);
        goto L9
    L12:
        return;
    }

    /* JADX INFO: renamed from: G */
    public final void m2486G(ColorStateList r3) {
        if (this.f3781B == r3) goto L11;
        this.f3781B = r3;
        if (this.f3790F0 == false) goto L9;
        C1122f r02 = this.f4312a;
        if (r02.f4293d == r3) goto L9;
        r02.f4293d = r3;
        onStateChange(getState());
    L9:
        onStateChange(getState());
        return;
    }

    /* JADX INFO: renamed from: H */
    public final void m2487H(float r2) {
        if (this.f3783C == r2) goto L9;
        this.f3783C = r2;
        this.f3816f0.setStrokeWidth(r2);
        if (this.f3790F0 == false) goto L7;
        this.f4312a.f4300k = r2;
        invalidateSelf();
    L7:
        invalidateSelf();
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX INFO: renamed from: I */
    public final void m2488I(Drawable r6) {
        Object r02 = this.f3796L;
        Drawable r1 = null;
        if (r02 == null) goto L7;
        boolean r2 = r02 instanceof InterfaceC1114d;
        ?? r03 = r02;
        if (r2 == false) goto L8;
        ((AbstractC1115e) ((InterfaceC1114d) r02)).getClass();
        r03 = 0;
    L8:
        if (r03 == r6) goto L19;
        float r22 = m2504r();
        if (r6 == null) goto L12;
        r1 = r6.mutate();
    L12:
        this.f3796L = r1;
        this.f3797M = new RippleDrawable(AbstractC1110a.m2618a(this.f3785D), this.f3796L, f3778H0);
        float r62 = m2504r();
        m2477V(r03);
        if (m2500U() == false) goto L15;
        m2501o(this.f3796L);
    L15:
        invalidateSelf();
        if (r22 == r62) goto L20;
        m2506v();
        return;
    L20:
        return;
    L19:
        return;
    L7:
        r03 = 0;
        goto L8
    }

    /* JADX INFO: renamed from: J */
    public final void m2489J(float r2) {
        if (this.f3813c0 == r2) goto L8;
        this.f3813c0 = r2;
        invalidateSelf();
        if (m2500U() == false) goto L9;
        m2506v();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: K */
    public final void m2490K(float r2) {
        if (this.f3799O == r2) goto L8;
        this.f3799O = r2;
        invalidateSelf();
        if (m2500U() == false) goto L9;
        m2506v();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: L */
    public final void m2491L(float r2) {
        if (this.f3812b0 == r2) goto L8;
        this.f3812b0 = r2;
        invalidateSelf();
        if (m2500U() == false) goto L9;
        m2506v();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: M */
    public final void m2492M(ColorStateList r2) {
        if (this.f3798N == r2) goto L9;
        this.f3798N = r2;
        if (m2500U() == false) goto L7;
        AbstractC1111a.m2626h(this.f3796L, r2);
    L7:
        onStateChange(getState());
        return;
    }

    /* JADX INFO: renamed from: N */
    public final void m2493N(boolean r2) {
        if (this.f3795K == r2) goto L11;
        boolean r02 = m2500U();
        this.f3795K = r2;
        boolean r22 = m2500U();
        if (r02 == r22) goto L12;
        if (r22 == false) goto L8;
        m2501o(this.f3796L);
    L9:
        invalidateSelf();
        m2506v();
        return;
    L8:
        m2477V(this.f3796L);
        goto L9
    L12:
        return;
    }

    /* JADX INFO: renamed from: O */
    public final void m2494O(float r2) {
        if (this.f3809Y == r2) goto L8;
        float r02 = m2503q();
        this.f3809Y = r2;
        float r22 = m2503q();
        invalidateSelf();
        if (r02 == r22) goto L9;
        m2506v();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: P */
    public final void m2495P(float r2) {
        if (this.f3808X == r2) goto L8;
        float r02 = m2503q();
        this.f3808X = r2;
        float r22 = m2503q();
        invalidateSelf();
        if (r02 == r22) goto L9;
        m2506v();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: Q */
    public final void m2496Q(ColorStateList r2) {
        if (this.f3785D == r2) goto L10;
        this.f3785D = r2;
        if (this.f3839z0 == false) goto L7;
        ColorStateList r22 = AbstractC1110a.m2618a(r2);
    L8:
        this.f3780A0 = r22;
        onStateChange(getState());
        return;
    L7:
        r22 = null;
        goto L8
    }

    /* JADX INFO: renamed from: R */
    public final void m2497R(C1099d r6) {
        C1075i r02 = this.f3821k0;
        if (r02.f4177f == r6) goto L14;
        r02.f4177f = r6;
        if (r6 == null) goto L10;
        TextPaint r1 = r02.f4172a;
        Context r2 = this.f3815e0;
        C1026b r3 = r02.f4173b;
        r6.m2590f(r2, r1, r3);
        InterfaceC1074h r4 = (InterfaceC1074h) r02.f4176e.get();
        if (r4 == null) goto L9;
        r1.drawableState = r4.getState();
    L9:
        r6.m2589e(r2, r1, r3);
        r02.f4175d = true;
    L10:
        InterfaceC1074h r62 = (InterfaceC1074h) r02.f4176e.get();
        if (r62 == null) goto L15;
        C1030f r03 = (C1030f) r62;
        r03.m2506v();
        r03.invalidateSelf();
        r03.onStateChange(r62.getState());
        return;
    L15:
        return;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m2498S() {
        if (this.f3802R == true) goto L5;
    L9:
        return false;
    L5:
        if (this.f3803S == null) goto L9;
        if (this.f3828r0 == false) goto L9;
        return true;
    }

    /* JADX INFO: renamed from: T */
    public final boolean m2499T() {
        if (this.f3789F == true) goto L5;
    L7:
        return false;
    L5:
        if (this.f3791G == null) goto L7;
        return true;
    }

    /* JADX INFO: renamed from: U */
    public final boolean m2500U() {
        if (this.f3795K == true) goto L5;
    L7:
        return false;
    L5:
        if (this.f3796L == null) goto L7;
        return true;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void draw(Canvas r24) {
        Rect r15 = getBounds();
        if (r15.isEmpty() == true) goto L98;
        int r5 = this.f3830t0;
        if (r5 != 0) goto L8;
        return;
    L8:
        if (r5 >= 255) goto L10;
        int r11 = r24.saveLayerAlpha(r15.left, r15.top, r15.right, r15.bottom, r5);
    L11:
        boolean r02 = this.f3790F0;
        Paint r2 = this.f3816f0;
        RectF r10 = this.f3818h0;
        if (r02 == true) goto L15;
        r2.setColor(this.f3822l0);
        r2.setStyle(Paint.Style.FILL);
        r10.set(r15);
        r24.drawRoundRect(r10, m2505s(), m2505s(), r2);
    L15:
        if (this.f3790F0 == true) goto L22;
        r2.setColor(this.f3823m0);
        r2.setStyle(Paint.Style.FILL);
        ColorFilter r03 = this.f3831u0;
        if (r03 != null) goto L20;
        r03 = this.f3832v0;
    L20:
        r2.setColorFilter(r03);
        r10.set(r15);
        r24.drawRoundRect(r10, m2505s(), m2505s(), r2);
    L22:
        if (this.f3790F0 == false) goto L25;
        super.draw(r24);
    L25:
        if (this.f3783C > 0.0f) goto L27;
    L36:
        r2.setColor(this.f3826p0);
        r2.setStyle(Paint.Style.FILL);
        r10.set(r15);
        if (this.f3790F0 == true) goto L39;
        r24.drawRoundRect(r10, m2505s(), m2505s(), r2);
    L41:
        if (m2499T() == false) goto L44;
        m2502p(r15, r10);
        float r04 = r10.left;
        float r1 = r10.top;
        r24.translate(r04, r1);
        this.f3791G.setBounds(0, 0, (int) r10.width(), (int) r10.height());
        this.f3791G.draw(r24);
        r24.translate(-r04, -r1);
    L44:
        if (m2498S() == false) goto L47;
        m2502p(r15, r10);
        float r05 = r10.left;
        float r12 = r10.top;
        r24.translate(r05, r12);
        this.f3803S.setBounds(0, 0, (int) r10.width(), (int) r10.height());
        this.f3803S.draw(r24);
        r24.translate(-r05, -r12);
    L47:
        if (this.f3786D0 == true) goto L49;
    L82:
        RectF r17 = r10;
        int r3 = r11;
        int r52 = 0;
        int r06 = 255;
    L84:
        if (m2500U() == false) goto L95;
        r17.setEmpty();
        if (m2500U() == false) goto L92;
        float r13 = this.f3814d0 + this.f3813c0;
        if (AbstractC1112b.m2628a(this) != 0) goto L90;
        float r22 = r15.right - r13;
        RectF r4 = r17;
        r4.right = r22;
        r4.left = r22 - this.f3799O;
    L91:
        float r14 = r15.exactCenterY();
        float r23 = this.f3799O;
        float r16 = r14 - (r23 / 2.0f);
        r4.top = r16;
        r4.bottom = r16 + r23;
    L93:
        float r18 = r4.left;
        float r25 = r4.top;
        r24.translate(r18, r25);
        this.f3796L.setBounds(r52, r52, (int) r4.width(), (int) r4.height());
        this.f3797M.setBounds(this.f3796L.getBounds());
        this.f3797M.jumpToCurrentState();
        this.f3797M.draw(r24);
        r24.translate(-r18, -r25);
        goto L95
    L90:
        r4 = r17;
        float r26 = r15.left + r13;
        r4.left = r26;
        r4.right = r26 + this.f3799O;
        goto L91
    L92:
        r4 = r17;
    L95:
        if (this.f3830t0 >= r06) goto L99;
        r24.restoreToCount(r3);
        return;
    L99:
        return;
    L49:
        if (this.f3787E == null) goto L82;
        PointF r07 = this.f3819i0;
        r07.set(0.0f, 0.0f);
        Paint.Align r19 = Paint.Align.LEFT;
        CharSequence r27 = this.f3787E;
        C1075i r32 = this.f3821k0;
        if (r27 == null) goto L57;
        float r42 = (m2503q() + this.f3807W) + this.f3810Z;
        if (AbstractC1112b.m2628a(this) != 0) goto L55;
        r07.x = r15.left + r42;
    L56:
        float r28 = r15.centerY();
        TextPaint r43 = r32.f4172a;
        Paint.FontMetrics r53 = this.f3817g0;
        r43.getFontMetrics(r53);
        r07.y = r28 - ((r53.descent + r53.ascent) / 2.0f);
        goto L57
    L55:
        r07.x = r15.right - r42;
        r19 = Paint.Align.RIGHT;
    L57:
        r10.setEmpty();
        if (this.f3787E == null) goto L64;
        float r44 = (m2503q() + this.f3807W) + this.f3810Z;
        float r54 = (m2504r() + this.f3814d0) + this.f3811a0;
        if (AbstractC1112b.m2628a(this) != 0) goto L62;
        r10.left = r15.left + r44;
        r10.right = r15.right - r54;
    L63:
        r10.top = r15.top;
        r10.bottom = r15.bottom;
        goto L64
    L62:
        r10.left = r15.left + r54;
        r10.right = r15.right - r44;
    L64:
        C1099d r29 = r32.f4177f;
        TextPaint r45 = r32.f4172a;
        if (r29 == null) goto L67;
        r45.drawableState = getState();
        r32.f4177f.m2589e(this.f3815e0, r45, r32.f4173b);
    L67:
        r45.setTextAlign(r19);
        if (Math.round(r32.m2552a(this.f3787E.toString())) <= Math.round(r10.width())) goto L70;
        boolean r110 = true;
    L71:
        if (r110 == false) goto L73;
        int r210 = r24.save();
        r24.clipRect(r10);
    L74:
        CharSequence r33 = this.f3787E;
        if (r110 == true) goto L77;
    L79:
        CharSequence r8 = r33;
        int r34 = r8.length();
        float r55 = r07.x;
        float r08 = r07.y;
        r17 = r10;
        r3 = r11;
        r52 = 0;
        r06 = 255;
        r24.drawText(r8, 0, r34, r55, r08, r45);
        if (r110 == false) goto L84;
        r24.restoreToCount(r210);
        goto L84
    L77:
        if (this.f3784C0 == null) goto L79;
        r33 = TextUtils.ellipsize(r33, r45, r10.width(), this.f3784C0);
        goto L79
    L73:
        r210 = 0;
        goto L74
    L70:
        r110 = false;
        goto L71
    L39:
        RectF r09 = new RectF(r15);
        Path r35 = this.f3820j0;
        C1122f r111 = this.f4312a;
        this.f4329r.m2661a(r111.f4290a, r111.f4299j, r09, this.f4328q, r35);
        m2646e(r24, r2, r35, this.f4312a.f4290a, m2647g());
        goto L41
    L27:
        if (this.f3790F0 == true) goto L36;
        r2.setColor(this.f3825o0);
        r2.setStyle(Paint.Style.STROKE);
        if (this.f3790F0 == true) goto L35;
        ColorFilter r010 = this.f3831u0;
        if (r010 != null) goto L34;
        r010 = this.f3832v0;
    L34:
        r2.setColorFilter(r010);
    L35:
        float r011 = r15.left;
        float r112 = this.f3783C / 2.0f;
        r10.set(r011 + r112, r15.top + r112, r15.right - r112, r15.bottom - r112);
        float r012 = this.f3779A - (this.f3783C / 2.0f);
        r24.drawRoundRect(r10, r012, r012, r2);
        goto L36
    L10:
        r11 = 0;
        goto L11
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f3830t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f3831u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f3838z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float r02 = this.f3807W;
        float r1 = (m2503q() + r02) + this.f3810Z;
        String r03 = this.f3787E.toString();
        float r04 = (this.f3821k0.m2552a(r03) + r1) + this.f3811a0;
        return Math.min(Math.round((m2504r() + r04) + this.f3814d0), this.f3788E0);
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void getOutline(Outline r9) {
        if (this.f3790F0 == false) goto L6;
        super.getOutline(r9);
        return;
    L6:
        Rect r02 = getBounds();
        if (r02.isEmpty() == true) goto L9;
        r9.setRoundRect(r02, this.f3779A);
    L10:
        r9.setAlpha(this.f3830t0 / 255.0f);
        return;
    L9:
        r9.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f3838z, this.f3779A);
        goto L10
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.invalidateDrawable(this);
        return;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (m2478t(this.f3834x) == false) goto L5;
    L34:
        return true;
    L5:
        if (m2478t(this.f3836y) == true) goto L34;
        if (m2478t(this.f3781B) == true) goto L34;
        if (this.f3839z0 == true) goto L11;
    L12:
        C1099d r02 = this.f3821k0.f4177f;
        if (r02 == null) goto L20;
        ColorStateList r03 = r02.f4242j;
        if (r03 == null) goto L20;
        if (r03.isStateful() == true) goto L34;
    L20:
        if (this.f3802R == false) goto L27;
        if (this.f3803S == null) goto L27;
        if (this.f3801Q == true) goto L34;
    L27:
        if (m2479u(this.f3791G) == true) goto L34;
        if (m2479u(this.f3803S) == true) goto L34;
        if (m2478t(this.f3833w0) == true) goto L34;
        return false;
    L11:
        if (m2478t(this.f3780A0) == true) goto L34;
        goto L12
    }

    /* JADX INFO: renamed from: o */
    public final void m2501o(Drawable r3) {
        if (r3 != null) goto L4;
        return;
    L4:
        r3.setCallback(this);
        AbstractC1112b.m2629b(r3, AbstractC1112b.m2628a(this));
        r3.setLevel(getLevel());
        r3.setVisible(isVisible(), false);
        if (r3 == this.f3796L) goto L7;
        Drawable r02 = this.f3791G;
        if (r3 != r02) goto L17;
        if (this.f3794J == false) goto L17;
        AbstractC1111a.m2626h(r02, this.f3792H);
    L17:
        if (r3.isStateful() == false) goto L20;
        r3.setState(getState());
        return;
    L20:
        return;
    L7:
        if (r3.isStateful() == false) goto L9;
        r3.setState(this.f3837y0);
    L9:
        AbstractC1111a.m2626h(r3, this.f3798N);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r3) {
        boolean r02 = super.onLayoutDirectionChanged(r3);
        if (m2499T() == false) goto L6;
        r02 = r02 | AbstractC1112b.m2629b(this.f3791G, r3);
    L6:
        if (m2498S() == false) goto L9;
        r02 = r02 | AbstractC1112b.m2629b(this.f3803S, r3);
    L9:
        if (m2500U() == false) goto L11;
        r02 = r02 | AbstractC1112b.m2629b(this.f3796L, r3);
    L11:
        if (r02 == false) goto L15;
        invalidateSelf();
        return true;
    L15:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r3) {
        boolean r02 = super.onLevelChange(r3);
        if (m2499T() == false) goto L6;
        r02 = r02 | this.f3791G.setLevel(r3);
    L6:
        if (m2498S() == false) goto L9;
        r02 = r02 | this.f3803S.setLevel(r3);
    L9:
        if (m2500U() == false) goto L11;
        r02 = r02 | this.f3796L.setLevel(r3);
    L11:
        if (r02 == false) goto L13;
        invalidateSelf();
    L13:
        return r02;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
        if (this.f3790F0 == false) goto L6;
        super.onStateChange(r2);
    L6:
        return m2507w(r2, this.f3837y0);
    }

    /* JADX INFO: renamed from: p */
    public final void m2502p(Rect r6, RectF r7) {
        r7.setEmpty();
        if (m2499T() == false) goto L5;
    L6:
        float r02 = this.f3807W + this.f3808X;
        if (this.f3828r0 == false) goto L9;
        Drawable r1 = this.f3803S;
    L10:
        float r2 = this.f3793I;
        if (r2 > 0.0f) goto L15;
        if (r1 == null) goto L15;
        r2 = r1.getIntrinsicWidth();
    L15:
        if (AbstractC1112b.m2628a(this) != 0) goto L17;
        float r12 = r6.left + r02;
        r7.left = r12;
        r7.right = r12 + r2;
    L19:
        if (this.f3828r0 == false) goto L21;
        Drawable r03 = this.f3803S;
    L22:
        float r13 = this.f3793I;
        if (r13 > 0.0f) goto L28;
        if (r03 == null) goto L28;
        r13 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f3815e0.getResources().getDisplayMetrics()));
        if (r03.getIntrinsicHeight() > r13) goto L28;
        r13 = r03.getIntrinsicHeight();
    L28:
        float r62 = r6.exactCenterY() - (r13 / 2.0f);
        r7.top = r62;
        r7.bottom = r62 + r13;
        return;
    L21:
        r03 = this.f3791G;
        goto L22
    L17:
        float r14 = r6.right - r02;
        r7.right = r14;
        r7.left = r14 - r2;
        goto L19
    L9:
        r1 = this.f3791G;
        goto L10
    L5:
        if (m2498S() == true) goto L6;
    }

    /* JADX INFO: renamed from: q */
    public final float m2503q() {
        if (m2499T() == false) goto L5;
    L8:
        float r02 = this.f3808X;
        if (this.f3828r0 == false) goto L11;
        Drawable r2 = this.f3803S;
    L12:
        float r3 = this.f3793I;
        if (r3 > 0.0f) goto L17;
        if (r2 == null) goto L17;
        r3 = r2.getIntrinsicWidth();
    L17:
        return (r3 + r02) + this.f3809Y;
    L11:
        r2 = this.f3791G;
        goto L12
    L5:
        if (m2498S() == true) goto L8;
        return 0.0f;
    }

    /* JADX INFO: renamed from: r */
    public final float m2504r() {
        if (m2500U() == true) goto L5;
        return 0.0f;
    L5:
        return (this.f3812b0 + this.f3799O) + this.f3813c0;
    }

    /* JADX INFO: renamed from: s */
    public final float m2505s() {
        if (this.f3790F0 == false) goto L6;
        return this.f4312a.f4290a.f4351e.mo2634a(m2647g());
    L6:
        return this.f3779A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.scheduleDrawable(this, r2, r3);
        return;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        if (this.f3830t0 == r2) goto L6;
        this.f3830t0 = r2;
        invalidateSelf();
        return;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        if (this.f3831u0 == r2) goto L6;
        this.f3831u0 = r2;
        invalidateSelf();
        return;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        if (this.f3833w0 == r2) goto L6;
        this.f3833w0 = r2;
        onStateChange(getState());
        return;
    }

    @Override // p089x0.C1123g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r4) {
        if (this.f3835x0 == r4) goto L12;
        this.f3835x0 = r4;
        ColorStateList r02 = this.f3833w0;
        if (r02 == null) goto L9;
        if (r4 == null) goto L9;
        PorterDuffColorFilter r1 = new PorterDuffColorFilter(r02.getColorForState(getState(), 0), r4);
    L10:
        this.f3832v0 = r1;
        invalidateSelf();
        return;
    L9:
        r1 = null;
        goto L10
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r3, boolean r4) {
        boolean r02 = super.setVisible(r3, r4);
        if (m2499T() == false) goto L6;
        r02 = r02 | this.f3791G.setVisible(r3, r4);
    L6:
        if (m2498S() == false) goto L9;
        r02 = r02 | this.f3803S.setVisible(r3, r4);
    L9:
        if (m2500U() == false) goto L11;
        r02 = r02 | this.f3796L.setVisible(r3, r4);
    L11:
        if (r02 == false) goto L13;
        invalidateSelf();
    L13:
        return r02;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.unscheduleDrawable(this, r2);
        return;
    }

    /* JADX INFO: renamed from: v */
    public final void m2506v() {
        InterfaceC1029e r02 = (InterfaceC1029e) this.f3782B0.get();
        if (r02 == null) goto L6;
        Chip r03 = (Chip) r02;
        r03.m1869b(r03.f2381p);
        r03.requestLayout();
        r03.invalidateOutline();
        return;
    }

    /* JADX INFO: renamed from: w */
    public final boolean m2507w(int[] r12, int[] r13) {
        boolean r02 = super.onStateChange(r12);
        ColorStateList r1 = this.f3834x;
        if (r1 == null) goto L5;
        int r14 = r1.getColorForState(r12, this.f3822l0);
    L6:
        int r15 = m2644c(r14);
        boolean r4 = true;
        if (this.f3822l0 == r15) goto L9;
        this.f3822l0 = r15;
        r02 = true;
    L9:
        ColorStateList r3 = this.f3836y;
        if (r3 == null) goto L12;
        int r32 = r3.getColorForState(r12, this.f3823m0);
    L13:
        int r33 = m2644c(r32);
        if (this.f3823m0 == r33) goto L16;
        this.f3823m0 = r33;
        r02 = true;
    L16:
        int r16 = AbstractC1100a.m2593b(r33, r15);
        if (this.f3824n0 == r16) goto L19;
        boolean r34 = true;
    L21:
        if (this.f4312a.f4292c != null) goto L23;
        boolean r5 = true;
    L25:
        if ((r34 | r5) == false) goto L27;
        this.f3824n0 = r16;
        m2651k(ColorStateList.valueOf(r16));
        r02 = true;
    L27:
        ColorStateList r17 = this.f3781B;
        if (r17 == null) goto L30;
        int r18 = r17.getColorForState(r12, this.f3825o0);
    L32:
        if (this.f3825o0 == r18) goto L35;
        this.f3825o0 = r18;
        r02 = true;
    L35:
        if (this.f3780A0 == null) goto L57;
        int r19 = r12.length;
        boolean r35 = false;
        int r52 = 0;
        boolean r6 = false;
        boolean r7 = false;
    L38:
        if (r52 >= r19) goto L52;
        int r9 = r12[r52];
        if (r9 != 16842910) goto L43;
        r6 = true;
    L51:
        r52 = r52 + 1;
        goto L38
    L43:
        if (r9 != 16842908) goto L46;
    L44:
        r7 = true;
        goto L51
    L46:
        if (r9 == 16842919) goto L44;
        if (r9 != 16843623) goto L51;
    L52:
        if (r6 == false) goto L55;
        if (r7 == false) goto L55;
        r35 = true;
    L55:
        if (r35 == false) goto L57;
        int r110 = this.f3780A0.getColorForState(r12, this.f3826p0);
    L59:
        if (this.f3826p0 == r110) goto L63;
        this.f3826p0 = r110;
        if (this.f3839z0 == false) goto L63;
        r02 = true;
    L63:
        C1099d r111 = this.f3821k0.f4177f;
        if (r111 == null) goto L68;
        ColorStateList r112 = r111.f4242j;
        if (r112 == null) goto L68;
        int r113 = r112.getColorForState(r12, this.f3827q0);
    L70:
        if (this.f3827q0 == r113) goto L72;
        this.f3827q0 = r113;
        r02 = true;
    L72:
        int[] r114 = getState();
        if (r114 == null) goto L83;
        int r36 = r114.length;
        int r53 = 0;
    L76:
        if (r53 >= r36) goto L83;
        if (r114[r53] == 16842912) goto L80;
        r53 = r53 + 1;
        goto L76
    L80:
        if (this.f3801Q == false) goto L83;
        boolean r115 = true;
    L85:
        if (this.f3828r0 != r115) goto L87;
    L92:
        boolean r116 = false;
    L93:
        ColorStateList r37 = this.f3833w0;
        if (r37 == null) goto L96;
        int r38 = r37.getColorForState(r12, this.f3829s0);
    L98:
        if (this.f3829s0 == r38) goto L106;
        this.f3829s0 = r38;
        ColorStateList r03 = this.f3833w0;
        PorterDuff.Mode r39 = this.f3835x0;
        if (r03 == null) goto L104;
        if (r39 == null) goto L104;
        PorterDuffColorFilter r54 = new PorterDuffColorFilter(r03.getColorForState(getState(), 0), r39);
    L105:
        this.f3832v0 = r54;
    L108:
        if (m2479u(this.f3791G) == false) goto L111;
        r4 = r4 | this.f3791G.setState(r12);
    L111:
        if (m2479u(this.f3803S) == false) goto L114;
        r4 = r4 | this.f3803S.setState(r12);
    L114:
        if (m2479u(this.f3796L) == false) goto L117;
        int[] r04 = new int[r12.length + r13.length];
        System.arraycopy(r12, 0, r04, 0, r12.length);
        System.arraycopy(r13, 0, r04, r12.length, r13.length);
        r4 = r4 | this.f3796L.setState(r04);
    L117:
        if (m2479u(this.f3797M) == false) goto L119;
        r4 = r4 | this.f3797M.setState(r13);
    L119:
        if (r4 == false) goto L121;
        invalidateSelf();
    L121:
        if (r116 == false) goto L123;
        m2506v();
    L123:
        return r4;
    L104:
        r54 = null;
        goto L105
    L106:
        r4 = r02;
        goto L108
    L96:
        r38 = 0;
        goto L98
    L87:
        if (this.f3803S == null) goto L92;
        float r05 = m2503q();
        this.f3828r0 = r115;
        if (r05 == m2503q()) goto L91;
        r02 = true;
        r116 = true;
        goto L93
    L91:
        r116 = false;
        r02 = true;
    L83:
        r115 = false;
    L68:
        r113 = 0;
    L57:
        r110 = 0;
        goto L59
    L30:
        r18 = 0;
        goto L32
    L23:
        r5 = false;
        goto L25
    L19:
        r34 = false;
        goto L21
    L12:
        r32 = 0;
        goto L13
    L5:
        r14 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: x */
    public final void m2508x(boolean r2) {
        if (this.f3801Q == r2) goto L13;
        this.f3801Q = r2;
        float r02 = m2503q();
        if (r2 == false) goto L7;
    L9:
        float r22 = m2503q();
        invalidateSelf();
        if (r02 == r22) goto L14;
        m2506v();
        return;
    L14:
        return;
    L7:
        if (this.f3828r0 == false) goto L9;
        this.f3828r0 = false;
        goto L9
    }

    /* JADX INFO: renamed from: y */
    public final void m2509y(Drawable r3) {
        if (this.f3803S == r3) goto L8;
        float r02 = m2503q();
        this.f3803S = r3;
        float r32 = m2503q();
        m2477V(this.f3803S);
        m2501o(this.f3803S);
        invalidateSelf();
        if (r02 == r32) goto L9;
        m2506v();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: z */
    public final void m2510z(ColorStateList r3) {
        if (this.f3804T == r3) goto L13;
        this.f3804T = r3;
        if (this.f3802R == false) goto L11;
        Drawable r02 = this.f3803S;
        if (r02 == null) goto L11;
        if (this.f3801Q == false) goto L11;
        AbstractC1111a.m2626h(r02, r3);
    L11:
        onStateChange(getState());
        return;
    }
}
