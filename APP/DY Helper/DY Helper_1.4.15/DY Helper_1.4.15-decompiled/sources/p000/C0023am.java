package p000;

/* JADX INFO: renamed from: am */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0023am {

    /* JADX INFO: renamed from: α */
    public final int f324;

    /* JADX INFO: renamed from: β */
    public final java.util.List f325;

    public C0023am(int r1, java.util.List r2) {
            r0 = this;
            r0.<init>()
            r0.f324 = r1
            r0.f325 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1d
        L3:
            boolean r0 = r3 instanceof p000.C0023am
            if (r0 != 0) goto L8
            goto L1b
        L8:
            am r3 = (p000.C0023am) r3
            int r0 = r2.f324
            int r1 = r3.f324
            if (r0 == r1) goto L11
            goto L1b
        L11:
            java.util.List r2 = r2.f325
            java.util.List r3 = r3.f325
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1d
        L1b:
            r2 = 0
            return r2
        L1d:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f324
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            java.util.List r1 = r1.f325
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ChannelContainer(key="
            r0.<init>(r1)
            int r1 = r2.f324
            r0.append(r1)
            java.lang.String r1 = ", channels="
            r0.append(r1)
            java.util.List r2 = r2.f325
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
