package net.bytebuddy.description.method;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodDescription extends net.bytebuddy.description.TypeVariableSource, net.bytebuddy.description.ModifierReviewable.ForMethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.ByteCodeElement.Member, net.bytebuddy.description.ByteCodeElement.TypeDependant<net.bytebuddy.description.method.MethodDescription.InDefinedShape, net.bytebuddy.description.method.MethodDescription.Token> {
    public static final java.lang.String CONSTRUCTOR_INTERNAL_NAME = "<init>";
    public static final java.lang.String TYPE_INITIALIZER_INTERNAL_NAME = "<clinit>";
    public static final int TYPE_INITIALIZER_MODIFIER = 8;

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final net.bytebuddy.description.method.MethodDescription.InDefinedShape UNDEFINED = null;

    public static abstract class AbstractBase extends net.bytebuddy.description.TypeVariableSource.AbstractBase implements net.bytebuddy.description.method.MethodDescription {
        private static final int SOURCE_MODIFIERS = 1343;
        private transient /* synthetic */ int hashCode;

        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        private static boolean isAnnotationType(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.annotation.AnnotationDescription... r5) {
                int r0 = r5.length
                r1 = 0
                r2 = r1
            L3:
                if (r2 >= r0) goto L15
                r3 = r5[r2]
                net.bytebuddy.description.type.TypeDescription r3 = r3.getAnnotationType()
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L12
                return r1
            L12:
                int r2 = r2 + 1
                goto L3
            L15:
                r4 = 1
                return r4
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        private boolean isBootstrap(net.bytebuddy.description.type.TypeDescription r9) {
                r8 = this;
                net.bytebuddy.description.method.ParameterList r0 = r8.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.asTypeList()
                net.bytebuddy.description.type.TypeList r0 = r0.asErasures()
                int r1 = r0.size()
                r2 = 0
                if (r1 == 0) goto Ld9
                java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
                r4 = 1
                if (r1 == r4) goto Lce
                r5 = 2
                if (r1 == r5) goto Lae
                r3 = 3
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                if (r1 == r3) goto L5a
                net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                java.lang.Object r3 = r0.get(r2)
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                boolean r1 = r1.isAssignableTo(r3)
                if (r1 == 0) goto L59
                java.lang.Object r1 = r0.get(r4)
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                boolean r1 = r1.represents(r7)
                if (r1 != 0) goto L4c
                java.lang.Object r1 = r0.get(r4)
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                boolean r1 = r1.represents(r6)
                if (r1 == 0) goto L59
            L4c:
                java.lang.Object r0 = r0.get(r5)
                net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                boolean r9 = r0.isAssignableFrom(r9)
                if (r9 == 0) goto L59
                r2 = r4
            L59:
                return r2
            L5a:
                net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                java.lang.Object r3 = r0.get(r2)
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                boolean r1 = r1.isAssignableTo(r3)
                if (r1 == 0) goto Lad
                java.lang.Object r1 = r0.get(r4)
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                boolean r1 = r1.represents(r7)
                if (r1 != 0) goto L84
                java.lang.Object r1 = r0.get(r4)
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                boolean r1 = r1.represents(r6)
                if (r1 == 0) goto Lad
            L84:
                java.lang.Object r1 = r0.get(r5)
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                boolean r1 = r1.isArray()
                if (r1 == 0) goto La0
                java.lang.Object r1 = r0.get(r5)
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                net.bytebuddy.description.type.TypeDescription r1 = r1.getComponentType()
                boolean r1 = r1.isAssignableFrom(r9)
                if (r1 != 0) goto Lac
            La0:
                java.lang.Object r0 = r0.get(r5)
                net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                boolean r9 = r0.isAssignableFrom(r9)
                if (r9 == 0) goto Lad
            Lac:
                r2 = r4
            Lad:
                return r2
            Lae:
                net.bytebuddy.utility.JavaType r9 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r9 = r9.getTypeStub()
                java.lang.Object r1 = r0.get(r2)
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                boolean r9 = r9.isAssignableTo(r1)
                if (r9 == 0) goto Lcd
                java.lang.Object r9 = r0.get(r4)
                net.bytebuddy.description.type.TypeDescription r9 = (net.bytebuddy.description.type.TypeDescription) r9
                boolean r9 = r9.represents(r3)
                if (r9 == 0) goto Lcd
                r2 = r4
            Lcd:
                return r2
            Lce:
                java.lang.Object r9 = r0.getOnly()
                net.bytebuddy.description.type.TypeDescription r9 = (net.bytebuddy.description.type.TypeDescription) r9
                boolean r9 = r9.represents(r3)
                return r9
            Ld9:
                return r2
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        private boolean isBootstrapping(java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r7) {
                r6 = this;
                net.bytebuddy.description.method.ParameterList r0 = r6.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.asTypeList()
                net.bytebuddy.description.type.TypeList r0 = r0.asErasures()
                int r1 = r0.size()
                r2 = 4
                r3 = 0
                r4 = 1
                if (r1 >= r2) goto L59
                boolean r1 = r7.isEmpty()
                if (r1 == 0) goto L1c
                return r4
            L1c:
                int r1 = r0.size()
                int r1 = r1 - r4
                java.lang.Object r1 = r0.get(r1)
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                boolean r1 = r1.isArray()
                if (r1 == 0) goto L58
                java.util.Iterator r7 = r7.iterator()
            L31:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L57
                java.lang.Object r1 = r7.next()
                net.bytebuddy.description.type.TypeDefinition r1 = (net.bytebuddy.description.type.TypeDefinition) r1
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                int r2 = r0.size()
                int r2 = r2 - r4
                java.lang.Object r2 = r0.get(r2)
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                net.bytebuddy.description.type.TypeDescription r2 = r2.getComponentType()
                boolean r1 = r1.isAssignableTo(r2)
                if (r1 != 0) goto L31
                return r3
            L57:
                return r4
            L58:
                return r3
            L59:
                r1 = 3
                int r2 = r0.size()
                net.bytebuddy.matcher.FilterableList r0 = r0.subList(r1, r2)
                net.bytebuddy.description.type.TypeList r0 = (net.bytebuddy.description.type.TypeList) r0
                java.util.Iterator r0 = r0.iterator()
                java.util.Iterator r7 = r7.iterator()
            L6c:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L9d
                java.lang.Object r1 = r7.next()
                net.bytebuddy.description.type.TypeDefinition r1 = (net.bytebuddy.description.type.TypeDefinition) r1
                boolean r2 = r0.hasNext()
                if (r2 != 0) goto L7f
                return r3
            L7f:
                java.lang.Object r2 = r0.next()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                boolean r5 = r0.hasNext()
                if (r5 != 0) goto L92
                boolean r5 = r2.isArray()
                if (r5 == 0) goto L92
                return r4
            L92:
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                boolean r1 = r1.isAssignableTo(r2)
                if (r1 != 0) goto L6c
                return r3
            L9d:
                boolean r7 = r0.hasNext()
                if (r7 == 0) goto Lb7
                java.lang.Object r7 = r0.next()
                net.bytebuddy.description.type.TypeDescription r7 = (net.bytebuddy.description.type.TypeDescription) r7
                boolean r7 = r7.isArray()
                if (r7 == 0) goto Lb6
                boolean r7 = r0.hasNext()
                if (r7 != 0) goto Lb6
                r3 = r4
            Lb6:
                return r3
            Lb7:
                return r4
        }

        private static boolean isEnumerationType(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.enumeration.EnumerationDescription... r5) {
                int r0 = r5.length
                r1 = 0
                r2 = r1
            L3:
                if (r2 >= r0) goto L15
                r3 = r5[r2]
                net.bytebuddy.description.type.TypeDescription r3 = r3.getEnumerationType()
                boolean r3 = r3.equals(r4)
                if (r3 != 0) goto L12
                return r1
            L12:
                int r2 = r2 + 1
                goto L3
            L15:
                r4 = 1
                return r4
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public <T> T accept(net.bytebuddy.description.TypeVariableSource.Visitor<T> r2) {
                r1 = this;
                net.bytebuddy.description.ByteCodeElement$TypeDependant r0 = r1.asDefined()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                java.lang.Object r2 = r2.onMethod(r0)
                return r2
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.method.MethodDescription.SignatureToken asSignatureToken() {
                r4 = this;
                net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
                java.lang.String r1 = r4.getInternalName()
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.getReturnType()
                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                net.bytebuddy.description.method.ParameterList r3 = r4.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.asTypeList()
                net.bytebuddy.description.type.TypeList r3 = r3.asErasures()
                r0.<init>(r1, r2, r3)
                return r0
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.Token asToken(net.bytebuddy.matcher.ElementMatcher r1) {
                r0 = this;
                net.bytebuddy.description.method.MethodDescription$Token r1 = r0.asToken(r1)
                return r1
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public net.bytebuddy.description.method.MethodDescription.Token asToken(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r13) {
                r12 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r12.getReceiverType()
                net.bytebuddy.description.method.MethodDescription$Token r11 = new net.bytebuddy.description.method.MethodDescription$Token
                java.lang.String r2 = r12.getInternalName()
                int r3 = r12.getModifiers()
                net.bytebuddy.description.type.TypeList$Generic r1 = r12.getTypeVariables()
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r4 = r1.asTokenList(r13)
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r12.getReturnType()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment r5 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment
                r5.<init>(r13)
                java.lang.Object r1 = r1.accept(r5)
                r5 = r1
                net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                net.bytebuddy.description.method.ParameterList r1 = r12.getParameters()
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r6 = r1.asTokenList(r13)
                net.bytebuddy.description.type.TypeList$Generic r1 = r12.getExceptionTypes()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment r7 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment
                r7.<init>(r13)
                net.bytebuddy.description.type.TypeList$Generic r7 = r1.accept(r7)
                net.bytebuddy.description.annotation.AnnotationList r8 = r12.getDeclaredAnnotations()
                net.bytebuddy.description.annotation.AnnotationValue r9 = r12.getDefaultValue()
                if (r0 != 0) goto L49
                net.bytebuddy.description.type.TypeDescription$Generic r13 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
            L47:
                r10 = r13
                goto L55
            L49:
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment r1 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment
                r1.<init>(r13)
                java.lang.Object r13 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r13 = (net.bytebuddy.description.type.TypeDescription.Generic) r13
                goto L47
            L55:
                r1 = r11
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return r11
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.method.MethodDescription.TypeToken asTypeToken() {
                r3 = this;
                net.bytebuddy.description.method.MethodDescription$TypeToken r0 = new net.bytebuddy.description.method.MethodDescription$TypeToken
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                net.bytebuddy.description.method.ParameterList r2 = r3.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                net.bytebuddy.description.type.TypeList r2 = r2.asErasures()
                r0.<init>(r1, r2)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.description.method.MethodDescription
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.method.MethodDescription r5 = (net.bytebuddy.description.method.MethodDescription) r5
                java.lang.String r1 = r4.getInternalName()
                java.lang.String r3 = r5.getInternalName()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5d
                net.bytebuddy.description.type.TypeDefinition r1 = r4.getDeclaringType()
                net.bytebuddy.description.type.TypeDefinition r3 = r5.getDeclaringType()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5d
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r4.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.getReturnType()
                net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L5d
                net.bytebuddy.description.method.ParameterList r1 = r4.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
                net.bytebuddy.description.method.ParameterList r5 = r5.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r5 = r5.asTypeList()
                net.bytebuddy.description.type.TypeList r5 = r5.asErasures()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L5d
                goto L5e
            L5d:
                r0 = r2
            L5e:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public int getActualModifiers() {
                r3 = this;
                int r0 = r3.getModifiers()
                net.bytebuddy.description.annotation.AnnotationList r1 = r3.getDeclaredAnnotations()
                java.lang.Class<java.lang.Deprecated> r2 = java.lang.Deprecated.class
                boolean r1 = r1.isAnnotationPresent(r2)
                if (r1 == 0) goto L13
                r1 = 131072(0x20000, float:1.83671E-40)
                goto L14
            L13:
                r1 = 0
            L14:
                r0 = r0 | r1
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public int getActualModifiers(boolean r1) {
                r0 = this;
                if (r1 == 0) goto L9
                int r1 = r0.getActualModifiers()
                r1 = r1 & (-1281(0xfffffffffffffaff, float:NaN))
                goto L11
            L9:
                int r1 = r0.getActualModifiers()
                r1 = r1 & (-257(0xfffffffffffffeff, float:NaN))
                r1 = r1 | 1024(0x400, float:1.435E-42)
            L11:
                return r1
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public int getActualModifiers(boolean r2, net.bytebuddy.description.modifier.Visibility r3) {
                r1 = this;
                net.bytebuddy.description.modifier.Visibility r0 = r1.getVisibility()
                net.bytebuddy.description.modifier.Visibility r3 = r0.expandTo(r3)
                java.util.Set r3 = java.util.Collections.singleton(r3)
                net.bytebuddy.description.modifier.ModifierContributor$Resolver r3 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r3)
                int r2 = r1.getActualModifiers(r2)
                int r2 = r3.resolve(r2)
                return r2
        }

        @Override // net.bytebuddy.description.NamedElement
        public java.lang.String getActualName() {
                r1 = this;
                boolean r0 = r1.isMethod()
                if (r0 == 0) goto Lb
                java.lang.String r0 = r1.getName()
                goto Ld
            Lb:
                java.lang.String r0 = ""
            Ld:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public <T> T getDefaultValue(java.lang.Class<T> r2) {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue r0 = r1.getDefaultValue()
                java.lang.Object r2 = r2.cast(r0)
                return r2
        }

        @Override // net.bytebuddy.description.NamedElement.WithDescriptor
        public java.lang.String getDescriptor() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 40
                r0.append(r1)
                net.bytebuddy.description.method.ParameterList r1 = r3.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
                java.util.Iterator r1 = r1.iterator()
            L1a:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2e
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.String r2 = r2.getDescriptor()
                r0.append(r2)
                goto L1a
            L2e:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.String r1 = r1.getDescriptor()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.TypeVariableSource getEnclosingSource() {
                r1 = this;
                boolean r0 = r1.isStatic()
                if (r0 == 0) goto L9
                net.bytebuddy.description.TypeVariableSource r0 = net.bytebuddy.description.TypeVariableSource.UNDEFINED
                goto L11
            L9:
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
            L11:
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithDescriptor
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.String getGenericSignature() {
                r8 = this;
                net.bytebuddy.jar.asm.signature.SignatureWriter r0 = new net.bytebuddy.jar.asm.signature.SignatureWriter     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r0.<init>()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeList$Generic r1 = r8.getTypeVariables()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r2 = 0
                r3 = r2
            Lf:
                boolean r4 = r1.hasNext()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r5 = 1
                if (r4 == 0) goto L4f
                java.lang.Object r3 = r1.next()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                java.lang.String r4 = r3.getSymbol()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r0.visitFormalTypeParameter(r4)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.getUpperBounds()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r4 = r5
            L2c:
                boolean r6 = r3.hasNext()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r6 == 0) goto L4d
                java.lang.Object r6 = r3.next()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeDescription$Generic r6 = (net.bytebuddy.description.type.TypeDescription.Generic) r6     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r7 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r4 == 0) goto L41
                net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r0.visitClassBound()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                goto L45
            L41:
                net.bytebuddy.jar.asm.signature.SignatureVisitor r4 = r0.visitInterfaceBound()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
            L45:
                r7.<init>(r4)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r6.accept(r7)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r4 = r2
                goto L2c
            L4d:
                r3 = r5
                goto Lf
            L4f:
                net.bytebuddy.description.method.ParameterList r1 = r8.getParameters()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
            L5b:
                boolean r4 = r1.hasNext()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r4 == 0) goto L84
                java.lang.Object r4 = r1.next()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r6 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.jar.asm.signature.SignatureVisitor r7 = r0.visitParameterType()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r6.<init>(r7)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r4.accept(r6)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r3 != 0) goto L82
                net.bytebuddy.description.type.TypeDefinition$Sort r3 = r4.getSort()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                boolean r3 = r3.isNonGeneric()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r3 != 0) goto L80
                goto L82
            L80:
                r3 = r2
                goto L5b
            L82:
                r3 = r5
                goto L5b
            L84:
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r8.getReturnType()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r4 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.jar.asm.signature.SignatureVisitor r6 = r0.visitReturnType()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r4.<init>(r6)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r1.accept(r4)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r3 != 0) goto La3
                net.bytebuddy.description.type.TypeDefinition$Sort r1 = r1.getSort()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                boolean r1 = r1.isNonGeneric()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r1 != 0) goto La1
                goto La3
            La1:
                r1 = r2
                goto La4
            La3:
                r1 = r5
            La4:
                net.bytebuddy.description.type.TypeList$Generic r3 = r8.getExceptionTypes()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeDefinition$Sort r4 = net.bytebuddy.description.type.TypeDefinition.Sort.NON_GENERIC     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.ofSort(r4)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.not(r4)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.matcher.FilterableList r4 = r3.filter(r4)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeList$Generic r4 = (net.bytebuddy.description.type.TypeList.Generic) r4     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                boolean r4 = r4.isEmpty()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r4 != 0) goto Leb
                java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
            Lc2:
                boolean r4 = r3.hasNext()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r4 == 0) goto Leb
                java.lang.Object r4 = r3.next()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r6 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                net.bytebuddy.jar.asm.signature.SignatureVisitor r7 = r0.visitExceptionType()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r6.<init>(r7)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                r4.accept(r6)     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r1 != 0) goto Le9
                net.bytebuddy.description.type.TypeDefinition$Sort r1 = r4.getSort()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                boolean r1 = r1.isNonGeneric()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                if (r1 != 0) goto Le7
                goto Le9
            Le7:
                r1 = r2
                goto Lc2
            Le9:
                r1 = r5
                goto Lc2
            Leb:
                if (r1 == 0) goto Lf2
                java.lang.String r0 = r0.toString()     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
                goto Lf4
            Lf2:
                java.lang.String r0 = net.bytebuddy.description.NamedElement.WithDescriptor.NON_GENERIC_SIGNATURE     // Catch: java.lang.reflect.GenericSignatureFormatError -> Lf5
            Lf4:
                return r0
            Lf5:
                java.lang.String r0 = net.bytebuddy.description.NamedElement.WithDescriptor.NON_GENERIC_SIGNATURE
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                boolean r0 = r1.isMethod()
                if (r0 == 0) goto Lb
                java.lang.String r0 = r1.getInternalName()
                goto L17
            Lb:
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                java.lang.String r0 = r0.getName()
            L17:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public int getStackSize() {
                r2 = this;
                net.bytebuddy.description.method.ParameterList r0 = r2.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.asTypeList()
                int r0 = r0.getStackSize()
                boolean r1 = r2.isStatic()
                r1 = r1 ^ 1
                int r0 = r0 + r1
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r2 = this;
                int r0 = r2.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto L3d
            L6:
                net.bytebuddy.description.type.TypeDefinition r0 = r2.getDeclaringType()
                int r0 = r0.hashCode()
                int r0 = r0 + 17
                int r0 = r0 * 31
                java.lang.String r1 = r2.getInternalName()
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.method.ParameterList r1 = r2.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L3d:
                if (r0 != 0) goto L42
                int r0 = r2.hashCode
                goto L44
            L42:
                r2.hashCode = r0
            L44:
                return r0
        }

        @Override // net.bytebuddy.description.ByteCodeElement
        public boolean isAccessibleTo(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                boolean r0 = r1.isVirtual()
                if (r0 != 0) goto L14
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r0.isVisibleTo(r2)
                if (r0 == 0) goto L3c
            L14:
                boolean r0 = r1.isPublic()
                if (r0 != 0) goto L53
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L53
                boolean r0 = r1.isPrivate()
                if (r0 != 0) goto L3c
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r2.isSamePackage(r0)
                if (r0 != 0) goto L53
            L3c:
                boolean r0 = r1.isPrivate()
                if (r0 == 0) goto L51
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r2 = r2.isNestMateOf(r0)
                if (r2 == 0) goto L51
                goto L53
            L51:
                r2 = 0
                goto L54
            L53:
                r2 = 1
            L54:
                return r2
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isBridgeCompatible(net.bytebuddy.description.method.MethodDescription.TypeToken r7) {
                r6 = this;
                net.bytebuddy.description.method.ParameterList r0 = r6.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.asTypeList()
                net.bytebuddy.description.type.TypeList r0 = r0.asErasures()
                java.util.List r1 = r7.getParameterTypes()
                int r2 = r0.size()
                int r3 = r1.size()
                r4 = 0
                if (r2 == r3) goto L1c
                return r4
            L1c:
                r2 = r4
            L1d:
                int r3 = r0.size()
                if (r2 >= r3) goto L4f
                java.lang.Object r3 = r0.get(r2)
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                java.lang.Object r5 = r1.get(r2)
                boolean r3 = r3.equals(r5)
                if (r3 != 0) goto L4c
                java.lang.Object r3 = r0.get(r2)
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                boolean r3 = r3.isPrimitive()
                if (r3 != 0) goto L4b
                java.lang.Object r3 = r1.get(r2)
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                boolean r3 = r3.isPrimitive()
                if (r3 == 0) goto L4c
            L4b:
                return r4
            L4c:
                int r2 = r2 + 1
                goto L1d
            L4f:
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r6.getReturnType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                net.bytebuddy.description.type.TypeDescription r7 = r7.getReturnType()
                boolean r1 = r0.equals(r7)
                if (r1 != 0) goto L6d
                boolean r0 = r0.isPrimitive()
                if (r0 != 0) goto L6e
                boolean r7 = r7.isPrimitive()
                if (r7 != 0) goto L6e
            L6d:
                r4 = 1
            L6e:
                return r4
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isConstantBootstrap() {
                r1 = this;
                java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                boolean r0 = r1.isBootstrap(r0)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isConstantBootstrap(java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r2) {
                r1 = this;
                boolean r0 = r1.isConstantBootstrap()
                if (r0 == 0) goto Le
                boolean r2 = r1.isBootstrapping(r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isConstructor() {
                r2 = this;
                java.lang.String r0 = "<init>"
                java.lang.String r1 = r2.getInternalName()
                boolean r0 = r0.equals(r1)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isDefaultMethod() {
                r1 = this;
                boolean r0 = r1.isAbstract()
                if (r0 != 0) goto L18
                boolean r0 = r1.isBridge()
                if (r0 != 0) goto L18
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                boolean r0 = r0.isInterface()
                if (r0 == 0) goto L18
                r0 = 1
                goto L19
            L18:
                r0 = 0
            L19:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isDefaultValue() {
                r1 = this;
                boolean r0 = r1.isConstructor()
                if (r0 != 0) goto L26
                boolean r0 = r1.isStatic()
                if (r0 != 0) goto L26
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getReturnType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r0.isAnnotationReturnType()
                if (r0 == 0) goto L26
                net.bytebuddy.description.method.ParameterList r0 = r1.getParameters()
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L26
                r0 = 1
                goto L27
            L26:
                r0 = 0
            L27:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public boolean isDefaultValue(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r6) {
                r5 = this;
                r0 = 1
                boolean r1 = r5.isDefaultValue()
                r2 = 0
                if (r1 != 0) goto L9
                return r2
            L9:
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r5.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.Object r6 = r6.resolve()
                java.lang.Class r3 = java.lang.Boolean.TYPE
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L21
                boolean r3 = r6 instanceof java.lang.Boolean
                if (r3 != 0) goto L16f
            L21:
                java.lang.Class r3 = java.lang.Byte.TYPE
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L2d
                boolean r3 = r6 instanceof java.lang.Byte
                if (r3 != 0) goto L16f
            L2d:
                java.lang.Class r3 = java.lang.Character.TYPE
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L39
                boolean r3 = r6 instanceof java.lang.Character
                if (r3 != 0) goto L16f
            L39:
                java.lang.Class r3 = java.lang.Short.TYPE
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L45
                boolean r3 = r6 instanceof java.lang.Short
                if (r3 != 0) goto L16f
            L45:
                java.lang.Class r3 = java.lang.Integer.TYPE
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L51
                boolean r3 = r6 instanceof java.lang.Integer
                if (r3 != 0) goto L16f
            L51:
                java.lang.Class r3 = java.lang.Long.TYPE
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L5d
                boolean r3 = r6 instanceof java.lang.Long
                if (r3 != 0) goto L16f
            L5d:
                java.lang.Class r3 = java.lang.Float.TYPE
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L69
                boolean r3 = r6 instanceof java.lang.Float
                if (r3 != 0) goto L16f
            L69:
                java.lang.Class r3 = java.lang.Double.TYPE
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L75
                boolean r3 = r6 instanceof java.lang.Double
                if (r3 != 0) goto L16f
            L75:
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L81
                boolean r3 = r6 instanceof java.lang.String
                if (r3 != 0) goto L16f
            L81:
                java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
                boolean r3 = r1.isAssignableTo(r3)
                if (r3 == 0) goto L9a
                boolean r3 = r6 instanceof net.bytebuddy.description.enumeration.EnumerationDescription
                if (r3 == 0) goto L9a
                r3 = r6
                net.bytebuddy.description.enumeration.EnumerationDescription r3 = (net.bytebuddy.description.enumeration.EnumerationDescription) r3
                net.bytebuddy.description.enumeration.EnumerationDescription[] r4 = new net.bytebuddy.description.enumeration.EnumerationDescription[r0]
                r4[r2] = r3
                boolean r3 = isEnumerationType(r1, r4)
                if (r3 != 0) goto L16f
            L9a:
                java.lang.Class<java.lang.annotation.Annotation> r3 = java.lang.annotation.Annotation.class
                boolean r3 = r1.isAssignableTo(r3)
                if (r3 == 0) goto Lb3
                boolean r3 = r6 instanceof net.bytebuddy.description.annotation.AnnotationDescription
                if (r3 == 0) goto Lb3
                r3 = r6
                net.bytebuddy.description.annotation.AnnotationDescription r3 = (net.bytebuddy.description.annotation.AnnotationDescription) r3
                net.bytebuddy.description.annotation.AnnotationDescription[] r4 = new net.bytebuddy.description.annotation.AnnotationDescription[r0]
                r4[r2] = r3
                boolean r3 = isAnnotationType(r1, r4)
                if (r3 != 0) goto L16f
            Lb3:
                java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto Lbf
                boolean r3 = r6 instanceof net.bytebuddy.description.type.TypeDescription
                if (r3 != 0) goto L16f
            Lbf:
                java.lang.Class<boolean[]> r3 = boolean[].class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto Lcb
                boolean r3 = r6 instanceof boolean[]
                if (r3 != 0) goto L16f
            Lcb:
                java.lang.Class<byte[]> r3 = byte[].class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto Ld7
                boolean r3 = r6 instanceof byte[]
                if (r3 != 0) goto L16f
            Ld7:
                java.lang.Class<char[]> r3 = char[].class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto Le3
                boolean r3 = r6 instanceof char[]
                if (r3 != 0) goto L16f
            Le3:
                java.lang.Class<short[]> r3 = short[].class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto Lef
                boolean r3 = r6 instanceof short[]
                if (r3 != 0) goto L16f
            Lef:
                java.lang.Class<int[]> r3 = int[].class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto Lfb
                boolean r3 = r6 instanceof int[]
                if (r3 != 0) goto L16f
            Lfb:
                java.lang.Class<long[]> r3 = long[].class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L107
                boolean r3 = r6 instanceof long[]
                if (r3 != 0) goto L16f
            L107:
                java.lang.Class<float[]> r3 = float[].class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L113
                boolean r3 = r6 instanceof float[]
                if (r3 != 0) goto L16f
            L113:
                java.lang.Class<double[]> r3 = double[].class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L11f
                boolean r3 = r6 instanceof double[]
                if (r3 != 0) goto L16f
            L11f:
                java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
                boolean r3 = r1.represents(r3)
                if (r3 == 0) goto L12b
                boolean r3 = r6 instanceof java.lang.String[]
                if (r3 != 0) goto L16f
            L12b:
                java.lang.Class<java.lang.Enum[]> r3 = java.lang.Enum[].class
                boolean r3 = r1.isAssignableTo(r3)
                if (r3 == 0) goto L146
                boolean r3 = r6 instanceof net.bytebuddy.description.enumeration.EnumerationDescription[]
                if (r3 == 0) goto L146
                net.bytebuddy.description.type.TypeDescription r3 = r1.getComponentType()
                r4 = r6
                net.bytebuddy.description.enumeration.EnumerationDescription[] r4 = (net.bytebuddy.description.enumeration.EnumerationDescription[]) r4
                net.bytebuddy.description.enumeration.EnumerationDescription[] r4 = (net.bytebuddy.description.enumeration.EnumerationDescription[]) r4
                boolean r3 = isEnumerationType(r3, r4)
                if (r3 != 0) goto L16f
            L146:
                java.lang.Class<java.lang.annotation.Annotation[]> r3 = java.lang.annotation.Annotation[].class
                boolean r3 = r1.isAssignableTo(r3)
                if (r3 == 0) goto L161
                boolean r3 = r6 instanceof net.bytebuddy.description.annotation.AnnotationDescription[]
                if (r3 == 0) goto L161
                net.bytebuddy.description.type.TypeDescription r3 = r1.getComponentType()
                r4 = r6
                net.bytebuddy.description.annotation.AnnotationDescription[] r4 = (net.bytebuddy.description.annotation.AnnotationDescription[]) r4
                net.bytebuddy.description.annotation.AnnotationDescription[] r4 = (net.bytebuddy.description.annotation.AnnotationDescription[]) r4
                boolean r3 = isAnnotationType(r3, r4)
                if (r3 != 0) goto L16f
            L161:
                java.lang.Class<java.lang.Class[]> r3 = java.lang.Class[].class
                boolean r1 = r1.represents(r3)
                if (r1 == 0) goto L16e
                boolean r6 = r6 instanceof net.bytebuddy.description.type.TypeDescription[]
                if (r6 == 0) goto L16e
                goto L16f
            L16e:
                r0 = r2
            L16f:
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public boolean isGenerified() {
                r1 = this;
                net.bytebuddy.description.type.TypeList$Generic r0 = r1.getTypeVariables()
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public boolean isInferrable() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isInvokableOn(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                boolean r0 = r1.isStatic()
                if (r0 != 0) goto L37
                boolean r0 = r1.isTypeInitializer()
                if (r0 != 0) goto L37
                boolean r0 = r1.isVisibleTo(r2)
                if (r0 == 0) goto L37
                boolean r0 = r1.isVirtual()
                if (r0 == 0) goto L27
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r2 = r0.isAssignableFrom(r2)
                if (r2 == 0) goto L37
                goto L35
            L27:
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r2 = r0.equals(r2)
                if (r2 == 0) goto L37
            L35:
                r2 = 1
                goto L38
            L37:
                r2 = 0
            L38:
                return r2
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isInvokeBootstrap() {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getReturnType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r1 = r3.isMethod()
                if (r1 == 0) goto L2a
                boolean r1 = r3.isStatic()
                if (r1 == 0) goto L44
                net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.CALL_SITE
                net.bytebuddy.description.type.TypeDescription r2 = r1.getTypeStub()
                boolean r2 = r2.isAssignableFrom(r0)
                if (r2 != 0) goto L2a
                net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                boolean r0 = r1.isAssignableTo(r0)
                if (r0 == 0) goto L44
            L2a:
                boolean r0 = r3.isConstructor()
                if (r0 == 0) goto L46
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.CALL_SITE
                net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                net.bytebuddy.description.type.TypeDefinition r1 = r3.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 != 0) goto L46
            L44:
                r0 = 0
                return r0
            L46:
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_TYPE
                net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                boolean r0 = r3.isBootstrap(r0)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isInvokeBootstrap(java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r2) {
                r1 = this;
                boolean r0 = r1.isInvokeBootstrap()
                if (r0 == 0) goto Le
                boolean r2 = r1.isBootstrapping(r2)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isMethod() {
                r1 = this;
                boolean r0 = r1.isConstructor()
                if (r0 != 0) goto Le
                boolean r0 = r1.isTypeInitializer()
                if (r0 != 0) goto Le
                r0 = 1
                goto Lf
            Le:
                r0 = 0
            Lf:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isSpecializableFor(net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                boolean r0 = r2.isStatic()
                r1 = 0
                if (r0 == 0) goto L8
                return r1
            L8:
                boolean r0 = r2.isPrivate()
                if (r0 != 0) goto L2b
                boolean r0 = r2.isConstructor()
                if (r0 == 0) goto L15
                goto L2b
            L15:
                boolean r0 = r2.isAbstract()
                if (r0 != 0) goto L2a
                net.bytebuddy.description.type.TypeDefinition r0 = r2.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r3 = r0.isAssignableFrom(r3)
                if (r3 == 0) goto L2a
                r1 = 1
            L2a:
                return r1
            L2b:
                net.bytebuddy.description.type.TypeDefinition r0 = r2.getDeclaringType()
                boolean r3 = r0.equals(r3)
                return r3
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isTypeInitializer() {
                r2 = this;
                java.lang.String r0 = "<clinit>"
                java.lang.String r1 = r2.getInternalName()
                boolean r0 = r0.equals(r1)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean isVirtual() {
                r1 = this;
                boolean r0 = r1.isConstructor()
                if (r0 != 0) goto L1a
                boolean r0 = r1.isPrivate()
                if (r0 != 0) goto L1a
                boolean r0 = r1.isStatic()
                if (r0 != 0) goto L1a
                boolean r0 = r1.isTypeInitializer()
                if (r0 != 0) goto L1a
                r0 = 1
                goto L1b
            L1a:
                r0 = 0
            L1b:
                return r0
        }

        @Override // net.bytebuddy.description.ByteCodeElement
        public boolean isVisibleTo(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                boolean r0 = r1.isVirtual()
                if (r0 != 0) goto L14
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r0.isVisibleTo(r2)
                if (r0 == 0) goto L65
            L14:
                boolean r0 = r1.isPublic()
                if (r0 != 0) goto L67
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L67
                boolean r0 = r1.isProtected()
                if (r0 == 0) goto L3c
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r0.isAssignableFrom(r2)
                if (r0 != 0) goto L67
            L3c:
                boolean r0 = r1.isPrivate()
                if (r0 != 0) goto L50
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r2.isSamePackage(r0)
                if (r0 != 0) goto L67
            L50:
                boolean r0 = r1.isPrivate()
                if (r0 == 0) goto L65
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r2 = r2.isNestMateOf(r0)
                if (r2 == 0) goto L65
                goto L67
            L65:
                r2 = 0
                goto L68
            L67:
                r2 = 1
            L68:
                return r2
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean represents(java.lang.reflect.Constructor<?> r2) {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                r0.<init>(r2)
                boolean r2 = r1.equals(r0)
                return r2
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public boolean represents(java.lang.reflect.Method r2) {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r0.<init>(r2)
                boolean r2 = r1.equals(r0)
                return r2
        }

        @Override // net.bytebuddy.description.NamedElement.WithGenericName
        public java.lang.String toGenericString() {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r7.getModifiers()
                r1 = r1 & 1343(0x53f, float:1.882E-42)
                r2 = 32
                if (r1 == 0) goto L19
                java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
                r0.append(r1)
                r0.append(r2)
            L19:
                boolean r1 = r7.isMethod()
                if (r1 == 0) goto L41
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r7.getReturnType()
                java.lang.String r1 = r1.getActualName()
                r0.append(r1)
                r0.append(r2)
                net.bytebuddy.description.type.TypeDefinition r1 = r7.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.String r1 = r1.getActualName()
                r0.append(r1)
                r1 = 46
                r0.append(r1)
            L41:
                java.lang.String r1 = r7.getName()
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                net.bytebuddy.description.method.ParameterList r1 = r7.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                java.util.Iterator r1 = r1.iterator()
                r2 = 1
                r3 = r2
            L5b:
                boolean r4 = r1.hasNext()
                r5 = 0
                r6 = 44
                if (r4 == 0) goto L79
                java.lang.Object r4 = r1.next()
                net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                if (r3 != 0) goto L70
                r0.append(r6)
                goto L71
            L70:
                r3 = r5
            L71:
                java.lang.String r4 = r4.getActualName()
                r0.append(r4)
                goto L5b
            L79:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeList$Generic r1 = r7.getExceptionTypes()
                boolean r3 = r1.isEmpty()
                if (r3 != 0) goto Lac
                java.lang.String r3 = " throws "
                r0.append(r3)
                java.util.Iterator r1 = r1.iterator()
            L91:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto Lac
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                if (r2 != 0) goto La3
                r0.append(r6)
                goto La4
            La3:
                r2 = r5
            La4:
                java.lang.String r3 = r3.getActualName()
                r0.append(r3)
                goto L91
            Lac:
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource.AbstractBase
        public java.lang.String toSafeString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r3.getModifiers()
                r1 = r1 & 1343(0x53f, float:1.882E-42)
                r2 = 32
                if (r1 == 0) goto L19
                java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
                r0.append(r1)
                r0.append(r2)
            L19:
                boolean r1 = r3.isMethod()
                if (r1 == 0) goto L45
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.String r1 = r1.getActualName()
                r0.append(r1)
                r0.append(r2)
                net.bytebuddy.description.type.TypeDefinition r1 = r3.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.String r1 = r1.getActualName()
                r0.append(r1)
                r1 = 46
                r0.append(r1)
            L45:
                java.lang.String r1 = r3.getName()
                r0.append(r1)
                java.lang.String r1 = "(?)"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public java.lang.String toString() {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r7.getModifiers()
                r1 = r1 & 1343(0x53f, float:1.882E-42)
                r2 = 32
                if (r1 == 0) goto L19
                java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
                r0.append(r1)
                r0.append(r2)
            L19:
                boolean r1 = r7.isMethod()
                if (r1 == 0) goto L45
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r7.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.String r1 = r1.getActualName()
                r0.append(r1)
                r0.append(r2)
                net.bytebuddy.description.type.TypeDefinition r1 = r7.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.String r1 = r1.getActualName()
                r0.append(r1)
                r1 = 46
                r0.append(r1)
            L45:
                java.lang.String r1 = r7.getName()
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                net.bytebuddy.description.method.ParameterList r1 = r7.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
                java.util.Iterator r1 = r1.iterator()
                r2 = 1
                r3 = r2
            L63:
                boolean r4 = r1.hasNext()
                r5 = 0
                r6 = 44
                if (r4 == 0) goto L81
                java.lang.Object r4 = r1.next()
                net.bytebuddy.description.type.TypeDescription r4 = (net.bytebuddy.description.type.TypeDescription) r4
                if (r3 != 0) goto L78
                r0.append(r6)
                goto L79
            L78:
                r3 = r5
            L79:
                java.lang.String r4 = r4.getActualName()
                r0.append(r4)
                goto L63
            L81:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeList$Generic r1 = r7.getExceptionTypes()
                net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
                boolean r3 = r1.isEmpty()
                if (r3 != 0) goto Lb8
                java.lang.String r3 = " throws "
                r0.append(r3)
                java.util.Iterator r1 = r1.iterator()
            L9d:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto Lb8
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                if (r2 != 0) goto Laf
                r0.append(r6)
                goto Lb0
            Laf:
                r2 = r5
            Lb0:
                java.lang.String r3 = r3.getActualName()
                r0.append(r3)
                goto L9d
            Lb8:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ForLoadedConstructor extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.ForLoadedExecutable<java.lang.reflect.Constructor<?>> implements net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource {
        private transient /* synthetic */ net.bytebuddy.description.annotation.AnnotationList declaredAnnotations;
        private transient /* synthetic */ java.lang.annotation.Annotation[][] parameterAnnotations;
        private transient /* synthetic */ net.bytebuddy.description.method.ParameterList parameters;

        public ForLoadedConstructor(java.lang.reflect.Constructor<?> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("declaredAnnotations")
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList r0 = r2.declaredAnnotations
                if (r0 == 0) goto L6
                r0 = 0
                goto L13
            L6:
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                T extends java.lang.reflect.AnnotatedElement r1 = r2.executable
                java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
                java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
                r0.<init>(r1)
            L13:
                if (r0 != 0) goto L18
                net.bytebuddy.description.annotation.AnnotationList r0 = r2.declaredAnnotations
                goto L1a
            L18:
                r2.declaredAnnotations = r0
            L1a:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                java.lang.Class r0 = r0.getDeclaringClass()
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        @net.bytebuddy.utility.nullability.AlwaysNull
        public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithDescriptor
        public java.lang.String getDescriptor() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                java.lang.String r0 = net.bytebuddy.jar.asm.Type.getConstructorDescriptor(r0)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                r2 = this;
                net.bytebuddy.description.type.TypeList$Generic$OfConstructorExceptionTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$OfConstructorExceptionTypes
                T extends java.lang.reflect.AnnotatedElement r1 = r2.executable
                java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getInternalName() {
                r1 = this;
                java.lang.String r0 = "<init>"
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                int r0 = r0.getModifiers()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("parameterAnnotations")
        public java.lang.annotation.Annotation[][] getParameterAnnotations() {
                r1 = this;
                java.lang.annotation.Annotation[][] r0 = r1.parameterAnnotations
                if (r0 == 0) goto L6
                r0 = 0
                goto Le
            L6:
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
            Le:
                if (r0 != 0) goto L15
                java.lang.annotation.Annotation[][] r0 = r1.parameterAnnotations
                java.lang.annotation.Annotation[][] r0 = (java.lang.annotation.Annotation[][]) r0
                goto L17
            L15:
                r1.parameterAnnotations = r0
            L17:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("parameters")
        public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                r1 = this;
                net.bytebuddy.description.method.ParameterList r0 = r1.parameters
                if (r0 == 0) goto L6
                r0 = 0
                goto Le
            L6:
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                net.bytebuddy.description.method.ParameterList r0 = net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.of(r0, r1)
            Le:
                if (r0 != 0) goto L13
                net.bytebuddy.description.method.ParameterList r0 = r1.parameters
                goto L15
            L13:
                r1.parameters = r0
            L15:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.ForLoadedExecutable, net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic getReceiverType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getReceiverType()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                r1 = this;
                java.lang.Class r0 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.GenericDeclaration r0 = (java.lang.reflect.GenericDeclaration) r0
                net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeList.Generic.ForLoadedTypes.OfTypeVariables.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean isConstructor() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.AbstractBase, net.bytebuddy.description.ModifierReviewable
        public boolean isSynthetic() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                boolean r0 = r0.isSynthetic()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean isTypeInitializer() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean represents(java.lang.reflect.Constructor<?> r2) {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L18
                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                r0.<init>(r2)
                boolean r2 = r1.equals(r0)
                if (r2 == 0) goto L16
                goto L18
            L16:
                r2 = 0
                goto L19
            L18:
                r2 = 1
            L19:
                return r2
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean represents(java.lang.reflect.Method r1) {
                r0 = this;
                r1 = 0
                return r1
        }
    }

    public static class ForLoadedMethod extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.ForLoadedExecutable<java.lang.reflect.Method> implements net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource {
        private transient /* synthetic */ net.bytebuddy.description.annotation.AnnotationList declaredAnnotations;
        private transient /* synthetic */ java.lang.annotation.Annotation[][] parameterAnnotations;
        private transient /* synthetic */ net.bytebuddy.description.method.ParameterList parameters;

        public ForLoadedMethod(java.lang.reflect.Method r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("declaredAnnotations")
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList r0 = r2.declaredAnnotations
                if (r0 == 0) goto L6
                r0 = 0
                goto L13
            L6:
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                T extends java.lang.reflect.AnnotatedElement r1 = r2.executable
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
                r0.<init>(r1)
            L13:
                if (r0 != 0) goto L18
                net.bytebuddy.description.annotation.AnnotationList r0 = r2.declaredAnnotations
                goto L1a
            L18:
                r2.declaredAnnotations = r0
            L1a:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                java.lang.Class r0 = r0.getDeclaringClass()
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                r2 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r2.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                java.lang.Object r0 = r0.getDefaultValue()
                if (r0 != 0) goto Ld
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                goto L19
            Ld:
                T extends java.lang.reflect.AnnotatedElement r1 = r2.executable
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                java.lang.Class r1 = r1.getReturnType()
                net.bytebuddy.description.annotation.AnnotationValue r0 = net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.asValue(r0, r1)
            L19:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithDescriptor
        public java.lang.String getDescriptor() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                java.lang.String r0 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r0)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                r2 = this;
                boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                if (r0 == 0) goto L12
                net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
                T extends java.lang.reflect.AnnotatedElement r1 = r2.executable
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                java.lang.Class[] r1 = r1.getExceptionTypes()
                r0.<init>(r1)
                return r0
            L12:
                net.bytebuddy.description.type.TypeList$Generic$OfMethodExceptionTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$OfMethodExceptionTypes
                T extends java.lang.reflect.AnnotatedElement r1 = r2.executable
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getInternalName() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                java.lang.String r0 = r0.getName()
                return r0
        }

        public java.lang.reflect.Method getLoadedMethod() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                int r0 = r0.getModifiers()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("parameterAnnotations")
        public java.lang.annotation.Annotation[][] getParameterAnnotations() {
                r1 = this;
                java.lang.annotation.Annotation[][] r0 = r1.parameterAnnotations
                if (r0 == 0) goto L6
                r0 = 0
                goto Le
            L6:
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
            Le:
                if (r0 != 0) goto L15
                java.lang.annotation.Annotation[][] r0 = r1.parameterAnnotations
                java.lang.annotation.Annotation[][] r0 = (java.lang.annotation.Annotation[][]) r0
                goto L17
            L15:
                r1.parameterAnnotations = r0
            L17:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("parameters")
        public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                r1 = this;
                net.bytebuddy.description.method.ParameterList r0 = r1.parameters
                if (r0 == 0) goto L6
                r0 = 0
                goto Le
            L6:
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                net.bytebuddy.description.method.ParameterList r0 = net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.of(r0, r1)
            Le:
                if (r0 != 0) goto L13
                net.bytebuddy.description.method.ParameterList r0 = r1.parameters
                goto L15
            L13:
                r1.parameters = r0
            L15:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.ForLoadedExecutable, net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic getReceiverType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getReceiverType()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                r2 = this;
                boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                if (r0 == 0) goto L11
                T extends java.lang.reflect.AnnotatedElement r0 = r2.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                java.lang.Class r0 = r0.getReturnType()
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                return r0
            L11:
                net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$ForLoadedReturnType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$ForLoadedReturnType
                T extends java.lang.reflect.AnnotatedElement r1 = r2.executable
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r1 = this;
                boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                if (r0 == 0) goto La
                net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                r0.<init>()
                return r0
            La:
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.GenericDeclaration r0 = (java.lang.reflect.GenericDeclaration) r0
                net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeList.Generic.ForLoadedTypes.OfTypeVariables.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.AbstractBase, net.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isBridge() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                boolean r0 = r0.isBridge()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean isConstructor() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.AbstractBase, net.bytebuddy.description.ModifierReviewable
        public boolean isSynthetic() {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                boolean r0 = r0.isSynthetic()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean isTypeInitializer() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean represents(java.lang.reflect.Constructor<?> r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean represents(java.lang.reflect.Method r2) {
                r1 = this;
                T extends java.lang.reflect.AnnotatedElement r0 = r1.executable
                java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                boolean r0 = r0.equals(r2)
                if (r0 != 0) goto L18
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r0.<init>(r2)
                boolean r2 = r1.equals(r0)
                if (r2 == 0) goto L16
                goto L18
            L16:
                r2 = 0
                goto L19
            L18:
                r2 = 1
            L19:
                return r2
        }
    }

    public interface InDefinedShape extends net.bytebuddy.description.method.MethodDescription {

        public static abstract class AbstractBase extends net.bytebuddy.description.method.MethodDescription.AbstractBase implements net.bytebuddy.description.method.MethodDescription.InDefinedShape {

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.Executable")
            public interface Executable {
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults
                @net.bytebuddy.utility.nullability.MaybeNull
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedReceiverType")
                java.lang.reflect.AnnotatedElement getAnnotatedReceiverType(java.lang.Object r1);
            }

            public static abstract class ForLoadedExecutable<T extends java.lang.reflect.AnnotatedElement> extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase {
                private static final boolean ACCESS_CONTROLLER = false;
                protected static final net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.Executable EXECUTABLE = null;
                protected final T executable;

                static {
                        r0 = 0
                        java.lang.String r1 = "java.security.AccessController"
                        r2 = 0
                        java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        java.lang.String r1 = "net.bytebuddy.securitymanager"
                        java.lang.String r2 = "true"
                        java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.ForLoadedExecutable.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                        goto L19
                    L16:
                        r0 = 1
                    L17:
                        net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.ForLoadedExecutable.ACCESS_CONTROLLER = r0
                    L19:
                        java.lang.Class<net.bytebuddy.description.method.MethodDescription$InDefinedShape$AbstractBase$Executable> r0 = net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.Executable.class
                        java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                        java.lang.Object r0 = doPrivileged(r0)
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape$AbstractBase$Executable r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.Executable) r0
                        net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.ForLoadedExecutable.EXECUTABLE = r0
                        return
                }

                public ForLoadedExecutable(T r1) {
                        r0 = this;
                        r0.<init>()
                        r0.executable = r1
                        return
                }

                @net.bytebuddy.build.AccessControllerPlugin.Enhance
                private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                        boolean r0 = net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.ForLoadedExecutable.ACCESS_CONTROLLER
                        if (r0 == 0) goto L9
                        java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                        return r1
                    L9:
                        java.lang.Object r1 = r1.run()
                        return r1
                }

                @Override // net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase, net.bytebuddy.description.ByteCodeElement.TypeDependant
                public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.TypeDependant asDefined() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = super.asDefined()
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase, net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeDescription.Generic getReceiverType() {
                        r2 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape$AbstractBase$Executable r0 = net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase.ForLoadedExecutable.EXECUTABLE
                        T extends java.lang.reflect.AnnotatedElement r1 = r2.executable
                        java.lang.reflect.AnnotatedElement r0 = r0.getAnnotatedReceiverType(r1)
                        if (r0 != 0) goto Lf
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getReceiverType()
                        goto L13
                    Lf:
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDefinition.Sort.describeAnnotated(r0)
                    L13:
                        return r0
                }
            }

            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
            public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.TypeDependant asDefined() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.asDefined()
                    return r0
            }

            @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape asDefined() {
                    r0 = this;
                    return r0
            }

            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.type.TypeDescription.Generic getReceiverType() {
                    r2 = this;
                    boolean r0 = r2.isStatic()
                    if (r0 == 0) goto L9
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                    return r0
                L9:
                    boolean r0 = r2.isConstructor()
                    if (r0 == 0) goto L32
                    net.bytebuddy.description.type.TypeDescription r0 = r2.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription r1 = r2.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription r1 = r1.getEnclosingType()
                    if (r1 != 0) goto L22
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.ForGenerifiedErasure.of(r0)
                    return r0
                L22:
                    boolean r0 = r0.isStatic()
                    if (r0 == 0) goto L2d
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.asGenericType()
                    goto L31
                L2d:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.ForGenerifiedErasure.of(r1)
                L31:
                    return r0
                L32:
                    net.bytebuddy.description.type.TypeDescription r0 = r2.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.ForGenerifiedErasure.of(r0)
                    return r0
            }
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        net.bytebuddy.description.type.TypeDescription getDeclaringType();

        net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters();
    }

    public interface InGenericShape extends net.bytebuddy.description.method.MethodDescription {
        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        net.bytebuddy.description.type.TypeDescription.Generic getDeclaringType();

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
        net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InGenericShape> getParameters();
    }

    public static class Latent extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> declaredAnnotations;
        private final net.bytebuddy.description.type.TypeDescription declaringType;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final net.bytebuddy.description.annotation.AnnotationValue<?, ?> defaultValue;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> exceptionTypes;
        private final java.lang.String internalName;
        private final int modifiers;
        private final java.util.List<? extends net.bytebuddy.description.method.ParameterDescription.Token> parameterTokens;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final net.bytebuddy.description.type.TypeDescription.Generic receiverType;
        private final net.bytebuddy.description.type.TypeDescription.Generic returnType;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> typeVariables;

        public static class TypeInitializer extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase {
            private final net.bytebuddy.description.type.TypeDescription typeDescription;

            public TypeInitializer(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.typeDescription = r1
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                    r0.<init>()
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
            @javax.annotation.Nonnull
            public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
            @javax.annotation.Nonnull
            public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription
            @net.bytebuddy.utility.nullability.AlwaysNull
            public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription
            public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                    r0.<init>()
                    return r0
            }

            @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
            public java.lang.String getInternalName() {
                    r1 = this;
                    java.lang.String r0 = "<clinit>"
                    return r0
            }

            @Override // net.bytebuddy.description.ModifierReviewable
            public int getModifiers() {
                    r1 = this;
                    r0 = 8
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
            public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                    r1 = this;
                    net.bytebuddy.description.method.ParameterList$Empty r0 = new net.bytebuddy.description.method.ParameterList$Empty
                    r0.<init>()
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription
            public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                    r1 = this;
                    java.lang.Class r0 = java.lang.Void.TYPE
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                    return r0
            }

            @Override // net.bytebuddy.description.TypeVariableSource
            public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                    r0.<init>()
                    return r0
            }
        }

        public Latent(net.bytebuddy.description.type.TypeDescription r1, java.lang.String r2, int r3, java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r4, net.bytebuddy.description.type.TypeDescription.Generic r5, java.util.List<? extends net.bytebuddy.description.method.ParameterDescription.Token> r6, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r7, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r8, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.annotation.AnnotationValue<?, ?> r9, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r10) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.internalName = r2
                r0.modifiers = r3
                r0.typeVariables = r4
                r0.returnType = r5
                r0.parameterTokens = r6
                r0.exceptionTypes = r7
                r0.declaredAnnotations = r8
                r0.defaultValue = r9
                r0.receiverType = r10
                return
        }

        public Latent(net.bytebuddy.description.type.TypeDescription r12, net.bytebuddy.description.method.MethodDescription.Token r13) {
                r11 = this;
                java.lang.String r2 = r13.getName()
                int r3 = r13.getModifiers()
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r4 = r13.getTypeVariableTokens()
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r13.getReturnType()
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r6 = r13.getParameterTokens()
                net.bytebuddy.description.type.TypeList$Generic r7 = r13.getExceptionTypes()
                net.bytebuddy.description.annotation.AnnotationList r8 = r13.getAnnotations()
                net.bytebuddy.description.annotation.AnnotationValue r9 = r13.getDefaultValue()
                net.bytebuddy.description.type.TypeDescription$Generic r10 = r13.getReceiverType()
                r0 = r11
                r1 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.declaredAnnotations
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.declaringType
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = r1.defaultValue
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r0 = r1.exceptionTypes
                net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeList.Generic.ForDetachedTypes.attach(r1, r0)
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getInternalName() {
                r1 = this;
                java.lang.String r0 = r1.internalName
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                int r0 = r1.modifiers
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
        public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                r2 = this;
                net.bytebuddy.description.method.ParameterList$ForTokens r0 = new net.bytebuddy.description.method.ParameterList$ForTokens
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r1 = r2.parameterTokens
                r0.<init>(r2, r1)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase, net.bytebuddy.description.method.MethodDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription.Generic getReceiverType() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.receiverType
                if (r0 != 0) goto L9
                net.bytebuddy.description.type.TypeDescription$Generic r0 = super.getReceiverType()
                goto L13
            L9:
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r2)
                java.lang.Object r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
            L13:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.returnType
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r2)
                java.lang.Object r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r0 = r1.typeVariables
                net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeList.Generic.ForDetachedTypes.attachVariables(r1, r0)
                return r0
        }
    }

    public static class SignatureToken {
        private transient /* synthetic */ int hashCode;
        private final java.lang.String name;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription> parameterTypes;
        private final net.bytebuddy.description.type.TypeDescription returnType;

        public SignatureToken(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.returnType = r2
                r0.parameterTypes = r3
                return
        }

        public SignatureToken(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.type.TypeDescription... r3) {
                r0 = this;
                java.util.List r3 = java.util.Arrays.asList(r3)
                r0.<init>(r1, r2, r3)
                return
        }

        public net.bytebuddy.description.method.MethodDescription.TypeToken asTypeToken() {
                r3 = this;
                net.bytebuddy.description.method.MethodDescription$TypeToken r0 = new net.bytebuddy.description.method.MethodDescription$TypeToken
                net.bytebuddy.description.type.TypeDescription r1 = r3.returnType
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r2 = r3.parameterTypes
                r0.<init>(r1, r2)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.description.method.MethodDescription.SignatureToken
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.method.MethodDescription$SignatureToken r5 = (net.bytebuddy.description.method.MethodDescription.SignatureToken) r5
                java.lang.String r1 = r4.name
                java.lang.String r3 = r5.name
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L2b
                net.bytebuddy.description.type.TypeDescription r1 = r4.returnType
                net.bytebuddy.description.type.TypeDescription r3 = r5.returnType
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L2b
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r4.parameterTypes
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r5 = r5.parameterTypes
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L2b
                goto L2c
            L2b:
                r0 = r2
            L2c:
                return r0
        }

        public java.lang.String getDescriptor() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 40
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r3.parameterTypes
                java.util.Iterator r1 = r1.iterator()
            L10:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.String r2 = r2.getDescriptor()
                r0.append(r2)
                goto L10
            L24:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r3.returnType
                java.lang.String r1 = r1.getDescriptor()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public java.util.List<net.bytebuddy.description.type.TypeDescription> getParameterTypes() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r0 = r1.parameterTypes
                return r0
        }

        public net.bytebuddy.description.type.TypeDescription getReturnType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.returnType
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r2 = this;
                int r0 = r2.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto L1e
            L6:
                java.lang.String r0 = r2.name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.returnType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r2.parameterTypes
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L1e:
                if (r0 != 0) goto L23
                int r0 = r2.hashCode
                goto L25
            L23:
                r2.hashCode = r0
            L25:
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                net.bytebuddy.description.type.TypeDescription r1 = r5.returnType
                r0.append(r1)
                r1 = 32
                r0.append(r1)
                java.lang.String r1 = r5.name
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r5.parameterTypes
                java.util.Iterator r1 = r1.iterator()
                r2 = 1
            L20:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L39
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                if (r2 == 0) goto L30
                r2 = 0
                goto L35
            L30:
                r4 = 44
                r0.append(r4)
            L35:
                r0.append(r3)
                goto L20
            L39:
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class Token implements net.bytebuddy.description.ByteCodeElement.Token<net.bytebuddy.description.method.MethodDescription.Token> {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final net.bytebuddy.description.annotation.AnnotationValue<?, ?> defaultValue;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> exceptionTypes;
        private transient /* synthetic */ int hashCode;
        private final int modifiers;
        private final java.lang.String name;
        private final java.util.List<? extends net.bytebuddy.description.method.ParameterDescription.Token> parameterTokens;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final net.bytebuddy.description.type.TypeDescription.Generic receiverType;
        private final net.bytebuddy.description.type.TypeDescription.Generic returnType;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> typeVariableTokens;

        public Token(int r3) {
                r2 = this;
                java.lang.Class r0 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                java.lang.String r1 = "<init>"
                r2.<init>(r1, r3, r0)
                return
        }

        public Token(java.lang.String r1, int r2, java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r3, net.bytebuddy.description.type.TypeDescription.Generic r4, java.util.List<? extends net.bytebuddy.description.method.ParameterDescription.Token> r5, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r6, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r7, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.annotation.AnnotationValue<?, ?> r8, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r9) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.modifiers = r2
                r0.typeVariableTokens = r3
                r0.returnType = r4
                r0.parameterTokens = r5
                r0.exceptionTypes = r6
                r0.annotations = r7
                r0.defaultValue = r8
                r0.receiverType = r9
                return
        }

        public Token(java.lang.String r2, int r3, net.bytebuddy.description.type.TypeDescription.Generic r4) {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r1.<init>(r2, r3, r4, r0)
                return
        }

        public Token(java.lang.String r11, int r12, net.bytebuddy.description.type.TypeDescription.Generic r13, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r14) {
                r10 = this;
                java.util.List r3 = java.util.Collections.emptyList()
                net.bytebuddy.description.method.ParameterDescription$Token$TypeList r5 = new net.bytebuddy.description.method.ParameterDescription$Token$TypeList
                r5.<init>(r14)
                java.util.List r6 = java.util.Collections.emptyList()
                java.util.List r7 = java.util.Collections.emptyList()
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r8 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                net.bytebuddy.description.type.TypeDescription$Generic r9 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                r0 = r10
                r1 = r11
                r2 = r12
                r4 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        @Override // net.bytebuddy.description.ByteCodeElement.Token
        public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.Token accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor r1) {
                r0 = this;
                net.bytebuddy.description.method.MethodDescription$Token r1 = r0.accept(r1)
                return r1
        }

        @Override // net.bytebuddy.description.ByteCodeElement.Token
        public net.bytebuddy.description.method.MethodDescription.Token accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r12) {
                r11 = this;
                net.bytebuddy.description.method.MethodDescription$Token r10 = new net.bytebuddy.description.method.MethodDescription$Token
                java.lang.String r1 = r11.name
                int r2 = r11.modifiers
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r0 = r11.getTypeVariableTokens()
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r3 = r0.accept(r12)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r11.returnType
                java.lang.Object r0 = r0.accept(r12)
                r4 = r0
                net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r0 = r11.getParameterTokens()
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r5 = r0.accept(r12)
                net.bytebuddy.description.type.TypeList$Generic r0 = r11.getExceptionTypes()
                net.bytebuddy.description.type.TypeList$Generic r6 = r0.accept(r12)
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r7 = r11.annotations
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r8 = r11.defaultValue
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r11.receiverType
                if (r0 != 0) goto L33
                net.bytebuddy.description.type.TypeDescription$Generic r12 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
            L31:
                r9 = r12
                goto L3a
            L33:
                java.lang.Object r12 = r0.accept(r12)
                net.bytebuddy.description.type.TypeDescription$Generic r12 = (net.bytebuddy.description.type.TypeDescription.Generic) r12
                goto L31
            L3a:
                r0 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return r10
        }

        public net.bytebuddy.description.method.MethodDescription.SignatureToken asSignatureToken(net.bytebuddy.description.type.TypeDescription r5) {
                r4 = this;
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reducing r0 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reducing
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r1 = r4.typeVariableTokens
                r0.<init>(r5, r1)
                java.util.ArrayList r5 = new java.util.ArrayList
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r1 = r4.parameterTokens
                int r1 = r1.size()
                r5.<init>(r1)
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r1 = r4.parameterTokens
                java.util.Iterator r1 = r1.iterator()
            L18:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L30
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.method.ParameterDescription$Token r2 = (net.bytebuddy.description.method.ParameterDescription.Token) r2
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                java.lang.Object r2 = r2.accept(r0)
                r5.add(r2)
                goto L18
            L30:
                net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = new net.bytebuddy.description.method.MethodDescription$SignatureToken
                java.lang.String r2 = r4.name
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r4.returnType
                java.lang.Object r0 = r3.accept(r0)
                net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                r1.<init>(r2, r0, r5)
                return r1
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L7c
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L13
                goto L7c
            L13:
                net.bytebuddy.description.method.MethodDescription$Token r5 = (net.bytebuddy.description.method.MethodDescription.Token) r5
                int r2 = r4.modifiers
                int r3 = r5.modifiers
                if (r2 != r3) goto L7a
                java.lang.String r2 = r4.name
                java.lang.String r3 = r5.name
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L7a
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r2 = r4.typeVariableTokens
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r3 = r5.typeVariableTokens
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L7a
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.returnType
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.returnType
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L7a
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r2 = r4.parameterTokens
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r3 = r5.parameterTokens
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L7a
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r4.exceptionTypes
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r3 = r5.exceptionTypes
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L7a
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r4.annotations
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3 = r5.annotations
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L7a
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2 = r4.defaultValue
                if (r2 == 0) goto L64
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r3 = r5.defaultValue
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L7a
                goto L68
            L64:
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2 = r5.defaultValue
                if (r2 != 0) goto L7a
            L68:
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.receiverType
                if (r2 == 0) goto L75
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.receiverType
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L7a
                goto L7b
            L75:
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.receiverType
                if (r5 != 0) goto L7a
                goto L7b
            L7a:
                r0 = r1
            L7b:
                return r0
            L7c:
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationList getAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                r0.<init>(r1)
                return r0
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                r1 = this;
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = r1.defaultValue
                return r0
        }

        public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                r2 = this;
                net.bytebuddy.description.type.TypeList$Generic$Explicit r0 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.exceptionTypes
                r0.<init>(r1)
                return r0
        }

        public int getModifiers() {
                r1 = this;
                int r0 = r1.modifiers
                return r0
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.method.ParameterDescription.Token> getParameterTokens() {
                r2 = this;
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r0 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r1 = r2.parameterTokens
                r0.<init>(r1)
                return r0
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription.Generic getReceiverType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.receiverType
                return r0
        }

        public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.returnType
                return r0
        }

        public net.bytebuddy.description.ByteCodeElement.Token.TokenList<net.bytebuddy.description.type.TypeVariableToken> getTypeVariableTokens() {
                r2 = this;
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r0 = new net.bytebuddy.description.ByteCodeElement$Token$TokenList
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r1 = r2.typeVariableTokens
                r0.<init>(r1)
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r3 = this;
                int r0 = r3.hashCode
                r1 = 0
                if (r0 == 0) goto L6
                goto L56
            L6:
                java.lang.String r0 = r3.name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r2 = r3.modifiers
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r2 = r3.typeVariableTokens
                int r2 = r2.hashCode()
                int r0 = r0 + r2
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r3.returnType
                int r2 = r2.hashCode()
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r2 = r3.parameterTokens
                int r2 = r2.hashCode()
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r3.exceptionTypes
                int r2 = r2.hashCode()
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r3.annotations
                int r2 = r2.hashCode()
                int r0 = r0 + r2
                int r0 = r0 * 31
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2 = r3.defaultValue
                if (r2 == 0) goto L49
                int r2 = r2.hashCode()
                goto L4a
            L49:
                r2 = r1
            L4a:
                int r0 = r0 + r2
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r3.receiverType
                if (r2 == 0) goto L55
                int r1 = r2.hashCode()
            L55:
                int r1 = r1 + r0
            L56:
                if (r1 != 0) goto L5b
                int r1 = r3.hashCode
                goto L5d
            L5b:
                r3.hashCode = r1
            L5d:
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "MethodDescription.Token{name='"
                r0.append(r1)
                java.lang.String r1 = r2.name
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r1 = ", modifiers="
                r0.append(r1)
                int r1 = r2.modifiers
                r0.append(r1)
                java.lang.String r1 = ", typeVariableTokens="
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r1 = r2.typeVariableTokens
                r0.append(r1)
                java.lang.String r1 = ", returnType="
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.returnType
                r0.append(r1)
                java.lang.String r1 = ", parameterTokens="
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.method.ParameterDescription$Token> r1 = r2.parameterTokens
                r0.append(r1)
                java.lang.String r1 = ", exceptionTypes="
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.exceptionTypes
                r0.append(r1)
                java.lang.String r1 = ", annotations="
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                r0.append(r1)
                java.lang.String r1 = ", defaultValue="
                r0.append(r1)
                net.bytebuddy.description.annotation.AnnotationValue<?, ?> r1 = r2.defaultValue
                r0.append(r1)
                java.lang.String r1 = ", receiverType="
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.receiverType
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class TypeSubstituting extends net.bytebuddy.description.method.MethodDescription.AbstractBase implements net.bytebuddy.description.method.MethodDescription.InGenericShape {
        private final net.bytebuddy.description.type.TypeDescription.Generic declaringType;
        private final net.bytebuddy.description.method.MethodDescription methodDescription;
        private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

        public TypeSubstituting(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.methodDescription = r2
                r0.visitor = r3
                return
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.TypeDependant asDefined() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.asDefined()
                return r0
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape asDefined() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                net.bytebuddy.description.ByteCodeElement$TypeDependant r0 = r0.asDefined()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public net.bytebuddy.description.type.TypeDescription.Generic getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.declaringType
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                net.bytebuddy.description.annotation.AnnotationValue r0 = r0.getDefaultValue()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                r3 = this;
                net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes
                net.bytebuddy.description.method.MethodDescription r1 = r3.methodDescription
                net.bytebuddy.description.type.TypeList$Generic r1 = r1.getExceptionTypes()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r3.visitor
                r0.<init>(r1, r2)
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getInternalName() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                java.lang.String r0 = r0.getInternalName()
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                int r0 = r0.getModifiers()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
        public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InGenericShape> getParameters() {
                r3 = this;
                net.bytebuddy.description.method.ParameterList$TypeSubstituting r0 = new net.bytebuddy.description.method.ParameterList$TypeSubstituting
                net.bytebuddy.description.method.MethodDescription r1 = r3.methodDescription
                net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r2 = r3.visitor
                r0.<init>(r3, r1, r2)
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getReceiverType() {
                r2 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r2.methodDescription
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReceiverType()
                if (r0 != 0) goto Lb
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                goto L13
            Lb:
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.visitor
                java.lang.Object r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
            L13:
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                r2 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r2.methodDescription
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.visitor
                java.lang.Object r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r2 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r2.methodDescription
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.getTypeVariables()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.visitor
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDefinition$Sort r1 = net.bytebuddy.description.type.TypeDefinition.Sort.VARIABLE
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.ofSort(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.type.TypeList$Generic r0 = (net.bytebuddy.description.type.TypeList.Generic) r0
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean isConstructor() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                boolean r0 = r0.isConstructor()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean isMethod() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                boolean r0 = r0.isMethod()
                return r0
        }

        @Override // net.bytebuddy.description.method.MethodDescription.AbstractBase, net.bytebuddy.description.method.MethodDescription
        public boolean isTypeInitializer() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                boolean r0 = r0.isTypeInitializer()
                return r0
        }
    }

    public static class TypeToken {
        private transient /* synthetic */ int hashCode;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription> parameterTypes;
        private final net.bytebuddy.description.type.TypeDescription returnType;

        public TypeToken(net.bytebuddy.description.type.TypeDescription r1, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r2) {
                r0 = this;
                r0.<init>()
                r0.returnType = r1
                r0.parameterTypes = r2
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.description.method.MethodDescription.TypeToken
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.method.MethodDescription$TypeToken r5 = (net.bytebuddy.description.method.MethodDescription.TypeToken) r5
                net.bytebuddy.description.type.TypeDescription r1 = r4.returnType
                net.bytebuddy.description.type.TypeDescription r3 = r5.returnType
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r4.parameterTypes
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r5 = r5.parameterTypes
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = r2
            L22:
                return r0
        }

        public java.util.List<net.bytebuddy.description.type.TypeDescription> getParameterTypes() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r0 = r1.parameterTypes
                return r0
        }

        public net.bytebuddy.description.type.TypeDescription getReturnType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.returnType
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r2 = this;
                int r0 = r2.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto L15
            L6:
                net.bytebuddy.description.type.TypeDescription r0 = r2.returnType
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r2.parameterTypes
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L15:
                if (r0 != 0) goto L1a
                int r0 = r2.hashCode
                goto L1c
            L1a:
                r2.hashCode = r0
            L1c:
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 40
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r3.parameterTypes
                java.util.Iterator r1 = r1.iterator()
            L10:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.String r2 = r2.getDescriptor()
                r0.append(r2)
                goto L10
            L24:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r3.returnType
                java.lang.String r1 = r1.getDescriptor()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            return
    }

    net.bytebuddy.description.method.MethodDescription.SignatureToken asSignatureToken();

    net.bytebuddy.description.method.MethodDescription.TypeToken asTypeToken();

    int getActualModifiers();

    int getActualModifiers(boolean r1);

    int getActualModifiers(boolean r1, net.bytebuddy.description.modifier.Visibility r2);

    @Override // net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
    @javax.annotation.Nonnull
    net.bytebuddy.description.type.TypeDefinition getDeclaringType();

    @net.bytebuddy.utility.nullability.MaybeNull
    <T> T getDefaultValue(java.lang.Class<T> r1);

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue();

    net.bytebuddy.description.type.TypeList.Generic getExceptionTypes();

    net.bytebuddy.description.method.ParameterList<?> getParameters();

    @net.bytebuddy.utility.nullability.MaybeNull
    net.bytebuddy.description.type.TypeDescription.Generic getReceiverType();

    net.bytebuddy.description.type.TypeDescription.Generic getReturnType();

    int getStackSize();

    boolean isBridgeCompatible(net.bytebuddy.description.method.MethodDescription.TypeToken r1);

    boolean isConstantBootstrap();

    boolean isConstantBootstrap(java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r1);

    boolean isConstructor();

    boolean isDefaultMethod();

    boolean isDefaultValue();

    boolean isDefaultValue(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r1);

    boolean isInvokableOn(net.bytebuddy.description.type.TypeDescription r1);

    boolean isInvokeBootstrap();

    boolean isInvokeBootstrap(java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r1);

    boolean isMethod();

    boolean isSpecializableFor(net.bytebuddy.description.type.TypeDescription r1);

    boolean isTypeInitializer();

    boolean isVirtual();

    boolean represents(java.lang.reflect.Constructor<?> r1);

    boolean represents(java.lang.reflect.Method r1);
}
