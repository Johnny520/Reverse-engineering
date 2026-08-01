package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l91 implements java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f6502;

    /* JADX INFO: renamed from: ζ */
    public final java.lang.Object f6503;

    public l91(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.f6502 = r1
            r0.f6503 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public static java.lang.Object m3540() {
            r0 = 0
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.l91
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            l91 r5 = (p000.l91) r5
            java.lang.Object r1 = r4.f6502
            java.lang.Object r3 = r5.f6502
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            java.lang.Object r4 = r4.f6503
            java.lang.Object r5 = r5.f6503
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.f6502
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            java.lang.Object r2 = r2.f6503
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r0 = r2.hashCode()
        L16:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.Object r1 = r2.f6502
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.Object r2 = r2.f6503
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
