package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class FieldReaderAnySetter<T> extends FieldReaderObject<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReaderAnySetter(Type type, Class cls, int i9, long j3, String str, Method method) {
        super("$$any$$", type, cls, i9, j3, str, null, null, method, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        throw new UnsupportedOperationException();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void acceptExtra(Object obj, String str, Object obj2) {
        try {
            this.method.invoke(obj, str, obj2);
        } catch (Exception unused) {
            C0086a.m464w("any set error");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public ObjectReader getItemObjectReader(JSONReader jSONReader) {
        if (this.itemReader != null) {
            return this.itemReader;
        }
        ObjectReader objectReader = jSONReader.getObjectReader(this.fieldType);
        this.itemReader = objectReader;
        return objectReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public boolean isReadOnly() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void processExtra(JSONReader jSONReader, Object obj) {
        try {
            this.method.invoke(obj, jSONReader.getFieldName(), getItemObjectReader(jSONReader).readObject(jSONReader, this.fieldType, this.fieldName, 0L));
        } catch (Exception e6) {
            C0086a.m465x(jSONReader.info("any set error"), e6);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReaderObject, com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        throw new UnsupportedOperationException();
    }
}
