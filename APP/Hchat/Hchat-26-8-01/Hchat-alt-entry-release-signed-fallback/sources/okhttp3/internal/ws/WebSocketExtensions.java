package okhttp3.internal.ws;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketExtensions {
    public static final okhttp3.internal.ws.WebSocketExtensions.Companion Companion = null;
    private static final java.lang.String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final java.lang.Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final java.lang.Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

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

        public final okhttp3.internal.ws.WebSocketExtensions parse(okhttp3.Headers r19) {
                r18 = this;
                r0 = r19
                r0.getClass()
                int r1 = r0.size()
                r4 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
            L10:
                if (r4 >= r1) goto Le5
                java.lang.String r5 = r0.name(r4)
                java.lang.String r12 = "Sec-WebSocket-Extensions"
                boolean r5 = og.t.X(r5, r12)
                if (r5 != 0) goto L20
                goto Le1
            L20:
                java.lang.String r12 = r0.value(r4)
                r14 = 0
            L25:
                int r5 = r12.length()
                if (r14 >= r5) goto Le1
                r16 = 4
                r17 = 0
                r13 = 44
                r15 = 0
                int r5 = okhttp3.internal.Util.delimiterOffset$default(r12, r13, r14, r15, r16, r17)
                r13 = 59
                int r15 = okhttp3.internal.Util.delimiterOffset(r12, r13, r14, r5)
                java.lang.String r14 = okhttp3.internal.Util.trimSubstring(r12, r14, r15)
                r2 = 1
                int r15 = r15 + r2
                java.lang.String r3 = "permessage-deflate"
                boolean r3 = og.t.X(r14, r3)
                if (r3 == 0) goto Ldd
                if (r6 == 0) goto L4d
                r11 = r2
            L4d:
                r14 = r15
            L4e:
                if (r14 >= r5) goto Lda
                int r3 = okhttp3.internal.Util.delimiterOffset(r12, r13, r14, r5)
                r6 = 61
                int r6 = okhttp3.internal.Util.delimiterOffset(r12, r6, r14, r3)
                java.lang.String r14 = okhttp3.internal.Util.trimSubstring(r12, r14, r6)
                if (r6 >= r3) goto L83
                int r6 = r6 + 1
                java.lang.String r6 = okhttp3.internal.Util.trimSubstring(r12, r6, r3)
                r6.getClass()
                int r15 = r6.length()
                r13 = 2
                if (r15 < r13) goto L84
                java.lang.String r13 = "\""
                boolean r15 = og.m.H0(r6, r13)
                if (r15 == 0) goto L84
                boolean r13 = og.m.m0(r6, r13)
                if (r13 == 0) goto L84
                java.lang.String r6 = wb.en.f(r2, r2, r6)
                goto L84
            L83:
                r6 = 0
            L84:
                int r3 = r3 + 1
                java.lang.String r13 = "client_max_window_bits"
                boolean r13 = og.t.X(r14, r13)
                r15 = 10
                if (r13 == 0) goto La3
                if (r7 == 0) goto L93
                r11 = r2
            L93:
                if (r6 == 0) goto L9b
                java.lang.Integer r6 = og.t.e0(r15, r6)
                r7 = r6
                goto L9c
            L9b:
                r7 = 0
            L9c:
                if (r7 != 0) goto L9f
            L9e:
                r11 = r2
            L9f:
                r14 = r3
                r13 = 59
                goto L4e
            La3:
                java.lang.String r13 = "client_no_context_takeover"
                boolean r13 = og.t.X(r14, r13)
                if (r13 == 0) goto Lb3
                if (r8 == 0) goto Lae
                r11 = r2
            Lae:
                if (r6 == 0) goto Lb1
                r11 = r2
            Lb1:
                r8 = r2
                goto L9f
            Lb3:
                java.lang.String r13 = "server_max_window_bits"
                boolean r13 = og.t.X(r14, r13)
                if (r13 == 0) goto Lca
                if (r9 == 0) goto Lbe
                r11 = r2
            Lbe:
                if (r6 == 0) goto Lc6
                java.lang.Integer r6 = og.t.e0(r15, r6)
                r9 = r6
                goto Lc7
            Lc6:
                r9 = 0
            Lc7:
                if (r9 != 0) goto L9f
                goto L9e
            Lca:
                java.lang.String r13 = "server_no_context_takeover"
                boolean r13 = og.t.X(r14, r13)
                if (r13 == 0) goto L9e
                if (r10 == 0) goto Ld5
                r11 = r2
            Ld5:
                if (r6 == 0) goto Ld8
                r11 = r2
            Ld8:
                r10 = r2
                goto L9f
            Lda:
                r6 = r2
                goto L25
            Ldd:
                r11 = r2
                r14 = r15
                goto L25
            Le1:
                int r4 = r4 + 1
                goto L10
            Le5:
                okhttp3.internal.ws.WebSocketExtensions r5 = new okhttp3.internal.ws.WebSocketExtensions
                r5.<init>(r6, r7, r8, r9, r10, r11)
                return r5
        }
    }

    static {
            okhttp3.internal.ws.WebSocketExtensions$Companion r0 = new okhttp3.internal.ws.WebSocketExtensions$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.ws.WebSocketExtensions.Companion = r0
            return
    }

    public WebSocketExtensions() {
            r9 = this;
            r7 = 63
            r8 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public WebSocketExtensions(boolean r1, java.lang.Integer r2, boolean r3, java.lang.Integer r4, boolean r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.perMessageDeflate = r1
            r0.clientMaxWindowBits = r2
            r0.clientNoContextTakeover = r3
            r0.serverMaxWindowBits = r4
            r0.serverNoContextTakeover = r5
            r0.unknownValues = r6
            return
    }

    public /* synthetic */ WebSocketExtensions(boolean r3, java.lang.Integer r4, boolean r5, java.lang.Integer r6, boolean r7, boolean r8, int r9, gg.g r10) {
            r2 = this;
            r10 = r9 & 1
            r0 = 0
            if (r10 == 0) goto L6
            r3 = r0
        L6:
            r10 = r9 & 2
            r1 = 0
            if (r10 == 0) goto Lc
            r4 = r1
        Lc:
            r10 = r9 & 4
            if (r10 == 0) goto L11
            r5 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r6 = r1
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r7 = r0
        L1b:
            r9 = r9 & 32
            if (r9 == 0) goto L27
            r9 = r0
        L20:
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            goto L29
        L27:
            r9 = r8
            goto L20
        L29:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
    }

    public static /* synthetic */ okhttp3.internal.ws.WebSocketExtensions copy$default(okhttp3.internal.ws.WebSocketExtensions r0, boolean r1, java.lang.Integer r2, boolean r3, java.lang.Integer r4, boolean r5, boolean r6, int r7, java.lang.Object r8) {
            r8 = r7 & 1
            if (r8 == 0) goto L6
            boolean r1 = r0.perMessageDeflate
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto Lc
            java.lang.Integer r2 = r0.clientMaxWindowBits
        Lc:
            r8 = r7 & 4
            if (r8 == 0) goto L12
            boolean r3 = r0.clientNoContextTakeover
        L12:
            r8 = r7 & 8
            if (r8 == 0) goto L18
            java.lang.Integer r4 = r0.serverMaxWindowBits
        L18:
            r8 = r7 & 16
            if (r8 == 0) goto L1e
            boolean r5 = r0.serverNoContextTakeover
        L1e:
            r7 = r7 & 32
            if (r7 == 0) goto L24
            boolean r6 = r0.unknownValues
        L24:
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            r2 = r0
            okhttp3.internal.ws.WebSocketExtensions r0 = r2.copy(r3, r4, r5, r6, r7, r8)
            return r0
    }

    public final boolean component1() {
            r1 = this;
            boolean r0 = r1.perMessageDeflate
            return r0
    }

    public final java.lang.Integer component2() {
            r1 = this;
            java.lang.Integer r0 = r1.clientMaxWindowBits
            return r0
    }

    public final boolean component3() {
            r1 = this;
            boolean r0 = r1.clientNoContextTakeover
            return r0
    }

    public final java.lang.Integer component4() {
            r1 = this;
            java.lang.Integer r0 = r1.serverMaxWindowBits
            return r0
    }

    public final boolean component5() {
            r1 = this;
            boolean r0 = r1.serverNoContextTakeover
            return r0
    }

    public final boolean component6() {
            r1 = this;
            boolean r0 = r1.unknownValues
            return r0
    }

    public final okhttp3.internal.ws.WebSocketExtensions copy(boolean r8, java.lang.Integer r9, boolean r10, java.lang.Integer r11, boolean r12, boolean r13) {
            r7 = this;
            okhttp3.internal.ws.WebSocketExtensions r0 = new okhttp3.internal.ws.WebSocketExtensions
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof okhttp3.internal.ws.WebSocketExtensions
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            okhttp3.internal.ws.WebSocketExtensions r5 = (okhttp3.internal.ws.WebSocketExtensions) r5
            boolean r1 = r4.perMessageDeflate
            boolean r3 = r5.perMessageDeflate
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.Integer r1 = r4.clientMaxWindowBits
            java.lang.Integer r3 = r5.clientMaxWindowBits
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            boolean r1 = r4.clientNoContextTakeover
            boolean r3 = r5.clientNoContextTakeover
            if (r1 == r3) goto L25
            return r2
        L25:
            java.lang.Integer r1 = r4.serverMaxWindowBits
            java.lang.Integer r3 = r5.serverMaxWindowBits
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            boolean r1 = r4.serverNoContextTakeover
            boolean r3 = r5.serverNoContextTakeover
            if (r1 == r3) goto L37
            return r2
        L37:
            boolean r1 = r4.unknownValues
            boolean r5 = r5.unknownValues
            if (r1 == r5) goto L3e
            return r2
        L3e:
            return r0
    }

    public int hashCode() {
            r4 = this;
            boolean r0 = r4.perMessageDeflate
            r1 = 1
            if (r0 == 0) goto L6
            r0 = r1
        L6:
            int r0 = r0 * 31
            java.lang.Integer r2 = r4.clientMaxWindowBits
            r3 = 0
            if (r2 != 0) goto Lf
            r2 = r3
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r4.clientNoContextTakeover
            if (r2 == 0) goto L1b
            r2 = r1
        L1b:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Integer r2 = r4.serverMaxWindowBits
            if (r2 != 0) goto L23
            goto L27
        L23:
            int r3 = r2.hashCode()
        L27:
            int r0 = r0 + r3
            int r0 = r0 * 31
            boolean r2 = r4.serverNoContextTakeover
            if (r2 == 0) goto L2f
            r2 = r1
        L2f:
            int r0 = r0 + r2
            int r0 = r0 * 31
            boolean r2 = r4.unknownValues
            if (r2 == 0) goto L37
            goto L38
        L37:
            r1 = r2
        L38:
            int r0 = r0 + r1
            return r0
    }

    public final boolean noContextTakeover(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            boolean r1 = r0.clientNoContextTakeover
            return r1
        L5:
            boolean r1 = r0.serverNoContextTakeover
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WebSocketExtensions(perMessageDeflate="
            r0.<init>(r1)
            boolean r1 = r2.perMessageDeflate
            r0.append(r1)
            java.lang.String r1 = ", clientMaxWindowBits="
            r0.append(r1)
            java.lang.Integer r1 = r2.clientMaxWindowBits
            r0.append(r1)
            java.lang.String r1 = ", clientNoContextTakeover="
            r0.append(r1)
            boolean r1 = r2.clientNoContextTakeover
            r0.append(r1)
            java.lang.String r1 = ", serverMaxWindowBits="
            r0.append(r1)
            java.lang.Integer r1 = r2.serverMaxWindowBits
            r0.append(r1)
            java.lang.String r1 = ", serverNoContextTakeover="
            r0.append(r1)
            boolean r1 = r2.serverNoContextTakeover
            r0.append(r1)
            java.lang.String r1 = ", unknownValues="
            r0.append(r1)
            boolean r1 = r2.unknownValues
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
