package androidx.fragment.app;

import android.content.DialogInterface;
import android.util.Log;
import java.util.ArrayList;
import p001A0.RunnableC0019E;
import p034S.AbstractC0324d;
import p089x0.C1121e;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0504d extends AbstractComponentCallbacksC0505e implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: k */
    public final DialogInterfaceOnDismissListenerC0503c f1419k;

    /* JADX INFO: renamed from: l */
    public int f1420l;

    /* JADX INFO: renamed from: m */
    public boolean f1421m;

    /* JADX INFO: renamed from: n */
    public boolean f1422n;

    public DialogInterfaceOnCancelListenerC0504d() {
        new RunnableC0019E(6, this);
        new DialogInterfaceOnCancelListenerC0502b(this);
        this.f1419k = new DialogInterfaceOnDismissListenerC0503c(this);
        this.f1420l = -1;
        new C1121e(24, this);
    }

    /* JADX INFO: renamed from: i */
    public final void m1228i(boolean r4, boolean r5) {
        if (this.f1422n == false) goto L5;
        return;
    L5:
        this.f1422n = true;
        this.f1421m = true;
        if (this.f1420l < 0) goto L25;
        C0509i r52 = m1233f();
        int r02 = this.f1420l;
        if (r02 < 0) goto L24;
        if (r4 == false) goto L21;
        ArrayList r03 = r52.f1435a;
        monitor-enter(r03);
        if (r4 == false) goto L18;
        monitor-exit(r03);     // Catch: Throwable -> L15
        this.f1420l = -1;
        return;
    L18:
        throw new IllegalStateException("Activity has been destroyed");     // Catch: Throwable -> L15
    L15:
        th = move-exception;
        throw th;
    L21:
        r52.getClass();
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    L24:
        throw new IllegalArgumentException(AbstractC0324d.m720c("Bad id: ", r02));
    L25:
        C0501a r1 = new C0501a(m1233f());
        r1.m1224a(new C0510j(3, this));
        if (r4 == false) goto L28;
        r1.m1225b(true);
        return;
    L28:
        r1.m1225b(false);
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface r1) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface r2) {
        if (this.f1421m == false) goto L5;
        return;
    L5:
        if (Log.isLoggable("FragmentManager", 3) == false) goto L7;
        toString();
    L7:
        m1228i(true, true);
    }
}
