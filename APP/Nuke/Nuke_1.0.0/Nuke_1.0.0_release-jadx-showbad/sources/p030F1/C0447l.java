package p030F1;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: renamed from: F1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0447l extends AbstractC0442g {

    /* JADX INFO: renamed from: c */
    public final OnBackInvokedDispatcher f1341c;

    /* JADX INFO: renamed from: d */
    public final int f1342d;

    /* JADX INFO: renamed from: e */
    public final OnBackInvokedCallback f1343e;

    /* JADX INFO: renamed from: f */
    public boolean f1344f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0447l(OnBackInvokedDispatcher onBackInvokedDispatcher, int i5) {
        this.f1341c = onBackInvokedDispatcher;
        this.f1342d = i5;
        this.f1343e = Build.VERSION.SDK_INT == 33 ? new C0449n(0, this) : new C0450o(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p030F1.AbstractC0442g
    /* JADX INFO: renamed from: b */
    public final void mo710b(boolean z5) {
        if (z5 && !this.f1344f) {
            this.f1341c.registerOnBackInvokedCallback(this.f1342d, this.f1343e);
            this.f1344f = true;
        } else {
            if (z5 || !this.f1344f) {
                return;
            }
            this.f1341c.unregisterOnBackInvokedCallback(this.f1343e);
            this.f1344f = false;
        }
    }
}
