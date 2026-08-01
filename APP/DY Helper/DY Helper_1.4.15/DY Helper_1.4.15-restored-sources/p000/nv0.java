package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nv0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f7758;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f7759;

    /* JADX INFO: renamed from: γ */
    public final p000.lv0 f7760;

    /* JADX INFO: renamed from: δ */
    public final java.util.Set f7761;

    /* JADX INFO: renamed from: ε */
    public final int f7762;

    /* JADX INFO: renamed from: ζ */
    public final p000.a80 f7763;

    /* JADX INFO: renamed from: η */
    public final p000.a80 f7764;

    /* JADX INFO: renamed from: θ */
    public final p000.a80 f7765;

    /* JADX INFO: renamed from: ι */
    public final p000.a80 f7766;

    public nv0(java.lang.String r4, java.lang.String r5, p000.lv0 r6, java.util.Set r7, int r8, p000.a80 r9, p000.gp0 r10, int r11) {
            r3 = this;
            gp0 r0 = new gp0
            r1 = 23
            r0.<init>(r1)
            gp0 r1 = new gp0
            r2 = 24
            r1.<init>(r2)
            r11 = r11 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L13
            r10 = 0
        L13:
            r3.<init>()
            r3.f7758 = r4
            r3.f7759 = r5
            r3.f7760 = r6
            r3.f7761 = r7
            r3.f7762 = r8
            r3.f7763 = r0
            r3.f7764 = r1
            r3.f7765 = r9
            r3.f7766 = r10
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            goto L67
        L4:
            boolean r0 = r3 instanceof p000.nv0
            if (r0 != 0) goto L9
            goto L65
        L9:
            nv0 r3 = (p000.nv0) r3
            java.lang.String r0 = r2.f7758
            java.lang.String r1 = r3.f7758
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L16
            goto L65
        L16:
            java.lang.String r0 = r2.f7759
            java.lang.String r1 = r3.f7759
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L21
            goto L65
        L21:
            lv0 r0 = r2.f7760
            lv0 r1 = r3.f7760
            if (r0 == r1) goto L28
            goto L65
        L28:
            java.util.Set r0 = r2.f7761
            java.util.Set r1 = r3.f7761
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L33
            goto L65
        L33:
            int r0 = r2.f7762
            int r1 = r3.f7762
            if (r0 == r1) goto L3a
            goto L65
        L3a:
            a80 r0 = r2.f7763
            a80 r1 = r3.f7763
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L45
            goto L65
        L45:
            a80 r0 = r2.f7764
            a80 r1 = r3.f7764
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L50
            goto L65
        L50:
            a80 r0 = r2.f7765
            a80 r1 = r3.f7765
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L5b
            goto L65
        L5b:
            a80 r2 = r2.f7766
            a80 r3 = r3.f7766
            boolean r2 = p000.ln0.m3626(r2, r3)
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
            java.lang.String r0 = r3.f7758
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f7759
            int r0 = p000.a12.m15(r0, r1, r2)
            lv0 r2 = r3.f7760
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * 961
            java.util.Set r0 = r3.f7761
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            int r2 = r3.f7762
            int r0 = p000.a12.m14(r2, r0, r1)
            a80 r2 = r3.f7763
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            a80 r0 = r3.f7764
            int r0 = r0.hashCode()
            int r0 = r0 + r2
            int r0 = r0 * r1
            a80 r2 = r3.f7765
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            a80 r3 = r3.f7766
            if (r3 != 0) goto L44
            r3 = 0
            goto L48
        L44:
            int r3 = r3.hashCode()
        L48:
            int r2 = r2 + r3
            return r2
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", title="
            java.lang.String r1 = ", iconType="
            java.lang.String r2 = "LongPressPanelAction(id="
            java.lang.String r3 = r5.f7758
            java.lang.String r4 = r5.f7759
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            lv0 r1 = r5.f7760
            r0.append(r1)
            java.lang.String r1 = ", customIconRes=null, targets="
            r0.append(r1)
            java.util.Set r1 = r5.f7761
            r0.append(r1)
            java.lang.String r1 = ", order="
            r0.append(r1)
            int r1 = r5.f7762
            r0.append(r1)
            java.lang.String r1 = ", enabled="
            r0.append(r1)
            a80 r1 = r5.f7763
            r0.append(r1)
            java.lang.String r1 = ", visible="
            r0.append(r1)
            a80 r1 = r5.f7764
            r0.append(r1)
            java.lang.String r1 = ", onClick="
            r0.append(r1)
            a80 r1 = r5.f7765
            r0.append(r1)
            java.lang.String r1 = ", onLongClick="
            r0.append(r1)
            a80 r5 = r5.f7766
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
