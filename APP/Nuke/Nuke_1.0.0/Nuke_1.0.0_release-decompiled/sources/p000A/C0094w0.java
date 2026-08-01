package p000A;

import java.util.LinkedHashMap;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p037G2.AbstractC0489a;
import p037G2.C0508t;
import p047I0.AbstractC0757q0;
import p047I0.C0662B0;
import p047I0.InterfaceC0703W0;
import p051J.C0818j;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p092S0.C1259L;
import p092S0.C1269g;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p099T3.C1427f;
import p108V3.EnumC1546T;
import p108V3.EnumC1549b;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p136b0.AbstractC1848j;
import p149d3.AbstractC1976d;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p193l0.AbstractC2485h;
import p211o0.C2740O;
import p221q.AbstractC2894b;
import p221q.C2895c;
import p221q.C2896d;
import p238t.AbstractC3204b;
import p244u.AbstractC3261c;
import p244u.C3258a0;
import p255w.C3372c;

/* JADX INFO: renamed from: A.w0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0094w0 implements InterfaceC1604f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f424d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f425e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f426f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f427g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f428h;

    public /* synthetic */ C0094w0(InterfaceC1603e interfaceC1603e, C2896d c2896d, InterfaceC1604f interfaceC1604f, InterfaceC1599a interfaceC1599a) {
        this.f424d = 4;
        this.f425e = interfaceC1603e;
        this.f426f = c2896d;
        this.f427g = interfaceC1604f;
        this.f428h = interfaceC1599a;
    }

    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        Object objM4431e;
        switch (this.f424d) {
            case 0:
                C2740O c2740o = (C2740O) this.f425e;
                C0078o0 c0078o0 = (C0078o0) this.f426f;
                C1646u c1646u = (C1646u) this.f427g;
                long j5 = c1646u.f5651b;
                C0042V0 c0042v0 = (C0042V0) this.f428h;
                InterfaceC2207p interfaceC2207p = (InterfaceC2207p) obj;
                ((Integer) obj3).getClass();
                C1383r c1383r = (C1383r) ((InterfaceC1373m) obj2);
                c1383r.m2568W(-84507373);
                boolean zBooleanValue = ((Boolean) c1383r.m2590j(AbstractC0757q0.f2373w)).booleanValue();
                boolean zM2584g = c1383r.m2584g(zBooleanValue);
                Object objM2558L = c1383r.m2558L();
                C1357e c1357e = C1371l.f4833a;
                if (zM2584g || objM2558L == c1357e) {
                    objM2558L = new C0818j(zBooleanValue);
                    c1383r.m2585g0(objM2558L);
                }
                C0818j c0818j = (C0818j) objM2558L;
                boolean z5 = c2740o.f8719a != 16;
                if (((Boolean) ((C0662B0) ((InterfaceC0703W0) c1383r.m2590j(AbstractC0757q0.f2370t))).f2101a.getValue()).booleanValue() && c0078o0.m121b() && C1259L.m2335c(j5) && z5) {
                    c1383r.m2568W(-707487962);
                    C1269g c1269g = c1646u.f5650a;
                    C1259L c1259l = new C1259L(j5);
                    boolean zM2586h = c1383r.m2586h(c0818j);
                    Object objM2558L2 = c1383r.m2558L();
                    if (zM2586h || objM2558L2 == c1357e) {
                        objM2558L2 = new C0098y0(c0818j, (InterfaceC1046d) null, 0);
                        c1383r.m2585g0(objM2558L2);
                    }
                    AbstractC1385s.m2616f(c1269g, c1259l, (InterfaceC1603e) objM2558L2, c1383r);
                    boolean zM2586h2 = c1383r.m2586h(c0818j) | c1383r.m2586h(c0042v0) | c1383r.m2582f(c1646u) | c1383r.m2586h(c0078o0) | c1383r.m2582f(c2740o);
                    Object objM2558L3 = c1383r.m2558L();
                    if (zM2586h2 || objM2558L3 == c1357e) {
                        objM2558L3 = new C0096x0(c0818j, c0042v0, c1646u, c0078o0, c2740o, 0);
                        c1383r.m2585g0(objM2558L3);
                    }
                    objM4431e = AbstractC2485h.m4431e(interfaceC2207p, (InterfaceC1601c) objM2558L3);
                    c1383r.m2597p(false);
                } else {
                    c1383r.m2568W(-705473241);
                    c1383r.m2597p(false);
                    objM4431e = C2204m.f7185a;
                }
                c1383r.m2597p(false);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                String str = (String) this.f425e;
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f426f;
                String str2 = (String) this.f427g;
                InterfaceC1599a interfaceC1599a2 = (InterfaceC1599a) this.f428h;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3258a0) obj, "$this$NukeDialog");
                C1383r c1383r2 = (C1383r) interfaceC1373m;
                if (c1383r2.m2560O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    if (str != null) {
                        c1383r2.m2568W(-1125892581);
                        AbstractC0489a.m757g(str, interfaceC1599a, null, false, 0, c1383r2, 0);
                        AbstractC3261c.m5516c(c1383r2, AbstractC3261c.m5539z(8));
                        c1383r2.m2597p(false);
                    } else {
                        c1383r2.m2568W(-1125681161);
                        c1383r2.m2597p(false);
                    }
                    AbstractC0489a.m754d(str2, interfaceC1599a2, null, false, 0, c1383r2, 0, 60);
                } else {
                    c1383r2.m2563R();
                }
                break;
            case 2:
                EnumC1549b enumC1549b = (EnumC1549b) this.f425e;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f426f;
                C1427f c1427f = (C1427f) this.f427g;
                LinkedHashMap linkedHashMap = (LinkedHashMap) this.f428h;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r3 = (C1383r) interfaceC1373m2;
                if (c1383r3.m2560O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC0489a.m765o(null, AbstractC2352g.m4185H(R.string.home_settings_theme, c1383r3), AbstractC1848j.m3314c(-340070020, new C0508t((Enum) enumC1549b, interfaceC1601c, c1427f, linkedHashMap, 5), c1383r3), c1383r3, 384, 1);
                } else {
                    c1383r3.m2563R();
                }
                break;
            case 3:
                EnumC1546T enumC1546T = (EnumC1546T) this.f425e;
                InterfaceC1601c interfaceC1601c2 = (InterfaceC1601c) this.f426f;
                C1427f c1427f2 = (C1427f) this.f427g;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f428h;
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r4 = (C1383r) interfaceC1373m3;
                if (c1383r4.m2560O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC0489a.m765o(null, AbstractC2352g.m4185H(R.string.home_settings_language, c1383r4), AbstractC1848j.m3314c(1059614629, new C0508t((Enum) enumC1546T, interfaceC1601c2, c1427f2, linkedHashMap2, 6), c1383r4), c1383r4, 384, 1);
                } else {
                    c1383r4.m2563R();
                }
                break;
            default:
                InterfaceC1603e interfaceC1603e = (InterfaceC1603e) this.f425e;
                C2896d c2896d = (C2896d) this.f426f;
                InterfaceC1604f interfaceC1604f = (InterfaceC1604f) this.f427g;
                InterfaceC1599a interfaceC1599a3 = (InterfaceC1599a) this.f428h;
                C2895c c2895c = (C2895c) obj;
                InterfaceC1373m interfaceC1373m4 = (InterfaceC1373m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= ((C1383r) interfaceC1373m4).m2582f(c2895c) ? 4 : 2;
                }
                C1383r c1383r5 = (C1383r) interfaceC1373m4;
                if (c1383r5.m2560O(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    String str3 = (String) interfaceC1603e.mo0g(c1383r5, 0);
                    if (AbstractC1976d.m3637e0(str3)) {
                        AbstractC3204b.m5477c("Label must not be blank");
                    }
                    c2896d.getClass();
                    AbstractC2894b.f9148a.mo2857m(str3, Boolean.TRUE, c2895c, interfaceC1604f, interfaceC1599a3, c1383r5, Integer.valueOf((iIntValue4 << 9) & 7168));
                } else {
                    c1383r5.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0094w0(Object obj, Object obj2, Object obj3, Object obj4, int i5) {
        this.f424d = i5;
        this.f425e = obj;
        this.f426f = obj2;
        this.f427g = obj3;
        this.f428h = obj4;
    }
}
