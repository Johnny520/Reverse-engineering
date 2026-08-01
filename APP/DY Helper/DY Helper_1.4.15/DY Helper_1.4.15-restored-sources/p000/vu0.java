package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class vu0 extends p000.m92 {

    /* JADX INFO: renamed from: γ */
    public static final p000.d70 f11406 = null;

    /* JADX INFO: renamed from: β */
    public final p000.kz1 f11407;

    static {
            d70 r0 = new d70
            r1 = 1
            r0.<init>(r1)
            p000.vu0.f11406 = r0
            return
    }

    public vu0() {
            r2 = this;
            r2.<init>()
            kz1 r0 = new kz1
            r1 = 0
            r0.<init>(r1)
            r2.f11407 = r0
            return
    }

    @Override // p000.m92
    /* JADX INFO: renamed from: β */
    public final void mo1853() {
            r5 = this;
            kz1 r5 = r5.f11407
            int r0 = r5.f6335
            r1 = 0
            if (r0 > 0) goto L15
            java.lang.Object[] r2 = r5.f6334
            r3 = r1
        La:
            if (r3 >= r0) goto L12
            r4 = 0
            r2[r3] = r4
            int r3 = r3 + 1
            goto La
        L12:
            r5.f6335 = r1
            return
        L15:
            java.lang.Object r5 = r5.m3430(r1)
            r5.getClass()
            p000.C1080.m7264()
            return
    }
}
