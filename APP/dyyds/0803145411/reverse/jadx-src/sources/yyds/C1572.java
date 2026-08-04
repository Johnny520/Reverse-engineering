package yyds;

import android.os.Handler;

/* JADX INFO: renamed from: yyds.ᛷᛶᛳᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1572 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public boolean f7969;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public Object f7970;

    public C1572(String str, boolean z) {
        this.f7969 = z;
        this.f7970 = str;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public synchronized void m3215(InterfaceC2162 interfaceC2162, boolean z) {
        try {
            if (this.f7969 || z) {
                ((Handler) this.f7970).obtainMessage(1, interfaceC2162).sendToTarget();
            } else {
                this.f7969 = true;
                interfaceC2162.mo1177();
                this.f7969 = false;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
