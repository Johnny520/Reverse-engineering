package kotlin.p001io.encoding;

/* JADX INFO: compiled from: Base64.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0001\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003\"\u0016\u0010\u0007\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003¨\u0006\u000f"}, m115d2 = {"base64DecodeMap", "", "getBase64DecodeMap$annotations", "()V", "base64EncodeMap", "", "getBase64EncodeMap$annotations", "base64UrlDecodeMap", "getBase64UrlDecodeMap$annotations", "base64UrlEncodeMap", "getBase64UrlEncodeMap$annotations", "isInMimeAlphabet", "", "symbol", "", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class Base64Kt {
    private static final int[] base64DecodeMap = null;
    private static final byte[] base64EncodeMap = null;
    private static final int[] base64UrlDecodeMap = null;
    private static final byte[] base64UrlEncodeMap = null;

    static {
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0132: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            kotlin.p001io.encoding.Base64Kt.base64EncodeMap = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r7 = r0
            r8 = 0
            r5 = 6
            r6 = 0
            r2 = -1
            r3 = 0
            r4 = 0
            r1 = r7
            kotlin.collections.ArraysKt.fill$default(r1, r2, r3, r4, r5, r6)
            r1 = 61
            r2 = -2
            r7[r1] = r2
            byte[] r1 = kotlin.p001io.encoding.Base64Kt.base64EncodeMap
            r2 = 0
            r3 = 0
            int r4 = r1.length
            r5 = 0
        L84:
            if (r5 >= r4) goto L94
            r6 = r1[r5]
            int r9 = r3 + 1
            r10 = r6
            r11 = 0
            r7[r10] = r3
            int r5 = r5 + 1
            r3 = r9
            goto L84
        L94:
            kotlin.p001io.encoding.Base64Kt.base64DecodeMap = r0
            r0 = 64
            byte[] r0 = new byte[r0]
            r0 = {x0156: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
            kotlin.p001io.encoding.Base64Kt.base64UrlEncodeMap = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r7 = r0
            r8 = 0
            r5 = 6
            r6 = 0
            r2 = -1
            r3 = 0
            r4 = 0
            r1 = r7
            kotlin.collections.ArraysKt.fill$default(r1, r2, r3, r4, r5, r6)
            r1 = 61
            r2 = -2
            r7[r1] = r2
            byte[] r1 = kotlin.p001io.encoding.Base64Kt.base64UrlEncodeMap
            r2 = 0
            r3 = 0
            int r4 = r1.length
            r5 = 0
        L11c:
            if (r5 >= r4) goto L12c
            r6 = r1[r5]
            int r9 = r3 + 1
            r10 = r6
            r11 = 0
            r7[r10] = r3
            int r5 = r5 + 1
            r3 = r9
            goto L11c
        L12c:
            kotlin.p001io.encoding.Base64Kt.base64UrlDecodeMap = r0
            return
    }

    public static final /* synthetic */ int[] access$getBase64DecodeMap$p() {
            int[] r0 = kotlin.p001io.encoding.Base64Kt.base64DecodeMap
            return r0
    }

    public static final /* synthetic */ byte[] access$getBase64EncodeMap$p() {
            byte[] r0 = kotlin.p001io.encoding.Base64Kt.base64EncodeMap
            return r0
    }

    public static final /* synthetic */ int[] access$getBase64UrlDecodeMap$p() {
            int[] r0 = kotlin.p001io.encoding.Base64Kt.base64UrlDecodeMap
            return r0
    }

    public static final /* synthetic */ byte[] access$getBase64UrlEncodeMap$p() {
            byte[] r0 = kotlin.p001io.encoding.Base64Kt.base64UrlEncodeMap
            return r0
    }

    private static /* synthetic */ void getBase64DecodeMap$annotations() {
            return
    }

    private static /* synthetic */ void getBase64EncodeMap$annotations() {
            return
    }

    private static /* synthetic */ void getBase64UrlDecodeMap$annotations() {
            return
    }

    private static /* synthetic */ void getBase64UrlEncodeMap$annotations() {
            return
    }

    public static final boolean isInMimeAlphabet(int r4) {
            r0 = 1
            r1 = 0
            if (r4 < 0) goto Lb
            int[] r2 = kotlin.p001io.encoding.Base64Kt.base64DecodeMap
            int r2 = r2.length
            if (r4 >= r2) goto Lb
            r2 = r0
            goto Lc
        Lb:
            r2 = r1
        Lc:
            if (r2 == 0) goto L16
            int[] r2 = kotlin.p001io.encoding.Base64Kt.base64DecodeMap
            r2 = r2[r4]
            r3 = -1
            if (r2 == r3) goto L16
            goto L17
        L16:
            r0 = r1
        L17:
            return r0
    }
}
