package p000;

/* JADX INFO: renamed from: e0 */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0231e0 extends p000.i91 {

    /* JADX INFO: renamed from: α */
    public final int f3356;

    public C0231e0(int r1) {
            r0 = this;
            r0.<init>()
            r0.f3356 = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.C0231e0
            if (r0 == 0) goto Le
            e0 r2 = (p000.C0231e0) r2
            int r2 = r2.f3356
            int r1 = r1.f3356
            if (r2 != r1) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.f3356
            int r0 = r0 * 31
            return r0
    }
}
