package net.bytebuddy.dynamic.scaffold.inline;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodRebaseResolver {

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Default implements net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver {
        private final java.util.List<net.bytebuddy.dynamic.DynamicType> dynamicTypes;
        private final java.util.Map<net.bytebuddy.description.method.MethodDescription.InDefinedShape, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution> resolutions;

        public Default(java.util.Map<net.bytebuddy.description.method.MethodDescription.InDefinedShape, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution> r1, java.util.List<net.bytebuddy.dynamic.DynamicType> r2) {
                r0 = this;
                r0.<init>()
                r0.resolutions = r1
                r0.dynamicTypes = r2
                return
        }

        public static net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver make(net.bytebuddy.description.type.TypeDescription r6, java.util.Set<? extends net.bytebuddy.description.method.MethodDescription.SignatureToken> r7, net.bytebuddy.ClassFileVersion r8, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r9, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r10) {
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                net.bytebuddy.description.method.MethodList r1 = r6.getDeclaredMethods()
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
            Le:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L49
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r3
                net.bytebuddy.description.method.MethodDescription$SignatureToken r4 = r3.asSignatureToken()
                boolean r4 = r7.contains(r4)
                if (r4 == 0) goto Le
                boolean r4 = r3.isConstructor()
                if (r4 == 0) goto L41
                if (r2 != 0) goto L38
                net.bytebuddy.implementation.auxiliary.TrivialType r2 = net.bytebuddy.implementation.auxiliary.TrivialType.SIGNATURE_RELEVANT
                java.lang.String r4 = r9.name(r6, r2)
                net.bytebuddy.implementation.MethodAccessorFactory$Illegal r5 = net.bytebuddy.implementation.MethodAccessorFactory.Illegal.INSTANCE
                net.bytebuddy.dynamic.DynamicType r2 = r2.make(r4, r8, r5)
            L38:
                net.bytebuddy.description.type.TypeDescription r4 = r2.getTypeDescription()
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r4 = net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution.ForRebasedConstructor.of(r3, r4)
                goto L45
            L41:
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r4 = net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution.ForRebasedMethod.of(r6, r3, r10)
            L45:
                r0.put(r3, r4)
                goto Le
            L49:
                if (r2 != 0) goto L55
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Default r6 = new net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Default
                java.util.List r7 = java.util.Collections.emptyList()
                r6.<init>(r0, r7)
                goto L5e
            L55:
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Default r6 = new net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Default
                java.util.List r7 = java.util.Collections.singletonList(r2)
                r6.<init>(r0, r7)
            L5e:
                return r6
        }

        @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public java.util.Map<net.bytebuddy.description.method.MethodDescription.SignatureToken, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution> asTokenMap() {
                r4 = this;
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                java.util.Map<net.bytebuddy.description.method.MethodDescription$InDefinedShape, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution> r1 = r4.resolutions
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
            Lf:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r1.next()
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                java.lang.Object r3 = r2.getKey()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r3
                net.bytebuddy.description.method.MethodDescription$SignatureToken r3 = r3.asSignatureToken()
                java.lang.Object r2 = r2.getValue()
                r0.put(r3, r2)
                goto Lf
            L2d:
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
                java.util.Map<net.bytebuddy.description.method.MethodDescription$InDefinedShape, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution> r2 = r4.resolutions
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Default r5 = (net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Default) r5
                java.util.Map<net.bytebuddy.description.method.MethodDescription$InDefinedShape, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution> r3 = r5.resolutions
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.util.List<net.bytebuddy.dynamic.DynamicType> r2 = r4.dynamicTypes
                java.util.List<net.bytebuddy.dynamic.DynamicType> r5 = r5.dynamicTypes
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2b
                return r1
            L2b:
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public java.util.List<net.bytebuddy.dynamic.DynamicType> getAuxiliaryTypes() {
                r1 = this;
                java.util.List<net.bytebuddy.dynamic.DynamicType> r0 = r1.dynamicTypes
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.Map<net.bytebuddy.description.method.MethodDescription$InDefinedShape, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution> r1 = r2.resolutions
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.dynamic.DynamicType> r1 = r2.dynamicTypes
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                r1 = this;
                java.util.Map<net.bytebuddy.description.method.MethodDescription$InDefinedShape, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution> r0 = r1.resolutions
                java.lang.Object r0 = r0.get(r2)
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution r0 = (net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution) r0
                if (r0 != 0) goto Lf
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$Preserved r0 = new net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$Preserved
                r0.<init>(r2)
            Lf:
                return r0
        }
    }

    public enum Disabled extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled> implements net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver {
        private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled[] $VALUES = null;
        public static final net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled INSTANCE = null;

        static {
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Disabled r0 = new net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Disabled
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled.INSTANCE = r0
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Disabled[] r0 = new net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled[]{r0}
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled.$VALUES = r0
                return
        }

        Disabled(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Disabled> r0 = net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Disabled r1 = (net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled) r1
                return r1
        }

        public static net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled[] values() {
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Disabled[] r0 = net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Disabled[] r0 = (net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Disabled[]) r0
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public java.util.Map<net.bytebuddy.description.method.MethodDescription.SignatureToken, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution> asTokenMap() {
                r1 = this;
                java.util.Map r0 = java.util.Collections.emptyMap()
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public java.util.List<net.bytebuddy.dynamic.DynamicType> getAuxiliaryTypes() {
                r1 = this;
                java.util.List r0 = java.util.Collections.emptyList()
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$Preserved r0 = new net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$Preserved
                r0.<init>(r2)
                return r0
        }
    }

    public interface Resolution {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForRebasedConstructor implements net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution {
            private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
            private final net.bytebuddy.description.type.TypeDescription placeholderType;

            public static class RebasedConstructor extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase {
                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
                private final net.bytebuddy.description.type.TypeDescription placeholderType;

                public RebasedConstructor(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDescription r2) {
                        r0 = this;
                        r0.<init>()
                        r0.methodDescription = r1
                        r0.placeholderType = r2
                        return
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                        r0.<init>()
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                @javax.annotation.Nonnull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                @javax.annotation.Nonnull
                public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                @net.bytebuddy.utility.nullability.AlwaysNull
                public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.getExceptionTypes()
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.asRawTypes()
                        return r0
                }

                @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                public java.lang.String getInternalName() {
                        r1 = this;
                        java.lang.String r0 = "<init>"
                        return r0
                }

                @Override // net.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                        r1 = this;
                        r0 = 4098(0x1002, float:5.743E-42)
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
                public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                        r3 = this;
                        net.bytebuddy.description.method.ParameterList$Explicit$ForTypes r0 = new net.bytebuddy.description.method.ParameterList$Explicit$ForTypes
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r3.methodDescription
                        net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                        net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
                        net.bytebuddy.description.type.TypeDescription r2 = r3.placeholderType
                        java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r1, r2)
                        r0.<init>(r3, r1)
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                        r1 = this;
                        java.lang.Class r0 = java.lang.Void.TYPE
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
                        return r0
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                        r0.<init>()
                        return r0
                }
            }

            public ForRebasedConstructor(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDescription r2) {
                    r0 = this;
                    r0.<init>()
                    r0.methodDescription = r1
                    r0.placeholderType = r2
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution of(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.description.type.TypeDescription r3) {
                    net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$ForRebasedConstructor r0 = new net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$ForRebasedConstructor
                    net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$ForRebasedConstructor$RebasedConstructor r1 = new net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$ForRebasedConstructor$RebasedConstructor
                    r1.<init>(r2, r3)
                    r0.<init>(r1, r3)
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
                    net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$ForRebasedConstructor r5 = (net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution.ForRebasedConstructor) r5
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.methodDescription
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.description.type.TypeDescription r2 = r4.placeholderType
                    net.bytebuddy.description.type.TypeDescription r5 = r5.placeholderType
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L2b
                    return r1
                L2b:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public net.bytebuddy.description.type.TypeList getAppendedParameters() {
                    r4 = this;
                    net.bytebuddy.description.type.TypeList$Explicit r0 = new net.bytebuddy.description.type.TypeList$Explicit
                    net.bytebuddy.description.type.TypeDescription r1 = r4.placeholderType
                    r2 = 1
                    net.bytebuddy.description.type.TypeDescription[] r2 = new net.bytebuddy.description.type.TypeDescription[r2]
                    r3 = 0
                    r2[r3] = r1
                    r0.<init>(r2)
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape getResolvedMethod() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.placeholderType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public boolean isRebased() {
                    r1 = this;
                    r0 = 1
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForRebasedMethod implements net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution {
            private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;

            public static class RebasedMethod extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase {
                private final net.bytebuddy.description.type.TypeDescription instrumentedType;
                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
                private final net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer methodNameTransformer;

                public RebasedMethod(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r3) {
                        r0 = this;
                        r0.<init>()
                        r0.instrumentedType = r1
                        r0.methodDescription = r2
                        r0.methodNameTransformer = r3
                        return
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                        r0.<init>()
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                @javax.annotation.Nonnull
                public /* bridge */ /* synthetic */ net.bytebuddy.description.type.TypeDefinition getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.getDeclaringType()
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.DeclaredByType.WithMandatoryDeclaration, net.bytebuddy.description.DeclaredByType
                @javax.annotation.Nonnull
                public net.bytebuddy.description.type.TypeDescription getDeclaringType() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                        net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                @net.bytebuddy.utility.nullability.AlwaysNull
                public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.getExceptionTypes()
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.asRawTypes()
                        return r0
                }

                @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                public java.lang.String getInternalName() {
                        r2 = this;
                        net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r0 = r2.methodNameTransformer
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.methodDescription
                        java.lang.String r0 = r0.transform(r1)
                        return r0
                }

                @Override // net.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                        r3 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r3.methodDescription
                        boolean r0 = r0.isStatic()
                        r1 = 0
                        if (r0 == 0) goto Lc
                        r0 = 8
                        goto Ld
                    Lc:
                        r0 = r1
                    Ld:
                        r0 = r0 | 4096(0x1000, float:5.74E-42)
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r3.methodDescription
                        boolean r2 = r2.isNative()
                        if (r2 == 0) goto L19
                        r1 = 272(0x110, float:3.81E-43)
                    L19:
                        r0 = r0 | r1
                        net.bytebuddy.description.type.TypeDescription r1 = r3.instrumentedType
                        boolean r1 = r1.isInterface()
                        if (r1 == 0) goto L2c
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r3.methodDescription
                        boolean r1 = r1.isNative()
                        if (r1 != 0) goto L2c
                        r1 = 1
                        goto L2d
                    L2c:
                        r1 = 2
                    L2d:
                        r0 = r0 | r1
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
                public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                        r2 = this;
                        net.bytebuddy.description.method.ParameterList$Explicit$ForTypes r0 = new net.bytebuddy.description.method.ParameterList$Explicit$ForTypes
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.methodDescription
                        net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.asRawTypes()
                        r0.<init>(r2, r1)
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asRawType()
                        return r0
                }

                @Override // net.bytebuddy.description.TypeVariableSource
                public net.bytebuddy.description.type.TypeList.Generic getTypeVariables() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                        r0.<init>()
                        return r0
                }
            }

            public ForRebasedMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                    r0 = this;
                    r0.<init>()
                    r0.methodDescription = r1
                    return
            }

            public static net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution of(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription.InDefinedShape r3, net.bytebuddy.dynamic.scaffold.inline.MethodNameTransformer r4) {
                    net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$ForRebasedMethod r0 = new net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$ForRebasedMethod
                    net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$ForRebasedMethod$RebasedMethod r1 = new net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$ForRebasedMethod$RebasedMethod
                    r1.<init>(r2, r3, r4)
                    r0.<init>(r1)
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
                    net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$ForRebasedMethod r5 = (net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution.ForRebasedMethod) r5
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.methodDescription
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public net.bytebuddy.description.type.TypeList getAppendedParameters() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeList$Empty r0 = new net.bytebuddy.description.type.TypeList$Empty
                    r0.<init>()
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape getResolvedMethod() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
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
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public boolean isRebased() {
                    r1 = this;
                    r0 = 1
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Preserved implements net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution {
            private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;

            public Preserved(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                    r0 = this;
                    r0.<init>()
                    r0.methodDescription = r1
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
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.methodDescription
                    net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver$Resolution$Preserved r5 = (net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution.Preserved) r5
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.methodDescription
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public net.bytebuddy.description.type.TypeList getAppendedParameters() {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Cannot process additional parameters for non-rebased method: "
                    r1.append(r2)
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r3.methodDescription
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape getResolvedMethod() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
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
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public boolean isRebased() {
                    r1 = this;
                    r0 = 0
                    return r0
            }
        }

        net.bytebuddy.description.type.TypeList getAppendedParameters();

        net.bytebuddy.description.method.MethodDescription.InDefinedShape getResolvedMethod();

        boolean isRebased();
    }

    java.util.Map<net.bytebuddy.description.method.MethodDescription.SignatureToken, net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution> asTokenMap();

    java.util.List<net.bytebuddy.dynamic.DynamicType> getAuxiliaryTypes();

    net.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution resolve(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1);
}
