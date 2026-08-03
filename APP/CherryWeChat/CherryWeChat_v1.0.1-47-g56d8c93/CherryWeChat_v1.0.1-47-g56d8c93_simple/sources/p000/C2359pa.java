package p000;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
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
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: pa */
/* JADX INFO: loaded from: classes.dex */
public final class C2359pa {

    /* JADX INFO: renamed from: A */
    public final TextUtils.TruncateAt f8249A;

    /* JADX INFO: renamed from: B */
    public CharSequence f8250B;

    /* JADX INFO: renamed from: C */
    public CharSequence f8251C;

    /* JADX INFO: renamed from: D */
    public boolean f8252D;

    /* JADX INFO: renamed from: E */
    public final boolean f8253E;

    /* JADX INFO: renamed from: F */
    public float f8254F;

    /* JADX INFO: renamed from: G */
    public float f8255G;

    /* JADX INFO: renamed from: H */
    public float f8256H;

    /* JADX INFO: renamed from: I */
    public float f8257I;

    /* JADX INFO: renamed from: J */
    public float f8258J;

    /* JADX INFO: renamed from: K */
    public int f8259K;

    /* JADX INFO: renamed from: L */
    public int f8260L;

    /* JADX INFO: renamed from: M */
    public int[] f8261M;

    /* JADX INFO: renamed from: N */
    public boolean f8262N;

    /* JADX INFO: renamed from: O */
    public final TextPaint f8263O;

    /* JADX INFO: renamed from: P */
    public final TextPaint f8264P;

    /* JADX INFO: renamed from: Q */
    public TimeInterpolator f8265Q;

    /* JADX INFO: renamed from: R */
    public TimeInterpolator f8266R;

    /* JADX INFO: renamed from: S */
    public float f8267S;

    /* JADX INFO: renamed from: T */
    public float f8268T;

    /* JADX INFO: renamed from: U */
    public float f8269U;

    /* JADX INFO: renamed from: V */
    public ColorStateList f8270V;

    /* JADX INFO: renamed from: W */
    public float f8271W;

    /* JADX INFO: renamed from: X */
    public float f8272X;

    /* JADX INFO: renamed from: Y */
    public float f8273Y;

    /* JADX INFO: renamed from: Z */
    public StaticLayout f8274Z;

    /* JADX INFO: renamed from: a */
    public final TextInputLayout f8275a;

    /* JADX INFO: renamed from: a0 */
    public float f8276a0;

    /* JADX INFO: renamed from: b */
    public float f8277b;

    /* JADX INFO: renamed from: b0 */
    public float f8278b0;

    /* JADX INFO: renamed from: c */
    public final Rect f8279c;

    /* JADX INFO: renamed from: c0 */
    public float f8280c0;

    /* JADX INFO: renamed from: d */
    public final Rect f8281d;

    /* JADX INFO: renamed from: d0 */
    public CharSequence f8282d0;

    /* JADX INFO: renamed from: e */
    public final RectF f8283e;

    /* JADX INFO: renamed from: e0 */
    public int f8284e0;

    /* JADX INFO: renamed from: f */
    public int f8285f;

    /* JADX INFO: renamed from: f0 */
    public int f8286f0;

    /* JADX INFO: renamed from: g */
    public int f8287g;

    /* JADX INFO: renamed from: g0 */
    public final float f8288g0;

    /* JADX INFO: renamed from: h */
    public float f8289h;

    /* JADX INFO: renamed from: h0 */
    public final int f8290h0;

    /* JADX INFO: renamed from: i */
    public float f8291i;

    /* JADX INFO: renamed from: i0 */
    public int f8292i0;

    /* JADX INFO: renamed from: j */
    public ColorStateList f8293j;

    /* JADX INFO: renamed from: j0 */
    public int f8294j0;

    /* JADX INFO: renamed from: k */
    public ColorStateList f8295k;

    /* JADX INFO: renamed from: k0 */
    public boolean f8296k0;

    /* JADX INFO: renamed from: l */
    public int f8297l;

    /* JADX INFO: renamed from: m */
    public float f8298m;

