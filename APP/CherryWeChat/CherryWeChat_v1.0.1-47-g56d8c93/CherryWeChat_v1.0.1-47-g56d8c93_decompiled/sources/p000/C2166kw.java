package p000;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.ComponentCallbacks2C1273a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: kw */
/* JADX INFO: loaded from: classes.dex */
public final class C2166kw implements Handler.Callback {

    /* JADX INFO: renamed from: e */
    public static final C1517hw f7546e = new C1517hw(0);

    /* JADX INFO: renamed from: a */
    public volatile ComponentCallbacks2C1473gw f7547a;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0627Oi f7549c;

    /* JADX INFO: renamed from: b */
    public final C0521M4 f7548b = new C0521M4(0);

    /* JADX INFO: renamed from: d */
    public final C0649P3 f7550d = new C0649P3(f7546e);

    public C2166kw() {
        this.f7549c = (C2377pk.f8363f && C2377pk.f8362e) ? new C2761yh() : new C2220m6(13);
    }

    /* JADX INFO: renamed from: a */
    public static Activity m4364a(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m4364a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static void m4365b(List list, C0521M4 c0521m4) {
        Object obj;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC1503hi abstractComponentCallbacksC1503hi = (AbstractComponentCallbacksC1503hi) it.next();
            if (abstractComponentCallbacksC1503hi != null && (obj = abstractComponentCallbacksC1503hi.f5296E) != null) {
                c0521m4.put(obj, abstractComponentCallbacksC1503hi);
                m4365b(abstractComponentCallbacksC1503hi.m2869c().f9494c.m4882t(), c0521m4);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final ComponentCallbacks2C1473gw m4366c(AbstractActivityC2148ki abstractActivityC2148ki) {
        char[] cArr = AbstractC2622vD.f9104a;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return m4367d(abstractActivityC2148ki.getApplicationContext());
        }
        if (abstractActivityC2148ki.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
        this.f7549c.mo1221a(abstractActivityC2148ki);
        Activity activityM4364a = m4364a(abstractActivityC2148ki);
        return this.f7550d.m1275E(abstractActivityC2148ki, ComponentCallbacks2C1273a.m2412a(abstractActivityC2148ki.getApplicationContext()), abstractActivityC2148ki.getLifecycle(), abstractActivityC2148ki.getSupportFragmentManager(), activityM4364a == null || !activityM4364a.isFinishing());
    }

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C1473gw m4367d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        char[] cArr = AbstractC2622vD.f9104a;
        if (Looper.myLooper() == Looper.getMainLooper() && !(context instanceof Application)) {
            if (context instanceof AbstractActivityC2148ki) {
                return m4366c((AbstractActivityC2148ki) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return m4367d(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f7547a == null) {
            synchronized (this) {
                try {
                    if (this.f7547a == null) {
                        this.f7547a = new ComponentCallbacks2C1473gw(ComponentCallbacks2C1273a.m2412a(context.getApplicationContext()), new C1456gf(22), new C2220m6(20), context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return this.f7547a;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        return false;
    }
}
