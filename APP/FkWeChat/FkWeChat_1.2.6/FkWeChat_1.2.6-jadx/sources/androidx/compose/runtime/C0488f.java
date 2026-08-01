package androidx.compose.runtime;

import androidx.compose.runtime.C0488f;
import androidx.compose.runtime.InterfaceC0625y1;
import ec.C2164o;
import ec.InterfaceC2156m;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p057e1.C1977e;
import p172l8.AbstractC4713t;
import p172l8.C4700i0;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p228p8.InterfaceC5980j;
import p242q8.AbstractC6324b;
import p242q8.AbstractC6325c;
import p257r8.AbstractC6539h;

/* JADX INFO: renamed from: androidx.compose.runtime.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0488f implements InterfaceC0625y1 {

    /* JADX INFO: renamed from: q */
    public final InterfaceC0173a f1350q;

    /* JADX INFO: renamed from: r */
    public final C1977e f1351r = new C1977e();

    /* JADX INFO: renamed from: androidx.compose.runtime.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends C1977e.a {

        /* JADX INFO: renamed from: a */
        public InterfaceC2156m f1352a;

        /* JADX INFO: renamed from: b */
        public InterfaceC0184l f1353b;

        public a(InterfaceC0184l interfaceC0184l, InterfaceC2156m interfaceC2156m) {
            this.f1352a = interfaceC2156m;
            this.f1353b = interfaceC0184l;
        }

        @Override // p057e1.C1977e.a
        /* JADX INFO: renamed from: a */
        public void mo1656a() {
            this.f1353b = null;
            this.f1352a = null;
        }

        @Override // p057e1.C1977e.a
        /* JADX INFO: renamed from: b */
        public void mo1657b(Throwable th) {
            InterfaceC2156m interfaceC2156m = this.f1352a;
            if (interfaceC2156m != null) {
                C4712s.a aVar = C4712s.f13928r;
                interfaceC2156m.resumeWith(C4712s.m18798b(AbstractC4713t.m18807a(th)));
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m1658c(long j10) {
            InterfaceC2156m interfaceC2156m;
            Object objM18798b;
            InterfaceC0184l interfaceC0184l = this.f1353b;
            if (interfaceC0184l == null || (interfaceC2156m = this.f1352a) == null) {
                return;
            }
            try {
                C4712s.a aVar = C4712s.f13928r;
                objM18798b = C4712s.m18798b(interfaceC0184l.mo27m(Long.valueOf(j10)));
            } catch (Throwable th) {
                C4712s.a aVar2 = C4712s.f13928r;
                objM18798b = C4712s.m18798b(AbstractC4713t.m18807a(th));
            }
            interfaceC2156m.resumeWith(objM18798b);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC0184l {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0502h f1354q;

        public b(InterfaceC0502h interfaceC0502h) {
            this.f1354q = interfaceC0502h;
        }

        /* JADX INFO: renamed from: a */
        public final void m1659a(Throwable th) {
            this.f1354q.cancel();
        }

        @Override // p010a9.InterfaceC0184l
        /* JADX INFO: renamed from: m */
        public /* bridge */ /* synthetic */ Object mo27m(Object obj) {
            m1659a((Throwable) obj);
            return C4700i0.f13910a;
        }
    }

    public C0488f(InterfaceC0173a interfaceC0173a) {
        this.f1350q = interfaceC0173a;
    }

    /* JADX INFO: renamed from: a */
    public static C4700i0 m1646a(long j10, a aVar) {
        aVar.m1658c(j10);
        return C4700i0.f13910a;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: L */
    public /* bridge */ InterfaceC5980j mo1649L(InterfaceC5980j.c cVar) {
        return InterfaceC0625y1.a.m2456c(this, cVar);
    }

    @Override // androidx.compose.runtime.InterfaceC0625y1
    /* JADX INFO: renamed from: W */
    public Object mo1650W(InterfaceC0184l interfaceC0184l, InterfaceC5976f interfaceC5976f) {
        C2164o c2164o = new C2164o(AbstractC6324b.m24989d(interfaceC5976f), 1);
        c2164o.m7851E();
        c2164o.mo7830B(new b(this.f1351r.m7144b(new a(interfaceC0184l, c2164o), this.f1350q)));
        Object objM7875w = c2164o.m7875w();
        if (objM7875w == AbstractC6325c.m24992g()) {
            AbstractC6539h.m25860c(interfaceC5976f);
        }
        return objM7875w;
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: c0 */
    public /* bridge */ InterfaceC5980j mo1651c0(InterfaceC5980j interfaceC5980j) {
        return InterfaceC0625y1.a.m2457d(this, interfaceC5980j);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m1652e() {
        return this.f1351r.m7147e();
    }

    /* JADX INFO: renamed from: g */
    public final void m1653g(final long j10) {
        this.f1351r.m7146d(new InterfaceC0184l() { // from class: androidx.compose.runtime.e
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C0488f.m1646a(j10, (C0488f.a) obj);
            }
        });
    }

    @Override // p228p8.InterfaceC5980j.b, p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: h */
    public /* bridge */ InterfaceC5980j.b mo1654h(InterfaceC5980j.c cVar) {
        return InterfaceC0625y1.a.m2455b(this, cVar);
    }

    @Override // p228p8.InterfaceC5980j
    /* JADX INFO: renamed from: q */
    public /* bridge */ Object mo1655q(Object obj, InterfaceC0188p interfaceC0188p) {
        return InterfaceC0625y1.a.m2454a(this, obj, interfaceC0188p);
    }
}
