package com.alibaba.fastjson2.writer;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectWriterCreator {
    public static final com.alibaba.fastjson2.writer.ObjectWriterCreator INSTANCE = null;

    static {
            com.alibaba.fastjson2.writer.ObjectWriterCreator r0 = new com.alibaba.fastjson2.writer.ObjectWriterCreator
            r0.<init>()
            com.alibaba.fastjson2.writer.ObjectWriterCreator.INSTANCE = r0
            return
    }

    public ObjectWriterCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(com.alibaba.fastjson2.writer.ObjectWriterCreator r0, com.alibaba.fastjson2.codec.FieldInfo r1, java.lang.Class r2, long r3, com.alibaba.fastjson2.writer.ObjectWriterProvider r5, com.alibaba.fastjson2.codec.BeanInfo r6, java.util.TreeMap r7, java.lang.reflect.Field r8) {
            r0.lambda$createObjectWriter$0(r1, r2, r3, r5, r6, r7, r8)
            return
    }

    public static /* synthetic */ void b(com.alibaba.fastjson2.writer.ObjectWriterCreator r0, com.alibaba.fastjson2.codec.FieldInfo r1, long r2, com.alibaba.fastjson2.codec.BeanInfo r4, com.alibaba.fastjson2.writer.ObjectWriterProvider r5, java.lang.Class r6, java.util.TreeMap r7, java.lang.reflect.Method r8) {
            r0.lambda$createObjectWriter$2(r1, r2, r4, r5, r6, r7, r8)
            return
    }

    public static /* synthetic */ void c(com.alibaba.fastjson2.writer.ObjectWriterCreator r0, com.alibaba.fastjson2.codec.FieldInfo r1, java.lang.Class r2, long r3, com.alibaba.fastjson2.writer.ObjectWriterProvider r5, com.alibaba.fastjson2.codec.BeanInfo r6, java.util.TreeMap r7, java.lang.reflect.Field r8) {
            r0.lambda$createObjectWriter$1(r1, r2, r3, r5, r6, r7, r8)
            return
    }

    public static void configSerializeFilters(com.alibaba.fastjson2.codec.BeanInfo r4, com.alibaba.fastjson2.writer.ObjectWriterAdapter r5) {
            java.lang.Class<? extends com.alibaba.fastjson2.filter.Filter>[] r4 = r4.serializeFilters
            int r0 = r4.length
            r1 = 0
        L4:
            if (r1 >= r0) goto L1d
            r2 = r4[r1]
            java.lang.Class<com.alibaba.fastjson2.filter.Filter> r3 = com.alibaba.fastjson2.filter.Filter.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 != 0) goto L11
            goto L1a
        L11:
            java.lang.Object r2 = r2.newInstance()     // Catch: java.lang.Throwable -> L1a
            com.alibaba.fastjson2.filter.Filter r2 = (com.alibaba.fastjson2.filter.Filter) r2     // Catch: java.lang.Throwable -> L1a
            r5.setFilter(r2)     // Catch: java.lang.Throwable -> L1a
        L1a:
            int r1 = r1 + 1
            goto L4
        L1d:
            return
    }

    public static java.lang.String getFieldName(java.lang.Class r5, com.alibaba.fastjson2.codec.BeanInfo r6, com.alibaba.fastjson2.codec.FieldInfo r7, java.lang.reflect.Method r8) {
            java.lang.String r0 = r7.fieldName
            if (r0 == 0) goto Le
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            java.lang.String r5 = r7.fieldName
            return r5
        Le:
            boolean r7 = r6.kotlin
            java.lang.String r6 = r6.namingStrategy
            java.lang.String r6 = com.alibaba.fastjson2.util.BeanUtils.getterName(r8, r7, r6)
            int r7 = r6.length()
            r8 = 0
            if (r7 <= 0) goto L22
            char r0 = r6.charAt(r8)
            goto L23
        L22:
            r0 = r8
        L23:
            r1 = 122(0x7a, float:1.71E-43)
            r2 = 97
            r3 = 1
            if (r7 != r3) goto L2e
            if (r0 < r2) goto L2e
            if (r0 <= r1) goto L40
        L2e:
            if (r7 <= r3) goto L7b
            r7 = 65
            if (r0 < r7) goto L7b
            r4 = 90
            if (r0 > r4) goto L7b
            char r3 = r6.charAt(r3)
            if (r3 < r7) goto L7b
            if (r3 > r4) goto L7b
        L40:
            char[] r7 = r6.toCharArray()
            if (r0 < r2) goto L50
            if (r0 > r1) goto L50
            char r0 = r7[r8]
            int r0 = r0 + (-32)
            char r0 = (char) r0
            r7[r8] = r0
            goto L57
        L50:
            char r0 = r7[r8]
            int r0 = r0 + 32
            char r0 = (char) r0
            r7[r8] = r0
        L57:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r7)
            java.lang.reflect.Field r5 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r5, r8)
            if (r5 == 0) goto L7b
            r0 = 2
        L63:
            int r3 = r7.length
            if (r0 >= r3) goto L7a
            char r3 = r7[r0]
            if (r3 < r2) goto L77
            if (r3 > r1) goto L77
            int r5 = r5.getModifiers()
            boolean r5 = java.lang.reflect.Modifier.isPublic(r5)
            if (r5 == 0) goto L7b
            goto L7a
        L77:
            int r0 = r0 + 1
            goto L63
        L7a:
            return r8
        L7b:
            return r6
    }

    private /* synthetic */ void lambda$createObjectWriter$0(com.alibaba.fastjson2.codec.FieldInfo r9, java.lang.Class r10, long r11, com.alibaba.fastjson2.writer.ObjectWriterProvider r13, com.alibaba.fastjson2.codec.BeanInfo r14, java.util.Map r15, java.lang.reflect.Field r16) {
            r8 = this;
            r9.init()
            r0 = r8
            r6 = r9
            r1 = r10
            r2 = r11
            r4 = r13
            r5 = r14
            r7 = r16
            com.alibaba.fastjson2.writer.FieldWriter r10 = r0.createFieldWriter(r1, r2, r4, r5, r6, r7)
            if (r10 == 0) goto L24
            java.lang.Class<?> r9 = r9.writeUsing
            if (r9 == 0) goto L1f
            boolean r9 = r10 instanceof com.alibaba.fastjson2.writer.FieldWriterObject
            if (r9 == 0) goto L1f
            r9 = r10
            com.alibaba.fastjson2.writer.FieldWriterObject r9 = (com.alibaba.fastjson2.writer.FieldWriterObject) r9
            r11 = 1
            r9.writeUsing = r11
        L1f:
            java.lang.String r9 = r10.fieldName
            r15.put(r9, r10)
        L24:
            return
    }

    private /* synthetic */ void lambda$createObjectWriter$1(com.alibaba.fastjson2.codec.FieldInfo r11, java.lang.Class r12, long r13, com.alibaba.fastjson2.writer.ObjectWriterProvider r15, com.alibaba.fastjson2.codec.BeanInfo r16, java.util.Map r17, java.lang.reflect.Field r18) {
            r10 = this;
            r8 = r17
            r11.init()
            int r0 = r18.getModifiers()
            r9 = 1
            r0 = r0 & r9
            if (r0 != 0) goto Lf
            r0 = r9
            goto L10
        Lf:
            r0 = 0
        L10:
            r11.ignore = r0
            r0 = r10
            r6 = r11
            r1 = r12
            r2 = r13
            r4 = r15
            r5 = r16
            r7 = r18
            com.alibaba.fastjson2.writer.FieldWriter r1 = r0.createFieldWriter(r1, r2, r4, r5, r6, r7)
            if (r1 == 0) goto L4a
            java.lang.Class<?> r0 = r11.writeUsing
            if (r0 == 0) goto L2e
            boolean r0 = r1 instanceof com.alibaba.fastjson2.writer.FieldWriterObject
            if (r0 == 0) goto L2e
            r0 = r1
            com.alibaba.fastjson2.writer.FieldWriterObject r0 = (com.alibaba.fastjson2.writer.FieldWriterObject) r0
            r0.writeUsing = r9
        L2e:
            java.lang.String r0 = r1.fieldName
            java.lang.Object r0 = r8.get(r0)
            com.alibaba.fastjson2.writer.FieldWriter r0 = (com.alibaba.fastjson2.writer.FieldWriter) r0
            if (r0 != 0) goto L3d
            java.lang.String r2 = r1.fieldName
            r8.put(r2, r1)
        L3d:
            if (r0 == 0) goto L4a
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L4a
            java.lang.String r0 = r1.fieldName
            r8.put(r0, r1)
        L4a:
            return
    }

    private /* synthetic */ void lambda$createObjectWriter$2(com.alibaba.fastjson2.codec.FieldInfo r18, long r19, com.alibaba.fastjson2.codec.BeanInfo r21, com.alibaba.fastjson2.writer.ObjectWriterProvider r22, java.lang.Class r23, java.util.Map r24, java.lang.reflect.Method r25) {
            r17 = this;
            r0 = r18
            r1 = r21
            r3 = r23
            r13 = r24
            r10 = r25
            r0.init()
            r4 = r19
            r0.features = r4
            java.lang.String r2 = r1.format
            r0.format = r2
            r2 = r22
            r2.getFieldInfo(r1, r0, r3, r10)
            boolean r4 = r0.ignore
            if (r4 == 0) goto L20
            goto L137
        L20:
            java.lang.String r4 = getFieldName(r3, r1, r0, r10)
            java.lang.String[] r5 = r1.includes
            r14 = 0
            if (r5 == 0) goto L3c
            int r6 = r5.length
            if (r6 <= 0) goto L3c
            r6 = r14
        L2d:
            int r7 = r5.length
            if (r6 >= r7) goto L137
            r7 = r5[r6]
            boolean r7 = r7.equals(r4)
            if (r7 == 0) goto L39
            goto L3c
        L39:
            int r6 = r6 + 1
            goto L2d
        L3c:
            long r5 = r1.writerFeatures
            com.alibaba.fastjson2.JSONWriter$Feature r7 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r7 = r7.mask
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L53
            java.lang.String r5 = r1.typeKey
            boolean r5 = r4.equals(r5)
            if (r5 == 0) goto L53
            goto L137
        L53:
            java.lang.String[] r5 = r1.orders
            r15 = 1
            if (r5 == 0) goto L76
            r5 = r14
            r6 = r5
        L5a:
            java.lang.String[] r7 = r1.orders
            int r8 = r7.length
            if (r5 >= r8) goto L6d
            r7 = r7[r5]
            boolean r7 = r4.equals(r7)
            if (r7 == 0) goto L6a
            r0.ordinal = r5
            r6 = r15
        L6a:
            int r5 = r5 + 1
            goto L5a
        L6d:
            if (r6 != 0) goto L76
            int r1 = r0.ordinal
            if (r1 != 0) goto L76
            int r1 = r7.length
            r0.ordinal = r1
        L76:
            java.lang.Class<?> r1 = r0.writeUsing
            r5 = 0
            if (r1 == 0) goto L96
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r5)     // Catch: java.lang.NoSuchMethodException -> L89 java.lang.reflect.InvocationTargetException -> L8b java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L8f
            r1.setAccessible(r15)     // Catch: java.lang.NoSuchMethodException -> L89 java.lang.reflect.InvocationTargetException -> L8b java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L8f
            java.lang.Object r1 = r1.newInstance(r5)     // Catch: java.lang.NoSuchMethodException -> L89 java.lang.reflect.InvocationTargetException -> L8b java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L8f
            com.alibaba.fastjson2.writer.ObjectWriter r1 = (com.alibaba.fastjson2.writer.ObjectWriter) r1     // Catch: java.lang.NoSuchMethodException -> L89 java.lang.reflect.InvocationTargetException -> L8b java.lang.IllegalAccessException -> L8d java.lang.InstantiationException -> L8f
            goto L97
        L89:
            r0 = move-exception
            goto L90
        L8b:
            r0 = move-exception
            goto L90
        L8d:
            r0 = move-exception
            goto L90
        L8f:
            r0 = move-exception
        L90:
            java.lang.String r1 = "create writeUsing Writer error"
            ah.a.x(r1, r0)
            return
        L96:
            r1 = r5
        L97:
            if (r1 != 0) goto L9f
            boolean r6 = r0.fieldClassMixIn
            if (r6 == 0) goto L9f
            com.alibaba.fastjson2.writer.ObjectWriterProvider$VoidObjectWriter r1 = com.alibaba.fastjson2.writer.ObjectWriterProvider.VoidObjectWriter.INSTANCE
        L9f:
            r11 = r1
            r1 = r5
            int r5 = r0.ordinal
            long r6 = r0.features
            java.lang.String r8 = r0.format
            java.lang.String r9 = r0.label
            java.lang.Class<?> r12 = r0.contentAs
            r16 = r1
            r1 = r17
            com.alibaba.fastjson2.writer.FieldWriter r2 = r1.createFieldWriter(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12)
            java.lang.Class<?> r0 = r0.writeUsing
            if (r0 == 0) goto Lc0
            boolean r0 = r2 instanceof com.alibaba.fastjson2.writer.FieldWriterObject
            if (r0 == 0) goto Lc0
            r0 = r2
            com.alibaba.fastjson2.writer.FieldWriterObject r0 = (com.alibaba.fastjson2.writer.FieldWriterObject) r0
            r0.writeUsing = r15
        Lc0:
            java.lang.String r0 = r2.fieldName
            java.lang.Object r0 = r13.get(r0)
            com.alibaba.fastjson2.writer.FieldWriter r0 = (com.alibaba.fastjson2.writer.FieldWriter) r0
            if (r0 != 0) goto Lcf
            java.lang.String r1 = r2.fieldName
            r13.put(r1, r2)
        Lcf:
            if (r0 == 0) goto Lda
            int r1 = r0.compareTo(r2)
            if (r1 <= 0) goto Lda
            r13.put(r4, r2)
        Lda:
            if (r0 != 0) goto L137
            char r0 = r4.charAt(r14)
            r1 = 65
            if (r0 < r1) goto Lff
            r1 = 90
            if (r0 > r1) goto Lff
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = r0 + 32
            char r0 = (char) r0
            r1.append(r0)
            java.lang.String r0 = r4.substring(r15)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            goto L120
        Lff:
            r1 = 97
            if (r0 < r1) goto L11e
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 > r1) goto L11e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r0 = r0 + (-32)
            char r0 = (char) r0
            r1.append(r0)
            java.lang.String r0 = r4.substring(r15)
            r1.append(r0)
            java.lang.String r5 = r1.toString()
            goto L120
        L11e:
            r5 = r16
        L120:
            if (r5 == 0) goto L137
            java.lang.Object r0 = r13.get(r5)
            com.alibaba.fastjson2.writer.FieldWriter r0 = (com.alibaba.fastjson2.writer.FieldWriter) r0
            if (r0 == 0) goto L137
            java.lang.reflect.Method r0 = r0.method
            if (r0 == 0) goto L134
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L137
        L134:
            r13.remove(r5)
        L137:
            return
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(com.alibaba.fastjson2.writer.ObjectWriterProvider r13, java.lang.Class<T> r14, java.lang.String r15, int r16, long r17, java.lang.String r19, java.lang.String r20, java.lang.reflect.Method r21, com.alibaba.fastjson2.writer.ObjectWriter r22) {
            r12 = this;
            r11 = 0
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            com.alibaba.fastjson2.writer.FieldWriter r13 = r0.createFieldWriter(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return r13
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(com.alibaba.fastjson2.writer.ObjectWriterProvider r18, java.lang.Class<T> r19, java.lang.String r20, int r21, long r22, java.lang.String r24, java.lang.String r25, java.lang.reflect.Method r26, com.alibaba.fastjson2.writer.ObjectWriter r27, java.lang.Class<?> r28) {
            r17 = this;
            r0 = r18
            java.lang.Class r9 = r26.getReturnType()
            java.lang.reflect.Type r7 = r26.getGenericReturnType()
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            if (r9 != r1) goto L3e
            java.lang.Class r3 = r26.getDeclaringClass()     // Catch: java.lang.Exception -> L34
            java.lang.String r3 = r3.getName()     // Catch: java.lang.Exception -> L34
            java.lang.String r4 = "java.util.HashMap$Node"
            boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L34
            if (r3 == 0) goto L3e
            java.lang.String r3 = r26.getName()     // Catch: java.lang.Exception -> L34
            java.lang.String r4 = "getValue"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L34
            if (r4 != 0) goto L37
            java.lang.String r4 = "getKey"
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Exception -> L34
            if (r4 == 0) goto L3e
            goto L37
        L34:
            r3 = r26
            goto L44
        L37:
            java.lang.Class<java.util.Map$Entry> r4 = java.util.Map.Entry.class
            java.lang.reflect.Method r3 = r4.getMethod(r3, r2)     // Catch: java.lang.Exception -> L34
            goto L40
        L3e:
            r3 = r26
        L40:
            r4 = 1
            r3.setAccessible(r4)     // Catch: java.lang.Exception -> L44
        L44:
            r8 = r3
            java.lang.Class<java.util.Date> r3 = java.util.Date.class
            if (r27 != 0) goto L58
            if (r0 == 0) goto L58
            if (r24 == 0) goto L55
            boolean r4 = r24.isEmpty()
            if (r4 != 0) goto L55
            if (r9 == r3) goto L58
        L55:
            r13 = r17
            goto L5b
        L58:
            r13 = r17
            goto L61
        L5b:
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r13.getInitWriter(r0, r9)
            r11 = r4
            goto L63
        L61:
            r11 = r27
        L63:
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r4 = r22 & r4
            r14 = 0
            int r4 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r4 == 0) goto L6f
            r10 = r2
            goto L76
        L6f:
            r4 = r19
            java.lang.reflect.Field r4 = com.alibaba.fastjson2.util.BeanUtils.getField(r4, r8)
            r10 = r4
        L76:
            if (r11 == 0) goto L95
            com.alibaba.fastjson2.writer.FieldWriterObjectMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterObjectMethod
            r1 = r10
            r10 = r8
            r8 = r9
            r9 = r1
            r1 = r20
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r9 = r8
            r0.initValueClass = r9
            com.alibaba.fastjson2.writer.ObjectWriterProvider$VoidObjectWriter r1 = com.alibaba.fastjson2.writer.ObjectWriterProvider.VoidObjectWriter.INSTANCE
            if (r11 == r1) goto L94
            r0.initObjectWriter = r11
        L94:
            return r0
        L95:
            r4 = 0
            if (r20 != 0) goto L9d
            java.lang.String r5 = com.alibaba.fastjson2.util.BeanUtils.getterName(r8, r4, r2)
            goto L9f
        L9d:
            r5 = r20
        L9f:
            java.lang.Class r6 = java.lang.Boolean.TYPE
            if (r9 == r6) goto La7
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            if (r9 != r6) goto Laa
        La7:
            r1 = r5
            goto L2a5
        Laa:
            java.lang.Class r6 = java.lang.Integer.TYPE
            if (r9 == r6) goto Lb2
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            if (r9 != r6) goto Lb5
        Lb2:
            r1 = r5
            goto L296
        Lb5:
            java.lang.Class r6 = java.lang.Float.TYPE
            if (r9 == r6) goto Lbd
            java.lang.Class<java.lang.Float> r6 = java.lang.Float.class
            if (r9 != r6) goto Lc0
        Lbd:
            r1 = r5
            goto L283
        Lc0:
            java.lang.Class r6 = java.lang.Double.TYPE
            if (r9 == r6) goto Lc8
            java.lang.Class<java.lang.Double> r6 = java.lang.Double.class
            if (r9 != r6) goto Lcb
        Lc8:
            r1 = r5
            goto L270
        Lcb:
            java.lang.Class r6 = java.lang.Long.TYPE
            if (r9 == r6) goto Ld3
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            if (r9 != r6) goto Ld8
        Ld3:
            r1 = r5
            r5 = r24
            goto L240
        Ld8:
            java.lang.Class r6 = java.lang.Short.TYPE
            if (r9 == r6) goto Le0
            java.lang.Class<java.lang.Short> r6 = java.lang.Short.class
            if (r9 != r6) goto Le3
        Le0:
            r1 = r5
            goto L231
        Le3:
            java.lang.Class r6 = java.lang.Byte.TYPE
            if (r9 == r6) goto Leb
            java.lang.Class<java.lang.Byte> r6 = java.lang.Byte.class
            if (r9 != r6) goto Lee
        Leb:
            r1 = r5
            goto L222
        Lee:
            java.lang.Class r6 = java.lang.Character.TYPE
            if (r9 == r6) goto Lf6
            java.lang.Class<java.lang.Character> r6 = java.lang.Character.class
            if (r9 != r6) goto Lf9
        Lf6:
            r1 = r5
            goto L213
        Lf9:
            java.lang.Class<java.math.BigDecimal> r6 = java.math.BigDecimal.class
            if (r9 != r6) goto L10d
            com.alibaba.fastjson2.writer.FieldWriterBigDecimalMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterBigDecimalMethod
            r2 = r21
            r3 = r22
            r6 = r25
            r1 = r5
            r7 = r10
            r5 = r24
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
        L10d:
            r16 = r5
            r5 = r1
            r1 = r16
            boolean r6 = r9.isEnum()
            if (r6 == 0) goto L13b
            java.lang.reflect.Member r0 = com.alibaba.fastjson2.util.BeanUtils.getEnumValueField(r9, r0)
            if (r0 != 0) goto L13b
            boolean r0 = com.alibaba.fastjson2.util.BeanUtils.isWriteEnumAsJavaBean(r9)
            if (r0 != 0) goto L13b
            java.lang.String[] r0 = com.alibaba.fastjson2.util.BeanUtils.getEnumAnnotationNames(r9)
            if (r0 != 0) goto L13b
            com.alibaba.fastjson2.writer.FieldWriterEnumMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterEnumMethod
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r7 = r9
            r9 = r8
            r8 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L13b:
            if (r9 != r3) goto L15e
            if (r24 == 0) goto L14d
            java.lang.String r0 = r24.trim()
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L14b
            r5 = r2
            goto L14f
        L14b:
            r5 = r0
            goto L14f
        L14d:
            r5 = r24
        L14f:
            com.alibaba.fastjson2.writer.FieldWriterDateMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterDateMethod
            r2 = r21
            r3 = r22
            r6 = r25
            r7 = r9
            r9 = r8
            r8 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L15e:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r9 != r0) goto L171
            com.alibaba.fastjson2.writer.FieldWriterStringMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterStringMethod
            r2 = r21
            r5 = r22
            r3 = r24
            r4 = r25
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return r0
        L171:
            java.lang.Class<java.util.List> r0 = java.util.List.class
            if (r9 == r0) goto L1ef
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            if (r9 == r0) goto L1ef
            java.lang.Class<java.lang.Iterable> r0 = java.lang.Iterable.class
            if (r9 != r0) goto L17f
            goto L1ef
        L17f:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r9)
            if (r0 == 0) goto L19b
            com.alibaba.fastjson2.writer.FieldWriterMapMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterMapMethod
            r2 = r10
            r10 = r8
            r8 = r9
            r9 = r2
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r11 = r28
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L19b:
            java.lang.Class<java.lang.Float[]> r0 = java.lang.Float[].class
            if (r9 != r0) goto L1b1
            com.alibaba.fastjson2.writer.FieldWriterObjectArrayMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterObjectArrayMethod
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            r3 = r21
            r4 = r22
            r6 = r24
            r11 = r8
            r8 = r7
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return r0
        L1b1:
            java.lang.Class<java.lang.Double[]> r0 = java.lang.Double[].class
            if (r9 != r0) goto L1c7
            com.alibaba.fastjson2.writer.FieldWriterObjectArrayMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterObjectArrayMethod
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            r3 = r21
            r4 = r22
            r6 = r24
            r11 = r8
            r8 = r7
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return r0
        L1c7:
            java.lang.Class<java.math.BigDecimal[]> r0 = java.math.BigDecimal[].class
            if (r9 != r0) goto L1dd
            com.alibaba.fastjson2.writer.FieldWriterObjectArrayMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterObjectArrayMethod
            java.lang.Class<java.math.BigDecimal> r2 = java.math.BigDecimal.class
            r3 = r21
            r4 = r22
            r6 = r24
            r11 = r8
            r8 = r7
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return r0
        L1dd:
            com.alibaba.fastjson2.writer.FieldWriterObjectMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterObjectMethod
            r2 = r10
            r10 = r8
            r8 = r9
            r9 = r2
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r0
        L1ef:
            boolean r0 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L1fe
            r0 = r7
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r0 = r0[r4]
            r2 = r0
            goto L1ff
        L1fe:
            r2 = r5
        L1ff:
            com.alibaba.fastjson2.writer.FieldWriterListMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterListMethod
            r3 = r21
            r4 = r22
            r6 = r24
            r12 = r28
            r11 = r9
            r9 = r8
            r8 = r10
            r10 = r7
            r7 = r25
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L213:
            com.alibaba.fastjson2.writer.FieldWriterCharMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterCharMethod
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L222:
            com.alibaba.fastjson2.writer.FieldWriterInt8Method r0 = new com.alibaba.fastjson2.writer.FieldWriterInt8Method
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L231:
            com.alibaba.fastjson2.writer.FieldWriterInt16Method r0 = new com.alibaba.fastjson2.writer.FieldWriterInt16Method
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L240:
            if (r5 == 0) goto L260
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L260
            java.lang.String r0 = "string"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L251
            goto L260
        L251:
            com.alibaba.fastjson2.writer.FieldWriterMillisMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterMillisMethod
            r2 = r21
            r3 = r22
            r6 = r25
            r7 = r9
            r9 = r8
            r8 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L260:
            com.alibaba.fastjson2.writer.FieldWriterInt64Method r0 = new com.alibaba.fastjson2.writer.FieldWriterInt64Method
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r7 = r8
            r8 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L270:
            com.alibaba.fastjson2.writer.FieldWriterDoubleMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterDoubleMethod
            r11 = r8
            r8 = r9
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r7 = r9
            r9 = r10
            r10 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r0
        L283:
            com.alibaba.fastjson2.writer.FieldWriterFloatMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterFloatMethod
            r11 = r8
            r8 = r9
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r7 = r9
            r9 = r10
            r10 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r0
        L296:
            com.alibaba.fastjson2.writer.FieldWriterInt32Method r0 = new com.alibaba.fastjson2.writer.FieldWriterInt32Method
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L2a5:
            com.alibaba.fastjson2.writer.FieldWriterBoolMethod r0 = new com.alibaba.fastjson2.writer.FieldWriterBoolMethod
            r2 = r21
            r3 = r22
            r5 = r24
            r6 = r25
            r7 = r10
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
    }

    public <T, V> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(com.alibaba.fastjson2.writer.ObjectWriterProvider r15, java.lang.Class<T> r16, java.lang.String r17, int r18, long r19, java.lang.String r21, java.lang.String r22, java.lang.reflect.Type r23, java.lang.Class<V> r24, java.lang.reflect.Method r25, java.util.function.Function<T, V> r26) {
            r14 = this;
            r13 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            com.alibaba.fastjson2.writer.FieldWriter r15 = r0.createFieldWriter(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            return r15
    }

    public <T, V> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(com.alibaba.fastjson2.writer.ObjectWriterProvider r14, java.lang.Class<T> r15, java.lang.String r16, int r17, long r18, java.lang.String r20, java.lang.String r21, java.lang.reflect.Type r22, java.lang.Class<V> r23, java.lang.reflect.Method r24, java.util.function.Function<T, V> r25, java.lang.Class<?> r26) {
            r13 = this;
            r8 = r23
            java.lang.Class<java.lang.Byte> r15 = java.lang.Byte.class
            if (r8 != r15) goto L1a
            com.alibaba.fastjson2.writer.FieldWriterInt8Func r0 = new com.alibaba.fastjson2.writer.FieldWriterInt8Func
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r24
            r8 = r25
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
        L1a:
            java.lang.Class<java.lang.Short> r15 = java.lang.Short.class
            if (r8 != r15) goto L32
            com.alibaba.fastjson2.writer.FieldWriterInt16Func r1 = new com.alibaba.fastjson2.writer.FieldWriterInt16Func
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r24
            r9 = r25
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            return r1
        L32:
            java.lang.Class<java.lang.Integer> r15 = java.lang.Integer.class
            if (r8 != r15) goto L4a
            com.alibaba.fastjson2.writer.FieldWriterInt32Func r1 = new com.alibaba.fastjson2.writer.FieldWriterInt32Func
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r24
            r9 = r25
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            return r1
        L4a:
            java.lang.Class<java.lang.Long> r15 = java.lang.Long.class
            if (r8 != r15) goto L62
            com.alibaba.fastjson2.writer.FieldWriterInt64Func r1 = new com.alibaba.fastjson2.writer.FieldWriterInt64Func
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r24
            r9 = r25
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            return r1
        L62:
            java.lang.Class<java.math.BigInteger> r15 = java.math.BigInteger.class
            if (r8 != r15) goto L7a
            com.alibaba.fastjson2.writer.FieldWriterBigIntFunc r1 = new com.alibaba.fastjson2.writer.FieldWriterBigIntFunc
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r24
            r9 = r25
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            return r1
        L7a:
            java.lang.Class<java.math.BigDecimal> r15 = java.math.BigDecimal.class
            if (r8 != r15) goto L92
            com.alibaba.fastjson2.writer.FieldWriterBigDecimalFunc r1 = new com.alibaba.fastjson2.writer.FieldWriterBigDecimalFunc
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r24
            r9 = r25
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            return r1
        L92:
            java.lang.Class<java.lang.String> r15 = java.lang.String.class
            if (r8 != r15) goto Laa
            com.alibaba.fastjson2.writer.FieldWriterStringFunc r1 = new com.alibaba.fastjson2.writer.FieldWriterStringFunc
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r24
            r9 = r25
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            return r1
        Laa:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r8 != r0) goto Lc2
            com.alibaba.fastjson2.writer.FieldWriterDateFunc r1 = new com.alibaba.fastjson2.writer.FieldWriterDateFunc
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r24
            r9 = r25
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            return r1
        Lc2:
            java.lang.Class<java.util.UUID> r0 = java.util.UUID.class
            if (r8 != r0) goto Ldc
            com.alibaba.fastjson2.writer.FieldWriterUUIDFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterUUIDFunc
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r24
            r10 = r25
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r0
        Ldc:
            java.lang.Class<java.util.Calendar> r0 = java.util.Calendar.class
            boolean r0 = r0.isAssignableFrom(r8)
            if (r0 == 0) goto Lf8
            com.alibaba.fastjson2.writer.FieldWriterCalendarFunc r1 = new com.alibaba.fastjson2.writer.FieldWriterCalendarFunc
            r2 = r16
            r3 = r17
            r4 = r18
            r6 = r20
            r7 = r21
            r8 = r24
            r9 = r25
            r1.<init>(r2, r3, r4, r6, r7, r8, r9)
            return r1
        Lf8:
            boolean r0 = r8.isEnum()
            r1 = 1
            if (r0 == 0) goto L142
            com.alibaba.fastjson2.codec.BeanInfo r0 = new com.alibaba.fastjson2.codec.BeanInfo
            r0.<init>()
            if (r14 != 0) goto L108
            com.alibaba.fastjson2.writer.ObjectWriterProvider r14 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
        L108:
            r14.getBeanInfo(r0, r8)
            boolean r0 = r0.writeEnumAsJavaBean
            if (r0 != 0) goto L11e
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r2 = r14.cache
            java.lang.Object r2 = r2.get(r8)
            com.alibaba.fastjson2.writer.ObjectWriter r2 = (com.alibaba.fastjson2.writer.ObjectWriter) r2
            if (r2 == 0) goto L11e
            boolean r2 = r2 instanceof com.alibaba.fastjson2.writer.ObjectWriterImplEnum
            if (r2 != 0) goto L11e
            r0 = r1
        L11e:
            if (r0 != 0) goto L142
            java.lang.reflect.Member r14 = com.alibaba.fastjson2.util.BeanUtils.getEnumValueField(r8, r14)
            if (r14 != 0) goto L142
            java.lang.String[] r14 = com.alibaba.fastjson2.util.BeanUtils.getEnumAnnotationNames(r8)
            if (r14 != 0) goto L142
            com.alibaba.fastjson2.writer.FieldWriterEnumFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterEnumFunc
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r9 = r24
            r10 = r25
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r0
        L142:
            r7 = r22
            boolean r14 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r14 == 0) goto L1c2
            r14 = r7
            java.lang.reflect.ParameterizedType r14 = (java.lang.reflect.ParameterizedType) r14
            java.lang.reflect.Type r0 = r14.getRawType()
            java.lang.reflect.Type[] r14 = r14.getActualTypeArguments()
            java.lang.Class<java.util.List> r2 = java.util.List.class
            if (r0 == r2) goto L15f
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            if (r0 == r2) goto L15f
            java.lang.Class<java.lang.Iterable> r2 = java.lang.Iterable.class
            if (r0 != r2) goto L199
        L15f:
            int r2 = r14.length
            if (r2 != r1) goto L199
            r0 = 0
            r14 = r14[r0]
            if (r14 != r15) goto L17e
            com.alibaba.fastjson2.writer.FieldWriterListStrFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterListStrFunc
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r10 = r23
            r8 = r25
            r9 = r7
            r7 = r24
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r0
        L17e:
            com.alibaba.fastjson2.writer.FieldWriterListFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterListFunc
            r7 = r14
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r10 = r22
            r11 = r23
            r8 = r24
            r9 = r25
            r12 = r26
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L199:
            boolean r14 = r0 instanceof java.lang.Class
            if (r14 == 0) goto L1c2
            java.lang.Class<java.util.Map> r14 = java.util.Map.class
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r14 = r14.isAssignableFrom(r0)
            if (r14 == 0) goto L1c2
            com.alibaba.fastjson2.writer.FieldWriterMapFunction r0 = new com.alibaba.fastjson2.writer.FieldWriterMapFunction
            r9 = 0
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11, r12)
            return r0
        L1c2:
            int r14 = r23.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isFinal(r14)
            if (r14 == 0) goto L1e4
            com.alibaba.fastjson2.writer.FieldWriterObjectFuncFinal r0 = new com.alibaba.fastjson2.writer.FieldWriterObjectFuncFinal
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r0
        L1e4:
            com.alibaba.fastjson2.writer.FieldWriterObjectFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterObjectFunc
            r1 = r16
            r2 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r0
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(com.alibaba.fastjson2.writer.ObjectWriterProvider r12, java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.String r18, java.lang.reflect.Field r19, com.alibaba.fastjson2.writer.ObjectWriter r20) {
            r11 = this;
            r10 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            com.alibaba.fastjson2.writer.FieldWriter r12 = r0.createFieldWriter(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r12
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(com.alibaba.fastjson2.writer.ObjectWriterProvider r13, java.lang.String r14, int r15, long r16, java.lang.String r18, java.lang.String r19, java.lang.reflect.Field r20, com.alibaba.fastjson2.writer.ObjectWriter r21, java.lang.Class<?> r22) {
            r12 = this;
            java.lang.Class r0 = r20.getDeclaringClass()
            r1 = 0
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            if (r0 != r2) goto L1d
            java.lang.String r0 = r20.getName()
            java.lang.String r3 = "stackTrace"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L1d
            java.lang.String r0 = "getStackTrace"
            java.lang.reflect.Method r0 = com.alibaba.fastjson2.util.BeanUtils.getMethod(r2, r0)
            r9 = r0
            goto L1e
        L1d:
            r9 = r1
        L1e:
            if (r9 == 0) goto L33
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r0 = r12
            r1 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r7 = r18
            r8 = r19
            r10 = r21
            com.alibaba.fastjson2.writer.FieldWriter r13 = r0.createFieldWriter(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r13
        L33:
            r11 = r21
            java.lang.Class r8 = r20.getType()
            java.lang.reflect.Type r7 = r20.getGenericType()
            if (r11 == 0) goto L58
            com.alibaba.fastjson2.writer.FieldWriterObject r0 = new com.alibaba.fastjson2.writer.FieldWriterObject
            r10 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r9 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            r0.initValueClass = r8
            com.alibaba.fastjson2.writer.ObjectWriterProvider$VoidObjectWriter r13 = com.alibaba.fastjson2.writer.ObjectWriterProvider.VoidObjectWriter.INSTANCE
            if (r11 == r13) goto L57
            r0.initObjectWriter = r11
        L57:
            return r0
        L58:
            java.lang.Class r2 = java.lang.Boolean.TYPE
            if (r8 != r2) goto L6c
            com.alibaba.fastjson2.writer.FieldWriterBoolValField r0 = new com.alibaba.fastjson2.writer.FieldWriterBoolValField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
        L6c:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            if (r8 != r2) goto L82
            com.alibaba.fastjson2.writer.FieldWriterBoolField r0 = new com.alibaba.fastjson2.writer.FieldWriterBoolField
            r9 = r8
            r8 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9)
            return r0
        L82:
            java.lang.Class r2 = java.lang.Byte.TYPE
            if (r8 != r2) goto L96
            com.alibaba.fastjson2.writer.FieldWriterInt8ValField r0 = new com.alibaba.fastjson2.writer.FieldWriterInt8ValField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L96:
            java.lang.Class r2 = java.lang.Short.TYPE
            if (r8 != r2) goto Laa
            com.alibaba.fastjson2.writer.FieldWriterInt16ValField r0 = new com.alibaba.fastjson2.writer.FieldWriterInt16ValField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        Laa:
            java.lang.Class r2 = java.lang.Integer.TYPE
            if (r8 != r2) goto Lbe
            com.alibaba.fastjson2.writer.FieldWriterInt32Val r0 = new com.alibaba.fastjson2.writer.FieldWriterInt32Val
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        Lbe:
            r5 = r18
            java.lang.Class r2 = java.lang.Long.TYPE
            if (r8 != r2) goto Lf3
            if (r5 == 0) goto Le3
            boolean r13 = r5.isEmpty()
            if (r13 != 0) goto Le3
            java.lang.String r13 = "string"
            boolean r13 = r13.equals(r5)
            if (r13 == 0) goto Ld5
            goto Le3
        Ld5:
            com.alibaba.fastjson2.writer.FieldWriterMillisField r0 = new com.alibaba.fastjson2.writer.FieldWriterMillisField
            r1 = r14
            r2 = r15
            r3 = r16
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        Le3:
            com.alibaba.fastjson2.writer.FieldWriterInt64ValField r0 = new com.alibaba.fastjson2.writer.FieldWriterInt64ValField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        Lf3:
            java.lang.Class r2 = java.lang.Float.TYPE
            if (r8 != r2) goto L107
            com.alibaba.fastjson2.writer.FieldWriterFloatValField r0 = new com.alibaba.fastjson2.writer.FieldWriterFloatValField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L107:
            java.lang.Class<java.lang.Float> r2 = java.lang.Float.class
            if (r8 != r2) goto L11b
            com.alibaba.fastjson2.writer.FieldWriterFloatField r0 = new com.alibaba.fastjson2.writer.FieldWriterFloatField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L11b:
            java.lang.Class r2 = java.lang.Double.TYPE
            if (r8 != r2) goto L12d
            com.alibaba.fastjson2.writer.FieldWriterDoubleValField r0 = new com.alibaba.fastjson2.writer.FieldWriterDoubleValField
            r1 = r14
            r2 = r15
            r3 = r18
            r4 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L12d:
            java.lang.Class<java.lang.Double> r2 = java.lang.Double.class
            if (r8 != r2) goto L141
            com.alibaba.fastjson2.writer.FieldWriterDoubleField r0 = new com.alibaba.fastjson2.writer.FieldWriterDoubleField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L141:
            java.lang.Class r2 = java.lang.Character.TYPE
            if (r8 != r2) goto L155
            com.alibaba.fastjson2.writer.FieldWriterCharValField r0 = new com.alibaba.fastjson2.writer.FieldWriterCharValField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L155:
            java.lang.Class<java.math.BigInteger> r2 = java.math.BigInteger.class
            if (r8 != r2) goto L169
            com.alibaba.fastjson2.writer.FieldWriterBigIntField r0 = new com.alibaba.fastjson2.writer.FieldWriterBigIntField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L169:
            java.lang.Class<java.math.BigDecimal> r2 = java.math.BigDecimal.class
            if (r8 != r2) goto L17d
            com.alibaba.fastjson2.writer.FieldWriterBigDecimalField r0 = new com.alibaba.fastjson2.writer.FieldWriterBigDecimalField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L17d:
            java.lang.Class<java.util.Date> r2 = java.util.Date.class
            if (r8 != r2) goto L191
            com.alibaba.fastjson2.writer.FieldWriterDateField r0 = new com.alibaba.fastjson2.writer.FieldWriterDateField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L191:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r8 != r2) goto L1a5
            com.alibaba.fastjson2.writer.FieldWriterStringField r0 = new com.alibaba.fastjson2.writer.FieldWriterStringField
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r7 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L1a5:
            boolean r2 = r8.isEnum()
            if (r2 == 0) goto L1e5
            com.alibaba.fastjson2.codec.BeanInfo r2 = new com.alibaba.fastjson2.codec.BeanInfo
            r2.<init>()
            r13.getBeanInfo(r2, r8)
            boolean r2 = r2.writeEnumAsJavaBean
            if (r2 != 0) goto L1c6
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r3 = r13.cache
            java.lang.Object r3 = r3.get(r8)
            com.alibaba.fastjson2.writer.ObjectWriter r3 = (com.alibaba.fastjson2.writer.ObjectWriter) r3
            if (r3 == 0) goto L1c6
            boolean r3 = r3 instanceof com.alibaba.fastjson2.writer.ObjectWriterImplEnum
            if (r3 != 0) goto L1c6
            r2 = 1
        L1c6:
            java.lang.reflect.Member r13 = com.alibaba.fastjson2.util.BeanUtils.getEnumValueField(r8, r13)
            if (r13 != 0) goto L1e5
            if (r2 != 0) goto L1e5
            java.lang.String[] r13 = com.alibaba.fastjson2.util.BeanUtils.getEnumAnnotationNames(r8)
            if (r13 != 0) goto L1e5
            com.alibaba.fastjson2.writer.FieldWriterEnum r0 = new com.alibaba.fastjson2.writer.FieldWriterEnum
            r10 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r9 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r0
        L1e5:
            java.lang.Class<java.util.List> r13 = java.util.List.class
            if (r8 == r13) goto L24c
            java.lang.Class<java.util.ArrayList> r13 = java.util.ArrayList.class
            if (r8 == r13) goto L24c
            java.lang.Class<java.lang.Iterable> r13 = java.lang.Iterable.class
            if (r8 != r13) goto L1f2
            goto L24c
        L1f2:
            java.lang.Class<java.util.Map> r13 = java.util.Map.class
            boolean r13 = r13.isAssignableFrom(r8)
            if (r13 == 0) goto L211
            com.alibaba.fastjson2.writer.FieldWriterMapField r0 = new com.alibaba.fastjson2.writer.FieldWriterMapField
            java.lang.reflect.Type r7 = r20.getGenericType()
            r10 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r9 = r20
            r11 = r22
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L211:
            boolean r13 = r8.isArray()
            if (r13 == 0) goto L237
            java.lang.Class r13 = r8.getComponentType()
            boolean r13 = r13.isPrimitive()
            if (r13 != 0) goto L237
            java.lang.Class r2 = r8.getComponentType()
            com.alibaba.fastjson2.writer.FieldWriterObjectArrayField r0 = new com.alibaba.fastjson2.writer.FieldWriterObjectArrayField
            r9 = r8
            r8 = r2
            r1 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r7 = r19
            r10 = r20
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        L237:
            com.alibaba.fastjson2.writer.FieldWriterObject r0 = new com.alibaba.fastjson2.writer.FieldWriterObject
            java.lang.reflect.Type r7 = r20.getGenericType()
            r10 = 0
            r1 = r14
            r2 = r15
            r3 = r16
            r5 = r18
            r6 = r19
            r9 = r20
            r0.<init>(r1, r2, r3, r5, r6, r7, r8, r9, r10)
            return r0
        L24c:
            boolean r13 = r7 instanceof java.lang.reflect.ParameterizedType
            if (r13 == 0) goto L25a
            r13 = r7
            java.lang.reflect.ParameterizedType r13 = (java.lang.reflect.ParameterizedType) r13
            java.lang.reflect.Type[] r13 = r13.getActualTypeArguments()
            r0 = 0
            r1 = r13[r0]
        L25a:
            r2 = r1
            com.alibaba.fastjson2.writer.FieldWriterListField r0 = new com.alibaba.fastjson2.writer.FieldWriterListField
            r1 = r14
            r3 = r15
            r4 = r16
            r6 = r18
            r10 = r20
            r11 = r22
            r9 = r8
            r8 = r7
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.Class r13, long r14, com.alibaba.fastjson2.writer.ObjectWriterProvider r16, com.alibaba.fastjson2.codec.BeanInfo r17, com.alibaba.fastjson2.codec.FieldInfo r18, java.lang.reflect.Field r19) {
            r12 = this;
            r2 = r16
            r0 = r17
            r1 = r18
            r9 = r19
            r1.features = r14
            r2.getFieldInfo(r0, r1, r13, r9)
            boolean r13 = r1.ignore
            r14 = 0
            if (r13 == 0) goto L13
            return r14
        L13:
            java.lang.String r13 = r1.fieldName
            if (r13 == 0) goto L22
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L1e
            goto L22
        L1e:
            java.lang.String r13 = r1.fieldName
        L20:
            r3 = r13
            goto L2f
        L22:
            java.lang.String r13 = r9.getName()
            java.lang.String r15 = r0.namingStrategy
            if (r15 == 0) goto L20
            java.lang.String r13 = com.alibaba.fastjson2.util.BeanUtils.fieldName(r13, r15)
            goto L20
        L2f:
            java.lang.String[] r13 = r0.orders
            r15 = 0
            r4 = 1
            if (r13 == 0) goto L53
            r13 = r15
            r5 = r13
        L37:
            java.lang.String[] r6 = r0.orders
            int r7 = r6.length
            if (r13 >= r7) goto L4a
            r6 = r6[r13]
            boolean r6 = r3.equals(r6)
            if (r6 == 0) goto L47
            r1.ordinal = r13
            r5 = r4
        L47:
            int r13 = r13 + 1
            goto L37
        L4a:
            if (r5 != 0) goto L53
            int r13 = r1.ordinal
            if (r13 != 0) goto L53
            int r13 = r6.length
            r1.ordinal = r13
        L53:
            int r13 = r1.ordinal
            if (r13 != 0) goto L62
            java.lang.String r13 = r0.typeKey
            boolean r13 = r3.equals(r13)
            if (r13 == 0) goto L62
            r13 = -1
            r1.ordinal = r13
        L62:
            java.lang.String[] r13 = r0.includes
            if (r13 == 0) goto L79
            int r5 = r13.length
            if (r5 <= 0) goto L79
        L69:
            int r5 = r13.length
            if (r15 >= r5) goto L78
            r5 = r13[r15]
            boolean r5 = r5.equals(r3)
            if (r5 == 0) goto L75
            goto L79
        L75:
            int r15 = r15 + 1
            goto L69
        L78:
            return r14
        L79:
            java.lang.Class<?> r13 = r1.writeUsing
            if (r13 == 0) goto L9b
            java.lang.reflect.Constructor r13 = r13.getDeclaredConstructor(r14)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L90 java.lang.InstantiationException -> L92
            r13.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L90 java.lang.InstantiationException -> L92
            java.lang.Object r13 = r13.newInstance(r14)     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L90 java.lang.InstantiationException -> L92
            com.alibaba.fastjson2.writer.ObjectWriter r13 = (com.alibaba.fastjson2.writer.ObjectWriter) r13     // Catch: java.lang.NoSuchMethodException -> L8b java.lang.reflect.InvocationTargetException -> L8e java.lang.IllegalAccessException -> L90 java.lang.InstantiationException -> L92
            goto L9c
        L8b:
            r0 = move-exception
        L8c:
            r13 = r0
            goto L94
        L8e:
            r0 = move-exception
            goto L8c
        L90:
            r0 = move-exception
            goto L8c
        L92:
            r0 = move-exception
            goto L8c
        L94:
            java.lang.String r14 = "create writeUsing Writer error"
            ah.a.x(r14, r13)
            r13 = 0
            return r13
        L9b:
            r13 = r14
        L9c:
            r9.setAccessible(r4)     // Catch: java.lang.Throwable -> L9f
        L9f:
            if (r13 != 0) goto La7
            boolean r15 = r1.fieldClassMixIn
            if (r15 == 0) goto La7
            com.alibaba.fastjson2.writer.ObjectWriterProvider$VoidObjectWriter r13 = com.alibaba.fastjson2.writer.ObjectWriterProvider.VoidObjectWriter.INSTANCE
        La7:
            if (r13 != 0) goto Lbe
            java.lang.Class r15 = r9.getType()
            java.lang.Class<java.util.Date> r5 = java.util.Date.class
            if (r15 != r5) goto Lc0
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r14 = r2.cache
            java.lang.Object r14 = r14.get(r15)
            com.alibaba.fastjson2.writer.ObjectWriter r14 = (com.alibaba.fastjson2.writer.ObjectWriter) r14
            com.alibaba.fastjson2.writer.ObjectWriterImplDate r15 = com.alibaba.fastjson2.writer.ObjectWriterImplDate.INSTANCE
            if (r14 == r15) goto Lbe
            r13 = r14
        Lbe:
            r10 = r13
            goto L104
        Lc0:
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            boolean r5 = r5.isAssignableFrom(r15)
            if (r5 == 0) goto Lbe
            java.lang.Class<?> r5 = r1.keyUsing
            if (r5 != 0) goto Ld0
            java.lang.Class<?> r6 = r1.valueUsing
            if (r6 == 0) goto Lbe
        Ld0:
            if (r5 == 0) goto Le0
            java.lang.reflect.Constructor r5 = r5.getDeclaredConstructor(r14)     // Catch: java.lang.Exception -> Le0
            r5.setAccessible(r4)     // Catch: java.lang.Exception -> Le0
            java.lang.Object r5 = r5.newInstance(r14)     // Catch: java.lang.Exception -> Le0
            com.alibaba.fastjson2.writer.ObjectWriter r5 = (com.alibaba.fastjson2.writer.ObjectWriter) r5     // Catch: java.lang.Exception -> Le0
            goto Le1
        Le0:
            r5 = r14
        Le1:
            java.lang.Class<?> r6 = r1.valueUsing
            if (r6 == 0) goto Lf3
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r14)     // Catch: java.lang.Exception -> Lf3
            r6.setAccessible(r4)     // Catch: java.lang.Exception -> Lf3
            java.lang.Object r4 = r6.newInstance(r14)     // Catch: java.lang.Exception -> Lf3
            com.alibaba.fastjson2.writer.ObjectWriter r4 = (com.alibaba.fastjson2.writer.ObjectWriter) r4     // Catch: java.lang.Exception -> Lf3
            r14 = r4
        Lf3:
            if (r5 != 0) goto Lf7
            if (r14 == 0) goto Lbe
        Lf7:
            java.lang.Class r13 = r9.getType()
            com.alibaba.fastjson2.writer.ObjectWriterImplMap r13 = com.alibaba.fastjson2.writer.ObjectWriterImplMap.of(r13, r15)
            r13.keyWriter = r5
            r13.valueWriter = r14
            goto Lbe
        L104:
            java.lang.String r13 = r1.format
            if (r13 != 0) goto L10e
            java.lang.String r14 = r0.format
            if (r14 == 0) goto L10e
            r7 = r14
            goto L10f
        L10e:
            r7 = r13
        L10f:
            int r4 = r1.ordinal
            long r5 = r1.features
            java.lang.String r8 = r1.label
            java.lang.Class<?> r11 = r1.contentAs
            r1 = r12
            com.alibaba.fastjson2.writer.FieldWriter r13 = r1.createFieldWriter(r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return r13
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(java.lang.Class<T> r12, java.lang.String r13, int r14, long r15, java.lang.String r17, java.lang.reflect.Method r18) {
            r11 = this;
            r8 = 0
            r10 = 0
            r1 = 0
            r0 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            r9 = r18
            com.alibaba.fastjson2.writer.FieldWriter r12 = r0.createFieldWriter(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r12
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(java.lang.Class<T> r9, java.lang.String r10, java.lang.String r11, java.lang.reflect.Method r12) {
            r8 = this;
            r3 = 0
            r4 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r6 = r11
            r7 = r12
            com.alibaba.fastjson2.writer.FieldWriter r9 = r0.createFieldWriter(r1, r2, r3, r4, r6, r7)
            return r9
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(java.lang.String r11, int r12, long r13, java.lang.String r15, java.lang.String r16, java.lang.reflect.Field r17, com.alibaba.fastjson2.writer.ObjectWriter r18) {
            r10 = this;
            com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r0 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            com.alibaba.fastjson2.writer.FieldWriter r11 = r0.createFieldWriter(r1, r2, r3, r4, r6, r7, r8, r9)
            return r11
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(java.lang.String r11, int r12, long r13, java.lang.String r15, java.lang.reflect.Field r16) {
            r10 = this;
            com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r7 = 0
            r9 = 0
            r0 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r6 = r15
            r8 = r16
            com.alibaba.fastjson2.writer.FieldWriter r11 = r0.createFieldWriter(r1, r2, r3, r4, r6, r7, r8, r9)
            return r11
    }

    public <T, V> com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.String r14, long r15, java.lang.String r17, java.lang.Class r18, java.util.function.Function<T, V> r19) {
            r13 = this;
            r8 = 0
            r11 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r10 = r18
            r0 = r13
            r3 = r14
            r5 = r15
            r7 = r17
            r9 = r18
            r12 = r19
            com.alibaba.fastjson2.writer.FieldWriter r14 = r0.createFieldWriter(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r14
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.String r10, com.alibaba.fastjson2.function.ToByteFunction<T> r11) {
            r9 = this;
            com.alibaba.fastjson2.writer.FieldWriterInt8ValFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterInt8ValFunc
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r1 = r10
            r8 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.String r10, com.alibaba.fastjson2.function.ToFloatFunction<T> r11) {
            r9 = this;
            com.alibaba.fastjson2.writer.FieldWriterFloatValueFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterFloatValueFunc
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r1 = r10
            r8 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.String r10, com.alibaba.fastjson2.function.ToShortFunction<T> r11) {
            r9 = this;
            com.alibaba.fastjson2.writer.FieldWriterInt16ValFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterInt16ValFunc
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r1 = r10
            r8 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public <T, V> com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.String r14, java.lang.Class r15, java.util.function.Function<T, V> r16) {
            r13 = this;
            r8 = 0
            r11 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r10 = r15
            r0 = r13
            r3 = r14
            r9 = r15
            r12 = r16
            com.alibaba.fastjson2.writer.FieldWriter r14 = r0.createFieldWriter(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r14
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter<T> createFieldWriter(java.lang.String r11, java.lang.String r12, java.lang.reflect.Field r13) {
            r10 = this;
            com.alibaba.fastjson2.writer.ObjectWriterProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            r7 = 0
            r9 = 0
            r3 = 0
            r4 = 0
            r0 = r10
            r2 = r11
            r6 = r12
            r8 = r13
            com.alibaba.fastjson2.writer.FieldWriter r11 = r0.createFieldWriter(r1, r2, r3, r4, r6, r7, r8, r9)
            return r11
    }

    public <T, V> com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.String r14, java.lang.reflect.Type r15, java.lang.Class r16, java.util.function.Function<T, V> r17) {
            r13 = this;
            r8 = 0
            r11 = 0
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r0 = r13
            r3 = r14
            r9 = r15
            r10 = r16
            r12 = r17
            com.alibaba.fastjson2.writer.FieldWriter r14 = r0.createFieldWriter(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r14
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.String r10, java.util.function.Predicate<T> r11) {
            r9 = this;
            com.alibaba.fastjson2.writer.FieldWriterBoolValFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterBoolValFunc
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r1 = r10
            r8 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.String r10, java.util.function.ToDoubleFunction<T> r11) {
            r9 = this;
            com.alibaba.fastjson2.writer.FieldWriterDoubleValueFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterDoubleValueFunc
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r1 = r10
            r8 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.String r10, java.util.function.ToIntFunction<T> r11) {
            r9 = this;
            com.alibaba.fastjson2.writer.FieldWriterInt32ValFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterInt32ValFunc
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r1 = r10
            r8 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public <T> com.alibaba.fastjson2.writer.FieldWriter createFieldWriter(java.lang.String r10, java.util.function.ToLongFunction<T> r11) {
            r9 = this;
            com.alibaba.fastjson2.writer.FieldWriterInt64ValFunc r0 = new com.alibaba.fastjson2.writer.FieldWriterInt64ValFunc
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r1 = r10
            r8 = r11
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
    }

    public com.alibaba.fastjson2.writer.ObjectWriter createObjectWriter(java.lang.Class r4) {
            r3 = this;
            r0 = 0
            com.alibaba.fastjson2.writer.ObjectWriterProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.writer.ObjectWriter r4 = r3.createObjectWriter(r4, r0, r2)
            return r4
    }

    public com.alibaba.fastjson2.writer.ObjectWriter createObjectWriter(java.lang.Class r16, long r17, com.alibaba.fastjson2.writer.ObjectWriterProvider r19) {
            r15 = this;
            r1 = r16
            r6 = r19
            com.alibaba.fastjson2.codec.BeanInfo r7 = new com.alibaba.fastjson2.codec.BeanInfo
            r7.<init>()
            r6.getBeanInfo(r7, r1)
            java.lang.Class r0 = r7.serializer
            if (r0 == 0) goto L2b
            java.lang.Class<com.alibaba.fastjson2.writer.ObjectWriter> r2 = com.alibaba.fastjson2.writer.ObjectWriter.class
            boolean r0 = r2.isAssignableFrom(r0)
            if (r0 == 0) goto L2b
            java.lang.Class r0 = r7.serializer     // Catch: java.lang.IllegalAccessException -> L21 java.lang.InstantiationException -> L23
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.IllegalAccessException -> L21 java.lang.InstantiationException -> L23
            com.alibaba.fastjson2.writer.ObjectWriter r0 = (com.alibaba.fastjson2.writer.ObjectWriter) r0     // Catch: java.lang.IllegalAccessException -> L21 java.lang.InstantiationException -> L23
            return r0
        L21:
            r0 = move-exception
            goto L24
        L23:
            r0 = move-exception
        L24:
            java.lang.String r1 = "create serializer error"
            ah.a.x(r1, r0)
            r0 = 0
            return r0
        L2b:
            long r2 = r7.writerFeatures
            java.lang.Class[] r0 = r7.seeAlso
            if (r0 == 0) goto L37
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.WriteClassName
            long r4 = r0.mask
            long r4 = ~r4
            long r2 = r2 & r4
        L37:
            long r2 = r17 | r2
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.BeanToArray
            long r4 = r0.mask
            long r4 = ~r4
            long r4 = r4 & r2
            com.alibaba.fastjson2.JSONWriter$Feature r0 = com.alibaba.fastjson2.JSONWriter.Feature.FieldBased
            long r2 = r0.mask
            long r2 = r2 & r4
            r10 = 0
            int r0 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            r12 = 0
            if (r0 == 0) goto L4d
            r0 = 1
            goto L4e
        L4d:
            r0 = r12
        L4e:
            if (r0 == 0) goto L58
            boolean r2 = r1.isInterface()
            if (r2 == 0) goto L58
            r13 = r12
            goto L59
        L58:
            r13 = r0
        L59:
            com.alibaba.fastjson2.codec.FieldInfo r2 = new com.alibaba.fastjson2.codec.FieldInfo
            r2.<init>()
            if (r13 == 0) goto L7d
            java.util.TreeMap r8 = new java.util.TreeMap
            r8.<init>()
            com.alibaba.fastjson2.writer.a r0 = new com.alibaba.fastjson2.writer.a
            r9 = 0
            r3 = r1
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            r1 = r3
            com.alibaba.fastjson2.util.BeanUtils.declaredFields(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r2 = r8.values()
            r0.<init>(r2)
            r6 = r0
            r8 = r7
            goto Lb0
        L7d:
            java.util.TreeMap r8 = new java.util.TreeMap
            r8.<init>()
            com.alibaba.fastjson2.writer.a r0 = new com.alibaba.fastjson2.writer.a
            r9 = 1
            r6 = r19
            r3 = r1
            r1 = r15
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9)
            r1 = r3
            com.alibaba.fastjson2.util.BeanUtils.declaredFields(r1, r0)
            java.lang.Class r9 = r6.getMixIn(r1)
            boolean r14 = r7.kotlin
            com.alibaba.fastjson2.writer.a r0 = new com.alibaba.fastjson2.writer.a
            r3 = r4
            r5 = r7
            r7 = r1
            r1 = r15
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            r2 = r0
            r1 = r7
            r0 = r8
            r8 = r5
            com.alibaba.fastjson2.util.BeanUtils.getters(r1, r9, r14, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Collection r0 = r0.values()
            r2.<init>(r0)
            r6 = r2
        Lb0:
            long r2 = r8.writerFeatures
            long r4 = r17 | r2
            if (r13 != 0) goto Lc4
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto Lc4
            com.alibaba.fastjson2.writer.ObjectWriterException r0 = new com.alibaba.fastjson2.writer.ObjectWriterException
            r0.<init>(r1, r4, r6)
            return r0
        Lc4:
            r15.handleIgnores(r8, r6)
            boolean r0 = r8.alphabetic
            if (r0 == 0) goto Lce
            java.util.Collections.sort(r6)
        Lce:
            r1.getClass()
            java.lang.String r0 = r8.rootName
            if (r0 != 0) goto L17f
            int r0 = r6.size()
            switch(r0) {
                case 1: goto L164;
                case 2: goto L158;
                case 3: goto L14c;
                case 4: goto L140;
                case 5: goto L134;
                case 6: goto L128;
                case 7: goto L11c;
                case 8: goto L110;
                case 9: goto L103;
                case 10: goto Lf6;
                case 11: goto Le9;
                case 12: goto Lde;
                default: goto Ldc;
            }
        Ldc:
            goto L17f
        Lde:
            com.alibaba.fastjson2.writer.ObjectWriter12 r0 = new com.alibaba.fastjson2.writer.ObjectWriter12
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        Le9:
            com.alibaba.fastjson2.writer.ObjectWriter11 r0 = new com.alibaba.fastjson2.writer.ObjectWriter11
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        Lf6:
            com.alibaba.fastjson2.writer.ObjectWriter10 r0 = new com.alibaba.fastjson2.writer.ObjectWriter10
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        L103:
            com.alibaba.fastjson2.writer.ObjectWriter9 r0 = new com.alibaba.fastjson2.writer.ObjectWriter9
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        L110:
            com.alibaba.fastjson2.writer.ObjectWriter8 r0 = new com.alibaba.fastjson2.writer.ObjectWriter8
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        L11c:
            com.alibaba.fastjson2.writer.ObjectWriter7 r0 = new com.alibaba.fastjson2.writer.ObjectWriter7
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        L128:
            com.alibaba.fastjson2.writer.ObjectWriter6 r0 = new com.alibaba.fastjson2.writer.ObjectWriter6
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        L134:
            com.alibaba.fastjson2.writer.ObjectWriter5 r0 = new com.alibaba.fastjson2.writer.ObjectWriter5
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        L140:
            com.alibaba.fastjson2.writer.ObjectWriter4 r0 = new com.alibaba.fastjson2.writer.ObjectWriter4
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        L14c:
            com.alibaba.fastjson2.writer.ObjectWriter3 r0 = new com.alibaba.fastjson2.writer.ObjectWriter3
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        L158:
            com.alibaba.fastjson2.writer.ObjectWriter2 r0 = new com.alibaba.fastjson2.writer.ObjectWriter2
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        L164:
            java.lang.Object r0 = r6.get(r12)
            com.alibaba.fastjson2.writer.FieldWriter r0 = (com.alibaba.fastjson2.writer.FieldWriter) r0
            long r0 = r0.features
            r2 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r0 = r0 & r2
            int r0 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r0 != 0) goto L17f
            com.alibaba.fastjson2.writer.ObjectWriter1 r0 = new com.alibaba.fastjson2.writer.ObjectWriter1
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
            goto L180
        L17f:
            r0 = 0
        L180:
            if (r0 != 0) goto L19d
            r7 = r6
            r5 = r4
            java.lang.String r4 = r8.rootName
            java.lang.String r2 = r8.typeKey
            java.lang.String r3 = r8.typeName
            if (r4 == 0) goto L194
            com.alibaba.fastjson2.writer.ObjectWriterRootName r0 = new com.alibaba.fastjson2.writer.ObjectWriterRootName
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r5, r7)
            goto L19d
        L194:
            r4 = r5
            r6 = r7
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r0 = new com.alibaba.fastjson2.writer.ObjectWriterAdapter
            r1 = r16
            r0.<init>(r1, r2, r3, r4, r6)
        L19d:
            java.lang.Class<? extends com.alibaba.fastjson2.filter.Filter>[] r1 = r8.serializeFilters
            if (r1 == 0) goto L1a4
            configSerializeFilters(r8, r0)
        L1a4:
            return r0
    }

    public com.alibaba.fastjson2.writer.ObjectWriter createObjectWriter(java.lang.Class r10, long r11, com.alibaba.fastjson2.writer.FieldWriter... r13) {
            r9 = this;
            int r0 = r13.length
            if (r0 != 0) goto La
            com.alibaba.fastjson2.writer.ObjectWriterProvider r13 = com.alibaba.fastjson2.JSONFactory.defaultObjectWriterProvider
            com.alibaba.fastjson2.writer.ObjectWriter r10 = r9.createObjectWriter(r10, r11, r13)
            return r10
        La:
            int r0 = r13.length
            switch(r0) {
                case 1: goto Lb6;
                case 2: goto La8;
                case 3: goto L9a;
                case 4: goto L8c;
                case 5: goto L7e;
                case 6: goto L70;
                case 7: goto L62;
                case 8: goto L54;
                case 9: goto L46;
                case 10: goto L38;
                case 11: goto L2a;
                case 12: goto L1c;
                default: goto Le;
            }
        Le:
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r1 = new com.alibaba.fastjson2.writer.ObjectWriterAdapter
            r4 = 0
            java.util.List r7 = java.util.Arrays.asList(r13)
            r3 = 0
            r2 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r7)
            return r1
        L1c:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter12 r2 = new com.alibaba.fastjson2.writer.ObjectWriter12
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        L2a:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter11 r2 = new com.alibaba.fastjson2.writer.ObjectWriter11
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        L38:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter10 r2 = new com.alibaba.fastjson2.writer.ObjectWriter10
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        L46:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter9 r2 = new com.alibaba.fastjson2.writer.ObjectWriter9
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        L54:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter8 r2 = new com.alibaba.fastjson2.writer.ObjectWriter8
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        L62:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter7 r2 = new com.alibaba.fastjson2.writer.ObjectWriter7
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        L70:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter6 r2 = new com.alibaba.fastjson2.writer.ObjectWriter6
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        L7e:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter5 r2 = new com.alibaba.fastjson2.writer.ObjectWriter5
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        L8c:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter4 r2 = new com.alibaba.fastjson2.writer.ObjectWriter4
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        L9a:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter3 r2 = new com.alibaba.fastjson2.writer.ObjectWriter3
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        La8:
            r3 = r10
            r6 = r11
            com.alibaba.fastjson2.writer.ObjectWriter2 r2 = new com.alibaba.fastjson2.writer.ObjectWriter2
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        Lb6:
            r3 = r10
            r6 = r11
            r10 = 0
            r10 = r13[r10]
            long r10 = r10.features
            r0 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r10 = r10 & r0
            r0 = 0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 != 0) goto Ld2
            com.alibaba.fastjson2.writer.ObjectWriter1 r2 = new com.alibaba.fastjson2.writer.ObjectWriter1
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        Ld2:
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r2 = new com.alibaba.fastjson2.writer.ObjectWriterAdapter
            r5 = 0
            java.util.List r8 = java.util.Arrays.asList(r13)
            r4 = 0
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
    }

    public com.alibaba.fastjson2.writer.ObjectWriter createObjectWriter(java.lang.Class r3, com.alibaba.fastjson2.writer.FieldWriter... r4) {
            r2 = this;
            r0 = 0
            com.alibaba.fastjson2.writer.ObjectWriter r3 = r2.createObjectWriter(r3, r0, r4)
            return r3
    }

    public com.alibaba.fastjson2.writer.ObjectWriter createObjectWriter(java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r8) {
            r7 = this;
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r0 = new com.alibaba.fastjson2.writer.ObjectWriterAdapter
            r3 = 0
            r4 = 0
            r1 = 0
            r2 = 0
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r6)
            return r0
    }

    public com.alibaba.fastjson2.writer.ObjectWriter createObjectWriter(com.alibaba.fastjson2.writer.FieldWriter... r8) {
            r7 = this;
            com.alibaba.fastjson2.writer.ObjectWriterAdapter r0 = new com.alibaba.fastjson2.writer.ObjectWriterAdapter
            r4 = 0
            java.util.List r6 = java.util.Arrays.asList(r8)
            r1 = 0
            r2 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r6)
            return r0
    }

    public com.alibaba.fastjson2.writer.ObjectWriter getInitWriter(com.alibaba.fastjson2.writer.ObjectWriterProvider r9, java.lang.Class r10) {
            r8 = this;
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            r1 = 0
            if (r10 != r0) goto L1c
            long r3 = r9.userDefineMask
            r5 = 16
            long r3 = r3 & r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6a
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r9 = r9.cache
            java.lang.Object r9 = r9.get(r10)
            com.alibaba.fastjson2.writer.ObjectWriter r9 = (com.alibaba.fastjson2.writer.ObjectWriter) r9
            com.alibaba.fastjson2.writer.ObjectWriterImplDate r10 = com.alibaba.fastjson2.writer.ObjectWriterImplDate.INSTANCE
            if (r9 == r10) goto L6a
            return r9
        L1c:
            java.lang.Class r0 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r10 == r0) goto L54
            if (r10 != r3) goto L25
            goto L54
        L25:
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r10 != r0) goto L3f
            long r3 = r9.userDefineMask
            r5 = 8
            long r3 = r3 & r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L6a
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r9 = r9.cache
            java.lang.Object r9 = r9.get(r10)
            com.alibaba.fastjson2.writer.ObjectWriter r9 = (com.alibaba.fastjson2.writer.ObjectWriter) r9
            com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal r10 = com.alibaba.fastjson2.writer.ObjectWriterImplBigDecimal.INSTANCE
            if (r9 == r10) goto L6a
            return r9
        L3f:
            java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
            boolean r0 = r0.isAssignableFrom(r10)
            if (r0 == 0) goto L6a
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r9 = r9.cache
            java.lang.Object r9 = r9.get(r10)
            com.alibaba.fastjson2.writer.ObjectWriter r9 = (com.alibaba.fastjson2.writer.ObjectWriter) r9
            boolean r10 = r9 instanceof com.alibaba.fastjson2.writer.ObjectWriterImplEnum
            if (r10 != 0) goto L6a
            return r9
        L54:
            long r4 = r9.userDefineMask
            r6 = 4
            long r4 = r4 & r6
            int r10 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r10 == 0) goto L6a
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.writer.ObjectWriter> r9 = r9.cache
            java.lang.Object r9 = r9.get(r3)
            com.alibaba.fastjson2.writer.ObjectWriter r9 = (com.alibaba.fastjson2.writer.ObjectWriter) r9
            com.alibaba.fastjson2.writer.ObjectWriterImplInt64 r10 = com.alibaba.fastjson2.writer.ObjectWriterImplInt64.INSTANCE
            if (r9 == r10) goto L6a
            return r9
        L6a:
            r9 = 0
            return r9
    }

    public void handleIgnores(com.alibaba.fastjson2.codec.BeanInfo r8, java.util.List<com.alibaba.fastjson2.writer.FieldWriter> r9) {
            r7 = this;
            java.lang.String[] r0 = r8.ignores
            if (r0 == 0) goto L30
            int r0 = r0.length
            if (r0 != 0) goto L8
            goto L30
        L8:
            int r0 = r9.size()
            int r0 = r0 + (-1)
        Le:
            if (r0 < 0) goto L30
            java.lang.Object r1 = r9.get(r0)
            com.alibaba.fastjson2.writer.FieldWriter r1 = (com.alibaba.fastjson2.writer.FieldWriter) r1
            java.lang.String[] r2 = r8.ignores
            int r3 = r2.length
            r4 = 0
        L1a:
            if (r4 >= r3) goto L2d
            r5 = r2[r4]
            java.lang.String r6 = r1.fieldName
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L2a
            r9.remove(r0)
            goto L2d
        L2a:
            int r4 = r4 + 1
            goto L1a
        L2d:
            int r0 = r0 + (-1)
            goto Le
        L30:
            return
    }
}
