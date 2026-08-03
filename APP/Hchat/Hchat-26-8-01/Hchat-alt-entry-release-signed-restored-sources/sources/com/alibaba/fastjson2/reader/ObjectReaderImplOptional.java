package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplOptional extends ObjectReaderPrimitive {
    static final ObjectReaderImplOptional INSTANCE = new ObjectReaderImplOptional(null, null, null);
    final String format;
    final Class itemClass;
    ObjectReader itemObjectReader;
    final Type itemType;
    final Locale locale;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ObjectReaderImplOptional(Type type, String str, Locale locale) {
        Type type2;
        super(Optional.class);
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            type2 = actualTypeArguments.length == 1 ? actualTypeArguments[0] : null;
        }
        this.itemType = type2;
        this.itemClass = TypeUtils.getClass(type2);
        this.format = str;
        this.locale = locale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: of */
    public static ObjectReaderImplOptional m1735of(Type type, String str, Locale locale) {
        return type == null ? INSTANCE : new ObjectReaderImplOptional(type, str, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Object jSONBObject;
        Type type2 = this.itemType;
        if (type2 == null) {
            jSONBObject = jSONReader.readAny();
        } else {
            if (this.itemObjectReader == null) {
                String str = this.format;
                ObjectReader objectReaderCreateFormattedObjectReader = str != null ? FieldReader.createFormattedObjectReader(type2, this.itemClass, str, this.locale) : null;
                if (objectReaderCreateFormattedObjectReader == null) {
                    this.itemObjectReader = jSONReader.getObjectReader(this.itemType);
                } else {
                    this.itemObjectReader = objectReaderCreateFormattedObjectReader;
                }
            }
            jSONBObject = this.itemObjectReader.readJSONBObject(jSONReader, this.itemType, obj, 0L);
        }
        return jSONBObject == null ? Optional.empty() : Optional.of(jSONBObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Object object;
        Type type2 = this.itemType;
        if (type2 == null) {
            object = jSONReader.readAny();
        } else {
            if (this.itemObjectReader == null) {
                String str = this.format;
                ObjectReader objectReaderCreateFormattedObjectReader = str != null ? FieldReader.createFormattedObjectReader(type2, this.itemClass, str, this.locale) : null;
                if (objectReaderCreateFormattedObjectReader == null) {
                    this.itemObjectReader = jSONReader.getObjectReader(this.itemType);
                } else {
                    this.itemObjectReader = objectReaderCreateFormattedObjectReader;
                }
            }
            object = this.itemObjectReader.readObject(jSONReader, this.itemType, obj, 0L);
        }
        return object == null ? Optional.empty() : Optional.of(object);
    }
}
