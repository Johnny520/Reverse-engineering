package p000;

/* JADX INFO: renamed from: vy */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0927vy {

    /* JADX INFO: renamed from: α */
    public int f11476;

    /* JADX INFO: renamed from: β */
    public final p000.i01 f11477;

    /* JADX INFO: renamed from: γ */
    public p000.i01 f11478;

    /* JADX INFO: renamed from: δ */
    public p000.i01 f11479;

    /* JADX INFO: renamed from: ε */
    public int f11480;

    /* JADX INFO: renamed from: ζ */
    public int f11481;

    public C0927vy(p000.i01 r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f11476 = r0
            r1.f11477 = r2
            r1.f11478 = r2
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m6285() {
            r1 = this;
            r0 = 1
            r1.f11476 = r0
            i01 r0 = r1.f11477
            r1.f11478 = r0
            r0 = 0
            r1.f11481 = r0
            return
    }

    /* JADX INFO: renamed from: β */
    public final boolean m6286() {
            r4 = this;
            i01 r0 = r4.f11478
            k62 r0 = r0.f4864
            g01 r0 = r0.m3167()
            r1 = 6
            int r1 = r0.m7040(r1)
            r2 = 1
            if (r1 == 0) goto L1e
            java.lang.Object r3 = r0.f12860
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r0 = r0.f12857
            int r1 = r1 + r0
            byte r0 = r3.get(r1)
            if (r0 == 0) goto L1e
            return r2
        L1e:
            int r4 = r4.f11480
            r0 = 65039(0xfe0f, float:9.1139E-41)
            if (r4 != r0) goto L26
            return r2
        L26:
            r4 = 0
            return r4
    }
}
