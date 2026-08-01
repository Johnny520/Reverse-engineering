package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class k51 extends p000.o61 {

    /* JADX INFO: renamed from: γ */
    public static final p000.k51 f5759 = null;

    static {
            k51 r0 = new k51
            r1 = 2
            r2 = 1
            r3 = 0
            r0.<init>(r3, r1, r2)
            p000.k51.f5759 = r0
            return
    }

    @Override // p000.o61
    /* JADX INFO: renamed from: α */
    public final void mo45(p000.f81 r3, p000.InterfaceC0676p6 r4, p000.rw1 r5, p000.en1 r6, p000.r71 r7) {
            r2 = this;
            r2 = 0
            java.lang.Object r2 = r3.m2056(r2)
            q80 r2 = (p000.q80) r2
            r4 = 1
            java.lang.Object r3 = r3.m2056(r4)
            boolean r7 = r3 instanceof p000.a90
            if (r7 == 0) goto L1d
            r7 = r3
            a90 r7 = (p000.a90) r7
            k21 r0 = r6.f3607
            r0.m3127(r7)
            c21 r6 = r6.f3606
            r6.m1107(r7)
        L1d:
            int r6 = r5.f9551
            if (r6 != 0) goto L22
            goto L27
        L22:
            java.lang.String r6 = "Can only append a slot if not current inserting"
            p000.AbstractC0804sn.m5526(r6)
        L27:
            int r6 = r5.f9546
            int r7 = r5.f9547
            int r2 = r5.m5153(r2)
            int[] r0 = r5.f9539
            int r1 = r2 + 1
            int r1 = r5.m5167(r1)
            int r0 = r5.m5157(r1, r0)
            r5.f9546 = r0
            r5.f9547 = r0
            r5.m5173(r4, r2)
            if (r6 < r0) goto L48
            int r6 = r6 + 1
            int r7 = r7 + 1
        L48:
            java.lang.Object[] r2 = r5.f9540
            r2[r0] = r3
            r5.f9546 = r6
            r5.f9547 = r7
            return
    }
}
