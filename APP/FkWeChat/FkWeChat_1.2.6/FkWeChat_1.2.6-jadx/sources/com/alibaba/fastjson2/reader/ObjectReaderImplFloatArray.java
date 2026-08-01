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
final class ObjectReaderImplFloatArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplFloatArray INSTANCE = new ObjectReaderImplFloatArray();
    static final long HASH_TYPE = Fnv.hashCode64("[Float");

    public ObjectReaderImplFloatArray() {
        super(Float[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        Float fValueOf;
        Float[] fArr = new Float[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                fValueOf = null;
            } else if (obj instanceof Number) {
                fValueOf = Float.valueOf(((Number) obj).floatValue());
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Float.class);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to Float ", obj.getClass());
                    return null;
                }
                fValueOf = (Float) typeConvert.apply(obj);
            }
            fArr[i10] = fValueOf;
            i10++;
        }
        return fArr;
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
        Float[] fArr = new Float[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            fArr[i10] = jSONReader.readFloat();
        }
        return fArr;
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
        Float[] fArr = new Float[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C1569c.m6258a(jSONReader.info("input end"));
                return null;
            }
            int i11 = i10 + 1;
            if (i11 - fArr.length > 0) {
                int length = fArr.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                fArr = (Float[]) Arrays.copyOf(fArr, i12);
            }
            fArr[i10] = jSONReader.readFloat();
            i10 = i11;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(fArr, i10);
    }
}
