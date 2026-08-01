package p086r0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.ref.WeakReference;
import p027N0.AbstractC0223g;
import p062e0.InterfaceC0551a;
import p070i0.AbstractC0731a;

/* JADX INFO: renamed from: r0.j */
/* JADX INFO: loaded from: classes.dex */
public final class C0911j implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3217a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC0551a f3218b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0911j(InterfaceC0551a interfaceC0551a, int i2) {
        this.f3217a = i2;
        this.f3218b = interfaceC0551a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.f3217a) {
            case 0:
                AbstractC0223g.m418e(activity, "activity");
                C0914k.m1994a((C0914k) this.f3218b, activity, "created");
                break;
            case 1:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 2:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 3:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 4:
                AbstractC0223g.m418e(activity, "activity");
                C0943t1.m2069c((C0943t1) this.f3218b, activity);
                break;
            case 5:
                AbstractC0223g.m418e(activity, "activity");
                break;
            default:
                AbstractC0223g.m418e(activity, "activity");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.f3217a) {
            case 0:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 1:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 2:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 3:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 4:
                AbstractC0223g.m418e(activity, "activity");
                C0943t1 c0943t1 = (C0943t1) this.f3218b;
                if (c0943t1.m2084H(activity)) {
                    XC_MethodHook.Unhook unhook = c0943t1.f3368f;
                    if (unhook != null) {
                        unhook.unhook();
                    }
                    c0943t1.f3368f = null;
                }
                break;
            case 5:
                AbstractC0223g.m418e(activity, "activity");
                C0822A1 c0822a1 = (C0822A1) this.f3218b;
                WeakReference weakReference = c0822a1.f2740a;
                if ((weakReference != null ? (Activity) weakReference.get() : null) == activity) {
                    c0822a1.f2740a = null;
                }
                break;
            default:
                AbstractC0223g.m418e(activity, "activity");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.f3217a) {
            case 0:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 1:
                AbstractC0223g.m418e(activity, "activity");
                C0956y c0956y = (C0956y) this.f3218b;
                c0956y.getClass();
                if (AbstractC0223g.m414a(activity.getPackageName(), "com.tencent.mm")) {
                    c0956y.f3440c.remove(activity);
                    break;
                }
                break;
            case 2:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 3:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 4:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 5:
                AbstractC0223g.m418e(activity, "activity");
                break;
            default:
                AbstractC0223g.m418e(activity, "activity");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Window window;
        View decorView;
        switch (this.f3217a) {
            case 0:
                AbstractC0223g.m418e(activity, "activity");
                C0914k.m1994a((C0914k) this.f3218b, activity, "resumed");
                break;
            case 1:
                AbstractC0223g.m418e(activity, "activity");
                C0956y c0956y = (C0956y) this.f3218b;
                c0956y.getClass();
                if (AbstractC0223g.m414a(activity.getPackageName(), "com.tencent.mm")) {
                    c0956y.f3442e = false;
                    c0956y.f3440c.add(activity);
                    break;
                }
                break;
            case 2:
                AbstractC0223g.m418e(activity, "activity");
                if (activity.getClass().getName().equals("com.tencent.mm.ui.LauncherUI")) {
                    WeakReference weakReference = new WeakReference(activity);
                    C0842H0 c0842h0 = (C0842H0) this.f3218b;
                    c0842h0.f2860f = weakReference;
                    if (C0842H0.m1648u() == EnumC0960z0.f3452d && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                        decorView.post(new RunnableC0836F0(c0842h0, activity, 1));
                    }
                    if (C0842H0.m1608T0() || C0842H0.m1617Y0()) {
                        c0842h0.m1708x("activity-resumed");
                    }
                    break;
                }
                break;
            case 3:
                AbstractC0223g.m418e(activity, "activity");
                C0919l1 c0919l1 = (C0919l1) this.f3218b;
                c0919l1.getClass();
                if (C0919l1.m1999A(activity)) {
                    C0919l1.m2009d(c0919l1, activity);
                }
                break;
            case 4:
                AbstractC0223g.m418e(activity, "activity");
                C0943t1 c0943t1 = (C0943t1) this.f3218b;
                if (!c0943t1.m2084H(activity)) {
                    C0943t1.m2066a(c0943t1, activity, "callback-resumed");
                } else {
                    c0943t1.m2101t(activity);
                }
                break;
            case 5:
                AbstractC0223g.m418e(activity, "activity");
                if (activity.getClass().getName().equals("com.tencent.mm.ui.LauncherUI")) {
                    ((C0822A1) this.f3218b).f2740a = new WeakReference(activity);
                    AbstractC0731a.m1384a("search command launcher resumed", activity.getClass().getName());
                }
                break;
            default:
                AbstractC0223g.m418e(activity, "activity");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.f3217a) {
            case 0:
                AbstractC0223g.m418e(activity, "activity");
                AbstractC0223g.m418e(bundle, "outState");
                break;
            case 1:
                AbstractC0223g.m418e(activity, "activity");
                AbstractC0223g.m418e(bundle, "outState");
                break;
            case 2:
                AbstractC0223g.m418e(activity, "activity");
                AbstractC0223g.m418e(bundle, "outState");
                break;
            case 3:
                AbstractC0223g.m418e(activity, "activity");
                AbstractC0223g.m418e(bundle, "outState");
                break;
            case 4:
                AbstractC0223g.m418e(activity, "activity");
                AbstractC0223g.m418e(bundle, "outState");
                break;
            case 5:
                AbstractC0223g.m418e(activity, "activity");
                AbstractC0223g.m418e(bundle, "outState");
                break;
            default:
                AbstractC0223g.m418e(activity, "activity");
                AbstractC0223g.m418e(bundle, "outState");
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        switch (this.f3217a) {
            case 0:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 1:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 2:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 3:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 4:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 5:
                AbstractC0223g.m418e(activity, "activity");
                break;
            default:
                AbstractC0223g.m418e(activity, "activity");
                C0858M1 c0858m1 = (C0858M1) this.f3218b;
                c0858m1.getClass();
                if (AbstractC0223g.m414a(activity.getPackageName(), "com.tencent.mm")) {
                    c0858m1.f2952e++;
                    break;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        C0950w c0950w;
        switch (this.f3217a) {
            case 0:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 1:
                AbstractC0223g.m418e(activity, "activity");
                C0956y c0956y = (C0956y) this.f3218b;
                c0956y.getClass();
                if (AbstractC0223g.m414a(activity.getPackageName(), "com.tencent.mm") && !c0956y.f3442e && c0956y.f3440c.isEmpty() && (c0950w = c0956y.f3441d) != null) {
                    c0950w.m2125j("background");
                }
                break;
            case 2:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 3:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 4:
                AbstractC0223g.m418e(activity, "activity");
                break;
            case 5:
                AbstractC0223g.m418e(activity, "activity");
                break;
            default:
                AbstractC0223g.m418e(activity, "activity");
                C0858M1 c0858m1 = (C0858M1) this.f3218b;
                c0858m1.getClass();
                if (AbstractC0223g.m414a(activity.getPackageName(), "com.tencent.mm")) {
                    int i2 = c0858m1.f2952e;
                    if (i2 > 0) {
                        c0858m1.f2952e = i2 - 1;
                    }
                    if (c0858m1.f2952e == 0) {
                        C0858M1.m1758d(activity);
                    }
                    break;
                }
                break;
        }
    }
}
