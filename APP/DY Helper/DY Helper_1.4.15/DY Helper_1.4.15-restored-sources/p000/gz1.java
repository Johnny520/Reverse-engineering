package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class gz1 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f4508;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4509;

    /* JADX INFO: renamed from: γ */
    public final p000.my1 f4510;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f4511;

    /* JADX INFO: renamed from: ε */
    public final p000.C0757rd f4512;

    /* JADX INFO: renamed from: ζ */
    public final boolean f4513;

    /* JADX INFO: renamed from: η */
    public final java.util.List f4514;

    public gz1(java.lang.String r1, java.lang.String r2, p000.my1 r3, java.lang.String r4, p000.C0757rd r5, boolean r6, java.util.List r7) {
            r0 = this;
            r4.getClass()
            r0.<init>()
            r0.f4508 = r1
            r0.f4509 = r2
            r0.f4510 = r3
            r0.f4511 = r4
            r0.f4512 = r5
            r0.f4513 = r6
            r0.f4514 = r7
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L54
        L3:
            boolean r0 = r3 instanceof p000.gz1
            if (r0 != 0) goto L8
            goto L52
        L8:
            gz1 r3 = (p000.gz1) r3
            java.lang.String r0 = r2.f4508
            java.lang.String r1 = r3.f4508
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L52
        L15:
            java.lang.String r0 = r2.f4509
            java.lang.String r1 = r3.f4509
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L52
        L20:
            my1 r0 = r2.f4510
            my1 r1 = r3.f4510
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L2b
            goto L52
        L2b:
            java.lang.String r0 = r2.f4511
            java.lang.String r1 = r3.f4511
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L52
        L36:
            rd r0 = r2.f4512
            rd r1 = r3.f4512
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            goto L52
        L41:
            boolean r0 = r2.f4513
            boolean r1 = r3.f4513
            if (r0 == r1) goto L48
            goto L52
        L48:
            java.util.List r2 = r2.f4514
            java.util.List r3 = r3.f4514
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L54
        L52:
            r2 = 0
            return r2
        L54:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4508
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.f4509
            int r0 = p000.a12.m15(r0, r1, r2)
            my1 r2 = r3.f4510
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r3.f4511
            int r0 = p000.a12.m15(r2, r1, r0)
            rd r2 = r3.f4512
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            boolean r0 = r3.f4513
            int r0 = p000.lz1.m3678(r2, r1, r0)
            java.util.List r3 = r3.f4514
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", messageConfig="
            java.lang.String r2 = "SparkListGroup(id="
            java.lang.String r3 = r5.f4508
            java.lang.String r4 = r5.f4509
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            my1 r1 = r5.f4510
            r0.append(r1)
            java.lang.String r1 = ", renewMode="
            r0.append(r1)
            java.lang.String r1 = r5.f4511
            r0.append(r1)
            java.lang.String r1 = ", campRule="
            r0.append(r1)
            rd r1 = r5.f4512
            r0.append(r1)
            java.lang.String r1 = ", fixedLast="
            r0.append(r1)
            boolean r1 = r5.f4513
            r0.append(r1)
            java.lang.String r1 = ", members="
            r0.append(r1)
            java.util.List r5 = r5.f4514
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
