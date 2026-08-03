package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterListStrFunc<T> extends FieldWriter<T> {
    final Function<T, List> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterListStrFunc(String str, int i9, long j3, String str2, String str3, Method method, Function<T, List> function, Type type, Class cls) {
        super(str, i9, j3, str2, str3, type, cls, null, method);
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
        int i9 = 0;
        try {
            List list = TypeUtils.toList(this.function.apply(t9));
            long features = this.features | jSONWriter.getFeatures();
            if (list == null) {
                if (((JSONWriter.Feature.WriteNulls.mask | JSONWriter.Feature.NullAsDefaultValue.mask | JSONWriter.Feature.WriteNullListAsEmpty.mask) & features) == 0) {
                    return false;
                }
                writeFieldName(jSONWriter);
                jSONWriter.writeArrayNull(features);
                return true;
            }
            if ((features & JSONWriter.Feature.NotWriteEmptyArray.mask) != 0 && list.isEmpty()) {
                return false;
            }
            writeFieldName(jSONWriter);
            if (jSONWriter.jsonb) {
                int size = list.size();
                jSONWriter.startArray(size);
                while (i9 < size) {
                    String str = (String) list.get(i9);
                    if (str == null) {
                        jSONWriter.writeNull();
                    } else {
                        jSONWriter.writeString(str);
                    }
                    i9++;
                }
                return true;
            }
            jSONWriter.startArray();
            while (i9 < list.size()) {
                if (i9 != 0) {
                    jSONWriter.writeComma();
                }
                String str2 = (String) list.get(i9);
                if (str2 == null) {
                    jSONWriter.writeNull();
                } else {
                    jSONWriter.writeString(str2);
                }
                i9++;
            }
            jSONWriter.endArray();
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
        if (jSONWriter.jsonb) {
            int size = list.size();
            jSONWriter.startArray(size);
            while (i9 < size) {
                String str = (String) list.get(i9);
                if (str == null) {
                    jSONWriter.writeNull();
                } else {
                    jSONWriter.writeString(str);
                }
                i9++;
            }
            return;
        }
        jSONWriter.startArray();
        while (i9 < list.size()) {
            if (i9 != 0) {
                jSONWriter.writeComma();
            }
            String str2 = (String) list.get(i9);
            if (str2 == null) {
                jSONWriter.writeNull();
            } else {
                jSONWriter.writeString(str2);
            }
            i9++;
        }
        jSONWriter.endArray();
    }
}
