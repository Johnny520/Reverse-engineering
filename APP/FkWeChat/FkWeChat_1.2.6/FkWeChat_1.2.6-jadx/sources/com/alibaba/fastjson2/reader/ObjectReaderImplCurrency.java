package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Currency;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplCurrency extends ObjectReaderPrimitive {
    static final ObjectReaderImplCurrency INSTANCE = new ObjectReaderImplCurrency();
    static final long TYPE_HASH = Fnv.hashCode64("Currency");

    public ObjectReaderImplCurrency() {
        super(Currency.class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.getType() == -110) {
            jSONReader.next();
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != TYPE_HASH && typeHashCode != -7860540621745740270L) {
                C1569c.m6258a(jSONReader.info("currency not support input autoTypeClass " + jSONReader.getString()));
                return null;
            }
        }
        String string = jSONReader.readString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        return Currency.getInstance(string);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        String string;
        if (jSONReader.isObject()) {
            JSONObject jSONObject = new JSONObject();
            jSONReader.readObject(jSONObject, new JSONReader.Feature[0]);
            string = jSONObject.getString("currency");
            if (string == null) {
                string = jSONObject.getString("currencyCode");
            }
        } else {
            string = jSONReader.readString();
        }
        if (string == null || string.isEmpty()) {
            return null;
        }
        return Currency.getInstance(string);
    }
}
