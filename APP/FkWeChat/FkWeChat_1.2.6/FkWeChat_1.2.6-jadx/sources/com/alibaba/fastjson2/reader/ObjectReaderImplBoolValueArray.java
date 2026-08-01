package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplBoolValueArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplBoolValueArray INSTANCE = new ObjectReaderImplBoolValueArray();
    static final long TYPE_HASH = Fnv.hashCode64("[Z");

    public ObjectReaderImplBoolValueArray() {
        super(boolean[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != TYPE_HASH) {
            C1607k.m6296a("not support autoType : ", jSONReader.getString());
            return null;
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        boolean[] zArr = new boolean[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            zArr[i10] = jSONReader.readBoolValue();
        }
        return zArr;
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
        boolean[] zArrCopyOf = new boolean[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i11 = i10 + 1;
            if (i11 - zArrCopyOf.length > 0) {
                int length = zArrCopyOf.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                zArrCopyOf = Arrays.copyOf(zArrCopyOf, i12);
            }
            zArrCopyOf[i10] = jSONReader.readBoolValue();
            i10 = i11;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(zArrCopyOf, i10);
    }
}
