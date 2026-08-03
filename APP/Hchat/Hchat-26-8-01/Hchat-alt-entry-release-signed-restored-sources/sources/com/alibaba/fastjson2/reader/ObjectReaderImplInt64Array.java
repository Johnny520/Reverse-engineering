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
public final class ObjectReaderImplInt64Array extends ObjectReaderPrimitive {
    static final ObjectReaderImplInt64Array INSTANCE = new ObjectReaderImplInt64Array();
    public static final long HASH_TYPE = Fnv.hashCode64("[Long");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplInt64Array() {
        super(Long[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        Long lValueOf;
        Long[] lArr = new Long[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                lValueOf = null;
            } else if (obj instanceof Number) {
                lValueOf = Long.valueOf(((Number) obj).longValue());
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Long.class);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to Integer ");
                    return null;
                }
                lValueOf = (Long) typeConvert.apply(obj);
            }
            lArr[i9] = lValueOf;
            i9++;
        }
        return lArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt64ValueArray.HASH_TYPE && typeHashCode != ObjectReaderImplInt32Array.HASH_TYPE && typeHashCode != ObjectReaderImplInt32ValueArray.HASH_TYPE) {
                C0086a.m464w(jSONReader.info("not support type " + jSONReader.getString()));
                return null;
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Long[] lArr = new Long[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            lArr[i9] = jSONReader.readInt64();
        }
        return lArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (!jSONReader.isString()) {
                if (jSONReader.isNumber()) {
                    return new Long[]{jSONReader.readInt64()};
                }
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
        Long[] lArr = new Long[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C0086a.m464w(jSONReader.info("input end"));
                return null;
            }
            int i10 = i9 + 1;
            if (i10 - lArr.length > 0) {
                int length = lArr.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                lArr = (Long[]) Arrays.copyOf(lArr, i11);
            }
            lArr[i9] = jSONReader.readInt64();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(lArr, i9);
    }
}
