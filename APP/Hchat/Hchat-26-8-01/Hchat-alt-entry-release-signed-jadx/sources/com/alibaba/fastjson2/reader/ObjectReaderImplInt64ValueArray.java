package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplInt64ValueArray extends ObjectReaderPrimitive {
    final Function<long[], Object> builder;
    static final ObjectReaderImplInt64ValueArray INSTANCE = new ObjectReaderImplInt64ValueArray(long[].class, null);
    public static final long HASH_TYPE = Fnv.hashCode64("[J");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplInt64ValueArray(Class cls, Function<long[], Object> function) {
        super(cls);
        this.builder = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        long jLongValue;
        long[] jArr = new long[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                jLongValue = 0;
            } else if (obj instanceof Number) {
                jLongValue = ((Number) obj).longValue();
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Long.TYPE);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to long ");
                    return null;
                }
                jLongValue = ((Long) typeConvert.apply(obj)).longValue();
            }
            jArr[i9] = jLongValue;
            i9++;
        }
        Function<long[], Object> function = this.builder;
        return function != null ? function.apply(jArr) : jArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Function<long[], Object> function;
        long[] int64ValueArray = jSONReader.readInt64ValueArray();
        return (int64ValueArray == null || (function = this.builder) == null) ? int64ValueArray : function.apply(int64ValueArray);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Function<long[], Object> function;
        long[] int64ValueArray = jSONReader.readInt64ValueArray();
        return (int64ValueArray == null || (function = this.builder) == null) ? int64ValueArray : function.apply(int64ValueArray);
    }
}
