package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public class p {
    public p() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(java.lang.Object r4) {
            r0 = 0
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Exception -> L14
            java.lang.String r2 = "getParentFragment"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L14
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L14
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L14
            java.lang.Object r1 = r1.invoke(r4, r2)     // Catch: java.lang.Exception -> L14
            goto L15
        L14:
            r1 = 0
        L15:
            r2 = 1
            if (r1 != 0) goto L2b
            boolean r1 = c(r4)     // Catch: java.lang.Exception -> L50
            if (r1 != 0) goto L50
            boolean r1 = b(r4)     // Catch: java.lang.Exception -> L50
            if (r1 == 0) goto L50
            boolean r4 = e(r4)     // Catch: java.lang.Exception -> L50
            if (r4 == 0) goto L50
            return r2
        L2b:
            boolean r3 = c(r4)     // Catch: java.lang.Exception -> L50
            if (r3 != 0) goto L50
            boolean r3 = b(r4)     // Catch: java.lang.Exception -> L50
            if (r3 == 0) goto L50
            boolean r4 = e(r4)     // Catch: java.lang.Exception -> L50
            if (r4 == 0) goto L50
            boolean r4 = c(r1)     // Catch: java.lang.Exception -> L50
            if (r4 != 0) goto L50
            boolean r4 = b(r1)     // Catch: java.lang.Exception -> L50
            if (r4 == 0) goto L50
            boolean r4 = e(r1)     // Catch: java.lang.Exception -> L50
            if (r4 == 0) goto L50
            return r2
        L50:
            return r0
    }

    public static boolean b(java.lang.Object r4) {
            r0 = 0
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Exception -> L1a
            java.lang.String r2 = "getUserVisibleHint"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L1a
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L1a
            java.lang.Object r4 = r1.invoke(r4, r2)     // Catch: java.lang.Exception -> L1a
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L1a
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L1a
            return r4
        L1a:
            return r0
    }

    public static boolean c(java.lang.Object r4) {
            r0 = 0
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Exception -> L1a
            java.lang.String r2 = "isHidden"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L1a
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L1a
            java.lang.Object r4 = r1.invoke(r4, r2)     // Catch: java.lang.Exception -> L1a
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L1a
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L1a
            return r4
        L1a:
            return r0
    }

    public static boolean d(java.lang.Object r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 0
            java.lang.String r2 = "android.app.Fragment"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> Lc
            goto Ld
        Lc:
            r2 = r1
        Ld:
            java.lang.String r3 = "android.support.v4.app.Fragment"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Exception -> L14
            goto L15
        L14:
            r3 = r1
        L15:
            java.lang.String r4 = "androidx.fragment.app.Fragment"
            java.lang.Class r1 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L1b
        L1b:
            if (r3 != 0) goto L22
            if (r1 != 0) goto L22
            if (r2 != 0) goto L22
            return r0
        L22:
            if (r3 == 0) goto L2a
            boolean r3 = r3.isInstance(r5)     // Catch: java.lang.Exception -> L3c
            if (r3 != 0) goto L3a
        L2a:
            if (r1 == 0) goto L32
            boolean r1 = r1.isInstance(r5)     // Catch: java.lang.Exception -> L3c
            if (r1 != 0) goto L3a
        L32:
            if (r2 == 0) goto L3c
            boolean r5 = r2.isInstance(r5)     // Catch: java.lang.Exception -> L3c
            if (r5 == 0) goto L3c
        L3a:
            r5 = 1
            return r5
        L3c:
            return r0
    }

    public static boolean e(java.lang.Object r4) {
            r0 = 0
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Exception -> L1a
            java.lang.String r2 = "isResumed"
            java.lang.Class[] r3 = new java.lang.Class[r0]     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Method r1 = r1.getMethod(r2, r3)     // Catch: java.lang.Exception -> L1a
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch: java.lang.Exception -> L1a
            java.lang.Object r4 = r1.invoke(r4, r2)     // Catch: java.lang.Exception -> L1a
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L1a
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L1a
            return r4
        L1a:
            return r0
    }
}
