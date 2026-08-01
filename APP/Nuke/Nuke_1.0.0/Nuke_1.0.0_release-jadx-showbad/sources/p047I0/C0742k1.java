package p047I0;

import android.view.View;
import java.util.Set;
import me.dartcv.nuke.R;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p095T.AbstractC1385s;
import p095T.C1318I0;
import p095T.C1324L0;
import p095T.C1357e;
import p095T.C1371l;
import p095T.C1383r;
import p095T.InterfaceC1373m;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1666k;
import p122Y2.InterfaceC1766a;
import p122Y2.InterfaceC1769d;
import p136b0.AbstractC1848j;
import p163g0.AbstractC2175g;

/* JADX INFO: renamed from: I0.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0742k1 extends AbstractC1666k implements InterfaceC1603e {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f2322e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0745l1 f2323f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC1603e f2324g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0742k1(C0745l1 c0745l1, InterfaceC1603e interfaceC1603e, int i5) {
        super(2);
        this.f2322e = i5;
        this.f2323f = c0745l1;
        this.f2324g = interfaceC1603e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        switch (this.f2322e) {
            case 0:
                InterfaceC1373m interfaceC1373m = (InterfaceC1373m) obj;
                int iIntValue = ((Number) obj2).intValue();
                C1383r c1383r = (C1383r) interfaceC1373m;
                if (c1383r.m2560O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC0691Q.m1199a(this.f2323f.f2327d, this.f2324g, c1383r, 0);
                } else {
                    c1383r.m2563R();
                }
                break;
            default:
                InterfaceC1373m interfaceC1373m2 = (InterfaceC1373m) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C1383r c1383r2 = (C1383r) interfaceC1373m2;
                if (c1383r2.m2560O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C0745l1 c0745l1 = this.f2323f;
                    ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y = c0745l1.f2327d;
                    Object tag = viewTreeObserverOnGlobalLayoutListenerC0772y.getTag(R.id.inspection_slot_table_set);
                    InterfaceC1046d interfaceC1046d = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof InterfaceC1766a) && !(tag instanceof InterfaceC1769d))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = viewTreeObserverOnGlobalLayoutListenerC0772y.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof InterfaceC1766a) && !(tag2 instanceof InterfaceC1769d))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c1383r2.m2604w());
                        c1383r2.f4900q = true;
                        c1383r2.f4865C = true;
                        c1383r2.f4886c.m2437b();
                        c1383r2.f4870H.m2437b();
                        C1324L0 c1324l0 = c1383r2.f4871I;
                        C1318I0 c1318i0 = c1324l0.f4723a;
                        c1324l0.f4727e = c1318i0.f4714m;
                        c1324l0.f4728f = c1318i0.f4715n;
                    }
                    boolean zM2586h = c1383r2.m2586h(c0745l1);
                    Object objM2558L = c1383r2.m2558L();
                    C1357e c1357e = C1371l.f4833a;
                    if (zM2586h || objM2558L == c1357e) {
                        objM2558L = new C0739j1(c0745l1, interfaceC1046d, 0);
                        c1383r2.m2585g0(objM2558L);
                    }
                    AbstractC1385s.m2615e(c1383r2, (InterfaceC1603e) objM2558L, viewTreeObserverOnGlobalLayoutListenerC0772y);
                    boolean zM2586h2 = c1383r2.m2586h(c0745l1);
                    Object objM2558L2 = c1383r2.m2558L();
                    if (zM2586h2 || objM2558L2 == c1357e) {
                        objM2558L2 = new C0739j1(c0745l1, interfaceC1046d, 1);
                        c1383r2.m2585g0(objM2558L2);
                    }
                    AbstractC1385s.m2615e(c1383r2, (InterfaceC1603e) objM2558L2, viewTreeObserverOnGlobalLayoutListenerC0772y);
                    AbstractC1385s.m2611a(AbstractC2175g.f7135a.mo2399a(set), AbstractC1848j.m3314c(-280240369, new C0742k1(c0745l1, this.f2324g, 0), c1383r2), c1383r2, 56);
                } else {
                    c1383r2.m2563R();
                }
                break;
        }
        return C0891q.f2780a;
    }
}
