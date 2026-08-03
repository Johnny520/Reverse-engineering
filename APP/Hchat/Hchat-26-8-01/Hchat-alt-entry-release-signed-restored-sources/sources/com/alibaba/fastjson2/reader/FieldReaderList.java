package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class FieldReaderList<T, V> extends FieldReaderObject<T> {
    final long fieldClassHash;
    final long itemClassHash;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderList(String str, Type type, Class cls, Type type2, Class cls2, int i9, long j3, String str2, Locale locale, Object obj, Method method, Field field, BiConsumer biConsumer) {
        super(str, type, cls, i9, j3, str2, locale, obj, method, field, biConsumer);
        this.itemType = type2;
        this.itemClass = cls2;
        this.itemClassHash = cls2 == null ? 0L : Fnv.hashCode64(cls2.getName());
        this.fieldClassHash = cls != null ? Fnv.hashCode64(TypeUtils.getTypeName(cls)) : 0L;
        if (str2 == null || type2 != Date.class) {
            return;
        }
        this.itemReader = new ObjectReaderImplDate(str2, locale);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void accept(T t9, JSONArray jSONArray) {
        accept((Object) t9, (Object) jSONArray);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader checkObjectAutoType(JSONReader jSONReader) {
        if (!jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY)) {
            return null;
        }
        long typeHashCode = jSONReader.readTypeHashCode();
        long jFeatures = jSONReader.features(this.features);
        JSONReader.Context context = jSONReader.context;
        JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
        if (contextAutoTypeBeforeHandler != null) {
            Class<?> clsApply = contextAutoTypeBeforeHandler.apply(typeHashCode, this.fieldClass, jFeatures);
            if (clsApply == null) {
                clsApply = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), this.fieldClass, jFeatures);
            }
            if (clsApply != null) {
                return context.getObjectReader(this.fieldClass);
            }
        }
        if (!jSONReader.isSupportAutoType(jFeatures)) {
            if (jSONReader.isArray() && !jSONReader.isEnabled(JSONReader.Feature.ErrorOnNotSupportAutoType)) {
                return getObjectReader(jSONReader);
            }
            C0086a.m464w(jSONReader.info("autoType not support input " + jSONReader.getString()));
            return null;
        }
        ObjectReader objectReaderAutoType = jSONReader.getObjectReaderAutoType(typeHashCode, this.fieldClass, jFeatures);
        if (objectReaderAutoType instanceof ObjectReaderImplList) {
            ObjectReaderImplList objectReaderImplList = (ObjectReaderImplList) objectReaderAutoType;
            objectReaderAutoType = new ObjectReaderImplList(this.fieldType, this.fieldClass, objectReaderImplList.instanceType, this.itemType, objectReaderImplList.builder);
        }
        if (objectReaderAutoType != null) {
            return objectReaderAutoType;
        }
        C0086a.m464w(jSONReader.info("auotype not support : " + jSONReader.getString()));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Collection<V> createList(JSONReader.Context context) {
        Class cls = this.fieldClass;
        return (cls == List.class || cls == Collection.class || cls == ArrayList.class) ? new ArrayList() : (Collection) getObjectReader(context).createInstance();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public long getItemClassHash() {
        return this.itemClassHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        JSONReader jSONReader2;
        Object object;
        if (jSONReader.jsonb) {
            readFieldValueJSONB(jSONReader, t9);
            return;
        }
        Function buildFunction = null;
        if (jSONReader.nextIfNull()) {
            accept((Object) t9, (JSONArray) null);
            return;
        }
        if (jSONReader.isReference()) {
            String reference = jSONReader.readReference();
            if ("..".equals(reference)) {
                accept(t9, t9);
                return;
            } else {
                addResolveTask(jSONReader, t9, reference);
                return;
            }
        }
        JSONReader.Context context = jSONReader.context;
        ObjectReader objectReader = getObjectReader(context);
        ObjectReader objectReader2 = this.initReader;
        if (objectReader2 != null) {
            buildFunction = objectReader2.getBuildFunction();
        } else if (objectReader instanceof ObjectReaderImplList) {
            buildFunction = objectReader.getBuildFunction();
        }
        char cCurrent = jSONReader.current();
        if (cCurrent != '[') {
            if (cCurrent != '{' || !(getItemObjectReader(context) instanceof ObjectReaderBean)) {
                accept(t9, objectReader.readObject(jSONReader, null, null, this.features));
                return;
            }
            Object object2 = this.itemReader.readObject(jSONReader, null, null, this.features);
            Collection collection = (Collection) objectReader.createInstance(this.features);
            collection.add(object2);
            if (buildFunction != null) {
                collection = (Collection) buildFunction.apply(collection);
            }
            accept(t9, collection);
            jSONReader.nextIfComma();
            return;
        }
        ObjectReader itemObjectReader = getItemObjectReader(context);
        Collection<V> collectionCreateList = createList(context);
        jSONReader.next();
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isReference()) {
                String reference2 = jSONReader.readReference();
                if ("..".equals(reference2)) {
                    jSONReader2 = jSONReader;
                    object = collectionCreateList;
                } else {
                    addResolveTask(jSONReader, (List) collectionCreateList, i9, reference2);
                    jSONReader2 = jSONReader;
                    i9++;
                    jSONReader = jSONReader2;
                }
            } else {
                jSONReader2 = jSONReader;
                object = itemObjectReader.readObject(jSONReader2, null, null, 0L);
            }
            collectionCreateList.add(object);
            jSONReader2.nextIfComma();
            i9++;
            jSONReader = jSONReader2;
        }
        if (buildFunction != null) {
            collectionCreateList = (Collection<V>) ((Collection) buildFunction.apply(collectionCreateList));
        }
        accept(t9, collectionCreateList);
        jSONReader.nextIfComma();
    }

    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        Function typeConvert;
        int i9 = 0;
        if (jSONReader.jsonb) {
            int iStartArray = jSONReader.startArray();
            Object[] objArr = new Object[iStartArray];
            ObjectReader itemObjectReader = getItemObjectReader(jSONReader.context);
            while (i9 < iStartArray) {
                JSONReader jSONReader2 = jSONReader;
                objArr[i9] = itemObjectReader.readObject(jSONReader2, null, null, 0L);
                i9++;
                jSONReader = jSONReader2;
            }
            return Arrays.asList(objArr);
        }
        if (jSONReader.current() == '[') {
            JSONReader.Context context = jSONReader.context;
            ObjectReader itemObjectReader2 = getItemObjectReader(context);
            Collection<V> collectionCreateList = createList(context);
            jSONReader.next();
            while (!jSONReader.nextIfArrayEnd()) {
                collectionCreateList.add(itemObjectReader2.readObject(jSONReader, this.fieldType, this.fieldName, 0L));
                jSONReader.nextIfComma();
                itemObjectReader2 = itemObjectReader2;
            }
            jSONReader.nextIfComma();
            return collectionCreateList;
        }
        if (jSONReader.isString()) {
            String string = jSONReader.readString();
            Type type = this.itemType;
            if ((type instanceof Class) && Number.class.isAssignableFrom((Class) type) && (typeConvert = jSONReader.context.provider.getTypeConvert(String.class, this.itemType)) != null) {
                Collection<V> collectionCreateList2 = createList(jSONReader.context);
                if (string.indexOf(44) != -1) {
                    String[] strArrSplit = string.split(",");
                    int length = strArrSplit.length;
                    while (i9 < length) {
                        collectionCreateList2.add(typeConvert.apply(strArrSplit[i9]));
                        i9++;
                    }
                }
                return collectionCreateList2;
            }
        }
        C0086a.m464w(jSONReader.info("TODO : " + getClass()));
        return null;
    }
}
