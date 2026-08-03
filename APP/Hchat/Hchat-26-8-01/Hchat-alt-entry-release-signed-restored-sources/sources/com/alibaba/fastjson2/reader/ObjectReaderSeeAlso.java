package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderSeeAlso<T> extends ObjectReaderAdapter<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderSeeAlso(Class cls, Supplier<T> supplier, String str, Class[] clsArr, String[] strArr, Class cls2, FieldReader... fieldReaderArr) {
        super(cls, str, null, JSONReader.Feature.SupportAutoType.mask, supplier, null, clsArr, strArr, cls2, fieldReaderArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderSeeAlso addSubType(Class cls, String str) {
        JSONType jSONType;
        for (Class cls2 : this.seeAlso) {
            if (cls2 == cls) {
                return this;
            }
        }
        Class[] clsArr = this.seeAlso;
        Class[] clsArr2 = (Class[]) Arrays.copyOf(clsArr, clsArr.length + 1);
        String[] strArr = this.seeAlsoNames;
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length + 1);
        clsArr2[clsArr2.length - 1] = cls;
        if (str == null && (jSONType = (JSONType) cls.getAnnotation(JSONType.class)) != null) {
            str = jSONType.typeName();
        }
        if (str != null) {
            strArr2[strArr2.length - 1] = str;
        }
        return new ObjectReaderSeeAlso(this.objectClass, this.creator, this.typeKey, clsArr2, strArr2, this.seeAlsoDefault, this.fieldReaders);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T createInstance(long j3) {
        Supplier<T> supplier = this.creator;
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        ObjectReader objectReaderCheckAutoType = jSONReader.checkAutoType(this.objectClass, this.typeNameHash, this.features | j3);
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
        JSONReader.SavePoint savePointMark = jSONReader.mark();
        jSONReader.nextIfObjectStart();
        int i9 = 0;
        T tCreateInstance = null;
        while (!jSONReader.nextIfObjectEnd()) {
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            if (fieldNameHashCode == this.typeKeyHashCode) {
                long valueHashCode = jSONReader.readValueHashCode();
                JSONReader.Context context = jSONReader.getContext();
                ObjectReader objectReaderAutoType = autoType(context, valueHashCode);
                if (objectReaderAutoType == null) {
                    String string = jSONReader.getString();
                    ObjectReader objectReaderAutoType2 = context.getObjectReaderAutoType(string, null);
                    if (objectReaderAutoType2 == null) {
                        C0086a.m464w(jSONReader.info("autoType not support : " + string));
                        return null;
                    }
                    objectReaderAutoType = objectReaderAutoType2;
                }
                if (objectReaderAutoType != this) {
                    if (i9 != 0) {
                        jSONReader.reset(savePointMark);
                    }
                    jSONReader.setTypeRedirect(true);
                    return (T) objectReaderAutoType.readJSONBObject(jSONReader, type, obj, j3);
                }
            } else if (fieldNameHashCode != 0) {
                FieldReader fieldReader = getFieldReader(fieldNameHashCode);
                if (fieldReader == null && jSONReader.isSupportSmartMatch(this.features | j3)) {
                    fieldReader = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
                }
                if (fieldReader == null) {
                    processExtra(jSONReader, tCreateInstance);
                } else {
                    if (tCreateInstance == null) {
                        tCreateInstance = createInstance(jSONReader.getContext().getFeatures() | j3);
                    }
                    fieldReader.readFieldValue(jSONReader, tCreateInstance);
                }
            }
            i9++;
        }
        return tCreateInstance == null ? createInstance(jSONReader.getContext().getFeatures() | j3) : tCreateInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0237 A[SYNTHETIC] */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public T readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        long j4;
        long jHashCode64;
        String str;
        Number number;
        T t9;
        long j5;
        String str2;
        int i9;
        long j10;
        ObjectReader objectReader;
        String str3;
        Class cls;
        Class cls2;
        long j11 = j3;
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, j3);
        }
        if (!this.serializable) {
            jSONReader.errorOnNoneSerializable(this.objectClass);
        }
        if (jSONReader.nextIfNull()) {
            jSONReader.nextIfComma();
            return null;
        }
        int i10 = 0;
        if (jSONReader.isString()) {
            long valueHashCode = jSONReader.readValueHashCode();
            Class[] clsArr = this.seeAlso;
            int length = clsArr.length;
            while (i10 < length) {
                Class cls3 = clsArr[i10];
                if (Enum.class.isAssignableFrom(cls3)) {
                    ObjectReader objectReader2 = jSONReader.getObjectReader(cls3);
                    T t10 = objectReader2 instanceof ObjectReaderImplEnum ? (T) ((ObjectReaderImplEnum) objectReader2).getEnumByHashCode(valueHashCode) : null;
                    if (t10 != null) {
                        return t10;
                    }
                }
                i10++;
            }
            C0086a.m464w(jSONReader.info("not support input " + jSONReader.getString()));
            return null;
        }
        JSONReader.SavePoint savePointMark = jSONReader.mark();
        long jFeatures = jSONReader.features(getFeatures() | j11);
        long j12 = 0;
        if (jSONReader.isArray()) {
            return (JSONReader.Feature.SupportArrayToBean.mask & jFeatures) != 0 ? readArrayMappingObject(jSONReader, type, obj, j3) : processObjectInputSingleItemArray(jSONReader, type, obj, jFeatures);
        }
        if (!jSONReader.nextIfObjectStart()) {
            char cCurrent = jSONReader.current();
            if (cCurrent == 't' || cCurrent == 'f') {
                jSONReader.readBoolValue();
                return null;
            }
            if (cCurrent != '\"' && cCurrent != '\'' && cCurrent != '}') {
                C0086a.m464w(jSONReader.info());
                return null;
            }
        }
        T tCreateInstance = null;
        LinkedHashMap linkedHashMap = null;
        while (!jSONReader.nextIfObjectEnd()) {
            JSONReader.Context context = jSONReader.context;
            long fieldNameHashCode = jSONReader.readFieldNameHashCode();
            JSONReader.AutoTypeBeforeHandler contextAutoTypeBeforeHandler = context.getContextAutoTypeBeforeHandler();
            if (fieldNameHashCode == getTypeKeyHash() || !((cls2 = this.seeAlsoDefault) == null || cls2 == Void.class)) {
                j4 = j12;
                long features = getFeatures() | j11 | context.features;
                if ((features & JSONReader.Feature.SupportAutoType.mask) != j4 || contextAutoTypeBeforeHandler != null) {
                    long typeHashCode = jSONReader.readTypeHashCode();
                    if (typeHashCode == -1 && jSONReader.isNumber()) {
                        Number number2 = jSONReader.readNumber();
                        String string = number2.toString();
                        jHashCode64 = Fnv.hashCode64(string);
                        number = number2;
                        str = string;
                    } else {
                        jHashCode64 = typeHashCode;
                        str = null;
                        number = null;
                    }
                    if (contextAutoTypeBeforeHandler != null) {
                        Class<?> clsApply = contextAutoTypeBeforeHandler.apply(jHashCode64, this.objectClass, features);
                        j5 = features;
                        long j13 = jHashCode64;
                        str2 = str;
                        i9 = i10;
                        j10 = j13;
                        if (clsApply == null) {
                            t9 = tCreateInstance;
                            Class<?> clsApply2 = contextAutoTypeBeforeHandler.apply(jSONReader.getString(), this.objectClass, j5);
                            objectReader = clsApply2 != null ? context.getObjectReader(clsApply2) : null;
                            if (objectReader == null) {
                                objectReader = autoType(context, j10);
                            }
                            if (objectReader != null) {
                                String string2 = jSONReader.getString();
                                ObjectReader objectReaderAutoType = context.getObjectReaderAutoType(string2, this.objectClass, j5);
                                if (objectReaderAutoType == null && (cls = this.seeAlsoDefault) != null) {
                                    objectReaderAutoType = context.getObjectReader(cls);
                                }
                                if (objectReaderAutoType == null) {
                                    C0086a.m464w(jSONReader.info("No suitable ObjectReader found for" + string2));
                                    return null;
                                }
                                ObjectReader objectReader3 = objectReaderAutoType;
                                str3 = string2;
                                objectReader = objectReader3;
                            } else {
                                str3 = null;
                            }
                            if (objectReader == this) {
                                FieldReader fieldReader = objectReader.getFieldReader(fieldNameHashCode);
                                String string3 = (fieldReader == null || str3 != null) ? str3 : str2 != null ? str2 : jSONReader.getString();
                                if (i9 != 0 || fieldReader != null) {
                                    jSONReader.reset(savePointMark);
                                }
                                T t11 = (T) objectReader.readObject(jSONReader, type, obj, j3 | getFeatures());
                                if (fieldReader != null) {
                                    if (number != null) {
                                        fieldReader.accept(t11, number);
                                        return t11;
                                    }
                                    fieldReader.accept(t11, string3);
                                }
                                return t11;
                            }
                            tCreateInstance = t9;
                        } else {
                            t9 = tCreateInstance;
                        }
                    } else {
                        t9 = tCreateInstance;
                        j5 = features;
                        long j14 = jHashCode64;
                        str2 = str;
                        i9 = i10;
                        j10 = j14;
                    }
                    if (objectReader == null) {
                    }
                    if (objectReader != null) {
                    }
                    if (objectReader == this) {
                    }
                }
                i10 = i9 + 1;
                j11 = j3;
                j12 = j4;
            } else {
                j4 = j12;
            }
            FieldReader fieldReader2 = getFieldReader(fieldNameHashCode);
            if (fieldReader2 == null && jSONReader.isSupportSmartMatch(getFeatures() | j11)) {
                fieldReader2 = getFieldReaderLCase(jSONReader.getNameHashCodeLCase());
            }
            if (tCreateInstance == null) {
                tCreateInstance = createInstance(jSONReader.context.features | j11);
            }
            if (fieldReader2 == null) {
                processExtra(jSONReader, tCreateInstance, j11);
            } else if (tCreateInstance == null) {
                Object fieldValue = fieldReader2.readFieldValue(jSONReader);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(Long.valueOf(fieldNameHashCode), fieldValue);
            } else {
                fieldReader2.readFieldValue(jSONReader, tCreateInstance);
            }
            i9 = i10;
            i10 = i9 + 1;
            j11 = j3;
            j12 = j4;
        }
        if (tCreateInstance == null) {
            tCreateInstance = createInstance(j11 | jSONReader.context.features);
        }
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                getFieldReader(((Long) entry.getKey()).longValue()).accept(tCreateInstance, entry.getValue());
            }
        }
        jSONReader.nextIfComma();
        Function buildFunction = getBuildFunction();
        return buildFunction != null ? (T) buildFunction.apply(tCreateInstance) : tCreateInstance;
    }
}
