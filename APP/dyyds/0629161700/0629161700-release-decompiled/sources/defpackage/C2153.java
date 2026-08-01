package defpackage;

/* JADX INFO: renamed from: ᲇᲇᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2153 implements java.util.Iterator, java.util.Map.Entry {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f9147;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f9148;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f9149;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1499 f9150;

    public C2153(defpackage.C1499 r1) {
            r0 = this;
            r0.<init>()
            r0.f9150 = r1
            int r1 = r1.f6994
            int r1 = r1 + (-1)
            r0.f9149 = r1
            r1 = -1
            r0.f9148 = r1
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r4.f9147
            r1 = 0
            if (r0 == 0) goto L31
            boolean r0 = r5 instanceof java.util.Map.Entry
            if (r0 != 0) goto La
            goto L30
        La:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r0 = r5.getKey()
            int r2 = r4.f9148
            ᛸᛶᛱᛲ r3 = r4.f9150
            java.lang.Object r2 = r3.m2865(r2)
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r2)
            if (r0 == 0) goto L30
            java.lang.Object r5 = r5.getValue()
            int r4 = r4.f9148
            java.lang.Object r4 = r3.m2863(r4)
            boolean r4 = defpackage.AbstractC0498.m1280(r5, r4)
            if (r4 == 0) goto L30
            r4 = 1
            return r4
        L30:
            return r1
        L31:
            java.lang.String r4 = "This container does not support retaining Map.Entry objects"
            defpackage.C2264.m3676(r4)
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r1 = this;
            boolean r0 = r1.f9147
            if (r0 == 0) goto Ld
            ᛸᛶᛱᛲ r0 = r1.f9150
            int r1 = r1.f9148
            java.lang.Object r1 = r0.m2865(r1)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r1 = this;
            boolean r0 = r1.f9147
            if (r0 == 0) goto Ld
            ᛸᛶᛱᛲ r0 = r1.f9150
            int r1 = r1.f9148
            java.lang.Object r1 = r0.m2863(r1)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f9148
            int r1 = r1.f9149
            if (r0 >= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.f9147
            r1 = 0
            if (r0 == 0) goto L25
            int r0 = r3.f9148
            ᛸᛶᛱᛲ r2 = r3.f9150
            java.lang.Object r0 = r2.m2865(r0)
            int r3 = r3.f9148
            java.lang.Object r3 = r2.m2863(r3)
            if (r0 != 0) goto L17
            r0 = r1
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            if (r3 != 0) goto L1e
            goto L22
        L1e:
            int r1 = r3.hashCode()
        L22:
            r3 = r0 ^ r1
            return r3
        L25:
            java.lang.String r3 = "This container does not support retaining Map.Entry objects"
            defpackage.C2264.m3676(r3)
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lf
            int r0 = r2.f9148
            r1 = 1
            int r0 = r0 + r1
            r2.f9148 = r0
            r2.f9147 = r1
            return r2
        Lf:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            boolean r0 = r2.f9147
            if (r0 == 0) goto L1b
            ᛸᛶᛱᛲ r0 = r2.f9150
            int r1 = r2.f9148
            r0.mo1421(r1)
            int r0 = r2.f9148
            int r0 = r0 + (-1)
            r2.f9148 = r0
            int r0 = r2.f9149
            int r0 = r0 + (-1)
            r2.f9149 = r0
            r0 = 0
            r2.f9147 = r0
            return
        L1b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r1.f9147
            if (r0 == 0) goto Ld
            ᛸᛶᛱᛲ r0 = r1.f9150
            int r1 = r1.f9148
            java.lang.Object r1 = r0.mo1422(r1, r2)
            return r1
        Ld:
            java.lang.String r1 = "This container does not support retaining Map.Entry objects"
            defpackage.C2264.m3676(r1)
            r1 = 0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.getKey()
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
