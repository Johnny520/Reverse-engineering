package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.codec.DateTimeCodec;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderImplDate extends DateTimeCodec implements ObjectReader {
    public static final ObjectReaderImplDate INSTANCE = new ObjectReaderImplDate(null, null);

    public ObjectReaderImplDate(String str, Locale locale) {
        super(str, locale);
    }

    /* JADX INFO: renamed from: of */
    public static ObjectReaderImplDate m6367of(String str, Locale locale) {
        return str == null ? INSTANCE : new ObjectReaderImplDate(str, locale);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.Object readDate(com.alibaba.fastjson2.JSONReader r14) {
        /*
            Method dump skipped, instruction units count: 557
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderImplDate.readDate(com.alibaba.fastjson2.JSONReader):java.lang.Object");
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Class getObjectClass() {
        return Date.class;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return readDate(jSONReader);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        return readDate(jSONReader);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Date createInstance(Map map, long j10) {
        return TypeUtils.toDate(map);
    }
}
