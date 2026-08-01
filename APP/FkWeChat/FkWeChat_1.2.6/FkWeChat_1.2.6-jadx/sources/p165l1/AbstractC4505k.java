package p165l1;

import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1064u0;
import p024b9.AbstractC1067w;
import p165l1.InterfaceC4507m;
import p179m2.AbstractC4836e2;

/* JADX INFO: renamed from: l1.k */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4505k {

    /* JADX INFO: renamed from: l1.k$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public static final a f13074r = new a();

        public a() {
            super(1);
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean mo27m(InterfaceC4507m.b bVar) {
            return Boolean.valueOf(!(bVar instanceof C4504j));
        }
    }

    /* JADX INFO: renamed from: l1.k$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0188p {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC0572r f13075r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0572r interfaceC0572r) {
            super(2);
            this.f13075r = interfaceC0572r;
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC4507m invoke(InterfaceC4507m interfaceC4507m, InterfaceC4507m.b bVar) {
            boolean z10 = bVar instanceof C4504j;
            InterfaceC4507m interfaceC4507mM17438d = bVar;
            if (z10) {
                InterfaceC0189q interfaceC0189qM17434j = ((C4504j) bVar).m17434j();
                interfaceC0189qM17434j.getClass();
                interfaceC4507mM17438d = AbstractC4505k.m17438d(this.f13075r, (InterfaceC4507m) ((InterfaceC0189q) AbstractC1064u0.m3858f(interfaceC0189qM17434j, 3)).mo236e(InterfaceC4507m.f13080a, this.f13075r, 0));
            }
            return interfaceC4507m.mo17445i(interfaceC4507mM17438d);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC4507m m17436b(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l, InterfaceC0189q interfaceC0189q) {
        return interfaceC4507m.mo17445i(new C4504j(interfaceC0184l, interfaceC0189q));
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ InterfaceC4507m m17437c(InterfaceC4507m interfaceC4507m, InterfaceC0184l interfaceC0184l, InterfaceC0189q interfaceC0189q, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            interfaceC0184l = AbstractC4836e2.m19333a();
        }
        return m17436b(interfaceC4507m, interfaceC0184l, interfaceC0189q);
    }

    /* JADX INFO: renamed from: d */
    public static final InterfaceC4507m m17438d(InterfaceC0572r interfaceC0572r, InterfaceC4507m interfaceC4507m) {
        if (interfaceC4507m.mo17430b(a.f13074r)) {
            return interfaceC4507m;
        }
        interfaceC0572r.mo2169e(1219399079);
        InterfaceC4507m interfaceC4507m2 = (InterfaceC4507m) interfaceC4507m.mo17429a(InterfaceC4507m.f13080a, new b(interfaceC0572r));
        interfaceC0572r.mo2158Q();
        return interfaceC4507m2;
    }

    /* JADX INFO: renamed from: e */
    public static final InterfaceC4507m m17439e(InterfaceC0572r interfaceC0572r, InterfaceC4507m interfaceC4507m) {
        interfaceC0572r.mo2163V(439770924);
        InterfaceC4507m interfaceC4507mM17438d = m17438d(interfaceC0572r, interfaceC4507m);
        interfaceC0572r.mo2152K();
        return interfaceC4507mM17438d;
    }
}
