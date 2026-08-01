package xhss;

/* JADX INFO: renamed from: xhss.ᲈᛵᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1142 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3686;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final /* synthetic */ xhss.C0450 f3687;

    public /* synthetic */ RunnableC1142(xhss.C0450 r1, int r2) {
            r0 = this;
            r0.f3686 = r2
            r0.f3687 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f3686
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 3
            xhss.ᛵᛲᲇᛴ r3 = r3.f3687
            switch(r0) {
                case 0: goto L33;
                case 1: goto L2f;
                case 2: goto L25;
                case 3: goto L1b;
                case 4: goto L12;
                default: goto La;
            }
        La:
            int r0 = r3.f1612
            android.view.animation.Interpolator r1 = r3.f1603
            r3.m829(r0, r1)
            return
        L12:
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r3.m829(r2, r0)
            return
        L1b:
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r1)
            r1 = 2
            r3.m829(r1, r0)
            return
        L25:
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r1 = 1
            r3.m829(r1, r0)
            return
        L2f:
            r3.performHapticFeedback(r2)
            return
        L33:
            r0 = 0
            r3.performHapticFeedback(r0)
            return
    }
}
