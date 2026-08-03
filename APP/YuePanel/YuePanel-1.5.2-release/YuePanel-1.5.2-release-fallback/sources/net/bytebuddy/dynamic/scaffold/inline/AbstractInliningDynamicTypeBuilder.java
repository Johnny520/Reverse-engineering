package net.bytebuddy.dynamic.scaffold.inline;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public abstract class AbstractInliningDynamicTypeBuilder<T> extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter<T> {
    protected final net.bytebuddy.dynamic.ClassFileLocator classFileLocator;
    protected final net.bytebuddy.description.type.TypeDescription originalType;

    public AbstractInliningDynamicTypeBuilder(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r3, net.bytebuddy.dynamic.scaffold.FieldRegistry r4, net.bytebuddy.dynamic.scaffold.MethodRegistry r5, net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r6, net.bytebuddy.implementation.attribute.TypeAttributeAppender r7, net.bytebuddy.asm.AsmVisitorWrapper r8, net.bytebuddy.ClassFileVersion r9, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r10, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r11, net.bytebuddy.implementation.attribute.AnnotationRetention r12, net.bytebuddy.implementation.Implementation.Context.Factory r13, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r14, net.bytebuddy.dynamic.scaffold.TypeValidation r15, net.bytebuddy.dynamic.VisibilityBridgeStrategy r16, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r17, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r18, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r19, net.bytebuddy.description.type.TypeDescription r20, net.bytebuddy.dynamic.ClassFileLocator r21) {
            r2 = this;
            r0 = r2
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r1 = r20
            r0.originalType = r1
            r1 = r21
            r0.classFileLocator = r1
            return
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
            net.bytebuddy.description.type.TypeDescription r2 = r4.originalType
            net.bytebuddy.dynamic.scaffold.inline.AbstractInliningDynamicTypeBuilder r5 = (net.bytebuddy.dynamic.scaffold.inline.AbstractInliningDynamicTypeBuilder) r5
            net.bytebuddy.description.type.TypeDescription r3 = r5.originalType
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            return r1
        L27:
            net.bytebuddy.dynamic.ClassFileLocator r2 = r4.classFileLocator
            net.bytebuddy.dynamic.ClassFileLocator r5 = r5.classFileLocator
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L32
            return r1
        L32:
            return r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public int hashCode() {
            r2 = this;
            int r0 = super.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.description.type.TypeDescription r1 = r2.originalType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.dynamic.ClassFileLocator r1 = r2.classFileLocator
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.UsingTypeWriter
    public net.bytebuddy.dynamic.scaffold.TypeWriter<T> toTypeWriter() {
            r1 = this;
            net.bytebuddy.dynamic.ClassFileLocator r0 = r1.classFileLocator
            net.bytebuddy.pool.TypePool r0 = net.bytebuddy.pool.TypePool.Default.of(r0)
            net.bytebuddy.dynamic.scaffold.TypeWriter r0 = r1.toTypeWriter(r0)
            return r0
    }
}
