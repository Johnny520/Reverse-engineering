package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class b62 extends p000.a62 {

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ int f1501;

    public /* synthetic */ b62(int r1) {
            r0 = this;
            r0.f1501 = r1
            r0.<init>()
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f1501
            switch(r0) {
                case 0: goto L1d;
                case 1: goto L12;
                default: goto L5;
            }
        L5:
            int r0 = r3.f80
            int r1 = r0 + 2
            r3.f80 = r1
            java.lang.Object[] r3 = r3.f78
            int r0 = r0 + 1
            r3 = r3[r0]
            return r3
        L12:
            int r0 = r3.f80
            int r1 = r0 + 2
            r3.f80 = r1
            java.lang.Object[] r3 = r3.f78
            r3 = r3[r0]
            return r3
        L1d:
            int r0 = r3.f80
            int r1 = r0 + 2
            r3.f80 = r1
            cx0 r1 = new cx0
            java.lang.Object[] r3 = r3.f78
            r2 = r3[r0]
            int r0 = r0 + 1
            r3 = r3[r0]
            r0 = 0
            r1.<init>(r2, r0, r3)
            return r1
    }
}
