package net.bytebuddy.description.field;

/* JADX INFO: loaded from: classes2.dex */
public interface FieldDescription extends net.bytebuddy.description.ModifierReviewable.ForFieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.ByteCodeElement.Member, net.bytebuddy.description.ByteCodeElement.TypeDependant<net.bytebuddy.description.field.FieldDescription.InDefinedShape, net.bytebuddy.description.field.FieldDescription.Token> {

    @net.bytebuddy.utility.nullability.AlwaysNull
    public static final java.lang.Object NO_DEFAULT_VALUE = null;

    public static abstract class AbstractBase extends net.bytebuddy.description.ModifierReviewable.AbstractBase implements net.bytebuddy.description.field.FieldDescription {
        private transient /* synthetic */ int hashCode;

        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.field.FieldDescription
        public net.bytebuddy.description.field.FieldDescription.SignatureToken asSignatureToken() {
                r3 = this;
                net.bytebuddy.description.field.FieldDescription$SignatureToken r0 = new net.bytebuddy.description.field.FieldDescription$SignatureToken
                java.lang.String r1 = r3.getInternalName()
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r3.getType()
                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.Token asToken(net.bytebuddy.matcher.ElementMatcher r1) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription$Token r1 = r0.asToken(r1)
                return r1
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public net.bytebuddy.description.field.FieldDescription.Token asToken(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r6) {
                r5 = this;
                net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                java.lang.String r1 = r5.getName()
                int r2 = r5.getModifiers()
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.getType()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment r4 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment
                r4.<init>(r6)
                java.lang.Object r6 = r3.accept(r4)
                net.bytebuddy.description.type.TypeDescription$Generic r6 = (net.bytebuddy.description.type.TypeDescription.Generic) r6
                net.bytebuddy.description.annotation.AnnotationList r3 = r5.getDeclaredAnnotations()
                r0.<init>(r1, r2, r6, r3)
                return r0
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.description.field.FieldDescription
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.field.FieldDescription r5 = (net.bytebuddy.description.field.FieldDescription) r5
                java.lang.String r1 = r4.getName()
                java.lang.String r3 = r5.getName()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L29
                net.bytebuddy.description.type.TypeDefinition r1 = r4.getDeclaringType()
                net.bytebuddy.description.type.TypeDefinition r5 = r5.getDeclaringType()
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L29
                goto L2a
            L29:
                r0 = r2
            L2a:
                return r0
        }

        @Override // net.bytebuddy.description.field.FieldDescription
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

        @Override // net.bytebuddy.description.NamedElement
        public java.lang.String getActualName() {
                r1 = this;
                java.lang.String r0 = r1.getName()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithDescriptor
        public java.lang.String getDescriptor() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                java.lang.String r0 = r0.getDescriptor()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithDescriptor
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.String getGenericSignature() {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getType()
                net.bytebuddy.description.type.TypeDefinition$Sort r1 = r0.getSort()     // Catch: java.lang.reflect.GenericSignatureFormatError -> L26
                boolean r1 = r1.isNonGeneric()     // Catch: java.lang.reflect.GenericSignatureFormatError -> L26
                if (r1 == 0) goto L11
                java.lang.String r0 = net.bytebuddy.description.NamedElement.WithDescriptor.NON_GENERIC_SIGNATURE     // Catch: java.lang.reflect.GenericSignatureFormatError -> L26
                goto L25
            L11:
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor r1 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$ForSignatureVisitor     // Catch: java.lang.reflect.GenericSignatureFormatError -> L26
                net.bytebuddy.jar.asm.signature.SignatureWriter r2 = new net.bytebuddy.jar.asm.signature.SignatureWriter     // Catch: java.lang.reflect.GenericSignatureFormatError -> L26
                r2.<init>()     // Catch: java.lang.reflect.GenericSignatureFormatError -> L26
                r1.<init>(r2)     // Catch: java.lang.reflect.GenericSignatureFormatError -> L26
                java.lang.Object r0 = r0.accept(r1)     // Catch: java.lang.reflect.GenericSignatureFormatError -> L26
                net.bytebuddy.jar.asm.signature.SignatureVisitor r0 = (net.bytebuddy.jar.asm.signature.SignatureVisitor) r0     // Catch: java.lang.reflect.GenericSignatureFormatError -> L26
                java.lang.String r0 = r0.toString()     // Catch: java.lang.reflect.GenericSignatureFormatError -> L26
            L25:
                return r0
            L26:
                java.lang.String r0 = net.bytebuddy.description.NamedElement.WithDescriptor.NON_GENERIC_SIGNATURE
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getInternalName() {
                r1 = this;
                java.lang.String r0 = r1.getName()
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public int hashCode() {
                r2 = this;
                int r0 = r2.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto L1b
            L6:
                net.bytebuddy.description.type.TypeDefinition r0 = r2.getDeclaringType()
                int r0 = r0.hashCode()
                java.lang.String r1 = r2.getName()
                int r1 = r1.hashCode()
                int r1 = r1 + 17
                int r1 = r1 * 31
                int r0 = r0 + r1
            L1b:
                if (r0 != 0) goto L20
                int r0 = r2.hashCode
                goto L22
            L20:
                r2.hashCode = r0
            L22:
                return r0
        }

        @Override // net.bytebuddy.description.ByteCodeElement
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public boolean isAccessibleTo(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                boolean r0 = r1.isPublic()
                if (r0 != 0) goto L3f
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L3f
                boolean r0 = r1.isPrivate()
                if (r0 != 0) goto L28
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r2.isSamePackage(r0)
                if (r0 != 0) goto L3f
            L28:
                boolean r0 = r1.isPrivate()
                if (r0 == 0) goto L3d
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r2 = r2.isNestMateOf(r0)
                if (r2 == 0) goto L3d
                goto L3f
            L3d:
                r2 = 0
                goto L40
            L3f:
                r2 = 1
            L40:
                return r2
        }

        @Override // net.bytebuddy.description.ByteCodeElement
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public boolean isVisibleTo(net.bytebuddy.description.type.TypeDescription r2) {
                r1 = this;
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r0.isVisibleTo(r2)
                if (r0 == 0) goto L60
                boolean r0 = r1.isPublic()
                if (r0 != 0) goto L5e
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r2.equals(r0)
                if (r0 != 0) goto L5e
                boolean r0 = r1.isProtected()
                if (r0 == 0) goto L36
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r0.isAssignableFrom(r2)
                if (r0 != 0) goto L5e
            L36:
                boolean r0 = r1.isPrivate()
                if (r0 != 0) goto L4a
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r0 = r2.isSamePackage(r0)
                if (r0 != 0) goto L5e
            L4a:
                boolean r0 = r1.isPrivate()
                if (r0 == 0) goto L60
                net.bytebuddy.description.type.TypeDefinition r0 = r1.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                boolean r2 = r2.isNestMateOf(r0)
                if (r2 == 0) goto L60
            L5e:
                r2 = 1
                goto L61
            L60:
                r2 = 0
            L61:
                return r2
        }

        @Override // net.bytebuddy.description.NamedElement.WithGenericName
        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public java.lang.String toGenericString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r3.getModifiers()
                r2 = 32
                if (r1 == 0) goto L1b
                int r1 = r3.getModifiers()
                java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
                r0.append(r1)
                r0.append(r2)
            L1b:
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
                java.lang.String r1 = r1.getActualName()
                r0.append(r1)
                r0.append(r2)
                net.bytebuddy.description.type.TypeDefinition r1 = r3.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.String r1 = r1.getActualName()
                r0.append(r1)
                r1 = 46
                r0.append(r1)
                java.lang.String r1 = r3.getName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                int r1 = r3.getModifiers()
                r2 = 32
                if (r1 == 0) goto L1b
                int r1 = r3.getModifiers()
                java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
                r0.append(r1)
                r0.append(r2)
            L1b:
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
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
                java.lang.String r1 = r3.getName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ForLoadedField extends net.bytebuddy.description.field.FieldDescription.InDefinedShape.AbstractBase {
        private transient /* synthetic */ net.bytebuddy.description.annotation.AnnotationList declaredAnnotations;
        private final java.lang.reflect.Field field;

        public ForLoadedField(java.lang.reflect.Field r1) {
                r0 = this;
                r0.<init>()
                r0.field = r1
                return
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("declaredAnnotations")
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList r0 = r2.declaredAnnotations
                if (r0 == 0) goto L6
                r0 = 0
                goto L11
            L6:
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                java.lang.reflect.Field r1 = r2.field
                java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
                r0.<init>(r1)
            L11:
                if (r0 != 0) goto L16
                net.bytebuddy.description.annotation.AnnotationList r0 = r2.declaredAnnotations
                goto L18
            L16:
                r2.declaredAnnotations = r0
            L18:
                return r0
        }

        @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                java.lang.reflect.Field r0 = r1.field
                java.lang.Class r0 = r0.getDeclaringClass()
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                java.lang.reflect.Field r0 = r1.field
                int r0 = r0.getModifiers()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                java.lang.reflect.Field r0 = r1.field
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // net.bytebuddy.description.field.FieldDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                r2 = this;
                boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                if (r0 == 0) goto Lf
                java.lang.reflect.Field r0 = r2.field
                java.lang.Class r0 = r0.getType()
                net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                return r0
            Lf:
                net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$ForLoadedFieldType r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$ForLoadedFieldType
                java.lang.reflect.Field r1 = r2.field
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.AbstractBase, net.bytebuddy.description.ModifierReviewable
        public boolean isSynthetic() {
                r1 = this;
                java.lang.reflect.Field r0 = r1.field
                boolean r0 = r0.isSynthetic()
                return r0
        }
    }

    public interface InDefinedShape extends net.bytebuddy.description.field.FieldDescription {

        public static abstract class AbstractBase extends net.bytebuddy.description.field.FieldDescription.AbstractBase implements net.bytebuddy.description.field.FieldDescription.InDefinedShape {
            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
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
                    r0 = this;
                    return r0
            }
        }

        @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        net.bytebuddy.description.type.TypeDescription getDeclaringType();
    }

    public interface InGenericShape extends net.bytebuddy.description.field.FieldDescription {
        @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        net.bytebuddy.description.type.TypeDescription.Generic getDeclaringType();
    }

    public static class Latent extends net.bytebuddy.description.field.FieldDescription.InDefinedShape.AbstractBase {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> declaredAnnotations;
        private final net.bytebuddy.description.type.TypeDescription declaringType;
        private final net.bytebuddy.description.type.TypeDescription.Generic fieldType;
        private final int modifiers;
        private final java.lang.String name;

        public Latent(net.bytebuddy.description.type.TypeDescription r1, java.lang.String r2, int r3, net.bytebuddy.description.type.TypeDescription.Generic r4, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r5) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.name = r2
                r0.modifiers = r3
                r0.fieldType = r4
                r0.declaredAnnotations = r5
                return
        }

        public Latent(net.bytebuddy.description.type.TypeDescription r7, net.bytebuddy.description.field.FieldDescription.Token r8) {
                r6 = this;
                java.lang.String r2 = r8.getName()
                int r3 = r8.getModifiers()
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r8.getType()
                net.bytebuddy.description.annotation.AnnotationList r5 = r8.getAnnotations()
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
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

        @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.declaringType
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

        @Override // net.bytebuddy.description.field.FieldDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.fieldType
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r2)
                java.lang.Object r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                return r0
        }
    }

    public static class SignatureToken {
        private transient /* synthetic */ int hashCode;
        private final java.lang.String name;
        private final net.bytebuddy.description.type.TypeDescription type;

        public SignatureToken(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.type = r2
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.description.field.FieldDescription.SignatureToken
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.field.FieldDescription$SignatureToken r5 = (net.bytebuddy.description.field.FieldDescription.SignatureToken) r5
                java.lang.String r1 = r4.name
                java.lang.String r3 = r5.name
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                net.bytebuddy.description.type.TypeDescription r1 = r4.type
                net.bytebuddy.description.type.TypeDescription r5 = r5.type
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = r2
            L22:
                return r0
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public net.bytebuddy.description.type.TypeDescription getType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.type
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
                java.lang.String r0 = r2.name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.type
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
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                net.bytebuddy.description.type.TypeDescription r1 = r2.type
                r0.append(r1)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = r2.name
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class Token implements net.bytebuddy.description.ByteCodeElement.Token<net.bytebuddy.description.field.FieldDescription.Token> {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;
        private transient /* synthetic */ int hashCode;
        private final int modifiers;
        private final java.lang.String name;
        private final net.bytebuddy.description.type.TypeDescription.Generic type;

        public Token(java.lang.String r2, int r3, net.bytebuddy.description.type.TypeDescription.Generic r4) {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r1.<init>(r2, r3, r4, r0)
                return
        }

        public Token(java.lang.String r1, int r2, net.bytebuddy.description.type.TypeDescription.Generic r3, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.modifiers = r2
                r0.type = r3
                r0.annotations = r4
                return
        }

        @Override // net.bytebuddy.description.ByteCodeElement.Token
        public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.Token accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor r1) {
                r0 = this;
                net.bytebuddy.description.field.FieldDescription$Token r1 = r0.accept(r1)
                return r1
        }

        @Override // net.bytebuddy.description.ByteCodeElement.Token
        public net.bytebuddy.description.field.FieldDescription.Token accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r5) {
                r4 = this;
                net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                java.lang.String r1 = r4.name
                int r2 = r4.modifiers
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r4.type
                java.lang.Object r5 = r3.accept(r5)
                net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3 = r4.annotations
                r0.<init>(r1, r2, r5, r3)
                return r0
        }

        public net.bytebuddy.description.field.FieldDescription.SignatureToken asSignatureToken(net.bytebuddy.description.type.TypeDescription r6) {
                r5 = this;
                net.bytebuddy.description.field.FieldDescription$SignatureToken r0 = new net.bytebuddy.description.field.FieldDescription$SignatureToken
                java.lang.String r1 = r5.name
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r5.type
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reducing r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Reducing
                r4 = 0
                net.bytebuddy.description.type.TypeVariableToken[] r4 = new net.bytebuddy.description.type.TypeVariableToken[r4]
                r3.<init>(r6, r4)
                java.lang.Object r6 = r2.accept(r3)
                net.bytebuddy.description.type.TypeDescription r6 = (net.bytebuddy.description.type.TypeDescription) r6
                r0.<init>(r1, r6)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L3b
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L3b
            L12:
                net.bytebuddy.description.field.FieldDescription$Token r5 = (net.bytebuddy.description.field.FieldDescription.Token) r5
                int r2 = r4.modifiers
                int r3 = r5.modifiers
                if (r2 != r3) goto L39
                java.lang.String r2 = r4.name
                java.lang.String r3 = r5.name
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L39
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.type
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.type
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L39
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r4.annotations
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r5 = r5.annotations
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L39
                goto L3a
            L39:
                r0 = r1
            L3a:
                return r0
            L3b:
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationList getAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
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

        public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.type
                return r0
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r2 = this;
                int r0 = r2.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto L23
            L6:
                java.lang.String r0 = r2.name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.modifiers
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.type
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L23:
                if (r0 != 0) goto L28
                int r0 = r2.hashCode
                goto L2a
            L28:
                r2.hashCode = r0
            L2a:
                return r0
        }
    }

    public static class TypeSubstituting extends net.bytebuddy.description.field.FieldDescription.AbstractBase implements net.bytebuddy.description.field.FieldDescription.InGenericShape {
        private final net.bytebuddy.description.type.TypeDescription.Generic declaringType;
        private final net.bytebuddy.description.field.FieldDescription fieldDescription;
        private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

        public TypeSubstituting(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.fieldDescription = r2
                r0.visitor = r3
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
                net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                net.bytebuddy.description.ByteCodeElement$TypeDependant r0 = r0.asDefined()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r0
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r1 = this;
                net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                return r0
        }

        @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.field.FieldDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public net.bytebuddy.description.type.TypeDescription.Generic getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.declaringType
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                int r0 = r0.getModifiers()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // net.bytebuddy.description.field.FieldDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                r2 = this;
                net.bytebuddy.description.field.FieldDescription r0 = r2.fieldDescription
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.visitor
                java.lang.Object r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                return r0
        }
    }

    static {
            return
    }

    net.bytebuddy.description.field.FieldDescription.SignatureToken asSignatureToken();

    int getActualModifiers();

    @Override // net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
    @javax.annotation.Nonnull
    net.bytebuddy.description.type.TypeDefinition getDeclaringType();

    net.bytebuddy.description.type.TypeDescription.Generic getType();
}
