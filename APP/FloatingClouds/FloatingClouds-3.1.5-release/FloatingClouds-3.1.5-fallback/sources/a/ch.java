package a;

/* JADX INFO: loaded from: classes.dex */
public final class ch implements top.mmjz.floatingclouds.plugin.IPlugin {
    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r12) {
            r11 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r12, r0)
            java.lang.ClassLoader r0 = r12.f136a
            r1 = 0
            if (r0 != 0) goto Lc
            r2 = r1
            goto L12
        Lc:
            java.lang.String r2 = "com.tencent.wcdb.database.SQLiteDatabase"
            java.lang.Class r2 = a.A1.b(r0, r2)
        L12:
            if (r2 != 0) goto L15
            return
        L15:
            if (r0 != 0) goto L19
            r6 = r1
            goto L20
        L19:
            java.lang.String r3 = "com.tencent.wcdb.database.SQLiteCipherSpec"
            java.lang.Class r3 = a.A1.b(r0, r3)
            r6 = r3
        L20:
            if (r0 != 0) goto L24
            r7 = r1
            goto L2b
        L24:
            java.lang.String r3 = "com.tencent.wcdb.database.SQLiteDatabase$CursorFactory"
            java.lang.Class r3 = a.A1.b(r0, r3)
            r7 = r3
        L2b:
            if (r0 != 0) goto L2f
        L2d:
            r9 = r1
            goto L36
        L2f:
            java.lang.String r1 = "com.tencent.wcdb.DatabaseErrorHandler"
            java.lang.Class r1 = a.A1.b(r0, r1)
            goto L2d
        L36:
            java.lang.Class r8 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            java.lang.Class<byte[]> r5 = byte[].class
            r10 = r8
            java.lang.Object[] r0 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9, r10}
            java.lang.String r1 = "openDatabase"
            java.lang.reflect.Method r0 = a.A1.d(r2, r1, r0)
            if (r0 != 0) goto L58
            java.lang.String r12 = "WXDbPlugin: openDatabase method not found"
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            r0 = 1
            java.lang.Object[] r12 = java.util.Arrays.copyOf(r12, r0)
            a.C0453x1.e(r12)
            return
        L58:
            io.github.libxposed.api.XposedInterface$HookBuilder r12 = r12.f(r0)
            a.v8 r0 = new a.v8
            r0.<init>()
            r12.intercept(r0)
            return
    }
}
