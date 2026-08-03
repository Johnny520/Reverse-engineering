package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplEnum implements com.alibaba.fastjson2.reader.ObjectReader {
    final java.lang.reflect.Method createMethod;
    final java.lang.reflect.Type createMethodParamType;
    final java.lang.Class enumClass;
    private final long[] enumNameHashCodes;
    private final java.lang.Enum[] enums;
    private long[] intValues;
    private final java.lang.Enum[] ordinalEnums;
    private java.lang.String[] stringValues;
    final long typeNameHash;
    final java.lang.reflect.Member valueField;
    final java.lang.reflect.Type valueFieldType;

    public ObjectReaderImplEnum(java.lang.Class r14, java.lang.reflect.Method r15, java.lang.reflect.Member r16, java.lang.Enum[] r17, java.lang.Enum[] r18, long[] r19) {
            r13 = this;
            r1 = r16
            r2 = r17
            r13.<init>()
            r13.enumClass = r14
            r13.createMethod = r15
            boolean r3 = r1 instanceof java.lang.reflect.AccessibleObject
            r4 = 1
            if (r3 == 0) goto L16
            r3 = r1
            java.lang.reflect.AccessibleObject r3 = (java.lang.reflect.AccessibleObject) r3
            r3.setAccessible(r4)
        L16:
            r13.valueField = r1
            boolean r3 = r1 instanceof java.lang.reflect.Field
            r5 = 0
            if (r3 == 0) goto L25
            r3 = r1
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r3 = r3.getType()
            goto L32
        L25:
            boolean r3 = r1 instanceof java.lang.reflect.Method
            if (r3 == 0) goto L31
            r3 = r1
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class r3 = r3.getReturnType()
            goto L32
        L31:
            r3 = r5
        L32:
            r13.valueFieldType = r3
            r6 = 0
            if (r3 == 0) goto L82
            int r7 = r2.length
            java.lang.String[] r7 = new java.lang.String[r7]
            r13.stringValues = r7
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            if (r3 == r7) goto L45
            int r8 = r2.length
            long[] r8 = new long[r8]
            r13.intValues = r8
        L45:
            r8 = r6
        L46:
            int r9 = r2.length
            if (r8 >= r9) goto L82
            r9 = r2[r8]
            boolean r10 = r1 instanceof java.lang.reflect.Field     // Catch: java.lang.Exception -> L7f
            if (r10 == 0) goto L57
            r10 = r1
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10     // Catch: java.lang.Exception -> L7f
            java.lang.Object r9 = r10.get(r9)     // Catch: java.lang.Exception -> L7f
            goto L5e
        L57:
            r10 = r1
            java.lang.reflect.Method r10 = (java.lang.reflect.Method) r10     // Catch: java.lang.Exception -> L7f
            java.lang.Object r9 = r10.invoke(r9, r5)     // Catch: java.lang.Exception -> L7f
        L5e:
            java.lang.String[] r10 = r13.stringValues
            if (r3 != r7) goto L67
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L7f
            r10[r8] = r9     // Catch: java.lang.Exception -> L7f
            goto L7f
        L67:
            if (r9 != 0) goto L6b
            r11 = r5
            goto L6f
        L6b:
            java.lang.String r11 = r9.toString()     // Catch: java.lang.Exception -> L7f
        L6f:
            r10[r8] = r11     // Catch: java.lang.Exception -> L7f
            boolean r10 = r9 instanceof java.lang.Number     // Catch: java.lang.Exception -> L7f
            if (r10 == 0) goto L7f
            long[] r10 = r13.intValues     // Catch: java.lang.Exception -> L7f
            java.lang.Number r9 = (java.lang.Number) r9     // Catch: java.lang.Exception -> L7f
            long r11 = r9.longValue()     // Catch: java.lang.Exception -> L7f
            r10[r8] = r11     // Catch: java.lang.Exception -> L7f
        L7f:
            int r8 = r8 + 1
            goto L46
        L82:
            if (r15 == 0) goto L90
            int r1 = r15.getParameterCount()
            if (r1 != r4) goto L90
            java.lang.Class[] r0 = r15.getParameterTypes()
            r5 = r0[r6]
        L90:
            r13.createMethodParamType = r5
            java.lang.String r14 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r14)
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r14)
            r13.typeNameHash = r0
            r13.enums = r2
            r14 = r18
            r13.ordinalEnums = r14
            r14 = r19
            r13.enumNameHashCodes = r14
            return
    }

    private void oomCheck(java.lang.reflect.Type r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1a
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type r2 = r2.getRawType()
            java.lang.Class<java.util.List> r0 = java.util.List.class
            java.lang.Class r2 = (java.lang.Class) r2
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 != 0) goto L15
            goto L1a
        L15:
            java.lang.String r2 = "ObjectReaderImplEnum parses error, JSONReader not forward when field type belongs to collection to avoid OOM"
            ah.a.w(r2)
        L1a:
            return
    }

    public java.lang.Enum getEnum(java.lang.String r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r3)
            java.lang.Enum r3 = r2.getEnumByHashCode(r0)
            return r3
    }

    public java.lang.Enum getEnumByHashCode(long r3) {
            r2 = this;
            java.lang.Enum[] r0 = r2.enums
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            long[] r0 = r2.enumNameHashCodes
            int r3 = java.util.Arrays.binarySearch(r0, r3)
            if (r3 >= 0) goto Lf
            return r1
        Lf:
            java.lang.Enum[] r4 = r2.enums
            r3 = r4[r3]
            return r3
    }

    public java.lang.Enum getEnumByOrdinal(int r4) {
            r3 = this;
            if (r4 < 0) goto La
            java.lang.Enum[] r0 = r3.ordinalEnums
            int r1 = r0.length
            if (r4 >= r1) goto La
            r4 = r0[r4]
            return r4
        La:
            java.lang.Class r0 = r3.enumClass
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r1 = "."
            java.lang.String r2 = "No enum ordinal "
            ah.a.f(r4, r0, r1, r2)
            r4 = 0
            return r4
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = r1.enumClass
            return r0
    }

    public java.lang.Enum of(int r6) {
            r5 = this;
            java.lang.reflect.Member r0 = r5.valueField
            r1 = 0
            if (r0 != 0) goto L10
            if (r6 < 0) goto Lf
            java.lang.Enum[] r0 = r5.ordinalEnums
            int r2 = r0.length
            if (r6 >= r2) goto Lf
            r6 = r0[r6]
            return r6
        Lf:
            return r1
        L10:
            boolean r2 = r0 instanceof java.lang.reflect.Field     // Catch: java.lang.Exception -> L2b
            r3 = 0
            if (r2 == 0) goto L2d
        L15:
            java.lang.Enum[] r0 = r5.enums     // Catch: java.lang.Exception -> L2b
            int r2 = r0.length     // Catch: java.lang.Exception -> L2b
            if (r3 >= r2) goto L47
            r0 = r0[r3]     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Member r2 = r5.valueField     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Exception -> L2b
            int r2 = r2.getInt(r0)     // Catch: java.lang.Exception -> L2b
            if (r2 != r6) goto L28
            r1 = r0
            goto L47
        L28:
            int r3 = r3 + 1
            goto L15
        L2b:
            r0 = move-exception
            goto L55
        L2d:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Exception -> L2b
        L2f:
            java.lang.Enum[] r2 = r5.enums     // Catch: java.lang.Exception -> L2b
            int r4 = r2.length     // Catch: java.lang.Exception -> L2b
            if (r3 >= r4) goto L47
            r2 = r2[r3]     // Catch: java.lang.Exception -> L2b
            java.lang.Object r4 = r0.invoke(r2, r1)     // Catch: java.lang.Exception -> L2b
            java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Exception -> L2b
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L2b
            if (r4 != r6) goto L44
            r1 = r2
            goto L47
        L44:
            int r3 = r3 + 1
            goto L2f
        L47:
            if (r1 == 0) goto L4a
            return r1
        L4a:
            java.lang.String r0 = "None enum ordinal or value "
            java.lang.String r6 = eh.a.l(r6, r0)
            ah.a.w(r6)
            r6 = 0
            return r6
        L55:
            com.alibaba.fastjson2.JSONException r1 = new com.alibaba.fastjson2.JSONException
            java.lang.Class r2 = r5.enumClass
            java.lang.String r2 = r2.getName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "parse enum error, class "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = ", value "
            r3.append(r2)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r1.<init>(r6, r0)
            throw r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r9, java.lang.reflect.Type r10, java.lang.Object r11, long r12) {
            r8 = this;
            int r6 = r9.getOffset()
            byte r7 = r9.getType()
            r0 = -110(0xffffffffffffff92, float:NaN)
            if (r7 != r0) goto L48
            java.lang.Class r1 = r8.enumClass
            r2 = 0
            r0 = r9
            r4 = r12
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.checkAutoType(r1, r2, r4)
            if (r1 == 0) goto L24
            if (r1 == r8) goto L48
            r2 = r10
            r3 = r11
            r4 = r12
            r0 = r1
            r1 = r9
            java.lang.Object r0 = r0.readJSONBObject(r1, r2, r3, r4)
            return r0
        L24:
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnNotSupportAutoType
            boolean r1 = r9.isEnabled(r1)
            if (r1 != 0) goto L2d
            goto L48
        L2d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "not support enumType : "
            r1.<init>(r2)
            java.lang.String r2 = r9.getString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r9.info(r1)
            ah.a.w(r0)
            r0 = 0
            return r0
        L48:
            r1 = -16
            if (r7 < r1) goto L75
            r1 = 72
            if (r7 > r1) goto L75
            r1 = 47
            if (r7 > r1) goto L58
            r9.next()
            goto L5c
        L58:
            int r7 = r9.readInt32Value()
        L5c:
            if (r7 < 0) goto L66
            java.lang.Enum[] r1 = r8.ordinalEnums
            int r2 = r1.length
            if (r7 >= r2) goto L66
            r1 = r1[r7]
            goto L8f
        L66:
            java.lang.Class r0 = r8.enumClass
            java.lang.String r0 = r0.getCanonicalName()
            java.lang.String r1 = "."
            java.lang.String r2 = "No enum ordinal "
            ah.a.f(r7, r0, r1, r2)
            r0 = 0
            return r0
        L75:
            boolean r1 = r9.nextIfNullOrEmptyString()
            if (r1 == 0) goto L7d
            r0 = 0
            return r0
        L7d:
            long r1 = r9.readValueHashCode()
            java.lang.Enum r1 = r8.getEnumByHashCode(r1)
            if (r1 != 0) goto L8f
            long r1 = r9.getNameHashCodeLCase()
            java.lang.Enum r1 = r8.getEnumByHashCode(r1)
        L8f:
            if (r1 != 0) goto L9a
            int r0 = r9.getOffset()
            if (r0 != r6) goto L9a
            r8.oomCheck(r10)
        L9a:
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r8, java.lang.reflect.Type r9, java.lang.Object r10, long r11) {
            r7 = this;
            int r10 = r8.getOffset()
            java.lang.reflect.Type r11 = r7.createMethodParamType
            r12 = 0
            if (r11 == 0) goto L40
            java.lang.Object r9 = r8.read(r11)
            java.lang.reflect.Method r10 = r7.createMethod     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1a
            java.lang.Object[] r11 = new java.lang.Object[]{r9}     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1a
            java.lang.Object r8 = r10.invoke(r12, r11)     // Catch: java.lang.reflect.InvocationTargetException -> L18 java.lang.IllegalAccessException -> L1a
            return r8
        L18:
            r10 = move-exception
            goto L1b
        L1a:
            r10 = move-exception
        L1b:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "create enum error, enumClass "
            r11.<init>(r12)
            java.lang.Class r12 = r7.enumClass
            java.lang.String r12 = r12.getName()
            r11.append(r12)
            java.lang.String r12 = ", paramValue "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            java.lang.String r8 = r8.info(r9)
            ah.a.x(r8, r10)
        L3e:
            r8 = 0
            return r8
        L40:
            boolean r11 = r8.isInt()
            java.lang.String r0 = "parse enum error, class "
            r1 = 0
            if (r11 == 0) goto Lc0
            int r11 = r8.readInt32Value()
            java.lang.reflect.Member r2 = r7.valueField
            if (r2 != 0) goto L6b
            if (r11 < 0) goto L5d
            java.lang.Enum[] r12 = r7.ordinalEnums
            int r0 = r12.length
            if (r11 >= r0) goto L5d
            r11 = r12[r11]
            r12 = r11
            goto L180
        L5d:
            java.lang.Class r8 = r7.enumClass
            java.lang.String r8 = r8.getCanonicalName()
            java.lang.String r9 = "."
            java.lang.String r10 = "No enum ordinal "
            ah.a.f(r11, r8, r9, r10)
            goto L3e
        L6b:
            long[] r2 = r7.intValues
            if (r2 == 0) goto L83
        L6f:
            long[] r2 = r7.intValues
            int r3 = r2.length
            if (r1 >= r3) goto L83
            r3 = r2[r1]
            long r5 = (long) r11
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L80
            java.lang.Enum[] r12 = r7.enums
            r12 = r12[r1]
            goto L83
        L80:
            int r1 = r1 + 1
            goto L6f
        L83:
            if (r12 != 0) goto L180
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnEnumNotMatch
            boolean r1 = r8.isEnabled(r1)
            if (r1 != 0) goto L8f
            goto L180
        L8f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            java.lang.Class r10 = r7.enumClass
            java.lang.String r10 = r10.getName()
            r9.append(r10)
            java.lang.String r10 = ", "
            r9.append(r10)
            java.lang.reflect.Member r10 = r7.valueField
            java.lang.String r10 = r10.getName()
            r9.append(r10)
            java.lang.String r10 = " "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            java.lang.String r8 = r8.info(r9)
            ah.a.w(r8)
            goto L3e
        Lc0:
            boolean r11 = r8.nextIfNullOrEmptyString()
            if (r11 != 0) goto L180
            java.lang.String[] r11 = r7.stringValues
            if (r11 == 0) goto Lf6
            boolean r11 = r8.isString()
            if (r11 == 0) goto Lf6
            java.lang.String r11 = r8.readString()
        Ld4:
            java.lang.String[] r2 = r7.stringValues
            int r3 = r2.length
            if (r1 >= r3) goto Le9
            r2 = r2[r1]
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto Le6
            java.lang.Enum[] r12 = r7.enums
            r12 = r12[r1]
            goto Le9
        Le6:
            int r1 = r1 + 1
            goto Ld4
        Le9:
            if (r12 != 0) goto L14e
            java.lang.reflect.Member r1 = r7.valueField
            if (r1 == 0) goto L14e
            java.lang.Class r1 = r7.enumClass     // Catch: java.lang.IllegalArgumentException -> L14e
            java.lang.Enum r12 = java.lang.Enum.valueOf(r1, r11)     // Catch: java.lang.IllegalArgumentException -> L14e
            goto L14e
        Lf6:
            long[] r11 = r7.intValues
            if (r11 == 0) goto L118
            boolean r11 = r8.isInt()
            if (r11 == 0) goto L118
            int r11 = r8.readInt32Value()
        L104:
            long[] r2 = r7.intValues
            int r3 = r2.length
            if (r1 >= r3) goto L14e
            r3 = r2[r1]
            long r5 = (long) r11
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 != 0) goto L115
            java.lang.Enum[] r11 = r7.enums
            r12 = r11[r1]
            goto L14e
        L115:
            int r1 = r1 + 1
            goto L104
        L118:
            long r1 = r8.readValueHashCode()
            r3 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 != 0) goto L126
            return r12
        L126:
            java.lang.Enum r11 = r7.getEnumByHashCode(r1)
            if (r11 != 0) goto L134
            long r11 = r8.getNameHashCodeLCase()
            java.lang.Enum r11 = r7.getEnumByHashCode(r11)
        L134:
            if (r11 != 0) goto L14d
            java.lang.String r12 = r8.getString()
            boolean r1 = com.alibaba.fastjson2.util.TypeUtils.isInteger(r12)
            if (r1 == 0) goto L14d
            int r12 = java.lang.Integer.parseInt(r12)
            if (r12 < 0) goto L14d
            java.lang.Enum[] r1 = r7.ordinalEnums
            int r2 = r1.length
            if (r12 >= r2) goto L14d
            r11 = r1[r12]
        L14d:
            r12 = r11
        L14e:
            if (r12 != 0) goto L180
            com.alibaba.fastjson2.JSONReader$Feature r11 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnEnumNotMatch
            boolean r11 = r8.isEnabled(r11)
            if (r11 != 0) goto L159
            goto L180
        L159:
            java.lang.String r9 = r8.getString()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>(r0)
            java.lang.Class r11 = r7.enumClass
            java.lang.String r11 = r11.getName()
            r10.append(r11)
            java.lang.String r11 = ", value "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            java.lang.String r8 = r8.info(r9)
            ah.a.w(r8)
            goto L3e
        L180:
            if (r12 != 0) goto L18b
            int r8 = r8.getOffset()
            if (r8 != r10) goto L18b
            r7.oomCheck(r9)
        L18b:
            return r12
    }
}
