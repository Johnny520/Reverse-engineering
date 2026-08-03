package a;

/* JADX INFO: loaded from: classes.dex */
public final class Le implements a.K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.material.behavior.SwipeDismissBehavior f166a;

    public Le(com.google.android.material.behavior.SwipeDismissBehavior r1) {
            r0 = this;
            r0.<init>()
            r0.f166a = r1
            return
    }

    @Override // a.K
    public final boolean a(android.view.View r5) {
            r4 = this;
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r4.f166a
            boolean r1 = r0.s(r5)
            r2 = 0
            if (r1 == 0) goto L2f
            java.util.WeakHashMap<android.view.View, a.Jg> r1 = a.C0414ug.f721a
            int r1 = r5.getLayoutDirection()
            r3 = 1
            if (r1 != r3) goto L13
            r2 = r3
        L13:
            int r0 = r0.d
            if (r0 != 0) goto L19
            if (r2 != 0) goto L1d
        L19:
            if (r0 != r3) goto L23
            if (r2 != 0) goto L23
        L1d:
            int r0 = r5.getWidth()
            int r0 = -r0
            goto L27
        L23:
            int r0 = r5.getWidth()
        L27:
            r5.offsetLeftAndRight(r0)
            r0 = 0
            r5.setAlpha(r0)
            return r3
        L2f:
            return r2
    }
}
