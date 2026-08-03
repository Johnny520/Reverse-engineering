package i0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f5934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f5937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f.w f5938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sf.i f5939f;

    public j0(int r6, java.util.ArrayList r7) {
            r5 = this;
            r5.<init>()
            r5.f5934a = r7
            r5.f5935b = r6
            if (r6 < 0) goto La
            goto Lf
        La:
            java.lang.String r6 = "Invalid start index"
            i0.n1.a(r6)
        Lf:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.f5937d = r6
            f.w r6 = new f.w
            r6.<init>()
            int r7 = r7.size()
            r0 = 0
            r1 = r0
        L21:
            if (r0 >= r7) goto L3b
            java.util.ArrayList r2 = r5.f5934a
            java.lang.Object r2 = r2.get(r0)
            l0.e r2 = (l0.e) r2
            int r3 = r2.f7662c
            int r2 = r2.f7663d
            k0.a r4 = new k0.a
            r4.<init>(r0, r1, r2)
            r6.h(r3, r4)
            int r1 = r1 + r2
            int r0 = r0 + 1
            goto L21
        L3b:
            r5.f5938e = r6
            sh.k r6 = new sh.k
            r7 = 12
            r6.<init>(r5, r7)
            sf.i r7 = new sf.i
            r7.<init>(r6)
            r5.f5939f = r7
            return
    }

    public final boolean a(int r19, int r20) {
            r18 = this;
            r0 = r18
            r1 = r20
            f.w r2 = r0.f5938e
            r3 = r19
            java.lang.Object r3 = r2.b(r3)
            k0.a r3 = (k0.a) r3
            r4 = 0
            if (r3 == 0) goto L6f
            int r5 = r3.f7124b
            int r6 = r3.f7125c
            int r6 = r1 - r6
            r3.f7125c = r1
            if (r6 == 0) goto L6d
            java.lang.Object[] r1 = r2.f2845c
            long[] r2 = r2.f2843a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L6d
            r8 = r4
        L25:
            r9 = r2[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L68
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            r12 = 8
            int r11 = 8 - r11
            r13 = r4
        L3f:
            if (r13 >= r11) goto L66
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r9
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L62
            int r14 = r8 << 3
            int r14 = r14 + r13
            r14 = r1[r14]
            k0.a r14 = (k0.a) r14
            int r15 = r14.f7124b
            if (r15 < r5) goto L62
            boolean r15 = r14.equals(r3)
            if (r15 != 0) goto L62
            int r15 = r14.f7124b
            int r15 = r15 + r6
            if (r15 < 0) goto L62
            r14.f7124b = r15
        L62:
            long r9 = r9 >> r12
            int r13 = r13 + 1
            goto L3f
        L66:
            if (r11 != r12) goto L6d
        L68:
            if (r8 == r7) goto L6d
            int r8 = r8 + 1
            goto L25
        L6d:
            r1 = 1
            return r1
        L6f:
            return r4
    }
}
