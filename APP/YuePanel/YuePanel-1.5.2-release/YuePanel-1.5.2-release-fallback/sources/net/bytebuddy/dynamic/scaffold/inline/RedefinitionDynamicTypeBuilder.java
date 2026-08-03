package net.bytebuddy.dynamic.scaffold.inline;

/* JADX INFO: loaded from: classes2.dex */
public class RedefinitionDynamicTypeBuilder<T> extends net.bytebuddy.dynamic.scaffold.inline.AbstractInliningDynamicTypeBuilder<T> {
    public RedefinitionDynamicTypeBuilder(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r21, net.bytebuddy.ClassFileVersion r22, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r23, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r24, net.bytebuddy.implementation.attribute.AnnotationRetention r25, net.bytebuddy.implementation.Implementation.Context.Factory r26, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r27, net.bytebuddy.dynamic.scaffold.TypeValidation r28, net.bytebuddy.dynamic.VisibilityBridgeStrategy r29, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r30, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r31, net.bytebuddy.description.type.TypeDescription r32, net.bytebuddy.dynamic.ClassFileLocator r33) {
            r20 = this;
            net.bytebuddy.dynamic.scaffold.FieldRegistry$Default r2 = new net.bytebuddy.dynamic.scaffold.FieldRegistry$Default
            r2.<init>()
            net.bytebuddy.dynamic.scaffold.MethodRegistry$Default r3 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Default
            r3.<init>()
            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default r4 = new net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Default
            r4.<init>()
            boolean r0 = r25.isEnabled()
            if (r0 == 0) goto L1e
            net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType$Differentiating r0 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType$Differentiating
            r15 = r32
            r0.<init>(r15)
        L1c:
            r5 = r0
            goto L23
        L1e:
            r15 = r32
            net.bytebuddy.implementation.attribute.TypeAttributeAppender$ForInstrumentedType r0 = net.bytebuddy.implementation.attribute.TypeAttributeAppender.ForInstrumentedType.INSTANCE
            goto L1c
        L23:
            net.bytebuddy.asm.AsmVisitorWrapper$NoOp r6 = net.bytebuddy.asm.AsmVisitorWrapper.NoOp.INSTANCE
            java.util.List r17 = java.util.Collections.emptyList()
            r0 = r20
            r1 = r21
            r7 = r22
            r8 = r23
            r9 = r24
            r10 = r25
            r11 = r26
            r12 = r27
            r13 = r28
            r14 = r29
            r15 = r30
            r16 = r31
            r18 = r32
            r19 = r33
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
    }

