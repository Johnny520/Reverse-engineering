package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1607k;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplDoubleValueArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplDoubleValueArray INSTANCE = new ObjectReaderImplDoubleValueArray(null);
    static final long TYPE_HASH = Fnv.hashCode64("[D");
    final Function<double[], Object> builder;

    public ObjectReaderImplDoubleValueArray(Function<double[], Object> function) {
        super(double[].class);
        this.builder = function;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j10) {
        double dDoubleValue;
        double[] dArr = new double[collection.size()];
        int i10 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                dDoubleValue = 0.0d;
            } else if (obj instanceof Number) {
                dDoubleValue = ((Number) obj).doubleValue();
            } else {
                Function typeConvert = JSONFactory.getDefaultObjectReaderProvider().getTypeConvert(obj.getClass(), Double.TYPE);
                if (typeConvert == null) {
                    C1607k.m6296a("can not cast to double ", obj.getClass());
                    return null;
                }
                dDoubleValue = ((Double) typeConvert.apply(obj)).doubleValue();
            }
            dArr[i10] = dDoubleValue;
            i10++;
        }
        Function<double[], Object> function = this.builder;
        return function != null ? function.apply(dArr) : dArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != TYPE_HASH) {
            C1607k.m6296a("not support autoType : ", jSONReader.getString());
            return null;
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        double[] dArr = new double[iStartArray];
        for (int i10 = 0; i10 < iStartArray; i10++) {
            dArr[i10] = jSONReader.readDoubleValue();
        }
        Function<double[], Object> function = this.builder;
        return function != null ? function.apply(dArr) : dArr;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (!jSONReader.isString()) {
                C1569c.m6258a(jSONReader.info("TODO"));
                return null;
            }
            String string = jSONReader.readString();
            if (string.isEmpty()) {
                return null;
            }
            C1569c.m6258a(jSONReader.info("not support input ".concat(string)));
            return null;
        }
        double[] dArrCopyOf = new double[16];
        int i10 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C1569c.m6258a(jSONReader.info("input end"));
                return null;
            }
            int i11 = i10 + 1;
            if (i11 - dArrCopyOf.length > 0) {
                int length = dArrCopyOf.length;
                int i12 = length + (length >> 1);
                if (i12 - i11 < 0) {
                    i12 = i11;
                }
                dArrCopyOf = Arrays.copyOf(dArrCopyOf, i12);
            }
            dArrCopyOf[i10] = jSONReader.readDoubleValue();
            i10 = i11;
        }
        jSONReader.nextIfComma();
        double[] dArrCopyOf2 = Arrays.copyOf(dArrCopyOf, i10);
        Function<double[], Object> function = this.builder;
        return function != null ? function.apply(dArrCopyOf2) : dArrCopyOf2;
    }
}
