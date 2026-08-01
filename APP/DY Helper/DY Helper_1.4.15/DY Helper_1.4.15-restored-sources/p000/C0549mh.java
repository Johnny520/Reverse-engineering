package p000;

/* JADX INFO: renamed from: mh */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0549mh {

    /* JADX INFO: renamed from: α */
    public final p000.C0512lh f7130;

    /* JADX INFO: renamed from: β */
    public final boolean f7131;

    public C0549mh(p000.C0512lh r2, int r3) {
            r1 = this;
            r0 = r3 & 1
            if (r0 == 0) goto L5
            r2 = 0
        L5:
            r3 = r3 & 2
            if (r3 == 0) goto Lb
            r3 = 0
            goto Lc
        Lb:
            r3 = 1
        Lc:
            r1.<init>()
            r1.f7130 = r2
            r1.f7131 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0549mh
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mh r5 = (p000.C0549mh) r5
            lh r1 = r4.f7130
            lh r3 = r5.f7130
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            boolean r4 = r4.f7131
            boolean r5 = r5.f7131
            if (r4 == r5) goto L1e
            return r2
        L1e:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            lh r0 = r1.f7130
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            int r0 = r0 * 31
            boolean r1 = r1.f7131
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SignalResult(pauseCandidate="
            r0.<init>(r1)
            lh r1 = r2.f7130
            r0.append(r1)
            java.lang.String r1 = ", shouldCommitPlaying="
            r0.append(r1)
            boolean r2 = r2.f7131
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
