package net.bytebuddy.utility;

/* JADX INFO: loaded from: classes2.dex */
public enum JavaType extends java.lang.Enum<net.bytebuddy.utility.JavaType> {
    private static final /* synthetic */ net.bytebuddy.utility.JavaType[] $VALUES = null;
    public static final net.bytebuddy.utility.JavaType ACCESS_CONTROL_CONTEXT = null;
    public static final net.bytebuddy.utility.JavaType CALL_SITE = null;
    public static final net.bytebuddy.utility.JavaType CLASS_DESCRIPTION = null;
    public static final net.bytebuddy.utility.JavaType CONSTABLE = null;
    public static final net.bytebuddy.utility.JavaType CONSTANT_BOOTSTRAPS = null;
    public static final net.bytebuddy.utility.JavaType CONSTANT_DESCRIPTION = null;
    public static final net.bytebuddy.utility.JavaType DIRECT_METHOD_HANDLE_DESCRIPTION = null;
    public static final net.bytebuddy.utility.JavaType DYNAMIC_CONSTANT_DESCRIPTION = null;
    public static final net.bytebuddy.utility.JavaType EXECUTABLE = null;
    public static final net.bytebuddy.utility.JavaType METHOD_HANDLE = null;
    public static final net.bytebuddy.utility.JavaType METHOD_HANDLES = null;
    public static final net.bytebuddy.utility.JavaType METHOD_HANDLES_LOOKUP = null;
    public static final net.bytebuddy.utility.JavaType METHOD_HANDLE_DESCRIPTION = null;
    public static final net.bytebuddy.utility.JavaType METHOD_TYPE = null;
    public static final net.bytebuddy.utility.JavaType METHOD_TYPE_DESCRIPTION = null;
    public static final net.bytebuddy.utility.JavaType MODULE = null;
    public static final net.bytebuddy.utility.JavaType OBJECT_METHODS = null;
    public static final net.bytebuddy.utility.JavaType PARAMETER = null;
    public static final net.bytebuddy.utility.JavaType RECORD = null;
    public static final net.bytebuddy.utility.JavaType TYPE_DESCRIPTOR = null;
    public static final net.bytebuddy.utility.JavaType TYPE_DESCRIPTOR_OF_FIELD = null;
    public static final net.bytebuddy.utility.JavaType TYPE_DESCRIPTOR_OF_METHOD = null;
    public static final net.bytebuddy.utility.JavaType VAR_HANDLE = null;
    private transient /* synthetic */ java.lang.Boolean available;
    private transient /* synthetic */ java.lang.Class loaded;
    private final net.bytebuddy.description.type.TypeDescription typeDescription;

    public static class LatentTypeWithSimpleName extends net.bytebuddy.description.type.TypeDescription.Latent {
        public LatentTypeWithSimpleName(java.lang.String r1, int r2, @net.bytebuddy.utility.nullability.MaybeNull net.bytebuddy.description.type.TypeDescription.Generic r3, java.util.List<? extends net.bytebuddy.description.type.TypeDescription.Generic> r4) {
                r0 = this;
                r0.<init>(r1, r2, r3, r4)
                return
        }

        @Override // net.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType, net.bytebuddy.description.type.TypeDescription
        public java.lang.String getSimpleName() {
                r3 = this;
                java.lang.String r0 = r3.getName()
                r1 = 36
                int r1 = r0.lastIndexOf(r1)
                r2 = 46
                int r2 = r0.lastIndexOf(r2)
                int r1 = java.lang.Math.max(r1, r2)
                r2 = -1
                if (r1 != r2) goto L18
                goto L1e
            L18:
                int r1 = r1 + 1
                java.lang.String r0 = r0.substring(r1)
            L1e:
                return r0
        }
    }

