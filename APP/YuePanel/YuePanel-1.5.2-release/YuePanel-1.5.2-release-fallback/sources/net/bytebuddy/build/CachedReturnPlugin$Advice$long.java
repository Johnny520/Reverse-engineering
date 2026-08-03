package net.bytebuddy.build;

/* JADX INFO: loaded from: classes2.dex */
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Name is chosen to optimize for simple lookup", value = {"NM_CLASS_NAMING_CONVENTION"})
class CachedReturnPlugin$Advice$long {
    private CachedReturnPlugin$Advice$long() {
            r2 = this;
            r2.<init>()
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This class is merely an advice template and should not be instantiated"
            r0.<init>(r1)
            throw r0
    }

    @net.bytebuddy.asm.Advice.OnMethodEnter(skipOn = net.bytebuddy.asm.Advice.OnNonDefaultValue.class)
    public static long enter(@net.bytebuddy.build.CachedReturnPlugin.CacheField long r0) {
            return r0
    }

    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings(justification = "Advice method serves as a template", value = {"UC_USELESS_VOID_METHOD", "DLS_DEAD_LOCAL_STORE"})
    @net.bytebuddy.asm.Advice.OnMethodExit
    public static void exit(@net.bytebuddy.asm.Advice.Return(readOnly = false) long r0, @net.bytebuddy.build.CachedReturnPlugin.CacheField long r2) {
            return
    }
}
