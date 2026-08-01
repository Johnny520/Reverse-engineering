package ad;

import p010a9.InterfaceC0188p;
import p024b9.C1055q;
import p329wc.InterfaceC9218f;
import p361yc.C9687e0;

/* JADX INFO: renamed from: ad.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0300z {

    /* JADX INFO: renamed from: a */
    public final C9687e0 f725a;

    /* JADX INFO: renamed from: b */
    public boolean f726b;

    /* JADX INFO: renamed from: ad.z$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a extends C1055q implements InterfaceC0188p {
        public a(Object obj) {
            super(2, obj, C0300z.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        @Override // p010a9.InterfaceC0188p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return m878y((InterfaceC9218f) obj, ((Number) obj2).intValue());
        }

        /* JADX INFO: renamed from: y */
        public final Boolean m878y(InterfaceC9218f interfaceC9218f, int i10) {
            interfaceC9218f.getClass();
            return Boolean.valueOf(((C0300z) this.f3190r).m877e(interfaceC9218f, i10));
        }
    }

    public C0300z(InterfaceC9218f interfaceC9218f) {
        interfaceC9218f.getClass();
        this.f725a = new C9687e0(interfaceC9218f, new a(this));
    }

    /* JADX INFO: renamed from: b */
    public final boolean m874b() {
        return this.f726b;
    }

    /* JADX INFO: renamed from: c */
    public final void m875c(int i10) {
        this.f725a.m37866a(i10);
    }

    /* JADX INFO: renamed from: d */
    public final int m876d() {
        return this.f725a.m37869d();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m877e(InterfaceC9218f interfaceC9218f, int i10) {
        boolean z10 = !interfaceC9218f.mo35895i(i10) && interfaceC9218f.mo35894h(i10).mo35889c();
        this.f726b = z10;
        return z10;
    }
}
