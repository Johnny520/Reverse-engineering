package p110;

import androidx.activity.AbstractC0900;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.asm.Advice;
import p160.C8376;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8034 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19566;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte[] f19567;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C8034 f19565 = new C8034(new byte[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final char[] f19564 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'e', 'f'};

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8034(byte[] bArr, int i, int i2) {
        this(AbstractC5179.m9391(i, bArr, i2));
        bArr.getClass();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C8034 c8034 = (C8034) obj;
        c8034.getClass();
        byte[] bArr = c8034.f19567;
        if (c8034 == this) {
            return 0;
        }
        byte[] bArr2 = this.f19567;
        int iMin = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < iMin; i++) {
            int iM9464 = AbstractC5227.m9464(bArr2[i] & DefaultClassResolver.NAME, bArr[i] & DefaultClassResolver.NAME);
            if (iM9464 != 0) {
                return iM9464;
            }
        }
        return AbstractC5227.m9464(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C8034.class != obj.getClass()) {
            return false;
        }
        C8034 c8034 = (C8034) obj;
        byte[] bArr = c8034.f19567;
        int length = bArr.length;
        byte[] bArr2 = this.f19567;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = c8034.f19566;
        if (i2 == 0 || (i = this.f19566) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f19566;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f19567);
        this.f19566 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        byte[] bArr = this.f19567;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(strValueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = f19564;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte m12999(int i) {
        byte[] bArr = this.f19567;
        if (i >= 0 && i < bArr.length) {
            return bArr[i];
        }
        C8376.m13331(AbstractC0900.m716(AbstractC0900.m710(i, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        return (byte) 0;
    }

    public C8034(byte[] bArr) {
        this.f19567 = bArr;
    }
}
