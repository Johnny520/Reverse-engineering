package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2820;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2853;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2908 extends C2891 {
    @Override // com.alibaba.fastjson2.C2891, com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo5972(String str) {
        long j;
        int i;
        char cM5696;
        char[] cArr = str == null ? null : (char[]) AbstractC2853.f8919.getObject(str, AbstractC2853.f8914);
        if (cArr == null) {
            mo6003();
            return;
        }
        long j2 = this.f9176.f9151;
        long j3 = JSONWriter$Feature.BrowserSecure.mask;
        long j4 = JSONWriter$Feature.EscapeNoneAscii.mask;
        long j5 = (j3 | j4) & j2;
        long j6 = 0;
        int i2 = 0;
        char c = this.f9172;
        if (j5 != 0) {
            boolean z = (j2 & j4) != 0;
            int i3 = this.f9167;
            int length = cArr.length + i3 + 2;
            if (length >= this.f9139.length) {
                m5955(length);
            }
            char[] cArr2 = this.f9139;
            int i4 = i3 + 1;
            cArr2[i3] = c;
            int length2 = cArr.length;
            while (i2 < length2) {
                char cM56962 = AbstractC2848.m5696(i2, cArr);
                if (cM56962 == '\\' || cM56962 == c || cM56962 < ' ' || cM56962 == '<' || cM56962 == '>' || cM56962 == '(' || cM56962 == ')' || (z && cM56962 > 127)) {
                    m5959(cArr);
                    return;
                } else {
                    cArr2[i4] = cM56962;
                    i2++;
                    i4++;
                }
            }
            cArr2[i4] = c;
            this.f9167 = i4 + 1;
            return;
        }
        int i5 = this.f9167;
        int length3 = cArr.length + i5 + 2;
        if (length3 >= this.f9139.length) {
            m5955(length3);
        }
        char[] cArr3 = this.f9139;
        int i6 = i5 + 1;
        cArr3[i5] = c;
        int length4 = cArr.length;
        while (i2 < length4) {
            int i7 = i2 + 8;
            if (i7 < length4) {
                long jM5686 = AbstractC2848.m5686(i2, cArr);
                j = j6;
                long jM56862 = AbstractC2848.m5686(i2 + 4, cArr);
                if (((jM5686 | jM56862) & (-71777214294589696L)) == j) {
                    i = i2;
                    if (AbstractC2820.m5619((jM5686 << 8) | jM56862, this.f9137)) {
                        AbstractC2848.m5702(cArr3, i6, jM5686);
                        AbstractC2848.m5702(cArr3, i6 + 4, jM56862);
                        i6 += 8;
                        i2 = i7;
                        j6 = j;
                    } else {
                        i2 = i + 1;
                        cM5696 = AbstractC2848.m5696(i, cArr);
                        if (cM5696 != '\\' || cM5696 == c || cM5696 < ' ') {
                            m5959(cArr);
                            return;
                        } else {
                            cArr3[i6] = cM5696;
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
            cM5696 = AbstractC2848.m5696(i, cArr);
            if (cM5696 != '\\') {
            }
            m5959(cArr);
            return;
        }
        cArr3[i6] = c;
        this.f9167 = i6 + 1;
    }
}
