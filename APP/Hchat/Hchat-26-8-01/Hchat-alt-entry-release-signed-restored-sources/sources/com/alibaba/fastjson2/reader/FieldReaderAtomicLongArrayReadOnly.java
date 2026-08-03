package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongArray;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderAtomicLongArrayReadOnly<T> extends FieldReader<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderAtomicLongArrayReadOnly(String str, Class cls, int i9, Method method) {
        super(str, cls, cls, i9, 0L, null, null, null, method, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            AtomicLongArray atomicLongArray = (AtomicLongArray) this.method.invoke(t9, null);
            int i9 = 0;
            if (obj instanceof AtomicLongArray) {
                AtomicLongArray atomicLongArray2 = (AtomicLongArray) obj;
                while (i9 < atomicLongArray2.length()) {
                    atomicLongArray.set(i9, atomicLongArray2.get(i9));
                    i9++;
                }
                return;
            }
            List list = (List) obj;
            while (i9 < list.size()) {
                atomicLongArray.set(i9, TypeUtils.toIntValue(list.get(i9)));
                i9++;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        if (jSONReader.readIfNull()) {
            return;
        }
        try {
            AtomicLongArray atomicLongArray = (AtomicLongArray) this.method.invoke(t9, null);
            if (jSONReader.nextIfArrayStart()) {
                int i9 = 0;
                while (!jSONReader.nextIfArrayEnd()) {
                    long int64Value = jSONReader.readInt64Value();
                    if (atomicLongArray != null && i9 < atomicLongArray.length()) {
                        atomicLongArray.set(i9, int64Value);
                    }
                    i9++;
                }
            }
        } catch (Exception e6) {
            C0086a.m465x(AbstractC0255e.m1024m(new StringBuilder("set "), this.fieldName, " error", jSONReader), e6);
        }
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public Object readFieldValue(JSONReader jSONReader) {
        if (jSONReader.nextIfNull()) {
            return null;
        }
        return jSONReader.readArray(Long.class);
    }
}
