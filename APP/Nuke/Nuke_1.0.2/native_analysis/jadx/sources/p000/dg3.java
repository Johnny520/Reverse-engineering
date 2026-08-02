package p000;

import android.view.View;
import android.view.ViewGroup;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dg3 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f2050a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0092  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final bg3 m1028a(AbstractC0526o2 abstractC0526o2, C0440lx c0440lx, C0402kw c0402kw) {
        ViewTreeObserverOnGlobalLayoutListenerC0045b7 viewTreeObserverOnGlobalLayoutListenerC0045b7;
        bg3 bg3Var;
        Object[] objArr = 0;
        if (iq0.f4742a.compareAndSet(false, true)) {
            C0356jn c0356jnM1630a = fg1.m1630a(1, 6, null);
            AbstractC0570p7.m3745A(AbstractC0731te.m5206e((a20) C0804vb.f11872t.getValue()), null, new C0040b2((Object) c0356jnM1630a, (t00) (objArr == true ? 1 : 0), 9), 3);
            C0798v5 c0798v5 = new C0798v5(11, c0356jnM1630a);
            synchronized (ds2.f2181c) {
                ds2.f2187i = AbstractC0142du.m1169y0(ds2.f2187i, c0798v5);
            }
            ds2.m1117a();
        }
        if (abstractC0526o2.getChildCount() > 0) {
            View childAt = abstractC0526o2.getChildAt(0);
            viewTreeObserverOnGlobalLayoutListenerC0045b7 = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC0045b7 ? (ViewTreeObserverOnGlobalLayoutListenerC0045b7) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC0045b7 != null) {
                viewTreeObserverOnGlobalLayoutListenerC0045b7.setComposeViewContext(c0440lx);
            }
            if (viewTreeObserverOnGlobalLayoutListenerC0045b7 == null) {
                viewTreeObserverOnGlobalLayoutListenerC0045b7 = new ViewTreeObserverOnGlobalLayoutListenerC0045b7(abstractC0526o2.getContext(), c0440lx);
                abstractC0526o2.addView(viewTreeObserverOnGlobalLayoutListenerC0045b7.getView(), f2050a);
            }
            viewTreeObserverOnGlobalLayoutListenerC0045b7.setComposeViewContext(c0440lx);
            if (abstractC0526o2.getComposeViewContext$ui() != null) {
                c0440lx.m2982c();
                viewTreeObserverOnGlobalLayoutListenerC0045b7.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = viewTreeObserverOnGlobalLayoutListenerC0045b7.getTag(R.id.wrapped_composition_tag);
            bg3Var = tag instanceof bg3 ? (bg3) tag : null;
            if (bg3Var == null) {
                bg3Var = new bg3(viewTreeObserverOnGlobalLayoutListenerC0045b7, new C0220fy(c0440lx.f6349b, new s73(viewTreeObserverOnGlobalLayoutListenerC0045b7.getRoot())));
                viewTreeObserverOnGlobalLayoutListenerC0045b7.setTag(R.id.wrapped_composition_tag, bg3Var);
            }
            bg3Var.m532d(c0402kw);
            viewTreeObserverOnGlobalLayoutListenerC0045b7.setFrameEndScheduler$ui(new cg3(c0440lx.f6349b));
            return bg3Var;
        }
        abstractC0526o2.removeAllViews();
        viewTreeObserverOnGlobalLayoutListenerC0045b7 = null;
        if (viewTreeObserverOnGlobalLayoutListenerC0045b7 == null) {
        }
        viewTreeObserverOnGlobalLayoutListenerC0045b7.setComposeViewContext(c0440lx);
        if (abstractC0526o2.getComposeViewContext$ui() != null) {
        }
        Object tag2 = viewTreeObserverOnGlobalLayoutListenerC0045b7.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof bg3) {
        }
        if (bg3Var == null) {
        }
        bg3Var.m532d(c0402kw);
        viewTreeObserverOnGlobalLayoutListenerC0045b7.setFrameEndScheduler$ui(new cg3(c0440lx.f6349b));
        return bg3Var;
    }
}
