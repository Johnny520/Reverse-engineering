package g2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.w f4172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g2.d f4173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f4178g;

    public e() {
            r2 = this;
            r2.<init>()
            f.w r0 = f.l.f2854a
            f.w r0 = new f.w
            r0.<init>()
            r2.f4172a = r0
            r0 = -1
            r2.f4174c = r0
            r0 = 0
            r2.f4175d = r0
            r2.f4176e = r0
            return
    }

    public final void a(g2.d r11, long r12, long r14, float[] r16, long r17) {
            r10 = this;
            r1 = r17
            long r3 = r11.f4170g
            long r5 = r1 - r3
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 > 0) goto L15
            r5 = -9223372036854775808
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L13
            goto L15
        L13:
            r3 = 0
            goto L16
        L15:
            r3 = 1
        L16:
            if (r3 == 0) goto L26
            r11.f4170g = r1
            long r1 = r11.f4168e
            long r3 = r11.f4169f
            r0 = r11
            r5 = r12
            r7 = r14
            r9 = r16
            r0.a(r1, r3, r5, r7, r9)
        L26:
            return
    }

    public final boolean b(long r5, long r7, float[] r9, int r10, int r11) {
            r4 = this;
            long r0 = r4.f4175d
            boolean r0 = u2.j.b(r7, r0)
            r1 = 1
            if (r0 != 0) goto Ld
            r4.f4175d = r7
            r7 = r1
            goto Le
        Ld:
            r7 = 0
        Le:
            long r2 = r4.f4176e
            boolean r8 = u2.j.b(r5, r2)
            if (r8 != 0) goto L19
            r4.f4176e = r5
            r7 = r1
        L19:
            if (r9 == 0) goto L1e
            r4.f4178g = r9
            r7 = r1
        L1e:
            long r5 = (long) r10
            r8 = 32
            long r5 = r5 << r8
            long r8 = (long) r11
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r5 = r5 | r8
            long r8 = r4.f4177f
            int r8 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r8 == 0) goto L33
            r4.f4177f = r5
            return r1
        L33:
            return r7
    }
}
