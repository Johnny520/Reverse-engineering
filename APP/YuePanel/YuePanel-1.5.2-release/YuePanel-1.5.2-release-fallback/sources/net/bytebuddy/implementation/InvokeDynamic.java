package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class InvokeDynamic implements net.bytebuddy.implementation.Implementation.Composable {
    protected final java.util.List<? extends net.bytebuddy.utility.JavaConstant> arguments;
    protected final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
    protected final net.bytebuddy.description.method.MethodDescription.InDefinedShape bootstrap;
    protected final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider invocationProvider;
    protected final net.bytebuddy.implementation.InvokeDynamic.TerminationHandler terminationHandler;
    protected final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.InvokeDynamic$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static abstract class AbstractDelegator extends net.bytebuddy.implementation.InvokeDynamic {
        public AbstractDelegator(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2, net.bytebuddy.implementation.InvokeDynamic.InvocationProvider r3, net.bytebuddy.implementation.InvokeDynamic.TerminationHandler r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.implementation.Implementation.Composable
        public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.Implementation r2 = r0.andThen(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.implementation.Implementation
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r2 = r0.appender(r2)
                return r2
        }

        public abstract net.bytebuddy.implementation.InvokeDynamic materialize();

        @Override // net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.dynamic.scaffold.InstrumentedType r2 = r0.prepare(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withArgument(int r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r2 = r0.withArgument(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withArgument(int... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withArgument(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.Implementation.Composable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.Implementation$Composable r2 = r0.withAssigner(r2, r3)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withBooleanValue(boolean... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withBooleanValue(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withByteValue(byte... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withByteValue(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withCharacterValue(char... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withCharacterValue(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withDoubleValue(double... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withDoubleValue(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withEnumeration(net.bytebuddy.description.enumeration.EnumerationDescription... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withEnumeration(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withField(java.lang.String r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r2 = r0.withField(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withField(java.lang.String r2, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r3) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r2 = r0.withField(r2, r3)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withField(net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2, java.lang.String... r3) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withField(r2, r3)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withField(java.lang.String... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withField(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withFloatValue(float... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withFloatValue(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withImplicitAndMethodArguments() {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r0 = r0.withImplicitAndMethodArguments()
                return r0
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withInstance(net.bytebuddy.utility.JavaConstant... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withInstance(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withIntegerValue(int... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withIntegerValue(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withLongValue(long... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withLongValue(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withMethodArguments() {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r0 = r0.withMethodArguments()
                return r0
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withNullValue(java.lang.Class<?>... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withNullValue(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withNullValue(net.bytebuddy.description.type.TypeDescription... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withNullValue(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withReference(java.lang.Object r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r2 = r0.withReference(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withReference(java.lang.Object... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withReference(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withShortValue(short... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withShortValue(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withThis(java.lang.Class<?>... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withThis(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withThis(net.bytebuddy.description.type.TypeDescription... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withThis(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withType(net.bytebuddy.description.type.TypeDescription... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withType(r2)
                return r2
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic withValue(java.lang.Object... r2) {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.materialize()
                net.bytebuddy.implementation.InvokeDynamic r2 = r0.withValue(r2)
                return r2
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final net.bytebuddy.description.type.TypeDescription instrumentedType;
        final /* synthetic */ net.bytebuddy.implementation.InvokeDynamic this$0;

        public Appender(net.bytebuddy.implementation.InvokeDynamic r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.instrumentedType = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r9, net.bytebuddy.implementation.Implementation.Context r10, net.bytebuddy.description.method.MethodDescription r11) {
                r8 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r8.this$0
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r0.invocationProvider
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Target r0 = r0.make(r11)
                net.bytebuddy.description.type.TypeDescription r1 = r8.instrumentedType
                net.bytebuddy.implementation.InvokeDynamic r2 = r8.this$0
                net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r2.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r2.typing
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Target$Resolved r0 = r0.resolve(r1, r3, r2)
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r0.getStackManipulation()
                net.bytebuddy.implementation.InvokeDynamic r3 = r8.this$0
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r3.bootstrap
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)
                java.lang.String r4 = r0.getInternalName()
                net.bytebuddy.description.type.TypeDescription r5 = r0.getReturnType()
                java.util.List r6 = r0.getParameterTypes()
                net.bytebuddy.implementation.InvokeDynamic r7 = r8.this$0
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r7 = r7.arguments
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.dynamic(r4, r5, r6, r7)
                net.bytebuddy.implementation.InvokeDynamic r4 = r8.this$0
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r4.terminationHandler
                net.bytebuddy.description.type.TypeDescription r0 = r0.getReturnType()
                net.bytebuddy.implementation.InvokeDynamic r5 = r8.this$0
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r5.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r5 = r5.typing
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r4.resolve(r11, r0, r6, r5)
                r4 = 3
                net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                r5 = 0
                r4[r5] = r2
                r2 = 1
                r4[r2] = r3
                r2 = 2
                r4[r2] = r0
                r1.<init>(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r9 = r1.apply(r9, r10)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r10 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                int r9 = r9.getMaximalSize()
                int r11 = r11.getStackSize()
                r10.<init>(r9, r11)
                return r10
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
                net.bytebuddy.implementation.InvokeDynamic$Appender r5 = (net.bytebuddy.implementation.InvokeDynamic.Appender) r5
                net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.InvokeDynamic r2 = r4.this$0
                net.bytebuddy.implementation.InvokeDynamic r5 = r5.this$0
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
                net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.InvokeDynamic r1 = r2.this$0
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public interface InvocationProvider {

        public interface ArgumentProvider {

            public enum ConstantPoolWrapper extends java.lang.Enum<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper> {
                private static final /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper[] $VALUES = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper BOOLEAN = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper BYTE = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper CHARACTER = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper DOUBLE = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper FLOAT = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper INTEGER = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper LONG = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper SHORT = null;
                private final net.bytebuddy.description.type.TypeDescription primitiveType;
                private final net.bytebuddy.description.type.TypeDescription wrapperType;









                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                public class WrappingArgumentProvider implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                    private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
                    final /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper this$0;

                    public WrappingArgumentProvider(net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper r1, net.bytebuddy.implementation.bytecode.StackManipulation r2) {
                            r0 = this;
                            r0.this$0 = r1
                            r0.<init>()
                            r0.stackManipulation = r2
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
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r2 = r4.this$0
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$WrappingArgumentProvider r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.WrappingArgumentProvider) r5
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r3 = r5.this$0
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                            net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.stackManipulation
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
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r1 = r2.this$0
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                    public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                            r0 = this;
                            return r1
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                    public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.method.MethodDescription r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                            r3 = this;
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            net.bytebuddy.implementation.bytecode.StackManipulation r0 = r3.stackManipulation
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r1 = r3.this$0
                            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.access$100(r1)
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r2 = r3.this$0
                            net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.access$200(r2)
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                            net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.assign(r1, r2, r7)
                            r7 = 2
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r7 = new net.bytebuddy.implementation.bytecode.StackManipulation[r7]
                            r1 = 0
                            r7[r1] = r0
                            r0 = 1
                            r7[r0] = r6
                            r5.<init>(r7)
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r6 = r3.this$0
                            net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.access$200(r6)
                            r4.<init>(r5, r6)
                            return r4
                    }
                }

                static {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$1 r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$1
                        java.lang.Class r1 = java.lang.Boolean.TYPE
                        java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
                        java.lang.String r3 = "BOOLEAN"
                        r4 = 0
                        r0.<init>(r3, r4, r1, r2)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.BOOLEAN = r0
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$2 r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$2
                        java.lang.Class r2 = java.lang.Byte.TYPE
                        java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
                        java.lang.String r5 = "BYTE"
                        r6 = 1
                        r1.<init>(r5, r6, r2, r3)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.BYTE = r1
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$3 r2 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$3
                        java.lang.Class r3 = java.lang.Short.TYPE
                        java.lang.Class<java.lang.Short> r5 = java.lang.Short.class
                        java.lang.String r7 = "SHORT"
                        r8 = 2
                        r2.<init>(r7, r8, r3, r5)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.SHORT = r2
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$4 r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$4
                        java.lang.Class r5 = java.lang.Character.TYPE
                        java.lang.Class<java.lang.Character> r7 = java.lang.Character.class
                        java.lang.String r9 = "CHARACTER"
                        r10 = 3
                        r3.<init>(r9, r10, r5, r7)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.CHARACTER = r3
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$5 r5 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$5
                        java.lang.Class r7 = java.lang.Integer.TYPE
                        java.lang.Class<java.lang.Integer> r9 = java.lang.Integer.class
                        java.lang.String r11 = "INTEGER"
                        r12 = 4
                        r5.<init>(r11, r12, r7, r9)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.INTEGER = r5
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$6 r7 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$6
                        java.lang.Class r9 = java.lang.Long.TYPE
                        java.lang.Class<java.lang.Long> r11 = java.lang.Long.class
                        java.lang.String r13 = "LONG"
                        r14 = 5
                        r7.<init>(r13, r14, r9, r11)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.LONG = r7
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$7 r9 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$7
                        java.lang.Class r11 = java.lang.Float.TYPE
                        java.lang.Class<java.lang.Float> r13 = java.lang.Float.class
                        java.lang.String r15 = "FLOAT"
                        r14 = 6
                        r9.<init>(r15, r14, r11, r13)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.FLOAT = r9
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$8 r11 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper$8
                        java.lang.Class r13 = java.lang.Double.TYPE
                        java.lang.Class<java.lang.Double> r15 = java.lang.Double.class
                        java.lang.String r14 = "DOUBLE"
                        r12 = 7
                        r11.<init>(r14, r12, r13, r15)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.DOUBLE = r11
                        r13 = 8
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper[] r13 = new net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper[r13]
                        r13[r4] = r0
                        r13[r6] = r1
                        r13[r8] = r2
                        r13[r10] = r3
                        r0 = 4
                        r13[r0] = r5
                        r0 = 5
                        r13[r0] = r7
                        r0 = 6
                        r13[r0] = r9
                        r13[r12] = r11
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.$VALUES = r13
                        return
                }

                ConstantPoolWrapper(java.lang.String r1, int r2, java.lang.Class r3, java.lang.Class r4) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r0.primitiveType = r1
                        net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                        r0.wrapperType = r1
                        return
                }

                /* synthetic */ ConstantPoolWrapper(java.lang.String r1, int r2, java.lang.Class r3, java.lang.Class r4, net.bytebuddy.implementation.InvokeDynamic.AnonymousClass1 r5) {
                        r0 = this;
                        r0.<init>(r1, r2, r3, r4)
                        return
                }

                public static /* synthetic */ net.bytebuddy.description.type.TypeDescription access$100(net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper r0) {
                        net.bytebuddy.description.type.TypeDescription r0 = r0.primitiveType
                        return r0
                }

                public static /* synthetic */ net.bytebuddy.description.type.TypeDescription access$200(net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper r0) {
                        net.bytebuddy.description.type.TypeDescription r0 = r0.wrapperType
                        return r0
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider of(java.lang.Object r2) {
                        boolean r0 = r2 instanceof java.lang.Boolean
                        if (r0 == 0) goto Lb
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.BOOLEAN
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r2 = r0.make(r2)
                        return r2
                    Lb:
                        boolean r0 = r2 instanceof java.lang.Byte
                        if (r0 == 0) goto L16
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.BYTE
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r2 = r0.make(r2)
                        return r2
                    L16:
                        boolean r0 = r2 instanceof java.lang.Short
                        if (r0 == 0) goto L21
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.SHORT
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r2 = r0.make(r2)
                        return r2
                    L21:
                        boolean r0 = r2 instanceof java.lang.Character
                        if (r0 == 0) goto L2c
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.CHARACTER
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r2 = r0.make(r2)
                        return r2
                    L2c:
                        boolean r0 = r2 instanceof java.lang.Integer
                        if (r0 == 0) goto L37
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.INTEGER
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r2 = r0.make(r2)
                        return r2
                    L37:
                        boolean r0 = r2 instanceof java.lang.Long
                        if (r0 == 0) goto L42
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.LONG
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r2 = r0.make(r2)
                        return r2
                    L42:
                        boolean r0 = r2 instanceof java.lang.Float
                        if (r0 == 0) goto L4d
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.FLOAT
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r2 = r0.make(r2)
                        return r2
                    L4d:
                        boolean r0 = r2 instanceof java.lang.Double
                        if (r0 == 0) goto L58
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.DOUBLE
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r2 = r0.make(r2)
                        return r2
                    L58:
                        boolean r0 = r2 instanceof java.lang.String
                        if (r0 == 0) goto L64
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForStringConstant r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForStringConstant
                        java.lang.String r2 = (java.lang.String) r2
                        r0.<init>(r2)
                        return r0
                    L64:
                        boolean r0 = r2 instanceof java.lang.Class
                        if (r0 == 0) goto L74
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant
                        java.lang.Class r2 = (java.lang.Class) r2
                        net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                        r0.<init>(r2)
                        return r0
                    L74:
                        boolean r0 = r2 instanceof net.bytebuddy.description.type.TypeDescription
                        if (r0 == 0) goto L80
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant
                        net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                        r0.<init>(r2)
                        return r0
                    L80:
                        boolean r0 = r2 instanceof java.lang.Enum
                        if (r0 == 0) goto L91
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue
                        net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration r1 = new net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration
                        java.lang.Enum r2 = (java.lang.Enum) r2
                        r1.<init>(r2)
                        r0.<init>(r1)
                        return r0
                    L91:
                        boolean r0 = r2 instanceof net.bytebuddy.description.enumeration.EnumerationDescription
                        if (r0 == 0) goto L9d
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue
                        net.bytebuddy.description.enumeration.EnumerationDescription r2 = (net.bytebuddy.description.enumeration.EnumerationDescription) r2
                        r0.<init>(r2)
                        return r0
                    L9d:
                        net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                        boolean r0 = r0.isInstance(r2)
                        if (r0 == 0) goto Laf
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant
                        net.bytebuddy.utility.JavaConstant$MethodHandle r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.ofLoaded(r2)
                        r0.<init>(r2)
                        return r0
                    Laf:
                        net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_TYPE
                        boolean r0 = r0.isInstance(r2)
                        if (r0 == 0) goto Lc1
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant
                        net.bytebuddy.utility.JavaConstant$MethodType r2 = net.bytebuddy.utility.JavaConstant.MethodType.ofLoaded(r2)
                        r0.<init>(r2)
                        return r0
                    Lc1:
                        boolean r0 = r2 instanceof net.bytebuddy.utility.JavaConstant
                        if (r0 == 0) goto Lcd
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant
                        net.bytebuddy.utility.JavaConstant r2 = (net.bytebuddy.utility.JavaConstant) r2
                        r0.<init>(r2)
                        return r0
                    Lcd:
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r2 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInstance.of(r2)
                        return r2
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper> r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper r1 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper) r1
                        return r1
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper[] values() {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper[] r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ConstantPoolWrapper[] r0 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper[]) r0
                        return r0
                }

                public abstract net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider make(java.lang.Object r1);
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForBooleanConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final boolean value;

                public ForBooleanConstant(boolean r1) {
                        r0 = this;
                        r0.<init>()
                        r0.value = r1
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
                        boolean r2 = r4.value
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForBooleanConstant r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForBooleanConstant) r5
                        boolean r5 = r5.value
                        if (r2 == r5) goto L1c
                        return r1
                    L1c:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        boolean r1 = r2.value
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        boolean r2 = r0.value
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                        java.lang.Class r3 = java.lang.Boolean.TYPE
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForByteConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final byte value;

                public ForByteConstant(byte r1) {
                        r0 = this;
                        r0.<init>()
                        r0.value = r1
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
                        byte r2 = r4.value
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForByteConstant r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForByteConstant) r5
                        byte r5 = r5.value
                        if (r2 == r5) goto L1c
                        return r1
                    L1c:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        byte r1 = r2.value
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        byte r2 = r0.value
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                        java.lang.Class r3 = java.lang.Byte.TYPE
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForCharacterConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final char value;

                public ForCharacterConstant(char r1) {
                        r0 = this;
                        r0.<init>()
                        r0.value = r1
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
                        char r2 = r4.value
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForCharacterConstant r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForCharacterConstant) r5
                        char r5 = r5.value
                        if (r2 == r5) goto L1c
                        return r1
                    L1c:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        char r1 = r2.value
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        char r2 = r0.value
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                        java.lang.Class r3 = java.lang.Character.TYPE
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForClassConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForClassConstant(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForClassConstant) r5
                        net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
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
                        net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.description.type.TypeDescription r2 = r0.typeDescription
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r2)
                        java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForDoubleConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final double value;

                public ForDoubleConstant(double r1) {
                        r0 = this;
                        r0.<init>()
                        r0.value = r1
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r7) {
                        r6 = this;
                        r0 = 1
                        if (r6 != r7) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r7 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r6.getClass()
                        java.lang.Class r3 = r7.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        double r2 = r6.value
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForDoubleConstant r7 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForDoubleConstant) r7
                        double r4 = r7.value
                        int r7 = java.lang.Double.compare(r2, r4)
                        if (r7 == 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r5 = this;
                        java.lang.Class r0 = r5.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        double r1 = r5.value
                        long r1 = java.lang.Double.doubleToLongBits(r1)
                        r3 = 32
                        long r3 = r1 >>> r3
                        long r1 = r1 ^ r3
                        int r1 = (int) r1
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        double r2 = r0.value
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.DoubleConstant.forValue(r2)
                        java.lang.Class r3 = java.lang.Double.TYPE
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForEnumerationValue implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final net.bytebuddy.description.enumeration.EnumerationDescription enumerationDescription;

                public ForEnumerationValue(net.bytebuddy.description.enumeration.EnumerationDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.enumerationDescription = r1
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
                        net.bytebuddy.description.enumeration.EnumerationDescription r2 = r4.enumerationDescription
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForEnumerationValue) r5
                        net.bytebuddy.description.enumeration.EnumerationDescription r5 = r5.enumerationDescription
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
                        net.bytebuddy.description.enumeration.EnumerationDescription r1 = r2.enumerationDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.description.enumeration.EnumerationDescription r2 = r0.enumerationDescription
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forEnumeration(r2)
                        net.bytebuddy.description.enumeration.EnumerationDescription r3 = r0.enumerationDescription
                        net.bytebuddy.description.type.TypeDescription r3 = r3.getEnumerationType()
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForField implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                protected final net.bytebuddy.dynamic.scaffold.FieldLocator.Factory fieldLocatorFactory;
                protected final java.lang.String fieldName;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class WithExplicitType extends net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForField {
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    public WithExplicitType(java.lang.String r1, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2, net.bytebuddy.description.type.TypeDescription r3) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            r0.typeDescription = r3
                            return
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForField
                    public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved doResolve(net.bytebuddy.implementation.bytecode.StackManipulation r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                            net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.assign(r4, r0, r6)
                            boolean r6 = r5.isValid()
                            if (r6 == 0) goto L26
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r6 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r0 = 2
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                            r1 = 0
                            r0[r1] = r3
                            r3 = 1
                            r0[r3] = r5
                            r6.<init>(r0)
                            net.bytebuddy.description.type.TypeDescription r3 = r2.typeDescription
                            r4.<init>(r6, r3)
                            return r4
                        L26:
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r5 = new java.lang.StringBuilder
                            r5.<init>()
                            java.lang.String r6 = "Cannot assign "
                            r5.append(r6)
                            r5.append(r4)
                            java.lang.String r4 = " to "
                            r5.append(r4)
                            net.bytebuddy.description.type.TypeDescription r4 = r2.typeDescription
                            r5.append(r4)
                            java.lang.String r4 = r5.toString()
                            r3.<init>(r4)
                            throw r3
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForField
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
                            net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForField$WithExplicitType r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForField.WithExplicitType) r5
                            net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L27
                            return r1
                        L27:
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForField
                    public int hashCode() {
                            r2 = this;
                            int r0 = super.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                public ForField(java.lang.String r1, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2) {
                        r0 = this;
                        r0.<init>()
                        r0.fieldName = r1
                        r0.fieldLocatorFactory = r2
                        return
                }

                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved doResolve(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                        r3.<init>(r1, r2)
                        return r3
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
                        java.lang.String r2 = r4.fieldName
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForField r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForField) r5
                        java.lang.String r3 = r5.fieldName
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r2 = r4.fieldLocatorFactory
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r5 = r5.fieldLocatorFactory
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
                        java.lang.String r1 = r2.fieldName
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r1 = r2.fieldLocatorFactory
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.method.MethodDescription r6, net.bytebuddy.implementation.bytecode.assign.Assigner r7, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r8) {
                        r4 = this;
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r0 = r4.fieldLocatorFactory
                        net.bytebuddy.dynamic.scaffold.FieldLocator r0 = r0.make(r5)
                        java.lang.String r1 = r4.fieldName
                        net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r0 = r0.locate(r1)
                        boolean r1 = r0.isResolved()
                        if (r1 == 0) goto L7e
                        net.bytebuddy.description.field.FieldDescription r5 = r0.getField()
                        boolean r5 = r5.isStatic()
                        if (r5 != 0) goto L46
                        boolean r5 = r6.isStatic()
                        if (r5 != 0) goto L23
                        goto L46
                    L23:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "Cannot access non-static "
                        r7.append(r8)
                        net.bytebuddy.description.field.FieldDescription r8 = r0.getField()
                        r7.append(r8)
                        java.lang.String r8 = " from "
                        r7.append(r8)
                        r7.append(r6)
                        java.lang.String r6 = r7.toString()
                        r5.<init>(r6)
                        throw r5
                    L46:
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r5 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.description.field.FieldDescription r6 = r0.getField()
                        boolean r6 = r6.isStatic()
                        if (r6 == 0) goto L55
                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r6 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                        goto L59
                    L55:
                        net.bytebuddy.implementation.bytecode.StackManipulation r6 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    L59:
                        net.bytebuddy.description.field.FieldDescription r1 = r0.getField()
                        net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r1)
                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.read()
                        r2 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                        r3 = 0
                        r2[r3] = r6
                        r6 = 1
                        r2[r6] = r1
                        r5.<init>(r2)
                        net.bytebuddy.description.field.FieldDescription r6 = r0.getField()
                        net.bytebuddy.description.type.TypeDescription$Generic r6 = r6.getType()
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved r5 = r4.doResolve(r5, r6, r7, r8)
                        return r5
                    L7e:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "Cannot find a field "
                        r7.append(r8)
                        java.lang.String r8 = r4.fieldName
                        r7.append(r8)
                        java.lang.String r8 = " for "
                        r7.append(r8)
                        r7.append(r5)
                        java.lang.String r5 = r7.toString()
                        r6.<init>(r5)
                        throw r6
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForFloatConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final float value;

                public ForFloatConstant(float r1) {
                        r0 = this;
                        r0.<init>()
                        r0.value = r1
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
                        float r2 = r4.value
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForFloatConstant r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForFloatConstant) r5
                        float r5 = r5.value
                        int r5 = java.lang.Float.compare(r2, r5)
                        if (r5 == 0) goto L20
                        return r1
                    L20:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        float r1 = r2.value
                        int r1 = java.lang.Float.floatToIntBits(r1)
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        float r2 = r0.value
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.forValue(r2)
                        java.lang.Class r3 = java.lang.Float.TYPE
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForInstance implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private static final java.lang.String FIELD_PREFIX = "invokeDynamic";
                private final net.bytebuddy.description.type.TypeDescription fieldType;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
                private final java.lang.String name;
                private final java.lang.Object value;

                public ForInstance(java.lang.Object r2, net.bytebuddy.description.type.TypeDescription r3) {
                        r1 = this;
                        r1.<init>()
                        r1.value = r2
                        r1.fieldType = r3
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r0 = "invokeDynamic$"
                        r3.append(r0)
                        java.lang.String r2 = net.bytebuddy.utility.RandomString.hashOf(r2)
                        r3.append(r2)
                        java.lang.String r2 = r3.toString()
                        r1.name = r2
                        return
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider of(java.lang.Object r2) {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInstance r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInstance
                        java.lang.Class r1 = r2.getClass()
                        net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                        r0.<init>(r2, r1)
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
                        java.lang.Object r2 = r4.value
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInstance r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInstance) r5
                        java.lang.Object r3 = r5.value
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.type.TypeDescription r2 = r4.fieldType
                        net.bytebuddy.description.type.TypeDescription r5 = r5.fieldType
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
                        java.lang.Object r1 = r2.value
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription r1 = r2.fieldType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r5) {
                        r4 = this;
                        net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                        java.lang.String r1 = r4.name
                        net.bytebuddy.description.type.TypeDescription r2 = r4.fieldType
                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                        r3 = 4169(0x1049, float:5.842E-42)
                        r0.<init>(r1, r3, r2)
                        java.lang.Object r1 = r4.value
                        net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withAuxiliaryField(r0, r1)
                        return r5
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.method.MethodDescription r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r7) {
                        r3 = this;
                        net.bytebuddy.description.field.FieldList r4 = r4.getDeclaredFields()
                        java.lang.String r5 = r3.name
                        net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.named(r5)
                        net.bytebuddy.matcher.FilterableList r4 = r4.filter(r5)
                        net.bytebuddy.description.field.FieldList r4 = (net.bytebuddy.description.field.FieldList) r4
                        java.lang.Object r4 = r4.getOnly()
                        net.bytebuddy.description.field.FieldDescription r4 = (net.bytebuddy.description.field.FieldDescription) r4
                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r4.getType()
                        net.bytebuddy.description.type.TypeDescription r0 = r3.fieldType
                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                        net.bytebuddy.implementation.bytecode.StackManipulation r5 = r6.assign(r5, r0, r7)
                        boolean r6 = r5.isValid()
                        if (r6 == 0) goto L4e
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r6 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r7 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.read()
                        r1 = 2
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r1 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                        r2 = 0
                        r1[r2] = r0
                        r0 = 1
                        r1[r0] = r5
                        r7.<init>(r1)
                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                        net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                        r6.<init>(r7, r4)
                        return r6
                    L4e:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        r6.<init>()
                        java.lang.String r7 = "Cannot assign "
                        r6.append(r7)
                        r6.append(r4)
                        java.lang.String r4 = " to "
                        r6.append(r4)
                        net.bytebuddy.description.type.TypeDescription r4 = r3.fieldType
                        r6.append(r4)
                        java.lang.String r4 = r6.toString()
                        r5.<init>(r4)
                        throw r5
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForIntegerConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final int value;

                public ForIntegerConstant(int r1) {
                        r0 = this;
                        r0.<init>()
                        r0.value = r1
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
                        int r2 = r4.value
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForIntegerConstant r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForIntegerConstant) r5
                        int r5 = r5.value
                        if (r2 == r5) goto L1c
                        return r1
                    L1c:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        int r1 = r2.value
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        int r2 = r0.value
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                        java.lang.Class r3 = java.lang.Integer.TYPE
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            public enum ForInterceptedMethodInstanceAndParameters extends java.lang.Enum<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters> implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private static final /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters[] $VALUES = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters INSTANCE = null;

                static {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters.INSTANCE = r0
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters[] r0 = new net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters[]{r0}
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters.$VALUES = r0
                        return
                }

                ForInterceptedMethodInstanceAndParameters(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters> r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters r1 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters) r1
                        return r1
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters[] values() {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters[] r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters[] r0 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r2)
                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.prependThisReference()
                        boolean r4 = r2.isStatic()
                        if (r4 == 0) goto L1d
                        net.bytebuddy.description.method.ParameterList r2 = r2.getParameters()
                        net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                        net.bytebuddy.description.type.TypeList r2 = r2.asErasures()
                        goto L35
                    L1d:
                        net.bytebuddy.description.type.TypeDefinition r4 = r2.getDeclaringType()
                        net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                        net.bytebuddy.description.method.ParameterList r2 = r2.getParameters()
                        net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                        net.bytebuddy.description.type.TypeList r2 = r2.asErasures()
                        java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r4, r2)
                    L35:
                        r1.<init>(r3, r2)
                        return r1
                }
            }

            public enum ForInterceptedMethodParameters extends java.lang.Enum<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters> implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private static final /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters[] $VALUES = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters INSTANCE = null;

                static {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodParameters r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodParameters
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters.INSTANCE = r0
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodParameters[] r0 = new net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters[]{r0}
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters.$VALUES = r0
                        return
                }

                ForInterceptedMethodParameters(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodParameters> r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodParameters r1 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters) r1
                        return r1
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters[] values() {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodParameters[] r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodParameters[] r0 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess$MethodLoading r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.allArgumentsOf(r2)
                        net.bytebuddy.description.method.ParameterList r2 = r2.getParameters()
                        net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                        net.bytebuddy.description.type.TypeList r2 = r2.asErasures()
                        r1.<init>(r3, r2)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForJavaConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final net.bytebuddy.utility.ConstantValue constant;

                public ForJavaConstant(net.bytebuddy.utility.ConstantValue r1) {
                        r0 = this;
                        r0.<init>()
                        r0.constant = r1
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
                        net.bytebuddy.utility.ConstantValue r2 = r4.constant
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForJavaConstant) r5
                        net.bytebuddy.utility.ConstantValue r5 = r5.constant
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
                        net.bytebuddy.utility.ConstantValue r1 = r2.constant
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.utility.ConstantValue r2 = r0.constant
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.toStackManipulation()
                        net.bytebuddy.utility.ConstantValue r3 = r0.constant
                        net.bytebuddy.description.type.TypeDescription r3 = r3.getTypeDescription()
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForLongConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final long value;

                public ForLongConstant(long r1) {
                        r0 = this;
                        r0.<init>()
                        r0.value = r1
                        return
                }

                public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r7) {
                        r6 = this;
                        r0 = 1
                        if (r6 != r7) goto L4
                        return r0
                    L4:
                        r1 = 0
                        if (r7 != 0) goto L8
                        return r1
                    L8:
                        java.lang.Class r2 = r6.getClass()
                        java.lang.Class r3 = r7.getClass()
                        if (r2 == r3) goto L13
                        return r1
                    L13:
                        long r2 = r6.value
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForLongConstant r7 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForLongConstant) r7
                        long r4 = r7.value
                        int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                        if (r7 == 0) goto L1e
                        return r1
                    L1e:
                        return r0
                }

                public int hashCode() {
                        r5 = this;
                        java.lang.Class r0 = r5.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        long r1 = r5.value
                        r3 = 32
                        long r3 = r1 >>> r3
                        long r1 = r1 ^ r3
                        int r1 = (int) r1
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        long r2 = r0.value
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.LongConstant.forValue(r2)
                        java.lang.Class r3 = java.lang.Long.TYPE
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForMethodParameter implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                protected final int index;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class WithExplicitType extends net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForMethodParameter {
                    private final net.bytebuddy.description.type.TypeDescription typeDescription;

                    public WithExplicitType(int r1, net.bytebuddy.description.type.TypeDescription r2) {
                            r0 = this;
                            r0.<init>(r1)
                            r0.typeDescription = r2
                            return
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForMethodParameter
                    public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved doResolve(net.bytebuddy.implementation.bytecode.StackManipulation r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                            r2 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r2.typeDescription
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                            net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.assign(r4, r0, r6)
                            boolean r6 = r5.isValid()
                            if (r6 == 0) goto L26
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r6 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r0 = 2
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                            r1 = 0
                            r0[r1] = r3
                            r3 = 1
                            r0[r3] = r5
                            r6.<init>(r0)
                            net.bytebuddy.description.type.TypeDescription r3 = r2.typeDescription
                            r4.<init>(r6, r3)
                            return r4
                        L26:
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r5 = new java.lang.StringBuilder
                            r5.<init>()
                            java.lang.String r6 = "Cannot assign "
                            r5.append(r6)
                            r5.append(r4)
                            java.lang.String r4 = " to "
                            r5.append(r4)
                            net.bytebuddy.description.type.TypeDescription r4 = r2.typeDescription
                            r5.append(r4)
                            java.lang.String r4 = r5.toString()
                            r3.<init>(r4)
                            throw r3
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForMethodParameter
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
                            net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForMethodParameter$WithExplicitType r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForMethodParameter.WithExplicitType) r5
                            net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L27
                            return r1
                        L27:
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForMethodParameter
                    public int hashCode() {
                            r2 = this;
                            int r0 = super.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                public ForMethodParameter(int r1) {
                        r0 = this;
                        r0.<init>()
                        r0.index = r1
                        return
                }

                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved doResolve(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                        r3.<init>(r1, r2)
                        return r3
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
                        int r2 = r4.index
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForMethodParameter r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForMethodParameter) r5
                        int r5 = r5.index
                        if (r2 == r5) goto L1c
                        return r1
                    L1c:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        int r1 = r2.index
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                        r2 = this;
                        net.bytebuddy.description.method.ParameterList r3 = r4.getParameters()
                        int r0 = r2.index
                        int r1 = r3.size()
                        if (r0 >= r1) goto L29
                        int r4 = r2.index
                        java.lang.Object r4 = r3.get(r4)
                        net.bytebuddy.description.method.ParameterDescription r4 = (net.bytebuddy.description.method.ParameterDescription) r4
                        net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.load(r4)
                        int r0 = r2.index
                        java.lang.Object r3 = r3.get(r0)
                        net.bytebuddy.description.method.ParameterDescription r3 = (net.bytebuddy.description.method.ParameterDescription) r3
                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved r3 = r2.doResolve(r4, r3, r5, r6)
                        return r3
                    L29:
                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        r5.<init>()
                        java.lang.String r6 = "No parameter "
                        r5.append(r6)
                        int r6 = r2.index
                        r5.append(r6)
                        java.lang.String r6 = " for "
                        r5.append(r6)
                        r5.append(r4)
                        java.lang.String r4 = r5.toString()
                        r3.<init>(r4)
                        throw r3
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForNullValue implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForNullValue(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForNullValue r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForNullValue) r5
                        net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
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
                        net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.implementation.bytecode.constant.NullConstant r2 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                        net.bytebuddy.description.type.TypeDescription r3 = r0.typeDescription
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForShortConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final short value;

                public ForShortConstant(short r1) {
                        r0 = this;
                        r0.<init>()
                        r0.value = r1
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
                        short r2 = r4.value
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForShortConstant r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForShortConstant) r5
                        short r5 = r5.value
                        if (r2 == r5) goto L1c
                        return r1
                    L1c:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        short r1 = r2.value
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        short r2 = r0.value
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r2)
                        java.lang.Class r3 = java.lang.Short.TYPE
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForStringConstant implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final java.lang.String value;

                public ForStringConstant(java.lang.String r1) {
                        r0 = this;
                        r0.<init>()
                        r0.value = r1
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
                        java.lang.String r2 = r4.value
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForStringConstant r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForStringConstant) r5
                        java.lang.String r5 = r5.value
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
                        java.lang.String r1 = r2.value
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.implementation.bytecode.constant.TextConstant r2 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                        java.lang.String r3 = r0.value
                        r2.<init>(r3)
                        java.lang.Class<java.lang.String> r3 = java.lang.String.class
                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                        r1.<init>(r2, r3)
                        return r1
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForThisInstance implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForThisInstance(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForThisInstance r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForThisInstance) r5
                        net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
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
                        net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                        r0 = this;
                        return r1
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                        r0 = this;
                        boolean r3 = r2.isStatic()
                        if (r3 != 0) goto L34
                        net.bytebuddy.description.type.TypeDescription r2 = r0.typeDescription
                        boolean r2 = r1.isAssignableTo(r2)
                        if (r2 == 0) goto L1a
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r1 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple
                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                        net.bytebuddy.description.type.TypeDescription r3 = r0.typeDescription
                        r1.<init>(r2, r3)
                        return r1
                    L1a:
                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        r3.append(r1)
                        java.lang.String r4 = " is not assignable to "
                        r3.append(r4)
                        r3.append(r1)
                        java.lang.String r1 = r3.toString()
                        r2.<init>(r1)
                        throw r2
                    L34:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                        r3.<init>()
                        java.lang.String r4 = "Cannot get this instance from static method: "
                        r3.append(r4)
                        r3.append(r2)
                        java.lang.String r2 = r3.toString()
                        r1.<init>(r2)
                        throw r1
                }
            }

            public interface Resolved {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Simple implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved {
                    private final java.util.List<net.bytebuddy.description.type.TypeDescription> loadedTypes;
                    private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;

                    public Simple(net.bytebuddy.implementation.bytecode.StackManipulation r1, java.util.List<net.bytebuddy.description.type.TypeDescription> r2) {
                            r0 = this;
                            r0.<init>()
                            r0.stackManipulation = r1
                            r0.loadedTypes = r2
                            return
                    }

                    public Simple(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription r2) {
                            r0 = this;
                            java.util.List r2 = java.util.Collections.singletonList(r2)
                            r0.<init>(r1, r2)
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
                            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved$Simple r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved.Simple) r5
                            net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.stackManipulation
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            java.util.List<net.bytebuddy.description.type.TypeDescription> r2 = r4.loadedTypes
                            java.util.List<net.bytebuddy.description.type.TypeDescription> r5 = r5.loadedTypes
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved
                    public net.bytebuddy.implementation.bytecode.StackManipulation getLoadInstruction() {
                            r1 = this;
                            net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.stackManipulation
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved
                    public java.util.List<net.bytebuddy.description.type.TypeDescription> getLoadedTypes() {
                            r1 = this;
                            java.util.List<net.bytebuddy.description.type.TypeDescription> r0 = r1.loadedTypes
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.util.List<net.bytebuddy.description.type.TypeDescription> r1 = r2.loadedTypes
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                net.bytebuddy.implementation.bytecode.StackManipulation getLoadInstruction();

                java.util.List<net.bytebuddy.description.type.TypeDescription> getLoadedTypes();
            }

            net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1);

            net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Default implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider {
            private final java.util.List<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider> argumentProviders;
            private final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider nameProvider;
            private final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider returnTypeProvider;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Target implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target {
                private final java.util.List<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider> argumentProviders;
                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                private final java.lang.String internalName;
                private final net.bytebuddy.description.type.TypeDescription returnType;

                public Target(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2, java.util.List<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider> r3, net.bytebuddy.description.method.MethodDescription r4) {
                        r0 = this;
                        r0.<init>()
                        r0.internalName = r1
                        r0.returnType = r2
                        r0.argumentProviders = r3
                        r0.instrumentedMethod = r4
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
                        java.lang.String r2 = r4.internalName
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default$Target r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Default.Target) r5
                        java.lang.String r3 = r5.internalName
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.type.TypeDescription r2 = r4.returnType
                        net.bytebuddy.description.type.TypeDescription r3 = r5.returnType
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r2 = r4.argumentProviders
                        java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r3 = r5.argumentProviders
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L36
                        return r1
                    L36:
                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                        net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L41
                        return r1
                    L41:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        java.lang.String r1 = r2.internalName
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.type.TypeDescription r1 = r2.returnType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r1 = r2.argumentProviders
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target
                public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved resolve(net.bytebuddy.description.type.TypeDescription r7, net.bytebuddy.implementation.bytecode.assign.Assigner r8, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r9) {
                        r6 = this;
                        java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r0 = r6.argumentProviders
                        int r0 = r0.size()
                        net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r2 = r6.argumentProviders
                        java.util.Iterator r2 = r2.iterator()
                        r3 = 0
                    L14:
                        boolean r4 = r2.hasNext()
                        if (r4 == 0) goto L37
                        java.lang.Object r4 = r2.next()
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r4 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider) r4
                        net.bytebuddy.description.method.MethodDescription r5 = r6.instrumentedMethod
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$Resolved r4 = r4.resolve(r7, r5, r8, r9)
                        java.util.List r5 = r4.getLoadedTypes()
                        r1.addAll(r5)
                        int r5 = r3 + 1
                        net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.getLoadInstruction()
                        r0[r3] = r4
                        r3 = r5
                        goto L14
                    L37:
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Target$Resolved$Simple r7 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Target$Resolved$Simple
                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r8 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                        r8.<init>(r0)
                        java.lang.String r9 = r6.internalName
                        net.bytebuddy.description.type.TypeDescription r0 = r6.returnType
                        r7.<init>(r8, r9, r0, r1)
                        return r7
                }
            }

            public Default() {
                    r3 = this;
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForInterceptedMethod r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod.INSTANCE
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForInterceptedMethod r1 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod.INSTANCE
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters r2 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters.INSTANCE
                    java.util.List r2 = java.util.Collections.singletonList(r2)
                    r3.<init>(r0, r1, r2)
                    return
            }

            public Default(net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider r1, net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider r2, java.util.List<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider> r3) {
                    r0 = this;
                    r0.<init>()
                    r0.nameProvider = r1
                    r0.returnTypeProvider = r2
                    r0.argumentProviders = r3
                    return
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider appendArgument(net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider r5) {
                    r4 = this;
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider r1 = r4.nameProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider r2 = r4.returnTypeProvider
                    java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r3 = r4.argumentProviders
                    java.util.List r5 = net.bytebuddy.utility.CompoundList.of(r3, r5)
                    r0.<init>(r1, r2, r5)
                    return r0
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider appendArguments(java.util.List<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider> r5) {
                    r4 = this;
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider r1 = r4.nameProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider r2 = r4.returnTypeProvider
                    java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r3 = r4.argumentProviders
                    java.util.List r5 = net.bytebuddy.utility.CompoundList.of(r3, r5)
                    r0.<init>(r1, r2, r5)
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
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider r2 = r4.nameProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Default) r5
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider r3 = r5.nameProvider
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider r2 = r4.returnTypeProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider r3 = r5.returnTypeProvider
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r2 = r4.argumentProviders
                    java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r5 = r5.argumentProviders
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L36
                    return r1
                L36:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider r1 = r2.nameProvider
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider r1 = r2.returnTypeProvider
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r1 = r2.argumentProviders
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Default.Target make(net.bytebuddy.description.method.MethodDescription r5) {
                    r4 = this;
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default$Target r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default$Target
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider r1 = r4.nameProvider
                    java.lang.String r1 = r1.resolve(r5)
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider r2 = r4.returnTypeProvider
                    net.bytebuddy.description.type.TypeDescription r2 = r2.resolve(r5)
                    java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r3 = r4.argumentProviders
                    r0.<init>(r1, r2, r3, r5)
                    return r0
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target make(net.bytebuddy.description.method.MethodDescription r1) {
                    r0 = this;
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default$Target r1 = r0.make(r1)
                    return r1
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r3) {
                    r2 = this;
                    java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r0 = r2.argumentProviders
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L17
                    java.lang.Object r1 = r0.next()
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r1 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider) r1
                    net.bytebuddy.dynamic.scaffold.InstrumentedType r3 = r1.prepare(r3)
                    goto L6
                L17:
                    return r3
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider withNameProvider(net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider r4) {
                    r3 = this;
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider r1 = r3.returnTypeProvider
                    java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r2 = r3.argumentProviders
                    r0.<init>(r4, r1, r2)
                    return r0
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider withReturnTypeProvider(net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider r4) {
                    r3 = this;
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider r1 = r3.nameProvider
                    java.util.List<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider> r2 = r3.argumentProviders
                    r0.<init>(r1, r4, r2)
                    return r0
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider
            public net.bytebuddy.implementation.InvokeDynamic.InvocationProvider withoutArguments() {
                    r4 = this;
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider r1 = r4.nameProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider r2 = r4.returnTypeProvider
                    java.util.List r3 = java.util.Collections.emptyList()
                    r0.<init>(r1, r2, r3)
                    return r0
            }
        }

        public interface NameProvider {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForExplicitName implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider {
                private final java.lang.String internalName;

                public ForExplicitName(java.lang.String r1) {
                        r0 = this;
                        r0.<init>()
                        r0.internalName = r1
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
                        java.lang.String r2 = r4.internalName
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForExplicitName r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForExplicitName) r5
                        java.lang.String r5 = r5.internalName
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
                        java.lang.String r1 = r2.internalName
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider
                public java.lang.String resolve(net.bytebuddy.description.method.MethodDescription r1) {
                        r0 = this;
                        java.lang.String r1 = r0.internalName
                        return r1
                }
            }

            public enum ForInterceptedMethod extends java.lang.Enum<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod> implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider {
                private static final /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod[] $VALUES = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod INSTANCE = null;

                static {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForInterceptedMethod r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForInterceptedMethod
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod.INSTANCE = r0
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForInterceptedMethod[] r0 = new net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod[]{r0}
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod.$VALUES = r0
                        return
                }

                ForInterceptedMethod(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForInterceptedMethod> r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForInterceptedMethod r1 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod) r1
                        return r1
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod[] values() {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForInterceptedMethod[] r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForInterceptedMethod[] r0 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider.ForInterceptedMethod[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider
                public java.lang.String resolve(net.bytebuddy.description.method.MethodDescription r1) {
                        r0 = this;
                        java.lang.String r1 = r1.getInternalName()
                        return r1
                }
            }

            java.lang.String resolve(net.bytebuddy.description.method.MethodDescription r1);
        }

        public interface ReturnTypeProvider {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForExplicitType implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider {
                private final net.bytebuddy.description.type.TypeDescription typeDescription;

                public ForExplicitType(net.bytebuddy.description.type.TypeDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.typeDescription = r1
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForExplicitType r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForExplicitType) r5
                        net.bytebuddy.description.type.TypeDescription r5 = r5.typeDescription
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
                        net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider
                public net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.method.MethodDescription r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription r1 = r0.typeDescription
                        return r1
                }
            }

            public enum ForInterceptedMethod extends java.lang.Enum<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod> implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider {
                private static final /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod[] $VALUES = null;
                public static final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod INSTANCE = null;

                static {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForInterceptedMethod r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForInterceptedMethod
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod.INSTANCE = r0
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForInterceptedMethod[] r0 = new net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod[]{r0}
                        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod.$VALUES = r0
                        return
                }

                ForInterceptedMethod(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForInterceptedMethod> r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForInterceptedMethod r1 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod) r1
                        return r1
                }

                public static net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod[] values() {
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForInterceptedMethod[] r0 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForInterceptedMethod[] r0 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider.ForInterceptedMethod[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider
                public net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.method.MethodDescription r1) {
                        r0 = this;
                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getReturnType()
                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                        return r1
                }
            }

            net.bytebuddy.description.type.TypeDescription resolve(net.bytebuddy.description.method.MethodDescription r1);
        }

        public interface Target {

            public interface Resolved {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Simple implements net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved {
                    private final java.lang.String internalName;
                    private final java.util.List<net.bytebuddy.description.type.TypeDescription> parameterTypes;
                    private final net.bytebuddy.description.type.TypeDescription returnType;
                    private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;

                    public Simple(net.bytebuddy.implementation.bytecode.StackManipulation r1, java.lang.String r2, net.bytebuddy.description.type.TypeDescription r3, java.util.List<net.bytebuddy.description.type.TypeDescription> r4) {
                            r0 = this;
                            r0.<init>()
                            r0.stackManipulation = r1
                            r0.internalName = r2
                            r0.returnType = r3
                            r0.parameterTypes = r4
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
                            java.lang.String r2 = r4.internalName
                            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Target$Resolved$Simple r5 = (net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved.Simple) r5
                            java.lang.String r3 = r5.internalName
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                            net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.stackManipulation
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            net.bytebuddy.description.type.TypeDescription r2 = r4.returnType
                            net.bytebuddy.description.type.TypeDescription r3 = r5.returnType
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L36
                            return r1
                        L36:
                            java.util.List<net.bytebuddy.description.type.TypeDescription> r2 = r4.parameterTypes
                            java.util.List<net.bytebuddy.description.type.TypeDescription> r5 = r5.parameterTypes
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L41
                            return r1
                        L41:
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved
                    public java.lang.String getInternalName() {
                            r1 = this;
                            java.lang.String r0 = r1.internalName
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved
                    public java.util.List<net.bytebuddy.description.type.TypeDescription> getParameterTypes() {
                            r1 = this;
                            java.util.List<net.bytebuddy.description.type.TypeDescription> r0 = r1.parameterTypes
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved
                    public net.bytebuddy.description.type.TypeDescription getReturnType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription r0 = r1.returnType
                            return r0
                    }

                    @Override // net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved
                    public net.bytebuddy.implementation.bytecode.StackManipulation getStackManipulation() {
                            r1 = this;
                            net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.stackManipulation
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.lang.String r1 = r2.internalName
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.type.TypeDescription r1 = r2.returnType
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.util.List<net.bytebuddy.description.type.TypeDescription> r1 = r2.parameterTypes
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }
                }

                java.lang.String getInternalName();

                java.util.List<net.bytebuddy.description.type.TypeDescription> getParameterTypes();

                net.bytebuddy.description.type.TypeDescription getReturnType();

                net.bytebuddy.implementation.bytecode.StackManipulation getStackManipulation();
            }

            net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3);
        }

        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider appendArgument(net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider r1);

        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider appendArguments(java.util.List<net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider> r1);

        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.Target make(net.bytebuddy.description.method.MethodDescription r1);

        net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1);

        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider withNameProvider(net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.NameProvider r1);

        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider withReturnTypeProvider(net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ReturnTypeProvider r1);

        net.bytebuddy.implementation.InvokeDynamic.InvocationProvider withoutArguments();
    }

    public enum TerminationHandler extends java.lang.Enum<net.bytebuddy.implementation.InvokeDynamic.TerminationHandler> {
        private static final /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.TerminationHandler[] $VALUES = null;
        public static final net.bytebuddy.implementation.InvokeDynamic.TerminationHandler DROPPING = null;
        public static final net.bytebuddy.implementation.InvokeDynamic.TerminationHandler RETURNING = null;



        static {
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler$1 r0 = new net.bytebuddy.implementation.InvokeDynamic$TerminationHandler$1
                java.lang.String r1 = "RETURNING"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.InvokeDynamic.TerminationHandler.RETURNING = r0
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler$2 r1 = new net.bytebuddy.implementation.InvokeDynamic$TerminationHandler$2
                java.lang.String r3 = "DROPPING"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.InvokeDynamic.TerminationHandler.DROPPING = r1
                r3 = 2
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler[] r3 = new net.bytebuddy.implementation.InvokeDynamic.TerminationHandler[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.implementation.InvokeDynamic.TerminationHandler.$VALUES = r3
                return
        }

        TerminationHandler(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ TerminationHandler(java.lang.String r1, int r2, net.bytebuddy.implementation.InvokeDynamic.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.InvokeDynamic.TerminationHandler valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.InvokeDynamic$TerminationHandler> r0 = net.bytebuddy.implementation.InvokeDynamic.TerminationHandler.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r1 = (net.bytebuddy.implementation.InvokeDynamic.TerminationHandler) r1
                return r1
        }

        public static net.bytebuddy.implementation.InvokeDynamic.TerminationHandler[] values() {
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler[] r0 = net.bytebuddy.implementation.InvokeDynamic.TerminationHandler.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler[] r0 = (net.bytebuddy.implementation.InvokeDynamic.TerminationHandler[]) r0
                return r0
        }

        public abstract net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.method.MethodDescription r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4);
    }

    public static class WithImplicitArguments extends net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator {
        public WithImplicitArguments(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2, net.bytebuddy.implementation.InvokeDynamic.InvocationProvider r3, net.bytebuddy.implementation.InvokeDynamic.TerminationHandler r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.implementation.Implementation.Composable
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r1) {
                r0 = this;
                net.bytebuddy.implementation.Implementation r1 = super.andThen(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.implementation.Implementation
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r1) {
                r0 = this;
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r1 = super.appender(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator
        public net.bytebuddy.implementation.InvokeDynamic materialize() {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = r1.withoutArguments()
                return r0
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType r1 = super.prepare(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withArgument(int r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r1 = super.withArgument(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withArgument(int[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withArgument(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.Implementation.Composable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r1 = r0.withAssigner(r1, r2)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r9, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r10) {
                r8 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r7 = new net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r8.invocationProvider
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
                r0 = r7
                r5 = r9
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withBooleanValue(boolean[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withBooleanValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withByteValue(byte[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withByteValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withCharacterValue(char[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withCharacterValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withDoubleValue(double[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withDoubleValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withEnumeration(net.bytebuddy.description.enumeration.EnumerationDescription[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withEnumeration(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withField(java.lang.String r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r1 = super.withField(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withField(java.lang.String r1, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r1 = super.withField(r1, r2)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withField(net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r1, java.lang.String[] r2) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withField(r1, r2)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withField(java.lang.String[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withField(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withFloatValue(float[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withFloatValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withImplicitAndMethodArguments() {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = super.withImplicitAndMethodArguments()
                return r0
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withInstance(net.bytebuddy.utility.JavaConstant[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withInstance(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withIntegerValue(int[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withIntegerValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withLongValue(long[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withLongValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withMethodArguments() {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = super.withMethodArguments()
                return r0
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withNullValue(java.lang.Class[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withNullValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withNullValue(net.bytebuddy.description.type.TypeDescription[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withNullValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withReference(java.lang.Object r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r1 = super.withReference(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withReference(java.lang.Object[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withReference(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withShortValue(short[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withShortValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withThis(java.lang.Class[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withThis(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withThis(net.bytebuddy.description.type.TypeDescription[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withThis(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withType(net.bytebuddy.description.type.TypeDescription[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withType(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withValue(java.lang.Object[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withValue(r1)
                return r1
        }

        public net.bytebuddy.implementation.InvokeDynamic withoutArguments() {
                r8 = this;
                net.bytebuddy.implementation.InvokeDynamic r7 = new net.bytebuddy.implementation.InvokeDynamic
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r0.withoutArguments()
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }
    }

    public static class WithImplicitTarget extends net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments {
        public WithImplicitTarget(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2, net.bytebuddy.implementation.InvokeDynamic.InvocationProvider r3, net.bytebuddy.implementation.InvokeDynamic.TerminationHandler r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments invoke(java.lang.Class<?> r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r1 = r0.invoke(r1)
                return r1
        }

        public net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments invoke(java.lang.String r9) {
                r8 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r7 = new net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForExplicitName r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForExplicitName
                r3.<init>(r9)
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r0.withNameProvider(r3)
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        public net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments invoke(java.lang.String r1, java.lang.Class<?> r2) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r1 = r0.invoke(r1, r2)
                return r1
        }

        public net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments invoke(java.lang.String r9, net.bytebuddy.description.type.TypeDescription r10) {
                r8 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r7 = new net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForExplicitName r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$NameProvider$ForExplicitName
                r3.<init>(r9)
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r9 = r0.withNameProvider(r3)
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForExplicitType r0 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForExplicitType
                r0.<init>(r10)
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r9.withReturnTypeProvider(r0)
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        public net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments invoke(net.bytebuddy.description.type.TypeDescription r9) {
                r8 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r7 = new net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
                java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForExplicitType r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ReturnTypeProvider$ForExplicitType
                r3.<init>(r9)
                net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r0.withReturnTypeProvider(r3)
                net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
                net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }
    }

    public static abstract class WithImplicitType extends net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator {

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Super type implementation covers use case", value = {"EQ_DOESNT_OVERRIDE_EQUALS"})
        public static class OfArgument extends net.bytebuddy.implementation.InvokeDynamic.WithImplicitType {
            private final int index;

            public OfArgument(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2, net.bytebuddy.implementation.InvokeDynamic.InvocationProvider r3, net.bytebuddy.implementation.InvokeDynamic.TerminationHandler r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6, int r7) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    r0.index = r7
                    return
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.WithImplicitType
            public net.bytebuddy.implementation.InvokeDynamic as(net.bytebuddy.description.type.TypeDescription r9) {
                    r8 = this;
                    net.bytebuddy.implementation.InvokeDynamic r7 = new net.bytebuddy.implementation.InvokeDynamic
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
                    java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForMethodParameter$WithExplicitType r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForMethodParameter$WithExplicitType
                    int r4 = r8.index
                    r3.<init>(r4, r9)
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r0.appendArgument(r3)
                    net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
                    net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
                    r0 = r7
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator
            public net.bytebuddy.implementation.InvokeDynamic materialize() {
                    r8 = this;
                    net.bytebuddy.implementation.InvokeDynamic r7 = new net.bytebuddy.implementation.InvokeDynamic
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
                    java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForMethodParameter r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForMethodParameter
                    int r4 = r8.index
                    r3.<init>(r4)
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r0.appendArgument(r3)
                    net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
                    net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
                    r0 = r7
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
            }
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Super type implementation covers use case", value = {"EQ_DOESNT_OVERRIDE_EQUALS"})
        public static class OfField extends net.bytebuddy.implementation.InvokeDynamic.WithImplicitType {
            private final net.bytebuddy.dynamic.scaffold.FieldLocator.Factory fieldLocatorFactory;
            private final java.lang.String fieldName;

            public OfField(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2, net.bytebuddy.implementation.InvokeDynamic.InvocationProvider r3, net.bytebuddy.implementation.InvokeDynamic.TerminationHandler r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6, java.lang.String r7, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r8) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    r0.fieldName = r7
                    r0.fieldLocatorFactory = r8
                    return
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.WithImplicitType
            public net.bytebuddy.implementation.InvokeDynamic as(net.bytebuddy.description.type.TypeDescription r9) {
                    r8 = this;
                    net.bytebuddy.implementation.InvokeDynamic r7 = new net.bytebuddy.implementation.InvokeDynamic
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
                    java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForField$WithExplicitType r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForField$WithExplicitType
                    java.lang.String r4 = r8.fieldName
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r5 = r8.fieldLocatorFactory
                    r3.<init>(r4, r5, r9)
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r0.appendArgument(r3)
                    net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
                    net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
                    r0 = r7
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator
            public net.bytebuddy.implementation.InvokeDynamic materialize() {
                    r8 = this;
                    net.bytebuddy.implementation.InvokeDynamic r7 = new net.bytebuddy.implementation.InvokeDynamic
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
                    java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForField r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForField
                    java.lang.String r4 = r8.fieldName
                    net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r5 = r8.fieldLocatorFactory
                    r3.<init>(r4, r5)
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r0.appendArgument(r3)
                    net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
                    net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
                    r0 = r7
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
            }
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Super type implementation covers use case", value = {"EQ_DOESNT_OVERRIDE_EQUALS"})
        public static class OfInstance extends net.bytebuddy.implementation.InvokeDynamic.WithImplicitType {
            private final net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider argumentProvider;
            private final java.lang.Object value;

            public OfInstance(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2, net.bytebuddy.implementation.InvokeDynamic.InvocationProvider r3, net.bytebuddy.implementation.InvokeDynamic.TerminationHandler r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6, java.lang.Object r7) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    r0.value = r7
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r1 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInstance.of(r7)
                    r0.argumentProvider = r1
                    return
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.WithImplicitType
            public net.bytebuddy.implementation.InvokeDynamic as(net.bytebuddy.description.type.TypeDescription r9) {
                    r8 = this;
                    net.bytebuddy.description.type.TypeDescription r0 = r9.asBoxed()
                    java.lang.Object r1 = r8.value
                    boolean r0 = r0.isInstance(r1)
                    if (r0 == 0) goto L2a
                    net.bytebuddy.implementation.InvokeDynamic r0 = new net.bytebuddy.implementation.InvokeDynamic
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r8.bootstrap
                    java.util.List<? extends net.bytebuddy.utility.JavaConstant> r3 = r8.arguments
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r8.invocationProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInstance r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInstance
                    java.lang.Object r5 = r8.value
                    r4.<init>(r5, r9)
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r4 = r1.appendArgument(r4)
                    net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r5 = r8.terminationHandler
                    net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r8.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r8.typing
                    r1 = r0
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    return r0
                L2a:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.Object r2 = r8.value
                    r1.append(r2)
                    java.lang.String r2 = " is not of type "
                    r1.append(r2)
                    r1.append(r9)
                    java.lang.String r9 = r1.toString()
                    r0.<init>(r9)
                    throw r0
            }

            @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator
            public net.bytebuddy.implementation.InvokeDynamic materialize() {
                    r8 = this;
                    net.bytebuddy.implementation.InvokeDynamic r7 = new net.bytebuddy.implementation.InvokeDynamic
                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
                    java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r3 = r8.argumentProvider
                    net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r0.appendArgument(r3)
                    net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
                    net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
                    r0 = r7
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    return r7
            }
        }

        public WithImplicitType(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2, net.bytebuddy.implementation.InvokeDynamic.InvocationProvider r3, net.bytebuddy.implementation.InvokeDynamic.TerminationHandler r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.implementation.Implementation.Composable
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r1) {
                r0 = this;
                net.bytebuddy.implementation.Implementation r1 = super.andThen(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.implementation.Implementation
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r1) {
                r0 = this;
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r1 = super.appender(r1)
                return r1
        }

        public net.bytebuddy.implementation.InvokeDynamic as(java.lang.Class<?> r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.implementation.InvokeDynamic r1 = r0.as(r1)
                return r1
        }

        public abstract net.bytebuddy.implementation.InvokeDynamic as(net.bytebuddy.description.type.TypeDescription r1);

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic, net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public /* bridge */ /* synthetic */ net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                net.bytebuddy.dynamic.scaffold.InstrumentedType r1 = super.prepare(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withArgument(int r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r1 = super.withArgument(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withArgument(int[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withArgument(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.Implementation.Composable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2) {
                r0 = this;
                net.bytebuddy.implementation.Implementation$Composable r1 = super.withAssigner(r1, r2)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withBooleanValue(boolean[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withBooleanValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withByteValue(byte[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withByteValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withCharacterValue(char[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withCharacterValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withDoubleValue(double[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withDoubleValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withEnumeration(net.bytebuddy.description.enumeration.EnumerationDescription[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withEnumeration(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withField(java.lang.String r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r1 = super.withField(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withField(java.lang.String r1, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r2) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r1 = super.withField(r1, r2)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withField(net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r1, java.lang.String[] r2) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withField(r1, r2)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withField(java.lang.String[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withField(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withFloatValue(float[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withFloatValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withImplicitAndMethodArguments() {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = super.withImplicitAndMethodArguments()
                return r0
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withInstance(net.bytebuddy.utility.JavaConstant[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withInstance(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withIntegerValue(int[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withIntegerValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withLongValue(long[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withLongValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withMethodArguments() {
                r1 = this;
                net.bytebuddy.implementation.InvokeDynamic r0 = super.withMethodArguments()
                return r0
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withNullValue(java.lang.Class[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withNullValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withNullValue(net.bytebuddy.description.type.TypeDescription[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withNullValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withReference(java.lang.Object r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r1 = super.withReference(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withReference(java.lang.Object[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withReference(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withShortValue(short[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withShortValue(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withThis(java.lang.Class[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withThis(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withThis(net.bytebuddy.description.type.TypeDescription[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withThis(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withType(net.bytebuddy.description.type.TypeDescription[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withType(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvokeDynamic.AbstractDelegator, net.bytebuddy.implementation.InvokeDynamic
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.InvokeDynamic withValue(java.lang.Object[] r1) {
                r0 = this;
                net.bytebuddy.implementation.InvokeDynamic r1 = super.withValue(r1)
                return r1
        }
    }

    public InvokeDynamic(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2, net.bytebuddy.implementation.InvokeDynamic.InvocationProvider r3, net.bytebuddy.implementation.InvokeDynamic.TerminationHandler r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r6) {
            r0 = this;
            r0.<init>()
            r0.bootstrap = r1
            r0.arguments = r2
            r0.invocationProvider = r3
            r0.terminationHandler = r4
            r0.assigner = r5
            r0.typing = r6
            return
    }

    public static net.bytebuddy.implementation.InvokeDynamic.WithImplicitTarget bootstrap(java.lang.reflect.Constructor<?> r1, java.util.List<?> r2) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
            r0.<init>(r1)
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitTarget r1 = bootstrap(r0, r2)
            return r1
    }

    public static net.bytebuddy.implementation.InvokeDynamic.WithImplicitTarget bootstrap(java.lang.reflect.Constructor<?> r1, java.lang.Object... r2) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
            r0.<init>(r1)
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitTarget r1 = bootstrap(r0, r2)
            return r1
    }

    public static net.bytebuddy.implementation.InvokeDynamic.WithImplicitTarget bootstrap(java.lang.reflect.Method r1, java.util.List<?> r2) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
            r0.<init>(r1)
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitTarget r1 = bootstrap(r0, r2)
            return r1
    }

    public static net.bytebuddy.implementation.InvokeDynamic.WithImplicitTarget bootstrap(java.lang.reflect.Method r1, java.lang.Object... r2) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
            r0.<init>(r1)
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitTarget r1 = bootstrap(r0, r2)
            return r1
    }

    public static net.bytebuddy.implementation.InvokeDynamic.WithImplicitTarget bootstrap(net.bytebuddy.description.method.MethodDescription.InDefinedShape r7, java.util.List<?> r8) {
            java.util.List r2 = net.bytebuddy.utility.JavaConstant.Simple.wrap(r8)
            net.bytebuddy.description.type.TypeList r8 = net.bytebuddy.description.type.TypeList.Explicit.of(r2)
            boolean r8 = r7.isInvokeBootstrap(r8)
            if (r8 == 0) goto L21
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitTarget r8 = new net.bytebuddy.implementation.InvokeDynamic$WithImplicitTarget
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default r3 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$Default
            r3.<init>()
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = net.bytebuddy.implementation.InvokeDynamic.TerminationHandler.RETURNING
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
            r0 = r8
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        L21:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Not a valid bootstrap method "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = " for "
            r0.append(r7)
            r0.append(r2)
            java.lang.String r7 = r0.toString()
            r8.<init>(r7)
            throw r8
    }

    public static net.bytebuddy.implementation.InvokeDynamic.WithImplicitTarget bootstrap(net.bytebuddy.description.method.MethodDescription.InDefinedShape r0, java.lang.Object... r1) {
            java.util.List r1 = java.util.Arrays.asList(r1)
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitTarget r0 = bootstrap(r0, r1)
            return r0
    }

    public static net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments lambda(java.lang.reflect.Method r1, java.lang.reflect.Type r2) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
            r0.<init>(r1)
            net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r1 = lambda(r0, r1)
            return r1
    }

    public static net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments lambda(java.lang.reflect.Method r1, java.lang.reflect.Type r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r3) {
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
            r0.<init>(r1)
            net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r1 = lambda(r0, r1, r3)
            return r1
    }

    public static net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments lambda(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDefinition r2) {
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.Default.forJavaHierarchy()
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r1 = lambda(r1, r2, r0)
            return r1
    }

    public static net.bytebuddy.implementation.InvokeDynamic.WithImplicitArguments lambda(net.bytebuddy.description.method.MethodDescription.InDefinedShape r16, net.bytebuddy.description.type.TypeDefinition r17, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r18) {
            r0 = r17
            boolean r1 = r17.isInterface()
            if (r1 == 0) goto L10a
            r1 = r18
            net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r1.compile(r0)
            net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r1 = r1.listNodes()
            net.bytebuddy.description.method.MethodList r1 = r1.asMethodList()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
            net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
            int r2 = r1.size()
            r3 = 1
            if (r2 != r3) goto Lf0
            net.bytebuddy.description.method.MethodDescription$Latent r0 = new net.bytebuddy.description.method.MethodDescription$Latent
            net.bytebuddy.description.type.TypeDescription$Latent r5 = new net.bytebuddy.description.type.TypeDescription$Latent
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
            r4 = 0
            net.bytebuddy.description.type.TypeDescription$Generic[] r4 = new net.bytebuddy.description.type.TypeDescription.Generic[r4]
            java.lang.String r6 = "java.lang.invoke.LambdaMetafactory"
            r5.<init>(r6, r3, r2, r4)
            java.util.List r8 = java.util.Collections.emptyList()
            net.bytebuddy.utility.JavaType r2 = net.bytebuddy.utility.JavaType.CALL_SITE
            net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeStub()
            net.bytebuddy.description.type.TypeDescription$Generic r9 = r2.asGenericType()
            net.bytebuddy.description.method.ParameterDescription$Token r10 = new net.bytebuddy.description.method.ParameterDescription$Token
            net.bytebuddy.utility.JavaType r2 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
            net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeStub()
            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
            r10.<init>(r2)
            net.bytebuddy.description.method.ParameterDescription$Token r11 = new net.bytebuddy.description.method.ParameterDescription$Token
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
            r11.<init>(r2)
            net.bytebuddy.description.method.ParameterDescription$Token r12 = new net.bytebuddy.description.method.ParameterDescription$Token
            net.bytebuddy.utility.JavaType r2 = net.bytebuddy.utility.JavaType.METHOD_TYPE
            net.bytebuddy.description.type.TypeDescription r3 = r2.getTypeStub()
            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
            r12.<init>(r3)
            net.bytebuddy.description.method.ParameterDescription$Token r13 = new net.bytebuddy.description.method.ParameterDescription$Token
            net.bytebuddy.description.type.TypeDescription r3 = r2.getTypeStub()
            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
            r13.<init>(r3)
            net.bytebuddy.description.method.ParameterDescription$Token r14 = new net.bytebuddy.description.method.ParameterDescription$Token
            net.bytebuddy.utility.JavaType r3 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
            net.bytebuddy.description.type.TypeDescription r3 = r3.getTypeStub()
            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
            r14.<init>(r3)
            net.bytebuddy.description.method.ParameterDescription$Token r15 = new net.bytebuddy.description.method.ParameterDescription$Token
            net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeStub()
            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
            r15.<init>(r2)
            net.bytebuddy.description.method.ParameterDescription$Token[] r2 = new net.bytebuddy.description.method.ParameterDescription.Token[]{r10, r11, r12, r13, r14, r15}
            java.util.List r10 = java.util.Arrays.asList(r2)
            java.util.List r11 = java.util.Collections.emptyList()
            java.util.List r12 = java.util.Collections.emptyList()
            net.bytebuddy.description.annotation.AnnotationValue<?, ?> r13 = net.bytebuddy.description.annotation.AnnotationValue.UNDEFINED
            net.bytebuddy.description.type.TypeDescription$Generic r14 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
            java.lang.String r6 = "metafactory"
            r7 = 9
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            net.bytebuddy.description.method.MethodList r2 = r1.asDefined()
            java.lang.Object r2 = r2.getOnly()
            net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
            net.bytebuddy.utility.JavaConstant$MethodType r2 = net.bytebuddy.utility.JavaConstant.MethodType.ofSignature(r2)
            net.bytebuddy.utility.JavaConstant$MethodHandle r3 = net.bytebuddy.utility.JavaConstant.MethodHandle.of(r16)
            java.lang.Object r4 = r1.getOnly()
            net.bytebuddy.description.method.MethodDescription r4 = (net.bytebuddy.description.method.MethodDescription) r4
            net.bytebuddy.utility.JavaConstant$MethodType r4 = net.bytebuddy.utility.JavaConstant.MethodType.ofSignature(r4)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3, r4}
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitTarget r0 = bootstrap(r0, r2)
            net.bytebuddy.description.method.MethodList r1 = r1.asDefined()
            java.lang.Object r1 = r1.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
            java.lang.String r1 = r1.getInternalName()
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitArguments r0 = r0.invoke(r1)
            return r0
        Lf0:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " does not define exactly one abstract method: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L10a:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = " is not an interface type"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r10) {
            r9 = this;
            net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
            net.bytebuddy.implementation.InvokeDynamic r8 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r9.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r3 = r9.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r4 = r9.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r5 = net.bytebuddy.implementation.InvokeDynamic.TerminationHandler.DROPPING
            net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.<init>(r8, r10)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation.Composable
    public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r10) {
            r9 = this;
            net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
            net.bytebuddy.implementation.InvokeDynamic r8 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r9.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r3 = r9.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r4 = r9.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r5 = net.bytebuddy.implementation.InvokeDynamic.TerminationHandler.DROPPING
            net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r9.typing
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r1 = 2
            net.bytebuddy.implementation.Implementation[] r1 = new net.bytebuddy.implementation.Implementation[r1]
            r2 = 0
            r1[r2] = r8
            r2 = 1
            r1[r2] = r10
            r0.<init>(r1)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r2) {
            r1 = this;
            net.bytebuddy.implementation.InvokeDynamic$Appender r0 = new net.bytebuddy.implementation.InvokeDynamic$Appender
            net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
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
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r2 = r4.terminationHandler
            net.bytebuddy.implementation.InvokeDynamic r5 = (net.bytebuddy.implementation.InvokeDynamic) r5
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r3 = r5.terminationHandler
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.bootstrap
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.bootstrap
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            return r1
        L36:
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r4.arguments
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r3 = r5.arguments
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            return r1
        L41:
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r2 = r4.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r5.invocationProvider
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4c
            return r1
        L4c:
            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L57
            return r1
        L57:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.bootstrap
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r1 = r2.arguments
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r2.invocationProvider
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r1 = r2.terminationHandler
            int r1 = r1.hashCode()
            int r0 = r0 + r1
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

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r2) {
            r1 = this;
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r1.invocationProvider
            net.bytebuddy.dynamic.scaffold.InstrumentedType r2 = r0.prepare(r2)
            return r2
    }

    public net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withArgument(int r10) {
            r9 = this;
            if (r10 < 0) goto L16
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitType$OfArgument r8 = new net.bytebuddy.implementation.InvokeDynamic$WithImplicitType$OfArgument
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r9.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r9.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r9.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r9.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r9.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r9.typing
            r0 = r8
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
        L16:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Method parameter indices cannot be negative: "
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    public net.bytebuddy.implementation.InvokeDynamic withArgument(int... r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.length
            r0.<init>(r1)
            int r1 = r9.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L30
            r3 = r9[r2]
            if (r3 < 0) goto L19
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForMethodParameter r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForMethodParameter
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L19:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Method parameter indices cannot be negative: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L30:
            net.bytebuddy.implementation.InvokeDynamic r9 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r8.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r3 = r8.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r8.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r4 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r5 = r8.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r8.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r8.typing
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r9
    }

    public net.bytebuddy.implementation.Implementation.Composable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r9, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r10) {
            r8 = this;
            net.bytebuddy.implementation.InvokeDynamic r7 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r8.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
            r0 = r7
            r5 = r9
            r6 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public net.bytebuddy.implementation.InvokeDynamic withBooleanValue(boolean... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            boolean r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForBooleanConstant r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForBooleanConstant
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withByteValue(byte... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForByteConstant r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForByteConstant
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withCharacterValue(char... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            char r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForCharacterConstant r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForCharacterConstant
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withDoubleValue(double... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForDoubleConstant r5 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForDoubleConstant
            r5.<init>(r3)
            r0.add(r5)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withEnumeration(net.bytebuddy.description.enumeration.EnumerationDescription... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForEnumerationValue
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withField(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.INSTANCE
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitType r2 = r1.withField(r2, r0)
            return r2
    }

    public net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withField(java.lang.String r11, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r12) {
            r10 = this;
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitType$OfField r9 = new net.bytebuddy.implementation.InvokeDynamic$WithImplicitType$OfField
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r10.typing
            r0 = r9
            r7 = r11
            r8 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r9
    }

    public net.bytebuddy.implementation.InvokeDynamic withField(net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r11, java.lang.String... r12) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.length
            r0.<init>(r1)
            int r1 = r12.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r12[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForField r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForField
            r4.<init>(r3, r11)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r12 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r12.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withField(java.lang.String... r2) {
            r1 = this;
            net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.INSTANCE
            net.bytebuddy.implementation.InvokeDynamic r2 = r1.withField(r0, r2)
            return r2
    }

    public net.bytebuddy.implementation.InvokeDynamic withFloatValue(float... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForFloatConstant r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForFloatConstant
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withImplicitAndMethodArguments() {
            r8 = this;
            net.bytebuddy.implementation.InvokeDynamic r7 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodInstanceAndParameters r3 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodInstanceAndParameters.INSTANCE
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r0.appendArgument(r3)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public net.bytebuddy.implementation.InvokeDynamic withInstance(net.bytebuddy.utility.ConstantValue... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForJavaConstant
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withInstance(net.bytebuddy.utility.JavaConstant... r1) {
            r0 = this;
            net.bytebuddy.utility.ConstantValue[] r1 = (net.bytebuddy.utility.ConstantValue[]) r1
            net.bytebuddy.implementation.InvokeDynamic r1 = r0.withInstance(r1)
            return r1
    }

    public net.bytebuddy.implementation.InvokeDynamic withIntegerValue(int... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForIntegerConstant r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForIntegerConstant
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withLongValue(long... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForLongConstant r5 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForLongConstant
            r5.<init>(r3)
            r0.add(r5)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withMethodArguments() {
            r8 = this;
            net.bytebuddy.implementation.InvokeDynamic r7 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r8.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r0 = r8.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForInterceptedMethodParameters r3 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInterceptedMethodParameters.INSTANCE
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r0.appendArgument(r3)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r8.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r8.typing
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public net.bytebuddy.implementation.InvokeDynamic withNullValue(java.lang.Class<?>... r2) {
            r1 = this;
            net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
            r0.<init>(r2)
            r2 = 0
            net.bytebuddy.description.type.TypeDescription[] r2 = new net.bytebuddy.description.type.TypeDescription[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            net.bytebuddy.description.type.TypeDescription[] r2 = (net.bytebuddy.description.type.TypeDescription[]) r2
            net.bytebuddy.implementation.InvokeDynamic r2 = r1.withNullValue(r2)
            return r2
    }

    public net.bytebuddy.implementation.InvokeDynamic withNullValue(net.bytebuddy.description.type.TypeDescription... r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r9.length
            r0.<init>(r1)
            int r1 = r9.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L34
            r3 = r9[r2]
            boolean r4 = r3.isPrimitive()
            if (r4 != 0) goto L1d
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForNullValue r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForNullValue
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L1d:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot assign null to primitive type: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L34:
            net.bytebuddy.implementation.InvokeDynamic r9 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r8.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r3 = r8.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r8.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r4 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r5 = r8.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r8.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r7 = r8.typing
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r9
    }

    public net.bytebuddy.implementation.InvokeDynamic.WithImplicitType withReference(java.lang.Object r10) {
            r9 = this;
            net.bytebuddy.implementation.InvokeDynamic$WithImplicitType$OfInstance r8 = new net.bytebuddy.implementation.InvokeDynamic$WithImplicitType$OfInstance
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r9.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r9.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r3 = r9.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r4 = r9.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r9.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r9.typing
            r0 = r8
            r7 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    public net.bytebuddy.implementation.InvokeDynamic withReference(java.lang.Object... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L16
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r3 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ForInstance.of(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L8
        L16:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withShortValue(short... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            short r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForShortConstant r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForShortConstant
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withThis(java.lang.Class<?>... r2) {
            r1 = this;
            net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
            r0.<init>(r2)
            r2 = 0
            net.bytebuddy.description.type.TypeDescription[] r2 = new net.bytebuddy.description.type.TypeDescription[r2]
            java.lang.Object[] r2 = r0.toArray(r2)
            net.bytebuddy.description.type.TypeDescription[] r2 = (net.bytebuddy.description.type.TypeDescription[]) r2
            net.bytebuddy.implementation.InvokeDynamic r2 = r1.withThis(r2)
            return r2
    }

    public net.bytebuddy.implementation.InvokeDynamic withThis(net.bytebuddy.description.type.TypeDescription... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForThisInstance r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForThisInstance
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withType(net.bytebuddy.description.type.TypeDescription... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L17
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant r4 = new net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider$ForClassConstant
            r4.<init>(r3)
            r0.add(r4)
            int r2 = r2 + 1
            goto L8
        L17:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.bytebuddy.implementation.InvokeDynamic withValue(java.lang.Object... r11) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r11.length
            r0.<init>(r1)
            int r1 = r11.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L16
            r3 = r11[r2]
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider$ArgumentProvider r3 = net.bytebuddy.implementation.InvokeDynamic.InvocationProvider.ArgumentProvider.ConstantPoolWrapper.of(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L8
        L16:
            net.bytebuddy.implementation.InvokeDynamic r11 = new net.bytebuddy.implementation.InvokeDynamic
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.bootstrap
            java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r10.arguments
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r1 = r10.invocationProvider
            net.bytebuddy.implementation.InvokeDynamic$InvocationProvider r6 = r1.appendArguments(r0)
            net.bytebuddy.implementation.InvokeDynamic$TerminationHandler r7 = r10.terminationHandler
            net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r10.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r9 = r10.typing
            r3 = r11
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return r11
    }
}
