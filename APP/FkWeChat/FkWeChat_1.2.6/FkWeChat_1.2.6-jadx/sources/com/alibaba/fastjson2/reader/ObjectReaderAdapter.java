package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import okhttp3.internal.url._UrlKt;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderAdapter<T> extends ObjectReaderBean<T> {
    final Constructor constructor;
    protected final FieldReader[] fieldReaders;
    final long[] hashCodes;
    final long[] hashCodesLCase;
    volatile boolean instantiationError;
    final short[] mapping;
    final short[] mappingLCase;
    final int parameterCount;
    final Class[] seeAlso;
    final Class seeAlsoDefault;
    final Map<Long, Class> seeAlsoMapping;
    final String[] seeAlsoNames;
    protected final String typeKey;
    protected final long typeKeyHashCode;

    public ObjectReaderAdapter(Class cls, String str, String str2, long j10, JSONSchema jSONSchema, Supplier<T> supplier, Function function, Class[] clsArr, String[] strArr, Class cls2, FieldReader... fieldReaderArr) {
        FieldReader fieldReader;
        super(cls, supplier, str2, j10, jSONSchema, function);
        Constructor defaultConstructor = cls == null ? null : BeanUtils.getDefaultConstructor(cls, true);
        this.constructor = defaultConstructor;
        if (defaultConstructor != null) {
            defaultConstructor.setAccessible(true);
            this.parameterCount = defaultConstructor.getParameterCount();
        } else {
            this.parameterCount = -1;
        }
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
        for (int i10 = 0; i10 < fieldReaderArr.length; i10++) {
            FieldReader fieldReader2 = fieldReaderArr[i10];
            jArr[i10] = fieldReader2.fieldNameHash;
            jArr2[i10] = fieldReader2.fieldNameHashLCase;
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
        for (int i11 = 0; i11 < length; i11++) {
            this.mapping[Arrays.binarySearch(this.hashCodes, jArr[i11])] = (short) i11;
        }
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, length2);
        this.hashCodesLCase = jArrCopyOf2;
        Arrays.sort(jArrCopyOf2);
        this.mappingLCase = new short[jArrCopyOf2.length];
        for (int i12 = 0; i12 < length2; i12++) {
            this.mappingLCase[Arrays.binarySearch(this.hashCodesLCase, jArr2[i12])] = (short) i12;
        }
        this.seeAlso = clsArr;
        if (clsArr != null) {
            this.seeAlsoMapping = new HashMap(clsArr.length, 1.0f);
            this.seeAlsoNames = new String[clsArr.length];
            for (int i13 = 0; i13 < clsArr.length; i13++) {
                Class cls3 = clsArr[i13];
                String simpleName = (strArr == null || strArr.length < i13 + 1) ? null : strArr[i13];
                if (simpleName == null || simpleName.isEmpty()) {
                    simpleName = cls3.getSimpleName();
                }
                this.seeAlsoMapping.put(Long.valueOf(Fnv.hashCode64(simpleName)), cls3);
                this.seeAlsoNames[i13] = simpleName;
            }
        } else {
            this.seeAlsoMapping = null;
            this.seeAlsoNames = null;
        }
        this.seeAlsoDefault = cls2;
        int iMin = 0;
        int iMax = 0;
        for (FieldReader fieldReader3 : fieldReaderArr) {
            int length3 = fieldReader3.fieldName.length();
            iMin = Math.min(iMin, length3);
            iMax = Math.max(iMax, length3);
        }
    }

    public void apply(Consumer<FieldReader> consumer) {
        for (FieldReader fieldReader : this.fieldReaders) {
            try {
                consumer.accept(fieldReader);
            } catch (RuntimeException e10) {
                if (!ignoreError(fieldReader)) {
                    throw e10;
                }
            }
        }
    }

    public Object autoType(JSONReader jSONReader, Class cls, long j10) {
        long typeHashCode = jSONReader.readTypeHashCode();
        JSONReader.Context context = jSONReader.getContext();
        ObjectReader objectReaderAutoType = jSONReader.isSupportAutoTypeOrHandler(j10) ? context.getObjectReaderAutoType(typeHashCode) : null;
        if (objectReaderAutoType == null) {
            String string = jSONReader.getString();
            ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, cls, this.features | j10 | context.getFeatures());
            if (objectReaderAutoType2 != null) {
                objectReaderAutoType = objectReaderAutoType2;
            } else {
                if (cls != this.objectClass) {
                    C1569c.m6258a(jSONReader.info("autoType not support : " + string));
                    return null;
                }
                objectReaderAutoType = this;
            }
        }
        return objectReaderAutoType.readObject(jSONReader, null, null, j10);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public T createInstance(java.util.Map r19, long r20) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.reader.ObjectReaderAdapter.createInstance(java.util.Map, long):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Object createInstance0(long j10) {
        Constructor constructor;
        if ((j10 & JSONReader.Feature.UseDefaultConstructorAsPossible.mask) == 0 || (constructor = this.constructor) == null || this.parameterCount != 0) {
            Supplier<T> supplier = this.creator;
            if (supplier != null) {
                return supplier.get();
            }
            C1607k.m6296a("create instance error, ", this.objectClass);
            return null;
        }
        try {
            Object objNewInstance = constructor.newInstance(null);
            if (this.hasDefaultValue) {
                initDefaultValue(objNewInstance);
            }
            return objNewInstance;
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            C1618a.m6409a("create instance error, ", this.objectClass, e10);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final Function getBuildFunction() {
        return this.buildFunction;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final long getFeatures() {
        return this.features;
    }

    public int getFieldOrdinal(long j10) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j10);
        if (iBinarySearch < 0) {
            return -1;
        }
        return this.mapping[iBinarySearch];
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReader(long j10) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodes, j10);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.fieldReaders[this.mapping[iBinarySearch]];
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public FieldReader getFieldReaderLCase(long j10) {
        int iBinarySearch = Arrays.binarySearch(this.hashCodesLCase, j10);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.fieldReaders[this.mappingLCase[iBinarySearch]];
    }

    public final FieldReader getFieldReaderUL(long j10, JSONReader jSONReader, long j11) {
        FieldReader fieldReader = getFieldReader(j10);
        return (fieldReader == null && jSONReader.isSupportSmartMatch(j11 | this.features)) ? getFieldReaderLCase(jSONReader.getNameHashCodeLCase()) : fieldReader;
    }

    public FieldReader[] getFieldReaders() {
        FieldReader[] fieldReaderArr = this.fieldReaders;
        return (FieldReader[]) Arrays.copyOf(fieldReaderArr, fieldReaderArr.length);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final String getTypeKey() {
        return this.typeKey;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public final long getTypeKeyHash() {
        return this.typeKeyHashCode;
    }

    public final boolean ignoreError(FieldReader fieldReader) {
        return (fieldReader.features & JSONReader.Feature.NullOnError.mask) != 0;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initDefaultValue(T t10) {
        int i10 = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i10 >= fieldReaderArr.length) {
                return;
            }
            FieldReader fieldReader = fieldReaderArr[i10];
            Object obj = fieldReader.defaultValue;
            if (obj != null) {
                fieldReader.accept(t10, obj);
            }
            i10++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean
    public void initStringFieldAsEmpty(Object obj) {
        int i10 = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i10 >= fieldReaderArr.length) {
                return;
            }
            FieldReader fieldReader = fieldReaderArr[i10];
            if (fieldReader.fieldClass == String.class) {
                fieldReader.accept(obj, _UrlKt.FRAGMENT_ENCODE_SET);
            }
            i10++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        ObjectReader objectReaderCheckAutoType = checkAutoType(jSONReader, j10);
        if (objectReaderCheckAutoType != null) {
            return (T) objectReaderCheckAutoType.readArrayMappingJSONBObject(jSONReader, type, obj, j10);
        }
        T tCreateInstance = createInstance(0L);
        int iStartArray = jSONReader.startArray();
        if (iStartArray == this.fieldReaders.length) {
            int i10 = 0;
            while (true) {
                FieldReader[] fieldReaderArr = this.fieldReaders;
                if (i10 >= fieldReaderArr.length) {
                    break;
                }
                FieldReader fieldReader = fieldReaderArr[i10];
                try {
                    fieldReader.readFieldValue(jSONReader, tCreateInstance);
                } catch (RuntimeException e10) {
                    if (!ignoreError(fieldReader)) {
                        throw e10;
                    }
                }
                i10++;
            }
        } else {
            readArrayMappingJSONBObject0(jSONReader, tCreateInstance, iStartArray);
        }
        Function function = this.buildFunction;
        return function != null ? (T) function.apply(tCreateInstance) : tCreateInstance;
    }

    public void readArrayMappingJSONBObject0(JSONReader jSONReader, Object obj, int i10) {
        int i11 = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i11 >= fieldReaderArr.length) {
                for (int length = fieldReaderArr.length; length < i10; length++) {
                    jSONReader.skipValue();
                }
                return;
            }
            if (i11 < i10) {
                FieldReader fieldReader = fieldReaderArr[i11];
                try {
                    fieldReader.readFieldValue(jSONReader, obj);
                } catch (RuntimeException e10) {
                    if (!ignoreError(fieldReader)) {
                        throw e10;
                    }
                }
            }
            i11++;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readArrayMappingObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.jsonb) {
            return readArrayMappingJSONBObject(jSONReader, type, obj, j10);
        }
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        jSONReader.nextIfArrayStart();
        T t10 = this.creator.get();
        int i10 = 0;
        while (true) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i10 >= fieldReaderArr.length) {
                if (!jSONReader.nextIfArrayEnd()) {
                    C1569c.m6258a(jSONReader.info("array to bean end error"));
                    return null;
                }
                jSONReader.nextIfComma();
                Function function = this.buildFunction;
                return function != null ? (T) function.apply(t10) : t10;
            }
            FieldReader fieldReader = fieldReaderArr[i10];
            try {
                fieldReader.readFieldValue(jSONReader, t10);
            } catch (RuntimeException e10) {
                if (!ignoreError(fieldReader)) {
                    throw e10;
                }
            }
            i10++;
        }
    }

    public final Map<Long, Object> readFieldValue(long j10, JSONReader jSONReader, long j11, Map<Long, Object> map) {
        FieldReader fieldReader = getFieldReader(j10);
        if (fieldReader == null && jSONReader.isSupportSmartMatch(j11 | this.features)) {
            fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
        }
        if (fieldReader == null) {
            jSONReader.skipValue();
            return map;
        }
        if (map == null) {
            map = new LinkedHashMap<>();
        }
        map.put(Long.valueOf(fieldReader.fieldNameHash), fieldReader.readFieldValue(jSONReader));
        return map;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, this.typeNameHash, this.features | j10);
        if (objectReaderCheckAutoType != null && objectReaderCheckAutoType.getObjectClass() != this.objectClass) {
            return (T) objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j10);
        }
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        if (jSONReader.isArray()) {
            if (jSONReader.isSupportBeanArray()) {
                return readArrayMappingJSONBObject(jSONReader, type, obj, j10);
            }
            C1569c.m6258a(jSONReader.info("expect object, but " + JSONB.typeName(jSONReader.getType())));
            return null;
        }
        jSONReader.nextIfObjectStart();
        int i10 = 0;
        T tCreateInstance = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == this.typeKeyHashCode && i10 == 0) {
                long valueHashCode = jSONReader.readValueHashCode();
                JSONReader.Context context = jSONReader.getContext();
                ObjectReader objectReaderAutoType = autoType(context, valueHashCode);
                if (objectReaderAutoType == null) {
                    String string = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType2 == null) {
                        C1569c.m6258a(jSONReader.info("autoType not support : " + string));
                        return null;
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    jSONReader.setTypeRedirect(true);
                    return (T) objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j10);
                }
            } else if (fieldNameHashCode != 0) {
                FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                if (fieldReader == null && jSONReader.isSupportSmartMatch(this.features | j10)) {
                    fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (fieldReader == null) {
                    processExtra(jSONReader, tCreateInstance);
                } else {
                    if (tCreateInstance == null) {
                        tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j10);
                    }
                    fieldReader.readFieldValue(jSONReader, tCreateInstance);
                }
            }
            i10++;
        }
        if (tCreateInstance == null) {
            tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j10);
        }
        JSONSchema jSONSchema = this.schema;
        if (jSONSchema != null) {
            jSONSchema.assertValidate(tCreateInstance);
        }
        return tCreateInstance;
    }

    public final void readFieldValue(long j10, JSONReader jSONReader, long j11, Object obj) {
        FieldReader fieldReader = getFieldReader(j10);
        if (fieldReader == null && jSONReader.isSupportSmartMatch(j11 | this.features)) {
            fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
        }
        if (fieldReader != null) {
            if (jSONReader.jsonb) {
                fieldReader.readFieldValueJSONB(jSONReader, obj);
                return;
            } else {
                fieldReader.readFieldValue(jSONReader, obj);
                return;
            }
        }
        processExtra(jSONReader, obj);
    }

    public T autoType(JSONReader jSONReader) {
        long typeHashCode = jSONReader.readTypeHashCode();
        JSONReader.Context context = jSONReader.getContext();
        ObjectReader objectReaderAutoType = autoType(context, typeHashCode);
        if (objectReaderAutoType == null) {
            String string = jSONReader.getString();
            ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
            if (objectReaderAutoType2 == null) {
                C1569c.m6258a(jSONReader.info("autoType not support : " + string));
                return null;
            }
            objectReaderAutoType = objectReaderAutoType2;
        }
        return (T) objectReaderAutoType.readJSONBObject(jSONReader, null, null, this.features);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public ObjectReader autoType(ObjectReaderProvider objectReaderProvider, long j10) {
        Map<Long, Class> map = this.seeAlsoMapping;
        if (map != null && map.size() > 0) {
            Class cls = this.seeAlsoMapping.get(Long.valueOf(j10));
            if (cls == null) {
                return null;
            }
            return objectReaderProvider.getObjectReader(cls);
        }
        return objectReaderProvider.getObjectReader(j10);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public ObjectReader autoType(JSONReader.Context context, long j10) {
        Map<Long, Class> map = this.seeAlsoMapping;
        if (map != null && map.size() > 0) {
            Class cls = this.seeAlsoMapping.get(Long.valueOf(j10));
            if (cls == null) {
                return null;
            }
            return context.getObjectReader(cls);
        }
        return context.getObjectReaderAutoType(j10);
    }

    public ObjectReaderAdapter(Class cls, String str, String str2, long j10, JSONSchema jSONSchema, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j10, jSONSchema, supplier, function, null, null, null, fieldReaderArr);
    }

    public ObjectReaderAdapter(Class cls, String str, String str2, long j10, Supplier<T> supplier, Function function, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j10, null, supplier, function, fieldReaderArr);
    }

    public ObjectReaderAdapter(Class cls, String str, String str2, long j10, JSONSchema jSONSchema, Supplier<T> supplier, Function function, Class[] clsArr, String[] strArr, FieldReader... fieldReaderArr) {
        this(cls, str, str2, j10, jSONSchema, supplier, function, clsArr, strArr, null, fieldReaderArr);
    }

    public ObjectReaderAdapter(Class cls, Supplier<T> supplier, FieldReader... fieldReaderArr) {
        this(cls, null, null, 0L, null, supplier, null, fieldReaderArr);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long j10) {
        Constructor constructor;
        if (this.instantiationError && (constructor = this.constructor) != null) {
            try {
                T t10 = (T) constructor.newInstance(null);
                if (this.hasDefaultValue) {
                    initDefaultValue(t10);
                }
                return t10;
            } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
                C1618a.m6409a("create instance error, ", this.objectClass, e10);
                return null;
            }
        }
        try {
            T t11 = (T) createInstance0(j10);
            if (!this.hasDefaultValue) {
                return t11;
            }
            initDefaultValue(t11);
            return t11;
        } catch (Exception e11) {
            this.instantiationError = true;
            Constructor constructor2 = this.constructor;
            if (constructor2 != null) {
                try {
                    T t12 = (T) constructor2.newInstance(new Object[this.parameterCount]);
                    if (this.hasDefaultValue) {
                        initDefaultValue(t12);
                    }
                    return t12;
                } catch (IllegalAccessException | InstantiationException | InvocationTargetException e12) {
                    C1618a.m6409a("create instance error, ", this.objectClass, e12);
                    return null;
                }
            }
            C1618a.m6409a("create instance error, ", this.objectClass, e11);
            return null;
        }
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(Collection collection, long j10) {
        T tCreateInstance = createInstance(0L);
        int i10 = 0;
        for (Object obj : collection) {
            FieldReader[] fieldReaderArr = this.fieldReaders;
            if (i10 >= fieldReaderArr.length) {
                break;
            }
            fieldReaderArr[i10].accept(tCreateInstance, obj);
            i10++;
        }
        return tCreateInstance;
    }
}
