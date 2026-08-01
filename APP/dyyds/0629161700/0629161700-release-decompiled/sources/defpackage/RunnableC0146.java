package defpackage;

/* JADX INFO: renamed from: ᛱᛸᛵᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0146 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0207 f1095;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1096;

    public /* synthetic */ RunnableC0146(defpackage.C0207 r1, int r2) {
            r0 = this;
            r0.f1096 = r2
            r0.f1095 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            int r0 = r3.f1096
            r1 = 1073741824(0x40000000, float:2.0)
            r2 = 3
            ᛱᲇᲁᲈ r3 = r3.f1095
            switch(r0) {
                case 0: goto L33;
                case 1: goto L2f;
                case 2: goto L25;
                case 3: goto L1b;
                case 4: goto L12;
                default: goto La;
            }
        La:
            int r0 = r3.f1294
            android.view.animation.Interpolator r1 = r3.f1300
            r3.m757(r0, r1)
            return
        L12:
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>(r1)
            r3.m757(r2, r0)
            return
        L1b:
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r1)
            r1 = 2
            r3.m757(r1, r0)
            return
        L25:
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r1 = 1
            r3.m757(r1, r0)
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
