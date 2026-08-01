package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplInt64ValueArray extends ObjectReaderPrimitive {
    final Function<long[], Object> builder;
    static final ObjectReaderImplInt64ValueArray INSTANCE = new ObjectReaderImplInt64ValueArray(long[].class, null);
    public static final long HASH_TYPE = Fnv.hashCode64("[J");

    public ObjectReaderImplInt64ValueArray(Class cls, Function<long[], Object> function) {
        super(cls);
        this.builder = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        long jLongValue;
        long[] jArr = new long[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                jLongValue = 0;
            } else if (obj instanceof Number) {
                jLongValue = ((Number) obj).longValue();
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Long.TYPE);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to long ", obj.getClass());
                    return null;
                }
                jLongValue = ((Long) typeConvert.apply(obj)).longValue();
            }
            jArr[i10] = jLongValue;
            i10++;
        }
        Function<long[], Object> function = this.builder;
        return function != null ? function.apply(jArr) : jArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Function<long[], Object> function;
        long[] int64ValueArray = jSONReader.readInt64ValueArray();
        return (int64ValueArray == null || (function = this.builder) == null) ? int64ValueArray : function.apply(int64ValueArray);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Function<long[], Object> function;
        long[] int64ValueArray = jSONReader.readInt64ValueArray();
        return (int64ValueArray == null || (function = this.builder) == null) ? int64ValueArray : function.apply(int64ValueArray);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Object createInstance(long j10) {
        return super.createInstance(j10);
    }
}
