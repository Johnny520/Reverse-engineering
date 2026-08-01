package defpackage;

/* JADX INFO: renamed from: ᲁᛴᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1840 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.Set f8033;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.Set f8034;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f8035;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.util.Map f8036;

    public C1840(java.lang.String r1, java.util.Map r2, java.util.AbstractSet r3, java.util.AbstractSet r4) {
            r0 = this;
            r0.<init>()
            r0.f8035 = r1
            r0.f8036 = r2
            r0.f8034 = r3
            r0.f8033 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L3a
        L3:
            boolean r0 = r3 instanceof defpackage.C1840
            if (r0 != 0) goto L8
            goto L2a
        L8:
            ᲁᛴᛱᲇ r3 = (defpackage.C1840) r3
            java.lang.String r0 = r3.f8035
            java.lang.String r1 = r2.f8035
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            java.util.Map r0 = r2.f8036
            java.util.Map r1 = r3.f8036
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            java.util.Set r0 = r2.f8034
            java.util.Set r1 = r3.f8034
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
        L2a:
            r2 = 0
            return r2
        L2c:
            java.util.Set r2 = r2.f8033
            if (r2 == 0) goto L3a
            java.util.Set r3 = r3.f8033
            if (r3 != 0) goto L35
            goto L3a
        L35:
            boolean r2 = r2.equals(r3)
            return r2
        L3a:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f8035
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map r1 = r2.f8036
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.Set r2 = r2.f8034
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |TableInfo {\n            |    name = '"
            r0.<init>(r1)
            java.lang.String r1 = r4.f8035
            r0.append(r1)
            java.lang.String r1 = "',\n            |    columns = {"
            r0.append(r1)
            java.util.Map r1 = r4.f8036
            java.util.Collection r1 = r1.values()
            ᲇᛵᲀᲇ r2 = new ᲇᛵᲀᲇ
            r3 = 17
            r2.<init>(r3)
            java.util.List r1 = defpackage.AbstractC1107.m2116(r1, r2)
            java.lang.String r1 = defpackage.AbstractC1193.m2329(r1)
            r0.append(r1)
            java.lang.String r1 = "\n            |    foreignKeys = {"
            r0.append(r1)
            java.util.Set r1 = r4.f8034
            java.lang.String r1 = defpackage.AbstractC1193.m2329(r1)
            r0.append(r1)
            java.lang.String r1 = "\n            |    indices = {"
            r0.append(r1)
            java.util.Set r4 = r4.f8033
            if (r4 == 0) goto L4c
            ᲇᛵᲀᲇ r1 = new ᲇᛵᲀᲇ
            r2 = 18
            r1.<init>(r2)
            java.util.List r4 = defpackage.AbstractC1107.m2116(r4, r1)
            goto L4e
        L4c:
            ᲀᛶᲇ r4 = defpackage.C1698.f7558
        L4e:
            java.lang.String r4 = defpackage.AbstractC1193.m2329(r4)
            r0.append(r4)
            java.lang.String r4 = "\n            |}\n        "
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = defpackage.AbstractC1171.m2262(r4)
            return r4
    }
}
