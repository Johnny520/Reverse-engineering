package net.bytebuddy.dynamic;

/* JADX INFO: loaded from: classes2.dex */
public interface Transformer<T> {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound<S> implements net.bytebuddy.dynamic.Transformer<S> {
        private final java.util.List<net.bytebuddy.dynamic.Transformer<S>> transformers;

        public Compound(java.util.List<? extends net.bytebuddy.dynamic.Transformer<S>> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.transformers = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r3.next()
                net.bytebuddy.dynamic.Transformer r0 = (net.bytebuddy.dynamic.Transformer) r0
                boolean r1 = r0 instanceof net.bytebuddy.dynamic.Transformer.Compound
                if (r1 == 0) goto L28
                java.util.List<net.bytebuddy.dynamic.Transformer<S>> r1 = r2.transformers
                net.bytebuddy.dynamic.Transformer$Compound r0 = (net.bytebuddy.dynamic.Transformer.Compound) r0
                java.util.List<net.bytebuddy.dynamic.Transformer<S>> r0 = r0.transformers
                r1.addAll(r0)
                goto Le
            L28:
                boolean r1 = r0 instanceof net.bytebuddy.dynamic.Transformer.NoOp
                if (r1 != 0) goto Le
                java.util.List<net.bytebuddy.dynamic.Transformer<S>> r1 = r2.transformers
                r1.add(r0)
                goto Le
            L32:
                return
        }

