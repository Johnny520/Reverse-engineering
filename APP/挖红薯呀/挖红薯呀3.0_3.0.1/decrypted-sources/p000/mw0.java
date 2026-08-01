package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class mw0 extends AbstractC0358jk implements InterfaceC0331iu {

    /* JADX INFO: renamed from: g */
    public final InterfaceC0331iu f4053g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC0618pk f4054h;

    /* JADX INFO: renamed from: i */
    public final int f4055i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0618pk f4056j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0322ik f4057k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mw0(InterfaceC0331iu interfaceC0331iu, InterfaceC0618pk interfaceC0618pk) {
        super(C0651qg.f5142f, C0220fs.f1799d);
        this.f4053g = interfaceC0331iu;
        this.f4054h = interfaceC0618pk;
        this.f4055i = ((Number) interfaceC0618pk.mo65p(new C0717s8(16), 0)).intValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9, p000.InterfaceC0022al
    /* JADX INFO: renamed from: d */
    public final InterfaceC0022al mo180d() {
        InterfaceC0322ik interfaceC0322ik = this.f4057k;
        if (interfaceC0322ik instanceof InterfaceC0022al) {
            return (InterfaceC0022al) interfaceC0322ik;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0358jk, p000.InterfaceC0322ik
    /* JADX INFO: renamed from: e */
    public final InterfaceC0618pk mo540e() {
        InterfaceC0618pk interfaceC0618pk = this.f4056j;
        return interfaceC0618pk == null ? C0220fs.f1799d : interfaceC0618pk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0331iu
    /* JADX INFO: renamed from: f */
    public final Object mo827f(Object obj, InterfaceC0322ik interfaceC0322ik) {
        try {
            Object objM2605p = m2605p(interfaceC0322ik, obj);
            return objM2605p == EnumC1007zk.f7916d ? objM2605p : na1.f4229a;
        } catch (Throwable th) {
            this.f4056j = new C0482mp(interfaceC0322ik.mo540e(), th);
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: l */
    public final StackTraceElement mo2604l() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        Throwable thM604a = cv0.m604a(obj);
        if (thM604a != null) {
            this.f4056j = new C0482mp(mo540e(), thM604a);
        }
        InterfaceC0322ik interfaceC0322ik = this.f4057k;
        if (interfaceC0322ik != null) {
            interfaceC0322ik.mo541i(obj);
        }
        return EnumC1007zk.f7916d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final Object m2605p(InterfaceC0322ik interfaceC0322ik, Object obj) {
        InterfaceC0618pk interfaceC0618pkMo540e = interfaceC0322ik.mo540e();
        pf1.m3060t(interfaceC0618pkMo540e);
        InterfaceC0618pk interfaceC0618pk = this.f4056j;
        if (interfaceC0618pk != interfaceC0618pkMo540e) {
            if (interfaceC0618pk instanceof C0482mp) {
                throw new IllegalStateException(l41.m1976P("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((C0482mp) interfaceC0618pk).f4015e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((Number) interfaceC0618pkMo540e.mo65p(new C0956ya(6, this), 0)).intValue() != this.f4055i) {
                throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f4054h + ",\n\t\tbut emission happened in " + interfaceC0618pkMo540e + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f4056j = interfaceC0618pkMo540e;
        }
        this.f4057k = interfaceC0322ik;
        InterfaceC0941xw interfaceC0941xw = ow0.f4669a;
        InterfaceC0331iu interfaceC0331iu = this.f4053g;
        interfaceC0331iu.getClass();
        Object objMo353a = interfaceC0941xw.mo353a(interfaceC0331iu, obj, this);
        if (!p30.m3002l(objMo353a, EnumC1007zk.f7916d)) {
            this.f4057k = null;
        }
        return objMo353a;
    }
}
