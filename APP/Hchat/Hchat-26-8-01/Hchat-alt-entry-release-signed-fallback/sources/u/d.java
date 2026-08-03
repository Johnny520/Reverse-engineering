package u;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends k.w {
    public boolean T;
    public fg.l U;
    public final i.e0 V;

    public d(f2.i r9, fg.l r10, n.k r11, boolean r12, boolean r13) {
            r8 = this;
            u.c r7 = new u.c
            r0 = 0
            r7.<init>(r0, r10, r12)
            r2 = 0
            r3 = 1
            r5 = 0
            r0 = r8
            r6 = r9
            r1 = r11
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r0.T = r12
            r0.U = r10
            i.e0 r9 = new i.e0
            r10 = 27
            r9.<init>(r8, r10)
            r0.V = r9
            return
    }

    @Override // k.g
    public final void n1(f2.y r5) {
            r4 = this;
            boolean r0 = r4.T
            if (r0 == 0) goto L7
            h2.a r0 = h2.a.f5048g
            goto L9
        L7:
            h2.a r0 = h2.a.f5049h
        L9:
            f2.w.e(r5, r0)
            f2.x r0 = f2.u.f3240r
            mg.d[] r1 = f2.w.f3251a
            r2 = 9
            r2 = r1[r2]
            z0.d r2 = z0.k.f22493b
            r5.a(r0, r2)
            boolean r0 = r4.T
            z0.f r2 = new z0.f
            android.view.autofill.AutofillValue r0 = android.view.autofill.AutofillValue.forToggle(r0)
            r2.<init>(r0)
            f2.x r0 = f2.u.f3241s
            r3 = 10
            r1 = r1[r3]
            r5.a(r0, r2)
            nb.a r0 = new nb.a
            r1 = 15
            r0.<init>(r5, r1)
            f2.w.b(r5, r0)
            return
    }
}
