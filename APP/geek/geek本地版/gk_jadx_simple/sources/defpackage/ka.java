package defpackage;

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

/* JADX INFO: loaded from: classes.dex */
public final class ka extends eu implements Drawable.Callback, c60 {
    public static final int[] F0 = null;
    public static final ShapeDrawable G0 = null;
    public float A;
    public WeakReference A0;
    public ColorStateList B;
    public TextUtils.TruncateAt B0;
    public float C;
    public boolean C0;
    public ColorStateList D;
    public int D0;
    public CharSequence E;
    public boolean E0;
    public boolean F;
    public Drawable G;
    public ColorStateList H;
    public float I;
    public boolean J;
    public boolean K;
    public Drawable L;
    public RippleDrawable M;
    public ColorStateList N;
    public float O;
    public SpannableStringBuilder P;
    public boolean Q;
    public boolean R;
    public Drawable S;
    public ColorStateList T;
    public bw U;
    public bw V;
    public float W;
    public float X;
    public float Y;
    public float Z;
    public float a0;
    public float b0;
    public float c0;
    public float d0;
    public final Context e0;
    public final Paint f0;
    public final Paint.FontMetrics g0;
    public final RectF h0;
    public final PointF i0;
    public final Path j0;
    public final d60 k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public boolean r0;
    public int s0;
    public int t0;
    public ColorFilter u0;
    public PorterDuffColorFilter v0;
    public ColorStateList w0;
    public ColorStateList x;
    public PorterDuff.Mode x0;
    public ColorStateList y;
    public int[] y0;
    public float z;
    public ColorStateList z0;

    static {
        F0 = new int[]{R.attr.state_enabled};
        G0 = new ShapeDrawable(new OvalShape());
    }

    public ka(Context r3, AttributeSet r4) {
        super(r3, r4, com.ljx.wechatmod.R.attr.chipStyle, com.ljx.wechatmod.R.style.Widget_MaterialComponents_Chip_Action);
        this.A = -1.0f;
        this.f0 = new Paint(1);
        this.g0 = new Paint.FontMetrics();
        this.h0 = new RectF();
        this.i0 = new PointF();
        this.j0 = new Path();
        this.t0 = 255;
        this.x0 = PorterDuff.Mode.SRC_IN;
        this.A0 = new WeakReference(null);
        h(r3);
        this.e0 = r3;
        d60 r42 = new d60(this);
        this.k0 = r42;
        this.E = "";
        r42.a.density = r3.getResources().getDisplayMetrics().density;
        int[] r32 = F0;
        setState(r32);
        if (Arrays.equals(this.y0, r32) == true) goto L7;
        this.y0 = r32;
        if (T() == false) goto L7;
        v(getState(), r32);
    L7:
        this.C0 = true;
        int[] r33 = g10.a;
        G0.setTint(-1);
    }

    public static void U(Drawable r1) {
        if (r1 == null) goto L5;
        r1.setCallback(null);
        return;
    }

    public static boolean s(ColorStateList r0) {
        if (r0 != null) goto L4;
        return false;
    L4:
        if (r0.isStateful() == false) goto L9;
        return true;
    L9:
        return false;
    }

    public static boolean t(Drawable r0) {
        if (r0 != null) goto L4;
        return false;
    L4:
        if (r0.isStateful() == false) goto L9;
        return true;
    L9:
        return false;
    }

