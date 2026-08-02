package p000;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class a71 implements of1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f103a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ of1 f104b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ f71 f105c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f106d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ of1 f107e;

    public /* synthetic */ a71(of1 of1Var, f71 f71Var, int i, of1 of1Var2, int i2) {
        this.f103a = i2;
        this.f105c = f71Var;
        this.f106d = i;
        this.f107e = of1Var2;
        this.f104b = of1Var;
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: a */
    public final Map mo104a() {
        switch (this.f103a) {
        }
        return this.f104b.mo104a();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0095  */
    @Override // p000.of1
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo105b() {
        int i;
        int i2 = this.f103a;
        of1 of1Var = this.f107e;
        int i3 = this.f106d;
        f71 f71Var = this.f105c;
        switch (i2) {
            case 0:
                f71Var.f2830l = i3;
                of1Var.mo105b();
                zk1 zk1Var = f71Var.f2838t;
                rk1 rk1Var = f71Var.f2837s;
                long[] jArr = rk1Var.f9618a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((255 & j) < 128) {
                                    int i8 = (i4 << 3) + i7;
                                    Object obj = rk1Var.f9619b[i8];
                                    fw2 fw2Var = (fw2) rk1Var.f9620c[i8];
                                    int iM6430i = zk1Var.m6430i(obj);
                                    if (iM6430i < 0 || iM6430i >= f71Var.f2830l) {
                                        if (iM6430i >= 0) {
                                            Object obj2 = rp0.f9680l;
                                            i = i5;
                                            Object[] objArr = zk1Var.f13934h;
                                            Object obj3 = objArr[iM6430i];
                                            objArr[iM6430i] = obj2;
                                        } else {
                                            i = i5;
                                        }
                                        if (f71Var.f2835q.m4500b(obj)) {
                                            fw2Var.mo658a();
                                        }
                                        rk1Var.m4510l(i8);
                                    } else {
                                        i = i5;
                                    }
                                }
                                j >>= i;
                                i7++;
                                i5 = i;
                            }
                            if (i6 == i5) {
                                if (i4 != length) {
                                    i4++;
                                }
                            }
                        }
                    }
                }
                f71Var.m1541g(f71Var.f2829k);
                break;
            default:
                f71Var.f2829k = i3;
                of1Var.mo105b();
                if (f71Var.f2826h.f9391o == null) {
                    f71Var.m1541g(f71Var.f2829k);
                }
                break;
        }
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: c */
    public final int mo106c() {
        switch (this.f103a) {
        }
        return this.f104b.mo106c();
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: d */
    public final in0 mo107d() {
        switch (this.f103a) {
        }
        return this.f104b.mo107d();
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: e */
    public final int mo108e() {
        switch (this.f103a) {
        }
        return this.f104b.mo108e();
    }
}
