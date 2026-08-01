package p340;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.AbstractC3370;
import androidx.recyclerview.widget.C3358;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪子哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9565 extends AbstractC3370 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24974;

    public /* synthetic */ C9565(int i, int i2) {
        this.f24974 = i2;
        this.f24973 = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo5439(Rect rect, View view, RecyclerView recyclerView, C3358 c3358) {
        int i = this.f24974;
        int i2 = this.f24973;
        switch (i) {
            case 0:
                "outRect";
                rect.getClass();
                "view";
                view.getClass();
                "parent";
                "state";
                c3358.getClass();
                AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
                int absoluteAdapterPosition = abstractC3317M5249 != null ? abstractC3317M5249.getAbsoluteAdapterPosition() : -1;
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
                c3358.getClass();
                AbstractC3317 abstractC3317M52492 = RecyclerView.m5249(view);
                if ((abstractC3317M52492 != null ? abstractC3317M52492.getAbsoluteAdapterPosition() : -1) != -1) {
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
                c3358.getClass();
                AbstractC3317 abstractC3317M52493 = RecyclerView.m5249(view);
                if ((abstractC3317M52493 != null ? abstractC3317M52493.getAbsoluteAdapterPosition() : -1) != -1) {
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
