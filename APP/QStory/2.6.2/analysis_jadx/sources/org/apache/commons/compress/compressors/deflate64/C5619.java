package org.apache.commons.compress.compressors.deflate64;

import androidx.appcompat.widget.C0190;
import com.android.dx.io.Opcodes;
import java.io.EOFException;
import java.io.IOException;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p376.C8978;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5619 extends AbstractC4921 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public long f15494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f15495;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final /* synthetic */ C5618 f15496;

    public C5619(C5618 c5618, long j) {
        super(8);
        this.f15496 = c5618;
        this.f15495 = j;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪 */
    public final HuffmanState mo9905() {
        return this.f15494 < this.f15495 ? HuffmanState.STORED : HuffmanState.INITIAL;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final int mo9906(byte[] bArr, int i, int i2) throws IOException {
        C5618 c5618 = this.f15496;
        C0190 c0190 = c5618.f15489;
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        int iMin = (int) Math.min(this.f15495 - this.f15494, i2);
        while (i3 < iMin) {
            int i4 = 1;
            if (c5618.f15492.f25221 > 0) {
                byte bM10923 = (byte) C5618.m10923(r3, 8);
                int i5 = i + i3;
                byte[] bArr2 = (byte[]) c0190.f743;
                int i6 = c0190.f745;
                bArr2[i6] = bM10923;
                int i7 = 65535 & (i6 + 1);
                if (!c0190.f744 && i7 < i6) {
                    c0190.f744 = true;
                }
                c0190.f745 = i7;
                bArr[i5] = bM10923;
            } else {
                int i8 = i + i3;
                int i9 = c5618.f15490.read(bArr, i8, iMin - i3);
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
            this.f15494 += (long) i4;
            i3 += i4;
        }
        return iMin;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo9907() {
        return this.f15494 < this.f15495;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4921
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo9912() {
        long j = this.f15495 - this.f15494;
        C8978 c8978 = this.f15496.f15492;
        return (int) Math.min(j, ((((long) c8978.f25224.available()) * 8) + ((long) c8978.f25221)) / 8);
    }
}
