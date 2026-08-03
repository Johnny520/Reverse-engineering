package net.bytebuddy.implementation.attribute;

/* JADX INFO: loaded from: classes2.dex */
public interface AnnotationAppender {

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final java.lang.String NO_NAME = null;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.attribute.AnnotationAppender$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$lang$annotation$RetentionPolicy = null;

        static {
                java.lang.annotation.RetentionPolicy[] r0 = java.lang.annotation.RetentionPolicy.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.bytebuddy.implementation.attribute.AnnotationAppender.AnonymousClass1.$SwitchMap$java$lang$annotation$RetentionPolicy = r0
                java.lang.annotation.RetentionPolicy r1 = java.lang.annotation.RetentionPolicy.RUNTIME     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = net.bytebuddy.implementation.attribute.AnnotationAppender.AnonymousClass1.$SwitchMap$java$lang$annotation$RetentionPolicy     // Catch: java.lang.NoSuchFieldError -> L1d
                java.lang.annotation.RetentionPolicy r1 = java.lang.annotation.RetentionPolicy.CLASS     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = net.bytebuddy.implementation.attribute.AnnotationAppender.AnonymousClass1.$SwitchMap$java$lang$annotation$RetentionPolicy     // Catch: java.lang.NoSuchFieldError -> L28
                java.lang.annotation.RetentionPolicy r1 = java.lang.annotation.RetentionPolicy.SOURCE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Default implements net.bytebuddy.implementation.attribute.AnnotationAppender {
        private final net.bytebuddy.implementation.attribute.AnnotationAppender.Target target;

        public Default(net.bytebuddy.implementation.attribute.AnnotationAppender.Target r1) {
                r0 = this;
                r0.<init>()
                r0.target = r1
                return
        }

        public static void apply(net.bytebuddy.jar.asm.AnnotationVisitor r3, net.bytebuddy.description.type.TypeDescription r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r5, java.lang.Object r6) {
                boolean r0 = r4.isArray()
                if (r0 == 0) goto L25
                net.bytebuddy.jar.asm.AnnotationVisitor r3 = r3.visitArray(r5)
                int r5 = java.lang.reflect.Array.getLength(r6)
                net.bytebuddy.description.type.TypeDescription r4 = r4.getComponentType()
                r0 = 0
            L13:
                if (r0 >= r5) goto L21
                java.lang.String r1 = net.bytebuddy.implementation.attribute.AnnotationAppender.NO_NAME
                java.lang.Object r2 = java.lang.reflect.Array.get(r6, r0)
                apply(r3, r4, r1, r2)
                int r0 = r0 + 1
                goto L13
            L21:
                r3.visitEnd()
                goto L68
            L25:
                boolean r0 = r4.isAnnotation()
                if (r0 == 0) goto L3b
                java.lang.String r4 = r4.getDescriptor()
                net.bytebuddy.jar.asm.AnnotationVisitor r3 = r3.visitAnnotation(r5, r4)
                net.bytebuddy.description.annotation.AnnotationDescription r6 = (net.bytebuddy.description.annotation.AnnotationDescription) r6
                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Default r4 = net.bytebuddy.implementation.attribute.AnnotationValueFilter.Default.APPEND_DEFAULTS
                handle(r3, r6, r4)
                goto L68
            L3b:
                boolean r0 = r4.isEnum()
                if (r0 == 0) goto L4f
                java.lang.String r4 = r4.getDescriptor()
                net.bytebuddy.description.enumeration.EnumerationDescription r6 = (net.bytebuddy.description.enumeration.EnumerationDescription) r6
                java.lang.String r6 = r6.getValue()
                r3.visitEnum(r5, r4, r6)
                goto L68
            L4f:
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                boolean r4 = r4.represents(r0)
                if (r4 == 0) goto L65
                net.bytebuddy.description.type.TypeDescription r6 = (net.bytebuddy.description.type.TypeDescription) r6
                java.lang.String r4 = r6.getDescriptor()
                net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r4)
                r3.visit(r5, r4)
                goto L68
            L65:
                r3.visit(r5, r6)
            L68:
                return
        }

        private void doAppend(net.bytebuddy.description.annotation.AnnotationDescription r3, boolean r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5) {
                r2 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target r0 = r2.target
                net.bytebuddy.description.type.TypeDescription r1 = r3.getAnnotationType()
                java.lang.String r1 = r1.getDescriptor()
                net.bytebuddy.jar.asm.AnnotationVisitor r4 = r0.visit(r1, r4)
                if (r4 == 0) goto L13
                handle(r4, r3, r5)
            L13:
                return
        }

        private void doAppend(net.bytebuddy.description.annotation.AnnotationDescription r3, boolean r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5, int r6, java.lang.String r7) {
                r2 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target r0 = r2.target
                net.bytebuddy.description.type.TypeDescription r1 = r3.getAnnotationType()
                java.lang.String r1 = r1.getDescriptor()
                net.bytebuddy.jar.asm.AnnotationVisitor r4 = r0.visit(r1, r4, r6, r7)
                if (r4 == 0) goto L13
                handle(r4, r3, r5)
            L13:
                return
        }

        private static void handle(net.bytebuddy.jar.asm.AnnotationVisitor r4, net.bytebuddy.description.annotation.AnnotationDescription r5, net.bytebuddy.implementation.attribute.AnnotationValueFilter r6) {
                net.bytebuddy.description.type.TypeDescription r0 = r5.getAnnotationType()
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.util.Iterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L36
                java.lang.Object r1 = r0.next()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                boolean r2 = r6.isRelevant(r5, r1)
                if (r2 == 0) goto Lc
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r1.getReturnType()
                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                java.lang.String r3 = r1.getName()
                net.bytebuddy.description.annotation.AnnotationValue r1 = r5.getValue(r1)
                java.lang.Object r1 = r1.resolve()
                apply(r4, r2, r3, r1)
                goto Lc
            L36:
                r4.visitEnd()
                return
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationAppender
        public net.bytebuddy.implementation.attribute.AnnotationAppender append(net.bytebuddy.description.annotation.AnnotationDescription r3, net.bytebuddy.implementation.attribute.AnnotationValueFilter r4) {
                r2 = this;
                int[] r0 = net.bytebuddy.implementation.attribute.AnnotationAppender.AnonymousClass1.$SwitchMap$java$lang$annotation$RetentionPolicy
                java.lang.annotation.RetentionPolicy r1 = r3.getRetention()
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                if (r0 == r1) goto L36
                r1 = 2
                if (r0 == r1) goto L31
                r4 = 3
                if (r0 != r4) goto L16
                goto L39
            L16:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Unexpected retention policy: "
                r0.append(r1)
                java.lang.annotation.RetentionPolicy r3 = r3.getRetention()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
            L31:
                r0 = 0
                r2.doAppend(r3, r0, r4)
                goto L39
            L36:
                r2.doAppend(r3, r1, r4)
            L39:
                return r2
        }

        @Override // net.bytebuddy.implementation.attribute.AnnotationAppender
        public net.bytebuddy.implementation.attribute.AnnotationAppender append(net.bytebuddy.description.annotation.AnnotationDescription r10, net.bytebuddy.implementation.attribute.AnnotationValueFilter r11, int r12, java.lang.String r13) {
                r9 = this;
                int[] r0 = net.bytebuddy.implementation.attribute.AnnotationAppender.AnonymousClass1.$SwitchMap$java$lang$annotation$RetentionPolicy
                java.lang.annotation.RetentionPolicy r1 = r10.getRetention()
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                if (r0 == r1) goto L3b
                r1 = 2
                if (r0 == r1) goto L31
                r11 = 3
                if (r0 != r11) goto L16
                goto L44
            L16:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.StringBuilder r12 = new java.lang.StringBuilder
                r12.<init>()
                java.lang.String r13 = "Unexpected retention policy: "
                r12.append(r13)
                java.lang.annotation.RetentionPolicy r10 = r10.getRetention()
                r12.append(r10)
                java.lang.String r10 = r12.toString()
                r11.<init>(r10)
                throw r11
            L31:
                r2 = 0
                r0 = r9
                r1 = r10
                r3 = r11
                r4 = r12
                r5 = r13
                r0.doAppend(r1, r2, r3, r4, r5)
                goto L44
            L3b:
                r5 = 1
                r3 = r9
                r4 = r10
                r6 = r11
                r7 = r12
                r8 = r13
                r3.doAppend(r4, r5, r6, r7, r8)
            L44:
                return r9
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
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target r2 = r4.target
                net.bytebuddy.implementation.attribute.AnnotationAppender$Default r5 = (net.bytebuddy.implementation.attribute.AnnotationAppender.Default) r5
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target r5 = r5.target
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target r1 = r2.target
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForTypeAnnotations implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.implementation.attribute.AnnotationAppender> {
        private static final char COMPONENT_TYPE_PATH = '[';
        private static final java.lang.String EMPTY_TYPE_PATH = "";
        private static final char INDEXED_TYPE_DELIMITER = ';';
        private static final char INNER_CLASS_PATH = '.';
        private static final int SUPER_CLASS_INDEX = -1;
        public static final boolean VARIABLE_ON_INVOKEABLE = false;
        public static final boolean VARIABLE_ON_TYPE = true;
        private static final char WILDCARD_TYPE_PATH = '*';
        private final net.bytebuddy.implementation.attribute.AnnotationAppender annotationAppender;
        private final net.bytebuddy.implementation.attribute.AnnotationValueFilter annotationValueFilter;
        private final java.lang.String typePath;
        private final int typeReference;

        public ForTypeAnnotations(net.bytebuddy.implementation.attribute.AnnotationAppender r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>()
                r0.annotationAppender = r1
                r0.annotationValueFilter = r2
                r0.typeReference = r3
                r0.typePath = r4
                return
        }

        public ForTypeAnnotations(net.bytebuddy.implementation.attribute.AnnotationAppender r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3, net.bytebuddy.jar.asm.TypeReference r4) {
                r1 = this;
                int r4 = r4.getValue()
                java.lang.String r0 = ""
                r1.<init>(r2, r3, r4, r0)
                return
        }

        private net.bytebuddy.implementation.attribute.AnnotationAppender apply(net.bytebuddy.description.type.TypeDescription.Generic r5, java.lang.String r6) {
                r4 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender r0 = r4.annotationAppender
                net.bytebuddy.description.annotation.AnnotationList r5 = r5.getDeclaredAnnotations()
                java.util.Iterator r5 = r5.iterator()
            La:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r5.next()
                net.bytebuddy.description.annotation.AnnotationDescription r1 = (net.bytebuddy.description.annotation.AnnotationDescription) r1
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r2 = r4.annotationValueFilter
                int r3 = r4.typeReference
                net.bytebuddy.implementation.attribute.AnnotationAppender r0 = r0.append(r1, r2, r3, r6)
                goto La
            L1f:
                return r0
        }

        public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.implementation.attribute.AnnotationAppender> ofExceptionType(net.bytebuddy.implementation.attribute.AnnotationAppender r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter r2, int r3) {
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                net.bytebuddy.jar.asm.TypeReference r3 = net.bytebuddy.jar.asm.TypeReference.newExceptionReference(r3)
                r0.<init>(r1, r2, r3)
                return r0
        }

        public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.implementation.attribute.AnnotationAppender> ofFieldType(net.bytebuddy.implementation.attribute.AnnotationAppender r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3) {
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                r1 = 19
                net.bytebuddy.jar.asm.TypeReference r1 = net.bytebuddy.jar.asm.TypeReference.newTypeReference(r1)
                r0.<init>(r2, r3, r1)
                return r0
        }

        public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.implementation.attribute.AnnotationAppender> ofInterfaceType(net.bytebuddy.implementation.attribute.AnnotationAppender r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter r2, int r3) {
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                net.bytebuddy.jar.asm.TypeReference r3 = net.bytebuddy.jar.asm.TypeReference.newSuperTypeReference(r3)
                r0.<init>(r1, r2, r3)
                return r0
        }

        public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.implementation.attribute.AnnotationAppender> ofMethodParameterType(net.bytebuddy.implementation.attribute.AnnotationAppender r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter r2, int r3) {
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                net.bytebuddy.jar.asm.TypeReference r3 = net.bytebuddy.jar.asm.TypeReference.newFormalParameterReference(r3)
                r0.<init>(r1, r2, r3)
                return r0
        }

        public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.implementation.attribute.AnnotationAppender> ofMethodReturnType(net.bytebuddy.implementation.attribute.AnnotationAppender r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3) {
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                r1 = 20
                net.bytebuddy.jar.asm.TypeReference r1 = net.bytebuddy.jar.asm.TypeReference.newTypeReference(r1)
                r0.<init>(r2, r3, r1)
                return r0
        }

        public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.implementation.attribute.AnnotationAppender> ofReceiverType(net.bytebuddy.implementation.attribute.AnnotationAppender r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3) {
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                r1 = 21
                net.bytebuddy.jar.asm.TypeReference r1 = net.bytebuddy.jar.asm.TypeReference.newTypeReference(r1)
                r0.<init>(r2, r3, r1)
                return r0
        }

        public static net.bytebuddy.description.type.TypeDescription.Generic.Visitor<net.bytebuddy.implementation.attribute.AnnotationAppender> ofSuperClass(net.bytebuddy.implementation.attribute.AnnotationAppender r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3) {
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                r1 = -1
                net.bytebuddy.jar.asm.TypeReference r1 = net.bytebuddy.jar.asm.TypeReference.newSuperTypeReference(r1)
                r0.<init>(r2, r3, r1)
                return r0
        }

        public static net.bytebuddy.implementation.attribute.AnnotationAppender ofTypeVariable(net.bytebuddy.implementation.attribute.AnnotationAppender r8, net.bytebuddy.implementation.attribute.AnnotationValueFilter r9, boolean r10, int r11, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r12) {
                r0 = 1
                r1 = 0
                if (r10 == 0) goto L8
                r10 = 17
                r2 = r1
                goto Lb
            L8:
                r10 = 18
                r2 = r0
            Lb:
                int r3 = r12.size()
                java.util.List r12 = r12.subList(r11, r3)
                java.util.Iterator r12 = r12.iterator()
            L17:
                boolean r3 = r12.hasNext()
                if (r3 == 0) goto L97
                java.lang.Object r3 = r12.next()
                net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                net.bytebuddy.jar.asm.TypeReference r4 = net.bytebuddy.jar.asm.TypeReference.newTypeParameterReference(r2, r11)
                int r4 = r4.getValue()
                net.bytebuddy.description.annotation.AnnotationList r5 = r3.getDeclaredAnnotations()
                java.util.Iterator r5 = r5.iterator()
            L33:
                boolean r6 = r5.hasNext()
                if (r6 == 0) goto L46
                java.lang.Object r6 = r5.next()
                net.bytebuddy.description.annotation.AnnotationDescription r6 = (net.bytebuddy.description.annotation.AnnotationDescription) r6
                java.lang.String r7 = ""
                net.bytebuddy.implementation.attribute.AnnotationAppender r8 = r8.append(r6, r9, r4, r7)
                goto L33
            L46:
                net.bytebuddy.description.type.TypeList$Generic r4 = r3.getUpperBounds()
                java.lang.Object r4 = r4.get(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                net.bytebuddy.description.type.TypeDefinition$Sort r4 = r4.getSort()
                boolean r4 = r4.isTypeVariable()
                if (r4 != 0) goto L6c
                net.bytebuddy.description.type.TypeList$Generic r4 = r3.getUpperBounds()
                java.lang.Object r4 = r4.get(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                boolean r4 = r4.isInterface()
                if (r4 == 0) goto L6c
                r4 = r0
                goto L6d
            L6c:
                r4 = r1
            L6d:
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.getUpperBounds()
                java.util.Iterator r3 = r3.iterator()
            L75:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L94
                java.lang.Object r5 = r3.next()
                net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r6 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                int r7 = r4 + 1
                net.bytebuddy.jar.asm.TypeReference r4 = net.bytebuddy.jar.asm.TypeReference.newTypeParameterBoundReference(r10, r11, r4)
                r6.<init>(r8, r9, r4)
                java.lang.Object r8 = r5.accept(r6)
                net.bytebuddy.implementation.attribute.AnnotationAppender r8 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r8
                r4 = r7
                goto L75
            L94:
                int r11 = r11 + 1
                goto L17
            L97:
                return r8
        }

        public static net.bytebuddy.implementation.attribute.AnnotationAppender ofTypeVariable(net.bytebuddy.implementation.attribute.AnnotationAppender r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter r2, boolean r3, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r4) {
                r0 = 0
                net.bytebuddy.implementation.attribute.AnnotationAppender r1 = ofTypeVariable(r1, r2, r3, r0, r4)
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
                int r2 = r4.typeReference
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r5 = (net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations) r5
                int r3 = r5.typeReference
                if (r2 == r3) goto L1c
                return r1
            L1c:
                java.lang.String r2 = r4.typePath
                java.lang.String r3 = r5.typePath
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                net.bytebuddy.implementation.attribute.AnnotationAppender r2 = r4.annotationAppender
                net.bytebuddy.implementation.attribute.AnnotationAppender r3 = r5.annotationAppender
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L32
                return r1
            L32:
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r2 = r4.annotationValueFilter
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r5 = r5.annotationValueFilter
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L3d
                return r1
            L3d:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.attribute.AnnotationAppender r1 = r2.annotationAppender
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r1 = r2.annotationValueFilter
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                int r1 = r2.typeReference
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.typePath
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.attribute.AnnotationAppender onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender r1 = r0.onGenericArray2(r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        /* JADX INFO: renamed from: onGenericArray, reason: avoid collision after fix types in other method */
        public net.bytebuddy.implementation.attribute.AnnotationAppender onGenericArray2(net.bytebuddy.description.type.TypeDescription.Generic r7) {
                r6 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r7.getComponentType()
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r1 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                java.lang.String r2 = r6.typePath
                net.bytebuddy.implementation.attribute.AnnotationAppender r7 = r6.apply(r7, r2)
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r2 = r6.annotationValueFilter
                int r3 = r6.typeReference
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = r6.typePath
                r4.append(r5)
                r5 = 91
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r1.<init>(r7, r2, r3, r4)
                java.lang.Object r7 = r0.accept(r1)
                net.bytebuddy.implementation.attribute.AnnotationAppender r7 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r7
                return r7
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.attribute.AnnotationAppender onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender r1 = r0.onNonGenericType2(r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        /* JADX INFO: renamed from: onNonGenericType, reason: avoid collision after fix types in other method */
        public net.bytebuddy.implementation.attribute.AnnotationAppender onNonGenericType2(net.bytebuddy.description.type.TypeDescription.Generic r7) {
                r6 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = r6.typePath
                r0.<init>(r1)
                r1 = 0
            L8:
                net.bytebuddy.description.type.TypeDescription r2 = r7.asErasure()
                int r2 = r2.getInnerClassCount()
                if (r1 >= r2) goto L1a
                r2 = 46
                r0.append(r2)
                int r1 = r1 + 1
                goto L8
            L1a:
                java.lang.String r0 = r0.toString()
                net.bytebuddy.implementation.attribute.AnnotationAppender r0 = r6.apply(r7, r0)
                net.bytebuddy.description.type.TypeDescription$Generic r7 = r7.getComponentType()
                if (r7 == 0) goto L4b
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r1 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r2 = r6.annotationValueFilter
                int r3 = r6.typeReference
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = r6.typePath
                r4.append(r5)
                r5 = 91
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r1.<init>(r0, r2, r3, r4)
                java.lang.Object r7 = r7.accept(r1)
                r0 = r7
                net.bytebuddy.implementation.attribute.AnnotationAppender r0 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r0
            L4b:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.attribute.AnnotationAppender onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender r1 = r0.onParameterizedType2(r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        /* JADX INFO: renamed from: onParameterizedType, reason: avoid collision after fix types in other method */
        public net.bytebuddy.implementation.attribute.AnnotationAppender onParameterizedType2(net.bytebuddy.description.type.TypeDescription.Generic r10) {
                r9 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = r9.typePath
                r0.<init>(r1)
                r1 = 0
                r2 = r1
            L9:
                net.bytebuddy.description.type.TypeDescription r3 = r10.asErasure()
                int r3 = r3.getInnerClassCount()
                if (r2 >= r3) goto L1b
                r3 = 46
                r0.append(r3)
                int r2 = r2 + 1
                goto L9
            L1b:
                java.lang.String r2 = r0.toString()
                net.bytebuddy.implementation.attribute.AnnotationAppender r2 = r9.apply(r10, r2)
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r10.getOwnerType()
                if (r3 == 0) goto L3a
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r4 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r5 = r9.annotationValueFilter
                int r6 = r9.typeReference
                java.lang.String r7 = r9.typePath
                r4.<init>(r2, r5, r6, r7)
                java.lang.Object r2 = r3.accept(r4)
                net.bytebuddy.implementation.attribute.AnnotationAppender r2 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r2
            L3a:
                net.bytebuddy.description.type.TypeList$Generic r10 = r10.getTypeArguments()
                java.util.Iterator r10 = r10.iterator()
            L42:
                boolean r3 = r10.hasNext()
                if (r3 == 0) goto L7a
                java.lang.Object r3 = r10.next()
                net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r4 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r5 = r9.annotationValueFilter
                int r6 = r9.typeReference
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                java.lang.String r8 = r0.toString()
                r7.append(r8)
                int r8 = r1 + 1
                r7.append(r1)
                r1 = 59
                r7.append(r1)
                java.lang.String r1 = r7.toString()
                r4.<init>(r2, r5, r6, r1)
                java.lang.Object r1 = r3.accept(r4)
                r2 = r1
                net.bytebuddy.implementation.attribute.AnnotationAppender r2 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r2
                r1 = r8
                goto L42
            L7a:
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.attribute.AnnotationAppender onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender r1 = r0.onTypeVariable2(r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
        public net.bytebuddy.implementation.attribute.AnnotationAppender onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                r1 = this;
                java.lang.String r0 = r1.typePath
                net.bytebuddy.implementation.attribute.AnnotationAppender r2 = r1.apply(r2, r0)
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.attribute.AnnotationAppender onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender r1 = r0.onWildcard2(r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        /* JADX INFO: renamed from: onWildcard, reason: avoid collision after fix types in other method */
        public net.bytebuddy.implementation.attribute.AnnotationAppender onWildcard2(net.bytebuddy.description.type.TypeDescription.Generic r7) {
                r6 = this;
                net.bytebuddy.description.type.TypeList$Generic r0 = r7.getLowerBounds()
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L15
                net.bytebuddy.description.type.TypeList$Generic r0 = r7.getUpperBounds()
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                goto L1b
            L15:
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
            L1b:
                net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations r1 = new net.bytebuddy.implementation.attribute.AnnotationAppender$ForTypeAnnotations
                java.lang.String r2 = r6.typePath
                net.bytebuddy.implementation.attribute.AnnotationAppender r7 = r6.apply(r7, r2)
                net.bytebuddy.implementation.attribute.AnnotationValueFilter r2 = r6.annotationValueFilter
                int r3 = r6.typeReference
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = r6.typePath
                r4.append(r5)
                r5 = 42
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r1.<init>(r7, r2, r3, r4)
                java.lang.Object r7 = r0.accept(r1)
                net.bytebuddy.implementation.attribute.AnnotationAppender r7 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r7
                return r7
        }
    }

    public interface Target {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class OnField implements net.bytebuddy.implementation.attribute.AnnotationAppender.Target {
            private final net.bytebuddy.jar.asm.FieldVisitor fieldVisitor;

            public OnField(net.bytebuddy.jar.asm.FieldVisitor r1) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldVisitor = r1
                    return
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
                    net.bytebuddy.jar.asm.FieldVisitor r2 = r4.fieldVisitor
                    net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnField r5 = (net.bytebuddy.implementation.attribute.AnnotationAppender.Target.OnField) r5
                    net.bytebuddy.jar.asm.FieldVisitor r5 = r5.fieldVisitor
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.jar.asm.FieldVisitor r1 = r2.fieldVisitor
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.attribute.AnnotationAppender.Target
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r2, boolean r3) {
                    r1 = this;
                    net.bytebuddy.jar.asm.FieldVisitor r0 = r1.fieldVisitor
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitAnnotation(r2, r3)
                    return r2
            }

            @Override // net.bytebuddy.implementation.attribute.AnnotationAppender.Target
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r2, boolean r3, int r4, java.lang.String r5) {
                    r1 = this;
                    net.bytebuddy.jar.asm.FieldVisitor r0 = r1.fieldVisitor
                    net.bytebuddy.jar.asm.TypePath r5 = net.bytebuddy.jar.asm.TypePath.fromString(r5)
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitTypeAnnotation(r4, r5, r2, r3)
                    return r2
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class OnMethod implements net.bytebuddy.implementation.attribute.AnnotationAppender.Target {
            private final net.bytebuddy.jar.asm.MethodVisitor methodVisitor;

            public OnMethod(net.bytebuddy.jar.asm.MethodVisitor r1) {
                    r0 = this;
                    r0.<init>()
                    r0.methodVisitor = r1
                    return
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
                    net.bytebuddy.jar.asm.MethodVisitor r2 = r4.methodVisitor
                    net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethod r5 = (net.bytebuddy.implementation.attribute.AnnotationAppender.Target.OnMethod) r5
                    net.bytebuddy.jar.asm.MethodVisitor r5 = r5.methodVisitor
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.jar.asm.MethodVisitor r1 = r2.methodVisitor
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.attribute.AnnotationAppender.Target
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r2, boolean r3) {
                    r1 = this;
                    net.bytebuddy.jar.asm.MethodVisitor r0 = r1.methodVisitor
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitAnnotation(r2, r3)
                    return r2
            }

            @Override // net.bytebuddy.implementation.attribute.AnnotationAppender.Target
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r2, boolean r3, int r4, java.lang.String r5) {
                    r1 = this;
                    net.bytebuddy.jar.asm.MethodVisitor r0 = r1.methodVisitor
                    net.bytebuddy.jar.asm.TypePath r5 = net.bytebuddy.jar.asm.TypePath.fromString(r5)
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitTypeAnnotation(r4, r5, r2, r3)
                    return r2
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class OnMethodParameter implements net.bytebuddy.implementation.attribute.AnnotationAppender.Target {
            private final net.bytebuddy.jar.asm.MethodVisitor methodVisitor;
            private final int parameterIndex;

            public OnMethodParameter(net.bytebuddy.jar.asm.MethodVisitor r1, int r2) {
                    r0 = this;
                    r0.<init>()
                    r0.methodVisitor = r1
                    r0.parameterIndex = r2
                    return
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
                    int r2 = r4.parameterIndex
                    net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethodParameter r5 = (net.bytebuddy.implementation.attribute.AnnotationAppender.Target.OnMethodParameter) r5
                    int r3 = r5.parameterIndex
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.jar.asm.MethodVisitor r2 = r4.methodVisitor
                    net.bytebuddy.jar.asm.MethodVisitor r5 = r5.methodVisitor
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.jar.asm.MethodVisitor r1 = r2.methodVisitor
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    int r1 = r2.parameterIndex
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.attribute.AnnotationAppender.Target
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r3, boolean r4) {
                    r2 = this;
                    net.bytebuddy.jar.asm.MethodVisitor r0 = r2.methodVisitor
                    int r1 = r2.parameterIndex
                    net.bytebuddy.jar.asm.AnnotationVisitor r3 = r0.visitParameterAnnotation(r1, r3, r4)
                    return r3
            }

            @Override // net.bytebuddy.implementation.attribute.AnnotationAppender.Target
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r2, boolean r3, int r4, java.lang.String r5) {
                    r1 = this;
                    net.bytebuddy.jar.asm.MethodVisitor r0 = r1.methodVisitor
                    net.bytebuddy.jar.asm.TypePath r5 = net.bytebuddy.jar.asm.TypePath.fromString(r5)
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitTypeAnnotation(r4, r5, r2, r3)
                    return r2
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class OnRecordComponent implements net.bytebuddy.implementation.attribute.AnnotationAppender.Target {
            private final net.bytebuddy.jar.asm.RecordComponentVisitor recordComponentVisitor;

            public OnRecordComponent(net.bytebuddy.jar.asm.RecordComponentVisitor r1) {
                    r0 = this;
                    r0.<init>()
                    r0.recordComponentVisitor = r1
                    return
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
                    net.bytebuddy.jar.asm.RecordComponentVisitor r2 = r4.recordComponentVisitor
                    net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnRecordComponent r5 = (net.bytebuddy.implementation.attribute.AnnotationAppender.Target.OnRecordComponent) r5
                    net.bytebuddy.jar.asm.RecordComponentVisitor r5 = r5.recordComponentVisitor
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.jar.asm.RecordComponentVisitor r1 = r2.recordComponentVisitor
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.attribute.AnnotationAppender.Target
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r2, boolean r3) {
                    r1 = this;
                    net.bytebuddy.jar.asm.RecordComponentVisitor r0 = r1.recordComponentVisitor
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitAnnotation(r2, r3)
                    return r2
            }

            @Override // net.bytebuddy.implementation.attribute.AnnotationAppender.Target
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r2, boolean r3, int r4, java.lang.String r5) {
                    r1 = this;
                    net.bytebuddy.jar.asm.RecordComponentVisitor r0 = r1.recordComponentVisitor
                    net.bytebuddy.jar.asm.TypePath r5 = net.bytebuddy.jar.asm.TypePath.fromString(r5)
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitTypeAnnotation(r4, r5, r2, r3)
                    return r2
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class OnType implements net.bytebuddy.implementation.attribute.AnnotationAppender.Target {
            private final net.bytebuddy.jar.asm.ClassVisitor classVisitor;

            public OnType(net.bytebuddy.jar.asm.ClassVisitor r1) {
                    r0 = this;
                    r0.<init>()
                    r0.classVisitor = r1
                    return
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
                    net.bytebuddy.jar.asm.ClassVisitor r2 = r4.classVisitor
                    net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnType r5 = (net.bytebuddy.implementation.attribute.AnnotationAppender.Target.OnType) r5
                    net.bytebuddy.jar.asm.ClassVisitor r5 = r5.classVisitor
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.jar.asm.ClassVisitor r1 = r2.classVisitor
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.attribute.AnnotationAppender.Target
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r2, boolean r3) {
                    r1 = this;
                    net.bytebuddy.jar.asm.ClassVisitor r0 = r1.classVisitor
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitAnnotation(r2, r3)
                    return r2
            }

            @Override // net.bytebuddy.implementation.attribute.AnnotationAppender.Target
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r2, boolean r3, int r4, java.lang.String r5) {
                    r1 = this;
                    net.bytebuddy.jar.asm.ClassVisitor r0 = r1.classVisitor
                    net.bytebuddy.jar.asm.TypePath r5 = net.bytebuddy.jar.asm.TypePath.fromString(r5)
                    net.bytebuddy.jar.asm.AnnotationVisitor r2 = r0.visitTypeAnnotation(r4, r5, r2, r3)
                    return r2
            }
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r1, boolean r2);

        @net.bytebuddy.utility.nullability.MaybeNull
        net.bytebuddy.jar.asm.AnnotationVisitor visit(java.lang.String r1, boolean r2, int r3, java.lang.String r4);
    }

    static {
            return
    }

    net.bytebuddy.implementation.attribute.AnnotationAppender append(net.bytebuddy.description.annotation.AnnotationDescription r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter r2);

    net.bytebuddy.implementation.attribute.AnnotationAppender append(net.bytebuddy.description.annotation.AnnotationDescription r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter r2, int r3, java.lang.String r4);
}
