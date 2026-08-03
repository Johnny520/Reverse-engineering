package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
class CachedReturnPlugin$Advice$Object {
    private CachedReturnPlugin$Advice$Object() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This class is merely an advice template and should not be instantiated"
            r0.<init>(r1)
            throw r0
    }

    @net.bytebuddy.asm.Advice.OnMethodEnter(skipOn = net.bytebuddy.asm.Advice.OnNonDefaultValue.class)
    public static java.lang.Object enter(@net.bytebuddy.build.CachedReturnPlugin.CacheField java.lang.Object r0) {
            return r0
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Advice method serves as a template", value = {"UC_USELESS_VOID_METHOD", "DLS_DEAD_LOCAL_STORE"})
    @net.bytebuddy.asm.Advice.OnMethodExit
    public static void exit(@net.bytebuddy.asm.Advice.Return(readOnly = false, typing = net.bytebuddy.implementation.bytecode.assign.Assigner.Typing.DYNAMIC) java.lang.Object r0, @net.bytebuddy.build.CachedReturnPlugin.CacheField java.lang.Object r1) {
            return
    }
}
