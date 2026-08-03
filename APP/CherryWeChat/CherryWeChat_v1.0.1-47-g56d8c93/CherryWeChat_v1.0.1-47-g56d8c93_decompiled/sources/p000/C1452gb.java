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
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f5102W) {
            this.f5107a0 = false;
            if (this.f5091L == 0) {
                this.f5091L = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f5103X) {
            this.f5109b0 = false;
            if (this.f5092M == 0) {
                this.f5092M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f5107a0 = false;
            if (i == 0 && this.f5091L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f5102W = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f5109b0 = false;
            if (i2 == 0 && this.f5092M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f5103X = true;
            }
        }
        if (this.f5110c == -1.0f && this.f5106a == -1 && this.f5108b == -1) {
            return;
        }
        this.f5113d0 = true;
        this.f5107a0 = true;
        this.f5109b0 = true;
        if (!(this.f5137p0 instanceof C2150kk)) {
            this.f5137p0 = new C2150kk();
        }
        ((C2150kk) this.f5137p0).m4338S(this.f5101V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i7 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z = false;
        boolean z2 = 1 == getLayoutDirection();
        this.f5121h0 = -1;
        this.f5123i0 = -1;
        this.f5117f0 = -1;
        this.f5119g0 = -1;
        this.f5125j0 = this.f5144w;
        this.f5127k0 = this.f5146y;
        float f = this.f5084E;
        this.f5129l0 = f;
        int i8 = this.f5106a;
        this.f5131m0 = i8;
        int i9 = this.f5108b;
        this.f5133n0 = i9;
        float f2 = this.f5110c;
        this.f5135o0 = f2;
        if (z2) {
            int i10 = this.f5140s;
            if (i10 != -1) {
                this.f5121h0 = i10;
            } else {
                int i11 = this.f5141t;
                if (i11 != -1) {
                    this.f5123i0 = i11;
                }
                i2 = this.f5142u;
                if (i2 != -1) {
                    this.f5119g0 = i2;
                    z = true;
                }
                i3 = this.f5143v;
                if (i3 != -1) {
                    this.f5117f0 = i3;
                    z = true;
                }
                i4 = this.f5080A;
                if (i4 != Integer.MIN_VALUE) {
                    this.f5127k0 = i4;
                }
                i5 = this.f5081B;
                if (i5 != Integer.MIN_VALUE) {
                    this.f5125j0 = i5;
                }
                if (z) {
                    this.f5129l0 = 1.0f - f;
                }
                if (this.f5113d0 && this.f5101V == 1 && this.f5112d) {
                    if (f2 == -1.0f) {
                        this.f5135o0 = 1.0f - f2;
                        this.f5131m0 = -1;
                        this.f5133n0 = -1;
                    } else if (i8 != -1) {
                        this.f5133n0 = i8;
                        this.f5131m0 = -1;
                        this.f5135o0 = -1.0f;
                    } else if (i9 != -1) {
                        this.f5131m0 = i9;
                        this.f5133n0 = -1;
                        this.f5135o0 = -1.0f;
                    }
                }
            }
            z = true;
            i2 = this.f5142u;
            if (i2 != -1) {
            }
            i3 = this.f5143v;
            if (i3 != -1) {
            }
            i4 = this.f5080A;
            if (i4 != Integer.MIN_VALUE) {
            }
            i5 = this.f5081B;
            if (i5 != Integer.MIN_VALUE) {
            }
            if (z) {
            }
            if (this.f5113d0) {
                if (f2 == -1.0f) {
                }
            }
        } else {
            int i12 = this.f5140s;
            if (i12 != -1) {
                this.f5119g0 = i12;
            }
            int i13 = this.f5141t;
            if (i13 != -1) {
                this.f5117f0 = i13;
            }
            int i14 = this.f5142u;
            if (i14 != -1) {
                this.f5121h0 = i14;
            }
            int i15 = this.f5143v;
            if (i15 != -1) {
                this.f5123i0 = i15;
            }
            int i16 = this.f5080A;
            if (i16 != Integer.MIN_VALUE) {
                this.f5125j0 = i16;
            }
            int i17 = this.f5081B;
            if (i17 != Integer.MIN_VALUE) {
                this.f5127k0 = i17;
            }
        }
        if (this.f5142u == -1 && this.f5143v == -1 && this.f5141t == -1 && this.f5140s == -1) {
            int i18 = this.f5118g;
            if (i18 != -1) {
                this.f5121h0 = i18;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                }
            } else {
                int i19 = this.f5120h;
                if (i19 != -1) {
                    this.f5123i0 = i19;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i7 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i7;
                    }
                }
            }
            int i20 = this.f5114e;
            if (i20 != -1) {
                this.f5117f0 = i20;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
                return;
            }
            int i21 = this.f5116f;
            if (i21 != -1) {
                this.f5119g0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i6 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i6;
            }
        }
    }
}
