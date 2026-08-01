package p000;

/* JADX INFO: renamed from: kq */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0484kq {

    /* JADX INFO: renamed from: α */
    public final java.lang.Object f6076;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f6077;

    /* JADX INFO: renamed from: γ */
    public final android.view.View f6078;

    /* JADX INFO: renamed from: δ */
    public final p000.C0558mq f6079;

    public C0484kq(java.lang.Object r1, java.lang.Object r2, android.view.View r3, p000.C0558mq r4) {
            r0 = this;
            r0.<init>()
            r0.f6076 = r1
            r0.f6077 = r2
            r0.f6078 = r3
            r0.f6079 = r4
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L37
        L3:
            boolean r0 = r3 instanceof p000.C0484kq
            if (r0 != 0) goto L8
            goto L35
        L8:
            kq r3 = (p000.C0484kq) r3
            java.lang.Object r0 = r2.f6076
            java.lang.Object r1 = r3.f6076
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L35
        L15:
            java.lang.Object r0 = r2.f6077
            java.lang.Object r1 = r3.f6077
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L35
        L20:
            android.view.View r0 = r2.f6078
            android.view.View r1 = r3.f6078
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L35
        L2b:
            mq r2 = r2.f6079
            mq r3 = r3.f6079
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L37
        L35:
            r2 = 0
            return r2
        L37:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Object r0 = r2.f6076
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r1 = r2.f6077
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            android.view.View r0 = r2.f6078
            if (r0 != 0) goto L17
            r0 = 0
            goto L1b
        L17:
            int r0 = r0.hashCode()
        L1b:
            int r1 = r1 + r0
            int r1 = r1 * 31
            mq r2 = r2.f6079
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Selection(holder="
            r0.<init>(r1)
            java.lang.Object r1 = r2.f6076
            r0.append(r1)
            java.lang.String r1 = ", aweme="
            r0.append(r1)
            java.lang.Object r1 = r2.f6077
            r0.append(r1)
            java.lang.String r1 = ", itemView="
            r0.append(r1)
            android.view.View r1 = r2.f6078
            r0.append(r1)
            java.lang.String r1 = ", summary="
            r0.append(r1)
            mq r2 = r2.f6079
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
