package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class nh1 {

    /* JADX INFO: renamed from: α */
    public final p000.kh1 f7627;

    public nh1(p000.kh1 r1) {
            r0 = this;
            r0.<init>()
            r0.f7627 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.nh1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            nh1 r4 = (p000.nh1) r4
            kh1 r4 = r4.f7627
            kh1 r3 = r3.f7627
            boolean r3 = p000.ln0.m3626(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            kh1 r0 = r0.f7627
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PlatformTextStyle(spanStyle=null, paragraphSyle="
            r0.<init>(r1)
            kh1 r2 = r2.f7627
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
