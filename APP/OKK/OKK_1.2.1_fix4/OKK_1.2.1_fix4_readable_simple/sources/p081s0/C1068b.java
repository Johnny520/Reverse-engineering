package p081s0;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import com.abc.core.runtime.AbstractC0805P;
import java.lang.reflect.Field;
import p002B.AbstractC0058h;
import p002B.C0057g;
import p006D.AbstractC0080Q;
import p028P.C0273a;
import p060h0.AbstractC0945a;
import p084u0.C1096a;

/* JADX INFO: renamed from: s0.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1068b {

    /* JADX INFO: renamed from: A */
    public CharSequence f4094A;

    /* JADX INFO: renamed from: B */
    public CharSequence f4095B;

    /* JADX INFO: renamed from: C */
    public boolean f4096C;

    /* JADX INFO: renamed from: D */
    public final boolean f4097D;

    /* JADX INFO: renamed from: E */
    public Bitmap f4098E;

    /* JADX INFO: renamed from: F */
    public float f4099F;

    /* JADX INFO: renamed from: G */
    public float f4100G;

    /* JADX INFO: renamed from: H */
    public float f4101H;

    /* JADX INFO: renamed from: I */
    public float f4102I;

    /* JADX INFO: renamed from: J */
    public float f4103J;

    /* JADX INFO: renamed from: K */
    public int f4104K;

    /* JADX INFO: renamed from: L */
    public int[] f4105L;

    /* JADX INFO: renamed from: M */
    public boolean f4106M;

    /* JADX INFO: renamed from: N */
    public final TextPaint f4107N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f4108O;

    /* JADX INFO: renamed from: P */
    public TimeInterpolator f4109P;

    /* JADX INFO: renamed from: Q */
    public TimeInterpolator f4110Q;

    /* JADX INFO: renamed from: R */
    public float f4111R;

    /* JADX INFO: renamed from: S */
    public float f4112S;

    /* JADX INFO: renamed from: T */
    public float f4113T;

    /* JADX INFO: renamed from: U */
    public ColorStateList f4114U;

    /* JADX INFO: renamed from: V */
    public float f4115V;

    /* JADX INFO: renamed from: W */
    public float f4116W;

    /* JADX INFO: renamed from: X */
    public float f4117X;

    /* JADX INFO: renamed from: Y */
    public StaticLayout f4118Y;

    /* JADX INFO: renamed from: Z */
    public float f4119Z;

    /* JADX INFO: renamed from: a */
    public final View f4120a;

    /* JADX INFO: renamed from: a0 */
    public float f4121a0;

    /* JADX INFO: renamed from: b */
    public float f4122b;

    /* JADX INFO: renamed from: b0 */
    public float f4123b0;

    /* JADX INFO: renamed from: c */
    public final Rect f4124c;

    /* JADX INFO: renamed from: c0 */
    public CharSequence f4125c0;

    /* JADX INFO: renamed from: d */
    public final Rect f4126d;

    /* JADX INFO: renamed from: d0 */
    public final int f4127d0;

    /* JADX INFO: renamed from: e */
    public final RectF f4128e;

    /* JADX INFO: renamed from: e0 */
    public final float f4129e0;

    /* JADX INFO: renamed from: f */
    public int f4130f;

    /* JADX INFO: renamed from: f0 */
    public final int f4131f0;

    /* JADX INFO: renamed from: g */
    public int f4132g;

    /* JADX INFO: renamed from: h */
    public float f4133h;

    /* JADX INFO: renamed from: i */
    public float f4134i;

    /* JADX INFO: renamed from: j */
    public ColorStateList f4135j;

    /* JADX INFO: renamed from: k */
    public ColorStateList f4136k;

    /* JADX INFO: renamed from: l */
    public float f4137l;

    /* JADX INFO: renamed from: m */
    public float f4138m;

    /* JADX INFO: renamed from: n */
    public float f4139n;

    /* JADX INFO: renamed from: o */
    public float f4140o;

    /* JADX INFO: renamed from: p */
    public float f4141p;

    /* JADX INFO: renamed from: q */
    public float f4142q;

    /* JADX INFO: renamed from: r */
    public Typeface f4143r;

    /* JADX INFO: renamed from: s */
    public Typeface f4144s;

    /* JADX INFO: renamed from: t */
    public Typeface f4145t;

    /* JADX INFO: renamed from: u */
    public Typeface f4146u;

    /* JADX INFO: renamed from: v */
    public Typeface f4147v;

    /* JADX INFO: renamed from: w */
    public Typeface f4148w;

    /* JADX INFO: renamed from: x */
    public Typeface f4149x;

    /* JADX INFO: renamed from: y */
    public C1096a f4150y;

    /* JADX INFO: renamed from: z */
    public final TextUtils.TruncateAt f4151z;

    public C1068b(View r3) {
        this.f4130f = 16;
        this.f4132g = 16;
        this.f4133h = 15.0f;
        this.f4134i = 15.0f;
        this.f4151z = TextUtils.TruncateAt.END;
        this.f4097D = true;
        this.f4127d0 = 1;
        this.f4129e0 = 1.0f;
        this.f4131f0 = 1;
        this.f4120a = r3;
        TextPaint r02 = new TextPaint(129);
        this.f4107N = r02;
        this.f4108O = new TextPaint(r02);
        this.f4126d = new Rect();
        this.f4124c = new Rect();
        this.f4128e = new RectF();
        m2543g(r3.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m2537a(int r5, int r6, float r7) {
        float r02 = 1.0f - r7;
        return Color.argb(Math.round((Color.alpha(r6) * r7) + (Color.alpha(r5) * r02)), Math.round((Color.red(r6) * r7) + (Color.red(r5) * r02)), Math.round((Color.green(r6) * r7) + (Color.green(r5) * r02)), Math.round((Color.blue(r6) * r7) + (Color.blue(r5) * r02)));
    }

    /* JADX INFO: renamed from: f */
    public static float m2538f(float r02, float r1, float r2, TimeInterpolator r3) {
        if (r3 == null) goto L5;
        r2 = r3.getInterpolation(r2);
    L5:
        return AbstractC0945a.m2275a(r02, r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2539b(CharSequence r3) {
        Field r02 = AbstractC0080Q.f219a;
        boolean r1 = true;
        if (this.f4120a.getLayoutDirection() == 1) goto L7;
        r1 = false;
    L7:
        if (this.f4097D == false) goto L13;
        if (r1 == false) goto L10;
        C0057g r03 = AbstractC0058h.f202d;
    L12:
        return r03.m196b(r3.length(), r3);
    L10:
        r03 = AbstractC0058h.f201c;
        goto L12
    L13:
        return r1;
    }

    /* JADX INFO: renamed from: c */
    public final void m2540c(float r13, boolean r14) {
        if (this.f4094A != null) goto L5;
        return;
    L5:
        float r02 = this.f4126d.width();
        float r1 = this.f4124c.width();
        if (Math.abs(r13 - 1.0f) >= 1.0E-5f) goto L8;
        boolean r3 = true;
    L10:
        if (r3 == false) goto L12;
        float r132 = this.f4134i;
        float r142 = this.f4115V;
        this.f4099F = 1.0f;
        Typeface r12 = this.f4143r;
    L23:
        TextPaint r4 = this.f4107N;
        if (r02 > 0.0f) goto L26;
        boolean r32 = false;
    L59:
        if (this.f4095B == null) goto L61;
        if (r32 == true) goto L61;
        return;
    L61:
        r4.setTextSize(this.f4100G);
        r4.setTypeface(this.f4149x);
        r4.setLetterSpacing(this.f4117X);
        boolean r133 = m2539b(this.f4094A);
        this.f4096C = r133;
        int r143 = this.f4127d0;
        if (r143 <= 1) goto L64;
        if (r133 == true) goto L64;
    L65:
        if (r143 != 1) goto L67;
        Layout.Alignment r15 = Layout.Alignment.ALIGN_NORMAL;
    L80:
        C1073g r33 = new C1073g(this.f4094A, r4, (int) r02);
        r33.f4171l = this.f4151z;
        r33.f4170k = r133;
        r33.f4164e = r15;
        r33.f4169j = false;
        r33.f4165f = r143;
        float r134 = this.f4129e0;
        r33.f4166g = 0.0f;
        r33.f4167h = r134;
        r33.f4168i = this.f4131f0;
        StaticLayout r135 = r33.m2551a();
        r135.getClass();
        this.f4118Y = r135;
        this.f4095B = r135.getText();
        return;
    L67:
        int r16 = Gravity.getAbsoluteGravity(this.f4130f, r133 ? 1 : 0) & 7;
        if (r16 != 1) goto L70;
        r15 = Layout.Alignment.ALIGN_CENTER;
        goto L80
    L70:
        if (r16 == 5) goto L76;
        if (this.f4096C == false) goto L74;
        r15 = Layout.Alignment.ALIGN_OPPOSITE;
        goto L80
    L74:
        r15 = Layout.Alignment.ALIGN_NORMAL;
        goto L80
    L76:
        if (this.f4096C == false) goto L78;
        r15 = Layout.Alignment.ALIGN_NORMAL;
        goto L80
    L78:
        r15 = Layout.Alignment.ALIGN_OPPOSITE;
    L64:
        r143 = 1;
        goto L65
    L26:
        if (this.f4100G == r132) goto L28;
        boolean r34 = true;
    L30:
        if (this.f4117X == r142) goto L32;
        boolean r8 = true;
    L34:
        if (this.f4149x == r12) goto L36;
        boolean r9 = true;
    L38:
        if (this.f4118Y != null) goto L40;
    L42:
        boolean r10 = false;
    L43:
        if (r34 == true) goto L51;
        if (r8 == true) goto L51;
        if (r10 == true) goto L51;
        if (r9 == true) goto L51;
        if (this.f4106M == true) goto L51;
        boolean r35 = false;
    L52:
        this.f4100G = r132;
        this.f4117X = r142;
        this.f4149x = r12;
        this.f4106M = false;
        if (this.f4099F == 1.0f) goto L55;
        boolean r136 = true;
    L56:
        r4.setLinearText(r136);
        r32 = r35;
        goto L59
    L55:
        r136 = false;
    L51:
        r35 = true;
        goto L52
    L40:
        if (r02 == r10.getWidth()) goto L42;
        r10 = true;
        goto L43
    L36:
        r9 = false;
        goto L38
    L32:
        r8 = false;
        goto L34
    L28:
        r34 = false;
        goto L30
    L12:
        float r36 = this.f4133h;
        float r82 = this.f4116W;
        Typeface r92 = this.f4146u;
        if (Math.abs(r13 - 0.0f) >= 1.0E-5f) goto L15;
        this.f4099F = 1.0f;
    L16:
        float r137 = this.f4134i / this.f4133h;
        float r42 = r1 * r137;
        if (r14 == false) goto L19;
    L22:
        r02 = r1;
    L21:
        r132 = r36;
        r142 = r82;
        r12 = r92;
        goto L23
    L19:
        if (r42 <= r02) goto L22;
        r02 = Math.min(r02 / r137, r1);
        goto L21
    L15:
        this.f4099F = m2538f(this.f4133h, this.f4134i, r13, this.f4110Q) / this.f4133h;
        goto L16
    L8:
        r3 = false;
        goto L10
    }

    /* JADX INFO: renamed from: d */
    public final float m2541d() {
        TextPaint r02 = this.f4108O;
        r02.setTextSize(this.f4134i);
        r02.setTypeface(this.f4143r);
        r02.setLetterSpacing(this.f4115V);
        return -r02.ascent();
    }

    /* JADX INFO: renamed from: e */
    public final int m2542e(ColorStateList r3) {
        if (r3 != null) goto L5;
        return 0;
    L5:
        int[] r1 = this.f4105L;
        if (r1 == null) goto L10;
        return r3.getColorForState(r1, 0);
    L10:
        return r3.getDefaultColor();
    }

    /* JADX INFO: renamed from: g */
    public final void m2543g(Configuration r3) {
        if (Build.VERSION.SDK_INT < 31) goto L20;
        Typeface r02 = this.f4145t;
        if (r02 == null) goto L7;
        this.f4144s = AbstractC0805P.m2034J(r3, r02);
    L7:
        Typeface r03 = this.f4148w;
        if (r03 == null) goto L10;
        this.f4147v = AbstractC0805P.m2034J(r3, r03);
    L10:
        Typeface r32 = this.f4144s;
        if (r32 != null) goto L14;
        r32 = this.f4145t;
    L14:
        this.f4143r = r32;
        Typeface r33 = this.f4147v;
        if (r33 != null) goto L18;
        r33 = this.f4148w;
    L18:
        this.f4146u = r33;
        m2544h(true);
        return;
    }

    /* JADX INFO: renamed from: h */
    public final void m2544h(boolean r17) {
        View r2 = this.f4120a;
        if (r2.getHeight() > 0) goto L5;
    L6:
        if (r17 == false) goto L69;
    L7:
        m2540c(1.0f, r17);
        CharSequence r4 = this.f4095B;
        TextPaint r5 = this.f4107N;
        if (r4 != null) goto L10;
    L12:
        CharSequence r42 = this.f4125c0;
        if (r42 == null) goto L15;
        this.f4119Z = r5.measureText(r42, 0, r42.length());
    L16:
        int r43 = Gravity.getAbsoluteGravity(this.f4132g, this.f4096C ? 1 : 0);
        int r8 = r43 & 112;
        Rect r9 = this.f4126d;
        if (r8 == 48) goto L21;
        if (r8 == 80) goto L20;
        this.f4138m = r9.centerY() - ((r5.descent() - r5.ascent()) / 2.0f);
    L22:
        int r44 = r43 & 8388615;
        if (r44 == 1) goto L27;
        if (r44 == 5) goto L26;
        this.f4140o = r9.left;
    L28:
        m2540c(0.0f, r17);
        StaticLayout r1 = this.f4118Y;
        if (r1 == null) goto L31;
        float r12 = r1.getHeight();
    L32:
        StaticLayout r45 = this.f4118Y;
        if (r45 != null) goto L35;
    L37:
        CharSequence r46 = this.f4095B;
        if (r46 == null) goto L40;
        float r47 = r5.measureText(r46, 0, r46.length());
    L41:
        StaticLayout r15 = this.f4118Y;
        if (r15 == null) goto L44;
        r15.getLineCount();
    L44:
        int r7 = Gravity.getAbsoluteGravity(this.f4130f, this.f4096C ? 1 : 0);
        int r152 = r7 & 112;
        Rect r6 = this.f4124c;
        if (r152 == 48) goto L49;
        if (r152 == 80) goto L48;
        this.f4137l = r6.centerY() - (r12 / 2.0f);
    L50:
        int r13 = r7 & 8388615;
        if (r13 == 1) goto L55;
        if (r13 == 5) goto L54;
        this.f4139n = r6.left;
    L56:
        Bitmap r14 = this.f4098E;
        if (r14 == null) goto L59;
        r14.recycle();
        this.f4098E = null;
    L59:
        m2548l(this.f4122b);
        float r16 = this.f4122b;
        float r48 = m2538f(r6.left, r9.left, r16, this.f4109P);
        RectF r72 = this.f4128e;
        r72.left = r48;
        r72.top = m2538f(this.f4137l, this.f4138m, r16, this.f4109P);
        r72.right = m2538f(r6.right, r9.right, r16, this.f4109P);
        r72.bottom = m2538f(r6.bottom, r9.bottom, r16, this.f4109P);
        this.f4141p = m2538f(this.f4139n, this.f4140o, r16, this.f4109P);
        this.f4142q = m2538f(this.f4137l, this.f4138m, r16, this.f4109P);
        m2548l(r16);
        C0273a r62 = AbstractC0945a.f3355b;
        this.f4121a0 = 1.0f - m2538f(0.0f, 1.0f, 1.0f - r16, r62);
        Field r49 = AbstractC0080Q.f219a;
        r2.postInvalidateOnAnimation();
        this.f4123b0 = m2538f(1.0f, 0.0f, r16, r62);
        r2.postInvalidateOnAnimation();
        ColorStateList r3 = this.f4136k;
        ColorStateList r410 = this.f4135j;
        if (r3 == r410) goto L62;
        r5.setColor(m2537a(m2542e(r410), m2542e(this.f4136k), r16));
    L63:
        float r32 = this.f4115V;
        float r411 = this.f4116W;
        if (r32 == r411) goto L66;
        r5.setLetterSpacing(m2538f(r411, r32, r16, r62));
    L67:
        this.f4101H = AbstractC0945a.m2275a(0.0f, this.f4111R, r16);
        this.f4102I = AbstractC0945a.m2275a(0.0f, this.f4112S, r16);
        this.f4103J = AbstractC0945a.m2275a(0.0f, this.f4113T, r16);
        int r18 = m2537a(0, m2542e(this.f4114U), r16);
        this.f4104K = r18;
        r5.setShadowLayer(this.f4101H, this.f4102I, this.f4103J, r18);
        r2.postInvalidateOnAnimation();
        return;
    L66:
        r5.setLetterSpacing(r32);
        goto L67
    L62:
        r5.setColor(m2542e(r3));
        goto L63
    L54:
        this.f4139n = r6.right - r47;
        goto L56
    L55:
        this.f4139n = r6.centerX() - (r47 / 2.0f);
        goto L56
    L48:
        this.f4137l = r5.descent() + (r6.bottom - r12);
        goto L50
    L49:
        this.f4137l = r6.top;
        goto L50
    L40:
        r47 = 0.0f;
        goto L41
    L35:
        if (this.f4127d0 <= 1) goto L37;
        r47 = r45.getWidth();
        goto L41
    L31:
        r12 = 0.0f;
        goto L32
    L26:
        this.f4140o = r9.right - this.f4119Z;
        goto L28
    L27:
        this.f4140o = r9.centerX() - (this.f4119Z / 2.0f);
        goto L28
    L20:
        this.f4138m = r5.ascent() + r9.bottom;
        goto L22
    L21:
        this.f4138m = r9.top;
        goto L22
    L15:
        this.f4119Z = 0.0f;
        goto L16
    L10:
        if (this.f4118Y == null) goto L12;
        this.f4125c0 = TextUtils.ellipsize(r4, r5, r6.getWidth(), this.f4151z);
        goto L12
    L69:
        return;
    L5:
        if (r2.getWidth() > 0) goto L7;
        goto L6
    }

    /* JADX INFO: renamed from: i */
    public final void m2545i(ColorStateList r2) {
        if (this.f4136k == r2) goto L5;
    L6:
        this.f4136k = r2;
        this.f4135j = r2;
        m2544h(false);
        return;
    L5:
        if (this.f4135j != r2) goto L6;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m2546j(Typeface r3) {
        C1096a r02 = this.f4150y;
        if (r02 == null) goto L6;
        r02.f4226d = true;
    L6:
        if (this.f4145t == r3) goto L12;
        this.f4145t = r3;
        Typeface r32 = AbstractC0805P.m2034J(this.f4120a.getContext().getResources().getConfiguration(), r3);
        this.f4144s = r32;
        if (r32 != null) goto L10;
        r32 = this.f4145t;
    L10:
        this.f4143r = r32;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: k */
    public final void m2547k(float r9) {
        if (r9 >= 0.0f) goto L6;
        r9 = 0.0f;
    L9:
        if (r9 == this.f4122b) goto L20;
        this.f4122b = r9;
        float r3 = this.f4124c.left;
        Rect r4 = this.f4126d;
        float r32 = m2538f(r3, r4.left, r9, this.f4109P);
        RectF r5 = this.f4128e;
        r5.left = r32;
        r5.top = m2538f(this.f4137l, this.f4138m, r9, this.f4109P);
        r5.right = m2538f(r1.right, r4.right, r9, this.f4109P);
        r5.bottom = m2538f(r1.bottom, r4.bottom, r9, this.f4109P);
        this.f4141p = m2538f(this.f4139n, this.f4140o, r9, this.f4109P);
        this.f4142q = m2538f(this.f4137l, this.f4138m, r9, this.f4109P);
        m2548l(r9);
        C0273a r33 = AbstractC0945a.f3355b;
        this.f4121a0 = 1.0f - m2538f(0.0f, 1.0f, 1.0f - r9, r33);
        Field r1 = AbstractC0080Q.f219a;
        View r12 = this.f4120a;
        r12.postInvalidateOnAnimation();
        this.f4123b0 = m2538f(1.0f, 0.0f, r9, r33);
        r12.postInvalidateOnAnimation();
        ColorStateList r2 = this.f4136k;
        ColorStateList r42 = this.f4135j;
        TextPaint r52 = this.f4107N;
        if (r2 == r42) goto L13;
        r52.setColor(m2537a(m2542e(r42), m2542e(this.f4136k), r9));
    L14:
        float r22 = this.f4115V;
        float r43 = this.f4116W;
        if (r22 == r43) goto L17;
        r52.setLetterSpacing(m2538f(r43, r22, r9, r33));
    L18:
        this.f4101H = AbstractC0945a.m2275a(0.0f, this.f4111R, r9);
        this.f4102I = AbstractC0945a.m2275a(0.0f, this.f4112S, r9);
        this.f4103J = AbstractC0945a.m2275a(0.0f, this.f4113T, r9);
        int r92 = m2537a(0, m2542e(this.f4114U), r9);
        this.f4104K = r92;
        r52.setShadowLayer(this.f4101H, this.f4102I, this.f4103J, r92);
        r12.postInvalidateOnAnimation();
        return;
    L17:
        r52.setLetterSpacing(r22);
        goto L18
    L13:
        r52.setColor(m2542e(r2));
        goto L14
    L20:
        return;
    L6:
        if (r9 <= 1.0f) goto L9;
        r9 = 1.0f;
        goto L9
    }

    /* JADX INFO: renamed from: l */
    public final void m2548l(float r2) {
        m2540c(r2, false);
        Field r22 = AbstractC0080Q.f219a;
        this.f4120a.postInvalidateOnAnimation();
    }

    /* JADX INFO: renamed from: m */
    public final void m2549m(Typeface r4) {
        boolean r02 = m2546j(r4);
        if (this.f4148w == r4) goto L8;
        this.f4148w = r4;
        Typeface r42 = AbstractC0805P.m2034J(this.f4120a.getContext().getResources().getConfiguration(), r4);
        this.f4147v = r42;
        if (r42 != null) goto L7;
        r42 = this.f4148w;
    L7:
        this.f4146u = r42;
        boolean r43 = true;
    L9:
        if (r02 == true) goto L11;
        if (r43 == true) goto L11;
        return;
    L11:
        m2544h(false);
        return;
    L8:
        r43 = false;
        goto L9
    }
}
