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
class ObjectReaderImplInt16Array extends ObjectReaderPrimitive {
    static final ObjectReaderImplInt16Array INSTANCE = new ObjectReaderImplInt16Array();
    static final long HASH_TYPE = Fnv.hashCode64("[Short");

    public ObjectReaderImplInt16Array() {
        super(Short[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        Short shValueOf;
        Short[] shArr = new Short[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                shValueOf = null;
            } else if (obj instanceof Number) {
                shValueOf = Short.valueOf(((Number) obj).shortValue());
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Short.class);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to Short ", obj.getClass());
                    return null;
                }
                shValueOf = (Short) typeConvert.apply(obj);
            }
            shArr[i10] = shValueOf;
            i10++;
        }
        return shArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt16ValueArray.HASH_TYPE) {
                C1569c.m6258a(jSONReader.info("not support type " + jSONReader.getString()));
                return null;
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Short[] shArr = new Short[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            Integer int32 = jSONReader.readInt32();
            shArr[i10] = int32 == null ? null : Short.valueOf(int32.shortValue());
        }
        return shArr;
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
        Short[] shArr = new Short[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C1569c.m6258a(jSONReader.info("input end"));
                return null;
            }
            int i11 = i10 + 1;
            if (i11 - shArr.length > 0) {
                int length = shArr.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                shArr = (Short[]) Arrays.copyOf(shArr, i12);
            }
            Integer int32 = jSONReader.readInt32();
            shArr[i10] = Short.valueOf(int32 == null ? (short) 0 : int32.shortValue());
            i10 = i11;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(shArr, i10);
    }
}
