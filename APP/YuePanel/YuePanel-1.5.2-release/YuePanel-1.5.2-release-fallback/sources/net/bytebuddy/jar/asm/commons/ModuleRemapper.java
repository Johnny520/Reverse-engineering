package net.bytebuddy.jar.asm.commons;

/* JADX INFO: loaded from: classes2.dex */
public class ModuleRemapper extends net.bytebuddy.jar.asm.ModuleVisitor {
    protected final net.bytebuddy.jar.asm.commons.Remapper remapper;

    public ModuleRemapper(int r1, net.bytebuddy.jar.asm.ModuleVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.remapper = r3
            return
    }

    public ModuleRemapper(net.bytebuddy.jar.asm.ModuleVisitor r2, net.bytebuddy.jar.asm.commons.Remapper r3) {
            r1 = this;
            r0 = 589824(0x90000, float:8.2652E-40)
            r1.<init>(r0, r2, r3)
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitExport(java.lang.String r5, int r6, java.lang.String... r7) {
            r4 = this;
            if (r7 == 0) goto L16
            int r0 = r7.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L6:
            int r2 = r7.length
            if (r1 >= r2) goto L17
            net.bytebuddy.jar.asm.commons.Remapper r2 = r4.remapper
            r3 = r7[r1]
            java.lang.String r2 = r2.mapModuleName(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L6
        L16:
            r0 = 0
        L17:
            net.bytebuddy.jar.asm.commons.Remapper r7 = r4.remapper
            java.lang.String r5 = r7.mapPackageName(r5)
            super.visitExport(r5, r6, r0)
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitMainClass(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r2 = r0.mapType(r2)
            super.visitMainClass(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitOpen(java.lang.String r5, int r6, java.lang.String... r7) {
            r4 = this;
            if (r7 == 0) goto L16
            int r0 = r7.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L6:
            int r2 = r7.length
            if (r1 >= r2) goto L17
            net.bytebuddy.jar.asm.commons.Remapper r2 = r4.remapper
            r3 = r7[r1]
            java.lang.String r2 = r2.mapModuleName(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L6
        L16:
            r0 = 0
        L17:
            net.bytebuddy.jar.asm.commons.Remapper r7 = r4.remapper
            java.lang.String r5 = r7.mapPackageName(r5)
            super.visitOpen(r5, r6, r0)
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitPackage(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r2 = r0.mapPackageName(r2)
            super.visitPackage(r2)
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitProvide(java.lang.String r5, java.lang.String... r6) {
            r4 = this;
            int r0 = r6.length
            java.lang.String[] r0 = new java.lang.String[r0]
            r1 = 0
        L4:
            int r2 = r6.length
            if (r1 >= r2) goto L14
            net.bytebuddy.jar.asm.commons.Remapper r2 = r4.remapper
            r3 = r6[r1]
            java.lang.String r2 = r2.mapType(r3)
            r0[r1] = r2
            int r1 = r1 + 1
            goto L4
        L14:
            net.bytebuddy.jar.asm.commons.Remapper r6 = r4.remapper
            java.lang.String r5 = r6.mapType(r5)
            super.visitProvide(r5, r0)
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitRequire(java.lang.String r2, int r3, java.lang.String r4) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r2 = r0.mapModuleName(r2)
            super.visitRequire(r2, r3, r4)
            return
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitUse(java.lang.String r2) {
            r1 = this;
            net.bytebuddy.jar.asm.commons.Remapper r0 = r1.remapper
            java.lang.String r2 = r0.mapType(r2)
            super.visitUse(r2)
            return
    }
}
