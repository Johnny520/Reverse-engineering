package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class a11 {

    /* JADX INFO: renamed from: α */
    public final long f44;

    public /* synthetic */ a11(long r1) {
            r0 = this;
            r0.<init>()
            r0.f44 = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.a11
            if (r0 != 0) goto L5
            goto Lf
        L5:
            a11 r3 = (p000.a11) r3
            long r0 = r3.f44
            long r2 = r2.f44
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            long r0 = r2.f44
            int r2 = java.lang.Long.hashCode(r0)
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "IndirectPointerEventData(packedValue="
            r0.<init>(r1)
            long r1 = r3.f44
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
