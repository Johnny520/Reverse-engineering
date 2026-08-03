package p082fd;

import ae.C0075f;
import androidx.lifecycle.C0119x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import md.AbstractC2828e;
import md.C2825b;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nc.C2958a;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p025bc.EnumC0251a;
import p066ed.C0909b;
import p077f8.AbstractC1089i;
import p081fc.C1199b;
import p081fc.C1203f;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p128ic.C2036a;
import p128ic.C2039d;
import p140jd.AbstractC2124c;
import p199nd.C2968e;
import p214oc.C3126c;
import p215od.C3128a;
import p215od.C3130c;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3507k;
import p246qd.C3512p;
import p246qd.C3514r;
import p246qd.C3515s;
import p259r9.AbstractC3754e0;
import p302ud.C4305a;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4314j;
import p350xd.C5775b;
import p369yd.C6029c;

/* JADX INFO: renamed from: fd.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1212i extends C1208e {

    /* JADX INFO: renamed from: h */
    public static final InterfaceC2844b f4073h = AbstractC2846d.m6274b(C1212i.class);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: ud.j */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    public final void m3326r(C1203f c1203f, InterfaceC4314j interfaceC4314j) {
        C2968e c2968e = (C2968e) ((AbstractC2828e) interfaceC4314j).f9217g.mo6237c(C2825b.f9208w);
        if (c2968e != null) {
            for (C3507k c3507k : c2968e.f9723g) {
                c1203f.m3269p();
                if (c3507k.f11414d) {
                    c1203f.mo3255e("final ");
                }
                m3312q(c1203f, c3507k.f11412b);
                c1203f.mo3254d(' ');
                m3300d(c1203f, c3507k);
                c1203f.mo3254d(';');
                AbstractC2124c.m5340a(c1203f, this.f4061b, c3507k.m7367a().f11444i);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final void m3327s(C1203f c1203f, C0075f c0075f) {
        C1210g c1210g = this.f4060a;
        C1211h c1211h = c1210g.f4070d;
        C5775b c5775b = c0075f.f236e;
        if (c5775b == null) {
            return;
        }
        c1203f.m3271r("} catch (");
        if (c0075f.m444c()) {
            c1210g.f4068b.m3289p(c1203f, AbstractC3506j.f11398o);
        } else {
            Iterator it = c0075f.f232a.iterator();
            if (it.hasNext()) {
                m3311p(c1203f, (C3128a) it.next());
            }
            while (it.hasNext()) {
                c1203f.mo3255e(" | ");
                m3311p(c1203f, (C3128a) it.next());
            }
        }
        c1203f.mo3254d(' ');
        AbstractC3508l abstractC3508l = c0075f.f237f;
        C4322r c4322r = this.f4061b;
        if (abstractC3508l == null) {
            c1203f.mo3255e(WeChatSnsPost.TYPE_UNKNOWN);
        } else if (abstractC3508l instanceof C3514r) {
            C3515s c3515s = ((C3514r) abstractC3508l).f11440m;
            if (c1203f instanceof C1199b) {
                c1203f.mo3261k(C2039d.m4990a(c4322r, c3515s));
            }
            c1203f.mo3255e(c1211h.m3323a(c3515s.m7398b()));
        } else {
            if (!(abstractC3508l instanceof C3512p)) {
                C0086a.m452k(AbstractC0255e.m1021j("Unexpected arg type in catch block: ", String.valueOf(abstractC3508l), ", class: ", abstractC3508l.getClass().getSimpleName()));
                return;
            }
            C3512p c3512p = (C3512p) abstractC3508l;
            c1211h.getClass();
            String strM3324b = c3512p.f11423l;
            if (!c1211h.f4071g) {
                strM3324b = c1211h.m3324b(strM3324b);
                c3512p.f11423l = strM3324b;
            }
            c1203f.mo3255e(strM3324b);
        }
        c1203f.mo3255e(") {");
        int i9 = c0075f.f233b;
        if (i9 >= 0 && (c1203f instanceof C1199b)) {
            c1203f.mo3262l(new C2036a(i9));
        }
        AbstractC2124c.m5340a(c1203f, c4322r, c0075f.f234c);
        m3330v(c1203f, c5775b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:26:0x009e */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: ud.j */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3328t(C6029c c6029c, C1203f c1203f, boolean z9) {
        InterfaceC4314j interfaceC4314j;
        if (z9) {
            c1203f.m3272s(c6029c.m10789H());
        } else {
            c1203f.mo3263m(c6029c.m10789H());
        }
        boolean zMo6235a = c6029c.f9217g.mo6235a(EnumC2824a.f9167t);
        if (zMo6235a) {
            c1203f.mo3255e("// ");
        }
        c1203f.mo3255e("if (");
        new C1206c(this.f4060a, this.f4063d).m3294r(c1203f, new C0119x(12), c6029c.f24475k);
        c1203f.mo3255e(") {");
        if (c1203f instanceof C1199b) {
            List list = c6029c.f24476l;
            if (!list.isEmpty()) {
                C4320p c4320pM57c0 = AbstractC0000a.m57c0((C4305a) list.get(0));
                C2036a.m4989a(c1203f, c4320pM57c0);
                AbstractC2124c.m5340a(c1203f, this.f4061b, c4320pM57c0);
            }
        }
        m3330v(c1203f, c6029c.f24480m);
        if (zMo6235a) {
            c1203f.m3271r("// }");
        } else {
            c1203f.m3270q();
        }
        InterfaceC4314j interfaceC4314j2 = c6029c.f24481n;
        if (AbstractC1089i.m2780n0(interfaceC4314j2)) {
            c1203f.mo3255e(" else ");
            if (((AbstractC2828e) interfaceC4314j2).f9217g.mo6235a(EnumC2824a.f9132R)) {
                if (interfaceC4314j2 instanceof C5775b) {
                    ArrayList arrayList = ((C5775b) interfaceC4314j2).f23507k;
                    if (arrayList.size() == 1) {
                        Object obj = arrayList.get(0);
                        while (true) {
                            interfaceC4314j = (InterfaceC4314j) obj;
                            if (!(interfaceC4314j instanceof C5775b)) {
                                break;
                            }
                            ArrayList arrayList2 = ((C5775b) interfaceC4314j).f23507k;
                            if (arrayList2.size() != 1) {
                                break;
                            } else {
                                obj = arrayList2.get(0);
                            }
                        }
                    } else {
                        interfaceC4314j = null;
                    }
                    if (interfaceC4314j instanceof C6029c) {
                        m3326r(c1203f, interfaceC4314j);
                        m3328t((C6029c) interfaceC4314j, c1203f, false);
                        return;
                    }
                }
            }
            c1203f.mo3254d('{');
            m3330v(c1203f, interfaceC4314j2);
            if (zMo6235a) {
                c1203f.m3271r("// }");
            } else {
                c1203f.m3270q();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m3329u(C1203f c1203f, InterfaceC4314j interfaceC4314j) {
        m3326r(c1203f, interfaceC4314j);
        interfaceC4314j.mo8672b(this, c1203f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m3330v(C1203f c1203f, InterfaceC4314j interfaceC4314j) {
        c1203f.m3268o();
        m3329u(c1203f, interfaceC4314j);
        c1203f.m3267n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m3331w(C1203f c1203f, C3130c c3130c, C4311g c4311g) {
        boolean zM8658c0;
        Object obj;
        if (c4311g != null) {
            zM8658c0 = c4311g.f14389k.m8658c0();
        } else {
            C0909b c0909bM2214c = this.f4062c.f14453s.m2214c(c3130c.f10146g.f10138g);
            zM8658c0 = c0909bM2214c != null && AbstractC3754e0.m7864G(c0909bM2214c.f2827b, 16384);
        }
        if (zM8658c0) {
            if (c4311g != null) {
                c1203f.mo3260j(c4311g);
            }
            c1203f.mo3255e(c3130c.f10149j);
            return;
        }
        m3310o(c1203f, c3130c);
        if (c4311g == null || !this.f4061b.m6385N(EnumC0251a.f700k)) {
            return;
        }
        C2958a c2958a = (C2958a) c4311g.f9217g.mo6237c(C3126c.f10133f);
        if (c2958a == null || (obj = c2958a.f9705h) == null) {
            return;
        }
        c1203f.mo3255e(" /* ").mo3255e(obj.toString()).mo3255e(" */");
    }
}
