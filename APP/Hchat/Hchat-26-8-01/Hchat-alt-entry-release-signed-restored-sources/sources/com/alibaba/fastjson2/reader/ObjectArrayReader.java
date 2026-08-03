package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectArrayReader extends ObjectReaderPrimitive {
    public static final ObjectArrayReader INSTANCE = new ObjectArrayReader();
    public static final long TYPE_HASH_CODE = Fnv.hashCode64("[O");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectArrayReader() {
        super(Object[].class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: createInstance(Ljava/util/Collection;J)Ljava/lang/Object; */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object[] createInstance(Collection collection, long j3) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i9 = 0;
        while (it.hasNext()) {
            objArr[i9] = it.next();
            i9++;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public /* bridge */ /* synthetic */ Class getObjectClass() {
        return super.getObjectClass();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReaderPrimitive, com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Object objValueOf;
        ObjectReader objectReaderCheckAutoType;
        if (jSONReader.getType() == -110 && (objectReaderCheckAutoType = jSONReader.checkAutoType(Object[].class, TYPE_HASH_CODE, j3)) != this) {
            return objectReaderCheckAutoType.readJSONBObject(jSONReader, type, obj, j3);
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray == -1) {
            return null;
        }
        Object[] objArr = new Object[iStartArray];
        for (int i9 = 0; i9 < iStartArray; i9++) {
            byte type2 = jSONReader.getType();
            if (type2 >= 73 && type2 <= 125) {
                objValueOf = jSONReader.readString();
            } else if (type2 == -110) {
                ObjectReader objectReaderCheckAutoType2 = jSONReader.checkAutoType(Object.class, 0L, j3);
                objValueOf = objectReaderCheckAutoType2 != null ? objectReaderCheckAutoType2.readJSONBObject(jSONReader, null, null, j3) : jSONReader.readAny();
            } else if (type2 == -81) {
                jSONReader.next();
                objValueOf = null;
            } else if (type2 == -79) {
                jSONReader.next();
                objValueOf = Boolean.TRUE;
            } else if (type2 == -80) {
                jSONReader.next();
                objValueOf = Boolean.FALSE;
            } else {
                objValueOf = type2 == -66 ? Long.valueOf(jSONReader.readInt64Value()) : jSONReader.readAny();
            }
            objArr[i9] = objValueOf;
        }
        return objArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Object string;
        if (jSONReader.nextIfNullOrEmptyString()) {
            return null;
        }
        if (!jSONReader.nextIfArrayStart()) {
            C0086a.m464w(jSONReader.info("TODO"));
            return null;
        }
        Object[] objArrCopyOf = new Object[16];
        int i9 = 0;
        while (!jSONReader.nextIfArrayEnd()) {
            int i10 = i9 + 1;
            if (i10 - objArrCopyOf.length > 0) {
                int length = objArrCopyOf.length;
                int i11 = length + (length >> 1);
                if (i11 - i10 < 0) {
                    i11 = i10;
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i11);
            }
            char cCurrent = jSONReader.current();
            if (cCurrent == '\"') {
                string = jSONReader.readString();
            } else if (cCurrent == '+') {
                string = jSONReader.readNumber();
            } else if (cCurrent != 'S') {
                if (cCurrent == '[') {
                    string = jSONReader.readArray();
                } else if (cCurrent == 'f') {
                    string = Boolean.valueOf(jSONReader.readBoolValue());
                } else if (cCurrent == 'n') {
                    jSONReader.readNull();
                    string = null;
                } else if (cCurrent != 't') {
                    if (cCurrent != '{') {
                        if (cCurrent != '-' && cCurrent != '.') {
                            switch (cCurrent) {
                                case '0':
                                case '1':
                                case '2':
                                case '3':
                                case '4':
                                case '5':
                                case '6':
                                case '7':
                                case '8':
                                case '9':
                                    break;
                                default:
                                    C0086a.m464w(jSONReader.info());
                                    return null;
                            }
                        }
                        string = jSONReader.readNumber();
                    } else {
                        string = jSONReader.readObject();
                    }
                }
            } else {
                if (!jSONReader.nextIfSet()) {
                    C0086a.m450i(jSONReader.info(), "Expected Set format but parsing failed: ");
                    return null;
                }
                string = jSONReader.read((Class<Object>) HashSet.class);
            }
            objArrCopyOf[i9] = string;
            i9 = i10;
        }
        jSONReader.nextIfComma();
        return Arrays.copyOf(objArrCopyOf, i9);
    }
}