    public RedefinitionDynamicTypeBuilder(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r1, net.bytebuddy.dynamic.scaffold.FieldRegistry r2, net.bytebuddy.dynamic.scaffold.MethodRegistry r3, net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4, net.bytebuddy.implementation.attribute.TypeAttributeAppender r5, net.bytebuddy.asm.AsmVisitorWrapper r6, net.bytebuddy.ClassFileVersion r7, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r8, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r9, net.bytebuddy.implementation.attribute.AnnotationRetention r10, net.bytebuddy.implementation.Implementation.Context.Factory r11, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r12, net.bytebuddy.dynamic.scaffold.TypeValidation r13, net.bytebuddy.dynamic.VisibilityBridgeStrategy r14, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r15, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r16, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r17, net.bytebuddy.description.type.TypeDescription r18, net.bytebuddy.dynamic.ClassFileLocator r19) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public net.bytebuddy.dynamic.DynamicType.Builder<T> materialize(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r23, net.bytebuddy.dynamic.scaffold.FieldRegistry r24, net.bytebuddy.dynamic.scaffold.MethodRegistry r25, net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r26, net.bytebuddy.implementation.attribute.TypeAttributeAppender r27, net.bytebuddy.asm.AsmVisitorWrapper r28, net.bytebuddy.ClassFileVersion r29, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r30, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r31, net.bytebuddy.implementation.attribute.AnnotationRetention r32, net.bytebuddy.implementation.Implementation.Context.Factory r33, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r34, net.bytebuddy.dynamic.scaffold.TypeValidation r35, net.bytebuddy.dynamic.VisibilityBridgeStrategy r36, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r37, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r38, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r39) {
            r22 = this;
            r0 = r22
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
            r18 = r39
            net.bytebuddy.dynamic.scaffold.inline.RedefinitionDynamicTypeBuilder r21 = new net.bytebuddy.dynamic.scaffold.inline.RedefinitionDynamicTypeBuilder
            r1 = r21
            r23 = r1
            net.bytebuddy.description.type.TypeDescription r1 = r0.originalType
            r19 = r1
            net.bytebuddy.dynamic.ClassFileLocator r1 = r0.classFileLocator
            r20 = r1
            r1 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r21
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.UsingTypeWriter
    public net.bytebuddy.dynamic.scaffold.TypeWriter<T> toTypeWriter(net.bytebuddy.pool.TypePool r24) {
            r23 = this;
            r0 = r23
            net.bytebuddy.dynamic.scaffold.MethodRegistry r1 = r0.methodRegistry
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r0.instrumentedType
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r0.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.TypeValidation r4 = r0.typeValidation
            net.bytebuddy.dynamic.VisibilityBridgeStrategy r5 = r0.visibilityBridgeStrategy
            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r6 = r0.ignoredMethods
            net.bytebuddy.description.type.TypeDescription r7 = r0.originalType
            net.bytebuddy.matcher.LatentMatcher r6 = net.bytebuddy.dynamic.scaffold.inline.InliningImplementationMatcher.of(r6, r7)
            net.bytebuddy.dynamic.scaffold.MethodRegistry$Prepared r7 = r1.prepare(r2, r3, r4, r5, r6)
            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r8 = r0.auxiliaryTypes
            net.bytebuddy.dynamic.scaffold.FieldRegistry r1 = r0.fieldRegistry
            net.bytebuddy.description.type.TypeDescription r2 = r7.getInstrumentedType()
            net.bytebuddy.dynamic.scaffold.FieldRegistry$Compiled r9 = r1.compile(r2)
            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r1 = r0.recordComponentRegistry
            net.bytebuddy.description.type.TypeDescription r2 = r7.getInstrumentedType()
            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry$Compiled r10 = r1.compile(r2)
            net.bytebuddy.implementation.attribute.TypeAttributeAppender r11 = r0.typeAttributeAppender
            net.bytebuddy.asm.AsmVisitorWrapper r12 = r0.asmVisitorWrapper
            net.bytebuddy.ClassFileVersion r13 = r0.classFileVersion
            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r14 = r0.annotationValueFilterFactory
            net.bytebuddy.implementation.attribute.AnnotationRetention r15 = r0.annotationRetention
            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r1 = r0.auxiliaryTypeNamingStrategy
            net.bytebuddy.implementation.Implementation$Context$Factory r2 = r0.implementationContextFactory
            net.bytebuddy.dynamic.scaffold.TypeValidation r3 = r0.typeValidation
            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r4 = r0.classWriterStrategy
            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r5 = r0.instrumentedType
            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r6 = r0.auxiliaryTypes
            r19 = r4
            r4 = r24
            net.bytebuddy.pool.TypePool r20 = net.bytebuddy.pool.TypePool.Explicit.wrap(r5, r6, r4)
            net.bytebuddy.description.type.TypeDescription r4 = r0.originalType
            net.bytebuddy.dynamic.ClassFileLocator r5 = r0.classFileLocator
            r16 = r1
            r17 = r2
            r18 = r3
            r21 = r4
            r22 = r5
            net.bytebuddy.dynamic.scaffold.TypeWriter r1 = net.bytebuddy.dynamic.scaffold.TypeWriter.Default.forRedefinition(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r1
    }
}
