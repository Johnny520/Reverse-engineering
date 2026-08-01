package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: gc */
/* JADX INFO: loaded from: classes.dex */
public final class C0256gc extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A */
    public float f2060A;

    /* JADX INFO: renamed from: B */
    public String f2061B;

    /* JADX INFO: renamed from: C */
    public int f2062C;

    /* JADX INFO: renamed from: D */
    public float f2063D;

    /* JADX INFO: renamed from: E */
    public float f2064E;

    /* JADX INFO: renamed from: F */
    public int f2065F;

    /* JADX INFO: renamed from: G */
    public int f2066G;

    /* JADX INFO: renamed from: H */
    public int f2067H;

    /* JADX INFO: renamed from: I */
    public int f2068I;

    /* JADX INFO: renamed from: J */
    public int f2069J;

    /* JADX INFO: renamed from: K */
    public int f2070K;

    /* JADX INFO: renamed from: L */
    public int f2071L;

    /* JADX INFO: renamed from: M */
    public int f2072M;

    /* JADX INFO: renamed from: N */
    public float f2073N;

    /* JADX INFO: renamed from: O */
    public float f2074O;

    /* JADX INFO: renamed from: P */
    public int f2075P;

    /* JADX INFO: renamed from: Q */
    public int f2076Q;

    /* JADX INFO: renamed from: R */
    public int f2077R;

    /* JADX INFO: renamed from: S */
    public boolean f2078S;

    /* JADX INFO: renamed from: T */
    public boolean f2079T;

    /* JADX INFO: renamed from: U */
    public String f2080U;

    /* JADX INFO: renamed from: V */
    public boolean f2081V;

    /* JADX INFO: renamed from: W */
    public boolean f2082W;

    /* JADX INFO: renamed from: X */
    public boolean f2083X;

    /* JADX INFO: renamed from: Y */
    public boolean f2084Y;

    /* JADX INFO: renamed from: Z */
    public boolean f2085Z;

    /* JADX INFO: renamed from: a */
    public int f2086a;

    /* JADX INFO: renamed from: a0 */
    public int f2087a0;

    /* JADX INFO: renamed from: b */
    public int f2088b;

    /* JADX INFO: renamed from: b0 */
    public int f2089b0;

    /* JADX INFO: renamed from: c */
    public float f2090c;

    /* JADX INFO: renamed from: c0 */
    public int f2091c0;

    /* JADX INFO: renamed from: d */
    public int f2092d;

    /* JADX INFO: renamed from: d0 */
    public int f2093d0;

    /* JADX INFO: renamed from: e */
    public int f2094e;

    /* JADX INFO: renamed from: e0 */
    public int f2095e0;

    /* JADX INFO: renamed from: f */
    public int f2096f;

    /* JADX INFO: renamed from: f0 */
    public int f2097f0;

    /* JADX INFO: renamed from: g */
    public int f2098g;

    /* JADX INFO: renamed from: g0 */
    public float f2099g0;

    /* JADX INFO: renamed from: h */
    public int f2100h;

    /* JADX INFO: renamed from: h0 */
    public int f2101h0;

    /* JADX INFO: renamed from: i */
    public int f2102i;

    /* JADX INFO: renamed from: i0 */
    public int f2103i0;

    /* JADX INFO: renamed from: j */
    public int f2104j;

    /* JADX INFO: renamed from: j0 */
    public float f2105j0;

    /* JADX INFO: renamed from: k */
    public int f2106k;

    /* JADX INFO: renamed from: k0 */
    public C0592pc f2107k0;

    /* JADX INFO: renamed from: l */
    public int f2108l;

    /* JADX INFO: renamed from: m */
    public int f2109m;

    /* JADX INFO: renamed from: n */
    public int f2110n;

    /* JADX INFO: renamed from: o */
    public float f2111o;

    /* JADX INFO: renamed from: p */
    public int f2112p;

    /* JADX INFO: renamed from: q */
    public int f2113q;

    /* JADX INFO: renamed from: r */
    public int f2114r;

    /* JADX INFO: renamed from: s */
    public int f2115s;

    /* JADX INFO: renamed from: t */
    public int f2116t;

    /* JADX INFO: renamed from: u */
    public int f2117u;

    /* JADX INFO: renamed from: v */
    public int f2118v;

    /* JADX INFO: renamed from: w */
    public int f2119w;

    /* JADX INFO: renamed from: x */
    public int f2120x;

    /* JADX INFO: renamed from: y */
    public int f2121y;

    /* JADX INFO: renamed from: z */
    public float f2122z;

    /* JADX INFO: renamed from: a */
    public final void m1268a() {
        this.f2084Y = false;
        this.f2081V = true;
        this.f2082W = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f2078S) {
            this.f2081V = false;
            if (this.f2067H == 0) {
                this.f2067H = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f2079T) {
            this.f2082W = false;
            if (this.f2068I == 0) {
                this.f2068I = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f2081V = false;
            if (i == 0 && this.f2067H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f2078S = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f2082W = false;
            if (i2 == 0 && this.f2068I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f2079T = true;
            }
        }
        if (this.f2090c == -1.0f && this.f2086a == -1 && this.f2088b == -1) {
            return;
        }
        this.f2084Y = true;
        this.f2081V = true;
        this.f2082W = true;
        if (!(this.f2107k0 instanceof C0268go)) {
            this.f2107k0 = new C0268go();
        }
        ((C0268go) this.f2107k0).m1293B(this.f2077R);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007c  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resolveLayoutDirection(int r10) {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0256gc.resolveLayoutDirection(int):void");
    }
}
