package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r30 extends k63 {
    public static final ConcurrentHashMap j = new ConcurrentHashMap(1000, 0.75f);
    public static final r30 k;
    public static final r30 l;
    public static final r30 m;
    public final o43 h;
    public q30 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        r30 r30Var = new r30(o43.B);
        k = r30Var;
        r30 r30Var2 = new r30(o43.E);
        r30 r30Var3 = new r30(o43.F);
        r30 r30Var4 = new r30(o43.G);
        r30 r30Var5 = new r30(o43.H);
        r30 r30Var6 = new r30(o43.I);
        r30 r30Var7 = new r30(o43.K);
        r30 r30Var8 = new r30(o43.J);
        r30 r30Var9 = new r30(o43.L);
        r30 r30Var10 = new r30(o43.M);
        r30 r30Var11 = new r30(o43.N);
        r30 r30Var12 = new r30(o43.O);
        r30 r30Var13 = new r30(o43.P);
        r30 r30Var14 = new r30(o43.Q);
        r30 r30Var15 = new r30(o43.R);
        r30 r30Var16 = new r30(o43.T);
        r30 r30Var17 = new r30(o43.S);
        r30 r30Var18 = new r30(o43.V);
        r30 r30Var19 = new r30(o43.z);
        l = r30Var19;
        m = new r30(o43.A);
        h(r30Var);
        h(r30Var2);
        h(r30Var3);
        h(r30Var4);
        h(r30Var5);
        h(r30Var6);
        h(r30Var7);
        h(r30Var8);
        h(r30Var9);
        h(r30Var10);
        h(r30Var11);
        h(r30Var12);
        h(r30Var13);
        h(r30Var14);
        h(r30Var15);
        h(r30Var16);
        h(r30Var17);
        h(r30Var18);
        h(r30Var19);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public r30(o43 o43Var) {
        if (o43Var == null) {
            um2.f("type == null");
            throw null;
        }
        if (o43Var == o43.w) {
            c80.t("KNOWN_NULL is not representable");
            throw null;
        }
        this.h = o43Var;
        this.i = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void h(r30 r30Var) {
        if (j.putIfAbsent(r30Var.h, r30Var) == null) {
            return;
        }
        c80.m("Attempted re-init of ", r30Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.w53
    public final o43 a() {
        return o43.y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.t23
    public final String b() {
        return this.h.b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dz
    public final int e(dz dzVar) {
        return this.h.h.compareTo(((r30) dzVar).h.h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof r30) {
            return this.h == ((r30) obj).h;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dz
    public final String f() {
        return "type";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final q30 g() {
        if (this.i == null) {
            this.i = new q30(this.h.h);
        }
        return this.i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.h.h.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "type{" + this.h.b() + '}';
    }
}
