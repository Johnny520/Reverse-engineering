package r;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ac.k f11166a;

    public h(fg.l r4) {
            r3 = this;
            r3.<init>()
            ac.k r0 = new ac.k
            r1 = 9
            r2 = 0
            r0.<init>(r2, r1)
            r3.f11166a = r0
            r4.invoke(r3)
            return
    }

    public static void a(r.h r4, java.lang.Object r5, fg.q r6, int r7) {
            r0 = 1
            r7 = r7 & r0
            r1 = 0
            if (r7 == 0) goto L6
            r5 = r1
        L6:
            ac.k r4 = r4.f11166a
            b5.c r7 = new b5.c
            if (r5 == 0) goto L13
            c9.k1 r1 = new c9.k1
            r2 = 22
            r1.<init>(r5, r2)
        L13:
            o9.e r5 = new o9.e
            r2 = 26
            r5.<init>(r2)
            q2.c r2 = new q2.c
            r3 = 1
            r2.<init>(r6, r3)
            s0.d r6 = new s0.d
            r3 = -857469575(0xffffffffcce40d79, float:-1.19565256E8)
            r6.<init>(r3, r2, r0)
            r7.<init>(r1, r5, r6)
            r4.b(r0, r7)
            return
    }
}
