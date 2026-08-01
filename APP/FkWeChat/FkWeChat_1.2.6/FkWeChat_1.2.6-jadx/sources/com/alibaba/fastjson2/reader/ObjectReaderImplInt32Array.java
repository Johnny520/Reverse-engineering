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
public final class ObjectReaderImplInt32Array extends ObjectReaderPrimitive {
    static final ObjectReaderImplInt32Array INSTANCE = new ObjectReaderImplInt32Array();
    public static final long HASH_TYPE = Fnv.hashCode64("[Integer");

    public ObjectReaderImplInt32Array() {
        super(Integer[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        Integer numValueOf;
        Integer[] numArr = new Integer[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                numValueOf = null;
            } else if (obj instanceof Number) {
                numValueOf = Integer.valueOf(((Number) obj).intValue());
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Integer.class);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to Integer ", obj.getClass());
                    return null;
                }
                numValueOf = (Integer) typeConvert.apply(obj);
            }
            numArr[i10] = numValueOf;
            i10++;
        }
        return numArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt32ValueArray.HASH_TYPE) {
                C1569c.m6258a(jSONReader.info("not support type " + jSONReader.getString()));
                return null;
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Integer[] numArr = new Integer[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            numArr[i10] = jSONReader.readInt32();
        }
        return numArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (!jSONReader.isString()) {
                if (jSONReader.isNumber()) {
                    return new Integer[]{jSONReader.readInt32()};
                }
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
        Integer[] numArr = new Integer[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C1569c.m6258a(jSONReader.info("input end"));
                return null;
            }
            int i11 = i10 + 1;
            if (i11 - numArr.length > 0) {
                int length = numArr.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                numArr = (Integer[]) Arrays.copyOf(numArr, i12);
            }
            numArr[i10] = jSONReader.readInt32();
            i10 = i11;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(numArr, i10);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Object createInstance(long j10) {
        return super.createInstance(j10);
    }
}
