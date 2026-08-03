package net.bytebuddy.implementation.auxiliary;

/* JADX INFO: loaded from: classes2.dex */
public enum PrivilegedMemberLookupAction extends java.lang.Enum<net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction> implements net.bytebuddy.implementation.auxiliary.AuxiliaryType {
    private static final /* synthetic */ net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction[] $VALUES = null;
    private static final net.bytebuddy.description.method.MethodDescription.InDefinedShape DEFAULT_CONSTRUCTOR = null;
    public static final net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction FOR_DECLARED_CONSTRUCTOR = null;
    public static final net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction FOR_DECLARED_METHOD = null;
    public static final net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction FOR_PUBLIC_CONSTRUCTOR = null;
    public static final net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction FOR_PUBLIC_METHOD = null;
    private static final java.lang.String TYPE_FIELD = "type";
    private final java.util.Map<java.lang.String, java.lang.Class<?>> fields;
    private final net.bytebuddy.description.method.MethodDescription.InDefinedShape methodDescription;

    static {
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction r8 = new net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction
            java.lang.String r6 = "parameters"
            java.lang.Class<java.lang.Class[]> r7 = java.lang.Class[].class
            java.lang.String r1 = "FOR_PUBLIC_METHOD"
            r2 = 0
            java.lang.String r3 = "getMethod"
            java.lang.String r4 = "name"
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.FOR_PUBLIC_METHOD = r8
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction r0 = new net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction
            java.lang.String r15 = "parameters"
            java.lang.Class<java.lang.Class[]> r16 = java.lang.Class[].class
            java.lang.String r10 = "FOR_DECLARED_METHOD"
            r11 = 1
            java.lang.String r12 = "getDeclaredMethod"
            java.lang.String r13 = "name"
            java.lang.Class<java.lang.String> r14 = java.lang.String.class
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.FOR_DECLARED_METHOD = r0
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction r7 = new net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction
            java.lang.String r5 = "parameters"
            java.lang.Class<java.lang.Class[]> r6 = java.lang.Class[].class
            java.lang.String r2 = "FOR_PUBLIC_CONSTRUCTOR"
            r3 = 2
            java.lang.String r4 = "getConstructor"
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.FOR_PUBLIC_CONSTRUCTOR = r7
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction r1 = new net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction
            java.lang.String r13 = "parameters"
            java.lang.Class<java.lang.Class[]> r14 = java.lang.Class[].class
            java.lang.String r10 = "FOR_DECLARED_CONSTRUCTOR"
            r11 = 3
            java.lang.String r12 = "getDeclaredConstructor"
            r9 = r1
            r9.<init>(r10, r11, r12, r13, r14)
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.FOR_DECLARED_CONSTRUCTOR = r1
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction[] r0 = new net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction[]{r8, r0, r7, r1}
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.$VALUES = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            net.bytebuddy.description.type.TypeDescription r0 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r0)
            net.bytebuddy.description.method.MethodList r0 = r0.getDeclaredMethods()
            net.bytebuddy.matcher.ElementMatcher$Junction r1 = net.bytebuddy.matcher.ElementMatchers.isConstructor()
            net.bytebuddy.matcher.FilterableList r0 = r0.filter(r1)
            net.bytebuddy.description.method.MethodList r0 = (net.bytebuddy.description.method.MethodList) r0
            java.lang.Object r0 = r0.getOnly()
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r0 = (net.bytebuddy.description.method.MethodDescription.InDefinedShape) r0
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.DEFAULT_CONSTRUCTOR = r0
            return
    }

    PrivilegedMemberLookupAction(java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.Class r6) {
            r1 = this;
            r1.<init>(r2, r3)
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r2 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class[] r0 = new java.lang.Class[]{r6}     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.reflect.Method r3 = r3.getMethod(r4, r0)     // Catch: java.lang.NoSuchMethodException -> L1b
            r2.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L1b
            r1.methodDescription = r2     // Catch: java.lang.NoSuchMethodException -> L1b
            java.util.Map r2 = java.util.Collections.singletonMap(r5, r6)
            r1.fields = r2
            return
        L1b:
            r2 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Could not locate method: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4, r2)
            throw r3
    }

    PrivilegedMemberLookupAction(java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.Class r6, java.lang.String r7, java.lang.Class r8) {
            r1 = this;
            r1.<init>(r2, r3)
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r2 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.Class<java.lang.Class> r3 = java.lang.Class.class
            java.lang.Class[] r0 = new java.lang.Class[]{r6, r8}     // Catch: java.lang.NoSuchMethodException -> L22
            java.lang.reflect.Method r3 = r3.getMethod(r4, r0)     // Catch: java.lang.NoSuchMethodException -> L22
            r2.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L22
            r1.methodDescription = r2     // Catch: java.lang.NoSuchMethodException -> L22
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.fields = r2
            r2.put(r5, r6)
            r2.put(r7, r8)
            return
        L22:
            r2 = move-exception
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Could not locate method: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.<init>(r4, r2)
            throw r3
    }

    public static net.bytebuddy.implementation.auxiliary.AuxiliaryType of(net.bytebuddy.description.method.MethodDescription r3) {
            boolean r0 = r3.isConstructor()
            if (r0 == 0) goto L12
            boolean r3 = r3.isPublic()
            if (r3 == 0) goto Lf
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction r3 = net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.FOR_PUBLIC_CONSTRUCTOR
            goto L11
        Lf:
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction r3 = net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.FOR_DECLARED_CONSTRUCTOR
        L11:
            return r3
        L12:
            boolean r0 = r3.isMethod()
            if (r0 == 0) goto L24
            boolean r3 = r3.isPublic()
            if (r3 == 0) goto L21
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction r3 = net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.FOR_PUBLIC_METHOD
            goto L23
        L21:
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction r3 = net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.FOR_DECLARED_METHOD
        L23:
            return r3
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Cannot load constant for type initializer: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    public static net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction> r0 = net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction r1 = (net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction) r1
            return r1
    }

    public static net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction[] values() {
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction[] r0 = net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction[] r0 = (net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction[]) r0
            return r0
    }

    @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
    public java.lang.String getSuffix() {
            r1 = this;
            java.lang.String r0 = r1.name()
            int r0 = r0.hashCode()
            java.lang.String r0 = net.bytebuddy.utility.RandomString.hashOf(r0)
            return r0
    }

    @Override // net.bytebuddy.implementation.auxiliary.AuxiliaryType
    public net.bytebuddy.dynamic.DynamicType make(java.lang.String r8, net.bytebuddy.ClassFileVersion r9, net.bytebuddy.implementation.MethodAccessorFactory r10) {
            r7 = this;
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r10 = net.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction.DEFAULT_CONSTRUCTOR
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r10 = net.bytebuddy.implementation.MethodCall.invoke(r10)
            java.lang.String r0 = "type"
            net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r1 = net.bytebuddy.implementation.FieldAccessor.ofField(r0)
            r2 = 0
            net.bytebuddy.implementation.Implementation$Composable r1 = r1.setsArgumentAt(r2)
            net.bytebuddy.implementation.Implementation$Composable r10 = r10.andThen(r1)
            java.util.Map<java.lang.String, java.lang.Class<?>> r1 = r7.fields
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
            r3 = 1
            r4 = r3
        L21:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r1.next()
            java.lang.String r5 = (java.lang.String) r5
            net.bytebuddy.implementation.FieldAccessor$OwnerTypeLocatable r5 = net.bytebuddy.implementation.FieldAccessor.ofField(r5)
            int r6 = r4 + 1
            net.bytebuddy.implementation.Implementation$Composable r4 = r5.setsArgumentAt(r4)
            net.bytebuddy.implementation.Implementation$Composable r10 = r10.andThen(r4)
            r4 = r6
            goto L21
        L3d:
            net.bytebuddy.ByteBuddy r1 = new net.bytebuddy.ByteBuddy
            r1.<init>(r9)
            net.bytebuddy.dynamic.scaffold.TypeValidation r9 = net.bytebuddy.dynamic.scaffold.TypeValidation.DISABLED
            net.bytebuddy.ByteBuddy r9 = r1.with(r9)
            java.lang.Class<java.security.PrivilegedExceptionAction> r1 = java.security.PrivilegedExceptionAction.class
            net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy$Default r4 = net.bytebuddy.dynamic.scaffold.subclass.ConstructorStrategy.Default.NO_CONSTRUCTORS
            net.bytebuddy.dynamic.DynamicType$Builder r9 = r9.subclass(r1, r4)
            net.bytebuddy.dynamic.DynamicType$Builder r8 = r9.name(r8)
            net.bytebuddy.description.modifier.ModifierContributor$ForType[] r9 = net.bytebuddy.implementation.auxiliary.AuxiliaryType.DEFAULT_TYPE_MODIFIER
            net.bytebuddy.dynamic.DynamicType$Builder r8 = r8.modifiers(r9)
            net.bytebuddy.description.modifier.ModifierContributor$ForMethod[] r9 = new net.bytebuddy.description.modifier.ModifierContributor.ForMethod[r3]
            net.bytebuddy.description.modifier.Visibility r1 = net.bytebuddy.description.modifier.Visibility.PUBLIC
            r9[r2] = r1
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial r8 = r8.defineConstructor(r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.Map<java.lang.String, java.lang.Class<?>> r1 = r7.fields
            java.util.Collection r1 = r1.values()
            r9.<init>(r1)
            java.lang.Class<java.lang.Class> r1 = java.lang.Class.class
            java.util.List r9 = net.bytebuddy.utility.CompoundList.of(r1, r9)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition r8 = r8.withParameters(r9)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r8 = r8.intercept(r10)
            java.lang.String r9 = "run"
            net.bytebuddy.matcher.ElementMatcher$Junction r9 = net.bytebuddy.matcher.ElementMatchers.named(r9)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition r8 = r8.method(r9)
            net.bytebuddy.description.method.MethodDescription$InDefinedShape r9 = r7.methodDescription
            net.bytebuddy.implementation.MethodCall$WithoutSpecifiedTarget r9 = net.bytebuddy.implementation.MethodCall.invoke(r9)
            net.bytebuddy.implementation.MethodCall r9 = r9.onField(r0)
            java.util.Map<java.lang.String, java.lang.Class<?>> r10 = r7.fields
            java.util.Set r10 = r10.keySet()
            java.lang.String[] r4 = new java.lang.String[r2]
            java.lang.Object[] r10 = r10.toArray(r4)
            java.lang.String[] r10 = (java.lang.String[]) r10
            net.bytebuddy.implementation.MethodCall r9 = r9.withField(r10)
            net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition r8 = r8.intercept(r9)
            net.bytebuddy.description.modifier.ModifierContributor$ForField[] r9 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r3]
            net.bytebuddy.description.modifier.Visibility r10 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            r9[r2] = r10
            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r8 = r8.defineField(r0, r1, r9)
            java.util.Map<java.lang.String, java.lang.Class<?>> r9 = r7.fields
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        Lbb:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Lde
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r0 = r10.getKey()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r10 = r10.getValue()
            java.lang.reflect.Type r10 = (java.lang.reflect.Type) r10
            net.bytebuddy.description.modifier.ModifierContributor$ForField[] r1 = new net.bytebuddy.description.modifier.ModifierContributor.ForField[r3]
            net.bytebuddy.description.modifier.Visibility r4 = net.bytebuddy.description.modifier.Visibility.PRIVATE
            r1[r2] = r4
            net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable r8 = r8.defineField(r0, r10, r1)
            goto Lbb
        Lde:
            net.bytebuddy.dynamic.DynamicType$Unloaded r8 = r8.make()
            return r8
    }
}
