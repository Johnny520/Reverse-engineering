package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderImplCharValueArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplCharValueArray INSTANCE = new ObjectReaderImplCharValueArray(null);
    static final long TYPE_HASH = Fnv.hashCode64("[C");
    final Function<char[], Object> builder;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplCharValueArray(Function<char[], Object> function) {
        super(char[].class);
        this.builder = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != TYPE_HASH) {
            C0086a.m450i(jSONReader.getString(), "not support autoType : ");
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
        for (int i9 = 0; i9 < iStartArray; i9++) {
            if (jSONReader.isInt()) {
                cArr[i9] = (char) jSONReader.readInt32Value();
            } else {
                cArr[i9] = jSONReader.readString().charAt(0);
            }
        }
        Function<char[], Object> function = this.builder;
        return function != null ? function.apply(cArr) : cArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (jSONReader.current() == '\"') {
            char[] charArray = jSONReader.readString().toCharArray();
            Function<char[], Object> function = this.builder;
            return function != null ? function.apply(charArray) : charArray;
        }
        if (!jSONReader.nextIfArrayStart()) {
            C0086a.m464w(jSONReader.info("TODO"));
            return null;
        }
        char[] cArrCopyOf = new char[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i10 = i9 + 1;
            if (i10 - cArrCopyOf.length > 0) {
                int length = cArrCopyOf.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                cArrCopyOf = Arrays.copyOf(cArrCopyOf, i11);
            }
            if (jSONReader.isInt()) {
                cArrCopyOf[i9] = (char) jSONReader.readInt32Value();
            } else {
                String string = jSONReader.readString();
                cArrCopyOf[i9] = string == null ? (char) 0 : string.charAt(0);
            }
            i9 = i10;
        }
        jSONReader.nextIfComma();
        char[] cArrCopyOf2 = Arrays.copyOf(cArrCopyOf, i9);
        Function<char[], Object> function2 = this.builder;
        return function2 != null ? function2.apply(cArrCopyOf2) : cArrCopyOf2;
    }
}
