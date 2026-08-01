package p000;

/* JADX INFO: renamed from: pq */
/* JADX INFO: loaded from: classes.dex */
public final class C0606pq {

    /* JADX INFO: renamed from: a */
    public EnumC0383jq f3921a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0494mq f3922b;

    /* JADX INFO: renamed from: a */
    public final void m2129a(InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq) {
        EnumC0383jq enumC0383jqM1517a = enumC0347iq.m1517a();
        EnumC0383jq enumC0383jq = this.f3921a;
        AbstractC0346ip.m1503o("state1", enumC0383jq);
        if (enumC0383jqM1517a.compareTo(enumC0383jq) < 0) {
            enumC0383jq = enumC0383jqM1517a;
        }
        this.f3921a = enumC0383jq;
        this.f3922b.mo124b(interfaceC0568oq, enumC0347iq);
        this.f3921a = enumC0383jqM1517a;
    }
}
