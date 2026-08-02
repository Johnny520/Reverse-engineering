package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u21 {

    /* JADX INFO: renamed from: d */
    public static final t21 f11071d = new t21(new f31(false, false, true, "    ", "type", true, EnumC0973zs.f14082j, true), rg3.f9571m);

    /* JADX INFO: renamed from: a */
    public final f31 f11072a;

    /* JADX INFO: renamed from: b */
    public final i51 f11073b;

    /* JADX INFO: renamed from: c */
    public final C0485n4 f11074c = new C0485n4(12);

    public u21(f31 f31Var, i51 i51Var) {
        this.f11072a = f31Var;
        this.f11073b = i51Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m5453a(w41 w41Var, String str) {
        qb2 qb2VarM6111b = xe1.m6111b(this, str);
        Object objMo896c = new cv2(this, fg3.f2990j, qb2VarM6111b, w41Var.mo168e()).mo896c(w41Var);
        if (qb2VarM6111b.m4119f() == 10) {
            return objMo896c;
        }
        qb2.m4114m(qb2VarM6111b, "Expected EOF after parsing, but had " + ((String) qb2VarM6111b.f8879g).charAt(qb2VarM6111b.f8874b - 1) + " instead", 0, 6);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final String m5454b(w41 w41Var, Object obj) {
        char[] cArr;
        w41Var.getClass();
        C0133dk c0133dk = new C0133dk((byte) 0, 6);
        C0665rq c0665rq = C0665rq.f9697c;
        synchronized (c0665rq) {
            C0017ag c0017ag = c0665rq.f9698a;
            cArr = null;
            char[] cArr2 = (char[]) (c0017ag.isEmpty() ? null : c0017ag.removeLast());
            if (cArr2 != null) {
                c0665rq.f9699b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c0133dk.f2082j = cArr;
        try {
            new dv2(this.f11072a.f2755b ? new C0789ux(c0133dk, this) : new C0559ox(c0133dk), this, fg3.f2990j, new dv2[fg3.f2995o.mo529a()]).mo1180e(w41Var, obj);
            return c0133dk.toString();
        } finally {
            c0133dk.m1042p();
        }
    }
}
