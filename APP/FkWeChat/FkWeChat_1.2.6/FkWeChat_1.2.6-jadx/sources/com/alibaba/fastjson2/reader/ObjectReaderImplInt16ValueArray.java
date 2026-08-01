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
class ObjectReaderImplInt16ValueArray extends ObjectReaderPrimitive {
    final Function<short[], Object> builder;
    static final ObjectReaderImplInt16ValueArray INSTANCE = new ObjectReaderImplInt16ValueArray(null);
    static final long HASH_TYPE = Fnv.hashCode64("[S");

    public ObjectReaderImplInt16ValueArray(Function<short[], Object> function) {
        super(short[].class);
        this.builder = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        short sShortValue;
        short[] sArr = new short[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                sShortValue = 0;
            } else if (obj instanceof Number) {
                sShortValue = ((Number) obj).shortValue();
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Short.TYPE);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to short ", obj.getClass());
                    return null;
                }
                sShortValue = ((Short) typeConvert.apply(obj)).shortValue();
            }
            sArr[i10] = sShortValue;
            i10++;
        }
        Function<short[], Object> function = this.builder;
        return function != null ? function.apply(sArr) : sArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt16Array.HASH_TYPE) {
                C1607k.m6296a("not support autoType : ", jSONReader.getString());
                return null;
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        short[] sArr = new short[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            sArr[i10] = (short) jSONReader.readInt32Value();
        }
        Function<short[], Object> function = this.builder;
        return function != null ? function.apply(sArr) : sArr;
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
        short[] sArrCopyOf = new short[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C1569c.m6258a(jSONReader.info("input end"));
                return null;
            }
            int i11 = i10 + 1;
            if (i11 - sArrCopyOf.length > 0) {
                int length = sArrCopyOf.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                sArrCopyOf = Arrays.copyOf(sArrCopyOf, i12);
            }
            sArrCopyOf[i10] = (short) jSONReader.readInt32Value();
            i10 = i11;
        }
        jSONReader.nextIfComma();
        short[] sArrCopyOf2 = Arrays.copyOf(sArrCopyOf, i10);
        Function<short[], Object> function = this.builder;
        return function != null ? function.apply(sArrCopyOf2) : sArrCopyOf2;
    }
}
