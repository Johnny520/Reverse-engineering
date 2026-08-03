package p112he;

import be.AbstractC0269a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import md.C2825b;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nc.C2958a;
import p020b5.C0192k;
import p157kd.AbstractC2390d;
import p214oc.C3126c;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p233pd.C3393d;
import p233pd.C3399j;
import p233pd.C3403n;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3509m;
import p246qd.C3514r;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: he.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1709a extends AbstractC0269a {

    /* JADX INFO: renamed from: j */
    public static final InterfaceC2844b f5697j = AbstractC2846d.m6274b(C1709a.class);

    /* JADX INFO: renamed from: g */
    public C3128a f5698g;

    /* JADX INFO: renamed from: h */
    public HashSet f5699h;

    /* JADX INFO: renamed from: i */
    public boolean f5700i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static boolean m4341i(C3514r c3514r, String str) {
        if (str.startsWith("$this$")) {
            str = str.substring(6);
        } else if (str.startsWith("$")) {
            str = str.substring(1);
        }
        if (!AbstractC2390d.m5714c(str)) {
            return false;
        }
        c3514r.f11440m.m7398b().f11411a = str;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m4342j(C4322r c4322r, C4320p c4320p, int i9) {
        AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(i9);
        abstractC3508lMo7179S.getClass();
        if (!(abstractC3508lMo7179S instanceof C3509m)) {
            return null;
        }
        C4320p c4320p2 = ((C3509m) abstractC3508lMo7179S).f11421l;
        EnumC3400k enumC3400k = c4320p2.f14396k;
        if (enumC3400k == EnumC3400k.f10978h) {
            return ((C3393d) c4320p2).f10930o;
        }
        if (enumC3400k != EnumC3400k.f10961M) {
            return null;
        }
        C4311g c4311gM8717h = c4322r.f14411l.f14371k.m8717h((C3130c) ((C3399j) c4320p2).f10948o);
        if (c4311gM8717h == null) {
            return null;
        }
        String str = (String) ((C2958a) c4311gM8717h.f9217g.mo6237c(C3126c.f10133f)).f9705h;
        c4320p.mo7181b0(abstractC3508lMo7179S, AbstractC3508l.m7372Z(new C3393d(str)));
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: f */
    public final void mo1052f(C4325u c4325u) {
        c4325u.getClass();
        C4309e c4309eM8715f = c4325u.m8715f(C3128a.m6637e(c4325u, AbstractC3506j.m7360x("kotlin.jvm.internal.Intrinsics")));
        if (c4309eM8715f == null) {
            ArrayList arrayList = new ArrayList();
            for (C4309e c4309e : c4325u.f14448n) {
                C3128a c3128a = c4309e.f14373m;
                if (!c3128a.m6646k().equals("Intrinsics") || !c3128a.m6642f().equals("kotlin.jvm.internal.Intrinsics")) {
                    if (c3128a.f10141j.startsWith("kotlin.jvm.internal.") && c4309e.f14380t.size() >= 5) {
                        int i9 = 0;
                        for (C4322r c4322r : c4309e.f14380t) {
                            if (c4322r.f14412m.m856h() && c4322r.f14410k.f10154k.endsWith("(Ljava/lang/Object;Ljava/lang/String;)V")) {
                                i9++;
                            }
                        }
                        if (i9 > 2) {
                        }
                    }
                }
                arrayList.add(c4309e);
            }
            c4309eM8715f = (C4309e) AbstractC5798s.m10512f(arrayList);
        }
        InterfaceC2844b interfaceC2844b = f5697j;
        if (c4309eM8715f != null) {
            this.f5698g = c4309eM8715f.f14373m;
            HashSet hashSet = new HashSet();
            for (C4322r c4322r2 : c4309eM8715f.f14380t) {
                C0192k c0192k = c4322r2.f14412m;
                C3131d c3131d = c4322r2.f14410k;
                if (c0192k.m856h()) {
                    String str = c3131d.f10154k;
                    if (str.endsWith("(Ljava/lang/Object;Ljava/lang/String;)V") || str.endsWith("(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V")) {
                        hashSet.add(c3131d);
                    }
                }
            }
            this.f5699h = hashSet;
            interfaceC2844b.mo6271y(c4309eM8715f, "Kotlin Intrinsics class: {}, methods: {}", Integer.valueOf(hashSet.size()));
        } else {
            this.f5698g = null;
            interfaceC2844b.mo6258l("Kotlin Intrinsics class not found");
        }
        this.f5700i = c4325u.f14435a.f737W == 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // be.AbstractC0269a
    /* JADX INFO: renamed from: h */
    public final boolean mo1054h(C4309e c4309e) {
        if (this.f5698g == null) {
            return false;
        }
        for (C4322r c4322r : c4309e.f14380t) {
            if (!c4322r.f14415p) {
                if (!c4322r.f9217g.mo6236b(C2825b.f9188c)) {
                    Iterator it = c4322r.f14425z.iterator();
                    while (it.hasNext()) {
                        for (C4320p c4320p : ((C4305a) it.next()).f14351l) {
                            if (c4320p.f14396k == EnumC3400k.f10963O) {
                                try {
                                    m4343k(c4322r, c4320p);
                                } catch (Exception e6) {
                                    c4322r.m6384M("Failed to extract var names", e6);
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final void m4343k(C4322r c4322r, C4320p c4320p) {
        String strM4342j;
        int size = c4320p.f14398m.size();
        if (size < 2) {
            return;
        }
        if (this.f5699h.contains(((C3403n) c4320p).f11005p)) {
            boolean zM4341i = false;
            AbstractC3508l abstractC3508lMo7179S = c4320p.mo7179S(0);
            abstractC3508lMo7179S.getClass();
            if (abstractC3508lMo7179S instanceof C3514r) {
                C3514r c3514r = (C3514r) abstractC3508lMo7179S;
                if (size == 2) {
                    String strM4342j2 = m4342j(c4322r, c4320p, 1);
                    if (strM4342j2 != null) {
                        zM4341i = m4341i(c3514r, strM4342j2);
                    }
                } else if (size == 3 && (strM4342j = m4342j(c4322r, c4320p, 2)) != null) {
                    zM4341i = m4341i(c3514r, strM4342j);
                }
                if (zM4341i && this.f5700i) {
                    c4320p.m6231w(EnumC2824a.f9166s);
                }
            }
        }
    }
}
