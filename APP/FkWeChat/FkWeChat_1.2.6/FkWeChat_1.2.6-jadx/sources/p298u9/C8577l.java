package p298u9;

import p066ea.InterfaceC2058a;
import p066ea.InterfaceC2059b;
import p081fa.InterfaceC2384l;
import p229p9.InterfaceC6006h1;
import p313v9.AbstractC8883u;

/* JADX INFO: renamed from: u9.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8577l implements InterfaceC2059b {

    /* JADX INFO: renamed from: a */
    public static final C8577l f28620a = new C8577l();

    /* JADX INFO: renamed from: u9.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC2058a {

        /* JADX INFO: renamed from: b */
        public final AbstractC8883u f28621b;

        public a(AbstractC8883u abstractC8883u) {
            abstractC8883u.getClass();
            this.f28621b = abstractC8883u;
        }

        @Override // p229p9.InterfaceC6003g1
        /* JADX INFO: renamed from: a */
        public InterfaceC6006h1 mo10689a() {
            InterfaceC6006h1 interfaceC6006h1 = InterfaceC6006h1.f18959a;
            interfaceC6006h1.getClass();
            return interfaceC6006h1;
        }

        @Override // p066ea.InterfaceC2058a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public AbstractC8883u mo7412b() {
            return this.f28621b;
        }

        public String toString() {
            return a.class.getName() + ": " + mo7412b();
        }
    }

    @Override // p066ea.InterfaceC2059b
    /* JADX INFO: renamed from: a */
    public InterfaceC2058a mo7413a(InterfaceC2384l interfaceC2384l) {
        interfaceC2384l.getClass();
        return new a((AbstractC8883u) interfaceC2384l);
    }
}
