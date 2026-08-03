package q7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends java.io.InputStream {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f10662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f10663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10668m;

    public b(java.io.InputStream r5) {
            r4 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 40960(0xa000, float:5.7397E-41)
            byte[] r1 = new byte[r1]
        La:
            int r2 = r5.read(r1)
            r3 = 0
            if (r2 <= 0) goto L15
            r0.write(r1, r3, r2)
            goto La
        L15:
            boolean r1 = r5 instanceof java.io.FileInputStream
            if (r1 == 0) goto L1c
            r5.close()
        L1c:
            r0.close()
            byte[] r5 = r0.toByteArray()
            int r0 = r5.length
            r4.<init>(r5, r3, r0)
            return
    }

    public b(byte[] r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f10662g = r0
            r1.f10663h = r2
            r1.f10664i = r3
            r1.f10665j = r4
            r2 = 0
            r1.f10666k = r2
            return
    }

    public final q7.b a(int r4) {
            r3 = this;
            int r0 = r3.f10666k
            int r1 = r0 + r4
            int r2 = r3.f10665j
            if (r4 < 0) goto La
            if (r1 <= r2) goto Lc
        La:
            int r4 = r2 - r0
        Lc:
            int r1 = r3.f10664i
            int r0 = r0 + r1
            q7.b r1 = new q7.b
            byte[] r2 = r3.f10663h
            r1.<init>(r2, r0, r4)
            return r1
    }

    @Override // java.io.InputStream
    public final int available() {
            r2 = this;
            int r0 = r2.f10665j
            int r1 = r2.f10666k
            int r0 = r0 - r1
            return r0
    }

    public final boolean b() {
            r1 = this;
            boolean r0 = r1.f10667l
            if (r0 == 0) goto L5
            goto Ld
        L5:
            int r0 = r1.available()
            if (r0 <= 0) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public final void c(int r2) {
            r1 = this;
            int r0 = r1.f10666k
            int r0 = r0 + r2
            r1.g(r0)
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r1 = this;
            r0 = 1
            r1.f10667l = r0
            r0 = 0
            r1.f10663h = r0
            r0 = 0
            r1.f10668m = r0
            return
    }

    public final int e(byte[] r6, int r7) {
            r5 = this;
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5.f10667l
            if (r1 != 0) goto L50
            int r1 = r5.f10666k
            int r2 = r5.f10665j
            if (r1 >= r2) goto L3a
            int r1 = r6.length
            if (r7 <= r1) goto L12
            int r7 = r6.length
        L12:
            java.lang.Object r1 = r5.f10662g
            monitor-enter(r1)
            int r2 = r5.f10664i     // Catch: java.lang.Throwable -> L34
            int r3 = r5.f10666k     // Catch: java.lang.Throwable -> L34
            int r2 = r2 + r3
        L1a:
            if (r0 >= r7) goto L36
            byte[] r3 = r5.f10663h     // Catch: java.lang.Throwable -> L34
            int r4 = r2 + r0
            r3 = r3[r4]     // Catch: java.lang.Throwable -> L34
            r6[r0] = r3     // Catch: java.lang.Throwable -> L34
            int r3 = r5.f10666k     // Catch: java.lang.Throwable -> L34
            int r3 = r3 + 1
            r5.f10666k = r3     // Catch: java.lang.Throwable -> L34
            int r4 = r5.f10665j     // Catch: java.lang.Throwable -> L34
            if (r3 < r4) goto L31
            int r0 = r0 + 1
            goto L36
        L31:
            int r0 = r0 + 1
            goto L1a
        L34:
            r6 = move-exception
            goto L38
        L36:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            return r0
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L34
            throw r6
        L3a:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r7 = "Finished reading: "
            int r0 = r5.f10666k
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r7)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            r6.<init>(r7)
            throw r6
        L50:
            java.lang.String r6 = "Stream is closed"
            j8.o.y(r6)
            r6 = 0
            return r6
    }

    public final void g(int r2) {
            r1 = this;
            if (r2 >= 0) goto L4
            r2 = 0
            goto L9
        L4:
            int r0 = r1.f10665j
            if (r2 <= r0) goto L9
            r2 = r0
        L9:
            java.lang.Object r0 = r1.f10662g
            monitor-enter(r0)
            r1.f10666k = r2     // Catch: java.lang.Throwable -> L10
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L10:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    @Override // java.io.InputStream
    public final void mark(int r1) {
            r0 = this;
            r0.f10668m = r1
            return
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // java.io.InputStream
    public final int read() {
            r3 = this;
            boolean r0 = r3.f10667l
            if (r0 != 0) goto L2d
            int r0 = r3.f10666k
            int r1 = r3.f10665j
            if (r0 >= r1) goto L21
            java.lang.Object r1 = r3.f10662g
            monitor-enter(r1)
            int r2 = r3.f10664i     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 + r0
            byte[] r0 = r3.f10663h     // Catch: java.lang.Throwable -> L1e
            r0 = r0[r2]     // Catch: java.lang.Throwable -> L1e
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r2 = r3.f10666k     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 + 1
            r3.f10666k = r2     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            return r0
        L1e:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1e
            throw r0
        L21:
            java.io.EOFException r1 = new java.io.EOFException
            java.lang.String r2 = "Finished reading: "
            java.lang.String r0 = eh.a.l(r0, r2)
            r1.<init>(r0)
            throw r1
        L2d:
            java.lang.String r0 = "Stream is closed"
            j8.o.y(r0)
            r0 = 0
            return r0
    }

    public final short readShort() {
            r3 = this;
            int r0 = r3.f10666k
            r1 = 2
            byte[] r2 = new byte[r1]
            r3.e(r2, r1)
            r3.g(r0)
            r0 = 0
            r0 = r2[r0]
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            short r0 = (short) r0
            return r0
    }

    @Override // java.io.InputStream
    public final void reset() {
            r1 = this;
            boolean r0 = r1.f10667l
            if (r0 != 0) goto L9
            int r0 = r1.f10668m
            r1.f10666k = r0
            return
        L9:
            java.lang.String r0 = "Can not reset stream is closed"
            j8.o.y(r0)
            return
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class<q7.b> r1 = q7.b.class
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            boolean r1 = r4.f10667l
            if (r1 == 0) goto L1d
            java.lang.String r1 = "Closed"
            r0.append(r1)
            goto L5c
        L1d:
            int r1 = r4.available()
            if (r1 != 0) goto L2e
            java.lang.String r1 = "Finished: "
            r0.append(r1)
            int r1 = r4.f10666k
            r0.append(r1)
            goto L5c
        L2e:
            int r2 = r4.f10664i
            if (r2 <= 0) goto L4a
            java.lang.String r3 = "START="
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = ", ACTUAL="
            r0.append(r3)
            int r3 = r4.f10666k
            int r2 = r2 + r3
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
        L4a:
            java.lang.String r2 = "POS="
            r0.append(r2)
            int r2 = r4.f10666k
            r0.append(r2)
            java.lang.String r2 = ", available="
            r0.append(r2)
            r0.append(r1)
        L5c:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
