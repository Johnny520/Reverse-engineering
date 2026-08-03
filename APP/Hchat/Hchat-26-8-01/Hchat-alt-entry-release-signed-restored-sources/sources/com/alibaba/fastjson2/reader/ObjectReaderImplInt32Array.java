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
public final class ObjectReaderImplInt32Array extends ObjectReaderPrimitive {
    static final ObjectReaderImplInt32Array INSTANCE = new ObjectReaderImplInt32Array();
    public static final long HASH_TYPE = Fnv.hashCode64("[Integer");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplInt32Array() {
        super(Integer[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        Integer numValueOf;
        Integer[] numArr = new Integer[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                numValueOf = null;
            } else if (obj instanceof Number) {
                numValueOf = Integer.valueOf(((Number) obj).intValue());
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Integer.class);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to Integer ");
                    return null;
                }
                numValueOf = (Integer) typeConvert.apply(obj);
            }
            numArr[i9] = numValueOf;
            i9++;
        }
        return numArr;
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
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt32ValueArray.HASH_TYPE) {
                C0086a.m464w(jSONReader.info("not support type " + jSONReader.getString()));
                return null;
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Integer[] numArr = new Integer[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            numArr[i9] = jSONReader.readInt32();
        }
        return numArr;
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
                    return new Integer[]{jSONReader.readInt32()};
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
        Integer[] numArr = new Integer[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C0086a.m464w(jSONReader.info("input end"));
                return null;
            }
            int i10 = i9 + 1;
            if (i10 - numArr.length > 0) {
                int length = numArr.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                numArr = (Integer[]) Arrays.copyOf(numArr, i11);
            }
            numArr[i9] = jSONReader.readInt32();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(numArr, i9);
    }
}
