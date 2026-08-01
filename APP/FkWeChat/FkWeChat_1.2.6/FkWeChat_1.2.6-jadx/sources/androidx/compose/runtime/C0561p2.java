package androidx.compose.runtime;

import androidx.compose.runtime.C0561p2;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p057e1.AbstractC1972b;
import p057e1.C1974c;
import p057e1.C1977e;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.runtime.p2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0561p2 {

    /* JADX INFO: renamed from: a */
    public final C1974c f1554a = AbstractC1972b.m7131b(false);

    /* JADX INFO: renamed from: b */
    public final C1977e f1555b = new C1977e();

    /* JADX INFO: renamed from: c */
    public final InterfaceC0173a f1556c;

    public C0561p2(final InterfaceC0173a interfaceC0173a) {
        this.f1556c = new InterfaceC0173a() { // from class: androidx.compose.runtime.o2
            @Override // p010a9.InterfaceC0173a
            public final Object invoke() {
                return C0561p2.m2129a(this.f1518q, interfaceC0173a);
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m2129a(C0561p2 c0561p2, InterfaceC0173a interfaceC0173a) {
        if (!AbstractC1972b.m7132c(c0561p2.f1554a)) {
            interfaceC0173a.invoke();
        }
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: b */
    public static C4700i0 m2130b(a aVar) {
        aVar.m2134c();
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m2131c() {
        return this.f1555b.m7147e();
    }

    /* JADX INFO: renamed from: d */
    public final void m2132d() {
        AbstractC1972b.m7134e(this.f1554a, false);
        this.f1555b.m7146d(new InterfaceC0184l() { // from class: androidx.compose.runtime.n2
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C0561p2.m2130b((C0561p2.a) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC0502h m2133e(InterfaceC0173a interfaceC0173a) {
        return this.f1555b.m7144b(new a(interfaceC0173a), this.f1556c);
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.p2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends C1977e.a {

        /* JADX INFO: renamed from: a */
        public InterfaceC0173a f1557a;

        public a(InterfaceC0173a interfaceC0173a) {
            this.f1557a = interfaceC0173a;
        }

        @Override // p057e1.C1977e.a
        /* JADX INFO: renamed from: a */
        public void mo1656a() {
            this.f1557a = null;
        }

        /* JADX INFO: renamed from: c */
        public final void m2134c() {
            InterfaceC0173a interfaceC0173a = this.f1557a;
            if (interfaceC0173a != null) {
                interfaceC0173a.invoke();
            }
        }

        @Override // p057e1.C1977e.a
        /* JADX INFO: renamed from: b */
        public void mo1657b(Throwable th) throws Throwable {
            throw th;
        }
    }
}
