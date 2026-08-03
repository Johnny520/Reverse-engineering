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
public final class ObjectReaderImplInt32ValueArray extends ObjectReaderPrimitive {
    final Function<int[], Object> builder;
    static final ObjectReaderImplInt32ValueArray INSTANCE = new ObjectReaderImplInt32ValueArray(int[].class, null);
    public static final long HASH_TYPE = Fnv.hashCode64("[I");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplInt32ValueArray(Class cls, Function<int[], Object> function) {
        super(cls);
        this.builder = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        int iIntValue;
        int[] iArr = new int[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                iIntValue = 0;
            } else if (obj instanceof Number) {
                iIntValue = ((Number) obj).intValue();
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Integer.TYPE);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to int ");
                    return null;
                }
                iIntValue = ((Integer) typeConvert.apply(obj)).intValue();
            }
            iArr[i9] = iIntValue;
            i9++;
        }
        Function<int[], Object> function = this.builder;
        return function != null ? function.apply(iArr) : iArr;
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
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt32Array.HASH_TYPE) {
                C0086a.m450i(jSONReader.getString(), "not support autoType : ");
                return null;
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        int[] iArr = new int[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            iArr[i9] = jSONReader.readInt32Value();
        }
        Function<int[], Object> function = this.builder;
        return function != null ? function.apply(iArr) : iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j3);
        }
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
        int[] iArrCopyOf = new int[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C0086a.m464w(jSONReader.info("input end"));
                return null;
            }
            int i10 = i9 + 1;
            if (i10 - iArrCopyOf.length > 0) {
                int length = iArrCopyOf.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i11);
            }
            iArrCopyOf[i9] = jSONReader.readInt32Value();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        int[] iArrCopyOf2 = Arrays.copyOf(iArrCopyOf, i9);
        Function<int[], Object> function = this.builder;
        return function != null ? function.apply(iArrCopyOf2) : iArrCopyOf2;
    }
}
