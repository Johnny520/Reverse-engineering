package p000;

/* JADX INFO: renamed from: h2 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0344h2 implements p000.mh1 {

    /* JADX INFO: renamed from: ε */
    public final int f4534;

    public C0344h2(int r1) {
            r0 = this;
            r0.<init>()
            r0.f4534 = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.C0344h2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h2 r4 = (p000.C0344h2) r4
            int r3 = r3.f4534
            int r4 = r4.f4534
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.f4534
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AndroidFontResolveInterceptor(fontWeightAdjustment="
            r0.<init>(r1)
            int r2 = r2.f4534
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
