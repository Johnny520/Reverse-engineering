package a;

/* JADX INFO: renamed from: a.i9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0193i9 {
    public C0193i9() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
        L8:
            boolean r0 = r0.equals(r1)
            return r0
    }

    public static void b(java.lang.Object r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>()
            java.lang.Class<a.i9> r0 = a.C0193i9.class
            java.lang.String r0 = r0.getName()
            f(r1, r0)
            throw r1
    }

    public static void c(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            java.lang.Class<a.i9> r1 = a.C0193i9.class
            java.lang.String r1 = r1.getName()
            f(r0, r1)
            throw r0
    }

    public static void d(java.lang.Object r1, java.lang.String r2) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = " must not be null"
            java.lang.String r2 = r2.concat(r0)
            r1.<init>(r2)
            java.lang.Class<a.i9> r2 = a.C0193i9.class
            java.lang.String r2 = r2.getName()
            f(r1, r2)
            throw r1
    }

    public static void e(java.lang.Object r6, java.lang.String r7) {
            if (r6 != 0) goto L57
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.Class<a.i9> r1 = a.C0193i9.class
            java.lang.String r2 = r1.getName()
            r3 = 0
        L13:
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L22
            int r3 = r3 + 1
            goto L13
        L22:
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L31
            int r3 = r3 + 1
            goto L22
        L31:
            r0 = r0[r3]
            java.lang.String r2 = r0.getClassName()
            java.lang.String r0 = r0.getMethodName()
            java.lang.String r3 = "Parameter specified as non-null is null: method "
            java.lang.String r4 = "."
            java.lang.String r5 = ", parameter "
            java.lang.StringBuilder r0 = a.C0487z.i(r3, r2, r4, r0, r5)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            r6.<init>(r7)
            java.lang.String r7 = r1.getName()
            f(r6, r7)
            throw r6
        L57:
            return
    }

    public static void f(java.lang.RuntimeException r5, java.lang.String r6) {
            java.lang.StackTraceElement[] r0 = r5.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r6 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r6 = (java.lang.StackTraceElement[]) r6
            r5.setStackTrace(r6)
            return
    }

    public static void g(java.lang.String r2) {
            java.lang.String r0 = "lateinit property "
            java.lang.String r1 = " has not been initialized"
            java.lang.String r2 = a.C0487z.g(r0, r2, r1)
            a.Ob r0 = new a.Ob
            r0.<init>(r2)
            java.lang.Class<a.i9> r2 = a.C0193i9.class
            java.lang.String r2 = r2.getName()
            f(r0, r2)
            throw r0
    }
}
