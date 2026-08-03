package net.bytebuddy.utility.dispatcher;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class JavaDispatcher<T> implements java.security.PrivilegedAction<T> {
    private static final boolean ACCESS_CONTROLLER = false;
    private static final boolean GENERATE = false;
    public static final java.lang.String GENERATE_PROPERTY = "net.bytebuddy.generate";
    private static final net.bytebuddy.utility.Invoker INVOKER = null;
    private static final net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver RESOLVER = null;

    @net.bytebuddy.utility.nullability.MaybeNull
    @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
    private final java.lang.ClassLoader classLoader;
    private final boolean generate;
    private final java.lang.Class<T> proxy;

    /* JADX INFO: renamed from: net.bytebuddy.utility.dispatcher.JavaDispatcher$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Container {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Defaults {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class DirectInvoker implements net.bytebuddy.utility.Invoker {
        private DirectInvoker() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ DirectInvoker(net.bytebuddy.utility.dispatcher.JavaDispatcher.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                r1 = 0
                if (r4 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r3.getClass()
                java.lang.Class r4 = r4.getClass()
                if (r2 == r4) goto L13
                return r1
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class r0 = r1.getClass()
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.utility.Invoker
        public java.lang.Object invoke(java.lang.reflect.Method r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r3) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
                r0 = this;
                java.lang.Object r1 = r1.invoke(r2, r3)
                return r1
        }

        @Override // net.bytebuddy.utility.Invoker
        public java.lang.Object newInstance(java.lang.reflect.Constructor<?> r1, java.lang.Object[] r2) throws java.lang.InstantiationException, java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
                r0 = this;
                java.lang.Object r1 = r1.newInstance(r2)
                return r1
        }
    }

    public interface Dispatcher {

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForConstructor implements net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher {
            private final java.lang.reflect.Constructor<?> constructor;

            public ForConstructor(java.lang.reflect.Constructor<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.constructor = r1
                    return
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(net.bytebuddy.jar.asm.MethodVisitor r11, java.lang.reflect.Method r12) {
                    r10 = this;
                    java.lang.Class[] r12 = r12.getParameterTypes()
                    java.lang.reflect.Constructor<?> r0 = r10.constructor
                    java.lang.Class[] r0 = r0.getParameterTypes()
                    java.lang.reflect.Constructor<?> r1 = r10.constructor
                    java.lang.Class r1 = r1.getDeclaringClass()
                    java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r1)
                    r2 = 187(0xbb, float:2.62E-43)
                    r11.visitTypeInsn(r2, r1)
                    r1 = 89
                    r11.visitInsn(r1)
                    r1 = 1
                    r2 = 0
                    r3 = r1
                L21:
                    int r4 = r12.length
                    if (r2 >= r4) goto L4a
                    r4 = r12[r2]
                    net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r4)
                    r5 = 21
                    int r5 = r4.getOpcode(r5)
                    r11.visitVarInsn(r5, r3)
                    r5 = r12[r2]
                    r6 = r0[r2]
                    if (r5 == r6) goto L42
                    r5 = 192(0xc0, float:2.69E-43)
                    java.lang.String r6 = net.bytebuddy.jar.asm.Type.getInternalName(r6)
                    r11.visitTypeInsn(r5, r6)
                L42:
                    int r4 = r4.getSize()
                    int r3 = r3 + r4
                    int r2 = r2 + 1
                    goto L21
                L4a:
                    java.lang.reflect.Constructor<?> r12 = r10.constructor
                    java.lang.Class r12 = r12.getDeclaringClass()
                    java.lang.String r6 = net.bytebuddy.jar.asm.Type.getInternalName(r12)
                    java.lang.reflect.Constructor<?> r12 = r10.constructor
                    java.lang.String r8 = net.bytebuddy.jar.asm.Type.getConstructorDescriptor(r12)
                    r9 = 0
                    r5 = 183(0xb7, float:2.56E-43)
                    java.lang.String r7 = "<init>"
                    r4 = r11
                    r4.visitMethodInsn(r5, r6, r7, r8, r9)
                    r12 = 176(0xb0, float:2.47E-43)
                    r11.visitInsn(r12)
                    int r3 = r3 + r1
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
                    java.lang.reflect.Constructor<?> r2 = r4.constructor
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForConstructor r5 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForConstructor) r5
                    java.lang.reflect.Constructor<?> r5 = r5.constructor
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
                    java.lang.reflect.Constructor<?> r1 = r2.constructor
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public java.lang.Object invoke(java.lang.Object[] r3) throws java.lang.Throwable {
                    r2 = this;
                    net.bytebuddy.utility.Invoker r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.access$100()
                    java.lang.reflect.Constructor<?> r1 = r2.constructor
                    java.lang.Object r3 = r0.newInstance(r1, r3)
                    return r3
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForContainerCreation implements net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher {
            private final java.lang.Class<?> target;

            public ForContainerCreation(java.lang.Class<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.target = r1
                    return
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(net.bytebuddy.jar.asm.MethodVisitor r3, java.lang.reflect.Method r4) {
                    r2 = this;
                    r4 = 21
                    r0 = 1
                    r3.visitVarInsn(r4, r0)
                    java.lang.Class<?> r4 = r2.target
                    java.lang.String r4 = net.bytebuddy.jar.asm.Type.getInternalName(r4)
                    r1 = 189(0xbd, float:2.65E-43)
                    r3.visitTypeInsn(r1, r4)
                    r4 = 176(0xb0, float:2.47E-43)
                    r3.visitInsn(r4)
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
                    java.lang.Class<?> r2 = r4.target
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForContainerCreation r5 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForContainerCreation) r5
                    java.lang.Class<?> r5 = r5.target
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
                    java.lang.Class<?> r1 = r2.target
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public java.lang.Object invoke(java.lang.Object[] r3) {
                    r2 = this;
                    java.lang.Class<?> r0 = r2.target
                    r1 = 0
                    r3 = r3[r1]
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    java.lang.Object r3 = java.lang.reflect.Array.newInstance(r0, r3)
                    return r3
            }
        }

        public enum ForDefaultValue extends java.lang.Enum<net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue> implements net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher {
            private static final /* synthetic */ net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue[] $VALUES = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue BOOLEAN = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue BOOLEAN_REVERSE = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue BYTE = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue CHARACTER = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue DOUBLE = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue FLOAT = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue INTEGER = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue LONG = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue REFERENCE = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue SHORT = null;
            public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue VOID = null;
            private final int load;
            private final int returned;
            private final int size;

            @net.bytebuddy.utility.nullability.MaybeNull
            private final java.lang.Object value;

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class OfNonPrimitiveArray implements net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher {
                private final java.lang.Class<?> componentType;

                @net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling(net.bytebuddy.build.HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
                private final java.lang.Object value;

                public OfNonPrimitiveArray(java.lang.Object r1, java.lang.Class<?> r2) {
                        r0 = this;
                        r0.<init>()
                        r0.value = r1
                        r0.componentType = r2
                        return
                }

                public static net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher of(java.lang.Class<?> r2) {
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfNonPrimitiveArray r0 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfNonPrimitiveArray
                        r1 = 0
                        java.lang.Object r1 = java.lang.reflect.Array.newInstance(r2, r1)
                        r0.<init>(r1, r2)
                        return r0
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public int apply(net.bytebuddy.jar.asm.MethodVisitor r2, java.lang.reflect.Method r3) {
                        r1 = this;
                        r3 = 3
                        r2.visitInsn(r3)
                        java.lang.Class<?> r3 = r1.componentType
                        java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r3)
                        r0 = 189(0xbd, float:2.65E-43)
                        r2.visitTypeInsn(r0, r3)
                        r3 = 176(0xb0, float:2.47E-43)
                        r2.visitInsn(r3)
                        r2 = 1
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
                        java.lang.Class<?> r2 = r4.componentType
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfNonPrimitiveArray r5 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfNonPrimitiveArray) r5
                        java.lang.Class<?> r5 = r5.componentType
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
                        java.lang.Class<?> r1 = r2.componentType
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public java.lang.Object invoke(java.lang.Object[] r1) {
                        r0 = this;
                        java.lang.Object r1 = r0.value
                        return r1
                }
            }

            public enum OfPrimitiveArray extends java.lang.Enum<net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray> implements net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher {
                private static final /* synthetic */ net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray[] $VALUES = null;
                public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray BOOLEAN = null;
                public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray BYTE = null;
                public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray CHARACTER = null;
                public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray DOUBLE = null;
                public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray FLOAT = null;
                public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray INTEGER = null;
                public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray LONG = null;
                public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray SHORT = null;
                private final int operand;
                private final java.lang.Object value;

                static {
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r0 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray
                        r1 = 0
                        boolean[] r2 = new boolean[r1]
                        java.lang.String r3 = "BOOLEAN"
                        r4 = 4
                        r0.<init>(r3, r1, r2, r4)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.BOOLEAN = r0
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r2 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray
                        byte[] r3 = new byte[r1]
                        r5 = 8
                        java.lang.String r6 = "BYTE"
                        r7 = 1
                        r2.<init>(r6, r7, r3, r5)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.BYTE = r2
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r3 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray
                        short[] r5 = new short[r1]
                        r6 = 9
                        java.lang.String r7 = "SHORT"
                        r8 = 2
                        r3.<init>(r7, r8, r5, r6)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.SHORT = r3
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r5 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray
                        char[] r6 = new char[r1]
                        java.lang.String r7 = "CHARACTER"
                        r8 = 3
                        r9 = 5
                        r5.<init>(r7, r8, r6, r9)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.CHARACTER = r5
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r6 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray
                        int[] r7 = new int[r1]
                        r8 = 10
                        java.lang.String r10 = "INTEGER"
                        r6.<init>(r10, r4, r7, r8)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.INTEGER = r6
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r7 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray
                        long[] r4 = new long[r1]
                        r8 = 11
                        java.lang.String r10 = "LONG"
                        r7.<init>(r10, r9, r4, r8)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.LONG = r7
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r8 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray
                        r4 = 6
                        float[] r9 = new float[r1]
                        java.lang.String r10 = "FLOAT"
                        r8.<init>(r10, r4, r9, r4)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.FLOAT = r8
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r9 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray
                        r4 = 7
                        double[] r1 = new double[r1]
                        java.lang.String r10 = "DOUBLE"
                        r9.<init>(r10, r4, r1, r4)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.DOUBLE = r9
                        r1 = r2
                        r2 = r3
                        r3 = r5
                        r4 = r6
                        r5 = r7
                        r6 = r8
                        r7 = r9
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray[] r0 = new net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray[]{r0, r1, r2, r3, r4, r5, r6, r7}
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.$VALUES = r0
                        return
                }

                OfPrimitiveArray(java.lang.String r1, int r2, java.lang.Object r3, int r4) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        r0.value = r3
                        r0.operand = r4
                        return
                }

                public static net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray> r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r1 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray) r1
                        return r1
                }

                public static net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray[] values() {
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray[] r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray[] r0 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray[]) r0
                        return r0
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public int apply(net.bytebuddy.jar.asm.MethodVisitor r2, java.lang.reflect.Method r3) {
                        r1 = this;
                        r3 = 3
                        r2.visitInsn(r3)
                        r3 = 188(0xbc, float:2.63E-43)
                        int r0 = r1.operand
                        r2.visitIntInsn(r3, r0)
                        r3 = 176(0xb0, float:2.47E-43)
                        r2.visitInsn(r3)
                        r2 = 1
                        return r2
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
                public java.lang.Object invoke(java.lang.Object[] r1) {
                        r0 = this;
                        java.lang.Object r1 = r0.value
                        return r1
                }
            }

            static {
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r7 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    r5 = 177(0xb1, float:2.48E-43)
                    r6 = 0
                    java.lang.String r1 = "VOID"
                    r2 = 0
                    r3 = 0
                    r4 = 0
                    r0 = r7
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.VOID = r7
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r1 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    java.lang.Boolean r11 = java.lang.Boolean.FALSE
                    r13 = 172(0xac, float:2.41E-43)
                    r14 = 1
                    java.lang.String r9 = "BOOLEAN"
                    r10 = 1
                    r12 = 3
                    r8 = r1
                    r8.<init>(r9, r10, r11, r12, r13, r14)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.BOOLEAN = r1
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r2 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    java.lang.Boolean r18 = java.lang.Boolean.TRUE
                    r20 = 172(0xac, float:2.41E-43)
                    r21 = 1
                    java.lang.String r16 = "BOOLEAN_REVERSE"
                    r17 = 2
                    r19 = 4
                    r15 = r2
                    r15.<init>(r16, r17, r18, r19, r20, r21)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.BOOLEAN_REVERSE = r2
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r3 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    r0 = 0
                    java.lang.Byte r11 = java.lang.Byte.valueOf(r0)
                    java.lang.String r9 = "BYTE"
                    r10 = 3
                    r8 = r3
                    r8.<init>(r9, r10, r11, r12, r13, r14)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.BYTE = r3
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r4 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    java.lang.Short r18 = java.lang.Short.valueOf(r0)
                    java.lang.String r16 = "SHORT"
                    r17 = 4
                    r19 = 3
                    r15 = r4
                    r15.<init>(r16, r17, r18, r19, r20, r21)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.SHORT = r4
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r5 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    java.lang.Character r11 = java.lang.Character.valueOf(r0)
                    java.lang.String r9 = "CHARACTER"
                    r10 = 5
                    r8 = r5
                    r8.<init>(r9, r10, r11, r12, r13, r14)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.CHARACTER = r5
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r6 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    java.lang.Integer r18 = java.lang.Integer.valueOf(r0)
                    java.lang.String r16 = "INTEGER"
                    r17 = 6
                    r15 = r6
                    r15.<init>(r16, r17, r18, r19, r20, r21)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.INTEGER = r6
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r15 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    r8 = 0
                    java.lang.Long r11 = java.lang.Long.valueOf(r8)
                    r13 = 173(0xad, float:2.42E-43)
                    r14 = 2
                    java.lang.String r9 = "LONG"
                    r10 = 7
                    r12 = 9
                    r8 = r15
                    r8.<init>(r9, r10, r11, r12, r13, r14)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.LONG = r15
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r8 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    r0 = 0
                    java.lang.Float r19 = java.lang.Float.valueOf(r0)
                    r21 = 174(0xae, float:2.44E-43)
                    r22 = 1
                    java.lang.String r17 = "FLOAT"
                    r18 = 8
                    r20 = 11
                    r16 = r8
                    r16.<init>(r17, r18, r19, r20, r21, r22)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.FLOAT = r8
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    r10 = 0
                    java.lang.Double r26 = java.lang.Double.valueOf(r10)
                    r28 = 175(0xaf, float:2.45E-43)
                    r29 = 2
                    java.lang.String r24 = "DOUBLE"
                    r25 = 9
                    r27 = 14
                    r23 = r9
                    r23.<init>(r24, r25, r26, r27, r28, r29)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.DOUBLE = r9
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r10 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue
                    r21 = 176(0xb0, float:2.47E-43)
                    java.lang.String r17 = "REFERENCE"
                    r18 = 10
                    r19 = 0
                    r20 = 1
                    r16 = r10
                    r16.<init>(r17, r18, r19, r20, r21, r22)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.REFERENCE = r10
                    r0 = r7
                    r7 = r15
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue[] r0 = new net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10}
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.$VALUES = r0
                    return
            }

            ForDefaultValue(@net.bytebuddy.utility.nullability.MaybeNull java.lang.String r1, int r2, java.lang.Object r3, int r4, int r5, int r6) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.value = r3
                    r0.load = r4
                    r0.returned = r5
                    r0.size = r6
                    return
            }

            public static net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher of(java.lang.Class<?> r9) {
                    java.lang.Class r0 = java.lang.Void.TYPE
                    if (r9 != r0) goto L7
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.VOID
                    return r9
                L7:
                    java.lang.Class r0 = java.lang.Boolean.TYPE
                    if (r9 != r0) goto Le
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.BOOLEAN
                    return r9
                Le:
                    java.lang.Class r1 = java.lang.Byte.TYPE
                    if (r9 != r1) goto L15
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.BYTE
                    return r9
                L15:
                    java.lang.Class r2 = java.lang.Short.TYPE
                    if (r9 != r2) goto L1c
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.SHORT
                    return r9
                L1c:
                    java.lang.Class r3 = java.lang.Character.TYPE
                    if (r9 != r3) goto L23
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.CHARACTER
                    return r9
                L23:
                    java.lang.Class r4 = java.lang.Integer.TYPE
                    if (r9 != r4) goto L2a
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.INTEGER
                    return r9
                L2a:
                    java.lang.Class r5 = java.lang.Long.TYPE
                    if (r9 != r5) goto L31
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.LONG
                    return r9
                L31:
                    java.lang.Class r6 = java.lang.Float.TYPE
                    if (r9 != r6) goto L38
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.FLOAT
                    return r9
                L38:
                    java.lang.Class r7 = java.lang.Double.TYPE
                    if (r9 != r7) goto L3f
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.DOUBLE
                    return r9
                L3f:
                    boolean r8 = r9.isArray()
                    if (r8 == 0) goto L96
                    java.lang.Class r8 = r9.getComponentType()
                    if (r8 != r0) goto L4e
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.BOOLEAN
                    return r9
                L4e:
                    java.lang.Class r0 = r9.getComponentType()
                    if (r0 != r1) goto L57
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.BYTE
                    return r9
                L57:
                    java.lang.Class r0 = r9.getComponentType()
                    if (r0 != r2) goto L60
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.SHORT
                    return r9
                L60:
                    java.lang.Class r0 = r9.getComponentType()
                    if (r0 != r3) goto L69
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.CHARACTER
                    return r9
                L69:
                    java.lang.Class r0 = r9.getComponentType()
                    if (r0 != r4) goto L72
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.INTEGER
                    return r9
                L72:
                    java.lang.Class r0 = r9.getComponentType()
                    if (r0 != r5) goto L7b
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.LONG
                    return r9
                L7b:
                    java.lang.Class r0 = r9.getComponentType()
                    if (r0 != r6) goto L84
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.FLOAT
                    return r9
                L84:
                    java.lang.Class r0 = r9.getComponentType()
                    if (r0 != r7) goto L8d
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue$OfPrimitiveArray r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfPrimitiveArray.DOUBLE
                    return r9
                L8d:
                    java.lang.Class r9 = r9.getComponentType()
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.OfNonPrimitiveArray.of(r9)
                    return r9
                L96:
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r9 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.REFERENCE
                    return r9
            }

            public static net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue> r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r1 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue) r1
                    return r1
            }

            public static net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue[] values() {
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue[] r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue[] r0 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue[]) r0
                    return r0
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(net.bytebuddy.jar.asm.MethodVisitor r1, java.lang.reflect.Method r2) {
                    r0 = this;
                    int r2 = r0.load
                    if (r2 == 0) goto L7
                    r1.visitInsn(r2)
                L7:
                    int r2 = r0.returned
                    r1.visitInsn(r2)
                    int r1 = r0.size
                    return r1
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.Object invoke(java.lang.Object[] r1) {
                    r0 = this;
                    java.lang.Object r1 = r0.value
                    return r1
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForInstanceCheck implements net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher {
            private final java.lang.Class<?> target;

            public ForInstanceCheck(java.lang.Class<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.target = r1
                    return
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(net.bytebuddy.jar.asm.MethodVisitor r3, java.lang.reflect.Method r4) {
                    r2 = this;
                    r4 = 25
                    r0 = 1
                    r3.visitVarInsn(r4, r0)
                    java.lang.Class<?> r4 = r2.target
                    java.lang.String r4 = net.bytebuddy.jar.asm.Type.getInternalName(r4)
                    r1 = 193(0xc1, float:2.7E-43)
                    r3.visitTypeInsn(r1, r4)
                    r4 = 172(0xac, float:2.41E-43)
                    r3.visitInsn(r4)
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
                    java.lang.Class<?> r2 = r4.target
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForInstanceCheck r5 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForInstanceCheck) r5
                    java.lang.Class<?> r5 = r5.target
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
                    java.lang.Class<?> r1 = r2.target
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public java.lang.Object invoke(java.lang.Object[] r3) {
                    r2 = this;
                    java.lang.Class<?> r0 = r2.target
                    r1 = 0
                    r3 = r3[r1]
                    boolean r3 = r0.isInstance(r3)
                    java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                    return r3
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForNonStaticMethod implements net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher {
            private static final java.lang.Object[] NO_ARGUMENTS = null;
            private final java.lang.reflect.Method method;

            static {
                    r0 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForNonStaticMethod.NO_ARGUMENTS = r0
                    return
            }

            public ForNonStaticMethod(java.lang.reflect.Method r1) {
                    r0 = this;
                    r0.<init>()
                    r0.method = r1
                    return
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(net.bytebuddy.jar.asm.MethodVisitor r11, java.lang.reflect.Method r12) {
                    r10 = this;
                    java.lang.Class[] r12 = r12.getParameterTypes()
                    java.lang.reflect.Method r0 = r10.method
                    java.lang.Class[] r0 = r0.getParameterTypes()
                    r1 = 1
                    r2 = 0
                    r3 = r1
                Ld:
                    int r4 = r12.length
                    if (r2 >= r4) goto L4e
                    r4 = r12[r2]
                    net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r4)
                    r5 = 21
                    int r5 = r4.getOpcode(r5)
                    r11.visitVarInsn(r5, r3)
                    r5 = r12[r2]
                    if (r2 != 0) goto L2a
                    java.lang.reflect.Method r6 = r10.method
                    java.lang.Class r6 = r6.getDeclaringClass()
                    goto L2e
                L2a:
                    int r6 = r2 + (-1)
                    r6 = r0[r6]
                L2e:
                    if (r5 == r6) goto L46
                    if (r2 != 0) goto L39
                    java.lang.reflect.Method r5 = r10.method
                    java.lang.Class r5 = r5.getDeclaringClass()
                    goto L3d
                L39:
                    int r5 = r2 + (-1)
                    r5 = r0[r5]
                L3d:
                    java.lang.String r5 = net.bytebuddy.jar.asm.Type.getInternalName(r5)
                    r6 = 192(0xc0, float:2.69E-43)
                    r11.visitTypeInsn(r6, r5)
                L46:
                    int r4 = r4.getSize()
                    int r3 = r3 + r4
                    int r2 = r2 + 1
                    goto Ld
                L4e:
                    java.lang.reflect.Method r12 = r10.method
                    java.lang.Class r12 = r12.getDeclaringClass()
                    boolean r12 = r12.isInterface()
                    if (r12 == 0) goto L5e
                    r12 = 185(0xb9, float:2.59E-43)
                L5c:
                    r5 = r12
                    goto L61
                L5e:
                    r12 = 182(0xb6, float:2.55E-43)
                    goto L5c
                L61:
                    java.lang.reflect.Method r12 = r10.method
                    java.lang.Class r12 = r12.getDeclaringClass()
                    java.lang.String r6 = net.bytebuddy.jar.asm.Type.getInternalName(r12)
                    java.lang.reflect.Method r12 = r10.method
                    java.lang.String r7 = r12.getName()
                    java.lang.reflect.Method r12 = r10.method
                    java.lang.String r8 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r12)
                    java.lang.reflect.Method r12 = r10.method
                    java.lang.Class r12 = r12.getDeclaringClass()
                    boolean r9 = r12.isInterface()
                    r4 = r11
                    r4.visitMethodInsn(r5, r6, r7, r8, r9)
                    java.lang.reflect.Method r12 = r10.method
                    net.bytebuddy.jar.asm.Type r12 = net.bytebuddy.jar.asm.Type.getReturnType(r12)
                    r0 = 172(0xac, float:2.41E-43)
                    int r12 = r12.getOpcode(r0)
                    r11.visitInsn(r12)
                    int r3 = r3 - r1
                    java.lang.reflect.Method r11 = r10.method
                    net.bytebuddy.jar.asm.Type r11 = net.bytebuddy.jar.asm.Type.getReturnType(r11)
                    int r11 = r11.getSize()
                    int r11 = java.lang.Math.max(r3, r11)
                    return r11
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
                    java.lang.reflect.Method r2 = r4.method
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForNonStaticMethod r5 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForNonStaticMethod) r5
                    java.lang.reflect.Method r5 = r5.method
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
                    java.lang.reflect.Method r1 = r2.method
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public java.lang.Object invoke(java.lang.Object[] r5) throws java.lang.Throwable {
                    r4 = this;
                    int r0 = r5.length
                    r1 = 0
                    r2 = 1
                    if (r0 != r2) goto L8
                    java.lang.Object[] r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForNonStaticMethod.NO_ARGUMENTS
                    goto L10
                L8:
                    int r0 = r5.length
                    int r0 = r0 - r2
                    java.lang.Object[] r3 = new java.lang.Object[r0]
                    java.lang.System.arraycopy(r5, r2, r3, r1, r0)
                    r0 = r3
                L10:
                    net.bytebuddy.utility.Invoker r2 = net.bytebuddy.utility.dispatcher.JavaDispatcher.access$100()
                    java.lang.reflect.Method r3 = r4.method
                    r5 = r5[r1]
                    java.lang.Object r5 = r2.invoke(r3, r5, r0)
                    return r5
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForStaticMethod implements net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher {
            private final java.lang.reflect.Method method;

            public ForStaticMethod(java.lang.reflect.Method r1) {
                    r0 = this;
                    r0.<init>()
                    r0.method = r1
                    return
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(net.bytebuddy.jar.asm.MethodVisitor r11, java.lang.reflect.Method r12) {
                    r10 = this;
                    java.lang.Class[] r12 = r12.getParameterTypes()
                    java.lang.reflect.Method r0 = r10.method
                    java.lang.Class[] r0 = r0.getParameterTypes()
                    r1 = 1
                    r2 = 0
                    r3 = r1
                Ld:
                    int r4 = r12.length
                    if (r2 >= r4) goto L36
                    r4 = r12[r2]
                    net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r4)
                    r5 = 21
                    int r5 = r4.getOpcode(r5)
                    r11.visitVarInsn(r5, r3)
                    r5 = r12[r2]
                    r6 = r0[r2]
                    if (r5 == r6) goto L2e
                    r5 = 192(0xc0, float:2.69E-43)
                    java.lang.String r6 = net.bytebuddy.jar.asm.Type.getInternalName(r6)
                    r11.visitTypeInsn(r5, r6)
                L2e:
                    int r4 = r4.getSize()
                    int r3 = r3 + r4
                    int r2 = r2 + 1
                    goto Ld
                L36:
                    java.lang.reflect.Method r12 = r10.method
                    java.lang.Class r12 = r12.getDeclaringClass()
                    java.lang.String r6 = net.bytebuddy.jar.asm.Type.getInternalName(r12)
                    java.lang.reflect.Method r12 = r10.method
                    java.lang.String r7 = r12.getName()
                    java.lang.reflect.Method r12 = r10.method
                    java.lang.String r8 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r12)
                    java.lang.reflect.Method r12 = r10.method
                    java.lang.Class r12 = r12.getDeclaringClass()
                    boolean r9 = r12.isInterface()
                    r5 = 184(0xb8, float:2.58E-43)
                    r4 = r11
                    r4.visitMethodInsn(r5, r6, r7, r8, r9)
                    java.lang.reflect.Method r12 = r10.method
                    net.bytebuddy.jar.asm.Type r12 = net.bytebuddy.jar.asm.Type.getReturnType(r12)
                    r0 = 172(0xac, float:2.41E-43)
                    int r12 = r12.getOpcode(r0)
                    r11.visitInsn(r12)
                    int r3 = r3 - r1
                    java.lang.reflect.Method r11 = r10.method
                    net.bytebuddy.jar.asm.Type r11 = net.bytebuddy.jar.asm.Type.getReturnType(r11)
                    int r11 = r11.getSize()
                    int r11 = java.lang.Math.max(r3, r11)
                    return r11
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
                    java.lang.reflect.Method r2 = r4.method
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForStaticMethod r5 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForStaticMethod) r5
                    java.lang.reflect.Method r5 = r5.method
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
                    java.lang.reflect.Method r1 = r2.method
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            @net.bytebuddy.utility.nullability.MaybeNull
            public java.lang.Object invoke(java.lang.Object[] r4) throws java.lang.Throwable {
                    r3 = this;
                    net.bytebuddy.utility.Invoker r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.access$100()
                    java.lang.reflect.Method r1 = r3.method
                    r2 = 0
                    java.lang.Object r4 = r0.invoke(r1, r2, r4)
                    return r4
            }
        }

        @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
        public static class ForUnresolvedMethod implements net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher {
            private final java.lang.String message;

            public ForUnresolvedMethod(java.lang.String r1) {
                    r0 = this;
                    r0.<init>()
                    r0.message = r1
                    return
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public int apply(net.bytebuddy.jar.asm.MethodVisitor r8, java.lang.reflect.Method r9) {
                    r7 = this;
                    java.lang.Class<java.lang.IllegalStateException> r9 = java.lang.IllegalStateException.class
                    java.lang.String r0 = net.bytebuddy.jar.asm.Type.getInternalName(r9)
                    r1 = 187(0xbb, float:2.62E-43)
                    r8.visitTypeInsn(r1, r0)
                    r0 = 89
                    r8.visitInsn(r0)
                    java.lang.String r0 = r7.message
                    r8.visitLdcInsn(r0)
                    java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r9)
                    net.bytebuddy.jar.asm.Type r9 = net.bytebuddy.jar.asm.Type.VOID_TYPE
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r0)
                    net.bytebuddy.jar.asm.Type[] r0 = new net.bytebuddy.jar.asm.Type[]{r0}
                    java.lang.String r5 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r9, r0)
                    r6 = 0
                    r2 = 183(0xb7, float:2.56E-43)
                    java.lang.String r4 = "<init>"
                    r1 = r8
                    r1.visitMethodInsn(r2, r3, r4, r5, r6)
                    r9 = 191(0xbf, float:2.68E-43)
                    r8.visitInsn(r9)
                    r8 = 3
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
                    java.lang.String r2 = r4.message
                    net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForUnresolvedMethod r5 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForUnresolvedMethod) r5
                    java.lang.String r5 = r5.message
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
                    java.lang.String r1 = r2.message
                    int r1 = r1.hashCode()
                    int r0 = r0 + r1
                    return r0
            }

            @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher
            public java.lang.Object invoke(java.lang.Object[] r3) throws java.lang.Throwable {
                    r2 = this;
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "Could not invoke proxy: "
                    r0.append(r1)
                    java.lang.String r1 = r2.message
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r3.<init>(r0)
                    throw r3
            }
        }

        int apply(net.bytebuddy.jar.asm.MethodVisitor r1, java.lang.reflect.Method r2);

        @net.bytebuddy.utility.nullability.MaybeNull
        java.lang.Object invoke(java.lang.Object[] r1) throws java.lang.Throwable;
    }

    public static class DynamicClassLoader extends java.lang.ClassLoader {

        @net.bytebuddy.utility.nullability.MaybeNull
        private static final java.lang.String DUMP_FOLDER = null;
        private static final java.lang.Object[] NO_ARGUMENT = null;
        private static final java.lang.Class<?>[] NO_PARAMETER = null;

        public interface Resolver {

            public enum CreationAction extends java.lang.Enum<net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction> implements java.security.PrivilegedAction<net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver> {
                private static final /* synthetic */ net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction[] $VALUES = null;
                public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction INSTANCE = null;

                static {
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$CreationAction r0 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$CreationAction
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction.INSTANCE = r0
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$CreationAction[] r0 = new net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction[]{r0}
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction.$VALUES = r0
                        return
                }

                CreationAction(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$CreationAction> r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$CreationAction r1 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction) r1
                        return r1
                }

                public static net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction[] values() {
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$CreationAction[] r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$CreationAction[] r0 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction[]) r0
                        return r0
                }

                @Override // java.security.PrivilegedAction
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                public /* bridge */ /* synthetic */ net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver run() {
                        r1 = this;
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver r0 = r1.run2()
                        return r0
                }

                @Override // java.security.PrivilegedAction
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
                /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
                public net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver run2() {
                        r7 = this;
                        java.lang.Class<java.lang.String> r0 = java.lang.String.class
                        java.lang.String r1 = "java.lang.Module"
                        r2 = 0
                        r3 = 0
                        java.lang.Class r1 = java.lang.Class.forName(r1, r2, r3)     // Catch: java.lang.Exception -> L34
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$ForModuleSystem r2 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$ForModuleSystem     // Catch: java.lang.Exception -> L34
                        java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
                        java.lang.String r5 = "getModule"
                        java.lang.reflect.Method r4 = r4.getMethod(r5, r3)     // Catch: java.lang.Exception -> L34
                        java.lang.String r5 = "isExported"
                        java.lang.Class[] r6 = new java.lang.Class[]{r0}     // Catch: java.lang.Exception -> L34
                        java.lang.reflect.Method r5 = r1.getMethod(r5, r6)     // Catch: java.lang.Exception -> L34
                        java.lang.String r6 = "addExports"
                        java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}     // Catch: java.lang.Exception -> L34
                        java.lang.reflect.Method r0 = r1.getMethod(r6, r0)     // Catch: java.lang.Exception -> L34
                        java.lang.Class<java.lang.ClassLoader> r1 = java.lang.ClassLoader.class
                        java.lang.String r6 = "getUnnamedModule"
                        java.lang.reflect.Method r1 = r1.getMethod(r6, r3)     // Catch: java.lang.Exception -> L34
                        r2.<init>(r4, r5, r0, r1)     // Catch: java.lang.Exception -> L34
                        return r2
                    L34:
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$NoOp r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp.INSTANCE
                        return r0
                }
            }

            @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
            public static class ForModuleSystem implements net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver {
                private final java.lang.reflect.Method addExports;
                private final java.lang.reflect.Method getModule;
                private final java.lang.reflect.Method getUnnamedModule;
                private final java.lang.reflect.Method isExported;

                public ForModuleSystem(java.lang.reflect.Method r1, java.lang.reflect.Method r2, java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
                        r0 = this;
                        r0.<init>()
                        r0.getModule = r1
                        r0.isExported = r2
                        r0.addExports = r3
                        r0.getUnnamedModule = r4
                        return
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver
                @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should always be wrapped for clarity.", value = {"REC_CATCH_EXCEPTION"})
                public void accept(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r5, java.lang.Class<?> r6) {
                        r4 = this;
                        java.lang.Package r0 = r6.getPackage()
                        if (r0 == 0) goto L40
                        java.lang.reflect.Method r1 = r4.getModule     // Catch: java.lang.Exception -> L37
                        r2 = 0
                        java.lang.Object r6 = r1.invoke(r6, r2)     // Catch: java.lang.Exception -> L37
                        java.lang.reflect.Method r1 = r4.isExported     // Catch: java.lang.Exception -> L37
                        java.lang.String r3 = r0.getName()     // Catch: java.lang.Exception -> L37
                        java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L37
                        java.lang.Object r1 = r1.invoke(r6, r3)     // Catch: java.lang.Exception -> L37
                        java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Exception -> L37
                        boolean r1 = r1.booleanValue()     // Catch: java.lang.Exception -> L37
                        if (r1 != 0) goto L40
                        java.lang.reflect.Method r1 = r4.addExports     // Catch: java.lang.Exception -> L37
                        java.lang.String r0 = r0.getName()     // Catch: java.lang.Exception -> L37
                        java.lang.reflect.Method r3 = r4.getUnnamedModule     // Catch: java.lang.Exception -> L37
                        java.lang.Object r5 = r3.invoke(r5, r2)     // Catch: java.lang.Exception -> L37
                        java.lang.Object[] r5 = new java.lang.Object[]{r0, r5}     // Catch: java.lang.Exception -> L37
                        r1.invoke(r6, r5)     // Catch: java.lang.Exception -> L37
                        goto L40
                    L37:
                        r5 = move-exception
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "Failed to adjust module graph for dispatcher"
                        r6.<init>(r0, r5)
                        throw r6
                    L40:
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
                        java.lang.reflect.Method r2 = r4.getModule
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$ForModuleSystem r5 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.ForModuleSystem) r5
                        java.lang.reflect.Method r3 = r5.getModule
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L20
                        return r1
                    L20:
                        java.lang.reflect.Method r2 = r4.isExported
                        java.lang.reflect.Method r3 = r5.isExported
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L2b
                        return r1
                    L2b:
                        java.lang.reflect.Method r2 = r4.addExports
                        java.lang.reflect.Method r3 = r5.addExports
                        boolean r2 = r2.equals(r3)
                        if (r2 != 0) goto L36
                        return r1
                    L36:
                        java.lang.reflect.Method r2 = r4.getUnnamedModule
                        java.lang.reflect.Method r5 = r5.getUnnamedModule
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
                        java.lang.reflect.Method r1 = r2.getModule
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.isExported
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.addExports
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        int r0 = r0 * 31
                        java.lang.reflect.Method r1 = r2.getUnnamedModule
                        int r1 = r1.hashCode()
                        int r0 = r0 + r1
                        return r0
                }
            }

            public enum NoOp extends java.lang.Enum<net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp> implements net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver {
                private static final /* synthetic */ net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp[] $VALUES = null;
                public static final net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp INSTANCE = null;

                static {
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$NoOp r0 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$NoOp
                        java.lang.String r1 = "INSTANCE"
                        r2 = 0
                        r0.<init>(r1, r2)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp.INSTANCE = r0
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$NoOp[] r0 = new net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp[]{r0}
                        net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp.$VALUES = r0
                        return
                }

                NoOp(java.lang.String r1, int r2) {
                        r0 = this;
                        r0.<init>(r1, r2)
                        return
                }

                public static net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp valueOf(java.lang.String r1) {
                        java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$NoOp> r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp.class
                        java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$NoOp r1 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp) r1
                        return r1
                }

                public static net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp[] values() {
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$NoOp[] r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp.$VALUES
                        java.lang.Object r0 = r0.clone()
                        net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$NoOp[] r0 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.NoOp[]) r0
                        return r0
                }

                @Override // net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver
                public void accept(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.lang.Class<?> r2) {
                        r0 = this;
                        return
                }
            }

            void accept(@net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1, java.lang.Class<?> r2);
        }

        static {
                r0 = 0
                java.lang.Class[] r1 = new java.lang.Class[r0]
                net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.NO_PARAMETER = r1
                java.lang.Object[] r0 = new java.lang.Object[r0]
                net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.NO_ARGUMENT = r0
                net.bytebuddy.utility.privilege.GetSystemPropertyAction r0 = new net.bytebuddy.utility.privilege.GetSystemPropertyAction     // Catch: java.lang.Throwable -> L17
                java.lang.String r1 = "net.bytebuddy.dump"
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L17
                java.lang.Object r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.access$200(r0)     // Catch: java.lang.Throwable -> L17
                java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L17
                goto L18
            L17:
                r0 = 0
            L18:
                net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.DUMP_FOLDER = r0
                return
        }

        public DynamicClassLoader(java.lang.Class<?> r2) {
                r1 = this;
                java.lang.ClassLoader r0 = r2.getClassLoader()
                r1.<init>(r0)
                net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.access$300()
                r0.accept(r1, r2)
                return
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Expected internal invocation.", value = {"REC_CATCH_EXCEPTION", "DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
        public static net.bytebuddy.utility.Invoker invoker() {
                net.bytebuddy.jar.asm.ClassWriter r0 = new net.bytebuddy.jar.asm.ClassWriter
                r8 = 0
                r0.<init>(r8)
                net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V5
                net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.ofThisVm(r1)
                int r2 = r1.getMinorMajorVersion()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.Class<net.bytebuddy.utility.Invoker> r9 = net.bytebuddy.utility.Invoker.class
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r9)
                r1.append(r3)
                java.lang.String r10 = "$Dispatcher"
                r1.append(r10)
                java.lang.String r4 = r1.toString()
                java.lang.Class<java.lang.Object> r11 = java.lang.Object.class
                java.lang.String r6 = net.bytebuddy.jar.asm.Type.getInternalName(r11)
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r9)
                java.lang.String[] r7 = new java.lang.String[]{r1}
                r3 = 1
                r5 = 0
                r1 = r0
                r1.visit(r2, r3, r4, r5, r6, r7)
                net.bytebuddy.utility.GraalImageCode r1 = net.bytebuddy.utility.GraalImageCode.getCurrent()
                java.lang.reflect.Method[] r2 = r9.getMethods()
                net.bytebuddy.utility.MethodComparator r3 = net.bytebuddy.utility.MethodComparator.INSTANCE
                java.lang.Object[] r1 = r1.sorted(r2, r3)
                r7 = r1
                java.lang.reflect.Method[] r7 = (java.lang.reflect.Method[]) r7
                int r12 = r7.length
                r13 = r8
            L4e:
                r14 = 1
                if (r13 >= r12) goto Lf0
                r15 = r7[r13]
                java.lang.Class[] r1 = r15.getExceptionTypes()
                int r2 = r1.length
                java.lang.String[] r6 = new java.lang.String[r2]
                r2 = r8
            L5b:
                int r3 = r1.length
                if (r2 >= r3) goto L69
                r3 = r1[r2]
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r3)
                r6[r2] = r3
                int r2 = r2 + 1
                goto L5b
            L69:
                java.lang.String r3 = r15.getName()
                java.lang.String r4 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r15)
                r5 = 0
                r2 = 1
                r1 = r0
                net.bytebuddy.jar.asm.MethodVisitor r1 = r1.visitMethod(r2, r3, r4, r5, r6)
                r1.visitCode()
                java.lang.Class[] r2 = r15.getParameterTypes()
                int r2 = r2.length
                int r2 = r2 - r14
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[r2]
                r3 = r8
            L84:
                java.lang.Class[] r4 = r15.getParameterTypes()
                int r4 = r4.length
                if (r3 >= r4) goto Lac
                java.lang.Class[] r4 = r15.getParameterTypes()
                r4 = r4[r3]
                net.bytebuddy.jar.asm.Type r4 = net.bytebuddy.jar.asm.Type.getType(r4)
                if (r3 <= 0) goto L9b
                int r5 = r3 + (-1)
                r2[r5] = r4
            L9b:
                r5 = 21
                int r5 = r4.getOpcode(r5)
                r1.visitVarInsn(r5, r14)
                int r4 = r4.getSize()
                int r14 = r14 + r4
                int r3 = r3 + 1
                goto L84
            Lac:
                java.lang.Class[] r3 = r15.getParameterTypes()
                r3 = r3[r8]
                java.lang.String r18 = net.bytebuddy.jar.asm.Type.getInternalName(r3)
                java.lang.String r19 = r15.getName()
                net.bytebuddy.jar.asm.Type r3 = net.bytebuddy.jar.asm.Type.getReturnType(r15)
                java.lang.String r20 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r3, r2)
                r21 = 0
                r17 = 182(0xb6, float:2.55E-43)
                r16 = r1
                r16.visitMethodInsn(r17, r18, r19, r20, r21)
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getReturnType(r15)
                r3 = 172(0xac, float:2.41E-43)
                int r2 = r2.getOpcode(r3)
                r1.visitInsn(r2)
                int r2 = r14 + (-1)
                net.bytebuddy.jar.asm.Type r3 = net.bytebuddy.jar.asm.Type.getReturnType(r15)
                int r3 = r3.getSize()
                int r2 = java.lang.Math.max(r2, r3)
                r1.visitMaxs(r2, r14)
                r1.visitEnd()
                int r13 = r13 + 1
                goto L4e
            Lf0:
                net.bytebuddy.jar.asm.Type r7 = net.bytebuddy.jar.asm.Type.VOID_TYPE
                net.bytebuddy.jar.asm.Type[] r1 = new net.bytebuddy.jar.asm.Type[r8]
                java.lang.String r4 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r7, r1)
                r5 = 0
                r6 = 0
                r2 = 1
                java.lang.String r3 = "<init>"
                r1 = r0
                net.bytebuddy.jar.asm.MethodVisitor r1 = r1.visitMethod(r2, r3, r4, r5, r6)
                r1.visitCode()
                r2 = 25
                r1.visitVarInsn(r2, r8)
                java.lang.String r17 = net.bytebuddy.jar.asm.Type.getInternalName(r11)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[r8]
                java.lang.String r19 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r7, r2)
                r20 = 0
                r16 = 183(0xb7, float:2.56E-43)
                java.lang.String r18 = "<init>"
                r15 = r1
                r15.visitMethodInsn(r16, r17, r18, r19, r20)
                r2 = 177(0xb1, float:2.48E-43)
                r1.visitInsn(r2)
                r1.visitMaxs(r14, r14)
                r1.visitEnd()
                r0.visitEnd()
                byte[] r5 = r0.toByteArray()
                java.lang.String r0 = "net.bytebuddy.dump"
                java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L164
                if (r0 == 0) goto L164
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L164
                java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L164
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L164
                r3.<init>()     // Catch: java.lang.Throwable -> L164
                java.lang.String r4 = r9.getName()     // Catch: java.lang.Throwable -> L164
                r3.append(r4)     // Catch: java.lang.Throwable -> L164
                java.lang.String r4 = "$Dispatcher.class"
                r3.append(r4)     // Catch: java.lang.Throwable -> L164
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L164
                r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L164
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L164
                r1.write(r5)     // Catch: java.lang.Throwable -> L15e
                r1.close()     // Catch: java.lang.Throwable -> L164
                goto L164
            L15e:
                r0 = move-exception
                r2 = r0
                r1.close()     // Catch: java.lang.Throwable -> L164
                throw r2     // Catch: java.lang.Throwable -> L164
            L164:
                net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader r3 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                r3.<init>(r9)     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                r0.<init>()     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                java.lang.String r1 = r9.getName()     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                r0.append(r1)     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                r0.append(r10)     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                int r7 = r5.length     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher> r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.class
                java.security.ProtectionDomain r8 = r0.getProtectionDomain()     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                r6 = 0
                java.lang.Class r0 = r3.defineClass(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                java.lang.Class<?>[] r1 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.NO_PARAMETER     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                java.lang.Object[] r1 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.NO_ARGUMENT     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                java.lang.Object r0 = r0.newInstance(r1)     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                net.bytebuddy.utility.Invoker r0 = (net.bytebuddy.utility.Invoker) r0     // Catch: java.lang.Exception -> L197 java.lang.UnsupportedOperationException -> L1b3
                return r0
            L197:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Failed to create invoker for "
                r2.append(r3)
                java.lang.String r3 = r9.getName()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2, r0)
                throw r1
            L1b3:
                net.bytebuddy.utility.dispatcher.JavaDispatcher$DirectInvoker r0 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$DirectInvoker
                r1 = 0
                r0.<init>(r1)
                return r0
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Expected internal invocation.", value = {"REC_CATCH_EXCEPTION", "DP_CREATE_CLASSLOADER_INSIDE_DO_PRIVILEGED"})
        public static java.lang.Object proxy(java.lang.Class<?> r18, java.util.Map<java.lang.reflect.Method, net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher> r19) {
                net.bytebuddy.jar.asm.ClassWriter r0 = new net.bytebuddy.jar.asm.ClassWriter
                r8 = 0
                r0.<init>(r8)
                net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V5
                net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.ofThisVm(r1)
                int r2 = r1.getMinorMajorVersion()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r18)
                r1.append(r3)
                java.lang.String r9 = "$Proxy"
                r1.append(r9)
                java.lang.String r4 = r1.toString()
                java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
                java.lang.String r6 = net.bytebuddy.jar.asm.Type.getInternalName(r10)
                java.lang.String r1 = net.bytebuddy.jar.asm.Type.getInternalName(r18)
                java.lang.String[] r7 = new java.lang.String[]{r1}
                r3 = 1
                r5 = 0
                r1 = r0
                r1.visit(r2, r3, r4, r5, r6, r7)
                java.util.Set r1 = r19.entrySet()
                java.util.Iterator r7 = r1.iterator()
            L41:
                boolean r1 = r7.hasNext()
                r11 = 1
                if (r1 == 0) goto Lcd
                java.lang.Object r1 = r7.next()
                r12 = r1
                java.util.Map$Entry r12 = (java.util.Map.Entry) r12
                java.lang.Object r1 = r12.getKey()
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                java.lang.Class[] r1 = r1.getExceptionTypes()
                int r2 = r1.length
                java.lang.String[] r6 = new java.lang.String[r2]
                r2 = r8
            L5d:
                int r3 = r1.length
                if (r2 >= r3) goto L6b
                r3 = r1[r2]
                java.lang.String r3 = net.bytebuddy.jar.asm.Type.getInternalName(r3)
                r6[r2] = r3
                int r2 = r2 + 1
                goto L5d
            L6b:
                java.lang.Object r1 = r12.getKey()
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                java.lang.String r3 = r1.getName()
                java.lang.Object r1 = r12.getKey()
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                java.lang.String r4 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r1)
                r5 = 0
                r2 = 1
                r1 = r0
                net.bytebuddy.jar.asm.MethodVisitor r1 = r1.visitMethod(r2, r3, r4, r5, r6)
                r1.visitCode()
                java.lang.Object r2 = r12.getKey()
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                int r2 = r2.getModifiers()
                r2 = r2 & 8
                if (r2 != 0) goto L98
                goto L99
            L98:
                r11 = r8
            L99:
                java.lang.Object r2 = r12.getKey()
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                java.lang.Class[] r2 = r2.getParameterTypes()
                int r3 = r2.length
                r4 = r8
            La5:
                if (r4 >= r3) goto Lb5
                r5 = r2[r4]
                net.bytebuddy.jar.asm.Type r5 = net.bytebuddy.jar.asm.Type.getType(r5)
                int r5 = r5.getSize()
                int r11 = r11 + r5
                int r4 = r4 + 1
                goto La5
            Lb5:
                java.lang.Object r2 = r12.getValue()
                net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher r2 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher) r2
                java.lang.Object r3 = r12.getKey()
                java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
                int r2 = r2.apply(r1, r3)
                r1.visitMaxs(r2, r11)
                r1.visitEnd()
                goto L41
            Lcd:
                net.bytebuddy.jar.asm.Type r7 = net.bytebuddy.jar.asm.Type.VOID_TYPE
                net.bytebuddy.jar.asm.Type[] r1 = new net.bytebuddy.jar.asm.Type[r8]
                java.lang.String r4 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r7, r1)
                r5 = 0
                r6 = 0
                r2 = 1
                java.lang.String r3 = "<init>"
                r1 = r0
                net.bytebuddy.jar.asm.MethodVisitor r1 = r1.visitMethod(r2, r3, r4, r5, r6)
                r1.visitCode()
                r2 = 25
                r1.visitVarInsn(r2, r8)
                java.lang.String r14 = net.bytebuddy.jar.asm.Type.getInternalName(r10)
                net.bytebuddy.jar.asm.Type[] r2 = new net.bytebuddy.jar.asm.Type[r8]
                java.lang.String r16 = net.bytebuddy.jar.asm.Type.getMethodDescriptor(r7, r2)
                r17 = 0
                r13 = 183(0xb7, float:2.56E-43)
                java.lang.String r15 = "<init>"
                r12 = r1
                r12.visitMethodInsn(r13, r14, r15, r16, r17)
                r2 = 177(0xb1, float:2.48E-43)
                r1.visitInsn(r2)
                r1.visitMaxs(r11, r11)
                r1.visitEnd()
                r0.visitEnd()
                byte[] r5 = r0.toByteArray()
                java.lang.String r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.DUMP_FOLDER
                if (r0 == 0) goto L13d
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L13d
                java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L13d
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L13d
                r3.<init>()     // Catch: java.lang.Throwable -> L13d
                java.lang.String r4 = r18.getName()     // Catch: java.lang.Throwable -> L13d
                r3.append(r4)     // Catch: java.lang.Throwable -> L13d
                java.lang.String r4 = "$Proxy.class"
                r3.append(r4)     // Catch: java.lang.Throwable -> L13d
                java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L13d
                r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> L13d
                r1.<init>(r2)     // Catch: java.lang.Throwable -> L13d
                r1.write(r5)     // Catch: java.lang.Throwable -> L137
                r1.close()     // Catch: java.lang.Throwable -> L13d
                goto L13d
            L137:
                r0 = move-exception
                r2 = r0
                r1.close()     // Catch: java.lang.Throwable -> L13d
                throw r2     // Catch: java.lang.Throwable -> L13d
            L13d:
                net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader r3 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader     // Catch: java.lang.Exception -> L172
                r1 = r18
                r3.<init>(r1)     // Catch: java.lang.Exception -> L170
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L170
                r0.<init>()     // Catch: java.lang.Exception -> L170
                java.lang.String r2 = r18.getName()     // Catch: java.lang.Exception -> L170
                r0.append(r2)     // Catch: java.lang.Exception -> L170
                r0.append(r9)     // Catch: java.lang.Exception -> L170
                java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L170
                int r7 = r5.length     // Catch: java.lang.Exception -> L170
                java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher> r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.class
                java.security.ProtectionDomain r8 = r0.getProtectionDomain()     // Catch: java.lang.Exception -> L170
                r6 = 0
                java.lang.Class r0 = r3.defineClass(r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L170
                java.lang.Class<?>[] r2 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.NO_PARAMETER     // Catch: java.lang.Exception -> L170
                java.lang.reflect.Constructor r0 = r0.getConstructor(r2)     // Catch: java.lang.Exception -> L170
                java.lang.Object[] r2 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.NO_ARGUMENT     // Catch: java.lang.Exception -> L170
                java.lang.Object r0 = r0.newInstance(r2)     // Catch: java.lang.Exception -> L170
                return r0
            L170:
                r0 = move-exception
                goto L175
            L172:
                r0 = move-exception
                r1 = r18
            L175:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                java.lang.String r4 = "Failed to create proxy for "
                r3.append(r4)
                java.lang.String r1 = r18.getName()
                r3.append(r1)
                java.lang.String r1 = r3.toString()
                r2.<init>(r1, r0)
                throw r2
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Instance {
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class InvokerCreationAction implements java.security.PrivilegedAction<net.bytebuddy.utility.Invoker> {
        private InvokerCreationAction() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ InvokerCreationAction(net.bytebuddy.utility.dispatcher.JavaDispatcher.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                r3 = this;
                r0 = 1
                if (r3 != r4) goto L4
                return r0
            L4:
                r1 = 0
                if (r4 != 0) goto L8
                return r1
            L8:
                java.lang.Class r2 = r3.getClass()
                java.lang.Class r4 = r4.getClass()
                if (r2 == r4) goto L13
                return r1
            L13:
                return r0
        }

        public int hashCode() {
                r1 = this;
                java.lang.Class r0 = r1.getClass()
                int r0 = r0.hashCode()
                return r0
        }

        @Override // java.security.PrivilegedAction
        public /* bridge */ /* synthetic */ net.bytebuddy.utility.Invoker run() {
                r1 = this;
                net.bytebuddy.utility.Invoker r0 = r1.run2()
                return r0
        }

        @Override // java.security.PrivilegedAction
        /* JADX INFO: renamed from: run, reason: avoid collision after fix types in other method */
        public net.bytebuddy.utility.Invoker run2() {
                r1 = this;
                net.bytebuddy.utility.Invoker r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.invoker()
                return r0
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface IsConstructor {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.METHOD})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface IsStatic {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface Proxied {
        java.lang.String value();
    }

    @net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
    public static class ProxiedInvocationHandler implements java.lang.reflect.InvocationHandler {
        private static final java.lang.Object[] NO_ARGUMENTS = null;
        private final java.lang.String name;
        private final java.util.Map<java.lang.reflect.Method, net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher> targets;

        static {
                r0 = 0
                java.lang.Object[] r0 = new java.lang.Object[r0]
                net.bytebuddy.utility.dispatcher.JavaDispatcher.ProxiedInvocationHandler.NO_ARGUMENTS = r0
                return
        }

        public ProxiedInvocationHandler(java.lang.String r1, java.util.Map<java.lang.reflect.Method, net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher> r2) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.targets = r2
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
                java.lang.String r2 = r4.name
                net.bytebuddy.utility.dispatcher.JavaDispatcher$ProxiedInvocationHandler r5 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.ProxiedInvocationHandler) r5
                java.lang.String r3 = r5.name
                boolean r2 = r2.equals(r3)
                if (r2 != 0) goto L20
                return r1
            L20:
                java.util.Map<java.lang.reflect.Method, net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher> r2 = r4.targets
                java.util.Map<java.lang.reflect.Method, net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher> r5 = r5.targets
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
                java.lang.String r1 = r2.name
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.Map<java.lang.reflect.Method, net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher> r1 = r2.targets
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // java.lang.reflect.InvocationHandler
        @net.bytebuddy.utility.nullability.MaybeNull
        public java.lang.Object invoke(java.lang.Object r4, java.lang.reflect.Method r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.Object[] r6) throws java.lang.Throwable {
                r3 = this;
                java.lang.Class r4 = r5.getDeclaringClass()
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                r1 = 0
                if (r4 != r0) goto L81
                java.lang.String r4 = r5.getName()
                java.lang.String r0 = "hashCode"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L1e
                int r4 = r3.hashCode()
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                return r4
            L1e:
                java.lang.String r4 = r5.getName()
                java.lang.String r0 = "equals"
                boolean r4 = r4.equals(r0)
                if (r4 == 0) goto L4a
                r4 = r6[r1]
                if (r4 == 0) goto L45
                java.lang.Class r4 = r4.getClass()
                boolean r4 = java.lang.reflect.Proxy.isProxyClass(r4)
                if (r4 == 0) goto L45
                r4 = r6[r1]
                java.lang.reflect.InvocationHandler r4 = java.lang.reflect.Proxy.getInvocationHandler(r4)
                boolean r4 = r4.equals(r3)
                if (r4 == 0) goto L45
                r1 = 1
            L45:
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
                return r4
            L4a:
                java.lang.String r4 = r5.getName()
                java.lang.String r6 = "toString"
                boolean r4 = r4.equals(r6)
                if (r4 == 0) goto L6a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Call proxy for "
                r4.append(r5)
                java.lang.String r5 = r3.name
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                return r4
            L6a:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r0 = "Unexpected object method: "
                r6.append(r0)
                r6.append(r5)
                java.lang.String r5 = r6.toString()
                r4.<init>(r5)
                throw r4
            L81:
                java.util.Map<java.lang.reflect.Method, net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher> r4 = r3.targets
                java.lang.Object r4 = r4.get(r5)
                net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher r4 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher) r4
                if (r4 == 0) goto L9d
                if (r6 != 0) goto L98
                java.lang.Object[] r6 = net.bytebuddy.utility.dispatcher.JavaDispatcher.ProxiedInvocationHandler.NO_ARGUMENTS     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94 java.lang.reflect.InvocationTargetException -> L96
                goto L98
            L90:
                r4 = move-exception
                goto Lb9
            L92:
                r4 = move-exception
                goto Le3
            L94:
                r4 = move-exception
                goto Le4
            L96:
                r4 = move-exception
                goto Lb4
            L98:
                java.lang.Object r4 = r4.invoke(r6)     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94 java.lang.reflect.InvocationTargetException -> L96
                return r4
            L9d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94 java.lang.reflect.InvocationTargetException -> L96
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94 java.lang.reflect.InvocationTargetException -> L96
                r6.<init>()     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94 java.lang.reflect.InvocationTargetException -> L96
                java.lang.String r0 = "No proxy target found for "
                r6.append(r0)     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94 java.lang.reflect.InvocationTargetException -> L96
                r6.append(r5)     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94 java.lang.reflect.InvocationTargetException -> L96
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94 java.lang.reflect.InvocationTargetException -> L96
                r4.<init>(r6)     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94 java.lang.reflect.InvocationTargetException -> L96
                throw r4     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94 java.lang.reflect.InvocationTargetException -> L96
            Lb4:
                java.lang.Throwable r4 = r4.getTargetException()     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94
                throw r4     // Catch: java.lang.Throwable -> L90 java.lang.Error -> L92 java.lang.RuntimeException -> L94
            Lb9:
                java.lang.Class[] r6 = r5.getExceptionTypes()
                int r0 = r6.length
            Lbe:
                if (r1 >= r0) goto Lcc
                r2 = r6[r1]
                boolean r2 = r2.isInstance(r4)
                if (r2 != 0) goto Lcb
                int r1 = r1 + 1
                goto Lbe
            Lcb:
                throw r4
            Lcc:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Failed to invoke proxy for "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = r0.toString()
                r6.<init>(r5, r4)
                throw r6
            Le3:
                throw r4
            Le4:
                throw r4
        }
    }

    static {
            r0 = 0
            r1 = 0
            java.lang.String r2 = "java.security.AccessController"
            java.lang.Class.forName(r2, r1, r0)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            java.lang.String r2 = "net.bytebuddy.securitymanager"
            java.lang.String r3 = "true"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            net.bytebuddy.utility.dispatcher.JavaDispatcher.ACCESS_CONTROLLER = r2     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
            goto L19
        L16:
            r1 = 1
        L17:
            net.bytebuddy.utility.dispatcher.JavaDispatcher.ACCESS_CONTROLLER = r1
        L19:
            net.bytebuddy.utility.privilege.GetSystemPropertyAction r1 = new net.bytebuddy.utility.privilege.GetSystemPropertyAction
            java.lang.String r2 = "net.bytebuddy.generate"
            r1.<init>(r2)
            java.lang.Object r1 = doPrivileged(r1)
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            net.bytebuddy.utility.dispatcher.JavaDispatcher.GENERATE = r1
            net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver$CreationAction r1 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver.CreationAction.INSTANCE
            java.lang.Object r1 = doPrivileged(r1)
            net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver r1 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver) r1
            net.bytebuddy.utility.dispatcher.JavaDispatcher.RESOLVER = r1
            net.bytebuddy.utility.dispatcher.JavaDispatcher$InvokerCreationAction r1 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$InvokerCreationAction
            r1.<init>(r0)
            java.lang.Object r0 = doPrivileged(r1)
            net.bytebuddy.utility.Invoker r0 = (net.bytebuddy.utility.Invoker) r0
            net.bytebuddy.utility.dispatcher.JavaDispatcher.INVOKER = r0
            return
    }

    public JavaDispatcher(java.lang.Class<T> r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.proxy = r1
            r0.classLoader = r2
            r0.generate = r3
            return
    }

    public static /* synthetic */ net.bytebuddy.utility.Invoker access$100() {
            net.bytebuddy.utility.Invoker r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.INVOKER
            return r0
    }

    public static /* synthetic */ java.lang.Object access$200(java.security.PrivilegedAction r0) {
            java.lang.Object r0 = doPrivileged(r0)
            return r0
    }

    public static /* synthetic */ net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.Resolver access$300() {
            net.bytebuddy.utility.dispatcher.JavaDispatcher$DynamicClassLoader$Resolver r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.RESOLVER
            return r0
    }

    @net.bytebuddy.build.AccessControllerPlugin.Enhance
    private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
            boolean r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.ACCESS_CONTROLLER
            if (r0 == 0) goto L9
            java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
            return r1
        L9:
            java.lang.Object r1 = r1.run()
            return r1
    }

    public static <T> java.security.PrivilegedAction<T> of(java.lang.Class<T> r1) {
            r0 = 0
            java.security.PrivilegedAction r1 = of(r1, r0)
            return r1
    }

    public static <T> java.security.PrivilegedAction<T> of(java.lang.Class<T> r1, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r2) {
            boolean r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.GENERATE
            java.security.PrivilegedAction r1 = of(r1, r2, r0)
            return r1
    }

    public static <T> java.security.PrivilegedAction<T> of(java.lang.Class<T> r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r3, boolean r4) {
            boolean r0 = r2.isInterface()
            if (r0 == 0) goto L68
            java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied> r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied.class
            boolean r1 = r2.isAnnotationPresent(r0)
            if (r1 == 0) goto L41
            java.lang.annotation.Annotation r0 = r2.getAnnotation(r0)
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied r0 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r0
            java.lang.String r0 = r0.value()
            java.lang.String r1 = "java.security."
            boolean r0 = r0.startsWith(r1)
            if (r0 != 0) goto L26
            net.bytebuddy.utility.dispatcher.JavaDispatcher r0 = new net.bytebuddy.utility.dispatcher.JavaDispatcher
            r0.<init>(r2, r3, r4)
            return r0
        L26:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Classes related to Java security cannot be proxied: "
            r4.append(r0)
            java.lang.String r2 = r2.getName()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L41:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = "Expected "
            r4.append(r1)
            java.lang.String r2 = r2.getName()
            r4.append(r2)
            java.lang.String r2 = " to be annotated with "
            r4.append(r2)
            java.lang.String r2 = r0.getName()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
        L68:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Expected an interface instead of "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
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
            boolean r2 = r4.generate
            net.bytebuddy.utility.dispatcher.JavaDispatcher r5 = (net.bytebuddy.utility.dispatcher.JavaDispatcher) r5
            boolean r3 = r5.generate
            if (r2 == r3) goto L1c
            return r1
        L1c:
            java.lang.Class<T> r2 = r4.proxy
            java.lang.Class<T> r3 = r5.proxy
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L27
            return r1
        L27:
            java.lang.ClassLoader r2 = r4.classLoader
            java.lang.ClassLoader r5 = r5.classLoader
            if (r5 == 0) goto L36
            if (r2 == 0) goto L38
            boolean r5 = r2.equals(r5)
            if (r5 != 0) goto L39
            return r1
        L36:
            if (r2 == 0) goto L39
        L38:
            return r1
        L39:
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.getClass()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Class<T> r1 = r2.proxy
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.ClassLoader r1 = r2.classLoader
            if (r1 == 0) goto L1c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
        L1c:
            int r0 = r0 * 31
            boolean r1 = r2.generate
            int r0 = r0 + r1
            return r0
    }

    @Override // java.security.PrivilegedAction
    public T run() {
            r31 = this;
            r1 = r31
            java.lang.String r3 = "Instance check requires a single regular-typed argument: "
            java.lang.String r4 = "Instance check requires a boolean return type: "
            java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$Instance> r5 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance.class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$IsStatic> r7 = net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic.class
            java.lang.Class<java.lang.System> r8 = java.lang.System.class
            java.lang.String r9 = "getSecurityManager"
            r10 = 0
            java.lang.reflect.Method r8 = r8.getMethod(r9, r10)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.Throwable -> L5d
            java.lang.Object r8 = r8.invoke(r10, r10)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.Throwable -> L5d
            if (r8 == 0) goto L5d
            java.lang.String r9 = "java.lang.SecurityManager"
            java.lang.Class r9 = java.lang.Class.forName(r9)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.Throwable -> L5d
            java.lang.String r10 = "checkPermission"
            java.lang.Class<java.security.Permission> r11 = java.security.Permission.class
            java.lang.Class[] r11 = new java.lang.Class[]{r11}     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.Throwable -> L5d
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.Throwable -> L5d
            java.lang.RuntimePermission r10 = new java.lang.RuntimePermission     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.Throwable -> L5d
            java.lang.String r11 = "net.bytebuddy.createJavaDispatcher"
            r10.<init>(r11)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.Throwable -> L5d
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.Throwable -> L5d
            r9.invoke(r8, r10)     // Catch: java.lang.IllegalAccessException -> L3c java.lang.reflect.InvocationTargetException -> L3f java.lang.Throwable -> L5d
            goto L5d
        L3c:
            r0 = move-exception
            r2 = r0
            goto L42
        L3f:
            r0 = move-exception
            r2 = r0
            goto L4a
        L42:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Failed to access security manager"
            r3.<init>(r4, r2)
            throw r3
        L4a:
            java.lang.Throwable r2 = r2.getTargetException()
            boolean r3 = r2 instanceof java.lang.RuntimeException
            if (r3 == 0) goto L55
            java.lang.RuntimeException r2 = (java.lang.RuntimeException) r2
            throw r2
        L55:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "Failed to assert access rights using security manager"
            r3.<init>(r4, r2)
            throw r3
        L5d:
            boolean r8 = r1.generate
            if (r8 == 0) goto L67
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            goto L6c
        L67:
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
        L6c:
            java.lang.Class<T> r9 = r1.proxy
            java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$Defaults> r10 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Defaults.class
            boolean r9 = r9.isAnnotationPresent(r10)
            java.lang.Class<T> r11 = r1.proxy
            java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied> r12 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r12)
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied r11 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r11
            java.lang.String r11 = r11.value()
            r13 = 0
            java.lang.ClassLoader r14 = r1.classLoader     // Catch: java.lang.ClassNotFoundException -> L736
            java.lang.Class r11 = java.lang.Class.forName(r11, r13, r14)     // Catch: java.lang.ClassNotFoundException -> L736
            boolean r14 = r1.generate
            if (r14 == 0) goto La0
            net.bytebuddy.utility.GraalImageCode r15 = net.bytebuddy.utility.GraalImageCode.getCurrent()
            java.lang.Class<T> r13 = r1.proxy
            java.lang.reflect.Method[] r13 = r13.getMethods()
            net.bytebuddy.utility.MethodComparator r2 = net.bytebuddy.utility.MethodComparator.INSTANCE
            java.lang.Object[] r2 = r15.sorted(r13, r2)
            java.lang.reflect.Method[] r2 = (java.lang.reflect.Method[]) r2
            goto La6
        La0:
            java.lang.Class<T> r2 = r1.proxy
            java.lang.reflect.Method[] r2 = r2.getMethods()
        La6:
            int r13 = r2.length
            r15 = 0
        La8:
            if (r15 >= r13) goto L711
            r16 = r13
            r13 = r2[r15]
            r17 = r2
            java.lang.Class r2 = r13.getDeclaringClass()
            if (r2 != r6) goto Lba
            r18 = r5
            goto L14f
        Lba:
            boolean r2 = r13.isAnnotationPresent(r5)
            if (r2 == 0) goto L112
            java.lang.Class[] r2 = r13.getParameterTypes()
            int r2 = r2.length
            r18 = r5
            r5 = 1
            if (r2 != r5) goto Lfd
            java.lang.Class[] r2 = r13.getParameterTypes()
            r5 = 0
            r2 = r2[r5]
            boolean r2 = r2.isAssignableFrom(r11)
            if (r2 == 0) goto Lfd
            java.lang.Class r2 = r13.getReturnType()
            java.lang.Class r5 = java.lang.Boolean.TYPE
            if (r2 != r5) goto Le8
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForInstanceCheck r2 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForInstanceCheck
            r2.<init>(r11)
            r8.put(r13, r2)
            goto L14f
        Le8:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        Lfd:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r4.append(r13)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L112:
            r18 = r5
            java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$Container> r2 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Container.class
            boolean r2 = r13.isAnnotationPresent(r2)
            if (r2 == 0) goto L18c
            java.lang.Class[] r2 = r13.getParameterTypes()
            int r2 = r2.length
            r5 = 1
            if (r2 != r5) goto L175
            java.lang.Class[] r2 = r13.getParameterTypes()
            r5 = 0
            r2 = r2[r5]
            java.lang.Class r5 = java.lang.Integer.TYPE
            if (r2 != r5) goto L175
            java.lang.Class r2 = r13.getReturnType()
            boolean r2 = r2.isArray()
            if (r2 == 0) goto L15e
            java.lang.Class r2 = r13.getReturnType()
            java.lang.Class r2 = r2.getComponentType()
            boolean r2 = r2.isAssignableFrom(r11)
            if (r2 == 0) goto L15e
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForContainerCreation r2 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForContainerCreation
            r2.<init>(r11)
            r8.put(r13, r2)
        L14f:
            r19 = r3
            r20 = r4
            r21 = r6
            r3 = r7
            r29 = r9
            r4 = r10
            r27 = r15
        L15b:
            r2 = 1
            goto L6fd
        L15e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Container creation requires an assignable array as return value: "
            r3.append(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L175:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Container creation requires a single int-typed argument: "
            r3.append(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L18c:
            java.lang.String r2 = r11.getName()
            java.lang.String r5 = "java.lang.invoke.MethodHandles"
            boolean r2 = r2.equals(r5)
            if (r2 == 0) goto L1ad
            java.lang.String r2 = r13.getName()
            java.lang.String r5 = "lookup"
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L1a5
            goto L1ad
        L1a5:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Cannot resolve Byte Buddy lookup via dispatcher"
            r2.<init>(r3)
            throw r2
        L1ad:
            java.lang.Class[] r2 = r13.getParameterTypes()     // Catch: java.lang.Throwable -> L634 java.lang.NoSuchMethodException -> L646 java.lang.ClassNotFoundException -> L6bc
            boolean r5 = r13.isAnnotationPresent(r7)     // Catch: java.lang.Throwable -> L634 java.lang.NoSuchMethodException -> L646 java.lang.ClassNotFoundException -> L658
            r19 = r3
            java.lang.Class<net.bytebuddy.utility.dispatcher.JavaDispatcher$IsConstructor> r3 = net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor.class
            if (r5 != 0) goto L1c1
            boolean r5 = r13.isAnnotationPresent(r3)     // Catch: java.lang.Throwable -> L280 java.lang.NoSuchMethodException -> L284 java.lang.ClassNotFoundException -> L288
            if (r5 == 0) goto L1c9
        L1c1:
            r20 = r4
            r21 = r6
            r22 = r14
            goto L28c
        L1c9:
            int r5 = r2.length     // Catch: java.lang.Throwable -> L280 java.lang.NoSuchMethodException -> L284 java.lang.ClassNotFoundException -> L288
            if (r5 == 0) goto L263
            r20 = r4
            r5 = 0
            r4 = r2[r5]     // Catch: java.lang.Throwable -> L234 java.lang.NoSuchMethodException -> L238 java.lang.ClassNotFoundException -> L23c
            boolean r4 = r4.isAssignableFrom(r11)     // Catch: java.lang.Throwable -> L234 java.lang.NoSuchMethodException -> L238 java.lang.ClassNotFoundException -> L23c
            if (r4 == 0) goto L240
            int r4 = r2.length     // Catch: java.lang.Throwable -> L234 java.lang.NoSuchMethodException -> L238 java.lang.ClassNotFoundException -> L23c
            r5 = 1
            int r4 = r4 - r5
            r21 = r6
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L20e java.lang.NoSuchMethodException -> L21b java.lang.ClassNotFoundException -> L228
            r22 = r14
            r14 = 0
            java.lang.System.arraycopy(r2, r5, r6, r14, r4)     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            r2 = r6
            r4 = 1
            goto L28d
        L1e8:
            r0 = move-exception
            r2 = r0
            r3 = r7
            r29 = r9
            r28 = r10
            r27 = r15
        L1f1:
            r14 = r22
            goto L66a
        L1f5:
            r0 = move-exception
            r2 = r0
            r3 = r7
            r29 = r9
            r28 = r10
            r27 = r15
        L1fe:
            r14 = r22
            goto L689
        L202:
            r0 = move-exception
            r2 = r0
            r3 = r7
            r29 = r9
            r4 = r10
            r27 = r15
            r14 = r22
            goto L6cc
        L20e:
            r0 = move-exception
        L20f:
            r22 = r14
            r2 = r0
            r3 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            goto L66a
        L21b:
            r0 = move-exception
        L21c:
            r22 = r14
            r2 = r0
            r3 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            goto L689
        L228:
            r0 = move-exception
        L229:
            r22 = r14
            r2 = r0
            r3 = r7
            r29 = r9
            r4 = r10
            r27 = r15
            goto L6cc
        L234:
            r0 = move-exception
        L235:
            r21 = r6
            goto L20f
        L238:
            r0 = move-exception
        L239:
            r21 = r6
            goto L21c
        L23c:
            r0 = move-exception
        L23d:
            r21 = r6
            goto L229
        L240:
            r21 = r6
            r22 = r14
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            r3.<init>()     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            java.lang.String r4 = "Cannot assign self type: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            r3.append(r11)     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            java.lang.String r4 = " on "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            r3.append(r13)     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            throw r2     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
        L263:
            r20 = r4
            r21 = r6
            r22 = r14
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            r3.<init>()     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            java.lang.String r4 = "Expected self type: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            r3.append(r13)     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            throw r2     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
        L280:
            r0 = move-exception
            r20 = r4
            goto L235
        L284:
            r0 = move-exception
            r20 = r4
            goto L239
        L288:
            r0 = move-exception
            r20 = r4
            goto L23d
        L28c:
            r4 = 0
        L28d:
            java.lang.annotation.Annotation[][] r5 = r13.getParameterAnnotations()     // Catch: java.lang.Throwable -> L619 java.lang.NoSuchMethodException -> L622 java.lang.ClassNotFoundException -> L62b
            r6 = 0
        L292:
            int r14 = r2.length     // Catch: java.lang.Throwable -> L619 java.lang.NoSuchMethodException -> L622 java.lang.ClassNotFoundException -> L62b
            if (r6 >= r14) goto L451
            int r14 = r6 + r4
            r14 = r5[r14]     // Catch: java.lang.Throwable -> L407 java.lang.NoSuchMethodException -> L412 java.lang.ClassNotFoundException -> L41d
            r23 = r4
            int r4 = r14.length     // Catch: java.lang.Throwable -> L407 java.lang.NoSuchMethodException -> L412 java.lang.ClassNotFoundException -> L41d
            r24 = r5
            r5 = 0
        L29f:
            if (r5 >= r4) goto L438
            r25 = r4
            r4 = r14[r5]     // Catch: java.lang.Throwable -> L407 java.lang.NoSuchMethodException -> L412 java.lang.ClassNotFoundException -> L41d
            r26 = r14
            boolean r14 = r4 instanceof net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied     // Catch: java.lang.Throwable -> L407 java.lang.NoSuchMethodException -> L412 java.lang.ClassNotFoundException -> L41d
            if (r14 == 0) goto L428
            r5 = 0
        L2ac:
            r14 = r2[r6]     // Catch: java.lang.Throwable -> L407 java.lang.NoSuchMethodException -> L412 java.lang.ClassNotFoundException -> L41d
            boolean r14 = r14.isArray()     // Catch: java.lang.Throwable -> L407 java.lang.NoSuchMethodException -> L412 java.lang.ClassNotFoundException -> L41d
            if (r14 == 0) goto L2bf
            r14 = 1
            int r5 = r5 + r14
            r14 = r2[r6]     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            java.lang.Class r14 = r14.getComponentType()     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            r2[r6] = r14     // Catch: java.lang.Throwable -> L1e8 java.lang.NoSuchMethodException -> L1f5 java.lang.ClassNotFoundException -> L202
            goto L2ac
        L2bf:
            java.lang.String r14 = " at "
            r27 = r15
            java.lang.String r15 = " of "
            if (r5 <= 0) goto L3c1
            r25 = r2[r6]     // Catch: java.lang.Throwable -> L383 java.lang.NoSuchMethodException -> L38c java.lang.ClassNotFoundException -> L395
            boolean r25 = r25.isPrimitive()     // Catch: java.lang.Throwable -> L383 java.lang.NoSuchMethodException -> L38c java.lang.ClassNotFoundException -> L395
            if (r25 != 0) goto L39e
            r25 = r5
            r5 = r2[r6]     // Catch: java.lang.Throwable -> L383 java.lang.NoSuchMethodException -> L38c java.lang.ClassNotFoundException -> L395
            r26 = r4
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied r26 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r26     // Catch: java.lang.Throwable -> L383 java.lang.NoSuchMethodException -> L38c java.lang.ClassNotFoundException -> L395
            r28 = r10
            java.lang.String r10 = r26.value()     // Catch: java.lang.Throwable -> L371 java.lang.NoSuchMethodException -> L377 java.lang.ClassNotFoundException -> L37d
            r29 = r9
            java.lang.ClassLoader r9 = r1.classLoader     // Catch: java.lang.Throwable -> L365 java.lang.NoSuchMethodException -> L369 java.lang.ClassNotFoundException -> L36d
            r30 = r7
            r7 = 0
            java.lang.Class r9 = java.lang.Class.forName(r10, r7, r9)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            boolean r5 = r5.isAssignableFrom(r9)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            if (r5 == 0) goto L33c
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r5.<init>()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
        L2f3:
            int r7 = r25 + (-1)
            if (r25 <= 0) goto L319
            r9 = 91
            r5.append(r9)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r25 = r7
            goto L2f3
        L2ff:
            r0 = move-exception
        L300:
            r2 = r0
            r14 = r22
        L303:
            r3 = r30
            goto L66a
        L307:
            r0 = move-exception
        L308:
            r2 = r0
            r14 = r22
        L30b:
            r3 = r30
            goto L689
        L30f:
            r0 = move-exception
        L310:
            r2 = r0
            r14 = r22
        L313:
            r4 = r28
            r3 = r30
            goto L6cc
        L319:
            r7 = 76
            r5.append(r7)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied r4 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r4     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r4 = r4.value()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r5.append(r4)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r4 = 59
            r5.append(r4)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.ClassLoader r5 = r1.classLoader     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r7 = 0
            java.lang.Class r4 = java.lang.Class.forName(r4, r7, r5)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r2[r6] = r4     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
        L339:
            r4 = 1
            goto L442
        L33c:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.<init>()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r5 = "Cannot resolve to component type: "
            r3.append(r5)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied r4 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r4     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r4 = r4.value()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r4)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r14)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r6)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r15)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r13)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            throw r2     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
        L365:
            r0 = move-exception
            r30 = r7
            goto L300
        L369:
            r0 = move-exception
            r30 = r7
            goto L308
        L36d:
            r0 = move-exception
            r30 = r7
            goto L310
        L371:
            r0 = move-exception
            r30 = r7
            r29 = r9
            goto L300
        L377:
            r0 = move-exception
            r30 = r7
            r29 = r9
            goto L308
        L37d:
            r0 = move-exception
            r30 = r7
            r29 = r9
            goto L310
        L383:
            r0 = move-exception
            r30 = r7
            r29 = r9
            r28 = r10
            goto L300
        L38c:
            r0 = move-exception
            r30 = r7
            r29 = r9
            r28 = r10
            goto L308
        L395:
            r0 = move-exception
            r30 = r7
            r29 = r9
            r28 = r10
            goto L310
        L39e:
            r30 = r7
            r29 = r9
            r28 = r10
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.<init>()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r4 = "Primitive values are not supposed to be proxied: "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r6)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r15)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r13)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            throw r2     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
        L3c1:
            r30 = r7
            r29 = r9
            r28 = r10
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied r4 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r4     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r4 = r4.value()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.ClassLoader r5 = r1.classLoader     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r7 = 0
            java.lang.Class r4 = java.lang.Class.forName(r4, r7, r5)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r5 = r2[r6]     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            boolean r5 = r5.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            if (r5 == 0) goto L3e0
            r2[r6] = r4     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            goto L339
        L3e0:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.<init>()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r5 = "Cannot resolve to type: "
            r3.append(r5)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r4)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r14)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r6)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r15)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r13)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            throw r2     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
        L407:
            r0 = move-exception
            r30 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            goto L300
        L412:
            r0 = move-exception
            r30 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            goto L308
        L41d:
            r0 = move-exception
            r30 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            goto L310
        L428:
            r30 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            r4 = 1
            int r5 = r5 + r4
            r4 = r25
            r14 = r26
            goto L29f
        L438:
            r30 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            goto L339
        L442:
            int r6 = r6 + r4
            r4 = r23
            r5 = r24
            r15 = r27
            r10 = r28
            r9 = r29
            r7 = r30
            goto L292
        L451:
            r30 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            boolean r3 = r13.isAnnotationPresent(r3)     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            java.lang.String r4 = " to "
            java.lang.String r5 = "Cannot assign "
            if (r3 == 0) goto L4c3
            java.lang.reflect.Constructor r2 = r11.getConstructor(r2)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.Class r3 = r13.getReturnType()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            boolean r3 = r3.isAssignableFrom(r11)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            if (r3 == 0) goto L4a0
            int r3 = r2.getModifiers()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L484
            int r3 = r11.getModifiers()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3 = r3 & r4
            if (r3 != 0) goto L481
            goto L484
        L481:
            r14 = r22
            goto L488
        L484:
            r2.setAccessible(r4)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r14 = 0
        L488:
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForConstructor r3 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForConstructor     // Catch: java.lang.Throwable -> L494 java.lang.NoSuchMethodException -> L498 java.lang.ClassNotFoundException -> L49c
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L494 java.lang.NoSuchMethodException -> L498 java.lang.ClassNotFoundException -> L49c
            r8.put(r13, r3)     // Catch: java.lang.Throwable -> L494 java.lang.NoSuchMethodException -> L498 java.lang.ClassNotFoundException -> L49c
            r3 = r30
            goto L5ae
        L494:
            r0 = move-exception
            r2 = r0
            goto L303
        L498:
            r0 = move-exception
            r2 = r0
            goto L30b
        L49c:
            r0 = move-exception
            r2 = r0
            goto L313
        L4a0:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r6.<init>()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r6.append(r5)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.Class r2 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r6.append(r2)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r6.append(r4)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r6.append(r13)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r2 = r6.toString()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            throw r3     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
        L4c3:
            java.lang.annotation.Annotation r3 = r13.getAnnotation(r12)     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Proxied r3 = (net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied) r3     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            if (r3 != 0) goto L4d0
            java.lang.String r3 = r13.getName()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            goto L4d4
        L4d0:
            java.lang.String r3 = r3.value()     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
        L4d4:
            java.lang.reflect.Method r2 = r11.getMethod(r3, r2)     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            java.lang.Class r3 = r13.getReturnType()     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            java.lang.Class r6 = r2.getReturnType()     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            boolean r3 = r3.isAssignableFrom(r6)     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            if (r3 == 0) goto L5ee
            java.lang.Class[] r3 = r2.getExceptionTypes()     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            int r4 = r3.length     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            r5 = 0
        L4ec:
            java.lang.String r6 = "Resolved method for "
            if (r5 >= r4) goto L53b
            r7 = r3[r5]     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.Class<java.lang.RuntimeException> r9 = java.lang.RuntimeException.class
            boolean r9 = r9.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            if (r9 != 0) goto L502
            java.lang.Class<java.lang.Error> r9 = java.lang.Error.class
            boolean r9 = r9.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            if (r9 == 0) goto L504
        L502:
            r6 = 1
            goto L539
        L504:
            java.lang.Class[] r9 = r13.getExceptionTypes()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            int r10 = r9.length     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r14 = 0
        L50a:
            if (r14 >= r10) goto L518
            r15 = r9[r14]     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            boolean r15 = r15.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            if (r15 == 0) goto L515
            goto L502
        L515:
            r15 = 1
            int r14 = r14 + r15
            goto L50a
        L518:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.<init>()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r6)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r13)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r4 = " throws undeclared checked exception "
            r3.append(r4)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r4 = r7.getName()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3.append(r4)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            throw r2     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
        L539:
            int r5 = r5 + r6
            goto L4ec
        L53b:
            int r3 = r2.getModifiers()     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L553
            java.lang.Class r3 = r2.getDeclaringClass()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            int r3 = r3.getModifiers()     // Catch: java.lang.Throwable -> L2ff java.lang.NoSuchMethodException -> L307 java.lang.ClassNotFoundException -> L30f
            r3 = r3 & r4
            if (r3 != 0) goto L550
            r3 = 1
            goto L554
        L550:
            r14 = r22
            goto L558
        L553:
            r3 = r4
        L554:
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L5db java.lang.NoSuchMethodException -> L5e1 java.lang.ClassNotFoundException -> L5e7
            r14 = 0
        L558:
            int r3 = r2.getModifiers()     // Catch: java.lang.Throwable -> L5cf java.lang.NoSuchMethodException -> L5d3 java.lang.ClassNotFoundException -> L5d7
            boolean r3 = java.lang.reflect.Modifier.isStatic(r3)     // Catch: java.lang.Throwable -> L5cf java.lang.NoSuchMethodException -> L5d3 java.lang.ClassNotFoundException -> L5d7
            if (r3 == 0) goto L59e
            r3 = r30
            boolean r4 = r13.isAnnotationPresent(r3)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            if (r4 == 0) goto L581
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForStaticMethod r4 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForStaticMethod     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r8.put(r13, r4)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            goto L5ae
        L573:
            r0 = move-exception
        L574:
            r2 = r0
            goto L66a
        L577:
            r0 = move-exception
        L578:
            r2 = r0
            goto L689
        L57b:
            r0 = move-exception
        L57c:
            r2 = r0
        L57d:
            r4 = r28
            goto L6cc
        L581:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r5.<init>()     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r5.append(r6)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r5.append(r13)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            java.lang.String r6 = " was expected to be static: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r5.append(r2)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            throw r4     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
        L59e:
            r3 = r30
            boolean r4 = r13.isAnnotationPresent(r3)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            if (r4 != 0) goto L5b2
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForNonStaticMethod r4 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForNonStaticMethod     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r8.put(r13, r4)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
        L5ae:
            r4 = r28
            goto L15b
        L5b2:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r5.<init>()     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r5.append(r6)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r5.append(r13)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            java.lang.String r6 = " was expected to be virtual: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r5.append(r2)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            java.lang.String r2 = r5.toString()     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
            throw r4     // Catch: java.lang.Throwable -> L573 java.lang.NoSuchMethodException -> L577 java.lang.ClassNotFoundException -> L57b
        L5cf:
            r0 = move-exception
            r3 = r30
            goto L574
        L5d3:
            r0 = move-exception
            r3 = r30
            goto L578
        L5d7:
            r0 = move-exception
            r3 = r30
            goto L57c
        L5db:
            r0 = move-exception
            r3 = r30
        L5de:
            r2 = r0
            goto L1f1
        L5e1:
            r0 = move-exception
            r3 = r30
        L5e4:
            r2 = r0
            goto L1fe
        L5e7:
            r0 = move-exception
            r3 = r30
        L5ea:
            r2 = r0
            r14 = r22
            goto L57d
        L5ee:
            r3 = r30
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            r7.<init>()     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            r7.append(r5)     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            java.lang.Class r2 = r2.getReturnType()     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            r7.append(r2)     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            r7.append(r4)     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            r7.append(r13)     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            java.lang.String r2 = r7.toString()     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
            throw r6     // Catch: java.lang.Throwable -> L613 java.lang.NoSuchMethodException -> L615 java.lang.ClassNotFoundException -> L617
        L613:
            r0 = move-exception
            goto L5de
        L615:
            r0 = move-exception
            goto L5e4
        L617:
            r0 = move-exception
            goto L5ea
        L619:
            r0 = move-exception
            r3 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            goto L5de
        L622:
            r0 = move-exception
            r3 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            goto L5e4
        L62b:
            r0 = move-exception
            r3 = r7
            r29 = r9
            r28 = r10
            r27 = r15
            goto L5ea
        L634:
            r0 = move-exception
            r19 = r3
            r20 = r4
            r21 = r6
            r3 = r7
            r29 = r9
            r28 = r10
            r22 = r14
            r27 = r15
            goto L574
        L646:
            r0 = move-exception
            r19 = r3
            r20 = r4
            r21 = r6
            r3 = r7
            r29 = r9
            r28 = r10
            r22 = r14
            r27 = r15
            goto L578
        L658:
            r0 = move-exception
            r19 = r3
            r20 = r4
            r21 = r6
            r3 = r7
            r29 = r9
            r28 = r10
            r22 = r14
            r27 = r15
            goto L57c
        L66a:
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForUnresolvedMethod r4 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForUnresolvedMethod
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Unexpected error: "
            r5.append(r6)
            java.lang.String r2 = r2.getMessage()
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r4.<init>(r2)
            r8.put(r13, r4)
            goto L5ae
        L689:
            r4 = r28
            if (r29 != 0) goto L6af
            boolean r5 = r13.isAnnotationPresent(r4)
            if (r5 == 0) goto L694
            goto L6af
        L694:
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForUnresolvedMethod r5 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForUnresolvedMethod
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Method not available on current VM: "
            r6.append(r7)
            java.lang.String r2 = r2.getMessage()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.<init>(r2)
            goto L6b7
        L6af:
            java.lang.Class r2 = r13.getReturnType()
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher r5 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.of(r2)
        L6b7:
            r8.put(r13, r5)
            goto L15b
        L6bc:
            r0 = move-exception
            r19 = r3
            r20 = r4
            r21 = r6
            r3 = r7
            r29 = r9
            r4 = r10
            r22 = r14
            r27 = r15
            r2 = r0
        L6cc:
            if (r29 != 0) goto L6f0
            boolean r5 = r13.isAnnotationPresent(r4)
            if (r5 == 0) goto L6d5
            goto L6f0
        L6d5:
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForUnresolvedMethod r5 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForUnresolvedMethod
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "Class not available on current VM: "
            r6.append(r7)
            java.lang.String r2 = r2.getMessage()
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            r5.<init>(r2)
            goto L6f8
        L6f0:
            java.lang.Class r2 = r13.getReturnType()
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher r5 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.of(r2)
        L6f8:
            r8.put(r13, r5)
            goto L15b
        L6fd:
            int r15 = r27 + 1
            r7 = r3
            r10 = r4
            r13 = r16
            r2 = r17
            r5 = r18
            r3 = r19
            r4 = r20
            r6 = r21
            r9 = r29
            goto La8
        L711:
            r22 = r14
            if (r22 == 0) goto L71c
            java.lang.Class<T> r2 = r1.proxy
            java.lang.Object r2 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.proxy(r2, r8)
            return r2
        L71c:
            java.lang.Class<T> r2 = r1.proxy
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Class<T> r3 = r1.proxy
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            net.bytebuddy.utility.dispatcher.JavaDispatcher$ProxiedInvocationHandler r4 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$ProxiedInvocationHandler
            java.lang.String r5 = r11.getName()
            r4.<init>(r5, r8)
            java.lang.Object r2 = java.lang.reflect.Proxy.newProxyInstance(r2, r3, r4)
            return r2
        L736:
            r0 = move-exception
            r19 = r3
            r20 = r4
            r18 = r5
            r21 = r6
            r29 = r9
            r4 = r10
            r2 = r0
            boolean r3 = r1.generate
            if (r3 == 0) goto L75a
            net.bytebuddy.utility.GraalImageCode r3 = net.bytebuddy.utility.GraalImageCode.getCurrent()
            java.lang.Class<T> r5 = r1.proxy
            java.lang.reflect.Method[] r5 = r5.getMethods()
            net.bytebuddy.utility.MethodComparator r6 = net.bytebuddy.utility.MethodComparator.INSTANCE
            java.lang.Object[] r3 = r3.sorted(r5, r6)
            java.lang.reflect.Method[] r3 = (java.lang.reflect.Method[]) r3
            goto L760
        L75a:
            java.lang.Class<T> r3 = r1.proxy
            java.lang.reflect.Method[] r3 = r3.getMethods()
        L760:
            int r5 = r3.length
            r6 = 0
        L762:
            if (r6 >= r5) goto L827
            r7 = r3[r6]
            java.lang.Class r9 = r7.getDeclaringClass()
            r10 = r21
            if (r9 != r10) goto L779
            r16 = r3
            r9 = r18
        L772:
            r14 = r19
            r12 = r20
        L776:
            r3 = 1
            goto L81a
        L779:
            r9 = r18
            boolean r12 = r7.isAnnotationPresent(r9)
            if (r12 == 0) goto L7e0
            java.lang.Class[] r12 = r7.getParameterTypes()
            int r12 = r12.length
            r13 = 1
            if (r12 != r13) goto L7c9
            java.lang.Class[] r12 = r7.getParameterTypes()
            r13 = 0
            r12 = r12[r13]
            boolean r12 = r12.isPrimitive()
            if (r12 != 0) goto L7c9
            java.lang.Class[] r12 = r7.getParameterTypes()
            r12 = r12[r13]
            boolean r12 = r12.isArray()
            if (r12 != 0) goto L7c9
            java.lang.Class r12 = r7.getReturnType()
            java.lang.Class r14 = java.lang.Boolean.TYPE
            if (r12 != r14) goto L7b2
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForDefaultValue r12 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.BOOLEAN
            r8.put(r7, r12)
            r16 = r3
            goto L772
        L7b2:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r12 = r20
            r3.append(r12)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L7c9:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r14 = r19
            r3.append(r14)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L7e0:
            r14 = r19
            r12 = r20
            r13 = 0
            if (r29 != 0) goto L7ed
            boolean r15 = r7.isAnnotationPresent(r4)
            if (r15 == 0) goto L7f0
        L7ed:
            r16 = r3
            goto L80d
        L7f0:
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForUnresolvedMethod r15 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher$ForUnresolvedMethod
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r16 = r3
            java.lang.String r3 = "Type not available on current VM: "
            r13.append(r3)
            java.lang.String r3 = r2.getMessage()
            r13.append(r3)
            java.lang.String r3 = r13.toString()
            r15.<init>(r3)
            goto L815
        L80d:
            java.lang.Class r3 = r7.getReturnType()
            net.bytebuddy.utility.dispatcher.JavaDispatcher$Dispatcher r15 = net.bytebuddy.utility.dispatcher.JavaDispatcher.Dispatcher.ForDefaultValue.of(r3)
        L815:
            r8.put(r7, r15)
            goto L776
        L81a:
            int r6 = r6 + r3
            r18 = r9
            r21 = r10
            r20 = r12
            r19 = r14
            r3 = r16
            goto L762
        L827:
            boolean r2 = r1.generate
            if (r2 == 0) goto L832
            java.lang.Class<T> r2 = r1.proxy
            java.lang.Object r2 = net.bytebuddy.utility.dispatcher.JavaDispatcher.DynamicClassLoader.proxy(r2, r8)
            return r2
        L832:
            java.lang.Class<T> r2 = r1.proxy
            java.lang.ClassLoader r2 = r2.getClassLoader()
            java.lang.Class<T> r3 = r1.proxy
            java.lang.Class[] r3 = new java.lang.Class[]{r3}
            net.bytebuddy.utility.dispatcher.JavaDispatcher$ProxiedInvocationHandler r4 = new net.bytebuddy.utility.dispatcher.JavaDispatcher$ProxiedInvocationHandler
            r4.<init>(r11, r8)
            java.lang.Object r2 = java.lang.reflect.Proxy.newProxyInstance(r2, r3, r4)
            return r2
    }
}
