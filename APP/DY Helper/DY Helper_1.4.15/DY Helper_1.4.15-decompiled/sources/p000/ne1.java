package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ne1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Integer f7583;

    /* JADX INFO: renamed from: β */
    public final java.lang.Integer f7584;

    /* JADX INFO: renamed from: γ */
    public final java.lang.Long f7585;

    /* JADX INFO: renamed from: δ */
    public final java.lang.Long f7586;

    /* JADX INFO: renamed from: ε */
    public final java.lang.Long f7587;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Long f7588;

    /* JADX INFO: renamed from: η */
    public final java.util.List f7589;

    public ne1(java.lang.Integer r1, java.lang.Integer r2, java.lang.Long r3, java.lang.Long r4, java.lang.Long r5, java.lang.Long r6, java.util.List r7) {
            r0 = this;
            r0.<init>()
            r0.f7583 = r1
            r0.f7584 = r2
            r0.f7585 = r3
            r0.f7586 = r4
            r0.f7587 = r5
            r0.f7588 = r6
            r0.f7589 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L58
        L3:
            boolean r0 = r3 instanceof p000.ne1
            if (r0 != 0) goto L8
            goto L56
        L8:
            ne1 r3 = (p000.ne1) r3
            java.lang.Integer r0 = r2.f7583
            java.lang.Integer r1 = r3.f7583
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L56
        L15:
            java.lang.Integer r0 = r2.f7584
            java.lang.Integer r1 = r3.f7584
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L56
        L20:
            java.lang.Long r0 = r2.f7585
            java.lang.Long r1 = r3.f7585
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L56
        L2b:
            java.lang.Long r0 = r2.f7586
            java.lang.Long r1 = r3.f7586
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L56
        L36:
            java.lang.Long r0 = r2.f7587
            java.lang.Long r1 = r3.f7587
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L56
        L41:
            java.lang.Long r0 = r2.f7588
            java.lang.Long r1 = r3.f7588
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L4c
            goto L56
        L4c:
            java.util.List r2 = r2.f7589
            java.util.List r3 = r3.f7589
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
        L56:
            r2 = 0
            return r2
        L58:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            java.lang.Integer r1 = r3.f7583
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Integer r2 = r3.f7584
            if (r2 != 0) goto L13
            r2 = r0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Long r2 = r3.f7585
            if (r2 != 0) goto L20
            r2 = r0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Long r2 = r3.f7586
            if (r2 != 0) goto L2d
            r2 = r0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Long r2 = r3.f7587
            if (r2 != 0) goto L3a
            r2 = r0
            goto L3e
        L3a:
            int r2 = r2.hashCode()
        L3e:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Long r2 = r3.f7588
            if (r2 != 0) goto L46
            goto L4a
        L46:
            int r0 = r2.hashCode()
        L4a:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.util.List r3 = r3.f7589
            int r3 = r3.hashCode()
            int r3 = r3 + r1
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClosenessInfo(levelNum="
            r0.<init>(r1)
            java.lang.Integer r1 = r2.f7583
            r0.append(r1)
            java.lang.String r1 = ", levelMax="
            r0.append(r1)
            java.lang.Integer r1 = r2.f7584
            r0.append(r1)
            java.lang.String r1 = ", levelCurrent="
            r0.append(r1)
            java.lang.Long r1 = r2.f7585
            r0.append(r1)
            java.lang.String r1 = ", levelDeltaCloseness="
            r0.append(r1)
            java.lang.Long r1 = r2.f7586
            r0.append(r1)
            java.lang.String r1 = ", total="
            r0.append(r1)
            java.lang.Long r1 = r2.f7587
            r0.append(r1)
            java.lang.String r1 = ", levelTarget="
            r0.append(r1)
            java.lang.Long r1 = r2.f7588
            r0.append(r1)
            java.lang.String r1 = ", behaviors="
            r0.append(r1)
            java.util.List r2 = r2.f7589
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
