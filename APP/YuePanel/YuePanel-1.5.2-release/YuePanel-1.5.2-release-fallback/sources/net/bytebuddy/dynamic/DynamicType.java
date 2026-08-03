package net.bytebuddy.dynamic;

/* JADX INFO: loaded from: classes2.dex */
public interface DynamicType extends net.bytebuddy.dynamic.ClassFileLocator {

    public interface Builder<T> {

        public static abstract class AbstractBase<S> implements net.bytebuddy.dynamic.DynamicType.Builder<S> {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static abstract class Adapter<U> extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.UsingTypeWriter<U> {
                protected final net.bytebuddy.implementation.attribute.AnnotationRetention annotationRetention;
                protected final net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory annotationValueFilterFactory;
                protected final net.bytebuddy.asm.AsmVisitorWrapper asmVisitorWrapper;
                protected final net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy auxiliaryTypeNamingStrategy;
                protected final java.util.List<? extends net.bytebuddy.dynamic.DynamicType> auxiliaryTypes;
                protected final net.bytebuddy.ClassFileVersion classFileVersion;
                protected final net.bytebuddy.dynamic.scaffold.ClassWriterStrategy classWriterStrategy;
                protected final net.bytebuddy.dynamic.scaffold.FieldRegistry fieldRegistry;
                protected final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> ignoredMethods;
                protected final net.bytebuddy.implementation.Implementation.Context.Factory implementationContextFactory;
                protected final net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName instrumentedType;
                protected final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;
                protected final net.bytebuddy.dynamic.scaffold.MethodRegistry methodRegistry;
                protected final net.bytebuddy.dynamic.scaffold.RecordComponentRegistry recordComponentRegistry;
                protected final net.bytebuddy.implementation.attribute.TypeAttributeAppender typeAttributeAppender;
                protected final net.bytebuddy.dynamic.scaffold.TypeValidation typeValidation;
                protected final net.bytebuddy.dynamic.VisibilityBridgeStrategy visibilityBridgeStrategy;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class FieldDefinitionAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter<U> {
                    final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter this$0;
                    private final net.bytebuddy.description.field.FieldDescription.Token token;

                    public FieldDefinitionAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r7, net.bytebuddy.description.field.FieldDescription.Token r8) {
                            r6 = this;
                            net.bytebuddy.implementation.attribute.FieldAttributeAppender$ForInstrumentedField r2 = net.bytebuddy.implementation.attribute.FieldAttributeAppender.ForInstrumentedField.INSTANCE
                            net.bytebuddy.dynamic.Transformer r3 = net.bytebuddy.dynamic.Transformer.NoOp.make()
                            java.lang.Object r4 = net.bytebuddy.description.field.FieldDescription.NO_DEFAULT_VALUE
                            r0 = r6
                            r1 = r7
                            r5 = r8
                            r0.<init>(r1, r2, r3, r4, r5)
                            return
                    }

