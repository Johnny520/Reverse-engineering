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
    public static final int[] f8090O0 = {R.attr.state_enabled};

    /* JADX INFO: renamed from: P0 */
    public static final ShapeDrawable f8091P0 = new ShapeDrawable(new OvalShape());

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

    public C2309o9(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, io.github.cherrywechat.R.attr.chipStyle, io.github.cherrywechat.R.style.Widget_MaterialComponents_Chip_Action);
        this.f8104J = -1.0f;
        this.f8140o0 = new Paint(1);
        this.f8141p0 = new Paint.FontMetrics();
        this.f8142q0 = new RectF();
        this.f8143r0 = new PointF();
        this.f8144s0 = new Path();
        this.f8094C0 = 255;
        this.f8099G0 = PorterDuff.Mode.SRC_IN;
        this.f8105J0 = new WeakReference(null);
        m1925k(context);
        this.f8139n0 = context;
        C2533tA c2533tA = new C2533tA(this);
        this.f8145t0 = c2533tA;
        this.f8112N = "";
        c2533tA.f8833a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = f8090O0;
        setState(iArr);
        m4705R(iArr);
        this.f8109L0 = true;
        f8091P0.setTint(-1);
    }

    /* JADX INFO: renamed from: b0 */
    public static void m4685b0(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m4686y(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    /* JADX INFO: renamed from: z */
    public static boolean m4687z(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    /* JADX INFO: renamed from: A */
    public final void m4688A() {
        InterfaceC2266n9 interfaceC2266n9 = (InterfaceC2266n9) this.f8105J0.get();
        if (interfaceC2266n9 != null) {
            Chip chip = (Chip) interfaceC2266n9;
            chip.m2461b(chip.f4522p);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x009e  */
    /* JADX INFO: renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4689B(int[] iArr, int[] iArr2) {
        int colorForState;
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.f8098G;
        int iM1917c = m1917c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f8146u0) : 0);
        boolean state = true;
        if (this.f8146u0 != iM1917c) {
            this.f8146u0 = iM1917c;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.f8100H;
        int iM1917c2 = m1917c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f8147v0) : 0);
        if (this.f8147v0 != iM1917c2) {
            this.f8147v0 = iM1917c2;
            zOnStateChange = true;
        }
        int iM5365c = AbstractC2797za.m5365c(iM1917c2, iM1917c);
        if ((this.f8148w0 != iM5365c) | (this.f3241b.f2905d == null)) {
            this.f8148w0 = iM5365c;
            m1928n(ColorStateList.valueOf(iM5365c));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.f8106K;
        int colorForState2 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f8149x0) : 0;
        if (this.f8149x0 != colorForState2) {
            this.f8149x0 = colorForState2;
            zOnStateChange = true;
        }
        if (this.f8103I0 != null) {
            boolean z3 = false;
            boolean z4 = false;
            for (int i : iArr) {
                if (i == 16842910) {
                    z3 = true;
                } else if (i == 16842908 || i == 16842919 || i == 16843623) {
                    z4 = true;
                }
            }
            colorForState = (z3 && z4) ? this.f8103I0.getColorForState(iArr, this.f8150y0) : 0;
        }
        if (this.f8150y0 != colorForState) {
            this.f8150y0 = colorForState;
        }
        C2404qA c2404qA = this.f8145t0.f8838f;
        int colorForState3 = (c2404qA == null || (colorStateList = c2404qA.f8432k) == null) ? 0 : colorStateList.getColorForState(iArr, this.f8151z0);
        if (this.f8151z0 != colorForState3) {
            this.f8151z0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int length = state2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (state2[i2] != 16842912) {
                    i2++;
                } else if (this.f8125Z) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.f8092A0 == z || this.f8127b0 == null) {
            z2 = false;
        } else {
            float fM4717v = m4717v();
            this.f8092A0 = z;
            if (fM4717v != m4717v()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.f8097F0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.f8093B0) : 0;
        if (this.f8093B0 != colorForState4) {
            this.f8093B0 = colorForState4;
            ColorStateList colorStateList6 = this.f8097F0;
            PorterDuff.Mode mode = this.f8099G0;
            this.f8096E0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (m4687z(this.f8115P)) {
            state |= this.f8115P.setState(iArr);
        }
        if (m4687z(this.f8127b0)) {
            state |= this.f8127b0.setState(iArr);
        }
        if (m4687z(this.f8120U)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.f8120U.setState(iArr3);
        }
        if (m4687z(this.f8121V)) {
            state |= this.f8121V.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            m4688A();
        }
        return state;
    }

    /* JADX INFO: renamed from: C */
    public final void m4690C(boolean z) {
        if (this.f8125Z != z) {
            this.f8125Z = z;
            float fM4717v = m4717v();
            if (!z && this.f8092A0) {
                this.f8092A0 = false;
            }
            float fM4717v2 = m4717v();
            invalidateSelf();
            if (fM4717v != fM4717v2) {
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m4691D(Drawable drawable) {
        if (this.f8127b0 != drawable) {
            float fM4717v = m4717v();
            this.f8127b0 = drawable;
            float fM4717v2 = m4717v();
            m4685b0(this.f8127b0);
            m4715t(this.f8127b0);
            invalidateSelf();
            if (fM4717v != fM4717v2) {
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m4692E(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f8128c0 != colorStateList) {
            this.f8128c0 = colorStateList;
            if (this.f8126a0 && (drawable = this.f8127b0) != null && this.f8125Z) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m4693F(boolean z) {
        if (this.f8126a0 != z) {
            boolean zM4712Y = m4712Y();
            this.f8126a0 = z;
            boolean zM4712Y2 = m4712Y();
            if (zM4712Y != zM4712Y2) {
                if (zM4712Y2) {
                    m4715t(this.f8127b0);
                } else {
                    m4685b0(this.f8127b0);
                }
                invalidateSelf();
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m4694G(float f) {
        if (this.f8104J != f) {
            this.f8104J = f;
            C0685Px c0685PxM1516f = this.f3241b.f2902a.m1516f();
            c0685PxM1516f.f2196e = new C2436r(f);
            c0685PxM1516f.f2197f = new C2436r(f);
            c0685PxM1516f.f2198g = new C2436r(f);
            c0685PxM1516f.f2199h = new C2436r(f);
            setShapeAppearanceModel(c0685PxM1516f.m1383a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: H */
    public final void m4695H(Drawable drawable) {
        ?? r0;
        Object obj = this.f8115P;
        if (obj != null) {
            boolean z = obj instanceof InterfaceC0704QF;
            r0 = obj;
            if (z) {
                r0 = 0;
            }
        } else {
            r0 = 0;
        }
        if (r0 != drawable) {
            float fM4717v = m4717v();
            this.f8115P = drawable != null ? drawable.mutate() : null;
            float fM4717v2 = m4717v();
            m4685b0(r0);
            if (m4713Z()) {
                m4715t(this.f8115P);
            }
            invalidateSelf();
            if (fM4717v != fM4717v2) {
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m4696I(float f) {
        if (this.f8117R != f) {
            float fM4717v = m4717v();
            this.f8117R = f;
            float fM4717v2 = m4717v();
            invalidateSelf();
            if (fM4717v != fM4717v2) {
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m4697J(ColorStateList colorStateList) {
        this.f8118S = true;
        if (this.f8116Q != colorStateList) {
            this.f8116Q = colorStateList;
            if (m4713Z()) {
                this.f8115P.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m4698K(boolean z) {
        if (this.f8114O != z) {
            boolean zM4713Z = m4713Z();
            this.f8114O = z;
            boolean zM4713Z2 = m4713Z();
            if (zM4713Z != zM4713Z2) {
                if (zM4713Z2) {
                    m4715t(this.f8115P);
                } else {
                    m4685b0(this.f8115P);
                }
                invalidateSelf();
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m4699L(ColorStateList colorStateList) {
        if (this.f8106K != colorStateList) {
            this.f8106K = colorStateList;
            if (this.f8113N0) {
                C0935Vq c0935Vq = this.f3241b;
                if (c0935Vq.f2906e != colorStateList) {
                    c0935Vq.f2906e = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m4700M(float f) {
        if (this.f8108L != f) {
            this.f8108L = f;
            this.f8140o0.setStrokeWidth(f);
            if (this.f8113N0) {
                this.f3241b.f2912k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX INFO: renamed from: N */
    public final void m4701N(Drawable drawable) {
        ?? r0;
        Object obj = this.f8120U;
        if (obj != null) {
            boolean z = obj instanceof InterfaceC0704QF;
            r0 = obj;
            if (z) {
                r0 = 0;
            }
        } else {
            r0 = 0;
        }
        if (r0 != drawable) {
            float fM4718w = m4718w();
            this.f8120U = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateListValueOf = this.f8110M;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            this.f8121V = new RippleDrawable(colorStateListValueOf, this.f8120U, f8091P0);
            float fM4718w2 = m4718w();
            m4685b0(r0);
            if (m4714a0()) {
                m4715t(this.f8120U);
            }
            invalidateSelf();
            if (fM4718w != fM4718w2) {
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m4702O(float f) {
        if (this.f8137l0 != f) {
            this.f8137l0 = f;
            invalidateSelf();
            if (m4714a0()) {
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m4703P(float f) {
        if (this.f8123X != f) {
            this.f8123X = f;
            invalidateSelf();
            if (m4714a0()) {
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m4704Q(float f) {
        if (this.f8136k0 != f) {
            this.f8136k0 = f;
            invalidateSelf();
            if (m4714a0()) {
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: R */
    public final boolean m4705R(int[] iArr) {
        if (Arrays.equals(this.f8101H0, iArr)) {
            return false;
        }
        this.f8101H0 = iArr;
        if (m4714a0()) {
            return m4689B(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public final void m4706S(ColorStateList colorStateList) {
        if (this.f8122W != colorStateList) {
            this.f8122W = colorStateList;
            if (m4714a0()) {
                this.f8120U.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m4707T(boolean z) {
        if (this.f8119T != z) {
            boolean zM4714a0 = m4714a0();
            this.f8119T = z;
            boolean zM4714a02 = m4714a0();
            if (zM4714a0 != zM4714a02) {
                if (zM4714a02) {
                    m4715t(this.f8120U);
                } else {
                    m4685b0(this.f8120U);
                }
                invalidateSelf();
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m4708U(float f) {
        if (this.f8133h0 != f) {
            float fM4717v = m4717v();
            this.f8133h0 = f;
            float fM4717v2 = m4717v();
            invalidateSelf();
            if (fM4717v != fM4717v2) {
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m4709V(float f) {
        if (this.f8132g0 != f) {
            float fM4717v = m4717v();
            this.f8132g0 = f;
            float fM4717v2 = m4717v();
            invalidateSelf();
            if (fM4717v != fM4717v2) {
                m4688A();
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m4710W(ColorStateList colorStateList) {
        if (this.f8110M != colorStateList) {
            this.f8110M = colorStateList;
            this.f8103I0 = null;
            onStateChange(getState());
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m4711X(C2404qA c2404qA) {
        C2533tA c2533tA = this.f8145t0;
        C2180l9 c2180l9 = c2533tA.f8834b;
        TextPaint textPaint = c2533tA.f8833a;
        if (c2533tA.f8838f != c2404qA) {
            c2533tA.f8838f = c2404qA;
            if (c2404qA != null) {
                Context context = this.f8139n0;
                c2404qA.m4841e(context, textPaint, c2180l9);
                InterfaceC2490sA interfaceC2490sA = (InterfaceC2490sA) c2533tA.f8837e.get();
                if (interfaceC2490sA != null) {
                    textPaint.drawableState = interfaceC2490sA.getState();
                }
                c2404qA.m4840d(context, textPaint, c2180l9);
                c2533tA.f8836d = true;
            }
            InterfaceC2490sA interfaceC2490sA2 = (InterfaceC2490sA) c2533tA.f8837e.get();
            if (interfaceC2490sA2 != null) {
                C2309o9 c2309o9 = (C2309o9) interfaceC2490sA2;
                c2309o9.m4688A();
                c2309o9.invalidateSelf();
                c2309o9.onStateChange(interfaceC2490sA2.getState());
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m4712Y() {
        return this.f8126a0 && this.f8127b0 != null && this.f8092A0;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m4713Z() {
        return this.f8114O && this.f8115P != null;
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m4714a0() {
        return this.f8119T && this.f8120U != null;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f;
        int i2;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.f8094C0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z = this.f8113N0;
        Paint paint = this.f8140o0;
        RectF rectF = this.f8142q0;
        if (!z) {
            paint.setColor(this.f8146u0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m4719x(), m4719x(), paint);
        }
        if (!this.f8113N0) {
            paint.setColor(this.f8147v0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.f8095D0;
            if (colorFilter == null) {
                colorFilter = this.f8096E0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, m4719x(), m4719x(), paint);
        }
        if (this.f8113N0) {
            super.draw(canvas);
        }
        if (this.f8108L > 0.0f && !this.f8113N0) {
            paint.setColor(this.f8149x0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.f8113N0) {
                ColorFilter colorFilter2 = this.f8095D0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.f8096E0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.f8108L / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.f8104J - (this.f8108L / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.f8150y0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.f8113N0) {
            RectF rectF2 = new RectF(bounds);
            C0935Vq c0935Vq = this.f3241b;
            C0728Qx c0728Qx = c0935Vq.f2902a;
            float[] fArr = this.f3237B;
            float f5 = c0935Vq.f2911j;
            C0892Uq c0892Uq = this.f3257r;
            C0813Sx c0813Sx = this.f3258s;
            f = 2.0f;
            Path path = this.f8144s0;
            c0813Sx.m1615a(c0728Qx, fArr, f5, rectF2, c0892Uq, path);
            m1919e(canvas2, paint, path, this.f3241b.f2902a, this.f3237B, m1921g());
        } else {
            canvas2.drawRoundRect(rectF, m4719x(), m4719x(), paint);
            f = 2.0f;
        }
        if (m4713Z()) {
            m4716u(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.f8115P.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f8115P.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (m4712Y()) {
            m4716u(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.f8127b0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f8127b0.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.f8109L0 && this.f8112N != null) {
            PointF pointF = this.f8143r0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.f8112N;
            C2533tA c2533tA = this.f8145t0;
            if (charSequence != null) {
                float fM4717v = m4717v() + this.f8131f0 + this.f8134i0;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + fM4717v;
                } else {
                    pointF.x = bounds.right - fM4717v;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = c2533tA.f8833a;
                Paint.FontMetrics fontMetrics = this.f8141p0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.f8112N != null) {
                float fM4717v2 = m4717v() + this.f8131f0 + this.f8134i0;
                float fM4718w = m4718w() + this.f8138m0 + this.f8135j0;
                if (getLayoutDirection() == 0) {
                    rectF.left = bounds.left + fM4717v2;
                    rectF.right = bounds.right - fM4718w;
                } else {
                    rectF.left = bounds.left + fM4718w;
                    rectF.right = bounds.right - fM4717v2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            C2404qA c2404qA = c2533tA.f8838f;
            TextPaint textPaint2 = c2533tA.f8833a;
            if (c2404qA != null) {
                textPaint2.drawableState = getState();
                c2533tA.f8838f.m4840d(this.f8139n0, textPaint2, c2533tA.f8834b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(c2533tA.m5014a(this.f8112N.toString())) > Math.round(rectF.width());
            if (z2) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i2 = iSave;
            } else {
                i2 = 0;
            }
            CharSequence charSequenceEllipsize = this.f8112N;
            if (z2 && this.f8107K0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.f8107K0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i2);
            }
        }
        if (m4714a0()) {
            rectF.setEmpty();
            if (m4714a0()) {
                float f10 = this.f8138m0 + this.f8137l0;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.f8123X;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.f8123X;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.f8123X;
                float f14 = fExactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.f8120U.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f8121V.setBounds(this.f8120U.getBounds());
            this.f8121V.jumpToCurrentState();
            this.f8121V.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.f8094C0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
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
        return Math.min(Math.round(m4718w() + this.f8145t0.m5014a(this.f8112N.toString()) + m4717v() + this.f8131f0 + this.f8134i0 + this.f8135j0 + this.f8138m0), this.f8111M0);
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.f8113N0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.f8102I, this.f8104J);
        } else {
            outline.setRoundRect(bounds, this.f8104J);
            outline2 = outline;
        }
        outline2.setAlpha(this.f8094C0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (m4686y(this.f8098G) || m4686y(this.f8100H) || m4686y(this.f8106K)) {
            return true;
        }
        C2404qA c2404qA = this.f8145t0.f8838f;
        if (c2404qA == null || (colorStateList = c2404qA.f8432k) == null || !colorStateList.isStateful()) {
            return (this.f8126a0 && this.f8127b0 != null && this.f8125Z) || m4687z(this.f8115P) || m4687z(this.f8127b0) || m4686y(this.f8097F0);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (m4713Z()) {
            zOnLayoutDirectionChanged |= this.f8115P.setLayoutDirection(i);
        }
        if (m4712Y()) {
            zOnLayoutDirectionChanged |= this.f8127b0.setLayoutDirection(i);
        }
        if (m4714a0()) {
            zOnLayoutDirectionChanged |= this.f8120U.setLayoutDirection(i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (m4713Z()) {
            zOnLevelChange |= this.f8115P.setLevel(i);
        }
        if (m4712Y()) {
            zOnLevelChange |= this.f8127b0.setLevel(i);
        }
        if (m4714a0()) {
            zOnLevelChange |= this.f8120U.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.f8113N0) {
            super.onStateChange(iArr);
        }
        return m4689B(iArr, this.f8101H0);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f8094C0 != i) {
            this.f8094C0 = i;
            invalidateSelf();
        }
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f8095D0 != colorFilter) {
            this.f8095D0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.f8097F0 != colorStateList) {
            this.f8097F0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // p000.C1021Xq, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.f8099G0 != mode) {
            this.f8099G0 = mode;
            ColorStateList colorStateList = this.f8097F0;
            this.f8096E0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (m4713Z()) {
            visible |= this.f8115P.setVisible(z, z2);
        }
        if (m4712Y()) {
            visible |= this.f8127b0.setVisible(z, z2);
        }
        if (m4714a0()) {
            visible |= this.f8120U.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    /* JADX INFO: renamed from: t */
    public final void m4715t(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f8120U) {
            if (drawable.isStateful()) {
                drawable.setState(this.f8101H0);
            }
            drawable.setTintList(this.f8122W);
            return;
        }
        Drawable drawable2 = this.f8115P;
        if (drawable == drawable2 && this.f8118S) {
            drawable2.setTintList(this.f8116Q);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m4716u(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (m4713Z() || m4712Y()) {
            float f = this.f8131f0 + this.f8132g0;
            Drawable drawable = this.f8092A0 ? this.f8127b0 : this.f8115P;
            float intrinsicWidth = this.f8117R;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.f8092A0 ? this.f8127b0 : this.f8115P;
            float fCeil = this.f8117R;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f8139n0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    /* JADX INFO: renamed from: v */
    public final float m4717v() {
        if (!m4713Z() && !m4712Y()) {
            return 0.0f;
        }
        float f = this.f8132g0;
        Drawable drawable = this.f8092A0 ? this.f8127b0 : this.f8115P;
        float intrinsicWidth = this.f8117R;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.f8133h0;
    }

    /* JADX INFO: renamed from: w */
    public final float m4718w() {
        if (m4714a0()) {
            return this.f8136k0 + this.f8123X + this.f8137l0;
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: x */
    public final float m4719x() {
        if (!this.f8113N0) {
            return this.f8104J;
        }
        float[] fArr = this.f3237B;
        return fArr != null ? fArr[3] : this.f3241b.f2902a.f2328e.mo1563a(m1921g());
    }
}
