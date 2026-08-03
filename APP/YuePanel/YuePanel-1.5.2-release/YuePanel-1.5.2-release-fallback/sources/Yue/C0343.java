package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟۠ۥ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C0343 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final /* synthetic */ int m1418(java.util.logging.LogRecord r0) {
            int r0 = m1419(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final int m1419(java.util.logging.LogRecord r3) {
            java.util.logging.Level r0 = r3.getLevel()
            int r0 = r0.intValue()
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            int r2 = r1.intValue()
            if (r0 <= r2) goto L12
            r3 = 5
            goto L23
        L12:
            java.util.logging.Level r3 = r3.getLevel()
            int r3 = r3.intValue()
            int r0 = r1.intValue()
            if (r3 != r0) goto L22
            r3 = 4
            goto L23
        L22:
            r3 = 3
        L23:
            return r3
    }
}
