package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplNumberArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplNumberArray INSTANCE = new ObjectReaderImplNumberArray();

    public ObjectReaderImplNumberArray() {
        super(Number[].class);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        Number[] numberArr = new Number[collection.size()];
        int i10 = 0;
        for (Object objApply : collection) {
            if (objApply != null && !(objApply instanceof Number)) {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(objApply.getClass(), Number.class);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to Number ", objApply.getClass());
                    return null;
                }
                objApply = typeConvert.apply(objApply);
            }
            numberArr[i10] = (Number) objApply;
            i10++;
        }
        return numberArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Number[] numberArr = new Number[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            numberArr[i10] = jSONReader.readNumber();
        }
        return numberArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            C1569c.m6258a(jSONReader.info("TODO"));
            return null;
        }
        Number[] numberArr = new Number[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i11 = i10 + 1;
            if (i11 - numberArr.length > 0) {
                int length = numberArr.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                numberArr = (Number[]) Arrays.copyOf(numberArr, i12);
            }
            numberArr[i10] = jSONReader.readNumber();
            i10 = i11;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(numberArr, i10);
    }
}
