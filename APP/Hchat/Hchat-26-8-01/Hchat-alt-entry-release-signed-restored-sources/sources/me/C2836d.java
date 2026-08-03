package me;

import be.AbstractC0269a;
import be.C0285i;
import be.C0305w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import md.AbstractC2828e;
import md.C2825b;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import p077f8.AbstractC1089i;
import p199nd.C2968e;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.C3507k;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p343x6.AbstractC5700d;
import p350xd.C5775b;
import p351xe.AbstractC5798s;
import p383zd.C6138c;

/* JADX INFO: renamed from: me.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2836d extends AbstractC0269a {

    /* JADX INFO: renamed from: g */
    public static final InterfaceC2844b f9227g = AbstractC2846d.m6274b(C2836d.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m6245i(C2837e c2837e, ArrayList arrayList) {
        InterfaceC4318n interfaceC4318n = c2837e.f9228a;
        InterfaceC4312h interfaceC4312h = c2837e.f9229b;
        HashSet hashSet = new HashSet(arrayList);
        boolean z9 = false;
        for (InterfaceC4314j interfaceC4314j : interfaceC4318n.mo8675u()) {
            if (!z9 && interfaceC4314j == interfaceC4312h) {
                z9 = true;
            }
            if (z9) {
                hashSet.removeIf(new C0285i(interfaceC4314j, 17));
                if (hashSet.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: ud.n */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    public final void mo1053g(C4322r c4322r) {
        if (c4322r.f14415p || c4322r.f14404D.isEmpty()) {
            return;
        }
        AbstractC5700d.m10279h0(c4322r, new C2835c(), c4322r.f14407G);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C3515s c3515s : c4322r.f14404D) {
            if (!c3515s.m7398b().f11415e) {
                ((List) linkedHashMap.computeIfAbsent(c3515s.m7398b(), new C2833a(1))).add(c3515s);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            C3507k c3507k = (C3507k) entry.getKey();
            List list = (List) entry.getValue();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C3507k c3507kM7398b = ((C3515s) it.next()).m7398b();
                c3507k.getClass();
                if (c3507kM7398b.f11416f) {
                    c3507k.f11416f = true;
                }
                if (c3507kM7398b.f11415e) {
                    c3507k.f11415e = true;
                }
                if (c3507kM7398b.f11414d) {
                    c3507k.f11414d = true;
                }
            }
            if (list.size() > 1) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    ((C3515s) it2.next()).m7408m(c3507k);
                }
            }
            c3507k.f11413c = list;
        }
        ArrayList<C3507k> arrayList = new ArrayList(linkedHashMap.keySet());
        if (arrayList.isEmpty()) {
            return;
        }
        int i9 = 0;
        for (C3507k c3507k2 : arrayList) {
            AbstractC3506j abstractC3506j = c3507k2.f11412b;
            if (abstractC3506j == null) {
                c3507k2.f11412b = AbstractC3506j.f11404u;
                i9++;
            } else {
                c3507k2.f11413c.forEach(new C0305w(c4322r, 11, abstractC3506j));
            }
        }
        if (i9 != 0) {
            c4322r.m6382K("Unknown variable types count: " + i9);
        }
        C2834b c2834b = new C2834b();
        AbstractC5700d.m10279h0(c4322r, c2834b, c4322r.f14407G);
        LinkedHashMap linkedHashMap2 = c2834b.f9226i;
        if (linkedHashMap2.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(arrayList.size());
        for (C3507k c3507k3 : arrayList) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = c3507k3.f11413c.iterator();
            while (it3.hasNext()) {
                C2838f c2838f = (C2838f) linkedHashMap2.get((C3515s) it3.next());
                if (c2838f != null) {
                    arrayList2.add(c2838f);
                }
            }
            linkedHashMap3.put(c3507k3, AbstractC5798s.m10519m(arrayList2));
        }
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            C3507k c3507k4 = (C3507k) entry2.getKey();
            List<C2838f> list2 = (List) entry2.getValue();
            if (!c3507k4.f11416f) {
                ArrayList arrayList3 = new ArrayList(3);
                ArrayList arrayList4 = new ArrayList(3);
                for (C2838f c2838f2 : list2) {
                    arrayList3.addAll(c2838f2.f9231b);
                    arrayList4.addAll(c2838f2.f9232c);
                }
                if (!arrayList3.isEmpty() || !arrayList4.isEmpty()) {
                    if (!arrayList3.isEmpty()) {
                        Iterator it4 = list2.iterator();
                        while (true) {
                            if (!it4.hasNext()) {
                                break;
                            }
                            C2838f c2838f3 = (C2838f) it4.next();
                            for (C2837e c2837e : c2838f3.f9231b) {
                                InterfaceC4318n interfaceC4318n = c2837e.f9228a;
                                if (interfaceC4318n instanceof C6138c) {
                                    Iterator it5 = arrayList3.iterator();
                                    while (it5.hasNext()) {
                                        if (!AbstractC1089i.m2757a0(interfaceC4318n, ((C2837e) it5.next()).f9228a)) {
                                            break;
                                        }
                                    }
                                }
                                if (!((AbstractC2828e) interfaceC4318n).f9217g.mo6235a(EnumC2824a.f9132R) && m6245i(c2837e, arrayList3) && m6245i(c2837e, arrayList4)) {
                                    C3515s c3515s2 = c2838f3.f9230a;
                                    C3514r c3514r = c3515s2.f11444i;
                                    C4320p c4320p = c3514r.f11420j;
                                    if (c4320p != null) {
                                        if (!c4320p.f9217g.mo6235a(EnumC2824a.f9133S) && c4320p.f14396k != EnumC3400k.f10972X && c3514r.equals(c4320p.f14397l)) {
                                            c4320p.m6231w(EnumC2824a.f9131Q);
                                            c3515s2.m7398b().f11416f = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    C5775b c5775b = c4322r.f14407G;
                    if (c3507k4.f11416f) {
                        f9227g.mo6254h(c3507k4, "Try to declare already declared variable: {}");
                    } else {
                        C2968e c2968e = (C2968e) c5775b.f9217g.mo6237c(C2825b.f9208w);
                        if (c2968e == null) {
                            c2968e = new C2968e();
                            c5775b.m6233y(c2968e);
                        }
                        c2968e.f9723g.add(c3507k4);
                        c3507k4.f11416f = true;
                    }
                }
            }
        }
    }
}
