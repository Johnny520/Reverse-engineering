package p000;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class sk0 extends ti0 {

    /* JADX INFO: renamed from: c */
    public final OnBackInvokedDispatcher f5774c;

    /* JADX INFO: renamed from: d */
    public final int f5775d;

    /* JADX INFO: renamed from: e */
    public final OnBackInvokedCallback f5776e;

    /* JADX INFO: renamed from: f */
    public boolean f5777f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public sk0(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f5774c = onBackInvokedDispatcher;
        this.f5775d = i;
        this.f5776e = Build.VERSION.SDK_INT == 33 ? new OnBackInvokedCallback() { // from class: tk0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public final void onBackInvoked() {
                this.f6010a.m4208a();
            }
        } : new uk0(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.ti0
    /* JADX INFO: renamed from: b */
    public final void mo4084b(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.f5776e;
        if (z && !this.f5777f) {
            this.f5774c.registerOnBackInvokedCallback(this.f5775d, onBackInvokedCallback);
            this.f5777f = true;
        } else {
            if (z || !this.f5777f) {
                return;
            }
            this.f5774c.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f5777f = false;
        }
    }
}
