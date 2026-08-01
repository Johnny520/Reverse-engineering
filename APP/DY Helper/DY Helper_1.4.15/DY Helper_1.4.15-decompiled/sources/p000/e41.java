package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class e41 extends p000.g41 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f3405;

    public e41(java.lang.String r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f3405 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.e41
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            e41 r4 = (p000.e41) r4
            java.lang.String r3 = r3.f3405
            java.lang.String r4 = r4.f3405
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f3405
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "Failure(reason="
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.f3405
            java.lang.String r2 = p000.lz1.m3674(r0, r2, r1)
            return r2
    }
}
