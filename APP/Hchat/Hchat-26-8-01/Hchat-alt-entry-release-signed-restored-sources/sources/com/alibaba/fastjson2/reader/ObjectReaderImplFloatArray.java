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
final class ObjectReaderImplFloatArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplFloatArray INSTANCE = new ObjectReaderImplFloatArray();
    static final long HASH_TYPE = Fnv.hashCode64("[Float");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplFloatArray() {
        super(Float[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        Float fValueOf;
        Float[] fArr = new Float[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                fValueOf = null;
            } else if (obj instanceof Number) {
                fValueOf = Float.valueOf(((Number) obj).floatValue());
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Float.class);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to Float ");
                    return null;
                }
                fValueOf = (Float) typeConvert.apply(obj);
            }
            fArr[i9] = fValueOf;
            i9++;
        }
        return fArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != HASH_TYPE) {
            C0086a.m450i(jSONReader.getString(), "not support autoType : ");
            return null;
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Float[] fArr = new Float[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            fArr[i9] = jSONReader.readFloat();
        }
        return fArr;
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
        Float[] fArr = new Float[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C0086a.m464w(jSONReader.info("input end"));
                return null;
            }
            int i10 = i9 + 1;
            if (i10 - fArr.length > 0) {
                int length = fArr.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                fArr = (Float[]) Arrays.copyOf(fArr, i11);
            }
            fArr[i9] = jSONReader.readFloat();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(fArr, i9);
    }
}
