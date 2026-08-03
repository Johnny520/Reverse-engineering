package net.bytebuddy.dynamic.scaffold;

/* JADX INFO: loaded from: classes2.dex */
public interface TypeInitializer extends net.bytebuddy.implementation.bytecode.ByteCodeAppender {

    public interface Drain {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class Default implements net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain {
            protected final net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory annotationValueFilterFactory;
            protected final net.bytebuddy.description.type.TypeDescription instrumentedType;
            protected final net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool methodPool;

            public Default(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool r2, net.bytebuddy.implementation.attribute.AnnotationValueFilter.Factory r3) {
                    r0 = this;
                    r0.<init>()
                    r0.instrumentedType = r1
                    r0.methodPool = r2
                    r0.annotationValueFilterFactory = r3
                    return
            }

            @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain
            public void apply(net.bytebuddy.jar.asm.ClassVisitor r4, net.bytebuddy.dynamic.scaffold.TypeInitializer r5, net.bytebuddy.implementation.Implementation.Context r6) {
                    r3 = this;
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r0 = r3.methodPool
                    net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer r1 = new net.bytebuddy.description.method.MethodDescription$Latent$TypeInitializer
                    net.bytebuddy.description.type.TypeDescription r2 = r3.instrumentedType
                    r1.<init>(r2)
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r0 = r0.target(r1)
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r5 = r5.wrap(r0)
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r0 = r3.annotationValueFilterFactory
                    r5.apply(r4, r6, r0)
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
                    net.bytebuddy.dynamic.scaffold.TypeInitializer$Drain$Default r5 = (net.bytebuddy.dynamic.scaffold.TypeInitializer.Drain.Default) r5
                    net.bytebuddy.description.type.TypeDescription r3 = r5.instrumentedType
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L20
                    return r1
                L20:
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r2 = r4.methodPool
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r3 = r5.methodPool
                    boolean r2 = r2.equals(r3)
                    if (r2 != 0) goto L2b
                    return r1
                L2b:
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r2 = r4.annotationValueFilterFactory
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r5 = r5.annotationValueFilterFactory
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
                    net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool r1 = r2.methodPool
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    int r0 = r0 * 31
                    net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory r1 = r2.annotationValueFilterFactory
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }
        }

        void apply(net.bytebuddy.jar.asm.ClassVisitor r1, net.bytebuddy.dynamic.scaffold.TypeInitializer r2, net.bytebuddy.implementation.Implementation.Context r3);
    }

    public enum None extends java.lang.Enum<net.bytebuddy.dynamic.scaffold.TypeInitializer.None> implements net.bytebuddy.dynamic.scaffold.TypeInitializer {
        private static final /* synthetic */ net.bytebuddy.dynamic.scaffold.TypeInitializer.None[] $VALUES = null;
        public static final net.bytebuddy.dynamic.scaffold.TypeInitializer.None INSTANCE = null;

        static {
                net.bytebuddy.dynamic.scaffold.TypeInitializer$None r0 = new net.bytebuddy.dynamic.scaffold.TypeInitializer$None
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.dynamic.scaffold.TypeInitializer.None.INSTANCE = r0
                net.bytebuddy.dynamic.scaffold.TypeInitializer$None[] r0 = new net.bytebuddy.dynamic.scaffold.TypeInitializer.None[]{r0}
                net.bytebuddy.dynamic.scaffold.TypeInitializer.None.$VALUES = r0
                return
        }

        None(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.dynamic.scaffold.TypeInitializer.None valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.dynamic.scaffold.TypeInitializer$None> r0 = net.bytebuddy.dynamic.scaffold.TypeInitializer.None.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.dynamic.scaffold.TypeInitializer$None r1 = (net.bytebuddy.dynamic.scaffold.TypeInitializer.None) r1
                return r1
        }

        public static net.bytebuddy.dynamic.scaffold.TypeInitializer.None[] values() {
                net.bytebuddy.dynamic.scaffold.TypeInitializer$None[] r0 = net.bytebuddy.dynamic.scaffold.TypeInitializer.None.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.dynamic.scaffold.TypeInitializer$None[] r0 = (net.bytebuddy.dynamic.scaffold.TypeInitializer.None[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r1, net.bytebuddy.implementation.Implementation.Context r2, net.bytebuddy.description.method.MethodDescription r3) {
                r0 = this;
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r1 = net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size.ZERO
                return r1
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public net.bytebuddy.dynamic.scaffold.TypeInitializer expandWith(net.bytebuddy.implementation.bytecode.ByteCodeAppender r2) {
                r1 = this;
                net.bytebuddy.dynamic.scaffold.TypeInitializer$Simple r0 = new net.bytebuddy.dynamic.scaffold.TypeInitializer$Simple
                r0.<init>(r2)
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public boolean isDefined() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record wrap(net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r1) {
                r0 = this;
                return r1
        }
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class Simple implements net.bytebuddy.dynamic.scaffold.TypeInitializer {
        private final net.bytebuddy.implementation.bytecode.ByteCodeAppender byteCodeAppender;

        public Simple(net.bytebuddy.implementation.bytecode.ByteCodeAppender r1) {
                r0 = this;
                r0.<init>()
                r0.byteCodeAppender = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.ByteCodeAppender
        public net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.description.method.MethodDescription r4) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r0 = r1.byteCodeAppender
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size r2 = r0.apply(r2, r3, r4)
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
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r2 = r4.byteCodeAppender
                net.bytebuddy.dynamic.scaffold.TypeInitializer$Simple r5 = (net.bytebuddy.dynamic.scaffold.TypeInitializer.Simple) r5
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r5 = r5.byteCodeAppender
                boolean r5 = r2.equals(r5)
                if (r5 != 0) goto L20
                return r1
            L20:
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public net.bytebuddy.dynamic.scaffold.TypeInitializer expandWith(net.bytebuddy.implementation.bytecode.ByteCodeAppender r6) {
                r5 = this;
                net.bytebuddy.dynamic.scaffold.TypeInitializer$Simple r0 = new net.bytebuddy.dynamic.scaffold.TypeInitializer$Simple
                net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound r1 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender$Compound
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r2 = r5.byteCodeAppender
                r3 = 2
                net.bytebuddy.implementation.bytecode.ByteCodeAppender[] r3 = new net.bytebuddy.implementation.bytecode.ByteCodeAppender[r3]
                r4 = 0
                r3[r4] = r2
                r2 = 1
                r3[r2] = r6
                r1.<init>(r3)
                r0.<init>(r1)
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.Class r0 = r2.getClass()
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r1 = r2.byteCodeAppender
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public boolean isDefined() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // net.bytebuddy.dynamic.scaffold.TypeInitializer
        public net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record wrap(net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r2) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.ByteCodeAppender r0 = r1.byteCodeAppender
                net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record r2 = r2.prepend(r0)
                return r2
        }
    }

    net.bytebuddy.dynamic.scaffold.TypeInitializer expandWith(net.bytebuddy.implementation.bytecode.ByteCodeAppender r1);

    boolean isDefined();

    net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record wrap(net.bytebuddy.dynamic.scaffold.TypeWriter.MethodPool.Record r1);
}
