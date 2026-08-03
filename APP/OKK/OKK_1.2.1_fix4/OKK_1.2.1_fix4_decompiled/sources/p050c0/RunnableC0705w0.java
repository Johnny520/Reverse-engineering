package p050c0;

import android.widget.ImageView;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: c0.w0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0705w0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2215a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ImageView f2216b;

    public /* synthetic */ RunnableC0705w0(ImageView imageView, int i2) {
        this.f2215a = i2;
        this.f2216b = imageView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView = this.f2216b;
        switch (this.f2215a) {
            case 0:
                AbstractC0307g.m703e(imageView, "$iv");
                C0580D0 c0580d0 = C0580D0.f1723a;
                if (C0580D0.m1402i(imageView)) {
                    C0580D0.m1395b(imageView, true);
                }
                break;
            default:
                AbstractC0307g.m703e(imageView, "$iv");
                C0580D0 c0580d02 = C0580D0.f1723a;
                C0580D0.m1406m(imageView);
                if (C0580D0.m1402i(imageView)) {
                    C0580D0.m1395b(imageView, true);
                }
                break;
        }
    }
}
