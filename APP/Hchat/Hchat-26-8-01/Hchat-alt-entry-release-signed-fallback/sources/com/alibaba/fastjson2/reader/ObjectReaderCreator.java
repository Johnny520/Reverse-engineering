package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderCreator {
    public static final com.alibaba.fastjson2.reader.ObjectReaderCreator INSTANCE = null;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class CreateFieldReaderConsumer implements java.util.function.Consumer {
        final com.alibaba.fastjson2.codec.BeanInfo beanInfo;
        final com.alibaba.fastjson2.codec.FieldInfo fieldInfo;
        final java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> fieldReaders;
        final java.lang.String namingStrategy;
        final java.lang.Class objectClass;
        final java.lang.reflect.Type objectType;
        final java.lang.String[] orders;
        final com.alibaba.fastjson2.reader.ObjectReaderProvider provider;
        final /* synthetic */ com.alibaba.fastjson2.reader.ObjectReaderCreator this$0;

        public CreateFieldReaderConsumer(com.alibaba.fastjson2.reader.ObjectReaderCreator r1, java.lang.Class r2, java.lang.reflect.Type r3, java.lang.String r4, java.lang.String[] r5, com.alibaba.fastjson2.codec.BeanInfo r6, com.alibaba.fastjson2.codec.FieldInfo r7, java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r8, com.alibaba.fastjson2.reader.ObjectReaderProvider r9) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.objectClass = r2
                r0.objectType = r3
                r0.namingStrategy = r4
                r0.orders = r5
                r0.beanInfo = r6
                r0.fieldInfo = r7
                r0.fieldReaders = r8
                r0.provider = r9
                return
        }

        @Override // java.util.function.Consumer
        public void accept(java.lang.Object r22) {
                r21 = this;
                r0 = r21
                r13 = r22
                java.lang.reflect.Method r13 = (java.lang.reflect.Method) r13
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                r1.init()
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                long r2 = r1.features
                com.alibaba.fastjson2.codec.BeanInfo r4 = r0.beanInfo
                long r5 = r4.readerFeatures
                long r2 = r2 | r5
                r1.features = r2
                java.lang.String r2 = r4.format
                r1.format = r2
                com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = r0.provider
                java.lang.Class r3 = r0.objectClass
                r2.getFieldInfo(r1, r3, r13)
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                boolean r2 = r1.ignore
                if (r2 == 0) goto L29
                goto L2b3
            L29:
                java.lang.String r1 = r1.fieldName
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 != 0) goto L106
                java.lang.String r1 = r13.getName()
                java.lang.String r5 = "set"
                boolean r5 = r1.startsWith(r5, r4)
                if (r5 == 0) goto L93
                java.lang.String r5 = r0.namingStrategy
                java.lang.String r5 = com.alibaba.fastjson2.util.BeanUtils.setterName(r1, r5)
                com.alibaba.fastjson2.codec.FieldInfo r6 = r0.fieldInfo
                java.lang.String[] r6 = r6.alternateNames
                if (r6 != 0) goto L9d
                r6 = 3
                java.lang.String r1 = r1.substring(r6)
                java.lang.Class r6 = r0.objectClass
                java.lang.reflect.Field r6 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r6, r1)
                if (r6 != 0) goto L88
                java.lang.Class[] r7 = r13.getParameterTypes()
                r7 = r7[r4]
                java.lang.Class r8 = java.lang.Boolean.TYPE
                if (r7 != r8) goto L88
                boolean r7 = r1.isEmpty()
                if (r7 != 0) goto L88
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                java.lang.String r7 = "is"
                r6.<init>(r7)
                char r7 = r1.charAt(r4)
                char r7 = java.lang.Character.toUpperCase(r7)
                r6.append(r7)
                java.lang.String r1 = r1.substring(r3)
                r6.append(r1)
                java.lang.String r1 = r6.toString()
                java.lang.Class r6 = r0.objectClass
                java.lang.reflect.Field r6 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r6, r1)
            L88:
                if (r6 == 0) goto L9d
                com.alibaba.fastjson2.codec.FieldInfo r6 = r0.fieldInfo
                java.lang.String[] r1 = new java.lang.String[]{r1}
                r6.alternateNames = r1
                goto L9d
            L93:
                com.alibaba.fastjson2.codec.BeanInfo r1 = r0.beanInfo
                boolean r1 = r1.kotlin
                java.lang.String r5 = r0.namingStrategy
                java.lang.String r5 = com.alibaba.fastjson2.util.BeanUtils.getterName(r13, r1, r5)
            L9d:
                int r1 = r5.length()
                if (r1 <= 0) goto La8
                char r6 = r5.charAt(r4)
                goto La9
            La8:
                r6 = r4
            La9:
                if (r1 != r3) goto Lb3
                r7 = 97
                if (r6 < r7) goto Lb3
                r7 = 122(0x7a, float:1.71E-43)
                if (r6 <= r7) goto Lc5
            Lb3:
                if (r1 <= r2) goto L105
                r7 = 65
                if (r6 < r7) goto L105
                r8 = 90
                if (r6 > r8) goto L105
                char r6 = r5.charAt(r3)
                if (r6 < r7) goto L105
                if (r6 > r8) goto L105
            Lc5:
                char[] r6 = r5.toCharArray()
                if (r1 != r3) goto Ld3
                char r7 = r6[r4]
                int r7 = r7 + (-32)
                char r7 = (char) r7
                r6[r4] = r7
                goto Lda
            Ld3:
                char r7 = r6[r4]
                int r7 = r7 + 32
                char r7 = (char) r7
                r6[r4] = r7
            Lda:
                java.lang.String r7 = new java.lang.String
                r7.<init>(r6)
                java.lang.Class r6 = r0.objectClass
                java.lang.reflect.Field r6 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r6, r7)
                if (r6 == 0) goto L105
                int r7 = r6.getModifiers()
                boolean r7 = java.lang.reflect.Modifier.isPublic(r7)
                if (r7 == 0) goto Lf6
                java.lang.String r1 = r6.getName()
                goto L106
            Lf6:
                if (r1 != r3) goto L105
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                java.lang.String[] r5 = new java.lang.String[]{r5}
                r1.alternateNames = r5
                java.lang.String r1 = r6.getName()
                goto L106
            L105:
                r1 = r5
            L106:
                java.lang.String[] r5 = r0.orders
                if (r5 == 0) goto L12c
                int r5 = r5.length
                if (r5 <= 0) goto L12c
                r5 = r4
            L10e:
                java.lang.String[] r6 = r0.orders
                int r7 = r6.length
                if (r5 >= r7) goto L123
                r6 = r6[r5]
                boolean r6 = r1.equals(r6)
                if (r6 == 0) goto L120
                com.alibaba.fastjson2.codec.FieldInfo r6 = r0.fieldInfo
                r6.ordinal = r5
                goto L12c
            L120:
                int r5 = r5 + 1
                goto L10e
            L123:
                com.alibaba.fastjson2.codec.FieldInfo r5 = r0.fieldInfo
                int r7 = r5.ordinal
                if (r7 != 0) goto L12c
                int r6 = r6.length
                r5.ordinal = r6
            L12c:
                java.lang.Class[] r5 = r13.getParameterTypes()
                int r6 = r5.length
                if (r6 != 0) goto L190
                r4 = r1
                com.alibaba.fastjson2.reader.ObjectReaderCreator r1 = r0.this$0
                java.lang.Class r2 = r0.objectClass
                java.lang.reflect.Type r3 = r0.objectType
                com.alibaba.fastjson2.codec.FieldInfo r5 = r0.fieldInfo
                int r6 = r5.ordinal
                long r7 = r5.features
                r9 = 72057594037927936(0x100000000000000, double:7.291122019556398E-304)
                long r7 = r7 | r9
                r9 = r6
                r6 = r7
                java.lang.String r8 = r5.format
                r10 = r9
                java.util.Locale r9 = r5.locale
                java.lang.String r5 = r5.defaultValue
                java.lang.reflect.Type r11 = r13.getGenericReturnType()
                java.lang.Class r12 = r13.getReturnType()
                com.alibaba.fastjson2.codec.FieldInfo r14 = r0.fieldInfo
                com.alibaba.fastjson2.reader.ObjectReader r14 = r14.getInitReader()
                com.alibaba.fastjson2.codec.FieldInfo r15 = r0.fieldInfo
                r16 = r1
                r1 = r15
                java.lang.String r15 = r1.arrayToMapKey
                java.util.function.BiConsumer r1 = r1.getInitArrayToMapDuplicateHandler()
                r19 = r16
                r16 = r1
                r1 = r19
                r19 = r10
                r10 = r5
                r5 = r19
                com.alibaba.fastjson2.reader.FieldReader r1 = r1.createFieldReaderMethod(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                java.lang.Object r2 = r2.get(r4)
                com.alibaba.fastjson2.reader.FieldReader r2 = (com.alibaba.fastjson2.reader.FieldReader) r2
                if (r2 != 0) goto L184
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                r2.put(r4, r1)
                return
            L184:
                int r2 = r2.compareTo2(r1)
                if (r2 <= 0) goto L2b3
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                r2.put(r4, r1)
                return
            L190:
                r19 = r4
                r4 = r1
                r1 = r19
                if (r6 != r2) goto L1bd
                r1 = r5[r3]
                java.lang.reflect.Type[] r2 = r13.getGenericParameterTypes()
                r2 = r2[r3]
                r13.setAccessible(r3)
                r3 = r1
                com.alibaba.fastjson2.reader.FieldReaderAnySetter r1 = new com.alibaba.fastjson2.reader.FieldReaderAnySetter
                com.alibaba.fastjson2.codec.FieldInfo r4 = r0.fieldInfo
                int r5 = r4.ordinal
                r7 = r5
                long r5 = r4.features
                java.lang.String r4 = r4.format
                r8 = r7
                r7 = r4
                r4 = r8
                r8 = r13
                r1.<init>(r2, r3, r4, r5, r7, r8)
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                java.lang.String r3 = r1.fieldName
                r2.put(r3, r1)
                return
            L1bd:
                r12 = r5[r1]
                boolean r2 = r12.isPrimitive()
                if (r2 != 0) goto L1d7
                java.lang.Class<java.lang.String> r2 = java.lang.String.class
                if (r12 == r2) goto L1d7
                boolean r2 = r12.isEnum()
                if (r2 == 0) goto L1d0
                goto L1d7
            L1d0:
                java.lang.reflect.Type[] r2 = r13.getGenericParameterTypes()
                r2 = r2[r1]
                goto L1d8
            L1d7:
                r2 = r12
            L1d8:
                boolean r5 = r2 instanceof java.lang.Class
                if (r5 == 0) goto L20a
                java.lang.Class<java.util.Collection> r5 = java.util.Collection.class
                r6 = r2
                java.lang.Class r6 = (java.lang.Class) r6
                boolean r5 = r5.isAssignableFrom(r6)
                if (r5 == 0) goto L20a
                java.lang.Class r5 = r0.objectClass
                java.lang.Class[] r5 = r5.getInterfaces()
                r6 = r1
            L1ee:
                int r7 = r5.length
                if (r6 >= r7) goto L20a
                r7 = r5[r6]
                java.lang.reflect.Method r7 = com.alibaba.fastjson2.util.BeanUtils.getMethod(r7, r13)
                if (r7 == 0) goto L207
                java.lang.reflect.Type[] r7 = r7.getGenericParameterTypes()
                int r8 = r7.length
                if (r8 != r3) goto L207
                r7 = r7[r1]
                boolean r8 = r7 instanceof java.lang.reflect.ParameterizedType
                if (r8 == 0) goto L207
                r2 = r7
            L207:
                int r6 = r6 + 1
                goto L1ee
            L20a:
                r11 = r2
                com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = r0.provider
                com.alibaba.fastjson2.codec.FieldInfo r3 = r0.fieldInfo
                com.alibaba.fastjson2.reader.ObjectReader r14 = com.alibaba.fastjson2.reader.ObjectReaderCreator.getInitReader(r2, r11, r12, r3)
                r2 = r1
                com.alibaba.fastjson2.reader.ObjectReaderCreator r1 = r0.this$0
                r3 = r2
                java.lang.Class r2 = r0.objectClass
                r5 = r3
                java.lang.reflect.Type r3 = r0.objectType
                com.alibaba.fastjson2.codec.FieldInfo r6 = r0.fieldInfo
                r7 = r5
                int r5 = r6.ordinal
                long r8 = r6.features
                r9 = r8
                java.lang.String r8 = r6.format
                r15 = r9
                java.util.Locale r9 = r6.locale
                java.lang.String r10 = r6.defaultValue
                r16 = r15
                java.lang.String r15 = r6.arrayToMapKey
                java.util.function.BiConsumer r6 = r6.getInitArrayToMapDuplicateHandler()
                r19 = r16
                r16 = r6
                r17 = r7
                r6 = r19
                com.alibaba.fastjson2.reader.FieldReader r1 = r1.createFieldReaderMethod(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r15 = r4
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                java.lang.Object r2 = r2.get(r15)
                com.alibaba.fastjson2.reader.FieldReader r2 = (com.alibaba.fastjson2.reader.FieldReader) r2
                if (r2 != 0) goto L250
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                r2.put(r15, r1)
                goto L25b
            L250:
                int r2 = r2.compareTo2(r1)
                if (r2 <= 0) goto L25b
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                r2.put(r15, r1)
            L25b:
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                java.lang.String[] r1 = r1.alternateNames
                if (r1 == 0) goto L2b3
                int r2 = r1.length
                r3 = r17
            L264:
                if (r3 >= r2) goto L2b3
                r4 = r1[r3]
                boolean r5 = r15.equals(r4)
                if (r5 == 0) goto L275
            L26e:
                r22 = r1
                r16 = r2
                r17 = r3
                goto L2aa
            L275:
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r5 = r0.fieldReaders
                java.lang.Object r5 = r5.get(r4)
                com.alibaba.fastjson2.reader.FieldReader r5 = (com.alibaba.fastjson2.reader.FieldReader) r5
                if (r5 != 0) goto L26e
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r5 = r0.fieldReaders
                r6 = r1
                com.alibaba.fastjson2.reader.ObjectReaderCreator r1 = r0.this$0
                r7 = r2
                java.lang.Class r2 = r0.objectClass
                r17 = r3
                java.lang.reflect.Type r3 = r0.objectType
                com.alibaba.fastjson2.codec.FieldInfo r8 = r0.fieldInfo
                r9 = r5
                int r5 = r8.ordinal
                r10 = r6
                r16 = r7
                long r6 = r8.features
                java.lang.String r0 = r8.format
                r18 = r9
                java.util.Locale r9 = r8.locale
                java.lang.String r8 = r8.defaultValue
                r22 = r10
                r10 = r8
                r8 = r0
                r0 = r18
                com.alibaba.fastjson2.reader.FieldReader r1 = r1.createFieldReaderMethod(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14)
                r0.put(r4, r1)
            L2aa:
                int r3 = r17 + 1
                r0 = r21
                r1 = r22
                r2 = r16
                goto L264
            L2b3:
                return
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public final class FieldConsumer implements java.util.function.Consumer {
        final com.alibaba.fastjson2.codec.BeanInfo beanInfo;
        final boolean fieldBased;
        final com.alibaba.fastjson2.codec.FieldInfo fieldInfo;
        final java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> fieldReaders;
        final java.lang.String namingStrategy;
        final java.lang.Class objectClass;
        final java.lang.reflect.Type objectType;
        final com.alibaba.fastjson2.reader.ObjectReaderProvider provider;
        final /* synthetic */ com.alibaba.fastjson2.reader.ObjectReaderCreator this$0;

        public FieldConsumer(com.alibaba.fastjson2.reader.ObjectReaderCreator r1, java.lang.Class r2, java.lang.reflect.Type r3, java.lang.String r4, com.alibaba.fastjson2.codec.FieldInfo r5, java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r6, com.alibaba.fastjson2.reader.ObjectReaderProvider r7, com.alibaba.fastjson2.codec.BeanInfo r8, boolean r9) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.objectClass = r2
                r0.objectType = r3
                r0.namingStrategy = r4
                r0.fieldInfo = r5
                r0.fieldReaders = r6
                r0.provider = r7
                r0.beanInfo = r8
                r0.fieldBased = r9
                return
        }

        @Override // java.util.function.Consumer
        public void accept(java.lang.Object r22) {
                r21 = this;
                r0 = r21
                r13 = r22
                java.lang.reflect.Field r13 = (java.lang.reflect.Field) r13
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                r1.init()
                boolean r1 = r0.fieldBased
                com.alibaba.fastjson2.codec.FieldInfo r2 = r0.fieldInfo
                r17 = 0
                if (r1 == 0) goto L1d
                long r3 = r2.features
                com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
                long r5 = r1.mask
                long r3 = r3 | r5
                r2.features = r3
                goto L2a
            L1d:
                int r1 = r13.getModifiers()
                r3 = 1
                r1 = r1 & r3
                if (r1 != 0) goto L26
                goto L28
            L26:
                r3 = r17
            L28:
                r2.ignore = r3
            L2a:
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                long r2 = r1.features
                com.alibaba.fastjson2.codec.BeanInfo r4 = r0.beanInfo
                long r5 = r4.readerFeatures
                long r2 = r2 | r5
                r1.features = r2
                java.lang.String r2 = r4.format
                r1.format = r2
                com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = r0.provider
                java.lang.Class r3 = r0.objectClass
                r2.getFieldInfo(r1, r3, r13)
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                boolean r2 = r1.ignore
                if (r2 == 0) goto L5f
                long r1 = r1.features
                r3 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
                long r1 = r1 & r3
                r3 = 0
                int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r1 == 0) goto L5e
                java.lang.Class<java.util.Map> r1 = java.util.Map.class
                java.lang.Class r2 = r13.getType()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L5e
                goto L5f
            L5e:
                return
            L5f:
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                java.lang.String r1 = r1.fieldName
                if (r1 == 0) goto L72
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L6c
                goto L72
            L6c:
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                java.lang.String r1 = r1.fieldName
            L70:
                r4 = r1
                goto L7f
            L72:
                java.lang.String r1 = r13.getName()
                java.lang.String r2 = r0.namingStrategy
                if (r2 == 0) goto L70
                java.lang.String r1 = com.alibaba.fastjson2.util.BeanUtils.fieldName(r1, r2)
                goto L70
            L7f:
                com.alibaba.fastjson2.codec.BeanInfo r1 = r0.beanInfo
                java.lang.String[] r1 = r1.orders
                if (r1 == 0) goto La6
                int r2 = r1.length
                if (r2 <= 0) goto La6
                r2 = r17
            L8a:
                int r3 = r1.length
                if (r2 >= r3) goto L9d
                r3 = r1[r2]
                boolean r3 = r4.equals(r3)
                if (r3 == 0) goto L9a
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                r1.ordinal = r2
                goto La6
            L9a:
                int r2 = r2 + 1
                goto L8a
            L9d:
                com.alibaba.fastjson2.codec.FieldInfo r2 = r0.fieldInfo
                int r3 = r2.ordinal
                if (r3 != 0) goto La6
                int r1 = r1.length
                r2.ordinal = r1
            La6:
                java.lang.Class r12 = r13.getType()
                java.lang.reflect.Type r11 = r13.getGenericType()
                com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = r0.provider
                com.alibaba.fastjson2.codec.FieldInfo r2 = r0.fieldInfo
                com.alibaba.fastjson2.reader.ObjectReader r14 = com.alibaba.fastjson2.reader.ObjectReaderCreator.getInitReader(r1, r11, r12, r2)
                com.alibaba.fastjson2.reader.ObjectReaderCreator r1 = r0.this$0
                java.lang.Class r2 = r0.objectClass
                java.lang.reflect.Type r3 = r0.objectType
                com.alibaba.fastjson2.codec.FieldInfo r5 = r0.fieldInfo
                int r6 = r5.ordinal
                r8 = r6
                long r6 = r5.features
                r9 = r8
                java.lang.String r8 = r5.format
                r10 = r9
                java.util.Locale r9 = r5.locale
                r15 = r10
                java.lang.String r10 = r5.defaultValue
                r16 = r15
                java.lang.String r15 = r5.arrayToMapKey
                java.util.function.BiConsumer r5 = r5.getInitArrayToMapDuplicateHandler()
                r20 = r16
                r16 = r5
                r5 = r20
                com.alibaba.fastjson2.reader.FieldReader r1 = r1.createFieldReader(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
                r15 = r4
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                java.lang.Object r2 = r2.get(r15)
                com.alibaba.fastjson2.reader.FieldReader r2 = (com.alibaba.fastjson2.reader.FieldReader) r2
                if (r2 != 0) goto Lef
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                r2.put(r15, r1)
                goto Lfa
            Lef:
                int r2 = r1.compareTo2(r2)
                if (r2 <= 0) goto Lfa
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                r2.put(r15, r1)
            Lfa:
                com.alibaba.fastjson2.codec.FieldInfo r1 = r0.fieldInfo
                java.lang.String[] r1 = r1.alternateNames
                if (r1 == 0) goto L152
                int r2 = r1.length
                r3 = r17
            L103:
                if (r3 >= r2) goto L152
                r4 = r1[r3]
                boolean r5 = r15.equals(r4)
                if (r5 == 0) goto L114
                r16 = r1
                r17 = r2
                r18 = r3
                goto L14b
            L114:
                r5 = r1
                com.alibaba.fastjson2.reader.ObjectReaderCreator r1 = r0.this$0
                r6 = r2
                java.lang.Class r2 = r0.objectClass
                r17 = r3
                java.lang.reflect.Type r3 = r0.objectType
                com.alibaba.fastjson2.codec.FieldInfo r7 = r0.fieldInfo
                r8 = r5
                int r5 = r7.ordinal
                long r9 = r7.features
                r18 = r9
                java.util.Locale r9 = r7.locale
                java.lang.String r10 = r7.defaultValue
                r14 = 0
                r7 = r8
                r8 = 0
                r16 = r7
                r20 = r17
                r17 = r6
                r6 = r18
                r18 = r20
                com.alibaba.fastjson2.reader.FieldReader r1 = r1.createFieldReader(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14)
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                java.lang.Object r2 = r2.get(r4)
                com.alibaba.fastjson2.reader.FieldReader r2 = (com.alibaba.fastjson2.reader.FieldReader) r2
                if (r2 != 0) goto L14b
                java.util.Map<java.lang.String, com.alibaba.fastjson2.reader.FieldReader> r2 = r0.fieldReaders
                r2.put(r4, r1)
            L14b:
                int r3 = r18 + 1
                r1 = r16
                r2 = r17
                goto L103
            L152:
                return
        }
    }

    static {
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = new com.alibaba.fastjson2.reader.ObjectReaderCreator
            r0.<init>()
            com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE = r0
            return
    }

    public ObjectReaderCreator() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.Object a(java.lang.Object r0, java.lang.reflect.Method r1) {
            java.lang.Object r0 = lambda$createBuildFunction$3(r1, r0)
            return r0
    }

    public static /* synthetic */ void b(java.lang.Class r0, com.alibaba.fastjson2.reader.ObjectReaderProvider r1, java.lang.Class r2, com.alibaba.fastjson2.codec.BeanInfo r3, java.lang.String r4, com.alibaba.fastjson2.codec.FieldInfo r5, java.lang.reflect.Method r6) {
            lambda$createObjectReaderWithCreator$1(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ void c(com.alibaba.fastjson2.reader.ObjectReaderCreator r0, com.alibaba.fastjson2.codec.FieldInfo r1, com.alibaba.fastjson2.reader.ObjectReaderProvider r2, java.lang.Class r3, java.lang.String r4, java.lang.Class r5, com.alibaba.fastjson2.codec.BeanInfo r6, int r7, java.util.LinkedHashMap r8, java.lang.reflect.Type r9, java.lang.reflect.Method r10) {
            r0.lambda$createObjectReaderWithBuilder$0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }

    public static /* synthetic */ void d(java.util.ArrayList r0, java.lang.reflect.Constructor r1) {
            lambda$createObjectReader$2(r0, r1)
            return
    }

    public static com.alibaba.fastjson2.reader.ObjectReader getInitReader(com.alibaba.fastjson2.reader.ObjectReaderProvider r6, java.lang.reflect.Type r7, java.lang.Class r8, com.alibaba.fastjson2.codec.FieldInfo r9) {
            com.alibaba.fastjson2.reader.ObjectReader r0 = r9.getInitReader()
            if (r0 != 0) goto L56
            java.lang.Class<?> r1 = r9.keyUsing
            if (r1 != 0) goto Le
            java.lang.Class<?> r1 = r9.valueUsing
            if (r1 == 0) goto L56
        Le:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            boolean r1 = r1.isAssignableFrom(r8)
            if (r1 == 0) goto L56
            java.lang.Class<?> r1 = r9.keyUsing
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2a
            java.lang.reflect.Constructor r1 = r1.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L2a
            r1.setAccessible(r2)     // Catch: java.lang.Exception -> L2a
            java.lang.Object r1 = r1.newInstance(r3)     // Catch: java.lang.Exception -> L2a
            com.alibaba.fastjson2.reader.ObjectReader r1 = (com.alibaba.fastjson2.reader.ObjectReader) r1     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
            r1 = r3
        L2b:
            java.lang.Class<?> r4 = r9.valueUsing
            if (r4 == 0) goto L3d
            java.lang.reflect.Constructor r4 = r4.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L3d
            r4.setAccessible(r2)     // Catch: java.lang.Exception -> L3d
            java.lang.Object r2 = r4.newInstance(r3)     // Catch: java.lang.Exception -> L3d
            com.alibaba.fastjson2.reader.ObjectReader r2 = (com.alibaba.fastjson2.reader.ObjectReader) r2     // Catch: java.lang.Exception -> L3d
            r3 = r2
        L3d:
            if (r1 != 0) goto L41
            if (r3 == 0) goto L56
        L41:
            long r4 = r9.features
            com.alibaba.fastjson2.reader.ObjectReader r7 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.of(r7, r8, r4)
            boolean r9 = r7 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped
            if (r9 == 0) goto L56
            com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped r7 = (com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped) r7
            if (r1 == 0) goto L51
            r7.keyObjectReader = r1
        L51:
            if (r3 == 0) goto L55
            r7.valueObjectReader = r3
        L55:
            return r7
        L56:
            if (r0 != 0) goto L80
            java.lang.Class<java.math.BigDecimal> r7 = java.math.BigDecimal.class
            r9 = 0
            if (r8 != r7) goto L66
            com.alibaba.fastjson2.reader.ObjectReader r6 = r6.getObjectReader(r7, r9)
            com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal r7 = com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal.INSTANCE
            if (r6 == r7) goto L80
            goto L7f
        L66:
            java.lang.Class<java.math.BigInteger> r7 = java.math.BigInteger.class
            if (r8 != r7) goto L73
            com.alibaba.fastjson2.reader.ObjectReader r6 = r6.getObjectReader(r7, r9)
            com.alibaba.fastjson2.reader.ObjectReaderImplBigInteger r7 = com.alibaba.fastjson2.reader.ObjectReaderImplBigInteger.INSTANCE
            if (r6 == r7) goto L80
            goto L7f
        L73:
            java.lang.Class<java.util.Date> r7 = java.util.Date.class
            if (r8 != r7) goto L80
            com.alibaba.fastjson2.reader.ObjectReader r6 = r6.getObjectReader(r7, r9)
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r7 = com.alibaba.fastjson2.reader.ObjectReaderImplDate.INSTANCE
            if (r6 == r7) goto L80
        L7f:
            r0 = r6
        L80:
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$createBuildFunction$3(java.lang.reflect.Method r1, java.lang.Object r2) {
            r0 = 0
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L6
            return r1
        L6:
            r1 = move-exception
            java.lang.String r2 = "create instance error"
            ah.a.x(r2, r1)
            r1 = 0
            return r1
    }

    private static /* synthetic */ void lambda$createObjectReader$2(java.util.List r0, java.lang.reflect.Constructor r1) {
            r0.add(r1)
            return
    }

    private /* synthetic */ void lambda$createObjectReaderWithBuilder$0(com.alibaba.fastjson2.codec.FieldInfo r20, com.alibaba.fastjson2.reader.ObjectReaderProvider r21, java.lang.Class r22, java.lang.String r23, java.lang.Class r24, com.alibaba.fastjson2.codec.BeanInfo r25, int r26, java.util.Map r27, java.lang.reflect.Type r28, java.lang.reflect.Method r29) {
            r19 = this;
            r0 = r20
            r1 = r27
            r14 = r29
            r0.init()
            r2 = r21
            r3 = r22
            r2.getFieldInfo(r0, r3, r14)
            boolean r2 = r0.ignore
            if (r2 == 0) goto L16
            goto L12b
        L16:
            java.lang.String r2 = r14.getName()
            java.lang.String r3 = r0.fieldName
            r4 = 0
            if (r3 == 0) goto L2b
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L26
            goto L2b
        L26:
            java.lang.String r2 = r0.fieldName
        L28:
            r5 = r24
            goto L6c
        L2b:
            int r3 = r2.length()
            int r5 = r23.length()
            if (r3 <= r5) goto L45
            r3 = r23
            boolean r3 = r2.startsWith(r3, r4)
            if (r3 != 0) goto L3e
            goto L45
        L3e:
            r3 = r26
            java.lang.String r2 = com.alibaba.fastjson2.util.BeanUtils.setterName(r2, r3)
            goto L28
        L45:
            java.lang.Class r3 = r14.getDeclaringClass()
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            if (r3 == r5) goto L12b
            java.lang.Class r3 = r14.getReturnType()
            r5 = r24
            if (r3 != r5) goto L12b
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r3 = com.alibaba.fastjson2.annotation.JSONField.class
            java.lang.annotation.Annotation r3 = r14.getAnnotation(r3)
            if (r3 != 0) goto L6c
            r3 = r25
            long r6 = r3.readerFeatures
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.SupportSmartMatch
            long r8 = r3.mask
            long r6 = r6 & r8
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L12b
        L6c:
            java.lang.Class[] r3 = r14.getParameterTypes()
            int r3 = r3.length
            if (r3 != 0) goto La6
            int r6 = r0.ordinal
            long r7 = r0.features
            java.lang.String r9 = r0.format
            java.util.Locale r10 = r0.locale
            java.lang.String r11 = r0.defaultValue
            java.lang.reflect.Type r12 = r14.getGenericReturnType()
            java.lang.Class r13 = r14.getReturnType()
            r15 = 0
            r4 = r24
            r3 = r5
            r5 = r2
            r2 = r19
            com.alibaba.fastjson2.reader.FieldReader r0 = r2.createFieldReaderMethod(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r2 = r1.get(r5)
            com.alibaba.fastjson2.reader.FieldReader r2 = (com.alibaba.fastjson2.reader.FieldReader) r2
            if (r2 != 0) goto L9c
            r1.put(r5, r0)
            return
        L9c:
            int r2 = r2.compareTo2(r0)
            if (r2 <= 0) goto L12b
            r1.put(r5, r0)
            return
        La6:
            r5 = r2
            java.lang.reflect.Type[] r2 = r14.getGenericParameterTypes()
            r12 = r2[r4]
            java.lang.Class[] r2 = r14.getParameterTypes()
            r13 = r2[r4]
            r2 = 1
            r14.setAccessible(r2)
            int r6 = r0.ordinal
            long r7 = r0.features
            java.lang.String r9 = r0.format
            java.util.Locale r10 = r0.locale
            java.lang.String r11 = r0.defaultValue
            r15 = 0
            r2 = r19
            r3 = r24
            r16 = r4
            r4 = r28
            com.alibaba.fastjson2.reader.FieldReader r6 = r2.createFieldReaderMethod(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15)
            r2 = r5
            java.lang.Object r3 = r1.get(r2)
            com.alibaba.fastjson2.reader.FieldReader r3 = (com.alibaba.fastjson2.reader.FieldReader) r3
            if (r3 != 0) goto Ldb
            r1.put(r2, r6)
            goto Le4
        Ldb:
            int r3 = r3.compareTo2(r6)
            if (r3 <= 0) goto Le4
            r1.put(r2, r6)
        Le4:
            java.lang.String[] r3 = r0.alternateNames
            if (r3 == 0) goto L12b
            r4 = r16
        Lea:
            int r5 = r3.length
            if (r4 >= r5) goto L12b
            r5 = r3[r4]
            boolean r6 = r2.equals(r5)
            if (r6 == 0) goto Lfc
        Lf5:
            r16 = r2
            r17 = r3
            r18 = r4
            goto L124
        Lfc:
            java.lang.Object r6 = r1.get(r5)
            com.alibaba.fastjson2.reader.FieldReader r6 = (com.alibaba.fastjson2.reader.FieldReader) r6
            if (r6 != 0) goto Lf5
            int r6 = r0.ordinal
            long r7 = r0.features
            java.lang.String r9 = r0.format
            java.util.Locale r10 = r0.locale
            java.lang.String r11 = r0.defaultValue
            r15 = 0
            r14 = r29
            r16 = r2
            r17 = r3
            r18 = r4
            r2 = r19
            r3 = r24
            r4 = r28
            com.alibaba.fastjson2.reader.FieldReader r6 = r2.createFieldReaderMethod(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14, r15)
            r1.put(r5, r6)
        L124:
            int r4 = r18 + 1
            r2 = r16
            r3 = r17
            goto Lea
        L12b:
            return
    }

    private static /* synthetic */ void lambda$createObjectReaderWithCreator$1(java.lang.Class r1, com.alibaba.fastjson2.reader.ObjectReaderProvider r2, java.lang.Class r3, com.alibaba.fastjson2.codec.BeanInfo r4, java.lang.String r5, com.alibaba.fastjson2.codec.FieldInfo r6, java.lang.reflect.Method r7) {
            java.lang.Class r0 = r7.getReturnType()
            if (r0 == r1) goto L7
            goto L2d
        L7:
            com.alibaba.fastjson2.codec.FieldInfo r1 = new com.alibaba.fastjson2.codec.FieldInfo
            r1.<init>()
            r2.getFieldInfo(r1, r3, r7)
            java.lang.String r2 = r1.fieldName
            if (r2 != 0) goto L1f
            boolean r2 = r4.kotlin
            com.alibaba.fastjson2.PropertyNamingStrategy r3 = com.alibaba.fastjson2.PropertyNamingStrategy.CamelCase
            java.lang.String r3 = r3.name()
            java.lang.String r2 = com.alibaba.fastjson2.util.BeanUtils.getterName(r7, r2, r3)
        L1f:
            java.lang.Class<?> r3 = r1.readUsing
            if (r3 == 0) goto L2d
            boolean r2 = r5.equals(r2)
            if (r2 == 0) goto L2d
            java.lang.Class<?> r1 = r1.readUsing
            r6.readUsing = r1
        L2d:
            return
    }

    public <T, R> java.util.function.Function<T, R> createBuildFunction(java.lang.reflect.Method r3) {
            r2 = this;
            r0 = 1
            r3.setAccessible(r0)
            bc.j r0 = new bc.j
            r1 = 3
            r0.<init>(r3, r1)
            return r0
    }

    public com.alibaba.fastjson2.reader.ObjectReader createEnumReader(java.lang.Class r12, java.lang.reflect.Method r13, com.alibaba.fastjson2.reader.ObjectReaderProvider r14) {
            r11 = this;
            com.alibaba.fastjson2.codec.FieldInfo r0 = new com.alibaba.fastjson2.codec.FieldInfo
            r0.<init>()
            java.lang.Object[] r1 = r12.getEnumConstants()
            r7 = r1
            java.lang.Enum[] r7 = (java.lang.Enum[]) r7
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            r2 = 0
            r3 = r2
        L13:
            if (r7 == 0) goto L72
            int r4 = r7.length
            if (r3 >= r4) goto L72
            r4 = r7[r3]
            java.lang.String r5 = r4.name()
            long r8 = com.alibaba.fastjson2.util.Fnv.hashCode64(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r8)
            r1.put(r6, r4)
            r0.init()     // Catch: java.lang.Exception -> L6f
            java.lang.reflect.Field r6 = com.alibaba.fastjson2.util.BeanUtils.getField(r12, r5)     // Catch: java.lang.Exception -> L6f
            r14.getFieldInfo(r0, r12, r6)     // Catch: java.lang.Exception -> L6f
            java.lang.String r6 = r0.fieldName     // Catch: java.lang.Exception -> L6f
            if (r6 == 0) goto L4e
            boolean r8 = r6.isEmpty()     // Catch: java.lang.Exception -> L6f
            if (r8 != 0) goto L4e
            boolean r5 = r6.equals(r5)     // Catch: java.lang.Exception -> L6f
            if (r5 != 0) goto L4e
            long r5 = com.alibaba.fastjson2.util.Fnv.hashCode64(r6)     // Catch: java.lang.Exception -> L6f
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Exception -> L6f
            r1.put(r5, r4)     // Catch: java.lang.Exception -> L6f
        L4e:
            java.lang.String[] r5 = r0.alternateNames     // Catch: java.lang.Exception -> L6f
            if (r5 == 0) goto L6f
            int r6 = r5.length     // Catch: java.lang.Exception -> L6f
            r8 = r2
        L54:
            if (r8 >= r6) goto L6f
            r9 = r5[r8]     // Catch: java.lang.Exception -> L6f
            if (r9 == 0) goto L6c
            boolean r10 = r9.isEmpty()     // Catch: java.lang.Exception -> L6f
            if (r10 == 0) goto L61
            goto L6c
        L61:
            long r9 = com.alibaba.fastjson2.util.Fnv.hashCode64(r9)     // Catch: java.lang.Exception -> L6f
            java.lang.Long r9 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> L6f
            r1.put(r9, r4)     // Catch: java.lang.Exception -> L6f
        L6c:
            int r8 = r8 + 1
            goto L54
        L6f:
            int r3 = r3 + 1
            goto L13
        L72:
            r0 = r2
        L73:
            if (r7 == 0) goto La2
            int r3 = r7.length
            if (r0 >= r3) goto La2
            r3 = r7[r0]
            java.lang.String r4 = r3.name()
            long r5 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r4)
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r1.put(r5, r3)
            java.lang.String r5 = r3.toString()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L94
            goto L9f
        L94:
            long r4 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r5)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r1.putIfAbsent(r4, r3)
        L9f:
            int r0 = r0 + 1
            goto L73
        La2:
            int r0 = r1.size()
            long[] r8 = new long[r0]
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
            r4 = r2
        Lb1:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto Lc7
            java.lang.Object r5 = r3.next()
            java.lang.Long r5 = (java.lang.Long) r5
            int r6 = r4 + 1
            long r9 = r5.longValue()
            r8[r4] = r9
            r4 = r6
            goto Lb1
        Lc7:
            java.util.Arrays.sort(r8)
            java.lang.reflect.Member r3 = com.alibaba.fastjson2.util.BeanUtils.getEnumValueField(r12, r14)
            if (r3 != 0) goto Lee
            if (r14 == 0) goto Lee
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r4 = r14.mixInCache
            java.lang.Object r4 = r4.get(r12)
            java.lang.Class r4 = (java.lang.Class) r4
            if (r4 == 0) goto Lee
            java.lang.reflect.Member r14 = com.alibaba.fastjson2.util.BeanUtils.getEnumValueField(r4, r14)
            boolean r4 = r14 instanceof java.lang.reflect.Field
            if (r4 == 0) goto Lf0
            java.lang.reflect.Field r14 = (java.lang.reflect.Field) r14     // Catch: java.lang.Throwable -> Lee
            java.lang.String r14 = r14.getName()     // Catch: java.lang.Throwable -> Lee
            java.lang.reflect.Field r3 = r12.getField(r14)     // Catch: java.lang.Throwable -> Lee
        Lee:
            r5 = r3
            goto L100
        Lf0:
            boolean r4 = r14 instanceof java.lang.reflect.Method
            if (r4 == 0) goto Lee
            java.lang.reflect.Method r14 = (java.lang.reflect.Method) r14
            java.lang.String r14 = r14.getName()
            r4 = 0
            java.lang.reflect.Method r3 = r12.getMethod(r14, r4)
            goto Lee
        L100:
            java.lang.Enum[] r6 = new java.lang.Enum[r0]
            r14 = r2
        L103:
            if (r14 >= r0) goto L116
            r3 = r8[r14]
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            java.lang.Object r3 = r1.get(r3)
            java.lang.Enum r3 = (java.lang.Enum) r3
            r6[r14] = r3
            int r14 = r14 + 1
            goto L103
        L116:
            if (r13 != 0) goto L129
            if (r5 != 0) goto L129
            if (r7 == 0) goto L129
            int r14 = r7.length
            r1 = 2
            if (r14 != r1) goto L129
            r14 = r7[r2]
        L122:
            if (r2 >= r0) goto L129
            r14 = r6[r2]
            int r2 = r2 + 1
            goto L122
        L129:
            com.alibaba.fastjson2.reader.ObjectReaderImplEnum r2 = new com.alibaba.fastjson2.reader.ObjectReaderImplEnum
            r3 = r12
            r4 = r13
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
    }

    public <T> java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> createFactoryFunction(java.lang.reflect.Method r2, java.lang.String... r3) {
            r1 = this;
            r0 = 1
            r2.setAccessible(r0)
            com.alibaba.fastjson2.reader.FactoryFunction r0 = new com.alibaba.fastjson2.reader.FactoryFunction
            r0.<init>(r2, r3)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReader(java.lang.Class<T> r1, java.lang.String r2, java.lang.String r3, java.lang.reflect.Type r4, java.lang.Class r5, java.lang.reflect.Method r6) {
            r0 = this;
            com.alibaba.fastjson2.reader.FieldReader r1 = r0.createFieldReaderMethod(r1, r2, r3, r4, r5, r6)
            return r1
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReader(java.lang.Class<T> r15, java.lang.String r16, java.lang.reflect.Type r17, java.lang.Class r18, java.lang.reflect.Method r19) {
            r14 = this;
            r9 = 0
            r13 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r2 = r15
            r0 = r14
            r1 = r15
            r3 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            com.alibaba.fastjson2.reader.FieldReader r15 = r0.createFieldReaderMethod(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            return r15
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader<T> createFieldReader(java.lang.Class r18, java.lang.reflect.Type r19, java.lang.String r20, int r21, long r22, java.lang.String r24, java.util.Locale r25, java.lang.Object r26, java.lang.reflect.Type r27, java.lang.Class r28, java.lang.reflect.Field r29, com.alibaba.fastjson2.reader.ObjectReader r30) {
            r17 = this;
            java.lang.Class r12 = r29.getType()
            r15 = 0
            r16 = 0
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r13 = r29
            r14 = r30
            com.alibaba.fastjson2.reader.FieldReader r0 = r1.createFieldReader(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader<T> createFieldReader(java.lang.Class r16, java.lang.reflect.Type r17, java.lang.String r18, int r19, long r20, java.lang.String r22, java.util.Locale r23, java.lang.Object r24, java.lang.reflect.Type r25, java.lang.Class r26, java.lang.reflect.Field r27, com.alibaba.fastjson2.reader.ObjectReader r28, java.lang.String r29, java.util.function.BiConsumer r30) {
            r15 = this;
            r0 = r24
            r2 = r25
            r3 = r26
            r8 = r27
            r10 = r28
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L1a
            boolean r1 = r3.isEnum()
            if (r1 == 0) goto L1a
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Enum r0 = java.lang.Enum.valueOf(r3, r0)
        L1a:
            if (r0 == 0) goto L34
            java.lang.Class r1 = r0.getClass()
            if (r1 == r3) goto L34
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            java.lang.Class r4 = r0.getClass()
            java.util.function.Function r1 = r1.getTypeConvert(r4, r2)
            if (r1 == 0) goto L36
            java.lang.Object r0 = r1.apply(r0)
        L34:
            r9 = r0
            goto L4b
        L36:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "illegal defaultValue : "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", class "
            java.lang.String r2 = r3.getName()
            ah.a.s(r1, r0, r2)
            r0 = 0
            return r0
        L4b:
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L5e
            java.lang.String r4 = r16.getName()
            java.lang.String r5 = "java.lang"
            boolean r4 = r4.startsWith(r5, r1)
            if (r4 != 0) goto L5e
            r8.setAccessible(r0)
        L5e:
            if (r10 == 0) goto L75
            com.alibaba.fastjson2.reader.FieldReaderObjectField r0 = new com.alibaba.fastjson2.reader.FieldReaderObjectField
            r4 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r5 = r20 | r4
            r1 = r9
            r9 = r8
            r8 = r1
            r1 = r18
            r4 = r19
            r7 = r22
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            r0.initReader = r10
            return r0
        L75:
            r2 = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r2 != r3) goto L8b
            com.alibaba.fastjson2.reader.FieldReaderInt32ValueField r0 = new com.alibaba.fastjson2.reader.FieldReaderInt32ValueField
            r5 = r9
            java.lang.Integer r5 = (java.lang.Integer) r5
            r1 = r18
            r3 = r19
            r4 = r22
            r6 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L8b:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            if (r2 != r3) goto La2
            com.alibaba.fastjson2.reader.FieldReaderInt32Field r0 = new com.alibaba.fastjson2.reader.FieldReaderInt32Field
            r7 = r9
            java.lang.Integer r7 = (java.lang.Integer) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        La2:
            java.lang.Class r3 = java.lang.Long.TYPE
            if (r2 != r3) goto Lb9
            com.alibaba.fastjson2.reader.FieldReaderInt64ValueField r0 = new com.alibaba.fastjson2.reader.FieldReaderInt64ValueField
            r7 = r9
            java.lang.Long r7 = (java.lang.Long) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        Lb9:
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            if (r2 != r3) goto Ld0
            com.alibaba.fastjson2.reader.FieldReaderInt64Field r0 = new com.alibaba.fastjson2.reader.FieldReaderInt64Field
            r7 = r9
            java.lang.Long r7 = (java.lang.Long) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        Ld0:
            java.lang.Class r3 = java.lang.Short.TYPE
            if (r2 != r3) goto Le7
            com.alibaba.fastjson2.reader.FieldReaderInt16ValueField r0 = new com.alibaba.fastjson2.reader.FieldReaderInt16ValueField
            r7 = r9
            java.lang.Short r7 = (java.lang.Short) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        Le7:
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            if (r2 != r3) goto Lfe
            com.alibaba.fastjson2.reader.FieldReaderInt16Field r0 = new com.alibaba.fastjson2.reader.FieldReaderInt16Field
            r7 = r9
            java.lang.Short r7 = (java.lang.Short) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        Lfe:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r2 != r3) goto L115
            com.alibaba.fastjson2.reader.FieldReaderBoolValueField r0 = new com.alibaba.fastjson2.reader.FieldReaderBoolValueField
            r6 = r9
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r7 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L115:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r2 != r3) goto L12c
            com.alibaba.fastjson2.reader.FieldReaderBoolField r0 = new com.alibaba.fastjson2.reader.FieldReaderBoolField
            r7 = r9
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L12c:
            java.lang.Class r3 = java.lang.Byte.TYPE
            if (r2 != r3) goto L143
            com.alibaba.fastjson2.reader.FieldReaderInt8ValueField r0 = new com.alibaba.fastjson2.reader.FieldReaderInt8ValueField
            r7 = r9
            java.lang.Byte r7 = (java.lang.Byte) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L143:
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            if (r2 != r3) goto L15a
            com.alibaba.fastjson2.reader.FieldReaderInt8Field r0 = new com.alibaba.fastjson2.reader.FieldReaderInt8Field
            r7 = r9
            java.lang.Byte r7 = (java.lang.Byte) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L15a:
            java.lang.Class r3 = java.lang.Float.TYPE
            if (r2 != r3) goto L171
            com.alibaba.fastjson2.reader.FieldReaderFloatValueField r0 = new com.alibaba.fastjson2.reader.FieldReaderFloatValueField
            r7 = r9
            java.lang.Float r7 = (java.lang.Float) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L171:
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            if (r2 != r3) goto L188
            com.alibaba.fastjson2.reader.FieldReaderFloatField r0 = new com.alibaba.fastjson2.reader.FieldReaderFloatField
            r7 = r9
            java.lang.Float r7 = (java.lang.Float) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L188:
            java.lang.Class r3 = java.lang.Double.TYPE
            if (r2 != r3) goto L19f
            com.alibaba.fastjson2.reader.FieldReaderDoubleValueField r0 = new com.alibaba.fastjson2.reader.FieldReaderDoubleValueField
            r7 = r9
            java.lang.Double r7 = (java.lang.Double) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L19f:
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            if (r2 != r3) goto L1b6
            com.alibaba.fastjson2.reader.FieldReaderDoubleField r0 = new com.alibaba.fastjson2.reader.FieldReaderDoubleField
            r7 = r9
            java.lang.Double r7 = (java.lang.Double) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L1b6:
            java.lang.Class r3 = java.lang.Character.TYPE
            if (r2 != r3) goto L1cd
            com.alibaba.fastjson2.reader.FieldReaderCharValueField r0 = new com.alibaba.fastjson2.reader.FieldReaderCharValueField
            r6 = r9
            java.lang.Character r6 = (java.lang.Character) r6
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r7 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L1cd:
            java.lang.Class<java.math.BigDecimal> r3 = java.math.BigDecimal.class
            if (r2 != r3) goto L1e4
            com.alibaba.fastjson2.reader.FieldReaderBigDecimalField r0 = new com.alibaba.fastjson2.reader.FieldReaderBigDecimalField
            r7 = r9
            java.math.BigDecimal r7 = (java.math.BigDecimal) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L1e4:
            java.lang.Class<java.math.BigInteger> r3 = java.math.BigInteger.class
            if (r2 != r3) goto L1fb
            com.alibaba.fastjson2.reader.FieldReaderBigIntegerField r0 = new com.alibaba.fastjson2.reader.FieldReaderBigIntegerField
            r7 = r9
            java.math.BigInteger r7 = (java.math.BigInteger) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L1fb:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            if (r2 != r3) goto L212
            com.alibaba.fastjson2.reader.FieldReaderStringField r0 = new com.alibaba.fastjson2.reader.FieldReaderStringField
            r7 = r9
            java.lang.String r7 = (java.lang.String) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L212:
            java.lang.Class<java.util.Date> r4 = java.util.Date.class
            if (r2 != r4) goto L22d
            com.alibaba.fastjson2.reader.FieldReaderDate r0 = new com.alibaba.fastjson2.reader.FieldReaderDate
            r11 = 0
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r10 = r27
            r3 = r2
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L22d:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r4 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r2 != r4) goto L242
            com.alibaba.fastjson2.reader.FieldReaderAtomicBooleanFieldReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderAtomicBooleanFieldReadOnly
            r5 = r9
            java.util.concurrent.atomic.AtomicBoolean r5 = (java.util.concurrent.atomic.AtomicBoolean) r5
            r1 = r18
            r3 = r19
            r4 = r22
            r6 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L242:
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r4 = java.util.concurrent.atomic.AtomicReference.class
            if (r2 != r4) goto L257
            com.alibaba.fastjson2.reader.FieldReaderAtomicReferenceField r0 = new com.alibaba.fastjson2.reader.FieldReaderAtomicReferenceField
            r1 = r18
            r4 = r19
            r5 = r22
            r6 = r27
            r3 = r2
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r0
        L257:
            r8 = r27
            r4 = r2
            r2 = r25
            boolean r5 = r2 instanceof java.lang.Class
            r6 = 0
            if (r5 != 0) goto L270
            com.alibaba.fastjson2.TypeReference r5 = com.alibaba.fastjson2.TypeReference.get(r17)
            r7 = r16
            java.lang.reflect.Type r5 = com.alibaba.fastjson2.util.BeanUtils.getFieldType(r5, r7, r8, r2)
            java.lang.Class r7 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r5)
            goto L272
        L270:
            r5 = r6
            r7 = r5
        L272:
            int r10 = r8.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isFinal(r10)
            java.lang.Class<java.util.Collection> r11 = java.util.Collection.class
            boolean r11 = r11.isAssignableFrom(r4)
            r12 = 0
            if (r11 == 0) goto L32c
            boolean r11 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r11 == 0) goto L2fd
            r11 = r5
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type[] r11 = r11.getActualTypeArguments()
            int r14 = r11.length
            if (r14 != r0) goto L2fd
            r4 = r11[r1]
            r2 = r5
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r4)
            if (r5 != r3) goto L2e7
            if (r10 == 0) goto L2cf
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r0 = r0.mask
            long r0 = r20 & r0
            int r0 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r0 == 0) goto L2be
            com.alibaba.fastjson2.reader.FieldReaderListFieldUF r0 = new com.alibaba.fastjson2.reader.FieldReaderListFieldUF
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r11 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r1 = r18
            r6 = r19
            r9 = r22
            r10 = r23
            r3 = r7
            r12 = r8
            r7 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            return r0
        L2be:
            r3 = r7
            com.alibaba.fastjson2.reader.FieldReaderCollectionFieldReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderCollectionFieldReadOnly
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8)
            return r0
        L2cf:
            r3 = r7
            com.alibaba.fastjson2.reader.FieldReaderListFieldUF r0 = new com.alibaba.fastjson2.reader.FieldReaderListFieldUF
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r11 = 0
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r1 = r18
            r6 = r19
            r7 = r20
            r9 = r22
            r10 = r23
            r12 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            return r0
        L2e7:
            r3 = r7
            com.alibaba.fastjson2.reader.FieldReaderListFieldUF r0 = new com.alibaba.fastjson2.reader.FieldReaderListFieldUF
            r11 = r9
            java.util.Collection r11 = (java.util.Collection) r11
            r1 = r18
            r6 = r19
            r7 = r20
            r9 = r22
            r10 = r23
            r12 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            return r0
        L2fd:
            boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L30d
            r0 = r2
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            int r3 = r0.length
            if (r3 <= 0) goto L30d
            r6 = r0[r1]
        L30d:
            if (r6 != 0) goto L311
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
        L311:
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getClass(r6)
            com.alibaba.fastjson2.reader.FieldReaderListFieldUF r0 = new com.alibaba.fastjson2.reader.FieldReaderListFieldUF
            r11 = r9
            java.util.Collection r11 = (java.util.Collection) r11
            r1 = r18
            r7 = r20
            r9 = r22
            r10 = r23
            r12 = r27
            r3 = r4
            r4 = r6
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12)
            return r0
        L32c:
            r2 = r4
            r3 = r7
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r1 = r0.isAssignableFrom(r2)
            if (r1 == 0) goto L366
            boolean r1 = r5 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L366
            r1 = r5
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            int r1 = r1.length
            r4 = 2
            if (r1 != r4) goto L366
            if (r10 == 0) goto L366
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r6 = r1.mask
            long r6 = r20 & r6
            int r1 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r1 != 0) goto L366
            com.alibaba.fastjson2.reader.FieldReaderMapFieldReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderMapFieldReadOnly
            r1 = r18
            r4 = r19
            r7 = r22
            r8 = r27
            r9 = r29
            r10 = r30
            r2 = r5
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L366:
            if (r10 == 0) goto L396
            java.lang.Class<int[]> r1 = int[].class
            if (r2 != r1) goto L37f
            com.alibaba.fastjson2.reader.FieldReaderInt32ValueArrayFinalField r0 = new com.alibaba.fastjson2.reader.FieldReaderInt32ValueArrayFinalField
            r7 = r9
            int[] r7 = (int[]) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L37f:
            java.lang.Class<long[]> r1 = long[].class
            if (r2 != r1) goto L396
            com.alibaba.fastjson2.reader.FieldReaderInt64ValueArrayFinalField r0 = new com.alibaba.fastjson2.reader.FieldReaderInt64ValueArrayFinalField
            r7 = r9
            long[] r7 = (long[]) r7
            r1 = r18
            r3 = r19
            r4 = r20
            r6 = r22
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L396:
            if (r3 == 0) goto L407
            r1 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r1 = r20 & r1
            int r1 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r1 == 0) goto L3bd
            boolean r2 = r0.isAssignableFrom(r3)
            if (r2 == 0) goto L3bd
            com.alibaba.fastjson2.reader.FieldReaderMapFieldReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderMapFieldReadOnly
            r1 = r18
            r4 = r19
            r7 = r22
            r3 = r26
            r8 = r27
            r9 = r29
            r10 = r30
            r2 = r5
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L3bd:
            r2 = r5
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L3f4
            if (r1 == 0) goto L3dc
            com.alibaba.fastjson2.reader.FieldReaderMapFieldReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderMapFieldReadOnly
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r3 = r26
            r8 = r27
            r9 = r29
            r10 = r30
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L3dc:
            com.alibaba.fastjson2.reader.FieldReaderMapField r0 = new com.alibaba.fastjson2.reader.FieldReaderMapField
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r11 = r29
            r12 = r30
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L3f4:
            com.alibaba.fastjson2.reader.FieldReaderObjectField r0 = new com.alibaba.fastjson2.reader.FieldReaderObjectField
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r3 = r26
            r8 = r9
            r9 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return r0
        L407:
            r2 = r26
            java.lang.Class<java.time.LocalDateTime> r0 = java.time.LocalDateTime.class
            if (r2 != r0) goto L424
            com.alibaba.fastjson2.reader.FieldReaderLocalDateTime r0 = new com.alibaba.fastjson2.reader.FieldReaderLocalDateTime
            r11 = 0
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r10 = r27
            r3 = r2
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L424:
            java.lang.Class<java.time.ZonedDateTime> r0 = java.time.ZonedDateTime.class
            if (r2 != r0) goto L43f
            com.alibaba.fastjson2.reader.FieldReaderZonedDateTime r0 = new com.alibaba.fastjson2.reader.FieldReaderZonedDateTime
            r11 = 0
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r10 = r27
            r3 = r2
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L43f:
            java.lang.Class<java.time.Instant> r0 = java.time.Instant.class
            if (r2 != r0) goto L45a
            com.alibaba.fastjson2.reader.FieldReaderInstant r0 = new com.alibaba.fastjson2.reader.FieldReaderInstant
            r11 = 0
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r10 = r27
            r3 = r2
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L45a:
            com.alibaba.fastjson2.reader.FieldReaderObjectField r0 = new com.alibaba.fastjson2.reader.FieldReaderObjectField
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r2 = r25
            r3 = r26
            r8 = r9
            r9 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader<T> createFieldReader(java.lang.Class r15, java.lang.reflect.Type r16, java.lang.String r17, long r18, java.lang.String r20, java.lang.reflect.Type r21, java.lang.Class r22, java.lang.reflect.Field r23) {
            r14 = this;
            java.lang.Class r11 = r23.getType()
            r13 = 0
            r4 = 0
            r8 = 0
            r9 = 0
            r0 = r14
            r1 = r15
            r2 = r16
            r3 = r17
            r5 = r18
            r7 = r20
            r10 = r21
            r12 = r23
            com.alibaba.fastjson2.reader.FieldReader r15 = r0.createFieldReader(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            return r15
    }

    public <T, V> com.alibaba.fastjson2.reader.FieldReader createFieldReader(java.lang.Class r17, java.lang.reflect.Type r18, java.lang.String r19, java.lang.reflect.Type r20, java.lang.Class<V> r21, int r22, long r23, java.lang.String r25, java.util.Locale r26, java.lang.Object r27, java.lang.reflect.Method r28, java.util.function.BiConsumer<T, V> r29, com.alibaba.fastjson2.reader.ObjectReader r30) {
            r16 = this;
            r13 = r30
            if (r13 == 0) goto L23
            com.alibaba.fastjson2.reader.FieldReaderObject r0 = new com.alibaba.fastjson2.reader.FieldReaderObject
            r1 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r5 = r23 | r1
            r11 = 0
            r1 = r19
            r2 = r20
            r3 = r21
            r4 = r22
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r12 = r29
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r0.initReader = r13
            return r0
        L23:
            r2 = r21
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r2 != r0) goto L3f
            com.alibaba.fastjson2.reader.FieldReaderInt32Func r0 = new com.alibaba.fastjson2.reader.FieldReaderInt32Func
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        L3f:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r2 != r0) goto L59
            com.alibaba.fastjson2.reader.FieldReaderInt64Func r0 = new com.alibaba.fastjson2.reader.FieldReaderInt64Func
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        L59:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 != r0) goto L73
            com.alibaba.fastjson2.reader.FieldReaderStringFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderStringFunc
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        L73:
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            if (r2 != r1) goto L8d
            com.alibaba.fastjson2.reader.FieldReaderBoolFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderBoolFunc
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        L8d:
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
            if (r2 != r1) goto La7
            com.alibaba.fastjson2.reader.FieldReaderInt16Func r0 = new com.alibaba.fastjson2.reader.FieldReaderInt16Func
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        La7:
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            if (r2 != r1) goto Lc1
            com.alibaba.fastjson2.reader.FieldReaderInt8Func r0 = new com.alibaba.fastjson2.reader.FieldReaderInt8Func
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        Lc1:
            java.lang.Class<java.math.BigDecimal> r1 = java.math.BigDecimal.class
            if (r2 != r1) goto Ldb
            com.alibaba.fastjson2.reader.FieldReaderBigDecimalFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderBigDecimalFunc
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        Ldb:
            java.lang.Class<java.math.BigInteger> r1 = java.math.BigInteger.class
            if (r2 != r1) goto Lf5
            com.alibaba.fastjson2.reader.FieldReaderBigIntegerFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderBigIntegerFunc
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r8 = r27
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        Lf5:
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            if (r2 != r1) goto L111
            com.alibaba.fastjson2.reader.FieldReaderFloatFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderFloatFunc
            r8 = r27
            java.lang.Float r8 = (java.lang.Float) r8
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        L111:
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            if (r2 != r1) goto L12d
            com.alibaba.fastjson2.reader.FieldReaderDoubleFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderDoubleFunc
            r8 = r27
            java.lang.Double r8 = (java.lang.Double) r8
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        L12d:
            java.lang.Class<java.lang.Number> r1 = java.lang.Number.class
            if (r2 != r1) goto L149
            com.alibaba.fastjson2.reader.FieldReaderNumberFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderNumberFunc
            r8 = r27
            java.lang.Number r8 = (java.lang.Number) r8
            r1 = r19
            r3 = r22
            r4 = r23
            r6 = r25
            r7 = r26
            r9 = r28
            r10 = r29
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        L149:
            java.lang.Class<java.util.Date> r1 = java.util.Date.class
            if (r2 != r1) goto L167
            com.alibaba.fastjson2.reader.FieldReaderDate r0 = new com.alibaba.fastjson2.reader.FieldReaderDate
            r10 = 0
            r1 = r19
            r4 = r22
            r5 = r23
            r7 = r25
            r8 = r26
            r9 = r27
            r11 = r28
            r12 = r29
            r3 = r2
            r2 = r20
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L167:
            r3 = r2
            r2 = r20
            boolean r1 = r2 instanceof java.lang.Class
            r4 = 0
            if (r1 != 0) goto L184
            if (r18 != 0) goto L176
        L171:
            r1 = r17
            r9 = r28
            goto L17b
        L176:
            com.alibaba.fastjson2.TypeReference r4 = com.alibaba.fastjson2.TypeReference.get(r18)
            goto L171
        L17b:
            java.lang.reflect.Type r4 = com.alibaba.fastjson2.util.BeanUtils.getFieldType(r4, r1, r9, r2)
            java.lang.Class r1 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r4)
            goto L187
        L184:
            r9 = r28
            r1 = r4
        L187:
            java.lang.Class<java.util.List> r5 = java.util.List.class
            if (r3 == r5) goto L18f
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            if (r3 != r5) goto L191
        L18f:
            r3 = r4
            goto L1c3
        L191:
            if (r4 == 0) goto L1aa
            com.alibaba.fastjson2.reader.FieldReaderObjectFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderObjectFunc
            r12 = 0
            r1 = r19
            r5 = r23
            r7 = r25
            r8 = r26
            r11 = r29
            r2 = r4
            r10 = r9
            r4 = r22
            r9 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L1aa:
            com.alibaba.fastjson2.reader.FieldReaderObjectFunc r0 = new com.alibaba.fastjson2.reader.FieldReaderObjectFunc
            r12 = 0
            r1 = r19
            r3 = r21
            r4 = r22
            r5 = r23
            r7 = r25
            r8 = r26
            r9 = r27
            r10 = r28
            r11 = r29
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L1c3:
            boolean r2 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L1fc
            r4 = r3
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r2 = r4.getActualTypeArguments()
            int r4 = r2.length
            r5 = 1
            if (r4 != r5) goto L1fc
            r4 = 0
            r2 = r2[r4]
            java.lang.Class r4 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r2)
            if (r4 != r0) goto L1f7
            r4 = r1
            com.alibaba.fastjson2.reader.FieldReaderList r1 = new com.alibaba.fastjson2.reader.FieldReaderList
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r14 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r2 = r19
            r7 = r22
            r8 = r23
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r15 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15)
            return r1
        L1f7:
            r0 = r4
            r4 = r1
            r6 = r0
            r5 = r2
            goto L201
        L1fc:
            r4 = r1
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            r5 = r2
            r6 = r5
        L201:
            com.alibaba.fastjson2.reader.FieldReaderList r1 = new com.alibaba.fastjson2.reader.FieldReaderList
            r14 = 0
            r2 = r19
            r7 = r22
            r8 = r23
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r15 = r29
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12, r13, r14, r15)
            return r1
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader<T> createFieldReader(java.lang.String r11, java.lang.String r12, java.lang.reflect.Type r13, java.lang.reflect.Field r14) {
            r10 = this;
            java.lang.Class r1 = r14.getDeclaringClass()
            r4 = 0
            java.lang.Class r8 = r14.getType()
            r2 = r1
            r0 = r10
            r3 = r11
            r6 = r12
            r7 = r13
            r9 = r14
            com.alibaba.fastjson2.reader.FieldReader r11 = r0.createFieldReader(r1, r2, r3, r4, r6, r7, r8, r9)
            return r11
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader<T> createFieldReader(java.lang.String r3, java.lang.reflect.Field r4) {
            r2 = this;
            r0 = 0
            java.lang.reflect.Type r1 = r4.getGenericType()
            com.alibaba.fastjson2.reader.FieldReader r3 = r2.createFieldReader(r3, r0, r1, r4)
            return r3
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReader(java.lang.String r15, java.lang.reflect.Method r16) {
            r14 = this;
            java.lang.Class r1 = r16.getDeclaringClass()
            java.lang.Class[] r0 = r16.getParameterTypes()
            int r2 = r0.length
            if (r2 != 0) goto L16
            java.lang.Class r0 = r16.getReturnType()
            java.lang.reflect.Type r2 = r16.getGenericReturnType()
        L13:
            r11 = r0
            r10 = r2
            goto L24
        L16:
            int r2 = r0.length
            r3 = 1
            if (r2 != r3) goto L35
            r2 = 0
            r0 = r0[r2]
            java.lang.reflect.Type[] r3 = r16.getGenericParameterTypes()
            r2 = r3[r2]
            goto L13
        L24:
            r9 = 0
            r13 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r2 = r1
            r0 = r14
            r3 = r15
            r12 = r16
            com.alibaba.fastjson2.reader.FieldReader r15 = r0.createFieldReaderMethod(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            return r15
        L35:
            java.lang.String r15 = "illegal setter method "
            r12 = r16
            ah.a.v(r12, r15)
            r15 = 0
            return r15
    }

    public <T, V> com.alibaba.fastjson2.reader.FieldReader createFieldReader(java.lang.String r16, java.lang.reflect.Type r17, java.lang.Class<V> r18, java.lang.reflect.Method r19, java.util.function.BiConsumer<T, V> r20) {
            r15 = this;
            r11 = 0
            r14 = 0
            r1 = 0
            r2 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r0 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r12 = r19
            r13 = r20
            com.alibaba.fastjson2.reader.FieldReader r1 = r0.createFieldReader(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            return r1
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader<T> createFieldReader(java.lang.String r2, java.lang.reflect.Type r3, java.lang.reflect.Field r4) {
            r1 = this;
            r0 = 0
            com.alibaba.fastjson2.reader.FieldReader r2 = r1.createFieldReader(r2, r0, r3, r4)
            return r2
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReaderMethod(java.lang.Class<T> r15, java.lang.String r16, java.lang.String r17, java.lang.reflect.Type r18, java.lang.Class r19, java.lang.reflect.Method r20) {
            r14 = this;
            r9 = 0
            r13 = 0
            r4 = 0
            r5 = 0
            r8 = 0
            r2 = r15
            r0 = r14
            r1 = r15
            r3 = r16
            r7 = r17
            r10 = r18
            r11 = r19
            r12 = r20
            com.alibaba.fastjson2.reader.FieldReader r15 = r0.createFieldReaderMethod(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13)
            return r15
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReaderMethod(java.lang.Class<T> r18, java.lang.reflect.Type r19, java.lang.String r20, int r21, long r22, java.lang.String r24, java.util.Locale r25, java.lang.Object r26, java.lang.reflect.Type r27, java.lang.Class r28, java.lang.reflect.Method r29, com.alibaba.fastjson2.reader.ObjectReader r30) {
            r17 = this;
            r15 = 0
            r16 = 0
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            com.alibaba.fastjson2.reader.FieldReader r0 = r1.createFieldReaderMethod(r2, r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReaderMethod(java.lang.Class<T> r16, java.lang.reflect.Type r17, java.lang.String r18, int r19, long r20, java.lang.String r22, java.util.Locale r23, java.lang.Object r24, java.lang.reflect.Type r25, java.lang.Class r26, java.lang.reflect.Method r27, com.alibaba.fastjson2.reader.ObjectReader r28, java.lang.String r29, java.util.function.BiConsumer r30) {
            r15 = this;
            r0 = r24
            r2 = r25
            r3 = r26
            r10 = r27
            r13 = r28
            r1 = 1
            if (r10 == 0) goto L10
            r10.setAccessible(r1)
        L10:
            boolean r4 = r0 instanceof java.lang.String
            if (r4 == 0) goto L20
            boolean r4 = r3.isEnum()
            if (r4 == 0) goto L20
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Enum r0 = java.lang.Enum.valueOf(r3, r0)
        L20:
            if (r0 == 0) goto L3a
            java.lang.Class r4 = r0.getClass()
            if (r4 == r3) goto L3a
            com.alibaba.fastjson2.reader.ObjectReaderProvider r4 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            java.lang.Class r5 = r0.getClass()
            java.util.function.Function r4 = r4.getTypeConvert(r5, r2)
            if (r4 == 0) goto L3c
            java.lang.Object r0 = r4.apply(r0)
        L3a:
            r9 = r0
            goto L51
        L3c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "illegal defaultValue : "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", class "
            java.lang.String r2 = r3.getName()
            ah.a.s(r1, r0, r2)
            r0 = 0
            return r0
        L51:
            if (r13 == 0) goto L69
            com.alibaba.fastjson2.reader.FieldReaderObject r0 = new com.alibaba.fastjson2.reader.FieldReaderObject
            r4 = 2251799813685248(0x8000000000000, double:1.1125369292536007E-308)
            long r5 = r20 | r4
            r11 = 0
            r12 = 0
            r1 = r18
            r4 = r19
            r7 = r22
            r8 = r23
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r0.initReader = r13
            return r0
        L69:
            java.lang.Class r0 = java.lang.Boolean.TYPE
            if (r2 != r0) goto L80
            com.alibaba.fastjson2.reader.FieldReaderBoolValueMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderBoolValueMethod
            r6 = r9
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r7 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L80:
            java.lang.Class<java.lang.Boolean> r0 = java.lang.Boolean.class
            if (r2 != r0) goto L9a
            com.alibaba.fastjson2.reader.FieldReaderBoolMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderBoolMethod
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L9a:
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r2 != r0) goto Lb4
            com.alibaba.fastjson2.reader.FieldReaderInt8ValueMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderInt8ValueMethod
            java.lang.Byte r9 = (java.lang.Byte) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        Lb4:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r2 != r0) goto Lce
            com.alibaba.fastjson2.reader.FieldReaderInt16ValueMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderInt16ValueMethod
            java.lang.Short r9 = (java.lang.Short) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        Lce:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 != r0) goto Le7
            com.alibaba.fastjson2.reader.FieldReaderInt32ValueMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderInt32ValueMethod
            r8 = r9
            java.lang.Integer r8 = (java.lang.Integer) r8
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r3 = r26
            r9 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return r0
        Le7:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r2 != r0) goto L101
            com.alibaba.fastjson2.reader.FieldReaderInt64ValueMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderInt64ValueMethod
            java.lang.Long r9 = (java.lang.Long) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L101:
            java.lang.Class r0 = java.lang.Float.TYPE
            if (r2 != r0) goto L11b
            com.alibaba.fastjson2.reader.FieldReaderFloatValueMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderFloatValueMethod
            java.lang.Float r9 = (java.lang.Float) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L11b:
            java.lang.Class r0 = java.lang.Double.TYPE
            if (r2 != r0) goto L135
            com.alibaba.fastjson2.reader.FieldReaderDoubleValueMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderDoubleValueMethod
            java.lang.Double r9 = (java.lang.Double) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L135:
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r2 != r0) goto L14f
            com.alibaba.fastjson2.reader.FieldReaderInt8Method r0 = new com.alibaba.fastjson2.reader.FieldReaderInt8Method
            java.lang.Byte r9 = (java.lang.Byte) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L14f:
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r2 != r0) goto L169
            com.alibaba.fastjson2.reader.FieldReaderInt16Method r0 = new com.alibaba.fastjson2.reader.FieldReaderInt16Method
            java.lang.Short r9 = (java.lang.Short) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L169:
            r3 = r26
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r2 != r0) goto L184
            com.alibaba.fastjson2.reader.FieldReaderInt32Method r0 = new com.alibaba.fastjson2.reader.FieldReaderInt32Method
            r7 = r9
            java.lang.Integer r7 = (java.lang.Integer) r7
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r8 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
        L184:
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r2 != r0) goto L19d
            com.alibaba.fastjson2.reader.FieldReaderInt64Method r0 = new com.alibaba.fastjson2.reader.FieldReaderInt64Method
            r7 = r9
            java.lang.Long r7 = (java.lang.Long) r7
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r8 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
        L19d:
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            if (r2 != r0) goto L1b6
            com.alibaba.fastjson2.reader.FieldReaderFloatMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderFloatMethod
            r7 = r9
            java.lang.Float r7 = (java.lang.Float) r7
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r6 = r23
            r8 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7, r8)
            return r0
        L1b6:
            java.lang.Class<java.lang.Double> r0 = java.lang.Double.class
            if (r2 != r0) goto L1cd
            com.alibaba.fastjson2.reader.FieldReaderDoubleMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderDoubleMethod
            r6 = r9
            java.lang.Double r6 = (java.lang.Double) r6
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r22
            r7 = r27
            r0.<init>(r1, r2, r3, r5, r6, r7)
            return r0
        L1cd:
            java.lang.Class<java.math.BigDecimal> r0 = java.math.BigDecimal.class
            if (r3 != r0) goto L1e5
            com.alibaba.fastjson2.reader.FieldReaderBigDecimalMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderBigDecimalMethod
            java.math.BigDecimal r9 = (java.math.BigDecimal) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L1e5:
            java.lang.Class<java.math.BigInteger> r0 = java.math.BigInteger.class
            if (r3 != r0) goto L1ff
            com.alibaba.fastjson2.reader.FieldReaderBigIntegerMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderBigIntegerMethod
            java.math.BigInteger r9 = (java.math.BigInteger) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r2 = r25
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L1ff:
            r2 = r25
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r2 != r0) goto L21b
            com.alibaba.fastjson2.reader.FieldReaderStringMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderStringMethod
            java.lang.String r9 = (java.lang.String) r9
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10)
            return r0
        L21b:
            java.lang.Class<java.time.LocalDate> r3 = java.time.LocalDate.class
            if (r2 != r3) goto L235
            com.alibaba.fastjson2.reader.FieldReaderLocalDate r0 = new com.alibaba.fastjson2.reader.FieldReaderLocalDate
            r11 = 0
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L235:
            java.lang.Class<java.time.OffsetDateTime> r3 = java.time.OffsetDateTime.class
            if (r2 != r3) goto L24f
            com.alibaba.fastjson2.reader.FieldReaderOffsetDateTime r0 = new com.alibaba.fastjson2.reader.FieldReaderOffsetDateTime
            r11 = 0
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L24f:
            java.lang.Class<java.util.UUID> r3 = java.util.UUID.class
            if (r2 != r3) goto L269
            com.alibaba.fastjson2.reader.FieldReaderUUID r0 = new com.alibaba.fastjson2.reader.FieldReaderUUID
            r11 = 0
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L269:
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            if (r2 != r3) goto L283
            com.alibaba.fastjson2.reader.FieldReaderStringArray r0 = new com.alibaba.fastjson2.reader.FieldReaderStringArray
            r11 = 0
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L283:
            r4 = r19
            r3 = r26
            r10 = r27
            r2 = r1
            r1 = r18
            java.lang.Class[] r5 = r10.getParameterTypes()
            int r5 = r5.length
            java.lang.Class<java.util.Map> r6 = java.util.Map.class
            r7 = 0
            r8 = 0
            if (r5 != 0) goto L354
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r5 = java.util.concurrent.atomic.AtomicInteger.class
            if (r3 != r5) goto L2a1
            com.alibaba.fastjson2.reader.FieldReaderAtomicIntegerMethodReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderAtomicIntegerMethodReadOnly
            r0.<init>(r1, r3, r4, r10)
            return r0
        L2a1:
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r5 = java.util.concurrent.atomic.AtomicLong.class
            if (r3 != r5) goto L2ab
            com.alibaba.fastjson2.reader.FieldReaderAtomicLongReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderAtomicLongReadOnly
            r0.<init>(r1, r3, r4, r10)
            return r0
        L2ab:
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r5 = java.util.concurrent.atomic.AtomicIntegerArray.class
            if (r3 != r5) goto L2b5
            com.alibaba.fastjson2.reader.FieldReaderAtomicIntegerArrayReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderAtomicIntegerArrayReadOnly
            r0.<init>(r1, r3, r4, r10)
            return r0
        L2b5:
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r5 = java.util.concurrent.atomic.AtomicLongArray.class
            if (r3 != r5) goto L2bf
            com.alibaba.fastjson2.reader.FieldReaderAtomicLongArrayReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderAtomicLongArrayReadOnly
            r0.<init>(r1, r3, r4, r10)
            return r0
        L2bf:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r5 = java.util.concurrent.atomic.AtomicBoolean.class
            if (r3 != r5) goto L2c9
            com.alibaba.fastjson2.reader.FieldReaderAtomicBooleanMethodReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderAtomicBooleanMethodReadOnly
            r0.<init>(r1, r3, r4, r10)
            return r0
        L2c9:
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r5 = java.util.concurrent.atomic.AtomicReference.class
            if (r3 != r5) goto L2d6
            com.alibaba.fastjson2.reader.FieldReaderAtomicReferenceMethodReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderAtomicReferenceMethodReadOnly
            r2 = r25
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        L2d6:
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            boolean r1 = r1.isAssignableFrom(r3)
            java.lang.String r4 = "get"
            if (r1 == 0) goto L30f
            java.lang.String r0 = r27.getName()
            boolean r1 = r0.startsWith(r4, r7)
            if (r1 == 0) goto L2fc
            com.alibaba.fastjson2.PropertyNamingStrategy r1 = com.alibaba.fastjson2.PropertyNamingStrategy.CamelCase
            java.lang.String r1 = r1.name()
            java.lang.String r0 = com.alibaba.fastjson2.util.BeanUtils.getterName(r0, r1)
            java.lang.Class r1 = r27.getDeclaringClass()
            java.lang.reflect.Field r8 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r1, r0)
        L2fc:
            r9 = r8
            com.alibaba.fastjson2.reader.FieldReaderCollectionMethodReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderCollectionMethodReadOnly
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r2 = r25
            r8 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9)
            return r0
        L30f:
            boolean r1 = r6.isAssignableFrom(r3)
            if (r1 == 0) goto L348
            java.lang.String r0 = r27.getName()
            boolean r1 = r0.startsWith(r4, r7)
            if (r1 == 0) goto L331
            com.alibaba.fastjson2.PropertyNamingStrategy r1 = com.alibaba.fastjson2.PropertyNamingStrategy.CamelCase
            java.lang.String r1 = r1.name()
            java.lang.String r0 = com.alibaba.fastjson2.util.BeanUtils.getterName(r0, r1)
            java.lang.Class r1 = r27.getDeclaringClass()
            java.lang.reflect.Field r8 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r1, r0)
        L331:
            r9 = r8
            com.alibaba.fastjson2.reader.FieldReaderMapMethodReadOnly r0 = new com.alibaba.fastjson2.reader.FieldReaderMapMethodReadOnly
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r2 = r25
            r8 = r27
            r10 = r29
            r11 = r30
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11)
            return r0
        L348:
            r10 = r27
            r1 = r2
            r2 = r25
            boolean r4 = r16.isInterface()
            if (r4 != 0) goto L357
            return r8
        L354:
            r1 = r2
            r2 = r25
        L357:
            boolean r4 = r2 instanceof java.lang.Class
            if (r4 != 0) goto L36a
            com.alibaba.fastjson2.TypeReference r4 = com.alibaba.fastjson2.TypeReference.get(r17)
            r5 = r16
            java.lang.reflect.Type r4 = com.alibaba.fastjson2.util.BeanUtils.getFieldType(r4, r5, r10, r2)
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r4)
            goto L36c
        L36a:
            r4 = r8
            r5 = r4
        L36c:
            java.lang.Class<java.util.List> r11 = java.util.List.class
            if (r3 == r11) goto L422
            java.lang.Class<java.util.ArrayList> r11 = java.util.ArrayList.class
            if (r3 != r11) goto L376
            goto L422
        L376:
            java.lang.Class<java.util.Date> r0 = java.util.Date.class
            if (r3 != r0) goto L38e
            com.alibaba.fastjson2.reader.FieldReaderDate r0 = new com.alibaba.fastjson2.reader.FieldReaderDate
            r10 = 0
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r11 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L38e:
            java.lang.Class<java.lang.StackTraceElement[]> r0 = java.lang.StackTraceElement[].class
            if (r3 != r0) goto L3b8
            java.lang.Class r0 = r27.getDeclaringClass()
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            if (r0 != r2) goto L3b8
            com.alibaba.fastjson2.reader.FieldReaderStackTrace r0 = new com.alibaba.fastjson2.reader.FieldReaderStackTrace
            if (r4 == 0) goto L3a0
            r2 = r4
            goto L3a2
        L3a0:
            r2 = r25
        L3a2:
            com.alibaba.fastjson2.reader.d r12 = new com.alibaba.fastjson2.reader.d
            r12.<init>()
            r11 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L3b8:
            r10 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r10 = r20 & r10
            r12 = 0
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 == 0) goto L3e3
            java.lang.String r0 = r27.getName()
            java.lang.String r2 = "set"
            boolean r2 = r0.startsWith(r2, r7)
            if (r2 == 0) goto L3e3
            com.alibaba.fastjson2.PropertyNamingStrategy r2 = com.alibaba.fastjson2.PropertyNamingStrategy.CamelCase
            java.lang.String r2 = r2.name()
            java.lang.String r0 = com.alibaba.fastjson2.util.BeanUtils.setterName(r0, r2)
            java.lang.Class r2 = r27.getDeclaringClass()
            java.lang.reflect.Field r8 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r2, r0)
            r8.setAccessible(r1)     // Catch: java.lang.Throwable -> L3e3
        L3e3:
            r11 = r8
            boolean r0 = r6.isAssignableFrom(r3)
            if (r0 == 0) goto L407
            com.alibaba.fastjson2.reader.FieldReaderMapMethod r0 = new com.alibaba.fastjson2.reader.FieldReaderMapMethod
            if (r4 == 0) goto L3f0
            r2 = r4
            goto L3f2
        L3f0:
            r2 = r25
        L3f2:
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r10 = r27
            r13 = r29
            r14 = r30
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L407:
            com.alibaba.fastjson2.reader.FieldReaderObject r0 = new com.alibaba.fastjson2.reader.FieldReaderObject
            if (r4 == 0) goto L40d
            r2 = r4
            goto L40f
        L40d:
            r2 = r25
        L40f:
            r12 = 0
            r1 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r8 = r23
            r3 = r26
            r10 = r27
            r0.<init>(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            return r0
        L422:
            boolean r2 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L46c
            r2 = r4
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r2 = r2.getActualTypeArguments()
            int r3 = r2.length
            if (r3 != r1) goto L46c
            r1 = r2[r7]
            r3 = r5
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r1)
            if (r5 != r0) goto L455
            com.alibaba.fastjson2.reader.FieldReaderList r0 = new com.alibaba.fastjson2.reader.FieldReaderList
            r13 = 0
            r14 = 0
            r2 = r4
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r11 = 0
            r1 = r18
            r6 = r19
            r7 = r20
            r9 = r22
            r10 = r23
            r3 = r26
            r12 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            return r0
        L455:
            r2 = r4
            com.alibaba.fastjson2.reader.FieldReaderList r0 = new com.alibaba.fastjson2.reader.FieldReaderList
            r13 = 0
            r14 = 0
            r11 = 0
            r6 = r19
            r7 = r20
            r9 = r22
            r10 = r23
            r12 = r27
            r4 = r1
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            return r0
        L46c:
            com.alibaba.fastjson2.reader.FieldReaderList r0 = new com.alibaba.fastjson2.reader.FieldReaderList
            r13 = 0
            r14 = 0
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
            r11 = 0
            r1 = r18
            r6 = r19
            r7 = r20
            r9 = r22
            r10 = r23
            r2 = r25
            r3 = r26
            r12 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReaderParam(java.lang.Class<T> r16, java.lang.reflect.Type r17, java.lang.String r18, int r19, long r20, java.lang.String r22, java.lang.reflect.Type r23, java.lang.Class r24, java.lang.String r25, java.lang.Class r26) {
            r15 = this;
            r9 = 0
            r14 = 0
            r8 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            com.alibaba.fastjson2.reader.FieldReader r1 = r0.createFieldReaderParam(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReaderParam(java.lang.Class<T> r16, java.lang.reflect.Type r17, java.lang.String r18, int r19, long r20, java.lang.String r22, java.lang.reflect.Type r23, java.lang.Class r24, java.lang.String r25, java.lang.Class r26, com.alibaba.fastjson2.reader.ObjectReader r27) {
            r15 = this;
            r8 = 0
            r9 = 0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            com.alibaba.fastjson2.reader.FieldReader r1 = r0.createFieldReaderParam(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader createFieldReaderParam(java.lang.Class<T> r14, java.lang.reflect.Type r15, java.lang.String r16, int r17, long r18, java.lang.String r20, java.util.Locale r21, java.lang.Object r22, java.lang.reflect.Type r23, java.lang.Class r24, java.lang.String r25, java.lang.Class r26, com.alibaba.fastjson2.reader.ObjectReader r27) {
            r13 = this;
            r11 = r27
            if (r11 == 0) goto L1e
            com.alibaba.fastjson2.reader.FieldReaderObjectParam r0 = new com.alibaba.fastjson2.reader.FieldReaderObjectParam
            r1 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r8, r9, r10)
            r0.initReader = r11
            return r0
        L1e:
            r2 = r23
            java.lang.Class r0 = java.lang.Byte.TYPE
            if (r2 == r0) goto Lc4
            java.lang.Class<java.lang.Byte> r0 = java.lang.Byte.class
            if (r2 != r0) goto L2a
            goto Lc4
        L2a:
            java.lang.Class r0 = java.lang.Short.TYPE
            if (r2 == r0) goto Lae
            java.lang.Class<java.lang.Short> r0 = java.lang.Short.class
            if (r2 != r0) goto L34
            goto Lae
        L34:
            java.lang.Class r0 = java.lang.Integer.TYPE
            if (r2 == r0) goto L98
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            if (r2 != r0) goto L3e
            goto L98
        L3e:
            java.lang.Class r0 = java.lang.Long.TYPE
            if (r2 == r0) goto L82
            java.lang.Class<java.lang.Long> r0 = java.lang.Long.class
            if (r2 != r0) goto L47
            goto L82
        L47:
            boolean r0 = r2 instanceof java.lang.Class
            r1 = 0
            if (r0 != 0) goto L62
            if (r15 == 0) goto L62
            com.alibaba.fastjson2.TypeReference r15 = com.alibaba.fastjson2.TypeReference.get(r15)
            r0 = r26
            java.lang.reflect.Type r14 = com.alibaba.fastjson2.util.BeanUtils.getParamType(r15, r14, r0, r2)
            if (r14 == 0) goto L5e
            java.lang.Class r1 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r14)
        L5e:
            r12 = r1
            r1 = r14
            r14 = r12
            goto L63
        L62:
            r14 = r1
        L63:
            if (r1 != 0) goto L67
            r3 = r2
            goto L68
        L67:
            r3 = r1
        L68:
            if (r14 != 0) goto L6d
            r4 = r24
            goto L6e
        L6d:
            r4 = r14
        L6e:
            com.alibaba.fastjson2.reader.FieldReaderObjectParam r1 = new com.alibaba.fastjson2.reader.FieldReaderObjectParam
            r2 = r16
            r6 = r17
            r7 = r18
            r9 = r20
            r10 = r21
            r11 = r22
            r5 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7, r9, r10, r11)
            return r1
        L82:
            com.alibaba.fastjson2.reader.FieldReaderInt64Param r1 = new com.alibaba.fastjson2.reader.FieldReaderInt64Param
            r2 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r3 = r24
            r4 = r25
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10)
            return r1
        L98:
            com.alibaba.fastjson2.reader.FieldReaderInt32Param r1 = new com.alibaba.fastjson2.reader.FieldReaderInt32Param
            r2 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r3 = r24
            r4 = r25
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10)
            return r1
        Lae:
            com.alibaba.fastjson2.reader.FieldReaderInt16Param r1 = new com.alibaba.fastjson2.reader.FieldReaderInt16Param
            r2 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r3 = r24
            r4 = r25
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10)
            return r1
        Lc4:
            com.alibaba.fastjson2.reader.FieldReaderInt8Param r1 = new com.alibaba.fastjson2.reader.FieldReaderInt8Param
            r2 = r16
            r5 = r17
            r6 = r18
            r8 = r20
            r9 = r21
            r10 = r22
            r3 = r24
            r4 = r25
            r1.<init>(r2, r3, r4, r5, r6, r8, r9, r10)
            return r1
    }

    public com.alibaba.fastjson2.reader.FieldReader[] createFieldReaders(com.alibaba.fastjson2.reader.ObjectReaderProvider r27, java.lang.Class r28, java.lang.reflect.Type r29, java.lang.reflect.AccessibleObject r30, java.lang.Class[] r31, java.lang.String... r32) {
            r26 = this;
            r6 = r30
            r7 = r31
            r8 = r32
            boolean r9 = r6 instanceof java.lang.reflect.Constructor
            if (r9 == 0) goto L1e
            r0 = r6
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            java.lang.Class r1 = r0.getDeclaringClass()
            java.lang.reflect.Type[] r2 = r0.getGenericParameterTypes()
            java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
        L19:
            r5 = r0
            r25 = r2
            r2 = r1
            goto L37
        L1e:
            boolean r0 = r6 instanceof java.lang.reflect.Method
            if (r0 == 0) goto L32
            r0 = r6
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            java.lang.Class r1 = r0.getDeclaringClass()
            java.lang.reflect.Type[] r2 = r0.getGenericParameterTypes()
            java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
            goto L19
        L32:
            r1 = 0
            r2 = r1
            r5 = r2
            r25 = r5
        L37:
            int r0 = r7.length
            com.alibaba.fastjson2.reader.FieldReader[] r10 = new com.alibaba.fastjson2.reader.FieldReader[r0]
            r0 = 0
            r14 = r0
        L3c:
            int r0 = r7.length
            if (r14 >= r0) goto Lc3
            com.alibaba.fastjson2.codec.FieldInfo r1 = new com.alibaba.fastjson2.codec.FieldInfo
            r1.<init>()
            int r0 = r8.length
            java.lang.String r11 = "arg"
            if (r14 >= r0) goto L4d
            r0 = r8[r14]
        L4b:
            r12 = r0
            goto L52
        L4d:
            java.lang.String r0 = eh.a.l(r14, r11)
            goto L4b
        L52:
            if (r9 == 0) goto L5e
            r3 = r6
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            r0 = r27
            r4 = r14
            r0.getFieldInfo(r1, r2, r3, r4, r5)
            goto L60
        L5e:
            r0 = r27
        L60:
            if (r9 == 0) goto L6b
            java.lang.reflect.Field r3 = com.alibaba.fastjson2.util.BeanUtils.getDeclaredField(r2, r12)
            if (r3 == 0) goto L6b
            r0.getFieldInfo(r1, r2, r3)
        L6b:
            java.lang.String r3 = r1.fieldName
            if (r3 == 0) goto L79
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L76
            goto L79
        L76:
            java.lang.String r3 = r1.fieldName
            goto L7a
        L79:
            r3 = r12
        L7a:
            if (r3 != 0) goto L80
            java.lang.String r3 = eh.a.l(r14, r11)
        L80:
            r13 = r3
            if (r12 != 0) goto L87
            java.lang.String r12 = eh.a.l(r14, r11)
        L87:
            r22 = r12
            r3 = r25[r14]
            r4 = r28
            r11 = r29
            java.lang.reflect.Type r12 = com.alibaba.fastjson2.util.BeanUtils.resolve(r11, r4, r3)
            if (r12 == 0) goto L96
            r3 = r12
        L96:
            r12 = r7[r14]
            com.alibaba.fastjson2.reader.ObjectReader r24 = getInitReader(r0, r3, r12, r1)
            r23 = r2
            r20 = r3
            long r2 = r1.features
            java.lang.String r12 = r1.format
            java.util.Locale r15 = r1.locale
            java.lang.String r1 = r1.defaultValue
            r21 = r7[r14]
            r11 = 0
            r17 = r12
            r12 = 0
            r19 = r1
            r1 = r10
            r18 = r15
            r10 = r26
            r15 = r2
            com.alibaba.fastjson2.reader.FieldReader r2 = r10.createFieldReaderParam(r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            r1[r14] = r2
            int r14 = r14 + 1
            r10 = r1
            r2 = r23
            goto L3c
        Lc3:
            r1 = r10
            return r1
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader[] createFieldReaders(java.lang.Class<T> r7) {
            r6 = this;
            r4 = 0
            com.alibaba.fastjson2.reader.ObjectReaderProvider r5 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r3 = 0
            r2 = r7
            r0 = r6
            r1 = r7
            com.alibaba.fastjson2.reader.FieldReader[] r7 = r0.createFieldReaders(r1, r2, r3, r4, r5)
            return r7
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader[] createFieldReaders(java.lang.Class<T> r7, java.lang.reflect.Type r8) {
            r6 = this;
            r4 = 0
            com.alibaba.fastjson2.reader.ObjectReaderProvider r5 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r3 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            com.alibaba.fastjson2.reader.FieldReader[] r7 = r0.createFieldReaders(r1, r2, r3, r4, r5)
            return r7
    }

    public <T> com.alibaba.fastjson2.reader.FieldReader[] createFieldReaders(java.lang.Class<T> r14, java.lang.reflect.Type r15, com.alibaba.fastjson2.codec.BeanInfo r16, boolean r17, com.alibaba.fastjson2.reader.ObjectReaderProvider r18) {
            r13 = this;
            r7 = r18
            if (r16 != 0) goto Le
            com.alibaba.fastjson2.codec.BeanInfo r0 = new com.alibaba.fastjson2.codec.BeanInfo
            r0.<init>()
            r7.getBeanInfo(r0, r14)
            r6 = r0
            goto L10
        Le:
            r6 = r16
        L10:
            java.lang.String r4 = r6.namingStrategy
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            com.alibaba.fastjson2.codec.FieldInfo r5 = new com.alibaba.fastjson2.codec.FieldInfo
            r5.<init>()
            java.lang.String[] r10 = r6.orders
            com.alibaba.fastjson2.reader.ObjectReaderCreator$FieldConsumer r0 = new com.alibaba.fastjson2.reader.ObjectReaderCreator$FieldConsumer
            r1 = r8
            r8 = r6
            r6 = r1
            r1 = r13
            r2 = r14
            r3 = r15
            r9 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r12 = r8
            r8 = r6
            r6 = r12
            if (r17 == 0) goto L34
            com.alibaba.fastjson2.util.BeanUtils.declaredFields(r14, r0)
            goto L57
        L34:
            com.alibaba.fastjson2.util.BeanUtils.declaredFields(r14, r0)
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r7.mixInCache
            java.lang.Object r0 = r0.get(r14)
            r11 = r0
            java.lang.Class r11 = (java.lang.Class) r11
            com.alibaba.fastjson2.reader.ObjectReaderCreator$CreateFieldReaderConsumer r0 = new com.alibaba.fastjson2.reader.ObjectReaderCreator$CreateFieldReaderConsumer
            r1 = r13
            r2 = r14
            r3 = r15
            r9 = r7
            r7 = r5
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            com.alibaba.fastjson2.util.BeanUtils.setters(r14, r6, r11, r0)
            boolean r15 = r14.isInterface()
            if (r15 == 0) goto L57
            com.alibaba.fastjson2.util.BeanUtils.getters(r14, r0)
        L57:
            int r14 = r8.size()
            com.alibaba.fastjson2.reader.FieldReader[] r14 = new com.alibaba.fastjson2.reader.FieldReader[r14]
            java.util.Collection r15 = r8.values()
            r15.toArray(r14)
            java.util.Arrays.sort(r14)
            return r14
    }

    public <T> java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> createFunction(java.lang.reflect.Constructor r9, java.lang.reflect.Constructor r10, java.lang.String... r11) {
            r8 = this;
            r0 = 1
            if (r10 != 0) goto L7
            r9.setAccessible(r0)
            goto La
        L7:
            r10.setAccessible(r0)
        La:
            com.alibaba.fastjson2.reader.ConstructorFunction r1 = new com.alibaba.fastjson2.reader.ConstructorFunction
            r4 = 0
            r5 = 0
            r2 = 0
            r3 = r9
            r6 = r10
            r7 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    public <T> java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> createFunction(java.lang.reflect.Constructor r9, java.lang.String... r10) {
            r8 = this;
            r0 = 1
            r9.setAccessible(r0)
            com.alibaba.fastjson2.reader.ConstructorFunction r1 = new com.alibaba.fastjson2.reader.ConstructorFunction
            r5 = 0
            r6 = 0
            r2 = 0
            r4 = 0
            r3 = r9
            r7 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r1
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReader(java.lang.Class<T> r3) {
            r2 = this;
            r0 = 0
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.createObjectReader(r3, r3, r0, r1)
            return r3
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReader(java.lang.Class<T> r10, long r11, java.util.function.Supplier<T> r13, java.util.function.Function r14, com.alibaba.fastjson2.reader.FieldReader... r15) {
            r9 = this;
            r2 = 0
            r3 = 0
            r0 = r9
            r1 = r10
            r4 = r11
            r6 = r13
            r7 = r14
            r8 = r15
            com.alibaba.fastjson2.reader.ObjectReader r10 = r0.createObjectReader(r1, r2, r3, r4, r6, r7, r8)
            return r10
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReader(java.lang.Class<T> r10, java.lang.String r11, long r12, java.util.function.Supplier<T> r14, java.util.function.Function r15, com.alibaba.fastjson2.reader.FieldReader... r16) {
            r9 = this;
            r3 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r4 = r12
            r6 = r14
            r7 = r15
            r8 = r16
            com.alibaba.fastjson2.reader.ObjectReader r10 = r0.createObjectReader(r1, r2, r3, r4, r6, r7, r8)
            return r10
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReader(java.lang.Class<T> r16, java.lang.String r17, java.lang.String r18, long r19, java.util.function.Supplier<T> r21, java.util.function.Function r22, com.alibaba.fastjson2.reader.FieldReader... r23) {
            r15 = this;
            if (r16 == 0) goto L25
            int r0 = r16.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r1 != 0) goto L12
            boolean r0 = java.lang.reflect.Modifier.isInterface(r0)
            if (r0 == 0) goto L25
        L12:
            com.alibaba.fastjson2.reader.ObjectReaderAdapter r1 = new com.alibaba.fastjson2.reader.ObjectReaderAdapter
            r4 = 0
            r2 = r16
            r3 = r17
            r5 = r19
            r7 = r21
            r8 = r22
            r9 = r23
            r1.<init>(r2, r3, r4, r5, r7, r8, r9)
            return r1
        L25:
            if (r18 == 0) goto L3f
            com.alibaba.fastjson2.reader.ObjectReaderRootName r2 = new com.alibaba.fastjson2.reader.ObjectReaderRootName
            r12 = 0
            r13 = 0
            r5 = 0
            r11 = 0
            r3 = r16
            r4 = r17
            r6 = r18
            r7 = r19
            r9 = r21
            r10 = r22
            r14 = r23
            r2.<init>(r3, r4, r5, r6, r7, r9, r10, r11, r12, r13, r14)
            return r2
        L3f:
            r10 = r23
            int r0 = r10.length
            switch(r0) {
                case 1: goto Lb0;
                case 2: goto L9e;
                case 3: goto L8c;
                case 4: goto L7a;
                case 5: goto L68;
                case 6: goto L56;
                default: goto L45;
            }
        L45:
            com.alibaba.fastjson2.reader.ObjectReaderAdapter r2 = new com.alibaba.fastjson2.reader.ObjectReaderAdapter
            r5 = 0
            r3 = r16
            r4 = r17
            r6 = r19
            r8 = r21
            r9 = r22
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)
            return r2
        L56:
            com.alibaba.fastjson2.reader.ObjectReader6 r2 = new com.alibaba.fastjson2.reader.ObjectReader6
            r4 = 0
            r5 = 0
            r3 = r16
            r6 = r19
            r8 = r21
            r9 = r22
            r10 = r23
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)
            return r2
        L68:
            com.alibaba.fastjson2.reader.ObjectReader5 r2 = new com.alibaba.fastjson2.reader.ObjectReader5
            r4 = 0
            r5 = 0
            r3 = r16
            r6 = r19
            r8 = r21
            r9 = r22
            r10 = r23
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)
            return r2
        L7a:
            com.alibaba.fastjson2.reader.ObjectReader4 r2 = new com.alibaba.fastjson2.reader.ObjectReader4
            r4 = 0
            r5 = 0
            r3 = r16
            r6 = r19
            r8 = r21
            r9 = r22
            r10 = r23
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)
            return r2
        L8c:
            com.alibaba.fastjson2.reader.ObjectReader3 r2 = new com.alibaba.fastjson2.reader.ObjectReader3
            r4 = 0
            r5 = 0
            r3 = r16
            r6 = r19
            r8 = r21
            r9 = r22
            r10 = r23
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)
            return r2
        L9e:
            com.alibaba.fastjson2.reader.ObjectReader2 r2 = new com.alibaba.fastjson2.reader.ObjectReader2
            r4 = 0
            r5 = 0
            r3 = r16
            r6 = r19
            r8 = r21
            r9 = r22
            r10 = r23
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)
            return r2
        Lb0:
            com.alibaba.fastjson2.reader.ObjectReader1 r2 = new com.alibaba.fastjson2.reader.ObjectReader1
            r4 = 0
            r5 = 0
            r3 = r16
            r6 = r19
            r8 = r21
            r9 = r22
            r10 = r23
            r2.<init>(r3, r4, r5, r6, r8, r9, r10)
            return r2
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReader(java.lang.Class<T> r25, java.lang.reflect.Type r26, boolean r27, com.alibaba.fastjson2.reader.ObjectReaderProvider r28) {
            r24 = this;
            r1 = r24
            r2 = r25
            r0 = r28
            com.alibaba.fastjson2.codec.BeanInfo r4 = new com.alibaba.fastjson2.codec.BeanInfo
            r4.<init>()
            if (r27 == 0) goto L16
            long r5 = r4.readerFeatures
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r7 = r3.mask
            long r5 = r5 | r7
            r4.readerFeatures = r5
        L16:
            r0.getBeanInfo(r4, r2)
            long r5 = r4.readerFeatures
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r7 = r3.mask
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r10 = 1
            if (r5 == 0) goto L29
            r5 = r10
            goto L2b
        L29:
            r5 = r27
        L2b:
            java.lang.Class r6 = r4.deserializer
            r11 = 0
            if (r6 == 0) goto L56
            java.lang.Class<com.alibaba.fastjson2.reader.ObjectReader> r9 = com.alibaba.fastjson2.reader.ObjectReader.class
            boolean r6 = r9.isAssignableFrom(r6)
            if (r6 == 0) goto L56
            java.lang.Class r0 = r4.deserializer     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L4e
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L4e
            r0.setAccessible(r10)     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L4e
            java.lang.Object r0 = r0.newInstance(r11)     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L4e
            com.alibaba.fastjson2.reader.ObjectReader r0 = (com.alibaba.fastjson2.reader.ObjectReader) r0     // Catch: java.lang.reflect.InvocationTargetException -> L48 java.lang.NoSuchMethodException -> L4a java.lang.IllegalAccessException -> L4c java.lang.InstantiationException -> L4e
            return r0
        L48:
            r0 = move-exception
            goto L4f
        L4a:
            r0 = move-exception
            goto L4f
        L4c:
            r0 = move-exception
            goto L4f
        L4e:
            r0 = move-exception
        L4f:
            java.lang.String r2 = "create deserializer error"
            ah.a.x(r2, r0)
            r0 = 0
            return r0
        L56:
            if (r5 == 0) goto L5f
            long r12 = r4.readerFeatures
            long r14 = r3.mask
            long r12 = r12 | r14
            r4.readerFeatures = r12
        L5f:
            java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
            boolean r3 = r3.isAssignableFrom(r2)
            if (r3 == 0) goto L79
            java.lang.reflect.Method r3 = r4.createMethod
            if (r3 == 0) goto L72
            java.lang.Class[] r3 = r3.getParameterTypes()
            int r3 = r3.length
            if (r3 != r10) goto L79
        L72:
            java.lang.reflect.Method r3 = r4.createMethod
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.createEnumReader(r2, r3, r0)
            return r0
        L79:
            java.lang.Class<java.lang.Throwable> r9 = java.lang.Throwable.class
            boolean r3 = r9.isAssignableFrom(r2)
            if (r3 == 0) goto L8b
            long r5 = r4.readerFeatures
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreSetNullValue
            long r13 = r3.mask
            long r5 = r5 | r13
            r4.readerFeatures = r5
            r5 = 0
        L8b:
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            if (r2 != r3) goto L92
            com.alibaba.fastjson2.reader.ObjectReaderImplClass r0 = com.alibaba.fastjson2.reader.ObjectReaderImplClass.INSTANCE
            return r0
        L92:
            if (r5 == 0) goto L9b
            boolean r3 = r2.isInterface()
            if (r3 == 0) goto L9b
            r5 = 0
        L9b:
            r3 = r26
            r6 = r0
            com.alibaba.fastjson2.reader.FieldReader[] r13 = r1.createFieldReaders(r2, r3, r4, r5, r6)
            r14 = r1
            r15 = r4
            r16 = r5
            r0 = r6
            r6 = r3
            r1 = 0
        La9:
            int r3 = r13.length
            if (r1 >= r3) goto Lba
            r3 = r13[r1]
            boolean r3 = r3.isReadOnly()
            if (r3 != 0) goto Lb7
            r17 = 0
            goto Lbc
        Lb7:
            int r1 = r1 + 1
            goto La9
        Lba:
            r17 = r10
        Lbc:
            java.lang.reflect.Constructor r1 = r15.creatorConstructor
            if (r1 != 0) goto Lc4
            java.lang.reflect.Method r1 = r15.createMethod
            if (r1 == 0) goto Lc8
        Lc4:
            r3 = r6
            r1 = r14
            goto L302
        Lc8:
            java.lang.Class r1 = r15.builder
            if (r1 == 0) goto Ld1
            com.alibaba.fastjson2.reader.ObjectReader r0 = r14.createObjectReaderWithBuilder(r2, r6, r0, r15)
            return r0
        Ld1:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            be.m0 r3 = new be.m0
            r4 = 2
            r3.<init>(r4, r1)
            com.alibaba.fastjson2.util.BeanUtils.constructor(r2, r3)
            boolean r3 = r9.isAssignableFrom(r2)
            if (r3 == 0) goto Leb
            com.alibaba.fastjson2.reader.ObjectReaderException r0 = new com.alibaba.fastjson2.reader.ObjectReaderException
            r0.<init>(r2, r1, r13)
            return r0
        Leb:
            java.lang.Class r3 = r2.getDeclaringClass()
            r4 = -1
            r19 = r4
            r21 = r7
            r18 = r11
            r20 = r18
            r5 = 0
        Lf9:
            int r7 = r1.size()
            if (r5 >= r7) goto L138
            java.lang.Object r7 = r1.get(r5)
            java.lang.reflect.Constructor r7 = (java.lang.reflect.Constructor) r7
            java.lang.Class[] r8 = r7.getParameterTypes()
            int r8 = r8.length
            if (r8 != 0) goto L10e
            r20 = r7
        L10e:
            if (r3 == 0) goto L122
            if (r8 != r10) goto L122
            java.lang.Class[] r23 = r7.getParameterTypes()
            r27 = 0
            r12 = r23[r27]
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L124
            r3 = r7
            goto L13e
        L122:
            r27 = 0
        L124:
            if (r18 != 0) goto L127
            goto L131
        L127:
            if (r8 != 0) goto L12a
            goto L131
        L12a:
            java.lang.Class[] r12 = r18.getParameterTypes()
            int r12 = r12.length
            if (r12 >= r8) goto L135
        L131:
            r19 = r5
            r18 = r7
        L135:
            int r5 = r5 + 1
            goto Lf9
        L138:
            r27 = 0
            r3 = r18
            r5 = r19
        L13e:
            if (r3 == 0) goto L146
            java.lang.Class[] r7 = r3.getParameterTypes()
            int r7 = r7.length
            goto L147
        L146:
            r7 = r4
        L147:
            if (r5 == r4) goto L14c
            r1.remove(r5)
        L14c:
            if (r3 == 0) goto L29f
            if (r7 == 0) goto L29f
            java.lang.Class[] r4 = r15.seeAlso
            if (r4 != 0) goto L29f
            r3.setAccessible(r10)
            java.lang.String[] r4 = r15.createParameterNames
            if (r4 == 0) goto L163
            int r5 = r4.length
            if (r5 != 0) goto L15f
            goto L163
        L15f:
            r18 = r1
            r8 = r4
            goto L190
        L163:
            java.lang.String[] r8 = com.alibaba.fastjson2.util.BeanUtils.lookupParameterNames(r3)
            java.lang.Class[] r12 = r3.getParameterTypes()
            java.lang.annotation.Annotation[][] r5 = r3.getParameterAnnotations()
            r4 = r1
            com.alibaba.fastjson2.codec.FieldInfo r1 = new com.alibaba.fastjson2.codec.FieldInfo
            r1.<init>()
            r18 = r4
            r4 = r27
        L179:
            int r11 = r12.length
            if (r4 >= r11) goto L190
            int r11 = r8.length
            if (r4 >= r11) goto L190
            r1.init()
            r0.getFieldInfo(r1, r2, r3, r4, r5)
            java.lang.String r0 = r1.fieldName
            if (r0 == 0) goto L18b
            r8[r4] = r0
        L18b:
            int r4 = r4 + 1
            r0 = r28
            goto L179
        L190:
            if (r20 == 0) goto L1b7
            r0 = r27
            r1 = r0
        L195:
            int r4 = r8.length
            if (r0 >= r4) goto L1b9
            r4 = r8[r0]
            if (r4 != 0) goto L19d
            goto L1b4
        L19d:
            r5 = r27
        L19f:
            int r11 = r13.length
            if (r5 >= r11) goto L1b4
            r11 = r13[r5]
            if (r11 == 0) goto L1b1
            java.lang.String r11 = r11.fieldName
            boolean r11 = r4.equals(r11)
            if (r11 == 0) goto L1b1
            int r1 = r1 + 1
            goto L1b4
        L1b1:
            int r5 = r5 + 1
            goto L19f
        L1b4:
            int r0 = r0 + 1
            goto L195
        L1b7:
            r1 = r27
        L1b9:
            if (r16 != 0) goto L29f
            boolean r0 = r9.isAssignableFrom(r2)
            if (r0 != 0) goto L29f
            if (r20 != 0) goto L29f
            int r0 = r8.length
            if (r1 == r0) goto L29f
            if (r7 != r10) goto L22f
            com.alibaba.fastjson2.codec.FieldInfo r1 = new com.alibaba.fastjson2.codec.FieldInfo
            r1.<init>()
            r4 = 0
            r5 = 0
            r0 = r28
            r0.getFieldInfo(r1, r2, r3, r4, r5)
            long r4 = r1.features
            r9 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r4 = r4 & r9
            int r0 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r0 == 0) goto L22f
            java.lang.reflect.Type[] r0 = r3.getGenericParameterTypes()
            r2 = r0[r27]
            java.lang.Class[] r0 = r3.getParameterTypes()
            r0 = r0[r27]
            java.lang.String r4 = r1.defaultValue
            if (r4 == 0) goto L205
            java.lang.Class r5 = r4.getClass()
            if (r5 == r0) goto L205
            com.alibaba.fastjson2.reader.ObjectReaderProvider r5 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            java.lang.Class r6 = r4.getClass()
            java.util.function.Function r5 = r5.getTypeConvert(r6, r2)
            if (r5 == 0) goto L20a
            java.lang.Object r4 = r5.apply(r4)
        L205:
            r18 = r3
            r7 = r4
            r3 = r0
            goto L21f
        L20a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "illegal defaultValue : "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r2 = ", class "
            java.lang.String r0 = r0.getName()
            ah.a.s(r1, r2, r0)
            r0 = 0
            return r0
        L21f:
            com.alibaba.fastjson2.reader.ObjectReaderImplValue r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplValue
            long r4 = r1.features
            java.lang.String r6 = r1.format
            r9 = 0
            r10 = 0
            r1 = r25
            r8 = r18
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        L22f:
            if (r17 == 0) goto L269
            int r0 = r13.length
            if (r0 == 0) goto L269
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L269
            r0 = r27
        L23c:
            int r1 = r8.length
            if (r0 >= r1) goto L269
            r1 = r8[r0]
            int r2 = r13.length
            r4 = r27
        L244:
            if (r4 >= r2) goto L266
            r5 = r13[r4]
            java.lang.reflect.Field r7 = r5.field
            if (r7 == 0) goto L263
            java.lang.String r7 = r7.getName()
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L263
            java.lang.String r7 = r5.fieldName
            boolean r7 = r7.equals(r1)
            if (r7 != 0) goto L263
            java.lang.String r1 = r5.fieldName
            r8[r0] = r1
            goto L266
        L263:
            int r4 = r4 + 1
            goto L244
        L266:
            int r0 = r0 + 1
            goto L23c
        L269:
            com.alibaba.fastjson2.reader.ConstructorFunction r16 = new com.alibaba.fastjson2.reader.ConstructorFunction
            r20 = 0
            r21 = 0
            r19 = 0
            r22 = r8
            r17 = r18
            r18 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r7 = r22
            java.lang.Class[] r6 = r3.getParameterTypes()
            r4 = r26
            r2 = r28
            r5 = r3
            r1 = r14
            r3 = r25
            com.alibaba.fastjson2.reader.FieldReader[] r8 = r1.createFieldReaders(r2, r3, r4, r5, r6, r7)
            com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor r0 = new com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor
            java.lang.String r2 = r15.typeKey
            java.lang.String r3 = r15.typeName
            long r4 = r15.readerFeatures
            r10 = 0
            r11 = 0
            r1 = r25
            r9 = r13
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return r0
        L29f:
            r9 = r13
            java.lang.Class[] r4 = r15.seeAlso
            if (r4 == 0) goto L2b7
            int r0 = r4.length
            if (r0 == 0) goto L2b7
            java.lang.String r3 = r15.typeKey
            java.lang.String[] r5 = r15.seeAlsoNames
            java.lang.Class r6 = r15.seeAlsoDefault
            r1 = r24
            r2 = r25
            r7 = r9
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.createObjectReaderSeeAlso(r2, r3, r4, r5, r6, r7)
            return r0
        L2b7:
            boolean r0 = r25.isInterface()
            if (r0 == 0) goto L2cc
            com.alibaba.fastjson2.reader.ObjectReaderInterface r0 = new com.alibaba.fastjson2.reader.ObjectReaderInterface
            r6 = 0
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r1 = r25
            r8 = r9
            r0.<init>(r1, r2, r3, r4, r6, r7, r8)
            return r0
        L2cc:
            java.util.function.Supplier r7 = r24.createSupplier(r25)
            java.lang.String r3 = r15.typeKey
            java.lang.String r4 = r15.rootName
            long r5 = r15.readerFeatures
            r8 = 0
            r1 = r24
            r2 = r25
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.createObjectReader(r2, r3, r4, r5, r7, r8, r9)
            boolean r2 = r0 instanceof com.alibaba.fastjson2.reader.ObjectReaderBean
            if (r2 == 0) goto L301
            java.lang.Class<? extends com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler> r2 = r15.autoTypeBeforeHandler
            if (r2 == 0) goto L2f7
            r3 = 0
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.Exception -> L2f8
            r2.setAccessible(r10)     // Catch: java.lang.Exception -> L2f8
            java.lang.Object r2 = r2.newInstance(r3)     // Catch: java.lang.Exception -> L2f8
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r2 = (com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler) r2     // Catch: java.lang.Exception -> L2f8
            r11 = r2
            goto L2f9
        L2f7:
            r3 = 0
        L2f8:
            r11 = r3
        L2f9:
            if (r11 == 0) goto L301
            r2 = r0
            com.alibaba.fastjson2.reader.ObjectReaderBean r2 = (com.alibaba.fastjson2.reader.ObjectReaderBean) r2
            r2.setAutoTypeBeforeHandler(r11)
        L301:
            return r0
        L302:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r1.createObjectReaderWithCreator(r2, r3, r0, r15)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReader(java.lang.Class<T> r9, java.util.function.Supplier<T> r10, com.alibaba.fastjson2.reader.FieldReader... r11) {
            r8 = this;
            r3 = 0
            r6 = 0
            r2 = 0
            r0 = r8
            r1 = r9
            r5 = r10
            r7 = r11
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.createObjectReader(r1, r2, r3, r5, r6, r7)
            return r9
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReader(java.lang.Class<T> r2, boolean r3) {
            r1 = this;
            com.alibaba.fastjson2.reader.ObjectReaderProvider r0 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.createObjectReader(r2, r2, r3, r0)
            return r2
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReader(java.lang.Class<T> r9, com.alibaba.fastjson2.reader.FieldReader... r10) {
            r8 = this;
            java.util.function.Supplier r5 = r8.createSupplier(r9)
            r6 = 0
            r2 = 0
            r3 = 0
            r0 = r8
            r1 = r9
            r7 = r10
            com.alibaba.fastjson2.reader.ObjectReader r9 = r0.createObjectReader(r1, r2, r3, r5, r6, r7)
            return r9
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReader(java.lang.reflect.Type r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Class
            if (r0 == 0) goto Lb
            java.lang.Class r3 = (java.lang.Class) r3
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.createObjectReader(r3)
            return r3
        Lb:
            java.lang.Class r0 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r3)
            com.alibaba.fastjson2.reader.FieldReader[] r3 = r2.createFieldReaders(r0, r3)
            java.util.function.Supplier r1 = r2.createSupplier(r0)
            com.alibaba.fastjson2.reader.ObjectReader r3 = r2.createObjectReader(r0, r1, r3)
            return r3
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReaderFactoryMethod(java.lang.reflect.Method r15, java.lang.String... r16) {
            r14 = this;
            java.util.function.Function r6 = r14.createFactoryFunction(r15, r16)
            com.alibaba.fastjson2.reader.ObjectReaderProvider r8 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            r10 = 0
            java.lang.Class[] r12 = r15.getParameterTypes()
            r9 = 0
            r7 = r14
            r11 = r15
            r13 = r16
            com.alibaba.fastjson2.reader.FieldReader[] r8 = r7.createFieldReaders(r8, r9, r10, r11, r12, r13)
            com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor r0 = new com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor
            r11 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = r16
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReaderNoneDefaultConstructor(java.lang.Class r13, java.util.function.Function<java.util.Map<java.lang.Long, java.lang.Object>, T> r14, com.alibaba.fastjson2.reader.FieldReader... r15) {
            r12 = this;
            com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor r0 = new com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor
            r10 = 0
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r7 = 0
            r9 = 0
            r1 = r13
            r6 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReaderNoneDefaultConstructor(java.lang.reflect.Constructor r9, java.lang.String... r10) {
            r8 = this;
            java.util.function.Function r0 = r8.createFunction(r9, r10)
            java.lang.Class r3 = r9.getDeclaringClass()
            com.alibaba.fastjson2.reader.ObjectReaderProvider r2 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            java.lang.Class[] r6 = r9.getParameterTypes()
            r4 = r3
            r1 = r8
            r5 = r9
            r7 = r10
            com.alibaba.fastjson2.reader.FieldReader[] r9 = r1.createFieldReaders(r2, r3, r4, r5, r6, r7)
            com.alibaba.fastjson2.reader.ObjectReader r9 = r8.createObjectReaderNoneDefaultConstructor(r3, r0, r9)
            return r9
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReaderSeeAlso(java.lang.Class<T> r9, java.lang.String r10, java.lang.Class[] r11, java.lang.String[] r12, java.lang.Class r13, com.alibaba.fastjson2.reader.FieldReader... r14) {
            r8 = this;
            java.util.function.Supplier r2 = r8.createSupplier(r9)
            com.alibaba.fastjson2.reader.ObjectReaderSeeAlso r0 = new com.alibaba.fastjson2.reader.ObjectReaderSeeAlso
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReaderSeeAlso(java.lang.Class<T> r9, java.lang.String r10, java.lang.Class[] r11, java.lang.String[] r12, com.alibaba.fastjson2.reader.FieldReader... r13) {
            r8 = this;
            java.util.function.Supplier r2 = r8.createSupplier(r9)
            com.alibaba.fastjson2.reader.ObjectReaderSeeAlso r0 = new com.alibaba.fastjson2.reader.ObjectReaderSeeAlso
            r6 = 0
            r1 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReaderSeeAlso(java.lang.Class<T> r9, java.util.function.Supplier<T> r10, java.lang.String r11, java.lang.Class[] r12, java.lang.String[] r13, com.alibaba.fastjson2.reader.FieldReader... r14) {
            r8 = this;
            com.alibaba.fastjson2.reader.ObjectReaderSeeAlso r0 = new com.alibaba.fastjson2.reader.ObjectReaderSeeAlso
            r6 = 0
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReaderSeeAlso(java.lang.Class<T> r9, java.lang.Class[] r10, com.alibaba.fastjson2.reader.FieldReader... r11) {
            r8 = this;
            java.util.function.Supplier r2 = r8.createSupplier(r9)
            com.alibaba.fastjson2.reader.ObjectReaderSeeAlso r0 = new com.alibaba.fastjson2.reader.ObjectReaderSeeAlso
            r5 = 0
            r6 = 0
            java.lang.String r3 = "@type"
            r1 = r9
            r4 = r10
            r7 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReaderWithBuilder(java.lang.Class<T> r13, java.lang.reflect.Type r14, com.alibaba.fastjson2.reader.ObjectReaderProvider r15, com.alibaba.fastjson2.codec.BeanInfo r16) {
            r12 = this;
            r7 = r16
            java.lang.reflect.Method r0 = r7.buildMethod
            if (r0 == 0) goto Lc
            java.util.function.Function r0 = r12.createBuildFunction(r0)
        La:
            r11 = r0
            goto Le
        Lc:
            r0 = 0
            goto La
        Le:
            java.lang.Class r2 = r7.builder
            java.lang.String r0 = r7.builderWithPrefix
            if (r0 == 0) goto L1d
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
            goto L1d
        L1b:
            r5 = r0
            goto L20
        L1d:
            java.lang.String r0 = "with"
            goto L1b
        L20:
            int r8 = r5.length()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            r6 = r2
            com.alibaba.fastjson2.codec.FieldInfo r2 = new com.alibaba.fastjson2.codec.FieldInfo
            r2.<init>()
            com.alibaba.fastjson2.reader.c r0 = new com.alibaba.fastjson2.reader.c
            r1 = r12
            r4 = r13
            r10 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r13 = 0
            com.alibaba.fastjson2.util.BeanUtils.setters(r6, r13, r0)
            int r13 = r9.size()
            com.alibaba.fastjson2.reader.FieldReader[] r7 = new com.alibaba.fastjson2.reader.FieldReader[r13]
            java.util.Collection r13 = r9.values()
            r13.toArray(r7)
            java.util.Arrays.sort(r7)
            java.util.function.Supplier r5 = r12.createSupplier(r6)
            r3 = 0
            r2 = r6
            r6 = r11
            com.alibaba.fastjson2.reader.ObjectReader r13 = r1.createObjectReader(r2, r3, r5, r6, r7)
            return r13
    }

    public <T> com.alibaba.fastjson2.reader.ObjectReader<T> createObjectReaderWithCreator(java.lang.Class<T> r23, java.lang.reflect.Type r24, com.alibaba.fastjson2.reader.ObjectReaderProvider r25, com.alibaba.fastjson2.codec.BeanInfo r26) {
            r22 = this;
            r6 = r26
            com.alibaba.fastjson2.codec.FieldInfo r1 = new com.alibaba.fastjson2.codec.FieldInfo
            r1.<init>()
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            r13.<init>()
            java.lang.reflect.Constructor r0 = r6.creatorConstructor
            if (r0 == 0) goto L32
            java.lang.Class[] r0 = r0.getParameterTypes()
            java.lang.reflect.Constructor r2 = r6.creatorConstructor
            java.lang.Class r2 = r2.getDeclaringClass()
            java.lang.reflect.Constructor r3 = r6.creatorConstructor
            java.lang.String[] r3 = com.alibaba.fastjson2.util.BeanUtils.lookupParameterNames(r3)
            java.lang.reflect.Constructor r4 = r6.creatorConstructor
            java.lang.reflect.Type[] r4 = r4.getGenericParameterTypes()
            java.lang.reflect.Constructor r5 = r6.creatorConstructor
            java.lang.annotation.Annotation[][] r5 = r5.getParameterAnnotations()
        L2c:
            r14 = r0
            r11 = r2
            r15 = r3
            r16 = r4
            goto L4e
        L32:
            java.lang.reflect.Method r0 = r6.createMethod
            java.lang.Class[] r0 = r0.getParameterTypes()
            java.lang.reflect.Method r2 = r6.createMethod
            java.lang.Class r2 = r2.getDeclaringClass()
            int r3 = r0.length
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.reflect.Method r4 = r6.createMethod
            java.lang.reflect.Type[] r4 = r4.getGenericParameterTypes()
            java.lang.reflect.Method r5 = r6.createMethod
            java.lang.annotation.Annotation[][] r5 = r5.getParameterAnnotations()
            goto L2c
        L4e:
            r7 = 0
            r4 = r7
        L50:
            int r0 = r14.length
            r8 = 0
            r17 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            r10 = 1
            if (r4 >= r0) goto L156
            r1.init()
            java.lang.reflect.Constructor r3 = r6.creatorConstructor
            if (r3 == 0) goto L6d
            r2 = r23
            r0 = r25
            r0.getFieldInfo(r1, r2, r3, r4, r5)
            r12 = r2
            r2 = r1
            r1 = r12
            r12 = r4
            r19 = r5
            goto L7a
        L6d:
            r0 = r25
            r2 = r1
            r12 = r4
            r19 = r5
            r1 = r23
            java.lang.reflect.Method r3 = r6.createMethod
            r0.getFieldInfo(r2, r1, r3, r12)
        L7a:
            int r3 = r14.length
            if (r3 != r10) goto L8e
            long r3 = r2.features
            long r3 = r3 & r17
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 == 0) goto L8e
            r21 = r15
            r15 = r2
        L88:
            r11 = r22
            r20 = r7
            goto L15b
        L8e:
            java.lang.String r3 = r2.fieldName
            java.lang.String r8 = "arg"
            if (r3 == 0) goto L9a
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Laf
        L9a:
            java.lang.String[] r4 = r6.createParameterNames
            if (r4 == 0) goto La3
            int r5 = r4.length
            if (r12 >= r5) goto La3
            r3 = r4[r12]
        La3:
            if (r3 == 0) goto Lab
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto Laf
        Lab:
            java.lang.String r3 = eh.a.l(r12, r8)
        Laf:
            boolean r4 = r3.startsWith(r8, r7)
            if (r4 == 0) goto Lbc
            int r4 = r15.length
            if (r4 <= r12) goto Lba
            r3 = r15[r12]
        Lba:
            r5 = r3
            goto Lbf
        Lbc:
            r15[r12] = r3
            goto Lba
        Lbf:
            r9 = r14[r12]
            com.alibaba.fastjson2.reader.b r0 = new com.alibaba.fastjson2.reader.b
            r3 = r1
            r4 = r6
            r1 = r9
            r6 = r2
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1 = r3
            r3 = r0
            r0 = r2
            r2 = r6
            com.alibaba.fastjson2.util.BeanUtils.getters(r1, r3)
            if (r5 == 0) goto Lde
            boolean r3 = r5.isEmpty()
            if (r3 == 0) goto Ldc
            goto Lde
        Ldc:
            r3 = r5
            goto Le3
        Lde:
            java.lang.String r5 = eh.a.l(r12, r8)
            goto Ldc
        Le3:
            r8 = r16[r12]
            r4 = r12
            com.alibaba.fastjson2.reader.ObjectReader r12 = getInitReader(r0, r8, r9, r2)
            long r5 = r2.features
            r10 = r7
            java.lang.String r7 = r2.format
            r17 = r10
            r10 = r3
            r0 = r22
            r21 = r15
            r20 = r17
            r15 = r2
            r2 = r24
            com.alibaba.fastjson2.reader.FieldReader r5 = r0.createFieldReaderParam(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r13.put(r3, r5)
            java.lang.String[] r0 = r15.alternateNames
            if (r0 == 0) goto L145
            r1 = r20
        L108:
            int r2 = r0.length
            if (r1 >= r2) goto L145
            r2 = r0[r1]
            boolean r5 = r3.equals(r2)
            if (r5 == 0) goto L11b
        L113:
            r17 = r0
            r18 = r1
            r2 = r11
            r11 = r22
            goto L13f
        L11b:
            java.lang.Object r5 = r13.get(r2)
            com.alibaba.fastjson2.reader.FieldReader r5 = (com.alibaba.fastjson2.reader.FieldReader) r5
            if (r5 != 0) goto L113
            long r5 = r15.features
            java.lang.String r7 = r15.format
            r12 = 0
            r17 = r0
            r18 = r1
            r10 = r3
            r0 = r22
            r1 = r23
            r3 = r2
            r2 = r24
            com.alibaba.fastjson2.reader.FieldReader r5 = r0.createFieldReaderParam(r1, r2, r3, r4, r5, r7, r8, r9, r10, r11, r12)
            r2 = r11
            r11 = r0
            r0 = r3
            r3 = r10
            r13.put(r0, r5)
        L13f:
            int r1 = r18 + 1
            r11 = r2
            r0 = r17
            goto L108
        L145:
            r2 = r11
            r11 = r22
            int r4 = r4 + 1
            r6 = r26
            r11 = r2
            r1 = r15
            r5 = r19
            r7 = r20
            r15 = r21
            goto L50
        L156:
            r21 = r15
            r15 = r1
            goto L88
        L15b:
            int r0 = r14.length
            if (r0 != r10) goto L1d3
            long r0 = r15.features
            long r0 = r0 & r17
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 == 0) goto L1d3
            r6 = r26
            java.lang.reflect.Constructor r0 = r6.creatorConstructor
            if (r0 != 0) goto L176
            java.lang.reflect.Method r0 = r6.createMethod
            java.lang.reflect.Type[] r0 = r0.getGenericParameterTypes()
            r0 = r0[r20]
        L174:
            r2 = r0
            goto L179
        L176:
            r0 = r16[r20]
            goto L174
        L179:
            java.lang.reflect.Constructor r0 = r6.creatorConstructor
            if (r0 != 0) goto L187
            java.lang.reflect.Method r0 = r6.createMethod
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0 = r0[r20]
        L185:
            r3 = r0
            goto L18e
        L187:
            java.lang.Class[] r0 = r0.getParameterTypes()
            r0 = r0[r20]
            goto L185
        L18e:
            java.lang.String r0 = r15.defaultValue
            if (r0 == 0) goto L1aa
            java.lang.Class r1 = r0.getClass()
            if (r1 == r3) goto L1aa
            com.alibaba.fastjson2.reader.ObjectReaderProvider r1 = com.alibaba.fastjson2.JSONFactory.getDefaultObjectReaderProvider()
            java.lang.Class r4 = r0.getClass()
            java.util.function.Function r1 = r1.getTypeConvert(r4, r2)
            if (r1 == 0) goto L1ac
            java.lang.Object r0 = r1.apply(r0)
        L1aa:
            r7 = r0
            goto L1c1
        L1ac:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "illegal defaultValue : "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", class "
            java.lang.String r2 = r3.getName()
            ah.a.s(r1, r0, r2)
            r0 = 0
            return r0
        L1c1:
            com.alibaba.fastjson2.reader.ObjectReaderImplValue r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplValue
            long r4 = r15.features
            java.lang.String r1 = r15.format
            java.lang.reflect.Constructor r8 = r6.creatorConstructor
            java.lang.reflect.Method r9 = r6.createMethod
            r10 = 0
            r6 = r1
            r1 = r23
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10)
            return r0
        L1d3:
            r6 = r26
            java.lang.reflect.Constructor r0 = r6.creatorConstructor
            if (r0 == 0) goto L1e3
            java.lang.reflect.Constructor r1 = r6.markerConstructor
            r7 = r21
            java.util.function.Function r0 = r11.createFunction(r0, r1, r7)
        L1e1:
            r8 = r0
            goto L1ec
        L1e3:
            r7 = r21
            java.lang.reflect.Method r0 = r6.createMethod
            java.util.function.Function r0 = r11.createFactoryFunction(r0, r7)
            goto L1e1
        L1ec:
            int r0 = r13.size()
            com.alibaba.fastjson2.reader.FieldReader[] r9 = new com.alibaba.fastjson2.reader.FieldReader[r0]
            java.util.Collection r0 = r13.values()
            r0.toArray(r9)
            java.util.Arrays.sort(r9)
            r3 = 0
            r4 = 0
            r1 = r23
            r2 = r24
            r5 = r25
            r0 = r11
            com.alibaba.fastjson2.reader.FieldReader[] r2 = r0.createFieldReaders(r1, r2, r3, r4, r5)
            java.util.Arrays.sort(r2)
            r0 = 0
            r1 = r20
            r3 = r1
        L210:
            int r4 = r2.length
            if (r1 >= r4) goto L229
            r4 = r2[r1]
            java.lang.String r4 = r4.fieldName
            boolean r4 = r13.containsKey(r4)
            if (r4 == 0) goto L226
            if (r0 != 0) goto L222
            int r0 = r2.length
            boolean[] r0 = new boolean[r0]
        L222:
            r0[r1] = r10
            int r3 = r3 + 1
        L226:
            int r1 = r1 + 1
            goto L210
        L229:
            if (r3 <= 0) goto L244
            int r1 = r2.length
            int r1 = r1 - r3
            com.alibaba.fastjson2.reader.FieldReader[] r1 = new com.alibaba.fastjson2.reader.FieldReader[r1]
            r3 = r20
        L231:
            int r4 = r2.length
            if (r3 >= r4) goto L243
            boolean r4 = r0[r3]
            if (r4 != 0) goto L240
            int r4 = r20 + 1
            r5 = r2[r3]
            r1[r20] = r5
            r20 = r4
        L240:
            int r3 = r3 + 1
            goto L231
        L243:
            r2 = r1
        L244:
            com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor r0 = new com.alibaba.fastjson2.reader.ObjectReaderNoneDefaultConstructor
            r1 = r8
            r8 = r9
            r9 = r2
            java.lang.String r2 = r6.typeKey
            java.lang.String r3 = r6.typeName
            long r4 = r6.readerFeatures
            java.lang.Class[] r10 = r6.seeAlso
            java.lang.String[] r11 = r6.seeAlsoNames
            r6 = r1
            r1 = r23
            r0.<init>(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11)
            return r0
    }

    public <T> java.util.function.Supplier<T> createSupplier(java.lang.Class<T> r4) {
            r3 = this;
            boolean r0 = r4.isInterface()
            r1 = 0
            if (r0 != 0) goto L30
            int r0 = r4.getModifiers()
            boolean r0 = java.lang.reflect.Modifier.isAbstract(r0)
            if (r0 == 0) goto L12
            goto L30
        L12:
            java.lang.reflect.Constructor r0 = r4.getDeclaredConstructor(r1)     // Catch: java.lang.Throwable -> L20 java.lang.NoSuchMethodException -> L30
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L20 java.lang.NoSuchMethodException -> L30
            com.alibaba.fastjson2.reader.ConstructorSupplier r4 = new com.alibaba.fastjson2.reader.ConstructorSupplier
            r4.<init>(r0)
            return r4
        L20:
            r0 = move-exception
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = "get constructor error, class "
            java.lang.String r4 = r1.concat(r4)
            ah.a.x(r4, r0)
            r4 = 0
            return r4
        L30:
            return r1
    }
}
