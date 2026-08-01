package p000;

import android.view.ViewGroup;

/* JADX INFO: renamed from: pc */
/* JADX INFO: loaded from: classes.dex */
public final class C0591pc extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: A */
    public float f3642A;

    /* JADX INFO: renamed from: B */
    public String f3643B;

    /* JADX INFO: renamed from: C */
    public int f3644C;

    /* JADX INFO: renamed from: D */
    public float f3645D;

    /* JADX INFO: renamed from: E */
    public float f3646E;

    /* JADX INFO: renamed from: F */
    public int f3647F;

    /* JADX INFO: renamed from: G */
    public int f3648G;

    /* JADX INFO: renamed from: H */
    public int f3649H;

    /* JADX INFO: renamed from: I */
    public int f3650I;

    /* JADX INFO: renamed from: J */
    public int f3651J;

    /* JADX INFO: renamed from: K */
    public int f3652K;

    /* JADX INFO: renamed from: L */
    public int f3653L;

    /* JADX INFO: renamed from: M */
    public int f3654M;

    /* JADX INFO: renamed from: N */
    public float f3655N;

    /* JADX INFO: renamed from: O */
    public float f3656O;

    /* JADX INFO: renamed from: P */
    public int f3657P;

    /* JADX INFO: renamed from: Q */
    public int f3658Q;

    /* JADX INFO: renamed from: R */
    public int f3659R;

    /* JADX INFO: renamed from: S */
    public boolean f3660S;

    /* JADX INFO: renamed from: T */
    public boolean f3661T;

    /* JADX INFO: renamed from: U */
    public String f3662U;

    /* JADX INFO: renamed from: V */
    public boolean f3663V;

    /* JADX INFO: renamed from: W */
    public boolean f3664W;

    /* JADX INFO: renamed from: X */
    public boolean f3665X;

    /* JADX INFO: renamed from: Y */
    public boolean f3666Y;

    /* JADX INFO: renamed from: Z */
    public boolean f3667Z;

    /* JADX INFO: renamed from: a */
    public int f3668a;

    /* JADX INFO: renamed from: a0 */
    public int f3669a0;

    /* JADX INFO: renamed from: b */
    public int f3670b;

    /* JADX INFO: renamed from: b0 */
    public int f3671b0;

    /* JADX INFO: renamed from: c */
    public float f3672c;

    /* JADX INFO: renamed from: c0 */
    public int f3673c0;

    /* JADX INFO: renamed from: d */
    public int f3674d;

    /* JADX INFO: renamed from: d0 */
    public int f3675d0;

    /* JADX INFO: renamed from: e */
    public int f3676e;

    /* JADX INFO: renamed from: e0 */
    public int f3677e0;

    /* JADX INFO: renamed from: f */
    public int f3678f;

    /* JADX INFO: renamed from: f0 */
    public int f3679f0;

    /* JADX INFO: renamed from: g */
    public int f3680g;

    /* JADX INFO: renamed from: g0 */
    public float f3681g0;

    /* JADX INFO: renamed from: h */
    public int f3682h;

    /* JADX INFO: renamed from: h0 */
    public int f3683h0;

    /* JADX INFO: renamed from: i */
    public int f3684i;

    /* JADX INFO: renamed from: i0 */
    public int f3685i0;

    /* JADX INFO: renamed from: j */
    public int f3686j;

    /* JADX INFO: renamed from: j0 */
    public float f3687j0;

    /* JADX INFO: renamed from: k */
    public int f3688k;

    /* JADX INFO: renamed from: k0 */
    public C0925yc f3689k0;

    /* JADX INFO: renamed from: l */
    public int f3690l;

    /* JADX INFO: renamed from: m */
    public int f3691m;

    /* JADX INFO: renamed from: n */
    public int f3692n;

    /* JADX INFO: renamed from: o */
    public float f3693o;

    /* JADX INFO: renamed from: p */
    public int f3694p;

    /* JADX INFO: renamed from: q */
    public int f3695q;

    /* JADX INFO: renamed from: r */
    public int f3696r;

    /* JADX INFO: renamed from: s */
    public int f3697s;

    /* JADX INFO: renamed from: t */
    public int f3698t;

    /* JADX INFO: renamed from: u */
    public int f3699u;

    /* JADX INFO: renamed from: v */
    public int f3700v;

    /* JADX INFO: renamed from: w */
    public int f3701w;

    /* JADX INFO: renamed from: x */
    public int f3702x;

    /* JADX INFO: renamed from: y */
    public int f3703y;

    /* JADX INFO: renamed from: z */
    public float f3704z;

    /* JADX INFO: renamed from: a */
    public final void m2083a() {
        this.f3666Y = false;
        this.f3663V = true;
        this.f3664W = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f3660S) {
            this.f3663V = false;
            if (this.f3649H == 0) {
                this.f3649H = 1;
            }
        }
        int i2 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i2 == -2 && this.f3661T) {
            this.f3664W = false;
            if (this.f3650I == 0) {
                this.f3650I = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f3663V = false;
            if (i == 0 && this.f3649H == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f3660S = true;
            }
        }
        if (i2 == 0 || i2 == -1) {
            this.f3664W = false;
            if (i2 == 0 && this.f3650I == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f3661T = true;
            }
        }
        if (this.f3672c == -1.0f && this.f3668a == -1 && this.f3670b == -1) {
            return;
        }
        this.f3666Y = true;
        this.f3663V = true;
        this.f3664W = true;
        if (!(this.f3689k0 instanceof C0418ko)) {
            this.f3689k0 = new C0418ko();
        }
        ((C0418ko) this.f3689k0).m1702B(this.f3659R);
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
        throw new UnsupportedOperationException("Method not decompiled: p000.C0591pc.resolveLayoutDirection(int):void");
    }
}
