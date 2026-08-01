package p000;

/* JADX INFO: renamed from: vx */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0926vx {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f11456;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f11457;

    /* JADX INFO: renamed from: γ */
    public final p000.zn1 f11458;

    /* JADX INFO: renamed from: δ */
    public final java.io.BufferedInputStream f11459;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f11460;

    /* JADX INFO: renamed from: ζ */
    public final long f11461;

    /* JADX INFO: renamed from: η */
    public final int f11462;

    public C0926vx(java.lang.String r1, java.lang.String r2, p000.zn1 r3, java.io.BufferedInputStream r4, java.lang.String r5, long r6, int r8) {
            r0 = this;
            r0.<init>()
            r0.f11456 = r1
            r0.f11457 = r2
            r0.f11458 = r3
            r0.f11459 = r4
            r0.f11460 = r5
            r0.f11461 = r6
            r0.f11462 = r8
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L52
        L3:
            boolean r0 = r5 instanceof p000.C0926vx
            if (r0 != 0) goto L8
            goto L50
        L8:
            vx r5 = (p000.C0926vx) r5
            java.lang.String r0 = r4.f11456
            java.lang.String r1 = r5.f11456
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L50
        L15:
            java.lang.String r0 = r4.f11457
            java.lang.String r1 = r5.f11457
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L50
        L20:
            zn1 r0 = r4.f11458
            zn1 r1 = r5.f11458
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L50
        L2b:
            java.io.BufferedInputStream r0 = r4.f11459
            java.io.BufferedInputStream r1 = r5.f11459
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L36
            goto L50
        L36:
            java.lang.String r0 = r4.f11460
            java.lang.String r1 = r5.f11460
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L50
        L41:
            long r0 = r4.f11461
            long r2 = r5.f11461
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L4a
            goto L50
        L4a:
            int r4 = r4.f11462
            int r5 = r5.f11462
            if (r4 == r5) goto L52
        L50:
            r4 = 0
            return r4
        L52:
            r4 = 1
            return r4
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f11456
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.f11457
            int r0 = p000.a12.m15(r0, r1, r2)
            zn1 r2 = r4.f11458
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.io.BufferedInputStream r0 = r4.f11459
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            java.lang.String r2 = r4.f11460
            if (r2 != 0) goto L25
            r2 = 0
            goto L29
        L25:
            int r2 = r2.hashCode()
        L29:
            int r0 = r0 + r2
            int r0 = r0 * r1
            long r2 = r4.f11461
            int r0 = p000.lz1.m3677(r0, r1, r2)
            int r4 = r4.f11462
            int r4 = java.lang.Integer.hashCode(r4)
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", finalUrl="
            java.lang.String r1 = ", response="
            java.lang.String r2 = "OpenedDownload(requestUrl="
            java.lang.String r3 = r5.f11456
            java.lang.String r4 = r5.f11457
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            zn1 r1 = r5.f11458
            r0.append(r1)
            java.lang.String r1 = ", input="
            r0.append(r1)
            java.io.BufferedInputStream r1 = r5.f11459
            r0.append(r1)
            java.lang.String r1 = ", contentType="
            r0.append(r1)
            java.lang.String r1 = r5.f11460
            r0.append(r1)
            java.lang.String r1 = ", contentLength="
            r0.append(r1)
            long r1 = r5.f11461
            r0.append(r1)
            java.lang.String r1 = ", code="
            r0.append(r1)
            int r5 = r5.f11462
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }

    /* JADX INFO: renamed from: α */
    public final void m6283() {
            r1 = this;
            java.io.BufferedInputStream r0 = r1.f11459     // Catch: java.lang.Throwable -> L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            zn1 r1 = r1.f11458     // Catch: java.lang.Throwable -> La
            r1.close()     // Catch: java.lang.Throwable -> La
        La:
            return
    }
}
