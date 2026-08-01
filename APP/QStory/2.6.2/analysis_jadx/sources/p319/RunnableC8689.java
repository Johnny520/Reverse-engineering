package p319;

import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.AbstractC3056;
import java.util.Iterator;
import java.util.List;
import p253.AbstractC8189;
import p323.AbstractC8728;
import p323.C8729;
import p324.C8738;
import top.suzhelan.qstory.ui.views.CustomRecycleView;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC8689 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ C8703 f24496;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24497;

    public /* synthetic */ RunnableC8689(C8703 c8703, int i) {
        this.f24497 = i;
        this.f24496 = c8703;
    }

    @Override // java.lang.Runnable
    public final void run() {
        LinearLayoutManager linearLayoutManager;
        int i = this.f24497;
        int i2 = 0;
        C8703 c8703 = this.f24496;
        switch (i) {
            case 0:
                DialogXRecycleView dialogXRecycleView = c8703.f24542;
                AbstractC2519 layoutManager = dialogXRecycleView != null ? dialogXRecycleView.getLayoutManager() : null;
                linearLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m4674(0, 0);
                    return;
                }
                return;
            case 1:
                DialogXRecycleView dialogXRecycleView2 = c8703.f24542;
                if (dialogXRecycleView2 != null) {
                    dialogXRecycleView2.m4736(0);
                    return;
                }
                return;
            case 2:
                int size = c8703.f24544.f22045.size();
                C8738 c8738 = C8738.f24639;
                String strM6668 = AbstractC3056.m6668(-3937831501178340775L);
                String strM66682 = AbstractC3056.m6668(-3937831174760826279L);
                c8738.getClass();
                int i3 = Integer.parseInt(C8738.m14408(strM6668, strM66682));
                if (size <= 8 || i3 < 0 || i3 >= size) {
                    return;
                }
                int i4 = Integer.parseInt(C8738.m14408(AbstractC3056.m6668(-3937831458228667815L), AbstractC3056.m6668(-3937561652678100391L)));
                DialogXRecycleView dialogXRecycleView3 = c8703.f24542;
                AbstractC2519 layoutManager2 = dialogXRecycleView3 != null ? dialogXRecycleView3.getLayoutManager() : null;
                linearLayoutManager = layoutManager2 instanceof GridLayoutManager ? (GridLayoutManager) layoutManager2 : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m4674(i3, i4);
                    return;
                }
                return;
            default:
                List list = c8703.f24543.f22045;
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if ((((AbstractC8728) it.next()) instanceof C8729) && (i2 = i2 + 1) < 0) {
                            AbstractC8189.m13663();
                            throw null;
                        }
                    }
                }
                C8738 c87382 = C8738.f24639;
                String strM66683 = AbstractC3056.m6668(-3937831303609845159L);
                String strM66684 = AbstractC3056.m6668(-3937831174760826279L);
                c87382.getClass();
                int i5 = Integer.parseInt(C8738.m14408(strM66683, strM66684));
                if (i2 <= 4 || i5 < 0 || i5 >= c8703.f24543.f22045.size()) {
                    return;
                }
                int i6 = Integer.parseInt(C8738.m14408(AbstractC3056.m6668(-3937831243480303015L), AbstractC3056.m6668(-3937561652678100391L)));
                CustomRecycleView customRecycleView = c8703.f24541;
                AbstractC2519 layoutManager3 = customRecycleView != null ? customRecycleView.getLayoutManager() : null;
                linearLayoutManager = layoutManager3 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager3 : null;
                if (linearLayoutManager != null) {
                    linearLayoutManager.m4674(i5, i6);
                    return;
                }
                return;
        }
    }
}
