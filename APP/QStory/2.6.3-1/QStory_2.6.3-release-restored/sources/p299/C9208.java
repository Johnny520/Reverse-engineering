package p299;

import androidx.appcompat.widget.C0984;
import com.esotericsoftware.kryo.util.DefaultClassResolver;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9208 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C9208 f23509 = new C9208();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public short f23510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public short f23511;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public short f23512;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f23513;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f23514;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public short f23515;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C9209 f23516;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public short f23517;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public C9208 f23518;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public C9208 f23519;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public C0984 f23520;

    public final String toString() {
        return "L" + System.identityHashCode(this);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m14465(byte[] bArr, int i) {
        this.f23515 = (short) (this.f23515 | 4);
        this.f23514 = i;
        int[] iArr = this.f23513;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f23513;
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
    public final void m14466(C9211 c9211, int i, boolean z) {
        if ((this.f23515 & 4) != 0) {
            int i2 = this.f23514;
            if (z) {
                c9211.m14499(i2 - i);
                return;
            } else {
                c9211.m14498(i2 - i);
                return;
            }
        }
        int i3 = c9211.f23544;
        if (z) {
            m14469(i, 536870912, i3);
            c9211.m14499(-1);
        } else {
            m14469(i, 268435456, i3);
            c9211.m14498(-1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C9208 m14467(C9208 c9208) {
        for (C0984 c0984 = this.f23520; c0984 != null; c0984 = (C0984) c0984.f939) {
            if ((this.f23515 & 16) == 0 || c0984 != ((C0984) this.f23520.f939)) {
                C9208 c92082 = (C9208) c0984.f940;
                if (c92082.f23518 == null) {
                    c92082.f23518 = c9208;
                    c9208 = c92082;
                }
            }
        }
        return c9208;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C9208 m14468() {
        C9209 c9209 = this.f23516;
        return c9209 == null ? this : (C9208) c9209.f23530;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14469(int i, int i2, int i3) {
        if (this.f23513 == null) {
            this.f23513 = new int[6];
        }
        int[] iArr = this.f23513;
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f23513 = iArr2;
        }
        int[] iArr3 = this.f23513;
        iArr3[i4 + 1] = i;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }
}
