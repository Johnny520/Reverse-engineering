package net.bytebuddy.dynamic.scaffold.subclass;

/* JADX INFO: loaded from: classes2.dex */
public interface ConstructorStrategy {

    /* JADX INFO: renamed from: net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public enum Default extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default> implements net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy {
        private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default[] $VALUES = null;
        public static final net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default DEFAULT_CONSTRUCTOR = null;
        public static final net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default IMITATE_SUPER_CLASS = null;
        public static final net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default IMITATE_SUPER_CLASS_OPENING = null;
        public static final net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default IMITATE_SUPER_CLASS_PUBLIC = null;
        public static final net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default NO_CONSTRUCTORS = null;






        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class WithMethodAttributeAppenderFactory implements net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy {
            private final net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default delegate;
            private final net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory methodAttributeAppenderFactory;

            public WithMethodAttributeAppenderFactory(net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r2) {
                    r0 = this;
                    r0.<init>()
                    r0.delegate = r1
                    r0.methodAttributeAppenderFactory = r2
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
                    net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r2 = r4.delegate
                    net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$WithMethodAttributeAppenderFactory r5 = (net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.WithMethodAttributeAppenderFactory) r5
                    net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r3 = r5.delegate
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r2 = r4.methodAttributeAppenderFactory
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r5 = r5.methodAttributeAppenderFactory
                    boolean r5 = r2.equals(r5)
                    if (r5 != 0) goto L2b
                    return r1
                L2b:
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
            public java.util.List<net.bytebuddy.description.method.MethodDescription.Token> extractConstructors(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r0 = r1.delegate
                    java.util.List r2 = r0.extractConstructors(r2)
                    return r2
            }

            public int hashCode() {
                    r2 = this;
                    java.lang.Class r0 = r2.getClass()
                    int r0 = r0.hashCode()
                    int r0 = r0 * 31
                    net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r1 = r2.delegate
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r1 = r2.methodAttributeAppenderFactory
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
            public net.bytebuddy.dynamic.scaffold.MethodRegistry inject(net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.dynamic.scaffold.MethodRegistry r3) {
                    r1 = this;
                    net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r2 = r1.delegate
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r0 = r1.methodAttributeAppenderFactory
                    net.bytebuddy.dynamic.scaffold.MethodRegistry r2 = r2.doInject(r3, r0)
                    return r2
            }
        }

        static {
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$1 r0 = new net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$1
                java.lang.String r1 = "NO_CONSTRUCTORS"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS = r0
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$2 r1 = new net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$2
                java.lang.String r3 = "DEFAULT_CONSTRUCTOR"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.DEFAULT_CONSTRUCTOR = r1
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$3 r3 = new net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$3
                java.lang.String r5 = "IMITATE_SUPER_CLASS"
                r6 = 2
                r3.<init>(r5, r6)
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.IMITATE_SUPER_CLASS = r3
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$4 r5 = new net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$4
                java.lang.String r7 = "IMITATE_SUPER_CLASS_PUBLIC"
                r8 = 3
                r5.<init>(r7, r8)
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.IMITATE_SUPER_CLASS_PUBLIC = r5
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$5 r7 = new net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$5
                java.lang.String r9 = "IMITATE_SUPER_CLASS_OPENING"
                r10 = 4
                r7.<init>(r9, r10)
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.IMITATE_SUPER_CLASS_OPENING = r7
                r9 = 5
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default[] r9 = new net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.$VALUES = r9
                return
        }

        Default(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ Default(java.lang.String r1, int r2, net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default> r0 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r1 = (net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default) r1
                return r1
        }

        public static net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default[] values() {
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default[] r0 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default[] r0 = (net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default[]) r0
                return r0
        }

        public abstract java.util.List<net.bytebuddy.description.method.MethodDescription.Token> doExtractConstructors(net.bytebuddy.description.type.TypeDescription r1);

        public abstract net.bytebuddy.dynamic.scaffold.MethodRegistry doInject(net.bytebuddy.dynamic.scaffold.MethodRegistry r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r2);

        @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
        public java.util.List<net.bytebuddy.description.method.MethodDescription.Token> extractConstructors(net.bytebuddy.description.type.TypeDescription r14) {
                r13 = this;
                java.util.List r14 = r13.doExtractConstructors(r14)
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r14.size()
                r0.<init>(r1)
                java.util.Iterator r14 = r14.iterator()
            L11:
                boolean r1 = r14.hasNext()
                if (r1 == 0) goto L4d
                java.lang.Object r1 = r14.next()
                net.bytebuddy.description.method.MethodDescription$Token r1 = (net.bytebuddy.description.method.MethodDescription.Token) r1
                net.bytebuddy.description.method.MethodDescription$Token r12 = new net.bytebuddy.description.method.MethodDescription$Token
                java.lang.String r3 = r1.getName()
                int r2 = r1.getModifiers()
                int r4 = r13.resolveModifier(r2)
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r5 = r1.getTypeVariableTokens()
                net.bytebuddy.description.type.TypeDescription$Generic r6 = r1.getReturnType()
                net.bytebuddy.description.ByteCodeElement$Token$TokenList r7 = r1.getParameterTokens()
                net.bytebuddy.description.type.TypeList$Generic r8 = r1.getExceptionTypes()
                net.bytebuddy.description.annotation.AnnotationList r9 = r1.getAnnotations()
                net.bytebuddy.description.annotation.AnnotationValue r10 = r1.getDefaultValue()
                net.bytebuddy.description.type.TypeDescription$Generic r11 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
                r2 = r12
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r0.add(r12)
                goto L11
            L4d:
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
        public net.bytebuddy.dynamic.scaffold.MethodRegistry inject(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.scaffold.MethodRegistry r2) {
                r0 = this;
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp r1 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp.INSTANCE
                net.bytebuddy.dynamic.scaffold.MethodRegistry r1 = r0.doInject(r2, r1)
                return r1
        }

        public int resolveModifier(int r1) {
                r0 = this;
                return r1
        }

        public net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy with(net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r2) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$WithMethodAttributeAppenderFactory r0 = new net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$WithMethodAttributeAppenderFactory
                r0.<init>(r1, r2)
                return r0
        }

        public net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy withInheritedAnnotations() {
                r2 = this;
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$WithMethodAttributeAppenderFactory r0 = new net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default$WithMethodAttributeAppenderFactory
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod r1 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod.EXCLUDING_RECEIVER
                r0.<init>(r2, r1)
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForDefaultConstructor implements net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy {
        private final net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> elementMatcher;
        private final net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory methodAttributeAppenderFactory;

        public ForDefaultConstructor() {
                r1 = this;
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.any()
                r1.<init>(r0)
                return
        }

        public ForDefaultConstructor(net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r2) {
                r1 = this;
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.any()
                r1.<init>(r0, r2)
                return
        }

        public ForDefaultConstructor(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2) {
                r1 = this;
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp.INSTANCE
                r1.<init>(r2, r0)
                return
        }

        public ForDefaultConstructor(net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory r2) {
                r0 = this;
                r0.<init>()
                r0.elementMatcher = r1
                r0.methodAttributeAppenderFactory = r2
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
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r4.elementMatcher
                net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$ForDefaultConstructor r5 = (net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.ForDefaultConstructor) r5
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r3 = r5.elementMatcher
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r2 = r4.methodAttributeAppenderFactory
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r5 = r5.methodAttributeAppenderFactory
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L2b
                return r1
            L2b:
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
        public java.util.List<net.bytebuddy.description.method.MethodDescription.Token> extractConstructors(net.bytebuddy.description.type.TypeDescription r4) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.getSuperClass()
                if (r0 == 0) goto L2d
                net.bytebuddy.description.method.MethodList r4 = r0.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.FilterableList r4 = r4.filter(r0)
                net.bytebuddy.description.method.MethodList r4 = (net.bytebuddy.description.method.MethodList) r4
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L25
                net.bytebuddy.description.method.MethodDescription$Token r4 = new net.bytebuddy.description.method.MethodDescription$Token
                r0 = 1
                r4.<init>(r0)
                java.util.List r4 = java.util.Collections.singletonList(r4)
                return r4
            L25:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r0 = "Cannot define default constructor for class without super class constructor"
                r4.<init>(r0)
                throw r4
            L2d:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot extract constructors for "
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r1 = r2.elementMatcher
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r1 = r2.methodAttributeAppenderFactory
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy
        public net.bytebuddy.dynamic.scaffold.MethodRegistry inject(net.bytebuddy.description.type.TypeDescription r4, net.bytebuddy.dynamic.scaffold.MethodRegistry r5) {
                r3 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r4.getSuperClass()
                if (r0 == 0) goto Lcb
                net.bytebuddy.description.method.MethodList r4 = r0.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.ElementMatcher<? super net.bytebuddy.description.method.MethodDescription> r2 = r3.elementMatcher
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = r1.and(r2)
                net.bytebuddy.matcher.FilterableList r4 = r4.filter(r1)
                net.bytebuddy.description.method.MethodList r4 = (net.bytebuddy.description.method.MethodList) r4
                boolean r1 = r4.isEmpty()
                if (r1 != 0) goto Lb4
                r0 = 0
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r0)
                net.bytebuddy.matcher.FilterableList r1 = r4.filter(r1)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L3c
                net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r0)
                net.bytebuddy.matcher.FilterableList r4 = r4.filter(r1)
                net.bytebuddy.description.method.MethodList r4 = (net.bytebuddy.description.method.MethodList) r4
                goto L43
            L3c:
                int r1 = r4.size()
                r2 = 1
                if (r1 > r2) goto L9d
            L43:
                java.lang.Object r1 = r4.getOnly()
                net.bytebuddy.description.method.MethodDescription r1 = (net.bytebuddy.description.method.MethodDescription) r1
                net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r1 = net.bytebuddy.implementation.MethodCall.invoke(r1)
                java.lang.Object r4 = r4.getOnly()
                net.bytebuddy.description.method.MethodDescription r4 = (net.bytebuddy.description.method.MethodDescription) r4
                net.bytebuddy.description.method.ParameterList r4 = r4.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r4 = r4.asTypeList()
                net.bytebuddy.description.type.TypeList r4 = r4.asErasures()
                java.util.Iterator r4 = r4.iterator()
            L63:
                boolean r2 = r4.hasNext()
                if (r2 == 0) goto L7c
                java.lang.Object r2 = r4.next()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.Object r2 = r2.getDefaultValue()
                java.lang.Object[] r2 = new java.lang.Object[]{r2}
                net.bytebuddy.implementation.MethodCall r1 = r1.with(r2)
                goto L63
            L7c:
                net.bytebuddy.matcher.LatentMatcher$Resolved r4 = new net.bytebuddy.matcher.LatentMatcher$Resolved
                net.bytebuddy.matcher.ElementMatcher$Junction r2 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = net.bytebuddy.matcher.ElementMatchers.takesArguments(r0)
                net.bytebuddy.matcher.ElementMatcher$Junction r0 = r2.and(r0)
                r4.<init>(r0)
                net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation r0 = new net.bytebuddy.dynamic.scaffold.MethodRegistry$Handler$ForImplementation
                r0.<init>(r1)
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r1 = r3.methodAttributeAppenderFactory
                net.bytebuddy.dynamic.Transformer r2 = net.bytebuddy.dynamic.Transformer.NoOp.make()
                net.bytebuddy.dynamic.scaffold.MethodRegistry r4 = r5.append(r4, r0, r1, r2)
                return r4
            L9d:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "More than one possible super constructor for constructor delegation: "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
            Lb4:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r1 = "No possible candidate for super constructor invocation in "
                r5.append(r1)
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                r4.<init>(r5)
                throw r4
            Lcb:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Cannot inject constructors for "
                r0.append(r1)
                r0.append(r4)
                java.lang.String r4 = r0.toString()
                r5.<init>(r4)
                throw r5
        }
    }

    java.util.List<net.bytebuddy.description.method.MethodDescription.Token> extractConstructors(net.bytebuddy.description.type.TypeDescription r1);

    net.bytebuddy.dynamic.scaffold.MethodRegistry inject(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.scaffold.MethodRegistry r2);
}
