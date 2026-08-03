package com.alibaba.fastjson2.writer;

import java.lang.reflect.Method;
import java.util.function.Predicate;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldWriterBoolValFunc extends FieldWriterBoolVal {
    final Predicate function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldWriterBoolValFunc(String str, int i9, long j3, String str2, String str3, Method method, Predicate predicate) {
        super(str, i9, j3, str2, str3, Boolean.class, Boolean.class, null, method);
        this.function = predicate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.FieldWriter
    public Object getFieldValue(Object obj) {
        return Boolean.valueOf(this.function.test(obj));
    }
}
