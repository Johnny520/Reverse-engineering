package defpackage;

/* JADX INFO: renamed from: ᛴᲁᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C0763 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public long f3553;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.LinkedHashMap f3554;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final long f3555;

    public C0763(long r5) {
            r4 = this;
            r4.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r1 = 1061158912(0x3f400000, float:0.75)
            r2 = 1
            r3 = 100
            r0.<init>(r3, r1, r2)
            r4.f3554 = r0
            r4.f3555 = r5
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final synchronized void m1691(long r8) {
            r7 = this;
            monitor-enter(r7)
        L1:
            long r0 = r7.f3553     // Catch: java.lang.Throwable -> L32
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L34
            java.util.LinkedHashMap r0 = r7.f3554     // Catch: java.lang.Throwable -> L32
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L32
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L32
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r1.getValue()     // Catch: java.lang.Throwable -> L32
            ᛴᛴᛵᛲ r2 = (defpackage.C0650) r2     // Catch: java.lang.Throwable -> L32
            long r3 = r7.f3553     // Catch: java.lang.Throwable -> L32
            int r5 = r2.f3173     // Catch: java.lang.Throwable -> L32
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L32
            long r3 = r3 - r5
            r7.f3553 = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r1 = r1.getKey()     // Catch: java.lang.Throwable -> L32
            r0.remove()     // Catch: java.lang.Throwable -> L32
            java.lang.Object r0 = r2.f3172     // Catch: java.lang.Throwable -> L32
            r7.mo685(r1, r0)     // Catch: java.lang.Throwable -> L32
            goto L1
        L32:
            r8 = move-exception
            goto L36
        L34:
            monitor-exit(r7)
            return
        L36:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L32
            throw r8
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final synchronized java.lang.Object m1692(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.mo1694(r9)     // Catch: java.lang.Throwable -> L12
            long r1 = (long) r0     // Catch: java.lang.Throwable -> L12
            long r3 = r7.f3555     // Catch: java.lang.Throwable -> L12
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r4 = 0
            if (r3 < 0) goto L14
            r7.mo685(r8, r9)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r7)
            return r4
        L12:
            r8 = move-exception
            goto L4e
        L14:
            if (r9 == 0) goto L1b
            long r5 = r7.f3553     // Catch: java.lang.Throwable -> L12
            long r5 = r5 + r1
            r7.f3553 = r5     // Catch: java.lang.Throwable -> L12
        L1b:
            java.util.LinkedHashMap r1 = r7.f3554     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto L21
            r2 = r4
            goto L26
        L21:
            ᛴᛴᛵᛲ r2 = new ᛴᛴᛵᛲ     // Catch: java.lang.Throwable -> L12
            r2.<init>(r0, r9)     // Catch: java.lang.Throwable -> L12
        L26:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch: java.lang.Throwable -> L12
            ᛴᛴᛵᛲ r0 = (defpackage.C0650) r0     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L43
            long r1 = r7.f3553     // Catch: java.lang.Throwable -> L12
            int r3 = r0.f3173     // Catch: java.lang.Throwable -> L12
            long r5 = (long) r3     // Catch: java.lang.Throwable -> L12
            long r1 = r1 - r5
            r7.f3553 = r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.f3172     // Catch: java.lang.Throwable -> L12
            boolean r9 = r1.equals(r9)     // Catch: java.lang.Throwable -> L12
            if (r9 != 0) goto L43
            java.lang.Object r9 = r0.f3172     // Catch: java.lang.Throwable -> L12
            r7.mo685(r8, r9)     // Catch: java.lang.Throwable -> L12
        L43:
            long r8 = r7.f3555     // Catch: java.lang.Throwable -> L12
            r7.m1691(r8)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L4c
            java.lang.Object r4 = r0.f3172     // Catch: java.lang.Throwable -> L12
        L4c:
            monitor-exit(r7)
            return r4
        L4e:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L12
            throw r8
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public void mo685(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final synchronized java.lang.Object m1693(java.lang.Object r2) {
            r1 = this;
            monitor-enter(r1)
            java.util.LinkedHashMap r0 = r1.f3554     // Catch: java.lang.Throwable -> Le
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> Le
            ᛴᛴᛵᛲ r2 = (defpackage.C0650) r2     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L10
            java.lang.Object r2 = r2.f3172     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r2 = move-exception
            goto L13
        L10:
            r2 = 0
        L11:
            monitor-exit(r1)
            return r2
        L13:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int mo1694(java.lang.Object r1) {
            r0 = this;
            r0 = 1
            return r0
    }
}
