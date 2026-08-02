package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class eh1 extends jm2 {

    /* JADX INFO: renamed from: j */
    public static final sl0 f2441j = new sl0(15);

    /* JADX INFO: renamed from: f */
    public final ArrayList f2442f;

    /* JADX INFO: renamed from: g */
    public final HashMap f2443g;

    /* JADX INFO: renamed from: h */
    public final int f2444h;

    /* JADX INFO: renamed from: i */
    public int f2445i;

    public eh1(String str, z70 z70Var, int i, int i2) {
        super(str, z70Var, i);
        this.f2442f = new ArrayList(100);
        this.f2443g = new HashMap(100);
        this.f2444h = i2;
        this.f2445i = -1;
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: a */
    public final int mo1349a(f21 f21Var) {
        return ((xs1) f21Var).m6177f();
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: c */
    public final Collection mo398c() {
        return this.f2442f;
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: e */
    public final void mo1350e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2442f;
            int size = arrayList.size();
            if (i >= size) {
                return;
            }
            while (i < size) {
                ((xs1) arrayList.get(i)).mo68a(this.f5108b);
                i++;
            }
        }
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: h */
    public final int mo1351h() {
        m2518f();
        return this.f2445i;
    }

    @Override // p000.jm2
    /* JADX INFO: renamed from: j */
    public final void mo1352j(C0929yn c0929yn) {
        boolean zM6293d = c0929yn.m6293d();
        boolean z = true;
        int iMo70c = 0;
        for (xs1 xs1Var : this.f2442f) {
            if (zM6293d) {
                if (z) {
                    z = false;
                } else {
                    c0929yn.m6292c("\n", 0);
                }
            }
            int i = xs1Var.f13158h - 1;
            int i2 = (~i) & (iMo70c + i);
            if (iMo70c != i2) {
                c0929yn.m6302n(i2 - iMo70c);
                iMo70c = i2;
            }
            xs1Var.mo71d(this.f5108b, c0929yn);
            iMo70c += xs1Var.mo70c();
        }
        if (iMo70c == this.f2445i) {
            return;
        }
        c80.m667j("output size mismatch");
    }

    /* JADX INFO: renamed from: k */
    public final void m1353k(xs1 xs1Var) {
        m2519g();
        try {
            if (xs1Var.f13158h > this.f5109c) {
                throw new IllegalArgumentException("incompatible item alignment");
            }
            this.f2442f.add(xs1Var);
        } catch (NullPointerException unused) {
            um2.m5516f("item == null");
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized xs1 m1354l(xs1 xs1Var) {
        m2519g();
        xs1 xs1Var2 = (xs1) this.f2443g.get(xs1Var);
        if (xs1Var2 != null) {
            return xs1Var2;
        }
        m1353k(xs1Var);
        this.f2443g.put(xs1Var, xs1Var);
        return xs1Var;
    }

    /* JADX INFO: renamed from: m */
    public final void m1355m() {
        m2518f();
        int iM5702u = vi0.m5702u(this.f2444h);
        ArrayList arrayList = this.f2442f;
        if (iM5702u == 1) {
            Collections.sort(arrayList, f2441j);
        } else if (iM5702u == 2) {
            Collections.sort(arrayList);
        }
        int size = arrayList.size();
        int iMo70c = 0;
        for (int i = 0; i < size; i++) {
            xs1 xs1Var = (xs1) arrayList.get(i);
            try {
                int iM6179h = xs1Var.m6179h(this, iMo70c);
                if (iM6179h < iMo70c) {
                    throw new RuntimeException("bogus place() result for " + xs1Var);
                }
                iMo70c = xs1Var.mo70c() + iM6179h;
            } catch (RuntimeException e) {
                throw sg0.m4862a(e, "...while placing " + xs1Var);
            }
        }
        this.f2445i = iMo70c;
    }
}
