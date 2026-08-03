package a;

/* JADX INFO: renamed from: a.k3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0222k3 extends android.animation.AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f541a;
    public final /* synthetic */ a.C0240l3 b;

    public /* synthetic */ C0222k3(a.C0240l3 r1, int r2) {
            r0 = this;
            r0.f541a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.f541a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationEnd(r2)
            return
        L9:
            a.l3 r2 = r1.b
            com.google.android.material.textfield.a r2 = r2.b
            r0 = 0
            r2.h(r0)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.f541a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationStart(r2)
            return
        L9:
            a.l3 r2 = r1.b
            com.google.android.material.textfield.a r2 = r2.b
            r0 = 1
            r2.h(r0)
            return
    }
}
