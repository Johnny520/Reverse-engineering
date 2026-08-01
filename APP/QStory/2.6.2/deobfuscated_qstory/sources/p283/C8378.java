package p283;

import androidx.appcompat.widget.C0137;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8378 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C8378 f23165 = new C8378();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public short f23166;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public short f23167;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public short f23168;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f23169;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f23170;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public short f23171;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8379 f23172;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public short f23173;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C8378 f23174;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C8378 f23175;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C0137 f23176;

    public final String toString() {
        return "L" + System.identityHashCode(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m13889(byte[] bArr, int i) {
        this.f23171 = (short) (this.f23171 | 4);
        this.f23170 = i;
        int[] iArr = this.f23169;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f23169;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = 268435455 & i4;
            if ((i4 & (-268435456)) == 268435456) {
                if (i5 < -32768 || i5 > 32767) {
                    int i7 = bArr[i3] & DefaultClassResolver.NAME;
                    if (i7 < 198) {
                        bArr[i3] = (byte) (i7 + 49);
                    } else {
                        bArr[i3] = (byte) (i7 + 20);
                    }
                    z = true;
                }
                bArr[i6] = (byte) (i5 >>> 8);
                bArr[i6 + 1] = (byte) i5;
            } else {
                bArr[i6] = (byte) (i5 >>> 24);
                bArr[i6 + 1] = (byte) (i5 >>> 16);
                bArr[i6 + 2] = (byte) (i5 >>> 8);
                bArr[i6 + 3] = (byte) i5;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m13890(C8381 c8381, int i, boolean z) {
        if ((this.f23171 & 4) != 0) {
            int i2 = this.f23170;
            if (z) {
                c8381.m13923(i2 - i);
                return;
            } else {
                c8381.m13922(i2 - i);
                return;
            }
        }
        int i3 = c8381.f23200;
        if (z) {
            m13893(i, 536870912, i3);
            c8381.m13923(-1);
        } else {
            m13893(i, 268435456, i3);
            c8381.m13922(-1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C8378 m13891(C8378 c8378) {
        for (C0137 c0137 = this.f23176; c0137 != null; c0137 = (C0137) c0137.f594) {
            if ((this.f23171 & 16) == 0 || c0137 != ((C0137) this.f23176.f594)) {
                C8378 c83782 = (C8378) c0137.f595;
                if (c83782.f23174 == null) {
                    c83782.f23174 = c8378;
                    c8378 = c83782;
                }
            }
        }
        return c8378;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C8378 m13892() {
        C8379 c8379 = this.f23172;
        return c8379 == null ? this : (C8378) c8379.f23186;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m13893(int i, int i2, int i3) {
        if (this.f23169 == null) {
            this.f23169 = new int[6];
        }
        int[] iArr = this.f23169;
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f23169 = iArr2;
        }
        int[] iArr3 = this.f23169;
        iArr3[i4 + 1] = i;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }
}
