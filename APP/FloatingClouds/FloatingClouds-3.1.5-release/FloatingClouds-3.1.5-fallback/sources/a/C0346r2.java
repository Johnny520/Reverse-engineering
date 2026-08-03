package a;

/* JADX INFO: renamed from: a.r2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0346r2 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f664a;
    public final /* synthetic */ androidx.appcompat.widget.ActionMenuView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar e;

    public C0346r2(com.google.android.material.bottomappbar.BottomAppBar r1, androidx.appcompat.widget.ActionMenuView r2, int r3, boolean r4) {
            r0 = this;
            r0.e = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator r1) {
            r0 = this;
            r1 = 1
            r0.f664a = r1
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator r5) {
            r4 = this;
            boolean r5 = r4.f664a
            if (r5 != 0) goto L10
            com.google.android.material.bottomappbar.BottomAppBar r5 = r4.e
            androidx.appcompat.widget.ActionMenuView r0 = r4.b
            int r1 = r4.c
            boolean r2 = r4.d
            r3 = 0
            r5.E(r0, r1, r2, r3)
        L10:
            return
    }
}
