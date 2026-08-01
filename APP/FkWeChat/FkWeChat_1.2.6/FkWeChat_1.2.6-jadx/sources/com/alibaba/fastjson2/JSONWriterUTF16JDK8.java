package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.JDKUtils;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class JSONWriterUTF16JDK8 extends JSONWriterUTF16 {
    public JSONWriterUTF16JDK8(JSONWriter.Context context) {
        super(context);
    }

    @Override // com.alibaba.fastjson2.JSONWriterUTF16, com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        if (str == null) {
            if (isEnabled(JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask)) {
                writeString(_UrlKt.FRAGMENT_ENCODE_SET);
                return;
            } else {
                writeNull();
                return;
            }
        }
        long j10 = this.context.features;
        boolean z10 = (JSONWriter.Feature.BrowserSecure.mask & j10) != 0;
        boolean z11 = (j10 & JSONWriter.Feature.EscapeNoneAscii.mask) != 0;
        char[] charArray = JDKUtils.getCharArray(str);
        int length = charArray.length;
        for (char c10 : charArray) {
            if (c10 == this.quote || c10 == '\\' || c10 < ' ' || ((z10 && (c10 == '<' || c10 == '>' || c10 == '(' || c10 == ')')) || (z11 && c10 > 127))) {
                writeStringEscape(str);
                return;
            }
        }
        int i10 = this.off + length + 2;
        if (i10 >= this.chars.length) {
            grow0(i10);
        }
        char[] cArr = this.chars;
        int i11 = this.off;
        int i12 = i11 + 1;
        this.off = i12;
        cArr[i11] = this.quote;
        System.arraycopy(charArray, 0, cArr, i12, charArray.length);
        int i13 = this.off + length;
        char[] cArr2 = this.chars;
        this.off = i13 + 1;
        cArr2[i13] = this.quote;
    }
}
