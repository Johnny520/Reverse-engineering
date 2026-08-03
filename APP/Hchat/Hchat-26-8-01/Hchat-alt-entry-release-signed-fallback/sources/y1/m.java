package y1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g3.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ y1.t f21994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x1.f0 f21995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y1.t f21996l;

    public m(y1.t r1, x1.f0 r2, y1.t r3) {
            r0 = this;
            r0.f21994j = r1
            r0.f21995k = r2
            r0.f21996l = r3
            r0.<init>()
            return
    }

    @Override // g3.b
    public final void b(android.view.View r8, h3.g r9) {
            r7 = this;
            android.view.accessibility.AccessibilityNodeInfo r0 = r9.f5066a
            android.view.View$AccessibilityDelegate r1 = r7.f4185g
            r1.onInitializeAccessibilityNodeInfo(r8, r0)
            y1.t r8 = r7.f21994j
            y1.z r1 = r8.F
            boolean r2 = r1.o()
            if (r2 == 0) goto L15
            r2 = 0
            r0.setVisibleToUser(r2)
        L15:
            x1.f0 r2 = r7.f21995k
            x1.f0 r3 = r2.u()
        L1b:
            r4 = 0
            if (r3 == 0) goto L2e
            x1.b1 r5 = r3.L
            r6 = 8
            boolean r5 = r5.d(r6)
            if (r5 == 0) goto L29
            goto L2f
        L29:
            x1.f0 r3 = r3.u()
            goto L1b
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L37
            int r3 = r3.f20890h
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L37:
            r3 = -1
            if (r4 == 0) goto L4a
            f2.s r5 = r8.getSemanticsOwner()
            f2.q r5 = r5.a()
            int r5 = r5.f3215f
            int r6 = r4.intValue()
            if (r6 != r5) goto L4e
        L4a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
        L4e:
            int r4 = r4.intValue()
            r9.f5067b = r4
            y1.t r9 = r7.f21996l
            r0.setParent(r9, r4)
            int r2 = r2.f20890h
            f.u r4 = r1.H
            int r4 = r4.d(r2)
            if (r4 == r3) goto L79
            y1.r0 r5 = r8.getAndroidViewsHandler$ui()
            x2.h r5 = y1.g0.t(r5, r4)
            if (r5 == 0) goto L71
            r0.setTraversalBefore(r5)
            goto L74
        L71:
            r0.setTraversalBefore(r9, r4)
        L74:
            java.lang.String r4 = r1.J
            y1.t.f(r8, r2, r0, r4)
        L79:
            f.u r4 = r1.I
            int r4 = r4.d(r2)
            if (r4 == r3) goto L97
            y1.r0 r3 = r8.getAndroidViewsHandler$ui()
            x2.h r3 = y1.g0.t(r3, r4)
            if (r3 == 0) goto L8f
            r0.setTraversalAfter(r3)
            goto L92
        L8f:
            r0.setTraversalAfter(r9, r4)
        L92:
            java.lang.String r9 = r1.K
            y1.t.f(r8, r2, r0, r9)
        L97:
            return
    }
}
