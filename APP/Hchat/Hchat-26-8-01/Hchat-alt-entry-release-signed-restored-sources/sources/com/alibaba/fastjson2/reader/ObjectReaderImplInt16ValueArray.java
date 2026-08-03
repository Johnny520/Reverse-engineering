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
class ObjectReaderImplInt16ValueArray extends ObjectReaderPrimitive {
    final Function<short[], Object> builder;
    static final ObjectReaderImplInt16ValueArray INSTANCE = new ObjectReaderImplInt16ValueArray(null);
    static final long HASH_TYPE = Fnv.hashCode64("[S");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplInt16ValueArray(Function<short[], Object> function) {
        super(short[].class);
        this.builder = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        short sShortValue;
        short[] sArr = new short[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                sShortValue = 0;
            } else if (obj instanceof Number) {
                sShortValue = ((Number) obj).shortValue();
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Short.TYPE);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to short ");
                    return null;
                }
                sShortValue = ((Short) typeConvert.apply(obj)).shortValue();
            }
            sArr[i9] = sShortValue;
            i9++;
        }
        Function<short[], Object> function = this.builder;
        return function != null ? function.apply(sArr) : sArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt16Array.HASH_TYPE) {
                C0086a.m450i(jSONReader.getString(), "not support autoType : ");
                return null;
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        short[] sArr = new short[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            sArr[i9] = (short) jSONReader.readInt32Value();
        }
        Function<short[], Object> function = this.builder;
        return function != null ? function.apply(sArr) : sArr;
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
        short[] sArrCopyOf = new short[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C0086a.m464w(jSONReader.info("input end"));
                return null;
            }
            int i10 = i9 + 1;
            if (i10 - sArrCopyOf.length > 0) {
                int length = sArrCopyOf.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                sArrCopyOf = Arrays.copyOf(sArrCopyOf, i11);
            }
            sArrCopyOf[i9] = (short) jSONReader.readInt32Value();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        short[] sArrCopyOf2 = Arrays.copyOf(sArrCopyOf, i9);
        Function<short[], Object> function = this.builder;
        return function != null ? function.apply(sArrCopyOf2) : sArrCopyOf2;
    }
}
