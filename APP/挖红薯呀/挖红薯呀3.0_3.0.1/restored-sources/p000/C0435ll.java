package p000;

/* JADX INFO: renamed from: ll */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0435ll implements InterfaceC0642q7 {

    /* JADX INFO: renamed from: a */
    public final C0948y2 f3513a;

    /* JADX INFO: renamed from: b */
    public final q91 f3514b;

    /* JADX INFO: renamed from: c */
    public final Object f3515c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0046b8 f3516d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0046b8 f3517e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0046b8 f3518f;

    /* JADX INFO: renamed from: g */
    public final Object f3519g;

    /* JADX INFO: renamed from: h */
    public final long f3520h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0435ll(C0478ml c0478ml, q91 q91Var, Object obj, AbstractC0046b8 abstractC0046b8) {
        C0948y2 c0948y2 = new C0948y2(c0478ml.f4003a);
        this.f3513a = c0948y2;
        this.f3514b = q91Var;
        this.f3515c = obj;
        AbstractC0046b8 abstractC0046b82 = (AbstractC0046b8) q91Var.f5089a.invoke(obj);
        this.f3516d = abstractC0046b82;
        this.f3517e = AbstractC0307i4.m1537m(abstractC0046b8);
        this.f3519g = q91Var.f5090b.invoke(c0948y2.m5206j(abstractC0046b82, abstractC0046b8));
        if (((AbstractC0046b8) c0948y2.f7493f) == null) {
            c0948y2.f7493f = abstractC0046b82.mo28c();
        }
        AbstractC0046b8 abstractC0046b83 = (AbstractC0046b8) c0948y2.f7493f;
        if (abstractC0046b83 == null) {
            p30.m2986V("velocityVector");
            throw null;
        }
        int iMo27b = abstractC0046b83.mo27b();
        long jMax = 0;
        for (int i = 0; i < iMo27b; i++) {
            C0910x1 c0910x1 = (C0910x1) c0948y2.f7491d;
            abstractC0046b82.getClass();
            jMax = Math.max(jMax, ((long) (Math.exp(((C0031au) c0910x1.f7232e).m210b(abstractC0046b8.mo26a(i)) / (((double) AbstractC0068bu.f588a) - 1.0d)) * 1000.0d)) * 1000000);
        }
        this.f3520h = jMax;
        AbstractC0046b8 abstractC0046b8M1537m = AbstractC0307i4.m1537m(this.f3513a.m5207k(jMax, this.f3516d, abstractC0046b8));
        this.f3518f = abstractC0046b8M1537m;
        int iMo27b2 = abstractC0046b8M1537m.mo27b();
        for (int i2 = 0; i2 < iMo27b2; i2++) {
            AbstractC0046b8 abstractC0046b84 = this.f3518f;
            float fMo26a = abstractC0046b84.mo26a(i2);
            this.f3513a.getClass();
            this.f3513a.getClass();
            abstractC0046b84.mo30e(w60.m4906m(fMo26a, -0.0f, 0.0f), i2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: a */
    public final boolean mo2023a() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: b */
    public final Object mo2024b(long j) {
        if (m3207g(j)) {
            return this.f3519g;
        }
        InterfaceC0742sw interfaceC0742sw = this.f3514b.f5090b;
        C0948y2 c0948y2 = this.f3513a;
        AbstractC0046b8 abstractC0046b8 = (AbstractC0046b8) c0948y2.f7492e;
        AbstractC0046b8 abstractC0046b82 = this.f3516d;
        if (abstractC0046b8 == null) {
            c0948y2.f7492e = abstractC0046b82.mo28c();
        }
        AbstractC0046b8 abstractC0046b83 = (AbstractC0046b8) c0948y2.f7492e;
        if (abstractC0046b83 == null) {
            p30.m2986V("valueVector");
            throw null;
        }
        int iMo27b = abstractC0046b83.mo27b();
        int i = 0;
        while (true) {
            AbstractC0046b8 abstractC0046b84 = (AbstractC0046b8) c0948y2.f7492e;
            if (i >= iMo27b) {
                if (abstractC0046b84 != null) {
                    return interfaceC0742sw.invoke(abstractC0046b84);
                }
                p30.m2986V("valueVector");
                throw null;
            }
            if (abstractC0046b84 == null) {
                p30.m2986V("valueVector");
                throw null;
            }
            C0910x1 c0910x1 = (C0910x1) c0948y2.f7491d;
            float fMo26a = abstractC0046b82.mo26a(i);
            long j2 = j / 1000000;
            C1016zt c1016ztM209a = ((C0031au) c0910x1.f7232e).m209a(this.f3517e.mo26a(i));
            long j3 = c1016ztM209a.f7994c;
            abstractC0046b84.mo30e((Math.signum(c1016ztM209a.f7992a) * c1016ztM209a.f7993b * AbstractC0538o5.m2787a(j3 > 0 ? j2 / j3 : 1.0f).f4179a) + fMo26a, i);
            i++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: c */
    public final long mo2025c() {
        return this.f3520h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: d */
    public final q91 mo2026d() {
        return this.f3514b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: e */
    public final Object mo2027e() {
        return this.f3519g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0642q7
    /* JADX INFO: renamed from: f */
    public final AbstractC0046b8 mo2028f(long j) {
        if (m3207g(j)) {
            return this.f3518f;
        }
        return this.f3513a.m5207k(j, this.f3516d, this.f3517e);
    }
}
