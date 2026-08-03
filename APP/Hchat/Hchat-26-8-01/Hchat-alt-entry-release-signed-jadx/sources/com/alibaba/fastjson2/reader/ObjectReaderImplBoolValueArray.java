package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplBoolValueArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplBoolValueArray INSTANCE = new ObjectReaderImplBoolValueArray();
    static final long TYPE_HASH = Fnv.hashCode64("[Z");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplBoolValueArray() {
        super(boolean[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != TYPE_HASH) {
            C0086a.m450i(jSONReader.getString(), "not support autoType : ");
            return null;
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        boolean[] zArr = new boolean[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            zArr[i9] = jSONReader.readBoolValue();
        }
        return zArr;
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
        boolean[] zArrCopyOf = new boolean[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i10 = i9 + 1;
            if (i10 - zArrCopyOf.length > 0) {
                int length = zArrCopyOf.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                zArrCopyOf = Arrays.copyOf(zArrCopyOf, i11);
            }
            zArrCopyOf[i9] = jSONReader.readBoolValue();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(zArrCopyOf, i9);
    }
}
