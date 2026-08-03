package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
public interface Implementation extends net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable {

    /* JADX INFO: renamed from: net.bytebuddy.implementation.Implementation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public interface Composable extends net.bytebuddy.implementation.Implementation {
        net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r1);

        net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r1);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements net.bytebuddy.implementation.Implementation {
        private final java.util.List<net.bytebuddy.implementation.Implementation> implementations;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Composable implements net.bytebuddy.implementation.Implementation.Composable {
            private final net.bytebuddy.implementation.Implementation.Composable composable;
            private final java.util.List<net.bytebuddy.implementation.Implementation> implementations;

            public Composable(java.util.List<? extends net.bytebuddy.implementation.Implementation> r4, net.bytebuddy.implementation.Implementation.Composable r5) {
                    r3 = this;
                    r3.<init>()
                    java.util.ArrayList r0 = new java.util.ArrayList
                    r0.<init>()
                    r3.implementations = r0
                    java.util.Iterator r4 = r4.iterator()
                Le:
                    boolean r0 = r4.hasNext()
                    if (r0 == 0) goto L45
                    java.lang.Object r0 = r4.next()
                    net.bytebuddy.implementation.Implementation r0 = (net.bytebuddy.implementation.Implementation) r0
                    boolean r1 = r0 instanceof net.bytebuddy.implementation.Implementation.Compound.Composable
                    if (r1 == 0) goto L2f
                    java.util.List<net.bytebuddy.implementation.Implementation> r1 = r3.implementations
                    net.bytebuddy.implementation.Implementation$Compound$Composable r0 = (net.bytebuddy.implementation.Implementation.Compound.Composable) r0
                    java.util.List<net.bytebuddy.implementation.Implementation> r2 = r0.implementations
                    r1.addAll(r2)
                    java.util.List<net.bytebuddy.implementation.Implementation> r1 = r3.implementations
                    net.bytebuddy.implementation.Implementation$Composable r0 = r0.composable
                    r1.add(r0)
                    goto Le
                L2f:
                    boolean r1 = r0 instanceof net.bytebuddy.implementation.Implementation.Compound
                    if (r1 == 0) goto L3f
                    java.util.List<net.bytebuddy.implementation.Implementation> r1 = r3.implementations
                    net.bytebuddy.implementation.Implementation$Compound r0 = (net.bytebuddy.implementation.Implementation.Compound) r0
                    java.util.List r0 = net.bytebuddy.implementation.Implementation.Compound.access$400(r0)
                    r1.addAll(r0)
                    goto Le
                L3f:
                    java.util.List<net.bytebuddy.implementation.Implementation> r1 = r3.implementations
                    r1.add(r0)
                    goto Le
                L45:
                    boolean r4 = r5 instanceof net.bytebuddy.implementation.Implementation.Compound.Composable
                    if (r4 == 0) goto L57
                    java.util.List<net.bytebuddy.implementation.Implementation> r4 = r3.implementations
                    net.bytebuddy.implementation.Implementation$Compound$Composable r5 = (net.bytebuddy.implementation.Implementation.Compound.Composable) r5
                    java.util.List<net.bytebuddy.implementation.Implementation> r0 = r5.implementations
                    r4.addAll(r0)
                    net.bytebuddy.implementation.Implementation$Composable r4 = r5.composable
                    r3.composable = r4
                    goto L59
                L57:
                    r3.composable = r5
                L59:
                    return
            }

            public Composable(net.bytebuddy.implementation.Implementation r1, net.bytebuddy.implementation.Implementation.Composable r2) {
                    r0 = this;
                    java.util.List r1 = java.util.Collections.singletonList(r1)
                    r0.<init>(r1, r2)
                    return
            }

            public static /* synthetic */ java.util.List access$200(net.bytebuddy.implementation.Implementation.Compound.Composable r0) {
                    java.util.List<net.bytebuddy.implementation.Implementation> r0 = r0.implementations
                    return r0
            }

