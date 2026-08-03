package a;

/* JADX INFO: renamed from: a.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0453x1 {
    public static final void a(java.lang.Object... r1) {
            java.lang.String r0 = "args"
            a.C0193i9.e(r1, r0)
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r0 = 6
            c(r0, r1)
            return
    }

    public static final void b(java.lang.Object... r1) {
            java.lang.String r0 = "args"
            a.C0193i9.e(r1, r0)
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r0 = 4
            c(r0, r1)
            return
    }

    public static void c(int r5, java.lang.Object... r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L34
            r3 = r6[r2]
            int r4 = r0.length()
            if (r4 <= 0) goto L16
            java.lang.String r4 = " "
            r0.append(r4)
        L16:
            boolean r4 = r3 instanceof java.lang.Throwable
            if (r4 == 0) goto L24
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            java.lang.String r3 = android.util.Log.getStackTraceString(r3)
            r0.append(r3)
            goto L31
        L24:
            if (r3 == 0) goto L2c
            java.lang.String r3 = r3.toString()
            if (r3 != 0) goto L2e
        L2c:
            java.lang.String r3 = "null"
        L2e:
            r0.append(r3)
        L31:
            int r2 = r2 + 1
            goto L7
        L34:
            java.lang.String r6 = r0.toString()
            top.mmjz.floatingclouds.XposedEntry$a r0 = top.mmjz.floatingclouds.XposedEntry.Companion
            r0.getClass()
            top.mmjz.floatingclouds.XposedEntry r0 = top.mmjz.floatingclouds.XposedEntry.access$getSelf$cp()
            java.lang.String r1 = "Floatingclouds"
            if (r0 == 0) goto L4f
            r0.log(r5, r1, r6)     // Catch: java.lang.Throwable -> L4b
            a.Wf r5 = a.Wf.f330a     // Catch: java.lang.Throwable -> L4b
            return
        L4b:
            android.util.Log.println(r5, r1, r6)
            return
        L4f:
            android.util.Log.println(r5, r1, r6)
            return
    }

    public static final void d(int r5, java.lang.String r6, java.lang.Exception r7) {
            java.lang.String r0 = "msg"
            a.C0193i9.e(r6, r0)
            top.mmjz.floatingclouds.XposedEntry$a r0 = top.mmjz.floatingclouds.XposedEntry.Companion
            r0.getClass()
            top.mmjz.floatingclouds.XposedEntry r0 = top.mmjz.floatingclouds.XposedEntry.access$getSelf$cp()
            java.lang.String r1 = "Floatingclouds_Config"
            java.lang.String r2 = "\n"
            if (r0 == 0) goto L54
            if (r7 == 0) goto L2d
            java.lang.String r3 = android.util.Log.getStackTraceString(r7)     // Catch: java.lang.Throwable -> L34
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L34
            r4.<init>()     // Catch: java.lang.Throwable -> L34
            r4.append(r6)     // Catch: java.lang.Throwable -> L34
            r4.append(r2)     // Catch: java.lang.Throwable -> L34
            r4.append(r3)     // Catch: java.lang.Throwable -> L34
            java.lang.String r3 = r4.toString()     // Catch: java.lang.Throwable -> L34
            goto L2e
        L2d:
            r3 = r6
        L2e:
            r0.log(r5, r1, r3)     // Catch: java.lang.Throwable -> L34
            a.Wf r5 = a.Wf.f330a     // Catch: java.lang.Throwable -> L34
            return
        L34:
            if (r7 == 0) goto L50
            java.lang.String r7 = android.util.Log.getStackTraceString(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            android.util.Log.println(r5, r1, r6)
            goto L53
        L50:
            android.util.Log.println(r5, r1, r6)
        L53:
            return
        L54:
            if (r7 == 0) goto L70
            java.lang.String r7 = android.util.Log.getStackTraceString(r7)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r6 = r0.toString()
            android.util.Log.println(r5, r1, r6)
            return
        L70:
            android.util.Log.println(r5, r1, r6)
            return
    }

    public static final void e(java.lang.Object... r1) {
            java.lang.String r0 = "args"
            a.C0193i9.e(r1, r0)
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            r0 = 5
            c(r0, r1)
            return
    }
}
