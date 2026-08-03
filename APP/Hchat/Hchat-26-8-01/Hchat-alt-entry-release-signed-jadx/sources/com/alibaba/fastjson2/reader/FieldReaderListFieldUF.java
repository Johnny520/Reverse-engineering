package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.util.JDKUtils;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderListFieldUF<T> extends FieldReaderList<T, Object> {
    final long fieldOffset;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderListFieldUF(String str, Type type, Class cls, Type type2, Class cls2, int i9, long j3, String str2, Locale locale, Collection collection, Field field) {
        super(str, type, cls, type2, cls2, i9, j3, str2, locale, collection, null, field, null);
        this.fieldOffset = JDKUtils.UNSAFE.objectFieldOffset(field);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(Object obj, Object obj2) {
        JDKUtils.UNSAFE.putObject(obj, this.fieldOffset, obj2);
    }
}
