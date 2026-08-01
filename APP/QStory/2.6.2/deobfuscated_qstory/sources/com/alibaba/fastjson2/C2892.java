package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2853;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2892 extends C2891 {
    @Override // com.alibaba.fastjson2.C2891, com.alibaba.fastjson2.AbstractC2896
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo5972(String str) {
        if (str == null) {
            if (m6029(JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask)) {
                mo5972("");
                return;
            } else {
                mo5922();
                return;
            }
        }
        long j = this.f9176.f9151;
        boolean z = (JSONWriter$Feature.BrowserSecure.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.EscapeNoneAscii.mask) != 0;
        char[] cArrM5725 = AbstractC2853.m5725(str);
        int length = cArrM5725.length;
        int i = 0;
        while (true) {
            int length2 = cArrM5725.length;
            char c = this.f9172;
            if (i >= length2) {
                int i2 = this.f9167 + length + 2;
                if (i2 >= this.f9139.length) {
                    m5955(i2);
                }
                char[] cArr = this.f9139;
                int i3 = this.f9167;
                int i4 = i3 + 1;
                this.f9167 = i4;
                cArr[i3] = c;
                System.arraycopy(cArrM5725, 0, cArr, i4, cArrM5725.length);
                int i5 = this.f9167 + length;
                char[] cArr2 = this.f9139;
                this.f9167 = i5 + 1;
                cArr2[i5] = c;
                return;
            }
            char c2 = cArrM5725[i];
            if (c2 == c || c2 == '\\' || c2 < ' ' || ((z && (c2 == '<' || c2 == '>' || c2 == '(' || c2 == ')')) || (z2 && c2 > 127))) {
                break;
            } else {
                i++;
            }
        }
        m5960(str);
    }
}
