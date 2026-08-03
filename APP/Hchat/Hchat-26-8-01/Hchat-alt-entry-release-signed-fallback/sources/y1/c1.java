package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends y1.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i0.j1 f21863p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f21864q;

    public c1(android.app.Activity r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            i0.j1 r1 = i0.r.u(r1)
            r0.f21863p = r1
            return
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
            return
    }

    @Override // y1.a
    public final void a(i0.h0 r6, int r7) {
            r5 = this;
            r0 = 420213850(0x190bf45a, float:7.235478E-24)
            r6.b0(r0)
            boolean r0 = r6.h(r5)
            r1 = 2
            if (r0 == 0) goto Lf
            r0 = 4
            goto L10
        Lf:
            r0 = r1
        L10:
            r0 = r0 | r7
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
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L43
            i0.j1 r0 = r5.f21863p
            java.lang.Object r0 = r0.getValue()
            fg.p r0 = (fg.p) r0
            if (r0 != 0) goto L35
            r0 = -1238823553(0xffffffffb6290d7f, float:-2.5190818E-6)
            r6.a0(r0)
        L31:
            r6.p(r4)
            goto L46
        L35:
            r1 = 98585282(0x5e04ac2, float:2.109232E-35)
            r6.a0(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0.invoke(r6, r1)
            goto L31
        L43:
            r6.V()
        L46:
            i0.r1 r6 = r6.t()
            if (r6 == 0) goto L54
            a1.h r0 = new a1.h
            r1 = 4
            r0.<init>(r5, r7, r1)
            r6.f6035d = r0
        L54:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public java.lang.CharSequence getAccessibilityClassName() {
            r1 = this;
            java.lang.Class<y1.c1> r0 = y1.c1.class
            java.lang.String r0 = r0.getName()
            return r0
    }

    @Override // y1.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
            r1 = this;
            boolean r0 = r1.f21864q
            return r0
    }

    public final void setContent(fg.p r2) {
            r1 = this;
            r0 = 1
            r1.f21864q = r0
            i0.j1 r0 = r1.f21863p
            r0.setValue(r2)
            boolean r2 = r1.isAttachedToWindow()
            if (r2 != 0) goto L16
            y1.f1 r2 = r1.getComposeViewContext$ui()
            if (r2 == 0) goto L15
            goto L16
        L15:
            return
        L16:
            r1.e()
            return
    }
}
