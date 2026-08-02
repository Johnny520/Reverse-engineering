package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class w61 implements iw2, pf1 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ z61 f12365h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ f71 f12366i;

    public w61(f71 f71Var) {
        this.f12366i = f71Var;
        this.f12365h = f71Var.f2833o;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: A */
    public final float mo689A(float f) {
        return this.f12365h.mo693b() * f;
    }

    @Override // p000.iw2
    /* JADX INFO: renamed from: I */
    public final List mo2409I(mn0 mn0Var, Object obj) {
        f71 f71Var = this.f12366i;
        r61 r61Var = f71Var.f2826h;
        rk1 rk1Var = f71Var.f2832n;
        r61 r61Var2 = (r61) rk1Var.m4505g(obj);
        if (r61Var2 != null && ((zk1) ((jk1) r61Var.m4383o()).f5084i).m6430i(r61Var2) < f71Var.f2829k) {
            return r61Var2.m4381m();
        }
        rk1 rk1Var2 = f71Var.f2837s;
        rk1 rk1Var3 = f71Var.f2835q;
        zk1 zk1Var = f71Var.f2838t;
        if (zk1Var.f13936j < f71Var.f2830l) {
            kz0.m2763a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        r61 r61Var3 = (r61) rk1Var.m4505g(obj);
        int i = zk1Var.f13936j;
        int i2 = f71Var.f2830l;
        if (i == i2) {
            zk1Var.m6423b(obj);
        } else {
            Object[] objArr = zk1Var.f13934h;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        f71Var.f2830l++;
        boolean zM4500b = rk1Var3.m4500b(obj);
        if (zM4500b || r61Var3 != null) {
            if (!zM4500b && r61Var3 != null) {
                f71Var.m1544j(((zk1) ((jk1) r61Var.m4383o()).f5084i).m6430i(r61Var3), ((zk1) ((jk1) r61Var.m4383o()).f5084i).f13936j);
                f71Var.f2840v++;
                rk1Var.m4509k(obj);
                rk1Var3.m4511m(obj, r61Var3);
                rk1Var2.m4511m(obj, f71Var.m1540f(obj));
                if (r61Var.m4350H()) {
                    f71Var.m1542h();
                }
            }
            r61 r61Var4 = (r61) rk1Var3.m4505g(obj);
            x61 x61Var = r61Var4 != null ? (x61) f71Var.f2831m.m4505g(r61Var4) : null;
            if (x61Var != null && x61Var.f12845d) {
                f71Var.m1547m(r61Var4, obj, false, mn0Var);
            }
            if ((x61Var != null ? x61Var.f12847f : null) != null) {
                f71Var.m1539d(x61Var, true);
            }
        } else {
            f71Var.m1545k(obj, mn0Var, false);
            rk1Var2.m4511m(obj, f71Var.m1540f(obj));
        }
        r61 r61Var5 = (r61) rk1Var3.m4505g(obj);
        if (r61Var5 == null) {
            return be0.f819h;
        }
        List listM3073l0 = r61Var5.f9373N.f11795p.m3073l0();
        jk1 jk1Var = (jk1) listM3073l0;
        int i3 = ((zk1) jk1Var.f5084i).f13936j;
        for (int i4 = 0; i4 < i3; i4++) {
            ((mf1) jk1Var.get(i4)).f6618m.f11781b = true;
        }
        return listM3073l0;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: K */
    public final float mo690K(long j) {
        return this.f12365h.mo690K(j);
    }

    @Override // p000.pf1
    /* JADX INFO: renamed from: S */
    public final of1 mo691S(int i, int i2, Map map, in0 in0Var, in0 in0Var2) {
        return this.f12365h.mo691S(i, i2, map, in0Var, in0Var2);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: T */
    public final int mo692T(float f) {
        return this.f12365h.mo692T(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: b */
    public final float mo693b() {
        return this.f12365h.f13742i;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: d0 */
    public final long mo694d0(long j) {
        return this.f12365h.mo694d0(j);
    }

    @Override // p000.m11
    public final d61 getLayoutDirection() {
        return this.f12365h.f13741h;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: h0 */
    public final float mo695h0(long j) {
        return this.f12365h.mo695h0(j);
    }

    @Override // p000.pf1
    /* JADX INFO: renamed from: j0 */
    public final of1 mo696j0(int i, int i2, Map map, in0 in0Var) {
        return this.f12365h.mo691S(i, i2, map, null, in0Var);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: m */
    public final float mo697m() {
        return this.f12365h.f13743j;
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: p0 */
    public final long mo698p0(float f) {
        return this.f12365h.mo698p0(f);
    }

    @Override // p000.m11
    /* JADX INFO: renamed from: u */
    public final boolean mo699u() {
        return this.f12365h.mo699u();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: u0 */
    public final float mo700u0(int i) {
        return this.f12365h.mo700u0(i);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x */
    public final long mo701x(float f) {
        return this.f12365h.mo701x(f);
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: x0 */
    public final float mo702x0(float f) {
        return f / this.f12365h.mo693b();
    }

    @Override // p000.e70
    /* JADX INFO: renamed from: y */
    public final long mo703y(long j) {
        return this.f12365h.mo703y(j);
    }
}
