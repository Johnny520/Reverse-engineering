package p000;

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

/* JADX INFO: renamed from: o9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2309o9 extends C1021Xq implements Drawable.Callback, InterfaceC2490sA {

    /* JADX INFO: renamed from: O0 */
    public static final int[] f8090O0 = null;

    /* JADX INFO: renamed from: P0 */
    public static final ShapeDrawable f8091P0 = null;

    /* JADX INFO: renamed from: A0 */
    public boolean f8092A0;

    /* JADX INFO: renamed from: B0 */
    public int f8093B0;

    /* JADX INFO: renamed from: C0 */
    public int f8094C0;

    /* JADX INFO: renamed from: D0 */
    public ColorFilter f8095D0;

    /* JADX INFO: renamed from: E0 */
    public PorterDuffColorFilter f8096E0;

    /* JADX INFO: renamed from: F0 */
    public ColorStateList f8097F0;

    /* JADX INFO: renamed from: G */
    public ColorStateList f8098G;

    /* JADX INFO: renamed from: G0 */
    public PorterDuff.Mode f8099G0;

    /* JADX INFO: renamed from: H */
    public ColorStateList f8100H;

    /* JADX INFO: renamed from: H0 */
    public int[] f8101H0;

    /* JADX INFO: renamed from: I */
    public float f8102I;

    /* JADX INFO: renamed from: I0 */
    public ColorStateList f8103I0;

    /* JADX INFO: renamed from: J */
    public float f8104J;

    /* JADX INFO: renamed from: J0 */
    public WeakReference f8105J0;

    /* JADX INFO: renamed from: K */
    public ColorStateList f8106K;

    /* JADX INFO: renamed from: K0 */
    public TextUtils.TruncateAt f8107K0;

    /* JADX INFO: renamed from: L */
    public float f8108L;

    /* JADX INFO: renamed from: L0 */
    public boolean f8109L0;

    /* JADX INFO: renamed from: M */
    public ColorStateList f8110M;

    /* JADX INFO: renamed from: M0 */
    public int f8111M0;

    /* JADX INFO: renamed from: N */
    public CharSequence f8112N;

    /* JADX INFO: renamed from: N0 */
    public boolean f8113N0;

    /* JADX INFO: renamed from: O */
    public boolean f8114O;

    /* JADX INFO: renamed from: P */
    public Drawable f8115P;

    /* JADX INFO: renamed from: Q */
    public ColorStateList f8116Q;

    /* JADX INFO: renamed from: R */
    public float f8117R;

    /* JADX INFO: renamed from: S */
    public boolean f8118S;

    /* JADX INFO: renamed from: T */
    public boolean f8119T;

    /* JADX INFO: renamed from: U */
    public Drawable f8120U;

    /* JADX INFO: renamed from: V */
    public RippleDrawable f8121V;

    /* JADX INFO: renamed from: W */
    public ColorStateList f8122W;

    /* JADX INFO: renamed from: X */
    public float f8123X;

    /* JADX INFO: renamed from: Y */
    public SpannableStringBuilder f8124Y;

    /* JADX INFO: renamed from: Z */
    public boolean f8125Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f8126a0;

    /* JADX INFO: renamed from: b0 */
    public Drawable f8127b0;

    /* JADX INFO: renamed from: c0 */
    public ColorStateList f8128c0;

    /* JADX INFO: renamed from: d0 */
    public C2162ks f8129d0;

    /* JADX INFO: renamed from: e0 */
    public C2162ks f8130e0;

    /* JADX INFO: renamed from: f0 */
    public float f8131f0;

    /* JADX INFO: renamed from: g0 */
    public float f8132g0;

    /* JADX INFO: renamed from: h0 */
    public float f8133h0;

    /* JADX INFO: renamed from: i0 */
    public float f8134i0;

    /* JADX INFO: renamed from: j0 */
    public float f8135j0;

    /* JADX INFO: renamed from: k0 */
    public float f8136k0;

    /* JADX INFO: renamed from: l0 */
    public float f8137l0;

    /* JADX INFO: renamed from: m0 */
    public float f8138m0;

    /* JADX INFO: renamed from: n0 */
    public final Context f8139n0;

    /* JADX INFO: renamed from: o0 */
    public final Paint f8140o0;

    /* JADX INFO: renamed from: p0 */
    public final Paint.FontMetrics f8141p0;

    /* JADX INFO: renamed from: q0 */
    public final RectF f8142q0;

    /* JADX INFO: renamed from: r0 */
    public final PointF f8143r0;

    /* JADX INFO: renamed from: s0 */
    public final Path f8144s0;

    /* JADX INFO: renamed from: t0 */
    public final C2533tA f8145t0;

    /* JADX INFO: renamed from: u0 */
    public int f8146u0;

    /* JADX INFO: renamed from: v0 */
    public int f8147v0;

    /* JADX INFO: renamed from: w0 */
    public int f8148w0;

    /* JADX INFO: renamed from: x0 */
    public int f8149x0;

    /* JADX INFO: renamed from: y0 */
    public int f8150y0;

    /* JADX INFO: renamed from: z0 */
    public int f8151z0;

    static {
        f8090O0 = new int[]{R.attr.state_enabled};
        f8091P0 = new ShapeDrawable(new OvalShape());
    }

    public C2309o9(Context r3, AttributeSet r4) {
        super(r3, r4, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action);
        this.f8104J = -1.0f;
        this.f8140o0 = new Paint(1);
        this.f8141p0 = new Paint.FontMetrics();
        this.f8142q0 = new RectF();
        this.f8143r0 = new PointF();
        this.f8144s0 = new Path();
        this.f8094C0 = 255;
        this.f8099G0 = PorterDuff.Mode.SRC_IN;
        this.f8105J0 = new WeakReference(null);
        m1925k(r3);
        this.f8139n0 = r3;
        C2533tA r42 = new C2533tA(this);
        this.f8145t0 = r42;
        this.f8112N = "";
        r42.f8833a.density = r3.getResources().getDisplayMetrics().density;
        int[] r32 = f8090O0;
        setState(r32);
        m4705R(r32);
        this.f8109L0 = true;
        f8091P0.setTint(-1);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m4685b0(Drawable r1) {
        if (r1 == null) goto L5;
        r1.setCallback(null);
        return;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m4686y(ColorStateList r0) {
        if (r0 != null) goto L4;
        return false;
    L4:
        if (r0.isStateful() == false) goto L9;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: z */
    public static boolean m4687z(Drawable r0) {
        if (r0 != null) goto L4;
        return false;
    L4:
        if (r0.isStateful() == false) goto L9;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m4688A() {
        InterfaceC2266n9 r0 = (InterfaceC2266n9) this.f8105J0.get();
        if (r0 == null) goto L6;
        Chip r02 = (Chip) r0;
        r02.m2461b(r02.f4522p);
        r02.requestLayout();
        r02.invalidateOutline();
        return;
    }

    /* JADX INFO: renamed from: B */
    public final boolean m4689B(int[] r10, int[] r11) {
        boolean r0 = super.onStateChange(r10);
        ColorStateList r1 = this.f8098G;
        if (r1 == null) goto L5;
        int r12 = r1.getColorForState(r10, this.f8146u0);
    L6:
        int r13 = m1917c(r12);
        boolean r4 = true;
        if (this.f8146u0 == r13) goto L9;
        this.f8146u0 = r13;
        r0 = true;
    L9:
        ColorStateList r3 = this.f8100H;
        if (r3 == null) goto L12;
        int r32 = r3.getColorForState(r10, this.f8147v0);
    L13:
        int r33 = m1917c(r32);
        if (this.f8147v0 == r33) goto L16;
        this.f8147v0 = r33;
        r0 = true;
    L16:
        int r14 = AbstractC2797za.m5365c(r33, r13);
        if (this.f8148w0 == r14) goto L19;
        boolean r34 = true;
    L21:
        if (this.f3241b.f2905d != null) goto L23;
        boolean r5 = true;
    L25:
        if ((r34 | r5) == false) goto L27;
        this.f8148w0 = r14;
        m1928n(ColorStateList.valueOf(r14));
        r0 = true;
    L27:
        ColorStateList r15 = this.f8106K;
        if (r15 == null) goto L30;
        int r16 = r15.getColorForState(r10, this.f8149x0);
    L32:
        if (this.f8149x0 == r16) goto L35;
        this.f8149x0 = r16;
        r0 = true;
    L35:
        if (this.f8103I0 == null) goto L54;
        int r17 = r10.length;
        int r35 = 0;
        boolean r52 = false;
        boolean r6 = false;
    L37:
        if (r35 >= r17) goto L51;
        int r7 = r10[r35];
        if (r7 != 16842910) goto L42;
        r52 = true;
    L50:
        r35 = r35 + 1;
        goto L37
    L42:
        if (r7 != 16842908) goto L45;
    L43:
        r6 = true;
        goto L50
    L45:
        if (r7 == 16842919) goto L43;
        if (r7 != 16843623) goto L50;
    L51:
        if (r52 == false) goto L54;
        if (r6 == false) goto L54;
        int r18 = this.f8103I0.getColorForState(r10, this.f8150y0);
    L56:
        if (this.f8150y0 == r18) goto L58;
        this.f8150y0 = r18;
    L58:
        C2404qA r19 = this.f8145t0.f8838f;
        if (r19 == null) goto L63;
        ColorStateList r110 = r19.f8432k;
        if (r110 == null) goto L63;
        int r111 = r110.getColorForState(r10, this.f8151z0);
    L65:
        if (this.f8151z0 == r111) goto L67;
        this.f8151z0 = r111;
        r0 = true;
    L67:
        int[] r112 = getState();
        if (r112 == null) goto L78;
        int r36 = r112.length;
        int r53 = 0;
    L71:
        if (r53 >= r36) goto L78;
        if (r112[r53] == 16842912) goto L75;
        r53 = r53 + 1;
        goto L71
    L75:
        if (this.f8125Z == false) goto L78;
        boolean r113 = true;
    L80:
        if (this.f8092A0 != r113) goto L82;
    L87:
        boolean r114 = false;
    L88:
        ColorStateList r37 = this.f8097F0;
        if (r37 == null) goto L91;
        int r38 = r37.getColorForState(r10, this.f8093B0);
    L93:
        if (this.f8093B0 == r38) goto L101;
        this.f8093B0 = r38;
        ColorStateList r02 = this.f8097F0;
        PorterDuff.Mode r39 = this.f8099G0;
        if (r02 == null) goto L99;
        if (r39 == null) goto L99;
        PorterDuffColorFilter r54 = new PorterDuffColorFilter(r02.getColorForState(getState(), 0), r39);
    L100:
        this.f8096E0 = r54;
    L103:
        if (m4687z(this.f8115P) == false) goto L106;
        r4 = r4 | this.f8115P.setState(r10);
    L106:
        if (m4687z(this.f8127b0) == false) goto L109;
        r4 = r4 | this.f8127b0.setState(r10);
    L109:
        if (m4687z(this.f8120U) == false) goto L112;
        int[] r03 = new int[r10.length + r11.length];
        System.arraycopy(r10, 0, r03, 0, r10.length);
        System.arraycopy(r11, 0, r03, r10.length, r11.length);
        r4 = r4 | this.f8120U.setState(r03);
    L112:
        if (m4687z(this.f8121V) == false) goto L114;
        r4 = r4 | this.f8121V.setState(r11);
    L114:
        if (r4 == false) goto L116;
        invalidateSelf();
    L116:
        if (r114 == false) goto L118;
        m4688A();
    L118:
        return r4;
    L99:
        r54 = null;
        goto L100
    L101:
        r4 = r0;
        goto L103
    L91:
        r38 = 0;
        goto L93
    L82:
        if (this.f8127b0 == null) goto L87;
        float r04 = m4717v();
        this.f8092A0 = r113;
        if (r04 == m4717v()) goto L86;
        r0 = true;
        r114 = true;
        goto L88
    L86:
        r114 = false;
        r0 = true;
    L78:
        r113 = false;
    L63:
        r111 = 0;
    L54:
        r18 = 0;
        goto L56
    L30:
        r16 = 0;
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
        r12 = 0;
        goto L6
    }

    /* JADX INFO: renamed from: C */
    public final void m4690C(boolean r2) {
        if (this.f8125Z == r2) goto L13;
        this.f8125Z = r2;
        float r0 = m4717v();
        if (r2 == false) goto L7;
    L9:
        float r22 = m4717v();
        invalidateSelf();
        if (r0 == r22) goto L14;
        m4688A();
        return;
    L14:
        return;
    L7:
        if (this.f8092A0 == false) goto L9;
        this.f8092A0 = false;
        goto L9
    }

    /* JADX INFO: renamed from: D */
    public final void m4691D(Drawable r3) {
        if (this.f8127b0 == r3) goto L8;
        float r0 = m4717v();
        this.f8127b0 = r3;
        float r32 = m4717v();
        m4685b0(this.f8127b0);
        m4715t(this.f8127b0);
        invalidateSelf();
        if (r0 == r32) goto L9;
        m4688A();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: E */
    public final void m4692E(ColorStateList r3) {
        if (this.f8128c0 == r3) goto L13;
        this.f8128c0 = r3;
        if (this.f8126a0 == false) goto L11;
        Drawable r0 = this.f8127b0;
        if (r0 == null) goto L11;
        if (this.f8125Z == false) goto L11;
        r0.setTintList(r3);
    L11:
        onStateChange(getState());
        return;
    }

    /* JADX INFO: renamed from: F */
    public final void m4693F(boolean r2) {
        if (this.f8126a0 == r2) goto L11;
        boolean r0 = m4712Y();
        this.f8126a0 = r2;
        boolean r22 = m4712Y();
        if (r0 == r22) goto L12;
        if (r22 == false) goto L8;
        m4715t(this.f8127b0);
    L9:
        invalidateSelf();
        m4688A();
        return;
    L8:
        m4685b0(this.f8127b0);
        goto L9
    L12:
        return;
    }

    /* JADX INFO: renamed from: G */
    public final void m4694G(float r3) {
        if (this.f8104J == r3) goto L6;
        this.f8104J = r3;
        C0685Px r0 = this.f3241b.f2902a.m1516f();
        r0.f2196e = new C2436r(r3);
        r0.f2197f = new C2436r(r3);
        r0.f2198g = new C2436r(r3);
        r0.f2199h = new C2436r(r3);
        setShapeAppearanceModel(r0.m1383a());
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: H */
    public final void m4695H(Drawable r4) {
        Object r0 = this.f8115P;
        Drawable r1 = null;
        if (r0 == null) goto L7;
        boolean r2 = r0 instanceof InterfaceC0704QF;
        ?? r02 = r0;
        if (r2 == false) goto L8;
        InterfaceC0704QF r03 = (InterfaceC0704QF) r0;
        r02 = 0;
    L8:
        if (r02 == r4) goto L19;
        float r22 = m4717v();
        if (r4 == null) goto L12;
        r1 = r4.mutate();
    L12:
        this.f8115P = r1;
        float r42 = m4717v();
        m4685b0(r02);
        if (m4713Z() == false) goto L15;
        m4715t(this.f8115P);
    L15:
        invalidateSelf();
        if (r22 == r42) goto L20;
        m4688A();
        return;
    L20:
        return;
    L19:
        return;
    L7:
        r02 = 0;
        goto L8
    }

    /* JADX INFO: renamed from: I */
    public final void m4696I(float r2) {
        if (this.f8117R == r2) goto L8;
        float r0 = m4717v();
        this.f8117R = r2;
        float r22 = m4717v();
        invalidateSelf();
        if (r0 == r22) goto L9;
        m4688A();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: J */
    public final void m4697J(ColorStateList r2) {
        this.f8118S = true;
        if (this.f8116Q == r2) goto L9;
        this.f8116Q = r2;
        if (m4713Z() == false) goto L7;
        this.f8115P.setTintList(r2);
    L7:
        onStateChange(getState());
        return;
    }

    /* JADX INFO: renamed from: K */
    public final void m4698K(boolean r2) {
        if (this.f8114O == r2) goto L11;
        boolean r0 = m4713Z();
        this.f8114O = r2;
        boolean r22 = m4713Z();
        if (r0 == r22) goto L12;
        if (r22 == false) goto L8;
        m4715t(this.f8115P);
    L9:
        invalidateSelf();
        m4688A();
        return;
    L8:
        m4685b0(this.f8115P);
        goto L9
    L12:
        return;
    }

    /* JADX INFO: renamed from: L */
    public final void m4699L(ColorStateList r3) {
        if (this.f8106K == r3) goto L11;
        this.f8106K = r3;
        if (this.f8113N0 == false) goto L9;
        C0935Vq r0 = this.f3241b;
        if (r0.f2906e == r3) goto L9;
        r0.f2906e = r3;
        onStateChange(getState());
    L9:
        onStateChange(getState());
        return;
    }

    /* JADX INFO: renamed from: M */
    public final void m4700M(float r2) {
        if (this.f8108L == r2) goto L9;
        this.f8108L = r2;
        this.f8140o0.setStrokeWidth(r2);
        if (this.f8113N0 == false) goto L7;
        this.f3241b.f2912k = r2;
        invalidateSelf();
    L7:
        invalidateSelf();
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: N */
    public final void m4701N(Drawable r6) {
        Object r0 = this.f8120U;
        Drawable r1 = null;
        if (r0 == null) goto L7;
        boolean r2 = r0 instanceof InterfaceC0704QF;
        ?? r02 = r0;
        if (r2 == false) goto L8;
        InterfaceC0704QF r03 = (InterfaceC0704QF) r0;
        r02 = 0;
    L8:
        if (r02 == r6) goto L23;
        float r22 = m4718w();
        if (r6 == null) goto L12;
        r1 = r6.mutate();
    L12:
        this.f8120U = r1;
        ColorStateList r12 = this.f8110M;
        if (r12 != null) goto L16;
        r12 = ColorStateList.valueOf(0);
    L16:
        this.f8121V = new RippleDrawable(r12, this.f8120U, f8091P0);
        float r62 = m4718w();
        m4685b0(r02);
        if (m4714a0() == false) goto L19;
        m4715t(this.f8120U);
    L19:
        invalidateSelf();
        if (r22 == r62) goto L24;
        m4688A();
        return;
    L24:
        return;
    L23:
        return;
    L7:
        r02 = 0;
        goto L8
    }

    /* JADX INFO: renamed from: O */
    public final void m4702O(float r2) {
        if (this.f8137l0 == r2) goto L8;
        this.f8137l0 = r2;
        invalidateSelf();
        if (m4714a0() == false) goto L9;
        m4688A();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: P */
    public final void m4703P(float r2) {
        if (this.f8123X == r2) goto L8;
        this.f8123X = r2;
        invalidateSelf();
        if (m4714a0() == false) goto L9;
        m4688A();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: Q */
    public final void m4704Q(float r2) {
        if (this.f8136k0 == r2) goto L8;
        this.f8136k0 = r2;
        invalidateSelf();
        if (m4714a0() == false) goto L9;
        m4688A();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m4705R(int[] r2) {
        if (Arrays.equals(this.f8101H0, r2) == true) goto L8;
        this.f8101H0 = r2;
        if (m4714a0() == true) goto L7;
        return false;
    L7:
        return m4689B(getState(), r2);
    L8:
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final void m4706S(ColorStateList r2) {
        if (this.f8122W == r2) goto L9;
        this.f8122W = r2;
        if (m4714a0() == false) goto L7;
        this.f8120U.setTintList(r2);
    L7:
        onStateChange(getState());
        return;
    }

    /* JADX INFO: renamed from: T */
    public final void m4707T(boolean r2) {
        if (this.f8119T == r2) goto L11;
        boolean r0 = m4714a0();
        this.f8119T = r2;
        boolean r22 = m4714a0();
        if (r0 == r22) goto L12;
        if (r22 == false) goto L8;
        m4715t(this.f8120U);
    L9:
        invalidateSelf();
        m4688A();
        return;
    L8:
        m4685b0(this.f8120U);
        goto L9
    L12:
        return;
    }

    /* JADX INFO: renamed from: U */
    public final void m4708U(float r2) {
        if (this.f8133h0 == r2) goto L8;
        float r0 = m4717v();
        this.f8133h0 = r2;
        float r22 = m4717v();
        invalidateSelf();
        if (r0 == r22) goto L9;
        m4688A();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: V */
    public final void m4709V(float r2) {
        if (this.f8132g0 == r2) goto L8;
        float r0 = m4717v();
        this.f8132g0 = r2;
        float r22 = m4717v();
        invalidateSelf();
        if (r0 == r22) goto L9;
        m4688A();
        return;
    L9:
        return;
    }

    /* JADX INFO: renamed from: W */
    public final void m4710W(ColorStateList r2) {
        if (this.f8110M == r2) goto L6;
        this.f8110M = r2;
        this.f8103I0 = null;
        onStateChange(getState());
        return;
    }

    /* JADX INFO: renamed from: X */
    public final void m4711X(C2404qA r6) {
        C2533tA r0 = this.f8145t0;
        C2180l9 r1 = r0.f8834b;
        TextPaint r2 = r0.f8833a;
        if (r0.f8838f == r6) goto L14;
        r0.f8838f = r6;
        if (r6 == null) goto L10;
        Context r3 = this.f8139n0;
        r6.m4841e(r3, r2, r1);
        InterfaceC2490sA r4 = (InterfaceC2490sA) r0.f8837e.get();
        if (r4 == null) goto L9;
        r2.drawableState = r4.getState();
    L9:
        r6.m4840d(r3, r2, r1);
        r0.f8836d = true;
    L10:
        InterfaceC2490sA r62 = (InterfaceC2490sA) r0.f8837e.get();
        if (r62 == null) goto L15;
        C2309o9 r02 = (C2309o9) r62;
        r02.m4688A();
        r02.invalidateSelf();
        r02.onStateChange(r62.getState());
        return;
    L15:
        return;
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m4712Y() {
        if (this.f8126a0 == true) goto L5;
        return false;
    L5:
        if (this.f8127b0 != null) goto L7;
        return false;
    L7:
        if (this.f8092A0 == false) goto L13;
        return true;
    L13:
        return false;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m4713Z() {
        if (this.f8114O == true) goto L5;
        return false;
    L5:
        if (this.f8115P == null) goto L10;
        return true;
    L10:
        return false;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m4714a0() {
        if (this.f8119T == true) goto L5;
        return false;
    L5:
        if (this.f8120U == null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void draw(Canvas r23) {
        Rect r7 = getBounds();
        if (r7.isEmpty() == true) goto L97;
        int r6 = this.f8094C0;
        if (r6 == 0) goto L97;
        if (r6 >= 255) goto L10;
        Canvas r1 = r23;
        int r10 = r1.saveLayerAlpha(r7.left, r7.top, r7.right, r7.bottom, r6);
    L11:
        boolean r2 = this.f8113N0;
        Paint r22 = this.f8140o0;
        RectF r11 = this.f8142q0;
        if (r2 == true) goto L15;
        r22.setColor(this.f8146u0);
        r22.setStyle(Paint.Style.FILL);
        r11.set(r7);
        r1.drawRoundRect(r11, m4719x(), m4719x(), r22);
    L15:
        if (this.f8113N0 == true) goto L22;
        r22.setColor(this.f8147v0);
        r22.setStyle(Paint.Style.FILL);
        ColorFilter r3 = this.f8095D0;
        if (r3 != null) goto L20;
        r3 = this.f8096E0;
    L20:
        r22.setColorFilter(r3);
        r11.set(r7);
        r1.drawRoundRect(r11, m4719x(), m4719x(), r22);
    L22:
        if (this.f8113N0 == false) goto L25;
        super.draw(r23);
    L25:
        if (this.f8108L > 0.0f) goto L27;
    L36:
        r22.setColor(this.f8150y0);
        r22.setStyle(Paint.Style.FILL);
        r11.set(r7);
        if (this.f8113N0 == true) goto L40;
        r1.drawRoundRect(r11, m4719x(), m4719x(), r22);
        float r21 = 2.0f;
    L42:
        if (m4713Z() == false) goto L45;
        m4716u(r7, r11);
        float r0 = r11.left;
        float r24 = r11.top;
        r1.translate(r0, r24);
        this.f8115P.setBounds(0, 0, (int) r11.width(), (int) r11.height());
        this.f8115P.draw(r1);
        r1.translate(-r0, -r24);
    L45:
        if (m4712Y() == false) goto L48;
        m4716u(r7, r11);
        float r02 = r11.left;
        float r25 = r11.top;
        r1.translate(r02, r25);
        this.f8127b0.setBounds(0, 0, (int) r11.width(), (int) r11.height());
        this.f8127b0.draw(r1);
        r1.translate(-r02, -r25);
    L48:
        if (this.f8109L0 == false) goto L84;
        if (this.f8112N == null) goto L84;
        PointF r03 = this.f8143r0;
        r03.set(0.0f, 0.0f);
        Paint.Align r26 = Paint.Align.LEFT;
        CharSequence r32 = this.f8112N;
        C2533tA r4 = this.f8145t0;
        if (r32 == null) goto L58;
        float r5 = (m4717v() + this.f8131f0) + this.f8134i0;
        if (getLayoutDirection() != 0) goto L56;
        r03.x = r7.left + r5;
    L57:
        float r33 = r7.centerY();
        TextPaint r52 = r4.f8833a;
        Paint.FontMetrics r62 = this.f8141p0;
        r52.getFontMetrics(r62);
        r03.y = r33 - ((r62.descent + r62.ascent) / r21);
        goto L58
    L56:
        r03.x = r7.right - r5;
        r26 = Paint.Align.RIGHT;
    L58:
        r11.setEmpty();
        if (this.f8112N == null) goto L65;
        float r53 = (m4717v() + this.f8131f0) + this.f8134i0;
        float r63 = (m4718w() + this.f8138m0) + this.f8135j0;
        if (getLayoutDirection() != 0) goto L63;
        r11.left = r7.left + r53;
        r11.right = r7.right - r63;
    L64:
        r11.top = r7.top;
        r11.bottom = r7.bottom;
        goto L65
    L63:
        r11.left = r7.left + r63;
        r11.right = r7.right - r53;
    L65:
        C2404qA r34 = r4.f8838f;
        TextPaint r64 = r4.f8833a;
        if (r34 == null) goto L68;
        r64.drawableState = getState();
        r4.f8838f.m4840d(this.f8139n0, r64, r4.f8834b);
    L68:
        r64.setTextAlign(r26);
        if (Math.round(r4.m5014a(this.f8112N.toString())) <= Math.round(r11.width())) goto L71;
        boolean r12 = true;
    L72:
        if (r12 == false) goto L74;
        int r27 = r1.save();
        r1.clipRect(r11);
        int r14 = r27;
    L75:
        CharSequence r28 = this.f8112N;
        if (r12 == true) goto L78;
    L80:
        r23.drawText(r28, 0, r28.length(), r03.x, r03.y, r64);
        r1 = r23;
        if (r12 == false) goto L84;
        r1.restoreToCount(r14);
        goto L84
    L78:
        if (this.f8107K0 == null) goto L80;
        r28 = TextUtils.ellipsize(r28, r64, r11.width(), this.f8107K0);
        goto L80
    L74:
        r14 = 0;
        goto L75
    L71:
        r12 = false;
    L84:
        if (m4714a0() == false) goto L94;
        r11.setEmpty();
        if (m4714a0() == false) goto L92;
        float r04 = this.f8138m0 + this.f8137l0;
        if (getLayoutDirection() != 0) goto L90;
        float r29 = r7.right - r04;
        r11.right = r29;
        r11.left = r29 - this.f8123X;
    L91:
        float r05 = r7.exactCenterY();
        float r210 = this.f8123X;
        float r06 = r05 - (r210 / r21);
        r11.top = r06;
        r11.bottom = r06 + r210;
        goto L92
    L90:
        float r211 = r7.left + r04;
        r11.left = r211;
        r11.right = r211 + this.f8123X;
    L92:
        float r07 = r11.left;
        float r212 = r11.top;
        r1.translate(r07, r212);
        this.f8120U.setBounds(0, 0, (int) r11.width(), (int) r11.height());
        this.f8121V.setBounds(this.f8120U.getBounds());
        this.f8121V.jumpToCurrentState();
        this.f8121V.draw(r1);
        r1.translate(-r07, -r212);
    L94:
        if (this.f8094C0 >= 255) goto L98;
        r1.restoreToCount(r10);
        return;
    L98:
        return;
    L40:
        RectF r35 = new RectF(r7);
        C0935Vq r42 = this.f3241b;
        C0728Qx r15 = r42.f2902a;
        float[] r54 = this.f3237B;
        float r43 = r42.f2911j;
        C0892Uq r65 = this.f3257r;
        C0813Sx r142 = this.f3258s;
        r21 = 2.0f;
        Path r13 = this.f8144s0;
        r142.m1615a(r15, r54, r43, r35, r65, r13);
        m1919e(r1, r22, r13, this.f3241b.f2902a, this.f3237B, m1921g());
        goto L42
    L27:
        if (this.f8113N0 == true) goto L36;
        r22.setColor(this.f8149x0);
        r22.setStyle(Paint.Style.STROKE);
        if (this.f8113N0 == true) goto L35;
        ColorFilter r36 = this.f8095D0;
        if (r36 != null) goto L34;
        r36 = this.f8096E0;
    L34:
        r22.setColorFilter(r36);
    L35:
        float r37 = r7.left;
        float r44 = this.f8108L / 2.0f;
        r11.set(r37 + r44, r7.top + r44, r7.right - r44, r7.bottom - r44);
        float r38 = this.f8104J - (this.f8108L / 2.0f);
        r1.drawRoundRect(r11, r38, r38, r22);
        goto L36
    L10:
        r1 = r23;
        r10 = 0;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f8094C0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.f8095D0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.f8102I;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float r0 = this.f8131f0;
        float r1 = (m4717v() + r0) + this.f8134i0;
        String r02 = this.f8112N.toString();
        float r03 = (this.f8145t0.m5014a(r02) + r1) + this.f8135j0;
        return Math.min(Math.round((m4718w() + r03) + this.f8138m0), this.f8111M0);
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void getOutline(Outline r9) {
        if (this.f8113N0 == false) goto L6;
        super.getOutline(r9);
        return;
    L6:
        Rect r0 = getBounds();
        if (r0.isEmpty() == true) goto L9;
        r9.setRoundRect(r0, this.f8104J);
        Outline r2 = r9;
    L10:
        r2.setAlpha(this.f8094C0 / 255.0f);
        return;
    L9:
        r2 = r9;
        r2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f8102I, this.f8104J);
        goto L10
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.invalidateDrawable(this);
        return;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (m4686y(this.f8098G) == false) goto L5;
        return true;
    L5:
        if (m4686y(this.f8100H) == false) goto L7;
        return true;
    L7:
        if (m4686y(this.f8106K) == true) goto L34;
        C2404qA r0 = this.f8145t0.f8838f;
        if (r0 == null) goto L16;
        ColorStateList r02 = r0.f8432k;
        if (r02 == null) goto L16;
        if (r02.isStateful() == false) goto L16;
        return true;
    L16:
        if (this.f8126a0 == false) goto L23;
        if (this.f8127b0 == null) goto L23;
        if (this.f8125Z == false) goto L23;
        return true;
    L23:
        if (m4687z(this.f8115P) == false) goto L25;
        return true;
    L25:
        if (m4687z(this.f8127b0) == false) goto L27;
        return true;
    L27:
        if (m4686y(this.f8097F0) == true) goto L39;
        return false;
    L39:
        return true;
    L34:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r3) {
        boolean r0 = super.onLayoutDirectionChanged(r3);
        if (m4713Z() == false) goto L6;
        r0 = r0 | this.f8115P.setLayoutDirection(r3);
    L6:
        if (m4712Y() == false) goto L9;
        r0 = r0 | this.f8127b0.setLayoutDirection(r3);
    L9:
        if (m4714a0() == false) goto L11;
        r0 = r0 | this.f8120U.setLayoutDirection(r3);
    L11:
        if (r0 == false) goto L15;
        invalidateSelf();
        return true;
    L15:
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int r3) {
        boolean r0 = super.onLevelChange(r3);
        if (m4713Z() == false) goto L6;
        r0 = r0 | this.f8115P.setLevel(r3);
    L6:
        if (m4712Y() == false) goto L9;
        r0 = r0 | this.f8127b0.setLevel(r3);
    L9:
        if (m4714a0() == false) goto L11;
        r0 = r0 | this.f8120U.setLevel(r3);
    L11:
        if (r0 == false) goto L13;
        invalidateSelf();
    L13:
        return r0;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
        if (this.f8113N0 == false) goto L6;
        super.onStateChange(r2);
    L6:
        return m4689B(r2, this.f8101H0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.scheduleDrawable(this, r2, r3);
        return;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        if (this.f8094C0 == r2) goto L6;
        this.f8094C0 = r2;
        invalidateSelf();
        return;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        if (this.f8095D0 == r2) goto L6;
        this.f8095D0 = r2;
        invalidateSelf();
        return;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        if (this.f8097F0 == r2) goto L6;
        this.f8097F0 = r2;
        onStateChange(getState());
        return;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r4) {
        if (this.f8099G0 == r4) goto L12;
        this.f8099G0 = r4;
        ColorStateList r0 = this.f8097F0;
        if (r0 == null) goto L9;
        if (r4 == null) goto L9;
        PorterDuffColorFilter r1 = new PorterDuffColorFilter(r0.getColorForState(getState(), 0), r4);
    L10:
        this.f8096E0 = r1;
        invalidateSelf();
        return;
    L9:
        r1 = null;
        goto L10
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r3, boolean r4) {
        boolean r0 = super.setVisible(r3, r4);
        if (m4713Z() == false) goto L6;
        r0 = r0 | this.f8115P.setVisible(r3, r4);
    L6:
        if (m4712Y() == false) goto L9;
        r0 = r0 | this.f8127b0.setVisible(r3, r4);
    L9:
        if (m4714a0() == false) goto L11;
        r0 = r0 | this.f8120U.setVisible(r3, r4);
    L11:
        if (r0 == false) goto L13;
        invalidateSelf();
    L13:
        return r0;
    }

    /* JADX INFO: renamed from: t */
    public final void m4715t(Drawable r3) {
        if (r3 == null) goto L21;
        r3.setCallback(this);
        r3.setLayoutDirection(getLayoutDirection());
        r3.setLevel(getLevel());
        r3.setVisible(isVisible(), false);
        if (r3 == this.f8120U) goto L7;
        Drawable r0 = this.f8115P;
        if (r3 != r0) goto L17;
        if (this.f8118S == false) goto L17;
        r0.setTintList(this.f8116Q);
    L17:
        if (r3.isStateful() == false) goto L20;
        r3.setState(getState());
        return;
    L20:
        return;
    L7:
        if (r3.isStateful() == false) goto L9;
        r3.setState(this.f8101H0);
    L9:
        r3.setTintList(this.f8122W);
        return;
    }

    /* JADX INFO: renamed from: u */
    public final void m4716u(Rect r6, RectF r7) {
        r7.setEmpty();
        if (m4713Z() == false) goto L5;
    L8:
        float r0 = this.f8131f0 + this.f8132g0;
        if (this.f8092A0 == false) goto L11;
        Drawable r1 = this.f8127b0;
    L12:
        float r2 = this.f8117R;
        if (r2 > 0.0f) goto L17;
        if (r1 == null) goto L17;
        r2 = r1.getIntrinsicWidth();
    L17:
        if (getLayoutDirection() != 0) goto L19;
        float r12 = r6.left + r0;
        r7.left = r12;
        r7.right = r12 + r2;
    L21:
        if (this.f8092A0 == false) goto L23;
        Drawable r02 = this.f8127b0;
    L24:
        float r13 = this.f8117R;
        if (r13 > 0.0f) goto L30;
        if (r02 == null) goto L30;
        r13 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f8139n0.getResources().getDisplayMetrics()));
        if (r02.getIntrinsicHeight() > r13) goto L30;
        r13 = r02.getIntrinsicHeight();
    L30:
        float r62 = r6.exactCenterY() - (r13 / 2.0f);
        r7.top = r62;
        r7.bottom = r62 + r13;
        return;
    L23:
        r02 = this.f8115P;
        goto L24
    L19:
        float r14 = r6.right - r0;
        r7.right = r14;
        r7.left = r14 - r2;
        goto L21
    L11:
        r1 = this.f8115P;
        goto L12
    L5:
        if (m4712Y() == true) goto L8;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.unscheduleDrawable(this, r2);
        return;
    }

    /* JADX INFO: renamed from: v */
    public final float m4717v() {
        if (m4713Z() == false) goto L5;
    L8:
        float r0 = this.f8132g0;
        if (this.f8092A0 == false) goto L11;
        Drawable r2 = this.f8127b0;
    L12:
        float r3 = this.f8117R;
        if (r3 > 0.0f) goto L17;
        if (r2 == null) goto L17;
        r3 = r2.getIntrinsicWidth();
    L17:
        return (r3 + r0) + this.f8133h0;
    L11:
        r2 = this.f8115P;
        goto L12
    L5:
        if (m4712Y() == true) goto L8;
        return 0.0f;
    }

    /* JADX INFO: renamed from: w */
    public final float m4718w() {
        if (m4714a0() == true) goto L5;
        return 0.0f;
    L5:
        return (this.f8136k0 + this.f8123X) + this.f8137l0;
    }

    /* JADX INFO: renamed from: x */
    public final float m4719x() {
        if (this.f8113N0 == false) goto L11;
        float[] r0 = this.f3237B;
        if (r0 == null) goto L9;
        return r0[3];
    L9:
        return this.f3241b.f2902a.f2328e.mo1563a(m1921g());
    L11:
        return this.f8104J;
    }
}
