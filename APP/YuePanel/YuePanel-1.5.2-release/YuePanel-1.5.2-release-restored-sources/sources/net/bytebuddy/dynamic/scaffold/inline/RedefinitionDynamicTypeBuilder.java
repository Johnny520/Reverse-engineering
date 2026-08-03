package net.bytebuddy.dynamic.scaffold.inline;

import java.util.Collections;
import java.util.List;
import net.bytebuddy.ClassFileVersion;
import net.bytebuddy.asm.AsmVisitorWrapper;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.description.type.TypeDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.dynamic.VisibilityBridgeStrategy;
import net.bytebuddy.dynamic.scaffold.ClassWriterStrategy;
import net.bytebuddy.dynamic.scaffold.FieldRegistry;
import net.bytebuddy.dynamic.scaffold.InstrumentedType;
import net.bytebuddy.dynamic.scaffold.MethodGraph;
import net.bytebuddy.dynamic.scaffold.MethodRegistry;
import net.bytebuddy.dynamic.scaffold.RecordComponentRegistry;
import net.bytebuddy.dynamic.scaffold.TypeValidation;
import net.bytebuddy.dynamic.scaffold.TypeWriter;
import net.bytebuddy.implementation.Implementation;
import net.bytebuddy.implementation.attribute.AnnotationRetention;
import net.bytebuddy.implementation.attribute.AnnotationValueFilter;
import net.bytebuddy.implementation.attribute.TypeAttributeAppender;
import net.bytebuddy.implementation.auxiliary.AuxiliaryType;
import net.bytebuddy.matcher.LatentMatcher;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: loaded from: classes2.dex */
public class RedefinitionDynamicTypeBuilder<T> extends AbstractInliningDynamicTypeBuilder<T> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public RedefinitionDynamicTypeBuilder(InstrumentedType.WithFlexibleName withFlexibleName, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        this(withFlexibleName, new FieldRegistry.Default(), new MethodRegistry.Default(), new RecordComponentRegistry.Default(), annotationRetention.isEnabled() ? new TypeAttributeAppender.ForInstrumentedType.Differentiating(typeDescription) : TypeAttributeAppender.ForInstrumentedType.INSTANCE, AsmVisitorWrapper.NoOp.INSTANCE, classFileVersion, namingStrategy, factory, annotationRetention, factory2, compiler, typeValidation, visibilityBridgeStrategy, classWriterStrategy, latentMatcher, Collections.emptyList(), typeDescription, classFileLocator);
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter
    public DynamicType.Builder<T> materialize(InstrumentedType.WithFlexibleName withFlexibleName, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, RecordComponentRegistry recordComponentRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, List<? extends DynamicType> list) {
        return new RedefinitionDynamicTypeBuilder(withFlexibleName, fieldRegistry, methodRegistry, recordComponentRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, namingStrategy, factory, annotationRetention, factory2, compiler, typeValidation, visibilityBridgeStrategy, classWriterStrategy, latentMatcher, list, this.originalType, this.classFileLocator);
    }

    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.UsingTypeWriter
    public TypeWriter<T> toTypeWriter(TypePool typePool) {
        MethodRegistry.Prepared preparedPrepare = this.methodRegistry.prepare(this.instrumentedType, this.methodGraphCompiler, this.typeValidation, this.visibilityBridgeStrategy, InliningImplementationMatcher.m5291of(this.ignoredMethods, this.originalType));
        return TypeWriter.Default.forRedefinition(preparedPrepare, this.auxiliaryTypes, this.fieldRegistry.compile(preparedPrepare.getInstrumentedType()), this.recordComponentRegistry.compile(preparedPrepare.getInstrumentedType()), this.typeAttributeAppender, this.asmVisitorWrapper, this.classFileVersion, this.annotationValueFilterFactory, this.annotationRetention, this.auxiliaryTypeNamingStrategy, this.implementationContextFactory, this.typeValidation, this.classWriterStrategy, TypePool.Explicit.wrap(this.instrumentedType, this.auxiliaryTypes, typePool), this.originalType, this.classFileLocator);
    }

    public RedefinitionDynamicTypeBuilder(InstrumentedType.WithFlexibleName withFlexibleName, FieldRegistry fieldRegistry, MethodRegistry methodRegistry, RecordComponentRegistry recordComponentRegistry, TypeAttributeAppender typeAttributeAppender, AsmVisitorWrapper asmVisitorWrapper, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, AnnotationValueFilter.Factory factory, AnnotationRetention annotationRetention, Implementation.Context.Factory factory2, MethodGraph.Compiler compiler, TypeValidation typeValidation, VisibilityBridgeStrategy visibilityBridgeStrategy, ClassWriterStrategy classWriterStrategy, LatentMatcher<? super MethodDescription> latentMatcher, List<? extends DynamicType> list, TypeDescription typeDescription, ClassFileLocator classFileLocator) {
        super(withFlexibleName, fieldRegistry, methodRegistry, recordComponentRegistry, typeAttributeAppender, asmVisitorWrapper, classFileVersion, namingStrategy, factory, annotationRetention, factory2, compiler, typeValidation, visibilityBridgeStrategy, classWriterStrategy, latentMatcher, list, typeDescription, classFileLocator);
    }
}
