package net.bytebuddy.utility.visitor;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ContextClassVisitor extends net.bytebuddy.jar.asm.ClassVisitor {
    private boolean active;

    public ContextClassVisitor(net.bytebuddy.jar.asm.ClassVisitor r2) {
            r1 = this;
            int r0 = net.bytebuddy.utility.OpenedClassReader.ASM_API
            r1.<init>(r0, r2)
            return
    }

    public net.bytebuddy.utility.visitor.ContextClassVisitor active() {
            r1 = this;
            r0 = 1
            r1.active = r0
            return r1
    }

    public abstract java.util.List<net.bytebuddy.dynamic.DynamicType> getAuxiliaryTypes();

    public abstract net.bytebuddy.implementation.LoadedTypeInitializer getLoadedTypeInitializer();

    @Override // net.bytebuddy.jar.asm.ClassVisitor
    public void visitEnd() {
            r3 = this;
            super.visitEnd()
            boolean r0 = r3.active
            if (r0 != 0) goto L33
            java.util.List r0 = r3.getAuxiliaryTypes()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1c
            net.bytebuddy.implementation.LoadedTypeInitializer r0 = r3.getLoadedTypeInitializer()
            boolean r0 = r0.isAlive()
            if (r0 != 0) goto L1c
            goto L33
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = " is not defined 'active' but defines auxiliary types or an alive type initializer"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L33:
            return
    }
}
