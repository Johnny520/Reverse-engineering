package net.bytebuddy.dynamic.scaffold.inline;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class RebaseDynamicTypeBuilder<T> extends net.bytebuddy.dynamic.scaffold.inline.AbstractInliningDynamicTypeBuilder<T> {
    private final net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer methodNameTransformer;

    public RebaseDynamicTypeBuilder(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r22, net.bytebuddy.ClassFileVersion r23, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r24, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r25, net.bytebuddy.implementation.attribute.AnnotationRetention r26, net.bytebuddy.implementation.Implementation.Context.Factory r27, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r28, net.bytebuddy.dynamic.scaffold.TypeValidation r29, net.bytebuddy.dynamic.VisibilityBridgeStrategy r30, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r31, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r32, net.bytebuddy.description.type.TypeDescription r33, net.bytebuddy.dynamic.ClassFileLocator r34, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r35) {
            r21 = this;
            net.bytebuddy.dynamic.scaffold.FieldRegistry$Default r2 = new net.bytebuddy.dynamic.scaffold.FieldRegistry$Default
            r2.<init>()
            net.bytebuddy.dynamic.scaffold.MethodRegistry$Default r3 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default
            r3.<init>()
            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default r4 = new net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default
            r4.<init>()
            boolean r0 = r26.isEnabled()
            if (r0 == 0) goto L1e
            net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType$Differentiating r0 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType$Differentiating
            r15 = r33
            r0.<init>(r15)
        L1c:
            r5 = r0
            goto L23
        L1e:
            r15 = r33
            net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType r0 = net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType.INSTANCE
            goto L1c
        L23:
            net.bytebuddy.asm.AsmVisitorWrapper$NoOp r6 = net.bytebuddy.asm.AsmVisitorWrapper.NoOp.INSTANCE
            java.util.List r17 = java.util.Collections.emptyList()
            r0 = r21
            r1 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            r11 = r27
            r12 = r28
            r13 = r29
            r14 = r30
            r15 = r31
            r16 = r32
            r18 = r33
            r19 = r34
            r20 = r35
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
    }

    public RebaseDynamicTypeBuilder(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r3, net.bytebuddy.dynamic.scaffold.FieldRegistry r4, net.bytebuddy.dynamic.scaffold.MethodRegistry r5, net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r6, net.bytebuddy.implementation.attribute.TypeAttributeAppender r7, net.bytebuddy.asm.AsmVisitorWrapper r8, net.bytebuddy.ClassFileVersion r9, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r10, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r11, net.bytebuddy.implementation.attribute.AnnotationRetention r12, net.bytebuddy.implementation.Implementation.Context.Factory r13, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r14, net.bytebuddy.dynamic.scaffold.TypeValidation r15, net.bytebuddy.dynamic.VisibilityBridgeStrategy r16, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r17, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r18, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r19, net.bytebuddy.description.type.TypeDescription r20, net.bytebuddy.dynamic.ClassFileLocator r21, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r22) {
            r2 = this;
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = r2
            r1 = r22
            r0.methodNameTransformer = r1
            return
    }

    @Override // net.bytebuddy.dynamic.scaffold.inline.AbstractInliningDynamicTypeBuilder, net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
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
            net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r2 = r4.methodNameTransformer
            net.bytebuddy.dynamic.scaffold.inline.RebaseDynamicTypeBuilder r5 = (net.bytebuddy.dynamic.scaffold.inline.RebaseDynamicTypeBuilder) r5
            net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r5 = r5.methodNameTransformer
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L27
            return r1
        L27:
            return r0
    }

    @Override // net.bytebuddy.dynamic.scaffold.inline.AbstractInliningDynamicTypeBuilder, net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r1 = r2.methodNameTransformer
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public net.bytebuddy.dynamic.DynamicType.Builder<T> materialize(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r24, net.bytebuddy.dynamic.scaffold.FieldRegistry r25, net.bytebuddy.dynamic.scaffold.MethodRegistry r26, net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r27, net.bytebuddy.implementation.attribute.TypeAttributeAppender r28, net.bytebuddy.asm.AsmVisitorWrapper r29, net.bytebuddy.ClassFileVersion r30, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r31, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r32, net.bytebuddy.implementation.attribute.AnnotationRetention r33, net.bytebuddy.implementation.Implementation.Context.Factory r34, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r35, net.bytebuddy.dynamic.scaffold.TypeValidation r36, net.bytebuddy.dynamic.VisibilityBridgeStrategy r37, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r38, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r39, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r40) {
            r23 = this;
            r0 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            r9 = r31
            r10 = r32
            r11 = r33
            r12 = r34
            r13 = r35
            r14 = r36
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            net.bytebuddy.dynamic.scaffold.inline.RebaseDynamicTypeBuilder r22 = new net.bytebuddy.dynamic.scaffold.inline.RebaseDynamicTypeBuilder
            r1 = r22
            r24 = r1
            net.bytebuddy.description.type.TypeDescription r1 = r0.originalType
            r19 = r1
            net.bytebuddy.dynamic.ClassFileLocator r1 = r0.classFileLocator
            r20 = r1
            net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r1 = r0.methodNameTransformer
            r21 = r1
            r1 = r24
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r22
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.UsingTypeWriter
    public net.bytebuddy.dynamic.scaffold.TypeWriter<T> toTypeWriter(net.bytebuddy.pool.TypePool r25) {
            r24 = this;
            r0 = r24
            net.bytebuddy.dynamic.scaffold.MethodRegistry r1 = r0.methodRegistry
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r0.instrumentedType
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r4 = r0.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r5 = r0.visibilityBridgeStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r6 = r0.ignoredMethods
            net.bytebuddy.description.type.TypeDescription r7 = r0.originalType
            net.bytebuddy.matcher.LatentMatcher r6 = net.bytebuddy.dynamic.scaffold.inline.InliningImplementationMatcher.of(r6, r7)
            net.bytebuddy.dynamic.scaffold.MethodRegistry$Prepared r1 = r1.prepare(r2, r3, r4, r5, r6)
            r7 = r1
            java.util.HashSet r2 = new java.util.HashSet
            net.bytebuddy.description.type.TypeDescription r3 = r0.originalType
            net.bytebuddy.description.method.MethodList r3 = r3.getDeclaredMethods()
            net.bytebuddy.description.type.TypeDescription r4 = r0.originalType
            net.bytebuddy.matcher.ElementMatcher$Junction r4 = net.bytebuddy.matcher.ElementMatchers.is(r4)
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r5 = r0.instrumentedType
            java.util.List r3 = r3.asSignatureTokenList(r4, r5)
            r2.<init>(r3)
            net.bytebuddy.description.method.MethodList r3 = r1.getInstrumentedMethods()
            java.util.List r3 = r3.asSignatureTokenList()
            r2.retainAll(r3)
            net.bytebuddy.description.type.TypeDescription r3 = r1.getInstrumentedType()
            net.bytebuddy.ClassFileVersion r4 = r0.classFileVersion
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r5 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r6 = r0.methodNameTransformer
            net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver r23 = net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Default.make(r3, r2, r4, r5, r6)
            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r8 = r0.auxiliaryTypes
            net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r0.fieldRegistry
            net.bytebuddy.description.type.TypeDescription r3 = r1.getInstrumentedType()
            net.bytebuddy.dynamic.scaffold.FieldRegistry$Compiled r9 = r2.compile(r3)
            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r2 = r0.recordComponentRegistry
            net.bytebuddy.description.type.TypeDescription r1 = r1.getInstrumentedType()
            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Compiled r10 = r2.compile(r1)
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r11 = r0.typeAttributeAppender
            net.bytebuddy.asm.AsmVisitorWrapper r12 = r0.asmVisitorWrapper
            net.bytebuddy.ClassFileVersion r13 = r0.classFileVersion
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r14 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r15 = r0.annotationRetention
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r1 = r0.auxiliaryTypeNamingStrategy
            r16 = r1
            net.bytebuddy.implementation.Implementation$Context$Factory r1 = r0.implementationContextFactory
            r17 = r1
            net.bytebuddy.dynamic.scaffold.TypeValidation r1 = r0.typeValidation
            r18 = r1
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r1 = r0.classWriterStrategy
            r19 = r1
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r0.instrumentedType
            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r2 = r0.auxiliaryTypes
            r3 = r25
            net.bytebuddy.pool.TypePool r20 = net.bytebuddy.pool.TypePool.Explicit.wrap(r1, r2, r3)
            net.bytebuddy.description.type.TypeDescription r1 = r0.originalType
            r21 = r1
            net.bytebuddy.dynamic.ClassFileLocator r1 = r0.classFileLocator
            r22 = r1
            net.bytebuddy.dynamic.scaffold.TypeWriter r1 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.forRebasing(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
    }
}
