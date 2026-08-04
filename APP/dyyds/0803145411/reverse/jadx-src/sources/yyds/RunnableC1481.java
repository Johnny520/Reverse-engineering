package yyds;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: renamed from: yyds.ᛷᛱᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1481 implements Runnable {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ int f7016;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final /* synthetic */ C2312 f7017;

    public /* synthetic */ RunnableC1481(C2312 c2312, int i) {
        this.f7016 = i;
        this.f7017 = c2312;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f7016;
        C2312 c2312 = this.f7017;
        switch (i) {
            case 0:
                c2312.performHapticFeedback(0);
                break;
            case 1:
                c2312.performHapticFeedback(3);
                break;
            case 2:
                c2312.m4323(1, new AccelerateDecelerateInterpolator());
                break;
            case 3:
                c2312.m4323(2, new AccelerateInterpolator(2.0f));
                break;
            case 4:
                c2312.m4323(3, new DecelerateInterpolator(2.0f));
                break;
            default:
                c2312.m4323(c2312.f11347, c2312.f11328);
                break;
        }
    }
}
