package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public interface JavaConstant extends net.bytebuddy.utility.ConstantValue {

    /* JADX INFO: renamed from: net.bytebuddy.utility.JavaConstant$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$bytebuddy$utility$JavaConstant$MethodHandle$HandleType = null;

        static {
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType[] r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                net.bytebuddy.utility.JavaConstant.AnonymousClass1.$SwitchMap$net$bytebuddy$utility$JavaConstant$MethodHandle$HandleType = r0
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.GET_FIELD     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = net.bytebuddy.utility.JavaConstant.AnonymousClass1.$SwitchMap$net$bytebuddy$utility$JavaConstant$MethodHandle$HandleType     // Catch: java.lang.NoSuchFieldError -> L1d
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.GET_STATIC_FIELD     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = net.bytebuddy.utility.JavaConstant.AnonymousClass1.$SwitchMap$net$bytebuddy$utility$JavaConstant$MethodHandle$HandleType     // Catch: java.lang.NoSuchFieldError -> L28
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.PUT_FIELD     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = net.bytebuddy.utility.JavaConstant.AnonymousClass1.$SwitchMap$net$bytebuddy$utility$JavaConstant$MethodHandle$HandleType     // Catch: java.lang.NoSuchFieldError -> L33
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.PUT_STATIC_FIELD     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }
    }

    public static class Dynamic implements net.bytebuddy.utility.JavaConstant {
        public static final java.lang.String DEFAULT_NAME = "_";
        private final java.util.List<net.bytebuddy.utility.JavaConstant> arguments;
        private final net.bytebuddy.utility.JavaConstant.MethodHandle bootstrap;
        private final java.lang.String name;
        private final net.bytebuddy.description.type.TypeDescription typeDescription;

        public Dynamic(java.lang.String r1, net.bytebuddy.description.type.TypeDescription r2, net.bytebuddy.utility.JavaConstant.MethodHandle r3, java.util.List<net.bytebuddy.utility.JavaConstant> r4) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.typeDescription = r2
                r0.bootstrap = r3
                r0.arguments = r4
                return
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic bootstrap(java.lang.String r1, java.lang.reflect.Constructor<?> r2, java.util.List<?> r3) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                r0.<init>(r2)
                net.bytebuddy.utility.JavaConstant$Dynamic r1 = bootstrap(r1, r0, r3)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic bootstrap(java.lang.String r0, java.lang.reflect.Constructor<?> r1, java.lang.Object... r2) {
                java.util.List r2 = java.util.Arrays.asList(r2)
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = bootstrap(r0, r1, r2)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic bootstrap(java.lang.String r1, java.lang.reflect.Method r2, java.util.List<?> r3) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r0.<init>(r2)
                net.bytebuddy.utility.JavaConstant$Dynamic r1 = bootstrap(r1, r0, r3)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic bootstrap(java.lang.String r0, java.lang.reflect.Method r1, java.lang.Object... r2) {
                java.util.List r2 = java.util.Arrays.asList(r2)
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = bootstrap(r0, r1, r2)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic bootstrap(java.lang.String r9, net.bytebuddy.description.method.MethodDescription.InDefinedShape r10, java.util.List<?> r11) {
                int r0 = r9.length()
                if (r0 == 0) goto L9e
                java.lang.String r0 = "."
                boolean r0 = r9.contains(r0)
                if (r0 != 0) goto L9e
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r11.size()
                r0.<init>(r1)
                java.util.Iterator r1 = r11.iterator()
            L1b:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L2d
                java.lang.Object r2 = r1.next()
                net.bytebuddy.utility.JavaConstant r2 = net.bytebuddy.utility.JavaConstant.Simple.wrap(r2)
                r0.add(r2)
                goto L1b
            L2d:
                net.bytebuddy.description.type.TypeList r1 = net.bytebuddy.description.type.TypeList.Explicit.of(r0)
                boolean r1 = r10.isConstantBootstrap(r1)
                if (r1 == 0) goto L7f
                net.bytebuddy.utility.JavaConstant$Dynamic r11 = new net.bytebuddy.utility.JavaConstant$Dynamic
                boolean r1 = r10.isConstructor()
                if (r1 == 0) goto L44
                net.bytebuddy.description.type.TypeDescription r1 = r10.getDeclaringType()
                goto L4c
            L44:
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r10.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
            L4c:
                net.bytebuddy.utility.JavaConstant$MethodHandle r8 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                boolean r2 = r10.isConstructor()
                if (r2 == 0) goto L58
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_SPECIAL_CONSTRUCTOR
            L56:
                r3 = r2
                goto L5b
            L58:
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC
                goto L56
            L5b:
                net.bytebuddy.description.type.TypeDescription r4 = r10.getDeclaringType()
                java.lang.String r5 = r10.getInternalName()
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r10.getReturnType()
                net.bytebuddy.description.type.TypeDescription r6 = r2.asErasure()
                net.bytebuddy.description.method.ParameterList r10 = r10.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r10 = r10.asTypeList()
                net.bytebuddy.description.type.TypeList r7 = r10.asErasures()
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                r11.<init>(r9, r1, r8, r0)
                return r11
            L7f:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Not a valid bootstrap method "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r10 = " for "
                r0.append(r10)
                r0.append(r11)
                java.lang.String r10 = r0.toString()
                r9.<init>(r10)
                throw r9
            L9e:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r0 = "Not a valid field name: "
                r11.append(r0)
                r11.append(r9)
                java.lang.String r9 = r11.toString()
                r10.<init>(r9)
                throw r10
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic bootstrap(java.lang.String r0, net.bytebuddy.description.method.MethodDescription.InDefinedShape r1, java.lang.Object... r2) {
                java.util.List r2 = java.util.Arrays.asList(r2)
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = bootstrap(r0, r1, r2)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant ofArrayVarHandle(java.lang.Class<?> r0) {
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.utility.JavaConstant r0 = ofArrayVarHandle(r0)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant ofArrayVarHandle(net.bytebuddy.description.type.TypeDescription r12) {
                boolean r0 = r12.isArray()
                if (r0 == 0) goto L59
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = new net.bytebuddy.utility.JavaConstant$Dynamic
                net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.VAR_HANDLE
                net.bytebuddy.description.type.TypeDescription r2 = r1.getTypeStub()
                net.bytebuddy.utility.JavaConstant$MethodHandle r9 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r4 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC
                net.bytebuddy.utility.JavaType r3 = net.bytebuddy.utility.JavaType.CONSTANT_BOOTSTRAPS
                net.bytebuddy.description.type.TypeDescription r5 = r3.getTypeStub()
                net.bytebuddy.description.type.TypeDescription r7 = r1.getTypeStub()
                net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
                r10 = 4
                net.bytebuddy.description.type.TypeDescription[] r10 = new net.bytebuddy.description.type.TypeDescription[r10]
                r11 = 0
                r10[r11] = r1
                r1 = 1
                r10[r1] = r3
                r1 = 2
                r10[r1] = r8
                r1 = 3
                r10[r1] = r6
                java.util.List r8 = java.util.Arrays.asList(r10)
                java.lang.String r6 = "arrayVarHandle"
                r3 = r9
                r3.<init>(r4, r5, r6, r7, r8)
                net.bytebuddy.utility.JavaConstant r12 = net.bytebuddy.utility.JavaConstant.Simple.of(r12)
                java.util.List r12 = java.util.Collections.singletonList(r12)
                java.lang.String r1 = "_"
                r0.<init>(r1, r2, r9, r12)
                return r0
            L59:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not an array type: "
                r1.append(r2)
                r1.append(r12)
                java.lang.String r12 = r1.toString()
                r0.<init>(r12)
                throw r0
        }

        public static net.bytebuddy.utility.JavaConstant ofEnumeration(java.lang.Enum<?> r1) {
                net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration r0 = new net.bytebuddy.description.enumeration.EnumerationDescription$ForLoadedEnumeration
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant r1 = ofEnumeration(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant ofEnumeration(net.bytebuddy.description.enumeration.EnumerationDescription r11) {
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = new net.bytebuddy.utility.JavaConstant$Dynamic
                java.lang.String r1 = r11.getValue()
                net.bytebuddy.description.type.TypeDescription r11 = r11.getEnumerationType()
                net.bytebuddy.utility.JavaConstant$MethodHandle r8 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r3 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC
                net.bytebuddy.utility.JavaType r2 = net.bytebuddy.utility.JavaType.CONSTANT_BOOTSTRAPS
                net.bytebuddy.description.type.TypeDescription r4 = r2.getTypeStub()
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                net.bytebuddy.utility.JavaType r2 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r2 = r2.getTypeStub()
                java.lang.Class<java.lang.String> r5 = java.lang.String.class
                net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r5)
                java.lang.Class<java.lang.Class> r7 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
                r9 = 3
                net.bytebuddy.description.type.TypeDescription[] r9 = new net.bytebuddy.description.type.TypeDescription[r9]
                r10 = 0
                r9[r10] = r2
                r2 = 1
                r9[r2] = r5
                r2 = 2
                r9[r2] = r7
                java.util.List r7 = java.util.Arrays.asList(r9)
                java.lang.String r5 = "enumConstant"
                r2 = r8
                r2.<init>(r3, r4, r5, r6, r7)
                java.util.List r2 = java.util.Collections.emptyList()
                r0.<init>(r1, r11, r8, r2)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic ofField(java.lang.reflect.Field r1) {
                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$Dynamic r1 = ofField(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic ofField(net.bytebuddy.description.field.FieldDescription.InDefinedShape r16) {
                r0 = 2
                r1 = 1
                r2 = 0
                r3 = 3
                boolean r4 = r16.isStatic()
                if (r4 == 0) goto Lc3
                boolean r4 = r16.isFinal()
                if (r4 == 0) goto Lc3
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r16.getType()
                boolean r4 = r4.isPrimitive()
                if (r4 == 0) goto L33
                net.bytebuddy.description.type.TypeDescription$Generic r4 = r16.getType()
                net.bytebuddy.description.type.TypeDescription r4 = r4.asErasure()
                net.bytebuddy.description.type.TypeDescription r4 = r4.asBoxed()
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r16.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                boolean r4 = r4.equals(r5)
                goto L43
            L33:
                net.bytebuddy.description.type.TypeDescription r4 = r16.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r16.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                boolean r4 = r4.equals(r5)
            L43:
                net.bytebuddy.utility.JavaConstant$Dynamic r5 = new net.bytebuddy.utility.JavaConstant$Dynamic
                java.lang.String r6 = r16.getInternalName()
                net.bytebuddy.description.type.TypeDescription$Generic r7 = r16.getType()
                net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                net.bytebuddy.utility.JavaConstant$MethodHandle r14 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r9 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC
                net.bytebuddy.utility.JavaType r8 = net.bytebuddy.utility.JavaType.CONSTANT_BOOTSTRAPS
                net.bytebuddy.description.type.TypeDescription r10 = r8.getTypeStub()
                java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription r12 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                java.lang.Class<java.lang.Class> r11 = java.lang.Class.class
                if (r4 == 0) goto L83
                net.bytebuddy.utility.JavaType r13 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r13 = r13.getTypeStub()
                net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
                net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r11)
                net.bytebuddy.description.type.TypeDescription[] r3 = new net.bytebuddy.description.type.TypeDescription[r3]
                r3[r2] = r13
                r3[r1] = r8
                r3[r0] = r11
                java.util.List r0 = java.util.Arrays.asList(r3)
            L81:
                r13 = r0
                goto La6
            L83:
                net.bytebuddy.utility.JavaType r13 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r13 = r13.getTypeStub()
                net.bytebuddy.description.type.TypeDescription r8 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r8)
                net.bytebuddy.description.type.TypeDescription r15 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r11)
                net.bytebuddy.description.type.TypeDescription r11 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r11)
                r3 = 4
                net.bytebuddy.description.type.TypeDescription[] r3 = new net.bytebuddy.description.type.TypeDescription[r3]
                r3[r2] = r13
                r3[r1] = r8
                r3[r0] = r15
                r0 = 3
                r3[r0] = r11
                java.util.List r0 = java.util.Arrays.asList(r3)
                goto L81
            La6:
                java.lang.String r11 = "getStaticFinal"
                r8 = r14
                r8.<init>(r9, r10, r11, r12, r13)
                if (r4 == 0) goto Lb3
                java.util.List r0 = java.util.Collections.emptyList()
                goto Lbf
            Lb3:
                net.bytebuddy.description.type.TypeDescription r0 = r16.getDeclaringType()
                net.bytebuddy.utility.JavaConstant r0 = net.bytebuddy.utility.JavaConstant.Simple.of(r0)
                java.util.List r0 = java.util.Collections.singletonList(r0)
            Lbf:
                r5.<init>(r6, r7, r14, r0)
                return r5
            Lc3:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Field must be static and final: "
                r1.append(r2)
                r2 = r16
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic ofInvocation(java.lang.reflect.Constructor<?> r1, java.util.List<?> r2) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$Dynamic r1 = ofInvocation(r0, r2)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic ofInvocation(java.lang.reflect.Constructor<?> r0, java.lang.Object... r1) {
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = ofInvocation(r0, r1)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic ofInvocation(java.lang.reflect.Method r1, java.util.List<?> r2) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$Dynamic r1 = ofInvocation(r0, r2)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic ofInvocation(java.lang.reflect.Method r0, java.lang.Object... r1) {
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = ofInvocation(r0, r1)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic ofInvocation(net.bytebuddy.description.method.MethodDescription.InDefinedShape r13, java.util.List<?> r14) {
                r0 = 1
                r1 = 0
                boolean r2 = r13.isConstructor()
                if (r2 != 0) goto L2c
                net.bytebuddy.description.type.TypeDescription$Generic r2 = r13.getReturnType()
                java.lang.Class r3 = java.lang.Void.TYPE
                boolean r2 = r2.represents(r3)
                if (r2 != 0) goto L15
                goto L2c
            L15:
                java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Bootstrap method is no constructor or non-void static factory: "
                r0.append(r1)
                r0.append(r13)
                java.lang.String r13 = r0.toString()
                r14.<init>(r13)
                throw r14
            L2c:
                boolean r2 = r13.isVarArgs()
                java.lang.String r3 = " to "
                java.lang.String r4 = "Cannot assign "
                if (r2 == 0) goto L57
                net.bytebuddy.description.method.ParameterList r2 = r13.getParameters()
                int r2 = r2.size()
                boolean r5 = r13.isStatic()
                if (r5 != 0) goto L4d
                boolean r5 = r13.isConstructor()
                if (r5 == 0) goto L4b
                goto L4d
            L4b:
                r5 = r0
                goto L4e
            L4d:
                r5 = r1
            L4e:
                int r2 = r2 + r5
                int r5 = r14.size()
                int r5 = r5 + r0
                if (r2 > r5) goto L194
                goto L76
            L57:
                net.bytebuddy.description.method.ParameterList r2 = r13.getParameters()
                int r2 = r2.size()
                boolean r5 = r13.isStatic()
                if (r5 != 0) goto L6e
                boolean r5 = r13.isConstructor()
                if (r5 == 0) goto L6c
                goto L6e
            L6c:
                r5 = r0
                goto L6f
            L6e:
                r5 = r1
            L6f:
                int r2 = r2 + r5
                int r5 = r14.size()
                if (r2 != r5) goto L194
            L76:
                boolean r2 = r13.isStatic()
                if (r2 != 0) goto L98
                boolean r2 = r13.isConstructor()
                if (r2 == 0) goto L83
                goto L98
            L83:
                net.bytebuddy.description.type.TypeDescription r2 = r13.getDeclaringType()
                net.bytebuddy.description.method.ParameterList r5 = r13.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r5 = r5.asTypeList()
                net.bytebuddy.description.type.TypeList r5 = r5.asErasures()
                java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r2, r5)
                goto La4
            L98:
                net.bytebuddy.description.method.ParameterList r2 = r13.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                net.bytebuddy.description.type.TypeList r2 = r2.asErasures()
            La4:
                boolean r5 = r13.isVarArgs()
                if (r5 == 0) goto Ld9
                int r5 = r2.size()
                int r5 = r5 - r0
                java.util.List r5 = r2.subList(r1, r5)
                int r6 = r14.size()
                int r7 = r2.size()
                int r6 = r6 - r7
                int r6 = r6 + r0
                int r7 = r2.size()
                int r7 = r7 - r0
                java.lang.Object r2 = r2.get(r7)
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                net.bytebuddy.description.type.TypeDescription r2 = r2.getComponentType()
                java.util.List r2 = java.util.Collections.nCopies(r6, r2)
                java.util.List r2 = net.bytebuddy.utility.CompoundList.of(r5, r2)
                java.util.Iterator r2 = r2.iterator()
                goto Ldd
            Ld9:
                java.util.Iterator r2 = r2.iterator()
            Ldd:
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = r14.size()
                int r6 = r6 + r0
                r5.<init>(r6)
                net.bytebuddy.utility.JavaConstant$MethodHandle r6 = net.bytebuddy.utility.JavaConstant.MethodHandle.of(r13)
                r5.add(r6)
                java.util.Iterator r6 = r14.iterator()
            Lf2:
                boolean r7 = r6.hasNext()
                if (r7 == 0) goto L12f
                java.lang.Object r7 = r6.next()
                net.bytebuddy.utility.JavaConstant r7 = net.bytebuddy.utility.JavaConstant.Simple.wrap(r7)
                net.bytebuddy.description.type.TypeDescription r8 = r7.getTypeDescription()
                java.lang.Object r9 = r2.next()
                net.bytebuddy.description.type.TypeDescription r9 = (net.bytebuddy.description.type.TypeDescription) r9
                boolean r8 = r8.isAssignableTo(r9)
                if (r8 == 0) goto L114
                r5.add(r7)
                goto Lf2
            L114:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                r1.append(r14)
                r1.append(r3)
                r1.append(r13)
                java.lang.String r13 = r1.toString()
                r0.<init>(r13)
                throw r0
            L12f:
                net.bytebuddy.utility.JavaConstant$Dynamic r14 = new net.bytebuddy.utility.JavaConstant$Dynamic
                boolean r2 = r13.isConstructor()
                if (r2 == 0) goto L13c
                net.bytebuddy.description.type.TypeDescription r13 = r13.getDeclaringType()
                goto L144
            L13c:
                net.bytebuddy.description.type.TypeDescription$Generic r13 = r13.getReturnType()
                net.bytebuddy.description.type.TypeDescription r13 = r13.asErasure()
            L144:
                net.bytebuddy.utility.JavaConstant$MethodHandle r2 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r7 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC
                net.bytebuddy.utility.JavaType r3 = net.bytebuddy.utility.JavaType.CONSTANT_BOOTSTRAPS
                net.bytebuddy.description.type.TypeDescription r8 = r3.getTypeStub()
                java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription r10 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                net.bytebuddy.utility.JavaType r4 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r4 = r4.getTypeStub()
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
                java.lang.Class<java.lang.Class> r9 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription r9 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r9)
                net.bytebuddy.utility.JavaType r11 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                net.bytebuddy.description.type.TypeDescription r11 = r11.getTypeStub()
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ArrayProjection.of(r3)
                r12 = 5
                net.bytebuddy.description.type.TypeDescription[] r12 = new net.bytebuddy.description.type.TypeDescription[r12]
                r12[r1] = r4
                r12[r0] = r6
                r0 = 2
                r12[r0] = r9
                r0 = 3
                r12[r0] = r11
                r0 = 4
                r12[r0] = r3
                java.util.List r11 = java.util.Arrays.asList(r12)
                java.lang.String r9 = "invoke"
                r6 = r2
                r6.<init>(r7, r8, r9, r10, r11)
                java.lang.String r0 = "_"
                r14.<init>(r0, r13, r2, r5)
                return r14
            L194:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r4)
                r1.append(r14)
                r1.append(r3)
                r1.append(r13)
                java.lang.String r13 = r1.toString()
                r0.<init>(r13)
                throw r0
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic ofInvocation(net.bytebuddy.description.method.MethodDescription.InDefinedShape r0, java.lang.Object... r1) {
                java.util.List r1 = java.util.Arrays.asList(r1)
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = ofInvocation(r0, r1)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.Dynamic ofNullConstant() {
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = new net.bytebuddy.utility.JavaConstant$Dynamic
                java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.utility.JavaConstant$MethodHandle r9 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r4 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC
                net.bytebuddy.utility.JavaType r3 = net.bytebuddy.utility.JavaType.CONSTANT_BOOTSTRAPS
                net.bytebuddy.description.type.TypeDescription r5 = r3.getTypeStub()
                net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.utility.JavaType r1 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r1 = r1.getTypeStub()
                java.lang.Class<java.lang.String> r3 = java.lang.String.class
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r3)
                java.lang.Class<java.lang.Class> r6 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
                r8 = 3
                net.bytebuddy.description.type.TypeDescription[] r8 = new net.bytebuddy.description.type.TypeDescription[r8]
                r10 = 0
                r8[r10] = r1
                r1 = 1
                r8[r1] = r3
                r1 = 2
                r8[r1] = r6
                java.util.List r8 = java.util.Arrays.asList(r8)
                java.lang.String r6 = "nullConstant"
                r3 = r9
                r3.<init>(r4, r5, r6, r7, r8)
                java.util.List r1 = java.util.Collections.emptyList()
                java.lang.String r3 = "_"
                r0.<init>(r3, r2, r9, r1)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant ofPrimitiveType(java.lang.Class<?> r0) {
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.utility.JavaConstant r0 = ofPrimitiveType(r0)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant ofPrimitiveType(net.bytebuddy.description.type.TypeDescription r11) {
                boolean r0 = r11.isPrimitive()
                if (r0 == 0) goto L4e
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = new net.bytebuddy.utility.JavaConstant$Dynamic
                java.lang.String r11 = r11.getDescriptor()
                java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription r2 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.utility.JavaConstant$MethodHandle r9 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r4 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC
                net.bytebuddy.utility.JavaType r3 = net.bytebuddy.utility.JavaType.CONSTANT_BOOTSTRAPS
                net.bytebuddy.description.type.TypeDescription r5 = r3.getTypeStub()
                net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.utility.JavaType r3 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r3 = r3.getTypeStub()
                java.lang.Class<java.lang.String> r6 = java.lang.String.class
                net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                r8 = 3
                net.bytebuddy.description.type.TypeDescription[] r8 = new net.bytebuddy.description.type.TypeDescription[r8]
                r10 = 0
                r8[r10] = r3
                r3 = 1
                r8[r3] = r6
                r3 = 2
                r8[r3] = r1
                java.util.List r8 = java.util.Arrays.asList(r8)
                java.lang.String r6 = "primitiveClass"
                r3 = r9
                r3.<init>(r4, r5, r6, r7, r8)
                java.util.List r1 = java.util.Collections.emptyList()
                r0.<init>(r11, r2, r9, r1)
                return r0
            L4e:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not a primitive type: "
                r1.append(r2)
                r1.append(r11)
                java.lang.String r11 = r1.toString()
                r0.<init>(r11)
                throw r0
        }

        public static net.bytebuddy.utility.JavaConstant ofVarHandle(java.lang.reflect.Field r1) {
                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant r1 = ofVarHandle(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant ofVarHandle(net.bytebuddy.description.field.FieldDescription.InDefinedShape r16) {
                r1 = 1
                r2 = 0
                net.bytebuddy.utility.JavaConstant$Dynamic r3 = new net.bytebuddy.utility.JavaConstant$Dynamic
                java.lang.String r4 = r16.getInternalName()
                net.bytebuddy.utility.JavaType r5 = net.bytebuddy.utility.JavaType.VAR_HANDLE
                net.bytebuddy.description.type.TypeDescription r6 = r5.getTypeStub()
                net.bytebuddy.utility.JavaConstant$MethodHandle r13 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r8 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC
                net.bytebuddy.utility.JavaType r7 = net.bytebuddy.utility.JavaType.CONSTANT_BOOTSTRAPS
                net.bytebuddy.description.type.TypeDescription r9 = r7.getTypeStub()
                boolean r7 = r16.isStatic()
                if (r7 == 0) goto L22
                java.lang.String r7 = "staticFieldVarHandle"
            L20:
                r10 = r7
                goto L25
            L22:
                java.lang.String r7 = "fieldVarHandle"
                goto L20
            L25:
                net.bytebuddy.description.type.TypeDescription r11 = r5.getTypeStub()
                net.bytebuddy.utility.JavaType r5 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                net.bytebuddy.description.type.TypeDescription r5 = r5.getTypeStub()
                java.lang.Class<java.lang.String> r7 = java.lang.String.class
                net.bytebuddy.description.type.TypeDescription r7 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r7)
                java.lang.Class<java.lang.Class> r12 = java.lang.Class.class
                net.bytebuddy.description.type.TypeDescription r14 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r12)
                net.bytebuddy.description.type.TypeDescription r15 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r12)
                net.bytebuddy.description.type.TypeDescription r12 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r12)
                r0 = 5
                net.bytebuddy.description.type.TypeDescription[] r0 = new net.bytebuddy.description.type.TypeDescription[r0]
                r0[r2] = r5
                r0[r1] = r7
                r5 = 2
                r0[r5] = r14
                r5 = 3
                r0[r5] = r15
                r5 = 4
                r0[r5] = r12
                java.util.List r12 = java.util.Arrays.asList(r0)
                r7 = r13
                r7.<init>(r8, r9, r10, r11, r12)
                net.bytebuddy.description.type.TypeDescription r0 = r16.getDeclaringType()
                net.bytebuddy.utility.JavaConstant r0 = net.bytebuddy.utility.JavaConstant.Simple.of(r0)
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r16.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                net.bytebuddy.utility.JavaConstant r5 = net.bytebuddy.utility.JavaConstant.Simple.of(r5)
                r7 = 2
                net.bytebuddy.utility.JavaConstant[] r7 = new net.bytebuddy.utility.JavaConstant[r7]
                r7[r2] = r0
                r7[r1] = r5
                java.util.List r0 = java.util.Arrays.asList(r7)
                r3.<init>(r4, r6, r13, r0)
                return r3
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public <T> T accept(net.bytebuddy.utility.JavaConstant.Visitor<T> r1) {
                r0 = this;
                java.lang.Object r1 = r1.onDynamic(r0)
                return r1
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r4) {
                r3 = this;
                if (r3 != r4) goto L4
                r4 = 1
                return r4
            L4:
                r0 = 0
                if (r4 == 0) goto L3e
                java.lang.Class r1 = r3.getClass()
                java.lang.Class r2 = r4.getClass()
                if (r1 == r2) goto L12
                goto L3e
            L12:
                net.bytebuddy.utility.JavaConstant$Dynamic r4 = (net.bytebuddy.utility.JavaConstant.Dynamic) r4
                java.lang.String r1 = r3.name
                java.lang.String r2 = r4.name
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L1f
                return r0
            L1f:
                net.bytebuddy.description.type.TypeDescription r1 = r3.typeDescription
                net.bytebuddy.description.type.TypeDescription r2 = r4.typeDescription
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L2a
                return r0
            L2a:
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = r3.bootstrap
                net.bytebuddy.utility.JavaConstant$MethodHandle r2 = r4.bootstrap
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L35
                return r0
            L35:
                java.util.List<net.bytebuddy.utility.JavaConstant> r0 = r3.arguments
                java.util.List<net.bytebuddy.utility.JavaConstant> r4 = r4.arguments
                boolean r4 = r0.equals(r4)
                return r4
            L3e:
                return r0
        }

        public java.util.List<net.bytebuddy.utility.JavaConstant> getArguments() {
                r1 = this;
                java.util.List<net.bytebuddy.utility.JavaConstant> r0 = r1.arguments
                return r0
        }

        public net.bytebuddy.utility.JavaConstant.MethodHandle getBootstrap() {
                r1 = this;
                net.bytebuddy.utility.JavaConstant$MethodHandle r0 = r1.bootstrap
                return r0
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                return r0
        }

        public int hashCode() {
                r2 = this;
                java.lang.String r0 = r2.name
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.typeDescription
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = r2.bootstrap
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<net.bytebuddy.utility.JavaConstant> r1 = r2.arguments
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public java.lang.Object toDescription() {
                r8 = this;
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher r0 = net.bytebuddy.utility.JavaConstant.Simple.CONSTANT_DESC
                java.util.List<net.bytebuddy.utility.JavaConstant> r1 = r8.arguments
                int r1 = r1.size()
                java.lang.Object[] r0 = r0.toArray(r1)
                r1 = 0
            Ld:
                int r2 = r0.length
                if (r1 >= r2) goto L21
                java.util.List<net.bytebuddy.utility.JavaConstant> r2 = r8.arguments
                java.lang.Object r2 = r2.get(r1)
                net.bytebuddy.utility.JavaConstant r2 = (net.bytebuddy.utility.JavaConstant) r2
                java.lang.Object r2 = r2.toDescription()
                r0[r1] = r2
                int r1 = r1 + 1
                goto Ld
            L21:
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc r1 = net.bytebuddy.utility.JavaConstant.Simple.DYNAMIC_CONSTANT_DESC
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodHandleDesc r2 = net.bytebuddy.utility.JavaConstant.Simple.METHOD_HANDLE_DESC
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind r3 = net.bytebuddy.utility.JavaConstant.Simple.DIRECT_METHOD_HANDLE_DESC_KIND
                net.bytebuddy.utility.JavaConstant$MethodHandle r4 = r8.bootstrap
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r4 = r4.getHandleType()
                int r4 = r4.getIdentifier()
                net.bytebuddy.utility.JavaConstant$MethodHandle r5 = r8.bootstrap
                net.bytebuddy.description.type.TypeDescription r5 = r5.getOwnerType()
                boolean r5 = r5.isInterface()
                java.lang.Object r3 = r3.valueOf(r4, r5)
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r4 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                net.bytebuddy.utility.JavaConstant$MethodHandle r5 = r8.bootstrap
                net.bytebuddy.description.type.TypeDescription r5 = r5.getOwnerType()
                java.lang.String r5 = r5.getDescriptor()
                java.lang.Object r5 = r4.ofDescriptor(r5)
                net.bytebuddy.utility.JavaConstant$MethodHandle r6 = r8.bootstrap
                java.lang.String r6 = r6.getName()
                net.bytebuddy.utility.JavaConstant$MethodHandle r7 = r8.bootstrap
                java.lang.String r7 = r7.getDescriptor()
                java.lang.Object r2 = r2.of(r3, r5, r6, r7)
                java.lang.String r3 = r8.getName()
                net.bytebuddy.description.type.TypeDescription r5 = r8.typeDescription
                java.lang.String r5 = r5.getDescriptor()
                java.lang.Object r4 = r4.ofDescriptor(r5)
                java.lang.Object r0 = r1.ofCanonical(r2, r3, r4, r0)
                return r0
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue r0 = new net.bytebuddy.implementation.bytecode.constant.JavaConstantValue
                r0.<init>(r1)
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = r5.bootstrap
                net.bytebuddy.description.type.TypeDescription r1 = r1.getOwnerType()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = "::"
                r0.append(r1)
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = r5.bootstrap
                java.lang.String r1 = r1.getName()
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                java.lang.String r1 = r5.name
                java.lang.String r2 = "_"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L32
                java.lang.String r1 = ""
                goto L34
            L32:
                java.lang.String r1 = r5.name
            L34:
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                java.util.List<net.bytebuddy.utility.JavaConstant> r1 = r5.arguments
                java.util.Iterator r1 = r1.iterator()
                r2 = 1
            L43:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L60
                java.lang.Object r3 = r1.next()
                net.bytebuddy.utility.JavaConstant r3 = (net.bytebuddy.utility.JavaConstant) r3
                if (r2 == 0) goto L53
                r2 = 0
                goto L58
            L53:
                r4 = 44
                r0.append(r4)
            L58:
                java.lang.String r3 = r3.toString()
                r0.append(r3)
                goto L43
            L60:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r5.typeDescription
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public net.bytebuddy.utility.JavaConstant withType(java.lang.Class<?> r1) {
                r0 = this;
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.utility.JavaConstant r1 = r0.withType(r1)
                return r1
        }

        public net.bytebuddy.utility.JavaConstant withType(net.bytebuddy.description.type.TypeDescription r5) {
                r4 = this;
                java.lang.Class r0 = java.lang.Void.TYPE
                boolean r0 = r5.represents(r0)
                if (r0 != 0) goto L65
                net.bytebuddy.utility.JavaConstant$MethodHandle r0 = r4.getBootstrap()
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = "<init>"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L23
                net.bytebuddy.description.type.TypeDescription r0 = r4.getTypeDescription()
                boolean r0 = r0.isAssignableTo(r5)
                if (r0 == 0) goto L47
                goto L35
            L23:
                net.bytebuddy.description.type.TypeDescription r0 = r5.asBoxed()
                net.bytebuddy.description.type.TypeDescription r1 = r4.getTypeDescription()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asBoxed()
                boolean r0 = r0.isInHierarchyWith(r1)
                if (r0 == 0) goto L47
            L35:
                net.bytebuddy.utility.JavaConstant$Dynamic r0 = new net.bytebuddy.utility.JavaConstant$Dynamic
                java.lang.String r1 = r4.getName()
                net.bytebuddy.utility.JavaConstant$MethodHandle r2 = r4.getBootstrap()
                java.util.List r3 = r4.getArguments()
                r0.<init>(r1, r5, r2, r3)
                return r0
            L47:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r5)
                java.lang.String r5 = " is not compatible with bootstrapped type "
                r1.append(r5)
                net.bytebuddy.description.type.TypeDescription r5 = r4.getTypeDescription()
                r1.append(r5)
                java.lang.String r5 = r1.toString()
                r0.<init>(r5)
                throw r0
            L65:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Constant value cannot represent void"
                r5.<init>(r0)
                throw r5
        }
    }

    public static class MethodHandle implements net.bytebuddy.utility.JavaConstant {
        private static final boolean ACCESS_CONTROLLER = false;
        protected static final net.bytebuddy.utility.JavaConstant.MethodHandle.MethodHandles METHOD_HANDLES = null;
        protected static final net.bytebuddy.utility.JavaConstant.MethodHandle.MethodHandles.Lookup METHOD_HANDLES_LOOKUP = null;
        protected static final net.bytebuddy.utility.JavaConstant.MethodHandle.MethodHandleInfo METHOD_HANDLE_INFO = null;
        protected static final net.bytebuddy.utility.JavaConstant.MethodHandle.MethodType METHOD_TYPE = null;
        private final net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType handleType;
        private final java.lang.String name;
        private final net.bytebuddy.description.type.TypeDescription ownerType;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription> parameterTypes;
        private final net.bytebuddy.description.type.TypeDescription returnType;

        public enum HandleType extends java.lang.Enum<net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType> {
            private static final /* synthetic */ net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType[] $VALUES = null;
            public static final net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType GET_FIELD = null;
            public static final net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType GET_STATIC_FIELD = null;
            public static final net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType INVOKE_INTERFACE = null;
            public static final net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType INVOKE_SPECIAL = null;
            public static final net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType INVOKE_SPECIAL_CONSTRUCTOR = null;
            public static final net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType INVOKE_STATIC = null;
            public static final net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType INVOKE_VIRTUAL = null;
            public static final net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType PUT_FIELD = null;
            public static final net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType PUT_STATIC_FIELD = null;
            private final boolean field;
            private final int identifier;

            static {
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r0 = new net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType
                    java.lang.String r1 = "INVOKE_VIRTUAL"
                    r2 = 0
                    r3 = 5
                    r0.<init>(r1, r2, r3, r2)
                    net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_VIRTUAL = r0
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = new net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType
                    java.lang.String r4 = "INVOKE_STATIC"
                    r5 = 1
                    r6 = 6
                    r1.<init>(r4, r5, r6, r2)
                    net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC = r1
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r4 = new net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType
                    java.lang.String r7 = "INVOKE_SPECIAL"
                    r8 = 2
                    r9 = 7
                    r4.<init>(r7, r8, r9, r2)
                    net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_SPECIAL = r4
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r7 = new net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType
                    r10 = 9
                    java.lang.String r11 = "INVOKE_INTERFACE"
                    r12 = 3
                    r7.<init>(r11, r12, r10, r2)
                    net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_INTERFACE = r7
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r10 = new net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType
                    java.lang.String r11 = "INVOKE_SPECIAL_CONSTRUCTOR"
                    r13 = 4
                    r14 = 8
                    r10.<init>(r11, r13, r14, r2)
                    net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_SPECIAL_CONSTRUCTOR = r10
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r11 = new net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType
                    java.lang.String r2 = "PUT_FIELD"
                    r11.<init>(r2, r3, r12, r5)
                    net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.PUT_FIELD = r11
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r12 = new net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType
                    java.lang.String r2 = "GET_FIELD"
                    r12.<init>(r2, r6, r5, r5)
                    net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.GET_FIELD = r12
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r15 = new net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType
                    java.lang.String r2 = "PUT_STATIC_FIELD"
                    r15.<init>(r2, r9, r13, r5)
                    net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.PUT_STATIC_FIELD = r15
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r9 = new net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType
                    java.lang.String r2 = "GET_STATIC_FIELD"
                    r9.<init>(r2, r14, r8, r5)
                    net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.GET_STATIC_FIELD = r9
                    r2 = r4
                    r3 = r7
                    r4 = r10
                    r5 = r11
                    r6 = r12
                    r7 = r15
                    r8 = r9
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType[] r0 = new net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
                    net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.$VALUES = r0
                    return
            }

            HandleType(java.lang.String r1, int r2, int r3, boolean r4) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    r0.identifier = r3
                    r0.field = r4
                    return
            }

            public static net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType of(int r5) {
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType[] r0 = values()
                    int r1 = r0.length
                    r2 = 0
                L6:
                    if (r2 >= r1) goto L14
                    r3 = r0[r2]
                    int r4 = r3.getIdentifier()
                    if (r4 != r5) goto L11
                    return r3
                L11:
                    int r2 = r2 + 1
                    goto L6
                L14:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Unknown handle type: "
                    r1.append(r2)
                    r1.append(r5)
                    java.lang.String r5 = r1.toString()
                    r0.<init>(r5)
                    throw r0
            }

            public static net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType of(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                    boolean r0 = r3.isTypeInitializer()
                    if (r0 != 0) goto L31
                    boolean r0 = r3.isStatic()
                    if (r0 == 0) goto Lf
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r3 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_STATIC
                    return r3
                Lf:
                    boolean r0 = r3.isConstructor()
                    if (r0 == 0) goto L18
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r3 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_SPECIAL_CONSTRUCTOR
                    return r3
                L18:
                    boolean r0 = r3.isPrivate()
                    if (r0 == 0) goto L21
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r3 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_SPECIAL
                    return r3
                L21:
                    net.bytebuddy.description.type.TypeDescription r3 = r3.getDeclaringType()
                    boolean r3 = r3.isInterface()
                    if (r3 == 0) goto L2e
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r3 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_INTERFACE
                    return r3
                L2e:
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r3 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_VIRTUAL
                    return r3
                L31:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Cannot create handle of type initializer "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r3 = r1.toString()
                    r0.<init>(r3)
                    throw r0
            }

            public static net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType ofGetter(net.bytebuddy.description.field.FieldDescription.InDefinedShape r0) {
                    boolean r0 = r0.isStatic()
                    if (r0 == 0) goto L9
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.GET_STATIC_FIELD
                    goto Lb
                L9:
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.GET_FIELD
                Lb:
                    return r0
            }

            public static net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType ofSetter(net.bytebuddy.description.field.FieldDescription.InDefinedShape r0) {
                    boolean r0 = r0.isStatic()
                    if (r0 == 0) goto L9
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.PUT_STATIC_FIELD
                    goto Lb
                L9:
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.PUT_FIELD
                Lb:
                    return r0
            }

            public static net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType ofSpecial(net.bytebuddy.description.method.MethodDescription.InDefinedShape r3) {
                    boolean r0 = r3.isStatic()
                    if (r0 != 0) goto L18
                    boolean r0 = r3.isAbstract()
                    if (r0 != 0) goto L18
                    boolean r3 = r3.isConstructor()
                    if (r3 == 0) goto L15
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r3 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_SPECIAL_CONSTRUCTOR
                    goto L17
                L15:
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r3 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_SPECIAL
                L17:
                    return r3
                L18:
                    java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Cannot invoke "
                    r1.append(r2)
                    r1.append(r3)
                    java.lang.String r3 = " via invokespecial"
                    r1.append(r3)
                    java.lang.String r3 = r1.toString()
                    r0.<init>(r3)
                    throw r0
            }

            public static net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType> r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = (net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType) r1
                    return r1
            }

            public static net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType[] values() {
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType[] r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType[] r0 = (net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType[]) r0
                    return r0
            }

            public int getIdentifier() {
                    r1 = this;
                    int r0 = r1.identifier
                    return r0
            }

            public boolean isField() {
                    r1 = this;
                    boolean r0 = r1.field
                    return r0
            }
        }

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.invoke.MethodHandleInfo")
        public interface MethodHandleInfo {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getDeclaringClass")
            java.lang.Class<?> getDeclaringClass(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getMethodType")
            java.lang.Object getMethodType(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getName")
            java.lang.String getName(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("getReferenceKind")
            int getReferenceKind(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsConstructor
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("revealDirect")
            java.lang.Object revealDirect(@net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.invoke.MethodHandle") java.lang.Object r1);
        }

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.invoke.MethodHandles")
        public interface MethodHandles {

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.invoke.MethodHandles$Lookup")
            public interface Lookup {
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("lookupClass")
                java.lang.Class<?> lookupClass(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("revealDirect")
                java.lang.Object revealDirect(java.lang.Object r1, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.invoke.MethodHandle") java.lang.Object r2);
            }

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("publicLookup")
            java.lang.Object publicLookup();
        }

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.invoke.MethodType")
        public interface MethodType {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("parameterArray")
            java.lang.Class<?>[] parameterArray(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("returnType")
            java.lang.Class<?> returnType(java.lang.Object r1);
        }

        static {
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.utility.JavaConstant.MethodHandle.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.utility.JavaConstant.MethodHandle.ACCESS_CONTROLLER = r0
            L19:
                java.lang.Class<net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandleInfo> r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.MethodHandleInfo.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandleInfo r0 = (net.bytebuddy.utility.JavaConstant.MethodHandle.MethodHandleInfo) r0
                net.bytebuddy.utility.JavaConstant.MethodHandle.METHOD_HANDLE_INFO = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$MethodHandle$MethodType> r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.MethodType.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$MethodHandle$MethodType r0 = (net.bytebuddy.utility.JavaConstant.MethodHandle.MethodType) r0
                net.bytebuddy.utility.JavaConstant.MethodHandle.METHOD_TYPE = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandles> r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.MethodHandles.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandles r0 = (net.bytebuddy.utility.JavaConstant.MethodHandle.MethodHandles) r0
                net.bytebuddy.utility.JavaConstant.MethodHandle.METHOD_HANDLES = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandles$Lookup> r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.MethodHandles.Lookup.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandles$Lookup r0 = (net.bytebuddy.utility.JavaConstant.MethodHandle.MethodHandles.Lookup) r0
                net.bytebuddy.utility.JavaConstant.MethodHandle.METHOD_HANDLES_LOOKUP = r0
                return
        }

        public MethodHandle(net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType r1, net.bytebuddy.description.type.TypeDescription r2, java.lang.String r3, net.bytebuddy.description.type.TypeDescription r4, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r5) {
                r0 = this;
                r0.<init>()
                r0.handleType = r1
                r0.ownerType = r2
                r0.name = r3
                r0.returnType = r4
                r0.parameterTypes = r5
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static java.lang.Class<?> lookupType(java.lang.Object r1) {
                net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandles$Lookup r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.METHOD_HANDLES_LOOKUP
                java.lang.Class r1 = r0.lookupClass(r1)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle of(java.lang.reflect.Constructor<?> r1) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = of(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle of(java.lang.reflect.Method r1) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = of(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle of(net.bytebuddy.description.method.MethodDescription.InDefinedShape r7) {
                net.bytebuddy.utility.JavaConstant$MethodHandle r6 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.of(r7)
                net.bytebuddy.description.type.TypeDescription r0 = r7.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r2 = r0.asErasure()
                java.lang.String r3 = r7.getInternalName()
                net.bytebuddy.description.type.TypeDescription$Generic r0 = r7.getReturnType()
                net.bytebuddy.description.type.TypeDescription r4 = r0.asErasure()
                net.bytebuddy.description.method.ParameterList r7 = r7.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r7 = r7.asTypeList()
                net.bytebuddy.description.type.TypeList r5 = r7.asErasures()
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle ofGetter(java.lang.reflect.Field r1) {
                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = ofGetter(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle ofGetter(net.bytebuddy.description.field.FieldDescription.InDefinedShape r7) {
                net.bytebuddy.utility.JavaConstant$MethodHandle r6 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.ofGetter(r7)
                net.bytebuddy.description.type.TypeDescription r0 = r7.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r2 = r0.asErasure()
                java.lang.String r3 = r7.getInternalName()
                net.bytebuddy.description.type.TypeDescription$Generic r7 = r7.getType()
                net.bytebuddy.description.type.TypeDescription r4 = r7.asErasure()
                java.util.List r5 = java.util.Collections.emptyList()
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle ofLoaded(java.lang.Object r1) {
                net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandles r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.METHOD_HANDLES
                java.lang.Object r0 = r0.publicLookup()
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = ofLoaded(r1, r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle ofLoaded(java.lang.Object r8, java.lang.Object r9) {
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                boolean r0 = r0.isInstance(r8)
                if (r0 == 0) goto L76
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP
                boolean r0 = r0.isInstance(r9)
                if (r0 == 0) goto L5f
                net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.JAVA_V8
                net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.ofThisVm(r0)
                net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V7
                boolean r0 = r0.isAtMost(r1)
                if (r0 == 0) goto L25
                net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandleInfo r9 = net.bytebuddy.utility.JavaConstant.MethodHandle.METHOD_HANDLE_INFO
                java.lang.Object r8 = r9.revealDirect(r8)
                goto L2b
            L25:
                net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandles$Lookup r0 = net.bytebuddy.utility.JavaConstant.MethodHandle.METHOD_HANDLES_LOOKUP
                java.lang.Object r8 = r0.revealDirect(r9, r8)
            L2b:
                net.bytebuddy.utility.JavaConstant$MethodHandle$MethodHandleInfo r9 = net.bytebuddy.utility.JavaConstant.MethodHandle.METHOD_HANDLE_INFO
                java.lang.Object r0 = r9.getMethodType(r8)
                net.bytebuddy.utility.JavaConstant$MethodHandle r7 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                int r1 = r9.getReferenceKind(r8)
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.of(r1)
                java.lang.Class r1 = r9.getDeclaringClass(r8)
                net.bytebuddy.description.type.TypeDescription r3 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                java.lang.String r4 = r9.getName(r8)
                net.bytebuddy.utility.JavaConstant$MethodHandle$MethodType r8 = net.bytebuddy.utility.JavaConstant.MethodHandle.METHOD_TYPE
                java.lang.Class r9 = r8.returnType(r0)
                net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r9)
                net.bytebuddy.description.type.TypeList$ForLoadedTypes r6 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                java.lang.Class[] r8 = r8.parameterArray(r0)
                r6.<init>(r8)
                r1 = r7
                r1.<init>(r2, r3, r4, r5, r6)
                return r7
            L5f:
                java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Expected method handle lookup object: "
                r0.append(r1)
                r0.append(r9)
                java.lang.String r9 = r0.toString()
                r8.<init>(r9)
                throw r8
            L76:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Expected method handle object: "
                r0.append(r1)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r9.<init>(r8)
                throw r9
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle ofSetter(java.lang.reflect.Field r1) {
                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = ofSetter(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle ofSetter(net.bytebuddy.description.field.FieldDescription.InDefinedShape r7) {
                net.bytebuddy.utility.JavaConstant$MethodHandle r6 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.ofSetter(r7)
                net.bytebuddy.description.type.TypeDescription r0 = r7.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r2 = r0.asErasure()
                java.lang.String r3 = r7.getInternalName()
                java.lang.Class r0 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.description.type.TypeDescription$Generic r7 = r7.getType()
                net.bytebuddy.description.type.TypeDescription r7 = r7.asErasure()
                java.util.List r5 = java.util.Collections.singletonList(r7)
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return r6
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle ofSpecial(java.lang.reflect.Method r1, java.lang.Class<?> r2) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r0.<init>(r1)
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = ofSpecial(r0, r1)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodHandle ofSpecial(net.bytebuddy.description.method.MethodDescription.InDefinedShape r7, net.bytebuddy.description.type.TypeDescription r8) {
                boolean r0 = r7.isSpecializableFor(r8)
                if (r0 == 0) goto L2a
                net.bytebuddy.utility.JavaConstant$MethodHandle r0 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.ofSpecial(r7)
                java.lang.String r4 = r7.getInternalName()
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r7.getReturnType()
                net.bytebuddy.description.type.TypeDescription r5 = r1.asErasure()
                net.bytebuddy.description.method.ParameterList r7 = r7.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r7 = r7.asTypeList()
                net.bytebuddy.description.type.TypeList r6 = r7.asErasures()
                r1 = r0
                r3 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return r0
            L2a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Cannot specialize "
                r1.append(r2)
                r1.append(r7)
                java.lang.String r7 = " for "
                r1.append(r7)
                r1.append(r8)
                java.lang.String r7 = r1.toString()
                r0.<init>(r7)
                throw r0
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public <T> T accept(net.bytebuddy.utility.JavaConstant.Visitor<T> r1) {
                r0 = this;
                java.lang.Object r1 = r1.onMethodHandle(r0)
                return r1
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.utility.JavaConstant.MethodHandle
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.utility.JavaConstant$MethodHandle r5 = (net.bytebuddy.utility.JavaConstant.MethodHandle) r5
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = r4.handleType
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r3 = r5.handleType
                if (r1 != r3) goto L3b
                java.lang.String r1 = r4.name
                java.lang.String r3 = r5.name
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L3b
                net.bytebuddy.description.type.TypeDescription r1 = r4.ownerType
                net.bytebuddy.description.type.TypeDescription r3 = r5.ownerType
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L3b
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r4.parameterTypes
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r3 = r5.parameterTypes
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L3b
                net.bytebuddy.description.type.TypeDescription r1 = r4.returnType
                net.bytebuddy.description.type.TypeDescription r5 = r5.returnType
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L3b
                goto L3c
            L3b:
                r0 = r2
            L3c:
                return r0
        }

        public java.lang.String getDescriptor() {
                r3 = this;
                int[] r0 = net.bytebuddy.utility.JavaConstant.AnonymousClass1.$SwitchMap$net$bytebuddy$utility$JavaConstant$MethodHandle$HandleType
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = r3.handleType
                int r1 = r1.ordinal()
                r0 = r0[r1]
                r1 = 1
                if (r0 == r1) goto L5b
                r1 = 2
                if (r0 == r1) goto L5b
                r1 = 3
                if (r0 == r1) goto L4d
                r1 = 4
                if (r0 == r1) goto L4d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 40
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r3.parameterTypes
                java.util.Iterator r1 = r1.iterator()
            L26:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L3a
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.String r2 = r2.getDescriptor()
                r0.append(r2)
                goto L26
            L3a:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r3.returnType
                java.lang.String r1 = r1.getDescriptor()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            L4d:
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r0 = r3.parameterTypes
                r1 = 0
                java.lang.Object r0 = r0.get(r1)
                net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                java.lang.String r0 = r0.getDescriptor()
                return r0
            L5b:
                net.bytebuddy.description.type.TypeDescription r0 = r3.returnType
                java.lang.String r0 = r0.getDescriptor()
                return r0
        }

        public net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType getHandleType() {
                r1 = this;
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r0 = r1.handleType
                return r0
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public net.bytebuddy.description.type.TypeDescription getOwnerType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.ownerType
                return r0
        }

        public net.bytebuddy.description.type.TypeList getParameterTypes() {
                r2 = this;
                net.bytebuddy.description.type.TypeList$Explicit r0 = new net.bytebuddy.description.type.TypeList$Explicit
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r2.parameterTypes
                r0.<init>(r1)
                return r0
        }

        public net.bytebuddy.description.type.TypeDescription getReturnType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.returnType
                return r0
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                r1 = this;
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                return r0
        }

        public int hashCode() {
                r2 = this;
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r0 = r2.handleType
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.ownerType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.lang.String r1 = r2.name
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                net.bytebuddy.description.type.TypeDescription r1 = r2.returnType
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r2.parameterTypes
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public java.lang.Object toDescription() {
                r5 = this;
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodHandleDesc r0 = net.bytebuddy.utility.JavaConstant.Simple.METHOD_HANDLE_DESC
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind r1 = net.bytebuddy.utility.JavaConstant.Simple.DIRECT_METHOD_HANDLE_DESC_KIND
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r2 = r5.handleType
                int r2 = r2.getIdentifier()
                net.bytebuddy.description.type.TypeDescription r3 = r5.ownerType
                boolean r3 = r3.isInterface()
                java.lang.Object r1 = r1.valueOf(r2, r3)
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r2 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                net.bytebuddy.description.type.TypeDescription r3 = r5.ownerType
                java.lang.String r3 = r3.getDescriptor()
                java.lang.Object r2 = r2.ofDescriptor(r3)
                java.lang.String r3 = r5.name
                java.lang.String r4 = r5.getDescriptor()
                java.lang.Object r0 = r0.of(r1, r2, r3, r4)
                return r0
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue r0 = new net.bytebuddy.implementation.bytecode.constant.JavaConstantValue
                r0.<init>(r1)
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = r5.handleType
                java.lang.String r1 = r1.name()
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r5.ownerType
                boolean r1 = r1.isInterface()
                if (r1 == 0) goto L27
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = r5.handleType
                boolean r1 = r1.isField()
                if (r1 != 0) goto L27
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r1 = r5.handleType
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r2 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.INVOKE_INTERFACE
                if (r1 == r2) goto L27
                java.lang.String r1 = "@interface"
                goto L29
            L27:
                java.lang.String r1 = ""
            L29:
                r0.append(r1)
                r1 = 47
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r5.ownerType
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r1 = "::"
                r0.append(r1)
                java.lang.String r1 = r5.name
                r0.append(r1)
                r1 = 40
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r5.parameterTypes
                java.util.Iterator r1 = r1.iterator()
                r2 = 1
            L50:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L6d
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                if (r2 == 0) goto L60
                r2 = 0
                goto L65
            L60:
                r4 = 44
                r0.append(r4)
            L65:
                java.lang.String r3 = r3.getSimpleName()
                r0.append(r3)
                goto L50
            L6d:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r5.returnType
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static class MethodType implements net.bytebuddy.utility.JavaConstant {
        private static final boolean ACCESS_CONTROLLER = false;
        private static final net.bytebuddy.utility.JavaConstant.MethodType.Dispatcher DISPATCHER = null;
        private final java.util.List<? extends net.bytebuddy.description.type.TypeDescription> parameterTypes;
        private final net.bytebuddy.description.type.TypeDescription returnType;

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.invoke.MethodType")
        public interface Dispatcher {
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("parameterArray")
            java.lang.Class<?>[] parameterArray(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("returnType")
            java.lang.Class<?> returnType(java.lang.Object r1);
        }

        static {
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.utility.JavaConstant.MethodType.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.utility.JavaConstant.MethodType.ACCESS_CONTROLLER = r0
            L19:
                java.lang.Class<net.bytebuddy.utility.JavaConstant$MethodType$Dispatcher> r0 = net.bytebuddy.utility.JavaConstant.MethodType.Dispatcher.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$MethodType$Dispatcher r0 = (net.bytebuddy.utility.JavaConstant.MethodType.Dispatcher) r0
                net.bytebuddy.utility.JavaConstant.MethodType.DISPATCHER = r0
                return
        }

        public MethodType(net.bytebuddy.description.type.TypeDescription r1, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r2) {
                r0 = this;
                r0.<init>()
                r0.returnType = r1
                r0.parameterTypes = r2
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.utility.JavaConstant.MethodType.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType of(java.lang.Class<?> r1, java.lang.Class<?>... r2) {
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.description.type.TypeList$ForLoadedTypes r0 = new net.bytebuddy.description.type.TypeList$ForLoadedTypes
                r0.<init>(r2)
                net.bytebuddy.utility.JavaConstant$MethodType r1 = of(r1, r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType of(java.lang.reflect.Constructor<?> r1) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$MethodType r1 = of(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType of(java.lang.reflect.Method r1) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$MethodType r1 = of(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType of(net.bytebuddy.description.method.MethodDescription r3) {
                net.bytebuddy.utility.JavaConstant$MethodType r0 = new net.bytebuddy.utility.JavaConstant$MethodType
                boolean r1 = r3.isConstructor()
                if (r1 == 0) goto Ld
                net.bytebuddy.description.type.TypeDefinition r1 = r3.getDeclaringType()
                goto L11
            Ld:
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getReturnType()
            L11:
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                boolean r2 = r3.isStatic()
                if (r2 != 0) goto L3b
                boolean r2 = r3.isConstructor()
                if (r2 == 0) goto L22
                goto L3b
            L22:
                net.bytebuddy.description.type.TypeDefinition r2 = r3.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                net.bytebuddy.description.method.ParameterList r3 = r3.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.asTypeList()
                net.bytebuddy.description.type.TypeList r3 = r3.asErasures()
                java.util.List r3 = net.bytebuddy.utility.CompoundList.of(r2, r3)
                goto L47
            L3b:
                net.bytebuddy.description.method.ParameterList r3 = r3.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r3 = r3.asTypeList()
                net.bytebuddy.description.type.TypeList r3 = r3.asErasures()
            L47:
                r0.<init>(r1, r3)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType of(net.bytebuddy.description.type.TypeDescription r1, java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r2) {
                net.bytebuddy.utility.JavaConstant$MethodType r0 = new net.bytebuddy.utility.JavaConstant$MethodType
                r0.<init>(r1, r2)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType of(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.description.type.TypeDescription... r2) {
                net.bytebuddy.utility.JavaConstant$MethodType r0 = new net.bytebuddy.utility.JavaConstant$MethodType
                java.util.List r2 = java.util.Arrays.asList(r2)
                r0.<init>(r1, r2)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType ofConstant(java.lang.Class<?> r0) {
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                net.bytebuddy.utility.JavaConstant$MethodType r0 = ofConstant(r0)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType ofConstant(java.lang.Object r0) {
                java.lang.Class r0 = r0.getClass()
                net.bytebuddy.utility.JavaConstant$MethodType r0 = ofConstant(r0)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType ofConstant(net.bytebuddy.description.type.TypeDescription r2) {
                net.bytebuddy.utility.JavaConstant$MethodType r0 = new net.bytebuddy.utility.JavaConstant$MethodType
                java.util.List r1 = java.util.Collections.emptyList()
                r0.<init>(r2, r1)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType ofGetter(java.lang.reflect.Field r1) {
                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$MethodType r1 = ofGetter(r0)
                return r1
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public static net.bytebuddy.utility.JavaConstant.MethodType ofGetter(net.bytebuddy.description.field.FieldDescription r3) {
                net.bytebuddy.utility.JavaConstant$MethodType r0 = new net.bytebuddy.utility.JavaConstant$MethodType
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r3.getType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                boolean r2 = r3.isStatic()
                if (r2 == 0) goto L15
                java.util.List r3 = java.util.Collections.emptyList()
                goto L21
            L15:
                net.bytebuddy.description.type.TypeDefinition r3 = r3.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r3 = r3.asErasure()
                java.util.List r3 = java.util.Collections.singletonList(r3)
            L21:
                r0.<init>(r1, r3)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType ofLoaded(java.lang.Object r3) {
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_TYPE
                boolean r0 = r0.isInstance(r3)
                if (r0 == 0) goto L17
                net.bytebuddy.utility.JavaConstant$MethodType$Dispatcher r0 = net.bytebuddy.utility.JavaConstant.MethodType.DISPATCHER
                java.lang.Class r1 = r0.returnType(r3)
                java.lang.Class[] r3 = r0.parameterArray(r3)
                net.bytebuddy.utility.JavaConstant$MethodType r3 = of(r1, r3)
                return r3
            L17:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Expected method type object: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType ofSetter(java.lang.reflect.Field r1) {
                net.bytebuddy.description.field.FieldDescription$ForLoadedField r0 = new net.bytebuddy.description.field.FieldDescription$ForLoadedField
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$MethodType r1 = ofSetter(r0)
                return r1
        }

        @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Assuming declaring type for type member.", value = {"NP_NULL_ON_SOME_PATH_FROM_RETURN_VALUE"})
        public static net.bytebuddy.utility.JavaConstant.MethodType ofSetter(net.bytebuddy.description.field.FieldDescription r5) {
                net.bytebuddy.utility.JavaConstant$MethodType r0 = new net.bytebuddy.utility.JavaConstant$MethodType
                java.lang.Class r1 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                boolean r2 = r5.isStatic()
                if (r2 == 0) goto L1b
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                java.util.List r5 = java.util.Collections.singletonList(r5)
                goto L38
            L1b:
                net.bytebuddy.description.type.TypeDefinition r2 = r5.getDeclaringType()
                net.bytebuddy.description.type.TypeDescription r2 = r2.asErasure()
                net.bytebuddy.description.type.TypeDescription$Generic r5 = r5.getType()
                net.bytebuddy.description.type.TypeDescription r5 = r5.asErasure()
                r3 = 2
                net.bytebuddy.description.type.TypeDescription[] r3 = new net.bytebuddy.description.type.TypeDescription[r3]
                r4 = 0
                r3[r4] = r2
                r2 = 1
                r3[r2] = r5
                java.util.List r5 = java.util.Arrays.asList(r3)
            L38:
                r0.<init>(r1, r5)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType ofSignature(java.lang.reflect.Constructor<?> r1) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$MethodType r1 = ofSignature(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType ofSignature(java.lang.reflect.Method r1) {
                net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r0 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod
                r0.<init>(r1)
                net.bytebuddy.utility.JavaConstant$MethodType r1 = ofSignature(r0)
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant.MethodType ofSignature(net.bytebuddy.description.method.MethodDescription r2) {
                net.bytebuddy.utility.JavaConstant$MethodType r0 = new net.bytebuddy.utility.JavaConstant$MethodType
                net.bytebuddy.description.type.TypeDescription$Generic r1 = r2.getReturnType()
                net.bytebuddy.description.type.TypeDescription r1 = r1.asErasure()
                net.bytebuddy.description.method.ParameterList r2 = r2.getParameters()
                net.bytebuddy.description.type.TypeList$Generic r2 = r2.asTypeList()
                net.bytebuddy.description.type.TypeList r2 = r2.asErasures()
                r0.<init>(r1, r2)
                return r0
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public <T> T accept(net.bytebuddy.utility.JavaConstant.Visitor<T> r1) {
                r0 = this;
                java.lang.Object r1 = r1.onMethodType(r0)
                return r1
        }

        public boolean equals(@net.bytebuddy.utility.nullability.MaybeNull java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof net.bytebuddy.utility.JavaConstant.MethodType
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                net.bytebuddy.utility.JavaConstant$MethodType r5 = (net.bytebuddy.utility.JavaConstant.MethodType) r5
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r4.parameterTypes
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r3 = r5.parameterTypes
                boolean r1 = r1.equals(r3)
                if (r1 == 0) goto L21
                net.bytebuddy.description.type.TypeDescription r1 = r4.returnType
                net.bytebuddy.description.type.TypeDescription r5 = r5.returnType
                boolean r5 = r1.equals(r5)
                if (r5 == 0) goto L21
                goto L22
            L21:
                r0 = r2
            L22:
                return r0
        }

        public java.lang.String getDescriptor() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "("
                r0.<init>(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r3.parameterTypes
                java.util.Iterator r1 = r1.iterator()
            Ld:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L21
                java.lang.Object r2 = r1.next()
                net.bytebuddy.description.type.TypeDescription r2 = (net.bytebuddy.description.type.TypeDescription) r2
                java.lang.String r2 = r2.getDescriptor()
                r0.append(r2)
                goto Ld
            L21:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r3.returnType
                java.lang.String r1 = r1.getDescriptor()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        public net.bytebuddy.description.type.TypeList getParameterTypes() {
                r2 = this;
                net.bytebuddy.description.type.TypeList$Explicit r0 = new net.bytebuddy.description.type.TypeList$Explicit
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r2.parameterTypes
                r0.<init>(r1)
                return r0
        }

        public net.bytebuddy.description.type.TypeDescription getReturnType() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.returnType
                return r0
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                r1 = this;
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_TYPE
                net.bytebuddy.description.type.TypeDescription r0 = r0.getTypeStub()
                return r0
        }

        public int hashCode() {
                r2 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r2.returnType
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r2.parameterTypes
                int r1 = r1.hashCode()
                int r0 = r0 + r1
                return r0
        }

        @Override // net.bytebuddy.utility.JavaConstant
        public java.lang.Object toDescription() {
                r4 = this;
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r0 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r4.parameterTypes
                int r1 = r1.size()
                java.lang.Object[] r0 = r0.toArray(r1)
                r1 = 0
            Ld:
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r2 = r4.parameterTypes
                int r2 = r2.size()
                if (r1 >= r2) goto L2c
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r2 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r3 = r4.parameterTypes
                java.lang.Object r3 = r3.get(r1)
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                java.lang.String r3 = r3.getDescriptor()
                java.lang.Object r2 = r2.ofDescriptor(r3)
                r0[r1] = r2
                int r1 = r1 + 1
                goto Ld
            L2c:
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodTypeDesc r1 = net.bytebuddy.utility.JavaConstant.Simple.METHOD_TYPE_DESC
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r2 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                net.bytebuddy.description.type.TypeDescription r3 = r4.returnType
                java.lang.String r3 = r3.getDescriptor()
                java.lang.Object r2 = r2.ofDescriptor(r3)
                java.lang.Object r0 = r1.of(r2, r0)
                return r0
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.constant.JavaConstantValue r0 = new net.bytebuddy.implementation.bytecode.constant.JavaConstantValue
                r0.<init>(r1)
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r1 = 40
                r0.append(r1)
                java.util.List<? extends net.bytebuddy.description.type.TypeDescription> r1 = r5.parameterTypes
                java.util.Iterator r1 = r1.iterator()
                r2 = 1
            L11:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L2e
                java.lang.Object r3 = r1.next()
                net.bytebuddy.description.type.TypeDescription r3 = (net.bytebuddy.description.type.TypeDescription) r3
                if (r2 == 0) goto L21
                r2 = 0
                goto L26
            L21:
                r4 = 44
                r0.append(r4)
            L26:
                java.lang.String r3 = r3.getSimpleName()
                r0.append(r3)
                goto L11
            L2e:
                r1 = 41
                r0.append(r1)
                net.bytebuddy.description.type.TypeDescription r1 = r5.returnType
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public static abstract class Simple<T> implements net.bytebuddy.utility.JavaConstant {
        private static final boolean ACCESS_CONTROLLER = false;
        protected static final net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfClassDesc CLASS_DESC = null;
        protected static final net.bytebuddy.utility.JavaConstant.Simple.Dispatcher CONSTANT_DESC = null;
        protected static final net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfDirectMethodHandleDesc DIRECT_METHOD_HANDLE_DESC = null;
        protected static final net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfDirectMethodHandleDesc.ForKind DIRECT_METHOD_HANDLE_DESC_KIND = null;
        protected static final net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfDynamicConstantDesc DYNAMIC_CONSTANT_DESC = null;
        protected static final net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfMethodHandleDesc METHOD_HANDLE_DESC = null;
        protected static final net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfMethodTypeDesc METHOD_TYPE_DESC = null;
        private final net.bytebuddy.description.type.TypeDescription typeDescription;
        protected final T value;

        @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.ConstantDesc")
        public interface Dispatcher {

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.ClassDesc")
            public interface OfClassDesc extends net.bytebuddy.utility.JavaConstant.Simple.Dispatcher {
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("descriptorString")
                java.lang.String descriptorString(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("ofDescriptor")
                java.lang.Object ofDescriptor(java.lang.String r1);
            }

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.DirectMethodHandleDesc")
            public interface OfDirectMethodHandleDesc extends net.bytebuddy.utility.JavaConstant.Simple.Dispatcher {

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.DirectMethodHandleDesc$Kind")
                public interface ForKind {
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
                    @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("valueOf")
                    java.lang.Object valueOf(int r1, boolean r2);
                }

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("lookupDescriptor")
                java.lang.String lookupDescriptor(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("methodName")
                java.lang.String methodName(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("owner")
                java.lang.Object owner(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("refKind")
                int refKind(java.lang.Object r1);
            }

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.DynamicConstantDesc")
            public interface OfDynamicConstantDesc extends net.bytebuddy.utility.JavaConstant.Simple.Dispatcher {
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("bootstrapArgs")
                java.lang.Object[] bootstrapArgs(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("bootstrapMethod")
                java.lang.Object bootstrapMethod(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("constantName")
                java.lang.String constantName(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("constantType")
                java.lang.Object constantType(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("ofCanonical")
                java.lang.Object ofCanonical(@net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.DirectMethodHandleDesc") java.lang.Object r1, java.lang.String r2, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.ClassDesc") java.lang.Object r3, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.ConstantDesc") java.lang.Object[] r4);
            }

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.MethodHandleDesc")
            public interface OfMethodHandleDesc extends net.bytebuddy.utility.JavaConstant.Simple.Dispatcher {
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("invocationType")
                java.lang.Object invocationType(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("of")
                java.lang.Object of(@net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.DirectMethodHandleDesc$Kind") java.lang.Object r1, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.ClassDesc") java.lang.Object r2, java.lang.String r3, java.lang.String r4);
            }

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.MethodTypeDesc")
            public interface OfMethodTypeDesc extends net.bytebuddy.utility.JavaConstant.Simple.Dispatcher {
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("of")
                java.lang.Object of(@net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.ClassDesc") java.lang.Object r1, @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("java.lang.constant.ClassDesc") java.lang.Object[] r2);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.IsStatic
                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("ofDescriptor")
                java.lang.Object ofDescriptor(java.lang.String r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("parameterArray")
                java.lang.Object[] parameterArray(java.lang.Object r1);

                @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("returnType")
                java.lang.Object returnType(java.lang.Object r1);
            }

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Instance
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("isInstance")
            boolean isInstance(java.lang.Object r1);

            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Container
            @net.bytebuddy.utility.dispatcher.JavaDispatcher.Proxied("toArray")
            java.lang.Object[] toArray(int r1);
        }

        public static abstract class OfTrivialValue<S> extends net.bytebuddy.utility.JavaConstant.Simple<S> {

            public static class ForDouble extends net.bytebuddy.utility.JavaConstant.Simple.OfTrivialValue<java.lang.Double> {
                public ForDouble(java.lang.Double r2) {
                        r1 = this;
                        java.lang.Class r0 = java.lang.Double.TYPE
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        r1.<init>(r2, r0)
                        return
                }

                @Override // net.bytebuddy.utility.ConstantValue
                public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation() {
                        r2 = this;
                        T r0 = r2.value
                        java.lang.Double r0 = (java.lang.Double) r0
                        double r0 = r0.doubleValue()
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.constant.DoubleConstant.forValue(r0)
                        return r0
                }
            }

            public static class ForFloat extends net.bytebuddy.utility.JavaConstant.Simple.OfTrivialValue<java.lang.Float> {
                public ForFloat(java.lang.Float r2) {
                        r1 = this;
                        java.lang.Class r0 = java.lang.Float.TYPE
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        r1.<init>(r2, r0)
                        return
                }

                @Override // net.bytebuddy.utility.ConstantValue
                public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation() {
                        r1 = this;
                        T r0 = r1.value
                        java.lang.Float r0 = (java.lang.Float) r0
                        float r0 = r0.floatValue()
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.constant.FloatConstant.forValue(r0)
                        return r0
                }
            }

            public static class ForInteger extends net.bytebuddy.utility.JavaConstant.Simple.OfTrivialValue<java.lang.Integer> {
                public ForInteger(java.lang.Integer r2) {
                        r1 = this;
                        java.lang.Class r0 = java.lang.Integer.TYPE
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        r1.<init>(r2, r0)
                        return
                }

                @Override // net.bytebuddy.utility.ConstantValue
                public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation() {
                        r1 = this;
                        T r0 = r1.value
                        java.lang.Integer r0 = (java.lang.Integer) r0
                        int r0 = r0.intValue()
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.constant.IntegerConstant.forValue(r0)
                        return r0
                }
            }

            public static class ForLong extends net.bytebuddy.utility.JavaConstant.Simple.OfTrivialValue<java.lang.Long> {
                public ForLong(java.lang.Long r2) {
                        r1 = this;
                        java.lang.Class r0 = java.lang.Long.TYPE
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        r1.<init>(r2, r0)
                        return
                }

                @Override // net.bytebuddy.utility.ConstantValue
                public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation() {
                        r2 = this;
                        T r0 = r2.value
                        java.lang.Long r0 = (java.lang.Long) r0
                        long r0 = r0.longValue()
                        net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.constant.LongConstant.forValue(r0)
                        return r0
                }
            }

            public static class ForString extends net.bytebuddy.utility.JavaConstant.Simple.OfTrivialValue<java.lang.String> {
                public ForString(java.lang.String r2) {
                        r1 = this;
                        java.lang.Class<java.lang.String> r0 = java.lang.String.class
                        net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                        r1.<init>(r2, r0)
                        return
                }

                @Override // net.bytebuddy.utility.ConstantValue
                public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation() {
                        r2 = this;
                        net.bytebuddy.implementation.bytecode.constant.TextConstant r0 = new net.bytebuddy.implementation.bytecode.constant.TextConstant
                        T r1 = r2.value
                        java.lang.String r1 = (java.lang.String) r1
                        r0.<init>(r1)
                        return r0
                }
            }

            public OfTrivialValue(S r1, net.bytebuddy.description.type.TypeDescription r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // net.bytebuddy.utility.JavaConstant
            public <T> T accept(net.bytebuddy.utility.JavaConstant.Visitor<T> r1) {
                    r0 = this;
                    java.lang.Object r1 = r1.onValue(r0)
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant
            public java.lang.Object toDescription() {
                    r1 = this;
                    T r0 = r1.value
                    return r0
            }
        }

        public static class OfTypeDescription extends net.bytebuddy.utility.JavaConstant.Simple<net.bytebuddy.description.type.TypeDescription> {
            public OfTypeDescription(net.bytebuddy.description.type.TypeDescription r2) {
                    r1 = this;
                    java.lang.Class<java.lang.Class> r0 = java.lang.Class.class
                    net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
                    r1.<init>(r2, r0)
                    return
            }

            @Override // net.bytebuddy.utility.JavaConstant
            public <T> T accept(net.bytebuddy.utility.JavaConstant.Visitor<T> r1) {
                    r0 = this;
                    java.lang.Object r1 = r1.onType(r0)
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant
            public java.lang.Object toDescription() {
                    r2 = this;
                    net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r0 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                    T r1 = r2.value
                    net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                    java.lang.String r1 = r1.getDescriptor()
                    java.lang.Object r0 = r0.ofDescriptor(r1)
                    return r0
            }

            @Override // net.bytebuddy.utility.ConstantValue
            public net.bytebuddy.implementation.bytecode.StackManipulation toStackManipulation() {
                    r1 = this;
                    T r0 = r1.value
                    net.bytebuddy.description.type.TypeDescription r0 = (net.bytebuddy.description.type.TypeDescription) r0
                    net.bytebuddy.implementation.bytecode.StackManipulation r0 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r0)
                    return r0
            }
        }

        static {
                r0 = 0
                java.lang.String r1 = "java.security.AccessController"
                r2 = 0
                java.lang.Class.forName(r1, r0, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                java.lang.String r1 = "net.bytebuddy.securitymanager"
                java.lang.String r2 = "true"
                java.lang.String r1 = java.lang.System.getProperty(r1, r2)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                boolean r1 = java.lang.Boolean.parseBoolean(r1)     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                net.bytebuddy.utility.JavaConstant.Simple.ACCESS_CONTROLLER = r1     // Catch: java.lang.SecurityException -> L16 java.lang.ClassNotFoundException -> L17
                goto L19
            L16:
                r0 = 1
            L17:
                net.bytebuddy.utility.JavaConstant.Simple.ACCESS_CONTROLLER = r0
            L19:
                java.lang.Class<net.bytebuddy.utility.JavaConstant$Simple$Dispatcher> r0 = net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher r0 = (net.bytebuddy.utility.JavaConstant.Simple.Dispatcher) r0
                net.bytebuddy.utility.JavaConstant.Simple.CONSTANT_DESC = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc> r0 = net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfClassDesc.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r0 = (net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfClassDesc) r0
                net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodTypeDesc> r0 = net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfMethodTypeDesc.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodTypeDesc r0 = (net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfMethodTypeDesc) r0
                net.bytebuddy.utility.JavaConstant.Simple.METHOD_TYPE_DESC = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodHandleDesc> r0 = net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfMethodHandleDesc.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodHandleDesc r0 = (net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfMethodHandleDesc) r0
                net.bytebuddy.utility.JavaConstant.Simple.METHOD_HANDLE_DESC = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc> r0 = net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfDirectMethodHandleDesc.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc r0 = (net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfDirectMethodHandleDesc) r0
                net.bytebuddy.utility.JavaConstant.Simple.DIRECT_METHOD_HANDLE_DESC = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind> r0 = net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfDirectMethodHandleDesc.ForKind.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc$ForKind r0 = (net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfDirectMethodHandleDesc.ForKind) r0
                net.bytebuddy.utility.JavaConstant.Simple.DIRECT_METHOD_HANDLE_DESC_KIND = r0
                java.lang.Class<net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc> r0 = net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfDynamicConstantDesc.class
                java.security.PrivilegedAction r0 = net.bytebuddy.utility.dispatcher.JavaDispatcher.of(r0)
                java.lang.Object r0 = doPrivileged(r0)
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc r0 = (net.bytebuddy.utility.JavaConstant.Simple.Dispatcher.OfDynamicConstantDesc) r0
                net.bytebuddy.utility.JavaConstant.Simple.DYNAMIC_CONSTANT_DESC = r0
                return
        }

        public Simple(T r1, net.bytebuddy.description.type.TypeDescription r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.typeDescription = r2
                return
        }

        @net.bytebuddy.build.AccessControllerPlugin.Enhance
        private static <T> T doPrivileged(java.security.PrivilegedAction<T> r1) {
                boolean r0 = net.bytebuddy.utility.JavaConstant.Simple.ACCESS_CONTROLLER
                if (r0 == 0) goto L9
                java.lang.Object r1 = java.security.AccessController.doPrivileged(r1)
                return r1
            L9:
                java.lang.Object r1 = r1.run()
                return r1
        }

        public static net.bytebuddy.utility.JavaConstant of(net.bytebuddy.description.type.TypeDescription r3) {
                boolean r0 = r3.isPrimitive()
                if (r0 != 0) goto Lc
                net.bytebuddy.utility.JavaConstant$Simple$OfTypeDescription r0 = new net.bytebuddy.utility.JavaConstant$Simple$OfTypeDescription
                r0.<init>(r3)
                return r0
            Lc:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "A primitive type cannot be represented as a type constant: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        public static net.bytebuddy.utility.JavaConstant ofDescription(java.lang.Object r0, @net.bytebuddy.utility.nullability.MaybeNull java.lang.ClassLoader r1) {
                net.bytebuddy.dynamic.ClassFileLocator r1 = net.bytebuddy.dynamic.ClassFileLocator.ForClassLoader.of(r1)
                net.bytebuddy.utility.JavaConstant r0 = ofDescription(r0, r1)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant ofDescription(java.lang.Object r0, net.bytebuddy.dynamic.ClassFileLocator r1) {
                net.bytebuddy.pool.TypePool r1 = net.bytebuddy.pool.TypePool.Default.WithLazyResolution.of(r1)
                net.bytebuddy.utility.JavaConstant r0 = ofDescription(r0, r1)
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant ofDescription(java.lang.Object r16, net.bytebuddy.pool.TypePool r17) {
                r0 = r16
                r1 = r17
                boolean r2 = r0 instanceof java.lang.Integer
                if (r2 == 0) goto L10
                net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForInteger r1 = new net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForInteger
                java.lang.Integer r0 = (java.lang.Integer) r0
                r1.<init>(r0)
                return r1
            L10:
                boolean r2 = r0 instanceof java.lang.Long
                if (r2 == 0) goto L1c
                net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForLong r1 = new net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForLong
                java.lang.Long r0 = (java.lang.Long) r0
                r1.<init>(r0)
                return r1
            L1c:
                boolean r2 = r0 instanceof java.lang.Float
                if (r2 == 0) goto L28
                net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForFloat r1 = new net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForFloat
                java.lang.Float r0 = (java.lang.Float) r0
                r1.<init>(r0)
                return r1
            L28:
                boolean r2 = r0 instanceof java.lang.Double
                if (r2 == 0) goto L34
                net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForDouble r1 = new net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForDouble
                java.lang.Double r0 = (java.lang.Double) r0
                r1.<init>(r0)
                return r1
            L34:
                boolean r2 = r0 instanceof java.lang.String
                if (r2 == 0) goto L40
                net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForString r1 = new net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForString
                java.lang.String r0 = (java.lang.String) r0
                r1.<init>(r0)
                return r1
            L40:
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r2 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                boolean r3 = r2.isInstance(r0)
                r4 = 46
                r5 = 47
                r6 = 9
                if (r3 == 0) goto L76
                java.lang.String r0 = r2.descriptorString(r0)
                net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r0)
                int r2 = r0.getSort()
                if (r2 != r6) goto L65
                java.lang.String r0 = r0.getInternalName()
                java.lang.String r0 = r0.replace(r5, r4)
                goto L69
            L65:
                java.lang.String r0 = r0.getClassName()
            L69:
                net.bytebuddy.pool.TypePool$Resolution r0 = r1.describe(r0)
                net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                net.bytebuddy.utility.JavaConstant r0 = of(r0)
                return r0
            L76:
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodTypeDesc r2 = net.bytebuddy.utility.JavaConstant.Simple.METHOD_TYPE_DESC
                boolean r3 = r2.isInstance(r0)
                r7 = 0
                if (r3 == 0) goto Le9
                java.lang.Object[] r2 = r2.parameterArray(r0)
                java.util.ArrayList r3 = new java.util.ArrayList
                int r8 = r2.length
                r3.<init>(r8)
                int r8 = r2.length
            L8a:
                if (r7 >= r8) goto Lb9
                r9 = r2[r7]
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r10 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                java.lang.String r9 = r10.descriptorString(r9)
                net.bytebuddy.jar.asm.Type r9 = net.bytebuddy.jar.asm.Type.getType(r9)
                int r10 = r9.getSort()
                if (r10 != r6) goto La7
                java.lang.String r9 = r9.getInternalName()
                java.lang.String r9 = r9.replace(r5, r4)
                goto Lab
            La7:
                java.lang.String r9 = r9.getClassName()
            Lab:
                net.bytebuddy.pool.TypePool$Resolution r9 = r1.describe(r9)
                net.bytebuddy.description.type.TypeDescription r9 = r9.resolve()
                r3.add(r9)
                int r7 = r7 + 1
                goto L8a
            Lb9:
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r2 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodTypeDesc r7 = net.bytebuddy.utility.JavaConstant.Simple.METHOD_TYPE_DESC
                java.lang.Object r0 = r7.returnType(r0)
                java.lang.String r0 = r2.descriptorString(r0)
                net.bytebuddy.jar.asm.Type r0 = net.bytebuddy.jar.asm.Type.getType(r0)
                int r2 = r0.getSort()
                if (r2 != r6) goto Ld8
                java.lang.String r0 = r0.getInternalName()
                java.lang.String r0 = r0.replace(r5, r4)
                goto Ldc
            Ld8:
                java.lang.String r0 = r0.getClassName()
            Ldc:
                net.bytebuddy.pool.TypePool$Resolution r0 = r1.describe(r0)
                net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                net.bytebuddy.utility.JavaConstant$MethodType r0 = net.bytebuddy.utility.JavaConstant.MethodType.of(r0, r3)
                return r0
            Le9:
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc r3 = net.bytebuddy.utility.JavaConstant.Simple.DIRECT_METHOD_HANDLE_DESC
                boolean r8 = r3.isInstance(r0)
                if (r8 == 0) goto L1a0
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodHandleDesc r3 = net.bytebuddy.utility.JavaConstant.Simple.METHOD_HANDLE_DESC
                java.lang.Object r3 = r3.invocationType(r0)
                java.lang.Object[] r2 = r2.parameterArray(r3)
                java.util.ArrayList r13 = new java.util.ArrayList
                int r3 = r2.length
                r13.<init>(r3)
                int r3 = r2.length
            L102:
                if (r7 >= r3) goto L131
                r8 = r2[r7]
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r9 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                java.lang.String r8 = r9.descriptorString(r8)
                net.bytebuddy.jar.asm.Type r8 = net.bytebuddy.jar.asm.Type.getType(r8)
                int r9 = r8.getSort()
                if (r9 != r6) goto L11f
                java.lang.String r8 = r8.getInternalName()
                java.lang.String r8 = r8.replace(r5, r4)
                goto L123
            L11f:
                java.lang.String r8 = r8.getClassName()
            L123:
                net.bytebuddy.pool.TypePool$Resolution r8 = r1.describe(r8)
                net.bytebuddy.description.type.TypeDescription r8 = r8.resolve()
                r13.add(r8)
                int r7 = r7 + 1
                goto L102
            L131:
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r2 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodTypeDesc r3 = net.bytebuddy.utility.JavaConstant.Simple.METHOD_TYPE_DESC
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfMethodHandleDesc r7 = net.bytebuddy.utility.JavaConstant.Simple.METHOD_HANDLE_DESC
                java.lang.Object r7 = r7.invocationType(r0)
                java.lang.Object r3 = r3.returnType(r7)
                java.lang.String r3 = r2.descriptorString(r3)
                net.bytebuddy.jar.asm.Type r3 = net.bytebuddy.jar.asm.Type.getType(r3)
                net.bytebuddy.utility.JavaConstant$MethodHandle r7 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc r8 = net.bytebuddy.utility.JavaConstant.Simple.DIRECT_METHOD_HANDLE_DESC
                int r9 = r8.refKind(r0)
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r9 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.of(r9)
                java.lang.Object r10 = r8.owner(r0)
                java.lang.String r2 = r2.descriptorString(r10)
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getType(r2)
                java.lang.String r2 = r2.getClassName()
                net.bytebuddy.pool.TypePool$Resolution r2 = r1.describe(r2)
                net.bytebuddy.description.type.TypeDescription r10 = r2.resolve()
                java.lang.String r11 = r8.methodName(r0)
                int r0 = r8.refKind(r0)
                r2 = 8
                if (r0 != r2) goto L17f
                java.lang.Class r0 = java.lang.Void.TYPE
                net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            L17d:
                r12 = r0
                goto L19b
            L17f:
                int r0 = r3.getSort()
                if (r0 != r6) goto L18e
                java.lang.String r0 = r3.getInternalName()
                java.lang.String r0 = r0.replace(r5, r4)
                goto L192
            L18e:
                java.lang.String r0 = r3.getClassName()
            L192:
                net.bytebuddy.pool.TypePool$Resolution r0 = r1.describe(r0)
                net.bytebuddy.description.type.TypeDescription r0 = r0.resolve()
                goto L17d
            L19b:
                r8 = r7
                r8.<init>(r9, r10, r11, r12, r13)
                return r7
            L1a0:
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc r2 = net.bytebuddy.utility.JavaConstant.Simple.DYNAMIC_CONSTANT_DESC
                boolean r8 = r2.isInstance(r0)
                if (r8 == 0) goto L2a0
                java.lang.Object r2 = r2.bootstrapMethod(r0)
                java.lang.String r2 = r3.lookupDescriptor(r2)
                net.bytebuddy.jar.asm.Type r2 = net.bytebuddy.jar.asm.Type.getMethodType(r2)
                java.util.ArrayList r13 = new java.util.ArrayList
                net.bytebuddy.jar.asm.Type[] r3 = r2.getArgumentTypes()
                int r3 = r3.length
                r13.<init>(r3)
                net.bytebuddy.jar.asm.Type[] r3 = r2.getArgumentTypes()
                int r8 = r3.length
                r9 = r7
            L1c4:
                if (r9 >= r8) goto L1e9
                r10 = r3[r9]
                int r11 = r10.getSort()
                if (r11 != r6) goto L1d7
                java.lang.String r10 = r10.getInternalName()
                java.lang.String r10 = r10.replace(r5, r4)
                goto L1db
            L1d7:
                java.lang.String r10 = r10.getClassName()
            L1db:
                net.bytebuddy.pool.TypePool$Resolution r10 = r1.describe(r10)
                net.bytebuddy.description.type.TypeDescription r10 = r10.resolve()
                r13.add(r10)
                int r9 = r9 + 1
                goto L1c4
            L1e9:
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc r3 = net.bytebuddy.utility.JavaConstant.Simple.DYNAMIC_CONSTANT_DESC
                java.lang.Object[] r3 = r3.bootstrapArgs(r0)
                java.util.ArrayList r14 = new java.util.ArrayList
                int r8 = r3.length
                r14.<init>(r8)
                int r8 = r3.length
            L1f6:
                if (r7 >= r8) goto L204
                r9 = r3[r7]
                net.bytebuddy.utility.JavaConstant r9 = ofDescription(r9, r1)
                r14.add(r9)
                int r7 = r7 + 1
                goto L1f6
            L204:
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfClassDesc r3 = net.bytebuddy.utility.JavaConstant.Simple.CLASS_DESC
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDynamicConstantDesc r7 = net.bytebuddy.utility.JavaConstant.Simple.DYNAMIC_CONSTANT_DESC
                java.lang.Object r8 = r7.constantType(r0)
                java.lang.String r8 = r3.descriptorString(r8)
                net.bytebuddy.jar.asm.Type r8 = net.bytebuddy.jar.asm.Type.getType(r8)
                net.bytebuddy.utility.JavaConstant$Dynamic r15 = new net.bytebuddy.utility.JavaConstant$Dynamic
                java.lang.String r12 = r7.constantName(r0)
                int r9 = r8.getSort()
                if (r9 != r6) goto L229
                java.lang.String r8 = r8.getInternalName()
                java.lang.String r8 = r8.replace(r5, r4)
                goto L22d
            L229:
                java.lang.String r8 = r8.getClassName()
            L22d:
                net.bytebuddy.pool.TypePool$Resolution r8 = r1.describe(r8)
                net.bytebuddy.description.type.TypeDescription r11 = r8.resolve()
                net.bytebuddy.utility.JavaConstant$MethodHandle r10 = new net.bytebuddy.utility.JavaConstant$MethodHandle
                net.bytebuddy.utility.JavaConstant$Simple$Dispatcher$OfDirectMethodHandleDesc r8 = net.bytebuddy.utility.JavaConstant.Simple.DIRECT_METHOD_HANDLE_DESC
                java.lang.Object r9 = r7.bootstrapMethod(r0)
                int r9 = r8.refKind(r9)
                net.bytebuddy.utility.JavaConstant$MethodHandle$HandleType r9 = net.bytebuddy.utility.JavaConstant.MethodHandle.HandleType.of(r9)
                java.lang.Object r4 = r7.bootstrapMethod(r0)
                java.lang.Object r4 = r8.owner(r4)
                java.lang.String r3 = r3.descriptorString(r4)
                net.bytebuddy.jar.asm.Type r3 = net.bytebuddy.jar.asm.Type.getType(r3)
                java.lang.String r3 = r3.getClassName()
                net.bytebuddy.pool.TypePool$Resolution r3 = r1.describe(r3)
                net.bytebuddy.description.type.TypeDescription r3 = r3.resolve()
                java.lang.Object r0 = r7.bootstrapMethod(r0)
                java.lang.String r0 = r8.methodName(r0)
                net.bytebuddy.jar.asm.Type r4 = r2.getReturnType()
                int r4 = r4.getSort()
                if (r4 != r6) goto L282
                net.bytebuddy.jar.asm.Type r2 = r2.getReturnType()
                java.lang.String r2 = r2.getInternalName()
                r4 = 46
                java.lang.String r2 = r2.replace(r5, r4)
                goto L28a
            L282:
                net.bytebuddy.jar.asm.Type r2 = r2.getReturnType()
                java.lang.String r2 = r2.getClassName()
            L28a:
                net.bytebuddy.pool.TypePool$Resolution r1 = r1.describe(r2)
                net.bytebuddy.description.type.TypeDescription r1 = r1.resolve()
                r8 = r10
                r2 = r10
                r10 = r3
                r3 = r11
                r11 = r0
                r0 = r12
                r12 = r1
                r8.<init>(r9, r10, r11, r12, r13)
                r15.<init>(r0, r3, r2, r14)
                return r15
            L2a0:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = "Not a resolvable constant description or not expressible as a constant pool value: "
                r2.append(r3)
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
        }

        public static net.bytebuddy.utility.JavaConstant ofLoaded(java.lang.Object r3) {
                net.bytebuddy.utility.JavaConstant r0 = ofLoadedOrNull(r3)
                if (r0 == 0) goto L7
                return r0
            L7:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Not a constant: "
                r1.append(r2)
                r1.append(r3)
                java.lang.String r3 = r1.toString()
                r0.<init>(r3)
                throw r0
        }

        @net.bytebuddy.utility.nullability.MaybeNull
        public static net.bytebuddy.utility.JavaConstant ofLoadedOrNull(java.lang.Object r1) {
                boolean r0 = r1 instanceof java.lang.Integer
                if (r0 == 0) goto Lc
                net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForInteger r0 = new net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForInteger
                java.lang.Integer r1 = (java.lang.Integer) r1
                r0.<init>(r1)
                return r0
            Lc:
                boolean r0 = r1 instanceof java.lang.Long
                if (r0 == 0) goto L18
                net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForLong r0 = new net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForLong
                java.lang.Long r1 = (java.lang.Long) r1
                r0.<init>(r1)
                return r0
            L18:
                boolean r0 = r1 instanceof java.lang.Float
                if (r0 == 0) goto L24
                net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForFloat r0 = new net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForFloat
                java.lang.Float r1 = (java.lang.Float) r1
                r0.<init>(r1)
                return r0
            L24:
                boolean r0 = r1 instanceof java.lang.Double
                if (r0 == 0) goto L30
                net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForDouble r0 = new net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForDouble
                java.lang.Double r1 = (java.lang.Double) r1
                r0.<init>(r1)
                return r0
            L30:
                boolean r0 = r1 instanceof java.lang.String
                if (r0 == 0) goto L3c
                net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForString r0 = new net.bytebuddy.utility.JavaConstant$Simple$OfTrivialValue$ForString
                java.lang.String r1 = (java.lang.String) r1
                r0.<init>(r1)
                return r0
            L3c:
                boolean r0 = r1 instanceof java.lang.Class
                if (r0 == 0) goto L4b
                java.lang.Class r1 = (java.lang.Class) r1
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
                net.bytebuddy.utility.JavaConstant r1 = of(r1)
                return r1
            L4b:
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_HANDLE
                boolean r0 = r0.isInstance(r1)
                if (r0 == 0) goto L58
                net.bytebuddy.utility.JavaConstant$MethodHandle r1 = net.bytebuddy.utility.JavaConstant.MethodHandle.ofLoaded(r1)
                return r1
            L58:
                net.bytebuddy.utility.JavaType r0 = net.bytebuddy.utility.JavaType.METHOD_TYPE
                boolean r0 = r0.isInstance(r1)
                if (r0 == 0) goto L65
                net.bytebuddy.utility.JavaConstant$MethodType r1 = net.bytebuddy.utility.JavaConstant.MethodType.ofLoaded(r1)
                return r1
            L65:
                r1 = 0
                return r1
        }

        public static java.util.List<net.bytebuddy.utility.JavaConstant> wrap(java.util.List<?> r2) {
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r2.size()
                r0.<init>(r1)
                java.util.Iterator r2 = r2.iterator()
            Ld:
                boolean r1 = r2.hasNext()
                if (r1 == 0) goto L1f
                java.lang.Object r1 = r2.next()
                net.bytebuddy.utility.JavaConstant r1 = wrap(r1)
                r0.add(r1)
                goto Ld
            L1f:
                return r0
        }

        public static net.bytebuddy.utility.JavaConstant wrap(java.lang.Object r1) {
                boolean r0 = r1 instanceof net.bytebuddy.utility.JavaConstant
                if (r0 == 0) goto L7
                net.bytebuddy.utility.JavaConstant r1 = (net.bytebuddy.utility.JavaConstant) r1
                return r1
            L7:
                boolean r0 = r1 instanceof net.bytebuddy.description.type.TypeDescription
                if (r0 == 0) goto L12
                net.bytebuddy.description.type.TypeDescription r1 = (net.bytebuddy.description.type.TypeDescription) r1
                net.bytebuddy.utility.JavaConstant r1 = of(r1)
                return r1
            L12:
                net.bytebuddy.utility.JavaConstant r1 = ofLoaded(r1)
                return r1
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
                T r0 = r2.value
                net.bytebuddy.utility.JavaConstant$Simple r3 = (net.bytebuddy.utility.JavaConstant.Simple) r3
                T r3 = r3.value
                boolean r3 = r0.equals(r3)
                return r3
            L1c:
                r3 = 0
                return r3
        }

        @Override // net.bytebuddy.utility.ConstantValue
        public net.bytebuddy.description.type.TypeDescription getTypeDescription() {
                r1 = this;
                net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
                return r0
        }

        public T getValue() {
                r1 = this;
                T r0 = r1.value
                return r0
        }

        public int hashCode() {
                r1 = this;
                T r0 = r1.value
                int r0 = r0.hashCode()
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                T r0 = r1.value
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public interface Visitor<T> {

        public enum NoOp extends java.lang.Enum<net.bytebuddy.utility.JavaConstant.Visitor.NoOp> implements net.bytebuddy.utility.JavaConstant.Visitor<net.bytebuddy.utility.JavaConstant> {
            private static final /* synthetic */ net.bytebuddy.utility.JavaConstant.Visitor.NoOp[] $VALUES = null;
            public static final net.bytebuddy.utility.JavaConstant.Visitor.NoOp INSTANCE = null;

            static {
                    net.bytebuddy.utility.JavaConstant$Visitor$NoOp r0 = new net.bytebuddy.utility.JavaConstant$Visitor$NoOp
                    java.lang.String r1 = "INSTANCE"
                    r2 = 0
                    r0.<init>(r1, r2)
                    net.bytebuddy.utility.JavaConstant.Visitor.NoOp.INSTANCE = r0
                    net.bytebuddy.utility.JavaConstant$Visitor$NoOp[] r0 = new net.bytebuddy.utility.JavaConstant.Visitor.NoOp[]{r0}
                    net.bytebuddy.utility.JavaConstant.Visitor.NoOp.$VALUES = r0
                    return
            }

            NoOp(java.lang.String r1, int r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            public static net.bytebuddy.utility.JavaConstant.Visitor.NoOp valueOf(java.lang.String r1) {
                    java.lang.Class<net.bytebuddy.utility.JavaConstant$Visitor$NoOp> r0 = net.bytebuddy.utility.JavaConstant.Visitor.NoOp.class
                    java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                    net.bytebuddy.utility.JavaConstant$Visitor$NoOp r1 = (net.bytebuddy.utility.JavaConstant.Visitor.NoOp) r1
                    return r1
            }

            public static net.bytebuddy.utility.JavaConstant.Visitor.NoOp[] values() {
                    net.bytebuddy.utility.JavaConstant$Visitor$NoOp[] r0 = net.bytebuddy.utility.JavaConstant.Visitor.NoOp.$VALUES
                    java.lang.Object r0 = r0.clone()
                    net.bytebuddy.utility.JavaConstant$Visitor$NoOp[] r0 = (net.bytebuddy.utility.JavaConstant.Visitor.NoOp[]) r0
                    return r0
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            public /* bridge */ /* synthetic */ net.bytebuddy.utility.JavaConstant onDynamic(net.bytebuddy.utility.JavaConstant.Dynamic r1) {
                    r0 = this;
                    net.bytebuddy.utility.JavaConstant r1 = r0.onDynamic2(r1)
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            /* JADX INFO: renamed from: onDynamic, reason: avoid collision after fix types in other method */
            public net.bytebuddy.utility.JavaConstant onDynamic2(net.bytebuddy.utility.JavaConstant.Dynamic r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            public /* bridge */ /* synthetic */ net.bytebuddy.utility.JavaConstant onMethodHandle(net.bytebuddy.utility.JavaConstant.MethodHandle r1) {
                    r0 = this;
                    net.bytebuddy.utility.JavaConstant r1 = r0.onMethodHandle2(r1)
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            /* JADX INFO: renamed from: onMethodHandle, reason: avoid collision after fix types in other method */
            public net.bytebuddy.utility.JavaConstant onMethodHandle2(net.bytebuddy.utility.JavaConstant.MethodHandle r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            public /* bridge */ /* synthetic */ net.bytebuddy.utility.JavaConstant onMethodType(net.bytebuddy.utility.JavaConstant.MethodType r1) {
                    r0 = this;
                    net.bytebuddy.utility.JavaConstant r1 = r0.onMethodType2(r1)
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            /* JADX INFO: renamed from: onMethodType, reason: avoid collision after fix types in other method */
            public net.bytebuddy.utility.JavaConstant onMethodType2(net.bytebuddy.utility.JavaConstant.MethodType r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            public /* bridge */ /* synthetic */ net.bytebuddy.utility.JavaConstant onType(net.bytebuddy.utility.JavaConstant.Simple r1) {
                    r0 = this;
                    net.bytebuddy.utility.JavaConstant r1 = r0.onType2(r1)
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            /* JADX INFO: renamed from: onType, reason: avoid collision after fix types in other method */
            public net.bytebuddy.utility.JavaConstant onType2(net.bytebuddy.utility.JavaConstant.Simple<net.bytebuddy.description.type.TypeDescription> r1) {
                    r0 = this;
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            public /* bridge */ /* synthetic */ net.bytebuddy.utility.JavaConstant onValue(net.bytebuddy.utility.JavaConstant.Simple r1) {
                    r0 = this;
                    net.bytebuddy.utility.JavaConstant r1 = r0.onValue2(r1)
                    return r1
            }

            @Override // net.bytebuddy.utility.JavaConstant.Visitor
            /* JADX INFO: renamed from: onValue, reason: avoid collision after fix types in other method */
            public net.bytebuddy.utility.JavaConstant onValue2(net.bytebuddy.utility.JavaConstant.Simple<?> r1) {
                    r0 = this;
                    return r1
            }
        }

        T onDynamic(net.bytebuddy.utility.JavaConstant.Dynamic r1);

        T onMethodHandle(net.bytebuddy.utility.JavaConstant.MethodHandle r1);

        T onMethodType(net.bytebuddy.utility.JavaConstant.MethodType r1);

        T onType(net.bytebuddy.utility.JavaConstant.Simple<net.bytebuddy.description.type.TypeDescription> r1);

        T onValue(net.bytebuddy.utility.JavaConstant.Simple<?> r1);
    }

    <T> T accept(net.bytebuddy.utility.JavaConstant.Visitor<T> r1);

    java.lang.Object toDescription();
}
