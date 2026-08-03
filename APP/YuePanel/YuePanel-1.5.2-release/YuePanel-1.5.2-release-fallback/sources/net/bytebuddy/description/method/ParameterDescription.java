package net.bytebuddy.description.method;

/* JADX INFO: loaded from: classes2.dex */
public interface ParameterDescription extends net.bytebuddy.description.annotation.AnnotationSource, net.bytebuddy.description.NamedElement.WithRuntimeName, net.bytebuddy.description.NamedElement.WithOptionalName, net.bytebuddy.description.ModifierReviewable.ForParameterDescription, net.bytebuddy.description.ByteCodeElement.TypeDependant<net.bytebuddy.description.method.ParameterDescription.InDefinedShape, net.bytebuddy.description.method.ParameterDescription.Token> {
    public static final java.lang.String NAME_PREFIX = "arg";

    public static abstract class AbstractBase extends net.bytebuddy.description.ModifierReviewable.AbstractBase implements net.bytebuddy.description.method.ParameterDescription {
        private transient /* synthetic */ int hashCode;
        private transient /* synthetic */ int offset;

        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.Token asToken(net.bytebuddy.matcher.ElementMatcher r1) {
                r0 = this;
                net.bytebuddy.description.method.ParameterDescription$Token r1 = r0.asToken(r1)
                return r1
        }

