package net.bytebuddy.asm;

/* JADX INFO: loaded from: classes2.dex */
public enum TypeConstantAdjustment extends java.lang.Enum<net.bytebuddy.asm.TypeConstantAdjustment> implements net.bytebuddy.asm.AsmVisitorWrapper {
    private static final /* synthetic */ net.bytebuddy.asm.TypeConstantAdjustment[] $VALUES = null;
    public static final net.bytebuddy.asm.TypeConstantAdjustment INSTANCE = null;

    public static class TypeConstantDissolvingClassVisitor extends net.bytebuddy.jar.asm.ClassVisitor {
        private boolean supportsTypeConstants;

        public static class TypeConstantDissolvingMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
            private static final java.lang.String DESCRIPTOR = "(Ljava/lang/String;)Ljava/lang/Class;";
            private static final java.lang.String FOR_NAME = "forName";
            private static final java.lang.String JAVA_LANG_CLASS = "java/lang/Class";

            public TypeConstantDissolvingMethodVisitor(net.bytebuddy.jar.asm.MethodVisitor r2) {
                    r1 = this;
                    int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                    r1.<init>(r0, r2)
                    return
            }

            @Override // net.bytebuddy.jar.asm.MethodVisitor
            @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Fall through to default case is intentional.", value = {"SF_SWITCH_NO_DEFAULT"})
            public void visitLdcInsn(java.lang.Object r7) {
                    r6 = this;
                    boolean r0 = r7 instanceof net.bytebuddy.jar.asm.Type
                    if (r0 == 0) goto L31
                    r0 = r7
                    net.bytebuddy.jar.asm.Type r0 = (net.bytebuddy.jar.asm.Type) r0
                    int r1 = r0.getSort()
                    r2 = 9
                    if (r1 == r2) goto L14
                    r2 = 10
                    if (r1 == r2) goto L14
                    goto L31
                L14:
                    java.lang.String r7 = r0.getInternalName()
                    r0 = 47
                    r1 = 46
                    java.lang.String r7 = r7.replace(r0, r1)
                    super.visitLdcInsn(r7)
                    java.lang.String r4 = "(Ljava/lang/String;)Ljava/lang/Class;"
                    r5 = 0
                    r1 = 184(0xb8, float:2.58E-43)
                    java.lang.String r2 = "java/lang/Class"
                    java.lang.String r3 = "forName"
                    r0 = r6
                    super.visitMethodInsn(r1, r2, r3, r4, r5)
                    return
                L31:
                    super.visitLdcInsn(r7)
                    return
            }
        }

        public TypeConstantDissolvingClassVisitor(net.bytebuddy.jar.asm.ClassVisitor r2) {
                r1 = this;
                int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
                r1.<init>(r0, r2)
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        public void visit(int r3, int r4, java.lang.String r5, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r6, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r7, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r8) {
                r2 = this;
                net.bytebuddy.ClassFileVersion r0 = net.bytebuddy.ClassFileVersion.ofMinorMajor(r3)
                net.bytebuddy.ClassFileVersion r1 = net.bytebuddy.ClassFileVersion.JAVA_V5
                boolean r0 = r0.isAtLeast(r1)
                r2.supportsTypeConstants = r0
                super.visit(r3, r4, r5, r6, r7, r8)
                return
        }

        @Override // net.bytebuddy.jar.asm.ClassVisitor
        @net.bytebuddy.utility.nullability.MaybeNull
        public net.bytebuddy.jar.asm.MethodVisitor visitMethod(int r1, java.lang.String r2, java.lang.String r3, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String r4, @net.bytebuddy.utility.nullability.MaybeNull java.lang.String[] r5) {
                r0 = this;
                net.bytebuddy.jar.asm.MethodVisitor r1 = super.visitMethod(r1, r2, r3, r4, r5)
                boolean r2 = r0.supportsTypeConstants
                if (r2 != 0) goto L11
                if (r1 != 0) goto Lb
                goto L11
            Lb:
                net.bytebuddy.asm.TypeConstantAdjustment$TypeConstantDissolvingClassVisitor$TypeConstantDissolvingMethodVisitor r2 = new net.bytebuddy.asm.TypeConstantAdjustment$TypeConstantDissolvingClassVisitor$TypeConstantDissolvingMethodVisitor
                r2.<init>(r1)
                r1 = r2
            L11:
                return r1
        }
    }

    static {
            net.bytebuddy.asm.TypeConstantAdjustment r0 = new net.bytebuddy.asm.TypeConstantAdjustment
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            net.bytebuddy.asm.TypeConstantAdjustment.INSTANCE = r0
            net.bytebuddy.asm.TypeConstantAdjustment[] r0 = new net.bytebuddy.asm.TypeConstantAdjustment[]{r0}
            net.bytebuddy.asm.TypeConstantAdjustment.$VALUES = r0
            return
    }

    TypeConstantAdjustment(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static net.bytebuddy.asm.TypeConstantAdjustment valueOf(java.lang.String r1) {
            java.lang.Class<net.bytebuddy.asm.TypeConstantAdjustment> r0 = net.bytebuddy.asm.TypeConstantAdjustment.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            net.bytebuddy.asm.TypeConstantAdjustment r1 = (net.bytebuddy.asm.TypeConstantAdjustment) r1
            return r1
    }

    public static net.bytebuddy.asm.TypeConstantAdjustment[] values() {
            net.bytebuddy.asm.TypeConstantAdjustment[] r0 = net.bytebuddy.asm.TypeConstantAdjustment.$VALUES
            java.lang.Object r0 = r0.clone()
            net.bytebuddy.asm.TypeConstantAdjustment[] r0 = (net.bytebuddy.asm.TypeConstantAdjustment[]) r0
            return r0
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public int mergeReader(int r1) {
            r0 = this;
            return r1
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public int mergeWriter(int r1) {
            r0 = this;
            return r1
    }

    @Override // net.bytebuddy.asm.AsmVisitorWrapper
    public net.bytebuddy.jar.asm.ClassVisitor wrap(net.bytebuddy.description.type.TypeDescription r1, net.bytebuddy.jar.asm.ClassVisitor r2, net.bytebuddy.implementation.Implementation.Context r3, net.bytebuddy.pool.TypePool r4, net.bytebuddy.description.field.FieldList<net.bytebuddy.description.field.FieldDescription.InDefinedShape> r5, net.bytebuddy.description.method.MethodList<?> r6, int r7, int r8) {
            r0 = this;
            net.bytebuddy.asm.TypeConstantAdjustment$TypeConstantDissolvingClassVisitor r1 = new net.bytebuddy.asm.TypeConstantAdjustment$TypeConstantDissolvingClassVisitor
            r1.<init>(r2)
            return r1
    }
}
