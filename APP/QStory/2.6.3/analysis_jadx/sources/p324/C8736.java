package p324;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.AbstractC2537;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.RecyclerView;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8736 extends AbstractC2537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24628;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24629;

    public /* synthetic */ C8736(int i, int i2) {
        this.f24629 = i2;
        this.f24628 = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4879(Rect rect, View view, RecyclerView recyclerView, C2525 c2525) {
        int i = this.f24629;
        int i2 = this.f24628;
        switch (i) {
            case 0:
                AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵呜呜呜喵呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜呜呜呜~喵喵喵呜喵呜喵呜");
                rect.getClass();
                AbstractC8405.m13973("喵喵喵喵喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜呜呜呜~喵喵喵呜呜呜呜呜");
                view.getClass();
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵呜呜喵喵喵");
                AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵喵喵喵喵呜~喵喵喵呜呜喵呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵");
                c2525.getClass();
                AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(view);
                int absoluteAdapterPosition = abstractC2484M4689 != null ? abstractC2484M4689.getAbsoluteAdapterPosition() : -1;
                int i3 = absoluteAdapterPosition % 4;
                rect.left = i2 - ((i3 * i2) / 4);
                rect.right = ((i3 + 1) * i2) / 4;
                if (absoluteAdapterPosition < 4) {
                    rect.top = i2;
                }
                rect.bottom = i2;
                break;
            case 1:
                rect.getClass();
                view.getClass();
                c2525.getClass();
                AbstractC2484 abstractC2484M46892 = RecyclerView.m4689(view);
                if ((abstractC2484M46892 != null ? abstractC2484M46892.getAbsoluteAdapterPosition() : -1) != -1) {
                    int i4 = i2 / 2;
                    rect.left = i4;
                    rect.right = i4;
                    rect.top = i4;
                    rect.bottom = i4;
                    break;
                }
                break;
            default:
                rect.getClass();
                view.getClass();
                c2525.getClass();
                AbstractC2484 abstractC2484M46893 = RecyclerView.m4689(view);
                if ((abstractC2484M46893 != null ? abstractC2484M46893.getAbsoluteAdapterPosition() : -1) != -1) {
                    int i5 = i2 / 2;
                    rect.left = i5;
                    rect.right = i5;
                    rect.top = i5;
                    rect.bottom = i5;
                    break;
                }
                break;
        }
    }
}
