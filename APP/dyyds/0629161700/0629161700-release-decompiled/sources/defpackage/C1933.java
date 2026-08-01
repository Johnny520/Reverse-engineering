package defpackage;

/* JADX INFO: renamed from: ᲁᲁᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1933 implements defpackage.InterfaceC0107 {

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public volatile java.util.Map f8402;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.Map f8403;

    public C1933(java.util.Map r1) {
            r0 = this;
            r0.<init>()
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r1)
            r0.f8403 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C1933
            if (r0 == 0) goto Lf
            ᲁᲁᲀᛷ r2 = (defpackage.C1933) r2
            java.util.Map r1 = r1.f8403
            java.util.Map r2 = r2.f8403
            boolean r1 = r1.equals(r2)
            return r1
        Lf:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.Map r0 = r0.f8403
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LazyHeaders{headers="
            r0.<init>(r1)
            java.util.Map r2 = r2.f8403
            r0.append(r2)
            r2 = 125(0x7d, float:1.75E-43)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // defpackage.InterfaceC0107
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final java.util.Map mo596() {
            r1 = this;
            java.util.Map r0 = r1.f8402
            if (r0 != 0) goto L1a
            monitor-enter(r1)
            java.util.Map r0 = r1.f8402     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L16
            java.util.HashMap r0 = r1.m3355()     // Catch: java.lang.Throwable -> L14
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)     // Catch: java.lang.Throwable -> L14
            r1.f8402 = r0     // Catch: java.lang.Throwable -> L14
            goto L16
        L14:
            r0 = move-exception
            goto L18
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            goto L1a
        L18:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
        L1a:
            java.util.Map r1 = r1.f8402
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.HashMap m3355() {
            r8 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Map r8 = r8.f8403
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        Lf:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L62
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            int r4 = r2.size()
            r5 = 0
        L2b:
            if (r5 >= r4) goto L4e
            java.lang.Object r6 = r2.get(r5)
            ᲇᛶᲁᛲ r6 = (defpackage.C2075) r6
            java.lang.String r6 = r6.f8905
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L4b
            r3.append(r6)
            int r6 = r2.size()
            int r6 = r6 + (-1)
            if (r5 == r6) goto L4b
            r6 = 44
            r3.append(r6)
        L4b:
            int r5 = r5 + 1
            goto L2b
        L4e:
            java.lang.String r2 = r3.toString()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto Lf
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r0.put(r1, r2)
            goto Lf
        L62:
            return r0
    }
}
