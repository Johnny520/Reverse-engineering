package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class de1 {

    /* JADX INFO: renamed from: α */
    public final java.util.List f3106;

    /* JADX INFO: renamed from: β */
    public final java.util.List f3107;

    /* JADX INFO: renamed from: γ */
    public final java.util.List f3108;

    /* JADX INFO: renamed from: δ */
    public final java.util.List f3109;

    public de1(java.util.List r1, java.util.List r2, java.util.List r3, java.util.List r4) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.f3106 = r1
            r0.f3107 = r2
            r0.f3108 = r3
            r0.f3109 = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.de1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            de1 r5 = (p000.de1) r5
            java.util.List r1 = r4.f3106
            java.util.List r3 = r5.f3106
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.util.List r1 = r4.f3107
            java.util.List r3 = r5.f3107
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.util.List r1 = r4.f3108
            java.util.List r3 = r5.f3108
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.util.List r4 = r4.f3109
            java.util.List r5 = r5.f3109
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L38
            return r2
        L38:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f3106
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.f3107
            int r0 = p000.a12.m16(r2, r0, r1)
            java.util.List r2 = r3.f3108
            int r0 = p000.a12.m16(r2, r0, r1)
            java.util.List r3 = r3.f3109
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConversationIdMatches(shortId="
            r0.<init>(r1)
            java.util.List r1 = r2.f3106
            r0.append(r1)
            java.lang.String r1 = ", exact="
            r0.append(r1)
            java.util.List r1 = r2.f3107
            r0.append(r1)
            java.lang.String r1 = ", participants="
            r0.append(r1)
            java.util.List r1 = r2.f3108
            r0.append(r1)
            java.lang.String r1 = ", embeddedOtherUid="
            r0.append(r1)
            java.util.List r2 = r2.f3109
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
