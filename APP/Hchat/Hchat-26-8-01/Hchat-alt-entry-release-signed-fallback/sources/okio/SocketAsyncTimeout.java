package okio;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class SocketAsyncTimeout extends okio.AsyncTimeout {
    private final java.net.Socket socket;

    public SocketAsyncTimeout(java.net.Socket r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.socket = r1
            return
    }

    @Override // okio.AsyncTimeout
    public java.io.IOException newTimeoutException(java.io.IOException r3) {
            r2 = this;
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            r0.initCause(r3)
        Lc:
            return r0
    }

    @Override // okio.AsyncTimeout
    public void timedOut() {
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r5.socket     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> La
            r1.close()     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> La
            return
        L8:
            r1 = move-exception
            goto Lc
        La:
            r1 = move-exception
            goto L2b
        Lc:
            boolean r2 = okio.Okio.isAndroidGetsocknameError(r1)
            if (r2 == 0) goto L2a
            java.util.logging.Logger r2 = okio.Okio__JvmOkioKt.access$getLogger$p()
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.net.Socket r0 = r5.socket
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
            goto L42
        L2a:
            throw r1
        L2b:
            java.util.logging.Logger r2 = okio.Okio__JvmOkioKt.access$getLogger$p()
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r0)
            java.net.Socket r0 = r5.socket
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            r2.log(r3, r0, r1)
        L42:
            return
    }
}
