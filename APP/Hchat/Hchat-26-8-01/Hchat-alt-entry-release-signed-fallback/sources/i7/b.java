package i7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b extends c7.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i7.f f6514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c7.b f6515f;

    public b(i7.f r4, c7.b r5) {
            r3 = this;
            d7.m r0 = r5.f1034a
            java.lang.String r1 = r0.a0()
            java.lang.String r1 = a7.a.R(r1)
            if (r1 != 0) goto L1c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".error_file_path_"
            r1.<init>(r2)
            int r0 = r0.f7388g
            r1.append(r0)
            java.lang.String r1 = r1.toString()
        L1c:
            r3.<init>(r1)
            r3.f6514e = r4
            r3.f6515f = r5
            d7.m r4 = r5.f1034a
            int r4 = r4.c0()
            r3.f1038c = r4
            return
    }

    @Override // c7.e
    public final java.io.InputStream b() {
            r14 = this;
            c7.b r0 = r14.f6515f
            d7.m r1 = r0.f1034a
            d7.m r2 = r0.f1034a
            int r3 = r1.c0()
            i7.f r4 = r14.f6514e
            if (r3 != 0) goto L10
            goto La2
        L10:
            r5 = 512(0x200, float:7.17E-43)
            r6 = 1
            r7 = 8
            if (r3 != r7) goto L18
            goto L4a
        L18:
            r3 = 0
            r8 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r8]     // Catch: java.lang.Throwable -> L61
            d7.m r10 = r0.f1034a     // Catch: java.lang.Throwable -> L61
            long r10 = r10.f2043s     // Catch: java.lang.Throwable -> L61
            long r12 = r0.b()     // Catch: java.lang.Throwable -> L61
            java.io.InputStream r10 = r4.b(r10, r12)     // Catch: java.lang.Throwable -> L61
            java.util.zip.InflaterInputStream r11 = new java.util.zip.InflaterInputStream     // Catch: java.lang.Throwable -> L61
            java.util.zip.Inflater r12 = new java.util.zip.Inflater     // Catch: java.lang.Throwable -> L61
            r12.<init>(r6)     // Catch: java.lang.Throwable -> L61
            r11.<init>(r10, r12, r5)     // Catch: java.lang.Throwable -> L61
            r11.read(r9, r3, r8)     // Catch: java.lang.Throwable -> L61
            int r8 = r2.f2040p     // Catch: java.lang.Throwable -> L61
            int r8 = r8 + 2
            r2.R(r8, r7)     // Catch: java.lang.Throwable -> L61
            d7.d r8 = r0.a()     // Catch: java.lang.Throwable -> L61
            int r9 = r8.f2040p     // Catch: java.lang.Throwable -> L61
            int r9 = r9 + 2
            r8.R(r9, r7)     // Catch: java.lang.Throwable -> L61
            r14.f1038c = r7     // Catch: java.lang.Throwable -> L61
        L4a:
            d7.m r1 = r0.f1034a
            long r1 = r1.f2043s
            long r7 = r0.b()
            java.io.InputStream r0 = r4.b(r1, r7)
            java.util.zip.InflaterInputStream r1 = new java.util.zip.InflaterInputStream
            java.util.zip.Inflater r2 = new java.util.zip.Inflater
            r2.<init>(r6)
            r1.<init>(r0, r2, r5)
            return r1
        L61:
            int r5 = r2.f2040p
            int r5 = r5 + 2
            r2.R(r5, r3)
            d7.d r5 = r0.a()
            int r6 = r5.f2040p
            int r6 = r6 + 2
            r5.R(r6, r3)
            r14.f1038c = r3
            long r5 = r1.e0()
            long r7 = r1.X()
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 <= 0) goto L90
            r1.o0(r5)
            d7.d r1 = r0.a()
            int r3 = r1.d0()
            r1.Q(r3, r5)
            goto La2
        L90:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 <= 0) goto La2
            r1.q0(r7)
            d7.d r1 = r0.a()
            int r3 = r1.f2040p
            int r3 = r3 + 16
            r1.Q(r3, r7)
        La2:
            long r1 = r2.f2043s
            long r5 = r0.b()
            java.io.InputStream r0 = r4.b(r1, r5)
            return r0
    }
}
