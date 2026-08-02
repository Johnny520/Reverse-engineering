package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eo0 extends yx {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final sk1 e;
    public final nx1 f;
    public final /* synthetic */ go0 g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public eo0(go0 go0Var, long j, boolean z, boolean z2, n4 n4Var) {
        this.g = go0Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        sk1 sk1Var = fd2.a;
        this.e = new sk1();
        this.f = new nx1(yy1.k, sn.P);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void a(fy fyVar, mn0 mn0Var) {
        this.g.b.a(fyVar, mn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final sk1 b(fy fyVar, sq2 sq2Var, mn0 mn0Var) {
        return this.g.b.b(fyVar, sq2Var, mn0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void c() {
        go0 go0Var = this.g;
        go0Var.A--;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final boolean d() {
        return this.g.b.d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final boolean e() {
        return this.b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final boolean f() {
        return this.c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final long g() {
        return this.a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final xx h() {
        return this.g.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final yy1 i() {
        return (yy1) this.f.getValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final a20 j() {
        return this.g.b.j();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final boolean k() {
        return this.g.b.k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void l(fy fyVar) {
        go0 go0Var = this.g;
        go0Var.b.l(go0Var.h);
        go0Var.b.l(fyVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final ti1 m(ui1 ui1Var) {
        return this.g.b.m(ui1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final sk1 n(fy fyVar, sq2 sq2Var, sk1 sk1Var) {
        return this.g.b.n(fyVar, sq2Var, sk1Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void p(go0 go0Var) {
        this.e.a(go0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void q(b62 b62Var) {
        this.g.b.q(b62Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void r(fy fyVar) {
        this.g.b.r(fyVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final np s(ea eaVar) {
        return this.g.b.s(eaVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void t() {
        this.g.A++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void u(go0 go0Var) {
        HashSet<Set> hashSet = this.d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                go0Var.getClass();
                set.remove(go0Var.w());
            }
        }
        if (go0Var != null) {
            this.e.l(go0Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.yx
    public final void v(fy fyVar) {
        this.g.b.v(fyVar);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w() {
        sk1 sk1Var = this.e;
        if (sk1Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = sk1Var.b;
                long[] jArr = sk1Var.a;
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
                                        ((Set) it.next()).remove(go0Var.w());
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
            sk1Var.b();
        }
    }
}
