package defpackage;

/* JADX INFO: renamed from: ᛷᲇᛱᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1380 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f6021;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public boolean f6022;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.Class f6023;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.Object f6024;

    public C1380(int r1, java.lang.Class r2, java.lang.Object r3) {
            r0 = this;
            r0.<init>()
            r0.f6023 = r2
            r0.f6024 = r3
            r2 = 0
            r0.f6022 = r2
            r0.f6021 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2f
        L3:
            boolean r0 = r3 instanceof defpackage.C1380
            if (r0 != 0) goto L8
            goto L2d
        L8:
            ᛷᲇᛱᲈ r3 = (defpackage.C1380) r3
            java.lang.Class r0 = r2.f6023
            java.lang.Class r1 = r3.f6023
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L15
            goto L2d
        L15:
            java.lang.Object r0 = r2.f6024
            java.lang.Object r1 = r3.f6024
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L20
            goto L2d
        L20:
            boolean r0 = r2.f6022
            boolean r1 = r3.f6022
            if (r0 == r1) goto L27
            goto L2d
        L27:
            int r2 = r2.f6021
            int r3 = r3.f6021
            if (r2 == r3) goto L2f
        L2d:
            r2 = 0
            return r2
        L2f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Class r0 = r2.f6023
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f6024
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 961
            boolean r1 = r2.f6022
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            int r1 = r1 * 31
            int r2 = r2.f6021
            int r2 = defpackage.AbstractC0225.m812(r2)
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.f6022
            int r1 = r4.f6021
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Configuration(declaringClass="
            r2.<init>(r3)
            java.lang.Class r3 = r4.f6023
            r2.append(r3)
            java.lang.String r3 = ", memberInstance="
            r2.append(r3)
            java.lang.Object r4 = r4.f6024
            r2.append(r4)
            java.lang.String r4 = ", processorResolver=null, superclass="
            r2.append(r4)
            r2.append(r0)
            java.lang.String r4 = ", optional="
            r2.append(r4)
            r4 = 1
            if (r1 == r4) goto L39
            r4 = 2
            if (r1 == r4) goto L36
            r4 = 3
            if (r1 == r4) goto L33
            java.lang.String r4 = "null"
            goto L3b
        L33:
            java.lang.String r4 = "SILENT"
            goto L3b
        L36:
            java.lang.String r4 = "NOTICE"
            goto L3b
        L39:
            java.lang.String r4 = "NO"
        L3b:
            r2.append(r4)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }
}
