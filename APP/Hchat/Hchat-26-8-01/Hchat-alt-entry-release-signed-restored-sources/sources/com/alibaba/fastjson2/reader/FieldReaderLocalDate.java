package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.util.Locale;
import java.util.function.BiConsumer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderLocalDate extends FieldReaderObject {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderLocalDate(String str, Type type, Class cls, int i9, long j3, String str2, Locale locale, Object obj, Method method, Field field, BiConsumer biConsumer) {
        super(str, type, cls, i9, j3, str2, locale, obj, method, field, biConsumer);
        this.initReader = ObjectReaderImplLocalDate.m1729of(str2, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getObjectReader(JSONReader jSONReader) {
        return this.initReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, Object obj) {
        accept(obj, jSONReader.jsonb ? (LocalDate) this.initReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features) : this.format != null ? (LocalDate) this.initReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features) : jSONReader.readLocalDate());
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getObjectReader(JSONReader.Context context) {
        return this.initReader;
    }
}
