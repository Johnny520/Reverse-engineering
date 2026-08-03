package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Currency;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplCurrency extends ObjectReaderPrimitive {
    static final ObjectReaderImplCurrency INSTANCE = new ObjectReaderImplCurrency();
    static final long TYPE_HASH = Fnv.hashCode64("Currency");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplCurrency() {
        super(Currency.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.getType() == -110) {
            jSONReader.next();
            long typeHashCode = jSONReader.readTypeHashCode();
            if (typeHashCode != TYPE_HASH && typeHashCode != -7860540621745740270L) {
                C0086a.m464w(jSONReader.info("currency not support input autoTypeClass " + jSONReader.getString()));
                return null;
            }
        }
        String string = jSONReader.readString();
        if (string == null || string.isEmpty()) {
            return null;
        }
        return Currency.getInstance(string);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
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
