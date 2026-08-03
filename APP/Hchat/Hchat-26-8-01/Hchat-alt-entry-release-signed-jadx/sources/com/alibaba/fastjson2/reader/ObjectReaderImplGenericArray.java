package com.alibaba.fastjson2.reader;

import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.IOUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p012ah.C0086a;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class ObjectReaderImplGenericArray implements ObjectReader {
    final Class arrayClass;
    final String arrayClassName;
    final long arrayClassNameHash;
    final Type arrayType;
    final Class<?> componentClass;
    ObjectReader itemObjectReader;
    final Type itemType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderImplGenericArray(GenericArrayType genericArrayType) {
        this.arrayType = genericArrayType;
        this.arrayClass = TypeUtils.getClass(genericArrayType);
        Type genericComponentType = genericArrayType.getGenericComponentType();
        this.itemType = genericComponentType;
        Class<?> mapping = TypeUtils.getMapping(genericComponentType);
        this.componentClass = mapping;
        String str = "[" + TypeUtils.getTypeName((Class) mapping);
        this.arrayClassName = str;
        this.arrayClassNameHash = Fnv.hashCode64(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readJSONBObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        if (jSONReader.nextIfMatch(JSONB.Constants.BC_TYPED_ANY) && jSONReader.readTypeHashCode() != this.arrayClassNameHash) {
            C0086a.m464w(AbstractC4855en.m9263g("not support input typeName ", jSONReader.getString()));
            return null;
        }
        int iStartArray = jSONReader.startArray();
        if (iStartArray > 0 && this.itemObjectReader == null) {
            this.itemObjectReader = jSONReader.context.getObjectReader(this.itemType);
        }
        Object objNewInstance = Array.newInstance(this.componentClass, iStartArray);
        int i9 = 0;
        while (i9 < iStartArray) {
            JSONReader jSONReader2 = jSONReader;
            Array.set(objNewInstance, i9, this.itemObjectReader.readJSONBObject(jSONReader2, this.itemType, null, 0L));
            i9++;
            jSONReader = jSONReader2;
        }
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public Object readObject(JSONReader jSONReader, Type type, Object obj, long j3) {
        Object string;
        if (this.itemObjectReader == null) {
            this.itemObjectReader = jSONReader.context.getObjectReader(this.itemType);
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
                return (jSONReader2.features(j3) & JSONReader.Feature.Base64StringAsByteArray.mask) != 0 ? IOUtils.decodeBase64(jSONReader2.readString()) : jSONReader2.readBinary();
            }
            if (jSONReader2.readString().isEmpty()) {
                return null;
            }
            C0086a.m464w(jSONReader2.info());
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (cCurrent != '[') {
            C0086a.m464w(jSONReader2.info());
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
                    C0086a.m464w(jSONReader2.info("TODO : " + this.itemType));
                    return null;
                }
                string = jSONReader2.readString();
            }
            arrayList.add(string);
            jSONReader2.nextIfComma();
        }
        jSONReader2.nextIfComma();
        Object objNewInstance = Array.newInstance(this.componentClass, arrayList.size());
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            Array.set(objNewInstance, i9, arrayList.get(i9));
        }
        return objNewInstance;
    }
}
