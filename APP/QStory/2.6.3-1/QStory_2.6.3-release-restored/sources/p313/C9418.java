package p313;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import p246.C8882;
import p299.C9209;
import p299.C9211;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9418 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C9418 f24298 = new C9418();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C9418 f24299;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C9209 f24300;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public short f24301;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int[] f24302;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f24303;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public short f24304;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public C9418 f24305;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public C8882 f24306;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14767(byte[] bArr, int i) {
        this.f24304 = (short) (this.f24304 | 4);
        this.f24303 = i;
        int[] iArr = this.f24302;
        boolean z = false;
        if (iArr == null) {
            return false;
        }
        for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
            int[] iArr2 = this.f24302;
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
    public final void m14768(C9211 c9211, int i, boolean z) {
        if ((this.f24304 & 4) != 0) {
            int i2 = this.f24303;
            if (z) {
                c9211.m14499(i2 - i);
                return;
            } else {
                c9211.m14498(i2 - i);
                return;
            }
        }
        if (z) {
            m14769(i, 536870912, c9211.f23544);
            c9211.m14499(-1);
        } else {
            m14769(i, 268435456, c9211.f23544);
            c9211.m14498(-1);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14769(int i, int i2, int i3) {
        if (this.f24302 == null) {
            this.f24302 = new int[6];
        }
        int[] iArr = this.f24302;
        int i4 = iArr[0];
        int i5 = i4 + 2;
        if (i5 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f24302 = iArr2;
        }
        int[] iArr3 = this.f24302;
        iArr3[i4 + 1] = i;
        iArr3[i5] = i2 | i3;
        iArr3[0] = i5;
    }
}
