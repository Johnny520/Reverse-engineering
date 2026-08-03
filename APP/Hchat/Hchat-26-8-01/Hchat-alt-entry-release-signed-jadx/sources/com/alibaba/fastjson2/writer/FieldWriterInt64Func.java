package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterInt64Func<T> extends FieldWriterInt64<T> {
    final Function<T, Long> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterInt64Func(String str, int i9, long j3, String str2, String str3, Method method, Function<T, Long> function) {
        super(str, i9, j3, str2, str3, Long.class, null, method);
        this.function = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(T t9) {
        return this.function.apply(t9);
    }
}