    /* JADX INFO: renamed from: n */
    public float f8299n;

    /* JADX INFO: renamed from: o */
    public float f8300o;

    /* JADX INFO: renamed from: p */
    public float f8301p;

    /* JADX INFO: renamed from: q */
    public float f8302q;

    /* JADX INFO: renamed from: r */
    public float f8303r;

    /* JADX INFO: renamed from: s */
    public Typeface f8304s;

    /* JADX INFO: renamed from: t */
    public Typeface f8305t;

    /* JADX INFO: renamed from: u */
    public Typeface f8306u;

    /* JADX INFO: renamed from: v */
    public Typeface f8307v;

    /* JADX INFO: renamed from: w */
    public Typeface f8308w;

    /* JADX INFO: renamed from: x */
    public Typeface f8309x;

    /* JADX INFO: renamed from: y */
    public Typeface f8310y;

    /* JADX INFO: renamed from: z */
    public C0437K6 f8311z;

    public C2359pa(TextInputLayout r3) {
        this.f8285f = 16;
        this.f8287g = 16;
        this.f8289h = 15.0f;
        this.f8291i = 15.0f;
        this.f8249A = TextUtils.TruncateAt.END;
        this.f8253E = true;
        this.f8284e0 = 1;
        this.f8286f0 = 1;
        this.f8288g0 = 1.0f;
        this.f8290h0 = 1;
        this.f8292i0 = -1;
        this.f8294j0 = -1;
        this.f8275a = r3;
        TextPaint r0 = new TextPaint(129);
        this.f8263O = r0;
        this.f8264P = new TextPaint(r0);
        this.f8281d = new Rect();
        this.f8279c = new Rect();
        this.f8283e = new RectF();
        m4788i(r3.getContext().getResources().getConfiguration());
    }

    /* JADX INFO: renamed from: a */
    public static int m4780a(int r5, int r6, float r7) {
        float r0 = 1.0f - r7;
        return Color.argb(Math.round((Color.alpha(r6) * r7) + (Color.alpha(r5) * r0)), Math.round((Color.red(r6) * r7) + (Color.red(r5) * r0)), Math.round((Color.green(r6) * r7) + (Color.green(r5) * r0)), Math.round((Color.blue(r6) * r7) + (Color.blue(r5) * r0)));
    }

    /* JADX INFO: renamed from: h */
    public static float m4781h(float r0, float r1, float r2, TimeInterpolator r3) {
        if (r3 == null) goto L5;
        r2 = r3.getInterpolation(r2);
    L5:
        return AbstractC0776S2.m1596a(r0, r1, r2);
    }

