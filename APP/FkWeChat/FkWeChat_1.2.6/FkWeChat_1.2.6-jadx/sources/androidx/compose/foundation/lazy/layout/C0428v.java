package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.lazy.layout.C0428v;
import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.C0476d1;
import androidx.compose.runtime.InterfaceC0469c1;
import androidx.compose.runtime.InterfaceC0572r;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p057e1.AbstractC1984l;
import p102h1.InterfaceC2828i;
import p117i.AbstractC3044c1;
import p117i.C3082r0;
import p172l8.C4700i0;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0428v {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2828i f1243a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC0173a f1244b;

    /* JADX INFO: renamed from: c */
    public final C3082r0 f1245c = AbstractC3044c1.m11262b();

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a {

        /* JADX INFO: renamed from: a */
        public final Object f1246a;

        /* JADX INFO: renamed from: b */
        public final Object f1247b;

        /* JADX INFO: renamed from: c */
        public int f1248c;

        /* JADX INFO: renamed from: d */
        public InterfaceC0188p f1249d;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10047a implements InterfaceC0188p {

            /* JADX INFO: renamed from: q */
            public final /* synthetic */ C0428v f1251q;

            /* JADX INFO: renamed from: r */
            public final /* synthetic */ a f1252r;

            /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.v$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
            public static final class C10048a implements InterfaceC0469c1 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ a f1253a;

                public C10048a(a aVar) {
                    this.f1253a = aVar;
                }

                @Override // androidx.compose.runtime.InterfaceC0469c1
                /* JADX INFO: renamed from: a */
                public void mo1209a() {
                    this.f1253a.f1249d = null;
                }
            }

            public C10047a(C0428v c0428v, a aVar) {
                this.f1251q = c0428v;
                this.f1252r = aVar;
            }

            /* JADX INFO: renamed from: a */
            public static InterfaceC0469c1 m1434a(a aVar, C0476d1 c0476d1) {
                return new C10048a(aVar);
            }

            /* JADX INFO: renamed from: c */
            public final void m1435c(InterfaceC0572r interfaceC0572r, int i10) {
                InterfaceC0572r interfaceC0572r2;
                if (!interfaceC0572r.mo2144C((i10 & 3) != 2, i10 & 1)) {
                    interfaceC0572r.mo2190z();
                    return;
                }
                if (AbstractC0468c0.m1556j()) {
                    AbstractC0468c0.m1559m(818252804, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory.CachedItemContent.createContentLambda.<anonymous> (LazyLayoutItemContentFactory.kt:85)");
                }
                InterfaceC0437y interfaceC0437y = (InterfaceC0437y) this.f1251q.m1426d().invoke();
                int iM1432f = this.f1252r.m1432f();
                if ((iM1432f >= interfaceC0437y.mo1451a() || !AbstractC1061t.m3842c(interfaceC0437y.mo1452b(iM1432f), this.f1252r.m1433g())) && (iM1432f = interfaceC0437y.mo1453e(this.f1252r.m1433g())) != -1) {
                    this.f1252r.f1248c = iM1432f;
                }
                int i11 = iM1432f;
                if (i11 != -1) {
                    interfaceC0572r.mo2163V(-1664741271);
                    interfaceC0572r2 = interfaceC0572r;
                    AbstractC0434x.m1447b(interfaceC0437y, AbstractC0397l2.m1274a(this.f1251q.f1243a), i11, AbstractC0397l2.m1274a(this.f1252r.m1433g()), interfaceC0572r2, 0);
                    interfaceC0572r2.mo2152K();
                } else {
                    interfaceC0572r2 = interfaceC0572r;
                    interfaceC0572r2.mo2163V(-1664505826);
                    interfaceC0572r2.mo2152K();
                }
                Object objM1433g = this.f1252r.m1433g();
                boolean zMo2175k = interfaceC0572r2.mo2175k(this.f1252r);
                final a aVar = this.f1252r;
                Object objMo2170f = interfaceC0572r2.mo2170f();
                if (zMo2175k || objMo2170f == InterfaceC0572r.f1573a.m2191a()) {
                    objMo2170f = new InterfaceC0184l() { // from class: androidx.compose.foundation.lazy.layout.u
                        @Override // p010a9.InterfaceC0184l
                        /* JADX INFO: renamed from: m */
                        public final Object mo27m(Object obj) {
                            return C0428v.a.C10047a.m1434a(aVar, (C0476d1) obj);
                        }
                    };
                    interfaceC0572r2.mo2153L(objMo2170f);
                }
                AbstractC0497g1.m1677a(objM1433g, (InterfaceC0184l) objMo2170f, interfaceC0572r2, 0);
                if (AbstractC0468c0.m1556j()) {
                    AbstractC0468c0.m1558l();
                }
            }

            @Override // p010a9.InterfaceC0188p
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                m1435c((InterfaceC0572r) obj, ((Number) obj2).intValue());
                return C4700i0.f13910a;
            }
        }

        public a(int i10, Object obj, Object obj2) {
            this.f1246a = obj;
            this.f1247b = obj2;
            this.f1248c = i10;
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC0188p m1429c() {
            return AbstractC1984l.m7162b(818252804, true, new C10047a(C0428v.this, this));
        }

        /* JADX INFO: renamed from: d */
        public final InterfaceC0188p m1430d() {
            InterfaceC0188p interfaceC0188p = this.f1249d;
            if (interfaceC0188p != null) {
                return interfaceC0188p;
            }
            InterfaceC0188p interfaceC0188pM1429c = m1429c();
            this.f1249d = interfaceC0188pM1429c;
            return interfaceC0188pM1429c;
        }

        /* JADX INFO: renamed from: e */
        public final Object m1431e() {
            return this.f1247b;
        }

        /* JADX INFO: renamed from: f */
        public final int m1432f() {
            return this.f1248c;
        }

        /* JADX INFO: renamed from: g */
        public final Object m1433g() {
            return this.f1246a;
        }
    }

    public C0428v(InterfaceC2828i interfaceC2828i, InterfaceC0173a interfaceC0173a) {
        this.f1243a = interfaceC2828i;
        this.f1244b = interfaceC0173a;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC0188p m1424b(int i10, Object obj, Object obj2) {
        a aVar = (a) this.f1245c.m11238e(obj);
        if (aVar != null && aVar.m1432f() == i10 && AbstractC1061t.m3842c(aVar.m1431e(), obj2)) {
            return aVar.m1430d();
        }
        a aVar2 = new a(i10, obj, obj2);
        this.f1245c.m11529x(obj, aVar2);
        return aVar2.m1430d();
    }

    /* JADX INFO: renamed from: c */
    public final Object m1425c(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = (a) this.f1245c.m11238e(obj);
        if (aVar != null) {
            return aVar.m1431e();
        }
        InterfaceC0437y interfaceC0437y = (InterfaceC0437y) this.f1244b.invoke();
        int iMo1453e = interfaceC0437y.mo1453e(obj);
        if (iMo1453e != -1) {
            return interfaceC0437y.mo1454f(iMo1453e);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0173a m1426d() {
        return this.f1244b;
    }
}
