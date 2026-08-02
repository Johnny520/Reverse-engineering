package p000;

/* JADX INFO: renamed from: sc */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0689sc {

    /* JADX INFO: renamed from: a */
    public final n43 f10022a;

    /* JADX INFO: renamed from: b */
    public final Object f10023b;

    /* JADX INFO: renamed from: c */
    public final C0310id f10024c;

    /* JADX INFO: renamed from: d */
    public final nx1 f10025d;

    /* JADX INFO: renamed from: e */
    public final nx1 f10026e;

    /* JADX INFO: renamed from: f */
    public final hl1 f10027f;

    /* JADX INFO: renamed from: g */
    public final AbstractC0494nd f10028g;

    /* JADX INFO: renamed from: h */
    public final AbstractC0494nd f10029h;

    /* JADX INFO: renamed from: i */
    public final AbstractC0494nd f10030i;

    /* JADX INFO: renamed from: j */
    public final AbstractC0494nd f10031j;

    public C0689sc(Object obj, n43 n43Var, Object obj2) {
        this.f10022a = n43Var;
        this.f10023b = obj2;
        C0310id c0310id = new C0310id(n43Var, obj, null, 60);
        this.f10024c = c0310id;
        this.f10025d = op0.m3598u(Boolean.FALSE);
        this.f10026e = op0.m3598u(obj);
        this.f10027f = new hl1();
        new qt2(obj2);
        AbstractC0494nd abstractC0494nd = c0310id.f4562j;
        boolean z = abstractC0494nd instanceof C0346jd;
        AbstractC0494nd abstractC0494nd2 = z ? qp0.f9063e : abstractC0494nd instanceof C0383kd ? qp0.f9064f : abstractC0494nd instanceof C0420ld ? qp0.f9065g : qp0.f9066h;
        this.f10028g = abstractC0494nd2;
        AbstractC0494nd abstractC0494nd3 = z ? qp0.f9059a : abstractC0494nd instanceof C0383kd ? qp0.f9060b : abstractC0494nd instanceof C0420ld ? qp0.f9061c : qp0.f9062d;
        this.f10029h = abstractC0494nd3;
        this.f10030i = abstractC0494nd2;
        this.f10031j = abstractC0494nd3;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m4785a(C0689sc c0689sc, Object obj) {
        n43 n43Var = c0689sc.f10022a;
        AbstractC0494nd abstractC0494nd = c0689sc.f10031j;
        AbstractC0494nd abstractC0494nd2 = c0689sc.f10030i;
        if (!t11.m5086l(abstractC0494nd2, c0689sc.f10028g) || !t11.m5086l(abstractC0494nd, c0689sc.f10029h)) {
            AbstractC0494nd abstractC0494nd3 = (AbstractC0494nd) n43Var.f7004a.mo5j(obj);
            int iMo2478b = abstractC0494nd3.mo2478b();
            boolean z = false;
            for (int i = 0; i < iMo2478b; i++) {
                if (abstractC0494nd3.mo2477a(i) < abstractC0494nd2.mo2477a(i) || abstractC0494nd3.mo2477a(i) > abstractC0494nd.mo2477a(i)) {
                    abstractC0494nd3.mo2481e(ci0.m778C(abstractC0494nd3.mo2477a(i), abstractC0494nd2.mo2477a(i), abstractC0494nd.mo2477a(i)), i);
                    z = true;
                }
            }
            if (z) {
                return n43Var.f7005b.mo5j(abstractC0494nd3);
            }
        }
        return obj;
    }

    /* JADX INFO: renamed from: b */
    public static final void m4786b(C0689sc c0689sc) {
        C0310id c0310id = c0689sc.f10024c;
        c0310id.f4562j.mo2480d();
        c0310id.f4563k = Long.MIN_VALUE;
        c0689sc.f10025d.setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: c */
    public static Object m4787c(C0689sc c0689sc, Object obj, InterfaceC0273hd interfaceC0273hd, in0 in0Var, u00 u00Var, int i) {
        Object objMo5j = c0689sc.f10022a.f7005b.mo5j(c0689sc.f10024c.f4562j);
        in0 in0Var2 = (i & 8) != 0 ? null : in0Var;
        Object objM4788d = c0689sc.m4788d();
        n43 n43Var = c0689sc.f10022a;
        return hl1.m2218a(c0689sc.f10027f, new C0614qc(c0689sc, objMo5j, new cy2(interfaceC0273hd, n43Var, objM4788d, obj, (AbstractC0494nd) n43Var.f7004a.mo5j(objMo5j)), c0689sc.f10024c.f4563k, in0Var2, null), u00Var);
    }

    /* JADX INFO: renamed from: d */
    public final Object m4788d() {
        return this.f10024c.f4561i.getValue();
    }

    /* JADX INFO: renamed from: e */
    public final Object m4789e(t00 t00Var, Object obj) {
        Object objM2218a = hl1.m2218a(this.f10027f, new C0651rc(this, obj, null, 0), t00Var);
        return objM2218a == k20.f5323h ? objM2218a : a83.f116a;
    }

    public /* synthetic */ C0689sc(Object obj, n43 n43Var, Object obj2, int i) {
        this(obj, n43Var, (i & 4) != 0 ? null : obj2);
    }
}
