package net.bytebuddy.implementation.bytecode.assign.reference;

/* JADX INFO: loaded from: classes2.dex */
public enum GenericTypeAwareAssigner extends java.lang.Enum<net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner> implements net.bytebuddy.implementation.bytecode.assign.Assigner {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner INSTANCE = null;

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class IsAssignableToVisitor implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<java.lang.Boolean> {
        private final boolean polymorphic;
        private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;

        public static class OfGenericArray extends net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.IsAssignableToVisitor.OfManifestType {
            public OfGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1, boolean r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                    r2 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.typeDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getComponentType()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getComponentType()
                La:
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r0.getSort()
                    boolean r1 = r1.isGenericArray()
                    if (r1 == 0) goto L27
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r3.getSort()
                    boolean r1 = r1.isGenericArray()
                    if (r1 == 0) goto L27
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getComponentType()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getComponentType()
                    goto La
                L27:
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r0.getSort()
                    boolean r1 = r1.isGenericArray()
                    if (r1 != 0) goto L4e
                    net.bytebuddy.description.type.TypeDefinition$Sort r1 = r3.getSort()
                    boolean r1 = r1.isGenericArray()
                    if (r1 != 0) goto L4e
                    net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor r1 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor
                    r1.<init>(r3)
                    java.lang.Object r3 = r0.accept(r1)
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    boolean r3 = r3.booleanValue()
                    if (r3 == 0) goto L4e
                    r3 = 1
                    goto L4f
                L4e:
                    r3 = 0
                L4f:
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    return r3
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onGenericArray(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                    r1 = this;
                    boolean r0 = r1.polymorphic
                    if (r0 == 0) goto L13
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeDescription
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    boolean r2 = r0.isAssignableTo(r2)
                    goto L21
                L13:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeDescription
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    boolean r2 = r0.equals(r2)
                L21:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    return r2
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onNonGenericType(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onParameterizedType(r1)
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static abstract class OfManifestType implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<java.lang.Boolean> {
            protected final boolean polymorphic;
            protected final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;

            public OfManifestType(net.bytebuddy.description.type.TypeDescription.Generic r1, boolean r2) {
                    r0 = this;
                    r0.<init>()
                    r0.typeDescription = r1
                    r0.polymorphic = r2
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
                    boolean r2 = r4.polymorphic
                    net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor$OfManifestType r5 = (net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.IsAssignableToVisitor.OfManifestType) r5
                    boolean r3 = r5.polymorphic
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.typeDescription
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.polymorphic
                    int r0 = r0 + r1
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                    r1 = this;
                    net.bytebuddy.description.TypeVariableSource r2 = r2.getTypeVariableSource()
                    boolean r2 = r2.isInferrable()
                    if (r2 != 0) goto Ld
                    java.lang.Boolean r2 = java.lang.Boolean.FALSE
                    return r2
                Ld:
                    java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
                    java.lang.String r0 = "Assignability checks for type variables declared by methods arel not currently supported"
                    r2.<init>(r0)
                    throw r2
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onTypeVariable(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r5) {
                    r4 = this;
                    net.bytebuddy.description.type.TypeList$Generic r0 = r5.getUpperBounds()
                    java.util.Iterator r0 = r0.iterator()
                L8:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L2a
                    java.lang.Object r1 = r0.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = (net.bytebuddy.description.type.TypeDescription.Generic) r1
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                    net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor r3 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor
                    r3.<init>(r1)
                    java.lang.Object r1 = r2.accept(r3)
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L8
                    java.lang.Boolean r5 = java.lang.Boolean.FALSE
                    return r5
                L2a:
                    net.bytebuddy.description.type.TypeList$Generic r5 = r5.getLowerBounds()
                    java.util.Iterator r5 = r5.iterator()
                L32:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L54
                    java.lang.Object r0 = r5.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor r1 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                    r1.<init>(r2)
                    java.lang.Object r0 = r0.accept(r1)
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    if (r0 != 0) goto L32
                    java.lang.Boolean r5 = java.lang.Boolean.FALSE
                    return r5
                L54:
                    java.lang.Boolean r5 = java.lang.Boolean.TRUE
                    return r5
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onWildcard(r1)
                    return r1
            }
        }

        public static class OfNonGenericType extends net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.IsAssignableToVisitor.OfSimpleType {
            public OfNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1, boolean r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                    r1 = this;
                    boolean r0 = r1.polymorphic
                    if (r0 == 0) goto L13
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeDescription
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    boolean r2 = r0.isAssignableTo(r2)
                    goto L21
                L13:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeDescription
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    boolean r2 = r0.equals(r2)
                L21:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    return r2
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onGenericArray(r1)
                    return r1
            }
        }

        public static class OfParameterizedType extends net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.IsAssignableToVisitor.OfSimpleType {
            public OfParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1, boolean r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onGenericArray(r1)
                    return r1
            }
        }

        public static abstract class OfSimpleType extends net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.IsAssignableToVisitor.OfManifestType {
            public OfSimpleType(net.bytebuddy.description.type.TypeDescription.Generic r1, boolean r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                    r1 = this;
                    boolean r0 = r1.polymorphic
                    if (r0 == 0) goto L13
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeDescription
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    boolean r2 = r0.isAssignableTo(r2)
                    goto L21
                L13:
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeDescription
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    boolean r2 = r0.equals(r2)
                L21:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    return r2
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onNonGenericType(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r9) {
                    r8 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r8.typeDescription
                    java.util.Set r0 = java.util.Collections.singleton(r0)
                    java.util.Queue r0 = net.bytebuddy.utility.QueueFactory.make(r0)
                    java.util.HashSet r1 = new java.util.HashSet
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r8.typeDescription
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    java.util.Set r2 = java.util.Collections.singleton(r2)
                    r1.<init>(r2)
                L19:
                    java.lang.Object r2 = r0.remove()
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    net.bytebuddy.description.type.TypeDescription r3 = r2.asErasure()
                    net.bytebuddy.description.type.TypeDescription r4 = r9.asErasure()
                    boolean r3 = r3.equals(r4)
                    if (r3 == 0) goto L93
                    net.bytebuddy.description.type.TypeDefinition$Sort r0 = r2.getSort()
                    boolean r0 = r0.isNonGeneric()
                    if (r0 == 0) goto L3a
                    java.lang.Boolean r9 = java.lang.Boolean.TRUE
                    return r9
                L3a:
                    net.bytebuddy.description.type.TypeList$Generic r0 = r2.getTypeArguments()
                    net.bytebuddy.description.type.TypeList$Generic r1 = r9.getTypeArguments()
                    int r2 = r1.size()
                    int r3 = r0.size()
                    if (r3 == r2) goto L4f
                    java.lang.Boolean r9 = java.lang.Boolean.FALSE
                    return r9
                L4f:
                    r3 = 0
                    r4 = r3
                L51:
                    if (r4 >= r2) goto L76
                    java.lang.Object r5 = r0.get(r4)
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                    net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor r6 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor
                    java.lang.Object r7 = r1.get(r4)
                    net.bytebuddy.description.type.TypeDescription$Generic r7 = (net.bytebuddy.description.type.TypeDescription.Generic) r7
                    r6.<init>(r7, r3)
                    java.lang.Object r5 = r5.accept(r6)
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    if (r5 != 0) goto L73
                    java.lang.Boolean r9 = java.lang.Boolean.FALSE
                    return r9
                L73:
                    int r4 = r4 + 1
                    goto L51
                L76:
                    net.bytebuddy.description.type.TypeDescription$Generic r9 = r9.getOwnerType()
                    if (r9 == 0) goto L8d
                    net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor r0 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor
                    r0.<init>(r9)
                    java.lang.Object r9 = r9.accept(r0)
                    java.lang.Boolean r9 = (java.lang.Boolean) r9
                    boolean r9 = r9.booleanValue()
                    if (r9 == 0) goto L8e
                L8d:
                    r3 = 1
                L8e:
                    java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
                    return r9
                L93:
                    boolean r3 = r8.polymorphic
                    if (r3 == 0) goto Lcc
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r2.getSuperClass()
                    if (r3 == 0) goto Laa
                    net.bytebuddy.description.type.TypeDescription r4 = r3.asErasure()
                    boolean r4 = r1.add(r4)
                    if (r4 == 0) goto Laa
                    r0.add(r3)
                Laa:
                    net.bytebuddy.description.type.TypeList$Generic r2 = r2.getInterfaces()
                    java.util.Iterator r2 = r2.iterator()
                Lb2:
                    boolean r3 = r2.hasNext()
                    if (r3 == 0) goto Lcc
                    java.lang.Object r3 = r2.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                    net.bytebuddy.description.type.TypeDescription r4 = r3.asErasure()
                    boolean r4 = r1.add(r4)
                    if (r4 == 0) goto Lb2
                    r0.add(r3)
                    goto Lb2
                Lcc:
                    boolean r2 = r0.isEmpty()
                    if (r2 == 0) goto L19
                    java.lang.Boolean r9 = java.lang.Boolean.FALSE
                    return r9
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onParameterizedType(r1)
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class OfWildcard implements net.bytebuddy.description.type.TypeDescription.Generic.Visitor<java.lang.Boolean> {
            private final net.bytebuddy.description.type.TypeDescription.Generic wildcard;

            public OfWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    r0.<init>()
                    r0.wildcard = r1
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
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.wildcard
                    net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor$OfWildcard r5 = (net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.IsAssignableToVisitor.OfWildcard) r5
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.wildcard
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
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.wildcard
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onGenericArray(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onNonGenericType(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onParameterizedType(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = java.lang.Boolean.FALSE
                    return r1
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onTypeVariable(r1)
                    return r1
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r10) {
                    r9 = this;
                    net.bytebuddy.description.type.TypeList$Generic r0 = r10.getUpperBounds()
                    java.util.Iterator r0 = r0.iterator()
                    r1 = 0
                L9:
                    r2 = r1
                La:
                    boolean r3 = r0.hasNext()
                    java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
                    r5 = 1
                    if (r3 == 0) goto L4d
                    java.lang.Object r3 = r0.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                    net.bytebuddy.description.type.TypeDescription$Generic r6 = r9.wildcard
                    net.bytebuddy.description.type.TypeList$Generic r6 = r6.getUpperBounds()
                    java.util.Iterator r6 = r6.iterator()
                L23:
                    boolean r7 = r6.hasNext()
                    if (r7 == 0) goto L43
                    java.lang.Object r7 = r6.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r7 = (net.bytebuddy.description.type.TypeDescription.Generic) r7
                    net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor r8 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor
                    r8.<init>(r3)
                    java.lang.Object r7 = r7.accept(r8)
                    java.lang.Boolean r7 = (java.lang.Boolean) r7
                    boolean r7 = r7.booleanValue()
                    if (r7 != 0) goto L23
                    java.lang.Boolean r10 = java.lang.Boolean.FALSE
                    return r10
                L43:
                    if (r2 != 0) goto L4b
                    boolean r2 = r3.represents(r4)
                    if (r2 != 0) goto L9
                L4b:
                    r2 = r5
                    goto La
                L4d:
                    net.bytebuddy.description.type.TypeList$Generic r10 = r10.getLowerBounds()
                    java.util.Iterator r10 = r10.iterator()
                    r0 = r1
                L56:
                    boolean r3 = r10.hasNext()
                    if (r3 == 0) goto L8e
                    java.lang.Object r0 = r10.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r9.wildcard
                    net.bytebuddy.description.type.TypeList$Generic r3 = r3.getLowerBounds()
                    java.util.Iterator r3 = r3.iterator()
                L6c:
                    boolean r6 = r3.hasNext()
                    if (r6 == 0) goto L8c
                    java.lang.Object r6 = r3.next()
                    net.bytebuddy.description.type.TypeDescription$Generic r6 = (net.bytebuddy.description.type.TypeDescription.Generic) r6
                    net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor r7 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor
                    r7.<init>(r6)
                    java.lang.Object r6 = r0.accept(r7)
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 != 0) goto L6c
                    java.lang.Boolean r10 = java.lang.Boolean.FALSE
                    return r10
                L8c:
                    r0 = r5
                    goto L56
                L8e:
                    if (r2 == 0) goto L9f
                    net.bytebuddy.description.type.TypeDescription$Generic r10 = r9.wildcard
                    net.bytebuddy.description.type.TypeList$Generic r10 = r10.getLowerBounds()
                    boolean r10 = r10.isEmpty()
                    java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
                    return r10
                L9f:
                    if (r0 == 0) goto Lc5
                    net.bytebuddy.description.type.TypeDescription$Generic r10 = r9.wildcard
                    net.bytebuddy.description.type.TypeList$Generic r10 = r10.getUpperBounds()
                    int r0 = r10.size()
                    if (r0 == 0) goto Lbf
                    int r0 = r10.size()
                    if (r0 != r5) goto Lc0
                    java.lang.Object r10 = r10.getOnly()
                    net.bytebuddy.description.type.TypeDescription$Generic r10 = (net.bytebuddy.description.type.TypeDescription.Generic) r10
                    boolean r10 = r10.represents(r4)
                    if (r10 == 0) goto Lc0
                Lbf:
                    r1 = r5
                Lc0:
                    java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
                    return r10
                Lc5:
                    java.lang.Boolean r10 = java.lang.Boolean.TRUE
                    return r10
            }

            @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
            public /* bridge */ /* synthetic */ java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                    r0 = this;
                    java.lang.Boolean r1 = r0.onWildcard(r1)
                    return r1
            }
        }

        public IsAssignableToVisitor(net.bytebuddy.description.type.TypeDescription.Generic r2) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                return
        }

        public IsAssignableToVisitor(net.bytebuddy.description.type.TypeDescription.Generic r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.typeDescription = r1
                r0.polymorphic = r2
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
                boolean r2 = r4.polymorphic
                net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor r5 = (net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.IsAssignableToVisitor) r5
                boolean r3 = r5.polymorphic
                if (r2 == r3) goto L1c
                return r1
            L1c:
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.typeDescription
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.polymorphic
                int r0 = r0 + r1
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.typeDescription
                net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor$OfGenericArray r1 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor$OfGenericArray
                boolean r2 = r3.polymorphic
                r1.<init>(r4, r2)
                java.lang.Object r4 = r0.accept(r1)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                return r4
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public /* bridge */ /* synthetic */ java.lang.Boolean onGenericArray(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.onGenericArray(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.typeDescription
                net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor$OfNonGenericType r1 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor$OfNonGenericType
                boolean r2 = r3.polymorphic
                r1.<init>(r4, r2)
                java.lang.Object r4 = r0.accept(r1)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                return r4
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public /* bridge */ /* synthetic */ java.lang.Boolean onNonGenericType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.onNonGenericType(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.typeDescription
                net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor$OfParameterizedType r1 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor$OfParameterizedType
                boolean r2 = r3.polymorphic
                r1.<init>(r4, r2)
                java.lang.Object r4 = r0.accept(r1)
                java.lang.Boolean r4 = (java.lang.Boolean) r4
                return r4
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public /* bridge */ /* synthetic */ java.lang.Boolean onParameterizedType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.onParameterizedType(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r4) {
                r3 = this;
                net.bytebuddy.description.TypeVariableSource r0 = r4.getTypeVariableSource()
                boolean r0 = r0.isInferrable()
                if (r0 != 0) goto L5b
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.typeDescription
                boolean r0 = r4.equals(r0)
                if (r0 == 0) goto L15
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                return r4
            L15:
                boolean r0 = r3.polymorphic
                if (r0 == 0) goto L58
                net.bytebuddy.description.type.TypeList$Generic r4 = r4.getUpperBounds()
                java.util.Queue r4 = net.bytebuddy.utility.QueueFactory.make(r4)
            L21:
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L55
                java.lang.Object r0 = r4.remove()
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor r1 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r3.typeDescription
                r1.<init>(r2)
                java.lang.Object r1 = r0.accept(r1)
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L43
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                return r4
            L43:
                net.bytebuddy.description.type.TypeDefinition$Sort r1 = r0.getSort()
                boolean r1 = r1.isTypeVariable()
                if (r1 == 0) goto L21
                net.bytebuddy.description.type.TypeList$Generic r0 = r0.getUpperBounds()
                r4.addAll(r0)
                goto L21
            L55:
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                return r4
            L58:
                java.lang.Boolean r4 = java.lang.Boolean.FALSE
                return r4
            L5b:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                java.lang.String r0 = "Assignability checks for type variables declared by methods are not currently supported"
                r4.<init>(r0)
                throw r4
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public /* bridge */ /* synthetic */ java.lang.Boolean onTypeVariable(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.onTypeVariable(r1)
                return r1
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r3) {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r2.typeDescription
                net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor$OfWildcard r1 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor$OfWildcard
                r1.<init>(r3)
                java.lang.Object r3 = r0.accept(r1)
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                return r3
        }

        @Override // net.bytebuddy.description.type.TypeDescription.Generic.Visitor
        public /* bridge */ /* synthetic */ java.lang.Boolean onWildcard(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                java.lang.Boolean r1 = r0.onWildcard(r1)
                return r1
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner r0 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.INSTANCE = r0
            net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner[] r0 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner[]{r0}
            net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.$VALUES = r0
            return
    }

    GenericTypeAwareAssigner(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner> r0 = net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner r1 = (net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner[] values() {
            net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner[] r0 = net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner[] r0 = (net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.bytecode.assign.Assigner
    public net.bytebuddy.implementation.bytecode.StackManipulation assign(net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
            r1 = this;
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L40
            boolean r0 = r3.isPrimitive()
            if (r0 == 0) goto Ld
            goto L40
        Ld:
            net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor r0 = new net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner$IsAssignableToVisitor
            r0.<init>(r3)
            java.lang.Object r0 = r2.accept(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L21
            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
            return r2
        L21:
            boolean r4 = r4.isDynamic()
            if (r4 == 0) goto L3d
            net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
            net.bytebuddy.description.type.TypeDescription r4 = r3.asErasure()
            boolean r2 = r2.isAssignableTo(r4)
            if (r2 == 0) goto L38
            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
            goto L3c
        L38:
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r3)
        L3c:
            return r2
        L3d:
            net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
            return r2
        L40:
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L49
            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
            goto L4b
        L49:
            net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
        L4b:
            return r2
    }
}
