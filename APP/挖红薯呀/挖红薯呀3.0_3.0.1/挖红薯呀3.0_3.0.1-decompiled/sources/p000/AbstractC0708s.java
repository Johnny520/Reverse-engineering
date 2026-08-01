package p000;

/* JADX INFO: renamed from: s */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0708s extends j40 implements InterfaceC0322ik, InterfaceC0966yk {

    /* JADX INFO: renamed from: h */
    public final InterfaceC0618pk f5614h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0708s(InterfaceC0618pk interfaceC0618pk, boolean z) {
        super(z);
        m1625Q((c40) interfaceC0618pk.mo64l(C0496n2.f4129I));
        this.f5614h = interfaceC0618pk.mo63h(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: D */
    public final String mo1615D() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: P */
    public final void mo1624P(C0725sg c0725sg) {
        o30.m2780t(this.f5614h, c0725sg);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j40
    /* JADX INFO: renamed from: X */
    public final void mo1630X(Object obj) {
        if (!(obj instanceof C0688rg)) {
            mo3329k0(obj);
        } else {
            C0688rg c0688rg = (C0688rg) obj;
            mo3328j0(c0688rg.f5416a, C0688rg.f5415b.get(c0688rg) != 0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        return this.f5614h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0966yk
    /* JADX INFO: renamed from: f */
    public final InterfaceC0618pk mo1328f() {
        return this.f5614h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0322ik
    /* JADX INFO: renamed from: i */
    public final void mo541i(Object obj) {
        Throwable thM604a = cv0.m604a(obj);
        if (thM604a != null) {
            obj = new C0688rg(thM604a, false);
        }
        Object objM1627T = m1627T(obj);
        if (objM1627T == s91.f5711m) {
            return;
        }
        mo1173z(objM1627T);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l0 */
    public final void m3990l0(EnumC0059bl enumC0059bl, AbstractC0708s abstractC0708s, InterfaceC0904ww interfaceC0904ww) {
        Object objInvoke;
        int iOrdinal = enumC0059bl.ordinal();
        na1 na1Var = na1.f4229a;
        if (iOrdinal == 0) {
            try {
                pf1.m3041S(rd0.m3497z(rd0.m3484m(abstractC0708s, this, interfaceC0904ww)), na1Var);
                return;
            } finally {
                mo541i(new bv0(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                interfaceC0904ww.getClass();
                rd0.m3497z(rd0.m3484m(abstractC0708s, this, interfaceC0904ww)).mo541i(na1Var);
                return;
            }
            if (iOrdinal != 3) {
                C0921xc.m5129j();
                return;
            }
            try {
                InterfaceC0618pk interfaceC0618pk = this.f5614h;
                Object objM4035V = s91.m4035V(interfaceC0618pk, null);
                try {
                    if (interfaceC0904ww instanceof AbstractC0955y9) {
                        s91.m4048m(2, interfaceC0904ww);
                        objInvoke = interfaceC0904ww.invoke(abstractC0708s, this);
                    } else {
                        objInvoke = rd0.m3467Z(interfaceC0904ww, abstractC0708s, this);
                    }
                    s91.m4026M(interfaceC0618pk, objM4035V);
                    if (objInvoke != EnumC1007zk.f7916d) {
                        mo541i(objInvoke);
                    }
                } catch (Throwable th) {
                    s91.m4026M(interfaceC0618pk, objM4035V);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void mo3329k0(Object obj) {
    }

    /* JADX INFO: renamed from: j0 */
    public void mo3328j0(Throwable th, boolean z) {
    }
}
