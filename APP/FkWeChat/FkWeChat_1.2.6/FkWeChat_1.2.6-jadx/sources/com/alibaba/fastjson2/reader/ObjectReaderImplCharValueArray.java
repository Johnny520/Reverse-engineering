package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplCharValueArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplCharValueArray INSTANCE = new ObjectReaderImplCharValueArray(null);
    static final long TYPE_HASH = Fnv.hashCode64("[C");
    final Function<char[], Object> builder;

    public ObjectReaderImplCharValueArray(Function<char[], Object> function) {
        super(char[].class);
        this.builder = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != TYPE_HASH) {
            C1607k.m6296a("not support autoType : ", jSONReader.getString());
            return null;
        }
        if (jSONReader.isString()) {
            return jSONReader.readString().toCharArray();
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        char[] cArr = new char[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            if (jSONReader.isInt()) {
                cArr[i10] = (char) jSONReader.readInt32Value();
            } else {
                cArr[i10] = jSONReader.readString().charAt(0);
            }
        }
        Function<char[], Object> function = this.builder;
        return function != null ? function.apply(cArr) : cArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.current() == '\"') {
            char[] charArray = jSONReader.readString().toCharArray();
            Function<char[], Object> function = this.builder;
            return function != null ? function.apply(charArray) : charArray;
        }
        if (!jSONReader.nextIfArrayStart()) {
            C1569c.m6258a(jSONReader.info("TODO"));
            return null;
        }
        char[] cArrCopyOf = new char[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i11 = i10 + 1;
            if (i11 - cArrCopyOf.length > 0) {
                int length = cArrCopyOf.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                cArrCopyOf = Arrays.copyOf(cArrCopyOf, i12);
            }
            if (jSONReader.isInt()) {
                cArrCopyOf[i10] = (char) jSONReader.readInt32Value();
            } else {
                String string = jSONReader.readString();
                cArrCopyOf[i10] = string == null ? (char) 0 : string.charAt(0);
            }
            i10 = i11;
        }
        jSONReader.nextIfComma();
        char[] cArrCopyOf2 = Arrays.copyOf(cArrCopyOf, i10);
        Function<char[], Object> function2 = this.builder;
        return function2 != null ? function2.apply(cArrCopyOf2) : cArrCopyOf2;
    }
}
