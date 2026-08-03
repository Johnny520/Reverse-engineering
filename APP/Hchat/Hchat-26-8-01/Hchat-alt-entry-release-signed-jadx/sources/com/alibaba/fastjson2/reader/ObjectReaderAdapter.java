package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import okhttp3.HttpUrl;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderAdapter<T> extends ObjectReaderBean<T> {
    final Constructor constructor;
    protected final FieldReader[] fieldReaders;
    final long[] hashCodes;
    final long[] hashCodesLCase;
    final short[] mapping;
    final short[] mappingLCase;
    final int parameterCount;
    final Class[] seeAlso;
    final Class seeAlsoDefault;
    final Map<Long, Class> seeAlsoMapping;
    final String[] seeAlsoNames;
    protected final String typeKey;
    protected final long typeKeyHashCode;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderAdapter(Class cls, String str, String str2, long j3, Supplier<T> supplier, Function function, Class[] clsArr, String[] strArr, Class cls2, FieldReader... fieldReaderArr) {
        Constructor defaultConstructor;
        FieldReader fieldReader;
        super(cls, supplier, str2, j3, function);
        if (supplier instanceof ConstructorSupplier) {
            defaultConstructor = ((ConstructorSupplier) supplier).constructor;
        } else {
            defaultConstructor = cls == null ? null : BeanUtils.getDefaultConstructor(cls, true);
            if (defaultConstructor != null) {
                defaultConstructor.setAccessible(true);
            }
        }
        if (defaultConstructor != null) {
            this.parameterCount = defaultConstructor.getParameterCount();
        } else {
            this.parameterCount = -1;
        }
        this.constructor = defaultConstructor;
        if (str == null || str.isEmpty()) {
            this.typeKey = "@type";
            this.typeKeyHashCode = ObjectReader.HASH_TYPE;
        } else {
            this.typeKey = str;
            this.typeKeyHashCode = Fnv.hashCode64(str);
        }
        this.fieldReaders = fieldReaderArr;
        int length = fieldReaderArr.length;
        long[] jArr = new long[length];
        int length2 = fieldReaderArr.length;
        long[] jArr2 = new long[length2];
        for (int i9 = 0; i9 < fieldReaderArr.length; i9++) {
            FieldReader fieldReader2 = fieldReaderArr[i9];
            jArr[i9] = fieldReader2.fieldNameHash;
            jArr2[i9] = fieldReader2.fieldNameHashLCase;
            if (fieldReader2.isUnwrapped() && ((fieldReader = this.extraFieldReader) == null || !(fieldReader instanceof FieldReaderAnySetter))) {
                this.extraFieldReader = fieldReader2;
            }
            if (fieldReader2.defaultValue != null) {
                this.hasDefaultValue = true;
            }
        }
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.hashCodes = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.mapping = new short[jArrCopyOf.length];
        for (int i10 = 0; i10 < length; i10++) {
            this.mapping[Arrays.binarySearch(this.hashCodes, jArr[i10])] = (short) i10;
        }
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, length2);
        this.hashCodesLCase = jArrCopyOf2;
        Arrays.sort(jArrCopyOf2);
        this.mappingLCase = new short[jArrCopyOf2.length];
        for (int i11 = 0; i11 < length2; i11++) {
            this.mappingLCase[Arrays.binarySearch(this.hashCodesLCase, jArr2[i11])] = (short) i11;
        }
        this.seeAlso = clsArr;
        if (clsArr != null) {
            this.seeAlsoMapping = new HashMap(clsArr.length);
            this.seeAlsoNames = new String[clsArr.length];
            for (int i12 = 0; i12 < clsArr.length; i12++) {
                Class cls3 = clsArr[i12];
                String simpleName = (strArr == null || strArr.length < i12 + 1) ? null : strArr[i12];
                if (simpleName == null || simpleName.isEmpty()) {
                    simpleName = cls3.getSimpleName();
                }
                this.seeAlsoMapping.put(Long.valueOf(Fnv.hashCode64(simpleName)), cls3);
                this.seeAlsoNames[i12] = simpleName;
            }
        } else {
            this.seeAlsoMapping = null;
            this.seeAlsoNames = null;
        }
        this.seeAlsoDefault = cls2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object autoType(JSONReader jSONReader, Class cls, long j3) {
        long typeHashCode = jSONReader.readTypeHashCode();
        JSONReader.Context context = jSONReader.context;
        ObjectReader objectReaderAutoType = jSONReader.isSupportAutoTypeOrHandler(j3) ? context.getObjectReaderAutoType(typeHashCode) : null;
        if (objectReaderAutoType == null) {
            String string = jSONReader.getString();
            ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, cls, this.features | j3 | context.features);
            if (objectReaderAutoType2 != null) {
                objectReaderAutoType = objectReaderAutoType2;
            } else {
                if (cls != this.objectClass) {
                    C0086a.m464w(jSONReader.info("auotype not support : " + string));
                    return null;
                }
                objectReaderAutoType = this;
            }
        }
        return objectReaderAutoType.readObject(jSONReader, null, null, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f0  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T createInstance(Map map, long j3) {
        T t9;
        long j4;
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        Object obj = map.get(this.typeKey);
        long defaultReaderFeatures = this.features | j3 | JSONFactory.getDefaultReaderFeatures();
        long j5 = 0;
        if (obj instanceof String) {
            String str = (String) obj;
            ObjectReader objectReaderAutoType = ((JSONReader.Feature.SupportAutoType.mask & j3) != 0 || (this instanceof ObjectReaderSeeAlso)) ? autoType(defaultObjectReaderProvider, Fnv.hashCode64(str)) : null;
            if (objectReaderAutoType == null) {
                objectReaderAutoType = defaultObjectReaderProvider.getObjectReader(str, getObjectClass(), defaultReaderFeatures);
            }
            if (objectReaderAutoType != this && objectReaderAutoType != null) {
                return (T) objectReaderAutoType.createInstance(map, j3);
            }
        }
        T tCreateInstance = createInstance(0L);
        if (this.extraFieldReader == null && ((JSONReader.Feature.SupportSmartMatch.mask | JSONReader.Feature.ErrorOnUnknownProperties.mask) & defaultReaderFeatures) == 0) {
            int i9 = 0;
            boolean z9 = (JSONReader.Feature.FieldBased.mask & defaultReaderFeatures) != 0;
            while (true) {
                FieldReader[] fieldReaderArr = this.fieldReaders;
                if (i9 >= fieldReaderArr.length) {
                    break;
                }
                FieldReader fieldReader = fieldReaderArr[i9];
                Object obj2 = map.get(fieldReader.fieldName);
                if (obj2 == null) {
                    j4 = j5;
                    if ((JSONReader.Feature.IgnoreSetNullValue.mask & defaultReaderFeatures) != j4 || !map.containsKey(fieldReader.fieldName)) {
                    }
                    i9++;
                    j5 = j4;
                } else {
                    j4 = j5;
                }
                Field field = fieldReader.field;
                if (field != null && Modifier.isFinal(field.getModifiers())) {
                    try {
                        Object objInvoke = fieldReader.method.invoke(tCreateInstance, null);
                        if (!(objInvoke instanceof Collection) || ((Collection) objInvoke).isEmpty()) {
                        }
                    } catch (Exception unused) {
                    }
                } else if (obj2 != null) {
                    Class<?> cls = obj2.getClass();
                    Type type = fieldReader.fieldType;
                    if (cls == type) {
                        fieldReader.accept(tCreateInstance, obj2);
                    } else if ((fieldReader instanceof FieldReaderList) && (obj2 instanceof JSONArray)) {
                        fieldReader.accept(tCreateInstance, fieldReader.getObjectReader(defaultObjectReaderProvider).createInstance((JSONArray) obj2, j3));
                    } else if (!(obj2 instanceof JSONObject) || type == JSONObject.class) {
                        fieldReader.acceptAny(tCreateInstance, obj2, j3);
                    } else {
                        fieldReader.accept(tCreateInstance, defaultObjectReaderProvider.getObjectReader(type, z9).createInstance((JSONObject) obj2, j3));
                    }
                }
                i9++;
                j5 = j4;
            }
        } else {
            for (Map.Entry entry : map.entrySet()) {
                String string = entry.getKey().toString();
                Object value = entry.getValue();
                FieldReader fieldReader2 = getFieldReader(string);
                if (fieldReader2 == null) {
                    Object value2 = entry.getValue();
                    t9 = tCreateInstance;
                    acceptExtra(t9, string, value2, j3);
                } else {
                    t9 = tCreateInstance;
                    if (value == null || value.getClass() != fieldReader2.fieldType) {
                        fieldReader2.acceptAny(t9, value, j3);
                    } else {
                        fieldReader2.accept(t9, value);
                    }
                }
                tCreateInstance = t9;
            }
        }
        T t10 = tCreateInstance;
        Function function = this.buildFunction;
        return function != null ? (T) function.apply(t10) : t10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> */
    /* JADX WARN: Multi-variable type inference failed */
    public Object createInstance0(long j3) {
        Constructor constructor;
        if ((j3 & JSONReader.Feature.UseDefaultConstructorAsPossible.mask) == 0 || (constructor = this.constructor) == null || constructor.getParameterCount() != 0) {
            Supplier<T> supplier = this.creator;
            if (supplier != null) {
                return supplier.get();
            }
            C0086a.m450i(this.objectClass, "create instance error, ");
            return null;
        }
        try {
            Object objNewInstance = this.constructor.newInstance(null);
            if (this.hasDefaultValue) {
                initDefaultValue(objNewInstance);
            }
            return objNewInstance;
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
            C0086a.m456o("create instance error, ", this.objectClass, e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final Function getBuildFunction() {
        return this.buildFunction;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final long getFeatures() {
        return this.features;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReader(long j3) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j3);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.fieldReaders[this.mapping[iBinarySearch]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReaderLCase(long j3) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodesLCase, j3);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.fieldReaders[this.mappingLCase[iBinarySearch]];
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReader[] getFieldReaders() {
        FieldReader[] fieldReaderArr = this.fieldReaders;
        return (FieldReader[]) Arrays.copyOf(fieldReaderArr, fieldReaderArr.length);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final String getTypeKey() {
        return this.typeKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final long getTypeKeyHash() {
        return this.typeKeyHashCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T t9) {
        for (FieldReader fieldReader : this.fieldReaders) {
            Object obj = fieldReader.defaultValue;
            if (obj != null) {
                fieldReader.accept(t9, obj);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initStringFieldAsEmpty(Object obj) {
        int i9 = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i9 >= fieldReaderArr.length) {
                return;
            }
            FieldReader fieldReader = fieldReaderArr[i9];
            if (fieldReader.fieldClass == String.class) {
                fieldReader.accept(obj, HttpUrl.FRAGMENT_ENCODE_SET);
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        FieldReader[] fieldReaderArr;
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        ObjectReader objectReaderCheckAutoType = checkAutoType(jSONReader, this.objectClass, this.features | j3);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType != this && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readArrayMappingJSONBObject(jSONReader, type, obj, j3);
        }
        int iStartArray = jSONReader.startArray();
        T tCreateInstance = createInstance(0L);
        int i9 = 0;
        while (true) {
            fieldReaderArr = this.fieldReaders;
            if (i9 >= fieldReaderArr.length) {
                break;
            }
            if (i9 < iStartArray) {
                fieldReaderArr[i9].readFieldValue(jSONReader, tCreateInstance);
            }
            i9++;
        }
        for (int length = fieldReaderArr.length; length < iStartArray; length++) {
            jSONReader.skipValue();
        }
        Function function = this.buildFunction;
        return function != null ? (T) function.apply(tCreateInstance) : tCreateInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.jsonb) {
            return readArrayMappingJSONBObject(jSONReader, type, obj, j3);
        }
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        jSONReader.nextIfArrayStart();
        T t9 = this.creator.get();
        int i9 = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i9 >= fieldReaderArr.length) {
                break;
            }
            fieldReaderArr[i9].readFieldValue(jSONReader, t9);
            i9++;
        }
        if (!jSONReader.nextIfArrayEnd()) {
            C0086a.m464w(jSONReader.info("array to bean end error"));
            return null;
        }
        jSONReader.nextIfComma();
        Function function = this.buildFunction;
        return function != null ? (T) function.apply(t9) : t9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void readFieldValue(long j3, JSONReader jSONReader, long j4, Object obj) {
        FieldReader fieldReader = getFieldReader(j3);
        if (fieldReader == null && !this.disableSmartMatch && jSONReader.isSupportSmartMatch(j4 | this.features)) {
            long nameHashCodeLCase = jSONReader.getNameHashCodeLCase();
            if (nameHashCodeLCase != j3) {
                j3 = nameHashCodeLCase;
            }
            fieldReader = getFieldReaderLCase(j3);
        }
        if (fieldReader != null) {
            fieldReader.readFieldValue(jSONReader, obj);
        } else {
            processExtra(jSONReader, obj, 0L);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, getTypeNameHash(), this.features | j3);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
        }
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        if (jSONReader.isArray()) {
            if (jSONReader.isSupportBeanArray()) {
                return readArrayMappingJSONBObject(jSONReader, type, obj, j3);
            }
            C0086a.m464w(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
            return null;
        }
        jSONReader.nextIfObjectStart();
        int i9 = 0;
        T tCreateInstance = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == this.typeKeyHashCode && i9 == 0) {
                long valueHashCode = jSONReader.readValueHashCode();
                JSONReader.Context context = jSONReader.context;
                ObjectReader objectReaderAutoType = autoType(context, valueHashCode);
                if (objectReaderAutoType == null) {
                    String string = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType2 == null) {
                        C0086a.m464w(jSONReader.info("auotype not support : " + string));
                        return null;
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    jSONReader.setTypeRedirect(true);
                    return (T) objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j3);
                }
            } else if (fieldNameHashCode != 0) {
                FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                if (fieldReader == null && jSONReader.isSupportSmartMatch(this.features | j3)) {
                    fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (fieldReader == null) {
                    processExtra(jSONReader, tCreateInstance, j3);
                } else {
                    if (tCreateInstance == null) {
                        tCreateInstance = createInstance(jSONReader.context.features | j3);
                    }
                    fieldReader.readFieldValue(jSONReader, tCreateInstance);
                }
            }
            i9++;
        }
        return tCreateInstance == null ? createInstance(jSONReader.context.features | j3) : tCreateInstance;
    }

    public T autoType(JSONReader jSONReader) {
        long typeHashCode = jSONReader.readTypeHashCode();
        JSONReader.Context context = jSONReader.context;
        ObjectReader objectReaderAutoType = autoType(context, typeHashCode);
        if (objectReaderAutoType == null) {
            String string = jSONReader.getString();
            ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
            if (objectReaderAutoType2 == null) {
                C0086a.m464w(jSONReader.info("auotype not support : " + string));
                return null;
            }
            objectReaderAutoType = objectReaderAutoType2;
        }
        return (T) objectReaderAutoType.readJSONBObject(jSONReader, null, null, this.features);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public ObjectReader autoType(ObjectReaderProvider objectReaderProvider, long j3) {
        Map<Long, Class> map = this.seeAlsoMapping;
        if (map != null && map.size() > 0) {
            Class cls = this.seeAlsoMapping.get(Long.valueOf(j3));
            if (cls == null) {
                return null;
            }
            return objectReaderProvider.getObjectReader(cls);
        }
        return objectReaderProvider.getObjectReader(j3);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public ObjectReader autoType(JSONReader.Context context, long j3) {
        Map<Long, Class> map = this.seeAlsoMapping;
        if (map != null && map.size() > 0) {
            Class cls = this.seeAlsoMapping.get(Long.valueOf(j3));
            if (cls == null) {
                return null;
            }
            return context.getObjectReader(cls);
        }
        return context.getObjectReaderAutoType(j3);
    }

    public ObjectReaderAdapter(Class cls, String str, String str2, long j3, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j3, supplier, function, null, null, null, fieldReaderArr);
    }

    public ObjectReaderAdapter(Class cls, String str, String str2, long j3, Supplier<T> supplier, Function function, Class[] clsArr, String[] strArr, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j3, supplier, function, clsArr, strArr, null, fieldReaderArr);
    }

    public ObjectReaderAdapter(Class cls, Supplier<T> supplier, FieldReader... fieldReaderArr) {
        this(cls, null, null, 0L, supplier, null, fieldReaderArr);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long j3) {
        T t9;
        Constructor constructor = this.constructor;
        if (constructor != null && this.parameterCount == 0) {
            try {
                t9 = (T) constructor.newInstance(null);
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e6) {
                C0086a.m456o("create instance error, ", this.objectClass, e6);
                return null;
            }
        } else {
            Supplier<T> supplier = this.creator;
            if (supplier != null) {
                t9 = supplier.get();
            } else {
                C0086a.m450i(this.objectClass, "create instance error, ");
                return null;
            }
        }
        if (this.hasDefaultValue) {
            initDefaultValue(t9);
        }
        return t9;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Collection collection, long j3) {
        T tCreateInstance = createInstance(0L);
        int i9 = 0;
        for (Object obj : collection) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i9 >= fieldReaderArr.length) {
                break;
            }
            fieldReaderArr[i9].accept(tCreateInstance, obj);
            i9++;
        }
        return tCreateInstance;
    }
}
