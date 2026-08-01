package com.alibaba.fastjson2;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.JDKUtils;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class JSONWriterUTF16JDK9UF extends JSONWriterUTF16 {
    public JSONWriterUTF16JDK9UF(JSONWriter.Context context) {
        super(context);
    }

    @Override // com.alibaba.fastjson2.JSONWriterUTF16, com.alibaba.fastjson2.JSONWriter
    public void writeBool(boolean z10) {
        int iPutBoolean;
        int i10 = this.off + 5;
        if (i10 >= this.chars.length) {
            grow0(i10);
        }
        char[] cArr = this.chars;
        int i11 = this.off;
        if ((this.context.features & JSONWriter.Feature.WriteBooleanAsNumber.mask) != 0) {
            iPutBoolean = i11 + 1;
            cArr[i11] = z10 ? '1' : '0';
        } else {
            iPutBoolean = IOUtils.putBoolean(cArr, i11, z10);
        }
        this.off = iPutBoolean;
    }

    @Override // com.alibaba.fastjson2.JSONWriterUTF16, com.alibaba.fastjson2.JSONWriter
    public void writeString(String str) {
        if (str == null) {
            writeStringNull();
            return;
        }
        byte[] bArrApply = JDKUtils.STRING_VALUE.apply(str);
        if (JDKUtils.STRING_CODER.applyAsInt(str) == 0) {
            writeStringLatin1(bArrApply);
        } else {
            writeStringUTF16(bArrApply);
        }
    }
}
