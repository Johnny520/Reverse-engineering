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

    public /* synthetic */ C0447Ka(int r1, Object r2, Object r3) {
        this.f1464a = r1;
        this.f1465b = r2;
        this.f1466c = r3;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn r3, EnumC0632On r4) {
        switch(this.f1464a) {
            case 0: goto L9;
            default: goto L4;
        };
    L4:
        C2656w4 r32 = (C2656w4) this.f1465b;
        InterfaceC0206Er r0 = (InterfaceC0206Er) this.f1466c;
        if (r4 != EnumC0632On.ON_DESTROY) goto L7;
        r32.m5196F(r0);
        return;
    L7:
        r32.getClass();
        return;
    L9:
        C2335ot r33 = (C2335ot) this.f1465b;
        AbstractActivityC0833Ta r02 = (AbstractActivityC0833Ta) this.f1466c;
        if (r4 != EnumC0632On.ON_CREATE) goto L14;
        r33.f8207e = AbstractC0988X.m1875a(r02);
        r33.m4743c(r33.f8209g);
        return;
    }
}
