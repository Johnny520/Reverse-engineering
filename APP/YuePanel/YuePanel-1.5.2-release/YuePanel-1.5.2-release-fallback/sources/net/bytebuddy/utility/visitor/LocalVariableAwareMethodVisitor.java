package net.bytebuddy.utility.visitor;

/* JADX INFO: loaded from: classes2.dex */
public class LocalVariableAwareMethodVisitor extends net.bytebuddy.jar.asm.MethodVisitor {
    private int freeOffset;

    public LocalVariableAwareMethodVisitor(net.bytebuddy.jar.asm.MethodVisitor r2, net.bytebuddy.description.method.MethodDescription r3) {
            r1 = this;
            int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
            r1.<init>(r0, r2)
            int r2 = r3.getStackSize()
            r1.freeOffset = r2
            return
    }

    public int getFreeOffset() {
            r1 = this;
            int r0 = r1.freeOffset
            return r0
    }

    @Override // net.bytebuddy.jar.asm.MethodVisitor
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "No action required on default option.", value = {"SF_SWITCH_NO_DEFAULT"})
    public void visitVarInsn(int r3, int r4) {
            r2 = this;
            switch(r3) {
                case 54: goto Lf;
                case 55: goto L4;
                case 56: goto Lf;
                case 57: goto L4;
                case 58: goto Lf;
                default: goto L3;
            }
        L3:
            goto L19
        L4:
            int r0 = r2.freeOffset
            int r1 = r4 + 2
            int r0 = java.lang.Math.max(r0, r1)
            r2.freeOffset = r0
            goto L19
        Lf:
            int r0 = r2.freeOffset
            int r1 = r4 + 1
            int r0 = java.lang.Math.max(r0, r1)
            r2.freeOffset = r0
        L19:
            super.visitVarInsn(r3, r4)
            return
    }
}
