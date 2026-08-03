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
        int i2 = ((ViewGroup.MarginLayoutParams) this).width;
        if (i2 == -2 && this.f3895S) {
            this.f3898V = false;
            if (this.f3884H == 0) {
                this.f3884H = 1;
            }
        }
        int i3 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i3 == -2 && this.f3896T) {
            this.f3899W = false;
            if (this.f3885I == 0) {
                this.f3885I = 1;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3898V = false;
            if (i2 == 0 && this.f3884H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3895S = true;
            }
        }
        if (i3 == 0 || i3 == -1) {
            this.f3899W = false;
            if (i3 == 0 && this.f3885I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3896T = true;
            }
        }
        if (this.f3907c == -1.0f && this.f3903a == -1 && this.f3905b == -1) {
            return;
        }
        this.f3901Y = true;
        this.f3898V = true;
        this.f3899W = true;
        if (!(this.f3924k0 instanceof C1003h)) {
            this.f3924k0 = new C1003h();
        }
        ((C1003h) this.f3924k0).m2436B(this.f3894R);
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
    */
    public final void resolveLayoutDirection(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i8 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i2);
        boolean z2 = false;
        boolean z3 = 1 == getLayoutDirection();
        this.f3908c0 = -1;
        this.f3910d0 = -1;
        this.f3904a0 = -1;
        this.f3906b0 = -1;
        this.f3912e0 = this.f3933t;
        this.f3914f0 = this.f3935v;
        float f2 = this.f3939z;
        this.f3916g0 = f2;
        int i9 = this.f3903a;
        this.f3918h0 = i9;
        int i10 = this.f3905b;
        this.f3920i0 = i10;
        float f3 = this.f3907c;
        this.f3922j0 = f3;
        if (z3) {
            int i11 = this.f3929p;
            if (i11 != -1) {
                this.f3908c0 = i11;
            } else {
                int i12 = this.f3930q;
                if (i12 != -1) {
                    this.f3910d0 = i12;
                }
                i3 = this.f3931r;
                if (i3 != -1) {
                    this.f3906b0 = i3;
                    z2 = true;
                }
                i4 = this.f3932s;
                if (i4 != -1) {
                    this.f3904a0 = i4;
                    z2 = true;
                }
                i5 = this.f3937x;
                if (i5 != -1) {
                    this.f3914f0 = i5;
                }
                i6 = this.f3938y;
                if (i6 != -1) {
                    this.f3912e0 = i6;
                }
                if (z2) {
                    this.f3916g0 = 1.0f - f2;
                }
                if (this.f3901Y && this.f3894R == 1) {
                    if (f3 == -1.0f) {
                        this.f3922j0 = 1.0f - f3;
                        this.f3918h0 = -1;
                        this.f3920i0 = -1;
                    } else if (i9 != -1) {
                        this.f3920i0 = i9;
                        this.f3918h0 = -1;
                        this.f3922j0 = -1.0f;
                    } else if (i10 != -1) {
                        this.f3918h0 = i10;
                        this.f3920i0 = -1;
                        this.f3922j0 = -1.0f;
                    }
                }
            }
            z2 = true;
            i3 = this.f3931r;
            if (i3 != -1) {
            }
            i4 = this.f3932s;
            if (i4 != -1) {
            }
            i5 = this.f3937x;
            if (i5 != -1) {
            }
            i6 = this.f3938y;
            if (i6 != -1) {
            }
            if (z2) {
            }
            if (this.f3901Y) {
                if (f3 == -1.0f) {
                }
            }
        } else {
            int i13 = this.f3929p;
            if (i13 != -1) {
                this.f3906b0 = i13;
            }
            int i14 = this.f3930q;
            if (i14 != -1) {
                this.f3904a0 = i14;
            }
            int i15 = this.f3931r;
            if (i15 != -1) {
                this.f3908c0 = i15;
            }
            int i16 = this.f3932s;
            if (i16 != -1) {
                this.f3910d0 = i16;
            }
            int i17 = this.f3937x;
            if (i17 != -1) {
                this.f3912e0 = i17;
            }
            int i18 = this.f3938y;
            if (i18 != -1) {
                this.f3914f0 = i18;
            }
        }
        if (this.f3931r == -1 && this.f3932s == -1 && this.f3930q == -1 && this.f3929p == -1) {
            int i19 = this.f3913f;
            if (i19 != -1) {
                this.f3908c0 = i19;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i8 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i8;
                }
            } else {
                int i20 = this.f3915g;
                if (i20 != -1) {
                    this.f3910d0 = i20;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i8 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i8;
                    }
                }
            }
            int i21 = this.f3909d;
            if (i21 != -1) {
                this.f3904a0 = i21;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
                return;
            }
            int i22 = this.f3911e;
            if (i22 != -1) {
                this.f3906b0 = i22;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i7 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i7;
            }
        }
    }
}
