package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class f41 extends p000.g41 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f3749;

    public f41(java.util.ArrayList r1) {
            r0 = this;
            r0.<init>()
            r0.f3749 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof p000.f41
            if (r0 != 0) goto L8
            goto L14
        L8:
            f41 r2 = (p000.f41) r2
            java.util.ArrayList r1 = r1.f3749
            java.util.ArrayList r2 = r2.f3749
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.util.ArrayList r0 = r0.f3749
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Success(saved="
            r0.<init>(r1)
            java.util.ArrayList r2 = r2.f3749
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
