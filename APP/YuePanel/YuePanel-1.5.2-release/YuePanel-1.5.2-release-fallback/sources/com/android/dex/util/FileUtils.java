package com.android.dex.util;

/* JADX INFO: loaded from: classes.dex */
public final class FileUtils {
    private FileUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean hasArchiveSuffix(java.lang.String r1) {
            java.lang.String r0 = ".zip"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = ".jar"
            boolean r0 = r1.endsWith(r0)
            if (r0 != 0) goto L1b
            java.lang.String r0 = ".apk"
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L19
            goto L1b
        L19:
            r1 = 0
            goto L1c
        L1b:
            r1 = 1
        L1c:
            return r1
    }

    public static byte[] readFile(java.io.File r6) {
            boolean r0 = r6.exists()
            if (r0 == 0) goto La9
            boolean r0 = r6.isFile()
            if (r0 == 0) goto L92
            boolean r0 = r6.canRead()
            if (r0 == 0) goto L7b
            long r0 = r6.length()
            int r2 = (int) r0
            long r3 = (long) r2
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L64
            byte[] r0 = new byte[r2]
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> L47
            r1.<init>(r6)     // Catch: java.io.IOException -> L47
            r3 = 0
        L24:
            if (r2 <= 0) goto L49
            int r4 = r1.read(r0, r3, r2)     // Catch: java.io.IOException -> L47
            r5 = -1
            if (r4 == r5) goto L30
            int r3 = r3 + r4
            int r2 = r2 - r4
            goto L24
        L30:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.io.IOException -> L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L47
            r1.<init>()     // Catch: java.io.IOException -> L47
            r1.append(r6)     // Catch: java.io.IOException -> L47
            java.lang.String r2 = ": unexpected EOF"
            r1.append(r2)     // Catch: java.io.IOException -> L47
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L47
            r0.<init>(r1)     // Catch: java.io.IOException -> L47
            throw r0     // Catch: java.io.IOException -> L47
        L47:
            r0 = move-exception
            goto L4d
        L49:
            r1.close()     // Catch: java.io.IOException -> L47
            return r0
        L4d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            java.lang.String r6 = ": trouble reading"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            r1.<init>(r6, r0)
            throw r1
        L64:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = ": file too long"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L7b:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = ": file not readable"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L92:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = ": not a file"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        La9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r6)
            java.lang.String r6 = ": file not found"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
    }

    public static byte[] readFile(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            byte[] r1 = readFile(r0)
            return r1
    }
}
