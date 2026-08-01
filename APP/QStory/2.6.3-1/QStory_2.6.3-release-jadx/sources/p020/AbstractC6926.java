package p020;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import kotlin.text.AbstractC5964;
import okio.ByteString;

/* JADX INFO: renamed from: 飘花落叶言世兰哲苏子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6926 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final byte[] f17007;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final byte[] f17008;

    static {
        ByteString.Companion.getClass();
        f17008 = C6943.m12069("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/").getData();
        f17007 = C6943.m12069("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_").getData();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String m12055(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i = 0;
        int i2 = 0;
        while (i < length) {
            byte b = bArr[i];
            int i3 = i + 2;
            byte b2 = bArr[i + 1];
            i += 3;
            byte b3 = bArr[i3];
            bArr3[i2] = bArr2[(b & DefaultClassResolver.NAME) >> 2];
            bArr3[i2 + 1] = bArr2[((b & 3) << 4) | ((b2 & DefaultClassResolver.NAME) >> 4)];
            int i4 = i2 + 3;
            bArr3[i2 + 2] = bArr2[((b2 & 15) << 2) | ((b3 & DefaultClassResolver.NAME) >> 6)];
            i2 += 4;
            bArr3[i4] = bArr2[b3 & 63];
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b4 = bArr[i];
            bArr3[i2] = bArr2[(b4 & DefaultClassResolver.NAME) >> 2];
            bArr3[i2 + 1] = bArr2[(b4 & 3) << 4];
            bArr3[i2 + 2] = 61;
            bArr3[i2 + 3] = 61;
        } else if (length2 == 2) {
            int i5 = i + 1;
            byte b5 = bArr[i];
            byte b6 = bArr[i5];
            bArr3[i2] = bArr2[(b5 & DefaultClassResolver.NAME) >> 2];
            bArr3[i2 + 1] = bArr2[((b5 & 3) << 4) | ((b6 & DefaultClassResolver.NAME) >> 4)];
            bArr3[i2 + 2] = bArr2[(b6 & 15) << 2];
            bArr3[i2 + 3] = 61;
        }
        return new String(bArr3, AbstractC5964.f15033);
    }
}
