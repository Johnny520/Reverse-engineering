package net.bytebuddy.implementation.attribute;

/* JADX INFO: loaded from: classes2.dex */
public interface MethodAttributeAppender {

    /* JADX INFO: renamed from: net.bytebuddy.implementation.attribute.MethodAttributeAppender$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Compound implements net.bytebuddy.implementation.attribute.MethodAttributeAppender {
        private final java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender> methodAttributeAppenders;

        public Compound(java.util.List<? extends net.bytebuddy.implementation.attribute.MethodAttributeAppender> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.methodAttributeAppenders = r0
                java.util.Iterator r3 = r3.iterator()
            Le:
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L32
                java.lang.Object r0 = r3.next()
                net.bytebuddy.implementation.attribute.MethodAttributeAppender r0 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender) r0
                boolean r1 = r0 instanceof net.bytebuddy.implementation.attribute.MethodAttributeAppender.Compound
                if (r1 == 0) goto L28
                java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender> r1 = r2.methodAttributeAppenders
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Compound r0 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Compound) r0
                java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender> r0 = r0.methodAttributeAppenders
                r1.addAll(r0)
                goto Le
            L28:
                boolean r1 = r0 instanceof net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp
                if (r1 != 0) goto Le
                java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender> r1 = r2.methodAttributeAppenders
                r1.add(r0)
                goto Le
            L32:
                return
        }

        public Compound(net.bytebuddy.implementation.attribute.MethodAttributeAppender... r1) {
                r0 = this;
                java.util.List r1 = java.util.Arrays.asList(r1)
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
        public void apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5) {
                r2 = this;
                java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender> r0 = r2.methodAttributeAppenders
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                net.bytebuddy.implementation.attribute.MethodAttributeAppender r1 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender) r1
                r1.apply(r3, r4, r5)
                goto L6
            L16:
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
                java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender> r2 = r4.methodAttributeAppenders
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Compound r5 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Compound) r5
                java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender> r5 = r5.methodAttributeAppenders
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
                java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender> r1 = r2.methodAttributeAppenders
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Explicit implements net.bytebuddy.implementation.attribute.MethodAttributeAppender, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory {
        private final java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> annotations;
        private final net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target target;

        public interface Target {

            public enum OnMethod extends java.lang.Enum<net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod> implements net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target {
                private static final /* synthetic */ net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod[] $VALUES = null;
                public static final net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod INSTANCE = null;

                static {
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethod r0 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethod
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod.INSTANCE = r0
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethod[] r0 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod[]{r0}
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod.$VALUES = r0
                        return
                }