                    public FieldDefinitionAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r1, net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r3, java.lang.Object r4, net.bytebuddy.description.field.FieldDescription.Token r5) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>(r2, r3, r4)
                            r0.token = r5
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> annotateField(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r12) {
                            r11 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter r6 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r11.this$0
                            net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r2 = r11.fieldAttributeAppenderFactory
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r3 = r11.transformer
                            java.lang.Object r4 = r11.defaultValue
                            net.bytebuddy.description.field.FieldDescription$Token r5 = new net.bytebuddy.description.field.FieldDescription$Token
                            net.bytebuddy.description.field.FieldDescription$Token r0 = r11.token
                            java.lang.String r0 = r0.getName()
                            net.bytebuddy.description.field.FieldDescription$Token r7 = r11.token
                            int r7 = r7.getModifiers()
                            net.bytebuddy.description.field.FieldDescription$Token r8 = r11.token
                            net.bytebuddy.description.type.TypeDescription$Generic r8 = r8.getType()
                            net.bytebuddy.description.field.FieldDescription$Token r9 = r11.token
                            net.bytebuddy.description.annotation.AnnotationList r9 = r9.getAnnotations()
                            java.util.ArrayList r10 = new java.util.ArrayList
                            r10.<init>(r12)
                            java.util.List r12 = net.bytebuddy.utility.CompoundList.of(r9, r10)
                            r5.<init>(r0, r7, r8, r12)
                            r0 = r6
                            r0.<init>(r1, r2, r3, r4, r5)
                            return r6
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
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
                            net.bytebuddy.description.field.FieldDescription$Token r2 = r4.token
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.FieldDefinitionAdapter) r5
                            net.bytebuddy.description.field.FieldDescription$Token r3 = r5.token
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L27
                            return r1
                        L27:
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r4.this$0
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r5.this$0
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L32
                            return r1
                        L32:
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
                    public int hashCode() {
                            r2 = this;
                            int r0 = super.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.field.FieldDescription$Token r1 = r2.token
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
                    public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> materialize(net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r8, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r10) {
                            r7 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter r6 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r7.this$0
                            net.bytebuddy.description.field.FieldDescription$Token r5 = r7.token
                            r0 = r6
                            r2 = r8
                            r3 = r9
                            r4 = r10
                            r0.<init>(r1, r2, r3, r4, r5)
                            return r6
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> materialize() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r0.this$0
                            r1 = r2
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.instrumentedType
                            net.bytebuddy.description.field.FieldDescription$Token r3 = r0.token
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withField(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r3 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r3.fieldRegistry
                            net.bytebuddy.matcher.LatentMatcher$ForFieldToken r4 = new net.bytebuddy.matcher.LatentMatcher$ForFieldToken
                            net.bytebuddy.description.field.FieldDescription$Token r5 = r0.token
                            r4.<init>(r5)
                            net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r5 = r0.fieldAttributeAppenderFactory
                            java.lang.Object r6 = r0.defaultValue
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r7 = r0.transformer
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r3.prepend(r4, r5, r6, r7)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r15.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r15.recordComponentRegistry
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class FieldMatchAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter<U> {
                    private final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> matcher;
                    final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter this$0;

                    public FieldMatchAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r1, net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r3, java.lang.Object r4, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r5) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>(r2, r3, r4)
                            r0.matcher = r5
                            return
                    }

                    public FieldMatchAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r7, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r8) {
                            r6 = this;
                            net.bytebuddy.implementation.attribute.FieldAttributeAppender$NoOp r2 = net.bytebuddy.implementation.attribute.FieldAttributeAppender.NoOp.INSTANCE
                            net.bytebuddy.dynamic.Transformer r3 = net.bytebuddy.dynamic.Transformer.NoOp.make()
                            java.lang.Object r4 = net.bytebuddy.description.field.FieldDescription.NO_DEFAULT_VALUE
                            r0 = r6
                            r1 = r7
                            r5 = r8
                            r0.<init>(r1, r2, r3, r4, r5)
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> annotateField(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3) {
                            r2 = this;
                            net.bytebuddy.implementation.attribute.FieldAttributeAppender$Explicit r0 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender$Explicit
                            java.util.ArrayList r1 = new java.util.ArrayList
                            r1.<init>(r3)
                            r0.<init>(r1)
                            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r3 = r2.attribute(r0)
                            return r3
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
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
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.matcher
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldMatchAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.FieldMatchAdapter) r5
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r3 = r5.matcher
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L27
                            return r1
                        L27:
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r4.this$0
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r5.this$0
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L32
                            return r1
                        L32:
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
                    public int hashCode() {
                            r2 = this;
                            int r0 = super.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r2.matcher
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter
                    public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> materialize(net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r8, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r10) {
                            r7 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldMatchAdapter r6 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldMatchAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r7.this$0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r5 = r7.matcher
                            r0 = r6
                            r2 = r8
                            r3 = r9
                            r4 = r10
                            r0.<init>(r1, r2, r3, r4, r5)
                            return r6
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> materialize() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r3 = r0.this$0
                            r1 = r3
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r3.instrumentedType
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r3.fieldRegistry
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r4 = r0.matcher
                            net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r5 = r0.fieldAttributeAppenderFactory
                            java.lang.Object r6 = r0.defaultValue
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r7 = r0.transformer
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r3.prepend(r4, r5, r6, r7)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r15.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r15.recordComponentRegistry
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class InnerTypeDefinitionForMethodAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator<U> implements net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition<U> {
                    private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
                    final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter this$0;

                    public InnerTypeDefinitionForMethodAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.methodDescription = r2
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> asAnonymousType() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r0.this$0
                            r1 = r2
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.instrumentedType
                            net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withDeclaringType(r3)
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r0.methodDescription
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withEnclosingMethod(r3)
                            r3 = 1
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withAnonymousClass(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r15.fieldRegistry
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r15.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r15.recordComponentRegistry
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
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
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.methodDescription
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$InnerTypeDefinitionForMethodAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.InnerTypeDefinitionForMethodAdapter) r5
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.methodDescription
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r4.this$0
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r5.this$0
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.methodDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> materialize() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r0.this$0
                            r1 = r2
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.instrumentedType
                            net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withDeclaringType(r3)
                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r0.methodDescription
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withEnclosingMethod(r3)
                            r3 = 1
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withLocalClass(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r15.fieldRegistry
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r15.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r15.recordComponentRegistry
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class InnerTypeDefinitionForTypeAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator<U> implements net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition.ForType<U> {
                    final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter this$0;
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    public InnerTypeDefinitionForTypeAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r1, net.bytebuddy.description.type.TypeDescription r2) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.typeDescription = r2
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> asAnonymousType() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r0.this$0
                            r1 = r2
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.instrumentedType
                            net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withDeclaringType(r3)
                            net.bytebuddy.description.type.TypeDescription r3 = r0.typeDescription
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withEnclosingType(r3)
                            r3 = 1
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withAnonymousClass(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r15.fieldRegistry
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r15.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r15.recordComponentRegistry
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition.ForType
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> asMemberType() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r0.this$0
                            r1 = r2
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.instrumentedType
                            net.bytebuddy.description.type.TypeDescription r3 = r0.typeDescription
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withDeclaringType(r3)
                            net.bytebuddy.description.type.TypeDescription r3 = r0.typeDescription
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withEnclosingType(r3)
                            r3 = 0
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withAnonymousClass(r3)
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withLocalClass(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r15.fieldRegistry
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r15.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r15.recordComponentRegistry
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
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
                            net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$InnerTypeDefinitionForTypeAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.InnerTypeDefinitionForTypeAdapter) r5
                            net.bytebuddy.description.type.TypeDescription r3 = r5.typeDescription
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r4.this$0
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r5.this$0
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> materialize() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r0.this$0
                            r1 = r2
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.instrumentedType
                            net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withDeclaringType(r3)
                            net.bytebuddy.description.type.TypeDescription r3 = r0.typeDescription
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withEnclosingType(r3)
                            r3 = 1
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withLocalClass(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r15.fieldRegistry
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r15.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r15.recordComponentRegistry
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class MethodDefinitionAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial.AbstractBase<U> {
                    final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter this$0;
                    private final net.bytebuddy.description.method.MethodDescription.Token token;

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class AnnotationAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter<U> {
                        final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter this$1;

                        public AnnotationAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter r3, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r4) {
                                r2 = this;
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod.INCLUDING_RECEIVER
                                net.bytebuddy.dynamic.Transformer r1 = net.bytebuddy.dynamic.Transformer.NoOp.make()
                                r2.<init>(r3, r4, r0, r1)
                                return
                        }

                        public AnnotationAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter r1, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r3, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r4) {
                                r0 = this;
                                r0.this$1 = r1
                                r0.<init>(r2, r3, r4)
                                return
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> annotateMethod(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r17) {
                                r16 = this;
                                r0 = r16
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter r1 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r2 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r4 = r3.this$0
                                net.bytebuddy.description.method.MethodDescription$Token r15 = new net.bytebuddy.description.method.MethodDescription$Token
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                java.lang.String r6 = r3.getName()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                int r7 = r3.getModifiers()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r8 = r3.getTypeVariableTokens()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.type.TypeDescription$Generic r9 = r3.getReturnType()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r10 = r3.getParameterTokens()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.type.TypeList$Generic r11 = r3.getExceptionTypes()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.annotation.AnnotationList r3 = r3.getAnnotations()
                                java.util.ArrayList r5 = new java.util.ArrayList
                                r12 = r17
                                r5.<init>(r12)
                                java.util.List r12 = net.bytebuddy.utility.CompoundList.of(r3, r5)
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.annotation.AnnotationValue r13 = r3.getDefaultValue()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.type.TypeDescription$Generic r14 = r3.getReceiverType()
                                r5 = r15
                                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
                                r2.<init>(r4, r15)
                                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r3 = r0.handler
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r4 = r0.methodAttributeAppenderFactory
                                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r5 = r0.transformer
                                r1.<init>(r2, r3, r4, r5)
                                return r1
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> annotateParameter(int r13, java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r14) {
                                r12 = this;
                                java.util.ArrayList r5 = new java.util.ArrayList
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r0 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r0)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r0 = r0.getParameterTokens()
                                r5.<init>(r0)
                                net.bytebuddy.description.method.ParameterDescription$Token r0 = new net.bytebuddy.description.method.ParameterDescription$Token
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r1 = r1.getParameterTokens()
                                net.bytebuddy.description.ByteCodeElement$Token r1 = r1.get(r13)
                                net.bytebuddy.description.method.ParameterDescription$Token r1 = (net.bytebuddy.description.method.ParameterDescription.Token) r1
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getType()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r2 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r2 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r2)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r2 = r2.getParameterTokens()
                                net.bytebuddy.description.ByteCodeElement$Token r2 = r2.get(r13)
                                net.bytebuddy.description.method.ParameterDescription$Token r2 = (net.bytebuddy.description.method.ParameterDescription.Token) r2
                                net.bytebuddy.description.annotation.AnnotationList r2 = r2.getAnnotations()
                                java.util.ArrayList r3 = new java.util.ArrayList
                                r3.<init>(r14)
                                java.util.List r14 = net.bytebuddy.utility.CompoundList.of(r2, r3)
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r2 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r2 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r2)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r2 = r2.getParameterTokens()
                                net.bytebuddy.description.ByteCodeElement$Token r2 = r2.get(r13)
                                net.bytebuddy.description.method.ParameterDescription$Token r2 = (net.bytebuddy.description.method.ParameterDescription.Token) r2
                                java.lang.String r2 = r2.getName()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r3 = r3.getParameterTokens()
                                net.bytebuddy.description.ByteCodeElement$Token r3 = r3.get(r13)
                                net.bytebuddy.description.method.ParameterDescription$Token r3 = (net.bytebuddy.description.method.ParameterDescription.Token) r3
                                java.lang.Integer r3 = r3.getModifiers()
                                r0.<init>(r1, r14, r2, r3)
                                r5.set(r13, r0)
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter r13 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r14 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = r12.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r10 = r0.this$0
                                net.bytebuddy.description.method.MethodDescription$Token r11 = new net.bytebuddy.description.method.MethodDescription$Token
                                net.bytebuddy.description.method.MethodDescription$Token r0 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r0)
                                java.lang.String r1 = r0.getName()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r0 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r0)
                                int r2 = r0.getModifiers()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r0 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r0)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r3 = r0.getTypeVariableTokens()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r0 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r0)
                                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.getReturnType()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r0 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r0)
                                net.bytebuddy.description.type.TypeList$Generic r6 = r0.getExceptionTypes()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r0 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r0)
                                net.bytebuddy.description.annotation.AnnotationList r7 = r0.getAnnotations()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r0 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r0)
                                net.bytebuddy.description.annotation.AnnotationValue r8 = r0.getDefaultValue()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = r12.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r0 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r0)
                                net.bytebuddy.description.type.TypeDescription$Generic r9 = r0.getReceiverType()
                                r0 = r11
                                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                                r14.<init>(r10, r11)
                                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r0 = r12.handler
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r1 = r12.methodAttributeAppenderFactory
                                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r2 = r12.transformer
                                r13.<init>(r14, r0, r1, r2)
                                return r13
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
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
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r2 = r4.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.AnnotationAdapter) r5
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r5 = r5.this$1
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L27
                                return r1
                            L27:
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
                        public int hashCode() {
                                r2 = this;
                                int r0 = super.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r2.this$1
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> materialize(net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r3, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r4, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r5) {
                                r2 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r2.this$1
                                r0.<init>(r1, r3, r4, r5)
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                        public net.bytebuddy.dynamic.DynamicType.Builder<U> materialize() {
                                r20 = this;
                                r0 = r20
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r0.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r3 = r1.this$0
                                r2 = r3
                                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r3 = r3.instrumentedType
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r3 = r3.withMethod(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r0.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r1.this$0
                                net.bytebuddy.dynamic.scaffold.FieldRegistry r4 = r5.fieldRegistry
                                net.bytebuddy.dynamic.scaffold.MethodRegistry r5 = r5.methodRegistry
                                net.bytebuddy.matcher.LatentMatcher$ForMethodToken r6 = new net.bytebuddy.matcher.LatentMatcher$ForMethodToken
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                r6.<init>(r1)
                                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r1 = r0.handler
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r7 = r0.methodAttributeAppenderFactory
                                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r8 = r0.transformer
                                net.bytebuddy.dynamic.scaffold.MethodRegistry r5 = r5.prepend(r6, r1, r7, r8)
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r0.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r1.this$0
                                net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r6 = r1.recordComponentRegistry
                                net.bytebuddy.implementation.attribute.TypeAttributeAppender r7 = r1.typeAttributeAppender
                                net.bytebuddy.asm.AsmVisitorWrapper r8 = r1.asmVisitorWrapper
                                net.bytebuddy.ClassFileVersion r9 = r1.classFileVersion
                                net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r10 = r1.auxiliaryTypeNamingStrategy
                                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r11 = r1.annotationValueFilterFactory
                                net.bytebuddy.implementation.attribute.AnnotationRetention r12 = r1.annotationRetention
                                net.bytebuddy.implementation.Implementation$Context$Factory r13 = r1.implementationContextFactory
                                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r14 = r1.methodGraphCompiler
                                net.bytebuddy.dynamic.scaffold.TypeValidation r15 = r1.typeValidation
                                net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r1.visibilityBridgeStrategy
                                r16 = r0
                                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                                r17 = r0
                                net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                                r18 = r0
                                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                                r19 = r0
                                net.bytebuddy.dynamic.DynamicType$Builder r0 = r2.materialize(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> receiverType(net.bytebuddy.description.type.TypeDescription.Generic r17) {
                                r16 = this;
                                r0 = r16
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter r1 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r2 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r4 = r3.this$0
                                net.bytebuddy.description.method.MethodDescription$Token r15 = new net.bytebuddy.description.method.MethodDescription$Token
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                java.lang.String r6 = r3.getName()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                int r7 = r3.getModifiers()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r8 = r3.getTypeVariableTokens()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.type.TypeDescription$Generic r9 = r3.getReturnType()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r10 = r3.getParameterTokens()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.type.TypeList$Generic r11 = r3.getExceptionTypes()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.annotation.AnnotationList r12 = r3.getAnnotations()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r3 = r0.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r3 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r3)
                                net.bytebuddy.description.annotation.AnnotationValue r13 = r3.getDefaultValue()
                                r5 = r15
                                r14 = r17
                                r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)
                                r2.<init>(r4, r15)
                                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r3 = r0.handler
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r4 = r0.methodAttributeAppenderFactory
                                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r5 = r0.transformer
                                r1.<init>(r2, r3, r4, r5)
                                return r1
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class ParameterAnnotationAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable.AbstractBase.Adapter<U> {
                        final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter this$1;
                        private final net.bytebuddy.description.method.ParameterDescription.Token token;

                        public ParameterAnnotationAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter r1, net.bytebuddy.description.method.ParameterDescription.Token r2) {
                                r0 = this;
                                r0.this$1 = r1
                                r0.<init>()
                                r0.token = r2
                                return
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<U> annotateParameter(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r7) {
                                r6 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$ParameterAnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$ParameterAnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r6.this$1
                                net.bytebuddy.description.method.ParameterDescription$Token r2 = new net.bytebuddy.description.method.ParameterDescription$Token
                                net.bytebuddy.description.method.ParameterDescription$Token r3 = r6.token
                                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                                net.bytebuddy.description.method.ParameterDescription$Token r4 = r6.token
                                net.bytebuddy.description.annotation.AnnotationList r4 = r4.getAnnotations()
                                java.util.ArrayList r5 = new java.util.ArrayList
                                r5.<init>(r7)
                                java.util.List r7 = net.bytebuddy.utility.CompoundList.of(r4, r5)
                                net.bytebuddy.description.method.ParameterDescription$Token r4 = r6.token
                                java.lang.String r4 = r4.getName()
                                net.bytebuddy.description.method.ParameterDescription$Token r5 = r6.token
                                java.lang.Integer r5 = r5.getModifiers()
                                r2.<init>(r3, r7, r4, r5)
                                r0.<init>(r1, r2)
                                return r0
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
                                net.bytebuddy.description.method.ParameterDescription$Token r2 = r4.token
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$ParameterAnnotationAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.ParameterAnnotationAdapter) r5
                                net.bytebuddy.description.method.ParameterDescription$Token r3 = r5.token
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L20
                                return r1
                            L20:
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r2 = r4.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r5 = r5.this$1
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L2b
                                return r1
                            L2b:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.description.method.ParameterDescription$Token r1 = r2.token
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r2.this$1
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable.AbstractBase.Adapter
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition<U> materialize() {
                                r14 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r1.this$0
                                net.bytebuddy.description.method.MethodDescription$Token r13 = new net.bytebuddy.description.method.MethodDescription$Token
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                java.lang.String r4 = r1.getName()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                int r5 = r1.getModifiers()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r6 = r1.getTypeVariableTokens()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.type.TypeDescription$Generic r7 = r1.getReturnType()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r1 = r1.getParameterTokens()
                                net.bytebuddy.description.method.ParameterDescription$Token r3 = r14.token
                                java.util.List r8 = net.bytebuddy.utility.CompoundList.of(r1, r3)
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.type.TypeList$Generic r9 = r1.getExceptionTypes()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.annotation.AnnotationList r10 = r1.getAnnotations()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.annotation.AnnotationValue r11 = r1.getDefaultValue()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.type.TypeDescription$Generic r12 = r1.getReceiverType()
                                r3 = r13
                                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                                r0.<init>(r2, r13)
                                return r0
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class SimpleParameterAnnotationAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable.AbstractBase.Adapter<U> {
                        final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter this$1;
                        private final net.bytebuddy.description.method.ParameterDescription.Token token;

                        public SimpleParameterAnnotationAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter r1, net.bytebuddy.description.method.ParameterDescription.Token r2) {
                                r0 = this;
                                r0.this$1 = r1
                                r0.<init>()
                                r0.token = r2
                                return
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<U> annotateParameter(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r7) {
                                r6 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$SimpleParameterAnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$SimpleParameterAnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r6.this$1
                                net.bytebuddy.description.method.ParameterDescription$Token r2 = new net.bytebuddy.description.method.ParameterDescription$Token
                                net.bytebuddy.description.method.ParameterDescription$Token r3 = r6.token
                                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                                net.bytebuddy.description.method.ParameterDescription$Token r4 = r6.token
                                net.bytebuddy.description.annotation.AnnotationList r4 = r4.getAnnotations()
                                java.util.ArrayList r5 = new java.util.ArrayList
                                r5.<init>(r7)
                                java.util.List r7 = net.bytebuddy.utility.CompoundList.of(r4, r5)
                                net.bytebuddy.description.method.ParameterDescription$Token r4 = r6.token
                                java.lang.String r4 = r4.getName()
                                net.bytebuddy.description.method.ParameterDescription$Token r5 = r6.token
                                java.lang.Integer r5 = r5.getModifiers()
                                r2.<init>(r3, r7, r4, r5)
                                r0.<init>(r1, r2)
                                return r0
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
                                net.bytebuddy.description.method.ParameterDescription$Token r2 = r4.token
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$SimpleParameterAnnotationAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.SimpleParameterAnnotationAdapter) r5
                                net.bytebuddy.description.method.ParameterDescription$Token r3 = r5.token
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L20
                                return r1
                            L20:
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r2 = r4.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r5 = r5.this$1
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L2b
                                return r1
                            L2b:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.description.method.ParameterDescription$Token r1 = r2.token
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r2.this$1
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable.AbstractBase.Adapter
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple<U> materialize() {
                                r14 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r1.this$0
                                net.bytebuddy.description.method.MethodDescription$Token r13 = new net.bytebuddy.description.method.MethodDescription$Token
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                java.lang.String r4 = r1.getName()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                int r5 = r1.getModifiers()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r6 = r1.getTypeVariableTokens()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.type.TypeDescription$Generic r7 = r1.getReturnType()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r1 = r1.getParameterTokens()
                                net.bytebuddy.description.method.ParameterDescription$Token r3 = r14.token
                                java.util.List r8 = net.bytebuddy.utility.CompoundList.of(r1, r3)
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.type.TypeList$Generic r9 = r1.getExceptionTypes()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.annotation.AnnotationList r10 = r1.getAnnotations()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.annotation.AnnotationValue r11 = r1.getDefaultValue()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.type.TypeDescription$Generic r12 = r1.getReceiverType()
                                r3 = r13
                                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                                r0.<init>(r2, r13)
                                return r0
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class TypeVariableAnnotationAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable.AbstractBase.Adapter<U> {
                        final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter this$1;
                        private final net.bytebuddy.description.type.TypeVariableToken token;

                        public TypeVariableAnnotationAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter r1, net.bytebuddy.description.type.TypeVariableToken r2) {
                                r0 = this;
                                r0.this$1 = r1
                                r0.<init>()
                                r0.token = r2
                                return
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<U> annotateTypeVariable(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r8) {
                                r7 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$TypeVariableAnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$TypeVariableAnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r7.this$1
                                net.bytebuddy.description.type.TypeVariableToken r2 = new net.bytebuddy.description.type.TypeVariableToken
                                net.bytebuddy.description.type.TypeVariableToken r3 = r7.token
                                java.lang.String r3 = r3.getSymbol()
                                net.bytebuddy.description.type.TypeVariableToken r4 = r7.token
                                net.bytebuddy.description.type.TypeList$Generic r4 = r4.getBounds()
                                net.bytebuddy.description.type.TypeVariableToken r5 = r7.token
                                net.bytebuddy.description.annotation.AnnotationList r5 = r5.getAnnotations()
                                java.util.ArrayList r6 = new java.util.ArrayList
                                r6.<init>(r8)
                                java.util.List r8 = net.bytebuddy.utility.CompoundList.of(r5, r6)
                                r2.<init>(r3, r4, r8)
                                r0.<init>(r1, r2)
                                return r0
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
                                net.bytebuddy.description.type.TypeVariableToken r2 = r4.token
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$TypeVariableAnnotationAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.TypeVariableAnnotationAdapter) r5
                                net.bytebuddy.description.type.TypeVariableToken r3 = r5.token
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L20
                                return r1
                            L20:
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r2 = r4.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r5 = r5.this$1
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L2b
                                return r1
                            L2b:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.description.type.TypeVariableToken r1 = r2.token
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r2.this$1
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable.AbstractBase.Adapter
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition<U> materialize() {
                                r14 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r1.this$0
                                net.bytebuddy.description.method.MethodDescription$Token r13 = new net.bytebuddy.description.method.MethodDescription$Token
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                java.lang.String r4 = r1.getName()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                int r5 = r1.getModifiers()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r1 = r1.getTypeVariableTokens()
                                net.bytebuddy.description.type.TypeVariableToken r3 = r14.token
                                java.util.List r6 = net.bytebuddy.utility.CompoundList.of(r1, r3)
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.type.TypeDescription$Generic r7 = r1.getReturnType()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.ByteCodeElement$Token$TokenList r8 = r1.getParameterTokens()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.type.TypeList$Generic r9 = r1.getExceptionTypes()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.annotation.AnnotationList r10 = r1.getAnnotations()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.annotation.AnnotationValue r11 = r1.getDefaultValue()
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r1 = r14.this$1
                                net.bytebuddy.description.method.MethodDescription$Token r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter.access$000(r1)
                                net.bytebuddy.description.type.TypeDescription$Generic r12 = r1.getReceiverType()
                                r3 = r13
                                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                                r0.<init>(r2, r13)
                                return r0
                        }
                    }

                    public MethodDefinitionAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r1, net.bytebuddy.description.method.MethodDescription.Token r2) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.token = r2
                            return
                    }

                    public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.Token access$000(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter r0) {
                            net.bytebuddy.description.method.MethodDescription$Token r0 = r0.token
                            return r0
                    }

                    private net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> materialize(net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r2) {
                            r1 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$AnnotationAdapter
                            r0.<init>(r1, r2)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> defaultValue(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r14) {
                            r13 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r13.this$0
                            net.bytebuddy.description.method.MethodDescription$Token r12 = new net.bytebuddy.description.method.MethodDescription$Token
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            java.lang.String r3 = r2.getName()
                            r2 = 1
                            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r2 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r2]
                            net.bytebuddy.description.modifier.MethodManifestation r4 = net.bytebuddy.description.modifier.MethodManifestation.ABSTRACT
                            r5 = 0
                            r2[r5] = r4
                            net.bytebuddy.description.modifier.ModifierContributor$Resolver r2 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r2)
                            net.bytebuddy.description.method.MethodDescription$Token r4 = r13.token
                            int r4 = r4.getModifiers()
                            int r4 = r2.resolve(r4)
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.ByteCodeElement$Token$TokenList r5 = r2.getTypeVariableTokens()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.type.TypeDescription$Generic r6 = r2.getReturnType()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.ByteCodeElement$Token$TokenList r7 = r2.getParameterTokens()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.type.TypeList$Generic r8 = r2.getExceptionTypes()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.annotation.AnnotationList r9 = r2.getAnnotations()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.type.TypeDescription$Generic r11 = r2.getReceiverType()
                            r2 = r12
                            r10 = r14
                            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                            r0.<init>(r1, r12)
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAnnotationValue r1 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAnnotationValue
                            r1.<init>(r14)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r14 = r0.materialize(r1)
                            return r14
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
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r4.token
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodDefinitionAdapter) r5
                            net.bytebuddy.description.method.MethodDescription$Token r3 = r5.token
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r4.this$0
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r5.this$0
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.method.MethodDescription$Token r1 = r2.token
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> intercept(net.bytebuddy.implementation.Implementation r2) {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation
                            r0.<init>(r2)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r1.materialize(r0)
                            return r2
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<U> throwing(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r14) {
                            r13 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r13.this$0
                            net.bytebuddy.description.method.MethodDescription$Token r12 = new net.bytebuddy.description.method.MethodDescription$Token
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            java.lang.String r3 = r2.getName()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            int r4 = r2.getModifiers()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.ByteCodeElement$Token$TokenList r5 = r2.getTypeVariableTokens()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.type.TypeDescription$Generic r6 = r2.getReturnType()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.ByteCodeElement$Token$TokenList r7 = r2.getParameterTokens()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.type.TypeList$Generic r2 = r2.getExceptionTypes()
                            net.bytebuddy.description.type.TypeList$Generic$Explicit r8 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                            java.util.ArrayList r9 = new java.util.ArrayList
                            r9.<init>(r14)
                            r8.<init>(r9)
                            java.util.List r8 = net.bytebuddy.utility.CompoundList.of(r2, r8)
                            net.bytebuddy.description.method.MethodDescription$Token r14 = r13.token
                            net.bytebuddy.description.annotation.AnnotationList r9 = r14.getAnnotations()
                            net.bytebuddy.description.method.MethodDescription$Token r14 = r13.token
                            net.bytebuddy.description.annotation.AnnotationValue r10 = r14.getDefaultValue()
                            net.bytebuddy.description.method.MethodDescription$Token r14 = r13.token
                            net.bytebuddy.description.type.TypeDescription$Generic r11 = r14.getReceiverType()
                            r2 = r12
                            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                            r0.<init>(r1, r12)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<U> typeVariable(java.lang.String r5, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r6) {
                            r4 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$TypeVariableAnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$TypeVariableAnnotationAdapter
                            net.bytebuddy.description.type.TypeVariableToken r1 = new net.bytebuddy.description.type.TypeVariableToken
                            net.bytebuddy.description.type.TypeList$Generic$Explicit r2 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                            java.util.ArrayList r3 = new java.util.ArrayList
                            r3.<init>(r6)
                            r2.<init>(r3)
                            r1.<init>(r5, r2)
                            r0.<init>(r4, r1)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<U> withParameter(net.bytebuddy.description.type.TypeDefinition r3, java.lang.String r4, int r5) {
                            r2 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$ParameterAnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$ParameterAnnotationAdapter
                            net.bytebuddy.description.method.ParameterDescription$Token r1 = new net.bytebuddy.description.method.ParameterDescription$Token
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                            r1.<init>(r3, r4, r5)
                            r0.<init>(r2, r1)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<U> withParameter(net.bytebuddy.description.type.TypeDefinition r3) {
                            r2 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$SimpleParameterAnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter$SimpleParameterAnnotationAdapter
                            net.bytebuddy.description.method.ParameterDescription$Token r1 = new net.bytebuddy.description.method.ParameterDescription$Token
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                            r1.<init>(r3)
                            r0.<init>(r2, r1)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> withoutCode() {
                            r13 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r13.this$0
                            net.bytebuddy.description.method.MethodDescription$Token r12 = new net.bytebuddy.description.method.MethodDescription$Token
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            java.lang.String r3 = r2.getName()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            int r2 = r2.getModifiers()
                            r2 = r2 & 256(0x100, float:3.59E-43)
                            if (r2 != 0) goto L2e
                            r2 = 1
                            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r2 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r2]
                            net.bytebuddy.description.modifier.MethodManifestation r4 = net.bytebuddy.description.modifier.MethodManifestation.ABSTRACT
                            r5 = 0
                            r2[r5] = r4
                            net.bytebuddy.description.modifier.ModifierContributor$Resolver r2 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r2)
                            net.bytebuddy.description.method.MethodDescription$Token r4 = r13.token
                            int r4 = r4.getModifiers()
                            int r2 = r2.resolve(r4)
                        L2c:
                            r4 = r2
                            goto L35
                        L2e:
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            int r2 = r2.getModifiers()
                            goto L2c
                        L35:
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.ByteCodeElement$Token$TokenList r5 = r2.getTypeVariableTokens()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.type.TypeDescription$Generic r6 = r2.getReturnType()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.ByteCodeElement$Token$TokenList r7 = r2.getParameterTokens()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.type.TypeList$Generic r8 = r2.getExceptionTypes()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.annotation.AnnotationList r9 = r2.getAnnotations()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.annotation.AnnotationValue r10 = r2.getDefaultValue()
                            net.bytebuddy.description.method.MethodDescription$Token r2 = r13.token
                            net.bytebuddy.description.type.TypeDescription$Generic r11 = r2.getReceiverType()
                            r2 = r12
                            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                            r0.<init>(r1, r12)
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAbstractMethod r1 = net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod.INSTANCE
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.materialize(r1)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class MethodMatchAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.AbstractBase<U> {
                    private final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
                    final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter this$0;

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    public class AnnotationAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter<U> {
                        final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodMatchAdapter this$1;

                        public AnnotationAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodMatchAdapter r3, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r4) {
                                r2 = this;
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp.INSTANCE
                                net.bytebuddy.dynamic.Transformer r1 = net.bytebuddy.dynamic.Transformer.NoOp.make()
                                r2.<init>(r3, r4, r0, r1)
                                return
                        }

                        public AnnotationAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodMatchAdapter r1, net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r3, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r4) {
                                r0 = this;
                                r0.this$1 = r1
                                r0.<init>(r2, r3, r4)
                                return
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> annotateMethod(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r8) {
                                r7 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r1 = r7.this$1
                                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r2 = r7.handler
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound r3 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r4 = r7.methodAttributeAppenderFactory
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit r5 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit
                                java.util.ArrayList r6 = new java.util.ArrayList
                                r6.<init>(r8)
                                r5.<init>(r6)
                                r8 = 2
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory[] r8 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory[r8]
                                r6 = 0
                                r8[r6] = r4
                                r4 = 1
                                r8[r4] = r5
                                r3.<init>(r8)
                                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r8 = r7.transformer
                                r0.<init>(r1, r2, r3, r8)
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> annotateParameter(int r8, java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r9) {
                                r7 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r1 = r7.this$1
                                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r2 = r7.handler
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound r3 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r4 = r7.methodAttributeAppenderFactory
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit r5 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit
                                java.util.ArrayList r6 = new java.util.ArrayList
                                r6.<init>(r9)
                                r5.<init>(r8, r6)
                                r8 = 2
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory[] r8 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory[r8]
                                r9 = 0
                                r8[r9] = r4
                                r9 = 1
                                r8[r9] = r5
                                r3.<init>(r8)
                                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r8 = r7.transformer
                                r0.<init>(r1, r2, r3, r8)
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
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
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r2 = r4.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodMatchAdapter.AnnotationAdapter) r5
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r5 = r5.this$1
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L27
                                return r1
                            L27:
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
                        public int hashCode() {
                                r2 = this;
                                int r0 = super.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r1 = r2.this$1
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> materialize(net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r3, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r4, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r5) {
                                r2 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r1 = r2.this$1
                                r0.<init>(r1, r3, r4, r5)
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                        public net.bytebuddy.dynamic.DynamicType.Builder<U> materialize() {
                                r20 = this;
                                r0 = r20
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r1 = r0.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r1.this$0
                                r2 = r5
                                net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r3 = r5.instrumentedType
                                net.bytebuddy.dynamic.scaffold.FieldRegistry r4 = r5.fieldRegistry
                                net.bytebuddy.dynamic.scaffold.MethodRegistry r5 = r5.methodRegistry
                                net.bytebuddy.matcher.LatentMatcher r1 = net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodMatchAdapter.access$100(r1)
                                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r6 = r0.handler
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r7 = r0.methodAttributeAppenderFactory
                                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r8 = r0.transformer
                                net.bytebuddy.dynamic.scaffold.MethodRegistry r5 = r5.prepend(r1, r6, r7, r8)
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r1 = r0.this$1
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r1.this$0
                                net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r6 = r1.recordComponentRegistry
                                net.bytebuddy.implementation.attribute.TypeAttributeAppender r7 = r1.typeAttributeAppender
                                net.bytebuddy.asm.AsmVisitorWrapper r8 = r1.asmVisitorWrapper
                                net.bytebuddy.ClassFileVersion r9 = r1.classFileVersion
                                net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r10 = r1.auxiliaryTypeNamingStrategy
                                net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r11 = r1.annotationValueFilterFactory
                                net.bytebuddy.implementation.attribute.AnnotationRetention r12 = r1.annotationRetention
                                net.bytebuddy.implementation.Implementation$Context$Factory r13 = r1.implementationContextFactory
                                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r14 = r1.methodGraphCompiler
                                net.bytebuddy.dynamic.scaffold.TypeValidation r15 = r1.typeValidation
                                net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r1.visibilityBridgeStrategy
                                r16 = r0
                                net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                                r17 = r0
                                net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                                r18 = r0
                                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                                r19 = r0
                                net.bytebuddy.dynamic.DynamicType$Builder r0 = r2.materialize(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> receiverType(net.bytebuddy.description.type.TypeDescription.Generic r8) {
                                r7 = this;
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter
                                net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r1 = r7.this$1
                                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r2 = r7.handler
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound r3 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r4 = r7.methodAttributeAppenderFactory
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForReceiverType r5 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForReceiverType
                                r5.<init>(r8)
                                r8 = 2
                                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory[] r8 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory[r8]
                                r6 = 0
                                r8[r6] = r4
                                r4 = 1
                                r8[r4] = r5
                                r3.<init>(r8)
                                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r8 = r7.transformer
                                r0.<init>(r1, r2, r3, r8)
                                return r0
                        }
                    }

                    public MethodMatchAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r1, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.matcher = r2
                            return
                    }

                    public static /* synthetic */ net.bytebuddy.matcher.LatentMatcher access$100(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodMatchAdapter r0) {
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r0.matcher
                            return r0
                    }

                    private net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> materialize(net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r2) {
                            r1 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter$AnnotationAdapter
                            r0.<init>(r1, r2)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> defaultValue(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2) {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAnnotationValue r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAnnotationValue
                            r0.<init>(r2)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r1.materialize(r0)
                            return r2
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
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.MethodMatchAdapter) r5
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.matcher
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r4.this$0
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r5.this$0
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> intercept(net.bytebuddy.implementation.Implementation r2) {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation
                            r0.<init>(r2)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r1.materialize(r0)
                            return r2
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> withoutCode() {
                            r1 = this;
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForAbstractMethod r0 = net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler.ForAbstractMethod.INSTANCE
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r1.materialize(r0)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class OptionalMethodMatchAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator<U> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<U> {
                    private final net.bytebuddy.description.type.TypeList.Generic interfaces;
                    final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter this$0;

                    public OptionalMethodMatchAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r1, net.bytebuddy.description.type.TypeList.Generic r2) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.interfaces = r2
                            return
                    }

                    private net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<U> interfaceType() {
                            r3 = this;
                            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.none()
                            net.bytebuddy.description.type.TypeList$Generic r1 = r3.interfaces
                            net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
                            java.util.Iterator r1 = r1.iterator()
                        Le:
                            boolean r2 = r1.hasNext()
                            if (r2 == 0) goto L23
                            java.lang.Object r2 = r1.next()
                            net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isSuperTypeOf(r2)
                            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r0.or(r2)
                            goto Le
                        L23:
                            net.bytebuddy.dynamic.DynamicType$Builder r1 = r3.materialize()
                            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isInterface()
                            net.bytebuddy.matcher.ElementMatcher$Junction r0 = r2.and(r0)
                            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isDeclaredBy(r0)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r0 = r1.invokable(r0)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public <V> net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> defaultValue(V r2, java.lang.Class<? extends V> r3) {
                            r1 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r0 = r1.interfaceType()
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.defaultValue(r2, r3)
                            return r2
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> defaultValue(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2) {
                            r1 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r0 = r1.interfaceType()
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.defaultValue(r2)
                            return r2
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
                            net.bytebuddy.description.type.TypeList$Generic r2 = r4.interfaces
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$OptionalMethodMatchAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.OptionalMethodMatchAdapter) r5
                            net.bytebuddy.description.type.TypeList$Generic r3 = r5.interfaces
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r4.this$0
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r5.this$0
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.type.TypeList$Generic r1 = r2.interfaces
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> intercept(net.bytebuddy.implementation.Implementation r2) {
                            r1 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r0 = r1.interfaceType()
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.intercept(r2)
                            return r2
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> materialize() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r0.this$0
                            r1 = r2
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.instrumentedType
                            net.bytebuddy.description.type.TypeList$Generic r3 = r0.interfaces
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withInterfaces(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r15.fieldRegistry
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r15.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r15.recordComponentRegistry
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> withoutCode() {
                            r1 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r0 = r1.interfaceType()
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.withoutCode()
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class RecordComponentDefinitionAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional.AbstractBase<U> {
                    private final net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory recordComponentAttributeAppenderFactory;
                    final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter this$0;
                    private final net.bytebuddy.description.type.RecordComponentDescription.Token token;
                    private final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> transformer;

                    public RecordComponentDefinitionAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r3, net.bytebuddy.description.type.RecordComponentDescription.Token r4) {
                            r2 = this;
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$ForInstrumentedRecordComponent r0 = net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.ForInstrumentedRecordComponent.INSTANCE
                            net.bytebuddy.dynamic.Transformer r1 = net.bytebuddy.dynamic.Transformer.NoOp.make()
                            r2.<init>(r3, r0, r1, r4)
                            return
                    }

                    public RecordComponentDefinitionAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r1, net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory r2, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r3, net.bytebuddy.description.type.RecordComponentDescription.Token r4) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.recordComponentAttributeAppenderFactory = r2
                            r0.transformer = r3
                            r0.token = r4
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> annotateRecordComponent(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r10) {
                            r9 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r9.this$0
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r2 = r9.recordComponentAttributeAppenderFactory
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r3 = r9.transformer
                            net.bytebuddy.description.type.RecordComponentDescription$Token r4 = new net.bytebuddy.description.type.RecordComponentDescription$Token
                            net.bytebuddy.description.type.RecordComponentDescription$Token r5 = r9.token
                            java.lang.String r5 = r5.getName()
                            net.bytebuddy.description.type.RecordComponentDescription$Token r6 = r9.token
                            net.bytebuddy.description.type.TypeDescription$Generic r6 = r6.getType()
                            net.bytebuddy.description.type.RecordComponentDescription$Token r7 = r9.token
                            net.bytebuddy.description.annotation.AnnotationList r7 = r7.getAnnotations()
                            java.util.ArrayList r8 = new java.util.ArrayList
                            r8.<init>(r10)
                            java.util.List r10 = net.bytebuddy.utility.CompoundList.of(r7, r8)
                            r4.<init>(r5, r6, r10)
                            r0.<init>(r1, r2, r3, r4)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> attribute(net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory r7) {
                            r6 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r6.this$0
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory$Compound r2 = new net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory$Compound
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r3 = r6.recordComponentAttributeAppenderFactory
                            r4 = 2
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory[] r4 = new net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory[r4]
                            r5 = 0
                            r4[r5] = r3
                            r3 = 1
                            r4[r3] = r7
                            r2.<init>(r4)
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r7 = r6.transformer
                            net.bytebuddy.description.type.RecordComponentDescription$Token r3 = r6.token
                            r0.<init>(r1, r2, r7, r3)
                            return r0
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
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r2 = r4.recordComponentAttributeAppenderFactory
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.RecordComponentDefinitionAdapter) r5
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r3 = r5.recordComponentAttributeAppenderFactory
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.type.RecordComponentDescription$Token r2 = r4.token
                            net.bytebuddy.description.type.RecordComponentDescription$Token r3 = r5.token
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r2 = r4.transformer
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r3 = r5.transformer
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L36
                            return r1
                        L36:
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r4.this$0
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r5.this$0
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L41
                            return r1
                        L41:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r1 = r2.recordComponentAttributeAppenderFactory
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.type.RecordComponentDescription$Token r1 = r2.token
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r1 = r2.transformer
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> materialize() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r0.this$0
                            r1 = r2
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.instrumentedType
                            net.bytebuddy.description.type.RecordComponentDescription$Token r3 = r0.token
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withRecordComponent(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r5.fieldRegistry
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r5.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r5.recordComponentRegistry
                            net.bytebuddy.matcher.LatentMatcher$ForRecordComponentToken r6 = new net.bytebuddy.matcher.LatentMatcher$ForRecordComponentToken
                            net.bytebuddy.description.type.RecordComponentDescription$Token r7 = r0.token
                            r6.<init>(r7)
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r7 = r0.recordComponentAttributeAppenderFactory
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r8 = r0.transformer
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r5.prepend(r6, r7, r8)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> transform(net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r8) {
                            r7 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r7.this$0
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r2 = r7.recordComponentAttributeAppenderFactory
                            net.bytebuddy.dynamic.Transformer$Compound r3 = new net.bytebuddy.dynamic.Transformer$Compound
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r4 = r7.transformer
                            r5 = 2
                            net.bytebuddy.dynamic.Transformer[] r5 = new net.bytebuddy.dynamic.Transformer[r5]
                            r6 = 0
                            r5[r6] = r4
                            r4 = 1
                            r5[r4] = r8
                            r3.<init>(r5)
                            net.bytebuddy.description.type.RecordComponentDescription$Token r8 = r7.token
                            r0.<init>(r1, r2, r3, r8)
                            return r0
                    }
                }

                public class RecordComponentMatchAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional.AbstractBase<U> {
                    private final net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> matcher;
                    private final net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory recordComponentAttributeAppenderFactory;
                    final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter this$0;
                    private final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> transformer;

                    public RecordComponentMatchAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r3, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r4) {
                            r2 = this;
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$NoOp r0 = net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.NoOp.INSTANCE
                            net.bytebuddy.dynamic.Transformer r1 = net.bytebuddy.dynamic.Transformer.NoOp.make()
                            r2.<init>(r3, r4, r0, r1)
                            return
                    }

                    public RecordComponentMatchAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r1, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r2, net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory r3, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r4) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.matcher = r2
                            r0.recordComponentAttributeAppenderFactory = r3
                            r0.transformer = r4
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> annotateRecordComponent(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3) {
                            r2 = this;
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Explicit r0 = new net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Explicit
                            java.util.ArrayList r1 = new java.util.ArrayList
                            r1.<init>(r3)
                            r0.<init>(r1)
                            net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition$Optional r3 = r2.attribute(r0)
                            return r3
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> attribute(net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory r8) {
                            r7 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentMatchAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentMatchAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r7.this$0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r2 = r7.matcher
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory$Compound r3 = new net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory$Compound
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r4 = r7.recordComponentAttributeAppenderFactory
                            r5 = 2
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory[] r5 = new net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory[r5]
                            r6 = 0
                            r5[r6] = r4
                            r4 = 1
                            r5[r4] = r8
                            r3.<init>(r5)
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r8 = r7.transformer
                            r0.<init>(r1, r2, r3, r8)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> materialize() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r0.this$0
                            r1 = r5
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r5.instrumentedType
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r5.fieldRegistry
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r5.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r5.recordComponentRegistry
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r6 = r0.matcher
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r7 = r0.recordComponentAttributeAppenderFactory
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r8 = r0.transformer
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r5.prepend(r6, r7, r8)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> transform(net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r9) {
                            r8 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentMatchAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentMatchAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r8.this$0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r2 = r8.matcher
                            net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender$Factory r3 = r8.recordComponentAttributeAppenderFactory
                            net.bytebuddy.dynamic.Transformer$Compound r4 = new net.bytebuddy.dynamic.Transformer$Compound
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r5 = r8.transformer
                            r6 = 2
                            net.bytebuddy.dynamic.Transformer[] r6 = new net.bytebuddy.dynamic.Transformer[r6]
                            r7 = 0
                            r6[r7] = r5
                            r5 = 1
                            r6[r5] = r9
                            r4.<init>(r6)
                            r0.<init>(r1, r2, r3, r4)
                            return r0
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class TypeVariableDefinitionAdapter extends net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition.AbstractBase<U> {
                    final /* synthetic */ net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter this$0;
                    private final net.bytebuddy.description.type.TypeVariableToken token;

                    public TypeVariableDefinitionAdapter(net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter r1, net.bytebuddy.description.type.TypeVariableToken r2) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.token = r2
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<U> annotateTypeVariable(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r8) {
                            r7 = this;
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$TypeVariableDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$TypeVariableDefinitionAdapter
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r7.this$0
                            net.bytebuddy.description.type.TypeVariableToken r2 = new net.bytebuddy.description.type.TypeVariableToken
                            net.bytebuddy.description.type.TypeVariableToken r3 = r7.token
                            java.lang.String r3 = r3.getSymbol()
                            net.bytebuddy.description.type.TypeVariableToken r4 = r7.token
                            net.bytebuddy.description.type.TypeList$Generic r4 = r4.getBounds()
                            net.bytebuddy.description.type.TypeVariableToken r5 = r7.token
                            net.bytebuddy.description.annotation.AnnotationList r5 = r5.getAnnotations()
                            java.util.ArrayList r6 = new java.util.ArrayList
                            r6.<init>(r8)
                            java.util.List r8 = net.bytebuddy.utility.CompoundList.of(r5, r6)
                            r2.<init>(r3, r4, r8)
                            r0.<init>(r1, r2)
                            return r0
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
                            net.bytebuddy.description.type.TypeVariableToken r2 = r4.token
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$TypeVariableDefinitionAdapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter.TypeVariableDefinitionAdapter) r5
                            net.bytebuddy.description.type.TypeVariableToken r3 = r5.token
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r4.this$0
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = r5.this$0
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.type.TypeVariableToken r1 = r2.token
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator
                    public net.bytebuddy.dynamic.DynamicType.Builder<U> materialize() {
                            r20 = this;
                            r0 = r20
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r2 = r0.this$0
                            r1 = r2
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.instrumentedType
                            net.bytebuddy.description.type.TypeVariableToken r3 = r0.token
                            net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r2.withTypeVariable(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r15 = r0.this$0
                            net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r15.fieldRegistry
                            net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r15.methodRegistry
                            net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r5 = r15.recordComponentRegistry
                            net.bytebuddy.implementation.attribute.TypeAttributeAppender r6 = r15.typeAttributeAppender
                            net.bytebuddy.asm.AsmVisitorWrapper r7 = r15.asmVisitorWrapper
                            net.bytebuddy.ClassFileVersion r8 = r15.classFileVersion
                            net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r9 = r15.auxiliaryTypeNamingStrategy
                            net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r10 = r15.annotationValueFilterFactory
                            net.bytebuddy.implementation.attribute.AnnotationRetention r11 = r15.annotationRetention
                            net.bytebuddy.implementation.Implementation$Context$Factory r12 = r15.implementationContextFactory
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r13 = r15.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.TypeValidation r14 = r15.typeValidation
                            net.bytebuddy.dynamic.VisibilityBridgeStrategy r0 = r15.visibilityBridgeStrategy
                            r19 = r1
                            r1 = r15
                            r15 = r0
                            net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r1.classWriterStrategy
                            r16 = r0
                            net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                            r17 = r0
                            java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                            r18 = r0
                            r1 = r19
                            net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                            return r0
                    }
                }

                public Adapter(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r3, net.bytebuddy.dynamic.scaffold.FieldRegistry r4, net.bytebuddy.dynamic.scaffold.MethodRegistry r5, net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r6, net.bytebuddy.implementation.attribute.TypeAttributeAppender r7, net.bytebuddy.asm.AsmVisitorWrapper r8, net.bytebuddy.ClassFileVersion r9, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r10, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r11, net.bytebuddy.implementation.attribute.AnnotationRetention r12, net.bytebuddy.implementation.Implementation.Context.Factory r13, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r14, net.bytebuddy.dynamic.scaffold.TypeValidation r15, net.bytebuddy.dynamic.VisibilityBridgeStrategy r16, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r17, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r18, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r19) {
                        r2 = this;
                        r0 = r2
                        r2.<init>()
                        r1 = r3
                        r0.instrumentedType = r1
                        r1 = r4
                        r0.fieldRegistry = r1
                        r1 = r5
                        r0.methodRegistry = r1
                        r1 = r6
                        r0.recordComponentRegistry = r1
                        r1 = r7
                        r0.typeAttributeAppender = r1
                        r1 = r8
                        r0.asmVisitorWrapper = r1
                        r1 = r9
                        r0.classFileVersion = r1
                        r1 = r10
                        r0.auxiliaryTypeNamingStrategy = r1
                        r1 = r11
                        r0.annotationValueFilterFactory = r1
                        r1 = r12
                        r0.annotationRetention = r1
                        r1 = r13
                        r0.implementationContextFactory = r1
                        r1 = r14
                        r0.methodGraphCompiler = r1
                        r1 = r15
                        r0.typeValidation = r1
                        r1 = r16
                        r0.visibilityBridgeStrategy = r1
                        r1 = r17
                        r0.classWriterStrategy = r1
                        r1 = r18
                        r0.ignoredMethods = r1
                        r1 = r19
                        r0.auxiliaryTypes = r1
                        return
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> annotateType(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r20) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r3 = r20
                        r2.<init>(r3)
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withAnnotations(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> attribute(net.bytebuddy.implementation.attribute.TypeAttributeAppender r21) {
                        r20 = this;
                        r15 = r20
                        r0 = r20
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender$Compound r6 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender$Compound
                        r5 = r6
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r7 = r15.typeAttributeAppender
                        r8 = 2
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender[] r8 = new net.bytebuddy.implementation.attribute.TypeAttributeAppender[r8]
                        r9 = 0
                        r8[r9] = r7
                        r7 = 1
                        r8[r7] = r21
                        r6.<init>(r8)
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r19 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r0 = r18
                        r1 = r19
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> declaredTypes(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r20) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        net.bytebuddy.description.type.TypeList$Explicit r2 = new net.bytebuddy.description.type.TypeList$Explicit
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r4 = r20
                        r3.<init>(r4)
                        r2.<init>(r3)
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withDeclaredTypes(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<U> defineConstructor(int r3) {
                        r2 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                        net.bytebuddy.description.method.MethodDescription$Token r1 = new net.bytebuddy.description.method.MethodDescription$Token
                        r1.<init>(r3)
                        r0.<init>(r2, r1)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<U> defineField(java.lang.String r3, net.bytebuddy.description.type.TypeDefinition r4, int r5) {
                        r2 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldDefinitionAdapter
                        net.bytebuddy.description.field.FieldDescription$Token r1 = new net.bytebuddy.description.field.FieldDescription$Token
                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.asGenericType()
                        r1.<init>(r3, r5, r4)
                        r0.<init>(r2, r1)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<U> defineMethod(java.lang.String r3, net.bytebuddy.description.type.TypeDefinition r4, int r5) {
                        r2 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodDefinitionAdapter
                        net.bytebuddy.description.method.MethodDescription$Token r1 = new net.bytebuddy.description.method.MethodDescription$Token
                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.asGenericType()
                        r1.<init>(r3, r5, r4)
                        r0.<init>(r2, r1)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> defineRecordComponent(java.lang.String r3, net.bytebuddy.description.type.TypeDefinition r4) {
                        r2 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentDefinitionAdapter
                        net.bytebuddy.description.type.RecordComponentDescription$Token r1 = new net.bytebuddy.description.type.RecordComponentDescription$Token
                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.asGenericType()
                        r1.<init>(r3, r4)
                        r0.<init>(r2, r1)
                        return r0
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
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Adapter) r5
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
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r2 = r4.instrumentedType
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r3 = r5.instrumentedType
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L36
                        return r1
                    L36:
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r4.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r3 = r5.fieldRegistry
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L41
                        return r1
                    L41:
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r2 = r4.methodRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r5.methodRegistry
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L4c
                        return r1
                    L4c:
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r2 = r4.recordComponentRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r3 = r5.recordComponentRegistry
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L57
                        return r1
                    L57:
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r2 = r4.typeAttributeAppender
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r3 = r5.typeAttributeAppender
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L62
                        return r1
                    L62:
                        net.bytebuddy.asm.AsmVisitorWrapper r2 = r4.asmVisitorWrapper
                        net.bytebuddy.asm.AsmVisitorWrapper r3 = r5.asmVisitorWrapper
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L6d
                        return r1
                    L6d:
                        net.bytebuddy.ClassFileVersion r2 = r4.classFileVersion
                        net.bytebuddy.ClassFileVersion r3 = r5.classFileVersion
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L78
                        return r1
                    L78:
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r2 = r4.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r3 = r5.auxiliaryTypeNamingStrategy
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L83
                        return r1
                    L83:
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r2 = r4.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r3 = r5.annotationValueFilterFactory
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L8e
                        return r1
                    L8e:
                        net.bytebuddy.implementation.Implementation$Context$Factory r2 = r4.implementationContextFactory
                        net.bytebuddy.implementation.Implementation$Context$Factory r3 = r5.implementationContextFactory
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L99
                        return r1
                    L99:
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r5.methodGraphCompiler
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto La4
                        return r1
                    La4:
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r2 = r4.visibilityBridgeStrategy
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r3 = r5.visibilityBridgeStrategy
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto Laf
                        return r1
                    Laf:
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r2 = r4.classWriterStrategy
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r3 = r5.classWriterStrategy
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto Lba
                        return r1
                    Lba:
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.ignoredMethods
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.ignoredMethods
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto Lc5
                        return r1
                    Lc5:
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r2 = r4.auxiliaryTypes
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r5 = r5.auxiliaryTypes
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto Ld0
                        return r1
                    Ld0:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable<U> field(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldMatchAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$FieldMatchAdapter
                        r0.<init>(r1, r2)
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r2.instrumentedType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r1 = r2.fieldRegistry
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r1 = r2.methodRegistry
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r1 = r2.recordComponentRegistry
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
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r1 = r2.visibilityBridgeStrategy
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
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r1 = r2.auxiliaryTypes
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> ignoreAlso(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r23) {
                        r22 = this;
                        r15 = r22
                        r0 = r22
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r19 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher$Disjunction r0 = new net.bytebuddy.matcher.LatentMatcher$Disjunction
                        r16 = r0
                        r20 = r2
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r1.ignoredMethods
                        r21 = r3
                        r3 = 2
                        net.bytebuddy.matcher.LatentMatcher[] r3 = new net.bytebuddy.matcher.LatentMatcher[r3]
                        r17 = 0
                        r3[r17] = r2
                        r2 = 1
                        r3[r2] = r23
                        r0.<init>(r3)
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r0 = r18
                        r1 = r19
                        r2 = r20
                        r3 = r21
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<U> implement(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r4) {
                        r3 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$OptionalMethodMatchAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$OptionalMethodMatchAdapter
                        net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>(r4)
                        r1.<init>(r2)
                        r0.<init>(r3, r1)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> initializer(net.bytebuddy.implementation.LoadedTypeInitializer r20) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        r2 = r20
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withInitializer(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> initializer(net.bytebuddy.implementation.bytecode.ByteCodeAppender r20) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        r2 = r20
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withInitializer(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition.ForType<U> innerTypeOf(net.bytebuddy.description.type.TypeDescription r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$InnerTypeDefinitionForTypeAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$InnerTypeDefinitionForTypeAdapter
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition<U> innerTypeOf(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                        r1 = this;
                        boolean r0 = r2.isTypeInitializer()
                        if (r0 == 0) goto L10
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$InnerTypeDefinitionForTypeAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$InnerTypeDefinitionForTypeAdapter
                        net.bytebuddy.description.type.TypeDescription r2 = r2.getDeclaringType()
                        r0.<init>(r1, r2)
                        goto L15
                    L10:
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$InnerTypeDefinitionForMethodAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$InnerTypeDefinitionForMethodAdapter
                        r0.<init>(r1, r2)
                    L15:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<U> invokable(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$MethodMatchAdapter
                        r0.<init>(r1, r2)
                        return r0
                }

                public abstract net.bytebuddy.dynamic.DynamicType.Builder<U> materialize(net.bytebuddy.dynamic.scaffold.InstrumentedType.WithFlexibleName r1, net.bytebuddy.dynamic.scaffold.FieldRegistry r2, net.bytebuddy.dynamic.scaffold.MethodRegistry r3, net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4, net.bytebuddy.implementation.attribute.TypeAttributeAppender r5, net.bytebuddy.asm.AsmVisitorWrapper r6, net.bytebuddy.ClassFileVersion r7, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r8, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r9, net.bytebuddy.implementation.attribute.AnnotationRetention r10, net.bytebuddy.implementation.Implementation.Context.Factory r11, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r12, net.bytebuddy.dynamic.scaffold.TypeValidation r13, net.bytebuddy.dynamic.VisibilityBridgeStrategy r14, net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r15, net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r16, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r17);

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> merge(java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForType> r20) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        net.bytebuddy.description.modifier.ModifierContributor$Resolver r2 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r20)
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r3 = r15.instrumentedType
                        int r3 = r3.getModifiers()
                        int r2 = r2.resolve(r3)
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withModifiers(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> modifiers(int r20) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        r2 = r20
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withModifiers(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> name(java.lang.String r20) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        r2 = r20
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withName(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> nestHost(net.bytebuddy.description.type.TypeDescription r20) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        r2 = r20
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withNestHost(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> nestMembers(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r20) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        net.bytebuddy.description.type.TypeList$Explicit r2 = new net.bytebuddy.description.type.TypeList$Explicit
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r4 = r20
                        r3.<init>(r4)
                        r2.<init>(r3)
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withNestMembers(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> permittedSubclass(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r20) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        net.bytebuddy.description.type.TypeList$Explicit r2 = new net.bytebuddy.description.type.TypeList$Explicit
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r4 = r20
                        r3.<init>(r4)
                        r2.<init>(r3)
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withPermittedSubclasses(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition<U> recordComponent(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentMatchAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$RecordComponentMatchAdapter
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> require(java.util.Collection<net.bytebuddy.dynamic.DynamicType> r22) {
                        r21 = this;
                        r15 = r21
                        r0 = r21
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r19 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r20 = r2
                        r2 = r22
                        r1.<init>(r2)
                        java.util.List r17 = net.bytebuddy.utility.CompoundList.of(r0, r1)
                        r0 = r18
                        r1 = r19
                        r2 = r20
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> suffix(java.lang.String r3) {
                        r2 = this;
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r2.instrumentedType
                        java.lang.String r1 = r1.getName()
                        r0.append(r1)
                        java.lang.String r1 = "$"
                        r0.append(r1)
                        r0.append(r3)
                        java.lang.String r3 = r0.toString()
                        net.bytebuddy.dynamic.DynamicType$Builder r3 = r2.name(r3)
                        return r3
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.description.type.TypeDescription toTypeDescription() {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r0 = r1.instrumentedType
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> topLevelType() {
                        r20 = this;
                        r15 = r20
                        r0 = r20
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withDeclaringType(r2)
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withEnclosingType(r2)
                        r2 = 0
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withLocalClass(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r19 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r0 = r18
                        r1 = r19
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> transform(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r20, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.TypeVariableToken> r21) {
                        r19 = this;
                        r15 = r19
                        r0 = r19
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        r2 = r20
                        r3 = r21
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withTypeVariables(r2, r3)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r20 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r1 = r20
                        r0 = r18
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<U> typeVariable(java.lang.String r5, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r6) {
                        r4 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$TypeVariableDefinitionAdapter r0 = new net.bytebuddy.dynamic.DynamicType$Builder$AbstractBase$Adapter$TypeVariableDefinitionAdapter
                        net.bytebuddy.description.type.TypeVariableToken r1 = new net.bytebuddy.description.type.TypeVariableToken
                        net.bytebuddy.description.type.TypeList$Generic$Explicit r2 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                        java.util.ArrayList r3 = new java.util.ArrayList
                        r3.<init>(r6)
                        r2.<init>(r3)
                        r1.<init>(r5, r2)
                        r0.<init>(r4, r1)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> unsealed() {
                        r20 = this;
                        r15 = r20
                        r0 = r20
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        net.bytebuddy.description.type.TypeList r2 = net.bytebuddy.description.type.TypeList.UNDEFINED
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r1.withPermittedSubclasses(r2)
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper r6 = r15.asmVisitorWrapper
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r19 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r0 = r18
                        r1 = r19
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> visit(net.bytebuddy.asm.AsmVisitorWrapper r21) {
                        r20 = this;
                        r15 = r20
                        r0 = r20
                        net.bytebuddy.dynamic.scaffold.InstrumentedType$WithFlexibleName r1 = r15.instrumentedType
                        net.bytebuddy.dynamic.scaffold.FieldRegistry r2 = r15.fieldRegistry
                        net.bytebuddy.dynamic.scaffold.MethodRegistry r3 = r15.methodRegistry
                        net.bytebuddy.dynamic.scaffold.RecordComponentRegistry r4 = r15.recordComponentRegistry
                        net.bytebuddy.implementation.attribute.TypeAttributeAppender r5 = r15.typeAttributeAppender
                        net.bytebuddy.asm.AsmVisitorWrapper$Compound r7 = new net.bytebuddy.asm.AsmVisitorWrapper$Compound
                        r6 = r7
                        net.bytebuddy.asm.AsmVisitorWrapper r8 = r15.asmVisitorWrapper
                        r9 = 2
                        net.bytebuddy.asm.AsmVisitorWrapper[] r9 = new net.bytebuddy.asm.AsmVisitorWrapper[r9]
                        r10 = 0
                        r9[r10] = r8
                        r8 = 1
                        r9[r8] = r21
                        r7.<init>(r9)
                        net.bytebuddy.ClassFileVersion r7 = r15.classFileVersion
                        net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r8 = r15.auxiliaryTypeNamingStrategy
                        net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r9 = r15.annotationValueFilterFactory
                        net.bytebuddy.implementation.attribute.AnnotationRetention r10 = r15.annotationRetention
                        net.bytebuddy.implementation.Implementation$Context$Factory r11 = r15.implementationContextFactory
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r15.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.TypeValidation r13 = r15.typeValidation
                        net.bytebuddy.dynamic.VisibilityBridgeStrategy r14 = r15.visibilityBridgeStrategy
                        r18 = r0
                        net.bytebuddy.dynamic.scaffold.ClassWriterStrategy r0 = r15.classWriterStrategy
                        r19 = r1
                        r1 = r15
                        r15 = r0
                        net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.ignoredMethods
                        r16 = r0
                        java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r1.auxiliaryTypes
                        r17 = r0
                        r0 = r18
                        r1 = r19
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.materialize(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                        return r0
                }
            }

            public static abstract class Delegator<U> extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase<U> {
                public Delegator() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> annotateType(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.annotateType(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> attribute(net.bytebuddy.implementation.attribute.TypeAttributeAppender r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.attribute(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> declaredTypes(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.declaredTypes(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase, net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> define(net.bytebuddy.description.type.RecordComponentDescription r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition$Optional r2 = r0.define(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<U> defineConstructor(int r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r2 = r0.defineConstructor(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<U> defineField(java.lang.String r2, net.bytebuddy.description.type.TypeDefinition r3, int r4) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r2 = r0.defineField(r2, r3, r4)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<U> defineMethod(java.lang.String r2, net.bytebuddy.description.type.TypeDefinition r3, int r4) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r2 = r0.defineMethod(r2, r3, r4)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> defineRecordComponent(java.lang.String r2, net.bytebuddy.description.type.TypeDefinition r3) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition$Optional r2 = r0.defineRecordComponent(r2, r3)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable<U> field(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Valuable r2 = r0.field(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase, net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> ignoreAlso(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.ignoreAlso(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> ignoreAlso(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.ignoreAlso(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<U> implement(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r2 = r0.implement(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> initializer(net.bytebuddy.implementation.LoadedTypeInitializer r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.initializer(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> initializer(net.bytebuddy.implementation.bytecode.ByteCodeAppender r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.initializer(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition.ForType<U> innerTypeOf(net.bytebuddy.description.type.TypeDescription r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$InnerTypeDefinition$ForType r2 = r0.innerTypeOf(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition<U> innerTypeOf(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$InnerTypeDefinition r2 = r0.innerTypeOf(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<U> invokable(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r0.invokable(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase, net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Unloaded<U> make() {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Unloaded r0 = r0.make()
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Unloaded<U> make(net.bytebuddy.dynamic.TypeResolutionStrategy r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Unloaded r2 = r0.make(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Unloaded<U> make(net.bytebuddy.dynamic.TypeResolutionStrategy r2, net.bytebuddy.pool.TypePool r3) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Unloaded r2 = r0.make(r2, r3)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase, net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Unloaded<U> make(net.bytebuddy.pool.TypePool r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Unloaded r2 = r0.make(r2)
                        return r2
                }

                public abstract net.bytebuddy.dynamic.DynamicType.Builder<U> materialize();

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> merge(java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForType> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.merge(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> modifiers(int r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.modifiers(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> name(java.lang.String r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.name(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> nestHost(net.bytebuddy.description.type.TypeDescription r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.nestHost(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> nestMembers(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.nestMembers(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> permittedSubclass(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.permittedSubclass(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase, net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition<U> recordComponent(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition r2 = r0.recordComponent(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition<U> recordComponent(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition r2 = r0.recordComponent(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> require(java.util.Collection<net.bytebuddy.dynamic.DynamicType> r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.require(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> suffix(java.lang.String r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.suffix(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.description.type.TypeDescription toTypeDescription() {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.description.type.TypeDescription r0 = r0.toTypeDescription()
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> topLevelType() {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.topLevelType()
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> transform(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r2, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.TypeVariableToken> r3) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.transform(r2, r3)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<U> typeVariable(java.lang.String r2, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r3) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder$TypeVariableDefinition r2 = r0.typeVariable(r2, r3)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> unsealed() {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r0.unsealed()
                        return r0
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Builder<U> visit(net.bytebuddy.asm.AsmVisitorWrapper r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.dynamic.DynamicType$Builder r2 = r0.visit(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r2, int r3, int r4) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.utility.visitor.ContextClassVisitor r2 = r0.wrap(r2, r3, r4)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.pool.TypePool r3, int r4, int r5) {
                        r1 = this;
                        net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.materialize()
                        net.bytebuddy.utility.visitor.ContextClassVisitor r2 = r0.wrap(r2, r3, r4, r5)
                        return r2
                }
            }

            public static abstract class UsingTypeWriter<U> extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase<U> {
                public UsingTypeWriter() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Unloaded<U> make(net.bytebuddy.dynamic.TypeResolutionStrategy r2) {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter r0 = r1.toTypeWriter()
                        net.bytebuddy.dynamic.TypeResolutionStrategy$Resolved r2 = r2.resolve()
                        net.bytebuddy.dynamic.DynamicType$Unloaded r2 = r0.make(r2)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.dynamic.DynamicType.Unloaded<U> make(net.bytebuddy.dynamic.TypeResolutionStrategy r1, net.bytebuddy.pool.TypePool r2) {
                        r0 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter r2 = r0.toTypeWriter(r2)
                        net.bytebuddy.dynamic.TypeResolutionStrategy$Resolved r1 = r1.resolve()
                        net.bytebuddy.dynamic.DynamicType$Unloaded r1 = r2.make(r1)
                        return r1
                }

                public abstract net.bytebuddy.dynamic.scaffold.TypeWriter<U> toTypeWriter();

                public abstract net.bytebuddy.dynamic.scaffold.TypeWriter<U> toTypeWriter(net.bytebuddy.pool.TypePool r1);

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r2, int r3, int r4) {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter r0 = r1.toTypeWriter()
                        net.bytebuddy.utility.visitor.ContextClassVisitor r2 = r0.wrap(r2, r3, r4)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder
                public net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.pool.TypePool r2, int r3, int r4) {
                        r0 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter r2 = r0.toTypeWriter(r2)
                        net.bytebuddy.utility.visitor.ContextClassVisitor r1 = r2.wrap(r1, r3, r4)
                        return r1
                }
            }

            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> annotateType(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                    r1 = this;
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.annotateType(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> annotateType(java.lang.annotation.Annotation... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.annotateType(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> annotateType(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.annotateType(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<S> constructor(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                    r1 = this;
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = r0.and(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r1.invokable(r2)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> declaredTypes(java.util.List<? extends java.lang.Class<?>> r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.declaredTypes(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> declaredTypes(java.lang.Class<?>... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.declaredTypes(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> declaredTypes(net.bytebuddy.description.type.TypeDescription... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.declaredTypes(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<S> define(java.lang.reflect.Field r2) {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r2 = r1.define(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<S> define(net.bytebuddy.description.field.FieldDescription r3) {
                    r2 = this;
                    java.lang.String r0 = r3.getName()
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
                    int r3 = r3.getModifiers()
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r3 = r2.defineField(r0, r1, r3)
                    return r3
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<S> define(java.lang.reflect.Constructor<?> r2) {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r1.define(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<S> define(java.lang.reflect.Method r2) {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r1.define(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<S> define(net.bytebuddy.description.method.MethodDescription r6) {
                    r5 = this;
                    boolean r0 = r6.isConstructor()
                    if (r0 == 0) goto Lf
                    int r0 = r6.getModifiers()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r0 = r5.defineConstructor(r0)
                    goto L1f
                Lf:
                    java.lang.String r0 = r6.getInternalName()
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r6.getReturnType()
                    int r2 = r6.getModifiers()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r0 = r5.defineMethod(r0, r1, r2)
                L1f:
                    net.bytebuddy.description.method.ParameterList r1 = r6.getParameters()
                    boolean r2 = r1.hasExplicitMetaData()
                    if (r2 == 0) goto L4a
                    java.util.Iterator r1 = r1.iterator()
                L2d:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L52
                    java.lang.Object r2 = r1.next()
                    net.bytebuddy.description.method.ParameterDescription r2 = (net.bytebuddy.description.method.ParameterDescription) r2
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r2.getType()
                    java.lang.String r4 = r2.getName()
                    int r2 = r2.getModifiers()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable r0 = r0.withParameter(r3, r4, r2)
                    goto L2d
                L4a:
                    net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r0.withParameters(r1)
                L52:
                    net.bytebuddy.description.type.TypeList$Generic r1 = r6.getExceptionTypes()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r0 = r0.throwing(r1)
                    net.bytebuddy.description.type.TypeList$Generic r6 = r6.getTypeVariables()
                    java.util.Iterator r6 = r6.iterator()
                L62:
                    boolean r1 = r6.hasNext()
                    if (r1 == 0) goto L7b
                    java.lang.Object r1 = r6.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = (net.bytebuddy.description.type.TypeDescription.Generic) r1
                    java.lang.String r2 = r1.getSymbol()
                    net.bytebuddy.description.type.TypeList$Generic r1 = r1.getUpperBounds()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r0 = r0.typeVariable(r2, r1)
                    goto L62
                L7b:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<S> define(net.bytebuddy.description.type.RecordComponentDescription r2) {
                    r1 = this;
                    java.lang.String r0 = r2.getActualName()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                    net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition$Optional r2 = r1.defineRecordComponent(r0, r2)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<S> defineConstructor(java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r1) {
                    r0 = this;
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver r1 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r1)
                    int r1 = r1.resolve()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r1 = r0.defineConstructor(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<S> defineConstructor(net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r1 = r0.defineConstructor(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<S> defineField(java.lang.String r1, java.lang.reflect.Type r2, int r3) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r1 = r0.defineField(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<S> defineField(java.lang.String r1, java.lang.reflect.Type r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForField> r3) {
                    r0 = this;
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver r3 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r3)
                    int r3 = r3.resolve()
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r1 = r0.defineField(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<S> defineField(java.lang.String r1, java.lang.reflect.Type r2, net.bytebuddy.description.modifier.ModifierContributor.ForField... r3) {
                    r0 = this;
                    java.util.List r3 = java.util.Arrays.asList(r3)
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r1 = r0.defineField(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<S> defineField(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForField> r3) {
                    r0 = this;
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver r3 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r3)
                    int r3 = r3.resolve()
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r1 = r0.defineField(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<S> defineField(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, net.bytebuddy.description.modifier.ModifierContributor.ForField... r3) {
                    r0 = this;
                    java.util.List r3 = java.util.Arrays.asList(r3)
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r1 = r0.defineField(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<S> defineMethod(java.lang.String r1, java.lang.reflect.Type r2, int r3) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r1 = r0.defineMethod(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<S> defineMethod(java.lang.String r1, java.lang.reflect.Type r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r3) {
                    r0 = this;
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver r3 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r3)
                    int r3 = r3.resolve()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r1 = r0.defineMethod(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<S> defineMethod(java.lang.String r1, java.lang.reflect.Type r2, net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r3) {
                    r0 = this;
                    java.util.List r3 = java.util.Arrays.asList(r3)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r1 = r0.defineMethod(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<S> defineMethod(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r3) {
                    r0 = this;
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver r3 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r3)
                    int r3 = r3.resolve()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r1 = r0.defineMethod(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<S> defineMethod(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r3) {
                    r0 = this;
                    java.util.List r3 = java.util.Arrays.asList(r3)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r1 = r0.defineMethod(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> defineProperty(java.lang.String r1, java.lang.reflect.Type r2) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r1 = r0.defineProperty(r1, r2)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> defineProperty(java.lang.String r1, java.lang.reflect.Type r2, boolean r3) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r1 = r0.defineProperty(r1, r2, r3)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> defineProperty(java.lang.String r2, net.bytebuddy.description.type.TypeDefinition r3) {
                    r1 = this;
                    r0 = 0
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r2 = r1.defineProperty(r2, r3, r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> defineProperty(java.lang.String r7, net.bytebuddy.description.type.TypeDefinition r8, boolean r9) {
                    r6 = this;
                    r0 = 0
                    r1 = 1
                    int r2 = r7.length()
                    if (r2 == 0) goto La5
                    java.lang.Class r2 = java.lang.Void.TYPE
                    boolean r3 = r8.represents(r2)
                    if (r3 != 0) goto L9d
                    if (r9 != 0) goto L4f
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    r9.<init>()
                    java.lang.String r3 = "set"
                    r9.append(r3)
                    char r3 = r7.charAt(r0)
                    char r3 = java.lang.Character.toUpperCase(r3)
                    r9.append(r3)
                    java.lang.String r3 = r7.substring(r1)
                    r9.append(r3)
                    java.lang.String r9 = r9.toString()
                    net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r3 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r1]
                    net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PUBLIC
                    r3[r0] = r4
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r9 = r6.defineMethod(r9, r2, r3)
                    net.bytebuddy.description.type.TypeDefinition[] r2 = new net.bytebuddy.description.type.TypeDefinition[r1]
                    r2[r0] = r8
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r9 = r9.withParameters(r2)
                    net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r2 = net.bytebuddy.implementation.FieldAccessor.ofField(r7)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r9 = r9.intercept(r2)
                    net.bytebuddy.description.modifier.FieldManifestation r2 = net.bytebuddy.description.modifier.FieldManifestation.PLAIN
                    goto L52
                L4f:
                    net.bytebuddy.description.modifier.FieldManifestation r2 = net.bytebuddy.description.modifier.FieldManifestation.FINAL
                    r9 = r6
                L52:
                    java.lang.StringBuilder r3 = new java.lang.StringBuilder
                    r3.<init>()
                    java.lang.Class r4 = java.lang.Boolean.TYPE
                    boolean r4 = r8.represents(r4)
                    if (r4 == 0) goto L62
                    java.lang.String r4 = "is"
                    goto L64
                L62:
                    java.lang.String r4 = "get"
                L64:
                    r3.append(r4)
                    char r4 = r7.charAt(r0)
                    char r4 = java.lang.Character.toUpperCase(r4)
                    r3.append(r4)
                    java.lang.String r4 = r7.substring(r1)
                    r3.append(r4)
                    java.lang.String r3 = r3.toString()
                    net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r4 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r1]
                    net.bytebuddy.description.modifier.Visibility r5 = net.bytebuddy.description.modifier.Visibility.PUBLIC
                    r4[r0] = r5
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r9 = r9.defineMethod(r3, r8, r4)
                    net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r3 = net.bytebuddy.implementation.FieldAccessor.ofField(r7)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r9 = r9.intercept(r3)
                    r3 = 2
                    net.bytebuddy.description.modifier.ModifierContributor$ForField[] r3 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r3]
                    net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PRIVATE
                    r3[r0] = r4
                    r3[r1] = r2
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r7 = r9.defineField(r7, r8, r3)
                    return r7
                L9d:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "A bean property cannot have a void type"
                    r7.<init>(r8)
                    throw r7
                La5:
                    java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                    java.lang.String r8 = "A bean property cannot have an empty name"
                    r7.<init>(r8)
                    throw r7
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<S> defineRecordComponent(java.lang.String r1, java.lang.reflect.Type r2) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition$Optional r1 = r0.defineRecordComponent(r1, r2)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable<S> field(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2) {
                    r1 = this;
                    net.bytebuddy.matcher.LatentMatcher$Resolved r0 = new net.bytebuddy.matcher.LatentMatcher$Resolved
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Valuable r2 = r1.field(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> ignoreAlso(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                    r1 = this;
                    net.bytebuddy.matcher.LatentMatcher$Resolved r0 = new net.bytebuddy.matcher.LatentMatcher$Resolved
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.ignoreAlso(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<S> implement(java.util.List<? extends java.lang.reflect.Type> r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r2 = r1.implement(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<S> implement(java.lang.reflect.Type... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r1 = r0.implement(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<S> implement(net.bytebuddy.description.type.TypeDefinition... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional r1 = r0.implement(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition.ForType<S> innerTypeOf(java.lang.Class<?> r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder$InnerTypeDefinition$ForType r1 = r0.innerTypeOf(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition<S> innerTypeOf(java.lang.reflect.Constructor<?> r2) {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$InnerTypeDefinition r2 = r1.innerTypeOf(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition<S> innerTypeOf(java.lang.reflect.Method r2) {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$InnerTypeDefinition r2 = r1.innerTypeOf(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<S> invokable(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                    r1 = this;
                    net.bytebuddy.matcher.LatentMatcher$Resolved r0 = new net.bytebuddy.matcher.LatentMatcher$Resolved
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r1.invokable(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Unloaded<S> make() {
                    r1 = this;
                    net.bytebuddy.dynamic.TypeResolutionStrategy$Passive r0 = net.bytebuddy.dynamic.TypeResolutionStrategy.Passive.INSTANCE
                    net.bytebuddy.dynamic.DynamicType$Unloaded r0 = r1.make(r0)
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Unloaded<S> make(net.bytebuddy.pool.TypePool r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.TypeResolutionStrategy$Passive r0 = net.bytebuddy.dynamic.TypeResolutionStrategy.Passive.INSTANCE
                    net.bytebuddy.dynamic.DynamicType$Unloaded r2 = r1.make(r0, r2)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> merge(net.bytebuddy.description.modifier.ModifierContributor.ForType... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.merge(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<S> method(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                    r1 = this;
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isMethod()
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = r0.and(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r2 = r1.invokable(r2)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> modifiers(java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForType> r1) {
                    r0 = this;
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver r1 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r1)
                    int r1 = r1.resolve()
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.modifiers(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> modifiers(net.bytebuddy.description.modifier.ModifierContributor.ForType... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.modifiers(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> nestHost(java.lang.Class<?> r1) {
                    r0 = this;
                    net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.nestHost(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> nestMembers(java.util.List<? extends java.lang.Class<?>> r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.nestMembers(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> nestMembers(java.lang.Class<?>... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.nestMembers(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> nestMembers(net.bytebuddy.description.type.TypeDescription... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.nestMembers(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> noNestMate() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.dynamic.TargetType.DESCRIPTION
                    net.bytebuddy.dynamic.DynamicType$Builder r0 = r1.nestHost(r0)
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> permittedSubclass(java.util.List<? extends java.lang.Class<?>> r2) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.permittedSubclass(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> permittedSubclass(java.lang.Class<?>... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.permittedSubclass(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> permittedSubclass(net.bytebuddy.description.type.TypeDescription... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.permittedSubclass(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition<S> recordComponent(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r2) {
                    r1 = this;
                    net.bytebuddy.matcher.LatentMatcher$Resolved r0 = new net.bytebuddy.matcher.LatentMatcher$Resolved
                    r0.<init>(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition r2 = r1.recordComponent(r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> require(net.bytebuddy.description.type.TypeDescription r2, byte[] r3) {
                    r1 = this;
                    net.bytebuddy.implementation.LoadedTypeInitializer$NoOp r0 = net.bytebuddy.implementation.LoadedTypeInitializer.NoOp.INSTANCE
                    net.bytebuddy.dynamic.DynamicType$Builder r2 = r1.require(r2, r3, r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> require(net.bytebuddy.description.type.TypeDescription r3, byte[] r4, net.bytebuddy.implementation.LoadedTypeInitializer r5) {
                    r2 = this;
                    net.bytebuddy.dynamic.DynamicType$Default r0 = new net.bytebuddy.dynamic.DynamicType$Default
                    java.util.List r1 = java.util.Collections.emptyList()
                    r0.<init>(r3, r4, r5, r1)
                    r3 = 1
                    net.bytebuddy.dynamic.DynamicType[] r3 = new net.bytebuddy.dynamic.DynamicType[r3]
                    r4 = 0
                    r3[r4] = r0
                    net.bytebuddy.dynamic.DynamicType$Builder r3 = r2.require(r3)
                    return r3
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> require(net.bytebuddy.dynamic.DynamicType... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Builder r1 = r0.require(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> serialVersionUid(long r5) {
                    r4 = this;
                    java.lang.Class r0 = java.lang.Long.TYPE
                    r1 = 3
                    net.bytebuddy.description.modifier.ModifierContributor$ForField[] r1 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r1]
                    net.bytebuddy.description.modifier.Visibility r2 = net.bytebuddy.description.modifier.Visibility.PRIVATE
                    r3 = 0
                    r1[r3] = r2
                    net.bytebuddy.description.modifier.FieldManifestation r2 = net.bytebuddy.description.modifier.FieldManifestation.FINAL
                    r3 = 1
                    r1[r3] = r2
                    net.bytebuddy.description.modifier.Ownership r2 = net.bytebuddy.description.modifier.Ownership.STATIC
                    r3 = 2
                    r1[r3] = r2
                    java.lang.String r2 = "serialVersionUID"
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r0 = r4.defineField(r2, r0, r1)
                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r5 = r0.value(r5)
                    return r5
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<S> typeVariable(java.lang.String r4) {
                    r3 = this;
                    java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                    r1 = 1
                    net.bytebuddy.description.type.TypeDefinition[] r1 = new net.bytebuddy.description.type.TypeDefinition[r1]
                    r2 = 0
                    r1[r2] = r0
                    net.bytebuddy.dynamic.DynamicType$Builder$TypeVariableDefinition r4 = r3.typeVariable(r4, r1)
                    return r4
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<S> typeVariable(java.lang.String r2, java.util.List<? extends java.lang.reflect.Type> r3) {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
                    r0.<init>(r3)
                    net.bytebuddy.dynamic.DynamicType$Builder$TypeVariableDefinition r2 = r1.typeVariable(r2, r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<S> typeVariable(java.lang.String r1, java.lang.reflect.Type... r2) {
                    r0 = this;
                    java.util.List r2 = java.util.Arrays.asList(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$TypeVariableDefinition r1 = r0.typeVariable(r1, r2)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<S> typeVariable(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition... r2) {
                    r0 = this;
                    java.util.List r2 = java.util.Arrays.asList(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$TypeVariableDefinition r1 = r0.typeVariable(r1, r2)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> withHashCodeEquals() {
                    r3 = this;
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isHashCode()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r0 = r3.method(r0)
                    net.bytebuddy.implementation.HashCodeMethod r1 = net.bytebuddy.implementation.HashCodeMethod.usingDefaultOffset()
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isSynthetic()
                    net.bytebuddy.implementation.HashCodeMethod r1 = r1.withIgnoredFields(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r1)
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isEquals()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r0 = r0.method(r1)
                    net.bytebuddy.implementation.EqualsMethod r1 = net.bytebuddy.implementation.EqualsMethod.isolated()
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isSynthetic()
                    net.bytebuddy.implementation.EqualsMethod r1 = r1.withIgnoredFields(r2)
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r1)
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.dynamic.DynamicType.Builder<S> withToString() {
                    r2 = this;
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isToString()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r0 = r2.method(r0)
                    net.bytebuddy.implementation.ToStringMethod r1 = net.bytebuddy.implementation.ToStringMethod.prefixedBySimpleClassName()
                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.intercept(r1)
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r2) {
                    r1 = this;
                    r0 = 0
                    net.bytebuddy.utility.visitor.ContextClassVisitor r2 = r1.wrap(r2, r0, r0)
                    return r2
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Builder
            public net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.pool.TypePool r3) {
                    r1 = this;
                    r0 = 0
                    net.bytebuddy.utility.visitor.ContextClassVisitor r2 = r1.wrap(r2, r3, r0, r0)
                    return r2
            }
        }

        public interface FieldDefinition<S> {

            public interface Optional<U> extends net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition<U>, net.bytebuddy.dynamic.DynamicType.Builder<U> {

                public static abstract class AbstractBase<U> extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator<U> implements net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> {
                    public AbstractBase() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> annotateField(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                            r0.<init>(r2)
                            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r2 = r1.annotateField(r0)
                            return r2
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> annotateField(java.lang.annotation.Annotation... r1) {
                            r0 = this;
                            java.util.List r1 = java.util.Arrays.asList(r1)
                            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r1 = r0.annotateField(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> annotateField(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                            r0 = this;
                            java.util.List r1 = java.util.Arrays.asList(r1)
                            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r1 = r0.annotateField(r1)
                            return r1
                    }
                }

                public interface Valuable<V> extends net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable<V>, net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<V> {

                    public static abstract class AbstractBase<U> extends net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.AbstractBase<U> implements net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<U> {

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static abstract class Adapter<V> extends net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase<V> {

                            @net.bytebuddy.utility.nullability.MaybeNull
                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            protected final java.lang.Object defaultValue;
                            protected final net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory fieldAttributeAppenderFactory;
                            protected final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> transformer;

                            public Adapter(net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r1, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.fieldAttributeAppenderFactory = r1
                                    r0.transformer = r2
                                    r0.defaultValue = r3
                                    return
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<V> attribute(net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r5) {
                                    r4 = this;
                                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory$Compound r0 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory$Compound
                                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r1 = r4.fieldAttributeAppenderFactory
                                    r2 = 2
                                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory[] r2 = new net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory[r2]
                                    r3 = 0
                                    r2[r3] = r1
                                    r1 = 1
                                    r2[r1] = r5
                                    r0.<init>(r2)
                                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r5 = r4.transformer
                                    java.lang.Object r1 = r4.defaultValue
                                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r5 = r4.materialize(r0, r5, r1)
                                    return r5
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase
                            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<V> defaultValue(java.lang.Object r3) {
                                    r2 = this;
                                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r0 = r2.fieldAttributeAppenderFactory
                                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r1 = r2.transformer
                                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r3 = r2.materialize(r0, r1, r3)
                                    return r3
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
                                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r2 = r4.fieldAttributeAppenderFactory
                                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable$AbstractBase$Adapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable.AbstractBase.Adapter) r5
                                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r3 = r5.fieldAttributeAppenderFactory
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L20
                                    return r1
                                L20:
                                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r2 = r4.transformer
                                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r3 = r5.transformer
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L2b
                                    return r1
                                L2b:
                                    java.lang.Object r2 = r4.defaultValue
                                    java.lang.Object r5 = r5.defaultValue
                                    if (r5 == 0) goto L3a
                                    if (r2 == 0) goto L3c
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L3d
                                    return r1
                                L3a:
                                    if (r2 == 0) goto L3d
                                L3c:
                                    return r1
                                L3d:
                                    return r0
                            }

                            public int hashCode() {
                                    r2 = this;
                                    java.lang.Class r0 = r2.getClass()
                                    int r0 = r0.hashCode()
                                    int r0 = r0 * 31
                                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r1 = r2.fieldAttributeAppenderFactory
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r1 = r2.transformer
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    java.lang.Object r1 = r2.defaultValue
                                    if (r1 == 0) goto L25
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                L25:
                                    return r0
                            }

                            public abstract net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<V> materialize(net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r1, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3);

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<V> transform(net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r6) {
                                    r5 = this;
                                    net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory r0 = r5.fieldAttributeAppenderFactory
                                    net.bytebuddy.dynamic.Transformer$Compound r1 = new net.bytebuddy.dynamic.Transformer$Compound
                                    net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r2 = r5.transformer
                                    r3 = 2
                                    net.bytebuddy.dynamic.Transformer[] r3 = new net.bytebuddy.dynamic.Transformer[r3]
                                    r4 = 0
                                    r3[r4] = r2
                                    r2 = 1
                                    r3[r2] = r6
                                    r1.<init>(r3)
                                    java.lang.Object r6 = r5.defaultValue
                                    net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r6 = r5.materialize(r0, r1, r6)
                                    return r6
                            }
                        }

                        public AbstractBase() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        public abstract net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> defaultValue(java.lang.Object r1);

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(double r1) {
                                r0 = this;
                                java.lang.Double r1 = java.lang.Double.valueOf(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r1 = r0.defaultValue(r1)
                                return r1
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(float r1) {
                                r0 = this;
                                java.lang.Float r1 = java.lang.Float.valueOf(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r1 = r0.defaultValue(r1)
                                return r1
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(int r1) {
                                r0 = this;
                                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r1 = r0.defaultValue(r1)
                                return r1
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(long r1) {
                                r0 = this;
                                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r1 = r0.defaultValue(r1)
                                return r1
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(java.lang.String r2) {
                                r1 = this;
                                if (r2 == 0) goto L7
                                net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r2 = r1.defaultValue(r2)
                                return r2
                            L7:
                                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                                java.lang.String r0 = "Cannot define 'null' as constant value"
                                r2.<init>(r0)
                                throw r2
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable
                        public net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(boolean r1) {
                                r0 = this;
                                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional r1 = r0.defaultValue(r1)
                                return r1
                        }
                    }
                }
            }

            public interface Valuable<U> extends net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition<U> {
                net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(double r1);

                net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(float r1);

                net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(int r1);

                net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(long r1);

                net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(java.lang.String r1);

                net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<U> value(boolean r1);
            }

            net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> annotateField(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

            net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> annotateField(java.util.List<? extends java.lang.annotation.Annotation> r1);

            net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> annotateField(java.lang.annotation.Annotation... r1);

            net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> annotateField(net.bytebuddy.description.annotation.AnnotationDescription... r1);

            net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> attribute(net.bytebuddy.implementation.attribute.FieldAttributeAppender.Factory r1);

            net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<S> transform(net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> r1);
        }

        public interface InnerTypeDefinition<S> extends net.bytebuddy.dynamic.DynamicType.Builder<S> {

            public interface ForType<U> extends net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition<U> {
                net.bytebuddy.dynamic.DynamicType.Builder<U> asMemberType();
            }

            net.bytebuddy.dynamic.DynamicType.Builder<S> asAnonymousType();
        }

        public interface MethodDefinition<S> extends net.bytebuddy.dynamic.DynamicType.Builder<S> {

            public static abstract class AbstractBase<U> extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator<U> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static abstract class Adapter<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition.AbstractBase<V> {
                    protected final net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler handler;
                    protected final net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory methodAttributeAppenderFactory;
                    protected final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> transformer;

                    public Adapter(net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r2, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r3) {
                            r0 = this;
                            r0.<init>()
                            r0.handler = r1
                            r0.methodAttributeAppenderFactory = r2
                            r0.transformer = r3
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<V> attribute(net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r6) {
                            r5 = this;
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r0 = r5.handler
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound r1 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r2 = r5.methodAttributeAppenderFactory
                            r3 = 2
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory[] r3 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory[r3]
                            r4 = 0
                            r3[r4] = r2
                            r2 = 1
                            r3[r2] = r6
                            r1.<init>(r3)
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r6 = r5.transformer
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition r6 = r5.materialize(r0, r1, r6)
                            return r6
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
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r2 = r4.handler
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$AbstractBase$Adapter r5 = (net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase.Adapter) r5
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r3 = r5.handler
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r2 = r4.methodAttributeAppenderFactory
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r3 = r5.methodAttributeAppenderFactory
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r2 = r4.transformer
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r5 = r5.transformer
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L36
                            return r1
                        L36:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r1 = r2.handler
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r1 = r2.methodAttributeAppenderFactory
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r1 = r2.transformer
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    public abstract net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<V> materialize(net.bytebuddy.dynamic.scaffold.MethodRegistry.Handler r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r2, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r3);

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<V> transform(net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r7) {
                            r6 = this;
                            net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler r0 = r6.handler
                            net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r1 = r6.methodAttributeAppenderFactory
                            net.bytebuddy.dynamic.Transformer$Compound r2 = new net.bytebuddy.dynamic.Transformer$Compound
                            net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r3 = r6.transformer
                            r4 = 2
                            net.bytebuddy.dynamic.Transformer[] r4 = new net.bytebuddy.dynamic.Transformer[r4]
                            r5 = 0
                            r4[r5] = r3
                            r3 = 1
                            r4[r3] = r7
                            r2.<init>(r4)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition r7 = r6.materialize(r0, r1, r2)
                            return r7
                    }
                }

                public AbstractBase() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> annotateMethod(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                        r0.<init>(r2)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition r2 = r1.annotateMethod(r0)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> annotateMethod(java.lang.annotation.Annotation... r1) {
                        r0 = this;
                        java.util.List r1 = java.util.Arrays.asList(r1)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition r1 = r0.annotateMethod(r1)
                        return r1
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> annotateMethod(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                        r0 = this;
                        java.util.List r1 = java.util.Arrays.asList(r1)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition r1 = r0.annotateMethod(r1)
                        return r1
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> annotateParameter(int r2, java.util.List<? extends java.lang.annotation.Annotation> r3) {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                        r0.<init>(r3)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition r2 = r1.annotateParameter(r2, r0)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> annotateParameter(int r1, java.lang.annotation.Annotation... r2) {
                        r0 = this;
                        java.util.List r2 = java.util.Arrays.asList(r2)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition r1 = r0.annotateParameter(r1, r2)
                        return r1
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition
                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> annotateParameter(int r1, net.bytebuddy.description.annotation.AnnotationDescription... r2) {
                        r0 = this;
                        java.util.List r2 = java.util.Arrays.asList(r2)
                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition r1 = r0.annotateParameter(r1, r2)
                        return r1
                }
            }

            public interface ExceptionDefinition<U> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition<U> {

                public static abstract class AbstractBase<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.AbstractBase<V> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<V> {
                    public AbstractBase() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<V> throwing(java.util.List<? extends java.lang.reflect.Type> r2) {
                            r1 = this;
                            net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
                            r0.<init>(r2)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r2 = r1.throwing(r0)
                            return r2
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<V> throwing(java.lang.reflect.Type... r1) {
                            r0 = this;
                            java.util.List r1 = java.util.Arrays.asList(r1)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r1 = r0.throwing(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<V> throwing(net.bytebuddy.description.type.TypeDefinition... r1) {
                            r0 = this;
                            java.util.List r1 = java.util.Arrays.asList(r1)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r1 = r0.throwing(r1)
                            return r1
                    }
                }

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<U> throwing(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r1);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<U> throwing(java.util.List<? extends java.lang.reflect.Type> r1);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<U> throwing(java.lang.reflect.Type... r1);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<U> throwing(net.bytebuddy.description.type.TypeDefinition... r1);
            }

            public interface ImplementationDefinition<U> {

                public static abstract class AbstractBase<V> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<V> {
                    public AbstractBase() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                    public <W> net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<V> defaultValue(W r1, java.lang.Class<? extends W> r2) {
                            r0 = this;
                            net.bytebuddy.description.annotation.AnnotationValue r1 = net.bytebuddy.description.annotation.AnnotationDescription.ForLoadedAnnotation.asValue(r1, r2)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r1 = r0.defaultValue(r1)
                            return r1
                    }
                }

                public interface Optional<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<V>, net.bytebuddy.dynamic.DynamicType.Builder<V> {
                }

                <W> net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> defaultValue(W r1, java.lang.Class<? extends W> r2);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> defaultValue(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r1);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> intercept(net.bytebuddy.implementation.Implementation r1);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<U> withoutCode();
            }

            public interface ParameterDefinition<U> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<U> {

                public static abstract class AbstractBase<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition.AbstractBase<V> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition<V> {
                    public AbstractBase() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<V> withParameter(java.lang.reflect.Type r1, java.lang.String r2, int r3) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable r1 = r0.withParameter(r1, r2, r3)
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<V> withParameter(java.lang.reflect.Type r1, java.lang.String r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForParameter> r3) {
                            r0 = this;
                            net.bytebuddy.description.modifier.ModifierContributor$Resolver r3 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r3)
                            int r3 = r3.resolve()
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable r1 = r0.withParameter(r1, r2, r3)
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<V> withParameter(java.lang.reflect.Type r1, java.lang.String r2, net.bytebuddy.description.modifier.ModifierContributor.ForParameter... r3) {
                            r0 = this;
                            java.util.List r3 = java.util.Arrays.asList(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable r1 = r0.withParameter(r1, r2, r3)
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<V> withParameter(net.bytebuddy.description.type.TypeDefinition r1, java.lang.String r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForParameter> r3) {
                            r0 = this;
                            net.bytebuddy.description.modifier.ModifierContributor$Resolver r3 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r3)
                            int r3 = r3.resolve()
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable r1 = r0.withParameter(r1, r2, r3)
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<V> withParameter(net.bytebuddy.description.type.TypeDefinition r1, java.lang.String r2, net.bytebuddy.description.modifier.ModifierContributor.ForParameter... r3) {
                            r0 = this;
                            java.util.List r3 = java.util.Arrays.asList(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable r1 = r0.withParameter(r1, r2, r3)
                            return r1
                    }
                }

                public interface Annotatable<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition<V> {

                    public static abstract class AbstractBase<W> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.AbstractBase<W> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<W> {

                        public static abstract class Adapter<X> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable.AbstractBase<X> {
                            public Adapter() {
                                    r0 = this;
                                    r0.<init>()
                                    return
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.AbstractBase, net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public <V> net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> defaultValue(V r2, java.lang.Class<? extends V> r3) {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.defaultValue(r2, r3)
                                    return r2
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> defaultValue(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2) {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.defaultValue(r2)
                                    return r2
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> intercept(net.bytebuddy.implementation.Implementation r2) {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.intercept(r2)
                                    return r2
                            }

                            public abstract net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition<X> materialize();

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<X> throwing(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r2) {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r2 = r0.throwing(r2)
                                    return r2
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<X> typeVariable(java.lang.String r2, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r3) {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r2 = r0.typeVariable(r2, r3)
                                    return r2
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<X> withParameter(net.bytebuddy.description.type.TypeDefinition r2, java.lang.String r3, int r4) {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable r2 = r0.withParameter(r2, r3, r4)
                                    return r2
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> withoutCode() {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.withoutCode()
                                    return r0
                            }
                        }

                        public AbstractBase() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<W> annotateParameter(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                                r1 = this;
                                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                                r0.<init>(r2)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable r2 = r1.annotateParameter(r0)
                                return r2
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<W> annotateParameter(java.lang.annotation.Annotation... r1) {
                                r0 = this;
                                java.util.List r1 = java.util.Arrays.asList(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable r1 = r0.annotateParameter(r1)
                                return r1
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<W> annotateParameter(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                                r0 = this;
                                java.util.List r1 = java.util.Arrays.asList(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable r1 = r0.annotateParameter(r1)
                                return r1
                        }
                    }

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<V> annotateParameter(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<V> annotateParameter(java.util.List<? extends java.lang.annotation.Annotation> r1);

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<V> annotateParameter(java.lang.annotation.Annotation... r1);

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<V> annotateParameter(net.bytebuddy.description.annotation.AnnotationDescription... r1);
                }

                public interface Initial<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition<V>, net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple<V> {

                    public static abstract class AbstractBase<W> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.AbstractBase<W> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<W> {
                        public AbstractBase() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<W> withParameter(java.lang.reflect.Type r1) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable r1 = r0.withParameter(r1)
                                return r1
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<W> withParameters(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r3) {
                                r2 = this;
                                java.util.Iterator r3 = r3.iterator()
                                r0 = r2
                            L5:
                                boolean r1 = r3.hasNext()
                                if (r1 == 0) goto L16
                                java.lang.Object r1 = r3.next()
                                net.bytebuddy.description.type.TypeDefinition r1 = (net.bytebuddy.description.type.TypeDefinition) r1
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable r0 = r0.withParameter(r1)
                                goto L5
                            L16:
                                return r0
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<W> withParameters(java.util.List<? extends java.lang.reflect.Type> r2) {
                                r1 = this;
                                net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
                                r0.<init>(r2)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r2 = r1.withParameters(r0)
                                return r2
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<W> withParameters(java.lang.reflect.Type... r1) {
                                r0 = this;
                                java.util.List r1 = java.util.Arrays.asList(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r1 = r0.withParameters(r1)
                                return r1
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<W> withParameters(net.bytebuddy.description.type.TypeDefinition... r1) {
                                r0 = this;
                                java.util.List r1 = java.util.Arrays.asList(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r1 = r0.withParameters(r1)
                                return r1
                        }
                    }

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<V> withParameters(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r1);

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<V> withParameters(java.util.List<? extends java.lang.reflect.Type> r1);

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<V> withParameters(java.lang.reflect.Type... r1);

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<V> withParameters(net.bytebuddy.description.type.TypeDefinition... r1);
                }

                public interface Simple<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<V> {

                    public static abstract class AbstractBase<W> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition.AbstractBase<W> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple<W> {
                        public AbstractBase() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<W> withParameter(java.lang.reflect.Type r1) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable r1 = r0.withParameter(r1)
                                return r1
                        }
                    }

                    public interface Annotatable<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple<V> {

                        public static abstract class AbstractBase<W> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.AbstractBase<W> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<W> {

                            public static abstract class Adapter<X> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable.AbstractBase<X> {
                                public Adapter() {
                                        r0 = this;
                                        r0.<init>()
                                        return
                                }

                                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.AbstractBase, net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                                public <V> net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> defaultValue(V r2, java.lang.Class<? extends V> r3) {
                                        r1 = this;
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple r0 = r1.materialize()
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.defaultValue(r2, r3)
                                        return r2
                                }

                                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> defaultValue(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2) {
                                        r1 = this;
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple r0 = r1.materialize()
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.defaultValue(r2)
                                        return r2
                                }

                                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> intercept(net.bytebuddy.implementation.Implementation r2) {
                                        r1 = this;
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple r0 = r1.materialize()
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.intercept(r2)
                                        return r2
                                }

                                public abstract net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple<X> materialize();

                                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition
                                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ExceptionDefinition<X> throwing(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r2) {
                                        r1 = this;
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple r0 = r1.materialize()
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r2 = r0.throwing(r2)
                                        return r2
                                }

                                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<X> typeVariable(java.lang.String r2, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r3) {
                                        r1 = this;
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple r0 = r1.materialize()
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r2 = r0.typeVariable(r2, r3)
                                        return r2
                                }

                                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple
                                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<X> withParameter(net.bytebuddy.description.type.TypeDefinition r2) {
                                        r1 = this;
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple r0 = r1.materialize()
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable r2 = r0.withParameter(r2)
                                        return r2
                                }

                                @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                                public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> withoutCode() {
                                        r1 = this;
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple r0 = r1.materialize()
                                        net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.withoutCode()
                                        return r0
                                }
                            }

                            public AbstractBase() {
                                    r0 = this;
                                    r0.<init>()
                                    return
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<W> annotateParameter(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                                    r1 = this;
                                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                                    r0.<init>(r2)
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable r2 = r1.annotateParameter(r0)
                                    return r2
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<W> annotateParameter(java.lang.annotation.Annotation... r1) {
                                    r0 = this;
                                    java.util.List r1 = java.util.Arrays.asList(r1)
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable r1 = r0.annotateParameter(r1)
                                    return r1
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<W> annotateParameter(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                                    r0 = this;
                                    java.util.List r1 = java.util.Arrays.asList(r1)
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable r1 = r0.annotateParameter(r1)
                                    return r1
                            }
                        }

                        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<V> annotateParameter(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

                        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<V> annotateParameter(java.util.List<? extends java.lang.annotation.Annotation> r1);

                        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<V> annotateParameter(java.lang.annotation.Annotation... r1);

                        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<V> annotateParameter(net.bytebuddy.description.annotation.AnnotationDescription... r1);
                    }

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<V> withParameter(java.lang.reflect.Type r1);

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Simple.Annotatable<V> withParameter(net.bytebuddy.description.type.TypeDefinition r1);
                }

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<U> withParameter(java.lang.reflect.Type r1, java.lang.String r2, int r3);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<U> withParameter(java.lang.reflect.Type r1, java.lang.String r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForParameter> r3);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<U> withParameter(java.lang.reflect.Type r1, java.lang.String r2, net.bytebuddy.description.modifier.ModifierContributor.ForParameter... r3);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<U> withParameter(net.bytebuddy.description.type.TypeDefinition r1, java.lang.String r2, int r3);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<U> withParameter(net.bytebuddy.description.type.TypeDefinition r1, java.lang.String r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForParameter> r3);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Annotatable<U> withParameter(net.bytebuddy.description.type.TypeDefinition r1, java.lang.String r2, net.bytebuddy.description.modifier.ModifierContributor.ForParameter... r3);
            }

            public interface ReceiverTypeDefinition<U> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> {

                public static abstract class AbstractBase<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.AbstractBase<V> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<V> {
                    public AbstractBase() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<V> receiverType(java.lang.reflect.AnnotatedElement r1) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describeAnnotated(r1)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition r1 = r0.receiverType(r1)
                            return r1
                    }
                }

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> receiverType(java.lang.reflect.AnnotatedElement r1);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<U> receiverType(net.bytebuddy.description.type.TypeDescription.Generic r1);
            }

            public interface TypeVariableDefinition<U> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<U> {

                public static abstract class AbstractBase<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.AbstractBase<V> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition<V> {
                    public AbstractBase() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<V> typeVariable(java.lang.String r2) {
                            r1 = this;
                            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                            java.util.List r0 = java.util.Collections.singletonList(r0)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r2 = r1.typeVariable(r2, r0)
                            return r2
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<V> typeVariable(java.lang.String r2, java.util.List<? extends java.lang.reflect.Type> r3) {
                            r1 = this;
                            net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
                            r0.<init>(r3)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r2 = r1.typeVariable(r2, r0)
                            return r2
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<V> typeVariable(java.lang.String r1, java.lang.reflect.Type... r2) {
                            r0 = this;
                            java.util.List r2 = java.util.Arrays.asList(r2)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r1 = r0.typeVariable(r1, r2)
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<V> typeVariable(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition... r2) {
                            r0 = this;
                            java.util.List r2 = java.util.Arrays.asList(r2)
                            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r1 = r0.typeVariable(r1, r2)
                            return r1
                    }
                }

                public interface Annotatable<V> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition<V> {

                    public static abstract class AbstractBase<W> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.AbstractBase<W> implements net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<W> {

                        public static abstract class Adapter<X> extends net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable.AbstractBase<X> {
                            public Adapter() {
                                    r0 = this;
                                    r0.<init>()
                                    return
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.AbstractBase, net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public <V> net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> defaultValue(V r2, java.lang.Class<? extends V> r3) {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.defaultValue(r2, r3)
                                    return r2
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> defaultValue(net.bytebuddy.description.annotation.AnnotationValue<?, ?> r2) {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.defaultValue(r2)
                                    return r2
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> intercept(net.bytebuddy.implementation.Implementation r2) {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r2 = r0.intercept(r2)
                                    return r2
                            }

                            public abstract net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition<X> materialize();

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<X> typeVariable(java.lang.String r2, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r3) {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r2 = r0.typeVariable(r2, r3)
                                    return r2
                            }

                            @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition
                            public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ReceiverTypeDefinition<X> withoutCode() {
                                    r1 = this;
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition r0 = r1.materialize()
                                    net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r0 = r0.withoutCode()
                                    return r0
                            }
                        }

                        public AbstractBase() {
                                r0 = this;
                                r0.<init>()
                                return
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<W> annotateTypeVariable(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                                r1 = this;
                                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                                r0.<init>(r2)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r2 = r1.annotateTypeVariable(r0)
                                return r2
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<W> annotateTypeVariable(java.lang.annotation.Annotation... r1) {
                                r0 = this;
                                java.util.List r1 = java.util.Arrays.asList(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r1 = r0.annotateTypeVariable(r1)
                                return r1
                        }

                        @Override // net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable
                        public net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<W> annotateTypeVariable(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                                r0 = this;
                                java.util.List r1 = java.util.Arrays.asList(r1)
                                net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable r1 = r0.annotateTypeVariable(r1)
                                return r1
                        }
                    }

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<V> annotateTypeVariable(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<V> annotateTypeVariable(java.util.List<? extends java.lang.annotation.Annotation> r1);

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<V> annotateTypeVariable(java.lang.annotation.Annotation... r1);

                    net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<V> annotateTypeVariable(net.bytebuddy.description.annotation.AnnotationDescription... r1);
                }

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<U> typeVariable(java.lang.String r1);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<U> typeVariable(java.lang.String r1, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r2);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<U> typeVariable(java.lang.String r1, java.util.List<? extends java.lang.reflect.Type> r2);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<U> typeVariable(java.lang.String r1, java.lang.reflect.Type... r2);

                net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.TypeVariableDefinition.Annotatable<U> typeVariable(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition... r2);
            }

            net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<S> annotateMethod(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

            net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<S> annotateMethod(java.util.List<? extends java.lang.annotation.Annotation> r1);

            net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<S> annotateMethod(java.lang.annotation.Annotation... r1);

            net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<S> annotateMethod(net.bytebuddy.description.annotation.AnnotationDescription... r1);

            net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<S> annotateParameter(int r1, java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2);

            net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<S> annotateParameter(int r1, java.util.List<? extends java.lang.annotation.Annotation> r2);

            net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<S> annotateParameter(int r1, java.lang.annotation.Annotation... r2);

            net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<S> annotateParameter(int r1, net.bytebuddy.description.annotation.AnnotationDescription... r2);

            net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<S> attribute(net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r1);

            net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition<S> transform(net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> r1);
        }

        public interface RecordComponentDefinition<S> {

            public interface Optional<U> extends net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition<U>, net.bytebuddy.dynamic.DynamicType.Builder<U> {

                public static abstract class AbstractBase<U> extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator<U> implements net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> {
                    public AbstractBase() {
                            r0 = this;
                            r0.<init>()
                            return
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> annotateRecordComponent(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                            r1 = this;
                            net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                            r0.<init>(r2)
                            net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition$Optional r2 = r1.annotateRecordComponent(r0)
                            return r2
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> annotateRecordComponent(java.lang.annotation.Annotation... r1) {
                            r0 = this;
                            java.util.List r1 = java.util.Arrays.asList(r1)
                            net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition$Optional r1 = r0.annotateRecordComponent(r1)
                            return r1
                    }

                    @Override // net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition
                    public net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<U> annotateRecordComponent(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                            r0 = this;
                            java.util.List r1 = java.util.Arrays.asList(r1)
                            net.bytebuddy.dynamic.DynamicType$Builder$RecordComponentDefinition$Optional r1 = r0.annotateRecordComponent(r1)
                            return r1
                    }
                }
            }

            net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<S> annotateRecordComponent(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

            net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<S> annotateRecordComponent(java.util.List<? extends java.lang.annotation.Annotation> r1);

            net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<S> annotateRecordComponent(java.lang.annotation.Annotation... r1);

            net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<S> annotateRecordComponent(net.bytebuddy.description.annotation.AnnotationDescription... r1);

            net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<S> attribute(net.bytebuddy.implementation.attribute.RecordComponentAttributeAppender.Factory r1);

            net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<S> transform(net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.RecordComponentDescription> r1);
        }

        public interface TypeVariableDefinition<S> extends net.bytebuddy.dynamic.DynamicType.Builder<S> {

            public static abstract class AbstractBase<U> extends net.bytebuddy.dynamic.DynamicType.Builder.AbstractBase.Delegator<U> implements net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<U> {
                public AbstractBase() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition
                public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<U> annotateTypeVariable(java.util.List<? extends java.lang.annotation.Annotation> r2) {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                        r0.<init>(r2)
                        net.bytebuddy.dynamic.DynamicType$Builder$TypeVariableDefinition r2 = r1.annotateTypeVariable(r0)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition
                public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<U> annotateTypeVariable(java.lang.annotation.Annotation... r1) {
                        r0 = this;
                        java.util.List r1 = java.util.Arrays.asList(r1)
                        net.bytebuddy.dynamic.DynamicType$Builder$TypeVariableDefinition r1 = r0.annotateTypeVariable(r1)
                        return r1
                }

                @Override // net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition
                public net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<U> annotateTypeVariable(net.bytebuddy.description.annotation.AnnotationDescription... r1) {
                        r0 = this;
                        java.util.List r1 = java.util.Arrays.asList(r1)
                        net.bytebuddy.dynamic.DynamicType$Builder$TypeVariableDefinition r1 = r0.annotateTypeVariable(r1)
                        return r1
                }
            }

            net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<S> annotateTypeVariable(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

            net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<S> annotateTypeVariable(java.util.List<? extends java.lang.annotation.Annotation> r1);

            net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<S> annotateTypeVariable(java.lang.annotation.Annotation... r1);

            net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<S> annotateTypeVariable(net.bytebuddy.description.annotation.AnnotationDescription... r1);
        }

        net.bytebuddy.dynamic.DynamicType.Builder<T> annotateType(java.util.Collection<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> annotateType(java.util.List<? extends java.lang.annotation.Annotation> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> annotateType(java.lang.annotation.Annotation... r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> annotateType(net.bytebuddy.description.annotation.AnnotationDescription... r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> attribute(net.bytebuddy.implementation.attribute.TypeAttributeAppender r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<T> constructor(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> declaredTypes(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> declaredTypes(java.util.List<? extends java.lang.Class<?>> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> declaredTypes(java.lang.Class<?>... r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> declaredTypes(net.bytebuddy.description.type.TypeDescription... r1);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<T> define(java.lang.reflect.Field r1);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<T> define(net.bytebuddy.description.field.FieldDescription r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<T> define(java.lang.reflect.Constructor<?> r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<T> define(java.lang.reflect.Method r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<T> define(net.bytebuddy.description.method.MethodDescription r1);

        net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<T> define(net.bytebuddy.description.type.RecordComponentDescription r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineConstructor(int r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineConstructor(java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineConstructor(net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r1);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<T> defineField(java.lang.String r1, java.lang.reflect.Type r2, int r3);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<T> defineField(java.lang.String r1, java.lang.reflect.Type r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForField> r3);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<T> defineField(java.lang.String r1, java.lang.reflect.Type r2, net.bytebuddy.description.modifier.ModifierContributor.ForField... r3);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<T> defineField(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, int r3);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<T> defineField(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForField> r3);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional.Valuable<T> defineField(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, net.bytebuddy.description.modifier.ModifierContributor.ForField... r3);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineMethod(java.lang.String r1, java.lang.reflect.Type r2, int r3);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineMethod(java.lang.String r1, java.lang.reflect.Type r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r3);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineMethod(java.lang.String r1, java.lang.reflect.Type r2, net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r3);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineMethod(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, int r3);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineMethod(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r3);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ParameterDefinition.Initial<T> defineMethod(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r3);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<T> defineProperty(java.lang.String r1, java.lang.reflect.Type r2);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<T> defineProperty(java.lang.String r1, java.lang.reflect.Type r2, boolean r3);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<T> defineProperty(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<T> defineProperty(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2, boolean r3);

        net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<T> defineRecordComponent(java.lang.String r1, java.lang.reflect.Type r2);

        net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition.Optional<T> defineRecordComponent(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition r2);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable<T> field(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Valuable<T> field(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.field.FieldDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> ignoreAlso(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> ignoreAlso(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<T> implement(java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<T> implement(java.util.List<? extends java.lang.reflect.Type> r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<T> implement(java.lang.reflect.Type... r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition.Optional<T> implement(net.bytebuddy.description.type.TypeDefinition... r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> initializer(net.bytebuddy.implementation.LoadedTypeInitializer r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> initializer(net.bytebuddy.implementation.bytecode.ByteCodeAppender r1);

        net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition.ForType<T> innerTypeOf(java.lang.Class<?> r1);

        net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition.ForType<T> innerTypeOf(net.bytebuddy.description.type.TypeDescription r1);

        net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition<T> innerTypeOf(java.lang.reflect.Constructor<?> r1);

        net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition<T> innerTypeOf(java.lang.reflect.Method r1);

        net.bytebuddy.dynamic.DynamicType.Builder.InnerTypeDefinition<T> innerTypeOf(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<T> invokable(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<T> invokable(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.method.MethodDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Unloaded<T> make();

        net.bytebuddy.dynamic.DynamicType.Unloaded<T> make(net.bytebuddy.dynamic.TypeResolutionStrategy r1);

        net.bytebuddy.dynamic.DynamicType.Unloaded<T> make(net.bytebuddy.dynamic.TypeResolutionStrategy r1, net.bytebuddy.pool.TypePool r2);

        net.bytebuddy.dynamic.DynamicType.Unloaded<T> make(net.bytebuddy.pool.TypePool r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> merge(java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForType> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> merge(net.bytebuddy.description.modifier.ModifierContributor.ForType... r1);

        net.bytebuddy.dynamic.DynamicType.Builder.MethodDefinition.ImplementationDefinition<T> method(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> modifiers(int r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> modifiers(java.util.Collection<? extends net.bytebuddy.description.modifier.ModifierContributor.ForType> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> modifiers(net.bytebuddy.description.modifier.ModifierContributor.ForType... r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> name(java.lang.String r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> nestHost(java.lang.Class<?> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> nestHost(net.bytebuddy.description.type.TypeDescription r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> nestMembers(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> nestMembers(java.util.List<? extends java.lang.Class<?>> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> nestMembers(java.lang.Class<?>... r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> nestMembers(net.bytebuddy.description.type.TypeDescription... r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> noNestMate();

        net.bytebuddy.dynamic.DynamicType.Builder<T> permittedSubclass(java.util.Collection<? extends net.bytebuddy.description.type.TypeDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> permittedSubclass(java.util.List<? extends java.lang.Class<?>> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> permittedSubclass(java.lang.Class<?>... r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> permittedSubclass(net.bytebuddy.description.type.TypeDescription... r1);

        net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition<T> recordComponent(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder.RecordComponentDefinition<T> recordComponent(net.bytebuddy.matcher.LatentMatcher<? super net.bytebuddy.description.type.RecordComponentDescription> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> require(java.util.Collection<net.bytebuddy.dynamic.DynamicType> r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> require(net.bytebuddy.description.type.TypeDescription r1, byte[] r2);

        net.bytebuddy.dynamic.DynamicType.Builder<T> require(net.bytebuddy.description.type.TypeDescription r1, byte[] r2, net.bytebuddy.implementation.LoadedTypeInitializer r3);

        net.bytebuddy.dynamic.DynamicType.Builder<T> require(net.bytebuddy.dynamic.DynamicType... r1);

        net.bytebuddy.dynamic.DynamicType.Builder.FieldDefinition.Optional<T> serialVersionUid(long r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> suffix(java.lang.String r1);

        net.bytebuddy.description.type.TypeDescription toTypeDescription();

        net.bytebuddy.dynamic.DynamicType.Builder<T> topLevelType();

        net.bytebuddy.dynamic.DynamicType.Builder<T> transform(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription.Generic> r1, net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.type.TypeVariableToken> r2);

        net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<T> typeVariable(java.lang.String r1);

        net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<T> typeVariable(java.lang.String r1, java.util.Collection<? extends net.bytebuddy.description.type.TypeDefinition> r2);

        net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<T> typeVariable(java.lang.String r1, java.util.List<? extends java.lang.reflect.Type> r2);

        net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<T> typeVariable(java.lang.String r1, java.lang.reflect.Type... r2);

        net.bytebuddy.dynamic.DynamicType.Builder.TypeVariableDefinition<T> typeVariable(java.lang.String r1, net.bytebuddy.description.type.TypeDefinition... r2);

        net.bytebuddy.dynamic.DynamicType.Builder<T> unsealed();

        net.bytebuddy.dynamic.DynamicType.Builder<T> visit(net.bytebuddy.asm.AsmVisitorWrapper r1);

        net.bytebuddy.dynamic.DynamicType.Builder<T> withHashCodeEquals();

        net.bytebuddy.dynamic.DynamicType.Builder<T> withToString();

        net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r1);

        net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r1, int r2, int r3);

        net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.pool.TypePool r2);

        net.bytebuddy.utility.visitor.ContextClassVisitor wrap(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.pool.TypePool r2, int r3, int r4);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Default implements net.bytebuddy.dynamic.DynamicType {
        private static final int BUFFER_SIZE = 1024;
        private static final java.lang.String CLASS_FILE_EXTENSION = ".class";
        private static final int END_OF_FILE = -1;
        private static final int FROM_BEGINNING = 0;
        private static final java.lang.String MANIFEST_VERSION = "1.0";
        private static final java.lang.String TEMP_SUFFIX = "tmp";
        protected final java.util.List<? extends net.bytebuddy.dynamic.DynamicType> auxiliaryTypes;
        protected final byte[] binaryRepresentation;
        protected final net.bytebuddy.implementation.LoadedTypeInitializer loadedTypeInitializer;
        protected final net.bytebuddy.description.type.TypeDescription typeDescription;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Loaded<T> extends net.bytebuddy.dynamic.DynamicType.Default implements net.bytebuddy.dynamic.DynamicType.Loaded<T> {
            private final java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> loadedTypes;

            public Loaded(net.bytebuddy.description.type.TypeDescription r1, byte[] r2, net.bytebuddy.implementation.LoadedTypeInitializer r3, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r4, java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> r5) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    r0.loadedTypes = r5
                    return
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Default
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
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> r2 = r4.loadedTypes
                    net.bytebuddy.dynamic.DynamicType$Default$Loaded r5 = (net.bytebuddy.dynamic.DynamicType.Default.Loaded) r5
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> r5 = r5.loadedTypes
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Loaded
            public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> getAllLoaded() {
                    r2 = this;
                    java.util.HashMap r0 = new java.util.HashMap
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> r1 = r2.loadedTypes
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Loaded
            public java.lang.Class<? extends T> getLoaded() {
                    r2 = this;
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> r0 = r2.loadedTypes
                    net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                    java.lang.Object r0 = r0.get(r1)
                    java.lang.Class r0 = (java.lang.Class) r0
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Loaded
            public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> getLoadedAuxiliaryTypes() {
                    r2 = this;
                    java.util.HashMap r0 = new java.util.HashMap
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> r1 = r2.loadedTypes
                    r0.<init>(r1)
                    net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                    r0.remove(r1)
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Default
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> r1 = r2.loadedTypes
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Unloaded<T> extends net.bytebuddy.dynamic.DynamicType.Default implements net.bytebuddy.dynamic.DynamicType.Unloaded<T> {
            private final net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved typeResolutionStrategy;

            public Unloaded(net.bytebuddy.description.type.TypeDescription r1, byte[] r2, net.bytebuddy.implementation.LoadedTypeInitializer r3, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r4, net.bytebuddy.dynamic.TypeResolutionStrategy.Resolved r5) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4)
                    r0.typeResolutionStrategy = r5
                    return
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Default
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
                    net.bytebuddy.dynamic.TypeResolutionStrategy$Resolved r2 = r4.typeResolutionStrategy
                    net.bytebuddy.dynamic.DynamicType$Default$Unloaded r5 = (net.bytebuddy.dynamic.DynamicType.Default.Unloaded) r5
                    net.bytebuddy.dynamic.TypeResolutionStrategy$Resolved r5 = r5.typeResolutionStrategy
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Default
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.TypeResolutionStrategy$Resolved r1 = r2.typeResolutionStrategy
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Unloaded
            public net.bytebuddy.dynamic.DynamicType.Unloaded<T> include(java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r8) {
                    r7 = this;
                    net.bytebuddy.dynamic.DynamicType$Default$Unloaded r6 = new net.bytebuddy.dynamic.DynamicType$Default$Unloaded
                    net.bytebuddy.description.type.TypeDescription r1 = r7.typeDescription
                    byte[] r2 = r7.binaryRepresentation
                    net.bytebuddy.implementation.LoadedTypeInitializer r3 = r7.loadedTypeInitializer
                    java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r7.auxiliaryTypes
                    java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r0, r8)
                    net.bytebuddy.dynamic.TypeResolutionStrategy$Resolved r5 = r7.typeResolutionStrategy
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r6
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Unloaded
            public net.bytebuddy.dynamic.DynamicType.Unloaded<T> include(net.bytebuddy.dynamic.DynamicType... r1) {
                    r0 = this;
                    java.util.List r1 = java.util.Arrays.asList(r1)
                    net.bytebuddy.dynamic.DynamicType$Unloaded r1 = r0.include(r1)
                    return r1
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Unloaded
            public net.bytebuddy.dynamic.DynamicType.Loaded<T> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3) {
                    r2 = this;
                    boolean r0 = r3 instanceof net.bytebuddy.dynamic.loading.InjectionClassLoader
                    if (r0 == 0) goto L14
                    r0 = r3
                    net.bytebuddy.dynamic.loading.InjectionClassLoader r0 = (net.bytebuddy.dynamic.loading.InjectionClassLoader) r0
                    boolean r1 = r0.isSealed()
                    if (r1 != 0) goto L14
                    net.bytebuddy.dynamic.loading.InjectionClassLoader$Strategy r3 = net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy.INSTANCE
                    net.bytebuddy.dynamic.DynamicType$Loaded r3 = r2.load(r0, r3)
                    return r3
                L14:
                    net.bytebuddy.dynamic.loading.ClassLoadingStrategy$Default r0 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.Default.WRAPPER
                    net.bytebuddy.dynamic.DynamicType$Loaded r3 = r2.load(r3, r0)
                    return r3
            }

            @Override // net.bytebuddy.dynamic.DynamicType.Unloaded
            public <S extends java.lang.ClassLoader> net.bytebuddy.dynamic.DynamicType.Loaded<T> load(@net.bytebuddy.utility.nullability.MaybeNull S r8, net.bytebuddy.dynamic.loading.ClassLoadingStrategy<? super S> r9) {
                    r7 = this;
                    net.bytebuddy.dynamic.DynamicType$Default$Loaded r6 = new net.bytebuddy.dynamic.DynamicType$Default$Loaded
                    net.bytebuddy.description.type.TypeDescription r1 = r7.typeDescription
                    byte[] r2 = r7.binaryRepresentation
                    net.bytebuddy.implementation.LoadedTypeInitializer r3 = r7.loadedTypeInitializer
                    java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r4 = r7.auxiliaryTypes
                    net.bytebuddy.dynamic.TypeResolutionStrategy$Resolved r0 = r7.typeResolutionStrategy
                    java.util.Map r5 = r0.initialize(r7, r8, r9)
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r6
            }
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP2"})
        public Default(net.bytebuddy.description.type.TypeDescription r1, byte[] r2, net.bytebuddy.implementation.LoadedTypeInitializer r3, java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r4) {
                r0 = this;
                r0.<init>()
                r0.typeDescription = r1
                r0.binaryRepresentation = r2
                r0.loadedTypeInitializer = r3
                r0.auxiliaryTypes = r4
                return
        }

        private java.io.File doInject(java.io.File r8, java.io.File r9) throws java.io.IOException {
                r7 = this;
                java.util.jar.JarInputStream r0 = new java.util.jar.JarInputStream
                java.io.FileInputStream r1 = new java.io.FileInputStream
                r1.<init>(r8)
                r0.<init>(r1)
                boolean r8 = r9.isFile()     // Catch: java.lang.Throwable -> L2e
                if (r8 != 0) goto L31
                boolean r8 = r9.createNewFile()     // Catch: java.lang.Throwable -> L2e
                if (r8 == 0) goto L17
                goto L31
            L17:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L2e
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
                r1.<init>()     // Catch: java.lang.Throwable -> L2e
                java.lang.String r2 = "Could not create file: "
                r1.append(r2)     // Catch: java.lang.Throwable -> L2e
                r1.append(r9)     // Catch: java.lang.Throwable -> L2e
                java.lang.String r9 = r1.toString()     // Catch: java.lang.Throwable -> L2e
                r8.<init>(r9)     // Catch: java.lang.Throwable -> L2e
                throw r8     // Catch: java.lang.Throwable -> L2e
            L2e:
                r8 = move-exception
                goto L11f
            L31:
                java.util.jar.Manifest r8 = r0.getManifest()     // Catch: java.lang.Throwable -> L2e
                if (r8 != 0) goto L42
                java.util.jar.JarOutputStream r8 = new java.util.jar.JarOutputStream     // Catch: java.lang.Throwable -> L2e
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2e
                r1.<init>(r9)     // Catch: java.lang.Throwable -> L2e
                r8.<init>(r1)     // Catch: java.lang.Throwable -> L2e
                goto L4d
            L42:
                java.util.jar.JarOutputStream r1 = new java.util.jar.JarOutputStream     // Catch: java.lang.Throwable -> L2e
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2e
                r2.<init>(r9)     // Catch: java.lang.Throwable -> L2e
                r1.<init>(r2, r8)     // Catch: java.lang.Throwable -> L2e
                r8 = r1
            L4d:
                java.util.Map r1 = r7.getAuxiliaryTypes()     // Catch: java.lang.Throwable -> L8d
                java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L8d
                r2.<init>()     // Catch: java.lang.Throwable -> L8d
                java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L8d
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8d
            L5e:
                boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L8d
                java.lang.String r4 = ".class"
                if (r3 == 0) goto L90
                java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L8d
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L8d
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
                r5.<init>()     // Catch: java.lang.Throwable -> L8d
                java.lang.Object r6 = r3.getKey()     // Catch: java.lang.Throwable -> L8d
                net.bytebuddy.description.type.TypeDescription r6 = (net.bytebuddy.description.type.TypeDescription) r6     // Catch: java.lang.Throwable -> L8d
                java.lang.String r6 = r6.getInternalName()     // Catch: java.lang.Throwable -> L8d
                r5.append(r6)     // Catch: java.lang.Throwable -> L8d
                r5.append(r4)     // Catch: java.lang.Throwable -> L8d
                java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L8d
                java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L8d
                r2.put(r4, r3)     // Catch: java.lang.Throwable -> L8d
                goto L5e
            L8d:
                r9 = move-exception
                goto L11b
            L90:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8d
                r1.<init>()     // Catch: java.lang.Throwable -> L8d
                net.bytebuddy.description.type.TypeDescription r3 = r7.typeDescription     // Catch: java.lang.Throwable -> L8d
                java.lang.String r3 = r3.getInternalName()     // Catch: java.lang.Throwable -> L8d
                r1.append(r3)     // Catch: java.lang.Throwable -> L8d
                r1.append(r4)     // Catch: java.lang.Throwable -> L8d
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L8d
                byte[] r3 = r7.binaryRepresentation     // Catch: java.lang.Throwable -> L8d
                r2.put(r1, r3)     // Catch: java.lang.Throwable -> L8d
            Laa:
                java.util.jar.JarEntry r1 = r0.getNextJarEntry()     // Catch: java.lang.Throwable -> L8d
                if (r1 == 0) goto Le5
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> L8d
                java.lang.Object r3 = r2.remove(r3)     // Catch: java.lang.Throwable -> L8d
                byte[] r3 = (byte[]) r3     // Catch: java.lang.Throwable -> L8d
                if (r3 != 0) goto Lcf
                r8.putNextEntry(r1)     // Catch: java.lang.Throwable -> L8d
                r1 = 1024(0x400, float:1.435E-42)
                byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L8d
            Lc3:
                int r3 = r0.read(r1)     // Catch: java.lang.Throwable -> L8d
                r4 = -1
                if (r3 == r4) goto Lde
                r4 = 0
                r8.write(r1, r4, r3)     // Catch: java.lang.Throwable -> L8d
                goto Lc3
            Lcf:
                java.util.jar.JarEntry r4 = new java.util.jar.JarEntry     // Catch: java.lang.Throwable -> L8d
                java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L8d
                r4.<init>(r1)     // Catch: java.lang.Throwable -> L8d
                r8.putNextEntry(r4)     // Catch: java.lang.Throwable -> L8d
                r8.write(r3)     // Catch: java.lang.Throwable -> L8d
            Lde:
                r0.closeEntry()     // Catch: java.lang.Throwable -> L8d
                r8.closeEntry()     // Catch: java.lang.Throwable -> L8d
                goto Laa
            Le5:
                java.util.Set r1 = r2.entrySet()     // Catch: java.lang.Throwable -> L8d
                java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8d
            Led:
                boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L8d
                if (r2 == 0) goto L114
                java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L8d
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L8d
                java.util.jar.JarEntry r3 = new java.util.jar.JarEntry     // Catch: java.lang.Throwable -> L8d
                java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L8d
                java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L8d
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L8d
                r8.putNextEntry(r3)     // Catch: java.lang.Throwable -> L8d
                java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L8d
                byte[] r2 = (byte[]) r2     // Catch: java.lang.Throwable -> L8d
                r8.write(r2)     // Catch: java.lang.Throwable -> L8d
                r8.closeEntry()     // Catch: java.lang.Throwable -> L8d
                goto Led
            L114:
                r8.close()     // Catch: java.lang.Throwable -> L2e
                r0.close()
                return r9
            L11b:
                r8.close()     // Catch: java.lang.Throwable -> L2e
                throw r9     // Catch: java.lang.Throwable -> L2e
            L11f:
                r0.close()
                throw r8
        }

        @Override // net.bytebuddy.dynamic.DynamicType, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r0 = this;
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
                net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                net.bytebuddy.dynamic.DynamicType$Default r5 = (net.bytebuddy.dynamic.DynamicType.Default) r5
                net.bytebuddy.description.type.TypeDescription r3 = r5.typeDescription
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                byte[] r2 = r4.binaryRepresentation
                byte[] r3 = r5.binaryRepresentation
                boolean r2 = java.util.Arrays.equals(r2, r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                net.bytebuddy.implementation.LoadedTypeInitializer r2 = r4.loadedTypeInitializer
                net.bytebuddy.implementation.LoadedTypeInitializer r3 = r5.loadedTypeInitializer
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r2 = r4.auxiliaryTypes
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r5 = r5.auxiliaryTypes
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L41
                return r1
            L41:
                return r0
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> getAllTypes() {
                r3 = this;
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                byte[] r2 = r3.binaryRepresentation
                r0.put(r1, r2)
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r1 = r3.auxiliaryTypes
                java.util.Iterator r1 = r1.iterator()
            L12:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L26
                java.lang.Object r2 = r1.next()
                net.bytebuddy.dynamic.DynamicType r2 = (net.bytebuddy.dynamic.DynamicType) r2
                java.util.Map r2 = r2.getAllTypes()
                r0.putAll(r2)
                goto L12
            L26:
                return r0
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> getAuxiliaryTypes() {
                r5 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r1 = r5.auxiliaryTypes
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2a
                java.lang.Object r2 = r1.next()
                net.bytebuddy.dynamic.DynamicType r2 = (net.bytebuddy.dynamic.DynamicType) r2
                net.bytebuddy.description.type.TypeDescription r3 = r2.getTypeDescription()
                byte[] r4 = r2.getBytes()
                r0.put(r3, r4)
                java.util.Map r2 = r2.getAuxiliaryTypes()
                r0.putAll(r2)
                goto Lb
            L2a:
                return r0
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The array is not modified by class contract.", value = {"EI_EXPOSE_REP"})
        public byte[] getBytes() {
                r1 = this;
                byte[] r0 = r1.binaryRepresentation
                return r0
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.implementation.LoadedTypeInitializer> getLoadedTypeInitializers() {
                r3 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r1 = r3.auxiliaryTypes
                java.util.Iterator r1 = r1.iterator()
            Lb:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1f
                java.lang.Object r2 = r1.next()
                net.bytebuddy.dynamic.DynamicType r2 = (net.bytebuddy.dynamic.DynamicType) r2
                java.util.Map r2 = r2.getLoadedTypeInitializers()
                r0.putAll(r2)
                goto Lb
            L1f:
                net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                net.bytebuddy.implementation.LoadedTypeInitializer r2 = r3.loadedTypeInitializer
                r0.put(r1, r2)
                return r0
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                return r0
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        public boolean hasAliveLoadedTypeInitializers() {
                r2 = this;
                java.util.Map r0 = r2.getLoadedTypeInitializers()
                java.util.Collection r0 = r0.values()
                java.util.Iterator r0 = r0.iterator()
            Lc:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L20
                java.lang.Object r1 = r0.next()
                net.bytebuddy.implementation.LoadedTypeInitializer r1 = (net.bytebuddy.implementation.LoadedTypeInitializer) r1
                boolean r1 = r1.isAlive()
                if (r1 == 0) goto Lc
                r0 = 1
                return r0
            L20:
                r0 = 0
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                byte[] r1 = r2.binaryRepresentation
                int r1 = java.util.Arrays.hashCode(r1)
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.LoadedTypeInitializer r1 = r2.loadedTypeInitializer
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r1 = r2.auxiliaryTypes
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        public java.io.File inject(java.io.File r4) throws java.io.IOException {
                r3 = this;
                net.bytebuddy.utility.FileSystem r0 = net.bytebuddy.utility.FileSystem.getInstance()
                java.lang.String r1 = r4.getName()
                java.lang.String r2 = "tmp"
                java.io.File r1 = java.io.File.createTempFile(r1, r2)
                java.io.File r1 = r3.doInject(r4, r1)
                r0.move(r1, r4)
                return r4
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        public java.io.File inject(java.io.File r2, java.io.File r3) throws java.io.IOException {
                r1 = this;
                boolean r0 = r2.equals(r3)
                if (r0 == 0) goto Lb
                java.io.File r2 = r1.inject(r2)
                goto Lf
            Lb:
                java.io.File r2 = r1.doInject(r2, r3)
            Lf:
                return r2
        }

        @Override // net.bytebuddy.dynamic.ClassFileLocator
        public net.bytebuddy.dynamic.ClassFileLocator.Resolution locate(java.lang.String r4) throws java.io.IOException {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r3.typeDescription
                java.lang.String r0 = r0.getName()
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L14
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit r4 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Explicit
                byte[] r0 = r3.binaryRepresentation
                r4.<init>(r0)
                return r4
            L14:
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r0 = r3.auxiliaryTypes
                java.util.Iterator r0 = r0.iterator()
            L1a:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L31
                java.lang.Object r1 = r0.next()
                net.bytebuddy.dynamic.DynamicType r1 = (net.bytebuddy.dynamic.DynamicType) r1
                net.bytebuddy.dynamic.ClassFileLocator$Resolution r1 = r1.locate(r4)
                boolean r2 = r1.isResolved()
                if (r2 == 0) goto L1a
                return r1
            L31:
                net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal r0 = new net.bytebuddy.dynamic.ClassFileLocator$Resolution$Illegal
                r0.<init>(r4)
                return r0
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        public java.util.Map<net.bytebuddy.description.type.TypeDescription, java.io.File> saveIn(java.io.File r7) throws java.io.IOException {
                r6 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.io.File r1 = new java.io.File
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                net.bytebuddy.description.type.TypeDescription r3 = r6.typeDescription
                java.lang.String r3 = r3.getName()
                r4 = 46
                char r5 = java.io.File.separatorChar
                java.lang.String r3 = r3.replace(r4, r5)
                r2.append(r3)
                java.lang.String r3 = ".class"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r7, r2)
                java.io.File r2 = r1.getParentFile()
                if (r2 == 0) goto L5f
                java.io.File r2 = r1.getParentFile()
                boolean r2 = r2.isDirectory()
                if (r2 != 0) goto L5f
                java.io.File r2 = r1.getParentFile()
                boolean r2 = r2.mkdirs()
                if (r2 == 0) goto L44
                goto L5f
            L44:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "Could not create directory: "
                r0.append(r2)
                java.io.File r1 = r1.getParentFile()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L5f:
                java.io.FileOutputStream r2 = new java.io.FileOutputStream
                r2.<init>(r1)
                byte[] r3 = r6.binaryRepresentation     // Catch: java.lang.Throwable -> L8c
                r2.write(r3)     // Catch: java.lang.Throwable -> L8c
                r2.close()
                net.bytebuddy.description.type.TypeDescription r2 = r6.typeDescription
                r0.put(r2, r1)
                java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r1 = r6.auxiliaryTypes
                java.util.Iterator r1 = r1.iterator()
            L77:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L8b
                java.lang.Object r2 = r1.next()
                net.bytebuddy.dynamic.DynamicType r2 = (net.bytebuddy.dynamic.DynamicType) r2
                java.util.Map r2 = r2.saveIn(r7)
                r0.putAll(r2)
                goto L77
            L8b:
                return r0
            L8c:
                r7 = move-exception
                r2.close()
                throw r7
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        public java.io.File toJar(java.io.File r5) throws java.io.IOException {
                r4 = this;
                java.util.jar.Manifest r0 = new java.util.jar.Manifest
                r0.<init>()
                java.util.jar.Attributes r1 = r0.getMainAttributes()
                java.util.jar.Attributes$Name r2 = java.util.jar.Attributes.Name.MANIFEST_VERSION
                java.lang.String r3 = "1.0"
                r1.put(r2, r3)
                java.io.File r5 = r4.toJar(r5, r0)
                return r5
        }

        @Override // net.bytebuddy.dynamic.DynamicType
        public java.io.File toJar(java.io.File r7, java.util.jar.Manifest r8) throws java.io.IOException {
                r6 = this;
                boolean r0 = r7.isFile()
                if (r0 != 0) goto L24
                boolean r0 = r7.createNewFile()
                if (r0 == 0) goto Ld
                goto L24
            Ld:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Could not create file: "
                r0.append(r1)
                r0.append(r7)
                java.lang.String r7 = r0.toString()
                r8.<init>(r7)
                throw r8
            L24:
                java.util.jar.JarOutputStream r0 = new java.util.jar.JarOutputStream
                java.io.FileOutputStream r1 = new java.io.FileOutputStream
                r1.<init>(r7)
                r0.<init>(r1, r8)
                java.util.Map r8 = r6.getAuxiliaryTypes()     // Catch: java.lang.Throwable -> L76
                java.util.Set r8 = r8.entrySet()     // Catch: java.lang.Throwable -> L76
                java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L76
            L3a:
                boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L76
                java.lang.String r2 = ".class"
                if (r1 == 0) goto L78
                java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L76
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L76
                java.util.jar.JarEntry r3 = new java.util.jar.JarEntry     // Catch: java.lang.Throwable -> L76
                java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
                r4.<init>()     // Catch: java.lang.Throwable -> L76
                java.lang.Object r5 = r1.getKey()     // Catch: java.lang.Throwable -> L76
                net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5     // Catch: java.lang.Throwable -> L76
                java.lang.String r5 = r5.getInternalName()     // Catch: java.lang.Throwable -> L76
                r4.append(r5)     // Catch: java.lang.Throwable -> L76
                r4.append(r2)     // Catch: java.lang.Throwable -> L76
                java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L76
                r3.<init>(r2)     // Catch: java.lang.Throwable -> L76
                r0.putNextEntry(r3)     // Catch: java.lang.Throwable -> L76
                java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L76
                byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L76
                r0.write(r1)     // Catch: java.lang.Throwable -> L76
                r0.closeEntry()     // Catch: java.lang.Throwable -> L76
                goto L3a
            L76:
                r7 = move-exception
                goto La1
            L78:
                java.util.jar.JarEntry r8 = new java.util.jar.JarEntry     // Catch: java.lang.Throwable -> L76
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L76
                r1.<init>()     // Catch: java.lang.Throwable -> L76
                net.bytebuddy.description.type.TypeDescription r3 = r6.typeDescription     // Catch: java.lang.Throwable -> L76
                java.lang.String r3 = r3.getInternalName()     // Catch: java.lang.Throwable -> L76
                r1.append(r3)     // Catch: java.lang.Throwable -> L76
                r1.append(r2)     // Catch: java.lang.Throwable -> L76
                java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L76
                r8.<init>(r1)     // Catch: java.lang.Throwable -> L76
                r0.putNextEntry(r8)     // Catch: java.lang.Throwable -> L76
                byte[] r8 = r6.binaryRepresentation     // Catch: java.lang.Throwable -> L76
                r0.write(r8)     // Catch: java.lang.Throwable -> L76
                r0.closeEntry()     // Catch: java.lang.Throwable -> L76
                r0.close()
                return r7
            La1:
                r0.close()
                throw r7
        }
    }

    public interface Loaded<T> extends net.bytebuddy.dynamic.DynamicType {
        java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> getAllLoaded();

        java.lang.Class<? extends T> getLoaded();

        java.util.Map<net.bytebuddy.description.type.TypeDescription, java.lang.Class<?>> getLoadedAuxiliaryTypes();
    }

    public interface Unloaded<T> extends net.bytebuddy.dynamic.DynamicType {
        net.bytebuddy.dynamic.DynamicType.Unloaded<T> include(java.util.List<? extends net.bytebuddy.dynamic.DynamicType> r1);

        net.bytebuddy.dynamic.DynamicType.Unloaded<T> include(net.bytebuddy.dynamic.DynamicType... r1);

        net.bytebuddy.dynamic.DynamicType.Loaded<T> load(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1);

        <S extends java.lang.ClassLoader> net.bytebuddy.dynamic.DynamicType.Loaded<T> load(@net.bytebuddy.utility.nullability.MaybeNull S r1, net.bytebuddy.dynamic.loading.ClassLoadingStrategy<? super S> r2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> getAllTypes();

    java.util.Map<net.bytebuddy.description.type.TypeDescription, byte[]> getAuxiliaryTypes();

    byte[] getBytes();

    java.util.Map<net.bytebuddy.description.type.TypeDescription, net.bytebuddy.implementation.LoadedTypeInitializer> getLoadedTypeInitializers();

    net.bytebuddy.description.type.TypeDescription getTypeDescription();

    boolean hasAliveLoadedTypeInitializers();

    java.io.File inject(java.io.File r1) throws java.io.IOException;

    java.io.File inject(java.io.File r1, java.io.File r2) throws java.io.IOException;

    java.util.Map<net.bytebuddy.description.type.TypeDescription, java.io.File> saveIn(java.io.File r1) throws java.io.IOException;

    java.io.File toJar(java.io.File r1) throws java.io.IOException;

    java.io.File toJar(java.io.File r1, java.util.jar.Manifest r2) throws java.io.IOException;
}
