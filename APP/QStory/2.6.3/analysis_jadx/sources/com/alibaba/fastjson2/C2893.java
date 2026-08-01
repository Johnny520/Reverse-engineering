package com.alibaba.fastjson2;

import com.alibaba.fastjson2.util.AbstractC2854;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2893 extends C2892 {
    @Override // com.alibaba.fastjson2.C2892, com.alibaba.fastjson2.AbstractC2897
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰 */
    public final void mo6017(String str) {
        if (str == null) {
            if (m6074(JSONWriter$Feature.NullAsDefaultValue.mask | JSONWriter$Feature.WriteNullStringAsEmpty.mask)) {
                mo6017("");
                return;
            } else {
                mo5967();
                return;
            }
        }
        long j = this.f9178.f9153;
        boolean z = (JSONWriter$Feature.BrowserSecure.mask & j) != 0;
        boolean z2 = (j & JSONWriter$Feature.EscapeNoneAscii.mask) != 0;
        char[] cArrM5770 = AbstractC2854.m5770(str);
        int length = cArrM5770.length;
        int i = 0;
        while (true) {
            int length2 = cArrM5770.length;
            char c = this.f9174;
            if (i >= length2) {
                int i2 = this.f9169 + length + 2;
                if (i2 >= this.f9141.length) {
                    m6000(i2);
                }
                char[] cArr = this.f9141;
                int i3 = this.f9169;
                int i4 = i3 + 1;
                this.f9169 = i4;
                cArr[i3] = c;
                System.arraycopy(cArrM5770, 0, cArr, i4, cArrM5770.length);
                int i5 = this.f9169 + length;
                char[] cArr2 = this.f9141;
                this.f9169 = i5 + 1;
                cArr2[i5] = c;
                return;
            }
            char c2 = cArrM5770[i];
            if (c2 == c || c2 == '\\' || c2 < ' ' || ((z && (c2 == '<' || c2 == '>' || c2 == '(' || c2 == ')')) || (z2 && c2 > 127))) {
                break;
            } else {
                i++;
            }
        }
        m6005(str);
    }
}
