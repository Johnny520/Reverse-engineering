package p075p;

import android.view.ViewGroup;
import p071n.C0999d;
import p071n.C1003h;

/* JADX INFO: renamed from: p.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1039e extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A */
    public float f3877A;

    /* JADX INFO: renamed from: B */
    public String f3878B;

    /* JADX INFO: renamed from: C */
    public int f3879C;

    /* JADX INFO: renamed from: D */
    public float f3880D;

    /* JADX INFO: renamed from: E */
    public float f3881E;

    /* JADX INFO: renamed from: F */
    public int f3882F;

    /* JADX INFO: renamed from: G */
    public int f3883G;

    /* JADX INFO: renamed from: H */
    public int f3884H;

    /* JADX INFO: renamed from: I */
    public int f3885I;

    /* JADX INFO: renamed from: J */
    public int f3886J;

    /* JADX INFO: renamed from: K */
    public int f3887K;

    /* JADX INFO: renamed from: L */
    public int f3888L;

    /* JADX INFO: renamed from: M */
    public int f3889M;

    /* JADX INFO: renamed from: N */
    public float f3890N;

    /* JADX INFO: renamed from: O */
    public float f3891O;

    /* JADX INFO: renamed from: P */
    public int f3892P;

    /* JADX INFO: renamed from: Q */
    public int f3893Q;

    /* JADX INFO: renamed from: R */
    public int f3894R;

    /* JADX INFO: renamed from: S */
    public boolean f3895S;

    /* JADX INFO: renamed from: T */
    public boolean f3896T;

    /* JADX INFO: renamed from: U */
    public String f3897U;

    /* JADX INFO: renamed from: V */
    public boolean f3898V;

    /* JADX INFO: renamed from: W */
    public boolean f3899W;

    /* JADX INFO: renamed from: X */
    public boolean f3900X;

    /* JADX INFO: renamed from: Y */
    public boolean f3901Y;

    /* JADX INFO: renamed from: Z */
    public boolean f3902Z;

    /* JADX INFO: renamed from: a */
    public int f3903a;

    /* JADX INFO: renamed from: a0 */
    public int f3904a0;

    /* JADX INFO: renamed from: b */
    public int f3905b;

    /* JADX INFO: renamed from: b0 */
    public int f3906b0;

    /* JADX INFO: renamed from: c */
    public float f3907c;

    /* JADX INFO: renamed from: c0 */
    public int f3908c0;

    /* JADX INFO: renamed from: d */
    public int f3909d;

    /* JADX INFO: renamed from: d0 */
    public int f3910d0;

    /* JADX INFO: renamed from: e */
    public int f3911e;

    /* JADX INFO: renamed from: e0 */
    public int f3912e0;

    /* JADX INFO: renamed from: f */
    public int f3913f;

    /* JADX INFO: renamed from: f0 */
    public int f3914f0;

    /* JADX INFO: renamed from: g */
    public int f3915g;

    /* JADX INFO: renamed from: g0 */
    public float f3916g0;

    /* JADX INFO: renamed from: h */
    public int f3917h;

    /* JADX INFO: renamed from: h0 */
    public int f3918h0;

    /* JADX INFO: renamed from: i */
    public int f3919i;

    /* JADX INFO: renamed from: i0 */
    public int f3920i0;

    /* JADX INFO: renamed from: j */
    public int f3921j;

    /* JADX INFO: renamed from: j0 */
    public float f3922j0;

    /* JADX INFO: renamed from: k */
    public int f3923k;

    /* JADX INFO: renamed from: k0 */
    public C0999d f3924k0;

    /* JADX INFO: renamed from: l */
    public int f3925l;

    /* JADX INFO: renamed from: m */
    public int f3926m;

    /* JADX INFO: renamed from: n */
    public int f3927n;

    /* JADX INFO: renamed from: o */
    public float f3928o;

    /* JADX INFO: renamed from: p */
    public int f3929p;

    /* JADX INFO: renamed from: q */
    public int f3930q;

    /* JADX INFO: renamed from: r */
    public int f3931r;

    /* JADX INFO: renamed from: s */
    public int f3932s;

    /* JADX INFO: renamed from: t */
    public int f3933t;

    /* JADX INFO: renamed from: u */
    public int f3934u;

    /* JADX INFO: renamed from: v */
    public int f3935v;

    /* JADX INFO: renamed from: w */
    public int f3936w;

    /* JADX INFO: renamed from: x */
    public int f3937x;

    /* JADX INFO: renamed from: y */
    public int f3938y;

    /* JADX INFO: renamed from: z */
    public float f3939z;

    /* JADX INFO: renamed from: a */
    public final void m2518a() {
        this.f3901Y = false;
        this.f3898V = true;
        this.f3899W = true;
        int r2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (r2 == (-2)) goto L5;
    L9:
        int r4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (r4 != (-2)) goto L17;
        if (this.f3896T == false) goto L17;
        this.f3899W = false;
        if (this.f3885I != 0) goto L17;
        this.f3885I = 1;
    L17:
        if (r2 == 0) goto L19;
        if (r2 == (-1)) goto L19;
    L24:
        if (r4 == 0) goto L26;
        if (r4 == (-1)) goto L26;
    L32:
        if (this.f3907c == (-1.0f)) goto L34;
    L37:
        this.f3901Y = true;
        this.f3898V = true;
        this.f3899W = true;
        if ((this.f3924k0 instanceof C1003h) == true) goto L40;
        this.f3924k0 = new C1003h();
    L40:
        ((C1003h) this.f3924k0).m2436B(this.f3894R);
        return;
    L34:
        if (this.f3903a != (-1)) goto L37;
        if (this.f3905b != (-1)) goto L37;
        return;
    L26:
        this.f3899W = false;
        if (r4 != 0) goto L32;
        if (this.f3885I != 1) goto L32;
        ((ViewGroup.MarginLayoutParams) this).height = -2;
        this.f3896T = true;
    L19:
        this.f3898V = false;
        if (r2 != 0) goto L24;
        if (this.f3884H != 1) goto L24;
        ((ViewGroup.MarginLayoutParams) this).width = -2;
        this.f3895S = true;
        goto L24
    L5:
        if (this.f3895S == false) goto L9;
        this.f3898V = false;
        if (this.f3884H != 0) goto L9;
        this.f3884H = 1;
        goto L9
    }

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int r10) {
        int r02 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int r1 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(r10);
        boolean r2 = false;
        if (1 != getLayoutDirection()) goto L5;
        boolean r102 = true;
    L6:
        this.f3908c0 = -1;
        this.f3910d0 = -1;
        this.f3904a0 = -1;
        this.f3906b0 = -1;
        this.f3912e0 = this.f3933t;
        this.f3914f0 = this.f3935v;
        float r5 = this.f3939z;
        this.f3916g0 = r5;
        int r6 = this.f3903a;
        this.f3918h0 = r6;
        int r7 = this.f3905b;
        this.f3920i0 = r7;
        float r8 = this.f3907c;
        this.f3922j0 = r8;
        if (r102 == false) goto L41;
        int r103 = this.f3929p;
        if (r103 == (-1)) goto L12;
        this.f3908c0 = r103;
    L11:
        r2 = true;
    L15:
        int r104 = this.f3931r;
        if (r104 == (-1)) goto L18;
        this.f3906b0 = r104;
        r2 = true;
    L18:
        int r105 = this.f3932s;
        if (r105 == (-1)) goto L21;
        this.f3904a0 = r105;
        r2 = true;
    L21:
        int r106 = this.f3937x;
        if (r106 == (-1)) goto L24;
        this.f3914f0 = r106;
    L24:
        int r107 = this.f3938y;
        if (r107 == (-1)) goto L28;
        this.f3912e0 = r107;
    L28:
        if (r2 == false) goto L31;
        this.f3916g0 = 1.0f - r5;
    L31:
        if (this.f3901Y == false) goto L60;
        if (this.f3894R != 1) goto L60;
        if (r8 == (-1.0f)) goto L37;
        this.f3922j0 = 1.0f - r8;
        this.f3918h0 = -1;
        this.f3920i0 = -1;
        goto L60
    L37:
        if (r6 == (-1)) goto L39;
        this.f3920i0 = r6;
        this.f3918h0 = -1;
        this.f3922j0 = -1.0f;
        goto L60
    L39:
        if (r7 == (-1)) goto L60;
        this.f3918h0 = r7;
        this.f3920i0 = -1;
        this.f3922j0 = -1.0f;
    L60:
        if (this.f3931r == (-1)) goto L62;
        return;
    L62:
        if (this.f3932s == (-1)) goto L64;
        return;
    L64:
        if (this.f3930q == (-1)) goto L66;
        return;
    L66:
        if (this.f3929p != (-1)) goto L95;
        int r108 = this.f3913f;
        if (r108 == (-1)) goto L73;
        this.f3908c0 = r108;
        if (((ViewGroup.MarginLayoutParams) this).rightMargin > 0) goto L79;
        if (r1 <= 0) goto L79;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = r1;
    L79:
        int r109 = this.f3909d;
        if (r109 == (-1)) goto L85;
        this.f3904a0 = r109;
        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0) goto L96;
        if (r02 <= 0) goto L97;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = r02;
        return;
    L97:
        return;
    L96:
        return;
    L85:
        int r1010 = this.f3911e;
        if (r1010 == (-1)) goto L99;
        this.f3906b0 = r1010;
        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0) goto L100;
        if (r02 <= 0) goto L101;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = r02;
        return;
    L101:
        return;
    L100:
        return;
    L99:
        return;
    L73:
        int r1011 = this.f3915g;
        if (r1011 == (-1)) goto L79;
        this.f3910d0 = r1011;
        if (((ViewGroup.MarginLayoutParams) this).rightMargin > 0) goto L79;
        if (r1 <= 0) goto L79;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = r1;
        goto L79
    L95:
        return;
    L12:
        int r1012 = this.f3930q;
        if (r1012 == (-1)) goto L15;
        this.f3910d0 = r1012;
        goto L11
    L41:
        int r1013 = this.f3929p;
        if (r1013 == (-1)) goto L44;
        this.f3906b0 = r1013;
    L44:
        int r1014 = this.f3930q;
        if (r1014 == (-1)) goto L47;
        this.f3904a0 = r1014;
    L47:
        int r1015 = this.f3931r;
        if (r1015 == (-1)) goto L50;
        this.f3908c0 = r1015;
    L50:
        int r1016 = this.f3932s;
        if (r1016 == (-1)) goto L53;
        this.f3910d0 = r1016;
    L53:
        int r1017 = this.f3937x;
        if (r1017 == (-1)) goto L56;
        this.f3912e0 = r1017;
    L56:
        int r1018 = this.f3938y;
        if (r1018 == (-1)) goto L60;
        this.f3914f0 = r1018;
        goto L60
    L5:
        r102 = false;
        goto L6
    }
}
