package ke;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends r9.e0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f7588j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final java.lang.Object f7589k;

    public /* synthetic */ a(java.lang.Object r1, int r2) {
            r0 = this;
            r0.f7588j = r2
            r0.f7589k = r1
            r0.<init>()
            return
    }

    @Override // r9.e0, ke.e
    public boolean a(ud.r r2, ud.n r3) {
            r1 = this;
            int r0 = r1.f7588j
            switch(r0) {
                case 4: goto La;
                default: goto L5;
            }
        L5:
            boolean r2 = super.a(r2, r3)
            return r2
        La:
            java.lang.Object r2 = r1.f7589k
            ce.a r2 = (ce.a) r2
            boolean r2 = r2.test(r3)
            return r2
    }

    @Override // r9.e0, ke.e
    public void b(ud.r r7, ud.n r8) {
            r6 = this;
            int r0 = r6.f7588j
            switch(r0) {
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            boolean r0 = r8 instanceof xd.d
            if (r0 == 0) goto L41
            xd.d r8 = (xd.d) r8
            java.lang.Object r0 = r6.f7589k
            java.util.function.Supplier r0 = (java.util.function.Supplier) r0
            java.lang.Object r0 = r0.get()
            ke.k r0 = (ke.k) r0
            r0.f7602l = r8
            r1 = 0
            r2 = r1
        L1a:
            x6.d.h0(r7, r0, r8)
            boolean r3 = r0.f7603m
            if (r3 == 0) goto L2f
            r0.f7603m = r1
            java.util.HashSet r3 = r0.f7600j
            r3.clear()
            java.util.HashSet r3 = r0.f7601k
            r3.clear()
            r3 = 1
            goto L30
        L2f:
            r3 = r1
        L30:
            int r4 = r2 + 1
            r5 = 20
            if (r2 <= r5) goto L3c
            java.lang.String r8 = "Unexpected iteration count in SwitchBreakVisitor. Please report as an issue"
            r7.L(r8)
            goto L41
        L3c:
            if (r3 != 0) goto L3f
            goto L41
        L3f:
            r2 = r4
            goto L1a
        L41:
            return
    }

    @Override // r9.e0, ke.e
    public void d(ud.r r1, ud.h r2) {
            r0 = this;
            int r1 = r0.f7588j
            switch(r1) {
                case 0: goto L1c;
                case 1: goto L5;
                case 2: goto L14;
                case 3: goto L6;
                default: goto L5;
            }
        L5:
            return
        L6:
            boolean r1 = r2 instanceof ud.a
            if (r1 == 0) goto L13
            java.lang.Object r1 = r0.f7589k
            ae.g r1 = (ae.g) r1
            ud.a r2 = (ud.a) r2
            r1.accept(r2)
        L13:
            return
        L14:
            java.lang.Object r1 = r0.f7589k
            java.util.function.Consumer r1 = (java.util.function.Consumer) r1
            r1.accept(r2)
            return
        L1c:
            boolean r1 = r2 instanceof ud.a
            if (r1 != 0) goto L21
            goto L2a
        L21:
            ud.a r2 = (ud.a) r2
            java.lang.Object r1 = r0.f7589k
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.add(r2)
        L2a:
            return
    }
}
