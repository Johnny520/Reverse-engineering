package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class dn1 extends p000.i91 {

    /* JADX INFO: renamed from: α */
    public final p000.i91 f3224;

    /* JADX INFO: renamed from: β */
    public final int f3225;

    public dn1(p000.i91 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f3224 = r1
            r0.f3225 = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof p000.dn1
            if (r0 == 0) goto L18
            dn1 r3 = (p000.dn1) r3
            i91 r0 = r3.f3224
            i91 r1 = r2.f3224
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L18
            int r3 = r3.f3225
            int r2 = r2.f3225
            if (r3 != r2) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f3225
            int r0 = r0 * 31
            i91 r1 = r1.f3224
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }
}
