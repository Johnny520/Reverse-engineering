package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0922 {
    public C0922() {
            r0 = this;
            r0.<init>()
            return
    }

    @Yue.InterfaceC4410
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.os.Handler m5269() {
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L10
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            goto L15
        L10:
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
        L15:
            return r0
    }
}
