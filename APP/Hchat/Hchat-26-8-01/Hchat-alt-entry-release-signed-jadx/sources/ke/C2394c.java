package ke;

import ae.C0070a;
import ae.C0072c;
import ae.C0074e;
import ae.C0075f;
import ae.C0076g;
import ae.C0077h;
import af.C0084g;
import be.AbstractC0269a;
import be.C0271b;
import be.C0294m0;
import com.alibaba.fastjson2.writer.C0640b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import md.AbstractC2828e;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import nc.C2958a;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p023b8.C0205c;
import p038ce.C0548a;
import p038ce.C0561n;
import p077f8.AbstractC1089i;
import p108ha.C1656p;
import p109hb.C1695r;
import p121i4.C1984y;
import p170le.C2554b;
import p170le.C2555c;
import p170le.C2558f;
import p199nd.C2966d;
import p199nd.EnumC2964c;
import p214oc.C3126c;
import p233pd.C3403n;
import p233pd.C3406q;
import p233pd.EnumC3400k;
import p246qd.AbstractC3508l;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3514r;
import p246qd.C3515s;
import p302ud.C4305a;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p343x6.AbstractC5700d;
import p350xd.C5775b;
import p350xd.C5776c;
import p350xd.C5777d;
import p350xd.C5778e;
import p351xe.AbstractC5792m;
import p351xe.C5791l;
import p369yd.C6028b;
import p369yd.C6029c;

