package p000;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ht1 extends jm1 {

    /* JADX INFO: renamed from: c */
    public final OnBackInvokedDispatcher f4133c;

    /* JADX INFO: renamed from: d */
    public final int f4134d;

    /* JADX INFO: renamed from: e */
    public final OnBackInvokedCallback f4135e;

    /* JADX INFO: renamed from: f */
    public boolean f4136f;

    public ht1(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f4133c = onBackInvokedDispatcher;
        this.f4134d = i;
        this.f4135e = Build.VERSION.SDK_INT == 33 ? new C0540oe(1, this) : new it1(this);
    }

    @Override // p000.jm1
    /* JADX INFO: renamed from: b */
    public final void mo2230b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.f4135e;
        if (z && !this.f4136f) {
            this.f4133c.registerOnBackInvokedCallback(this.f4134d, onBackInvokedCallback);
            this.f4136f = true;
        } else {
            if (z || !this.f4136f) {
                return;
            }
            this.f4133c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f4136f = false;
        }
    }
}
