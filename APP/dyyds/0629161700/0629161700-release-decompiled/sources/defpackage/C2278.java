package defpackage;

/* JADX INFO: renamed from: ᲈᛶᲈᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2278 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final java.util.List f9630;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.util.List f9631;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f9632;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean f9633;

    public C2278(java.lang.String r1, boolean r2, java.util.List r3, java.util.List r4) {
            r0 = this;
            r0.<init>()
            r0.f9632 = r1
            r0.f9633 = r2
            r0.f9631 = r3
            r0.f9630 = r4
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L25
            int r1 = r3.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r1)
            r2 = 0
        L1b:
            if (r2 >= r1) goto L25
            java.lang.String r3 = "ASC"
            r4.add(r3)
            int r2 = r2 + 1
            goto L1b
        L25:
            r0.f9630 = r4
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            if (r3 != r4) goto L4
            r3 = 1
            return r3
        L4:
            boolean r0 = r4 instanceof defpackage.C2278
            if (r0 != 0) goto L9
            goto L29
        L9:
            ᲈᛶᲈᲈ r4 = (defpackage.C2278) r4
            java.lang.String r0 = r4.f9632
            boolean r1 = r4.f9633
            boolean r2 = r3.f9633
            if (r2 == r1) goto L14
            goto L29
        L14:
            java.util.List r1 = r3.f9631
            java.util.List r2 = r4.f9631
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1f
            goto L29
        L1f:
            java.util.List r1 = r3.f9630
            java.util.List r4 = r4.f9630
            boolean r4 = defpackage.AbstractC0498.m1280(r1, r4)
            if (r4 != 0) goto L2b
        L29:
            r3 = 0
            return r3
        L2b:
            java.lang.String r3 = r3.f9632
            java.lang.String r4 = "index_"
            boolean r1 = r3.startsWith(r4)
            if (r1 == 0) goto L3a
            boolean r3 = r0.startsWith(r4)
            return r3
        L3a:
            boolean r3 = r3.equals(r0)
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = "index_"
            java.lang.String r1 = r2.f9632
            boolean r0 = r1.startsWith(r0)
            if (r0 == 0) goto Le
            r0 = -1184239155(0xffffffffb969f1cd, float:-2.231069E-4)
            goto L12
        Le:
            int r0 = r1.hashCode()
        L12:
            int r0 = r0 * 31
            boolean r1 = r2.f9633
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.util.List r1 = r2.f9631
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r2 = r2.f9630
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "\n            |Index {\n            |   name = '"
            r0.<init>(r1)
            java.lang.String r1 = r8.f9632
            r0.append(r1)
            java.lang.String r1 = "',\n            |   unique = '"
            r0.append(r1)
            boolean r1 = r8.f9633
            r0.append(r1)
            java.lang.String r1 = "',\n            |   columns = {"
            r0.append(r1)
            r6 = 0
            r7 = 62
            java.util.List r2 = r8.f9631
            java.lang.String r3 = ","
            r4 = 0
            r5 = 0
            java.lang.String r1 = defpackage.AbstractC1107.m2125(r2, r3, r4, r5, r6, r7)
            java.lang.String r1 = defpackage.AbstractC1171.m2268(r1)
            java.lang.String r2 = "},"
            java.lang.String r2 = defpackage.AbstractC1171.m2268(r2)
            java.lang.String r1 = r1.concat(r2)
            r0.append(r1)
            java.lang.String r1 = "\n            |   orders = {"
            r0.append(r1)
            java.util.List r2 = r8.f9630
            java.lang.String r3 = ","
            java.lang.String r8 = defpackage.AbstractC1107.m2125(r2, r3, r4, r5, r6, r7)
            java.lang.String r8 = defpackage.AbstractC1171.m2268(r8)
            java.lang.String r1 = " }"
            java.lang.String r1 = defpackage.AbstractC1171.m2268(r1)
            java.lang.String r8 = r8.concat(r1)
            r0.append(r8)
            java.lang.String r8 = "\n            |}\n        "
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            java.lang.String r8 = defpackage.AbstractC1171.m2262(r8)
            java.lang.String r8 = defpackage.AbstractC1171.m2268(r8)
            return r8
    }
}
