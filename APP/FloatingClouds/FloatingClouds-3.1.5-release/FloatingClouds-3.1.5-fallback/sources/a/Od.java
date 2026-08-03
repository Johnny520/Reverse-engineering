package a;

/* JADX INFO: loaded from: classes.dex */
public final class Od implements top.mmjz.floatingclouds.plugin.IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r10) {
            r9 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r10, r0)
            java.lang.String r0 = "home search "
            java.lang.String r1 = "L4"
            java.lang.String r2 = "P4"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2}
            java.util.List r1 = a.C0294o3.d0(r1)
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
        L18:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "SCP"
            if (r4 == 0) goto L7e
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r6 = "com.tencent.mm.plugin.fts.ui.FTSBaseMainUI"
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Throwable -> L52
            a.kd r8 = new a.kd     // Catch: java.lang.Throwable -> L52
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L52
            io.github.libxposed.api.XposedInterface$HookHandle r6 = a.J8.a(r10, r6, r4, r7, r8)     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L54
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r6.<init>()     // Catch: java.lang.Throwable -> L52
            r6.append(r0)     // Catch: java.lang.Throwable -> L52
            r6.append(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = " hooked"
            r6.append(r7)     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L52
            android.util.Log.i(r5, r6)     // Catch: java.lang.Throwable -> L52
            r3 = 1
            goto L54
        L52:
            r6 = move-exception
            goto L57
        L54:
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L52
            goto L5b
        L57:
            a.wd$a r6 = a.C0465xd.a(r6)
        L5b:
            java.lang.Throwable r6 = a.C0447wd.a(r6)
            if (r6 == 0) goto L7c
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            r7.append(r4)
            java.lang.String r4 = " hook failed: "
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r7.toString()
            android.util.Log.w(r5, r4)
        L7c:
            if (r3 == 0) goto L18
        L7e:
            if (r3 != 0) goto L91
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "home search hook failed on all candidates: "
            r10.<init>(r0)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r5, r10)
        L91:
            return
    }
}
