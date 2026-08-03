package okhttp3.internal.p221ws;

import gg.AbstractC1411g;
import gg.AbstractC1416l;
import okhttp3.Headers;
import okhttp3.internal.Util;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class WebSocketExtensions {
    public static final Companion Companion = new Companion(null);
    private static final String HEADER_WEB_SOCKET_EXTENSION = "Sec-WebSocket-Extensions";
    public final Integer clientMaxWindowBits;
    public final boolean clientNoContextTakeover;
    public final boolean perMessageDeflate;
    public final Integer serverMaxWindowBits;
    public final boolean serverNoContextTakeover;
    public final boolean unknownValues;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0029: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED] (LINE:1)) != (0 int)) ? false : (r3v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED] (LINE:7)) != (0 int)) ? (null java.lang.Integer) : (r4v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r9v0 int) & (4 int) A[WRAPPED] (LINE:13)) != (0 int)) ? false : (r5v0 boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r9v0 int) & (8 int) A[WRAPPED] (LINE:18)) != (0 int)) ? (null java.lang.Integer) : (r6v0 java.lang.Integer))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (16 int) A[WRAPPED] (LINE:23)) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (32 int) A[WRAPPED] (LINE:28)) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(boolean, java.lang.Integer, boolean, java.lang.Integer, boolean, boolean):void (m)] (LINE:42) call: okhttp3.internal.ws.WebSocketExtensions.<init>(boolean, java.lang.Integer, boolean, java.lang.Integer, boolean, boolean):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ WebSocketExtensions(boolean z9, Integer num, boolean z10, Integer num2, boolean z11, boolean z12, int i9, AbstractC1411g abstractC1411g) {
        this((i9 & 1) != 0 ? false : z9, (i9 & 2) != 0 ? null : num, (i9 & 4) != 0 ? false : z10, (i9 & 8) != 0 ? null : num2, (i9 & 16) != 0 ? false : z11, (i9 & 32) != 0 ? false : z12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static /* synthetic */ WebSocketExtensions copy$default(WebSocketExtensions webSocketExtensions, boolean z9, Integer num, boolean z10, Integer num2, boolean z11, boolean z12, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            z9 = webSocketExtensions.perMessageDeflate;
        }
        if ((i9 & 2) != 0) {
            num = webSocketExtensions.clientMaxWindowBits;
        }
        if ((i9 & 4) != 0) {
            z10 = webSocketExtensions.clientNoContextTakeover;
        }
        if ((i9 & 8) != 0) {
            num2 = webSocketExtensions.serverMaxWindowBits;
        }
        if ((i9 & 16) != 0) {
            z11 = webSocketExtensions.serverNoContextTakeover;
        }
        if ((i9 & 32) != 0) {
            z12 = webSocketExtensions.unknownValues;
        }
        boolean z13 = z11;
        boolean z14 = z12;
        return webSocketExtensions.copy(z9, num, z10, num2, z13, z14);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean component1() {
        return this.perMessageDeflate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer component2() {
        return this.clientMaxWindowBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean component3() {
        return this.clientNoContextTakeover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final Integer component4() {
        return this.serverMaxWindowBits;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean component5() {
        return this.serverNoContextTakeover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean component6() {
        return this.unknownValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WebSocketExtensions copy(boolean z9, Integer num, boolean z10, Integer num2, boolean z11, boolean z12) {
        return new WebSocketExtensions(z9, num, z10, num2, z11, z12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebSocketExtensions)) {
            return false;
        }
        WebSocketExtensions webSocketExtensions = (WebSocketExtensions) obj;
        return this.perMessageDeflate == webSocketExtensions.perMessageDeflate && AbstractC1416l.m3825a(this.clientMaxWindowBits, webSocketExtensions.clientMaxWindowBits) && this.clientNoContextTakeover == webSocketExtensions.clientNoContextTakeover && AbstractC1416l.m3825a(this.serverMaxWindowBits, webSocketExtensions.serverMaxWindowBits) && this.serverNoContextTakeover == webSocketExtensions.serverNoContextTakeover && this.unknownValues == webSocketExtensions.unknownValues;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public int hashCode() {
        boolean z9 = this.perMessageDeflate;
        ?? r02 = z9;
        if (z9) {
            r02 = 1;
        }
        int i9 = r02 * 31;
        Integer num = this.clientMaxWindowBits;
        int iHashCode = (i9 + (num == null ? 0 : num.hashCode())) * 31;
        boolean z10 = this.clientNoContextTakeover;
        ?? r2 = z10;
        if (z10) {
            r2 = 1;
        }
        int i10 = (iHashCode + r2) * 31;
        Integer num2 = this.serverMaxWindowBits;
        int iHashCode2 = (i10 + (num2 != null ? num2.hashCode() : 0)) * 31;
        boolean z11 = this.serverNoContextTakeover;
        ?? r22 = z11;
        if (z11) {
            r22 = 1;
        }
        int i11 = (iHashCode2 + r22) * 31;
        boolean z12 = this.unknownValues;
        return i11 + (z12 ? 1 : z12);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean noContextTakeover(boolean z9) {
        return z9 ? this.clientNoContextTakeover : this.serverNoContextTakeover;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.perMessageDeflate + ", clientMaxWindowBits=" + this.clientMaxWindowBits + ", clientNoContextTakeover=" + this.clientNoContextTakeover + ", serverMaxWindowBits=" + this.serverMaxWindowBits + ", serverNoContextTakeover=" + this.serverNoContextTakeover + ", unknownValues=" + this.unknownValues + ')';
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: okhttp3.internal.ws.WebSocketExtensions.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC1411g abstractC1411g) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009e A[PHI: r7 r9
  0x009e: PHI (r7v6 java.lang.Integer) = (r7v4 java.lang.Integer), (r7v4 java.lang.Integer), (r7v8 java.lang.Integer) binds: [B:53:0x00d0, B:50:0x00c7, B:33:0x009c] A[DONT_GENERATE, DONT_INLINE]
  0x009e: PHI (r9v9 java.lang.Integer) = (r9v4 java.lang.Integer), (r9v6 java.lang.Integer), (r9v4 java.lang.Integer) binds: [B:53:0x00d0, B:50:0x00c7, B:33:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final WebSocketExtensions parse(Headers headers) {
            String strTrimSubstring;
            headers.getClass();
            int size = headers.size();
            boolean z9 = false;
            Integer numM6741e0 = null;
            boolean z10 = false;
            Integer numM6741e02 = null;
            boolean z11 = false;
            boolean z12 = false;
            for (int i9 = 0; i9 < size; i9++) {
                if (AbstractC3156t.m6734X(headers.name(i9), WebSocketExtensions.HEADER_WEB_SOCKET_EXTENSION)) {
                    String strValue = headers.value(i9);
                    int i10 = 0;
                    while (i10 < strValue.length()) {
                        int iDelimiterOffset$default = Util.delimiterOffset$default(strValue, ',', i10, 0, 4, (Object) null);
                        char c10 = ';';
                        int iDelimiterOffset = Util.delimiterOffset(strValue, ';', i10, iDelimiterOffset$default);
                        String strTrimSubstring2 = Util.trimSubstring(strValue, i10, iDelimiterOffset);
                        int i11 = iDelimiterOffset + 1;
                        if (AbstractC3156t.m6734X(strTrimSubstring2, "permessage-deflate")) {
                            if (z9) {
                                z12 = true;
                            }
                            i10 = i11;
                            while (i10 < iDelimiterOffset$default) {
                                int iDelimiterOffset2 = Util.delimiterOffset(strValue, c10, i10, iDelimiterOffset$default);
                                int iDelimiterOffset3 = Util.delimiterOffset(strValue, '=', i10, iDelimiterOffset2);
                                String strTrimSubstring3 = Util.trimSubstring(strValue, i10, iDelimiterOffset3);
                                if (iDelimiterOffset3 < iDelimiterOffset2) {
                                    strTrimSubstring = Util.trimSubstring(strValue, iDelimiterOffset3 + 1, iDelimiterOffset2);
                                    strTrimSubstring.getClass();
                                    if (strTrimSubstring.length() >= 2 && AbstractC3149m.m6693H0(strTrimSubstring, "\"") && AbstractC3149m.m6714m0(strTrimSubstring, "\"")) {
                                        strTrimSubstring = AbstractC4855en.m9262f(1, 1, strTrimSubstring);
                                    }
                                } else {
                                    strTrimSubstring = null;
                                }
                                int i12 = iDelimiterOffset2 + 1;
                                if (AbstractC3156t.m6734X(strTrimSubstring3, "client_max_window_bits")) {
                                    if (numM6741e0 != null) {
                                        z12 = true;
                                    }
                                    numM6741e0 = strTrimSubstring != null ? AbstractC3156t.m6741e0(10, strTrimSubstring) : null;
                                    if (numM6741e0 == null) {
                                        z12 = true;
                                    }
                                } else if (AbstractC3156t.m6734X(strTrimSubstring3, "client_no_context_takeover")) {
                                    if (z10) {
                                        z12 = true;
                                    }
                                    if (strTrimSubstring != null) {
                                        z12 = true;
                                    }
                                    z10 = true;
                                } else if (AbstractC3156t.m6734X(strTrimSubstring3, "server_max_window_bits")) {
                                    if (numM6741e02 != null) {
                                        z12 = true;
                                    }
                                    numM6741e02 = strTrimSubstring != null ? AbstractC3156t.m6741e0(10, strTrimSubstring) : null;
                                    if (numM6741e02 == null) {
                                    }
                                } else if (AbstractC3156t.m6734X(strTrimSubstring3, "server_no_context_takeover")) {
                                    if (z11) {
                                        z12 = true;
                                    }
                                    if (strTrimSubstring != null) {
                                        z12 = true;
                                    }
                                    z11 = true;
                                }
                                i10 = i12;
                                c10 = ';';
                            }
                            z9 = true;
                        } else {
                            z12 = true;
                            i10 = i11;
                        }
                    }
                }
            }
            return new WebSocketExtensions(z9, numM6741e0, z10, numM6741e02, z11, z12);
        }

        private Companion() {
        }
    }

    public WebSocketExtensions(boolean z9, Integer num, boolean z10, Integer num2, boolean z11, boolean z12) {
        this.perMessageDeflate = z9;
        this.clientMaxWindowBits = num;
        this.clientNoContextTakeover = z10;
        this.serverMaxWindowBits = num2;
        this.serverNoContextTakeover = z11;
        this.unknownValues = z12;
    }

    public WebSocketExtensions() {
        this(false, null, false, null, false, false, 63, null);
    }
}
