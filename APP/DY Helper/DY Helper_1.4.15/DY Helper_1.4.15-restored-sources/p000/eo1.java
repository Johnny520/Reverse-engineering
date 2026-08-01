package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class eo1 implements java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Throwable f3622;

    public eo1(java.lang.Throwable r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f3622 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.eo1
            if (r0 == 0) goto L12
            eo1 r2 = (p000.eo1) r2
            java.lang.Throwable r2 = r2.f3622
            java.lang.Throwable r1 = r1.f3622
            boolean r1 = p000.ln0.m3626(r1, r2)
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.Throwable r0 = r0.f3622
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failure("
            r0.<init>(r1)
            java.lang.Throwable r2 = r2.f3622
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
