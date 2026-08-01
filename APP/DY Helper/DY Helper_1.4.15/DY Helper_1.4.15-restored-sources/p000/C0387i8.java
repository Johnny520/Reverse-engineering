package p000;

/* JADX INFO: renamed from: i8 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0387i8 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f4952;

    /* JADX INFO: renamed from: β */
    public final java.lang.String f4953;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f4954;

    /* JADX INFO: renamed from: δ */
    public final java.util.List f4955;

    /* JADX INFO: renamed from: ε */
    public final java.util.List f4956;

    /* JADX INFO: renamed from: ζ */
    public final java.util.List f4957;

    public C0387i8(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.util.List r4, java.util.List r5, java.util.List r6) {
            r0 = this;
            r0.<init>()
            r0.f4952 = r1
            r0.f4953 = r2
            r0.f4954 = r3
            r0.f4955 = r4
            r0.f4956 = r5
            r0.f4957 = r6
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L4d
        L3:
            boolean r0 = r3 instanceof p000.C0387i8
            if (r0 != 0) goto L8
            goto L4b
        L8:
            i8 r3 = (p000.C0387i8) r3
            java.lang.String r0 = r2.f4952
            java.lang.String r1 = r3.f4952
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4b
        L15:
            java.lang.String r0 = r2.f4953
            java.lang.String r1 = r3.f4953
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L20
            goto L4b
        L20:
            java.lang.String r0 = r2.f4954
            java.lang.String r1 = r3.f4954
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L2b
            goto L4b
        L2b:
            java.util.List r0 = r2.f4955
            java.util.List r1 = r3.f4955
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L36
            goto L4b
        L36:
            java.util.List r0 = r2.f4956
            java.util.List r1 = r3.f4956
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L41
            goto L4b
        L41:
            java.util.List r2 = r2.f4957
            java.util.List r3 = r3.f4957
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L4d
        L4b:
            r2 = 0
            return r2
        L4d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.f4952
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            r1 = 0
            java.lang.String r2 = r3.f4953
            if (r2 != 0) goto Lf
            r2 = r1
            goto L13
        Lf:
            int r2 = r2.hashCode()
        L13:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.String r2 = r3.f4954
            if (r2 != 0) goto L1c
            r2 = r1
            goto L20
        L1c:
            int r2 = r2.hashCode()
        L20:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.List r2 = r3.f4955
            if (r2 != 0) goto L29
            r2 = r1
            goto L2d
        L29:
            int r2 = r2.hashCode()
        L2d:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.List r2 = r3.f4956
            if (r2 != 0) goto L36
            r2 = r1
            goto L3a
        L36:
            int r2 = r2.hashCode()
        L3a:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.util.List r3 = r3.f4957
            if (r3 != 0) goto L42
            goto L46
        L42:
            int r1 = r3.hashCode()
        L46:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", uri="
            java.lang.String r1 = ", playerAccessKey="
            java.lang.String r2 = "AwemeVideoSource(sourceLabel="
            java.lang.String r3 = r5.f4952
            java.lang.String r4 = r5.f4953
            java.lang.StringBuilder r0 = p000.lz1.m3695(r2, r3, r0, r4, r1)
            java.lang.String r1 = r5.f4954
            r0.append(r1)
            java.lang.String r1 = ", playUrls="
            r0.append(r1)
            java.util.List r1 = r5.f4955
            r0.append(r1)
            java.lang.String r1 = ", downloadUrls="
            r0.append(r1)
            java.util.List r1 = r5.f4956
            r0.append(r1)
            java.lang.String r1 = ", allUrls="
            r0.append(r1)
            java.util.List r5 = r5.f4957
            r0.append(r5)
            java.lang.String r5 = ")"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
