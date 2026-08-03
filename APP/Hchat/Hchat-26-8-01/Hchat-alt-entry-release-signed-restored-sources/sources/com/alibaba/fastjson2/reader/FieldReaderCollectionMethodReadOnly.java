package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import p012ah.C0086a;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderCollectionMethodReadOnly<T> extends FieldReaderObject<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FieldReaderCollectionMethodReadOnly(String str, Type type, Class cls, int i9, long j3, String str2, Method method, Field field) {
        Type type2;
        super(str, type, cls, i9, j3, str2, null, null, method, field, null);
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            type2 = actualTypeArguments.length > 0 ? actualTypeArguments[0] : null;
        }
        this.itemType = type2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            Collection collection = (Collection) this.method.invoke(t9, null);
            if (collection == Collections.EMPTY_LIST || collection == Collections.EMPTY_SET || collection == null || collection.equals(obj)) {
                return;
            }
            String name = collection.getClass().getName();
            if ("java.util.Collections$UnmodifiableRandomAccessList".equals(name) || "java.util.Arrays$ArrayList".equals(name) || "java.util.Collections$SingletonList".equals(name) || name.startsWith("java.util.ImmutableCollections$") || name.startsWith("java.util.Collections$Unmodifiable") || obj == collection) {
                return;
            }
            for (Object objCreateInstance : (Collection) obj) {
                if (objCreateInstance == null) {
                    collection.add(objCreateInstance);
                } else {
                    if (objCreateInstance instanceof Map) {
                        Type type = this.itemType;
                        if ((type instanceof Class) && !((Class) type).isAssignableFrom(objCreateInstance.getClass())) {
                            if (this.itemReader == null) {
                                this.itemReader = JSONFactory.defaultObjectReaderProvider.getObjectReader(this.itemType);
                            }
                            objCreateInstance = this.itemReader.createInstance((Map) objCreateInstance, 0L);
                        }
                    }
                    collection.add(objCreateInstance);
                }
            }
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        if (this.initReader == null) {
            this.initReader = jSONReader.context.getObjectReader(this.fieldType);
        }
        boolean z9 = jSONReader.jsonb;
        ObjectReader objectReader = this.initReader;
        accept(t9, z9 ? objectReader.readJSONBObject(jSONReader, this.fieldType, this.fieldName, 0L) : objectReader.readObject(jSONReader, this.fieldType, this.fieldName, 0L));
    }
}
