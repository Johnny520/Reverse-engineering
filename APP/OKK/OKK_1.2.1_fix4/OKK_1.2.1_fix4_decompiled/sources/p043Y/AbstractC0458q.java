package p043Y;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import org.luckypray.dexkit.C1031R;
import p034S.AbstractC0324d;
import p063j.C0957b;

/* JADX INFO: renamed from: Y.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0458q {

    /* JADX INFO: renamed from: a */
    public static final C0442a f1035a;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1036b;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f1037c;

    static {
        C0442a c0442a = new C0442a();
        c0442a.f969A = new ArrayList();
        c0442a.f970B = true;
        c0442a.f972D = false;
        c0442a.f973E = 0;
        c0442a.f970B = false;
        c0442a.m1054I(new C0449h(2));
        c0442a.m1054I(new C0447f());
        c0442a.m1054I(new C0449h(1));
        f1035a = c0442a;
        f1036b = new ThreadLocal();
        f1037c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m1089a(ViewGroup viewGroup, AbstractC0454m abstractC0454m) {
        ArrayList arrayList = f1037c;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC0454m == null) {
            abstractC0454m = f1035a;
        }
        AbstractC0454m abstractC0454mClone = abstractC0454m.clone();
        ArrayList arrayList2 = (ArrayList) m1090b().getOrDefault(viewGroup, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0454m) it.next()).mo1061w(viewGroup);
            }
        }
        abstractC0454mClone.m1081h(viewGroup, true);
        AbstractC0324d.m726i(viewGroup.getTag(C1031R.id.transition_current_scene));
        viewGroup.setTag(C1031R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0457p viewTreeObserverOnPreDrawListenerC0457p = new ViewTreeObserverOnPreDrawListenerC0457p();
        viewTreeObserverOnPreDrawListenerC0457p.f1033a = abstractC0454mClone;
        viewTreeObserverOnPreDrawListenerC0457p.f1034b = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0457p);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0457p);
    }

    /* JADX INFO: renamed from: b */
    public static C0957b m1090b() {
        C0957b c0957b;
        ThreadLocal threadLocal = f1036b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0957b = (C0957b) weakReference.get()) != null) {
            return c0957b;
        }
        C0957b c0957b2 = new C0957b();
        threadLocal.set(new WeakReference(c0957b2));
        return c0957b2;
    }
}
