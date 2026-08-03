package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSON;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.AfterFilter;
import com.alibaba.fastjson2.filter.BeforeFilter;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.filter.PropertyFilter;
import com.alibaba.fastjson2.filter.PropertyPreFilter;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.text.DecimalFormat;
import java.time.temporal.Temporal;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectWriterImplMap extends ObjectWriterPrimitiveImpl {
    static ObjectWriterImplMap INSTANCE_1x;
    final boolean contentAs;
    final long features;
    final String format;
    final boolean jsonObject1;
    final Field jsonObject1InnerMap;
    long jsonObject1InnerMapOffset;
    final byte[] jsonbTypeInfo;
    final Type keyType;
    volatile ObjectWriter keyWriter;
    final Class objectClass;
    final Type objectType;
    final char[] typeInfoUTF16;
    final byte[] typeInfoUTF8;
    final long typeNameHash;
    final Type valueType;
    final boolean valueTypeRefDetect;
    volatile ObjectWriter valueWriter;
    static final byte[] TYPE_NAME_JSONObject1O = JSONB.toBytes("JO10");
    static final long TYPE_HASH_JSONObject1O = Fnv.hashCode64("JO10");
    static final ObjectWriterImplMap INSTANCE = new ObjectWriterImplMap(String.class, Object.class, JSONObject.class, JSONObject.class, 0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplMap(Type type, Type type2, String str, Class cls, Type type3, long j3) {
        this.jsonObject1InnerMapOffset = -1L;
        this.keyType = type;
        this.valueType = type2;
        this.format = str;
        this.objectClass = cls;
        this.objectType = type3;
        this.features = j3;
        if (type2 == null) {
            this.valueTypeRefDetect = true;
        } else {
            this.valueTypeRefDetect = !ObjectWriterProvider.isNotReferenceDetect(TypeUtils.getClass(type2));
        }
        this.contentAs = (Long.MIN_VALUE & j3) != 0;
        String typeName = TypeUtils.getTypeName(cls);
        String str2 = "\"@type\":\"" + cls.getName() + "\"";
        this.typeInfoUTF16 = str2.toCharArray();
        this.typeInfoUTF8 = str2.getBytes(StandardCharsets.UTF_8);
        boolean zEquals = "JO1".equals(typeName);
        this.jsonObject1 = zEquals;
        this.jsonbTypeInfo = JSONB.toBytes(typeName);
        this.typeNameHash = Fnv.hashCode64(typeName);
        if (!zEquals) {
            this.jsonObject1InnerMap = null;
            return;
        }
        Field declaredField = BeanUtils.getDeclaredField(cls, "map");
        this.jsonObject1InnerMap = declaredField;
        if (declaredField != null) {
            declaredField.setAccessible(true);
            JDKUtils.UNSAFE.objectFieldOffset(declaredField);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectWriterImplMap getINSTANCE1() {
        if (INSTANCE_1x == null) {
            Class classJSONObject1x = JSONFactory.getClassJSONObject1x();
            if (classJSONObject1x == null) {
                INSTANCE_1x = null;
            } else {
                INSTANCE_1x = new ObjectWriterImplMap(String.class, Object.class, classJSONObject1x, classJSONObject1x, 0L);
            }
        }
        return INSTANCE_1x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean isWriteAsString(Object obj, long j3) {
        return ((j3 & (JSONWriter.Feature.WriteNonStringKeyAsString.mask | JSONWriter.Feature.BrowserCompatible.mask)) == 0 || !ObjectWriterProvider.isPrimitiveOrEnum(obj.getClass()) || (obj instanceof Temporal) || (obj instanceof Date)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX INFO: renamed from: of */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ObjectWriterImplMap m1786of(Type type, String str, Class cls) {
        Type type2;
        Type type3;
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                Type type4 = actualTypeArguments[0];
                type3 = actualTypeArguments[1];
                type2 = type4;
            } else {
                type2 = null;
                type3 = null;
            }
        }
        return new ObjectWriterImplMap(type2, type3, str, cls, type, 0L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String mapKeyToString(Object obj, JSONWriter jSONWriter, long j3) {
        int length;
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return obj.toString();
        }
        if (isWriteAsString(obj, j3)) {
            return obj.toString();
        }
        String jSONString = JSON.toJSONString(obj, jSONWriter.getContext());
        if (jSONString == null || (length = jSONString.length()) <= 1) {
            return jSONString;
        }
        char c10 = jSONWriter.useSingleQuote ? '\'' : '\"';
        if (jSONString.charAt(0) != c10) {
            return jSONString;
        }
        int i9 = length - 1;
        return jSONString.charAt(i9) == c10 ? jSONString.substring(1, i9) : jSONString;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01d8  */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        ObjectWriterProvider objectWriterProvider;
        Object obj3;
        DecimalFormat decimalFormat;
        Object obj4;
        String strWriteMapKey;
        boolean zIsPrimitiveOrEnum;
        ObjectWriter objectWriter;
        if (jSONWriter.jsonb) {
            writeJSONB(jSONWriter, obj, obj2, type, j3);
            return;
        }
        if (hasFilter(jSONWriter)) {
            writeWithFilter(jSONWriter, obj, obj2, type, j3);
            return;
        }
        Map treeMap = (Map) obj;
        boolean zIsRefDetect = jSONWriter.isRefDetect();
        boolean z9 = (type == this.objectType && jSONWriter.isWriteMapTypeInfo(obj, this.objectClass, j3)) || jSONWriter.isWriteTypeInfo(obj, type, j3);
        if (!z9 && treeMap.isEmpty()) {
            jSONWriter.writeRaw('{', '}');
            return;
        }
        jSONWriter.startObject();
        if (z9) {
            writeTypeInfo(jSONWriter);
        }
        long features = j3 | jSONWriter.getFeatures();
        long j4 = JSONWriter.Feature.MapSortField.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.SortMapEntriesByKeys;
        if (((j4 | feature.mask) & features) != 0 && !(treeMap instanceof SortedMap) && (treeMap.getClass() != LinkedHashMap.class || (feature.mask & features) != 0)) {
            treeMap = new TreeMap(treeMap);
        }
        ObjectWriterProvider objectWriterProvider2 = jSONWriter.context.provider;
        for (Map.Entry entry : treeMap.entrySet()) {
            Object value = entry.getValue();
            Object key = entry.getKey();
            if (value != null) {
                if ((JSONWriter.Feature.NotWriteEmptyArray.mask & features) != 0) {
                    if (!(value instanceof Collection) || !((Collection) value).isEmpty()) {
                        if (!value.getClass().isArray() || Array.getLength(value) != 0) {
                        }
                    }
                }
                if (this.keyWriter != null) {
                    obj3 = value;
                    objectWriterProvider = objectWriterProvider2;
                    decimalFormat = null;
                    this.keyWriter.write(jSONWriter, key, null, null, 0L);
                    obj4 = key;
                    strWriteMapKey = null;
                } else {
                    objectWriterProvider = objectWriterProvider2;
                    obj3 = value;
                    decimalFormat = null;
                    obj4 = key;
                    strWriteMapKey = writeMapKey(obj4, jSONWriter, features);
                }
                jSONWriter.writeColon();
                Class<?> cls = this.contentAs ? (Class) this.valueType : obj3.getClass();
                if (cls == String.class) {
                    jSONWriter.writeString((String) obj3);
                } else if (cls == Integer.class) {
                    jSONWriter.writeInt32((Integer) obj3);
                } else if (cls != Long.class) {
                    Object obj5 = obj3;
                    if (cls == Boolean.class) {
                        jSONWriter.writeBool(((Boolean) obj5).booleanValue());
                    } else if (cls != BigDecimal.class) {
                        if (cls == this.valueType) {
                            objectWriter = this.valueWriter != null ? this.valueWriter : jSONWriter.getObjectWriter(cls);
                            zIsPrimitiveOrEnum = ObjectWriterProvider.isPrimitiveOrEnum(obj5.getClass());
                        } else {
                            if (cls == JSONObject.class) {
                                objectWriter = INSTANCE;
                            } else if (cls == JSONArray.class) {
                                objectWriter = ObjectWriterImplList.INSTANCE;
                            } else {
                                ObjectWriter objectWriter2 = jSONWriter.getObjectWriter(cls);
                                zIsPrimitiveOrEnum = ObjectWriterProvider.isPrimitiveOrEnum(cls);
                                objectWriter = objectWriter2;
                            }
                            zIsPrimitiveOrEnum = false;
                        }
                        boolean z10 = (!zIsRefDetect || strWriteMapKey == null || zIsPrimitiveOrEnum) ? false : true;
                        if (!z10) {
                            objectWriter.write(jSONWriter, obj5, obj4, this.valueType, this.features);
                            if (z10) {
                                jSONWriter.popPath(obj5);
                            }
                        } else if (obj5 == obj) {
                            jSONWriter.writeReference("..");
                        } else {
                            String path = jSONWriter.setPath(strWriteMapKey, obj5);
                            if (path != null) {
                                jSONWriter.writeReference(path);
                                jSONWriter.popPath(obj5);
                            }
                        }
                    } else if ((objectWriterProvider.userDefineMask & 8) == 0) {
                        jSONWriter.writeDecimal((BigDecimal) obj5, features, decimalFormat);
                    } else {
                        jSONWriter.getObjectWriter(cls).write(jSONWriter, obj5, obj4, this.valueType, this.features);
                    }
                } else if ((objectWriterProvider.userDefineMask & 4) == 0) {
                    jSONWriter.writeInt64((Long) obj3);
                } else {
                    jSONWriter.getObjectWriter(cls).write(jSONWriter, obj3, strWriteMapKey, Long.class, features);
                }
                objectWriterProvider2 = objectWriterProvider;
            } else if ((JSONWriter.Feature.WriteNulls.mask & features) != 0) {
                writeMapKey(key, jSONWriter, features);
                jSONWriter.writeColon();
                jSONWriter.writeNull();
            }
        }
        jSONWriter.endObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        JSONWriter jSONWriter2;
        jSONWriter.startObject();
        boolean zIsWriteNulls = jSONWriter.isWriteNulls();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value != null) {
                jSONWriter.writeString(str);
                Class<?> cls = value.getClass();
                if (cls == String.class) {
                    jSONWriter.writeString((String) value);
                    jSONWriter2 = jSONWriter;
                } else {
                    jSONWriter2 = jSONWriter;
                    jSONWriter.getObjectWriter(cls).writeJSONB(jSONWriter2, value, str, this.valueType, this.features);
                }
                jSONWriter = jSONWriter2;
            } else if (zIsWriteNulls) {
                jSONWriter.writeString(str);
                jSONWriter.writeNull();
            }
        }
        jSONWriter.endObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        boolean z9;
        int i9;
        Class<?> cls;
        boolean z10;
        Type type2;
        ObjectWriterProvider objectWriterProvider;
        int i10;
        boolean z11;
        boolean z12;
        ObjectWriter objectWriter;
        int i11;
        Type type3;
        boolean z13;
        String path;
        String path2;
        String path3;
        Object obj3;
        boolean z14;
        Object obj4;
        ObjectWriterProvider objectWriterProvider2;
        boolean z15;
        if ((type == this.objectType && jSONWriter.isWriteMapTypeInfo(obj, this.objectClass, j3)) || jSONWriter.isWriteTypeInfo(obj, type, j3)) {
            Field field = this.jsonObject1InnerMap;
            if (field != null) {
                long j4 = this.jsonObject1InnerMapOffset;
                if (j4 != -1) {
                    z15 = JDKUtils.UNSAFE.getObject(obj, j4) instanceof LinkedHashMap;
                } else {
                    try {
                        z15 = field.get(obj) instanceof LinkedHashMap;
                    } catch (IllegalAccessException unused) {
                        z15 = false;
                    }
                }
                if (z15) {
                    jSONWriter.writeTypeName(this.jsonbTypeInfo, this.typeNameHash);
                } else {
                    jSONWriter.writeTypeName(TYPE_NAME_JSONObject1O, TYPE_HASH_JSONObject1O);
                }
            } else {
                z15 = false;
                if (z15) {
                }
            }
        }
        Map map = (Map) obj;
        JSONWriter.Context context = jSONWriter.context;
        jSONWriter.startObject();
        Type type4 = this.valueType;
        boolean z16 = true;
        if (type != this.objectType && (type instanceof ParameterizedType)) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                type4 = actualTypeArguments[1];
            }
        }
        Type type5 = type4;
        long features = context.getFeatures();
        long j5 = 0;
        boolean z17 = ((JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask) & features) != 0;
        boolean z18 = (JSONWriter.Feature.FieldBased.mask & features) != 0;
        ObjectWriterProvider objectWriterProvider3 = context.provider;
        boolean z19 = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
        Class<?> cls2 = null;
        ObjectWriter objectWriter2 = null;
        int i12 = 0;
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            long j10 = j5;
            Object value = entry.getValue();
            if (value != null) {
                z9 = z18;
                ObjectWriterProvider objectWriterProvider4 = objectWriterProvider3;
                i9 = i12;
                cls = cls2;
                boolean z20 = key instanceof String;
                if (z20 || (JSONWriter.Feature.WriteClassName.mask & features) == j10) {
                    z10 = z20;
                    type2 = type5;
                    objectWriterProvider = objectWriterProvider4;
                    String string = z10 ? (String) key : key.toString();
                    if (jSONWriter.symbolTable != null) {
                        jSONWriter.writeSymbol(string);
                        if (value instanceof String) {
                            jSONWriter.writeSymbol((String) value);
                        }
                        i10 = i9;
                        z11 = false;
                        type3 = type2;
                        i11 = i10;
                        z13 = true;
                    } else {
                        jSONWriter.writeString(string);
                    }
                } else if (key == null) {
                    jSONWriter.writeNull();
                    z10 = z20;
                    type2 = type5;
                    objectWriterProvider = objectWriterProvider4;
                } else {
                    if (z19) {
                        jSONWriter.config(JSONWriter.Feature.ReferenceDetection, false);
                    }
                    Class<?> cls3 = key.getClass();
                    z10 = z20;
                    type2 = type5;
                    objectWriterProvider = objectWriterProvider4;
                    objectWriterProvider4.getObjectWriter(cls3, cls3, z9).writeJSONB(jSONWriter, key, null, null, 0L);
                    if (z19) {
                        jSONWriter.config(JSONWriter.Feature.ReferenceDetection, true);
                    }
                }
                Class<?> cls4 = this.contentAs ? (Class) this.valueType : value.getClass();
                if (cls4 == String.class) {
                    jSONWriter.writeString((String) value);
                } else if (cls4 == Integer.class) {
                    jSONWriter.writeInt32((Integer) value);
                } else if (cls4 == Long.class) {
                    jSONWriter.writeInt64((Long) value);
                } else {
                    boolean z21 = cls4 != this.valueType ? !(!z19 || ObjectWriterProvider.isNotReferenceDetect(cls4)) : z19 && this.valueTypeRefDetect;
                    if (!z21) {
                        i10 = i9;
                        z11 = false;
                        z12 = false;
                    } else if (value == obj) {
                        jSONWriter.writeReference("..");
                    } else {
                        if (z10) {
                            path2 = jSONWriter.setPath((String) key, value);
                        } else if (ObjectWriterProvider.isPrimitiveOrEnum(key.getClass())) {
                            path2 = jSONWriter.setPath(key.toString(), value);
                        } else {
                            if (map.size() == 1 || (map instanceof SortedMap) || (map instanceof LinkedHashMap)) {
                                z11 = false;
                                i10 = i9;
                                path = jSONWriter.setPath(i10, value);
                                z12 = false;
                            } else {
                                z11 = false;
                                jSONWriter.config(JSONWriter.Feature.ReferenceDetection, false);
                                z21 = false;
                                path = null;
                                i10 = i9;
                                z12 = true;
                            }
                            if (path != null) {
                                jSONWriter.writeReference(path);
                                jSONWriter.popPath(value);
                                type3 = type2;
                                i11 = i10;
                                z13 = true;
                            }
                        }
                        path = path2;
                        i10 = i9;
                        z11 = false;
                        z12 = false;
                        if (path != null) {
                        }
                    }
                    boolean z22 = z21;
                    if (cls4 == this.valueType && this.valueWriter != null) {
                        objectWriter = this.valueWriter;
                    } else if (cls == cls4) {
                        i11 = i10;
                        objectWriter = objectWriter2;
                        type3 = type2;
                        objectWriter.writeJSONB(jSONWriter, value, key, type3, this.features);
                        if (z12) {
                            z13 = true;
                            if (z22) {
                                jSONWriter.popPath(value);
                            }
                        } else {
                            z13 = true;
                            jSONWriter.config(JSONWriter.Feature.ReferenceDetection, true);
                        }
                    } else {
                        objectWriter = cls4 == JSONObject.class ? INSTANCE : cls4 == JSONArray.class ? ObjectWriterImplList.INSTANCE : objectWriterProvider.getObjectWriter(cls4, cls4, z9);
                        if (objectWriter2 == null) {
                            objectWriter2 = objectWriter;
                            cls = cls4;
                        }
                        if (cls4 == this.valueType) {
                            this.valueWriter = objectWriter;
                        }
                    }
                    i11 = i10;
                    type3 = type2;
                    objectWriter.writeJSONB(jSONWriter, value, key, type3, this.features);
                    if (z12) {
                    }
                }
                i10 = i9;
                z11 = false;
                type3 = type2;
                i11 = i10;
                z13 = true;
            } else if (z17) {
                if (key instanceof String) {
                    jSONWriter.writeString((String) key);
                    z14 = z18;
                    objectWriterProvider2 = objectWriterProvider3;
                    i9 = i12;
                    cls = cls2;
                } else {
                    Class<?> cls5 = key.getClass();
                    boolean z23 = (!z19 || ObjectWriterProvider.isNotReferenceDetect(cls5)) ? false : z16;
                    if (z23) {
                        jSONWriter.setPath(i12, entry);
                        path3 = jSONWriter.setPath("key", key);
                    } else {
                        path3 = null;
                    }
                    if (path3 != null) {
                        jSONWriter.writeReference(path3);
                        z14 = z18;
                        objectWriterProvider2 = objectWriterProvider3;
                        i9 = i12;
                        cls = cls2;
                        obj4 = entry;
                        obj3 = key;
                    } else {
                        ObjectWriter objectWriter3 = objectWriterProvider3.getObjectWriter(cls5, cls5, z18);
                        ObjectWriterProvider objectWriterProvider5 = objectWriterProvider3;
                        obj3 = key;
                        z14 = z18;
                        cls = cls2;
                        obj4 = entry;
                        objectWriterProvider2 = objectWriterProvider5;
                        i9 = i12;
                        objectWriter3.writeJSONB(jSONWriter, obj3, null, null, 0L);
                    }
                    if (z23) {
                        jSONWriter.popPath(obj4);
                        jSONWriter.popPath(obj3);
                    }
                }
                jSONWriter.writeNull();
                type2 = type5;
                z9 = z14;
                objectWriterProvider = objectWriterProvider2;
                i10 = i9;
                z11 = false;
                type3 = type2;
                i11 = i10;
                z13 = true;
            } else {
                cls = cls2;
                z9 = z18;
                i10 = i12;
                type2 = type5;
                z11 = false;
                objectWriterProvider = objectWriterProvider3;
                type3 = type2;
                i11 = i10;
                z13 = true;
            }
            j5 = j10;
            objectWriterProvider3 = objectWriterProvider;
            type5 = type3;
            cls2 = cls;
            z16 = z13;
            i12 = i11 + 1;
            z18 = z9;
        }
        jSONWriter.endObject();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String writeMapKey(Object obj, JSONWriter jSONWriter, long j3) {
        if (obj == null) {
            jSONWriter.writeName("null");
            return null;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            jSONWriter.writeName(str);
            return str;
        }
        if (isWriteAsString(obj, j3)) {
            String string = obj.toString();
            jSONWriter.writeName(string);
            return string;
        }
        if (obj instanceof Integer) {
            jSONWriter.writeName(((Integer) obj).intValue());
            return null;
        }
        if (obj instanceof Long) {
            jSONWriter.writeName(((Long) obj).longValue());
            return null;
        }
        jSONWriter.writeNameAny(obj);
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public boolean writeTypeInfo(JSONWriter jSONWriter) {
        if (jSONWriter.utf8) {
            jSONWriter.writeNameRaw(this.typeInfoUTF8);
            return true;
        }
        jSONWriter.writeNameRaw(this.typeInfoUTF16);
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeWithFilter(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        long j4;
        PropertyFilter propertyFilter;
        AfterFilter afterFilter;
        String path;
        if (obj == null) {
            jSONWriter.writeNull();
            return;
        }
        jSONWriter.startObject();
        Map treeMap = (Map) obj;
        long features = j3 | jSONWriter.getFeatures();
        long j5 = JSONWriter.Feature.MapSortField.mask;
        JSONWriter.Feature feature = JSONWriter.Feature.SortMapEntriesByKeys;
        long j10 = 0;
        if (((j5 | feature.mask) & features) != 0 && !(treeMap instanceof SortedMap) && (treeMap.getClass() != LinkedHashMap.class || (feature.mask & features) != 0)) {
            treeMap = new TreeMap(treeMap);
        }
        JSONWriter.Context context = jSONWriter.context;
        BeforeFilter beforeFilter = context.getBeforeFilter();
        if (beforeFilter != null) {
            beforeFilter.writeBefore(jSONWriter, obj);
        }
        PropertyPreFilter propertyPreFilter = context.getPropertyPreFilter();
        NameFilter nameFilter = context.getNameFilter();
        ValueFilter valueFilter = context.getValueFilter();
        PropertyFilter propertyFilter2 = context.getPropertyFilter();
        AfterFilter afterFilter2 = context.getAfterFilter();
        boolean zIsEnabled = context.isEnabled(JSONWriter.Feature.WriteNulls.mask);
        boolean zIsEnabled2 = context.isEnabled(JSONWriter.Feature.ReferenceDetection.mask);
        for (Map.Entry entry : treeMap.entrySet()) {
            Object value = entry.getValue();
            if (value != null || zIsEnabled) {
                String strMapKeyToString = mapKeyToString(entry.getKey(), jSONWriter, features);
                if (!zIsEnabled2 || (path = jSONWriter.setPath(strMapKeyToString, value)) == null) {
                    if (propertyPreFilter != null) {
                        try {
                            if (!propertyPreFilter.process(jSONWriter, obj, strMapKeyToString)) {
                                if (zIsEnabled2) {
                                    jSONWriter.popPath(value);
                                }
                            }
                        } finally {
                            if (zIsEnabled2) {
                                jSONWriter.popPath(value);
                            }
                        }
                    }
                    if (nameFilter != null) {
                        strMapKeyToString = nameFilter.process(obj, strMapKeyToString, value);
                    }
                    if (propertyFilter2 == null || propertyFilter2.apply(obj, strMapKeyToString, value)) {
                        if (valueFilter != null) {
                            value = valueFilter.apply(obj, strMapKeyToString, value);
                        }
                        if (value == null) {
                            j4 = j10;
                            if ((jSONWriter.getFeatures(features) & JSONWriter.Feature.WriteNulls.mask) == j4) {
                            }
                            j10 = j4;
                        } else {
                            j4 = j10;
                        }
                        jSONWriter.writeName(strMapKeyToString);
                        jSONWriter.writeColon();
                        if (value == null) {
                            jSONWriter.writeNull();
                            propertyFilter = propertyFilter2;
                            afterFilter = afterFilter2;
                        } else {
                            propertyFilter = propertyFilter2;
                            afterFilter = afterFilter2;
                            jSONWriter.getObjectWriter(this.contentAs ? (Class) this.valueType : value.getClass()).write(jSONWriter, value, obj2, type, this.features);
                        }
                        if (zIsEnabled2) {
                            jSONWriter.popPath(value);
                        }
                        propertyFilter2 = propertyFilter;
                        afterFilter2 = afterFilter;
                        j10 = j4;
                    } else if (zIsEnabled2) {
                        jSONWriter.popPath(value);
                    }
                } else {
                    jSONWriter.writeName(strMapKeyToString);
                    jSONWriter.writeColon();
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(value);
                }
            }
        }
        AfterFilter afterFilter3 = afterFilter2;
        if (afterFilter3 != null) {
            afterFilter3.writeAfter(jSONWriter, obj);
        }
        jSONWriter.endObject();
    }

    /* JADX INFO: renamed from: of */
    public static ObjectWriterImplMap m1784of(Type type) {
        return new ObjectWriterImplMap(TypeUtils.getClass(type), 0L);
    }

    /* JADX INFO: renamed from: of */
    public static ObjectWriterImplMap m1785of(Type type, Class cls) {
        return m1786of(type, null, cls);
    }

    /* JADX INFO: renamed from: of */
    public static ObjectWriterImplMap m1783of(Class cls) {
        if (cls == JSONObject.class) {
            return INSTANCE;
        }
        if (cls == JSONFactory.getClassJSONObject1x()) {
            return getINSTANCE1();
        }
        return new ObjectWriterImplMap(null, null, cls, cls, 0L);
    }

    public ObjectWriterImplMap(Type type, Type type2, Class cls, Type type3, long j3) {
        this(type, type2, null, cls, type3, j3);
    }

    public ObjectWriterImplMap(Class cls, long j3) {
        this(null, null, cls, cls, j3);
    }
}
