package p351xe;

import ae.C0076g;
import af.C0084g;
import be.AbstractC0283h;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import md.EnumC2824a;
import me.C2833a;
import p000a.AbstractC0000a;
import p025bc.C0260j;
import p038ce.C0551d;
import p068eh.AbstractC0921a;
import p233pd.C3406q;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3509m;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4305a;
import p302ud.C4306b;
import p302ud.C4308d;
import p302ud.C4320p;
import p302ud.C4322r;
import p332wb.C5051kn;

/* JADX INFO: renamed from: xe.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5791l {

    /* JADX INFO: renamed from: a */
    public Object f23536a;

    /* JADX INFO: renamed from: b */
    public Object f23537b;

    /* JADX INFO: renamed from: c */
    public Object f23538c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5791l(C4322r c4322r, int i9) {
        this.f23537b = c4322r;
        this.f23538c = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m10472d(C4322r c4322r, C4320p c4320p) {
        if (c4320p == null) {
            return;
        }
        if (c4320p.f9217g.mo6235a(EnumC2824a.f9133S)) {
            m10478j(c4322r, c4320p);
            return;
        }
        C4305a c4305aM35S = AbstractC0000a.m35S(c4322r, c4320p, c4322r.f14425z);
        if (c4305aM35S != null) {
            m10478j(c4322r, c4320p);
            m10475g(c4322r, c4305aM35S, c4320p);
        } else {
            c4320p.m6231w(EnumC2824a.f9166s);
            c4322r.m6383L("Not found block with instruction: ".concat(String.valueOf(c4320p)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m10473e(List list, List list2) {
        if (list2 == null || list2.isEmpty()) {
            return;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            C4320p c4320p = (C4320p) it.next();
            int size = list.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                if (list.get(i9) == c4320p) {
                    list.remove(i9);
                    break;
                }
                i9++;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static void m10474f(C4322r c4322r) {
        C5791l c5791l = new C5791l(c4322r, 0);
        for (C4305a c4305a : c4322r.f14425z) {
            for (C4320p c4320p : c4305a.f14351l) {
                if (c4320p.f9217g.mo6235a(EnumC2824a.f9168u)) {
                    ((ArrayList) c5791l.f23538c).add(c4320p);
                }
            }
            c5791l.f23536a = c4305a.f14351l;
            c5791l.m10483c();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static boolean m10475g(C4322r c4322r, C4305a c4305a, C4320p c4320p) {
        Iterator it = c4305a.f14351l.iterator();
        while (it.hasNext()) {
            if (((C4320p) it.next()) == c4320p) {
                it.remove();
                return true;
            }
        }
        if (c4320p.f9217g.mo6235a(EnumC2824a.f9133S)) {
            return false;
        }
        c4322r.m6383L("Failed to remove instruction: " + String.valueOf(c4320p) + " from block: " + String.valueOf(c4305a));
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static void m10476h(C4322r c4322r, C4320p c4320p) {
        Iterator it = c4320p.f14398m.iterator();
        while (it.hasNext()) {
            m10477i(c4322r, (AbstractC3508l) it.next());
        }
        if (c4320p.f14396k == EnumC3400k.f10972X) {
            for (AbstractC3508l abstractC3508l : c4320p.f14398m) {
                if (abstractC3508l instanceof C3514r) {
                    ((C3514r) abstractC3508l).f11440m.m7411p();
                }
            }
        }
        c4320p.m6231w(EnumC2824a.f9168u);
        c4320p.m6231w(EnumC2824a.f9166s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m10477i(C4322r c4322r, AbstractC3508l abstractC3508l) {
        if (!(abstractC3508l instanceof C3514r)) {
            if (abstractC3508l instanceof C3509m) {
                m10478j(c4322r, ((C3509m) abstractC3508l).f11421l);
            }
        } else {
            C3514r c3514r = (C3514r) abstractC3508l;
            C3515s c3515s = c3514r.f11440m;
            if (c3515s != null) {
                c3515s.m7406k(c3514r);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m10478j(C4322r c4322r, C4320p c4320p) {
        m10476h(c4322r, c4320p);
        m10480l(c4322r, c4320p);
        c4320p.m6231w(EnumC2824a.f9166s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static void m10479k(C4322r c4322r, List list) {
        list.forEach(new C0551d(c4322r, 6));
        list.forEach(new C0551d(c4322r, 7));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m10480l(C4322r c4322r, C4320p c4320p) {
        C3515s c3515s;
        C3514r c3514r = c4320p.f14397l;
        if (c3514r == null) {
            return;
        }
        if (c4322r != null && (c3515s = c3514r.f11440m) != null) {
            ArrayList arrayList = c3515s.f11445j;
            if (c3515s.f11444i.f11420j == c4320p) {
                int size = arrayList.size();
                if (size == 0) {
                    c4322r.f14404D.remove(c3515s);
                } else if (AbstractC0283h.m1159g(arrayList, new C4306b(4))) {
                    for (C3514r c3514r2 : new ArrayList(arrayList)) {
                        C4320p c4320p2 = c3514r2.f11420j;
                        if (c4320p2 != null) {
                            ((C3406q) c4320p2).m7186l0(c3514r2);
                        }
                    }
                    c4322r.f14404D.remove(c3515s);
                } else {
                    if (!AbstractC0283h.m1159g(arrayList, new C4306b(5))) {
                        String strValueOf = String.valueOf(c3515s);
                        String str = (String) arrayList.stream().map(new C2833a(27)).collect(Collectors.joining("\n  "));
                        StringBuilder sbM2258u = AbstractC0921a.m2258u(size, "Can't remove SSA var: ", strValueOf, ", still in use, count: ", ", list:\n  ");
                        sbM2258u.append(str);
                        throw new C0084g(sbM2258u.toString());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C3514r) it.next()).f11440m = null;
                    }
                    c4322r.f14404D.remove(c3515s);
                }
            }
        }
        c4320p.f14397l = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m10481a(C4320p c4320p) {
        ((ArrayList) this.f23538c).add(c4320p);
        m10478j((C4322r) this.f23537b, c4320p);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m10482b(List list, Function function) {
        List list2 = (List) this.f23536a;
        if (AbstractC5798s.m10514h(list)) {
            return;
        }
        List listM1131K = AbstractC0283h.m1131K(list, new C0260j(function, 14));
        Iterator it = listM1131K.iterator();
        if (it.hasNext()) {
            ((AbstractC5795p) it.next()).getClass();
            throw null;
        }
        listM1131K.sort(new C5051kn(list2).thenComparing(C5794o.f23541g));
        this.f23538c = new IdentityHashMap();
        list2.forEach(new C0076g(this, 21));
        listM1131K.forEach(new C4308d(this));
        this.f23537b = (Set) listM1131K.stream().map(new C2833a(28)).collect(Collectors.toSet());
        Iterator it2 = listM1131K.iterator();
        if (it2.hasNext()) {
            ((AbstractC5795p) it2.next()).getClass();
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m10483c() {
        C4322r c4322r = (C4322r) this.f23537b;
        ArrayList arrayList = (ArrayList) this.f23538c;
        if (arrayList.isEmpty()) {
            return;
        }
        if (((List) this.f23536a) == null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m10472d(c4322r, (C4320p) it.next());
            }
        } else {
            m10479k(c4322r, arrayList);
            m10473e((List) this.f23536a, arrayList);
        }
        arrayList.clear();
    }

    public C5791l(ArrayList arrayList) {
        this.f23536a = arrayList;
    }

    public C5791l(Method method, Method method2, Method method3) {
        this.f23537b = method;
        this.f23538c = method2;
        this.f23536a = method3;
    }
}