/* JADX INFO: renamed from: ke.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2394c extends AbstractC0269a implements InterfaceC2395d {

    /* JADX INFO: renamed from: h */
    public static final C2398g f7859h = new C2398g(3);

    /* JADX INFO: renamed from: i */
    public static final C2398g f7860i = new C2398g(4);

    /* JADX INFO: renamed from: j */
    public static final C0014a f7861j = new C0014a(26);

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7862g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [ud.u.<init>(bc.k):void] */
    public /* synthetic */ C2394c(int i9) {
        this.f7862g = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static IdentityHashMap m5717i(C4322r c4322r, C3515s c3515s) {
        IdentityHashMap identityHashMap = new IdentityHashMap(c3515s.f11445j.size() - 1);
        Iterator it = c3515s.f11445j.iterator();
        while (it.hasNext()) {
            C4320p c4320p = ((C3514r) it.next()).f11420j;
            if (c4320p != null && c4320p.f14396k == EnumC3400k.f10963O) {
                C3403n c3403n = (C3403n) c4320p;
                if (c3403n.f11005p.f10155l.equals("java.lang.String.equals(Ljava/lang/Object;)Z")) {
                    Object objM10488e = AbstractC5792m.m10488e(c4322r.f14411l.f14371k, c3403n.mo7179S(1));
                    if (objM10488e instanceof String) {
                        identityHashMap.put(c4320p, (String) objM10488e);
                    }
                }
            }
        }
        return identityHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static C3514r m5718j(C4320p c4320p) {
        AbstractC3508l abstractC3508lMo7171k0;
        if (c4320p == null || c4320p.f14396k != EnumC3400k.f10963O) {
            return null;
        }
        C3403n c3403n = (C3403n) c4320p;
        if (c3403n.f11005p.f10155l.equals("java.lang.String.hashCode()I") && (abstractC3508lMo7171k0 = c3403n.mo7171k0()) != null && (abstractC3508lMo7171k0 instanceof C3514r)) {
            return (C3514r) abstractC3508lMo7171k0;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static C3514r m5719k(AbstractC3508l abstractC3508l) {
        abstractC3508l.getClass();
        if (abstractC3508l instanceof C3514r) {
            return m5718j(((C3514r) abstractC3508l).m7394f0());
        }
        if (abstractC3508l instanceof C3509m) {
            return m5718j(((C3509m) abstractC3508l).f11421l);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static void m5720l(C6029c c6029c) {
        if (c6029c.f24481n != null) {
            C6028b c6028b = c6029c.f24475k;
            if (c6028b != null) {
                c6029c.f24475k = C6028b.m10790K(c6028b);
            }
            InterfaceC4314j interfaceC4314j = c6029c.f24480m;
            c6029c.f24480m = c6029c.f24481n;
            c6029c.f24481n = interfaceC4314j;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m5721m(InterfaceC4314j interfaceC4314j) {
        if (interfaceC4314j instanceof C6029c) {
            return true;
        }
        if (interfaceC4314j instanceof InterfaceC4318n) {
            List listMo8675u = ((InterfaceC4318n) interfaceC4314j).mo8675u();
            if (listMo8675u.size() == 1 && (listMo8675u.get(0) instanceof C6029c)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: ud.j */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m5722n(C4322r c4322r, InterfaceC4314j interfaceC4314j) {
        boolean zIsEmpty;
        boolean zIsEmpty2;
        if (interfaceC4314j != 0) {
            if (!((AbstractC2828e) interfaceC4314j).f9217g.mo6235a(EnumC2824a.f9161n)) {
                if (interfaceC4314j instanceof C4305a) {
                    C4305a c4305a = (C4305a) interfaceC4314j;
                    if (c4305a != c4322r.f14403C) {
                        List list = c4305a.f14353n;
                        if (!list.isEmpty()) {
                            if (list.size() == 1) {
                                zIsEmpty = ((C4305a) list.get(0)).f14353n.isEmpty();
                            }
                        }
                        if (!zIsEmpty) {
                            if (interfaceC4314j instanceof InterfaceC4318n) {
                                List listMo8675u = ((InterfaceC4318n) interfaceC4314j).mo8675u();
                                if (listMo8675u.size() == 1) {
                                    InterfaceC4314j interfaceC4314j2 = (InterfaceC4314j) listMo8675u.get(0);
                                    if (interfaceC4314j2 instanceof C4305a) {
                                        C4305a c4305a2 = (C4305a) interfaceC4314j2;
                                        if (c4305a2 != c4322r.f14403C) {
                                            List list2 = c4305a2.f14353n;
                                            if (!list2.isEmpty()) {
                                                if (list2.size() == 1) {
                                                    zIsEmpty2 = ((C4305a) list2.get(0)).f14353n.isEmpty();
                                                }
                                            }
                                            if (zIsEmpty2) {
                                            }
                                        }
                                        zIsEmpty2 = true;
                                        if (zIsEmpty2) {
                                        }
                                    }
                                    zIsEmpty2 = false;
                                    if (zIsEmpty2) {
                                    }
                                }
                            }
                        }
                    }
                    zIsEmpty = true;
                    if (!zIsEmpty) {
                    }
                }
                zIsEmpty = false;
                if (!zIsEmpty) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m5723o(C1695r c1695r) {
        C4322r c4322r = (C4322r) c1695r.f5637b;
        try {
            ((ArrayList) c1695r.f5639d).forEach(new C0074e(21));
            C5777d c5777d = (C5777d) c1695r.f5643h;
            EnumC2824a enumC2824a = EnumC2824a.f9168u;
            if (c5777d != null) {
                ((C5777d) c1695r.f5638c).f23506i.mo8675u().remove(c5777d);
                c5777d.f23511k.m6231w(enumC2824a);
            }
            C3514r c3514r = (C3514r) c1695r.f5644i;
            if (c3514r != null) {
                for (C3515s c3515s : c3514r.f11440m.m7398b().f11413c) {
                    C4320p c4320p = c3515s.f11444i.f11420j;
                    if (c4320p != null) {
                        c4320p.m6231w(enumC2824a);
                    }
                    Iterator it = c3515s.f11445j.iterator();
                    while (it.hasNext()) {
                        C4320p c4320p2 = ((C3514r) it.next()).f11420j;
                        if (c4320p2 != null) {
                            c4320p2.m6231w(enumC2824a);
                        }
                    }
                    c4322r.f14404D.remove(c3515s);
                }
            }
            C5791l.m10474f(c4322r);
        } catch (Exception e6) {
            e = e6;
            c4322r.m6384M("Failed to clean up code after switch over string restore", e);
        } catch (StackOverflowError e7) {
            e = e7;
            c4322r.m6384M("Failed to clean up code after switch over string restore", e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a5  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m5724p(C1695r c1695r) {
        Integer num;
        C4320p c4320p;
        C3514r c3514rM7185k0;
        C4320p c4320pM7394f0;
        Integer numValueOf;
        int i9;
        C4322r c4322r = (C4322r) c1695r.f5637b;
        C5777d c5777d = (C5777d) c1695r.f5638c;
        List listMo8675u = c5777d.f23506i.mo8675u();
        int iIndexOf = listMo8675u.indexOf(c5777d);
        InterfaceC4314j interfaceC4314j = (iIndexOf == -1 || (i9 = iIndexOf + 1) >= listMo8675u.size()) ? null : (InterfaceC4314j) listMo8675u.get(i9);
        if (interfaceC4314j instanceof C5777d) {
            C5777d c5777d2 = (C5777d) interfaceC4314j;
            C4320p c4320pM57c0 = AbstractC0000a.m57c0(c5777d2.f23511k);
            if (c4320pM57c0 == null || c4320pM57c0.f14396k != EnumC3400k.f10993w) {
                c4320pM57c0 = null;
            }
            if (c4320pM57c0 != null) {
                AbstractC3508l abstractC3508lMo7179S = c4320pM57c0.mo7179S(0);
                abstractC3508lMo7179S.getClass();
                if (abstractC3508lMo7179S instanceof C3514r) {
                    C3514r c3514r = (C3514r) c4320pM57c0.mo7179S(0);
                    ArrayList<C2403l> arrayList = (ArrayList) c1695r.f5641f;
                    int i10 = 0;
                    for (C2403l c2403l : arrayList) {
                        InterfaceC4314j interfaceC4314j2 = c2403l.f7875b;
                        if (interfaceC4314j2 != null) {
                            ArrayList arrayList2 = new ArrayList();
                            AbstractC5700d.m10279h0(c4322r, new C2392a(new C0294m0(7, arrayList2), 2), interfaceC4314j2);
                            arrayList2.removeIf(new C0561n(14));
                            c4320pM7394f0 = arrayList2.size() == 1 ? (C4320p) arrayList2.get(0) : null;
                        } else {
                            C4305a c4305a = c2403l.f7876c;
                            if (c4305a != null) {
                                AbstractC3508l abstractC3508lMo7179S2 = c4320pM57c0.mo7179S(0);
                                abstractC3508lMo7179S2.getClass();
                                if ((abstractC3508lMo7179S2 instanceof C3514r) && (c4320p = ((C3514r) abstractC3508lMo7179S2).f11440m.f11444i.f11420j) != null && c4320p.f14396k == EnumC3400k.f10972X && (c3514rM7185k0 = ((C3406q) c4320p).m7185k0(c4305a)) != null) {
                                    c4320pM7394f0 = c3514rM7185k0.m7394f0();
                                }
                            }
                        }
                        if (c4320pM7394f0 == null || c4320pM7394f0.f14398m.size() != 1) {
                            numValueOf = null;
                        } else {
                            Object objM10488e = AbstractC5792m.m10488e(c4322r.f14411l.f14371k, c4320pM7394f0.mo7179S(0));
                            if ((objM10488e instanceof C3510n) && c3514r.m7395g0(c4320pM7394f0.f14397l)) {
                                numValueOf = Integer.valueOf((int) ((C3510n) objM10488e).f11422l);
                            }
                        }
                        if (numValueOf != null) {
                            c2403l.f7877d = numValueOf.intValue();
                            i10++;
                        }
                    }
                    if (i10 == 0) {
                        return true;
                    }
                    if (i10 == arrayList.size()) {
                        arrayList.sort(Comparator.comparingInt(new C0070a(11)));
                        HashMap map = new HashMap(arrayList.size());
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                ArrayList arrayList3 = new ArrayList();
                                for (C5776c c5776c : c5777d2.f23512l) {
                                    List list = c5776c.f23508a;
                                    InterfaceC4314j interfaceC4314j3 = c5776c.f23509b;
                                    C5776c c5776c2 = null;
                                    for (Object obj : list) {
                                        if (obj instanceof Integer) {
                                            num = (Integer) obj;
                                        } else if (obj instanceof C4311g) {
                                            C2958a c2958a = (C2958a) ((C4311g) obj).f9217g.mo6237c(C3126c.f10133f);
                                            num = (c2958a == null || c2958a.f9704g != 6) ? null : (Integer) c2958a.f9705h;
                                        }
                                        if (num != null) {
                                            C2403l c2403l2 = (C2403l) map.remove(num);
                                            if (c2403l2 != null) {
                                                ArrayList arrayList4 = c2403l2.f7874a;
                                                if (c5776c2 == null) {
                                                    c5776c2 = new C5776c(new ArrayList(arrayList4), interfaceC4314j3);
                                                } else {
                                                    c5776c2.f23508a.addAll(arrayList4);
                                                }
                                            }
                                        } else if (obj == C5777d.f23510m) {
                                            Iterator it2 = map.entrySet().iterator();
                                            while (it2.hasNext()) {
                                                C2403l c2403l3 = (C2403l) ((Map.Entry) it2.next()).getValue();
                                                if (c5776c2 == null) {
                                                    c5776c2 = new C5776c(new ArrayList(c2403l3.f7874a), interfaceC4314j3);
                                                } else {
                                                    c5776c2.f23508a.addAll(c2403l3.f7874a);
                                                }
                                                it2.remove();
                                            }
                                            if (c5776c2 == null) {
                                                c5776c2 = new C5776c(new ArrayList(), interfaceC4314j3);
                                            }
                                            c5776c2.f23508a.add(C5777d.f23510m);
                                        }
                                    }
                                    arrayList3.add(c5776c2);
                                }
                                c1695r.f5643h = c5777d2;
                                c1695r.f5644i = c3514r;
                                c1695r.f5642g = arrayList3;
                                return true;
                            }
                            C2403l c2403l4 = (C2403l) it.next();
                            if (((C2403l) map.put(Integer.valueOf(c2403l4.f7877d), c2403l4)) != null) {
                                break;
                            }
                            AbstractC5700d.m10279h0(c4322r, new C2392a(new C0076g(c1695r, 9), 2), c2403l4.f7875b);
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static void m5725q(C4322r c4322r) {
        if (c4322r.f14415p || c4322r.f14425z.isEmpty()) {
            return;
        }
        AbstractC5700d.m10279h0(c4322r, f7859h, c4322r.f14407G);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static void m5726r(C4322r c4322r) {
        C2398g c2398g = C2398g.f7865l;
        AbstractC5700d.m10279h0(c4322r, c2398g, c4322r.f14407G);
        if (c4322r.f9217g.mo6235a(EnumC2824a.f9142b0)) {
            C0271b.m1089Y(c4322r);
        }
        AbstractC5700d.m10281i0(c4322r, c2398g);
        AbstractC5700d.m10279h0(c4322r, f7860i, c4322r.f14407G);
        AbstractC5700d.m10281i0(c4322r, f7861j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ke.InterfaceC2395d
    /* JADX INFO: renamed from: c */
    public boolean mo193c(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        C3514r c3514rM5719k;
        if (interfaceC4318n instanceof C5777d) {
            C5777d c5777d = (C5777d) interfaceC4318n;
            C4305a c4305a = c5777d.f23511k;
            try {
                ArrayList arrayList = c5777d.f23512l;
                EnumC3400k enumC3400k = EnumC3400k.f10993w;
                C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a);
                if (c4320pM57c0 == null || c4320pM57c0.f14396k != enumC3400k) {
                    c4320pM57c0 = null;
                }
                if (c4320pM57c0 != null && (c3514rM5719k = m5719k(c4320pM57c0.mo7179S(0))) != null) {
                    int size = arrayList.size();
                    int i9 = arrayList.stream().anyMatch(new C0561n(13)) ? size - 1 : size;
                    C3515s c3515s = c3514rM5719k.f11440m;
                    if (c3515s.f11445j.size() - 1 >= i9) {
                        IdentityHashMap identityHashMapM5717i = m5717i(c4322r, c3515s);
                        if (identityHashMapM5717i.size() >= i9) {
                            C1695r c1695r = new C1695r(c4322r, c5777d);
                            c1695r.f5640e = identityHashMapM5717i;
                            c1695r.f5641f = new ArrayList(size);
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (!m5727s(c1695r, (C5776c) it.next())) {
                                    c4322r.m6383L("Failed to restore switch over string. Please report as a decompilation issue");
                                    return false;
                                }
                            }
                            if (!m5724p(c1695r)) {
                                c4322r.m6383L("Failed to restore switch over string. Please report as a decompilation issue");
                                return false;
                            }
                            InterfaceC4318n interfaceC4318n2 = c5777d.f23506i;
                            C5777d c5777d2 = new C5777d(interfaceC4318n2, c4305a);
                            for (C5776c c5776c : (ArrayList) c1695r.f5642g) {
                                c5777d2.f23512l.add(new C5776c(Collections.unmodifiableList(c5776c.f23508a), c5776c.f23509b));
                            }
                            if (!interfaceC4318n2.mo8674l(c5777d, c5777d2)) {
                                c4322r.m6383L("Failed to restore switch over string. Please report as a decompilation issue");
                                return false;
                            }
                            m5723o(c1695r);
                            c4320pM57c0.mo7181b0(c4320pM57c0.mo7179S(0), c3514rM5719k.mo7374H());
                            return true;
                        }
                    }
                }
            } catch (Exception e6) {
                e = e6;
                c4322r.m6384M("Failed to restore switch over string. Please report as a decompilation issue", e);
            } catch (StackOverflowError e7) {
                e = e7;
                c4322r.m6384M("Failed to restore switch over string. Please report as a decompilation issue", e);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: e */
    public String mo1051e() {
        switch (this.f7862g) {
            case 2:
                return "RegionMakerVisitor";
            case 3:
            default:
                return super.mo1051e();
            case 4:
                return "SwitchBreakVisitor";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x03b6, code lost:
    
        if (((p233pd.C3392c) r7).f10929o.equals(r20.f14411l.m8657b0()) != false) goto L177;
     */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1053g(C4322r c4322r) {
        List list;
        C5775b c5775b;
        C4305a c4305aM71j0;
        int i9 = this.f7862g;
        EnumC2964c enumC2964c = EnumC2964c.f9716g;
        int i10 = 1;
        switch (i9) {
            case 0:
                m5725q(c4322r);
                return;
            case 1:
                if (c4322r.f14415p) {
                    return;
                }
                m5726r(c4322r);
                return;
            case 2:
                if (c4322r.f14415p || c4322r.f14425z.isEmpty()) {
                    return;
                }
                C1984y c1984y = new C1984y(c4322r);
                C2555c c2555c = (C2555c) c1984y.f6716d;
                c4322r.f14407G = c1984y.m4910b(c4322r.f14402B);
                boolean zIsEmpty = c4322r.f14405E.isEmpty();
                int i11 = 0;
                C2825b c2825b = C2825b.f9205t;
                if (!zIsEmpty && !c4322r.f14405E.isEmpty()) {
                    List listMo6238d = c4322r.f9217g.mo6238d(c2825b);
                    Iterator it = listMo6238d.iterator();
                    while (it.hasNext()) {
                        List<C0075f> list2 = ((C0077h) it.next()).f244h;
                        ArrayList<C4305a> arrayList = new ArrayList(list2.size());
                        HashSet hashSet = new HashSet();
                        for (C0075f c0075f : list2) {
                            C4305a c4305a = c0075f.f234c;
                            if (c4305a != null) {
                                arrayList.add(c4305a);
                                hashSet.add(AbstractC0000a.m71j0(c4305a));
                            } else {
                                c4322r.m6380I("No exception handler block: ".concat(String.valueOf(c0075f)));
                            }
                        }
                        HashSet hashSet2 = new HashSet();
                        Iterator it2 = hashSet.iterator();
                        while (true) {
                            boolean zHasNext = it2.hasNext();
                            EnumC2824a enumC2824a = EnumC2824a.f9168u;
                            if (zHasNext) {
                                C4305a c4305a2 = (C4305a) it2.next();
                                for (C4305a c4305a3 : arrayList) {
                                    if (!c4305a3.f9217g.mo6235a(enumC2824a)) {
                                        List list3 = c4305a2.f14353n;
                                        if (list3.isEmpty()) {
                                            c4322r.m6380I("No successors for splitter: ".concat(String.valueOf(c4305a2)));
                                        } else {
                                            C4305a c4305a4 = (C4305a) list3.get(i11);
                                            C4305a c4305aM67h0 = AbstractC0000a.m67h0(c4322r, c4305a4, c4305a3);
                                            if (c4305aM67h0 != null && c4305aM67h0 != c4305a4 && c4305aM67h0 != c4305a3) {
                                                hashSet2.add(c4305aM67h0);
                                            }
                                            i11 = 0;
                                        }
                                    }
                                }
                            } else {
                                for (C0075f c0075f2 : list2) {
                                    C4305a c4305a5 = c0075f2.f234c;
                                    if (c4305a5 != null) {
                                        c2555c.f8286a.clear();
                                        c2555c.f8287b = new C2554b();
                                        if (c0075f2.f239h) {
                                            c4305aM71j0 = AbstractC0000a.m71j0(c4305a5);
                                        } else {
                                            Iterator it3 = hashSet2.iterator();
                                            while (it3.hasNext()) {
                                                c2555c.m6011a((C4305a) it3.next());
                                            }
                                            c4305aM71j0 = c4305a5;
                                        }
                                        if (!c4305aM71j0.f9217g.mo6235a(enumC2824a)) {
                                            ArrayList<C4305a> arrayList2 = new ArrayList();
                                            C4305a c4305aM73k0 = AbstractC0000a.m73k0(c0075f2, c4322r);
                                            if (c4305aM73k0 != null) {
                                                arrayList2.add(c4305aM73k0);
                                            } else {
                                                arrayList2.addAll(AbstractC0000a.m84q(c4322r, c4305aM71j0.f14357r));
                                            }
                                            boolean z9 = c4322r.m8696U(c4305a5) != null;
                                            for (C4305a c4305a6 : arrayList2) {
                                                if (!z9 || AbstractC0000a.m89s0(c4305a5, c4305a6)) {
                                                    if (AbstractC1089i.m2755Z(c4305a6, c4322r.f14407G)) {
                                                        c2555c.m6011a(c4305a6);
                                                    }
                                                }
                                            }
                                            c0075f2.f236e = c1984y.m4910b(c4305a5);
                                            C0072c c0072c = (C0072c) c4305a5.f9217g.mo6237c(C2825b.f9178E);
                                            if (c0072c == null) {
                                                c4322r.m6382K("Missing exception handler attribute for start block: ".concat(String.valueOf(c4305a5)));
                                            } else {
                                                c0075f2.f236e.m6233y(c0072c);
                                            }
                                        }
                                    }
                                }
                                i11 = 0;
                            }
                        }
                    }
                    HashSet hashSet3 = new HashSet();
                    AbstractC1089i.m2800y(c4322r.f14407G, hashSet3);
                    HashSet<InterfaceC4312h> hashSet4 = new HashSet();
                    Iterator it4 = listMo6238d.iterator();
                    while (it4.hasNext()) {
                        Iterator it5 = ((C0077h) it4.next()).f244h.iterator();
                        while (it5.hasNext()) {
                            C5775b c5775b2 = ((C0075f) it5.next()).f236e;
                            if (c5775b2 != null) {
                                InterfaceC4312h interfaceC4312hM2722D = AbstractC1089i.m2722D(c5775b2);
                                if (interfaceC4312hM2722D instanceof C4305a) {
                                    hashSet4.addAll(((C4305a) interfaceC4312hM2722D).f14353n);
                                }
                                AbstractC1089i.m2800y(c5775b2, hashSet3);
                            }
                        }
                    }
                    hashSet4.removeAll(hashSet3);
                    if (hashSet4.isEmpty()) {
                        c5775b = null;
                    } else {
                        c5775b = new C5775b(c4322r.f14407G);
                        for (InterfaceC4312h interfaceC4312h : hashSet4) {
                            if (interfaceC4312h instanceof C4305a) {
                                c2555c.f8286a.clear();
                                c2555c.f8287b = new C2554b();
                                c2555c.m6013c(c5775b);
                                c5775b.m10464H(c1984y.m4910b((C4305a) interfaceC4312h));
                            }
                        }
                    }
                    if (c5775b != null) {
                        c4322r.f14407G.m10464H(c5775b);
                    }
                }
                if (c4322r.f14425z.stream().flatMap(new C0640b(26)).anyMatch(new C0561n(11))) {
                    C0271b.m1089Y(c4322r);
                }
                if (!c4322r.f14415p && !c4322r.f14405E.isEmpty()) {
                    List listMo6238d2 = c4322r.f9217g.mo6238d(c2825b);
                    int i12 = 5;
                    if (listMo6238d2.isEmpty()) {
                        list = Collections.EMPTY_LIST;
                    } else {
                        ArrayList arrayList3 = new ArrayList(listMo6238d2);
                        arrayList3.sort(new C0205c(i12));
                        list = arrayList3;
                    }
                    if (!list.isEmpty()) {
                        C2399h c2399h = new C2399h(list, 0);
                        int size = c4322r.f14425z.size() * 5;
                        int i13 = 0;
                        while (true) {
                            boolean zM10283j0 = AbstractC5700d.m10283j0(c4322r, c2399h, c4322r.f14407G);
                            if (!zM10283j0) {
                                Iterator it6 = c4322r.f14405E.iterator();
                                while (it6.hasNext() && !(zM10283j0 = AbstractC5700d.m10283j0(c4322r, c2399h, ((C0075f) it6.next()).f236e))) {
                                }
                            }
                            int i14 = i13 + 1;
                            if (i13 > size) {
                                throw new C0084g("Iterative traversal limit reached: limit: " + size + ", visitor: " + C2399h.class.getName() + ", blocks count: " + c4322r.f14425z.size());
                            }
                            if (zM10283j0) {
                                i13 = i14;
                            }
                        }
                    }
                }
                AbstractC5700d.m10279h0(c4322r, C2398g.f7864k, c4322r.f14407G);
                m5725q(c4322r);
                if ((c4322r.f14412m.f488b & 131104) != 0) {
                    int i15 = C2558f.f8293b;
                    C5775b c5775b3 = c4322r.f14407G;
                    ArrayList arrayList4 = c5775b3.f23507k;
                    if (arrayList4.isEmpty() || !(arrayList4.get(0) instanceof C5778e)) {
                        return;
                    }
                    C5778e c5778e = (C5778e) arrayList4.get(0);
                    C4320p c4320p = c5778e.f23513k;
                    AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
                    if (c4322r.f14412m.m856h()) {
                        abstractC3508lMo7179S.getClass();
                        boolean z10 = abstractC3508lMo7179S instanceof C3509m;
                        if (z10 && abstractC3508lMo7179S.m7377K()) {
                            C4320p c4320p2 = z10 ? ((C3509m) abstractC3508lMo7179S).f11421l : null;
                            if (c4320p2.f14396k == EnumC3400k.f10979i) {
                            }
                            break;
                        }
                        c4322r.m6383L("In static synchronized method top region not synchronized by class const: ".concat(String.valueOf(abstractC3508lMo7179S)));
                        return;
                    }
                    if (!abstractC3508lMo7179S.m7380N()) {
                        c4322r.m6383L("In synchronized method top region not synchronized by 'this': ".concat(String.valueOf(abstractC3508lMo7179S)));
                        return;
                    }
                    c5775b3.f23507k.set(0, c5778e.f23515m);
                    C5791l.m10472d(c4322r, c4320p);
                    Iterator it7 = c5778e.f23514l.iterator();
                    while (it7.hasNext()) {
                        C5791l.m10472d(c4322r, (C4320p) it7.next());
                    }
                    m5725q(c4322r);
                    return;
                }
                return;
            case 3:
                if (c4322r.m8701Z()) {
                    AbstractC5700d.m10279h0(c4322r, new C2401j(3), c4322r.f14407G);
                    return;
                }
                return;
            case 4:
                if (C2966d.m6389b(c4322r, enumC2964c)) {
                    AbstractC5700d.m10279h0(c4322r, new C2392a(new C1656p(2), i10), c4322r.f14407G);
                    AbstractC5700d.m10279h0(c4322r, new C2392a(new C1656p(3), i10), c4322r.f14407G);
                    C2829f c2829f = c4322r.f9217g;
                    EnumC2824a enumC2824a2 = EnumC2824a.f9141a0;
                    if (c2829f.mo6235a(enumC2824a2)) {
                        try {
                            m5726r(c4322r);
                            return;
                        } finally {
                            c4322r.m6227D(enumC2824a2);
                        }
                    }
                    return;
                }
                return;
            default:
                if (C2966d.m6389b(c4322r, enumC2964c)) {
                    AbstractC5700d.m10281i0(c4322r, this);
                    return;
                }
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public boolean m5727s(C1695r c1695r, C5776c c5776c) {
        List list = c5776c.f23508a;
        boolean z9 = list.size() == 1 && list.get(0) == C5777d.f23510m;
        InterfaceC4314j interfaceC4314j = c5776c.f23509b;
        if (z9) {
            new ArrayList();
            return true;
        }
        AbstractC5700d.m10279h0((C4322r) c1695r.f5637b, new C2392a(new C0548a(this, new AtomicBoolean(false), c1695r), 4), interfaceC4314j);
        return !r0.get();
    }
}
