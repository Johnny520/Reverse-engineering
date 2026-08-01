package okhttp3.internal.p218ws;

import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8644z;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m16757d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dBG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003JN\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0004\n\u0002\u0010\fR\u0010\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m16758d2 = {"Lokhttp3/internal/ws/WebSocketExtensions;", _UrlKt.FRAGMENT_ENCODE_SET, "perMessageDeflate", _UrlKt.FRAGMENT_ENCODE_SET, "clientMaxWindowBits", _UrlKt.FRAGMENT_ENCODE_SET, "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "Ljava/lang/Integer;", "noContextTakeover", "clientOriginated", "component1", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "copy", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lokhttp3/internal/ws/WebSocketExtensions;", "equals", "other", "hashCode", "toString", _UrlKt.FRAGMENT_ENCODE_SET, "Companion", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
public final /* data */ class WebSocketExtensions {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    public /* synthetic */ WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? null : num, (i10 & 4) != 0 ? false : z11, (i10 & 8) != 0 ? null : num2, (i10 & 16) != 0 ? false : z12, (i10 & 32) != 0 ? false : z13);
    }

    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = webSocketExtensions.perMessageDeflate;
        }
        if ((i10 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i10 & 4) != 0) {
            z11 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i10 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i10 & 16) != 0) {
            z12 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i10 & 32) != 0) {
            z13 = webSocketExtensions.unknownValues;
        }
        boolean z14 = z12;
        boolean z15 = z13;
        return webSocketExtensions.copy(z10, num, z11, num2, z14, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getPerMessageDeflate() {
        return this.perMessageDeflate;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getClientMaxWindowBits() {
        return this.clientMaxWindowBits;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getClientNoContextTakeover() {
        return this.clientNoContextTakeover;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getServerMaxWindowBits() {
        return this.serverMaxWindowBits;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getServerNoContextTakeover() {
        return this.serverNoContextTakeover;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getUnknownValues() {
        return this.unknownValues;
    }

    public final WebSocketExtensions copy(boolean perMessageDeflate, Integer clientMaxWindowBits, boolean clientNoContextTakeover, Integer serverMaxWindowBits, boolean serverNoContextTakeover, boolean unknownValues) {
        return new WebSocketExtensions(perMessageDeflate, clientMaxWindowBits, clientNoContextTakeover, serverMaxWindowBits, serverNoContextTakeover, unknownValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) other;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && AbstractC1061t.m3842c(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && AbstractC1061t.m3842c(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.perMessageDeflate) * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Boolean.hashCode(this.clientNoContextTakeover)) * 31;
        Integer num2 = this.serverMaxWindowBits;
        return ((((iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31) + Boolean.hashCode(this.serverNoContextTakeover)) * 31) + Boolean.hashCode(this.unknownValues);
    }

    public final boolean noContextTakeover(boolean clientOriginated) {
        return clientOriginated ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, m16758d2 = {"Lokhttp3/internal/ws/WebSocketExtensions$Companion;", _UrlKt.FRAGMENT_ENCODE_SET, "<init>", "()V", "HEADER_WEB_SOCKET_EXTENSION", _UrlKt.FRAGMENT_ENCODE_SET, "parse", "Lokhttp3/internal/ws/WebSocketExtensions;", "responseHeaders", "Lokhttp3/Headers;", "okhttp"}, m16759k = 1, m16760mv = {2, 2, 0}, m16762xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC1043k abstractC1043k) {
            this();
        }

        public final WebSocketExtensions parse(Headers responseHeaders) {
            responseHeaders.getClass();
            int size = responseHeaders.size();
            boolean z10 = false;
            Integer numM33252s = null;
            boolean z11 = false;
            Integer numM33252s2 = null;
            boolean z12 = false;
            boolean z13 = false;
            for (int i10 = 0; i10 < size; i10++) {
                if (AbstractC8611a0.m33061F(responseHeaders.name(i10), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION, true)) {
                    String strValue = responseHeaders.value(i10);
                    int i11 = 0;
                    while (i11 < strValue.length()) {
                        int i12 = i11;
                        int iDelimiterOffset$default = _UtilCommonKt.delimiterOffset$default(strValue, ',', i12, 0, 4, (Object) null);
                        int iDelimiterOffset = _UtilCommonKt.delimiterOffset(strValue, ';', i12, iDelimiterOffset$default);
                        String strTrimSubstring = _UtilCommonKt.trimSubstring(strValue, i12, iDelimiterOffset);
                        int i13 = iDelimiterOffset + 1;
                        if (AbstractC8611a0.m33061F(strTrimSubstring, "permessage-deflate", true)) {
                            if (!z10) {
                                z13 = true;
                                while (i13 < iDelimiterOffset$default) {
                                    int iDelimiterOffset2 = _UtilCommonKt.delimiterOffset(strValue, ';', i13, iDelimiterOffset$default);
                                    int iDelimiterOffset3 = _UtilCommonKt.delimiterOffset(strValue, '=', i13, iDelimiterOffset2);
                                    String strTrimSubstring2 = _UtilCommonKt.trimSubstring(strValue, i13, iDelimiterOffset3);
                                    String strM33104K0 = iDelimiterOffset3 < iDelimiterOffset2 ? AbstractC8621f0.m33104K0(_UtilCommonKt.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2), "\"") : null;
                                    int i14 = iDelimiterOffset2 + 1;
                                    if (AbstractC8611a0.m33061F(strTrimSubstring2, "client_max_window_bits", true)) {
                                        if (numM33252s != null) {
                                            z13 = true;
                                        }
                                        numM33252s = strM33104K0 != null ? AbstractC8644z.m33252s(strM33104K0) : null;
                                        i13 = numM33252s == null ? i14 : i14;
                                    } else if (AbstractC8611a0.m33061F(strTrimSubstring2, "client_no_context_takeover", true)) {
                                        if (z11) {
                                            z13 = true;
                                        }
                                        if (strM33104K0 != null) {
                                            z13 = true;
                                        }
                                        i13 = i14;
                                        z11 = true;
                                    } else if (AbstractC8611a0.m33061F(strTrimSubstring2, "server_max_window_bits", true)) {
                                        if (numM33252s2 != null) {
                                            z13 = true;
                                        }
                                        numM33252s2 = strM33104K0 != null ? AbstractC8644z.m33252s(strM33104K0) : null;
                                        if (numM33252s2 == null) {
                                        }
                                    } else if (AbstractC8611a0.m33061F(strTrimSubstring2, "server_no_context_takeover", true)) {
                                        if (z12) {
                                            z13 = true;
                                        }
                                        if (strM33104K0 != null) {
                                            z13 = true;
                                        }
                                        i13 = i14;
                                        z12 = true;
                                    }
                                }
                                i11 = i13;
                                z10 = true;
                            }
                            z13 = true;
                        } else {
                            i11 = i13;
                            z13 = true;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z10, numM33252s, z11, numM33252s2, z12, z13);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions(boolean z10, Integer num, boolean z11, Integer num2, boolean z12, boolean z13) {
        this.perMessageDeflate = z10;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z11;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z12;
        this.unknownValues = z13;
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }
}
