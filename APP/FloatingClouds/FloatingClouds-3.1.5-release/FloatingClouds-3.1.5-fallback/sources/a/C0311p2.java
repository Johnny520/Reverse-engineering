package a;

/* JADX INFO: renamed from: a.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0311p2 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f632a;
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar b;

    public /* synthetic */ C0311p2(com.google.android.material.bottomappbar.BottomAppBar r1, int r2) {
            r0 = this;
            r0.f632a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    private final void a(android.animation.Animator r1) {
            r0 = this;
            return
    }

    private final void b(android.animation.Animator r1) {
            r0 = this;
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r4) {
            r3 = this;
            r0 = 0
            com.google.android.material.bottomappbar.BottomAppBar r1 = r3.b
            int r2 = r3.f632a
            switch(r2) {
                case 0: goto L11;
                case 1: goto Lc;
                default: goto L8;
            }
        L8:
            super.onAnimationEnd(r4)
            return
        Lc:
            int r4 = com.google.android.material.bottomappbar.BottomAppBar.i0
            r1.W = r0
            return
        L11:
            int r4 = com.google.android.material.bottomappbar.BottomAppBar.i0
            r1.V = r0
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator r1) {
            r0 = this;
            int r1 = r0.f632a
            switch(r1) {
                case 0: goto Lc;
                case 1: goto Lc;
                default: goto L5;
            }
        L5:
            com.google.android.material.bottomappbar.BottomAppBar r1 = r0.b
            r1.getClass()
            r1 = 0
            throw r1
        Lc:
            return
    }
}
