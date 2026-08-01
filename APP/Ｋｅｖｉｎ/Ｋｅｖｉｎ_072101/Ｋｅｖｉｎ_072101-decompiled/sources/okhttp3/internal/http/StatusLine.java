package okhttp3.internal.http;

/* JADX INFO: compiled from: StatusLine.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m115d2 = {"Lokhttp3/internal/http/StatusLine;", "", "protocol", "Lokhttp3/Protocol;", "code", "", "message", "", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class StatusLine {
    public static final okhttp3.internal.http.StatusLine.Companion Companion = null;
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final java.lang.String message;
    public final okhttp3.Protocol protocol;

    /* JADX INFO: compiled from: StatusLine.kt */
    @kotlin.Metadata(m114d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m115d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "()V", "HTTP_CONTINUE", "", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "get", "Lokhttp3/internal/http/StatusLine;", "response", "Lokhttp3/Response;", "parse", "statusLine", "", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.http.StatusLine get(okhttp3.Response r5) {
                r4 = this;
                java.lang.String r0 = "response"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
                okhttp3.internal.http.StatusLine r0 = new okhttp3.internal.http.StatusLine
                okhttp3.Protocol r1 = r5.protocol()
                int r2 = r5.code()
                java.lang.String r3 = r5.message()
                r0.<init>(r1, r2, r3)
                return r0
        }

        public final okhttp3.internal.http.StatusLine parse(java.lang.String r9) throws java.io.IOException {
                r8 = this;
                java.lang.String r0 = "statusLine"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
                r0 = 0
                r1 = 0
                java.lang.String r2 = "HTTP/1."
                r3 = 0
                r4 = 2
                r5 = 0
                boolean r2 = kotlin.text.StringsKt.startsWith$default(r9, r2, r3, r4, r5)
                r6 = 32
                java.lang.String r7 = "Unexpected status line: "
                if (r2 == 0) goto L67
                int r2 = r9.length()
                r3 = 9
                if (r2 < r3) goto L50
                r2 = 8
                char r2 = r9.charAt(r2)
                if (r2 != r6) goto L50
                r2 = 7
                char r2 = r9.charAt(r2)
                int r2 = r2 + (-48)
                r0 = 9
                switch(r2) {
                    case 0: goto L4c;
                    case 1: goto L49;
                    default: goto L32;
                }
            L32:
                java.net.ProtocolException r3 = new java.net.ProtocolException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r4 = r4.append(r7)
                java.lang.StringBuilder r4 = r4.append(r9)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            L49:
                okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_1_1
                goto L4e
            L4c:
                okhttp3.Protocol r3 = okhttp3.Protocol.HTTP_1_0
            L4e:
                r1 = r3
                goto L72
            L50:
                java.net.ProtocolException r2 = new java.net.ProtocolException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.StringBuilder r3 = r3.append(r9)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L67:
                java.lang.String r2 = "ICY "
                boolean r2 = kotlin.text.StringsKt.startsWith$default(r9, r2, r3, r4, r5)
                if (r2 == 0) goto Lf6
                okhttp3.Protocol r1 = okhttp3.Protocol.HTTP_1_0
                r0 = 4
            L72:
                int r2 = r9.length()
                int r3 = r0 + 3
                if (r2 < r3) goto Ldf
            L7b:
                int r2 = r0 + 3
                java.lang.String r2 = r9.substring(r0, r2)     // Catch: java.lang.NumberFormatException -> Lc7
                java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch: java.lang.NumberFormatException -> Lc7
                int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> Lc7
                java.lang.String r3 = ""
                int r4 = r9.length()
                int r5 = r0 + 3
                if (r4 <= r5) goto Lc1
                int r4 = r0 + 3
                char r4 = r9.charAt(r4)
                if (r4 != r6) goto Laa
                int r4 = r0 + 4
                java.lang.String r4 = r9.substring(r4)
                java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
                r3 = r4
                goto Lc1
            Laa:
                java.net.ProtocolException r4 = new java.net.ProtocolException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.StringBuilder r5 = r5.append(r7)
                java.lang.StringBuilder r5 = r5.append(r9)
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
            Lc1:
                okhttp3.internal.http.StatusLine r4 = new okhttp3.internal.http.StatusLine
                r4.<init>(r1, r2, r3)
                return r4
            Lc7:
                r2 = move-exception
                java.net.ProtocolException r3 = new java.net.ProtocolException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.StringBuilder r4 = r4.append(r7)
                java.lang.StringBuilder r4 = r4.append(r9)
                java.lang.String r4 = r4.toString()
                r3.<init>(r4)
                throw r3
            Ldf:
                java.net.ProtocolException r2 = new java.net.ProtocolException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.StringBuilder r3 = r3.append(r9)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            Lf6:
                java.net.ProtocolException r2 = new java.net.ProtocolException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.StringBuilder r3 = r3.append(r7)
                java.lang.StringBuilder r3 = r3.append(r9)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }
    }

    static {
            okhttp3.internal.http.StatusLine$Companion r0 = new okhttp3.internal.http.StatusLine$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http.StatusLine.Companion = r0
            return
    }

    public StatusLine(okhttp3.Protocol r2, int r3, java.lang.String r4) {
            r1 = this;
            java.lang.String r0 = "protocol"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "message"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r1.<init>()
            r1.protocol = r2
            r1.code = r3
            r1.message = r4
            return
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = r0
            r2 = 0
            okhttp3.Protocol r3 = r6.protocol
            okhttp3.Protocol r4 = okhttp3.Protocol.HTTP_1_0
            if (r3 != r4) goto L13
            java.lang.String r3 = "HTTP/1.0"
            r1.append(r3)
            goto L18
        L13:
            java.lang.String r3 = "HTTP/1.1"
            r1.append(r3)
        L18:
            r3 = 32
            java.lang.StringBuilder r4 = r1.append(r3)
            int r5 = r6.code
            r4.append(r5)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r4 = r6.message
            r3.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "StringBuilder().apply(builderAction).toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            return r0
    }
}
