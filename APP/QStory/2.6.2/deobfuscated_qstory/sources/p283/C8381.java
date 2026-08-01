package p283;

import p284.InterfaceC8385;

/* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8381 implements InterfaceC8385 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f23200;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public byte[] f23201;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f23202;

    public C8381() {
        this.f23202 = 0;
        this.f23201 = new byte[64];
    }

    @Override // p284.InterfaceC8385
    public byte readByte() {
        byte[] bArr = this.f23201;
        int i = this.f23200;
        this.f23200 = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public void m13916(byte[] bArr, int i) {
        switch (this.f23202) {
            case 0:
                if (this.f23200 + i > this.f23201.length) {
                    m13921(i);
                }
                if (bArr != null) {
                    System.arraycopy(bArr, 0, this.f23201, this.f23200, i);
                }
                this.f23200 += i;
                break;
            default:
                if (this.f23200 + i > this.f23201.length) {
                    m13921(i);
                }
                if (bArr != null) {
                    System.arraycopy(bArr, 0, this.f23201, this.f23200, i);
                }
                this.f23200 += i;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m13917(int i) {
        switch (this.f23202) {
            case 0:
                int i2 = this.f23200;
                int i3 = i2 + 1;
                if (i3 > this.f23201.length) {
                    m13921(1);
                }
                this.f23201[i2] = (byte) i;
                this.f23200 = i3;
                break;
            default:
                int i4 = this.f23200;
                int i5 = i4 + 1;
                if (i5 > this.f23201.length) {
                    m13921(1);
                }
                this.f23201[i4] = (byte) i;
                this.f23200 = i5;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m13918(int i, int i2, int i3) {
        switch (this.f23202) {
            case 0:
                int i4 = this.f23200;
                int i5 = i4 + 5;
                if (i5 > this.f23201.length) {
                    m13921(5);
                }
                byte[] bArr = this.f23201;
                bArr[i4] = (byte) i;
                bArr[i4 + 1] = (byte) (i2 >>> 8);
                bArr[i4 + 2] = (byte) i2;
                bArr[i4 + 3] = (byte) (i3 >>> 8);
                bArr[i4 + 4] = (byte) i3;
                this.f23200 = i5;
                break;
            default:
                int i6 = this.f23200;
                int i7 = i6 + 5;
                if (i7 > this.f23201.length) {
                    m13921(5);
                }
                byte[] bArr2 = this.f23201;
                bArr2[i6] = (byte) i;
                bArr2[i6 + 1] = (byte) (i2 >>> 8);
                bArr2[i6 + 2] = (byte) i2;
                bArr2[i6 + 3] = (byte) (i3 >>> 8);
                bArr2[i6 + 4] = (byte) i3;
                this.f23200 = i7;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m13919(int i, int i2) {
        switch (this.f23202) {
            case 0:
                int i3 = this.f23200;
                int i4 = i3 + 3;
                if (i4 > this.f23201.length) {
                    m13921(3);
                }
                byte[] bArr = this.f23201;
                bArr[i3] = (byte) i;
                bArr[i3 + 1] = (byte) (i2 >>> 8);
                bArr[i3 + 2] = (byte) i2;
                this.f23200 = i4;
                break;
            default:
                int i5 = this.f23200;
                int i6 = i5 + 3;
                if (i6 > this.f23201.length) {
                    m13921(3);
                }
                byte[] bArr2 = this.f23201;
                bArr2[i5] = (byte) i;
                bArr2[i5 + 1] = (byte) (i2 >>> 8);
                bArr2[i5 + 2] = (byte) i2;
                this.f23200 = i6;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m13920(int i, int i2) {
        switch (this.f23202) {
            case 0:
                int i3 = this.f23200;
                int i4 = i3 + 2;
                if (i4 > this.f23201.length) {
                    m13921(2);
                }
                byte[] bArr = this.f23201;
                bArr[i3] = (byte) i;
                bArr[i3 + 1] = (byte) i2;
                this.f23200 = i4;
                break;
            default:
                int i5 = this.f23200;
                int i6 = i5 + 2;
                if (i6 > this.f23201.length) {
                    m13921(2);
                }
                byte[] bArr2 = this.f23201;
                bArr2[i5] = (byte) i;
                bArr2[i5 + 1] = (byte) i2;
                this.f23200 = i6;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m13921(int i) {
        switch (this.f23202) {
            case 0:
                byte[] bArr = this.f23201;
                int length = bArr.length * 2;
                int i2 = this.f23200;
                int i3 = i + i2;
                if (length <= i3) {
                    length = i3;
                }
                byte[] bArr2 = new byte[length];
                System.arraycopy(bArr, 0, bArr2, 0, i2);
                this.f23201 = bArr2;
                break;
            default:
                byte[] bArr3 = new byte[Math.max(this.f23201.length * 2, this.f23200 + i)];
                System.arraycopy(this.f23201, 0, bArr3, 0, this.f23200);
                this.f23201 = bArr3;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public void m13922(int i) {
        switch (this.f23202) {
            case 0:
                int i2 = this.f23200;
                int i3 = i2 + 2;
                if (i3 > this.f23201.length) {
                    m13921(2);
                }
                byte[] bArr = this.f23201;
                bArr[i2] = (byte) (i >>> 8);
                bArr[i2 + 1] = (byte) i;
                this.f23200 = i3;
                break;
            default:
                int i4 = this.f23200;
                int i5 = i4 + 2;
                if (i5 > this.f23201.length) {
                    m13921(2);
                }
                byte[] bArr2 = this.f23201;
                bArr2[i4] = (byte) (i >>> 8);
                bArr2[i4 + 1] = (byte) i;
                this.f23200 = i5;
                break;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m13923(int i) {
        switch (this.f23202) {
            case 0:
                int i2 = this.f23200;
                int i3 = i2 + 4;
                if (i3 > this.f23201.length) {
                    m13921(4);
                }
                byte[] bArr = this.f23201;
                bArr[i2] = (byte) (i >>> 24);
                bArr[i2 + 1] = (byte) (i >>> 16);
                bArr[i2 + 2] = (byte) (i >>> 8);
                bArr[i2 + 3] = (byte) i;
                this.f23200 = i3;
                break;
            default:
                int i4 = this.f23200;
                int i5 = i4 + 4;
                if (i5 > this.f23201.length) {
                    m13921(4);
                }
                byte[] bArr2 = this.f23201;
                bArr2[i4] = (byte) (i >>> 24);
                bArr2[i4 + 1] = (byte) (i >>> 16);
                bArr2[i4 + 2] = (byte) (i >>> 8);
                bArr2[i4 + 3] = (byte) i;
                this.f23200 = i5;
                break;
        }
    }

    public C8381(byte[] bArr) {
        this.f23202 = 1;
        this.f23201 = bArr;
    }

    public C8381(int i) {
        this.f23202 = 2;
        this.f23201 = new byte[i];
    }
}
