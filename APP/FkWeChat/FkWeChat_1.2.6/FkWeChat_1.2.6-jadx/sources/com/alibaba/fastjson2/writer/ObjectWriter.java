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

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface ObjectWriter<T> {
    default long getFeatures() {
        return 0L;
    }

    default Object getFieldValue(Object obj, String str) {
        FieldWriter fieldWriter = getFieldWriter(str);
        if (fieldWriter == null) {
            return null;
        }
        return fieldWriter.getFieldValue(obj);
    }

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

    default List<FieldWriter> getFieldWriters() {
        return Collections.EMPTY_LIST;
    }

    default boolean hasFilter(JSONWriter jSONWriter) {
        return jSONWriter.hasFilter(JSONWriter.Feature.IgnoreNonFieldGetter.mask);
    }

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

    default String toJSONString(T t10, JSONWriter.Feature... featureArr) {
        JSONWriter jSONWriterM6250of = JSONWriter.m6250of(featureArr);
        try {
            write(jSONWriterM6250of, t10, null, null, 0L);
            String string = jSONWriterM6250of.toString();
            jSONWriterM6250of.close();
            return string;
        } catch (Throwable th) {
            if (jSONWriterM6250of == null) {
                throw th;
            }
            try {
                jSONWriterM6250of.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    default void write(JSONWriter jSONWriter, Object obj) {
        write(jSONWriter, obj, null, null, 0L);
    }

    void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10);

    default void writeArrayMapping(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (jSONWriter.jsonb) {
            writeArrayMappingJSONB(jSONWriter, obj, obj2, type, j10);
            return;
        }
        List<FieldWriter> fieldWriters = getFieldWriters();
        jSONWriter.startArray();
        int i10 = 0;
        if (hasFilter(jSONWriter)) {
            JSONWriter.Context context = jSONWriter.context;
            PropertyPreFilter propertyPreFilter = context.getPropertyPreFilter();
            ValueFilter valueFilter = context.getValueFilter();
            PropertyFilter propertyFilter = context.getPropertyFilter();
            int size = fieldWriters.size();
            while (i10 < size) {
                if (i10 != 0) {
                    jSONWriter.writeComma();
                }
                FieldWriter fieldWriter = fieldWriters.get(i10);
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
                i10++;
            }
        } else {
            int size2 = fieldWriters.size();
            while (i10 < size2) {
                if (i10 != 0) {
                    jSONWriter.writeComma();
                }
                fieldWriters.get(i10).writeValue(jSONWriter, obj);
                i10++;
            }
        }
        jSONWriter.endArray();
    }

    default void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        List<FieldWriter> fieldWriters = getFieldWriters();
        int size = fieldWriters.size();
        jSONWriter.startArray(size);
        for (int i10 = 0; i10 < size; i10++) {
            fieldWriters.get(i10).writeValue(jSONWriter, obj);
        }
    }

    default void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        write(jSONWriter, obj, obj2, type, j10);
    }

    default boolean writeTypeInfo(JSONWriter jSONWriter) {
        return false;
    }

    default void writeWithFilter(JSONWriter jSONWriter, Object obj) {
        writeWithFilter(jSONWriter, obj, null, null, 0L);
    }

    default void writeWithFilter(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        throw new UnsupportedOperationException();
    }

    default void setNameFilter(NameFilter nameFilter) {
    }

    default void setPropertyFilter(PropertyFilter propertyFilter) {
    }

    default void setPropertyPreFilter(PropertyPreFilter propertyPreFilter) {
    }

    default void setValueFilter(ValueFilter valueFilter) {
    }

    default FieldWriter getFieldWriter(long j10) {
        return null;
    }

    default void writeArrayMappingJSONB(JSONWriter jSONWriter, Object obj) {
        writeArrayMappingJSONB(jSONWriter, obj, null, null, 0L);
    }
}
