package com.tendcloud.tenddata;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    private static volatile com.tendcloud.tenddata.z a;
    private final java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.Set<com.tendcloud.tenddata.ae>> b;
    private final java.lang.ThreadLocal<java.util.concurrent.ConcurrentLinkedQueue<com.tendcloud.tenddata.z.a>> c;
    private final java.lang.ThreadLocal<java.lang.Boolean> d;
    private final java.util.Map<java.lang.Class<?>, java.util.Set<java.lang.Class<?>>> e;



    public static class a {
        public final java.lang.Object event;
        public final com.tendcloud.tenddata.ae handler;

        public a(java.lang.Object r1, com.tendcloud.tenddata.ae r2) {
                r0 = this;
                r0.<init>()
                r0.event = r1
                r0.handler = r2
                return
        }
    }

    private z() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.b = r0
            com.tendcloud.tenddata.z$1 r0 = new com.tendcloud.tenddata.z$1
            r0.<init>(r1)
            r1.c = r0
            com.tendcloud.tenddata.z$2 r0 = new com.tendcloud.tenddata.z$2
            r0.<init>(r1)
            r1.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            return
    }

    public static com.tendcloud.tenddata.z a() {
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a
            if (r0 != 0) goto L17
            java.lang.Class<com.tendcloud.tenddata.z> r0 = com.tendcloud.tenddata.z.class
            monitor-enter(r0)
            com.tendcloud.tenddata.z r1 = com.tendcloud.tenddata.z.a     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L12
            com.tendcloud.tenddata.z r1 = new com.tendcloud.tenddata.z     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            com.tendcloud.tenddata.z.a = r1     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r1
        L17:
            com.tendcloud.tenddata.z r0 = com.tendcloud.tenddata.z.a
            return r0
    }

    private java.util.Set<java.lang.Class<?>> c(java.lang.Class<?> r3) {
            r2 = this;
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L25
            r0.<init>()     // Catch: java.lang.Throwable -> L25
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Throwable -> L25
            r1.<init>()     // Catch: java.lang.Throwable -> L25
        La:
            r0.add(r3)     // Catch: java.lang.Throwable -> L25
        Ld:
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L24
            r3 = 0
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.Class r3 = (java.lang.Class) r3     // Catch: java.lang.Throwable -> L25
            r1.add(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.Class r3 = r3.getSuperclass()     // Catch: java.lang.Throwable -> L25
            if (r3 == 0) goto Ld
            goto La
        L24:
            return r1
        L25:
            r3 = 0
            return r3
    }

    public java.util.Set<com.tendcloud.tenddata.ae> a(java.lang.Class<?> r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.Set<com.tendcloud.tenddata.ae>> r0 = r1.b     // Catch: java.lang.Throwable -> L9
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L9
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L9
            return r2
        L9:
            r2 = 0
            return r2
    }

    public void a(java.lang.Object r3, com.tendcloud.tenddata.ae r4) {
            r2 = this;
            java.lang.ThreadLocal<java.util.concurrent.ConcurrentLinkedQueue<com.tendcloud.tenddata.z$a>> r0 = r2.c     // Catch: java.lang.Throwable -> L10
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L10
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0     // Catch: java.lang.Throwable -> L10
            com.tendcloud.tenddata.z$a r1 = new com.tendcloud.tenddata.z$a     // Catch: java.lang.Throwable -> L10
            r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L10
            r0.offer(r1)     // Catch: java.lang.Throwable -> L10
        L10:
            return
    }

    public java.util.Set<java.lang.Class<?>> b(java.lang.Class<?> r3) {
            r2 = this;
            java.util.Map<java.lang.Class<?>, java.util.Set<java.lang.Class<?>>> r0 = r2.e     // Catch: java.lang.Throwable -> L14
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L14
            java.util.Set r0 = (java.util.Set) r0     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L13
            java.util.Set r0 = r2.c(r3)     // Catch: java.lang.Throwable -> L14
            java.util.Map<java.lang.Class<?>, java.util.Set<java.lang.Class<?>>> r1 = r2.e     // Catch: java.lang.Throwable -> L14
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L14
        L13:
            return r0
        L14:
            r3 = 0
            return r3
    }

    public void b() {
            r3 = this;
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r3.d     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L16
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r3.d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.set(r1)
            return
        L16:
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r3.d     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L45
            r0.set(r1)     // Catch: java.lang.Throwable -> L45
        L1d:
            java.lang.ThreadLocal<java.util.concurrent.ConcurrentLinkedQueue<com.tendcloud.tenddata.z$a>> r0 = r3.c     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L45
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0     // Catch: java.lang.Throwable -> L45
            java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L45
            com.tendcloud.tenddata.z$a r0 = (com.tendcloud.tenddata.z.a) r0     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L35
            java.lang.ThreadLocal<java.lang.Boolean> r0 = r3.d
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.set(r1)
            return
        L35:
            com.tendcloud.tenddata.ae r1 = r0.handler     // Catch: java.lang.Throwable -> L45
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.event     // Catch: java.lang.Throwable -> L45
            com.tendcloud.tenddata.ae r0 = r0.handler     // Catch: java.lang.Throwable -> L45
            r3.b(r1, r0)     // Catch: java.lang.Throwable -> L45
            goto L1d
        L45:
            r0 = move-exception
            java.lang.ThreadLocal<java.lang.Boolean> r1 = r3.d
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.set(r2)
            throw r0
    }

    public void b(java.lang.Object r1, com.tendcloud.tenddata.ae r2) {
            r0 = this;
            r2.handleEvent(r1)     // Catch: java.lang.Throwable -> L3
        L3:
            return
    }

    public void post(java.lang.Object r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.Throwable -> L4e
            java.util.Set r0 = r4.b(r0)     // Catch: java.lang.Throwable -> L4e
            r1 = 0
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L4e
        L10:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L4e
            java.lang.Class r2 = (java.lang.Class) r2     // Catch: java.lang.Throwable -> L4e
            java.util.Set r2 = r4.a(r2)     // Catch: java.lang.Throwable -> L4e
            if (r2 == 0) goto L10
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L4e
            if (r3 != 0) goto L10
            r1 = 1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L4e
        L2d:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L10
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4e
            com.tendcloud.tenddata.ae r3 = (com.tendcloud.tenddata.ae) r3     // Catch: java.lang.Throwable -> L4e
            r4.a(r5, r3)     // Catch: java.lang.Throwable -> L4e
            goto L2d
        L3d:
            if (r1 != 0) goto L4b
            boolean r0 = r5 instanceof com.tendcloud.tenddata.ag     // Catch: java.lang.Throwable -> L4e
            if (r0 != 0) goto L4b
            com.tendcloud.tenddata.ag r0 = new com.tendcloud.tenddata.ag     // Catch: java.lang.Throwable -> L4e
            r0.<init>(r4, r5)     // Catch: java.lang.Throwable -> L4e
            r4.post(r0)     // Catch: java.lang.Throwable -> L4e
        L4b:
            r4.b()     // Catch: java.lang.Throwable -> L4e
        L4e:
            return
    }

    public void register(java.lang.Object r5) {
            r4 = this;
            if (r5 != 0) goto L3
            return
        L3:
            java.util.Map r5 = com.tendcloud.tenddata.ad.a(r5)     // Catch: java.lang.Throwable -> L42
            java.util.Set r0 = r5.keySet()     // Catch: java.lang.Throwable -> L42
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L42
        Lf:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L42
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L42
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.Set<com.tendcloud.tenddata.ae>> r2 = r4.b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L42
            java.util.Set r2 = (java.util.Set) r2     // Catch: java.lang.Throwable -> L42
            if (r2 != 0) goto L36
            java.util.concurrent.CopyOnWriteArraySet r2 = new java.util.concurrent.CopyOnWriteArraySet     // Catch: java.lang.Throwable -> L42
            r2.<init>()     // Catch: java.lang.Throwable -> L42
            java.util.concurrent.ConcurrentMap<java.lang.Class<?>, java.util.Set<com.tendcloud.tenddata.ae>> r3 = r4.b     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r3.putIfAbsent(r1, r2)     // Catch: java.lang.Throwable -> L42
            java.util.Set r3 = (java.util.Set) r3     // Catch: java.lang.Throwable -> L42
            if (r3 != 0) goto L35
            goto L36
        L35:
            r2 = r3
        L36:
            java.lang.Object r1 = r5.get(r1)     // Catch: java.lang.Throwable -> L42
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L42
            boolean r1 = r2.addAll(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto Lf
        L42:
            return
    }

    public void unregister(java.lang.Object r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            java.util.Map r6 = com.tendcloud.tenddata.ad.a(r6)     // Catch: java.lang.Throwable -> L52
            java.util.Set r6 = r6.entrySet()     // Catch: java.lang.Throwable -> L52
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L52
        Lf:
            boolean r0 = r6.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L52
            java.lang.Object r0 = r6.next()     // Catch: java.lang.Throwable -> L52
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L52
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L52
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L52
            java.util.Set r1 = r5.a(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L52
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L52
            if (r1 == 0) goto L52
            boolean r2 = r1.containsAll(r0)     // Catch: java.lang.Throwable -> L52
            if (r2 != 0) goto L34
            goto L52
        L34:
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L52
        L38:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L52
            com.tendcloud.tenddata.ae r3 = (com.tendcloud.tenddata.ae) r3     // Catch: java.lang.Throwable -> L52
            boolean r4 = r0.contains(r3)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L38
            r3.b()     // Catch: java.lang.Throwable -> L52
            goto L38
        L4e:
            r1.removeAll(r0)     // Catch: java.lang.Throwable -> L52
            goto Lf
        L52:
            return
    }
}
