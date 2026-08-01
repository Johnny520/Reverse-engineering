package net.bytebuddy.jar.asm.commons;

import net.bytebuddy.jar.asm.ModuleVisitor;
import net.bytebuddy.jar.asm.Opcodes;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class ModuleRemapper extends ModuleVisitor {
    protected final Remapper remapper;

    public ModuleRemapper(ModuleVisitor moduleVisitor, Remapper remapper) {
        this(Opcodes.ASM9, moduleVisitor, remapper);
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitExport(String str, int i, String... strArr) {
        String[] strArr2;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr2[i2] = this.remapper.mapModuleName(strArr[i2]);
            }
        } else {
            strArr2 = null;
        }
        super.visitExport(this.remapper.mapPackageName(str), i, strArr2);
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitMainClass(String str) {
        super.visitMainClass(this.remapper.mapType(str));
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitOpen(String str, int i, String... strArr) {
        String[] strArr2;
        if (strArr != null) {
            strArr2 = new String[strArr.length];
            for (int i2 = 0; i2 < strArr.length; i2++) {
                strArr2[i2] = this.remapper.mapModuleName(strArr[i2]);
            }
        } else {
            strArr2 = null;
        }
        super.visitOpen(this.remapper.mapPackageName(str), i, strArr2);
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitPackage(String str) {
        super.visitPackage(this.remapper.mapPackageName(str));
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitProvide(String str, String... strArr) {
        String[] strArr2 = new String[strArr.length];
        int i = 0;
        while (true) {
            int length = strArr.length;
            Remapper remapper = this.remapper;
            if (i >= length) {
                super.visitProvide(remapper.mapType(str), strArr2);
                return;
            } else {
                strArr2[i] = remapper.mapType(strArr[i]);
                i++;
            }
        }
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitRequire(String str, int i, String str2) {
        super.visitRequire(this.remapper.mapModuleName(str), i, str2);
    }

    @Override // net.bytebuddy.jar.asm.ModuleVisitor
    public void visitUse(String str) {
        super.visitUse(this.remapper.mapType(str));
    }

    public ModuleRemapper(int i, ModuleVisitor moduleVisitor, Remapper remapper) {
        super(i, moduleVisitor);
        this.remapper = remapper;
    }
}
