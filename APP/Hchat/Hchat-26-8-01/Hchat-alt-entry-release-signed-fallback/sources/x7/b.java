package x7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends java.io.ByteArrayOutputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f21213g;

    public b(int r2) {
            r1 = this;
            if (r2 < 0) goto L6
            r1.<init>(r2)
            return
        L6:
            java.lang.String r0 = "Negative: "
            java.lang.String r2 = eh.a.l(r2, r0)
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            super.close()
            r0.toByteArray()
            return
    }

    @Override // java.io.ByteArrayOutputStream
    public final synchronized byte[] toByteArray() {
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.count     // Catch: java.lang.Throwable -> L13
            byte[] r1 = r5.buf     // Catch: java.lang.Throwable -> L13
            int r2 = r1.length     // Catch: java.lang.Throwable -> L13
            if (r0 != r2) goto La
            monitor-exit(r5)
            return r1
        La:
            r2 = 0
            if (r0 != 0) goto L15
            byte[] r0 = new byte[r2]     // Catch: java.lang.Throwable -> L13
            r5.buf = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r5)
            return r0
        L13:
            r0 = move-exception
            goto L24
        L15:
            byte[] r3 = new byte[r0]     // Catch: java.lang.Throwable -> L13
        L17:
            if (r2 >= r0) goto L20
            r4 = r1[r2]     // Catch: java.lang.Throwable -> L13
            r3[r2] = r4     // Catch: java.lang.Throwable -> L13
            int r2 = r2 + 1
            goto L17
        L20:
            r5.buf = r3     // Catch: java.lang.Throwable -> L13
            monitor-exit(r5)
            return r3
        L24:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    @Override // java.io.ByteArrayOutputStream
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "pos = "
            r0.<init>(r1)
            int r1 = r2.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            r2.write(r3, r0, r1)
            return
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] r6, int r7, int r8) {
            r5 = this;
            monitor-enter(r5)
            if (r8 != 0) goto L5
            monitor-exit(r5)
            return
        L5:
            int r0 = r5.count     // Catch: java.lang.Throwable -> L49
            int r0 = r0 + r8
            byte[] r1 = r5.buf     // Catch: java.lang.Throwable -> L49
            int r2 = r1.length     // Catch: java.lang.Throwable -> L49
            int r2 = r0 - r2
            if (r2 <= 0) goto L3b
            int r2 = r5.f21213g     // Catch: java.lang.Throwable -> L49
            if (r2 != 0) goto L16
            r2 = 2
            r5.f21213g = r2     // Catch: java.lang.Throwable -> L49
        L16:
            int r2 = r5.f21213g     // Catch: java.lang.Throwable -> L49
            int r2 = r2 << 1
            r5.f21213g = r2     // Catch: java.lang.Throwable -> L49
            r3 = 65535(0xffff, float:9.1834E-41)
            if (r2 <= r3) goto L23
            r5.f21213g = r3     // Catch: java.lang.Throwable -> L49
        L23:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L49
            int r3 = r5.f21213g     // Catch: java.lang.Throwable -> L49
            int r3 = r3 + r0
            int r4 = r3 - r0
            if (r4 >= 0) goto L2c
            goto L2d
        L2c:
            r0 = r3
        L2d:
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L49
            r3 = 0
        L30:
            if (r3 >= r2) goto L39
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L49
            r0[r3] = r4     // Catch: java.lang.Throwable -> L49
            int r3 = r3 + 1
            goto L30
        L39:
            r5.buf = r0     // Catch: java.lang.Throwable -> L49
        L3b:
            byte[] r0 = r5.buf     // Catch: java.lang.Throwable -> L49
            int r1 = r5.count     // Catch: java.lang.Throwable -> L49
            java.lang.System.arraycopy(r6, r7, r0, r1, r8)     // Catch: java.lang.Throwable -> L49
            int r6 = r5.count     // Catch: java.lang.Throwable -> L49
            int r6 = r6 + r8
            r5.count = r6     // Catch: java.lang.Throwable -> L49
            monitor-exit(r5)
            return
        L49:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L49
            throw r6
    }
}
