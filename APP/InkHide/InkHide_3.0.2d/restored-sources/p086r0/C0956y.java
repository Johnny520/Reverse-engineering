package p086r0;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import p003B0.AbstractC0055a;
import p040U0.AbstractC0307q;
import p054c0.AbstractC0514f;
import p061e.C0542r;
import p062e0.InterfaceC0551a;

/* JADX INFO: renamed from: r0.y */
/* JADX INFO: loaded from: classes.dex */
public final class C0956y implements InterfaceC0551a {

    /* JADX INFO: renamed from: a */
    public boolean f3438a;

    /* JADX INFO: renamed from: b */
    public boolean f3439b;

    /* JADX INFO: renamed from: c */
    public final Set f3440c = Collections.newSetFromMap(new IdentityHashMap());

    /* JADX INFO: renamed from: d */
    public C0950w f3441d;

    /* JADX INFO: renamed from: e */
    public boolean f3442e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final void m2135a(String str) {
        WeakReference weakReference;
        final Object obj;
        final View viewM2120d;
        final C0950w c0950w = this.f3441d;
        if (c0950w == null || (weakReference = c0950w.f3416f) == null || (obj = weakReference.get()) == null) {
            return;
        }
        String strM2113e = C0950w.m2113e(obj);
        if (strM2113e == null && (strM2113e = c0950w.f3417g) == null) {
            return;
        }
        if ((str == null || AbstractC0307q.m534d0(str) || strM2113e.equals(str)) && (viewM2120d = c0950w.m2120d(obj)) != null) {
            final int i2 = 0;
            viewM2120d.post(new Runnable() { // from class: r0.u
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i2) {
                        case 0:
                            c0950w.m2126m(viewM2120d, obj);
                            break;
                        default:
                            c0950w.m2126m(viewM2120d, obj);
                            break;
                    }
                }
            });
            final int i3 = 1;
            viewM2120d.postDelayed(new Runnable() { // from class: r0.u
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            c0950w.m2126m(viewM2120d, obj);
                            break;
                        default:
                            c0950w.m2126m(viewM2120d, obj);
                            break;
                    }
                }
            }, 120L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p062e0.InterfaceC0551a
    public final void handleHook(Context context, XC_LoadPackage.LoadPackageParam loadPackageParam) {
        C0950w c0950w = new C0950w(context);
        this.f3441d = c0950w;
        if (!this.f3438a) {
            context.registerReceiver(new C0542r(1, this), new IntentFilter("android.intent.action.SCREEN_OFF"));
            this.f3438a = true;
        }
        if (!this.f3439b) {
            Context applicationContext = context.getApplicationContext();
            Application application = applicationContext instanceof Application ? (Application) applicationContext : null;
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new C0911j(this, 1));
                this.f3439b = true;
            } else {
                Application application2 = context instanceof Application ? (Application) context : null;
                if (application2 != null) {
                    application = application2;
                    application.registerActivityLifecycleCallbacks(new C0911j(this, 1));
                    this.f3439b = true;
                }
            }
        }
        AbstractC0514f.m1025b(AbstractC0055a.m102c("com.tencent.mm.ui.chatting.ChattingUIProxy"), "onEnterBegin", new C0953x(c0950w, 0));
        AbstractC0514f.m1025b(AbstractC0055a.m102c("com.tencent.mm.ui.chatting.BaseChattingUIFragment"), "onActivityCreated", Bundle.class, new C0953x(c0950w, 1));
        AbstractC0514f.m1025b(AbstractC0055a.m102c("com.tencent.mm.ui.chatting.BaseChattingUIFragment"), "onResume", new C0953x(c0950w, 2));
        AbstractC0514f.m1025b(AbstractC0055a.m102c("com.tencent.mm.ui.chatting.BaseChattingUIFragment"), "onPause", new C0953x(c0950w, 3));
        AbstractC0514f.m1025b(AbstractC0055a.m102c("com.tencent.mm.ui.chatting.BaseChattingUIFragment"), "onDestroy", new C0953x(c0950w, 4));
    }
}
