package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt16Array extends ObjectReaderPrimitive {
    static final ObjectReaderImplInt16Array INSTANCE = new ObjectReaderImplInt16Array();
    static final long HASH_TYPE = Fnv.hashCode64("[Short");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplInt16Array() {
        super(Short[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        Short shValueOf;
        Short[] shArr = new Short[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                shValueOf = null;
            } else if (obj instanceof Number) {
                shValueOf = Short.valueOf(((Number) obj).shortValue());
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Short.class);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to Short ");
                    return null;
                }
                shValueOf = (Short) typeConvert.apply(obj);
            }
            shArr[i9] = shValueOf;
            i9++;
        }
        return shArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt16ValueArray.HASH_TYPE) {
                C0086a.m464w(jSONReader.info("not support type " + jSONReader.getString()));
                return null;
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Short[] shArr = new Short[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            Integer int32 = jSONReader.readInt32();
            shArr[i9] = int32 == null ? null : Short.valueOf(int32.shortValue());
        }
        return shArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (!jSONReader.isString()) {
                C0086a.m464w(jSONReader.info("TODO"));
                return null;
            }
            String string = jSONReader.readString();
            if (string.isEmpty()) {
                return null;
            }
            C0086a.m464w(jSONReader.info("not support input ".concat(string)));
            return null;
        }
        Short[] shArr = new Short[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C0086a.m464w(jSONReader.info("input end"));
                return null;
            }
            int i10 = i9 + 1;
            if (i10 - shArr.length > 0) {
                int length = shArr.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                shArr = (Short[]) Arrays.copyOf(shArr, i11);
            }
            Integer int32 = jSONReader.readInt32();
            shArr[i9] = Short.valueOf(int32 == null ? (short) 0 : int32.shortValue());
            i9 = i10;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(shArr, i9);
    }
}
