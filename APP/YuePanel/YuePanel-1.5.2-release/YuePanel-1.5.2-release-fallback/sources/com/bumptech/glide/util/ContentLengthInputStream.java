package com.bumptech.glide.util;

/* JADX INFO: loaded from: classes.dex */
public final class ContentLengthInputStream extends java.io.FilterInputStream {
    private static final java.lang.String TAG = "ContentLengthStream";
    private static final int UNKNOWN = -1;
    private final long contentLength;
    private int readSoFar;

    private ContentLengthInputStream(@Yue.InterfaceC4410 java.io.InputStream r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.contentLength = r2
            return
    }

    private int checkReadSoFarOrThrow(int r5) throws java.io.IOException {
            r4 = this;
            if (r5 < 0) goto L8
            int r0 = r4.readSoFar
            int r0 = r0 + r5
            r4.readSoFar = r0
            goto L14
        L8:
            long r0 = r4.contentLength
            int r2 = r4.readSoFar
            long r2 = (long) r2
            long r0 = r0 - r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L15
        L14:
            return r5
        L15:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to read all expected data, expected: "
            r0.append(r1)
            long r1 = r4.contentLength
            r0.append(r1)
            java.lang.String r1 = ", but read: "
            r0.append(r1)
            int r1 = r4.readSoFar
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }

    @Yue.InterfaceC4410
    public static java.io.InputStream obtain(@Yue.InterfaceC4410 java.io.InputStream r1, long r2) {
            com.bumptech.glide.util.ContentLengthInputStream r0 = new com.bumptech.glide.util.ContentLengthInputStream
            r0.<init>(r1, r2)
            return r0
    }

    @Yue.InterfaceC4410
    public static java.io.InputStream obtain(@Yue.InterfaceC4410 java.io.InputStream r2, @Yue.InterfaceC4544 java.lang.String r3) {
            int r3 = parseContentLength(r3)
            long r0 = (long) r3
            java.io.InputStream r2 = obtain(r2, r0)
            return r2
    }

    private static int parseContentLength(@Yue.InterfaceC4544 java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L29
            int r4 = java.lang.Integer.parseInt(r4)     // Catch: java.lang.NumberFormatException -> Lb
            goto L2a
        Lb:
            r0 = move-exception
            r1 = 3
            java.lang.String r2 = "ContentLengthStream"
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "failed to parse content length header: "
            r1.append(r3)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            android.util.Log.d(r2, r4, r0)
        L29:
            r4 = -1
        L2a:
            return r4
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            long r0 = r4.contentLength     // Catch: java.lang.Throwable -> L15
            int r2 = r4.readSoFar     // Catch: java.lang.Throwable -> L15
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L15
            long r0 = r0 - r2
            java.io.InputStream r2 = r4.in     // Catch: java.lang.Throwable -> L15
            int r2 = r2.available()     // Catch: java.lang.Throwable -> L15
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L15
            long r0 = java.lang.Math.max(r0, r2)     // Catch: java.lang.Throwable -> L15
            int r0 = (int) r0
            monitor-exit(r4)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int r0 = super.read()     // Catch: java.lang.Throwable -> Lf
            if (r0 < 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = -1
        La:
            r2.checkReadSoFarOrThrow(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.length
            r1 = 0
            int r3 = r2.read(r3, r1, r0)
            return r3
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            monitor-enter(r0)
            int r1 = super.read(r1, r2, r3)     // Catch: java.lang.Throwable -> Lb
            int r1 = r0.checkReadSoFarOrThrow(r1)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}
