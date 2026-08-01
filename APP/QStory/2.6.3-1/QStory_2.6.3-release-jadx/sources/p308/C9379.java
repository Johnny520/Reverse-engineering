package p308;

import androidx.activity.AbstractC0900;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9379 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte[] f24200;

    public C9379(byte[] bArr) {
        this.f24200 = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        byte[] bArr = this.f24200;
        sb.append(Integer.toHexString(bArr[0] & DefaultClassResolver.NAME));
        sb.append("...(");
        return AbstractC0900.m707(sb, ")", bArr.length);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C9379 c9379) {
        int length;
        int length2;
        byte[] bArr = this.f24200;
        int length3 = bArr.length;
        byte[] bArr2 = c9379.f24200;
        byte[] bArr3 = c9379.f24200;
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
