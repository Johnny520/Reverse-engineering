package p000;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: h1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0282h1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2087a;

    /* JADX INFO: renamed from: b */
    public Object f2088b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2089c;

    public /* synthetic */ RunnableC0282h1(Object obj, int i, Object obj2) {
        this.f2087a = i;
        this.f2089c = obj;
        this.f2088b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC0572ou interfaceC0572ou;
        int i = this.f2087a;
        int i2 = 0;
        Object obj = this.f2089c;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                C0208f1 c0208f1 = (C0208f1) this.f2088b;
                C0358j1 c0358j1 = (C0358j1) obj;
                MenuC0646qu menuC0646qu = c0358j1.f2625c;
                if (menuC0646qu != null && (interfaceC0572ou = menuC0646qu.f3955e) != null) {
                    interfaceC0572ou.mo623k(menuC0646qu);
                }
                View view = (View) c0358j1.f2630h;
                if (view != null && view.getWindowToken() != null) {
                    if (c0208f1.m1029b()) {
                        c0358j1.f2641s = c0208f1;
                    } else if (c0208f1.f1665e != null) {
                        c0208f1.m1031d(0, 0, false, false);
                        c0358j1.f2641s = c0208f1;
                    }
                }
                c0358j1.f2643u = null;
                return;
            case Base64.NO_PADDING /* 1 */:
                ((C0654r1) this.f2088b).f3990a = obj;
                return;
            case Base64.NO_WRAP /* 2 */:
                ((Application) this.f2088b).unregisterActivityLifecycleCallbacks((C0654r1) obj);
                return;
            case 3:
                Object obj2 = this.f2088b;
                try {
                    Method method = AbstractC0691s1.f4183d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0691s1.f4184e.invoke(obj2, obj, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                Typeface typeface = (Typeface) obj;
                AbstractC0498mu abstractC0498mu = (AbstractC0498mu) ((C0431l0) this.f2088b).f2886b;
                if (abstractC0498mu != null) {
                    abstractC0498mu.mo969x(typeface);
                    return;
                }
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.f2088b;
                n40 n40Var = (n40) obj;
                if (arrayList.contains(n40Var)) {
                    arrayList.remove(n40Var);
                    g40.m1138a(n40Var.f3216c.f3474E, n40Var.f3214a);
                    return;
                }
                return;
            case 6:
                ((C0698s8) this.f2088b).m2325s((C0529no) obj);
                return;
            case 7:
                C0827vq c0827vq = (C0827vq) obj;
                AbstractC0445le abstractC0445le = c0827vq.f4974c;
                while (true) {
                    try {
                        ((Runnable) this.f2088b).run();
                    } catch (Throwable th2) {
                        g80.m1202q(C0931yi.f5432a, th2);
                    }
                    Runnable runnableM2574f = c0827vq.m2574f();
                    if (runnableM2574f == null) {
                        return;
                    }
                    this.f2088b = runnableM2574f;
                    i2++;
                    if (i2 >= 16 && abstractC0445le.mo1760e()) {
                        abstractC0445le.mo584d(c0827vq, this);
                        return;
                    }
                    break;
                }
                break;
            case 8:
                ((C0022al) this.f2088b).m54a(obj);
                return;
            default:
                ra0 ra0Var = ((SwipeDismissBehavior) obj).f931a;
                if (ra0Var == null || !ra0Var.m2271f()) {
                    return;
                }
                View view2 = (View) this.f2088b;
                WeakHashMap weakHashMap = oa0.f3426a;
                x90.m2665m(view2, this);
                return;
        }
    }

    public /* synthetic */ RunnableC0282h1(Object obj, Object obj2, int i, boolean z) {
        this.f2087a = i;
        this.f2088b = obj;
        this.f2089c = obj2;
    }

    public RunnableC0282h1(C0150dg c0150dg, ArrayList arrayList, n40 n40Var) {
        this.f2087a = 5;
        this.f2088b = arrayList;
        this.f2089c = n40Var;
    }

    public RunnableC0282h1(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f2087a = 9;
        this.f2089c = swipeDismissBehavior;
        this.f2088b = view;
    }
}
