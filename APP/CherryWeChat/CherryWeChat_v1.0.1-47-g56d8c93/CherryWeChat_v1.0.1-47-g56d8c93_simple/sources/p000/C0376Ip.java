package p000;

/* JADX INFO: renamed from: Ip */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0376Ip implements InterfaceC1416fj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1306a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0762Rp f1307b;

    public /* synthetic */ C0376Ip(C0762Rp r1, int r2) {
        this.f1306a = r2;
        this.f1307b = r1;
    }

    @Override // p000.InterfaceC1416fj
    /* JADX INFO: renamed from: g */
    public final Object mo90g(Object r5) {
        final String r52 = (String) r5;
        switch(this.f1306a) {
            case 0: goto L7;
            default: goto L4;
        };
    L4:
        AbstractC0295Gu.m625r(-483716396742709L);
        final C0762Rp r0 = this.f1307b;
        final int r3 = 1;
        r0.f2416h.post(new RunnableC0548Mp(r0, r52, r3));
    L6:
        return C0829TC.f2620a;
    L7:
        AbstractC0295Gu.m625r(-483544598050869L);
        final C0762Rp r02 = this.f1307b;
        final int r32 = 0;
        r02.f2416h.post(new RunnableC0548Mp(r02, r52, r32));
        goto L6
    }
}
