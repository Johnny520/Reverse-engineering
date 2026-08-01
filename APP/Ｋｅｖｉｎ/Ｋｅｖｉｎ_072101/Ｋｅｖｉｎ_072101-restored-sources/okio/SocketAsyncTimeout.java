package okio;

/* JADX INFO: compiled from: JvmOkio.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m115d2 = {"Lokio/SocketAsyncTimeout;", "Lokio/AsyncTimeout;", "socket", "Ljava/net/Socket;", "(Ljava/net/Socket;)V", "newTimeoutException", "Ljava/io/IOException;", "cause", "timedOut", "", "okio"}, m116k = 1, m117mv = {1, 9, 0}, m119xi = 48)
final class SocketAsyncTimeout extends okio.AsyncTimeout {
    private final java.net.Socket socket;

    public SocketAsyncTimeout(java.net.Socket r2) {
            r1 = this;
            java.lang.String r0 = "socket"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.<init>()
            r1.socket = r2
            return
    }

    @Override // okio.AsyncTimeout
    protected java.io.IOException newTimeoutException(java.io.IOException r3) {
            r2 = this;
            java.net.SocketTimeoutException r0 = new java.net.SocketTimeoutException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lf
            r1 = r3
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            r0.initCause(r1)
        Lf:
            r1 = r0
            java.io.IOException r1 = (java.io.IOException) r1
            return r1
    }

    @Override // okio.AsyncTimeout
    protected void timedOut() {
            r5 = this;
            java.lang.String r0 = "Failed to close timed out socket "
            java.net.Socket r1 = r5.socket     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> L30
            r1.close()     // Catch: java.lang.AssertionError -> L8 java.lang.Exception -> L30
            goto L50
        L8:
            r1 = move-exception
            boolean r2 = okio.Okio.isAndroidGetsocknameError(r1)
            if (r2 == 0) goto L2f
            java.util.logging.Logger r2 = okio.Okio__JvmOkioKt.access$getLogger$p()
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.net.Socket r4 = r5.socket
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r2.log(r3, r0, r4)
            goto L50
        L2f:
            throw r1
        L30:
            r1 = move-exception
            java.util.logging.Logger r2 = okio.Okio__JvmOkioKt.access$getLogger$p()
            java.util.logging.Level r3 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r0 = r4.append(r0)
            java.net.Socket r4 = r5.socket
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            r4 = r1
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            r2.log(r3, r0, r4)
        L50:
            return
    }
}
