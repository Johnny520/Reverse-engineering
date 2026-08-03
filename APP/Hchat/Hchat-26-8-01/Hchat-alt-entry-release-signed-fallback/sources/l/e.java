package l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w0.p f7624a;

    public e() {
            r1 = this;
            r1.<init>()
            w0.p r0 = new w0.p
            r0.<init>()
            r1.f7624a = r0
            return
    }

    public static void b(l.e r1, fg.p r2, s0.d r3, fg.a r4, int r5) {
            r5 = r5 & 8
            if (r5 == 0) goto L5
            r3 = 0
        L5:
            w0.p r5 = r1.f7624a
            c9.k0 r0 = new c9.k0
            r0.<init>(r2, r1, r3, r4)
            s0.d r1 = new s0.d
            r2 = -1789283891(0xffffffff9559b1cd, float:-4.396306E-26)
            r3 = 1
            r1.<init>(r2, r0, r3)
            r5.add(r1)
            return
    }

    public final void a(l.d r7, i0.h0 r8, int r9) {
            r6 = this;
            r0 = -798501095(0xffffffffd067d719, float:-1.5558534E10)
            r8.b0(r0)
            boolean r0 = r8.f(r7)
            if (r0 == 0) goto Le
            r0 = 4
            goto Lf
        Le:
            r0 = 2
        Lf:
            r0 = r0 | r9
            boolean r1 = r8.f(r6)
            if (r1 == 0) goto L19
            r1 = 32
            goto L1b
        L19:
            r1 = 16
        L1b:
            r0 = r0 | r1
            r1 = r0 & 19
            r2 = 18
            r3 = 0
            if (r1 == r2) goto L25
            r1 = 1
            goto L26
        L25:
            r1 = r3
        L26:
            r2 = r0 & 1
            boolean r1 = r8.S(r2, r1)
            if (r1 == 0) goto L48
            w0.p r1 = r6.f7624a
            int r2 = r1.size()
        L34:
            if (r3 >= r2) goto L4b
            java.lang.Object r4 = r1.get(r3)
            fg.q r4 = (fg.q) r4
            r5 = r0 & 14
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.b(r7, r8, r5)
            int r3 = r3 + 1
            goto L34
        L48:
            r8.V()
        L4b:
            i0.r1 r8 = r8.t()
            if (r8 == 0) goto L5a
            b0.q r0 = new b0.q
            r1 = 9
            r0.<init>(r6, r7, r9, r1)
            r8.f6035d = r0
        L5a:
            return
    }
}
