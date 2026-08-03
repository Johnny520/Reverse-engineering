package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ObjectReaderImplList implements com.alibaba.fastjson2.reader.ObjectReader {
    static final java.lang.Class CLASS_ARRAYS_LIST = null;
    static final java.lang.Class CLASS_EMPTY_LIST = null;
    static final java.lang.Class CLASS_EMPTY_SET = null;
    static final java.lang.Class CLASS_SINGLETON = null;
    static final java.lang.Class CLASS_SINGLETON_LIST = null;
    static final java.lang.Class CLASS_UNMODIFIABLE_COLLECTION = null;
    static final java.lang.Class CLASS_UNMODIFIABLE_LIST = null;
    static final java.lang.Class CLASS_UNMODIFIABLE_SET = null;
    public static com.alibaba.fastjson2.reader.ObjectReaderImplList INSTANCE;
    public static com.alibaba.fastjson2.reader.ObjectReaderImplList JSON_ARRAY_READER;
    final java.util.function.Function builder;
    volatile boolean instanceError;
    final java.lang.Class instanceType;
    final long instanceTypeHash;
    final java.lang.Class itemClass;
    final java.lang.String itemClassName;
    final long itemClassNameHash;
    com.alibaba.fastjson2.reader.ObjectReader itemObjectReader;
    final java.lang.reflect.Type itemType;
    final java.lang.Class listClass;
    java.lang.Object listSingleton;
    final java.lang.reflect.Type listType;

    static {
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            java.lang.Class r1 = r0.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_EMPTY_SET = r1
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            java.lang.Class r2 = r1.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_EMPTY_LIST = r2
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.util.Set r3 = java.util.Collections.singleton(r2)
            java.lang.Class r3 = r3.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON = r3
            java.util.List r3 = java.util.Collections.singletonList(r2)
            java.lang.Class r3 = r3.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON_LIST = r3
            java.lang.Integer[] r2 = new java.lang.Integer[]{r2}
            java.util.List r2 = java.util.Arrays.asList(r2)
            java.lang.Class r2 = r2.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_ARRAYS_LIST = r2
            java.util.Collection r2 = java.util.Collections.unmodifiableCollection(r1)
            java.lang.Class r2 = r2.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_COLLECTION = r2
            java.util.List r1 = java.util.Collections.unmodifiableList(r1)
            java.lang.Class r1 = r1.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_LIST = r1
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            java.lang.Class r0 = r0.getClass()
            com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_SET = r0
            com.alibaba.fastjson2.reader.ObjectReaderImplList r1 = new com.alibaba.fastjson2.reader.ObjectReaderImplList
            java.lang.String r10 = "Object"
            r11 = 127970252055119(0x7463656a624f, double:6.32257052300795E-310)
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            java.lang.Class<java.util.ArrayList> r4 = java.util.ArrayList.class
            r5 = 65
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            r9 = 0
            r1.<init>(r2, r3, r4, r5, r7, r8, r9, r10, r11)
            com.alibaba.fastjson2.reader.ObjectReaderImplList.INSTANCE = r1
            com.alibaba.fastjson2.reader.ObjectReaderImplList r2 = new com.alibaba.fastjson2.reader.ObjectReaderImplList
            java.lang.String r11 = "Object"
            r12 = 127970252055119(0x7463656a624f, double:6.32257052300795E-310)
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r3 = com.alibaba.fastjson2.JSONArray.class
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r4 = com.alibaba.fastjson2.JSONArray.class
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r5 = com.alibaba.fastjson2.JSONArray.class
            r6 = 8893561198416334968(0x7b6c46ca33cd9078, double:3.3638134088297784E286)
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r9 = java.lang.Object.class
            r10 = 0
            r2.<init>(r3, r4, r5, r6, r8, r9, r10, r11, r12)
            com.alibaba.fastjson2.reader.ObjectReaderImplList.JSON_ARRAY_READER = r2
            return
    }

    public ObjectReaderImplList(java.lang.Class r7, java.lang.Object r8) {
            r6 = this;
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r5 = 0
            r2 = r7
            r3 = r7
            r0 = r6
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.listSingleton = r8
            return
    }

    private ObjectReaderImplList(java.lang.reflect.Type r1, java.lang.Class r2, java.lang.Class r3, long r4, java.lang.reflect.Type r6, java.lang.Class r7, java.util.function.Function r8, java.lang.String r9, long r10) {
            r0 = this;
            r0.<init>()
            r0.listType = r1
            r0.listClass = r2
            r0.instanceType = r3
            r0.instanceTypeHash = r4
            r0.itemType = r6
            r0.itemClass = r7
            r0.builder = r8
            r0.itemClassName = r9
            r0.itemClassNameHash = r10
            return
    }

    public ObjectReaderImplList(java.lang.reflect.Type r1, java.lang.Class r2, java.lang.Class r3, java.lang.reflect.Type r4, java.util.function.Function r5) {
            r0 = this;
            r0.<init>()
            r0.listType = r1
            r0.listClass = r2
            r0.instanceType = r3
            java.lang.String r1 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r3)
            long r1 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
            r0.instanceTypeHash = r1
            r0.itemType = r4
            java.lang.Class r1 = com.alibaba.fastjson2.util.TypeUtils.getClass(r4)
            r0.itemClass = r1
            r0.builder = r5
            if (r1 == 0) goto L24
            java.lang.String r1 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r1)
            goto L25
        L24:
            r1 = 0
        L25:
            r0.itemClassName = r1
            if (r1 == 0) goto L2e
            long r1 = com.alibaba.fastjson2.util.Fnv.hashCode64(r1)
            goto L30
        L2e:
            r1 = 0
        L30:
            r0.itemClassNameHash = r1
            return
    }

    public static /* synthetic */ java.lang.Object a(com.alibaba.fastjson2.reader.ObjectReaderImplList r0, java.lang.Object r1) {
            java.lang.Object r0 = r0.lambda$readJSONBObject$11(r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object b(java.lang.Object r0) {
            java.lang.Object r0 = lambda$of$1(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object c(java.lang.Object r0) {
            java.lang.Object r0 = lambda$of$3(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object d(java.lang.reflect.Type r0, java.lang.Object r1) {
            java.lang.Object r0 = lambda$of$0(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.Object e(java.lang.Object r0) {
            java.lang.Object r0 = lambda$of$2(r0)
            return r0
    }

    public static /* synthetic */ java.util.Collection f(java.util.Collection r0) {
            java.util.Collection r0 = lambda$readJSONBObject$7(r0)
            return r0
    }

    public static /* synthetic */ java.util.List g(java.util.List r0) {
            java.util.List r0 = lambda$readJSONBObject$10(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object h(java.lang.Object r0) {
            java.lang.Object r0 = lambda$of$6(r0)
            return r0
    }

    public static /* synthetic */ java.util.Collection i(java.util.Collection r0) {
            java.util.Collection r0 = lambda$readJSONBObject$9(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object j(java.lang.Object r0) {
            java.lang.Object r0 = lambda$of$5(r0)
            return r0
    }

    public static /* synthetic */ java.lang.Object k(java.lang.Object r0) {
            java.lang.Object r0 = lambda$of$4(r0)
            return r0
    }

    public static /* synthetic */ java.util.List l(java.util.List r0) {
            java.util.List r0 = lambda$readJSONBObject$8(r0)
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$of$0(java.lang.reflect.Type r1, java.lang.Object r2) {
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            boolean r0 = r1 instanceof java.lang.Class
            if (r0 == 0) goto L13
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.EnumSet r1 = java.util.EnumSet.noneOf(r1)
            return r1
        L13:
            java.util.EnumSet r1 = java.util.EnumSet.copyOf(r2)
            return r1
    }

    private static /* synthetic */ java.lang.Object lambda$of$1(java.lang.Object r1) {
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            java.util.Set r1 = java.util.Collections.singleton(r1)
            return r1
    }

    private static /* synthetic */ java.lang.Object lambda$of$2(java.lang.Object r1) {
            java.util.List r1 = (java.util.List) r1
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            return r1
    }

    private static /* synthetic */ java.lang.Object lambda$of$3(java.lang.Object r0) {
            java.util.List r0 = (java.util.List) r0
            java.lang.Object[] r0 = r0.toArray()
            java.util.List r0 = java.util.Arrays.asList(r0)
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$of$4(java.lang.Object r0) {
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Collection r0 = java.util.Collections.unmodifiableCollection(r0)
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$of$5(java.lang.Object r0) {
            java.util.List r0 = (java.util.List) r0
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$of$6(java.lang.Object r0) {
            java.util.Set r0 = (java.util.Set) r0
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            return r0
    }

    private static /* synthetic */ java.util.List lambda$readJSONBObject$10(java.util.List r0) {
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    private /* synthetic */ java.lang.Object lambda$readJSONBObject$11(java.lang.Object r3) {
            r2 = this;
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L15
            java.lang.reflect.Type r0 = r2.itemType
            boolean r1 = r0 instanceof java.lang.Class
            if (r1 == 0) goto L15
            java.lang.Class r0 = (java.lang.Class) r0
            java.util.EnumSet r3 = java.util.EnumSet.noneOf(r0)
            return r3
        L15:
            java.util.EnumSet r3 = java.util.EnumSet.copyOf(r3)
            return r3
    }

    private static /* synthetic */ java.util.Collection lambda$readJSONBObject$7(java.util.Collection r0) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Set r0 = java.util.Collections.singleton(r0)
            return r0
    }

    private static /* synthetic */ java.util.List lambda$readJSONBObject$8(java.util.List r1) {
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            java.util.List r1 = java.util.Collections.singletonList(r1)
            return r1
    }

    private static /* synthetic */ java.util.Collection lambda$readJSONBObject$9(java.util.Collection r0) {
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }

    public static com.alibaba.fastjson2.reader.ObjectReader of(java.lang.reflect.Type r12, java.lang.Class r13, long r14) {
            if (r13 != r12) goto L16
            java.lang.String r14 = ""
            java.lang.String r15 = r13.getSimpleName()
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L16
            java.lang.reflect.Type r12 = r13.getGenericSuperclass()
            java.lang.Class r13 = r13.getSuperclass()
        L16:
            r1 = r12
            boolean r12 = r1 instanceof java.lang.reflect.ParameterizedType
            r14 = 0
            r15 = 1
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r12 == 0) goto L32
            r12 = r1
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
            java.lang.reflect.Type r2 = r12.getRawType()
            java.lang.reflect.Type[] r12 = r12.getActualTypeArguments()
            int r3 = r12.length
            if (r3 != r15) goto L30
            r0 = r12[r14]
        L30:
            r4 = r0
            goto L4e
        L32:
            if (r13 == 0) goto L4c
            java.lang.reflect.Type r12 = r13.getGenericSuperclass()
            boolean r2 = r12 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L4c
            java.lang.reflect.ParameterizedType r12 = (java.lang.reflect.ParameterizedType) r12
            java.lang.reflect.Type r2 = r12.getRawType()
            java.lang.reflect.Type[] r12 = r12.getActualTypeArguments()
            int r3 = r12.length
            if (r3 != r15) goto L30
            r0 = r12[r14]
            goto L30
        L4c:
            r4 = r0
            r2 = r1
        L4e:
            if (r13 != 0) goto L54
            java.lang.Class r13 = com.alibaba.fastjson2.util.TypeUtils.getClass(r2)
        L54:
            r2 = r13
            java.lang.Class<java.lang.Iterable> r12 = java.lang.Iterable.class
            r13 = 3
            r0 = 2
            r3 = -1
            r5 = 0
            java.lang.Class<java.util.ArrayList> r6 = java.util.ArrayList.class
            if (r2 == r12) goto L161
            java.lang.Class<java.util.Collection> r12 = java.util.Collection.class
            if (r2 == r12) goto L161
            java.lang.Class<java.util.List> r12 = java.util.List.class
            if (r2 == r12) goto L161
            java.lang.Class<java.util.AbstractCollection> r12 = java.util.AbstractCollection.class
            if (r2 == r12) goto L161
            java.lang.Class<java.util.AbstractList> r12 = java.util.AbstractList.class
            if (r2 != r12) goto L71
            goto L161
        L71:
            java.lang.Class<java.util.Queue> r12 = java.util.Queue.class
            if (r2 == r12) goto L188
            java.lang.Class<java.util.Deque> r12 = java.util.Deque.class
            if (r2 == r12) goto L188
            java.lang.Class<java.util.AbstractSequentialList> r12 = java.util.AbstractSequentialList.class
            if (r2 != r12) goto L7f
            goto L188
        L7f:
            java.lang.Class<java.util.Set> r12 = java.util.Set.class
            java.lang.Class<java.util.HashSet> r7 = java.util.HashSet.class
            if (r2 == r12) goto L185
            java.lang.Class<java.util.AbstractSet> r12 = java.util.AbstractSet.class
            if (r2 != r12) goto L8b
            goto L185
        L8b:
            java.lang.Class<java.util.EnumSet> r12 = java.util.EnumSet.class
            r8 = 4
            if (r2 != r12) goto L98
            bc.j r12 = new bc.j
            r12.<init>(r4, r8)
        L95:
            r6 = r7
            goto L18b
        L98:
            java.lang.Class<java.util.NavigableSet> r12 = java.util.NavigableSet.class
            java.lang.Class<java.util.TreeSet> r9 = java.util.TreeSet.class
            if (r2 == r12) goto L183
            java.lang.Class<java.util.SortedSet> r12 = java.util.SortedSet.class
            if (r2 != r12) goto La4
            goto L183
        La4:
            java.lang.Class r12 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON
            if (r2 != r12) goto Lb1
            com.alibaba.fastjson2.reader.f r12 = new com.alibaba.fastjson2.reader.f
            r7 = 9
            r12.<init>(r7)
            goto L18b
        Lb1:
            java.lang.Class r12 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON_LIST
            if (r2 != r12) goto Lbe
            com.alibaba.fastjson2.reader.f r12 = new com.alibaba.fastjson2.reader.f
            r7 = 10
            r12.<init>(r7)
            goto L18b
        Lbe:
            java.lang.Class r12 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_ARRAYS_LIST
            if (r2 != r12) goto Lce
            com.alibaba.fastjson2.reader.f r6 = new com.alibaba.fastjson2.reader.f
            r7 = 11
            r6.<init>(r7)
            r11 = r6
            r6 = r12
            r12 = r11
            goto L18b
        Lce:
            java.lang.Class r12 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_COLLECTION
            if (r2 != r12) goto Ldb
            com.alibaba.fastjson2.reader.f r12 = new com.alibaba.fastjson2.reader.f
            r7 = 12
            r12.<init>(r7)
            goto L18b
        Ldb:
            java.lang.Class r12 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_LIST
            if (r2 != r12) goto Le8
            com.alibaba.fastjson2.reader.f r12 = new com.alibaba.fastjson2.reader.f
            r7 = 13
            r12.<init>(r7)
            goto L18b
        Le8:
            java.lang.Class r12 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_SET
            if (r2 != r12) goto Lf7
            com.alibaba.fastjson2.reader.f r12 = new com.alibaba.fastjson2.reader.f
            r6 = 14
            r12.<init>(r6)
            java.lang.Class<java.util.LinkedHashSet> r6 = java.util.LinkedHashSet.class
            goto L18b
        Lf7:
            java.lang.String r12 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r2)
            r12.getClass()
            int r10 = r12.hashCode()
            switch(r10) {
                case -2141919277: goto L153;
                case -2055355902: goto L148;
                case -1611113537: goto L13d;
                case -819233631: goto L132;
                case -213094136: goto L129;
                case 325959998: goto L11e;
                case 466783031: goto L113;
                case 805382106: goto L108;
                default: goto L105;
            }
        L105:
            r8 = r3
            goto L15d
        L108:
            java.lang.String r8 = "java.util.AbstractList$SubList"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L111
            goto L105
        L111:
            r8 = 7
            goto L15d
        L113:
            java.lang.String r8 = "java.util.RandomAccessSubList"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L11c
            goto L105
        L11c:
            r8 = 6
            goto L15d
        L11e:
            java.lang.String r8 = "java.util.SubList"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L127
            goto L105
        L127:
            r8 = 5
            goto L15d
        L129:
            java.lang.String r10 = "java.util.Collections$SynchronizedRandomAccessList"
            boolean r12 = r12.equals(r10)
            if (r12 != 0) goto L15d
            goto L105
        L132:
            java.lang.String r8 = "java.util.Collections$SynchronizedCollection"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L13b
            goto L105
        L13b:
            r8 = r13
            goto L15d
        L13d:
            java.lang.String r8 = "java.util.Collections$SynchronizedSet"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L146
            goto L105
        L146:
            r8 = r0
            goto L15d
        L148:
            java.lang.String r8 = "java.util.Collections$SynchronizedSortedSet"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L151
            goto L105
        L151:
            r8 = r15
            goto L15d
        L153:
            java.lang.String r8 = "java.util.AbstractList$RandomAccessSubList"
            boolean r12 = r12.equals(r8)
            if (r12 != 0) goto L15c
            goto L105
        L15c:
            r8 = r14
        L15d:
            switch(r8) {
                case 0: goto L161;
                case 1: goto L17a;
                case 2: goto L173;
                case 3: goto L16b;
                case 4: goto L163;
                case 5: goto L161;
                case 6: goto L161;
                case 7: goto L161;
                default: goto L160;
            }
        L160:
            r6 = r2
        L161:
            r12 = r5
            goto L18b
        L163:
            com.alibaba.fastjson2.reader.f r12 = new com.alibaba.fastjson2.reader.f
            r7 = 15
            r12.<init>(r7)
            goto L18b
        L16b:
            com.alibaba.fastjson2.reader.f r12 = new com.alibaba.fastjson2.reader.f
            r7 = 16
            r12.<init>(r7)
            goto L18b
        L173:
            com.alibaba.fastjson2.reader.f r12 = new com.alibaba.fastjson2.reader.f
            r12.<init>(r14)
            goto L95
        L17a:
            com.alibaba.fastjson2.reader.f r12 = new com.alibaba.fastjson2.reader.f
            r6 = 8
            r12.<init>(r6)
        L181:
            r6 = r9
            goto L18b
        L183:
            r12 = r5
            goto L181
        L185:
            r12 = r5
            goto L95
        L188:
            java.lang.Class<java.util.LinkedList> r6 = java.util.LinkedList.class
            goto L161
        L18b:
            java.lang.String r7 = com.alibaba.fastjson2.util.TypeUtils.getTypeName(r1)
            r7.getClass()
            int r8 = r7.hashCode()
            switch(r8) {
                case -1815537371: goto L1bc;
                case -413656092: goto L1b1;
                case 61358428: goto L1a6;
                case 357082875: goto L19b;
                default: goto L199;
            }
        L199:
            r14 = r3
            goto L1c5
        L19b:
            java.lang.String r14 = "kotlin.collections.EmptySet"
            boolean r14 = r7.equals(r14)
            if (r14 != 0) goto L1a4
            goto L199
        L1a4:
            r14 = r13
            goto L1c5
        L1a6:
            java.lang.String r13 = "java.util.Collections$EmptyList"
            boolean r13 = r7.equals(r13)
            if (r13 != 0) goto L1af
            goto L199
        L1af:
            r14 = r0
            goto L1c5
        L1b1:
            java.lang.String r13 = "java.util.Collections$EmptySet"
            boolean r13 = r7.equals(r13)
            if (r13 != 0) goto L1ba
            goto L199
        L1ba:
            r14 = r15
            goto L1c5
        L1bc:
            java.lang.String r13 = "kotlin.collections.EmptyList"
            boolean r13 = r7.equals(r13)
            if (r13 != 0) goto L1c5
            goto L199
        L1c5:
            switch(r14) {
                case 0: goto L212;
                case 1: goto L208;
                case 2: goto L1fe;
                case 3: goto L212;
                default: goto L1c8;
            }
        L1c8:
            java.lang.Class r13 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_EMPTY_SET
            if (r1 == r13) goto L1f1
            java.lang.Class r13 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_EMPTY_LIST
            if (r1 != r13) goto L1d1
            goto L1f1
        L1d1:
            java.lang.Class<java.lang.String> r13 = java.lang.String.class
            if (r4 != r13) goto L1dd
            if (r12 != 0) goto L1dd
            com.alibaba.fastjson2.reader.ObjectReaderImplListStr r12 = new com.alibaba.fastjson2.reader.ObjectReaderImplListStr
            r12.<init>(r2, r6)
            return r12
        L1dd:
            java.lang.Class<java.lang.Long> r13 = java.lang.Long.class
            if (r4 != r13) goto L1e9
            if (r12 != 0) goto L1e9
            com.alibaba.fastjson2.reader.ObjectReaderImplListInt64 r12 = new com.alibaba.fastjson2.reader.ObjectReaderImplListInt64
            r12.<init>(r2, r6)
            return r12
        L1e9:
            com.alibaba.fastjson2.reader.ObjectReaderImplList r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplList
            r5 = r12
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L1f1:
            com.alibaba.fastjson2.reader.ObjectReaderImplList r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplList
            r2 = r1
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            r5 = 0
            r3 = r2
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L1fe:
            com.alibaba.fastjson2.reader.ObjectReaderImplList r12 = new com.alibaba.fastjson2.reader.ObjectReaderImplList
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.List r13 = java.util.Collections.EMPTY_LIST
            r12.<init>(r1, r13)
            return r12
        L208:
            com.alibaba.fastjson2.reader.ObjectReaderImplList r12 = new com.alibaba.fastjson2.reader.ObjectReaderImplList
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.Set r13 = java.util.Collections.EMPTY_SET
            r12.<init>(r1, r13)
            return r12
        L212:
            r12 = r1
            java.lang.Class r12 = (java.lang.Class) r12
            java.lang.String r13 = "INSTANCE"
            java.lang.reflect.Field r13 = r12.getField(r13)     // Catch: java.lang.IllegalAccessException -> L225 java.lang.NoSuchFieldException -> L228
            boolean r14 = r13.isAccessible()     // Catch: java.lang.IllegalAccessException -> L225 java.lang.NoSuchFieldException -> L228
            if (r14 != 0) goto L22a
            r13.setAccessible(r15)     // Catch: java.lang.IllegalAccessException -> L225 java.lang.NoSuchFieldException -> L228
            goto L22a
        L225:
            r0 = move-exception
        L226:
            r12 = r0
            goto L234
        L228:
            r0 = move-exception
            goto L226
        L22a:
            java.lang.Object r13 = r13.get(r5)     // Catch: java.lang.IllegalAccessException -> L225 java.lang.NoSuchFieldException -> L228
            com.alibaba.fastjson2.reader.ObjectReaderImplList r14 = new com.alibaba.fastjson2.reader.ObjectReaderImplList
            r14.<init>(r12, r13)
            return r14
        L234:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r15 = "Failed to get singleton of "
            r14.<init>(r15)
            r14.append(r1)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14, r12)
            throw r13
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(long r4) {
            r3 = this;
            java.lang.Class r4 = r3.instanceType
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            if (r4 != r5) goto Lc
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
        Lc:
            java.lang.Class<java.util.LinkedList> r5 = java.util.LinkedList.class
            if (r4 != r5) goto L16
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            return r4
        L16:
            java.lang.Class<java.util.HashSet> r5 = java.util.HashSet.class
            if (r4 != r5) goto L20
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            return r4
        L20:
            java.lang.Class<java.util.LinkedHashSet> r5 = java.util.LinkedHashSet.class
            if (r4 != r5) goto L2a
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            return r4
        L2a:
            java.lang.Class<java.util.TreeSet> r5 = java.util.TreeSet.class
            if (r4 != r5) goto L34
            java.util.TreeSet r4 = new java.util.TreeSet
            r4.<init>()
            return r4
        L34:
            java.lang.Object r5 = r3.listSingleton
            if (r5 == 0) goto L39
            return r5
        L39:
            if (r4 == 0) goto L96
            boolean r4 = r3.instanceError
            java.lang.String r5 = "create list error, type "
            r0 = 1
            if (r4 != 0) goto L5f
            java.lang.Class r4 = r3.instanceType     // Catch: java.lang.Throwable -> L49
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.Throwable -> L49
            return r4
        L49:
            r3.instanceError = r0
            com.alibaba.fastjson2.JSONException r4 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.Class r2 = r3.instanceType
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.<init>(r1)
            goto L60
        L5f:
            r4 = 0
        L60:
            boolean r1 = r3.instanceError
            if (r1 == 0) goto L92
            java.lang.Class r1 = r3.instanceType
            java.lang.Class r1 = r1.getSuperclass()
            java.lang.Class<java.util.List> r2 = java.util.List.class
            boolean r1 = r2.isAssignableFrom(r1)
            if (r1 == 0) goto L92
            java.lang.Class r4 = r3.instanceType     // Catch: java.lang.Throwable -> L7d
            java.lang.Class r4 = r4.getSuperclass()     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r4 = r4.newInstance()     // Catch: java.lang.Throwable -> L7d
            return r4
        L7d:
            r3.instanceError = r0
            com.alibaba.fastjson2.JSONException r4 = new com.alibaba.fastjson2.JSONException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            java.lang.Class r5 = r3.instanceType
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r4.<init>(r5)
        L92:
            if (r4 != 0) goto L95
            goto L96
        L95:
            throw r4
        L96:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object createInstance(java.util.Collection r9, long r10) {
            r8 = this;
            int r0 = r9.size()
            if (r0 != 0) goto L1a
            java.lang.Class r0 = r8.listClass
            java.lang.Class<java.util.List> r1 = java.util.List.class
            if (r0 != r1) goto L1a
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.function.Function r10 = r8.builder
            if (r10 == 0) goto L19
            java.lang.Object r9 = r10.apply(r9)
        L19:
            return r9
        L1a:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class r1 = r8.instanceType
            java.lang.Class<java.util.ArrayList> r2 = java.util.ArrayList.class
            if (r1 != r2) goto L2c
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r9.size()
            r1.<init>(r2)
            goto L32
        L2c:
            java.lang.Object r1 = r8.createInstance(r10)
            java.util.Collection r1 = (java.util.Collection) r1
        L32:
            java.util.Iterator r9 = r9.iterator()
        L36:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L105
            java.lang.Object r2 = r9.next()
            if (r2 != 0) goto L47
            r2 = 0
            r1.add(r2)
            goto L36
        L47:
            java.lang.Class r3 = r2.getClass()
            java.lang.Class<com.alibaba.fastjson2.JSONObject> r4 = com.alibaba.fastjson2.JSONObject.class
            if (r3 == r4) goto L55
            java.lang.Class r4 = com.alibaba.fastjson2.JSONFactory.getClassJSONObject1x()
            if (r3 != r4) goto L6f
        L55:
            java.lang.Class r4 = r8.itemClass
            if (r4 == r3) goto L6f
            com.alibaba.fastjson2.reader.ObjectReader r3 = r8.itemObjectReader
            if (r3 != 0) goto L65
            java.lang.reflect.Type r3 = r8.itemType
            com.alibaba.fastjson2.reader.ObjectReader r3 = r0.getObjectReader(r3)
            r8.itemObjectReader = r3
        L65:
            com.alibaba.fastjson2.reader.ObjectReader r3 = r8.itemObjectReader
            com.alibaba.fastjson2.JSONObject r2 = (com.alibaba.fastjson2.JSONObject) r2
            java.lang.Object r2 = r3.createInstance(r2, r10)
            goto L100
        L6f:
            java.lang.reflect.Type r4 = r8.itemType
            if (r3 == r4) goto L100
            java.util.function.Function r4 = r0.getTypeConvert(r3, r4)
            if (r4 == 0) goto L7f
            java.lang.Object r2 = r4.apply(r2)
            goto L100
        L7f:
            boolean r4 = r2 instanceof java.util.Map
            if (r4 == 0) goto L98
            java.util.Map r2 = (java.util.Map) r2
            com.alibaba.fastjson2.reader.ObjectReader r3 = r8.itemObjectReader
            if (r3 != 0) goto L91
            java.lang.reflect.Type r3 = r8.itemType
            com.alibaba.fastjson2.reader.ObjectReader r3 = r0.getObjectReader(r3)
            r8.itemObjectReader = r3
        L91:
            com.alibaba.fastjson2.reader.ObjectReader r3 = r8.itemObjectReader
            java.lang.Object r2 = r3.createInstance(r2, r10)
            goto L100
        L98:
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto Lb1
            com.alibaba.fastjson2.reader.ObjectReader r3 = r8.itemObjectReader
            if (r3 != 0) goto La8
            java.lang.reflect.Type r3 = r8.itemType
            com.alibaba.fastjson2.reader.ObjectReader r3 = r0.getObjectReader(r3)
            r8.itemObjectReader = r3
        La8:
            com.alibaba.fastjson2.reader.ObjectReader r3 = r8.itemObjectReader
            java.util.Collection r2 = (java.util.Collection) r2
            java.lang.Object r2 = r3.createInstance(r2, r10)
            goto L100
        Lb1:
            java.lang.Class r4 = r8.itemClass
            boolean r4 = r4.isInstance(r2)
            if (r4 == 0) goto Lba
            goto L100
        Lba:
            java.lang.Class<java.lang.Enum> r4 = java.lang.Enum.class
            java.lang.Class r5 = r8.itemClass
            boolean r4 = r4.isAssignableFrom(r5)
            java.lang.String r5 = " to "
            java.lang.String r6 = "can not convert from "
            if (r4 == 0) goto Lf2
            com.alibaba.fastjson2.reader.ObjectReader r4 = r8.itemObjectReader
            if (r4 != 0) goto Ld4
            java.lang.reflect.Type r4 = r8.itemType
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.getObjectReader(r4)
            r8.itemObjectReader = r4
        Ld4:
            com.alibaba.fastjson2.reader.ObjectReader r4 = r8.itemObjectReader
            boolean r7 = r4 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplEnum
            if (r7 == 0) goto Le3
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum r4 = (com.alibaba.fastjson2.reader.ObjectReaderImplEnum) r4
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Enum r2 = r4.getEnum(r2)
            goto L100
        Le3:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r3)
            java.lang.reflect.Type r10 = r8.itemType
            ah.a.s(r9, r5, r10)
        Lf0:
            r9 = 0
            return r9
        Lf2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r6)
            r9.append(r3)
            java.lang.reflect.Type r10 = r8.itemType
            ah.a.s(r9, r5, r10)
            goto Lf0
        L100:
            r1.add(r2)
            goto L36
        L105:
            java.util.function.Function r9 = r8.builder
            if (r9 == 0) goto L10e
            java.lang.Object r9 = r9.apply(r1)
            return r9
        L10e:
            return r1
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.util.function.Function getBuildFunction() {
            r1 = this;
            java.util.function.Function r0 = r1.builder
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Class getObjectClass() {
            r1 = this;
            java.lang.Class r0 = r1.listClass
            return r0
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readJSONBObject(com.alibaba.fastjson2.JSONReader r17, java.lang.reflect.Type r18, java.lang.Object r19, long r20) {
            r16 = this;
            r1 = r16
            r0 = r18
            boolean r2 = r17.nextIfNull()
            r8 = 0
            if (r2 == 0) goto Lc
            return r8
        Lc:
            java.lang.Class r3 = r1.listClass
            r4 = 0
            r2 = r17
            r6 = r20
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.checkAutoType(r3, r4, r6)
            java.util.function.Function r4 = r1.builder
            java.lang.Class r5 = r1.instanceType
            java.lang.Class<java.util.LinkedHashSet> r6 = java.util.LinkedHashSet.class
            java.lang.Class<java.util.ArrayList> r7 = java.util.ArrayList.class
            if (r3 == 0) goto L6d
            boolean r5 = r3 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplList
            if (r5 == 0) goto L2f
            com.alibaba.fastjson2.reader.ObjectReaderImplList r3 = (com.alibaba.fastjson2.reader.ObjectReaderImplList) r3
            java.lang.Class r4 = r3.instanceType
            java.util.function.Function r3 = r3.builder
            r5 = r4
            r4 = r3
            goto L34
        L2f:
            java.lang.Class r3 = r3.getObjectClass()
            r5 = r3
        L34:
            java.lang.Class r3 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_COLLECTION
            if (r5 != r3) goto L40
            com.alibaba.fastjson2.reader.f r4 = new com.alibaba.fastjson2.reader.f
            r3 = 1
            r4.<init>(r3)
        L3e:
            r5 = r7
            goto L6d
        L40:
            java.lang.Class r3 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_LIST
            if (r5 != r3) goto L4b
            com.alibaba.fastjson2.reader.f r4 = new com.alibaba.fastjson2.reader.f
            r3 = 2
            r4.<init>(r3)
            goto L3e
        L4b:
            java.lang.Class r3 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_SET
            if (r5 != r3) goto L57
            com.alibaba.fastjson2.reader.f r4 = new com.alibaba.fastjson2.reader.f
            r3 = 3
            r4.<init>(r3)
            r5 = r6
            goto L6d
        L57:
            java.lang.Class r3 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON
            if (r5 != r3) goto L62
            com.alibaba.fastjson2.reader.f r4 = new com.alibaba.fastjson2.reader.f
            r3 = 4
            r4.<init>(r3)
            goto L3e
        L62:
            java.lang.Class r3 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON_LIST
            if (r5 != r3) goto L6d
            com.alibaba.fastjson2.reader.f r4 = new com.alibaba.fastjson2.reader.f
            r3 = 5
            r4.<init>(r3)
            goto L3e
        L6d:
            int r9 = r2.startArray()
            if (r9 <= 0) goto L81
            com.alibaba.fastjson2.reader.ObjectReader r3 = r1.itemObjectReader
            if (r3 != 0) goto L81
            com.alibaba.fastjson2.JSONReader$Context r3 = r2.context
            java.lang.reflect.Type r10 = r1.itemType
            com.alibaba.fastjson2.reader.ObjectReader r3 = r3.getObjectReader(r10)
            r1.itemObjectReader = r3
        L81:
            java.lang.Class r3 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_ARRAYS_LIST
            java.lang.String r10 = ".."
            r11 = 0
            if (r5 != r3) goto Lc5
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.util.List r12 = java.util.Arrays.asList(r0)
        L8e:
            if (r11 >= r9) goto Lc4
            boolean r3 = r2.isReference()
            if (r3 == 0) goto Lae
            java.lang.String r3 = r2.readReference()
            boolean r4 = r10.equals(r3)
            if (r4 == 0) goto La2
            r3 = r12
            goto Laa
        La2:
            com.alibaba.fastjson2.JSONPath r3 = com.alibaba.fastjson2.JSONPath.of(r3)
            r2.addResolveTask(r12, r11, r3)
            r3 = r8
        Laa:
            r15 = r3
            r3 = r2
            r2 = r15
            goto Lbe
        Lae:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.itemObjectReader
            java.lang.reflect.Type r4 = r1.itemType
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r3 = r17
            r6 = r20
            java.lang.Object r2 = r2.readJSONBObject(r3, r4, r5, r6)
        Lbe:
            r0[r11] = r2
            int r11 = r11 + 1
            r2 = r3
            goto L8e
        Lc4:
            return r12
        Lc5:
            r3 = r2
            if (r5 != r7) goto Ld7
            java.util.ArrayList r2 = new java.util.ArrayList
            if (r9 <= 0) goto Ld0
            r2.<init>(r9)
            goto Ld3
        Ld0:
            r2.<init>()
        Ld3:
            r12 = r2
            r13 = r4
            goto L17d
        Ld7:
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r2 = com.alibaba.fastjson2.JSONArray.class
            if (r5 != r2) goto Le7
            com.alibaba.fastjson2.JSONArray r2 = new com.alibaba.fastjson2.JSONArray
            if (r9 <= 0) goto Le3
            r2.<init>(r9)
            goto Ld3
        Le3:
            r2.<init>()
            goto Ld3
        Le7:
            java.lang.Class<java.util.HashSet> r2 = java.util.HashSet.class
            if (r5 != r2) goto Lf1
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            goto Ld3
        Lf1:
            if (r5 != r6) goto Lf9
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            goto Ld3
        Lf9:
            java.lang.Class<java.util.TreeSet> r2 = java.util.TreeSet.class
            if (r5 != r2) goto L103
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            goto Ld3
        L103:
            java.lang.Class r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_EMPTY_SET
            if (r5 != r2) goto L10a
            java.util.Set r2 = java.util.Collections.EMPTY_SET
            goto Ld3
        L10a:
            java.lang.Class r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_EMPTY_LIST
            if (r5 != r2) goto L111
            java.util.List r2 = java.util.Collections.EMPTY_LIST
            goto Ld3
        L111:
            java.lang.Class r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON_LIST
            if (r5 != r2) goto L121
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.alibaba.fastjson2.reader.f r4 = new com.alibaba.fastjson2.reader.f
            r6 = 6
            r4.<init>(r6)
            goto Ld3
        L121:
            java.lang.Class r2 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_LIST
            if (r5 != r2) goto L131
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.alibaba.fastjson2.reader.f r4 = new com.alibaba.fastjson2.reader.f
            r6 = 7
            r4.<init>(r6)
            goto Ld3
        L131:
            if (r5 == 0) goto L147
            java.lang.Class<java.util.EnumSet> r2 = java.util.EnumSet.class
            boolean r2 = r2.isAssignableFrom(r5)
            if (r2 == 0) goto L147
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            bc.j r4 = new bc.j
            r6 = 5
            r4.<init>(r1, r6)
            goto Ld3
        L147:
            if (r5 == 0) goto L16f
            java.lang.reflect.Type r2 = r1.listType
            if (r5 == r2) goto L16f
            java.lang.Object r2 = r5.newInstance()     // Catch: java.lang.IllegalAccessException -> L155 java.lang.InstantiationException -> L157
            java.util.Collection r2 = (java.util.Collection) r2     // Catch: java.lang.IllegalAccessException -> L155 java.lang.InstantiationException -> L157
            goto Ld3
        L155:
            r0 = move-exception
            goto L158
        L157:
            r0 = move-exception
        L158:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "create instance error "
            r2.<init>(r4)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            java.lang.String r2 = r3.info(r2)
            ah.a.x(r2, r0)
            r0 = 0
            return r0
        L16f:
            com.alibaba.fastjson2.JSONReader$Context r2 = r3.context
            long r6 = r2.features
            long r6 = r6 | r20
            java.lang.Object r2 = r1.createInstance(r6)
            java.util.Collection r2 = (java.util.Collection) r2
            goto Ld3
        L17d:
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.itemObjectReader
            java.lang.reflect.Type r4 = r1.itemType
            if (r0 == 0) goto L1fc
            if (r0 == r5) goto L1fc
            boolean r5 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L1fc
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            int r5 = r0.length
            r6 = 1
            if (r5 != r6) goto L1fc
            r4 = r0[r11]
            java.lang.reflect.Type r0 = r1.itemType
            if (r4 == r0) goto L1fc
            com.alibaba.fastjson2.reader.ObjectReader r2 = r3.getObjectReader(r4)
            goto L1fc
        L19f:
            if (r11 >= r9) goto L1ff
            boolean r2 = r3.isReference()
            if (r2 == 0) goto L1c7
            java.lang.String r2 = r3.readReference()
            boolean r4 = r10.equals(r2)
            if (r4 == 0) goto L1b3
            r2 = r12
            goto L1bf
        L1b3:
            com.alibaba.fastjson2.JSONPath r2 = com.alibaba.fastjson2.JSONPath.of(r2)
            r3.addResolveTask(r12, r11, r2)
            boolean r2 = r12 instanceof java.util.List
            if (r2 == 0) goto L1c4
            r2 = r8
        L1bf:
            r4 = r2
            r2 = r0
            r0 = r4
            r4 = r14
            goto L1f5
        L1c4:
            r2 = r0
            r4 = r14
            goto L1f8
        L1c7:
            java.lang.Class r3 = r1.itemClass
            long r4 = r1.itemClassNameHash
            r2 = r17
            r6 = r20
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.checkAutoType(r3, r4, r6)
            if (r3 == 0) goto L1e7
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r6 = r20
            r2 = r3
            r4 = r14
            r3 = r17
            java.lang.Object r2 = r2.readJSONBObject(r3, r4, r5, r6)
            r15 = r2
            r2 = r0
            r0 = r15
            goto L1f5
        L1e7:
            r4 = r14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
            r3 = r17
            r6 = r20
            r2 = r0
            java.lang.Object r0 = r2.readJSONBObject(r3, r4, r5, r6)
        L1f5:
            r12.add(r0)
        L1f8:
            int r11 = r11 + 1
            r3 = r17
        L1fc:
            r0 = r2
            r14 = r4
            goto L19f
        L1ff:
            if (r13 == 0) goto L206
            java.lang.Object r0 = r13.apply(r12)
            return r0
        L206:
            return r12
    }

    @Override // com.alibaba.fastjson2.reader.ObjectReader
    public java.lang.Object readObject(com.alibaba.fastjson2.JSONReader r11, java.lang.reflect.Type r12, java.lang.Object r13, long r14) {
            r10 = this;
            com.alibaba.fastjson2.JSONReader$Context r0 = r11.context
            com.alibaba.fastjson2.reader.ObjectReader r1 = r10.itemObjectReader
            if (r1 != 0) goto Le
            java.lang.reflect.Type r1 = r10.itemType
            com.alibaba.fastjson2.reader.ObjectReader r1 = r0.getObjectReader(r1)
            r10.itemObjectReader = r1
        Le:
            boolean r1 = r11.jsonb
            if (r1 == 0) goto L1d
            r6 = 0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            java.lang.Object r11 = r2.readJSONBObject(r3, r4, r5, r6)
            return r11
        L1d:
            r2 = r10
            r4 = r11
            r11 = r12
            boolean r12 = r4.readIfNull()
            r13 = 0
            if (r12 == 0) goto L28
            return r13
        L28:
            boolean r12 = r4.nextIfSet()
            if (r12 == 0) goto L34
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            goto L3d
        L34:
            long r5 = r0.features
            long r5 = r5 | r14
            java.lang.Object r12 = r10.createInstance(r5)
            java.util.Collection r12 = (java.util.Collection) r12
        L3d:
            char r1 = r4.current()
            r3 = 34
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            if (r1 != r3) goto Lbc
            java.lang.String r11 = r4.readString()
            java.lang.Class r1 = r2.itemClass
            if (r1 != r9) goto L56
            r4.nextIfComma()
            r12.add(r11)
            return r12
        L56:
            boolean r1 = r11.isEmpty()
            if (r1 == 0) goto L60
            r4.nextIfComma()
            return r13
        L60:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = r0.getProvider()
            java.lang.Class r3 = r2.itemClass
            boolean r3 = r3.isEnum()
            if (r3 == 0) goto L9e
            java.lang.Class r3 = r2.itemClass
            com.alibaba.fastjson2.reader.ObjectReader r1 = r1.getObjectReader(r3)
            boolean r3 = r1 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplEnum
            if (r3 == 0) goto L9e
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum r1 = (com.alibaba.fastjson2.reader.ObjectReaderImplEnum) r1
            java.lang.Enum r0 = r1.getEnum(r11)
            if (r0 != 0) goto L9a
            com.alibaba.fastjson2.JSONReader$Feature r12 = com.alibaba.fastjson2.JSONReader.Feature.ErrorOnEnumNotMatch
            long r14 = r4.features(r14)
            boolean r12 = r12.isEnabled(r14)
            if (r12 != 0) goto L8b
            return r13
        L8b:
            java.lang.String r12 = "enum not match : "
            java.lang.String r11 = r12.concat(r11)
            java.lang.String r11 = r4.info(r11)
            ah.a.w(r11)
            r11 = 0
            return r11
        L9a:
            r12.add(r0)
            return r12
        L9e:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r13 = r0.provider
            java.lang.reflect.Type r14 = r2.itemType
            java.util.function.Function r13 = r13.getTypeConvert(r9, r14)
            if (r13 == 0) goto Lb3
            java.lang.Object r11 = r13.apply(r11)
            r4.nextIfComma()
            r12.add(r11)
            return r12
        Lb3:
            java.lang.String r11 = r4.info()
            ah.a.w(r11)
            r11 = 0
            return r11
        Lbc:
            r13 = 91
            r14 = 0
            if (r1 != r13) goto L15a
            r4.next()
            com.alibaba.fastjson2.reader.ObjectReader r13 = r2.itemObjectReader
            java.lang.reflect.Type r15 = r2.itemType
            if (r11 == 0) goto Le6
            java.lang.reflect.Type r0 = r2.listType
            if (r11 == r0) goto Le6
            boolean r0 = r11 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto Le6
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type[] r11 = r11.getActualTypeArguments()
            int r0 = r11.length
            r1 = 1
            if (r0 != r1) goto Le6
            r15 = r11[r14]
            java.lang.reflect.Type r11 = r2.itemType
            if (r15 == r11) goto Le6
            com.alibaba.fastjson2.reader.ObjectReader r13 = r4.getObjectReader(r15)
        Le6:
            r3 = r13
            r5 = r15
        Le8:
            boolean r11 = r4.nextIfArrayEnd()
            if (r11 == 0) goto Lfb
            r4.nextIfComma()
            java.util.function.Function r11 = r2.builder
            if (r11 == 0) goto Lfa
            java.lang.Object r11 = r11.apply(r12)
            return r11
        Lfa:
            return r12
        Lfb:
            char r11 = r4.current()
            r13 = 44
            if (r11 == r13) goto L14f
            if (r5 != r9) goto L10a
            java.lang.String r11 = r4.readString()
            goto L132
        L10a:
            if (r3 == 0) goto L138
            boolean r11 = r4.isReference()
            if (r11 == 0) goto L128
            java.lang.String r11 = r4.readReference()
            java.lang.String r13 = ".."
            boolean r13 = r13.equals(r11)
            if (r13 == 0) goto L120
            r11 = r2
            goto L132
        L120:
            com.alibaba.fastjson2.JSONPath r11 = com.alibaba.fastjson2.JSONPath.of(r11)
            r4.addResolveTask(r12, r14, r11)
            goto L135
        L128:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r7 = 0
            java.lang.Object r11 = r3.readObject(r4, r5, r6, r7)
        L132:
            r12.add(r11)
        L135:
            int r14 = r14 + 1
            goto Le8
        L138:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "TODO : "
            r11.<init>(r12)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            java.lang.String r11 = r4.info(r11)
            ah.a.w(r11)
            r11 = 0
            return r11
        L14f:
            java.lang.String r11 = "illegal input error"
            java.lang.String r11 = r4.info(r11)
            ah.a.w(r11)
            r11 = 0
            return r11
        L15a:
            java.lang.Class r11 = r2.itemClass
            java.lang.Class<java.lang.Object> r13 = java.lang.Object.class
            if (r11 == r13) goto L164
            com.alibaba.fastjson2.reader.ObjectReader r15 = r2.itemObjectReader
            if (r15 != 0) goto L16c
        L164:
            if (r11 != r13) goto L189
            boolean r11 = r4.isObject()
            if (r11 == 0) goto L189
        L16c:
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.itemObjectReader
            java.lang.reflect.Type r5 = r2.itemType
            java.lang.Integer r6 = java.lang.Integer.valueOf(r14)
            r7 = 0
            java.lang.Object r11 = r3.readObject(r4, r5, r6, r7)
            r12.add(r11)
            java.util.function.Function r11 = r2.builder
            if (r11 == 0) goto L188
            java.lang.Object r11 = r11.apply(r12)
            java.util.Collection r11 = (java.util.Collection) r11
            return r11
        L188:
            return r12
        L189:
            java.lang.String r11 = r4.info()
            ah.a.w(r11)
            r11 = 0
            return r11
    }
}