    public final void A(float r3) {
        if (this.A == r3) goto L6;
        this.A = r3;
        e30 r0 = this.a.a.e();
        r0.e = new e(r3);
        r0.f = new e(r3);
        r0.g = new e(r3);
        r0.h = new e(r3);
        setShapeAppearanceModel(r0.a());
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void B(Drawable r4) {
        Object r0 = this.G;
        Drawable r1 = null;
        if (r0 == null) goto L7;
        boolean r2 = r0 instanceof ad0;
        ?? r02 = r0;
        if (r2 == false) goto L8;
        ad0 r03 = (ad0) r0;
        r02 = 0;
    L8:
        if (r02 == r4) goto L19;
        float r22 = p();
        if (r4 == null) goto L12;
        r1 = r4.mutate();
    L12:
        this.G = r1;
        float r42 = p();
        U(r02);
        if (S() == false) goto L15;
        n(this.G);
    L15:
        invalidateSelf();
        if (r22 == r42) goto L20;
        u();
        return;
    L20:
        return;
    L19:
        return;
    L7:
        r02 = 0;
        goto L8
    }

    public final void C(float r2) {
        if (this.I == r2) goto L8;
        float r0 = p();
        this.I = r2;
        float r22 = p();
        invalidateSelf();
        if (r0 == r22) goto L9;
        u();
        return;
    L9:
        return;
    }

    public final void D(ColorStateList r2) {
        this.J = true;
        if (this.H == r2) goto L9;
        this.H = r2;
        if (S() == false) goto L7;
        ch.h(this.G, r2);
    L7:
        onStateChange(getState());
        return;
    }

    public final void E(boolean r2) {
        if (this.F == r2) goto L11;
        boolean r0 = S();
        this.F = r2;
        boolean r22 = S();
        if (r0 == r22) goto L12;
        if (r22 == false) goto L8;
        n(this.G);
    L9:
        invalidateSelf();
        u();
        return;
    L8:
        U(this.G);
        goto L9
    L12:
        return;
    }

    public final void F(ColorStateList r3) {
        if (this.B == r3) goto L11;
        this.B = r3;
        if (this.E0 == false) goto L9;
        du r0 = this.a;
        if (r0.d == r3) goto L9;
        r0.d = r3;
        onStateChange(getState());
    L9:
        onStateChange(getState());
        return;
    }

    public final void G(float r2) {
        if (this.C == r2) goto L9;
        this.C = r2;
        this.f0.setStrokeWidth(r2);
        if (this.E0 == false) goto L7;
        this.a.j = r2;
        invalidateSelf();
    L7:
        invalidateSelf();
        return;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void H(Drawable r6) {
        Object r0 = this.L;
        Drawable r1 = null;
        if (r0 == null) goto L7;
        boolean r2 = r0 instanceof ad0;
        ?? r02 = r0;
        if (r2 == false) goto L8;
        ad0 r03 = (ad0) r0;
    L8:
        if (r02 == r6) goto L19;
        float r22 = q();
        if (r6 == null) goto L12;
        r1 = r6.mutate();
    L12:
        this.L = r1;
        int[] r62 = g10.a;
        this.M = new RippleDrawable(g10.a(this.D), this.L, G0);
        float r63 = q();
        U(r02);
        if (T() == false) goto L15;
        n(this.L);
    L15:
        invalidateSelf();
        if (r22 == r63) goto L20;
        u();
        return;
    L20:
        return;
    L19:
        return;
    L7:
        r02 = 0;
        goto L8
    }

    public final void I(float r2) {
        if (this.c0 == r2) goto L8;
        this.c0 = r2;
        invalidateSelf();
        if (T() == false) goto L9;
        u();
        return;
    L9:
        return;
    }

    public final void J(float r2) {
        if (this.O == r2) goto L8;
        this.O = r2;
        invalidateSelf();
        if (T() == false) goto L9;
        u();
        return;
    L9:
        return;
    }

    public final void K(float r2) {
        if (this.b0 == r2) goto L8;
        this.b0 = r2;
        invalidateSelf();
        if (T() == false) goto L9;
        u();
        return;
    L9:
        return;
    }

    public final void L(ColorStateList r2) {
        if (this.N == r2) goto L9;
        this.N = r2;
        if (T() == false) goto L7;
        ch.h(this.L, r2);
    L7:
        onStateChange(getState());
        return;
    }

    public final void M(boolean r2) {
        if (this.K == r2) goto L11;
        boolean r0 = T();
        this.K = r2;
        boolean r22 = T();
        if (r0 == r22) goto L12;
        if (r22 == false) goto L8;
        n(this.L);
    L9:
        invalidateSelf();
        u();
        return;
    L8:
        U(this.L);
        goto L9
    L12:
        return;
    }

    public final void N(float r2) {
        if (this.Y == r2) goto L8;
        float r0 = p();
        this.Y = r2;
        float r22 = p();
        invalidateSelf();
        if (r0 == r22) goto L9;
        u();
        return;
    L9:
        return;
    }

    public final void O(float r2) {
        if (this.X == r2) goto L8;
        float r0 = p();
        this.X = r2;
        float r22 = p();
        invalidateSelf();
        if (r0 == r22) goto L9;
        u();
        return;
    L9:
        return;
    }

    public final void P(ColorStateList r2) {
        if (this.D == r2) goto L6;
        this.D = r2;
        this.z0 = null;
        onStateChange(getState());
        return;
    }

    public final void Q(a60 r6) {
        d60 r0 = this.k0;
        ha r1 = r0.b;
        TextPaint r2 = r0.a;
        if (r0.f == r6) goto L14;
        r0.f = r6;
        if (r6 == null) goto L10;
        Context r3 = this.e0;
        r6.f(r3, r2, r1);
        c60 r4 = (c60) r0.e.get();
        if (r4 == null) goto L9;
        r2.drawableState = r4.getState();
    L9:
        r6.e(r3, r2, r1);
        r0.d = true;
    L10:
        c60 r62 = (c60) r0.e.get();
        if (r62 == null) goto L15;
        ka r02 = (ka) r62;
        r02.u();
        r02.invalidateSelf();
        r02.onStateChange(r62.getState());
        return;
    L15:
        return;
    }

    public final boolean R() {
        if (this.R == true) goto L5;
        return false;
    L5:
        if (this.S != null) goto L7;
        return false;
    L7:
        if (this.r0 == false) goto L13;
        return true;
    L13:
        return false;
    }

    public final boolean S() {
        if (this.F == true) goto L5;
        return false;
    L5:
        if (this.G == null) goto L10;
        return true;
    L10:
        return false;
    }

    public final boolean T() {
        if (this.K == true) goto L5;
        return false;
    L5:
        if (this.L == null) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void draw(Canvas r20) {
        Rect r7 = getBounds();
        if (r7.isEmpty() == true) goto L97;
        int r6 = this.t0;
        if (r6 == 0) goto L97;
        if (r6 >= 255) goto L10;
        Canvas r1 = r20;
        int r10 = r1.saveLayerAlpha(r7.left, r7.top, r7.right, r7.bottom, r6);
    L11:
        boolean r2 = this.E0;
        Paint r22 = this.f0;
        RectF r11 = this.h0;
        if (r2 == true) goto L15;
        r22.setColor(this.l0);
        r22.setStyle(Paint.Style.FILL);
        r11.set(r7);
        r1.drawRoundRect(r11, r(), r(), r22);
    L15:
        if (this.E0 == true) goto L22;
        r22.setColor(this.m0);
        r22.setStyle(Paint.Style.FILL);
        ColorFilter r3 = this.u0;
        if (r3 != null) goto L20;
        r3 = this.v0;
    L20:
        r22.setColorFilter(r3);
        r11.set(r7);
        r1.drawRoundRect(r11, r(), r(), r22);
    L22:
        if (this.E0 == false) goto L25;
        super.draw(r20);
    L25:
        if (this.C > 0.0f) goto L27;
    L36:
        r22.setColor(this.p0);
        r22.setStyle(Paint.Style.FILL);
        r11.set(r7);
        if (this.E0 == true) goto L40;
        r1.drawRoundRect(r11, r(), r(), r22);
    L42:
        if (S() == false) goto L45;
        o(r7, r11);
        float r0 = r11.left;
        float r23 = r11.top;
        r1.translate(r0, r23);
        this.G.setBounds(0, 0, (int) r11.width(), (int) r11.height());
        this.G.draw(r1);
        r1.translate(-r0, -r23);
    L45:
        if (R() == false) goto L48;
        o(r7, r11);
        float r02 = r11.left;
        float r24 = r11.top;
        r1.translate(r02, r24);
        this.S.setBounds(0, 0, (int) r11.width(), (int) r11.height());
        this.S.draw(r1);
        r1.translate(-r02, -r24);
    L48:
        if (this.C0 == false) goto L84;
        if (this.E == null) goto L84;
        PointF r03 = this.i0;
        r03.set(0.0f, 0.0f);
        Paint.Align r25 = Paint.Align.LEFT;
        CharSequence r32 = this.E;
        d60 r4 = this.k0;
        if (r32 == null) goto L58;
        float r5 = (p() + this.W) + this.Z;
        if (dh.a(this) != 0) goto L56;
        r03.x = r7.left + r5;
    L57:
        float r33 = r7.centerY();
        TextPaint r52 = r4.a;
        Paint.FontMetrics r62 = this.g0;
        r52.getFontMetrics(r62);
        r03.y = r33 - ((r62.descent + r62.ascent) / 2.0f);
        goto L58
    L56:
        r03.x = r7.right - r5;
        r25 = Paint.Align.RIGHT;
    L58:
        r11.setEmpty();
        if (this.E == null) goto L65;
        float r53 = (p() + this.W) + this.Z;
        float r63 = (q() + this.d0) + this.a0;
        if (dh.a(this) != 0) goto L63;
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
        a60 r34 = r4.f;
        TextPaint r64 = r4.a;
        if (r34 == null) goto L68;
        r64.drawableState = getState();
        r4.f.e(this.e0, r64, r4.b);
    L68:
        r64.setTextAlign(r25);
        if (Math.round(r4.a(this.E.toString())) <= Math.round(r11.width())) goto L71;
        boolean r14 = true;
    L72:
        if (r14 == false) goto L74;
        int r26 = r1.save();
        r1.clipRect(r11);
        int r15 = r26;
    L75:
        CharSequence r27 = this.E;
        if (r14 == true) goto L78;
    L80:
        r20.drawText(r27, 0, r27.length(), r03.x, r03.y, r64);
        r1 = r20;
        if (r14 == false) goto L84;
        r1.restoreToCount(r15);
        goto L84
    L78:
        if (this.B0 == null) goto L80;
        r27 = TextUtils.ellipsize(r27, r64, r11.width(), this.B0);
        goto L80
    L74:
        r15 = 0;
        goto L75
    L71:
        r14 = false;
    L84:
        if (T() == false) goto L94;
        r11.setEmpty();
        if (T() == false) goto L92;
        float r04 = this.d0 + this.c0;
        if (dh.a(this) != 0) goto L90;
        float r28 = r7.right - r04;
        r11.right = r28;
        r11.left = r28 - this.O;
    L91:
        float r05 = r7.exactCenterY();
        float r29 = this.O;
        float r06 = r05 - (r29 / 2.0f);
        r11.top = r06;
        r11.bottom = r06 + r29;
        goto L92
    L90:
        float r210 = r7.left + r04;
        r11.left = r210;
        r11.right = r210 + this.O;
    L92:
        float r07 = r11.left;
        float r211 = r11.top;
        r1.translate(r07, r211);
        this.L.setBounds(0, 0, (int) r11.width(), (int) r11.height());
        int[] r35 = g10.a;
        this.M.setBounds(this.L.getBounds());
        this.M.jumpToCurrentState();
        this.M.draw(r1);
        r1.translate(-r07, -r211);
    L94:
        if (this.t0 >= 255) goto L98;
        r1.restoreToCount(r10);
        return;
    L98:
        return;
    L40:
        RectF r36 = new RectF(r7);
        du r42 = this.a;
        f30 r142 = r42.a;
        float r152 = r42.i;
        l0 r43 = this.q;
        h30 r13 = this.r;
        Path r54 = this.j0;
        r13.a(r142, r152, r36, r43, r54);
        d(r1, r22, r54, this.a.a, f());
        goto L42
    L27:
        if (this.E0 == true) goto L36;
        r22.setColor(this.o0);
        r22.setStyle(Paint.Style.STROKE);
        if (this.E0 == true) goto L35;
        ColorFilter r37 = this.u0;
        if (r37 != null) goto L34;
        r37 = this.v0;
    L34:
        r22.setColorFilter(r37);
    L35:
        float r38 = r7.left;
        float r44 = this.C / 2.0f;
        r11.set(r38 + r44, r7.top + r44, r7.right - r44, r7.bottom - r44);
        float r39 = this.A - (this.C / 2.0f);
        r1.drawRoundRect(r11, r39, r39, r22);
        goto L36
    L10:
        r1 = r20;
        r10 = 0;
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.u0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.z;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float r0 = this.W;
        float r1 = (p() + r0) + this.Z;
        String r02 = this.E.toString();
        float r03 = (this.k0.a(r02) + r1) + this.a0;
        return Math.min(Math.round((q() + r03) + this.d0), this.D0);
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void getOutline(Outline r9) {
        if (this.E0 == false) goto L6;
        super.getOutline(r9);
        return;
    L6:
        Rect r0 = getBounds();
        if (r0.isEmpty() == true) goto L9;
        r9.setRoundRect(r0, this.A);
        Outline r2 = r9;
    L10:
        r2.setAlpha(this.t0 / 255.0f);
        return;
    L9:
        r2 = r9;
        r2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.z, this.A);
        goto L10
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable r1) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.invalidateDrawable(this);
        return;
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (s(this.x) == false) goto L5;
        return true;
    L5:
        if (s(this.y) == false) goto L7;
        return true;
    L7:
        if (s(this.B) == true) goto L34;
        a60 r0 = this.k0.f;
        if (r0 == null) goto L16;
        ColorStateList r02 = r0.j;
        if (r02 == null) goto L16;
        if (r02.isStateful() == false) goto L16;
        return true;
    L16:
        if (this.R == false) goto L23;
        if (this.S == null) goto L23;
        if (this.Q == false) goto L23;
        return true;
    L23:
        if (t(this.G) == false) goto L25;
        return true;
    L25:
        if (t(this.S) == false) goto L27;
        return true;
    L27:
        if (s(this.w0) == true) goto L39;
        return false;
    L39:
        return true;
    L34:
        return true;
    }

    public final void n(Drawable r3) {
        if (r3 == null) goto L21;
        r3.setCallback(this);
        dh.b(r3, dh.a(this));
        r3.setLevel(getLevel());
        r3.setVisible(isVisible(), false);
        if (r3 == this.L) goto L7;
        Drawable r0 = this.G;
        if (r3 != r0) goto L17;
        if (this.J == false) goto L17;
        ch.h(r0, this.H);
    L17:
        if (r3.isStateful() == false) goto L20;
        r3.setState(getState());
        return;
    L20:
        return;
    L7:
        if (r3.isStateful() == false) goto L9;
        r3.setState(this.y0);
    L9:
        ch.h(r3, this.N);
        return;
    }

    public final void o(Rect r6, RectF r7) {
        r7.setEmpty();
        if (S() == false) goto L5;
    L8:
        float r0 = this.W + this.X;
        if (this.r0 == false) goto L11;
        Drawable r1 = this.S;
    L12:
        float r2 = this.I;
        if (r2 > 0.0f) goto L17;
        if (r1 == null) goto L17;
        r2 = r1.getIntrinsicWidth();
    L17:
        if (dh.a(this) != 0) goto L19;
        float r12 = r6.left + r0;
        r7.left = r12;
        r7.right = r12 + r2;
    L21:
        if (this.r0 == false) goto L23;
        Drawable r02 = this.S;
    L24:
        float r13 = this.I;
        if (r13 > 0.0f) goto L30;
        if (r02 == null) goto L30;
        r13 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.e0.getResources().getDisplayMetrics()));
        if (r02.getIntrinsicHeight() > r13) goto L30;
        r13 = r02.getIntrinsicHeight();
    L30:
        float r62 = r6.exactCenterY() - (r13 / 2.0f);
        r7.top = r62;
        r7.bottom = r62 + r13;
        return;
    L23:
        r02 = this.G;
        goto L24
    L19:
        float r14 = r6.right - r0;
        r7.right = r14;
        r7.left = r14 - r2;
        goto L21
    L11:
        r1 = this.G;
        goto L12
    L5:
        if (R() == true) goto L8;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int r3) {
        boolean r0 = super.onLayoutDirectionChanged(r3);
        if (S() == false) goto L6;
        r0 = r0 | dh.b(this.G, r3);
    L6:
        if (R() == false) goto L9;
        r0 = r0 | dh.b(this.S, r3);
    L9:
        if (T() == false) goto L11;
        r0 = r0 | dh.b(this.L, r3);
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
        if (S() == false) goto L6;
        r0 = r0 | this.G.setLevel(r3);
    L6:
        if (R() == false) goto L9;
        r0 = r0 | this.S.setLevel(r3);
    L9:
        if (T() == false) goto L11;
        r0 = r0 | this.L.setLevel(r3);
    L11:
        if (r0 == false) goto L13;
        invalidateSelf();
    L13:
        return r0;
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
        if (this.E0 == false) goto L6;
        super.onStateChange(r2);
    L6:
        return v(r2, this.y0);
    }

