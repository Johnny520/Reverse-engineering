package org.apache.commons.compress.compressors.deflate64;

import androidx.appcompat.widget.C1037;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3889;
import java.io.EOFException;
import java.io.IOException;
import p395.C9826;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6450 extends AbstractC3889 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C6449 f15839;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f15840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f15841;

    public C6450(C6449 c6449, long j) {
        this.f15839 = c6449;
        this.f15841 = j;
    }

    @Override // com.bumptech.glide.AbstractC3889
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final HuffmanState mo7320() {
        return this.f15840 < this.f15841 ? HuffmanState.STORED : HuffmanState.INITIAL;
    }

    @Override // com.bumptech.glide.AbstractC3889
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo7321() {
        long j = this.f15841 - this.f15840;
        C9826 c9826 = this.f15839.f15837;
        return (int) Math.min(j, ((((long) c9826.f25609.available()) * 8) + ((long) c9826.f25606)) / 8);
    }

    @Override // com.bumptech.glide.AbstractC3889
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo7322(byte[] bArr, int i, int i2) throws IOException {
        C6449 c6449 = this.f15839;
        C1037 c1037 = c6449.f15834;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.f15841 - this.f15840, i2);
        while (i3 < iMin) {
            int i4 = 1;
            if (c6449.f15837.f25606 > 0) {
                byte bM11539 = (byte) C6449.m11539(r3, 8);
                int i5 = i + i3;
                byte[] bArr2 = (byte[]) c1037.f1088;
                int i6 = c1037.f1090;
                bArr2[i6] = bM11539;
                int i7 = 65535 & (i6 + 1);
                if (!c1037.f1089 && i7 < i6) {
                    c1037.f1089 = true;
                }
                c1037.f1090 = i7;
                bArr[i5] = bM11539;
            } else {
                int i8 = i + i3;
                int i9 = c6449.f15835.read(bArr, i8, iMin - i3);
                if (i9 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                for (int i10 = i8; i10 < i8 + i9; i10++) {
                    byte b = bArr[i10];
                    byte[] bArr3 = (byte[]) c1037.f1088;
                    int i11 = c1037.f1090;
                    bArr3[i11] = b;
                    int i12 = (i11 + 1) & Opcodes.MAX_VALUE;
                    if (!c1037.f1089 && i12 < i11) {
                        c1037.f1089 = true;
                    }
                    c1037.f1090 = i12;
                }
                i4 = i9;
            }
            this.f15840 += (long) i4;
            i3 += i4;
        }
        return iMin;
    }

    @Override // com.bumptech.glide.AbstractC3889
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo7323() {
        return this.f15840 < this.f15841;
    }
}
