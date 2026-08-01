package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt8ValueArray extends ObjectReaderPrimitive {
    final Function<byte[], Object> builder;
    final long features;
    final String format;
    static final ObjectReaderImplInt8ValueArray INSTANCE = new ObjectReaderImplInt8ValueArray(null);
    static final long HASH_TYPE = Fnv.hashCode64("[B");

    public ObjectReaderImplInt8ValueArray(Function<byte[], Object> function, String str) {
        super(byte[].class);
        this.format = str;
        this.features = "base64".equals(str) ? JSONReader.Feature.Base64StringAsByteArray.mask : 0L;
        this.builder = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        byte bByteValue;
        byte[] bArr = new byte[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                bByteValue = 0;
            } else if (obj instanceof Number) {
                bByteValue = ((Number) obj).byteValue();
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Byte.TYPE);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to byte ", obj.getClass());
                    return null;
                }
                bByteValue = ((Byte) typeConvert.apply(obj)).byteValue();
            }
            bArr[i10] = bByteValue;
            i10++;
        }
        Function<byte[], Object> function = this.builder;
        return function != null ? function.apply(bArr) : bArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        byte[] bArrDecode;
        int iIndexOf;
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt8Array.HASH_TYPE) {
                C1607k.m6296a("not support autoType : ", jSONReader.getString());
                return null;
            }
        }
        if (jSONReader.isBinary()) {
            bArrDecode = jSONReader.readBinary();
        } else if (jSONReader.isString()) {
            String string = jSONReader.readString();
            if (string != null && (iIndexOf = string.indexOf(";base64,")) != -1) {
                string = string.substring(iIndexOf + 8);
            }
            bArrDecode = Base64.getDecoder().decode(string);
        } else {
            int iStartArray = jSONReader.startArray();
            if (iStartArray == -1) {
                return null;
            }
            byte[] bArr = new byte[iStartArray];
            for (int i10 = 0; i10 < iStartArray; i10++) {
                bArr[i10] = (byte) jSONReader.readInt32Value();
            }
            bArrDecode = bArr;
        }
        Function<byte[], Object> function = this.builder;
        return function != null ? function.apply(bArrDecode) : bArrDecode;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        byte[] bArrDecode = null;
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (!jSONReader.isString()) {
                C1569c.m6258a(jSONReader.info("TODO"));
                return null;
            }
            if ((jSONReader.features(j10 | this.features) & JSONReader.Feature.Base64StringAsByteArray.mask) != 0) {
                bArrDecode = jSONReader.readBase64();
            } else {
                String string = jSONReader.readString();
                if (!string.isEmpty()) {
                    int iIndexOf = string.indexOf(";base64,");
                    if (iIndexOf == -1) {
                        C1569c.m6258a(jSONReader.info("illegal input : ".concat(string)));
                        return null;
                    }
                    bArrDecode = Base64.getDecoder().decode(string.substring(iIndexOf + 8));
                }
            }
            Function<byte[], Object> function = this.builder;
            return function != null ? function.apply(bArrDecode) : bArrDecode;
        }
        byte[] bArrCopyOf = new byte[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C1569c.m6258a(jSONReader.info("input end"));
                return null;
            }
            int i11 = i10 + 1;
            if (i11 - bArrCopyOf.length > 0) {
                int length = bArrCopyOf.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i12);
            }
            bArrCopyOf[i10] = (byte) jSONReader.readInt32Value();
            i10 = i11;
        }
        jSONReader.nextIfComma();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i10);
        Function<byte[], Object> function2 = this.builder;
        return function2 != null ? function2.apply(bArrCopyOf2) : bArrCopyOf2;
    }

    public ObjectReaderImplInt8ValueArray(String str) {
        super(byte[].class);
        this.format = str;
        this.builder = null;
        this.features = 0L;
    }
}
