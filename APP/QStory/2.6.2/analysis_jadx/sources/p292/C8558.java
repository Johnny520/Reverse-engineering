package p292;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8558 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte[] f23864;

    public C8558(byte[] bArr) {
        this.f23864 = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = this.f23864;
        sb.append(Integer.toHexString(bArr[0] & DefaultClassResolver.NAME));
        sb.append("...(");
        return AbstractC0053.m147(sb, ")", bArr.length);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C8558 c8558) {
        int length;
        int length2;
        byte[] bArr = this.f23864;
        int length3 = bArr.length;
        byte[] bArr2 = c8558.f23864;
        byte[] bArr3 = c8558.f23864;
        int iMin = Math.min(length3, bArr2.length);
        int i = 0;
        while (true) {
            if (i >= iMin) {
                length = bArr.length;
                length2 = bArr3.length;
                break;
            }
            byte b = bArr[i];
            byte b2 = bArr3[i];
            if (b != b2) {
                length = b & DefaultClassResolver.NAME;
                length2 = b2 & DefaultClassResolver.NAME;
                break;
            }
            i++;
        }
        return length - length2;
    }
}
