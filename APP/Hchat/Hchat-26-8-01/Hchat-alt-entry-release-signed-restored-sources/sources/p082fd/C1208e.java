package p082fd;

import af.C0078a;
import af.C0084g;
import androidx.lifecycle.C0119x;
import bsh.ParserConstants;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import md.C2825b;
import md.C2829f;
import md.C2831h;
import md.EnumC2824a;
import mh.AbstractC2846d;
import mh.InterfaceC2844b;
import nc.C2958a;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p025bc.EnumC0251a;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p081fc.C1199b;
import p081fc.C1203f;
import p128ic.C2036a;
import p128ic.C2039d;
import p140jd.AbstractC2124c;
import p199nd.C2960a;
import p199nd.C2973g0;
import p199nd.C2979k;
import p199nd.C2980l;
import p199nd.C2989u;
import p199nd.C2993y;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p222p.AbstractC3199a;
import p233pd.AbstractC3391b;
import p233pd.C3390a;
import p233pd.C3392c;
import p233pd.C3393d;
import p233pd.C3395f;
import p233pd.C3396g;
import p233pd.C3397h;
import p233pd.C3398i;
import p233pd.C3399j;
import p233pd.C3401l;
import p233pd.C3402m;
import p233pd.C3403n;
import p233pd.C3405p;
import p233pd.C3408s;
import p233pd.EnumC3400k;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3497a;
import p246qd.C3503g;
import p246qd.C3507k;
import p246qd.C3509m;
import p246qd.C3510n;
import p246qd.C3512p;
import p246qd.C3514r;
import p246qd.C3515s;
import p246qd.EnumC3513q;
import p246qd.InterfaceC3511o;
import p281t3.AbstractC4106c;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4311g;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.C4325u;
import p332wb.AbstractC4855en;
import p351xe.C5787h;
import sd.C3953a;
import td.C4145a;
import td.C4146b;
import ye.AbstractC6035f;

