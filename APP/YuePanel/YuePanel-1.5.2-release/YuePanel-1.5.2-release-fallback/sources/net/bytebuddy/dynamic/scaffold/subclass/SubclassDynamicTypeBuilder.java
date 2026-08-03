package net.bytebuddy.dynamic.scaffold.subclass;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class SubclassDynamicTypeBuilder<T> extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter<T> {
    private final net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy constructorStrategy;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class InstrumentableMatcher implements net.bytebuddy.matcher.LatentMatcher<net.bytebuddy.description.method.MethodDescription> {
        private final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> ignoredMethods;

        public InstrumentableMatcher(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1) {
                r0 = this;
                r0.<init>()
                r0.ignoredMethods = r1
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
                net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.ignoredMethods
                net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder$InstrumentableMatcher r5 = (net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder.InstrumentableMatcher) r5
                net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r5.ignoredMethods
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
                net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.ignoredMethods
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.matcher.LatentMatcher
        public net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> resolve(net.bytebuddy.description.type.TypeDescription r3) {
                r2 = this;
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isVirtual()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isFinal()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.not(r1)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r3)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
                net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.ignoredMethods
                net.bytebuddy.matcher.ElementMatcher r1 = r1.resolve(r3)
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.not(r1)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.and(r1)
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.isDeclaredBy(r3)
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = r0.or(r3)
                return r3
        }
    }

    public SubclassDynamicTypeBuilder(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r20, net.bytebuddy.ClassFileVersion r21, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r22, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r23, net.bytebuddy.implementation.attribute.AnnotationRetention r24, net.bytebuddy.implementation.Implementation.Context.Factory r25, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r26, net.bytebuddy.dynamic.scaffold.TypeValidation r27, net.bytebuddy.dynamic.VisibilityBridgeStrategy r28, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r29, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r30, net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r31) {
            r19 = this;
            r0 = r19
            r1 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r11 = r25
            r12 = r26
            r13 = r27
            r14 = r28
            r15 = r29
            r16 = r30
            r18 = r31
            net.bytebuddy.dynamic.scaffold.FieldRegistry$Default r3 = new net.bytebuddy.dynamic.scaffold.FieldRegistry$Default
            r2 = r3
            r3.<init>()
            net.bytebuddy.dynamic.scaffold.MethodRegistry$Default r4 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default
            r3 = r4
            r4.<init>()
            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default r5 = new net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default
            r4 = r5
            r5.<init>()
            net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType r5 = net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType.INSTANCE
            net.bytebuddy.asm.AsmVisitorWrapper$NoOp r6 = net.bytebuddy.asm.AsmVisitorWrapper.NoOp.INSTANCE
            java.util.List r17 = java.util.Collections.emptyList()
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
    }

    public SubclassDynamicTypeBuilder(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r3, net.bytebuddy.dynamic.scaffold.FieldRegistry r4, net.bytebuddy.dynamic.scaffold.MethodRegistry r5, net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r6, net.bytebuddy.implementation.attribute.TypeAttributeAppender r7, net.bytebuddy.asm.AsmVisitorWrapper r8, net.bytebuddy.ClassFileVersion r9, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r10, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r11, net.bytebuddy.implementation.attribute.AnnotationRetention r12, net.bytebuddy.implementation.Implementation.Context.Factory r13, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r14, net.bytebuddy.dynamic.scaffold.TypeValidation r15, net.bytebuddy.dynamic.VisibilityBridgeStrategy r16, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r17, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r18, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r19, net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r20) {
            r2 = this;
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = r2
            r1 = r20
            r0.constructorStrategy = r1
            return
    }

    private net.bytebuddy.dynamic.scaffold.InstrumentedType applyConstructorStrategy(net.bytebuddy.dynamic.scaffold.InstrumentedType r3) {
            r2 = this;
            boolean r0 = r3.isInterface()
            if (r0 != 0) goto L21
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r0 = r2.constructorStrategy
            java.util.List r0 = r0.extractConstructors(r3)
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r0.next()
            net.bytebuddy.description.method.MethodDescription$Token r1 = (net.bytebuddy.description.method.MethodDescription.Token) r1
            net.bytebuddy.dynamic.scaffold.InstrumentedType r3 = r3.withMethod(r1)
            goto L10
        L21:
            return r3
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
            r4 = this;
            boolean r0 = super.equals(r5)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = 1
            if (r4 != r5) goto Lc
            return r0
        Lc:
            if (r5 != 0) goto Lf
            return r1
        Lf:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L1a
            return r1
        L1a:
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r2 = r4.constructorStrategy
            net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder r5 = (net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder) r5
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r5 = r5.constructorStrategy
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r1 = r2.constructorStrategy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public net.bytebuddy.dynamic.DynamicType.Builder<T> materialize(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r22, net.bytebuddy.dynamic.scaffold.FieldRegistry r23, net.bytebuddy.dynamic.scaffold.MethodRegistry r24, net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r25, net.bytebuddy.implementation.attribute.TypeAttributeAppender r26, net.bytebuddy.asm.AsmVisitorWrapper r27, net.bytebuddy.ClassFileVersion r28, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r29, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r30, net.bytebuddy.implementation.attribute.AnnotationRetention r31, net.bytebuddy.implementation.Implementation.Context.Factory r32, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r33, net.bytebuddy.dynamic.scaffold.TypeValidation r34, net.bytebuddy.dynamic.VisibilityBridgeStrategy r35, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r36, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r37, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r38) {
            r21 = this;
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r16 = r37
            r17 = r38
            net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder r19 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder
            r0 = r19
            r22 = r0
            r20 = r1
            r0 = r21
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r1 = r0.constructorStrategy
            r18 = r1
            r0 = r22
            r1 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r19
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.UsingTypeWriter
    public net.bytebuddy.dynamic.scaffold.TypeWriter<T> toTypeWriter() {
            r1 = this;
            net.bytebuddy.pool.TypePool r0 = net.bytebuddy.pool.TypePool.ClassLoading.ofSystemLoader()
            net.bytebuddy.dynamic.scaffold.TypeWriter r0 = r1.toTypeWriter(r0)
            return r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.UsingTypeWriter
    public net.bytebuddy.dynamic.scaffold.TypeWriter<T> toTypeWriter(net.bytebuddy.pool.TypePool r19) {
            r18 = this;
            r0 = r18
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy r1 = r0.constructorStrategy
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r0.instrumentedType
            net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r0.methodRegistry
            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r1.inject(r2, r3)
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.instrumentedType
            net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r0.applyConstructorStrategy(r1)
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r6 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r7 = r0.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r8 = r0.visibilityBridgeStrategy
            net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder$InstrumentableMatcher r9 = new net.bytebuddy.dynamic.scaffold.subclass.SubclassDynamicTypeBuilder$InstrumentableMatcher
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r0.ignoredMethods
            r9.<init>(r1)
            net.bytebuddy.dynamic.scaffold.MethodRegistry$Prepared r1 = r4.prepare(r5, r6, r7, r8, r9)
            net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget$Factory r2 = net.bytebuddy.dynamic.scaffold.subclass.SubclassImplementationTarget.Factory.SUPER_CLASS
            net.bytebuddy.ClassFileVersion r3 = r0.classFileVersion
            net.bytebuddy.dynamic.scaffold.MethodRegistry$Compiled r4 = r1.compile(r2, r3)
            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r5 = r0.auxiliaryTypes
            net.bytebuddy.dynamic.scaffold.FieldRegistry r1 = r0.fieldRegistry
            net.bytebuddy.description.type.TypeDescription r2 = r4.getInstrumentedType()
            net.bytebuddy.dynamic.scaffold.FieldRegistry$Compiled r6 = r1.compile(r2)
            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r1 = r0.recordComponentRegistry
            net.bytebuddy.description.type.TypeDescription r2 = r4.getInstrumentedType()
            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Compiled r7 = r1.compile(r2)
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r8 = r0.typeAttributeAppender
            net.bytebuddy.asm.AsmVisitorWrapper r9 = r0.asmVisitorWrapper
            net.bytebuddy.ClassFileVersion r10 = r0.classFileVersion
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r11 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r12 = r0.annotationRetention
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r13 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.Implementation$Context$Factory r14 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r15 = r0.typeValidation
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r1 = r0.classWriterStrategy
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r0.instrumentedType
            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r3 = r0.auxiliaryTypes
            r0 = r19
            net.bytebuddy.pool.TypePool r17 = net.bytebuddy.pool.TypePool.Explicit.wrap(r2, r3, r0)
            r16 = r1
            net.bytebuddy.dynamic.scaffold.TypeWriter r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.forCreation(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r0
    }
}
