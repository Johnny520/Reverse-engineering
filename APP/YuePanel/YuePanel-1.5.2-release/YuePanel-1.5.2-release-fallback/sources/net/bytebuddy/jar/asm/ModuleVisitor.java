package net.bytebuddy.jar.asm;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ModuleVisitor {
    protected final int api;
    protected net.bytebuddy.jar.asm.ModuleVisitor mv;

    public ModuleVisitor(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ModuleVisitor(int r3, net.bytebuddy.jar.asm.ModuleVisitor r4) {
            r2 = this;
            r2.<init>()
            r0 = 589824(0x90000, float:8.2652E-40)
            r1 = 17432576(0x10a0000, float:2.5346597E-38)
            if (r3 == r0) goto L37
            r0 = 524288(0x80000, float:7.34684E-40)
            if (r3 == r0) goto L37
            r0 = 458752(0x70000, float:6.42848E-40)
            if (r3 == r0) goto L37
            r0 = 393216(0x60000, float:5.51013E-40)
            if (r3 == r0) goto L37
            r0 = 327680(0x50000, float:4.59177E-40)
            if (r3 == r0) goto L37
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r3 == r0) goto L37
            if (r3 != r1) goto L20
            goto L37
        L20:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported api "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
        L37:
            if (r3 != r1) goto L3c
            net.bytebuddy.jar.asm.Constants.checkAsmExperimental(r2)
        L3c:
            r2.api = r3
            r2.mv = r4
            return
    }

    public net.bytebuddy.jar.asm.ModuleVisitor getDelegate() {
            r1 = this;
            net.bytebuddy.jar.asm.ModuleVisitor r0 = r1.mv
            return r0
    }

    public void visitEnd() {
            r1 = this;
            net.bytebuddy.jar.asm.ModuleVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitEnd()
        L7:
            return
    }

    public void visitExport(java.lang.String r2, int r3, java.lang.String... r4) {
            r1 = this;
            net.bytebuddy.jar.asm.ModuleVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitExport(r2, r3, r4)
        L7:
            return
    }

    public void visitMainClass(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.ModuleVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitMainClass(r2)
        L7:
            return
    }

    public void visitOpen(java.lang.String r2, int r3, java.lang.String... r4) {
            r1 = this;
            net.bytebuddy.jar.asm.ModuleVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitOpen(r2, r3, r4)
        L7:
            return
    }

    public void visitPackage(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.ModuleVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitPackage(r2)
        L7:
            return
    }

    public void visitProvide(java.lang.String r2, java.lang.String... r3) {
            r1 = this;
            net.bytebuddy.jar.asm.ModuleVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitProvide(r2, r3)
        L7:
            return
    }

    public void visitRequire(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            net.bytebuddy.jar.asm.ModuleVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitRequire(r2, r3, r4)
        L7:
            return
    }

    public void visitUse(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.ModuleVisitor r0 = r1.mv
            if (r0 == 0) goto L7
            r0.visitUse(r2)
        L7:
            return
    }
}
