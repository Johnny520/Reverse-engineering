package ae;

import be.AbstractC0283h;
import be.C0271b;
import be.C0277e;
import be.C0284h0;
import be.C0294m0;
import bf.AbstractC0310b;
import bsh.classpath.BshClassPath;
import com.alibaba.fastjson2.JSONObject;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import md.AbstractC2828e;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import md.InterfaceC2832i;
import mh.InterfaceC2844b;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p007a7.C0019b;
import p020b5.C0192k;
import p038ce.C0558k;
import p038ce.C0560m;
import p038ce.C0561n;
import p068eh.AbstractC0921a;
import p084ff.C1215a;
import p084ff.C1219e;
import p136j8.C2104o;
import p199nd.C2960a;
import p199nd.C2971f0;
import p199nd.C2973g0;
import p199nd.C2993y;
import p214oc.C3126c;
import p215od.C3128a;
import p215od.C3131d;
import p233pd.AbstractC3409t;
import p233pd.C3403n;
import p233pd.C3406q;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3514r;
import p246qd.C3515s;
import p247qe.C3531n;
import p247qe.C3542y;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p332wb.AbstractC4855en;
import p333wc.C5552a;
import p351xe.C5787h;
import re.C3800c;
import td.C4145a;

/* JADX INFO: renamed from: ae.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0074e implements Consumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f231a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [qe.n.l(ud.r):void] */
    public /* synthetic */ C0074e(C3531n c3531n) {
        this.f231a = 25;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.alibaba.fastjson2.JSONObject.f(java.lang.Object):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        C4320p c4320pM64f0;
        C3514r c3514r;
        C3515s c3515s;
        int i9 = this.f231a;
        EnumC2824a enumC2824a = EnumC2824a.f9122H;
        int i10 = 25;
        int i11 = 0;
        EnumC2824a enumC2824a2 = EnumC2824a.f9168u;
        EnumC2824a enumC2824a3 = EnumC2824a.f9166s;
        switch (i9) {
            case 0:
                ((C4305a) obj).m6231w(enumC2824a2);
                break;
            case 1:
                C4322r c4322r = (C4322r) obj;
                boolean z9 = c4322r.f14415p;
                C4309e c4309e = c4322r.f14411l;
                if (!z9 && !c4322r.f9217g.mo6235a(enumC2824a3) && c4322r.f14412m.m857i()) {
                    C4325u c4325u = c4309e.f14371k;
                    if (c4325u.f14435a.f751t) {
                        List list = c4322r.f14425z;
                        ArrayList arrayList = new ArrayList();
                        list.forEach(new C0294m0(6, arrayList));
                        if (arrayList.size() == 1) {
                            C4320p c4320p = (C4320p) arrayList.get(0);
                            if (c4320p.f14396k == EnumC3400k.f10986p) {
                                AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
                                abstractC3508lMo7179S.getClass();
                                if (abstractC3508lMo7179S instanceof C3509m) {
                                    c4320p = ((C3509m) abstractC3508lMo7179S).f11421l;
                                }
                            }
                            if (c4320p.f14396k == EnumC3400k.f10963O) {
                                C3403n c3403n = (C3403n) c4320p;
                                if (c3403n.f11004o != 5) {
                                    C3131d c3131d = c3403n.f11005p;
                                    C3131d c3131d2 = c4322r.f14410k;
                                    C4322r c4322rM8718i = c4325u.m8718i(c3131d);
                                    if (c4322rM8718i != null) {
                                        C0192k c0192k = c4322rM8718i.f14412m;
                                        if (!c0192k.m856h() && c3131d.f10152i.size() == c3131d2.f10152i.size() && c4309e.equals(c4322rM8718i.f14411l)) {
                                            Iterator it = c4320p.f14398m.iterator();
                                            while (it.hasNext()) {
                                                if (!C0271b.m1084T((AbstractC3508l) it.next())) {
                                                }
                                            }
                                            if (!c0192k.m855g()) {
                                                c4325u.f14435a.getClass();
                                                C0277e.m1118i(c4322rM8718i, 1);
                                            }
                                            String str = c3131d2.f10157n;
                                            if (!Objects.equals(c4322rM8718i.f14410k.f10157n, str)) {
                                                c4322rM8718i.m8705d0(str);
                                                C2971f0 c2971f0 = (C2971f0) c4322rM8718i.f9217g.mo6237c(C2825b.f9187b);
                                                if (c2971f0 == null) {
                                                    c2971f0 = new C2971f0();
                                                    c2971f0.f9728g = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    c4322rM8718i.m6233y(c2971f0);
                                                }
                                                c2971f0.m6390b("merged with bridge method [inline-methods]");
                                            }
                                            c4322rM8718i.m6233y(new C2993y(c4322r));
                                            c4322rM8718i.m6224A(c4322r, C2825b.f9203r);
                                            c4322rM8718i.m6380I("Method merged with bridge method: " + c3131d2.f10154k);
                                            c4322r.m6231w(enumC2824a3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (c4322r.m8698W()) {
                        if ((c4322r.f9217g.mo6235a(EnumC2824a.f9143c0) || c4322r.f9217g.mo6235a(enumC2824a)) && (c4320pM64f0 = AbstractC0000a.m64f0(c4322r)) != null) {
                            List<C3514r> listM8694S = c4322r.m8694S();
                            boolean z10 = false;
                            for (C3514r c3514r2 : listM8694S) {
                                AbstractC3506j abstractC3506jMo7375I = c3514r2.mo7375I();
                                if (abstractC3506jMo7375I.mo7351v()) {
                                    C4309e c4309eM8716g = c4325u.m8716g(abstractC3506jMo7375I);
                                    if (c4309eM8716g == null) {
                                        C3128a c3128aM6637e = C3128a.m6637e(c4325u, abstractC3506jMo7375I);
                                        if (c3128aM6637e.f10142k != null && c4309e.f14373m.m6642f().startsWith(c3128aM6637e.f10142k.f10141j)) {
                                            c3514r2.m6231w(enumC2824a2);
                                            z10 = true;
                                        }
                                    } else if (c4309eM8716g.f9217g.mo6235a(enumC2824a3) || C0271b.m1076L(c4309eM8716g)) {
                                        c3514r2.m6231w(enumC2824a2);
                                        z10 = true;
                                    }
                                }
                            }
                            if (z10 && c4320pM64f0.f14396k == EnumC3400k.f10967S) {
                                C4145a c4145a = (C4145a) c4320pM64f0;
                                if (c4145a.f13663p == 3 && !listM8694S.isEmpty()) {
                                    if (((C3514r) listM8694S.get(0)).mo7375I().equals(c4309e.f14384x.f14373m.f10138g)) {
                                        C2973g0.m6391b(c4322r, 0);
                                    }
                                    int size = listM8694S.size();
                                    while (i11 < size) {
                                        C3515s c3515s2 = ((C3514r) listM8694S.get(i11)).f11440m;
                                        if (c3515s2 != null && c3515s2.f11445j.size() == 0) {
                                            C2973g0.m6391b(c4322r, i11);
                                        }
                                        i11++;
                                    }
                                    C4322r c4322rM8718i2 = c4325u.m8718i(c4145a.f13662o);
                                    if (c4322rM8718i2 != null) {
                                        c4322r.m6233y(new C2993y(c4322rM8718i2));
                                        c4322r.m6231w(enumC2824a3);
                                        InterfaceC2844b interfaceC2844b = C3800c.f12485g;
                                        List arrayList2 = c4322rM8718i2.f14408H;
                                        List list2 = c4322r.f14408H;
                                        if (arrayList2.isEmpty()) {
                                            arrayList2 = list2;
                                        } else if (!list2.isEmpty()) {
                                            TreeSet treeSet = new TreeSet(arrayList2);
                                            treeSet.addAll(list2);
                                            arrayList2 = new ArrayList(treeSet);
                                        }
                                        arrayList2.remove(c4322r);
                                        c4322rM8718i2.f14408H = arrayList2;
                                        c4322r.f14408H = Collections.EMPTY_LIST;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                break;
            case 2:
                C4322r c4322r2 = (C4322r) obj;
                if (c4322r2.m8694S().isEmpty()) {
                    C0192k c0192k2 = c4322r2.f14412m;
                    boolean z11 = c4322r2.m8698W() && c0192k2.m855g();
                    boolean z12 = c4322r2.f14410k.m6662e() && c0192k2.m856h();
                    if ((z11 || z12) && AbstractC0000a.m75l0(c4322r2.f14425z)) {
                        if (z12) {
                            c4322r2.m6231w(enumC2824a3);
                        } else if (c4322r2.m8699X()) {
                            for (C4322r c4322r3 : c4322r2.f14411l.f14380t) {
                                if (c4322r3 != c4322r2 && c4322r3.m8698W() && !c4322r3.m8699X()) {
                                    break;
                                }
                            }
                            if (!c4322r2.f9217g.mo6236b(C3126c.f10128a)) {
                                c4322r2.m6231w(enumC2824a3);
                            }
                        }
                    }
                    break;
                }
                break;
            case 3:
                AbstractC3508l abstractC3508l = (AbstractC3508l) obj;
                abstractC3508l.getClass();
                if ((abstractC3508l instanceof C3514r) && (c3515s = (c3514r = (C3514r) abstractC3508l).f11440m) != null) {
                    c3515s.m7406k(c3514r);
                    c3514r.f11440m = null;
                    break;
                }
                break;
            case 4:
                AbstractC3508l abstractC3508l2 = (AbstractC3508l) obj;
                abstractC3508l2.m6231w(EnumC2824a.f9164q);
                if (abstractC3508l2 instanceof C3514r) {
                    ((C3514r) abstractC3508l2).f11440m.m7398b().f11414d = true;
                }
                break;
            case 5:
                C4320p c4320p2 = (C4320p) obj;
                int iOrdinal = c4320p2.f14396k.ordinal();
                if (iOrdinal != 0 && iOrdinal != 3 && iOrdinal != 8 && iOrdinal != 15 && iOrdinal != 25 && iOrdinal != 27) {
                    for (AbstractC3508l abstractC3508l3 : c4320p2.f14398m) {
                        abstractC3508l3.getClass();
                        if ((abstractC3508l3 instanceof C3510n) && abstractC3508l3.mo7375I() != AbstractC3506j.f11385b) {
                            abstractC3508l3.m6231w(EnumC2824a.f9137W);
                        }
                    }
                    break;
                }
                break;
            case 6:
                C4309e c4309e2 = (C4309e) obj;
                try {
                    C0284h0.m1191k(c4309e2);
                } catch (Exception | StackOverflowError e6) {
                    c4309e2.getClass();
                    C5787h.m10468a(c4309e2, "Anonymous visitor error", e6);
                    return;
                }
                break;
            case 7:
                C4309e c4309e3 = (C4309e) obj;
                C2829f c2829f = c4309e3.f9217g;
                C2825b c2825b = C2825b.f9193h;
                C4309e c4309e4 = ((C2960a) c2829f.mo6237c(c2825b)).f9709g;
                c4309e3.f14386z = AbstractC0283h.m1145Y(c4309e3.f14386z, c4309e4.m8656a0());
                c4309e4.f14367B = AbstractC0283h.m1145Y(c4309e4.f14367B, c4309e3);
                c4309e3.m6228E(c2825b);
                c4309e3.m6227D(enumC2824a3);
                for (C4322r c4322r4 : c4309e3.f14380t) {
                    if (c4322r4.m8698W()) {
                        c4322r4.m6227D(enumC2824a);
                    }
                }
                c4309e3.m6380I("Anonymous mark cleared");
                break;
            case 8:
                Path path = (Path) obj;
                try {
                    Files.delete(path);
                } catch (Exception e7) {
                    AbstractC0310b.f883a.mo6265s(path.toAbsolutePath(), "Failed to delete file {}", e7);
                    return;
                }
                break;
            case 9:
                ((BshClassPath) obj).insureInitialized(false);
                break;
            case 10:
                ((C4305a) obj).m8642H();
                break;
            case 11:
                ((C0077h) obj).f245i.removeIf(new C0019b(i10));
                break;
            case 12:
                C4305a c4305a = (C4305a) obj;
                c4305a.m6228E(C2825b.f9211z);
                c4305a.m6227D(EnumC2824a.f9155k);
                c4305a.m6227D(EnumC2824a.f9157l);
                c4305a.f14355p = null;
                c4305a.f14358s = null;
                c4305a.f14357r = null;
                c4305a.f14360u.clear();
                break;
            case 13:
                C4305a c4305a2 = (C4305a) obj;
                c4305a2.f14353n.forEach(new C0558k(c4305a2, i11));
                break;
            case 14:
                C0560m.m1569l((C4305a) obj);
                break;
            case 15:
                C4305a c4305a3 = (C4305a) obj;
                C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a3);
                if (c4320pM57c0 instanceof AbstractC3409t) {
                    ((AbstractC3409t) c4320pM57c0).mo7174i0(c4305a3);
                }
                break;
            case 16:
                AbstractC0283h.m1141U(((C4305a) obj).f14351l);
                break;
            case 17:
                JSONObject.lambda$of$2(obj);
                break;
            case 18:
                ((C4322r) obj).m6231w(EnumC2824a.f9145e0);
                break;
            case 19:
                ((C4322r) obj).m6227D(enumC2824a3);
                break;
            case 20:
                C1215a.f4076c.mo6270x((C1219e) obj, "Loading dex: {}");
                break;
            case 21:
                ((AbstractC2828e) ((InterfaceC2832i) obj)).m6231w(enumC2824a2);
                break;
            case 22:
                ((C4305a) obj).m6231w(EnumC2824a.f9173z);
                break;
            case 23:
                ((Map) obj).entrySet().removeIf(new C0561n(19));
                break;
            case 24:
                C0271b.m1077M((C3514r) obj);
                break;
            case 25:
                C3515s c3515s3 = (C3515s) obj;
                List<C3406q> list3 = c3515s3.f11446k;
                if (list3 == null) {
                    list3 = Collections.EMPTY_LIST;
                }
                for (C3406q c3406q : list3) {
                    LinkedHashSet linkedHashSet = (LinkedHashSet) c3515s3.f11447l.f10678i;
                    linkedHashSet.addAll((LinkedHashSet) c3406q.f14397l.f11440m.f11447l.f10678i);
                    Iterator it2 = c3406q.f14398m.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll((LinkedHashSet) ((C3514r) ((AbstractC3508l) it2.next())).f11440m.f11447l.f10678i);
                    }
                }
                break;
            case 26:
                C3542y c3542y = (C3542y) obj;
                c3542y.f11522h.mo7386W(c3542y.f11523i);
                break;
            case 27:
                C5552a c5552a = (C5552a) obj;
                String str2 = c5552a.f22648a;
                if (str2 == null || !str2.startsWith("dex-input.")) {
                    C2104o.m5294t(AbstractC4855en.m9263g("Plugin option name should start with plugin id: 'dex-input.', option: ", str2));
                    break;
                } else {
                    String str3 = c5552a.f22649b;
                    if (str3 == null || str3.isEmpty()) {
                        C2104o.m5294t("Plugin option description not set, plugin: dex-input");
                        break;
                    } else if (((List) c5552a.f22650c.stream().map(c5552a.f22652e).collect(Collectors.toList())) == null) {
                        C2104o.m5294t(AbstractC0921a.m2251n("Plugin option values is null, option: ", str2, ", plugin: dex-input"));
                        break;
                    }
                }
                break;
            case 28:
                ((C4309e) obj).m8652W();
                break;
            default:
                ((C4322r) obj).m8706e0();
                break;
        }
    }

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [b5.c.H(xd.b, nd.t, le.c):ud.a, bc.k.e():void, be.b.N(qd.r):void, be.b.g(ud.r):void, be.b.h(ud.e):boolean, be.b.j(ud.r, ud.p, boolean):nd.w, be.d0.g(ud.r):void, be.f0.accept(java.lang.Object, java.lang.Object):void, be.h0.f(ud.u):void, bf.b.b(java.nio.file.Path, boolean):void, bsh.classpath.BshClassPath.insureInitialized(boolean):void, ce.a.test(java.lang.Object):boolean, ce.d.accept(java.lang.Object):void, ce.l.g(ud.r):void, ce.l.j(ud.r):void, ce.l.n(java.util.LinkedHashSet, ud.r):void, ce.m.g(ud.r):void, com.alibaba.fastjson2.JSONObject.of(com.alibaba.fastjson2.JSONObject, java.lang.Object[]):com.alibaba.fastjson2.JSONObject, ee.c.m(ud.r, ae.h):boolean, ff.b.a(java.util.ArrayList):lc.a, ke.c.o(hb.r):void, md.e.F():void, qe.x.c(ud.r, qd.s, qd.j, qe.a0):int, ud.e.W():void, ud.e.o0():void, ud.u.<init>(bc.k):void] */
    public /* synthetic */ C0074e(int i9) {
        this.f231a = i9;
    }
}
