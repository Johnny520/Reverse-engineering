package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class go0 {

    /* JADX INFO: renamed from: α */
    public final java.lang.Integer f4425;

    /* JADX INFO: renamed from: β */
    public final java.lang.Object f4426;

    public go0(java.lang.Integer r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f4425 = r1
            r0.f4426 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof p000.go0
            if (r0 != 0) goto L8
            goto L1f
        L8:
            go0 r3 = (p000.go0) r3
            java.lang.Integer r0 = r2.f4425
            java.lang.Integer r1 = r3.f4425
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.Object r2 = r2.f4426
            java.lang.Object r3 = r3.f4426
            boolean r2 = p000.ln0.m3626(r2, r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            java.lang.Integer r0 = r2.f4425
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.Object r2 = r2.f4426
            boolean r1 = r2 instanceof java.lang.Enum
            if (r1 == 0) goto L15
            java.lang.Enum r2 = (java.lang.Enum) r2
            int r2 = r2.ordinal()
            goto L1d
        L15:
            if (r2 == 0) goto L1c
            int r2 = r2.hashCode()
            goto L1d
        L1c:
            r2 = 0
        L1d:
            int r2 = r2 + r0
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "JoinedKey(left="
            r0.<init>(r1)
            java.lang.Integer r1 = r2.f4425
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            java.lang.Object r2 = r2.f4426
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
