package p351xe;

import be.C0287j;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nc.C2958a;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p068eh.AbstractC0921a;
import p214oc.C3126c;
import p215od.C3130c;
import p233pd.C3392c;
import p233pd.C3393d;
import p233pd.C3399j;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;

/* JADX INFO: renamed from: xe.m */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5792m {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2844b f23539a = AbstractC2846d.m6274b(AbstractC5792m.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C4320p m10484a(C4320p c4320p, EnumC3400k enumC3400k) {
        if (c4320p == null || c4320p.f14396k != enumC3400k) {
            return null;
        }
        return c4320p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static boolean m10485b(List list, C3514r c3514r) {
        if (list != null && !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC3508l abstractC3508l = (AbstractC3508l) it.next();
                if (abstractC3508l == c3514r || c3514r.m7396h0(abstractC3508l)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m10486c(AbstractC3508l abstractC3508l, C3514r c3514r) {
        C4320p c4320p;
        abstractC3508l.getClass();
        if (abstractC3508l instanceof C3514r) {
            return ((C3514r) abstractC3508l).m7396h0(c3514r);
        }
        if ((abstractC3508l instanceof C3509m) && (c4320p = ((C3509m) abstractC3508l).f11421l) != null) {
            List list = c4320p.f14398m;
            C3514r c3514r2 = c4320p.f14397l;
            if (c3514r2 != null && c3514r2.m7396h0(c3514r)) {
                return true;
            }
            if (list.size() != 0) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (m10486c((AbstractC3508l) it.next(), c3514r)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static String m10487d(int i9) {
        return i9 < 0 ? "?" : String.format("0x%04x", Integer.valueOf(i9));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static Object m10488e(C4325u c4325u, AbstractC3508l abstractC3508l) {
        abstractC3508l.getClass();
        if (abstractC3508l instanceof C3510n) {
            return abstractC3508l;
        }
        if (!(abstractC3508l instanceof C3514r)) {
            if (abstractC3508l instanceof C3509m) {
                return m10489f(c4325u, ((C3509m) abstractC3508l).f11421l);
            }
            return null;
        }
        C4320p c4320pM7394f0 = ((C3514r) abstractC3508l).m7394f0();
        if (c4320pM7394f0 == null) {
            return null;
        }
        return c4320pM7394f0.f14396k == EnumC3400k.f10983m ? m10488e(c4325u, c4320pM7394f0.mo7179S(0)) : m10489f(c4325u, c4320pM7394f0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static Object m10489f(C4325u c4325u, C4320p c4320p) {
        int iOrdinal = c4320p.f14396k.ordinal();
        if (iOrdinal == 0) {
            return c4320p.mo7179S(0);
        }
        if (iOrdinal == 1) {
            return ((C3393d) c4320p).f10930o;
        }
        if (iOrdinal == 2) {
            return ((C3392c) c4320p).f10929o;
        }
        if (iOrdinal != 32) {
            return null;
        }
        C3130c c3130c = (C3130c) ((C3399j) c4320p).f10948o;
        C4311g c4311gM8717h = c4325u.m8717h(c3130c);
        if (c4311gM8717h == null) {
            f23539a.mo6254h(c3130c, "Field {} not found");
            return null;
        }
        C2958a c2958a = (C2958a) c4311gM8717h.f9217g.mo6237c(C3126c.f10133f);
        if (c2958a != null) {
            return AbstractC0018a.m250n(c2958a);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static AbstractC3508l m10490g(C4320p c4320p) {
        if (c4320p == null || c4320p.f14398m.size() != 1) {
            return null;
        }
        return c4320p.mo7179S(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C4320p m10491h(AbstractC3508l abstractC3508l) {
        if (abstractC3508l == null || !(abstractC3508l instanceof C3509m)) {
            return null;
        }
        return ((C3509m) abstractC3508l).f11421l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m10492i(Object obj) {
        return obj == null ? HttpUrl.FRAGMENT_ENCODE_SET : obj instanceof String ? AbstractC0921a.m2251n("\"", String.valueOf(obj), "\"") : obj.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m10493j(C4320p c4320p, EnumC3400k enumC3400k) {
        return c4320p != null && c4320p.f14396k == enumC3400k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C4320p m10494k(C4320p c4320p, EnumC3400k enumC3400k, Predicate predicate) {
        C4320p c4320pM10494k;
        if (c4320p.f14396k == enumC3400k && predicate.test(c4320p)) {
            return c4320p;
        }
        for (AbstractC3508l abstractC3508l : c4320p.f14398m) {
            abstractC3508l.getClass();
            if ((abstractC3508l instanceof C3509m) && (c4320pM10494k = m10494k(((C3509m) abstractC3508l).f11421l, enumC3400k, predicate)) != null) {
                return c4320pM10494k;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m10495l(C4322r c4322r, C4320p c4320p, C0287j c0287j) {
        int size = c4320p.f14398m.size();
        for (int i9 = 0; i9 < size; i9++) {
            AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(i9);
            abstractC3508lMo7179S.getClass();
            if (abstractC3508lMo7179S instanceof C3509m) {
                C4320p c4320p2 = ((C3509m) abstractC3508lMo7179S).f11421l;
                m10495l(c4322r, c4320p2, c0287j);
                C4320p c4320p3 = (C4320p) c0287j.apply(c4320p2);
                if (c4320p3 != null) {
                    C5791l.m10477i(c4322r, abstractC3508lMo7179S);
                    c4320p.mo7182c0(i9, AbstractC3508l.m7373a0(c4320p3));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static C4320p m10496m(C4322r c4322r, EnumC3400k enumC3400k, Predicate predicate) {
        if (c4322r.f14415p) {
            return null;
        }
        Iterator it = c4322r.f14425z.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C4305a) it.next()).f14351l.iterator();
            while (it2.hasNext()) {
                C4320p c4320pM10494k = m10494k((C4320p) it2.next(), enumC3400k, predicate);
                if (c4320pM10494k != null) {
                    return c4320pM10494k;
                }
            }
        }
        return null;
    }
}