    public final float p() {
        if (S() == false) goto L5;
    L8:
        float r0 = this.X;
        if (this.r0 == false) goto L11;
        Drawable r2 = this.S;
    L12:
        float r3 = this.I;
        if (r3 > 0.0f) goto L17;
        if (r2 == null) goto L17;
        r3 = r2.getIntrinsicWidth();
    L17:
        return (r3 + r0) + this.Y;
    L11:
        r2 = this.G;
        goto L12
    L5:
        if (R() == true) goto L8;
        return 0.0f;
    }

    public final float q() {
        if (T() == true) goto L5;
        return 0.0f;
    L5:
        return (this.b0 + this.O) + this.c0;
    }

    public final float r() {
        if (this.E0 == false) goto L7;
        return this.a.a.e.a(f());
    L7:
        return this.A;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable r1, Runnable r2, long r3) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.scheduleDrawable(this, r2, r3);
        return;
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void setAlpha(int r2) {
        if (this.t0 == r2) goto L6;
        this.t0 = r2;
        invalidateSelf();
        return;
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter r2) {
        if (this.u0 == r2) goto L6;
        this.u0 = r2;
        invalidateSelf();
        return;
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList r2) {
        if (this.w0 == r2) goto L6;
        this.w0 = r2;
        onStateChange(getState());
        return;
    }

