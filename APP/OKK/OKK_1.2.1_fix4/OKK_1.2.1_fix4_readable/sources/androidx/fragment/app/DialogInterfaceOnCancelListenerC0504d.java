package androidx.fragment.app;

import android.content.DialogInterface;
import android.util.Log;
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
    public final void m1228i(boolean z2, boolean z3) {
        if (this.f1422n) {
            return;
        }
        this.f1422n = true;
        this.f1421m = true;
        if (this.f1420l < 0) {
            C0501a c0501a = new C0501a(m1233f());
            c0501a.m1224a(new C0510j(3, this));
            if (z2) {
                c0501a.m1225b(true);
                return;
            } else {
                c0501a.m1225b(false);
                return;
            }
        }
        C0509i c0509iM1233f = m1233f();
        int i2 = this.f1420l;
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC0324d.m720c("Bad id: ", i2));
        }
        if (!z2) {
            c0509iM1233f.getClass();
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        }
        synchronized (c0509iM1233f.f1435a) {
            if (!z2) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
        this.f1420l = -1;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1421m) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        m1228i(true, true);
    }
}
