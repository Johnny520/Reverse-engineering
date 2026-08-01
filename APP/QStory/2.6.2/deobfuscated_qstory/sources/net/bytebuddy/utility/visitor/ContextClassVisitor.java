package net.bytebuddy.utility.visitor;

import java.util.List;
import lin.xposed.hook.javaplugin.C5553;
import net.bytebuddy.dynamic.DynamicType;
import net.bytebuddy.implementation.LoadedTypeInitializer;
import net.bytebuddy.jar.asm.ClassVisitor;
import net.bytebuddy.utility.OpenedClassReader;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class ContextClassVisitor extends ClassVisitor {
    private boolean active;

    public ContextClassVisitor(ClassVisitor classVisitor) {
        super(OpenedClassReader.ASM_API, classVisitor);
    }

    public ContextClassVisitor active() {
        this.active = true;
        return this;
    }

    public abstract List<DynamicType> getAuxiliaryTypes();

    public abstract LoadedTypeInitializer getLoadedTypeInitializer();

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public void visitEnd() {
        super.visitEnd();
        if (this.active) {
            return;
        }
        if (!getAuxiliaryTypes().isEmpty() || getLoadedTypeInitializer().isAlive()) {
            C5553.m10822(this, " is not defined 'active' but defines auxiliary types or an alive type initializer");
        }
    }
}
