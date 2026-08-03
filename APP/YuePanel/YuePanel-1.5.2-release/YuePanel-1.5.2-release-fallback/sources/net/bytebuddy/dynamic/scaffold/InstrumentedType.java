package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public interface InstrumentedType extends net.bytebuddy.description.type.TypeDescription {

    /* JADX INFO: renamed from: net.bytebuddy.dynamic.scaffold.InstrumentedType$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class Default extends net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType implements net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName {
        private static final java.util.Set<java.lang.String> KEYWORDS = null;
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotationDescriptions;
        private final boolean anonymousClass;
        private final java.util.Map<java.lang.String, java.lang.Object> auxiliaryFields;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription> declaredTypes;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final net.bytebuddy.description.type.TypeDescription declaringType;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final net.bytebuddy.description.method.MethodDescription.InDefinedShape enclosingMethod;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final net.bytebuddy.description.type.TypeDescription enclosingType;
        private final java.util.List<? extends net.bytebuddy.description.field.FieldDescription.Token> fieldTokens;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> interfaceTypes;
        private final net.bytebuddy.implementation.LoadedTypeInitializer loadedTypeInitializer;
        private final boolean localClass;
        private final java.util.List<? extends net.bytebuddy.description.method.MethodDescription.Token> methodTokens;
        private final int modifiers;
        private final java.lang.String name;
        private final net.bytebuddy.description.type.TypeDescription nestHost;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription> nestMembers;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription> permittedSubclasses;
        private final boolean record;
        private final java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription.Token> recordComponentTokens;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final net.bytebuddy.description.type.TypeDescription.Generic superClass;
        private final net.bytebuddy.dynamic.scaffold.TypeInitializer typeInitializer;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> typeVariables;

        static {
                java.util.HashSet r0 = new java.util.HashSet
                java.lang.String r49 = "super"
                java.lang.String r50 = "while"
                java.lang.String r1 = "abstract"
                java.lang.String r2 = "continue"
                java.lang.String r3 = "for"
                java.lang.String r4 = "new"
                java.lang.String r5 = "switch"
                java.lang.String r6 = "assert"
                java.lang.String r7 = "default"
                java.lang.String r8 = "goto"
                java.lang.String r9 = "package"
                java.lang.String r10 = "synchronized"
                java.lang.String r11 = "boolean"
                java.lang.String r12 = "do"
                java.lang.String r13 = "if"
                java.lang.String r14 = "private"
                java.lang.String r15 = "this"
                java.lang.String r16 = "break"
                java.lang.String r17 = "double"
                java.lang.String r18 = "implements"
                java.lang.String r19 = "protected"
                java.lang.String r20 = "throw"
                java.lang.String r21 = "byte"
                java.lang.String r22 = "else"
                java.lang.String r23 = "import"
                java.lang.String r24 = "public"
                java.lang.String r25 = "throws"
                java.lang.String r26 = "case"
                java.lang.String r27 = "enum"
                java.lang.String r28 = "instanceof"
                java.lang.String r29 = "return"
                java.lang.String r30 = "transient"
                java.lang.String r31 = "catch"
                java.lang.String r32 = "extends"
                java.lang.String r33 = "int"
                java.lang.String r34 = "short"
                java.lang.String r35 = "try"
                java.lang.String r36 = "char"
                java.lang.String r37 = "final"
                java.lang.String r38 = "interface"
                java.lang.String r39 = "static"
                java.lang.String r40 = "void"
                java.lang.String r41 = "class"
                java.lang.String r42 = "finally"
                java.lang.String r43 = "long"
                java.lang.String r44 = "strictfp"
                java.lang.String r45 = "volatile"
                java.lang.String r46 = "const"
                java.lang.String r47 = "float"
                java.lang.String r48 = "native"
                java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50}
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                net.bytebuddy.dynamic.scaffold.InstrumentedType.Default.KEYWORDS = r0
                return
        }

        public Default(java.lang.String r3, int r4, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r5, java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r6, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r7, java.util.List<? extends net.bytebuddy.description.field.FieldDescription.Token> r8, java.util.Map<java.lang.String, java.lang.Object> r9, java.util.List<? extends net.bytebuddy.description.method.MethodDescription.Token> r10, java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription.Token> r11, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r12, net.bytebuddy.dynamic.scaffold.TypeInitializer r13, net.bytebuddy.implementation.LoadedTypeInitializer r14, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r15, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.method.MethodDescription.InDefinedShape r16, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r17, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r18, @net.bytebuddy.utility.nullability.MaybeNull java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r19, boolean r20, boolean r21, boolean r22, net.bytebuddy.description.type.TypeDescription r23, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r24) {
                r2 = this;
                r0 = r2
                r2.<init>()
                r1 = r3
                r0.name = r1
                r1 = r4
                r0.modifiers = r1
                r1 = r6
                r0.typeVariables = r1
                r1 = r5
                r0.superClass = r1
                r1 = r7
                r0.interfaceTypes = r1
                r1 = r8
                r0.fieldTokens = r1
                r1 = r9
                r0.auxiliaryFields = r1
                r1 = r10
                r0.methodTokens = r1
                r1 = r11
                r0.recordComponentTokens = r1
                r1 = r12
                r0.annotationDescriptions = r1
                r1 = r13
                r0.typeInitializer = r1
                r1 = r14
                r0.loadedTypeInitializer = r1
                r1 = r15
                r0.declaringType = r1
                r1 = r16
                r0.enclosingMethod = r1
                r1 = r17
                r0.enclosingType = r1
                r1 = r18
                r0.declaredTypes = r1
                r1 = r19
                r0.permittedSubclasses = r1
                r1 = r20
                r0.anonymousClass = r1
                r1 = r21
                r0.localClass = r1
                r1 = r22
                r0.record = r1
                r1 = r23
                r0.nestHost = r1
                r1 = r24
                r0.nestMembers = r1
                return
        }

        private static boolean isValidIdentifier(java.lang.String r4) {
                java.util.Set<java.lang.String> r0 = net.bytebuddy.dynamic.scaffold.InstrumentedType.Default.KEYWORDS
                boolean r0 = r0.contains(r4)
                r1 = 0
                if (r0 != 0) goto L3a
                int r0 = r4.length()
                if (r0 == 0) goto L3a
                char r0 = r4.charAt(r1)
                boolean r0 = java.lang.Character.isJavaIdentifierStart(r0)
                if (r0 != 0) goto L1a
                goto L3a
            L1a:
                java.lang.String r0 = "package-info"
                boolean r0 = r4.equals(r0)
                r2 = 1
                if (r0 == 0) goto L24
                return r2
            L24:
                r0 = r2
            L25:
                int r3 = r4.length()
                if (r0 >= r3) goto L39
                char r3 = r4.charAt(r0)
                boolean r3 = java.lang.Character.isJavaIdentifierPart(r3)
                if (r3 != 0) goto L36
                return r1
            L36:
                int r0 = r0 + 1
                goto L25
            L39:
                return r2
            L3a:
                return r1
        }

        private static boolean isValidIdentifier(java.lang.String[] r4) {
                int r0 = r4.length
                r1 = 0
                if (r0 != 0) goto L5
                return r1
            L5:
                int r0 = r4.length
                r2 = r1
            L7:
                if (r2 >= r0) goto L15
                r3 = r4[r2]
                boolean r3 = isValidIdentifier(r3)
                if (r3 != 0) goto L12
                return r1
            L12:
                int r2 = r2 + 1
                goto L7
            L15:
                r4 = 1
                return r4
        }

        public static net.bytebuddy.dynamic.scaffold.InstrumentedType of(java.lang.String r1, net.bytebuddy.description.type.TypeDescription.Generic r2, int r3) {
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default r0 = net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.MODIFIABLE
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.subclass(r1, r3, r2)
                return r1
        }

        public static net.bytebuddy.dynamic.scaffold.InstrumentedType of(java.lang.String r0, net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.modifier.ModifierContributor.ForType... r2) {
                net.bytebuddy.description.modifier.ModifierContributor$Resolver r2 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r2)
                int r2 = r2.resolve()
                net.bytebuddy.dynamic.scaffold.InstrumentedType r0 = of(r0, r1, r2)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotationDescriptions
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> getDeclaredFields() {
                r2 = this;
                net.bytebuddy.description.field.FieldList$ForTokens r0 = new net.bytebuddy.description.field.FieldList$ForTokens
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r1 = r2.fieldTokens
                r0.<init>(r2, r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> getDeclaredMethods() {
                r2 = this;
                net.bytebuddy.description.method.MethodList$ForTokens r0 = new net.bytebuddy.description.method.MethodList$ForTokens
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r1 = r2.methodTokens
                r0.<init>(r2, r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getDeclaredTypes() {
                r2 = this;
                net.bytebuddy.description.type.TypeList$Explicit r0 = new net.bytebuddy.description.type.TypeList$Explicit
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r2.declaredTypes
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.MaybeNull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.declaringType
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.enclosingMethod
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getEnclosingType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.enclosingType
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                r3 = this;
                net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$WithResolvedErasure r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$WithResolvedErasure
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r3.interfaceTypes
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r3)
                r0.<init>(r1, r2)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.implementation.LoadedTypeInitializer getLoadedTypeInitializer() {
                r1 = this;
                net.bytebuddy.implementation.LoadedTypeInitializer r0 = r1.loadedTypeInitializer
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                int r0 = r1.modifiers
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription getNestHost() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r2.nestHost
                java.lang.Class<net.bytebuddy.dynamic.TargetType> r1 = net.bytebuddy.dynamic.TargetType.class
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto Lc
                r0 = r2
                goto Le
            Lc:
                net.bytebuddy.description.type.TypeDescription r0 = r2.nestHost
            Le:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getNestMembers() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r2.nestHost
                java.lang.Class<net.bytebuddy.dynamic.TargetType> r1 = net.bytebuddy.dynamic.TargetType.class
                boolean r0 = r0.represents(r1)
                if (r0 == 0) goto L16
                net.bytebuddy.description.type.TypeList$Explicit r0 = new net.bytebuddy.description.type.TypeList$Explicit
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r2.nestMembers
                java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r2, r1)
                r0.<init>(r1)
                goto L1c
            L16:
                net.bytebuddy.description.type.TypeDescription r0 = r2.nestHost
                net.bytebuddy.description.type.TypeList r0 = r0.getNestMembers()
            L1c:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.PackageDescription getPackage() {
                r4 = this;
                java.lang.String r0 = r4.name
                r1 = 46
                int r0 = r0.lastIndexOf(r1)
                r1 = -1
                if (r0 != r1) goto Le
                net.bytebuddy.description.type.PackageDescription r0 = net.bytebuddy.description.type.PackageDescription.DEFAULT
                goto L1b
            Le:
                net.bytebuddy.description.type.PackageDescription$Simple r1 = new net.bytebuddy.description.type.PackageDescription$Simple
                java.lang.String r2 = r4.name
                r3 = 0
                java.lang.String r0 = r2.substring(r3, r0)
                r1.<init>(r0)
                r0 = r1
            L1b:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getPermittedSubtypes() {
                r2 = this;
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r0 = r2.permittedSubclasses
                if (r0 != 0) goto La
                net.bytebuddy.description.type.TypeList$Empty r0 = new net.bytebuddy.description.type.TypeList$Empty
                r0.<init>()
                goto L11
            La:
                net.bytebuddy.description.type.TypeList$Explicit r0 = new net.bytebuddy.description.type.TypeList$Explicit
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r2.permittedSubclasses
                r0.<init>(r1)
            L11:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> getRecordComponents() {
                r2 = this;
                net.bytebuddy.description.type.RecordComponentList$ForTokens r0 = new net.bytebuddy.description.type.RecordComponentList$ForTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r1 = r2.recordComponentTokens
                r0.<init>(r2, r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.superClass
                if (r0 != 0) goto L7
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                goto L11
            L7:
                net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure r1 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithResolvedErasure
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r2 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r3)
                r1.<init>(r0, r2)
                r0 = r1
            L11:
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.TypeInitializer getTypeInitializer() {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.TypeInitializer r0 = r1.typeInitializer
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r0 = r1.typeVariables
                net.bytebuddy.description.type.TypeList$Generic r0 = net.bytebuddy.description.type.TypeList.Generic.ForDetachedTypes.attachVariables(r1, r0)
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
                r1 = this;
                boolean r0 = r1.anonymousClass
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
                r1 = this;
                boolean r0 = r1.localClass
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming super class for given instance.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public boolean isRecord() {
                r2 = this;
                boolean r0 = r2.record
                if (r0 == 0) goto L1e
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.superClass
                if (r0 == 0) goto L1e
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.getSuperClass()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.RECORD
                net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L1e
                r0 = 1
                goto L1f
            L1e:
                r0 = 0
            L1f:
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isSealed() {
                r1 = this;
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r0 = r1.permittedSubclasses
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.description.type.TypeDescription validated() {
                r30 = this;
                r0 = r30
                java.lang.String r1 = r30.getName()
                java.lang.String r2 = "\\."
                java.lang.String[] r1 = r1.split(r2)
                boolean r1 = isValidIdentifier(r1)
                java.lang.String r2 = " for "
                if (r1 == 0) goto Led5
                int r1 = r30.getModifiers()
                r3 = -161312(0xfffffffffffd89e0, float:NaN)
                r1 = r1 & r3
                java.lang.String r3 = "Illegal modifiers "
                if (r1 != 0) goto Leb5
                boolean r1 = r30.isPackageType()
                if (r1 == 0) goto L50
                int r1 = r30.getModifiers()
                r4 = 5632(0x1600, float:7.892E-42)
                if (r1 != r4) goto L2f
                goto L50
            L2f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                int r3 = r30.getModifiers()
                r2.append(r3)
                java.lang.String r3 = " for package "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L50:
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r30.getSuperClass()
                if (r1 == 0) goto Ld4
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r4 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.SUPER_CLASS
                java.lang.Object r4 = r1.accept(r4)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto Lb7
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations r4 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE
                java.lang.Object r4 = r1.accept(r4)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                boolean r4 = r4.booleanValue()
                if (r4 == 0) goto L9a
                net.bytebuddy.description.type.TypeDescription r4 = r1.asErasure()
                boolean r4 = r4.isVisibleTo(r0)
                if (r4 == 0) goto L7d
                goto Ld4
            L7d:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Invisible super type "
                r4.append(r5)
                r4.append(r1)
                r4.append(r2)
                r4.append(r0)
                java.lang.String r1 = r4.toString()
                r3.<init>(r1)
                throw r3
            L9a:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Illegal type annotations on super class "
                r4.append(r5)
                r4.append(r1)
                r4.append(r2)
                r4.append(r0)
                java.lang.String r1 = r4.toString()
                r3.<init>(r1)
                throw r3
            Lb7:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Illegal super class "
                r4.append(r5)
                r4.append(r1)
                r4.append(r2)
                r4.append(r0)
                java.lang.String r1 = r4.toString()
                r3.<init>(r1)
                throw r3
            Ld4:
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                net.bytebuddy.description.type.TypeList$Generic r4 = r30.getInterfaces()
                java.util.Iterator r4 = r4.iterator()
            Le1:
                boolean r5 = r4.hasNext()
                if (r5 == 0) goto L192
                java.lang.Object r5 = r4.next()
                net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r6 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.INTERFACE
                java.lang.Object r6 = r5.accept(r6)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L175
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations r6 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE
                java.lang.Object r6 = r5.accept(r6)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L158
                net.bytebuddy.description.type.TypeDescription r6 = r5.asErasure()
                boolean r6 = r1.add(r6)
                if (r6 == 0) goto L13b
                net.bytebuddy.description.type.TypeDescription r6 = r5.asErasure()
                boolean r6 = r6.isVisibleTo(r0)
                if (r6 == 0) goto L11e
                goto Le1
            L11e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Invisible interface type "
                r3.append(r4)
                r3.append(r5)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L13b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Already implemented interface "
                r3.append(r4)
                r3.append(r5)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L158:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Illegal type annotations on interface "
                r3.append(r4)
                r3.append(r5)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L175:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Illegal interface "
                r3.append(r4)
                r3.append(r5)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L192:
                net.bytebuddy.description.type.TypeList$Generic r1 = r30.getTypeVariables()
                boolean r4 = r1.isEmpty()
                if (r4 != 0) goto L1c1
                java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
                boolean r4 = r0.isAssignableTo(r4)
                if (r4 != 0) goto L1a5
                goto L1c1
            L1a5:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot define throwable "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r3 = " to be generic"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L1c1:
                java.util.HashSet r4 = new java.util.HashSet
                r4.<init>()
                java.util.Iterator r1 = r1.iterator()
            L1ca:
                boolean r5 = r1.hasNext()
                java.lang.String r6 = " does not define at least one bound"
                java.lang.String r7 = "Type variable "
                java.lang.String r9 = "Illegal interface bound "
                java.lang.String r10 = "Duplicate bound "
                java.lang.String r11 = "Illegal type variable bound "
                java.lang.String r13 = "Illegal type annotation on '"
                java.lang.String r14 = "Illegal type variable name '"
                java.lang.String r15 = "Duplicate type variable symbol '"
                java.lang.String r8 = "' for "
                java.lang.String r12 = " of "
                if (r5 == 0) goto L34a
                java.lang.Object r5 = r1.next()
                net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                r17 = r1
                java.lang.String r1 = r5.getSymbol()
                boolean r18 = r4.add(r1)
                if (r18 == 0) goto L32f
                boolean r1 = isValidIdentifier(r1)
                if (r1 == 0) goto L314
                boolean r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.ofFormalTypeVariable(r5)
                if (r1 == 0) goto L2f9
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                net.bytebuddy.description.type.TypeList$Generic r8 = r5.getUpperBounds()
                java.util.Iterator r8 = r8.iterator()
                r16 = 0
            L211:
                boolean r13 = r8.hasNext()
                if (r13 == 0) goto L2d5
                java.lang.Object r13 = r8.next()
                net.bytebuddy.description.type.TypeDescription$Generic r13 = (net.bytebuddy.description.type.TypeDescription.Generic) r13
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r14 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.TYPE_VARIABLE
                java.lang.Object r14 = r13.accept(r14)
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L2b4
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations r14 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE
                java.lang.Object r14 = r13.accept(r14)
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L297
                boolean r14 = r1.add(r13)
                if (r14 == 0) goto L276
                if (r16 == 0) goto L273
                net.bytebuddy.description.type.TypeDefinition$Sort r14 = r13.getSort()
                boolean r14 = r14.isTypeVariable()
                if (r14 != 0) goto L252
                boolean r14 = r13.isInterface()
                if (r14 == 0) goto L252
                goto L273
            L252:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r9)
                r3.append(r13)
                r3.append(r12)
                r3.append(r5)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L273:
                r16 = 1
                goto L211
            L276:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r10)
                r3.append(r13)
                r3.append(r12)
                r3.append(r5)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L297:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Illegal type annotations on type variable "
                r3.append(r4)
                r3.append(r13)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L2b4:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                r3.append(r13)
                r3.append(r12)
                r3.append(r5)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L2d5:
                if (r16 == 0) goto L2db
                r1 = r17
                goto L1ca
            L2db:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r7)
                r3.append(r5)
                r3.append(r2)
                r3.append(r0)
                r3.append(r6)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L2f9:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r13)
                r2.append(r5)
                r2.append(r8)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L314:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r14)
                r2.append(r5)
                r2.append(r8)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L32f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r15)
                r2.append(r5)
                r2.append(r8)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L34a:
                net.bytebuddy.description.type.TypeDescription r1 = r30.getEnclosingType()
                java.lang.String r4 = "Cannot define array type or primitive type "
                if (r1 == 0) goto L37c
                boolean r5 = r1.isArray()
                if (r5 != 0) goto L35f
                boolean r5 = r1.isPrimitive()
                if (r5 != 0) goto L35f
                goto L37c
            L35f:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = " + as enclosing type for "
                r3.append(r1)
                r3.append(r0)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L37c:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r30.getEnclosingMethod()
                if (r5 == 0) goto L388
                boolean r17 = r5.isTypeInitializer()
                if (r17 != 0) goto L38b
            L388:
                r17 = r3
                goto L3a2
            L38b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot enclose type declaration in class initializer "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L3a2:
                net.bytebuddy.description.type.TypeDescription r3 = r30.getDeclaringType()
                if (r3 == 0) goto L3d2
                boolean r5 = r3.isPrimitive()
                if (r5 != 0) goto L3b5
                boolean r5 = r3.isArray()
                if (r5 != 0) goto L3b5
                goto L3fa
            L3b5:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                r2.append(r3)
                java.lang.String r3 = " as declaring type for "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L3d2:
                if (r1 != 0) goto L3fa
                if (r5 != 0) goto L3fa
                boolean r3 = r30.isLocalType()
                if (r3 != 0) goto L3e3
                boolean r3 = r30.isAnonymousType()
                if (r3 != 0) goto L3e3
                goto L3fa
            L3e3:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Cannot define an anonymous or local class without a declaring type for "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L3fa:
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
                net.bytebuddy.description.type.TypeList r5 = r30.getDeclaredTypes()
                java.util.Iterator r5 = r5.iterator()
            L407:
                boolean r18 = r5.hasNext()
                if (r18 == 0) goto L460
                java.lang.Object r18 = r5.next()
                r19 = r5
                r5 = r18
                net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                boolean r18 = r5.isArray()
                if (r18 != 0) goto L443
                boolean r18 = r5.isPrimitive()
                if (r18 != 0) goto L443
                boolean r18 = r3.add(r5)
                if (r18 == 0) goto L42c
                r5 = r19
                goto L407
            L42c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Duplicate definition of declared type "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L443:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                r2.append(r5)
                java.lang.String r3 = " + as declared type for "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L460:
                net.bytebuddy.description.type.TypeDescription r3 = r30.getNestHost()
                boolean r5 = r3.equals(r0)
                r18 = r1
                java.lang.String r1 = " + within different package then "
                if (r5 == 0) goto L4f7
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
                net.bytebuddy.description.type.TypeList r5 = r30.getNestMembers()
                java.util.Iterator r5 = r5.iterator()
            L47b:
                boolean r19 = r5.hasNext()
                if (r19 == 0) goto L509
                java.lang.Object r19 = r5.next()
                r20 = r5
                r5 = r19
                net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                boolean r19 = r5.isArray()
                if (r19 != 0) goto L4da
                boolean r19 = r5.isPrimitive()
                if (r19 != 0) goto L4da
                boolean r19 = r5.isSamePackage(r0)
                if (r19 == 0) goto L4bd
                boolean r19 = r3.add(r5)
                if (r19 == 0) goto L4a6
                r5 = r20
                goto L47b
            L4a6:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Duplicate definition of nest member "
                r2.append(r3)
                r2.append(r5)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L4bd:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Cannot define nest member "
                r3.append(r4)
                r3.append(r5)
                r3.append(r1)
                r3.append(r0)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L4da:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                r2.append(r5)
                java.lang.String r3 = " + as nest member of "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L4f7:
                boolean r5 = r3.isArray()
                if (r5 != 0) goto Le98
                boolean r5 = r3.isPrimitive()
                if (r5 != 0) goto Le98
                boolean r4 = r3.isSamePackage(r0)
                if (r4 == 0) goto Le7b
            L509:
                net.bytebuddy.description.type.TypeList r1 = r30.getPermittedSubtypes()
                java.util.Iterator r1 = r1.iterator()
            L511:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L549
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                boolean r4 = r3.isAssignableTo(r0)
                if (r4 == 0) goto L52a
                boolean r4 = r3.equals(r0)
                if (r4 != 0) goto L52a
                goto L511
            L52a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r4 = "Cannot assign permitted subclass "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r3 = " to "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L549:
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                net.bytebuddy.description.annotation.AnnotationList r3 = r30.getDeclaredAnnotations()
                java.util.Iterator r3 = r3.iterator()
            L556:
                boolean r4 = r3.hasNext()
                java.lang.String r5 = "Duplicate annotation "
                r19 = r15
                java.lang.String r15 = " on "
                r20 = r14
                java.lang.String r14 = "Cannot add "
                if (r4 == 0) goto L5da
                java.lang.Object r4 = r3.next()
                net.bytebuddy.description.annotation.AnnotationDescription r4 = (net.bytebuddy.description.annotation.AnnotationDescription) r4
                r21 = r3
                java.lang.annotation.ElementType r3 = java.lang.annotation.ElementType.TYPE
                boolean r3 = r4.isSupportedOn(r3)
                if (r3 != 0) goto L5ae
                boolean r3 = r30.isAnnotation()
                if (r3 == 0) goto L584
                java.lang.annotation.ElementType r3 = java.lang.annotation.ElementType.ANNOTATION_TYPE
                boolean r3 = r4.isSupportedOn(r3)
                if (r3 != 0) goto L5ae
            L584:
                boolean r3 = r30.isPackageType()
                if (r3 == 0) goto L593
                java.lang.annotation.ElementType r3 = java.lang.annotation.ElementType.PACKAGE
                boolean r3 = r4.isSupportedOn(r3)
                if (r3 == 0) goto L593
                goto L5ae
            L593:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r14)
                r2.append(r4)
                r2.append(r15)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L5ae:
                net.bytebuddy.description.type.TypeDescription r3 = r4.getAnnotationType()
                boolean r3 = r1.add(r3)
                if (r3 == 0) goto L5bf
                r15 = r19
                r14 = r20
                r3 = r21
                goto L556
            L5bf:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                r3.append(r4)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L5da:
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                net.bytebuddy.description.field.FieldList r3 = r30.getDeclaredFields()
                java.util.Iterator r3 = r3.iterator()
            L5e7:
                boolean r4 = r3.hasNext()
                r21 = r8
                java.lang.String r8 = "Illegal type annotations on "
                if (r4 == 0) goto L761
                java.lang.Object r4 = r3.next()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r4 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r4
                java.lang.String r22 = r4.getName()
                r23 = r3
                net.bytebuddy.description.field.FieldDescription$SignatureToken r3 = r4.asSignatureToken()
                boolean r3 = r1.add(r3)
                if (r3 == 0) goto L74a
                boolean r3 = isValidIdentifier(r22)
                if (r3 == 0) goto L733
                int r3 = r4.getModifiers()
                r22 = -151776(0xfffffffffffdaf20, float:NaN)
                r3 = r3 & r22
                if (r3 != 0) goto L712
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r4.getType()
                r22 = r1
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.FIELD
                java.lang.Object r1 = r3.accept(r1)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L6f5
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE
                java.lang.Object r1 = r3.accept(r1)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L6da
                boolean r1 = r4.isSynthetic()
                if (r1 != 0) goto L66c
                net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                boolean r1 = r1.isVisibleTo(r0)
                if (r1 == 0) goto L64b
                goto L66c
            L64b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Invisible field type "
                r3.append(r5)
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r4.getType()
                r3.append(r5)
                r3.append(r2)
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L66c:
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                net.bytebuddy.description.annotation.AnnotationList r3 = r4.getDeclaredAnnotations()
                java.util.Iterator r3 = r3.iterator()
            L679:
                boolean r8 = r3.hasNext()
                if (r8 == 0) goto L6d2
                java.lang.Object r8 = r3.next()
                net.bytebuddy.description.annotation.AnnotationDescription r8 = (net.bytebuddy.description.annotation.AnnotationDescription) r8
                r24 = r3
                java.lang.annotation.ElementType r3 = java.lang.annotation.ElementType.FIELD
                boolean r3 = r8.isSupportedOn(r3)
                if (r3 == 0) goto L6b7
                net.bytebuddy.description.type.TypeDescription r3 = r8.getAnnotationType()
                boolean r3 = r1.add(r3)
                if (r3 == 0) goto L69c
                r3 = r24
                goto L679
            L69c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                r3.append(r8)
                r3.append(r2)
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L6b7:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r14)
                r2.append(r8)
                r2.append(r15)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L6d2:
                r8 = r21
                r1 = r22
                r3 = r23
                goto L5e7
            L6da:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r8)
                r4.append(r3)
                r4.append(r2)
                r4.append(r0)
                java.lang.String r2 = r4.toString()
                r1.<init>(r2)
                throw r1
            L6f5:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Illegal field type "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            L712:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Illegal field modifiers "
                r3.append(r5)
                int r5 = r4.getModifiers()
                r3.append(r5)
                r3.append(r2)
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L733:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Illegal field name for "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L74a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Duplicate field definition for "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L761:
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                net.bytebuddy.description.method.MethodList r3 = r30.getDeclaredMethods()
                java.util.Iterator r3 = r3.iterator()
            L76e:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto Le7a
                java.lang.Object r4 = r3.next()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r4
                r22 = r3
                net.bytebuddy.description.method.MethodDescription$SignatureToken r3 = r4.asSignatureToken()
                boolean r3 = r1.add(r3)
                if (r3 == 0) goto Le63
                int r3 = r4.getModifiers()
                r3 = r3 & (-7680(0xffffffffffffe200, float:NaN))
                if (r3 != 0) goto Le42
                boolean r3 = r30.isInterface()
                if (r3 == 0) goto L7b8
                boolean r3 = r4.isPublic()
                if (r3 != 0) goto L7b8
                boolean r3 = r4.isPrivate()
                if (r3 == 0) goto L7a1
                goto L7b8
            L7a1:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Methods declared by an interface must be public or private "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L7b8:
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
                net.bytebuddy.description.type.TypeList$Generic r23 = r4.getTypeVariables()
                java.util.Iterator r23 = r23.iterator()
            L7c5:
                boolean r24 = r23.hasNext()
                if (r24 == 0) goto L959
                java.lang.Object r24 = r23.next()
                r25 = r1
                r1 = r24
                net.bytebuddy.description.type.TypeDescription$Generic r1 = (net.bytebuddy.description.type.TypeDescription.Generic) r1
                r24 = r8
                java.lang.String r8 = r1.getSymbol()
                boolean r26 = r3.add(r8)
                if (r26 == 0) goto L93a
                boolean r8 = isValidIdentifier(r8)
                if (r8 == 0) goto L91b
                boolean r8 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.ofFormalTypeVariable(r1)
                if (r8 == 0) goto L8fe
                java.util.HashSet r8 = new java.util.HashSet
                r8.<init>()
                net.bytebuddy.description.type.TypeList$Generic r26 = r1.getUpperBounds()
                java.util.Iterator r26 = r26.iterator()
                r27 = 0
            L7fc:
                boolean r28 = r26.hasNext()
                if (r28 == 0) goto L8d0
                java.lang.Object r28 = r26.next()
                r29 = r3
                r3 = r28
                net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                r28 = r15
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r15 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.TYPE_VARIABLE
                java.lang.Object r15 = r3.accept(r15)
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                if (r15 == 0) goto L8af
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations r15 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE
                java.lang.Object r15 = r3.accept(r15)
                java.lang.Boolean r15 = (java.lang.Boolean) r15
                boolean r15 = r15.booleanValue()
                if (r15 == 0) goto L88c
                boolean r15 = r8.add(r3)
                if (r15 == 0) goto L86b
                if (r27 == 0) goto L864
                net.bytebuddy.description.type.TypeDefinition$Sort r15 = r3.getSort()
                boolean r15 = r15.isTypeVariable()
                if (r15 != 0) goto L843
                boolean r15 = r3.isInterface()
                if (r15 == 0) goto L843
                goto L864
            L843:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r9)
                r6.append(r3)
                r6.append(r12)
                r6.append(r1)
                r6.append(r2)
                r6.append(r4)
                java.lang.String r1 = r6.toString()
                r5.<init>(r1)
                throw r5
            L864:
                r15 = r28
                r3 = r29
                r27 = 1
                goto L7fc
            L86b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r10)
                r6.append(r3)
                r6.append(r12)
                r6.append(r1)
                r6.append(r2)
                r6.append(r4)
                java.lang.String r1 = r6.toString()
                r5.<init>(r1)
                throw r5
            L88c:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Illegal type annotations on bound "
                r5.append(r6)
                r5.append(r3)
                r5.append(r12)
                r5.append(r1)
                r5.append(r2)
                r5.append(r0)
                java.lang.String r1 = r5.toString()
                r4.<init>(r1)
                throw r4
            L8af:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r11)
                r6.append(r3)
                r6.append(r12)
                r6.append(r1)
                r6.append(r2)
                r6.append(r4)
                java.lang.String r1 = r6.toString()
                r5.<init>(r1)
                throw r5
            L8d0:
                r29 = r3
                r28 = r15
                if (r27 == 0) goto L8e0
                r8 = r24
                r1 = r25
                r15 = r28
                r3 = r29
                goto L7c5
            L8e0:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r7)
                r5.append(r1)
                r5.append(r2)
                r5.append(r4)
                r5.append(r6)
                java.lang.String r1 = r5.toString()
                r3.<init>(r1)
                throw r3
            L8fe:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r13)
                r3.append(r1)
                r8 = r21
                r3.append(r8)
                r3.append(r4)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L91b:
                r8 = r21
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r15 = r20
                r3.append(r15)
                r3.append(r1)
                r3.append(r8)
                r3.append(r4)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L93a:
                r8 = r21
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r5 = r19
                r3.append(r5)
                r3.append(r1)
                r3.append(r8)
                r3.append(r4)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            L959:
                r25 = r1
                r24 = r8
                r28 = r15
                r1 = r19
                r15 = r20
                r8 = r21
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r4.getReturnType()
                boolean r19 = r4.isTypeInitializer()
                if (r19 != 0) goto Le2b
                boolean r19 = r4.isConstructor()
                if (r19 == 0) goto L9b9
                r19 = r1
                java.lang.Class r1 = java.lang.Void.TYPE
                boolean r1 = r3.represents(r1)
                if (r1 == 0) goto L9a2
                net.bytebuddy.description.annotation.AnnotationList r1 = r3.getDeclaredAnnotations()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L98b
                goto La17
            L98b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "The void non-type must not be annotated for "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L9a2:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "A constructor must return void "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L9b9:
                r19 = r1
                java.lang.String r1 = r4.getInternalName()
                boolean r1 = isValidIdentifier(r1)
                if (r1 == 0) goto Le0e
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.METHOD_RETURN
                java.lang.Object r1 = r3.accept(r1)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto Ldf1
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE
                java.lang.Object r1 = r3.accept(r1)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto Ldd4
                boolean r1 = r4.isSynthetic()
                if (r1 != 0) goto La17
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r4.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                boolean r1 = r1.isVisibleTo(r0)
                if (r1 == 0) goto L9f6
                goto La17
            L9f6:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Invisible return type "
                r3.append(r5)
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r4.getReturnType()
                r3.append(r5)
                r3.append(r2)
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            La17:
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                net.bytebuddy.description.method.ParameterList r3 = r4.getParameters()
                java.util.Iterator r3 = r3.iterator()
            La24:
                boolean r20 = r3.hasNext()
                if (r20 == 0) goto Lbbb
                java.lang.Object r20 = r3.next()
                r21 = r3
                r3 = r20
                net.bytebuddy.description.method.ParameterDescription$InDefinedShape r3 = (net.bytebuddy.description.method.ParameterDescription.InDefinedShape) r3
                r20 = r6
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r3.getType()
                r23 = r7
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r7 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.METHOD_PARAMETER
                java.lang.Object r7 = r6.accept(r7)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto Lb9e
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations r7 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE
                java.lang.Object r7 = r6.accept(r7)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto Lb81
                boolean r7 = r4.isSynthetic()
                if (r7 != 0) goto La86
                net.bytebuddy.description.type.TypeDescription r6 = r6.asErasure()
                boolean r6 = r6.isVisibleTo(r0)
                if (r6 == 0) goto La69
                goto La86
            La69:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Invisible parameter type of "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            La86:
                boolean r6 = r3.isNamed()
                if (r6 == 0) goto Lad7
                java.lang.String r6 = r3.getName()
                boolean r7 = r1.add(r6)
                if (r7 == 0) goto Laba
                boolean r6 = isValidIdentifier(r6)
                if (r6 == 0) goto La9d
                goto Lad7
            La9d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Illegal parameter name of "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            Laba:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Duplicate parameter name of "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            Lad7:
                boolean r6 = r3.hasModifiers()
                if (r6 == 0) goto Lb05
                int r6 = r3.getModifiers()
                r7 = -36881(0xffffffffffff6fef, float:NaN)
                r6 = r6 & r7
                if (r6 != 0) goto Lae8
                goto Lb05
            Lae8:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Illegal modifiers of "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            Lb05:
                java.util.HashSet r6 = new java.util.HashSet
                r6.<init>()
                net.bytebuddy.description.annotation.AnnotationList r7 = r3.getDeclaredAnnotations()
                java.util.Iterator r7 = r7.iterator()
            Lb12:
                boolean r26 = r7.hasNext()
                if (r26 == 0) goto Lb79
                java.lang.Object r26 = r7.next()
                r27 = r1
                r1 = r26
                net.bytebuddy.description.annotation.AnnotationDescription r1 = (net.bytebuddy.description.annotation.AnnotationDescription) r1
                r26 = r7
                java.lang.annotation.ElementType r7 = java.lang.annotation.ElementType.PARAMETER
                boolean r7 = r1.isSupportedOn(r7)
                if (r7 == 0) goto Lb5c
                net.bytebuddy.description.type.TypeDescription r7 = r1.getAnnotationType()
                boolean r7 = r6.add(r7)
                if (r7 == 0) goto Lb3b
                r7 = r26
                r1 = r27
                goto Lb12
            Lb3b:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                r7.append(r5)
                r7.append(r1)
                r7.append(r12)
                r7.append(r3)
                r7.append(r2)
                r7.append(r4)
                java.lang.String r1 = r7.toString()
                r6.<init>(r1)
                throw r6
            Lb5c:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r14)
                r4.append(r1)
                r1 = r28
                r4.append(r1)
                r4.append(r3)
                java.lang.String r1 = r4.toString()
                r2.<init>(r1)
                throw r2
            Lb79:
                r6 = r20
                r3 = r21
                r7 = r23
                goto La24
            Lb81:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Illegal type annotations on parameter "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            Lb9e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Illegal parameter type of "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            Lbbb:
                r20 = r6
                r23 = r7
                r1 = r28
                net.bytebuddy.description.type.TypeList$Generic r3 = r4.getExceptionTypes()
                java.util.Iterator r3 = r3.iterator()
            Lbc9:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto Lc59
                java.lang.Object r6 = r3.next()
                net.bytebuddy.description.type.TypeDescription$Generic r6 = (net.bytebuddy.description.type.TypeDescription.Generic) r6
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r7 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.EXCEPTION
                java.lang.Object r7 = r6.accept(r7)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto Lc3c
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations r7 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.ForTypeAnnotations.INSTANCE
                java.lang.Object r7 = r6.accept(r7)
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                if (r7 == 0) goto Lc1f
                boolean r7 = r4.isSynthetic()
                if (r7 != 0) goto Lbc9
                net.bytebuddy.description.type.TypeDescription r7 = r6.asErasure()
                boolean r7 = r7.isVisibleTo(r0)
                if (r7 == 0) goto Lc02
                goto Lbc9
            Lc02:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Invisible exception type "
                r3.append(r5)
                r3.append(r6)
                r3.append(r2)
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            Lc1f:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r7 = r24
                r3.append(r7)
                r3.append(r6)
                r3.append(r2)
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            Lc3c:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r5 = "Illegal exception type "
                r3.append(r5)
                r3.append(r6)
                r3.append(r2)
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            Lc59:
                r7 = r24
                java.util.HashSet r3 = new java.util.HashSet
                r3.<init>()
                net.bytebuddy.description.annotation.AnnotationList r6 = r4.getDeclaredAnnotations()
                java.util.Iterator r6 = r6.iterator()
            Lc68:
                boolean r21 = r6.hasNext()
                if (r21 == 0) goto Lcd3
                java.lang.Object r21 = r6.next()
                r24 = r6
                r6 = r21
                net.bytebuddy.description.annotation.AnnotationDescription r6 = (net.bytebuddy.description.annotation.AnnotationDescription) r6
                boolean r21 = r4.isMethod()
                if (r21 == 0) goto Lc85
                java.lang.annotation.ElementType r21 = java.lang.annotation.ElementType.METHOD
            Lc80:
                r26 = r7
                r7 = r21
                goto Lc88
            Lc85:
                java.lang.annotation.ElementType r21 = java.lang.annotation.ElementType.CONSTRUCTOR
                goto Lc80
            Lc88:
                boolean r7 = r6.isSupportedOn(r7)
                if (r7 == 0) goto Lcb8
                net.bytebuddy.description.type.TypeDescription r7 = r6.getAnnotationType()
                boolean r7 = r3.add(r7)
                if (r7 == 0) goto Lc9d
                r6 = r24
                r7 = r26
                goto Lc68
            Lc9d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                r3.append(r6)
                r3.append(r2)
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            Lcb8:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r14)
                r3.append(r6)
                r3.append(r1)
                r3.append(r4)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            Lcd3:
                r26 = r7
                net.bytebuddy.description.annotation.AnnotationValue r3 = r4.getDefaultValue()
                if (r3 == 0) goto Ld01
                boolean r6 = r4.isDefaultValue(r3)
                if (r6 == 0) goto Lce2
                goto Ld01
            Lce2:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "Illegal default value "
                r2.append(r5)
                r2.append(r3)
                java.lang.String r3 = "for "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Ld01:
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r4.getReceiverType()
                if (r3 == 0) goto Ld33
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Validator r6 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.RECEIVER
                java.lang.Object r6 = r3.accept(r6)
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto Ld16
                goto Ld33
            Ld16:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Illegal receiver type "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            Ld33:
                boolean r6 = r4.isStatic()
                if (r6 == 0) goto Ld5d
                if (r3 != 0) goto Ld3e
                r28 = r1
                goto Lda5
            Ld3e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "Static method "
                r2.append(r5)
                r2.append(r4)
                java.lang.String r4 = " defines a non-null receiver "
                r2.append(r4)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Ld5d:
                boolean r6 = r4.isConstructor()
                java.lang.String r7 = " defines an illegal receiver "
                if (r6 == 0) goto Ld97
                if (r3 == 0) goto Ld7a
                net.bytebuddy.description.type.TypeDescription r6 = r3.asErasure()
                r28 = r1
                if (r18 != 0) goto Ld71
                r1 = r0
                goto Ld73
            Ld71:
                r1 = r18
            Ld73:
                boolean r1 = r6.equals(r1)
                if (r1 == 0) goto Ld7a
                goto Lda5
            Ld7a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "Constructor "
                r2.append(r5)
                r2.append(r4)
                r2.append(r7)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Ld97:
                r28 = r1
                if (r3 == 0) goto Ldb7
                net.bytebuddy.description.type.TypeDescription r1 = r3.asErasure()
                boolean r1 = r0.equals(r1)
                if (r1 == 0) goto Ldb7
            Lda5:
                r21 = r8
                r6 = r20
                r3 = r22
                r7 = r23
                r1 = r25
                r8 = r26
                r20 = r15
                r15 = r28
                goto L76e
            Ldb7:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r5 = "Method "
                r2.append(r5)
                r2.append(r4)
                r2.append(r7)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Ldd4:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Illegal type annotations on return type "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            Ldf1:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Illegal return type "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            Le0e:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "Illegal method name "
                r5.append(r6)
                r5.append(r3)
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                r1.<init>(r2)
                throw r1
            Le2b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Illegal explicit declaration of a type initializer by "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Le42:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r5 = r17
                r3.append(r5)
                int r5 = r4.getModifiers()
                r3.append(r5)
                r3.append(r2)
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            Le63:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Duplicate method signature for "
                r2.append(r3)
                r2.append(r4)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Le7a:
                return r0
            Le7b:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Cannot define nest host "
                r4.append(r5)
                r4.append(r3)
                r4.append(r1)
                r4.append(r0)
                java.lang.String r1 = r4.toString()
                r2.<init>(r1)
                throw r2
            Le98:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r4)
                r2.append(r3)
                java.lang.String r3 = " + as nest host for "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            Leb5:
                r5 = r3
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                int r4 = r30.getModifiers()
                r3.append(r4)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            Led5:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Illegal type name: "
                r3.append(r4)
                java.lang.String r4 = r30.getName()
                r3.append(r4)
                r3.append(r2)
                r3.append(r0)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withAnnotations(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r27) {
                r26 = this;
                r0 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                r12 = r27
                java.util.List r11 = net.bytebuddy.utility.CompoundList.of(r11, r12)
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r25 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withAnnotations(java.util.List r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withAnnotations(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withAnonymousClass(boolean r26) {
                r25 = this;
                r0 = r25
                r19 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r26 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r20 = 0
                r1 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withAnonymousClass(boolean r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withAnonymousClass(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withAuxiliaryField(net.bytebuddy.description.field.FieldDescription.Token r29, java.lang.Object r30) {
                r28 = this;
                r0 = r28
                r1 = r30
                java.util.HashMap r9 = new java.util.HashMap
                java.util.Map<java.lang.String, java.lang.Object> r2 = r0.auxiliaryFields
                r9.<init>(r2)
                java.lang.String r2 = r29.getName()
                java.lang.Object r2 = r9.put(r2, r1)
                if (r2 == 0) goto L4b
                if (r2 != r1) goto L18
                return r0
            L18:
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Field "
                r4.append(r5)
                java.lang.String r5 = r29.getName()
                r4.append(r5)
                java.lang.String r5 = " for "
                r4.append(r5)
                r4.append(r0)
                java.lang.String r5 = " already mapped to "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = " and not "
                r4.append(r2)
                r4.append(r1)
                java.lang.String r1 = r4.toString()
                r3.<init>(r1)
                throw r3
            L4b:
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r25 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r2 = r25
                java.lang.String r3 = r0.name
                int r4 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r6 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r7 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r8 = r0.fieldTokens
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r10 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(r28)
                r15 = r29
                net.bytebuddy.description.field.FieldDescription$Token r10 = r15.accept(r10)
                java.util.List r8 = net.bytebuddy.utility.CompoundList.of(r8, r10)
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r10 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r11 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r12 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r13 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer$Compound r14 = new net.bytebuddy.implementation.LoadedTypeInitializer$Compound
                r16 = r14
                net.bytebuddy.implementation.LoadedTypeInitializer r15 = r0.loadedTypeInitializer
                r26 = r2
                net.bytebuddy.implementation.LoadedTypeInitializer$ForStaticField r2 = new net.bytebuddy.implementation.LoadedTypeInitializer$ForStaticField
                r27 = r3
                java.lang.String r3 = r29.getName()
                r2.<init>(r3, r1)
                r1 = 2
                net.bytebuddy.implementation.LoadedTypeInitializer[] r1 = new net.bytebuddy.implementation.LoadedTypeInitializer[r1]
                r3 = 0
                r1[r3] = r15
                r3 = 1
                r1[r3] = r2
                r2 = r16
                r2.<init>(r1)
                net.bytebuddy.description.type.TypeDescription r15 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r0.enclosingMethod
                r16 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r18 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r19 = r1
                boolean r1 = r0.anonymousClass
                r20 = r1
                boolean r1 = r0.localClass
                r21 = r1
                boolean r1 = r0.record
                r22 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r23 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r24 = r1
                r2 = r26
                r3 = r27
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return r25
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withAuxiliaryField(net.bytebuddy.description.field.FieldDescription.Token r1, java.lang.Object r2) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withAuxiliaryField(r1, r2)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withDeclaredTypes(net.bytebuddy.description.type.TypeList r28) {
                r27 = this;
                r0 = r27
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r25 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r26 = r2
                r2 = r28
                java.util.List r17 = net.bytebuddy.utility.CompoundList.of(r1, r2)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r25
                r2 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withDeclaredTypes(net.bytebuddy.description.type.TypeList r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withDeclaredTypes(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withDeclaringType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r26) {
                r25 = this;
                r0 = r25
                r14 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r26 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withDeclaringType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withDeclaringType(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withEnclosingMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r27) {
                r26 = this;
                r0 = r26
                r15 = r27
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.type.TypeDescription r16 = r27.getDeclaringType()
                r25 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withEnclosingMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withEnclosingMethod(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withEnclosingType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r26) {
                r25 = this;
                r0 = r25
                r16 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = net.bytebuddy.description.method.MethodDescription.UNDEFINED
                r26 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withEnclosingType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withEnclosingType(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withField(net.bytebuddy.description.field.FieldDescription.Token r27) {
                r26 = this;
                r0 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r8 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(r26)
                r9 = r27
                net.bytebuddy.description.field.FieldDescription$Token r8 = r9.accept(r8)
                java.util.List r7 = net.bytebuddy.utility.CompoundList.of(r7, r8)
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r25 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withField(net.bytebuddy.description.field.FieldDescription.Token r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withField(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withInitializer(net.bytebuddy.implementation.LoadedTypeInitializer r27) {
                r26 = this;
                r0 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer$Compound r14 = new net.bytebuddy.implementation.LoadedTypeInitializer$Compound
                r13 = r14
                net.bytebuddy.implementation.LoadedTypeInitializer r15 = r0.loadedTypeInitializer
                r25 = r1
                r1 = 2
                net.bytebuddy.implementation.LoadedTypeInitializer[] r1 = new net.bytebuddy.implementation.LoadedTypeInitializer[r1]
                r16 = 0
                r1[r16] = r15
                r15 = 1
                r1[r15] = r27
                r14.<init>(r1)
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withInitializer(net.bytebuddy.implementation.bytecode.ByteCodeAppender r27) {
                r26 = this;
                r0 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                r13 = r27
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r12.expandWith(r13)
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r25 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withInitializer(net.bytebuddy.implementation.LoadedTypeInitializer r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withInitializer(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withInitializer(net.bytebuddy.implementation.bytecode.ByteCodeAppender r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withInitializer(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withInterfaces(net.bytebuddy.description.type.TypeList.Generic r27) {
                r26 = this;
                r0 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r7 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(r26)
                r8 = r27
                net.bytebuddy.description.type.TypeList$Generic r7 = r8.accept(r7)
                java.util.List r6 = net.bytebuddy.utility.CompoundList.of(r6, r7)
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r25 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withInterfaces(net.bytebuddy.description.type.TypeList.Generic r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withInterfaces(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withLocalClass(boolean r26) {
                r25 = this;
                r0 = r25
                r20 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r26 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r19 = 0
                r1 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withLocalClass(boolean r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withLocalClass(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withMethod(net.bytebuddy.description.method.MethodDescription.Token r27) {
                r26 = this;
                r0 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r10 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(r26)
                r11 = r27
                net.bytebuddy.description.method.MethodDescription$Token r10 = r11.accept(r10)
                java.util.List r9 = net.bytebuddy.utility.CompoundList.of(r9, r10)
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r25 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withMethod(net.bytebuddy.description.method.MethodDescription.Token r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withMethod(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withModifiers(int r26) {
                r25 = this;
                r0 = r25
                r3 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r26 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withModifiers(int r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withModifiers(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withName(java.lang.String r26) {
                r25 = this;
                r0 = r25
                r2 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r26 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withNestHost(net.bytebuddy.description.type.TypeDescription r27) {
                r26 = this;
                r0 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r15
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r15 = r0.declaredTypes
                r17 = r15
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r15 = r0.permittedSubclasses
                r18 = r15
                boolean r15 = r0.anonymousClass
                r19 = r15
                boolean r15 = r0.localClass
                r20 = r15
                boolean r15 = r0.record
                r21 = r1
                r1 = r27
                boolean r22 = r1.equals(r0)
                if (r22 == 0) goto L42
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.dynamic.TargetType.DESCRIPTION
            L42:
                r22 = r1
                java.util.List r23 = java.util.Collections.emptyList()
                r1 = r24
                r25 = r15
                r15 = r16
                r16 = r21
                r21 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withNestHost(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withNestHost(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withNestMembers(net.bytebuddy.description.type.TypeList r27) {
                r26 = this;
                r0 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r25 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r22 = net.bytebuddy.dynamic.TargetType.DESCRIPTION
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r0 = r27
                java.util.List r23 = net.bytebuddy.utility.CompoundList.of(r1, r0)
                r1 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withNestMembers(net.bytebuddy.description.type.TypeList r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withNestMembers(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withPermittedSubclasses(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeList r27) {
                r26 = this;
                r0 = r26
                r1 = r27
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r16 = r15
                net.bytebuddy.description.type.TypeDescription r15 = r0.enclosingType
                r17 = r15
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r15 = r0.declaredTypes
                r18 = r15
                if (r1 == 0) goto L37
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r15 = r0.permittedSubclasses
                if (r15 != 0) goto L33
                goto L37
            L33:
                java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r15, r1)
            L37:
                r25 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r24
                r15 = r16
                r16 = r17
                r17 = r18
                r18 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withPermittedSubclasses(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeList r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withPermittedSubclasses(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withRecord(boolean r26) {
                r25 = this;
                r0 = r25
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                if (r26 == 0) goto L1a
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r1 = r0.recordComponentTokens
            L18:
                r10 = r1
                goto L1f
            L1a:
                java.util.List r1 = java.util.Collections.emptyList()
                goto L18
            L1f:
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r24
                r21 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withRecord(boolean r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withRecord(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withRecordComponent(net.bytebuddy.description.type.RecordComponentDescription.Token r27) {
                r26 = this;
                r0 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r11 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(r26)
                r12 = r27
                net.bytebuddy.description.type.RecordComponentDescription$Token r11 = r12.accept(r11)
                java.util.List r10 = net.bytebuddy.utility.CompoundList.of(r10, r11)
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r25 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r21 = 1
                r1 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withRecordComponent(net.bytebuddy.description.type.RecordComponentDescription.Token r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withRecordComponent(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withTypeVariable(net.bytebuddy.description.type.TypeVariableToken r27) {
                r26 = this;
                r0 = r26
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r5 = r0.typeVariables
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r6 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForDetachment.of(r26)
                r7 = r27
                net.bytebuddy.description.type.TypeVariableToken r6 = r7.accept(r6)
                java.util.List r5 = net.bytebuddy.utility.CompoundList.of(r5, r6)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r25 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r25
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withTypeVariable(net.bytebuddy.description.type.TypeVariableToken r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withTypeVariable(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withTypeVariables(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r26, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.TypeVariableToken> r27) {
                r25 = this;
                r0 = r25
                java.util.ArrayList r5 = new java.util.ArrayList
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r1 = r0.typeVariables
                int r1 = r1.size()
                r5.<init>(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeVariableToken> r1 = r0.typeVariables
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
            L14:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L42
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.type.TypeVariableToken r3 = (net.bytebuddy.description.type.TypeVariableToken) r3
                net.bytebuddy.description.type.TypeList$Generic r4 = r25.getTypeVariables()
                int r6 = r2 + 1
                java.lang.Object r2 = r4.get(r2)
                r4 = r26
                boolean r2 = r4.matches(r2)
                if (r2 == 0) goto L3b
                r2 = r27
                java.lang.Object r3 = r2.transform(r0, r3)
                net.bytebuddy.description.type.TypeVariableToken r3 = (net.bytebuddy.description.type.TypeVariableToken) r3
                goto L3d
            L3b:
                r2 = r27
            L3d:
                r5.add(r3)
                r2 = r6
                goto L14
            L42:
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r24 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                r1 = r24
                java.lang.String r2 = r0.name
                int r3 = r0.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.superClass
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription$Generic> r6 = r0.interfaceTypes
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$Token> r7 = r0.fieldTokens
                java.util.Map<java.lang.String, java.lang.Object> r8 = r0.auxiliaryFields
                java.util.List<? extends net.bytebuddy.description.method.MethodDescription$Token> r9 = r0.methodTokens
                java.util.List<? extends net.bytebuddy.description.type.RecordComponentDescription$Token> r10 = r0.recordComponentTokens
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r11 = r0.annotationDescriptions
                net.bytebuddy.dynamic.scaffold.TypeInitializer r12 = r0.typeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r13 = r0.loadedTypeInitializer
                net.bytebuddy.description.type.TypeDescription r14 = r0.declaringType
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r15 = r0.enclosingMethod
                r26 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.enclosingType
                r16 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.declaredTypes
                r17 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.permittedSubclasses
                r18 = r1
                boolean r1 = r0.anonymousClass
                r19 = r1
                boolean r1 = r0.localClass
                r20 = r1
                boolean r1 = r0.record
                r21 = r1
                net.bytebuddy.description.type.TypeDescription r1 = r0.nestHost
                r22 = r1
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r0.nestMembers
                r23 = r1
                r1 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
                return r24
        }
    }

    public interface Factory {

        public enum Default extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default> implements net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default FROZEN = null;
            public static final net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default MODIFIABLE = null;



            static {
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default$1 r0 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default$1
                    java.lang.String r1 = "MODIFIABLE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.MODIFIABLE = r0
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default$2 r1 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default$2
                    java.lang.String r3 = "FROZEN"
                    r4 = 1
                    r1.<init>(r3, r4)
                    net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.FROZEN = r1
                    r3 = 2
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default[] r3 = new net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default[r3]
                    r3[r2] = r0
                    r3[r4] = r1
                    net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.$VALUES = r3
                    return
            }

            Default(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* synthetic */ Default(java.lang.String r1, int r2, net.bytebuddy.dynamic.scaffold.InstrumentedType.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default> r0 = net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default r1 = (net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default[] values() {
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default[] r0 = net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Factory$Default[] r0 = (net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory.Default[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Factory
            public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName subclass(java.lang.String r25, int r26, net.bytebuddy.description.type.TypeDescription.Generic r27) {
                    r24 = this;
                    r1 = r25
                    r2 = r26
                    r3 = r27
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Default r23 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Default
                    r0 = r23
                    java.util.List r4 = java.util.Collections.emptyList()
                    java.util.List r5 = java.util.Collections.emptyList()
                    java.util.List r6 = java.util.Collections.emptyList()
                    java.util.Map r7 = java.util.Collections.emptyMap()
                    java.util.List r8 = java.util.Collections.emptyList()
                    java.util.List r9 = java.util.Collections.emptyList()
                    java.util.List r10 = java.util.Collections.emptyList()
                    net.bytebuddy.dynamic.scaffold.TypeInitializer$None r11 = net.bytebuddy.dynamic.scaffold.TypeInitializer.None.INSTANCE
                    net.bytebuddy.implementation.LoadedTypeInitializer$NoOp r12 = net.bytebuddy.implementation.LoadedTypeInitializer.NoOp.INSTANCE
                    net.bytebuddy.description.type.TypeDescription r13 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                    r15 = r13
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r14 = net.bytebuddy.description.method.MethodDescription.UNDEFINED
                    java.util.List r16 = java.util.Collections.emptyList()
                    net.bytebuddy.description.type.TypeList r17 = net.bytebuddy.description.type.TypeList.UNDEFINED
                    net.bytebuddy.description.type.TypeDescription r21 = net.bytebuddy.dynamic.TargetType.DESCRIPTION
                    java.util.List r22 = java.util.Collections.emptyList()
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
                    return r23
            }
        }

        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName represent(net.bytebuddy.description.type.TypeDescription r1);

        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName subclass(java.lang.String r1, int r2, net.bytebuddy.description.type.TypeDescription.Generic r3);
    }

    public static class Frozen extends net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType implements net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName {
        private final net.bytebuddy.implementation.LoadedTypeInitializer loadedTypeInitializer;
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        public Frozen(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.LoadedTypeInitializer r2) {
                r0 = this;
                r0.<init>()
                r0.typeDescription = r1
                r0.loadedTypeInitializer = r2
                return
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public int getActualModifiers(boolean r2) {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                int r2 = r0.getActualModifiers(r2)
                return r2
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.ClassFileVersion getClassFileVersion() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.ClassFileVersion r0 = r0.getClassFileVersion()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> getDeclaredFields() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.method.MethodList<net.bytebuddy.description.method.MethodDescription.InDefinedShape> getDeclaredMethods() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getDeclaredTypes() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.TypeList r0 = r0.getDeclaredTypes()
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.MaybeNull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.DeclaredByType
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape getEnclosingMethod() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.getEnclosingMethod()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription getEnclosingType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.TypeDescription r0 = r0.getEnclosingType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithDescriptor
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.String getGenericSignature() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                java.lang.String r0 = r0.getGenericSignature()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.TypeList.Generic getInterfaces() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.getInterfaces()
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.implementation.LoadedTypeInitializer getLoadedTypeInitializer() {
                r1 = this;
                net.bytebuddy.implementation.LoadedTypeInitializer r0 = r1.loadedTypeInitializer
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                int r0 = r0.getModifiers()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeDescription getNestHost() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.TypeDescription r0 = r0.getNestHost()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getNestMembers() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.TypeList r0 = r0.getNestMembers()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.PackageDescription getPackage() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.PackageDescription r0 = r0.getPackage()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public net.bytebuddy.description.type.TypeList getPermittedSubtypes() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.TypeList r0 = r0.getPermittedSubtypes()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription, net.bytebuddy.description.type.TypeDefinition
        public net.bytebuddy.description.type.RecordComponentList<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape> getRecordComponents() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.RecordComponentList r0 = r0.getRecordComponents()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.description.type.TypeDescription.Generic getSuperClass() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getSuperClass()
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.TypeInitializer getTypeInitializer() {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.TypeInitializer$None r0 = net.bytebuddy.dynamic.scaffold.TypeInitializer.None.INSTANCE
                return r0
        }

        @Override // net.bytebuddy.description.TypeVariableSource
        public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.getTypeVariables()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                boolean r0 = r0.isAnonymousType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                boolean r0 = r0.isLocalType()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDefinition
        public boolean isRecord() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                boolean r0 = r0.isRecord()
                return r0
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase, net.bytebuddy.description.type.TypeDescription
        public boolean isSealed() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                boolean r0 = r0.isSealed()
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.description.type.TypeDescription validated() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withAnnotations(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot add annotation to frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withAnnotations(java.util.List r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withAnnotations(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withAnonymousClass(boolean r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot define anonymous class state for frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withAnonymousClass(boolean r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withAnonymousClass(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withAuxiliaryField(net.bytebuddy.description.field.FieldDescription.Token r2, java.lang.Object r3) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "Cannot define auxiliary field for frozen type: "
                r3.append(r0)
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withAuxiliaryField(net.bytebuddy.description.field.FieldDescription.Token r1, java.lang.Object r2) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withAuxiliaryField(r1, r2)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withDeclaredTypes(net.bytebuddy.description.type.TypeList r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot add declared types to frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withDeclaredTypes(net.bytebuddy.description.type.TypeList r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withDeclaredTypes(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withDeclaringType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot add declaring type to frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withDeclaringType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withDeclaringType(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withEnclosingMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot set enclosing method of frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withEnclosingMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withEnclosingMethod(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withEnclosingType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot set enclosing type of frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withEnclosingType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withEnclosingType(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withField(net.bytebuddy.description.field.FieldDescription.Token r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot define field for frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withField(net.bytebuddy.description.field.FieldDescription.Token r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withField(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withInitializer(net.bytebuddy.implementation.LoadedTypeInitializer r7) {
                r6 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Frozen r0 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Frozen
                net.bytebuddy.description.type.TypeDescription r1 = r6.typeDescription
                net.bytebuddy.implementation.LoadedTypeInitializer$Compound r2 = new net.bytebuddy.implementation.LoadedTypeInitializer$Compound
                net.bytebuddy.implementation.LoadedTypeInitializer r3 = r6.loadedTypeInitializer
                r4 = 2
                net.bytebuddy.implementation.LoadedTypeInitializer[] r4 = new net.bytebuddy.implementation.LoadedTypeInitializer[r4]
                r5 = 0
                r4[r5] = r3
                r3 = 1
                r4[r3] = r7
                r2.<init>(r4)
                r0.<init>(r1, r2)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withInitializer(net.bytebuddy.implementation.bytecode.ByteCodeAppender r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot add initializer to frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withInitializer(net.bytebuddy.implementation.LoadedTypeInitializer r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withInitializer(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withInitializer(net.bytebuddy.implementation.bytecode.ByteCodeAppender r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withInitializer(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withInterfaces(net.bytebuddy.description.type.TypeList.Generic r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot add interfaces for frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withInterfaces(net.bytebuddy.description.type.TypeList.Generic r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withInterfaces(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withLocalClass(boolean r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot define local class state for frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withLocalClass(boolean r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withLocalClass(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withMethod(net.bytebuddy.description.method.MethodDescription.Token r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot define method for frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withMethod(net.bytebuddy.description.method.MethodDescription.Token r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withMethod(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withModifiers(int r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot change modifiers for frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withModifiers(int r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withModifiers(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withName(java.lang.String r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot change name of frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withNestHost(net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot set nest host of frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withNestHost(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withNestHost(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withNestMembers(net.bytebuddy.description.type.TypeList r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot add nest members to frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withNestMembers(net.bytebuddy.description.type.TypeList r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withNestMembers(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withPermittedSubclasses(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeList r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot add permitted subclasses to frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withPermittedSubclasses(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeList r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withPermittedSubclasses(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withRecord(boolean r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot define record state for frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withRecord(boolean r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withRecord(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withRecordComponent(net.bytebuddy.description.type.RecordComponentDescription.Token r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot define record component for frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withRecordComponent(net.bytebuddy.description.type.RecordComponentDescription.Token r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withRecordComponent(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName, net.bytebuddy.dynamic.scaffold.InstrumentedType
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withTypeVariable(net.bytebuddy.description.type.TypeVariableToken r3) {
                r2 = this;
                java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot define type variable for frozen type: "
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType withTypeVariable(net.bytebuddy.description.type.TypeVariableToken r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.withTypeVariable(r1)
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName
        public net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withTypeVariables(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r2, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.TypeVariableToken> r3) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "Cannot add type variables of frozen type: "
                r3.append(r0)
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
        }
    }

    public interface Prepareable {

        public enum NoOp extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp> implements net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable {
            private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp[] $VALUES = null;
            public static final net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable$NoOp r0 = new net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp.INSTANCE = r0
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable$NoOp[] r0 = new net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp[]{r0}
                    net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable$NoOp> r0 = net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable$NoOp r1 = (net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp[] values() {
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable$NoOp[] r0 = net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable$NoOp[] r0 = (net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                    r0 = this;
                    return r1
            }
        }

        net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1);
    }

    public interface WithFlexibleName extends net.bytebuddy.dynamic.scaffold.InstrumentedType {
        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withAnnotations(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withAnonymousClass(boolean r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withAuxiliaryField(net.bytebuddy.description.field.FieldDescription.Token r1, java.lang.Object r2);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withDeclaredTypes(net.bytebuddy.description.type.TypeList r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withDeclaringType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withEnclosingMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withEnclosingType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withField(net.bytebuddy.description.field.FieldDescription.Token r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withInitializer(net.bytebuddy.implementation.LoadedTypeInitializer r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withInitializer(net.bytebuddy.implementation.bytecode.ByteCodeAppender r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withInterfaces(net.bytebuddy.description.type.TypeList.Generic r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withLocalClass(boolean r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withMethod(net.bytebuddy.description.method.MethodDescription.Token r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withModifiers(int r1);

        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withName(java.lang.String r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withNestHost(net.bytebuddy.description.type.TypeDescription r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withNestMembers(net.bytebuddy.description.type.TypeList r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withPermittedSubclasses(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeList r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withRecord(boolean r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withRecordComponent(net.bytebuddy.description.type.RecordComponentDescription.Token r1);

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType
        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withTypeVariable(net.bytebuddy.description.type.TypeVariableToken r1);

        net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName withTypeVariables(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.TypeVariableToken> r2);
    }

    net.bytebuddy.implementation.LoadedTypeInitializer getLoadedTypeInitializer();

    net.bytebuddy.dynamic.scaffold.TypeInitializer getTypeInitializer();

    net.bytebuddy.description.type.TypeDescription validated();

    net.bytebuddy.dynamic.scaffold.InstrumentedType withAnnotations(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withAnonymousClass(boolean r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withAuxiliaryField(net.bytebuddy.description.field.FieldDescription.Token r1, java.lang.Object r2);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withDeclaredTypes(net.bytebuddy.description.type.TypeList r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withDeclaringType(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withEnclosingMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withEnclosingType(net.bytebuddy.description.type.TypeDescription r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withField(net.bytebuddy.description.field.FieldDescription.Token r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withInitializer(net.bytebuddy.implementation.LoadedTypeInitializer r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withInitializer(net.bytebuddy.implementation.bytecode.ByteCodeAppender r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withInterfaces(net.bytebuddy.description.type.TypeList.Generic r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withLocalClass(boolean r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withMethod(net.bytebuddy.description.method.MethodDescription.Token r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withModifiers(int r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withNestHost(net.bytebuddy.description.type.TypeDescription r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withNestMembers(net.bytebuddy.description.type.TypeList r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withPermittedSubclasses(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeList r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withRecord(boolean r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withRecordComponent(net.bytebuddy.description.type.RecordComponentDescription.Token r1);

    net.bytebuddy.dynamic.scaffold.InstrumentedType withTypeVariable(net.bytebuddy.description.type.TypeVariableToken r1);
}
