package xhss;

/* JADX INFO: renamed from: xhss.ᲇᲀᲈᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public class C1084 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.C1037 f3488;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final xhss.C0564 f3489;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public int f3490;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final int f3491;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f3492;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public int f3493;

    public C1084(int r2) {
            r1 = this;
            r1.<init>()
            r1.f3491 = r2
            if (r2 <= 0) goto L19
            xhss.ᲇᛵᛲᲁ r2 = new xhss.ᲇᛵᛲᲁ
            r0 = 13
            r2.<init>(r0)
            r1.f3488 = r2
            xhss.ᛶᛵᲇᛸ r2 = new xhss.ᛶᛵᲇᛸ
            r0 = 7
            r2.<init>(r0)
            r1.f3489 = r2
            return
        L19:
            java.lang.String r1 = "maxSize <= 0"
            xhss.C0532.m959(r1)
            r1 = 0
            throw r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "LruCache[maxSize="
            xhss.ᛶᛵᲇᛸ r1 = r4.f3489
            monitor-enter(r1)
            int r2 = r4.f3490     // Catch: java.lang.Throwable -> L10
            int r3 = r4.f3493     // Catch: java.lang.Throwable -> L10
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
            int r0 = r4.f3491     // Catch: java.lang.Throwable -> L10
            r3.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = ",hits="
            r3.append(r0)     // Catch: java.lang.Throwable -> L10
            int r0 = r4.f3490     // Catch: java.lang.Throwable -> L10
            r3.append(r0)     // Catch: java.lang.Throwable -> L10
            java.lang.String r0 = ",misses="
            r3.append(r0)     // Catch: java.lang.Throwable -> L10
            int r4 = r4.f3493     // Catch: java.lang.Throwable -> L10
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

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.Object m1744(java.lang.Object r5, java.lang.Object r6) {
            r4 = this;
            xhss.ᛶᛵᲇᛸ r0 = r4.f3489
            monitor-enter(r0)
            int r1 = r4.f3492     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 + 1
            r4.f3492 = r1     // Catch: java.lang.Throwable -> L1c
            xhss.ᲇᛵᛲᲁ r1 = r4.f3488     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.f3349     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r5 = r1.put(r5, r6)     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L1f
            int r6 = r4.f3492     // Catch: java.lang.Throwable -> L1c
            int r6 = r6 + (-1)
            r4.f3492 = r6     // Catch: java.lang.Throwable -> L1c
            goto L1f
        L1c:
            r4 = move-exception
            goto La4
        L1f:
            monitor-exit(r0)
            int r6 = r4.f3491
        L22:
            xhss.ᛶᛵᲇᛸ r0 = r4.f3489
            monitor-enter(r0)
            int r1 = r4.f3492     // Catch: java.lang.Throwable -> L3a
            if (r1 < 0) goto L9a
            xhss.ᲇᛵᛲᲁ r1 = r4.f3488     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.f3349     // Catch: java.lang.Throwable -> L3a
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L3c
            int r1 = r4.f3492     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L9a
            goto L3c
        L3a:
            r4 = move-exception
            goto La2
        L3c:
            int r1 = r4.f3492     // Catch: java.lang.Throwable -> L3a
            if (r1 <= r6) goto L98
            xhss.ᲇᛵᛲᲁ r1 = r4.f3488     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.f3349     // Catch: java.lang.Throwable -> L3a
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L4d
            goto L98
        L4d:
            xhss.ᲇᛵᛲᲁ r1 = r4.f3488     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.f3349     // Catch: java.lang.Throwable -> L3a
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L3a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L3a
            r3 = 0
            if (r2 == 0) goto L6b
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L3a
            if (r2 == 0) goto L65
            goto L7a
        L65:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L3a
            goto L7a
        L6b:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L3a
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r2 != 0) goto L76
            goto L7a
        L76:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L3a
        L7a:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L3a
            if (r3 != 0) goto L80
            monitor-exit(r0)
            return r5
        L80:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L3a
            r3.getValue()     // Catch: java.lang.Throwable -> L3a
            xhss.ᲇᛵᛲᲁ r2 = r4.f3488     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r2 = r2.f3349     // Catch: java.lang.Throwable -> L3a
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> L3a
            r2.remove(r1)     // Catch: java.lang.Throwable -> L3a
            int r1 = r4.f3492     // Catch: java.lang.Throwable -> L3a
            int r1 = r1 + (-1)
            r4.f3492 = r1     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            goto L22
        L98:
            monitor-exit(r0)
            return r5
        L9a:
            java.lang.String r4 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L3a
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L3a
            throw r5     // Catch: java.lang.Throwable -> L3a
        La2:
            monitor-exit(r0)
            throw r4
        La4:
            monitor-exit(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.Object m1745(java.lang.Object r3) {
            r2 = this;
            xhss.ᛶᛵᲇᛸ r0 = r2.f3489
            monitor-enter(r0)
            xhss.ᲇᛵᛲᲁ r1 = r2.f3488     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.f3349     // Catch: java.lang.Throwable -> L17
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L17
            java.lang.Object r3 = r1.get(r3)     // Catch: java.lang.Throwable -> L17
            if (r3 == 0) goto L19
            int r1 = r2.f3490     // Catch: java.lang.Throwable -> L17
            int r1 = r1 + 1
            r2.f3490 = r1     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            return r3
        L17:
            r2 = move-exception
            goto L22
        L19:
            int r3 = r2.f3493     // Catch: java.lang.Throwable -> L17
            int r3 = r3 + 1
            r2.f3493 = r3     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)
            r2 = 0
            return r2
        L22:
            monitor-exit(r0)
            throw r2
    }
}
