package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.codec.FieldInfo;
import java.lang.reflect.Method;
import java.util.function.Function;
import okhttp3.HttpUrl;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterStringFunc<T> extends FieldWriter<T> {
    final Function<T, String> function;
    final boolean raw;
    final boolean symbol;
    final boolean trim;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterStringFunc(String str, int i9, long j3, String str2, String str3, Method method, Function<T, String> function) {
        super(str, i9, j3, str2, str3, String.class, String.class, null, method);
        this.function = function;
        this.symbol = "symbol".equals(str2);
        this.trim = "trim".equals(str2);
        this.raw = (FieldInfo.RAW_VALUE_MASK & j3) != 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t9) {
        return this.function.apply(t9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        try {
            String strApply = this.function.apply(t9);
            long features = this.features | jSONWriter.getFeatures();
            if (strApply == null && ((JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask) & features) == 0) {
                return false;
            }
            writeFieldName(jSONWriter);
            if (strApply == null && ((JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullStringAsEmpty.mask) & features) != 0) {
                jSONWriter.writeString(HttpUrl.FRAGMENT_ENCODE_SET);
                return true;
            }
            if (this.trim) {
                strApply = strApply.trim();
            }
            if (strApply != null && strApply.isEmpty() && (features & JSONWriter.Feature.IgnoreEmpty.mask) != 0) {
                return false;
            }
            if (this.symbol && jSONWriter.jsonb) {
                jSONWriter.writeSymbol(strApply);
            } else if (this.raw) {
                jSONWriter.writeRaw(strApply);
            } else {
                jSONWriter.writeString(strApply);
            }
            return true;
        } catch (RuntimeException e6) {
            if ((jSONWriter.getFeatures(this.features) | JSONWriter.Feature.IgnoreNonFieldGetter.mask) != 0) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        String strApply = this.function.apply(t9);
        if (this.trim && strApply != null) {
            strApply = strApply.trim();
        }
        if (this.symbol && jSONWriter.jsonb) {
            jSONWriter.writeSymbol(strApply);
        } else if (this.raw) {
            jSONWriter.writeRaw(strApply);
        } else {
            jSONWriter.writeString(strApply);
        }
    }
}
