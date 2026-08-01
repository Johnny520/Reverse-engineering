package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class kj0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Long f5945;

    /* JADX INFO: renamed from: β */
    public final int f5946;

    /* JADX INFO: renamed from: γ */
    public final boolean f5947;

    /* JADX INFO: renamed from: δ */
    public final boolean f5948;

    public kj0(java.lang.Long r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f5945 = r1
            r0.f5946 = r2
            r0.f5947 = r3
            r0.f5948 = r4
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.kj0 m3286(p000.kj0 r1, java.lang.Long r2, int r3, boolean r4, int r5) {
            r0 = r5 & 1
            if (r0 == 0) goto L6
            java.lang.Long r2 = r1.f5945
        L6:
            r0 = r5 & 4
            if (r0 == 0) goto Ld
            boolean r0 = r1.f5947
            goto Le
        Ld:
            r0 = 1
        Le:
            r5 = r5 & 8
            if (r5 == 0) goto L14
            boolean r4 = r1.f5948
        L14:
            kj0 r1 = new kj0
            r1.<init>(r2, r3, r0, r4)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.kj0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kj0 r5 = (p000.kj0) r5
            java.lang.Long r1 = r4.f5945
            java.lang.Long r3 = r5.f5945
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r4.f5946
            int r3 = r5.f5946
            if (r1 == r3) goto L1e
            return r2
        L1e:
            boolean r1 = r4.f5947
            boolean r3 = r5.f5947
            if (r1 == r3) goto L25
            return r2
        L25:
            boolean r4 = r4.f5948
            boolean r5 = r5.f5948
            if (r4 == r5) goto L2c
            return r2
        L2c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.Long r0 = r3.f5945
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f5946
            int r0 = p000.a12.m14(r2, r0, r1)
            boolean r2 = r3.f5947
            int r0 = p000.lz1.m3678(r0, r1, r2)
            boolean r3 = r3.f5948
            int r3 = java.lang.Boolean.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IMConversationPageProgress(requestedCursor="
            r0.<init>(r1)
            java.lang.Long r1 = r2.f5945
            r0.append(r1)
            java.lang.String r1 = ", pagesLoaded="
            r0.append(r1)
            int r1 = r2.f5946
            r0.append(r1)
            java.lang.String r1 = ", complete="
            r0.append(r1)
            boolean r1 = r2.f5947
            r0.append(r1)
            java.lang.String r1 = ", stalled="
            r0.append(r1)
            boolean r2 = r2.f5948
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
