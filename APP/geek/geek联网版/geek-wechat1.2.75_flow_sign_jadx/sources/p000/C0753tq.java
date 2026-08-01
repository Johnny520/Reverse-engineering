package p000;

/* JADX INFO: renamed from: tq */
/* JADX INFO: loaded from: classes.dex */
public final class C0753tq {

    /* JADX INFO: renamed from: a */
    public EnumC0531nq f4571a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0642qq f4572b;

    /* JADX INFO: renamed from: a */
    public final void m2420a(InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq) {
        EnumC0531nq enumC0531nqM1879a = enumC0494mq.m1879a();
        EnumC0531nq enumC0531nq = this.f4571a;
        AbstractC0493mp.m1857g("state1", enumC0531nq);
        if (enumC0531nqM1879a.compareTo(enumC0531nq) < 0) {
            enumC0531nq = enumC0531nqM1879a;
        }
        this.f4571a = enumC0531nq;
        this.f4572b.mo109b(interfaceC0716sq, enumC0494mq);
        this.f4571a = enumC0531nqM1879a;
    }
}
