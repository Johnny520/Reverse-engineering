package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class i41 {

    /* JADX INFO: renamed from: α */
    public final java.util.List f4908;

    /* JADX INFO: renamed from: β */
    public final boolean f4909;

    /* JADX INFO: renamed from: γ */
    public final int f4910;

    /* JADX INFO: renamed from: δ */
    public final java.lang.String f4911;

    public i41(java.lang.String r1, int r2, java.util.List r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.f4908 = r3
            r0.f4909 = r4
            r0.f4910 = r2
            r0.f4911 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2f
        L3:
            boolean r0 = r3 instanceof p000.i41
            if (r0 != 0) goto L8
            goto L2d
        L8:
            i41 r3 = (p000.i41) r3
            java.util.List r0 = r2.f4908
            java.util.List r1 = r3.f4908
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L2d
        L15:
            boolean r0 = r2.f4909
            boolean r1 = r3.f4909
            if (r0 == r1) goto L1c
            goto L2d
        L1c:
            int r0 = r2.f4910
            int r1 = r3.f4910
            if (r0 == r1) goto L23
            goto L2d
        L23:
            java.lang.String r2 = r2.f4911
            java.lang.String r3 = r3.f4911
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L2f
        L2d:
            r2 = 0
            return r2
        L2f:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.util.List r0 = r3.f4908
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r3.f4909
            int r0 = p000.lz1.m3678(r0, r1, r2)
            int r2 = r3.f4910
            int r0 = p000.a12.m14(r2, r0, r1)
            java.lang.String r3 = r3.f4911
            if (r3 != 0) goto L1b
            r3 = 0
            goto L1f
        L1b:
            int r3 = r3.hashCode()
        L1f:
            int r0 = r0 + r3
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ParsedEncodeResult(outPaths="
            r0.<init>(r1)
            java.util.List r1 = r2.f4908
            r0.append(r1)
            java.lang.String r1 = ", savedToAlbum="
            r0.append(r1)
            boolean r1 = r2.f4909
            r0.append(r1)
            java.lang.String r1 = ", retCode="
            r0.append(r1)
            int r1 = r2.f4910
            r0.append(r1)
            java.lang.String r1 = ", message="
            r0.append(r1)
            java.lang.String r2 = r2.f4911
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: α */
    public final java.util.List m2613() {
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 10
            java.util.List r2 = r7.f4908
            int r1 = p000.AbstractC1021yh.m6889(r2, r1)
            r0.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L11:
            boolean r2 = r1.hasNext()
            boolean r3 = r7.f4909
            if (r2 == 0) goto L65
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            android.net.Uri r4 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L28
            java.lang.String r4 = r4.getLastPathSegment()     // Catch: java.lang.Throwable -> L28
            goto L2f
        L28:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L2f:
            boolean r5 = r4 instanceof p000.eo1
            r6 = 0
            if (r5 == 0) goto L35
            r4 = r6
        L35:
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L44
            boolean r5 = p000.q02.m4671(r4)
            if (r5 != 0) goto L40
            goto L41
        L40:
            r4 = r6
        L41:
            if (r4 == 0) goto L44
            goto L5c
        L44:
            java.io.File r4 = new java.io.File
            r4.<init>(r2)
            java.lang.String r4 = r4.getName()
            r4.getClass()
            boolean r5 = p000.q02.m4671(r4)
            if (r5 != 0) goto L57
            r6 = r4
        L57:
            if (r6 != 0) goto L5b
            r4 = r2
            goto L5c
        L5b:
            r4 = r6
        L5c:
            h41 r5 = new h41
            r5.<init>(r2, r4, r3)
            r0.add(r5)
            goto L11
        L65:
            boolean r7 = r0.isEmpty()
            if (r7 == 0) goto L7d
            h41 r7 = new h41
            if (r3 == 0) goto L72
            java.lang.String r0 = "官方动态照片"
            goto L74
        L72:
            java.lang.String r0 = "LivePhoto"
        L74:
            java.lang.String r1 = ""
            r7.<init>(r1, r0, r3)
            java.util.List r0 = p000.AbstractC1021yh.m6896(r7)
        L7d:
            return r0
    }
}
