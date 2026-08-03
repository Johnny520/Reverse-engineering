package p126ia;

import ci.C0575c;
import gg.C1414j;
import gg.C1425u;
import lb.C2549k;
import ma.C2821a;
import p010aa.C0035c;
import p028c1.C0372b;
import p041d1.EnumC0680z;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p136j8.C2097h;
import p137j9.C2115a;
import p138ja.C2116a;
import p139jb.C2117a;
import p144k.AbstractC2181j0;
import p144k.C2156b;
import p144k.C2178i0;
import p155ka.C2376b;
import p168l9.C2535a;
import p184m9.C2816a;
import p187n.C2852f;
import p187n.C2853g;
import p187n.C2857k;
import p211o9.C3088a;
import p213ob.C3113f;
import p231pb.C3378a;
import p243q9.C3466b;
import p244qb.C3480a;
import p249qg.AbstractC3603v;
import p259r9.C3745a;
import p261rb.C3786b;
import p265s.C3834h0;
import p276sf.C3967n;
import p299u9.C4283b;
import p339x1.AbstractC5614i1;
import p339x1.AbstractC5618k;
import p340x2.C5684s;
import p347xa.C5742c;
import p364y8.C6001a;
import ua.C4291b;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ia.t */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2026t extends C1414j implements InterfaceC1235p {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f6851n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2026t(int i9, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i9, obj, cls, str, str2, i10, i11);
        this.f6851n = i12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        boolean zM1860a;
        boolean zM1860a2;
        switch (this.f6851n) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((C2027u) this.f4723h).m7750e(str, (Throwable) obj2);
                break;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                C2097h.m5225a((C2097h) this.f4723h, str2, (Throwable) obj2);
                break;
            case 2:
                String str3 = (String) obj;
                str3.getClass();
                C2097h.m5225a((C2097h) this.f4723h, str3, (Throwable) obj2);
                break;
            case 3:
                String str4 = (String) obj;
                str4.getClass();
                C2097h.m5225a((C2097h) this.f4723h, str4, (Throwable) obj2);
                break;
            case 4:
                String str5 = (String) obj;
                str5.getClass();
                ((C2115a) this.f4723h).m7750e(str5, (Throwable) obj2);
                break;
            case 5:
                String str6 = (String) obj;
                str6.getClass();
                ((C2116a) this.f4723h).m7750e(str6, (Throwable) obj2);
                break;
            case 6:
                String str7 = (String) obj;
                str7.getClass();
                ((C2117a) this.f4723h).m7750e(str7, (Throwable) obj2);
                break;
            case 7:
                EnumC0680z enumC0680z = (EnumC0680z) obj;
                EnumC0680z enumC0680z2 = (EnumC0680z) obj2;
                C2178i0 c2178i0 = (C2178i0) this.f4723h;
                if (c2178i0.f23801t && (zM1860a = enumC0680z2.m1860a()) != enumC0680z.m1860a()) {
                    InterfaceC1231l interfaceC1231l = c2178i0.f7250x;
                    if (interfaceC1231l != null) {
                        interfaceC1231l.invoke(Boolean.valueOf(zM1860a));
                    }
                    C2156b c2156b = AbstractC2181j0.f7259u;
                    InterfaceC5557c interfaceC5557c = null;
                    if (zM1860a) {
                        AbstractC3603v.m7563q(c2178i0.m10550Y0(), null, new C0575c(c2178i0, interfaceC5557c, 5), 3);
                        C1425u c1425u = new C1425u();
                        AbstractC5618k.m10162r(c2178i0, new C0035c(c1425u, 21, c2178i0));
                        C3834h0 c3834h0 = (C3834h0) c1425u.f4738g;
                        if (c3834h0 != null) {
                            c3834h0.m8012a();
                        } else {
                            c3834h0 = null;
                        }
                        c2178i0.f7252z = c3834h0;
                        AbstractC5614i1 abstractC5614i1 = c2178i0.f7247A;
                        if (abstractC5614i1 != null && abstractC5614i1.mo10106r1().f23801t && c2178i0.f23801t) {
                            AbstractC5618k.m10154j(c2178i0, c2156b);
                        }
                    } else {
                        C3834h0 c3834h02 = c2178i0.f7252z;
                        if (c3834h02 != null) {
                            c3834h02.m8013b();
                        }
                        c2178i0.f7252z = null;
                        if (c2178i0.f23801t) {
                            AbstractC5618k.m10154j(c2178i0, c2156b);
                        }
                    }
                    AbstractC5618k.m10158n(c2178i0);
                    C2857k c2857k = c2178i0.f7249w;
                    if (c2857k != null) {
                        C2852f c2852f = c2178i0.f7251y;
                        if (zM1860a) {
                            if (c2852f != null) {
                                c2178i0.m5416n1(c2857k, new C2853g(c2852f));
                                c2178i0.f7251y = null;
                            }
                            C2852f c2852f2 = new C2852f();
                            c2178i0.m5416n1(c2857k, c2852f2);
                            c2178i0.f7251y = c2852f2;
                        } else if (c2852f != null) {
                            c2178i0.m5416n1(c2857k, new C2853g(c2852f));
                            c2178i0.f7251y = null;
                        }
                    }
                }
                break;
            case 8:
                String str8 = (String) obj;
                str8.getClass();
                ((C2376b) this.f4723h).m7750e(str8, (Throwable) obj2);
                break;
            case 9:
                String str9 = (String) obj;
                str9.getClass();
                ((C2535a) this.f4723h).m7750e(str9, (Throwable) obj2);
                break;
            case 10:
                String str10 = (String) obj;
                str10.getClass();
                ((C2549k) this.f4723h).m7750e(str10, (Throwable) obj2);
                break;
            case 11:
                String str11 = (String) obj;
                str11.getClass();
                ((C2816a) this.f4723h).m7750e(str11, (Throwable) obj2);
                break;
            case 12:
                String str12 = (String) obj;
                str12.getClass();
                ((C2821a) this.f4723h).m7750e(str12, (Throwable) obj2);
                break;
            case 13:
                String str13 = (String) obj;
                str13.getClass();
                ((C3088a) this.f4723h).m7750e(str13, (Throwable) obj2);
                break;
            case 14:
                String str14 = (String) obj;
                str14.getClass();
                ((C3088a) this.f4723h).m7750e(str14, (Throwable) obj2);
                break;
            case 15:
                String str15 = (String) obj;
                str15.getClass();
                ((C3113f) this.f4723h).m7750e(str15, (Throwable) obj2);
                break;
            case 16:
                String str16 = (String) obj;
                str16.getClass();
                ((C3378a) this.f4723h).m7750e(str16, (Throwable) obj2);
                break;
            case 17:
                String str17 = (String) obj;
                str17.getClass();
                ((C3466b) this.f4723h).m7750e(str17, (Throwable) obj2);
                break;
            case 18:
                String str18 = (String) obj;
                str18.getClass();
                ((C3466b) this.f4723h).m7750e(str18, (Throwable) obj2);
                break;
            case 19:
                String str19 = (String) obj;
                str19.getClass();
                ((C3480a) this.f4723h).m7750e(str19, (Throwable) obj2);
                break;
            case 20:
                String str20 = (String) obj;
                str20.getClass();
                ((C3745a) this.f4723h).m7750e(str20, (Throwable) obj2);
                break;
            case 21:
                String str21 = (String) obj;
                str21.getClass();
                ((C3786b) this.f4723h).m7750e(str21, (Throwable) obj2);
                break;
            case 22:
                String str22 = (String) obj;
                str22.getClass();
                ((C3786b) this.f4723h).m7750e(str22, (Throwable) obj2);
                break;
            case 23:
                String str23 = (String) obj;
                str23.getClass();
                ((C4283b) this.f4723h).getClass();
                AbstractC1184v0.m3204n("[Hchat:隐藏微信底栏] ".concat(str23), (Throwable) obj2);
                break;
            case 24:
                String str24 = (String) obj;
                str24.getClass();
                ((C4283b) this.f4723h).getClass();
                AbstractC1184v0.m3204n("[Hchat:隐藏微信底栏] ".concat(str24), (Throwable) obj2);
                break;
            case 25:
                String str25 = (String) obj;
                str25.getClass();
                ((C4291b) this.f4723h).m7750e(str25, (Throwable) obj2);
                break;
            case 26:
                String str26 = (String) obj;
                str26.getClass();
                ((C4291b) this.f4723h).m7750e(str26, (Throwable) obj2);
                break;
            case 27:
                EnumC0680z enumC0680z3 = (EnumC0680z) obj;
                EnumC0680z enumC0680z4 = (EnumC0680z) obj2;
                C5684s c5684s = (C5684s) this.f4723h;
                if (c5684s.f23801t && (zM1860a2 = enumC0680z4.m1860a()) != enumC0680z3.m1860a()) {
                    C3834h0 c3834h03 = null;
                    if (zM1860a2) {
                        C1425u c1425u2 = new C1425u();
                        AbstractC5618k.m10162r(c5684s, new C0372b(c1425u2, 6, c5684s));
                        C3834h0 c3834h04 = (C3834h0) c1425u2.f4738g;
                        if (c3834h04 != null) {
                            c3834h04.m8012a();
                            c3834h03 = c3834h04;
                        }
                        c5684s.f23136x = c3834h03;
                    } else {
                        C3834h0 c3834h05 = c5684s.f23136x;
                        if (c3834h05 != null) {
                            c3834h05.m8013b();
                        }
                        c5684s.f23136x = null;
                    }
                }
                break;
            case 28:
                String str27 = (String) obj;
                str27.getClass();
                ((C5742c) this.f4723h).m7750e(str27, (Throwable) obj2);
                break;
            default:
                String str28 = (String) obj;
                str28.getClass();
                ((C6001a) this.f4723h).m7750e(str28, (Throwable) obj2);
                break;
        }
        return C3967n.f12976a;
    }
}
