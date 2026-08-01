package androidx.appcompat.app;

import android.view.ViewGroup;
import androidx.core.view.AbstractC3103;
import androidx.core.view.C3115;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0942 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0915 f621;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f622;

    public /* synthetic */ RunnableC0942(LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915, int i) {
        this.f622 = i;
        this.f621 = layoutInflaterFactory2C0915;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f622;
        LayoutInflaterFactory2C0915 layoutInflaterFactory2C0915 = this.f621;
        switch (i) {
            case 0:
                if ((layoutInflaterFactory2C0915.f534 & 1) != 0) {
                    layoutInflaterFactory2C0915.m793(0);
                }
                if ((layoutInflaterFactory2C0915.f534 & 4096) != 0) {
                    layoutInflaterFactory2C0915.m793(108);
                }
                layoutInflaterFactory2C0915.f538 = false;
                layoutInflaterFactory2C0915.f534 = 0;
                break;
            default:
                layoutInflaterFactory2C0915.f506.showAtLocation(layoutInflaterFactory2C0915.f507, 55, 0, 0);
                C3115 c3115 = layoutInflaterFactory2C0915.f508;
                if (c3115 != null) {
                    c3115.m4831();
                }
                if (layoutInflaterFactory2C0915.f504 && (viewGroup = layoutInflaterFactory2C0915.f505) != null && viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C0915.f507.setAlpha(0.0f);
                    C3115 c3115M4797 = AbstractC3103.m4797(layoutInflaterFactory2C0915.f507);
                    c3115M4797.m4832(1.0f);
                    layoutInflaterFactory2C0915.f508 = c3115M4797;
                    c3115M4797.m4829(new C0940(this, 0));
                } else {
                    layoutInflaterFactory2C0915.f507.setAlpha(1.0f);
                    layoutInflaterFactory2C0915.f507.setVisibility(0);
                }
                break;
        }
    }
}
