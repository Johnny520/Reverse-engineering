package p082fd;

import ae.C0070a;
import ae.C0073d;
import be.C0285i;
import be.C0305w;
import com.alibaba.fastjson2.writer.C0640b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Stream;
import md.C2825b;
import md.C2829f;
import md.C2831h;
import md.EnumC2824a;
import mh.InterfaceC2844b;
import nc.C2958a;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p014b.C0126e;
import p020b5.C0192k;
import p025bc.C0257g;
import p025bc.EnumC0251a;
import p025bc.EnumC0252b;
import p081fc.C1199b;
import p081fc.C1203f;
import p084ff.C1219e;
import p128ic.C2038c;
import p140jd.AbstractC2124c;
import p141jf.C2126b;
import p199nd.C2972g;
import p199nd.C2973g0;
import p199nd.C2974h;
import p214oc.C3126c;
import p215od.C3128a;
import p215od.C3130c;
import p222p.AbstractC3199a;
import p232pc.C3389k;
import p246qd.AbstractC3506j;
import p246qd.C3499c;
import p246qd.C3510n;
import p246qd.EnumC3513q;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.C4325u;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;
import p351xe.C5787h;
import td.C4145a;
import ye.AbstractC6035f;

/* JADX INFO: renamed from: fd.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1204a {

    /* JADX INFO: renamed from: a */
    public final C4309e f4040a;

    /* JADX INFO: renamed from: b */
    public final C1204a f4041b;

    /* JADX INFO: renamed from: c */
    public final C0126e f4042c;

    /* JADX INFO: renamed from: d */
    public final boolean f4043d;

    /* JADX INFO: renamed from: e */
    public final boolean f4044e;

    /* JADX INFO: renamed from: f */
    public final boolean f4045f;

    /* JADX INFO: renamed from: g */
    public final int f4046g;

    /* JADX INFO: renamed from: h */
    public final HashSet f4047h;

    /* JADX INFO: renamed from: i */
    public int f4048i;

    /* JADX INFO: renamed from: j */
    public boolean f4049j;

    /* JADX INFO: renamed from: k */
    public C1211h f4050k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1204a(C4309e c4309e, C1204a c1204a, boolean z9, boolean z10, boolean z11, int i9) {
        this.f4047h = new HashSet();
        this.f4040a = c4309e;
        this.f4041b = c1204a;
        this.f4043d = z10;
        this.f4044e = z9;
        this.f4045f = z11;
        this.f4046g = i9;
        this.f4042c = new C0126e(c4309e, 5, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m3274k(C4325u c4325u, C3128a c3128a, C3128a c3128a2) {
        if (c3128a == null) {
            return false;
        }
        String strM6646k = c3128a2.m6646k();
        if (c3128a.m6646k().equals(strM6646k)) {
            return true;
        }
        C4309e c4309eM8715f = c4325u.m8715f(c3128a);
        if (c4309eM8715f != null) {
            for (C4309e c4309e : c4309eM8715f.f14382v) {
                if (c4309e.f14373m.m6646k().equals(strM6646k) && !c4309e.f14373m.m6642f().equals(c3128a2.m6642f())) {
                    return true;
                }
            }
        }
        return m3274k(c4325u, c3128a.f10142k, c3128a2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m3275m(C3128a c3128a, C3128a c3128a2) {
        if (!c3128a.m6650o()) {
            return false;
        }
        C3128a c3128a3 = c3128a.f10142k;
        return Objects.equals(c3128a3, c3128a2) || m3275m(c3128a3, c3128a2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m3276a(C1203f c1203f, boolean z9) {
        C2973g0 c2973g0;
        c1203f.mo3254d('{');
        C4309e c4309e = this.f4040a;
        if (z9 && c4309e.m6385N(EnumC0251a.f700k)) {
            c1203f.mo3255e(" // from class: " + c4309e.f14373m.f10141j);
        }
        this.f4049j = true;
        this.f4048i = c1203f.f4035a.length();
        c1203f.m3268o();
        C2974h c2974h = (C2974h) c4309e.f9217g.mo6237c(C2825b.f9190e);
        if (c2974h != null) {
            List list = c2974h.f9733g;
            Iterator it = list.iterator();
            C1208e c1208e = null;
            while (it.hasNext()) {
                C2972g c2972g = (C2972g) it.next();
                AbstractC2124c.m5341b(c1203f, c2972g.f9729a);
                c1203f.m3271r(c2972g.f9729a.f14390l.f10149j);
                C4145a c4145a = c2972g.f9730b;
                C4322r c4322rM8718i = c4309e.f14371k.m8718i(c4145a.f13662o);
                if (c4145a.f14398m.size() > ((c4322rM8718i == null || (c2973g0 = (C2973g0) c4322rM8718i.f9217g.mo6237c(C2825b.f9202q)) == null) ? 0 : c2973g0.f9732g.cardinality())) {
                    if (c1208e == null) {
                        c1208e = new C1208e(new C1210g(this, c2974h.f9734h), false);
                    }
                    c1208e.m3302f(c1203f, c4145a, 0, c4322rM8718i);
                }
                if (c2972g.f9731c != null) {
                    c1203f.mo3254d(' ');
                    new C1204a(c2972g.f9731c, this).m3276a(c1203f, true);
                }
                if (it.hasNext()) {
                    c1203f.mo3254d(',');
                }
            }
            Iterator it2 = c4309e.f14380t.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (!((C4322r) it2.next()).f9217g.mo6235a(EnumC2824a.f9166s)) {
                        break;
                    }
                } else if (!m3287n()) {
                    Iterator it3 = c4309e.f14382v.iterator();
                    while (it3.hasNext()) {
                        if (!((C4309e) it3.next()).f9217g.mo6236b(C2825b.f9193h)) {
                        }
                    }
                }
            }
            if (list.isEmpty()) {
                c1203f.m3269p();
            }
            c1203f.mo3254d(';');
            if (m3287n()) {
                c1203f.mo3256f();
            }
        }
        Iterator it4 = c4309e.f14381u.iterator();
        while (it4.hasNext()) {
            m3278c(c1203f, (C4311g) it4.next());
        }
        int i9 = 9;
        Stream.of((Object[]) new List[]{c4309e.f14382v, c4309e.f14380t}).flatMap(new C0073d(4)).filter(new C0285i(this, 13)).sorted(Comparator.comparingInt(new C0070a(i9))).forEach(new C0305w(this, i9, c1203f));
        c1203f.m3267n();
        c1203f.m3270q();
        c1203f.mo3260j(C2038c.f6873g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3277b(C1203f c1203f) {
        C2126b c2126b;
        String str;
        C4309e c4309eMo6387P;
        C2126b c2126b2;
        C4309e c4309e = this.f4040a;
        C0192k c0192kM860m = c4309e.f14375o;
        C3128a c3128a = c4309e.f14373m;
        if (c0192kM860m.m852d()) {
            c0192kM860m = c0192kM860m.m860m(1024).m860m(8);
        } else if (c0192kM860m.m850b()) {
            c0192kM860m = c0192kM860m.m860m(16).m860m(1024).m860m(8);
        }
        if (!c3128a.m6650o()) {
            c0192kM860m = c0192kM860m.m860m(8).m860m(2);
        }
        int i9 = c0192kM860m.f488b;
        AbstractC2124c.m5341b(c1203f, c4309e);
        if (c3128a.m6649n()) {
            AbstractC2124c.m5345f(c1203f, c4309e, c3128a.f10138g.mo7350l());
        }
        AbstractC2124c.m5343d(c1203f, c4309e);
        EnumC0251a enumC0251a = EnumC0251a.f700k;
        if (c4309e.m6385N(enumC0251a)) {
            C3389k c3389k = (C3389k) c4309e.f9217g.mo6237c(C3126c.f10130c);
            if (c3389k != null) {
                String str2 = c3389k.f10926g;
                if (!c4309e.m8656a0().f14373m.f10139h.contains(str2)) {
                    AbstractC2124c.m5344e(c1203f, "compiled from: ".concat(str2));
                }
            }
        }
        if (c4309e.m6385N(enumC0251a) && (c2126b = c4309e.f14372l) != null && (str = ((C1219e) c2126b.f7086a.f178j).f4085b) != null && ((c4309eMo6387P = c4309e.mo6387P()) == null || (c2126b2 = c4309eMo6387P.f14372l) == null || !str.equals(((C1219e) c2126b2.f7086a.f178j).f4085b))) {
            AbstractC2124c.m5344e(c1203f, "loaded from: ".concat(str));
        }
        C0126e c0126e = this.f4042c;
        c0126e.m631i((C4309e) c0126e.f332h, c1203f);
        c1203f.m3272s(c4309e.f9752i);
        c1203f.mo3255e(c0192kM860m.m858j(c4309e.m6385N(enumC0251a)));
        if (c0192kM860m.m852d()) {
            if ((i9 & 8192) != 0) {
                c1203f.mo3254d('@');
            }
            c1203f.mo3255e("interface ");
        } else if (c0192kM860m.m850b()) {
            c1203f.mo3255e("enum ");
        } else {
            c1203f.mo3255e("class ");
        }
        c1203f.mo3261k(c4309e);
        c1203f.mo3255e(c3128a.m6646k());
        m3279d(c1203f, c4309e.f14378r, true);
        c1203f.mo3254d(' ');
        AbstractC3506j abstractC3506j = c4309e.f14376p;
        if (abstractC3506j != null && !abstractC3506j.equals(AbstractC3506j.f11394k)) {
            if (!c4309e.f9217g.mo6235a(EnumC2824a.f9169v)) {
                c1203f.mo3255e("extends ");
                m3289p(c1203f, abstractC3506j);
                c1203f.mo3254d(' ');
            }
        }
        if (c4309e.f14377q.isEmpty() || (i9 & 8192) != 0) {
            return;
        }
        if (c4309e.f14375o.m852d()) {
            c1203f.mo3255e("extends ");
        } else {
            c1203f.mo3255e("implements ");
        }
        Iterator it = c4309e.f14377q.iterator();
        while (it.hasNext()) {
            m3289p(c1203f, (AbstractC3506j) it.next());
            if (it.hasNext()) {
                c1203f.mo3255e(", ");
            }
        }
        if (c4309e.f14377q.isEmpty()) {
            return;
        }
        c1203f.mo3254d(' ');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3278c(C1203f c1203f, C4311g c4311g) {
        String strM3332a;
        C4309e c4309e;
        C2829f c2829f = c4311g.f9217g;
        C3130c c3130c = c4311g.f14390l;
        if (c2829f.mo6235a(EnumC2824a.f9166s)) {
            return;
        }
        if (!c4311g.f9217g.mo6236b(C3126c.f10128a)) {
            if (!c4311g.f9217g.mo6236b(C2825b.f9189d)) {
                if (c4311g.f9217g.mo6236b(C2825b.f9186a) || c3130c.m6655b()) {
                    c1203f.mo3256f();
                }
            }
        }
        AbstractC2124c.m5341b(c1203f, c4311g);
        if (c3130c.m6655b()) {
            AbstractC2124c.m5345f(c1203f, c4311g, c3130c.f10147h);
        }
        C0126e c0126e = this.f4042c;
        c0126e.m631i(c4311g, c1203f);
        c1203f.m3271r(c4311g.f14391m.m858j(c4311g.m6385N(EnumC0251a.f700k)));
        m3292s(c1203f, c4311g.f14392n);
        c1203f.mo3254d(' ');
        c1203f.mo3261k(c4311g);
        c1203f.mo3255e(c3130c.f10149j);
        C2831h c2831h = (C2831h) c4311g.f9217g.mo6237c(C2825b.f9196k);
        C4309e c4309e2 = this.f4040a;
        if (c2831h != null) {
            C1208e c1208e = new C1208e(new C1210g(this, c2831h.f9222g), false);
            c1203f.mo3255e(" = ");
            try {
                c1208e.m3306j(c2831h.f9223h, c1203f, EnumC1207d.f4054h);
            } catch (Exception e6) {
                c4309e2.getClass();
                C5787h.m10468a(c4309e2, "Failed to generate init code", e6);
            }
        } else {
            C2958a c2958a = (C2958a) c4311g.f9217g.mo6237c(C3126c.f10133f);
            if (c2958a != null) {
                c1203f.mo3255e(" = ");
                int i9 = c2958a.f9704g;
                boolean z9 = this.f4043d;
                if (i9 == 1) {
                    AbstractC3506j abstractC3506j = c4311g.f14392n;
                    InterfaceC2844b interfaceC2844b = AbstractC1213j.f4074a;
                    c1203f.mo3255e(AbstractC1213j.m3332a(0L, abstractC3506j, c4309e2.mo8668n().f14437c, z9, false));
                } else {
                    Object objM250n = AbstractC0018a.m250n(c2958a);
                    if (objM250n instanceof C3510n) {
                        long j3 = ((C3510n) objM250n).f11422l;
                        AbstractC3506j abstractC3506j2 = c4311g.f14392n;
                        if (this.f4046g != 2) {
                            InterfaceC2844b interfaceC2844b2 = AbstractC6035f.f24493a;
                            if (abstractC3506j2.equals(AbstractC3506j.f11385b) && (c4309e = c4309e2.f14384x) != null && c4309e.f14373m.m6646k().equals("R")) {
                                strM3332a = String.format("0x%08x", Long.valueOf(j3));
                            } else {
                                InterfaceC2844b interfaceC2844b3 = AbstractC1213j.f4074a;
                                strM3332a = AbstractC1213j.m3332a(j3, abstractC3506j2, c4309e2.mo8668n().f14437c, z9, false);
                            }
                            c1203f.mo3255e(strM3332a);
                        }
                    } else {
                        c0126e.m639q(c4309e2.f14371k, c1203f, c2958a);
                    }
                }
            }
        }
        c1203f.mo3254d(';');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final boolean m3279d(C1203f c1203f, List list, boolean z9) {
        int i9 = 0;
        if (list == null || list.isEmpty()) {
            return false;
        }
        c1203f.mo3254d('<');
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractC3506j abstractC3506j = (AbstractC3506j) it.next();
            if (i9 != 0) {
                c1203f.mo3255e(", ");
            }
            abstractC3506j.getClass();
            if (abstractC3506j instanceof C3499c) {
                c1203f.mo3255e(abstractC3506j.mo7350l());
            } else {
                m3289p(c1203f, abstractC3506j);
            }
            List listMo7348i = abstractC3506j.mo7348i();
            if (listMo7348i != null && !listMo7348i.isEmpty()) {
                c1203f.mo3255e(" extends ");
                Iterator it2 = listMo7348i.iterator();
                while (it2.hasNext()) {
                    AbstractC3506j abstractC3506j2 = (AbstractC3506j) it2.next();
                    abstractC3506j2.getClass();
                    if (abstractC3506j2 instanceof C3499c) {
                        c1203f.mo3255e(abstractC3506j2.mo7350l());
                    } else {
                        m3289p(c1203f, abstractC3506j2);
                        if (z9) {
                            C4309e c4309e = this.f4040a;
                            if (!c4309e.f14373m.m6650o()) {
                                C4325u c4325u = c4309e.f14371k;
                                if (c4325u.f14435a.f747p) {
                                    m3281f(C3128a.m6637e(c4325u, abstractC3506j2));
                                }
                            }
                        }
                    }
                    if (it2.hasNext()) {
                        c1203f.mo3255e(" & ");
                    }
                }
            }
            i9++;
        }
        c1203f.mo3254d('>');
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m3280e(C1203f c1203f, AbstractC3506j abstractC3506j) {
        List listMo7346j = abstractC3506j.mo7346j();
        if (listMo7346j != null) {
            c1203f.mo3254d('<');
            int size = listMo7346j.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (i9 != 0) {
                    c1203f.mo3255e(", ");
                }
                AbstractC3506j abstractC3506j2 = (AbstractC3506j) listMo7346j.get(i9);
                AbstractC3506j abstractC3506jMo7356r = abstractC3506j2.mo7356r();
                if (abstractC3506jMo7356r != null) {
                    int iMo7355q = abstractC3506j2.mo7355q();
                    c1203f.mo3255e(AbstractC3199a.m6831d(iMo7355q));
                    if (iMo7355q != 2) {
                        m3292s(c1203f, abstractC3506jMo7356r);
                    }
                } else {
                    m3292s(c1203f, abstractC3506j2);
                }
            }
            c1203f.mo3254d('>');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m3281f(C3128a c3128a) {
        C1204a c1204a = this.f4041b;
        if (c1204a != null) {
            c1204a.m3281f(c3128a);
        } else {
            this.f4047h.add(c3128a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m3282g(C1199b c1199b) {
        HashSet hashSet = this.f4047h;
        if (hashSet.size() != 0) {
            ArrayList arrayList = new ArrayList(hashSet);
            arrayList.sort(Comparator.comparing(new C0640b(19)));
            arrayList.forEach(new C0305w(this, 8, c1199b));
            c1199b.mo3256f();
            hashSet.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m3283h(C1203f c1203f, AbstractC3506j abstractC3506j) {
        AbstractC3506j abstractC3506jMo7352k = abstractC3506j.mo7352k();
        AbstractC3506j abstractC3506jMo7353m = abstractC3506jMo7352k.mo7353m();
        if (abstractC3506jMo7353m == null) {
            m3291r(c1203f, abstractC3506j, abstractC3506jMo7352k);
            return;
        }
        m3291r(c1203f, abstractC3506j, abstractC3506jMo7353m);
        c1203f.mo3254d('.');
        m3283h(c1203f, abstractC3506jMo7352k);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003e  */
    /* JADX INFO: renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3284i(C1203f c1203f, C4322r c4322r) {
        C1210g c1210gM3313h;
        AbstractC2124c.m5341b(c1203f, c4322r);
        AbstractC2124c.m5343d(c1203f, c4322r);
        if (c4322r.f14415p) {
            new C1210g(this, c4322r).m3317b(c1203f);
            c1203f.mo3254d(';');
            return;
        }
        boolean zMo6235a = c4322r.f9217g.mo6235a(EnumC2824a.f9140Z);
        if (zMo6235a && this.f4045f) {
            zMo6235a = false;
        }
        if (zMo6235a || this.f4043d) {
            c1210gM3313h = C1210g.m3313h(c4322r);
        } else {
            if (!c4322r.f9217g.mo6236b(C2825b.f9188c)) {
                c1210gM3313h = new C1210g(this, c4322r);
            }
        }
        if (c1210gM3313h.m3317b(c1203f)) {
            c1203f.mo3254d(' ');
        }
        c1203f.mo3254d('{');
        c1203f.m3268o();
        c1210gM3313h.m3319d(c1203f);
        c1203f.m3267n();
        c1203f.m3270q();
        c1203f.mo3260j(C2038c.f6873g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m3285j(C1199b c1199b) {
        C4309e c4309e = this.f4040a;
        if (c4309e.f14373m.m6645j().isEmpty()) {
            c1199b.mo3255e("// default package");
            return;
        }
        c1199b.mo3255e("package ");
        c1199b.mo3255e(c4309e.f14373m.m6645j());
        c1199b.mo3254d(';');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final Set m3286l() {
        C1204a c1204a = this.f4041b;
        return c1204a != null ? c1204a.m3286l() : this.f4047h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m3287n() {
        for (C4311g c4311g : this.f4040a.f14381u) {
            if (!c4311g.f9217g.mo6235a(EnumC2824a.f9166s)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m3288o(C1203f c1203f, C3128a c3128a) {
        C4309e c4309e = this.f4040a;
        C4309e c4309eM8715f = c4309e.f14371k.m8715f(c3128a);
        if (c4309eM8715f == null) {
            c1203f.mo3255e(m3290q(c4309e.f14373m, c3128a));
            return;
        }
        c1203f.mo3260j(c4309eM8715f);
        c1203f.mo3255e(m3290q(c4309e.f14373m, c4309eM8715f.f14373m));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m3289p(C1203f c1203f, AbstractC3506j abstractC3506j) {
        AbstractC3506j abstractC3506jMo7353m = abstractC3506j.mo7353m();
        if (abstractC3506jMo7353m == null) {
            m3288o(c1203f, C3128a.m6637e(this.f4040a.f14371k, abstractC3506j));
            m3280e(c1203f, abstractC3506j);
        } else {
            m3289p(c1203f, abstractC3506jMo7353m);
            c1203f.mo3254d('.');
            m3283h(c1203f, abstractC3506j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final String m3290q(C3128a c3128a, C3128a c3128a2) {
        boolean z9;
        String strM6642f = c3128a2.m6642f();
        if (!this.f4043d && this.f4044e) {
            String strM6646k = c3128a2.m6646k();
            if (!c3128a.equals(c3128a2) && !c3128a2.m6645j().isEmpty() && !m3275m(c3128a, c3128a2)) {
                if (c3128a2.m6650o()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c3128a2);
                    for (C3128a c3128a3 = c3128a2.f10142k; c3128a3 != null; c3128a3 = c3128a3.f10142k) {
                        if (c3128a3 == c3128a || m3275m(c3128a, c3128a3)) {
                            z9 = false;
                            break;
                        }
                        arrayList.add(c3128a3);
                    }
                    z9 = true;
                    Collections.reverse(arrayList);
                    if (z9) {
                        m3281f((C3128a) arrayList.get(0));
                    }
                    return AbstractC5798s.m10517k(arrayList, ".", new C0640b(20));
                }
                C4309e c4309e = this.f4040a;
                if (!m3274k(c4309e.f14371k, c3128a, c3128a2)) {
                    C4325u c4325u = c4309e.f14371k;
                    String strM6645j = c3128a.m6645j();
                    if (!(strM6645j.equals(c3128a2.m6645j()) ? false : c4325u.f14453s.f2834b.containsKey(AbstractC4855en.m9264h(strM6645j, ".", c3128a2.m6646k())))) {
                        C3128a c3128aM6648m = c3128a.m6648m();
                        C3128a c3128aM6648m2 = c3128a2.m6648m();
                        if (!(c3128aM6648m != null ? c3128aM6648m.equals(c3128aM6648m2) : c3128a.equals(c3128aM6648m2)) && ((!c3128a2.m6647l().equals("java.lang") || c3128a2.f10142k != null) && (!c3128a2.m6647l().equals(c3128a.m6647l()) || c3128a2.m6650o()))) {
                            if (c3128a2.m6645j().equals(c3128a.m6645j())) {
                                strM6642f = c3128a2.m6644i();
                            }
                            for (C3128a c3128a4 : m3286l()) {
                                if (!c3128a4.equals(c3128a2) && c3128a4.m6646k().equals(strM6646k)) {
                                    return c3128a2.m6650o() ? AbstractC4855en.m9264h(m3290q(c3128a, c3128a2.f10142k), ".", strM6646k) : strM6642f;
                                }
                            }
                            m3281f(c3128a2);
                            return strM6646k;
                        }
                    }
                }
            }
            return strM6646k;
        }
        return strM6642f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final void m3291r(C1203f c1203f, AbstractC3506j abstractC3506j, AbstractC3506j abstractC3506j2) {
        String strMo7350l = abstractC3506j2.mo7350l().contains(".") ? abstractC3506j2.mo7350l() : abstractC3506j.mo7350l();
        C4309e c4309e = this.f4040a;
        C3128a c3128aM6636d = C3128a.m6636d(c4309e.f14371k, strMo7350l);
        C4309e c4309eM8715f = c4309e.f14371k.m8715f(c3128aM6636d);
        if (c4309eM8715f != null) {
            c1203f.mo3260j(c4309eM8715f);
        }
        c1203f.mo3255e(c3128aM6636d.m6646k());
        m3280e(c1203f, abstractC3506j2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m3292s(C1203f c1203f, AbstractC3506j abstractC3506j) {
        EnumC3513q enumC3513qMo7343o = abstractC3506j.mo7343o();
        if (enumC3513qMo7343o == null) {
            c1203f.mo3255e(abstractC3506j.toString());
            return;
        }
        if (enumC3513qMo7343o == EnumC3513q.OBJECT) {
            if (abstractC3506j instanceof C3499c) {
                c1203f.mo3255e(abstractC3506j.mo7350l());
                return;
            } else {
                m3289p(c1203f, abstractC3506j);
                return;
            }
        }
        if (enumC3513qMo7343o != EnumC3513q.ARRAY) {
            c1203f.mo3255e(enumC3513qMo7343o.f11437h);
        } else {
            m3292s(c1203f, abstractC3506j.mo7340g());
            c1203f.mo3255e(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
        }
    }

    public C1204a(C4309e c4309e, C1204a c1204a) {
        this(c4309e, c1204a, c1204a.f4044e, c1204a.f4043d, c1204a.f4045f, c1204a.f4046g);
    }

    public C1204a(C4309e c4309e, C0257g c0257g) {
        this(c4309e, null, c0257g.f747p, c0257g.f719E == EnumC0252b.f705i, c0257g.f746o, c0257g.f736V);
    }
}
