package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class z80 {

    /* JADX INFO: renamed from: α */
    public final java.util.ArrayList f13003;

    /* JADX INFO: renamed from: β */
    public final int f13004;

    /* JADX INFO: renamed from: γ */
    public int f13005;

    /* JADX INFO: renamed from: δ */
    public final java.util.ArrayList f13006;

    /* JADX INFO: renamed from: ε */
    public final p000.n11 f13007;

    /* JADX INFO: renamed from: ζ */
    public final p000.h22 f13008;

    public z80(int r6, java.util.ArrayList r7) {
            r5 = this;
            r5.<init>()
            r5.f13003 = r7
            r5.f13004 = r6
            if (r6 < 0) goto La
            goto Lf
        La:
            java.lang.String r6 = "Invalid start index"
            p000.pi1.m4544(r6)
        Lf:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.f13006 = r6
            n11 r6 = new n11
            r6.<init>()
            int r7 = r7.size()
            r0 = 0
            r1 = r0
        L21:
            if (r0 >= r7) goto L3b
            java.util.ArrayList r2 = r5.f13003
            java.lang.Object r2 = r2.get(r0)
            yo0 r2 = (p000.yo0) r2
            int r3 = r2.f12709
            int r2 = r2.f12710
            kc0 r4 = new kc0
            r4.<init>(r0, r1, r2)
            r6.m3942(r3, r4)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L21
        L3b:
            r5.f13007 = r6
            y80 r6 = new y80
            r6.<init>(r5)
            h22 r7 = new h22
            r7.<init>(r6)
            r5.f13008 = r7
            return
    }

    /* JADX INFO: renamed from: α */
    public final boolean m7115(int r18, int r19) {
            r17 = this;
            r0 = r17
            r1 = r19
            n11 r0 = r0.f13007
            r2 = r18
            java.lang.Object r2 = r0.m5525(r2)
            kc0 r2 = (p000.kc0) r2
            r3 = 0
            if (r2 == 0) goto L6f
            int r4 = r2.f5848
            int r5 = r2.f5849
            int r5 = r1 - r5
            r2.f5849 = r1
            if (r5 == 0) goto L6d
            java.lang.Object[] r1 = r0.f9964
            long[] r0 = r0.f9962
            int r6 = r0.length
            int r6 = r6 + (-2)
            if (r6 < 0) goto L6d
            r7 = r3
        L25:
            r8 = r0[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L68
            int r10 = r7 - r6
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r3
        L3f:
            if (r12 >= r10) goto L66
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L62
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r1[r13]
            kc0 r13 = (p000.kc0) r13
            int r14 = r13.f5848
            if (r14 < r4) goto L62
            boolean r14 = r13.equals(r2)
            if (r14 != 0) goto L62
            int r14 = r13.f5848
            int r14 = r14 + r5
            if (r14 < 0) goto L62
            r13.f5848 = r14
        L62:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L3f
        L66:
            if (r10 != r11) goto L6d
        L68:
            if (r7 == r6) goto L6d
            int r7 = r7 + 1
            goto L25
        L6d:
            r0 = 1
            return r0
        L6f:
            return r3
    }
}
