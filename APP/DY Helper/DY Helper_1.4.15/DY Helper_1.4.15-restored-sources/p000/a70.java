package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class a70 implements p000.z60 {

    /* JADX INFO: renamed from: α */
    public final int f85;

    /* JADX INFO: renamed from: β */
    public final /* synthetic */ p000.b70 f86;

    public a70(p000.b70 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f86 = r1
            r0.f85 = r2
            return
    }

    @Override // p000.z60
    /* JADX INFO: renamed from: α */
    public final boolean mo47(java.util.ArrayList r5, java.util.ArrayList r6) {
            r4 = this;
            b70 r0 = r4.f86
            n60 r1 = r0.f1540
            int r4 = r4.f85
            if (r1 == 0) goto L17
            if (r4 >= 0) goto L17
            b70 r1 = r1.m3997()
            r2 = -1
            r3 = 0
            boolean r1 = r1.m766(r2, r3)
            if (r1 == 0) goto L17
            return r3
        L17:
            r1 = 1
            boolean r4 = r0.m767(r5, r6, r4, r1)
            return r4
    }
}
