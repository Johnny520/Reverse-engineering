package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
final class ad {
    private static final java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.Class<?>, java.util.Set<java.lang.reflect.Method>>> a = null;

    static {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            com.tendcloud.tenddata.ad.a = r0
            return
    }

    private ad() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.util.Map<java.lang.Class<?>, java.util.Set<com.tendcloud.tenddata.ae>> a(java.lang.Object r7) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.Class r1 = r7.getClass()     // Catch: java.lang.Throwable -> L62
            java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.Class<?>, java.util.Set<java.lang.reflect.Method>>> r2 = com.tendcloud.tenddata.ad.a     // Catch: java.lang.Throwable -> L62
            boolean r3 = r2.containsKey(r1)     // Catch: java.lang.Throwable -> L62
            if (r3 != 0) goto L14
            a(r1)     // Catch: java.lang.Throwable -> L62
        L14:
            java.lang.Object r1 = r2.get(r1)     // Catch: java.lang.Throwable -> L62
            java.util.Map r1 = (java.util.Map) r1     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L62
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L62
            if (r2 != 0) goto L62
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L62
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L62
        L2a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L62
            if (r2 == 0) goto L62
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L62
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L62
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L62
            r3.<init>()     // Catch: java.lang.Throwable -> L62
            java.lang.Object r4 = r2.getValue()     // Catch: java.lang.Throwable -> L62
            java.util.Set r4 = (java.util.Set) r4     // Catch: java.lang.Throwable -> L62
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L62
        L45:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L62
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L62
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch: java.lang.Throwable -> L62
            com.tendcloud.tenddata.ae r6 = new com.tendcloud.tenddata.ae     // Catch: java.lang.Throwable -> L62
            r6.<init>(r7, r5)     // Catch: java.lang.Throwable -> L62
            r3.add(r6)     // Catch: java.lang.Throwable -> L62
            goto L45
        L5a:
            java.lang.Object r2 = r2.getKey()     // Catch: java.lang.Throwable -> L62
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L62
            goto L2a
        L62:
            return r0
    }

    private static void a(java.lang.Class<?> r12) {
            java.util.HashMap r0 = new java.util.HashMap     // Catch: java.lang.Throwable -> La9
            r0.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.reflect.Method[] r1 = r12.getDeclaredMethods()     // Catch: java.lang.Throwable -> La9
            int r2 = r1.length     // Catch: java.lang.Throwable -> La9
            r3 = 0
            r4 = r3
        Lc:
            if (r4 >= r2) goto La4
            r5 = r1[r4]     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = r5.getName()     // Catch: java.lang.Throwable -> La9
            java.lang.String r7 = "onTDEBEvent"
            boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> La9
            if (r6 == 0) goto La0
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> La9
            int r6 = r6.length     // Catch: java.lang.Throwable -> La9
            r7 = 1
            if (r6 != r7) goto La0
            java.lang.Class[] r6 = r5.getParameterTypes()     // Catch: java.lang.Throwable -> La9
            int r8 = r6.length     // Catch: java.lang.Throwable -> La9
            java.lang.String r9 = "Method "
            if (r8 == r7) goto L48
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r10.<init>()     // Catch: java.lang.Throwable -> La9
            r10.append(r9)     // Catch: java.lang.Throwable -> La9
            r10.append(r5)     // Catch: java.lang.Throwable -> La9
            java.lang.String r11 = " must have one and only one argument."
            r10.append(r11)     // Catch: java.lang.Throwable -> La9
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> La9
            r8[r3] = r10     // Catch: java.lang.Throwable -> La9
            com.tendcloud.tenddata.h.eForInternal(r8)     // Catch: java.lang.Throwable -> La9
        L48:
            r6 = r6[r3]     // Catch: java.lang.Throwable -> La9
            boolean r8 = r6.isInterface()     // Catch: java.lang.Throwable -> La9
            if (r8 == 0) goto L6b
            java.lang.String[] r8 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r10.<init>()     // Catch: java.lang.Throwable -> La9
            r10.append(r9)     // Catch: java.lang.Throwable -> La9
            r10.append(r5)     // Catch: java.lang.Throwable -> La9
            java.lang.String r11 = " must have a argument whose type is a class which can be instantialized."
            r10.append(r11)     // Catch: java.lang.Throwable -> La9
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> La9
            r8[r3] = r10     // Catch: java.lang.Throwable -> La9
            com.tendcloud.tenddata.h.eForInternal(r8)     // Catch: java.lang.Throwable -> La9
        L6b:
            int r8 = r5.getModifiers()     // Catch: java.lang.Throwable -> La9
            r8 = r8 & r7
            if (r8 != 0) goto L8d
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r8.<init>()     // Catch: java.lang.Throwable -> La9
            r8.append(r9)     // Catch: java.lang.Throwable -> La9
            r8.append(r5)     // Catch: java.lang.Throwable -> La9
            java.lang.String r9 = " must be 'public'."
            r8.append(r9)     // Catch: java.lang.Throwable -> La9
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> La9
            r7[r3] = r8     // Catch: java.lang.Throwable -> La9
            com.tendcloud.tenddata.h.eForInternal(r7)     // Catch: java.lang.Throwable -> La9
        L8d:
            java.lang.Object r7 = r0.get(r6)     // Catch: java.lang.Throwable -> La9
            java.util.Set r7 = (java.util.Set) r7     // Catch: java.lang.Throwable -> La9
            if (r7 != 0) goto L9d
            java.util.HashSet r7 = new java.util.HashSet     // Catch: java.lang.Throwable -> La9
            r7.<init>()     // Catch: java.lang.Throwable -> La9
            r0.put(r6, r7)     // Catch: java.lang.Throwable -> La9
        L9d:
            r7.add(r5)     // Catch: java.lang.Throwable -> La9
        La0:
            int r4 = r4 + 1
            goto Lc
        La4:
            java.util.Map<java.lang.Class<?>, java.util.Map<java.lang.Class<?>, java.util.Set<java.lang.reflect.Method>>> r1 = com.tendcloud.tenddata.ad.a     // Catch: java.lang.Throwable -> La9
            r1.put(r12, r0)     // Catch: java.lang.Throwable -> La9
        La9:
            return
    }
}