    @Override // defpackage.eu, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode r4) {
        if (this.x0 == r4) goto L12;
        this.x0 = r4;
        ColorStateList r0 = this.w0;
        if (r0 == null) goto L9;
        if (r4 == null) goto L9;
        PorterDuffColorFilter r1 = new PorterDuffColorFilter(r0.getColorForState(getState(), 0), r4);
    L10:
        this.v0 = r1;
        invalidateSelf();
        return;
    L9:
        r1 = null;
        goto L10
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean r3, boolean r4) {
        boolean r0 = super.setVisible(r3, r4);
        if (S() == false) goto L6;
        r0 = r0 | this.G.setVisible(r3, r4);
    L6:
        if (R() == false) goto L9;
        r0 = r0 | this.S.setVisible(r3, r4);
    L9:
        if (T() == false) goto L11;
        r0 = r0 | this.L.setVisible(r3, r4);
    L11:
        if (r0 == false) goto L13;
        invalidateSelf();
    L13:
        return r0;
    }

    public final void u() {
        ja r0 = (ja) this.A0.get();
        if (r0 == null) goto L6;
        Chip r02 = (Chip) r0;
        r02.b(r02.p);
        r02.requestLayout();
        r02.invalidateOutline();
        return;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable r1, Runnable r2) {
        Drawable.Callback r12 = getCallback();
        if (r12 == null) goto L6;
        r12.unscheduleDrawable(this, r2);
        return;
    }

    public final boolean v(int[] r9, int[] r10) {
        boolean r0 = super.onStateChange(r9);
        ColorStateList r1 = this.x;
        if (r1 == null) goto L5;
        int r12 = r1.getColorForState(r9, this.l0);
    L6:
        int r13 = b(r12);
        boolean r4 = true;
        if (this.l0 == r13) goto L9;
        this.l0 = r13;
        r0 = true;
    L9:
        ColorStateList r3 = this.y;
        if (r3 == null) goto L12;
        int r32 = r3.getColorForState(r9, this.m0);
    L13:
        int r33 = b(r32);
        if (this.m0 == r33) goto L16;
        this.m0 = r33;
        r0 = true;
    L16:
        int r14 = ib.b(r33, r13);
        if (this.n0 == r14) goto L19;
        boolean r34 = true;
    L21:
        if (this.a.c != null) goto L23;
        boolean r5 = true;
    L25:
        if ((r34 | r5) == false) goto L27;
        this.n0 = r14;
        j(ColorStateList.valueOf(r14));
        r0 = true;
    L27:
        ColorStateList r15 = this.B;
        if (r15 == null) goto L30;
        int r16 = r15.getColorForState(r9, this.o0);
    L32:
        if (this.o0 == r16) goto L35;
        this.o0 = r16;
        r0 = true;
    L35:
        if (this.z0 != null) goto L37;
    L39:
        int r17 = 0;
    L41:
        if (this.p0 == r17) goto L43;
        this.p0 = r17;
    L43:
        a60 r18 = this.k0.f;
        if (r18 == null) goto L48;
        ColorStateList r19 = r18.j;
        if (r19 == null) goto L48;
        int r110 = r19.getColorForState(r9, this.q0);
    L50:
        if (this.q0 == r110) goto L52;
        this.q0 = r110;
        r0 = true;
    L52:
        int[] r111 = getState();
        if (r111 == null) goto L63;
        int r35 = r111.length;
        int r52 = 0;
    L56:
        if (r52 >= r35) goto L63;
        if (r111[r52] == 16842912) goto L60;
        r52 = r52 + 1;
        goto L56
    L60:
        if (this.Q == false) goto L63;
        boolean r112 = true;
    L65:
        if (this.r0 != r112) goto L67;
    L72:
        boolean r113 = false;
    L73:
        ColorStateList r36 = this.w0;
        if (r36 == null) goto L76;
        int r37 = r36.getColorForState(r9, this.s0);
    L78:
        if (this.s0 == r37) goto L86;
        this.s0 = r37;
        ColorStateList r02 = this.w0;
        PorterDuff.Mode r38 = this.x0;
        if (r02 == null) goto L84;
        if (r38 == null) goto L84;
        PorterDuffColorFilter r53 = new PorterDuffColorFilter(r02.getColorForState(getState(), 0), r38);
    L85:
        this.v0 = r53;
    L88:
        if (t(this.G) == false) goto L91;
        r4 = r4 | this.G.setState(r9);
    L91:
        if (t(this.S) == false) goto L94;
        r4 = r4 | this.S.setState(r9);
    L94:
        if (t(this.L) == false) goto L96;
        int[] r03 = new int[r9.length + r10.length];
        System.arraycopy(r9, 0, r03, 0, r9.length);
        System.arraycopy(r10, 0, r03, r9.length, r10.length);
        r4 = r4 | this.L.setState(r03);
    L96:
        int[] r92 = g10.a;
        if (t(this.M) == false) goto L99;
        r4 = r4 | this.M.setState(r10);
    L99:
        if (r4 == false) goto L101;
        invalidateSelf();
    L101:
        if (r113 == false) goto L103;
        u();
    L103:
        return r4;
    L84:
        r53 = null;
        goto L85
    L86:
        r4 = r0;
        goto L88
    L76:
        r37 = 0;
        goto L78
    L67:
        if (this.S == null) goto L72;
        float r04 = p();
        this.r0 = r112;
        if (r04 == p()) goto L71;
        r0 = true;
        r113 = true;
        goto L73
    L71:
        r113 = false;
        r0 = true;
    L63:
        r112 = false;
    L48:
        r110 = 0;
        goto L50
    L37:
        if (g10.b(r9) == false) goto L39;
        r17 = this.z0.getColorForState(r9, this.p0);
        goto L41
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

    public final void w(boolean r2) {
        if (this.Q == r2) goto L13;
        this.Q = r2;
        float r0 = p();
        if (r2 == false) goto L7;
    L9:
        float r22 = p();
        invalidateSelf();
        if (r0 == r22) goto L14;
        u();
        return;
    L14:
        return;
    L7:
        if (this.r0 == false) goto L9;
        this.r0 = false;
        goto L9
    }

    public final void x(Drawable r3) {
        if (this.S == r3) goto L8;
        float r0 = p();
        this.S = r3;
        float r32 = p();
        U(this.S);
        n(this.S);
        invalidateSelf();
        if (r0 == r32) goto L9;
        u();
        return;
    L9:
        return;
    }

    public final void y(ColorStateList r3) {
        if (this.T == r3) goto L13;
        this.T = r3;
        if (this.R == false) goto L11;
        Drawable r0 = this.S;
        if (r0 == null) goto L11;
        if (this.Q == false) goto L11;
        ch.h(r0, r3);
    L11:
        onStateChange(getState());
        return;
    }

    public final void z(boolean r2) {
        if (this.R == r2) goto L11;
        boolean r0 = R();
        this.R = r2;
        boolean r22 = R();
        if (r0 == r22) goto L12;
        if (r22 == false) goto L8;
        n(this.S);
    L9:
        invalidateSelf();
        u();
        return;
    L8:
        U(this.S);
        goto L9
    L12:
        return;
    }
}
