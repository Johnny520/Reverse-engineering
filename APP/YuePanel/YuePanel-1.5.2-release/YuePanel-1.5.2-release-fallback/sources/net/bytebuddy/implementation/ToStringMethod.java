package net.bytebuddy.implementation;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class ToStringMethod implements net.bytebuddy.implementation.Implementation {
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape STRING_BUILDER_CONSTRUCTOR = null;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape TO_STRING = null;
    private final java.lang.String definer;
    private final java.lang.String end;
    private final net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> ignored;
    private final net.bytebuddy.implementation.ToStringMethod.PrefixResolver prefixResolver;
    private final java.lang.String separator;
    private final java.lang.String start;

    /* JADX INFO: renamed from: net.bytebuddy.implementation.ToStringMethod$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Appender implements net.bytebuddy.implementation.bytecode.ByteCodeAppender {
        private final java.lang.String definer;
        private final java.lang.String end;
        private final java.util.List<? extends net.bytebuddy.description.field.FieldDescription.InDefinedShape> fieldDescriptions;
        private final java.lang.String prefix;
        private final java.lang.String separator;
        private final java.lang.String start;

        public Appender(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.util.List<? extends net.bytebuddy.description.field.FieldDescription.InDefinedShape> r6) {
                r0 = this;
                r0.<init>()
                r0.prefix = r1
                r0.start = r2
                r0.end = r3
                r0.separator = r4
                r0.definer = r5
                r0.fieldDescriptions = r6
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r9, net.bytebuddy.implementation.Implementation.Context r10, net.bytebuddy.description.method.MethodDescription r11) {
                r8 = this;
                boolean r0 = r11.isStatic()
                if (r0 != 0) goto L119
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r11.getReturnType()
                net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                boolean r0 = r0.isAssignableFrom(r1)
                if (r0 == 0) goto L102
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r8.fieldDescriptions
                int r1 = r1.size()
                int r1 = r1 * 7
                int r1 = r1 + (-2)
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                int r1 = r1 + 10
                r0.<init>(r1)
                java.lang.Class<java.lang.StringBuilder> r1 = java.lang.StringBuilder.class
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r1)
                r0.add(r1)
                net.bytebuddy.implementation.bytecode.Duplication r1 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                r0.add(r1)
                net.bytebuddy.implementation.bytecode.constant.TextConstant r1 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                java.lang.String r3 = r8.prefix
                r1.<init>(r3)
                r0.add(r1)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.implementation.ToStringMethod.access$000()
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                r0.add(r1)
                net.bytebuddy.implementation.bytecode.constant.TextConstant r1 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                java.lang.String r3 = r8.start
                r1.<init>(r3)
                r0.add(r1)
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.STRING
                r0.add(r1)
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r8.fieldDescriptions
                java.util.Iterator r1 = r1.iterator()
                r3 = 1
            L69:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto Lcc
                java.lang.Object r4 = r1.next()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r4 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r4
                if (r3 == 0) goto L79
                r3 = r2
                goto L88
            L79:
                net.bytebuddy.implementation.bytecode.constant.TextConstant r5 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                java.lang.String r6 = r8.separator
                r5.<init>(r6)
                r0.add(r5)
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r5 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.STRING
                r0.add(r5)
            L88:
                net.bytebuddy.implementation.bytecode.constant.TextConstant r5 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r4.getName()
                r6.append(r7)
                java.lang.String r7 = r8.definer
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                r5.<init>(r6)
                r0.add(r5)
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r5 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.STRING
                r0.add(r5)
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                r0.add(r5)
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r5 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.read()
                r0.add(r5)
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getType()
                net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.of(r4)
                r0.add(r4)
                goto L69
            Lcc:
                net.bytebuddy.implementation.bytecode.constant.TextConstant r1 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                java.lang.String r2 = r8.end
                r1.<init>(r2)
                r0.add(r1)
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.STRING
                r0.add(r1)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.implementation.ToStringMethod.access$100()
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                r0.add(r1)
                net.bytebuddy.implementation.bytecode.member.MethodReturn r1 = net.bytebuddy.implementation.bytecode.member.MethodReturn.REFERENCE
                r0.add(r1)
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                r2.<init>(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r9 = r2.apply(r9, r10)
                int r9 = r9.getMaximalSize()
                int r10 = r11.getStackSize()
                r1.<init>(r9, r10)
                return r1
            L102:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "toString method does not return String-compatible type: "
                r10.append(r0)
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.<init>(r10)
                throw r9
            L119:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.StringBuilder r10 = new java.lang.StringBuilder
                r10.<init>()
                java.lang.String r0 = "toString method must not be static: "
                r10.append(r0)
                r10.append(r11)
                java.lang.String r10 = r10.toString()
                r9.<init>(r10)
                throw r9
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
                java.lang.String r2 = r4.prefix
                net.bytebuddy.implementation.ToStringMethod$Appender r5 = (net.bytebuddy.implementation.ToStringMethod.Appender) r5
                java.lang.String r3 = r5.prefix
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.lang.String r2 = r4.start
                java.lang.String r3 = r5.start
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2b
                return r1
            L2b:
                java.lang.String r2 = r4.end
                java.lang.String r3 = r5.end
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L36
                return r1
            L36:
                java.lang.String r2 = r4.separator
                java.lang.String r3 = r5.separator
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L41
                return r1
            L41:
                java.lang.String r2 = r4.definer
                java.lang.String r3 = r5.definer
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L4c
                return r1
            L4c:
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.fieldDescriptions
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r5.fieldDescriptions
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
                java.lang.String r1 = r2.prefix
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.start
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.end
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.separator
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.definer
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.fieldDescriptions
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    public interface PrefixResolver {

        public enum Default extends java.lang.Enum<net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default> implements net.bytebuddy.implementation.ToStringMethod.PrefixResolver {
            private static final /* synthetic */ net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default[] $VALUES = null;
            public static final net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default CANONICAL_CLASS_NAME = null;
            public static final net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default FULLY_QUALIFIED_CLASS_NAME = null;
            public static final net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default SIMPLE_CLASS_NAME = null;




            static {
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default$1 r0 = new net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default$1
                    java.lang.String r1 = "FULLY_QUALIFIED_CLASS_NAME"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.FULLY_QUALIFIED_CLASS_NAME = r0
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default$2 r1 = new net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default$2
                    java.lang.String r3 = "CANONICAL_CLASS_NAME"
                    r4 = 1
                    r1.<init>(r3, r4)
                    net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.CANONICAL_CLASS_NAME = r1
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default$3 r3 = new net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default$3
                    java.lang.String r5 = "SIMPLE_CLASS_NAME"
                    r6 = 2
                    r3.<init>(r5, r6)
                    net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.SIMPLE_CLASS_NAME = r3
                    r5 = 3
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default[] r5 = new net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default[r5]
                    r5[r2] = r0
                    r5[r4] = r1
                    r5[r6] = r3
                    net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.$VALUES = r5
                    return
            }

            Default(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            /* synthetic */ Default(java.lang.String r1, int r2, net.bytebuddy.implementation.ToStringMethod.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default> r0 = net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default r1 = (net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default) r1
                    return r1
            }

            public static net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default[] values() {
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default[] r0 = net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default[] r0 = (net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default[]) r0
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForFixedValue implements net.bytebuddy.implementation.ToStringMethod.PrefixResolver {
            private final java.lang.String prefix;

            public ForFixedValue(java.lang.String r1) {
                    r0 = this;
                    r0.<init>()
                    r0.prefix = r1
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
                    java.lang.String r2 = r4.prefix
                    net.bytebuddy.implementation.ToStringMethod$PrefixResolver$ForFixedValue r5 = (net.bytebuddy.implementation.ToStringMethod.PrefixResolver.ForFixedValue) r5
                    java.lang.String r5 = r5.prefix
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
                    java.lang.String r1 = r2.prefix
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.ToStringMethod.PrefixResolver
            public java.lang.String resolve(net.bytebuddy.description.type.TypeDescription r1) {
                    r0 = this;
                    java.lang.String r1 = r0.prefix
                    return r1
            }
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.String resolve(net.bytebuddy.description.type.TypeDescription r1);
    }

    public enum ValueConsumer extends java.lang.Enum<net.bytebuddy.implementation.ToStringMethod.ValueConsumer> implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private static final /* synthetic */ net.bytebuddy.implementation.ToStringMethod.ValueConsumer[] $VALUES = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer BOOLEAN = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer BOOLEAN_ARRAY = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer BYTE_ARRAY = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer CHARACTER = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer CHARACTER_ARRAY = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer CHARACTER_SEQUENCE = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer DOUBLE = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer DOUBLE_ARRAY = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer FLOAT = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer FLOAT_ARRAY = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer INTEGER = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer INTEGER_ARRAY = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer LONG = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer LONG_ARRAY = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer NESTED_ARRAY = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer OBJECT = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer REFERENCE_ARRAY = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer SHORT_ARRAY = null;
        public static final net.bytebuddy.implementation.ToStringMethod.ValueConsumer STRING = null;




















        static {
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$1 r0 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$1
                java.lang.String r1 = "BOOLEAN"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.BOOLEAN = r0
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$2 r1 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$2
                java.lang.String r3 = "CHARACTER"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.CHARACTER = r1
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$3 r3 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$3
                java.lang.String r5 = "INTEGER"
                r6 = 2
                r3.<init>(r5, r6)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.INTEGER = r3
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$4 r5 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$4
                java.lang.String r7 = "LONG"
                r8 = 3
                r5.<init>(r7, r8)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.LONG = r5
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$5 r7 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$5
                java.lang.String r9 = "FLOAT"
                r10 = 4
                r7.<init>(r9, r10)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.FLOAT = r7
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$6 r9 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$6
                java.lang.String r11 = "DOUBLE"
                r12 = 5
                r9.<init>(r11, r12)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.DOUBLE = r9
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$7 r11 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$7
                java.lang.String r13 = "STRING"
                r14 = 6
                r11.<init>(r13, r14)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.STRING = r11
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$8 r13 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$8
                java.lang.String r15 = "CHARACTER_SEQUENCE"
                r14 = 7
                r13.<init>(r15, r14)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.CHARACTER_SEQUENCE = r13
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$9 r15 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$9
                java.lang.String r14 = "OBJECT"
                r12 = 8
                r15.<init>(r14, r12)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.OBJECT = r15
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$10 r14 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$10
                java.lang.String r12 = "BOOLEAN_ARRAY"
                r10 = 9
                r14.<init>(r12, r10)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.BOOLEAN_ARRAY = r14
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$11 r12 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$11
                java.lang.String r10 = "BYTE_ARRAY"
                r8 = 10
                r12.<init>(r10, r8)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.BYTE_ARRAY = r12
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$12 r10 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$12
                java.lang.String r8 = "SHORT_ARRAY"
                r6 = 11
                r10.<init>(r8, r6)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.SHORT_ARRAY = r10
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$13 r8 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$13
                java.lang.String r6 = "CHARACTER_ARRAY"
                r4 = 12
                r8.<init>(r6, r4)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.CHARACTER_ARRAY = r8
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$14 r6 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$14
                java.lang.String r4 = "INTEGER_ARRAY"
                r2 = 13
                r6.<init>(r4, r2)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.INTEGER_ARRAY = r6
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$15 r4 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$15
                java.lang.String r2 = "LONG_ARRAY"
                r17 = r6
                r6 = 14
                r4.<init>(r2, r6)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.LONG_ARRAY = r4
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$16 r2 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$16
                java.lang.String r6 = "FLOAT_ARRAY"
                r18 = r4
                r4 = 15
                r2.<init>(r6, r4)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.FLOAT_ARRAY = r2
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$17 r6 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$17
                java.lang.String r4 = "DOUBLE_ARRAY"
                r19 = r2
                r2 = 16
                r6.<init>(r4, r2)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.DOUBLE_ARRAY = r6
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$18 r4 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$18
                java.lang.String r2 = "REFERENCE_ARRAY"
                r20 = r6
                r6 = 17
                r4.<init>(r2, r6)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.REFERENCE_ARRAY = r4
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer$19 r2 = new net.bytebuddy.implementation.ToStringMethod$ValueConsumer$19
                java.lang.String r6 = "NESTED_ARRAY"
                r21 = r4
                r4 = 18
                r2.<init>(r6, r4)
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.NESTED_ARRAY = r2
                r6 = 19
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer[] r6 = new net.bytebuddy.implementation.ToStringMethod.ValueConsumer[r6]
                r16 = 0
                r6[r16] = r0
                r0 = 1
                r6[r0] = r1
                r0 = 2
                r6[r0] = r3
                r0 = 3
                r6[r0] = r5
                r0 = 4
                r6[r0] = r7
                r0 = 5
                r6[r0] = r9
                r0 = 6
                r6[r0] = r11
                r0 = 7
                r6[r0] = r13
                r0 = 8
                r6[r0] = r15
                r0 = 9
                r6[r0] = r14
                r0 = 10
                r6[r0] = r12
                r0 = 11
                r6[r0] = r10
                r0 = 12
                r6[r0] = r8
                r0 = 13
                r6[r0] = r17
                r0 = 14
                r6[r0] = r18
                r0 = 15
                r6[r0] = r19
                r0 = 16
                r6[r0] = r20
                r0 = 17
                r6[r0] = r21
                r6[r4] = r2
                net.bytebuddy.implementation.ToStringMethod.ValueConsumer.$VALUES = r6
                return
        }

        ValueConsumer(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ ValueConsumer(java.lang.String r1, int r2, net.bytebuddy.implementation.ToStringMethod.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public static net.bytebuddy.implementation.bytecode.StackManipulation of(net.bytebuddy.description.type.TypeDescription r1) {
                java.lang.Class r0 = java.lang.Boolean.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto Lb
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.BOOLEAN
                return r1
            Lb:
                java.lang.Class r0 = java.lang.Character.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L16
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.CHARACTER
                return r1
            L16:
                java.lang.Class r0 = java.lang.Byte.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto Ld8
                java.lang.Class r0 = java.lang.Short.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 != 0) goto Ld8
                java.lang.Class r0 = java.lang.Integer.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L30
                goto Ld8
            L30:
                java.lang.Class r0 = java.lang.Long.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L3b
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.LONG
                return r1
            L3b:
                java.lang.Class r0 = java.lang.Float.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L46
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.FLOAT
                return r1
            L46:
                java.lang.Class r0 = java.lang.Double.TYPE
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L51
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.DOUBLE
                return r1
            L51:
                java.lang.Class<java.lang.String> r0 = java.lang.String.class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L5c
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.STRING
                return r1
            L5c:
                java.lang.Class<java.lang.CharSequence> r0 = java.lang.CharSequence.class
                boolean r0 = r1.isAssignableTo(r0)
                if (r0 == 0) goto L67
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.CHARACTER_SEQUENCE
                return r1
            L67:
                java.lang.Class<boolean[]> r0 = boolean[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L72
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.BOOLEAN_ARRAY
                return r1
            L72:
                java.lang.Class<byte[]> r0 = byte[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L7d
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.BYTE_ARRAY
                return r1
            L7d:
                java.lang.Class<short[]> r0 = short[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L88
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.SHORT_ARRAY
                return r1
            L88:
                java.lang.Class<char[]> r0 = char[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L93
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.CHARACTER_ARRAY
                return r1
            L93:
                java.lang.Class<int[]> r0 = int[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto L9e
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.INTEGER_ARRAY
                return r1
            L9e:
                java.lang.Class<long[]> r0 = long[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto La9
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.LONG_ARRAY
                return r1
            La9:
                java.lang.Class<float[]> r0 = float[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto Lb4
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.FLOAT_ARRAY
                return r1
            Lb4:
                java.lang.Class<double[]> r0 = double[].class
                boolean r0 = r1.represents(r0)
                if (r0 == 0) goto Lbf
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.DOUBLE_ARRAY
                return r1
            Lbf:
                boolean r0 = r1.isArray()
                if (r0 == 0) goto Ld5
                net.bytebuddy.description.type.TypeDescription r1 = r1.getComponentType()
                boolean r1 = r1.isArray()
                if (r1 == 0) goto Ld2
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.NESTED_ARRAY
                goto Ld4
            Ld2:
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.REFERENCE_ARRAY
            Ld4:
                return r1
            Ld5:
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.OBJECT
                return r1
            Ld8:
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.INTEGER
                return r1
        }

        public static net.bytebuddy.implementation.ToStringMethod.ValueConsumer valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.ToStringMethod$ValueConsumer> r0 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer r1 = (net.bytebuddy.implementation.ToStringMethod.ValueConsumer) r1
                return r1
        }

        public static net.bytebuddy.implementation.ToStringMethod.ValueConsumer[] values() {
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer[] r0 = net.bytebuddy.implementation.ToStringMethod.ValueConsumer.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.ToStringMethod$ValueConsumer[] r0 = (net.bytebuddy.implementation.ToStringMethod.ValueConsumer[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                r0 = 1
                return r0
        }
    }

    static {
            java.lang.Class<java.lang.StringBuilder> r0 = java.lang.StringBuilder.class
            net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r1 = r1.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r3)
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = r2.and(r3)
            net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
            java.lang.Object r1 = r1.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
            net.bytebuddy.implementation.ToStringMethod.STRING_BUILDER_CONSTRUCTOR = r1
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isToString()
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.implementation.ToStringMethod.TO_STRING = r0
            return
    }

    public ToStringMethod(net.bytebuddy.implementation.ToStringMethod.PrefixResolver r8) {
            r7 = this;
            java.lang.String r5 = "="
            net.bytebuddy.matcher.ElementMatcher$Junction r6 = net.bytebuddy.matcher.ElementMatchers.none()
            java.lang.String r2 = "{"
            java.lang.String r3 = "}"
            java.lang.String r4 = ", "
            r0 = r7
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private ToStringMethod(net.bytebuddy.implementation.ToStringMethod.PrefixResolver r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, net.bytebuddy.matcher.ElementMatcher.Junction<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r6) {
            r0 = this;
            r0.<init>()
            r0.prefixResolver = r1
            r0.start = r2
            r0.end = r3
            r0.separator = r4
            r0.definer = r5
            r0.ignored = r6
            return
    }

    public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$000() {
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.ToStringMethod.STRING_BUILDER_CONSTRUCTOR
            return r0
    }

    public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$100() {
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.ToStringMethod.TO_STRING
            return r0
    }

    public static net.bytebuddy.implementation.ToStringMethod prefixedBy(java.lang.String r1) {
            if (r1 == 0) goto Lc
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver$ForFixedValue r0 = new net.bytebuddy.implementation.ToStringMethod$PrefixResolver$ForFixedValue
            r0.<init>(r1)
            net.bytebuddy.implementation.ToStringMethod r1 = prefixedBy(r0)
            return r1
        Lc:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Prefix cannot be null"
            r1.<init>(r0)
            throw r1
    }

    public static net.bytebuddy.implementation.ToStringMethod prefixedBy(net.bytebuddy.implementation.ToStringMethod.PrefixResolver r1) {
            net.bytebuddy.implementation.ToStringMethod r0 = new net.bytebuddy.implementation.ToStringMethod
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.ToStringMethod prefixedByCanonicalClassName() {
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default r0 = net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.CANONICAL_CLASS_NAME
            net.bytebuddy.implementation.ToStringMethod r0 = prefixedBy(r0)
            return r0
    }

    public static net.bytebuddy.implementation.ToStringMethod prefixedByFullyQualifiedClassName() {
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default r0 = net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.FULLY_QUALIFIED_CLASS_NAME
            net.bytebuddy.implementation.ToStringMethod r0 = prefixedBy(r0)
            return r0
    }

    public static net.bytebuddy.implementation.ToStringMethod prefixedBySimpleClassName() {
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver$Default r0 = net.bytebuddy.implementation.ToStringMethod.PrefixResolver.Default.SIMPLE_CLASS_NAME
            net.bytebuddy.implementation.ToStringMethod r0 = prefixedBy(r0)
            return r0
    }

    @Override // net.bytebuddy.implementation.Implementation
    public net.bytebuddy.implementation.ToStringMethod.Appender appender(net.bytebuddy.implementation.Implementation.Target r10) {
            r9 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r10.getInstrumentedType()
            boolean r0 = r0.isInterface()
            if (r0 != 0) goto L47
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver r0 = r9.prefixResolver
            net.bytebuddy.description.type.TypeDescription r1 = r10.getInstrumentedType()
            java.lang.String r3 = r0.resolve(r1)
            if (r3 == 0) goto L3f
            net.bytebuddy.implementation.ToStringMethod$Appender r0 = new net.bytebuddy.implementation.ToStringMethod$Appender
            java.lang.String r4 = r9.start
            java.lang.String r5 = r9.end
            java.lang.String r6 = r9.separator
            java.lang.String r7 = r9.definer
            net.bytebuddy.description.type.TypeDescription r10 = r10.getInstrumentedType()
            net.bytebuddy.description.field.FieldList r10 = r10.getDeclaredFields()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isStatic()
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r9.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.or(r2)
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.not(r1)
            net.bytebuddy.matcher.FilterableList r8 = r10.filter(r1)
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r0
        L3f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Prefix for toString method cannot be null"
            r10.<init>(r0)
            throw r10
        L47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot implement meaningful toString method for "
            r1.append(r2)
            net.bytebuddy.description.type.TypeDescription r10 = r10.getInstrumentedType()
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
    }

    @Override // net.bytebuddy.implementation.Implementation
    public /* bridge */ /* synthetic */ net.bytebuddy.implementation.bytecode.ByteCodeAppender appender(net.bytebuddy.implementation.Implementation.Target r1) {
            r0 = this;
            net.bytebuddy.implementation.ToStringMethod$Appender r1 = r0.appender(r1)
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
            java.lang.String r2 = r4.start
            net.bytebuddy.implementation.ToStringMethod r5 = (net.bytebuddy.implementation.ToStringMethod) r5
            java.lang.String r3 = r5.start
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L20
            return r1
        L20:
            java.lang.String r2 = r4.end
            java.lang.String r3 = r5.end
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2b
            return r1
        L2b:
            java.lang.String r2 = r4.separator
            java.lang.String r3 = r5.separator
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L36
            return r1
        L36:
            java.lang.String r2 = r4.definer
            java.lang.String r3 = r5.definer
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L41
            return r1
        L41:
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver r2 = r4.prefixResolver
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver r3 = r5.prefixResolver
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4c
            return r1
        L4c:
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r2 = r4.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r5 = r5.ignored
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
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver r1 = r2.prefixResolver
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.start
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.end
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.separator
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r2.definer
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r1 = r2.ignored
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // net.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public net.bytebuddy.dynamic.scaffold.InstrumentedType prepare(net.bytebuddy.dynamic.scaffold.InstrumentedType r1) {
            r0 = this;
            return r1
    }

    public net.bytebuddy.implementation.ToStringMethod withIgnoredFields(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription.InDefinedShape> r9) {
            r8 = this;
            net.bytebuddy.implementation.ToStringMethod r7 = new net.bytebuddy.implementation.ToStringMethod
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver r1 = r8.prefixResolver
            java.lang.String r2 = r8.start
            java.lang.String r3 = r8.end
            java.lang.String r4 = r8.separator
            java.lang.String r5 = r8.definer
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r0 = r8.ignored
            net.bytebuddy.matcher.ElementMatcher$Junction r6 = r0.or(r9)
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public net.bytebuddy.implementation.Implementation withTokens(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            if (r9 == 0) goto L17
            if (r10 == 0) goto L17
            if (r11 == 0) goto L17
            if (r12 == 0) goto L17
            net.bytebuddy.implementation.ToStringMethod r7 = new net.bytebuddy.implementation.ToStringMethod
            net.bytebuddy.implementation.ToStringMethod$PrefixResolver r1 = r8.prefixResolver
            net.bytebuddy.matcher.ElementMatcher$Junction<? super net.bytebuddy.description.field.FieldDescription$InDefinedShape> r6 = r8.ignored
            r0 = r7
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
        L17:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Token values cannot be null"
            r9.<init>(r10)
            throw r9
    }
}
