package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class fo1 implements java.io.Serializable {

    /* JADX INFO: renamed from: ε */
    public final java.lang.Object f4054;

    public /* synthetic */ fo1(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.f4054 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public static final java.lang.Throwable m2190(java.lang.Object r1) {
            boolean r0 = r1 instanceof p000.eo1
            if (r0 == 0) goto L9
            eo1 r1 = (p000.eo1) r1
            java.lang.Throwable r1 = r1.f3622
            return r1
        L9:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.String m2191(java.lang.Object r2) {
            boolean r0 = r2 instanceof p000.eo1
            if (r0 == 0) goto Lb
            eo1 r2 = (p000.eo1) r2
            java.lang.String r2 = r2.toString()
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Success("
            r0.<init>(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.fo1
            if (r0 != 0) goto L5
            goto L11
        L5:
            fo1 r2 = (p000.fo1) r2
            java.lang.Object r2 = r2.f4054
            java.lang.Object r1 = r1.f4054
            boolean r1 = p000.ln0.m3626(r1, r2)
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
            java.lang.Object r0 = r0.f4054
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r0 = this;
            java.lang.Object r0 = r0.f4054
            java.lang.String r0 = m2191(r0)
            return r0
    }
}
