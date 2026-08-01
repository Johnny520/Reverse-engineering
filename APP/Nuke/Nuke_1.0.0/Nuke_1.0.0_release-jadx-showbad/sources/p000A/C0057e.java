package p000A;

import com.bumptech.glide.AbstractC1926h;
import me.dartcv.nuke.BuildConfig;
import me.dartcv.nuke.R;
import p029F0.AbstractC0391b0;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0379Q;
import p056K2.C0891q;
import p058L.AbstractC0933e0;
import p058L.C0931d0;
import p076P.AbstractC1089e0;
import p081Q.AbstractC1159b;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p108V3.AbstractC1543P;
import p110W0.C1587l;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1604f;
import p117X2.AbstractC1665j;
import p153e1.AbstractC2006b;
import p153e1.C2005a;
import p169h0.C2204m;
import p169h0.InterfaceC2207p;
import p179i4.AbstractC2352g;
import p193l0.AbstractC2485h;
import p211o0.AbstractC2767z;
import p216p.AbstractC2856m;
import p221q.AbstractC2897e;
import p221q.C2895c;
import p244u.AbstractC3261c;
import p244u.AbstractC3282o;
import p244u.C3258a0;
import p255w.C3372c;

/* JADX INFO: renamed from: A.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0057e implements InterfaceC1604f {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f230d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1604f
    /* JADX INFO: renamed from: f */
    public final Object mo5f(Object obj, Object obj2, Object obj3) {
        switch (this.f230d) {
            case 0:
                InterfaceC2207p interfaceC2207p = (InterfaceC2207p) obj;
                ((Integer) obj3).getClass();
                C1383r c1383r = (C1383r) ((InterfaceC1373m) obj2);
                c1383r.m2568W(-2126899193);
                long j5 = ((C0931d0) c1383r.m2590j(AbstractC0933e0.f2926a)).f2922a;
                boolean zM2580e = c1383r.m2580e(j5);
                Object objM2558L = c1383r.m2558L();
                if (zM2580e || objM2558L == C1371l.f4833a) {
                    objM2558L = new C0059f(j5, 0);
                    c1383r.m2585g0(objM2558L);
                }
                InterfaceC2207p interfaceC2207pMo4021c = interfaceC2207p.mo4021c(AbstractC2485h.m4430d(C2204m.f7185a, (InterfaceC1601c) objM2558L));
                c1383r.m2597p(false);
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3258a0) obj, "<this>");
                C1383r c1383r2 = (C1383r) interfaceC1373m;
                if (!c1383r2.m2560O(iIntValue & 1, (iIntValue & 17) != 16)) {
                    c1383r2.m2563R();
                }
                break;
            case 2:
                InterfaceC0379Q interfaceC0379Q = (InterfaceC0379Q) obj;
                int iMo270S = interfaceC0379Q.mo270S(AbstractC1159b.f3801a);
                int i5 = iMo270S * 2;
                AbstractC0391b0 abstractC0391b0Mo648e = ((InterfaceC0376N) obj2).mo648e(AbstractC2006b.m3692i(i5, 0, ((C2005a) obj3).f6726a));
                break;
            case 3:
                InterfaceC0379Q interfaceC0379Q2 = (InterfaceC0379Q) obj;
                int iMo270S2 = interfaceC0379Q2.mo270S(AbstractC1159b.f3802b);
                int i6 = iMo270S2 * 2;
                AbstractC0391b0 abstractC0391b0Mo648e2 = ((InterfaceC0376N) obj2).mo648e(AbstractC2006b.m3692i(0, i6, ((C2005a) obj3).f6726a));
                break;
            case 4:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r3 = (C1383r) interfaceC1373m2;
                if (c1383r3.m2560O(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC1543P.m2795B(null, c1383r3, 6);
                } else {
                    c1383r3.m2563R();
                }
                break;
            case 5:
                InterfaceC1373m interfaceC1373m3 = (InterfaceC1373m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r4 = (C1383r) interfaceC1373m3;
                if (c1383r4.m2560O(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC1543P.m2795B(null, c1383r4, 6);
                } else {
                    c1383r4.m2563R();
                }
                break;
            case 6:
                InterfaceC1373m interfaceC1373m4 = (InterfaceC1373m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3372c) obj, "$this$item");
                C1383r c1383r5 = (C1383r) interfaceC1373m4;
                if (c1383r5.m2560O(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC1543P.m2823h(0, c1383r5);
                } else {
                    c1383r5.m2563R();
                }
                break;
            case 7:
                C2895c c2895c = (C2895c) obj;
                InterfaceC1373m interfaceC1373m5 = (InterfaceC1373m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= ((C1383r) interfaceC1373m5).m2582f(c2895c) ? 4 : 2;
                }
                C1383r c1383r6 = (C1383r) interfaceC1373m5;
                if (c1383r6.m2560O(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    AbstractC3282o.m5558a(AbstractC2856m.m5050d(AbstractC3261c.m5521h(AbstractC3261c.m5530q(C2204m.f7185a, 0.0f, AbstractC2897e.f9167l, 1).mo4021c(AbstractC3261c.f10087c), AbstractC2897e.f9166k), c2895c.f9152c, AbstractC2767z.f8776b), c1383r6, 0);
                } else {
                    c1383r6.m2563R();
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m6 = (InterfaceC1373m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                AbstractC1665j.m2985e((C3258a0) obj, "$this$TextButton");
                C1383r c1383r7 = (C1383r) interfaceC1373m6;
                if (c1383r7.m2560O(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    AbstractC1089e0.m2146b(AbstractC2352g.m4185H(R.string.back, c1383r7), null, 0L, 0L, C1587l.f5504h, null, AbstractC1926h.m3579v(0), null, 0L, 0, false, 0, 0, null, c1383r7, 102236160, 0, 261822);
                } else {
                    c1383r7.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
