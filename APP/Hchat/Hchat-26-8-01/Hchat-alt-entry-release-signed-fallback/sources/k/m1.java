package k;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0.u f7016a = null;

    static {
            i2.z r0 = new i2.z
            r1 = 16
            r0.<init>(r1)
            i0.u r1 = new i0.u
            r1.<init>(r0)
            k.m1.f7016a = r1
            return
    }

    public static final k.k1 a(i0.h0 r4) {
            r0 = 282942128(0x10dd5ab0, float:8.7308856E-29)
            r4.a0(r0)
            i0.u r0 = k.m1.f7016a
            java.lang.Object r0 = r4.j(r0)
            k.l1 r0 = (k.l1) r0
            r1 = 0
            if (r0 != 0) goto L16
            r4.p(r1)
            r4 = 0
            return r4
        L16:
            boolean r2 = r4.f(r0)
            java.lang.Object r3 = r4.P()
            if (r2 != 0) goto L24
            i0.e r2 = i0.l.f5952a
            if (r3 != r2) goto L2b
        L24:
            k.k1 r3 = r0.a()
            r4.k0(r3)
        L2b:
            k.k1 r3 = (k.k1) r3
            r4.p(r1)
            return r3
    }
}
