package pe;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ud.r f10546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ud.a f10547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd.s[] f10548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f10549d;

    public b(ud.r r1, ud.a r2, qd.s[] r3, int[] r4) {
            r0 = this;
            r0.<init>()
            r0.f10546a = r1
            r0.f10547b = r2
            r0.f10548c = r3
            r0.f10549d = r4
            return
    }

    public final qd.s a(qd.r r5) {
            r4 = this;
            int r0 = r5.f10922l
            int[] r1 = r4.f10549d
            r2 = r1[r0]
            int r3 = r2 + 1
            r1[r0] = r3
            ud.r r1 = r4.f10546a
            r1.getClass()
            qd.s r3 = new qd.s
            r3.<init>(r0, r2, r5)
            java.util.List r5 = r1.D
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L23
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r1.D = r5
        L23:
            java.util.List r5 = r1.D
            r5.add(r3)
            qd.s[] r5 = r4.f10548c
            r5[r0] = r3
            return r3
    }
}
