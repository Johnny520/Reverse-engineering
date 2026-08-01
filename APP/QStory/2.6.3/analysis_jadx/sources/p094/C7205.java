package p094;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;
import kotlin.collections.AbstractC4347;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.asm.Advice;
import p144.C7547;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7205 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19221;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte[] f19222;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7205 f19220 = new C7205(new byte[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final char[] f19219 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'e', 'f'};

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7205(byte[] bArr, int i, int i2) {
        this(AbstractC4347.m8832(i, bArr, i2));
        bArr.getClass();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C7205 c7205 = (C7205) obj;
        c7205.getClass();
        byte[] bArr = c7205.f19222;
        if (c7205 == this) {
            return 0;
        }
        byte[] bArr2 = this.f19222;
        int iMin = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < iMin; i++) {
            int iM8905 = AbstractC4395.m8905(bArr2[i] & DefaultClassResolver.NAME, bArr[i] & DefaultClassResolver.NAME);
            if (iM8905 != 0) {
                return iM8905;
            }
        }
        return AbstractC4395.m8905(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7205.class != obj.getClass()) {
            return false;
        }
        C7205 c7205 = (C7205) obj;
        byte[] bArr = c7205.f19222;
        int length = bArr.length;
        byte[] bArr2 = this.f19222;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = c7205.f19221;
        if (i2 == 0 || (i = this.f19221) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f19221;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f19222);
        this.f19221 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        byte[] bArr = this.f19222;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(strValueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = f19219;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte m12440(int i) {
        byte[] bArr = this.f19222;
        if (i >= 0 && i < bArr.length) {
            return bArr[i];
        }
        C7547.m12772(AbstractC0053.m156(AbstractC0053.m150(i, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        return (byte) 0;
    }

    public C7205(byte[] bArr) {
        this.f19222 = bArr;
    }
}
