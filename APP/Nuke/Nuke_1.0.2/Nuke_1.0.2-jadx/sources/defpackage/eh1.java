package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends jm2 {
    public static final sl0 j = new sl0(15);
    public final ArrayList f;
    public final HashMap g;
    public final int h;
    public int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public eh1(String str, z70 z70Var, int i, int i2) {
        super(str, z70Var, i);
        this.f = new ArrayList(100);
        this.g = new HashMap(100);
        this.h = i2;
        this.i = -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final int a(f21 f21Var) {
        return ((xs1) f21Var).f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final Collection c() {
        return this.f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((xs1) arrayList.get(i)).a(this.b);
                i++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final int h() {
        f();
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.jm2
    public final void j(yn ynVar) {
        boolean zD = ynVar.d();
        boolean z = true;
        int iC = 0;
        for (xs1 xs1Var : this.f) {
            if (zD) {
                if (z) {
                    z = false;
                } else {
                    ynVar.c("\n", 0);
                }
            }
            int i = xs1Var.h - 1;
            int i2 = (~i) & (iC + i);
            if (iC != i2) {
                ynVar.n(i2 - iC);
                iC = i2;
            }
            xs1Var.d(this.b, ynVar);
            iC += xs1Var.c();
        }
        if (iC == this.i) {
            return;
        }
        c80.j("output size mismatch");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void k(xs1 xs1Var) {
        g();
        try {
            if (xs1Var.h > this.c) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f.add(xs1Var);
        } catch (NullPointerException unused) {
            um2.f("item == null");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized xs1 l(xs1 xs1Var) {
        g();
        xs1 xs1Var2 = (xs1) this.g.get(xs1Var);
        if (xs1Var2 != null) {
            return xs1Var2;
        }
        k(xs1Var);
        this.g.put(xs1Var, xs1Var);
        return xs1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void m() {
        f();
        int iU = vi0.u(this.h);
        ArrayList arrayList = this.f;
        if (iU == 1) {
            Collections.sort(arrayList, j);
        } else if (iU == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iC = 0;
        for (int i = 0; i < size; i++) {
            xs1 xs1Var = (xs1) arrayList.get(i);
            try {
                int iH = xs1Var.h(this, iC);
                if (iH < iC) {
                    throw new RuntimeException("bogus place() result for " + xs1Var);
                }
                iC = xs1Var.c() + iH;
            } catch (RuntimeException e) {
                throw sg0.a(e, "...while placing " + xs1Var);
            }
        }
        this.i = iC;
    }
}
