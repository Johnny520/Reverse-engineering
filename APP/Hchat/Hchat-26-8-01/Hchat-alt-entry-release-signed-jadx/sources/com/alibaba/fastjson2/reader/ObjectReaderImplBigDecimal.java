package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.impl.ToAny;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Map;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplBigDecimal extends ObjectReaderPrimitive {
    static final ObjectReaderImplBigDecimal INSTANCE = new ObjectReaderImplBigDecimal(null);
    private Function converter;
    final Function<BigDecimal, Object> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplBigDecimal(Function<BigDecimal, Object> function) {
        super(BigDecimal.class);
        this.converter = new ToAny(BigDecimal.class);
        this.function = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Map map, long j3) {
        Object objApply = map.get("value");
        if (objApply == null) {
            objApply = map.get("$numberDecimal");
        }
        if (!(objApply instanceof BigDecimal)) {
            objApply = this.converter.apply(objApply);
        }
        BigDecimal bigDecimal = (BigDecimal) objApply;
        Function<BigDecimal, Object> function = this.function;
        return function != null ? function.apply(bigDecimal) : bigDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        BigDecimal bigDecimal = jSONReader.readBigDecimal();
        Function<BigDecimal, Object> function = this.function;
        return function != null ? function.apply(bigDecimal) : bigDecimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        BigDecimal bigDecimal = jSONReader.readBigDecimal();
        Function<BigDecimal, Object> function = this.function;
        return function != null ? function.apply(bigDecimal) : bigDecimal;
    }
}
