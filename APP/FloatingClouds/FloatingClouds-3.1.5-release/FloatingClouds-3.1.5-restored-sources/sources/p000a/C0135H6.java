package p000a;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.Arrays;
import p000a.C0240N3;
import p000a.C0548e2;

/* JADX INFO: renamed from: a.H6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0135H6 extends C0450Yg {

    /* JADX INFO: renamed from: O0 */
    public C0240N3[] f456O0;

    /* JADX INFO: renamed from: r0 */
    public int f458r0 = -1;

    /* JADX INFO: renamed from: s0 */
    public int f459s0 = -1;

    /* JADX INFO: renamed from: t0 */
    public int f460t0 = -1;

    /* JADX INFO: renamed from: u0 */
    public int f461u0 = -1;

    /* JADX INFO: renamed from: v0 */
    public int f462v0 = -1;

    /* JADX INFO: renamed from: w0 */
    public int f463w0 = -1;

    /* JADX INFO: renamed from: x0 */
    public float f464x0 = 0.5f;

    /* JADX INFO: renamed from: y0 */
    public float f465y0 = 0.5f;

    /* JADX INFO: renamed from: z0 */
    public float f466z0 = 0.5f;

    /* JADX INFO: renamed from: A0 */
    public float f442A0 = 0.5f;

    /* JADX INFO: renamed from: B0 */
    public float f443B0 = 0.5f;

    /* JADX INFO: renamed from: C0 */
    public float f444C0 = 0.5f;

    /* JADX INFO: renamed from: D0 */
    public int f445D0 = 0;

    /* JADX INFO: renamed from: E0 */
    public int f446E0 = 0;

    /* JADX INFO: renamed from: F0 */
    public int f447F0 = 2;

    /* JADX INFO: renamed from: G0 */
    public int f448G0 = 2;

    /* JADX INFO: renamed from: H0 */
    public int f449H0 = 0;

    /* JADX INFO: renamed from: I0 */
    public int f450I0 = -1;

    /* JADX INFO: renamed from: J0 */
    public int f451J0 = 0;

    /* JADX INFO: renamed from: K0 */
    public final ArrayList<a> f452K0 = new ArrayList<>();

    /* JADX INFO: renamed from: L0 */
    public C0240N3[] f453L0 = null;

    /* JADX INFO: renamed from: M0 */
    public C0240N3[] f454M0 = null;

    /* JADX INFO: renamed from: N0 */
    public int[] f455N0 = null;

    /* JADX INFO: renamed from: P0 */
    public int f457P0 = 0;

    /* JADX INFO: renamed from: a.H6$a */
    public class a {

        /* JADX INFO: renamed from: a */
        public int f467a;

        /* JADX INFO: renamed from: d */
        public C0222M3 f470d;

        /* JADX INFO: renamed from: e */
        public C0222M3 f471e;

        /* JADX INFO: renamed from: f */
        public C0222M3 f472f;

        /* JADX INFO: renamed from: g */
        public C0222M3 f473g;

        /* JADX INFO: renamed from: h */
        public int f474h;

        /* JADX INFO: renamed from: i */
        public int f475i;

        /* JADX INFO: renamed from: j */
        public int f476j;

        /* JADX INFO: renamed from: k */
        public int f477k;

        /* JADX INFO: renamed from: q */
        public int f483q;

        /* JADX INFO: renamed from: b */
        public C0240N3 f468b = null;

        /* JADX INFO: renamed from: c */
        public int f469c = 0;

        /* JADX INFO: renamed from: l */
        public int f478l = 0;

        /* JADX INFO: renamed from: m */
        public int f479m = 0;

        /* JADX INFO: renamed from: n */
        public int f480n = 0;

        /* JADX INFO: renamed from: o */
        public int f481o = 0;

        /* JADX INFO: renamed from: p */
        public int f482p = 0;

        public a(int i, C0222M3 c0222m3, C0222M3 c0222m32, C0222M3 c0222m33, C0222M3 c0222m34, int i2) {
            this.f474h = 0;
            this.f475i = 0;
            this.f476j = 0;
            this.f477k = 0;
            this.f483q = 0;
            this.f467a = i;
            this.f470d = c0222m3;
            this.f471e = c0222m32;
            this.f472f = c0222m33;
            this.f473g = c0222m34;
            this.f474h = C0135H6.this.f1699k0;
            this.f475i = C0135H6.this.f1695g0;
            this.f476j = C0135H6.this.f1700l0;
            this.f477k = C0135H6.this.f1696h0;
            this.f483q = i2;
        }

        /* JADX INFO: renamed from: a */
        public final void m358a(C0240N3 c0240n3) {
            int i = this.f467a;
            C0240N3.a aVar = C0240N3.a.f841c;
            C0135H6 c0135h6 = C0135H6.this;
            if (i == 0) {
                int iM356F = c0135h6.m356F(c0240n3, this.f483q);
                if (c0240n3.f792J[0] == aVar) {
                    this.f482p++;
                    iM356F = 0;
                }
                this.f478l = iM356F + (c0240n3.f806X != 8 ? c0135h6.f445D0 : 0) + this.f478l;
                int iM355E = c0135h6.m355E(c0240n3, this.f483q);
                if (this.f468b == null || this.f469c < iM355E) {
                    this.f468b = c0240n3;
                    this.f469c = iM355E;
                    this.f479m = iM355E;
                }
            } else {
                int iM356F2 = c0135h6.m356F(c0240n3, this.f483q);
                int iM355E2 = c0135h6.m355E(c0240n3, this.f483q);
                if (c0240n3.f792J[1] == aVar) {
                    this.f482p++;
                    iM355E2 = 0;
                }
                this.f479m = iM355E2 + (c0240n3.f806X != 8 ? c0135h6.f446E0 : 0) + this.f479m;
                if (this.f468b == null || this.f469c < iM356F2) {
                    this.f468b = c0240n3;
                    this.f469c = iM356F2;
                    this.f478l = iM356F2;
                }
            }
            this.f481o++;
        }

        /* JADX INFO: renamed from: b */
        public final void m359b(int i, boolean z, boolean z2) {
            C0135H6 c0135h6;
            int i2;
            C0240N3 c0240n3;
            char c;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7 = this.f481o;
            int i8 = 0;
            while (true) {
                c0135h6 = C0135H6.this;
                if (i8 >= i7 || (i6 = this.f480n + i8) >= c0135h6.f457P0) {
                    break;
                }
                C0240N3 c0240n32 = c0135h6.f456O0[i6];
                if (c0240n32 != null) {
                    c0240n32.m656t();
                }
                i8++;
            }
            if (i7 == 0 || this.f468b == null) {
                return;
            }
            boolean z3 = z2 && i == 0;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < i7; i11++) {
                int i12 = this.f480n + (z ? (i7 - 1) - i11 : i11);
                if (i12 >= c0135h6.f457P0) {
                    break;
                }
                if (c0135h6.f456O0[i12].f806X == 0) {
                    if (i9 == -1) {
                        i9 = i11;
                    }
                    i10 = i11;
                }
            }
            if (this.f467a != 0) {
                C0240N3 c0240n33 = this.f468b;
                c0240n33.f808Z = c0135h6.f458r0;
                int i13 = this.f474h;
                if (i > 0) {
                    i13 += c0135h6.f445D0;
                }
                C0222M3 c0222m3 = c0240n33.f837y;
                C0222M3 c0222m32 = c0240n33.f783A;
                if (z) {
                    c0222m32.m598a(this.f472f, i13);
                    if (z2) {
                        c0222m3.m598a(this.f470d, this.f476j);
                    }
                    if (i > 0) {
                        this.f472f.f745b.f837y.m598a(c0222m32, 0);
                    }
                } else {
                    c0222m3.m598a(this.f470d, i13);
                    if (z2) {
                        c0222m32.m598a(this.f472f, this.f476j);
                    }
                    if (i > 0) {
                        this.f470d.f745b.f783A.m598a(c0222m3, 0);
                    }
                }
                int i14 = 0;
                C0240N3 c0240n34 = null;
                while (i14 < i7) {
                    int i15 = this.f480n + i14;
                    if (i15 >= c0135h6.f457P0) {
                        return;
                    }
                    C0240N3 c0240n35 = c0135h6.f456O0[i15];
                    if (i14 == 0) {
                        c0240n35.m641e(c0240n35.f838z, this.f471e, this.f475i);
                        int i16 = c0135h6.f459s0;
                        float f = c0135h6.f465y0;
                        if (this.f480n == 0) {
                            int i17 = c0135h6.f461u0;
                            i2 = -1;
                            if (i17 != -1) {
                                f = c0135h6.f442A0;
                            }
                            i16 = i17;
                            c0240n35.f810a0 = i16;
                            c0240n35.f804V = f;
                        } else {
                            i2 = -1;
                        }
                        if (z2 && (i17 = c0135h6.f463w0) != i2) {
                            f = c0135h6.f444C0;
                            i16 = i17;
                        }
                        c0240n35.f810a0 = i16;
                        c0240n35.f804V = f;
                    }
                    if (i14 == i7 - 1) {
                        c0240n35.m641e(c0240n35.f784B, this.f473g, this.f477k);
                    }
                    if (c0240n34 != null) {
                        C0222M3 c0222m33 = c0240n35.f838z;
                        int i18 = c0135h6.f446E0;
                        C0222M3 c0222m34 = c0240n34.f784B;
                        c0222m33.m598a(c0222m34, i18);
                        C0222M3 c0222m35 = c0240n35.f838z;
                        if (i14 == i9) {
                            int i19 = this.f475i;
                            if (c0222m35.m603f()) {
                                c0222m35.f749f = i19;
                            }
                        }
                        c0222m34.m598a(c0222m35, 0);
                        if (i14 == i10 + 1) {
                            int i20 = this.f477k;
                            if (c0222m34.m603f()) {
                                c0222m34.f749f = i20;
                            }
                        }
                    }
                    if (c0240n35 != c0240n33) {
                        if (z) {
                            int i21 = c0135h6.f447F0;
                            if (i21 == 0) {
                                c0240n35.f783A.m598a(c0222m32, 0);
                            } else if (i21 == 1) {
                                c0240n35.f837y.m598a(c0222m3, 0);
                            } else if (i21 == 2) {
                                c0240n35.f837y.m598a(c0222m3, 0);
                                c0240n35.f783A.m598a(c0222m32, 0);
                            }
                        } else {
                            int i22 = c0135h6.f447F0;
                            if (i22 == 0) {
                                c0240n35.f837y.m598a(c0222m3, 0);
                            } else if (i22 == 1) {
                                c0240n35.f783A.m598a(c0222m32, 0);
                            } else if (i22 == 2) {
                                if (z3) {
                                    c0240n35.f837y.m598a(this.f470d, this.f474h);
                                    c0240n35.f783A.m598a(this.f472f, this.f476j);
                                } else {
                                    c0240n35.f837y.m598a(c0222m3, 0);
                                    c0240n35.f783A.m598a(c0222m32, 0);
                                }
                            }
                        }
                    }
                    i14++;
                    c0240n34 = c0240n35;
                }
                return;
            }
            C0240N3 c0240n36 = this.f468b;
            c0240n36.f810a0 = c0135h6.f459s0;
            int i23 = this.f475i;
            if (i > 0) {
                i23 += c0135h6.f446E0;
            }
            C0222M3 c0222m36 = this.f471e;
            C0222M3 c0222m37 = c0240n36.f838z;
            c0222m37.m598a(c0222m36, i23);
            C0222M3 c0222m38 = c0240n36.f784B;
            if (z2) {
                c0222m38.m598a(this.f473g, this.f477k);
            }
            if (i > 0) {
                this.f471e.f745b.f784B.m598a(c0222m37, 0);
            }
            if (c0135h6.f448G0 != 3 || c0240n36.f835w) {
                c0240n3 = c0240n36;
            } else {
                for (int i24 = 0; i24 < i7; i24++) {
                    int i25 = this.f480n + (z ? (i7 - 1) - i24 : i24);
                    if (i25 >= c0135h6.f457P0) {
                        break;
                    }
                    c0240n3 = c0135h6.f456O0[i25];
                    if (c0240n3.f835w) {
                        break;
                    }
                }
                c0240n3 = c0240n36;
            }
            int i26 = 0;
            C0240N3 c0240n37 = null;
            while (i26 < i7) {
                int i27 = z ? (i7 - 1) - i26 : i26;
                int i28 = this.f480n + i27;
                if (i28 >= c0135h6.f457P0) {
                    return;
                }
                C0240N3 c0240n38 = c0135h6.f456O0[i28];
                if (i26 == 0) {
                    c0240n38.m641e(c0240n38.f837y, this.f470d, this.f474h);
                }
                if (i27 == 0) {
                    int i29 = c0135h6.f458r0;
                    float f2 = c0135h6.f464x0;
                    if (this.f480n == 0) {
                        int i30 = c0135h6.f460t0;
                        i3 = i29;
                        i4 = -1;
                        if (i30 != -1) {
                            f2 = c0135h6.f466z0;
                        }
                        i5 = i30;
                        c0240n38.f808Z = i5;
                        c0240n38.f803U = f2;
                    } else {
                        i3 = i29;
                        i4 = -1;
                    }
                    if (!z2 || (i30 = c0135h6.f462v0) == i4) {
                        i5 = i3;
                        c0240n38.f808Z = i5;
                        c0240n38.f803U = f2;
                    } else {
                        f2 = c0135h6.f443B0;
                        i5 = i30;
                        c0240n38.f808Z = i5;
                        c0240n38.f803U = f2;
                    }
                }
                if (i26 == i7 - 1) {
                    c0240n38.m641e(c0240n38.f783A, this.f472f, this.f476j);
                }
                if (c0240n37 != null) {
                    C0222M3 c0222m39 = c0240n38.f837y;
                    int i31 = c0135h6.f445D0;
                    C0222M3 c0222m310 = c0240n37.f783A;
                    c0222m39.m598a(c0222m310, i31);
                    C0222M3 c0222m311 = c0240n38.f837y;
                    if (i26 == i9) {
                        int i32 = this.f474h;
                        if (c0222m311.m603f()) {
                            c0222m311.f749f = i32;
                        }
                    }
                    c0222m310.m598a(c0222m311, 0);
                    if (i26 == i10 + 1) {
                        int i33 = this.f476j;
                        if (c0222m310.m603f()) {
                            c0222m310.f749f = i33;
                        }
                    }
                }
                if (c0240n38 != c0240n36) {
                    int i34 = c0135h6.f448G0;
                    c = 3;
                    if (i34 == 3 && c0240n3.f835w && c0240n38 != c0240n3 && c0240n38.f835w) {
                        c0240n38.f785C.m598a(c0240n3.f785C, 0);
                    } else if (i34 == 0) {
                        c0240n38.f838z.m598a(c0222m37, 0);
                    } else if (i34 == 1) {
                        c0240n38.f784B.m598a(c0222m38, 0);
                    } else if (z3) {
                        c0240n38.f838z.m598a(this.f471e, this.f475i);
                        c0240n38.f784B.m598a(this.f473g, this.f477k);
                    } else {
                        c0240n38.f838z.m598a(c0222m37, 0);
                        c0240n38.f784B.m598a(c0222m38, 0);
                    }
                } else {
                    c = 3;
                }
                i26++;
                c0240n37 = c0240n38;
            }
        }

        /* JADX INFO: renamed from: c */
        public final int m360c() {
            return this.f467a == 1 ? this.f479m - C0135H6.this.f446E0 : this.f479m;
        }

        /* JADX INFO: renamed from: d */
        public final int m361d() {
            return this.f467a == 0 ? this.f478l - C0135H6.this.f445D0 : this.f478l;
        }

        /* JADX INFO: renamed from: e */
        public final void m362e(int i) {
            int i2 = this.f482p;
            if (i2 == 0) {
                return;
            }
            int i3 = this.f481o;
            int i4 = i / i2;
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = this.f480n;
                int i7 = i6 + i5;
                C0135H6 c0135h6 = C0135H6.this;
                if (i7 >= c0135h6.f457P0) {
                    break;
                }
                C0240N3 c0240n3 = c0135h6.f456O0[i6 + i5];
                int i8 = this.f467a;
                C0240N3.a aVar = C0240N3.a.f839a;
                C0240N3.a aVar2 = C0240N3.a.f841c;
                if (i8 == 0) {
                    if (c0240n3 != null) {
                        C0240N3.a[] aVarArr = c0240n3.f792J;
                        if (aVarArr[0] == aVar2 && c0240n3.f822j == 0) {
                            c0135h6.m1113D(c0240n3, aVar, i4, aVarArr[1], c0240n3.m645i());
                        }
                    }
                } else if (c0240n3 != null) {
                    C0240N3.a[] aVarArr2 = c0240n3.f792J;
                    if (aVarArr2[1] == aVar2 && c0240n3.f823k == 0) {
                        int i9 = i4;
                        c0135h6.m1113D(c0240n3, aVarArr2[0], c0240n3.m648l(), aVar, i9);
                        i4 = i9;
                    }
                }
            }
            this.f478l = 0;
            this.f479m = 0;
            this.f468b = null;
            this.f469c = 0;
            int i10 = this.f481o;
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = this.f480n + i11;
                C0135H6 c0135h62 = C0135H6.this;
                if (i12 >= c0135h62.f457P0) {
                    return;
                }
                C0240N3 c0240n32 = c0135h62.f456O0[i12];
                if (this.f467a == 0) {
                    int iM648l = c0240n32.m648l();
                    int i13 = c0135h62.f445D0;
                    if (c0240n32.f806X == 8) {
                        i13 = 0;
                    }
                    this.f478l = iM648l + i13 + this.f478l;
                    int iM355E = c0135h62.m355E(c0240n32, this.f483q);
                    if (this.f468b == null || this.f469c < iM355E) {
                        this.f468b = c0240n32;
                        this.f469c = iM355E;
                        this.f479m = iM355E;
                    }
                } else {
                    int iM356F = c0135h62.m356F(c0240n32, this.f483q);
                    int iM355E2 = c0135h62.m355E(c0240n32, this.f483q);
                    int i14 = c0135h62.f446E0;
                    if (c0240n32.f806X == 8) {
                        i14 = 0;
                    }
                    this.f479m = iM355E2 + i14 + this.f479m;
                    if (this.f468b == null || this.f469c < iM356F) {
                        this.f468b = c0240n32;
                        this.f469c = iM356F;
                        this.f478l = iM356F;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m363f(int i, C0222M3 c0222m3, C0222M3 c0222m32, C0222M3 c0222m33, C0222M3 c0222m34, int i2, int i3, int i4, int i5, int i6) {
            this.f467a = i;
            this.f470d = c0222m3;
            this.f471e = c0222m32;
            this.f472f = c0222m33;
            this.f473g = c0222m34;
            this.f474h = i2;
            this.f475i = i3;
            this.f476j = i4;
            this.f477k = i5;
            this.f483q = i6;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v5, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r14v6, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r14v7, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:310:0x053a  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x053e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0550  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x056f  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0572  */
    @Override // p000a.C0450Yg
    /* JADX INFO: renamed from: C */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo354C(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        C0240N3[] c0240n3Arr;
        int i7;
        int i8;
        int[] iArr;
        int i9;
        int i10;
        a aVar;
        char c;
        int i11;
        int i12;
        int i13;
        int i14;
        C0240N3 c0240n3;
        int i15;
        int i16;
        int i17;
        int iCeil;
        int iCeil2;
        boolean z;
        int i18;
        Object obj;
        C0240N3 c0240n32;
        int i19;
        int i20;
        int i21 = this.f2135f0;
        C0240N3.a aVar2 = C0240N3.a.f840b;
        C0240N3.a aVar3 = C0240N3.a.f841c;
        if (i21 > 0) {
            C0240N3 c0240n33 = this.f793K;
            C0548e2.b bVar = c0240n33 != null ? ((C0258O3) c0240n33).f929h0 : null;
            if (bVar == null) {
                this.f1702n0 = 0;
                this.f1703o0 = 0;
                this.f1701m0 = false;
                return;
            }
            for (int i22 = 0; i22 < this.f2135f0; i22++) {
                C0240N3 c0240n34 = this.f2134e0[i22];
                if (c0240n34 != null && !(c0240n34 instanceof C0478a8)) {
                    C0240N3.a aVarM644h = c0240n34.m644h(0);
                    C0240N3.a aVarM644h2 = c0240n34.m644h(1);
                    if (aVarM644h != aVar3 || c0240n34.f822j == 1 || aVarM644h2 != aVar3 || c0240n34.f823k == 1) {
                        if (aVarM644h == aVar3) {
                            aVarM644h = aVar2;
                        }
                        if (aVarM644h2 == aVar3) {
                            aVarM644h2 = aVar2;
                        }
                        C0548e2.a aVar4 = this.f1704p0;
                        aVar4.f2025a = aVarM644h;
                        aVar4.f2026b = aVarM644h2;
                        aVar4.f2027c = c0240n34.m648l();
                        aVar4.f2028d = c0240n34.m645i();
                        ((ConstraintLayout.C1045b) bVar).m2414a(c0240n34, aVar4);
                        c0240n34.m661y(aVar4.f2029e);
                        c0240n34.m658v(aVar4.f2030f);
                        int i23 = aVar4.f2031g;
                        c0240n34.f800R = i23;
                        c0240n34.f835w = i23 > 0;
                    }
                }
            }
        }
        int i24 = this.f1699k0;
        int i25 = this.f1700l0;
        int i26 = this.f1695g0;
        int i27 = this.f1696h0;
        int[] iArr2 = new int[2];
        int i28 = (i2 - i24) - i25;
        int i29 = this.f451J0;
        if (i29 == 1) {
            i28 = (i4 - i26) - i27;
        }
        int i30 = i28;
        if (i29 == 0) {
            if (this.f458r0 == -1) {
                this.f458r0 = 0;
            }
            if (this.f459s0 == -1) {
                this.f459s0 = 0;
            }
        } else {
            if (this.f458r0 == -1) {
                this.f458r0 = 0;
            }
            if (this.f459s0 == -1) {
                this.f459s0 = 0;
            }
        }
        C0240N3[] c0240n3Arr2 = this.f2134e0;
        int i31 = 0;
        int i32 = 0;
        int i33 = 0;
        while (true) {
            i5 = this.f2135f0;
            if (i31 >= i5) {
                break;
            }
            if (this.f2134e0[i31].f806X == 8) {
                i32++;
            }
            i31++;
        }
        if (i32 > 0) {
            C0240N3[] c0240n3Arr3 = new C0240N3[i5 - i32];
            int i34 = 0;
            int i35 = 0;
            while (i34 < this.f2135f0) {
                C0240N3 c0240n35 = this.f2134e0[i34];
                int i36 = i24;
                C0240N3[] c0240n3Arr4 = c0240n3Arr3;
                if (c0240n35.f806X != 8) {
                    c0240n3Arr4[i35] = c0240n35;
                    i35++;
                }
                i34++;
                i24 = i36;
                c0240n3Arr3 = c0240n3Arr4;
            }
            i6 = i35;
            c0240n3Arr = c0240n3Arr3;
        } else {
            i6 = i5;
            c0240n3Arr = c0240n3Arr2;
        }
        int i37 = i24;
        this.f456O0 = c0240n3Arr;
        this.f457P0 = i6;
        int i38 = this.f449H0;
        ArrayList<a> arrayList = this.f452K0;
        if (i38 == 0) {
            i7 = i26;
            i8 = i27;
            iArr = iArr2;
            C0240N3[] c0240n3Arr5 = c0240n3Arr;
            i9 = i37;
            i10 = i25;
            int i39 = this.f451J0;
            if (i6 != 0) {
                if (arrayList.size() == 0) {
                    aVar = new a(i39, this.f837y, this.f838z, this.f783A, this.f784B, i30);
                    arrayList.add(aVar);
                } else {
                    a aVar5 = arrayList.get(0);
                    aVar5.f469c = 0;
                    aVar5.f468b = null;
                    aVar5.f478l = 0;
                    aVar5.f479m = 0;
                    aVar5.f480n = 0;
                    aVar5.f481o = 0;
                    aVar5.f482p = 0;
                    aVar5.m363f(i39, this.f837y, this.f838z, this.f783A, this.f784B, this.f1699k0, this.f1695g0, this.f1700l0, this.f1696h0, i30);
                    aVar = aVar5;
                }
                for (int i40 = 0; i40 < i6; i40++) {
                    aVar.m358a(c0240n3Arr5[i40]);
                }
                i33 = 0;
                iArr[0] = aVar.m361d();
                c = 1;
                iArr[1] = aVar.m360c();
            }
            int iMin = iArr[i33] + i9 + i10;
            int iMin2 = iArr[c] + i7 + i8;
            if (i != 1073741824) {
                i11 = i3;
                iMin = i2;
            } else if (i == Integer.MIN_VALUE) {
                iMin = Math.min(iMin, i2);
                i11 = i3;
            } else {
                i11 = i3;
                if (i != 0) {
                    iMin = i33;
                }
            }
            if (i11 != 1073741824) {
                iMin2 = i4;
            } else if (i11 == Integer.MIN_VALUE) {
                iMin2 = Math.min(iMin2, i4);
            } else if (i11 != 0) {
                iMin2 = i33;
            }
            this.f1702n0 = iMin;
            this.f1703o0 = iMin2;
            m661y(iMin);
            m658v(iMin2);
            this.f1701m0 = this.f2135f0 <= 0 ? c : i33;
        }
        if (i38 == 1) {
            int i41 = this.f451J0;
            if (i6 == 0) {
                i8 = i27;
                iArr = iArr2;
                i7 = i26;
                i10 = i25;
            } else {
                arrayList.clear();
                iArr = iArr2;
                C0240N3[] c0240n3Arr6 = c0240n3Arr;
                i7 = i26;
                i8 = i27;
                i10 = i25;
                i9 = i37;
                a aVar6 = new a(i41, this.f837y, this.f838z, this.f783A, this.f784B, i30);
                arrayList.add(aVar6);
                if (i41 == 0) {
                    int i42 = 0;
                    i12 = 0;
                    int i43 = 0;
                    while (i42 < i6) {
                        C0240N3 c0240n36 = c0240n3Arr6[i42];
                        int iM356F = m356F(c0240n36, i30);
                        int i44 = i41;
                        if (c0240n36.f792J[0] == aVar3) {
                            i12++;
                        }
                        int i45 = i12;
                        boolean z2 = (i43 == i30 || (this.f445D0 + i43) + iM356F > i30) && aVar6.f468b != null;
                        if (!z2 && i42 > 0 && (i15 = this.f450I0) > 0 && i42 % i15 == 0) {
                            z2 = true;
                        }
                        if (z2) {
                            i14 = i42;
                            i41 = i44;
                            c0240n3 = c0240n36;
                            aVar6 = new a(i41, this.f837y, this.f838z, this.f783A, this.f784B, i30);
                            aVar6.f480n = i14;
                            arrayList.add(aVar6);
                        } else {
                            i14 = i42;
                            c0240n3 = c0240n36;
                            i41 = i44;
                            if (i14 > 0) {
                                i43 = this.f445D0 + iM356F + i43;
                            }
                            aVar6.m358a(c0240n3);
                            i42 = i14 + 1;
                            i12 = i45;
                        }
                        i43 = iM356F;
                        aVar6.m358a(c0240n3);
                        i42 = i14 + 1;
                        i12 = i45;
                    }
                } else {
                    int i46 = 0;
                    int i47 = 0;
                    int i48 = 0;
                    while (i48 < i6) {
                        C0240N3 c0240n37 = c0240n3Arr6[i48];
                        int iM355E = m355E(c0240n37, i30);
                        if (c0240n37.f792J[1] == aVar3) {
                            i46++;
                        }
                        int i49 = i46;
                        boolean z3 = (i47 == i30 || (this.f446E0 + i47) + iM355E > i30) && aVar6.f468b != null;
                        if (!z3 && i48 > 0 && (i13 = this.f450I0) > 0 && i48 % i13 == 0) {
                            z3 = true;
                        }
                        if (z3) {
                            aVar6 = new a(i41, this.f837y, this.f838z, this.f783A, this.f784B, i30);
                            aVar6.f480n = i48;
                            arrayList.add(aVar6);
                        } else {
                            if (i48 > 0) {
                                i47 = this.f446E0 + iM355E + i47;
                            }
                            aVar6.m358a(c0240n37);
                            i48++;
                            i46 = i49;
                        }
                        i47 = iM355E;
                        aVar6.m358a(c0240n37);
                        i48++;
                        i46 = i49;
                    }
                    i12 = i46;
                }
                int size = arrayList.size();
                int i50 = this.f1699k0;
                int i51 = this.f1695g0;
                int i52 = this.f1700l0;
                int i53 = this.f1696h0;
                C0240N3.a[] aVarArr = this.f792J;
                boolean z4 = aVarArr[0] == aVar2 || aVarArr[1] == aVar2;
                if (i12 > 0 && z4) {
                    for (int i54 = 0; i54 < size; i54++) {
                        a aVar7 = arrayList.get(i54);
                        if (i41 == 0) {
                            aVar7.m362e(i30 - aVar7.m361d());
                        } else {
                            aVar7.m362e(i30 - aVar7.m360c());
                        }
                    }
                }
                C0222M3 c0222m3 = this.f784B;
                C0222M3 c0222m32 = this.f783A;
                int i55 = i50;
                C0222M3 c0222m33 = c0222m3;
                int i56 = i51;
                int i57 = i52;
                int i58 = i53;
                C0222M3 c0222m34 = c0222m32;
                C0222M3 c0222m35 = this.f837y;
                C0222M3 c0222m36 = this.f838z;
                int iMax = 0;
                int i59 = 0;
                for (int i60 = 0; i60 < size; i60++) {
                    a aVar8 = arrayList.get(i60);
                    if (i41 == 0) {
                        if (i60 < size - 1) {
                            c0222m33 = arrayList.get(i60 + 1).f468b.f838z;
                            i58 = 0;
                        } else {
                            c0222m33 = c0222m3;
                            i58 = this.f1696h0;
                        }
                        C0222M3 c0222m37 = aVar8.f468b.f784B;
                        aVar8.m363f(i41, c0222m35, c0222m36, c0222m34, c0222m33, i55, i56, i57, i58, i30);
                        iMax = Math.max(iMax, aVar8.m361d());
                        int iM360c = aVar8.m360c() + i59;
                        if (i60 > 0) {
                            iM360c += this.f446E0;
                        }
                        i59 = iM360c;
                        c0222m36 = c0222m37;
                        i56 = 0;
                    } else {
                        if (i60 < size - 1) {
                            c0222m34 = arrayList.get(i60 + 1).f468b.f837y;
                            i57 = 0;
                        } else {
                            c0222m34 = c0222m32;
                            i57 = this.f1700l0;
                        }
                        C0222M3 c0222m38 = aVar8.f468b.f783A;
                        aVar8.m363f(i41, c0222m35, c0222m36, c0222m34, c0222m33, i55, i56, i57, i58, i30);
                        int iM361d = aVar8.m361d() + iMax;
                        int iMax2 = Math.max(i59, aVar8.m360c());
                        if (i60 > 0) {
                            iM361d += this.f445D0;
                        }
                        i59 = iMax2;
                        iMax = iM361d;
                        c0222m35 = c0222m38;
                        i55 = 0;
                    }
                }
                iArr[0] = iMax;
                iArr[1] = i59;
            }
        } else if (i38 != 2) {
            i10 = i25;
            i7 = i26;
            i8 = i27;
            iArr = iArr2;
        } else {
            int i61 = this.f451J0;
            if (i61 == 0) {
                int i62 = this.f450I0;
                if (i62 <= 0) {
                    int i63 = 0;
                    int i64 = 0;
                    iCeil2 = 0;
                    while (true) {
                        if (i63 >= i6) {
                            i16 = i30;
                            break;
                        }
                        if (i63 > 0) {
                            i64 += this.f445D0;
                        }
                        C0240N3 c0240n38 = c0240n3Arr[i63];
                        if (c0240n38 == null) {
                            i20 = i63;
                            i16 = i30;
                        } else {
                            i20 = i63;
                            i16 = i30;
                            int iM356F2 = m356F(c0240n38, i16) + i64;
                            if (iM356F2 > i16) {
                                break;
                            }
                            iCeil2++;
                            i64 = iM356F2;
                        }
                        i30 = i16;
                        i63 = i20 + 1;
                    }
                    i17 = i25;
                } else {
                    i16 = i30;
                    i17 = i25;
                    iCeil2 = i62;
                }
                iCeil = 0;
            } else {
                i16 = i30;
                int i65 = this.f450I0;
                if (i65 <= 0) {
                    int i66 = 0;
                    int i67 = 0;
                    iCeil = 0;
                    while (true) {
                        i17 = i25;
                        if (i66 >= i6) {
                            break;
                        }
                        if (i66 > 0) {
                            i67 += this.f446E0;
                        }
                        C0240N3 c0240n39 = c0240n3Arr[i66];
                        if (c0240n39 != null) {
                            int iM355E2 = m355E(c0240n39, i16) + i67;
                            if (iM355E2 > i16) {
                                break;
                            }
                            iCeil++;
                            i67 = iM355E2;
                        }
                        i66++;
                        i25 = i17;
                    }
                } else {
                    i17 = i25;
                    iCeil = i65;
                }
                iCeil2 = 0;
            }
            if (this.f455N0 == null) {
                this.f455N0 = new int[2];
            }
            boolean z5 = (iCeil == 0 && i61 == 1) || (iCeil2 == 0 && i61 == 0);
            while (!z5) {
                if (i61 == 0) {
                    z = z5;
                    i18 = i26;
                    iCeil = (int) Math.ceil(i6 / iCeil2);
                } else {
                    z = z5;
                    i18 = i26;
                    iCeil2 = (int) Math.ceil(i6 / iCeil);
                }
                C0240N3[] c0240n3Arr7 = this.f454M0;
                if (c0240n3Arr7 == null || c0240n3Arr7.length < iCeil2) {
                    obj = null;
                    this.f454M0 = new C0240N3[iCeil2];
                } else {
                    obj = null;
                    Arrays.fill(c0240n3Arr7, (Object) null);
                }
                C0240N3[] c0240n3Arr8 = this.f453L0;
                if (c0240n3Arr8 == null || c0240n3Arr8.length < iCeil) {
                    this.f453L0 = new C0240N3[iCeil];
                } else {
                    Arrays.fill(c0240n3Arr8, obj);
                }
                int i68 = 0;
                while (i68 < iCeil2) {
                    int i69 = 0;
                    while (i69 < iCeil) {
                        int i70 = (i69 * iCeil2) + i68;
                        int i71 = i68;
                        if (i61 == 1) {
                            i70 = (i71 * iCeil) + i69;
                        }
                        if (i70 < c0240n3Arr.length && (c0240n32 = c0240n3Arr[i70]) != null) {
                            int iM356F3 = m356F(c0240n32, i16);
                            i19 = i61;
                            C0240N3 c0240n310 = this.f454M0[i71];
                            if (c0240n310 == null || c0240n310.m648l() < iM356F3) {
                                this.f454M0[i71] = c0240n32;
                            }
                            int iM355E3 = m355E(c0240n32, i16);
                            C0240N3 c0240n311 = this.f453L0[i69];
                            if (c0240n311 == null || c0240n311.m645i() < iM355E3) {
                                this.f453L0[i69] = c0240n32;
                            }
                        } else {
                            i19 = i61;
                        }
                        i69++;
                        i68 = i71;
                        i61 = i19;
                    }
                    i68++;
                }
                int i72 = i61;
                int iM356F4 = 0;
                for (int i73 = 0; i73 < iCeil2; i73++) {
                    C0240N3 c0240n312 = this.f454M0[i73];
                    if (c0240n312 != null) {
                        if (i73 > 0) {
                            iM356F4 += this.f445D0;
                        }
                        iM356F4 = m356F(c0240n312, i16) + iM356F4;
                    }
                }
                int i74 = 0;
                int iM355E4 = 0;
                while (i74 < iCeil) {
                    C0240N3 c0240n313 = this.f453L0[i74];
                    int i75 = i74;
                    if (c0240n313 != null) {
                        if (i74 > 0) {
                            iM355E4 += this.f446E0;
                        }
                        iM355E4 = m355E(c0240n313, i16) + iM355E4;
                    }
                    i74 = i75 + 1;
                }
                iArr2[0] = iM356F4;
                iArr2[1] = iM355E4;
                if (i72 == 0) {
                    if (iM356F4 > i16 && iCeil2 > 1) {
                        iCeil2--;
                        z5 = z;
                    }
                    z5 = true;
                } else {
                    if (iM355E4 > i16 && iCeil > 1) {
                        iCeil--;
                        z5 = z;
                    }
                    z5 = true;
                }
                i26 = i18;
                i61 = i72;
            }
            int[] iArr3 = this.f455N0;
            iArr3[0] = iCeil2;
            iArr3[1] = iCeil;
            i8 = i27;
            iArr = iArr2;
            i7 = i26;
            i10 = i17;
        }
        i9 = i37;
        c = 1;
        int iMin3 = iArr[i33] + i9 + i10;
        int iMin22 = iArr[c] + i7 + i8;
        if (i != 1073741824) {
        }
        if (i11 != 1073741824) {
        }
        this.f1702n0 = iMin3;
        this.f1703o0 = iMin22;
        m661y(iMin3);
        m658v(iMin22);
        this.f1701m0 = this.f2135f0 <= 0 ? c : i33;
    }

    /* JADX INFO: renamed from: E */
    public final int m355E(C0240N3 c0240n3, int i) {
        C0240N3 c0240n32;
        if (c0240n3 == null) {
            return 0;
        }
        C0240N3.a[] aVarArr = c0240n3.f792J;
        if (aVarArr[1] == C0240N3.a.f841c) {
            int i2 = c0240n3.f823k;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0240n3.f830r * i);
                if (i3 != c0240n3.m645i()) {
                    m1113D(c0240n3, aVarArr[0], c0240n3.m648l(), C0240N3.a.f839a, i3);
                }
                return i3;
            }
            c0240n32 = c0240n3;
            if (i2 == 1) {
                return c0240n32.m645i();
            }
            if (i2 == 3) {
                return (int) ((c0240n32.m648l() * c0240n32.f796N) + 0.5f);
            }
        } else {
            c0240n32 = c0240n3;
        }
        return c0240n32.m645i();
    }

    /* JADX INFO: renamed from: F */
    public final int m356F(C0240N3 c0240n3, int i) {
        C0240N3 c0240n32;
        if (c0240n3 == null) {
            return 0;
        }
        C0240N3.a[] aVarArr = c0240n3.f792J;
        if (aVarArr[0] == C0240N3.a.f841c) {
            int i2 = c0240n3.f822j;
            if (i2 == 0) {
                return 0;
            }
            if (i2 == 2) {
                int i3 = (int) (c0240n3.f827o * i);
                if (i3 != c0240n3.m648l()) {
                    m1113D(c0240n3, C0240N3.a.f839a, i3, aVarArr[1], c0240n3.m645i());
                }
                return i3;
            }
            c0240n32 = c0240n3;
            if (i2 == 1) {
                return c0240n32.m648l();
            }
            if (i2 == 3) {
                return (int) ((c0240n32.m645i() * c0240n32.f796N) + 0.5f);
            }
        } else {
            c0240n32 = c0240n3;
        }
        return c0240n32.m648l();
    }

    @Override // p000a.C0240N3
    /* JADX INFO: renamed from: a */
    public final void mo357a(C0029B9 c0029b9) {
        C0240N3 c0240n3;
        super.mo357a(c0029b9);
        C0240N3 c0240n32 = this.f793K;
        boolean z = c0240n32 != null ? ((C0258O3) c0240n32).f930i0 : false;
        int i = this.f449H0;
        ArrayList<a> arrayList = this.f452K0;
        if (i != 0) {
            if (i == 1) {
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    arrayList.get(i2).m359b(i2, z, i2 == size + (-1));
                    i2++;
                }
            } else if (i == 2 && this.f455N0 != null && this.f454M0 != null && this.f453L0 != null) {
                for (int i3 = 0; i3 < this.f457P0; i3++) {
                    this.f456O0[i3].m656t();
                }
                int[] iArr = this.f455N0;
                int i4 = iArr[0];
                int i5 = iArr[1];
                C0240N3 c0240n33 = null;
                for (int i6 = 0; i6 < i4; i6++) {
                    C0240N3 c0240n34 = this.f454M0[z ? (i4 - i6) - 1 : i6];
                    if (c0240n34 != null && c0240n34.f806X != 8) {
                        C0222M3 c0222m3 = c0240n34.f837y;
                        if (i6 == 0) {
                            c0240n34.m641e(c0222m3, this.f837y, this.f1699k0);
                            c0240n34.f808Z = this.f458r0;
                            c0240n34.f803U = this.f464x0;
                        }
                        if (i6 == i4 - 1) {
                            c0240n34.m641e(c0240n34.f783A, this.f783A, this.f1700l0);
                        }
                        if (i6 > 0) {
                            c0240n34.m641e(c0222m3, c0240n33.f783A, this.f445D0);
                            c0240n33.m641e(c0240n33.f783A, c0222m3, 0);
                        }
                        c0240n33 = c0240n34;
                    }
                }
                for (int i7 = 0; i7 < i5; i7++) {
                    C0240N3 c0240n35 = this.f453L0[i7];
                    if (c0240n35 != null && c0240n35.f806X != 8) {
                        C0222M3 c0222m32 = c0240n35.f838z;
                        if (i7 == 0) {
                            c0240n35.m641e(c0222m32, this.f838z, this.f1695g0);
                            c0240n35.f810a0 = this.f459s0;
                            c0240n35.f804V = this.f465y0;
                        }
                        if (i7 == i5 - 1) {
                            c0240n35.m641e(c0240n35.f784B, this.f784B, this.f1696h0);
                        }
                        if (i7 > 0) {
                            c0240n35.m641e(c0222m32, c0240n33.f784B, this.f446E0);
                            c0240n33.m641e(c0240n33.f784B, c0222m32, 0);
                        }
                        c0240n33 = c0240n35;
                    }
                }
                for (int i8 = 0; i8 < i4; i8++) {
                    for (int i9 = 0; i9 < i5; i9++) {
                        int i10 = (i9 * i4) + i8;
                        if (this.f451J0 == 1) {
                            i10 = (i8 * i5) + i9;
                        }
                        C0240N3[] c0240n3Arr = this.f456O0;
                        if (i10 < c0240n3Arr.length && (c0240n3 = c0240n3Arr[i10]) != null && c0240n3.f806X != 8) {
                            C0240N3 c0240n36 = this.f454M0[i8];
                            C0240N3 c0240n37 = this.f453L0[i9];
                            if (c0240n3 != c0240n36) {
                                c0240n3.m641e(c0240n3.f837y, c0240n36.f837y, 0);
                                c0240n3.m641e(c0240n3.f783A, c0240n36.f783A, 0);
                            }
                            if (c0240n3 != c0240n37) {
                                c0240n3.m641e(c0240n3.f838z, c0240n37.f838z, 0);
                                c0240n3.m641e(c0240n3.f784B, c0240n37.f784B, 0);
                            }
                        }
                    }
                }
            }
        } else if (arrayList.size() > 0) {
            arrayList.get(0).m359b(0, z, true);
        }
        this.f1701m0 = false;
    }
}
