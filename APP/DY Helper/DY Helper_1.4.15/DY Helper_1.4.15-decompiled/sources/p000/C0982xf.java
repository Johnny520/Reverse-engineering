package p000;

/* JADX INFO: renamed from: xf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0982xf {

    /* JADX INFO: renamed from: α */
    public final java.util.HashMap f12152;

    /* JADX INFO: renamed from: β */
    public final java.util.HashMap f12153;

    public C0982xf(java.util.HashMap r5) {
            r4 = this;
            r4.<init>()
            r4.f12153 = r5
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.f12152 = r0
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getValue()
            br0 r1 = (p000.br0) r1
            java.util.HashMap r2 = r4.f12152
            java.lang.Object r2 = r2.get(r1)
            java.util.List r2 = (java.util.List) r2
            if (r2 != 0) goto L3a
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.HashMap r3 = r4.f12152
            r3.put(r1, r2)
        L3a:
            java.lang.Object r0 = r0.getKey()
            yf r0 = (p000.C1019yf) r0
            r2.add(r0)
            goto L14
        L44:
            return
    }

    /* JADX INFO: renamed from: α */
    public static void m6630(java.util.List r5, p000.hr0 r6, p000.br0 r7, java.lang.Object r8) {
            if (r5 == 0) goto L47
            int r0 = r5.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            if (r0 < 0) goto L47
            java.lang.Object r2 = r5.get(r0)
            yf r2 = (p000.C1019yf) r2
            java.lang.reflect.Method r3 = r2.f12597
            int r2 = r2.f12596     // Catch: java.lang.IllegalAccessException -> L33 java.lang.reflect.InvocationTargetException -> L3a
            if (r2 == 0) goto L2c
            if (r2 == r1) goto L24
            r4 = 2
            if (r2 == r4) goto L1c
            goto L30
        L1c:
            java.lang.Object[] r2 = new java.lang.Object[]{r6, r7}     // Catch: java.lang.IllegalAccessException -> L33 java.lang.reflect.InvocationTargetException -> L3a
            r3.invoke(r8, r2)     // Catch: java.lang.IllegalAccessException -> L33 java.lang.reflect.InvocationTargetException -> L3a
            goto L30
        L24:
            java.lang.Object[] r2 = new java.lang.Object[]{r6}     // Catch: java.lang.IllegalAccessException -> L33 java.lang.reflect.InvocationTargetException -> L3a
            r3.invoke(r8, r2)     // Catch: java.lang.IllegalAccessException -> L33 java.lang.reflect.InvocationTargetException -> L3a
            goto L30
        L2c:
            r2 = 0
            r3.invoke(r8, r2)     // Catch: java.lang.IllegalAccessException -> L33 java.lang.reflect.InvocationTargetException -> L3a
        L30:
            int r0 = r0 + (-1)
            goto L8
        L33:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L3a:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r7 = "Failed to call observer method"
            java.lang.Throwable r5 = r5.getCause()
            r6.<init>(r7, r5)
            throw r6
        L47:
            return
    }
}
