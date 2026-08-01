package p163l;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l.o0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4338o0 implements InterfaceC4317k {

    /* JADX INFO: renamed from: d */
    public static final int f12687d = 8;

    /* JADX INFO: renamed from: a */
    public final InterfaceC4283d0 f12688a;

    /* JADX INFO: renamed from: b */
    public final EnumC4299g1 f12689b;

    /* JADX INFO: renamed from: c */
    public final long f12690c;

    public C4338o0(InterfaceC4283d0 interfaceC4283d0, EnumC4299g1 enumC4299g1, long j10) {
        this.f12688a = interfaceC4283d0;
        this.f12689b = enumC4299g1;
        this.f12690c = j10;
    }

    @Override // p163l.InterfaceC4317k
    /* JADX INFO: renamed from: a */
    public InterfaceC4341o3 mo16829a(InterfaceC4365t2 interfaceC4365t2) {
        return new C4376v3(this.f12688a.mo16829a(interfaceC4365t2), this.f12689b, this.f12690c, null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C4338o0) {
            C4338o0 c4338o0 = (C4338o0) obj;
            if (AbstractC1061t.m3842c(c4338o0.f12688a, this.f12688a) && c4338o0.f12689b == this.f12689b && AbstractC4339o1.m17042d(c4338o0.f12690c, this.f12690c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f12688a.hashCode() * 31) + this.f12689b.hashCode()) * 31) + AbstractC4339o1.m17043e(this.f12690c);
    }

    public /* synthetic */ C4338o0(InterfaceC4283d0 interfaceC4283d0, EnumC4299g1 enumC4299g1, long j10, AbstractC1043k abstractC1043k) {
        this(interfaceC4283d0, enumC4299g1, j10);
    }
}
