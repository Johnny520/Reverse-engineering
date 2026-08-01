package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class cs1 {

    /* JADX INFO: renamed from: α */
    public final p000.xr1 f2737;

    /* JADX INFO: renamed from: β */
    public final p000.o11 f2738;

    public cs1(p000.bs1 r5, p000.sm0 r6) {
            r4 = this;
            r4.<init>()
            xr1 r0 = r5.f1824
            r4.f2737 = r0
            r0 = 4
            java.util.List r5 = p000.bs1.m1005(r0, r5)
            o11 r0 = new o11
            int r1 = r5.size()
            r0.<init>(r1)
            r4.f2738 = r0
            int r0 = r5.size()
            r1 = 0
        L1c:
            if (r1 >= r0) goto L36
            java.lang.Object r2 = r5.get(r1)
            bs1 r2 = (p000.bs1) r2
            int r3 = r2.f1826
            boolean r3 = r6.m5524(r3)
            if (r3 == 0) goto L33
            o11 r3 = r4.f2738
            int r2 = r2.f1826
            r3.m4151(r2)
        L33:
            int r1 = r1 + 1
            goto L1c
        L36:
            return
    }
}
