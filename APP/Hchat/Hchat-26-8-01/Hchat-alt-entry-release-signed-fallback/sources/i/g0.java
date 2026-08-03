package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0.b f5662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0.j1 f5663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0.j1 f5665d;

    public g0() {
            r2 = this;
            r2.<init>()
            j0.b r0 = new j0.b
            r1 = 16
            i.d0[] r1 = new i.d0[r1]
            r0.<init>(r1)
            r2.f5662a = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            i0.j1 r0 = i0.r.u(r0)
            r2.f5663b = r0
            r0 = -9223372036854775808
            r2.f5664c = r0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            i0.j1 r0 = i0.r.u(r0)
            r2.f5665d = r0
            return
    }

    public final void a(i0.h0 r7, int r8) {
            r6 = this;
            r0 = -318043801(0xffffffffed0b0967, float:-2.6893614E27)
            r7.b0(r0)
            boolean r0 = r7.h(r6)
            r1 = 2
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = r1
        L10:
            r0 = r0 | r8
            r2 = r0 & 3
            r3 = 1
            r4 = 0
            if (r2 == r1) goto L19
            r1 = r3
            goto L1a
        L19:
            r1 = r4
        L1a:
            r0 = r0 & r3
            boolean r0 = r7.S(r0, r1)
            if (r0 == 0) goto L7d
            java.lang.Object r0 = r7.P()
            r1 = 0
            i0.e r2 = i0.l.f5952a
            if (r0 != r2) goto L31
            i0.j1 r0 = i0.r.u(r1)
            r7.k0(r0)
        L31:
            i0.a1 r0 = (i0.a1) r0
            i0.j1 r3 = r6.f5665d
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L5a
            i0.j1 r3 = r6.f5663b
            java.lang.Object r3 = r3.getValue()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L50
            goto L5a
        L50:
            r0 = -143455237(0xfffffffff7730bfb, float:-4.9295747E33)
            r7.a0(r0)
            r7.p(r4)
            goto L80
        L5a:
            r3 = -144841960(0xfffffffff75de318, float:-4.5004047E33)
            r7.a0(r3)
            boolean r3 = r7.h(r6)
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L6c
            if (r5 != r2) goto L74
        L6c:
            ci.e r5 = new ci.e
            r5.<init>(r0, r6, r1)
            r7.k0(r5)
        L74:
            fg.p r5 = (fg.p) r5
            i0.r.f(r5, r7, r6)
            r7.p(r4)
            goto L80
        L7d:
            r7.V()
        L80:
            i0.r1 r7 = r7.t()
            if (r7 == 0) goto L8e
            b0.t r0 = new b0.t
            r1 = 7
            r0.<init>(r8, r1, r6)
            r7.f6035d = r0
        L8e:
            return
    }
}
