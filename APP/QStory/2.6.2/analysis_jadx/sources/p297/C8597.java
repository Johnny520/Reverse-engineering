package p297;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import p230.C8052;
import p283.C8379;
import p283.C8381;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8597 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8597 f23962 = new C8597();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C8597 f23963;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C8379 f23964;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public short f23965;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f23966;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f23967;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public short f23968;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8597 f23969;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C8052 f23970;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14189(byte[] bArr, int i) {
        this.f23968 = (short) (this.f23968 | 4);
        this.f23967 = i;
        int[] iArr = this.f23966;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f23966;
            int i3 = iArr2[i2 - 1];
            int i4 = iArr2[i2];
            int i5 = i - i3;
            int i6 = 268435455 & i4;
            if ((i4 & (-268435456)) != 268435456) {
                int i7 = i6 + 1;
                bArr[i6] = (byte) (i5 >>> 24);
                i6 += 2;
                bArr[i7] = (byte) (i5 >>> 16);
            } else if (i5 < -32768 || i5 > 32767) {
                int i8 = bArr[i3] & DefaultClassResolver.NAME;
                if (i8 < 198) {
                    bArr[i3] = (byte) (i8 + 49);
                } else {
                    bArr[i3] = (byte) (i8 + 20);
                }
                z = true;
            }
            bArr[i6] = (byte) (i5 >>> 8);
            bArr[i6 + 1] = (byte) i5;
        }
        return z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14190(C8381 c8381, int i, boolean z) {
        if ((this.f23968 & 4) != 0) {
            int i2 = this.f23967;
            if (z) {
                c8381.m13923(i2 - i);
                return;
            } else {
                c8381.m13922(i2 - i);
                return;
            }
        }
        if (z) {
            m14191(i, 536870912, c8381.f23200);
            c8381.m13923(-1);
        } else {
            m14191(i, 268435456, c8381.f23200);
            c8381.m13922(-1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14191(int i, int i2, int i3) {
        if (this.f23966 == null) {
            this.f23966 = new int[6];
        }
        int[] iArr = this.f23966;
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f23966 = iArr2;
        }
        int[] iArr3 = this.f23966;
        iArr3[i4 + 1] = i;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }
}
