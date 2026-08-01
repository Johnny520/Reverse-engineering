package p000;

/* JADX INFO: renamed from: jn */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0437jn {

    /* JADX INFO: renamed from: α */
    public final int f5526;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f5527;

    public C0437jn(int r1, p000.v81 r2, java.lang.Integer r3) {
            r0 = this;
            r0.<init>()
            r0.f5526 = r1
            r0.f5527 = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.C0437jn
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            jn r5 = (p000.C0437jn) r5
            int r1 = r4.f5526
            int r3 = r5.f5526
            if (r1 == r3) goto L13
            return r2
        L13:
            r1 = 0
            r3 = 0
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L1c
            return r2
        L1c:
            java.lang.Integer r4 = r4.f5527
            java.lang.Integer r5 = r5.f5527
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L27
            return r2
        L27:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f5526
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            r1 = 0
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Integer r2 = r2.f5527
            if (r2 != 0) goto L11
            goto L15
        L11:
            int r1 = r2.hashCode()
        L15:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ComposeStackTraceFrame(groupKey="
            r0.<init>(r1)
            int r1 = r2.f5526
            r0.append(r1)
            java.lang.String r1 = ", sourceInfo="
            r0.append(r1)
            r1 = 0
            r0.append(r1)
            java.lang.String r1 = ", groupOffset="
            r0.append(r1)
            java.lang.Integer r2 = r2.f5527
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
