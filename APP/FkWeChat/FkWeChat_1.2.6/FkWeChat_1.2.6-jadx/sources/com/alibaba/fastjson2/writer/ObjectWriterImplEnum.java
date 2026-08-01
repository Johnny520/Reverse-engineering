package com.alibaba.fastjson2.writer;

import com.alibaba.fastjson2.C1565a;
import com.alibaba.fastjson2.JSONB;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.Enum;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplEnum<E extends Enum<E>> extends ObjectWriterPrimitiveImpl {
    final String[] annotationNames;
    final Class defineClass;
    final Enum[] enumConstants;
    final Class enumType;
    final long features;
    final long[] hashCodes;
    byte[][] jsonbNames;
    final String[] names;
    long typeNameHash;
    byte[] typeNameJSONB;
    final Member valueField;

    /* JADX WARN: Multi-variable type inference failed */
    public ObjectWriterImplEnum(Class cls, Class cls2, Member member, String[] strArr, long j10) {
        this.defineClass = cls;
        this.enumType = cls2;
        this.features = j10;
        this.valueField = member;
        if (member instanceof AccessibleObject) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        Enum[] enumArr = (Enum[]) cls2.getEnumConstants();
        this.enumConstants = enumArr;
        this.names = new String[enumArr.length];
        this.hashCodes = new long[enumArr.length];
        int i10 = 0;
        while (true) {
            Enum[] enumArr2 = this.enumConstants;
            if (i10 >= enumArr2.length) {
                this.annotationNames = strArr;
                return;
            }
            String strName = enumArr2[i10].name();
            this.names[i10] = strName;
            this.hashCodes[i10] = Fnv.hashCode64(strName);
            i10++;
        }
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        Enum r82 = (Enum) obj;
        if (r82 == null) {
            jSONWriter.writeNull();
            return;
        }
        Member member = this.valueField;
        String strName = null;
        if (member != null) {
            try {
                Object objInvoke = member instanceof Field ? ((Field) member).get(obj) : ((Method) member).invoke(obj, null);
                if (objInvoke != obj) {
                    jSONWriter.writeAny(objInvoke);
                    return;
                }
            } catch (Exception e10) {
                C1565a.m6255a("getEnumValue error", e10);
                return;
            }
        }
        long features = jSONWriter.getFeatures(j10 | this.features);
        if ((JSONWriter.Feature.WriteEnumUsingToString.mask & features) != 0) {
            jSONWriter.writeString(r82.toString());
            return;
        }
        if ((features & JSONWriter.Feature.WriteEnumUsingOrdinal.mask) != 0) {
            jSONWriter.writeInt32(r82.ordinal());
            return;
        }
        if (this.annotationNames != null) {
            int iOrdinal = r82.ordinal();
            String[] strArr = this.annotationNames;
            if (iOrdinal < strArr.length) {
                strName = strArr[iOrdinal];
            }
        }
        if (strName == null) {
            strName = r82.name();
        }
        jSONWriter.writeString(strName);
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j10) {
        if (jSONWriter.isWriteTypeInfo(obj, type, j10)) {
            if (this.typeNameJSONB == null) {
                String typeName = TypeUtils.getTypeName(this.enumType);
                this.typeNameJSONB = JSONB.toBytes(typeName);
                this.typeNameHash = Fnv.hashCode64(typeName);
            }
            jSONWriter.writeTypeName(this.typeNameJSONB, this.typeNameHash);
        }
        Enum r22 = (Enum) obj;
        if (jSONWriter.isEnabled(JSONWriter.Feature.WriteEnumUsingToString)) {
            jSONWriter.writeString(r22.toString());
            return;
        }
        if (this.jsonbNames == null) {
            this.jsonbNames = new byte[this.names.length][];
        }
        int iOrdinal = r22.ordinal();
        byte[] bytes = this.jsonbNames[iOrdinal];
        if (bytes == null) {
            bytes = JSONB.toBytes(this.names[iOrdinal]);
            this.jsonbNames[iOrdinal] = bytes;
        }
        jSONWriter.writeRaw(bytes);
    }
}