/* JADX INFO: renamed from: fd.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1208e {

    /* JADX INFO: renamed from: e */
    public static final EnumSet f4057e;

    /* JADX INFO: renamed from: f */
    public static final EnumSet f4058f;

    /* JADX INFO: renamed from: g */
    public static final EnumSet f4059g;

    /* JADX INFO: renamed from: a */
    public final C1210g f4060a;

    /* JADX INFO: renamed from: b */
    public final C4322r f4061b;

    /* JADX INFO: renamed from: c */
    public final C4325u f4062c;

    /* JADX INFO: renamed from: d */
    public final boolean f4063d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        AbstractC2846d.m6274b(C1208e.class);
        f4057e = EnumSet.noneOf(EnumC1207d.class);
        f4058f = EnumSet.of(EnumC1207d.f4053g);
        f4059g = EnumSet.of(EnumC1207d.f4054h);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1208e(C1210g c1210g, boolean z9) {
        this.f4060a = c1210g;
        C4322r c4322r = c1210g.f4067a;
        this.f4061b = c4322r;
        this.f4062c = c4322r.f14411l.f14371k;
        this.f4063d = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m3296m(C1203f c1203f, C3130c c3130c, C4311g c4311g, C1204a c1204a) {
        C3128a c3128a = c3130c.f10146g;
        if (!c1204a.f4040a.f14373m.equals(c3128a) || !c1204a.f4049j) {
            InterfaceC2844b interfaceC2844b = AbstractC6035f.f24493a;
            C3128a c3128a2 = c3128a.f10142k;
            if (c3128a2 == null || !c3128a2.f10139h.equals("R")) {
                c1204a.m3288o(c1203f, c3128a);
            } else {
                c1204a.m3288o(c1203f, c3128a2);
                c1203f.mo3254d('.');
                c1203f.mo3255e(c3128a.m6646k());
            }
            c1203f.mo3254d('.');
        }
        if (c4311g != null) {
            c1203f.mo3260j(c4311g);
        }
        if (c4311g == null) {
            c1203f.mo3255e(c3130c.f10149j);
        } else {
            c1203f.mo3255e(c4311g.f14390l.f10149j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: qd.l */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public final void m3297a(C1203f c1203f, AbstractC3508l abstractC3508l, Set set) throws C0078a {
        abstractC3508l.getClass();
        if (abstractC3508l instanceof C3514r) {
            C3514r c3514r = (C3514r) abstractC3508l;
            c1203f.getClass();
            if (c1203f instanceof C1199b) {
                C3515s c3515s = c3514r.f11440m;
                C2039d c2039dM4990a = c3515s == null ? null : C2039d.m4990a(this.f4061b, c3515s);
                c1203f.mo3260j(c2039dM4990a != null ? c2039dM4990a.f6879l : null);
            }
            C1211h c1211h = this.f4060a.f4070d;
            c1211h.getClass();
            String name = c3514r.getName();
            if (name == null || c1211h.f4071g) {
                name = AbstractC0921a.m2249l(c3514r.f11439l, "r");
            }
            c1203f.mo3255e(name);
            return;
        }
        if (abstractC3508l instanceof C3510n) {
            String strM3305i = m3305i((C3510n) abstractC3508l);
            if (set.contains(EnumC1207d.f4054h) || !strM3305i.startsWith("-")) {
                c1203f.mo3255e(strM3305i);
                return;
            } else {
                c1203f.mo3254d('(').mo3255e(strM3305i).mo3254d(')');
                return;
            }
        }
        if (!(abstractC3508l instanceof C3509m)) {
            if (!(abstractC3508l instanceof C3512p)) {
                throw new C0078a("Unknown arg type ".concat(String.valueOf(abstractC3508l)));
            }
            c1203f.mo3255e(((InterfaceC3511o) abstractC3508l).getName());
            return;
        }
        C4320p c4320p = ((C3509m) abstractC3508l).f11421l;
        if (!c4320p.f9217g.mo6235a(EnumC2824a.f9129O)) {
            m3307k(c1203f, c4320p, set);
            return;
        }
        c1203f.mo3254d('(');
        m3306j(c4320p, c1203f, EnumC1207d.f4055i);
        c1203f.mo3254d(')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m3298b(C1203f c1203f, AbstractC3508l abstractC3508l, boolean z9) {
        m3297a(c1203f, abstractC3508l, z9 ? f4058f : f4059g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m3299c(C1203f c1203f, AbstractC3508l abstractC3508l) {
        int length = c1203f.f4035a.length();
        m3298b(c1203f, abstractC3508l, true);
        if (length != c1203f.f4035a.length()) {
            c1203f.mo3254d('.');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m3300d(C1203f c1203f, C3507k c3507k) {
        String strM3323a = this.f4060a.f4070d.m3323a(c3507k);
        c1203f.getClass();
        if (c1203f instanceof C1199b) {
            c1203f.mo3261k(C2039d.m4990a(this.f4061b, c3507k.m7367a()));
        }
        c1203f.mo3255e(strM3323a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m3301e(C4320p c4320p) throws C0078a {
        if (this.f4063d) {
            return;
        }
        String strConcat = String.valueOf(c4320p.f14396k).concat(" instruction can be used only in fallback mode");
        C0078a c0078a = new C0078a(strConcat);
        C4322r c4322r = this.f4061b;
        c4322r.getClass();
        C5787h.m10468a(c4322r, strConcat, c0078a);
        c4322r.f14411l.m8656a0().m6231w(EnumC2824a.f9146f0);
        throw c0078a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3302f(C1203f c1203f, AbstractC3391b abstractC3391b, int i9, C4322r c4322r) {
        int i10;
        if (c4322r != null) {
            i10 = c4322r.f9217g.mo6235a(EnumC2824a.f9119E) ? i9 + 1 : i9;
        }
        int size = abstractC3391b.f14398m.size();
        c1203f.mo3254d('(');
        C2973g0 c2973g0 = c4322r == null ? null : (C2973g0) c4322r.f9217g.mo6237c(C2825b.f9202q);
        if (i10 < size) {
            boolean z9 = true;
            while (i10 < size) {
                AbstractC3508l abstractC3508lMo7179S = abstractC3391b.mo7179S(i10);
                if (!abstractC3508lMo7179S.f9217g.mo6235a(EnumC2824a.f9120F)) {
                    if (c2973g0 != null) {
                        if (!c2973g0.f9732g.get(i10 - i9)) {
                            if (z9) {
                                z9 = false;
                            } else {
                                c1203f.mo3255e(", ");
                            }
                            if (i10 == size - 1) {
                                if (abstractC3391b.f9217g.mo6235a(EnumC2824a.f9136V)) {
                                    AbstractC3506j abstractC3506jMo7375I = abstractC3508lMo7179S.mo7375I();
                                    abstractC3506jMo7375I.getClass();
                                    if ((abstractC3506jMo7375I instanceof C3497a) && (abstractC3508lMo7179S instanceof C3509m)) {
                                        C4320p c4320p = ((C3509m) abstractC3508lMo7179S).f11421l;
                                        if (c4320p.f14396k == EnumC3400k.f10954F) {
                                            int size2 = c4320p.f14398m.size();
                                            for (int i11 = 0; i11 < size2; i11++) {
                                                m3298b(c1203f, c4320p.mo7179S(i11), false);
                                                if (i11 < size2 - 1) {
                                                    c1203f.mo3255e(", ");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    m3298b(c1203f, abstractC3508lMo7179S, false);
                                }
                            }
                        }
                    }
                }
                i10++;
            }
        }
        c1203f.mo3254d(')');
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m3303g(C1203f c1203f, C4309e c4309e, C4145a c4145a) throws C0078a {
        EnumC2824a enumC2824a = EnumC2824a.f9166s;
        C2825b c2825b = C2825b.f9193h;
        int i9 = c4309e.m8656a0().f14385y;
        if (i9 != 4 && i9 != 5) {
            C4309e c4309eM8656a0 = c4309e.m8656a0();
            C0086a.m452k(AbstractC0255e.m1021j("Expected class to be processed at this point, class: ", String.valueOf(c4309eM8656a0), ", state: ", AbstractC3199a.m6827A(c4309eM8656a0.f14385y)));
            return;
        }
        if (this.f4061b.f14411l == c4309e) {
            c4309e.m6228E(c2825b);
            c4309e.m6227D(enumC2824a);
            this.f4061b.f14411l.m8656a0().m6231w(EnumC2824a.f9146f0);
            throw new C0078a(AbstractC4855en.m9263g("Anonymous inner class unlimited recursion detected. Convert class to inner: ", c4309e.f14373m.f10141j));
        }
        AbstractC3506j abstractC3506j = ((C2960a) c4309e.f9217g.mo6237c(c2825b)).f9710h;
        for (C4322r c4322r : c4309e.f14380t) {
            if (c4322r.f9217g.mo6235a(EnumC2824a.f9122H) && !AbstractC1089i.m2780n0(c4322r.f14407G)) {
                c4322r.m6231w(enumC2824a);
            }
        }
        c1203f.mo3261k(c4309e);
        c1203f.mo3255e("new ");
        this.f4060a.f4068b.m3289p(c1203f, abstractC3506j);
        C4322r c4322rM8718i = this.f4061b.f14411l.f14371k.m8718i(c4145a.f13662o);
        if (c4322rM8718i != null) {
            List listM8694S = c4322rM8718i.m8694S();
            int iMin = Math.min(c4145a.f14398m.size(), listM8694S.size());
            for (int i10 = 0; i10 < iMin; i10++) {
                AbstractC3508l abstractC3508lMo7179S = c4145a.mo7179S(i10);
                abstractC3508lMo7179S.getClass();
                if (abstractC3508lMo7179S instanceof C3514r) {
                    ((C3514r) listM8694S.get(i10)).f11440m.m7408m(((C3514r) abstractC3508lMo7179S).f11440m.m7398b());
                }
            }
        }
        m3302f(c1203f, c4145a, 0, c4322rM8718i);
        c1203f.mo3254d(' ');
        C1204a c1204a = this.f4060a.f4068b;
        C1204a c1204a2 = c1204a.f4041b;
        if (c1204a2 != null) {
            c1204a = c1204a2;
        }
        C1204a c1204a3 = new C1204a(c4309e, c1204a);
        c1204a3.f4050k = this.f4060a.f4070d;
        c1204a3.m3276a(c1203f, true);
        this.f4061b.f14411l.m8649S(c4309e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final void m3304h(C1203f c1203f, C3130c c3130c, AbstractC3508l abstractC3508l) {
        C4311g c4311gM8717h = this.f4061b.f14411l.f14371k.m8717h(c3130c);
        if (c4311gM8717h != null) {
            C2979k c2979k = (C2979k) c4311gM8717h.f9217g.mo6237c(C2825b.f9197l);
            if (c2979k != null) {
                Object obj = c2979k.f9742h;
                int iM8279b = AbstractC4106c.m8279b(c2979k.f9741g);
                if (iM8279b == 0) {
                    m3311p(c1203f, (C3128a) obj);
                    c1203f.mo3255e(".this");
                    return;
                } else {
                    if (iM8279b != 1) {
                        return;
                    }
                    m3298b(c1203f, (AbstractC3508l) obj, true);
                    return;
                }
            }
        }
        m3299c(c1203f, abstractC3508l);
        if (c4311gM8717h != null) {
            c1203f.mo3260j(c4311gM8717h);
        }
        if (c4311gM8717h == null) {
            c1203f.mo3255e(c3130c.f10149j);
        } else {
            c1203f.mo3255e(c4311gM8717h.f14390l.f10149j);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final String m3305i(C3510n c3510n) {
        InterfaceC2844b interfaceC2844b = AbstractC1213j.f4074a;
        return AbstractC1213j.m3332a(c3510n.f11422l, c3510n.f11419i, this.f4061b.f14411l.f14371k.f14437c, this.f4063d, c3510n.f9217g.mo6235a(EnumC2824a.f9137W));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m3306j(C4320p c4320p, C1203f c1203f, EnumC1207d enumC1207d) {
        C3515s c3515s;
        C4322r c4322r = this.f4061b;
        if (c4320p.f14396k == EnumC3400k.f10973Y) {
            return;
        }
        try {
            EnumC1207d enumC1207d2 = EnumC1207d.f4053g;
            if (enumC1207d != enumC1207d2 && enumC1207d != EnumC1207d.f4054h) {
                EnumC1207d enumC1207d3 = EnumC1207d.f4055i;
                if (enumC1207d != enumC1207d3) {
                    c1203f.m3272s(c4320p.f9752i);
                    C2036a.m4989a(c1203f, c4320p);
                    if (c4320p.f9217g.mo6235a(EnumC2824a.f9167t)) {
                        c1203f.mo3255e("// ");
                    }
                }
                C3514r c3514r = c4320p.f14397l;
                if (c3514r != null && ((c3515s = c3514r.f11440m) == null || c3515s.f11445j.size() != 0 || c4320p.f14396k != EnumC3400k.f10967S)) {
                    C3514r c3514r2 = c4320p.f14397l;
                    if (c4320p.f9217g.mo6235a(EnumC2824a.f9131Q)) {
                        C3507k c3507kM7398b = c3514r2.f11440m.m7398b();
                        if (c3507kM7398b.f11414d) {
                            c1203f.mo3255e("final ");
                        }
                        m3312q(c1203f, c3507kM7398b.f11412b);
                        c1203f.mo3254d(' ');
                        m3300d(c1203f, c3507kM7398b);
                    } else {
                        m3298b(c1203f, c3514r2, false);
                    }
                    c1203f.mo3255e(" = ");
                }
                m3307k(c1203f, c4320p, f4057e);
                if (enumC1207d != enumC1207d3) {
                    c1203f.mo3254d(';');
                    AbstractC2124c.m5340a(c1203f, c4322r, c4320p);
                    return;
                }
                return;
            }
            m3307k(c1203f, c4320p, enumC1207d == enumC1207d2 ? f4058f : f4059g);
        } catch (Exception e6) {
            throw new C0078a(c4322r, "Error generate insn: ".concat(String.valueOf(c4320p)), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:258:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ab  */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3307k(C1203f c1203f, C4320p c4320p, Set set) throws C0078a {
        boolean z9;
        C4322r c4322r;
        EnumC3400k enumC3400k = c4320p.f14396k;
        List list = c4320p.f14398m;
        int iOrdinal = enumC3400k.ordinal();
        C1210g c1210g = this.f4060a;
        C4322r c4322r2 = this.f4061b;
        boolean z10 = this.f4063d;
        EnumC1207d enumC1207d = EnumC1207d.f4053g;
        int i9 = 0;
        boolean z11 = true;
        switch (iOrdinal) {
            case 0:
                c1203f.mo3255e(m3305i((C3510n) c4320p.mo7179S(0)));
                return;
            case 1:
                c1203f.mo3255e(c4322r2.f14411l.f14371k.f14437c.m10506i(((C3393d) c4320p).f10930o));
                return;
            case 2:
                m3312q(c1203f, ((C3392c) c4320p).f10929o);
                c1203f.mo3255e(".class");
                return;
            case 3:
                C3390a c3390a = (C3390a) c4320p;
                C2829f c2829f = c3390a.f9217g;
                int i10 = c3390a.f10928o;
                if (!c2829f.mo6235a(EnumC2824a.f9134T)) {
                    if (set.contains(enumC1207d)) {
                        z9 = !c3390a.f9217g.mo6235a(EnumC2824a.f9163p);
                    }
                    if (z9) {
                        c1203f.mo3254d('(');
                    }
                    m3298b(c1203f, c3390a.mo7179S(0), true);
                    c1203f.mo3254d(' ');
                    c1203f.mo3255e(AbstractC3199a.m6832e(i10));
                    c1203f.mo3254d(' ');
                    m3298b(c1203f, c3390a.mo7179S(1), true);
                    if (z9) {
                        c1203f.mo3254d(')');
                        return;
                    }
                    return;
                }
                AbstractC3508l abstractC3508lMo7179S = c3390a.mo7179S(0);
                AbstractC3508l abstractC3508lMo7179S2 = c3390a.mo7179S(1);
                abstractC3508lMo7179S2.getClass();
                if ((abstractC3508lMo7179S2 instanceof C3510n) && (i10 == 1 || i10 == 2)) {
                    C3510n c3510n = (C3510n) abstractC3508lMo7179S2;
                    if (c3510n.f11422l == 1 && c3510n.m7389c0()) {
                        m3298b(c1203f, abstractC3508lMo7179S, false);
                        String strM6832e = AbstractC3199a.m6832e(i10);
                        c1203f.mo3255e(strM6832e).mo3255e(strM6832e);
                        return;
                    }
                }
                m3298b(c1203f, abstractC3508lMo7179S, false);
                c1203f.mo3254d(' ').mo3255e(AbstractC3199a.m6832e(i10)).mo3255e("= ");
                m3298b(c1203f, abstractC3508lMo7179S2, false);
                return;
            case 4:
                m3309n(c1203f, c4320p, set, '-');
                return;
            case 5:
                m3309n(c1203f, c4320p, set, c4320p.mo7179S(0).mo7375I() == AbstractC3506j.f11386c ? '!' : '~');
                return;
            case 6:
                m3298b(c1203f, c4320p.mo7179S(0), false);
                return;
            case 7:
                m3301e(c4320p);
                int size = list.size();
                while (i9 < size - 1) {
                    m3298b(c1203f, c4320p.mo7179S(i9), true);
                    c1203f.mo3255e(" = ");
                    m3298b(c1203f, c4320p.mo7179S(i9 + 1), true);
                    c1203f.mo3255e("; ");
                    i9 += 2;
                }
                return;
            case 8:
            case 20:
                boolean zContains = set.contains(enumC1207d);
                if (zContains) {
                    c1203f.mo3254d('(');
                }
                c1203f.mo3254d('(');
                m3312q(c1203f, (AbstractC3506j) ((C3399j) c4320p).f10948o);
                c1203f.mo3255e(") ");
                m3298b(c1203f, c4320p.mo7179S(0), true);
                if (zContains) {
                    c1203f.mo3254d(')');
                    return;
                }
                return;
            case 9:
                if (list.size() == 0) {
                    c1203f.mo3255e("return");
                    return;
                } else {
                    c1203f.mo3255e("return ");
                    m3298b(c1203f, c4320p.mo7179S(0), false);
                    return;
                }
            case 10:
                m3301e(c4320p);
                c1203f.mo3255e("goto ").mo3255e(C1210g.m3314i(((C3397h) c4320p).mo7173k0()));
                return;
            case 11:
                c1203f.mo3255e("throw ");
                m3298b(c1203f, c4320p.mo7179S(0), true);
                return;
            case 12:
                m3301e(c4320p);
                c1203f.mo3255e("move-exception");
                return;
            case 13:
            case 14:
                c1203f.mo3254d('(');
                m3298b(c1203f, c4320p.mo7179S(0), true);
                c1203f.mo3255e(" > ");
                m3298b(c1203f, c4320p.mo7179S(1), true);
                c1203f.mo3255e(" ? 1 : (");
                m3298b(c1203f, c4320p.mo7179S(0), true);
                c1203f.mo3255e(" == ");
                m3298b(c1203f, c4320p.mo7179S(1), true);
                c1203f.mo3255e(" ? 0 : -1))");
                return;
            case 15:
                m3301e(c4320p);
                C3398i c3398i = (C3398i) c4320p;
                c1203f.mo3255e("if (");
                m3298b(c1203f, c4320p.mo7179S(0), true);
                c1203f.mo3254d(' ');
                c1203f.mo3255e(AbstractC3199a.m6833f(c3398i.f10945p)).mo3254d(' ');
                m3298b(c1203f, c4320p.mo7179S(1), true);
                C1203f c1203fMo3255e = c1203f.mo3255e(") goto ");
                InterfaceC2844b interfaceC2844b = C1210g.f4066e;
                C4305a c4305a = c3398i.f10946q;
                c1203fMo3255e.mo3255e(c4305a != null ? C1210g.m3315j(c4305a) : C1210g.m3314i(c3398i.mo7173k0()));
                return;
            case 16:
                m3301e(c4320p);
                C3408s c3408s = (C3408s) c4320p;
                c1203f.mo3255e("switch(");
                m3298b(c1203f, c4320p.mo7179S(0), true);
                c1203f.mo3255e(") {");
                c1203f.m3268o();
                int[] iArr = c3408s.m7188l0().f11011p;
                int length = iArr.length;
                C4305a[] c4305aArr = c3408s.f11018t;
                if (c4305aArr != null) {
                    while (i9 < length) {
                        c1203f.m3271r("case ");
                        c1203f.mo3255e(Integer.toString(iArr[i9])).mo3255e(": goto ");
                        c1203f.mo3255e(C1210g.m3315j(c4305aArr[i9])).mo3254d(';');
                        i9++;
                    }
                    c1203f.m3271r("default: goto ");
                    c1203f.mo3255e(C1210g.m3315j(c3408s.f11019u)).mo3254d(';');
                } else {
                    int[] iArr2 = c3408s.m7188l0().f11012q;
                    while (i9 < length) {
                        c1203f.m3271r("case ");
                        c1203f.mo3255e(Integer.toString(iArr[i9])).mo3255e(": goto ");
                        c1203f.mo3255e(C1210g.m3314i(iArr2[i9])).mo3254d(';');
                        i9++;
                    }
                    c1203f.m3271r("default: goto ");
                    c1203f.mo3255e(C1210g.m3314i(c3408s.f11016r)).mo3254d(';');
                }
                c1203f.m3267n();
                c1203f.m3270q();
                return;
            case 17:
                m3301e(c4320p);
                c1203f.mo3255e(c4320p.toString());
                return;
            case 18:
                if (z10) {
                    c1203f.mo3255e("monitor-enter(");
                    m3298b(c1203f, c4320p.mo7179S(0), true);
                    c1203f.mo3254d(')');
                    return;
                }
                return;
            case 19:
                if (z10) {
                    c1203f.mo3255e("monitor-exit(");
                    if (list.size() == 1) {
                        m3298b(c1203f, c4320p.mo7179S(0), true);
                    }
                    c1203f.mo3254d(')');
                    return;
                }
                return;
            case 21:
                boolean zContains2 = set.contains(enumC1207d);
                if (zContains2) {
                    c1203f.mo3254d('(');
                }
                m3298b(c1203f, c4320p.mo7179S(0), true);
                c1203f.mo3255e(" instanceof ");
                m3312q(c1203f, (AbstractC3506j) ((C3399j) c4320p).f10948o);
                if (zContains2) {
                    c1203f.mo3254d(')');
                    return;
                }
                return;
            case 22:
                m3298b(c1203f, c4320p.mo7179S(0), true);
                c1203f.mo3255e(".length");
                return;
            case 23:
                C3395f c3395f = (C3395f) c4320p;
                if (z10) {
                    String string = Objects.toString(c3395f.f10940p);
                    m3298b(c1203f, c4320p.mo7179S(0), true);
                    c1203f.mo3255e(" = {").mo3255e(string.substring(1, string.length() - 1)).mo3255e("} // fill-array");
                    return;
                }
                if (c4322r2.m6385N(EnumC0251a.f700k)) {
                    c1203f.mo3255e("// fill-array-data instruction");
                }
                c1203f.m3269p();
                AbstractC3508l abstractC3508lMo7179S3 = c3395f.mo7179S(0);
                AbstractC3506j abstractC3506jMo7375I = abstractC3508lMo7179S3.mo7375I();
                ArrayList arrayList = (ArrayList) c3395f.m7172i0((abstractC3506jMo7375I.mo7345w() && (abstractC3506jMo7375I instanceof C3497a)) ? abstractC3506jMo7375I.mo7340g() : c3395f.f10940p.f10938r.mo7338A());
                int size2 = arrayList.size();
                while (i9 < size2) {
                    if (i9 != 0) {
                        c1203f.mo3254d(';');
                        c1203f.m3269p();
                    }
                    m3298b(c1203f, abstractC3508lMo7179S3, true);
                    c1203f.mo3254d('[').mo3255e(Integer.toString(i9)).mo3255e("] = ").mo3255e(m3305i((C3510n) arrayList.get(i9)));
                    i9++;
                }
                return;
            case 24:
                m3301e(c4320p);
                c1203f.mo3255e("fill-array ".concat(String.valueOf(c4320p)));
                return;
            case 25:
                C3396g c3396g = (C3396g) c4320p;
                if (!c3396g.f9217g.mo6235a(EnumC2824a.f9131Q)) {
                    c1203f.mo3255e("new ");
                    AbstractC3506j abstractC3506j = c3396g.f10941o;
                    C3503g c3503g = AbstractC3506j.f11385b;
                    c1210g.f4068b.m3292s(c1203f, new C3497a(abstractC3506j));
                }
                c1203f.mo3254d('{');
                int size3 = c3396g.f14398m.size();
                int i11 = 0;
                int i12 = 0;
                while (i11 < size3) {
                    m3298b(c1203f, c3396g.mo7179S(i11), false);
                    i11++;
                    if (i11 < size3) {
                        c1203f.mo3255e(", ");
                    }
                    i12++;
                    if (i12 == 1000) {
                        c1203f.m3269p();
                        i12 = 0;
                    }
                }
                c1203f.mo3254d('}');
                return;
            case 26:
                m3298b(c1203f, c4320p.mo7179S(0), true);
                c1203f.mo3254d('[');
                m3298b(c1203f, c4320p.mo7179S(1), false);
                c1203f.mo3254d(']');
                return;
            case 27:
                m3298b(c1203f, c4320p.mo7179S(0), true);
                c1203f.mo3254d('[');
                m3298b(c1203f, c4320p.mo7179S(1), false);
                c1203f.mo3255e("] = ");
                m3298b(c1203f, c4320p.mo7179S(2), false);
                return;
            case 28:
                AbstractC3506j abstractC3506j2 = ((C3405p) c4320p).f11008o;
                c1203f.mo3255e("new ");
                m3312q(c1203f, abstractC3506j2.mo7341h());
                int size4 = list.size();
                int i13 = 0;
                while (i13 < size4) {
                    c1203f.mo3254d('[');
                    m3298b(c1203f, c4320p.mo7179S(i13), false);
                    c1203f.mo3254d(']');
                    i13++;
                }
                int iMo7339f = abstractC3506j2.mo7339f();
                while (i13 < iMo7339f) {
                    c1203f.mo3255e(HttpUrl.PATH_SEGMENT_ENCODE_SET_URI);
                    i13++;
                }
                return;
            case 29:
                m3301e(c4320p);
                c1203f.mo3255e("new ").mo3255e(c4320p.f14397l.f11419i.toString());
                return;
            case 30:
                m3304h(c1203f, (C3130c) ((C3399j) c4320p).f10948o, c4320p.mo7179S(0));
                return;
            case 31:
                m3304h(c1203f, (C3130c) ((C3399j) c4320p).f10948o, c4320p.mo7179S(1));
                c1203f.mo3255e(" = ");
                m3298b(c1203f, c4320p.mo7179S(0), false);
                return;
            case 32:
                m3310o(c1203f, (C3130c) ((C3399j) c4320p).f10948o);
                return;
            case 33:
                m3310o(c1203f, (C3130c) ((C3399j) c4320p).f10948o);
                c1203f.mo3255e(" = ");
                m3298b(c1203f, c4320p.mo7179S(0), false);
                return;
            case 34:
                m3308l((C3403n) c4320p, c1203f);
                return;
            case 35:
                m3301e(c4320p);
                c1203f.mo3255e("move-result");
                return;
            case 36:
            case 44:
            default:
                throw new C0078a(c4322r2, "Unknown instruction: ".concat(String.valueOf(enumC3400k)), null);
            case 37:
                C4146b c4146b = (C4146b) c4320p;
                boolean zContains3 = set.contains(enumC1207d);
                if (zContains3) {
                    c1203f.mo3254d('(');
                }
                AbstractC3508l abstractC3508lMo7179S4 = c4146b.mo7179S(0);
                AbstractC3508l abstractC3508lMo7179S5 = c4146b.mo7179S(1);
                C1206c c1206c = new C1206c(c1210g, z10);
                if (abstractC3508lMo7179S4.m7381O() && abstractC3508lMo7179S5.m7378L()) {
                    c1206c.m3294r(c1203f, new C0119x(12), c4146b.f13664o);
                } else {
                    c1206c.m3295t(c1203f, new C0119x(12), c4146b.f13664o);
                    c1203f.mo3255e(" ? ");
                    m3298b(c1203f, abstractC3508lMo7179S4, false);
                    c1203f.mo3255e(" : ");
                    m3298b(c1203f, abstractC3508lMo7179S5, false);
                }
                if (zContains3) {
                    c1203f.mo3254d(')');
                    return;
                }
                return;
            case 38:
                C4145a c4145a = (C4145a) c4320p;
                int i14 = c4145a.f13663p;
                C4309e c4309e = c4322r2.f14411l;
                C4309e c4309e2 = c4322r2.f14411l;
                C4325u c4325u = c4309e.f14371k;
                C3131d c3131d = c4145a.f13662o;
                C4309e c4309eM8715f = c4325u.m8715f(c3131d.f10153j);
                if (c4309eM8715f != null) {
                    if (c4309eM8715f.f9217g.mo6236b(C2825b.f9193h) && !z10) {
                        m3303g(c1203f, c4309eM8715f, c4145a);
                        return;
                    }
                }
                if (i14 == 4) {
                    C0086a.m452k("Constructor 'self' invoke must be removed!");
                    return;
                }
                C4322r c4322rM8718i = c4309e2.f14371k.m8718i(c3131d);
                C3128a c3128a = c3131d.f10153j;
                if (c4322rM8718i != null) {
                    C2993y c2993y = (C2993y) c4322rM8718i.f9217g.mo6237c(C2825b.f9200o);
                    c4322r = c2993y != null ? c2993y.f9768g : c4322rM8718i;
                }
                if (c4145a.m8339l0()) {
                    c1203f.mo3260j(c4322r);
                    c1203f.mo3255e("super");
                } else if (i14 == 3) {
                    c1203f.mo3260j(c4322r);
                    c1203f.mo3255e("this");
                } else if (c4322rM8718i != null) {
                    if (c4322rM8718i.f9217g.mo6235a(EnumC2824a.f9119E)) {
                        C4309e c4309e3 = c4322rM8718i.f14411l;
                        if (c4309e3.m8659d0() && c4145a.f14398m.size() != 0) {
                            AbstractC3508l abstractC3508lMo7179S6 = c4145a.mo7179S(0);
                            if (!abstractC3508lMo7179S6.m7380N() && abstractC3508lMo7179S6.mo7375I().equals(c4309e3.mo6387P().m8657b0())) {
                                m3299c(c1203f, abstractC3508lMo7179S6);
                            }
                            c1203f.mo3255e("new ");
                            if (c4322r == null) {
                            }
                        }
                    } else {
                        z11 = false;
                        c1203f.mo3255e("new ");
                        if (c4322r == null) {
                            if (c4322r.f9217g.mo6235a(EnumC2824a.f9166s)) {
                                c1203f.mo3260j(c4309e2.f14371k.m8715f(c3128a));
                            } else {
                                c1203f.mo3260j(c4322r);
                            }
                            C1204a c1204a = c1210g.f4068b;
                            if (z11) {
                                c1203f.mo3255e(c3128a.m6646k());
                                C3128a c3128a2 = c1204a.f4040a.f14373m;
                                C3128a c3128aM6648m = c3128a2.m6648m();
                                C3128a c3128aM6648m2 = c3128a.m6648m();
                                if (!(c3128aM6648m != null ? c3128aM6648m.equals(c3128aM6648m2) : c3128a2.equals(c3128aM6648m2))) {
                                    c1204a.m3281f(c3128a);
                                }
                            } else {
                                c1203f.mo3255e(c1204a.m3290q(c1204a.f4040a.f14373m, c3128a));
                            }
                            if (((C2980l) c4145a.f9217g.mo6237c(C2825b.f9183J)) != null) {
                                c1203f.mo3254d('<');
                                c1203f.mo3254d('>');
                            }
                        }
                    }
                }
                m3302f(c1203f, c4145a, 0, c4322rM8718i);
                return;
            case 39:
                c1203f.mo3255e("break");
                C2989u c2989u = (C2989u) c4320p.f9217g.mo6237c(C2825b.f9180G);
                if (c2989u != null) {
                    C1203f c1203fMo3254d = c1203f.mo3254d(' ');
                    C1211h c1211h = c1210g.f4070d;
                    c1211h.getClass();
                    String strM2249l = AbstractC0921a.m2249l(c2989u.f9760g.f9758d, "loop");
                    ((HashSet) c1211h.f4072h).add(strM2249l);
                    c1203fMo3254d.mo3255e(strM2249l);
                    return;
                }
                return;
            case 40:
                c1203f.mo3255e("continue");
                return;
            case 41:
                boolean zContains4 = set.contains(enumC1207d);
                if (zContains4) {
                    c1203f.mo3254d('(');
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    m3298b(c1203f, (AbstractC3508l) it.next(), true);
                    if (it.hasNext()) {
                        c1203f.mo3255e(" + ");
                    }
                }
                if (zContains4) {
                    c1203f.mo3254d(')');
                    return;
                }
                return;
            case 42:
                m3297a(c1203f, c4320p.mo7179S(0), set);
                return;
            case 43:
                m3301e(c4320p);
                c1203f.mo3255e(enumC3400k.toString()).mo3254d('(');
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    m3298b(c1203f, (AbstractC3508l) it2.next(), true);
                    c1203f.mo3254d(' ');
                }
                c1203f.mo3254d(')');
                return;
            case ParserConstants.PROTECTED /* 45 */:
                m3301e(c4320p);
                c1203f.mo3255e("jsr -> ").mo3255e(C1210g.m3314i(((C3953a) c4320p).f12957o));
                return;
            case 46:
                m3301e(c4320p);
                c1203f.mo3255e("ret ");
                m3298b(c1203f, c4320p.mo7179S(0), true);
                return;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0338  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3308l(C3403n c3403n, C1203f c1203f) {
        int i9;
        AbstractC3508l abstractC3508lMo7179S;
        C3128a c3128a;
        int i10 = c3403n.f11004o;
        C3131d c3131d = c3403n.f11005p;
        C1210g c1210g = this.f4060a;
        boolean z9 = this.f4063d;
        if (i10 != 7) {
            C4322r c4322r = this.f4061b;
            C4309e c4309e = c4322r.f14411l;
            C4309e c4309e2 = c4322r.f14411l;
            C4322r c4322rM8718i = c4309e.f14371k.m8718i(c3131d);
            String str = c3131d.f10150g;
            C3128a c3128a2 = c3131d.f10153j;
            if (i10 == 8) {
                C3402m c3402m = (C3402m) c3403n;
                if (z9) {
                    c1203f.mo3255e("call_site(");
                    c1203f.m3268o();
                    Iterator it = c3402m.f11003r.iterator();
                    while (it.hasNext()) {
                        c1203f.m3271r(((C2958a) it.next()).toString());
                    }
                    c1203f.m3267n();
                    c1203f.m3271r(").invoke");
                    m3302f(c1203f, c3402m, 0, c4322rM8718i);
                    return;
                }
                AbstractC3506j abstractC3506j = c3402m.f11005p.f10151h;
                abstractC3506j.getClass();
                if (!(abstractC3506j instanceof C3503g) || ((C3503g) abstractC3506j).f11372K != EnumC3513q.VOID) {
                    c1203f.mo3254d('(');
                    c1210g.f4068b.m3292s(c1203f, abstractC3506j);
                    c1203f.mo3255e(") ");
                }
                m3308l(c3402m.f11002q, c1203f);
                c1203f.mo3255e(".dynamicInvoker().invoke");
                m3302f(c1203f, c3402m, 0, c4322rM8718i);
                c1203f.mo3255e(" /* invoke-custom */");
                return;
            }
            int i11 = c3403n.f11004o;
            if (i11 == 6 || (i11 == 3 && c3128a2.f10141j.equals("java.lang.invoke.MethodHandle") && (str.equals("invoke") || str.equals("invokeExact")))) {
                c1203f.mo3254d('(');
                m3312q(c1203f, c3131d.f10151h);
                c1203f.mo3255e(") ");
            }
            int iM8279b = AbstractC4106c.m8279b(i10);
            if (iM8279b != 0) {
                if (iM8279b == 1 || iM8279b == 2 || iM8279b == 3) {
                    abstractC3508lMo7179S = c3403n.mo7179S(0);
                    if (!abstractC3508lMo7179S.m7376J()) {
                        m3299c(c1203f, abstractC3508lMo7179S);
                    } else if (!abstractC3508lMo7179S.m7380N()) {
                        C4309e c4309eM8716g = c4309e2.f14371k.m8716g(abstractC3508lMo7179S.mo7375I());
                        if (c4309eM8716g != null) {
                            if (!c4309eM8716g.f9217g.mo6235a(EnumC2824a.f9166s)) {
                            }
                        }
                    }
                } else if (iM8279b != 4) {
                    if (iM8279b != 5) {
                        i9 = 0;
                    }
                    abstractC3508lMo7179S = c3403n.mo7179S(0);
                    if (!abstractC3508lMo7179S.m7376J()) {
                    }
                } else {
                    AbstractC3506j abstractC3506j2 = c3128a2.f10138g;
                    C4309e c4309e3 = c4309e2;
                    while (true) {
                        c3128a = c4309e3.f14373m;
                        if (AbstractC3506j.m7359u(this.f4062c, c3128a.f10138g, abstractC3506j2)) {
                            break;
                        }
                        C4309e c4309e4 = c4309e3.f14384x;
                        if (c4309e4 == c4309e3) {
                            c3128a = null;
                            break;
                        }
                        c4309e3 = c4309e4;
                    }
                    if (c3128a == null) {
                        c1203f.mo3255e("super/*").mo3255e(c3128a2.f10141j).mo3255e("*/");
                    } else if (c3128a.equals(c4309e2.f14373m)) {
                        c1203f.mo3255e("super");
                    } else {
                        m3311p(c1203f, c3128a);
                        c1203f.mo3255e(".super");
                    }
                    c1203f.mo3254d('.');
                }
                if (c4322rM8718i != null) {
                    c1203f.mo3260j(c4322rM8718i);
                }
                if (!c3403n.f9217g.mo6235a(EnumC2824a.f9172y)) {
                    c1203f.mo3255e(str);
                } else if (c4322rM8718i != null) {
                    c1203f.mo3255e(c4322rM8718i.f14410k.f10157n);
                } else {
                    c1203f.mo3255e(c3131d.f10157n);
                }
                m3302f(c1203f, c3403n, i, c4322rM8718i);
                return;
            }
            i9 = 0;
            if (!c4309e2.f14373m.equals(c3128a2)) {
                m3311p(c1203f, c3128a2);
                c1203f.mo3254d('.');
            }
            i = i9;
            if (c4322rM8718i != null) {
            }
            if (!c3403n.f9217g.mo6235a(EnumC2824a.f9172y)) {
            }
            m3302f(c1203f, c3403n, i, c4322rM8718i);
            return;
        }
        C3401l c3401l = (C3401l) c3403n;
        boolean z10 = c3401l.f11001u;
        List list = c3401l.f14398m;
        if (z10) {
            AbstractC3391b abstractC3391b = c3401l.f10999s;
            if (abstractC3391b instanceof C4145a) {
                m3311p(c1203f, ((C4145a) abstractC3391b).f13662o.f10153j);
                c1203f.mo3255e("::new");
                return;
            } else {
                if (abstractC3391b instanceof C3403n) {
                    C3131d c3131d2 = ((C3403n) abstractC3391b).f11005p;
                    if (c3401l.f10998r == 5) {
                        m3311p(c1203f, c3131d2.f10153j);
                    } else {
                        m3298b(c1203f, c3401l.mo7179S(0), true);
                    }
                    c1203f.mo3255e("::").mo3255e(c3131d2.f10157n);
                    return;
                }
                return;
            }
        }
        if (!z9 && c3401l.f11000t) {
            C4322r c4322r2 = (C4322r) c3401l.f10999s.f9217g.mo6237c(C2825b.f9182I);
            C1210g c1210g2 = new C1210g(c1210g.f4068b, c4322r2);
            ((HashSet) c1210g2.f4070d.f4072h).addAll((HashSet) c1210g.f4070d.f4072h);
            List list2 = c3401l.f10997q.f10152i;
            List listM8694S = c4322r2.m8694S();
            if (list2.isEmpty()) {
                c1203f.mo3255e("()");
            } else {
                int size = listM8694S.size();
                int size2 = size - list2.size();
                int i12 = size - size2;
                if (i12 > 1) {
                    c1203f.mo3254d('(');
                }
                for (int i13 = size2; i13 < size; i13++) {
                    if (i13 != size2) {
                        c1203f.mo3255e(", ");
                    }
                    m3300d(c1203f, ((C3514r) listM8694S.get(i13)).f11440m.m7398b());
                }
                if (i12 > 1) {
                    c1203f.mo3254d(')');
                }
            }
            int size3 = list.size();
            i = c3401l.f10998r == 5 ? 0 : 1;
            int i14 = 0;
            while (i < size3) {
                AbstractC3508l abstractC3508lMo7179S2 = c3401l.mo7179S(i);
                abstractC3508lMo7179S2.getClass();
                if (!(abstractC3508lMo7179S2 instanceof C3514r)) {
                    C0086a.m452k("Unexpected argument type in lambda call: ".concat(abstractC3508lMo7179S2.getClass().getSimpleName()));
                    return;
                } else {
                    ((C3514r) listM8694S.get(i14)).f11440m.m7408m(((C3514r) abstractC3508lMo7179S2).f11440m.m7398b());
                    i++;
                    i14++;
                }
            }
            c1203f.mo3255e(" -> {");
            c1203f.m3268o();
            c1210g2.m3319d(c1203f);
            c1203f.m3267n();
            c1203f.m3270q();
            return;
        }
        try {
            C4320p c4320p = c3401l.f10999s;
            C3131d c3131d3 = c3401l.f10997q;
            int size4 = c3131d3.f10152i.size();
            if (size4 == 0) {
                c1203f.mo3255e("()");
            } else {
                c1203f.mo3254d('(');
                int size5 = c4320p.f14398m.size();
                int i15 = size5 - size4;
                if (c3401l.f10998r != 5 && list.size() > 0 && c3401l.mo7179S(0).m7380N()) {
                    c4320p.mo7179S(0).m6231w(EnumC2824a.f9124J);
                }
                if (i15 >= 0) {
                    for (int i16 = i15; i16 < size5; i16++) {
                        if (i16 != i15) {
                            c1203f.mo3255e(", ");
                        }
                        m3298b(c1203f, c4320p.mo7179S(i16), true);
                    }
                } else {
                    c1203f.mo3255e("/* ERROR: " + i15 + " */");
                }
                c1203f.mo3254d(')');
            }
            c1203f.mo3255e(" -> {");
            if (z9) {
                c1203f.mo3255e(" // ").mo3255e(c3131d3.toString());
            }
            c1203f.m3268o();
            c1203f.m3269p();
            AbstractC3506j abstractC3506j3 = c3131d3.f10151h;
            abstractC3506j3.getClass();
            if (!((abstractC3506j3 instanceof C3503g) && ((C3503g) abstractC3506j3).f11372K == EnumC3513q.VOID)) {
                c1203f.mo3255e("return ");
            }
            m3306j(c4320p, c1203f, EnumC1207d.f4055i);
            c1203f.mo3255e(";");
            c1203f.m3267n();
            c1203f.m3270q();
        } catch (Exception e6) {
            throw new C0084g(AbstractC4855en.m9263g("Failed to generate 'invoke-custom' instruction: ", e6.getMessage()), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m3309n(C1203f c1203f, C4320p c4320p, Set set, char c10) {
        boolean zContains = set.contains(EnumC1207d.f4053g);
        if (zContains) {
            c1203f.mo3254d('(');
        }
        c1203f.mo3254d(c10);
        m3298b(c1203f, c4320p.mo7179S(0), true);
        if (zContains) {
            c1203f.mo3254d(')');
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m3310o(C1203f c1203f, C3130c c3130c) {
        C4311g c4311gM8717h = this.f4062c.m8717h(c3130c);
        if (c4311gM8717h != null) {
            C4309e c4309e = c4311gM8717h.f14389k;
            if (c4311gM8717h.f9217g.mo6235a(EnumC2824a.f9123I)) {
                if (c4309e.f9217g.mo6236b(C2825b.f9193h)) {
                    C2831h c2831h = (C2831h) c4311gM8717h.f9217g.mo6237c(C2825b.f9196k);
                    if (c2831h != null) {
                        C4320p c4320p = c2831h.f9223h;
                        if (c4320p instanceof C4145a) {
                            c4311gM8717h.m6231w(EnumC2824a.f9166s);
                            m3303g(c1203f, c4309e, (C4145a) c4320p);
                            return;
                        }
                    }
                }
            }
        }
        m3296m(c1203f, c3130c, c4311gM8717h, this.f4060a.f4068b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m3311p(C1203f c1203f, C3128a c3128a) {
        this.f4060a.f4068b.m3288o(c1203f, c3128a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m3312q(C1203f c1203f, AbstractC3506j abstractC3506j) {
        this.f4060a.f4068b.m3292s(c1203f, abstractC3506j);
    }
}
