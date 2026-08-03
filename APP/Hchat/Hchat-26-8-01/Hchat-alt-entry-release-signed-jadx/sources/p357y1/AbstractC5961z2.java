package p357y1;

import android.view.View;
import android.view.ViewGroup;
import p016b1.C0166f;
import p027c0.C0368m;
import p099h.Hchat.R;
import p117i0.C1871q;
import p249qg.AbstractC3603v;
import p266s0.C3874d;
import p322w0.AbstractC4662m;
import p339x1.C5604f2;
import sg.AbstractC3978j;
import sg.C3971c;
import tf.AbstractC4166m;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: y1.z2 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5961z2 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f24236a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0090  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, java.util.Collection] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C5953x2 m10709a(AbstractC5858a abstractC5858a, C5880f1 c5880f1, C3874d c3874d) {
        ViewTreeObserverOnGlobalLayoutListenerC5934t viewTreeObserverOnGlobalLayoutListenerC5934t;
        C5953x2 c5953x2;
        if (AbstractC5912n1.f23996a.compareAndSet(false, true)) {
            C3971c c3971cM8218a = AbstractC3978j.m8218a(1, 6, null);
            AbstractC3603v.m7563q(AbstractC3603v.m7547a((InterfaceC5561g) C5911n0.f23984s.getValue()), null, new C0368m(c3971cM8218a, null), 3);
            C0166f c0166f = new C0166f(c3971cM8218a, 25);
            synchronized (AbstractC4662m.f15512c) {
                AbstractC4662m.f15518i = AbstractC4166m.m8398G1(AbstractC4662m.f15518i, c0166f);
            }
            AbstractC4662m.m9120a();
        }
        if (abstractC5858a.getChildCount() > 0) {
            View childAt = abstractC5858a.getChildAt(0);
            viewTreeObserverOnGlobalLayoutListenerC5934t = childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC5934t ? (ViewTreeObserverOnGlobalLayoutListenerC5934t) childAt : null;
            if (viewTreeObserverOnGlobalLayoutListenerC5934t != null) {
                viewTreeObserverOnGlobalLayoutListenerC5934t.setComposeViewContext(c5880f1);
            }
            if (viewTreeObserverOnGlobalLayoutListenerC5934t == null) {
                viewTreeObserverOnGlobalLayoutListenerC5934t = new ViewTreeObserverOnGlobalLayoutListenerC5934t(abstractC5858a.getContext(), c5880f1);
                abstractC5858a.addView(viewTreeObserverOnGlobalLayoutListenerC5934t.getView(), f24236a);
            }
            viewTreeObserverOnGlobalLayoutListenerC5934t.setComposeViewContext(c5880f1);
            if (abstractC5858a.getComposeViewContext$ui() != null) {
                c5880f1.m10583c();
                viewTreeObserverOnGlobalLayoutListenerC5934t.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = viewTreeObserverOnGlobalLayoutListenerC5934t.getTag(R.id.wrapped_composition_tag);
            c5953x2 = tag instanceof C5953x2 ? (C5953x2) tag : null;
            if (c5953x2 == null) {
                c5953x2 = new C5953x2(viewTreeObserverOnGlobalLayoutListenerC5934t, new C1871q(c5880f1.f23858b, new C5604f2(viewTreeObserverOnGlobalLayoutListenerC5934t.getRoot())));
                viewTreeObserverOnGlobalLayoutListenerC5934t.setTag(R.id.wrapped_composition_tag, c5953x2);
            }
            c5953x2.m10673f(c3874d);
            viewTreeObserverOnGlobalLayoutListenerC5934t.setFrameEndScheduler$ui(new C5957y2(c5880f1.f23858b));
            return c5953x2;
        }
        abstractC5858a.removeAllViews();
        viewTreeObserverOnGlobalLayoutListenerC5934t = null;
        if (viewTreeObserverOnGlobalLayoutListenerC5934t == null) {
        }
        viewTreeObserverOnGlobalLayoutListenerC5934t.setComposeViewContext(c5880f1);
        if (abstractC5858a.getComposeViewContext$ui() != null) {
        }
        Object tag2 = viewTreeObserverOnGlobalLayoutListenerC5934t.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof C5953x2) {
        }
        if (c5953x2 == null) {
        }
        c5953x2.m10673f(c3874d);
        viewTreeObserverOnGlobalLayoutListenerC5934t.setFrameEndScheduler$ui(new C5957y2(c5880f1.f23858b));
        return c5953x2;
    }
}
