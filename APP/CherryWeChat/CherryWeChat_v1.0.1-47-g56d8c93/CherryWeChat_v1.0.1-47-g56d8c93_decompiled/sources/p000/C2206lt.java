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

    public C2206lt(C2335ot c2335ot, AbstractC0760Rn abstractC0760Rn, C2461ri c2461ri) {
        this.f7692d = c2335ot;
        this.f7689a = abstractC0760Rn;
        this.f7690b = c2461ri;
        abstractC0760Rn.mo1555a(this);
    }

    @Override // p000.InterfaceC0480L6
    public final void cancel() {
        this.f7689a.mo1556b(this);
        this.f7690b.f8674b.remove(this);
        C2249mt c2249mt = this.f7691c;
        if (c2249mt != null) {
            c2249mt.cancel();
        }
        this.f7691c = null;
    }

    @Override // p000.InterfaceC0889Un
    public final void onStateChanged(InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On) {
        if (enumC0632On == EnumC0632On.ON_START) {
            C2335ot c2335ot = this.f7692d;
            C0134D4 c0134d4 = c2335ot.f8204b;
            C2461ri c2461ri = this.f7690b;
            c0134d4.addLast(c2461ri);
            C2249mt c2249mt = new C2249mt(c2335ot, c2461ri);
            c2461ri.f8674b.add(c2249mt);
            c2335ot.m4744d();
            c2461ri.f8675c = new C2292nt(0, C2335ot.class, c2335ot, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 1);
            this.f7691c = c2249mt;
            return;
        }
        if (enumC0632On != EnumC0632On.ON_STOP) {
            if (enumC0632On == EnumC0632On.ON_DESTROY) {
                cancel();
            }
        } else {
            C2249mt c2249mt2 = this.f7691c;
            if (c2249mt2 != null) {
                c2249mt2.cancel();
            }
        }
    }
}
