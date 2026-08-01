package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class j61 extends p000.o61 {

    /* JADX INFO: renamed from: γ */
    public static final p000.j61 f5342 = null;

    static {
            j61 r0 = new j61
            r1 = 0
            r2 = 2
            r3 = 1
            r0.<init>(r3, r1, r2)
            p000.j61.f5342 = r0
            return
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: α */
    public final void mo45(p000.f81 r2, p000.InterfaceC0676p6 r3, p000.rw1 r4, p000.en1 r5, p000.r71 r6) {
            r1 = this;
            r1 = 0
            int r1 = r2.m2055(r1)
            int r2 = r4.f9559
            int[] r3 = r4.f9539
            int r6 = r4.m5167(r2)
            int r3 = r4.m5143(r6, r3)
            int[] r6 = r4.f9539
            int r2 = r2 + 1
            int r2 = r4.m5167(r2)
            int r2 = r4.m5157(r2, r6)
            int r6 = r2 - r1
            int r3 = java.lang.Math.max(r3, r6)
        L23:
            if (r3 >= r2) goto L43
            java.lang.Object[] r6 = r4.f9540
            int r0 = r4.m5158(r3)
            r6 = r6[r0]
            boolean r0 = r6 instanceof p000.a90
            if (r0 == 0) goto L37
            a90 r6 = (p000.a90) r6
            r5.m1940(r6)
            goto L40
        L37:
            boolean r0 = r6 instanceof p000.bl1
            if (r0 == 0) goto L40
            bl1 r6 = (p000.bl1) r6
            r6.m980()
        L40:
            int r3 = r3 + 1
            goto L23
        L43:
            java.lang.String r2 = "Check failed"
            if (r1 <= 0) goto L48
            goto L4b
        L48:
            p000.AbstractC0804sn.m5526(r2)
        L4b:
            int r3 = r4.f9559
            int[] r5 = r4.f9539
            int r6 = r4.m5167(r3)
            int r5 = r4.m5143(r6, r5)
            int[] r6 = r4.f9539
            int r0 = r3 + 1
            int r0 = r4.m5167(r0)
            int r6 = r4.m5157(r0, r6)
            int r6 = r6 - r1
            if (r6 < r5) goto L67
            goto L6a
        L67:
            p000.AbstractC0804sn.m5526(r2)
        L6a:
            r4.m5139(r6, r1, r3)
            int r2 = r4.f9546
            if (r2 < r5) goto L74
            int r2 = r2 - r1
            r4.f9546 = r2
        L74:
            return
    }
}
