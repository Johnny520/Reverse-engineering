package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ch0 {

    /* JADX INFO: renamed from: α */
    public static final p000.ch0 f2113 = null;

    /* JADX INFO: renamed from: β */
    public static final java.util.concurrent.ConcurrentHashMap f2114 = null;

    static {
            ch0 r0 = new ch0
            r0.<init>()
            p000.ch0.f2113 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            p000.ch0.f2114 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.reflect.Method m1179(java.lang.Class r6) {
            r0 = 0
            java.lang.reflect.Method[] r6 = r6.getMethods()     // Catch: java.lang.Throwable -> L31
            r6.getClass()     // Catch: java.lang.Throwable -> L31
            int r1 = r6.length     // Catch: java.lang.Throwable -> L31
            r2 = 0
        La:
            if (r2 >= r1) goto L36
            r3 = r6[r2]     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r3.getName()     // Catch: java.lang.Throwable -> L31
            java.lang.String r5 = "getConversationId"
            boolean r4 = p000.ln0.m3626(r4, r5)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L33
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.Throwable -> L31
            r4.getClass()     // Catch: java.lang.Throwable -> L31
            int r4 = r4.length     // Catch: java.lang.Throwable -> L31
            if (r4 != 0) goto L33
            java.lang.Class<java.lang.CharSequence> r4 = java.lang.CharSequence.class
            java.lang.Class r5 = r3.getReturnType()     // Catch: java.lang.Throwable -> L31
            boolean r4 = r4.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L33
            goto L3d
        L31:
            r6 = move-exception
            goto L38
        L33:
            int r2 = r2 + 1
            goto La
        L36:
            r3 = r0
            goto L3d
        L38:
            eo1 r3 = new eo1
            r3.<init>(r6)
        L3d:
            boolean r6 = r3 instanceof p000.eo1
            if (r6 == 0) goto L42
            goto L43
        L42:
            r0 = r3
        L43:
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0
            return r0
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m1180(java.lang.Object r3) {
            java.lang.Class r0 = r3.getClass()
            java.lang.reflect.Method r0 = m1179(r0)
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r3 = m1181(r3)     // Catch: java.lang.Throwable -> L19
            goto L20
        L19:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L20:
            boolean r0 = r3 instanceof p000.eo1
            if (r0 == 0) goto L25
            goto L26
        L25:
            r1 = r3
        L26:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    /* JADX INFO: renamed from: γ */
    public static java.lang.String m1181(java.lang.Object r2) {
            boolean r0 = r2 instanceof java.lang.CharSequence
            r1 = 0
            if (r0 == 0) goto L8
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            goto L9
        L8:
            r2 = r1
        L9:
            if (r2 == 0) goto L1a
            java.lang.String r2 = r2.toString()
            if (r2 == 0) goto L1a
            java.lang.CharSequence r2 = p000.q02.m4660(r2)
            java.lang.String r2 = r2.toString()
            goto L1b
        L1a:
            r2 = r1
        L1b:
            if (r2 != 0) goto L1f
            java.lang.String r2 = ""
        L1f:
            int r0 = r2.length()
            if (r0 <= 0) goto L2e
            java.lang.String r0 = "null"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L2e
            return r2
        L2e:
            return r1
    }

    /* JADX INFO: renamed from: δ */
    public static java.lang.String m1182(java.lang.Object r3, p000.bh0 r4) {
            java.lang.reflect.Field r0 = r4.f1717
            r1 = 0
            java.lang.reflect.Method r4 = r4.f1718     // Catch: java.lang.Throwable -> L1d
            r2 = 1
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r0.get(r3)     // Catch: java.lang.Throwable -> L1d
            if (r3 != 0) goto L11
            r3 = r1
            goto L24
        L11:
            r4.setAccessible(r2)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r3 = r4.invoke(r3, r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = m1181(r3)     // Catch: java.lang.Throwable -> L1d
            goto L24
        L1d:
            r3 = move-exception
            eo1 r4 = new eo1
            r4.<init>(r3)
            r3 = r4
        L24:
            boolean r4 = r3 instanceof p000.eo1
            if (r4 == 0) goto L29
            goto L2a
        L29:
            r1 = r3
        L2a:
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }
}
