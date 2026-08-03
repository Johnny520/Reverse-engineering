package sf;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements java.lang.Comparable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte f12431g;

    public /* synthetic */ l(byte r1) {
            r0 = this;
            r0.<init>()
            r0.f12431g = r1
            return
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(java.lang.Object r2) {
            r1 = this;
            sf.l r2 = (sf.l) r2
            byte r2 = r2.f12431g
            byte r0 = r1.f12431g
            r0 = r0 & 255(0xff, float:3.57E-43)
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = gg.l.c(r0, r2)
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof sf.l
            if (r0 != 0) goto L5
            goto Ld
        L5:
            sf.l r2 = (sf.l) r2
            byte r2 = r2.f12431g
            byte r0 = r1.f12431g
            if (r0 == r2) goto Lf
        Ld:
            r2 = 0
            return r2
        Lf:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            byte r0 = r1.f12431g
            int r0 = java.lang.Byte.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            byte r0 = r1.f12431g
            r0 = r0 & 255(0xff, float:3.57E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}
