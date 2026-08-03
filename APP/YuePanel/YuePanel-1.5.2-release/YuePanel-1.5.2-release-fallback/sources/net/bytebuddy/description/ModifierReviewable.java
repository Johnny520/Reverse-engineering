package net.bytebuddy.description;

/* JADX INFO: loaded from: classes2.dex */
public interface ModifierReviewable {
    public static final int EMPTY_MASK = 0;

    public static abstract class AbstractBase implements net.bytebuddy.description.ModifierReviewable.ForTypeDefinition, net.bytebuddy.description.ModifierReviewable.ForFieldDescription, net.bytebuddy.description.ModifierReviewable.ForMethodDescription, net.bytebuddy.description.ModifierReviewable.ForParameterDescription {
        public AbstractBase() {
                r0 = this;
                r0.<init>()
                return
        }

        private boolean matchesMask(int r2) {
                r1 = this;
                int r0 = r1.getModifiers()
                r0 = r0 & r2
                if (r0 != r2) goto L9
                r2 = 1
                goto La
            L9:
                r2 = 0
            La:
                return r2
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfEnumeration
        public net.bytebuddy.description.modifier.EnumerationState getEnumerationState() {
                r1 = this;
                boolean r0 = r1.isEnum()
                if (r0 == 0) goto L9
                net.bytebuddy.description.modifier.EnumerationState r0 = net.bytebuddy.description.modifier.EnumerationState.ENUMERATION
                goto Lb
            L9:
                net.bytebuddy.description.modifier.EnumerationState r0 = net.bytebuddy.description.modifier.EnumerationState.PLAIN
            Lb:
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForFieldDescription
        public net.bytebuddy.description.modifier.FieldManifestation getFieldManifestation() {
                r4 = this;
                int r0 = r4.getModifiers()
                r1 = r0 & 80
                if (r1 == 0) goto L2d
                r2 = 16
                if (r1 == r2) goto L2a
                r2 = 64
                if (r1 != r2) goto L13
                net.bytebuddy.description.modifier.FieldManifestation r0 = net.bytebuddy.description.modifier.FieldManifestation.VOLATILE
                return r0
            L13:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unexpected modifiers: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L2a:
                net.bytebuddy.description.modifier.FieldManifestation r0 = net.bytebuddy.description.modifier.FieldManifestation.FINAL
                return r0
            L2d:
                net.bytebuddy.description.modifier.FieldManifestation r0 = net.bytebuddy.description.modifier.FieldManifestation.PLAIN
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForFieldDescription
        public net.bytebuddy.description.modifier.FieldPersistence getFieldPersistence() {
                r4 = this;
                int r0 = r4.getModifiers()
                r1 = r0 & 128(0x80, float:1.8E-43)
                if (r1 == 0) goto L26
                r2 = 128(0x80, float:1.8E-43)
                if (r1 != r2) goto Lf
                net.bytebuddy.description.modifier.FieldPersistence r0 = net.bytebuddy.description.modifier.FieldPersistence.TRANSIENT
                return r0
            Lf:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unexpected modifiers: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L26:
                net.bytebuddy.description.modifier.FieldPersistence r0 = net.bytebuddy.description.modifier.FieldPersistence.PLAIN
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public net.bytebuddy.description.modifier.MethodManifestation getMethodManifestation() {
                r4 = this;
                int r0 = r4.getModifiers()
                r1 = r0 & 1360(0x550, float:1.906E-42)
                if (r1 == 0) goto L49
                r2 = 16
                if (r1 == r2) goto L46
                r2 = 64
                if (r1 == r2) goto L43
                r2 = 80
                if (r1 == r2) goto L40
                r2 = 256(0x100, float:3.59E-43)
                if (r1 == r2) goto L3d
                r2 = 272(0x110, float:3.81E-43)
                if (r1 == r2) goto L3a
                r2 = 1024(0x400, float:1.435E-42)
                if (r1 != r2) goto L23
                net.bytebuddy.description.modifier.MethodManifestation r0 = net.bytebuddy.description.modifier.MethodManifestation.ABSTRACT
                return r0
            L23:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unexpected modifiers: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L3a:
                net.bytebuddy.description.modifier.MethodManifestation r0 = net.bytebuddy.description.modifier.MethodManifestation.FINAL_NATIVE
                return r0
            L3d:
                net.bytebuddy.description.modifier.MethodManifestation r0 = net.bytebuddy.description.modifier.MethodManifestation.NATIVE
                return r0
            L40:
                net.bytebuddy.description.modifier.MethodManifestation r0 = net.bytebuddy.description.modifier.MethodManifestation.FINAL_BRIDGE
                return r0
            L43:
                net.bytebuddy.description.modifier.MethodManifestation r0 = net.bytebuddy.description.modifier.MethodManifestation.BRIDGE
                return r0
            L46:
                net.bytebuddy.description.modifier.MethodManifestation r0 = net.bytebuddy.description.modifier.MethodManifestation.FINAL
                return r0
            L49:
                net.bytebuddy.description.modifier.MethodManifestation r0 = net.bytebuddy.description.modifier.MethodManifestation.PLAIN
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public net.bytebuddy.description.modifier.MethodStrictness getMethodStrictness() {
                r1 = this;
                boolean r0 = r1.isStrict()
                if (r0 == 0) goto L9
                net.bytebuddy.description.modifier.MethodStrictness r0 = net.bytebuddy.description.modifier.MethodStrictness.STRICT
                goto Lb
            L9:
                net.bytebuddy.description.modifier.MethodStrictness r0 = net.bytebuddy.description.modifier.MethodStrictness.PLAIN
            Lb:
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public net.bytebuddy.description.modifier.Ownership getOwnership() {
                r1 = this;
                boolean r0 = r1.isStatic()
                if (r0 == 0) goto L9
                net.bytebuddy.description.modifier.Ownership r0 = net.bytebuddy.description.modifier.Ownership.STATIC
                goto Lb
            L9:
                net.bytebuddy.description.modifier.Ownership r0 = net.bytebuddy.description.modifier.Ownership.MEMBER
            Lb:
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForParameterDescription
        public net.bytebuddy.description.modifier.ParameterManifestation getParameterManifestation() {
                r1 = this;
                boolean r0 = r1.isFinal()
                if (r0 == 0) goto L9
                net.bytebuddy.description.modifier.ParameterManifestation r0 = net.bytebuddy.description.modifier.ParameterManifestation.FINAL
                goto Lb
            L9:
                net.bytebuddy.description.modifier.ParameterManifestation r0 = net.bytebuddy.description.modifier.ParameterManifestation.PLAIN
            Lb:
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForParameterDescription
        public net.bytebuddy.description.modifier.ProvisioningState getProvisioningState() {
                r1 = this;
                boolean r0 = r1.isMandated()
                if (r0 == 0) goto L9
                net.bytebuddy.description.modifier.ProvisioningState r0 = net.bytebuddy.description.modifier.ProvisioningState.MANDATED
                goto Lb
            L9:
                net.bytebuddy.description.modifier.ProvisioningState r0 = net.bytebuddy.description.modifier.ProvisioningState.PLAIN
            Lb:
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public net.bytebuddy.description.modifier.SynchronizationState getSynchronizationState() {
                r1 = this;
                boolean r0 = r1.isSynchronized()
                if (r0 == 0) goto L9
                net.bytebuddy.description.modifier.SynchronizationState r0 = net.bytebuddy.description.modifier.SynchronizationState.SYNCHRONIZED
                goto Lb
            L9:
                net.bytebuddy.description.modifier.SynchronizationState r0 = net.bytebuddy.description.modifier.SynchronizationState.PLAIN
            Lb:
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public net.bytebuddy.description.modifier.SyntheticState getSyntheticState() {
                r1 = this;
                boolean r0 = r1.isSynthetic()
                if (r0 == 0) goto L9
                net.bytebuddy.description.modifier.SyntheticState r0 = net.bytebuddy.description.modifier.SyntheticState.SYNTHETIC
                goto Lb
            L9:
                net.bytebuddy.description.modifier.SyntheticState r0 = net.bytebuddy.description.modifier.SyntheticState.PLAIN
            Lb:
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForTypeDefinition
        public net.bytebuddy.description.modifier.TypeManifestation getTypeManifestation() {
                r4 = this;
                int r0 = r4.getModifiers()
                r1 = r0 & 9744(0x2610, float:1.3654E-41)
                if (r1 == 0) goto L3b
                r2 = 16
                if (r1 == r2) goto L38
                r2 = 1024(0x400, float:1.435E-42)
                if (r1 == r2) goto L35
                r2 = 1536(0x600, float:2.152E-42)
                if (r1 == r2) goto L32
                r2 = 9728(0x2600, float:1.3632E-41)
                if (r1 != r2) goto L1b
                net.bytebuddy.description.modifier.TypeManifestation r0 = net.bytebuddy.description.modifier.TypeManifestation.ANNOTATION
                return r0
            L1b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unexpected modifiers: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L32:
                net.bytebuddy.description.modifier.TypeManifestation r0 = net.bytebuddy.description.modifier.TypeManifestation.INTERFACE
                return r0
            L35:
                net.bytebuddy.description.modifier.TypeManifestation r0 = net.bytebuddy.description.modifier.TypeManifestation.ABSTRACT
                return r0
            L38:
                net.bytebuddy.description.modifier.TypeManifestation r0 = net.bytebuddy.description.modifier.TypeManifestation.FINAL
                return r0
            L3b:
                net.bytebuddy.description.modifier.TypeManifestation r0 = net.bytebuddy.description.modifier.TypeManifestation.PLAIN
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public net.bytebuddy.description.modifier.Visibility getVisibility() {
                r4 = this;
                int r0 = r4.getModifiers()
                r1 = r0 & 7
                if (r1 == 0) goto L31
                r2 = 1
                if (r1 == r2) goto L2e
                r2 = 2
                if (r1 == r2) goto L2b
                r2 = 4
                if (r1 != r2) goto L14
                net.bytebuddy.description.modifier.Visibility r0 = net.bytebuddy.description.modifier.Visibility.PROTECTED
                return r0
            L14:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Unexpected modifiers: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L2b:
                net.bytebuddy.description.modifier.Visibility r0 = net.bytebuddy.description.modifier.Visibility.PRIVATE
                return r0
            L2e:
                net.bytebuddy.description.modifier.Visibility r0 = net.bytebuddy.description.modifier.Visibility.PUBLIC
                return r0
            L31:
                net.bytebuddy.description.modifier.Visibility r0 = net.bytebuddy.description.modifier.Visibility.PACKAGE_PRIVATE
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfAbstraction
        public boolean isAbstract() {
                r1 = this;
                r0 = 1024(0x400, float:1.435E-42)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForTypeDefinition
        public boolean isAnnotation() {
                r1 = this;
                r0 = 8192(0x2000, float:1.148E-41)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isBridge() {
                r1 = this;
                r0 = 64
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isDeprecated() {
                r1 = this;
                r0 = 131072(0x20000, float:1.83671E-40)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfEnumeration
        public boolean isEnum() {
                r1 = this;
                r0 = 16384(0x4000, float:2.2959E-41)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public boolean isFinal() {
                r1 = this;
                r0 = 16
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForTypeDefinition
        public boolean isInterface() {
                r1 = this;
                r0 = 512(0x200, float:7.17E-43)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForParameterDescription
        public boolean isMandated() {
                r1 = this;
                r0 = 32768(0x8000, float:4.5918E-41)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isNative() {
                r1 = this;
                r0 = 256(0x100, float:3.59E-43)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isPackagePrivate() {
                r1 = this;
                boolean r0 = r1.isPublic()
                if (r0 != 0) goto L14
                boolean r0 = r1.isProtected()
                if (r0 != 0) goto L14
                boolean r0 = r1.isPrivate()
                if (r0 != 0) goto L14
                r0 = 1
                goto L15
            L14:
                r0 = 0
            L15:
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isPrivate() {
                r1 = this;
                r0 = 2
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isProtected() {
                r1 = this;
                r0 = 4
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isPublic() {
                r1 = this;
                r0 = 1
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.OfByteCodeElement
        public boolean isStatic() {
                r1 = this;
                r0 = 8
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isStrict() {
                r1 = this;
                r0 = 2048(0x800, float:2.87E-42)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isSynchronized() {
                r1 = this;
                r0 = 32
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable
        public boolean isSynthetic() {
                r1 = this;
                r0 = 4096(0x1000, float:5.74E-42)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForFieldDescription
        public boolean isTransient() {
                r1 = this;
                r0 = 128(0x80, float:1.8E-43)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForMethodDescription
        public boolean isVarArgs() {
                r1 = this;
                r0 = 128(0x80, float:1.8E-43)
                boolean r0 = r1.matchesMask(r0)
                return r0
        }

        @Override // net.bytebuddy.description.ModifierReviewable.ForFieldDescription
        public boolean isVolatile() {
                r1 = this;
                r0 = 64
                boolean r0 = r1.matchesMask(r0)
                return r0
        }
    }

    public interface ForFieldDescription extends net.bytebuddy.description.ModifierReviewable.OfEnumeration {
        net.bytebuddy.description.modifier.FieldManifestation getFieldManifestation();

        net.bytebuddy.description.modifier.FieldPersistence getFieldPersistence();

        boolean isTransient();

        boolean isVolatile();
    }

    public interface ForMethodDescription extends net.bytebuddy.description.ModifierReviewable.OfAbstraction {
        net.bytebuddy.description.modifier.MethodManifestation getMethodManifestation();

        net.bytebuddy.description.modifier.MethodStrictness getMethodStrictness();

        net.bytebuddy.description.modifier.SynchronizationState getSynchronizationState();

        boolean isBridge();

        boolean isNative();

        boolean isStrict();

        boolean isSynchronized();

        boolean isVarArgs();
    }

    public interface ForParameterDescription extends net.bytebuddy.description.ModifierReviewable {
        net.bytebuddy.description.modifier.ParameterManifestation getParameterManifestation();

        net.bytebuddy.description.modifier.ProvisioningState getProvisioningState();

        boolean isMandated();
    }

    public interface ForTypeDefinition extends net.bytebuddy.description.ModifierReviewable.OfAbstraction, net.bytebuddy.description.ModifierReviewable.OfEnumeration {
        net.bytebuddy.description.modifier.TypeManifestation getTypeManifestation();

        boolean isAnnotation();

        boolean isInterface();
    }

    public interface OfAbstraction extends net.bytebuddy.description.ModifierReviewable.OfByteCodeElement {
        boolean isAbstract();
    }

    public interface OfByteCodeElement extends net.bytebuddy.description.ModifierReviewable {
        net.bytebuddy.description.modifier.Ownership getOwnership();

        net.bytebuddy.description.modifier.Visibility getVisibility();

        boolean isDeprecated();

        boolean isPackagePrivate();

        boolean isPrivate();

        boolean isProtected();

        boolean isPublic();

        boolean isStatic();
    }

    public interface OfEnumeration extends net.bytebuddy.description.ModifierReviewable.OfByteCodeElement {
        net.bytebuddy.description.modifier.EnumerationState getEnumerationState();

        boolean isEnum();
    }

    int getModifiers();

    net.bytebuddy.description.modifier.SyntheticState getSyntheticState();

    boolean isFinal();

    boolean isSynthetic();
}
