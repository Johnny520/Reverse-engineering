package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ta extends android.animation.AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ defpackage.ua b;

    public /* synthetic */ ta(defpackage.ua r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 1: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationEnd(r2)
            return
        L9:
            ua r2 = r1.b
            ej r2 = r2.b
            r0 = 0
            r2.h(r0)
            return
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator r2) {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L9;
                default: goto L5;
            }
        L5:
            super.onAnimationStart(r2)
            return
        L9:
            ua r2 = r1.b
            ej r2 = r2.b
            r0 = 1
            r2.h(r0)
            return
    }
}
