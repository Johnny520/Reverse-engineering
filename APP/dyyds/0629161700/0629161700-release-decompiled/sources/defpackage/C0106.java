package defpackage;

/* JADX INFO: renamed from: ᛱᛵᲇᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0106 extends defpackage.C2210 {

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public static final defpackage.C0106 f937 = null;

    static {
            ᛱᛵᲇᲇ r0 = new ᛱᛵᲇᲇ
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2, r1)
            defpackage.C0106.f937 = r0
            return
    }

    @Override // defpackage.C2210
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.C0106
            if (r0 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            ᛱᛵᲇᲇ r0 = (defpackage.C0106) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
        L13:
            ᛱᛵᲇᲇ r3 = (defpackage.C0106) r3
            int r0 = r3.f9424
            int r1 = r2.f9424
            if (r1 != r0) goto L23
            int r2 = r2.f9423
            int r3 = r3.f9423
            if (r2 != r3) goto L23
        L21:
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    @Override // defpackage.C2210
    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = -1
            return r1
        L8:
            int r0 = r1.f9424
            int r0 = r0 * 31
            int r1 = r1.f9423
            int r0 = r0 + r1
            return r0
    }

    @Override // defpackage.C2210
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.f9424
            int r1 = r1.f9423
            if (r0 <= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // defpackage.C2210
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.f9424
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r2 = r2.f9423
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
