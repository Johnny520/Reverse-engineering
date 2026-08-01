package p323;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.AbstractC2537;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC3056;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8733 extends AbstractC2537 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f24626;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24627;

    public /* synthetic */ C8733(int i, int i2) {
        this.f24627 = i2;
        this.f24626 = i;
    }

    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4869(Rect rect, View view, RecyclerView recyclerView, C2525 c2525) {
        int i = this.f24627;
        int i2 = this.f24626;
        switch (i) {
            case 0:
                "outRect";
                rect.getClass();
                "view";
                view.getClass();
                "parent";
                "state";
                c2525.getClass();
                AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
                int absoluteAdapterPosition = abstractC2484M4679 != null ? abstractC2484M4679.getAbsoluteAdapterPosition() : -1;
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
                AbstractC2484 abstractC2484M46792 = RecyclerView.m4679(view);
                if ((abstractC2484M46792 != null ? abstractC2484M46792.getAbsoluteAdapterPosition() : -1) != -1) {
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
                AbstractC2484 abstractC2484M46793 = RecyclerView.m4679(view);
                if ((abstractC2484M46793 != null ? abstractC2484M46793.getAbsoluteAdapterPosition() : -1) != -1) {
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
