package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterListFunc<T> extends FieldWriterList<T> {
    final Function<T, List> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterListFunc(String str, int i9, long j3, String str2, String str3, Type type, Method method, Function<T, List> function, Type type2, Class cls, Class<?> cls2) {
        super(str, type, i9, j3, str2, str3, type2, cls, null, method, cls2);
        this.function = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t9) {
        return this.function.apply(t9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public boolean write(JSONWriter jSONWriter, T t9) {
        try {
            List<String> list = TypeUtils.toList(this.function.apply(t9));
            long j3 = this.features;
            if (list == null) {
                long features = j3 | jSONWriter.getFeatures();
                if (((JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask) & features) == 0) {
                    return false;
                }
                writeFieldName(jSONWriter);
                jSONWriter.writeArrayNull(features);
                return true;
            }
            if ((j3 & JSONWriter.Feature.NotWriteEmptyArray.mask) != 0 && list.isEmpty()) {
                return false;
            }
            String path = jSONWriter.setPath(this, list);
            if (path != null) {
                writeFieldName(jSONWriter);
                jSONWriter.writeReference(path);
                jSONWriter.popPath(list);
                return true;
            }
            if (this.itemType == String.class) {
                writeListStr(jSONWriter, true, list);
            } else {
                writeList(jSONWriter, true, list);
            }
            jSONWriter.popPath(list);
            return true;
        } catch (RuntimeException e6) {
            if (jSONWriter.isIgnoreErrorGetter()) {
                return false;
            }
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        List list = TypeUtils.toList(this.function.apply(t9));
        if (list == null) {
            jSONWriter.writeNull();
            return;
        }
        int i9 = 0;
        Class<?> cls = null;
        if (jSONWriter.jsonb) {
            int size = list.size();
            jSONWriter.startArray(size);
            ObjectWriter itemWriter = null;
            while (i9 < size) {
                Object obj = list.get(i9);
                if (obj == null) {
                    jSONWriter.writeNull();
                } else {
                    Class<?> cls2 = obj.getClass();
                    if (cls2 != cls) {
                        itemWriter = getItemWriter(jSONWriter, cls2);
                        cls = cls2;
                    }
                    itemWriter.write(jSONWriter, obj);
                }
                i9++;
            }
            return;
        }
        jSONWriter.startArray();
        ObjectWriter itemWriter2 = null;
        while (i9 < list.size()) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            Object obj2 = list.get(i9);
            if (obj2 == null) {
                jSONWriter.writeNull();
            } else {
                Class<?> cls3 = obj2.getClass();
                if (cls3 != cls) {
                    itemWriter2 = getItemWriter(jSONWriter, cls3);
                    cls = cls3;
                }
                itemWriter2.write(jSONWriter, obj2);
            }
            i9++;
        }
        jSONWriter.endArray();
    }
}
