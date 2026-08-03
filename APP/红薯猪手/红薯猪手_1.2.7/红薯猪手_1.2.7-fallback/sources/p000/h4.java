package p000;

/* JADX INFO: loaded from: classes.dex */
public final class h4 {
    public h4() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static boolean m185(java.lang.Object r0, java.lang.Object r1) {
            if (r0 != 0) goto L8
            if (r1 != 0) goto L6
            r0 = 1
            goto Lc
        L6:
            r0 = 0
            goto Lc
        L8:
            boolean r0 = r0.equals(r1)
        Lc:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static void m186(java.lang.Object r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>()
            java.lang.Class<۟.h4> r0 = p000.h4.class
            java.lang.String r0 = r0.getName()
            m190(r0, r1)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static void m187(java.lang.String r0, java.lang.Object r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            r1.<init>(r0)
            java.lang.Class<۟.h4> r0 = p000.h4.class
            java.lang.String r0 = r0.getName()
            m190(r0, r1)
            throw r1
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public static void m188(java.lang.String r1, java.lang.Object r2) {
            if (r2 == 0) goto L3
            return
        L3:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = " must not be null"
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            r2.<init>(r1)
            java.lang.Class<۟.h4> r1 = p000.h4.class
            java.lang.String r1 = r1.getName()
            m190(r1, r2)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public static void m189(java.lang.String r5, java.lang.Object r6) {
            if (r6 != 0) goto L67
            java.lang.Class<۟.h4> r6 = p000.h4.class
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            java.lang.String r2 = r6.getName()
            r3 = 0
        L13:
            r4 = r1[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L22
            int r3 = r3 + 1
            goto L13
        L22:
            r4 = r1[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r4.equals(r2)
            if (r4 == 0) goto L31
            int r3 = r3 + 1
            goto L22
        L31:
            r1 = r1[r3]
            java.lang.String r2 = r1.getClassName()
            java.lang.String r1 = r1.getMethodName()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Parameter specified as non-null is null: method "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = "."
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = ", parameter "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.<init>(r5)
            java.lang.String r5 = r6.getName()
            m190(r5, r0)
            throw r0
        L67:
            return
    }

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public static void m190(java.lang.String r5, java.lang.RuntimeException r6) {
            java.lang.StackTraceElement[] r0 = r6.getStackTrace()
            int r1 = r0.length
            r2 = -1
            r3 = 0
        L7:
            if (r3 >= r1) goto L19
            r4 = r0[r3]
            java.lang.String r4 = r4.getClassName()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L16
            r2 = r3
        L16:
            int r3 = r3 + 1
            goto L7
        L19:
            int r2 = r2 + 1
            java.lang.Object[] r5 = java.util.Arrays.copyOfRange(r0, r2, r1)
            java.lang.StackTraceElement[] r5 = (java.lang.StackTraceElement[]) r5
            r6.setStackTrace(r5)
            return
    }

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static void m191(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "lateinit property "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " has not been initialized"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            ۟.ub r0 = new ۟.ub
            r0.<init>(r2)
            java.lang.Class<۟.h4> r2 = p000.h4.class
            java.lang.String r2 = r2.getName()
            m190(r2, r0)
            throw r0
    }
}
