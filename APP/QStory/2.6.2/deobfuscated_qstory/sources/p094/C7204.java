package p094;

import androidx.activity.AbstractC0053;
import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.util.Arrays;
import kotlin.collections.AbstractC4346;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.asm.Advice;
import p144.C7546;

/* JADX INFO: renamed from: 飘花落叶言世苏哲楪兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7204 implements Comparable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f19226;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte[] f19227;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C7204 f19225 = new C7204(new byte[0]);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final char[] f19224 = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, 'e', 'f'};

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7204(byte[] bArr, int i, int i2) {
        this(AbstractC4346.m8834(i, bArr, i2));
        bArr.getClass();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C7204 c7204 = (C7204) obj;
        c7204.getClass();
        byte[] bArr = c7204.f19227;
        if (c7204 == this) {
            return 0;
        }
        byte[] bArr2 = this.f19227;
        int iMin = Math.min(bArr2.length, bArr.length);
        for (int i = 0; i < iMin; i++) {
            int iM8915 = AbstractC4394.m8915(bArr2[i] & DefaultClassResolver.NAME, bArr[i] & DefaultClassResolver.NAME);
            if (iM8915 != 0) {
                return iM8915;
            }
        }
        return AbstractC4394.m8915(bArr2.length, bArr.length);
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7204.class != obj.getClass()) {
            return false;
        }
        C7204 c7204 = (C7204) obj;
        byte[] bArr = c7204.f19227;
        int length = bArr.length;
        byte[] bArr2 = this.f19227;
        if (length != bArr2.length) {
            return false;
        }
        int i2 = c7204.f19226;
        if (i2 == 0 || (i = this.f19226) == 0 || i2 == i) {
            return Arrays.equals(bArr2, bArr);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f19226;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f19227);
        this.f19226 = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        byte[] bArr = this.f19227;
        if (bArr.length == 0) {
            return "ByteString(size=0)";
        }
        String strValueOf = String.valueOf(bArr.length);
        StringBuilder sb = new StringBuilder((bArr.length * 2) + strValueOf.length() + 22);
        sb.append("ByteString(size=");
        sb.append(strValueOf);
        sb.append(" hex=");
        for (byte b : bArr) {
            char[] cArr = f19224;
            sb.append(cArr[(b >>> 4) & 15]);
            sb.append(cArr[b & 15]);
        }
        sb.append(')');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final byte m12413(int i) {
        byte[] bArr = this.f19227;
        if (i >= 0 && i < bArr.length) {
            return bArr[i];
        }
        C7546.m12743(AbstractC0053.m154(AbstractC0053.m148(i, "index (", ") is out of byte string bounds: [0.."), bArr.length, ')'));
        return (byte) 0;
    }

    public C7204(byte[] bArr) {
        this.f19227 = bArr;
    }
}
