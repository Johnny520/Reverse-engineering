package com.alibaba.fastjson2.writer;

import java.lang.Enum;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectWriterImplEnum<E extends java.lang.Enum<E>> extends com.alibaba.fastjson2.writer.ObjectWriterPrimitiveImpl {
    java.lang.String[] annotationNames;
    final java.lang.Class defineClass;
    final java.lang.Enum[] enumConstants;
    final java.lang.Class enumType;
    final long features;
    final long[] hashCodes;
    byte[][] jsonbNames;
    final java.lang.String[] names;
    long typeNameHash;
    byte[] typeNameJSONB;
    final java.lang.reflect.Member valueField;

    public ObjectWriterImplEnum(java.lang.Class r1, java.lang.Class r2, java.lang.reflect.Member r3, java.lang.String[] r4, long r5) {
            r0 = this;
            r0.<init>()
            r0.defineClass = r1
            r0.enumType = r2
            r0.features = r5
            r0.valueField = r3
            boolean r1 = r3 instanceof java.lang.reflect.AccessibleObject
            if (r1 == 0) goto L15
            java.lang.reflect.AccessibleObject r3 = (java.lang.reflect.AccessibleObject) r3     // Catch: java.lang.Throwable -> L15
            r1 = 1
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L15
        L15:
            java.lang.Object[] r1 = r2.getEnumConstants()
            java.lang.Enum[] r1 = (java.lang.Enum[]) r1
            r0.enumConstants = r1
            int r2 = r1.length
            java.lang.String[] r2 = new java.lang.String[r2]
            r0.names = r2
            int r1 = r1.length
            long[] r1 = new long[r1]
            r0.hashCodes = r1
            r1 = 0
        L28:
            java.lang.Enum[] r2 = r0.enumConstants
            int r3 = r2.length
            if (r1 >= r3) goto L42
            r2 = r2[r1]
            java.lang.String r2 = r2.name()
            java.lang.String[] r3 = r0.names
            r3[r1] = r2
            long[] r3 = r0.hashCodes
            long r5 = com.alibaba.fastjson2.util.Fnv.hashCode64(r2)
            r3[r1] = r5
            int r1 = r1 + 1
            goto L28
        L42:
            r0.annotationNames = r4
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void write(com.alibaba.fastjson2.JSONWriter r6, java.lang.Object r7, java.lang.Object r8, java.lang.reflect.Type r9, long r10) {
            r5 = this;
            r8 = r7
            java.lang.Enum r8 = (java.lang.Enum) r8
            if (r8 != 0) goto L9
            r6.writeNull()
            return
        L9:
            java.lang.reflect.Member r9 = r5.valueField
            r0 = 0
            if (r9 == 0) goto L2d
            boolean r1 = r9 instanceof java.lang.reflect.Field     // Catch: java.lang.Exception -> L19
            if (r1 == 0) goto L1b
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9     // Catch: java.lang.Exception -> L19
            java.lang.Object r9 = r9.get(r7)     // Catch: java.lang.Exception -> L19
            goto L21
        L19:
            r6 = move-exception
            goto L27
        L1b:
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9     // Catch: java.lang.Exception -> L19
            java.lang.Object r9 = r9.invoke(r7, r0)     // Catch: java.lang.Exception -> L19
        L21:
            if (r9 == r7) goto L2d
            r6.writeAny(r9)     // Catch: java.lang.Exception -> L19
            return
        L27:
            java.lang.String r7 = "getEnumValue error"
            ah.a.x(r7, r6)
            return
        L2d:
            long r1 = r5.features
            long r9 = r10 | r1
            long r9 = r6.getFeatures(r9)
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString
            long r1 = r7.mask
            long r1 = r1 & r9
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L48
            java.lang.String r7 = r8.toString()
            r6.writeString(r7)
            return
        L48:
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingOrdinal
            long r1 = r7.mask
            long r9 = r9 & r1
            int r7 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r7 == 0) goto L59
            int r7 = r8.ordinal()
            r6.writeInt32(r7)
            return
        L59:
            java.lang.String[] r7 = r5.annotationNames
            if (r7 == 0) goto L68
            int r7 = r8.ordinal()
            java.lang.String[] r9 = r5.annotationNames
            int r10 = r9.length
            if (r7 >= r10) goto L68
            r0 = r9[r7]
        L68:
            if (r0 != 0) goto L6e
            java.lang.String r0 = r8.name()
        L6e:
            r6.writeString(r0)
            return
    }

    @Override // com.alibaba.fastjson2.writer.ObjectWriter
    public void writeJSONB(com.alibaba.fastjson2.JSONWriter r1, java.lang.Object r2, java.lang.Object r3, java.lang.reflect.Type r4, long r5) {
            r0 = this;
            boolean r3 = r1.isWriteTypeInfo(r2, r4, r5)
            if (r3 == 0) goto L23
            byte[] r3 = r0.typeNameJSONB
            if (r3 != 0) goto L1c
            java.lang.Class r3 = r0.enumType
            java.lang.String r3 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r3)
            byte[] r4 = com.alibaba.fastjson2.JSONB.toBytes(r3)
            r0.typeNameJSONB = r4
            long r3 = com.alibaba.fastjson2.util.Fnv.hashCode64(r3)
            r0.typeNameHash = r3
        L1c:
            byte[] r3 = r0.typeNameJSONB
            long r4 = r0.typeNameHash
            r1.writeTypeName(r3, r4)
        L23:
            java.lang.Enum r2 = (java.lang.Enum) r2
            com.alibaba.fastjson2.JSONWriter$Feature r3 = com.alibaba.fastjson2.JSONWriter.Feature.WriteEnumUsingToString
            boolean r3 = r1.isEnabled(r3)
            if (r3 == 0) goto L35
            java.lang.String r2 = r2.toString()
            r1.writeString(r2)
            return
        L35:
            byte[][] r3 = r0.jsonbNames
            if (r3 != 0) goto L40
            java.lang.String[] r3 = r0.names
            int r3 = r3.length
            byte[][] r3 = new byte[r3][]
            r0.jsonbNames = r3
        L40:
            int r2 = r2.ordinal()
            byte[][] r3 = r0.jsonbNames
            r3 = r3[r2]
            if (r3 != 0) goto L56
            java.lang.String[] r3 = r0.names
            r3 = r3[r2]
            byte[] r3 = com.alibaba.fastjson2.JSONB.toBytes(r3)
            byte[][] r4 = r0.jsonbNames
            r4[r2] = r3
        L56:
            r1.writeRaw(r3)
            return
    }
}
