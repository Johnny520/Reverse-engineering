package p058L;

import android.graphics.Typeface;
import android.text.Spannable;
import android.view.View;
import java.util.List;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p000A.C0013G0;
import p000A.C0072l0;
import p034G.C0466k;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p092S0.C1252E;
import p095T.AbstractC1385s;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1339T0;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p106V0.C1488b;
import p108V3.AbstractC1543P;
import p108V3.C1536I;
import p110W0.AbstractC1592q;
import p110W0.C1581f;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p110W0.C1594s;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p130a1.C1790c;
import p130a1.C1791d;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p203n.C2647c;
import p203n.C2661j;
import p204n0.C2683b;
import p221q.C2895c;
import p221q.C2896d;
import p255w.C3372c;

/* JADX INFO: renamed from: L.F */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0904F implements InterfaceC1604f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2812d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f2813e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f2814f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0904F(int i5, Object obj, Object obj2) {
        this.f2812d = i5;
        this.f2813e = obj;
        this.f2814f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        Typeface typeface;
        switch (this.f2812d) {
            case 0:
                InterfaceC1599a interfaceC1599a = (InterfaceC1599a) this.f2813e;
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f2814f;
                ((Integer) obj3).getClass();
                C1383r c1383r = (C1383r) ((InterfaceC1373m) obj2);
                c1383r.m2568W(759876635);
                Object objM2558L = c1383r.m2558L();
                C1357e c1357e = C1371l.f4833a;
                if (objM2558L == c1357e) {
                    objM2558L = AbstractC1385s.m2624n(interfaceC1599a);
                    c1383r.m2585g0(objM2558L);
                }
                InterfaceC1339T0 interfaceC1339T0 = (InterfaceC1339T0) objM2558L;
                Object objM2558L2 = c1383r.m2558L();
                if (objM2558L2 == c1357e) {
                    objM2558L2 = new C2647c(new C2683b(((C2683b) interfaceC1339T0.getValue()).f8556a), AbstractC0907I.f2821b, new C2683b(AbstractC0907I.f2822c), 8);
                    c1383r.m2585g0(objM2558L2);
                }
                C2647c c2647c = (C2647c) objM2558L2;
                boolean zM2586h = c1383r.m2586h(c2647c);
                Object objM2558L3 = c1383r.m2558L();
                if (zM2586h || objM2558L3 == c1357e) {
                    objM2558L3 = new C0466k(interfaceC1339T0, c2647c, (InterfaceC1046d) null, 2);
                    c1383r.m2585g0(objM2558L3);
                }
                AbstractC1385s.m2615e(c1383r, (InterfaceC1603e) objM2558L3, C0891q.f2780a);
                C2661j c2661j = c2647c.f8428c;
                boolean zM2582f = c1383r.m2582f(c2661j);
                Object objM2558L4 = c1383r.m2558L();
                if (zM2582f || objM2558L4 == c1357e) {
                    objM2558L4 = new C0905G(c2661j, 0);
                    c1383r.m2585g0(objM2558L4);
                }
                InterfaceC2207p interfaceC2207p = (InterfaceC2207p) interfaceC1601c.mo1h((InterfaceC1599a) objM2558L4);
                c1383r.m2597p(false);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                List list = (List) this.f2813e;
                View view = (View) this.f2814f;
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r2 = (C1383r) interfaceC1373m;
                if (!c1383r2.m2560O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c1383r2.m2563R();
                } else if (list.isEmpty()) {
                    c1383r2.m2568W(1386533656);
                    AbstractC1543P.m2834s(null, "没有匹配结果", "试试其他功能名称或关键词", c1383r2, 432, 1);
                    c1383r2.m2597p(false);
                } else {
                    c1383r2.m2568W(1386749075);
                    boolean zM2586h2 = c1383r2.m2586h(view);
                    Object objM2558L5 = c1383r2.m2558L();
                    if (zM2586h2 || objM2558L5 == C1371l.f4833a) {
                        objM2558L5 = new C1536I(view, 0);
                        c1383r2.m2585g0(objM2558L5);
                    }
                    AbstractC1543P.m2836u(384, c1383r2, (InterfaceC1601c) objM2558L5, "Search Results", list);
                    c1383r2.m2597p(false);
                }
                break;
            case 2:
                List list2 = (List) this.f2813e;
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f2814f;
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r3 = (C1383r) interfaceC1373m2;
                if (!c1383r3.m2560O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    c1383r3.m2563R();
                } else if (list2.isEmpty()) {
                    c1383r3.m2568W(-1095573092);
                    AbstractC1543P.m2834s(null, AbstractC2352g.m4185H(R.string.home_settings_hooker_debug_empty_title, c1383r3), AbstractC2352g.m4185H(R.string.home_settings_hooker_debug_empty_message, c1383r3), c1383r3, 0, 1);
                    c1383r3.m2597p(false);
                } else {
                    c1383r3.m2568W(-1095278034);
                    Object objM2558L6 = c1383r3.m2558L();
                    if (objM2558L6 == C1371l.f4833a) {
                        objM2558L6 = new C0013G0(interfaceC1347Y, 15);
                        c1383r3.m2585g0(objM2558L6);
                    }
                    AbstractC1543P.m2827l(list2, (InterfaceC1601c) objM2558L6, c1383r3, 48);
                    c1383r3.m2597p(false);
                }
                break;
            case 3:
                Spannable spannable = (Spannable) this.f2813e;
                C1790c c1790c = (C1790c) this.f2814f;
                C1252E c1252e = (C1252E) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC1592q abstractC1592q = c1252e.f4499f;
                C1587l c1587l = c1252e.f4496c;
                if (c1587l == null) {
                    c1587l = C1587l.f5502f;
                }
                C1585j c1585j = c1252e.f4497d;
                int i5 = c1585j != null ? c1585j.f5499a : 0;
                C1586k c1586k = c1252e.f4498e;
                int i6 = c1586k != null ? c1586k.f5500a : 65535;
                C1791d c1791d = (C1791d) c1790c.f6106e;
                C1594s c1594sM2854b = ((C1581f) c1791d.f6111e).m2854b(abstractC1592q, c1587l, i5, i6);
                if (c1594sM2854b instanceof C1594s) {
                    Object obj4 = c1594sM2854b.f5520d;
                    AbstractC1665j.m2983c(obj4, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj4;
                } else {
                    C0072l0 c0072l0 = new C0072l0(c1594sM2854b, c1791d.f6116j);
                    c1791d.f6116j = c0072l0;
                    Object obj5 = c0072l0.f309g;
                    AbstractC1665j.m2983c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                    typeface = (Typeface) obj5;
                }
                spannable.setSpan(new C1488b(1, typeface), iIntValue3, iIntValue4, 33);
                break;
            default:
                InterfaceC1601c interfaceC1601c2 = (InterfaceC1601c) this.f2814f;
                C2895c c2895c = (C2895c) this.f2813e;
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                C1383r c1383r4 = (C1383r) interfaceC1373m3;
                if (c1383r4.m2560O(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    Object objM2558L7 = c1383r4.m2558L();
                    if (objM2558L7 == C1371l.f4833a) {
                        objM2558L7 = new C2896d();
                        c1383r4.m2585g0(objM2558L7);
                    }
                    C2896d c2896d = (C2896d) objM2558L7;
                    c2896d.f9155a.clear();
                    interfaceC1601c2.mo1h(c2896d);
                    c2896d.m5092a(c2895c, c1383r4, 0);
                } else {
                    c1383r4.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public /* synthetic */ C0904F(InterfaceC1601c interfaceC1601c, C2895c c2895c) {
        this.f2812d = 4;
        this.f2814f = interfaceC1601c;
        this.f2813e = c2895c;
    }
}
