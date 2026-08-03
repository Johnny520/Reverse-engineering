package net.bytebuddy.implementation.bytecode.member;

/* JADX INFO: loaded from: classes2.dex */
public enum FieldAccess extends java.lang.Enum<net.bytebuddy.implementation.bytecode.member.FieldAccess> {
    private static final /* synthetic */ net.bytebuddy.implementation.bytecode.member.FieldAccess[] $VALUES = null;
    public static final net.bytebuddy.implementation.bytecode.member.FieldAccess INSTANCE = null;
    public static final net.bytebuddy.implementation.bytecode.member.FieldAccess STATIC = null;
    private final int getterOpcode;
    private final int putterOpcode;
    private final int targetSizeChange;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.bytecode.member.FieldAccess$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class AccessDispatcher implements net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined {
        private final net.bytebuddy.description.field.FieldDescription.InDefinedShape fieldDescription;
        final /* synthetic */ net.bytebuddy.implementation.bytecode.member.FieldAccess this$0;

        public abstract class AbstractFieldInstruction extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
            final /* synthetic */ net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher this$1;

            private AbstractFieldInstruction(net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            public /* synthetic */ AbstractFieldInstruction(net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher r1, net.bytebuddy.implementation.bytecode.member.FieldAccess.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.StackManipulation
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r4, net.bytebuddy.implementation.Implementation.Context r5) {
                    r3 = this;
                    int r5 = r3.getOpcode()
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r0 = r3.this$1
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.access$000(r0)
                    net.bytebuddy.description.type.TypeDescription r0 = r0.getDeclaringType()
                    java.lang.String r0 = r0.getInternalName()
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r1 = r3.this$1
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.access$000(r1)
                    java.lang.String r1 = r1.getInternalName()
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r2 = r3.this$1
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.access$000(r2)
                    java.lang.String r2 = r2.getDescriptor()
                    r4.visitFieldInsn(r5, r0, r1, r2)
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r4 = r3.this$1
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.access$000(r4)
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                    net.bytebuddy.implementation.bytecode.StackSize r4 = r4.getStackSize()
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r4 = r3.resolveSize(r4)
                    return r4
            }

            public abstract int getOpcode();

            public abstract net.bytebuddy.implementation.bytecode.StackManipulation.Size resolveSize(net.bytebuddy.implementation.bytecode.StackSize r1);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class FieldGetInstruction extends net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.AbstractFieldInstruction {
            final /* synthetic */ net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher this$1;

            public FieldGetInstruction(net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher r2) {
                    r1 = this;
                    r1.this$1 = r2
                    r0 = 0
                    r1.<init>(r2, r0)
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
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r2 = r4.this$1
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher$FieldGetInstruction r5 = (net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.FieldGetInstruction) r5
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r5 = r5.this$1
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.AbstractFieldInstruction
            public int getOpcode() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r0 = r1.this$1
                    net.bytebuddy.implementation.bytecode.member.FieldAccess r0 = r0.this$0
                    int r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.access$200(r0)
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r1 = r2.this$1
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.AbstractFieldInstruction
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size resolveSize(net.bytebuddy.implementation.bytecode.StackSize r2) {
                    r1 = this;
                    int r2 = r2.getSize()
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r0 = r1.this$1
                    net.bytebuddy.implementation.bytecode.member.FieldAccess r0 = r0.this$0
                    int r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.access$300(r0)
                    int r2 = r2 - r0
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
                    r0.<init>(r2, r2)
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class FieldPutInstruction extends net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.AbstractFieldInstruction {
            final /* synthetic */ net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher this$1;

            public FieldPutInstruction(net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher r2) {
                    r1 = this;
                    r1.this$1 = r2
                    r0 = 0
                    r1.<init>(r2, r0)
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
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r2 = r4.this$1
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher$FieldPutInstruction r5 = (net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.FieldPutInstruction) r5
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r5 = r5.this$1
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L20
                    return r1
                L20:
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.AbstractFieldInstruction
            public int getOpcode() {
                    r1 = this;
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r0 = r1.this$1
                    net.bytebuddy.implementation.bytecode.member.FieldAccess r0 = r0.this$0
                    int r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.access$400(r0)
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r1 = r2.this$1
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher.AbstractFieldInstruction
            public net.bytebuddy.implementation.bytecode.StackManipulation.Size resolveSize(net.bytebuddy.implementation.bytecode.StackSize r3) {
                    r2 = this;
                    net.bytebuddy.implementation.bytecode.StackManipulation$Size r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Size
                    int r3 = r3.getSize()
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r1 = r2.this$1
                    net.bytebuddy.implementation.bytecode.member.FieldAccess r1 = r1.this$0
                    int r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.access$300(r1)
                    int r3 = r3 + r1
                    int r3 = r3 * (-1)
                    r1 = 0
                    r0.<init>(r3, r1)
                    return r0
            }
        }

        public AccessDispatcher(net.bytebuddy.implementation.bytecode.member.FieldAccess r1, net.bytebuddy.description.field.FieldDescription.InDefinedShape r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.fieldDescription = r2
                return
        }

        public static /* synthetic */ net.bytebuddy.description.field.FieldDescription.InDefinedShape access$000(net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher r0) {
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = r0.fieldDescription
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
                net.bytebuddy.implementation.bytecode.member.FieldAccess r2 = r4.this$0
                net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r5 = (net.bytebuddy.implementation.bytecode.member.FieldAccess.AccessDispatcher) r5
                net.bytebuddy.implementation.bytecode.member.FieldAccess r3 = r5.this$0
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = r4.fieldDescription
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r5 = r5.fieldDescription
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
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = r2.fieldDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.member.FieldAccess r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined
        public net.bytebuddy.implementation.bytecode.StackManipulation read() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher$FieldGetInstruction r0 = new net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher$FieldGetInstruction
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined
        public net.bytebuddy.implementation.bytecode.StackManipulation write() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher$FieldPutInstruction r0 = new net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher$FieldPutInstruction
                r0.<init>(r1)
                return r0
        }
    }

    public interface Defined {
        net.bytebuddy.implementation.bytecode.StackManipulation read();

        net.bytebuddy.implementation.bytecode.StackManipulation write();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class OfGenericField implements net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined {
        private final net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined defined;
        private final net.bytebuddy.description.type.TypeDefinition targetType;

        public OfGenericField(net.bytebuddy.description.type.TypeDefinition r1, net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined r2) {
                r0 = this;
                r0.<init>()
                r0.targetType = r1
                r0.defined = r2
                return
        }

        public static net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined of(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined r2) {
                net.bytebuddy.implementation.bytecode.member.FieldAccess$OfGenericField r0 = new net.bytebuddy.implementation.bytecode.member.FieldAccess$OfGenericField
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getType()
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
                net.bytebuddy.description.type.TypeDefinition r2 = r4.targetType
                net.bytebuddy.implementation.bytecode.member.FieldAccess$OfGenericField r5 = (net.bytebuddy.implementation.bytecode.member.FieldAccess.OfGenericField) r5
                net.bytebuddy.description.type.TypeDefinition r3 = r5.targetType
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r2 = r4.defined
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r5 = r5.defined
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
                net.bytebuddy.description.type.TypeDefinition r1 = r2.targetType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r1 = r2.defined
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined
        public net.bytebuddy.implementation.bytecode.StackManipulation read() {
                r5 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r1 = r5.defined
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.read()
                net.bytebuddy.description.type.TypeDefinition r2 = r5.targetType
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r2)
                r3 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r3 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
                r4 = 0
                r3[r4] = r1
                r1 = 1
                r3[r1] = r2
                r0.<init>(r3)
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined
        public net.bytebuddy.implementation.bytecode.StackManipulation write() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = r1.defined
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.write()
                return r0
        }
    }

    static {
            net.bytebuddy.implementation.bytecode.member.FieldAccess r6 = new net.bytebuddy.implementation.bytecode.member.FieldAccess
            r4 = 178(0xb2, float:2.5E-43)
            net.bytebuddy.implementation.bytecode.StackSize r5 = net.bytebuddy.implementation.bytecode.StackSize.ZERO
            java.lang.String r1 = "STATIC"
            r2 = 0
            r3 = 179(0xb3, float:2.51E-43)
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            net.bytebuddy.implementation.bytecode.member.FieldAccess.STATIC = r6
            net.bytebuddy.implementation.bytecode.member.FieldAccess r0 = new net.bytebuddy.implementation.bytecode.member.FieldAccess
            r11 = 180(0xb4, float:2.52E-43)
            net.bytebuddy.implementation.bytecode.StackSize r12 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
            java.lang.String r8 = "INSTANCE"
            r9 = 1
            r10 = 181(0xb5, float:2.54E-43)
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)
            net.bytebuddy.implementation.bytecode.member.FieldAccess.INSTANCE = r0
            net.bytebuddy.implementation.bytecode.member.FieldAccess[] r0 = new net.bytebuddy.implementation.bytecode.member.FieldAccess[]{r6, r0}
            net.bytebuddy.implementation.bytecode.member.FieldAccess.$VALUES = r0
            return
    }

    FieldAccess(java.lang.String r1, int r2, int r3, int r4, net.bytebuddy.implementation.bytecode.StackSize r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.putterOpcode = r3
            r0.getterOpcode = r4
            int r1 = r5.getSize()
            r0.targetSizeChange = r1
            return
    }

    public static /* synthetic */ int access$200(net.bytebuddy.implementation.bytecode.member.FieldAccess r0) {
            int r0 = r0.getterOpcode
            return r0
    }

    public static /* synthetic */ int access$300(net.bytebuddy.implementation.bytecode.member.FieldAccess r0) {
            int r0 = r0.targetSizeChange
            return r0
    }

    public static /* synthetic */ int access$400(net.bytebuddy.implementation.bytecode.member.FieldAccess r0) {
            int r0 = r0.putterOpcode
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation forEnumeration(net.bytebuddy.description.enumeration.EnumerationDescription r2) {
            net.bytebuddy.description.type.TypeDescription r0 = r2.getEnumerationType()
            net.bytebuddy.description.field.FieldList r0 = r0.getDeclaredFields()
            java.lang.String r2 = r2.getValue()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r2)
            net.bytebuddy.matcher.FilterableList r2 = r0.filter(r2)
            net.bytebuddy.description.field.FieldList r2 = (net.bytebuddy.description.field.FieldList) r2
            int r0 = r2.size()
            r1 = 1
            if (r0 != r1) goto L57
            java.lang.Object r0 = r2.getOnly()
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r0
            boolean r0 = r0.isStatic()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r2.getOnly()
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r0
            boolean r0 = r0.isPublic()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r2.getOnly()
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r0
            boolean r0 = r0.isEnum()
            if (r0 != 0) goto L42
            goto L57
        L42:
            net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r0 = new net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher
            net.bytebuddy.implementation.bytecode.member.FieldAccess r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.STATIC
            r1.getClass()
            java.lang.Object r2 = r2.getOnly()
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
            r0.<init>(r1, r2)
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r0.read()
            goto L59
        L57:
            net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
        L59:
            return r2
    }

    public static net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined forField(net.bytebuddy.description.field.FieldDescription.InDefinedShape r2) {
            boolean r0 = r2.isStatic()
            if (r0 == 0) goto L11
            net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r0 = new net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher
            net.bytebuddy.implementation.bytecode.member.FieldAccess r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.STATIC
            r1.getClass()
            r0.<init>(r1, r2)
            goto L1b
        L11:
            net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher r0 = new net.bytebuddy.implementation.bytecode.member.FieldAccess$AccessDispatcher
            net.bytebuddy.implementation.bytecode.member.FieldAccess r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.INSTANCE
            r1.getClass()
            r0.<init>(r1, r2)
        L1b:
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.member.FieldAccess.Defined forField(net.bytebuddy.description.field.FieldDescription r3) {
            net.bytebuddy.description.ByteCodeElement$TypeDependant r0 = r3.asDefined()
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r0
            net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
            net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
            net.bytebuddy.description.type.TypeDescription$Generic r2 = r0.getType()
            net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L21
            net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r3 = forField(r0)
            goto L29
        L21:
            net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = forField(r0)
            net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r3 = net.bytebuddy.implementation.bytecode.member.FieldAccess.OfGenericField.of(r3, r0)
        L29:
            return r3
    }

    public static net.bytebuddy.implementation.bytecode.member.FieldAccess valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.bytecode.member.FieldAccess> r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.bytecode.member.FieldAccess r1 = (net.bytebuddy.implementation.bytecode.member.FieldAccess) r1
            return r1
    }

    public static net.bytebuddy.implementation.bytecode.member.FieldAccess[] values() {
            net.bytebuddy.implementation.bytecode.member.FieldAccess[] r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.bytecode.member.FieldAccess[] r0 = (net.bytebuddy.implementation.bytecode.member.FieldAccess[]) r0
            return r0
    }
}
