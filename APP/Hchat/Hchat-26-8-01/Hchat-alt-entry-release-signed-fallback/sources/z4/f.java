package z4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends java.io.FilterWriter {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f22544g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22545h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f22546i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22547j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22548k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f22549l;

    public f(java.io.StringWriter r2, int r3, java.lang.String r4) {
            r1 = this;
            r1.<init>(r2)
            if (r3 < 0) goto L27
            if (r3 == 0) goto L9
            r2 = r3
            goto Lc
        L9:
            r2 = 2147483647(0x7fffffff, float:NaN)
        Lc:
            r1.f22545h = r2
            r2 = 1
            int r3 = r3 >> r2
            r1.f22546i = r3
            int r0 = r4.length()
            if (r0 != 0) goto L19
            r4 = 0
        L19:
            r1.f22544g = r4
            r4 = 0
            r1.f22547j = r4
            if (r3 == 0) goto L21
            goto L22
        L21:
            r2 = r4
        L22:
            r1.f22548k = r2
            r1.f22549l = r4
            return
        L27:
            java.lang.String r2 = "width < 0"
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(int r8) {
            r7 = this;
            java.lang.Object r0 = r7.lock
            monitor-enter(r0)
            boolean r1 = r7.f22548k     // Catch: java.lang.Throwable -> L1b
            r2 = 32
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            if (r8 != r2) goto L1d
            int r1 = r7.f22549l     // Catch: java.lang.Throwable -> L1b
            int r1 = r1 + r3
            r7.f22549l = r1     // Catch: java.lang.Throwable -> L1b
            int r5 = r7.f22546i     // Catch: java.lang.Throwable -> L1b
            if (r1 < r5) goto L1f
            r7.f22549l = r5     // Catch: java.lang.Throwable -> L1b
            r7.f22548k = r4     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r8 = move-exception
            goto L6b
        L1d:
            r7.f22548k = r4     // Catch: java.lang.Throwable -> L1b
        L1f:
            int r1 = r7.f22547j     // Catch: java.lang.Throwable -> L1b
            int r5 = r7.f22545h     // Catch: java.lang.Throwable -> L1b
            r6 = 10
            if (r1 != r5) goto L30
            if (r8 == r6) goto L30
            java.io.Writer r1 = r7.out     // Catch: java.lang.Throwable -> L1b
            r1.write(r6)     // Catch: java.lang.Throwable -> L1b
            r7.f22547j = r4     // Catch: java.lang.Throwable -> L1b
        L30:
            int r1 = r7.f22547j     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L50
            java.lang.String r1 = r7.f22544g     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L3d
            java.io.Writer r5 = r7.out     // Catch: java.lang.Throwable -> L1b
            r5.write(r1)     // Catch: java.lang.Throwable -> L1b
        L3d:
            boolean r1 = r7.f22548k     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L50
            r1 = r4
        L42:
            int r5 = r7.f22549l     // Catch: java.lang.Throwable -> L1b
            if (r1 >= r5) goto L4e
            java.io.Writer r5 = r7.out     // Catch: java.lang.Throwable -> L1b
            r5.write(r2)     // Catch: java.lang.Throwable -> L1b
            int r1 = r1 + 1
            goto L42
        L4e:
            r7.f22547j = r5     // Catch: java.lang.Throwable -> L1b
        L50:
            java.io.Writer r1 = r7.out     // Catch: java.lang.Throwable -> L1b
            r1.write(r8)     // Catch: java.lang.Throwable -> L1b
            if (r8 != r6) goto L64
            r7.f22547j = r4     // Catch: java.lang.Throwable -> L1b
            int r8 = r7.f22546i     // Catch: java.lang.Throwable -> L1b
            if (r8 == 0) goto L5e
            goto L5f
        L5e:
            r3 = r4
        L5f:
            r7.f22548k = r3     // Catch: java.lang.Throwable -> L1b
            r7.f22549l = r4     // Catch: java.lang.Throwable -> L1b
            goto L69
        L64:
            int r8 = r7.f22547j     // Catch: java.lang.Throwable -> L1b
            int r8 = r8 + r3
            r7.f22547j = r8     // Catch: java.lang.Throwable -> L1b
        L69:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L6b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r8
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(java.lang.String r3, int r4, int r5) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
        L3:
            if (r5 <= 0) goto L13
            char r1 = r3.charAt(r4)     // Catch: java.lang.Throwable -> L11
            r2.write(r1)     // Catch: java.lang.Throwable -> L11
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L3
        L11:
            r3 = move-exception
            goto L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r3
    }

    @Override // java.io.FilterWriter, java.io.Writer
    public final void write(char[] r3, int r4, int r5) {
            r2 = this;
            java.lang.Object r0 = r2.lock
            monitor-enter(r0)
        L3:
            if (r5 <= 0) goto L11
            char r1 = r3[r4]     // Catch: java.lang.Throwable -> Lf
            r2.write(r1)     // Catch: java.lang.Throwable -> Lf
            int r4 = r4 + 1
            int r5 = r5 + (-1)
            goto L3
        Lf:
            r3 = move-exception
            goto L13
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }
}
