package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC3687;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3726 extends C3725 {
    @Override // com.alibaba.fastjson2.C3725, com.alibaba.fastjson2.AbstractC3730
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo6577(String str) {
        if (str == null) {
            if (m6634(JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask)) {
                mo6577("");
                return;
            } else {
                mo6527();
                return;
            }
        }
        long j = this.f9523.f9498;
        boolean z = (JSONWriter$Feature.BrowserSecure.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.EscapeNoneAscii.mask) != 0;
        char[] cArrM6330 = AbstractC3687.m6330(str);
        int length = cArrM6330.length;
        int i = 0;
        while (true) {
            int length2 = cArrM6330.length;
            char c = this.f9519;
            if (i >= length2) {
                int i2 = this.f9514 + length + 2;
                if (i2 >= this.f9486.length) {
                    m6560(i2);
                }
                char[] cArr = this.f9486;
                int i3 = this.f9514;
                int i4 = i3 + 1;
                this.f9514 = i4;
                cArr[i3] = c;
                System.arraycopy(cArrM6330, 0, cArr, i4, cArrM6330.length);
                int i5 = this.f9514 + length;
                char[] cArr2 = this.f9486;
                this.f9514 = i5 + 1;
                cArr2[i5] = c;
                return;
            }
            char c2 = cArrM6330[i];
            if (c2 == c || c2 == '\\' || c2 < ' ' || ((z && (c2 == '<' || c2 == '>' || c2 == '(' || c2 == ')')) || (z2 && c2 > 127))) {
                break;
            } else {
                i++;
            }
        }
        m6565(str);
    }
}
