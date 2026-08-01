package org.apache.commons.compress.compressors.deflate64;

import androidx.appcompat.widget.C0190;
import com.android.dx.io.Opcodes;
import com.bumptech.glide.AbstractC3057;
import java.io.EOFException;
import java.io.IOException;
import p379.C8997;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5620 extends AbstractC3057 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final /* synthetic */ C5619 f15494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public long f15495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f15496;

    public C5620(C5619 c5619, long j) {
        this.f15494 = c5619;
        this.f15496 = j;
    }

    @Override // com.bumptech.glide.AbstractC3057
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final HuffmanState mo6760() {
        return this.f15495 < this.f15496 ? HuffmanState.STORED : HuffmanState.INITIAL;
    }

    @Override // com.bumptech.glide.AbstractC3057
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo6761() {
        long j = this.f15496 - this.f15495;
        C8997 c8997 = this.f15494.f15492;
        return (int) Math.min(j, ((((long) c8997.f25264.available()) * 8) + ((long) c8997.f25261)) / 8);
    }

    @Override // com.bumptech.glide.AbstractC3057
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo6762(byte[] bArr, int i, int i2) throws IOException {
        C5619 c5619 = this.f15494;
        C0190 c0190 = c5619.f15489;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.f15496 - this.f15495, i2);
        while (i3 < iMin) {
            int i4 = 1;
            if (c5619.f15492.f25261 > 0) {
                byte bM10980 = (byte) C5619.m10980(r3, 8);
                int i5 = i + i3;
                byte[] bArr2 = (byte[]) c0190.f743;
                int i6 = c0190.f745;
                bArr2[i6] = bM10980;
                int i7 = 65535 & (i6 + 1);
                if (!c0190.f744 && i7 < i6) {
                    c0190.f744 = true;
                }
                c0190.f745 = i7;
                bArr[i5] = bM10980;
            } else {
                int i8 = i + i3;
                int i9 = c5619.f15490.read(bArr, i8, iMin - i3);
                if (i9 == -1) {
                    throw new EOFException("Truncated Deflate64 Stream");
                }
                for (int i10 = i8; i10 < i8 + i9; i10++) {
                    byte b = bArr[i10];
                    byte[] bArr3 = (byte[]) c0190.f743;
                    int i11 = c0190.f745;
                    bArr3[i11] = b;
                    int i12 = (i11 + 1) & Opcodes.MAX_VALUE;
                    if (!c0190.f744 && i12 < i11) {
                        c0190.f744 = true;
                    }
                    c0190.f745 = i12;
                }
                i4 = i9;
            }
            this.f15495 += (long) i4;
            i3 += i4;
        }
        return iMin;
    }

    @Override // com.bumptech.glide.AbstractC3057
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo6763() {
        return this.f15495 < this.f15496;
    }
}
