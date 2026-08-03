package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import java.util.zip.GZIPInputStream;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplInt8Array extends ObjectReaderPrimitive {
    final String format;
    static final ObjectReaderImplInt8Array INSTANCE = new ObjectReaderImplInt8Array(null);
    static final long HASH_TYPE = Fnv.hashCode64("[Byte");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplInt8Array(String str) {
        super(Byte[].class);
        this.format = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        Byte bValueOf;
        Byte[] bArr = new Byte[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                bValueOf = null;
            } else if (obj instanceof Number) {
                bValueOf = Byte.valueOf(((Number) obj).byteValue());
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Byte.class);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to Byte ");
                    return null;
                }
                bValueOf = (Byte) typeConvert.apply(obj);
            }
            bArr[i9] = bValueOf;
            i9++;
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != HASH_TYPE) {
            C0086a.m450i(jSONReader.getString(), "not support autoType : ");
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
        for (int i9 = 0; i9 < iStartArray; i9++) {
            Integer int32 = jSONReader.readInt32();
            bArr[i9] = int32 == null ? null : Byte.valueOf(int32.byteValue());
        }
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:63:0x00b0 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.alibaba.fastjson2.JSONReader] */
    /* JADX WARN: Type inference failed for: r3v6, types: [byte[], java.lang.Object] */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        int i9 = 0;
        if (jSONReader.nextIfArrayStart()) {
            Byte[] bArr = new Byte[16];
            while (!jSONReader.nextIfArrayEnd()) {
                if (jSONReader.isEnd()) {
                    C0086a.m464w(jSONReader.info("input end"));
                    return null;
                }
                int i10 = i9 + 1;
                if (i10 - bArr.length > 0) {
                    int length = bArr.length;
                    int i11 = length + (length >> 1);
                    if (i11 - i10 < 0) {
                        i11 = i10;
                    }
                    bArr = (Byte[]) Arrays.copyOf(bArr, i11);
                }
                Integer int32 = jSONReader.readInt32();
                bArr[i9] = int32 == null ? null : Byte.valueOf(int32.byteValue());
                i9 = i10;
            }
            jSONReader.nextIfComma();
            return Arrays.copyOf(bArr, i9);
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
                return IOUtils.decodeBase64(string);
            }
            if ("gzip,base64".equals(this.format) || "gzip".equals(this.format)) {
                try {
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(IOUtils.decodeBase64(string)));
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    while (true) {
                        byte[] bArr2 = new byte[1024];
                        int i12 = gZIPInputStream.read(bArr2);
                        if (i12 == -1) {
                            jSONReader = byteArrayOutputStream.toByteArray();
                            return jSONReader;
                        }
                        if (i12 > 0) {
                            byteArrayOutputStream.write(bArr2, 0, i12);
                        }
                    }
                } catch (IOException e6) {
                    C0086a.m465x(jSONReader.info("unzip bytes error."), e6);
                    return null;
                }
            }
        }
        C0086a.m464w(jSONReader.info("TODO"));
        return null;
    }
}
