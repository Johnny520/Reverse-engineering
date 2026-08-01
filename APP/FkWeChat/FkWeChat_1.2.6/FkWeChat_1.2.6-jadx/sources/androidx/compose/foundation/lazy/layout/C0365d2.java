package androidx.compose.foundation.lazy.layout;

import android.os.Trace;
import androidx.compose.foundation.lazy.layout.C0365d2;
import androidx.compose.foundation.lazy.layout.C0426u0;
import androidx.compose.runtime.InterfaceC0521j4;
import java.util.List;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p024b9.C1050n0;
import p121i3.C3173c;
import p121i3.C3189s;
import p135j2.C3506b2;
import p152k3.AbstractC3948b;
import p166l2.EnumC4552i2;
import p166l2.InterfaceC4556j2;
import p172l8.C4700i0;
import p185m8.AbstractC5114x;
import p189n.C5258o0;
import p215oc.C5706c;
import p263s.AbstractC6635e;
import p314vb.C8895b;
import p314vb.C8919z;
import p376zd.C9987e;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0365d2 {

    /* JADX INFO: renamed from: a */
    public final C0428v f1049a;

    /* JADX INFO: renamed from: b */
    public final C3506b2 f1050b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0381h2 f1051c;

    /* JADX INFO: renamed from: d */
    public boolean f1052d = true;

    /* JADX INFO: renamed from: e */
    public boolean f1053e;

    public C0365d2(C0428v c0428v, C3506b2 c3506b2, InterfaceC0381h2 interfaceC0381h2) {
        this.f1049a = c0428v;
        this.f1050b = c3506b2;
        this.f1051c = interfaceC0381h2;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC0373f2 m1162d(int i10, C0369e2 c0369e2) {
        InterfaceC0381h2 interfaceC0381h2 = this.f1051c;
        return new a(i10, c0369e2, interfaceC0381h2 instanceof InterfaceC0389j2 ? (InterfaceC0389j2) interfaceC0381h2 : null, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m1163e(InterfaceC0381h2 interfaceC0381h2, InterfaceC0373f2 interfaceC0373f2, boolean z10) {
        if (!(interfaceC0381h2 instanceof InterfaceC0389j2)) {
            interfaceC0381h2.mo1213a(interfaceC0373f2);
        } else if (z10) {
            ((InterfaceC0389j2) interfaceC0381h2).mo1115c(interfaceC0373f2);
        } else {
            ((InterfaceC0389j2) interfaceC0381h2).mo1114b(interfaceC0373f2);
        }
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1164f() {
        return this.f1053e;
    }

    /* JADX INFO: renamed from: g */
    public final void m1165g() {
        this.f1052d = false;
    }

    /* JADX INFO: renamed from: h */
    public final C0426u0.b m1166h(int i10, long j10, C0369e2 c0369e2, boolean z10, InterfaceC0184l interfaceC0184l) {
        InterfaceC0381h2 interfaceC0381h2 = this.f1051c;
        a aVar = new a(this, i10, j10, c0369e2, interfaceC0381h2 instanceof InterfaceC0389j2 ? (InterfaceC0389j2) interfaceC0381h2 : null, interfaceC0184l, null);
        m1163e(this.f1051c, aVar, z10);
        AbstractC3948b.m15652a("compose:lazy:schedule_prefetch:index", i10);
        return aVar;
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public final class a implements C0426u0.b, InterfaceC0373f2, C0426u0.c {

        /* JADX INFO: renamed from: a */
        public final int f1054a;

        /* JADX INFO: renamed from: b */
        public final C0369e2 f1055b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC0389j2 f1056c;

        /* JADX INFO: renamed from: d */
        public final InterfaceC0184l f1057d;

        /* JADX INFO: renamed from: e */
        public C3173c f1058e;

        /* JADX INFO: renamed from: f */
        public C3506b2.b f1059f;

        /* JADX INFO: renamed from: g */
        public C3506b2.a f1060g;

        /* JADX INFO: renamed from: h */
        public boolean f1061h;

        /* JADX INFO: renamed from: i */
        public boolean f1062i;

        /* JADX INFO: renamed from: j */
        public boolean f1063j;

        /* JADX INFO: renamed from: k */
        public Object f1064k;

        /* JADX INFO: renamed from: l */
        public boolean f1065l;

        /* JADX INFO: renamed from: m */
        public C10043a f1066m;

        /* JADX INFO: renamed from: n */
        public boolean f1067n;

        /* JADX INFO: renamed from: o */
        public long f1068o;

        /* JADX INFO: renamed from: p */
        public long f1069p;

        /* JADX INFO: renamed from: q */
        public long f1070q;

        /* JADX INFO: renamed from: r */
        public boolean f1071r;

        /* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.d2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public final class C10043a {

            /* JADX INFO: renamed from: a */
            public final List f1073a;

            /* JADX INFO: renamed from: b */
            public final List[] f1074b;

            /* JADX INFO: renamed from: c */
            public int f1075c;

            /* JADX INFO: renamed from: d */
            public int f1076d;

            /* JADX INFO: renamed from: e */
            public boolean f1077e;

            public C10043a(List list) {
                this.f1073a = list;
                this.f1074b = new List[list.size()];
                if (list.isEmpty()) {
                    AbstractC6635e.m26318a("NestedPrefetchController shouldn't be created with no states");
                }
            }

            /* JADX INFO: renamed from: a */
            public final int m1186a() {
                List list = this.f1073a;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i10 = 0; i10 < size; i10++) {
                    iMin = Math.min(iMin, ((C0426u0) list.get(i10)).m1407c());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            /* JADX INFO: renamed from: b */
            public final int m1187b() {
                List list = this.f1073a;
                int size = list.size();
                int iMin = Integer.MAX_VALUE;
                for (int i10 = 0; i10 < size; i10++) {
                    iMin = Math.min(iMin, ((C0426u0) list.get(i10)).m1408d());
                }
                if (iMin == Integer.MAX_VALUE) {
                    return 0;
                }
                return iMin;
            }

            /* JADX WARN: Finally extract failed */
            /* JADX INFO: renamed from: c */
            public final boolean m1188c(InterfaceC0377g2 interfaceC0377g2, int i10, boolean z10) {
                if (this.f1075c >= this.f1073a.size()) {
                    return false;
                }
                if (a.this.f1062i) {
                    AbstractC6635e.m26320c("Should not execute nested prefetch on canceled request");
                }
                if (C5258o0.f16163g) {
                    Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                    try {
                        List list = this.f1073a;
                        int size = list.size();
                        for (int i11 = 0; i11 < size; i11++) {
                            ((C0426u0) list.get(i11)).m1415l(i10);
                        }
                        C4700i0 c4700i0 = C4700i0.f13910a;
                        Trace.endSection();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                Trace.beginSection("compose:lazy:prefetch:nested");
                while (this.f1075c < this.f1073a.size()) {
                    try {
                        if (this.f1074b[this.f1075c] == null) {
                            if (interfaceC0377g2.mo1120a() <= 0) {
                                Trace.endSection();
                                return true;
                            }
                            List[] listArr = this.f1074b;
                            int i12 = this.f1075c;
                            listArr[i12] = ((C0426u0) this.f1073a.get(i12)).m1406b();
                        }
                        List list2 = this.f1074b[this.f1075c];
                        list2.getClass();
                        while (this.f1076d < list2.size()) {
                            InterfaceC0373f2 interfaceC0373f2 = (InterfaceC0373f2) list2.get(this.f1076d);
                            if (z10) {
                                a aVar = interfaceC0373f2 instanceof a ? (a) interfaceC0373f2 : null;
                                if (aVar != null) {
                                    aVar.mo1170a();
                                }
                            }
                            this.f1077e = true;
                            if (interfaceC0373f2.mo1173d(interfaceC0377g2)) {
                                Trace.endSection();
                                return true;
                            }
                            this.f1076d++;
                        }
                        this.f1076d = 0;
                        this.f1075c++;
                    } finally {
                        Trace.endSection();
                    }
                }
                C4700i0 c4700i02 = C4700i0.f13910a;
                Trace.endSection();
                return false;
            }

            /* JADX INFO: renamed from: d */
            public final boolean m1189d() {
                return this.f1077e;
            }

            /* JADX INFO: renamed from: e */
            public final void m1190e(boolean z10) {
                this.f1077e = z10;
            }
        }

        public a(int i10, C0369e2 c0369e2, InterfaceC0389j2 interfaceC0389j2, InterfaceC0184l interfaceC0184l) {
            this.f1054a = i10;
            this.f1055b = c0369e2;
            this.f1056c = interfaceC0389j2;
            this.f1057d = interfaceC0184l;
            this.f1070q = C8919z.f29531a.m34218a();
        }

        /* JADX INFO: renamed from: e */
        public static boolean m1167e(a aVar, C0358c c0358c) {
            if (!aVar.f1071r) {
                aVar.m1185s();
                c0358c.m1145o(aVar.f1069p);
                aVar.f1071r = !aVar.m1184r(aVar.f1068o, c0358c.m1139i() + c0358c.m1138h());
            }
            return aVar.f1071r;
        }

        /* JADX INFO: renamed from: f */
        public static EnumC4552i2 m1168f(C1050n0 c1050n0, InterfaceC4556j2 interfaceC4556j2) {
            interfaceC4556j2.getClass();
            C0426u0 c0426u0M1305G2 = ((C0409o2) interfaceC4556j2).m1305G2();
            List listM20806u = (List) c1050n0.f3208q;
            if (listM20806u != null) {
                listM20806u.add(c0426u0M1305G2);
            } else {
                listM20806u = AbstractC5114x.m20806u(c0426u0M1305G2);
            }
            c1050n0.f3208q = listM20806u;
            return EnumC4552i2.f13330r;
        }

        @Override // androidx.compose.foundation.lazy.layout.C0426u0.b
        /* JADX INFO: renamed from: a */
        public void mo1170a() {
            this.f1067n = true;
        }

        @Override // androidx.compose.foundation.lazy.layout.C0426u0.c
        /* JADX INFO: renamed from: b */
        public int mo1171b() {
            C3506b2.b bVar = this.f1059f;
            if (bVar != null) {
                return bVar.mo13064b();
            }
            return 0;
        }

        @Override // androidx.compose.foundation.lazy.layout.C0426u0.c
        /* JADX INFO: renamed from: c */
        public long mo1172c(int i10) {
            C3506b2.b bVar = this.f1059f;
            return bVar != null ? bVar.mo13065c(i10) : C3189s.f8481b.m12088a();
        }

        @Override // androidx.compose.foundation.lazy.layout.C0426u0.b
        public void cancel() {
            if (this.f1062i) {
                return;
            }
            this.f1062i = true;
            m1174h();
        }

        @Override // androidx.compose.foundation.lazy.layout.InterfaceC0373f2
        /* JADX INFO: renamed from: d */
        public boolean mo1173d(InterfaceC0377g2 interfaceC0377g2) {
            boolean zM1175i;
            if (!C0365d2.this.f1052d) {
                return false;
            }
            if (this.f1067n) {
                Trace.beginSection("compose:lazy:prefetch:execute:urgent");
                try {
                    zM1175i = m1175i(interfaceC0377g2);
                } finally {
                    Trace.endSection();
                }
            } else {
                zM1175i = m1175i(interfaceC0377g2);
            }
            AbstractC3948b.m15652a("compose:lazy:prefetch:execute:item", -1L);
            return zM1175i;
        }

        /* JADX INFO: renamed from: h */
        public final void m1174h() {
            C3506b2.a aVar = this.f1060g;
            if (aVar != null) {
                aVar.cancel();
            }
            this.f1060g = null;
            C3506b2.b bVar = this.f1059f;
            if (bVar != null) {
                bVar.mo13063a();
            }
            this.f1059f = null;
            this.f1066m = null;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m1175i(InterfaceC0377g2 interfaceC0377g2) {
            AbstractC3948b.m15652a("compose:lazy:prefetch:execute:item", m1176j());
            InterfaceC0437y interfaceC0437y = (InterfaceC0437y) C0365d2.this.f1049a.m1426d().invoke();
            if (!this.f1062i) {
                int iMo1451a = interfaceC0437y.mo1451a();
                int iM1176j = m1176j();
                if (iM1176j >= 0 && iM1176j < iMo1451a) {
                    Object objMo1452b = interfaceC0437y.mo1452b(m1176j());
                    Object obj = this.f1064k;
                    if (obj != null && !AbstractC1061t.m3842c(objMo1452b, obj)) {
                        m1174h();
                        return false;
                    }
                    Object objMo1454f = interfaceC0437y.mo1454f(m1176j());
                    C0358c c0358cM1195a = this.f1055b.m1195a(objMo1454f);
                    boolean zM1177k = m1177k();
                    m1182p(interfaceC0377g2.mo1120a());
                    if (!m1177k()) {
                        boolean z10 = C5258o0.f16162f;
                        long j10 = this.f1068o;
                        if (z10) {
                            if (m1184r(j10, c0358cM1195a.m1139i() + c0358cM1195a.m1138h())) {
                                Trace.beginSection("compose:lazy:prefetch:compose");
                                try {
                                    m1181o(interfaceC0377g2, objMo1452b, objMo1454f, c0358cM1195a);
                                    C4700i0 c4700i0 = C4700i0.f13910a;
                                } finally {
                                }
                            }
                        } else if (m1184r(j10, c0358cM1195a.m1135e())) {
                            Trace.beginSection("compose:lazy:prefetch:compose");
                            try {
                                m1179m(objMo1452b, objMo1454f);
                                C4700i0 c4700i02 = C4700i0.f13910a;
                                Trace.endSection();
                                m1185s();
                                c0358cM1195a.m1141k(this.f1069p);
                            } finally {
                            }
                        }
                        if (!m1177k()) {
                            return true;
                        }
                    }
                    if (this.f1060g != null) {
                        if (!m1184r(this.f1068o, c0358cM1195a.m1134d())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:apply");
                        try {
                            m1178l();
                            C4700i0 c4700i03 = C4700i0.f13910a;
                            Trace.endSection();
                            m1185s();
                            c0358cM1195a.m1140j(this.f1069p);
                        } finally {
                        }
                    }
                    if (!this.f1065l) {
                        if (this.f1068o <= 0) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                        try {
                            this.f1066m = m1183q();
                            this.f1065l = true;
                            C4700i0 c4700i04 = C4700i0.f13910a;
                        } finally {
                        }
                    }
                    C10043a c10043a = this.f1066m;
                    if (c10043a != null ? c10043a.m1188c(interfaceC0377g2, c0358cM1195a.m1137g(), this.f1067n) : false) {
                        return true;
                    }
                    C10043a c10043a2 = this.f1066m;
                    if (c10043a2 != null && c10043a2.m1189d()) {
                        m1185s();
                        AbstractC3948b.m15652a("compose:lazy:prefetch:execute:item", m1176j());
                        C10043a c10043a3 = this.f1066m;
                        if (c10043a3 != null) {
                            c10043a3.m1190e(false);
                        }
                    }
                    C3173c c3173c = this.f1058e;
                    if (!this.f1061h && c3173c != null) {
                        if ((C0365d2.this.m1164f() && !zM1177k) || !m1184r(this.f1068o, c0358cM1195a.m1136f())) {
                            return true;
                        }
                        Trace.beginSection("compose:lazy:prefetch:measure");
                        try {
                            m1180n(c3173c.m11978q());
                            C4700i0 c4700i05 = C4700i0.f13910a;
                            Trace.endSection();
                            m1185s();
                            c0358cM1195a.m1142l(this.f1069p);
                            InterfaceC0184l interfaceC0184l = this.f1057d;
                            if (interfaceC0184l != null) {
                                interfaceC0184l.mo27m(this);
                            }
                        } finally {
                        }
                    }
                    C10043a c10043a4 = this.f1066m;
                    if (C5258o0.f16163g && this.f1061h && this.f1065l && c10043a4 != null) {
                        int iM1186a = c10043a4.m1186a();
                        c0358cM1195a.m1143m(iM1186a);
                        if (c10043a4.m1187b() < iM1186a) {
                            c0358cM1195a.m1133c();
                        }
                    }
                    return false;
                }
            }
            m1174h();
            return false;
        }

        /* JADX INFO: renamed from: j */
        public int m1176j() {
            return this.f1054a;
        }

        /* JADX INFO: renamed from: k */
        public final boolean m1177k() {
            C3506b2.a aVar;
            return this.f1063j || ((aVar = this.f1060g) != null && aVar.mo13062b());
        }

        /* JADX INFO: renamed from: l */
        public final void m1178l() {
            C3506b2.a aVar = this.f1060g;
            if (aVar == null) {
                C9987e.m38645a("Nothing to apply!");
                return;
            }
            this.f1059f = aVar.apply();
            this.f1060g = null;
            this.f1063j = true;
        }

        /* JADX INFO: renamed from: m */
        public final void m1179m(Object obj, Object obj2) {
            if (!(this.f1059f == null)) {
                AbstractC6635e.m26318a("Request was already composed!");
            }
            InterfaceC0188p interfaceC0188pM1424b = C0365d2.this.f1049a.m1424b(m1176j(), obj, obj2);
            this.f1064k = obj;
            this.f1059f = C0365d2.this.f1050b.m13060j(obj, interfaceC0188pM1424b);
            this.f1063j = true;
        }

        /* JADX INFO: renamed from: n */
        public final void m1180n(long j10) {
            if (this.f1062i) {
                AbstractC6635e.m26318a("Callers should check whether the request is still valid before calling performMeasure()");
            }
            if (this.f1061h) {
                AbstractC6635e.m26318a("Request was already measured!");
            }
            this.f1061h = true;
            C3506b2.b bVar = this.f1059f;
            if (bVar == null) {
                AbstractC6635e.m26319b("performComposition() must be called before performMeasure()");
                C5706c.m23089a();
                return;
            }
            int iMo13064b = bVar.mo13064b();
            for (int i10 = 0; i10 < iMo13064b; i10++) {
                bVar.mo13067e(i10, j10);
            }
        }

        /* JADX INFO: renamed from: o */
        public final void m1181o(InterfaceC0377g2 interfaceC0377g2, Object obj, Object obj2, final C0358c c0358c) {
            C3506b2.a aVarM13054d = this.f1060g;
            if (aVarM13054d == null) {
                C0365d2 c0365d2 = C0365d2.this;
                aVarM13054d = c0365d2.f1050b.m13054d(obj, c0365d2.f1049a.m1424b(m1176j(), obj, obj2));
                this.f1060g = aVarM13054d;
                this.f1064k = obj;
            }
            this.f1071r = false;
            while (!aVarM13054d.mo13062b() && !this.f1071r) {
                aVarM13054d.mo13061a(new InterfaceC0521j4() { // from class: androidx.compose.foundation.lazy.layout.c2
                    @Override // androidx.compose.runtime.InterfaceC0521j4
                    /* JADX INFO: renamed from: a */
                    public final boolean mo1152a() {
                        return C0365d2.a.m1167e(this.f1040a, c0358c);
                    }
                });
            }
            m1185s();
            boolean z10 = this.f1071r;
            long j10 = this.f1069p;
            if (z10) {
                c0358c.m1144n(j10);
            } else {
                c0358c.m1145o(j10);
            }
        }

        /* JADX INFO: renamed from: p */
        public final void m1182p(long j10) {
            this.f1068o = j10;
            this.f1070q = C8919z.f29531a.m34218a();
            this.f1069p = 0L;
            AbstractC3948b.m15652a("compose:lazy:prefetch:available_time_nanos", j10);
        }

        /* JADX INFO: renamed from: q */
        public final C10043a m1183q() {
            C3506b2.b bVar = this.f1059f;
            if (bVar == null) {
                AbstractC6635e.m26319b("Should precompose before resolving nested prefetch states");
                C5706c.m23089a();
                return null;
            }
            final C1050n0 c1050n0 = new C1050n0();
            bVar.mo13066d("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", new InterfaceC0184l() { // from class: androidx.compose.foundation.lazy.layout.b2
                @Override // p010a9.InterfaceC0184l
                /* JADX INFO: renamed from: m */
                public final Object mo27m(Object obj) {
                    return C0365d2.a.m1168f(c1050n0, (InterfaceC4556j2) obj);
                }
            });
            List list = (List) c1050n0.f3208q;
            if (list != null) {
                return new C10043a(list);
            }
            return null;
        }

        /* JADX INFO: renamed from: r */
        public final boolean m1184r(long j10, long j11) {
            if (this.f1067n) {
                j11 = 0;
            }
            return j10 > j11;
        }

        /* JADX INFO: renamed from: s */
        public final void m1185s() {
            long jM34218a = C8919z.f29531a.m34218a();
            long jM34087A = C8895b.m34087A(C8919z.a.m34220c(jM34218a, this.f1070q));
            this.f1069p = jM34087A;
            long j10 = this.f1068o - jM34087A;
            this.f1068o = j10;
            this.f1070q = jM34218a;
            AbstractC3948b.m15652a("compose:lazy:prefetch:available_time_nanos", j10);
        }

        public String toString() {
            return "HandleAndRequestImpl { index = " + m1176j() + ", constraints = " + this.f1058e + ", isComposed = " + m1177k() + ", isMeasured = " + this.f1061h + ", isCanceled = " + this.f1062i + " }";
        }

        public /* synthetic */ a(C0365d2 c0365d2, int i10, long j10, C0369e2 c0369e2, InterfaceC0389j2 interfaceC0389j2, InterfaceC0184l interfaceC0184l, AbstractC1043k abstractC1043k) {
            this(c0365d2, i10, j10, c0369e2, interfaceC0389j2, interfaceC0184l);
        }

        public a(C0365d2 c0365d2, int i10, long j10, C0369e2 c0369e2, InterfaceC0389j2 interfaceC0389j2, InterfaceC0184l interfaceC0184l) {
            this(i10, c0369e2, interfaceC0389j2, interfaceC0184l);
            this.f1058e = C3173c.m11962a(j10);
        }
    }
}
