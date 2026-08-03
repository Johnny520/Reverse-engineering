package i7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends i7.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f6516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f6517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f6518i;

    public d(byte[] r4) {
            r3 = this;
            int r0 = r4.length
            r3.<init>()
            int r1 = r4.length
            r2 = 0
            if (r1 > 0) goto Lc
            int r1 = r4.length
            int r1 = r1 + (-1)
            goto Ld
        Lc:
            r1 = r2
        Ld:
            if (r1 >= 0) goto L10
            goto L11
        L10:
            r2 = r1
        L11:
            int r1 = r4.length
            int r1 = r1 - r2
            if (r0 <= r1) goto L16
            r0 = r1
        L16:
            r3.f6516g = r4
            r3.f6517h = r2
            r3.f6518i = r0
            return
    }

    @Override // i7.f
    public final byte[] a() {
            r5 = this;
            r0 = 65581(0x1002d, float:9.1899E-41)
            byte[] r1 = r5.f6516g
            int r2 = r5.f6517h
            int r3 = r5.f6518i
            if (r0 <= r3) goto L15
            if (r2 != 0) goto L14
            java.lang.Object r0 = r1.clone()
            byte[] r0 = (byte[]) r0
            return r0
        L14:
            r0 = r3
        L15:
            byte[] r3 = new byte[r0]
            int r4 = r1.length
            int r4 = r4 - r2
            int r4 = r4 - r0
            r2 = 0
            java.lang.System.arraycopy(r1, r4, r3, r2, r0)
            return r3
    }

    @Override // i7.f
    public final java.io.InputStream b(long r4, long r6) {
            r3 = this;
            x7.a r0 = new x7.a
            int r1 = r3.f6517h
            long r1 = (long) r1
            long r4 = r4 + r1
            int r4 = (int) r4
            int r5 = (int) r6
            byte[] r6 = r3.f6516g
            r0.<init>(r6, r4, r5)
            return r0
    }

    @Override // i7.f
    public final long c() {
            r2 = this;
            int r0 = r2.f6518i
            long r0 = (long) r0
            return r0
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r1 = this;
            r0 = 1
            return r0
    }
}
