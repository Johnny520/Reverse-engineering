package com.alibaba.fastjson2.writer;

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
import p012ah.C0086a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplEnum<E extends Enum<E>> extends ObjectWriterPrimitiveImpl {
    String[] annotationNames;
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.reflect.Member */
    /* JADX WARN: Multi-variable type inference failed */
    public ObjectWriterImplEnum(Class cls, Class cls2, Member member, String[] strArr, long j3) {
        this.defineClass = cls;
        this.enumType = cls2;
        this.features = j3;
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
        int i9 = 0;
        while (true) {
            Enum[] enumArr2 = this.enumConstants;
            if (i9 >= enumArr2.length) {
                this.annotationNames = strArr;
                return;
            }
            String strName = enumArr2[i9].name();
            this.names[i9] = strName;
            this.hashCodes[i9] = Fnv.hashCode64(strName);
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
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
            } catch (Exception e6) {
                C0086a.m465x("getEnumValue error", e6);
                return;
            }
        }
        long features = jSONWriter.getFeatures(j3 | this.features);
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(JSONWriter jSONWriter, Object obj, Object obj2, Type type, long j3) {
        if (jSONWriter.isWriteTypeInfo(obj, type, j3)) {
            if (this.typeNameJSONB == null) {
                String typeName = TypeUtils.getTypeName(this.enumType);
                this.typeNameJSONB = JSONB.toBytes(typeName);
                this.typeNameHash = Fnv.hashCode64(typeName);
            }
            jSONWriter.writeTypeName(this.typeNameJSONB, this.typeNameHash);
        }
        Enum r2 = (Enum) obj;
        if (jSONWriter.isEnabled(JSONWriter.Feature.WriteEnumUsingToString)) {
            jSONWriter.writeString(r2.toString());
            return;
        }
        if (this.jsonbNames == null) {
            this.jsonbNames = new byte[this.names.length][];
        }
        int iOrdinal = r2.ordinal();
        byte[] bytes = this.jsonbNames[iOrdinal];
        if (bytes == null) {
            bytes = JSONB.toBytes(this.names[iOrdinal]);
            this.jsonbNames[iOrdinal] = bytes;
        }
        jSONWriter.writeRaw(bytes);
    }
}
