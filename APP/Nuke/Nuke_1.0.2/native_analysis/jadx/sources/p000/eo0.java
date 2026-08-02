package p000;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eo0 extends AbstractC0941yx {

    /* JADX INFO: renamed from: a */
    public final long f2523a;

    /* JADX INFO: renamed from: b */
    public final boolean f2524b;

    /* JADX INFO: renamed from: c */
    public final boolean f2525c;

    /* JADX INFO: renamed from: d */
    public HashSet f2526d;

    /* JADX INFO: renamed from: e */
    public final sk1 f2527e;

    /* JADX INFO: renamed from: f */
    public final nx1 f2528f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ go0 f2529g;

    public eo0(go0 go0Var, long j, boolean z, boolean z2, C0485n4 c0485n4) {
        this.f2529g = go0Var;
        this.f2523a = j;
        this.f2524b = z;
        this.f2525c = z2;
        sk1 sk1Var = fd2.f2911a;
        this.f2527e = new sk1();
        this.f2528f = new nx1(yy1.f13674k, C0700sn.f10212P);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: a */
    public final void mo1375a(C0220fy c0220fy, mn0 mn0Var) {
        this.f2529g.f3617b.mo1375a(c0220fy, mn0Var);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: b */
    public final sk1 mo1376b(C0220fy c0220fy, sq2 sq2Var, mn0 mn0Var) {
        return this.f2529g.f3617b.mo1376b(c0220fy, sq2Var, mn0Var);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: c */
    public final void mo1377c() {
        go0 go0Var = this.f2529g;
        go0Var.f3595A--;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: d */
    public final boolean mo1378d() {
        return this.f2529g.f3617b.mo1378d();
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: e */
    public final boolean mo1379e() {
        return this.f2524b;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: f */
    public final boolean mo1380f() {
        return this.f2525c;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: g */
    public final long mo1381g() {
        return this.f2523a;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: h */
    public final InterfaceC0902xx mo1382h() {
        return this.f2529g.f3623h;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: i */
    public final yy1 mo1383i() {
        return (yy1) this.f2528f.getValue();
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: j */
    public final a20 mo1384j() {
        return this.f2529g.f3617b.mo1384j();
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: k */
    public final boolean mo1385k() {
        return this.f2529g.f3617b.mo1385k();
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: l */
    public final void mo1386l(C0220fy c0220fy) {
        go0 go0Var = this.f2529g;
        go0Var.f3617b.mo1386l(go0Var.f3623h);
        go0Var.f3617b.mo1386l(c0220fy);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: m */
    public final ti1 mo1387m(ui1 ui1Var) {
        return this.f2529g.f3617b.mo1387m(ui1Var);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: n */
    public final sk1 mo1388n(C0220fy c0220fy, sq2 sq2Var, sk1 sk1Var) {
        return this.f2529g.f3617b.mo1388n(c0220fy, sq2Var, sk1Var);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: o */
    public final void mo1389o(Set set) {
        HashSet hashSet = this.f2526d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f2526d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: p */
    public final void mo1390p(go0 go0Var) {
        this.f2527e.m4882a(go0Var);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: q */
    public final void mo1391q(b62 b62Var) {
        this.f2529g.f3617b.mo1391q(b62Var);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: r */
    public final void mo1392r(C0220fy c0220fy) {
        this.f2529g.f3617b.mo1392r(c0220fy);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: s */
    public final InterfaceC0508np mo1393s(C0159ea c0159ea) {
        return this.f2529g.f3617b.mo1393s(c0159ea);
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: t */
    public final void mo1394t() {
        this.f2529g.f3595A++;
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: u */
    public final void mo1395u(go0 go0Var) {
        HashSet<Set> hashSet = this.f2526d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                go0Var.getClass();
                set.remove(go0Var.m2001w());
            }
        }
        if (go0Var != null) {
            this.f2527e.m4893l(go0Var);
        }
    }

    @Override // p000.AbstractC0941yx
    /* JADX INFO: renamed from: v */
    public final void mo1396v(C0220fy c0220fy) {
        this.f2529g.f3617b.mo1396v(c0220fy);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1397w() {
        sk1 sk1Var = this.f2527e;
        if (sk1Var.m4889h()) {
            HashSet hashSet = this.f2526d;
            if (hashSet != null) {
                Object[] objArr = sk1Var.f10175b;
                long[] jArr = sk1Var.f10174a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    go0 go0Var = (go0) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(go0Var.m2001w());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i == length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
            }
            sk1Var.m4883b();
        }
    }
}
