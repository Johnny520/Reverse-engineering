package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: kk */
/* JADX INFO: loaded from: classes.dex */
public final class C2150kk extends C2454rb {

    /* JADX INFO: renamed from: q0 */
    public float f7518q0 = -1.0f;

    /* JADX INFO: renamed from: r0 */
    public int f7519r0 = -1;

    /* JADX INFO: renamed from: s0 */
    public int f7520s0 = -1;

    /* JADX INFO: renamed from: t0 */
    public C1259cb f7521t0 = this.f8589J;

    /* JADX INFO: renamed from: u0 */
    public int f7522u0 = 0;

    /* JADX INFO: renamed from: v0 */
    public boolean f7523v0;

    public C2150kk() {
        this.f8597R.clear();
        this.f8597R.add(this.f7521t0);
        int length = this.f8596Q.length;
        for (int i = 0; i < length; i++) {
            this.f8596Q[i] = this.f7521t0;
        }
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
    public final void mo4336Q(C2244mo c2244mo, boolean z) {
        if (this.f8599T == null) {
            return;
        }
        C1259cb c1259cb = this.f7521t0;
        c2244mo.getClass();
        int iM4561n = C2244mo.m4561n(c1259cb);
        if (this.f7522u0 == 1) {
            this.f8604Y = iM4561n;
            this.f8605Z = 0;
            m4921L(this.f8599T.m4933k());
            m4924O(0);
            return;
        }
        this.f8604Y = 0;
        this.f8605Z = iM4561n;
        m4924O(this.f8599T.m4937q());
        m4921L(0);
    }

    /* JADX INFO: renamed from: R */
    public final void m4337R(int i) {
        this.f7521t0.m2391l(i);
        this.f7523v0 = true;
    }

    /* JADX INFO: renamed from: S */
    public final void m4338S(int i) {
        if (this.f7522u0 == i) {
            return;
        }
        this.f7522u0 = i;
        ArrayList arrayList = this.f8597R;
        arrayList.clear();
        if (this.f7522u0 == 1) {
            this.f7521t0 = this.f8588I;
        } else {
            this.f7521t0 = this.f8589J;
        }
        arrayList.add(this.f7521t0);
        C1259cb[] c1259cbArr = this.f8596Q;
        int length = c1259cbArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            c1259cbArr[i2] = this.f7521t0;
        }
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: b */
    public final void mo813b(C2244mo c2244mo, boolean z) {
        C2497sb c2497sb = (C2497sb) this.f8599T;
        if (c2497sb == null) {
            return;
        }
        Object objMo4340i = c2497sb.mo4340i(2);
        Object objMo4340i2 = c2497sb.mo4340i(4);
        C2454rb c2454rb = this.f8599T;
        boolean z2 = c2454rb != null && c2454rb.f8637p0[0] == 2;
        if (this.f7522u0 == 0) {
            objMo4340i = c2497sb.mo4340i(3);
            objMo4340i2 = c2497sb.mo4340i(5);
            C2454rb c2454rb2 = this.f8599T;
            z2 = c2454rb2 != null && c2454rb2.f8637p0[1] == 2;
        }
        if (this.f7523v0) {
            C1259cb c1259cb = this.f7521t0;
            if (c1259cb.f4267c) {
                C0256Fy c0256FyM4572k = c2244mo.m4572k(c1259cb);
                c2244mo.m4565d(c0256FyM4572k, this.f7521t0.m2383d());
                if (this.f7519r0 != -1) {
                    if (z2) {
                        c2244mo.m4567f(c2244mo.m4572k(objMo4340i2), c0256FyM4572k, 0, 5);
                    }
                } else if (this.f7520s0 != -1 && z2) {
                    C0256Fy c0256FyM4572k2 = c2244mo.m4572k(objMo4340i2);
                    c2244mo.m4567f(c0256FyM4572k, c2244mo.m4572k(objMo4340i), 0, 5);
                    c2244mo.m4567f(c0256FyM4572k2, c0256FyM4572k, 0, 5);
                }
                this.f7523v0 = false;
                return;
            }
        }
        if (this.f7519r0 != -1) {
            C0256Fy c0256FyM4572k3 = c2244mo.m4572k(this.f7521t0);
            c2244mo.m4566e(c0256FyM4572k3, c2244mo.m4572k(objMo4340i), this.f7519r0, 8);
            if (z2) {
                c2244mo.m4567f(c2244mo.m4572k(objMo4340i2), c0256FyM4572k3, 0, 5);
                return;
            }
            return;
        }
        if (this.f7520s0 != -1) {
            C0256Fy c0256FyM4572k4 = c2244mo.m4572k(this.f7521t0);
            C0256Fy c0256FyM4572k5 = c2244mo.m4572k(objMo4340i2);
            c2244mo.m4566e(c0256FyM4572k4, c0256FyM4572k5, -this.f7520s0, 8);
            if (z2) {
                c2244mo.m4567f(c0256FyM4572k4, c2244mo.m4572k(objMo4340i), 0, 5);
                c2244mo.m4567f(c0256FyM4572k5, c0256FyM4572k4, 0, 5);
                return;
            }
            return;
        }
        if (this.f7518q0 != -1.0f) {
            C0256Fy c0256FyM4572k6 = c2244mo.m4572k(this.f7521t0);
            C0256Fy c0256FyM4572k7 = c2244mo.m4572k(objMo4340i2);
            float f = this.f7518q0;
            C0564N4 c0564n4M4573l = c2244mo.m4573l();
            c0564n4M4573l.f1845d.m367g(c0256FyM4572k6, -1.0f);
            c0564n4M4573l.f1845d.m367g(c0256FyM4572k7, f);
            c2244mo.m4564c(c0564n4M4573l);
        }
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: c */
    public final boolean mo4339c() {
        return true;
    }

    @Override // p000.C2454rb
    /* JADX INFO: renamed from: i */
    public final C1259cb mo4340i(int i) {
        int iM424v = AbstractC0213Ey.m424v(i);
        if (iM424v != 1) {
            if (iM424v != 2) {
                if (iM424v != 3) {
                    if (iM424v != 4) {
                        return null;
                    }
                }
            }
            if (this.f7522u0 == 0) {
                return this.f7521t0;
            }
            return null;
        }
        if (this.f7522u0 == 1) {
            return this.f7521t0;
        }
        return null;
    }
}
