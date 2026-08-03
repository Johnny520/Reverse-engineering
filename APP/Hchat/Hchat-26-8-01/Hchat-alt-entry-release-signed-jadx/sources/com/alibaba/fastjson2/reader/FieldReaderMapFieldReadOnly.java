package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.function.BiConsumer;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderMapFieldReadOnly<T> extends FieldReaderMapField<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderMapFieldReadOnly(String str, Type type, Class cls, int i9, long j3, String str2, Field field, String str3, BiConsumer biConsumer) {
        super(str, type, cls, i9, j3, str2, null, null, field, str3, biConsumer);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderMapField, com.alibaba.fastjson2.reader.FieldReaderObjectField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Map map = (Map) this.field.get(t9);
            if (map == Collections.EMPTY_MAP || map == null || "java.util.Collections$UnmodifiableMap".equals(map.getClass().getName())) {
                return;
            }
            map.putAll((Map) obj);
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderMapField, com.alibaba.fastjson2.reader.FieldReader
    public void acceptAny(T t9, Object obj, long j3) {
        if (this.arrayToMapKey == null || !(obj instanceof Collection)) {
            super.acceptAny(t9, obj, j3);
            return;
        }
        try {
            FieldReaderObject.arrayToMap((Map) this.field.get(t9), (Collection) obj, this.arrayToMapKey, this.namingStrategy, JSONFactory.getObjectReader(this.valueType, this.features | j3), this.arrayToMapDuplicateHandler);
        } catch (Exception unused) {
            C0086a.m464w(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void acceptExtra(Object obj, String str, Object obj2) {
        try {
            ((Map) this.field.get(obj)).put(str, obj2);
        } catch (Exception unused) {
            C0086a.m464w(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getItemObjectReader(JSONReader jSONReader) {
        if (this.itemReader != null) {
            return this.itemReader;
        }
        ObjectReader objectReader = getObjectReader(jSONReader);
        if (objectReader instanceof ObjectReaderImplMap) {
            ObjectReaderImplString objectReaderImplString = ObjectReaderImplString.INSTANCE;
            this.itemReader = objectReaderImplString;
            return objectReaderImplString;
        }
        if (!(objectReader instanceof ObjectReaderImplMapTyped)) {
            return ObjectReaderImplObject.INSTANCE;
        }
        ObjectReader objectReader2 = jSONReader.getObjectReader(((ObjectReaderImplMapTyped) objectReader).valueType);
        this.itemReader = objectReader2;
        return objectReader2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void processExtra(JSONReader jSONReader, Object obj) {
        try {
            Map map = (Map) this.field.get(obj);
            String fieldName = jSONReader.getFieldName();
            map.put(fieldName, getItemObjectReader(jSONReader).readObject(jSONReader, null, fieldName, 0L));
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0255e.m1024m(new StringBuilder("set "), this.fieldName, " error", jSONReader), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderMapField, com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        if (this.arrayToMapKey != null && jSONReader.isArray()) {
            try {
                FieldReaderObject.arrayToMap((Map) this.field.get(t9), jSONReader.readArray(this.valueType), this.arrayToMapKey, this.namingStrategy, JSONFactory.getObjectReader(this.valueType, this.features), this.arrayToMapDuplicateHandler);
            } catch (Exception unused) {
                C0086a.m464w(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"));
            }
        } else {
            if (this.initReader == null) {
                this.initReader = jSONReader.getContext().getObjectReader(this.fieldType);
            }
            boolean z9 = jSONReader.jsonb;
            ObjectReader objectReader = this.initReader;
            accept(t9, z9 ? objectReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, this.features) : objectReader.readObject(jSONReader, this.fieldType, this.fieldName, this.features));
        }
    }
}