        public Compound(net.bytebuddy.dynamic.Transformer<S>... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
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
                java.util.List<net.bytebuddy.dynamic.Transformer<S>> r2 = r4.transformers
                net.bytebuddy.dynamic.Transformer$Compound r5 = (net.bytebuddy.dynamic.Transformer.Compound) r5
                java.util.List<net.bytebuddy.dynamic.Transformer<S>> r5 = r5.transformers
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
                java.util.List<net.bytebuddy.dynamic.Transformer<S>> r1 = r2.transformers
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.Transformer
        public S transform(net.bytebuddy.description.type.TypeDescription r3, S r4) {
                r2 = this;
                java.util.List<net.bytebuddy.dynamic.Transformer<S>> r0 = r2.transformers
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L17
                java.lang.Object r1 = r0.next()
                net.bytebuddy.dynamic.Transformer r1 = (net.bytebuddy.dynamic.Transformer) r1
                java.lang.Object r4 = r1.transform(r3, r4)
                goto L6
            L17:
                return r4
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForField implements net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> {
        private final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription.Token> transformer;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class FieldModifierTransformer implements net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription.Token> {
            private final net.bytebuddy.description.modifier.ModifierContributor.Resolver<net.bytebuddy.description.modifier.ModifierContributor.ForField> resolver;

            public FieldModifierTransformer(net.bytebuddy.description.modifier.ModifierContributor.Resolver<net.bytebuddy.description.modifier.ModifierContributor.ForField> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.resolver = r1
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
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver<net.bytebuddy.description.modifier.ModifierContributor$ForField> r2 = r4.resolver
                    net.bytebuddy.dynamic.Transformer$ForField$FieldModifierTransformer r5 = (net.bytebuddy.dynamic.Transformer.ForField.FieldModifierTransformer) r5
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver<net.bytebuddy.description.modifier.ModifierContributor$ForField> r5 = r5.resolver
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
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver<net.bytebuddy.description.modifier.ModifierContributor$ForField> r1 = r2.resolver
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.Transformer
            public /* bridge */ /* synthetic */ net.bytebuddy.description.field.FieldDescription.Token transform(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.field.FieldDescription.Token r2) {
                    r0 = this;
                    net.bytebuddy.description.field.FieldDescription$Token r2 = (net.bytebuddy.description.field.FieldDescription.Token) r2
                    net.bytebuddy.description.field.FieldDescription$Token r1 = r0.transform2(r1, r2)
                    return r1
            }

            /* JADX INFO: renamed from: transform, reason: avoid collision after fix types in other method */
            public net.bytebuddy.description.field.FieldDescription.Token transform2(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.field.FieldDescription.Token r5) {
                    r3 = this;
                    net.bytebuddy.description.field.FieldDescription$Token r4 = new net.bytebuddy.description.field.FieldDescription$Token
                    java.lang.String r0 = r5.getName()
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver<net.bytebuddy.description.modifier.ModifierContributor$ForField> r1 = r3.resolver
                    int r2 = r5.getModifiers()
                    int r1 = r1.resolve(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r5.getType()
                    net.bytebuddy.description.annotation.AnnotationList r5 = r5.getAnnotations()
                    r4.<init>(r0, r1, r2, r5)
                    return r4
            }
        }

        public static class TransformedField extends net.bytebuddy.description.field.FieldDescription.AbstractBase {
            private final net.bytebuddy.description.type.TypeDefinition declaringType;
            private final net.bytebuddy.description.field.FieldDescription.InDefinedShape fieldDescription;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final net.bytebuddy.description.field.FieldDescription.Token token;

            public TransformedField(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDefinition r2, net.bytebuddy.description.field.FieldDescription.Token r3, net.bytebuddy.description.field.FieldDescription.InDefinedShape r4) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    r0.declaringType = r2
                    r0.token = r3
                    r0.fieldDescription = r4
                    return
            }

            @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
            public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.TypeDependant asDefined() {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = r1.asDefined()
                    return r0
            }

            @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
            public net.bytebuddy.description.field.FieldDescription.InDefinedShape asDefined() {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = r1.fieldDescription
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription$Token r0 = r1.token
                    net.bytebuddy.description.annotation.AnnotationList r0 = r0.getAnnotations()
                    return r0
            }

            @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
            @javax.annotation.Nonnull
            public net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition r0 = r1.declaringType
                    return r0
            }

            @Override // net.bytebuddy.description.ModifierReviewable
            public int getModifiers() {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription$Token r0 = r1.token
                    int r0 = r0.getModifiers()
                    return r0
            }

            @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
            public java.lang.String getName() {
                    r1 = this;
                    net.bytebuddy.description.field.FieldDescription$Token r0 = r1.token
                    java.lang.String r0 = r0.getName()
                    return r0
            }

            @Override // net.bytebuddy.description.field.FieldDescription
            public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                    r2 = this;
                    net.bytebuddy.description.field.FieldDescription$Token r0 = r2.token
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r1)
                    java.lang.Object r0 = r0.accept(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    return r0
            }
        }

        public ForField(net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription.Token> r1) {
                r0 = this;
                r0.<init>()
                r0.transformer = r1
                return
        }

        public static net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> withModifiers(java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForField> r2) {
                net.bytebuddy.dynamic.Transformer$ForField r0 = new net.bytebuddy.dynamic.Transformer$ForField
                net.bytebuddy.dynamic.Transformer$ForField$FieldModifierTransformer r1 = new net.bytebuddy.dynamic.Transformer$ForField$FieldModifierTransformer
                net.bytebuddy.description.modifier.ModifierContributor$Resolver r2 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r2)
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription> withModifiers(net.bytebuddy.description.modifier.ModifierContributor.ForField... r0) {
                java.util.List r0 = java.util.Arrays.asList(r0)
                net.bytebuddy.dynamic.Transformer r0 = withModifiers(r0)
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
                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription$Token> r2 = r4.transformer
                net.bytebuddy.dynamic.Transformer$ForField r5 = (net.bytebuddy.dynamic.Transformer.ForField) r5
                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription$Token> r5 = r5.transformer
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
                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription$Token> r1 = r2.transformer
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.Transformer
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public /* bridge */ /* synthetic */ net.bytebuddy.description.field.FieldDescription transform(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.field.FieldDescription r2) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.description.field.FieldDescription r1 = r0.transform2(r1, r2)
                return r1
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        /* JADX INFO: renamed from: transform, reason: avoid collision after fix types in other method */
        public net.bytebuddy.description.field.FieldDescription transform2(net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.field.FieldDescription r6) {
                r4 = this;
                net.bytebuddy.dynamic.Transformer$ForField$TransformedField r0 = new net.bytebuddy.dynamic.Transformer$ForField$TransformedField
                net.bytebuddy.description.type.TypeDefinition r1 = r6.getDeclaringType()
                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.field.FieldDescription$Token> r2 = r4.transformer
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.none()
                net.bytebuddy.description.ByteCodeElement$Token r3 = r6.asToken(r3)
                java.lang.Object r2 = r2.transform(r5, r3)
                net.bytebuddy.description.field.FieldDescription$Token r2 = (net.bytebuddy.description.field.FieldDescription.Token) r2
                net.bytebuddy.description.ByteCodeElement$TypeDependant r6 = r6.asDefined()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r6 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r6
                r0.<init>(r5, r1, r2, r6)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForMethod implements net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> {
        private final net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription.Token> transformer;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class MethodModifierTransformer implements net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription.Token> {
            private final net.bytebuddy.description.modifier.ModifierContributor.Resolver<net.bytebuddy.description.modifier.ModifierContributor.ForMethod> resolver;

            public MethodModifierTransformer(net.bytebuddy.description.modifier.ModifierContributor.Resolver<net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.resolver = r1
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
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver<net.bytebuddy.description.modifier.ModifierContributor$ForMethod> r2 = r4.resolver
                    net.bytebuddy.dynamic.Transformer$ForMethod$MethodModifierTransformer r5 = (net.bytebuddy.dynamic.Transformer.ForMethod.MethodModifierTransformer) r5
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver<net.bytebuddy.description.modifier.ModifierContributor$ForMethod> r5 = r5.resolver
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
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver<net.bytebuddy.description.modifier.ModifierContributor$ForMethod> r1 = r2.resolver
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.Transformer
            public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription.Token transform(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription.Token r2) {
                    r0 = this;
                    net.bytebuddy.description.method.MethodDescription$Token r2 = (net.bytebuddy.description.method.MethodDescription.Token) r2
                    net.bytebuddy.description.method.MethodDescription$Token r1 = r0.transform2(r1, r2)
                    return r1
            }

            /* JADX INFO: renamed from: transform, reason: avoid collision after fix types in other method */
            public net.bytebuddy.description.method.MethodDescription.Token transform2(net.bytebuddy.description.type.TypeDescription r11, net.bytebuddy.description.method.MethodDescription.Token r12) {
                    r10 = this;
                    net.bytebuddy.description.method.MethodDescription$Token r11 = new net.bytebuddy.description.method.MethodDescription$Token
                    java.lang.String r1 = r12.getName()
                    net.bytebuddy.description.modifier.ModifierContributor$Resolver<net.bytebuddy.description.modifier.ModifierContributor$ForMethod> r0 = r10.resolver
                    int r2 = r12.getModifiers()
                    int r2 = r0.resolve(r2)
                    net.bytebuddy.description.ByteCodeElement$Token$TokenList r3 = r12.getTypeVariableTokens()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r12.getReturnType()
                    net.bytebuddy.description.ByteCodeElement$Token$TokenList r5 = r12.getParameterTokens()
                    net.bytebuddy.description.type.TypeList$Generic r6 = r12.getExceptionTypes()
                    net.bytebuddy.description.annotation.AnnotationList r7 = r12.getAnnotations()
                    net.bytebuddy.description.annotation.AnnotationValue r8 = r12.getDefaultValue()
                    net.bytebuddy.description.type.TypeDescription$Generic r9 = r12.getReceiverType()
                    r0 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    return r11
            }
        }

        public static class TransformedMethod extends net.bytebuddy.description.method.MethodDescription.AbstractBase {
            private final net.bytebuddy.description.type.TypeDefinition declaringType;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
            private final net.bytebuddy.description.method.MethodDescription.Token token;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class AttachmentVisitor extends net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.WithoutTypeSubstitution {
                final /* synthetic */ net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod this$0;

                public AttachmentVisitor(net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod r1) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
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
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r2 = r4.this$0
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor r5 = (net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod.AttachmentVisitor) r5
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r5 = r5.this$0
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
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r1 = r2.this$0
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.onTypeVariable2(r1)
                        return r1
                }

                @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
                /* JADX INFO: renamed from: onTypeVariable, reason: avoid collision after fix types in other method */
                public net.bytebuddy.description.type.TypeDescription.Generic onTypeVariable2(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                        r3 = this;
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r0 = r3.this$0
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.getTypeVariables()
                        java.lang.String r1 = r4.getSymbol()
                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                        net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                        net.bytebuddy.description.type.TypeList$Generic r0 = (net.bytebuddy.description.type.TypeList.Generic) r0
                        net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$WithAnnotationOverlay r1 = new net.bytebuddy.description.type.TypeDescription$Generic$OfTypeVariable$WithAnnotationOverlay
                        boolean r2 = r0.isEmpty()
                        if (r2 == 0) goto L2b
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r0 = r3.this$0
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod.access$200(r0)
                        java.lang.String r2 = r4.getSymbol()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.findExpectedVariable(r2)
                        goto L31
                    L2b:
                        java.lang.Object r0 = r0.getOnly()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    L31:
                        r1.<init>(r0, r4)
                        return r1
                }
            }

            public class TransformedParameter extends net.bytebuddy.description.method.ParameterDescription.AbstractBase {
                private final int index;
                private final net.bytebuddy.description.method.ParameterDescription.Token parameterToken;
                final /* synthetic */ net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod this$0;

                public TransformedParameter(net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod r1, int r2, net.bytebuddy.description.method.ParameterDescription.Token r3) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        r0.index = r2
                        r0.parameterToken = r3
                        return
                }

                @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
                public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.TypeDependant asDefined() {
                        r1 = this;
                        net.bytebuddy.description.method.ParameterDescription$InDefinedShape r0 = r1.asDefined()
                        return r0
                }

                @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
                public net.bytebuddy.description.method.ParameterDescription.InDefinedShape asDefined() {
                        r2 = this;
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r0 = r2.this$0
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod.access$100(r0)
                        net.bytebuddy.description.method.ParameterList r0 = r0.getParameters()
                        int r1 = r2.index
                        java.lang.Object r0 = r0.get(r1)
                        net.bytebuddy.description.method.ParameterDescription$InDefinedShape r0 = (net.bytebuddy.description.method.ParameterDescription.InDefinedShape) r0
                        return r0
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.method.ParameterDescription$Token r0 = r1.parameterToken
                        net.bytebuddy.description.annotation.AnnotationList r0 = r0.getAnnotations()
                        return r0
                }

                @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
                public net.bytebuddy.description.method.MethodDescription getDeclaringMethod() {
                        r1 = this;
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r0 = r1.this$0
                        return r0
                }

                @Override // net.bytebuddy.description.method.ParameterDescription
                public int getIndex() {
                        r1 = this;
                        int r0 = r1.index
                        return r0
                }

                @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                        r1 = this;
                        net.bytebuddy.description.method.ParameterDescription$Token r0 = r1.parameterToken
                        java.lang.Integer r0 = r0.getModifiers()
                        if (r0 != 0) goto Ld
                        int r0 = super.getModifiers()
                        goto L11
                    Ld:
                        int r0 = r0.intValue()
                    L11:
                        return r0
                }

                @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithRuntimeName
                public java.lang.String getName() {
                        r1 = this;
                        net.bytebuddy.description.method.ParameterDescription$Token r0 = r1.parameterToken
                        java.lang.String r0 = r0.getName()
                        if (r0 != 0) goto Lc
                        java.lang.String r0 = super.getName()
                    Lc:
                        return r0
                }

                @Override // net.bytebuddy.description.method.ParameterDescription
                public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                        r3 = this;
                        net.bytebuddy.description.method.ParameterDescription$Token r0 = r3.parameterToken
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor r1 = new net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r2 = r3.this$0
                        r1.<init>(r2)
                        java.lang.Object r0 = r0.accept(r1)
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                        return r0
                }

                @Override // net.bytebuddy.description.method.ParameterDescription
                public boolean hasModifiers() {
                        r1 = this;
                        net.bytebuddy.description.method.ParameterDescription$Token r0 = r1.parameterToken
                        java.lang.Integer r0 = r0.getModifiers()
                        if (r0 == 0) goto La
                        r0 = 1
                        goto Lb
                    La:
                        r0 = 0
                    Lb:
                        return r0
                }

                @Override // net.bytebuddy.description.NamedElement.WithOptionalName
                public boolean isNamed() {
                        r1 = this;
                        net.bytebuddy.description.method.ParameterDescription$Token r0 = r1.parameterToken
                        java.lang.String r0 = r0.getName()
                        if (r0 == 0) goto La
                        r0 = 1
                        goto Lb
                    La:
                        r0 = 0
                    Lb:
                        return r0
                }
            }

            public class TransformedParameterList extends net.bytebuddy.description.method.ParameterList.AbstractBase<net.bytebuddy.description.method.ParameterDescription> {
                final /* synthetic */ net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod this$0;

                public TransformedParameterList(net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod r1) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        return
                }

                @Override // java.util.AbstractList, java.util.List
                public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                        r0 = this;
                        net.bytebuddy.description.method.ParameterDescription r1 = r0.get(r1)
                        return r1
                }

                @Override // java.util.AbstractList, java.util.List
                public net.bytebuddy.description.method.ParameterDescription get(int r4) {
                        r3 = this;
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$TransformedParameter r0 = new net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$TransformedParameter
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r1 = r3.this$0
                        net.bytebuddy.description.method.MethodDescription$Token r2 = net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod.access$000(r1)
                        net.bytebuddy.description.ByteCodeElement$Token$TokenList r2 = r2.getParameterTokens()
                        net.bytebuddy.description.ByteCodeElement$Token r2 = r2.get(r4)
                        net.bytebuddy.description.method.ParameterDescription$Token r2 = (net.bytebuddy.description.method.ParameterDescription.Token) r2
                        r0.<init>(r1, r4, r2)
                        return r0
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                        r1 = this;
                        net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r0 = r1.this$0
                        net.bytebuddy.description.method.MethodDescription$Token r0 = net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod.access$000(r0)
                        net.bytebuddy.description.ByteCodeElement$Token$TokenList r0 = r0.getParameterTokens()
                        int r0 = r0.size()
                        return r0
                }
            }

            public TransformedMethod(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDefinition r2, net.bytebuddy.description.method.MethodDescription.Token r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    r0.declaringType = r2
                    r0.token = r3
                    r0.methodDescription = r4
                    return
            }

            public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.Token access$000(net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod r0) {
                    net.bytebuddy.description.method.MethodDescription$Token r0 = r0.token
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$100(net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod r0) {
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r0.methodDescription
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.description.type.TypeDescription access$200(net.bytebuddy.dynamic.Transformer.ForMethod.TransformedMethod r0) {
                    net.bytebuddy.description.type.TypeDescription r0 = r0.instrumentedType
                    return r0
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
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                    return r0
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$Token r0 = r1.token
                    net.bytebuddy.description.annotation.AnnotationList r0 = r0.getAnnotations()
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
            @javax.annotation.Nonnull
            public net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDefinition r0 = r1.declaringType
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription
            @net.bytebuddy.utility.nullability.MaybeNull
            public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$Token r0 = r1.token
                    net.bytebuddy.description.annotation.AnnotationValue r0 = r0.getDefaultValue()
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription
            public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                    r3 = this;
                    net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes
                    net.bytebuddy.description.method.MethodDescription$Token r1 = r3.token
                    net.bytebuddy.description.type.TypeList$Generic r1 = r1.getExceptionTypes()
                    net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor r2 = new net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor
                    r2.<init>(r3)
                    r0.<init>(r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
            public java.lang.String getInternalName() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$Token r0 = r1.token
                    java.lang.String r0 = r0.getName()
                    return r0
            }

            @Override // net.bytebuddy.description.ModifierReviewable
            public int getModifiers() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$Token r0 = r1.token
                    int r0 = r0.getModifiers()
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
            public net.bytebuddy.description.method.ParameterList<?> getParameters() {
                    r1 = this;
                    net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$TransformedParameterList r0 = new net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$TransformedParameterList
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription
            public net.bytebuddy.description.type.TypeDescription.Generic getReceiverType() {
                    r2 = this;
                    net.bytebuddy.description.method.MethodDescription$Token r0 = r2.token
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReceiverType()
                    if (r0 != 0) goto Lb
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                    goto L16
                Lb:
                    net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor r1 = new net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor
                    r1.<init>(r2)
                    java.lang.Object r0 = r0.accept(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                L16:
                    return r0
            }

            @Override // net.bytebuddy.description.method.MethodDescription
            public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                    r2 = this;
                    net.bytebuddy.description.method.MethodDescription$Token r0 = r2.token
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
                    net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor r1 = new net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor
                    r1.<init>(r2)
                    java.lang.Object r0 = r0.accept(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    return r0
            }

            @Override // net.bytebuddy.description.TypeVariableSource
            public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                    r3 = this;
                    net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$OfTypeVariables r0 = new net.bytebuddy.description.type.TypeList$Generic$ForDetachedTypes$OfTypeVariables
                    net.bytebuddy.description.method.MethodDescription$Token r1 = r3.token
                    net.bytebuddy.description.ByteCodeElement$Token$TokenList r1 = r1.getTypeVariableTokens()
                    net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor r2 = new net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod$AttachmentVisitor
                    r2.<init>(r3)
                    r0.<init>(r3, r1, r2)
                    return r0
            }
        }

        public ForMethod(net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription.Token> r1) {
                r0 = this;
                r0.<init>()
                r0.transformer = r1
                return
        }

        public static net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> withModifiers(java.util.List<? extends net.bytebuddy.description.modifier.ModifierContributor.ForMethod> r2) {
                net.bytebuddy.dynamic.Transformer$ForMethod r0 = new net.bytebuddy.dynamic.Transformer$ForMethod
                net.bytebuddy.dynamic.Transformer$ForMethod$MethodModifierTransformer r1 = new net.bytebuddy.dynamic.Transformer$ForMethod$MethodModifierTransformer
                net.bytebuddy.description.modifier.ModifierContributor$Resolver r2 = net.bytebuddy.description.modifier.ModifierContributor.Resolver.of(r2)
                r1.<init>(r2)
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription> withModifiers(net.bytebuddy.description.modifier.ModifierContributor.ForMethod... r0) {
                java.util.List r0 = java.util.Arrays.asList(r0)
                net.bytebuddy.dynamic.Transformer r0 = withModifiers(r0)
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
                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription$Token> r2 = r4.transformer
                net.bytebuddy.dynamic.Transformer$ForMethod r5 = (net.bytebuddy.dynamic.Transformer.ForMethod) r5
                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription$Token> r5 = r5.transformer
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
                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription$Token> r1 = r2.transformer
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.Transformer
        public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription transform(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                r0 = this;
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.description.method.MethodDescription r1 = r0.transform2(r1, r2)
                return r1
        }

        /* JADX INFO: renamed from: transform, reason: avoid collision after fix types in other method */
        public net.bytebuddy.description.method.MethodDescription transform2(net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.method.MethodDescription r6) {
                r4 = this;
                net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod r0 = new net.bytebuddy.dynamic.Transformer$ForMethod$TransformedMethod
                net.bytebuddy.description.type.TypeDefinition r1 = r6.getDeclaringType()
                net.bytebuddy.dynamic.Transformer<net.bytebuddy.description.method.MethodDescription$Token> r2 = r4.transformer
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.none()
                net.bytebuddy.description.ByteCodeElement$Token r3 = r6.asToken(r3)
                java.lang.Object r2 = r2.transform(r5, r3)
                net.bytebuddy.description.method.MethodDescription$Token r2 = (net.bytebuddy.description.method.MethodDescription.Token) r2
                net.bytebuddy.description.ByteCodeElement$TypeDependant r6 = r6.asDefined()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r6 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r6
                r0.<init>(r5, r1, r2, r6)
                return r0
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.dynamic.Transformer.NoOp> implements net.bytebuddy.dynamic.Transformer<java.lang.Object> {
        private static final /* synthetic */ net.bytebuddy.dynamic.Transformer.NoOp[] $VALUES = null;
        public static final net.bytebuddy.dynamic.Transformer.NoOp INSTANCE = null;

        static {
                net.bytebuddy.dynamic.Transformer$NoOp r0 = new net.bytebuddy.dynamic.Transformer$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.Transformer.NoOp.INSTANCE = r0
                net.bytebuddy.dynamic.Transformer$NoOp[] r0 = new net.bytebuddy.dynamic.Transformer.NoOp[]{r0}
                net.bytebuddy.dynamic.Transformer.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static <T> net.bytebuddy.dynamic.Transformer<T> make() {
                net.bytebuddy.dynamic.Transformer$NoOp r0 = net.bytebuddy.dynamic.Transformer.NoOp.INSTANCE
                return r0
        }

        public static net.bytebuddy.dynamic.Transformer.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.Transformer$NoOp> r0 = net.bytebuddy.dynamic.Transformer.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.Transformer$NoOp r1 = (net.bytebuddy.dynamic.Transformer.NoOp) r1
                return r1
        }

        public static net.bytebuddy.dynamic.Transformer.NoOp[] values() {
                net.bytebuddy.dynamic.Transformer$NoOp[] r0 = net.bytebuddy.dynamic.Transformer.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.Transformer$NoOp[] r0 = (net.bytebuddy.dynamic.Transformer.NoOp[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.Transformer
        public java.lang.Object transform(net.bytebuddy.description.type.TypeDescription r1, java.lang.Object r2) {
                r0 = this;
                return r2
        }
    }

    T transform(net.bytebuddy.description.type.TypeDescription r1, T r2);
}
