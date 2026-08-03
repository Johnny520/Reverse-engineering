package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplDoubleValueArray extends ObjectReaderPrimitive {
    static final ObjectReaderImplDoubleValueArray INSTANCE = new ObjectReaderImplDoubleValueArray(null);
    static final long TYPE_HASH = Fnv.hashCode64("[D");
    final Function<double[], Object> builder;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplDoubleValueArray(Function<double[], Object> function) {
        super(double[].class);
        this.builder = function;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object createInstance(Collection collection, long j3) {
        double dDoubleValue;
        double[] dArr = new double[collection.size()];
        int i9 = 0;
        for (Object obj : collection) {
            if (obj == null) {
                dDoubleValue = 0.0d;
            } else if (obj instanceof Number) {
                dDoubleValue = ((Number) obj).doubleValue();
            } else {
                Function typeConvert = JSONFactory.defaultObjectReaderProvider.getTypeConvert(obj.getClass(), Double.TYPE);
                if (typeConvert == null) {
                    C0086a.m450i(obj.getClass(), "can not cast to double ");
                    return null;
                }
                dDoubleValue = ((Double) typeConvert.apply(obj)).doubleValue();
            }
            dArr[i9] = dDoubleValue;
            i9++;
        }
        Function<double[], Object> function = this.builder;
        return function != null ? function.apply(dArr) : dArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != TYPE_HASH) {
            C0086a.m450i(jSONReader.getString(), "not support autoType : ");
            return null;
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        double[] dArr = new double[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            dArr[i9] = jSONReader.readDoubleValue();
        }
        Function<double[], Object> function = this.builder;
        return function != null ? function.apply(dArr) : dArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.readIfNull()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            if (!jSONReader.isString()) {
                C0086a.m464w(jSONReader.info("TODO"));
                return null;
            }
            String string = jSONReader.readString();
            if (string.isEmpty()) {
                return null;
            }
            C0086a.m464w(jSONReader.info("not support input ".concat(string)));
            return null;
        }
        double[] dArrCopyOf = new double[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            if (jSONReader.isEnd()) {
                C0086a.m464w(jSONReader.info("input end"));
                return null;
            }
            int i10 = i9 + 1;
            if (i10 - dArrCopyOf.length > 0) {
                int length = dArrCopyOf.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                dArrCopyOf = Arrays.copyOf(dArrCopyOf, i11);
            }
            dArrCopyOf[i9] = jSONReader.readDoubleValue();
            i9 = i10;
        }
        jSONReader.nextIfComma();
        double[] dArrCopyOf2 = Arrays.copyOf(dArrCopyOf, i9);
        Function<double[], Object> function = this.builder;
        return function != null ? function.apply(dArrCopyOf2) : dArrCopyOf2;
    }
}
