package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import java.util.HashSet;

/* JADX INFO: renamed from: Nc */
/* JADX INFO: loaded from: classes.dex */
public final class C0578Nc implements InterfaceC1136ab {

    /* JADX INFO: renamed from: a */
    public final Context f1875a;

    /* JADX INFO: renamed from: b */
    public final C1429fw f1876b;

    public C0578Nc(Context r1, C1429fw r2) {
        this.f1875a = r1.getApplicationContext();
        this.f1876b = r2;
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: b */
    public final void mo392b() {
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: d */
    public final void mo394d() {
        C2692wy r0 = C2692wy.m5266b(this.f1875a);
        C1429fw r1 = this.f1876b;
        monitor-enter(r0);
        ((HashSet) r0.f9266d).remove(r1);     // Catch: Throwable -> L12
        if (r0.f9264b == true) goto L7;
    L10:
        monitor-exit(r0);
        return;
    L7:
        if (((HashSet) r0.f9266d).isEmpty() == false) goto L10;
        C1094Zd r12 = (C1094Zd) r0.f9265c;     // Catch: Throwable -> L12
        ((ConnectivityManager) ((C0061Bb) r12.f3479c).get()).unregisterNetworkCallback((C2649vy) r12.f3480d);     // Catch: Throwable -> L12
        r0.f9264b = false;     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    }

    @Override // p000.InterfaceC0975Wn
    /* JADX INFO: renamed from: k */
    public final void mo401k() {
        C2692wy r0 = C2692wy.m5266b(this.f1875a);
        C1429fw r1 = this.f1876b;
        monitor-enter(r0);
        ((HashSet) r0.f9266d).add(r1);     // Catch: Throwable -> L19
        if (r0.f9264b == false) goto L7;
    L17:
        monitor-exit(r0);
        return;
    L7:
        if (((HashSet) r0.f9266d).isEmpty() == true) goto L17;
        C1094Zd r12 = (C1094Zd) r0.f9265c;     // Catch: Throwable -> L19
        C0061Bb r2 = (C0061Bb) r12.f3479c;     // Catch: Throwable -> L19
        boolean r4 = false;
        if (((ConnectivityManager) r2.get()).getActiveNetwork() == null) goto L12;
        boolean r3 = true;
    L13:
        r12.f3477a = r3;     // Catch: Throwable -> L19
        ((ConnectivityManager) r2.get()).registerDefaultNetworkCallback((C2649vy) r12.f3480d);     // Catch: RuntimeException -> L22 Throwable -> L19
        r4 = true;
    L16:
        r0.f9264b = r4;     // Catch: Throwable -> L19
        goto L17
    L12:
        r3 = false;
    L19:
        th = move-exception;
        throw th;
    }
}
