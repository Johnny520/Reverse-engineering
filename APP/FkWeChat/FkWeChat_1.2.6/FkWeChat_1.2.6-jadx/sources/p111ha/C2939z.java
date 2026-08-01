package p111ha;

import p037cb.C1508y;
import p067eb.EnumC2094r;
import p067eb.InterfaceC2096s;
import p229p9.InterfaceC6006h1;

/* JADX INFO: renamed from: ha.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2939z implements InterfaceC2096s {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2937x f7769b;

    /* JADX INFO: renamed from: c */
    public final C1508y f7770c;

    /* JADX INFO: renamed from: d */
    public final boolean f7771d;

    /* JADX INFO: renamed from: e */
    public final EnumC2094r f7772e;

    public C2939z(InterfaceC2937x interfaceC2937x, C1508y c1508y, boolean z10, EnumC2094r enumC2094r) {
        interfaceC2937x.getClass();
        enumC2094r.getClass();
        this.f7769b = interfaceC2937x;
        this.f7770c = c1508y;
        this.f7771d = z10;
        this.f7772e = enumC2094r;
    }

    @Override // p229p9.InterfaceC6003g1
    /* JADX INFO: renamed from: a */
    public InterfaceC6006h1 mo10689a() {
        InterfaceC6006h1 interfaceC6006h1 = InterfaceC6006h1.f18959a;
        interfaceC6006h1.getClass();
        return interfaceC6006h1;
    }

    @Override // p067eb.InterfaceC2096s
    /* JADX INFO: renamed from: c */
    public String mo7514c() {
        return "Class '" + this.f7769b.mo10736h().m22982a().m22994a() + '\'';
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC2937x m10737d() {
        return this.f7769b;
    }

    public String toString() {
        return C2939z.class.getSimpleName() + ": " + this.f7769b;
    }
}
