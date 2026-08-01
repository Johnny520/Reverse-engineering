package p323;

import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import p034.AbstractC6347;
import p287.AbstractC8405;
import p321.C8688;
import p324.AbstractC8731;
import p324.C8732;
import top.suzhelan.qstory.ui.views.CustomRecycleView;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8712 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8726 f24543;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24544;

    public /* synthetic */ RunnableC8712(C8726 c8726, int i) {
        this.f24544 = i;
        this.f24543 = c8726;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayoutManager linearLayoutManager;
        int i = this.f24544;
        int i2 = 0;
        C8726 c8726 = this.f24543;
        switch (i) {
            case 0:
                DialogXRecycleView dialogXRecycleView = c8726.f24592;
                AbstractC2519 layoutManager = dialogXRecycleView != null ? dialogXRecycleView.getLayoutManager() : null;
                linearLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m4684(0, 0);
                    return;
                }
                return;
            case 1:
                DialogXRecycleView dialogXRecycleView2 = c8726.f24592;
                if (dialogXRecycleView2 != null) {
                    dialogXRecycleView2.m4746(0);
                    return;
                }
                return;
            case 2:
                int size = c8726.f24594.f22042.size();
                C8688 c8688 = C8688.f24506;
                String strM13972 = AbstractC8405.m13972(2722);
                String strM13973 = AbstractC8405.m13973("喵呜喵呜呜呜呜喵~喵呜喵喵喵呜喵喵");
                c8688.getClass();
                int i3 = Integer.parseInt(C8688.m14413(strM13972, strM13973));
                if (size <= 8 || i3 < 0 || i3 >= size) {
                    return;
                }
                int i4 = Integer.parseInt(C8688.m14413(AbstractC8405.m13972(2723), AbstractC8405.m13973("喵呜喵喵喵喵呜呜")));
                DialogXRecycleView dialogXRecycleView3 = c8726.f24592;
                AbstractC2519 layoutManager2 = dialogXRecycleView3 != null ? dialogXRecycleView3.getLayoutManager() : null;
                linearLayoutManager = layoutManager2 instanceof GridLayoutManager ? (GridLayoutManager) layoutManager2 : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m4684(i3, i4);
                    return;
                }
                return;
            default:
                List list = c8726.f24593.f22042;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if ((((AbstractC8731) it.next()) instanceof C8732) && (i2 = i2 + 1) < 0) {
                            AbstractC6347.m11921();
                            throw null;
                        }
                    }
                }
                C8688 c86882 = C8688.f24506;
                String strM139722 = AbstractC8405.m13972(2724);
                String strM139732 = AbstractC8405.m13973("喵呜喵呜呜呜呜喵~喵呜喵喵喵呜喵喵");
                c86882.getClass();
                int i5 = Integer.parseInt(C8688.m14413(strM139722, strM139732));
                if (i2 <= 4 || i5 < 0 || i5 >= c8726.f24593.f22042.size()) {
                    return;
                }
                int i6 = Integer.parseInt(C8688.m14413(AbstractC8405.m13972(2725), AbstractC8405.m13973("喵呜喵喵喵喵呜呜")));
                CustomRecycleView customRecycleView = c8726.f24591;
                AbstractC2519 layoutManager3 = customRecycleView != null ? customRecycleView.getLayoutManager() : null;
                linearLayoutManager = layoutManager3 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager3 : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m4684(i5, i6);
                    return;
                }
                return;
        }
    }
}
