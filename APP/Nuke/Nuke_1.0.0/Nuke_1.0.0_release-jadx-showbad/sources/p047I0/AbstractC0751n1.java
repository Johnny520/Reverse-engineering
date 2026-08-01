package p047I0;

import android.view.View;
import android.view.ViewGroup;
import me.dartcv.nuke.R;
import p007B0.C0172E;
import p034G.C0466k;
import p041H0.C0560F0;
import p061L2.AbstractC0973m;
import p074O2.InterfaceC1051i;
import p095T.AbstractC1391v;
import p095T.C1397y;
import p117X2.AbstractC1665j;
import p136b0.C1843e;
import p158f0.AbstractC2082n;
import p160f3.AbstractC2162v;
import p172h3.AbstractC2250j;
import p172h3.C2243c;

/* JADX INFO: renamed from: I0.n1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0751n1 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f2336a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ad  */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0745l1 m1269a(AbstractC0713b abstractC0713b, AbstractC1391v abstractC1391v, C1843e c1843e) {
        ViewTreeObserverOnGlobalLayoutListenerC0772y viewTreeObserverOnGlobalLayoutListenerC0772y;
        C0745l1 c0745l1;
        if (AbstractC0767v0.f2392a.compareAndSet(false, true)) {
            C2243c c2243cM4101a = AbstractC2250j.m4101a(1, 6, null);
            AbstractC2162v.m3994p(AbstractC2162v.m3979a((InterfaceC1051i) C0706Y.f2233p.getValue()), null, new C0466k(c2243cM4101a, null), 3);
            C0172E c0172e = new C0172E(9, c2243cM4101a);
            synchronized (AbstractC2082n.f6972c) {
                AbstractC2082n.f6978i = AbstractC0973m.m2020a0(AbstractC2082n.f6978i, c0172e);
            }
            AbstractC2082n.m3825a();
        }
        if (abstractC0713b.getChildCount() > 0) {
            View childAt = abstractC0713b.getChildAt(0);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0772y) {
                viewTreeObserverOnGlobalLayoutListenerC0772y = (ViewTreeObserverOnGlobalLayoutListenerC0772y) childAt;
            }
            if (viewTreeObserverOnGlobalLayoutListenerC0772y == null) {
                viewTreeObserverOnGlobalLayoutListenerC0772y = new ViewTreeObserverOnGlobalLayoutListenerC0772y(abstractC0713b.getContext(), abstractC1391v.mo2528j());
                abstractC0713b.addView(viewTreeObserverOnGlobalLayoutListenerC0772y.getView(), f2336a);
            }
            Object tag = viewTreeObserverOnGlobalLayoutListenerC0772y.getView().getTag(R.id.wrapped_composition_tag);
            c0745l1 = tag instanceof C0745l1 ? (C0745l1) tag : null;
            if (c0745l1 == null) {
                c0745l1 = new C0745l1(viewTreeObserverOnGlobalLayoutListenerC0772y, new C1397y(abstractC1391v, new C0560F0(viewTreeObserverOnGlobalLayoutListenerC0772y.getRoot())));
                viewTreeObserverOnGlobalLayoutListenerC0772y.getView().setTag(R.id.wrapped_composition_tag, c0745l1);
            }
            c0745l1.m1264e(c1843e);
            if (!AbstractC1665j.m2981a(viewTreeObserverOnGlobalLayoutListenerC0772y.getCoroutineContext(), abstractC1391v.mo2528j())) {
                viewTreeObserverOnGlobalLayoutListenerC0772y.setCoroutineContext(abstractC1391v.mo2528j());
            }
            viewTreeObserverOnGlobalLayoutListenerC0772y.setFrameEndScheduler$ui(new C0748m1(abstractC1391v));
            return c0745l1;
        }
        abstractC0713b.removeAllViews();
        viewTreeObserverOnGlobalLayoutListenerC0772y = null;
        if (viewTreeObserverOnGlobalLayoutListenerC0772y == null) {
        }
        Object tag2 = viewTreeObserverOnGlobalLayoutListenerC0772y.getView().getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof C0745l1) {
        }
        if (c0745l1 == null) {
        }
        c0745l1.m1264e(c1843e);
        if (!AbstractC1665j.m2981a(viewTreeObserverOnGlobalLayoutListenerC0772y.getCoroutineContext(), abstractC1391v.mo2528j())) {
        }
        viewTreeObserverOnGlobalLayoutListenerC0772y.setFrameEndScheduler$ui(new C0748m1(abstractC1391v));
        return c0745l1;
    }
}
