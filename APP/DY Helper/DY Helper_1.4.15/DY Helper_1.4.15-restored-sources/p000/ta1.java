package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ta1 {

    /* JADX INFO: renamed from: α */
    public final p000.ze1 f10264;

    /* JADX INFO: renamed from: β */
    public final p000.ua1 f10265;

    /* JADX INFO: renamed from: γ */
    public final java.lang.String f10266;

    public ta1(p000.ze1 r1, p000.ua1 r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.f10264 = r1
            r0.f10265 = r2
            r0.f10266 = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L28
        L3:
            boolean r0 = r3 instanceof p000.ta1
            if (r0 != 0) goto L8
            goto L26
        L8:
            ta1 r3 = (p000.ta1) r3
            ze1 r0 = r2.f10264
            ze1 r1 = r3.f10264
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 != 0) goto L15
            goto L26
        L15:
            ua1 r0 = r2.f10265
            ua1 r1 = r3.f10265
            if (r0 == r1) goto L1c
            goto L26
        L1c:
            java.lang.String r2 = r2.f10266
            java.lang.String r3 = r3.f10266
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L28
        L26:
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            ze1 r1 = r3.f10264
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            ua1 r2 = r3.f10265
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r3 = r3.f10266
            int r3 = r3.hashCode()
            int r3 = r3 + r1
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decision(food="
            r0.<init>(r1)
            ze1 r1 = r2.f10264
            r0.append(r1)
            java.lang.String r1 = ", skipReason="
            r0.append(r1)
            ua1 r1 = r2.f10265
            r0.append(r1)
            java.lang.String r1 = ", detail="
            r0.append(r1)
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f10266
            java.lang.String r2 = p000.lz1.m3691(r0, r2, r1)
            return r2
    }
}
