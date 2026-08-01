package defpackage;

/* JADX INFO: renamed from: ᛳᛸᛶᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0527 implements java.util.Map.Entry {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final java.lang.Object f2594;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int f2595;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final boolean f2596;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public defpackage.C0527 f2597;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C0527 f2598;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0527 f2599;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public java.lang.Object f2600;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public defpackage.C0527 f2601;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.C0527 f2602;

    public C0527(boolean r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.f2594 = r0
            r1.f2596 = r2
            r1.f2602 = r1
            r1.f2601 = r1
            return
    }

    public C0527(boolean r1, defpackage.C0527 r2, java.lang.Object r3, defpackage.C0527 r4, defpackage.C0527 r5) {
            r0 = this;
            r0.<init>()
            r0.f2599 = r2
            r0.f2594 = r3
            r0.f2596 = r1
            r1 = 1
            r0.f2595 = r1
            r0.f2601 = r4
            r0.f2602 = r5
            r5.f2601 = r0
            r4.f2602 = r0
            return
    }

    @Override // java.util.Map.Entry
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r1 = 0
            if (r0 == 0) goto L33
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r3.f2594
            if (r0 != 0) goto L12
            java.lang.Object r0 = r4.getKey()
            if (r0 != 0) goto L33
            goto L1c
        L12:
            java.lang.Object r2 = r4.getKey()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L33
        L1c:
            java.lang.Object r3 = r3.f2600
            if (r3 != 0) goto L27
            java.lang.Object r3 = r4.getValue()
            if (r3 != 0) goto L33
            goto L31
        L27:
            java.lang.Object r4 = r4.getValue()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L33
        L31:
            r3 = 1
            return r3
        L33:
            return r1
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.f2594
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.f2600
            return r0
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.f2594
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            java.lang.Object r2 = r2.f2600
            if (r2 != 0) goto L10
            goto L14
        L10:
            int r0 = r2.hashCode()
        L14:
            r2 = r1 ^ r0
            return r2
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto Le
            boolean r0 = r1.f2596
            if (r0 == 0) goto L7
            goto Le
        L7:
            java.lang.String r1 = "value == null"
            defpackage.C2264.m3673(r1)
            r1 = 0
            return r1
        Le:
            java.lang.Object r0 = r1.f2600
            r1.f2600 = r2
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f2594
            r0.append(r1)
            java.lang.String r1 = "="
            r0.append(r1)
            java.lang.Object r2 = r2.f2600
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
