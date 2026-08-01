package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC0668k;
import androidx.lifecycle.FragmentC0690z;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: androidx.lifecycle.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0688x implements InterfaceC0676o {

    /* JADX INFO: renamed from: y */
    public static final b f2008y = new b(null);

    /* JADX INFO: renamed from: z */
    public static final C0688x f2009z = new C0688x();

    /* JADX INFO: renamed from: q */
    public int f2010q;

    /* JADX INFO: renamed from: r */
    public int f2011r;

    /* JADX INFO: renamed from: u */
    public Handler f2014u;

    /* JADX INFO: renamed from: s */
    public boolean f2012s = true;

    /* JADX INFO: renamed from: t */
    public boolean f2013t = true;

    /* JADX INFO: renamed from: v */
    public final C0680q f2015v = new C0680q(this);

    /* JADX INFO: renamed from: w */
    public final Runnable f2016w = new Runnable() { // from class: androidx.lifecycle.w
        @Override // java.lang.Runnable
        public final void run() {
            C0688x.m2689a(this.f2007q);
        }
    };

    /* JADX INFO: renamed from: x */
    public final FragmentC0690z.a f2017x = new d();

    /* JADX INFO: renamed from: androidx.lifecycle.x$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f2018a = new a();

        /* JADX INFO: renamed from: a */
        public static final void m2699a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            activity.getClass();
            activityLifecycleCallbacks.getClass();
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC0660g {

        /* JADX INFO: renamed from: androidx.lifecycle.x$c$a */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class a extends AbstractC0660g {
            final /* synthetic */ C0688x this$0;

            public a(C0688x c0688x) {
                this.this$0 = c0688x;
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                activity.getClass();
                this.this$0.m2693e();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                activity.getClass();
                this.this$0.m2694f();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.AbstractC0660g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            if (Build.VERSION.SDK_INT < 29) {
                FragmentC0690z.INSTANCE.m2712b(activity).m2710f(C0688x.this.f2017x);
            }
        }

        @Override // androidx.lifecycle.AbstractC0660g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            activity.getClass();
            C0688x.this.m2692d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.getClass();
            a.m2699a(activity, new a(C0688x.this));
        }

        @Override // androidx.lifecycle.AbstractC0660g, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            activity.getClass();
            C0688x.this.m2695g();
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2689a(C0688x c0688x) {
        c0688x.m2697i();
        c0688x.m2698j();
    }

    /* JADX INFO: renamed from: d */
    public final void m2692d() {
        int i10 = this.f2011r - 1;
        this.f2011r = i10;
        if (i10 == 0) {
            Handler handler = this.f2014u;
            handler.getClass();
            handler.postDelayed(this.f2016w, 700L);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2693e() {
        int i10 = this.f2011r + 1;
        this.f2011r = i10;
        if (i10 == 1) {
            if (this.f2012s) {
                this.f2015v.m2667h(AbstractC0668k.a.ON_RESUME);
                this.f2012s = false;
            } else {
                Handler handler = this.f2014u;
                handler.getClass();
                handler.removeCallbacks(this.f2016w);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2694f() {
        int i10 = this.f2010q + 1;
        this.f2010q = i10;
        if (i10 == 1 && this.f2013t) {
            this.f2015v.m2667h(AbstractC0668k.a.ON_START);
            this.f2013t = false;
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m2695g() {
        this.f2010q--;
        m2698j();
    }

    @Override // androidx.lifecycle.InterfaceC0676o
    public AbstractC0668k getLifecycle() {
        return this.f2015v;
    }

    /* JADX INFO: renamed from: h */
    public final void m2696h(Context context) {
        context.getClass();
        this.f2014u = new Handler();
        this.f2015v.m2667h(AbstractC0668k.a.ON_CREATE);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        ((Application) applicationContext).registerActivityLifecycleCallbacks(new c());
    }

    /* JADX INFO: renamed from: i */
    public final void m2697i() {
        if (this.f2011r == 0) {
            this.f2012s = true;
            this.f2015v.m2667h(AbstractC0668k.a.ON_PAUSE);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2698j() {
        if (this.f2010q == 0 && this.f2012s) {
            this.f2015v.m2667h(AbstractC0668k.a.ON_STOP);
            this.f2013t = true;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {
        public /* synthetic */ b(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC0676o m2700a() {
            return C0688x.f2009z;
        }

        /* JADX INFO: renamed from: b */
        public final void m2701b(Context context) {
            context.getClass();
            C0688x.f2009z.m2696h(context);
        }

        public b() {
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.x$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d implements FragmentC0690z.a {
        public d() {
        }

        @Override // androidx.lifecycle.FragmentC0690z.a
        /* JADX INFO: renamed from: b */
        public void mo2703b() {
            C0688x.this.m2693e();
        }

        @Override // androidx.lifecycle.FragmentC0690z.a
        /* JADX INFO: renamed from: c */
        public void mo2704c() {
            C0688x.this.m2694f();
        }

        @Override // androidx.lifecycle.FragmentC0690z.a
        /* JADX INFO: renamed from: a */
        public void mo2702a() {
        }
    }
}
