package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2821;
import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2854;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2909 extends C2892 {
    @Override // com.alibaba.fastjson2.C2892, com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo6017(String str) {
        long j;
        int i;
        char cM5741;
        char[] cArr = str == null ? null : (char[]) AbstractC2854.f8921.getObject(str, AbstractC2854.f8916);
        if (cArr == null) {
            mo6048();
            return;
        }
        long j2 = this.f9178.f9153;
        long j3 = JSONWriter$Feature.BrowserSecure.mask;
        long j4 = JSONWriter$Feature.EscapeNoneAscii.mask;
        long j5 = (j3 | j4) & j2;
        long j6 = 0;
        int i2 = 0;
        char c = this.f9174;
        if (j5 != 0) {
            boolean z = (j2 & j4) != 0;
            int i3 = this.f9169;
            int length = cArr.length + i3 + 2;
            if (length >= this.f9141.length) {
                m6000(length);
            }
            char[] cArr2 = this.f9141;
            int i4 = i3 + 1;
            cArr2[i3] = c;
            int length2 = cArr.length;
            while (i2 < length2) {
                char cM57412 = AbstractC2849.m5741(i2, cArr);
                if (cM57412 == '\\' || cM57412 == c || cM57412 < ' ' || cM57412 == '<' || cM57412 == '>' || cM57412 == '(' || cM57412 == ')' || (z && cM57412 > 127)) {
                    m6004(cArr);
                    return;
                } else {
                    cArr2[i4] = cM57412;
                    i2++;
                    i4++;
                }
            }
            cArr2[i4] = c;
            this.f9169 = i4 + 1;
            return;
        }
        int i5 = this.f9169;
        int length3 = cArr.length + i5 + 2;
        if (length3 >= this.f9141.length) {
            m6000(length3);
        }
        char[] cArr3 = this.f9141;
        int i6 = i5 + 1;
        cArr3[i5] = c;
        int length4 = cArr.length;
        while (i2 < length4) {
            int i7 = i2 + 8;
            if (i7 < length4) {
                long jM5731 = AbstractC2849.m5731(i2, cArr);
                j = j6;
                long jM57312 = AbstractC2849.m5731(i2 + 4, cArr);
                if (((jM5731 | jM57312) & (-71777214294589696L)) == j) {
                    i = i2;
                    if (AbstractC2821.m5664((jM5731 << 8) | jM57312, this.f9139)) {
                        AbstractC2849.m5747(cArr3, i6, jM5731);
                        AbstractC2849.m5747(cArr3, i6 + 4, jM57312);
                        i6 += 8;
                        i2 = i7;
                        j6 = j;
                    } else {
                        i2 = i + 1;
                        cM5741 = AbstractC2849.m5741(i, cArr);
                        if (cM5741 != '\\' || cM5741 == c || cM5741 < ' ') {
                            m6004(cArr);
                            return;
                        } else {
                            cArr3[i6] = cM5741;
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
            cM5741 = AbstractC2849.m5741(i, cArr);
            if (cM5741 != '\\') {
            }
            m6004(cArr);
            return;
        }
        cArr3[i6] = c;
        this.f9169 = i6 + 1;
    }
}
