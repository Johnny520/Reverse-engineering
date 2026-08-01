package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2821;
import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2854;
import p009.AbstractC6183;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2910 extends C2892 {
    @Override // com.alibaba.fastjson2.C2892, com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世 */
    public final void mo5989(boolean z) {
        int iM5682;
        int i = this.f9169 + 5;
        if (i >= this.f9141.length) {
            m6000(i);
        }
        char[] cArr = this.f9141;
        int i2 = this.f9169;
        if ((this.f9178.f9153 & JSONWriter$Feature.WriteBooleanAsNumber.mask) != 0) {
            iM5682 = i2 + 1;
            cArr[i2] = z ? '1' : '0';
        } else {
            iM5682 = AbstractC2849.m5682(cArr, i2, z);
        }
        this.f9169 = iM5682;
    }

    @Override // com.alibaba.fastjson2.C2892, com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo6017(String str) {
        char c;
        long j;
        char cM5733;
        char c2;
        if (str == null) {
            mo6048();
            return;
        }
        byte[] bArr = (byte[]) AbstractC2854.f8927.apply(str);
        int iApplyAsInt = AbstractC2854.f8926.applyAsInt(str);
        long j2 = this.f9139;
        C2895 c2895 = this.f9178;
        char c3 = ' ';
        char c4 = this.f9174;
        if (iApplyAsInt == 0) {
            long j3 = c2895.f9153 & 34359738368L;
            int i = this.f9169;
            if (j3 != 0) {
                int length = bArr.length + i + 2;
                if (length >= this.f9141.length) {
                    m6000(length);
                }
                char[] cArr = this.f9141;
                int i2 = i + 1;
                cArr[i] = c4;
                int length2 = bArr.length;
                int i3 = i2;
                int i4 = 0;
                while (i4 < length2) {
                    char c5 = bArr[i4];
                    if (c5 == '\\' || c5 == c4 || c5 < ' ' || c5 == '<' || c5 == '>' || c5 == '(' || c5 == ')') {
                        this.f9169 = i;
                        char[] cArr2 = this.f9141;
                        int iM11574 = AbstractC6183.m11574(bArr.length, 6, i, 2);
                        if (iM11574 >= cArr2.length) {
                            m6000(iM11574);
                            cArr2 = this.f9141;
                        }
                        char c6 = this.f9174;
                        cArr2[i] = c6;
                        this.f9169 = AbstractC2821.m5661(cArr2, i2, bArr, 0, c6, c2895.f9153);
                        return;
                    }
                    cArr[i3] = c5;
                    i4++;
                    i3++;
                }
                cArr[i3] = c4;
                this.f9169 = i3 + 1;
                return;
            }
            char[] cArr3 = this.f9141;
            int length3 = bArr.length + i + 2;
            if (length3 >= cArr3.length) {
                m6000(length3);
                cArr3 = this.f9141;
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
                long jM5728 = AbstractC2849.m5728(bArr, i6);
                c2 = c7;
                if (!AbstractC2821.m5664(jM5728, j2)) {
                    break;
                }
                AbstractC2849.m5747(cArr3, i5, C2892.m5958(jM5728));
                AbstractC2849.m5747(cArr3, i5 + 4, C2892.m5958(jM5728 >>> c2));
                i5 += 8;
                i6 += 8;
                c3 = c2;
            }
            while (i6 < bArr.length) {
                char c8 = bArr[i6];
                if (c8 == '\\' || c8 == c4 || c8 < c2) {
                    int length5 = (bArr.length * 5) + length3;
                    if (length5 >= cArr3.length) {
                        m6000(length5);
                        cArr3 = this.f9141;
                    }
                    this.f9169 = AbstractC2821.m5661(cArr3, i5, bArr, i6, this.f9174, c2895.f9153);
                    return;
                }
                cArr3[i5] = c8;
                i6++;
                i5++;
                c2 = ' ';
            }
            int i7 = i5;
            cArr3[i7] = c4;
            this.f9169 = i7 + 1;
            return;
        }
        if (bArr == null) {
            mo6048();
            return;
        }
        long j4 = c2895.f9153;
        long j5 = JSONWriter$Feature.BrowserSecure.mask;
        long j6 = j2;
        long j7 = JSONWriter$Feature.EscapeNoneAscii.mask;
        if ((j4 & (j5 | j7)) != 0) {
            boolean z = (j4 & j7) != 0;
            int i8 = this.f9169;
            int length6 = bArr.length + i8 + 2;
            if (length6 >= this.f9141.length) {
                m6000(length6);
            }
            char[] cArr4 = this.f9141;
            int i9 = i8 + 1;
            cArr4[i8] = c4;
            int length7 = bArr.length >> 1;
            int i10 = 0;
            while (i10 < length7) {
                char cM57332 = AbstractC2849.m5733(bArr, i10);
                if (cM57332 == '\\' || cM57332 == c4 || cM57332 < ' ' || cM57332 == '<' || cM57332 == '>' || cM57332 == '(' || cM57332 == ')' || (z && cM57332 > 127)) {
                    m6003(bArr);
                    return;
                } else {
                    cArr4[i9] = cM57332;
                    i10++;
                    i9++;
                }
            }
            cArr4[i9] = c4;
            this.f9169 = i9 + 1;
            return;
        }
        int i11 = this.f9169;
        int length8 = bArr.length + i11 + 2;
        if (length8 >= this.f9141.length) {
            m6000(length8);
        }
        char[] cArr5 = this.f9141;
        int i12 = i11 + 1;
        cArr5[i11] = c4;
        int length9 = bArr.length >> 1;
        int i13 = 0;
        while (i13 < length9) {
            int i14 = i13 + 8;
            if (i14 < length9) {
                long jM57282 = AbstractC2849.m5728(bArr, i13 << 1);
                long jM57283 = AbstractC2849.m5728(bArr, (i13 + 4) << 1);
                if (((jM57282 | jM57283) & (-71777214294589696L)) == 0) {
                    c = c4;
                    j = j6;
                    if (AbstractC2821.m5664((jM57282 << 8) | jM57283, j)) {
                        AbstractC2849.m5747(cArr5, i12, jM57282);
                        AbstractC2849.m5747(cArr5, i12 + 4, jM57283);
                        i12 += 8;
                        i13 = i14;
                        c4 = c;
                        j6 = j;
                    } else {
                        int i15 = i13 + 1;
                        cM5733 = AbstractC2849.m5733(bArr, i13);
                        if (cM5733 != '\\' || cM5733 == c || cM5733 < ' ') {
                            m6003(bArr);
                            return;
                        }
                        cArr5[i12] = cM5733;
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
            cM5733 = AbstractC2849.m5733(bArr, i13);
            if (cM5733 != '\\') {
            }
            m6003(bArr);
            return;
        }
        cArr5[i12] = c4;
        this.f9169 = i12 + 1;
    }
}
