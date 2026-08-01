package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
@java.lang.Deprecated
public final class BundleCompat {
    private BundleCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.os.IBinder getBinder(android.os.Bundle r1, java.lang.String r2) {
            android.os.IBinder r0 = androidx.core.os.BundleCompat.getBinder(r1, r2)
            return r0
    }

    public static void putBinder(android.os.Bundle r0, java.lang.String r1, android.os.IBinder r2) {
            androidx.core.os.BundleCompat.putBinder(r0, r1, r2)
            return
    }
}
