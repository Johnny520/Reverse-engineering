package p000;

/* JADX INFO: renamed from: Ka */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0447Ka implements InterfaceC0889Un {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1464a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f1465b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f1466c;

    public /* synthetic */ C0447Ka(int i, Object obj, Object obj2) {
        this.f1464a = i;
        this.f1465b = obj;
        this.f1466c = obj2;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
        switch (this.f1464a) {
            case 0:
                C2335ot c2335ot = (C2335ot) this.f1465b;
                AbstractActivityC0833Ta abstractActivityC0833Ta = (AbstractActivityC0833Ta) this.f1466c;
                if (enumC0632On == EnumC0632On.ON_CREATE) {
                    c2335ot.f8207e = AbstractC0988X.m1875a(abstractActivityC0833Ta);
                    c2335ot.m4743c(c2335ot.f8209g);
                }
                break;
            default:
                C2656w4 c2656w4 = (C2656w4) this.f1465b;
                InterfaceC0206Er interfaceC0206Er = (InterfaceC0206Er) this.f1466c;
                if (enumC0632On != EnumC0632On.ON_DESTROY) {
                    c2656w4.getClass();
                } else {
                    c2656w4.m5196F(interfaceC0206Er);
                }
                break;
        }
    }
}
