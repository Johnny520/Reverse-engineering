package net.bytebuddy.description.type;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeDefinition extends net.bytebuddy.description.NamedElement, net.bytebuddy.description.ModifierReviewable.ForTypeDefinition, java.lang.Iterable<net.bytebuddy.description.type.TypeDefinition> {
    public static final java.lang.String RAW_TYPES_PROPERTY = "net.bytebuddy.raw";

    public enum Sort extends java.lang.Enum<net.bytebuddy.description.type.TypeDefinition.Sort> {
        private static final /* synthetic */ net.bytebuddy.description.type.TypeDefinition.Sort[] $VALUES = null;
        private static final boolean ACCESS_CONTROLLER = false;
        private static final net.bytebuddy.description.type.TypeDefinition.Sort.AnnotatedType ANNOTATED_TYPE = null;
        public static final net.bytebuddy.description.type.TypeDefinition.Sort GENERIC_ARRAY = null;
        public static final net.bytebuddy.description.type.TypeDefinition.Sort NON_GENERIC = null;
        public static final net.bytebuddy.description.type.TypeDefinition.Sort PARAMETERIZED = null;
        public static final net.bytebuddy.description.type.TypeDefinition.Sort VARIABLE = null;
        public static final net.bytebuddy.description.type.TypeDefinition.Sort VARIABLE_SYMBOLIC = null;
        public static final net.bytebuddy.description.type.TypeDefinition.Sort WILDCARD = null;

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.AnnotatedType")
        public interface AnnotatedType {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getType")
            java.lang.reflect.Type getType(java.lang.reflect.AnnotatedElement r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isInstance")
            boolean isInstance(java.lang.reflect.AnnotatedElement r1);
        }

        static {
                r0 = 1
                r1 = 0
                java.lang.String r2 = "java.security.AccessController"
                r3 = 0
                java.lang.Class.forName(r2, r1, r3)     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
                java.lang.String r2 = "net.bytebuddy.securitymanager"
                java.lang.String r3 = "true"
                java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
                boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
                net.bytebuddy.description.type.TypeDefinition.Sort.ACCESS_CONTROLLER = r2     // Catch: java.lang.SecurityException -> L17 java.lang.ClassNotFoundException -> L1a
                goto L1c
            L17:
                net.bytebuddy.description.type.TypeDefinition.Sort.ACCESS_CONTROLLER = r0
                goto L1c
            L1a:
                net.bytebuddy.description.type.TypeDefinition.Sort.ACCESS_CONTROLLER = r1
            L1c:
                net.bytebuddy.description.type.TypeDefinition$Sort r3 = new net.bytebuddy.description.type.TypeDefinition$Sort
                java.lang.String r2 = "NON_GENERIC"
                r3.<init>(r2, r1)
                net.bytebuddy.description.type.TypeDefinition.Sort.NON_GENERIC = r3
                net.bytebuddy.description.type.TypeDefinition$Sort r4 = new net.bytebuddy.description.type.TypeDefinition$Sort
                java.lang.String r1 = "GENERIC_ARRAY"
                r4.<init>(r1, r0)
                net.bytebuddy.description.type.TypeDefinition.Sort.GENERIC_ARRAY = r4
                net.bytebuddy.description.type.TypeDefinition$Sort r5 = new net.bytebuddy.description.type.TypeDefinition$Sort
                java.lang.String r0 = "PARAMETERIZED"
                r1 = 2
                r5.<init>(r0, r1)
                net.bytebuddy.description.type.TypeDefinition.Sort.PARAMETERIZED = r5
                net.bytebuddy.description.type.TypeDefinition$Sort r6 = new net.bytebuddy.description.type.TypeDefinition$Sort
                java.lang.String r0 = "WILDCARD"
                r1 = 3
                r6.<init>(r0, r1)
                net.bytebuddy.description.type.TypeDefinition.Sort.WILDCARD = r6
                net.bytebuddy.description.type.TypeDefinition$Sort r7 = new net.bytebuddy.description.type.TypeDefinition$Sort
                java.lang.String r0 = "VARIABLE"
                r1 = 4
                r7.<init>(r0, r1)
                net.bytebuddy.description.type.TypeDefinition.Sort.VARIABLE = r7
                net.bytebuddy.description.type.TypeDefinition$Sort r8 = new net.bytebuddy.description.type.TypeDefinition$Sort
                java.lang.String r0 = "VARIABLE_SYMBOLIC"
                r1 = 5
                r8.<init>(r0, r1)
                net.bytebuddy.description.type.TypeDefinition.Sort.VARIABLE_SYMBOLIC = r8
                net.bytebuddy.description.type.TypeDefinition$Sort[] r0 = new net.bytebuddy.description.type.TypeDefinition.Sort[]{r3, r4, r5, r6, r7, r8}
                net.bytebuddy.description.type.TypeDefinition.Sort.$VALUES = r0
                java.lang.Class<net.bytebuddy.description.type.TypeDefinition$Sort$AnnotatedType> r0 = net.bytebuddy.description.type.TypeDefinition.Sort.AnnotatedType.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.description.type.TypeDefinition$Sort$AnnotatedType r0 = (net.bytebuddy.description.type.TypeDefinition.Sort.AnnotatedType) r0
                net.bytebuddy.description.type.TypeDefinition.Sort.ANNOTATED_TYPE = r0
                return
        }

        Sort(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.description.type.TypeDescription.Generic describe(java.lang.reflect.Type r1) {
                net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp r0 = net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.NoOp.INSTANCE
                net.bytebuddy.description.type.TypeDescription$Generic r1 = describe(r1, r0)
                return r1
        }

        public static net.bytebuddy.description.type.TypeDescription.Generic describe(java.lang.reflect.Type r2, net.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader r3) {
                boolean r0 = r2 instanceof java.lang.Class
                if (r0 == 0) goto Lc
                net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType
                java.lang.Class r2 = (java.lang.Class) r2
                r0.<init>(r2, r3)
                return r0
            Lc:
                boolean r0 = r2 instanceof java.lang.reflect.GenericArrayType
                if (r0 == 0) goto L18
                net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$ForLoadedType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfGenericArray$ForLoadedType
                java.lang.reflect.GenericArrayType r2 = (java.lang.reflect.GenericArrayType) r2
                r0.<init>(r2, r3)
                return r0
            L18:
                boolean r0 = r2 instanceof java.lang.reflect.ParameterizedType
                if (r0 == 0) goto L24
                net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$ForLoadedType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfParameterizedType$ForLoadedType
                java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
                r0.<init>(r2, r3)
                return r0
            L24:
                boolean r0 = r2 instanceof java.lang.reflect.TypeVariable
                if (r0 == 0) goto L30
                net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$ForLoadedType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$ForLoadedType
                java.lang.reflect.TypeVariable r2 = (java.lang.reflect.TypeVariable) r2
                r0.<init>(r2, r3)
                return r0
            L30:
                boolean r0 = r2 instanceof java.lang.reflect.WildcardType
                if (r0 == 0) goto L3c
                net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$ForLoadedType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$OfWildcardType$ForLoadedType
                java.lang.reflect.WildcardType r2 = (java.lang.reflect.WildcardType) r2
                r0.<init>(r2, r3)
                return r0
            L3c:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unknown type: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r2 = r0.toString()
                r3.<init>(r2)
                throw r3
        }

        public static net.bytebuddy.description.type.TypeDescription.Generic describeAnnotated(java.lang.reflect.AnnotatedElement r3) {
                net.bytebuddy.description.type.TypeDefinition$Sort$AnnotatedType r0 = net.bytebuddy.description.type.TypeDefinition.Sort.ANNOTATED_TYPE
                boolean r1 = r0.isInstance(r3)
                if (r1 == 0) goto L16
                java.lang.reflect.Type r0 = r0.getType(r3)
                net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$Simple r1 = new net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Delegator$Simple
                r1.<init>(r3)
                net.bytebuddy.description.type.TypeDescription$Generic r3 = describe(r0, r1)
                return r3
            L16:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not an instance of AnnotatedType: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.description.type.TypeDefinition.Sort.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static net.bytebuddy.description.type.TypeDefinition.Sort valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.description.type.TypeDefinition$Sort> r0 = net.bytebuddy.description.type.TypeDefinition.Sort.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.description.type.TypeDefinition$Sort r1 = (net.bytebuddy.description.type.TypeDefinition.Sort) r1
                return r1
        }

        public static net.bytebuddy.description.type.TypeDefinition.Sort[] values() {
                net.bytebuddy.description.type.TypeDefinition$Sort[] r0 = net.bytebuddy.description.type.TypeDefinition.Sort.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.description.type.TypeDefinition$Sort[] r0 = (net.bytebuddy.description.type.TypeDefinition.Sort[]) r0
                return r0
        }

        public boolean isGenericArray() {
                r1 = this;
                net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.GENERIC_ARRAY
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean isNonGeneric() {
                r1 = this;
                net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.NON_GENERIC
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean isParameterized() {
                r1 = this;
                net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.PARAMETERIZED
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        public boolean isTypeVariable() {
                r1 = this;
                net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.VARIABLE
                if (r1 == r0) goto Lb
                net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.VARIABLE_SYMBOLIC
                if (r1 != r0) goto L9
                goto Lb
            L9:
                r0 = 0
                goto Lc
            Lb:
                r0 = 1
            Lc:
                return r0
        }

        public boolean isWildcard() {
                r1 = this;
                net.bytebuddy.description.type.TypeDefinition$Sort r0 = net.bytebuddy.description.type.TypeDefinition.Sort.WILDCARD
                if (r1 != r0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    public static class SuperClassIterator implements java.util.Iterator<net.bytebuddy.description.type.TypeDefinition> {

        @net.bytebuddy.utility.nullability.UnknownNull
        private net.bytebuddy.description.type.TypeDefinition nextClass;

        public SuperClassIterator(net.bytebuddy.description.type.TypeDefinition r1) {
                r0 = this;
                r0.<init>()
                r0.nextClass = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                net.bytebuddy.description.type.TypeDefinition r0 = r1.nextClass
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition next() {
                r1 = this;
                net.bytebuddy.description.type.TypeDefinition r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: next, reason: avoid collision after fix types in other method */
        public net.bytebuddy.description.type.TypeDefinition next2() {
                r2 = this;
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L19
                net.bytebuddy.description.type.TypeDefinition r0 = r2.nextClass     // Catch: java.lang.Throwable -> Lf
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.getSuperClass()
                r2.nextClass = r1
                return r0
            Lf:
                r0 = move-exception
                net.bytebuddy.description.type.TypeDefinition r1 = r2.nextClass
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getSuperClass()
                r2.nextClass = r1
                throw r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                java.lang.String r1 = "End of type hierarchy"
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "remove"
                r0.<init>(r1)
                throw r0
        }
    }

    net.bytebuddy.description.type.TypeDescription asErasure();

    net.bytebuddy.description.type.TypeDescription.Generic asGenericType();

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.type.TypeDefinition getComponentType();

    net.bytebuddy.description.field.FieldList<?> getDeclaredFields();

    net.bytebuddy.description.method.MethodList<?> getDeclaredMethods();

    net.bytebuddy.description.type.TypeList.Generic getInterfaces();

    net.bytebuddy.description.type.RecordComponentList<?> getRecordComponents();

    net.bytebuddy.description.type.TypeDefinition.Sort getSort();

    net.bytebuddy.implementation.bytecode.StackSize getStackSize();

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.type.TypeDescription.Generic getSuperClass();

    java.lang.String getTypeName();

    boolean isArray();

    boolean isPrimitive();

    boolean isRecord();

    boolean represents(java.lang.reflect.Type r1);
}
