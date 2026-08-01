package p000;

import android.view.View;
import android.view.ViewGroup;
import org.luckypray.dexkit.C0587R;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ye1 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f7616a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final we1 m5256a(AbstractC0671r abstractC0671r, AbstractC0727si abstractC0727si, C0474mh c0474mh) {
        ViewTreeObserverOnGlobalLayoutListenerC0875w3 viewTreeObserverOnGlobalLayoutListenerC0875w3;
        we1 we1Var;
        if (AbstractC0705rx.f5566a.compareAndSet(false, true)) {
            C0834vb c0834vbM2765e = o30.m2765e(1, 6, null);
            AbstractC0307i4.m1547w(p30.m2995e((InterfaceC0618pk) C0641q6.f5044p.getValue()), null, new C0302i(c0834vbM2765e, null), 3);
            C0711s2 c0711s2 = new C0711s2(11, c0834vbM2765e);
            synchronized (t21.f5893c) {
                t21.f5899i = AbstractC0960ye.m5248R(t21.f5899i, c0711s2);
            }
            t21.m4163a();
        }
        if (abstractC0671r.getChildCount() > 0) {
            View childAt = abstractC0671r.getChildAt(0);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0875w3) {
                viewTreeObserverOnGlobalLayoutListenerC0875w3 = (ViewTreeObserverOnGlobalLayoutListenerC0875w3) childAt;
            }
            if (viewTreeObserverOnGlobalLayoutListenerC0875w3 == null) {
                viewTreeObserverOnGlobalLayoutListenerC0875w3 = new ViewTreeObserverOnGlobalLayoutListenerC0875w3(abstractC0671r.getContext(), abstractC0727si.mo2717j());
                abstractC0671r.addView(viewTreeObserverOnGlobalLayoutListenerC0875w3.getView(), f7616a);
            }
            Object tag = viewTreeObserverOnGlobalLayoutListenerC0875w3.getView().getTag(C0587R.id.wrapped_composition_tag);
            we1Var = tag instanceof we1 ? (we1) tag : null;
            if (we1Var == null) {
                we1Var = new we1(viewTreeObserverOnGlobalLayoutListenerC0875w3, new C0964yi(abstractC0727si, new ja1(viewTreeObserverOnGlobalLayoutListenerC0875w3.getRoot())));
                viewTreeObserverOnGlobalLayoutListenerC0875w3.getView().setTag(C0587R.id.wrapped_composition_tag, we1Var);
            }
            we1Var.m5012f(c0474mh);
            if (!p30.m3002l(viewTreeObserverOnGlobalLayoutListenerC0875w3.getCoroutineContext(), abstractC0727si.mo2717j())) {
                viewTreeObserverOnGlobalLayoutListenerC0875w3.setCoroutineContext(abstractC0727si.mo2717j());
            }
            viewTreeObserverOnGlobalLayoutListenerC0875w3.setFrameEndScheduler$ui(new xe1(abstractC0727si));
            return we1Var;
        }
        abstractC0671r.removeAllViews();
        viewTreeObserverOnGlobalLayoutListenerC0875w3 = null;
        if (viewTreeObserverOnGlobalLayoutListenerC0875w3 == null) {
        }
        Object tag2 = viewTreeObserverOnGlobalLayoutListenerC0875w3.getView().getTag(C0587R.id.wrapped_composition_tag);
        if (tag2 instanceof we1) {
        }
        if (we1Var == null) {
        }
        we1Var.m5012f(c0474mh);
        if (!p30.m3002l(viewTreeObserverOnGlobalLayoutListenerC0875w3.getCoroutineContext(), abstractC0727si.mo2717j())) {
        }
        viewTreeObserverOnGlobalLayoutListenerC0875w3.setFrameEndScheduler$ui(new xe1(abstractC0727si));
        return we1Var;
    }
}
