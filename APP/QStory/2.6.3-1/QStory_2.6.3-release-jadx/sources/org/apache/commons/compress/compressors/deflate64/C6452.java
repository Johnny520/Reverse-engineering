package org.apache.commons.compress.compressors.deflate64;

import androidx.appcompat.widget.C1037;
import androidx.compose.p001ui.text.input.C2853;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3889;
import p025.AbstractC7012;
import p395.AbstractC9825;
import p395.C9826;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: org.apache.commons.compress.compressors.deflate64.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6452 extends AbstractC3889 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C2853 f15842;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C2853 f15843;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HuffmanState f15844;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public boolean f15845;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public byte[] f15846 = AbstractC9825.f25604;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public int f15847;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f15848;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final /* synthetic */ C6449 f15849;

    public C6452(C6449 c6449, HuffmanState huffmanState, int[] iArr, int[] iArr2) {
        this.f15849 = c6449;
        this.f15844 = huffmanState;
        this.f15843 = C6449.m11538(iArr);
        this.f15842 = C6449.m11538(iArr2);
    }

    @Override // com.bumptech.glide.AbstractC3889
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final HuffmanState mo7320() {
        return this.f15845 ? HuffmanState.INITIAL : this.f15844;
    }

    @Override // com.bumptech.glide.AbstractC3889
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo7321() {
        return this.f15848 - this.f15847;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        return r5;
     */
    @Override // com.bumptech.glide.AbstractC3889
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo7322(byte[] bArr, int i, int i2) {
        int iMin;
        int i3;
        int iMin2;
        int i4;
        int i5 = 0;
        if (i2 != 0) {
            if (!this.f15845) {
                int i6 = this.f15848 - this.f15847;
                if (i6 > 0) {
                    iMin = Math.min(i2, i6);
                    System.arraycopy(this.f15846, this.f15847, bArr, i, iMin);
                    this.f15847 += iMin;
                } else {
                    iMin = 0;
                }
                while (true) {
                    if (iMin >= i2) {
                        break;
                    }
                    C6449 c6449 = this.f15849;
                    C9826 c9826 = c6449.f15837;
                    C1037 c1037 = c6449.f15834;
                    byte[] bArr2 = (byte[]) c1037.f1088;
                    int iM11537 = C6449.m11537(c9826, this.f15843);
                    int i7 = Opcodes.MAX_VALUE;
                    if (iM11537 >= 256) {
                        if (iM11537 <= 256) {
                            this.f15845 = true;
                            break;
                        }
                        short s = C6449.f15832[iM11537 - 257];
                        int iM15160 = AbstractC9825.m15160(s >>> 5, C6449.m11539(c6449.f15837, s & 31));
                        int i8 = C6449.f15833[C6449.m11537(c6449.f15837, this.f15842)];
                        int iM151602 = AbstractC9825.m15160(i8 >>> 4, C6449.m11539(c6449.f15837, i8 & 15));
                        if (this.f15846.length < iM15160) {
                            this.f15846 = new byte[iM15160];
                        }
                        this.f15848 = iM15160;
                        this.f15847 = i5;
                        byte[] bArr3 = this.f15846;
                        if (iM151602 > bArr2.length) {
                            int i9 = i5;
                            C6755.m11870(AbstractC7012.m12147(iM151602, "Illegal distance parameter: "));
                            return i9;
                        }
                        int i10 = c1037.f1090;
                        int i11 = (i10 - iM151602) & Opcodes.MAX_VALUE;
                        if (!c1037.f1089 && i11 >= i10) {
                            C6755.m11870(AbstractC7012.m12147(iM151602, "Attempt to read beyond memory: dist="));
                            return i5;
                        }
                        int i12 = i5;
                        while (i12 < iM15160) {
                            byte b = bArr2[i11];
                            int i13 = c1037.f1090;
                            bArr2[i13] = b;
                            int i14 = i5;
                            int i15 = (i13 + 1) & i7;
                            int i16 = i7;
                            if (!c1037.f1089 && i15 < i13) {
                                c1037.f1089 = true;
                            }
                            c1037.f1090 = i15;
                            bArr3[i12] = b;
                            i12++;
                            int i17 = (i11 + 1) & i16;
                            if (!c1037.f1089 && i17 < i11) {
                                c1037.f1089 = true;
                            }
                            i11 = i17;
                            i7 = i16;
                            i5 = i14;
                        }
                        i3 = i5;
                        int i18 = i + iMin;
                        int i19 = i2 - iMin;
                        int i20 = this.f15848 - this.f15847;
                        if (i20 > 0) {
                            iMin2 = Math.min(i19, i20);
                            System.arraycopy(this.f15846, this.f15847, bArr, i18, iMin2);
                            this.f15847 += iMin2;
                        } else {
                            iMin2 = i3;
                        }
                        i4 = iMin2 + iMin;
                    } else {
                        i4 = iMin + 1;
                        int i21 = iMin + i;
                        byte b2 = (byte) iM11537;
                        int i22 = c1037.f1090;
                        bArr2[i22] = b2;
                        int i23 = (i22 + 1) & Opcodes.MAX_VALUE;
                        if (!c1037.f1089 && i23 < i22) {
                            c1037.f1089 = true;
                        }
                        c1037.f1090 = i23;
                        bArr[i21] = b2;
                        i3 = i5;
                    }
                    iMin = i4;
                    i5 = i3;
                }
            } else {
                return -1;
            }
        } else {
            return 0;
        }
    }

    @Override // com.bumptech.glide.AbstractC3889
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final boolean mo7323() {
        return !this.f15845;
    }
}
