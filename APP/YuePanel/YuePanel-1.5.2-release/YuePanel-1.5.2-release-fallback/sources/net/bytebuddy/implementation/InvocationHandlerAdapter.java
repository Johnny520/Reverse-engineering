package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public abstract class InvocationHandlerAdapter implements net.bytebuddy.implementation.Implementation.Composable {
    private static final boolean CACHED = true;
    private static final boolean DROPPING = false;
    private static final net.bytebuddy.description.type.TypeDescription.Generic INVOCATION_HANDLER_TYPE = null;
    private static final boolean PRIVILEGED = true;
    private static final boolean RETURNING = true;
    private static final boolean UNCACHED = false;
    private static final boolean UNPRIVILEGED = false;
    protected final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
    protected final boolean cached;
    protected final java.lang.String fieldName;
    protected final boolean privileged;
    protected final boolean returning;

    public interface AssignerConfigurable extends net.bytebuddy.implementation.Implementation.Composable {
        net.bytebuddy.implementation.Implementation.Composable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r1);
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForField extends net.bytebuddy.implementation.InvocationHandlerAdapter implements net.bytebuddy.implementation.InvocationHandlerAdapter.WithoutPrivilegeConfiguration {
        private final net.bytebuddy.dynamic.scaffold.FieldLocator.Factory fieldLocatorFactory;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.description.field.FieldDescription fieldDescription;
            final /* synthetic */ net.bytebuddy.implementation.InvocationHandlerAdapter.ForField this$0;

            public Appender(net.bytebuddy.implementation.InvocationHandlerAdapter.ForField r1, net.bytebuddy.description.field.FieldDescription r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.fieldDescription = r2
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                    r6 = this;
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r0 = r6.this$0
                    net.bytebuddy.description.field.FieldDescription r1 = r6.fieldDescription
                    boolean r1 = r1.isStatic()
                    if (r1 == 0) goto Le
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r1 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                Lc:
                    r4 = r1
                    goto L13
                Le:
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                    goto Lc
                L13:
                    net.bytebuddy.description.field.FieldDescription r5 = r6.fieldDescription
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
                    net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForField$Appender r5 = (net.bytebuddy.implementation.InvocationHandlerAdapter.ForField.Appender) r5
                    net.bytebuddy.description.field.FieldDescription r3 = r5.fieldDescription
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r2 = r4.this$0
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r5 = r5.this$0
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
                    net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r1 = r2.this$0
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public ForField(java.lang.String r1, boolean r2, boolean r3, boolean r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                r0.fieldLocatorFactory = r6
                return
        }

        @Override // net.bytebuddy.implementation.Implementation.Composable
        public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r10) {
                r9 = this;
                net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r8 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForField
                java.lang.String r2 = r9.fieldName
                boolean r3 = r9.cached
                boolean r4 = r9.privileged
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r7 = r9.fieldLocatorFactory
                r5 = 0
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r0.<init>(r8, r10)
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation.Composable
        public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r10) {
                r9 = this;
                net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r8 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForField
                java.lang.String r2 = r9.fieldName
                boolean r3 = r9.cached
                boolean r4 = r9.privileged
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r7 = r9.fieldLocatorFactory
                r5 = 0
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
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r4) {
                r3 = this;
                net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r0 = r3.fieldLocatorFactory
                net.bytebuddy.description.type.TypeDescription r1 = r4.getInstrumentedType()
                net.bytebuddy.dynamic.scaffold.FieldLocator r0 = r0.make(r1)
                java.lang.String r1 = r3.fieldName
                net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r0 = r0.locate(r1)
                boolean r1 = r0.isResolved()
                if (r1 == 0) goto L54
                net.bytebuddy.description.field.FieldDescription r4 = r0.getField()
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                java.lang.Class<java.lang.reflect.InvocationHandler> r1 = java.lang.reflect.InvocationHandler.class
                boolean r4 = r4.isAssignableTo(r1)
                if (r4 == 0) goto L34
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForField$Appender r4 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForField$Appender
                net.bytebuddy.description.field.FieldDescription r0 = r0.getField()
                r4.<init>(r3, r0)
                return r4
            L34:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Field "
                r1.append(r2)
                net.bytebuddy.description.field.FieldDescription r0 = r0.getField()
                r1.append(r0)
                java.lang.String r0 = " does not declare a type that is assignable to invocation handler"
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                r4.<init>(r0)
                throw r4
            L54:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Could not find a field named '"
                r1.append(r2)
                java.lang.String r2 = r3.fieldName
                r1.append(r2)
                java.lang.String r2 = "' for "
                r1.append(r2)
                net.bytebuddy.description.type.TypeDescription r4 = r4.getInstrumentedType()
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter
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
                net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r2 = r4.fieldLocatorFactory
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r5 = (net.bytebuddy.implementation.InvocationHandlerAdapter.ForField) r5
                net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r5 = r5.fieldLocatorFactory
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r1 = r2.fieldLocatorFactory
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
                r0 = this;
                return r1
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter, net.bytebuddy.implementation.InvocationHandlerAdapter.AssignerConfigurable
        public net.bytebuddy.implementation.Implementation.Composable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r9) {
                r8 = this;
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r7 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForField
                java.lang.String r1 = r8.fieldName
                boolean r2 = r8.cached
                boolean r3 = r8.privileged
                boolean r4 = r8.returning
                net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r6 = r8.fieldLocatorFactory
                r0 = r7
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter, net.bytebuddy.implementation.InvocationHandlerAdapter.AssignerConfigurable
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.Implementation withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r1) {
                r0 = this;
                net.bytebuddy.implementation.Implementation$Composable r1 = r0.withAssigner(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter, net.bytebuddy.implementation.InvocationHandlerAdapter.WithoutPrivilegeConfiguration
        public net.bytebuddy.implementation.InvocationHandlerAdapter.AssignerConfigurable withPrivilegedLookup() {
                r8 = this;
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r7 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForField
                java.lang.String r1 = r8.fieldName
                boolean r2 = r8.cached
                boolean r4 = r8.returning
                net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r6 = r8.fieldLocatorFactory
                r3 = 1
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter
        public net.bytebuddy.implementation.InvocationHandlerAdapter.WithoutPrivilegeConfiguration withoutMethodCache() {
                r8 = this;
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r7 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForField
                java.lang.String r1 = r8.fieldName
                boolean r3 = r8.privileged
                boolean r4 = r8.returning
                net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                net.bytebuddy.dynamic.scaffold.FieldLocator$Factory r6 = r8.fieldLocatorFactory
                r2 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForInstance extends net.bytebuddy.implementation.InvocationHandlerAdapter implements net.bytebuddy.implementation.InvocationHandlerAdapter.WithoutPrivilegeConfiguration {
        private static final java.lang.String PREFIX = "invocationHandler";
        protected final java.lang.reflect.InvocationHandler invocationHandler;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
        public class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            final /* synthetic */ net.bytebuddy.implementation.InvocationHandlerAdapter.ForInstance this$0;

            public Appender(net.bytebuddy.implementation.InvocationHandlerAdapter.ForInstance r1, net.bytebuddy.description.type.TypeDescription r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.instrumentedType = r2
                    return
            }

            @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
            public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.description.method.MethodDescription r9) {
                    r6 = this;
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r0 = r6.this$0
                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r4 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                    net.bytebuddy.description.type.TypeDescription r1 = r6.instrumentedType
                    net.bytebuddy.description.field.FieldList r1 = r1.getDeclaredFields()
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r2 = r6.this$0
                    java.lang.String r2 = r2.fieldName
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.named(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.implementation.InvocationHandlerAdapter.access$000()
                    net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.genericFieldType(r3)
                    net.bytebuddy.matcher.ElementMatcher$Junction r2 = r2.and(r3)
                    net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
                    net.bytebuddy.description.field.FieldList r1 = (net.bytebuddy.description.field.FieldList) r1
                    java.lang.Object r1 = r1.getOnly()
                    r5 = r1
                    net.bytebuddy.description.field.FieldDescription r5 = (net.bytebuddy.description.field.FieldDescription) r5
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance$Appender r5 = (net.bytebuddy.implementation.InvocationHandlerAdapter.ForInstance.Appender) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r2 = r4.this$0
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r5 = r5.this$0
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
                    net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r1 = r2.this$0
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public ForInstance(java.lang.String r1, boolean r2, boolean r3, boolean r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, java.lang.reflect.InvocationHandler r6) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4, r5)
                r0.invocationHandler = r6
                return
        }

        @Override // net.bytebuddy.implementation.Implementation.Composable
        public net.bytebuddy.implementation.Implementation.Composable andThen(net.bytebuddy.implementation.Implementation.Composable r10) {
                r9 = this;
                net.bytebuddy.implementation.Implementation$Compound$Composable r0 = new net.bytebuddy.implementation.Implementation$Compound$Composable
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r8 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance
                java.lang.String r2 = r9.fieldName
                boolean r3 = r9.cached
                boolean r4 = r9.privileged
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                java.lang.reflect.InvocationHandler r7 = r9.invocationHandler
                r5 = 0
                r1 = r8
                r1.<init>(r2, r3, r4, r5, r6, r7)
                r0.<init>(r8, r10)
                return r0
        }

        @Override // net.bytebuddy.implementation.Implementation.Composable
        public net.bytebuddy.implementation.Implementation andThen(net.bytebuddy.implementation.Implementation r10) {
                r9 = this;
                net.bytebuddy.implementation.Implementation$Compound r0 = new net.bytebuddy.implementation.Implementation$Compound
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r8 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance
                java.lang.String r2 = r9.fieldName
                boolean r3 = r9.cached
                boolean r4 = r9.privileged
                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
                java.lang.reflect.InvocationHandler r7 = r9.invocationHandler
                r5 = 0
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
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance$Appender r0 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance$Appender
                net.bytebuddy.description.type.TypeDescription r2 = r2.getInstrumentedType()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter
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
                java.lang.reflect.InvocationHandler r2 = r4.invocationHandler
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r5 = (net.bytebuddy.implementation.InvocationHandlerAdapter.ForInstance) r5
                java.lang.reflect.InvocationHandler r5 = r5.invocationHandler
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L27
                return r1
            L27:
                return r0
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter
        public int hashCode() {
                r2 = this;
                int r0 = super.hashCode()
                int r0 = r0 * 31
                java.lang.reflect.InvocationHandler r1 = r2.invocationHandler
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
        public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r5) {
                r4 = this;
                net.bytebuddy.description.field.FieldList r0 = r5.getDeclaredFields()
                java.lang.String r1 = r4.fieldName
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.implementation.InvocationHandlerAdapter.access$000()
                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.fieldType(r2)
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
                net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                net.bytebuddy.description.field.FieldList r0 = (net.bytebuddy.description.field.FieldList) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L45
                net.bytebuddy.description.field.FieldDescription$Token r0 = new net.bytebuddy.description.field.FieldDescription$Token
                java.lang.String r1 = r4.fieldName
                r2 = 4169(0x1049, float:5.842E-42)
                net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.implementation.InvocationHandlerAdapter.access$000()
                r0.<init>(r1, r2, r3)
                net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withField(r0)
                net.bytebuddy.implementation.LoadedTypeInitializer$ForStaticField r0 = new net.bytebuddy.implementation.LoadedTypeInitializer$ForStaticField
                java.lang.String r1 = r4.fieldName
                java.lang.reflect.InvocationHandler r2 = r4.invocationHandler
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.scaffold.InstrumentedType r5 = r5.withInitializer(r0)
                return r5
            L45:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Field with name "
                r1.append(r2)
                java.lang.String r2 = r4.fieldName
                r1.append(r2)
                java.lang.String r2 = " and type "
                r1.append(r2)
                net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.implementation.InvocationHandlerAdapter.access$000()
                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                r1.append(r2)
                java.lang.String r2 = " already declared by "
                r1.append(r2)
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter, net.bytebuddy.implementation.InvocationHandlerAdapter.AssignerConfigurable
        public net.bytebuddy.implementation.Implementation.Composable withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r9) {
                r8 = this;
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r7 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance
                java.lang.String r1 = r8.fieldName
                boolean r2 = r8.cached
                boolean r3 = r8.privileged
                boolean r4 = r8.returning
                java.lang.reflect.InvocationHandler r6 = r8.invocationHandler
                r0 = r7
                r5 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter, net.bytebuddy.implementation.InvocationHandlerAdapter.AssignerConfigurable
        public /* bridge */ /* synthetic */ net.bytebuddy.implementation.Implementation withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r1) {
                r0 = this;
                net.bytebuddy.implementation.Implementation$Composable r1 = r0.withAssigner(r1)
                return r1
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter, net.bytebuddy.implementation.InvocationHandlerAdapter.WithoutPrivilegeConfiguration
        public net.bytebuddy.implementation.InvocationHandlerAdapter.AssignerConfigurable withPrivilegedLookup() {
                r8 = this;
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r7 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance
                java.lang.String r1 = r8.fieldName
                boolean r2 = r8.cached
                boolean r4 = r8.returning
                net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                java.lang.reflect.InvocationHandler r6 = r8.invocationHandler
                r3 = 1
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }

        @Override // net.bytebuddy.implementation.InvocationHandlerAdapter
        public net.bytebuddy.implementation.InvocationHandlerAdapter.WithoutPrivilegeConfiguration withoutMethodCache() {
                r8 = this;
                net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r7 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance
                java.lang.String r1 = r8.fieldName
                boolean r3 = r8.privileged
                boolean r4 = r8.returning
                net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r8.assigner
                java.lang.reflect.InvocationHandler r6 = r8.invocationHandler
                r2 = 0
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return r7
        }
    }

    public interface WithoutPrivilegeConfiguration extends net.bytebuddy.implementation.InvocationHandlerAdapter.AssignerConfigurable {
        net.bytebuddy.implementation.InvocationHandlerAdapter.AssignerConfigurable withPrivilegedLookup();
    }

    static {
            java.lang.Class<java.lang.reflect.InvocationHandler> r0 = java.lang.reflect.InvocationHandler.class
            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r0)
            net.bytebuddy.implementation.InvocationHandlerAdapter.INVOCATION_HANDLER_TYPE = r0
            return
    }

    public InvocationHandlerAdapter(java.lang.String r1, boolean r2, boolean r3, boolean r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5) {
            r0 = this;
            r0.<init>()
            r0.fieldName = r1
            r0.cached = r2
            r0.privileged = r3
            r0.returning = r4
            r0.assigner = r5
            return
    }

    public static /* synthetic */ net.bytebuddy.description.type.TypeDescription.Generic access$000() {
            net.bytebuddy.description.type.TypeDescription$Generic r0 = net.bytebuddy.implementation.InvocationHandlerAdapter.INVOCATION_HANDLER_TYPE
            return r0
    }

    private java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> argumentValuesOf(net.bytebuddy.description.method.MethodDescription r10) {
            r9 = this;
            net.bytebuddy.description.method.ParameterList r10 = r10.getParameters()
            net.bytebuddy.description.type.TypeList$Generic r10 = r10.asTypeList()
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r10.size()
            r0.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
            r1 = 1
            r2 = r1
        L17:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto L53
            java.lang.Object r3 = r10.next()
            net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r3)
            net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.loadFrom(r2)
            net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r9.assigner
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription$Generic r7 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r7)
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r8 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
            net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.assign(r3, r7, r8)
            r7 = 2
            net.bytebuddy.implementation.bytecode.StackManipulation[] r7 = new net.bytebuddy.implementation.bytecode.StackManipulation[r7]
            r8 = 0
            r7[r8] = r5
            r7[r1] = r6
            r4.<init>(r7)
            r0.add(r4)
            net.bytebuddy.implementation.bytecode.StackSize r3 = r3.getStackSize()
            int r3 = r3.getSize()
            int r2 = r2 + r3
            goto L17
        L53:
            return r0
    }

    public static net.bytebuddy.implementation.InvocationHandlerAdapter of(java.lang.reflect.InvocationHandler r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "invocationHandler$"
            r0.append(r1)
            java.lang.String r1 = net.bytebuddy.utility.RandomString.hashOf(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            net.bytebuddy.implementation.InvocationHandlerAdapter r2 = of(r2, r0)
            return r2
    }

    public static net.bytebuddy.implementation.InvocationHandlerAdapter of(java.lang.reflect.InvocationHandler r8, java.lang.String r9) {
            net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance r7 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForInstance
            r4 = 1
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
            r2 = 1
            r3 = 0
            r0 = r7
            r1 = r9
            r6 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public static net.bytebuddy.implementation.InvocationHandlerAdapter toField(java.lang.String r1) {
            net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy$Factory r0 = net.bytebuddy.dynamic.scaffold.FieldLocator.ForClassHierarchy.Factory.INSTANCE
            net.bytebuddy.implementation.InvocationHandlerAdapter r1 = toField(r1, r0)
            return r1
    }

    public static net.bytebuddy.implementation.InvocationHandlerAdapter toField(java.lang.String r8, net.bytebuddy.dynamic.scaffold.FieldLocator.Factory r9) {
            net.bytebuddy.implementation.InvocationHandlerAdapter$ForField r7 = new net.bytebuddy.implementation.InvocationHandlerAdapter$ForField
            r4 = 1
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
            r2 = 1
            r3 = 0
            r0 = r7
            r1 = r8
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r17, net.bytebuddy.implementation.Implementation.Context r18, net.bytebuddy.description.method.MethodDescription r19, net.bytebuddy.implementation.bytecode.StackManipulation r20, net.bytebuddy.description.field.FieldDescription r21) {
            r16 = this;
            r0 = r16
            r1 = r19
            r2 = 1
            r3 = 0
            r4 = 2
            boolean r5 = r19.isStatic()
            if (r5 != 0) goto Ld3
            boolean r5 = r19.isConstructor()
            if (r5 != 0) goto Ld3
            boolean r5 = r0.privileged
            if (r5 == 0) goto L22
            net.bytebuddy.description.ByteCodeElement$TypeDependant r5 = r19.asDefined()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r5
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCache r5 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.ofPrivileged(r5)
            goto L2c
        L22:
            net.bytebuddy.description.ByteCodeElement$TypeDependant r5 = r19.asDefined()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r5
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCache r5 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.of(r5)
        L2c:
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r6 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r7 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r21)
            net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.read()
            net.bytebuddy.implementation.bytecode.StackManipulation r8 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
            boolean r9 = r0.cached
            if (r9 == 0) goto L42
            net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.cached()
        L42:
            net.bytebuddy.description.method.ParameterList r9 = r19.getParameters()
            boolean r9 = r9.isEmpty()
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            if (r9 == 0) goto L51
            net.bytebuddy.implementation.bytecode.constant.NullConstant r9 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
            goto L61
        L51:
            net.bytebuddy.description.type.TypeDescription$Generic r9 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r10)
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory r9 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r9)
            java.util.List r11 = r0.argumentValuesOf(r1)
            net.bytebuddy.implementation.bytecode.StackManipulation r9 = r9.withValues(r11)
        L61:
            net.bytebuddy.description.type.TypeDescription$Generic r11 = net.bytebuddy.implementation.InvocationHandlerAdapter.INVOCATION_HANDLER_TYPE
            net.bytebuddy.description.method.MethodList r11 = r11.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r12 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
            net.bytebuddy.matcher.FilterableList r11 = r11.filter(r12)
            net.bytebuddy.description.method.MethodList r11 = (net.bytebuddy.description.method.MethodList) r11
            java.lang.Object r11 = r11.getOnly()
            net.bytebuddy.description.method.MethodDescription r11 = (net.bytebuddy.description.method.MethodDescription) r11
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r11 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r11)
            boolean r12 = r0.returning
            if (r12 == 0) goto La3
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r12 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            net.bytebuddy.implementation.bytecode.assign.Assigner r13 = r0.assigner
            net.bytebuddy.description.type.TypeDescription$Generic r10 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r10)
            net.bytebuddy.description.type.TypeDescription$Generic r14 = r19.getReturnType()
            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r15 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC
            net.bytebuddy.implementation.bytecode.StackManipulation r10 = r13.assign(r10, r14, r15)
            net.bytebuddy.description.type.TypeDescription$Generic r13 = r19.getReturnType()
            net.bytebuddy.implementation.bytecode.StackManipulation r13 = net.bytebuddy.implementation.bytecode.member.MethodReturn.of(r13)
            net.bytebuddy.implementation.bytecode.StackManipulation[] r14 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
            r14[r3] = r10
            r14[r2] = r13
            r12.<init>(r14)
            goto La5
        La3:
            net.bytebuddy.implementation.bytecode.Removal r12 = net.bytebuddy.implementation.bytecode.Removal.SINGLE
        La5:
            r10 = 7
            net.bytebuddy.implementation.bytecode.StackManipulation[] r10 = new net.bytebuddy.implementation.bytecode.StackManipulation[r10]
            r10[r3] = r20
            r10[r2] = r7
            r10[r4] = r8
            r2 = 3
            r10[r2] = r5
            r2 = 4
            r10[r2] = r9
            r2 = 5
            r10[r2] = r11
            r2 = 6
            r10[r2] = r12
            r6.<init>(r10)
            r2 = r17
            r3 = r18
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r6.apply(r2, r3)
            net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r3 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
            int r2 = r2.getMaximalSize()
            int r1 = r19.getStackSize()
            r3.<init>(r2, r1)
            return r3
        Ld3:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "It is not possible to apply an invocation handler onto the static method or constructor "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
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
            boolean r2 = r4.cached
            net.bytebuddy.implementation.InvocationHandlerAdapter r5 = (net.bytebuddy.implementation.InvocationHandlerAdapter) r5
            boolean r3 = r5.cached
            if (r2 == r3) goto L1c
            return r1
        L1c:
            boolean r2 = r4.privileged
            boolean r3 = r5.privileged
            if (r2 == r3) goto L23
            return r1
        L23:
            boolean r2 = r4.returning
            boolean r3 = r5.returning
            if (r2 == r3) goto L2a
            return r1
        L2a:
            java.lang.String r2 = r4.fieldName
            java.lang.String r3 = r5.fieldName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L35
            return r1
        L35:
            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L40
            return r1
        L40:
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
            boolean r1 = r2.cached
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.privileged
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.returning
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public abstract net.bytebuddy.implementation.Implementation withAssigner(net.bytebuddy.implementation.bytecode.assign.Assigner r1);

    public abstract net.bytebuddy.implementation.InvocationHandlerAdapter.AssignerConfigurable withPrivilegedLookup();

    public abstract net.bytebuddy.implementation.InvocationHandlerAdapter.WithoutPrivilegeConfiguration withoutMethodCache();
}
