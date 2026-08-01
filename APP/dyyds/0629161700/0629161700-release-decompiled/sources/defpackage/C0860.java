package defpackage;

/* JADX INFO: renamed from: ᛵᛳᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0860 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.io.File f3915;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final boolean f3916;

    public C0860(java.io.File r3, boolean r4) {
            r2 = this;
            r0 = -96387940654638(0xffffa855ef0961d2, double:NaN)
            r2.<init>()
            r2.f3915 = r3
            r2.f3916 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof defpackage.C0860
            if (r0 != 0) goto L8
            goto L1b
        L8:
            ᛵᛳᲈᲁ r3 = (defpackage.C0860) r3
            java.io.File r0 = r2.f3915
            java.io.File r1 = r3.f3915
            boolean r0 = defpackage.AbstractC0498.m1280(r0, r1)
            if (r0 != 0) goto L15
            goto L1b
        L15:
            boolean r2 = r2.f3916
            boolean r3 = r3.f3916
            if (r2 == r3) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            java.io.File r0 = r1.f3915
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            boolean r1 = r1.f3916
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = -96430890327598(0xffffa84bef0961d2, double:NaN)
            java.lang.String r1 = "FileItem(file="
            r0.<init>(r1)
            java.io.File r1 = r3.f3915
            r0.append(r1)
            r1 = -96495314837038(0xffffa83cef0961d2, double:NaN)
            java.lang.String r1 = ", isDirectory="
            r0.append(r1)
            boolean r3 = r3.f3916
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
