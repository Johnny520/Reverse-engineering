package defpackage;

/* JADX INFO: renamed from: ᲇᛵᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2049 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f8824;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.Map f8825;

    public C2049(java.lang.String r4, java.util.Map r5) {
            r3 = this;
            r3.<init>()
            r3.f8824 = r4
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>()
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            if (r1 == 0) goto L33
            java.util.Locale r2 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r2)
            goto L34
        L33:
            r1 = 0
        L34:
            r4.put(r1, r0)
            goto L12
        L38:
            java.util.Map r4 = java.util.Collections.unmodifiableMap(r4)
            r3.f8825 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C2049
            if (r0 == 0) goto L1c
            ᲇᛵᛳᛵ r3 = (defpackage.C2049) r3
            java.lang.String r0 = r3.f8824
            java.lang.String r1 = r2.f8824
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1c
            java.util.Map r3 = r3.f8825
            java.util.Map r2 = r2.f8825
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f8824
            r1 = 31
            r2 = 899(0x383, float:1.26E-42)
            int r0 = defpackage.AbstractC1124.m2153(r0, r2, r1)
            java.util.Map r3 = r3.f8825
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r2.f8824
            r0.<init>(r1)
            java.lang.String r1 = " authParams="
            r0.append(r1)
            java.util.Map r2 = r2.f8825
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
