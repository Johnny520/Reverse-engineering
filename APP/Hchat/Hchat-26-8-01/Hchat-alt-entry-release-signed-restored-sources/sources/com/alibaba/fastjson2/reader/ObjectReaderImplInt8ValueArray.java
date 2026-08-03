package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt8ValueArray extends ObjectReaderPrimitive {
    final Function<byte[], Object> builder;
    final long features;
    final String format;
    static final ObjectReaderImplInt8ValueArray INSTANCE = new ObjectReaderImplInt8ValueArray(null);
    static final long HASH_TYPE = Fnv.hashCode64("[B");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplInt8ValueArray(Function<byte[], Object> function, String str) {
        super(byte[].class);
        this.format = str;
        this.features = "base64".equals(str) ? JSONReader.Feature.Base64StringAsByteArray.mask : 0L;
        this.builder = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        byte bByteValue;
        byte[] bArr = new byte[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                bByteValue = 0;
            } else if (obj instanceof Number) {
                bByteValue = ((Number) obj).byteValue();
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Byte.TYPE);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to byte ");
                    return null;
                }
                bByteValue = ((Byte) typeConvert.apply(obj)).byteValue();
            }
            bArr[i9] = bByteValue;
            i9++;
        }
        Function<byte[], Object> function = this.builder;
        return function != null ? function.apply(bArr) : bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        byte[] bArrDecodeBase64;
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != HASH_TYPE && typeHashCode != ObjectReaderImplInt8Array.HASH_TYPE) {
                C0086a.m450i(jSONReader.getString(), "not support autoType : ");
                return null;
            }
        }
        if (jSONReader.isBinary()) {
            bArrDecodeBase64 = jSONReader.readBinary();
        } else if (jSONReader.isString()) {
            bArrDecodeBase64 = IOUtils.decodeBase64(jSONReader.readString());
        } else {
            int iStartArray = jSONReader.startArray();
            if (iStartArray == -1) {
                return null;
            }
            byte[] bArr = new byte[iStartArray];
            for (int i9 = 0; i9 < iStartArray; i9++) {
                bArr[i9] = (byte) jSONReader.readInt32Value();
            }
            bArrDecodeBase64 = bArr;
        }
        Function<byte[], Object> function = this.builder;
        return function != null ? function.apply(bArrDecodeBase64) : bArrDecodeBase64;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        byte[] bArrDecode = null;
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (!jSONReader.isString()) {
                C0086a.m464w(jSONReader.info("TODO"));
                return null;
            }
            if ((jSONReader.features(j3 | this.features) & JSONReader.Feature.Base64StringAsByteArray.mask) != 0) {
                bArrDecode = jSONReader.readBase64();
            } else {
                String string = jSONReader.readString();
                if (!string.isEmpty()) {
                    int iIndexOf = string.indexOf(";base64,");
                    if (iIndexOf == -1) {
                        C0086a.m464w(jSONReader.info("illegal input : ".concat(string)));
                        return null;
                    }
                    bArrDecode = Base64.getDecoder().decode(string.substring(iIndexOf + 8));
                }
            }
            Function<byte[], Object> function = this.builder;
            return function != null ? function.apply(bArrDecode) : bArrDecode;
        }
        byte[] bArrCopyOf = new byte[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C0086a.m464w(jSONReader.info("input end"));
                return null;
            }
            int i10 = i9 + 1;
            if (i10 - bArrCopyOf.length > 0) {
                int length = bArrCopyOf.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i11);
            }
            bArrCopyOf[i9] = (byte) jSONReader.readInt32Value();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        byte[] bArrCopyOf2 = Arrays.copyOf(bArrCopyOf, i9);
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
