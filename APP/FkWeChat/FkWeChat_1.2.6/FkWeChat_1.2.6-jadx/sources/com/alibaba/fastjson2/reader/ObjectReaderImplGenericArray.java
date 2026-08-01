package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.C1569c;
import com.alibaba.fastjson2.C1605j;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Base64;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplGenericArray implements ObjectReader {
    final Class arrayClass;
    final String arrayClassName;
    final long arrayClassNameHash;
    final Type arrayType;
    final Class<?> componentClass;
    ObjectReader itemObjectReader;
    final Type itemType;

    public ObjectReaderImplGenericArray(GenericArrayType genericArrayType) {
        this.arrayType = genericArrayType;
        this.arrayClass = TypeUtils.getClass(genericArrayType);
        Type genericComponentType = genericArrayType.getGenericComponentType();
        this.itemType = genericComponentType;
        Class<?> mapping = TypeUtils.getMapping(genericComponentType);
        this.componentClass = mapping;
        String str = "[" + TypeUtils.getTypeName(mapping);
        this.arrayClassName = str;
        this.arrayClassNameHash = Fnv.hashCode64(str);
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != this.arrayClassNameHash) {
            C1605j.m6294a("not support input typeName ", jSONReader.getString());
            return null;
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray > 0 && this.itemObjectReader == null) {
            this.itemObjectReader = jSONReader.getContext().getObjectReader(this.itemType);
        }
        Object objNewInstance = Array.newInstance(this.componentClass, iStartArray);
        int i10 = 0;
        while (i10 < iStartArray) {
            JSONReader jSONReader2 = jSONReader;
            Array.set(objNewInstance, i10, this.itemObjectReader.readJSONBObject(jSONReader2, this.itemType, null, 0L));
            i10++;
            jSONReader = jSONReader2;
        }
        return objNewInstance;
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j10) {
        Object string;
        if (this.itemObjectReader == null) {
            this.itemObjectReader = jSONReader.getContext().getObjectReader(this.itemType);
        }
        if (jSONReader.jsonb) {
            return readJSONBObject(jSONReader, type, obj, 0L);
        }
        JSONReader jSONReader2 = jSONReader;
        if (jSONReader2.readIfNull()) {
            return null;
        }
        char cCurrent = jSONReader2.current();
        if (cCurrent == '\"') {
            if ((type instanceof GenericArrayType) && ((GenericArrayType) type).getGenericComponentType() == Byte.TYPE) {
                if ((jSONReader2.features(j10) & JSONReader.Feature.Base64StringAsByteArray.mask) == 0) {
                    return jSONReader2.readBinary();
                }
                return Base64.getDecoder().decode(jSONReader2.readString());
            }
            if (jSONReader2.readString().isEmpty()) {
                return null;
            }
            C1569c.m6258a(jSONReader2.info());
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (cCurrent != '[') {
            C1569c.m6258a(jSONReader2.info());
            return null;
        }
        jSONReader2.next();
        while (!jSONReader2.nextIfArrayEnd()) {
            JSONReader jSONReader3 = jSONReader2;
            ObjectReader objectReader = this.itemObjectReader;
            Type type2 = this.itemType;
            if (objectReader != null) {
                string = objectReader.readObject(jSONReader3, type2, null, 0L);
                jSONReader2 = jSONReader3;
            } else {
                jSONReader2 = jSONReader3;
                if (type2 != String.class) {
                    C1569c.m6258a(jSONReader2.info("TODO : " + this.itemType));
                    return null;
                }
                string = jSONReader2.readString();
            }
            arrayList.add(string);
            jSONReader2.nextIfComma();
        }
        jSONReader2.nextIfComma();
        Object objNewInstance = Array.newInstance(this.componentClass, arrayList.size());
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Array.set(objNewInstance, i10, arrayList.get(i10));
        }
        return objNewInstance;
    }
}
