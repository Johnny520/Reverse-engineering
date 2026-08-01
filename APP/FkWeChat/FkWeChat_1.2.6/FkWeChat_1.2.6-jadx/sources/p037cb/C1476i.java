package p037cb;

import la.AbstractC4721a;
import la.InterfaceC4724d;
import p024b9.AbstractC1061t;
import p143ja.C3770c;
import p229p9.InterfaceC6003g1;

/* JADX INFO: renamed from: cb.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1476i {

    /* JADX INFO: renamed from: a */
    public final InterfaceC4724d f4352a;

    /* JADX INFO: renamed from: b */
    public final C3770c f4353b;

    /* JADX INFO: renamed from: c */
    public final AbstractC4721a f4354c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC6003g1 f4355d;

    public C1476i(InterfaceC4724d interfaceC4724d, C3770c c3770c, AbstractC4721a abstractC4721a, InterfaceC6003g1 interfaceC6003g1) {
        interfaceC4724d.getClass();
        c3770c.getClass();
        abstractC4721a.getClass();
        interfaceC6003g1.getClass();
        this.f4352a = interfaceC4724d;
        this.f4353b = c3770c;
        this.f4354c = abstractC4721a;
        this.f4355d = interfaceC6003g1;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC4724d m5775a() {
        return this.f4352a;
    }

    /* JADX INFO: renamed from: b */
    public final C3770c m5776b() {
        return this.f4353b;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC4721a m5777c() {
        return this.f4354c;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC6003g1 m5778d() {
        return this.f4355d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1476i)) {
            return false;
        }
        C1476i c1476i = (C1476i) obj;
        return AbstractC1061t.m3842c(this.f4352a, c1476i.f4352a) && AbstractC1061t.m3842c(this.f4353b, c1476i.f4353b) && AbstractC1061t.m3842c(this.f4354c, c1476i.f4354c) && AbstractC1061t.m3842c(this.f4355d, c1476i.f4355d);
    }

    public int hashCode() {
        return (((((this.f4352a.hashCode() * 31) + this.f4353b.hashCode()) * 31) + this.f4354c.hashCode()) * 31) + this.f4355d.hashCode();
    }

    public String toString() {
        return "ClassData(nameResolver=" + this.f4352a + ", classProto=" + this.f4353b + ", metadataVersion=" + this.f4354c + ", sourceElement=" + this.f4355d + ')';
    }
}
