package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplList extends ObjectWriterPrimitiveImpl {
    static final Class CLASS_SUBLIST;
    static final ObjectWriterImplList INSTANCE = new ObjectWriterImplList(null, null, null, null, 0);
    static final ObjectWriterImplList INSTANCE_JSON_ARRAY = new ObjectWriterImplList(JSONArray.class, null, null, null, 0);
    static final ObjectWriterImplList INSTANCE_JSON_ARRAY_1x;
    static final String TYPE_NAME_ARRAY_LIST;
    static final long TYPE_NAME_HASH_ARRAY_LIST;
    static final byte[] TYPE_NAME_JSONB_ARRAY_LIST;
    final Class defineClass;
    final Type defineType;
    final long features;
    final Class itemClass;
    final boolean itemClassRefDetect;
    volatile ObjectWriter itemClassWriter;
    final Type itemType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Class classJSONArray1x = JSONFactory.getClassJSONArray1x();
        if (classJSONArray1x == null) {
            INSTANCE_JSON_ARRAY_1x = null;
        } else {
            INSTANCE_JSON_ARRAY_1x = new ObjectWriterImplList(classJSONArray1x, null, null, null, 0L);
        }
        CLASS_SUBLIST = new ArrayList().subList(0, 0).getClass();
        String typeName = TypeUtils.getTypeName(ArrayList.class);
        TYPE_NAME_ARRAY_LIST = typeName;
        TYPE_NAME_JSONB_ARRAY_LIST = JSONB.toBytes(typeName);
        TYPE_NAME_HASH_ARRAY_LIST = Fnv.hashCode64(typeName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectWriterImplList(Class cls, Type type, Class cls2, Type type2, long j3) {
        this.defineClass = cls;
        this.defineType = type;
        this.itemClass = cls2;
        this.itemType = type2;
        this.features = j3;
        this.itemClassRefDetect = (cls2 == null || ObjectWriterProvider.isNotReferenceDetect(cls2)) ? false : true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        Class<?> cls;
        ObjectWriter objectWriter;
        boolean zIsRefDetect;
        boolean z9;
        String path;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        List list = TypeUtils.toList(obj);
        Class<?> cls2 = null;
        if (jSONWriter.jsonb) {
            jSONWriter.startArray(list.size());
            ObjectWriter objectWriter2 = null;
            for (int i9 = 0; i9 < list.size(); i9++) {
                Object obj3 = list.get(i9);
                if (obj3 == null) {
                    jSONWriter.writeNull();
                } else {
                    Class<?> cls3 = obj3.getClass();
                    if (cls3 != cls2) {
                        objectWriter2 = jSONWriter.getObjectWriter(cls3);
                        cls2 = cls3;
                    }
                    objectWriter2.writeJSONB(jSONWriter, obj3, Integer.valueOf(i9), this.itemType, j3);
                }
            }
            return;
        }
        JSONWriter.Context context = jSONWriter.context;
        ObjectWriterProvider objectWriterProvider = context.provider;
        int size = list.size();
        if (size == 0) {
            jSONWriter.writeRaw('[', ']');
            return;
        }
        jSONWriter.startArray();
        Class<?> cls4 = null;
        ObjectWriter objectWriter3 = null;
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            if (i10 != 0) {
                jSONWriter.writeComma();
            }
            Object obj4 = list.get(i10);
            if (obj4 == null) {
                jSONWriter.writeNull();
            } else {
                Class<?> cls5 = obj4.getClass();
                if (cls5 == String.class) {
                    jSONWriter.writeString((String) obj4);
                } else {
                    if (cls5 != Integer.class) {
                        cls = cls4;
                        if (cls5 == Long.class) {
                            if ((objectWriterProvider.userDefineMask & 4) == 0) {
                                jSONWriter.writeInt64((Long) obj4);
                            } else {
                                objectWriterProvider.getObjectWriter(cls5, cls5, false).write(jSONWriter, obj4, Integer.valueOf(i10), Long.class, j3);
                            }
                        } else if (cls5 == Boolean.class) {
                            if ((objectWriterProvider.userDefineMask & 2) == 0) {
                                jSONWriter.writeBool(((Boolean) obj4).booleanValue());
                            } else {
                                objectWriterProvider.getObjectWriter(cls5, cls5, false).write(jSONWriter, obj4, Integer.valueOf(i10), Boolean.class, j3);
                            }
                        } else if (cls5 != BigDecimal.class) {
                            if (cls5 != this.itemClass || this.itemClassWriter == null) {
                                if (cls5 == cls) {
                                    objectWriter = objectWriter3;
                                } else {
                                    if (cls5 == JSONObject.class) {
                                        objectWriter = ObjectWriterImplMap.INSTANCE;
                                        zIsRefDetect = jSONWriter.isRefDetect();
                                    } else if (cls5 == JSONFactory.getClassJSONObject1x()) {
                                        objectWriter = ObjectWriterImplMap.getINSTANCE1();
                                        zIsRefDetect = jSONWriter.isRefDetect();
                                    } else if (cls5 == JSONArray.class) {
                                        objectWriter = INSTANCE_JSON_ARRAY;
                                        zIsRefDetect = jSONWriter.isRefDetect();
                                    } else if (cls5 == JSONFactory.getClassJSONArray1x()) {
                                        objectWriter = INSTANCE_JSON_ARRAY_1x;
                                        zIsRefDetect = jSONWriter.isRefDetect();
                                    } else {
                                        objectWriter = context.getObjectWriter(cls5);
                                        zIsRefDetect = jSONWriter.isRefDetect(obj4);
                                    }
                                    z10 = zIsRefDetect;
                                    if (cls5 == this.itemClass) {
                                        this.itemClassWriter = objectWriter;
                                    }
                                    objectWriter3 = objectWriter;
                                    cls = cls5;
                                }
                                z9 = z10;
                            } else {
                                objectWriter = this.itemClassWriter;
                                z9 = z10;
                                z10 = this.itemClassRefDetect && jSONWriter.isRefDetect();
                            }
                            if (!z10 || (path = jSONWriter.setPath(i10, obj4)) == null) {
                                objectWriter.write(jSONWriter, obj4, Integer.valueOf(i10), this.itemType, this.features);
                                if (z10) {
                                    jSONWriter.popPath(obj4);
                                }
                            } else {
                                jSONWriter.writeReference(path);
                                jSONWriter.popPath(obj4);
                            }
                            z10 = z9;
                        } else if ((objectWriterProvider.userDefineMask & 8) == 0) {
                            jSONWriter.writeDecimal((BigDecimal) obj4, j3, null);
                        } else {
                            objectWriterProvider.getObjectWriter(cls5, cls5, false).write(jSONWriter, obj4, Integer.valueOf(i10), BigDecimal.class, j3);
                        }
                    } else if ((objectWriterProvider.userDefineMask & 2) == 0) {
                        jSONWriter.writeInt32((Integer) obj4);
                    } else {
                        cls = cls4;
                        objectWriterProvider.getObjectWriter(cls5, cls5, false).write(jSONWriter, obj4, Integer.valueOf(i10), Integer.class, j3);
                    }
                    cls4 = cls;
                }
            }
            cls = cls4;
            cls4 = cls;
        }
        jSONWriter.endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl, com.alibaba.fastjson2.writer.ObjectWriter
    public void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        JSONWriter jSONWriter2;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        List list = TypeUtils.toList(obj);
        jSONWriter.startArray(list.size());
        Class<?> cls = null;
        int i9 = 0;
        ObjectWriter objectWriter = null;
        while (i9 < list.size()) {
            Object obj3 = list.get(i9);
            if (obj3 == null) {
                jSONWriter.writeNull();
                jSONWriter2 = jSONWriter;
            } else {
                Class<?> cls2 = obj3.getClass();
                if (cls2 != cls) {
                    objectWriter = jSONWriter.getObjectWriter(cls2);
                    cls = cls2;
                }
                ObjectWriter objectWriter2 = objectWriter;
                jSONWriter2 = jSONWriter;
                objectWriter2.writeArrayMappingJSONB(jSONWriter2, obj3, Integer.valueOf(i9), this.itemType, this.features | j3);
                objectWriter = objectWriter2;
            }
            i9++;
            jSONWriter = jSONWriter2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        Class cls;
        Class cls2;
        long j4;
        int size;
        ObjectWriter objectWriter;
        Class<?> cls3;
        String path;
        Class<?> cls4;
        Class cls5;
        if (obj == null) {
            jSONWriter.writeArrayNull();
            return;
        }
        int i9 = 0;
        Class<?> cls6 = null;
        if (type instanceof Class) {
            cls = (Class) type;
        } else {
            if (type != this.defineType) {
                if (type instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    if (actualTypeArguments.length == 1) {
                        Type type2 = actualTypeArguments[0];
                        cls2 = type2 instanceof Class ? (Class) type2 : null;
                        Type rawType = parameterizedType.getRawType();
                        cls = rawType instanceof Class ? (Class) rawType : null;
                    }
                } else {
                    cls = null;
                    cls2 = null;
                }
                Class<?> cls7 = obj.getClass();
                j4 = j3;
                if (jSONWriter.isWriteTypeInfo(obj, cls, j4)) {
                    if (cls7 == CLASS_SUBLIST || cls7 == ArrayList.class) {
                        jSONWriter.writeTypeName(TYPE_NAME_JSONB_ARRAY_LIST, TYPE_NAME_HASH_ARRAY_LIST);
                    } else {
                        jSONWriter.writeTypeName(TypeUtils.getTypeName((Class) cls7));
                    }
                }
                List list = TypeUtils.toList(obj);
                size = list.size();
                if (size != 0) {
                    jSONWriter.writeRaw((byte) -108);
                    return;
                }
                if (jSONWriter.isBeanToArray()) {
                    jSONWriter.startArray(size);
                    ObjectWriter objectWriter2 = null;
                    while (i9 < size) {
                        Object obj3 = list.get(i9);
                        if (obj3 == null) {
                            jSONWriter.writeNull();
                            cls4 = cls6;
                            cls5 = cls2;
                        } else {
                            Class<?> cls8 = obj3.getClass();
                            if (cls8 == cls6) {
                                cls4 = cls6;
                            } else {
                                objectWriter2 = jSONWriter.getObjectWriter(cls8);
                                cls4 = cls8;
                            }
                            cls5 = cls2;
                            objectWriter2.writeArrayMappingJSONB(jSONWriter, obj3, Integer.valueOf(i9), cls5, j4);
                        }
                        i9++;
                        j4 = j3;
                        cls2 = cls5;
                        cls6 = cls4;
                    }
                    jSONWriter.endArray();
                    return;
                }
                JSONWriter.Context context = jSONWriter.context;
                jSONWriter.startArray(size);
                ObjectWriter instance1 = null;
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj4 = list.get(i10);
                    if (obj4 == null) {
                        jSONWriter.writeNull();
                    } else {
                        Class<?> cls9 = obj4.getClass();
                        if (cls9 == String.class) {
                            jSONWriter.writeString((String) obj4);
                        } else {
                            boolean zIsRefDetect = cls9 == this.itemClass ? this.itemClassRefDetect && jSONWriter.isRefDetect() : jSONWriter.isRefDetect(obj4);
                            if (cls9 == this.itemClass && this.itemClassWriter != null) {
                                objectWriter = instance1;
                                instance1 = this.itemClassWriter;
                            } else if (cls9 == cls6) {
                                objectWriter = instance1;
                            } else {
                                instance1 = cls9 == JSONObject.class ? ObjectWriterImplMap.INSTANCE : cls9 == JSONFactory.getClassJSONObject1x() ? ObjectWriterImplMap.getINSTANCE1() : cls9 == JSONArray.class ? INSTANCE_JSON_ARRAY : cls9 == JSONFactory.getClassJSONArray1x() ? INSTANCE_JSON_ARRAY_1x : context.getObjectWriter(cls9);
                                if (cls9 == this.itemClass) {
                                    this.itemClassWriter = instance1;
                                }
                                objectWriter = instance1;
                                cls3 = cls9;
                                if (zIsRefDetect || (path = jSONWriter.setPath(i10, obj4)) == null) {
                                    instance1.writeJSONB(jSONWriter, obj4, Integer.valueOf(i10), this.itemType, this.features);
                                    if (zIsRefDetect) {
                                        jSONWriter.popPath(obj4);
                                    }
                                } else {
                                    jSONWriter.writeReference(path);
                                    jSONWriter.popPath(obj4);
                                }
                                instance1 = objectWriter;
                                cls6 = cls3;
                            }
                            cls3 = cls6;
                            if (zIsRefDetect) {
                                instance1.writeJSONB(jSONWriter, obj4, Integer.valueOf(i10), this.itemType, this.features);
                                if (zIsRefDetect) {
                                }
                                instance1 = objectWriter;
                                cls6 = cls3;
                            }
                        }
                    }
                }
                jSONWriter.endArray();
                return;
            }
            cls = this.itemClass;
        }
        cls2 = null;
        Class<?> cls72 = obj.getClass();
        j4 = j3;
        if (jSONWriter.isWriteTypeInfo(obj, cls, j4)) {
        }
        List list2 = TypeUtils.toList(obj);
        size = list2.size();
        if (size != 0) {
        }
    }
}
