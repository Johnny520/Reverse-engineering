package androidx.compose.runtime;

import androidx.collection.AbstractC0234;
import androidx.collection.C0252;
import androidx.compose.runtime.snapshots.AbstractC1255;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1361 extends AbstractC1255 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final Object f3935 = new Object();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f3936;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0252 f3937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f3938;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public long f3939;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f3940;

    public C1361(long j) {
        super(j);
        C0252 c0252 = AbstractC0234.f874;
        c0252.getClass();
        this.f3937 = c0252;
        this.f3936 = f3935;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[PHI: r11
  0x00d8: PHI (r11v1 int) = (r11v0 int), (r11v2 int) binds: [B:30:0x00a9, B:40:0x00d6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v10, types: [androidx.compose.runtime.飘花落叶言子楪兰苏世哲] */
    /* JADX WARN: Type inference failed for: r13v5, types: [androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏] */
    /* JADX WARN: Type inference failed for: r13v6, types: [androidx.compose.runtime.snapshots.飘花落叶言子世楪兰哲苏, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [int] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3 */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r25v5 */
    /* JADX WARN: Type inference failed for: r25v6 */
    /* JADX WARN: Type inference failed for: r25v7 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m2439(androidx.compose.runtime.C1362 r31, androidx.compose.runtime.snapshots.AbstractC1286 r32) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1361.m2439(androidx.compose.runtime.飘花落叶言子楪兰苏哲世, androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2440(androidx.compose.runtime.C1362 r7, androidx.compose.runtime.snapshots.AbstractC1286 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = androidx.compose.runtime.snapshots.AbstractC1280.f3745
            monitor-enter(r0)
            long r1 = r6.f3939     // Catch: java.lang.Throwable -> L1a
            long r3 = r8.mo2210()     // Catch: java.lang.Throwable -> L1a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1c
            int r1 = r6.f3938     // Catch: java.lang.Throwable -> L1a
            int r4 = r8.mo2223()     // Catch: java.lang.Throwable -> L1a
            if (r1 == r4) goto L18
            goto L1c
        L18:
            r1 = r3
            goto L1d
        L1a:
            r6 = move-exception
            goto L47
        L1c:
            r1 = r2
        L1d:
            monitor-exit(r0)
            java.lang.Object r4 = r6.f3936
            java.lang.Object r5 = androidx.compose.runtime.C1361.f3935
            if (r4 == r5) goto L2f
            if (r1 == 0) goto L30
            int r4 = r6.f3940
            int r7 = r6.m2439(r7, r8)
            if (r4 != r7) goto L2f
            goto L30
        L2f:
            r2 = r3
        L30:
            if (r2 == 0) goto L46
            if (r1 == 0) goto L46
            monitor-enter(r0)
            long r3 = r8.mo2210()     // Catch: java.lang.Throwable -> L43
            r6.f3939 = r3     // Catch: java.lang.Throwable -> L43
            int r7 = r8.mo2223()     // Catch: java.lang.Throwable -> L43
            r6.f3938 = r7     // Catch: java.lang.Throwable -> L43
            monitor-exit(r0)
            return r2
        L43:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L46:
            return r2
        L47:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C1361.m2440(androidx.compose.runtime.飘花落叶言子楪兰苏哲世, androidx.compose.runtime.snapshots.飘花落叶言子楪苏世哲兰):boolean");
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC1255 mo2196(long j) {
        return new C1361(j);
    }

    @Override // androidx.compose.runtime.snapshots.AbstractC1255
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo2197(AbstractC1255 abstractC1255) {
        abstractC1255.getClass();
        C1361 c1361 = (C1361) abstractC1255;
        this.f3937 = c1361.f3937;
        this.f3936 = c1361.f3936;
        this.f3940 = c1361.f3940;
    }
}
