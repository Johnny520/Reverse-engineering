package com.alibaba.fastjson2.reader;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicReference;
import p012ah.C0086a;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderAtomicReferenceField<T> extends FieldReaderAtomicReference<T> {
    final boolean readOnly;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderAtomicReferenceField(String str, Type type, Class cls, int i9, String str2, Field field) {
        super(str, type, cls, i9, 0L, str2, null, field);
        this.readOnly = Modifier.isFinal(field.getModifiers());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            boolean z9 = this.readOnly;
            Field field = this.field;
            if (z9) {
                ((AtomicReference) field.get(t9)).set(obj);
            } else {
                field.set(t9, new AtomicReference(obj));
            }
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0921a.m2255r(new StringBuilder("set "), this.fieldName, " error"), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }
}
