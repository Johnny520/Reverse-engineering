package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
@net.bytebuddy.build.HashCodeAndEqualsPlugin.Enhance
public class SerializedConstant extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
    private static final java.lang.String CHARSET = "ISO-8859-1";
    private final java.lang.String serialization;

    public SerializedConstant(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.serialization = r1
            return
    }

    public static net.bytebuddy.implementation.bytecode.StackManipulation of(@net.bytebuddy.utility.nullability.MaybeNull java.io.Serializable r4) {
            if (r4 != 0) goto L5
            net.bytebuddy.implementation.bytecode.constant.NullConstant r4 = net.bytebuddy.implementation.bytecode.constant.NullConstant.INSTANCE
            return r4
        L5:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream     // Catch: java.io.IOException -> L21
            r0.<init>()     // Catch: java.io.IOException -> L21
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch: java.io.IOException -> L21
            r1.<init>(r0)     // Catch: java.io.IOException -> L21
            r1.writeObject(r4)     // Catch: java.lang.Throwable -> L23
            r1.close()     // Catch: java.io.IOException -> L21
            net.bytebuddy.implementation.bytecode.constant.SerializedConstant r1 = new net.bytebuddy.implementation.bytecode.constant.SerializedConstant     // Catch: java.io.IOException -> L21
            java.lang.String r2 = "ISO-8859-1"
            java.lang.String r0 = r0.toString(r2)     // Catch: java.io.IOException -> L21
            r1.<init>(r0)     // Catch: java.io.IOException -> L21
            return r1
        L21:
            r0 = move-exception
            goto L28
        L23:
            r0 = move-exception
            r1.close()     // Catch: java.io.IOException -> L21
            throw r0     // Catch: java.io.IOException -> L21
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Cannot serialize "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r13, net.bytebuddy.implementation.Implementation.Context r14) {
            r12 = this;
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            java.lang.Class<java.io.ByteArrayInputStream> r1 = java.io.ByteArrayInputStream.class
            java.lang.Class<java.io.ObjectInputStream> r2 = java.io.ObjectInputStream.class
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r3 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.description.type.TypeDescription r4 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r2)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.implementation.bytecode.StackManipulation r4 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r4)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.description.type.TypeDescription r5 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.implementation.bytecode.StackManipulation r5 = net.bytebuddy.implementation.bytecode.TypeCreation.of(r5)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.implementation.bytecode.constant.TextConstant r6 = new net.bytebuddy.implementation.bytecode.constant.TextConstant     // Catch: java.lang.NoSuchMethodException -> L9d
            java.lang.String r7 = r12.serialization     // Catch: java.lang.NoSuchMethodException -> L9d
            r6.<init>(r7)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.implementation.bytecode.constant.TextConstant r7 = new net.bytebuddy.implementation.bytecode.constant.TextConstant     // Catch: java.lang.NoSuchMethodException -> L9d
            java.lang.String r8 = "ISO-8859-1"
            r7.<init>(r8)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r8 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L9d
            java.lang.String r9 = "getBytes"
            java.lang.Class[] r10 = new java.lang.Class[]{r0}     // Catch: java.lang.NoSuchMethodException -> L9d
            java.lang.reflect.Method r0 = r0.getMethod(r9, r10)     // Catch: java.lang.NoSuchMethodException -> L9d
            r8.<init>(r0)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r0 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r8)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r8 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor     // Catch: java.lang.NoSuchMethodException -> L9d
            java.lang.Class<byte[]> r9 = byte[].class
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.NoSuchMethodException -> L9d
            java.lang.reflect.Constructor r1 = r1.getConstructor(r9)     // Catch: java.lang.NoSuchMethodException -> L9d
            r8.<init>(r1)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r1 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r8)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor r8 = new net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor     // Catch: java.lang.NoSuchMethodException -> L9d
            java.lang.Class<java.io.InputStream> r9 = java.io.InputStream.class
            java.lang.Class[] r9 = new java.lang.Class[]{r9}     // Catch: java.lang.NoSuchMethodException -> L9d
            java.lang.reflect.Constructor r9 = r2.getConstructor(r9)     // Catch: java.lang.NoSuchMethodException -> L9d
            r8.<init>(r9)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r8 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r8)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r9 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L9d
            java.lang.String r10 = "readObject"
            r11 = 0
            java.lang.reflect.Method r2 = r2.getMethod(r10, r11)     // Catch: java.lang.NoSuchMethodException -> L9d
            r9.<init>(r2)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r2 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r9)     // Catch: java.lang.NoSuchMethodException -> L9d
            r9 = 10
            net.bytebuddy.implementation.bytecode.StackManipulation[] r9 = new net.bytebuddy.implementation.bytecode.StackManipulation[r9]     // Catch: java.lang.NoSuchMethodException -> L9d
            r10 = 0
            r9[r10] = r4     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.implementation.bytecode.Duplication r4 = net.bytebuddy.implementation.bytecode.Duplication.SINGLE     // Catch: java.lang.NoSuchMethodException -> L9d
            r10 = 1
            r9[r10] = r4     // Catch: java.lang.NoSuchMethodException -> L9d
            r10 = 2
            r9[r10] = r5     // Catch: java.lang.NoSuchMethodException -> L9d
            r5 = 3
            r9[r5] = r4     // Catch: java.lang.NoSuchMethodException -> L9d
            r4 = 4
            r9[r4] = r6     // Catch: java.lang.NoSuchMethodException -> L9d
            r4 = 5
            r9[r4] = r7     // Catch: java.lang.NoSuchMethodException -> L9d
            r4 = 6
            r9[r4] = r0     // Catch: java.lang.NoSuchMethodException -> L9d
            r0 = 7
            r9[r0] = r1     // Catch: java.lang.NoSuchMethodException -> L9d
            r0 = 8
            r9[r0] = r8     // Catch: java.lang.NoSuchMethodException -> L9d
            r0 = 9
            r9[r0] = r2     // Catch: java.lang.NoSuchMethodException -> L9d
            r3.<init>(r9)     // Catch: java.lang.NoSuchMethodException -> L9d
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r13 = r3.apply(r13, r14)     // Catch: java.lang.NoSuchMethodException -> L9d
            return r13
        L9d:
            r13 = move-exception
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "Could not locate Java API method"
            r14.<init>(r0, r13)
            throw r14
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
            java.lang.String r2 = r4.serialization
            net.bytebuddy.implementation.bytecode.constant.SerializedConstant r5 = (net.bytebuddy.implementation.bytecode.constant.SerializedConstant) r5
            java.lang.String r5 = r5.serialization
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
            java.lang.String r1 = r2.serialization
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }
}
