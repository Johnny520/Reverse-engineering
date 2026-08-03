package net.bytebuddy.implementation.bytecode.constant;

/* JADX INFO: loaded from: classes2.dex */
public class FieldConstant extends net.bytebuddy.implementation.bytecode.StackManipulation.AbstractBase {
    private final net.bytebuddy.description.field.FieldDescription.InDefinedShape fieldDescription;

    public static class Cached implements net.bytebuddy.implementation.bytecode.StackManipulation {
        private final net.bytebuddy.implementation.bytecode.StackManipulation fieldConstant;

        public Cached(net.bytebuddy.implementation.bytecode.StackManipulation r1) {
                r0 = this;
                r0.<init>()
                r0.fieldConstant = r1
                return
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r3, net.bytebuddy.implementation.Implementation.Context r4) {
                r2 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.fieldConstant
                java.lang.Class<java.lang.reflect.Field> r1 = java.lang.reflect.Field.class
                net.bytebuddy.description.type.TypeDescription r1 = net.bytebuddy.description.type.TypeDescription.ForLoadedType.of(r1)
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
                net.bytebuddy.implementation.bytecode.constant.FieldConstant$Cached r3 = (net.bytebuddy.implementation.bytecode.constant.FieldConstant.Cached) r3
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r2.fieldConstant
                net.bytebuddy.implementation.bytecode.StackManipulation r3 = r3.fieldConstant
                boolean r3 = r0.equals(r3)
                return r3
            L1c:
                r3 = 0
                return r3
        }

        public int hashCode() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.fieldConstant
                int r0 = r0.hashCode()
                return r0
        }

        @Override // net.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
                r1 = this;
                net.bytebuddy.implementation.bytecode.StackManipulation r0 = r1.fieldConstant
                boolean r0 = r0.isValid()
                return r0
        }
    }

    public FieldConstant(net.bytebuddy.description.field.FieldDescription.InDefinedShape r1) {
            r0 = this;
            r0.<init>()
            r0.fieldDescription = r1
            return
    }

    @Override // net.bytebuddy.implementation.bytecode.StackManipulation
    public net.bytebuddy.implementation.bytecode.StackManipulation.Size apply(net.bytebuddy.jar.asm.MethodVisitor r8, net.bytebuddy.implementation.Implementation.Context r9) {
            r7 = this;
            net.bytebuddy.implementation.bytecode.StackManipulation$Compound r0 = new net.bytebuddy.implementation.bytecode.StackManipulation$Compound     // Catch: java.lang.NoSuchMethodException -> L42
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r1 = r7.fieldDescription     // Catch: java.lang.NoSuchMethodException -> L42
            net.bytebuddy.description.type.TypeDescription r1 = r1.getDeclaringType()     // Catch: java.lang.NoSuchMethodException -> L42
            net.bytebuddy.implementation.bytecode.StackManipulation r1 = net.bytebuddy.implementation.bytecode.constant.ClassConstant.of(r1)     // Catch: java.lang.NoSuchMethodException -> L42
            net.bytebuddy.implementation.bytecode.constant.TextConstant r2 = new net.bytebuddy.implementation.bytecode.constant.TextConstant     // Catch: java.lang.NoSuchMethodException -> L42
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r3 = r7.fieldDescription     // Catch: java.lang.NoSuchMethodException -> L42
            java.lang.String r3 = r3.getInternalName()     // Catch: java.lang.NoSuchMethodException -> L42
            r2.<init>(r3)     // Catch: java.lang.NoSuchMethodException -> L42
            net.bytebuddy.description.method.MethodDescription$ForLoadedMethod r3 = new net.bytebuddy.description.method.MethodDescription$ForLoadedMethod     // Catch: java.lang.NoSuchMethodException -> L42
            java.lang.Class<java.lang.Class> r4 = java.lang.Class.class
            java.lang.String r5 = "getDeclaredField"
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            java.lang.Class[] r6 = new java.lang.Class[]{r6}     // Catch: java.lang.NoSuchMethodException -> L42
            java.lang.reflect.Method r4 = r4.getMethod(r5, r6)     // Catch: java.lang.NoSuchMethodException -> L42
            r3.<init>(r4)     // Catch: java.lang.NoSuchMethodException -> L42
            net.bytebuddy.implementation.bytecode.member.MethodInvocation$WithImplicitInvocationTargetType r3 = net.bytebuddy.implementation.bytecode.member.MethodInvocation.invoke(r3)     // Catch: java.lang.NoSuchMethodException -> L42
            r4 = 3
            net.bytebuddy.implementation.bytecode.StackManipulation[] r4 = new net.bytebuddy.implementation.bytecode.StackManipulation[r4]     // Catch: java.lang.NoSuchMethodException -> L42
            r5 = 0
            r4[r5] = r1     // Catch: java.lang.NoSuchMethodException -> L42
            r1 = 1
            r4[r1] = r2     // Catch: java.lang.NoSuchMethodException -> L42
            r1 = 2
            r4[r1] = r3     // Catch: java.lang.NoSuchMethodException -> L42
            r0.<init>(r4)     // Catch: java.lang.NoSuchMethodException -> L42
            net.bytebuddy.implementation.bytecode.StackManipulation$Size r8 = r0.apply(r8, r9)     // Catch: java.lang.NoSuchMethodException -> L42
            return r8
        L42:
            r8 = move-exception
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot locate Class::getDeclaredField"
            r9.<init>(r0, r8)
            throw r9
    }

    public net.bytebuddy.implementation.bytecode.StackManipulation cached() {
            r1 = this;
            net.bytebuddy.implementation.bytecode.constant.FieldConstant$Cached r0 = new net.bytebuddy.implementation.bytecode.constant.FieldConstant$Cached
            r0.<init>(r1)
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
            net.bytebuddy.implementation.bytecode.constant.FieldConstant r3 = (net.bytebuddy.implementation.bytecode.constant.FieldConstant) r3
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = r2.fieldDescription
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r3 = r3.fieldDescription
            boolean r3 = r0.equals(r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r1 = this;
            net.bytebuddy.description.field.FieldDescription$InDefinedShape r0 = r1.fieldDescription
            int r0 = r0.hashCode()
            return r0
    }
}
