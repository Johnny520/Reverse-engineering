package p083fe;

import be.C0280f0;
import be.C0293m;
import com.alibaba.fastjson2.reader.C0632k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import md.C2825b;
import p012ah.C0086a;
import p044d4.C0689b;
import p066ed.C0909b;
import p066ed.C0910c;
import p066ed.C0911d;
import p066ed.C0912e;
import p199nd.AbstractC2963b0;
import p199nd.C2961a0;
import p199nd.C2962b;
import p199nd.C2990v;
import p199nd.C2992x;
import p215od.C3128a;
import p215od.C3131d;
import p233pd.AbstractC3391b;
import p246qd.AbstractC3506j;
import p246qd.C3497a;
import p246qd.C3499c;
import p246qd.C3501e;
import p246qd.C3502f;
import p246qd.C3505i;
import p302ud.C4309e;
import p302ud.C4322r;
import p302ud.C4325u;
import p302ud.InterfaceC4317m;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: fe.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1214a {

    /* JADX INFO: renamed from: a */
    public final C4325u f4075a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [be.e.f(ud.u):void, ud.u.<init>(bc.k):void] */
    public /* synthetic */ C1214a(C4325u c4325u) {
        this.f4075a = c4325u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m3334b(AbstractC2963b0 abstractC2963b0, AbstractC3506j abstractC3506j, Collection collection) {
        if (collection.isEmpty()) {
            return;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (AbstractC5798s.m10520n(((AbstractC3506j) it.next()).mo7348i())) {
                abstractC3506j.m7363C(new C0689b(collection, abstractC2963b0, abstractC3506j, 3));
                return;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static void m3335c(C4322r c4322r, AbstractC3506j abstractC3506j) {
        if (abstractC3506j.m7365c()) {
            m3334b(c4322r, abstractC3506j, m3336e(c4322r));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:22:0x0034 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.HashSet, java.util.Set] */
    /* JADX WARN: Type inference failed for: r5v0, types: [md.e, ud.r] */
    /* JADX INFO: renamed from: e */
    public static Set m3336e(C4322r c4322r) {
        ?? hashSet;
        C2961a0 c2961a0 = (C2961a0) c4322r.f9217g.mo6237c(C2825b.f9204s);
        if (c2961a0 != null) {
            return c2961a0.f9713g;
        }
        HashSet hashSet2 = new HashSet();
        C4309e c4309e = c4322r.f14411l;
        if (c4309e.m8659d0()) {
            hashSet = new HashSet(c4309e.f14378r);
            C4309e c4309e2 = c4309e.f14384x;
            while (true) {
                C4309e c4309e3 = c4309e2;
                C4309e c4309e4 = c4309e;
                c4309e = c4309e3;
                if (c4309e == c4309e4) {
                    break;
                }
                hashSet.addAll(c4309e.f14378r);
                c4309e2 = c4309e.f14384x;
            }
        } else {
            hashSet = c4309e.f14378r;
        }
        hashSet2.addAll(hashSet);
        hashSet2.addAll(c4322r.f14421v);
        boolean zIsEmpty = hashSet2.isEmpty();
        Set set = hashSet2;
        if (zIsEmpty) {
            set = Collections.EMPTY_SET;
        }
        C2961a0 c2961a02 = C2961a0.f9712h;
        C2961a0 c2961a03 = AbstractC5798s.m10514h(set) ? C2961a0.f9712h : new C2961a0(set);
        c4322r.m6233y(c2961a03);
        return c2961a03.f9713g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C3128a m3337h(C4322r c4322r) {
        C2992x c2992x = (C2992x) c4322r.f9217g.mo6237c(C2825b.f9203r);
        InterfaceC4317m interfaceC4317m = null;
        if (c2992x != null) {
            HashSet hashSet = c2992x.f9767i;
            String str = AbstractC5798s.f23545a;
            interfaceC4317m = (InterfaceC4317m) (hashSet.size() == 1 ? hashSet.iterator().next() : null);
        }
        if (interfaceC4317m != null) {
            return interfaceC4317m.mo2222q().f10153j;
        }
        C2990v c2990v = (C2990v) c4322r.f9217g.mo6237c(C2825b.f9201p);
        return c2990v != null ? m3337h(c2990v.f9761g) : c4322r.f14410k.f10153j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static Map m3338j(Map map, Map map2) {
        if (map.isEmpty()) {
            return map2;
        }
        if (map2.isEmpty()) {
            return map;
        }
        HashMap map3 = new HashMap(map2.size() + map.size());
        for (Map.Entry entry : map.entrySet()) {
            AbstractC3506j abstractC3506j = (AbstractC3506j) map2.remove((AbstractC3506j) entry.getValue());
            if (abstractC3506j != null) {
                map3.put((AbstractC3506j) entry.getKey(), abstractC3506j);
            } else {
                map3.put((AbstractC3506j) entry.getKey(), (AbstractC3506j) entry.getValue());
            }
        }
        map3.putAll(map2);
        return map3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m3339a(AbstractC2963b0 abstractC2963b0, AbstractC2963b0 abstractC2963b02, C0086a c0086a) {
        C4309e c4309eMo6387P = abstractC2963b0 instanceof C4309e ? (C4309e) abstractC2963b0 : abstractC2963b0.mo6387P();
        C4309e c4309eMo6387P2 = abstractC2963b02 instanceof C4309e ? (C4309e) abstractC2963b02 : abstractC2963b02.mo6387P();
        if (c4309eMo6387P.equals(c4309eMo6387P2) || c4309eMo6387P.m8656a0().equals(c4309eMo6387P2.m8656a0())) {
            return;
        }
        if (c4309eMo6387P.f14374n.equals(c4309eMo6387P2.f14374n)) {
            do {
                if (abstractC2963b0.mo6386O().m853e()) {
                    c0086a.m470z(abstractC2963b0, 0);
                }
                abstractC2963b0 = abstractC2963b0.mo6387P();
            } while (abstractC2963b0 != null);
            return;
        }
        C0632k c0632k = new C0632k(this, c4309eMo6387P2, c0086a, 3);
        do {
            c0632k.accept(abstractC2963b0);
            abstractC2963b0 = abstractC2963b0.mo6387P();
        } while (abstractC2963b0 != null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public List m3340d(AbstractC3506j abstractC3506j) {
        C4325u c4325u = this.f4075a;
        C4309e c4309eM8716g = c4325u.m8716g(abstractC3506j);
        if (c4309eM8716g != null) {
            return c4309eM8716g.f14378r;
        }
        C0909b c0909bM2214c = c4325u.f14453s.m2214c(abstractC3506j);
        if (c0909bM2214c == null || c0909bM2214c.f2830e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        List list = c0909bM2214c.f2830e;
        return list == null ? Collections.EMPTY_LIST : list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public InterfaceC4317m m3341f(C3131d c3131d) {
        C0911d c0911d;
        C4325u c4325u = this.f4075a;
        C4322r c4322rM8718i = c4325u.m8718i(c3131d);
        if (c4322rM8718i != null) {
            return c4322rM8718i;
        }
        C0910c c0910c = c4325u.f14453s;
        HashMap map = c0910c.f2834b;
        C3128a c3128a = c3131d.f10153j;
        String str = c3131d.f10154k;
        C0909b c0909b = (C0909b) map.get(c3128a.f10138g.mo7350l());
        if (c0909b == null) {
            return null;
        }
        C0911d c0911d2 = (C0911d) c0909b.f2829d.get(str);
        if (c0911d2 != null) {
            return c0911d2;
        }
        for (AbstractC3506j abstractC3506j : c0909b.f2828c) {
            C0909b c0909b2 = (C0909b) c0910c.f2834b.get(abstractC3506j.mo7350l());
            if (c0909b2 == null) {
                c0910c.f2837e.add(abstractC3506j.mo7350l());
            }
            if (c0909b2 != null && (c0911d = (C0911d) c0909b2.f2829d.get(str)) != null) {
                return c0911d;
            }
        }
        return new C0912e(c3131d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public InterfaceC4317m m3342g(AbstractC3391b abstractC3391b) {
        InterfaceC4317m interfaceC4317m = (InterfaceC4317m) abstractC3391b.f9217g.mo6237c(C2825b.f9182I);
        return interfaceC4317m != null ? interfaceC4317m : m3341f(abstractC3391b.mo7169i0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public Map m3343i(AbstractC3506j abstractC3506j) {
        if (!abstractC3506j.mo7354t()) {
            return Collections.EMPTY_MAP;
        }
        List listM3340d = this.f4075a.f14443i.m3340d(abstractC3506j);
        if (listM3340d.isEmpty()) {
            return Collections.EMPTY_MAP;
        }
        List listMo7346j = abstractC3506j.mo7346j();
        if (AbstractC5798s.m10514h(listMo7346j)) {
            return Collections.EMPTY_MAP;
        }
        int size = listMo7346j.size();
        if (size != listM3340d.size()) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(size);
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7346j.get(i9);
            AbstractC3506j c3499c = (AbstractC3506j) listM3340d.get(i9);
            if (c3499c.mo7348i() != null) {
                c3499c = new C3499c(c3499c.mo7350l(), Collections.EMPTY_LIST);
            }
            map.put(c3499c, abstractC3506j2);
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public boolean m3344k(AbstractC3506j abstractC3506j, C3131d c3131d, ArrayList arrayList) {
        if (abstractC3506j != null && abstractC3506j.mo7351v()) {
            boolean z9 = c3131d.m6663f() || c3131d.m6662e();
            C4325u c4325u = this.f4075a;
            C4309e c4309eM8716g = c4325u.m8716g(abstractC3506j);
            if (c4309eM8716g != null) {
                for (C4322r c4322r : c4309eM8716g.f14380t) {
                    if (c3131d.m6664g(c4322r.f14410k)) {
                        arrayList.add(c4322r);
                    }
                }
                if (!z9) {
                    m3344k(c4309eM8716g.f14376p, c3131d, arrayList);
                    Iterator it = c4309eM8716g.f14377q.iterator();
                    while (it.hasNext()) {
                        m3344k((AbstractC3506j) it.next(), c3131d, arrayList);
                    }
                }
            } else {
                C0909b c0909bM2214c = c4325u.f14453s.m2214c(abstractC3506j);
                if (c0909bM2214c != null) {
                    for (C0911d c0911d : c0909bM2214c.f2829d.values()) {
                        if (c3131d.m6664g(c0911d.f2838g)) {
                            arrayList.add(c0911d);
                        }
                    }
                    if (!z9) {
                        for (AbstractC3506j abstractC3506j2 : c0909bM2214c.f2828c) {
                            m3344k(abstractC3506j2, c3131d, arrayList);
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public AbstractC3506j m3345l(AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2, AbstractC3506j abstractC3506j3) {
        C2962b c2962b = null;
        if (abstractC3506j3 == null || abstractC3506j2 == null) {
            return null;
        }
        Map mapM3338j = Collections.EMPTY_MAP;
        C4309e c4309eM8716g = this.f4075a.m8716g(abstractC3506j);
        if (c4309eM8716g != null) {
            c2962b = (C2962b) c4309eM8716g.f9217g.mo6237c(C2825b.f9192g);
            if (c2962b == null) {
                HashMap map = new HashMap();
                AbstractC3506j abstractC3506j4 = c4309eM8716g.f14373m.f10138g;
                map.put(abstractC3506j4.mo7350l(), m3343i(abstractC3506j4));
                c4309eM8716g.m8671p0(new C0280f0(this, 4, map));
                C2962b c2962b2 = new C2962b(c4309eM8716g.f14378r, map);
                c4309eM8716g.m6233y(c2962b2);
                c2962b = c2962b2;
            }
        }
        if (c2962b != null) {
            Map map2 = (Map) c2962b.f9715h.get(abstractC3506j2.mo7350l());
            if (map2 == null) {
                map2 = mapM3338j;
            }
            mapM3338j = m3338j(mapM3338j, map2);
        }
        Map mapM3338j2 = m3338j(mapM3338j, m3343i(abstractC3506j));
        for (AbstractC3506j abstractC3506jMo7353m = abstractC3506j.mo7353m(); abstractC3506jMo7353m != null; abstractC3506jMo7353m = abstractC3506jMo7353m.mo7353m()) {
            mapM3338j2 = m3338j(mapM3338j2, m3343i(abstractC3506jMo7353m));
        }
        return m3346m(abstractC3506j3, mapM3338j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public AbstractC3506j m3346m(AbstractC3506j abstractC3506j, Map map) {
        if (map.isEmpty()) {
            return null;
        }
        abstractC3506j.getClass();
        if (abstractC3506j instanceof C3499c) {
            return (AbstractC3506j) map.get(abstractC3506j);
        }
        if (abstractC3506j instanceof C3497a) {
            AbstractC3506j abstractC3506jM3346m = m3346m(abstractC3506j.mo7340g(), map);
            if (abstractC3506jM3346m == null) {
                return null;
            }
            return new C3497a(abstractC3506jM3346m);
        }
        AbstractC3506j abstractC3506jMo7356r = abstractC3506j.mo7356r();
        if (abstractC3506jMo7356r != null && abstractC3506jMo7356r.m7365c()) {
            AbstractC3506j abstractC3506jM3346m2 = m3346m(abstractC3506jMo7356r, map);
            if (abstractC3506jM3346m2 == null) {
                return null;
            }
            return new C3505i(abstractC3506j.mo7355q(), abstractC3506jM3346m2);
        }
        if (!abstractC3506j.mo7354t()) {
            return null;
        }
        AbstractC3506j abstractC3506jMo7353m = abstractC3506j.mo7353m();
        if (abstractC3506jMo7353m == null) {
            List listMo7346j = abstractC3506j.mo7346j();
            if (AbstractC5798s.m10520n(listMo7346j)) {
                return AbstractC3506j.m7358e(abstractC3506j, AbstractC5798s.m10509c(listMo7346j, new C0293m(this, 3, map)));
            }
            return null;
        }
        AbstractC3506j abstractC3506jM3346m3 = m3346m(abstractC3506jMo7353m, map);
        if (abstractC3506jM3346m3 == null) {
            return null;
        }
        AbstractC3506j abstractC3506jMo7352k = abstractC3506j.mo7352k();
        AbstractC3506j abstractC3506jM3346m4 = m3346m(abstractC3506jMo7352k, map);
        if (abstractC3506jM3346m4 != null) {
            abstractC3506jMo7352k = abstractC3506jM3346m4;
        }
        return new C3502f((C3501e) abstractC3506jM3346m3, (C3501e) abstractC3506jMo7352k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public void m3347n(AbstractC3506j abstractC3506j, C0280f0 c0280f0) {
        C4325u c4325u = this.f4075a;
        C4309e c4309eM8716g = c4325u.m8716g(abstractC3506j);
        if (c4309eM8716g != null) {
            c4309eM8716g.m8671p0(c0280f0);
            return;
        }
        C0909b c0909bM2214c = c4325u.f14453s.m2214c(abstractC3506j);
        if (c0909bM2214c != null) {
            for (AbstractC3506j abstractC3506j2 : c0909bM2214c.f2828c) {
                if (!abstractC3506j2.equals(AbstractC3506j.f11394k)) {
                    c0280f0.accept(abstractC3506j, abstractC3506j2);
                    m3347n(abstractC3506j2, c0280f0);
                }
            }
        }
    }
}
