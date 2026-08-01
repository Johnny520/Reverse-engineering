package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class p02 implements p000.InterfaceC0235e4 {

    /* JADX INFO: renamed from: α */
    public final java.lang.String f8379;

    public /* synthetic */ p02(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.f8379 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.p02
            if (r0 != 0) goto L5
            goto L11
        L5:
            p02 r2 = (p000.p02) r2
            java.lang.String r2 = r2.f8379
            java.lang.String r1 = r1.f8379
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L13
        L11:
            r1 = 0
            return r1
        L13:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.f8379
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StringAnnotation(value="
            r0.<init>(r1)
            java.lang.String r2 = r2.f8379
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
