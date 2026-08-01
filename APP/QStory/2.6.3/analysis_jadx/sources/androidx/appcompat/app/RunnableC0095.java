package androidx.appcompat.app;

import android.view.ViewGroup;
import androidx.core.view.AbstractC2270;
import androidx.core.view.C2282;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0095 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ LayoutInflaterFactory2C0068 f276;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f277;

    public /* synthetic */ RunnableC0095(LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068, int i) {
        this.f277 = i;
        this.f276 = layoutInflaterFactory2C0068;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.f277;
        LayoutInflaterFactory2C0068 layoutInflaterFactory2C0068 = this.f276;
        switch (i) {
            case 0:
                if ((layoutInflaterFactory2C0068.f189 & 1) != 0) {
                    layoutInflaterFactory2C0068.m233(0);
                }
                if ((layoutInflaterFactory2C0068.f189 & 4096) != 0) {
                    layoutInflaterFactory2C0068.m233(108);
                }
                layoutInflaterFactory2C0068.f193 = false;
                layoutInflaterFactory2C0068.f189 = 0;
                break;
            default:
                layoutInflaterFactory2C0068.f161.showAtLocation(layoutInflaterFactory2C0068.f162, 55, 0, 0);
                C2282 c2282 = layoutInflaterFactory2C0068.f163;
                if (c2282 != null) {
                    c2282.m4271();
                }
                if (layoutInflaterFactory2C0068.f159 && (viewGroup = layoutInflaterFactory2C0068.f160) != null && viewGroup.isLaidOut()) {
                    layoutInflaterFactory2C0068.f162.setAlpha(0.0f);
                    C2282 c2282M4237 = AbstractC2270.m4237(layoutInflaterFactory2C0068.f162);
                    c2282M4237.m4272(1.0f);
                    layoutInflaterFactory2C0068.f163 = c2282M4237;
                    c2282M4237.m4269(new C0093(this, 0));
                } else {
                    layoutInflaterFactory2C0068.f162.setAlpha(1.0f);
                    layoutInflaterFactory2C0068.f162.setVisibility(0);
                }
                break;
        }
    }
}
