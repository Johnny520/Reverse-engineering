package p319;

import android.view.View;
import androidx.appcompat.app.RunnableC0062;
import androidx.compose.runtime.internal.C1251;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.ComponentCallbacks2C3057;
import com.bumptech.glide.load.engine.C3004;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.AbstractC3746;
import kotlinx.coroutines.AbstractC5398;
import p035.AbstractC6340;
import p257.C8226;
import p257.C8239;
import p324.C8738;
import p385.C9088;
import top.suzhelan.plugin.sdk.online.manager.AbstractC5803;
import top.suzhelan.plugin.sdk.online.presenter.C5804;
import top.suzhelan.plugin.sdk.online.presenter.C5805;
import top.suzhelan.plugin.sdk.online.presenter.C5806;
import top.suzhelan.qstory.ui.views.CustomRecycleView;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.presenter.C5979;

/* JADX INFO: renamed from: 飘花落叶言苏世兰哲子楪.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8685 extends AbstractC3746 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f24490;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f24491;

    public /* synthetic */ C8685(Object obj, int i) {
        this.f24490 = i;
        this.f24491 = obj;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo8079(AbstractC3737 abstractC3737) {
        switch (this.f24490) {
            case 0:
                AbstractC3056.m6668(-3937677032679540135L);
                ((C8239) abstractC3737).getClass();
                ((C8703) this.f24491).getClass();
                break;
            case 4:
                ((C8226) abstractC3737).getClass();
                AbstractC5803.m11157();
                break;
            default:
                super.mo8079(abstractC3737);
                break;
        }
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3746
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8080(AbstractC3737 abstractC3737) {
        int iM4636;
        int iM46362;
        int i = this.f24490;
        Object obj = this.f24491;
        switch (i) {
            case 0:
                AbstractC3056.m6668(-3937677032679540135L);
                ((C8239) abstractC3737).getClass();
                C8703 c8703 = (C8703) obj;
                c8703.getClass();
                DialogXRecycleView dialogXRecycleView = c8703.f24542;
                AbstractC2519 layoutManager = dialogXRecycleView != null ? dialogXRecycleView.getLayoutManager() : null;
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager != null && (iM46362 = gridLayoutManager.m4636()) >= 0) {
                    View viewM4988 = gridLayoutManager.m4988(0);
                    C8738 c8738 = C8738.f24639;
                    String strM6668 = AbstractC3056.m6668(-3937831501178340775L);
                    String strValueOf = String.valueOf(iM46362);
                    c8738.getClass();
                    C8738.m14410(strM6668, strValueOf);
                    C8738.m14410(AbstractC3056.m6668(-3937831458228667815L), String.valueOf(viewM4988 != null ? viewM4988.getTop() : 0));
                }
                CustomRecycleView customRecycleView = c8703.f24541;
                AbstractC2519 layoutManager2 = customRecycleView != null ? customRecycleView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager != null && (iM4636 = linearLayoutManager.m4636()) >= 0) {
                    View viewM49882 = linearLayoutManager.m4988(0);
                    C8738 c87382 = C8738.f24639;
                    String strM66682 = AbstractC3056.m6668(-3937831303609845159L);
                    String strValueOf2 = String.valueOf(iM4636);
                    c87382.getClass();
                    C8738.m14410(strM66682, strValueOf2);
                    C8738.m14410(AbstractC3056.m6668(-3937831243480303015L), String.valueOf(viewM49882 != null ? viewM49882.getLeft() : 0));
                }
                c8703.f24542 = null;
                c8703.f24541 = null;
                try {
                    ComponentCallbacks2C3057.m6722(AbstractC6340.f17460).m6723();
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                ((C8239) abstractC3737).getClass();
                C5979 c5979 = (C5979) ((C3004) obj).f9536;
                c5979.f16295 = true;
                AbstractC5398.m10505(c5979.f16293, null);
                break;
            case 2:
                ((C8239) abstractC3737).getClass();
                C5806 c5806 = (C5806) ((C1251) obj).f3628;
                c5806.f15926 = true;
                AbstractC5398.m10505(c5806.f15925, null);
                break;
            case 3:
                ((C8226) abstractC3737).getClass();
                C9088 c9088 = (C9088) obj;
                RunnableC0062 runnableC0062 = c9088.f25386;
                if (runnableC0062 != null) {
                    c9088.f25385.removeCallbacks(runnableC0062);
                }
                c9088.f25386 = null;
                C5805 c5805 = c9088.f25380;
                c5805.f15922 = true;
                AbstractC5398.m10505(c5805.f15921, null);
                break;
            default:
                ((C8226) abstractC3737).getClass();
                C5804 c5804 = (C5804) ((C3004) obj).f9536;
                c5804.f15919 = true;
                AbstractC5398.m10505(c5804.f15917, null);
                break;
        }
    }
}
