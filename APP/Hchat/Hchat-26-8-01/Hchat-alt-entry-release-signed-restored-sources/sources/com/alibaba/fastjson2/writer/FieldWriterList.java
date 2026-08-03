package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterList<T> extends FieldWriter<T> {
    final Class<?> contentAs;
    final Class itemClass;
    final boolean itemClassNotReferenceDetect;
    ObjectWriter itemObjectWriter;
    final Type itemType;
    ObjectWriter listWriter;
    final boolean writeAsString;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterList(String str, Type type, int i9, long j3, String str2, String str3, Type type2, Class cls, Field field, Method method, Class<?> cls2) {
        super(str, i9, j3, str2, str3, type2, cls, field, method);
        this.contentAs = cls2;
        boolean z9 = false;
        this.writeAsString = (JSONWriter.Feature.WriteNonStringValueAsString.mask & j3) != 0;
        Type type3 = type == null ? Object.class : type;
        this.itemType = type3;
        if (type3 instanceof Class) {
            Class cls3 = (Class) type;
            this.itemClass = cls3;
            if (cls3 != null) {
                if (Enum.class.isAssignableFrom(cls3)) {
                    this.listWriter = new ObjectWriterImplListEnum(cls, cls3, j3);
                } else if (cls3 == String.class) {
                    this.listWriter = ObjectWriterImplListStr.INSTANCE;
                } else {
                    this.listWriter = new ObjectWriterImplList(cls, type2, cls3, type, j3);
                }
            }
        } else {
            this.itemClass = TypeUtils.getMapping(type);
        }
        Class cls4 = this.itemClass;
        if (cls4 != null && ObjectWriterProvider.isNotReferenceDetect(cls4)) {
            z9 = true;
        }
        this.itemClassNotReferenceDetect = z9;
        if (str2 == null || this.itemClass != Date.class) {
            return;
        }
        this.itemObjectWriter = new ObjectWriterImplDate(str2, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Class getItemClass() {
        return this.itemClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Type getItemType() {
        return this.itemType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getItemWriter(JSONWriter jSONWriter, Type type) {
        Class cls = this.contentAs;
        if (cls != null) {
            ObjectWriter objectWriter = this.itemObjectWriter;
            if (objectWriter != null) {
                return objectWriter;
            }
            ObjectWriter objectWriter2 = jSONWriter.getObjectWriter(cls, cls);
            this.itemObjectWriter = objectWriter2;
            return objectWriter2;
        }
        if (type != null && type != this.itemType) {
            return jSONWriter.getObjectWriter(type, TypeUtils.getClass(type));
        }
        ObjectWriter objectWriter3 = this.itemObjectWriter;
        if (objectWriter3 != null) {
            return objectWriter3;
        }
        if (this.format != null) {
            if (type == Double.class) {
                ObjectWriterImplDouble objectWriterImplDouble = new ObjectWriterImplDouble(new DecimalFormat(this.format));
                this.itemObjectWriter = objectWriterImplDouble;
                return objectWriterImplDouble;
            }
            if (type == Float.class) {
                ObjectWriterImplFloat objectWriterImplFloat = new ObjectWriterImplFloat(new DecimalFormat(this.format));
                this.itemObjectWriter = objectWriterImplFloat;
                return objectWriterImplFloat;
            }
            if (type == BigDecimal.class) {
                ObjectWriterImplBigDecimal objectWriterImplBigDecimal = new ObjectWriterImplBigDecimal(new DecimalFormat(this.format), null);
                this.itemObjectWriter = objectWriterImplBigDecimal;
                return objectWriterImplBigDecimal;
            }
        }
        ObjectWriter objectWriter4 = jSONWriter.getObjectWriter(this.itemType, this.itemClass);
        this.itemObjectWriter = objectWriter4;
        return objectWriter4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        ObjectWriter objectWriter = this.listWriter;
        if (objectWriter != null && this.fieldClass.isAssignableFrom(cls)) {
            return objectWriter;
        }
        if (objectWriter != null || cls != this.fieldClass) {
            return jSONWriter.getObjectWriter(cls);
        }
        ObjectWriter objectWriter2 = jSONWriter.getObjectWriter(cls);
        this.listWriter = objectWriter2;
        return objectWriter2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeList(JSONWriter jSONWriter, boolean z9, List list) {
        JSONWriter jSONWriter2;
        String path;
        if (jSONWriter.jsonb) {
            writeListJSONB(jSONWriter, z9, list);
            return;
        }
        long features = jSONWriter.getFeatures(this.features);
        if ((JSONWriter.Feature.NotWriteEmptyArray.mask & features) != 0 && list.isEmpty() && z9) {
            return;
        }
        boolean z10 = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
        if (z9) {
            writeFieldName(jSONWriter);
        }
        jSONWriter.startArray();
        Class<?> cls = null;
        int i9 = 0;
        boolean z11 = z10;
        ObjectWriter itemWriter = null;
        while (i9 < list.size()) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            Object obj = list.get(i9);
            if (obj == null) {
                jSONWriter.writeNull();
            } else {
                Class<?> cls2 = obj.getClass();
                if (cls2 == String.class) {
                    jSONWriter.writeString((String) obj);
                } else {
                    if (cls2 != cls) {
                        boolean zIsRefDetect = jSONWriter.isRefDetect();
                        itemWriter = getItemWriter(jSONWriter, cls2);
                        if (zIsRefDetect) {
                            zIsRefDetect = !ObjectWriterProvider.isNotReferenceDetect(cls2);
                        }
                        z11 = zIsRefDetect;
                        cls = cls2;
                    }
                    ObjectWriter objectWriter = itemWriter;
                    if (!z11 || (path = jSONWriter.setPath(i9, obj)) == null) {
                        jSONWriter2 = jSONWriter;
                        objectWriter.write(jSONWriter2, obj, null, this.itemType, features);
                        if (z11) {
                            jSONWriter2.popPath(obj);
                        }
                    } else {
                        jSONWriter.writeReference(path);
                        jSONWriter.popPath(obj);
                        jSONWriter2 = jSONWriter;
                    }
                    itemWriter = objectWriter;
                    i9++;
                    jSONWriter = jSONWriter2;
                }
            }
            jSONWriter2 = jSONWriter;
            i9++;
            jSONWriter = jSONWriter2;
        }
        jSONWriter.endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void writeListJSONB(JSONWriter jSONWriter, boolean z9, List list) {
        boolean z10;
        Class<?> cls;
        ObjectWriter objectWriter;
        JSONWriter jSONWriter2;
        String path;
        ObjectWriter itemWriter;
        long features = jSONWriter.getFeatures(this.features);
        int i9 = 0;
        boolean z11 = (JSONWriter.Feature.BeanToArray.mask & features) != 0;
        if ((JSONWriter.Feature.NotWriteEmptyArray.mask & features) != 0 && list.isEmpty() && z9) {
            return;
        }
        boolean z12 = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
        if (z9) {
            writeFieldName(jSONWriter);
        }
        int size = list.size();
        if (jSONWriter.isWriteTypeInfo((Object) list, this.fieldClass)) {
            jSONWriter.writeTypeName(TypeUtils.getTypeName((Class) list.getClass()));
        }
        jSONWriter.startArray(size);
        Class<?> cls2 = null;
        ObjectWriter objectWriter2 = null;
        while (i9 < size) {
            ObjectWriter objectWriter3 = objectWriter2;
            Object obj = list.get(i9);
            if (obj == null) {
                jSONWriter.writeNull();
                cls = cls2;
                objectWriter2 = objectWriter3;
                jSONWriter2 = jSONWriter;
            } else {
                Class<?> cls3 = obj.getClass();
                if (cls3 != cls2) {
                    boolean zIsRefDetect = jSONWriter.isRefDetect();
                    if (cls3 != this.itemType || (itemWriter = this.itemObjectWriter) == null) {
                        itemWriter = getItemWriter(jSONWriter, cls3);
                    }
                    if (zIsRefDetect) {
                        zIsRefDetect = !(cls3 == this.itemClass ? this.itemClassNotReferenceDetect : ObjectWriterProvider.isNotReferenceDetect(cls3));
                    }
                    z10 = zIsRefDetect;
                    objectWriter = itemWriter;
                    cls = cls3;
                } else {
                    z10 = z12;
                    cls = cls2;
                    objectWriter = objectWriter3;
                }
                if (!z10 || (path = jSONWriter.setPath(i9, obj)) == null) {
                    Type type = this.itemType;
                    if (z11) {
                        jSONWriter2 = jSONWriter;
                        objectWriter.writeArrayMappingJSONB(jSONWriter2, obj, Integer.valueOf(i9), type, features);
                    } else {
                        jSONWriter2 = jSONWriter;
                        objectWriter.writeJSONB(jSONWriter2, obj, Integer.valueOf(i9), type, features);
                    }
                    if (z10) {
                        jSONWriter2.popPath(obj);
                    }
                } else {
                    jSONWriter.writeReference(path);
                    jSONWriter.popPath(obj);
                    jSONWriter2 = jSONWriter;
                }
                objectWriter2 = objectWriter;
                z12 = z10;
            }
            i9++;
            jSONWriter = jSONWriter2;
            cls2 = cls;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeListStr(JSONWriter jSONWriter, boolean z9, List<String> list) {
        if (z9) {
            writeFieldName(jSONWriter);
        }
        if (jSONWriter.jsonb && jSONWriter.isWriteTypeInfo((Object) list, this.fieldClass)) {
            jSONWriter.writeTypeName(TypeUtils.getTypeName((Class) list.getClass()));
        }
        jSONWriter.writeString(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeListValue(JSONWriter jSONWriter, List list) {
        Class<?> cls;
        if (jSONWriter.jsonb) {
            writeListJSONB(jSONWriter, list);
            return;
        }
        long features = jSONWriter.getFeatures(this.features);
        boolean z9 = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
        jSONWriter.startArray();
        Class<?> cls2 = null;
        ObjectWriter itemWriter = null;
        for (int i9 = 0; i9 < list.size(); i9++) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            Object obj = list.get(i9);
            if (obj == null) {
                jSONWriter.writeNull();
            } else {
                Class<?> cls3 = obj.getClass();
                if (cls3 == String.class) {
                    jSONWriter.writeString((String) obj);
                } else if (this.writeAsString) {
                    jSONWriter.writeString(obj.toString());
                } else {
                    if (cls3 == cls2) {
                        cls = cls2;
                    } else {
                        z9 = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
                        itemWriter = getItemWriter(jSONWriter, cls3);
                        if (z9) {
                            z9 = !ObjectWriterProvider.isNotReferenceDetect(cls3);
                        }
                        cls = cls3;
                    }
                    boolean z10 = z9;
                    ObjectWriter objectWriter = itemWriter;
                    if (!z10 || !jSONWriter.writeReference(i9, obj)) {
                        objectWriter.write(jSONWriter, obj, null, this.itemType, features);
                        if (z10) {
                            jSONWriter.popPath(obj);
                        }
                    }
                    itemWriter = objectWriter;
                    z9 = z10;
                    cls2 = cls;
                }
            }
        }
        jSONWriter.endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeListValueJSONB(JSONWriter jSONWriter, List list) {
        boolean z9;
        Class<?> cls;
        ObjectWriter objectWriter;
        JSONWriter jSONWriter2;
        ObjectWriter itemWriter;
        long features = jSONWriter.getFeatures(this.features);
        int i9 = 0;
        boolean z10 = (JSONWriter.Feature.BeanToArray.mask & features) != 0;
        int size = list.size();
        boolean z11 = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
        if (jSONWriter.isWriteTypeInfo((Object) list, this.fieldClass)) {
            jSONWriter.writeTypeName(TypeUtils.getTypeName((Class) list.getClass()));
        }
        jSONWriter.startArray(size);
        Class<?> cls2 = null;
        ObjectWriter objectWriter2 = null;
        while (i9 < size) {
            ObjectWriter objectWriter3 = objectWriter2;
            Object obj = list.get(i9);
            if (obj == null) {
                jSONWriter.writeNull();
                cls = cls2;
                objectWriter2 = objectWriter3;
                jSONWriter2 = jSONWriter;
            } else {
                Class<?> cls3 = obj.getClass();
                if (cls3 != cls2) {
                    boolean zIsRefDetect = jSONWriter.isRefDetect();
                    if (cls3 != this.itemType || (itemWriter = this.itemObjectWriter) == null) {
                        itemWriter = getItemWriter(jSONWriter, cls3);
                    }
                    if (zIsRefDetect) {
                        zIsRefDetect = !(cls3 == this.itemClass ? this.itemClassNotReferenceDetect : ObjectWriterProvider.isNotReferenceDetect(cls3));
                    }
                    z9 = zIsRefDetect;
                    objectWriter = itemWriter;
                    cls = cls3;
                } else {
                    z9 = z11;
                    cls = cls2;
                    objectWriter = objectWriter3;
                }
                if (z9 && jSONWriter.writeReference(i9, obj)) {
                    jSONWriter2 = jSONWriter;
                } else {
                    Type type = this.itemType;
                    if (z10) {
                        jSONWriter2 = jSONWriter;
                        objectWriter.writeArrayMappingJSONB(jSONWriter2, obj, Integer.valueOf(i9), type, features);
                    } else {
                        jSONWriter2 = jSONWriter;
                        objectWriter.writeJSONB(jSONWriter2, obj, Integer.valueOf(i9), type, features);
                    }
                    if (z9) {
                        jSONWriter2.popPath(obj);
                    }
                }
                objectWriter2 = objectWriter;
                z11 = z9;
            }
            i9++;
            jSONWriter = jSONWriter2;
            cls2 = cls;
        }
    }

    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public final void writeListJSONB(JSONWriter jSONWriter, List list) {
        boolean z9;
        Class<?> cls;
        ObjectWriter objectWriter;
        JSONWriter jSONWriter2;
        ObjectWriter itemWriter;
        boolean zIsNotReferenceDetect;
        long features = jSONWriter.getFeatures(this.features);
        int i9 = 0;
        boolean z10 = (JSONWriter.Feature.BeanToArray.mask & features) != 0;
        int size = list.size();
        if ((JSONWriter.Feature.NotWriteEmptyArray.mask & features) == 0 || size != 0) {
            writeFieldName(jSONWriter);
            boolean z11 = (JSONWriter.Feature.ReferenceDetection.mask & features) != 0;
            if (jSONWriter.isWriteTypeInfo((Object) list, this.fieldClass)) {
                jSONWriter.writeTypeName(TypeUtils.getTypeName((Class) list.getClass()));
            }
            jSONWriter.startArray(size);
            Class<?> cls2 = null;
            ObjectWriter objectWriter2 = null;
            while (i9 < size) {
                ObjectWriter objectWriter3 = objectWriter2;
                Object obj = list.get(i9);
                if (obj == null) {
                    jSONWriter.writeNull();
                    cls = cls2;
                    objectWriter2 = objectWriter3;
                    jSONWriter2 = jSONWriter;
                } else {
                    Class<?> cls3 = obj.getClass();
                    if (cls3 != cls2) {
                        boolean zIsRefDetect = jSONWriter.isRefDetect();
                        if (cls3 != this.itemType || (itemWriter = this.itemObjectWriter) == null) {
                            itemWriter = getItemWriter(jSONWriter, cls3);
                        }
                        if (zIsRefDetect) {
                            if (cls3 == this.itemClass) {
                                zIsNotReferenceDetect = this.itemClassNotReferenceDetect;
                            } else {
                                zIsNotReferenceDetect = ObjectWriterProvider.isNotReferenceDetect(cls3);
                            }
                            zIsRefDetect = !zIsNotReferenceDetect;
                        }
                        z9 = zIsRefDetect;
                        objectWriter = itemWriter;
                        cls = cls3;
                    } else {
                        z9 = z11;
                        cls = cls2;
                        objectWriter = objectWriter3;
                    }
                    if (z9 && jSONWriter.writeReference(i9, obj)) {
                        jSONWriter2 = jSONWriter;
                    } else {
                        Type type = this.itemType;
                        if (z10) {
                            jSONWriter2 = jSONWriter;
                            objectWriter.writeArrayMappingJSONB(jSONWriter2, obj, Integer.valueOf(i9), type, features);
                        } else {
                            jSONWriter2 = jSONWriter;
                            objectWriter.writeJSONB(jSONWriter2, obj, Integer.valueOf(i9), type, features);
                        }
                        if (z9) {
                            jSONWriter2.popPath(obj);
                        }
                    }
                    objectWriter2 = objectWriter;
                    z11 = z9;
                }
                i9++;
                jSONWriter = jSONWriter2;
                cls2 = cls;
            }
        }
    }
}
