package t0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements t0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f12975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f.k0 f12977d;

    public c() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f12974a = r0
            f.k0 r0 = new f.k0
            r0.<init>()
            r1.f12977d = r0
            return
    }

    public final void a() {
            r15 = this;
            f.k0 r0 = r15.f12977d
            java.lang.Object[] r1 = r0.f2850c
            long[] r2 = r0.f2848a
            int r3 = r2.length
            int r3 = r3 + (-2)
            if (r3 < 0) goto L54
            r4 = 0
            r5 = r4
        Ld:
            r6 = r2[r5]
            long r8 = ~r6
            r10 = 7
            long r8 = r8 << r10
            long r8 = r8 & r6
            r10 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r8 = r8 & r10
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 == 0) goto L4f
            int r8 = r5 - r3
            int r8 = ~r8
            int r8 = r8 >>> 31
            r9 = 8
            int r8 = 8 - r8
            r10 = r4
        L27:
            if (r10 >= r8) goto L4d
            r11 = 255(0xff, double:1.26E-321)
            long r11 = r11 & r6
            r13 = 128(0x80, double:6.3E-322)
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 >= 0) goto L49
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r1[r11]
            boolean r12 = r11 instanceof f.f0
            if (r12 == 0) goto L49
            f.f0 r11 = (f.f0) r11
            java.lang.Object[] r12 = r11.f2803a
            int r11 = r11.f2804b
            r13 = r4
        L42:
            if (r13 >= r11) goto L49
            r14 = r12[r13]
            int r13 = r13 + 1
            goto L42
        L49:
            long r6 = r6 >> r9
            int r10 = r10 + 1
            goto L27
        L4d:
            if (r8 != r9) goto L54
        L4f:
            if (r5 == r3) goto L54
            int r5 = r5 + 1
            goto Ld
        L54:
            r0.a()
            return
    }
}
