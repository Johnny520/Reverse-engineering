package p130a1;

import me.dartcv.nuke.BuildConfig;
import p000A.C0020K;
import p000A.C0072l0;
import p056K2.C0891q;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1347Y;
import p095T.InterfaceC1373m;
import p110W0.AbstractC1592q;
import p110W0.C1581f;
import p110W0.C1585j;
import p110W0.C1586k;
import p110W0.C1587l;
import p110W0.C1594s;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1605g;
import p117X2.AbstractC1665j;
import p136b0.C1843e;
import p197m.C2553m;
import p255w.C3372c;
import p276z3.AbstractC3518a;

/* JADX INFO: renamed from: a1.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1790c implements InterfaceC1605g {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6105d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f6106e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1790c(int i5, Object obj) {
        this.f6105d = i5;
        this.f6106e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1605g
    /* JADX INFO: renamed from: l */
    public final Object mo1949l(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.f6105d) {
            case 0:
                C1791d c1791d = (C1791d) this.f6106e;
                C1594s c1594sM2854b = ((C1581f) c1791d.f6111e).m2854b((AbstractC1592q) obj, (C1587l) obj2, ((C1585j) obj3).f5499a, ((C1586k) obj4).f5500a);
                if (!(c1594sM2854b instanceof C1594s)) {
                    C0072l0 c0072l0 = new C0072l0(c1594sM2854b, c1791d.f6116j);
                    c1791d.f6116j = c0072l0;
                    Object obj5 = c0072l0.f309g;
                    AbstractC1665j.m2983c(obj5, "null cannot be cast to non-null type android.graphics.Typeface");
                } else {
                    Object obj6 = c1594sM2854b.f5520d;
                    AbstractC1665j.m2983c(obj6, "null cannot be cast to non-null type android.graphics.Typeface");
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C1843e c1843e = (C1843e) this.f6106e;
                C3372c c3372c = (C3372c) obj;
                ((Integer) obj2).getClass();
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C1383r) interfaceC1373m).m2582f(c3372c) ? 4 : 2;
                }
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 131) != 130)) {
                    c1843e.mo5f(c3372c, c1383r, Integer.valueOf(iIntValue & 14));
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f6106e;
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj3;
                AbstractC1665j.m2985e((C2553m) obj, "$this$AnimatedContent");
                C1357e c1357e = C1371l.f4833a;
                if (zBooleanValue) {
                    C1383r c1383r2 = (C1383r) interfaceC1373m2;
                    c1383r2.m2568W(717966193);
                    boolean zM2582f = c1383r2.m2582f(interfaceC1347Y);
                    Object objM2558L = c1383r2.m2558L();
                    if (zM2582f || objM2558L == c1357e) {
                        objM2558L = new C0020K(interfaceC1347Y, 20);
                        c1383r2.m2585g0(objM2558L);
                    }
                    AbstractC3518a.m5772e((InterfaceC1599a) objM2558L, c1383r2, 0);
                    c1383r2.m2597p(false);
                } else {
                    C1383r c1383r3 = (C1383r) interfaceC1373m2;
                    c1383r3.m2568W(718094285);
                    boolean zM2582f2 = c1383r3.m2582f(interfaceC1347Y);
                    Object objM2558L2 = c1383r3.m2558L();
                    if (zM2582f2 || objM2558L2 == c1357e) {
                        objM2558L2 = new C0020K(interfaceC1347Y, 21);
                        c1383r3.m2585g0(objM2558L2);
                    }
                    AbstractC3518a.m5769b((InterfaceC1599a) objM2558L2, c1383r3, 0);
                    c1383r3.m2597p(false);
                }
                break;
        }
        return C0891q.f2780a;
    }
}
