package p000;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class r30 extends k63 {

    /* JADX INFO: renamed from: j */
    public static final ConcurrentHashMap f9338j = new ConcurrentHashMap(1000, 0.75f);

    /* JADX INFO: renamed from: k */
    public static final r30 f9339k;

    /* JADX INFO: renamed from: l */
    public static final r30 f9340l;

    /* JADX INFO: renamed from: m */
    public static final r30 f9341m;

    /* JADX INFO: renamed from: h */
    public final o43 f9342h;

    /* JADX INFO: renamed from: i */
    public q30 f9343i;

    static {
        r30 r30Var = new r30(o43.f7486B);
        f9339k = r30Var;
        r30 r30Var2 = new r30(o43.f7489E);
        r30 r30Var3 = new r30(o43.f7490F);
        r30 r30Var4 = new r30(o43.f7491G);
        r30 r30Var5 = new r30(o43.f7492H);
        r30 r30Var6 = new r30(o43.f7493I);
        r30 r30Var7 = new r30(o43.f7495K);
        r30 r30Var8 = new r30(o43.f7494J);
        r30 r30Var9 = new r30(o43.f7496L);
        r30 r30Var10 = new r30(o43.f7497M);
        r30 r30Var11 = new r30(o43.f7498N);
        r30 r30Var12 = new r30(o43.f7499O);
        r30 r30Var13 = new r30(o43.f7500P);
        r30 r30Var14 = new r30(o43.f7501Q);
        r30 r30Var15 = new r30(o43.f7502R);
        r30 r30Var16 = new r30(o43.f7504T);
        r30 r30Var17 = new r30(o43.f7503S);
        r30 r30Var18 = new r30(o43.f7506V);
        r30 r30Var19 = new r30(o43.f7520z);
        f9340l = r30Var19;
        f9341m = new r30(o43.f7485A);
        m4327h(r30Var);
        m4327h(r30Var2);
        m4327h(r30Var3);
        m4327h(r30Var4);
        m4327h(r30Var5);
        m4327h(r30Var6);
        m4327h(r30Var7);
        m4327h(r30Var8);
        m4327h(r30Var9);
        m4327h(r30Var10);
        m4327h(r30Var11);
        m4327h(r30Var12);
        m4327h(r30Var13);
        m4327h(r30Var14);
        m4327h(r30Var15);
        m4327h(r30Var16);
        m4327h(r30Var17);
        m4327h(r30Var18);
        m4327h(r30Var19);
    }

    public r30(o43 o43Var) {
        if (o43Var == null) {
            um2.m5516f("type == null");
            throw null;
        }
        if (o43Var == o43.f7517w) {
            c80.m676t("KNOWN_NULL is not representable");
            throw null;
        }
        this.f9342h = o43Var;
        this.f9343i = null;
    }

    /* JADX INFO: renamed from: h */
    public static void m4327h(r30 r30Var) {
        if (f9338j.putIfAbsent(r30Var.f9342h, r30Var) == null) {
            return;
        }
        c80.m669m("Attempted re-init of ", r30Var);
    }

    @Override // p000.w53
    /* JADX INFO: renamed from: a */
    public final o43 mo22a() {
        return o43.f7519y;
    }

    @Override // p000.t23
    /* JADX INFO: renamed from: b */
    public final String mo23b() {
        return this.f9342h.mo23b();
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: e */
    public final int mo626e(AbstractC0147dz abstractC0147dz) {
        return this.f9342h.f7521h.compareTo(((r30) abstractC0147dz).f9342h.f7521h);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof r30) {
            return this.f9342h == ((r30) obj).f9342h;
        }
        return false;
    }

    @Override // p000.AbstractC0147dz
    /* JADX INFO: renamed from: f */
    public final String mo24f() {
        return "type";
    }

    /* JADX INFO: renamed from: g */
    public final q30 m4328g() {
        if (this.f9343i == null) {
            this.f9343i = new q30(this.f9342h.f7521h);
        }
        return this.f9343i;
    }

    public final int hashCode() {
        return this.f9342h.f7521h.hashCode();
    }

    public final String toString() {
        return "type{" + this.f9342h.mo23b() + '}';
    }
}
