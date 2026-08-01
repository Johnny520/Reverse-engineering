package p000;

import android.app.Application;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: h1 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0282h1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2193a;

    /* JADX INFO: renamed from: b */
    public Object f2194b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f2195c;

    public /* synthetic */ RunnableC0282h1(Object obj, int i, Object obj2) {
        this.f2193a = i;
        this.f2195c = obj;
        this.f2194b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        InterfaceC0350iu interfaceC0350iu;
        int i = this.f2193a;
        int i2 = 0;
        Object obj = this.f2195c;
        switch (i) {
            case Base64.DEFAULT /* 0 */:
                C0208f1 c0208f1 = (C0208f1) this.f2194b;
                C0358j1 c0358j1 = (C0358j1) obj;
                MenuC0424ku menuC0424ku = c0358j1.f2518c;
                if (menuC0424ku != null && (interfaceC0350iu = menuC0424ku.f2954e) != null) {
                    interfaceC0350iu.mo925k(menuC0424ku);
                }
                View view = (View) c0358j1.f2523h;
                if (view != null && view.getWindowToken() != null) {
                    if (c0208f1.m2600b()) {
                        c0358j1.f2534s = c0208f1;
                    } else if (c0208f1.f5027e != null) {
                        c0208f1.m2601d(0, 0, false, false);
                        c0358j1.f2534s = c0208f1;
                    }
                }
                c0358j1.f2536u = null;
                return;
            case Base64.NO_PADDING /* 1 */:
                ((C0655r1) this.f2194b).f4126a = obj;
                return;
            case Base64.NO_WRAP /* 2 */:
                ((Application) this.f2194b).unregisterActivityLifecycleCallbacks((C0655r1) obj);
                return;
            case 3:
                Object obj2 = this.f2194b;
                try {
                    Method method = AbstractC0692s1.f4372d;
                    if (method != null) {
                        method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        AbstractC0692s1.f4373e.invoke(obj2, obj, Boolean.FALSE);
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
                AbstractC0979zt abstractC0979zt = (AbstractC0979zt) ((C0431l0) this.f2194b).f2980b;
                if (abstractC0979zt != null) {
                    abstractC0979zt.mo2609J(typeface);
                    return;
                }
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.f2194b;
                g40 g40Var = (g40) obj;
                if (arrayList.contains(g40Var)) {
                    arrayList.remove(g40Var);
                    z30.m2756a(g40Var.f2016c.f3229E, g40Var.f2014a);
                    return;
                }
                return;
            case 6:
                ((C0326i8) this.f2194b).m1416s((C0381jo) obj);
                return;
            case 7:
                C0680rq c0680rq = (C0680rq) obj;
                AbstractC0408ke abstractC0408ke = c0680rq.f4337c;
                while (true) {
                    try {
                        ((Runnable) this.f2194b).run();
                    } catch (Throwable th2) {
                        AbstractC0222ff.m1199u(C0857wi.f4966a, th2);
                    }
                    Runnable runnableM2296f = c0680rq.m2296f();
                    if (runnableM2296f == null) {
                        return;
                    }
                    this.f2194b = runnableM2296f;
                    i2++;
                    if (i2 >= 16 && abstractC0408ke.mo1605e()) {
                        abstractC0408ke.mo1598d(c0680rq, this);
                        return;
                    }
                    break;
                }
                break;
            case 8:
                ((C0933yk) this.f2194b).m2688a(obj);
                return;
            default:
                ma0 ma0Var = ((SwipeDismissBehavior) obj).f1006a;
                if (ma0Var == null || !ma0Var.m1806f()) {
                    return;
                }
                View view2 = (View) this.f2194b;
                WeakHashMap weakHashMap = ja0.f2600a;
                s90.m2321m(view2, this);
                return;
        }
    }

    public /* synthetic */ RunnableC0282h1(Object obj, Object obj2, int i, boolean z) {
        this.f2193a = i;
        this.f2194b = obj;
        this.f2195c = obj2;
    }

    public RunnableC0282h1(C0103cg c0103cg, ArrayList arrayList, g40 g40Var) {
        this.f2193a = 5;
        this.f2194b = arrayList;
        this.f2195c = g40Var;
    }

    public RunnableC0282h1(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f2193a = 9;
        this.f2195c = swipeDismissBehavior;
        this.f2194b = view;
    }
}
