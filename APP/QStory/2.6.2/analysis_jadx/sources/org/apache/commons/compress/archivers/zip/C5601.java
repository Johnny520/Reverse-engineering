package org.apache.commons.compress.archivers.zip;

import com.esotericsoftware.kryo.util.DefaultClassResolver;
import java.io.IOException;
import java.nio.ByteOrder;
import p007.AbstractC6136;
import p376.C8978;
import p378.AbstractC8988;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: org.apache.commons.compress.archivers.zip.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5601 extends AbstractC8988 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final boolean[] f15435;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public int f15436;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final byte[] f15437;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public byte f15438;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f15439;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final int[] f15440;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final byte[] f15441;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public int f15442;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f15443;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C8978 f15444;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int f15445;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final byte[] f15446;

    public C5601(C5582 c5582) {
        int[] iArr;
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        this.f15446 = new byte[1];
        this.f15445 = -1;
        this.f15439 = 9;
        this.f15442 = -1;
        this.f15444 = new C8978(c5582, byteOrder);
        this.f15445 = 256;
        if (this.f15439 > 13) {
            C5919.m11249("maxCodeSize 13 is out of bounds.");
            throw null;
        }
        this.f15440 = new int[8192];
        this.f15441 = new byte[8192];
        this.f15437 = new byte[8192];
        this.f15436 = 8192;
        int i = 0;
        while (true) {
            iArr = this.f15440;
            if (i >= 256) {
                break;
            }
            iArr[i] = -1;
            this.f15441[i] = (byte) i;
            i++;
        }
        this.f15435 = new boolean[iArr.length];
        for (int i2 = 0; i2 < 256; i2++) {
            this.f15435[i2] = true;
        }
        this.f15443 = this.f15445 + 1;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f15444.close();
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
        byte[] bArr2 = this.f15437;
        int length = bArr2.length - this.f15436;
        if (length > 0) {
            iMin = Math.min(length, i2);
            System.arraycopy(bArr2, this.f15436, bArr, i, iMin);
            this.f15436 += iMin;
        } else {
            iMin = 0;
        }
        while (true) {
            int i4 = i2 - iMin;
            if (i4 <= 0) {
                break;
            }
            int i5 = this.f15439;
            if (i5 > 31) {
                boolean z3 = z2;
                C5919.m11249("Code size must not be bigger than 31");
                return z3 ? 1 : 0;
            }
            C8978 c8978 = this.f15444;
            int iM14567 = (int) c8978.m14567(i5);
            int i6 = -1;
            if (iM14567 < 0) {
                z = z2;
            } else {
                int[] iArr = this.f15440;
                int i7 = this.f15445;
                boolean[] zArr = this.f15435;
                z = z2;
                if (iM14567 != i7) {
                    if (zArr[iM14567]) {
                        objArr = z ? 1 : 0;
                    } else {
                        int i8 = this.f15442;
                        if (i8 == -1) {
                            C5919.m11246("The first code can't be a reference to its preceding code");
                            return z ? 1 : 0;
                        }
                        iM14567 = m10915(this.f15438, i8);
                        objArr = 1;
                    }
                    for (int i9 = iM14567; i9 >= 0; i9 = iArr[i9]) {
                        int i10 = this.f15436 - 1;
                        this.f15436 = i10;
                        bArr2[i10] = this.f15441[i9];
                    }
                    int i11 = this.f15442;
                    if (i11 != -1 && objArr == 0) {
                        m10915(bArr2[this.f15436], i11);
                    }
                    this.f15442 = iM14567;
                    i6 = this.f15436;
                    this.f15438 = bArr2[i6];
                } else {
                    int i12 = this.f15439;
                    if (i12 > 31) {
                        C5919.m11249("Code size must not be bigger than 31");
                        return z ? 1 : 0;
                    }
                    int iM145672 = (int) c8978.m14567(i12);
                    if (iM145672 < 0) {
                        C5919.m11246("Unexpected EOF;");
                        return z ? 1 : 0;
                    }
                    if (iM145672 == 1) {
                        int i13 = this.f15439;
                        if (i13 >= 13) {
                            C5919.m11246("Attempt to increase code size beyond maximum");
                            return z ? 1 : 0;
                        }
                        this.f15439 = i13 + 1;
                    } else {
                        if (iM145672 != 2) {
                            C5919.m11246(AbstractC6136.m11556(iM145672, "Invalid clear code subcode "));
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
                        this.f15443 = i7 + 1;
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
            int length2 = bArr2.length - this.f15436;
            if (length2 > 0) {
                iMin2 = Math.min(length2, i4);
                System.arraycopy(bArr2, this.f15436, bArr, i16, iMin2);
                this.f15436 += iMin2;
            } else {
                iMin2 = z;
            }
            iMin += iMin2;
            z2 = z;
        }
        return iMin;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m10915(byte b, int i) {
        boolean[] zArr;
        int i2 = this.f15443;
        while (true) {
            zArr = this.f15435;
            if (i2 >= 8192 || !zArr[i2]) {
                break;
            }
            i2++;
        }
        this.f15443 = i2;
        if (i2 < 8192) {
            this.f15440[i2] = i;
            this.f15441[i2] = b;
            this.f15443 = i2 + 1;
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
        byte[] bArr = this.f15446;
        int i = read(bArr);
        return i < 0 ? i : bArr[0] & DefaultClassResolver.NAME;
    }
}
