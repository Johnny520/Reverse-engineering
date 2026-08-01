package defpackage;

/* JADX INFO: renamed from: ᛱᛲᛶᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0036 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static final java.util.concurrent.atomic.AtomicReference f535 = null;

    static {
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            defpackage.AbstractC0036.f535 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static void m361(java.nio.ByteBuffer r3, java.io.File r4) {
            m362(r3)
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "rw"
            r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L25
            java.nio.channels.FileChannel r0 = r1.getChannel()     // Catch: java.lang.Throwable -> L23
            r0.write(r3)     // Catch: java.lang.Throwable -> L23
            r3 = 0
            r0.force(r3)     // Catch: java.lang.Throwable -> L23
            r0.close()     // Catch: java.lang.Throwable -> L23
            r1.close()     // Catch: java.lang.Throwable -> L23
            r0.close()     // Catch: java.io.IOException -> L1f
        L1f:
            r1.close()     // Catch: java.io.IOException -> L22
        L22:
            return
        L23:
            r3 = move-exception
            goto L27
        L25:
            r3 = move-exception
            r1 = r0
        L27:
            if (r0 == 0) goto L2c
            r0.close()     // Catch: java.io.IOException -> L2c
        L2c:
            if (r1 == 0) goto L31
            r1.close()     // Catch: java.io.IOException -> L31
        L31:
            throw r3
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public static java.nio.ByteBuffer m362(java.nio.ByteBuffer r1) {
            r0 = 0
            java.nio.Buffer r1 = r1.position(r0)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            return r1
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static java.nio.MappedByteBuffer m363(java.io.File r9) {
            r1 = 0
            long r6 = r9.length()     // Catch: java.lang.Throwable -> L37
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 > 0) goto L43
            r2 = 0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L3b
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "r"
            r8.<init>(r9, r0)     // Catch: java.lang.Throwable -> L37
            java.nio.channels.FileChannel r2 = r8.getChannel()     // Catch: java.lang.Throwable -> L34
            java.nio.channels.FileChannel$MapMode r3 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L30
            r4 = 0
            java.nio.MappedByteBuffer r9 = r2.map(r3, r4, r6)     // Catch: java.lang.Throwable -> L30
            java.nio.MappedByteBuffer r9 = r9.load()     // Catch: java.lang.Throwable -> L30
            r2.close()     // Catch: java.io.IOException -> L2c
        L2c:
            r8.close()     // Catch: java.io.IOException -> L2f
        L2f:
            return r9
        L30:
            r0 = move-exception
            r9 = r0
            r1 = r2
            goto L4b
        L34:
            r0 = move-exception
            r9 = r0
            goto L4b
        L37:
            r0 = move-exception
            r9 = r0
            r8 = r1
            goto L4b
        L3b:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "File unsuitable for memory mapping"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L37
        L43:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L37
            java.lang.String r0 = "File too large to map into memory"
            r9.<init>(r0)     // Catch: java.lang.Throwable -> L37
            throw r9     // Catch: java.lang.Throwable -> L37
        L4b:
            if (r1 == 0) goto L50
            r1.close()     // Catch: java.io.IOException -> L50
        L50:
            if (r8 == 0) goto L55
            r8.close()     // Catch: java.io.IOException -> L55
        L55:
            throw r9
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static java.nio.ByteBuffer m364(java.io.InputStream r5) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r1 = 16384(0x4000, float:2.2959E-41)
            r0.<init>(r1)
            r2 = 0
            java.util.concurrent.atomic.AtomicReference r3 = defpackage.AbstractC0036.f535
            java.lang.Object r2 = r3.getAndSet(r2)
            byte[] r2 = (byte[]) r2
            if (r2 != 0) goto L14
            byte[] r2 = new byte[r1]
        L14:
            int r1 = r5.read(r2)
            if (r1 < 0) goto L1f
            r4 = 0
            r0.write(r2, r4, r1)
            goto L14
        L1f:
            r3.set(r2)
            byte[] r5 = r0.toByteArray()
            int r0 = r5.length
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteBuffer r5 = r0.put(r5)
            java.nio.ByteBuffer r5 = m362(r5)
            return r5
    }
}
