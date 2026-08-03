package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplBigDecimal extends ObjectWriterPrimitiveImpl {
    static final ObjectWriterImplBigDecimal INSTANCE = new ObjectWriterImplBigDecimal(null, null);
    private final DecimalFormat format;
    final Function<Object, BigDecimal> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplBigDecimal(DecimalFormat decimalFormat, Function<Object, BigDecimal> function) {
        this.format = decimalFormat;
        this.function = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl
    public Function getFunction() {
        return this.function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        Function<Object, BigDecimal> function = this.function;
        jSONWriter.writeDecimal((function == null || obj == null) ? (BigDecimal) obj : function.apply(obj), j3, this.format);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        Function<Object, BigDecimal> function = this.function;
        jSONWriter.writeDecimal((function == null || obj == null) ? (BigDecimal) obj : function.apply(obj), j3, this.format);
    }
}
