package com.alibaba.fastjson2.filter;

import com.alibaba.fastjson2.codec.FieldInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class BeanContext {
    private final Class beanClass;
    private final long features;
    private final Field field;
    private final Class fieldClass;
    private final Type fieldType;
    private final String format;
    private final String label;
    private final Method method;
    private final String name;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BeanContext(Class cls, Method method, Field field, String str, String str2, Class cls2, Type type, long j3, String str3) {
        this.beanClass = cls;
        this.method = method;
        this.field = field;
        this.name = str;
        this.label = str2;
        this.fieldClass = cls2;
        this.fieldType = type;
        this.features = j3;
        this.format = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public <T extends Annotation> T getAnnotation(Class<T> cls) {
        Field field;
        Method method = this.method;
        T t9 = method != null ? (T) method.getAnnotation(cls) : null;
        return (t9 != null || (field = this.field) == null) ? t9 : (T) field.getAnnotation(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getBeanClass() {
        return this.beanClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public long getFeatures() {
        return this.features;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Field getField() {
        return this.field;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> getFieldClass() {
        return this.fieldClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Type getFieldType() {
        return this.fieldType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getFormat() {
        return this.format;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getLabel() {
        return this.label;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Method getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean isJsonDirect() {
        return (this.features & FieldInfo.RAW_VALUE_MASK) != 0;
    }
}
