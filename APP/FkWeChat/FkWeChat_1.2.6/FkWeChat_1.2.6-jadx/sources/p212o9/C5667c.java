package p212o9;

import java.lang.annotation.Annotation;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5114x;
import p186m9.C5123d;
import p186m9.C5135p;
import p186m9.EnumC5132m;
import p199n9.AbstractC5524f;
import p213oa.AbstractC5694e;
import p213oa.C5691b;
import p213oa.C5692c;
import p213oa.C5693d;
import p213oa.C5695f;
import p213oa.C5697h;
import p213oa.C5698i;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8644z;
import p343xa.EnumC9476f;

/* JADX INFO: renamed from: o9.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5667c {

    /* JADX INFO: renamed from: a */
    public static final C5667c f17796a;

    /* JADX INFO: renamed from: b */
    public static final String f17797b;

    /* JADX INFO: renamed from: c */
    public static final String f17798c;

    /* JADX INFO: renamed from: d */
    public static final String f17799d;

    /* JADX INFO: renamed from: e */
    public static final String f17800e;

    /* JADX INFO: renamed from: f */
    public static final C5691b f17801f;

    /* JADX INFO: renamed from: g */
    public static final C5692c f17802g;

    /* JADX INFO: renamed from: h */
    public static final C5691b f17803h;

    /* JADX INFO: renamed from: i */
    public static final C5691b f17804i;

    /* JADX INFO: renamed from: j */
    public static final C5691b f17805j;

    /* JADX INFO: renamed from: k */
    public static final HashMap f17806k;

    /* JADX INFO: renamed from: l */
    public static final HashMap f17807l;

    /* JADX INFO: renamed from: m */
    public static final HashMap f17808m;

    /* JADX INFO: renamed from: n */
    public static final HashMap f17809n;

    /* JADX INFO: renamed from: o */
    public static final HashMap f17810o;

    /* JADX INFO: renamed from: p */
    public static final HashMap f17811p;

    /* JADX INFO: renamed from: q */
    public static final List f17812q;

    /* JADX INFO: renamed from: o9.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C5691b f17813a;

        /* JADX INFO: renamed from: b */
        public final C5691b f17814b;

        /* JADX INFO: renamed from: c */
        public final C5691b f17815c;

        public a(C5691b c5691b, C5691b c5691b2, C5691b c5691b3) {
            c5691b.getClass();
            c5691b2.getClass();
            c5691b3.getClass();
            this.f17813a = c5691b;
            this.f17814b = c5691b2;
            this.f17815c = c5691b3;
        }

        /* JADX INFO: renamed from: a */
        public final C5691b m22896a() {
            return this.f17813a;
        }

        /* JADX INFO: renamed from: b */
        public final C5691b m22897b() {
            return this.f17814b;
        }

        /* JADX INFO: renamed from: c */
        public final C5691b m22898c() {
            return this.f17815c;
        }

        /* JADX INFO: renamed from: d */
        public final C5691b m22899d() {
            return this.f17813a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f17813a, aVar.f17813a) && AbstractC1061t.m3842c(this.f17814b, aVar.f17814b) && AbstractC1061t.m3842c(this.f17815c, aVar.f17815c);
        }

        public int hashCode() {
            return (((this.f17813a.hashCode() * 31) + this.f17814b.hashCode()) * 31) + this.f17815c.hashCode();
        }

        public String toString() {
            return "PlatformMutabilityMapping(javaClass=" + this.f17813a + ", kotlinReadOnly=" + this.f17814b + ", kotlinMutable=" + this.f17815c + ')';
        }
    }

    static {
        C5667c c5667c = new C5667c();
        f17796a = c5667c;
        StringBuilder sb2 = new StringBuilder();
        AbstractC5524f.a aVar = AbstractC5524f.a.f17274f;
        sb2.append(aVar.m22514b());
        sb2.append('.');
        sb2.append(aVar.m22513a());
        f17797b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        AbstractC5524f.b bVar = AbstractC5524f.b.f17275f;
        sb3.append(bVar.m22514b());
        sb3.append('.');
        sb3.append(bVar.m22513a());
        f17798c = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        AbstractC5524f.d dVar = AbstractC5524f.d.f17277f;
        sb4.append(dVar.m22514b());
        sb4.append('.');
        sb4.append(dVar.m22513a());
        f17799d = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        AbstractC5524f.c cVar = AbstractC5524f.c.f17276f;
        sb5.append(cVar.m22514b());
        sb5.append('.');
        sb5.append(cVar.m22513a());
        f17800e = sb5.toString();
        C5691b.a aVar2 = C5691b.f17894d;
        C5691b c5691bM22993c = aVar2.m22993c(new C5692c("kotlin.jvm.functions.FunctionN"));
        f17801f = c5691bM22993c;
        f17802g = c5691bM22993c.m22982a();
        C5698i c5698i = C5698i.f17977a;
        f17803h = c5698i.m23048k();
        f17804i = c5698i.m23047j();
        f17805j = c5667c.m22886g(Class.class);
        f17806k = new HashMap();
        f17807l = new HashMap();
        f17808m = new HashMap();
        f17809n = new HashMap();
        f17810o = new HashMap();
        f17811p = new HashMap();
        C5691b c5691bM22993c2 = aVar2.m22993c(C5135p.a.f15568W);
        a aVar3 = new a(c5667c.m22886g(Iterable.class), c5691bM22993c2, new C5691b(c5691bM22993c2.m22986f(), AbstractC5694e.m23024g(C5135p.a.f15581e0, c5691bM22993c2.m22986f()), false));
        C5691b c5691bM22993c3 = aVar2.m22993c(C5135p.a.f15566V);
        a aVar4 = new a(c5667c.m22886g(Iterator.class), c5691bM22993c3, new C5691b(c5691bM22993c3.m22986f(), AbstractC5694e.m23024g(C5135p.a.f15579d0, c5691bM22993c3.m22986f()), false));
        C5691b c5691bM22993c4 = aVar2.m22993c(C5135p.a.f15569X);
        a aVar5 = new a(c5667c.m22886g(Collection.class), c5691bM22993c4, new C5691b(c5691bM22993c4.m22986f(), AbstractC5694e.m23024g(C5135p.a.f15583f0, c5691bM22993c4.m22986f()), false));
        C5691b c5691bM22993c5 = aVar2.m22993c(C5135p.a.f15570Y);
        a aVar6 = new a(c5667c.m22886g(List.class), c5691bM22993c5, new C5691b(c5691bM22993c5.m22986f(), AbstractC5694e.m23024g(C5135p.a.f15585g0, c5691bM22993c5.m22986f()), false));
        C5691b c5691bM22993c6 = aVar2.m22993c(C5135p.a.f15573a0);
        a aVar7 = new a(c5667c.m22886g(Set.class), c5691bM22993c6, new C5691b(c5691bM22993c6.m22986f(), AbstractC5694e.m23024g(C5135p.a.f15589i0, c5691bM22993c6.m22986f()), false));
        C5691b c5691bM22993c7 = aVar2.m22993c(C5135p.a.f15571Z);
        a aVar8 = new a(c5667c.m22886g(ListIterator.class), c5691bM22993c7, new C5691b(c5691bM22993c7.m22986f(), AbstractC5694e.m23024g(C5135p.a.f15587h0, c5691bM22993c7.m22986f()), false));
        C5692c c5692c = C5135p.a.f15575b0;
        C5691b c5691bM22993c8 = aVar2.m22993c(c5692c);
        a aVar9 = new a(c5667c.m22886g(Map.class), c5691bM22993c8, new C5691b(c5691bM22993c8.m22986f(), AbstractC5694e.m23024g(C5135p.a.f15591j0, c5691bM22993c8.m22986f()), false));
        C5691b c5691bM22984d = aVar2.m22993c(c5692c).m22984d(C5135p.a.f15577c0.m22999f());
        List listM20803r = AbstractC5114x.m20803r(aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, new a(c5667c.m22886g(Map.Entry.class), c5691bM22984d, new C5691b(c5691bM22984d.m22986f(), AbstractC5694e.m23024g(C5135p.a.f15593k0, c5691bM22984d.m22986f()), false)));
        f17812q = listM20803r;
        c5667c.m22885f(Object.class, C5135p.a.f15574b);
        c5667c.m22885f(String.class, C5135p.a.f15586h);
        c5667c.m22885f(CharSequence.class, C5135p.a.f15584g);
        c5667c.m22884e(Throwable.class, C5135p.a.f15612u);
        c5667c.m22885f(Cloneable.class, C5135p.a.f15578d);
        c5667c.m22885f(Number.class, C5135p.a.f15606r);
        c5667c.m22884e(Comparable.class, C5135p.a.f15614v);
        c5667c.m22885f(Enum.class, C5135p.a.f15608s);
        c5667c.m22884e(Annotation.class, C5135p.a.f15536G);
        Iterator it = listM20803r.iterator();
        while (it.hasNext()) {
            f17796a.m22883d((a) it.next());
        }
        for (EnumC9476f enumC9476f : EnumC9476f.values()) {
            C5667c c5667c2 = f17796a;
            C5691b.a aVar10 = C5691b.f17894d;
            C5692c c5692cM36917k = enumC9476f.m36917k();
            c5692cM36917k.getClass();
            C5691b c5691bM22993c9 = aVar10.m22993c(c5692cM36917k);
            EnumC5132m enumC5132mM36916j = enumC9476f.m36916j();
            enumC5132mM36916j.getClass();
            c5667c2.m22880a(c5691bM22993c9, aVar10.m22993c(C5135p.m20963c(enumC5132mM36916j)));
        }
        for (C5691b c5691b : C5123d.f15436a.m20826a()) {
            f17796a.m22880a(C5691b.f17894d.m22993c(new C5692c("kotlin.jvm.internal." + c5691b.m22988h().m23030c() + "CompanionObject")), c5691b.m22984d(C5697h.f17918d));
        }
        for (int i10 = 0; i10 < 23; i10++) {
            C5667c c5667c3 = f17796a;
            c5667c3.m22880a(C5691b.f17894d.m22993c(new C5692c("kotlin.jvm.functions.Function" + i10)), C5135p.m20961a(i10));
            c5667c3.m22882c(new C5692c(f17798c + i10), f17803h);
        }
        for (int i11 = 0; i11 < 22; i11++) {
            AbstractC5524f.c cVar2 = AbstractC5524f.c.f17276f;
            f17796a.m22882c(new C5692c((cVar2.m22514b() + '.' + cVar2.m22513a()) + i11), f17803h);
        }
        C5667c c5667c4 = f17796a;
        c5667c4.m22882c(new C5692c("kotlin.concurrent.atomics.AtomicInt"), c5667c4.m22886g(AtomicInteger.class));
        c5667c4.m22882c(new C5692c("kotlin.concurrent.atomics.AtomicLong"), c5667c4.m22886g(AtomicLong.class));
        c5667c4.m22882c(new C5692c("kotlin.concurrent.atomics.AtomicBoolean"), c5667c4.m22886g(AtomicBoolean.class));
        c5667c4.m22882c(new C5692c("kotlin.concurrent.atomics.AtomicReference"), c5667c4.m22886g(AtomicReference.class));
        c5667c4.m22882c(new C5692c("kotlin.concurrent.atomics.AtomicIntArray"), c5667c4.m22886g(AtomicIntegerArray.class));
        c5667c4.m22882c(new C5692c("kotlin.concurrent.atomics.AtomicLongArray"), c5667c4.m22886g(AtomicLongArray.class));
        c5667c4.m22882c(new C5692c("kotlin.concurrent.atomics.AtomicArray"), c5667c4.m22886g(AtomicReferenceArray.class));
        c5667c4.m22882c(C5135p.a.f15576c.m23016m(), c5667c4.m22886g(Void.class));
    }

    /* JADX INFO: renamed from: a */
    public final void m22880a(C5691b c5691b, C5691b c5691b2) {
        m22881b(c5691b, c5691b2);
        m22882c(c5691b2.m22982a(), c5691b);
    }

    /* JADX INFO: renamed from: b */
    public final void m22881b(C5691b c5691b, C5691b c5691b2) {
        f17806k.put(c5691b.m22982a().m23002i(), c5691b2);
    }

    /* JADX INFO: renamed from: c */
    public final void m22882c(C5692c c5692c, C5691b c5691b) {
        f17807l.put(c5692c.m23002i(), c5691b);
    }

    /* JADX INFO: renamed from: d */
    public final void m22883d(a aVar) {
        C5691b c5691bM22896a = aVar.m22896a();
        C5691b c5691bM22897b = aVar.m22897b();
        C5691b c5691bM22898c = aVar.m22898c();
        m22880a(c5691bM22896a, c5691bM22897b);
        m22882c(c5691bM22898c.m22982a(), c5691bM22896a);
        f17810o.put(c5691bM22898c, c5691bM22897b);
        f17811p.put(c5691bM22897b, c5691bM22898c);
        C5692c c5692cM22982a = c5691bM22897b.m22982a();
        C5692c c5692cM22982a2 = c5691bM22898c.m22982a();
        f17808m.put(c5691bM22898c.m22982a().m23002i(), c5692cM22982a);
        f17809n.put(c5692cM22982a.m23002i(), c5692cM22982a2);
    }

    /* JADX INFO: renamed from: e */
    public final void m22884e(Class cls, C5692c c5692c) {
        m22880a(m22886g(cls), C5691b.f17894d.m22993c(c5692c));
    }

    /* JADX INFO: renamed from: f */
    public final void m22885f(Class cls, C5693d c5693d) {
        m22884e(cls, c5693d.m23016m());
    }

    /* JADX INFO: renamed from: g */
    public final C5691b m22886g(Class cls) {
        if (!cls.isPrimitive()) {
            cls.isArray();
        }
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            C5691b.a aVar = C5691b.f17894d;
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            return aVar.m22993c(new C5692c(canonicalName));
        }
        C5691b c5691bM22886g = m22886g(declaringClass);
        C5695f c5695fM23027j = C5695f.m23027j(cls.getSimpleName());
        c5695fM23027j.getClass();
        return c5691bM22886g.m22984d(c5695fM23027j);
    }

    /* JADX INFO: renamed from: h */
    public final C5692c m22887h() {
        return f17802g;
    }

    /* JADX INFO: renamed from: i */
    public final List m22888i() {
        return f17812q;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m22889j(C5693d c5693d, String str) {
        Integer numM33252s;
        String strM23005a = c5693d.m23005a();
        if (!AbstractC8611a0.m33075T(strM23005a, str, false, 2, null)) {
            return false;
        }
        String strSubstring = strM23005a.substring(str.length());
        return (AbstractC8621f0.m33125Z0(strSubstring, '0', false, 2, null) || (numM33252s = AbstractC8644z.m33252s(strSubstring)) == null || numM33252s.intValue() < 23) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m22890k(C5693d c5693d) {
        return f17808m.containsKey(c5693d);
    }

    /* JADX INFO: renamed from: l */
    public final boolean m22891l(C5693d c5693d) {
        return f17809n.containsKey(c5693d);
    }

    /* JADX INFO: renamed from: m */
    public final C5691b m22892m(C5692c c5692c) {
        c5692c.getClass();
        return (C5691b) f17806k.get(c5692c.m23002i());
    }

    /* JADX INFO: renamed from: n */
    public final C5691b m22893n(C5693d c5693d) {
        c5693d.getClass();
        return m22889j(c5693d, f17797b) ? f17801f : m22889j(c5693d, f17799d) ? f17801f : m22889j(c5693d, f17798c) ? f17803h : m22889j(c5693d, f17800e) ? f17803h : (C5691b) f17807l.get(c5693d);
    }

    /* JADX INFO: renamed from: o */
    public final C5692c m22894o(C5693d c5693d) {
        return (C5692c) f17808m.get(c5693d);
    }

    /* JADX INFO: renamed from: p */
    public final C5692c m22895p(C5693d c5693d) {
        return (C5692c) f17809n.get(c5693d);
    }
}