        @Override // net.bytebuddy.description.ByteCodeElement.TypeDependant
        public net.bytebuddy.description.method.ParameterDescription.Token asToken(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.type.TypeDescription> r5) {
                r4 = this;
                net.bytebuddy.description.method.ParameterDescription$Token r0 = new net.bytebuddy.description.method.ParameterDescription$Token
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r4.getType()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment r2 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForDetachment
                r2.<init>(r5)
                java.lang.Object r5 = r1.accept(r2)
                net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                net.bytebuddy.description.annotation.AnnotationList r1 = r4.getDeclaredAnnotations()
                boolean r2 = r4.isNamed()
                if (r2 == 0) goto L20
                java.lang.String r2 = r4.getName()
                goto L22
            L20:
                java.lang.String r2 = net.bytebuddy.description.method.ParameterDescription.Token.NO_NAME
            L22:
                boolean r3 = r4.hasModifiers()
                if (r3 == 0) goto L31
                int r3 = r4.getModifiers()
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                goto L33
            L31:
                java.lang.Integer r3 = net.bytebuddy.description.method.ParameterDescription.Token.NO_MODIFIERS
            L33:
                r0.<init>(r5, r1, r2, r3)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.description.method.ParameterDescription
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.method.ParameterDescription r5 = (net.bytebuddy.description.method.ParameterDescription) r5
                net.bytebuddy.description.method.MethodDescription r1 = r4.getDeclaringMethod()
                net.bytebuddy.description.method.MethodDescription r3 = r5.getDeclaringMethod()
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L25
                int r1 = r4.getIndex()
                int r5 = r5.getIndex()
                if (r1 != r5) goto L25
                goto L26
            L25:
                r0 = r2
            L26:
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement
        public java.lang.String getActualName() {
                r1 = this;
                boolean r0 = r1.isNamed()
                if (r0 == 0) goto Lb
                java.lang.String r0 = r1.getName()
                goto Ld
            Lb:
                java.lang.String r0 = ""
            Ld:
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getInternalName() {
                r1 = this;
                java.lang.String r0 = r1.getName()
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r2 = this;
                int r0 = r2.getIndex()
                java.lang.String r0 = java.lang.String.valueOf(r0)
                java.lang.String r1 = "arg"
                java.lang.String r0 = r1.concat(r0)
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription
        @net.bytebuddy.build.CachedReturnPlugin.Enhance("offset")
        public int getOffset() {
                r4 = this;
                int r0 = r4.offset
                r1 = 0
                if (r0 == 0) goto L6
                goto L46
            L6:
                net.bytebuddy.description.method.MethodDescription r0 = r4.getDeclaringMethod()
                net.bytebuddy.description.method.ParameterList r0 = r0.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.asTypeList()
                net.bytebuddy.description.type.TypeList r0 = r0.asErasures()
                net.bytebuddy.description.method.MethodDescription r2 = r4.getDeclaringMethod()
                boolean r2 = r2.isStatic()
                if (r2 == 0) goto L27
                net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
                int r2 = r2.getSize()
                goto L2d
            L27:
                net.bytebuddy.implementation.bytecode.StackSize r2 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                int r2 = r2.getSize()
            L2d:
                int r3 = r4.getIndex()
                if (r1 >= r3) goto L45
                java.lang.Object r3 = r0.get(r1)
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                net.bytebuddy.implementation.bytecode.StackSize r3 = r3.getStackSize()
                int r3 = r3.getSize()
                int r2 = r2 + r3
                int r1 = r1 + 1
                goto L2d
            L45:
                r1 = r2
            L46:
                if (r1 != 0) goto L4b
                int r1 = r4.offset
                goto L4d
            L4b:
                r4.offset = r1
            L4d:
                return r1
        }

        @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
        public int hashCode() {
                r2 = this;
                int r0 = r2.hashCode
                if (r0 == 0) goto L6
                r0 = 0
                goto L13
            L6:
                net.bytebuddy.description.method.MethodDescription r0 = r2.getDeclaringMethod()
                int r0 = r0.hashCode()
                int r1 = r2.getIndex()
                r0 = r0 ^ r1
            L13:
                if (r0 != 0) goto L18
                int r0 = r2.hashCode
                goto L1a
            L18:
                r2.hashCode = r0
            L1a:
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                int r1 = r5.getModifiers()
                java.lang.String r1 = java.lang.reflect.Modifier.toString(r1)
                r0.<init>(r1)
                int r1 = r5.getModifiers()
                r2 = 32
                if (r1 == 0) goto L18
                r0.append(r2)
            L18:
                boolean r1 = r5.isVarArgs()
                if (r1 == 0) goto L33
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r5.getType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.String r1 = r1.getName()
                java.lang.String r3 = "\\[]$"
                java.lang.String r4 = "..."
                java.lang.String r1 = r1.replaceFirst(r3, r4)
                goto L3f
            L33:
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r5.getType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                java.lang.String r1 = r1.getName()
            L3f:
                r0.append(r1)
                r0.append(r2)
                java.lang.String r1 = r5.getName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static abstract class ForLoadedParameter<T extends java.lang.reflect.AccessibleObject> extends net.bytebuddy.description.method.ParameterDescription.InDefinedShape.AbstractBase {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.Parameter PARAMETER = null;
        protected final T executable;
        protected final int index;
        protected final net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource;

        public static class OfConstructor extends net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter<java.lang.reflect.Constructor<?>> {
            public OfConstructor(java.lang.reflect.Constructor<?> r1, int r2, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r3) {
                    r0 = this;
                    r0.<init>(r1, r2, r3)
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs", value = {"BC_UNCONFIRMED_CAST"})
            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                    r4 = this;
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource r0 = r4.parameterAnnotationSource
                    java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r4.getDeclaringMethod()
                    int r2 = r0.length
                    net.bytebuddy.description.method.ParameterList r3 = r1.getParameters()
                    int r3 = r3.size()
                    if (r2 == r3) goto L36
                    net.bytebuddy.description.type.TypeDescription r1 = r1.getDeclaringType()
                    boolean r1 = r1.isInnerClass()
                    if (r1 == 0) goto L36
                    int r1 = r4.index
                    if (r1 != 0) goto L29
                    net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                    r0.<init>()
                    goto L35
                L29:
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r1 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    int r2 = r4.index
                    int r2 = r2 + (-1)
                    r0 = r0[r2]
                    r1.<init>(r0)
                    r0 = r1
                L35:
                    return r0
                L36:
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r1 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    int r2 = r4.index
                    r0 = r0[r2]
                    r1.<init>(r0)
                    return r1
            }

            @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape getDeclaringMethod() {
                    r2 = this;
                    net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                    T extends java.lang.reflect.AccessibleObject r1 = r2.executable
                    java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getDeclaringMethod() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getDeclaringMethod()
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                    r4 = this;
                    boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                    if (r0 == 0) goto L15
                    T extends java.lang.reflect.AccessibleObject r0 = r4.executable
                    java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
                    java.lang.Class[] r0 = r0.getParameterTypes()
                    int r1 = r4.index
                    r0 = r0[r1]
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                    return r0
                L15:
                    net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfConstructorParameter r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfConstructorParameter
                    T extends java.lang.reflect.AccessibleObject r1 = r4.executable
                    r2 = r1
                    java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
                    int r3 = r4.index
                    java.lang.reflect.Constructor r1 = (java.lang.reflect.Constructor) r1
                    java.lang.Class[] r1 = r1.getParameterTypes()
                    r0.<init>(r2, r3, r1)
                    return r0
            }
        }

        public static class OfLegacyVmConstructor extends net.bytebuddy.description.method.ParameterDescription.InDefinedShape.AbstractBase {
            private final java.lang.reflect.Constructor<?> constructor;
            private final int index;
            private final net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource;
            private final java.lang.Class<?>[] parameterType;

            public OfLegacyVmConstructor(java.lang.reflect.Constructor<?> r1, int r2, java.lang.Class<?>[] r3, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r4) {
                    r0 = this;
                    r0.<init>()
                    r0.constructor = r1
                    r0.index = r2
                    r0.parameterType = r3
                    r0.parameterAnnotationSource = r4
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                    r4 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r4.getDeclaringMethod()
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource r1 = r4.parameterAnnotationSource
                    java.lang.annotation.Annotation[][] r1 = r1.getParameterAnnotations()
                    int r2 = r1.length
                    net.bytebuddy.description.method.ParameterList r3 = r0.getParameters()
                    int r3 = r3.size()
                    if (r2 == r3) goto L35
                    net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                    boolean r0 = r0.isInnerClass()
                    if (r0 == 0) goto L35
                    int r0 = r4.index
                    if (r0 != 0) goto L29
                    net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                    r0.<init>()
                    goto L34
                L29:
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    int r2 = r4.index
                    int r2 = r2 + (-1)
                    r1 = r1[r2]
                    r0.<init>(r1)
                L34:
                    return r0
                L35:
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    int r2 = r4.index
                    r1 = r1[r2]
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape getDeclaringMethod() {
                    r2 = this;
                    net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                    java.lang.reflect.Constructor<?> r1 = r2.constructor
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
            public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getDeclaringMethod() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getDeclaringMethod()
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription
            public int getIndex() {
                    r1 = this;
                    int r0 = r1.index
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription
            public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                    r4 = this;
                    boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                    if (r0 == 0) goto Lf
                    java.lang.Class<?>[] r0 = r4.parameterType
                    int r1 = r4.index
                    r0 = r0[r1]
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                    return r0
                Lf:
                    net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfConstructorParameter r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfConstructorParameter
                    java.lang.reflect.Constructor<?> r1 = r4.constructor
                    int r2 = r4.index
                    java.lang.Class<?>[] r3 = r4.parameterType
                    r0.<init>(r1, r2, r3)
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription
            public boolean hasModifiers() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.description.NamedElement.WithOptionalName
            public boolean isNamed() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        public static class OfLegacyVmMethod extends net.bytebuddy.description.method.ParameterDescription.InDefinedShape.AbstractBase {
            private final int index;
            private final java.lang.reflect.Method method;
            private final net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource parameterAnnotationSource;
            private final java.lang.Class<?>[] parameterType;

            public OfLegacyVmMethod(java.lang.reflect.Method r1, int r2, java.lang.Class<?>[] r3, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r4) {
                    r0 = this;
                    r0.<init>()
                    r0.method = r1
                    r0.index = r2
                    r0.parameterType = r3
                    r0.parameterAnnotationSource = r4
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                    r3 = this;
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource r1 = r3.parameterAnnotationSource
                    java.lang.annotation.Annotation[][] r1 = r1.getParameterAnnotations()
                    int r2 = r3.index
                    r1 = r1[r2]
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape getDeclaringMethod() {
                    r2 = this;
                    net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                    java.lang.reflect.Method r1 = r2.method
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
            public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getDeclaringMethod() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getDeclaringMethod()
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription
            public int getIndex() {
                    r1 = this;
                    int r0 = r1.index
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription
            public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                    r4 = this;
                    boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                    if (r0 == 0) goto Lf
                    java.lang.Class<?>[] r0 = r4.parameterType
                    int r1 = r4.index
                    r0 = r0[r1]
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                    return r0
                Lf:
                    net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfMethodParameter r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfMethodParameter
                    java.lang.reflect.Method r1 = r4.method
                    int r2 = r4.index
                    java.lang.Class<?>[] r3 = r4.parameterType
                    r0.<init>(r1, r2, r3)
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription
            public boolean hasModifiers() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.description.NamedElement.WithOptionalName
            public boolean isNamed() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        public static class OfMethod extends net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter<java.lang.reflect.Method> {
            public OfMethod(java.lang.reflect.Method r1, int r2, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r3) {
                    r0 = this;
                    r0.<init>(r1, r2, r3)
                    return
            }

            @Override // net.bytebuddy.description.annotation.AnnotationSource
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                    r3 = this;
                    net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations r0 = new net.bytebuddy.description.annotation.AnnotationList$ForLoadedAnnotations
                    net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource r1 = r3.parameterAnnotationSource
                    java.lang.annotation.Annotation[][] r1 = r1.getParameterAnnotations()
                    int r2 = r3.index
                    r1 = r1[r2]
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape getDeclaringMethod() {
                    r2 = this;
                    net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                    T extends java.lang.reflect.AccessibleObject r1 = r2.executable
                    java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getDeclaringMethod() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getDeclaringMethod()
                    return r0
            }

            @Override // net.bytebuddy.description.method.ParameterDescription
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "The implicit field type casting is not understood by Findbugs.", value = {"BC_UNCONFIRMED_CAST"})
            public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                    r4 = this;
                    boolean r0 = net.bytebuddy.description.type.TypeDescription.AbstractBase.RAW_TYPES
                    if (r0 == 0) goto L15
                    T extends java.lang.reflect.AccessibleObject r0 = r4.executable
                    java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
                    java.lang.Class[] r0 = r0.getParameterTypes()
                    int r1 = r4.index
                    r0 = r0[r1]
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                    return r0
                L15:
                    net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfMethodParameter r0 = new net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfMethodParameter
                    T extends java.lang.reflect.AccessibleObject r1 = r4.executable
                    r2 = r1
                    java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                    int r3 = r4.index
                    java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                    java.lang.Class[] r1 = r1.getParameterTypes()
                    r0.<init>(r2, r3, r1)
                    return r0
            }
        }

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.reflect.Parameter")
        public interface Parameter {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getModifiers")
            int getModifiers(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getName")
            java.lang.String getName(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isNamePresent")
            boolean isNamePresent(java.lang.Object r1);
        }

        public interface ParameterAnnotationSource {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForLoadedConstructor implements net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource {
                private final java.lang.reflect.Constructor<?> constructor;

                public ForLoadedConstructor(java.lang.reflect.Constructor<?> r1) {
                        r0 = this;
                        r0.<init>()
                        r0.constructor = r1
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
                        java.lang.reflect.Constructor<?> r2 = r4.constructor
                        net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource$ForLoadedConstructor r5 = (net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource.ForLoadedConstructor) r5
                        java.lang.reflect.Constructor<?> r5 = r5.constructor
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource
                public java.lang.annotation.Annotation[][] getParameterAnnotations() {
                        r1 = this;
                        java.lang.reflect.Constructor<?> r0 = r1.constructor
                        java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.reflect.Constructor<?> r1 = r2.constructor
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForLoadedMethod implements net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource {
                private final java.lang.reflect.Method method;

                public ForLoadedMethod(java.lang.reflect.Method r1) {
                        r0 = this;
                        r0.<init>()
                        r0.method = r1
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
                        java.lang.reflect.Method r2 = r4.method
                        net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$ParameterAnnotationSource$ForLoadedMethod r5 = (net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource.ForLoadedMethod) r5
                        java.lang.reflect.Method r5 = r5.method
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                @Override // net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource
                public java.lang.annotation.Annotation[][] getParameterAnnotations() {
                        r1 = this;
                        java.lang.reflect.Method r0 = r1.method
                        java.lang.annotation.Annotation[][] r0 = r0.getParameterAnnotations()
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.method
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            java.lang.annotation.Annotation[][] getParameterAnnotations();
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
                net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ACCESS_CONTROLLER = r0
            L19:
                java.lang.Class<net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$Parameter> r0 = net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.Parameter.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$Parameter r0 = (net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.Parameter) r0
                net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.PARAMETER = r0
                return
        }

        public ForLoadedParameter(T r1, int r2, net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ParameterAnnotationSource r3) {
                r0 = this;
                r0.<init>()
                r0.executable = r1
                r0.index = r2
                r0.parameterAnnotationSource = r3
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        @Override // net.bytebuddy.description.method.ParameterDescription
        public int getIndex() {
                r1 = this;
                int r0 = r1.index
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r3 = this;
                net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$Parameter r0 = net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.PARAMETER
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Executable r1 = net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.EXECUTABLE
                T extends java.lang.reflect.AccessibleObject r2 = r3.executable
                java.lang.Object[] r1 = r1.getParameters(r2)
                int r2 = r3.index
                r1 = r1[r2]
                int r0 = r0.getModifiers(r1)
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r3 = this;
                net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$Parameter r0 = net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.PARAMETER
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Executable r1 = net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.EXECUTABLE
                T extends java.lang.reflect.AccessibleObject r2 = r3.executable
                java.lang.Object[] r1 = r1.getParameters(r2)
                int r2 = r3.index
                r1 = r1[r2]
                java.lang.String r0 = r0.getName(r1)
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription
        public boolean hasModifiers() {
                r1 = this;
                boolean r0 = r1.isNamed()
                if (r0 != 0) goto Lf
                int r0 = r1.getModifiers()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                goto L10
            Lf:
                r0 = 1
            L10:
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithOptionalName
        public boolean isNamed() {
                r3 = this;
                net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$Parameter r0 = net.bytebuddy.description.method.ParameterDescription.ForLoadedParameter.PARAMETER
                net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Executable r1 = net.bytebuddy.description.method.ParameterList.ForLoadedExecutable.EXECUTABLE
                T extends java.lang.reflect.AccessibleObject r2 = r3.executable
                java.lang.Object[] r1 = r1.getParameters(r2)
                int r2 = r3.index
                r1 = r1[r2]
                boolean r0 = r0.isNamePresent(r1)
                return r0
        }
    }

    public interface InDefinedShape extends net.bytebuddy.description.method.ParameterDescription {

        public static abstract class AbstractBase extends net.bytebuddy.description.method.ParameterDescription.AbstractBase implements net.bytebuddy.description.method.ParameterDescription.InDefinedShape {
            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
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
                    r0 = this;
                    return r0
            }
        }

        net.bytebuddy.description.method.MethodDescription.InDefinedShape getDeclaringMethod();
    }

    public interface InGenericShape extends net.bytebuddy.description.method.ParameterDescription {
        @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
        net.bytebuddy.description.method.MethodDescription.InGenericShape getDeclaringMethod();
    }

    public static class Latent extends net.bytebuddy.description.method.ParameterDescription.InDefinedShape.AbstractBase {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> declaredAnnotations;
        private final net.bytebuddy.description.method.MethodDescription.InDefinedShape declaringMethod;
        private final int index;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final java.lang.Integer modifiers;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final java.lang.String name;
        private final int offset;
        private final net.bytebuddy.description.type.TypeDescription.Generic parameterType;

        public Latent(net.bytebuddy.description.method.MethodDescription.InDefinedShape r9, net.bytebuddy.description.method.ParameterDescription.Token r10, int r11, int r12) {
                r8 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r10.getType()
                net.bytebuddy.description.annotation.AnnotationList r3 = r10.getAnnotations()
                java.lang.String r4 = r10.getName()
                java.lang.Integer r5 = r10.getModifiers()
                r0 = r8
                r1 = r9
                r6 = r11
                r7 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public Latent(net.bytebuddy.description.method.MethodDescription.InDefinedShape r9, net.bytebuddy.description.type.TypeDescription.Generic r10, int r11, int r12) {
                r8 = this;
                java.util.List r3 = java.util.Collections.emptyList()
                java.lang.String r4 = net.bytebuddy.description.method.ParameterDescription.Token.NO_NAME
                java.lang.Integer r5 = net.bytebuddy.description.method.ParameterDescription.Token.NO_MODIFIERS
                r0 = r8
                r1 = r9
                r2 = r10
                r6 = r11
                r7 = r12
                r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public Latent(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDescription.Generic r2, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Integer r5, int r6, int r7) {
                r0 = this;
                r0.<init>()
                r0.declaringMethod = r1
                r0.parameterType = r2
                r0.declaredAnnotations = r3
                r0.name = r4
                r0.modifiers = r5
                r0.index = r6
                r0.offset = r7
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

        @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape getDeclaringMethod() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.declaringMethod
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
        public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getDeclaringMethod() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getDeclaringMethod()
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
                java.lang.Integer r0 = r1.modifiers
                if (r0 != 0) goto L9
                int r0 = super.getModifiers()
                goto Ld
            L9:
                int r0 = r0.intValue()
            Ld:
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                if (r0 != 0) goto L8
                java.lang.String r0 = super.getName()
            L8:
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.method.ParameterDescription
        public int getOffset() {
                r1 = this;
                int r0 = r1.offset
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.parameterType
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForAttachment r1 = net.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor.ForAttachment.of(r2)
                java.lang.Object r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription
        public boolean hasModifiers() {
                r1 = this;
                java.lang.Integer r0 = r1.modifiers
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithOptionalName
        public boolean isNamed() {
                r1 = this;
                java.lang.String r0 = r1.name
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }
    }

    public static class Token implements net.bytebuddy.description.ByteCodeElement.Token<net.bytebuddy.description.method.ParameterDescription.Token> {

        @net.bytebuddy.utility.nullability.AlwaysNull
        public static final java.lang.Integer NO_MODIFIERS = null;

        @net.bytebuddy.utility.nullability.AlwaysNull
        public static final java.lang.String NO_NAME = null;
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;
        private transient /* synthetic */ int hashCode;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final java.lang.Integer modifiers;

        @net.bytebuddy.utility.nullability.MaybeNull
        private final java.lang.String name;
        private final net.bytebuddy.description.type.TypeDescription.Generic type;

        public static class TypeList extends java.util.AbstractList<net.bytebuddy.description.method.ParameterDescription.Token> {
            private final java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> typeDescriptions;

            public TypeList(java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.typeDescriptions = r1
                    return
            }

            @Override // java.util.AbstractList, java.util.List
            public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                    r0 = this;
                    net.bytebuddy.description.method.ParameterDescription$Token r1 = r0.get(r1)
                    return r1
            }

            @Override // java.util.AbstractList, java.util.List
            public net.bytebuddy.description.method.ParameterDescription.Token get(int r3) {
                    r2 = this;
                    net.bytebuddy.description.method.ParameterDescription$Token r0 = new net.bytebuddy.description.method.ParameterDescription$Token
                    java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r1 = r2.typeDescriptions
                    java.lang.Object r3 = r1.get(r3)
                    net.bytebuddy.description.type.TypeDefinition r3 = (net.bytebuddy.description.type.TypeDefinition) r3
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                    r0.<init>(r3)
                    return r0
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                    r1 = this;
                    java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r0 = r1.typeDescriptions
                    int r0 = r0.size()
                    return r0
            }
        }

        static {
                return
        }

        public Token(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r1.<init>(r2, r0)
                return
        }

        public Token(net.bytebuddy.description.type.TypeDescription.Generic r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Integer r4) {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                r1.<init>(r2, r0, r3, r4)
                return
        }

        public Token(net.bytebuddy.description.type.TypeDescription.Generic r3, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r4) {
                r2 = this;
                java.lang.String r0 = net.bytebuddy.description.method.ParameterDescription.Token.NO_NAME
                java.lang.Integer r1 = net.bytebuddy.description.method.ParameterDescription.Token.NO_MODIFIERS
                r2.<init>(r3, r4, r0, r1)
                return
        }

        public Token(net.bytebuddy.description.type.TypeDescription.Generic r1, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Integer r4) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                r0.annotations = r2
                r0.name = r3
                r0.modifiers = r4
                return
        }

        @Override // net.bytebuddy.description.ByteCodeElement.Token
        public /* bridge */ /* synthetic */ net.bytebuddy.description.ByteCodeElement.Token accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor r1) {
                r0 = this;
                net.bytebuddy.description.method.ParameterDescription$Token r1 = r0.accept(r1)
                return r1
        }

        @Override // net.bytebuddy.description.ByteCodeElement.Token
        public net.bytebuddy.description.method.ParameterDescription.Token accept(net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r5) {
                r4 = this;
                net.bytebuddy.description.method.ParameterDescription$Token r0 = new net.bytebuddy.description.method.ParameterDescription$Token
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r4.type
                java.lang.Object r5 = r1.accept(r5)
                net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r4.annotations
                java.lang.String r2 = r4.name
                java.lang.Integer r3 = r4.modifiers
                r0.<init>(r5, r1, r2, r3)
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.description.method.ParameterDescription.Token
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.description.method.ParameterDescription$Token r5 = (net.bytebuddy.description.method.ParameterDescription.Token) r5
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r4.type
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.type
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L43
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r4.annotations
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3 = r5.annotations
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L43
                java.lang.String r1 = r4.name
                if (r1 == 0) goto L2d
                java.lang.String r3 = r5.name
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L43
                goto L31
            L2d:
                java.lang.String r1 = r5.name
                if (r1 != 0) goto L43
            L31:
                java.lang.Integer r1 = r4.modifiers
                if (r1 == 0) goto L3e
                java.lang.Integer r5 = r5.modifiers
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L43
                goto L44
            L3e:
                java.lang.Integer r5 = r5.modifiers
                if (r5 != 0) goto L43
                goto L44
            L43:
                r0 = r2
            L44:
                return r0
        }

        public net.bytebuddy.description.annotation.AnnotationList getAnnotations() {
                r2 = this;
                net.bytebuddy.description.annotation.AnnotationList$Explicit r0 = new net.bytebuddy.description.annotation.AnnotationList$Explicit
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                r0.<init>(r1)
                return r0
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.Integer getModifiers() {
                r1 = this;
                java.lang.Integer r0 = r1.modifiers
                return r0
        }

        @net.bytebuddy.utility.nullability.MaybeNull
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
                r3 = this;
                int r0 = r3.hashCode
                r1 = 0
                if (r0 == 0) goto L6
                goto L2d
            L6:
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.type
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r3.annotations
                int r2 = r2.hashCode()
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.String r2 = r3.name
                if (r2 == 0) goto L20
                int r2 = r2.hashCode()
                goto L21
            L20:
                r2 = r1
            L21:
                int r0 = r0 + r2
                int r0 = r0 * 31
                java.lang.Integer r2 = r3.modifiers
                if (r2 == 0) goto L2c
                int r1 = r2.hashCode()
            L2c:
                int r1 = r1 + r0
            L2d:
                if (r1 != 0) goto L32
                int r1 = r3.hashCode
                goto L34
            L32:
                r3.hashCode = r1
            L34:
                return r1
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ParameterDescription.Token{type="
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.type
                r0.append(r1)
                java.lang.String r1 = ", annotations="
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                r0.append(r1)
                java.lang.String r1 = ", name='"
                r0.append(r1)
                java.lang.String r1 = r2.name
                r0.append(r1)
                r1 = 39
                r0.append(r1)
                java.lang.String r1 = ", modifiers="
                r0.append(r1)
                java.lang.Integer r1 = r2.modifiers
                r0.append(r1)
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class TypeSubstituting extends net.bytebuddy.description.method.ParameterDescription.AbstractBase implements net.bytebuddy.description.method.ParameterDescription.InGenericShape {
        private final net.bytebuddy.description.method.MethodDescription.InGenericShape declaringMethod;
        private final net.bytebuddy.description.method.ParameterDescription parameterDescription;
        private final net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> visitor;

        public TypeSubstituting(net.bytebuddy.description.method.MethodDescription.InGenericShape r1, net.bytebuddy.description.method.ParameterDescription r2, net.bytebuddy.description.type.TypeDescription.Generic.Visitor<? extends net.bytebuddy.description.type.TypeDescription.Generic> r3) {
                r0 = this;
                r0.<init>()
                r0.declaringMethod = r1
                r0.parameterDescription = r2
                r0.visitor = r3
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
                r1 = this;
                net.bytebuddy.description.method.ParameterDescription r0 = r1.parameterDescription
                net.bytebuddy.description.ByteCodeElement$TypeDependant r0 = r0.asDefined()
                net.bytebuddy.description.method.ParameterDescription$InDefinedShape r0 = (net.bytebuddy.description.method.ParameterDescription.InDefinedShape) r0
                return r0
        }

        @Override // net.bytebuddy.description.annotation.AnnotationSource
        public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                r1 = this;
                net.bytebuddy.description.method.ParameterDescription r0 = r1.parameterDescription
                net.bytebuddy.description.annotation.AnnotationList r0 = r0.getDeclaredAnnotations()
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
        public net.bytebuddy.description.method.MethodDescription.InGenericShape getDeclaringMethod() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InGenericShape r0 = r1.declaringMethod
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription, net.bytebuddy.description.method.ParameterDescription.InDefinedShape
        public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getDeclaringMethod() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InGenericShape r0 = r1.getDeclaringMethod()
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription
        public int getIndex() {
                r1 = this;
                net.bytebuddy.description.method.ParameterDescription r0 = r1.parameterDescription
                int r0 = r0.getIndex()
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
                r1 = this;
                net.bytebuddy.description.method.ParameterDescription r0 = r1.parameterDescription
                int r0 = r0.getModifiers()
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.NamedElement.WithRuntimeName
        public java.lang.String getName() {
                r1 = this;
                net.bytebuddy.description.method.ParameterDescription r0 = r1.parameterDescription
                java.lang.String r0 = r0.getName()
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription.AbstractBase, net.bytebuddy.description.method.ParameterDescription
        public int getOffset() {
                r1 = this;
                net.bytebuddy.description.method.ParameterDescription r0 = r1.parameterDescription
                int r0 = r0.getOffset()
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription
        public net.bytebuddy.description.type.TypeDescription.Generic getType() {
                r2 = this;
                net.bytebuddy.description.method.ParameterDescription r0 = r2.parameterDescription
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor<? extends net.bytebuddy.description.type.TypeDescription$Generic> r1 = r2.visitor
                java.lang.Object r0 = r0.accept(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                return r0
        }

        @Override // net.bytebuddy.description.method.ParameterDescription
        public boolean hasModifiers() {
                r1 = this;
                net.bytebuddy.description.method.ParameterDescription r0 = r1.parameterDescription
                boolean r0 = r0.hasModifiers()
                return r0
        }

        @Override // net.bytebuddy.description.NamedElement.WithOptionalName
        public boolean isNamed() {
                r1 = this;
                net.bytebuddy.description.method.ParameterDescription r0 = r1.parameterDescription
                boolean r0 = r0.isNamed()
                return r0
        }
    }

    net.bytebuddy.description.method.MethodDescription getDeclaringMethod();

    int getIndex();

    int getOffset();

    net.bytebuddy.description.type.TypeDescription.Generic getType();

    boolean hasModifiers();
}
