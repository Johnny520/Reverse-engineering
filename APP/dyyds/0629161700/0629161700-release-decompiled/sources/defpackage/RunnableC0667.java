package defpackage;

/* JADX INFO: renamed from: ᛴᛴᲈᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0667 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ androidx.appcompat.widget.ActionBarOverlayLayout f3236;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3237;

    public /* synthetic */ RunnableC0667(androidx.appcompat.widget.ActionBarOverlayLayout r1, int r2) {
            r0 = this;
            r0.f3237 = r2
            r0.f3236 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r2 = this;
            int r0 = r2.f3237
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = r2.f3236
            switch(r0) {
                case 0: goto L25;
                default: goto L7;
            }
        L7:
            r2.m28()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f99
            android.view.ViewPropertyAnimator r0 = r0.animate()
            androidx.appcompat.widget.ActionBarContainer r1 = r2.f99
            int r1 = r1.getHeight()
            int r1 = -r1
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            ᲀᛷᛲᛴ r1 = r2.f98
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            r2.f101 = r0
            return
        L25:
            r2.m28()
            androidx.appcompat.widget.ActionBarContainer r0 = r2.f99
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r1 = 0
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            ᲀᛷᛲᛴ r1 = r2.f98
            android.view.ViewPropertyAnimator r0 = r0.setListener(r1)
            r2.f101 = r0
            return
    }
}
