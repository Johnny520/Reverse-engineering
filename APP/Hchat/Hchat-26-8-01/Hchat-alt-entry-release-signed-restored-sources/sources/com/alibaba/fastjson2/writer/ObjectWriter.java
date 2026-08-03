package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.filter.Filter;
import com.alibaba.fastjson2.filter.NameFilter;
import com.alibaba.fastjson2.filter.PropertyFilter;
import com.alibaba.fastjson2.filter.PropertyPreFilter;
import com.alibaba.fastjson2.filter.ValueFilter;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectWriter<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default long getFeatures() {
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default Object getFieldValue(Object obj, String str) {
        FieldWriter fieldWriter = getFieldWriter(str);
        if (fieldWriter == null) {
            return null;
        }
        return fieldWriter.getFieldValue(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default FieldWriter getFieldWriter(String str) {
        long jHashCode64 = Fnv.hashCode64(str);
        FieldWriter fieldWriter = getFieldWriter(jHashCode64);
        if (fieldWriter == null) {
            long jHashCode64LCase = Fnv.hashCode64LCase(str);
            if (jHashCode64LCase != jHashCode64) {
                return getFieldWriter(jHashCode64LCase);
            }
        }
        return fieldWriter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default List<FieldWriter> getFieldWriters() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default boolean hasFilter(JSONWriter jSONWriter) {
        return jSONWriter.hasFilter(JSONWriter.Feature.IgnoreNonFieldGetter.mask);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void setFilter(Filter filter) {
        if (filter instanceof PropertyFilter) {
            setPropertyFilter((PropertyFilter) filter);
        }
        if (filter instanceof ValueFilter) {
            setValueFilter((ValueFilter) filter);
        }
        if (filter instanceof NameFilter) {
            setNameFilter((NameFilter) filter);
        }
        if (filter instanceof PropertyPreFilter) {
            setPropertyPreFilter((PropertyPreFilter) filter);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    default String toJSONString(T t9, JSONWriter.Feature... featureArr) {
        JSONWriter jSONWriterM1687of = JSONWriter.m1687of(featureArr);
        try {
            write(jSONWriterM1687of, t9, null, null, 0L);
            String string = jSONWriterM1687of.toString();
            jSONWriterM1687of.close();
            return string;
        } catch (Throwable th2) {
            if (jSONWriterM1687of == null) {
                throw th2;
            }
            try {
                jSONWriterM1687of.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void write(JSONWriter jSONWriter, Object obj) {
        write(jSONWriter, obj, null, null, 0L);
    }

    void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void writeArrayMapping(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (jSONWriter.jsonb) {
            writeArrayMappingJSONB(jSONWriter, obj, obj2, type, j3);
            return;
        }
        List<FieldWriter> fieldWriters = getFieldWriters();
        jSONWriter.startArray();
        int i9 = 0;
        if (hasFilter(jSONWriter)) {
            JSONWriter.Context context = jSONWriter.context;
            PropertyPreFilter propertyPreFilter = context.getPropertyPreFilter();
            ValueFilter valueFilter = context.getValueFilter();
            PropertyFilter propertyFilter = context.getPropertyFilter();
            int size = fieldWriters.size();
            while (i9 < size) {
                if (i9 != 0) {
                    jSONWriter.writeComma();
                }
                FieldWriter fieldWriter = fieldWriters.get(i9);
                if (propertyPreFilter == null || propertyPreFilter.process(jSONWriter, obj, fieldWriter.fieldName)) {
                    Object fieldValue = fieldWriter.getFieldValue(obj);
                    if (propertyFilter != null && !propertyFilter.apply(obj, fieldWriter.fieldName, fieldValue)) {
                        jSONWriter.writeNull();
                    } else if (valueFilter != null) {
                        Object objApply = valueFilter.apply(obj, fieldWriter.fieldName, fieldValue);
                        if (objApply == null) {
                            jSONWriter.writeNull();
                        } else {
                            fieldWriter.getObjectWriter(jSONWriter, objApply.getClass()).write(jSONWriter, fieldValue);
                        }
                    } else if (fieldValue == null) {
                        jSONWriter.writeNull();
                    } else {
                        fieldWriter.getObjectWriter(jSONWriter, fieldValue.getClass()).write(jSONWriter, fieldValue);
                    }
                } else {
                    jSONWriter.writeNull();
                }
                i9++;
            }
        } else {
            int size2 = fieldWriters.size();
            while (i9 < size2) {
                if (i9 != 0) {
                    jSONWriter.writeComma();
                }
                fieldWriters.get(i9).writeValue(jSONWriter, obj);
                i9++;
            }
        }
        jSONWriter.endArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        List<FieldWriter> fieldWriters = getFieldWriters();
        int size = fieldWriters.size();
        jSONWriter.startArray(size);
        for (int i9 = 0; i9 < size; i9++) {
            fieldWriters.get(i9).writeValue(jSONWriter, obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        write(jSONWriter, obj, obj2, type, j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default boolean writeTypeInfo(JSONWriter jSONWriter) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    default void writeWithFilter(JSONWriter jSONWriter, Object obj) {
        writeWithFilter(jSONWriter, obj, null, null, 0L);
    }

    default void writeWithFilter(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        throw new UnsupportedOperationException();
    }

    default FieldWriter getFieldWriter(long j3) {
        return null;
    }

    default void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj) {
        writeArrayMappingJSONB(jSONWriter, obj, null, null, 0L);
    }

    default void setNameFilter(NameFilter nameFilter) {
    }

    default void setPropertyFilter(PropertyFilter propertyFilter) {
    }

    default void setPropertyPreFilter(PropertyPreFilter propertyPreFilter) {
    }

    default void setValueFilter(ValueFilter valueFilter) {
    }
}
