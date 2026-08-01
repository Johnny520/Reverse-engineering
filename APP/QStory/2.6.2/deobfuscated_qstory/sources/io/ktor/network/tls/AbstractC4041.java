package io.ktor.network.tls;

/* JADX INFO: renamed from: io.ktor.network.tls.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4041 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int[] f12316;

    static {
        int[] iArr = new int[TLSRecordType.values().length];
        try {
            iArr[TLSRecordType.Alert.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TLSRecordType.ChangeCipherSpec.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f12316 = iArr;
    }
}
