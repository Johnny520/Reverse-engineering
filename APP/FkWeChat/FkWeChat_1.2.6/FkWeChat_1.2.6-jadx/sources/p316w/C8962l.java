package p316w;

import androidx.compose.foundation.lazy.layout.AbstractC0413q;
import androidx.compose.foundation.lazy.layout.C0433w1;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p010a9.InterfaceC0190r;
import p024b9.AbstractC1043k;
import p117i.AbstractC3071m;
import p117i.AbstractC3073n;
import p117i.C3055g0;

/* JADX INFO: renamed from: w.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8962l extends AbstractC0413q implements InterfaceC8975r0 {

    /* JADX INFO: renamed from: e */
    public static final a f29726e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final int f29727f = 8;

    /* JADX INFO: renamed from: g */
    public static final InterfaceC0188p f29728g = new InterfaceC0188p() { // from class: w.k
        @Override // p010a9.InterfaceC0188p
        public final Object invoke(Object obj, Object obj2) {
            return C8962l.m34415k((InterfaceC8982v) obj, ((Integer) obj2).intValue());
        }
    };

    /* JADX INFO: renamed from: a */
    public final C8987x0 f29729a = new C8987x0(this);

    /* JADX INFO: renamed from: b */
    public final C0433w1 f29730b = new C0433w1();

    /* JADX INFO: renamed from: c */
    public boolean f29731c;

    /* JADX INFO: renamed from: d */
    public C3055g0 f29732d;

    public C8962l(InterfaceC0184l interfaceC0184l) {
        interfaceC0184l.mo27m(this);
    }

    /* JADX INFO: renamed from: k */
    public static C8937c m34415k(InterfaceC8982v interfaceC8982v, int i10) {
        return C8937c.m34315a(AbstractC8983v0.m34456a(1));
    }

    @Override // p316w.InterfaceC8975r0
    /* JADX INFO: renamed from: d */
    public void mo34416d(int i10, InterfaceC0184l interfaceC0184l, InterfaceC0188p interfaceC0188p, InterfaceC0184l interfaceC0184l2, InterfaceC0190r interfaceC0190r) {
        mo1319h().m1443c(i10, new C8958j(interfaceC0184l, interfaceC0188p == null ? f29728g : interfaceC0188p, interfaceC0184l2, interfaceC0190r));
        if (interfaceC0188p != null) {
            this.f29731c = true;
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m34417l() {
        return this.f29731c;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC3071m m34418m() {
        C3055g0 c3055g0 = this.f29732d;
        return c3055g0 != null ? c3055g0 : AbstractC3073n.m11431a();
    }

    @Override // androidx.compose.foundation.lazy.layout.AbstractC0413q
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public C0433w1 mo1319h() {
        return this.f29730b;
    }

    /* JADX INFO: renamed from: o */
    public final C8987x0 m34420o() {
        return this.f29729a;
    }

    /* JADX INFO: renamed from: w.l$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
