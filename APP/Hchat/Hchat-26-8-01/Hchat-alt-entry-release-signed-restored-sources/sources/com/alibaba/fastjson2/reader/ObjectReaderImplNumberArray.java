package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplNumberArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplNumberArray INSTANCE = new ObjectReaderImplNumberArray();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplNumberArray() {
        super(Number[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:16:0x003e */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        Number[] numberArr = new Number[collection.size()];
        int i9 = 0;
        for (Object objApply : collection) {
            if (objApply != null && !(objApply instanceof Number)) {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(objApply.getClass(), Number.class);
                if (typeConvert == null) {
                    C0086a.m450i(objApply.getClass(), "can not cast to Number ");
                    return null;
                }
                objApply = typeConvert.apply(objApply);
            }
            numberArr[i9] = (Number) objApply;
            i9++;
        }
        return numberArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Number[] numberArr = new Number[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            numberArr[i9] = jSONReader.readNumber();
        }
        return numberArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            C0086a.m464w(jSONReader.info("TODO"));
            return null;
        }
        Number[] numberArr = new Number[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i10 = i9 + 1;
            if (i10 - numberArr.length > 0) {
                int length = numberArr.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                numberArr = (Number[]) Arrays.copyOf(numberArr, i11);
            }
            numberArr[i9] = jSONReader.readNumber();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(numberArr, i9);
    }
}
