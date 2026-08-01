package net.bytebuddy.jar.asm;

import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ModuleVisitor {
    protected final int api;
    protected ModuleVisitor mv;

    public ModuleVisitor(int i, ModuleVisitor moduleVisitor) {
        if (i != 589824 && i != 524288 && i != 458752 && i != 393216 && i != 327680 && i != 262144 && i != 17432576) {
            C5925.m11310(stringConcat$0(i));
            throw null;
        }
        if (i == 17432576) {
            Constants.checkAsmExperimental(this);
        }
        this.api = i;
        this.mv = moduleVisitor;
    }

    private static /* synthetic */ String stringConcat$0(int i) {
        return AbstractC6183.m11588(i, "Unsupported api ");
    }

    public ModuleVisitor getDelegate() {
        return this.mv;
    }

    public void visitEnd() {
        ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitEnd();
        }
    }

    public void visitExport(String str, int i, String... strArr) {
        ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitExport(str, i, strArr);
        }
    }

    public void visitMainClass(String str) {
        ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitMainClass(str);
        }
    }

    public void visitOpen(String str, int i, String... strArr) {
        ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitOpen(str, i, strArr);
        }
    }

    public void visitPackage(String str) {
        ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitPackage(str);
        }
    }

    public void visitProvide(String str, String... strArr) {
        ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitProvide(str, strArr);
        }
    }

    public void visitRequire(String str, int i, String str2) {
        ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitRequire(str, i, str2);
        }
    }

    public void visitUse(String str) {
        ModuleVisitor moduleVisitor = this.mv;
        if (moduleVisitor != null) {
            moduleVisitor.visitUse(str);
        }
    }

    public ModuleVisitor(int i) {
        this(i, null);
    }
}
