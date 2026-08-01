package p047I0;

import p027E4.C0330q;
import p041H0.AbstractC0601k;
import p041H0.InterfaceC0614q0;
import p051J.C0810b;
import p051J.C0824p;
import p084Q2.AbstractC1178c;
import p095T.AbstractC1385s;
import p095T.C1341U0;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p136b0.C1847i;

/* JADX INFO: renamed from: I0.K0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0680K0 {

    /* JADX INFO: renamed from: a */
    public static final C1341U0 f2161a = new C1341U0(C0683M.f2177I);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1177a(C0824p c0824p, C0810b c0810b, AbstractC1178c abstractC1178c) {
        C0676I0 c0676i0;
        if (abstractC1178c instanceof C0676I0) {
            c0676i0 = (C0676I0) abstractC1178c;
            int i5 = c0676i0.f2156h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0676i0.f2156h = i5 - Integer.MIN_VALUE;
            } else {
                c0676i0 = new C0676I0(abstractC1178c);
            }
        }
        Object obj = c0676i0.f2155g;
        int i6 = c0676i0.f2156h;
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
            throw new C0330q();
        }
        AbstractC1784a.m3205S(obj);
        if (!c0824p.f7186d.f7199q) {
            throw new IllegalArgumentException("establishTextInputSession called from an unattached node");
        }
        InterfaceC0614q0 interfaceC0614q0M1045u = AbstractC0601k.m1045u(c0824p);
        C1847i c1847i = (C1847i) AbstractC0601k.m1044t(c0824p).f1695F;
        c1847i.getClass();
        if (AbstractC1385s.m2630t(c1847i, f2161a) != null) {
            throw new ClassCastException();
        }
        c0676i0.f2156h = 1;
        m1178b(interfaceC0614q0M1045u, c0810b, c0676i0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1178b(InterfaceC0614q0 interfaceC0614q0, InterfaceC1603e interfaceC1603e, AbstractC1178c abstractC1178c) {
        C0678J0 c0678j0;
        if (abstractC1178c instanceof C0678J0) {
            c0678j0 = (C0678J0) abstractC1178c;
            int i5 = c0678j0.f2159h;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c0678j0.f2159h = i5 - Integer.MIN_VALUE;
            } else {
                c0678j0 = new C0678J0(abstractC1178c);
            }
        }
        Object obj = c0678j0.f2158g;
        int i6 = c0678j0.f2159h;
        if (i6 == 0) {
            AbstractC1784a.m3205S(obj);
            c0678j0.f2159h = 1;
            ((ViewTreeObserverOnGlobalLayoutListenerC0772y) interfaceC0614q0).m1303K(interfaceC1603e, c0678j0);
        } else {
            if (i6 == 1) {
                AbstractC1784a.m3205S(obj);
                throw new C0330q();
            }
            if (i6 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC1784a.m3205S(obj);
            throw new C0330q();
        }
    }
}
