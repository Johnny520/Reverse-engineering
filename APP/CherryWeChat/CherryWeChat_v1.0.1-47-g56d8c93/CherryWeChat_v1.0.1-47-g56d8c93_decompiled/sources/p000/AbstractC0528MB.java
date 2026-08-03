package p000;

import android.widget.FrameLayout;
import io.github.cherrywechat.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: MB */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0528MB {

    /* JADX INFO: renamed from: a */
    public static final C1308d5 f1721a;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1722b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f1723c;

    static {
        C1308d5 c1308d5 = new C1308d5();
        c1308d5.f4758A = new ArrayList();
        c1308d5.f4761D = false;
        c1308d5.f4762E = 0;
        c1308d5.f4759B = false;
        c1308d5.m2568I(new C1222bh(2));
        c1308d5.m2568I(new C2444r7());
        c1308d5.m2568I(new C1222bh(1));
        f1721a = c1308d5;
        f1722b = new ThreadLocal();
        f1723c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m1023a(FrameLayout frameLayout, AbstractC0356IB abstractC0356IB) {
        ArrayList arrayList = f1723c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC0356IB == null) {
            abstractC0356IB = f1721a;
        }
        AbstractC0356IB abstractC0356IBClone = abstractC0356IB.clone();
        ArrayList arrayList2 = (ArrayList) m1024b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0356IB) it.next()).mo785w(frameLayout);
            }
        }
        abstractC0356IBClone.m772h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0485LB viewTreeObserverOnPreDrawListenerC0485LB = new ViewTreeObserverOnPreDrawListenerC0485LB();
        viewTreeObserverOnPreDrawListenerC0485LB.f1592a = abstractC0356IBClone;
        viewTreeObserverOnPreDrawListenerC0485LB.f1593b = frameLayout;
        frameLayout.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0485LB);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0485LB);
    }

    /* JADX INFO: renamed from: b */
    public static C0521M4 m1024b() {
        C0521M4 c0521m4;
        ThreadLocal threadLocal = f1722b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0521m4 = (C0521M4) weakReference.get()) != null) {
            return c0521m4;
        }
        C0521M4 c0521m42 = new C0521M4(0);
        threadLocal.set(new WeakReference(c0521m42));
        return c0521m42;
    }
}