                OnMethod(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethod> r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethod r1 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod) r1
                        return r1
                }

                public static net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod[] values() {
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethod[] r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethod[] r0 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod[]) r0
                        return r0
                }

                @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target
                public net.bytebuddy.implementation.attribute.AnnotationAppender.Target make(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.method.MethodDescription r2) {
                        r0 = this;
                        net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethod r2 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethod
                        r2.<init>(r1)
                        return r2
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OnMethodParameter implements net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target {
                private final int parameterIndex;

                public OnMethodParameter(int r1) {
                        r0 = this;
                        r0.<init>()
                        r0.parameterIndex = r1
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
                        int r2 = r4.parameterIndex
                        net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethodParameter r5 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethodParameter) r5
                        int r5 = r5.parameterIndex
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
                        int r1 = r2.parameterIndex
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target
                public net.bytebuddy.implementation.attribute.AnnotationAppender.Target make(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.description.method.MethodDescription r4) {
                        r2 = this;
                        int r0 = r2.parameterIndex
                        net.bytebuddy.description.method.ParameterList r1 = r4.getParameters()
                        int r1 = r1.size()
                        if (r0 >= r1) goto L14
                        net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethodParameter r4 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethodParameter
                        int r0 = r2.parameterIndex
                        r4.<init>(r3, r0)
                        return r4
                    L14:
                        java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Method "
                        r0.append(r1)
                        r0.append(r4)
                        java.lang.String r4 = " has less then "
                        r0.append(r4)
                        int r4 = r2.parameterIndex
                        r0.append(r4)
                        java.lang.String r4 = " parameters"
                        r0.append(r4)
                        java.lang.String r4 = r0.toString()
                        r3.<init>(r4)
                        throw r3
                }
            }

            net.bytebuddy.implementation.attribute.AnnotationAppender.Target make(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.method.MethodDescription r2);
        }

        public Explicit(int r2, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3) {
                r1 = this;
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethodParameter r0 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethodParameter
                r0.<init>(r2)
                r1.<init>(r0, r3)
                return
        }

        public Explicit(java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2) {
                r1 = this;
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target$OnMethod r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target.OnMethod.INSTANCE
                r1.<init>(r0, r2)
                return
        }

        public Explicit(net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit.Target r1, java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2) {
                r0 = this;
                r0.<init>()
                r0.target = r1
                r0.annotations = r2
                return
        }

        public static net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory of(net.bytebuddy.description.method.MethodDescription r4) {
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound r0 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r1 = ofMethodAnnotations(r4)
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r4 = ofParameterAnnotations(r4)
                r2 = 2
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory[] r2 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory[r2]
                r3 = 0
                r2[r3] = r1
                r1 = 1
                r2[r1] = r4
                r0.<init>(r2)
                return r0
        }

        public static net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory ofMethodAnnotations(net.bytebuddy.description.method.MethodDescription r1) {
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit r0 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit
                net.bytebuddy.description.annotation.AnnotationList r1 = r1.getDeclaredAnnotations()
                r0.<init>(r1)
                return r0
        }

        public static net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory ofParameterAnnotations(net.bytebuddy.description.method.MethodDescription r4) {
                net.bytebuddy.description.method.ParameterList r4 = r4.getParameters()
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r4.size()
                r0.<init>(r1)
                java.util.Iterator r4 = r4.iterator()
            L11:
                boolean r1 = r4.hasNext()
                if (r1 == 0) goto L2e
                java.lang.Object r1 = r4.next()
                net.bytebuddy.description.method.ParameterDescription r1 = (net.bytebuddy.description.method.ParameterDescription) r1
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit r2 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit
                int r3 = r1.getIndex()
                net.bytebuddy.description.annotation.AnnotationList r1 = r1.getDeclaredAnnotations()
                r2.<init>(r3, r1)
                r0.add(r2)
                goto L11
            L2e:
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound r4 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound
                r4.<init>(r0)
                return r4
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
        public void apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5) {
                r2 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender$Default r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Default
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target r1 = r2.target
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target r3 = r1.make(r3, r4)
                r0.<init>(r3)
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r3 = r2.annotations
                java.util.Iterator r3 = r3.iterator()
            L11:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L22
                java.lang.Object r4 = r3.next()
                net.bytebuddy.description.annotation.AnnotationDescription r4 = (net.bytebuddy.description.annotation.AnnotationDescription) r4
                net.bytebuddy.implementation.attribute.AnnotationAppender r0 = r0.append(r4, r5)
                goto L11
            L22:
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
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target r2 = r4.target
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit r5 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Explicit) r5
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target r3 = r5.target
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r2 = r4.annotations
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r5 = r5.annotations
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
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$Explicit$Target r1 = r2.target
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.annotation.AnnotationDescription> r1 = r2.annotations
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
        public net.bytebuddy.implementation.attribute.MethodAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }
    }

    public interface Factory {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Compound implements net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory {
            private final java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory> factories;

            public Compound(java.util.List<? extends net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory> r3) {
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
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r0 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory) r0
                    boolean r1 = r0 instanceof net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory.Compound
                    if (r1 == 0) goto L28
                    java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory> r1 = r2.factories
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound r0 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory.Compound) r0
                    java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory> r0 = r0.factories
                    r1.addAll(r0)
                    goto Le
                L28:
                    boolean r1 = r0 instanceof net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp
                    if (r1 != 0) goto Le
                    java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory> r1 = r2.factories
                    r1.add(r0)
                    goto Le
                L32:
                    return
            }

            public Compound(net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory... r1) {
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
                    java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory> r2 = r4.factories
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory$Compound r5 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory.Compound) r5
                    java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory> r5 = r5.factories
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
                    java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory> r1 = r2.factories
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
            public net.bytebuddy.implementation.attribute.MethodAttributeAppender make(net.bytebuddy.description.type.TypeDescription r4) {
                    r3 = this;
                    java.util.ArrayList r0 = new java.util.ArrayList
                    java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory> r1 = r3.factories
                    int r1 = r1.size()
                    r0.<init>(r1)
                    java.util.List<net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory> r1 = r3.factories
                    java.util.Iterator r1 = r1.iterator()
                L11:
                    boolean r2 = r1.hasNext()
                    if (r2 == 0) goto L25
                    java.lang.Object r2 = r1.next()
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory r2 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory) r2
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender r2 = r2.make(r4)
                    r0.add(r2)
                    goto L11
                L25:
                    net.bytebuddy.implementation.attribute.MethodAttributeAppender$Compound r4 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$Compound
                    r4.<init>(r0)
                    return r4
            }
        }

        net.bytebuddy.implementation.attribute.MethodAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1);
    }

    public enum ForInstrumentedMethod extends java.lang.Enum<net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod> implements net.bytebuddy.implementation.attribute.MethodAttributeAppender, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory {
        private static final /* synthetic */ net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod[] $VALUES = null;
        public static final net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod EXCLUDING_RECEIVER = null;
        public static final net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod INCLUDING_RECEIVER = null;



        static {
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod$1 r0 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod$1
                java.lang.String r1 = "EXCLUDING_RECEIVER"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod.EXCLUDING_RECEIVER = r0
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod$2 r1 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod$2
                java.lang.String r3 = "INCLUDING_RECEIVER"
                r4 = 1
                r1.<init>(r3, r4)
                net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod.INCLUDING_RECEIVER = r1
                r3 = 2
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod[] r3 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod[r3]
                r3[r2] = r0
                r3[r4] = r1
                net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod.$VALUES = r3
                return
        }

        ForInstrumentedMethod(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ ForInstrumentedMethod(java.lang.String r1, int r2, net.bytebuddy.implementation.attribute.MethodAttributeAppender.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod> r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod r1 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod) r1
                return r1
        }

        public static net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod[] values() {
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod[] r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForInstrumentedMethod[] r0 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForInstrumentedMethod[]) r0
                return r0
        }

        public abstract net.bytebuddy.implementation.attribute.AnnotationAppender appendReceiver(net.bytebuddy.implementation.attribute.AnnotationAppender r1, net.bytebuddy.implementation.attribute.AnnotationValueFilter r2, net.bytebuddy.description.method.MethodDescription r3);

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
        public void apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.description.method.MethodDescription r9, net.bytebuddy.implementation.attribute.AnnotationValueFilter r10) {
                r7 = this;
                net.bytebuddy.implementation.attribute.AnnotationAppender$Default r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Default
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethod r1 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethod
                r1.<init>(r8)
                r0.<init>(r1)
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r9.getReturnType()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r0 = net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofMethodReturnType(r0, r10)
                java.lang.Object r0 = r1.accept(r0)
                net.bytebuddy.implementation.attribute.AnnotationAppender r0 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r0
                net.bytebuddy.description.type.TypeList$Generic r1 = r9.getTypeVariables()
                r2 = 0
                net.bytebuddy.implementation.attribute.AnnotationAppender r0 = net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofTypeVariable(r0, r10, r2, r1)
                net.bytebuddy.description.annotation.AnnotationList r1 = r9.getDeclaredAnnotations()
                java.lang.String r3 = "jdk.internal."
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.nameStartsWith(r3)
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.annotationType(r3)
                net.bytebuddy.matcher.ElementMatcher$Junction r3 = net.bytebuddy.matcher.ElementMatchers.not(r3)
                net.bytebuddy.matcher.FilterableList r1 = r1.filter(r3)
                net.bytebuddy.description.annotation.AnnotationList r1 = (net.bytebuddy.description.annotation.AnnotationList) r1
                java.util.Iterator r1 = r1.iterator()
            L3d:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L4e
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.annotation.AnnotationDescription r3 = (net.bytebuddy.description.annotation.AnnotationDescription) r3
                net.bytebuddy.implementation.attribute.AnnotationAppender r0 = r0.append(r3, r10)
                goto L3d
            L4e:
                net.bytebuddy.description.method.ParameterList r1 = r9.getParameters()
                java.util.Iterator r1 = r1.iterator()
            L56:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L9b
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.method.ParameterDescription r3 = (net.bytebuddy.description.method.ParameterDescription) r3
                net.bytebuddy.implementation.attribute.AnnotationAppender$Default r4 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Default
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethodParameter r5 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethodParameter
                int r6 = r3.getIndex()
                r5.<init>(r8, r6)
                r4.<init>(r5)
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r3.getType()
                int r6 = r3.getIndex()
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r4 = net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofMethodParameterType(r4, r10, r6)
                java.lang.Object r4 = r5.accept(r4)
                net.bytebuddy.implementation.attribute.AnnotationAppender r4 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r4
                net.bytebuddy.description.annotation.AnnotationList r3 = r3.getDeclaredAnnotations()
                java.util.Iterator r3 = r3.iterator()
            L8a:
                boolean r5 = r3.hasNext()
                if (r5 == 0) goto L56
                java.lang.Object r5 = r3.next()
                net.bytebuddy.description.annotation.AnnotationDescription r5 = (net.bytebuddy.description.annotation.AnnotationDescription) r5
                net.bytebuddy.implementation.attribute.AnnotationAppender r4 = r4.append(r5, r10)
                goto L8a
            L9b:
                net.bytebuddy.implementation.attribute.AnnotationAppender r8 = r7.appendReceiver(r0, r10, r9)
                net.bytebuddy.description.type.TypeList$Generic r9 = r9.getExceptionTypes()
                java.util.Iterator r9 = r9.iterator()
            La7:
                boolean r0 = r9.hasNext()
                if (r0 == 0) goto Lc1
                java.lang.Object r0 = r9.next()
                net.bytebuddy.description.type.TypeDescription$Generic r0 = (net.bytebuddy.description.type.TypeDescription.Generic) r0
                int r1 = r2 + 1
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r8 = net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofExceptionType(r8, r10, r2)
                java.lang.Object r8 = r0.accept(r8)
                net.bytebuddy.implementation.attribute.AnnotationAppender r8 = (net.bytebuddy.implementation.attribute.AnnotationAppender) r8
                r2 = r1
                goto La7
            Lc1:
                return
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
        public net.bytebuddy.implementation.attribute.MethodAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ForReceiverType implements net.bytebuddy.implementation.attribute.MethodAttributeAppender, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory {
        private final net.bytebuddy.description.type.TypeDescription.Generic receiverType;

        public ForReceiverType(net.bytebuddy.description.type.TypeDescription.Generic r1) {
                r0 = this;
                r0.<init>()
                r0.receiverType = r1
                return
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
        public void apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.description.method.MethodDescription r4, net.bytebuddy.implementation.attribute.AnnotationValueFilter r5) {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r2.receiverType
                net.bytebuddy.implementation.attribute.AnnotationAppender$Default r0 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Default
                net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethod r1 = new net.bytebuddy.implementation.attribute.AnnotationAppender$Target$OnMethod
                r1.<init>(r3)
                r0.<init>(r1)
                net.bytebuddy.description.type.TypeDescription$Generic$Visitor r3 = net.bytebuddy.implementation.attribute.AnnotationAppender.ForTypeAnnotations.ofReceiverType(r0, r5)
                r4.accept(r3)
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
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r4.receiverType
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$ForReceiverType r5 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.ForReceiverType) r5
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.receiverType
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
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.receiverType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
        public net.bytebuddy.implementation.attribute.MethodAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }
    }

    public enum NoOp extends java.lang.Enum<net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp> implements net.bytebuddy.implementation.attribute.MethodAttributeAppender, net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory {
        private static final /* synthetic */ net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp[] $VALUES = null;
        public static final net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp INSTANCE = null;

        static {
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp r0 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp.INSTANCE = r0
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp[] r0 = new net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp[]{r0}
                net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp.$VALUES = r0
                return
        }

        NoOp(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp> r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp r1 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp) r1
                return r1
        }

        public static net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp[] values() {
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp[] r0 = net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.attribute.MethodAttributeAppender$NoOp[] r0 = (net.bytebuddy.implementation.attribute.MethodAttributeAppender.NoOp[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender
        public void apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3) {
                r0 = this;
                return
        }

        @Override // net.bytebuddy.implementation.attribute.MethodAttributeAppender.Factory
        public net.bytebuddy.implementation.attribute.MethodAttributeAppender make(net.bytebuddy.description.type.TypeDescription r1) {
                r0 = this;
                return r0
        }
    }

    void apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.description.method.MethodDescription r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter r3);
}
