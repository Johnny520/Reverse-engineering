package io.sentry;

import android.app.Activity;
import io.sentry.android.core.ActivityLifecycleIntegration;
import io.sentry.android.core.C1687c;
import io.sentry.android.core.C1692e;
import io.sentry.android.core.RunnableC1685b;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.gestures.GestureDetectorOnGestureListenerC1707f;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.InterfaceC1883a;
import io.sentry.protocol.C1960j;
import io.sentry.protocol.C1964n;
import io.sentry.protocol.C1970t;
import io.sentry.util.C2029a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import p000.C0252Fu;

/* JADX INFO: renamed from: io.sentry.D1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1572D1 implements InterfaceC1936o1, InterfaceC1593I2, InterfaceC1940p1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5625a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5626b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5627c;

    public /* synthetic */ C1572D1(Object obj, Object obj2, Object obj3) {
        this.f5625a = obj;
        this.f5626b = obj2;
        this.f5627c = obj3;
    }

    @Override // io.sentry.InterfaceC1936o1
    /* JADX INFO: renamed from: a */
    public void mo3613a(C1581F2 c1581f2) {
        ConcurrentHashMap concurrentHashMap;
        C1580F1 c1580f1 = (C1580F1) this.f5625a;
        C1627R1 c1627r1 = (C1627R1) this.f5626b;
        C1586H c1586h = (C1586H) this.f5627c;
        if (c1581f2 == null) {
            c1580f1.f5692b.getLogger().mo3680e(EnumC1657a2.INFO, "Session is null on scope.withSession", new Object[0]);
            return;
        }
        String strMo3925e = null;
        EnumC1577E2 enumC1577E2 = c1627r1.m3738c() != null ? EnumC1577E2.Crashed : null;
        boolean z = EnumC1577E2.Crashed == enumC1577E2 || c1627r1.m3739d();
        C1964n c1964n = c1627r1.f5607d;
        String str = (c1964n == null || (concurrentHashMap = c1964n.f6981f) == null || !concurrentHashMap.containsKey("user-agent")) ? null : (String) c1627r1.f5607d.f6981f.get("user-agent");
        Object objM4072s = AbstractC1856a.m4072s(c1586h);
        if (objM4072s instanceof InterfaceC1883a) {
            strMo3925e = ((InterfaceC1883a) objM4072s).mo3925e();
            enumC1577E2 = EnumC1577E2.Abnormal;
        }
        if (!c1581f2.m3664c(enumC1577E2, str, z, strMo3925e) || c1581f2.f5702g == EnumC1577E2.Ok) {
            return;
        }
        c1581f2.m3663b(AbstractC1856a.m4067m());
    }

    @Override // io.sentry.InterfaceC1940p1
    /* JADX INFO: renamed from: c */
    public void mo1425c(InterfaceC1895i0 interfaceC1895i0) {
        GestureDetectorOnGestureListenerC1707f gestureDetectorOnGestureListenerC1707f = (GestureDetectorOnGestureListenerC1707f) this.f5625a;
        InterfaceC1645X interfaceC1645X = (InterfaceC1645X) this.f5626b;
        InterfaceC1895i0 interfaceC1895i02 = (InterfaceC1895i0) this.f5627c;
        if (interfaceC1895i0 == null) {
            interfaceC1645X.mo3779w(interfaceC1895i02);
        } else {
            gestureDetectorOnGestureListenerC1707f.f6173c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC1895i02.getName());
        }
    }

    @Override // io.sentry.InterfaceC1593I2
    /* JADX INFO: renamed from: d */
    public void mo3614d(C1585G2 c1585g2) {
        C1687c c1687cM529c;
        C1573D2 c1573d2 = (C1573D2) this.f5625a;
        InterfaceC1593I2 interfaceC1593I2 = (InterfaceC1593I2) this.f5626b;
        AtomicReference atomicReference = (AtomicReference) this.f5627c;
        if (interfaceC1593I2 != null) {
            interfaceC1593I2.mo3614d(c1585g2);
        }
        C1692e c1692e = c1573d2.f5645r.f5843i;
        if (c1692e != null) {
            ActivityLifecycleIntegration activityLifecycleIntegration = c1692e.f6100a;
            WeakReference weakReference = (WeakReference) c1692e.f6101b;
            String str = (String) c1692e.f6102c;
            Activity activity = (Activity) weakReference.get();
            if (activity != null) {
                C0252Fu c0252Fu = activityLifecycleIntegration.f5933q;
                C1970t c1970t = c1573d2.f5628a;
                C1981r c1981rM4173a = ((C2029a) c0252Fu.f824f).m4173a();
                try {
                    if (c0252Fu.m531h()) {
                        C1687c c1687c = null;
                        c0252Fu.m532i(new RunnableC1685b(c0252Fu, activity, 1), null);
                        C1687c c1687c2 = (C1687c) ((WeakHashMap) c0252Fu.f822d).remove(activity);
                        if (c1687c2 != null && (c1687cM529c = c0252Fu.m529c()) != null) {
                            c1687c = new C1687c(c1687cM529c.f6091a - c1687c2.f6091a, c1687cM529c.f6092b - c1687c2.f6092b, c1687cM529c.f6093c - c1687c2.f6093c);
                        }
                        if (c1687c != null) {
                            int i = c1687c.f6093c;
                            int i2 = c1687c.f6092b;
                            int i3 = c1687c.f6091a;
                            if (i3 != 0 || i2 != 0 || i != 0) {
                                C1960j c1960j = new C1960j(Integer.valueOf(i3), "none");
                                C1960j c1960j2 = new C1960j(Integer.valueOf(i2), "none");
                                C1960j c1960j3 = new C1960j(Integer.valueOf(i), "none");
                                HashMap map = new HashMap();
                                map.put("frames_total", c1960j);
                                map.put("frames_slow", c1960j2);
                                map.put("frames_frozen", c1960j3);
                                ((ConcurrentHashMap) c0252Fu.f821c).put(c1970t, map);
                            }
                        }
                    }
                    c1981rM4173a.close();
                } catch (Throwable th) {
                    try {
                        c1981rM4173a.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.f5920d;
                if (sentryAndroidOptions != null) {
                    sentryAndroidOptions.getLogger().mo3680e(EnumC1657a2.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
                }
            }
        }
        InterfaceC1925m interfaceC1925m = c1573d2.f5644q;
        if (interfaceC1925m != null) {
            atomicReference.set(interfaceC1925m.mo3678e(c1573d2));
        }
    }
}
