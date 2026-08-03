package p000;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.SystemClock;
import io.sentry.C1981r;
import io.sentry.EnumC1606M;
import io.sentry.EnumC1657a2;
import io.sentry.InterfaceC1610N;
import io.sentry.android.core.internal.util.C1714b;
import java.util.Iterator;

/* JADX INFO: renamed from: vy */
/* JADX INFO: loaded from: classes.dex */
public final class C2649vy extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9167a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f9168b;

    public /* synthetic */ C2649vy(int r1, Object r2) {
        this.f9167a = r1;
        this.f9168b = r2;
    }

    /* JADX INFO: renamed from: a */
    public void m5183a() {
        ((C1714b) this.f9168b).f6221k.set(false);
        C1981r r0 = ((C1714b) this.f9168b).f6216f.m4173a();
        ((C1714b) this.f9168b).f6218h = null;     // Catch: Throwable -> L8
        ((C1714b) this.f9168b).f6219i = null;     // Catch: Throwable -> L8
        C1714b r2 = (C1714b) this.f9168b;     // Catch: Throwable -> L8
        r2.f6214d.getClass();     // Catch: Throwable -> L8
        r2.f6220j = SystemClock.uptimeMillis();     // Catch: Throwable -> L8
        ((C1714b) this.f9168b).f6212b.getLogger().mo3680e(EnumC1657a2.DEBUG, "Cache cleared - network lost/unavailable", new Object[0]);     // Catch: Throwable -> L8
        Iterator r1 = ((C1714b) this.f9168b).f6215e.iterator();     // Catch: Throwable -> L8
    L4:
        if (r1.hasNext() == false) goto L10;
        ((InterfaceC1610N) r1.next()).mo3725i(EnumC1606M.DISCONNECTED);     // Catch: Throwable -> L8
        goto L4
    L10:
        r0.close();
        return;
    L8:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L14
    L16:
        throw th;
    L14:
        th = move-exception;
        th.addSuppressed(th);
        goto L16
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network r4) {
        switch(this.f9167a) {
            case 0: goto L21;
            default: goto L4;
        };
    L4:
        ((C1714b) this.f9168b).f6219i = r4;
        if (((C1714b) this.f9168b).f6221k.getAndSet(true) == true) goto L20;
        C1981r r0 = C1714b.f6207n.m4173a();
        Iterator r1 = C1714b.f6208o.iterator();     // Catch: Throwable -> L12
    L8:
        if (r1.hasNext() == false) goto L14;
        ((ConnectivityManager.NetworkCallback) r1.next()).onAvailable(r4);     // Catch: Throwable -> L12
        goto L8
    L14:
        r0.close();
        return;
    L12:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
    L20:
        return;
    L21:
        RunnableC0778S4 r42 = new RunnableC0778S4(this, true);
        AbstractC2622vD.m5135f().post(r42);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network r8, NetworkCapabilities r9) {
        switch(this.f9167a) {
            case 1: goto L7;
            default: goto L4;
        };
    L4:
        super.onCapabilitiesChanged(r8, r9);
        return;
    L7:
        if (r8.equals(((C1714b) this.f9168b).f6219i) == false) goto L79;
        NetworkCapabilities r0 = ((C1714b) this.f9168b).f6218h;
        int r1 = 0;
        boolean r2 = true;
        if (r0 != null) goto L12;
        boolean r3 = true;
    L13:
        if (r9 == null) goto L16;
        r2 = false;
    L16:
        if (r3 != r2) goto L33;
        if (r0 != null) goto L21;
        if (r9 != null) goto L21;
    L48:
        C1981r r02 = C1714b.f6207n.m4173a();
        Iterator r12 = C1714b.f6208o.iterator();     // Catch: Throwable -> L54
    L50:
        if (r12.hasNext() == false) goto L56;
        ((ConnectivityManager.NetworkCallback) r12.next()).onCapabilitiesChanged(r8, r9);     // Catch: Throwable -> L54
        goto L50
    L56:
        r02.close();
        return;
    L54:
        th = move-exception;
        r02.close();     // Catch: Throwable -> L60
    L62:
        throw th;
    L60:
        th = move-exception;
        th.addSuppressed(th);
    L21:
        int[] r22 = C1714b.f6210q;
        int r32 = r22.length;
        int r4 = 0;
    L22:
        if (r4 >= r32) goto L29;
        int r5 = r22[r4];
        if (r5 == 0) goto L28;
        if (r0.hasCapability(r5) != r9.hasCapability(r5)) goto L33;
    L28:
        r4 = r4 + 1;
        goto L22
    L29:
        int[] r23 = C1714b.f6209p;
        int r33 = r23.length;
    L30:
        if (r1 >= r33) goto L48;
        int r42 = r23[r1];
        if (r0.hasTransport(r42) != r9.hasTransport(r42)) goto L33;
        r1 = r1 + 1;
    L33:
        ((C1714b) this.f9168b).m3898t(r9);
        EnumC1606M r03 = ((C1714b) this.f9168b).m3894m();
        C1981r r13 = ((C1714b) this.f9168b).f6216f.m4173a();
        Iterator r24 = ((C1714b) this.f9168b).f6215e.iterator();     // Catch: Throwable -> L39
    L35:
        if (r24.hasNext() == false) goto L41;
        ((InterfaceC1610N) r24.next()).mo3725i(r03);     // Catch: Throwable -> L39
        goto L35
    L41:
        r13.close();
    L39:
        th = move-exception;
        r13.close();     // Catch: Throwable -> L44
    L46:
        throw th;
    L44:
        th = move-exception;
        th.addSuppressed(th);
        goto L46
    L12:
        r3 = false;
        goto L13
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network r4) {
        switch(this.f9167a) {
            case 0: goto L22;
            default: goto L5;
        };
    L22:
        RunnableC0778S4 r42 = new RunnableC0778S4(this, false);
        AbstractC2622vD.m5135f().post(r42);
        return;
    L5:
        if (r4.equals(((C1714b) this.f9168b).f6219i) == false) goto L29;
        m5183a();
        C1981r r0 = C1714b.f6207n.m4173a();
        Iterator r1 = C1714b.f6208o.iterator();     // Catch: Throwable -> L13
    L9:
        if (r1.hasNext() == false) goto L15;
        ((ConnectivityManager.NetworkCallback) r1.next()).onLost(r4);     // Catch: Throwable -> L13
        goto L9
    L15:
        r0.close();
        return;
    L13:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L19
    L21:
        throw th;
    L19:
        th = move-exception;
        th.addSuppressed(th);
        goto L21
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch(this.f9167a) {
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        super.onUnavailable();
        return;
    L6:
        m5183a();
        C1981r r0 = C1714b.f6207n.m4173a();
        Iterator r1 = C1714b.f6208o.iterator();     // Catch: Throwable -> L12
    L8:
        if (r1.hasNext() == false) goto L14;
        ((ConnectivityManager.NetworkCallback) r1.next()).onUnavailable();     // Catch: Throwable -> L12
        goto L8
    L14:
        r0.close();
        return;
    L12:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L18
    L20:
        throw th;
    L18:
        th = move-exception;
        th.addSuppressed(th);
        goto L20
    }
}
