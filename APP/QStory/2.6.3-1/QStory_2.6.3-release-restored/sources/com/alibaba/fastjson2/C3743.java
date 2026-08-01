package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3654;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3687;
import p025.AbstractC7012;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3743 extends C3725 {
    @Override // com.alibaba.fastjson2.C3725, com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo6549(boolean z) {
        int iM6242;
        int i = this.f9514 + 5;
        if (i >= this.f9486.length) {
            m6560(i);
        }
        char[] cArr = this.f9486;
        int i2 = this.f9514;
        if ((this.f9523.f9498 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0) {
            iM6242 = i2 + 1;
            cArr[i2] = z ? '1' : '0';
        } else {
            iM6242 = AbstractC3682.m6242(cArr, i2, z);
        }
        this.f9514 = iM6242;
    }

    @Override // com.alibaba.fastjson2.C3725, com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo6577(String str) {
        char c;
        long j;
        char cM6293;
        char c2;
        if (str == null) {
            mo6608();
            return;
        }
        byte[] bArr = (byte[]) AbstractC3687.f9272.apply(str);
        int iApplyAsInt = AbstractC3687.f9271.applyAsInt(str);
        long j2 = this.f9484;
        C3728 c3728 = this.f9523;
        char c3 = ' ';
        char c4 = this.f9519;
        if (iApplyAsInt == 0) {
            long j3 = c3728.f9498 & 34359738368L;
            int i = this.f9514;
            if (j3 != 0) {
                int length = bArr.length + i + 2;
                if (length >= this.f9486.length) {
                    m6560(length);
                }
                char[] cArr = this.f9486;
                int i2 = i + 1;
                cArr[i] = c4;
                int length2 = bArr.length;
                int i3 = i2;
                int i4 = 0;
                while (i4 < length2) {
                    char c5 = bArr[i4];
                    if (c5 == '\\' || c5 == c4 || c5 < ' ' || c5 == '<' || c5 == '>' || c5 == '(' || c5 == ')') {
                        this.f9514 = i;
                        char[] cArr2 = this.f9486;
                        int iM12133 = AbstractC7012.m12133(bArr.length, 6, i, 2);
                        if (iM12133 >= cArr2.length) {
                            m6560(iM12133);
                            cArr2 = this.f9486;
                        }
                        char c6 = this.f9519;
                        cArr2[i] = c6;
                        this.f9514 = AbstractC3654.m6221(cArr2, i2, bArr, 0, c6, c3728.f9498);
                        return;
                    }
                    cArr[i3] = c5;
                    i4++;
                    i3++;
                }
                cArr[i3] = c4;
                this.f9514 = i3 + 1;
                return;
            }
            char[] cArr3 = this.f9486;
            int length3 = bArr.length + i + 2;
            if (length3 >= cArr3.length) {
                m6560(length3);
                cArr3 = this.f9486;
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
                long jM6288 = AbstractC3682.m6288(bArr, i6);
                c2 = c7;
                if (!AbstractC3654.m6224(jM6288, j2)) {
                    break;
                }
                AbstractC3682.m6307(cArr3, i5, C3725.m6518(jM6288));
                AbstractC3682.m6307(cArr3, i5 + 4, C3725.m6518(jM6288 >>> c2));
                i5 += 8;
                i6 += 8;
                c3 = c2;
            }
            while (i6 < bArr.length) {
                char c8 = bArr[i6];
                if (c8 == '\\' || c8 == c4 || c8 < c2) {
                    int length5 = (bArr.length * 5) + length3;
                    if (length5 >= cArr3.length) {
                        m6560(length5);
                        cArr3 = this.f9486;
                    }
                    this.f9514 = AbstractC3654.m6221(cArr3, i5, bArr, i6, this.f9519, c3728.f9498);
                    return;
                }
                cArr3[i5] = c8;
                i6++;
                i5++;
                c2 = ' ';
            }
            int i7 = i5;
            cArr3[i7] = c4;
            this.f9514 = i7 + 1;
            return;
        }
        if (bArr == null) {
            mo6608();
            return;
        }
        long j4 = c3728.f9498;
        long j5 = JSONWriter$Feature.BrowserSecure.mask;
        long j6 = j2;
        long j7 = JSONWriter$Feature.EscapeNoneAscii.mask;
        if ((j4 & (j5 | j7)) != 0) {
            boolean z = (j4 & j7) != 0;
            int i8 = this.f9514;
            int length6 = bArr.length + i8 + 2;
            if (length6 >= this.f9486.length) {
                m6560(length6);
            }
            char[] cArr4 = this.f9486;
            int i9 = i8 + 1;
            cArr4[i8] = c4;
            int length7 = bArr.length >> 1;
            int i10 = 0;
            while (i10 < length7) {
                char cM62932 = AbstractC3682.m6293(bArr, i10);
                if (cM62932 == '\\' || cM62932 == c4 || cM62932 < ' ' || cM62932 == '<' || cM62932 == '>' || cM62932 == '(' || cM62932 == ')' || (z && cM62932 > 127)) {
                    m6563(bArr);
                    return;
                } else {
                    cArr4[i9] = cM62932;
                    i10++;
                    i9++;
                }
            }
            cArr4[i9] = c4;
            this.f9514 = i9 + 1;
            return;
        }
        int i11 = this.f9514;
        int length8 = bArr.length + i11 + 2;
        if (length8 >= this.f9486.length) {
            m6560(length8);
        }
        char[] cArr5 = this.f9486;
        int i12 = i11 + 1;
        cArr5[i11] = c4;
        int length9 = bArr.length >> 1;
        int i13 = 0;
        while (i13 < length9) {
            int i14 = i13 + 8;
            if (i14 < length9) {
                long jM62882 = AbstractC3682.m6288(bArr, i13 << 1);
                long jM62883 = AbstractC3682.m6288(bArr, (i13 + 4) << 1);
                if (((jM62882 | jM62883) & (-71777214294589696L)) == 0) {
                    c = c4;
                    j = j6;
                    if (AbstractC3654.m6224((jM62882 << 8) | jM62883, j)) {
                        AbstractC3682.m6307(cArr5, i12, jM62882);
                        AbstractC3682.m6307(cArr5, i12 + 4, jM62883);
                        i12 += 8;
                        i13 = i14;
                        c4 = c;
                        j6 = j;
                    } else {
                        int i15 = i13 + 1;
                        cM6293 = AbstractC3682.m6293(bArr, i13);
                        if (cM6293 != '\\' || cM6293 == c || cM6293 < ' ') {
                            m6563(bArr);
                            return;
                        }
                        cArr5[i12] = cM6293;
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
            cM6293 = AbstractC3682.m6293(bArr, i13);
            if (cM6293 != '\\') {
            }
            m6563(bArr);
            return;
        }
        cArr5[i12] = c4;
        this.f9514 = i12 + 1;
    }
}