    static {
            r0 = 2
            r1 = 1
            r2 = 0
            net.bytebuddy.utility.JavaType r26 = new net.bytebuddy.utility.JavaType
            r10 = r26
            net.bytebuddy.description.type.TypeDescription r33 = net.bytebuddy.description.type.TypeDescription.UNDEFINED
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r2]
            r5 = 0
            r7 = 1537(0x601, float:2.154E-42)
            java.lang.String r4 = "CONSTABLE"
            java.lang.String r6 = "java.lang.constant.Constable"
            r3 = r26
            r8 = r33
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.CONSTABLE = r26
            net.bytebuddy.utility.JavaType r14 = new net.bytebuddy.utility.JavaType
            r11 = r14
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r2]
            r5 = 1
            java.lang.String r4 = "TYPE_DESCRIPTOR"
            java.lang.String r6 = "java.lang.invoke.TypeDescriptor"
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.TYPE_DESCRIPTOR = r14
            net.bytebuddy.utility.JavaType r17 = new net.bytebuddy.utility.JavaType
            r12 = r17
            net.bytebuddy.description.type.TypeDescription r3 = r14.getTypeStub()
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r1]
            r9[r2] = r3
            r5 = 2
            java.lang.String r4 = "TYPE_DESCRIPTOR_OF_FIELD"
            java.lang.String r6 = "java.lang.invoke.TypeDescriptor$OfField"
            r3 = r17
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.TYPE_DESCRIPTOR_OF_FIELD = r17
            net.bytebuddy.utility.JavaType r23 = new net.bytebuddy.utility.JavaType
            r13 = r23
            net.bytebuddy.description.type.TypeDescription r3 = r14.getTypeStub()
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r1]
            r9[r2] = r3
            r5 = 3
            java.lang.String r4 = "TYPE_DESCRIPTOR_OF_METHOD"
            java.lang.String r6 = "java.lang.invoke.TypeDescriptor$OfMethod"
            r3 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.TYPE_DESCRIPTOR_OF_METHOD = r23
            net.bytebuddy.utility.JavaType r19 = new net.bytebuddy.utility.JavaType
            r14 = r19
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r2]
            r5 = 4
            java.lang.String r4 = "CONSTANT_DESCRIPTION"
            java.lang.String r6 = "java.lang.constant.ConstantDesc"
            r3 = r19
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.CONSTANT_DESCRIPTION = r19
            net.bytebuddy.utility.JavaType r3 = new net.bytebuddy.utility.JavaType
            r15 = r3
            java.lang.Class<java.lang.Object> r27 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription r39 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r27)
            net.bytebuddy.description.type.TypeDescription r4 = r19.getTypeStub()
            net.bytebuddy.description.type.TypeDefinition[] r5 = new net.bytebuddy.description.type.TypeDefinition[r1]
            r5[r2] = r4
            r36 = 5
            r38 = 1025(0x401, float:1.436E-42)
            java.lang.String r35 = "DYNAMIC_CONSTANT_DESCRIPTION"
            java.lang.String r37 = "java.lang.constant.DynamicConstantDesc"
            r34 = r3
            r40 = r5
            r34.<init>(r35, r36, r37, r38, r39, r40)
            net.bytebuddy.utility.JavaType.DYNAMIC_CONSTANT_DESCRIPTION = r3
            net.bytebuddy.utility.JavaType r18 = new net.bytebuddy.utility.JavaType
            r16 = r18
            net.bytebuddy.description.type.TypeDescription r3 = r19.getTypeStub()
            net.bytebuddy.description.type.TypeDescription r4 = r17.getTypeStub()
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r0]
            r9[r2] = r3
            r9[r1] = r4
            r5 = 6
            java.lang.String r4 = "CLASS_DESCRIPTION"
            java.lang.String r6 = "java.lang.constant.ClassDesc"
            r3 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.CLASS_DESCRIPTION = r18
            net.bytebuddy.utility.JavaType r18 = new net.bytebuddy.utility.JavaType
            r17 = r18
            net.bytebuddy.description.type.TypeDescription r3 = r19.getTypeStub()
            net.bytebuddy.description.type.TypeDescription r4 = r23.getTypeStub()
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r0]
            r9[r2] = r3
            r9[r1] = r4
            r5 = 7
            java.lang.String r4 = "METHOD_TYPE_DESCRIPTION"
            java.lang.String r6 = "java.lang.constant.MethodTypeDesc"
            r3 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.METHOD_TYPE_DESCRIPTION = r18
            net.bytebuddy.utility.JavaType r20 = new net.bytebuddy.utility.JavaType
            r18 = r20
            net.bytebuddy.description.type.TypeDescription r3 = r19.getTypeStub()
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r1]
            r9[r2] = r3
            r5 = 8
            java.lang.String r4 = "METHOD_HANDLE_DESCRIPTION"
            java.lang.String r6 = "java.lang.constant.MethodHandleDesc"
            r3 = r20
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.METHOD_HANDLE_DESCRIPTION = r20
            net.bytebuddy.utility.JavaType r21 = new net.bytebuddy.utility.JavaType
            r19 = r21
            net.bytebuddy.description.type.TypeDescription r3 = r20.getTypeStub()
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r1]
            r9[r2] = r3
            r5 = 9
            java.lang.String r4 = "DIRECT_METHOD_HANDLE_DESCRIPTION"
            java.lang.String r6 = "java.lang.constant.DirectMethodHandleDesc"
            r3 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.DIRECT_METHOD_HANDLE_DESCRIPTION = r21
            net.bytebuddy.utility.JavaType r3 = new net.bytebuddy.utility.JavaType
            r20 = r3
            net.bytebuddy.description.type.TypeDescription r39 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r27)
            net.bytebuddy.description.type.TypeDescription r4 = r26.getTypeStub()
            net.bytebuddy.description.type.TypeDefinition[] r5 = new net.bytebuddy.description.type.TypeDefinition[r1]
            r5[r2] = r4
            r36 = 10
            java.lang.String r35 = "METHOD_HANDLE"
            java.lang.String r37 = "java.lang.invoke.MethodHandle"
            r34 = r3
            r40 = r5
            r34.<init>(r35, r36, r37, r38, r39, r40)
            net.bytebuddy.utility.JavaType.METHOD_HANDLE = r3
            net.bytebuddy.utility.JavaType r3 = new net.bytebuddy.utility.JavaType
            r21 = r3
            java.lang.Class<java.lang.Object> r45 = java.lang.Object.class
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r2]
            r42 = 11
            r44 = 1
            java.lang.String r41 = "METHOD_HANDLES"
            java.lang.String r43 = "java.lang.invoke.MethodHandles"
            r40 = r3
            r46 = r4
            r40.<init>(r41, r42, r43, r44, r45, r46)
            net.bytebuddy.utility.JavaType.METHOD_HANDLES = r3
            net.bytebuddy.utility.JavaType r3 = new net.bytebuddy.utility.JavaType
            r22 = r3
            net.bytebuddy.description.type.TypeDescription r39 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r27)
            net.bytebuddy.description.type.TypeDescription r4 = r26.getTypeStub()
            net.bytebuddy.description.type.TypeDescription r5 = r23.getTypeStub()
            java.lang.Class<java.io.Serializable> r6 = java.io.Serializable.class
            net.bytebuddy.description.type.TypeDescription r6 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r6)
            r7 = 3
            net.bytebuddy.description.type.TypeDefinition[] r7 = new net.bytebuddy.description.type.TypeDefinition[r7]
            r7[r2] = r4
            r7[r1] = r5
            r7[r0] = r6
            r36 = 12
            r38 = 17
            java.lang.String r35 = "METHOD_TYPE"
            java.lang.String r37 = "java.lang.invoke.MethodType"
            r34 = r3
            r40 = r7
            r34.<init>(r35, r36, r37, r38, r39, r40)
            net.bytebuddy.utility.JavaType.METHOD_TYPE = r3
            net.bytebuddy.utility.JavaType r3 = new net.bytebuddy.utility.JavaType
            r23 = r3
            java.lang.Class<java.lang.Object> r45 = java.lang.Object.class
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r2]
            r42 = 13
            r44 = 25
            java.lang.String r41 = "METHOD_HANDLES_LOOKUP"
            java.lang.String r43 = "java.lang.invoke.MethodHandles$Lookup"
            r40 = r3
            r46 = r4
            r40.<init>(r41, r42, r43, r44, r45, r46)
            net.bytebuddy.utility.JavaType.METHOD_HANDLES_LOOKUP = r3
            net.bytebuddy.utility.JavaType r3 = new net.bytebuddy.utility.JavaType
            r24 = r3
            java.lang.Class<java.lang.Object> r39 = java.lang.Object.class
            java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r2]
            r36 = 14
            r38 = 1025(0x401, float:1.436E-42)
            java.lang.String r35 = "CALL_SITE"
            java.lang.String r37 = "java.lang.invoke.CallSite"
            r34 = r3
            r40 = r4
            r34.<init>(r35, r36, r37, r38, r39, r40)
            net.bytebuddy.utility.JavaType.CALL_SITE = r3
            net.bytebuddy.utility.JavaType r3 = new net.bytebuddy.utility.JavaType
            r25 = r3
            net.bytebuddy.description.type.TypeDescription$Generic r45 = net.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(r27)
            net.bytebuddy.description.type.TypeDescription r4 = r26.getTypeStub()
            net.bytebuddy.description.type.TypeDefinition[] r5 = new net.bytebuddy.description.type.TypeDefinition[r1]
            r5[r2] = r4
            r42 = 15
            r44 = 1025(0x401, float:1.436E-42)
            java.lang.String r41 = "VAR_HANDLE"
            java.lang.String r43 = "java.lang.invoke.VarHandle"
            r40 = r3
            r46 = r5
            r40.<init>(r41, r42, r43, r44, r45, r46)
            net.bytebuddy.utility.JavaType.VAR_HANDLE = r3
            net.bytebuddy.utility.JavaType r3 = new net.bytebuddy.utility.JavaType
            r26 = r3
            java.lang.Class<java.lang.Object> r39 = java.lang.Object.class
            java.lang.Class<java.lang.reflect.AnnotatedElement> r4 = java.lang.reflect.AnnotatedElement.class
            java.lang.reflect.Type[] r5 = new java.lang.reflect.Type[r1]
            r5[r2] = r4
            r36 = 16
            r38 = 17
            java.lang.String r35 = "PARAMETER"
            java.lang.String r37 = "java.lang.reflect.Parameter"
            r34 = r3
            r40 = r5
            r34.<init>(r35, r36, r37, r38, r39, r40)
            net.bytebuddy.utility.JavaType.PARAMETER = r3
            net.bytebuddy.utility.JavaType r3 = new net.bytebuddy.utility.JavaType
            r27 = r3
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
            java.lang.Class<java.lang.reflect.Member> r5 = java.lang.reflect.Member.class
            r0[r2] = r5
            java.lang.Class<java.lang.reflect.GenericDeclaration> r5 = java.lang.reflect.GenericDeclaration.class
            r0[r1] = r5
            r42 = 17
            java.lang.String r41 = "EXECUTABLE"
            java.lang.String r43 = "java.lang.reflect.Executable"
            java.lang.Class<java.lang.reflect.AccessibleObject> r45 = java.lang.reflect.AccessibleObject.class
            r40 = r3
            r46 = r0
            r40.<init>(r41, r42, r43, r44, r45, r46)
            net.bytebuddy.utility.JavaType.EXECUTABLE = r3
            net.bytebuddy.utility.JavaType r0 = new net.bytebuddy.utility.JavaType
            r28 = r0
            java.lang.Class<java.lang.Object> r39 = java.lang.Object.class
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r1]
            r1[r2] = r4
            r36 = 18
            java.lang.String r35 = "MODULE"
            java.lang.String r37 = "java.lang.Module"
            r34 = r0
            r40 = r1
            r34.<init>(r35, r36, r37, r38, r39, r40)
            net.bytebuddy.utility.JavaType.MODULE = r0
            net.bytebuddy.utility.JavaType r0 = new net.bytebuddy.utility.JavaType
            r29 = r0
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r5 = 19
            r7 = 17
            java.lang.String r4 = "CONSTANT_BOOTSTRAPS"
            java.lang.String r6 = "java.lang.invoke.ConstantBootstraps"
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.CONSTANT_BOOTSTRAPS = r0
            net.bytebuddy.utility.JavaType r0 = new net.bytebuddy.utility.JavaType
            r30 = r0
            java.lang.Class<java.lang.Object> r39 = java.lang.Object.class
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r2]
            r36 = 20
            r38 = 1025(0x401, float:1.436E-42)
            java.lang.String r35 = "RECORD"
            java.lang.String r37 = "java.lang.Record"
            r34 = r0
            r40 = r1
            r34.<init>(r35, r36, r37, r38, r39, r40)
            net.bytebuddy.utility.JavaType.RECORD = r0
            net.bytebuddy.utility.JavaType r0 = new net.bytebuddy.utility.JavaType
            r31 = r0
            java.lang.Class<java.lang.Object> r8 = java.lang.Object.class
            java.lang.reflect.Type[] r9 = new java.lang.reflect.Type[r2]
            r5 = 21
            r7 = 1
            java.lang.String r4 = "OBJECT_METHODS"
            java.lang.String r6 = "java.lang.runtime.ObjectMethods"
            r3 = r0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.OBJECT_METHODS = r0
            net.bytebuddy.utility.JavaType r0 = new net.bytebuddy.utility.JavaType
            r32 = r0
            r7 = 17
            net.bytebuddy.description.type.TypeDefinition[] r9 = new net.bytebuddy.description.type.TypeDefinition[r2]
            r5 = 22
            java.lang.String r4 = "ACCESS_CONTROL_CONTEXT"
            java.lang.String r6 = "java.security.AccessControlContext"
            r3 = r0
            r8 = r33
            r3.<init>(r4, r5, r6, r7, r8, r9)
            net.bytebuddy.utility.JavaType.ACCESS_CONTROL_CONTEXT = r0
            net.bytebuddy.utility.JavaType[] r0 = new net.bytebuddy.utility.JavaType[]{r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32}
            net.bytebuddy.utility.JavaType.$VALUES = r0
            return
    }

    JavaType(java.lang.String r8, int r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r10, int r11, java.lang.reflect.Type r12, java.lang.reflect.Type... r13) {
            r7 = this;
            if (r12 != 0) goto L6
            net.bytebuddy.description.type.TypeDescription$Generic r12 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
        L4:
            r5 = r12
            goto Lb
        L6:
            net.bytebuddy.description.type.TypeDescription$Generic r12 = net.bytebuddy.description.type.TypeDefinition.Sort.describe(r12)
            goto L4
        Lb:
            net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes r6 = new net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes
            r6.<init>(r13)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    JavaType(java.lang.String r8, int r9, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r10, int r11, net.bytebuddy.description.type.TypeDefinition r12, net.bytebuddy.description.type.TypeDefinition... r13) {
            r7 = this;
            if (r12 != 0) goto L6
            net.bytebuddy.description.type.TypeDescription$Generic r12 = net.bytebuddy.description.type.TypeDescription.Generic.UNDEFINED
        L4:
            r5 = r12
            goto Lb
        L6:
            net.bytebuddy.description.type.TypeDescription$Generic r12 = r12.asGenericType()
            goto L4
        Lb:
            net.bytebuddy.description.type.TypeList$Generic$Explicit r6 = new net.bytebuddy.description.type.TypeList$Generic$Explicit
            r6.<init>(r13)
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    JavaType(java.lang.String r1, int r2, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r3, int r4, net.bytebuddy.description.type.TypeDescription.Generic r5, net.bytebuddy.description.type.TypeList.Generic r6) {
            r0 = this;
            r0.<init>(r1, r2)
            net.bytebuddy.utility.JavaType$LatentTypeWithSimpleName r1 = new net.bytebuddy.utility.JavaType$LatentTypeWithSimpleName
            r1.<init>(r3, r4, r5, r6)
            r0.typeDescription = r1
            return
    }

    @net.bytebuddy.build.CachedReturnPlugin.Enhance("available")
    private java.lang.Boolean doIsAvailable() {
            r1 = this;
            java.lang.Boolean r0 = r1.available
            if (r0 == 0) goto L6
            r0 = 0
            goto Le
        L6:
            r1.load()     // Catch: java.lang.ClassNotFoundException -> Lc
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch: java.lang.ClassNotFoundException -> Lc
            goto Le
        Lc:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
        Le:
            if (r0 != 0) goto L13
            java.lang.Boolean r0 = r1.available
            goto L15
        L13:
            r1.available = r0
        L15:
            return r0
    }

    public static net.bytebuddy.utility.JavaType valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.utility.JavaType> r0 = net.bytebuddy.utility.JavaType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.utility.JavaType r1 = (net.bytebuddy.utility.JavaType) r1
            return r1
    }

    public static net.bytebuddy.utility.JavaType[] values() {
            net.bytebuddy.utility.JavaType[] r0 = net.bytebuddy.utility.JavaType.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.utility.JavaType[] r0 = (net.bytebuddy.utility.JavaType[]) r0
            return r0
    }

    public net.bytebuddy.description.type.TypeDescription getTypeStub() {
            r1 = this;
            net.bytebuddy.description.type.TypeDescription r0 = r1.typeDescription
            return r0
    }

    public boolean isAvailable() {
            r1 = this;
            java.lang.Boolean r0 = r1.doIsAvailable()
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isInstance(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r2.isAvailable()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.Class r0 = r2.load()     // Catch: java.lang.ClassNotFoundException -> L11
            boolean r3 = r0.isInstance(r3)     // Catch: java.lang.ClassNotFoundException -> L11
            return r3
        L11:
            return r1
    }

    @net.bytebuddy.build.CachedReturnPlugin.Enhance("loaded")
    public java.lang.Class<?> load() throws java.lang.ClassNotFoundException {
            r3 = this;
            java.lang.Class r0 = r3.loaded
            if (r0 == 0) goto L6
            r0 = 0
            goto L13
        L6:
            net.bytebuddy.description.type.TypeDescription r0 = r3.typeDescription
            java.lang.String r0 = r0.getName()
            r1 = 0
            java.lang.ClassLoader r2 = net.bytebuddy.dynamic.loading.ClassLoadingStrategy.BOOTSTRAP_LOADER
            java.lang.Class r0 = java.lang.Class.forName(r0, r1, r2)
        L13:
            if (r0 != 0) goto L18
            java.lang.Class r0 = r3.loaded
            goto L1a
        L18:
            r3.loaded = r0
        L1a:
            return r0
    }

    public net.bytebuddy.description.type.TypeDescription loadAsDescription() throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.Class r0 = r1.load()
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            return r0
    }
}
