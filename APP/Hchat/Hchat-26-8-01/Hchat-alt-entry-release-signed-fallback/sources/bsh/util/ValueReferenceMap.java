package bsh.util;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ValueReferenceMap<K, V> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private int counter;
    private java.util.function.Function<K, V> creator;
    private int found;
    private java.util.HashMap<K, java.lang.ref.Reference<V>> map;
    private int missed;
    private java.lang.ref.ReferenceQueue<V> queue;
    private java.util.HashMap<java.lang.ref.Reference<V>, K> reverse;
    private bsh.util.ValueReferenceMap.Type type;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Type extends java.lang.Enum<bsh.util.ValueReferenceMap.Type> {
        private static final /* synthetic */ bsh.util.ValueReferenceMap.Type[] $VALUES = null;
        public static final bsh.util.ValueReferenceMap.Type Soft = null;
        public static final bsh.util.ValueReferenceMap.Type Weak = null;

        private static /* synthetic */ bsh.util.ValueReferenceMap.Type[] $values() {
                bsh.util.ValueReferenceMap$Type r0 = bsh.util.ValueReferenceMap.Type.Weak
                bsh.util.ValueReferenceMap$Type r1 = bsh.util.ValueReferenceMap.Type.Soft
                bsh.util.ValueReferenceMap$Type[] r0 = new bsh.util.ValueReferenceMap.Type[]{r0, r1}
                return r0
        }

        static {
                bsh.util.ValueReferenceMap$Type r0 = new bsh.util.ValueReferenceMap$Type
                java.lang.String r1 = "Weak"
                r2 = 0
                r0.<init>(r1, r2)
                bsh.util.ValueReferenceMap.Type.Weak = r0
                bsh.util.ValueReferenceMap$Type r0 = new bsh.util.ValueReferenceMap$Type
                java.lang.String r1 = "Soft"
                r2 = 1
                r0.<init>(r1, r2)
                bsh.util.ValueReferenceMap.Type.Soft = r0
                bsh.util.ValueReferenceMap$Type[] r0 = $values()
                bsh.util.ValueReferenceMap.Type.$VALUES = r0
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static bsh.util.ValueReferenceMap.Type valueOf(java.lang.String r1) {
                java.lang.Class<bsh.util.ValueReferenceMap$Type> r0 = bsh.util.ValueReferenceMap.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                bsh.util.ValueReferenceMap$Type r1 = (bsh.util.ValueReferenceMap.Type) r1
                return r1
        }

        public static bsh.util.ValueReferenceMap.Type[] values() {
                bsh.util.ValueReferenceMap$Type[] r0 = bsh.util.ValueReferenceMap.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                bsh.util.ValueReferenceMap$Type[] r0 = (bsh.util.ValueReferenceMap.Type[]) r0
                return r0
        }
    }

    public ValueReferenceMap(java.util.function.Function<K, V> r2, bsh.util.ValueReferenceMap.Type r3) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.map = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.reverse = r0
            java.lang.ref.ReferenceQueue r0 = new java.lang.ref.ReferenceQueue
            r0.<init>()
            r1.queue = r0
            java.lang.String r0 = "creator must not be null"
            java.util.Objects.requireNonNull(r2, r0)
            java.lang.String r0 = "type must not be null"
            java.util.Objects.requireNonNull(r3, r0)
            r1.creator = r2
            r1.type = r3
            return
    }

    private void clean() {
            r3 = this;
        L0:
            java.lang.ref.ReferenceQueue<V> r0 = r3.queue
            java.lang.ref.Reference r0 = r0.poll()
            if (r0 == 0) goto L1b
            java.util.HashMap<java.lang.ref.Reference<V>, K> r1 = r3.reverse
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L15
            java.util.HashMap<K, java.lang.ref.Reference<V>> r2 = r3.map
            r2.remove(r1)
        L15:
            java.util.HashMap<java.lang.ref.Reference<V>, K> r1 = r3.reverse
            r1.remove(r0)
            goto L0
        L1b:
            return
    }

    public synchronized void clear() {
            r1 = this;
            monitor-enter(r1)
            r1.clean()     // Catch: java.lang.Throwable -> L17
            java.util.HashMap<K, java.lang.ref.Reference<V>> r0 = r1.map     // Catch: java.lang.Throwable -> L17
            r0.clear()     // Catch: java.lang.Throwable -> L17
            java.util.HashMap<java.lang.ref.Reference<V>, K> r0 = r1.reverse     // Catch: java.lang.Throwable -> L17
            r0.clear()     // Catch: java.lang.Throwable -> L17
            r0 = 0
            r1.missed = r0     // Catch: java.lang.Throwable -> L17
            r1.found = r0     // Catch: java.lang.Throwable -> L17
            r1.counter = r0     // Catch: java.lang.Throwable -> L17
            monitor-exit(r1)
            return
        L17:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r0
    }

    public synchronized V get(K r4) {
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "key must not be null"
            java.util.Objects.requireNonNull(r4, r0)     // Catch: java.lang.Throwable -> L1b
            int r0 = r3.counter     // Catch: java.lang.Throwable -> L1b
            int r0 = r0 + 1
            r3.counter = r0     // Catch: java.lang.Throwable -> L1b
            r1 = 1000(0x3e8, float:1.401E-42)
            if (r0 != r1) goto L1d
            r3.clean()     // Catch: java.lang.Throwable -> L1b
            r0 = 0
            r3.missed = r0     // Catch: java.lang.Throwable -> L1b
            r3.found = r0     // Catch: java.lang.Throwable -> L1b
            r3.counter = r0     // Catch: java.lang.Throwable -> L1b
            goto L1d
        L1b:
            r4 = move-exception
            goto L67
        L1d:
            java.util.HashMap<K, java.lang.ref.Reference<V>> r0 = r3.map     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L35
            int r4 = r3.found     // Catch: java.lang.Throwable -> L1b
            int r4 = r4 + 1
            r3.found = r4     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)
            return r0
        L35:
            int r0 = r3.missed     // Catch: java.lang.Throwable -> L1b
            int r0 = r0 + 1
            r3.missed = r0     // Catch: java.lang.Throwable -> L1b
            java.util.function.Function<K, V> r0 = r3.creator     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.apply(r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "ValueReference cache create value may not return null."
            java.util.Objects.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L1b
            bsh.util.ValueReferenceMap$Type r1 = r3.type     // Catch: java.lang.Throwable -> L1b
            bsh.util.ValueReferenceMap$Type r2 = bsh.util.ValueReferenceMap.Type.Weak     // Catch: java.lang.Throwable -> L1b
            if (r1 != r2) goto L54
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1b
            java.lang.ref.ReferenceQueue<V> r2 = r3.queue     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L1b
            goto L5b
        L54:
            java.lang.ref.SoftReference r1 = new java.lang.ref.SoftReference     // Catch: java.lang.Throwable -> L1b
            java.lang.ref.ReferenceQueue<V> r2 = r3.queue     // Catch: java.lang.Throwable -> L1b
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L1b
        L5b:
            java.util.HashMap<K, java.lang.ref.Reference<V>> r2 = r3.map     // Catch: java.lang.Throwable -> L1b
            r2.put(r4, r1)     // Catch: java.lang.Throwable -> L1b
            java.util.HashMap<java.lang.ref.Reference<V>, K> r2 = r3.reverse     // Catch: java.lang.Throwable -> L1b
            r2.put(r1, r4)     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r3)
            return r0
        L67:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1b
            throw r4
    }

    public synchronized boolean remove(K r3) {
            r2 = this;
            monitor-enter(r2)
            java.util.HashMap<K, java.lang.ref.Reference<V>> r0 = r2.map     // Catch: java.lang.Throwable -> L16
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L16
            java.lang.ref.Reference r3 = (java.lang.ref.Reference) r3     // Catch: java.lang.Throwable -> L16
            if (r3 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L18
            java.util.HashMap<java.lang.ref.Reference<V>, K> r1 = r2.reverse     // Catch: java.lang.Throwable -> L16
            r1.remove(r3)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r3 = move-exception
            goto L1a
        L18:
            monitor-exit(r2)
            return r0
        L1a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public synchronized int size() {
            r1 = this;
            monitor-enter(r1)
            r1.clean()     // Catch: java.lang.Throwable -> Lc
            java.util.HashMap<K, java.lang.ref.Reference<V>> r0 = r1.map     // Catch: java.lang.Throwable -> Lc
            int r0 = r0.size()     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return r0
        Lc:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }
}
