package p274t;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p055e.AbstractC1960a;
import p165l1.InterfaceC4499e;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p179m2.AbstractC4836e2;
import p179m2.AbstractC4846g2;

/* JADX INFO: renamed from: t.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7899t implements InterfaceC7894s {

    /* JADX INFO: renamed from: a */
    public static final C7899t f26336a = new C7899t();

    /* JADX INFO: renamed from: t.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC4499e f26337r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4499e interfaceC4499e) {
            super(1);
            this.f26337r = interfaceC4499e;
        }

        /* JADX INFO: renamed from: a */
        public final void m30515a(AbstractC4846g2 abstractC4846g2) {
            throw null;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            AbstractC1960a.m7104a(obj);
            m30515a(null);
            return C4700i0.f13910a;
        }
    }

    @Override // p274t.InterfaceC7894s
    /* JADX INFO: renamed from: b */
    public InterfaceC4507m mo30487b(InterfaceC4507m interfaceC4507m, InterfaceC4499e interfaceC4499e) {
        return interfaceC4507m.mo17445i(new C7849j(interfaceC4499e, false, AbstractC4836e2.m19334b() ? new a(interfaceC4499e) : AbstractC4836e2.m19333a()));
    }
}
