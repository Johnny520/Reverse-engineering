package p071n;

import java.util.ArrayList;
import p069m.C0985e;
import p073o.C1013b;
import p075p.C1040f;

/* JADX INFO: renamed from: n.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1002g extends AbstractC1004i {

    /* JADX INFO: renamed from: A0 */
    public float f3672A0;

    /* JADX INFO: renamed from: B0 */
    public float f3673B0;

    /* JADX INFO: renamed from: C0 */
    public int f3674C0;

    /* JADX INFO: renamed from: D0 */
    public int f3675D0;

    /* JADX INFO: renamed from: E0 */
    public int f3676E0;

    /* JADX INFO: renamed from: F0 */
    public int f3677F0;

    /* JADX INFO: renamed from: G0 */
    public int f3678G0;

    /* JADX INFO: renamed from: H0 */
    public int f3679H0;

    /* JADX INFO: renamed from: I0 */
    public int f3680I0;

    /* JADX INFO: renamed from: J0 */
    public ArrayList f3681J0;

    /* JADX INFO: renamed from: K0 */
    public C0999d[] f3682K0;

    /* JADX INFO: renamed from: L0 */
    public C0999d[] f3683L0;

    /* JADX INFO: renamed from: M0 */
    public int[] f3684M0;

    /* JADX INFO: renamed from: N0 */
    public C0999d[] f3685N0;

    /* JADX INFO: renamed from: O0 */
    public int f3686O0;

    /* JADX INFO: renamed from: f0 */
    public int f3687f0;

    /* JADX INFO: renamed from: g0 */
    public int f3688g0;

    /* JADX INFO: renamed from: h0 */
    public int f3689h0;

    /* JADX INFO: renamed from: i0 */
    public int f3690i0;

    /* JADX INFO: renamed from: j0 */
    public int f3691j0;

    /* JADX INFO: renamed from: k0 */
    public int f3692k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f3693l0;

    /* JADX INFO: renamed from: m0 */
    public int f3694m0;

    /* JADX INFO: renamed from: n0 */
    public int f3695n0;

    /* JADX INFO: renamed from: o0 */
    public C1013b f3696o0;

    /* JADX INFO: renamed from: p0 */
    public C1040f f3697p0;

    /* JADX INFO: renamed from: q0 */
    public int f3698q0;

    /* JADX INFO: renamed from: r0 */
    public int f3699r0;

    /* JADX INFO: renamed from: s0 */
    public int f3700s0;

    /* JADX INFO: renamed from: t0 */
    public int f3701t0;

    /* JADX INFO: renamed from: u0 */
    public int f3702u0;

    /* JADX INFO: renamed from: v0 */
    public int f3703v0;

    /* JADX INFO: renamed from: w0 */
    public float f3704w0;

    /* JADX INFO: renamed from: x0 */
    public float f3705x0;

    /* JADX INFO: renamed from: y0 */
    public float f3706y0;

    /* JADX INFO: renamed from: z0 */
    public float f3707z0;

    @Override // p071n.AbstractC1004i
    /* JADX INFO: renamed from: B */
    public final void mo2432B() {
        int r02 = 0;
    L4:
        if (r02 >= this.f3714e0) goto L6;
        C0999d r1 = this.f3713d0[r02];
        r02 = r02 + 1;
        goto L4
    }

    /* JADX INFO: renamed from: C */
    public final int m2433C(C0999d r10, int r11) {
        if (r10 != null) goto L5;
        return 0;
    L5:
        int[] r1 = r10.f3615c0;
        if (r1[1] != 3) goto L23;
        int r3 = r10.f3623k;
        if (r3 != 0) goto L11;
        return 0;
    L11:
        if (r3 != 2) goto L16;
        int r112 = (int) (r10.f3630r * r11);
        if (r112 == r10.m2404i()) goto L15;
        m2435E(r1[0], r10.m2407l(), 1, r112, r10);
    L15:
        return r112;
    L16:
        if (r3 == 1) goto L18;
        if (r3 != 3) goto L23;
        return (int) ((r10.m2407l() * r10.f3595L) + 0.5f);
    L18:
        return r10.m2404i();
    L23:
        return r10.m2404i();
    }

    /* JADX INFO: renamed from: D */
    public final int m2434D(C0999d r12, int r13) {
        if (r12 != null) goto L5;
        return 0;
    L5:
        int[] r1 = r12.f3615c0;
        if (r1[0] != 3) goto L23;
        int r2 = r12.f3622j;
        if (r2 != 0) goto L11;
        return 0;
    L11:
        if (r2 != 2) goto L16;
        int r132 = (int) (r12.f3627o * r13);
        if (r132 == r12.m2407l()) goto L15;
        m2435E(1, r132, r1[1], r12.m2404i(), r12);
    L15:
        return r132;
    L16:
        if (r2 == 1) goto L18;
        if (r2 != 3) goto L23;
        return (int) ((r12.m2404i() * r12.f3595L) + 0.5f);
    L18:
        return r12.m2407l();
    L23:
        return r12.m2407l();
    }

    /* JADX INFO: renamed from: E */
    public final void m2435E(int r3, int r4, int r5, int r6, C0999d r7) {
    L2:
        C1040f r02 = this.f3697p0;
        if (r02 != null) goto L7;
        C0999d r1 = this.f3592I;
        if (r1 == null) goto L7;
        this.f3697p0 = ((C1000e) r1).f3642g0;
    L7:
        C1013b r12 = this.f3696o0;
        r12.f3724a = r3;
        r12.f3725b = r5;
        r12.f3726c = r4;
        r12.f3727d = r6;
        r02.m2519a(r7, r12);
        r7.m2420y(r12.f3728e);
        r7.m2417v(r12.f3729f);
        r7.f3635w = r12.f3731h;
        int r32 = r12.f3730g;
        r7.f3599P = r32;
        if (r32 <= 0) goto L10;
        boolean r33 = true;
    L11:
        r7.f3635w = r33;
        return;
    L10:
        r33 = false;
        goto L11
    }

    @Override // p071n.C0999d
    /* JADX INFO: renamed from: a */
    public final void mo2386a(C0985e r12) {
        super.mo2386a(r12);
        C0999d r122 = this.f3592I;
        if (r122 == null) goto L5;
        boolean r123 = ((C1000e) r122).f3643h0;
    L6:
        int r1 = this.f3678G0;
        ArrayList r2 = this.f3681J0;
        if (r1 == 0) goto L91;
        if (r1 != 1) goto L10;
        int r13 = r2.size();
        int r4 = 0;
    L84:
        if (r4 >= r13) goto L93;
        C1001f r5 = (C1001f) r2.get(r4);
        if (r4 != (r13 - 1)) goto L88;
        boolean r6 = true;
    L89:
        r5.m2427b(r4, r123, r6);
        r4 = r4 + 1;
        goto L84
    L88:
        r6 = false;
    L93:
        this.f3693l0 = false;
        return;
    L10:
        if (r1 != 2) goto L93;
        if (this.f3684M0 == null) goto L93;
        if (this.f3683L0 == null) goto L93;
        if (this.f3682K0 == null) goto L93;
        int r14 = 0;
    L21:
        if (r14 >= this.f3686O0) goto L23;
        this.f3685N0[r14].m2415t();
        r14 = r14 + 1;
        goto L21
    L23:
        int[] r15 = this.f3684M0;
        int r22 = r15[0];
        int r16 = r15[1];
        C0999d r42 = null;
        int r52 = 0;
    L25:
        if (r52 >= r22) goto L44;
        if (r123 == false) goto L28;
        int r7 = (r22 - r52) - 1;
    L29:
        C0999d r72 = this.f3683L0[r7];
        if (r72 == null) goto L43;
        if (r72.f3605V == 8) goto L43;
        C0998c r62 = r72.f3636x;
        if (r52 != 0) goto L38;
        r72.m2400e(r62, this.f3636x, this.f3691j0);
        r72.f3607X = this.f3698q0;
        r72.f3602S = this.f3704w0;
    L38:
        if (r52 != (r22 - 1)) goto L40;
        r72.m2400e(r72.f3638z, this.f3638z, this.f3692k0);
    L40:
        if (r52 <= 0) goto L42;
        r72.m2400e(r62, r42.f3638z, this.f3674C0);
        r42.m2400e(r42.f3638z, r62, 0);
    L42:
        r42 = r72;
    L43:
        r52 = r52 + 1;
        goto L25
    L28:
        r7 = r52;
        goto L29
    L44:
        int r124 = 0;
    L45:
        if (r124 >= r16) goto L61;
        C0999d r53 = this.f3682K0[r124];
        if (r53 == null) goto L60;
        if (r53.f3605V == 8) goto L60;
        C0998c r73 = r53.f3637y;
        if (r124 != 0) goto L55;
        r53.m2400e(r73, this.f3637y, this.f3687f0);
        r53.f3608Y = this.f3699r0;
        r53.f3603T = this.f3705x0;
    L55:
        if (r124 != (r16 - 1)) goto L57;
        r53.m2400e(r53.f3584A, this.f3584A, this.f3688g0);
    L57:
        if (r124 <= 0) goto L59;
        r53.m2400e(r73, r42.f3584A, this.f3675D0);
        r42.m2400e(r42.f3584A, r73, 0);
    L59:
        r42 = r53;
    L60:
        r124 = r124 + 1;
        goto L45
    L61:
        int r125 = 0;
    L62:
        if (r125 >= r22) goto L93;
        int r43 = 0;
    L64:
        if (r43 >= r16) goto L82;
        int r54 = (r43 * r22) + r125;
        if (this.f3680I0 != 1) goto L68;
        r54 = (r125 * r16) + r43;
    L68:
        C0999d[] r74 = this.f3685N0;
        if (r54 >= r74.length) goto L81;
        C0999d r55 = r74[r54];
        if (r55 == null) goto L81;
        if (r55.f3605V == 8) goto L81;
        C0999d r75 = this.f3683L0[r125];
        C0999d r8 = this.f3682K0[r43];
        if (r55 == r75) goto L79;
        r55.m2400e(r55.f3636x, r75.f3636x, 0);
        r55.m2400e(r55.f3638z, r75.f3638z, 0);
    L79:
        if (r55 == r8) goto L81;
        r55.m2400e(r55.f3637y, r8.f3637y, 0);
        r55.m2400e(r55.f3584A, r8.f3584A, 0);
    L81:
        r43 = r43 + 1;
        goto L64
    L82:
        r125 = r125 + 1;
        goto L62
    L91:
        if (r2.size() <= 0) goto L93;
        ((C1001f) r2.get(0)).m2427b(0, r123, true);
        goto L93
    L5:
        r123 = false;
        goto L6
    }
}
