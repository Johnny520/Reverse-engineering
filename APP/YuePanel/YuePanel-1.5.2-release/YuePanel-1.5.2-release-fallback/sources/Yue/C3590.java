package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۧ۠۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C3590 {
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m14525(int r2) {
            r0 = 1
            if (r2 < r0) goto L4
            return
        L4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected positive parallelism level, but got "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
    }
}
