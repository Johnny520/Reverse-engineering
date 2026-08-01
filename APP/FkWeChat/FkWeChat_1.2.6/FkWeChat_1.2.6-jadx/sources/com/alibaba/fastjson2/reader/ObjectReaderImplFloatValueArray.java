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
class ObjectReaderImplFloatValueArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplFloatValueArray INSTANCE = new ObjectReaderImplFloatValueArray(null);
    static final long TYPE_HASH = Fnv.hashCode64("[F");
    final Function<float[], Object> builder;

    public ObjectReaderImplFloatValueArray(Function<float[], Object> function) {
        super(float[].class);
        this.builder = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        float fFloatValue;
        float[] fArr = new float[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                fFloatValue = 0.0f;
            } else if (obj instanceof Number) {
                fFloatValue = ((Number) obj).floatValue();
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Float.TYPE);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to float ", obj.getClass());
                    return null;
                }
                fFloatValue = ((Float) typeConvert.apply(obj)).floatValue();
            }
            fArr[i10] = fFloatValue;
            i10++;
        }
        Function<float[], Object> function = this.builder;
        return function != null ? function.apply(fArr) : fArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != TYPE_HASH) {
            C1607k.m6296a("not support autoType : ", jSONReader.getString());
            return null;
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        float[] fArr = new float[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            fArr[i10] = jSONReader.readFloatValue();
        }
        Function<float[], Object> function = this.builder;
        return function != null ? function.apply(fArr) : fArr;
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
        float[] fArrCopyOf = new float[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C1569c.m6258a(jSONReader.info("input end"));
                return null;
            }
            int i11 = i10 + 1;
            if (i11 - fArrCopyOf.length > 0) {
                int length = fArrCopyOf.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                fArrCopyOf = Arrays.copyOf(fArrCopyOf, i12);
            }
            fArrCopyOf[i10] = jSONReader.readFloatValue();
            i10 = i11;
        }
        jSONReader.nextIfComma();
        float[] fArrCopyOf2 = Arrays.copyOf(fArrCopyOf, i10);
        Function<float[], Object> function = this.builder;
        return function != null ? function.apply(fArrCopyOf2) : fArrCopyOf2;
    }
}
