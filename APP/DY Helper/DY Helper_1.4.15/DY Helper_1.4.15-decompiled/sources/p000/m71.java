package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m71 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7000;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f7001;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f7002;

    /* JADX INFO: renamed from: δ */
    public final int f7003;

    /* JADX INFO: renamed from: ε */
    public final java.lang.String f7004;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.String f7005;

    /* JADX INFO: renamed from: η */
    public final boolean f7006;

    /* JADX INFO: renamed from: θ */
    public final java.lang.String f7007;

    /* JADX INFO: renamed from: ι */
    public final p000.p70 f7008;

    public m71(java.lang.String r1, java.lang.String r2, java.lang.String r3, int r4, java.lang.String r5, java.lang.String r6, boolean r7, java.lang.String r8, p000.p70 r9) {
            r0 = this;
            r5.getClass()
            r6.getClass()
            r0.<init>()
            r0.f7000 = r1
            r0.f7001 = r2
            r0.f7002 = r3
            r0.f7003 = r4
            r0.f7004 = r5
            r0.f7005 = r6
            r0.f7006 = r7
            r0.f7007 = r8
            r0.f7008 = r9
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L67
        L4:
            boolean r0 = r3 instanceof p000.m71
            if (r0 != 0) goto L9
            goto L65
        L9:
            m71 r3 = (p000.m71) r3
            java.lang.String r0 = r2.f7000
            java.lang.String r1 = r3.f7000
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L16
            goto L65
        L16:
            java.lang.String r0 = r2.f7001
            java.lang.String r1 = r3.f7001
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L21
            goto L65
        L21:
            java.lang.String r0 = r2.f7002
            java.lang.String r1 = r3.f7002
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2c
            goto L65
        L2c:
            int r0 = r2.f7003
            int r1 = r3.f7003
            if (r0 == r1) goto L33
            goto L65
        L33:
            java.lang.String r0 = r2.f7004
            java.lang.String r1 = r3.f7004
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L3e
            goto L65
        L3e:
            java.lang.String r0 = r2.f7005
            java.lang.String r1 = r3.f7005
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L49
            goto L65
        L49:
            boolean r0 = r2.f7006
            boolean r1 = r3.f7006
            if (r0 == r1) goto L50
            goto L65
        L50:
            java.lang.String r0 = r2.f7007
            java.lang.String r1 = r3.f7007
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L5b
            goto L65
        L5b:
            p70 r2 = r2.f7008
            p70 r3 = r3.f7008
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L67
        L65:
            r2 = 0
            return r2
        L67:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f7000
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f7001
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f7002
            int r0 = p000.a12.m15(r0, r1, r2)
            int r2 = r3.f7003
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r2 = r3.f7004
            int r0 = p000.a12.m15(r0, r1, r2)
            java.lang.String r2 = r3.f7005
            int r0 = p000.a12.m15(r0, r1, r2)
            boolean r2 = r3.f7006
            int r0 = p000.lz1.m3678(r0, r1, r2)
            java.lang.String r2 = r3.f7007
            if (r2 != 0) goto L33
            r2 = 0
            goto L37
        L33:
            int r2 = r2.hashCode()
        L37:
            int r0 = r0 + r2
            int r0 = r0 * r1
            p70 r3 = r3.f7008
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", subtitle="
            java.lang.String r2 = "SharePanelAction(id="
            java.lang.String r3 = r5.f7000
            java.lang.String r4 = r5.f7001
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f7002
            r0.append(r1)
            java.lang.String r1 = ", iconRes="
            r0.append(r1)
            int r1 = r5.f7003
            r0.append(r1)
            java.lang.String r1 = ", iconBg="
            r0.append(r1)
            java.lang.String r1 = ", iconTint="
            java.lang.String r2 = ", enabled="
            java.lang.String r3 = r5.f7004
            java.lang.String r4 = r5.f7005
            p000.AbstractC0602nx.m4119(r0, r3, r1, r4, r2)
            boolean r1 = r5.f7006
            r0.append(r1)
            java.lang.String r1 = ", unavailableReason="
            r0.append(r1)
            java.lang.String r1 = r5.f7007
            r0.append(r1)
            java.lang.String r1 = ", execute="
            r0.append(r1)
            p70 r5 = r5.f7008
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
