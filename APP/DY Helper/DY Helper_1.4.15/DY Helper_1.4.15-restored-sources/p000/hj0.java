package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class hj0 {

    /* JADX INFO: renamed from: α */
    public final p000.xi0 f4747;

    /* JADX INFO: renamed from: β */
    public final p000.yi0 f4748;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f4749;

    public hj0(p000.xi0 r1, p000.yi0 r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f4747 = r1
            r0.f4748 = r2
            r0.f4749 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.hj0
            if (r0 != 0) goto L8
            goto L26
        L8:
            hj0 r3 = (p000.hj0) r3
            xi0 r0 = r2.f4747
            xi0 r1 = r3.f4747
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            yi0 r0 = r2.f4748
            yi0 r1 = r3.f4748
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            java.lang.String r2 = r2.f4749
            java.lang.String r3 = r3.f4749
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
            xi0 r0 = r2.f4747
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            yi0 r1 = r2.f4748
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r2 = r2.f4749
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IMConversationDeleteResult(item="
            r0.<init>(r1)
            xi0 r1 = r2.f4747
            r0.append(r1)
            java.lang.String r1 = ", outcome="
            r0.append(r1)
            yi0 r1 = r2.f4748
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f4749
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }
}
