package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public abstract class FixedValue implements net.bytebuddy.implementation.Implementation {
    protected final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
    protected final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.FixedValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public interface AssignerConfigurable extends net.bytebuddy.implementation.Implementation {
        net.bytebuddy.implementation.Implementation withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForArgument extends net.bytebuddy.implementation.FixedValue implements net.bytebuddy.implementation.FixedValue.AssignerConfigurable, net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final int index;

        public ForArgument(int r3) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.assign.Assigner r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
                r2.<init>(r0, r1, r3)
                return
        }

        private ForArgument(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.index = r3
                return
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r1) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9, net.bytebuddy.description.method.MethodDescription r10) {
                r7 = this;
                net.bytebuddy.description.method.ParameterList r0 = r10.getParameters()
                int r0 = r0.size()
                int r1 = r7.index
                if (r0 <= r1) goto L80
                net.bytebuddy.description.method.ParameterList r0 = r10.getParameters()
                int r1 = r7.index
                java.lang.Object r0 = r0.get(r1)
                net.bytebuddy.description.method.ParameterDescription r0 = (net.bytebuddy.description.method.ParameterDescription) r0
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r0)
                net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r7.assigner
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.getType()
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r10.getReturnType()
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r7.typing
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.assign(r4, r5, r6)
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r10.getReturnType()
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r4)
                r5 = 3
                net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                r6 = 0
                r5[r6] = r2
                r2 = 1
                r5[r2] = r3
                r2 = 2
                r5[r2] = r4
                r1.<init>(r5)
                boolean r2 = r1.isValid()
                if (r2 == 0) goto L5d
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r1.apply(r8, r9)
                int r8 = r8.getMaximalSize()
                int r9 = r10.getStackSize()
                r0.<init>(r8, r9)
                return r0
            L5d:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = "Cannot assign "
                r9.append(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r10 = r10.getReturnType()
                r9.append(r10)
                java.lang.String r10 = " to "
                r9.append(r10)
                r9.append(r0)
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
            L80:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r10)
                java.lang.String r10 = " does not define a parameter with index "
                r9.append(r10)
                int r10 = r7.index
                r9.append(r10)
                java.lang.String r9 = r9.toString()
                r8.<init>(r9)
                throw r8
        }

        @Override // net.bytebuddy.implementation.FixedValue
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
                int r2 = r4.index
                net.bytebuddy.implementation.FixedValue$ForArgument r5 = (net.bytebuddy.implementation.FixedValue.ForArgument) r5
                int r5 = r5.index
                if (r2 == r5) goto L23
                return r1
            L23:
                return r0
        }

        @Override // net.bytebuddy.implementation.FixedValue
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                int r1 = r2.index
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.implementation.FixedValue.AssignerConfigurable
        public net.bytebuddy.implementation.Implementation withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                r2 = this;
                net.bytebuddy.implementation.FixedValue$ForArgument r0 = new net.bytebuddy.implementation.FixedValue$ForArgument
                int r1 = r2.index
                r0.<init>(r3, r4, r1)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForConstantValue extends net.bytebuddy.implementation.FixedValue implements net.bytebuddy.implementation.FixedValue.AssignerConfigurable, net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final net.bytebuddy.description.type.TypeDescription loadedType;
        private final net.bytebuddy.implementation.bytecode.StackManipulation valueLoadInstruction;

        public ForConstantValue(net.bytebuddy.implementation.bytecode.StackManipulation r1, java.lang.Class<?> r2) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                r0.<init>(r1, r2)
                return
        }

        public ForConstantValue(net.bytebuddy.implementation.bytecode.StackManipulation r3, net.bytebuddy.description.type.TypeDescription r4) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.assign.Assigner r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
                r2.<init>(r0, r1, r3, r4)
                return
        }

        private ForConstantValue(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.implementation.bytecode.StackManipulation r3, net.bytebuddy.description.type.TypeDescription r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.valueLoadInstruction = r3
                r0.loadedType = r4
                return
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r1) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9, net.bytebuddy.description.method.MethodDescription r10) {
                r7 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r7.loadedType
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r0.asGenericType()
                net.bytebuddy.implementation.bytecode.StackManipulation r6 = r7.valueLoadInstruction
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r8 = r1.apply(r2, r3, r4, r5, r6)
                return r8
        }

        @Override // net.bytebuddy.implementation.FixedValue
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
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.valueLoadInstruction
                net.bytebuddy.implementation.FixedValue$ForConstantValue r5 = (net.bytebuddy.implementation.FixedValue.ForConstantValue) r5
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.valueLoadInstruction
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                net.bytebuddy.description.type.TypeDescription r2 = r4.loadedType
                net.bytebuddy.description.type.TypeDescription r5 = r5.loadedType
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L32
                return r1
            L32:
                return r0
        }

        @Override // net.bytebuddy.implementation.FixedValue
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.valueLoadInstruction
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.loadedType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.implementation.FixedValue.AssignerConfigurable
        public net.bytebuddy.implementation.Implementation withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
                r3 = this;
                net.bytebuddy.implementation.FixedValue$ForConstantValue r0 = new net.bytebuddy.implementation.FixedValue$ForConstantValue
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r3.valueLoadInstruction
                net.bytebuddy.description.type.TypeDescription r2 = r3.loadedType
                r0.<init>(r4, r5, r1, r2)
                return r0
        }
    }

    public enum ForNullValue extends java.lang.Enum<net.bytebuddy.implementation.FixedValue.ForNullValue> implements net.bytebuddy.implementation.Implementation, net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private static final /* synthetic */ net.bytebuddy.implementation.FixedValue.ForNullValue[] $VALUES = null;
        public static final net.bytebuddy.implementation.FixedValue.ForNullValue INSTANCE = null;

        static {
                net.bytebuddy.implementation.FixedValue$ForNullValue r0 = new net.bytebuddy.implementation.FixedValue$ForNullValue
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.FixedValue.ForNullValue.INSTANCE = r0
                net.bytebuddy.implementation.FixedValue$ForNullValue[] r0 = new net.bytebuddy.implementation.FixedValue.ForNullValue[]{r0}
                net.bytebuddy.implementation.FixedValue.ForNullValue.$VALUES = r0
                return
        }

        ForNullValue(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.FixedValue.ForNullValue valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.FixedValue$ForNullValue> r0 = net.bytebuddy.implementation.FixedValue.ForNullValue.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.FixedValue$ForNullValue r1 = (net.bytebuddy.implementation.FixedValue.ForNullValue) r1
                return r1
        }

        public static net.bytebuddy.implementation.FixedValue.ForNullValue[] values() {
                net.bytebuddy.implementation.FixedValue$ForNullValue[] r0 = net.bytebuddy.implementation.FixedValue.ForNullValue.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.FixedValue$ForNullValue[] r0 = (net.bytebuddy.implementation.FixedValue.ForNullValue[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r1) {
                r0 = this;
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r5, net.bytebuddy.implementation.Implementation.Context r6, net.bytebuddy.description.method.MethodDescription r7) {
                r4 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r7.getReturnType()
                boolean r0 = r0.isPrimitive()
                if (r0 != 0) goto L21
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                r1 = 2
                net.bytebuddy.implementation.bytecode.StackManipulation[] r1 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                net.bytebuddy.implementation.bytecode.constant.NullConstant r2 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                r3 = 0
                r1[r3] = r2
                net.bytebuddy.implementation.bytecode.member.MethodReturn r2 = net.bytebuddy.implementation.bytecode.member.MethodReturn.REFERENCE
                r3 = 1
                r1[r3] = r2
                r0.<init>(r1)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r5 = r0.apply(r5, r6, r7)
                return r5
            L21:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Cannot return null from "
                r6.append(r0)
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                throw r5
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }
    }

    public static class ForOriginType extends net.bytebuddy.implementation.FixedValue implements net.bytebuddy.implementation.FixedValue.AssignerConfigurable {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.description.type.TypeDescription originType;
            final /* synthetic */ net.bytebuddy.implementation.FixedValue.ForOriginType this$0;

            public Appender(net.bytebuddy.implementation.FixedValue.ForOriginType r1, net.bytebuddy.description.type.TypeDescription r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.originType = r2
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                    r6 = this;
                    net.bytebuddy.implementation.FixedValue$ForOriginType r0 = r6.this$0
                    java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
                    net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r1.asGenericType()
                    net.bytebuddy.description.type.TypeDescription r1 = r6.originType
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r1)
                    r1 = r7
                    r2 = r8
                    r3 = r9
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r7 = r0.apply(r1, r2, r3, r4, r5)
                    return r7
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.originType
                    net.bytebuddy.implementation.FixedValue$ForOriginType$Appender r5 = (net.bytebuddy.implementation.FixedValue.ForOriginType.Appender) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.originType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.FixedValue$ForOriginType r2 = r4.this$0
                    net.bytebuddy.implementation.FixedValue$ForOriginType r5 = r5.this$0
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.originType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.FixedValue$ForOriginType r1 = r2.this$0
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public ForOriginType() {
                r2 = this;
                net.bytebuddy.implementation.bytecode.assign.Assigner r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
                r2.<init>(r0, r1)
                return
        }

        private ForOriginType(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                r1 = this;
                net.bytebuddy.implementation.FixedValue$ForOriginType$Appender r0 = new net.bytebuddy.implementation.FixedValue$ForOriginType$Appender
                net.bytebuddy.description.type.TypeDefinition r2 = r2.getOriginType()
                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.implementation.FixedValue.AssignerConfigurable
        public net.bytebuddy.implementation.Implementation withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                r1 = this;
                net.bytebuddy.implementation.FixedValue$ForOriginType r0 = new net.bytebuddy.implementation.FixedValue$ForOriginType
                r0.<init>(r2, r3)
                return r0
        }
    }

    public static class ForThisValue extends net.bytebuddy.implementation.FixedValue implements net.bytebuddy.implementation.FixedValue.AssignerConfigurable {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public Appender(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r5, net.bytebuddy.implementation.Implementation.Context r6, net.bytebuddy.description.method.MethodDescription r7) {
                    r4 = this;
                    boolean r0 = r7.isStatic()
                    if (r0 != 0) goto L2f
                    net.bytebuddy.description.type.TypeDescription r0 = r4.instrumentedType
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r7.getReturnType()
                    net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                    boolean r0 = r0.isAssignableTo(r1)
                    if (r0 == 0) goto L2f
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple r0 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Simple
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    r2 = 2
                    net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                    r3 = 0
                    r2[r3] = r1
                    net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.REFERENCE
                    r3 = 1
                    r2[r3] = r1
                    r0.<init>(r2)
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r5 = r0.apply(r5, r6, r7)
                    return r5
                L2f:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    java.lang.String r0 = "Cannot return 'this' from "
                    r6.append(r0)
                    r6.append(r7)
                    java.lang.String r6 = r6.toString()
                    r5.<init>(r6)
                    throw r5
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.FixedValue$ForThisValue$Appender r5 = (net.bytebuddy.implementation.FixedValue.ForThisValue.Appender) r5
                    net.bytebuddy.description.type.TypeDescription r5 = r5.instrumentedType
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
                    net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public ForThisValue() {
                r2 = this;
                net.bytebuddy.implementation.bytecode.assign.Assigner r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
                r2.<init>(r0, r1)
                return
        }

        private ForThisValue(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                r1 = this;
                net.bytebuddy.implementation.FixedValue$ForThisValue$Appender r0 = new net.bytebuddy.implementation.FixedValue$ForThisValue$Appender
                net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.implementation.FixedValue.AssignerConfigurable
        public net.bytebuddy.implementation.Implementation withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                r1 = this;
                net.bytebuddy.implementation.FixedValue$ForThisValue r0 = new net.bytebuddy.implementation.FixedValue$ForThisValue
                r0.<init>(r2, r3)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForValue extends net.bytebuddy.implementation.FixedValue implements net.bytebuddy.implementation.FixedValue.AssignerConfigurable {
        private static final java.lang.String PREFIX = "value";
        private final java.lang.String name;
        private final java.lang.Object value;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public class StaticFieldByteCodeAppender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.implementation.bytecode.StackManipulation fieldGetAccess;
            final /* synthetic */ net.bytebuddy.implementation.FixedValue.ForValue this$0;

            private StaticFieldByteCodeAppender(net.bytebuddy.implementation.FixedValue.ForValue r1, net.bytebuddy.description.type.TypeDescription r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    net.bytebuddy.description.field.FieldList r2 = r2.getDeclaredFields()
                    java.lang.String r1 = net.bytebuddy.implementation.FixedValue.ForValue.access$100(r1)
                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                    net.bytebuddy.matcher.FilterableList r1 = r2.filter(r1)
                    net.bytebuddy.description.field.FieldList r1 = (net.bytebuddy.description.field.FieldList) r1
                    java.lang.Object r1 = r1.getOnly()
                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r1
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r1)
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.read()
                    r0.fieldGetAccess = r1
                    return
            }

            public /* synthetic */ StaticFieldByteCodeAppender(net.bytebuddy.implementation.FixedValue.ForValue r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.FixedValue.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                    r6 = this;
                    net.bytebuddy.implementation.FixedValue$ForValue r0 = r6.this$0
                    java.lang.Object r1 = net.bytebuddy.implementation.FixedValue.ForValue.access$200(r0)
                    java.lang.Class r1 = r1.getClass()
                    net.bytebuddy.description.type.TypeDescription$Generic r4 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r1)
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r6.fieldGetAccess
                    r1 = r7
                    r2 = r8
                    r3 = r9
                    net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r7 = r0.apply(r1, r2, r3, r4, r5)
                    return r7
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
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.fieldGetAccess
                    net.bytebuddy.implementation.FixedValue$ForValue$StaticFieldByteCodeAppender r5 = (net.bytebuddy.implementation.FixedValue.ForValue.StaticFieldByteCodeAppender) r5
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.fieldGetAccess
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
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.fieldGetAccess
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public ForValue(java.lang.Object r3, java.lang.String r4) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.assign.Assigner r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
                r2.<init>(r0, r1, r3, r4)
                return
        }

        private ForValue(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, java.lang.Object r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.name = r4
                r0.value = r3
                return
        }

        public static /* synthetic */ java.lang.String access$100(net.bytebuddy.implementation.FixedValue.ForValue r0) {
                java.lang.String r0 = r0.name
                return r0
        }

        public static /* synthetic */ java.lang.Object access$200(net.bytebuddy.implementation.FixedValue.ForValue r0) {
                java.lang.Object r0 = r0.value
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r3) {
                r2 = this;
                net.bytebuddy.implementation.FixedValue$ForValue$StaticFieldByteCodeAppender r0 = new net.bytebuddy.implementation.FixedValue$ForValue$StaticFieldByteCodeAppender
                net.bytebuddy.description.type.TypeDescription r3 = r3.getInstrumentedType()
                r1 = 0
                r0.<init>(r2, r3, r1)
                return r0
        }

        @Override // net.bytebuddy.implementation.FixedValue
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
                java.lang.String r2 = r4.name
                net.bytebuddy.implementation.FixedValue$ForValue r5 = (net.bytebuddy.implementation.FixedValue.ForValue) r5
                java.lang.String r3 = r5.name
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L27
                return r1
            L27:
                java.lang.Object r2 = r4.value
                java.lang.Object r5 = r5.value
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L32
                return r1
            L32:
                return r0
        }

        @Override // net.bytebuddy.implementation.FixedValue
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                java.lang.String r1 = r2.name
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.Object r1 = r2.value
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r5) {
                r4 = this;
                net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                java.lang.String r1 = r4.name
                java.lang.Object r2 = r4.value
                java.lang.Class r2 = r2.getClass()
                net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
                r3 = 4169(0x1049, float:5.842E-42)
                r0.<init>(r1, r3, r2)
                java.lang.Object r1 = r4.value
                net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withAuxiliaryField(r0, r1)
                return r5
        }

        @Override // net.bytebuddy.implementation.FixedValue.AssignerConfigurable
        public net.bytebuddy.implementation.Implementation withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
                r3 = this;
                net.bytebuddy.implementation.FixedValue$ForValue r0 = new net.bytebuddy.implementation.FixedValue$ForValue
                java.lang.Object r1 = r3.value
                java.lang.String r2 = r3.name
                r0.<init>(r4, r5, r1, r2)
                return r0
        }
    }

    public FixedValue(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2) {
            r0 = this;
            r0.<init>()
            r0.assigner = r1
            r0.typing = r2
            return
    }

    public static net.bytebuddy.implementation.FixedValue.AssignerConfigurable argument(int r3) {
            if (r3 < 0) goto L8
            net.bytebuddy.implementation.FixedValue$ForArgument r0 = new net.bytebuddy.implementation.FixedValue$ForArgument
            r0.<init>(r3)
            return r0
        L8:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Argument index cannot be negative: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static net.bytebuddy.implementation.Implementation nullValue() {
            net.bytebuddy.implementation.FixedValue$ForNullValue r0 = net.bytebuddy.implementation.FixedValue.ForNullValue.INSTANCE
            return r0
    }

    public static net.bytebuddy.implementation.FixedValue.AssignerConfigurable originType() {
            net.bytebuddy.implementation.FixedValue$ForOriginType r0 = new net.bytebuddy.implementation.FixedValue$ForOriginType
            r0.<init>()
            return r0
    }

    public static net.bytebuddy.implementation.FixedValue.AssignerConfigurable reference(java.lang.Object r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "value$"
            r0.append(r1)
            java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.bytebuddy.implementation.FixedValue$AssignerConfigurable r2 = reference(r2, r0)
            return r2
    }

    public static net.bytebuddy.implementation.FixedValue.AssignerConfigurable reference(java.lang.Object r1, java.lang.String r2) {
            net.bytebuddy.implementation.FixedValue$ForValue r0 = new net.bytebuddy.implementation.FixedValue$ForValue
            r0.<init>(r1, r2)
            return r0
    }

    public static net.bytebuddy.implementation.FixedValue.AssignerConfigurable self() {
            net.bytebuddy.implementation.FixedValue$ForThisValue r0 = new net.bytebuddy.implementation.FixedValue$ForThisValue
            r0.<init>()
            return r0
    }

    public static net.bytebuddy.implementation.FixedValue.AssignerConfigurable value(java.lang.Object r2) {
            net.bytebuddy.utility.ConstantValue r0 = net.bytebuddy.utility.ConstantValue.Simple.wrapOrNull(r2)
            if (r0 != 0) goto Lb
            net.bytebuddy.implementation.FixedValue$AssignerConfigurable r2 = reference(r2)
            goto L18
        Lb:
            net.bytebuddy.implementation.FixedValue$ForConstantValue r2 = new net.bytebuddy.implementation.FixedValue$ForConstantValue
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.toStackManipulation()
            net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeDescription()
            r2.<init>(r1, r0)
        L18:
            return r2
    }

    public static net.bytebuddy.implementation.FixedValue.AssignerConfigurable value(net.bytebuddy.description.type.TypeDescription r2) {
            net.bytebuddy.implementation.FixedValue$ForConstantValue r0 = new net.bytebuddy.implementation.FixedValue$ForConstantValue
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r2)
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
            r0.<init>(r2, r1)
            return r0
    }

    public static net.bytebuddy.implementation.FixedValue.AssignerConfigurable value(net.bytebuddy.utility.ConstantValue r2) {
            net.bytebuddy.implementation.FixedValue$ForConstantValue r0 = new net.bytebuddy.implementation.FixedValue$ForConstantValue
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.toStackManipulation()
            net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeDescription()
            r0.<init>(r1, r2)
            return r0
    }

    public static net.bytebuddy.implementation.FixedValue.AssignerConfigurable value(net.bytebuddy.utility.JavaConstant r0) {
            net.bytebuddy.implementation.FixedValue$AssignerConfigurable r0 = value(r0)
            return r0
    }

    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r5, net.bytebuddy.implementation.Implementation.Context r6, net.bytebuddy.description.method.MethodDescription r7, net.bytebuddy.description.type.TypeDescription.Generic r8, net.bytebuddy.implementation.bytecode.StackManipulation r9) {
            r4 = this;
            net.bytebuddy.implementation.bytecode.assign.Assigner r0 = r4.assigner
            net.bytebuddy.description.type.TypeDescription$Generic r1 = r7.getReturnType()
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
            net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.assign(r8, r1, r2)
            boolean r1 = r0.isValid()
            if (r1 == 0) goto L3d
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r8 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            net.bytebuddy.description.type.TypeDescription$Generic r1 = r7.getReturnType()
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r1)
            r2 = 3
            net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
            r3 = 0
            r2[r3] = r9
            r9 = 1
            r2[r9] = r0
            r9 = 2
            r2[r9] = r1
            r8.<init>(r2)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r5 = r8.apply(r5, r6)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r6 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
            int r5 = r5.getMaximalSize()
            int r7 = r7.getStackSize()
            r6.<init>(r5, r7)
            return r6
        L3d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "Cannot return value of type "
            r6.append(r9)
            r6.append(r8)
            java.lang.String r8 = " for "
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
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
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
            net.bytebuddy.implementation.FixedValue r5 = (net.bytebuddy.implementation.FixedValue) r5
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
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
            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
