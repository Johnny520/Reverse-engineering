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
    public static final C1308d5 f1721a = null;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1722b = null;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f1723c = null;

    static {
        C1308d5 r0 = new C1308d5();
        r0.f4758A = new ArrayList();
        r0.f4761D = false;
        r0.f4762E = 0;
        r0.f4759B = false;
        r0.m2568I(new C1222bh(2));
        r0.m2568I(new C2444r7());
        r0.m2568I(new C1222bh(1));
        f1721a = r0;
        f1722b = new ThreadLocal();
        f1723c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m1023a(FrameLayout r2, AbstractC0356IB r3) {
        ArrayList r0 = f1723c;
        if (r0.contains(r2) == false) goto L5;
        return;
    L5:
        if (r2.isLaidOut() == false) goto L25;
        r0.add(r2);
        if (r3 != null) goto L9;
        r3 = f1721a;
    L9:
        AbstractC0356IB r32 = r3.mo774j();
        ArrayList r02 = (ArrayList) m1024b().get(r2);
        if (r02 != null) goto L12;
    L17:
        r32.m772h(r2, true);
        if (r2.getTag(R.id.transition_current_scene) != null) goto L22;
        r2.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0485LB r03 = new ViewTreeObserverOnPreDrawListenerC0485LB();
        r03.f1592a = r32;
        r03.f1593b = r2;
        r2.addOnAttachStateChangeListener(r03);
        r2.getViewTreeObserver().addOnPreDrawListener(r03);
        return;
    L22:
        throw new ClassCastException();
    L12:
        if (r02.size() <= 0) goto L17;
        Iterator r04 = r02.iterator();
    L15:
        if (r04.hasNext() == false) goto L17;
        ((AbstractC0356IB) r04.next()).mo785w(r2);
        goto L15
    }

    /* JADX INFO: renamed from: b */
    public static C0521M4 m1024b() {
        ThreadLocal r0 = f1722b;
        WeakReference r1 = (WeakReference) r0.get();
        if (r1 == null) goto L7;
        C0521M4 r12 = (C0521M4) r1.get();
        if (r12 == null) goto L7;
        return r12;
    L7:
        C0521M4 r13 = new C0521M4(0);
        r0.set(new WeakReference(r13));
        return r13;
    }
}
