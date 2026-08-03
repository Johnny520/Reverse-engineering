package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
final class c {



    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void a(android.app.Activity r2, com.tendcloud.tenddata.a r3) {
            r0 = 0
            com.tendcloud.tenddata.ab.n = r0     // Catch: java.lang.Throwable -> L26
            android.os.Handler r1 = com.tendcloud.tenddata.zz.b()     // Catch: java.lang.Throwable -> L26
            r1.removeMessages(r0)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L1e
            int r2 = r2.getChangingConfigurations()     // Catch: java.lang.Throwable -> L26
            r0 = 128(0x80, float:1.8E-43)
            r2 = r2 & r0
            if (r2 != r0) goto L1e
            java.lang.String r2 = "Ignore page changing during screen switch"
            com.tendcloud.tenddata.h.iForDeveloper(r2)     // Catch: java.lang.Throwable -> L26
            r2 = 1
            com.tendcloud.tenddata.zz.d = r2     // Catch: java.lang.Throwable -> L26
            return
        L1e:
            com.tendcloud.tenddata.c$1 r2 = new com.tendcloud.tenddata.c$1     // Catch: java.lang.Throwable -> L26
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            com.tendcloud.tenddata.y.execute(r2)     // Catch: java.lang.Throwable -> L26
        L26:
            return
    }

    public static void a(com.tendcloud.tenddata.a r1) {
            boolean r0 = com.tendcloud.tenddata.ab.J
            if (r0 != 0) goto Le
            boolean r0 = a()
            if (r0 == 0) goto Le
            r0 = 0
            a(r0, r1)
        Le:
            return
    }

    private static boolean a() {
            r0 = 0
            java.lang.String r1 = "android.app.Activity"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "isResumed"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L23
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L23
            android.app.Activity r2 = b()     // Catch: java.lang.Throwable -> L23
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.invoke(r2, r3)     // Catch: java.lang.Throwable -> L23
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L23
            boolean r0 = r1.booleanValue()     // Catch: java.lang.Throwable -> L23
            r1 = 1
            com.tendcloud.tenddata.ab.J = r1     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r1 = move-exception
            com.tendcloud.tenddata.h.eForInternal(r1)
        L27:
            return r0
    }

    private static android.app.Activity b() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r2 = "currentActivityThread"
            r3 = 0
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r2 = r2.invoke(r0, r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r3 = "mActivities"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L5b
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L5b
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L5b
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L5b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L5b
        L2e:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L5b
            if (r2 == 0) goto L5b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L5b
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r5 = "paused"
            java.lang.reflect.Field r5 = r4.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L5b
            r5.setAccessible(r3)     // Catch: java.lang.Throwable -> L5b
            boolean r5 = r5.getBoolean(r2)     // Catch: java.lang.Throwable -> L5b
            if (r5 != 0) goto L2e
            java.lang.String r1 = "activity"
            java.lang.reflect.Field r1 = r4.getDeclaredField(r1)     // Catch: java.lang.Throwable -> L5b
            r1.setAccessible(r3)     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L5b
            android.app.Activity r1 = (android.app.Activity) r1     // Catch: java.lang.Throwable -> L5b
            return r1
        L5b:
            return r0
    }

    public static void b(android.app.Activity r4, com.tendcloud.tenddata.a r5) {
            boolean r0 = com.tendcloud.tenddata.ab.J     // Catch: java.lang.Throwable -> L29
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 1
            com.tendcloud.tenddata.ab.n = r0     // Catch: java.lang.Throwable -> L29
            android.os.Handler r0 = com.tendcloud.tenddata.zz.b()     // Catch: java.lang.Throwable -> L29
            r1 = 0
            r0.removeMessages(r1)     // Catch: java.lang.Throwable -> L29
            android.os.Message r0 = android.os.Message.obtain()     // Catch: java.lang.Throwable -> L29
            r0.obj = r5     // Catch: java.lang.Throwable -> L29
            r0.what = r1     // Catch: java.lang.Throwable -> L29
            android.os.Handler r1 = com.tendcloud.tenddata.zz.b()     // Catch: java.lang.Throwable -> L29
            r2 = 30000(0x7530, double:1.4822E-319)
            r1.sendMessageDelayed(r0, r2)     // Catch: java.lang.Throwable -> L29
            com.tendcloud.tenddata.c$2 r0 = new com.tendcloud.tenddata.c$2     // Catch: java.lang.Throwable -> L29
            r0.<init>(r5, r4)     // Catch: java.lang.Throwable -> L29
            com.tendcloud.tenddata.y.execute(r0)     // Catch: java.lang.Throwable -> L29
        L29:
            return
    }
}
