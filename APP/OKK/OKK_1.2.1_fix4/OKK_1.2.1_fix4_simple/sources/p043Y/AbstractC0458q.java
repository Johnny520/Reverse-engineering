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
    public static final C0442a f1035a = null;

    /* JADX INFO: renamed from: b */
    public static final ThreadLocal f1036b = null;

    /* JADX INFO: renamed from: c */
    public static final ArrayList f1037c = null;

    static {
        C0442a r02 = new C0442a();
        r02.f969A = new ArrayList();
        r02.f970B = true;
        r02.f972D = false;
        r02.f973E = 0;
        r02.f970B = false;
        r02.m1054I(new C0449h(2));
        r02.m1054I(new C0447f());
        r02.m1054I(new C0449h(1));
        f1035a = r02;
        f1036b = new ThreadLocal();
        f1037c = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m1089a(ViewGroup r3, AbstractC0454m r4) {
        ArrayList r02 = f1037c;
        if (r02.contains(r3) == false) goto L5;
        return;
    L5:
        if (r3.isLaidOut() == false) goto L21;
        r02.add(r3);
        if (r4 != null) goto L9;
        r4 = f1035a;
    L9:
        AbstractC0454m r42 = r4.mo1059j();
        ArrayList r03 = (ArrayList) m1090b().getOrDefault(r3, null);
        if (r03 != null) goto L12;
    L17:
        r42.m1081h(r3, true);
        AbstractC0324d.m726i(r3.getTag(C1031R.id.transition_current_scene));
        r3.setTag(C1031R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0457p r04 = new ViewTreeObserverOnPreDrawListenerC0457p();
        r04.f1033a = r42;
        r04.f1034b = r3;
        r3.addOnAttachStateChangeListener(r04);
        r3.getViewTreeObserver().addOnPreDrawListener(r04);
        return;
    L12:
        if (r03.size() <= 0) goto L17;
        Iterator r05 = r03.iterator();
    L15:
        if (r05.hasNext() == false) goto L17;
        ((AbstractC0454m) r05.next()).mo1061w(r3);
        goto L15
    }

    /* JADX INFO: renamed from: b */
    public static C0957b m1090b() {
        ThreadLocal r02 = f1036b;
        WeakReference r1 = (WeakReference) r02.get();
        if (r1 == null) goto L7;
        C0957b r12 = (C0957b) r1.get();
        if (r12 == null) goto L7;
        return r12;
    L7:
        C0957b r13 = new C0957b();
        r02.set(new WeakReference(r13));
        return r13;
    }
}
