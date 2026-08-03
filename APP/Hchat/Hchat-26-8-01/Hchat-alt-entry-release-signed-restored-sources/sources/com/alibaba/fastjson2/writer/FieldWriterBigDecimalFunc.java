package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBigDecimalFunc<T> extends FieldWriter<T> {
    final Function<T, BigDecimal> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterBigDecimalFunc(String str, int i9, long j3, String str2, String str3, Method method, Function<T, BigDecimal> function) {
        super(str, i9, j3, str2, str3, BigDecimal.class, BigDecimal.class, null, method);
        this.function = function;
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
            BigDecimal bigDecimalApply = this.function.apply(t9);
            if (bigDecimalApply == null) {
                return writeFloatNull(jSONWriter);
            }
            writeFieldName(jSONWriter);
            jSONWriter.writeDecimal(bigDecimalApply, this.features, this.decimalFormat);
            return true;
        } catch (RuntimeException e6) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        jSONWriter.writeDecimal(this.function.apply(t9), this.features, this.decimalFormat);
    }
}
