package ca;

import ba.C1083k;
import ca.InterfaceC1412c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import la.C4723c;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p081fa.EnumC2376d0;
import p081fa.InterfaceC2379g;
import p081fa.InterfaceC2393u;
import p082fb.InterfaceC2406h;
import p082fb.InterfaceC2408j;
import p111ha.AbstractC2936w;
import p111ha.InterfaceC2935v;
import p111ha.InterfaceC2937x;
import p128ia.C3368a;
import p185m8.AbstractC5068b1;
import p185m8.AbstractC5114x;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5695f;
import p213oa.C5697h;
import p215oc.C5729x;
import p229p9.InterfaceC5995e;
import p229p9.InterfaceC6019m;
import p244qb.AbstractC6378i;
import p342x9.InterfaceC9468b;
import p358y9.InterfaceC9649u;
import za.C9906d;

/* JADX INFO: renamed from: ca.g0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C1421g0 extends AbstractC1408a1 {

    /* JADX INFO: renamed from: n */
    public final InterfaceC2393u f4201n;

    /* JADX INFO: renamed from: o */
    public final C1415d0 f4202o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC2408j f4203p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC2406h f4204q;

    /* JADX INFO: renamed from: ca.g0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C5695f f4205a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC2379g f4206b;

        public a(C5695f c5695f, InterfaceC2379g interfaceC2379g) {
            c5695f.getClass();
            this.f4205a = c5695f;
            this.f4206b = interfaceC2379g;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2379g m5539a() {
            return this.f4206b;
        }

        /* JADX INFO: renamed from: b */
        public final C5695f m5540b() {
            return this.f4205a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && AbstractC1061t.m3842c(this.f4205a, ((a) obj).f4205a);
        }

        public int hashCode() {
            return this.f4205a.hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421g0(C1083k c1083k, InterfaceC2393u interfaceC2393u, C1415d0 c1415d0) {
        super(c1083k);
        c1083k.getClass();
        interfaceC2393u.getClass();
        c1415d0.getClass();
        this.f4201n = interfaceC2393u;
        this.f4202o = c1415d0;
        this.f4203p = c1083k.m3941e().mo8662e(new C1417e0(c1083k, this));
        this.f4204q = c1083k.m3941e().mo8665h(new C1419f0(this, c1083k));
    }

    /* JADX INFO: renamed from: i0 */
    public static final InterfaceC5995e m5525i0(C1421g0 c1421g0, C1083k c1083k, a aVar) {
        aVar.getClass();
        C5691b c5691b = new C5691b(c1421g0.mo5529R().mo24031d(), aVar.m5540b());
        InterfaceC2935v.a aVarMo10727b = aVar.m5539a() != null ? c1083k.m3937a().m3905j().mo10727b(aVar.m5539a(), c1421g0.m5533m0()) : c1083k.m3937a().m3905j().mo10726a(c5691b, c1421g0.m5533m0());
        InterfaceC2937x interfaceC2937xM10728a = aVarMo10727b != null ? aVarMo10727b.m10728a() : null;
        C5691b c5691bMo10736h = interfaceC2937xM10728a != null ? interfaceC2937xM10728a.mo10736h() : null;
        if (c5691bMo10736h != null && (c5691bMo10736h.m22990j() || c5691bMo10736h.m22989i())) {
            return null;
        }
        b bVarM5535p0 = c1421g0.m5535p0(interfaceC2937xM10728a);
        if (bVarM5535p0 instanceof b.a) {
            return ((b.a) bVarM5535p0).m5541a();
        }
        if (bVarM5535p0 instanceof b.c) {
            return null;
        }
        if (!(bVarM5535p0 instanceof b.C10076b)) {
            C5729x.m23182a();
            return null;
        }
        InterfaceC2379g interfaceC2379gM5539a = aVar.m5539a();
        if (interfaceC2379gM5539a == null) {
            interfaceC2379gM5539a = c1083k.m3937a().m3899d().mo32982b(new InterfaceC9649u.a(c5691b, null, null, 4, null));
        }
        InterfaceC2379g interfaceC2379g = interfaceC2379gM5539a;
        if ((interfaceC2379g != null ? interfaceC2379g.mo8612L() : null) != EnumC2376d0.f6508r) {
            C5692c c5692cMo8616d = interfaceC2379g != null ? interfaceC2379g.mo8616d() : null;
            if (c5692cMo8616d == null || c5692cMo8616d.m22996c() || !AbstractC1061t.m3842c(c5692cMo8616d.m22997d(), c1421g0.mo5529R().mo24031d())) {
                return null;
            }
            C1434n c1434n = new C1434n(c1083k, c1421g0.mo5529R(), interfaceC2379g, null, 8, null);
            c1083k.m3937a().m3900e().mo37754a(c1434n);
            return c1434n;
        }
        StringBuilder sb2 = new StringBuilder("Couldn't find kotlin binary class for light class created by kotlin binary file\nJavaClass: ");
        sb2.append(interfaceC2379g);
        sb2.append("\nClassId: ");
        sb2.append(c5691b);
        sb2.append("\nfindKotlinClass(JavaClass) = ");
        sb2.append(AbstractC2936w.m10730a(c1083k.m3937a().m3905j(), interfaceC2379g, c1421g0.m5533m0()));
        InterfaceC2937x interfaceC2937xM10731b = AbstractC2936w.m10731b(c1083k.m3937a().m3905j(), c5691b, c1421g0.m5533m0());
        sb2.append("\nfindKotlinClass(ClassId) = ");
        sb2.append(interfaceC2937xM10731b);
        sb2.append('\n');
        throw new IllegalStateException(sb2.toString());
    }

    /* JADX INFO: renamed from: o0 */
    public static final Set m5526o0(C1083k c1083k, C1421g0 c1421g0) {
        return c1083k.m3937a().m3899d().mo32981a(c1421g0.mo5529R().mo24031d());
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: B */
    public void mo5527B(Collection collection, C5695f c5695f) {
        collection.getClass();
        c5695f.getClass();
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: D */
    public Set mo5528D(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        return AbstractC5068b1.m20483e();
    }

    @Override // ca.AbstractC1447t0, za.AbstractC9914l, za.InterfaceC9913k
    /* JADX INFO: renamed from: c */
    public Collection mo5515c(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return AbstractC5114x.m20800o();
    }

    @Override // ca.AbstractC1447t0, za.AbstractC9914l, za.InterfaceC9916n
    /* JADX INFO: renamed from: g */
    public Collection mo5519g(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        interfaceC0184l.getClass();
        C9906d.a aVar = C9906d.f33395c;
        if (!c9906d.m38433a(aVar.m38441e() | aVar.m38439c())) {
            return AbstractC5114x.m20800o();
        }
        Iterable iterable = (Iterable) m5631K().invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            InterfaceC6019m interfaceC6019m = (InterfaceC6019m) obj;
            if (interfaceC6019m instanceof InterfaceC5995e) {
                C5695f name = ((InterfaceC5995e) interfaceC6019m).getName();
                name.getClass();
                if (((Boolean) interfaceC0184l.mo27m(name)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j0 */
    public final InterfaceC5995e m5530j0(C5695f c5695f, InterfaceC2379g interfaceC2379g) {
        if (!C5697h.f17915a.m23037a(c5695f)) {
            return null;
        }
        Set set = (Set) this.f4203p.invoke();
        if (interfaceC2379g != null || set == null || set.contains(c5695f.m23030c())) {
            return (InterfaceC5995e) this.f4204q.mo27m(new a(c5695f, interfaceC2379g));
        }
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final InterfaceC5995e m5531k0(InterfaceC2379g interfaceC2379g) {
        interfaceC2379g.getClass();
        return m5530j0(interfaceC2379g.getName(), interfaceC2379g);
    }

    @Override // za.AbstractC9914l, za.InterfaceC9916n
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public InterfaceC5995e mo5518f(C5695f c5695f, InterfaceC9468b interfaceC9468b) {
        c5695f.getClass();
        interfaceC9468b.getClass();
        return m5530j0(c5695f, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final C4723c m5533m0() {
        return m5632L().m3937a().m3897b().m10677f().m5829g().mo5860g();
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public C1415d0 mo5529R() {
        return this.f4202o;
    }

    /* JADX INFO: renamed from: p0 */
    public final b m5535p0(InterfaceC2937x interfaceC2937x) {
        if (interfaceC2937x == null) {
            return b.C10076b.f4208a;
        }
        if (interfaceC2937x.mo10733b().m12592c() != C3368a.a.f9170u) {
            return b.c.f4209a;
        }
        InterfaceC5995e interfaceC5995eM10685n = m5632L().m3937a().m3897b().m10685n(interfaceC2937x);
        return interfaceC5995eM10685n != null ? new b.a(interfaceC5995eM10685n) : b.C10076b.f4208a;
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: v */
    public Set mo5536v(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        if (!c9906d.m38433a(C9906d.f33395c.m38441e())) {
            return AbstractC5068b1.m20483e();
        }
        Set set = (Set) this.f4203p.invoke();
        if (set != null) {
            HashSet hashSet = new HashSet();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(C5695f.m23027j((String) it.next()));
            }
            return hashSet;
        }
        InterfaceC2393u interfaceC2393u = this.f4201n;
        if (interfaceC0184l == null) {
            interfaceC0184l = AbstractC6378i.m25367k();
        }
        Collection<InterfaceC2379g> collectionMo8649w = interfaceC2393u.mo8649w(interfaceC0184l);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (InterfaceC2379g interfaceC2379g : collectionMo8649w) {
            C5695f name = interfaceC2379g.mo8612L() == EnumC2376d0.f6507q ? null : interfaceC2379g.getName();
            if (name != null) {
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: x */
    public Set mo5537x(C9906d c9906d, InterfaceC0184l interfaceC0184l) {
        c9906d.getClass();
        return AbstractC5068b1.m20483e();
    }

    @Override // ca.AbstractC1447t0
    /* JADX INFO: renamed from: z */
    public InterfaceC1412c mo5538z() {
        return InterfaceC1412c.a.f4178a;
    }

    /* JADX INFO: renamed from: ca.g0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class b {

        /* JADX INFO: renamed from: ca.g0$b$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends b {

            /* JADX INFO: renamed from: a */
            public final InterfaceC5995e f4207a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5995e interfaceC5995e) {
                super(null);
                interfaceC5995e.getClass();
                this.f4207a = interfaceC5995e;
            }

            /* JADX INFO: renamed from: a */
            public final InterfaceC5995e m5541a() {
                return this.f4207a;
            }
        }

        /* JADX INFO: renamed from: ca.g0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10076b extends b {

            /* JADX INFO: renamed from: a */
            public static final C10076b f4208a = new C10076b();

            public C10076b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: ca.g0$b$c */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class c extends b {

            /* JADX INFO: renamed from: a */
            public static final c f4209a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        public b() {
        }
    }
}
