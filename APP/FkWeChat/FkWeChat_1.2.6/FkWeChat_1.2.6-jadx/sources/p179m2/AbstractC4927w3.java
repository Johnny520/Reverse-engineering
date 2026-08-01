package p179m2;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.AbstractC0453a;
import androidx.compose.runtime.AbstractC0482e0;
import androidx.compose.runtime.AbstractC0517j0;
import androidx.compose.runtime.InterfaceC0475d0;
import androidx.compose.runtime.InterfaceC0502h;
import java.util.Collections;
import java.util.WeakHashMap;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p024b9.C1055q;
import p024b9.InterfaceC1049n;
import p165l1.AbstractC4510p;
import p166l2.C4554j0;
import p166l2.C4564l2;
import p172l8.InterfaceC4695g;
import p179m2.C4876m2;

/* JADX INFO: renamed from: m2.w3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4927w3 {

    /* JADX INFO: renamed from: a */
    public static final ViewGroup.LayoutParams f14917a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX INFO: renamed from: m2.w3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final /* synthetic */ class a implements C4876m2.a, InterfaceC1049n {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ AbstractC0482e0 f14918q;

        public a(AbstractC0482e0 abstractC0482e0) {
            this.f14918q = abstractC0482e0;
        }

        @Override // p179m2.C4876m2.a
        /* JADX INFO: renamed from: a */
        public final InterfaceC0502h mo19506a(InterfaceC0173a interfaceC0173a) {
            return this.f14918q.mo1626u(interfaceC0173a);
        }

        @Override // p024b9.InterfaceC1049n
        /* JADX INFO: renamed from: b */
        public final InterfaceC4695g mo3805b() {
            return new C1055q(1, this.f14918q, AbstractC0482e0.class, "scheduleFrameEndCallback", "scheduleFrameEndCallback(Lkotlin/jvm/functions/Function0;)Landroidx/compose/runtime/CancellationHandle;", 0);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof C4876m2.a) && (obj instanceof InterfaceC1049n)) {
                return AbstractC1061t.m3842c(mo3805b(), ((InterfaceC1049n) obj).mo3805b());
            }
            return false;
        }

        public final int hashCode() {
            return mo3805b().hashCode();
        }
    }

    /* JADX INFO: renamed from: a */
    public static final AbstractC0453a m19910a(C4554j0 c4554j0) {
        return new C4564l2(c4554j0);
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0475d0 m19911b(ViewTreeObserverOnGlobalLayoutListenerC4898r viewTreeObserverOnGlobalLayoutListenerC4898r, AbstractC0482e0 abstractC0482e0, InterfaceC0188p interfaceC0188p) {
        if (AbstractC4836e2.m19334b() && viewTreeObserverOnGlobalLayoutListenerC4898r.getTag(AbstractC4510p.f13110L) == null) {
            viewTreeObserverOnGlobalLayoutListenerC4898r.setTag(AbstractC4510p.f13110L, Collections.newSetFromMap(new WeakHashMap()));
        }
        Object tag = viewTreeObserverOnGlobalLayoutListenerC4898r.getView().getTag(AbstractC4510p.f13111M);
        C4917u3 c4917u3 = tag instanceof C4917u3 ? (C4917u3) tag : null;
        if (c4917u3 == null) {
            c4917u3 = new C4917u3(viewTreeObserverOnGlobalLayoutListenerC4898r, AbstractC0517j0.m1760a(new C4564l2(viewTreeObserverOnGlobalLayoutListenerC4898r.getRoot()), abstractC0482e0));
            viewTreeObserverOnGlobalLayoutListenerC4898r.getView().setTag(AbstractC4510p.f13111M, c4917u3);
        }
        c4917u3.mo1589g(interfaceC0188p);
        if (!AbstractC1061t.m3842c(viewTreeObserverOnGlobalLayoutListenerC4898r.getCoroutineContext(), abstractC0482e0.mo1615j())) {
            viewTreeObserverOnGlobalLayoutListenerC4898r.setCoroutineContext(abstractC0482e0.mo1615j());
        }
        viewTreeObserverOnGlobalLayoutListenerC4898r.setFrameEndScheduler$ui(new a(abstractC0482e0));
        return c4917u3;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0475d0 m19912c(AbstractC4813a abstractC4813a, AbstractC0482e0 abstractC0482e0, InterfaceC0188p interfaceC0188p) {
        C4925w1.f14906a.m19906b();
        ViewTreeObserverOnGlobalLayoutListenerC4898r viewTreeObserverOnGlobalLayoutListenerC4898r = null;
        if (abstractC4813a.getChildCount() > 0) {
            View childAt = abstractC4813a.getChildAt(0);
            if (childAt instanceof ViewTreeObserverOnGlobalLayoutListenerC4898r) {
                viewTreeObserverOnGlobalLayoutListenerC4898r = (ViewTreeObserverOnGlobalLayoutListenerC4898r) childAt;
            }
        } else {
            abstractC4813a.removeAllViews();
        }
        if (viewTreeObserverOnGlobalLayoutListenerC4898r == null) {
            viewTreeObserverOnGlobalLayoutListenerC4898r = new ViewTreeObserverOnGlobalLayoutListenerC4898r(abstractC4813a.getContext(), abstractC0482e0.mo1615j());
            abstractC4813a.addView(viewTreeObserverOnGlobalLayoutListenerC4898r.getView(), f14917a);
        }
        return m19911b(viewTreeObserverOnGlobalLayoutListenerC4898r, abstractC0482e0, interfaceC0188p);
    }
}
