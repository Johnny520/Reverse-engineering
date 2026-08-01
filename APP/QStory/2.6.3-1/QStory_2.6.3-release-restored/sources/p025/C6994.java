package p025;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.AbstractC3317;
import androidx.recyclerview.widget.AbstractC3370;
import androidx.recyclerview.widget.C3358;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfo;
import lin.xposed.hook.view.main.itemview.info.ItemUiInfoGroupWrapper;
import p034.AbstractC7082;

/* JADX INFO: renamed from: 飘花落叶言世兰子苏哲楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6994 extends AbstractC3370 {
    @Override // androidx.recyclerview.widget.AbstractC3370
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo5439(Rect rect, View view, RecyclerView recyclerView, C3358 c3358) {
        super.mo5439(rect, view, recyclerView, c3358);
        AbstractC3317 abstractC3317M5249 = RecyclerView.m5249(view);
        int absoluteAdapterPosition = abstractC3317M5249 != null ? abstractC3317M5249.getAbsoluteAdapterPosition() : -1;
        ArrayList arrayList = C7011.f17352;
        Object obj = arrayList.get(absoluteAdapterPosition);
        if ((obj instanceof ItemUiInfoGroupWrapper) || absoluteAdapterPosition == 0 || ((obj instanceof OtherViewItemInfo) && !(arrayList.get(absoluteAdapterPosition - 1) instanceof OtherViewItemInfo))) {
            rect.top = AbstractC7082.m12313(recyclerView.getContext(), 16.0f);
        }
        if (obj instanceof ItemUiInfo) {
            ItemUiInfo itemUiInfo = (ItemUiInfo) obj;
            if (absoluteAdapterPosition != 0) {
                Object obj2 = arrayList.get(absoluteAdapterPosition - 1);
                if (obj2 instanceof ItemUiInfo) {
                    String groupPath = itemUiInfo.getGroupPath();
                    String groupPath2 = ((ItemUiInfo) obj2).getGroupPath();
                    if (groupPath2 != null && !groupPath2.equals(groupPath)) {
                        rect.top = AbstractC7082.m12313(recyclerView.getContext(), 16.0f);
                    }
                }
            }
        }
        int iM12313 = AbstractC7082.m12313(recyclerView.getContext(), 16.0f);
        rect.left = iM12313;
        rect.right = iM12313;
        if (absoluteAdapterPosition == arrayList.size() - 1) {
            rect.bottom = AbstractC7082.m12313(recyclerView.getContext(), 16.0f);
        }
    }
}
