package i7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends i7.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.io.File f6519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public java.nio.channels.FileChannel f6520h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public x7.c f6521i;

    public e(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.f6519g = r1
            return
    }

    @Override // i7.f
    public final byte[] a() {
            r5 = this;
            java.io.File r0 = r5.f6519g
            long r0 = r0.length()
            r2 = 65581(0x1002d, float:9.1899E-41)
            long r3 = (long) r2
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto Lf
            int r2 = (int) r0
        Lf:
            long r3 = (long) r2
            long r0 = r0 - r3
            java.nio.channels.FileChannel r3 = r5.e()
            r3.position(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r2)
            r3.read(r0)
            byte[] r0 = r0.array()
            return r0
    }

    @Override // i7.f
    public final java.io.InputStream b(long r2, long r4) {
            r1 = this;
            x7.c r0 = r1.f6521i
            if (r0 != 0) goto L5
            goto L8
        L5:
            r0 = 0
            r1.f6521i = r0
        L8:
            java.nio.channels.FileChannel r0 = r1.e()
            r0.position(r2)
            x7.c r2 = new x7.c
            r2.<init>(r0, r4)
            r1.f6521i = r2
            return r2
    }

    @Override // i7.f
    public final long c() {
            r2 = this;
            java.io.File r0 = r2.f6519g
            long r0 = r0.length()
            return r0
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            x7.c r0 = r2.f6521i
            r1 = 0
            if (r0 != 0) goto L6
            goto L8
        L6:
            r2.f6521i = r1
        L8:
            java.nio.channels.FileChannel r0 = r2.f6520h
            if (r0 != 0) goto Ld
            return
        Ld:
            monitor-enter(r2)
            r0.close()     // Catch: java.lang.Throwable -> L15
            r2.f6520h = r1     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public final java.nio.channels.FileChannel e() {
            r4 = this;
            java.nio.channels.FileChannel r0 = r4.f6520h
            if (r0 == 0) goto L5
            return r0
        L5:
            monitor-enter(r4)
            java.io.File r0 = r4.f6519g     // Catch: java.lang.Throwable -> L1d
            int r1 = a8.a.f78a     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r0.isFile()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L1d
            r4.f6520h = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            return r0
        L1d:
            r0 = move-exception
            goto L33
        L1f:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L1d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "No such file: "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1d
            r2.append(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L1d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1     // Catch: java.lang.Throwable -> L1d
        L33:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
            r1 = this;
            java.nio.channels.FileChannel r0 = r1.f6520h
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            monitor-enter(r1)
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            return r0
        Ld:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "File: "
            r0.<init>(r1)
            java.io.File r1 = r2.f6519g
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
