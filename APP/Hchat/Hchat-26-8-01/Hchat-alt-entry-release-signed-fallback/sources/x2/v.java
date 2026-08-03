package x2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends x2.h {
    public final android.view.View G;
    public final r1.d H;
    public v0.e I;
    public fg.l J;
    public fg.l K;
    public fg.l L;

    public v(android.content.Context r8, fg.l r9, i0.f0 r10, v0.f r11, int r12, x1.r1 r13) {
            r7 = this;
            java.lang.Object r9 = r9.invoke(r8)
            r5 = r9
            android.view.View r5 = (android.view.View) r5
            r1.d r4 = new r1.d
            r4.<init>()
            r0 = r7
            r1 = r8
            r2 = r10
            r3 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.G = r5
            r0.H = r4
            r8 = 0
            r7.setClipChildren(r8)
            java.lang.String r8 = java.lang.String.valueOf(r3)
            r9 = 0
            if (r11 == 0) goto L28
            java.lang.Object r10 = r11.d(r8)
            goto L29
        L28:
            r10 = r9
        L29:
            boolean r12 = r10 instanceof android.util.SparseArray
            if (r12 == 0) goto L30
            r9 = r10
            android.util.SparseArray r9 = (android.util.SparseArray) r9
        L30:
            if (r9 == 0) goto L35
            r5.restoreHierarchyState(r9)
        L35:
            if (r11 == 0) goto L44
            x2.g r9 = new x2.g
            r10 = 2
            r9.<init>(r7, r10)
            v0.e r8 = r11.e(r8, r9)
            r7.setSavableRegistryEntry(r8)
        L44:
            x2.b r8 = x2.b.f21106k
            r0.J = r8
            r0.K = r8
            r0.L = r8
            return
    }

    public static final void h(x2.v r1) {
            r0 = 0
            r1.setSavableRegistryEntry(r0)
            return
    }

    private final void setSavableRegistryEntry(v0.e r2) {
            r1 = this;
            v0.e r0 = r1.I
            if (r0 == 0) goto L9
            b5.c r0 = (b5.c) r0
            r0.Z()
        L9:
            r1.I = r2
            return
    }

    public final r1.d getDispatcher() {
            r1 = this;
            r1.d r0 = r1.H
            return r0
    }

    public final fg.l getReleaseBlock() {
            r1 = this;
            fg.l r0 = r1.L
            return r0
    }

    public final fg.l getResetBlock() {
            r1 = this;
            fg.l r0 = r1.K
            return r0
    }

    public /* bridge */ /* synthetic */ y1.a getSubCompositionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final fg.l getUpdateBlock() {
            r1 = this;
            fg.l r0 = r1.J
            return r0
    }

    public android.view.View getViewRoot() {
            r0 = this;
            return r0
    }

    public final void setReleaseBlock(fg.l r2) {
            r1 = this;
            r1.L = r2
            x2.g r2 = new x2.g
            r0 = 3
            r2.<init>(r1, r0)
            r1.setRelease(r2)
            return
    }

    public final void setResetBlock(fg.l r2) {
            r1 = this;
            r1.K = r2
            x2.g r2 = new x2.g
            r0 = 4
            r2.<init>(r1, r0)
            r1.setReset(r2)
            return
    }

    public final void setUpdateBlock(fg.l r2) {
            r1 = this;
            r1.J = r2
            x2.g r2 = new x2.g
            r0 = 5
            r2.<init>(r1, r0)
            r1.setUpdate(r2)
            return
    }
}
