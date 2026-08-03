package l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0.d f7617a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s0.d f7618b = null;

    static {
            l.a r0 = new l.a
            r0.<init>()
            s0.d r1 = new s0.d
            r2 = -1571120048(0xffffffffa25a9c50, float:-2.962726E-18)
            r3 = 0
            r1.<init>(r2, r0, r3)
            l.c.f7617a = r1
            l.b r0 = new l.b
            r1 = 0
            r0.<init>(r1)
            s0.d r1 = new s0.d
            r2 = -1455401925(0xffffffffa940543b, float:-4.2705622E-14)
            r1.<init>(r2, r0, r3)
            l.c.f7618b = r1
            return
    }

    public static final int a(int r2, int r3, int r4, boolean r5) {
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
    }
}
