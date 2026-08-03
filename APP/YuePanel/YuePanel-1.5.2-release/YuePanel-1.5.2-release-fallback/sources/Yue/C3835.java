package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C3835<K, V> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.LinkedHashMap<K, V> f12125;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public int f12126;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f12127;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f12128;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f12129;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f12130;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f12131;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f12132;

    public C3835(int r4) {
            r3 = this;
            r3.<init>()
            if (r4 <= 0) goto L13
            r3.f12127 = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r0 = 1061158912(0x3f400000, float:0.75)
            r1 = 1
            r2 = 0
            r4.<init>(r2, r0, r1)
            r3.f12125 = r4
            return
        L13:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r4.<init>(r0)
            throw r4
    }

    public final synchronized java.lang.String toString() {
            r6 = this;
            monitor-enter(r6)
            int r0 = r6.f12131     // Catch: java.lang.Throwable -> Lc
            int r1 = r6.f12132     // Catch: java.lang.Throwable -> Lc
            int r1 = r1 + r0
            if (r1 == 0) goto Le
            int r0 = r0 * 100
            int r0 = r0 / r1
            goto Lf
        Lc:
            r0 = move-exception
            goto L33
        Le:
            r0 = 0
        Lf:
            java.util.Locale r1 = java.util.Locale.US     // Catch: java.lang.Throwable -> Lc
            java.lang.String r2 = "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
            int r3 = r6.f12127     // Catch: java.lang.Throwable -> Lc
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Lc
            int r4 = r6.f12131     // Catch: java.lang.Throwable -> Lc
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> Lc
            int r5 = r6.f12132     // Catch: java.lang.Throwable -> Lc
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> Lc
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Lc
            java.lang.Object[] r0 = new java.lang.Object[]{r3, r4, r5, r0}     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = java.lang.String.format(r1, r2, r0)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r6)
            return r0
        L33:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lc
            throw r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public V m15357(@Yue.InterfaceC4410 K r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final synchronized int m15358() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f12129     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m15359(boolean r1, @Yue.InterfaceC4410 K r2, @Yue.InterfaceC4410 V r3, @Yue.InterfaceC4544 V r4) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m15360() {
            r1 = this;
            r0 = -1
            r1.m15374(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final synchronized int m15361() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f12130     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final V m15362(@Yue.InterfaceC4410 K r5) {
            r4 = this;
            if (r5 == 0) goto L56
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f12125     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.get(r5)     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L15
            int r5 = r4.f12131     // Catch: java.lang.Throwable -> L13
            int r5 = r5 + 1
            r4.f12131 = r5     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            return r0
        L13:
            r5 = move-exception
            goto L54
        L15:
            int r0 = r4.f12132     // Catch: java.lang.Throwable -> L13
            int r0 = r0 + 1
            r4.f12132 = r0     // Catch: java.lang.Throwable -> L13
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r4.m15357(r5)
            if (r0 != 0) goto L24
            r5 = 0
            return r5
        L24:
            monitor-enter(r4)
            int r1 = r4.f12129     // Catch: java.lang.Throwable -> L39
            int r1 = r1 + 1
            r4.f12129 = r1     // Catch: java.lang.Throwable -> L39
            java.util.LinkedHashMap<K, V> r1 = r4.f12125     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r1.put(r5, r0)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L3b
            java.util.LinkedHashMap<K, V> r2 = r4.f12125     // Catch: java.lang.Throwable -> L39
            r2.put(r5, r1)     // Catch: java.lang.Throwable -> L39
            goto L44
        L39:
            r5 = move-exception
            goto L52
        L3b:
            int r2 = r4.f12126     // Catch: java.lang.Throwable -> L39
            int r3 = r4.m15370(r5, r0)     // Catch: java.lang.Throwable -> L39
            int r2 = r2 + r3
            r4.f12126 = r2     // Catch: java.lang.Throwable -> L39
        L44:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L4c
            r2 = 0
            r4.m15359(r2, r5, r0, r1)
            return r1
        L4c:
            int r5 = r4.f12127
            r4.m15374(r5)
            return r0
        L52:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L39
            throw r5
        L54:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L13
            throw r5
        L56:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r5.<init>(r0)
            throw r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final synchronized int m15363() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f12131     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final synchronized int m15364() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f12127     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final synchronized int m15365() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f12132     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final V m15366(@Yue.InterfaceC4410 K r4, @Yue.InterfaceC4410 V r5) {
            r3 = this;
            if (r4 == 0) goto L37
            if (r5 == 0) goto L37
            monitor-enter(r3)
            int r0 = r3.f12128     // Catch: java.lang.Throwable -> L26
            int r0 = r0 + 1
            r3.f12128 = r0     // Catch: java.lang.Throwable -> L26
            int r0 = r3.f12126     // Catch: java.lang.Throwable -> L26
            int r1 = r3.m15370(r4, r5)     // Catch: java.lang.Throwable -> L26
            int r0 = r0 + r1
            r3.f12126 = r0     // Catch: java.lang.Throwable -> L26
            java.util.LinkedHashMap<K, V> r0 = r3.f12125     // Catch: java.lang.Throwable -> L26
            java.lang.Object r0 = r0.put(r4, r5)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L28
            int r1 = r3.f12126     // Catch: java.lang.Throwable -> L26
            int r2 = r3.m15370(r4, r0)     // Catch: java.lang.Throwable -> L26
            int r1 = r1 - r2
            r3.f12126 = r1     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r4 = move-exception
            goto L35
        L28:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            if (r0 == 0) goto L2f
            r1 = 0
            r3.m15359(r1, r4, r0, r5)
        L2f:
            int r4 = r3.f12127
            r3.m15374(r4)
            return r0
        L35:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L26
            throw r4
        L37:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "key == null || value == null"
            r4.<init>(r5)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final synchronized int m15367() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f12128     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final V m15368(@Yue.InterfaceC4410 K r4) {
            r3 = this;
            if (r4 == 0) goto L22
            monitor-enter(r3)
            java.util.LinkedHashMap<K, V> r0 = r3.f12125     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r0.remove(r4)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            int r1 = r3.f12126     // Catch: java.lang.Throwable -> L15
            int r2 = r3.m15370(r4, r0)     // Catch: java.lang.Throwable -> L15
            int r1 = r1 - r2
            r3.f12126 = r1     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r4 = move-exception
            goto L20
        L17:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L1f
            r1 = 0
            r2 = 0
            r3.m15359(r1, r4, r0, r2)
        L1f:
            return r0
        L20:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L15
            throw r4
        L22:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r0 = "key == null"
            r4.<init>(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m15369(int r2) {
            r1 = this;
            if (r2 <= 0) goto Ld
            monitor-enter(r1)
            r1.f12127 = r2     // Catch: java.lang.Throwable -> La
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            r1.m15374(r2)
            return
        La:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> La
            throw r2
        Ld:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "maxSize <= 0"
            r2.<init>(r0)
            throw r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int m15370(K r4, V r5) {
            r3 = this;
            int r0 = r3.m15372(r4, r5)
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Negative size: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "="
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final synchronized int m15371() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f12126     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m15372(@Yue.InterfaceC4410 K r1, @Yue.InterfaceC4410 V r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final synchronized java.util.Map<K, V> m15373() {
            r2 = this;
            monitor-enter(r2)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: java.lang.Throwable -> La
            java.util.LinkedHashMap<K, V> r1 = r2.f12125     // Catch: java.lang.Throwable -> La
            r0.<init>(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r2)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public void m15374(int r5) {
            r4 = this;
        L0:
            monitor-enter(r4)
            int r0 = r4.f12126     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L55
            java.util.LinkedHashMap<K, V> r0 = r4.f12125     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r4.f12126     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L55
            goto L14
        L12:
            r5 = move-exception
            goto L74
        L14:
            int r0 = r4.f12126     // Catch: java.lang.Throwable -> L12
            if (r0 <= r5) goto L53
            java.util.LinkedHashMap<K, V> r0 = r4.f12125     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L53
        L21:
            java.util.LinkedHashMap<K, V> r0 = r4.f12125     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r2 = r4.f12125     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f12126     // Catch: java.lang.Throwable -> L12
            int r3 = r4.m15370(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r3
            r4.f12126 = r2     // Catch: java.lang.Throwable -> L12
            int r2 = r4.f12130     // Catch: java.lang.Throwable -> L12
            r3 = 1
            int r2 = r2 + r3
            r4.f12130 = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            r2 = 0
            r4.m15359(r3, r1, r0, r2)
            goto L0
        L53:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            return
        L55:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r5     // Catch: java.lang.Throwable -> L12
        L74:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
    }
}
