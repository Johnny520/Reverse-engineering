package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
final class ObjectReaderException<T> extends com.alibaba.fastjson2.reader.ObjectReaderAdapter<T> {
    static final long HASH_CAUSE = 0;
    static final long HASH_DETAIL_MESSAGE = 0;
    static final long HASH_LOCALIZED_MESSAGE = 0;
    static final long HASH_MESSAGE = 0;
    static final long HASH_STACKTRACE = 0;
    static final long HASH_SUPPRESSED_EXCEPTIONS = 0;
    static final long HASH_TYPE = 0;
    final java.lang.reflect.Constructor constructorCause;
    final java.lang.reflect.Constructor constructorDefault;
    final java.lang.reflect.Constructor constructorMessage;
    final java.lang.reflect.Constructor constructorMessageCause;
    final java.util.List<java.lang.String[]> constructorParameters;
    final java.util.List<java.lang.reflect.Constructor> constructors;
    private final com.alibaba.fastjson2.reader.FieldReader fieldReaderStackTrace;

    static {
            java.lang.String r0 = "@type"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderException.HASH_TYPE = r0
            java.lang.String r0 = "message"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderException.HASH_MESSAGE = r0
            java.lang.String r0 = "detailMessage"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderException.HASH_DETAIL_MESSAGE = r0
            java.lang.String r0 = "localizedMessage"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderException.HASH_LOCALIZED_MESSAGE = r0
            java.lang.String r0 = "cause"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderException.HASH_CAUSE = r0
            java.lang.String r0 = "stackTrace"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderException.HASH_STACKTRACE = r0
            java.lang.String r0 = "suppressedExceptions"
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r0)
            com.alibaba.fastjson2.reader.ObjectReaderException.HASH_SUPPRESSED_EXCEPTIONS = r0
            return
    }

    public ObjectReaderException(java.lang.Class<T> r5) {
            r4 = this;
            java.lang.reflect.Constructor[] r0 = com.alibaba.fastjson2.util.BeanUtils.getConstructor(r5)
            java.util.List r0 = java.util.Arrays.asList(r0)
            com.alibaba.fastjson2.reader.d r1 = new com.alibaba.fastjson2.reader.d
            r1.<init>()
            java.lang.String r2 = "stackTrace"
            java.lang.Class<java.lang.StackTraceElement[]> r3 = java.lang.StackTraceElement[].class
            com.alibaba.fastjson2.reader.FieldReader r1 = com.alibaba.fastjson2.reader.ObjectReaders.fieldReader(r2, r3, r1)
            com.alibaba.fastjson2.reader.FieldReader[] r1 = new com.alibaba.fastjson2.reader.FieldReader[]{r1}
            r4.<init>(r5, r0, r1)
            return
    }

    public ObjectReaderException(java.lang.Class<T> r18, java.util.List<java.lang.reflect.Constructor> r19, com.alibaba.fastjson2.reader.FieldReader... r20) {
            r17 = this;
            r9 = r19
            java.lang.String r3 = r18.getName()
            r6 = 0
            r7 = 0
            r2 = 0
            r4 = 0
            r0 = r17
            r1 = r18
            r8 = r20
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            r0.constructors = r9
            java.util.Iterator r1 = r9.iterator()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L1e:
            boolean r6 = r1.hasNext()
            r10 = 0
            if (r6 == 0) goto L5e
            java.lang.Object r6 = r1.next()
            java.lang.reflect.Constructor r6 = (java.lang.reflect.Constructor) r6
            if (r6 == 0) goto L1e
            if (r4 != 0) goto L1e
            int r11 = r6.getParameterCount()
            if (r11 != 0) goto L37
            r2 = r6
            goto L1e
        L37:
            java.lang.Class[] r12 = r6.getParameterTypes()
            r10 = r12[r10]
            java.lang.Class<java.lang.Throwable> r13 = java.lang.Throwable.class
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r15 = 1
            if (r11 != r15) goto L4f
            if (r10 != r14) goto L48
            r3 = r6
            goto L4f
        L48:
            boolean r16 = r13.isAssignableFrom(r10)
            if (r16 == 0) goto L4f
            r5 = r6
        L4f:
            r7 = 2
            if (r11 != r7) goto L1e
            if (r10 != r14) goto L1e
            r7 = r12[r15]
            boolean r7 = r13.isAssignableFrom(r7)
            if (r7 == 0) goto L1e
            r4 = r6
            goto L1e
        L5e:
            r0.constructorDefault = r2
            r0.constructorMessage = r3
            r0.constructorMessageCause = r4
            r0.constructorCause = r5
            com.alibaba.fastjson2.reader.e r1 = new com.alibaba.fastjson2.reader.e
            r1.<init>()
            java.util.Collections.sort(r9, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r9.size()
            r1.<init>(r2)
            r0.constructorParameters = r1
            java.util.Iterator r7 = r9.iterator()
        L7d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lbf
            java.lang.Object r1 = r7.next()
            r4 = r1
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4
            java.lang.Class[] r9 = r4.getParameterTypes()
            int r1 = r9.length
            if (r1 <= 0) goto Lb8
            java.lang.String[] r11 = com.alibaba.fastjson2.util.BeanUtils.lookupParameterNames(r4)
            com.alibaba.fastjson2.codec.FieldInfo r2 = new com.alibaba.fastjson2.codec.FieldInfo
            r2.<init>()
            java.lang.annotation.Annotation[][] r6 = r4.getParameterAnnotations()
            r5 = r10
        L9f:
            int r1 = r9.length
            if (r5 >= r1) goto Lb9
            int r1 = r11.length
            if (r5 >= r1) goto Lb9
            r2.init()
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r3 = r18
            r1.getFieldInfo(r2, r3, r4, r5, r6)
            java.lang.String r1 = r2.fieldName
            if (r1 == 0) goto Lb5
            r11[r5] = r1
        Lb5:
            int r5 = r5 + 1
            goto L9f
        Lb8:
            r11 = 0
        Lb9:
            java.util.List<java.lang.String[]> r1 = r0.constructorParameters
            r1.add(r11)
            goto L7d
        Lbf:
            int r1 = r8.length
            r7 = 0
        Lc1:
            if (r10 >= r1) goto Ld9
            r2 = r8[r10]
            java.lang.String r3 = "stackTrace"
            java.lang.String r4 = r2.fieldName
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto Ld6
            java.lang.Class r3 = r2.fieldClass
            java.lang.Class<java.lang.StackTraceElement[]> r4 = java.lang.StackTraceElement[].class
            if (r3 != r4) goto Ld6
            r7 = r2
        Ld6:
            int r10 = r10 + 1
            goto Lc1
        Ld9:
            r0.fieldReaderStackTrace = r7
            return
    }

    public static /* synthetic */ int a(java.lang.reflect.Constructor r0, java.lang.reflect.Constructor r1) {
            int r0 = lambda$new$0(r0, r1)
            return r0
    }

    private java.lang.Throwable createObject(java.lang.String r6, java.lang.Throwable r7) {
            r5 = this;
            java.lang.reflect.Constructor r0 = r5.constructorMessageCause     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            if (r7 == 0) goto L15
            if (r6 == 0) goto L15
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r0.newInstance(r6)     // Catch: java.lang.Throwable -> L13
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L13
            return r6
        L13:
            r6 = move-exception
            goto L7c
        L15:
            java.lang.reflect.Constructor r1 = r5.constructorMessage     // Catch: java.lang.Throwable -> L13
            if (r1 == 0) goto L26
            if (r6 == 0) goto L26
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r1.newInstance(r6)     // Catch: java.lang.Throwable -> L13
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L13
            return r6
        L26:
            java.lang.reflect.Constructor r2 = r5.constructorCause     // Catch: java.lang.Throwable -> L13
            if (r2 == 0) goto L37
            if (r7 == 0) goto L37
            java.lang.Object[] r6 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r2.newInstance(r6)     // Catch: java.lang.Throwable -> L13
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L13
            return r6
        L37:
            if (r0 == 0) goto L48
            if (r7 != 0) goto L3d
            if (r6 == 0) goto L48
        L3d:
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r0.newInstance(r6)     // Catch: java.lang.Throwable -> L13
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L13
            return r6
        L48:
            java.lang.reflect.Constructor r3 = r5.constructorDefault     // Catch: java.lang.Throwable -> L13
            r4 = 0
            if (r3 == 0) goto L54
            java.lang.Object r6 = r3.newInstance(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L13
            return r6
        L54:
            if (r0 == 0) goto L61
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r0.newInstance(r6)     // Catch: java.lang.Throwable -> L13
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L13
            return r6
        L61:
            if (r1 == 0) goto L6e
            java.lang.Object[] r6 = new java.lang.Object[]{r6}     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r1.newInstance(r6)     // Catch: java.lang.Throwable -> L13
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L13
            return r6
        L6e:
            if (r2 == 0) goto L7b
            java.lang.Object[] r6 = new java.lang.Object[]{r7}     // Catch: java.lang.Throwable -> L13
            java.lang.Object r6 = r2.newInstance(r6)     // Catch: java.lang.Throwable -> L13
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch: java.lang.Throwable -> L13
            return r6
        L7b:
            return r4
        L7c:
            com.alibaba.fastjson2.JSONException r7 = new com.alibaba.fastjson2.JSONException
            java.lang.Class r0 = r5.objectClass
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = r6.getMessage()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "create Exception error, class "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", "
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            r7.<init>(r0, r6)
            throw r7
    }

    private static /* synthetic */ int lambda$new$0(java.lang.reflect.Constructor r0, java.lang.reflect.Constructor r1) {
            int r0 = r0.getParameterCount()
            int r1 = r1.getParameterCount()
            if (r0 >= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            if (r0 <= r1) goto L10
            r0 = -1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderAdapter, com.alibaba.fastjson2.reader.ObjectReader
    public T readJSONBObject(com.alibaba.fastjson2.JSONReader r7, java.lang.reflect.Type r8, java.lang.Object r9, long r10) {
            r6 = this;
            byte r0 = r7.getType()
            r1 = -110(0xffffffffffffff92, float:NaN)
            if (r0 != r1) goto L17
            com.alibaba.fastjson2.JSONReader$Context r0 = r7.context
            boolean r1 = r7.isSupportAutoType(r10)
            if (r1 != 0) goto L1d
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r1 = r0.getContextAutoTypeBeforeHandler()
            if (r1 == 0) goto L17
            goto L1d
        L17:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto L5b
        L1d:
            r7.next()
            long r10 = r7.readTypeHashCode()
            com.alibaba.fastjson2.reader.ObjectReader r10 = r0.getObjectReaderAutoType(r10)
            if (r10 != 0) goto L50
            java.lang.String r10 = r7.getString()
            r11 = 0
            com.alibaba.fastjson2.reader.ObjectReader r11 = r0.getObjectReaderAutoType(r10, r11)
            if (r11 == 0) goto L37
            r0 = r11
            goto L51
        L37:
            com.alibaba.fastjson2.JSONException r8 = new com.alibaba.fastjson2.JSONException
            java.lang.String r9 = "autoType not support : "
            java.lang.String r11 = ", offset "
            java.lang.StringBuilder r9 = bc.e.o(r9, r10, r11)
            int r7 = r7.getOffset()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r8.<init>(r7)
            throw r8
        L50:
            r0 = r10
        L51:
            r4 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            java.lang.Object r7 = r0.readJSONBObject(r1, r2, r3, r4)
            return r7
        L5b:
            java.lang.Object r7 = r0.readObject(r1, r2, r3, r4)
            return r7
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReaderBean, com.alibaba.fastjson2.reader.ObjectReader
    public T readObject(com.alibaba.fastjson2.JSONReader r18, java.lang.reflect.Type r19, java.lang.Object r20, long r21) {
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r21
            boolean r4 = r0.nextIfObjectStart()
            r5 = 0
            if (r4 != 0) goto L14
            boolean r4 = r0.nextIfNullOrEmptyString()
            if (r4 == 0) goto L14
            return r5
        L14:
            r7 = r5
            r8 = r7
            r9 = r8
            r10 = r9
            r11 = r10
            r12 = r11
            r6 = 0
        L1b:
            boolean r13 = r0.nextIfObjectEnd()
            if (r13 == 0) goto L160
            java.lang.Throwable r2 = r1.createObject(r7, r8)
            if (r2 != 0) goto Lc8
            r3 = 0
        L28:
            java.util.List<java.lang.reflect.Constructor> r6 = r1.constructors
            int r6 = r6.size()
            if (r3 >= r6) goto Lc8
            java.util.List<java.lang.String[]> r6 = r1.constructorParameters
            java.lang.Object r6 = r6.get(r3)
            java.lang.String[] r6 = (java.lang.String[]) r6
            if (r6 == 0) goto L3d
            int r13 = r6.length
            if (r13 != 0) goto L41
        L3d:
            r20 = r5
            goto Lc2
        L41:
            r13 = 1
            r14 = 0
        L43:
            int r15 = r6.length
            java.lang.String r4 = "message"
            r20 = r5
            java.lang.String r5 = "cause"
            if (r14 >= r15) goto L6a
            r15 = r6[r14]
            if (r15 != 0) goto L52
            r13 = 0
            goto L6a
        L52:
            boolean r5 = r15.equals(r5)
            if (r5 != 0) goto L65
            boolean r4 = r15.equals(r4)
            if (r4 != 0) goto L65
            boolean r4 = r9.containsKey(r15)
            if (r4 != 0) goto L65
            r13 = 0
        L65:
            int r14 = r14 + 1
            r5 = r20
            goto L43
        L6a:
            if (r13 != 0) goto L6d
            goto Lc2
        L6d:
            int r2 = r6.length
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r13 = 0
        L71:
            int r14 = r6.length
            if (r13 >= r14) goto L92
            r14 = r6[r13]
            r14.getClass()
            boolean r15 = r14.equals(r5)
            if (r15 != 0) goto L8c
            boolean r15 = r14.equals(r4)
            if (r15 != 0) goto L8a
            java.lang.Object r14 = r9.get(r14)
            goto L8d
        L8a:
            r14 = r7
            goto L8d
        L8c:
            r14 = r8
        L8d:
            r2[r13] = r14
            int r13 = r13 + 1
            goto L71
        L92:
            java.util.List<java.lang.reflect.Constructor> r4 = r1.constructors
            java.lang.Object r3 = r4.get(r3)
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            java.lang.Object r2 = r3.newInstance(r2)     // Catch: java.lang.Throwable -> La1
            java.lang.Throwable r2 = (java.lang.Throwable) r2     // Catch: java.lang.Throwable -> La1
            goto Lca
        La1:
            r0 = move-exception
            com.alibaba.fastjson2.JSONException r2 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "create error, objectClass "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r0.getMessage()
            java.lang.String r5 = ", "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3, r0)
            throw r2
        Lc2:
            int r3 = r3 + 1
            r5 = r20
            goto L28
        Lc8:
            r20 = r5
        Lca:
            if (r2 == 0) goto L148
            if (r11 == 0) goto Le5
            int r3 = r11.length
            r4 = 0
            r5 = 0
        Ld1:
            if (r4 >= r3) goto Ldc
            r6 = r11[r4]
            if (r6 != 0) goto Ld9
            int r5 = r5 + 1
        Ld9:
            int r4 = r4 + 1
            goto Ld1
        Ldc:
            int r3 = r11.length
            if (r3 == 0) goto Le2
            int r3 = r11.length
            if (r5 == r3) goto Le5
        Le2:
            r2.setStackTrace(r11)
        Le5:
            if (r12 == 0) goto Lf0
            com.alibaba.fastjson2.reader.FieldReader r3 = r1.fieldReaderStackTrace
            com.alibaba.fastjson2.JSONPath r4 = com.alibaba.fastjson2.JSONPath.of(r12)
            r0.addResolveTask(r3, r2, r4)
        Lf0:
            if (r9 == 0) goto L11a
            java.util.Set r3 = r9.entrySet()
            java.util.Iterator r3 = r3.iterator()
        Lfa:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L11a
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            com.alibaba.fastjson2.reader.FieldReader r5 = r1.getFieldReader(r5)
            if (r5 == 0) goto Lfa
            java.lang.Object r4 = r4.getValue()
            r5.accept(r2, r4)
            goto Lfa
        L11a:
            if (r10 == 0) goto L147
            java.util.Set r3 = r10.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L124:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L147
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            com.alibaba.fastjson2.reader.FieldReader r5 = r1.getFieldReader(r5)
            if (r5 != 0) goto L13d
            goto L124
        L13d:
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r5.addResolveTask(r0, r2, r4)
            goto L124
        L147:
            return r2
        L148:
            java.lang.Class r2 = r1.objectClass
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "not support : "
            java.lang.String r2 = r3.concat(r2)
            java.lang.String r2 = r0.info(r2)
            java.lang.String r0 = r0.info(r2)
            ah.a.w(r0)
            return r20
        L160:
            r20 = r5
            long r4 = r0.readFieldNameHashCode()
            if (r6 != 0) goto L1ad
            long r13 = com.alibaba.fastjson2.reader.ObjectReaderException.HASH_TYPE
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 != 0) goto L1ad
            boolean r13 = r0.isSupportAutoType(r2)
            if (r13 == 0) goto L1ad
            long r4 = r0.readTypeHashCode()
            com.alibaba.fastjson2.JSONReader$Context r13 = r0.context
            com.alibaba.fastjson2.reader.ObjectReader r4 = r1.autoType(r13, r4)
            if (r4 != 0) goto L1a4
            java.lang.String r4 = r0.getString()
            java.lang.Class r5 = r1.objectClass
            com.alibaba.fastjson2.reader.ObjectReader r5 = r13.getObjectReaderAutoType(r4, r5, r2)
            if (r5 == 0) goto L18e
            r4 = r5
            goto L1a4
        L18e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "No suitable ObjectReader found for"
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r0 = r0.info(r2)
            ah.a.w(r0)
            return r20
        L1a4:
            if (r4 != r1) goto L1a8
            goto L25d
        L1a8:
            java.lang.Object r0 = r4.readObject(r0)
            return r0
        L1ad:
            long r13 = com.alibaba.fastjson2.reader.ObjectReaderException.HASH_MESSAGE
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 == 0) goto L259
            long r13 = com.alibaba.fastjson2.reader.ObjectReaderException.HASH_DETAIL_MESSAGE
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 != 0) goto L1bb
            goto L259
        L1bb:
            long r13 = com.alibaba.fastjson2.reader.ObjectReaderException.HASH_LOCALIZED_MESSAGE
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r13 != 0) goto L1c6
            r0.readString()
            goto L25d
        L1c6:
            long r13 = com.alibaba.fastjson2.reader.ObjectReaderException.HASH_CAUSE
            int r13 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            java.lang.Class<java.lang.Throwable> r14 = java.lang.Throwable.class
            if (r13 != 0) goto L1e2
            boolean r4 = r0.isReference()
            if (r4 == 0) goto L1d9
            r0.readReference()
            goto L25d
        L1d9:
            java.lang.Object r4 = r0.read(r14)
            r8 = r4
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            goto L25d
        L1e2:
            long r15 = com.alibaba.fastjson2.reader.ObjectReaderException.HASH_STACKTRACE
            int r13 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r13 != 0) goto L1fe
            boolean r4 = r0.isReference()
            if (r4 == 0) goto L1f4
            java.lang.String r12 = r0.readReference()
            goto L25d
        L1f4:
            java.lang.Class<java.lang.StackTraceElement[]> r4 = java.lang.StackTraceElement[].class
            java.lang.Object r4 = r0.read(r4)
            r11 = r4
            java.lang.StackTraceElement[] r11 = (java.lang.StackTraceElement[]) r11
            goto L25d
        L1fe:
            long r15 = com.alibaba.fastjson2.reader.ObjectReaderException.HASH_SUPPRESSED_EXCEPTIONS
            int r13 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r13 != 0) goto L221
            boolean r4 = r0.isReference()
            if (r4 == 0) goto L20e
            r0.readReference()
            goto L25d
        L20e:
            byte r4 = r0.getType()
            r5 = -110(0xffffffffffffff92, float:NaN)
            if (r4 != r5) goto L21d
            java.lang.Object r4 = r0.readAny()
            java.util.List r4 = (java.util.List) r4
            goto L25d
        L21d:
            r0.readArray(r14)
            goto L25d
        L221:
            com.alibaba.fastjson2.reader.FieldReader r4 = r1.getFieldReader(r4)
            if (r9 != 0) goto L22c
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        L22c:
            if (r4 == 0) goto L231
            java.lang.String r5 = r4.fieldName
            goto L235
        L231:
            java.lang.String r5 = r0.getFieldName()
        L235:
            boolean r13 = r0.isReference()
            if (r13 == 0) goto L24a
            java.lang.String r4 = r0.readReference()
            if (r10 != 0) goto L246
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
        L246:
            r10.put(r5, r4)
            goto L25d
        L24a:
            if (r4 == 0) goto L251
            java.lang.Object r4 = r4.readFieldValue(r0)
            goto L255
        L251:
            java.lang.Object r4 = r0.readAny()
        L255:
            r9.put(r5, r4)
            goto L25d
        L259:
            java.lang.String r7 = r0.readString()
        L25d:
            int r6 = r6 + 1
            r5 = r20
            goto L1b
    }
}
