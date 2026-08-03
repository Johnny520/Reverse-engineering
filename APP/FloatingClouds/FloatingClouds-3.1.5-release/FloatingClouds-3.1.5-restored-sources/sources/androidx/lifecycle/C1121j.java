package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Handler;
import androidx.lifecycle.AbstractC1116e;
import p000a.C0631i9;
import p000a.InterfaceC0935y9;
import p000a.RunnableC0221M2;

/* JADX INFO: renamed from: androidx.lifecycle.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1121j implements InterfaceC0935y9 {

    /* JADX INFO: renamed from: i */
    public static final C1121j f4689i = new C1121j();

    /* JADX INFO: renamed from: a */
    public int f4690a;

    /* JADX INFO: renamed from: b */
    public int f4691b;

    /* JADX INFO: renamed from: e */
    public Handler f4694e;

    /* JADX INFO: renamed from: c */
    public boolean f4692c = true;

    /* JADX INFO: renamed from: d */
    public boolean f4693d = true;

    /* JADX INFO: renamed from: f */
    public final C1119h f4695f = new C1119h(this);

    /* JADX INFO: renamed from: g */
    public final RunnableC0221M2 f4696g = new RunnableC0221M2(13, this);

    /* JADX INFO: renamed from: h */
    public final b f4697h = new b();

    /* JADX INFO: renamed from: androidx.lifecycle.j$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static final void m2604a(Activity activity, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
            C0631i9.m1482e(activity, "activity");
            C0631i9.m1482e(activityLifecycleCallbacks, "callback");
            activity.registerActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.j$b */
    public static final class b {
        public b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m2603a() {
        int i = this.f4691b + 1;
        this.f4691b = i;
        if (i == 1) {
            if (this.f4692c) {
                this.f4695f.m2598f(AbstractC1116e.a.ON_RESUME);
                this.f4692c = false;
            } else {
                Handler handler = this.f4694e;
                C0631i9.m1479b(handler);
                handler.removeCallbacks(this.f4696g);
            }
        }
    }

    @Override // p000a.InterfaceC0935y9
    public final AbstractC1116e getLifecycle() {
        return this.f4695f;
    }
}
