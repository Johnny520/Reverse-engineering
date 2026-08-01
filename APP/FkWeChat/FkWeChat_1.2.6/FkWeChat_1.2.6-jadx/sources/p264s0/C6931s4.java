package p264s0;

import p024b9.AbstractC1043k;
import p121i3.C3182l;
import p121i3.EnumC3191u;
import p121i3.InterfaceC3175e;
import p265s1.AbstractC7124p2;
import p265s1.AbstractC7147u0;
import p265s1.InterfaceC7090i3;
import p265s1.InterfaceC7144t2;

/* JADX INFO: renamed from: s0.s4 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6931s4 implements InterfaceC7090i3 {

    /* JADX INFO: renamed from: a */
    public final long f22739a;

    public C6931s4(long j10) {
        this.f22739a = j10;
    }

    @Override // p265s1.InterfaceC7090i3
    /* JADX INFO: renamed from: a */
    public AbstractC7124p2 mo4a(long j10, EnumC3191u enumC3191u, InterfaceC3175e interfaceC3175e) {
        InterfaceC7144t2 interfaceC7144t2M28224a = AbstractC7147u0.m28224a();
        float fMo1233i1 = interfaceC3175e.mo1233i1(C3182l.m12033j(this.f22739a));
        float fMo1233i12 = interfaceC3175e.mo1233i1(C3182l.m12032i(this.f22739a));
        interfaceC7144t2M28224a.mo28180m(0.0f, 0.0f);
        float f10 = 2;
        interfaceC7144t2M28224a.mo28186s(fMo1233i1 / f10, 0.0f);
        interfaceC7144t2M28224a.mo28186s(0.0f, fMo1233i12);
        interfaceC7144t2M28224a.mo28186s((-fMo1233i1) / f10, 0.0f);
        interfaceC7144t2M28224a.close();
        return new AbstractC7124p2.a(interfaceC7144t2M28224a);
    }

    public /* synthetic */ C6931s4(long j10, AbstractC1043k abstractC1043k) {
        this(j10);
    }
}
