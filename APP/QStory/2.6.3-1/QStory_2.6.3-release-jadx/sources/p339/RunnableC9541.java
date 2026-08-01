package p339;

import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Iterator;
import java.util.List;
import p050.AbstractC7176;
import p303.AbstractC9234;
import p337.C9517;
import p340.AbstractC9560;
import p340.C9561;
import top.suzhelan.qstory.p015ui.views.CustomRecycleView;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC9541 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C9555 f24888;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24889;

    public /* synthetic */ RunnableC9541(C9555 c9555, int i) {
        this.f24889 = i;
        this.f24888 = c9555;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayoutManager linearLayoutManager;
        int i = this.f24889;
        int i2 = 0;
        C9555 c9555 = this.f24888;
        switch (i) {
            case 0:
                DialogXRecycleView dialogXRecycleView = c9555.f24937;
                AbstractC3352 layoutManager = dialogXRecycleView != null ? dialogXRecycleView.getLayoutManager() : null;
                linearLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m5244(0, 0);
                    return;
                }
                return;
            case 1:
                DialogXRecycleView dialogXRecycleView2 = c9555.f24937;
                if (dialogXRecycleView2 != null) {
                    dialogXRecycleView2.m5306(0);
                    return;
                }
                return;
            case 2:
                int size = c9555.f24939.f22387.size();
                C9517 c9517 = C9517.f24851;
                String strM14531 = AbstractC9234.m14531(2722);
                String strM14532 = AbstractC9234.m14532("喵呜喵呜呜呜呜喵~喵呜喵喵喵呜喵喵");
                c9517.getClass();
                int i3 = Integer.parseInt(C9517.m14972(strM14531, strM14532));
                if (size <= 8 || i3 < 0 || i3 >= size) {
                    return;
                }
                int i4 = Integer.parseInt(C9517.m14972(AbstractC9234.m14531(2723), AbstractC9234.m14532("喵呜喵喵喵喵呜呜")));
                DialogXRecycleView dialogXRecycleView3 = c9555.f24937;
                AbstractC3352 layoutManager2 = dialogXRecycleView3 != null ? dialogXRecycleView3.getLayoutManager() : null;
                linearLayoutManager = layoutManager2 instanceof GridLayoutManager ? (GridLayoutManager) layoutManager2 : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m5244(i3, i4);
                    return;
                }
                return;
            default:
                List list = c9555.f24938.f22387;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if ((((AbstractC9560) it.next()) instanceof C9561) && (i2 = i2 + 1) < 0) {
                            AbstractC7176.m12480();
                            throw null;
                        }
                    }
                }
                C9517 c95172 = C9517.f24851;
                String strM145312 = AbstractC9234.m14531(2724);
                String strM145322 = AbstractC9234.m14532("喵呜喵呜呜呜呜喵~喵呜喵喵喵呜喵喵");
                c95172.getClass();
                int i5 = Integer.parseInt(C9517.m14972(strM145312, strM145322));
                if (i2 <= 4 || i5 < 0 || i5 >= c9555.f24938.f22387.size()) {
                    return;
                }
                int i6 = Integer.parseInt(C9517.m14972(AbstractC9234.m14531(2725), AbstractC9234.m14532("喵呜喵喵喵喵呜呜")));
                CustomRecycleView customRecycleView = c9555.f24936;
                AbstractC3352 layoutManager3 = customRecycleView != null ? customRecycleView.getLayoutManager() : null;
                linearLayoutManager = layoutManager3 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager3 : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m5244(i5, i6);
                    return;
                }
                return;
        }
    }
}
