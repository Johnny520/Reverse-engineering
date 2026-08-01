package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nu1 {

    /* JADX INFO: renamed from: α */
    public final p000.pu1 f7755;

    /* JADX INFO: renamed from: β */
    public final android.widget.LinearLayout f7756;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7757;

    public nu1(p000.pu1 r1, android.widget.LinearLayout r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f7755 = r1
            r0.f7756 = r2
            r0.f7757 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.nu1
            if (r0 != 0) goto L8
            goto L26
        L8:
            nu1 r3 = (p000.nu1) r3
            pu1 r0 = r2.f7755
            pu1 r1 = r3.f7755
            if (r0 == r1) goto L11
            goto L26
        L11:
            android.widget.LinearLayout r0 = r2.f7756
            android.widget.LinearLayout r1 = r3.f7756
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1c
            goto L26
        L1c:
            java.lang.String r2 = r2.f7757
            java.lang.String r3 = r3.f7757
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            pu1 r0 = r2.f7755
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            android.widget.LinearLayout r1 = r2.f7756
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r2 = r2.f7757
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SectionEntry(tab="
            r0.<init>(r1)
            pu1 r1 = r2.f7755
            r0.append(r1)
            java.lang.String r1 = ", container="
            r0.append(r1)
            android.widget.LinearLayout r1 = r2.f7756
            r0.append(r1)
            java.lang.String r1 = ", searchableText="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f7757
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }
}
