package bsh.loader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class DataUtil {
    public DataUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String bytesToHex(byte[] r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L23
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            int r4 = r3.length()
            r5 = 1
            if (r4 != r5) goto L1d
            r4 = 48
            r0.append(r4)
        L1d:
            r0.append(r3)
            int r2 = r2 + 1
            goto L7
        L23:
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toUpperCase()
            return r6
    }

    public static java.lang.String getMd5ByBytes(byte[] r3) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> Lf
            byte[] r3 = r0.digest(r3)     // Catch: java.lang.Exception -> Lf
            java.lang.String r3 = bytesToHex(r3)     // Catch: java.lang.Exception -> Lf
            return r3
        Lf:
            r3 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[BeanShell] GetMd5ByBytes: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.println(r3)
            r3 = 0
            return r3
    }

    public static java.lang.String getMd5ByFilePath(java.lang.String r4) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L32
            r0.<init>(r4)     // Catch: java.lang.Exception -> L32
            java.lang.String r4 = "MD5"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch: java.lang.Throwable -> L1b
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L1b
        Lf:
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L1b
            r3 = -1
            if (r2 == r3) goto L1d
            r3 = 0
            r4.update(r1, r3, r2)     // Catch: java.lang.Throwable -> L1b
            goto Lf
        L1b:
            r4 = move-exception
            goto L29
        L1d:
            byte[] r4 = r4.digest()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = bytesToHex(r4)     // Catch: java.lang.Throwable -> L1b
            r0.close()     // Catch: java.lang.Exception -> L32
            return r4
        L29:
            r0.close()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r0 = move-exception
            r4.addSuppressed(r0)     // Catch: java.lang.Exception -> L32
        L31:
            throw r4     // Catch: java.lang.Exception -> L32
        L32:
            r4 = move-exception
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[BeanShell] GetMd5ByFilePath: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.println(r4)
            r4 = 0
            return r4
    }

    public static byte[] readAllBytes(java.io.InputStream r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            r3 = -1
            if (r2 == r3) goto L15
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L15:
            byte[] r4 = r0.toByteArray()
            return r4
    }
}
