package net.bytebuddy.asm;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class MemberSubstitution implements net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper {
    protected static final int THIS_REFERENCE = 0;
    private final boolean failIfNoMatch;
    private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;
    private final net.bytebuddy.asm.MemberSubstitution.Replacement.Factory replacementFactory;
    private final boolean strict;
    private final net.bytebuddy.asm.MemberSubstitution.TypePoolResolver typePoolResolver;

    /* JADX INFO: renamed from: net.bytebuddy.asm.MemberSubstitution$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$asm$MemberSubstitution$Replacement$InvocationType = null;

        static {
                net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType[] r0 = net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.bytebuddy.asm.MemberSubstitution.AnonymousClass1.$SwitchMap$net$bytebuddy$asm$MemberSubstitution$Replacement$InvocationType = r0
                net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r1 = net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.VIRTUAL     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = net.bytebuddy.asm.MemberSubstitution.AnonymousClass1.$SwitchMap$net$bytebuddy$asm$MemberSubstitution$Replacement$InvocationType     // Catch: java.lang.NoSuchFieldError -> L1d
                net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r1 = net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.SUPER     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface AllArguments {
        boolean includeSelf() default false;

        boolean nullIfEmpty() default false;

        net.bytebuddy.asm.MemberSubstitution.Source source() default net.bytebuddy.asm.MemberSubstitution.Source.SUBSTITUTED_ELEMENT;

        net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing() default net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Argument {
        boolean optional() default false;

        net.bytebuddy.asm.MemberSubstitution.Source source() default net.bytebuddy.asm.MemberSubstitution.Source.SUBSTITUTED_ELEMENT;

        net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing() default net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC;

        int value();
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Current {
        net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing() default net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC;
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface FieldGetterHandle {
        java.lang.Class<?> declaringType() default void.class;

        java.lang.String value() default "";
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface FieldSetterHandle {
        java.lang.Class<?> declaringType() default void.class;

        java.lang.String value() default "";
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface FieldValue {
        java.lang.Class<?> declaringType() default void.class;

        net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing() default net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC;

        java.lang.String value() default "";
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Origin {
        net.bytebuddy.asm.MemberSubstitution.Source source() default net.bytebuddy.asm.MemberSubstitution.Source.SUBSTITUTED_ELEMENT;
    }

    public interface Replacement {

        public interface Binding {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Resolved implements net.bytebuddy.asm.MemberSubstitution.Replacement.Binding {
                private final net.bytebuddy.description.ByteCodeElement.Member original;
                private final net.bytebuddy.description.type.TypeDescription receiver;
                private final net.bytebuddy.asm.MemberSubstitution.Substitution substitution;

                public Resolved(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.asm.MemberSubstitution.Substitution r3) {
                        r0 = this;
                        r0.<init>()
                        r0.receiver = r1
                        r0.original = r2
                        r0.substitution = r3
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
                        net.bytebuddy.description.type.TypeDescription r2 = r4.receiver
                        net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Resolved) r5
                        net.bytebuddy.description.type.TypeDescription r3 = r5.receiver
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.description.ByteCodeElement$Member r2 = r4.original
                        net.bytebuddy.description.ByteCodeElement$Member r3 = r5.original
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        net.bytebuddy.asm.MemberSubstitution$Substitution r2 = r4.substitution
                        net.bytebuddy.asm.MemberSubstitution$Substitution r5 = r5.substitution
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
                        net.bytebuddy.description.type.TypeDescription r1 = r2.receiver
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.description.ByteCodeElement$Member r1 = r2.original
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.asm.MemberSubstitution$Substitution r1 = r2.substitution
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Binding
                public boolean isBound() {
                        r1 = this;
                        r0 = 1
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Binding
                public net.bytebuddy.implementation.bytecode.StackManipulation make(net.bytebuddy.description.type.TypeList.Generic r9, net.bytebuddy.description.type.TypeDescription.Generic r10, net.bytebuddy.utility.JavaConstant.MethodHandle r11, net.bytebuddy.implementation.bytecode.StackManipulation r12, int r13) {
                        r8 = this;
                        net.bytebuddy.asm.MemberSubstitution$Substitution r0 = r8.substitution
                        net.bytebuddy.description.type.TypeDescription r1 = r8.receiver
                        net.bytebuddy.description.ByteCodeElement$Member r2 = r8.original
                        r3 = r9
                        r4 = r10
                        r5 = r11
                        r6 = r12
                        r7 = r13
                        net.bytebuddy.implementation.bytecode.StackManipulation r9 = r0.resolve(r1, r2, r3, r4, r5, r6, r7)
                        return r9
                }
            }

            public enum Unresolved extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved> implements net.bytebuddy.asm.MemberSubstitution.Replacement.Binding {
                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved[] $VALUES = null;
                public static final net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved INSTANCE = null;

                static {
                        net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved r0 = new net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved.INSTANCE = r0
                        net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved[] r0 = new net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved[]{r0}
                        net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved.$VALUES = r0
                        return
                }

                Unresolved(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved> r0 = net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved r1 = (net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved) r1
                        return r1
                }

                public static net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved[] values() {
                        net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved[] r0 = net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved[] r0 = (net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved[]) r0
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Binding
                public boolean isBound() {
                        r1 = this;
                        r0 = 0
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Binding
                public net.bytebuddy.implementation.bytecode.StackManipulation make(net.bytebuddy.description.type.TypeList.Generic r1, net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.utility.JavaConstant.MethodHandle r3, net.bytebuddy.implementation.bytecode.StackManipulation r4, int r5) {
                        r0 = this;
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "Cannot resolve unresolved binding"
                        r1.<init>(r2)
                        throw r1
                }
            }

            boolean isBound();

            net.bytebuddy.implementation.bytecode.StackManipulation make(net.bytebuddy.description.type.TypeList.Generic r1, net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.utility.JavaConstant.MethodHandle r3, net.bytebuddy.implementation.bytecode.StackManipulation r4, int r5);
        }

        public interface Factory {

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Compound implements net.bytebuddy.asm.MemberSubstitution.Replacement.Factory {
                private final java.util.List<net.bytebuddy.asm.MemberSubstitution.Replacement.Factory> factories;

                public Compound(java.util.List<? extends net.bytebuddy.asm.MemberSubstitution.Replacement.Factory> r3) {
                        r2 = this;
                        r2.<init>()
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        r2.factories = r0
                        java.util.Iterator r3 = r3.iterator()
                    Le:
                        boolean r0 = r3.hasNext()
                        if (r0 == 0) goto L32
                        java.lang.Object r0 = r3.next()
                        net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r0 = (net.bytebuddy.asm.MemberSubstitution.Replacement.Factory) r0
                        boolean r1 = r0 instanceof net.bytebuddy.asm.MemberSubstitution.Replacement.Factory.Compound
                        if (r1 == 0) goto L28
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Replacement$Factory> r1 = r2.factories
                        net.bytebuddy.asm.MemberSubstitution$Replacement$Factory$Compound r0 = (net.bytebuddy.asm.MemberSubstitution.Replacement.Factory.Compound) r0
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Replacement$Factory> r0 = r0.factories
                        r1.addAll(r0)
                        goto Le
                    L28:
                        boolean r1 = r0 instanceof net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp
                        if (r1 != 0) goto Le
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Replacement$Factory> r1 = r2.factories
                        r1.add(r0)
                        goto Le
                    L32:
                        return
                }

                public Compound(net.bytebuddy.asm.MemberSubstitution.Replacement.Factory... r1) {
                        r0 = this;
                        java.util.List r1 = java.util.Arrays.asList(r1)
                        r0.<init>(r1)
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
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Replacement$Factory> r2 = r4.factories
                        net.bytebuddy.asm.MemberSubstitution$Replacement$Factory$Compound r5 = (net.bytebuddy.asm.MemberSubstitution.Replacement.Factory.Compound) r5
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Replacement$Factory> r5 = r5.factories
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
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Replacement$Factory> r1 = r2.factories
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Factory
                public net.bytebuddy.asm.MemberSubstitution.Replacement make(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.method.MethodDescription r5, net.bytebuddy.pool.TypePool r6) {
                        r3 = this;
                        java.util.ArrayList r0 = new java.util.ArrayList
                        r0.<init>()
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Replacement$Factory> r1 = r3.factories
                        java.util.Iterator r1 = r1.iterator()
                    Lb:
                        boolean r2 = r1.hasNext()
                        if (r2 == 0) goto L1f
                        java.lang.Object r2 = r1.next()
                        net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r2 = (net.bytebuddy.asm.MemberSubstitution.Replacement.Factory) r2
                        net.bytebuddy.asm.MemberSubstitution$Replacement r2 = r2.make(r4, r5, r6)
                        r0.add(r2)
                        goto Lb
                    L1f:
                        net.bytebuddy.asm.MemberSubstitution$Replacement$ForFirstBinding r4 = new net.bytebuddy.asm.MemberSubstitution$Replacement$ForFirstBinding
                        r4.<init>(r0)
                        return r4
                }
            }

            net.bytebuddy.asm.MemberSubstitution.Replacement make(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.pool.TypePool r3);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForElementMatchers implements net.bytebuddy.asm.MemberSubstitution.Replacement {
            private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> fieldMatcher;
            private final boolean includeSuperCalls;
            private final boolean includeVirtualCalls;
            private final boolean matchFieldRead;
            private final boolean matchFieldWrite;
            private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> methodMatcher;
            private final net.bytebuddy.asm.MemberSubstitution.Substitution substitution;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.asm.MemberSubstitution.Replacement.Factory {
                private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> fieldMatcher;
                private final boolean includeSuperCalls;
                private final boolean includeVirtualCalls;
                private final boolean matchFieldRead;
                private final boolean matchFieldWrite;
                private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> methodMatcher;
                private final net.bytebuddy.asm.MemberSubstitution.Substitution.Factory substitutionFactory;

                public Factory(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2, boolean r3, boolean r4, boolean r5, boolean r6, net.bytebuddy.asm.MemberSubstitution.Substitution.Factory r7) {
                        r0 = this;
                        r0.<init>()
                        r0.fieldMatcher = r1
                        r0.methodMatcher = r2
                        r0.matchFieldRead = r3
                        r0.matchFieldWrite = r4
                        r0.includeVirtualCalls = r5
                        r0.includeSuperCalls = r6
                        r0.substitutionFactory = r7
                        return
                }

                public static net.bytebuddy.asm.MemberSubstitution.Replacement.Factory of(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.ByteCodeElement.Member> r9, net.bytebuddy.asm.MemberSubstitution.Substitution.Factory r10) {
                        net.bytebuddy.asm.MemberSubstitution$Replacement$ForElementMatchers$Factory r8 = new net.bytebuddy.asm.MemberSubstitution$Replacement$ForElementMatchers$Factory
                        r5 = 1
                        r6 = 1
                        r3 = 1
                        r4 = 1
                        r0 = r8
                        r1 = r9
                        r2 = r9
                        r7 = r10
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                        return r8
                }

                public static net.bytebuddy.asm.MemberSubstitution.Replacement.Factory ofField(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r9, boolean r10, boolean r11, net.bytebuddy.asm.MemberSubstitution.Substitution.Factory r12) {
                        net.bytebuddy.asm.MemberSubstitution$Replacement$ForElementMatchers$Factory r8 = new net.bytebuddy.asm.MemberSubstitution$Replacement$ForElementMatchers$Factory
                        net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.none()
                        r5 = 0
                        r6 = 0
                        r0 = r8
                        r1 = r9
                        r3 = r10
                        r4 = r11
                        r7 = r12
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                        return r8
                }

                public static net.bytebuddy.asm.MemberSubstitution.Replacement.Factory ofMethod(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r9, boolean r10, boolean r11, net.bytebuddy.asm.MemberSubstitution.Substitution.Factory r12) {
                        net.bytebuddy.asm.MemberSubstitution$Replacement$ForElementMatchers$Factory r8 = new net.bytebuddy.asm.MemberSubstitution$Replacement$ForElementMatchers$Factory
                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.none()
                        r3 = 0
                        r4 = 0
                        r0 = r8
                        r2 = r9
                        r5 = r10
                        r6 = r11
                        r7 = r12
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                        return r8
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
                        boolean r2 = r4.matchFieldRead
                        net.bytebuddy.asm.MemberSubstitution$Replacement$ForElementMatchers$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Replacement.ForElementMatchers.Factory) r5
                        boolean r3 = r5.matchFieldRead
                        if (r2 == r3) goto L1c
                        return r1
                    L1c:
                        boolean r2 = r4.matchFieldWrite
                        boolean r3 = r5.matchFieldWrite
                        if (r2 == r3) goto L23
                        return r1
                    L23:
                        boolean r2 = r4.includeVirtualCalls
                        boolean r3 = r5.includeVirtualCalls
                        if (r2 == r3) goto L2a
                        return r1
                    L2a:
                        boolean r2 = r4.includeSuperCalls
                        boolean r3 = r5.includeSuperCalls
                        if (r2 == r3) goto L31
                        return r1
                    L31:
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.fieldMatcher
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r3 = r5.fieldMatcher
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L3c
                        return r1
                    L3c:
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.methodMatcher
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.methodMatcher
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L47
                        return r1
                    L47:
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Factory r2 = r4.substitutionFactory
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Factory r5 = r5.substitutionFactory
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L52
                        return r1
                    L52:
                        return r0
                }

                public int hashCode() {
                        r2 = this;
                        java.lang.Class r0 = r2.getClass()
                        int r0 = r0.hashCode()
                        int r0 = r0 * 31
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r2.fieldMatcher
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.methodMatcher
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        boolean r1 = r2.matchFieldRead
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        boolean r1 = r2.matchFieldWrite
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        boolean r1 = r2.includeVirtualCalls
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        boolean r1 = r2.includeSuperCalls
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Factory r1 = r2.substitutionFactory
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Factory
                public net.bytebuddy.asm.MemberSubstitution.Replacement make(net.bytebuddy.description.type.TypeDescription r10, net.bytebuddy.description.method.MethodDescription r11, net.bytebuddy.pool.TypePool r12) {
                        r9 = this;
                        net.bytebuddy.asm.MemberSubstitution$Replacement$ForElementMatchers r8 = new net.bytebuddy.asm.MemberSubstitution$Replacement$ForElementMatchers
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r9.fieldMatcher
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r9.methodMatcher
                        boolean r3 = r9.matchFieldRead
                        boolean r4 = r9.matchFieldWrite
                        boolean r5 = r9.includeVirtualCalls
                        boolean r6 = r9.includeSuperCalls
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Factory r0 = r9.substitutionFactory
                        net.bytebuddy.asm.MemberSubstitution$Substitution r7 = r0.make(r10, r11, r12)
                        r0 = r8
                        r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                        return r8
                }
            }

            public ForElementMatchers(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2, boolean r3, boolean r4, boolean r5, boolean r6, net.bytebuddy.asm.MemberSubstitution.Substitution r7) {
                    r0 = this;
                    r0.<init>()
                    r0.fieldMatcher = r1
                    r0.methodMatcher = r2
                    r0.matchFieldRead = r3
                    r0.matchFieldWrite = r4
                    r0.includeVirtualCalls = r5
                    r0.includeSuperCalls = r6
                    r0.substitution = r7
                    return
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public net.bytebuddy.asm.MemberSubstitution.Replacement.Binding bind(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.field.FieldDescription r4, boolean r5) {
                    r0 = this;
                    if (r5 == 0) goto L7
                    boolean r1 = r0.matchFieldWrite
                    if (r1 == 0) goto L1b
                    goto Lb
                L7:
                    boolean r1 = r0.matchFieldRead
                    if (r1 == 0) goto L1b
                Lb:
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r0.fieldMatcher
                    boolean r1 = r1.matches(r4)
                    if (r1 == 0) goto L1b
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Resolved r1 = new net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Resolved
                    net.bytebuddy.asm.MemberSubstitution$Substitution r2 = r0.substitution
                    r1.<init>(r3, r4, r2)
                    goto L1d
                L1b:
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved r1 = net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved.INSTANCE
                L1d:
                    return r1
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public net.bytebuddy.asm.MemberSubstitution.Replacement.Binding bind(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType r5) {
                    r0 = this;
                    boolean r1 = r0.includeVirtualCalls
                    boolean r2 = r0.includeSuperCalls
                    boolean r1 = r5.matches(r1, r2)
                    if (r1 == 0) goto L1a
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r0.methodMatcher
                    boolean r1 = r1.matches(r4)
                    if (r1 == 0) goto L1a
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Resolved r1 = new net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Resolved
                    net.bytebuddy.asm.MemberSubstitution$Substitution r2 = r0.substitution
                    r1.<init>(r3, r4, r2)
                    goto L1c
                L1a:
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved r1 = net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved.INSTANCE
                L1c:
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
                    boolean r2 = r4.matchFieldRead
                    net.bytebuddy.asm.MemberSubstitution$Replacement$ForElementMatchers r5 = (net.bytebuddy.asm.MemberSubstitution.Replacement.ForElementMatchers) r5
                    boolean r3 = r5.matchFieldRead
                    if (r2 == r3) goto L1c
                    return r1
                L1c:
                    boolean r2 = r4.matchFieldWrite
                    boolean r3 = r5.matchFieldWrite
                    if (r2 == r3) goto L23
                    return r1
                L23:
                    boolean r2 = r4.includeVirtualCalls
                    boolean r3 = r5.includeVirtualCalls
                    if (r2 == r3) goto L2a
                    return r1
                L2a:
                    boolean r2 = r4.includeSuperCalls
                    boolean r3 = r5.includeSuperCalls
                    if (r2 == r3) goto L31
                    return r1
                L31:
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.fieldMatcher
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r3 = r5.fieldMatcher
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L3c
                    return r1
                L3c:
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.methodMatcher
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.methodMatcher
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L47
                    return r1
                L47:
                    net.bytebuddy.asm.MemberSubstitution$Substitution r2 = r4.substitution
                    net.bytebuddy.asm.MemberSubstitution$Substitution r5 = r5.substitution
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L52
                    return r1
                L52:
                    return r0
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r2.fieldMatcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.methodMatcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.matchFieldRead
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.matchFieldWrite
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.includeVirtualCalls
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.includeSuperCalls
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.asm.MemberSubstitution$Substitution r1 = r2.substitution
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForFirstBinding implements net.bytebuddy.asm.MemberSubstitution.Replacement {
            private final java.util.List<? extends net.bytebuddy.asm.MemberSubstitution.Replacement> replacements;

            public ForFirstBinding(java.util.List<? extends net.bytebuddy.asm.MemberSubstitution.Replacement> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.replacements = r1
                    return
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public net.bytebuddy.asm.MemberSubstitution.Replacement.Binding bind(net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.description.method.MethodDescription r10, net.bytebuddy.description.type.TypeDescription r11, net.bytebuddy.description.field.FieldDescription r12, boolean r13) {
                    r8 = this;
                    java.util.List<? extends net.bytebuddy.asm.MemberSubstitution$Replacement> r0 = r8.replacements
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L23
                    java.lang.Object r1 = r0.next()
                    r2 = r1
                    net.bytebuddy.asm.MemberSubstitution$Replacement r2 = (net.bytebuddy.asm.MemberSubstitution.Replacement) r2
                    r3 = r9
                    r4 = r10
                    r5 = r11
                    r6 = r12
                    r7 = r13
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Binding r1 = r2.bind(r3, r4, r5, r6, r7)
                    boolean r2 = r1.isBound()
                    if (r2 == 0) goto L6
                    return r1
                L23:
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved r9 = net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved.INSTANCE
                    return r9
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public net.bytebuddy.asm.MemberSubstitution.Replacement.Binding bind(net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.description.method.MethodDescription r10, net.bytebuddy.description.type.TypeDescription r11, net.bytebuddy.description.method.MethodDescription r12, net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType r13) {
                    r8 = this;
                    java.util.List<? extends net.bytebuddy.asm.MemberSubstitution$Replacement> r0 = r8.replacements
                    java.util.Iterator r0 = r0.iterator()
                L6:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L23
                    java.lang.Object r1 = r0.next()
                    r2 = r1
                    net.bytebuddy.asm.MemberSubstitution$Replacement r2 = (net.bytebuddy.asm.MemberSubstitution.Replacement) r2
                    r3 = r9
                    r4 = r10
                    r5 = r11
                    r6 = r12
                    r7 = r13
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Binding r1 = r2.bind(r3, r4, r5, r6, r7)
                    boolean r2 = r1.isBound()
                    if (r2 == 0) goto L6
                    return r1
                L23:
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved r9 = net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved.INSTANCE
                    return r9
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
                    java.util.List<? extends net.bytebuddy.asm.MemberSubstitution$Replacement> r2 = r4.replacements
                    net.bytebuddy.asm.MemberSubstitution$Replacement$ForFirstBinding r5 = (net.bytebuddy.asm.MemberSubstitution.Replacement.ForFirstBinding) r5
                    java.util.List<? extends net.bytebuddy.asm.MemberSubstitution$Replacement> r5 = r5.replacements
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
                    java.util.List<? extends net.bytebuddy.asm.MemberSubstitution$Replacement> r1 = r2.replacements
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        public enum InvocationType extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType> {
            private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType[] $VALUES = null;
            public static final net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType OTHER = null;
            public static final net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType SUPER = null;
            public static final net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType VIRTUAL = null;

            static {
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r0 = new net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType
                    java.lang.String r1 = "VIRTUAL"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.VIRTUAL = r0
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r1 = new net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType
                    java.lang.String r2 = "SUPER"
                    r3 = 1
                    r1.<init>(r2, r3)
                    net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.SUPER = r1
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r2 = new net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType
                    java.lang.String r3 = "OTHER"
                    r4 = 2
                    r2.<init>(r3, r4)
                    net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.OTHER = r2
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType[] r0 = new net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType[]{r0, r1, r2}
                    net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.$VALUES = r0
                    return
            }

            InvocationType(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType of(int r1, net.bytebuddy.description.method.MethodDescription r2) {
                    r0 = 182(0xb6, float:2.55E-43)
                    if (r1 == r0) goto L1b
                    r0 = 183(0xb7, float:2.56E-43)
                    if (r1 == r0) goto Lf
                    r2 = 185(0xb9, float:2.59E-43)
                    if (r1 == r2) goto L1b
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r1 = net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.OTHER
                    return r1
                Lf:
                    boolean r1 = r2.isVirtual()
                    if (r1 == 0) goto L18
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r1 = net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.SUPER
                    goto L1a
                L18:
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r1 = net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.OTHER
                L1a:
                    return r1
                L1b:
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r1 = net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.VIRTUAL
                    return r1
            }

            public static net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType> r0 = net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r1 = (net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType) r1
                    return r1
            }

            public static net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType[] values() {
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType[] r0 = net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType[] r0 = (net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType[]) r0
                    return r0
            }

            public boolean matches(boolean r3, boolean r4) {
                    r2 = this;
                    int[] r0 = net.bytebuddy.asm.MemberSubstitution.AnonymousClass1.$SwitchMap$net$bytebuddy$asm$MemberSubstitution$Replacement$InvocationType
                    int r1 = r2.ordinal()
                    r0 = r0[r1]
                    r1 = 1
                    if (r0 == r1) goto L10
                    r3 = 2
                    if (r0 == r3) goto Lf
                    return r1
                Lf:
                    return r4
                L10:
                    return r3
            }
        }

        public enum NoOp extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp> implements net.bytebuddy.asm.MemberSubstitution.Replacement, net.bytebuddy.asm.MemberSubstitution.Replacement.Factory {
            private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp[] $VALUES = null;
            public static final net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.asm.MemberSubstitution$Replacement$NoOp r0 = new net.bytebuddy.asm.MemberSubstitution$Replacement$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp.INSTANCE = r0
                    net.bytebuddy.asm.MemberSubstitution$Replacement$NoOp[] r0 = new net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp[]{r0}
                    net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Replacement$NoOp> r0 = net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.asm.MemberSubstitution$Replacement$NoOp r1 = (net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp[] values() {
                    net.bytebuddy.asm.MemberSubstitution$Replacement$NoOp[] r0 = net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.asm.MemberSubstitution$Replacement$NoOp[] r0 = (net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public net.bytebuddy.asm.MemberSubstitution.Replacement.Binding bind(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.field.FieldDescription r4, boolean r5) {
                    r0 = this;
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved r1 = net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved.INSTANCE
                    return r1
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement
            public net.bytebuddy.asm.MemberSubstitution.Replacement.Binding bind(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType r5) {
                    r0 = this;
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Binding$Unresolved r1 = net.bytebuddy.asm.MemberSubstitution.Replacement.Binding.Unresolved.INSTANCE
                    return r1
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Replacement.Factory
            public net.bytebuddy.asm.MemberSubstitution.Replacement make(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.pool.TypePool r3) {
                    r0 = this;
                    return r0
            }
        }

        net.bytebuddy.asm.MemberSubstitution.Replacement.Binding bind(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.field.FieldDescription r4, boolean r5);

        net.bytebuddy.asm.MemberSubstitution.Replacement.Binding bind(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType r5);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface SelfCallHandle {
        boolean bound() default true;

        net.bytebuddy.asm.MemberSubstitution.Source source() default net.bytebuddy.asm.MemberSubstitution.Source.SUBSTITUTED_ELEMENT;
    }

    public enum Source extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Source> {
        private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Source[] $VALUES = null;
        public static final net.bytebuddy.asm.MemberSubstitution.Source ENCLOSING_METHOD = null;
        public static final net.bytebuddy.asm.MemberSubstitution.Source SUBSTITUTED_ELEMENT = null;



        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Value {
            private final int offset;
            private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;

            public Value(net.bytebuddy.description.type.TypeDescription.Generic r1, int r2) {
                    r0 = this;
                    r0.<init>()
                    r0.typeDescription = r1
                    r0.offset = r2
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
                    int r2 = r4.offset
                    net.bytebuddy.asm.MemberSubstitution$Source$Value r5 = (net.bytebuddy.asm.MemberSubstitution.Source.Value) r5
                    int r3 = r5.offset
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

            public int getOffset() {
                    r1 = this;
                    int r0 = r1.offset
                    return r0
            }

            public net.bytebuddy.description.type.TypeDescription.Generic getTypeDescription() {
                    r1 = this;
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.typeDescription
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
                    int r1 = r2.offset
                    int r0 = r0 + r1
                    return r0
            }
        }

        static {
                net.bytebuddy.asm.MemberSubstitution$Source$1 r0 = new net.bytebuddy.asm.MemberSubstitution$Source$1
                java.lang.String r1 = "SUBSTITUTED_ELEMENT"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.asm.MemberSubstitution.Source.SUBSTITUTED_ELEMENT = r0
                net.bytebuddy.asm.MemberSubstitution$Source$2 r1 = new net.bytebuddy.asm.MemberSubstitution$Source$2
                java.lang.String r3 = "ENCLOSING_METHOD"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.asm.MemberSubstitution.Source.ENCLOSING_METHOD = r1
                r3 = 2
                net.bytebuddy.asm.MemberSubstitution$Source[] r3 = new net.bytebuddy.asm.MemberSubstitution.Source[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.asm.MemberSubstitution.Source.$VALUES = r3
                return
        }

        Source(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Source(java.lang.String r1, int r2, net.bytebuddy.asm.MemberSubstitution.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.asm.MemberSubstitution.Source valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Source> r0 = net.bytebuddy.asm.MemberSubstitution.Source.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.asm.MemberSubstitution$Source r1 = (net.bytebuddy.asm.MemberSubstitution.Source) r1
                return r1
        }

        public static net.bytebuddy.asm.MemberSubstitution.Source[] values() {
                net.bytebuddy.asm.MemberSubstitution$Source[] r0 = net.bytebuddy.asm.MemberSubstitution.Source.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.asm.MemberSubstitution$Source[] r0 = (net.bytebuddy.asm.MemberSubstitution.Source[]) r0
                return r0
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        public abstract net.bytebuddy.asm.MemberSubstitution.Source.Value argument(int r1, net.bytebuddy.description.type.TypeList.Generic r2, java.util.Map<java.lang.Integer, java.lang.Integer> r3, net.bytebuddy.description.ByteCodeElement.Member r4, net.bytebuddy.description.method.MethodDescription r5);

        public abstract java.util.List<net.bytebuddy.asm.MemberSubstitution.Source.Value> arguments(boolean r1, net.bytebuddy.description.type.TypeList.Generic r2, java.util.Map<java.lang.Integer, java.lang.Integer> r3, net.bytebuddy.description.ByteCodeElement.Member r4, net.bytebuddy.description.method.MethodDescription r5);

        public abstract net.bytebuddy.description.ByteCodeElement.Member element(net.bytebuddy.description.ByteCodeElement.Member r1, net.bytebuddy.description.method.MethodDescription r2);

        public abstract net.bytebuddy.utility.JavaConstant.MethodHandle handle(net.bytebuddy.utility.JavaConstant.MethodHandle r1, net.bytebuddy.description.method.MethodDescription r2);

        public abstract boolean isRepresentable(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.method.MethodDescription r3);

        public abstract net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.description.method.MethodDescription r5);

        @net.bytebuddy.utility.nullability.MaybeNull
        public abstract net.bytebuddy.asm.MemberSubstitution.Source.Value self(net.bytebuddy.description.type.TypeList.Generic r1, java.util.Map<java.lang.Integer, java.lang.Integer> r2, net.bytebuddy.description.ByteCodeElement.Member r3, net.bytebuddy.description.method.MethodDescription r4);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface StubValue {
        net.bytebuddy.asm.MemberSubstitution.Source source() default net.bytebuddy.asm.MemberSubstitution.Source.SUBSTITUTED_ELEMENT;
    }

    public static class SubstitutingMethodVisitor extends net.bytebuddy.utility.visitor.LocalVariableAwareMethodVisitor {
        private final boolean failIfNoMatch;
        private final net.bytebuddy.implementation.Implementation.Context implementationContext;
        private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
        private final net.bytebuddy.description.type.TypeDescription instrumentedType;
        private int localVariableExtension;
        private boolean matched;
        private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;
        private final net.bytebuddy.asm.MemberSubstitution.Replacement replacement;
        private int stackSizeBuffer;
        private final boolean strict;
        private final net.bytebuddy.pool.TypePool typePool;
        private final boolean virtualPrivateCalls;

        public class LocalVariableTracingMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
            final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.SubstitutingMethodVisitor this$0;

            private LocalVariableTracingMethodVisitor(net.bytebuddy.asm.MemberSubstitution.SubstitutingMethodVisitor r1, net.bytebuddy.jar.asm.MethodVisitor r2) {
                    r0 = this;
                    r0.this$0 = r1
                    int r1 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r0.<init>(r1, r2)
                    return
            }

            public /* synthetic */ LocalVariableTracingMethodVisitor(net.bytebuddy.asm.MemberSubstitution.SubstitutingMethodVisitor r1, net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.asm.MemberSubstitution.AnonymousClass1 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "No action required on default option.", value = {"SF_SWITCH_NO_DEFAULT"})
            public void visitVarInsn(int r4, int r5) {
                    r3 = this;
                    switch(r4) {
                        case 54: goto L14;
                        case 55: goto L4;
                        case 56: goto L14;
                        case 57: goto L4;
                        case 58: goto L14;
                        default: goto L3;
                    }
                L3:
                    goto L23
                L4:
                    net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor r0 = r3.this$0
                    int r1 = net.bytebuddy.asm.MemberSubstitution.SubstitutingMethodVisitor.access$700(r0)
                    int r2 = r5 + 2
                    int r1 = java.lang.Math.max(r1, r2)
                    net.bytebuddy.asm.MemberSubstitution.SubstitutingMethodVisitor.access$702(r0, r1)
                    goto L23
                L14:
                    net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor r0 = r3.this$0
                    int r1 = net.bytebuddy.asm.MemberSubstitution.SubstitutingMethodVisitor.access$700(r0)
                    int r2 = r5 + 1
                    int r1 = java.lang.Math.max(r1, r2)
                    net.bytebuddy.asm.MemberSubstitution.SubstitutingMethodVisitor.access$702(r0, r1)
                L23:
                    super.visitVarInsn(r4, r5)
                    return
            }
        }

        public SubstitutingMethodVisitor(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r4, boolean r5, boolean r6, net.bytebuddy.asm.MemberSubstitution.Replacement r7, net.bytebuddy.implementation.Implementation.Context r8, net.bytebuddy.pool.TypePool r9, boolean r10) {
                r0 = this;
                r0.<init>(r1, r3)
                r0.instrumentedType = r2
                r0.instrumentedMethod = r3
                r0.methodGraphCompiler = r4
                r0.strict = r5
                r0.failIfNoMatch = r6
                r0.replacement = r7
                r0.implementationContext = r8
                r0.typePool = r9
                r0.virtualPrivateCalls = r10
                r1 = 0
                r0.stackSizeBuffer = r1
                r0.localVariableExtension = r1
                return
        }

        public static /* synthetic */ int access$700(net.bytebuddy.asm.MemberSubstitution.SubstitutingMethodVisitor r0) {
                int r0 = r0.localVariableExtension
                return r0
        }

        public static /* synthetic */ int access$702(net.bytebuddy.asm.MemberSubstitution.SubstitutingMethodVisitor r0, int r1) {
                r0.localVariableExtension = r1
                return r1
        }

        @Override // net.bytebuddy.jar.asm.MethodVisitor
        public void visitFieldInsn(int r19, java.lang.String r20, java.lang.String r21, java.lang.String r22) {
                r18 = this;
                r0 = r18
                r1 = r19
                r2 = r20
                r3 = 1
                r4 = 0
                net.bytebuddy.pool.TypePool r5 = r0.typePool
                r6 = 47
                r7 = 46
                java.lang.String r8 = r2.replace(r6, r7)
                net.bytebuddy.pool.TypePool$Resolution r5 = r5.describe(r8)
                boolean r8 = r5.isResolved()
                java.lang.String r9 = " using "
                java.lang.String r10 = "Could not resolve "
                if (r8 == 0) goto L1c7
                net.bytebuddy.description.type.TypeDescription r8 = r5.resolve()
                java.util.Iterator r8 = r8.iterator()
            L28:
                java.lang.Object r11 = r8.next()
                net.bytebuddy.description.type.TypeDefinition r11 = (net.bytebuddy.description.type.TypeDefinition) r11
                net.bytebuddy.description.field.FieldList r11 = r11.getDeclaredFields()
                boolean r12 = r0.strict
                if (r12 == 0) goto L43
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = net.bytebuddy.matcher.ElementMatchers.named(r21)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r22)
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = r12.and(r13)
                goto L53
            L43:
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = net.bytebuddy.matcher.ElementMatchers.named(r21)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r22)
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = r12.and(r13)
                net.bytebuddy.matcher.ElementMatcher$Junction r12 = net.bytebuddy.matcher.ElementMatchers.failSafe(r12)
            L53:
                net.bytebuddy.matcher.FilterableList r11 = r11.filter(r12)
                net.bytebuddy.description.field.FieldList r11 = (net.bytebuddy.description.field.FieldList) r11
                boolean r12 = r8.hasNext()
                if (r12 == 0) goto L65
                boolean r12 = r11.isEmpty()
                if (r12 != 0) goto L28
            L65:
                boolean r8 = r11.isEmpty()
                if (r8 != 0) goto L18e
                net.bytebuddy.asm.MemberSubstitution$Replacement r12 = r0.replacement
                net.bytebuddy.description.type.TypeDescription r13 = r0.instrumentedType
                net.bytebuddy.description.method.MethodDescription r14 = r0.instrumentedMethod
                net.bytebuddy.description.type.TypeDescription r15 = r5.resolve()
                java.lang.Object r5 = r11.getOnly()
                r16 = r5
                net.bytebuddy.description.field.FieldDescription r16 = (net.bytebuddy.description.field.FieldDescription) r16
                r5 = 181(0xb5, float:2.54E-43)
                if (r1 == r5) goto L89
                r5 = 179(0xb3, float:2.51E-43)
                if (r1 != r5) goto L86
                goto L89
            L86:
                r17 = r4
                goto L8b
            L89:
                r17 = r3
            L8b:
                net.bytebuddy.asm.MemberSubstitution$Replacement$Binding r5 = r12.bind(r13, r14, r15, r16, r17)
                boolean r6 = r5.isBound()
                if (r6 == 0) goto L192
                switch(r1) {
                    case 178: goto L113;
                    case 179: goto Lf9;
                    case 180: goto Ld8;
                    case 181: goto Laf;
                    default: goto L98;
                }
            L98:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Unexpected opcode: "
                r3.append(r4)
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1)
                throw r2
            Laf:
                net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                java.lang.Object r2 = r11.getOnly()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.description.type.TypeDefinition r2 = r2.getDeclaringType()
                java.lang.Object r6 = r11.getOnly()
                net.bytebuddy.description.field.FieldDescription r6 = (net.bytebuddy.description.field.FieldDescription) r6
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r6.getType()
                r7 = 2
                net.bytebuddy.description.type.TypeDefinition[] r7 = new net.bytebuddy.description.type.TypeDefinition[r7]
                r7[r4] = r2
                r7[r3] = r6
                r1.<init>(r7)
                java.lang.Class r2 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
            Ld5:
                r6 = r1
                r7 = r2
                goto L123
            Ld8:
                net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                java.lang.Object r2 = r11.getOnly()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.description.type.TypeDefinition r2 = r2.getDeclaringType()
                net.bytebuddy.description.type.TypeDefinition[] r6 = new net.bytebuddy.description.type.TypeDefinition[r3]
                r6[r4] = r2
                r1.<init>(r6)
                java.lang.Object r2 = r11.getOnly()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
            Lf5:
                r6 = r1
                r7 = r2
                r4 = r3
                goto L123
            Lf9:
                net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                java.lang.Object r2 = r11.getOnly()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                net.bytebuddy.description.type.TypeDefinition[] r6 = new net.bytebuddy.description.type.TypeDefinition[r3]
                r6[r4] = r2
                r1.<init>(r6)
                java.lang.Class r2 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r2)
                goto Ld5
            L113:
                net.bytebuddy.description.type.TypeList$Generic$Empty r1 = new net.bytebuddy.description.type.TypeList$Generic$Empty
                r1.<init>()
                java.lang.Object r2 = r11.getOnly()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                goto Lf5
            L123:
                int r1 = r0.stackSizeBuffer
                if (r4 == 0) goto L139
                java.lang.Object r2 = r11.getOnly()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
                net.bytebuddy.utility.JavaConstant$MethodHandle r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.ofGetter(r2)
            L137:
                r8 = r2
                goto L14a
            L139:
                java.lang.Object r2 = r11.getOnly()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r2 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r2
                net.bytebuddy.utility.JavaConstant$MethodHandle r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.ofSetter(r2)
                goto L137
            L14a:
                if (r4 == 0) goto L15c
                java.lang.Object r2 = r11.getOnly()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r2 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.read()
            L15a:
                r9 = r2
                goto L16b
            L15c:
                java.lang.Object r2 = r11.getOnly()
                net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r2 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r2)
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.write()
                goto L15a
            L16b:
                int r10 = r18.getFreeOffset()
                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r5.make(r6, r7, r8, r9, r10)
                net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor r4 = new net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor
                net.bytebuddy.jar.asm.MethodVisitor r5 = r0.mv
                r6 = 0
                r4.<init>(r0, r5, r6)
                net.bytebuddy.implementation.Implementation$Context r5 = r0.implementationContext
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r2.apply(r4, r5)
                int r2 = r2.getMaximalSize()
                int r1 = java.lang.Math.max(r1, r2)
                r0.stackSizeBuffer = r1
                r0.matched = r3
                return
            L18e:
                boolean r3 = r0.strict
                if (r3 != 0) goto L197
            L192:
                r4 = r21
                r5 = r22
                goto L1cf
            L197:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r10)
                java.lang.String r2 = r2.replace(r6, r7)
                r3.append(r2)
                java.lang.String r2 = "."
                r3.append(r2)
                r4 = r21
                r3.append(r4)
                r5 = r22
                r3.append(r5)
                r3.append(r9)
                net.bytebuddy.pool.TypePool r2 = r0.typePool
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
            L1c7:
                r4 = r21
                r5 = r22
                boolean r3 = r0.strict
                if (r3 != 0) goto L1d3
            L1cf:
                super.visitFieldInsn(r19, r20, r21, r22)
                return
            L1d3:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r10)
                java.lang.String r2 = r2.replace(r6, r7)
                r3.append(r2)
                r3.append(r9)
                net.bytebuddy.pool.TypePool r2 = r0.typePool
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
        }

        @Override // net.bytebuddy.jar.asm.MethodVisitor
        public void visitMaxs(int r2, int r3) {
                r1 = this;
                boolean r0 = r1.failIfNoMatch
                if (r0 == 0) goto L2c
                boolean r0 = r1.matched
                if (r0 == 0) goto L9
                goto L2c
            L9:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r0 = "No substitution found within "
                r3.append(r0)
                net.bytebuddy.description.method.MethodDescription r0 = r1.instrumentedMethod
                r3.append(r0)
                java.lang.String r0 = " of "
                r3.append(r0)
                net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                r3.append(r0)
                java.lang.String r3 = r3.toString()
                r2.<init>(r3)
                throw r2
            L2c:
                int r0 = r1.stackSizeBuffer
                int r2 = r2 + r0
                int r0 = r1.localVariableExtension
                int r3 = java.lang.Math.max(r0, r3)
                super.visitMaxs(r2, r3)
                return
        }

        @Override // net.bytebuddy.jar.asm.MethodVisitor
        public void visitMethodInsn(int r27, java.lang.String r28, java.lang.String r29, java.lang.String r30, boolean r31) {
                r26 = this;
                r0 = r26
                r1 = r27
                r2 = r28
                r3 = r29
                r4 = 1
                r5 = 2
                net.bytebuddy.pool.TypePool r6 = r0.typePool
                r7 = 47
                r8 = 46
                java.lang.String r9 = r2.replace(r7, r8)
                net.bytebuddy.pool.TypePool$Resolution r6 = r6.describe(r9)
                boolean r9 = r6.isResolved()
                java.lang.String r10 = " using "
                java.lang.String r11 = "Could not resolve "
                if (r9 == 0) goto L389
                r9 = 183(0xb7, float:2.56E-43)
                if (r1 != r9) goto L5f
                java.lang.String r12 = "<init>"
                boolean r12 = r3.equals(r12)
                if (r12 == 0) goto L5f
                net.bytebuddy.description.type.TypeDescription r12 = r6.resolve()
                net.bytebuddy.description.method.MethodList r12 = r12.getDeclaredMethods()
                boolean r13 = r0.strict
                if (r13 == 0) goto L47
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                goto L57
            L47:
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.failSafe(r13)
            L57:
                net.bytebuddy.matcher.FilterableList r12 = r12.filter(r13)
                net.bytebuddy.description.method.MethodList r12 = (net.bytebuddy.description.method.MethodList) r12
                goto L1b6
            L5f:
                r12 = 184(0xb8, float:2.58E-43)
                if (r1 != r12) goto Lab
                net.bytebuddy.description.type.TypeDescription r12 = r6.resolve()
                java.util.Iterator r12 = r12.iterator()
            L6b:
                java.lang.Object r13 = r12.next()
                net.bytebuddy.description.type.TypeDefinition r13 = (net.bytebuddy.description.type.TypeDefinition) r13
                net.bytebuddy.description.method.MethodList r13 = r13.getDeclaredMethods()
                boolean r14 = r0.strict
                if (r14 == 0) goto L86
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.named(r29)
                net.bytebuddy.matcher.ElementMatcher$Junction r15 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = r14.and(r15)
                goto L96
            L86:
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.named(r29)
                net.bytebuddy.matcher.ElementMatcher$Junction r15 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = r14.and(r15)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.failSafe(r14)
            L96:
                net.bytebuddy.matcher.FilterableList r13 = r13.filter(r14)
                net.bytebuddy.description.method.MethodList r13 = (net.bytebuddy.description.method.MethodList) r13
                boolean r14 = r12.hasNext()
                if (r14 == 0) goto La8
                boolean r14 = r13.isEmpty()
                if (r14 != 0) goto L6b
            La8:
                r12 = r13
                goto L1b6
            Lab:
                if (r1 != r9) goto Lde
                net.bytebuddy.description.type.TypeDescription r12 = r6.resolve()
                net.bytebuddy.description.method.MethodList r12 = r12.getDeclaredMethods()
                boolean r13 = r0.strict
                if (r13 == 0) goto Lc6
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.named(r29)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                goto Ld6
            Lc6:
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.named(r29)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.failSafe(r13)
            Ld6:
                net.bytebuddy.matcher.FilterableList r12 = r12.filter(r13)
                net.bytebuddy.description.method.MethodList r12 = (net.bytebuddy.description.method.MethodList) r12
                goto L1b6
            Lde:
                boolean r12 = r0.virtualPrivateCalls
                if (r12 == 0) goto L17b
                net.bytebuddy.description.type.TypeDescription r12 = r6.resolve()
                net.bytebuddy.description.method.MethodList r12 = r12.getDeclaredMethods()
                boolean r13 = r0.strict
                if (r13 == 0) goto L10f
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.isPrivate()
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.isStatic()
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.not(r14)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.named(r29)
                net.bytebuddy.matcher.ElementMatcher$Junction r15 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = r14.and(r15)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                goto L133
            L10f:
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.isPrivate()
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.isStatic()
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.not(r14)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.named(r29)
                net.bytebuddy.matcher.ElementMatcher$Junction r15 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = r14.and(r15)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.failSafe(r13)
            L133:
                net.bytebuddy.matcher.FilterableList r12 = r12.filter(r13)
                net.bytebuddy.description.method.MethodList r12 = (net.bytebuddy.description.method.MethodList) r12
                boolean r13 = r12.isEmpty()
                if (r13 == 0) goto L1b6
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r0.methodGraphCompiler
                net.bytebuddy.description.type.TypeDescription r13 = r6.resolve()
                net.bytebuddy.description.type.TypeDescription r14 = r0.instrumentedType
                net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r12 = r12.compile(r13, r14)
                net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r12 = r12.listNodes()
                net.bytebuddy.description.method.MethodList r12 = r12.asMethodList()
                boolean r13 = r0.strict
                if (r13 == 0) goto L164
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.named(r29)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                goto L174
            L164:
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.named(r29)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.failSafe(r13)
            L174:
                net.bytebuddy.matcher.FilterableList r12 = r12.filter(r13)
                net.bytebuddy.description.method.MethodList r12 = (net.bytebuddy.description.method.MethodList) r12
                goto L1b6
            L17b:
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r12 = r0.methodGraphCompiler
                net.bytebuddy.description.type.TypeDescription r13 = r6.resolve()
                net.bytebuddy.description.type.TypeDescription r14 = r0.instrumentedType
                net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r12 = r12.compile(r13, r14)
                net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r12 = r12.listNodes()
                net.bytebuddy.description.method.MethodList r12 = r12.asMethodList()
                boolean r13 = r0.strict
                if (r13 == 0) goto L1a0
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.named(r29)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                goto L1b0
            L1a0:
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.named(r29)
                net.bytebuddy.matcher.ElementMatcher$Junction r14 = net.bytebuddy.matcher.ElementMatchers.hasDescriptor(r30)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = r13.and(r14)
                net.bytebuddy.matcher.ElementMatcher$Junction r13 = net.bytebuddy.matcher.ElementMatchers.failSafe(r13)
            L1b0:
                net.bytebuddy.matcher.FilterableList r12 = r12.filter(r13)
                net.bytebuddy.description.method.MethodList r12 = (net.bytebuddy.description.method.MethodList) r12
            L1b6:
                boolean r13 = r12.isEmpty()
                if (r13 != 0) goto L354
                net.bytebuddy.asm.MemberSubstitution$Replacement r14 = r0.replacement
                net.bytebuddy.description.type.TypeDescription r15 = r0.instrumentedType
                net.bytebuddy.description.method.MethodDescription r7 = r0.instrumentedMethod
                net.bytebuddy.description.type.TypeDescription r17 = r6.resolve()
                java.lang.Object r8 = r12.getOnly()
                r18 = r8
                net.bytebuddy.description.method.MethodDescription r18 = (net.bytebuddy.description.method.MethodDescription) r18
                java.lang.Object r8 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r8 = (net.bytebuddy.description.method.MethodDescription) r8
                net.bytebuddy.asm.MemberSubstitution$Replacement$InvocationType r19 = net.bytebuddy.asm.MemberSubstitution.Replacement.InvocationType.of(r1, r8)
                r16 = r7
                net.bytebuddy.asm.MemberSubstitution$Replacement$Binding r20 = r14.bind(r15, r16, r17, r18, r19)
                boolean r7 = r20.isBound()
                if (r7 == 0) goto L358
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                boolean r2 = r2.isStatic()
                if (r2 != 0) goto L21b
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                boolean r2 = r2.isConstructor()
                if (r2 == 0) goto L1fd
                goto L21b
            L1fd:
                net.bytebuddy.description.type.TypeList$Generic$Explicit r2 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                net.bytebuddy.description.type.TypeDescription r3 = r6.resolve()
                java.lang.Object r7 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r7 = (net.bytebuddy.description.method.MethodDescription) r7
                net.bytebuddy.description.method.ParameterList r7 = r7.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r7 = r7.asTypeList()
                java.util.List r3 = net.bytebuddy.utility.CompoundList.of(r3, r7)
                r2.<init>(r3)
            L218:
                r21 = r2
                goto L22a
            L21b:
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.description.method.ParameterList r2 = r2.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                goto L218
            L22a:
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                boolean r2 = r2.isConstructor()
                if (r2 == 0) goto L247
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.description.type.TypeDefinition r2 = r2.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
            L244:
                r22 = r2
                goto L252
            L247:
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getReturnType()
                goto L244
            L252:
                if (r1 != r9) goto L283
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                boolean r2 = r2.isMethod()
                if (r2 == 0) goto L283
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                boolean r2 = r2.isPrivate()
                if (r2 != 0) goto L283
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                net.bytebuddy.description.type.TypeDescription r3 = r6.resolve()
                net.bytebuddy.utility.JavaConstant$MethodHandle r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.ofSpecial(r2, r3)
            L280:
                r23 = r2
                goto L294
            L283:
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                net.bytebuddy.description.ByteCodeElement$TypeDependant r2 = r2.asDefined()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r2
                net.bytebuddy.utility.JavaConstant$MethodHandle r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.of(r2)
                goto L280
            L294:
                if (r1 != r9) goto L2c3
                java.lang.Object r1 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                boolean r1 = r1.isMethod()
                if (r1 == 0) goto L2c3
                java.lang.Object r1 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                boolean r1 = r1.isPrivate()
                if (r1 != 0) goto L2c3
                java.lang.Object r1 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                net.bytebuddy.description.type.TypeDescription r2 = r6.resolve()
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.special(r2)
            L2c0:
                r24 = r1
                goto L2ce
            L2c3:
                java.lang.Object r1 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                goto L2c0
            L2ce:
                int r25 = r26.getFreeOffset()
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r20.make(r21, r22, r23, r24, r25)
                net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor r2 = new net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor$LocalVariableTracingMethodVisitor
                net.bytebuddy.jar.asm.MethodVisitor r3 = r0.mv
                r6 = 0
                r2.<init>(r0, r3, r6)
                net.bytebuddy.implementation.Implementation$Context r3 = r0.implementationContext
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r1 = r1.apply(r2, r3)
                java.lang.Object r2 = r12.getOnly()
                net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                boolean r2 = r2.isConstructor()
                if (r2 == 0) goto L345
                int r2 = r0.stackSizeBuffer
                int r1 = r1.getMaximalSize()
                int r1 = r1 + r5
                int r1 = java.lang.Math.max(r2, r1)
                r0.stackSizeBuffer = r1
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.Duplication r3 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
                net.bytebuddy.implementation.bytecode.StackManipulation r7 = r3.flipOver(r7)
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.flipOver(r6)
                r6 = 6
                net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                r8 = 0
                r6[r8] = r7
                net.bytebuddy.implementation.bytecode.Removal r7 = net.bytebuddy.implementation.bytecode.Removal.SINGLE
                r6[r4] = r7
                r6[r5] = r7
                r5 = 3
                r6[r5] = r3
                r3 = 4
                r6[r3] = r7
                r3 = 5
                r6[r3] = r7
                r2.<init>(r6)
                net.bytebuddy.jar.asm.MethodVisitor r3 = r0.mv
                net.bytebuddy.implementation.Implementation$Context r5 = r0.implementationContext
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r2.apply(r3, r5)
                int r2 = r2.getMaximalSize()
                net.bytebuddy.implementation.bytecode.StackSize r3 = net.bytebuddy.implementation.bytecode.StackSize.SINGLE
                int r3 = r3.getSize()
                int r2 = r2 + r3
                int r1 = java.lang.Math.max(r1, r2)
                r0.stackSizeBuffer = r1
                goto L351
            L345:
                int r2 = r0.stackSizeBuffer
                int r1 = r1.getMaximalSize()
                int r1 = java.lang.Math.max(r2, r1)
                r0.stackSizeBuffer = r1
            L351:
                r0.matched = r4
                return
            L354:
                boolean r4 = r0.strict
                if (r4 != 0) goto L35b
            L358:
                r5 = r30
                goto L38f
            L35b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r11)
                java.lang.String r2 = r2.replace(r7, r8)
                r4.append(r2)
                java.lang.String r2 = "."
                r4.append(r2)
                r4.append(r3)
                r5 = r30
                r4.append(r5)
                r4.append(r10)
                net.bytebuddy.pool.TypePool r2 = r0.typePool
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                r1.<init>(r2)
                throw r1
            L389:
                r5 = r30
                boolean r4 = r0.strict
                if (r4 != 0) goto L393
            L38f:
                super.visitMethodInsn(r27, r28, r29, r30, r31)
                return
            L393:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                java.lang.String r2 = r2.replace(r7, r8)
                r3.append(r2)
                r3.append(r10)
                net.bytebuddy.pool.TypePool r2 = r0.typePool
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                r1.<init>(r2)
                throw r1
        }
    }

    public interface Substitution {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Chain implements net.bytebuddy.asm.MemberSubstitution.Substitution {
            private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
            private final java.util.List<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step> steps;
            private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class Factory implements net.bytebuddy.asm.MemberSubstitution.Substitution.Factory {
                private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
                private final java.util.List<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory> steps;
                private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                public Factory(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, java.util.List<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory> r3) {
                        r0 = this;
                        r0.<init>()
                        r0.assigner = r1
                        r0.typing = r2
                        r0.steps = r3
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
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Factory) r5
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                        net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r5.assigner
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory> r2 = r4.steps
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory> r5 = r5.steps
                        boolean r5 = r2.equals(r5)
                        if (r5 != 0) goto L36
                        return r1
                    L36:
                        return r0
                }

                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Factory executing(java.util.List<? extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory> r5) {
                        r4 = this;
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Factory
                        net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r4.assigner
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory> r3 = r4.steps
                        java.util.List r5 = net.bytebuddy.utility.CompoundList.of(r3, r5)
                        r0.<init>(r1, r2, r5)
                        return r0
                }

                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Factory executing(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory... r1) {
                        r0 = this;
                        java.util.List r1 = java.util.Arrays.asList(r1)
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Factory r1 = r0.executing(r1)
                        return r1
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
                        int r0 = r0 * 31
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory> r1 = r2.steps
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public net.bytebuddy.asm.MemberSubstitution.Substitution make(net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.method.MethodDescription r6, net.bytebuddy.pool.TypePool r7) {
                        r4 = this;
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory> r7 = r4.steps
                        boolean r7 = r7.isEmpty()
                        if (r7 == 0) goto Lb
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Stubbing r5 = net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing.INSTANCE
                        return r5
                    Lb:
                        java.util.ArrayList r7 = new java.util.ArrayList
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory> r0 = r4.steps
                        int r0 = r0.size()
                        r7.<init>(r0)
                        java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory> r0 = r4.steps
                        java.util.Iterator r0 = r0.iterator()
                    L1c:
                        boolean r1 = r0.hasNext()
                        if (r1 == 0) goto L34
                        java.lang.Object r1 = r0.next()
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory) r1
                        net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r4.typing
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step r1 = r1.make(r2, r3, r5, r6)
                        r7.add(r1)
                        goto L1c
                    L34:
                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain r5 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain
                        net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r4.assigner
                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = r4.typing
                        r5.<init>(r6, r0, r7)
                        return r5
                }
            }

            public interface Step {

                public interface Factory {
                    net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step make(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4);
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForArgumentLoading implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory {
                    private final int index;

                    public ForArgumentLoading(int r1) {
                            r0 = this;
                            r0.<init>()
                            r0.index = r1
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
                            int r2 = r4.index
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForArgumentLoading r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForArgumentLoading) r5
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

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step make(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                            r0 = this;
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, net.bytebuddy.description.type.TypeDescription.Generic r7, java.util.Map<java.lang.Integer, java.lang.Integer> r8, int r9) {
                            r0 = this;
                            int r1 = r0.index
                            int r4 = r3.size()
                            if (r1 >= r4) goto L48
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.Removal.of(r7)
                            int r5 = r0.index
                            java.lang.Object r5 = r3.get(r5)
                            net.bytebuddy.description.type.TypeDefinition r5 = (net.bytebuddy.description.type.TypeDefinition) r5
                            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r5 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r5)
                            int r6 = r0.index
                            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                            java.lang.Object r6 = r8.get(r6)
                            java.lang.Integer r6 = (java.lang.Integer) r6
                            int r6 = r6.intValue()
                            net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.loadFrom(r6)
                            r6 = 2
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                            r7 = 0
                            r6[r7] = r4
                            r4 = 1
                            r6[r4] = r5
                            r2.<init>(r6)
                            int r4 = r0.index
                            java.lang.Object r3 = r3.get(r4)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                            r1.<init>(r2, r3)
                            return r1
                        L48:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            r3.append(r2)
                            java.lang.String r2 = " has not "
                            r3.append(r2)
                            int r2 = r0.index
                            r3.append(r2)
                            java.lang.String r2 = " arguments"
                            r3.append(r2)
                            java.lang.String r2 = r3.toString()
                            r1.<init>(r2)
                            throw r1
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForArgumentSubstitution implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step {
                    private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
                    private final int index;
                    private final net.bytebuddy.implementation.bytecode.StackManipulation substitution;
                    private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;
                    private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Factory implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory {
                        private final int index;
                        private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
                        private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;

                        public Factory(net.bytebuddy.implementation.bytecode.StackManipulation r1, java.lang.reflect.Type r2, int r3) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                                r0.<init>(r1, r2, r3)
                                return
                        }

                        public Factory(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription.Generic r2, int r3) {
                                r0 = this;
                                r0.<init>()
                                r0.stackManipulation = r1
                                r0.typeDescription = r2
                                r0.index = r3
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
                                int r2 = r4.index
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForArgumentSubstitution.Factory) r5
                                int r3 = r5.index
                                if (r2 == r3) goto L1c
                                return r1
                            L1c:
                                net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.stackManipulation
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L27
                                return r1
                            L27:
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.typeDescription
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
                                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                int r1 = r2.index
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step make(net.bytebuddy.implementation.bytecode.assign.Assigner r7, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r8, net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.description.method.MethodDescription r10) {
                                r6 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution r9 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution
                                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r6.stackManipulation
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = r6.typeDescription
                                int r3 = r6.index
                                r0 = r9
                                r4 = r7
                                r5 = r8
                                r0.<init>(r1, r2, r3, r4, r5)
                                return r9
                        }
                    }

                    public ForArgumentSubstitution(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription.Generic r2, int r3, net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5) {
                            r0 = this;
                            r0.<init>()
                            r0.substitution = r1
                            r0.typeDescription = r2
                            r0.index = r3
                            r0.assigner = r4
                            r0.typing = r5
                            return
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory of(java.lang.Object r2, int r3) {
                            if (r3 < 0) goto L18
                            net.bytebuddy.utility.ConstantValue r2 = net.bytebuddy.utility.ConstantValue.Simple.wrap(r2)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution$Factory
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.toStackManipulation()
                            net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeDescription()
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                            r0.<init>(r1, r2, r3)
                            return r0
                        L18:
                            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                            r0.<init>()
                            java.lang.String r1 = "Index cannot be negative: "
                            r0.append(r1)
                            r0.append(r3)
                            java.lang.String r3 = r0.toString()
                            r2.<init>(r3)
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
                            int r2 = r4.index
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForArgumentSubstitution r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForArgumentSubstitution) r5
                            int r3 = r5.index
                            if (r2 == r3) goto L1c
                            return r1
                        L1c:
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L27
                            return r1
                        L27:
                            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.substitution
                            net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.substitution
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L32
                            return r1
                        L32:
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.typeDescription
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L3d
                            return r1
                        L3d:
                            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L48
                            return r1
                        L48:
                            return r0
                    }

                    public int hashCode() {
                            r2 = this;
                            java.lang.Class r0 = r2.getClass()
                            int r0 = r0.hashCode()
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.substitution
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            int r1 = r2.index
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

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, net.bytebuddy.description.type.TypeDescription.Generic r7, java.util.Map<java.lang.Integer, java.lang.Integer> r8, int r9) {
                            r0 = this;
                            int r1 = r0.index
                            int r4 = r3.size()
                            if (r1 >= r4) goto L80
                            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r0.assigner
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r0.typeDescription
                            int r4 = r0.index
                            java.lang.Object r4 = r3.get(r4)
                            net.bytebuddy.description.type.TypeDescription$Generic r4 = (net.bytebuddy.description.type.TypeDescription.Generic) r4
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r5 = r0.typing
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.assign(r2, r4, r5)
                            boolean r2 = r1.isValid()
                            if (r2 == 0) goto L59
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r2 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            net.bytebuddy.implementation.bytecode.StackManipulation r5 = r0.substitution
                            int r6 = r0.index
                            java.lang.Object r3 = r3.get(r6)
                            net.bytebuddy.description.type.TypeDefinition r3 = (net.bytebuddy.description.type.TypeDefinition) r3
                            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r3)
                            int r6 = r0.index
                            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                            java.lang.Object r6 = r8.get(r6)
                            java.lang.Integer r6 = (java.lang.Integer) r6
                            int r6 = r6.intValue()
                            net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.storeAt(r6)
                            r6 = 3
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r6 = new net.bytebuddy.implementation.bytecode.StackManipulation[r6]
                            r8 = 0
                            r6[r8] = r5
                            r5 = 1
                            r6[r5] = r1
                            r1 = 2
                            r6[r1] = r3
                            r4.<init>(r6)
                            r2.<init>(r4, r7)
                            return r2
                        L59:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r4 = "Cannot assign "
                            r2.append(r4)
                            net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.typeDescription
                            r2.append(r4)
                            java.lang.String r4 = " to "
                            r2.append(r4)
                            int r4 = r0.index
                            java.lang.Object r3 = r3.get(r4)
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            r1.<init>(r2)
                            throw r1
                        L80:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            r3.append(r2)
                            java.lang.String r2 = " has not "
                            r3.append(r2)
                            int r2 = r0.index
                            r3.append(r2)
                            java.lang.String r2 = " arguments"
                            r3.append(r2)
                            java.lang.String r2 = r3.toString()
                            r1.<init>(r2)
                            throw r1
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForAssignment implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step {
                    private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;

                    @net.bytebuddy.utility.nullability.MaybeNull
                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                    private final net.bytebuddy.description.type.TypeDescription.Generic result;

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Factory implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory {

                        @net.bytebuddy.utility.nullability.MaybeNull
                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                        private final net.bytebuddy.description.type.TypeDescription.Generic result;

                        public Factory(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r1) {
                                r0 = this;
                                r0.<init>()
                                r0.result = r1
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
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.result
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForAssignment$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForAssignment.Factory) r5
                                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.result
                                if (r5 == 0) goto L24
                                if (r2 == 0) goto L26
                                boolean r5 = r2.equals(r5)
                                if (r5 != 0) goto L27
                                return r1
                            L24:
                                if (r2 == 0) goto L27
                            L26:
                                return r1
                            L27:
                                return r0
                        }

                        public int hashCode() {
                                r2 = this;
                                java.lang.Class r0 = r2.getClass()
                                int r0 = r0.hashCode()
                                int r0 = r0 * 31
                                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.result
                                if (r1 == 0) goto L13
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                            L13:
                                return r0
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step make(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                                r0 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForAssignment r2 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForAssignment
                                net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.result
                                r2.<init>(r3, r1)
                                return r2
                        }
                    }

                    public ForAssignment(@net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2) {
                            r0 = this;
                            r0.<init>()
                            r0.result = r1
                            r0.assigner = r2
                            return
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory castTo(java.lang.reflect.Type r1) {
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForAssignment$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForAssignment$Factory
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r1)
                            r0.<init>(r1)
                            return r0
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory castTo(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForAssignment$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForAssignment$Factory
                            r0.<init>(r1)
                            return r0
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory castToSubstitutionResult() {
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForAssignment$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForAssignment$Factory
                            r1 = 0
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
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.result
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForAssignment r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForAssignment) r5
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.result
                            if (r3 == 0) goto L24
                            if (r2 == 0) goto L26
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L27
                            return r1
                        L24:
                            if (r2 == 0) goto L27
                        L26:
                            return r1
                        L27:
                            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
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
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.result
                            if (r1 == 0) goto L13
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                        L13:
                            int r0 = r0 * 31
                            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, net.bytebuddy.description.type.TypeDescription.Generic r7, java.util.Map<java.lang.Integer, java.lang.Integer> r8, int r9) {
                            r0 = this;
                            net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r0.assigner
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r0.result
                            if (r2 != 0) goto L7
                            r2 = r4
                        L7:
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.assign(r7, r2, r3)
                            boolean r2 = r1.isValid()
                            if (r2 != 0) goto L38
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "Failed to assign "
                            r2.append(r3)
                            r2.append(r7)
                            java.lang.String r3 = " to "
                            r2.append(r3)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.result
                            if (r3 != 0) goto L2c
                            goto L2d
                        L2c:
                            r4 = r3
                        L2d:
                            r2.append(r4)
                            java.lang.String r2 = r2.toString()
                            r1.<init>(r2)
                            throw r1
                        L38:
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r2 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.result
                            if (r3 != 0) goto L3f
                            goto L40
                        L3f:
                            r4 = r3
                        L40:
                            r2.<init>(r1, r4)
                            return r2
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForDelegation implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step {
                    private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved dispatcher;
                    private final java.util.List<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved> offsetMappings;
                    private final net.bytebuddy.description.type.TypeDescription.Generic returned;

                    public interface BootstrapArgumentResolver {

                        public interface Factory {
                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1);
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForDefaultValues implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver {
                            private final net.bytebuddy.description.method.MethodDescription.InDefinedShape delegate;

                            public enum Factory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Factory {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory[] $VALUES = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory INSTANCE = null;

                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Factory
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory.INSTANCE = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Factory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory[]{r0}
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory.$VALUES = r0
                                        return
                                }

                                Factory(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Factory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Factory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Factory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                                        r1 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues
                                        r0.<init>(r2)
                                        return r0
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Resolved {
                                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape delegate;
                                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                                private final net.bytebuddy.description.type.TypeDescription instrumentedType;

                                public Resolved(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription r3) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.delegate = r1
                                        r0.instrumentedType = r2
                                        r0.instrumentedMethod = r3
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
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.delegate
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Resolved) r5
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.delegate
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
                                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                                        net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
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
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.delegate
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Resolved
                                public java.util.List<net.bytebuddy.utility.JavaConstant> make(net.bytebuddy.description.type.TypeDescription r13, net.bytebuddy.description.ByteCodeElement.Member r14, net.bytebuddy.utility.JavaConstant.MethodHandle r15) {
                                        r12 = this;
                                        r0 = 5
                                        r1 = 4
                                        r2 = 3
                                        r3 = 2
                                        r4 = 1
                                        r5 = 0
                                        r6 = 6
                                        net.bytebuddy.description.method.MethodDescription r7 = r12.instrumentedMethod
                                        boolean r7 = r7.isTypeInitializer()
                                        if (r7 == 0) goto L4c
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r7 = r12.delegate
                                        net.bytebuddy.description.type.TypeDescription r7 = r7.getDeclaringType()
                                        java.lang.String r7 = r7.getName()
                                        net.bytebuddy.utility.JavaConstant r7 = net.bytebuddy.utility.JavaConstant.Simple.ofLoaded(r7)
                                        net.bytebuddy.utility.JavaConstant r13 = net.bytebuddy.utility.JavaConstant.Simple.of(r13)
                                        java.lang.String r14 = r14.getInternalName()
                                        net.bytebuddy.utility.JavaConstant r14 = net.bytebuddy.utility.JavaConstant.Simple.ofLoaded(r14)
                                        net.bytebuddy.description.type.TypeDescription r8 = r12.instrumentedType
                                        net.bytebuddy.utility.JavaConstant r8 = net.bytebuddy.utility.JavaConstant.Simple.of(r8)
                                        net.bytebuddy.description.method.MethodDescription r9 = r12.instrumentedMethod
                                        java.lang.String r9 = r9.getInternalName()
                                        net.bytebuddy.utility.JavaConstant r9 = net.bytebuddy.utility.JavaConstant.Simple.ofLoaded(r9)
                                        net.bytebuddy.utility.JavaConstant[] r6 = new net.bytebuddy.utility.JavaConstant[r6]
                                        r6[r5] = r7
                                        r6[r4] = r13
                                        r6[r3] = r14
                                        r6[r2] = r15
                                        r6[r1] = r8
                                        r6[r0] = r9
                                        java.util.List r13 = java.util.Arrays.asList(r6)
                                        return r13
                                    L4c:
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r7 = r12.delegate
                                        net.bytebuddy.description.type.TypeDescription r7 = r7.getDeclaringType()
                                        java.lang.String r7 = r7.getName()
                                        net.bytebuddy.utility.JavaConstant r7 = net.bytebuddy.utility.JavaConstant.Simple.ofLoaded(r7)
                                        net.bytebuddy.utility.JavaConstant r13 = net.bytebuddy.utility.JavaConstant.Simple.of(r13)
                                        java.lang.String r14 = r14.getInternalName()
                                        net.bytebuddy.utility.JavaConstant r14 = net.bytebuddy.utility.JavaConstant.Simple.ofLoaded(r14)
                                        net.bytebuddy.description.type.TypeDescription r8 = r12.instrumentedType
                                        net.bytebuddy.utility.JavaConstant r8 = net.bytebuddy.utility.JavaConstant.Simple.of(r8)
                                        net.bytebuddy.description.method.MethodDescription r9 = r12.instrumentedMethod
                                        java.lang.String r9 = r9.getInternalName()
                                        net.bytebuddy.utility.JavaConstant r9 = net.bytebuddy.utility.JavaConstant.Simple.ofLoaded(r9)
                                        net.bytebuddy.description.method.MethodDescription r10 = r12.instrumentedMethod
                                        net.bytebuddy.description.ByteCodeElement$TypeDependant r10 = r10.asDefined()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r10 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r10
                                        net.bytebuddy.utility.JavaConstant$MethodHandle r10 = net.bytebuddy.utility.JavaConstant.MethodHandle.of(r10)
                                        r11 = 7
                                        net.bytebuddy.utility.JavaConstant[] r11 = new net.bytebuddy.utility.JavaConstant[r11]
                                        r11[r5] = r7
                                        r11[r4] = r13
                                        r11[r3] = r14
                                        r11[r2] = r15
                                        r11[r1] = r8
                                        r11[r0] = r9
                                        r11[r6] = r10
                                        java.util.List r13 = java.util.Arrays.asList(r11)
                                        return r13
                                }
                            }

                            public ForDefaultValues(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.delegate = r1
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
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.delegate
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues) r5
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.delegate
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
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.delegate
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Resolved resolve(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                                    r2 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Resolved
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.delegate
                                    r0.<init>(r1, r3, r4)
                                    return r0
                            }
                        }

                        public interface Resolved {
                            java.util.List<net.bytebuddy.utility.JavaConstant> make(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.utility.JavaConstant.MethodHandle r3);
                        }

                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2);
                    }

                    public interface Dispatcher {

                        public interface Factory {
                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1);
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForDynamicInvocation implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher {
                            private final net.bytebuddy.description.method.MethodDescription.InDefinedShape bootstrapMethod;
                            private final net.bytebuddy.description.method.MethodDescription.InDefinedShape delegate;
                            private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver resolver;

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Factory implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory {
                                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape bootstrapMethod;
                                private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Factory resolverFactory;

                                public Factory(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Factory r2) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.bootstrapMethod = r1
                                        r0.resolverFactory = r2
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
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.bootstrapMethod
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForDynamicInvocation.Factory) r5
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.bootstrapMethod
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory r2 = r4.resolverFactory
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory r5 = r5.resolverFactory
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
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.bootstrapMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory r1 = r2.resolverFactory
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                                        r3 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r3.bootstrapMethod
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Factory r2 = r3.resolverFactory
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver r2 = r2.make(r4)
                                        r0.<init>(r1, r4, r2)
                                        return r0
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved {
                                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape bootstrapMethod;
                                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape delegate;
                                private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Resolved resolver;

                                public Resolved(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Resolved r3) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.bootstrapMethod = r1
                                        r0.delegate = r2
                                        r0.resolver = r3
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.ByteCodeElement.Member r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5) {
                                        r2 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Resolved r0 = r2.resolver
                                        java.util.List r3 = r0.make(r3, r4, r5)
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r2.bootstrapMethod
                                        net.bytebuddy.description.type.TypeList r5 = net.bytebuddy.description.type.TypeList.Explicit.of(r3)
                                        boolean r4 = r4.isInvokeBootstrap(r5)
                                        if (r4 == 0) goto L3b
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r2.bootstrapMethod
                                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r4 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r4)
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r2.delegate
                                        java.lang.String r5 = r5.getInternalName()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.delegate
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.getReturnType()
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.delegate
                                        net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
                                        net.bytebuddy.description.type.TypeList$Generic r1 = r1.asTypeList()
                                        net.bytebuddy.description.type.TypeList r1 = r1.asErasures()
                                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r4.dynamic(r5, r0, r1, r3)
                                        return r3
                                    L3b:
                                        java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                                        r5.<init>()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.bootstrapMethod
                                        r5.append(r0)
                                        java.lang.String r0 = " is not accepting advice bootstrap arguments: "
                                        r5.append(r0)
                                        r5.append(r3)
                                        java.lang.String r3 = r5.toString()
                                        r4.<init>(r3)
                                        throw r4
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
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.bootstrapMethod
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForDynamicInvocation.Resolved) r5
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.bootstrapMethod
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.delegate
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.delegate
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L2b
                                        return r1
                                    L2b:
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Resolved r2 = r4.resolver
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Resolved r5 = r5.resolver
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
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.bootstrapMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.delegate
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Resolved r1 = r2.resolver
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation initialize() {
                                        r1 = this;
                                        net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                                        return r0
                                }
                            }

                            public ForDynamicInvocation(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver r3) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.bootstrapMethod = r1
                                    r0.delegate = r2
                                    r0.resolver = r3
                                    return
                            }

                            public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory of(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Factory r3) {
                                    boolean r0 = r2.isInvokeBootstrap()
                                    if (r0 == 0) goto Lc
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation$Factory
                                    r0.<init>(r2, r3)
                                    return r0
                                Lc:
                                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                    r0.<init>()
                                    java.lang.String r1 = "Not a bootstrap method: "
                                    r0.append(r1)
                                    r0.append(r2)
                                    java.lang.String r2 = r0.toString()
                                    r3.<init>(r2)
                                    throw r3
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
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.bootstrapMethod
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForDynamicInvocation) r5
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.bootstrapMethod
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L20
                                    return r1
                                L20:
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.delegate
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.delegate
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L2b
                                    return r1
                                L2b:
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver r2 = r4.resolver
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver r5 = r5.resolver
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
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.bootstrapMethod
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.delegate
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver r1 = r2.resolver
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved resolve(net.bytebuddy.description.type.TypeDescription r5, net.bytebuddy.description.method.MethodDescription r6) {
                                    r4 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation$Resolved r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForDynamicInvocation$Resolved
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r4.bootstrapMethod
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.delegate
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver r3 = r4.resolver
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$Resolved r5 = r3.resolve(r5, r6)
                                    r0.<init>(r1, r2, r5)
                                    return r0
                            }
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForRegularInvocation implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved {
                            private final net.bytebuddy.description.method.MethodDescription delegate;

                            public enum Factory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory[] $VALUES = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory INSTANCE = null;

                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory.INSTANCE = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory[]{r0}
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory.$VALUES = r0
                                        return
                                }

                                Factory(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                                        r1 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation
                                        r0.<init>(r2)
                                        return r0
                                }
                            }

                            public ForRegularInvocation(net.bytebuddy.description.method.MethodDescription r1) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.delegate = r1
                                    return
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved
                            public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.utility.JavaConstant.MethodHandle r3) {
                                    r0 = this;
                                    net.bytebuddy.description.method.MethodDescription r1 = r0.delegate
                                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
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
                                    net.bytebuddy.description.method.MethodDescription r2 = r4.delegate
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation) r5
                                    net.bytebuddy.description.method.MethodDescription r5 = r5.delegate
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
                                    net.bytebuddy.description.method.MethodDescription r1 = r2.delegate
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved
                            public net.bytebuddy.implementation.bytecode.StackManipulation initialize() {
                                    r4 = this;
                                    net.bytebuddy.description.method.MethodDescription r0 = r4.delegate
                                    boolean r0 = r0.isConstructor()
                                    if (r0 == 0) goto L27
                                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                    net.bytebuddy.description.method.MethodDescription r1 = r4.delegate
                                    net.bytebuddy.description.type.TypeDefinition r1 = r1.getDeclaringType()
                                    net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r1)
                                    r2 = 2
                                    net.bytebuddy.implementation.bytecode.StackManipulation[] r2 = new net.bytebuddy.implementation.bytecode.StackManipulation[r2]
                                    r3 = 0
                                    r2[r3] = r1
                                    net.bytebuddy.implementation.bytecode.Duplication r1 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                                    r3 = 1
                                    r2[r3] = r1
                                    r0.<init>(r2)
                                    goto L29
                                L27:
                                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                                L29:
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2) {
                                    r0 = this;
                                    return r0
                            }
                        }

                        public interface Resolved {
                            net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.utility.JavaConstant.MethodHandle r3);

                            net.bytebuddy.implementation.bytecode.StackManipulation initialize();
                        }

                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2);
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Factory implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory {
                        private final net.bytebuddy.description.method.MethodDescription.InDefinedShape delegate;
                        private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher dispatcher;
                        private final java.util.List<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping> offsetMappings;

                        public Factory(net.bytebuddy.description.method.MethodDescription.InDefinedShape r17, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher r18, java.util.List<? extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<?>> r19) {
                                r16 = this;
                                r0 = r16
                                r1 = r17
                                r16.<init>()
                                java.util.HashMap r2 = new java.util.HashMap
                                r2.<init>()
                                java.util.Iterator r3 = r19.iterator()
                            L10:
                                boolean r4 = r3.hasNext()
                                if (r4 == 0) goto L28
                                java.lang.Object r4 = r3.next()
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory r4 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory) r4
                                java.lang.Class r5 = r4.getAnnotationType()
                                net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r5)
                                r2.put(r5, r4)
                                goto L10
                            L28:
                                java.util.ArrayList r3 = new java.util.ArrayList
                                int r4 = r19.size()
                                r3.<init>(r4)
                                r0.offsetMappings = r3
                                boolean r3 = r17.isMethod()
                                r4 = 0
                                java.lang.String r5 = " and "
                                java.lang.String r6 = " is bound to both "
                                r7 = 0
                                if (r3 == 0) goto Laa
                                boolean r3 = r17.isStatic()
                                if (r3 != 0) goto Laa
                                net.bytebuddy.description.annotation.AnnotationList r3 = r17.getDeclaredAnnotations()
                                java.util.Iterator r3 = r3.iterator()
                                r8 = r7
                            L4e:
                                boolean r9 = r3.hasNext()
                                if (r9 == 0) goto L94
                                java.lang.Object r9 = r3.next()
                                net.bytebuddy.description.annotation.AnnotationDescription r9 = (net.bytebuddy.description.annotation.AnnotationDescription) r9
                                net.bytebuddy.description.type.TypeDescription r10 = r9.getAnnotationType()
                                java.lang.Object r10 = r2.get(r10)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory r10 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory) r10
                                if (r10 == 0) goto L4e
                                java.lang.Class r11 = r10.getAnnotationType()
                                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r9 = r9.prepare(r11)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping r9 = r10.make(r1, r9)
                                if (r8 != 0) goto L76
                                r8 = r9
                                goto L4e
                            L76:
                                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                r3.<init>()
                                r3.append(r1)
                                r3.append(r6)
                                r3.append(r9)
                                r3.append(r5)
                                r3.append(r8)
                                java.lang.String r1 = r3.toString()
                                r2.<init>(r1)
                                throw r2
                            L94:
                                java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping> r3 = r0.offsetMappings
                                if (r8 != 0) goto La7
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference r8 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference
                                net.bytebuddy.description.type.TypeDescription r9 = r17.getDeclaringType()
                                net.bytebuddy.description.type.TypeDescription$Generic r9 = r9.asGenericType()
                                net.bytebuddy.asm.MemberSubstitution$Source r10 = net.bytebuddy.asm.MemberSubstitution.Source.SUBSTITUTED_ELEMENT
                                r8.<init>(r9, r7, r10, r4)
                            La7:
                                r3.add(r8)
                            Laa:
                                net.bytebuddy.description.method.ParameterList r3 = r17.getParameters()
                                int r3 = r3.size()
                                if (r4 >= r3) goto L126
                                net.bytebuddy.description.method.ParameterList r3 = r17.getParameters()
                                java.lang.Object r3 = r3.get(r4)
                                net.bytebuddy.description.method.ParameterDescription$InDefinedShape r3 = (net.bytebuddy.description.method.ParameterDescription.InDefinedShape) r3
                                net.bytebuddy.description.annotation.AnnotationList r8 = r3.getDeclaredAnnotations()
                                java.util.Iterator r8 = r8.iterator()
                                r9 = r7
                            Lc7:
                                boolean r10 = r8.hasNext()
                                if (r10 == 0) goto L10d
                                java.lang.Object r10 = r8.next()
                                net.bytebuddy.description.annotation.AnnotationDescription r10 = (net.bytebuddy.description.annotation.AnnotationDescription) r10
                                net.bytebuddy.description.type.TypeDescription r11 = r10.getAnnotationType()
                                java.lang.Object r11 = r2.get(r11)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory r11 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory) r11
                                if (r11 == 0) goto Lc7
                                java.lang.Class r12 = r11.getAnnotationType()
                                net.bytebuddy.description.annotation.AnnotationDescription$Loadable r10 = r10.prepare(r12)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping r10 = r11.make(r3, r10)
                                if (r9 != 0) goto Lef
                                r9 = r10
                                goto Lc7
                            Lef:
                                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                r2.<init>()
                                r2.append(r3)
                                r2.append(r6)
                                r2.append(r10)
                                r2.append(r5)
                                r2.append(r9)
                                java.lang.String r2 = r2.toString()
                                r1.<init>(r2)
                                throw r1
                            L10d:
                                java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping> r8 = r0.offsetMappings
                                if (r9 != 0) goto L120
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument r15 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument
                                net.bytebuddy.description.type.TypeDescription$Generic r10 = r3.getType()
                                net.bytebuddy.asm.MemberSubstitution$Source r13 = net.bytebuddy.asm.MemberSubstitution.Source.SUBSTITUTED_ELEMENT
                                r14 = 0
                                r12 = 0
                                r9 = r15
                                r11 = r4
                                r9.<init>(r10, r11, r12, r13, r14)
                            L120:
                                r8.add(r9)
                                int r4 = r4 + 1
                                goto Laa
                            L126:
                                r0.delegate = r1
                                r1 = r18
                                r0.dispatcher = r1
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
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.delegate
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Factory) r5
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.delegate
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L20
                                return r1
                            L20:
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher r2 = r4.dispatcher
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher r3 = r5.dispatcher
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L2b
                                return r1
                            L2b:
                                java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping> r2 = r4.offsetMappings
                                java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping> r5 = r5.offsetMappings
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
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.delegate
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher r1 = r2.dispatcher
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping> r1 = r2.offsetMappings
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step make(net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5, net.bytebuddy.description.type.TypeDescription r6, net.bytebuddy.description.method.MethodDescription r7) {
                                r3 = this;
                                java.util.ArrayList r0 = new java.util.ArrayList
                                java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping> r1 = r3.offsetMappings
                                int r1 = r1.size()
                                r0.<init>(r1)
                                java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping> r1 = r3.offsetMappings
                                java.util.Iterator r1 = r1.iterator()
                            L11:
                                boolean r2 = r1.hasNext()
                                if (r2 == 0) goto L25
                                java.lang.Object r2 = r1.next()
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping r2 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping) r2
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved r2 = r2.resolve(r4, r5, r6, r7)
                                r0.add(r2)
                                goto L11
                            L25:
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation
                                net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r3.delegate
                                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.getReturnType()
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher r1 = r3.dispatcher
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Resolved r6 = r1.resolve(r6, r7)
                                r4.<init>(r5, r6, r0)
                                return r4
                        }
                    }

                    public interface OffsetMapping {

                        public interface Factory<T extends java.lang.annotation.Annotation> {

                            public static abstract class AbstractBase<S extends java.lang.annotation.Annotation> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<S> {
                                public AbstractBase() {
                                        r0 = this;
                                        r0.<init>()
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r2) {
                                        r0 = this;
                                        net.bytebuddy.description.type.TypeDescription r1 = r1.getDeclaringType()
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.asGenericType()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping r1 = r0.make(r1, r2)
                                        return r1
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r2) {
                                        r0 = this;
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getType()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping r1 = r0.make(r1, r2)
                                        return r1
                                }

                                public abstract net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r2);
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Simple<S extends java.lang.annotation.Annotation> extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase<S> {
                                private final java.lang.Class<S> annotationType;
                                private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping offsetMapping;

                                public Simple(java.lang.Class<S> r1, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping r2) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.annotationType = r1
                                        r0.offsetMapping = r2
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
                                        java.lang.Class<S extends java.lang.annotation.Annotation> r2 = r4.annotationType
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory$Simple r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.Simple) r5
                                        java.lang.Class<S extends java.lang.annotation.Annotation> r3 = r5.annotationType
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping r2 = r4.offsetMapping
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping r5 = r5.offsetMapping
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L2b
                                        return r1
                                    L2b:
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<S> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<S extends java.lang.annotation.Annotation> r0 = r1.annotationType
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        java.lang.Class<S extends java.lang.annotation.Annotation> r1 = r2.annotationType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping r1 = r2.offsetMapping
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r2) {
                                        r0 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping r1 = r0.offsetMapping
                                        return r1
                                }
                            }

                            public static abstract class WithParameterSupportOnly<S extends java.lang.annotation.Annotation> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<S> {
                                public WithParameterSupportOnly() {
                                        r0 = this;
                                        r0.<init>()
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<S> r2) {
                                        r0 = this;
                                        java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                                        java.lang.String r2 = "This factory does not support binding a method receiver"
                                        r1.<init>(r2)
                                        throw r1
                                }
                            }

                            java.lang.Class<T> getAnnotationType();

                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r2);

                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r2);
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForAllArguments implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping {
                            private final boolean includeSelf;
                            private final boolean nullIfEmpty;
                            private final net.bytebuddy.asm.MemberSubstitution.Source source;
                            private final net.bytebuddy.description.type.TypeDescription.Generic targetComponentType;

                            @net.bytebuddy.utility.nullability.MaybeNull
                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                            public enum Factory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<net.bytebuddy.asm.MemberSubstitution.AllArguments> {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory[] $VALUES = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ALL_ARGUMENTS_INCLUDE_SELF = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ALL_ARGUMENTS_NULL_IF_EMPTY = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ALL_ARGUMENTS_SOURCE = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ALL_ARGUMENTS_TYPING = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory INSTANCE = null;

                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Factory
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.INSTANCE = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Factory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory[]{r0}
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.$VALUES = r0
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$AllArguments> r0 = net.bytebuddy.asm.MemberSubstitution.AllArguments.class
                                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                                        net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                                        java.lang.String r1 = "typing"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                        java.lang.Object r1 = r1.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.ALL_ARGUMENTS_TYPING = r1
                                        java.lang.String r1 = "source"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                        java.lang.Object r1 = r1.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.ALL_ARGUMENTS_SOURCE = r1
                                        java.lang.String r1 = "includeSelf"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                        java.lang.Object r1 = r1.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.ALL_ARGUMENTS_INCLUDE_SELF = r1
                                        java.lang.String r1 = "nullIfEmpty"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                                        java.lang.Object r0 = r0.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.ALL_ARGUMENTS_NULL_IF_EMPTY = r0
                                        return
                                }

                                Factory(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Factory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Factory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Factory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<net.bytebuddy.asm.MemberSubstitution.AllArguments> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$AllArguments> r0 = net.bytebuddy.asm.MemberSubstitution.AllArguments.class
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.AllArguments> r2) {
                                        r0 = this;
                                        java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                                        java.lang.String r2 = "This factory does not support binding a method receiver"
                                        r1.<init>(r2)
                                        throw r1
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming component type for array type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r8, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.AllArguments> r9) {
                                        r7 = this;
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r8.getType()
                                        boolean r0 = r0.isArray()
                                        if (r0 == 0) goto L67
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments
                                        net.bytebuddy.description.type.TypeDescription$Generic r8 = r8.getType()
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r8.getComponentType()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.ALL_ARGUMENTS_TYPING
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r1 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                        java.lang.Object r8 = r8.resolve(r1)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r8 = (net.bytebuddy.description.enumeration.EnumerationDescription) r8
                                        java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Typing> r3 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.class
                                        java.lang.Enum r8 = r8.load(r3)
                                        r3 = r8
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing) r3
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.ALL_ARGUMENTS_SOURCE
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Object r8 = r8.resolve(r1)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r8 = (net.bytebuddy.description.enumeration.EnumerationDescription) r8
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Source> r1 = net.bytebuddy.asm.MemberSubstitution.Source.class
                                        java.lang.Enum r8 = r8.load(r1)
                                        r4 = r8
                                        net.bytebuddy.asm.MemberSubstitution$Source r4 = (net.bytebuddy.asm.MemberSubstitution.Source) r4
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.ALL_ARGUMENTS_INCLUDE_SELF
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                                        java.lang.Object r8 = r8.resolve(r1)
                                        java.lang.Boolean r8 = (java.lang.Boolean) r8
                                        boolean r5 = r8.booleanValue()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.ALL_ARGUMENTS_NULL_IF_EMPTY
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Object r8 = r8.resolve(r1)
                                        java.lang.Boolean r8 = (java.lang.Boolean) r8
                                        boolean r6 = r8.booleanValue()
                                        r1 = r0
                                        r1.<init>(r2, r3, r4, r5, r6)
                                        return r0
                                    L67:
                                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Expected array as parameter type for "
                                        r0.append(r1)
                                        r0.append(r8)
                                        java.lang.String r8 = r0.toString()
                                        r9.<init>(r8)
                                        throw r9
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved {
                                private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
                                private final boolean includeSelf;
                                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                                private final boolean nullIfEmpty;
                                private final net.bytebuddy.asm.MemberSubstitution.Source source;
                                private final net.bytebuddy.description.type.TypeDescription.Generic targetComponentType;
                                private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                                public Resolved(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.asm.MemberSubstitution.Source r3, boolean r4, boolean r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.description.method.MethodDescription r7) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.targetComponentType = r1
                                        r0.typing = r2
                                        r0.source = r3
                                        r0.includeSelf = r4
                                        r0.nullIfEmpty = r5
                                        r0.assigner = r6
                                        r0.instrumentedMethod = r7
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r7, net.bytebuddy.description.ByteCodeElement.Member r8, net.bytebuddy.description.type.TypeList.Generic r9, net.bytebuddy.description.type.TypeDescription.Generic r10, net.bytebuddy.description.type.TypeDescription.Generic r11, net.bytebuddy.utility.JavaConstant.MethodHandle r12, java.util.Map<java.lang.Integer, java.lang.Integer> r13, int r14) {
                                        r6 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Source r0 = r6.source
                                        boolean r1 = r6.includeSelf
                                        net.bytebuddy.description.method.MethodDescription r5 = r6.instrumentedMethod
                                        r2 = r9
                                        r3 = r13
                                        r4 = r8
                                        java.util.List r7 = r0.arguments(r1, r2, r3, r4, r5)
                                        boolean r8 = r6.nullIfEmpty
                                        if (r8 == 0) goto L1a
                                        boolean r8 = r7.isEmpty()
                                        if (r8 == 0) goto L1a
                                        net.bytebuddy.implementation.bytecode.constant.NullConstant r7 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
                                        return r7
                                    L1a:
                                        java.util.ArrayList r8 = new java.util.ArrayList
                                        r8.<init>()
                                        java.util.Iterator r7 = r7.iterator()
                                    L23:
                                        boolean r9 = r7.hasNext()
                                        if (r9 == 0) goto L8a
                                        java.lang.Object r9 = r7.next()
                                        net.bytebuddy.asm.MemberSubstitution$Source$Value r9 = (net.bytebuddy.asm.MemberSubstitution.Source.Value) r9
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r10 = r6.assigner
                                        net.bytebuddy.description.type.TypeDescription$Generic r11 = r9.getTypeDescription()
                                        net.bytebuddy.description.type.TypeDescription$Generic r12 = r6.targetComponentType
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r13 = r6.typing
                                        net.bytebuddy.implementation.bytecode.StackManipulation r10 = r10.assign(r11, r12, r13)
                                        boolean r11 = r10.isValid()
                                        if (r11 == 0) goto L65
                                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r11 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                        net.bytebuddy.description.type.TypeDescription$Generic r12 = r9.getTypeDescription()
                                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r12 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r12)
                                        int r9 = r9.getOffset()
                                        net.bytebuddy.implementation.bytecode.StackManipulation r9 = r12.loadFrom(r9)
                                        r12 = 2
                                        net.bytebuddy.implementation.bytecode.StackManipulation[] r12 = new net.bytebuddy.implementation.bytecode.StackManipulation[r12]
                                        r13 = 0
                                        r12[r13] = r9
                                        r9 = 1
                                        r12[r9] = r10
                                        r11.<init>(r12)
                                        r8.add(r11)
                                        goto L23
                                    L65:
                                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                                        r8.<init>()
                                        java.lang.String r10 = "Cannot assign "
                                        r8.append(r10)
                                        net.bytebuddy.description.type.TypeDescription$Generic r9 = r9.getTypeDescription()
                                        r8.append(r9)
                                        java.lang.String r9 = " to "
                                        r8.append(r9)
                                        net.bytebuddy.description.type.TypeDescription$Generic r9 = r6.targetComponentType
                                        r8.append(r9)
                                        java.lang.String r8 = r8.toString()
                                        r7.<init>(r8)
                                        throw r7
                                    L8a:
                                        net.bytebuddy.description.type.TypeDescription$Generic r7 = r6.targetComponentType
                                        net.bytebuddy.implementation.bytecode.collection.ArrayFactory r7 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r7)
                                        net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.withValues(r8)
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
                                        boolean r2 = r4.includeSelf
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Resolved) r5
                                        boolean r3 = r5.includeSelf
                                        if (r2 == r3) goto L1c
                                        return r1
                                    L1c:
                                        boolean r2 = r4.nullIfEmpty
                                        boolean r3 = r5.nullIfEmpty
                                        if (r2 == r3) goto L23
                                        return r1
                                    L23:
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L2e
                                        return r1
                                    L2e:
                                        net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                        net.bytebuddy.asm.MemberSubstitution$Source r3 = r5.source
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L39
                                        return r1
                                    L39:
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.targetComponentType
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.targetComponentType
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L44
                                        return r1
                                    L44:
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r5.assigner
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L4f
                                        return r1
                                    L4f:
                                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                                        net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L5a
                                        return r1
                                    L5a:
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.targetComponentType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        boolean r1 = r2.includeSelf
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        boolean r1 = r2.nullIfEmpty
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            public ForAllArguments(net.bytebuddy.description.type.TypeDescription.Generic r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.asm.MemberSubstitution.Source r3, boolean r4, boolean r5) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.targetComponentType = r1
                                    r0.typing = r2
                                    r0.source = r3
                                    r0.includeSelf = r4
                                    r0.nullIfEmpty = r5
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
                                    boolean r2 = r4.includeSelf
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments) r5
                                    boolean r3 = r5.includeSelf
                                    if (r2 == r3) goto L1c
                                    return r1
                                L1c:
                                    boolean r2 = r4.nullIfEmpty
                                    boolean r3 = r5.nullIfEmpty
                                    if (r2 == r3) goto L23
                                    return r1
                                L23:
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                    if (r3 == 0) goto L32
                                    if (r2 == 0) goto L34
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L35
                                    return r1
                                L32:
                                    if (r2 == 0) goto L35
                                L34:
                                    return r1
                                L35:
                                    net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                    net.bytebuddy.asm.MemberSubstitution$Source r3 = r5.source
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L40
                                    return r1
                                L40:
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.targetComponentType
                                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.targetComponentType
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L4b
                                    return r1
                                L4b:
                                    return r0
                            }

                            public int hashCode() {
                                    r2 = this;
                                    java.lang.Class r0 = r2.getClass()
                                    int r0 = r0.hashCode()
                                    int r0 = r0 * 31
                                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.targetComponentType
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                                    if (r1 == 0) goto L1c
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                L1c:
                                    int r0 = r0 * 31
                                    net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    boolean r1 = r2.includeSelf
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    boolean r1 = r2.nullIfEmpty
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r9, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r10, net.bytebuddy.description.type.TypeDescription r11, net.bytebuddy.description.method.MethodDescription r12) {
                                    r8 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Resolved r11 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Resolved
                                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r8.targetComponentType
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = r8.typing
                                    if (r0 != 0) goto La
                                    r2 = r10
                                    goto Lb
                                La:
                                    r2 = r0
                                Lb:
                                    net.bytebuddy.asm.MemberSubstitution$Source r3 = r8.source
                                    boolean r4 = r8.includeSelf
                                    boolean r5 = r8.nullIfEmpty
                                    r0 = r11
                                    r6 = r9
                                    r7 = r12
                                    r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                                    return r11
                            }
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForArgument implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping {
                            private final int index;
                            private final boolean optional;
                            private final net.bytebuddy.asm.MemberSubstitution.Source source;
                            private final net.bytebuddy.description.type.TypeDescription.Generic targetType;

                            @net.bytebuddy.utility.nullability.MaybeNull
                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                            public enum Factory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<net.bytebuddy.asm.MemberSubstitution.Argument> {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory[] $VALUES = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ARGUMENT_OPTIONAL = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ARGUMENT_SOURCE = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ARGUMENT_TYPING = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ARGUMENT_VALUE = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory INSTANCE = null;

                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Factory
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.INSTANCE = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Factory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory[]{r0}
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.$VALUES = r0
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Argument> r0 = net.bytebuddy.asm.MemberSubstitution.Argument.class
                                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                                        net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                                        java.lang.String r1 = "value"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                        java.lang.Object r1 = r1.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_VALUE = r1
                                        java.lang.String r1 = "typing"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                        java.lang.Object r1 = r1.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_TYPING = r1
                                        java.lang.String r1 = "source"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                        java.lang.Object r1 = r1.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_SOURCE = r1
                                        java.lang.String r1 = "optional"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                                        java.lang.Object r0 = r0.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_OPTIONAL = r0
                                        return
                                }

                                Factory(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Factory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Factory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Factory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<net.bytebuddy.asm.MemberSubstitution.Argument> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Argument> r0 = net.bytebuddy.asm.MemberSubstitution.Argument.class
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r8, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.Argument> r9) {
                                        r7 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument r6 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument
                                        net.bytebuddy.description.type.TypeDescription r8 = r8.getDeclaringType()
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r8.asGenericType()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_VALUE
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
                                        java.lang.Object r8 = r8.resolve(r0)
                                        java.lang.Integer r8 = (java.lang.Integer) r8
                                        int r2 = r8.intValue()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_TYPING
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r0 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                        java.lang.Object r8 = r8.resolve(r0)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r8 = (net.bytebuddy.description.enumeration.EnumerationDescription) r8
                                        java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Typing> r3 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.class
                                        java.lang.Enum r8 = r8.load(r3)
                                        r3 = r8
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing) r3
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_SOURCE
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Object r8 = r8.resolve(r0)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r8 = (net.bytebuddy.description.enumeration.EnumerationDescription) r8
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Source> r0 = net.bytebuddy.asm.MemberSubstitution.Source.class
                                        java.lang.Enum r8 = r8.load(r0)
                                        r4 = r8
                                        net.bytebuddy.asm.MemberSubstitution$Source r4 = (net.bytebuddy.asm.MemberSubstitution.Source) r4
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_OPTIONAL
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
                                        java.lang.Object r8 = r8.resolve(r9)
                                        java.lang.Boolean r8 = (java.lang.Boolean) r8
                                        boolean r5 = r8.booleanValue()
                                        r0 = r6
                                        r0.<init>(r1, r2, r3, r4, r5)
                                        return r6
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r8, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.Argument> r9) {
                                        r7 = this;
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_VALUE
                                        net.bytebuddy.description.annotation.AnnotationValue r0 = r9.getValue(r0)
                                        java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
                                        java.lang.Object r0 = r0.resolve(r1)
                                        java.lang.Integer r0 = (java.lang.Integer) r0
                                        int r3 = r0.intValue()
                                        if (r3 < 0) goto L5d
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r8.getType()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_TYPING
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r1 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                        java.lang.Object r8 = r8.resolve(r1)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r8 = (net.bytebuddy.description.enumeration.EnumerationDescription) r8
                                        java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Typing> r4 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.class
                                        java.lang.Enum r8 = r8.load(r4)
                                        r4 = r8
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing) r4
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_SOURCE
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Object r8 = r8.resolve(r1)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r8 = (net.bytebuddy.description.enumeration.EnumerationDescription) r8
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Source> r1 = net.bytebuddy.asm.MemberSubstitution.Source.class
                                        java.lang.Enum r8 = r8.load(r1)
                                        r5 = r8
                                        net.bytebuddy.asm.MemberSubstitution$Source r5 = (net.bytebuddy.asm.MemberSubstitution.Source) r5
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r8 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.ARGUMENT_OPTIONAL
                                        net.bytebuddy.description.annotation.AnnotationValue r8 = r9.getValue(r8)
                                        java.lang.Class<java.lang.Boolean> r9 = java.lang.Boolean.class
                                        java.lang.Object r8 = r8.resolve(r9)
                                        java.lang.Boolean r8 = (java.lang.Boolean) r8
                                        boolean r6 = r8.booleanValue()
                                        r1 = r0
                                        r1.<init>(r2, r3, r4, r5, r6)
                                        return r0
                                    L5d:
                                        java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Cannot assign negative parameter index "
                                        r0.append(r1)
                                        r0.append(r3)
                                        java.lang.String r1 = " for "
                                        r0.append(r1)
                                        r0.append(r8)
                                        java.lang.String r8 = r0.toString()
                                        r9.<init>(r8)
                                        throw r9
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved {
                                private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
                                private final int index;
                                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                                private final boolean optional;
                                private final net.bytebuddy.asm.MemberSubstitution.Source source;
                                private final net.bytebuddy.description.type.TypeDescription.Generic targetType;
                                private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                                public Resolved(net.bytebuddy.description.type.TypeDescription.Generic r1, int r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.asm.MemberSubstitution.Source r4, boolean r5, net.bytebuddy.implementation.bytecode.assign.Assigner r6, net.bytebuddy.description.method.MethodDescription r7) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.targetType = r1
                                        r0.index = r2
                                        r0.typing = r3
                                        r0.source = r4
                                        r0.optional = r5
                                        r0.assigner = r6
                                        r0.instrumentedMethod = r7
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r7, net.bytebuddy.description.ByteCodeElement.Member r8, net.bytebuddy.description.type.TypeList.Generic r9, net.bytebuddy.description.type.TypeDescription.Generic r10, net.bytebuddy.description.type.TypeDescription.Generic r11, net.bytebuddy.utility.JavaConstant.MethodHandle r12, java.util.Map<java.lang.Integer, java.lang.Integer> r13, int r14) {
                                        r6 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Source r0 = r6.source
                                        int r1 = r6.index
                                        net.bytebuddy.description.method.MethodDescription r5 = r6.instrumentedMethod
                                        r2 = r9
                                        r3 = r13
                                        r4 = r8
                                        net.bytebuddy.asm.MemberSubstitution$Source$Value r7 = r0.argument(r1, r2, r3, r4, r5)
                                        if (r7 == 0) goto L67
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r8 = r6.assigner
                                        net.bytebuddy.description.type.TypeDescription$Generic r9 = r7.getTypeDescription()
                                        net.bytebuddy.description.type.TypeDescription$Generic r10 = r6.targetType
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r11 = r6.typing
                                        net.bytebuddy.implementation.bytecode.StackManipulation r8 = r8.assign(r9, r10, r11)
                                        boolean r9 = r8.isValid()
                                        if (r9 == 0) goto L42
                                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r9 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                        net.bytebuddy.description.type.TypeDescription$Generic r10 = r7.getTypeDescription()
                                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r10 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r10)
                                        int r7 = r7.getOffset()
                                        net.bytebuddy.implementation.bytecode.StackManipulation r7 = r10.loadFrom(r7)
                                        r10 = 2
                                        net.bytebuddy.implementation.bytecode.StackManipulation[] r10 = new net.bytebuddy.implementation.bytecode.StackManipulation[r10]
                                        r11 = 0
                                        r10[r11] = r7
                                        r7 = 1
                                        r10[r7] = r8
                                        r9.<init>(r10)
                                        return r9
                                    L42:
                                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r9 = new java.lang.StringBuilder
                                        r9.<init>()
                                        java.lang.String r10 = "Cannot assign "
                                        r9.append(r10)
                                        net.bytebuddy.description.type.TypeDescription$Generic r7 = r7.getTypeDescription()
                                        r9.append(r7)
                                        java.lang.String r7 = " to "
                                        r9.append(r7)
                                        net.bytebuddy.description.type.TypeDescription$Generic r7 = r6.targetType
                                        r9.append(r7)
                                        java.lang.String r7 = r9.toString()
                                        r8.<init>(r7)
                                        throw r8
                                    L67:
                                        boolean r7 = r6.optional
                                        if (r7 == 0) goto L72
                                        net.bytebuddy.description.type.TypeDescription$Generic r7 = r6.targetType
                                        net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r7)
                                        return r7
                                    L72:
                                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r9 = new java.lang.StringBuilder
                                        r9.<init>()
                                        java.lang.String r10 = "No argument with index "
                                        r9.append(r10)
                                        int r10 = r6.index
                                        r9.append(r10)
                                        java.lang.String r10 = " available for "
                                        r9.append(r10)
                                        r9.append(r8)
                                        java.lang.String r8 = r9.toString()
                                        r7.<init>(r8)
                                        throw r7
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
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Resolved) r5
                                        int r3 = r5.index
                                        if (r2 == r3) goto L1c
                                        return r1
                                    L1c:
                                        boolean r2 = r4.optional
                                        boolean r3 = r5.optional
                                        if (r2 == r3) goto L23
                                        return r1
                                    L23:
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L2e
                                        return r1
                                    L2e:
                                        net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                        net.bytebuddy.asm.MemberSubstitution$Source r3 = r5.source
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L39
                                        return r1
                                    L39:
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.targetType
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.targetType
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L44
                                        return r1
                                    L44:
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r5.assigner
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L4f
                                        return r1
                                    L4f:
                                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                                        net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L5a
                                        return r1
                                    L5a:
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.targetType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        int r1 = r2.index
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        boolean r1 = r2.optional
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            public ForArgument(net.bytebuddy.description.type.TypeDescription.Generic r1, int r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.asm.MemberSubstitution.Source r4, boolean r5) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.targetType = r1
                                    r0.index = r2
                                    r0.typing = r3
                                    r0.source = r4
                                    r0.optional = r5
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
                                    int r2 = r4.index
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument) r5
                                    int r3 = r5.index
                                    if (r2 == r3) goto L1c
                                    return r1
                                L1c:
                                    boolean r2 = r4.optional
                                    boolean r3 = r5.optional
                                    if (r2 == r3) goto L23
                                    return r1
                                L23:
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                    if (r3 == 0) goto L32
                                    if (r2 == 0) goto L34
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L35
                                    return r1
                                L32:
                                    if (r2 == 0) goto L35
                                L34:
                                    return r1
                                L35:
                                    net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                    net.bytebuddy.asm.MemberSubstitution$Source r3 = r5.source
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L40
                                    return r1
                                L40:
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.targetType
                                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.targetType
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L4b
                                    return r1
                                L4b:
                                    return r0
                            }

                            public int hashCode() {
                                    r2 = this;
                                    java.lang.Class r0 = r2.getClass()
                                    int r0 = r0.hashCode()
                                    int r0 = r0 * 31
                                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.targetType
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    int r1 = r2.index
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                                    if (r1 == 0) goto L21
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                L21:
                                    int r0 = r0 * 31
                                    net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    boolean r1 = r2.optional
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r9, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r10, net.bytebuddy.description.type.TypeDescription r11, net.bytebuddy.description.method.MethodDescription r12) {
                                    r8 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Resolved r11 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Resolved
                                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r8.targetType
                                    int r2 = r8.index
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = r8.typing
                                    if (r0 != 0) goto Lc
                                    r3 = r10
                                    goto Ld
                                Lc:
                                    r3 = r0
                                Ld:
                                    net.bytebuddy.asm.MemberSubstitution$Source r4 = r8.source
                                    boolean r5 = r8.optional
                                    r0 = r11
                                    r6 = r9
                                    r7 = r12
                                    r0.<init>(r1, r2, r3, r4, r5, r6, r7)
                                    return r11
                            }
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForCurrent implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping {
                            private final net.bytebuddy.description.type.TypeDescription.Generic targetType;

                            @net.bytebuddy.utility.nullability.MaybeNull
                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                            public enum Factory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<net.bytebuddy.asm.MemberSubstitution.Current> {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory[] $VALUES = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape CURRENT_TYPING = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory INSTANCE = null;

                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Factory
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory.INSTANCE = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Factory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory[]{r0}
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory.$VALUES = r0
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Current> r0 = net.bytebuddy.asm.MemberSubstitution.Current.class
                                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                                        net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                                        java.lang.String r1 = "typing"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                                        java.lang.Object r0 = r0.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory.CURRENT_TYPING = r0
                                        return
                                }

                                Factory(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Factory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Factory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Factory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<net.bytebuddy.asm.MemberSubstitution.Current> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Current> r0 = net.bytebuddy.asm.MemberSubstitution.Current.class
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.Current> r4) {
                                        r2 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent
                                        net.bytebuddy.description.type.TypeDescription r3 = r3.getDeclaringType()
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory.CURRENT_TYPING
                                        net.bytebuddy.description.annotation.AnnotationValue r4 = r4.getValue(r1)
                                        java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r1 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                        java.lang.Object r4 = r4.resolve(r1)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r4 = (net.bytebuddy.description.enumeration.EnumerationDescription) r4
                                        java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Typing> r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.class
                                        java.lang.Enum r4 = r4.load(r1)
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing) r4
                                        r0.<init>(r3, r4)
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.Current> r4) {
                                        r2 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory.CURRENT_TYPING
                                        net.bytebuddy.description.annotation.AnnotationValue r4 = r4.getValue(r1)
                                        java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r1 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                        java.lang.Object r4 = r4.resolve(r1)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r4 = (net.bytebuddy.description.enumeration.EnumerationDescription) r4
                                        java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Typing> r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.class
                                        java.lang.Enum r4 = r4.load(r1)
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing) r4
                                        r0.<init>(r3, r4)
                                        return r0
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved {
                                private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
                                private final net.bytebuddy.description.type.TypeDescription.Generic targetType;
                                private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                                public Resolved(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.targetType = r1
                                        r0.assigner = r2
                                        r0.typing = r3
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5, net.bytebuddy.utility.JavaConstant.MethodHandle r6, java.util.Map<java.lang.Integer, java.lang.Integer> r7, int r8) {
                                        r0 = this;
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r0.assigner
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r0.targetType
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r0.typing
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.assign(r5, r2, r3)
                                        boolean r2 = r1.isValid()
                                        if (r2 == 0) goto L27
                                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r3 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r5)
                                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.loadFrom(r8)
                                        r4 = 2
                                        net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                                        r5 = 0
                                        r4[r5] = r3
                                        r3 = 1
                                        r4[r3] = r1
                                        r2.<init>(r4)
                                        return r2
                                    L27:
                                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                        r2.<init>()
                                        java.lang.String r3 = "Cannot assign "
                                        r2.append(r3)
                                        r2.append(r5)
                                        java.lang.String r3 = " to "
                                        r2.append(r3)
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.targetType
                                        r2.append(r3)
                                        java.lang.String r2 = r2.toString()
                                        r1.<init>(r2)
                                        throw r1
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
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Resolved) r5
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.targetType
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.targetType
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L2b
                                        return r1
                                    L2b:
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
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
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.targetType
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
                            }

                            public ForCurrent(net.bytebuddy.description.type.TypeDescription.Generic r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.targetType = r1
                                    r0.typing = r2
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
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent) r5
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                    if (r3 == 0) goto L24
                                    if (r2 == 0) goto L26
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L27
                                    return r1
                                L24:
                                    if (r2 == 0) goto L27
                                L26:
                                    return r1
                                L27:
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.targetType
                                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.targetType
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
                                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.targetType
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                                    if (r1 == 0) goto L1c
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                L1c:
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.method.MethodDescription r5) {
                                    r1 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Resolved r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Resolved
                                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r1.targetType
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = r1.typing
                                    if (r0 != 0) goto L9
                                    goto La
                                L9:
                                    r3 = r0
                                La:
                                    r4.<init>(r5, r2, r3)
                                    return r4
                            }
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static abstract class ForField implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping {
                            private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FIELD_VALUE_DECLARING_TYPE = null;
                            private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FIELD_VALUE_TYPING = null;
                            private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FIELD_VALUE_VALUE = null;
                            private final net.bytebuddy.description.type.TypeDescription.Generic target;

                            @net.bytebuddy.utility.nullability.MaybeNull
                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField {
                                private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                                public static class Factory<T extends java.lang.annotation.Annotation> extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase<T> {
                                    private final java.lang.Class<T> annotationType;
                                    private final net.bytebuddy.description.field.FieldDescription fieldDescription;
                                    private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                                    public Factory(java.lang.Class<T> r2, net.bytebuddy.description.field.FieldDescription r3) {
                                            r1 = this;
                                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
                                            r1.<init>(r2, r3, r0)
                                            return
                                    }

                                    public Factory(java.lang.Class<T> r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                                            r0 = this;
                                            r0.<init>()
                                            r0.annotationType = r1
                                            r0.fieldDescription = r2
                                            r0.typing = r3
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
                                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Resolved$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Resolved.Factory) r5
                                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                            boolean r2 = r2.equals(r3)
                                            if (r2 != 0) goto L20
                                            return r1
                                        L20:
                                            java.lang.Class<T extends java.lang.annotation.Annotation> r2 = r4.annotationType
                                            java.lang.Class<T extends java.lang.annotation.Annotation> r3 = r5.annotationType
                                            boolean r2 = r2.equals(r3)
                                            if (r2 != 0) goto L2b
                                            return r1
                                        L2b:
                                            net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                                            net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
                                            boolean r5 = r2.equals(r5)
                                            if (r5 != 0) goto L36
                                            return r1
                                        L36:
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public java.lang.Class<T> getAnnotationType() {
                                            r1 = this;
                                            java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r1.annotationType
                                            return r0
                                    }

                                    public int hashCode() {
                                            r2 = this;
                                            java.lang.Class r0 = r2.getClass()
                                            int r0 = r0.hashCode()
                                            int r0 = r0 * 31
                                            java.lang.Class<T extends java.lang.annotation.Annotation> r1 = r2.annotationType
                                            int r1 = r1.hashCode()
                                            int r0 = r0 + r1
                                            int r0 = r0 * 31
                                            net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                            int r1 = r1.hashCode()
                                            int r0 = r0 + r1
                                            int r0 = r0 * 31
                                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                                            int r1 = r1.hashCode()
                                            int r0 = r0 + r1
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase
                                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r4) {
                                            r2 = this;
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Resolved r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Resolved
                                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = r2.typing
                                            net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                            r4.<init>(r3, r0, r1)
                                            return r4
                                    }
                                }

                                public Resolved(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.field.FieldDescription r3) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        r0.fieldDescription = r3
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
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
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Resolved) r5
                                        net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L27
                                        return r1
                                    L27:
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                public int hashCode() {
                                        r2 = this;
                                        int r0 = super.hashCode()
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                                public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                                        r2 = this;
                                        net.bytebuddy.description.field.FieldDescription r4 = r2.fieldDescription
                                        boolean r4 = r4.isStatic()
                                        if (r4 != 0) goto L35
                                        net.bytebuddy.description.field.FieldDescription r4 = r2.fieldDescription
                                        net.bytebuddy.description.type.TypeDefinition r4 = r4.getDeclaringType()
                                        net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                                        boolean r4 = r4.isAssignableFrom(r3)
                                        if (r4 == 0) goto L19
                                        goto L35
                                    L19:
                                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                        r0.append(r1)
                                        java.lang.String r1 = " is no member of "
                                        r0.append(r1)
                                        r0.append(r3)
                                        java.lang.String r3 = r0.toString()
                                        r4.<init>(r3)
                                        throw r4
                                    L35:
                                        net.bytebuddy.description.field.FieldDescription r4 = r2.fieldDescription
                                        boolean r4 = r4.isVisibleTo(r3)
                                        if (r4 == 0) goto L40
                                        net.bytebuddy.description.field.FieldDescription r3 = r2.fieldDescription
                                        return r3
                                    L40:
                                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Cannot access "
                                        r0.append(r1)
                                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                        r0.append(r1)
                                        java.lang.String r1 = " from "
                                        r0.append(r1)
                                        r0.append(r3)
                                        java.lang.String r3 = r0.toString()
                                        r4.<init>(r3)
                                        throw r4
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static abstract class Unresolved extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField {
                                protected static final java.lang.String BEAN_PROPERTY = "";
                                private final java.lang.String name;

                                public enum Factory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<net.bytebuddy.asm.MemberSubstitution.FieldValue> {
                                    private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory[] $VALUES = null;
                                    public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory INSTANCE = null;

                                    static {
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$Factory
                                            java.lang.String r1 = "INSTANCE"
                                            r2 = 0
                                            r0.<init>(r1, r2)
                                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory.INSTANCE = r0
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$Factory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory[]{r0}
                                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory.$VALUES = r0
                                            return
                                    }

                                    Factory(java.lang.String r1, int r2) {
                                            r0 = this;
                                            r0.<init>(r1, r2)
                                            return
                                    }

                                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory valueOf(java.lang.String r1) {
                                            java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$Factory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory.class
                                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory) r1
                                            return r1
                                    }

                                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory[] values() {
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$Factory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory.$VALUES
                                            java.lang.Object r0 = r0.clone()
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$Factory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory[]) r0
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public java.lang.Class<net.bytebuddy.asm.MemberSubstitution.FieldValue> getAnnotationType() {
                                            r1 = this;
                                            java.lang.Class<net.bytebuddy.asm.MemberSubstitution$FieldValue> r0 = net.bytebuddy.asm.MemberSubstitution.FieldValue.class
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.FieldValue> r4) {
                                            r2 = this;
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.access$200()
                                            net.bytebuddy.description.annotation.AnnotationValue r0 = r4.getValue(r0)
                                            java.lang.Class<net.bytebuddy.description.type.TypeDescription> r1 = net.bytebuddy.description.type.TypeDescription.class
                                            java.lang.Object r0 = r0.resolve(r1)
                                            net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                                            java.lang.Class r1 = java.lang.Void.TYPE
                                            boolean r1 = r0.represents(r1)
                                            if (r1 == 0) goto L26
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$WithImplicitType r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$WithImplicitType
                                            net.bytebuddy.description.type.TypeDescription r3 = r3.getDeclaringType()
                                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                                            r0.<init>(r3, r4)
                                            goto L34
                                        L26:
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$WithExplicitType r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$WithExplicitType
                                            net.bytebuddy.description.type.TypeDescription r3 = r3.getDeclaringType()
                                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                                            r1.<init>(r3, r4, r0)
                                            r0 = r1
                                        L34:
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.FieldValue> r4) {
                                            r2 = this;
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.access$200()
                                            net.bytebuddy.description.annotation.AnnotationValue r0 = r4.getValue(r0)
                                            java.lang.Class<net.bytebuddy.description.type.TypeDescription> r1 = net.bytebuddy.description.type.TypeDescription.class
                                            java.lang.Object r0 = r0.resolve(r1)
                                            net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                                            java.lang.Class r1 = java.lang.Void.TYPE
                                            boolean r1 = r0.represents(r1)
                                            if (r1 == 0) goto L22
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$WithImplicitType r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$WithImplicitType
                                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                                            r0.<init>(r3, r4)
                                            goto L2c
                                        L22:
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$WithExplicitType r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$WithExplicitType
                                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                                            r1.<init>(r3, r4, r0)
                                            r0 = r1
                                        L2c:
                                            return r0
                                    }
                                }

                                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                                public static class WithExplicitType extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved {
                                    private final net.bytebuddy.description.type.TypeDescription declaringType;

                                    public WithExplicitType(net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.FieldValue> r4, net.bytebuddy.description.type.TypeDescription r5) {
                                            r2 = this;
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.access$000()
                                            net.bytebuddy.description.annotation.AnnotationValue r0 = r4.getValue(r0)
                                            java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r1 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                            java.lang.Object r0 = r0.resolve(r1)
                                            net.bytebuddy.description.enumeration.EnumerationDescription r0 = (net.bytebuddy.description.enumeration.EnumerationDescription) r0
                                            java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Typing> r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.class
                                            java.lang.Enum r0 = r0.load(r1)
                                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing) r0
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.access$100()
                                            net.bytebuddy.description.annotation.AnnotationValue r4 = r4.getValue(r1)
                                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                            java.lang.Object r4 = r4.resolve(r1)
                                            java.lang.String r4 = (java.lang.String) r4
                                            r2.<init>(r3, r0, r4, r5)
                                            return
                                    }

                                    public WithExplicitType(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, java.lang.String r3, net.bytebuddy.description.type.TypeDescription r4) {
                                            r0 = this;
                                            r0.<init>(r1, r2, r3)
                                            r0.declaringType = r4
                                            return
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
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
                                            net.bytebuddy.description.type.TypeDescription r2 = r4.declaringType
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$WithExplicitType r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.WithExplicitType) r5
                                            net.bytebuddy.description.type.TypeDescription r5 = r5.declaringType
                                            boolean r5 = r2.equals(r5)
                                            if (r5 != 0) goto L27
                                            return r1
                                        L27:
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved
                                    public net.bytebuddy.dynamic.scaffold.FieldLocator fieldLocator(net.bytebuddy.description.type.TypeDescription r4) {
                                            r3 = this;
                                            net.bytebuddy.description.type.TypeDescription r0 = r3.declaringType
                                            java.lang.Class<net.bytebuddy.dynamic.TargetType> r1 = net.bytebuddy.dynamic.TargetType.class
                                            boolean r0 = r0.represents(r1)
                                            if (r0 != 0) goto L2f
                                            net.bytebuddy.description.type.TypeDescription r0 = r3.declaringType
                                            boolean r0 = r4.isAssignableTo(r0)
                                            if (r0 == 0) goto L13
                                            goto L2f
                                        L13:
                                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                            r1.<init>()
                                            net.bytebuddy.description.type.TypeDescription r2 = r3.declaringType
                                            r1.append(r2)
                                            java.lang.String r2 = " is no super type of "
                                            r1.append(r2)
                                            r1.append(r4)
                                            java.lang.String r4 = r1.toString()
                                            r0.<init>(r4)
                                            throw r0
                                        L2f:
                                            net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType
                                            net.bytebuddy.description.type.TypeDescription r1 = r3.declaringType
                                            net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.dynamic.TargetType.resolve(r1, r4)
                                            r0.<init>(r4)
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                    public int hashCode() {
                                            r2 = this;
                                            int r0 = super.hashCode()
                                            int r0 = r0 * 31
                                            net.bytebuddy.description.type.TypeDescription r1 = r2.declaringType
                                            int r1 = r1.hashCode()
                                            int r0 = r0 + r1
                                            return r0
                                    }
                                }

                                public static class WithImplicitType extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved {
                                    public WithImplicitType(net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.FieldValue> r4) {
                                            r2 = this;
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.access$000()
                                            net.bytebuddy.description.annotation.AnnotationValue r0 = r4.getValue(r0)
                                            java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r1 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                            java.lang.Object r0 = r0.resolve(r1)
                                            net.bytebuddy.description.enumeration.EnumerationDescription r0 = (net.bytebuddy.description.enumeration.EnumerationDescription) r0
                                            java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Typing> r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.class
                                            java.lang.Enum r0 = r0.load(r1)
                                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing) r0
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.access$100()
                                            net.bytebuddy.description.annotation.AnnotationValue r4 = r4.getValue(r1)
                                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                            java.lang.Object r4 = r4.resolve(r1)
                                            java.lang.String r4 = (java.lang.String) r4
                                            r2.<init>(r3, r0, r4)
                                            return
                                    }

                                    public WithImplicitType(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, java.lang.String r3) {
                                            r0 = this;
                                            r0.<init>(r1, r2, r3)
                                            return
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved
                                    public net.bytebuddy.dynamic.scaffold.FieldLocator fieldLocator(net.bytebuddy.description.type.TypeDescription r2) {
                                            r1 = this;
                                            net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy
                                            r0.<init>(r2)
                                            return r0
                                    }
                                }

                                public Unresolved(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, java.lang.String r3) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        r0.name = r3
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
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
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved) r5
                                        java.lang.String r5 = r5.name
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L27
                                        return r1
                                    L27:
                                        return r0
                                }

                                public abstract net.bytebuddy.dynamic.scaffold.FieldLocator fieldLocator(net.bytebuddy.description.type.TypeDescription r1);

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                public int hashCode() {
                                        r2 = this;
                                        int r0 = super.hashCode()
                                        int r0 = r0 * 31
                                        java.lang.String r1 = r2.name
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField
                                public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.method.MethodDescription r5) {
                                        r3 = this;
                                        net.bytebuddy.dynamic.scaffold.FieldLocator r0 = r3.fieldLocator(r4)
                                        java.lang.String r1 = r3.name
                                        java.lang.String r2 = ""
                                        boolean r1 = r1.equals(r2)
                                        if (r1 == 0) goto L13
                                        net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r5 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Simple.ofBeanAccessor(r0, r5)
                                        goto L19
                                    L13:
                                        java.lang.String r5 = r3.name
                                        net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r5 = r0.locate(r5)
                                    L19:
                                        boolean r0 = r5.isResolved()
                                        if (r0 == 0) goto L24
                                        net.bytebuddy.description.field.FieldDescription r4 = r5.getField()
                                        return r4
                                    L24:
                                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Cannot locate field named "
                                        r0.append(r1)
                                        java.lang.String r1 = r3.name
                                        r0.append(r1)
                                        java.lang.String r1 = " for "
                                        r0.append(r1)
                                        r0.append(r4)
                                        java.lang.String r4 = r0.toString()
                                        r5.<init>(r4)
                                        throw r5
                                }
                            }

                            static {
                                    java.lang.Class<net.bytebuddy.asm.MemberSubstitution$FieldValue> r0 = net.bytebuddy.asm.MemberSubstitution.FieldValue.class
                                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                                    net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                                    java.lang.String r1 = "value"
                                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                    net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                    net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                    java.lang.Object r1 = r1.getOnly()
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                    net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.FIELD_VALUE_VALUE = r1
                                    java.lang.String r1 = "declaringType"
                                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                    net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                    net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                    java.lang.Object r1 = r1.getOnly()
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                    net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.FIELD_VALUE_DECLARING_TYPE = r1
                                    java.lang.String r1 = "typing"
                                    net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                    net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                                    net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                                    java.lang.Object r0 = r0.getOnly()
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                                    net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.FIELD_VALUE_TYPING = r0
                                    return
                            }

                            public ForField(net.bytebuddy.description.type.TypeDescription.Generic r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.target = r1
                                    r0.typing = r2
                                    return
                            }

                            public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$000() {
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.FIELD_VALUE_TYPING
                                    return r0
                            }

                            public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$100() {
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.FIELD_VALUE_VALUE
                                    return r0
                            }

                            public static /* synthetic */ net.bytebuddy.description.method.MethodDescription.InDefinedShape access$200() {
                                    net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.FIELD_VALUE_DECLARING_TYPE
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
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField) r5
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                    if (r3 == 0) goto L24
                                    if (r2 == 0) goto L26
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L27
                                    return r1
                                L24:
                                    if (r2 == 0) goto L27
                                L26:
                                    return r1
                                L27:
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.target
                                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.target
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
                                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.target
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                                    if (r1 == 0) goto L1c
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                L1c:
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r4, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r5, net.bytebuddy.description.type.TypeDescription r6, net.bytebuddy.description.method.MethodDescription r7) {
                                    r3 = this;
                                    net.bytebuddy.description.field.FieldDescription r6 = r3.resolve(r6, r7)
                                    boolean r0 = r6.isStatic()
                                    if (r0 != 0) goto L30
                                    boolean r0 = r7.isStatic()
                                    if (r0 != 0) goto L11
                                    goto L30
                                L11:
                                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                                    r5.<init>()
                                    java.lang.String r0 = "Cannot access non-static field "
                                    r5.append(r0)
                                    r5.append(r6)
                                    java.lang.String r6 = " from static method "
                                    r5.append(r6)
                                    r5.append(r7)
                                    java.lang.String r5 = r5.toString()
                                    r4.<init>(r5)
                                    throw r4
                                L30:
                                    net.bytebuddy.description.type.TypeDescription$Generic r7 = r6.getType()
                                    net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.target
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r3.typing
                                    if (r1 != 0) goto L3b
                                    goto L3c
                                L3b:
                                    r5 = r1
                                L3c:
                                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.assign(r7, r0, r5)
                                    boolean r5 = r4.isValid()
                                    if (r5 == 0) goto L72
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved$ForStackManipulation r5 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved$ForStackManipulation
                                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r7 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                    boolean r0 = r6.isStatic()
                                    if (r0 == 0) goto L53
                                    net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                                    goto L57
                                L53:
                                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.loadThis()
                                L57:
                                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r6 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r6)
                                    net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.read()
                                    r1 = 3
                                    net.bytebuddy.implementation.bytecode.StackManipulation[] r1 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                                    r2 = 0
                                    r1[r2] = r0
                                    r0 = 1
                                    r1[r0] = r6
                                    r6 = 2
                                    r1[r6] = r4
                                    r7.<init>(r1)
                                    r5.<init>(r7)
                                    return r5
                                L72:
                                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                                    r5.<init>()
                                    java.lang.String r7 = "Cannot assign "
                                    r5.append(r7)
                                    r5.append(r6)
                                    java.lang.String r6 = " to "
                                    r5.append(r6)
                                    net.bytebuddy.description.type.TypeDescription$Generic r6 = r3.target
                                    r5.append(r6)
                                    java.lang.String r5 = r5.toString()
                                    r4.<init>(r5)
                                    throw r4
                            }

                            public abstract net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2);
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static abstract class ForFieldHandle implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping {
                            private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access access;

                            public enum Access extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access> {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access[] $VALUES = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access GETTER = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access SETTER = null;



                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access$1 r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access$1
                                        java.lang.String r1 = "GETTER"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.GETTER = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access$2 r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access$2
                                        java.lang.String r3 = "SETTER"
                                        r4 = 1
                                        r1.<init>(r3, r4)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.SETTER = r1
                                        r3 = 2
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access[] r3 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access[r3]
                                        r3[r2] = r0
                                        r3[r4] = r1
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.$VALUES = r3
                                        return
                                }

                                Access(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                /* synthetic */ Access(java.lang.String r1, int r2, net.bytebuddy.asm.MemberSubstitution.AnonymousClass1 r3) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access[]) r0
                                        return r0
                                }

                                public abstract net.bytebuddy.utility.JavaConstant.MethodHandle resolve(net.bytebuddy.description.field.FieldDescription.InDefinedShape r1);
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle {
                                private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                                public static class Factory<T extends java.lang.annotation.Annotation> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<T> {
                                    private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access access;
                                    private final java.lang.Class<T> annotationType;
                                    private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                                    public Factory(java.lang.Class<T> r1, net.bytebuddy.description.field.FieldDescription r2, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access r3) {
                                            r0 = this;
                                            r0.<init>()
                                            r0.annotationType = r1
                                            r0.fieldDescription = r2
                                            r0.access = r3
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
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r2 = r4.access
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Resolved$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Resolved.Factory) r5
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r3 = r5.access
                                            boolean r2 = r2.equals(r3)
                                            if (r2 != 0) goto L20
                                            return r1
                                        L20:
                                            java.lang.Class<T extends java.lang.annotation.Annotation> r2 = r4.annotationType
                                            java.lang.Class<T extends java.lang.annotation.Annotation> r3 = r5.annotationType
                                            boolean r2 = r2.equals(r3)
                                            if (r2 != 0) goto L2b
                                            return r1
                                        L2b:
                                            net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                                            net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
                                            boolean r5 = r2.equals(r5)
                                            if (r5 != 0) goto L36
                                            return r1
                                        L36:
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public java.lang.Class<T> getAnnotationType() {
                                            r1 = this;
                                            java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r1.annotationType
                                            return r0
                                    }

                                    public int hashCode() {
                                            r2 = this;
                                            java.lang.Class r0 = r2.getClass()
                                            int r0 = r0.hashCode()
                                            int r0 = r0 * 31
                                            java.lang.Class<T extends java.lang.annotation.Annotation> r1 = r2.annotationType
                                            int r1 = r1.hashCode()
                                            int r0 = r0 + r1
                                            int r0 = r0 * 31
                                            net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                            int r1 = r1.hashCode()
                                            int r0 = r0 + r1
                                            int r0 = r0 * 31
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r1 = r2.access
                                            int r1 = r1.hashCode()
                                            int r0 = r0 + r1
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r2) {
                                            r0 = this;
                                            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                                            java.lang.String r2 = "This factory does not support binding a method receiver"
                                            r1.<init>(r2)
                                            throw r1
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r4) {
                                            r2 = this;
                                            net.bytebuddy.description.type.TypeDescription$Generic r4 = r3.getType()
                                            net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                                            net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                                            net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                                            boolean r4 = r4.isAssignableFrom(r0)
                                            if (r4 == 0) goto L1e
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Resolved r3 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Resolved
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r4 = r2.access
                                            net.bytebuddy.description.field.FieldDescription r0 = r2.fieldDescription
                                            r3.<init>(r4, r0)
                                            return r3
                                        L1e:
                                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                            r0.<init>()
                                            java.lang.String r1 = "Cannot assign method handle to "
                                            r0.append(r1)
                                            r0.append(r3)
                                            java.lang.String r3 = r0.toString()
                                            r4.<init>(r3)
                                            throw r4
                                    }
                                }

                                public Resolved(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access r1, net.bytebuddy.description.field.FieldDescription r2) {
                                        r0 = this;
                                        r0.<init>(r1)
                                        r0.fieldDescription = r2
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
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
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Resolved) r5
                                        net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L27
                                        return r1
                                    L27:
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                public int hashCode() {
                                        r2 = this;
                                        int r0 = super.hashCode()
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                                public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                                        r2 = this;
                                        net.bytebuddy.description.field.FieldDescription r4 = r2.fieldDescription
                                        boolean r4 = r4.isStatic()
                                        if (r4 != 0) goto L35
                                        net.bytebuddy.description.field.FieldDescription r4 = r2.fieldDescription
                                        net.bytebuddy.description.type.TypeDefinition r4 = r4.getDeclaringType()
                                        net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                                        boolean r4 = r4.isAssignableFrom(r3)
                                        if (r4 == 0) goto L19
                                        goto L35
                                    L19:
                                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                        r0.append(r1)
                                        java.lang.String r1 = " is no member of "
                                        r0.append(r1)
                                        r0.append(r3)
                                        java.lang.String r3 = r0.toString()
                                        r4.<init>(r3)
                                        throw r4
                                    L35:
                                        net.bytebuddy.description.field.FieldDescription r4 = r2.fieldDescription
                                        boolean r4 = r4.isVisibleTo(r3)
                                        if (r4 == 0) goto L40
                                        net.bytebuddy.description.field.FieldDescription r3 = r2.fieldDescription
                                        return r3
                                    L40:
                                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Cannot access "
                                        r0.append(r1)
                                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                        r0.append(r1)
                                        java.lang.String r1 = " from "
                                        r0.append(r1)
                                        r0.append(r3)
                                        java.lang.String r3 = r0.toString()
                                        r4.<init>(r3)
                                        throw r4
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static abstract class Unresolved extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle {
                                protected static final java.lang.String BEAN_PROPERTY = "";
                                private final java.lang.String name;

                                public enum GetterFactory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<net.bytebuddy.asm.MemberSubstitution.FieldGetterHandle> {
                                    private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory[] $VALUES = null;
                                    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FIELD_GETTER_HANDLE_DECLARING_TYPE = null;
                                    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FIELD_GETTER_HANDLE_VALUE = null;
                                    public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory INSTANCE = null;

                                    static {
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$GetterFactory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$GetterFactory
                                            java.lang.String r1 = "INSTANCE"
                                            r2 = 0
                                            r0.<init>(r1, r2)
                                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.INSTANCE = r0
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$GetterFactory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory[]{r0}
                                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.$VALUES = r0
                                            java.lang.Class<net.bytebuddy.asm.MemberSubstitution$FieldGetterHandle> r0 = net.bytebuddy.asm.MemberSubstitution.FieldGetterHandle.class
                                            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                                            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                                            java.lang.String r1 = "value"
                                            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                            net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                            java.lang.Object r1 = r1.getOnly()
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.FIELD_GETTER_HANDLE_VALUE = r1
                                            java.lang.String r1 = "declaringType"
                                            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                                            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                                            java.lang.Object r0 = r0.getOnly()
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.FIELD_GETTER_HANDLE_DECLARING_TYPE = r0
                                            return
                                    }

                                    GetterFactory(java.lang.String r1, int r2) {
                                            r0 = this;
                                            r0.<init>(r1, r2)
                                            return
                                    }

                                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory valueOf(java.lang.String r1) {
                                            java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$GetterFactory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.class
                                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$GetterFactory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory) r1
                                            return r1
                                    }

                                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory[] values() {
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$GetterFactory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.$VALUES
                                            java.lang.Object r0 = r0.clone()
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$GetterFactory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory[]) r0
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public java.lang.Class<net.bytebuddy.asm.MemberSubstitution.FieldGetterHandle> getAnnotationType() {
                                            r1 = this;
                                            java.lang.Class<net.bytebuddy.asm.MemberSubstitution$FieldGetterHandle> r0 = net.bytebuddy.asm.MemberSubstitution.FieldGetterHandle.class
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.FieldGetterHandle> r2) {
                                            r0 = this;
                                            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                                            java.lang.String r2 = "This factory does not support binding a method receiver"
                                            r1.<init>(r2)
                                            throw r1
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r5, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.FieldGetterHandle> r6) {
                                            r4 = this;
                                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getType()
                                            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                            net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                                            net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                                            boolean r0 = r0.isAssignableFrom(r1)
                                            if (r0 == 0) goto L55
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.FIELD_GETTER_HANDLE_DECLARING_TYPE
                                            net.bytebuddy.description.annotation.AnnotationValue r5 = r6.getValue(r5)
                                            java.lang.Class<net.bytebuddy.description.type.TypeDescription> r0 = net.bytebuddy.description.type.TypeDescription.class
                                            java.lang.Object r5 = r5.resolve(r0)
                                            net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                                            java.lang.Class r0 = java.lang.Void.TYPE
                                            boolean r0 = r5.represents(r0)
                                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                            if (r0 == 0) goto L40
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$WithImplicitType r5 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$WithImplicitType
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.GETTER
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.FIELD_GETTER_HANDLE_VALUE
                                            net.bytebuddy.description.annotation.AnnotationValue r6 = r6.getValue(r2)
                                            java.lang.Object r6 = r6.resolve(r1)
                                            java.lang.String r6 = (java.lang.String) r6
                                            r5.<init>(r0, r6)
                                            goto L54
                                        L40:
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r2 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.GETTER
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.FIELD_GETTER_HANDLE_VALUE
                                            net.bytebuddy.description.annotation.AnnotationValue r6 = r6.getValue(r3)
                                            java.lang.Object r6 = r6.resolve(r1)
                                            java.lang.String r6 = (java.lang.String) r6
                                            r0.<init>(r2, r6, r5)
                                            r5 = r0
                                        L54:
                                            return r5
                                        L55:
                                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                            r0.<init>()
                                            java.lang.String r1 = "Cannot assign method handle to "
                                            r0.append(r1)
                                            r0.append(r5)
                                            java.lang.String r5 = r0.toString()
                                            r6.<init>(r5)
                                            throw r6
                                    }
                                }

                                public enum SetterFactory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<net.bytebuddy.asm.MemberSubstitution.FieldSetterHandle> {
                                    private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory[] $VALUES = null;
                                    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FIELD_SETTER_HANDLE_DECLARING_TYPE = null;
                                    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape FIELD_SETTER_HANDLE_VALUE = null;
                                    public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory INSTANCE = null;

                                    static {
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$SetterFactory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$SetterFactory
                                            java.lang.String r1 = "INSTANCE"
                                            r2 = 0
                                            r0.<init>(r1, r2)
                                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.INSTANCE = r0
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$SetterFactory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory[]{r0}
                                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.$VALUES = r0
                                            java.lang.Class<net.bytebuddy.asm.MemberSubstitution$FieldSetterHandle> r0 = net.bytebuddy.asm.MemberSubstitution.FieldSetterHandle.class
                                            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                                            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                                            java.lang.String r1 = "value"
                                            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                            net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                            net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                            java.lang.Object r1 = r1.getOnly()
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.FIELD_SETTER_HANDLE_VALUE = r1
                                            java.lang.String r1 = "declaringType"
                                            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                                            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                                            java.lang.Object r0 = r0.getOnly()
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.FIELD_SETTER_HANDLE_DECLARING_TYPE = r0
                                            return
                                    }

                                    SetterFactory(java.lang.String r1, int r2) {
                                            r0 = this;
                                            r0.<init>(r1, r2)
                                            return
                                    }

                                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory valueOf(java.lang.String r1) {
                                            java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$SetterFactory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.class
                                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$SetterFactory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory) r1
                                            return r1
                                    }

                                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory[] values() {
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$SetterFactory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.$VALUES
                                            java.lang.Object r0 = r0.clone()
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$SetterFactory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory[]) r0
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public java.lang.Class<net.bytebuddy.asm.MemberSubstitution.FieldSetterHandle> getAnnotationType() {
                                            r1 = this;
                                            java.lang.Class<net.bytebuddy.asm.MemberSubstitution$FieldSetterHandle> r0 = net.bytebuddy.asm.MemberSubstitution.FieldSetterHandle.class
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.FieldSetterHandle> r2) {
                                            r0 = this;
                                            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                                            java.lang.String r2 = "This factory does not support binding a method receiver"
                                            r1.<init>(r2)
                                            throw r1
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r5, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.FieldSetterHandle> r6) {
                                            r4 = this;
                                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r5.getType()
                                            net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                            net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                                            net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                                            boolean r0 = r0.isAssignableFrom(r1)
                                            if (r0 == 0) goto L55
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.FIELD_SETTER_HANDLE_DECLARING_TYPE
                                            net.bytebuddy.description.annotation.AnnotationValue r5 = r6.getValue(r5)
                                            java.lang.Class<net.bytebuddy.description.type.TypeDescription> r0 = net.bytebuddy.description.type.TypeDescription.class
                                            java.lang.Object r5 = r5.resolve(r0)
                                            net.bytebuddy.description.type.TypeDescription r5 = (net.bytebuddy.description.type.TypeDescription) r5
                                            java.lang.Class r0 = java.lang.Void.TYPE
                                            boolean r0 = r5.represents(r0)
                                            java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                            if (r0 == 0) goto L40
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$WithImplicitType r5 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$WithImplicitType
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.SETTER
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.FIELD_SETTER_HANDLE_VALUE
                                            net.bytebuddy.description.annotation.AnnotationValue r6 = r6.getValue(r2)
                                            java.lang.Object r6 = r6.resolve(r1)
                                            java.lang.String r6 = (java.lang.String) r6
                                            r5.<init>(r0, r6)
                                            goto L54
                                        L40:
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r2 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access.SETTER
                                            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.FIELD_SETTER_HANDLE_VALUE
                                            net.bytebuddy.description.annotation.AnnotationValue r6 = r6.getValue(r3)
                                            java.lang.Object r6 = r6.resolve(r1)
                                            java.lang.String r6 = (java.lang.String) r6
                                            r0.<init>(r2, r6, r5)
                                            r5 = r0
                                        L54:
                                            return r5
                                        L55:
                                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                            java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                            r0.<init>()
                                            java.lang.String r1 = "Cannot assign method handle to "
                                            r0.append(r1)
                                            r0.append(r5)
                                            java.lang.String r5 = r0.toString()
                                            r6.<init>(r5)
                                            throw r6
                                    }
                                }

                                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                                public static class WithExplicitType extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved {
                                    private final net.bytebuddy.description.type.TypeDescription declaringType;

                                    public WithExplicitType(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access r1, java.lang.String r2, net.bytebuddy.description.type.TypeDescription r3) {
                                            r0 = this;
                                            r0.<init>(r1, r2)
                                            r0.declaringType = r3
                                            return
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
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
                                            net.bytebuddy.description.type.TypeDescription r2 = r4.declaringType
                                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$WithExplicitType r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.WithExplicitType) r5
                                            net.bytebuddy.description.type.TypeDescription r5 = r5.declaringType
                                            boolean r5 = r2.equals(r5)
                                            if (r5 != 0) goto L27
                                            return r1
                                        L27:
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved
                                    public net.bytebuddy.dynamic.scaffold.FieldLocator fieldLocator(net.bytebuddy.description.type.TypeDescription r4) {
                                            r3 = this;
                                            net.bytebuddy.description.type.TypeDescription r0 = r3.declaringType
                                            java.lang.Class<net.bytebuddy.dynamic.TargetType> r1 = net.bytebuddy.dynamic.TargetType.class
                                            boolean r0 = r0.represents(r1)
                                            if (r0 != 0) goto L2f
                                            net.bytebuddy.description.type.TypeDescription r0 = r3.declaringType
                                            boolean r0 = r4.isAssignableTo(r0)
                                            if (r0 == 0) goto L13
                                            goto L2f
                                        L13:
                                            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                            r1.<init>()
                                            net.bytebuddy.description.type.TypeDescription r2 = r3.declaringType
                                            r1.append(r2)
                                            java.lang.String r2 = " is no super type of "
                                            r1.append(r2)
                                            r1.append(r4)
                                            java.lang.String r4 = r1.toString()
                                            r0.<init>(r4)
                                            throw r0
                                        L2f:
                                            net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForExactType
                                            net.bytebuddy.description.type.TypeDescription r1 = r3.declaringType
                                            net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.dynamic.TargetType.resolve(r1, r4)
                                            r0.<init>(r4)
                                            return r0
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                    public int hashCode() {
                                            r2 = this;
                                            int r0 = super.hashCode()
                                            int r0 = r0 * 31
                                            net.bytebuddy.description.type.TypeDescription r1 = r2.declaringType
                                            int r1 = r1.hashCode()
                                            int r0 = r0 + r1
                                            return r0
                                    }
                                }

                                public static class WithImplicitType extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved {
                                    public WithImplicitType(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access r1, java.lang.String r2) {
                                            r0 = this;
                                            r0.<init>(r1, r2)
                                            return
                                    }

                                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved
                                    public net.bytebuddy.dynamic.scaffold.FieldLocator fieldLocator(net.bytebuddy.description.type.TypeDescription r2) {
                                            r1 = this;
                                            net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy r0 = new net.bytebuddy.dynamic.scaffold.FieldLocator$ForClassHierarchy
                                            r0.<init>(r2)
                                            return r0
                                    }
                                }

                                public Unresolved(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access r1, java.lang.String r2) {
                                        r0 = this;
                                        r0.<init>(r1)
                                        r0.name = r2
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
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
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved) r5
                                        java.lang.String r5 = r5.name
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L27
                                        return r1
                                    L27:
                                        return r0
                                }

                                public abstract net.bytebuddy.dynamic.scaffold.FieldLocator fieldLocator(net.bytebuddy.description.type.TypeDescription r1);

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                public int hashCode() {
                                        r2 = this;
                                        int r0 = super.hashCode()
                                        int r0 = r0 * 31
                                        java.lang.String r1 = r2.name
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle
                                public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.method.MethodDescription r5) {
                                        r3 = this;
                                        net.bytebuddy.dynamic.scaffold.FieldLocator r0 = r3.fieldLocator(r4)
                                        java.lang.String r1 = r3.name
                                        java.lang.String r2 = ""
                                        boolean r1 = r1.equals(r2)
                                        if (r1 == 0) goto L13
                                        net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r5 = net.bytebuddy.dynamic.scaffold.FieldLocator.Resolution.Simple.ofBeanAccessor(r0, r5)
                                        goto L19
                                    L13:
                                        java.lang.String r5 = r3.name
                                        net.bytebuddy.dynamic.scaffold.FieldLocator$Resolution r5 = r0.locate(r5)
                                    L19:
                                        boolean r0 = r5.isResolved()
                                        if (r0 == 0) goto L24
                                        net.bytebuddy.description.field.FieldDescription r4 = r5.getField()
                                        return r4
                                    L24:
                                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Cannot locate field named "
                                        r0.append(r1)
                                        java.lang.String r1 = r3.name
                                        r0.append(r1)
                                        java.lang.String r1 = " for "
                                        r0.append(r1)
                                        r0.append(r4)
                                        java.lang.String r4 = r0.toString()
                                        r5.<init>(r4)
                                        throw r5
                                }
                            }

                            public ForFieldHandle(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Access r1) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.access = r1
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
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r2 = r4.access
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle) r5
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r5 = r5.access
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
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r1 = r2.access
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r10, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r11, net.bytebuddy.description.type.TypeDescription r12, net.bytebuddy.description.method.MethodDescription r13) {
                                    r9 = this;
                                    r10 = 1
                                    r11 = 0
                                    net.bytebuddy.description.field.FieldDescription r12 = r9.resolve(r12, r13)
                                    boolean r0 = r12.isStatic()
                                    if (r0 != 0) goto L32
                                    boolean r0 = r13.isStatic()
                                    if (r0 != 0) goto L13
                                    goto L32
                                L13:
                                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                                    java.lang.StringBuilder r11 = new java.lang.StringBuilder
                                    r11.<init>()
                                    java.lang.String r0 = "Cannot access non-static field "
                                    r11.append(r0)
                                    r11.append(r12)
                                    java.lang.String r12 = " from static method "
                                    r11.append(r12)
                                    r11.append(r13)
                                    java.lang.String r11 = r11.toString()
                                    r10.<init>(r11)
                                    throw r10
                                L32:
                                    boolean r13 = r12.isStatic()
                                    if (r13 == 0) goto L4e
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved$ForStackManipulation r10 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved$ForStackManipulation
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r11 = r9.access
                                    net.bytebuddy.description.ByteCodeElement$TypeDependant r12 = r12.asDefined()
                                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r12 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r12
                                    net.bytebuddy.utility.JavaConstant$MethodHandle r11 = r11.resolve(r12)
                                    net.bytebuddy.implementation.bytecode.StackManipulation r11 = r11.toStackManipulation()
                                    r10.<init>(r11)
                                    return r10
                                L4e:
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved$ForStackManipulation r13 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved$ForStackManipulation
                                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Access r1 = r9.access
                                    net.bytebuddy.description.ByteCodeElement$TypeDependant r12 = r12.asDefined()
                                    net.bytebuddy.description.field.FieldDescription$InDefinedShape r12 = (net.bytebuddy.description.field.FieldDescription.InDefinedShape) r12
                                    net.bytebuddy.utility.JavaConstant$MethodHandle r12 = r1.resolve(r12)
                                    net.bytebuddy.implementation.bytecode.StackManipulation r12 = r12.toStackManipulation()
                                    net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r1 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.REFERENCE
                                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.loadFrom(r11)
                                    net.bytebuddy.description.method.MethodDescription$Latent r2 = new net.bytebuddy.description.method.MethodDescription$Latent
                                    net.bytebuddy.utility.JavaType r3 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                                    net.bytebuddy.description.type.TypeDescription r4 = r3.getTypeStub()
                                    net.bytebuddy.description.method.MethodDescription$Token r5 = new net.bytebuddy.description.method.MethodDescription$Token
                                    net.bytebuddy.description.type.TypeDescription r3 = r3.getTypeStub()
                                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                                    net.bytebuddy.description.type.TypeList$Generic$Explicit r6 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                                    java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                                    net.bytebuddy.description.type.TypeDescription$Generic r7 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r7)
                                    net.bytebuddy.description.type.TypeDefinition[] r8 = new net.bytebuddy.description.type.TypeDefinition[r10]
                                    r8[r11] = r7
                                    r6.<init>(r8)
                                    java.lang.String r7 = "bindTo"
                                    r5.<init>(r7, r10, r3, r6)
                                    r2.<init>(r4, r5)
                                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                                    r3 = 3
                                    net.bytebuddy.implementation.bytecode.StackManipulation[] r3 = new net.bytebuddy.implementation.bytecode.StackManipulation[r3]
                                    r3[r11] = r12
                                    r3[r10] = r1
                                    r10 = 2
                                    r3[r10] = r2
                                    r0.<init>(r3)
                                    r13.<init>(r0)
                                    return r13
                            }

                            public abstract net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2);
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForOrigin implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping {
                            private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort sort;
                            private final net.bytebuddy.asm.MemberSubstitution.Source source;

                            public enum Factory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<net.bytebuddy.asm.MemberSubstitution.Origin> {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory[] $VALUES = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory INSTANCE = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ORIGIN_TYPE = null;

                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Factory
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory.INSTANCE = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Factory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory[]{r0}
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory.$VALUES = r0
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Origin> r0 = net.bytebuddy.asm.MemberSubstitution.Origin.class
                                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                                        net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                                        java.lang.String r1 = "source"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                                        java.lang.Object r0 = r0.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory.ORIGIN_TYPE = r0
                                        return
                                }

                                Factory(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Factory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Factory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Factory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<net.bytebuddy.asm.MemberSubstitution.Origin> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Origin> r0 = net.bytebuddy.asm.MemberSubstitution.Origin.class
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.Origin> r2) {
                                        r0 = this;
                                        java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                                        java.lang.String r2 = "This factory does not support binding a method receiver"
                                        r1.<init>(r2)
                                        throw r1
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.Origin> r4) {
                                        r2 = this;
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                        java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
                                        boolean r0 = r0.represents(r1)
                                        if (r0 == 0) goto L14
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.TYPE
                                        goto Lbd
                                    L14:
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                        java.lang.Class<java.lang.reflect.Method> r1 = java.lang.reflect.Method.class
                                        boolean r0 = r0.represents(r1)
                                        if (r0 == 0) goto L28
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.METHOD
                                        goto Lbd
                                    L28:
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                        java.lang.Class<java.lang.reflect.Constructor> r1 = java.lang.reflect.Constructor.class
                                        boolean r0 = r0.represents(r1)
                                        if (r0 == 0) goto L3c
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.CONSTRUCTOR
                                        goto Lbd
                                    L3c:
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                        java.lang.Class<java.lang.reflect.Field> r1 = java.lang.reflect.Field.class
                                        boolean r0 = r0.represents(r1)
                                        if (r0 == 0) goto L4f
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.FIELD
                                        goto Lbd
                                    L4f:
                                        net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.EXECUTABLE
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                                        boolean r0 = r0.equals(r1)
                                        if (r0 == 0) goto L66
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.EXECUTABLE
                                        goto Lbd
                                    L66:
                                        net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                                        boolean r0 = r0.equals(r1)
                                        if (r0 == 0) goto L7d
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.METHOD_HANDLE
                                        goto Lbd
                                    L7d:
                                        net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_TYPE
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                                        boolean r0 = r0.equals(r1)
                                        if (r0 == 0) goto L94
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.METHOD_TYPE
                                        goto Lbd
                                    L94:
                                        net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                                        boolean r0 = r0.equals(r1)
                                        if (r0 == 0) goto Lab
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.LOOKUP
                                        goto Lbd
                                    Lab:
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                        java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                        boolean r0 = r0.isAssignableFrom(r1)
                                        if (r0 == 0) goto Ld9
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.STRING
                                    Lbd:
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory.ORIGIN_TYPE
                                        net.bytebuddy.description.annotation.AnnotationValue r4 = r4.getValue(r1)
                                        java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r1 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                        java.lang.Object r4 = r4.resolve(r1)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r4 = (net.bytebuddy.description.enumeration.EnumerationDescription) r4
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Source> r1 = net.bytebuddy.asm.MemberSubstitution.Source.class
                                        java.lang.Enum r4 = r4.load(r1)
                                        net.bytebuddy.asm.MemberSubstitution$Source r4 = (net.bytebuddy.asm.MemberSubstitution.Source) r4
                                        r0.<init>(r3, r4)
                                        return r0
                                    Ld9:
                                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Non-supported type "
                                        r0.append(r1)
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                                        r0.append(r3)
                                        java.lang.String r3 = " for @Origin annotation"
                                        r0.append(r3)
                                        java.lang.String r3 = r0.toString()
                                        r4.<init>(r3)
                                        throw r4
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved {
                                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                                private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort sort;
                                private final net.bytebuddy.asm.MemberSubstitution.Source source;

                                public Resolved(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort r1, net.bytebuddy.asm.MemberSubstitution.Source r2, net.bytebuddy.description.method.MethodDescription r3) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.sort = r1
                                        r0.source = r2
                                        r0.instrumentedMethod = r3
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r7, net.bytebuddy.description.ByteCodeElement.Member r8, net.bytebuddy.description.type.TypeList.Generic r9, net.bytebuddy.description.type.TypeDescription.Generic r10, net.bytebuddy.description.type.TypeDescription.Generic r11, net.bytebuddy.utility.JavaConstant.MethodHandle r12, java.util.Map<java.lang.Integer, java.lang.Integer> r13, int r14) {
                                        r6 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Source r7 = r6.source
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r11 = r6.sort
                                        net.bytebuddy.description.method.MethodDescription r12 = r6.instrumentedMethod
                                        boolean r7 = r7.isRepresentable(r11, r8, r12)
                                        if (r7 == 0) goto L1a
                                        net.bytebuddy.asm.MemberSubstitution$Source r0 = r6.source
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r1 = r6.sort
                                        net.bytebuddy.description.method.MethodDescription r5 = r6.instrumentedMethod
                                        r2 = r8
                                        r3 = r9
                                        r4 = r10
                                        net.bytebuddy.implementation.bytecode.StackManipulation r7 = r0.resolve(r1, r2, r3, r4, r5)
                                        return r7
                                    L1a:
                                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                                        r8.<init>()
                                        java.lang.String r9 = "Cannot represent "
                                        r8.append(r9)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r9 = r6.sort
                                        r8.append(r9)
                                        java.lang.String r9 = " for "
                                        r8.append(r9)
                                        net.bytebuddy.asm.MemberSubstitution$Source r9 = r6.source
                                        r8.append(r9)
                                        java.lang.String r9 = " in "
                                        r8.append(r9)
                                        net.bytebuddy.description.method.MethodDescription r9 = r6.instrumentedMethod
                                        r8.append(r9)
                                        java.lang.String r8 = r8.toString()
                                        r7.<init>(r8)
                                        throw r7
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
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r2 = r4.sort
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Resolved) r5
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = r5.sort
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                        net.bytebuddy.asm.MemberSubstitution$Source r3 = r5.source
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L2b
                                        return r1
                                    L2b:
                                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                                        net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
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
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r1 = r2.sort
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            public enum Sort extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort> {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort[] $VALUES = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort CONSTRUCTOR = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort EXECUTABLE = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort FIELD = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort LOOKUP = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort METHOD = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort METHOD_HANDLE = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort METHOD_TYPE = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort STRING = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort TYPE = null;










                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$1 r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$1
                                        java.lang.String r1 = "METHOD"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.METHOD = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$2 r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$2
                                        java.lang.String r3 = "CONSTRUCTOR"
                                        r4 = 1
                                        r1.<init>(r3, r4)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.CONSTRUCTOR = r1
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$3 r3 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$3
                                        java.lang.String r5 = "FIELD"
                                        r6 = 2
                                        r3.<init>(r5, r6)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.FIELD = r3
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$4 r5 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$4
                                        java.lang.String r7 = "EXECUTABLE"
                                        r8 = 3
                                        r5.<init>(r7, r8)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.EXECUTABLE = r5
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$5 r7 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$5
                                        java.lang.String r9 = "TYPE"
                                        r10 = 4
                                        r7.<init>(r9, r10)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.TYPE = r7
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$6 r9 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$6
                                        java.lang.String r11 = "LOOKUP"
                                        r12 = 5
                                        r9.<init>(r11, r12)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.LOOKUP = r9
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$7 r11 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$7
                                        java.lang.String r13 = "METHOD_HANDLE"
                                        r14 = 6
                                        r11.<init>(r13, r14)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.METHOD_HANDLE = r11
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$8 r13 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$8
                                        java.lang.String r15 = "METHOD_TYPE"
                                        r14 = 7
                                        r13.<init>(r15, r14)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.METHOD_TYPE = r13
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$9 r15 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort$9
                                        java.lang.String r14 = "STRING"
                                        r12 = 8
                                        r15.<init>(r14, r12)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.STRING = r15
                                        r14 = 9
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort[] r14 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort[r14]
                                        r14[r2] = r0
                                        r14[r4] = r1
                                        r14[r6] = r3
                                        r14[r8] = r5
                                        r14[r10] = r7
                                        r0 = 5
                                        r14[r0] = r9
                                        r0 = 6
                                        r14[r0] = r11
                                        r0 = 7
                                        r14[r0] = r13
                                        r14[r12] = r15
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.$VALUES = r14
                                        return
                                }

                                Sort(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                /* synthetic */ Sort(java.lang.String r1, int r2, net.bytebuddy.asm.MemberSubstitution.AnonymousClass1 r3) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort[]) r0
                                        return r0
                                }

                                public abstract boolean isRepresentable(net.bytebuddy.description.ByteCodeElement.Member r1);

                                public abstract net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.ByteCodeElement.Member r1, java.util.List<net.bytebuddy.description.type.TypeDescription> r2, net.bytebuddy.description.type.TypeDescription r3);
                            }

                            public ForOrigin(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Sort r1, net.bytebuddy.asm.MemberSubstitution.Source r2) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.sort = r1
                                    r0.source = r2
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
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r2 = r4.sort
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin) r5
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r3 = r5.sort
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L20
                                    return r1
                                L20:
                                    net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                    net.bytebuddy.asm.MemberSubstitution$Source r5 = r5.source
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
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r1 = r2.sort
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                                    r0 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Resolved r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Resolved
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Sort r2 = r0.sort
                                    net.bytebuddy.asm.MemberSubstitution$Source r3 = r0.source
                                    r1.<init>(r2, r3, r4)
                                    return r1
                            }
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForSelfCallHandle implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping {
                            private final boolean bound;
                            private final net.bytebuddy.asm.MemberSubstitution.Source source;

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Bound implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved {
                                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                                private final net.bytebuddy.asm.MemberSubstitution.Source source;

                                public Bound(net.bytebuddy.asm.MemberSubstitution.Source r1, net.bytebuddy.description.method.MethodDescription r2) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.source = r1
                                        r0.instrumentedMethod = r2
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r7, net.bytebuddy.description.ByteCodeElement.Member r8, net.bytebuddy.description.type.TypeList.Generic r9, net.bytebuddy.description.type.TypeDescription.Generic r10, net.bytebuddy.description.type.TypeDescription.Generic r11, net.bytebuddy.utility.JavaConstant.MethodHandle r12, java.util.Map<java.lang.Integer, java.lang.Integer> r13, int r14) {
                                        r6 = this;
                                        r7 = 2
                                        r10 = 1
                                        r11 = 0
                                        net.bytebuddy.asm.MemberSubstitution$Source r14 = r6.source
                                        net.bytebuddy.description.method.MethodDescription r0 = r6.instrumentedMethod
                                        net.bytebuddy.asm.MemberSubstitution$Source$Value r14 = r14.self(r9, r13, r8, r0)
                                        net.bytebuddy.asm.MemberSubstitution$Source r0 = r6.source
                                        r1 = 0
                                        net.bytebuddy.description.method.MethodDescription r5 = r6.instrumentedMethod
                                        r2 = r9
                                        r3 = r13
                                        r4 = r8
                                        java.util.List r8 = r0.arguments(r1, r2, r3, r4, r5)
                                        java.util.ArrayList r9 = new java.util.ArrayList
                                        int r13 = r8.size()
                                        if (r14 != 0) goto L21
                                        r0 = r11
                                        goto L22
                                    L21:
                                        r0 = r7
                                    L22:
                                        int r13 = r13 + r0
                                        int r13 = r13 + r10
                                        boolean r0 = r8.isEmpty()
                                        r0 = r0 ^ r10
                                        int r13 = r13 + r0
                                        r9.<init>(r13)
                                        net.bytebuddy.asm.MemberSubstitution$Source r13 = r6.source
                                        net.bytebuddy.description.method.MethodDescription r0 = r6.instrumentedMethod
                                        net.bytebuddy.utility.JavaConstant$MethodHandle r12 = r13.handle(r12, r0)
                                        net.bytebuddy.implementation.bytecode.StackManipulation r12 = r12.toStackManipulation()
                                        r9.add(r12)
                                        if (r14 == 0) goto L81
                                        net.bytebuddy.description.type.TypeDescription$Generic r12 = r14.getTypeDescription()
                                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r12 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r12)
                                        int r13 = r14.getOffset()
                                        net.bytebuddy.implementation.bytecode.StackManipulation r12 = r12.loadFrom(r13)
                                        r9.add(r12)
                                        net.bytebuddy.description.method.MethodDescription$Latent r12 = new net.bytebuddy.description.method.MethodDescription$Latent
                                        net.bytebuddy.utility.JavaType r13 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                                        net.bytebuddy.description.type.TypeDescription r14 = r13.getTypeStub()
                                        net.bytebuddy.description.method.MethodDescription$Token r0 = new net.bytebuddy.description.method.MethodDescription$Token
                                        net.bytebuddy.description.type.TypeDescription r13 = r13.getTypeStub()
                                        net.bytebuddy.description.type.TypeDescription$Generic r13 = r13.asGenericType()
                                        net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                                        java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                                        net.bytebuddy.description.type.TypeDefinition[] r3 = new net.bytebuddy.description.type.TypeDefinition[r10]
                                        r3[r11] = r2
                                        r1.<init>(r3)
                                        java.lang.String r2 = "bindTo"
                                        r0.<init>(r2, r10, r13, r1)
                                        r12.<init>(r14, r0)
                                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r12 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r12)
                                        r9.add(r12)
                                    L81:
                                        boolean r12 = r8.isEmpty()
                                        if (r12 != 0) goto Lee
                                        java.util.Iterator r8 = r8.iterator()
                                    L8b:
                                        boolean r12 = r8.hasNext()
                                        if (r12 == 0) goto Lab
                                        java.lang.Object r12 = r8.next()
                                        net.bytebuddy.asm.MemberSubstitution$Source$Value r12 = (net.bytebuddy.asm.MemberSubstitution.Source.Value) r12
                                        net.bytebuddy.description.type.TypeDescription$Generic r13 = r12.getTypeDescription()
                                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r13 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r13)
                                        int r12 = r12.getOffset()
                                        net.bytebuddy.implementation.bytecode.StackManipulation r12 = r13.loadFrom(r12)
                                        r9.add(r12)
                                        goto L8b
                                    Lab:
                                        net.bytebuddy.description.method.MethodDescription$Latent r8 = new net.bytebuddy.description.method.MethodDescription$Latent
                                        net.bytebuddy.utility.JavaType r12 = net.bytebuddy.utility.JavaType.METHOD_HANDLES
                                        net.bytebuddy.description.type.TypeDescription r12 = r12.getTypeStub()
                                        net.bytebuddy.description.method.MethodDescription$Token r13 = new net.bytebuddy.description.method.MethodDescription$Token
                                        net.bytebuddy.utility.JavaType r14 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                                        net.bytebuddy.description.type.TypeDescription r0 = r14.getTypeStub()
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r0.asGenericType()
                                        net.bytebuddy.description.type.TypeList$Generic$Explicit r1 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                                        net.bytebuddy.description.type.TypeDescription r14 = r14.getTypeStub()
                                        java.lang.Class r2 = java.lang.Integer.TYPE
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                                        java.lang.Class<java.lang.Object[]> r3 = java.lang.Object[].class
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r3)
                                        r4 = 3
                                        net.bytebuddy.description.type.TypeDefinition[] r4 = new net.bytebuddy.description.type.TypeDefinition[r4]
                                        r4[r11] = r14
                                        r4[r10] = r2
                                        r4[r7] = r3
                                        r1.<init>(r4)
                                        java.lang.String r7 = "insertArguments"
                                        r10 = 9
                                        r13.<init>(r7, r10, r0, r1)
                                        r8.<init>(r12, r13)
                                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r7 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r8)
                                        r9.add(r7)
                                    Lee:
                                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r7 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                        r7.<init>(r9)
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
                                        net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Bound) r5
                                        net.bytebuddy.asm.MemberSubstitution$Source r3 = r5.source
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                                        net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
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
                                        net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            public enum Factory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<net.bytebuddy.asm.MemberSubstitution.SelfCallHandle> {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory[] $VALUES = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ALL_ARGUMENTS_BOUND = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape ALL_ARGUMENTS_SOURCE = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory INSTANCE = null;

                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Factory
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory.INSTANCE = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Factory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory[]{r0}
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory.$VALUES = r0
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$SelfCallHandle> r0 = net.bytebuddy.asm.MemberSubstitution.SelfCallHandle.class
                                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                                        net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                                        java.lang.String r1 = "source"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                        java.lang.Object r1 = r1.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory.ALL_ARGUMENTS_SOURCE = r1
                                        java.lang.String r1 = "bound"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                                        java.lang.Object r0 = r0.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory.ALL_ARGUMENTS_BOUND = r0
                                        return
                                }

                                Factory(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Factory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Factory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Factory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<net.bytebuddy.asm.MemberSubstitution.SelfCallHandle> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$SelfCallHandle> r0 = net.bytebuddy.asm.MemberSubstitution.SelfCallHandle.class
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.SelfCallHandle> r2) {
                                        r0 = this;
                                        java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                                        java.lang.String r2 = "This factory does not support binding a method receiver"
                                        r1.<init>(r2)
                                        throw r1
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.SelfCallHandle> r4) {
                                        r2 = this;
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                                        net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                                        net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                                        boolean r0 = r0.isAssignableFrom(r1)
                                        if (r0 == 0) goto L42
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle r3 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory.ALL_ARGUMENTS_SOURCE
                                        net.bytebuddy.description.annotation.AnnotationValue r0 = r4.getValue(r0)
                                        java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r1 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                        java.lang.Object r0 = r0.resolve(r1)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r0 = (net.bytebuddy.description.enumeration.EnumerationDescription) r0
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Source> r1 = net.bytebuddy.asm.MemberSubstitution.Source.class
                                        java.lang.Enum r0 = r0.load(r1)
                                        net.bytebuddy.asm.MemberSubstitution$Source r0 = (net.bytebuddy.asm.MemberSubstitution.Source) r0
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory.ALL_ARGUMENTS_BOUND
                                        net.bytebuddy.description.annotation.AnnotationValue r4 = r4.getValue(r1)
                                        java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
                                        java.lang.Object r4 = r4.resolve(r1)
                                        java.lang.Boolean r4 = (java.lang.Boolean) r4
                                        boolean r4 = r4.booleanValue()
                                        r3.<init>(r0, r4)
                                        return r3
                                    L42:
                                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Cannot assign method handle to "
                                        r0.append(r1)
                                        r0.append(r3)
                                        java.lang.String r3 = r0.toString()
                                        r4.<init>(r3)
                                        throw r4
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Unbound implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved {
                                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                                private final net.bytebuddy.asm.MemberSubstitution.Source source;

                                public Unbound(net.bytebuddy.asm.MemberSubstitution.Source r1, net.bytebuddy.description.method.MethodDescription r2) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.source = r1
                                        r0.instrumentedMethod = r2
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5, net.bytebuddy.utility.JavaConstant.MethodHandle r6, java.util.Map<java.lang.Integer, java.lang.Integer> r7, int r8) {
                                        r0 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Source r1 = r0.source
                                        net.bytebuddy.description.method.MethodDescription r2 = r0.instrumentedMethod
                                        net.bytebuddy.utility.JavaConstant$MethodHandle r1 = r1.handle(r6, r2)
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.toStackManipulation()
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
                                        net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Unbound r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Unbound) r5
                                        net.bytebuddy.asm.MemberSubstitution$Source r3 = r5.source
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                                        net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
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
                                        net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            public ForSelfCallHandle(net.bytebuddy.asm.MemberSubstitution.Source r1, boolean r2) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.source = r1
                                    r0.bound = r2
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
                                    boolean r2 = r4.bound
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle) r5
                                    boolean r3 = r5.bound
                                    if (r2 == r3) goto L1c
                                    return r1
                                L1c:
                                    net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                    net.bytebuddy.asm.MemberSubstitution$Source r5 = r5.source
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
                                    net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    boolean r1 = r2.bound
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                                    r0 = this;
                                    boolean r1 = r0.bound
                                    if (r1 == 0) goto Lc
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Bound
                                    net.bytebuddy.asm.MemberSubstitution$Source r2 = r0.source
                                    r1.<init>(r2, r4)
                                    goto L13
                                Lc:
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Unbound r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Unbound
                                    net.bytebuddy.asm.MemberSubstitution$Source r2 = r0.source
                                    r1.<init>(r2, r4)
                                L13:
                                    return r1
                            }
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForStackManipulation implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping {
                            private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
                            private final net.bytebuddy.description.type.TypeDescription.Generic targetType;
                            private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Factory<T extends java.lang.annotation.Annotation> extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase<T> {
                                private final java.lang.Class<T> annotationType;
                                private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
                                private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;

                                public Factory(java.lang.Class<T> r1, net.bytebuddy.implementation.bytecode.StackManipulation r2, net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.annotationType = r1
                                        r0.stackManipulation = r2
                                        r0.typeDescription = r3
                                        return
                                }

                                public Factory(java.lang.Class<T> r2, net.bytebuddy.utility.ConstantValue r3) {
                                        r1 = this;
                                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = r3.toStackManipulation()
                                        net.bytebuddy.description.type.TypeDescription r3 = r3.getTypeDescription()
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                                        r1.<init>(r2, r0, r3)
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
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r2 = r4.annotationType
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation.Factory) r5
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r3 = r5.annotationType
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
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.typeDescription
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L36
                                        return r1
                                    L36:
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<T> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r1.annotationType
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r1 = r2.annotationType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r4) {
                                        r2 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation
                                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.stackManipulation
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                                        r4.<init>(r0, r1, r3)
                                        return r4
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class OfAnnotationProperty<T extends java.lang.annotation.Annotation> extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.WithParameterSupportOnly<T> {
                                private final java.lang.Class<T> annotationType;
                                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape property;

                                public OfAnnotationProperty(java.lang.Class<T> r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.annotationType = r1
                                        r0.property = r2
                                        return
                                }

                                public static <S extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<S> of(java.lang.Class<S> r4, java.lang.String r5) {
                                        boolean r0 = r4.isAnnotation()
                                        if (r0 == 0) goto L36
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfAnnotationProperty r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfAnnotationProperty     // Catch: java.lang.NoSuchMethodException -> L16
                                        net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r1 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L16
                                        r2 = 0
                                        java.lang.reflect.Method r2 = r4.getMethod(r5, r2)     // Catch: java.lang.NoSuchMethodException -> L16
                                        r1.<init>(r2)     // Catch: java.lang.NoSuchMethodException -> L16
                                        r0.<init>(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L16
                                        return r0
                                    L16:
                                        r0 = move-exception
                                        java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                        r2.<init>()
                                        java.lang.String r3 = "Cannot find a property "
                                        r2.append(r3)
                                        r2.append(r5)
                                        java.lang.String r5 = " on "
                                        r2.append(r5)
                                        r2.append(r4)
                                        java.lang.String r4 = r2.toString()
                                        r1.<init>(r4, r0)
                                        throw r1
                                    L36:
                                        java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Not an annotation type: "
                                        r0.append(r1)
                                        r0.append(r4)
                                        java.lang.String r4 = r0.toString()
                                        r5.<init>(r4)
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
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r2 = r4.annotationType
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfAnnotationProperty r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation.OfAnnotationProperty) r5
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r3 = r5.annotationType
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.property
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r5 = r5.property
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L2b
                                        return r1
                                    L2b:
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<T> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r1.annotationType
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r1 = r2.annotationType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.property
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r4) {
                                        r2 = this;
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.property
                                        net.bytebuddy.description.annotation.AnnotationValue r4 = r4.getValue(r0)
                                        java.lang.Object r4 = r4.resolve()
                                        net.bytebuddy.utility.ConstantValue r4 = net.bytebuddy.utility.ConstantValue.Simple.wrapOrNull(r4)
                                        if (r4 == 0) goto L26
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r4.toStackManipulation()
                                        net.bytebuddy.description.type.TypeDescription r4 = r4.getTypeDescription()
                                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.asGenericType()
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                                        r0.<init>(r1, r4, r3)
                                        return r0
                                    L26:
                                        java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                        r4.<init>()
                                        java.lang.String r0 = "Not a constant value property: "
                                        r4.append(r0)
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.property
                                        r4.append(r0)
                                        java.lang.String r4 = r4.toString()
                                        r3.<init>(r4)
                                        throw r3
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class OfDefaultValue<T extends java.lang.annotation.Annotation> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<T> {
                                private final java.lang.Class<T> annotationType;

                                public OfDefaultValue(java.lang.Class<T> r1) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.annotationType = r1
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
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r2 = r4.annotationType
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfDefaultValue r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation.OfDefaultValue) r5
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r5 = r5.annotationType
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L20
                                        return r1
                                    L20:
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<T> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r1.annotationType
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r1 = r2.annotationType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r2) {
                                        r0 = this;
                                        java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                                        java.lang.String r2 = "This factory does not support binding a method receiver"
                                        r1.<init>(r2)
                                        throw r1
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r4) {
                                        r2 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getType()
                                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r0)
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                                        r4.<init>(r0, r1, r3)
                                        return r4
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class OfDynamicInvocation<T extends java.lang.annotation.Annotation> extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase<T> {
                                private final java.lang.Class<T> annotationType;
                                private final java.util.List<? extends net.bytebuddy.utility.JavaConstant> arguments;
                                private final net.bytebuddy.description.method.MethodDescription.InDefinedShape bootstrapMethod;

                                public OfDynamicInvocation(java.lang.Class<T> r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, java.util.List<? extends net.bytebuddy.utility.JavaConstant> r3) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.annotationType = r1
                                        r0.bootstrapMethod = r2
                                        r0.arguments = r3
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
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r2 = r4.annotationType
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfDynamicInvocation r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation.OfDynamicInvocation) r5
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r3 = r5.annotationType
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r2 = r4.bootstrapMethod
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r5.bootstrapMethod
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L2b
                                        return r1
                                    L2b:
                                        java.util.List<? extends net.bytebuddy.utility.JavaConstant> r2 = r4.arguments
                                        java.util.List<? extends net.bytebuddy.utility.JavaConstant> r5 = r5.arguments
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L36
                                        return r1
                                    L36:
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<T> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r1.annotationType
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r1 = r2.annotationType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.bootstrapMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        java.util.List<? extends net.bytebuddy.utility.JavaConstant> r1 = r2.arguments
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.type.TypeDescription.Generic r6, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r7) {
                                        r5 = this;
                                        boolean r7 = r6.isInterface()
                                        if (r7 == 0) goto L94
                                        net.bytebuddy.description.type.TypeList$Generic r7 = r6.getInterfaces()
                                        boolean r7 = r7.isEmpty()
                                        if (r7 == 0) goto L7d
                                        boolean r7 = r6.isPublic()
                                        if (r7 == 0) goto L66
                                        net.bytebuddy.description.method.MethodList r7 = r6.getDeclaredMethods()
                                        net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
                                        net.bytebuddy.matcher.FilterableList r7 = r7.filter(r0)
                                        net.bytebuddy.description.method.MethodList r7 = (net.bytebuddy.description.method.MethodList) r7
                                        int r0 = r7.size()
                                        r1 = 1
                                        if (r0 != r1) goto L4f
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r5.bootstrapMethod
                                        net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                                        java.lang.Object r7 = r7.getOnly()
                                        net.bytebuddy.description.method.MethodDescription r7 = (net.bytebuddy.description.method.MethodDescription) r7
                                        java.lang.String r7 = r7.getInternalName()
                                        net.bytebuddy.description.type.TypeDescription r2 = r6.asErasure()
                                        java.util.List r3 = java.util.Collections.emptyList()
                                        java.util.List<? extends net.bytebuddy.utility.JavaConstant> r4 = r5.arguments
                                        net.bytebuddy.implementation.bytecode.StackManipulation r7 = r1.dynamic(r7, r2, r3, r4)
                                        r0.<init>(r7, r6, r6)
                                        return r0
                                    L4f:
                                        java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        r0.append(r6)
                                        java.lang.String r6 = " must declare exactly one abstract method"
                                        r0.append(r6)
                                        java.lang.String r6 = r0.toString()
                                        r7.<init>(r6)
                                        throw r7
                                    L66:
                                        java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        r0.append(r6)
                                        java.lang.String r6 = " is mot public"
                                        r0.append(r6)
                                        java.lang.String r6 = r0.toString()
                                        r7.<init>(r6)
                                        throw r7
                                    L7d:
                                        java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        r0.append(r6)
                                        java.lang.String r6 = " must not extend other interfaces"
                                        r0.append(r6)
                                        java.lang.String r6 = r0.toString()
                                        r7.<init>(r6)
                                        throw r7
                                    L94:
                                        java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        r0.append(r6)
                                        java.lang.String r6 = " is not an interface"
                                        r0.append(r6)
                                        java.lang.String r6 = r0.toString()
                                        r7.<init>(r6)
                                        throw r7
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class OfSerializedConstant<T extends java.lang.annotation.Annotation> extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase<T> {
                                private final java.lang.Class<T> annotationType;
                                private final net.bytebuddy.implementation.bytecode.StackManipulation deserialization;
                                private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;

                                public OfSerializedConstant(java.lang.Class<T> r1, net.bytebuddy.implementation.bytecode.StackManipulation r2, net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.annotationType = r1
                                        r0.deserialization = r2
                                        r0.typeDescription = r3
                                        return
                                }

                                public static <S extends java.lang.annotation.Annotation, U extends java.io.Serializable> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<S> of(java.lang.Class<S> r1, U r2, java.lang.Class<? super U> r3) {
                                        boolean r0 = r3.isInstance(r2)
                                        if (r0 == 0) goto L18
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfSerializedConstant r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfSerializedConstant
                                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = net.bytebuddy.implementation.bytecode.constant.SerializedConstant.of(r2)
                                        net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                                        r0.<init>(r1, r2, r3)
                                        return r0
                                    L18:
                                        java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        r0.append(r2)
                                        java.lang.String r2 = " is no instance of "
                                        r0.append(r2)
                                        r0.append(r3)
                                        java.lang.String r2 = r0.toString()
                                        r1.<init>(r2)
                                        throw r1
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
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r2 = r4.annotationType
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfSerializedConstant r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation.OfSerializedConstant) r5
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r3 = r5.annotationType
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.deserialization
                                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.deserialization
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L2b
                                        return r1
                                    L2b:
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.typeDescription
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L36
                                        return r1
                                    L36:
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<T> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r0 = r1.annotationType
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        java.lang.Class<T extends java.lang.annotation.Annotation> r1 = r2.annotationType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.deserialization
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory.AbstractBase
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.type.TypeDescription.Generic r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<T> r4) {
                                        r2 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation
                                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.deserialization
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                                        r4.<init>(r0, r1, r3)
                                        return r4
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved {
                                private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
                                private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
                                private final net.bytebuddy.description.type.TypeDescription.Generic targetType;
                                private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;
                                private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                                public Resolved(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.implementation.bytecode.StackManipulation r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.assigner = r1
                                        r0.typing = r2
                                        r0.stackManipulation = r3
                                        r0.typeDescription = r4
                                        r0.targetType = r5
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5, net.bytebuddy.utility.JavaConstant.MethodHandle r6, java.util.Map<java.lang.Integer, java.lang.Integer> r7, int r8) {
                                        r0 = this;
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r0.assigner
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r0.typeDescription
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.targetType
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r0.typing
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.assign(r2, r3, r4)
                                        boolean r2 = r1.isValid()
                                        if (r2 == 0) goto L23
                                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r0.stackManipulation
                                        r4 = 2
                                        net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                                        r5 = 0
                                        r4[r5] = r3
                                        r3 = 1
                                        r4[r3] = r1
                                        r2.<init>(r4)
                                        return r2
                                    L23:
                                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r2 = new java.lang.StringBuilder
                                        r2.<init>()
                                        java.lang.String r3 = "Cannot assign "
                                        r2.append(r3)
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.typeDescription
                                        r2.append(r3)
                                        java.lang.String r3 = " to "
                                        r2.append(r3)
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.targetType
                                        r2.append(r3)
                                        java.lang.String r2 = r2.toString()
                                        r1.<init>(r2)
                                        throw r1
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
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation.Resolved) r5
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r5.assigner
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L2b
                                        return r1
                                    L2b:
                                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                                        net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.stackManipulation
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L36
                                        return r1
                                    L36:
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.typeDescription
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L41
                                        return r1
                                    L41:
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.targetType
                                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.targetType
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L4c
                                        return r1
                                    L4c:
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
                                        int r0 = r0 * 31
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.targetType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            public ForStackManipulation(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription.Generic r2, net.bytebuddy.description.type.TypeDescription.Generic r3) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.targetType = r3
                                    r0.stackManipulation = r1
                                    r0.typeDescription = r2
                                    return
                            }

                            public static <S extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<S> of(java.lang.Class<S> r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                                    if (r2 != 0) goto L8
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfDefaultValue r2 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfDefaultValue
                                    r2.<init>(r1)
                                    goto L12
                                L8:
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory
                                    net.bytebuddy.utility.ConstantValue r2 = net.bytebuddy.utility.ConstantValue.Simple.wrap(r2)
                                    r0.<init>(r1, r2)
                                    r2 = r0
                                L12:
                                    return r2
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
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation) r5
                                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.stackManipulation
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L20
                                    return r1
                                L20:
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.typeDescription
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L2b
                                    return r1
                                L2b:
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.targetType
                                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.targetType
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
                                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.targetType
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r7, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r8, net.bytebuddy.description.type.TypeDescription r9, net.bytebuddy.description.method.MethodDescription r10) {
                                    r6 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Resolved r9 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Resolved
                                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r6.stackManipulation
                                    net.bytebuddy.description.type.TypeDescription$Generic r4 = r6.typeDescription
                                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r6.targetType
                                    r0 = r9
                                    r1 = r7
                                    r2 = r8
                                    r0.<init>(r1, r2, r3, r4, r5)
                                    return r9
                            }
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForStubValue implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping {
                            private final net.bytebuddy.asm.MemberSubstitution.Source source;

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public enum Factory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<net.bytebuddy.asm.MemberSubstitution.StubValue> {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory[] $VALUES = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory INSTANCE = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape STUB_VALUE_SOURCE = null;

                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Factory
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory.INSTANCE = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Factory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory[]{r0}
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory.$VALUES = r0
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$StubValue> r0 = net.bytebuddy.asm.MemberSubstitution.StubValue.class
                                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                                        net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                                        java.lang.String r1 = "source"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                                        java.lang.Object r0 = r0.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory.STUB_VALUE_SOURCE = r0
                                        return
                                }

                                Factory(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Factory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Factory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Factory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<net.bytebuddy.asm.MemberSubstitution.StubValue> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$StubValue> r0 = net.bytebuddy.asm.MemberSubstitution.StubValue.class
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.StubValue> r2) {
                                        r0 = this;
                                        java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                                        java.lang.String r2 = "This factory does not support binding a method receiver"
                                        r1.<init>(r2)
                                        throw r1
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r3, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.StubValue> r4) {
                                        r2 = this;
                                        net.bytebuddy.description.type.TypeDescription$Generic r0 = r3.getType()
                                        java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                                        boolean r0 = r0.represents(r1)
                                        if (r0 == 0) goto L28
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue r3 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory.STUB_VALUE_SOURCE
                                        net.bytebuddy.description.annotation.AnnotationValue r4 = r4.getValue(r0)
                                        java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r0 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                        java.lang.Object r4 = r4.resolve(r0)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r4 = (net.bytebuddy.description.enumeration.EnumerationDescription) r4
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Source> r0 = net.bytebuddy.asm.MemberSubstitution.Source.class
                                        java.lang.Enum r4 = r4.load(r0)
                                        net.bytebuddy.asm.MemberSubstitution$Source r4 = (net.bytebuddy.asm.MemberSubstitution.Source) r4
                                        r3.<init>(r4)
                                        return r3
                                    L28:
                                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                        r0.<init>()
                                        java.lang.String r1 = "Expected "
                                        r0.append(r1)
                                        r0.append(r3)
                                        java.lang.String r3 = " to declare an Object type"
                                        r0.append(r3)
                                        java.lang.String r3 = r0.toString()
                                        r4.<init>(r3)
                                        throw r4
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved {
                                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                                private final net.bytebuddy.asm.MemberSubstitution.Source source;

                                public Resolved(net.bytebuddy.asm.MemberSubstitution.Source r1, net.bytebuddy.description.method.MethodDescription r2) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.source = r1
                                        r0.instrumentedMethod = r2
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5, net.bytebuddy.utility.JavaConstant.MethodHandle r6, java.util.Map<java.lang.Integer, java.lang.Integer> r7, int r8) {
                                        r0 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Source r1 = r0.source
                                        net.bytebuddy.description.method.MethodDescription r2 = r0.instrumentedMethod
                                        net.bytebuddy.utility.JavaConstant$MethodHandle r1 = r1.handle(r6, r2)
                                        net.bytebuddy.description.type.TypeDescription r1 = r1.getReturnType()
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r1)
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
                                        net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Resolved) r5
                                        net.bytebuddy.asm.MemberSubstitution$Source r3 = r5.source
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L20
                                        return r1
                                    L20:
                                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                                        net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
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
                                        net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            public ForStubValue(net.bytebuddy.asm.MemberSubstitution.Source r1) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.source = r1
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
                                    net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue) r5
                                    net.bytebuddy.asm.MemberSubstitution$Source r5 = r5.source
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
                                    net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                                    r0 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Resolved r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Resolved
                                    net.bytebuddy.asm.MemberSubstitution$Source r2 = r0.source
                                    r1.<init>(r2, r4)
                                    return r1
                            }
                        }

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class ForThisReference implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping {
                            private final boolean optional;
                            private final net.bytebuddy.asm.MemberSubstitution.Source source;
                            private final net.bytebuddy.description.type.TypeDescription.Generic targetType;

                            @net.bytebuddy.utility.nullability.MaybeNull
                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                            private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                            public enum Factory extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<net.bytebuddy.asm.MemberSubstitution.This> {
                                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory[] $VALUES = null;
                                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory INSTANCE = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape THIS_OPTIONAL = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape THIS_SOURCE = null;
                                private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape THIS_TYPING = null;

                                static {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Factory
                                        java.lang.String r1 = "INSTANCE"
                                        r2 = 0
                                        r0.<init>(r1, r2)
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.INSTANCE = r0
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Factory[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory[]{r0}
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.$VALUES = r0
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$This> r0 = net.bytebuddy.asm.MemberSubstitution.This.class
                                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                                        net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
                                        java.lang.String r1 = "typing"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                        java.lang.Object r1 = r1.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.THIS_TYPING = r1
                                        java.lang.String r1 = "source"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r1 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                        java.lang.Object r1 = r1.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.THIS_SOURCE = r1
                                        java.lang.String r1 = "optional"
                                        net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.named(r1)
                                        net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
                                        net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
                                        java.lang.Object r0 = r0.getOnly()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
                                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.THIS_OPTIONAL = r0
                                        return
                                }

                                Factory(java.lang.String r1, int r2) {
                                        r0 = this;
                                        r0.<init>(r1, r2)
                                        return
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory valueOf(java.lang.String r1) {
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Factory> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.class
                                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Factory r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory) r1
                                        return r1
                                }

                                public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory[] values() {
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Factory[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.$VALUES
                                        java.lang.Object r0 = r0.clone()
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Factory[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory[]) r0
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public java.lang.Class<net.bytebuddy.asm.MemberSubstitution.This> getAnnotationType() {
                                        r1 = this;
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$This> r0 = net.bytebuddy.asm.MemberSubstitution.This.class
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.MethodDescription.InDefinedShape r5, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.This> r6) {
                                        r4 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference
                                        net.bytebuddy.description.type.TypeDescription r5 = r5.getDeclaringType()
                                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.asGenericType()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.THIS_TYPING
                                        net.bytebuddy.description.annotation.AnnotationValue r1 = r6.getValue(r1)
                                        java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r2 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                        java.lang.Object r1 = r1.resolve(r2)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r1 = (net.bytebuddy.description.enumeration.EnumerationDescription) r1
                                        java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Typing> r3 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.class
                                        java.lang.Enum r1 = r1.load(r3)
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing) r1
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.THIS_SOURCE
                                        net.bytebuddy.description.annotation.AnnotationValue r3 = r6.getValue(r3)
                                        java.lang.Object r2 = r3.resolve(r2)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r2 = (net.bytebuddy.description.enumeration.EnumerationDescription) r2
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Source> r3 = net.bytebuddy.asm.MemberSubstitution.Source.class
                                        java.lang.Enum r2 = r2.load(r3)
                                        net.bytebuddy.asm.MemberSubstitution$Source r2 = (net.bytebuddy.asm.MemberSubstitution.Source) r2
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.THIS_OPTIONAL
                                        net.bytebuddy.description.annotation.AnnotationValue r6 = r6.getValue(r3)
                                        java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                                        java.lang.Object r6 = r6.resolve(r3)
                                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                                        boolean r6 = r6.booleanValue()
                                        r0.<init>(r5, r1, r2, r6)
                                        return r0
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory
                                public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping make(net.bytebuddy.description.method.ParameterDescription.InDefinedShape r5, net.bytebuddy.description.annotation.AnnotationDescription.Loadable<net.bytebuddy.asm.MemberSubstitution.This> r6) {
                                        r4 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference
                                        net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.getType()
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.THIS_TYPING
                                        net.bytebuddy.description.annotation.AnnotationValue r1 = r6.getValue(r1)
                                        java.lang.Class<net.bytebuddy.description.enumeration.EnumerationDescription> r2 = net.bytebuddy.description.enumeration.EnumerationDescription.class
                                        java.lang.Object r1 = r1.resolve(r2)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r1 = (net.bytebuddy.description.enumeration.EnumerationDescription) r1
                                        java.lang.Class<net.bytebuddy.implementation.bytecode.assign.Assigner$Typing> r3 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.class
                                        java.lang.Enum r1 = r1.load(r3)
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = (net.bytebuddy.implementation.bytecode.assign.Assigner.Typing) r1
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.THIS_SOURCE
                                        net.bytebuddy.description.annotation.AnnotationValue r3 = r6.getValue(r3)
                                        java.lang.Object r2 = r3.resolve(r2)
                                        net.bytebuddy.description.enumeration.EnumerationDescription r2 = (net.bytebuddy.description.enumeration.EnumerationDescription) r2
                                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Source> r3 = net.bytebuddy.asm.MemberSubstitution.Source.class
                                        java.lang.Enum r2 = r2.load(r3)
                                        net.bytebuddy.asm.MemberSubstitution$Source r2 = (net.bytebuddy.asm.MemberSubstitution.Source) r2
                                        net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.THIS_OPTIONAL
                                        net.bytebuddy.description.annotation.AnnotationValue r6 = r6.getValue(r3)
                                        java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
                                        java.lang.Object r6 = r6.resolve(r3)
                                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                                        boolean r6 = r6.booleanValue()
                                        r0.<init>(r5, r1, r2, r6)
                                        return r0
                                }
                            }

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class Resolved implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved {
                                private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
                                private final net.bytebuddy.description.method.MethodDescription instrumentedMethod;
                                private final boolean optional;
                                private final net.bytebuddy.asm.MemberSubstitution.Source source;
                                private final net.bytebuddy.description.type.TypeDescription.Generic targetType;
                                private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                                public Resolved(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.asm.MemberSubstitution.Source r3, boolean r4, net.bytebuddy.implementation.bytecode.assign.Assigner r5, net.bytebuddy.description.method.MethodDescription r6) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.targetType = r1
                                        r0.typing = r2
                                        r0.source = r3
                                        r0.optional = r4
                                        r0.assigner = r5
                                        r0.instrumentedMethod = r6
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5, net.bytebuddy.utility.JavaConstant.MethodHandle r6, java.util.Map<java.lang.Integer, java.lang.Integer> r7, int r8) {
                                        r0 = this;
                                        net.bytebuddy.asm.MemberSubstitution$Source r1 = r0.source
                                        net.bytebuddy.description.method.MethodDescription r4 = r0.instrumentedMethod
                                        net.bytebuddy.asm.MemberSubstitution$Source$Value r1 = r1.self(r3, r7, r2, r4)
                                        if (r1 == 0) goto L62
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r0.assigner
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r1.getTypeDescription()
                                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r0.targetType
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r5 = r0.typing
                                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.assign(r3, r4, r5)
                                        boolean r3 = r2.isValid()
                                        if (r3 == 0) goto L3d
                                        net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                        net.bytebuddy.description.type.TypeDescription$Generic r4 = r1.getTypeDescription()
                                        net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r4 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r4)
                                        int r1 = r1.getOffset()
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r4.loadFrom(r1)
                                        r4 = 2
                                        net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]
                                        r5 = 0
                                        r4[r5] = r1
                                        r1 = 1
                                        r4[r1] = r2
                                        r3.<init>(r4)
                                        return r3
                                    L3d:
                                        java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                        r3.<init>()
                                        java.lang.String r4 = "Cannot assign "
                                        r3.append(r4)
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getTypeDescription()
                                        r3.append(r1)
                                        java.lang.String r1 = " to "
                                        r3.append(r1)
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.targetType
                                        r3.append(r1)
                                        java.lang.String r1 = r3.toString()
                                        r2.<init>(r1)
                                        throw r2
                                    L62:
                                        boolean r1 = r0.optional
                                        if (r1 == 0) goto L6d
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.targetType
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r1)
                                        return r1
                                    L6d:
                                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                                        java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                        r3.<init>()
                                        java.lang.String r4 = "No this reference available for "
                                        r3.append(r4)
                                        r3.append(r2)
                                        java.lang.String r2 = r3.toString()
                                        r1.<init>(r2)
                                        throw r1
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
                                        boolean r2 = r4.optional
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Resolved) r5
                                        boolean r3 = r5.optional
                                        if (r2 == r3) goto L1c
                                        return r1
                                    L1c:
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L27
                                        return r1
                                    L27:
                                        net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                        net.bytebuddy.asm.MemberSubstitution$Source r3 = r5.source
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L32
                                        return r1
                                    L32:
                                        net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.targetType
                                        net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.targetType
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L3d
                                        return r1
                                    L3d:
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r5.assigner
                                        boolean r2 = r2.equals(r3)
                                        if (r2 != 0) goto L48
                                        return r1
                                    L48:
                                        net.bytebuddy.description.method.MethodDescription r2 = r4.instrumentedMethod
                                        net.bytebuddy.description.method.MethodDescription r5 = r5.instrumentedMethod
                                        boolean r5 = r2.equals(r5)
                                        if (r5 != 0) goto L53
                                        return r1
                                    L53:
                                        return r0
                                }

                                public int hashCode() {
                                        r2 = this;
                                        java.lang.Class r0 = r2.getClass()
                                        int r0 = r0.hashCode()
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.targetType
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        boolean r1 = r2.optional
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        int r0 = r0 * 31
                                        net.bytebuddy.description.method.MethodDescription r1 = r2.instrumentedMethod
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            public ForThisReference(net.bytebuddy.description.type.TypeDescription.Generic r1, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.asm.MemberSubstitution.Source r3, boolean r4) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.targetType = r1
                                    r0.typing = r2
                                    r0.source = r3
                                    r0.optional = r4
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
                                    boolean r2 = r4.optional
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference) r5
                                    boolean r3 = r5.optional
                                    if (r2 == r3) goto L1c
                                    return r1
                                L1c:
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                                    if (r3 == 0) goto L2b
                                    if (r2 == 0) goto L2d
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L2e
                                    return r1
                                L2b:
                                    if (r2 == 0) goto L2e
                                L2d:
                                    return r1
                                L2e:
                                    net.bytebuddy.asm.MemberSubstitution$Source r2 = r4.source
                                    net.bytebuddy.asm.MemberSubstitution$Source r3 = r5.source
                                    boolean r2 = r2.equals(r3)
                                    if (r2 != 0) goto L39
                                    return r1
                                L39:
                                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.targetType
                                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.targetType
                                    boolean r5 = r2.equals(r5)
                                    if (r5 != 0) goto L44
                                    return r1
                                L44:
                                    return r0
                            }

                            public int hashCode() {
                                    r2 = this;
                                    java.lang.Class r0 = r2.getClass()
                                    int r0 = r0.hashCode()
                                    int r0 = r0 * 31
                                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.targetType
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                                    if (r1 == 0) goto L1c
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                L1c:
                                    int r0 = r0 * 31
                                    net.bytebuddy.asm.MemberSubstitution$Source r1 = r2.source
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    boolean r1 = r2.optional
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r8, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r9, net.bytebuddy.description.type.TypeDescription r10, net.bytebuddy.description.method.MethodDescription r11) {
                                    r7 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved r10 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved
                                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r7.targetType
                                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r0 = r7.typing
                                    if (r0 != 0) goto La
                                    r2 = r9
                                    goto Lb
                                La:
                                    r2 = r0
                                Lb:
                                    net.bytebuddy.asm.MemberSubstitution$Source r3 = r7.source
                                    boolean r4 = r7.optional
                                    r0 = r10
                                    r5 = r8
                                    r6 = r11
                                    r0.<init>(r1, r2, r3, r4, r5, r6)
                                    return r10
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping
                            public /* bridge */ /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                                    r0 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Resolved r1 = r0.resolve(r1, r2, r3, r4)
                                    return r1
                            }
                        }

                        public interface Resolved {

                            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                            public static class ForStackManipulation implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved {
                                private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;

                                public ForStackManipulation(net.bytebuddy.implementation.bytecode.StackManipulation r1) {
                                        r0 = this;
                                        r0.<init>()
                                        r0.stackManipulation = r1
                                        return
                                }

                                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved
                                public net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5, net.bytebuddy.utility.JavaConstant.MethodHandle r6, java.util.Map<java.lang.Integer, java.lang.Integer> r7, int r8) {
                                        r0 = this;
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r0.stackManipulation
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
                                        net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                                        net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved$ForStackManipulation r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved.ForStackManipulation) r5
                                        net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.stackManipulation
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
                                        net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.stackManipulation
                                        int r1 = r1.hashCode()
                                        int r0 = r0 + r1
                                        return r0
                                }
                            }

                            net.bytebuddy.implementation.bytecode.StackManipulation apply(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5, net.bytebuddy.utility.JavaConstant.MethodHandle r6, java.util.Map<java.lang.Integer, java.lang.Integer> r7, int r8);
                        }

                        net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved resolve(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4);
                    }

                    public static class WithCustomMapping {
                        private final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory dispatcherFactory;
                        private final java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<?>> offsetMappings;

                        public WithCustomMapping(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory r1, java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<?>> r2) {
                                r0 = this;
                                r0.<init>()
                                r0.dispatcherFactory = r1
                                r0.offsetMappings = r2
                                return
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r1, java.lang.Class<?> r2) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r1 = r0.bind(r1, r2)
                                return r1
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r2, java.lang.Enum<?> r3) {
                                r1 = this;
                                net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration r0 = new net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration
                                r0.<init>(r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bind(r2, r0)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2) {
                                r0 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation.of(r1, r2)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r1 = r0.bind(r1)
                                return r1
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r2, java.lang.reflect.Field r3) {
                                r1 = this;
                                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                                r0.<init>(r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bind(r2, r0)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r2, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping r3) {
                                r1 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory$Simple r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory$Simple
                                r0.<init>(r2, r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bind(r0)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r2, net.bytebuddy.description.enumeration.EnumerationDescription r3) {
                                r1 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory
                                net.bytebuddy.utility.ConstantValue r3 = net.bytebuddy.utility.ConstantValue.Simple.wrap(r3)
                                r0.<init>(r2, r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bind(r0)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r2, net.bytebuddy.description.field.FieldDescription r3) {
                                r1 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Resolved$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Resolved$Factory
                                r0.<init>(r2, r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bind(r0)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r2, net.bytebuddy.description.type.TypeDescription r3) {
                                r1 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory
                                net.bytebuddy.utility.ConstantValue r3 = net.bytebuddy.utility.ConstantValue.Simple.wrap(r3)
                                r0.<init>(r2, r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bind(r0)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r1, net.bytebuddy.implementation.bytecode.StackManipulation r2, java.lang.reflect.Type r3) {
                                r0 = this;
                                net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r1 = r0.bind(r1, r2, r3)
                                return r1
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r2, net.bytebuddy.implementation.bytecode.StackManipulation r3, net.bytebuddy.description.type.TypeDescription.Generic r4) {
                                r1 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory
                                r0.<init>(r2, r3, r4)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bind(r0)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(java.lang.Class<T> r3, net.bytebuddy.utility.ConstantValue r4) {
                                r2 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$Factory
                                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r4.toStackManipulation()
                                net.bytebuddy.description.type.TypeDescription r4 = r4.getTypeDescription()
                                net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.asGenericType()
                                r0.<init>(r3, r1, r4)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r3 = r2.bind(r0)
                                return r3
                        }

                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bind(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<?> r4) {
                                r3 = this;
                                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                                java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory<?>> r1 = r3.offsetMappings
                                r0.<init>(r1)
                                java.lang.Class r1 = r4.getAnnotationType()
                                boolean r1 = r1.isAnnotation()
                                if (r1 == 0) goto L3e
                                java.lang.Class r1 = r4.getAnnotationType()
                                java.lang.Object r1 = r0.put(r1, r4)
                                if (r1 != 0) goto L23
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory r1 = r3.dispatcherFactory
                                r4.<init>(r1, r0)
                                return r4
                            L23:
                                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "Annotation type already mapped: "
                                r1.append(r2)
                                java.lang.Class r4 = r4.getAnnotationType()
                                r1.append(r4)
                                java.lang.String r4 = r1.toString()
                                r0.<init>(r4)
                                throw r0
                            L3e:
                                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                                r1.<init>()
                                java.lang.String r2 = "Not an annotation type: "
                                r1.append(r2)
                                java.lang.Class r4 = r4.getAnnotationType()
                                r1.append(r4)
                                java.lang.String r4 = r1.toString()
                                r0.<init>(r4)
                                throw r0
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindDynamic(java.lang.Class<T> r2, java.lang.reflect.Constructor<?> r3, java.util.List<?> r4) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                                r0.<init>(r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bindDynamic(r2, r0, r4)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindDynamic(java.lang.Class<T> r1, java.lang.reflect.Constructor<?> r2, java.lang.Object... r3) {
                                r0 = this;
                                java.util.List r3 = java.util.Arrays.asList(r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r1 = r0.bindDynamic(r1, r2, r3)
                                return r1
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindDynamic(java.lang.Class<T> r2, java.lang.reflect.Method r3, java.util.List<?> r4) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                                r0.<init>(r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bindDynamic(r2, r0, r4)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindDynamic(java.lang.Class<T> r1, java.lang.reflect.Method r2, java.lang.Object... r3) {
                                r0 = this;
                                java.util.List r3 = java.util.Arrays.asList(r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r1 = r0.bindDynamic(r1, r2, r3)
                                return r1
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindDynamic(java.lang.Class<T> r3, net.bytebuddy.description.method.MethodDescription.InDefinedShape r4, java.util.List<?> r5) {
                                r2 = this;
                                java.util.List r5 = net.bytebuddy.utility.JavaConstant.Simple.wrap(r5)
                                net.bytebuddy.description.type.TypeList r0 = net.bytebuddy.description.type.TypeList.Explicit.of(r5)
                                boolean r0 = r4.isInvokeBootstrap(r0)
                                if (r0 == 0) goto L18
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfDynamicInvocation r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfDynamicInvocation
                                r0.<init>(r3, r4, r5)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r3 = r2.bind(r0)
                                return r3
                            L18:
                                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                                r0.<init>()
                                java.lang.String r1 = "Not a valid bootstrap method "
                                r0.append(r1)
                                r0.append(r4)
                                java.lang.String r4 = " for "
                                r0.append(r4)
                                r0.append(r5)
                                java.lang.String r4 = r0.toString()
                                r3.<init>(r4)
                                throw r3
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindDynamic(java.lang.Class<T> r1, net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, java.lang.Object... r3) {
                                r0 = this;
                                java.util.List r3 = java.util.Arrays.asList(r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r1 = r0.bindDynamic(r1, r2, r3)
                                return r1
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindLambda(java.lang.Class<T> r2, java.lang.reflect.Constructor<?> r3, java.lang.Class<?> r4) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                                r0.<init>(r3)
                                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bindLambda(r2, r0, r3)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindLambda(java.lang.Class<T> r2, java.lang.reflect.Constructor<?> r3, java.lang.Class<?> r4, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r5) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                                r0.<init>(r3)
                                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bindLambda(r2, r0, r3, r5)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindLambda(java.lang.Class<T> r2, java.lang.reflect.Method r3, java.lang.Class<?> r4) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                                r0.<init>(r3)
                                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bindLambda(r2, r0, r3)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindLambda(java.lang.Class<T> r2, java.lang.reflect.Method r3, java.lang.Class<?> r4, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r5) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                                r0.<init>(r3)
                                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r4)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bindLambda(r2, r0, r3, r5)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindLambda(java.lang.Class<T> r2, net.bytebuddy.description.method.MethodDescription.InDefinedShape r3, net.bytebuddy.description.type.TypeDescription r4) {
                                r1 = this;
                                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bindLambda(r2, r3, r4, r0)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindLambda(java.lang.Class<T> r17, net.bytebuddy.description.method.MethodDescription.InDefinedShape r18, net.bytebuddy.description.type.TypeDescription r19, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r20) {
                                r16 = this;
                                r0 = r19
                                boolean r1 = r19.isInterface()
                                if (r1 == 0) goto L102
                                r1 = r20
                                net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r1 = r1.compile(r0)
                                net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r1 = r1.listNodes()
                                net.bytebuddy.description.method.MethodList r1 = r1.asMethodList()
                                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isAbstract()
                                net.bytebuddy.matcher.FilterableList r1 = r1.filter(r2)
                                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                                int r2 = r1.size()
                                r3 = 1
                                if (r2 != r3) goto Le6
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
                                net.bytebuddy.utility.JavaConstant$MethodHandle r3 = net.bytebuddy.utility.JavaConstant.MethodHandle.of(r18)
                                net.bytebuddy.description.method.MethodList r1 = r1.asDefined()
                                java.lang.Object r1 = r1.getOnly()
                                net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                                net.bytebuddy.utility.JavaConstant$MethodType r1 = net.bytebuddy.utility.JavaConstant.MethodType.ofSignature(r1)
                                java.lang.Object[] r1 = new java.lang.Object[]{r2, r3, r1}
                                r2 = r16
                                r3 = r17
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r0 = r2.bindDynamic(r3, r0, r1)
                                return r0
                            Le6:
                                r2 = r16
                                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                                r4.<init>()
                                r4.append(r0)
                                java.lang.String r0 = " does not define exactly one abstract method: "
                                r4.append(r0)
                                r4.append(r1)
                                java.lang.String r0 = r4.toString()
                                r3.<init>(r0)
                                throw r3
                            L102:
                                r2 = r16
                                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                                r3.<init>()
                                r3.append(r0)
                                java.lang.String r0 = " is not an interface type"
                                r3.append(r0)
                                java.lang.String r0 = r3.toString()
                                r1.<init>(r0)
                                throw r1
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindProperty(java.lang.Class<T> r1, java.lang.String r2) {
                                r0 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation.OfAnnotationProperty.of(r1, r2)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r1 = r0.bind(r1)
                                return r1
                        }

                        public <T extends java.lang.annotation.Annotation> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindSerialized(java.lang.Class<T> r2, java.io.Serializable r3) {
                                r1 = this;
                                java.lang.Class r0 = r3.getClass()
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bindSerialized(r2, r3, r0)
                                return r2
                        }

                        public <T extends java.lang.annotation.Annotation, S extends java.io.Serializable> net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bindSerialized(java.lang.Class<T> r1, S r2, java.lang.Class<? super S> r3) {
                                r0 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStackManipulation.OfSerializedConstant.of(r1, r2, r3)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r1 = r0.bind(r1)
                                return r1
                        }

                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bootstrap(java.lang.reflect.Constructor<?> r2) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                                r0.<init>(r2)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bootstrap(r0)
                                return r2
                        }

                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bootstrap(java.lang.reflect.Constructor<?> r2, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Factory r3) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                                r0.<init>(r2)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bootstrap(r0, r3)
                                return r2
                        }

                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bootstrap(java.lang.reflect.Method r2) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                                r0.<init>(r2)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bootstrap(r0)
                                return r2
                        }

                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bootstrap(java.lang.reflect.Method r2, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Factory r3) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                                r0.<init>(r2)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bootstrap(r0, r3)
                                return r2
                        }

                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bootstrap(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2) {
                                r1 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$BootstrapArgumentResolver$ForDefaultValues$Factory r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.ForDefaultValues.Factory.INSTANCE
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r2 = r1.bootstrap(r2, r0)
                                return r2
                        }

                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping bootstrap(net.bytebuddy.description.method.MethodDescription.InDefinedShape r2, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.BootstrapArgumentResolver.Factory r3) {
                                r1 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory r2 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForDynamicInvocation.of(r2, r3)
                                java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory<?>> r3 = r1.offsetMappings
                                r0.<init>(r2, r3)
                                return r0
                        }

                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory to(java.lang.reflect.Constructor<?> r2) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                                r0.<init>(r2)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory r2 = r1.to(r0)
                                return r2
                        }

                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory to(java.lang.reflect.Method r2) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                                r0.<init>(r2)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory r2 = r1.to(r0)
                                return r2
                        }

                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory to(net.bytebuddy.description.method.MethodDescription.InDefinedShape r4) {
                                r3 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Factory r0 = r3.dispatcherFactory
                                java.util.ArrayList r1 = new java.util.ArrayList
                                java.util.Map<java.lang.Class<? extends java.lang.annotation.Annotation>, net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory<?>> r2 = r3.offsetMappings
                                java.util.Collection r2 = r2.values()
                                r1.<init>(r2)
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory r4 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.access$500(r4, r0, r1)
                                return r4
                        }
                    }

                    public ForDelegation(net.bytebuddy.description.type.TypeDescription.Generic r1, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Resolved r2, java.util.List<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved> r3) {
                            r0 = this;
                            r0.<init>()
                            r0.returned = r1
                            r0.dispatcher = r2
                            r0.offsetMappings = r3
                            return
                    }

                    public static /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory access$500(net.bytebuddy.description.method.MethodDescription.InDefinedShape r0, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory r1, java.util.List r2) {
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory r0 = to(r0, r1, r2)
                            return r0
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory to(java.lang.reflect.Constructor<?> r1) {
                            net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                            r0.<init>(r1)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory r1 = to(r0)
                            return r1
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory to(java.lang.reflect.Method r1) {
                            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                            r0.<init>(r1)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory r1 = to(r0)
                            return r1
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory to(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                            boolean r0 = r3.isTypeInitializer()
                            if (r0 != 0) goto L11
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory.INSTANCE
                            java.util.List r1 = java.util.Collections.emptyList()
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Factory r3 = to(r3, r0, r1)
                            return r3
                        L11:
                            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                            java.lang.StringBuilder r1 = new java.lang.StringBuilder
                            r1.<init>()
                            java.lang.String r2 = "Cannot delegate to a type initializer: "
                            r1.append(r2)
                            r1.append(r3)
                            java.lang.String r3 = r1.toString()
                            r0.<init>(r3)
                            throw r0
                    }

                    private static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory to(net.bytebuddy.description.method.MethodDescription.InDefinedShape r5, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.Factory r6, java.util.List<? extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory<?>> r7) {
                            boolean r0 = r5.isTypeInitializer()
                            if (r0 != 0) goto L5b
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Factory
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher r6 = r6.make(r5)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfDefaultValue r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStackManipulation$OfDefaultValue
                            java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Unused> r2 = net.bytebuddy.asm.MemberSubstitution.Unused.class
                            r1.<init>(r2)
                            r2 = 11
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Factory[] r2 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Factory[r2]
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForArgument$Factory r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForArgument.Factory.INSTANCE
                            r4 = 0
                            r2[r4] = r3
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForThisReference$Factory r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForThisReference.Factory.INSTANCE
                            r4 = 1
                            r2[r4] = r3
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForAllArguments$Factory r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForAllArguments.Factory.INSTANCE
                            r4 = 2
                            r2[r4] = r3
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForSelfCallHandle$Factory r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForSelfCallHandle.Factory.INSTANCE
                            r4 = 3
                            r2[r4] = r3
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForField$Unresolved$Factory r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForField.Unresolved.Factory.INSTANCE
                            r4 = 4
                            r2[r4] = r3
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$GetterFactory r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.GetterFactory.INSTANCE
                            r4 = 5
                            r2[r4] = r3
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForFieldHandle$Unresolved$SetterFactory r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForFieldHandle.Unresolved.SetterFactory.INSTANCE
                            r4 = 6
                            r2[r4] = r3
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForOrigin$Factory r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForOrigin.Factory.INSTANCE
                            r4 = 7
                            r2[r4] = r3
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForStubValue$Factory r3 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForStubValue.Factory.INSTANCE
                            r4 = 8
                            r2[r4] = r3
                            r3 = 9
                            r2[r3] = r1
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$ForCurrent$Factory r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.ForCurrent.Factory.INSTANCE
                            r3 = 10
                            r2[r3] = r1
                            java.util.List r1 = java.util.Arrays.asList(r2)
                            java.util.List r7 = net.bytebuddy.utility.CompoundList.of(r1, r7)
                            r0.<init>(r5, r6, r7)
                            return r0
                        L5b:
                            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                            java.lang.StringBuilder r7 = new java.lang.StringBuilder
                            r7.<init>()
                            java.lang.String r0 = "Cannot delegate to type initializer: "
                            r7.append(r0)
                            r7.append(r5)
                            java.lang.String r5 = r7.toString()
                            r6.<init>(r5)
                            throw r6
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.WithCustomMapping withCustomMapping() {
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$WithCustomMapping
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$ForRegularInvocation$Factory r1 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.Dispatcher.ForRegularInvocation.Factory.INSTANCE
                            java.util.Map r2 = java.util.Collections.emptyMap()
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
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.returned
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation) r5
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r5.returned
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Resolved r2 = r4.dispatcher
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Resolved r3 = r5.dispatcher
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved> r2 = r4.offsetMappings
                            java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved> r5 = r5.offsetMappings
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
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.returned
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Resolved r1 = r2.dispatcher
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved> r1 = r2.offsetMappings
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution resolve(net.bytebuddy.description.type.TypeDescription r15, net.bytebuddy.description.ByteCodeElement.Member r16, net.bytebuddy.description.type.TypeList.Generic r17, net.bytebuddy.description.type.TypeDescription.Generic r18, net.bytebuddy.utility.JavaConstant.MethodHandle r19, net.bytebuddy.implementation.bytecode.StackManipulation r20, net.bytebuddy.description.type.TypeDescription.Generic r21, java.util.Map<java.lang.Integer, java.lang.Integer> r22, int r23) {
                            r14 = this;
                            r0 = r14
                            java.util.ArrayList r1 = new java.util.ArrayList
                            java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved> r2 = r0.offsetMappings
                            int r2 = r2.size()
                            int r2 = r2 + 3
                            r1.<init>(r2)
                            java.lang.Class r2 = java.lang.Void.TYPE
                            r12 = r21
                            boolean r2 = r12.represents(r2)
                            if (r2 == 0) goto L1d
                            net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r2 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                            r13 = r23
                            goto L27
                        L1d:
                            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r21)
                            r13 = r23
                            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.storeAt(r13)
                        L27:
                            r1.add(r2)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Resolved r2 = r0.dispatcher
                            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.initialize()
                            r1.add(r2)
                            java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved> r2 = r0.offsetMappings
                            java.util.Iterator r2 = r2.iterator()
                        L39:
                            boolean r3 = r2.hasNext()
                            if (r3 == 0) goto L5c
                            java.lang.Object r3 = r2.next()
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$OffsetMapping$Resolved r3 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForDelegation.OffsetMapping.Resolved) r3
                            r4 = r15
                            r5 = r16
                            r6 = r17
                            r7 = r18
                            r8 = r21
                            r9 = r19
                            r10 = r22
                            r11 = r23
                            net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.apply(r4, r5, r6, r7, r8, r9, r10, r11)
                            r1.add(r3)
                            goto L39
                        L5c:
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForDelegation$Dispatcher$Resolved r2 = r0.dispatcher
                            r3 = r15
                            r4 = r16
                            r5 = r19
                            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.apply(r15, r4, r5)
                            r1.add(r2)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r2 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r3.<init>(r1)
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r0.returned
                            r2.<init>(r3, r1)
                            return r2
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static abstract class ForField implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step {
                    protected final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
                    protected final net.bytebuddy.description.field.FieldDescription fieldDescription;
                    protected final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Read extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField {

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class Factory implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory {
                            private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                            public Factory(java.lang.reflect.Field r2) {
                                    r1 = this;
                                    net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                                    r0.<init>(r2)
                                    r1.<init>(r0)
                                    return
                            }

                            public Factory(net.bytebuddy.description.field.FieldDescription r1) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.fieldDescription = r1
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
                                    net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForField$Read$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Read.Factory) r5
                                    net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
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
                                    net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step make(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                                    r0 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForField$Read r3 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForField$Read
                                    net.bytebuddy.description.field.FieldDescription r4 = r0.fieldDescription
                                    r3.<init>(r4, r1, r2)
                                    return r3
                            }
                        }

                        public Read(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                                r0 = this;
                                r0.<init>(r1, r2, r3)
                                return
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution doResolve(net.bytebuddy.description.ByteCodeElement.Member r3, net.bytebuddy.description.type.TypeList.Generic r4, java.util.Map<java.lang.Integer, java.lang.Integer> r5, net.bytebuddy.implementation.bytecode.StackManipulation r6) {
                                r2 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r3 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                net.bytebuddy.description.field.FieldDescription r5 = r2.fieldDescription
                                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r5 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r5)
                                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r5.read()
                                r0 = 2
                                net.bytebuddy.implementation.bytecode.StackManipulation[] r0 = new net.bytebuddy.implementation.bytecode.StackManipulation[r0]
                                r1 = 0
                                r0[r1] = r6
                                r6 = 1
                                r0[r6] = r5
                                r4.<init>(r0)
                                net.bytebuddy.description.field.FieldDescription r5 = r2.fieldDescription
                                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.getType()
                                r3.<init>(r4, r5)
                                return r3
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                                r3 = this;
                                boolean r0 = super.equals(r4)
                                r1 = 0
                                if (r0 != 0) goto L8
                                return r1
                            L8:
                                r0 = 1
                                if (r3 != r4) goto Lc
                                return r0
                            Lc:
                                if (r4 != 0) goto Lf
                                return r1
                            Lf:
                                java.lang.Class r2 = r3.getClass()
                                java.lang.Class r4 = r4.getClass()
                                if (r2 == r4) goto L1a
                                return r1
                            L1a:
                                return r0
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public int hashCode() {
                                r1 = this;
                                int r0 = super.hashCode()
                                return r0
                        }
                    }

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Write extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField {
                        private final int index;

                        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                        public static class Factory implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory {
                            private final net.bytebuddy.description.field.FieldDescription fieldDescription;
                            private final int index;

                            public Factory(java.lang.reflect.Field r2, int r3) {
                                    r1 = this;
                                    net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                                    r0.<init>(r2)
                                    r1.<init>(r0, r3)
                                    return
                            }

                            public Factory(net.bytebuddy.description.field.FieldDescription r1, int r2) {
                                    r0 = this;
                                    r0.<init>()
                                    r0.fieldDescription = r1
                                    r0.index = r2
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
                                    int r2 = r4.index
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForField$Write$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Write.Factory) r5
                                    int r3 = r5.index
                                    if (r2 == r3) goto L1c
                                    return r1
                                L1c:
                                    net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                                    net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
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
                                    net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                                    int r1 = r1.hashCode()
                                    int r0 = r0 + r1
                                    int r0 = r0 * 31
                                    int r1 = r2.index
                                    int r0 = r0 + r1
                                    return r0
                            }

                            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                            public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step make(net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.method.MethodDescription r5) {
                                    r1 = this;
                                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForField$Write r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForField$Write
                                    net.bytebuddy.description.field.FieldDescription r5 = r1.fieldDescription
                                    int r0 = r1.index
                                    r4.<init>(r5, r2, r3, r0)
                                    return r4
                            }
                        }

                        public Write(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, int r4) {
                                r0 = this;
                                r0.<init>(r1, r2, r3)
                                r0.index = r4
                                return
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution doResolve(net.bytebuddy.description.ByteCodeElement.Member r6, net.bytebuddy.description.type.TypeList.Generic r7, java.util.Map<java.lang.Integer, java.lang.Integer> r8, net.bytebuddy.implementation.bytecode.StackManipulation r9) {
                                r5 = this;
                                r0 = 1
                                int r1 = r6.getModifiers()
                                r1 = r1 & 8
                                if (r1 != 0) goto L1a
                                boolean r1 = r6 instanceof net.bytebuddy.description.method.MethodDescription
                                if (r1 == 0) goto L16
                                r1 = r6
                                net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                                boolean r1 = r1.isConstructor()
                                if (r1 != 0) goto L1a
                            L16:
                                int r1 = r5.index
                                int r1 = r1 + r0
                                goto L1c
                            L1a:
                                int r1 = r5.index
                            L1c:
                                int r2 = r7.size()
                                if (r1 >= r2) goto La6
                                net.bytebuddy.implementation.bytecode.assign.Assigner r6 = r5.assigner
                                java.lang.Object r2 = r7.get(r1)
                                net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                                net.bytebuddy.description.field.FieldDescription r3 = r5.fieldDescription
                                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getType()
                                net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r4 = r5.typing
                                net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.assign(r2, r3, r4)
                                boolean r2 = r6.isValid()
                                if (r2 == 0) goto L81
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r2 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                                java.lang.Object r7 = r7.get(r1)
                                net.bytebuddy.description.type.TypeDefinition r7 = (net.bytebuddy.description.type.TypeDefinition) r7
                                net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r7 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r7)
                                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                                java.lang.Object r8 = r8.get(r1)
                                java.lang.Integer r8 = (java.lang.Integer) r8
                                int r8 = r8.intValue()
                                net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.loadFrom(r8)
                                net.bytebuddy.description.field.FieldDescription r8 = r5.fieldDescription
                                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r8 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r8)
                                net.bytebuddy.implementation.bytecode.StackManipulation r8 = r8.write()
                                r1 = 4
                                net.bytebuddy.implementation.bytecode.StackManipulation[] r1 = new net.bytebuddy.implementation.bytecode.StackManipulation[r1]
                                r4 = 0
                                r1[r4] = r9
                                r1[r0] = r7
                                r7 = 2
                                r1[r7] = r6
                                r6 = 3
                                r1[r6] = r8
                                r3.<init>(r1)
                                java.lang.Class r6 = java.lang.Void.TYPE
                                net.bytebuddy.description.type.TypeDescription$Generic r6 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r6)
                                r2.<init>(r3, r6)
                                return r2
                            L81:
                                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                                r8.<init>()
                                java.lang.String r9 = "Cannot write "
                                r8.append(r9)
                                java.lang.Object r7 = r7.get(r1)
                                r8.append(r7)
                                java.lang.String r7 = " to "
                                r8.append(r7)
                                net.bytebuddy.description.field.FieldDescription r7 = r5.fieldDescription
                                r8.append(r7)
                                java.lang.String r7 = r8.toString()
                                r6.<init>(r7)
                                throw r6
                            La6:
                                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                                r8.<init>()
                                r8.append(r6)
                                java.lang.String r6 = " does not define an argument with index "
                                r8.append(r6)
                                r8.append(r1)
                                java.lang.String r6 = r8.toString()
                                r7.<init>(r6)
                                throw r7
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
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
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForField$Write r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Write) r5
                                int r5 = r5.index
                                if (r2 == r5) goto L23
                                return r1
                            L23:
                                return r0
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField
                        public int hashCode() {
                                r2 = this;
                                int r0 = super.hashCode()
                                int r0 = r0 * 31
                                int r1 = r2.index
                                int r0 = r0 + r1
                                return r0
                        }
                    }

                    public ForField(net.bytebuddy.description.field.FieldDescription r1, net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                            r0 = this;
                            r0.<init>()
                            r0.fieldDescription = r1
                            r0.assigner = r2
                            r0.typing = r3
                            return
                    }

                    public abstract net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution doResolve(net.bytebuddy.description.ByteCodeElement.Member r1, net.bytebuddy.description.type.TypeList.Generic r2, java.util.Map<java.lang.Integer, java.lang.Integer> r3, net.bytebuddy.implementation.bytecode.StackManipulation r4);

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
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForField r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField) r5
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                            net.bytebuddy.description.field.FieldDescription r3 = r5.fieldDescription
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
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
                            net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
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

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Field description always has declaring type.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, net.bytebuddy.description.type.TypeDescription.Generic r7, java.util.Map<java.lang.Integer, java.lang.Integer> r8, int r9) {
                            r0 = this;
                            java.util.ArrayList r1 = new java.util.ArrayList
                            r4 = 2
                            r1.<init>(r4)
                            net.bytebuddy.description.field.FieldDescription r4 = r0.fieldDescription
                            boolean r4 = r4.isStatic()
                            if (r4 == 0) goto L16
                            net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.Removal.of(r7)
                            r1.add(r4)
                            goto L31
                        L16:
                            net.bytebuddy.implementation.bytecode.assign.Assigner r4 = r0.assigner
                            net.bytebuddy.description.field.FieldDescription r5 = r0.fieldDescription
                            net.bytebuddy.description.type.TypeDefinition r5 = r5.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.asGenericType()
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r6 = r0.typing
                            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.assign(r7, r5, r6)
                            boolean r5 = r4.isValid()
                            if (r5 == 0) goto L3b
                            r1.add(r4)
                        L31:
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r4 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r4.<init>(r1)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Resolution r1 = r0.doResolve(r2, r3, r8, r4)
                            return r1
                        L3b:
                            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            r2.<init>()
                            java.lang.String r3 = "Cannot assign "
                            r2.append(r3)
                            r2.append(r7)
                            java.lang.String r3 = " to "
                            r2.append(r3)
                            net.bytebuddy.description.field.FieldDescription r3 = r0.fieldDescription
                            net.bytebuddy.description.type.TypeDefinition r3 = r3.getDeclaringType()
                            r2.append(r3)
                            java.lang.String r2 = r2.toString()
                            r1.<init>(r2)
                            throw r1
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForInvocation implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step {
                    private final net.bytebuddy.implementation.bytecode.assign.Assigner assigner;
                    private final net.bytebuddy.description.method.MethodDescription methodDescription;
                    private final java.util.Map<java.lang.Integer, java.lang.Integer> substitutions;
                    private final net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing;

                    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                    public static class Factory implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory {
                        private final net.bytebuddy.description.method.MethodDescription methodDescription;
                        private final java.util.Map<java.lang.Integer, java.lang.Integer> substitutions;

                        public Factory(java.lang.reflect.Constructor<?> r2) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                                r0.<init>(r2)
                                r1.<init>(r0)
                                return
                        }

                        public Factory(java.lang.reflect.Method r2) {
                                r1 = this;
                                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                                r0.<init>(r2)
                                r1.<init>(r0)
                                return
                        }

                        public Factory(net.bytebuddy.description.method.MethodDescription r2) {
                                r1 = this;
                                java.util.Map r0 = java.util.Collections.emptyMap()
                                r1.<init>(r2, r0)
                                return
                        }

                        public Factory(net.bytebuddy.description.method.MethodDescription r1, java.util.Map<java.lang.Integer, java.lang.Integer> r2) {
                                r0 = this;
                                r0.<init>()
                                r0.methodDescription = r1
                                r0.substitutions = r2
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
                                net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForInvocation$Factory r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForInvocation.Factory) r5
                                net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                                boolean r2 = r2.equals(r3)
                                if (r2 != 0) goto L20
                                return r1
                            L20:
                                java.util.Map<java.lang.Integer, java.lang.Integer> r2 = r4.substitutions
                                java.util.Map<java.lang.Integer, java.lang.Integer> r5 = r5.substitutions
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
                                net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                int r0 = r0 * 31
                                java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r2.substitutions
                                int r1 = r1.hashCode()
                                int r0 = r0 + r1
                                return r0
                        }

                        @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                        public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step make(net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3, net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.method.MethodDescription r5) {
                                r1 = this;
                                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForInvocation r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForInvocation
                                net.bytebuddy.description.method.MethodDescription r5 = r1.methodDescription
                                java.util.Map<java.lang.Integer, java.lang.Integer> r0 = r1.substitutions
                                r4.<init>(r5, r0, r2, r3)
                                return r4
                        }
                    }

                    public ForInvocation(net.bytebuddy.description.method.MethodDescription r1, java.util.Map<java.lang.Integer, java.lang.Integer> r2, net.bytebuddy.implementation.bytecode.assign.Assigner r3, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r4) {
                            r0 = this;
                            r0.<init>()
                            r0.methodDescription = r1
                            r0.substitutions = r2
                            r0.assigner = r3
                            r0.typing = r4
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
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$ForInvocation r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForInvocation) r5
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                            net.bytebuddy.description.method.MethodDescription r3 = r5.methodDescription
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            java.util.Map<java.lang.Integer, java.lang.Integer> r2 = r4.substitutions
                            java.util.Map<java.lang.Integer, java.lang.Integer> r3 = r5.substitutions
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L36
                            return r1
                        L36:
                            net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                            net.bytebuddy.implementation.bytecode.assign.Assigner r5 = r5.assigner
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
                            net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r2.substitutions
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

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution resolve(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.ByteCodeElement.Member r5, net.bytebuddy.description.type.TypeList.Generic r6, net.bytebuddy.description.type.TypeDescription.Generic r7, net.bytebuddy.utility.JavaConstant.MethodHandle r8, net.bytebuddy.implementation.bytecode.StackManipulation r9, net.bytebuddy.description.type.TypeDescription.Generic r10, java.util.Map<java.lang.Integer, java.lang.Integer> r11, int r12) {
                            r3 = this;
                            java.util.ArrayList r4 = new java.util.ArrayList
                            int r7 = r6.size()
                            int r7 = r7 * 2
                            int r7 = r7 + 3
                            r4.<init>(r7)
                            net.bytebuddy.description.method.MethodDescription r7 = r3.methodDescription
                            boolean r7 = r7.isStatic()
                            java.lang.String r8 = " to "
                            if (r7 == 0) goto L1f
                            net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.Removal.of(r10)
                            r4.add(r7)
                            goto L5b
                        L1f:
                            net.bytebuddy.description.method.MethodDescription r7 = r3.methodDescription
                            boolean r7 = r7.isConstructor()
                            if (r7 == 0) goto L40
                            net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.Removal.of(r10)
                            r4.add(r7)
                            net.bytebuddy.description.method.MethodDescription r7 = r3.methodDescription
                            net.bytebuddy.description.type.TypeDefinition r7 = r7.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                            net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r7)
                            r4.add(r7)
                            goto L5b
                        L40:
                            net.bytebuddy.implementation.bytecode.assign.Assigner r7 = r3.assigner
                            net.bytebuddy.description.method.MethodDescription r9 = r3.methodDescription
                            net.bytebuddy.description.type.TypeDefinition r9 = r9.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription$Generic r9 = r9.asGenericType()
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r12 = r3.typing
                            net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.assign(r10, r9, r12)
                            boolean r9 = r7.isValid()
                            if (r9 == 0) goto L151
                            r4.add(r7)
                        L5b:
                            int r7 = r5.getModifiers()
                            r7 = r7 & 8
                            r9 = 0
                            if (r7 != 0) goto L73
                            boolean r7 = r5 instanceof net.bytebuddy.description.method.MethodDescription
                            if (r7 == 0) goto L71
                            r7 = r5
                            net.bytebuddy.description.method.MethodDescription r7 = (net.bytebuddy.description.method.MethodDescription) r7
                            boolean r7 = r7.isConstructor()
                            if (r7 != 0) goto L73
                        L71:
                            r7 = 1
                            goto L74
                        L73:
                            r7 = r9
                        L74:
                            net.bytebuddy.description.method.MethodDescription r10 = r3.methodDescription
                            net.bytebuddy.description.method.ParameterList r10 = r10.getParameters()
                            int r10 = r10.size()
                            if (r9 >= r10) goto L137
                            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r3.substitutions
                            int r12 = r9 + r7
                            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                            boolean r10 = r10.containsKey(r12)
                            if (r10 == 0) goto La1
                            java.util.Map<java.lang.Integer, java.lang.Integer> r10 = r3.substitutions
                            int r12 = r9 + r7
                            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                            java.lang.Object r10 = r10.get(r12)
                            java.lang.Integer r10 = (java.lang.Integer) r10
                            int r10 = r10.intValue()
                            goto La3
                        La1:
                            int r10 = r9 + r7
                        La3:
                            int r12 = r6.size()
                            if (r10 >= r12) goto L11d
                            java.lang.Object r12 = r6.get(r10)
                            net.bytebuddy.description.type.TypeDefinition r12 = (net.bytebuddy.description.type.TypeDefinition) r12
                            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r12 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r12)
                            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
                            java.lang.Object r0 = r11.get(r0)
                            java.lang.Integer r0 = (java.lang.Integer) r0
                            int r0 = r0.intValue()
                            net.bytebuddy.implementation.bytecode.StackManipulation r12 = r12.loadFrom(r0)
                            r4.add(r12)
                            net.bytebuddy.implementation.bytecode.assign.Assigner r12 = r3.assigner
                            java.lang.Object r0 = r6.get(r10)
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                            net.bytebuddy.description.method.MethodDescription r1 = r3.methodDescription
                            net.bytebuddy.description.method.ParameterList r1 = r1.getParameters()
                            java.lang.Object r1 = r1.get(r9)
                            net.bytebuddy.description.method.ParameterDescription r1 = (net.bytebuddy.description.method.ParameterDescription) r1
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r1.getType()
                            net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r3.typing
                            net.bytebuddy.implementation.bytecode.StackManipulation r12 = r12.assign(r0, r1, r2)
                            boolean r0 = r12.isValid()
                            if (r0 == 0) goto Lf2
                            r4.add(r12)
                            int r9 = r9 + 1
                            goto L74
                        Lf2:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r5 = new java.lang.StringBuilder
                            r5.<init>()
                            java.lang.String r7 = "Cannot assign parameter with "
                            r5.append(r7)
                            r5.append(r9)
                            java.lang.String r7 = " of type "
                            r5.append(r7)
                            java.lang.Object r6 = r6.get(r10)
                            r5.append(r6)
                            r5.append(r8)
                            net.bytebuddy.description.method.MethodDescription r6 = r3.methodDescription
                            r5.append(r6)
                            java.lang.String r5 = r5.toString()
                            r4.<init>(r5)
                            throw r4
                        L11d:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r6 = new java.lang.StringBuilder
                            r6.<init>()
                            r6.append(r5)
                            java.lang.String r5 = " does not support an index "
                            r6.append(r5)
                            r6.append(r10)
                            java.lang.String r5 = r6.toString()
                            r4.<init>(r5)
                            throw r4
                        L137:
                            net.bytebuddy.description.method.MethodDescription r5 = r3.methodDescription
                            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r5 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r5)
                            r4.add(r5)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r5 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r6 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r6.<init>(r4)
                            net.bytebuddy.description.method.MethodDescription r4 = r3.methodDescription
                            net.bytebuddy.description.type.TypeDescription$Generic r4 = r4.getReturnType()
                            r5.<init>(r6, r4)
                            return r5
                        L151:
                            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r5 = new java.lang.StringBuilder
                            r5.<init>()
                            java.lang.String r6 = "Cannot assign "
                            r5.append(r6)
                            r5.append(r10)
                            r5.append(r8)
                            net.bytebuddy.description.method.MethodDescription r6 = r3.methodDescription
                            net.bytebuddy.description.type.TypeDefinition r6 = r6.getDeclaringType()
                            r5.append(r6)
                            java.lang.String r5 = r5.toString()
                            r4.<init>(r5)
                            throw r4
                    }
                }

                public enum OfOriginalExpression extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory {
                    private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression[] $VALUES = null;
                    public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression INSTANCE = null;

                    static {
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression
                            java.lang.String r1 = "INSTANCE"
                            r2 = 0
                            r0.<init>(r1, r2)
                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression.INSTANCE = r0
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression[]{r0}
                            net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression.$VALUES = r0
                            return
                    }

                    OfOriginalExpression(java.lang.String r1, int r2) {
                            r0 = this;
                            r0.<init>(r1, r2)
                            return
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression valueOf(java.lang.String r1) {
                            java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression.class
                            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression) r1
                            return r1
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression[] values() {
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression.$VALUES
                            java.lang.Object r0 = r0.clone()
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.OfOriginalExpression[]) r0
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step make(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                            r0 = this;
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, net.bytebuddy.description.type.TypeDescription.Generic r7, java.util.Map<java.lang.Integer, java.lang.Integer> r8, int r9) {
                            r0 = this;
                            boolean r1 = r2 instanceof net.bytebuddy.description.method.MethodDescription
                            if (r1 == 0) goto L34
                            r4 = r2
                            net.bytebuddy.description.method.MethodDescription r4 = (net.bytebuddy.description.method.MethodDescription) r4
                            boolean r4 = r4.isConstructor()
                            if (r4 == 0) goto L34
                            java.util.ArrayList r4 = new java.util.ArrayList
                            int r5 = r3.size()
                            int r5 = r5 + 4
                            r4.<init>(r5)
                            net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.Removal.of(r7)
                            r4.add(r5)
                            net.bytebuddy.description.type.TypeDefinition r5 = r2.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                            net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r5)
                            r4.add(r5)
                            net.bytebuddy.implementation.bytecode.Duplication r5 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                            r4.add(r5)
                            goto L46
                        L34:
                            java.util.ArrayList r4 = new java.util.ArrayList
                            int r5 = r3.size()
                            int r5 = r5 + 4
                            r4.<init>(r5)
                            net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.Removal.of(r7)
                            r4.add(r5)
                        L46:
                            r5 = 0
                        L47:
                            int r7 = r3.size()
                            if (r5 >= r7) goto L6f
                            java.lang.Object r7 = r3.get(r5)
                            net.bytebuddy.description.type.TypeDefinition r7 = (net.bytebuddy.description.type.TypeDefinition) r7
                            net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r7 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r7)
                            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
                            java.lang.Object r9 = r8.get(r9)
                            java.lang.Integer r9 = (java.lang.Integer) r9
                            int r9 = r9.intValue()
                            net.bytebuddy.implementation.bytecode.StackManipulation r7 = r7.loadFrom(r9)
                            r4.add(r7)
                            int r5 = r5 + 1
                            goto L47
                        L6f:
                            if (r1 == 0) goto L95
                            r4.add(r6)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r3.<init>(r4)
                            r4 = r2
                            net.bytebuddy.description.method.MethodDescription r4 = (net.bytebuddy.description.method.MethodDescription) r4
                            boolean r5 = r4.isConstructor()
                            if (r5 == 0) goto L8d
                            net.bytebuddy.description.type.TypeDefinition r2 = r2.getDeclaringType()
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
                            goto L91
                        L8d:
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.getReturnType()
                        L91:
                            r1.<init>(r3, r2)
                            return r1
                        L95:
                            boolean r1 = r2 instanceof net.bytebuddy.description.field.FieldDescription
                            if (r1 == 0) goto L10e
                            boolean r1 = r2.isStatic()
                            if (r1 == 0) goto Lcd
                            boolean r1 = r3.isEmpty()
                            if (r1 == 0) goto Lb9
                            r4.add(r6)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r3.<init>(r4)
                            net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                            r1.<init>(r3, r2)
                            return r1
                        Lb9:
                            r4.add(r6)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r2.<init>(r4)
                            java.lang.Class r3 = java.lang.Void.TYPE
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r3)
                            r1.<init>(r2, r3)
                            return r1
                        Lcd:
                            int r1 = r3.size()
                            r3 = 1
                            if (r1 != r3) goto Lf0
                            net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                            net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r2)
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.read()
                            r4.add(r1)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r3.<init>(r4)
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.getType()
                            r1.<init>(r3, r2)
                            return r1
                        Lf0:
                            net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                            net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r1 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r2)
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.write()
                            r4.add(r1)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            r2.<init>(r4)
                            java.lang.Class r3 = java.lang.Void.TYPE
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r3)
                            r1.<init>(r2, r3)
                            return r1
                        L10e:
                            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r4 = "Unexpected target type: "
                            r3.append(r4)
                            r3.append(r2)
                            java.lang.String r2 = r3.toString()
                            r1.<init>(r2)
                            throw r1
                    }
                }

                public interface Resolution {
                    net.bytebuddy.description.type.TypeDescription.Generic getResultType();

                    net.bytebuddy.implementation.bytecode.StackManipulation getStackManipulation();
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Simple implements net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution, net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory {
                    private final net.bytebuddy.description.type.TypeDescription.Generic resultType;
                    private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;

                    public Simple(net.bytebuddy.implementation.bytecode.StackManipulation r1, java.lang.reflect.Type r2) {
                            r0 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r2)
                            r0.<init>(r1, r2)
                            return
                    }

                    public Simple(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription.Generic r2) {
                            r0 = this;
                            r0.<init>()
                            r0.stackManipulation = r1
                            r0.resultType = r2
                            return
                    }

                    public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory of(java.lang.Object r2) {
                            net.bytebuddy.utility.ConstantValue r2 = net.bytebuddy.utility.ConstantValue.Simple.wrap(r2)
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation r1 = r2.toStackManipulation()
                            net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeDescription()
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r2.asGenericType()
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
                            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r4.stackManipulation
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Simple) r5
                            net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.stackManipulation
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.resultType
                            net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.resultType
                            boolean r5 = r2.equals(r5)
                            if (r5 != 0) goto L2b
                            return r1
                        L2b:
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution
                    public net.bytebuddy.description.type.TypeDescription.Generic getResultType() {
                            r1 = this;
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = r1.resultType
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution
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
                            net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.resultType
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step make(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4) {
                            r0 = this;
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step
                    public net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, net.bytebuddy.description.type.TypeDescription.Generic r7, java.util.Map<java.lang.Integer, java.lang.Integer> r8, int r9) {
                            r0 = this;
                            java.lang.Class r2 = java.lang.Void.TYPE
                            boolean r1 = r1.represents(r2)
                            if (r1 == 0) goto La
                            r1 = r0
                            goto L25
                        La:
                            net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple r1 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Simple
                            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                            net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.Removal.of(r7)
                            net.bytebuddy.implementation.bytecode.StackManipulation r4 = r0.stackManipulation
                            r5 = 2
                            net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
                            r6 = 0
                            r5[r6] = r3
                            r3 = 1
                            r5[r3] = r4
                            r2.<init>(r5)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.resultType
                            r1.<init>(r2, r3)
                        L25:
                            return r1
                    }
                }

                net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Resolution resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, net.bytebuddy.description.type.TypeDescription.Generic r7, java.util.Map<java.lang.Integer, java.lang.Integer> r8, int r9);
            }

            public Chain(net.bytebuddy.implementation.bytecode.assign.Assigner r1, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r2, java.util.List<net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step> r3) {
                    r0 = this;
                    r0.<init>()
                    r0.assigner = r1
                    r0.typing = r2
                    r0.steps = r3
                    return
            }

            public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Factory with(net.bytebuddy.implementation.bytecode.assign.Assigner r2, net.bytebuddy.implementation.bytecode.assign.Assigner.Typing r3) {
                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Factory r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Factory
                    java.util.List r1 = java.util.Collections.emptyList()
                    r0.<init>(r2, r3, r1)
                    return r0
            }

            public static net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Factory withDefaultAssigner() {
                    net.bytebuddy.implementation.bytecode.assign.Assigner r0 = net.bytebuddy.implementation.bytecode.assign.Assigner.DEFAULT
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC
                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Factory r0 = with(r0, r1)
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
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r4.typing
                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain) r5
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r3 = r5.typing
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.bytecode.assign.Assigner r2 = r4.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner r3 = r5.assigner
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step> r2 = r4.steps
                    java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step> r5 = r5.steps
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
                    net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r2.assigner
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r1 = r2.typing
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step> r1 = r2.steps
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r18, net.bytebuddy.description.ByteCodeElement.Member r19, net.bytebuddy.description.type.TypeList.Generic r20, net.bytebuddy.description.type.TypeDescription.Generic r21, net.bytebuddy.utility.JavaConstant.MethodHandle r22, net.bytebuddy.implementation.bytecode.StackManipulation r23, int r24) {
                    r17 = this;
                    r0 = r17
                    r11 = r20
                    r12 = r21
                    java.util.ArrayList r13 = new java.util.ArrayList
                    int r1 = r20.size()
                    int r1 = r1 + 1
                    java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step> r2 = r0.steps
                    int r2 = r2.size()
                    r3 = 2
                    int r2 = r2 * r3
                    int r1 = r1 + r2
                    java.lang.Class r2 = java.lang.Void.TYPE
                    boolean r2 = r12.represents(r2)
                    if (r2 == 0) goto L20
                    r3 = 0
                L20:
                    int r1 = r1 + r3
                    r13.<init>(r1)
                    java.util.HashMap r14 = new java.util.HashMap
                    r14.<init>()
                    int r1 = r20.size()
                    int r1 = r1 + (-1)
                    r15 = r24
                L31:
                    if (r1 < 0) goto L61
                    java.lang.Object r2 = r11.get(r1)
                    net.bytebuddy.description.type.TypeDefinition r2 = (net.bytebuddy.description.type.TypeDefinition) r2
                    net.bytebuddy.implementation.bytecode.member.MethodVariableAccess r2 = net.bytebuddy.implementation.bytecode.member.MethodVariableAccess.of(r2)
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.storeAt(r15)
                    r13.add(r2)
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r15)
                    r14.put(r2, r3)
                    java.lang.Object r2 = r11.get(r1)
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = (net.bytebuddy.description.type.TypeDescription.Generic) r2
                    net.bytebuddy.implementation.bytecode.StackSize r2 = r2.getStackSize()
                    int r2 = r2.getSize()
                    int r15 = r15 + r2
                    int r1 = r1 + (-1)
                    goto L31
                L61:
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r21)
                    r13.add(r1)
                    java.util.List<net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step> r1 = r0.steps
                    java.util.Iterator r16 = r1.iterator()
                    r8 = r12
                L6f:
                    boolean r1 = r16.hasNext()
                    if (r1 == 0) goto L99
                    java.lang.Object r1 = r16.next()
                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step) r1
                    r2 = r18
                    r3 = r19
                    r4 = r20
                    r5 = r21
                    r6 = r22
                    r7 = r23
                    r9 = r14
                    r10 = r15
                    net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Step$Resolution r1 = r1.resolve(r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r1.getStackManipulation()
                    r13.add(r2)
                    net.bytebuddy.description.type.TypeDescription$Generic r8 = r1.getResultType()
                    goto L6f
                L99:
                    net.bytebuddy.implementation.bytecode.assign.Assigner r1 = r0.assigner
                    net.bytebuddy.implementation.bytecode.assign.Assigner$Typing r2 = r0.typing
                    net.bytebuddy.implementation.bytecode.StackManipulation r1 = r1.assign(r8, r12, r2)
                    boolean r2 = r1.isValid()
                    if (r2 == 0) goto Lb0
                    r13.add(r1)
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r1 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    r1.<init>(r13)
                    return r1
                Lb0:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Failed to assign "
                    r2.append(r3)
                    r2.append(r8)
                    java.lang.String r3 = " to "
                    r2.append(r3)
                    r2.append(r12)
                    java.lang.String r2 = r2.toString()
                    r1.<init>(r2)
                    throw r1
            }
        }

        public interface Factory {
            net.bytebuddy.asm.MemberSubstitution.Substitution make(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.pool.TypePool r3);
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForFieldAccess implements net.bytebuddy.asm.MemberSubstitution.Substitution {
            private final net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver fieldResolver;
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;

            public interface FieldResolver {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class ForElementMatcher implements net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver {
                    private final net.bytebuddy.description.type.TypeDescription instrumentedType;
                    private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> matcher;

                    public ForElementMatcher(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2) {
                            r0 = this;
                            r0.<init>()
                            r0.instrumentedType = r1
                            r0.matcher = r2
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
                            net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                            net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$FieldResolver$ForElementMatcher r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver.ForElementMatcher) r5
                            net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.matcher
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r5 = r5.matcher
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
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r2.matcher
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver
                    public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.ByteCodeElement.Member r3, net.bytebuddy.description.type.TypeList.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5) {
                            r1 = this;
                            boolean r5 = r4.isEmpty()
                            if (r5 != 0) goto Lbe
                            r5 = 0
                            java.lang.Object r0 = r4.get(r5)
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                            boolean r0 = r0.isPrimitive()
                            if (r0 != 0) goto La7
                            java.lang.Object r0 = r4.get(r5)
                            net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                            boolean r0 = r0.isArray()
                            if (r0 != 0) goto La7
                            java.lang.Object r3 = r4.get(r5)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForReplacement r4 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForReplacement
                            net.bytebuddy.description.type.TypeDescription r5 = r1.instrumentedType
                            r4.<init>(r5)
                            java.lang.Object r3 = r3.accept(r4)
                            net.bytebuddy.description.type.TypeDefinition r3 = (net.bytebuddy.description.type.TypeDefinition) r3
                        L32:
                            net.bytebuddy.description.field.FieldList r4 = r3.getDeclaredFields()
                            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.isStatic()
                            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.not(r5)
                            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r0)
                            net.bytebuddy.matcher.ElementMatcher$Junction r5 = r5.and(r0)
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r0 = r1.matcher
                            net.bytebuddy.matcher.ElementMatcher$Junction r5 = r5.and(r0)
                            net.bytebuddy.matcher.FilterableList r4 = r4.filter(r5)
                            net.bytebuddy.description.field.FieldList r4 = (net.bytebuddy.description.field.FieldList) r4
                            int r5 = r4.size()
                            r0 = 1
                            if (r5 != r0) goto L62
                            java.lang.Object r2 = r4.getOnly()
                            net.bytebuddy.description.field.FieldDescription r2 = (net.bytebuddy.description.field.FieldDescription) r2
                            return r2
                        L62:
                            int r5 = r4.size()
                            if (r5 > r0) goto L90
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.getSuperClass()
                            if (r3 == 0) goto L6f
                            goto L32
                        L6f:
                            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder
                            r4.<init>()
                            java.lang.String r5 = "Cannot locate field matching "
                            r4.append(r5)
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r5 = r1.matcher
                            r4.append(r5)
                            java.lang.String r5 = " on "
                            r4.append(r5)
                            r4.append(r2)
                            java.lang.String r2 = r4.toString()
                            r3.<init>(r2)
                            throw r3
                        L90:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r3 = new java.lang.StringBuilder
                            r3.<init>()
                            java.lang.String r5 = "Ambiguous field location of "
                            r3.append(r5)
                            r3.append(r4)
                            java.lang.String r3 = r3.toString()
                            r2.<init>(r3)
                            throw r2
                        La7:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder
                            r4.<init>()
                            java.lang.String r5 = "Cannot access field on primitive or array type for "
                            r4.append(r5)
                            r4.append(r3)
                            java.lang.String r3 = r4.toString()
                            r2.<init>(r3)
                            throw r2
                        Lbe:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder
                            r4.<init>()
                            java.lang.String r5 = "Cannot substitute parameterless instruction with "
                            r4.append(r5)
                            r4.append(r3)
                            java.lang.String r3 = r4.toString()
                            r2.<init>(r3)
                            throw r2
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Simple implements net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver {
                    private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                    public Simple(net.bytebuddy.description.field.FieldDescription r1) {
                            r0 = this;
                            r0.<init>()
                            r0.fieldDescription = r1
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
                            net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                            net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$FieldResolver$Simple r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver.Simple) r5
                            net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
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
                            net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver
                    public net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4) {
                            r0 = this;
                            net.bytebuddy.description.field.FieldDescription r1 = r0.fieldDescription
                            return r1
                    }
                }

                net.bytebuddy.description.field.FieldDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4);
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfGivenField implements net.bytebuddy.asm.MemberSubstitution.Substitution.Factory {
                private final net.bytebuddy.description.field.FieldDescription fieldDescription;

                public OfGivenField(net.bytebuddy.description.field.FieldDescription r1) {
                        r0 = this;
                        r0.<init>()
                        r0.fieldDescription = r1
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
                        net.bytebuddy.description.field.FieldDescription r2 = r4.fieldDescription
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$OfGivenField r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.OfGivenField) r5
                        net.bytebuddy.description.field.FieldDescription r5 = r5.fieldDescription
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
                        net.bytebuddy.description.field.FieldDescription r1 = r2.fieldDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public net.bytebuddy.asm.MemberSubstitution.Substitution make(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.pool.TypePool r4) {
                        r1 = this;
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess r3 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$FieldResolver$Simple r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$FieldResolver$Simple
                        net.bytebuddy.description.field.FieldDescription r0 = r1.fieldDescription
                        r4.<init>(r0)
                        r3.<init>(r2, r4)
                        return r3
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfMatchedField implements net.bytebuddy.asm.MemberSubstitution.Substitution.Factory {
                private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> matcher;

                public OfMatchedField(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1) {
                        r0 = this;
                        r0.<init>()
                        r0.matcher = r1
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.matcher
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$OfMatchedField r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.OfMatchedField) r5
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r5 = r5.matcher
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r2.matcher
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public net.bytebuddy.asm.MemberSubstitution.Substitution make(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.pool.TypePool r4) {
                        r1 = this;
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess r3 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$FieldResolver$ForElementMatcher r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$FieldResolver$ForElementMatcher
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r0 = r1.matcher
                        r4.<init>(r2, r0)
                        r3.<init>(r2, r4)
                        return r3
                }
            }

            public ForFieldAccess(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess.FieldResolver r2) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    r0.fieldResolver = r2
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForFieldAccess) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$FieldResolver r2 = r4.fieldResolver
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$FieldResolver r5 = r5.fieldResolver
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
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$FieldResolver r1 = r2.fieldResolver
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.description.ByteCodeElement.Member r5, net.bytebuddy.description.type.TypeList.Generic r6, net.bytebuddy.description.type.TypeDescription.Generic r7, net.bytebuddy.utility.JavaConstant.MethodHandle r8, net.bytebuddy.implementation.bytecode.StackManipulation r9, int r10) {
                    r3 = this;
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$FieldResolver r8 = r3.fieldResolver
                    net.bytebuddy.description.field.FieldDescription r4 = r8.resolve(r4, r5, r6, r7)
                    net.bytebuddy.description.type.TypeDescription r5 = r3.instrumentedType
                    boolean r5 = r4.isAccessibleTo(r5)
                    if (r5 == 0) goto L170
                    java.lang.Class r5 = java.lang.Void.TYPE
                    boolean r5 = r7.represents(r5)
                    java.lang.String r8 = " on "
                    java.lang.String r9 = " with "
                    r10 = 0
                    java.lang.String r0 = "Cannot set "
                    r1 = 1
                    if (r5 == 0) goto Ld2
                    int r5 = r6.size()
                    boolean r7 = r4.isStatic()
                    if (r7 == 0) goto L2a
                    r7 = r1
                    goto L2b
                L2a:
                    r7 = 2
                L2b:
                    if (r5 != r7) goto Lb7
                    boolean r5 = r4.isStatic()
                    if (r5 != 0) goto L6b
                    java.lang.Object r5 = r6.get(r10)
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                    net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                    net.bytebuddy.description.type.TypeDefinition r7 = r4.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                    boolean r5 = r5.isAssignableTo(r7)
                    if (r5 == 0) goto L4c
                    goto L6b
                L4c:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r0)
                    r7.append(r4)
                    r7.append(r8)
                    java.lang.Object r4 = r6.get(r10)
                    r7.append(r4)
                    java.lang.String r4 = r7.toString()
                    r5.<init>(r4)
                    throw r5
                L6b:
                    boolean r5 = r4.isStatic()
                    r5 = r5 ^ r1
                    java.lang.Object r5 = r6.get(r5)
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                    net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                    net.bytebuddy.description.type.TypeDescription$Generic r7 = r4.getType()
                    net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                    boolean r5 = r5.isAssignableTo(r7)
                    if (r5 == 0) goto L91
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.write()
                    return r4
                L91:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r0)
                    r7.append(r4)
                    java.lang.String r8 = " to "
                    r7.append(r8)
                    boolean r4 = r4.isStatic()
                    r4 = r4 ^ r1
                    java.lang.Object r4 = r6.get(r4)
                    r7.append(r4)
                    java.lang.String r4 = r7.toString()
                    r5.<init>(r4)
                    throw r5
                Lb7:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r0)
                    r7.append(r4)
                    r7.append(r9)
                    r7.append(r6)
                    java.lang.String r4 = r7.toString()
                    r5.<init>(r4)
                    throw r5
                Ld2:
                    int r5 = r6.size()
                    boolean r2 = r4.isStatic()
                    r1 = r1 ^ r2
                    if (r5 != r1) goto L155
                    boolean r5 = r4.isStatic()
                    java.lang.String r9 = "Cannot get "
                    if (r5 != 0) goto L11d
                    java.lang.Object r5 = r6.get(r10)
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                    net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                    net.bytebuddy.description.type.TypeDefinition r0 = r4.getDeclaringType()
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    boolean r5 = r5.isAssignableTo(r0)
                    if (r5 == 0) goto Lfe
                    goto L11d
                Lfe:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r9)
                    r7.append(r4)
                    r7.append(r8)
                    java.lang.Object r4 = r6.get(r10)
                    r7.append(r4)
                    java.lang.String r4 = r7.toString()
                    r5.<init>(r4)
                    throw r5
                L11d:
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r4.getType()
                    net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                    net.bytebuddy.description.type.TypeDescription r6 = r7.asErasure()
                    boolean r5 = r5.isAssignableTo(r6)
                    if (r5 == 0) goto L138
                    net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r4 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r4)
                    net.bytebuddy.implementation.bytecode.StackManipulation r4 = r4.read()
                    return r4
                L138:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    r6.append(r9)
                    r6.append(r4)
                    java.lang.String r4 = " as "
                    r6.append(r4)
                    r6.append(r7)
                    java.lang.String r4 = r6.toString()
                    r5.<init>(r4)
                    throw r5
                L155:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    r7.append(r0)
                    r7.append(r4)
                    r7.append(r9)
                    r7.append(r6)
                    java.lang.String r4 = r7.toString()
                    r5.<init>(r4)
                    throw r5
                L170:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r6 = new java.lang.StringBuilder
                    r6.<init>()
                    net.bytebuddy.description.type.TypeDescription r7 = r3.instrumentedType
                    r6.append(r7)
                    java.lang.String r7 = " cannot access "
                    r6.append(r7)
                    r6.append(r4)
                    java.lang.String r4 = r6.toString()
                    r5.<init>(r4)
                    throw r5
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodInvocation implements net.bytebuddy.asm.MemberSubstitution.Substitution {
            private final net.bytebuddy.description.type.TypeDescription instrumentedType;
            private final net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver methodResolver;

            public interface MethodResolver {

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Matching implements net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver {
                    private final net.bytebuddy.description.type.TypeDescription instrumentedType;
                    private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
                    private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;

                    public Matching(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3) {
                            r0 = this;
                            r0.<init>()
                            r0.instrumentedType = r1
                            r0.methodGraphCompiler = r2
                            r0.matcher = r3
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
                            net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                            net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver$Matching r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver.Matching) r5
                            net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L20
                            return r1
                        L20:
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r5.methodGraphCompiler
                            boolean r2 = r2.equals(r3)
                            if (r2 != 0) goto L2b
                            return r1
                        L2b:
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r5.matcher
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
                            net.bytebuddy.description.type.TypeDescription r1 = r2.instrumentedType
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r2.methodGraphCompiler
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            int r0 = r0 * 31
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver
                    public net.bytebuddy.description.method.MethodDescription resolve(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.ByteCodeElement.Member r3, net.bytebuddy.description.type.TypeList.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5) {
                            r1 = this;
                            boolean r2 = r4.isEmpty()
                            if (r2 != 0) goto Lae
                            r2 = 0
                            java.lang.Object r5 = r4.get(r2)
                            net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                            boolean r5 = r5.isPrimitive()
                            if (r5 != 0) goto L97
                            java.lang.Object r5 = r4.get(r2)
                            net.bytebuddy.description.type.TypeDescription$Generic r5 = (net.bytebuddy.description.type.TypeDescription.Generic) r5
                            boolean r5 = r5.isArray()
                            if (r5 != 0) goto L97
                            java.lang.Object r3 = r4.get(r2)
                            net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                            net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForReplacement r4 = new net.bytebuddy.description.type.TypeDescription$Generic$Visitor$Substitutor$ForReplacement
                            net.bytebuddy.description.type.TypeDescription r5 = r1.instrumentedType
                            r4.<init>(r5)
                            java.lang.Object r3 = r3.accept(r4)
                            net.bytebuddy.description.type.TypeDefinition r3 = (net.bytebuddy.description.type.TypeDefinition) r3
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r4 = r1.methodGraphCompiler
                            net.bytebuddy.description.type.TypeDescription r5 = r1.instrumentedType
                            net.bytebuddy.dynamic.scaffold.MethodGraph$Linked r4 = r4.compile(r3, r5)
                            net.bytebuddy.dynamic.scaffold.MethodGraph$NodeList r4 = r4.listNodes()
                            net.bytebuddy.description.method.MethodList r4 = r4.asMethodList()
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r1.matcher
                            net.bytebuddy.matcher.FilterableList r4 = r4.filter(r5)
                            net.bytebuddy.description.method.MethodList r3 = r3.getDeclaredMethods()
                            net.bytebuddy.matcher.ElementMatcher$Junction r5 = net.bytebuddy.matcher.ElementMatchers.isPrivate()
                            net.bytebuddy.description.type.TypeDescription r0 = r1.instrumentedType
                            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isVisibleTo(r0)
                            net.bytebuddy.matcher.ElementMatcher$Junction r5 = r5.and(r0)
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r0 = r1.matcher
                            net.bytebuddy.matcher.ElementMatcher$Junction r5 = r5.and(r0)
                            net.bytebuddy.matcher.FilterableList r3 = r3.filter(r5)
                            java.util.List r3 = net.bytebuddy.utility.CompoundList.of(r4, r3)
                            int r4 = r3.size()
                            r5 = 1
                            if (r4 != r5) goto L76
                            java.lang.Object r2 = r3.get(r2)
                            net.bytebuddy.description.method.MethodDescription r2 = (net.bytebuddy.description.method.MethodDescription) r2
                            return r2
                        L76:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder
                            r4.<init>()
                            java.lang.String r5 = "Not exactly one method that matches "
                            r4.append(r5)
                            net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r1.matcher
                            r4.append(r5)
                            java.lang.String r5 = ": "
                            r4.append(r5)
                            r4.append(r3)
                            java.lang.String r3 = r4.toString()
                            r2.<init>(r3)
                            throw r2
                        L97:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder
                            r4.<init>()
                            java.lang.String r5 = "Cannot invoke method on primitive or array type for "
                            r4.append(r5)
                            r4.append(r3)
                            java.lang.String r3 = r4.toString()
                            r2.<init>(r3)
                            throw r2
                        Lae:
                            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                            java.lang.StringBuilder r4 = new java.lang.StringBuilder
                            r4.<init>()
                            java.lang.String r5 = "Cannot substitute parameterless instruction with "
                            r4.append(r5)
                            r4.append(r3)
                            java.lang.String r3 = r4.toString()
                            r2.<init>(r3)
                            throw r2
                    }
                }

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
                public static class Simple implements net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver {
                    private final net.bytebuddy.description.method.MethodDescription methodDescription;

                    public Simple(net.bytebuddy.description.method.MethodDescription r1) {
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
                            net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                            net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver$Simple r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver.Simple) r5
                            net.bytebuddy.description.method.MethodDescription r5 = r5.methodDescription
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
                            net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                            int r1 = r1.hashCode()
                            int r0 = r0 + r1
                            return r0
                    }

                    @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver
                    public net.bytebuddy.description.method.MethodDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4) {
                            r0 = this;
                            net.bytebuddy.description.method.MethodDescription r1 = r0.methodDescription
                            return r1
                    }
                }

                net.bytebuddy.description.method.MethodDescription resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4);
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfGivenMethod implements net.bytebuddy.asm.MemberSubstitution.Substitution.Factory {
                private final net.bytebuddy.description.method.MethodDescription methodDescription;

                public OfGivenMethod(net.bytebuddy.description.method.MethodDescription r1) {
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
                        net.bytebuddy.description.method.MethodDescription r2 = r4.methodDescription
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfGivenMethod r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfGivenMethod) r5
                        net.bytebuddy.description.method.MethodDescription r5 = r5.methodDescription
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
                        net.bytebuddy.description.method.MethodDescription r1 = r2.methodDescription
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public net.bytebuddy.asm.MemberSubstitution.Substitution make(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.pool.TypePool r4) {
                        r1 = this;
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation r3 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver$Simple r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver$Simple
                        net.bytebuddy.description.method.MethodDescription r0 = r1.methodDescription
                        r4.<init>(r0)
                        r3.<init>(r2, r4)
                        return r3
                }
            }

            public enum OfInstrumentedMethod extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod> implements net.bytebuddy.asm.MemberSubstitution.Substitution.Factory {
                private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod[] $VALUES = null;
                public static final net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod INSTANCE = null;

                static {
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfInstrumentedMethod r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfInstrumentedMethod
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod.INSTANCE = r0
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfInstrumentedMethod[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod[]{r0}
                        net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod.$VALUES = r0
                        return
                }

                OfInstrumentedMethod(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfInstrumentedMethod> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfInstrumentedMethod r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod) r1
                        return r1
                }

                public static net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod[] values() {
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfInstrumentedMethod[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfInstrumentedMethod[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod[]) r0
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public net.bytebuddy.asm.MemberSubstitution.Substitution make(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.method.MethodDescription r3, net.bytebuddy.pool.TypePool r4) {
                        r1 = this;
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver$Simple r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver$Simple
                        r0.<init>(r3)
                        r4.<init>(r2, r0)
                        return r4
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfMatchedMethod implements net.bytebuddy.asm.MemberSubstitution.Substitution.Factory {
                private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;
                private final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;

                public OfMatchedMethod(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r2) {
                        r0 = this;
                        r0.<init>()
                        r0.matcher = r1
                        r0.methodGraphCompiler = r2
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfMatchedMethod r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfMatchedMethod) r5
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.matcher
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r5 = r5.methodGraphCompiler
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
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r2.methodGraphCompiler
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
                public net.bytebuddy.asm.MemberSubstitution.Substitution make(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.pool.TypePool r5) {
                        r2 = this;
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation r4 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation
                        net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver$Matching r5 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver$Matching
                        net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = r2.methodGraphCompiler
                        net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                        r5.<init>(r3, r0, r1)
                        r4.<init>(r3, r5)
                        return r4
                }
            }

            public ForMethodInvocation(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.MethodResolver r2) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    r0.methodResolver = r2
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
                    net.bytebuddy.description.type.TypeDescription r2 = r4.instrumentedType
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver r2 = r4.methodResolver
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver r5 = r5.methodResolver
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
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver r1 = r2.methodResolver
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.description.ByteCodeElement.Member r3, net.bytebuddy.description.type.TypeList.Generic r4, net.bytebuddy.description.type.TypeDescription.Generic r5, net.bytebuddy.utility.JavaConstant.MethodHandle r6, net.bytebuddy.implementation.bytecode.StackManipulation r7, int r8) {
                    r1 = this;
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$MethodResolver r6 = r1.methodResolver
                    net.bytebuddy.description.method.MethodDescription r2 = r6.resolve(r2, r3, r4, r5)
                    net.bytebuddy.description.type.TypeDescription r3 = r1.instrumentedType
                    boolean r3 = r2.isAccessibleTo(r3)
                    if (r3 == 0) goto Lfc
                    boolean r3 = r2.isStatic()
                    if (r3 == 0) goto L1d
                    net.bytebuddy.description.method.ParameterList r3 = r2.getParameters()
                    net.bytebuddy.description.type.TypeList$Generic r3 = r3.asTypeList()
                    goto L32
                L1d:
                    net.bytebuddy.description.type.TypeList$Generic$Explicit r3 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
                    net.bytebuddy.description.type.TypeDefinition r6 = r2.getDeclaringType()
                    net.bytebuddy.description.method.ParameterList r7 = r2.getParameters()
                    net.bytebuddy.description.type.TypeList$Generic r7 = r7.asTypeList()
                    java.util.List r6 = net.bytebuddy.utility.CompoundList.of(r6, r7)
                    r3.<init>(r6)
                L32:
                    net.bytebuddy.description.type.TypeDescription$Generic r6 = r2.getReturnType()
                    net.bytebuddy.description.type.TypeDescription r6 = r6.asErasure()
                    net.bytebuddy.description.type.TypeDescription r7 = r5.asErasure()
                    boolean r6 = r6.isAssignableTo(r7)
                    if (r6 == 0) goto Ldd
                    int r5 = r3.size()
                    int r6 = r4.size()
                    java.lang.String r7 = "Cannot invoke "
                    if (r5 != r6) goto Lb7
                    r5 = 0
                    r6 = r5
                L52:
                    int r8 = r3.size()
                    if (r6 >= r8) goto L9e
                    java.lang.Object r8 = r4.get(r6)
                    net.bytebuddy.description.type.TypeDescription$Generic r8 = (net.bytebuddy.description.type.TypeDescription.Generic) r8
                    net.bytebuddy.description.type.TypeDescription r8 = r8.asErasure()
                    java.lang.Object r0 = r3.get(r6)
                    net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                    net.bytebuddy.description.type.TypeDescription r0 = r0.asErasure()
                    boolean r8 = r8.isAssignableTo(r0)
                    if (r8 == 0) goto L75
                    int r6 = r6 + 1
                    goto L52
                L75:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    r5.append(r7)
                    r5.append(r2)
                    java.lang.String r2 = " on parameter "
                    r5.append(r2)
                    r5.append(r6)
                    java.lang.String r2 = " of type "
                    r5.append(r2)
                    java.lang.Object r2 = r4.get(r6)
                    r5.append(r2)
                    java.lang.String r2 = r5.toString()
                    r3.<init>(r2)
                    throw r3
                L9e:
                    boolean r4 = r2.isVirtual()
                    net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r2)
                    if (r4 == 0) goto Lb6
                    java.lang.Object r3 = r3.get(r5)
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = (net.bytebuddy.description.type.TypeDescription.Generic) r3
                    net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                    net.bytebuddy.implementation.bytecode.StackManipulation r2 = r2.virtual(r3)
                Lb6:
                    return r2
                Lb7:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    r5.append(r7)
                    r5.append(r2)
                    java.lang.String r2 = " on "
                    r5.append(r2)
                    int r2 = r4.size()
                    r5.append(r2)
                    java.lang.String r2 = " parameters"
                    r5.append(r2)
                    java.lang.String r2 = r5.toString()
                    r3.<init>(r2)
                    throw r3
                Ldd:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r6 = "Cannot assign return value of "
                    r4.append(r6)
                    r4.append(r2)
                    java.lang.String r2 = " to "
                    r4.append(r2)
                    r4.append(r5)
                    java.lang.String r2 = r4.toString()
                    r3.<init>(r2)
                    throw r3
                Lfc:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    net.bytebuddy.description.type.TypeDescription r5 = r1.instrumentedType
                    r4.append(r5)
                    java.lang.String r5 = " cannot access "
                    r4.append(r5)
                    r4.append(r2)
                    java.lang.String r2 = r4.toString()
                    r3.<init>(r2)
                    throw r3
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForValue implements net.bytebuddy.asm.MemberSubstitution.Substitution, net.bytebuddy.asm.MemberSubstitution.Substitution.Factory {
            private final net.bytebuddy.implementation.bytecode.StackManipulation stackManipulation;
            private final net.bytebuddy.description.type.TypeDescription.Generic typeDescription;

            public ForValue(net.bytebuddy.implementation.bytecode.StackManipulation r1, net.bytebuddy.description.type.TypeDescription.Generic r2) {
                    r0 = this;
                    r0.<init>()
                    r0.stackManipulation = r1
                    r0.typeDescription = r2
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
                    net.bytebuddy.asm.MemberSubstitution$Substitution$ForValue r5 = (net.bytebuddy.asm.MemberSubstitution.Substitution.ForValue) r5
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r5.stackManipulation
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.typeDescription
                    net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.typeDescription
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
                    net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.typeDescription
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
            public net.bytebuddy.asm.MemberSubstitution.Substitution make(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.pool.TypePool r3) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, int r7) {
                    r0 = this;
                    java.util.ArrayList r1 = new java.util.ArrayList
                    int r2 = r3.size()
                    r1.<init>(r2)
                    int r2 = r3.size()
                    int r2 = r2 + (-1)
                Lf:
                    if (r2 < 0) goto L21
                    java.lang.Object r5 = r3.get(r2)
                    net.bytebuddy.description.type.TypeDefinition r5 = (net.bytebuddy.description.type.TypeDefinition) r5
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.Removal.of(r5)
                    r1.add(r5)
                    int r2 = r2 + (-1)
                    goto Lf
                L21:
                    net.bytebuddy.description.type.TypeDescription$Generic r2 = r0.typeDescription
                    net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                    net.bytebuddy.description.type.TypeDescription r3 = r4.asErasure()
                    boolean r2 = r2.isAssignableTo(r3)
                    if (r2 == 0) goto L3d
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = r0.stackManipulation
                    java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r1, r3)
                    r2.<init>(r1)
                    return r2
                L3d:
                    java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Cannot assign "
                    r2.append(r3)
                    net.bytebuddy.description.type.TypeDescription$Generic r3 = r0.typeDescription
                    r2.append(r3)
                    java.lang.String r3 = " to "
                    r2.append(r3)
                    r2.append(r4)
                    java.lang.String r2 = r2.toString()
                    r1.<init>(r2)
                    throw r1
            }
        }

        public enum Stubbing extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing> implements net.bytebuddy.asm.MemberSubstitution.Substitution, net.bytebuddy.asm.MemberSubstitution.Substitution.Factory {
            private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing[] $VALUES = null;
            public static final net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing INSTANCE = null;

            static {
                    net.bytebuddy.asm.MemberSubstitution$Substitution$Stubbing r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$Stubbing
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing.INSTANCE = r0
                    net.bytebuddy.asm.MemberSubstitution$Substitution$Stubbing[] r0 = new net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing[]{r0}
                    net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing.$VALUES = r0
                    return
            }

            Stubbing(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.asm.MemberSubstitution$Substitution$Stubbing> r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.asm.MemberSubstitution$Substitution$Stubbing r1 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing) r1
                    return r1
            }

            public static net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing[] values() {
                    net.bytebuddy.asm.MemberSubstitution$Substitution$Stubbing[] r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.asm.MemberSubstitution$Substitution$Stubbing[] r0 = (net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing[]) r0
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution.Factory
            public net.bytebuddy.asm.MemberSubstitution.Substitution make(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.pool.TypePool r3) {
                    r0 = this;
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.Substitution
            public net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, int r7) {
                    r0 = this;
                    java.util.ArrayList r1 = new java.util.ArrayList
                    int r2 = r3.size()
                    r1.<init>(r2)
                    int r2 = r3.size()
                    int r2 = r2 + (-1)
                Lf:
                    if (r2 < 0) goto L21
                    java.lang.Object r5 = r3.get(r2)
                    net.bytebuddy.description.type.TypeDefinition r5 = (net.bytebuddy.description.type.TypeDefinition) r5
                    net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.Removal.of(r5)
                    r1.add(r5)
                    int r2 = r2 + (-1)
                    goto Lf
                L21:
                    net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                    net.bytebuddy.description.type.TypeDescription r3 = r4.asErasure()
                    net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.constant.DefaultValue.of(r3)
                    java.util.List r1 = net.bytebuddy.utility.CompoundList.of(r1, r3)
                    r2.<init>(r1)
                    return r2
            }
        }

        net.bytebuddy.implementation.bytecode.StackManipulation resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.ByteCodeElement.Member r2, net.bytebuddy.description.type.TypeList.Generic r3, net.bytebuddy.description.type.TypeDescription.Generic r4, net.bytebuddy.utility.JavaConstant.MethodHandle r5, net.bytebuddy.implementation.bytecode.StackManipulation r6, int r7);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.CONSTRUCTOR})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface This {
        boolean optional() default false;

        net.bytebuddy.asm.MemberSubstitution.Source source() default net.bytebuddy.asm.MemberSubstitution.Source.SUBSTITUTED_ELEMENT;

        net.bytebuddy.implementation.bytecode.assign.Assigner.Typing typing() default net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.STATIC;
    }

    public interface TypePoolResolver {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForClassFileLocator implements net.bytebuddy.asm.MemberSubstitution.TypePoolResolver {
            private final net.bytebuddy.dynamic.ClassFileLocator classFileLocator;
            private final net.bytebuddy.pool.TypePool.Default.ReaderMode readerMode;

            public ForClassFileLocator(net.bytebuddy.dynamic.ClassFileLocator r2) {
                    r1 = this;
                    net.bytebuddy.pool.TypePool$Default$ReaderMode r0 = net.bytebuddy.pool.TypePool.Default.ReaderMode.FAST
                    r1.<init>(r2, r0)
                    return
            }

            public ForClassFileLocator(net.bytebuddy.dynamic.ClassFileLocator r1, net.bytebuddy.pool.TypePool.Default.ReaderMode r2) {
                    r0 = this;
                    r0.<init>()
                    r0.classFileLocator = r1
                    r0.readerMode = r2
                    return
            }

            public static net.bytebuddy.asm.MemberSubstitution.TypePoolResolver of(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$ForClassFileLocator r0 = new net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$ForClassFileLocator
                    net.bytebuddy.dynamic.ClassFileLocator r1 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r1)
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
                    net.bytebuddy.pool.TypePool$Default$ReaderMode r2 = r4.readerMode
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$ForClassFileLocator r5 = (net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.ForClassFileLocator) r5
                    net.bytebuddy.pool.TypePool$Default$ReaderMode r3 = r5.readerMode
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.dynamic.ClassFileLocator r2 = r4.classFileLocator
                    net.bytebuddy.dynamic.ClassFileLocator r5 = r5.classFileLocator
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
                    net.bytebuddy.dynamic.ClassFileLocator r1 = r2.classFileLocator
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.pool.TypePool$Default$ReaderMode r1 = r2.readerMode
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.TypePoolResolver
            public net.bytebuddy.pool.TypePool resolve(net.bytebuddy.description.type.TypeDescription r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.pool.TypePool r5) {
                    r2 = this;
                    net.bytebuddy.pool.TypePool$Default r3 = new net.bytebuddy.pool.TypePool$Default
                    net.bytebuddy.pool.TypePool$CacheProvider$Simple r4 = new net.bytebuddy.pool.TypePool$CacheProvider$Simple
                    r4.<init>()
                    net.bytebuddy.dynamic.ClassFileLocator r0 = r2.classFileLocator
                    net.bytebuddy.pool.TypePool$Default$ReaderMode r1 = r2.readerMode
                    r3.<init>(r4, r0, r1, r5)
                    return r3
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForExplicitPool implements net.bytebuddy.asm.MemberSubstitution.TypePoolResolver {
            private final net.bytebuddy.pool.TypePool typePool;

            public ForExplicitPool(net.bytebuddy.pool.TypePool r1) {
                    r0 = this;
                    r0.<init>()
                    r0.typePool = r1
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
                    net.bytebuddy.pool.TypePool r2 = r4.typePool
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$ForExplicitPool r5 = (net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.ForExplicitPool) r5
                    net.bytebuddy.pool.TypePool r5 = r5.typePool
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
                    net.bytebuddy.pool.TypePool r1 = r2.typePool
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.TypePoolResolver
            public net.bytebuddy.pool.TypePool resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.pool.TypePool r3) {
                    r0 = this;
                    net.bytebuddy.pool.TypePool r1 = r0.typePool
                    return r1
            }
        }

        public enum OfImplicitPool extends java.lang.Enum<net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool> implements net.bytebuddy.asm.MemberSubstitution.TypePoolResolver {
            private static final /* synthetic */ net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool[] $VALUES = null;
            public static final net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool INSTANCE = null;

            static {
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$OfImplicitPool r0 = new net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$OfImplicitPool
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool.INSTANCE = r0
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$OfImplicitPool[] r0 = new net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool[]{r0}
                    net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool.$VALUES = r0
                    return
            }

            OfImplicitPool(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$OfImplicitPool> r0 = net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$OfImplicitPool r1 = (net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool) r1
                    return r1
            }

            public static net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool[] values() {
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$OfImplicitPool[] r0 = net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$OfImplicitPool[] r0 = (net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool[]) r0
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.TypePoolResolver
            public net.bytebuddy.pool.TypePool resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.pool.TypePool r3) {
                    r0 = this;
                    return r3
            }
        }

        net.bytebuddy.pool.TypePool resolve(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.pool.TypePool r3);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Unused {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static abstract class WithoutSpecification {
        protected final boolean failIfNoMatch;
        protected final net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler methodGraphCompiler;
        protected final net.bytebuddy.asm.MemberSubstitution.Replacement.Factory replacementFactory;
        protected final boolean strict;
        protected final net.bytebuddy.asm.MemberSubstitution.TypePoolResolver typePoolResolver;

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMatchedByteCodeElement extends net.bytebuddy.asm.MemberSubstitution.WithoutSpecification {
            private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.ByteCodeElement.Member> matcher;

            public ForMatchedByteCodeElement(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r1, net.bytebuddy.asm.MemberSubstitution.TypePoolResolver r2, boolean r3, boolean r4, net.bytebuddy.asm.MemberSubstitution.Replacement.Factory r5, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.ByteCodeElement.Member> r6) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4, r5)
                    r0.matcher = r6
                    return
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
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
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.ByteCodeElement$Member> r2 = r4.matcher
                    net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedByteCodeElement r5 = (net.bytebuddy.asm.MemberSubstitution.WithoutSpecification.ForMatchedByteCodeElement) r5
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.ByteCodeElement$Member> r5 = r5.matcher
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L27
                    return r1
                L27:
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.ByteCodeElement$Member> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public net.bytebuddy.asm.MemberSubstitution replaceWith(net.bytebuddy.asm.MemberSubstitution.Substitution.Factory r10) {
                    r9 = this;
                    net.bytebuddy.asm.MemberSubstitution r6 = new net.bytebuddy.asm.MemberSubstitution
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r9.methodGraphCompiler
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r9.typePoolResolver
                    boolean r3 = r9.strict
                    boolean r4 = r9.failIfNoMatch
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory$Compound r5 = new net.bytebuddy.asm.MemberSubstitution$Replacement$Factory$Compound
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r0 = r9.replacementFactory
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.ByteCodeElement$Member> r7 = r9.matcher
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r10 = net.bytebuddy.asm.MemberSubstitution.Replacement.ForElementMatchers.Factory.of(r7, r10)
                    r7 = 2
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory[] r7 = new net.bytebuddy.asm.MemberSubstitution.Replacement.Factory[r7]
                    r8 = 0
                    r7[r8] = r0
                    r0 = 1
                    r7[r0] = r10
                    r5.<init>(r7)
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r6
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMatchedField extends net.bytebuddy.asm.MemberSubstitution.WithoutSpecification {
            private final boolean matchRead;
            private final boolean matchWrite;
            private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> matcher;

            public ForMatchedField(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r10, net.bytebuddy.asm.MemberSubstitution.TypePoolResolver r11, boolean r12, boolean r13, net.bytebuddy.asm.MemberSubstitution.Replacement.Factory r14, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r15) {
                    r9 = this;
                    r7 = 1
                    r8 = 1
                    r0 = r9
                    r1 = r10
                    r2 = r11
                    r3 = r12
                    r4 = r13
                    r5 = r14
                    r6 = r15
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            public ForMatchedField(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r1, net.bytebuddy.asm.MemberSubstitution.TypePoolResolver r2, boolean r3, boolean r4, net.bytebuddy.asm.MemberSubstitution.Replacement.Factory r5, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r6, boolean r7, boolean r8) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4, r5)
                    r0.matcher = r6
                    r0.matchRead = r7
                    r0.matchWrite = r8
                    return
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
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
                    boolean r2 = r4.matchRead
                    net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedField r5 = (net.bytebuddy.asm.MemberSubstitution.WithoutSpecification.ForMatchedField) r5
                    boolean r3 = r5.matchRead
                    if (r2 == r3) goto L23
                    return r1
                L23:
                    boolean r2 = r4.matchWrite
                    boolean r3 = r5.matchWrite
                    if (r2 == r3) goto L2a
                    return r1
                L2a:
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2 = r4.matcher
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r5 = r5.matcher
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L35
                    return r1
                L35:
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.matchRead
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.matchWrite
                    int r0 = r0 + r1
                    return r0
            }

            public net.bytebuddy.asm.MemberSubstitution.WithoutSpecification onRead() {
                    r10 = this;
                    net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedField r9 = new net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedField
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r10.methodGraphCompiler
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r10.typePoolResolver
                    boolean r3 = r10.strict
                    boolean r4 = r10.failIfNoMatch
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r10.replacementFactory
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r6 = r10.matcher
                    r7 = 1
                    r8 = 0
                    r0 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            public net.bytebuddy.asm.MemberSubstitution.WithoutSpecification onWrite() {
                    r10 = this;
                    net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedField r9 = new net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedField
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r10.methodGraphCompiler
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r10.typePoolResolver
                    boolean r3 = r10.strict
                    boolean r4 = r10.failIfNoMatch
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r10.replacementFactory
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r6 = r10.matcher
                    r7 = 0
                    r8 = 1
                    r0 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public net.bytebuddy.asm.MemberSubstitution replaceWith(net.bytebuddy.asm.MemberSubstitution.Substitution.Factory r11) {
                    r10 = this;
                    net.bytebuddy.asm.MemberSubstitution r6 = new net.bytebuddy.asm.MemberSubstitution
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r10.methodGraphCompiler
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r10.typePoolResolver
                    boolean r3 = r10.strict
                    boolean r4 = r10.failIfNoMatch
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory$Compound r5 = new net.bytebuddy.asm.MemberSubstitution$Replacement$Factory$Compound
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r0 = r10.replacementFactory
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r7 = r10.matcher
                    boolean r8 = r10.matchRead
                    boolean r9 = r10.matchWrite
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r11 = net.bytebuddy.asm.MemberSubstitution.Replacement.ForElementMatchers.Factory.ofField(r7, r8, r9, r11)
                    r7 = 2
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory[] r7 = new net.bytebuddy.asm.MemberSubstitution.Replacement.Factory[r7]
                    r8 = 0
                    r7[r8] = r0
                    r0 = 1
                    r7[r0] = r11
                    r5.<init>(r7)
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r6
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForMatchedMethod extends net.bytebuddy.asm.MemberSubstitution.WithoutSpecification {
            private final boolean includeSuperCalls;
            private final boolean includeVirtualCalls;
            private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> matcher;

            public ForMatchedMethod(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r10, net.bytebuddy.asm.MemberSubstitution.TypePoolResolver r11, boolean r12, boolean r13, net.bytebuddy.asm.MemberSubstitution.Replacement.Factory r14, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r15) {
                    r9 = this;
                    r7 = 1
                    r8 = 1
                    r0 = r9
                    r1 = r10
                    r2 = r11
                    r3 = r12
                    r4 = r13
                    r5 = r14
                    r6 = r15
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return
            }

            public ForMatchedMethod(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r1, net.bytebuddy.asm.MemberSubstitution.TypePoolResolver r2, boolean r3, boolean r4, net.bytebuddy.asm.MemberSubstitution.Replacement.Factory r5, net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r6, boolean r7, boolean r8) {
                    r0 = this;
                    r0.<init>(r1, r2, r3, r4, r5)
                    r0.matcher = r6
                    r0.includeVirtualCalls = r7
                    r0.includeSuperCalls = r8
                    return
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
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
                    boolean r2 = r4.includeVirtualCalls
                    net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedMethod r5 = (net.bytebuddy.asm.MemberSubstitution.WithoutSpecification.ForMatchedMethod) r5
                    boolean r3 = r5.includeVirtualCalls
                    if (r2 == r3) goto L23
                    return r1
                L23:
                    boolean r2 = r4.includeSuperCalls
                    boolean r3 = r5.includeSuperCalls
                    if (r2 == r3) goto L2a
                    return r1
                L2a:
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.matcher
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r5 = r5.matcher
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L35
                    return r1
                L35:
                    return r0
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public int hashCode() {
                    r2 = this;
                    int r0 = super.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.matcher
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.includeVirtualCalls
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    boolean r1 = r2.includeSuperCalls
                    int r0 = r0 + r1
                    return r0
            }

            public net.bytebuddy.asm.MemberSubstitution.WithoutSpecification onSuperCall() {
                    r10 = this;
                    net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedMethod r9 = new net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedMethod
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r10.methodGraphCompiler
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r10.typePoolResolver
                    boolean r3 = r10.strict
                    boolean r4 = r10.failIfNoMatch
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r10.replacementFactory
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isVirtual()
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r6 = r10.matcher
                    net.bytebuddy.matcher.ElementMatcher$Junction r6 = r0.and(r6)
                    r7 = 0
                    r8 = 1
                    r0 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            public net.bytebuddy.asm.MemberSubstitution.WithoutSpecification onVirtualCall() {
                    r10 = this;
                    net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedMethod r9 = new net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedMethod
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r10.methodGraphCompiler
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r10.typePoolResolver
                    boolean r3 = r10.strict
                    boolean r4 = r10.failIfNoMatch
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r10.replacementFactory
                    net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isVirtual()
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r6 = r10.matcher
                    net.bytebuddy.matcher.ElementMatcher$Junction r6 = r0.and(r6)
                    r7 = 1
                    r8 = 0
                    r0 = r9
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    return r9
            }

            @Override // net.bytebuddy.asm.MemberSubstitution.WithoutSpecification
            public net.bytebuddy.asm.MemberSubstitution replaceWith(net.bytebuddy.asm.MemberSubstitution.Substitution.Factory r11) {
                    r10 = this;
                    net.bytebuddy.asm.MemberSubstitution r6 = new net.bytebuddy.asm.MemberSubstitution
                    net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r10.methodGraphCompiler
                    net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r10.typePoolResolver
                    boolean r3 = r10.strict
                    boolean r4 = r10.failIfNoMatch
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory$Compound r5 = new net.bytebuddy.asm.MemberSubstitution$Replacement$Factory$Compound
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r0 = r10.replacementFactory
                    net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r7 = r10.matcher
                    boolean r8 = r10.includeVirtualCalls
                    boolean r9 = r10.includeSuperCalls
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r11 = net.bytebuddy.asm.MemberSubstitution.Replacement.ForElementMatchers.Factory.ofMethod(r7, r8, r9, r11)
                    r7 = 2
                    net.bytebuddy.asm.MemberSubstitution$Replacement$Factory[] r7 = new net.bytebuddy.asm.MemberSubstitution.Replacement.Factory[r7]
                    r8 = 0
                    r7[r8] = r0
                    r0 = 1
                    r7[r0] = r11
                    r5.<init>(r7)
                    r0 = r6
                    r0.<init>(r1, r2, r3, r4, r5)
                    return r6
            }
        }

        public WithoutSpecification(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r1, net.bytebuddy.asm.MemberSubstitution.TypePoolResolver r2, boolean r3, boolean r4, net.bytebuddy.asm.MemberSubstitution.Replacement.Factory r5) {
                r0 = this;
                r0.<init>()
                r0.methodGraphCompiler = r1
                r0.typePoolResolver = r2
                r0.strict = r3
                r0.failIfNoMatch = r4
                r0.replacementFactory = r5
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
                boolean r2 = r4.strict
                net.bytebuddy.asm.MemberSubstitution$WithoutSpecification r5 = (net.bytebuddy.asm.MemberSubstitution.WithoutSpecification) r5
                boolean r3 = r5.strict
                if (r2 == r3) goto L1c
                return r1
            L1c:
                boolean r2 = r4.failIfNoMatch
                boolean r3 = r5.failIfNoMatch
                if (r2 == r3) goto L23
                return r1
            L23:
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r5.methodGraphCompiler
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L2e
                return r1
            L2e:
                net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r4.typePoolResolver
                net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r3 = r5.typePoolResolver
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L39
                return r1
            L39:
                net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r2 = r4.replacementFactory
                net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r5.replacementFactory
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L44
                return r1
            L44:
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r2.methodGraphCompiler
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r1 = r2.typePoolResolver
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.strict
                int r0 = r0 + r1
                int r0 = r0 * 31
                boolean r1 = r2.failIfNoMatch
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r1 = r2.replacementFactory
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        public net.bytebuddy.asm.MemberSubstitution replaceWith(java.lang.reflect.Field r2) {
                r1 = this;
                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                r0.<init>(r2)
                net.bytebuddy.asm.MemberSubstitution r2 = r1.replaceWith(r0)
                return r2
        }

        public net.bytebuddy.asm.MemberSubstitution replaceWith(java.lang.reflect.Method r2) {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r0.<init>(r2)
                net.bytebuddy.asm.MemberSubstitution r2 = r1.replaceWith(r0)
                return r2
        }

        public abstract net.bytebuddy.asm.MemberSubstitution replaceWith(net.bytebuddy.asm.MemberSubstitution.Substitution.Factory r1);

        public net.bytebuddy.asm.MemberSubstitution replaceWith(net.bytebuddy.description.field.FieldDescription r2) {
                r1 = this;
                net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$OfGivenField r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$OfGivenField
                r0.<init>(r2)
                net.bytebuddy.asm.MemberSubstitution r2 = r1.replaceWith(r0)
                return r2
        }

        public net.bytebuddy.asm.MemberSubstitution replaceWith(net.bytebuddy.description.method.MethodDescription r4) {
                r3 = this;
                boolean r0 = r4.isMethod()
                if (r0 == 0) goto L10
                net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfGivenMethod r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfGivenMethod
                r0.<init>(r4)
                net.bytebuddy.asm.MemberSubstitution r4 = r3.replaceWith(r0)
                return r4
            L10:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot use "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = " as a replacement"
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public net.bytebuddy.asm.MemberSubstitution replaceWithChain(java.util.List<? extends net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory> r2) {
                r1 = this;
                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Factory r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.withDefaultAssigner()
                net.bytebuddy.asm.MemberSubstitution$Substitution$Chain$Factory r2 = r0.executing(r2)
                net.bytebuddy.asm.MemberSubstitution r2 = r1.replaceWith(r2)
                return r2
        }

        public net.bytebuddy.asm.MemberSubstitution replaceWithChain(net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.Factory... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.asm.MemberSubstitution r1 = r0.replaceWithChain(r1)
                return r1
        }

        public net.bytebuddy.asm.MemberSubstitution replaceWithConstant(java.lang.Object r3) {
                r2 = this;
                net.bytebuddy.utility.ConstantValue r3 = net.bytebuddy.utility.ConstantValue.Simple.wrap(r3)
                net.bytebuddy.asm.MemberSubstitution$Substitution$ForValue r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForValue
                net.bytebuddy.implementation.bytecode.StackManipulation r1 = r3.toStackManipulation()
                net.bytebuddy.description.type.TypeDescription r3 = r3.getTypeDescription()
                net.bytebuddy.description.type.TypeDescription$Generic r3 = r3.asGenericType()
                r0.<init>(r1, r3)
                net.bytebuddy.asm.MemberSubstitution r3 = r2.replaceWith(r0)
                return r3
        }

        public net.bytebuddy.asm.MemberSubstitution replaceWithField(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r2) {
                r1 = this;
                net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$OfMatchedField r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForFieldAccess$OfMatchedField
                r0.<init>(r2)
                net.bytebuddy.asm.MemberSubstitution r2 = r1.replaceWith(r0)
                return r2
        }

        public net.bytebuddy.asm.MemberSubstitution replaceWithInstrumentedMethod() {
                r1 = this;
                net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfInstrumentedMethod r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.ForMethodInvocation.OfInstrumentedMethod.INSTANCE
                net.bytebuddy.asm.MemberSubstitution r0 = r1.replaceWith(r0)
                return r0
        }

        public net.bytebuddy.asm.MemberSubstitution replaceWithMethod(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r0 = r1.methodGraphCompiler
                net.bytebuddy.asm.MemberSubstitution r2 = r1.replaceWithMethod(r2, r0)
                return r2
        }

        public net.bytebuddy.asm.MemberSubstitution replaceWithMethod(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2, net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r3) {
                r1 = this;
                net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfMatchedMethod r0 = new net.bytebuddy.asm.MemberSubstitution$Substitution$ForMethodInvocation$OfMatchedMethod
                r0.<init>(r2, r3)
                net.bytebuddy.asm.MemberSubstitution r2 = r1.replaceWith(r0)
                return r2
        }

        public net.bytebuddy.asm.MemberSubstitution stub() {
                r1 = this;
                net.bytebuddy.asm.MemberSubstitution$Substitution$Stubbing r0 = net.bytebuddy.asm.MemberSubstitution.Substitution.Stubbing.INSTANCE
                net.bytebuddy.asm.MemberSubstitution r0 = r1.replaceWith(r0)
                return r0
        }
    }

    public MemberSubstitution(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r1, net.bytebuddy.asm.MemberSubstitution.TypePoolResolver r2, boolean r3, boolean r4, net.bytebuddy.asm.MemberSubstitution.Replacement.Factory r5) {
            r0 = this;
            r0.<init>()
            r0.methodGraphCompiler = r1
            r0.typePoolResolver = r2
            r0.failIfNoMatch = r4
            r0.strict = r3
            r0.replacementFactory = r5
            return
    }

    public MemberSubstitution(boolean r7) {
            r6 = this;
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler.DEFAULT
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver$OfImplicitPool r2 = net.bytebuddy.asm.MemberSubstitution.TypePoolResolver.OfImplicitPool.INSTANCE
            r4 = 0
            net.bytebuddy.asm.MemberSubstitution$Replacement$NoOp r5 = net.bytebuddy.asm.MemberSubstitution.Replacement.NoOp.INSTANCE
            r0 = r6
            r3 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static net.bytebuddy.asm.MemberSubstitution relaxed() {
            net.bytebuddy.asm.MemberSubstitution r0 = new net.bytebuddy.asm.MemberSubstitution
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.asm.MemberSubstitution strict() {
            net.bytebuddy.asm.MemberSubstitution r0 = new net.bytebuddy.asm.MemberSubstitution
            r1 = 1
            r0.<init>(r1)
            return r0
    }

    public net.bytebuddy.asm.MemberSubstitution.WithoutSpecification constructor(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
            r1 = this;
            net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
            net.bytebuddy.matcher.ElementMatcher$Junction r2 = r0.and(r2)
            net.bytebuddy.asm.MemberSubstitution$WithoutSpecification r2 = r1.invokable(r2)
            return r2
    }

    public net.bytebuddy.asm.MemberSubstitution.WithoutSpecification element(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.ByteCodeElement.Member> r9) {
            r8 = this;
            net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedByteCodeElement r7 = new net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedByteCodeElement
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r8.methodGraphCompiler
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r8.typePoolResolver
            boolean r3 = r8.strict
            boolean r4 = r8.failIfNoMatch
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r8.replacementFactory
            r0 = r7
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
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
            boolean r2 = r4.strict
            net.bytebuddy.asm.MemberSubstitution r5 = (net.bytebuddy.asm.MemberSubstitution) r5
            boolean r3 = r5.strict
            if (r2 == r3) goto L1c
            return r1
        L1c:
            boolean r2 = r4.failIfNoMatch
            boolean r3 = r5.failIfNoMatch
            if (r2 == r3) goto L23
            return r1
        L23:
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r2 = r4.methodGraphCompiler
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r3 = r5.methodGraphCompiler
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2e
            return r1
        L2e:
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r4.typePoolResolver
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r3 = r5.typePoolResolver
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L39
            return r1
        L39:
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r2 = r4.replacementFactory
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r5.replacementFactory
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L44
            return r1
        L44:
            return r0
    }

    public net.bytebuddy.asm.MemberSubstitution failIfNoMatch(boolean r8) {
            r7 = this;
            net.bytebuddy.asm.MemberSubstitution r6 = new net.bytebuddy.asm.MemberSubstitution
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r7.methodGraphCompiler
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r7.typePoolResolver
            boolean r3 = r7.strict
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r7.replacementFactory
            r0 = r6
            r4 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public net.bytebuddy.asm.MemberSubstitution.WithoutSpecification.ForMatchedField field(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.field.FieldDescription> r9) {
            r8 = this;
            net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedField r7 = new net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedField
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r8.methodGraphCompiler
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r8.typePoolResolver
            boolean r3 = r8.strict
            boolean r4 = r8.failIfNoMatch
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r8.replacementFactory
            r0 = r7
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r2.methodGraphCompiler
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r1 = r2.typePoolResolver
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.strict
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.failIfNoMatch
            int r0 = r0 + r1
            int r0 = r0 * 31
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r1 = r2.replacementFactory
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    public net.bytebuddy.asm.MemberSubstitution.WithoutSpecification invokable(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r9) {
            r8 = this;
            net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedMethod r7 = new net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedMethod
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r8.methodGraphCompiler
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r8.typePoolResolver
            boolean r3 = r8.strict
            boolean r4 = r8.failIfNoMatch
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r8.replacementFactory
            r0 = r7
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public net.bytebuddy.asm.MemberSubstitution.WithoutSpecification.ForMatchedMethod method(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r9) {
            r8 = this;
            net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedMethod r7 = new net.bytebuddy.asm.MemberSubstitution$WithoutSpecification$ForMatchedMethod
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r8.methodGraphCompiler
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r8.typePoolResolver
            boolean r3 = r8.strict
            boolean r4 = r8.failIfNoMatch
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r8.replacementFactory
            r0 = r7
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r7
    }

    public net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods on(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r4) {
            r3 = this;
            net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r0 = new net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods
            r0.<init>()
            r1 = 1
            net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods$MethodVisitorWrapper[] r1 = new net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper[r1]
            r2 = 0
            r1[r2] = r3
            net.bytebuddy.asm.AsmVisitorWrapper$ForDeclaredMethods r4 = r0.invokable(r4, r1)
            return r4
    }

    public net.bytebuddy.asm.MemberSubstitution with(net.bytebuddy.asm.MemberSubstitution.TypePoolResolver r8) {
            r7 = this;
            net.bytebuddy.asm.MemberSubstitution r6 = new net.bytebuddy.asm.MemberSubstitution
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r1 = r7.methodGraphCompiler
            boolean r3 = r7.strict
            boolean r4 = r7.failIfNoMatch
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r7.replacementFactory
            r0 = r6
            r2 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public net.bytebuddy.asm.MemberSubstitution with(net.bytebuddy.dynamic.scaffold.MethodGraph.Compiler r8) {
            r7 = this;
            net.bytebuddy.asm.MemberSubstitution r6 = new net.bytebuddy.asm.MemberSubstitution
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r2 = r7.typePoolResolver
            boolean r3 = r7.strict
            boolean r4 = r7.failIfNoMatch
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r5 = r7.replacementFactory
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper.ForDeclaredMethods.MethodVisitorWrapper
    public net.bytebuddy.jar.asm.MethodVisitor wrap(net.bytebuddy.description.type.TypeDescription r14, net.bytebuddy.description.method.MethodDescription r15, net.bytebuddy.jar.asm.MethodVisitor r16, net.bytebuddy.implementation.Implementation.Context r17, net.bytebuddy.pool.TypePool r18, int r19, int r20) {
            r13 = this;
            r0 = r13
            r3 = r14
            r4 = r15
            net.bytebuddy.asm.MemberSubstitution$TypePoolResolver r1 = r0.typePoolResolver
            r2 = r18
            net.bytebuddy.pool.TypePool r10 = r1.resolve(r14, r15, r2)
            net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor r12 = new net.bytebuddy.asm.MemberSubstitution$SubstitutingMethodVisitor
            net.bytebuddy.dynamic.scaffold.MethodGraph$Compiler r5 = r0.methodGraphCompiler
            boolean r6 = r0.strict
            boolean r7 = r0.failIfNoMatch
            net.bytebuddy.asm.MemberSubstitution$Replacement$Factory r1 = r0.replacementFactory
            net.bytebuddy.asm.MemberSubstitution$Replacement r8 = r1.make(r14, r15, r10)
            net.bytebuddy.ClassFileVersion r1 = r17.getClassFileVersion()
            net.bytebuddy.ClassFileVersion r2 = net.bytebuddy.ClassFileVersion.JAVA_V11
            boolean r11 = r1.isAtLeast(r2)
            r1 = r12
            r2 = r16
            r9 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
    }
}
