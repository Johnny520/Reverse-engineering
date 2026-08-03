package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.function.ObjCharConsumer;
import java.lang.reflect.Method;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class FieldReaderCharValueFunc<T> extends FieldReader<T> {
    final ObjCharConsumer<T> function;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Illegal instructions before constructor call */
    public FieldReaderCharValueFunc(String str, int i9, String str2, Character ch2, Method method, ObjCharConsumer<T> objCharConsumer) {
        Class cls = Character.TYPE;
        super(str, cls, cls, i9, 0L, str2, null, ch2, method, null);
        this.function = objCharConsumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, Object obj) {
        char cCharValue;
        if (obj instanceof String) {
            cCharValue = ((String) obj).charAt(0);
        } else {
            if (!(obj instanceof Character)) {
                C0086a.m464w("cast to char error");
                return;
            }
            cCharValue = ((Character) obj).charValue();
        }
        accept((Object) t9, cCharValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void readFieldValue(JSONReader jSONReader, T t9) {
        char charValue = jSONReader.readCharValue();
        if (charValue == 0 && jSONReader.wasNull()) {
            return;
        }
        this.function.accept(t9, charValue);
    }

    /* JADX DEBUG: Method merged with bridge method: readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.FieldReader
    public String readFieldValue(JSONReader jSONReader) {
        return jSONReader.readString();
    }

    @Override // com.alibaba.fastjson2.reader.FieldReader
    public void accept(T t9, char c10) {
        this.function.accept(t9, c10);
    }
}
