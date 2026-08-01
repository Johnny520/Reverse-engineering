package p005;

import java.io.EOFException;
import java.io.InputStream;
import kotlin.text.AbstractC5131;
import okio.ByteString;
import okio.internal.AbstractC5570;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏楪子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6123 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static ByteString m11516(InputStream inputStream, int i) {
        inputStream.getClass();
        if (i < 0) {
            C5919.m11253(AbstractC6136.m11556(i, "byteCount < 0: "));
            return null;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new EOFException();
            }
            i2 += i3;
        }
        return new ByteString(bArr);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static ByteString m11517(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(AbstractC5131.f14688);
        bytes.getClass();
        ByteString byteString = new ByteString(bytes);
        byteString.setUtf8$okio(str);
        return byteString;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ByteString m11518(String str) {
        str.getClass();
        if (str.length() % 2 != 0) {
            C5919.m11253("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (AbstractC5570.m10881(str.charAt(i2 + 1)) + (AbstractC5570.m10881(str.charAt(i2)) << 4));
        }
        return new ByteString(bArr);
    }
}
