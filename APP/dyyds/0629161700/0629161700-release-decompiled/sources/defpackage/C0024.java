package defpackage;

/* JADX INFO: renamed from: ᛱᛱᛷᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0024 implements java.lang.Iterable, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final defpackage.C0024 f465 = null;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String[] f466;

    static {
            ᛱᛱᛷᛳ r0 = new ᛱᛱᛷᛳ
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.<init>(r1)
            defpackage.C0024.f465 = r0
            return
    }

    public C0024(java.lang.String[] r1) {
            r0 = this;
            r0.<init>()
            r0.f466 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.C0024
            if (r0 == 0) goto L12
            ᛱᛱᛷᛳ r2 = (defpackage.C0024) r2
            java.lang.String[] r2 = r2.f466
            java.lang.String[] r1 = r1.f466
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String[] r0 = r0.f466
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r6 = this;
            int r0 = r6.size()
            kotlin.Pair[] r1 = new kotlin.Pair[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L1b
            java.lang.String r3 = defpackage.AbstractC0729.m1649(r6, r2)
            java.lang.String r4 = defpackage.AbstractC0729.m1635(r6, r2)
            kotlin.Pair r5 = new kotlin.Pair
            r5.<init>(r3, r4)
            r1[r2] = r5
            int r2 = r2 + 1
            goto L7
        L1b:
            ᛶᛷᛱᲀ r6 = new ᛶᛷᛱᲀ
            r0 = 1
            r6.<init>(r0, r1)
            return r6
    }

    public final int size() {
            r0 = this;
            java.lang.String[] r0 = r0.f466
            int r0 = r0.length
            int r0 = r0 / 2
            return r0
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L2f
            java.lang.String r3 = defpackage.AbstractC0729.m1649(r6, r2)
            java.lang.String r4 = defpackage.AbstractC0729.m1635(r6, r2)
            r0.append(r3)
            java.lang.String r5 = ": "
            r0.append(r5)
            boolean r3 = defpackage.AbstractC0709.m1609(r3)
            if (r3 == 0) goto L24
            java.lang.String r4 = "██"
        L24:
            r0.append(r4)
            java.lang.String r3 = "\n"
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L2f:
            java.lang.String r6 = r0.toString()
            return r6
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String m324(java.lang.String r4) {
            r3 = this;
            java.lang.String[] r3 = r3.f466
            int r0 = r3.length
            int r0 = r0 + (-2)
            r1 = 0
            r2 = -2
            int r1 = defpackage.AbstractC0425.m1187(r0, r1, r2)
            if (r1 > r0) goto L1f
        Ld:
            r2 = r3[r0]
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1a
            int r0 = r0 + 1
            r3 = r3[r0]
            return r3
        L1a:
            if (r0 == r1) goto L1f
            int r0 = r0 + (-2)
            goto Ld
        L1f:
            r3 = 0
            return r3
    }
}
