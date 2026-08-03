package p000;

import android.graphics.Typeface;
import android.os.StrictMode;
import android.view.View;
import androidx.recyclerview.widget.AbstractC1159h;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.ArrayList;

/* JADX INFO: renamed from: B0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0044B0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f93a;

    /* JADX INFO: renamed from: b */
    public Object f94b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f95c;

    public /* synthetic */ RunnableC0044B0(int i, Object obj, Object obj2) {
        this.f93a = i;
        this.f95c = obj;
        this.f94b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC2113jr interfaceC2113jr;
        switch (this.f93a) {
            case 0:
                C2781z0 c2781z0 = (C2781z0) this.f94b;
                C0130D0 c0130d0 = (C0130D0) this.f95c;
                MenuC2204lr menuC2204lr = c0130d0.f304c;
                if (menuC2204lr != null && (interfaceC2113jr = menuC2204lr.f7664e) != null) {
                    interfaceC2113jr.mo241n(menuC2204lr);
                }
                View view = (View) c0130d0.f309h;
                if (view != null && view.getWindowToken() != null) {
                    if (c2781z0.m5291b()) {
                        c0130d0.f320s = c2781z0;
                    } else if (c2781z0.f9319e != null) {
                        c2781z0.m5293d(0, 0, false, false);
                        c0130d0.f320s = c2781z0;
                    }
                }
                c0130d0.f322u = null;
                return;
            case 1:
                C1017Xm c1017Xm = (C1017Xm) this.f94b;
                Typeface typeface = (Typeface) this.f95c;
                AbstractC0585Nj abstractC0585Nj = (AbstractC0585Nj) c1017Xm.f3226b;
                if (abstractC0585Nj != null) {
                    abstractC0585Nj.mo1160J(typeface);
                    return;
                }
                return;
            case 2:
                C2377pk c2377pkM4818a = C2377pk.m4818a();
                c2377pkM4818a.getClass();
                AbstractC2622vD.m5130a();
                c2377pkM4818a.f8369d.set(true);
                ((ViewTreeObserverOnDrawListenerC2718xh) this.f95c).f9297b.f9396b = true;
                ((ViewTreeObserverOnDrawListenerC2718xh) this.f95c).f9296a.getViewTreeObserver().removeOnDrawListener((ViewTreeObserverOnDrawListenerC2718xh) this.f94b);
                ((ViewTreeObserverOnDrawListenerC2718xh) this.f95c).f9297b.f9395a.clear();
                return;
            case 3:
                ThreadFactoryC0928Vj threadFactoryC0928Vj = (ThreadFactoryC0928Vj) this.f95c;
                if (threadFactoryC0928Vj.f2893d) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    ((Runnable) this.f94b).run();
                    return;
                } catch (Throwable unused) {
                    threadFactoryC0928Vj.f2892c.getClass();
                    return;
                }
            case 4:
                C0801Sl c0801Sl = (C0801Sl) this.f94b;
                C0973Wl c0973Wl = (C0973Wl) this.f95c;
                RecyclerView recyclerView = c0973Wl.f3045q;
                if (recyclerView == null || !recyclerView.isAttachedToWindow() || c0801Sl.f2518k || c0801Sl.f2512e.getAbsoluteAdapterPosition() == -1) {
                    return;
                }
                AbstractC1159h itemAnimator = c0973Wl.f3045q.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.mo2250f()) {
                    ArrayList arrayList = c0973Wl.f3044p;
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        if (((C0801Sl) arrayList.get(i)).f2519l) {
                        }
                    }
                    c0973Wl.f3041m.mo1535n();
                    return;
                }
                c0973Wl.f3045q.post(this);
                return;
            case 5:
                int i2 = 0;
                while (true) {
                    try {
                        ((Runnable) this.f94b).run();
                    } catch (Throwable th) {
                        AbstractC0628Oj.m1222B(C0366If.f1247a, th);
                    }
                    Runnable runnableM2669w = ((C1377eo) this.f95c).m2669w();
                    if (runnableM2669w == null) {
                        return;
                    }
                    try {
                        this.f94b = runnableM2669w;
                        i2++;
                        if (i2 >= 16) {
                            C1377eo c1377eo = (C1377eo) this.f95c;
                            AbstractC1217bc abstractC1217bc = c1377eo.f4913c;
                            try {
                                if (abstractC1217bc.mo2333u(c1377eo)) {
                                    C1377eo c1377eo2 = (C1377eo) this.f95c;
                                    AbstractC1406fG.m2713m0(c1377eo2.f4913c, c1377eo2, this);
                                    return;
                                }
                            } catch (Throwable th2) {
                                throw new C1324de(th2, abstractC1217bc, c1377eo);
                            }
                        }
                    } catch (Throwable th3) {
                        C1377eo c1377eo3 = (C1377eo) this.f95c;
                        synchronized (c1377eo3.f4916f) {
                            C1377eo.f4911g.decrementAndGet(c1377eo3);
                            throw th3;
                        }
                    }
                    break;
                }
                break;
            case 6:
                ((C0754Rh) this.f94b).accept(this.f95c);
                return;
            default:
                C2228mE c2228mE = ((SwipeDismissBehavior) this.f95c).f4402a;
                if (c2228mE == null || !c2228mE.m4491f()) {
                    return;
                }
                ((View) this.f94b).postOnAnimation(this);
                return;
        }
    }

    public /* synthetic */ RunnableC0044B0(Object obj, Object obj2, int i, boolean z) {
        this.f93a = i;
        this.f94b = obj;
        this.f95c = obj2;
    }

    public RunnableC0044B0(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.f93a = 7;
        this.f95c = swipeDismissBehavior;
        this.f94b = view;
    }

    public RunnableC0044B0(C0973Wl c0973Wl, C0801Sl c0801Sl, int i) {
        this.f93a = 4;
        this.f95c = c0973Wl;
        this.f94b = c0801Sl;
    }
}
