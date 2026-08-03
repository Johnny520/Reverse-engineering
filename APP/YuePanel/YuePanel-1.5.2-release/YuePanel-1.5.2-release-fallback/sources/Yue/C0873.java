package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۥ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C0873 {
    public C0873() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.nio.ByteBuffer m5005() {
            r0 = 0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static int m5006(java.nio.ByteBuffer r2, java.nio.ByteBuffer r3) {
            if (r2 == 0) goto L1d
            if (r3 == 0) goto L1d
            int r0 = r2.remaining()
            int r1 = r3.remaining()
            if (r0 <= r1) goto L19
            int r0 = java.lang.Math.min(r0, r1)
            r2.limit(r0)
            r3.put(r2)
            return r0
        L19:
            r3.put(r2)
            return r0
        L1d:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
    }
}
