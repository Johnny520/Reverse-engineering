package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.JSONWriter;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterCalendarFunc<T> extends FieldWriterDate<T> {
    final Function<T, Calendar> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterCalendarFunc(String str, int i9, long j3, String str2, String str3, Method method, Function<T, Calendar> function) {
        super(str, i9, j3, str2, str3, Calendar.class, Calendar.class, null, method);
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
        Calendar calendarApply = this.function.apply(t9);
        if (calendarApply != null) {
            writeDate(jSONWriter, calendarApply.getTimeInMillis());
            return true;
        }
        if (((this.features | jSONWriter.getFeatures()) & JSONWriter.Feature.WriteNulls.mask) == 0) {
            return false;
        }
        writeFieldName(jSONWriter);
        jSONWriter.writeNull();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public void writeValue(JSONWriter jSONWriter, T t9) {
        Calendar calendarApply = this.function.apply(t9);
        if (calendarApply == null) {
            jSONWriter.writeNull();
        } else {
            writeDate(jSONWriter, false, calendarApply.getTimeInMillis());
        }
    }
}