    /* JADX INFO: renamed from: b */
    public final void m4782b() {
        float r0 = this.f8277b;
        float r2 = this.f8279c.left;
        Rect r3 = this.f8281d;
        float r22 = m4781h(r2, r3.left, r0, this.f8265Q);
        RectF r4 = this.f8283e;
        r4.left = r22;
        r4.top = m4781h(this.f8298m, this.f8299n, r0, this.f8265Q);
        r4.right = m4781h(r1.right, r3.right, r0, this.f8265Q);
        r4.bottom = m4781h(r1.bottom, r3.bottom, r0, this.f8265Q);
        this.f8302q = m4781h(this.f8300o, this.f8301p, r0, this.f8265Q);
        this.f8303r = m4781h(this.f8298m, this.f8299n, r0, this.f8265Q);
        m4784d(r0, false);
        TextInputLayout r23 = this.f8275a;
        r23.postInvalidateOnAnimation();
        C1370eh r5 = AbstractC0776S2.f2454b;
        this.f8278b0 = 1.0f - m4781h(0.0f, 1.0f, 1.0f - r0, r5);
        r23.postInvalidateOnAnimation();
        this.f8280c0 = m4781h(1.0f, 0.0f, r0, r5);
        r23.postInvalidateOnAnimation();
        ColorStateList r32 = this.f8295k;
        ColorStateList r42 = this.f8293j;
        TextPaint r7 = this.f8263O;
        if (r32 == r42) goto L5;
        r7.setColor(m4780a(m4787g(r42), m4787g(this.f8295k), r0));
    L6:
        float r33 = this.f8271W;
        float r43 = this.f8272X;
        if (r33 == r43) goto L9;
        r7.setLetterSpacing(m4781h(r43, r33, r0, r5));
    L10:
        this.f8256H = AbstractC0776S2.m1596a(0.0f, this.f8267S, r0);
        this.f8257I = AbstractC0776S2.m1596a(0.0f, this.f8268T, r0);
        this.f8258J = AbstractC0776S2.m1596a(0.0f, this.f8269U, r0);
        int r02 = m4780a(0, m4787g(this.f8270V), r0);
        this.f8259K = r02;
        r7.setShadowLayer(this.f8256H, this.f8257I, this.f8258J, r02);
        r23.postInvalidateOnAnimation();
        return;
    L9:
        r7.setLetterSpacing(r33);
        goto L10
    L5:
        r7.setColor(m4787g(r32));
        goto L6
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4783c(CharSequence r3) {
        boolean r1 = true;
        if (this.f8275a.getLayoutDirection() == 1) goto L7;
        r1 = false;
    L7:
        if (this.f8253E == false) goto L13;
        if (r1 == false) goto L10;
        C1037Y5 r0 = AbstractC2447rA.f8575d;
    L12:
        return r0.m1985c(r3, r3.length());
    L10:
        r0 = AbstractC2447rA.f8574c;
        goto L12
    L13:
        return r1;
    }

    /* JADX INFO: renamed from: d */
    public final void m4784d(float r16, boolean r17) {
        if (this.f8250B == null) goto L96;
        float r1 = this.f8281d.width();
        float r2 = this.f8279c.width();
        float r3 = 1.0f;
        if (Math.abs(r16 - 1.0f) < 1.0E-5f) goto L8;
        float r4 = this.f8289h;
        float r7 = this.f8272X;
        Typeface r8 = this.f8307v;
        if (Math.abs(r16 - 0.0f) >= 1.0E-5f) goto L27;
        this.f8254F = 1.0f;
    L28:
        float r5 = this.f8291i / this.f8289h;
        float r9 = r2 * r5;
        if (r17 == false) goto L31;
    L35:
        float r52 = r7;
    L37:
        if (r16 >= 0.5f) goto L39;
        int r0 = this.f8284e0;
    L40:
        TextPaint r11 = this.f8263O;
        boolean r72 = false;
        if (r2 <= 0.0f) goto L79;
        if (this.f8255G == r4) goto L45;
        boolean r12 = true;
    L47:
        if (this.f8273Y == r52) goto L49;
        boolean r92 = true;
    L51:
        if (this.f8310y == r8) goto L53;
        boolean r10 = true;
    L55:
        if (this.f8274Z != null) goto L57;
    L59:
        boolean r122 = false;
    L61:
        if (this.f8260L == r0) goto L63;
        boolean r13 = true;
    L64:
        if (r12 == true) goto L73;
        if (r92 == true) goto L73;
        if (r122 == true) goto L73;
        if (r10 == true) goto L73;
        if (r13 == true) goto L73;
        if (this.f8262N == true) goto L73;
        boolean r14 = false;
    L74:
        this.f8255G = r4;
        this.f8273Y = r52;
        this.f8310y = r8;
        this.f8262N = false;
        this.f8260L = r0;
        if (this.f8254F == 1.0f) goto L77;
        r72 = true;
    L77:
        r11.setLinearText(r72);
        r72 = r14;
    L73:
        r14 = true;
        goto L74
    L63:
        r13 = false;
        goto L64
    L57:
        if (r2 == r12.getWidth()) goto L59;
        r122 = true;
        goto L61
    L53:
        r10 = false;
        goto L55
    L49:
        r92 = false;
        goto L51
    L45:
        r12 = false;
    L79:
        if (this.f8251C == null) goto L83;
        if (r72 == true) goto L83;
        return;
    L83:
        r11.setTextSize(this.f8255G);
        r11.setTypeface(this.f8310y);
        r11.setLetterSpacing(this.f8273Y);
        boolean r15 = m4783c(this.f8250B);
        this.f8252D = r15;
        if (this.f8284e0 <= 1) goto L86;
    L87:
        if (r15 == false) goto L89;
    L88:
        int r102 = 1;
    L90:
        CharSequence r123 = this.f8250B;
        if (m4794o() == true) goto L94;
        r3 = this.f8254F;
    L94:
        StaticLayout r02 = m4785e(r102, r11, r123, r2 * r3, this.f8252D);
        this.f8274Z = r02;
        this.f8251C = r02.getText();
        return;
    L89:
        r102 = r0;
        goto L90
    L86:
        if (this.f8286f0 <= 1) goto L88;
    L39:
        r0 = this.f8286f0;
        goto L40
    L31:
        if (r9 <= r1) goto L35;
        if (m4794o() == false) goto L35;
        r2 = Math.min(r1 / r5, r2);
        goto L35
    L27:
        this.f8254F = m4781h(this.f8289h, this.f8291i, r16, this.f8266R) / this.f8289h;
        goto L28
    L8:
        if (m4794o() == false) goto L10;
        r4 = this.f8291i;
    L12:
        if (m4794o() == false) goto L14;
        r52 = this.f8271W;
    L16:
        if (m4794o() == false) goto L18;
        float r73 = 1.0f;
    L19:
        this.f8254F = r73;
        if (m4794o() == true) goto L23;
        r1 = r2;
    L23:
        r8 = this.f8304s;
        r2 = r1;
        goto L37
    L18:
        r73 = m4781h(this.f8289h, this.f8291i, r16, this.f8266R) / this.f8289h;
        goto L19
    L14:
        r52 = this.f8272X;
        goto L16
    L10:
        r4 = this.f8289h;
        goto L12
    }

    /* JADX INFO: renamed from: e */
    public final StaticLayout m4785e(int r5, TextPaint r6, CharSequence r7, float r8, boolean r9) {
        if (r5 != 1) goto L5;
        Layout.Alignment r1 = Layout.Alignment.ALIGN_NORMAL;
    L18:
        C1520hz r2 = new C1520hz(r7, r6, (int) r8);
        r2.f5388l = this.f8249A;
        r2.f5387k = r9;
        r2.f5381e = r1;
        r2.f5386j = false;
        r2.f5382f = r5;
        float r52 = this.f8288g0;
        r2.f5383g = 0.0f;
        r2.f5384h = r52;
        r2.f5385i = this.f8290h0;
        r2.f5389m = null;
        StaticLayout r53 = r2.m2900a();
        r53.getClass();
        return r53;
    L5:
        int r22 = Gravity.getAbsoluteGravity(this.f8285f, this.f8252D ? 1 : 0) & 7;
        if (r22 != 1) goto L8;
        r1 = Layout.Alignment.ALIGN_CENTER;
        goto L18
    L8:
        if (r22 == 5) goto L14;
        if (this.f8252D == false) goto L12;
        r1 = Layout.Alignment.ALIGN_OPPOSITE;
        goto L18
    L12:
        r1 = Layout.Alignment.ALIGN_NORMAL;
        goto L18
    L14:
        if (this.f8252D == false) goto L16;
        r1 = Layout.Alignment.ALIGN_NORMAL;
        goto L18
    L16:
        r1 = Layout.Alignment.ALIGN_OPPOSITE;
        goto L18
    }

    /* JADX INFO: renamed from: f */
    public final float m4786f() {
        int r0 = this.f8292i0;
        if (r0 != (-1)) goto L5;
        float r02 = this.f8291i;
        TextPaint r1 = this.f8264P;
        r1.setTextSize(r02);
        r1.setTypeface(this.f8304s);
        r1.setLetterSpacing(this.f8271W);
        return -r1.ascent();
    L5:
        return r0;
    }

    /* JADX INFO: renamed from: g */
    public final int m4787g(ColorStateList r3) {
        if (r3 != null) goto L5;
        return 0;
    L5:
        int[] r1 = this.f8261M;
        if (r1 == null) goto L10;
        return r3.getColorForState(r1, 0);
    L10:
        return r3.getDefaultColor();
    }

    /* JADX INFO: renamed from: i */
    public final void m4788i(Configuration r3) {
        if (Build.VERSION.SDK_INT < 31) goto L20;
        Typeface r0 = this.f8306u;
        if (r0 == null) goto L7;
        this.f8305t = AbstractC0828TB.m1651u(r3, r0);
    L7:
        Typeface r02 = this.f8309x;
        if (r02 == null) goto L10;
        this.f8308w = AbstractC0828TB.m1651u(r3, r02);
    L10:
        Typeface r32 = this.f8305t;
        if (r32 != null) goto L14;
        r32 = this.f8306u;
    L14:
        this.f8304s = r32;
        Typeface r33 = this.f8308w;
        if (r33 != null) goto L18;
        r33 = this.f8309x;
    L18:
        this.f8307v = r33;
        m4789j(true);
        return;
    }

    /* JADX INFO: renamed from: j */
    public final void m4789j(boolean r15) {
        TextInputLayout r0 = this.f8275a;
        if (r0.getHeight() > 0) goto L5;
    L6:
        if (r15 == false) goto L72;
    L7:
        m4784d(1.0f, r15);
        CharSequence r1 = this.f8251C;
        TextPaint r2 = this.f8263O;
        if (r1 != null) goto L10;
    L16:
        CharSequence r12 = this.f8282d0;
        float r4 = 0.0f;
        if (r12 == null) goto L19;
        this.f8276a0 = r2.measureText(r12, 0, r12.length());
    L20:
        int r13 = Gravity.getAbsoluteGravity(this.f8287g, this.f8252D ? 1 : 0);
        int r5 = r13 & 112;
        Rect r9 = this.f8281d;
        if (r5 == 48) goto L25;
        if (r5 == 80) goto L24;
        this.f8299n = r9.centerY() - ((r2.descent() - r2.ascent()) / 2.0f);
    L26:
        int r14 = r13 & 8388615;
        if (r14 == 1) goto L31;
        if (r14 == 5) goto L30;
        this.f8301p = r9.left;
    L33:
        if (this.f8276a0 > r9.width()) goto L35;
        float r16 = this.f8301p;
        float r122 = Math.max(0.0f, r9.left - r16) + r16;
        this.f8301p = r122;
        this.f8301p = Math.min(0.0f, r9.right - (this.f8276a0 + r122)) + r122;
    L35:
        float r17 = this.f8291i;
        TextPaint r123 = this.f8264P;
        r123.setTextSize(r17);
        r123.setTypeface(this.f8304s);
        r123.setLetterSpacing(this.f8271W);
        if ((r123.descent() + (-r123.ascent())) > r9.height()) goto L38;
        float r18 = this.f8299n;
        float r124 = Math.max(0.0f, r9.top - r18) + r18;
        this.f8299n = r124;
        this.f8299n = Math.min(0.0f, r9.bottom - (m4786f() + r124)) + r124;
    L38:
        m4784d(0.0f, r15);
        StaticLayout r152 = this.f8274Z;
        if (r152 == null) goto L41;
        float r153 = r152.getHeight();
    L42:
        StaticLayout r19 = this.f8274Z;
        if (r19 != null) goto L45;
    L47:
        CharSequence r110 = this.f8251C;
        if (r110 == null) goto L50;
        float r111 = r2.measureText(r110, 0, r110.length());
    L51:
        StaticLayout r92 = this.f8274Z;
        if (r92 == null) goto L54;
        int r93 = r92.getLineCount();
    L55:
        this.f8297l = r93;
        int r94 = Gravity.getAbsoluteGravity(this.f8285f, this.f8252D ? 1 : 0);
        int r125 = r94 & 112;
        Rect r132 = this.f8279c;
        if (r125 == 48) goto L63;
        if (r125 == 80) goto L59;
        this.f8298m = r132.centerY() - (r153 / 2.0f);
    L64:
        int r154 = r94 & 8388615;
        if (r154 == 1) goto L69;
        if (r154 == 5) goto L68;
        this.f8300o = r132.left;
    L70:
        m4784d(this.f8277b, false);
        r0.postInvalidateOnAnimation();
        m4782b();
        return;
    L68:
        this.f8300o = r132.right - r111;
        goto L70
    L69:
        this.f8300o = r132.centerX() - (r111 / 2.0f);
        goto L70
    L59:
        float r6 = r132.bottom - r153;
        if (this.f8296k0 == false) goto L62;
        r4 = r2.descent();
    L62:
        this.f8298m = r6 + r4;
        goto L64
    L63:
        this.f8298m = r132.top;
        goto L64
    L54:
        r93 = 0;
        goto L55
    L50:
        r111 = 0.0f;
        goto L51
    L45:
        if (this.f8284e0 <= 1) goto L47;
        r111 = r19.getWidth();
        goto L51
    L41:
        r153 = 0.0f;
        goto L42
    L30:
        this.f8301p = r9.right - this.f8276a0;
        goto L33
    L31:
        this.f8301p = r9.centerX() - (this.f8276a0 / 2.0f);
        goto L33
    L24:
        this.f8299n = r2.ascent() + r9.bottom;
        goto L26
    L25:
        this.f8299n = r9.top;
        goto L26
    L19:
        this.f8276a0 = 0.0f;
        goto L20
    L10:
        if (this.f8274Z == null) goto L16;
        if (m4794o() == false) goto L14;
        CharSequence r112 = TextUtils.ellipsize(this.f8251C, r2, this.f8274Z.getWidth(), this.f8249A);
    L15:
        this.f8282d0 = r112;
        goto L16
    L14:
        r112 = this.f8251C;
        goto L15
    L72:
        return;
    L5:
        if (r0.getWidth() > 0) goto L7;
        goto L6
    }

    /* JADX INFO: renamed from: k */
    public final void m4790k(ColorStateList r2) {
        if (this.f8295k == r2) goto L5;
    L8:
        this.f8295k = r2;
        this.f8293j = r2;
        m4789j(false);
        return;
    L5:
        if (this.f8293j != r2) goto L8;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m4791l(Typeface r3) {
        C0437K6 r0 = this.f8311z;
        if (r0 == null) goto L6;
        r0.f1436p = true;
    L6:
        if (this.f8306u == r3) goto L12;
        this.f8306u = r3;
        Typeface r32 = AbstractC0828TB.m1651u(this.f8275a.getContext().getResources().getConfiguration(), r3);
        this.f8305t = r32;
        if (r32 != null) goto L10;
        r32 = this.f8306u;
    L10:
        this.f8304s = r32;
        return true;
    L12:
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final void m4792m(float r3) {
        float r0 = 0.0f;
        if (r3 >= 0.0f) goto L5;
    L4:
        r3 = r0;
    L9:
        if (r3 == this.f8277b) goto L12;
        this.f8277b = r3;
        m4782b();
        return;
    L12:
        return;
    L5:
        r0 = 1.0f;
        if (r3 <= 1.0f) goto L9;
        goto L4
    }

    /* JADX INFO: renamed from: n */
    public final void m4793n(Typeface r4) {
        boolean r0 = m4791l(r4);
        if (this.f8309x == r4) goto L8;
        this.f8309x = r4;
        Typeface r42 = AbstractC0828TB.m1651u(this.f8275a.getContext().getResources().getConfiguration(), r4);
        this.f8308w = r42;
        if (r42 != null) goto L7;
        r42 = this.f8309x;
    L7:
        this.f8307v = r42;
        boolean r43 = true;
    L9:
        if (r0 == true) goto L13;
        if (r43 == true) goto L13;
        return;
    L13:
        m4789j(false);
        return;
    L8:
        r43 = false;
        goto L9
    }

    /* JADX INFO: renamed from: o */
    public final boolean m4794o() {
        if (this.f8286f0 != 1) goto L5;
        return true;
    L5:
        return false;
    }
}
