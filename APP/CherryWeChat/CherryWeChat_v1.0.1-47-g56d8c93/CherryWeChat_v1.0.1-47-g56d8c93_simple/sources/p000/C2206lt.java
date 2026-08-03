package p000;

/* JADX INFO: renamed from: lt */
/* JADX INFO: loaded from: classes.dex */
public final class C2206lt implements InterfaceC0889Un, InterfaceC0480L6 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0760Rn f7689a;

    /* JADX INFO: renamed from: b */
    public final C2461ri f7690b;

    /* JADX INFO: renamed from: c */
    public C2249mt f7691c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2335ot f7692d;

    public C2206lt(C2335ot r1, AbstractC0760Rn r2, C2461ri r3) {
        this.f7692d = r1;
        this.f7689a = r2;
        this.f7690b = r3;
        r2.mo1555a(this);
    }

    @Override // p000.InterfaceC0480L6
    public final void cancel() {
        this.f7689a.mo1556b(this);
        this.f7690b.f8674b.remove(this);
        C2249mt r0 = this.f7691c;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        this.f7691c = null;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn r8, EnumC0632On r9) {
        if (r9 != EnumC0632On.ON_START) goto L7;
        C2335ot r3 = this.f7692d;
        C0134D4 r82 = r3.f8204b;
        C2461ri r92 = this.f7690b;
        r82.addLast(r92);
        C2249mt r83 = new C2249mt(r3, r92);
        r92.f8674b.add(r83);
        r3.m4744d();
        r92.f8675c = new C2292nt(0, C2335ot.class, r3, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 1);
        this.f7691c = r83;
        return;
    L7:
        if (r9 != EnumC0632On.ON_STOP) goto L13;
        C2249mt r84 = this.f7691c;
        if (r84 == null) goto L16;
        r84.cancel();
        return;
    L16:
        return;
    L13:
        if (r9 != EnumC0632On.ON_DESTROY) goto L17;
        cancel();
        return;
    }
}
