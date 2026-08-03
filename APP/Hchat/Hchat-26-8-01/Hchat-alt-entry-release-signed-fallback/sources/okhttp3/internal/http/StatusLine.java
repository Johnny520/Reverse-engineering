package okhttp3.internal.http;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class StatusLine {
    public static final okhttp3.internal.http.StatusLine.Companion Companion = null;
    public static final int HTTP_CONTINUE = 100;
    public static final int HTTP_MISDIRECTED_REQUEST = 421;
    public static final int HTTP_PERM_REDIRECT = 308;
    public static final int HTTP_TEMP_REDIRECT = 307;
    public final int code;
    public final java.lang.String message;
    public final okhttp3.Protocol protocol;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(gg.g r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public final okhttp3.internal.http.StatusLine get(okhttp3.Response r4) {
                r3 = this;
                r4.getClass()
                okhttp3.internal.http.StatusLine r0 = new okhttp3.internal.http.StatusLine
                okhttp3.Protocol r1 = r4.protocol()
                int r2 = r4.code()
                java.lang.String r4 = r4.message()
                r0.<init>(r1, r2, r4)
                return r0
        }

        public final okhttp3.internal.http.StatusLine parse(java.lang.String r9) {
                r8 = this;
                r9.getClass()
                java.lang.String r0 = "HTTP/1."
                r1 = 0
                boolean r0 = og.t.d0(r9, r0, r1)
                r2 = 4
                r3 = 32
                java.lang.String r4 = "Unexpected status line: "
                if (r0 == 0) goto L47
                int r0 = r9.length()
                r1 = 9
                if (r0 < r1) goto L3d
                r0 = 8
                char r0 = r9.charAt(r0)
                if (r0 != r3) goto L3d
                r0 = 7
                char r0 = r9.charAt(r0)
                int r0 = r0 + (-48)
                if (r0 == 0) goto L3a
                r5 = 1
                if (r0 != r5) goto L30
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_1
                goto L52
            L30:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r9 = r4.concat(r9)
                r0.<init>(r9)
                throw r0
            L3a:
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                goto L52
            L3d:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r9 = r4.concat(r9)
                r0.<init>(r9)
                throw r0
            L47:
                java.lang.String r0 = "ICY "
                boolean r0 = og.t.d0(r9, r0, r1)
                if (r0 == 0) goto L9a
                okhttp3.Protocol r0 = okhttp3.Protocol.HTTP_1_0
                r1 = r2
            L52:
                int r5 = r9.length()
                int r6 = r1 + 3
                if (r5 < r6) goto L90
                java.lang.String r5 = r9.substring(r1, r6)     // Catch: java.lang.NumberFormatException -> L86
                int r5 = java.lang.Integer.parseInt(r5)     // Catch: java.lang.NumberFormatException -> L86
                int r7 = r9.length()
                if (r7 <= r6) goto L7e
                char r6 = r9.charAt(r6)
                if (r6 != r3) goto L74
                int r1 = r1 + r2
                java.lang.String r9 = r9.substring(r1)
                goto L80
            L74:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r9 = r4.concat(r9)
                r0.<init>(r9)
                throw r0
            L7e:
                java.lang.String r9 = ""
            L80:
                okhttp3.internal.http.StatusLine r1 = new okhttp3.internal.http.StatusLine
                r1.<init>(r0, r5, r9)
                return r1
            L86:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r9 = r4.concat(r9)
                r0.<init>(r9)
                throw r0
            L90:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r9 = r4.concat(r9)
                r0.<init>(r9)
                throw r0
            L9a:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.String r9 = r4.concat(r9)
                r0.<init>(r9)
                throw r0
        }
    }

    static {
            okhttp3.internal.http.StatusLine$Companion r0 = new okhttp3.internal.http.StatusLine$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.http.StatusLine.Companion = r0
            return
    }

    public StatusLine(okhttp3.Protocol r1, int r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>()
            r0.protocol = r1
            r0.code = r2
            r0.message = r3
            return
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            okhttp3.Protocol r1 = r3.protocol
            okhttp3.Protocol r2 = okhttp3.Protocol.HTTP_1_0
            if (r1 != r2) goto L11
            java.lang.String r1 = "HTTP/1.0"
            r0.append(r1)
            goto L16
        L11:
            java.lang.String r1 = "HTTP/1.1"
            r0.append(r1)
        L16:
            r1 = 32
            r0.append(r1)
            int r2 = r3.code
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r3.message
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
