package okhttp3.internal.p004ws;

/* JADX INFO: compiled from: WebSocketExtensions.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cBE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0002\u0010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003JN\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\u000e\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m115d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", "", "perMessageDeflate", "", "clientMaxWindowBits", "", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", "hashCode", "noContextTakeover", "clientOriginated", "toString", "", "Companion", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
public final class WebSocketExtensions {
    public static final okhttp3.internal.ws.WebSocketExtensions.Companion Companion = null;
    private static final java.lang.String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final java.lang.Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final java.lang.Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    /* JADX INFO: compiled from: WebSocketExtensions.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\t"}, m115d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", "", "()V", "HEADER_WEB_SOCKET_EXTENSION", "", "parse", "Lokhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lokhttp3/Headers;", "okhttp"}, m116k = 1, m117mv = {1, 8, 0}, m119xi = 48)
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

        public final okhttp3.internal.p004ws.WebSocketExtensions parse(okhttp3.Headers r23) throws java.io.IOException {
                r22 = this;
                r0 = r23
                java.lang.String r1 = "responseHeaders"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                int r8 = r23.size()
            L12:
                if (r7 >= r8) goto L134
                java.lang.String r9 = r0.name(r7)
                java.lang.String r10 = "Sec-WebSocket-Extensions"
                r11 = 1
                boolean r9 = kotlin.text.StringsKt.equals(r9, r10, r11)
                if (r9 != 0) goto L25
                r20 = r8
                goto L12c
            L25:
                java.lang.String r9 = r0.value(r7)
                r10 = 0
            L2a:
                int r12 = r9.length()
                if (r10 >= r12) goto L12a
                r16 = 4
                r17 = 0
                r13 = 44
                r15 = 0
                r12 = r9
                r14 = r10
                int r12 = okhttp3.internal.Util.delimiterOffset$default(r12, r13, r14, r15, r16, r17)
                r13 = 59
                int r14 = okhttp3.internal.Util.delimiterOffset(r9, r13, r10, r12)
                java.lang.String r15 = okhttp3.internal.Util.trimSubstring(r9, r10, r14)
                int r10 = r14 + 1
                java.lang.String r13 = "permessage-deflate"
                boolean r13 = kotlin.text.StringsKt.equals(r15, r13, r11)
                if (r13 == 0) goto L120
                if (r1 == 0) goto L55
                r6 = 1
            L55:
                r1 = 1
            L56:
                if (r10 >= r12) goto L113
                r13 = 59
                int r11 = okhttp3.internal.Util.delimiterOffset(r9, r13, r10, r12)
                r13 = 61
                int r13 = okhttp3.internal.Util.delimiterOffset(r9, r13, r10, r11)
                java.lang.String r0 = okhttp3.internal.Util.trimSubstring(r9, r10, r13)
                r18 = 0
                if (r13 >= r11) goto L81
                r19 = r1
                int r1 = r13 + 1
                java.lang.String r1 = okhttp3.internal.Util.trimSubstring(r9, r1, r11)
                java.lang.String r20 = "\""
                r21 = r6
                r6 = r20
                java.lang.CharSequence r6 = (java.lang.CharSequence) r6
                java.lang.String r1 = kotlin.text.StringsKt.removeSurrounding(r1, r6)
                goto L87
            L81:
                r19 = r1
                r21 = r6
                r1 = r18
            L87:
                int r10 = r11 + 1
                java.lang.String r6 = "client_max_window_bits"
                r20 = r8
                r8 = 1
                boolean r6 = kotlin.text.StringsKt.equals(r0, r6, r8)
                if (r6 == 0) goto Laf
                if (r2 == 0) goto L9a
                r6 = 1
                goto L9c
            L9a:
                r6 = r21
            L9c:
                if (r1 == 0) goto La2
                java.lang.Integer r18 = kotlin.text.StringsKt.toIntOrNull(r1)
            La2:
                r2 = r18
                if (r2 != 0) goto La7
                r6 = 1
            La7:
                r0 = r23
                r1 = r19
                r8 = r20
                r11 = 1
                goto L56
            Laf:
                java.lang.String r6 = "client_no_context_takeover"
                r8 = 1
                boolean r6 = kotlin.text.StringsKt.equals(r0, r6, r8)
                if (r6 == 0) goto Lca
                if (r3 == 0) goto Lbc
                r6 = 1
                goto Lbe
            Lbc:
                r6 = r21
            Lbe:
                if (r1 == 0) goto Lc1
                r6 = 1
            Lc1:
                r3 = 1
                r0 = r23
                r1 = r19
                r8 = r20
                r11 = 1
                goto L56
            Lca:
                java.lang.String r6 = "server_max_window_bits"
                r8 = 1
                boolean r6 = kotlin.text.StringsKt.equals(r0, r6, r8)
                if (r6 == 0) goto Led
                if (r4 == 0) goto Ld7
                r6 = 1
                goto Ld9
            Ld7:
                r6 = r21
            Ld9:
                if (r1 == 0) goto Ldf
                java.lang.Integer r18 = kotlin.text.StringsKt.toIntOrNull(r1)
            Ldf:
                r4 = r18
                if (r4 != 0) goto Le4
                r6 = 1
            Le4:
                r0 = r23
                r1 = r19
                r8 = r20
                r11 = 1
                goto L56
            Led:
                java.lang.String r6 = "server_no_context_takeover"
                r8 = 1
                boolean r6 = kotlin.text.StringsKt.equals(r0, r6, r8)
                if (r6 == 0) goto L109
                if (r5 == 0) goto Lfa
                r6 = 1
                goto Lfc
            Lfa:
                r6 = r21
            Lfc:
                if (r1 == 0) goto Lff
                r6 = 1
            Lff:
                r5 = 1
                r0 = r23
                r11 = r8
                r1 = r19
                r8 = r20
                goto L56
            L109:
                r6 = 1
                r0 = r23
                r11 = r8
                r1 = r19
                r8 = r20
                goto L56
            L113:
                r19 = r1
                r21 = r6
                r20 = r8
                r8 = r11
                r0 = r23
                r8 = r20
                goto L2a
            L120:
                r20 = r8
                r8 = r11
                r6 = 1
                r0 = r23
                r8 = r20
                goto L2a
            L12a:
                r20 = r8
            L12c:
                int r7 = r7 + 1
                r0 = r23
                r8 = r20
                goto L12
            L134:
                okhttp3.internal.ws.WebSocketExtensions r0 = new okhttp3.internal.ws.WebSocketExtensions
                r9 = r0
                r10 = r1
                r11 = r2
                r12 = r3
                r13 = r4
                r14 = r5
                r15 = r6
                r9.<init>(r10, r11, r12, r13, r14, r15)
                return r0
        }
    }

    static {
            okhttp3.internal.ws.WebSocketExtensions$Companion r0 = new okhttp3.internal.ws.WebSocketExtensions$Companion
            r1 = 0
            r0.<init>(r1)
            okhttp3.internal.p004ws.WebSocketExtensions.Companion = r0
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

    public /* synthetic */ WebSocketExtensions(boolean r6, java.lang.Integer r7, boolean r8, java.lang.Integer r9, boolean r10, boolean r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
            r5 = this;
            r13 = r12 & 1
            r0 = 0
            if (r13 == 0) goto L7
            r13 = r0
            goto L8
        L7:
            r13 = r6
        L8:
            r6 = r12 & 2
            r1 = 0
            if (r6 == 0) goto Lf
            r2 = r1
            goto L10
        Lf:
            r2 = r7
        L10:
            r6 = r12 & 4
            if (r6 == 0) goto L16
            r3 = r0
            goto L17
        L16:
            r3 = r8
        L17:
            r6 = r12 & 8
            if (r6 == 0) goto L1c
            goto L1d
        L1c:
            r1 = r9
        L1d:
            r6 = r12 & 16
            if (r6 == 0) goto L23
            r4 = r0
            goto L24
        L23:
            r4 = r10
        L24:
            r6 = r12 & 32
            if (r6 == 0) goto L2a
            r12 = r0
            goto L2b
        L2a:
            r12 = r11
        L2b:
            r6 = r5
            r7 = r13
            r8 = r2
            r9 = r3
            r10 = r1
            r11 = r4
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
    }

    public static /* synthetic */ okhttp3.internal.p004ws.WebSocketExtensions copy$default(okhttp3.internal.p004ws.WebSocketExtensions r4, boolean r5, java.lang.Integer r6, boolean r7, java.lang.Integer r8, boolean r9, boolean r10, int r11, java.lang.Object r12) {
            r12 = r11 & 1
            if (r12 == 0) goto L6
            boolean r5 = r4.perMessageDeflate
        L6:
            r12 = r11 & 2
            if (r12 == 0) goto Lc
            java.lang.Integer r6 = r4.clientMaxWindowBits
        Lc:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L13
            boolean r7 = r4.clientNoContextTakeover
        L13:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L1a
            java.lang.Integer r8 = r4.serverMaxWindowBits
        L1a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L21
            boolean r9 = r4.serverNoContextTakeover
        L21:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L28
            boolean r10 = r4.unknownValues
        L28:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            okhttp3.internal.ws.WebSocketExtensions r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
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

    public final okhttp3.internal.p004ws.WebSocketExtensions copy(boolean r9, java.lang.Integer r10, boolean r11, java.lang.Integer r12, boolean r13, boolean r14) {
            r8 = this;
            okhttp3.internal.ws.WebSocketExtensions r7 = new okhttp3.internal.ws.WebSocketExtensions
            r0 = r7
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof okhttp3.internal.p004ws.WebSocketExtensions
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            r1 = r6
            okhttp3.internal.ws.WebSocketExtensions r1 = (okhttp3.internal.p004ws.WebSocketExtensions) r1
            boolean r3 = r5.perMessageDeflate
            boolean r4 = r1.perMessageDeflate
            if (r3 == r4) goto L14
            return r2
        L14:
            java.lang.Integer r3 = r5.clientMaxWindowBits
            java.lang.Integer r4 = r1.clientMaxWindowBits
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L1f
            return r2
        L1f:
            boolean r3 = r5.clientNoContextTakeover
            boolean r4 = r1.clientNoContextTakeover
            if (r3 == r4) goto L26
            return r2
        L26:
            java.lang.Integer r3 = r5.serverMaxWindowBits
            java.lang.Integer r4 = r1.serverMaxWindowBits
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r3 != 0) goto L31
            return r2
        L31:
            boolean r3 = r5.serverNoContextTakeover
            boolean r4 = r1.serverNoContextTakeover
            if (r3 == r4) goto L38
            return r2
        L38:
            boolean r3 = r5.unknownValues
            boolean r1 = r1.unknownValues
            if (r3 == r1) goto L3f
            return r2
        L3f:
            return r0
    }

    public int hashCode() {
            r5 = this;
            boolean r0 = r5.perMessageDeflate
            r1 = 1
            if (r0 == 0) goto L6
            r0 = r1
        L6:
            int r2 = r0 * 31
            java.lang.Integer r3 = r5.clientMaxWindowBits
            r4 = 0
            if (r3 != 0) goto Lf
            r3 = r4
            goto L15
        Lf:
            java.lang.Integer r3 = r5.clientMaxWindowBits
            int r3 = r3.hashCode()
        L15:
            int r2 = r2 + r3
            int r0 = r2 * 31
            boolean r3 = r5.clientNoContextTakeover
            if (r3 == 0) goto L1d
            r3 = r1
        L1d:
            int r0 = r0 + r3
            int r2 = r0 * 31
            java.lang.Integer r3 = r5.serverMaxWindowBits
            if (r3 != 0) goto L25
            goto L2b
        L25:
            java.lang.Integer r3 = r5.serverMaxWindowBits
            int r4 = r3.hashCode()
        L2b:
            int r2 = r2 + r4
            int r0 = r2 * 31
            boolean r3 = r5.serverNoContextTakeover
            if (r3 == 0) goto L33
            r3 = r1
        L33:
            int r0 = r0 + r3
            int r2 = r0 * 31
            boolean r3 = r5.unknownValues
            if (r3 == 0) goto L3b
            goto L3c
        L3b:
            r1 = r3
        L3c:
            int r2 = r2 + r1
            return r2
    }

    public final boolean noContextTakeover(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L5
            boolean r0 = r1.clientNoContextTakeover
            goto L7
        L5:
            boolean r0 = r1.serverNoContextTakeover
        L7:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "WebSocketExtensions(perMessageDeflate="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.perMessageDeflate
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", clientMaxWindowBits="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Integer r1 = r2.clientMaxWindowBits
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", clientNoContextTakeover="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.clientNoContextTakeover
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", serverMaxWindowBits="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Integer r1 = r2.serverMaxWindowBits
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", serverNoContextTakeover="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.serverNoContextTakeover
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", unknownValues="
            java.lang.StringBuilder r0 = r0.append(r1)
            boolean r1 = r2.unknownValues
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
