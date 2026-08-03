package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: gb */
/* JADX INFO: loaded from: classes.dex */
public final class C1452gb extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A */
    public int f5080A;

    /* JADX INFO: renamed from: B */
    public int f5081B;

    /* JADX INFO: renamed from: C */
    public int f5082C;

    /* JADX INFO: renamed from: D */
    public int f5083D;

    /* JADX INFO: renamed from: E */
    public float f5084E;

    /* JADX INFO: renamed from: F */
    public float f5085F;

    /* JADX INFO: renamed from: G */
    public String f5086G;

    /* JADX INFO: renamed from: H */
    public float f5087H;

    /* JADX INFO: renamed from: I */
    public float f5088I;

    /* JADX INFO: renamed from: J */
    public int f5089J;

    /* JADX INFO: renamed from: K */
    public int f5090K;

    /* JADX INFO: renamed from: L */
    public int f5091L;

    /* JADX INFO: renamed from: M */
    public int f5092M;

    /* JADX INFO: renamed from: N */
    public int f5093N;

    /* JADX INFO: renamed from: O */
    public int f5094O;

    /* JADX INFO: renamed from: P */
    public int f5095P;

    /* JADX INFO: renamed from: Q */
    public int f5096Q;

    /* JADX INFO: renamed from: R */
    public float f5097R;

    /* JADX INFO: renamed from: S */
    public float f5098S;

    /* JADX INFO: renamed from: T */
    public int f5099T;

    /* JADX INFO: renamed from: U */
    public int f5100U;

    /* JADX INFO: renamed from: V */
    public int f5101V;

    /* JADX INFO: renamed from: W */
    public boolean f5102W;

    /* JADX INFO: renamed from: X */
    public boolean f5103X;

    /* JADX INFO: renamed from: Y */
    public String f5104Y;

    /* JADX INFO: renamed from: Z */
    public int f5105Z;

    /* JADX INFO: renamed from: a */
    public int f5106a;

    /* JADX INFO: renamed from: a0 */
    public boolean f5107a0;

    /* JADX INFO: renamed from: b */
    public int f5108b;

    /* JADX INFO: renamed from: b0 */
    public boolean f5109b0;

    /* JADX INFO: renamed from: c */
    public float f5110c;

    /* JADX INFO: renamed from: c0 */
    public boolean f5111c0;

    /* JADX INFO: renamed from: d */
    public boolean f5112d;

    /* JADX INFO: renamed from: d0 */
    public boolean f5113d0;

    /* JADX INFO: renamed from: e */
    public int f5114e;

    /* JADX INFO: renamed from: e0 */
    public boolean f5115e0;

    /* JADX INFO: renamed from: f */
    public int f5116f;

    /* JADX INFO: renamed from: f0 */
    public int f5117f0;

    /* JADX INFO: renamed from: g */
    public int f5118g;

    /* JADX INFO: renamed from: g0 */
    public int f5119g0;

    /* JADX INFO: renamed from: h */
    public int f5120h;

    /* JADX INFO: renamed from: h0 */
    public int f5121h0;

    /* JADX INFO: renamed from: i */
    public int f5122i;

    /* JADX INFO: renamed from: i0 */
    public int f5123i0;

    /* JADX INFO: renamed from: j */
    public int f5124j;

    /* JADX INFO: renamed from: j0 */
    public int f5125j0;

    /* JADX INFO: renamed from: k */
    public int f5126k;

    /* JADX INFO: renamed from: k0 */
    public int f5127k0;

    /* JADX INFO: renamed from: l */
    public int f5128l;

    /* JADX INFO: renamed from: l0 */
    public float f5129l0;

    /* JADX INFO: renamed from: m */
    public int f5130m;

    /* JADX INFO: renamed from: m0 */
    public int f5131m0;

    /* JADX INFO: renamed from: n */
    public int f5132n;

    /* JADX INFO: renamed from: n0 */
    public int f5133n0;

    /* JADX INFO: renamed from: o */
    public int f5134o;

    /* JADX INFO: renamed from: o0 */
    public float f5135o0;

    /* JADX INFO: renamed from: p */
    public int f5136p;

    /* JADX INFO: renamed from: p0 */
    public C2454rb f5137p0;

    /* JADX INFO: renamed from: q */
    public int f5138q;

    /* JADX INFO: renamed from: r */
    public float f5139r;

    /* JADX INFO: renamed from: s */
    public int f5140s;

    /* JADX INFO: renamed from: t */
    public int f5141t;

    /* JADX INFO: renamed from: u */
    public int f5142u;

    /* JADX INFO: renamed from: v */
    public int f5143v;

    /* JADX INFO: renamed from: w */
    public int f5144w;

    /* JADX INFO: renamed from: x */
    public int f5145x;

    /* JADX INFO: renamed from: y */
    public int f5146y;

    /* JADX INFO: renamed from: z */
    public int f5147z;

    /* JADX INFO: renamed from: a */
    public final void m2781a() {
        this.f5113d0 = false;
        this.f5107a0 = true;
        this.f5109b0 = true;
        int r2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (r2 == (-2)) goto L5;
    L9:
        int r4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (r4 != (-2)) goto L17;
        if (this.f5103X == false) goto L17;
        this.f5109b0 = false;
        if (this.f5092M != 0) goto L17;
        this.f5092M = 1;
    L17:
        if (r2 == 0) goto L19;
        if (r2 == (-1)) goto L19;
    L24:
        if (r4 == 0) goto L26;
        if (r4 == (-1)) goto L26;
    L32:
        if (this.f5110c == (-1.0f)) goto L34;
    L39:
        this.f5113d0 = true;
        this.f5107a0 = true;
        this.f5109b0 = true;
        if ((this.f5137p0 instanceof C2150kk) == true) goto L42;
        this.f5137p0 = new C2150kk();
    L42:
        ((C2150kk) this.f5137p0).m4338S(this.f5101V);
        return;
    L34:
        if (this.f5106a != (-1)) goto L39;
        if (this.f5108b != (-1)) goto L39;
        return;
    L26:
        this.f5109b0 = false;
        if (r4 != 0) goto L32;
        if (this.f5092M != 1) goto L32;
        ((ViewGroup.MarginLayoutParams) this).height = -2;
        this.f5103X = true;
    L19:
        this.f5107a0 = false;
        if (r2 != 0) goto L24;
        if (this.f5091L != 1) goto L24;
        ((ViewGroup.MarginLayoutParams) this).width = -2;
        this.f5102W = true;
        goto L24
    L5:
        if (this.f5102W == false) goto L9;
        this.f5107a0 = false;
        if (this.f5091L != 0) goto L9;
        this.f5091L = 1;
        goto L9
    }

    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int r11) {
        int r0 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int r1 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(r11);
        boolean r2 = false;
        if (1 != getLayoutDirection()) goto L5;
        boolean r112 = true;
    L6:
        this.f5121h0 = -1;
        this.f5123i0 = -1;
        this.f5117f0 = -1;
        this.f5119g0 = -1;
        this.f5125j0 = this.f5144w;
        this.f5127k0 = this.f5146y;
        float r5 = this.f5084E;
        this.f5129l0 = r5;
        int r6 = this.f5106a;
        this.f5131m0 = r6;
        int r7 = this.f5108b;
        this.f5133n0 = r7;
        float r8 = this.f5110c;
        this.f5135o0 = r8;
        if (r112 == false) goto L43;
        int r113 = this.f5140s;
        if (r113 == (-1)) goto L12;
        this.f5121h0 = r113;
    L11:
        r2 = true;
    L15:
        int r114 = this.f5142u;
        if (r114 == (-1)) goto L18;
        this.f5119g0 = r114;
        r2 = true;
    L18:
        int r115 = this.f5143v;
        if (r115 == (-1)) goto L21;
        this.f5117f0 = r115;
        r2 = true;
    L21:
        int r116 = this.f5080A;
        if (r116 == Integer.MIN_VALUE) goto L24;
        this.f5127k0 = r116;
    L24:
        int r117 = this.f5081B;
        if (r117 == Integer.MIN_VALUE) goto L28;
        this.f5125j0 = r117;
    L28:
        if (r2 == false) goto L31;
        this.f5129l0 = 1.0f - r5;
    L31:
        if (this.f5113d0 == false) goto L62;
        if (this.f5101V != 1) goto L62;
        if (this.f5112d == false) goto L62;
        if (r8 == (-1.0f)) goto L39;
        this.f5135o0 = 1.0f - r8;
        this.f5131m0 = -1;
        this.f5133n0 = -1;
        goto L62
    L39:
        if (r6 == (-1)) goto L41;
        this.f5133n0 = r6;
        this.f5131m0 = -1;
        this.f5135o0 = -1.0f;
        goto L62
    L41:
        if (r7 == (-1)) goto L62;
        this.f5131m0 = r7;
        this.f5133n0 = -1;
        this.f5135o0 = -1.0f;
    L62:
        if (this.f5142u == (-1)) goto L64;
        return;
    L64:
        if (this.f5143v == (-1)) goto L66;
        return;
    L66:
        if (this.f5141t == (-1)) goto L68;
        return;
    L68:
        if (this.f5140s != (-1)) goto L98;
        int r118 = this.f5118g;
        if (r118 == (-1)) goto L75;
        this.f5121h0 = r118;
        if (((ViewGroup.MarginLayoutParams) this).rightMargin > 0) goto L81;
        if (r1 <= 0) goto L81;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = r1;
    L81:
        int r119 = this.f5114e;
        if (r119 == (-1)) goto L88;
        this.f5117f0 = r119;
        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0) goto L99;
        if (r0 <= 0) goto L100;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = r0;
        return;
    L100:
        return;
    L99:
        return;
    L88:
        int r1110 = this.f5116f;
        if (r1110 == (-1)) goto L101;
        this.f5119g0 = r1110;
        if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0) goto L102;
        if (r0 <= 0) goto L103;
        ((ViewGroup.MarginLayoutParams) this).leftMargin = r0;
        return;
    L103:
        return;
    L102:
        return;
    L101:
        return;
    L75:
        int r1111 = this.f5120h;
        if (r1111 == (-1)) goto L81;
        this.f5123i0 = r1111;
        if (((ViewGroup.MarginLayoutParams) this).rightMargin > 0) goto L81;
        if (r1 <= 0) goto L81;
        ((ViewGroup.MarginLayoutParams) this).rightMargin = r1;
        goto L81
    L98:
        return;
    L12:
        int r1112 = this.f5141t;
        if (r1112 == (-1)) goto L15;
        this.f5123i0 = r1112;
        goto L11
    L43:
        int r1113 = this.f5140s;
        if (r1113 == (-1)) goto L46;
        this.f5119g0 = r1113;
    L46:
        int r1114 = this.f5141t;
        if (r1114 == (-1)) goto L49;
        this.f5117f0 = r1114;
    L49:
        int r1115 = this.f5142u;
        if (r1115 == (-1)) goto L52;
        this.f5121h0 = r1115;
    L52:
        int r1116 = this.f5143v;
        if (r1116 == (-1)) goto L55;
        this.f5123i0 = r1116;
    L55:
        int r1117 = this.f5080A;
        if (r1117 == Integer.MIN_VALUE) goto L58;
        this.f5125j0 = r1117;
    L58:
        int r1118 = this.f5081B;
        if (r1118 == Integer.MIN_VALUE) goto L62;
        this.f5127k0 = r1118;
        goto L62
    L5:
        r112 = false;
        goto L6
    }
}
