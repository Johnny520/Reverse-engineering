package a;

/* JADX INFO: renamed from: a.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0100d6 implements top.mmjz.floatingclouds.plugin.IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r6) {
            r5 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r6, r0)
            java.lang.String r0 = "android.app.Activity"
            java.lang.String r1 = "onCreate"
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            java.lang.Class[] r2 = new java.lang.Class[]{r2}     // Catch: java.lang.Throwable -> L1b
            a.g2 r3 = new a.g2     // Catch: java.lang.Throwable -> L1b
            r4 = 15
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1b
            io.github.libxposed.api.XposedInterface$HookHandle r0 = a.J8.a(r6, r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L1b
            goto L20
        L1b:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L20:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L34
            java.lang.String r1 = "hook Activity.onCreate for blockEnterChat fail"
            java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
            r1 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
        L34:
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            a.t r1 = new a.t
            r2 = 2
            r1.<init>(r5, r6, r2)
            java.lang.String r2 = "com.tencent.mm.ui.chatting.ChattingUIProxy"
            java.lang.String r3 = "onEnterBegin"
            a.J8.a(r6, r2, r3, r0, r1)
            return
    }
}
