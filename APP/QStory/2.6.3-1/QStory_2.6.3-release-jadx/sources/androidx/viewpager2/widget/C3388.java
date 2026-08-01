package androidx.viewpager2.widget;

import android.view.View;
import androidx.compose.animation.core.C1171;
import p171.InterfaceC8444;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3388 implements InterfaceC8444 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C1171 f8042;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f8043;

    public /* synthetic */ C3388(C1171 c1171, int i) {
        this.f8043 = i;
        this.f8042 = c1171;
    }

    @Override // p171.InterfaceC8444
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo901(View view) {
        int i = this.f8043;
        C1171 c1171 = this.f8042;
        switch (i) {
            case 0:
                int currentItem = ((C3382) view).getCurrentItem() + 1;
                C3382 c3382 = (C3382) c1171.f1438;
                if (c3382.f8025) {
                    c3382.m5614(currentItem);
                }
                break;
            default:
                int currentItem2 = ((C3382) view).getCurrentItem() - 1;
                C3382 c33822 = (C3382) c1171.f1438;
                if (c33822.f8025) {
                    c33822.m5614(currentItem2);
                }
                break;
        }
        return true;
    }
}
