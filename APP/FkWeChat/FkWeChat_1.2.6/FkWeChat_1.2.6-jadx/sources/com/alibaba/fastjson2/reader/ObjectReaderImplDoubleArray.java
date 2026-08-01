package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplDoubleArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplDoubleArray INSTANCE = new ObjectReaderImplDoubleArray();
    static final long HASH_TYPE = Fnv.hashCode64("[Double");

    public ObjectReaderImplDoubleArray() {
        super(Double[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        Double dValueOf;
        Double[] dArr = new Double[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                dValueOf = null;
            } else if (obj instanceof Number) {
                dValueOf = Double.valueOf(((Number) obj).doubleValue());
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Double.class);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to Double ", obj.getClass());
                    return null;
                }
                dValueOf = (Double) typeConvert.apply(obj);
            }
            dArr[i10] = dValueOf;
            i10++;
        }
        return dArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != HASH_TYPE) {
            C1607k.m6296a("not support autoType : ", jSONReader.getString());
            return null;
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Double[] dArr = new Double[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            dArr[i10] = jSONReader.readDouble();
        }
        return dArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (!jSONReader.isString()) {
                C1569c.m6258a(jSONReader.info("TODO"));
                return null;
            }
            String string = jSONReader.readString();
            if (string.isEmpty()) {
                return null;
            }
            C1569c.m6258a(jSONReader.info("not support input ".concat(string)));
            return null;
        }
        Double[] dArr = new Double[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C1569c.m6258a(jSONReader.info("input end"));
                return null;
            }
            int i11 = i10 + 1;
            if (i11 - dArr.length > 0) {
                int length = dArr.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                dArr = (Double[]) Arrays.copyOf(dArr, i12);
            }
            dArr[i10] = jSONReader.readDouble();
            i10 = i11;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(dArr, i10);
    }
}
