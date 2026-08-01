package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class c62 extends p000.a62 {

    /* JADX INFO: renamed from: θ */
    public final p000.ka1 f1970;

    public c62(p000.ka1 r1) {
            r0 = this;
            r0.<init>()
            r0.f1970 = r1
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            int r0 = r4.f80
            int r1 = r0 + 2
            r4.f80 = r1
            t11 r1 = new t11
            java.lang.Object[] r2 = r4.f78
            r3 = r2[r0]
            int r0 = r0 + 1
            r0 = r2[r0]
            ka1 r4 = r4.f1970
            r1.<init>(r4, r3, r0)
            return r1
    }
}
