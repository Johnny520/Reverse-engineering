package p189n;

import p010a9.InterfaceC0184l;
import p024b9.AbstractC1067w;
import p055e.AbstractC1960a;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p179m2.AbstractC4836e2;
import p179m2.AbstractC4846g2;
import p265s1.AbstractC7055b3;
import p265s1.AbstractC7078g1;
import p265s1.InterfaceC7090i3;

/* JADX INFO: renamed from: n.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5227i {

    /* JADX INFO: renamed from: n.i$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ float f16061r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ AbstractC7078g1 f16062s;

        /* JADX INFO: renamed from: t */
        public final /* synthetic */ InterfaceC7090i3 f16063t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f10, AbstractC7078g1 abstractC7078g1, InterfaceC7090i3 interfaceC7090i3) {
            super(1);
            this.f16061r = f10;
            this.f16062s = abstractC7078g1;
            this.f16063t = interfaceC7090i3;
        }

        /* JADX INFO: renamed from: a */
        public final void m21430a(AbstractC4846g2 abstractC4846g2) {
            throw null;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            AbstractC1960a.m7104a(obj);
            m21430a(null);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: n.i$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ long f16064r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC7090i3 f16065s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, InterfaceC7090i3 interfaceC7090i3) {
            super(1);
            this.f16064r = j10;
            this.f16065s = interfaceC7090i3;
        }

        /* JADX INFO: renamed from: a */
        public final void m21431a(AbstractC4846g2 abstractC4846g2) {
            throw null;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            AbstractC1960a.m7104a(obj);
            m21431a(null);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC4507m m21426a(InterfaceC4507m interfaceC4507m, AbstractC7078g1 abstractC7078g1, InterfaceC7090i3 interfaceC7090i3, float f10) {
        return interfaceC4507m.mo17445i(new C5222h(0L, abstractC7078g1, f10, interfaceC7090i3, AbstractC4836e2.m19334b() ? new a(f10, abstractC7078g1, interfaceC7090i3) : AbstractC4836e2.m19333a(), 1, null));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ InterfaceC4507m m21427b(InterfaceC4507m interfaceC4507m, AbstractC7078g1 abstractC7078g1, InterfaceC7090i3 interfaceC7090i3, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC7090i3 = AbstractC7055b3.m27770a();
        }
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return m21426a(interfaceC4507m, abstractC7078g1, interfaceC7090i3, f10);
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4507m m21428c(InterfaceC4507m interfaceC4507m, long j10, InterfaceC7090i3 interfaceC7090i3) {
        return interfaceC4507m.mo17445i(new C5222h(j10, null, 1.0f, interfaceC7090i3, AbstractC4836e2.m19334b() ? new b(j10, interfaceC7090i3) : AbstractC4836e2.m19333a(), 2, null));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC4507m m21429d(InterfaceC4507m interfaceC4507m, long j10, InterfaceC7090i3 interfaceC7090i3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            interfaceC7090i3 = AbstractC7055b3.m27770a();
        }
        return m21428c(interfaceC4507m, j10, interfaceC7090i3);
    }
}
