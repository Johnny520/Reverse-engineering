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
    public static final C1517hw f7546e = null;

    /* JADX INFO: renamed from: a */
    public volatile ComponentCallbacks2C1473gw f7547a;

    /* JADX INFO: renamed from: b */
    public final C0521M4 f7548b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC0627Oi f7549c;

    /* JADX INFO: renamed from: d */
    public final C0649P3 f7550d;

    static {
        f7546e = new C1517hw(0);
    }

    public C2166kw() {
        this.f7548b = new C0521M4(0);
        this.f7550d = new C0649P3(f7546e);
        if (C2377pk.f8363f == true) goto L5;
    L8:
        InterfaceC0627Oi r0 = new C2220m6(13);
    L9:
        this.f7549c = r0;
        return;
    L5:
        if (C2377pk.f8362e == false) goto L8;
        r0 = new C2761yh();
        goto L9
    }

    /* JADX INFO: renamed from: a */
    public static Activity m4364a(Context r1) {
        if ((r1 instanceof Activity) == false) goto L7;
        return (Activity) r1;
    L7:
        if ((r1 instanceof ContextWrapper) == true) goto L9;
        return null;
    L9:
        return m4364a(((ContextWrapper) r1).getBaseContext());
    }

    /* JADX INFO: renamed from: b */
    public static void m4365b(List r2, C0521M4 r3) {
        if (r2 == null) goto L13;
        Iterator r22 = r2.iterator();
    L6:
        if (r22.hasNext() == false) goto L21;
        AbstractComponentCallbacksC1503hi r0 = (AbstractComponentCallbacksC1503hi) r22.next();
        if (r0 == null) goto L6;
        Object r1 = r0.f5296E;
        if (r1 == null) goto L6;
        r3.put(r1, r0);
        m4365b(r0.m2869c().f9494c.m4882t(), r3);
        goto L6
    L21:
        return;
    }

    /* JADX INFO: renamed from: c */
    public final ComponentCallbacks2C1473gw m4366c(AbstractActivityC2148ki r11) {
        char[] r0 = AbstractC2622vD.f9104a;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L5;
        boolean r02 = true;
    L6:
        if (r02 == true) goto L10;
        return m4367d(r11.getApplicationContext());
    L10:
        if (r11.isDestroyed() == true) goto L21;
        this.f7549c.mo1221a(r11);
        Activity r03 = m4364a(r11);
        if (r03 != null) goto L14;
    L17:
        boolean r9 = true;
    L19:
        return this.f7550d.m1275E(r11, ComponentCallbacks2C1273a.m2412a(r11.getApplicationContext()), r11.getLifecycle(), r11.getSupportFragmentManager(), r9);
    L14:
        if (r03.isFinishing() == false) goto L17;
        r9 = false;
        goto L19
    L21:
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    L5:
        r02 = false;
        goto L6
    }

    /* JADX INFO: renamed from: d */
    public final ComponentCallbacks2C1473gw m4367d(Context r5) {
        if (r5 == null) goto L32;
        char[] r0 = AbstractC2622vD.f9104a;
        if (Looper.myLooper() != Looper.getMainLooper()) goto L18;
        if ((r5 instanceof Application) == true) goto L18;
        if ((r5 instanceof AbstractActivityC2148ki) == false) goto L12;
        return m4366c((AbstractActivityC2148ki) r5);
    L12:
        if ((r5 instanceof ContextWrapper) == false) goto L18;
        ContextWrapper r02 = (ContextWrapper) r5;
        if (r02.getBaseContext().getApplicationContext() == null) goto L18;
        return m4367d(r02.getBaseContext());
    L18:
        if (this.f7547a != null) goto L30;
        monitor-enter(this);
    L23:
        th = move-exception;
        throw th;
    L21:
        if (this.f7547a != null) goto L25;
        this.f7547a = new ComponentCallbacks2C1473gw(ComponentCallbacks2C1273a.m2412a(r5.getApplicationContext()), new C1456gf(22), new C2220m6(20), r5.getApplicationContext());     // Catch: Throwable -> L23
    L25:
        monitor-exit(this);     // Catch: Throwable -> L23
    L30:
        return this.f7547a;
    L32:
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r1) {
        return false;
    }
}
