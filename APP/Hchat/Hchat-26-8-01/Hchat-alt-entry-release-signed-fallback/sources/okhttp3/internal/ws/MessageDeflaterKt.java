package okhttp3.internal.ws;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class MessageDeflaterKt {
    private static final okio.ByteString EMPTY_DEFLATE_BLOCK = null;
    private static final int LAST_OCTETS_COUNT_TO_REMOVE_AFTER_DEFLATION = 4;

    static {
            okio.ByteString$Companion r0 = okio.ByteString.Companion
            java.lang.String r1 = "000000ffff"
            okio.ByteString r0 = r0.decodeHex(r1)
            okhttp3.internal.ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK = r0
            return
    }

    public static final /* synthetic */ okio.ByteString access$getEMPTY_DEFLATE_BLOCK$p() {
            okio.ByteString r0 = okhttp3.internal.ws.MessageDeflaterKt.EMPTY_DEFLATE_BLOCK
            return r0
    }
}
