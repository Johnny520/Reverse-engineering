package androidx.viewpager2.widget;

import android.view.View;
import androidx.compose.animation.core.C0325;
import p155.InterfaceC7615;

/* JADX INFO: renamed from: androidx.viewpager2.widget.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2555 implements InterfaceC7615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C0325 f7697;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f7698;

    public /* synthetic */ C2555(C0325 c0325, int i) {
        this.f7698 = i;
        this.f7697 = c0325;
    }

    @Override // p155.InterfaceC7615
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo341(View view) {
        int i = this.f7698;
        C0325 c0325 = this.f7697;
        switch (i) {
            case 0:
                int currentItem = ((C2549) view).getCurrentItem() + 1;
                C2549 c2549 = (C2549) c0325.f1093;
                if (c2549.f7680) {
                    c2549.m5054(currentItem);
                }
                break;
            default:
                int currentItem2 = ((C2549) view).getCurrentItem() - 1;
                C2549 c25492 = (C2549) c0325.f1093;
                if (c25492.f7680) {
                    c25492.m5054(currentItem2);
                }
                break;
        }
        return true;
    }
}
