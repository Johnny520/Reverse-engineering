package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2820;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2853;
import p007.AbstractC6136;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2909 extends C2891 {
    @Override // com.alibaba.fastjson2.C2891, com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo5944(boolean z) {
        int iM5637;
        int i = this.f9167 + 5;
        if (i >= this.f9139.length) {
            m5955(i);
        }
        char[] cArr = this.f9139;
        int i2 = this.f9167;
        if ((this.f9176.f9151 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0) {
            iM5637 = i2 + 1;
            cArr[i2] = z ? '1' : '0';
        } else {
            iM5637 = AbstractC2848.m5637(cArr, i2, z);
        }
        this.f9167 = iM5637;
    }

    @Override // com.alibaba.fastjson2.C2891, com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo5972(String str) {
        char c;
        long j;
        char cM5688;
        char c2;
        if (str == null) {
            mo6003();
            return;
        }
        byte[] bArr = (byte[]) AbstractC2853.f8925.apply(str);
        int iApplyAsInt = AbstractC2853.f8924.applyAsInt(str);
        long j2 = this.f9137;
        C2894 c2894 = this.f9176;
        char c3 = ' ';
        char c4 = this.f9172;
        if (iApplyAsInt == 0) {
            long j3 = c2894.f9151 & 34359738368L;
            int i = this.f9167;
            if (j3 != 0) {
                int length = bArr.length + i + 2;
                if (length >= this.f9139.length) {
                    m5955(length);
                }
                char[] cArr = this.f9139;
                int i2 = i + 1;
                cArr[i] = c4;
                int length2 = bArr.length;
                int i3 = i2;
                int i4 = 0;
                while (i4 < length2) {
                    char c5 = bArr[i4];
                    if (c5 == '\\' || c5 == c4 || c5 < ' ' || c5 == '<' || c5 == '>' || c5 == '(' || c5 == ')') {
                        this.f9167 = i;
                        char[] cArr2 = this.f9139;
                        int iM11541 = AbstractC6136.m11541(bArr.length, 6, i, 2);
                        if (iM11541 >= cArr2.length) {
                            m5955(iM11541);
                            cArr2 = this.f9139;
                        }
                        char c6 = this.f9172;
                        cArr2[i] = c6;
                        this.f9167 = AbstractC2820.m5616(cArr2, i2, bArr, 0, c6, c2894.f9151);
                        return;
                    }
                    cArr[i3] = c5;
                    i4++;
                    i3++;
                }
                cArr[i3] = c4;
                this.f9167 = i3 + 1;
                return;
            }
            char[] cArr3 = this.f9139;
            int length3 = bArr.length + i + 2;
            if (length3 >= cArr3.length) {
                m5955(length3);
                cArr3 = this.f9139;
            }
            int i5 = i + 1;
            cArr3[i] = c4;
            int length4 = bArr.length & (-8);
            int i6 = 0;
            while (true) {
                if (i6 >= length4) {
                    c2 = c3;
                    break;
                }
                char c7 = c3;
                long jM5683 = AbstractC2848.m5683(bArr, i6);
                c2 = c7;
                if (!AbstractC2820.m5619(jM5683, j2)) {
                    break;
                }
                AbstractC2848.m5702(cArr3, i5, C2891.m5913(jM5683));
                AbstractC2848.m5702(cArr3, i5 + 4, C2891.m5913(jM5683 >>> c2));
                i5 += 8;
                i6 += 8;
                c3 = c2;
            }
            while (i6 < bArr.length) {
                char c8 = bArr[i6];
                if (c8 == '\\' || c8 == c4 || c8 < c2) {
                    int length5 = (bArr.length * 5) + length3;
                    if (length5 >= cArr3.length) {
                        m5955(length5);
                        cArr3 = this.f9139;
                    }
                    this.f9167 = AbstractC2820.m5616(cArr3, i5, bArr, i6, this.f9172, c2894.f9151);
                    return;
                }
                cArr3[i5] = c8;
                i6++;
                i5++;
                c2 = ' ';
            }
            int i7 = i5;
            cArr3[i7] = c4;
            this.f9167 = i7 + 1;
            return;
        }
        if (bArr == null) {
            mo6003();
            return;
        }
        long j4 = c2894.f9151;
        long j5 = JSONWriter$Feature.BrowserSecure.mask;
        long j6 = j2;
        long j7 = JSONWriter$Feature.EscapeNoneAscii.mask;
        if ((j4 & (j5 | j7)) != 0) {
            boolean z = (j4 & j7) != 0;
            int i8 = this.f9167;
            int length6 = bArr.length + i8 + 2;
            if (length6 >= this.f9139.length) {
                m5955(length6);
            }
            char[] cArr4 = this.f9139;
            int i9 = i8 + 1;
            cArr4[i8] = c4;
            int length7 = bArr.length >> 1;
            int i10 = 0;
            while (i10 < length7) {
                char cM56882 = AbstractC2848.m5688(bArr, i10);
                if (cM56882 == '\\' || cM56882 == c4 || cM56882 < ' ' || cM56882 == '<' || cM56882 == '>' || cM56882 == '(' || cM56882 == ')' || (z && cM56882 > 127)) {
                    m5958(bArr);
                    return;
                } else {
                    cArr4[i9] = cM56882;
                    i10++;
                    i9++;
                }
            }
            cArr4[i9] = c4;
            this.f9167 = i9 + 1;
            return;
        }
        int i11 = this.f9167;
        int length8 = bArr.length + i11 + 2;
        if (length8 >= this.f9139.length) {
            m5955(length8);
        }
        char[] cArr5 = this.f9139;
        int i12 = i11 + 1;
        cArr5[i11] = c4;
        int length9 = bArr.length >> 1;
        int i13 = 0;
        while (i13 < length9) {
            int i14 = i13 + 8;
            if (i14 < length9) {
                long jM56832 = AbstractC2848.m5683(bArr, i13 << 1);
                long jM56833 = AbstractC2848.m5683(bArr, (i13 + 4) << 1);
                if (((jM56832 | jM56833) & (-71777214294589696L)) == 0) {
                    c = c4;
                    j = j6;
                    if (AbstractC2820.m5619((jM56832 << 8) | jM56833, j)) {
                        AbstractC2848.m5702(cArr5, i12, jM56832);
                        AbstractC2848.m5702(cArr5, i12 + 4, jM56833);
                        i12 += 8;
                        i13 = i14;
                        c4 = c;
                        j6 = j;
                    } else {
                        int i15 = i13 + 1;
                        cM5688 = AbstractC2848.m5688(bArr, i13);
                        if (cM5688 != '\\' || cM5688 == c || cM5688 < ' ') {
                            m5958(bArr);
                            return;
                        }
                        cArr5[i12] = cM5688;
                        i13 = i15;
                        c4 = c;
                        i12++;
                        j6 = j;
                    }
                }
            }
            c = c4;
            j = j6;
            int i152 = i13 + 1;
            cM5688 = AbstractC2848.m5688(bArr, i13);
            if (cM5688 != '\\') {
            }
            m5958(bArr);
            return;
        }
        cArr5[i12] = c4;
        this.f9167 = i12 + 1;
    }
}
