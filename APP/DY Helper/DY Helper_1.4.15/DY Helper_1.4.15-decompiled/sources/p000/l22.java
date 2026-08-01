package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l22 {

    /* JADX INFO: renamed from: α */
    public final int f6392;

    /* JADX INFO: renamed from: β */
    public final int f6393;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Float f6394;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Integer f6395;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Integer f6396;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Integer f6397;

    /* JADX INFO: renamed from: η */
    public final java.lang.Integer f6398;

    /* JADX INFO: renamed from: θ */
    public final java.lang.Integer f6399;

    /* JADX INFO: renamed from: ι */
    public final java.lang.Integer f6400;

    /* JADX INFO: renamed from: κ */
    public final java.lang.Integer f6401;

    public l22(int r1, int r2, java.lang.Float r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.Integer r9, java.lang.Integer r10) {
            r0 = this;
            r0.<init>()
            r0.f6392 = r1
            r0.f6393 = r2
            r0.f6394 = r3
            r0.f6395 = r4
            r0.f6396 = r5
            r0.f6397 = r6
            r0.f6398 = r7
            r0.f6399 = r8
            r0.f6400 = r9
            r0.f6401 = r10
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.l22
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l22 r5 = (p000.l22) r5
            int r1 = r4.f6392
            int r3 = r5.f6392
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.f6393
            int r3 = r5.f6393
            if (r1 == r3) goto L1a
            return r2
        L1a:
            java.lang.Float r1 = r4.f6394
            java.lang.Float r3 = r5.f6394
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L25
            return r2
        L25:
            java.lang.Integer r1 = r4.f6395
            java.lang.Integer r3 = r5.f6395
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            java.lang.Integer r1 = r4.f6396
            java.lang.Integer r3 = r5.f6396
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L3b
            return r2
        L3b:
            java.lang.Integer r1 = r4.f6397
            java.lang.Integer r3 = r5.f6397
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L46
            return r2
        L46:
            java.lang.Integer r1 = r4.f6398
            java.lang.Integer r3 = r5.f6398
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L51
            return r2
        L51:
            java.lang.Integer r1 = r4.f6399
            java.lang.Integer r3 = r5.f6399
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L5c
            return r2
        L5c:
            java.lang.Integer r1 = r4.f6400
            java.lang.Integer r3 = r5.f6400
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L67
            return r2
        L67:
            java.lang.Integer r4 = r4.f6401
            java.lang.Integer r5 = r5.f6401
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L72
            return r2
        L72:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.f6392
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r4.f6393
            int r0 = p000.a12.m14(r2, r0, r1)
            r2 = 0
            java.lang.Float r3 = r4.f6394
            if (r3 != 0) goto L16
            r3 = r2
            goto L1a
        L16:
            int r3 = r3.hashCode()
        L1a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f6395
            if (r3 != 0) goto L22
            r3 = r2
            goto L26
        L22:
            int r3 = r3.hashCode()
        L26:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f6396
            if (r3 != 0) goto L2e
            r3 = r2
            goto L32
        L2e:
            int r3 = r3.hashCode()
        L32:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f6397
            if (r3 != 0) goto L3a
            r3 = r2
            goto L3e
        L3a:
            int r3 = r3.hashCode()
        L3e:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f6398
            if (r3 != 0) goto L46
            r3 = r2
            goto L4a
        L46:
            int r3 = r3.hashCode()
        L4a:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f6399
            if (r3 != 0) goto L52
            r3 = r2
            goto L56
        L52:
            int r3 = r3.hashCode()
        L56:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r3 = r4.f6400
            if (r3 != 0) goto L5e
            r3 = r2
            goto L62
        L5e:
            int r3 = r3.hashCode()
        L62:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Integer r4 = r4.f6401
            if (r4 != 0) goto L69
            goto L6d
        L69:
            int r2 = r4.hashCode()
        L6d:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", height="
            java.lang.String r1 = ", weight="
            java.lang.String r2 = "BottomTabLayoutSnapshot(width="
            int r3 = r5.f6392
            int r4 = r5.f6393
            java.lang.StringBuilder r0 = p000.AbstractC0602nx.m4136(r2, r3, r0, r4, r1)
            java.lang.Float r1 = r5.f6394
            r0.append(r1)
            java.lang.String r1 = ", gravity="
            r0.append(r1)
            java.lang.Integer r1 = r5.f6395
            r0.append(r1)
            java.lang.String r1 = ", leftMargin="
            r0.append(r1)
            java.lang.Integer r1 = r5.f6396
            r0.append(r1)
            java.lang.String r1 = ", topMargin="
            r0.append(r1)
            java.lang.Integer r1 = r5.f6397
            r0.append(r1)
            java.lang.String r1 = ", rightMargin="
            r0.append(r1)
            java.lang.Integer r1 = r5.f6398
            r0.append(r1)
            java.lang.String r1 = ", bottomMargin="
            r0.append(r1)
            java.lang.Integer r1 = r5.f6399
            r0.append(r1)
            java.lang.String r1 = ", marginStart="
            r0.append(r1)
            java.lang.Integer r1 = r5.f6400
            r0.append(r1)
            java.lang.String r1 = ", marginEnd="
            r0.append(r1)
            java.lang.Integer r5 = r5.f6401
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
