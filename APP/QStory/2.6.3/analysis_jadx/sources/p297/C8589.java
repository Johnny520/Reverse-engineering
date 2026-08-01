package p297;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import p230.C8053;
import p283.C8380;
import p283.C8382;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8589 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C8589 f23953 = new C8589();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C8589 f23954;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C8380 f23955;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public short f23956;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f23957;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f23958;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public short f23959;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C8589 f23960;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C8053 f23961;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14208(byte[] bArr, int i) {
        this.f23959 = (short) (this.f23959 | 4);
        this.f23958 = i;
        int[] iArr = this.f23957;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f23957;
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
    public final void m14209(C8382 c8382, int i, boolean z) {
        if ((this.f23959 & 4) != 0) {
            int i2 = this.f23958;
            if (z) {
                c8382.m13940(i2 - i);
                return;
            } else {
                c8382.m13939(i2 - i);
                return;
            }
        }
        if (z) {
            m14210(i, 536870912, c8382.f23199);
            c8382.m13940(-1);
        } else {
            m14210(i, 268435456, c8382.f23199);
            c8382.m13939(-1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14210(int i, int i2, int i3) {
        if (this.f23957 == null) {
            this.f23957 = new int[6];
        }
        int[] iArr = this.f23957;
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f23957 = iArr2;
        }
        int[] iArr3 = this.f23957;
        iArr3[i4 + 1] = i;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }
}
