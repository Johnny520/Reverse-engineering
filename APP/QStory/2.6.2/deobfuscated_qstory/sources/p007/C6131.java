package p007;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC2484;
import androidx.recyclerview.widget.AbstractC2537;
import androidx.recyclerview.widget.C2525;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson2.AbstractC2904;
import java.util.ArrayList;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6131 extends AbstractC2537 {
    @Override // androidx.recyclerview.widget.AbstractC2537
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo4869(Rect rect, View view, RecyclerView recyclerView, C2525 c2525) {
        super.mo4869(rect, view, recyclerView, c2525);
        AbstractC2484 abstractC2484M4679 = RecyclerView.m4679(view);
        int absoluteAdapterPosition = abstractC2484M4679 != null ? abstractC2484M4679.getAbsoluteAdapterPosition() : -1;
        ArrayList arrayList = C6148.f16765;
        Object obj = arrayList.get(absoluteAdapterPosition);
        if ((obj instanceof ItemUiInfoGroupWrapper) || absoluteAdapterPosition == 0 || ((obj instanceof OtherViewItemInfo) && !(arrayList.get(absoluteAdapterPosition - 1) instanceof OtherViewItemInfo))) {
            rect.top = AbstractC2904.m6267(recyclerView.getContext(), 16.0f);
        }
        if (obj instanceof ItemUiInfo) {
            ItemUiInfo itemUiInfo = (ItemUiInfo) obj;
            if (absoluteAdapterPosition != 0) {
                Object obj2 = arrayList.get(absoluteAdapterPosition - 1);
                if (obj2 instanceof ItemUiInfo) {
                    String groupPath = itemUiInfo.getGroupPath();
                    String groupPath2 = ((ItemUiInfo) obj2).getGroupPath();
                    if (groupPath2 != null && !groupPath2.equals(groupPath)) {
                        rect.top = AbstractC2904.m6267(recyclerView.getContext(), 16.0f);
                    }
                }
            }
        }
        int iM6267 = AbstractC2904.m6267(recyclerView.getContext(), 16.0f);
        rect.left = iM6267;
        rect.right = iM6267;
        if (absoluteAdapterPosition == arrayList.size() - 1) {
            rect.bottom = AbstractC2904.m6267(recyclerView.getContext(), 16.0f);
        }
    }
}
