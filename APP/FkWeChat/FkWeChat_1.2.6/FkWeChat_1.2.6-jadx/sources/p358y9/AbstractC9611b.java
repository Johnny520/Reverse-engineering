package p358y9;

import ga.C2602l;
import ga.EnumC2593i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p172l8.C4711r;
import p185m8.AbstractC5071c1;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5106t;
import p186m9.C5135p;
import p213oa.C5692c;

/* JADX INFO: renamed from: y9.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9611b {

    /* JADX INFO: renamed from: c */
    public static final a f32713c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final Map f32714d;

    /* JADX INFO: renamed from: a */
    public final C9616d0 f32715a;

    /* JADX INFO: renamed from: b */
    public final ConcurrentHashMap f32716b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (EnumC9613c enumC9613c : EnumC9613c.values()) {
            String strM37610c = enumC9613c.m37610c();
            if (linkedHashMap.get(strM37610c) == null) {
                linkedHashMap.put(strM37610c, enumC9613c);
            }
        }
        f32714d = linkedHashMap;
    }

    public AbstractC9611b(C9616d0 c9616d0) {
        c9616d0.getClass();
        this.f32715a = c9616d0;
        this.f32716b = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m37579f(Object obj) {
        obj.getClass();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final Set m37580b(Set set) {
        return set.contains(EnumC9613c.f32728u) ? AbstractC5071c1.m20503l(AbstractC5071c1.m20502k(AbstractC5106t.m20737h1(EnumC9613c.values()), EnumC9613c.f32729v), set) : set;
    }

    /* JADX INFO: renamed from: c */
    public abstract Iterable mo37581c(Object obj, boolean z10);

    /* JADX INFO: renamed from: d */
    public final C9618e0 m37582d(C9618e0 c9618e0, Iterable iterable) {
        EnumMap enumMapM37628b;
        iterable.getClass();
        if (!this.f32715a.m37622b()) {
            ArrayList<C9652w> arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                C9652w c9652wM37583e = m37583e(it.next());
                if (c9652wM37583e != null) {
                    arrayList.add(c9652wM37583e);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(EnumC9613c.class);
                for (C9652w c9652w : arrayList) {
                    for (EnumC9613c enumC9613c : c9652w.m37759e()) {
                        if (enumMap.containsKey(enumC9613c) && mo37592o()) {
                            C9652w c9652w2 = (C9652w) enumMap.get(enumC9613c);
                            if (c9652w2 != null) {
                                C2602l c2602lM37758d = c9652w2.m37758d();
                                C2602l c2602lM37758d2 = c9652w.m37758d();
                                if (!AbstractC1061t.m3842c(c2602lM37758d2, c2602lM37758d) && (!c2602lM37758d2.m9270d() || c2602lM37758d.m9270d())) {
                                    c9652w2 = (c2602lM37758d2.m9270d() || !c2602lM37758d.m9270d()) ? null : c9652w;
                                }
                                enumMap.put(enumC9613c, c9652w2);
                            }
                        } else {
                            enumMap.put(enumC9613c, c9652w);
                        }
                    }
                }
                EnumMap enumMap2 = (c9618e0 == null || (enumMapM37628b = c9618e0.m37628b()) == null) ? new EnumMap(EnumC9613c.class) : new EnumMap(enumMapM37628b);
                boolean z10 = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    EnumC9613c enumC9613c2 = (EnumC9613c) entry.getKey();
                    C9652w c9652w3 = (C9652w) entry.getValue();
                    if (c9652w3 != null) {
                        enumMap2.put(enumC9613c2, c9652w3);
                        z10 = true;
                    }
                }
                if (z10) {
                    return new C9618e0(enumMap2);
                }
            }
        }
        return c9618e0;
    }

    /* JADX INFO: renamed from: e */
    public final C9652w m37583e(Object obj) {
        C2602l c2602lM37586i;
        C9652w c9652wM37598u = m37598u(obj);
        if (c9652wM37598u != null) {
            return c9652wM37598u;
        }
        C4711r c4711rM37600w = m37600w(obj);
        if (c4711rM37600w == null) {
            return null;
        }
        Object objM18792a = c4711rM37600w.m18792a();
        Set set = (Set) c4711rM37600w.m18793b();
        EnumC9638o0 enumC9638o0M37597t = m37597t(obj);
        if (enumC9638o0M37597t == null) {
            enumC9638o0M37597t = m37596s(objM18792a);
        }
        if (enumC9638o0M37597t.m37700g() || (c2602lM37586i = m37586i(objM18792a, C9609a.f32712q)) == null) {
            return null;
        }
        return new C9652w(C2602l.m9267b(c2602lM37586i, null, enumC9638o0M37597t.m37701h(), 1, null), set, false, 4, null);
    }

    /* JADX INFO: renamed from: g */
    public final EnumC2593i m37584g(Iterable iterable) {
        EnumC2593i enumC2593i;
        iterable.getClass();
        Iterator it = iterable.iterator();
        EnumC2593i enumC2593i2 = null;
        while (it.hasNext()) {
            C5692c c5692cMo37588k = mo37588k(it.next());
            if (AbstractC5081g0.m20559a0(AbstractC9628j0.m37672o(), c5692cMo37588k)) {
                enumC2593i = EnumC2593i.f6888q;
            } else if (AbstractC5081g0.m20559a0(AbstractC9628j0.m37669l(), c5692cMo37588k)) {
                enumC2593i = EnumC2593i.f6889r;
            } else {
                continue;
            }
            if (enumC2593i2 != null && enumC2593i2 != enumC2593i) {
                return null;
            }
            enumC2593i2 = enumC2593i;
        }
        return enumC2593i2;
    }

    /* JADX INFO: renamed from: h */
    public final C2602l m37585h(Iterable iterable, InterfaceC0184l interfaceC0184l) {
        iterable.getClass();
        interfaceC0184l.getClass();
        Iterator it = iterable.iterator();
        C2602l c2602l = null;
        while (it.hasNext()) {
            C2602l c2602lM37586i = m37586i(it.next(), interfaceC0184l);
            if (c2602l != null) {
                if (c2602lM37586i != null && !AbstractC1061t.m3842c(c2602lM37586i, c2602l) && (!c2602lM37586i.m9270d() || c2602l.m9270d())) {
                    if (c2602lM37586i.m9270d() || !c2602l.m9270d()) {
                        return null;
                    }
                }
            }
            c2602l = c2602lM37586i;
        }
        return c2602l;
    }

    /* JADX INFO: renamed from: i */
    public final C2602l m37586i(Object obj, InterfaceC0184l interfaceC0184l) {
        C2602l c2602lM37594q;
        C2602l c2602lM37594q2 = m37594q(obj, ((Boolean) interfaceC0184l.mo27m(obj)).booleanValue());
        if (c2602lM37594q2 != null) {
            return c2602lM37594q2;
        }
        Object objM37599v = m37599v(obj);
        if (objM37599v == null) {
            return null;
        }
        EnumC9638o0 enumC9638o0M37596s = m37596s(obj);
        if (enumC9638o0M37596s.m37700g() || (c2602lM37594q = m37594q(objM37599v, ((Boolean) interfaceC0184l.mo27m(objM37599v)).booleanValue())) == null) {
            return null;
        }
        return C2602l.m9267b(c2602lM37594q, null, enumC9638o0M37596s.m37701h(), 1, null);
    }

    /* JADX INFO: renamed from: j */
    public final Object m37587j(Object obj, C5692c c5692c) {
        for (Object obj2 : mo37590m(obj)) {
            if (AbstractC1061t.m3842c(mo37588k(obj2), c5692c)) {
                return obj2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public abstract C5692c mo37588k(Object obj);

    /* JADX INFO: renamed from: l */
    public abstract Object mo37589l(Object obj);

    /* JADX INFO: renamed from: m */
    public abstract Iterable mo37590m(Object obj);

    /* JADX INFO: renamed from: n */
    public final boolean m37591n(Object obj, C5692c c5692c) {
        Iterable iterableMo37590m = mo37590m(obj);
        if ((iterableMo37590m instanceof Collection) && ((Collection) iterableMo37590m).isEmpty()) {
            return false;
        }
        Iterator it = iterableMo37590m.iterator();
        while (it.hasNext()) {
            if (AbstractC1061t.m3842c(mo37588k(it.next()), c5692c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public abstract boolean mo37592o();

    /* JADX INFO: renamed from: p */
    public final boolean m37593p(Object obj) {
        obj.getClass();
        Object objM37587j = m37587j(obj, C5135p.a.f15538H);
        if (objM37587j == null) {
            return false;
        }
        Iterable iterableMo37581c = mo37581c(objM37587j, false);
        if ((iterableMo37581c instanceof Collection) && ((Collection) iterableMo37581c).isEmpty()) {
            return false;
        }
        Iterator it = iterableMo37581c.iterator();
        while (it.hasNext()) {
            if (AbstractC1061t.m3842c((String) it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0088, code lost:
    
        r6 = ga.EnumC2599k.f6898r;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ga.C2602l m37594q(java.lang.Object r6, boolean r7) {
        /*
            r5 = this;
            oa.c r0 = r5.mo37588k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            y9.d0 r2 = r5.f32715a
            a9.l r2 = r2.m37623c()
            java.lang.Object r2 = r2.mo27m(r0)
            y9.o0 r2 = (p358y9.EnumC9638o0) r2
            boolean r3 = r2.m37700g()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = p358y9.AbstractC9628j0.m37670m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            ga.k r6 = ga.EnumC2599k.f6899s
            goto L8d
        L29:
            java.util.Set r3 = p358y9.AbstractC9628j0.m37671n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            ga.k r6 = ga.EnumC2599k.f6898r
            goto L8d
        L36:
            java.util.Set r3 = p358y9.AbstractC9628j0.m37659b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            ga.k r6 = ga.EnumC2599k.f6897q
            goto L8d
        L43:
            oa.c r3 = p358y9.AbstractC9628j0.m37660c()
            boolean r0 = p024b9.AbstractC1061t.m3842c(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.mo37581c(r6, r4)
            java.lang.Object r6 = p185m8.AbstractC5081g0.m20577k0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            ga.k r6 = ga.EnumC2599k.f6897q
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            ga.k r6 = ga.EnumC2599k.f6898r
            goto L8d
        L8b:
            ga.k r6 = ga.EnumC2599k.f6899s
        L8d:
            ga.l r0 = new ga.l
            boolean r1 = r2.m37701h()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p358y9.AbstractC9611b.m37594q(java.lang.Object, boolean):ga.l");
    }

    /* JADX INFO: renamed from: r */
    public final EnumC9638o0 m37595r(Object obj) {
        C5692c c5692cMo37588k = mo37588k(obj);
        return (c5692cMo37588k == null || !AbstractC9653x.m37761b().containsKey(c5692cMo37588k)) ? m37596s(obj) : (EnumC9638o0) this.f32715a.m37623c().mo27m(c5692cMo37588k);
    }

    /* JADX INFO: renamed from: s */
    public final EnumC9638o0 m37596s(Object obj) {
        EnumC9638o0 enumC9638o0M37597t = m37597t(obj);
        return enumC9638o0M37597t != null ? enumC9638o0M37597t : this.f32715a.m37624d().m37636c();
    }

    /* JADX INFO: renamed from: t */
    public final EnumC9638o0 m37597t(Object obj) {
        Iterable iterableMo37581c;
        String str;
        EnumC9638o0 enumC9638o0 = (EnumC9638o0) this.f32715a.m37624d().m37638e().get(mo37588k(obj));
        if (enumC9638o0 != null) {
            return enumC9638o0;
        }
        Object objM37587j = m37587j(obj, AbstractC9628j0.m37673p());
        if (objM37587j == null || (iterableMo37581c = mo37581c(objM37587j, false)) == null || (str = (String) AbstractC5081g0.m20577k0(iterableMo37581c)) == null) {
            return null;
        }
        EnumC9638o0 enumC9638o0M37637d = this.f32715a.m37624d().m37637d();
        if (enumC9638o0M37637d != null) {
            return enumC9638o0M37637d;
        }
        int iHashCode = str.hashCode();
        if (iHashCode != -2137067054) {
            if (iHashCode != -1838656823) {
                if (iHashCode == 2656902 && str.equals("WARN")) {
                    return EnumC9638o0.f32828t;
                }
            } else if (str.equals("STRICT")) {
                return EnumC9638o0.f32829u;
            }
        } else if (str.equals("IGNORE")) {
            return EnumC9638o0.f32827s;
        }
        return null;
    }

    /* JADX INFO: renamed from: u */
    public final C9652w m37598u(Object obj) {
        C9652w c9652w;
        if (this.f32715a.m37622b() || (c9652w = (C9652w) AbstractC9653x.m37760a().get(mo37588k(obj))) == null) {
            return null;
        }
        EnumC9638o0 enumC9638o0M37595r = m37595r(obj);
        if (enumC9638o0M37595r == EnumC9638o0.f32827s) {
            enumC9638o0M37595r = null;
        }
        if (enumC9638o0M37595r == null) {
            return null;
        }
        return C9652w.m37755b(c9652w, C2602l.m9267b(c9652w.m37758d(), null, enumC9638o0M37595r.m37701h(), 1, null), null, false, 6, null);
    }

    /* JADX INFO: renamed from: v */
    public final Object m37599v(Object obj) {
        Object objM37599v;
        obj.getClass();
        if (this.f32715a.m37624d().m37639f()) {
            return null;
        }
        if (AbstractC5081g0.m20559a0(AbstractC9628j0.m37658a(), mo37588k(obj)) || m37591n(obj, AbstractC9628j0.m37663f())) {
            return obj;
        }
        if (!m37591n(obj, AbstractC9628j0.m37665h())) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = this.f32716b;
        Object objMo37589l = mo37589l(obj);
        Object obj2 = concurrentHashMap.get(objMo37589l);
        if (obj2 != null) {
            return obj2;
        }
        Iterator it = mo37590m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                objM37599v = null;
                break;
            }
            objM37599v = m37599v(it.next());
            if (objM37599v != null) {
                break;
            }
        }
        if (objM37599v == null) {
            return null;
        }
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(objMo37589l, objM37599v);
        return objPutIfAbsent == null ? objM37599v : objPutIfAbsent;
    }

    /* JADX INFO: renamed from: w */
    public final C4711r m37600w(Object obj) {
        Object objM37587j;
        Object next;
        if (this.f32715a.m37624d().m37639f() || (objM37587j = m37587j(obj, AbstractC9628j0.m37664g())) == null) {
            return null;
        }
        Iterator it = mo37590m(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (m37599v(next) != null) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        Iterable iterableMo37581c = mo37581c(objM37587j, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it2 = iterableMo37581c.iterator();
        while (it2.hasNext()) {
            EnumC9613c enumC9613c = (EnumC9613c) f32714d.get((String) it2.next());
            if (enumC9613c != null) {
                linkedHashSet.add(enumC9613c);
            }
        }
        return new C4711r(next, m37580b(linkedHashSet));
    }

    /* JADX INFO: renamed from: y9.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
