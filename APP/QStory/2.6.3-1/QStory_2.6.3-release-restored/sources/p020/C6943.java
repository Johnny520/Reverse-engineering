package p020;

import java.io.EOFException;
import java.io.InputStream;
import kotlin.text.AbstractC5964;
import okio.ByteString;
import okio.internal.AbstractC6401;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6943 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static ByteString m12068(InputStream inputStream, int i) {
        inputStream.getClass();
        if (i < 0) {
            C6755.m11873(AbstractC7012.m12147(i, "byteCount < 0: "));
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
    public static ByteString m12069(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(AbstractC5964.f15033);
        bytes.getClass();
        ByteString byteString = new ByteString(bytes);
        byteString.setUtf8$okio(str);
        return byteString;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static ByteString m12070(String str) {
        str.getClass();
        if (str.length() % 2 != 0) {
            C6755.m11873("Unexpected hex string: ".concat(str));
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (AbstractC6401.m11497(str.charAt(i2 + 1)) + (AbstractC6401.m11497(str.charAt(i2)) << 4));
        }
        return new ByteString(bArr);
    }
}
