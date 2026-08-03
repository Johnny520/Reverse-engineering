package net.bytebuddy.description.type;

/* JADX INFO: loaded from: classes2.dex */
public interface RecordComponentDescription extends net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.NamedElement.WithDescriptor, net.bytebuddy.description.annotation.AnnotationSource, net.bytebuddy.description.ByteCodeElement.TypeDependant<net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape, net.bytebuddy.description.type.RecordComponentDescription.Token> {

    public static abstract class AbstractBase implements net.bytebuddy.description.type.RecordComponentDescription {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.Token asToken(net.bytebuddy.matcher.ElementMatcher r1) {
                r0 = this;
                net.bytebuddy.description.type.RecordComponentDescription$Token r1 = r0.asToken(r1)
                return r1
        }

        @Override // net.bytebuddy.description.type.RecordComponentDescription, net.bytebuddy.description.ByteCodeElement.TypeDependant
        public net.bytebuddy.description.type.RecordComponentDescription.Token asToken(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r5) {
                r4 = this;
                net.bytebuddy.description.type.RecordComponentDescription$Token r0 = new net.bytebuddy.description.type.RecordComponentDescription$Token
                java.lang.String r1 = r4.getActualName()
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.getType()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment r3 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment
                r3.<init>(r5)
                java.lang.Object r5 = r2.accept(r3)
                net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                net.bytebuddy.description.annotation.AnnotationList r2 = r4.getDeclaredAnnotations()
                r0.<init>(r1, r5, r2)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof net.bytebuddy.description.type.RecordComponentDescription
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                net.bytebuddy.description.type.RecordComponentDescription r2 = (net.bytebuddy.description.type.RecordComponentDescription) r2
                java.lang.String r0 = r1.getActualName()
                java.lang.String r2 = r2.getActualName()
                boolean r2 = r0.equals(r2)
                return r2
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

        public int hashCode() {
                r1 = this;
                java.lang.String r0 = r1.getActualName()
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.getType()
                java.lang.String r1 = r1.getTypeName()
                r0.append(r1)
                java.lang.String r1 = " "
                r0.append(r1)
                java.lang.String r1 = r2.getActualName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class ForLoadedRecordComponent extends net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape.AbstractBase {
        private static final boolean ACCESS_CONTROLLER = false;
        protected static final net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RecordComponent RECORD_COMPONENT = null;
        private final java.lang.reflect.AnnotatedElement recordComponent;

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.RecordComponent")
        public interface RecordComponent {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAccessor")
            java.lang.reflect.Method getAccessor(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getAnnotatedType")
            java.lang.reflect.AnnotatedElement getAnnotatedType(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getDeclaringRecord")
            java.lang.Class<?> getDeclaringRecord(java.lang.Object r1);

            @net.bytebuddy.utility.nullability.MaybeNull
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getGenericSignature")
            java.lang.String getGenericSignature(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getGenericType")
            java.lang.reflect.Type getGenericType(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getName")
            java.lang.String getName(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getType")
            java.lang.Class<?> getType(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isInstance")
            boolean isInstance(java.lang.Object r1);
        }

        static {
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.ACCESS_CONTROLLER = r0
            L19:
                java.lang.Class<net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent$RecordComponent> r0 = net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RecordComponent.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent$RecordComponent r0 = (net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RecordComponent) r0
                net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RECORD_COMPONENT = r0
                return
        }

        public ForLoadedRecordComponent(java.lang.reflect.AnnotatedElement r1) {
                r0 = this;
                r0.<init>()
                r0.recordComponent = r1
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static net.bytebuddy.description.type.RecordComponentDescription of(java.lang.Object r3) {
                net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent$RecordComponent r0 = net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RECORD_COMPONENT
                boolean r0 = r0.isInstance(r3)
                if (r0 == 0) goto L10
                net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent r0 = new net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent
                java.lang.reflect.AnnotatedElement r3 = (java.lang.reflect.AnnotatedElement) r3
                r0.<init>(r3)
                return r0
            L10:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not a record component: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @Override // net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape.AbstractBase, net.bytebuddy.description.type.RecordComponentDescription, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape getAccessor() {
                r3 = this;
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent$RecordComponent r1 = net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RECORD_COMPONENT
                java.lang.reflect.AnnotatedElement r2 = r3.recordComponent
                java.lang.reflect.Method r1 = r1.getAccessor(r2)
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape.AbstractBase, net.bytebuddy.description.type.RecordComponentDescription, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape
        public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getAccessor() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getAccessor()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement
        public java.lang.String getActualName() {
                r2 = this;
                net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent$RecordComponent r0 = net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RECORD_COMPONENT
                java.lang.reflect.AnnotatedElement r1 = r2.recordComponent
                java.lang.String r0 = r0.getName(r1)
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                java.lang.reflect.AnnotatedElement r1 = r2.recordComponent
                java.lang.annotation.Annotation[] r1 = r1.getDeclaredAnnotations()
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r2 = this;
                net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent$RecordComponent r0 = net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RECORD_COMPONENT
                java.lang.reflect.AnnotatedElement r1 = r2.recordComponent
                java.lang.Class r0 = r0.getDeclaringRecord(r1)
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                return r0
        }

        @Override // net.bytebuddy.description.type.RecordComponentDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithDescriptor
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.String getGenericSignature() {
                r2 = this;
                net.bytebuddy.description.type.RecordComponentDescription$ForLoadedRecordComponent$RecordComponent r0 = net.bytebuddy.description.type.RecordComponentDescription.ForLoadedRecordComponent.RECORD_COMPONENT
                java.lang.reflect.AnnotatedElement r1 = r2.recordComponent
                java.lang.String r0 = r0.getGenericSignature(r1)
                return r0
        }

        @Override // net.bytebuddy.description.type.RecordComponentDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfRecordComponent r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfRecordComponent
                java.lang.reflect.AnnotatedElement r1 = r2.recordComponent
                r0.<init>(r1)
                return r0
        }
    }

    public interface InDefinedShape extends net.bytebuddy.description.type.RecordComponentDescription {

        public static abstract class AbstractBase extends net.bytebuddy.description.type.RecordComponentDescription.AbstractBase implements net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape {
            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
            public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.TypeDependant asDefined() {
                    r1 = this;
                    net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r0 = r1.asDefined()
                    return r0
            }

            @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
            public net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape asDefined() {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.description.type.RecordComponentDescription, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape getAccessor() {
                    r2 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r2.getDeclaringType()
                    net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                    java.lang.String r1 = r2.getActualName()
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                    net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                    net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                    java.lang.Object r0 = r0.getOnly()
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                    return r0
            }

            @Override // net.bytebuddy.description.type.RecordComponentDescription, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape
            public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getAccessor() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getAccessor()
                    return r0
            }
        }

        net.bytebuddy.description.method.MethodDescription.InDefinedShape getAccessor();

        @Override // net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        net.bytebuddy.description.type.TypeDescription getDeclaringType();
    }

    public interface InGenericShape extends net.bytebuddy.description.type.RecordComponentDescription {
        @Override // net.bytebuddy.description.type.RecordComponentDescription, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape
        net.bytebuddy.description.method.MethodDescription.InGenericShape getAccessor();
    }

    public static class Latent extends net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape.AbstractBase {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;
        private final net.bytebuddy.description.type.TypeDescription declaringType;
        private final java.lang.String name;
        private final net.bytebuddy.description.type.TypeDescription.Generic type;

        public Latent(net.bytebuddy.description.type.TypeDescription r1, java.lang.String r2, net.bytebuddy.description.type.TypeDescription.Generic r3, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.name = r2
                r0.type = r3
                r0.annotations = r4
                return
        }

        public Latent(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.type.RecordComponentDescription.Token r4) {
                r2 = this;
                java.lang.String r0 = r4.getName()
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r4.getType()
                net.bytebuddy.description.annotation.AnnotationList r4 = r4.getAnnotations()
                r2.<init>(r3, r0, r1, r4)
                return
        }

        @Override // net.bytebuddy.description.NamedElement
        public java.lang.String getActualName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.declaringType
                return r0
        }

        @Override // net.bytebuddy.description.type.RecordComponentDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.type
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r2)
                java.lang.Object r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                return r0
        }
    }

    public static class Token implements net.bytebuddy.description.ByteCodeElement.Token<net.bytebuddy.description.type.RecordComponentDescription.Token> {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;
        private transient /* synthetic */ int hashCode;
        private final java.lang.String name;
        private final net.bytebuddy.description.type.TypeDescription.Generic type;

        public Token(java.lang.String r2, net.bytebuddy.description.type.TypeDescription.Generic r3) {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r1.<init>(r2, r3, r0)
                return
        }

        public Token(java.lang.String r1, net.bytebuddy.description.type.TypeDescription.Generic r2, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.type = r2
                r0.annotations = r3
                return
        }

        @Override // net.bytebuddy.description.ByteCodeElement.Token
        public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.Token accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor r1) {
                r0 = this;
                net.bytebuddy.description.type.RecordComponentDescription$Token r1 = r0.accept(r1)
                return r1
        }

        @Override // net.bytebuddy.description.ByteCodeElement.Token
        public net.bytebuddy.description.type.RecordComponentDescription.Token accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r4) {
                r3 = this;
                net.bytebuddy.description.type.RecordComponentDescription$Token r0 = new net.bytebuddy.description.type.RecordComponentDescription$Token
                java.lang.String r1 = r3.name
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r3.type
                java.lang.Object r4 = r2.accept(r4)
                net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r3.annotations
                r0.<init>(r1, r4, r2)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                r1 = 0
                if (r5 == 0) goto L35
                java.lang.Class r2 = r4.getClass()
                java.lang.Class r3 = r5.getClass()
                if (r2 == r3) goto L12
                goto L35
            L12:
                net.bytebuddy.description.type.RecordComponentDescription$Token r5 = (net.bytebuddy.description.type.RecordComponentDescription.Token) r5
                java.lang.String r2 = r4.name
                java.lang.String r3 = r5.name
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L33
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.type
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.type
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L33
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r4.annotations
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r5 = r5.annotations
                boolean r5 = r2.equals(r5)
                if (r5 == 0) goto L33
                goto L34
            L33:
                r0 = r1
            L34:
                return r0
            L35:
                return r1
        }

        public net.bytebuddy.description.annotation.AnnotationList getAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                r0.<init>(r1)
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
                goto L1e
            L6:
                java.lang.String r0 = r2.name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.type
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                int r1 = r1.hashCode()
                int r0 = r0 + r1
            L1e:
                if (r0 != 0) goto L23
                int r0 = r2.hashCode
                goto L25
            L23:
                r2.hashCode = r0
            L25:
                return r0
        }
    }

    public static class TypeSubstituting extends net.bytebuddy.description.type.RecordComponentDescription.AbstractBase implements net.bytebuddy.description.type.RecordComponentDescription.InGenericShape {
        private final net.bytebuddy.description.type.TypeDescription.Generic declaringType;
        private final net.bytebuddy.description.type.RecordComponentDescription recordComponentDescription;
        private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

        public TypeSubstituting(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.type.RecordComponentDescription r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                r0 = this;
                r0.<init>()
                r0.declaringType = r1
                r0.recordComponentDescription = r2
                r0.visitor = r3
                return
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.TypeDependant asDefined() {
                r1 = this;
                net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r0 = r1.asDefined()
                return r0
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape asDefined() {
                r1 = this;
                net.bytebuddy.description.type.RecordComponentDescription r0 = r1.recordComponentDescription
                net.bytebuddy.description.ByteCodeElement$TypeDependant r0 = r0.asDefined()
                net.bytebuddy.description.type.RecordComponentDescription$InDefinedShape r0 = (net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape) r0
                return r0
        }

        @Override // net.bytebuddy.description.type.RecordComponentDescription, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape
        public net.bytebuddy.description.method.MethodDescription.InGenericShape getAccessor() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.declaringType
                net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                java.lang.String r1 = r2.getActualName()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                java.lang.Object r0 = r0.getOnly()
                net.bytebuddy.description.method.MethodDescription$InGenericShape r0 = (net.bytebuddy.description.method.MethodDescription.InGenericShape) r0
                return r0
        }

        @Override // net.bytebuddy.description.type.RecordComponentDescription, net.bytebuddy.description.type.RecordComponentDescription.InDefinedShape
        public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getAccessor() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InGenericShape r0 = r1.getAccessor()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement
        public java.lang.String getActualName() {
                r1 = this;
                net.bytebuddy.description.type.RecordComponentDescription r0 = r1.recordComponentDescription
                java.lang.String r0 = r0.getActualName()
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r1 = this;
                net.bytebuddy.description.type.RecordComponentDescription r0 = r1.recordComponentDescription
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                return r0
        }

        @Override // net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
        @javax.annotation.Nonnull
        public net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.declaringType
                return r0
        }

        @Override // net.bytebuddy.description.type.RecordComponentDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                r2 = this;
                net.bytebuddy.description.type.RecordComponentDescription r0 = r2.recordComponentDescription
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.visitor
                java.lang.Object r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                return r0
        }
    }

    @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
    net.bytebuddy.description.type.RecordComponentDescription.Token asToken(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r1);

    net.bytebuddy.description.method.MethodDescription getAccessor();

    net.bytebuddy.description.type.TypeDescription.Generic getType();
}
