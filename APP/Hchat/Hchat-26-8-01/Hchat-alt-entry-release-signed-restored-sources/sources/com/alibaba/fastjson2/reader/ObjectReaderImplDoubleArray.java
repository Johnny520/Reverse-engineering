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
final class ObjectReaderImplDoubleArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplDoubleArray INSTANCE = new ObjectReaderImplDoubleArray();
    static final long HASH_TYPE = Fnv.hashCode64("[Double");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplDoubleArray() {
        super(Double[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        Double dValueOf;
        Double[] dArr = new Double[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                dValueOf = null;
            } else if (obj instanceof Number) {
                dValueOf = Double.valueOf(((Number) obj).doubleValue());
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Double.class);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to Double ");
                    return null;
                }
                dValueOf = (Double) typeConvert.apply(obj);
            }
            dArr[i9] = dValueOf;
            i9++;
        }
        return dArr;
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
        Double[] dArr = new Double[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            dArr[i9] = jSONReader.readDouble();
        }
        return dArr;
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
        Double[] dArr = new Double[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C0086a.m464w(jSONReader.info("input end"));
                return null;
            }
            int i10 = i9 + 1;
            if (i10 - dArr.length > 0) {
                int length = dArr.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                dArr = (Double[]) Arrays.copyOf(dArr, i11);
            }
            dArr[i9] = jSONReader.readDouble();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(dArr, i9);
    }
}
