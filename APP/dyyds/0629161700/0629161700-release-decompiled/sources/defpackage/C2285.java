package defpackage;

/* JADX INFO: renamed from: ᲈᛷᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2285 implements java.util.Map.Entry, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final int f9646;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f9647;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0665 f9648;

    public C2285(defpackage.C0665 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f9648 = r1
            r0.f9647 = r2
            int r1 = r1.f3230
            r0.f9646 = r1
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.util.Map.Entry
            if (r0 == 0) goto L24
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getKey()
            java.lang.Object r1 = r2.getKey()
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 == 0) goto L24
            java.lang.Object r3 = r3.getValue()
            java.lang.Object r2 = r2.getValue()
            boolean r2 = defpackage.AbstractC0498.m1280(r3, r2)
            if (r2 == 0) goto L24
            r2 = 1
            return r2
        L24:
            r2 = 0
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            r1.m3706()
            ᛴᛴᲁᲇ r0 = r1.f9648
            java.lang.Object[] r0 = r0.f3229
            int r1 = r1.f9647
            r1 = r0[r1]
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            r1.m3706()
            ᛴᛴᲁᲇ r0 = r1.f9648
            java.lang.Object[] r0 = r0.f3228
            int r1 = r1.f9647
            r1 = r0[r1]
            return r1
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.getKey()
            r1 = 0
            if (r0 == 0) goto Lc
            int r0 = r0.hashCode()
            goto Ld
        Lc:
            r0 = r1
        Ld:
            java.lang.Object r2 = r2.getValue()
            if (r2 == 0) goto L17
            int r1 = r2.hashCode()
        L17:
            r2 = r0 ^ r1
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r3) {
            r2 = this;
            r2.m3706()
            ᛴᛴᲁᲇ r0 = r2.f9648
            r0.m1500()
            java.lang.Object[] r1 = r0.f3228
            if (r1 == 0) goto Ld
            goto L16
        Ld:
            java.lang.Object[] r1 = r0.f3229
            int r1 = r1.length
            if (r1 < 0) goto L1d
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r0.f3228 = r1
        L16:
            int r2 = r2.f9647
            r0 = r1[r2]
            r1[r2] = r3
            return r0
        L1d:
            java.lang.String r2 = "capacity must be non-negative."
            defpackage.C2264.m3684(r2)
            r2 = 0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3706() {
            r1 = this;
            ᛴᛴᲁᲇ r0 = r1.f9648
            int r0 = r0.f3230
            int r1 = r1.f9646
            if (r0 != r1) goto L9
            return
        L9:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            java.lang.String r0 = "The backing map has been modified after this entry was obtained."
            r1.<init>(r0)
            throw r1
    }
}
