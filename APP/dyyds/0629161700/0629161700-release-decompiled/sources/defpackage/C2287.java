package defpackage;

/* JADX INFO: renamed from: ᲈᛷᛶᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2287 implements java.io.Closeable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public byte[] f9651;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.nio.charset.Charset f9652;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.io.FileInputStream f9653;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f9654;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int f9655;

    public C2287(java.io.FileInputStream r3, java.nio.charset.Charset r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            if (r4 == 0) goto L1f
            java.nio.charset.Charset r1 = defpackage.AbstractC1591.f7036
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L19
            r2.f9653 = r3
            r2.f9652 = r4
            r3 = 8192(0x2000, float:1.148E-41)
            byte[] r3 = new byte[r3]
            r2.f9651 = r3
            return
        L19:
            java.lang.String r2 = "Unsupported encoding"
            defpackage.C2264.m3684(r2)
            throw r0
        L1f:
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r2 = this;
            java.io.FileInputStream r0 = r2.f9653
            monitor-enter(r0)
            byte[] r1 = r2.f9651     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L12
            r1 = 0
            r2.f9651 = r1     // Catch: java.lang.Throwable -> L10
            java.io.FileInputStream r2 = r2.f9653     // Catch: java.lang.Throwable -> L10
            r2.close()     // Catch: java.lang.Throwable -> L10
            goto L12
        L10:
            r2 = move-exception
            goto L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String m3707() {
            r8 = this;
            java.io.FileInputStream r0 = r8.f9653
            monitor-enter(r0)
            byte[] r1 = r8.f9651     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto La3
            int r2 = r8.f9654     // Catch: java.lang.Throwable -> L3d
            int r3 = r8.f9655     // Catch: java.lang.Throwable -> L3d
            r4 = 0
            r5 = -1
            if (r2 < r3) goto L24
            java.io.FileInputStream r2 = r8.f9653     // Catch: java.lang.Throwable -> L3d
            int r3 = r1.length     // Catch: java.lang.Throwable -> L3d
            int r1 = r2.read(r1, r4, r3)     // Catch: java.lang.Throwable -> L3d
            if (r1 == r5) goto L1e
            r8.f9654 = r4     // Catch: java.lang.Throwable -> L3d
            r8.f9655 = r1     // Catch: java.lang.Throwable -> L3d
            r2 = r4
            goto L24
        L1e:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L3d
            r8.<init>()     // Catch: java.lang.Throwable -> L3d
            throw r8     // Catch: java.lang.Throwable -> L3d
        L24:
            int r1 = r8.f9655     // Catch: java.lang.Throwable -> L3d
            r3 = 10
            if (r2 == r1) goto L55
            byte[] r1 = r8.f9651     // Catch: java.lang.Throwable -> L3d
            r6 = r1[r2]     // Catch: java.lang.Throwable -> L3d
            if (r6 != r3) goto L52
            int r3 = r8.f9654     // Catch: java.lang.Throwable -> L3d
            if (r2 == r3) goto L3f
            int r4 = r2 + (-1)
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L3d
            r6 = 13
            if (r5 != r6) goto L3f
            goto L40
        L3d:
            r8 = move-exception
            goto Lab
        L3f:
            r4 = r2
        L40:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L3d
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r8.f9652     // Catch: java.lang.Throwable -> L3d
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L3d
            r5.<init>(r1, r3, r4, r6)     // Catch: java.lang.Throwable -> L3d
            int r2 = r2 + 1
            r8.f9654 = r2     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return r5
        L52:
            int r2 = r2 + 1
            goto L24
        L55:
            ᛱᛲᛸᛳ r1 = new ᛱᛲᛸᛳ     // Catch: java.lang.Throwable -> L3d
            int r2 = r8.f9655     // Catch: java.lang.Throwable -> L3d
            int r6 = r8.f9654     // Catch: java.lang.Throwable -> L3d
            int r2 = r2 - r6
            int r2 = r2 + 80
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L3d
        L61:
            byte[] r2 = r8.f9651     // Catch: java.lang.Throwable -> L3d
            int r6 = r8.f9654     // Catch: java.lang.Throwable -> L3d
            int r7 = r8.f9655     // Catch: java.lang.Throwable -> L3d
            int r7 = r7 - r6
            r1.write(r2, r6, r7)     // Catch: java.lang.Throwable -> L3d
            r8.f9655 = r5     // Catch: java.lang.Throwable -> L3d
            java.io.FileInputStream r2 = r8.f9653     // Catch: java.lang.Throwable -> L3d
            byte[] r6 = r8.f9651     // Catch: java.lang.Throwable -> L3d
            int r7 = r6.length     // Catch: java.lang.Throwable -> L3d
            int r2 = r2.read(r6, r4, r7)     // Catch: java.lang.Throwable -> L3d
            if (r2 == r5) goto L9d
            r8.f9654 = r4     // Catch: java.lang.Throwable -> L3d
            r8.f9655 = r2     // Catch: java.lang.Throwable -> L3d
            r2 = r4
        L7d:
            int r6 = r8.f9655     // Catch: java.lang.Throwable -> L3d
            if (r2 == r6) goto L61
            byte[] r6 = r8.f9651     // Catch: java.lang.Throwable -> L3d
            r7 = r6[r2]     // Catch: java.lang.Throwable -> L3d
            if (r7 != r3) goto L9a
            int r3 = r8.f9654     // Catch: java.lang.Throwable -> L3d
            if (r2 == r3) goto L90
            int r4 = r2 - r3
            r1.write(r6, r3, r4)     // Catch: java.lang.Throwable -> L3d
        L90:
            int r2 = r2 + 1
            r8.f9654 = r2     // Catch: java.lang.Throwable -> L3d
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            return r8
        L9a:
            int r2 = r2 + 1
            goto L7d
        L9d:
            java.io.EOFException r8 = new java.io.EOFException     // Catch: java.lang.Throwable -> L3d
            r8.<init>()     // Catch: java.lang.Throwable -> L3d
            throw r8     // Catch: java.lang.Throwable -> L3d
        La3:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L3d
            java.lang.String r1 = "LineReader is closed"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            throw r8     // Catch: java.lang.Throwable -> L3d
        Lab:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3d
            throw r8
    }
}
