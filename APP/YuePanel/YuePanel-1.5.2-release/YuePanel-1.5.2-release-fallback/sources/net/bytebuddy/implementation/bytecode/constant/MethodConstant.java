package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
public abstract class MethodConstant extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {

    @net.bytebuddy.utility.nullability.MaybeNull
    protected static final net.bytebuddy.description.method.MethodDescription.InDefinedShape DO_PRIVILEGED = null;
    protected final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;

    public static class CachedConstructor implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private static final net.bytebuddy.description.type.TypeDescription CONSTRUCTOR_TYPE = null;
        private final net.bytebuddy.implementation.bytecode.StackManipulation constructorConstant;

        static {
                java.lang.Class<java.lang.reflect.Constructor> r0 = java.lang.reflect.Constructor.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.implementation.bytecode.constant.MethodConstant.CachedConstructor.CONSTRUCTOR_TYPE = r0
                return
        }

        public CachedConstructor(net.bytebuddy.implementation.bytecode.StackManipulation r1) {
                r0 = this;
                r0.<init>()
                r0.constructorConstant = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.constructorConstant
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.CachedConstructor.CONSTRUCTOR_TYPE
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = r4.cache(r0, r1)
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.read()
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = r0.apply(r3, r4)
                return r3
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1c
                java.lang.Class r0 = r2.getClass()
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto L11
                goto L1c
            L11:
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CachedConstructor r3 = (net.bytebuddy.implementation.bytecode.constant.MethodConstant.CachedConstructor) r3
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.constructorConstant
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.constructorConstant
                boolean r3 = r0.equals(r3)
                return r3
            L1c:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.constructorConstant
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.constructorConstant
                boolean r0 = r0.isValid()
                return r0
        }
    }

    public static class CachedMethod implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private static final net.bytebuddy.description.type.TypeDescription METHOD_TYPE = null;
        private final net.bytebuddy.implementation.bytecode.StackManipulation methodConstant;

        static {
                java.lang.Class<java.lang.reflect.Method> r0 = java.lang.reflect.Method.class
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.implementation.bytecode.constant.MethodConstant.CachedMethod.METHOD_TYPE = r0
                return
        }

        public CachedMethod(net.bytebuddy.implementation.bytecode.StackManipulation r1) {
                r0 = this;
                r0.<init>()
                r0.methodConstant = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.methodConstant
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.CachedMethod.METHOD_TYPE
                net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = r4.cache(r0, r1)
                net.bytebuddy.implementation.bytecode.member.FieldAccess$Defined r0 = net.bytebuddy.implementation.bytecode.member.FieldAccess.forField(r0)
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r0.read()
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r3 = r0.apply(r3, r4)
                return r3
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1c
                java.lang.Class r0 = r2.getClass()
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto L11
                goto L1c
            L11:
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CachedMethod r3 = (net.bytebuddy.implementation.bytecode.constant.MethodConstant.CachedMethod) r3
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.methodConstant
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.methodConstant
                boolean r3 = r0.equals(r3)
                return r3
            L1c:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.methodConstant
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.methodConstant
                boolean r0 = r0.isValid()
                return r0
        }
    }

    public interface CanCache extends net.bytebuddy.implementation.bytecode.StackManipulation {
        net.bytebuddy.implementation.bytecode.StackManipulation cached();
    }

    public enum CanCacheIllegal extends java.lang.Enum<net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal> implements net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache {
        private static final /* synthetic */ net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal[] $VALUES = null;
        public static final net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal INSTANCE = null;

        static {
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCacheIllegal r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCacheIllegal
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal.INSTANCE = r0
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCacheIllegal[] r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal[]{r0}
                net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal.$VALUES = r0
                return
        }

        CanCacheIllegal(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal valueOf(java.lang.String r1) {
                java.lang.Class<net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCacheIllegal> r0 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCacheIllegal r1 = (net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal) r1
                return r1
        }

        public static net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal[] values() {
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCacheIllegal[] r0 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal.$VALUES
                java.lang.Object r0 = r0.clone()
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCacheIllegal[] r0 = (net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal[]) r0
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.implementation.Implementation.Context r3) {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r2 = r0.apply(r2, r3)
                return r2
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache
        public net.bytebuddy.implementation.bytecode.StackManipulation cached() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Illegal r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Illegal.INSTANCE
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                r0 = 0
                return r0
        }
    }

    public static class ForConstructor extends net.bytebuddy.implementation.bytecode.constant.MethodConstant implements net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache {
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape GET_CONSTRUCTOR = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape GET_DECLARED_CONSTRUCTOR = null;

        static {
                java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
                java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r2 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L27
                java.lang.String r3 = "getConstructor"
                java.lang.Class[] r4 = new java.lang.Class[]{r0}     // Catch: java.lang.NoSuchMethodException -> L27
                java.lang.reflect.Method r3 = r1.getMethod(r3, r4)     // Catch: java.lang.NoSuchMethodException -> L27
                r2.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L27
                net.bytebuddy.implementation.bytecode.constant.MethodConstant.ForConstructor.GET_CONSTRUCTOR = r2     // Catch: java.lang.NoSuchMethodException -> L27
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r2 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L27
                java.lang.String r3 = "getDeclaredConstructor"
                java.lang.Class[] r0 = new java.lang.Class[]{r0}     // Catch: java.lang.NoSuchMethodException -> L27
                java.lang.reflect.Method r0 = r1.getMethod(r3, r0)     // Catch: java.lang.NoSuchMethodException -> L27
                r2.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L27
                net.bytebuddy.implementation.bytecode.constant.MethodConstant.ForConstructor.GET_DECLARED_CONSTRUCTOR = r2     // Catch: java.lang.NoSuchMethodException -> L27
                return
            L27:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Could not locate Class::getDeclaredConstructor"
                r1.<init>(r2, r0)
                throw r1
        }

        public ForConstructor(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape accessorMethod() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                boolean r0 = r0.isPublic()
                if (r0 == 0) goto Lb
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.ForConstructor.GET_CONSTRUCTOR
                goto Ld
            Lb:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.ForConstructor.GET_DECLARED_CONSTRUCTOR
            Ld:
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache
        public net.bytebuddy.implementation.bytecode.StackManipulation cached() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CachedConstructor r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant$CachedConstructor
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant
        public net.bytebuddy.implementation.bytecode.StackManipulation methodName() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation$Trivial r0 = net.bytebuddy.implementation.bytecode.StackManipulation.Trivial.INSTANCE
                return r0
        }
    }

    public static class ForMethod extends net.bytebuddy.implementation.bytecode.constant.MethodConstant implements net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache {
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape GET_DECLARED_METHOD = null;
        private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape GET_METHOD = null;

        static {
                java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r3 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L29
                java.lang.String r4 = "getMethod"
                java.lang.Class[] r5 = new java.lang.Class[]{r1, r0}     // Catch: java.lang.NoSuchMethodException -> L29
                java.lang.reflect.Method r4 = r2.getMethod(r4, r5)     // Catch: java.lang.NoSuchMethodException -> L29
                r3.<init>(r4)     // Catch: java.lang.NoSuchMethodException -> L29
                net.bytebuddy.implementation.bytecode.constant.MethodConstant.ForMethod.GET_METHOD = r3     // Catch: java.lang.NoSuchMethodException -> L29
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r3 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L29
                java.lang.String r4 = "getDeclaredMethod"
                java.lang.Class[] r0 = new java.lang.Class[]{r1, r0}     // Catch: java.lang.NoSuchMethodException -> L29
                java.lang.reflect.Method r0 = r2.getMethod(r4, r0)     // Catch: java.lang.NoSuchMethodException -> L29
                r3.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L29
                net.bytebuddy.implementation.bytecode.constant.MethodConstant.ForMethod.GET_DECLARED_METHOD = r3     // Catch: java.lang.NoSuchMethodException -> L29
                return
            L29:
                r0 = move-exception
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Could not locate method lookup"
                r1.<init>(r2, r0)
                throw r1
        }

        public ForMethod(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant
        public net.bytebuddy.description.method.MethodDescription.InDefinedShape accessorMethod() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                boolean r0 = r0.isPublic()
                if (r0 == 0) goto Lb
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.ForMethod.GET_METHOD
                goto Ld
            Lb:
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.ForMethod.GET_DECLARED_METHOD
            Ld:
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache
        public net.bytebuddy.implementation.bytecode.StackManipulation cached() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CachedMethod r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant$CachedMethod
                r0.<init>(r1)
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant
        public net.bytebuddy.implementation.bytecode.StackManipulation methodName() {
                r2 = this;
                net.bytebuddy.implementation.bytecode.constant.TextConstant r0 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r2.methodDescription
                java.lang.String r1 = r1.getInternalName()
                r0.<init>(r1)
                return r0
        }
    }

    public static class PrivilegedLookup implements net.bytebuddy.implementation.bytecode.StackManipulation, net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache {
        private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;
        private final net.bytebuddy.implementation.bytecode.StackManipulation methodName;

        public PrivilegedLookup(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, net.bytebuddy.implementation.bytecode.StackManipulation r2) {
                r0 = this;
                r0.<init>()
                r0.methodDescription = r1
                r0.methodName = r2
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r11, net.bytebuddy.implementation.Implementation.Context r12) {
                r10 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.DO_PRIVILEGED
                if (r0 == 0) goto L97
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r10.methodDescription
                net.bytebuddy.implementation.auxiliary.AuxiliaryType r1 = net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.of(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r12.register(r1)
                net.bytebuddy.implementation.bytecode.StackManipulation$Compound r2 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r1)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r10.methodDescription
                net.bytebuddy.description.type.TypeDescription r4 = r4.getDeclaringType()
                net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r4)
                net.bytebuddy.implementation.bytecode.StackManipulation r5 = r10.methodName
                java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription$Generic r6 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r6)
                net.bytebuddy.implementation.bytecode.collection.ArrayFactory r6 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r6)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r7 = r10.methodDescription
                net.bytebuddy.description.method.ParameterList r7 = r7.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r7 = r7.asTypeList()
                net.bytebuddy.description.type.TypeList r7 = r7.asErasures()
                java.util.List r7 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.typeConstantsFor(r7)
                net.bytebuddy.implementation.bytecode.StackManipulation r6 = r6.withValues(r7)
                net.bytebuddy.description.method.MethodList r1 = r1.getDeclaredMethods()
                net.bytebuddy.matcher.ElementMatcher$Junction r7 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
                net.bytebuddy.matcher.FilterableList r1 = r1.filter(r7)
                net.bytebuddy.description.method.MethodList r1 = (net.bytebuddy.description.method.MethodList) r1
                java.lang.Object r1 = r1.getOnly()
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r1
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r1)
                net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r0)
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r7 = r10.methodDescription
                boolean r7 = r7.isConstructor()
                if (r7 == 0) goto L67
                java.lang.Class<java.lang.reflect.Constructor> r7 = java.lang.reflect.Constructor.class
                goto L69
            L67:
                java.lang.Class<java.lang.reflect.Method> r7 = java.lang.reflect.Method.class
            L69:
                net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
                net.bytebuddy.implementation.bytecode.StackManipulation r7 = net.bytebuddy.implementation.bytecode.assign.TypeCasting.to(r7)
                r8 = 8
                net.bytebuddy.implementation.bytecode.StackManipulation[] r8 = new net.bytebuddy.implementation.bytecode.StackManipulation[r8]
                r9 = 0
                r8[r9] = r3
                net.bytebuddy.implementation.bytecode.Duplication r3 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE
                r9 = 1
                r8[r9] = r3
                r3 = 2
                r8[r3] = r4
                r3 = 3
                r8[r3] = r5
                r3 = 4
                r8[r3] = r6
                r3 = 5
                r8[r3] = r1
                r1 = 6
                r8[r1] = r0
                r0 = 7
                r8[r0] = r7
                r2.<init>(r8)
                net.bytebuddy.implementation.bytecode.StackManipulation$Size r11 = r2.apply(r11, r12)
                return r11
            L97:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r12 = "Privileged method invocation is not supported on the current VM"
                r11.<init>(r12)
                throw r11
        }

        @Override // net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache
        public net.bytebuddy.implementation.bytecode.StackManipulation cached() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                boolean r0 = r0.isConstructor()
                if (r0 == 0) goto Le
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CachedConstructor r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant$CachedConstructor
                r0.<init>(r1)
                goto L13
            Le:
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$CachedMethod r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant$CachedMethod
                r0.<init>(r1)
            L13:
                return r0
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3) {
                r2 = this;
                if (r2 != r3) goto L4
                r3 = 1
                return r3
            L4:
                if (r3 == 0) goto L1c
                java.lang.Class r0 = r2.getClass()
                java.lang.Class r1 = r3.getClass()
                if (r0 == r1) goto L11
                goto L1c
            L11:
                net.bytebuddy.implementation.bytecode.constant.MethodConstant$PrivilegedLookup r3 = (net.bytebuddy.implementation.bytecode.constant.MethodConstant.PrivilegedLookup) r3
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.methodDescription
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r3.methodDescription
                boolean r3 = r0.equals(r3)
                return r3
            L1c:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.methodName
                boolean r0 = r0.isValid()
                return r0
        }
    }

    static {
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = doPrivileged()
            net.bytebuddy.implementation.bytecode.constant.MethodConstant.DO_PRIVILEGED = r0
            return
    }

    public MethodConstant(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
            r0 = this;
            r0.<init>()
            r0.methodDescription = r1
            return
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Exception should not be rethrown but trigger a fallback.", value = {"REC_CATCH_EXCEPTION"})
    @net.bytebuddy.utility.nullability.MaybeNull
    private static net.bytebuddy.description.method.MethodDescription.InDefinedShape doPrivileged() {
            r0 = 0
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r1 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = "java.security.AccessController"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r3 = "doPrivileged"
            java.lang.Class<java.security.PrivilegedExceptionAction> r4 = java.security.PrivilegedExceptionAction.class
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Exception -> L28
            java.lang.reflect.Method r2 = r2.getMethod(r3, r4)     // Catch: java.lang.Exception -> L28
            r1.<init>(r2)     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = "net.bytebuddy.securitymanager"
            java.lang.String r3 = "true"
            java.lang.String r2 = java.lang.System.getProperty(r2, r3)     // Catch: java.lang.SecurityException -> L27 java.lang.Exception -> L28
            boolean r2 = java.lang.Boolean.parseBoolean(r2)     // Catch: java.lang.SecurityException -> L27 java.lang.Exception -> L28
            if (r2 != 0) goto L27
            goto L28
        L27:
            r0 = r1
        L28:
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache of(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
            boolean r0 = r1.isTypeInitializer()
            if (r0 == 0) goto L9
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCacheIllegal r1 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal.INSTANCE
            return r1
        L9:
            boolean r0 = r1.isConstructor()
            if (r0 == 0) goto L15
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$ForConstructor r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant$ForConstructor
            r0.<init>(r1)
            return r0
        L15:
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$ForMethod r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant$ForMethod
            r0.<init>(r1)
            return r0
    }

    public static net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache ofPrivileged(net.bytebuddy.description.method.MethodDescription.InDefinedShape r1) {
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.DO_PRIVILEGED
            if (r0 != 0) goto L9
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCache r1 = of(r1)
            return r1
        L9:
            boolean r0 = r1.isTypeInitializer()
            if (r0 == 0) goto L12
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCacheIllegal r1 = net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCacheIllegal.INSTANCE
            return r1
        L12:
            boolean r0 = r1.isConstructor()
            if (r0 == 0) goto L22
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$ForConstructor r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant$ForConstructor
            r0.<init>(r1)
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCache r1 = r0.withPrivilegedLookup()
            return r1
        L22:
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$ForMethod r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant$ForMethod
            r0.<init>(r1)
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$CanCache r1 = r0.withPrivilegedLookup()
            return r1
    }

    public static java.util.List<net.bytebuddy.implementation.bytecode.StackManipulation> typeConstantsFor(java.util.List<net.bytebuddy.description.type.TypeDescription> r2) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.size()
            r0.<init>(r1)
            java.util.Iterator r2 = r2.iterator()
        Ld:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r1)
            r0.add(r1)
            goto Ld
        L21:
            return r0
    }

    public abstract net.bytebuddy.description.method.MethodDescription.InDefinedShape accessorMethod();

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9) {
            r7 = this;
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r7.methodDescription
            net.bytebuddy.description.type.TypeDescription r1 = r1.getDeclaringType()
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r1)
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r7.methodName()
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            net.bytebuddy.description.type.TypeDescription$Generic r3 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r3)
            net.bytebuddy.implementation.bytecode.collection.ArrayFactory r3 = net.bytebuddy.implementation.bytecode.collection.ArrayFactory.forType(r3)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r7.methodDescription
            net.bytebuddy.description.method.ParameterList r4 = r4.getParameters()
            net.bytebuddy.description.type.TypeList$Generic r4 = r4.asTypeList()
            net.bytebuddy.description.type.TypeList r4 = r4.asErasures()
            java.util.List r4 = typeConstantsFor(r4)
            net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.withValues(r4)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r4 = r7.accessorMethod()
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r4 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r4)
            r5 = 4
            net.bytebuddy.implementation.bytecode.StackManipulation[] r5 = new net.bytebuddy.implementation.bytecode.StackManipulation[r5]
            r6 = 0
            r5[r6] = r1
            r1 = 1
            r5[r1] = r2
            r1 = 2
            r5[r1] = r3
            r1 = 3
            r5[r1] = r4
            r0.<init>(r5)
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r0.apply(r8, r9)
            return r8
    }

    public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            net.bytebuddy.implementation.bytecode.constant.MethodConstant r3 = (net.bytebuddy.implementation.bytecode.constant.MethodConstant) r3
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r2.methodDescription
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r3 = r3.methodDescription
            boolean r3 = r0.equals(r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = r1.methodDescription
            int r0 = r0.hashCode()
            return r0
    }

    public abstract net.bytebuddy.implementation.bytecode.StackManipulation methodName();

    public net.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache withPrivilegedLookup() {
            r3 = this;
            net.bytebuddy.implementation.bytecode.constant.MethodConstant$PrivilegedLookup r0 = new net.bytebuddy.implementation.bytecode.constant.MethodConstant$PrivilegedLookup
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r1 = r3.methodDescription
            net.bytebuddy.implementation.bytecode.StackManipulation r2 = r3.methodName()
            r0.<init>(r1, r2)
            return r0
    }
}
