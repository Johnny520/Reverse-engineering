package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class m91 {

    /* JADX INFO: renamed from: α */
    public final p000.C0783s2 f7033;

    /* JADX INFO: renamed from: β */
    public final int f7034;

    /* JADX INFO: renamed from: γ */
    public final int f7035;

    /* JADX INFO: renamed from: δ */
    public final int f7036;

    /* JADX INFO: renamed from: ε */
    public final int f7037;

    /* JADX INFO: renamed from: ζ */
    public final float f7038;

    /* JADX INFO: renamed from: η */
    public final float f7039;

    public m91(p000.C0783s2 r1, int r2, int r3, int r4, int r5, float r6, float r7) {
            r0 = this;
            r0.<init>()
            r0.f7033 = r1
            r0.f7034 = r2
            r0.f7035 = r3
            r0.f7036 = r4
            r0.f7037 = r5
            r0.f7038 = r6
            r0.f7039 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L48
        L3:
            boolean r0 = r3 instanceof p000.m91
            if (r0 != 0) goto L8
            goto L46
        L8:
            m91 r3 = (p000.m91) r3
            s2 r0 = r2.f7033
            s2 r1 = r3.f7033
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L46
        L15:
            int r0 = r2.f7034
            int r1 = r3.f7034
            if (r0 == r1) goto L1c
            goto L46
        L1c:
            int r0 = r2.f7035
            int r1 = r3.f7035
            if (r0 == r1) goto L23
            goto L46
        L23:
            int r0 = r2.f7036
            int r1 = r3.f7036
            if (r0 == r1) goto L2a
            goto L46
        L2a:
            int r0 = r2.f7037
            int r1 = r3.f7037
            if (r0 == r1) goto L31
            goto L46
        L31:
            float r0 = r2.f7038
            float r1 = r3.f7038
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L3c
            goto L46
        L3c:
            float r2 = r2.f7039
            float r3 = r3.f7039
            int r2 = java.lang.Float.compare(r2, r3)
            if (r2 == 0) goto L48
        L46:
            r2 = 0
            return r2
        L48:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            s2 r0 = r3.f7033
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f7034
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7035
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7036
            int r0 = p000.a12.m14(r2, r0, r1)
            int r2 = r3.f7037
            int r0 = p000.a12.m14(r2, r0, r1)
            float r2 = r3.f7038
            int r0 = p000.lz1.m3676(r2, r0, r1)
            float r3 = r3.f7039
            int r3 = java.lang.Float.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParagraphInfo(paragraph="
            r0.<init>(r1)
            s2 r1 = r2.f7033
            r0.append(r1)
            java.lang.String r1 = ", startIndex="
            r0.append(r1)
            int r1 = r2.f7034
            r0.append(r1)
            java.lang.String r1 = ", endIndex="
            r0.append(r1)
            int r1 = r2.f7035
            r0.append(r1)
            java.lang.String r1 = ", startLineIndex="
            r0.append(r1)
            int r1 = r2.f7036
            r0.append(r1)
            java.lang.String r1 = ", endLineIndex="
            r0.append(r1)
            int r1 = r2.f7037
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            float r1 = r2.f7038
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            float r2 = r2.f7039
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final int m3799(int r2) {
            r1 = this;
            int r0 = r1.f7035
            int r1 = r1.f7034
            int r2 = p000.j81.m2906(r2, r1, r0)
            int r2 = r2 - r1
            return r2
    }
}
