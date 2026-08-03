package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.ParameterizedTypeImpl;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
abstract class FieldWriterMap extends FieldWriterObject {
    protected final Class<?> contentAs;
    protected Type contentAsFieldType;
    private final Type keyType;
    volatile ObjectWriter mapWriter;
    private final Type valueType;
    final boolean valueTypeRefDetect;
    volatile ObjectWriter valueWriter;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FieldWriterMap(String str, int i9, long j3, String str2, String str3, Type type, Class cls, Field field, Method method, Class<?> cls2) {
        Class cls3;
        Class cls4;
        super(str, i9, j3, str2, str3, type, cls, field, method);
        if (type instanceof ParameterizedType) {
            Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
            if (actualTypeArguments.length == 2) {
                cls4 = actualTypeArguments[0];
                cls3 = actualTypeArguments[1];
            } else {
                cls3 = null;
                cls4 = null;
            }
        }
        cls4 = cls4 == null ? Object.class : cls4;
        cls3 = cls3 == null ? Object.class : cls3;
        ParameterizedTypeImpl parameterizedTypeImpl = cls2 != null ? new ParameterizedTypeImpl(cls, String.class, cls2) : null;
        this.contentAs = cls2;
        this.contentAsFieldType = parameterizedTypeImpl;
        this.keyType = cls4;
        this.valueType = cls3;
        this.valueTypeRefDetect = !ObjectWriterProvider.isNotReferenceDetect(TypeUtils.getClass(cls3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriterObject, com.alibaba.fastjson2.writer.FieldWriter
    public ObjectWriter getObjectWriter(JSONWriter jSONWriter, Class cls) {
        Class<?> cls2 = this.contentAs;
        if (cls2 == null || !this.fieldClass.isAssignableFrom(cls)) {
            return super.getObjectWriter(jSONWriter, cls);
        }
        ObjectWriter objectWriter = this.valueWriter;
        if (objectWriter != null) {
            return objectWriter;
        }
        long j3 = this.features;
        ObjectWriterImplMap objectWriterImplMap = new ObjectWriterImplMap(this.keyType, cls2, cls, this.contentAsFieldType, Long.MIN_VALUE | j3);
        this.mapWriter = objectWriterImplMap;
        return objectWriterImplMap;
    }
}
