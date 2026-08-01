package p274t;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p055e.AbstractC1960a;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p179m2.AbstractC4836e2;
import p179m2.AbstractC4846g2;

/* JADX INFO: renamed from: t.r1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7891r1 {

    /* JADX INFO: renamed from: t.r1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ EnumC7901t1 f26295r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(EnumC7901t1 enumC7901t1) {
            super(1);
            this.f26295r = enumC7901t1;
        }

        /* JADX INFO: renamed from: a */
        public final void m30483a(AbstractC4846g2 abstractC4846g2) {
            throw null;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            AbstractC1960a.m7104a(obj);
            m30483a(null);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: t.r1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ EnumC7901t1 f26296r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EnumC7901t1 enumC7901t1) {
            super(1);
            this.f26296r = enumC7901t1;
        }

        /* JADX INFO: renamed from: a */
        public final void m30484a(AbstractC4846g2 abstractC4846g2) {
            throw null;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            AbstractC1960a.m7104a(obj);
            m30484a(null);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m30481a(InterfaceC4507m interfaceC4507m, EnumC7901t1 enumC7901t1) {
        return interfaceC4507m.mo17445i(new C7881p1(enumC7901t1, true, AbstractC4836e2.m19334b() ? new a(enumC7901t1) : AbstractC4836e2.m19333a()));
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4507m m30482b(InterfaceC4507m interfaceC4507m, EnumC7901t1 enumC7901t1) {
        return interfaceC4507m.mo17445i(new C7916w1(enumC7901t1, true, AbstractC4836e2.m19334b() ? new b(enumC7901t1) : AbstractC4836e2.m19333a()));
    }
}
