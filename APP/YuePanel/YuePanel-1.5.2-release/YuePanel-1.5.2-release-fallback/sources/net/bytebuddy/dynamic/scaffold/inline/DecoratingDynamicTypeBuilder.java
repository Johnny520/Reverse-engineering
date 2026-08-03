package net.bytebuddy.dynamic.scaffold.inline;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class DecoratingDynamicTypeBuilder<T> extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.UsingTypeWriter<T> {
    private final net.bytebuddy.implementation.attribute.AnnotationRetention annotationRetention;
    private final net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory annotationValueFilterFactory;
    private final net.bytebuddy.asm.AsmVisitorWrapper asmVisitorWrapper;
    private final net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy auxiliaryTypeNamingStrategy;
    private final java.util.List<net.bytebuddy.dynamic.DynamicType> auxiliaryTypes;
    private final net.bytebuddy.dynamic.ClassFileLocator classFileLocator;
    private final net.bytebuddy.ClassFileVersion classFileVersion;
    private final net.bytebuddy.dynamic.scaffold.ClassWriterStrategy classWriterStrategy;
    private final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> ignoredMethods;
    private final net.bytebuddy.implementation.Implementation.Context.Factory implementationContextFactory;
    private final net.bytebuddy.description.type.TypeDescription instrumentedType;
    private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;
    private final net.bytebuddy.implementation.attribute.TypeAttributeAppender typeAttributeAppender;
    private final net.bytebuddy.dynamic.scaffold.TypeValidation typeValidation;

    public DecoratingDynamicTypeBuilder(net.bytebuddy.description.type.TypeDescription r17, net.bytebuddy.ClassFileVersion r18, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r19, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r20, net.bytebuddy.implementation.attribute.AnnotationRetention r21, net.bytebuddy.implementation.Implementation.Context.Factory r22, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r23, net.bytebuddy.dynamic.scaffold.TypeValidation r24, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r25, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r26, net.bytebuddy.dynamic.ClassFileLocator r27) {
            r16 = this;
            boolean r0 = r21.isEnabled()
            if (r0 == 0) goto Lf
            net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType$Differentiating r0 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType$Differentiating
            r2 = r17
            r0.<init>(r2)
        Ld:
            r3 = r0
            goto L14
        Lf:
            r2 = r17
            net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType r0 = net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType.INSTANCE
            goto Ld
        L14:
            net.bytebuddy.asm.AsmVisitorWrapper$NoOp r4 = net.bytebuddy.asm.AsmVisitorWrapper.NoOp.INSTANCE
            java.util.List r14 = java.util.Collections.emptyList()
            r1 = r16
            r2 = r17
            r5 = r18
            r6 = r19
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = r23
            r11 = r24
            r12 = r25
            r13 = r26
            r15 = r27
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
    }

    public DecoratingDynamicTypeBuilder(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.attribute.TypeAttributeAppender r2, net.bytebuddy.asm.AsmVisitorWrapper r3, net.bytebuddy.ClassFileVersion r4, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r5, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r6, net.bytebuddy.implementation.attribute.AnnotationRetention r7, net.bytebuddy.implementation.Implementation.Context.Factory r8, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r9, net.bytebuddy.dynamic.scaffold.TypeValidation r10, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r12, java.util.List<net.bytebuddy.dynamic.DynamicType> r13, net.bytebuddy.dynamic.ClassFileLocator r14) {
            r0 = this;
            r0.<init>()
            r0.instrumentedType = r1
            r0.typeAttributeAppender = r2
            r0.asmVisitorWrapper = r3
            r0.classFileVersion = r4
            r0.auxiliaryTypeNamingStrategy = r5
            r0.annotationValueFilterFactory = r6
            r0.annotationRetention = r7
            r0.implementationContextFactory = r8
            r0.methodGraphCompiler = r9
            r0.typeValidation = r10
            r0.classWriterStrategy = r11
            r0.ignoredMethods = r12
            r0.auxiliaryTypes = r13
            r0.classFileLocator = r14
            return
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> annotateType(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3) {
            r2 = this;
            net.bytebuddy.implementation.attribute.TypeAttributeAppender$Explicit r0 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender$Explicit
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r3)
            r0.<init>(r1)
            net.bytebuddy.dynamic.DynamicType$Builder r3 = r2.attribute(r0)
            return r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> attribute(net.bytebuddy.implementation.attribute.TypeAttributeAppender r18) {
            r17 = this;
            r0 = r17
            net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder r16 = new net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder
            net.bytebuddy.description.type.TypeDescription r2 = r0.instrumentedType
            net.bytebuddy.implementation.attribute.TypeAttributeAppender$Compound r3 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender$Compound
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r1 = r0.typeAttributeAppender
            r4 = 2
            net.bytebuddy.implementation.attribute.TypeAttributeAppender[] r4 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r18
            r3.<init>(r4)
            net.bytebuddy.asm.AsmVisitorWrapper r4 = r0.asmVisitorWrapper
            net.bytebuddy.ClassFileVersion r5 = r0.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r6 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r7 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r8 = r0.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r9 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r10 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r11 = r0.typeValidation
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r12 = r0.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r13 = r0.ignoredMethods
            java.util.List<net.bytebuddy.dynamic.DynamicType> r14 = r0.auxiliaryTypes
            net.bytebuddy.dynamic.ClassFileLocator r15 = r0.classFileLocator
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> declaredTypes(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change type declaration of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineConstructor(int r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot define constructor for decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<T> defineField(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot define field for decorated type: "
            r2.append(r3)
            net.bytebuddy.description.type.TypeDescription r3 = r0.instrumentedType
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineMethod(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, int r3) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot define method for decorated type: "
            r2.append(r3)
            net.bytebuddy.description.type.TypeDescription r3 = r0.instrumentedType
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<T> defineRecordComponent(java.lang.String r2, net.bytebuddy.description.type.TypeDefinition r3) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Cannot define record component for decorated type: "
            r3.append(r0)
            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
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
            net.bytebuddy.implementation.attribute.AnnotationRetention r2 = r4.annotationRetention
            net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder r5 = (net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder) r5
            net.bytebuddy.implementation.attribute.AnnotationRetention r3 = r5.annotationRetention
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.dynamic.scaffold.TypeValidation r2 = r4.typeValidation
            net.bytebuddy.dynamic.scaffold.TypeValidation r3 = r5.typeValidation
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
            net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            return r1
        L36:
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r2 = r4.typeAttributeAppender
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r3 = r5.typeAttributeAppender
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            return r1
        L41:
            net.bytebuddy.asm.AsmVisitorWrapper r2 = r4.asmVisitorWrapper
            net.bytebuddy.asm.AsmVisitorWrapper r3 = r5.asmVisitorWrapper
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4c
            return r1
        L4c:
            net.bytebuddy.ClassFileVersion r2 = r4.classFileVersion
            net.bytebuddy.ClassFileVersion r3 = r5.classFileVersion
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L57
            return r1
        L57:
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r2 = r4.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r5.auxiliaryTypeNamingStrategy
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L62
            return r1
        L62:
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r2 = r4.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r5.annotationValueFilterFactory
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L6d
            return r1
        L6d:
            net.bytebuddy.implementation.Implementation$Context$Factory r2 = r4.implementationContextFactory
            net.bytebuddy.implementation.Implementation$Context$Factory r3 = r5.implementationContextFactory
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L78
            return r1
        L78:
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r5.methodGraphCompiler
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L83
            return r1
        L83:
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r2 = r4.classWriterStrategy
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r3 = r5.classWriterStrategy
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8e
            return r1
        L8e:
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.ignoredMethods
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.ignoredMethods
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L99
            return r1
        L99:
            java.util.List<net.bytebuddy.dynamic.DynamicType> r2 = r4.auxiliaryTypes
            java.util.List<net.bytebuddy.dynamic.DynamicType> r3 = r5.auxiliaryTypes
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto La4
            return r1
        La4:
            net.bytebuddy.dynamic.ClassFileLocator r2 = r4.classFileLocator
            net.bytebuddy.dynamic.ClassFileLocator r5 = r5.classFileLocator
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto Laf
            return r1
        Laf:
            return r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable<T> field(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change field for decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r1 = r2.typeAttributeAppender
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.asm.AsmVisitorWrapper r1 = r2.asmVisitorWrapper
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.ClassFileVersion r1 = r2.classFileVersion
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r1 = r2.auxiliaryTypeNamingStrategy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r1 = r2.annotationValueFilterFactory
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.attribute.AnnotationRetention r1 = r2.annotationRetention
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.Implementation$Context$Factory r1 = r2.implementationContextFactory
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r2.methodGraphCompiler
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.TypeValidation r1 = r2.typeValidation
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r1 = r2.classWriterStrategy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.ignoredMethods
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<net.bytebuddy.dynamic.DynamicType> r1 = r2.auxiliaryTypes
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.ClassFileLocator r1 = r2.classFileLocator
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> ignoreAlso(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r18) {
            r17 = this;
            r0 = r17
            net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder r16 = new net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder
            net.bytebuddy.description.type.TypeDescription r2 = r0.instrumentedType
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r3 = r0.typeAttributeAppender
            net.bytebuddy.asm.AsmVisitorWrapper r4 = r0.asmVisitorWrapper
            net.bytebuddy.ClassFileVersion r5 = r0.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r6 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r7 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r8 = r0.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r9 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r10 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r11 = r0.typeValidation
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r12 = r0.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher$Disjunction r13 = new net.bytebuddy.matcher.LatentMatcher$Disjunction
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r0.ignoredMethods
            r14 = 2
            net.bytebuddy.matcher.LatentMatcher[] r14 = new net.bytebuddy.matcher.LatentMatcher[r14]
            r15 = 0
            r14[r15] = r1
            r1 = 1
            r14[r1] = r18
            r13.<init>(r14)
            java.util.List<net.bytebuddy.dynamic.DynamicType> r14 = r0.auxiliaryTypes
            net.bytebuddy.dynamic.ClassFileLocator r15 = r0.classFileLocator
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<T> implement(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot implement interface for decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> initializer(net.bytebuddy.implementation.LoadedTypeInitializer r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot add initializer of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> initializer(net.bytebuddy.implementation.bytecode.ByteCodeAppender r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot add initializer of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition.ForType<T> innerTypeOf(net.bytebuddy.description.type.TypeDescription r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change type declaration of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition<T> innerTypeOf(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change type declaration of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<T> invokable(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot intercept method for decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> merge(java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForType> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change modifiers of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> modifiers(int r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change modifiers of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> name(java.lang.String r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change name of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> nestHost(net.bytebuddy.description.type.TypeDescription r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change type declaration of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> nestMembers(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change type declaration of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> permittedSubclass(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change permitted subclasses of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition<T> recordComponent(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change record component for decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> require(java.util.Collection<net.bytebuddy.dynamic.DynamicType> r18) {
            r17 = this;
            r0 = r17
            net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder r16 = new net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder
            net.bytebuddy.description.type.TypeDescription r2 = r0.instrumentedType
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r3 = r0.typeAttributeAppender
            net.bytebuddy.asm.AsmVisitorWrapper r4 = r0.asmVisitorWrapper
            net.bytebuddy.ClassFileVersion r5 = r0.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r6 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r7 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r8 = r0.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r9 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r10 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r11 = r0.typeValidation
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r12 = r0.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r13 = r0.ignoredMethods
            java.util.List<net.bytebuddy.dynamic.DynamicType> r1 = r0.auxiliaryTypes
            java.util.ArrayList r14 = new java.util.ArrayList
            r15 = r18
            r14.<init>(r15)
            java.util.List r14 = net.bytebuddy.utility.CompoundList.of(r1, r14)
            net.bytebuddy.dynamic.ClassFileLocator r15 = r0.classFileLocator
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> suffix(java.lang.String r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot change name of decorated type: "
            r0.append(r1)
            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.description.type.TypeDescription toTypeDescription() {
            r1 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
            return r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.UsingTypeWriter
    public net.bytebuddy.dynamic.scaffold.TypeWriter<T> toTypeWriter() {
            r1 = this;
            net.bytebuddy.pool.TypePool$Empty r0 = net.bytebuddy.pool.TypePool.Empty.INSTANCE
            net.bytebuddy.dynamic.scaffold.TypeWriter r0 = r1.toTypeWriter(r0)
            return r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.UsingTypeWriter
    public net.bytebuddy.dynamic.scaffold.TypeWriter<T> toTypeWriter(net.bytebuddy.pool.TypePool r15) {
            r14 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r14.instrumentedType
            net.bytebuddy.ClassFileVersion r1 = r14.classFileVersion
            java.util.List<net.bytebuddy.dynamic.DynamicType> r2 = r14.auxiliaryTypes
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r14.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r3 = r3.compile(r0)
            net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r3 = r3.listNodes()
            net.bytebuddy.description.method.MethodList r3 = r3.asMethodList()
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r4 = r14.ignoredMethods
            net.bytebuddy.description.type.TypeDescription r5 = r14.instrumentedType
            net.bytebuddy.matcher.ElementMatcher r4 = r4.resolve(r5)
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.not(r4)
            net.bytebuddy.matcher.FilterableList r3 = r3.filter(r4)
            net.bytebuddy.description.type.TypeDescription r4 = r14.instrumentedType
            net.bytebuddy.description.method.MethodList r4 = r4.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.isVirtual()
            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.not(r5)
            net.bytebuddy.matcher.FilterableList r4 = r4.filter(r5)
            java.util.List r3 = net.bytebuddy.utility.CompoundList.of(r3, r4)
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r4 = r14.typeAttributeAppender
            net.bytebuddy.asm.AsmVisitorWrapper r5 = r14.asmVisitorWrapper
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r6 = r14.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r7 = r14.annotationRetention
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r14.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.Implementation$Context$Factory r9 = r14.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r10 = r14.typeValidation
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r11 = r14.classWriterStrategy
            net.bytebuddy.description.type.TypeDescription r12 = r14.instrumentedType
            java.util.List<net.bytebuddy.dynamic.DynamicType> r13 = r14.auxiliaryTypes
            net.bytebuddy.pool.TypePool r12 = net.bytebuddy.pool.TypePool.Explicit.wrap(r12, r13, r15)
            net.bytebuddy.dynamic.ClassFileLocator r13 = r14.classFileLocator
            net.bytebuddy.dynamic.scaffold.TypeWriter r15 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.forDecoration(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r15
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> topLevelType() {
            r3 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot change type declaration of decorated type: "
            r1.append(r2)
            net.bytebuddy.description.type.TypeDescription r2 = r3.instrumentedType
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> transform(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r2, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.TypeVariableToken> r3) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Cannot transform decorated type: "
            r3.append(r0)
            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<T> typeVariable(java.lang.String r2, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r3) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "Cannot add type variable to decorated type: "
            r3.append(r0)
            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> unsealed() {
            r3 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot unseal decorated type: "
            r1.append(r2)
            net.bytebuddy.description.type.TypeDescription r2 = r3.instrumentedType
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder
    public net.bytebuddy.dynamic.DynamicType.Builder<T> visit(net.bytebuddy.asm.AsmVisitorWrapper r18) {
            r17 = this;
            r0 = r17
            net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder r16 = new net.bytebuddy.dynamic.scaffold.inline.DecoratingDynamicTypeBuilder
            net.bytebuddy.description.type.TypeDescription r2 = r0.instrumentedType
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r3 = r0.typeAttributeAppender
            net.bytebuddy.asm.AsmVisitorWrapper$Compound r4 = new net.bytebuddy.asm.AsmVisitorWrapper$Compound
            net.bytebuddy.asm.AsmVisitorWrapper r1 = r0.asmVisitorWrapper
            r5 = 2
            net.bytebuddy.asm.AsmVisitorWrapper[] r5 = new net.bytebuddy.asm.AsmVisitorWrapper[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r18
            r4.<init>(r5)
            net.bytebuddy.ClassFileVersion r5 = r0.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r6 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r7 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r8 = r0.annotationRetention
            net.bytebuddy.implementation.Implementation$Context$Factory r9 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r10 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r11 = r0.typeValidation
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r12 = r0.classWriterStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r13 = r0.ignoredMethods
            java.util.List<net.bytebuddy.dynamic.DynamicType> r14 = r0.auxiliaryTypes
            net.bytebuddy.dynamic.ClassFileLocator r15 = r0.classFileLocator
            r1 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r16
    }
}
