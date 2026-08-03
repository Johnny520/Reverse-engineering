package be;

import ae.C0074e;
import ae.C0076g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import md.C2825b;
import md.EnumC2824a;
import p007a7.C0019b;
import p020b5.C0192k;
import p199nd.C2960a;
import p246qd.AbstractC3506j;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.C4325u;
import p351xe.C5787h;

/* JADX INFO: renamed from: be.h0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0284h0 extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f826g;

    /* JADX INFO: renamed from: h */
    public boolean f827h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ud.u.<init>(bc.k):void] */
    public /* synthetic */ C0284h0(int i9) {
        this.f826g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m1189i(C4309e c4309e, C4322r c4322r, C0192k c0192k) {
        if (c4322r.f14411l.equals(c4309e)) {
            return false;
        }
        if (c0192k.m857i()) {
            return !r2.f14384x.equals(c4309e);
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static boolean m1190j(C4309e c4309e, C4322r c4322r, C4322r c4322r2) {
        for (C4322r c4322r3 : c4309e.f14380t) {
            if (c4322r3 != c4322r) {
                for (C4322r c4322r4 : c4322r3.f14408H) {
                    if (!c4322r4.equals(c4322r2) && m1189i(c4309e, c4322r4, c4322r3.f14412m)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[EDGE_INSN: B:28:0x0084->B:81:0x015f BREAK  A[LOOP:2: B:72:0x0136->B:131:?, LOOP_LABEL: LOOP:2: B:72:0x0136->B:131:?]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a7 A[EDGE_INSN: B:33:0x00a7->B:63:0x0118 BREAK  A[LOOP:0: B:51:0x00e8->B:125:0x00e8, LOOP_LABEL: LOOP:0: B:51:0x00e8->B:125:0x00e8]] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x019b  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1191k(C4309e c4309e) {
        int i9;
        C4311g c4311g;
        boolean z9;
        if (!c4309e.f14375o.m857i()) {
            String str = c4309e.f14373m.f10139h;
            if (!str.contains("$") && !Character.isDigit(str.charAt(0))) {
                if (c4309e.f14367B.size() != 1 || c4309e.f14368C.size() != 1) {
                    return;
                }
                C4322r c4322r = (C4322r) c4309e.f14368C.get(0);
                if (!c4322r.f14410k.m6662e() || !c4322r.f14411l.m8658c0()) {
                    return;
                }
            }
        }
        C4322r c4322r2 = (C4322r) AbstractC0283h.m1185w(c4309e.f14380t, new C0019b(19));
        if (c4322r2 == null) {
            return;
        }
        if (c4322r2.f14408H.size() != 1) {
            List list = c4322r2.f14408H;
            if (!(list.isEmpty() ? false : AbstractC0283h.m1159g(list, new C0282g0(((C4322r) list.get(0)).f14411l, 0)))) {
                i9 = 0;
                break loop2;
            }
            C4322r c4322r3 = (C4322r) c4322r2.f14408H.get(0);
            C4309e c4309e2 = c4322r3.f14411l;
            if (c4309e2.equals(c4309e)) {
                C4322r c4322r4 = (C4322r) c4322r2.f14408H.get(0);
                if (c4322r4.f14410k.m6662e() && !c4309e.f14368C.isEmpty() && (c4311g = (C4311g) AbstractC0283h.m1185w(c4309e.f14381u, new C0282g0(c4309e, 1))) != null) {
                    List list2 = c4311g.f14393o;
                    if (list2.size() == 2 && list2.contains(c4322r4) && list2.containsAll(c4309e.f14368C) && m1190j(c4309e, c4322r2, c4322r4)) {
                        loop0: for (C4311g c4311g2 : c4309e.f14381u) {
                            if (c4311g2 != c4311g) {
                                Iterator it = c4311g2.f14393o.iterator();
                                while (it.hasNext()) {
                                    if (m1189i(c4309e, (C4322r) it.next(), c4311g2.f14391m)) {
                                        z9 = false;
                                        break loop0;
                                    }
                                }
                            }
                        }
                        c4311g.m6231w(EnumC2824a.f9123I);
                        z9 = true;
                        if (!z9) {
                        }
                    } else {
                        z9 = false;
                        if (!z9) {
                            i9 = 2;
                        }
                    }
                }
            } else if (!c4309e2.m8656a0().equals(c4309e) && m1190j(c4309e, c4322r2, c4322r3)) {
                loop2: for (C4311g c4311g3 : c4309e.f14381u) {
                    Iterator it2 = c4311g3.f14393o.iterator();
                    while (it2.hasNext()) {
                        if (m1189i(c4309e, (C4322r) it2.next(), c4311g3.f14391m)) {
                            i9 = 0;
                            break loop2;
                        }
                    }
                }
                i9 = 1;
            }
        }
        if (i9 == 0) {
            return;
        }
        List list3 = c4309e.f14377q;
        C4325u c4325u = c4309e.f14371k;
        int size = list3.size();
        AbstractC3506j abstractC3506j = null;
        if (size <= 1) {
            AbstractC3506j abstractC3506j2 = c4309e.f14376p;
            if (abstractC3506j2 == null || abstractC3506j2.equals(AbstractC3506j.f11394k)) {
                abstractC3506j = size == 1 ? (AbstractC3506j) c4309e.f14377q.get(0) : AbstractC3506j.f11394k;
            } else if (size == 0) {
                abstractC3506j = abstractC3506j2;
            } else {
                AbstractC3506j abstractC3506j3 = (AbstractC3506j) c4309e.f14377q.get(0);
                if (!c4325u.f14453s.m2215d(abstractC3506j2.mo7350l()).contains(abstractC3506j3.mo7350l())) {
                    if (c4325u.f14435a.f752u && abstractC3506j2.mo7350l().equals("kotlin.jvm.internal.Lambda")) {
                        abstractC3506j = abstractC3506j3;
                    }
                }
            }
        }
        if (abstractC3506j == null) {
            return;
        }
        C4309e c4309e3 = i9 == 2 ? ((C4322r) c4309e.f14368C.get(0)).f14411l : ((C4322r) c4322r2.f14408H.get(0)).f14411l;
        c4309e3.m8649S(c4309e);
        c4309e.m6233y(new C2960a(c4309e3, abstractC3506j, i9));
        c4309e.m6231w(EnumC2824a.f9166s);
        c4322r2.m6231w(EnumC2824a.f9122H);
        C4309e c4309eM8656a0 = c4309e3.m8656a0();
        c4309e.m8662i0(c4309eM8656a0);
        List list4 = c4309e3.f14367B;
        if (list4 != null && !list4.isEmpty()) {
            list4.remove(c4309e);
        }
        if (c4309e.f14384x == c4309e) {
            c4309eM8656a0.m8662i0(c4309e);
            if (c4309eM8656a0.f14366A.contains(c4309e)) {
                return;
            }
            c4309eM8656a0.f14366A = AbstractC0283h.m1145Y(c4309eM8656a0.f14366A, c4309e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public final String mo1051e() {
        switch (this.f826g) {
            case 0:
                return "ProcessAnonymous";
            default:
                return "ProcessMethodsForInline";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        switch (this.f826g) {
            case 0:
                boolean z9 = c4325u.f14435a.f750s;
                this.f827h = z9;
                if (z9) {
                    c4325u.f14448n.forEach(new C0074e(6));
                    HashMap map = new HashMap();
                    HashMap map2 = new HashMap();
                    for (C4309e c4309e : c4325u.f14448n) {
                        C2960a c2960a = (C2960a) c4309e.f9217g.mo6237c(C2825b.f9193h);
                        if (c2960a != null) {
                            C4309e c4309e2 = c2960a.f9709g;
                            List arrayList = (List) map2.get(c4309e2);
                            if (arrayList == null || arrayList.isEmpty()) {
                                arrayList = new ArrayList(2);
                                map2.put(c4309e2, arrayList);
                            }
                            arrayList.add(c4309e);
                            map2.putIfAbsent(c4309e, Collections.EMPTY_LIST);
                            map.put(c4309e, c4309e2);
                        }
                    }
                    if (!map.isEmpty()) {
                        HashSet hashSet = new HashSet();
                        map2.forEach(new C0280f0(this, hashSet, map));
                        Iterator it = c4325u.f14448n.iterator();
                        while (it.hasNext()) {
                            List list = ((C4309e) it.next()).f14366A;
                            if (list.size() > 1) {
                                hashSet.clear();
                                hashSet.addAll(list);
                                list.clear();
                                list.addAll(hashSet);
                                Collections.sort(list);
                            }
                        }
                        break;
                    }
                }
                break;
            default:
                this.f827h = c4325u.f14435a.f751t;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: h */
    public final boolean mo1054h(C4309e c4309e) {
        switch (this.f826g) {
            case 0:
                if (this.f827h) {
                    if (c4309e.f9217g.mo6235a(EnumC2824a.f9152i0)) {
                        try {
                            m1191k(c4309e);
                        } catch (Exception | StackOverflowError e6) {
                            C5787h.m10468a(c4309e, "Anonymous visitor error", e6);
                        }
                        c4309e.f14382v.forEach(new C0076g(this, 4));
                    }
                }
                break;
            default:
                if (this.f827h) {
                    for (C4322r c4322r : c4309e.f14380t) {
                        boolean z9 = c4322r.f14415p;
                        C4309e c4309e2 = c4322r.f14411l;
                        if (!z9) {
                            if (!c4322r.f9217g.mo6235a(EnumC2824a.f9166s)) {
                                C0192k c0192k = c4322r.f14412m;
                                if (c0192k.m857i() || c4322r.f14410k.f10150g.contains("$")) {
                                    if (c0192k.m856h() || (c4322r.m8698W() && c4309e2.f14371k.f14435a.f750s)) {
                                        c4322r.m6231w(EnumC2824a.f9143c0);
                                        C4309e c4309eM8656a0 = c4309e2.m8656a0();
                                        Iterator it = c4322r.f14408H.iterator();
                                        while (it.hasNext()) {
                                            C4309e c4309eM8656a02 = ((C4322r) it.next()).f14411l.m8656a0();
                                            if (c4309eM8656a02 != c4309eM8656a0) {
                                                c4309eM8656a0.m8662i0(c4309eM8656a02);
                                                if (!c4309eM8656a02.f14366A.contains(c4309eM8656a0)) {
                                                    c4309eM8656a02.f14366A = AbstractC0283h.m1145Y(c4309eM8656a02.f14366A, c4309eM8656a0);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    break;
                }
                break;
        }
        return false;
    }
}
