package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3654;
import com.alibaba.fastjson2.util.AbstractC3682;
import com.alibaba.fastjson2.util.AbstractC3687;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3742 extends C3725 {
    @Override // com.alibaba.fastjson2.C3725, com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo6577(String str) {
        long j;
        int i;
        char cM6301;
        char[] cArr = str == null ? null : (char[]) AbstractC3687.f9266.getObject(str, AbstractC3687.f9261);
        if (cArr == null) {
            mo6608();
            return;
        }
        long j2 = this.f9523.f9498;
        long j3 = JSONWriter$Feature.BrowserSecure.mask;
        long j4 = JSONWriter$Feature.EscapeNoneAscii.mask;
        long j5 = (j3 | j4) & j2;
        long j6 = 0;
        int i2 = 0;
        char c = this.f9519;
        if (j5 != 0) {
            boolean z = (j2 & j4) != 0;
            int i3 = this.f9514;
            int length = cArr.length + i3 + 2;
            if (length >= this.f9486.length) {
                m6560(length);
            }
            char[] cArr2 = this.f9486;
            int i4 = i3 + 1;
            cArr2[i3] = c;
            int length2 = cArr.length;
            while (i2 < length2) {
                char cM63012 = AbstractC3682.m6301(i2, cArr);
                if (cM63012 == '\\' || cM63012 == c || cM63012 < ' ' || cM63012 == '<' || cM63012 == '>' || cM63012 == '(' || cM63012 == ')' || (z && cM63012 > 127)) {
                    m6564(cArr);
                    return;
                } else {
                    cArr2[i4] = cM63012;
                    i2++;
                    i4++;
                }
            }
            cArr2[i4] = c;
            this.f9514 = i4 + 1;
            return;
        }
        int i5 = this.f9514;
        int length3 = cArr.length + i5 + 2;
        if (length3 >= this.f9486.length) {
            m6560(length3);
        }
        char[] cArr3 = this.f9486;
        int i6 = i5 + 1;
        cArr3[i5] = c;
        int length4 = cArr.length;
        while (i2 < length4) {
            int i7 = i2 + 8;
            if (i7 < length4) {
                long jM6291 = AbstractC3682.m6291(i2, cArr);
                j = j6;
                long jM62912 = AbstractC3682.m6291(i2 + 4, cArr);
                if (((jM6291 | jM62912) & (-71777214294589696L)) == j) {
                    i = i2;
                    if (AbstractC3654.m6224((jM6291 << 8) | jM62912, this.f9484)) {
                        AbstractC3682.m6307(cArr3, i6, jM6291);
                        AbstractC3682.m6307(cArr3, i6 + 4, jM62912);
                        i6 += 8;
                        i2 = i7;
                        j6 = j;
                    } else {
                        i2 = i + 1;
                        cM6301 = AbstractC3682.m6301(i, cArr);
                        if (cM6301 != '\\' || cM6301 == c || cM6301 < ' ') {
                            m6564(cArr);
                            return;
                        } else {
                            cArr3[i6] = cM6301;
                            i6++;
                            j6 = j;
                        }
                    }
                }
            } else {
                j = j6;
            }
            i = i2;
            i2 = i + 1;
            cM6301 = AbstractC3682.m6301(i, cArr);
            if (cM6301 != '\\') {
            }
            m6564(cArr);
            return;
        }
        cArr3[i6] = c;
        this.f9514 = i6 + 1;
    }
}