            public static /* synthetic */ net.bytebuddy.implementation.Implementation.Composable access$300(net.bytebuddy.implementation.Implementation.Compound.Composable r0) {
                    net.bytebuddy.implementation.Implementation$Composable r0 = r0.composable
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r4) {
                    r3 = this;
                    net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
                    java.util.List<net.bytebuddy.implementation.Implementation> r1 = r3.implementations
                    net.bytebuddy.implementation.Implementation$Composable r2 = r3.composable
                    net.bytebuddy.implementation.Implementation$Composable r4 = r2.andThen(r4)
                    r0.<init>(r1, r4)
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Composable
            public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r4) {
                    r3 = this;
                    net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
                    java.util.List<net.bytebuddy.implementation.Implementation> r1 = r3.implementations
                    net.bytebuddy.implementation.Implementation$Composable r2 = r3.composable
                    net.bytebuddy.implementation.Implementation r4 = r2.andThen(r4)
                    java.util.List r4 = net.bytebuddy.utility.CompoundList.of(r1, r4)
                    r0.<init>(r4)
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r6) {
                    r5 = this;
                    java.util.List<net.bytebuddy.implementation.Implementation> r0 = r5.implementations
                    int r0 = r0.size()
                    int r0 = r0 + 1
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r0]
                    java.util.List<net.bytebuddy.implementation.Implementation> r1 = r5.implementations
                    java.util.Iterator r1 = r1.iterator()
                    r2 = 0
                L11:
                    boolean r3 = r1.hasNext()
                    if (r3 == 0) goto L27
                    java.lang.Object r3 = r1.next()
                    net.bytebuddy.implementation.Implementation r3 = (net.bytebuddy.implementation.Implementation) r3
                    int r4 = r2 + 1
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender r3 = r3.appender(r6)
                    r0[r2] = r3
                    r2 = r4
                    goto L11
                L27:
                    net.bytebuddy.implementation.Implementation$Composable r1 = r5.composable
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender r6 = r1.appender(r6)
                    r0[r2] = r6
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound r6 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound
                    r6.<init>(r0)
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
                    net.bytebuddy.implementation.Implementation$Composable r2 = r4.composable
                    net.bytebuddy.implementation.Implementation$Compound$Composable r5 = (net.bytebuddy.implementation.Implementation.Compound.Composable) r5
                    net.bytebuddy.implementation.Implementation$Composable r3 = r5.composable
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    java.util.List<net.bytebuddy.implementation.Implementation> r2 = r4.implementations
                    java.util.List<net.bytebuddy.implementation.Implementation> r5 = r5.implementations
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
                    net.bytebuddy.implementation.Implementation$Composable r1 = r2.composable
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<net.bytebuddy.implementation.Implementation> r1 = r2.implementations
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r3) {
                    r2 = this;
                    java.util.List<net.bytebuddy.implementation.Implementation> r0 = r2.implementations
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L17
                    java.lang.Object r1 = r0.next()
                    net.bytebuddy.implementation.Implementation r1 = (net.bytebuddy.implementation.Implementation) r1
                    net.bytebuddy.dynamic.scaffold.InstrumentedType r3 = r1.prepare(r3)
                    goto L6
                L17:
                    net.bytebuddy.implementation.Implementation$Composable r0 = r2.composable
                    net.bytebuddy.dynamic.scaffold.InstrumentedType r3 = r0.prepare(r3)
                    return r3
            }
        }

        public Compound(java.util.List<? extends net.bytebuddy.implementation.Implementation> r4) {
                r3 = this;
                r3.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r3.implementations = r0
                java.util.Iterator r4 = r4.iterator()
            Le:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L47
                java.lang.Object r0 = r4.next()
                net.bytebuddy.implementation.Implementation r0 = (net.bytebuddy.implementation.Implementation) r0
                boolean r1 = r0 instanceof net.bytebuddy.implementation.Implementation.Compound.Composable
                if (r1 == 0) goto L33
                java.util.List<net.bytebuddy.implementation.Implementation> r1 = r3.implementations
                net.bytebuddy.implementation.Implementation$Compound$Composable r0 = (net.bytebuddy.implementation.Implementation.Compound.Composable) r0
                java.util.List r2 = net.bytebuddy.implementation.Implementation.Compound.Composable.access$200(r0)
                r1.addAll(r2)
                java.util.List<net.bytebuddy.implementation.Implementation> r1 = r3.implementations
                net.bytebuddy.implementation.Implementation$Composable r0 = net.bytebuddy.implementation.Implementation.Compound.Composable.access$300(r0)
                r1.add(r0)
                goto Le
            L33:
                boolean r1 = r0 instanceof net.bytebuddy.implementation.Implementation.Compound
                if (r1 == 0) goto L41
                java.util.List<net.bytebuddy.implementation.Implementation> r1 = r3.implementations
                net.bytebuddy.implementation.Implementation$Compound r0 = (net.bytebuddy.implementation.Implementation.Compound) r0
                java.util.List<net.bytebuddy.implementation.Implementation> r0 = r0.implementations
                r1.addAll(r0)
                goto Le
            L41:
                java.util.List<net.bytebuddy.implementation.Implementation> r1 = r3.implementations
                r1.add(r0)
                goto Le
            L47:
                return
        }

        public Compound(net.bytebuddy.implementation.Implementation... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ java.util.List access$400(net.bytebuddy.implementation.Implementation.Compound r0) {
                java.util.List<net.bytebuddy.implementation.Implementation> r0 = r0.implementations
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r6) {
                r5 = this;
                java.util.List<net.bytebuddy.implementation.Implementation> r0 = r5.implementations
                int r0 = r0.size()
                net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r0]
                java.util.List<net.bytebuddy.implementation.Implementation> r1 = r5.implementations
                java.util.Iterator r1 = r1.iterator()
                r2 = 0
            Lf:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L25
                java.lang.Object r3 = r1.next()
                net.bytebuddy.implementation.Implementation r3 = (net.bytebuddy.implementation.Implementation) r3
                int r4 = r2 + 1
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r3 = r3.appender(r6)
                r0[r2] = r3
                r2 = r4
                goto Lf
            L25:
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound r6 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound
                r6.<init>(r0)
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
                java.util.List<net.bytebuddy.implementation.Implementation> r2 = r4.implementations
                net.bytebuddy.implementation.Implementation$Compound r5 = (net.bytebuddy.implementation.Implementation.Compound) r5
                java.util.List<net.bytebuddy.implementation.Implementation> r5 = r5.implementations
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
                java.util.List<net.bytebuddy.implementation.Implementation> r1 = r2.implementations
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r3) {
                r2 = this;
                java.util.List<net.bytebuddy.implementation.Implementation> r0 = r2.implementations
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L17
                java.lang.Object r1 = r0.next()
                net.bytebuddy.implementation.Implementation r1 = (net.bytebuddy.implementation.Implementation) r1
                net.bytebuddy.dynamic.scaffold.InstrumentedType r3 = r1.prepare(r3)
                goto L6
            L17:
                return r3
        }
    }

    public interface Context extends net.bytebuddy.implementation.MethodAccessorFactory {

        public static class Default extends net.bytebuddy.implementation.Implementation.Context.ExtractableView.AbstractBase {
            public static final java.lang.String ACCESSOR_METHOD_SUFFIX = "accessor";
            public static final java.lang.String FIELD_CACHE_PREFIX = "cachedValue";
            private final net.bytebuddy.ClassFileVersion auxiliaryClassFileVersion;
            private final net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy auxiliaryTypeNamingStrategy;
            private final java.util.Map<net.bytebuddy.implementation.auxiliary.AuxiliaryType, net.bytebuddy.dynamic.DynamicType> auxiliaryTypes;
            private boolean fieldCacheCanAppendEntries;
            private final java.util.Map<net.bytebuddy.implementation.Implementation.SpecialMethodInvocation, net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord> registeredAccessorMethods;
            private final java.util.Map<net.bytebuddy.implementation.Implementation.Context.Default.FieldCacheEntry, net.bytebuddy.description.field.FieldDescription.InDefinedShape> registeredFieldCacheEntries;
            private final java.util.Set<net.bytebuddy.description.field.FieldDescription.InDefinedShape> registeredFieldCacheFields;
            private final java.util.Map<net.bytebuddy.description.field.FieldDescription, net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord> registeredGetters;
            private final java.util.Map<net.bytebuddy.description.field.FieldDescription, net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord> registeredSetters;
            private final java.lang.String suffix;
            private final net.bytebuddy.dynamic.scaffold.TypeInitializer typeInitializer;

            public static abstract class AbstractPropertyAccessorMethod extends net.bytebuddy.description.method.MethodDescription.InDefinedShape.AbstractBase {
                public AbstractPropertyAccessorMethod() {
                        r0 = this;
                        r0.<init>()
                        return
                }

                public abstract int getBaseModifiers();

                @Override // net.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                        r2 = this;
                        int r0 = r2.getBaseModifiers()
                        r0 = r0 | 4096(0x1000, float:5.74E-42)
                        net.bytebuddy.description.type.TypeDescription r1 = r2.getDeclaringType()
                        boolean r1 = r1.isInterface()
                        if (r1 == 0) goto L12
                        r1 = 1
                        goto L14
                    L12:
                        r1 = 16
                    L14:
                        r0 = r0 | r1
                        return r0
                }
            }

            public static class AccessorMethod extends net.bytebuddy.implementation.Implementation.Context.Default.AbstractPropertyAccessorMethod {
                private final net.bytebuddy.description.type.TypeDescription instrumentedType;
                private final net.bytebuddy.description.method.MethodDescription methodDescription;
                private final java.lang.String name;

                public AccessorMethod(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.description.type.TypeDescription r4, java.lang.String r5) {
                        r1 = this;
                        r1.<init>()
                        r1.instrumentedType = r2
                        r1.methodDescription = r3
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = r3.getInternalName()
                        r2.append(r3)
                        java.lang.String r3 = "$"
                        r2.append(r3)
                        java.lang.String r0 = "accessor"
                        r2.append(r0)
                        r2.append(r3)
                        r2.append(r5)
                        boolean r5 = r4.isInterface()
                        if (r5 == 0) goto L41
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>()
                        r5.append(r3)
                        int r3 = r4.hashCode()
                        java.lang.String r3 = net.bytebuddy.utility.RandomString.hashOf(r3)
                        r5.append(r3)
                        java.lang.String r3 = r5.toString()
                        goto L43
                    L41:
                        java.lang.String r3 = ""
                    L43:
                        r2.append(r3)
                        java.lang.String r2 = r2.toString()
                        r1.name = r2
                        return
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.AbstractPropertyAccessorMethod
                public int getBaseModifiers() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                        boolean r0 = r0.isStatic()
                        if (r0 == 0) goto Lb
                        r0 = 8
                        goto Lc
                    Lb:
                        r0 = 0
                    Lc:
                        return r0
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
                        net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.getExceptionTypes()
                        net.bytebuddy.description.type.TypeList$Generic r0 = r0.asRawTypes()
                        return r0
                }

                @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                public java.lang.String getInternalName() {
                        r1 = this;
                        java.lang.String r0 = r1.name
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
                public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                        r2 = this;
                        net.bytebuddy.description.method.ParameterList$Explicit$ForTypes r0 = new net.bytebuddy.description.method.ParameterList$Explicit$ForTypes
                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                        net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.asRawTypes()
                        r0.<init>(r2, r1)
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
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

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class AccessorMethodDelegation extends net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord {
                private final net.bytebuddy.implementation.bytecode.StackManipulation accessorMethodInvocation;

                private AccessorMethodDelegation(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.modifier.Visibility r2, net.bytebuddy.implementation.bytecode.StackManipulation r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        r0.accessorMethodInvocation = r3
                        return
                }

                public AccessorMethodDelegation(net.bytebuddy.description.type.TypeDescription r4, java.lang.String r5, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r6, net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r7) {
                        r3 = this;
                        net.bytebuddy.implementation.Implementation$Context$Default$AccessorMethod r0 = new net.bytebuddy.implementation.Implementation$Context$Default$AccessorMethod
                        net.bytebuddy.description.method.MethodDescription r1 = r7.getMethodDescription()
                        net.bytebuddy.description.type.TypeDescription r2 = r7.getTypeDescription()
                        r0.<init>(r4, r1, r2, r5)
                        net.bytebuddy.description.modifier.Visibility r4 = r6.getVisibility()
                        r3.<init>(r0, r4, r7)
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                        r6 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r9)
                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.prependThisReference()
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r6.accessorMethodInvocation
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r9.getReturnType()
                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r3)
                        r4 = 3
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                        r5 = 0
                        r4[r5] = r1
                        r1 = 1
                        r4[r1] = r2
                        r1 = 2
                        r4[r1] = r3
                        r0.<init>(r4)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r0.apply(r7, r8)
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r8 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                        int r7 = r7.getMaximalSize()
                        int r9 = r9.getStackSize()
                        r8.<init>(r7, r9)
                        return r8
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
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
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.accessorMethodInvocation
                        net.bytebuddy.implementation.Implementation$Context$Default$AccessorMethodDelegation r5 = (net.bytebuddy.implementation.Implementation.Context.Default.AccessorMethodDelegation) r5
                        net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.accessorMethodInvocation
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L27
                        return r1
                    L27:
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.accessorMethodInvocation
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord with(net.bytebuddy.implementation.MethodAccessorFactory.AccessType r4) {
                        r3 = this;
                        net.bytebuddy.implementation.Implementation$Context$Default$AccessorMethodDelegation r0 = new net.bytebuddy.implementation.Implementation$Context$Default$AccessorMethodDelegation
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r3.methodDescription
                        net.bytebuddy.description.modifier.Visibility r2 = r3.visibility
                        net.bytebuddy.description.modifier.Visibility r4 = r4.getVisibility()
                        net.bytebuddy.description.modifier.Visibility r4 = r2.expandTo(r4)
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r3.accessorMethodInvocation
                        r0.<init>(r1, r4, r2)
                        return r0
                }
            }

            public static class CacheValueField extends net.bytebuddy.description.field.FieldDescription.InDefinedShape.AbstractBase {
                private final net.bytebuddy.description.type.TypeDescription.Generic fieldType;
                private final net.bytebuddy.description.type.TypeDescription instrumentedType;
                private final java.lang.String name;

                public CacheValueField(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription.Generic r2, java.lang.String r3, int r4) {
                        r0 = this;
                        r0.<init>()
                        r0.instrumentedType = r1
                        r0.fieldType = r2
                        java.lang.StringBuilder r1 = new java.lang.StringBuilder
                        r1.<init>()
                        java.lang.String r2 = "cachedValue$"
                        r1.append(r2)
                        r1.append(r3)
                        java.lang.String r2 = "$"
                        r1.append(r2)
                        java.lang.String r2 = net.bytebuddy.utility.RandomString.hashOf(r4)
                        r1.append(r2)
                        java.lang.String r1 = r1.toString()
                        r0.name = r1
                        return
                }

                @Override // net.bytebuddy.description.annotation.AnnotationSource
                public net.bytebuddy.description.annotation.AnnotationList getDeclaredAnnotations() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationList$Empty r0 = new net.bytebuddy.description.annotation.AnnotationList$Empty
                        r0.<init>()
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
                        net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                        return r0
                }

                @Override // net.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                        boolean r0 = r0.isInterface()
                        if (r0 == 0) goto La
                        r0 = 1
                        goto Lb
                    La:
                        r0 = 2
                    Lb:
                        r0 = r0 | 4120(0x1018, float:5.773E-42)
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
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.fieldType
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static abstract class DelegationRecord extends net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.ForDefinedMethod implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
                protected final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
                protected final net.bytebuddy.description.modifier.Visibility visibility;

                public DelegationRecord(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.modifier.Visibility r2) {
                        r0 = this;
                        r0.<init>()
                        r0.methodDescription = r1
                        r0.visibility = r2
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyAttributes(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r2) {
                        r0 = this;
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyBody(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                        r0 = this;
                        r1.visitCode()
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = r0.applyCode(r1, r2)
                        int r3 = r2.getOperandStackSize()
                        int r2 = r2.getLocalVariableSize()
                        r1.visitMaxs(r3, r2)
                        return
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size applyCode(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getMethod()
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = r1.apply(r2, r3, r0)
                        return r2
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public void applyHead(net.bytebuddy.jar.asm.MethodVisitor r1) {
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
                        net.bytebuddy.description.modifier.Visibility r2 = r4.visibility
                        net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord r5 = (net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord) r5
                        net.bytebuddy.description.modifier.Visibility r3 = r5.visibility
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.methodDescription
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.methodDescription
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L2b
                        return r1
                    L2b:
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.description.method.MethodDescription.InDefinedShape getMethod() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public /* bridge */ /* synthetic */ net.bytebuddy.description.method.MethodDescription getMethod() {
                        r1 = this;
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.getMethod()
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort getSort() {
                        r1 = this;
                        net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort r0 = net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record.Sort.IMPLEMENTED
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.description.modifier.Visibility getVisibility() {
                        r1 = this;
                        net.bytebuddy.description.modifier.Visibility r0 = r1.visibility
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
                        net.bytebuddy.description.modifier.Visibility r1 = r2.visibility
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record
                public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record prepend(net.bytebuddy.implementation.bytecode.ByteCodeAppender r3) {
                        r2 = this;
                        java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Cannot prepend code to a delegation for "
                        r0.append(r1)
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.methodDescription
                        r0.append(r1)
                        java.lang.String r0 = r0.toString()
                        r3.<init>(r0)
                        throw r3
                }

                public abstract net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord with(net.bytebuddy.implementation.MethodAccessorFactory.AccessType r1);
            }

            public enum Factory extends java.lang.Enum<net.bytebuddy.implementation.Implementation.Context.Default.Factory> implements net.bytebuddy.implementation.Implementation.Context.Factory {
                private static final /* synthetic */ net.bytebuddy.implementation.Implementation.Context.Default.Factory[] $VALUES = null;
                public static final net.bytebuddy.implementation.Implementation.Context.Default.Factory INSTANCE = null;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class WithFixedSuffix implements net.bytebuddy.implementation.Implementation.Context.Factory {
                    private final java.lang.String suffix;

                    public WithFixedSuffix(java.lang.String r1) {
                            r0 = this;
                            r0.<init>()
                            r0.suffix = r1
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
                            java.lang.String r2 = r4.suffix
                            net.bytebuddy.implementation.Implementation$Context$Default$Factory$WithFixedSuffix r5 = (net.bytebuddy.implementation.Implementation.Context.Default.Factory.WithFixedSuffix) r5
                            java.lang.String r5 = r5.suffix
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
                            java.lang.String r1 = r2.suffix
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.Implementation.Context.Factory
                    @java.lang.Deprecated
                    public net.bytebuddy.implementation.Implementation.Context.ExtractableView make(net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r10, net.bytebuddy.dynamic.scaffold.TypeInitializer r11, net.bytebuddy.ClassFileVersion r12, net.bytebuddy.ClassFileVersion r13) {
                            r8 = this;
                            net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V6
                            boolean r0 = r12.isAtLeast(r0)
                            if (r0 == 0) goto Lc
                            net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.GENERATE
                        La:
                            r7 = r0
                            goto Lf
                        Lc:
                            net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.DISABLED
                            goto La
                        Lf:
                            r1 = r8
                            r2 = r9
                            r3 = r10
                            r4 = r11
                            r5 = r12
                            r6 = r13
                            net.bytebuddy.implementation.Implementation$Context$ExtractableView r9 = r1.make(r2, r3, r4, r5, r6, r7)
                            return r9
                    }

                    @Override // net.bytebuddy.implementation.Implementation.Context.Factory
                    public net.bytebuddy.implementation.Implementation.Context.ExtractableView make(net.bytebuddy.description.type.TypeDescription r10, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r11, net.bytebuddy.dynamic.scaffold.TypeInitializer r12, net.bytebuddy.ClassFileVersion r13, net.bytebuddy.ClassFileVersion r14, net.bytebuddy.implementation.Implementation.Context.FrameGeneration r15) {
                            r9 = this;
                            net.bytebuddy.implementation.Implementation$Context$Default r8 = new net.bytebuddy.implementation.Implementation$Context$Default
                            java.lang.String r7 = r9.suffix
                            r0 = r8
                            r1 = r10
                            r2 = r13
                            r3 = r11
                            r4 = r12
                            r5 = r14
                            r6 = r15
                            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                            return r8
                    }
                }

                static {
                        net.bytebuddy.implementation.Implementation$Context$Default$Factory r0 = new net.bytebuddy.implementation.Implementation$Context$Default$Factory
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.Implementation.Context.Default.Factory.INSTANCE = r0
                        net.bytebuddy.implementation.Implementation$Context$Default$Factory[] r0 = new net.bytebuddy.implementation.Implementation.Context.Default.Factory[]{r0}
                        net.bytebuddy.implementation.Implementation.Context.Default.Factory.$VALUES = r0
                        return
                }

                Factory(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.Implementation.Context.Default.Factory valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.Implementation$Context$Default$Factory> r0 = net.bytebuddy.implementation.Implementation.Context.Default.Factory.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.Implementation$Context$Default$Factory r1 = (net.bytebuddy.implementation.Implementation.Context.Default.Factory) r1
                        return r1
                }

                public static net.bytebuddy.implementation.Implementation.Context.Default.Factory[] values() {
                        net.bytebuddy.implementation.Implementation$Context$Default$Factory[] r0 = net.bytebuddy.implementation.Implementation.Context.Default.Factory.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.Implementation$Context$Default$Factory[] r0 = (net.bytebuddy.implementation.Implementation.Context.Default.Factory[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Factory
                @java.lang.Deprecated
                public net.bytebuddy.implementation.Implementation.Context.ExtractableView make(net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r10, net.bytebuddy.dynamic.scaffold.TypeInitializer r11, net.bytebuddy.ClassFileVersion r12, net.bytebuddy.ClassFileVersion r13) {
                        r8 = this;
                        net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V6
                        boolean r0 = r12.isAtLeast(r0)
                        if (r0 == 0) goto Lc
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.GENERATE
                    La:
                        r7 = r0
                        goto Lf
                    Lc:
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.DISABLED
                        goto La
                    Lf:
                        r1 = r8
                        r2 = r9
                        r3 = r10
                        r4 = r11
                        r5 = r12
                        r6 = r13
                        net.bytebuddy.implementation.Implementation$Context$ExtractableView r9 = r1.make(r2, r3, r4, r5, r6, r7)
                        return r9
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Factory
                public net.bytebuddy.implementation.Implementation.Context.ExtractableView make(net.bytebuddy.description.type.TypeDescription r10, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r11, net.bytebuddy.dynamic.scaffold.TypeInitializer r12, net.bytebuddy.ClassFileVersion r13, net.bytebuddy.ClassFileVersion r14, net.bytebuddy.implementation.Implementation.Context.FrameGeneration r15) {
                        r9 = this;
                        net.bytebuddy.implementation.Implementation$Context$Default r8 = new net.bytebuddy.implementation.Implementation$Context$Default
                        java.lang.String r7 = net.bytebuddy.utility.RandomString.make()
                        r0 = r8
                        r1 = r10
                        r2 = r13
                        r3 = r11
                        r4 = r12
                        r5 = r14
                        r6 = r15
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                        return r8
                }
            }

            public static class FieldCacheEntry implements net.bytebuddy.implementation.bytecode.StackManipulation {
                private final net.bytebuddy.description.type.TypeDescription fieldType;
                private final net.bytebuddy.implementation.bytecode.StackManipulation fieldValue;

                public FieldCacheEntry(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription r2) {
                        r0 = this;
                        r0.<init>()
                        r0.fieldValue = r1
                        r0.fieldType = r2
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                        r1 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.fieldValue
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r0.apply(r2, r3)
                        return r2
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                        r4 = this;
                        r0 = 1
                        if (r4 != r5) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r5 == 0) goto L2b
                        java.lang.Class r2 = r4.getClass()
                        java.lang.Class r3 = r5.getClass()
                        if (r2 == r3) goto L12
                        goto L2b
                    L12:
                        net.bytebuddy.implementation.Implementation$Context$Default$FieldCacheEntry r5 = (net.bytebuddy.implementation.Implementation.Context.Default.FieldCacheEntry) r5
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.fieldValue
                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.fieldValue
                        boolean r2 = r2.equals(r3)
                        if (r2 == 0) goto L29
                        net.bytebuddy.description.type.TypeDescription r2 = r4.fieldType
                        net.bytebuddy.description.type.TypeDescription r5 = r5.fieldType
                        boolean r5 = r2.equals(r5)
                        if (r5 == 0) goto L29
                        goto L2a
                    L29:
                        r0 = r1
                    L2a:
                        return r0
                    L2b:
                        return r1
                }

                public net.bytebuddy.description.type.TypeDescription getFieldType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.fieldType
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.fieldValue
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription r1 = r2.fieldType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.bytecode.StackManipulation
                public boolean isValid() {
                        r1 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.fieldValue
                        boolean r0 = r0.isValid()
                        return r0
                }

                public net.bytebuddy.implementation.bytecode.ByteCodeAppender storeIn(net.bytebuddy.description.field.FieldDescription r4) {
                        r3 = this;
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                        net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                        net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.write()
                        r1 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r1 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                        r2 = 0
                        r1[r2] = r3
                        r2 = 1
                        r1[r2] = r4
                        r0.<init>(r1)
                        return r0
                }
            }

            public static class FieldGetter extends net.bytebuddy.implementation.Implementation.Context.Default.AbstractPropertyAccessorMethod {
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;
                private final net.bytebuddy.description.type.TypeDescription instrumentedType;
                private final java.lang.String name;

                public FieldGetter(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.field.FieldDescription r3, java.lang.String r4) {
                        r1 = this;
                        r1.<init>()
                        r1.instrumentedType = r2
                        r1.fieldDescription = r3
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = r3.getName()
                        r2.append(r3)
                        java.lang.String r3 = "$"
                        r2.append(r3)
                        java.lang.String r0 = "accessor"
                        r2.append(r0)
                        r2.append(r3)
                        r2.append(r4)
                        java.lang.String r2 = r2.toString()
                        r1.name = r2
                        return
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.AbstractPropertyAccessorMethod
                public int getBaseModifiers() {
                        r1 = this;
                        net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                        boolean r0 = r0.isStatic()
                        if (r0 == 0) goto Lb
                        r0 = 8
                        goto Lc
                    Lb:
                        r0 = 0
                    Lc:
                        return r0
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
                        net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                        r0.<init>()
                        return r0
                }

                @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                public java.lang.String getInternalName() {
                        r1 = this;
                        java.lang.String r0 = r1.name
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
                public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                        r1 = this;
                        net.bytebuddy.description.method.ParameterList$Empty r0 = new net.bytebuddy.description.method.ParameterList$Empty
                        r0.<init>()
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeDescription.Generic getReturnType() {
                        r1 = this;
                        net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getType()
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

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class FieldGetterDelegation extends net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord {
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                private FieldGetterDelegation(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.modifier.Visibility r2, net.bytebuddy.description.field.FieldDescription r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        r0.fieldDescription = r3
                        return
                }

                public FieldGetterDelegation(net.bytebuddy.description.type.TypeDescription r2, java.lang.String r3, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r4, net.bytebuddy.description.field.FieldDescription r5) {
                        r1 = this;
                        net.bytebuddy.implementation.Implementation$Context$Default$FieldGetter r0 = new net.bytebuddy.implementation.Implementation$Context$Default$FieldGetter
                        r0.<init>(r2, r5, r3)
                        net.bytebuddy.description.modifier.Visibility r2 = r4.getVisibility()
                        r1.<init>(r0, r2, r5)
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                        r6 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.description.field.FieldDescription r1 = r6.fieldDescription
                        boolean r1 = r1.isStatic()
                        if (r1 == 0) goto Ld
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        goto L11
                    Ld:
                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    L11:
                        net.bytebuddy.description.field.FieldDescription r2 = r6.fieldDescription
                        net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r2 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r2)
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.read()
                        net.bytebuddy.description.field.FieldDescription r3 = r6.fieldDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r3)
                        r4 = 3
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                        r5 = 0
                        r4[r5] = r1
                        r1 = 1
                        r4[r1] = r2
                        r1 = 2
                        r4[r1] = r3
                        r0.<init>(r4)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r7 = r0.apply(r7, r8)
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r8 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                        int r7 = r7.getMaximalSize()
                        int r9 = r9.getStackSize()
                        r8.<init>(r7, r9)
                        return r8
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
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
                        net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                        net.bytebuddy.implementation.Implementation$Context$Default$FieldGetterDelegation r5 = (net.bytebuddy.implementation.Implementation.Context.Default.FieldGetterDelegation) r5
                        net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L27
                        return r1
                    L27:
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord with(net.bytebuddy.implementation.MethodAccessorFactory.AccessType r4) {
                        r3 = this;
                        net.bytebuddy.implementation.Implementation$Context$Default$FieldGetterDelegation r0 = new net.bytebuddy.implementation.Implementation$Context$Default$FieldGetterDelegation
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r3.methodDescription
                        net.bytebuddy.description.modifier.Visibility r2 = r3.visibility
                        net.bytebuddy.description.modifier.Visibility r4 = r4.getVisibility()
                        net.bytebuddy.description.modifier.Visibility r4 = r2.expandTo(r4)
                        net.bytebuddy.description.field.FieldDescription r2 = r3.fieldDescription
                        r0.<init>(r1, r4, r2)
                        return r0
                }
            }

            public static class FieldSetter extends net.bytebuddy.implementation.Implementation.Context.Default.AbstractPropertyAccessorMethod {
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;
                private final net.bytebuddy.description.type.TypeDescription instrumentedType;
                private final java.lang.String name;

                public FieldSetter(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.field.FieldDescription r3, java.lang.String r4) {
                        r1 = this;
                        r1.<init>()
                        r1.instrumentedType = r2
                        r1.fieldDescription = r3
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r3 = r3.getName()
                        r2.append(r3)
                        java.lang.String r3 = "$"
                        r2.append(r3)
                        java.lang.String r0 = "accessor"
                        r2.append(r0)
                        r2.append(r3)
                        r2.append(r4)
                        java.lang.String r2 = r2.toString()
                        r1.name = r2
                        return
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.AbstractPropertyAccessorMethod
                public int getBaseModifiers() {
                        r1 = this;
                        net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                        boolean r0 = r0.isStatic()
                        if (r0 == 0) goto Lb
                        r0 = 8
                        goto Lc
                    Lb:
                        r0 = 0
                    Lc:
                        return r0
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
                        net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                @net.bytebuddy.utility.nullability.MaybeNull
                public net.bytebuddy.description.annotation.AnnotationValue<?, ?> getDefaultValue() {
                        r1 = this;
                        net.bytebuddy.description.annotation.AnnotationValue<?, ?> r0 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription
                public net.bytebuddy.description.type.TypeList.Generic getExceptionTypes() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeList$Generic$Empty r0 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                        r0.<init>()
                        return r0
                }

                @Override // net.bytebuddy.description.NamedElement.WithRuntimeName
                public java.lang.String getInternalName() {
                        r1 = this;
                        java.lang.String r0 = r1.name
                        return r0
                }

                @Override // net.bytebuddy.description.method.MethodDescription, net.bytebuddy.description.method.MethodDescription.InDefinedShape
                public net.bytebuddy.description.method.ParameterList<net.bytebuddy.description.method.ParameterDescription.InDefinedShape> getParameters() {
                        r2 = this;
                        net.bytebuddy.description.method.ParameterList$Explicit$ForTypes r0 = new net.bytebuddy.description.method.ParameterList$Explicit$ForTypes
                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getType()
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asRawType()
                        java.util.List r1 = java.util.Collections.singletonList(r1)
                        r0.<init>(r2, r1)
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

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class FieldSetterDelegation extends net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord {
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                private FieldSetterDelegation(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.modifier.Visibility r2, net.bytebuddy.description.field.FieldDescription r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        r0.fieldDescription = r3
                        return
                }

                public FieldSetterDelegation(net.bytebuddy.description.type.TypeDescription r2, java.lang.String r3, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r4, net.bytebuddy.description.field.FieldDescription r5) {
                        r1 = this;
                        net.bytebuddy.implementation.Implementation$Context$Default$FieldSetter r0 = new net.bytebuddy.implementation.Implementation$Context$Default$FieldSetter
                        r0.<init>(r2, r5, r3)
                        net.bytebuddy.description.modifier.Visibility r2 = r4.getVisibility()
                        r1.<init>(r0, r2, r5)
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r6, net.bytebuddy.implementation.Implementation.Context r7, net.bytebuddy.description.method.MethodDescription r8) {
                        r5 = this;
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r8)
                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.prependThisReference()
                        net.bytebuddy.description.field.FieldDescription r2 = r5.fieldDescription
                        net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r2 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r2)
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.write()
                        r3 = 3
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r3 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
                        r4 = 0
                        r3[r4] = r1
                        r1 = 1
                        r3[r1] = r2
                        net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.VOID
                        r2 = 2
                        r3[r2] = r1
                        r0.<init>(r3)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r6 = r0.apply(r6, r7)
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r7 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                        int r6 = r6.getMaximalSize()
                        int r8 = r8.getStackSize()
                        r7.<init>(r6, r8)
                        return r7
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
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
                        net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                        net.bytebuddy.implementation.Implementation$Context$Default$FieldSetterDelegation r5 = (net.bytebuddy.implementation.Implementation.Context.Default.FieldSetterDelegation) r5
                        net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L27
                        return r1
                    L27:
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public int hashCode() {
                        r2 = this;
                        int r0 = super.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord
                public net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord with(net.bytebuddy.implementation.MethodAccessorFactory.AccessType r4) {
                        r3 = this;
                        net.bytebuddy.implementation.Implementation$Context$Default$FieldSetterDelegation r0 = new net.bytebuddy.implementation.Implementation$Context$Default$FieldSetterDelegation
                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r3.methodDescription
                        net.bytebuddy.description.modifier.Visibility r2 = r3.visibility
                        net.bytebuddy.description.modifier.Visibility r4 = r4.getVisibility()
                        net.bytebuddy.description.modifier.Visibility r4 = r2.expandTo(r4)
                        net.bytebuddy.description.field.FieldDescription r2 = r3.fieldDescription
                        r0.<init>(r1, r4, r2)
                        return r0
                }
            }

            public Default(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.ClassFileVersion r2, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r3, net.bytebuddy.dynamic.scaffold.TypeInitializer r4, net.bytebuddy.ClassFileVersion r5, net.bytebuddy.implementation.Implementation.Context.FrameGeneration r6, java.lang.String r7) {
                    r0 = this;
                    r0.<init>(r1, r2, r6)
                    r0.auxiliaryTypeNamingStrategy = r3
                    r0.typeInitializer = r4
                    r0.auxiliaryClassFileVersion = r5
                    r0.suffix = r7
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    r0.registeredAccessorMethods = r1
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    r0.registeredGetters = r1
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    r0.registeredSetters = r1
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    r0.auxiliaryTypes = r1
                    java.util.HashMap r1 = new java.util.HashMap
                    r1.<init>()
                    r0.registeredFieldCacheEntries = r1
                    java.util.HashSet r1 = new java.util.HashSet
                    r1.<init>()
                    r0.registeredFieldCacheFields = r1
                    r1 = 1
                    r0.fieldCacheCanAppendEntries = r1
                    return
            }

            @Override // net.bytebuddy.implementation.Implementation.Context
            public net.bytebuddy.description.field.FieldDescription.InDefinedShape cache(net.bytebuddy.implementation.bytecode.StackManipulation r7, net.bytebuddy.description.type.TypeDescription r8) {
                    r6 = this;
                    net.bytebuddy.implementation.Implementation$Context$Default$FieldCacheEntry r0 = new net.bytebuddy.implementation.Implementation$Context$Default$FieldCacheEntry
                    r0.<init>(r7, r8)
                    java.util.Map<net.bytebuddy.implementation.Implementation$Context$Default$FieldCacheEntry, net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r6.registeredFieldCacheEntries
                    java.lang.Object r1 = r1.get(r0)
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r1
                    if (r1 == 0) goto L10
                    return r1
                L10:
                    boolean r1 = r6.fieldCacheCanAppendEntries
                    if (r1 == 0) goto L37
                    int r7 = r7.hashCode()
                L18:
                    net.bytebuddy.implementation.Implementation$Context$Default$CacheValueField r1 = new net.bytebuddy.implementation.Implementation$Context$Default$CacheValueField
                    net.bytebuddy.description.type.TypeDescription r2 = r6.instrumentedType
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r8.asGenericType()
                    java.lang.String r4 = r6.suffix
                    int r5 = r7 + 1
                    r1.<init>(r2, r3, r4, r7)
                    java.util.Set<net.bytebuddy.description.field.FieldDescription$InDefinedShape> r7 = r6.registeredFieldCacheFields
                    boolean r7 = r7.add(r1)
                    if (r7 == 0) goto L35
                    java.util.Map<net.bytebuddy.implementation.Implementation$Context$Default$FieldCacheEntry, net.bytebuddy.description.field.FieldDescription$InDefinedShape> r7 = r6.registeredFieldCacheEntries
                    r7.put(r0, r1)
                    return r1
                L35:
                    r7 = r5
                    goto L18
                L37:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r0 = "Cached values cannot be registered after defining the type initializer for "
                    r8.append(r0)
                    net.bytebuddy.description.type.TypeDescription r0 = r6.instrumentedType
                    r8.append(r0)
                    java.lang.String r8 = r8.toString()
                    r7.<init>(r8)
                    throw r7
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.ExtractableView
            public void drain(net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain r11, net.bytebuddy.jar.asm.ClassVisitor r12, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r13) {
                    r10 = this;
                    r0 = 0
                    r10.fieldCacheCanAppendEntries = r0
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r0 = r10.typeInitializer
                    java.util.Map<net.bytebuddy.implementation.Implementation$Context$Default$FieldCacheEntry, net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r10.registeredFieldCacheEntries
                    java.util.Set r1 = r1.entrySet()
                    java.util.Iterator r1 = r1.iterator()
                Lf:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L64
                    java.lang.Object r2 = r1.next()
                    java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                    java.lang.Object r3 = r2.getValue()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r3 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r3
                    int r5 = r3.getModifiers()
                    java.lang.Object r3 = r2.getValue()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r3 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r3
                    java.lang.String r6 = r3.getInternalName()
                    java.lang.Object r3 = r2.getValue()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r3 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r3
                    java.lang.String r7 = r3.getDescriptor()
                    java.lang.Object r3 = r2.getValue()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r3 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r3
                    java.lang.String r8 = r3.getGenericSignature()
                    java.lang.Object r9 = net.bytebuddy.description.field.FieldDescription.NO_DEFAULT_VALUE
                    r4 = r12
                    net.bytebuddy.jar.asm.FieldVisitor r3 = r4.visitField(r5, r6, r7, r8, r9)
                    if (r3 == 0) goto Lf
                    r3.visitEnd()
                    java.lang.Object r3 = r2.getKey()
                    net.bytebuddy.implementation.Implementation$Context$Default$FieldCacheEntry r3 = (net.bytebuddy.implementation.Implementation.Context.Default.FieldCacheEntry) r3
                    java.lang.Object r2 = r2.getValue()
                    net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender r2 = r3.storeIn(r2)
                    net.bytebuddy.dynamic.scaffold.TypeInitializer r0 = r0.expandWith(r2)
                    goto Lf
                L64:
                    r11.apply(r12, r0, r10)
                    java.util.Map<net.bytebuddy.implementation.Implementation$SpecialMethodInvocation, net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord> r11 = r10.registeredAccessorMethods
                    java.util.Collection r11 = r11.values()
                    java.util.Iterator r11 = r11.iterator()
                L71:
                    boolean r0 = r11.hasNext()
                    if (r0 == 0) goto L81
                    java.lang.Object r0 = r11.next()
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record) r0
                    r0.apply(r12, r10, r13)
                    goto L71
                L81:
                    java.util.Map<net.bytebuddy.description.field.FieldDescription, net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord> r11 = r10.registeredGetters
                    java.util.Collection r11 = r11.values()
                    java.util.Iterator r11 = r11.iterator()
                L8b:
                    boolean r0 = r11.hasNext()
                    if (r0 == 0) goto L9b
                    java.lang.Object r0 = r11.next()
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record) r0
                    r0.apply(r12, r10, r13)
                    goto L8b
                L9b:
                    java.util.Map<net.bytebuddy.description.field.FieldDescription, net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord> r11 = r10.registeredSetters
                    java.util.Collection r11 = r11.values()
                    java.util.Iterator r11 = r11.iterator()
                La5:
                    boolean r0 = r11.hasNext()
                    if (r0 == 0) goto Lb5
                    java.lang.Object r0 = r11.next()
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = (net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record) r0
                    r0.apply(r12, r10, r13)
                    goto La5
                Lb5:
                    return
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.ExtractableView
            public java.util.List<net.bytebuddy.dynamic.DynamicType> getAuxiliaryTypes() {
                    r2 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    java.util.Map<net.bytebuddy.implementation.auxiliary.AuxiliaryType, net.bytebuddy.dynamic.DynamicType> r1 = r2.auxiliaryTypes
                    java.util.Collection r1 = r1.values()
                    r0.<init>(r1)
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.ExtractableView
            public boolean isEnabled() {
                    r1 = this;
                    r0 = 1
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Context
            public net.bytebuddy.description.type.TypeDescription register(net.bytebuddy.implementation.auxiliary.AuxiliaryType r3) {
                    r2 = this;
                    java.util.Map<net.bytebuddy.implementation.auxiliary.AuxiliaryType, net.bytebuddy.dynamic.DynamicType> r0 = r2.auxiliaryTypes
                    java.lang.Object r0 = r0.get(r3)
                    net.bytebuddy.dynamic.DynamicType r0 = (net.bytebuddy.dynamic.DynamicType) r0
                    if (r0 != 0) goto L1d
                    net.bytebuddy.implementation.auxiliary.AuxiliaryType$NamingStrategy r0 = r2.auxiliaryTypeNamingStrategy
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    java.lang.String r0 = r0.name(r1, r3)
                    net.bytebuddy.ClassFileVersion r1 = r2.auxiliaryClassFileVersion
                    net.bytebuddy.dynamic.DynamicType r0 = r3.make(r0, r1, r2)
                    java.util.Map<net.bytebuddy.implementation.auxiliary.AuxiliaryType, net.bytebuddy.dynamic.DynamicType> r1 = r2.auxiliaryTypes
                    r1.put(r3, r0)
                L1d:
                    net.bytebuddy.description.type.TypeDescription r3 = r0.getTypeDescription()
                    return r3
            }

            @Override // net.bytebuddy.implementation.MethodAccessorFactory
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape registerAccessorFor(net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r4, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r5) {
                    r3 = this;
                    java.util.Map<net.bytebuddy.implementation.Implementation$SpecialMethodInvocation, net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord> r0 = r3.registeredAccessorMethods
                    java.lang.Object r0 = r0.get(r4)
                    net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord r0 = (net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord) r0
                    if (r0 != 0) goto L14
                    net.bytebuddy.implementation.Implementation$Context$Default$AccessorMethodDelegation r0 = new net.bytebuddy.implementation.Implementation$Context$Default$AccessorMethodDelegation
                    net.bytebuddy.description.type.TypeDescription r1 = r3.instrumentedType
                    java.lang.String r2 = r3.suffix
                    r0.<init>(r1, r2, r5, r4)
                    goto L18
                L14:
                    net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord r0 = r0.with(r5)
                L18:
                    java.util.Map<net.bytebuddy.implementation.Implementation$SpecialMethodInvocation, net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord> r5 = r3.registeredAccessorMethods
                    r5.put(r4, r0)
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r0.getMethod()
                    return r4
            }

            @Override // net.bytebuddy.implementation.MethodAccessorFactory
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape registerGetterFor(net.bytebuddy.description.field.FieldDescription r4, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r5) {
                    r3 = this;
                    java.util.Map<net.bytebuddy.description.field.FieldDescription, net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord> r0 = r3.registeredGetters
                    java.lang.Object r0 = r0.get(r4)
                    net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord r0 = (net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord) r0
                    if (r0 != 0) goto L14
                    net.bytebuddy.implementation.Implementation$Context$Default$FieldGetterDelegation r0 = new net.bytebuddy.implementation.Implementation$Context$Default$FieldGetterDelegation
                    net.bytebuddy.description.type.TypeDescription r1 = r3.instrumentedType
                    java.lang.String r2 = r3.suffix
                    r0.<init>(r1, r2, r5, r4)
                    goto L18
                L14:
                    net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord r0 = r0.with(r5)
                L18:
                    java.util.Map<net.bytebuddy.description.field.FieldDescription, net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord> r5 = r3.registeredGetters
                    r5.put(r4, r0)
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r0.getMethod()
                    return r4
            }

            @Override // net.bytebuddy.implementation.MethodAccessorFactory
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape registerSetterFor(net.bytebuddy.description.field.FieldDescription r4, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r5) {
                    r3 = this;
                    java.util.Map<net.bytebuddy.description.field.FieldDescription, net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord> r0 = r3.registeredSetters
                    java.lang.Object r0 = r0.get(r4)
                    net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord r0 = (net.bytebuddy.implementation.Implementation.Context.Default.DelegationRecord) r0
                    if (r0 != 0) goto L14
                    net.bytebuddy.implementation.Implementation$Context$Default$FieldSetterDelegation r0 = new net.bytebuddy.implementation.Implementation$Context$Default$FieldSetterDelegation
                    net.bytebuddy.description.type.TypeDescription r1 = r3.instrumentedType
                    java.lang.String r2 = r3.suffix
                    r0.<init>(r1, r2, r5, r4)
                    goto L18
                L14:
                    net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord r0 = r0.with(r5)
                L18:
                    java.util.Map<net.bytebuddy.description.field.FieldDescription, net.bytebuddy.implementation.Implementation$Context$Default$DelegationRecord> r5 = r3.registeredSetters
                    r5.put(r4, r0)
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r0.getMethod()
                    return r4
            }
        }

        public static class Disabled extends net.bytebuddy.implementation.Implementation.Context.ExtractableView.AbstractBase {

            public enum Factory extends java.lang.Enum<net.bytebuddy.implementation.Implementation.Context.Disabled.Factory> implements net.bytebuddy.implementation.Implementation.Context.Factory {
                private static final /* synthetic */ net.bytebuddy.implementation.Implementation.Context.Disabled.Factory[] $VALUES = null;
                public static final net.bytebuddy.implementation.Implementation.Context.Disabled.Factory INSTANCE = null;

                static {
                        net.bytebuddy.implementation.Implementation$Context$Disabled$Factory r0 = new net.bytebuddy.implementation.Implementation$Context$Disabled$Factory
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.Implementation.Context.Disabled.Factory.INSTANCE = r0
                        net.bytebuddy.implementation.Implementation$Context$Disabled$Factory[] r0 = new net.bytebuddy.implementation.Implementation.Context.Disabled.Factory[]{r0}
                        net.bytebuddy.implementation.Implementation.Context.Disabled.Factory.$VALUES = r0
                        return
                }

                Factory(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.Implementation.Context.Disabled.Factory valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.Implementation$Context$Disabled$Factory> r0 = net.bytebuddy.implementation.Implementation.Context.Disabled.Factory.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.Implementation$Context$Disabled$Factory r1 = (net.bytebuddy.implementation.Implementation.Context.Disabled.Factory) r1
                        return r1
                }

                public static net.bytebuddy.implementation.Implementation.Context.Disabled.Factory[] values() {
                        net.bytebuddy.implementation.Implementation$Context$Disabled$Factory[] r0 = net.bytebuddy.implementation.Implementation.Context.Disabled.Factory.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.Implementation$Context$Disabled$Factory[] r0 = (net.bytebuddy.implementation.Implementation.Context.Disabled.Factory[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Factory
                @java.lang.Deprecated
                public net.bytebuddy.implementation.Implementation.Context.ExtractableView make(net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r10, net.bytebuddy.dynamic.scaffold.TypeInitializer r11, net.bytebuddy.ClassFileVersion r12, net.bytebuddy.ClassFileVersion r13) {
                        r8 = this;
                        net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V6
                        boolean r0 = r12.isAtLeast(r0)
                        if (r0 == 0) goto Lc
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.GENERATE
                    La:
                        r7 = r0
                        goto Lf
                    Lc:
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.DISABLED
                        goto La
                    Lf:
                        r1 = r8
                        r2 = r9
                        r3 = r10
                        r4 = r11
                        r5 = r12
                        r6 = r13
                        net.bytebuddy.implementation.Implementation$Context$ExtractableView r9 = r1.make(r2, r3, r4, r5, r6, r7)
                        return r9
                }

                @Override // net.bytebuddy.implementation.Implementation.Context.Factory
                public net.bytebuddy.implementation.Implementation.Context.ExtractableView make(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r2, net.bytebuddy.dynamic.scaffold.TypeInitializer r3, net.bytebuddy.ClassFileVersion r4, net.bytebuddy.ClassFileVersion r5, net.bytebuddy.implementation.Implementation.Context.FrameGeneration r6) {
                        r0 = this;
                        boolean r2 = r3.isDefined()
                        if (r2 != 0) goto Lc
                        net.bytebuddy.implementation.Implementation$Context$Disabled r2 = new net.bytebuddy.implementation.Implementation$Context$Disabled
                        r2.<init>(r1, r4, r6)
                        return r2
                    Lc:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                        r2.<init>()
                        java.lang.String r4 = "Cannot define type initializer which was explicitly disabled: "
                        r2.append(r4)
                        r2.append(r3)
                        java.lang.String r2 = r2.toString()
                        r1.<init>(r2)
                        throw r1
                }
            }

            public Disabled(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.ClassFileVersion r2, net.bytebuddy.implementation.Implementation.Context.FrameGeneration r3) {
                    r0 = this;
                    r0.<init>(r1, r2, r3)
                    return
            }

            @Override // net.bytebuddy.implementation.Implementation.Context
            public net.bytebuddy.description.field.FieldDescription.InDefinedShape cache(net.bytebuddy.implementation.bytecode.StackManipulation r3, net.bytebuddy.description.type.TypeDescription r4) {
                    r2 = this;
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Field values caching was disabled: "
                    r0.append(r1)
                    r0.append(r4)
                    java.lang.String r4 = r0.toString()
                    r3.<init>(r4)
                    throw r3
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.ExtractableView
            public void drain(net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                    r0 = this;
                    net.bytebuddy.dynamic.scaffold.TypeInitializer$None r3 = net.bytebuddy.dynamic.scaffold.TypeInitializer.None.INSTANCE
                    r1.apply(r2, r3, r0)
                    return
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.ExtractableView
            public java.util.List<net.bytebuddy.dynamic.DynamicType> getAuxiliaryTypes() {
                    r1 = this;
                    java.util.List r0 = java.util.Collections.emptyList()
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Context.ExtractableView
            public boolean isEnabled() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Context
            public net.bytebuddy.description.type.TypeDescription register(net.bytebuddy.implementation.auxiliary.AuxiliaryType r4) {
                    r3 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Registration of auxiliary types was disabled: "
                    r1.append(r2)
                    r1.append(r4)
                    java.lang.String r4 = r1.toString()
                    r0.<init>(r4)
                    throw r0
            }

            @Override // net.bytebuddy.implementation.MethodAccessorFactory
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape registerAccessorFor(net.bytebuddy.implementation.Implementation.SpecialMethodInvocation r3, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r4) {
                    r2 = this;
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Registration of method accessors was disabled: "
                    r0.append(r1)
                    net.bytebuddy.description.method.MethodDescription r3 = r3.getMethodDescription()
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r4.<init>(r3)
                    throw r4
            }

            @Override // net.bytebuddy.implementation.MethodAccessorFactory
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape registerGetterFor(net.bytebuddy.description.field.FieldDescription r3, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r4) {
                    r2 = this;
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Registration of field accessor was disabled: "
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r4.<init>(r3)
                    throw r4
            }

            @Override // net.bytebuddy.implementation.MethodAccessorFactory
            public net.bytebuddy.description.method.MethodDescription.InDefinedShape registerSetterFor(net.bytebuddy.description.field.FieldDescription r3, net.bytebuddy.implementation.MethodAccessorFactory.AccessType r4) {
                    r2 = this;
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Registration of field accessor was disabled: "
                    r0.append(r1)
                    r0.append(r3)
                    java.lang.String r3 = r0.toString()
                    r4.<init>(r3)
                    throw r4
            }
        }

        public interface ExtractableView extends net.bytebuddy.implementation.Implementation.Context {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static abstract class AbstractBase implements net.bytebuddy.implementation.Implementation.Context.ExtractableView {
                protected final net.bytebuddy.ClassFileVersion classFileVersion;
                protected final net.bytebuddy.implementation.Implementation.Context.FrameGeneration frameGeneration;
                protected final net.bytebuddy.description.type.TypeDescription instrumentedType;

                public AbstractBase(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.ClassFileVersion r2, net.bytebuddy.implementation.Implementation.Context.FrameGeneration r3) {
                        r0 = this;
                        r0.<init>()
                        r0.instrumentedType = r1
                        r0.classFileVersion = r2
                        r0.frameGeneration = r3
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
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r2 = r4.frameGeneration
                        net.bytebuddy.implementation.Implementation$Context$ExtractableView$AbstractBase r5 = (net.bytebuddy.implementation.Implementation.Context.ExtractableView.AbstractBase) r5
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r3 = r5.frameGeneration
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                        net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        net.bytebuddy.ClassFileVersion r2 = r4.classFileVersion
                        net.bytebuddy.ClassFileVersion r5 = r5.classFileVersion
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L36
                        return r1
                    L36:
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context
                public net.bytebuddy.ClassFileVersion getClassFileVersion() {
                        r1 = this;
                        net.bytebuddy.ClassFileVersion r0 = r1.classFileVersion
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context
                public net.bytebuddy.implementation.Implementation.Context.FrameGeneration getFrameGeneration() {
                        r1 = this;
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r0 = r1.frameGeneration
                        return r0
                }

                @Override // net.bytebuddy.implementation.Implementation.Context
                public net.bytebuddy.description.type.TypeDescription getInstrumentedType() {
                        r1 = this;
                        net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.ClassFileVersion r1 = r2.classFileVersion
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = r2.frameGeneration
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            void drain(net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3);

            java.util.List<net.bytebuddy.dynamic.DynamicType> getAuxiliaryTypes();

            boolean isEnabled();
        }

        public interface Factory {
            @java.lang.Deprecated
            net.bytebuddy.implementation.Implementation.Context.ExtractableView make(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r2, net.bytebuddy.dynamic.scaffold.TypeInitializer r3, net.bytebuddy.ClassFileVersion r4, net.bytebuddy.ClassFileVersion r5);

            net.bytebuddy.implementation.Implementation.Context.ExtractableView make(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.auxiliary.AuxiliaryType.NamingStrategy r2, net.bytebuddy.dynamic.scaffold.TypeInitializer r3, net.bytebuddy.ClassFileVersion r4, net.bytebuddy.ClassFileVersion r5, net.bytebuddy.implementation.Implementation.Context.FrameGeneration r6);
        }

        public enum FrameGeneration extends java.lang.Enum<net.bytebuddy.implementation.Implementation.Context.FrameGeneration> {
            private static final /* synthetic */ net.bytebuddy.implementation.Implementation.Context.FrameGeneration[] $VALUES = null;
            public static final net.bytebuddy.implementation.Implementation.Context.FrameGeneration DISABLED = null;
            private static final java.lang.Object[] EMPTY = null;
            public static final net.bytebuddy.implementation.Implementation.Context.FrameGeneration EXPAND = null;
            public static final net.bytebuddy.implementation.Implementation.Context.FrameGeneration GENERATE = null;
            private final boolean active;




            static {
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration$1 r0 = new net.bytebuddy.implementation.Implementation$Context$FrameGeneration$1
                    java.lang.String r1 = "GENERATE"
                    r2 = 0
                    r3 = 1
                    r0.<init>(r1, r2, r3)
                    net.bytebuddy.implementation.Implementation.Context.FrameGeneration.GENERATE = r0
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration$2 r1 = new net.bytebuddy.implementation.Implementation$Context$FrameGeneration$2
                    java.lang.String r4 = "EXPAND"
                    r1.<init>(r4, r3, r3)
                    net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EXPAND = r1
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration$3 r4 = new net.bytebuddy.implementation.Implementation$Context$FrameGeneration$3
                    java.lang.String r5 = "DISABLED"
                    r6 = 2
                    r4.<init>(r5, r6, r2)
                    net.bytebuddy.implementation.Implementation.Context.FrameGeneration.DISABLED = r4
                    r5 = 3
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration[] r5 = new net.bytebuddy.implementation.Implementation.Context.FrameGeneration[r5]
                    r5[r2] = r0
                    r5[r3] = r1
                    r5[r6] = r4
                    net.bytebuddy.implementation.Implementation.Context.FrameGeneration.$VALUES = r5
                    java.lang.Object[] r0 = new java.lang.Object[r2]
                    net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EMPTY = r0
                    return
            }

            FrameGeneration(java.lang.String r1, int r2, boolean r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.active = r3
                    return
            }

            /* synthetic */ FrameGeneration(java.lang.String r1, int r2, boolean r3, net.bytebuddy.implementation.Implementation.AnonymousClass1 r4) {
                    r0 = this;
                    r0.<init>(r1, r2, r3)
                    return
            }

            private static java.lang.Object toStackMapFrame(net.bytebuddy.description.type.TypeDefinition r1) {
                    java.lang.Class r0 = java.lang.Boolean.TYPE
                    boolean r0 = r1.represents(r0)
                    if (r0 != 0) goto L53
                    java.lang.Class r0 = java.lang.Byte.TYPE
                    boolean r0 = r1.represents(r0)
                    if (r0 != 0) goto L53
                    java.lang.Class r0 = java.lang.Short.TYPE
                    boolean r0 = r1.represents(r0)
                    if (r0 != 0) goto L53
                    java.lang.Class r0 = java.lang.Character.TYPE
                    boolean r0 = r1.represents(r0)
                    if (r0 != 0) goto L53
                    java.lang.Class r0 = java.lang.Integer.TYPE
                    boolean r0 = r1.represents(r0)
                    if (r0 == 0) goto L29
                    goto L53
                L29:
                    java.lang.Class r0 = java.lang.Long.TYPE
                    boolean r0 = r1.represents(r0)
                    if (r0 == 0) goto L34
                    java.lang.Integer r1 = net.bytebuddy.jar.asm.Opcodes.LONG
                    return r1
                L34:
                    java.lang.Class r0 = java.lang.Float.TYPE
                    boolean r0 = r1.represents(r0)
                    if (r0 == 0) goto L3f
                    java.lang.Integer r1 = net.bytebuddy.jar.asm.Opcodes.FLOAT
                    return r1
                L3f:
                    java.lang.Class r0 = java.lang.Double.TYPE
                    boolean r0 = r1.represents(r0)
                    if (r0 == 0) goto L4a
                    java.lang.Integer r1 = net.bytebuddy.jar.asm.Opcodes.DOUBLE
                    return r1
                L4a:
                    net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                    java.lang.String r1 = r1.getInternalName()
                    return r1
                L53:
                    java.lang.Integer r1 = net.bytebuddy.jar.asm.Opcodes.INTEGER
                    return r1
            }

            private static java.lang.Object[] toStackMapFrames(java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r3) {
                    boolean r0 = r3.isEmpty()
                    if (r0 == 0) goto L9
                    java.lang.Object[] r0 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EMPTY
                    goto Lf
                L9:
                    int r0 = r3.size()
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                Lf:
                    r1 = 0
                L10:
                    int r2 = r3.size()
                    if (r1 >= r2) goto L25
                    java.lang.Object r2 = r3.get(r1)
                    net.bytebuddy.description.type.TypeDefinition r2 = (net.bytebuddy.description.type.TypeDefinition) r2
                    java.lang.Object r2 = toStackMapFrame(r2)
                    r0[r1] = r2
                    int r1 = r1 + 1
                    goto L10
                L25:
                    return r0
            }

            public static net.bytebuddy.implementation.Implementation.Context.FrameGeneration valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.Implementation$Context$FrameGeneration> r0 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration r1 = (net.bytebuddy.implementation.Implementation.Context.FrameGeneration) r1
                    return r1
            }

            public static net.bytebuddy.implementation.Implementation.Context.FrameGeneration[] values() {
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration[] r0 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.Implementation$Context$FrameGeneration[] r0 = (net.bytebuddy.implementation.Implementation.Context.FrameGeneration[]) r0
                    return r0
            }

            public void append(net.bytebuddy.jar.asm.MethodVisitor r10, java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r11, java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r12) {
                    r9 = this;
                    java.lang.Object[] r4 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EMPTY
                    int r3 = r4.length
                    int r5 = r11.size()
                    java.lang.Object[] r6 = toStackMapFrames(r11)
                    int r0 = r12.size()
                    int r1 = r11.size()
                    int r7 = r0 + r1
                    java.util.List r11 = net.bytebuddy.utility.CompoundList.of(r12, r11)
                    java.lang.Object[] r8 = toStackMapFrames(r11)
                    r2 = 1
                    r0 = r9
                    r1 = r10
                    r0.generate(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            public void chop(net.bytebuddy.jar.asm.MethodVisitor r10, int r11, java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r12) {
                    r9 = this;
                    java.lang.Object[] r6 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EMPTY
                    int r3 = r6.length
                    int r7 = r12.size()
                    java.lang.Object[] r8 = toStackMapFrames(r12)
                    r2 = 2
                    r0 = r9
                    r1 = r10
                    r4 = r6
                    r5 = r11
                    r0.generate(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            public void full(net.bytebuddy.jar.asm.MethodVisitor r10, java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r11, java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r12) {
                    r9 = this;
                    int r3 = r11.size()
                    java.lang.Object[] r4 = toStackMapFrames(r11)
                    int r5 = r12.size()
                    java.lang.Object[] r6 = toStackMapFrames(r12)
                    int r7 = r12.size()
                    java.lang.Object[] r8 = toStackMapFrames(r12)
                    r2 = 0
                    r0 = r9
                    r1 = r10
                    r0.generate(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            public abstract void generate(net.bytebuddy.jar.asm.MethodVisitor r1, int r2, int r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r4, int r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r6, int r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r8);

            public boolean isActive() {
                    r1 = this;
                    boolean r0 = r1.active
                    return r0
            }

            public void same(net.bytebuddy.jar.asm.MethodVisitor r10, java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r11) {
                    r9 = this;
                    java.lang.Object[] r6 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EMPTY
                    int r3 = r6.length
                    int r5 = r6.length
                    int r7 = r11.size()
                    java.lang.Object[] r8 = toStackMapFrames(r11)
                    r2 = 3
                    r0 = r9
                    r1 = r10
                    r4 = r6
                    r0.generate(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            public void same1(net.bytebuddy.jar.asm.MethodVisitor r10, net.bytebuddy.description.type.TypeDefinition r11, java.util.List<? extends net.bytebuddy.description.type.TypeDefinition> r12) {
                    r9 = this;
                    java.lang.Object r11 = toStackMapFrame(r11)
                    java.lang.Object[] r4 = new java.lang.Object[]{r11}
                    java.lang.Object[] r6 = net.bytebuddy.implementation.Implementation.Context.FrameGeneration.EMPTY
                    int r5 = r6.length
                    int r7 = r12.size()
                    java.lang.Object[] r8 = toStackMapFrames(r12)
                    r2 = 4
                    r3 = 1
                    r0 = r9
                    r1 = r10
                    r0.generate(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }
        }

        net.bytebuddy.description.field.FieldDescription.InDefinedShape cache(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription r2);

        net.bytebuddy.ClassFileVersion getClassFileVersion();

        net.bytebuddy.implementation.Implementation.Context.FrameGeneration getFrameGeneration();

        net.bytebuddy.description.type.TypeDescription getInstrumentedType();

        net.bytebuddy.description.type.TypeDescription register(net.bytebuddy.implementation.auxiliary.AuxiliaryType r1);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements net.bytebuddy.implementation.Implementation {
        private static final int NO_ADDITIONAL_VARIABLES = 0;
        private final net.bytebuddy.implementation.bytecode.ByteCodeAppender byteCodeAppender;

        public interface Dispatcher {
            net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.implementation.Implementation.Target r1, net.bytebuddy.description.method.MethodDescription r2);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForDispatcher implements net.bytebuddy.implementation.Implementation {
            private final int additionalVariableLength;
            private final net.bytebuddy.implementation.Implementation.Simple.Dispatcher dispatcher;
            private final net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable prepareable;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
            public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
                private final net.bytebuddy.implementation.Implementation.Target implementationTarget;
                final /* synthetic */ net.bytebuddy.implementation.Implementation.Simple.ForDispatcher this$0;

                public Appender(net.bytebuddy.implementation.Implementation.Simple.ForDispatcher r1, net.bytebuddy.implementation.Implementation.Target r2) {
                        r0 = this;
                        r0.this$0 = r1
                        r0.<init>()
                        r0.implementationTarget = r2
                        return
                }

                @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
                public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r4, net.bytebuddy.implementation.Implementation.Context r5, net.bytebuddy.description.method.MethodDescription r6) {
                        r3 = this;
                        net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                        net.bytebuddy.implementation.Implementation$Simple$ForDispatcher r1 = r3.this$0
                        net.bytebuddy.implementation.Implementation$Simple$Dispatcher r1 = net.bytebuddy.implementation.Implementation.Simple.ForDispatcher.access$500(r1)
                        net.bytebuddy.implementation.Implementation$Target r2 = r3.implementationTarget
                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.apply(r2, r6)
                        net.bytebuddy.implementation.bytecode.StackManipulation$Size r4 = r1.apply(r4, r5)
                        int r4 = r4.getMaximalSize()
                        int r5 = r6.getStackSize()
                        net.bytebuddy.implementation.Implementation$Simple$ForDispatcher r6 = r3.this$0
                        int r6 = net.bytebuddy.implementation.Implementation.Simple.ForDispatcher.access$600(r6)
                        int r5 = r5 + r6
                        r0.<init>(r4, r5)
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
                        net.bytebuddy.implementation.Implementation$Target r2 = r4.implementationTarget
                        net.bytebuddy.implementation.Implementation$Simple$ForDispatcher$Appender r5 = (net.bytebuddy.implementation.Implementation.Simple.ForDispatcher.Appender) r5
                        net.bytebuddy.implementation.Implementation$Target r3 = r5.implementationTarget
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.implementation.Implementation$Simple$ForDispatcher r2 = r4.this$0
                        net.bytebuddy.implementation.Implementation$Simple$ForDispatcher r5 = r5.this$0
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
                        net.bytebuddy.implementation.Implementation$Target r1 = r2.implementationTarget
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.implementation.Implementation$Simple$ForDispatcher r1 = r2.this$0
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public ForDispatcher(net.bytebuddy.implementation.Implementation.Simple.Dispatcher r1, net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable r2, int r3) {
                    r0 = this;
                    r0.<init>()
                    r0.dispatcher = r1
                    r0.prepareable = r2
                    r0.additionalVariableLength = r3
                    return
            }

            public static /* synthetic */ net.bytebuddy.implementation.Implementation.Simple.Dispatcher access$500(net.bytebuddy.implementation.Implementation.Simple.ForDispatcher r0) {
                    net.bytebuddy.implementation.Implementation$Simple$Dispatcher r0 = r0.dispatcher
                    return r0
            }

            public static /* synthetic */ int access$600(net.bytebuddy.implementation.Implementation.Simple.ForDispatcher r0) {
                    int r0 = r0.additionalVariableLength
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                    r1 = this;
                    net.bytebuddy.implementation.Implementation$Simple$ForDispatcher$Appender r0 = new net.bytebuddy.implementation.Implementation$Simple$ForDispatcher$Appender
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
                    int r2 = r4.additionalVariableLength
                    net.bytebuddy.implementation.Implementation$Simple$ForDispatcher r5 = (net.bytebuddy.implementation.Implementation.Simple.ForDispatcher) r5
                    int r3 = r5.additionalVariableLength
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.implementation.Implementation$Simple$Dispatcher r2 = r4.dispatcher
                    net.bytebuddy.implementation.Implementation$Simple$Dispatcher r3 = r5.dispatcher
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L27
                    return r1
                L27:
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable r2 = r4.prepareable
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable r5 = r5.prepareable
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L32
                    return r1
                L32:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.Implementation$Simple$Dispatcher r1 = r2.dispatcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable r1 = r2.prepareable
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    int r1 = r2.additionalVariableLength
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable r0 = r1.prepareable
                    net.bytebuddy.dynamic.scaffold.InstrumentedType r2 = r0.prepare(r2)
                    return r2
            }
        }

        public Simple(net.bytebuddy.implementation.bytecode.ByteCodeAppender... r2) {
                r1 = this;
                r1.<init>()
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound
                r0.<init>(r2)
                r1.byteCodeAppender = r0
                return
        }

        public Simple(net.bytebuddy.implementation.bytecode.StackManipulation... r2) {
                r1 = this;
                r1.<init>()
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                r0.<init>(r2)
                r1.byteCodeAppender = r0
                return
        }

        public static net.bytebuddy.implementation.Implementation of(net.bytebuddy.implementation.Implementation.Simple.Dispatcher r1) {
                r0 = 0
                net.bytebuddy.implementation.Implementation r1 = of(r1, r0)
                return r1
        }

        public static net.bytebuddy.implementation.Implementation of(net.bytebuddy.implementation.Implementation.Simple.Dispatcher r1, int r2) {
                net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable$NoOp r0 = net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable.NoOp.INSTANCE
                net.bytebuddy.implementation.Implementation r1 = of(r1, r0, r2)
                return r1
        }

        public static net.bytebuddy.implementation.Implementation of(net.bytebuddy.implementation.Implementation.Simple.Dispatcher r1, net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable r2) {
                r0 = 0
                net.bytebuddy.implementation.Implementation r1 = of(r1, r2, r0)
                return r1
        }

        public static net.bytebuddy.implementation.Implementation of(net.bytebuddy.implementation.Implementation.Simple.Dispatcher r1, net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable r2, int r3) {
                if (r3 < 0) goto L8
                net.bytebuddy.implementation.Implementation$Simple$ForDispatcher r0 = new net.bytebuddy.implementation.Implementation$Simple$ForDispatcher
                r0.<init>(r1, r2, r3)
                return r0
            L8:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r0 = "Additional variable length cannot be negative: "
                r2.append(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r1) {
                r0 = this;
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r1 = r0.byteCodeAppender
                return r1
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
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r2 = r4.byteCodeAppender
                net.bytebuddy.implementation.Implementation$Simple r5 = (net.bytebuddy.implementation.Implementation.Simple) r5
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r5 = r5.byteCodeAppender
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
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r1 = r2.byteCodeAppender
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }
    }

    public interface SpecialMethodInvocation extends net.bytebuddy.implementation.bytecode.StackManipulation {

        public static abstract class AbstractBase extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase implements net.bytebuddy.implementation.Implementation.SpecialMethodInvocation {
            private transient /* synthetic */ int hashCode;

            public AbstractBase() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                    r4 = this;
                    r0 = 1
                    if (r4 != r5) goto L4
                    return r0
                L4:
                    boolean r1 = r5 instanceof net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
                    r2 = 0
                    if (r1 != 0) goto La
                    return r2
                La:
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r5 = (net.bytebuddy.implementation.Implementation.SpecialMethodInvocation) r5
                    net.bytebuddy.description.method.MethodDescription r1 = r4.getMethodDescription()
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r1 = r1.asSignatureToken()
                    net.bytebuddy.description.method.MethodDescription r3 = r5.getMethodDescription()
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r3 = r3.asSignatureToken()
                    boolean r1 = r1.equals(r3)
                    if (r1 == 0) goto L31
                    net.bytebuddy.description.type.TypeDescription r1 = r4.getTypeDescription()
                    net.bytebuddy.description.type.TypeDescription r5 = r5.getTypeDescription()
                    boolean r5 = r1.equals(r5)
                    if (r5 == 0) goto L31
                    goto L32
                L31:
                    r0 = r2
                L32:
                    return r0
            }

            @net.bytebuddy.build.CachedReturnPlugin.Enhance("hashCode")
            public int hashCode() {
                    r2 = this;
                    int r0 = r2.hashCode
                    if (r0 == 0) goto L6
                    r0 = 0
                    goto L1d
                L6:
                    net.bytebuddy.description.method.MethodDescription r0 = r2.getMethodDescription()
                    net.bytebuddy.description.method.MethodDescription$SignatureToken r0 = r0.asSignatureToken()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r2.getTypeDescription()
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                L1d:
                    if (r0 != 0) goto L22
                    int r0 = r2.hashCode
                    goto L24
                L22:
                    r2.hashCode = r0
                L24:
                    return r0
            }
        }

        public enum Illegal extends java.lang.Enum<net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal> implements net.bytebuddy.implementation.Implementation.SpecialMethodInvocation {
            private static final /* synthetic */ net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal[] $VALUES = null;
            public static final net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal INSTANCE = null;

            static {
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r0 = new net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE = r0
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal[] r0 = new net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal[]{r0}
                    net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.$VALUES = r0
                    return
            }

            Illegal(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal> r0 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r1 = (net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal) r1
                    return r1
            }

            public static net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal[] values() {
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal[] r0 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal[] r0 = (net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal[]) r0
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2) {
                    r0 = this;
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.String r2 = "Cannot implement an undefined method"
                    r1.<init>(r2)
                    throw r1
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public net.bytebuddy.description.method.MethodDescription getMethodDescription() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "An illegal special method invocation must not be applied"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "An illegal special method invocation must not be applied"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public boolean isValid() {
                    r1 = this;
                    r0 = 0
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public net.bytebuddy.utility.JavaConstant.MethodHandle toMethodHandle() {
                    r2 = this;
                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                    java.lang.String r1 = "An illegal special method invocation must not be applied"
                    r0.<init>(r1)
                    throw r0
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation withCheckedCompatibilityTo(net.bytebuddy.description.method.MethodDescription.TypeToken r1) {
                    r0 = this;
                    return r0
            }
        }

        public static class Simple extends net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.AbstractBase {
            private final net.bytebuddy.description.method.MethodDescription methodDescription;
            private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
            private final net.bytebuddy.description.type.TypeDescription typeDescription;

            public Simple(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.bytecode.StackManipulation r3) {
                    r0 = this;
                    r0.<init>()
                    r0.methodDescription = r1
                    r0.typeDescription = r2
                    r0.stackManipulation = r3
                    return
            }

            public static net.bytebuddy.implementation.Implementation.SpecialMethodInvocation of(net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.type.TypeDescription r3) {
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.special(r3)
                    boolean r1 = r0.isValid()
                    if (r1 == 0) goto L14
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Simple r1 = new net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Simple
                    r1.<init>(r2, r3, r0)
                    goto L16
                L14:
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r1 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE
                L16:
                    return r1
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.stackManipulation
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r0.apply(r2, r3)
                    return r2
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public net.bytebuddy.description.method.MethodDescription getMethodDescription() {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public net.bytebuddy.utility.JavaConstant.MethodHandle toMethodHandle() {
                    r2 = this;
                    net.bytebuddy.description.method.MethodDescription r0 = r2.methodDescription
                    net.bytebuddy.description.ByteCodeElement$TypeDependant r0 = r0.asDefined()
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                    net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                    net.bytebuddy.utility.JavaConstant$MethodHandle r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.ofSpecial(r0, r1)
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.SpecialMethodInvocation
            public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation withCheckedCompatibilityTo(net.bytebuddy.description.method.MethodDescription.TypeToken r2) {
                    r1 = this;
                    net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                    net.bytebuddy.description.method.MethodDescription$TypeToken r0 = r0.asTypeToken()
                    boolean r2 = r0.equals(r2)
                    if (r2 == 0) goto Ld
                    return r1
                Ld:
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r2 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE
                    return r2
            }
        }

        net.bytebuddy.description.method.MethodDescription getMethodDescription();

        net.bytebuddy.description.type.TypeDescription getTypeDescription();

        net.bytebuddy.utility.JavaConstant.MethodHandle toMethodHandle();

        net.bytebuddy.implementation.Implementation.SpecialMethodInvocation withCheckedCompatibilityTo(net.bytebuddy.description.method.MethodDescription.TypeToken r1);
    }

    public interface Target {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static abstract class AbstractBase implements net.bytebuddy.implementation.Implementation.Target {
            protected final net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation defaultMethodInvocation;
            protected final net.bytebuddy.description.type.TypeDescription instrumentedType;
            protected final net.bytebuddy.dynamic.scaffold.MethodGraph.Linked methodGraph;

            public enum DefaultMethodInvocation extends java.lang.Enum<net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation> {
                private static final /* synthetic */ net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation[] $VALUES = null;
                public static final net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation DISABLED = null;
                public static final net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation ENABLED = null;



                static {
                        net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation$1 r0 = new net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation$1
                        java.lang.String r1 = "ENABLED"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.ENABLED = r0
                        net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation$2 r1 = new net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation$2
                        java.lang.String r3 = "DISABLED"
                        r4 = 1
                        r1.<init>(r3, r4)
                        net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.DISABLED = r1
                        r3 = 2
                        net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation[] r3 = new net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation[r3]
                        r3[r2] = r0
                        r3[r4] = r1
                        net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.$VALUES = r3
                        return
                }

                DefaultMethodInvocation(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                /* synthetic */ DefaultMethodInvocation(java.lang.String r1, int r2, net.bytebuddy.implementation.Implementation.AnonymousClass1 r3) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation of(net.bytebuddy.ClassFileVersion r1) {
                        net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V8
                        boolean r1 = r1.isAtLeast(r0)
                        if (r1 == 0) goto Lb
                        net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation r1 = net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.ENABLED
                        goto Ld
                    Lb:
                        net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation r1 = net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.DISABLED
                    Ld:
                        return r1
                }

                public static net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation> r0 = net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation r1 = (net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation) r1
                        return r1
                }

                public static net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation[] values() {
                        net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation[] r0 = net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation[] r0 = (net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation[]) r0
                        return r0
                }

                public abstract net.bytebuddy.implementation.Implementation.SpecialMethodInvocation apply(net.bytebuddy.dynamic.scaffold.MethodGraph.Node r1, net.bytebuddy.description.type.TypeDescription r2);
            }

            public AbstractBase(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Linked r2, net.bytebuddy.implementation.Implementation.Target.AbstractBase.DefaultMethodInvocation r3) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    r0.methodGraph = r2
                    r0.defaultMethodInvocation = r3
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
                    net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation r2 = r4.defaultMethodInvocation
                    net.bytebuddy.implementation.Implementation$Target$AbstractBase r5 = (net.bytebuddy.implementation.Implementation.Target.AbstractBase) r5
                    net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation r3 = r5.defaultMethodInvocation
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r2 = r4.methodGraph
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r5 = r5.methodGraph
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L36
                    return r1
                L36:
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Target
            public net.bytebuddy.description.type.TypeDescription getInstrumentedType() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r2.methodGraph
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation r1 = r2.defaultMethodInvocation
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Target
            public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeDefault(net.bytebuddy.description.method.MethodDescription.SignatureToken r5) {
                    r4 = this;
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r0 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE
                    net.bytebuddy.description.type.TypeDescription r1 = r4.instrumentedType
                    net.bytebuddy.description.type.TypeList$Generic r1 = r1.getInterfaces()
                    net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
                    java.util.Iterator r1 = r1.iterator()
                L10:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L39
                    java.lang.Object r2 = r1.next()
                    net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r4.invokeDefault(r5, r2)
                    net.bytebuddy.description.method.MethodDescription$TypeToken r3 = r5.asTypeToken()
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r2 = r2.withCheckedCompatibilityTo(r3)
                    boolean r3 = r2.isValid()
                    if (r3 == 0) goto L10
                    boolean r0 = r0.isValid()
                    if (r0 == 0) goto L37
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation$Illegal r5 = net.bytebuddy.implementation.Implementation.SpecialMethodInvocation.Illegal.INSTANCE
                    return r5
                L37:
                    r0 = r2
                    goto L10
                L39:
                    return r0
            }

            @Override // net.bytebuddy.implementation.Implementation.Target
            public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeDefault(net.bytebuddy.description.method.MethodDescription.SignatureToken r3, net.bytebuddy.description.type.TypeDescription r4) {
                    r2 = this;
                    net.bytebuddy.implementation.Implementation$Target$AbstractBase$DefaultMethodInvocation r0 = r2.defaultMethodInvocation
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r2.methodGraph
                    net.bytebuddy.dynamic.scaffold.MethodGraph r1 = r1.getInterfaceGraph(r4)
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Node r3 = r1.locate(r3)
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r3 = r0.apply(r3, r4)
                    return r3
            }

            @Override // net.bytebuddy.implementation.Implementation.Target
            public net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeDominant(net.bytebuddy.description.method.MethodDescription.SignatureToken r3) {
                    r2 = this;
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r0 = r2.invokeSuper(r3)
                    boolean r1 = r0.isValid()
                    if (r1 == 0) goto Lb
                    goto Lf
                Lb:
                    net.bytebuddy.implementation.Implementation$SpecialMethodInvocation r0 = r2.invokeDefault(r3)
                Lf:
                    return r0
            }
        }

        public interface Factory {
            net.bytebuddy.implementation.Implementation.Target make(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Linked r2, net.bytebuddy.ClassFileVersion r3);
        }

        net.bytebuddy.description.type.TypeDescription getInstrumentedType();

        net.bytebuddy.description.type.TypeDefinition getOriginType();

        net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeDefault(net.bytebuddy.description.method.MethodDescription.SignatureToken r1);

        net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeDefault(net.bytebuddy.description.method.MethodDescription.SignatureToken r1, net.bytebuddy.description.type.TypeDescription r2);

        net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeDominant(net.bytebuddy.description.method.MethodDescription.SignatureToken r1);

        net.bytebuddy.implementation.Implementation.SpecialMethodInvocation invokeSuper(net.bytebuddy.description.method.MethodDescription.SignatureToken r1);
    }

    net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r1);
}
