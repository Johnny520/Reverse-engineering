package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۡۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C2292 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final java.lang.String f7553 = "ExifInterfaceUtils";

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۧ$ۥ, reason: contains not printable characters */
    @Yue.InterfaceC5336(21)
    public static class C2293 {
        public C2293() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m10651(java.io.FileDescriptor r0) throws android.system.ErrnoException {
                android.system.Os.close(r0)
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public static java.io.FileDescriptor m10652(java.io.FileDescriptor r0) throws android.system.ErrnoException {
                java.io.FileDescriptor r0 = android.system.Os.dup(r0)
                return r0
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static long m10653(java.io.FileDescriptor r0, long r1, int r3) throws android.system.ErrnoException {
                long r0 = android.system.Os.lseek(r0, r1, r3)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠ۡۧ$ۥ۟, reason: contains not printable characters */
    @Yue.InterfaceC5336(23)
    public static class C2294 {
        public C2294() {
                r0 = this;
                r0.<init>()
                return
        }

        @Yue.InterfaceC1947
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public static void m10654(android.media.MediaMetadataRetriever r0, android.media.MediaDataSource r1) {
                r0.setDataSource(r1)
                return
        }
    }

    public C2292() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static java.lang.String m10643(byte[] r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.length
            int r1 = r1 * 2
            r0.<init>(r1)
            r1 = 0
        L9:
            int r2 = r4.length
            if (r1 >= r2) goto L22
            r2 = r4[r1]
            java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r3 = "%02x"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r0.append(r2)
            int r1 = r1 + 1
            goto L9
        L22:
            java.lang.String r4 = r0.toString()
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m10644(java.io.FileDescriptor r1) {
            Yue.C2292.C2293.m10651(r1)     // Catch: java.lang.Exception -> L4
            goto Lb
        L4:
            java.lang.String r1 = "ExifInterfaceUtils"
            java.lang.String r0 = "Error closing fd."
            android.util.Log.e(r1, r0)
        Lb:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m10645(java.io.Closeable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            goto L8
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static long[] m10646(java.lang.Object r4) {
            boolean r0 = r4 instanceof int[]
            if (r0 == 0) goto L16
            int[] r4 = (int[]) r4
            int r0 = r4.length
            long[] r0 = new long[r0]
            r1 = 0
        La:
            int r2 = r4.length
            if (r1 >= r2) goto L15
            r2 = r4[r1]
            long r2 = (long) r2
            r0[r1] = r2
            int r1 = r1 + 1
            goto La
        L15:
            return r0
        L16:
            boolean r0 = r4 instanceof long[]
            if (r0 == 0) goto L1d
            long[] r4 = (long[]) r4
            return r4
        L1d:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static int m10647(java.io.InputStream r5, java.io.OutputStream r6) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r0 = new byte[r0]
            r1 = 0
            r2 = r1
        L6:
            int r3 = r5.read(r0)
            r4 = -1
            if (r3 == r4) goto L12
            int r2 = r2 + r3
            r6.write(r0, r1, r3)
            goto L6
        L12:
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static void m10648(java.io.InputStream r5, java.io.OutputStream r6, int r7) throws java.io.IOException {
            r0 = 8192(0x2000, float:1.148E-41)
            byte[] r1 = new byte[r0]
        L4:
            if (r7 <= 0) goto L1e
            int r2 = java.lang.Math.min(r7, r0)
            r3 = 0
            int r4 = r5.read(r1, r3, r2)
            if (r4 != r2) goto L16
            int r7 = r7 - r4
            r6.write(r1, r3, r4)
            goto L4
        L16:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r6 = "Failed to copy the given amount of bytes from the inputstream to the output stream."
            r5.<init>(r6)
            throw r5
        L1e:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static long m10649(java.lang.String r6) {
            int r0 = r6.length()     // Catch: java.lang.NumberFormatException -> L1b
            r1 = 3
            int r0 = java.lang.Math.min(r0, r1)     // Catch: java.lang.NumberFormatException -> L1b
            r2 = 0
            java.lang.String r6 = r6.substring(r2, r0)     // Catch: java.lang.NumberFormatException -> L1b
            long r2 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L1b
        L12:
            if (r0 >= r1) goto L1a
            r4 = 10
            long r2 = r2 * r4
            int r0 = r0 + 1
            goto L12
        L1a:
            return r2
        L1b:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static boolean m10650(byte[] r4, byte[] r5) {
            r0 = 0
            if (r4 == 0) goto L1b
            if (r5 != 0) goto L6
            goto L1b
        L6:
            int r1 = r4.length
            int r2 = r5.length
            if (r1 >= r2) goto Lb
            return r0
        Lb:
            r1 = r0
        Lc:
            int r2 = r5.length
            if (r1 >= r2) goto L19
            r2 = r4[r1]
            r3 = r5[r1]
            if (r2 == r3) goto L16
            return r0
        L16:
            int r1 = r1 + 1
            goto Lc
        L19:
            r4 = 1
            return r4
        L1b:
            return r0
    }
}
