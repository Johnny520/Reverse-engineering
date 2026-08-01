package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class z0 implements java.lang.Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout b;

    public /* synthetic */ z0(androidx.appcompat.widget.ActionBarOverlayLayout r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.a
            switch(r0) {
                case 0: goto L25;
                default: goto L5;
            }
        L5:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.b
            r0.h()
            androidx.appcompat.widget.ActionBarContainer r1 = r0.d
            android.view.ViewPropertyAnimator r1 = r1.animate()
            androidx.appcompat.widget.ActionBarContainer r2 = r0.d
            int r2 = r2.getHeight()
            int r2 = -r2
            float r2 = (float) r2
            android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
            y0 r2 = r0.x
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.w = r1
            return
        L25:
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = r3.b
            r0.h()
            androidx.appcompat.widget.ActionBarContainer r1 = r0.d
            android.view.ViewPropertyAnimator r1 = r1.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r1 = r1.translationY(r2)
            y0 r2 = r0.x
            android.view.ViewPropertyAnimator r1 = r1.setListener(r2)
            r0.w = r1
            return
    }
}
