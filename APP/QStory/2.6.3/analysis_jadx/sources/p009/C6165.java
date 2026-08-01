package p009;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.AbstractC2537;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p018.AbstractC6253;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6165 extends AbstractC2537 {
    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4879(Rect rect, View view, RecyclerView recyclerView, C2525 c2525) {
        super.mo4879(rect, view, recyclerView, c2525);
        AbstractC2484 abstractC2484M4689 = RecyclerView.m4689(view);
        int absoluteAdapterPosition = abstractC2484M4689 != null ? abstractC2484M4689.getAbsoluteAdapterPosition() : -1;
        ArrayList arrayList = C6182.f17007;
        Object obj = arrayList.get(absoluteAdapterPosition);
        if ((obj instanceof ItemUiInfoGroupWrapper) || absoluteAdapterPosition == 0 || ((obj instanceof OtherViewItemInfo) && !(arrayList.get(absoluteAdapterPosition - 1) instanceof OtherViewItemInfo))) {
            rect.top = AbstractC6253.m11754(recyclerView.getContext(), 16.0f);
        }
        if (obj instanceof ItemUiInfo) {
            ItemUiInfo itemUiInfo = (ItemUiInfo) obj;
            if (absoluteAdapterPosition != 0) {
                Object obj2 = arrayList.get(absoluteAdapterPosition - 1);
                if (obj2 instanceof ItemUiInfo) {
                    String groupPath = itemUiInfo.getGroupPath();
                    String groupPath2 = ((ItemUiInfo) obj2).getGroupPath();
                    if (groupPath2 != null && !groupPath2.equals(groupPath)) {
                        rect.top = AbstractC6253.m11754(recyclerView.getContext(), 16.0f);
                    }
                }
            }
        }
        int iM11754 = AbstractC6253.m11754(recyclerView.getContext(), 16.0f);
        rect.left = iM11754;
        rect.right = iM11754;
        if (absoluteAdapterPosition == arrayList.size() - 1) {
            rect.bottom = AbstractC6253.m11754(recyclerView.getContext(), 16.0f);
        }
    }
}
