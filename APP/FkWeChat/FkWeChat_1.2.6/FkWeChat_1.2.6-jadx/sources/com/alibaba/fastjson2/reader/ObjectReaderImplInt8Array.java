package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.function.Function;
import java.util.zip.GZIPInputStream;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt8Array extends ObjectReaderPrimitive {
    final String format;
    static final ObjectReaderImplInt8Array INSTANCE = new ObjectReaderImplInt8Array(null);
    static final long HASH_TYPE = Fnv.hashCode64("[Byte");

    public ObjectReaderImplInt8Array(String str) {
        super(Byte[].class);
        this.format = str;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        Byte bValueOf;
        Byte[] bArr = new Byte[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                bValueOf = null;
            } else if (obj instanceof Number) {
                bValueOf = Byte.valueOf(((Number) obj).byteValue());
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Byte.class);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to Byte ", obj.getClass());
                    return null;
                }
                bValueOf = (Byte) typeConvert.apply(obj);
            }
            bArr[i10] = bValueOf;
            i10++;
        }
        return bArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != HASH_TYPE) {
            C1607k.m6296a("not support autoType : ", jSONReader.getString());
            return null;
        }
        if (jSONReader.isString() && "hex".equals(this.format)) {
            return jSONReader.readHex();
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Byte[] bArr = new Byte[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            Integer int32 = jSONReader.readInt32();
            bArr[i10] = int32 == null ? null : Byte.valueOf(int32.byteValue());
        }
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r3v6, types: [byte[], java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        int i10 = 0;
        if (jSONReader.nextIfArrayStart()) {
            Byte[] bArr = new Byte[16];
            while (!jSONReader.nextIfArrayEnd()) {
                if (jSONReader.isEnd()) {
                    C1569c.m6258a(jSONReader.info("input end"));
                    return null;
                }
                int i11 = i10 + 1;
                if (i11 - bArr.length > 0) {
                    int length = bArr.length;
                    int i12 = length + (length >> 1);
                    if (i12 - i11 < 0) {
                        i12 = i11;
                    }
                    bArr = (Byte[]) Arrays.copyOf(bArr, i12);
                }
                Integer int32 = jSONReader.readInt32();
                bArr[i10] = int32 == null ? null : Byte.valueOf(int32.byteValue());
                i10 = i11;
            }
            jSONReader.nextIfComma();
            return Arrays.copyOf(bArr, i10);
        }
        if (jSONReader.current() == 'x') {
            return jSONReader.readBinary();
        }
        if (jSONReader.isString()) {
            if ("hex".equals(this.format)) {
                return jSONReader.readHex();
            }
            String string = jSONReader.readString();
            if (string.isEmpty()) {
                return null;
            }
            if ("base64".equals(this.format)) {
                return Base64.getDecoder().decode(string);
            }
            if ("gzip,base64".equals(this.format) || "gzip".equals(this.format)) {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(Base64.getDecoder().decode(string)));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        byte[] bArr2 = new byte[1024];
                        int i13 = gZIPInputStream.read(bArr2);
                        if (i13 == -1) {
                            jSONReader = byteArrayOutputStream.toByteArray();
                            return jSONReader;
                        }
                        if (i13 > 0) {
                            byteArrayOutputStream.write(bArr2, 0, i13);
                        }
                    }
                } catch (IOException e10) {
                    C1565a.m6255a(jSONReader.info("unzip bytes error."), e10);
                    return null;
                }
            }
        }
        C1569c.m6258a(jSONReader.info("TODO"));
        return null;
    }
}
