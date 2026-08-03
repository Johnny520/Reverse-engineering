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

    public /* synthetic */ C1572D1(Object r1, Object r2, Object r3) {
        this.f5625a = r1;
        this.f5626b = r2;
        this.f5627c = r3;
    }

    @Override // io.sentry.InterfaceC1936o1
    /* JADX INFO: renamed from: a */
    public void mo3613a(C1581F2 r8) {
        C1580F1 r0 = (C1580F1) this.f5625a;
        C1627R1 r1 = (C1627R1) this.f5626b;
        C1586H r2 = (C1586H) this.f5627c;
        boolean r3 = false;
        if (r8 == null) goto L30;
        String r4 = null;
        if (r1.m3738c() == null) goto L7;
        EnumC1577E2 r02 = EnumC1577E2.Crashed;
    L9:
        if (EnumC1577E2.Crashed != r02) goto L11;
    L12:
        r3 = true;
    L13:
        C1964n r5 = r1.f5607d;
        if (r5 == null) goto L20;
        ConcurrentHashMap r52 = r5.f6981f;
        if (r52 == null) goto L20;
        if (r52.containsKey("user-agent") == false) goto L20;
        String r12 = (String) r1.f5607d.f6981f.get("user-agent");
    L21:
        Object r22 = AbstractC1856a.m4072s(r2);
        if ((r22 instanceof InterfaceC1883a) == false) goto L25;
        r4 = ((InterfaceC1883a) r22).mo3925e();
        r02 = EnumC1577E2.Abnormal;
    L25:
        if (r8.m3664c(r02, r12, r3, r4) == true) goto L27;
        return;
    L27:
        if (r8.f5702g == EnumC1577E2.f5688Ok) goto L33;
        r8.m3663b(AbstractC1856a.m4067m());
        return;
    L33:
        return;
    L20:
        r12 = null;
        goto L21
    L11:
        if (r1.m3739d() == false) goto L13;
    L7:
        r02 = null;
        goto L9
    L30:
        r0.f5692b.getLogger().mo3680e(EnumC1657a2.INFO, "Session is null on scope.withSession", new Object[0]);
    }

    @Override // io.sentry.InterfaceC1940p1
    /* JADX INFO: renamed from: c */
    public void mo1425c(InterfaceC1895i0 r4) {
        GestureDetectorOnGestureListenerC1707f r0 = (GestureDetectorOnGestureListenerC1707f) this.f5625a;
        InterfaceC1645X r1 = (InterfaceC1645X) this.f5626b;
        InterfaceC1895i0 r2 = (InterfaceC1895i0) this.f5627c;
        if (r4 != null) goto L6;
        r1.mo3779w(r2);
        return;
    L6:
        r0.f6173c.getLogger().mo3680e(EnumC1657a2.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", new Object[]{r2.getName()});
    }

    @Override // io.sentry.InterfaceC1593I2
    /* JADX INFO: renamed from: d */
    public void mo3614d(C1585G2 r11) {
        C1573D2 r0 = (C1573D2) this.f5625a;
        InterfaceC1593I2 r1 = (InterfaceC1593I2) this.f5626b;
        AtomicReference r2 = (AtomicReference) this.f5627c;
        if (r1 == null) goto L5;
        r1.mo3614d(r11);
    L5:
        C1692e r112 = r0.f5645r.f5843i;
        if (r112 == null) goto L37;
        ActivityLifecycleIntegration r12 = r112.f6100a;
        WeakReference r3 = (WeakReference) r112.f6101b;
        String r113 = (String) r112.f6102c;
        Activity r32 = (Activity) r3.get();
        if (r32 == null) goto L34;
        C0252Fu r114 = r12.f5933q;
        C1970t r13 = r0.f5628a;
        C1981r r5 = ((C2029a) r114.f824f).m4173a();
    L28:
        th = move-exception;
        r5.close();     // Catch: Throwable -> L31
    L33:
        throw th;
    L31:
        th = move-exception;
        th.addSuppressed(th);
        goto L33
    L11:
        if (r114.m531h() == true) goto L13;
    L12:
        r5.close();
        goto L37
    L13:
        C1687c r7 = null;
        r114.m532i(new RunnableC1685b(r114, r32, 1), null);     // Catch: Throwable -> L28
        C1687c r33 = (C1687c) ((WeakHashMap) r114.f822d).remove(r32);     // Catch: Throwable -> L28
        if (r33 == null) goto L20;
        C1687c r6 = r114.m529c();     // Catch: Throwable -> L28
        if (r6 == null) goto L20;
        r7 = new C1687c(r6.f6091a - r33.f6091a, r6.f6092b - r33.f6092b, r6.f6093c - r33.f6093c);     // Catch: Throwable -> L28
    L20:
        if (r7 == null) goto L12;
        int r34 = r7.f6093c;     // Catch: Throwable -> L28
        int r62 = r7.f6092b;     // Catch: Throwable -> L28
        int r72 = r7.f6091a;     // Catch: Throwable -> L28
        if (r72 != 0) goto L26;
        if (r62 != 0) goto L26;
        if (r34 == 0) goto L12;
    L26:
        C1960j r8 = new C1960j(Integer.valueOf(r72), "none");     // Catch: Throwable -> L28
        C1960j r73 = new C1960j(Integer.valueOf(r62), "none");     // Catch: Throwable -> L28
        C1960j r63 = new C1960j(Integer.valueOf(r34), "none");     // Catch: Throwable -> L28
        HashMap r35 = new HashMap();     // Catch: Throwable -> L28
        r35.put("frames_total", r8);     // Catch: Throwable -> L28
        r35.put("frames_slow", r73);     // Catch: Throwable -> L28
        r35.put("frames_frozen", r63);     // Catch: Throwable -> L28
        ((ConcurrentHashMap) r114.f821c).put(r13, r35);     // Catch: Throwable -> L28
        goto L12
    L34:
        SentryAndroidOptions r14 = r12.f5920d;
        if (r14 == null) goto L37;
        r14.getLogger().mo3680e(EnumC1657a2.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", new Object[]{r113});
    L37:
        InterfaceC1925m r115 = r0.f5644q;
        if (r115 == null) goto L45;
        r2.set(r115.mo3678e(r0));
        return;
    }
}
