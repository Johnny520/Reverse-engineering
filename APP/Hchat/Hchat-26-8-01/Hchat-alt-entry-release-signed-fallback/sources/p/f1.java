package p;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p.f1 f9898a = null;

    static {
            p.f1 r0 = new p.f1
            r0.<init>()
            p.f1.f9898a = r0
            return
    }

    public final y0.o a(y0.o r6, boolean r7) {
            r5 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            double r1 = (double) r0
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto La
            goto Lf
        La:
            java.lang.String r1 = "invalid weight; must be greater than zero"
            q.a.a(r1)
        Lf:
            p.q0 r1 = new p.q0
            r1.<init>(r0, r7)
            y0.o r6 = r6.d(r1)
            return r6
    }
}
