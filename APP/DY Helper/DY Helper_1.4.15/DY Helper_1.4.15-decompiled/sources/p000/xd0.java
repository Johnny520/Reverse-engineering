package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class xd0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f12133;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f12134;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f12135;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f12136;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f12137;

    /* JADX INFO: renamed from: ζ */
    public final long f12138;

    public xd0(long r1, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r0.<init>()
            r0.f12133 = r3
            r0.f12134 = r4
            r0.f12135 = r5
            r0.f12136 = r6
            r0.f12137 = r7
            r0.f12138 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static p000.xd0 m6612(p000.xd0 r8, java.lang.String r9, long r10, int r12) {
            java.lang.String r3 = r8.f12133
            java.lang.String r4 = r8.f12134
            java.lang.String r5 = r8.f12135
            java.lang.String r6 = r8.f12136
            r0 = r12 & 16
            if (r0 == 0) goto Le
            java.lang.String r9 = r8.f12137
        Le:
            r7 = r9
            r9 = r12 & 32
            if (r9 == 0) goto L15
            long r10 = r8.f12138
        L15:
            r1 = r10
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            xd0 r0 = new xd0
            r0.<init>(r1, r3, r4, r5, r6, r7)
            return r0
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof p000.xd0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            xd0 r6 = (p000.xd0) r6
            java.lang.String r1 = r5.f12133
            java.lang.String r3 = r6.f12133
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.String r1 = r5.f12134
            java.lang.String r3 = r6.f12134
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            java.lang.String r1 = r5.f12135
            java.lang.String r3 = r6.f12135
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.String r1 = r5.f12136
            java.lang.String r3 = r6.f12136
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.String r1 = r5.f12137
            java.lang.String r3 = r6.f12137
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L43
            return r2
        L43:
            long r3 = r5.f12138
            long r5 = r6.f12138
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 == 0) goto L4c
            return r2
        L4c:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f12133
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f12134
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f12135
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f12136
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f12137
            int r0 = p000.a12.m15(r0, r1, r2)
            long r1 = r3.f12138
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", secUid="
            java.lang.String r1 = ", uniqueId="
            java.lang.String r2 = "HiddenContactRecord(uid="
            java.lang.String r3 = r5.f12133
            java.lang.String r4 = r5.f12134
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = ", shortId="
            java.lang.String r2 = ", displayName="
            java.lang.String r3 = r5.f12135
            java.lang.String r4 = r5.f12136
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            java.lang.String r1 = r5.f12137
            r0.append(r1)
            java.lang.String r1 = ", hiddenAt="
            r0.append(r1)
            long r1 = r5.f12138
            r0.append(r1)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
