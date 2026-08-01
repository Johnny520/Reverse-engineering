package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class zi1 {

    /* JADX INFO: renamed from: α */
    public final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord f13103;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f13104;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f13105;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Object f13106;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f13107;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f13108;

    public zi1(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1, java.lang.String r2, java.util.List r3, java.util.List r4, java.util.List r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.f13103 = r1
            r0.f13104 = r2
            r0.f13105 = r3
            r0.f13106 = r4
            r0.f13107 = r5
            r0.f13108 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof p000.zi1
            if (r0 != 0) goto L8
            goto L4b
        L8:
            zi1 r3 = (p000.zi1) r3
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r2.f13103
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r3.f13103
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            java.lang.String r0 = r2.f13104
            java.lang.String r1 = r3.f13104
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            java.util.List r0 = r2.f13105
            java.util.List r1 = r3.f13105
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            java.lang.Object r0 = r2.f13106
            java.lang.Object r1 = r3.f13106
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            java.lang.Object r0 = r2.f13107
            java.lang.Object r1 = r3.f13107
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            java.lang.String r2 = r2.f13108
            java.lang.String r3 = r3.f13108
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = 0
            return r2
        L4d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r3.f13103
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f13104
            int r0 = p000.a12.m15(r0, r1, r2)
            java.util.List r2 = r3.f13105
            int r0 = p000.a12.m16(r2, r0, r1)
            java.lang.Object r2 = r3.f13106
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.Object r0 = r3.f13107
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r3 = r3.f13108
            if (r3 != 0) goto L2b
            r3 = 0
            goto L2f
        L2b:
            int r3 = r3.hashCode()
        L2f:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DebugLoadResult(record="
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r2.f13103
            r0.append(r1)
            java.lang.String r1 = ", source="
            r0.append(r1)
            java.lang.String r1 = r2.f13104
            r0.append(r1)
            java.lang.String r1 = ", recognized="
            r0.append(r1)
            java.util.List r1 = r2.f13105
            r0.append(r1)
            java.lang.String r1 = ", unrecognized="
            r0.append(r1)
            java.lang.Object r1 = r2.f13106
            r0.append(r1)
            java.lang.String r1 = ", pages="
            r0.append(r1)
            java.lang.Object r1 = r2.f13107
            r0.append(r1)
            java.lang.String r1 = ", error="
            r0.append(r1)
            java.lang.String r2 = r2.f13108
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
