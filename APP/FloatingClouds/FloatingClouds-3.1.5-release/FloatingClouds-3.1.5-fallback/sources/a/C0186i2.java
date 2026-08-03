package a;

/* JADX INFO: renamed from: a.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0186i2 implements top.mmjz.floatingclouds.plugin.IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r3) {
            r2 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r3, r0)
            a.if r0 = a.Cif.f512a     // Catch: java.lang.Throwable -> L12
            java.lang.ClassLoader r1 = r3.f136a     // Catch: java.lang.Throwable -> L12
            r0.getClass()     // Catch: java.lang.Throwable -> L12
            a.Cif.b(r1, r3)     // Catch: java.lang.Throwable -> L12
            a.Wf r3 = a.Wf.f330a     // Catch: java.lang.Throwable -> L12
            goto L17
        L12:
            r3 = move-exception
            a.wd$a r3 = a.C0465xd.a(r3)
        L17:
            java.lang.Throwable r3 = a.C0447wd.a(r3)
            if (r3 == 0) goto L2b
            java.lang.String r0 = "[BlockHotUpdate] diagnose FAILED"
            java.lang.Object[] r3 = new java.lang.Object[]{r0, r3}
            r0 = 2
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            a.C0453x1.a(r3)
        L2b:
            java.lang.String r3 = "[BlockHotUpdate] diagnostic Part DONE"
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            r0 = 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            a.C0453x1.b(r3)
            return
    }
}
