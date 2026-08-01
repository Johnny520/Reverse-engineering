package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class kw0 {

    /* JADX INFO: renamed from: α */
    public final int f6134;

    /* JADX INFO: renamed from: β */
    public final p000.C0568n f6135;

    /* JADX INFO: renamed from: γ */
    public final p000.rk0 f6136;

    /* JADX INFO: renamed from: δ */
    public int f6137;

    /* JADX INFO: renamed from: ε */
    public int f6138;

    /* JADX INFO: renamed from: ζ */
    public int f6139;

    public kw0(int r2) {
            r1 = this;
            r1.<init>()
            r1.f6134 = r2
            if (r2 <= 0) goto L19
            n r2 = new n
            r0 = 28
            r2.<init>(r0)
            r1.f6135 = r2
            rk0 r2 = new rk0
            r0 = 2
            r2.<init>(r0)
            r1.f6136 = r2
            return
        L19:
            java.lang.String r1 = "maxSize <= 0"
            p000.C1080.m7275(r1)
            r1 = 0
            throw r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "LruCache[maxSize="
            rk0 r1 = r4.f6136
            monitor-enter(r1)
            int r2 = r4.f6138     // Catch: java.lang.Throwable -> L10
            int r3 = r4.f6139     // Catch: java.lang.Throwable -> L10
            int r3 = r3 + r2
            if (r3 == 0) goto L12
            int r2 = r2 * 100
            int r2 = r2 / r3
            goto L13
        L10:
            r4 = move-exception
            goto L44
        L12:
            r2 = 0
        L13:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L10
            int r0 = r4.f6134     // Catch: java.lang.Throwable -> L10
            r3.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = ",hits="
            r3.append(r0)     // Catch: java.lang.Throwable -> L10
            int r0 = r4.f6138     // Catch: java.lang.Throwable -> L10
            r3.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = ",misses="
            r3.append(r0)     // Catch: java.lang.Throwable -> L10
            int r4 = r4.f6139     // Catch: java.lang.Throwable -> L10
            r3.append(r4)     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = ",hitRate="
            r3.append(r4)     // Catch: java.lang.Throwable -> L10
            r3.append(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = "%]"
            r3.append(r4)     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)
            return r4
        L44:
            monitor-exit(r1)
            throw r4
    }

    /* JADX INFO: renamed from: α */
    public final java.lang.Object m3421(java.lang.Object r3) {
            r2 = this;
            rk0 r0 = r2.f6136
            monitor-enter(r0)
            n r1 = r2.f6135     // Catch: java.lang.Throwable -> L1a
            r1.getClass()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.f7336     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L1a
            if (r3 == 0) goto L1c
            int r1 = r2.f6138     // Catch: java.lang.Throwable -> L1a
            int r1 = r1 + 1
            r2.f6138 = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            return r3
        L1a:
            r2 = move-exception
            goto L25
        L1c:
            int r3 = r2.f6139     // Catch: java.lang.Throwable -> L1a
            int r3 = r3 + 1
            r2.f6139 = r3     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r2 = 0
            return r2
        L25:
            monitor-exit(r0)
            throw r2
    }

    /* JADX INFO: renamed from: β */
    public final java.lang.Object m3422(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            r5.getClass()
            rk0 r0 = r4.f6136
            monitor-enter(r0)
            int r1 = r4.f6137     // Catch: java.lang.Throwable -> L22
            int r1 = r1 + 1
            r4.f6137 = r1     // Catch: java.lang.Throwable -> L22
            n r1 = r4.f6135     // Catch: java.lang.Throwable -> L22
            r1.getClass()     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.f7336     // Catch: java.lang.Throwable -> L22
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L22
            java.lang.Object r5 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L25
            int r6 = r4.f6137     // Catch: java.lang.Throwable -> L22
            int r6 = r6 + (-1)
            r4.f6137 = r6     // Catch: java.lang.Throwable -> L22
            goto L25
        L22:
            r4 = move-exception
            goto L9a
        L25:
            monitor-exit(r0)
            int r6 = r4.f6134
        L28:
            rk0 r0 = r4.f6136
            monitor-enter(r0)
            int r1 = r4.f6137     // Catch: java.lang.Throwable -> L40
            if (r1 < 0) goto L90
            n r1 = r4.f6135     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.f7336     // Catch: java.lang.Throwable -> L40
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L42
            int r1 = r4.f6137     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L90
            goto L42
        L40:
            r4 = move-exception
            goto L98
        L42:
            int r1 = r4.f6137     // Catch: java.lang.Throwable -> L40
            if (r1 <= r6) goto L8e
            n r1 = r4.f6135     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.f7336     // Catch: java.lang.Throwable -> L40
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L40
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L53
            goto L8e
        L53:
            n r1 = r4.f6135     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.f7336     // Catch: java.lang.Throwable -> L40
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L40
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L40
            r1.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = p000.AbstractC0984xh.m6639(r1)     // Catch: java.lang.Throwable -> L40
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L40
            if (r1 != 0) goto L6c
            monitor-exit(r0)
            return r5
        L6c:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L40
            n r3 = r4.f6135     // Catch: java.lang.Throwable -> L40
            r3.getClass()     // Catch: java.lang.Throwable -> L40
            r2.getClass()     // Catch: java.lang.Throwable -> L40
            java.lang.Object r3 = r3.f7336     // Catch: java.lang.Throwable -> L40
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L40
            r3.remove(r2)     // Catch: java.lang.Throwable -> L40
            int r2 = r4.f6137     // Catch: java.lang.Throwable -> L40
            r1.getClass()     // Catch: java.lang.Throwable -> L40
            int r2 = r2 + (-1)
            r4.f6137 = r2     // Catch: java.lang.Throwable -> L40
            monitor-exit(r0)
            goto L28
        L8e:
            monitor-exit(r0)
            return r5
        L90:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L40
            throw r5     // Catch: java.lang.Throwable -> L40
        L98:
            monitor-exit(r0)
            throw r4
        L9a:
            monitor-exit(r0)
            throw r4
    }

    /* JADX INFO: renamed from: γ */
    public final java.lang.Object m3423(java.lang.Object r3) {
            r2 = this;
            rk0 r0 = r2.f6136
            monitor-enter(r0)
            n r1 = r2.f6135     // Catch: java.lang.Throwable -> L19
            r1.getClass()     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.f7336     // Catch: java.lang.Throwable -> L19
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L19
            java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L1b
            int r1 = r2.f6137     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + (-1)
            r2.f6137 = r1     // Catch: java.lang.Throwable -> L19
            goto L1b
        L19:
            r2 = move-exception
            goto L1d
        L1b:
            monitor-exit(r0)
            return r3
        L1d:
            monitor-exit(r0)
            throw r2
    }
}
