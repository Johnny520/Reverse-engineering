package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: kk */
/* JADX INFO: loaded from: classes.dex */
public final class C2150kk extends C2454rb {

    /* JADX INFO: renamed from: q0 */
    public float f7518q0;

    /* JADX INFO: renamed from: r0 */
    public int f7519r0;

    /* JADX INFO: renamed from: s0 */
    public int f7520s0;

    /* JADX INFO: renamed from: t0 */
    public C1259cb f7521t0;

    /* JADX INFO: renamed from: u0 */
    public int f7522u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f7523v0;

    public C2150kk() {
        this.f7518q0 = -1.0f;
        this.f7519r0 = -1;
        this.f7520s0 = -1;
        this.f7521t0 = this.f8589J;
        int r0 = 0;
        this.f7522u0 = 0;
        this.f8597R.clear();
        this.f8597R.add(this.f7521t0);
        int r1 = this.f8596Q.length;
    L3:
        if (r0 >= r1) goto L5;
        this.f8596Q[r0] = this.f7521t0;
        r0 = r0 + 1;
        goto L3
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: A */
    public final boolean mo4334A() {
        return this.f7523v0;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: B */
    public final boolean mo4335B() {
        return this.f7523v0;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: Q */
    public final void mo4336Q(C2244mo r3, boolean r4) {
        if (this.f8599T != null) goto L5;
        return;
    L5:
        C1259cb r42 = this.f7521t0;
        r3.getClass();
        int r32 = C2244mo.m4561n(r42);
        if (this.f7522u0 != 1) goto L9;
        this.f8604Y = r32;
        this.f8605Z = 0;
        m4921L(this.f8599T.m4933k());
        m4924O(0);
        return;
    L9:
        this.f8604Y = 0;
        this.f8605Z = r32;
        m4924O(this.f8599T.m4937q());
        m4921L(0);
    }

    /* JADX INFO: renamed from: R */
    public final void m4337R(int r2) {
        this.f7521t0.m2391l(r2);
        this.f7523v0 = true;
    }

    /* JADX INFO: renamed from: S */
    public final void m4338S(int r4) {
        if (this.f7522u0 == r4) goto L12;
        this.f7522u0 = r4;
        ArrayList r42 = this.f8597R;
        r42.clear();
        if (this.f7522u0 != 1) goto L8;
        this.f7521t0 = this.f8588I;
    L9:
        r42.add(this.f7521t0);
        C1259cb[] r43 = this.f8596Q;
        int r0 = r43.length;
        int r1 = 0;
    L10:
        if (r1 >= r0) goto L14;
        r43[r1] = this.f7521t0;
        r1 = r1 + 1;
        goto L10
    L14:
        return;
    L8:
        this.f7521t0 = this.f8589J;
        goto L9
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: b */
    public final void mo813b(C2244mo r9, boolean r10) {
        C2497sb r102 = (C2497sb) this.f8599T;
        if (r102 == null) goto L53;
        Object r1 = r102.mo4340i(2);
        Object r2 = r102.mo4340i(4);
        C2454rb r3 = this.f8599T;
        boolean r4 = true;
        if (r3 != null) goto L8;
    L10:
        boolean r32 = false;
    L12:
        if (this.f7522u0 != 0) goto L21;
        r1 = r102.mo4340i(3);
        r2 = r102.mo4340i(5);
        C2454rb r103 = this.f8599T;
        if (r103 != null) goto L16;
    L18:
        r4 = false;
    L19:
        r32 = r4;
        goto L21
    L16:
        if (r103.f8637p0[1] != 2) goto L18;
    L21:
        if (this.f7523v0 == false) goto L35;
        C1259cb r104 = this.f7521t0;
        if (r104.f4267c == false) goto L35;
        C0256Fy r105 = r9.m4572k(r104);
        r9.m4565d(r105, this.f7521t0.m2383d());
        if (this.f7519r0 == (-1)) goto L29;
        if (r32 == false) goto L32;
        r9.m4567f(r9.m4572k(r2), r105, 0, 5);
    L32:
        this.f7523v0 = false;
        return;
    L29:
        if (this.f7520s0 == (-1)) goto L32;
        if (r32 == false) goto L32;
        C0256Fy r0 = r9.m4572k(r2);
        r9.m4567f(r105, r9.m4572k(r1), 0, 5);
        r9.m4567f(r0, r105, 0, 5);
    L35:
        if (this.f7519r0 == (-1)) goto L41;
        C0256Fy r106 = r9.m4572k(this.f7521t0);
        r9.m4566e(r106, r9.m4572k(r1), this.f7519r0, 8);
        if (r32 == false) goto L50;
        r9.m4567f(r9.m4572k(r2), r106, 0, 5);
        return;
    L50:
        return;
    L41:
        if (this.f7520s0 == (-1)) goto L47;
        C0256Fy r107 = r9.m4572k(this.f7521t0);
        C0256Fy r02 = r9.m4572k(r2);
        r9.m4566e(r107, r02, -this.f7520s0, 8);
        if (r32 == false) goto L51;
        r9.m4567f(r107, r9.m4572k(r1), 0, 5);
        r9.m4567f(r02, r107, 0, 5);
        return;
    L51:
        return;
    L47:
        if (this.f7518q0 == (-1.0f)) goto L52;
        C0256Fy r108 = r9.m4572k(this.f7521t0);
        C0256Fy r12 = r9.m4572k(r2);
        float r22 = this.f7518q0;
        C0564N4 r33 = r9.m4573l();
        r33.f1845d.m367g(r108, -1.0f);
        r33.f1845d.m367g(r12, r22);
        r9.m4564c(r33);
        return;
    L52:
        return;
    L8:
        if (r3.f8637p0[0] != 2) goto L10;
        r32 = true;
        goto L12
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: c */
    public final boolean mo4339c() {
        return true;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: i */
    public final C1259cb mo4340i(int r3) {
        int r32 = AbstractC0213Ey.m424v(r3);
        if (r32 == 1) goto L16;
        if (r32 == 2) goto L12;
        if (r32 == 3) goto L16;
        if (r32 == 4) goto L12;
        return null;
    L12:
        if (this.f7522u0 == 0) goto L14;
        return null;
    L14:
        return this.f7521t0;
    L16:
        if (this.f7522u0 == 1) goto L18;
        return null;
    L18:
        return this.f7521t0;
    }
}
