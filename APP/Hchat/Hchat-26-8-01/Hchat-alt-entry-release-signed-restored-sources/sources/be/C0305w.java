package be;

import ae.C0075f;
import af.C0084g;
import bsh.C0353j;
import bsh.ClassGeneratorUtil;
import bsh.classpath.BshClassPath;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.util.BeanUtils;
import gf.C1402a;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import ke.InterfaceC2396e;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p025bc.EnumC0252b;
import p038ce.C0560m;
import p038ce.C0561n;
import p081fc.C1199b;
import p081fc.C1203f;
import p082fd.C1204a;
import p083fe.C1214a;
import p140jd.AbstractC2124c;
import p199nd.AbstractC2963b0;
import p199nd.C2984p;
import p199nd.C2991w;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p227p4.C3315t;
import p233pd.AbstractC3391b;
import p233pd.AbstractC3409t;
import p233pd.C3399j;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3497a;
import p246qd.C3499c;
import p246qd.C3514r;
import p246qd.C3515s;
import p247qe.C3528k;
import p247qe.EnumC3529l;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4317m;
import p332wb.AbstractC4855en;
import p343x6.AbstractC5700d;
import p351xe.AbstractC5798s;
import p351xe.C5787h;
import td.C4145a;

/* JADX INFO: renamed from: be.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0305w implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f876b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f877c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0305w(C0306x c0306x, C4322r c4322r, C4322r c4322r2) {
        this.f875a = 0;
        this.f876b = c4322r;
        this.f877c = c4322r2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:189:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x045b  */
    @Override // java.util.function.Consumer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        AbstractC3506j abstractC3506jMo7375I;
        C3514r c3514r;
        Map map;
        List listMo2218c;
        AbstractC3506j abstractC3506j;
        C4320p c4320p;
        switch (this.f875a) {
            case 0:
                C4322r c4322r = (C4322r) this.f876b;
                C4322r c4322r2 = (C4322r) this.f877c;
                C4309e c4309e = c4322r2.f14411l;
                C4320p c4320p2 = (C4320p) obj;
                int iOrdinal = c4320p2.f14396k.ordinal();
                if (iOrdinal != 38) {
                    switch (iOrdinal) {
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                            C4311g c4311gM8717h = c4322r.f14411l.f14371k.m8717h((C3130c) ((C3399j) c4320p2).f10948o);
                            if (c4311gM8717h != null) {
                                c4311gM8717h.f14393o = AbstractC0283h.m1146Z(c4311gM8717h.f14393o, c4322r2, c4322r);
                                C4309e c4309e2 = c4311gM8717h.f14389k;
                                c4309e2.f14368C = AbstractC0283h.m1146Z(c4309e2.f14368C, c4322r2, c4322r);
                                c4309e2.f14367B = AbstractC0283h.m1146Z(c4309e2.f14367B, c4309e, c4322r.f14411l);
                                return;
                            }
                            return;
                        case 34:
                            break;
                        default:
                            return;
                    }
                }
                C4322r c4322rM8718i = c4322r.f14411l.f14371k.m8718i(((AbstractC3391b) c4320p2).mo7169i0());
                if (c4322rM8718i != null) {
                    c4322rM8718i.f14408H = AbstractC0283h.m1146Z(c4322rM8718i.f14408H, c4322r2, c4322r);
                    C4309e c4309e3 = c4322rM8718i.f14411l;
                    c4309e3.f14368C = AbstractC0283h.m1146Z(c4309e3.f14368C, c4322r2, c4322r);
                    c4309e3.f14367B = AbstractC0283h.m1146Z(c4309e3.f14367B, c4309e, c4322r.f14411l);
                    return;
                }
                return;
            case 1:
                C0307y c0307y = (C0307y) this.f877c;
                C4322r c4322r3 = (C4322r) this.f876b;
                C4320p c4320p3 = (C4320p) obj;
                if (c4320p3 instanceof AbstractC3391b) {
                    AbstractC3391b abstractC3391b = (AbstractC3391b) c4320p3;
                    if (abstractC3391b.mo7169i0().f10152i.size() == 0) {
                        return;
                    }
                    InterfaceC4317m interfaceC4317mM3342g = c0307y.f878g.f14442h.m3342g(abstractC3391b);
                    if (interfaceC4317mM3342g == null) {
                        int iMo7170j0 = abstractC3391b.mo7170j0();
                        ArrayList arrayListM1222j = C0307y.m1222j(abstractC3391b, iMo7170j0);
                        ArrayList arrayList = new ArrayList(arrayListM1222j);
                        if (C0307y.m1223m(arrayList, abstractC3391b.mo7169i0().f10152i)) {
                            C0307y.m1221i(abstractC3391b, iMo7170j0, arrayListM1222j, arrayList);
                            return;
                        }
                        return;
                    }
                    if (interfaceC4317mM3342g.mo2224v() && (abstractC3506j = (AbstractC3506j) AbstractC5798s.m10515i(interfaceC4317mM3342g.mo2218c())) != null && (abstractC3506j instanceof C3497a)) {
                        abstractC3391b.m6231w(EnumC2824a.f9136V);
                    }
                    C3131d c3131dMo7169i0 = abstractC3391b.mo7169i0();
                    if ((abstractC3391b instanceof C4145a) && ((C4145a) abstractC3391b).m8339l0()) {
                        abstractC3506jMo7375I = c4322r3.f14411l.f14376p;
                    } else {
                        AbstractC3508l abstractC3508lMo7171k0 = abstractC3391b.mo7171k0();
                        abstractC3506jMo7375I = abstractC3508lMo7171k0 != null ? abstractC3508lMo7171k0.mo7375I() : c3131dMo7169i0.f10153j.f10138g;
                    }
                    C1214a c1214a = c0307y.f878g.f14442h;
                    c1214a.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    c1214a.m3344k(abstractC3506jMo7375I, c3131dMo7169i0, arrayList2);
                    if (arrayList2.isEmpty()) {
                        return;
                    }
                    AbstractC3506j abstractC3506jMo7375I2 = abstractC3391b.mo7169i0().f10153j.f10138g;
                    AbstractC3508l abstractC3508lMo7171k02 = abstractC3391b.mo7171k0();
                    if (abstractC3508lMo7171k02 != null) {
                        abstractC3506jMo7375I2 = abstractC3508lMo7171k02.mo7375I();
                    } else if (abstractC3391b.f14396k == EnumC3400k.f10967S && (c3514r = abstractC3391b.f14397l) != null) {
                        abstractC3506jMo7375I2 = c3514r.mo7375I();
                    }
                    C1214a c1214a2 = c0307y.f878g.f14443i;
                    Map mapM3343i = c1214a2.m3343i(abstractC3506jMo7375I2);
                    InterfaceC4317m interfaceC4317mM3342g2 = c1214a2.f4075a.f14442h.m3342g(abstractC3391b);
                    List list = abstractC3391b.f14398m;
                    if (interfaceC4317mM3342g2 == null) {
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap(list.size() + 1);
                        AbstractC3506j abstractC3506jMo2220e = interfaceC4317mM3342g2.mo2220e();
                        C3514r c3514r2 = abstractC3391b.f14397l;
                        if (c3514r2 != null && abstractC3506jMo2220e != null && abstractC3506jMo2220e.mo7345w() && (abstractC3506jMo2220e instanceof C3499c)) {
                            map2.put(abstractC3506jMo2220e, c3514r2.mo7375I());
                        }
                        int iMin = Math.min(interfaceC4317mM3342g2.mo2218c().size(), list.size() - abstractC3391b.mo7170j0());
                        for (int i9 = 0; i9 < iMin; i9++) {
                            AbstractC3506j abstractC3506j2 = (AbstractC3506j) interfaceC4317mM3342g2.mo2218c().get(i9);
                            AbstractC3508l abstractC3508lMo7179S = abstractC3391b.mo7179S(abstractC3391b.mo7170j0() + i9);
                            if (abstractC3508lMo7179S != null && abstractC3506j2 != null && abstractC3506j2.mo7345w() && (abstractC3506j2 instanceof C3499c)) {
                                map2.put(abstractC3506j2, abstractC3508lMo7179S.mo7375I());
                            }
                        }
                        map = map2;
                    }
                    if (mapM3343i == null || mapM3343i.isEmpty()) {
                        mapM3343i = map;
                    } else if (map != null && !map.isEmpty()) {
                        HashMap map3 = new HashMap(map.size() + mapM3343i.size());
                        map3.putAll(mapM3343i);
                        map3.putAll(map);
                        mapM3343i = map3;
                    }
                    InterfaceC4317m interfaceC4317mM1226n = c0307y.m1226n(interfaceC4317mM3342g, mapM3343i);
                    ArrayList arrayList3 = new ArrayList(arrayList2.size() + 1);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(c0307y.m1226n((InterfaceC4317m) it.next(), mapM3343i));
                    }
                    arrayList3.add(interfaceC4317mM1226n);
                    int iMo7170j02 = abstractC3391b.mo7170j0();
                    ArrayList arrayListM1222j2 = C0307y.m1222j(abstractC3391b, iMo7170j02);
                    if (c0307y.m1225l(interfaceC4317mM1226n, arrayList3, arrayListM1222j2)) {
                        listMo2218c = arrayListM1222j2;
                    } else {
                        int size = arrayListM1222j2.size();
                        ArrayList arrayList4 = new ArrayList(arrayListM1222j2);
                        if (C0307y.m1223m(arrayList4, interfaceC4317mM1226n.mo2218c())) {
                            boolean zM1225l = c0307y.m1225l(interfaceC4317mM1226n, arrayList3, arrayList4);
                            listMo2218c = arrayList4;
                            if (!zM1225l) {
                                boolean z9 = false;
                                for (int i10 = 0; i10 < size; i10++) {
                                    AbstractC3506j abstractC3506j3 = (AbstractC3506j) arrayList4.get(i10);
                                    AbstractC3506j abstractC3506j4 = (AbstractC3506j) interfaceC4317mM1226n.mo2218c().get(i10);
                                    if (!abstractC3506j3.mo7354t() && abstractC3506j4.mo7354t()) {
                                        arrayList4.set(i10, abstractC3506j4);
                                        z9 = true;
                                    }
                                }
                                if (z9) {
                                    boolean zM1225l2 = c0307y.m1225l(interfaceC4317mM1226n, arrayList3, arrayList4);
                                    listMo2218c = arrayList4;
                                    if (!zM1225l2) {
                                        listMo2218c = size == 1 ? interfaceC4317mM1226n.mo2218c() : interfaceC4317mM1226n.mo2218c();
                                    }
                                }
                            }
                        }
                    }
                    C3528k c3528k = c4322r3.f14411l.f14371k.f14441g.f11519c;
                    List listMo2218c2 = interfaceC4317mM1226n.mo2218c();
                    int size2 = listMo2218c.size();
                    ArrayList arrayList5 = new ArrayList(size2);
                    for (int i11 = 0; i11 < size2; i11++) {
                        AbstractC3506j abstractC3506j5 = (AbstractC3506j) listMo2218c2.get(i11);
                        AbstractC3506j abstractC3506j6 = (AbstractC3506j) listMo2218c.get(i11);
                        if (c3528k.m7432d(abstractC3506j5, abstractC3506j6) == EnumC3529l.f11483i) {
                            arrayList5.add(abstractC3506j5);
                        } else {
                            arrayList5.add(abstractC3506j6);
                        }
                    }
                    C0307y.m1221i(abstractC3391b, iMo7170j02, arrayListM1222j2, arrayList5);
                    return;
                }
                return;
            case 2:
                ClassGeneratorUtil.lambda$checkAbstractMethodImplementation$4((ArrayList) this.f876b, (Class) this.f877c, (Method) obj);
                return;
            case 3:
                ((BshClassPath) this.f876b).lambda$getAllNames$6((ArrayList) this.f877c, (String) obj);
                return;
            case 4:
                BshClassPath.lambda$getClassesForPackage$0((String) this.f876b, (HashSet) this.f877c, (BshClassPath) obj);
                return;
            case 5:
                C4305a c4305a = (C4305a) this.f876b;
                C4305a c4305a2 = (C4305a) this.f877c;
                C4305a c4305a3 = (C4305a) obj;
                c4305a3.f14353n.remove(c4305a);
                C0560m.m1567j(c4305a3, c4305a2);
                C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a3);
                if (c4320pM57c0 instanceof AbstractC3409t) {
                    ((AbstractC3409t) c4320pM57c0).mo7175j0(c4305a, c4305a2);
                }
                c4305a3.m8642H();
                return;
            case 6:
                ObjectReaderProvider.lambda$processJSONField1x$11((Annotation) this.f876b, (FieldInfo) this.f877c, (Method) obj);
                return;
            case 7:
                BeanUtils.lambda$getSetter$0((String) this.f876b, (Method[]) this.f877c, (Method) obj);
                return;
            case 8:
                C1204a c1204a = (C1204a) this.f876b;
                C1199b c1199b = (C1199b) this.f877c;
                C3128a c3128a = (C3128a) obj;
                c1199b.m3271r("import ");
                C4309e c4309eM8715f = c1204a.f4040a.f14371k.m8715f(c3128a);
                if (c4309eM8715f != null) {
                    c1199b.mo3260j(c4309eM8715f);
                }
                c1199b.mo3255e(c3128a.m6642f());
                c1199b.mo3254d(';');
                return;
            case 9:
                C1204a c1204a2 = (C1204a) this.f876b;
                C1203f c1203f = (C1203f) this.f877c;
                AbstractC2963b0 abstractC2963b0 = (AbstractC2963b0) obj;
                boolean z10 = abstractC2963b0 instanceof C4309e;
                EnumC2824a enumC2824a = EnumC2824a.f9166s;
                if (z10) {
                    C4309e c4309e4 = (C4309e) abstractC2963b0;
                    try {
                        C1204a c1204a3 = c1204a2.f4041b;
                        if (c1204a3 == null) {
                            c1204a3 = c1204a2;
                        }
                        C1204a c1204a4 = new C1204a(c4309e4, c1204a3);
                        c1203f.mo3256f();
                        if (!c1204a4.f4040a.f9217g.mo6235a(enumC2824a)) {
                            c1204a4.m3277b(c1203f);
                            c1204a4.m3276a(c1203f, false);
                        }
                        c1204a2.f4047h.addAll(c1204a4.m3286l());
                        return;
                    } catch (Exception e6) {
                        C5787h.m10468a(c4309e4, "Inner class code generation error", e6);
                        return;
                    }
                }
                C4322r c4322r4 = (C4322r) abstractC2963b0;
                EnumC0252b enumC0252b = c1204a2.f4040a.f14371k.f14435a.f719E;
                int iOrdinal2 = enumC0252b.ordinal();
                if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                    C2991w c2991w = (C2991w) c4322r4.f9217g.mo6237c(C2825b.f9199n);
                    if (c2991w != null && c2991w.f9763g != null) {
                        try {
                            if (c4322r4.f14408H.isEmpty()) {
                                c4322r4.m6231w(enumC2824a);
                                return;
                            }
                            List list2 = (List) c4322r4.f14408H.stream().filter(new C0561n(6)).collect(Collectors.toList());
                            if (list2.isEmpty()) {
                                c4322r4.m6231w(enumC2824a);
                                return;
                            }
                            c4322r4.m6380I("Method not inlined, still used in: ".concat(String.valueOf(list2)));
                        } catch (Exception e7) {
                            c4322r4.m6384M("Failed to check method usage", e7);
                        }
                    }
                } else if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                    C0353j.m1309g("Unexpected decompilation mode: ".concat(String.valueOf(enumC0252b)));
                    return;
                }
                if (c1203f.f4035a.length() != c1204a2.f4048i) {
                    c1203f.mo3256f();
                }
                int i12 = c1203f.f4037c;
                try {
                    c1204a2.m3284i(c1203f, c4322r4);
                    return;
                } catch (Exception e10) {
                    if (c4322r4.f14411l.m8656a0().f9217g.mo6235a(EnumC2824a.f9146f0)) {
                        throw new C0084g("Method generation error", e10);
                    }
                    C5787h.m10468a(c4322r4, "Method generation error", e10);
                    AbstractC2124c.m5343d(c1203f, c4322r4);
                    c1203f.f4037c = i12;
                    c1203f.m3273t();
                    return;
                }
            case 10:
                AbstractC5700d.m10279h0((C4322r) this.f876b, (InterfaceC2396e) this.f877c, (InterfaceC4314j) obj);
                return;
            case 11:
                C4322r c4322r5 = (C4322r) this.f876b;
                AbstractC3506j abstractC3506j7 = (AbstractC3506j) this.f877c;
                C3515s c3515s = (C3515s) obj;
                AbstractC3506j abstractC3506jM7400d = c3515s.m7400d();
                if (abstractC3506jM7400d == null || !abstractC3506jM7400d.mo7345w()) {
                    return;
                }
                EnumC3529l enumC3529lM7432d = c4322r5.f14411l.f14371k.f14441g.f11519c.m7432d(abstractC3506jM7400d, abstractC3506j7);
                if (enumC3529lM7432d == EnumC3529l.f11486l || enumC3529lM7432d.m7435c()) {
                    String strValueOf = String.valueOf(abstractC3506jM7400d);
                    String strValueOf2 = String.valueOf(abstractC3506j7);
                    String strM7399c = c3515s.m7399c(c4322r5);
                    StringBuilder sbM1027p = AbstractC0255e.m1027p("Incorrect type for immutable var: ssa=", strValueOf, ", code=", strValueOf2, ", for ");
                    sbM1027p.append(strM7399c);
                    c4322r5.m6382K(sbM1027p.toString());
                    return;
                }
                return;
            case 12:
                C3315t c3315t = (C3315t) this.f876b;
                C4320p[] c4320pArr = (C4320p[]) this.f877c;
                C1402a c1402a = (C1402a) obj;
                C4322r c4322r6 = (C4322r) c3315t.f10677h;
                int i13 = c1402a.f4666h;
                try {
                    c1402a.m3806a();
                    c4320p = c3315t.m7027s(c1402a);
                    break;
                } catch (Exception e11) {
                    C2829f c2829f = c4322r6.f9217g;
                    C2825b c2825b = C2825b.f9188c;
                    boolean zMo6236b = c2829f.mo6236b(c2825b);
                    C5787h.m10468a(c4322r6, "Failed to decode insn: ".concat(String.valueOf(c1402a)), e11);
                    if (zMo6236b) {
                        throw new C0084g("Failed to decode insn: ".concat(String.valueOf(c1402a)), e11);
                    }
                    c4320p = new C4320p(EnumC3400k.f10965Q, 0);
                    c4320p.m6232x(c2825b, new C2984p(AbstractC4855en.m9263g("decode failed: ", e11.getMessage()), e11));
                }
                c4320p.f14399n = i13;
                c4320pArr[i13] = c4320p;
                return;
            default:
                C4322r c4322r7 = (C4322r) this.f876b;
                BitSet bitSet = (BitSet) this.f877c;
                C0075f c0075f = (C0075f) obj;
                C4305a c4305a4 = c0075f.f234c;
                if (c4305a4 == null) {
                    c4322r7.m6380I("Null handler block in: ".concat(String.valueOf(c0075f)));
                    return;
                } else {
                    bitSet.set(c4305a4.f14349j);
                    return;
                }
        }
    }

    public /* synthetic */ C0305w(C0307y c0307y, C4322r c4322r) {
        this.f875a = 1;
        this.f877c = c0307y;
        this.f876b = c4322r;
    }

    public /* synthetic */ C0305w(Object obj, int i9, Object obj2) {
        this.f875a = i9;
        this.f876b = obj;
        this.f877c = obj2;
    }
}
