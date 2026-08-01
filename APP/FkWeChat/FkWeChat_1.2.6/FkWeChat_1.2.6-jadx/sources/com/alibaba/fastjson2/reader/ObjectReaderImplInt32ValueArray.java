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
public final class ObjectReaderImplInt32ValueArray extends ObjectReaderPrimitive {
    final Function<int[], Object> builder;
    static final ObjectReaderImplInt32ValueArray INSTANCE = new ObjectReaderImplInt32ValueArray(int[].class, null);
    public static final long HASH_TYPE = Fnv.hashCode64("[I");

    public ObjectReaderImplInt32ValueArray(Class cls, Function<int[], Object> function) {
        super(cls);
        this.builder = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        int iIntValue;
        int[] iArr = new int[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                iIntValue = 0;
            } else if (obj instanceof Number) {
                iIntValue = ((Number) obj).intValue();
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Integer.TYPE);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to int ", obj.getClass());
                    return null;
                }
                iIntValue = ((Integer) typeConvert.apply(obj)).intValue();
            }
            iArr[i10] = iIntValue;
            i10++;
        }
        Function<int[], Object> function = this.builder;
        return function != null ? function.apply(iArr) : iArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt32Array.HASH_TYPE) {
                C1607k.m6296a("not support autoType : ", jSONReader.getString());
                return null;
            }
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        int[] iArr = new int[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            iArr[i10] = jSONReader.readInt32Value();
        }
        Function<int[], Object> function = this.builder;
        return function != null ? function.apply(iArr) : iArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j10);
        }
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
        int[] iArrCopyOf = new int[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C1569c.m6258a(jSONReader.info("input end"));
                return null;
            }
            int i11 = i10 + 1;
            if (i11 - iArrCopyOf.length > 0) {
                int length = iArrCopyOf.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i12);
            }
            iArrCopyOf[i10] = jSONReader.readInt32Value();
            i10 = i11;
        }
        jSONReader.nextIfComma();
        int[] iArrCopyOf2 = Arrays.copyOf(iArrCopyOf, i10);
        Function<int[], Object> function = this.builder;
        return function != null ? function.apply(iArrCopyOf2) : iArrCopyOf2;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Object createInstance(long j10) {
        return super.createInstance(j10);
    }
}
