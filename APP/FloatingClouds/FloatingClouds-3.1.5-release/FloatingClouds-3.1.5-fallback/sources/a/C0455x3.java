package a;

/* JADX INFO: renamed from: a.x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0455x3 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.Me f757a;

    public C0455x3() {
            r2 = this;
            r2.<init>()
            a.w3 r0 = new a.w3
            r1 = 0
            r0.<init>(r1)
            a.Me r1 = new a.Me
            r1.<init>(r0)
            r2.f757a = r1
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r7) {
            r6 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r7, r0)
            java.lang.ClassLoader r0 = r7.f136a
            if (r0 != 0) goto Lb
            r0 = 0
            goto L11
        Lb:
            java.lang.String r1 = "com.tencent.wcdb.database.SQLiteDatabase"
            java.lang.Class r0 = a.A1.b(r0, r1)
        L11:
            if (r0 != 0) goto L14
            goto L34
        L14:
            a.g2 r1 = new a.g2
            r2 = 3
            r1.<init>(r2)
            java.lang.reflect.Method[] r0 = a.A1.f(r0, r1)
            int r1 = r0.length
            r2 = 0
        L20:
            if (r2 >= r1) goto L34
            r3 = r0[r2]
            io.github.libxposed.api.XposedInterface$HookBuilder r3 = r7.f(r3)
            a.m2 r4 = new a.m2
            r5 = 1
            r4.<init>(r5, r6)
            r3.intercept(r4)
            int r2 = r2 + 1
            goto L20
        L34:
            return
    }
}
