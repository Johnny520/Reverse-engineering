package p265s;

import android.os.Trace;
import gg.C1425u;
import java.util.ArrayList;
import java.util.List;
import okio.C3193a;
import p020b5.C0184c;
import p049d9.C0746g;
import p063e9.C0830a;
import p069f.C0943k0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p117i0.C1853l1;
import p136j8.C2095f;
import p136j8.C2104o;
import p162l3.C2469w;
import p201o.AbstractC3026b;
import p211o9.C3092e;
import p219oh.AbstractC3165h;
import p222p.AbstractC3199a;
import p251r.C3626k;
import p251r.C3634s;
import p259r9.AbstractC3754e0;
import p293u2.C4231a;
import p308v1.C4376b0;
import p308v1.C4397i0;
import p308v1.C4400j0;
import p308v1.C4401j1;
import p308v1.InterfaceC4395h1;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4666q;
import pg.AbstractC3414a;
import pg.AbstractC3415b;
import pg.AbstractC3417d;
import pg.EnumC3416c;
import tf.C4173t;

/* JADX INFO: renamed from: s.z0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3870z0 implements InterfaceC3842l0 {

    /* JADX INFO: renamed from: a */
    public final int f12695a;

    /* JADX INFO: renamed from: b */
    public final C0184c f12696b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC1231l f12697c;

    /* JADX INFO: renamed from: d */
    public C4231a f12698d;

    /* JADX INFO: renamed from: e */
    public InterfaceC4395h1 f12699e;

    /* JADX INFO: renamed from: f */
    public C4397i0 f12700f;

    /* JADX INFO: renamed from: g */
    public boolean f12701g;

    /* JADX INFO: renamed from: h */
    public boolean f12702h;

    /* JADX INFO: renamed from: i */
    public boolean f12703i;

    /* JADX INFO: renamed from: j */
    public Object f12704j;

    /* JADX INFO: renamed from: k */
    public boolean f12705k;

    /* JADX INFO: renamed from: l */
    public C3868y0 f12706l;

    /* JADX INFO: renamed from: m */
    public boolean f12707m;

    /* JADX INFO: renamed from: n */
    public long f12708n;

    /* JADX INFO: renamed from: o */
    public long f12709o;

    /* JADX INFO: renamed from: p */
    public long f12710p;

    /* JADX INFO: renamed from: q */
    public boolean f12711q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ C2095f f12712r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3870z0(C2095f c2095f, int i9, C0184c c0184c, C3092e c3092e) {
        this.f12712r = c2095f;
        this.f12695a = i9;
        this.f12696b = c0184c;
        this.f12697c = c3092e;
        int i10 = AbstractC3417d.f11043b;
        this.f12710p = System.nanoTime() - AbstractC3417d.f11042a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p265s.InterfaceC3842l0
    /* JADX INFO: renamed from: a */
    public final void mo8011a() {
        this.f12707m = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8048b() {
        C4397i0 c4397i0 = this.f12700f;
        if (c4397i0 != null) {
            switch (c4397i0.f14642a) {
                case 0:
                    break;
                default:
                    C4376b0 c4376b0M8841b = c4397i0.m8841b();
                    if ((c4376b0M8841b != null ? c4376b0M8841b.f14590f : null) != null) {
                        C4400j0.m8843c(c4397i0.f14643b, c4397i0.f14644c);
                    }
                    break;
            }
        }
        this.f12700f = null;
        InterfaceC4395h1 interfaceC4395h1 = this.f12699e;
        if (interfaceC4395h1 != null) {
            interfaceC4395h1.mo8828a();
        }
        this.f12699e = null;
        this.f12706l = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m8049c(C3812a c3812a) {
        boolean zM8050d;
        if (!this.f12712r.f7000a) {
            return false;
        }
        if (this.f12707m) {
            Trace.beginSection("compose:lazy:prefetch:execute:urgent");
            try {
                zM8050d = m8050d(c3812a);
            } finally {
                Trace.endSection();
            }
        } else {
            zM8050d = m8050d(c3812a);
        }
        AbstractC1089i.m2736K0(-1L, "compose:lazy:prefetch:execute:item");
        return zM8050d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p265s.InterfaceC3842l0
    public final void cancel() {
        if (this.f12702h) {
            return;
        }
        this.f12702h = true;
        m8048b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: s.z0 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: s.z0 */
    /* JADX DEBUG: Multi-variable search result rejected for r7v9, resolved type: s.z0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024c  */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8050d(C3812a c3812a) {
        long j3;
        boolean z9;
        InterfaceC1231l interfaceC1231l;
        ?? r92;
        int i9;
        List list;
        int i10;
        int i11;
        boolean z10;
        InterfaceC4395h1 interfaceC4395h1M8846f;
        int i12 = this.f12695a;
        long j4 = i12;
        AbstractC1089i.m2736K0(j4, "compose:lazy:prefetch:execute:item");
        C3626k c3626k = (C3626k) ((C3816b0) this.f12712r.f7001b).f12518b.invoke();
        if (!this.f12702h) {
            int iM7607c = c3626k.m7607c();
            if (i12 >= 0 && i12 < iM7607c) {
                Object objM7608d = c3626k.m7608d(i12);
                Object obj = this.f12704j;
                if (obj != null && !objM7608d.equals(obj)) {
                    m8048b();
                    return false;
                }
                Object objM7606b = c3626k.m7606b(i12);
                C0184c c0184c = this.f12696b;
                C3818c c3818c = (C3818c) c0184c.f471c;
                if (c0184c.f470b != objM7606b || c3818c == null) {
                    C0943k0 c0943k0 = (C0943k0) c0184c.f469a;
                    Object objM2320g = c0943k0.m2320g(objM7606b);
                    Object obj2 = objM2320g;
                    if (objM2320g == null) {
                        C3818c c3818c2 = new C3818c();
                        c3818c2.f12524e = -1;
                        c0943k0.m2326m(objM7606b, c3818c2);
                        obj2 = c3818c2;
                    }
                    c3818c = (C3818c) obj2;
                    c0184c.f470b = objM7606b;
                    c0184c.f471c = c3818c;
                }
                m8051e();
                long jM8001a = c3812a.m8001a();
                this.f12708n = jM8001a;
                int i13 = AbstractC3417d.f11043b;
                this.f12710p = System.nanoTime() - AbstractC3417d.f11042a;
                this.f12709o = 0L;
                AbstractC1089i.m2736K0(jM8001a, "compose:lazy:prefetch:available_time_nanos");
                if (m8051e()) {
                    j3 = 0;
                } else {
                    j3 = 0;
                    if (m8053g(this.f12708n, c3818c.f12520a + c3818c.f12521b)) {
                        Trace.beginSection("compose:lazy:prefetch:compose");
                        try {
                            m8052f(objM7608d, objM7606b, c3818c);
                        } finally {
                        }
                    }
                    if (!m8051e()) {
                        return true;
                    }
                }
                InterfaceC1231l interfaceC1231lMo9095e = null;
                if (this.f12700f != null) {
                    if (!m8053g(this.f12708n, c3818c.f12522c)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:apply");
                    try {
                        C4397i0 c4397i0 = this.f12700f;
                        if (c4397i0 == null) {
                            throw new IllegalArgumentException("Nothing to apply!");
                        }
                        switch (c4397i0.f14642a) {
                            case 0:
                                interfaceC4395h1M8846f = c4397i0.f14643b.m8846f(c4397i0.f14644c);
                                break;
                            default:
                                C4400j0 c4400j0 = c4397i0.f14643b;
                                C4376b0 c4376b0M8841b = c4397i0.m8841b();
                                if (c4376b0M8841b != null) {
                                    c4400j0.m8845d(c4376b0M8841b, false);
                                }
                                interfaceC4395h1M8846f = c4400j0.m8846f(c4397i0.f14644c);
                                break;
                        }
                        this.f12699e = interfaceC4395h1M8846f;
                        this.f12700f = null;
                        this.f12703i = true;
                        Trace.endSection();
                        m8054h();
                        c3818c.f12522c = C3818c.m8006a(this.f12709o, c3818c.f12522c);
                    } finally {
                    }
                }
                if (!this.f12705k) {
                    if (this.f12708n <= j3) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        InterfaceC4395h1 interfaceC4395h1 = this.f12699e;
                        if (interfaceC4395h1 != null) {
                            C1425u c1425u = new C1425u();
                            interfaceC4395h1.mo8836d(new C0746g(c1425u, 1));
                            List list2 = (List) c1425u.f4738g;
                            C3868y0 c3868y0 = list2 != null ? new C3868y0(this, list2) : null;
                            this.f12706l = c3868y0;
                            this.f12705k = true;
                        } else {
                            AbstractC3026b.m6429b("Should precompose before resolving nested prefetch states");
                            C3193a.m6814c();
                        }
                        this.f12706l = c3868y0;
                        this.f12705k = true;
                    } finally {
                    }
                }
                C3868y0 c3868y02 = this.f12706l;
                if (c3868y02 != null) {
                    int i14 = c3818c.f12524e;
                    boolean z11 = this.f12707m;
                    List[] listArr = c3868y02.f12679b;
                    int i15 = c3868y02.f12680c;
                    List list3 = c3868y02.f12678a;
                    if (i15 < list3.size()) {
                        if (c3868y02.f12683f.f12702h) {
                            AbstractC3026b.m6430c("Should not execute nested prefetch on canceled request");
                        }
                        Trace.beginSection("compose:lazy:prefetch:update_nested_prefetch_count");
                        try {
                            int size = list3.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                ((C3844m0) list3.get(i16)).f12581d = i14;
                            }
                            Trace.endSection();
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (c3868y02.f12680c < list3.size()) {
                                try {
                                    if (listArr[c3868y02.f12680c] != null) {
                                        z9 = z11;
                                        interfaceC1231l = interfaceC1231lMo9095e;
                                    } else {
                                        if (c3812a.m8001a() <= j3) {
                                            Trace.endSection();
                                            return true;
                                        }
                                        int i17 = c3868y02.f12680c;
                                        C3844m0 c3844m0 = (C3844m0) list3.get(i17);
                                        C3634s c3634s = c3844m0.f12578a;
                                        if (c3634s == null) {
                                            list = C4173t.f13710g;
                                            i9 = i17;
                                            z9 = z11;
                                            interfaceC1231l = interfaceC1231lMo9095e;
                                        } else {
                                            int i18 = c3844m0.f12581d;
                                            ArrayList arrayList = new ArrayList();
                                            int i19 = c3634s.f11778h;
                                            AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
                                            if (abstractC4655fM9148e != null) {
                                                interfaceC1231lMo9095e = abstractC4655fM9148e.mo9095e();
                                            }
                                            AbstractC4666q.m9154k(abstractC4655fM9148e, AbstractC4666q.m9151h(abstractC4655fM9148e), interfaceC1231lMo9095e);
                                            if (i18 == -1) {
                                                i18 = 2;
                                            }
                                            int i20 = 0;
                                            while (i20 < i18) {
                                                int i21 = i19 + i20;
                                                C2095f c2095f = c3844m0.f12580c;
                                                if (c2095f == null) {
                                                    i10 = i20;
                                                    i11 = i17;
                                                    z10 = z11;
                                                } else {
                                                    i10 = i20;
                                                    i11 = i17;
                                                    z10 = z11;
                                                    arrayList.add(new C3870z0(c2095f, i21, c3844m0.f12579b, null));
                                                }
                                                i20 = i10 + 1;
                                                i17 = i11;
                                                z11 = z10;
                                            }
                                            i9 = i17;
                                            z9 = z11;
                                            interfaceC1231l = null;
                                            c3844m0.f12583f = arrayList.size();
                                            list = arrayList;
                                        }
                                        listArr[i9] = list;
                                    }
                                    List list4 = listArr[c3868y02.f12680c];
                                    list4.getClass();
                                    while (c3868y02.f12681d < list4.size()) {
                                        C3870z0 c3870z0 = (C3870z0) list4.get(c3868y02.f12681d);
                                        if (z9) {
                                            C3870z0 c3870z02 = c3870z0 != null ? c3870z0 : interfaceC1231l;
                                            if (c3870z02 != 0) {
                                                r92 = 1;
                                                c3870z02.f12707m = true;
                                            }
                                        } else {
                                            r92 = 1;
                                        }
                                        c3868y02.f12682e = r92;
                                        if (c3870z0.m8049c(c3812a)) {
                                            return r92;
                                        }
                                        c3868y02.f12681d += r92;
                                    }
                                    c3868y02.f12681d = 0;
                                    c3868y02.f12680c++;
                                    interfaceC1231lMo9095e = interfaceC1231l;
                                    z11 = z9;
                                    j3 = 0;
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                C3868y0 c3868y03 = this.f12706l;
                if (c3868y03 != null && c3868y03.f12682e) {
                    m8054h();
                    AbstractC1089i.m2736K0(j4, "compose:lazy:prefetch:execute:item");
                    C3868y0 c3868y04 = this.f12706l;
                    if (c3868y04 != null) {
                        c3868y04.f12682e = false;
                    }
                }
                C4231a c4231a = this.f12698d;
                if (!this.f12701g && c4231a != null) {
                    if (!m8053g(this.f12708n, c3818c.f12523d)) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        long j5 = c4231a.f13903a;
                        if (this.f12702h) {
                            AbstractC3026b.m6428a("Callers should check whether the request is still valid before calling performMeasure()");
                        }
                        if (this.f12701g) {
                            AbstractC3026b.m6428a("Request was already measured!");
                        }
                        this.f12701g = true;
                        InterfaceC4395h1 interfaceC4395h12 = this.f12699e;
                        if (interfaceC4395h12 != null) {
                            int iMo8834b = interfaceC4395h12.mo8834b();
                            for (int i22 = 0; i22 < iMo8834b; i22++) {
                                interfaceC4395h12.mo8835c(i22, j5);
                            }
                        } else {
                            AbstractC3026b.m6429b("performComposition() must be called before performMeasure()");
                            C3193a.m6814c();
                        }
                        Trace.endSection();
                        m8054h();
                        c3818c.f12523d = C3818c.m8006a(this.f12709o, c3818c.f12523d);
                        InterfaceC1231l interfaceC1231l2 = this.f12697c;
                        if (interfaceC1231l2 != null) {
                            interfaceC1231l2.invoke(this);
                        }
                    } finally {
                    }
                }
                C3868y0 c3868y05 = this.f12706l;
                if (!this.f12701g || !this.f12705k || c3868y05 == null) {
                    return false;
                }
                List list5 = c3868y05.f12678a;
                int size2 = list5.size();
                int iMin = Integer.MAX_VALUE;
                for (int i23 = 0; i23 < size2; i23++) {
                    iMin = Math.min(iMin, ((C3844m0) list5.get(i23)).f12582e);
                }
                int i24 = iMin == Integer.MAX_VALUE ? 0 : iMin;
                int i25 = c3818c.f12524e;
                c3818c.f12524e = i25 == -1 ? i24 : ((i25 * 3) + i24) / 4;
                int size3 = list5.size();
                int iMin2 = Integer.MAX_VALUE;
                for (int i26 = 0; i26 < size3; i26++) {
                    iMin2 = Math.min(iMin2, ((C3844m0) list5.get(i26)).f12583f);
                }
                if (iMin2 == Integer.MAX_VALUE) {
                    iMin2 = 0;
                }
                if (iMin2 >= i24) {
                    return false;
                }
                c3818c.f12523d = 0L;
                return false;
            }
        }
        m8048b();
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m8051e() {
        C4397i0 c4397i0;
        return this.f12703i || ((c4397i0 = this.f12700f) != null && c4397i0.m8842c());
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: f */
    public final void m8052f(Object obj, Object obj2, C3818c c3818c) {
        C4397i0 c4397i0;
        C4397i0 c4397i02 = this.f12700f;
        if (c4397i02 == null) {
            C2095f c2095f = this.f12712r;
            InterfaceC1235p interfaceC1235pM8004a = ((C3816b0) c2095f.f7001b).m8004a(obj, this.f12695a, obj2);
            C4400j0 c4400j0M8855a = ((C4401j1) c2095f.f7002c).m8855a();
            if (c4400j0M8855a.f14648g.m10010G()) {
                c4400j0M8855a.m8851k(obj, interfaceC1235pM8004a, true);
                c4397i0 = new C4397i0(c4400j0M8855a, obj, 1);
            } else {
                c4397i0 = new C4397i0(c4400j0M8855a, obj, 0);
            }
            c4397i02 = c4397i0;
            this.f12700f = c4397i02;
            this.f12704j = obj;
        }
        this.f12711q = false;
        while (!c4397i02.m8842c() && !this.f12711q) {
            C0830a c0830a = new C0830a(this, 5, c3818c);
            switch (c4397i02.f14642a) {
                case 0:
                    break;
                default:
                    C4376b0 c4376b0M8841b = c4397i02.m8841b();
                    C1853l1 c1853l1 = c4376b0M8841b != null ? c4376b0M8841b.f14590f : null;
                    if (c1853l1 != null && !c1853l1.m4570c()) {
                        AbstractC4655f abstractC4655fM9148e = AbstractC4666q.m9148e();
                        InterfaceC1231l interfaceC1231lMo9095e = abstractC4655fM9148e != null ? abstractC4655fM9148e.mo9095e() : null;
                        AbstractC4655f abstractC4655fM9151h = AbstractC4666q.m9151h(abstractC4655fM9148e);
                        try {
                            c1853l1.m4572e(c0830a);
                        } finally {
                        }
                    }
                    break;
            }
        }
        m8054h();
        boolean z9 = this.f12711q;
        long j3 = this.f12709o;
        if (z9) {
            c3818c.f12521b = C3818c.m8006a(j3, c3818c.f12521b);
        } else {
            c3818c.f12520a = C3818c.m8006a(j3, c3818c.f12520a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m8053g(long j3, long j4) {
        if (this.f12707m) {
            j4 = 0;
        }
        return j3 > j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m8054h() {
        int i9 = AbstractC3417d.f11043b;
        long jNanoTime = System.nanoTime() - AbstractC3417d.f11042a;
        long j3 = this.f12710p;
        long jM6772X = 0;
        if (((j3 - 1) | 1) == Long.MAX_VALUE) {
            if (jNanoTime == j3) {
                C2469w c2469w = AbstractC3414a.f11034g;
            } else {
                long j4 = j3 < 0 ? AbstractC3414a.f11036i : AbstractC3414a.f11035h;
                jM6772X = ((-(j4 >> 1)) << 1) + ((long) (((int) j4) & 1));
                int i10 = AbstractC3415b.f11037a;
            }
        } else if ((1 | (jNanoTime - 1)) == Long.MAX_VALUE) {
            jM6772X = jNanoTime < 0 ? AbstractC3414a.f11036i : AbstractC3414a.f11035h;
        } else {
            long j5 = jNanoTime - j3;
            long j10 = (~(j5 ^ j3)) & (j5 ^ jNanoTime);
            EnumC3416c enumC3416c = EnumC3416c.NANOSECONDS;
            if (j10 < 0) {
                EnumC3416c enumC3416c2 = EnumC3416c.MILLISECONDS;
                if (enumC3416c.compareTo(enumC3416c2) < 0) {
                    long j11 = (jNanoTime / 1000000) - (j3 / 1000000);
                    long j12 = (jNanoTime % 1000000) - (j3 % 1000000);
                    C2469w c2469w2 = AbstractC3414a.f11034g;
                    long jM6772X2 = AbstractC3165h.m6772X(j11, enumC3416c2);
                    long jM6772X3 = AbstractC3165h.m6772X(j12, enumC3416c);
                    int i11 = ((int) jM6772X2) & 1;
                    if (i11 != (((int) jM6772X3) & 1)) {
                        jM6772X = i11 == 1 ? AbstractC3414a.m7193a(jM6772X2 >> 1, jM6772X3 >> 1) : AbstractC3414a.m7193a(jM6772X3 >> 1, jM6772X2 >> 1);
                    } else if (i11 == 0) {
                        long j13 = (jM6772X2 >> 1) + (jM6772X3 >> 1);
                        if (-4611686018426999999L > j13 || j13 >= 4611686018427000000L) {
                            jM6772X = AbstractC3165h.m6795v(j13 / ((long) 1000000));
                        } else {
                            jM6772X = j13 << 1;
                            int i12 = AbstractC3415b.f11037a;
                        }
                    } else {
                        long jM6778e = AbstractC3165h.m6778e(jM6772X2 >> 1, jM6772X3 >> 1);
                        if (jM6778e == 9223372036854759646L) {
                            C2104o.m5294t("Summing infinite durations of different signs yields an undefined result.");
                            return;
                        }
                        if (jM6778e == 4611686018427387903L || jM6778e == -4611686018427387903L) {
                            jM6772X = AbstractC3165h.m6795v(jM6778e);
                        } else if (-4611686018426L > jM6778e || jM6778e >= 4611686018427L) {
                            jM6772X = AbstractC3165h.m6795v(AbstractC3754e0.m7911s(jM6778e, -4611686018427387903L, 4611686018427387903L));
                        } else {
                            jM6772X = (jM6778e * ((long) 1000000)) << 1;
                            int i13 = AbstractC3415b.f11037a;
                        }
                    }
                } else {
                    long j14 = j5 < 0 ? AbstractC3414a.f11036i : AbstractC3414a.f11035h;
                    jM6772X = ((-(j14 >> 1)) << 1) + ((long) (((int) j14) & 1));
                    int i14 = AbstractC3415b.f11037a;
                }
            } else {
                jM6772X = AbstractC3165h.m6772X(j5, enumC3416c);
            }
        }
        long j15 = jM6772X >> 1;
        C2469w c2469w3 = AbstractC3414a.f11034g;
        long j16 = (((int) jM6772X) & 1) == 0 ? j15 : j15 > 9223372036854L ? Long.MAX_VALUE : j15 < -9223372036854L ? Long.MIN_VALUE : j15 * ((long) 1000000);
        this.f12709o = j16;
        long j17 = this.f12708n - j16;
        this.f12708n = j17;
        this.f12710p = jNanoTime;
        AbstractC1089i.m2736K0(j17, "compose:lazy:prefetch:available_time_nanos");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HandleAndRequestImpl { index = ");
        sb2.append(this.f12695a);
        sb2.append(", constraints = ");
        sb2.append(this.f12698d);
        sb2.append(", isComposed = ");
        sb2.append(m8051e());
        sb2.append(", isMeasured = ");
        sb2.append(this.f12701g);
        sb2.append(", isCanceled = ");
        return AbstractC3199a.m6840m(" }", sb2, this.f12702h);
    }
}
