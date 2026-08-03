package a;

/* JADX INFO: renamed from: a.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0168h2 implements top.mmjz.floatingclouds.plugin.IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r8) {
            r7 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r8, r0)
            java.lang.String r0 = "=== BlockContactInfo handleHook START ==="
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            java.lang.ClassLoader r0 = r8.f136a
            java.lang.String r2 = "com.tencent.mm.plugin.profile.ui.ContactInfoUI"
            java.lang.Class r0 = a.A1.b(r0, r2)
            if (r0 != 0) goto L2b
            java.lang.String r8 = "BlockContactInfo: ERROR - com.tencent.mm.plugin.profile.ui.ContactInfoUI not found"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r1)
            a.C0453x1.b(r8)
            return
        L2b:
            java.lang.String r0 = "BlockContactInfo: found com.tencent.mm.plugin.profile.ui.ContactInfoUI"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            java.lang.String r0 = "onCreate"
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            java.lang.Class[] r3 = new java.lang.Class[]{r3}     // Catch: java.lang.Throwable -> L59
            a.g2 r4 = new a.g2     // Catch: java.lang.Throwable -> L59
            r5 = 0
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L59
            a.J8.a(r8, r2, r0, r3, r4)     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = "BlockContactInfo: hooked onCreate (afterHookedMethod)"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L59
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch: java.lang.Throwable -> L59
            a.C0453x1.b(r0)     // Catch: java.lang.Throwable -> L59
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L59
            goto L5e
        L59:
            r0 = move-exception
            a.wd$a r0 = a.C0465xd.a(r0)
        L5e:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            r3 = 2
            if (r0 == 0) goto L72
            java.lang.String r4 = "BlockContactInfo: hook onCreate FAILED"
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            a.C0453x1.b(r0)
        L72:
            java.lang.String r0 = "onResume"
            r4 = 0
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L90
            a.g2 r5 = new a.g2     // Catch: java.lang.Throwable -> L90
            r6 = 1
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L90
            a.J8.a(r8, r2, r0, r4, r5)     // Catch: java.lang.Throwable -> L90
            java.lang.String r8 = "BlockContactInfo: hooked onResume (fallback)"
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L90
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r1)     // Catch: java.lang.Throwable -> L90
            a.C0453x1.b(r8)     // Catch: java.lang.Throwable -> L90
            a.Wf r8 = a.Wf.f330a     // Catch: java.lang.Throwable -> L90
            goto L95
        L90:
            r8 = move-exception
            a.wd$a r8 = a.C0465xd.a(r8)
        L95:
            java.lang.Throwable r8 = a.C0447wd.a(r8)
            if (r8 == 0) goto La8
            java.lang.String r0 = "BlockContactInfo: hook onResume FAILED"
            java.lang.Object[] r8 = new java.lang.Object[]{r0, r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r3)
            a.C0453x1.b(r8)
        La8:
            java.lang.String r8 = "=== BlockContactInfo handleHook DONE ==="
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r1)
            a.C0453x1.b(r8)
            return
    }
}
