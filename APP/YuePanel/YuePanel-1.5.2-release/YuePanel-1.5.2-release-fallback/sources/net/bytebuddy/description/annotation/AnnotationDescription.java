package net.bytebuddy.description.annotation;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationDescription {

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final net.bytebuddy.description.annotation.AnnotationDescription.Loadable<?> UNDEFINED = null;

    /* JADX INFO: renamed from: net.bytebuddy.description.annotation.AnnotationDescription$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract class AbstractBase implements net.bytebuddy.description.annotation.AnnotationDescription {
        private static final java.util.Set<java.lang.annotation.ElementType> DEFAULT_TARGET = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape RETENTION_VALUE = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape TARGET_VALUE = null;
        private transient /* synthetic */ int hashCode;

        static {
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase.DEFAULT_TARGET = r0
                java.lang.annotation.ElementType[] r0 = java.lang.annotation.ElementType.values()
                int r1 = r0.length
                r2 = 0
            Ld:
                if (r2 >= r1) goto L25
                r3 = r0[r2]
                java.lang.String r4 = r3.name()
                java.lang.String r5 = "TYPE_PARAMETER"
                boolean r4 = r4.equals(r5)
                if (r4 != 0) goto L22
                java.util.Set<java.lang.annotation.ElementType> r4 = net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase.DEFAULT_TARGET
                r4.add(r3)
            L22:
                int r2 = r2 + 1
                goto Ld
            L25:
                java.lang.Class<java.lang.annotation.Retention> r0 = java.lang.annotation.Retention.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = "value"
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r2)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase.RETENTION_VALUE = r0
                java.lang.Class<java.lang.annotation.Target> r0 = java.lang.annotation.Target.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase.TARGET_VALUE = r0
                return
        }

        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r6) {
                r5 = this;
                r0 = 1
                if (r5 != r6) goto L4
                return r0
            L4:
                boolean r1 = r6 instanceof net.bytebuddy.description.annotation.AnnotationDescription
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.annotation.AnnotationDescription r6 = (net.bytebuddy.description.annotation.AnnotationDescription) r6
                net.bytebuddy.description.type.TypeDescription r1 = r5.getAnnotationType()
                net.bytebuddy.description.type.TypeDescription r3 = r6.getAnnotationType()
                boolean r3 = r3.equals(r1)
                if (r3 != 0) goto L1b
                return r2
            L1b:
                net.bytebuddy.description.method.MethodList r1 = r1.getDeclaredMethods()
                java.util.Iterator r1 = r1.iterator()
            L23:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L3e
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r3
                net.bytebuddy.description.annotation.AnnotationValue r4 = r5.getValue(r3)
                net.bytebuddy.description.annotation.AnnotationValue r3 = r6.getValue(r3)
                boolean r3 = r4.equals(r3)
                if (r3 != 0) goto L23
                return r2
            L3e:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public java.util.Set<java.lang.annotation.ElementType> getElementTypes() {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r3.getAnnotationType()
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                java.lang.Class<java.lang.annotation.Target> r1 = java.lang.annotation.Target.class
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r0 = r0.ofType(r1)
                if (r0 != 0) goto L17
                java.util.Set<java.lang.annotation.ElementType> r0 = net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase.DEFAULT_TARGET
                java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
                goto L35
            L17:
                java.util.HashSet r1 = new java.util.HashSet
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase.TARGET_VALUE
                net.bytebuddy.description.annotation.AnnotationValue r0 = r0.getValue(r2)
                java.lang.ClassLoader r2 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r0 = r0.load(r2)
                java.lang.Class<java.lang.annotation.ElementType[]> r2 = java.lang.annotation.ElementType[].class
                java.lang.Object r0 = r0.resolve(r2)
                java.lang.Object[] r0 = (java.lang.Object[]) r0
                java.util.List r0 = java.util.Arrays.asList(r0)
                r1.<init>(r0)
                r0 = r1
            L35:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public java.lang.annotation.RetentionPolicy getRetention() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r2.getAnnotationType()
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                java.lang.Class<java.lang.annotation.Retention> r1 = java.lang.annotation.Retention.class
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r0 = r0.ofType(r1)
                if (r0 != 0) goto L13
                java.lang.annotation.RetentionPolicy r0 = java.lang.annotation.RetentionPolicy.CLASS
                goto L27
            L13:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase.RETENTION_VALUE
                net.bytebuddy.description.annotation.AnnotationValue r0 = r0.getValue(r1)
                java.lang.ClassLoader r1 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r0 = r0.load(r1)
                java.lang.Class<java.lang.annotation.RetentionPolicy> r1 = java.lang.annotation.RetentionPolicy.class
                java.lang.Object r0 = r0.resolve(r1)
                java.lang.annotation.RetentionPolicy r0 = (java.lang.annotation.RetentionPolicy) r0
            L27:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getValue(java.lang.String r4) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r3.getAnnotationType()
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r4)
                r2 = 0
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r2)
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isPublic()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isStatic()
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.not(r2)
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                int r1 = r0.size()
                r2 = 1
                if (r1 != r2) goto L41
                java.lang.Object r4 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r4
                net.bytebuddy.description.annotation.AnnotationValue r4 = r3.getValue(r4)
                return r4
            L41:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unknown property of "
                r1.append(r2)
                net.bytebuddy.description.type.TypeDescription r2 = r3.getAnnotationType()
                r1.append(r2)
                java.lang.String r2 = ": "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r3 = this;
                int r0 = r3.hashCode
                r1 = 0
                if (r0 == 0) goto L6
                goto L2a
            L6:
                net.bytebuddy.description.type.TypeDescription r0 = r3.getAnnotationType()
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.util.Iterator r0 = r0.iterator()
            L12:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2a
                java.lang.Object r2 = r0.next()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                net.bytebuddy.description.annotation.AnnotationValue r2 = r3.getValue(r2)
                int r2 = r2.hashCode()
                int r2 = r2 * 31
                int r1 = r1 + r2
                goto L12
            L2a:
                if (r1 != 0) goto L2f
                int r1 = r3.hashCode
                goto L31
            L2f:
                r3.hashCode = r1
            L31:
                return r1
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public boolean isDocumented() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r2.getAnnotationType()
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                java.lang.Class<java.lang.annotation.Documented> r1 = java.lang.annotation.Documented.class
                boolean r0 = r0.isAnnotationPresent(r1)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public boolean isInherited() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r2.getAnnotationType()
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                java.lang.Class<java.lang.annotation.Inherited> r1 = java.lang.annotation.Inherited.class
                boolean r0 = r0.isAnnotationPresent(r1)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public boolean isSupportedOn(java.lang.String r7) {
                r6 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r6.getAnnotationType()
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                java.lang.Class<java.lang.annotation.Target> r1 = java.lang.annotation.Target.class
                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r0 = r0.ofType(r1)
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L38
                java.lang.String r0 = "TYPE_USE"
                boolean r0 = r7.equals(r0)
                if (r0 == 0) goto L1b
                return r2
            L1b:
                java.util.Set<java.lang.annotation.ElementType> r0 = net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase.DEFAULT_TARGET
                java.util.Iterator r0 = r0.iterator()
            L21:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L5a
                java.lang.Object r3 = r0.next()
                java.lang.annotation.ElementType r3 = (java.lang.annotation.ElementType) r3
                java.lang.String r3 = r3.name()
                boolean r3 = r3.equals(r7)
                if (r3 == 0) goto L21
                return r2
            L38:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase.TARGET_VALUE
                net.bytebuddy.description.annotation.AnnotationValue r0 = r0.getValue(r3)
                java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription[]> r3 = net.bytebuddy.description.enumeration.EnumerationDescription[].class
                java.lang.Object r0 = r0.resolve(r3)
                net.bytebuddy.description.enumeration.EnumerationDescription[] r0 = (net.bytebuddy.description.enumeration.EnumerationDescription[]) r0
                int r3 = r0.length
                r4 = r1
            L48:
                if (r4 >= r3) goto L5a
                r5 = r0[r4]
                java.lang.String r5 = r5.getValue()
                boolean r5 = r5.equals(r7)
                if (r5 == 0) goto L57
                return r2
            L57:
                int r4 = r4 + 1
                goto L48
            L5a:
                return r1
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public boolean isSupportedOn(java.lang.annotation.ElementType r1) {
                r0 = this;
                java.lang.String r1 = r1.name()
                boolean r1 = r0.isSupportedOn(r1)
                return r1
        }

        public java.lang.String toString() {
                r8 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r8.getAnnotationType()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r2 = 64
                r1.append(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher r2 = net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.CURRENT
                r2.appendType(r1, r0)
                r2 = 40
                r1.append(r2)
                net.bytebuddy.description.method.MethodList r2 = r0.getDeclaredMethods()
                java.util.Iterator r2 = r2.iterator()
                r3 = 1
            L21:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L58
                java.lang.Object r4 = r2.next()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r4
                net.bytebuddy.description.annotation.AnnotationValue r5 = r8.getValue(r4)
                net.bytebuddy.description.annotation.AnnotationValue$State r6 = r5.getState()
                net.bytebuddy.description.annotation.AnnotationValue$State r7 = net.bytebuddy.description.annotation.AnnotationValue.State.UNDEFINED
                if (r6 != r7) goto L3a
                goto L21
            L3a:
                if (r3 == 0) goto L3e
                r3 = 0
                goto L43
            L3e:
                java.lang.String r6 = ", "
                r1.append(r6)
            L43:
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher r6 = net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.CURRENT
                java.lang.String r4 = r4.getName()
                net.bytebuddy.description.method.MethodList r7 = r0.getDeclaredMethods()
                int r7 = r7.size()
                r6.appendPrefix(r1, r4, r7)
                r1.append(r5)
                goto L21
            L58:
                r0 = 41
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                return r0
        }
    }

    public static class AnnotationInvocationHandler<T extends java.lang.annotation.Annotation> implements java.lang.reflect.InvocationHandler {
        private static final java.lang.String ANNOTATION_TYPE = "annotationType";
        private static final java.lang.String EQUALS = "equals";
        private static final java.lang.String HASH_CODE = "hashCode";
        private static final java.lang.Object[] NO_ARGUMENT = null;
        private static final java.lang.String TO_STRING = "toString";
        private final java.lang.Class<? extends java.lang.annotation.Annotation> annotationType;
        private transient /* synthetic */ int hashCode;
        private final java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue.Loaded<?>> values;

        static {
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                net.bytebuddy.description.annotation.AnnotationDescription.AnnotationInvocationHandler.NO_ARGUMENT = r0
                return
        }

        public AnnotationInvocationHandler(java.lang.Class<T> r1, java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue.Loaded<?>> r2) {
                r0 = this;
                r0.<init>()
                r0.annotationType = r1
                r0.values = r2
                return
        }

        private boolean equalsRepresentation(java.lang.Object r6, java.lang.Object r7) {
                r5 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                java.lang.Class<? extends java.lang.annotation.Annotation> r6 = r5.annotationType
                boolean r6 = r6.isInstance(r7)
                r1 = 0
                if (r6 != 0) goto Le
                return r1
            Le:
                java.lang.Class r6 = r7.getClass()
                boolean r6 = java.lang.reflect.Proxy.isProxyClass(r6)
                if (r6 == 0) goto L25
                java.lang.reflect.InvocationHandler r6 = java.lang.reflect.Proxy.getInvocationHandler(r7)
                boolean r2 = r6 instanceof net.bytebuddy.description.annotation.AnnotationDescription.AnnotationInvocationHandler
                if (r2 == 0) goto L25
                boolean r6 = r6.equals(r5)
                return r6
            L25:
                java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r6 = r5.values     // Catch: java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L60
                java.util.Set r6 = r6.entrySet()     // Catch: java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L60
                java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L60
            L2f:
                boolean r2 = r6.hasNext()     // Catch: java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L60
                if (r2 == 0) goto L57
                java.lang.Object r2 = r6.next()     // Catch: java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L60
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.IllegalAccessException -> L54 java.lang.reflect.InvocationTargetException -> L60
                java.lang.Object r3 = r2.getValue()     // Catch: java.lang.IllegalAccessException -> L54 java.lang.RuntimeException -> L56 java.lang.reflect.InvocationTargetException -> L60
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r3 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r3     // Catch: java.lang.IllegalAccessException -> L54 java.lang.RuntimeException -> L56 java.lang.reflect.InvocationTargetException -> L60
                java.lang.Object r2 = r2.getKey()     // Catch: java.lang.IllegalAccessException -> L54 java.lang.RuntimeException -> L56 java.lang.reflect.InvocationTargetException -> L60
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.IllegalAccessException -> L54 java.lang.RuntimeException -> L56 java.lang.reflect.InvocationTargetException -> L60
                java.lang.Object[] r4 = net.bytebuddy.description.annotation.AnnotationDescription.AnnotationInvocationHandler.NO_ARGUMENT     // Catch: java.lang.IllegalAccessException -> L54 java.lang.RuntimeException -> L56 java.lang.reflect.InvocationTargetException -> L60
                java.lang.Object r2 = r2.invoke(r7, r4)     // Catch: java.lang.IllegalAccessException -> L54 java.lang.RuntimeException -> L56 java.lang.reflect.InvocationTargetException -> L60
                boolean r2 = r3.represents(r2)     // Catch: java.lang.IllegalAccessException -> L54 java.lang.RuntimeException -> L56 java.lang.reflect.InvocationTargetException -> L60
                if (r2 != 0) goto L2f
                return r1
            L54:
                r6 = move-exception
                goto L58
            L56:
                return r1
            L57:
                return r0
            L58:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "Could not access annotation property"
                r7.<init>(r0, r6)
                throw r7
            L60:
                return r1
        }

        private int hashCodeRepresentation() {
                r4 = this;
                java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r0 = r4.values
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            Lb:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L45
                java.lang.Object r2 = r0.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getValue()
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r3 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r3
                net.bytebuddy.description.annotation.AnnotationValue$State r3 = r3.getState()
                boolean r3 = r3.isDefined()
                if (r3 != 0) goto L28
                goto Lb
            L28:
                java.lang.Object r3 = r2.getKey()
                java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
                java.lang.String r3 = r3.getName()
                int r3 = r3.hashCode()
                int r3 = r3 * 127
                java.lang.Object r2 = r2.getValue()
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r2 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r2
                int r2 = r2.hashCode()
                r2 = r2 ^ r3
                int r1 = r1 + r2
                goto Lb
            L45:
                return r1
        }

        public static <S extends java.lang.annotation.Annotation> S of(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r8, java.lang.Class<S> r9, java.util.Map<java.lang.String, ? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r10) {
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                java.lang.reflect.Method[] r1 = r9.getDeclaredMethods()
                int r2 = r1.length
                r3 = 0
            Lb:
                if (r3 >= r2) goto L57
                r4 = r1[r3]
                java.lang.String r5 = r4.getName()
                java.lang.Object r5 = r10.get(r5)
                net.bytebuddy.description.annotation.AnnotationValue r5 = (net.bytebuddy.description.annotation.AnnotationValue) r5
                if (r5 != 0) goto L44
                java.lang.Object r5 = r4.getDefaultValue()
                if (r5 != 0) goto L34
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingValue r5 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingValue
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r6 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.Class r7 = r4.getDeclaringClass()
                r6.<init>(r7)
                java.lang.String r7 = r4.getName()
                r5.<init>(r6, r7)
                goto L3c
            L34:
                java.lang.Class r6 = r4.getReturnType()
                net.bytebuddy.description.annotation.AnnotationValue r5 = net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.asValue(r5, r6)
            L3c:
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r5 = r5.load(r8)
                r0.put(r4, r5)
                goto L54
            L44:
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r6 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r6.<init>(r4)
                net.bytebuddy.description.annotation.AnnotationValue r5 = r5.filter(r6)
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r5 = r5.load(r8)
                r0.put(r4, r5)
            L54:
                int r3 = r3 + 1
                goto Lb
            L57:
                java.lang.Class[] r10 = new java.lang.Class[]{r9}
                net.bytebuddy.description.annotation.AnnotationDescription$AnnotationInvocationHandler r1 = new net.bytebuddy.description.annotation.AnnotationDescription$AnnotationInvocationHandler
                r1.<init>(r9, r0)
                java.lang.Object r8 = java.lang.reflect.Proxy.newProxyInstance(r8, r10, r1)
                java.lang.annotation.Annotation r8 = (java.lang.annotation.Annotation) r8
                return r8
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r7) {
                r6 = this;
                r0 = 1
                if (r6 != r7) goto L4
                return r0
            L4:
                boolean r1 = r7 instanceof net.bytebuddy.description.annotation.AnnotationDescription.AnnotationInvocationHandler
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.annotation.AnnotationDescription$AnnotationInvocationHandler r7 = (net.bytebuddy.description.annotation.AnnotationDescription.AnnotationInvocationHandler) r7
                java.lang.Class<? extends java.lang.annotation.Annotation> r1 = r6.annotationType
                java.lang.Class<? extends java.lang.annotation.Annotation> r3 = r7.annotationType
                boolean r1 = r1.equals(r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r1 = r6.values
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L21:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L44
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getValue()
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r4 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r4
                java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r5 = r7.values
                java.lang.Object r3 = r3.getKey()
                java.lang.Object r3 = r5.get(r3)
                boolean r3 = r4.equals(r3)
                if (r3 != 0) goto L21
                return r2
            L44:
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r3 = this;
                int r0 = r3.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto L37
            L6:
                java.lang.Class<? extends java.lang.annotation.Annotation> r0 = r3.annotationType
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r1 = r3.values
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r1 = r3.values
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            L1f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L37
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                int r0 = r0 * 31
                java.lang.Object r2 = r2.getValue()
                int r2 = r2.hashCode()
                int r0 = r0 + r2
                goto L1f
            L37:
                if (r0 != 0) goto L3c
                int r0 = r3.hashCode
                goto L3e
            L3c:
                r3.hashCode = r0
            L3e:
                return r0
        }

        @Override // java.lang.reflect.InvocationHandler
        public java.lang.Object invoke(java.lang.Object r3, java.lang.reflect.Method r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r5) {
                r2 = this;
                java.lang.Class r0 = r4.getDeclaringClass()
                java.lang.Class<? extends java.lang.annotation.Annotation> r1 = r2.annotationType
                if (r0 == r1) goto L74
                java.lang.String r0 = r4.getName()
                java.lang.String r1 = "hashCode"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1d
                int r3 = r2.hashCodeRepresentation()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                return r3
            L1d:
                java.lang.String r0 = r4.getName()
                java.lang.String r1 = "equals"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L3d
                java.lang.Class[] r0 = r4.getParameterTypes()
                int r0 = r0.length
                r1 = 1
                if (r0 != r1) goto L3d
                r4 = 0
                r4 = r5[r4]
                boolean r3 = r2.equalsRepresentation(r3, r4)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                return r3
            L3d:
                java.lang.String r3 = r4.getName()
                java.lang.String r5 = "toString"
                boolean r3 = r3.equals(r5)
                if (r3 == 0) goto L4e
                java.lang.String r3 = r2.toStringRepresentation()
                return r3
            L4e:
                java.lang.String r3 = r4.getName()
                java.lang.String r5 = "annotationType"
                boolean r3 = r3.equals(r5)
                if (r3 == 0) goto L5d
                java.lang.Class<? extends java.lang.annotation.Annotation> r3 = r2.annotationType
                return r3
            L5d:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r0 = "Unexpected method: "
                r5.append(r0)
                r5.append(r4)
                java.lang.String r4 = r5.toString()
                r3.<init>(r4)
                throw r3
            L74:
                java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r3 = r2.values
                java.lang.Object r3 = r3.get(r4)
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r3 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r3
                java.lang.Object r3 = r3.resolve()
                return r3
        }

        public java.lang.String toStringRepresentation() {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 64
                r0.append(r1)
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher r1 = net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.CURRENT
                java.lang.Class<? extends java.lang.annotation.Annotation> r2 = r7.annotationType
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                r1.appendType(r0, r2)
                r1 = 40
                r0.append(r1)
                java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r1 = r7.values
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
                r2 = 1
            L25:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L72
                java.lang.Object r3 = r1.next()
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r4 = r3.getValue()
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r4 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r4
                net.bytebuddy.description.annotation.AnnotationValue$State r4 = r4.getState()
                boolean r4 = r4.isDefined()
                if (r4 != 0) goto L42
                goto L25
            L42:
                if (r2 == 0) goto L46
                r2 = 0
                goto L4b
            L46:
                java.lang.String r4 = ", "
                r0.append(r4)
            L4b:
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher r4 = net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.CURRENT
                java.lang.Object r5 = r3.getKey()
                java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5
                java.lang.String r5 = r5.getName()
                java.util.LinkedHashMap<java.lang.reflect.Method, net.bytebuddy.description.annotation.AnnotationValue$Loaded<?>> r6 = r7.values
                java.util.Set r6 = r6.entrySet()
                int r6 = r6.size()
                r4.appendPrefix(r0, r5, r6)
                java.lang.Object r3 = r3.getValue()
                net.bytebuddy.description.annotation.AnnotationValue$Loaded r3 = (net.bytebuddy.description.annotation.AnnotationValue.Loaded) r3
                java.lang.String r3 = r3.toString()
                r0.append(r3)
                goto L25
            L72:
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Builder {
        private final net.bytebuddy.description.type.TypeDescription annotationType;
        private final java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> annotationValues;

        public Builder(net.bytebuddy.description.type.TypeDescription r1, java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2) {
                r0 = this;
                r0.<init>()
                r0.annotationType = r1
                r0.annotationValues = r2
                return
        }

        public static net.bytebuddy.description.annotation.AnnotationDescription.Builder ofType(java.lang.Class<? extends java.lang.annotation.Annotation> r0) {
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r0 = ofType(r0)
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationDescription.Builder ofType(net.bytebuddy.description.type.TypeDescription r3) {
                boolean r0 = r3.isAnnotation()
                if (r0 == 0) goto L10
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r0 = new net.bytebuddy.description.annotation.AnnotationDescription$Builder
                java.util.Map r1 = java.util.Collections.emptyMap()
                r0.<init>(r3, r1)
                return r0
            L10:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not an annotation type: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public net.bytebuddy.description.annotation.AnnotationDescription build() {
                r5 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r5.annotationType
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.util.Iterator r0 = r0.iterator()
            La:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L74
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r5.annotationValues
                java.lang.String r3 = r1.getName()
                java.lang.Object r2 = r2.get(r3)
                net.bytebuddy.description.annotation.AnnotationValue r2 = (net.bytebuddy.description.annotation.AnnotationValue) r2
                if (r2 != 0) goto L46
                net.bytebuddy.description.annotation.AnnotationValue r3 = r1.getDefaultValue()
                if (r3 == 0) goto L2b
                goto L46
            L2b:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "No value or default value defined for "
                r2.append(r3)
                java.lang.String r1 = r1.getName()
                r2.append(r1)
                java.lang.String r1 = r2.toString()
                r0.<init>(r1)
                throw r0
            L46:
                if (r2 == 0) goto La
                net.bytebuddy.description.annotation.AnnotationValue r3 = r2.filter(r1)
                net.bytebuddy.description.annotation.AnnotationValue$State r3 = r3.getState()
                net.bytebuddy.description.annotation.AnnotationValue$State r4 = net.bytebuddy.description.annotation.AnnotationValue.State.RESOLVED
                if (r3 != r4) goto L55
                goto La
            L55:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Illegal annotation value for "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = ": "
                r3.append(r1)
                r3.append(r2)
                java.lang.String r1 = r3.toString()
                r0.<init>(r1)
                throw r0
            L74:
                net.bytebuddy.description.annotation.AnnotationDescription$Latent r0 = new net.bytebuddy.description.annotation.AnnotationDescription$Latent
                net.bytebuddy.description.type.TypeDescription r1 = r5.annotationType
                java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r5.annotationValues
                r0.<init>(r1, r2)
                return r0
        }

        public net.bytebuddy.description.annotation.AnnotationDescription build(boolean r3) {
                r2 = this;
                if (r3 == 0) goto L7
                net.bytebuddy.description.annotation.AnnotationDescription r3 = r2.build()
                goto L10
            L7:
                net.bytebuddy.description.annotation.AnnotationDescription$Latent r3 = new net.bytebuddy.description.annotation.AnnotationDescription$Latent
                net.bytebuddy.description.type.TypeDescription r0 = r2.annotationType
                java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r2.annotationValues
                r3.<init>(r0, r1)
            L10:
                return r3
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, byte r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, char r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, double r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, float r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, int r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, long r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, java.lang.Class<?> r2) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r2, java.lang.Enum<?> r3) {
                r1 = this;
                net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration r0 = new net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration
                r0.<init>(r3)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r2 = r1.define(r2, r0)
                return r2
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, java.lang.String r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r2, java.lang.annotation.Annotation r3) {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationDescription$ForLoadedAnnotation r0 = new net.bytebuddy.description.annotation.AnnotationDescription$ForLoadedAnnotation
                r0.<init>(r3)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r2 = r1.define(r2, r0)
                return r2
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r2, net.bytebuddy.description.annotation.AnnotationDescription r3) {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue$ForAnnotationDescription r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForAnnotationDescription
                r0.<init>(r3)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r2 = r1.define(r2, r0)
                return r2
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r4, net.bytebuddy.description.annotation.AnnotationValue<?, ?> r5) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r3.annotationType
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r4)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L4c
                java.util.HashMap r1 = new java.util.HashMap
                java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r3.annotationValues
                r1.<init>(r2)
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                java.lang.String r0 = r0.getName()
                java.lang.Object r5 = r1.put(r0, r5)
                if (r5 != 0) goto L35
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r4 = new net.bytebuddy.description.annotation.AnnotationDescription$Builder
                net.bytebuddy.description.type.TypeDescription r5 = r3.annotationType
                r4.<init>(r5, r1)
                return r4
            L35:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Property already defined: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            L4c:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                net.bytebuddy.description.type.TypeDescription r1 = r3.annotationType
                r0.append(r1)
                java.lang.String r1 = " does not define a property named "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, net.bytebuddy.description.enumeration.EnumerationDescription r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForEnumerationDescription.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForTypeDescription.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r2, net.bytebuddy.description.type.TypeDescription r3, java.lang.String r4) {
                r1 = this;
                net.bytebuddy.description.enumeration.EnumerationDescription$Latent r0 = new net.bytebuddy.description.enumeration.EnumerationDescription$Latent
                r0.<init>(r3, r4)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r2 = r1.define(r2, r0)
                return r2
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, short r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder define(java.lang.String r1, boolean r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public <T extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationDescription.Builder defineAnnotationArray(java.lang.String r2, java.lang.Class<T> r3, T... r4) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                r0.<init>(r4)
                r4 = 0
                net.bytebuddy.description.annotation.AnnotationDescription[] r4 = new net.bytebuddy.description.annotation.AnnotationDescription[r4]
                java.lang.Object[] r4 = r0.toArray(r4)
                net.bytebuddy.description.annotation.AnnotationDescription[] r4 = (net.bytebuddy.description.annotation.AnnotationDescription[]) r4
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r2 = r1.defineAnnotationArray(r2, r3, r4)
                return r2
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineAnnotationArray(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.annotation.AnnotationDescription... r3) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForDescriptionArray.of(r2, r3)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineArray(java.lang.String r1, byte... r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineArray(java.lang.String r1, char... r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineArray(java.lang.String r1, double... r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineArray(java.lang.String r1, float... r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineArray(java.lang.String r1, int... r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineArray(java.lang.String r1, long... r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineArray(java.lang.String r1, java.lang.String... r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineArray(java.lang.String r1, short... r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineArray(java.lang.String r1, boolean... r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public <T extends java.lang.Enum<?>> net.bytebuddy.description.annotation.AnnotationDescription.Builder defineEnumerationArray(java.lang.String r8, java.lang.Class<T> r9, T... r10) {
                r7 = this;
                int r0 = r10.length
                net.bytebuddy.description.enumeration.EnumerationDescription[] r0 = new net.bytebuddy.description.enumeration.EnumerationDescription[r0]
                int r1 = r10.length
                r2 = 0
                r3 = r2
            L6:
                if (r2 >= r1) goto L17
                r4 = r10[r2]
                int r5 = r3 + 1
                net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration r6 = new net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration
                r6.<init>(r4)
                r0[r3] = r6
                int r2 = r2 + 1
                r3 = r5
                goto L6
            L17:
                net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r9)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r8 = r7.defineEnumerationArray(r8, r9, r0)
                return r8
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineEnumerationArray(java.lang.String r5, net.bytebuddy.description.type.TypeDescription r6, java.lang.String... r7) {
                r4 = this;
                boolean r0 = r6.isEnum()
                if (r0 == 0) goto L1e
                int r0 = r7.length
                net.bytebuddy.description.enumeration.EnumerationDescription[] r0 = new net.bytebuddy.description.enumeration.EnumerationDescription[r0]
                r1 = 0
            La:
                int r2 = r7.length
                if (r1 >= r2) goto L19
                net.bytebuddy.description.enumeration.EnumerationDescription$Latent r2 = new net.bytebuddy.description.enumeration.EnumerationDescription$Latent
                r3 = r7[r1]
                r2.<init>(r6, r3)
                r0[r1] = r2
                int r1 = r1 + 1
                goto La
            L19:
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r5 = r4.defineEnumerationArray(r5, r6, r0)
                return r5
            L1e:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r0 = "Not an enumeration type: "
                r7.append(r0)
                r7.append(r6)
                java.lang.String r6 = r7.toString()
                r5.<init>(r6)
                throw r5
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineEnumerationArray(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.enumeration.EnumerationDescription... r3) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForDescriptionArray.of(r2, r3)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineTypeArray(java.lang.String r2, java.lang.Class<?>... r3) {
                r1 = this;
                net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                r0.<init>(r3)
                r3 = 0
                net.bytebuddy.description.type.TypeDescription[] r3 = new net.bytebuddy.description.type.TypeDescription[r3]
                java.lang.Object[] r3 = r0.toArray(r3)
                net.bytebuddy.description.type.TypeDescription[] r3 = (net.bytebuddy.description.type.TypeDescription[]) r3
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r2 = r1.defineTypeArray(r2, r3)
                return r2
        }

        public net.bytebuddy.description.annotation.AnnotationDescription.Builder defineTypeArray(java.lang.String r1, net.bytebuddy.description.type.TypeDescription... r2) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationValue r2 = net.bytebuddy.description.annotation.AnnotationValue.ForDescriptionArray.of(r2)
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r1 = r0.define(r1, r2)
                return r1
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                return r1
            L13:
                net.bytebuddy.description.type.TypeDescription r2 = r4.annotationType
                net.bytebuddy.description.annotation.AnnotationDescription$Builder r5 = (net.bytebuddy.description.annotation.AnnotationDescription.Builder) r5
                net.bytebuddy.description.type.TypeDescription r3 = r5.annotationType
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2 = r4.annotationValues
                java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r5 = r5.annotationValues
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2b
                return r1
            L2b:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.annotationType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r1 = r2.annotationValues
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public static class ForLoadedAnnotation<S extends java.lang.annotation.Annotation> extends net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase implements net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final java.lang.Object[] NO_ARGUMENT = null;
        private final S annotation;
        private final java.lang.Class<S> annotationType;

        static {
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
                net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L1a
                goto L1c
            L16:
                r1 = 1
                net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.ACCESS_CONTROLLER = r1
                goto L1c
            L1a:
                net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.ACCESS_CONTROLLER = r0
            L1c:
                java.lang.Object[] r0 = new java.lang.Object[r0]
                net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.NO_ARGUMENT = r0
                return
        }

        public ForLoadedAnnotation(S r2) {
                r1 = this;
                java.lang.Class r0 = r2.annotationType()
                r1.<init>(r2, r0)
                return
        }

        private ForLoadedAnnotation(S r1, java.lang.Class<S> r2) {
                r0 = this;
                r0.<init>()
                r0.annotation = r1
                r0.annotationType = r2
                return
        }

        private static java.util.Map<java.lang.String, net.bytebuddy.description.annotation.AnnotationValue<?, ?>> asValue(java.lang.annotation.Annotation r9) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.lang.Class r1 = r9.annotationType()
                java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
                int r2 = r1.length
                r3 = 0
            Lf:
                if (r3 >= r2) goto Lbf
                r4 = r1[r3]
                java.lang.String r5 = r4.getName()     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L2c
                java.lang.Object[] r6 = net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.NO_ARGUMENT     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L2c
                java.lang.Object r6 = r4.invoke(r9, r6)     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L2c
                java.lang.Class r7 = r4.getReturnType()     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L2c
                net.bytebuddy.description.annotation.AnnotationValue r6 = asValue(r6, r7)     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L2c
                r0.put(r5, r6)     // Catch: java.lang.IllegalAccessException -> L2a java.lang.reflect.InvocationTargetException -> L2c
                goto La4
            L2a:
                r9 = move-exception
                goto L2e
            L2c:
                r5 = move-exception
                goto L45
            L2e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot access "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1, r9)
                throw r0
            L45:
                java.lang.Throwable r5 = r5.getTargetException()
                boolean r6 = r5 instanceof java.lang.TypeNotPresentException
                if (r6 == 0) goto L60
                java.lang.String r4 = r4.getName()
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingType r6 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType
                java.lang.TypeNotPresentException r5 = (java.lang.TypeNotPresentException) r5
                java.lang.String r5 = r5.typeName()
                r6.<init>(r5)
                r0.put(r4, r6)
                goto La4
            L60:
                boolean r6 = r5 instanceof java.lang.EnumConstantNotPresentException
                if (r6 == 0) goto L80
                java.lang.String r4 = r4.getName()
                net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription$WithUnknownConstant r6 = new net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription$WithUnknownConstant
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r7 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.EnumConstantNotPresentException r5 = (java.lang.EnumConstantNotPresentException) r5
                java.lang.Class r8 = r5.enumType()
                r7.<init>(r8)
                java.lang.String r5 = r5.constantName()
                r6.<init>(r7, r5)
                r0.put(r4, r6)
                goto La4
            L80:
                boolean r6 = r5 instanceof java.lang.annotation.AnnotationTypeMismatchException
                if (r6 == 0) goto La0
                java.lang.String r4 = r4.getName()
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r6 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r7 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                java.lang.annotation.AnnotationTypeMismatchException r5 = (java.lang.annotation.AnnotationTypeMismatchException) r5
                java.lang.reflect.Method r8 = r5.element()
                r7.<init>(r8)
                java.lang.String r5 = r5.foundType()
                r6.<init>(r7, r5)
                r0.put(r4, r6)
                goto La4
            La0:
                boolean r6 = r5 instanceof java.lang.annotation.IncompleteAnnotationException
                if (r6 == 0) goto La8
            La4:
                int r3 = r3 + 1
                goto Lf
            La8:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot read "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r0 = r0.toString()
                r9.<init>(r0, r5)
                throw r9
            Lbf:
                return r0
        }

        public static net.bytebuddy.description.annotation.AnnotationValue<?, ?> asValue(java.lang.Object r8, java.lang.Class<?> r9) {
                java.lang.Class<java.lang.Enum> r0 = java.lang.Enum.class
                boolean r0 = r0.isAssignableFrom(r9)
                if (r0 == 0) goto L14
                net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration r9 = new net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration
                java.lang.Enum r8 = (java.lang.Enum) r8
                r9.<init>(r8)
                net.bytebuddy.description.annotation.AnnotationValue r8 = net.bytebuddy.description.annotation.AnnotationValue.ForEnumerationDescription.of(r9)
                return r8
            L14:
                java.lang.Class<java.lang.Enum[]> r0 = java.lang.Enum[].class
                boolean r0 = r0.isAssignableFrom(r9)
                r1 = 0
                if (r0 == 0) goto L42
                java.lang.Enum[] r8 = (java.lang.Enum[]) r8
                int r0 = r8.length
                net.bytebuddy.description.enumeration.EnumerationDescription[] r0 = new net.bytebuddy.description.enumeration.EnumerationDescription[r0]
                int r2 = r8.length
                r3 = r1
            L24:
                if (r1 >= r2) goto L35
                r4 = r8[r1]
                int r5 = r3 + 1
                net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration r6 = new net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration
                r6.<init>(r4)
                r0[r3] = r6
                int r1 = r1 + 1
                r3 = r5
                goto L24
            L35:
                java.lang.Class r8 = r9.getComponentType()
                net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
                net.bytebuddy.description.annotation.AnnotationValue r8 = net.bytebuddy.description.annotation.AnnotationValue.ForDescriptionArray.of(r8, r0)
                return r8
            L42:
                java.lang.Class<java.lang.annotation.Annotation> r0 = java.lang.annotation.Annotation.class
                boolean r0 = r0.isAssignableFrom(r9)
                if (r0 == 0) goto L59
                net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r9)
                java.lang.annotation.Annotation r8 = (java.lang.annotation.Annotation) r8
                java.util.Map r8 = asValue(r8)
                net.bytebuddy.description.annotation.AnnotationValue r8 = net.bytebuddy.description.annotation.AnnotationValue.ForAnnotationDescription.of(r9, r8)
                return r8
            L59:
                java.lang.Class<java.lang.annotation.Annotation[]> r0 = java.lang.annotation.Annotation[].class
                boolean r0 = r0.isAssignableFrom(r9)
                if (r0 == 0) goto L94
                java.lang.annotation.Annotation[] r8 = (java.lang.annotation.Annotation[]) r8
                java.lang.annotation.Annotation[] r8 = (java.lang.annotation.Annotation[]) r8
                int r0 = r8.length
                net.bytebuddy.description.annotation.AnnotationDescription[] r0 = new net.bytebuddy.description.annotation.AnnotationDescription[r0]
                int r2 = r8.length
                r3 = r1
            L6a:
                if (r1 >= r2) goto L87
                r4 = r8[r1]
                int r5 = r3 + 1
                net.bytebuddy.description.annotation.AnnotationDescription$Latent r6 = new net.bytebuddy.description.annotation.AnnotationDescription$Latent
                java.lang.Class r7 = r9.getComponentType()
                net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
                java.util.Map r4 = asValue(r4)
                r6.<init>(r7, r4)
                r0[r3] = r6
                int r1 = r1 + 1
                r3 = r5
                goto L6a
            L87:
                java.lang.Class r8 = r9.getComponentType()
                net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
                net.bytebuddy.description.annotation.AnnotationValue r8 = net.bytebuddy.description.annotation.AnnotationValue.ForDescriptionArray.of(r8, r0)
                return r8
            L94:
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                boolean r0 = r0.isAssignableFrom(r9)
                if (r0 == 0) goto La7
                java.lang.Class r8 = (java.lang.Class) r8
                net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
                net.bytebuddy.description.annotation.AnnotationValue r8 = net.bytebuddy.description.annotation.AnnotationValue.ForTypeDescription.of(r8)
                return r8
            La7:
                java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
                boolean r9 = r0.isAssignableFrom(r9)
                if (r9 == 0) goto Lcb
                java.lang.Class[] r8 = (java.lang.Class[]) r8
                int r9 = r8.length
                net.bytebuddy.description.type.TypeDescription[] r9 = new net.bytebuddy.description.type.TypeDescription[r9]
                int r0 = r8.length
                r2 = r1
            Lb6:
                if (r1 >= r0) goto Lc6
                r3 = r8[r1]
                int r4 = r2 + 1
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                r9[r2] = r3
                int r1 = r1 + 1
                r2 = r4
                goto Lb6
            Lc6:
                net.bytebuddy.description.annotation.AnnotationValue r8 = net.bytebuddy.description.annotation.AnnotationValue.ForDescriptionArray.of(r9)
                return r8
            Lcb:
                net.bytebuddy.description.annotation.AnnotationValue r8 = net.bytebuddy.description.annotation.AnnotationValue.ForConstant.of(r8)
                return r8
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static <U extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationDescription.Loadable<U> of(U r1) {
                net.bytebuddy.description.annotation.AnnotationDescription$ForLoadedAnnotation r0 = new net.bytebuddy.description.annotation.AnnotationDescription$ForLoadedAnnotation
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public net.bytebuddy.description.type.TypeDescription getAnnotationType() {
                r1 = this;
                S extends java.lang.annotation.Annotation r0 = r1.annotation
                java.lang.Class r0 = r0.annotationType()
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should always be wrapped for clarity.", value = {"REC_CATCH_EXCEPTION"})
        public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getValue(net.bytebuddy.description.method.MethodDescription.InDefinedShape r6) {
                r5 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r6.getDeclaringType()
                S extends java.lang.annotation.Annotation r1 = r5.annotation
                java.lang.Class r1 = r1.annotationType()
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto Lfa
                net.bytebuddy.description.type.TypeDescription r0 = r6.getDeclaringType()     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                boolean r0 = r0.isPublic()     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                boolean r1 = r6 instanceof net.bytebuddy.description.method.MethodDescription.ForLoadedMethod     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                r2 = 0
                if (r1 == 0) goto L29
                r1 = r6
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r1 = (net.bytebuddy.description.method.MethodDescription.ForLoadedMethod) r1     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                java.lang.reflect.Method r1 = r1.getLoadedMethod()     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                goto L2a
            L25:
                r0 = move-exception
                goto L6d
            L27:
                r0 = move-exception
                goto L84
            L29:
                r1 = r2
            L2a:
                if (r1 == 0) goto L40
                java.lang.Class r3 = r1.getDeclaringClass()     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                S extends java.lang.annotation.Annotation r4 = r5.annotation     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                java.lang.Class r4 = r4.annotationType()     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                if (r3 != r4) goto L40
                if (r0 != 0) goto L58
                boolean r3 = r1.isAccessible()     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                if (r3 != 0) goto L58
            L40:
                S extends java.lang.annotation.Annotation r1 = r5.annotation     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                java.lang.Class r1 = r1.annotationType()     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                java.lang.String r3 = r6.getName()     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                java.lang.reflect.Method r1 = r1.getMethod(r3, r2)     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                if (r0 != 0) goto L58
                net.bytebuddy.utility.privilege.SetAccessibleAction r0 = new net.bytebuddy.utility.privilege.SetAccessibleAction     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                r0.<init>(r1)     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                doPrivileged(r0)     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
            L58:
                S extends java.lang.annotation.Annotation r0 = r5.annotation     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                java.lang.Object[] r2 = net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.NO_ARGUMENT     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                java.lang.Class r1 = r1.getReturnType()     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                net.bytebuddy.description.annotation.AnnotationValue r0 = asValue(r0, r1)     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                net.bytebuddy.description.annotation.AnnotationValue r6 = r0.filter(r6)     // Catch: java.lang.Exception -> L25 java.lang.reflect.InvocationTargetException -> L27
                return r6
            L6d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot access annotation property "
                r2.append(r3)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6, r0)
                throw r1
            L84:
                java.lang.Throwable r0 = r0.getTargetException()
                boolean r1 = r0 instanceof java.lang.TypeNotPresentException
                if (r1 == 0) goto L98
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingType r6 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingType
                java.lang.TypeNotPresentException r0 = (java.lang.TypeNotPresentException) r0
                java.lang.String r0 = r0.typeName()
                r6.<init>(r0)
                return r6
            L98:
                boolean r1 = r0 instanceof java.lang.EnumConstantNotPresentException
                if (r1 == 0) goto Lb1
                net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription$WithUnknownConstant r6 = new net.bytebuddy.description.annotation.AnnotationValue$ForEnumerationDescription$WithUnknownConstant
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.EnumConstantNotPresentException r0 = (java.lang.EnumConstantNotPresentException) r0
                java.lang.Class r2 = r0.enumType()
                r1.<init>(r2)
                java.lang.String r0 = r0.constantName()
                r6.<init>(r1, r0)
                return r6
            Lb1:
                boolean r1 = r0 instanceof java.lang.annotation.AnnotationTypeMismatchException
                if (r1 == 0) goto Lca
                net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType r6 = new net.bytebuddy.description.annotation.AnnotationValue$ForMismatchedType
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r1 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                java.lang.annotation.AnnotationTypeMismatchException r0 = (java.lang.annotation.AnnotationTypeMismatchException) r0
                java.lang.reflect.Method r2 = r0.element()
                r1.<init>(r2)
                java.lang.String r0 = r0.foundType()
                r6.<init>(r1, r0)
                return r6
            Lca:
                boolean r1 = r0 instanceof java.lang.annotation.IncompleteAnnotationException
                if (r1 == 0) goto Le3
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingValue r6 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingValue
                net.bytebuddy.description.type.TypeDescription$ForLoadedType r1 = new net.bytebuddy.description.type.TypeDescription$ForLoadedType
                java.lang.annotation.IncompleteAnnotationException r0 = (java.lang.annotation.IncompleteAnnotationException) r0
                java.lang.Class r2 = r0.annotationType()
                r1.<init>(r2)
                java.lang.String r0 = r0.elementName()
                r6.<init>(r1, r0)
                return r6
            Le3:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Error reading annotation property "
                r2.append(r3)
                r2.append(r6)
                java.lang.String r6 = r2.toString()
                r1.<init>(r6, r0)
                throw r1
            Lfa:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r6)
                java.lang.String r6 = " does not represent "
                r1.append(r6)
                S extends java.lang.annotation.Annotation r6 = r5.annotation
                java.lang.Class r6 = r6.annotationType()
                r1.append(r6)
                java.lang.String r6 = r1.toString()
                r0.<init>(r6)
                throw r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription.Loadable
        public S load() {
                r3 = this;
                java.lang.Class<S extends java.lang.annotation.Annotation> r0 = r3.annotationType
                S extends java.lang.annotation.Annotation r1 = r3.annotation
                java.lang.Class r1 = r1.annotationType()
                if (r0 != r1) goto Ld
                S extends java.lang.annotation.Annotation r0 = r3.annotation
                goto L1f
            Ld:
                java.lang.Class<S extends java.lang.annotation.Annotation> r0 = r3.annotationType
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.lang.Class<S extends java.lang.annotation.Annotation> r1 = r3.annotationType
                S extends java.lang.annotation.Annotation r2 = r3.annotation
                java.util.Map r2 = asValue(r2)
                java.lang.annotation.Annotation r0 = net.bytebuddy.description.annotation.AnnotationDescription.AnnotationInvocationHandler.of(r0, r1, r2)
            L1f:
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public <T extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> prepare(java.lang.Class<T> r3) {
                r2 = this;
                S extends java.lang.annotation.Annotation r0 = r2.annotation
                java.lang.Class r0 = r0.annotationType()
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = r3.getName()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L26
                S extends java.lang.annotation.Annotation r0 = r2.annotation
                java.lang.Class r0 = r0.annotationType()
                if (r3 != r0) goto L1e
                r0 = r2
                goto L25
            L1e:
                net.bytebuddy.description.annotation.AnnotationDescription$ForLoadedAnnotation r0 = new net.bytebuddy.description.annotation.AnnotationDescription$ForLoadedAnnotation
                S extends java.lang.annotation.Annotation r1 = r2.annotation
                r0.<init>(r1, r3)
            L25:
                return r0
            L26:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not represent "
                r1.append(r3)
                S extends java.lang.annotation.Annotation r3 = r2.annotation
                java.lang.Class r3 = r3.annotationType()
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }
    }

    public static class Latent extends net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase {
        private final net.bytebuddy.description.type.TypeDescription annotationType;
        private final java.util.Map<java.lang.String, ? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> annotationValues;

        public class Loadable<S extends java.lang.annotation.Annotation> extends net.bytebuddy.description.annotation.AnnotationDescription.AbstractBase implements net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> {
            private final java.lang.Class<S> annotationType;
            final /* synthetic */ net.bytebuddy.description.annotation.AnnotationDescription.Latent this$0;

            public Loadable(net.bytebuddy.description.annotation.AnnotationDescription.Latent r1, java.lang.Class<S> r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.annotationType = r2
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationDescription
            public net.bytebuddy.description.type.TypeDescription getAnnotationType() {
                    r1 = this;
                    java.lang.Class<S extends java.lang.annotation.Annotation> r0 = r1.annotationType
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationDescription
            public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getValue(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationDescription$Latent r0 = r1.this$0
                    net.bytebuddy.description.annotation.AnnotationValue r2 = r0.getValue(r2)
                    return r2
            }

            @Override // net.bytebuddy.description.annotation.AnnotationDescription.Loadable
            public S load() {
                    r3 = this;
                    java.lang.Class<S extends java.lang.annotation.Annotation> r0 = r3.annotationType
                    java.lang.ClassLoader r0 = r0.getClassLoader()
                    java.lang.Class<S extends java.lang.annotation.Annotation> r1 = r3.annotationType
                    net.bytebuddy.description.annotation.AnnotationDescription$Latent r2 = r3.this$0
                    java.util.Map r2 = net.bytebuddy.description.annotation.AnnotationDescription.Latent.access$100(r2)
                    java.lang.annotation.Annotation r0 = net.bytebuddy.description.annotation.AnnotationDescription.AnnotationInvocationHandler.of(r0, r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationDescription
            public <T extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> prepare(java.lang.Class<T> r2) {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationDescription$Latent r0 = r1.this$0
                    net.bytebuddy.description.annotation.AnnotationDescription$Latent$Loadable r2 = r0.prepare(r2)
                    return r2
            }
        }

        public Latent(net.bytebuddy.description.type.TypeDescription r1, java.util.Map<java.lang.String, ? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r2) {
                r0 = this;
                r0.<init>()
                r0.annotationType = r1
                r0.annotationValues = r2
                return
        }

        public static /* synthetic */ java.util.Map access$100(net.bytebuddy.description.annotation.AnnotationDescription.Latent r0) {
                java.util.Map<java.lang.String, ? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r0 = r0.annotationValues
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public net.bytebuddy.description.type.TypeDescription getAnnotationType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.annotationType
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getValue(net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r4.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r1 = r3.annotationType
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L31
                java.util.Map<java.lang.String, ? extends net.bytebuddy.description.annotation.AnnotationValue<?, ?>> r0 = r3.annotationValues
                java.lang.String r1 = r4.getName()
                java.lang.Object r0 = r0.get(r1)
                net.bytebuddy.description.annotation.AnnotationValue r0 = (net.bytebuddy.description.annotation.AnnotationValue) r0
                if (r0 == 0) goto L1f
                net.bytebuddy.description.annotation.AnnotationValue r4 = r0.filter(r4)
                return r4
            L1f:
                net.bytebuddy.description.annotation.AnnotationValue r0 = r4.getDefaultValue()
                if (r0 != 0) goto L30
                net.bytebuddy.description.annotation.AnnotationValue$ForMissingValue r0 = new net.bytebuddy.description.annotation.AnnotationValue$ForMissingValue
                net.bytebuddy.description.type.TypeDescription r1 = r3.annotationType
                java.lang.String r4 = r4.getName()
                r0.<init>(r1, r4)
            L30:
                return r0
            L31:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not a property of "
                r1.append(r2)
                net.bytebuddy.description.type.TypeDescription r2 = r3.annotationType
                r1.append(r2)
                java.lang.String r2 = ": "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public <T extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationDescription.Latent.Loadable<T> prepare(java.lang.Class<T> r3) {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r2.annotationType
                boolean r0 = r0.represents(r3)
                if (r0 == 0) goto Le
                net.bytebuddy.description.annotation.AnnotationDescription$Latent$Loadable r0 = new net.bytebuddy.description.annotation.AnnotationDescription$Latent$Loadable
                r0.<init>(r2, r3)
                return r0
            Le:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " does not represent "
                r1.append(r3)
                net.bytebuddy.description.type.TypeDescription r3 = r2.annotationType
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationDescription
        public /* bridge */ /* synthetic */ net.bytebuddy.description.annotation.AnnotationDescription.Loadable prepare(java.lang.Class r1) {
                r0 = this;
                net.bytebuddy.description.annotation.AnnotationDescription$Latent$Loadable r1 = r0.prepare(r1)
                return r1
        }
    }

    public interface Loadable<S extends java.lang.annotation.Annotation> extends net.bytebuddy.description.annotation.AnnotationDescription {
        S load();
    }

    public enum RenderingDispatcher extends java.lang.Enum<net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher> {
        private static final /* synthetic */ net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher[] $VALUES = null;
        public static final net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher CURRENT = null;
        public static final net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher JAVA_14_CAPABLE_VM = null;
        public static final net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher JAVA_19_CAPABLE_VM = null;
        public static final net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher LEGACY_VM = null;



        static {
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher r0 = new net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher
                java.lang.String r1 = "LEGACY_VM"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.LEGACY_VM = r0
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher$1 r1 = new net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher$1
                java.lang.String r3 = "JAVA_14_CAPABLE_VM"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.JAVA_14_CAPABLE_VM = r1
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher$2 r3 = new net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher$2
                java.lang.String r5 = "JAVA_19_CAPABLE_VM"
                r6 = 2
                r3.<init>(r5, r6)
                net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.JAVA_19_CAPABLE_VM = r3
                r5 = 3
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher[] r5 = new net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.$VALUES = r5
                net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V5
                net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.ofThisVm(r2)
                net.bytebuddy.ClassFileVersion r4 = net.bytebuddy.ClassFileVersion.JAVA_V19
                boolean r4 = r2.isAtLeast(r4)
                if (r4 == 0) goto L3a
                net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.CURRENT = r3
                goto L47
            L3a:
                net.bytebuddy.ClassFileVersion r3 = net.bytebuddy.ClassFileVersion.JAVA_V14
                boolean r2 = r2.isAtLeast(r3)
                if (r2 == 0) goto L45
                net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.CURRENT = r1
                goto L47
            L45:
                net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.CURRENT = r0
            L47:
                return
        }

        RenderingDispatcher(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ RenderingDispatcher(java.lang.String r1, int r2, net.bytebuddy.description.annotation.AnnotationDescription.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher> r0 = net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher r1 = (net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher) r1
                return r1
        }

        public static net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher[] values() {
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher[] r0 = net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.description.annotation.AnnotationDescription$RenderingDispatcher[] r0 = (net.bytebuddy.description.annotation.AnnotationDescription.RenderingDispatcher[]) r0
                return r0
        }

        public void appendPrefix(java.lang.StringBuilder r1, java.lang.String r2, int r3) {
                r0 = this;
                r1.append(r2)
                r2 = 61
                r1.append(r2)
                return
        }

        public void appendType(java.lang.StringBuilder r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                java.lang.String r2 = r2.getName()
                r1.append(r2)
                return
        }
    }

    static {
            return
    }

    net.bytebuddy.description.type.TypeDescription getAnnotationType();

    java.util.Set<java.lang.annotation.ElementType> getElementTypes();

    java.lang.annotation.RetentionPolicy getRetention();

    net.bytebuddy.description.annotation.AnnotationValue<?, ?> getValue(java.lang.String r1);

    net.bytebuddy.description.annotation.AnnotationValue<?, ?> getValue(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1);

    boolean isDocumented();

    boolean isInherited();

    boolean isSupportedOn(java.lang.String r1);

    boolean isSupportedOn(java.lang.annotation.ElementType r1);

    <T extends java.lang.annotation.Annotation> net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> prepare(java.lang.Class<T> r1);
}
