package v1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13901h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f13902i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f13903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f13904k;

    public b1() {
            r6 = this;
            r6.<init>()
            r0 = 0
            long r0 = (long) r0
            r2 = 32
            long r2 = r0 << r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            r6.f13902i = r0
            long r0 = v1.d1.f13921a
            r6.f13903j = r0
            r0 = 0
            r6.f13904k = r0
            return
    }

    public abstract void A0(long r1, float r3, fg.l r4);

    public void B0(long r1, float r3, i1.b r4) {
            r0 = this;
            r4 = 0
            r0.A0(r1, r3, r4)
            return
    }

    public final void C0(long r3) {
            r2 = this;
            long r0 = r2.f13902i
            boolean r0 = u2.l.a(r0, r3)
            if (r0 != 0) goto Ld
            r2.f13902i = r3
            r2.y0()
        Ld:
            return
    }

    public final void E0(long r3) {
            r2 = this;
            long r0 = r2.f13903j
            boolean r0 = u2.a.b(r0, r3)
            if (r0 != 0) goto Ld
            r2.f13903j = r3
            r2.y0()
        Ld:
            return
    }

    public java.lang.Object X() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int r0() {
            r4 = this;
            long r0 = r4.f13902i
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            return r0
    }

    public int w0() {
            r3 = this;
            long r0 = r3.f13902i
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            return r0
    }

    public final void y0() {
            r9 = this;
            long r0 = r9.f13902i
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            long r3 = r9.f13903j
            int r1 = u2.a.j(r3)
            long r3 = r9.f13903j
            int r3 = u2.a.h(r3)
            int r0 = r9.e0.r(r0, r1, r3)
            r9.f13900g = r0
            long r0 = r9.f13902i
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            long r5 = r9.f13903j
            int r1 = u2.a.i(r5)
            long r5 = r9.f13903j
            int r5 = u2.a.g(r5)
            int r0 = r9.e0.r(r0, r1, r5)
            r9.f13901h = r0
            int r1 = r9.f13900g
            long r5 = r9.f13902i
            long r7 = r5 >> r2
            int r7 = (int) r7
            int r1 = r1 - r7
            int r1 = r1 / 2
            long r5 = r5 & r3
            int r5 = (int) r5
            int r0 = r0 - r5
            int r0 = r0 / 2
            long r5 = (long) r1
            long r1 = r5 << r2
            long r5 = (long) r0
            long r3 = r3 & r5
            long r0 = r1 | r3
            r9.f13904k = r0
            return
    }
}
