package org.apache.commons.compress.archivers.zip;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.nio.ByteOrder;
import p025.AbstractC7012;
import p390.AbstractC9806;
import p395.C9826;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6432 extends AbstractC9806 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean[] f15780;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f15781;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final byte[] f15782;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public byte f15783;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f15784;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int[] f15785;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final byte[] f15786;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f15787;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f15788;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9826 f15789;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f15790;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte[] f15791;

    public C6432(C6413 c6413) {
        int[] iArr;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f15791 = new byte[1];
        this.f15790 = -1;
        this.f15784 = 9;
        this.f15787 = -1;
        this.f15789 = new C9826(c6413, byteOrder);
        this.f15790 = 256;
        if (this.f15784 > 13) {
            C6755.m11869("maxCodeSize 13 is out of bounds.");
            throw null;
        }
        this.f15785 = new int[8192];
        this.f15786 = new byte[8192];
        this.f15782 = new byte[8192];
        this.f15781 = 8192;
        int i = 0;
        while (true) {
            iArr = this.f15785;
            if (i >= 256) {
                break;
            }
            iArr[i] = -1;
            this.f15786[i] = (byte) i;
            i++;
        }
        this.f15780 = new boolean[iArr.length];
        for (int i2 = 0; i2 < 256; i2++) {
            this.f15780[i2] = true;
        }
        this.f15788 = this.f15790 + 1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15789.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iMin;
        boolean z;
        int i3;
        Object[] objArr;
        int iMin2;
        boolean z2 = false;
        if (i2 == 0) {
            return 0;
        }
        byte[] bArr2 = this.f15782;
        int length = bArr2.length - this.f15781;
        if (length > 0) {
            iMin = Math.min(length, i2);
            System.arraycopy(bArr2, this.f15781, bArr, i, iMin);
            this.f15781 += iMin;
        } else {
            iMin = 0;
        }
        while (true) {
            int i4 = i2 - iMin;
            if (i4 <= 0) {
                break;
            }
            int i5 = this.f15784;
            if (i5 > 31) {
                boolean z3 = z2;
                C6755.m11869("Code size must not be bigger than 31");
                return z3 ? 1 : 0;
            }
            C9826 c9826 = this.f15789;
            int iM15162 = (int) c9826.m15162(i5);
            int i6 = -1;
            if (iM15162 < 0) {
                z = z2;
            } else {
                int[] iArr = this.f15785;
                int i7 = this.f15790;
                boolean[] zArr = this.f15780;
                z = z2;
                if (iM15162 != i7) {
                    if (zArr[iM15162]) {
                        objArr = z ? 1 : 0;
                    } else {
                        int i8 = this.f15787;
                        if (i8 == -1) {
                            C6755.m11866("The first code can't be a reference to its preceding code");
                            return z ? 1 : 0;
                        }
                        iM15162 = m11531(this.f15783, i8);
                        objArr = 1;
                    }
                    for (int i9 = iM15162; i9 >= 0; i9 = iArr[i9]) {
                        int i10 = this.f15781 - 1;
                        this.f15781 = i10;
                        bArr2[i10] = this.f15786[i9];
                    }
                    int i11 = this.f15787;
                    if (i11 != -1 && objArr == 0) {
                        m11531(bArr2[this.f15781], i11);
                    }
                    this.f15787 = iM15162;
                    i6 = this.f15781;
                    this.f15783 = bArr2[i6];
                } else {
                    int i12 = this.f15784;
                    if (i12 > 31) {
                        C6755.m11869("Code size must not be bigger than 31");
                        return z ? 1 : 0;
                    }
                    int iM151622 = (int) c9826.m15162(i12);
                    if (iM151622 < 0) {
                        C6755.m11866("Unexpected EOF;");
                        return z ? 1 : 0;
                    }
                    if (iM151622 == 1) {
                        int i13 = this.f15784;
                        if (i13 >= 13) {
                            C6755.m11866("Attempt to increase code size beyond maximum");
                            return z ? 1 : 0;
                        }
                        this.f15784 = i13 + 1;
                    } else {
                        if (iM151622 != 2) {
                            C6755.m11866(AbstractC7012.m12147(iM151622, "Invalid clear code subcode "));
                            return z ? 1 : 0;
                        }
                        boolean[] zArr2 = new boolean[8192];
                        for (int i14 = z ? 1 : 0; i14 < zArr.length; i14++) {
                            if (zArr[i14] && (i3 = iArr[i14]) != -1) {
                                zArr2[i3] = true;
                            }
                        }
                        for (int i15 = i7 + 1; i15 < 8192; i15++) {
                            if (!zArr2[i15]) {
                                zArr[i15] = z;
                                iArr[i15] = -1;
                            }
                        }
                        this.f15788 = i7 + 1;
                    }
                    i6 = z ? 1 : 0;
                }
            }
            if (i6 < 0) {
                if (iMin > 0) {
                    break;
                }
                return i6;
            }
            int i16 = i + iMin;
            int length2 = bArr2.length - this.f15781;
            if (length2 > 0) {
                iMin2 = Math.min(length2, i4);
                System.arraycopy(bArr2, this.f15781, bArr, i16, iMin2);
                this.f15781 += iMin2;
            } else {
                iMin2 = z;
            }
            iMin += iMin2;
            z2 = z;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m11531(byte b, int i) {
        boolean[] zArr;
        int i2 = this.f15788;
        while (true) {
            zArr = this.f15780;
            if (i2 >= 8192 || !zArr[i2]) {
                break;
            }
            i2++;
        }
        this.f15788 = i2;
        if (i2 < 8192) {
            this.f15785[i2] = i;
            this.f15786[i2] = b;
            this.f15788 = i2 + 1;
        } else {
            i2 = -1;
        }
        if (i2 >= 0) {
            zArr[i2] = true;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.f15791;
        int i = read(bArr);
        return i < 0 ? i : bArr[0] & DefaultClassResolver.NAME;
    }
}
