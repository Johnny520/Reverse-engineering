package p189n;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0506h3;
import androidx.compose.runtime.AbstractC0552o0;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0189q;
import p024b9.AbstractC1067w;
import p055e.AbstractC1960a;
import p165l1.AbstractC4505k;
import p165l1.InterfaceC4507m;
import p172l8.C4700i0;
import p179m2.AbstractC4836e2;
import p179m2.AbstractC4846g2;
import p248r.InterfaceC6432h;

/* JADX INFO: renamed from: n.o1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5259o1 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0506h3 f16171a = AbstractC0552o0.m1978f(null, new InterfaceC0173a() { // from class: n.n1
        @Override // p010a9.InterfaceC0173a
        public final Object invoke() {
            return AbstractC5259o1.m21506a();
        }
    }, 1, null);

    /* JADX INFO: renamed from: n.o1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC1067w implements InterfaceC0184l {

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC6432h f16172r;

        /* JADX INFO: renamed from: s */
        public final /* synthetic */ InterfaceC5244l1 f16173s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC6432h interfaceC6432h, InterfaceC5244l1 interfaceC5244l1) {
            super(1);
            this.f16172r = interfaceC6432h;
            this.f16173s = interfaceC5244l1;
        }

        /* JADX INFO: renamed from: a */
        public final void m21509a(AbstractC4846g2 abstractC4846g2) {
            throw null;
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            AbstractC1960a.m7104a(obj);
            m21509a(null);
            return C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: n.o1$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0189q {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC5244l1 f16174q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC6432h f16175r;

        public b(InterfaceC5244l1 interfaceC5244l1, InterfaceC6432h interfaceC6432h) {
            this.f16174q = interfaceC5244l1;
            this.f16175r = interfaceC6432h;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC4507m m21510a(InterfaceC4507m interfaceC4507m, InterfaceC0572r interfaceC0572r, int i10) {
            interfaceC0572r.mo2163V(-353972293);
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1559m(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
            }
            InterfaceC5249m1 interfaceC5249m1M21479b = this.f16174q.m21479b(this.f16175r, interfaceC0572r, 0);
            boolean zMo2162U = interfaceC0572r.mo2162U(interfaceC5249m1M21479b);
            Object objMo2170f = interfaceC0572r.mo2170f();
            if (zMo2162U || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                objMo2170f = new C5264p1(interfaceC5249m1M21479b);
                interfaceC0572r.mo2153L(objMo2170f);
            }
            C5264p1 c5264p1 = (C5264p1) objMo2170f;
            if (AbstractC0468c0.m1556j()) {
                AbstractC0468c0.m1558l();
            }
            interfaceC0572r.mo2152K();
            return c5264p1;
        }

        @Override // p010a9.InterfaceC0189q
        /* JADX INFO: renamed from: e */
        public /* bridge */ /* synthetic */ Object mo236e(Object obj, Object obj2, Object obj3) {
            return m21510a((InterfaceC4507m) obj, (InterfaceC0572r) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC5244l1 m21506a() {
        return C5273r0.f16195a;
    }

    /* JADX INFO: renamed from: b */
    public static final AbstractC0506h3 m21507b() {
        return f16171a;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC4507m m21508c(InterfaceC4507m interfaceC4507m, InterfaceC6432h interfaceC6432h, InterfaceC5244l1 interfaceC5244l1) {
        if (interfaceC5244l1 == null) {
            return interfaceC4507m;
        }
        if (interfaceC5244l1 instanceof InterfaceC5279s1) {
            return interfaceC4507m.mo17445i(new C5269q1(interfaceC6432h, (InterfaceC5279s1) interfaceC5244l1));
        }
        return AbstractC4505k.m17436b(interfaceC4507m, AbstractC4836e2.m19334b() ? new a(interfaceC6432h, interfaceC5244l1) : AbstractC4836e2.m19333a(), new b(interfaceC5244l1, interfaceC6432h));
    }
}
