package p000;

import android.view.View;
import java.util.Set;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ve1 extends c50 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6667d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ we1 f6668e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC0904ww f6669f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve1(we1 we1Var, InterfaceC0904ww interfaceC0904ww, int i) {
        super(2);
        this.f6667d = i;
        this.f6668e = we1Var;
        this.f6669f = interfaceC0904ww;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6667d;
        na1 na1Var = na1.f4229a;
        InterfaceC0904ww interfaceC0904ww = this.f6669f;
        we1 we1Var = this.f6668e;
        int i2 = 1;
        int i3 = 0;
        switch (i) {
            case 0:
                InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
                int iIntValue = ((Number) obj2).intValue();
                C0616pi c0616pi = (C0616pi) interfaceC0356ji;
                if (!c0616pi.m3082O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    c0616pi.m3085R();
                } else {
                    AbstractC0676r4.m3378a(we1Var.f7116d, interfaceC0904ww, c0616pi, 0);
                }
                break;
            default:
                InterfaceC0356ji interfaceC0356ji2 = (InterfaceC0356ji) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C0616pi c0616pi2 = (C0616pi) interfaceC0356ji2;
                if (!c0616pi2.m3082O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    c0616pi2.m3085R();
                } else {
                    ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3 = we1Var.f7116d;
                    Object tag = viewTreeObserverOnGlobalLayoutListenerC0875w3.getTag(C0587R.id.inspection_slot_table_set);
                    InterfaceC0322ik interfaceC0322ik = null;
                    Set set = (!(tag instanceof Set) || ((tag instanceof p40) && !(tag instanceof t40))) ? null : (Set) tag;
                    if (set == null) {
                        Object parent = viewTreeObserverOnGlobalLayoutListenerC0875w3.getParent();
                        View view = parent instanceof View ? (View) parent : null;
                        Object tag2 = view != null ? view.getTag(C0587R.id.inspection_slot_table_set) : null;
                        set = (!(tag2 instanceof Set) || ((tag2 instanceof p40) && !(tag2 instanceof t40))) ? null : (Set) tag2;
                    }
                    if (set != null) {
                        set.add(c0616pi2.m3126w());
                        c0616pi2.f4896q = true;
                        c0616pi2.f4861C = true;
                        c0616pi2.f4882c.m4828b();
                        c0616pi2.f4866H.m4828b();
                        z11 z11Var = c0616pi2.f4867I;
                        w11 w11Var = z11Var.f7751a;
                        z11Var.f7755e = w11Var.f6902m;
                        z11Var.f7756f = w11Var.f6903n;
                    }
                    boolean zM3108h = c0616pi2.m3108h(we1Var);
                    Object objM3080L = c0616pi2.m3080L();
                    C0675r3 c0675r3 = C0320ii.f2572a;
                    if (zM3108h || objM3080L == c0675r3) {
                        objM3080L = new ue1(we1Var, interfaceC0322ik, i3);
                        c0616pi2.m3107g0(objM3080L);
                    }
                    s91.m4039d(c0616pi2, (InterfaceC0904ww) objM3080L, viewTreeObserverOnGlobalLayoutListenerC0875w3);
                    boolean zM3108h2 = c0616pi2.m3108h(we1Var);
                    Object objM3080L2 = c0616pi2.m3080L();
                    if (zM3108h2 || objM3080L2 == c0675r3) {
                        objM3080L2 = new ue1(we1Var, interfaceC0322ik, i2);
                        c0616pi2.m3107g0(objM3080L2);
                    }
                    s91.m4039d(c0616pi2, (InterfaceC0904ww) objM3080L2, viewTreeObserverOnGlobalLayoutListenerC0875w3);
                    AbstractC0307i4.m1526b(r20.f5282a.mo206a(set), AbstractC0398kl.m1937w(-280240369, new ve1(we1Var, interfaceC0904ww, i3), c0616pi2), c0616pi2, 56);
                }
                break;
        }
        return na1Var;
    }
}
