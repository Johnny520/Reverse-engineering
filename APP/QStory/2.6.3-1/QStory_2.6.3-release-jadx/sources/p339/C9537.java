package p339;

import android.view.View;
import androidx.appcompat.app.RunnableC0909;
import androidx.compose.runtime.internal.C2086;
import androidx.recyclerview.widget.AbstractC3352;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.ComponentCallbacks2C3890;
import com.bumptech.glide.load.engine.C3837;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.AbstractC4579;
import kotlinx.coroutines.AbstractC6231;
import p052.AbstractC7187;
import p273.C9056;
import p273.C9069;
import p303.AbstractC9234;
import p337.C9517;
import p402.C9904;
import top.suzhelan.plugin.sdk.online.manager.AbstractC6634;
import top.suzhelan.plugin.sdk.online.presenter.C6635;
import top.suzhelan.plugin.sdk.online.presenter.C6636;
import top.suzhelan.plugin.sdk.online.presenter.C6637;
import top.suzhelan.qstory.p015ui.views.CustomRecycleView;
import top.suzhelan.qstory.p015ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.presenter.C6815;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9537 extends AbstractC4579 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f24882;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f24883;

    public /* synthetic */ C9537(Object obj, int i) {
        this.f24882 = i;
        this.f24883 = obj;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4579
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo8625(AbstractC4570 abstractC4570) {
        switch (this.f24882) {
            case 0:
                AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                ((C9069) abstractC4570).getClass();
                ((C9555) this.f24883).getClass();
                break;
            case 4:
                ((C9056) abstractC4570).getClass();
                AbstractC6634.m11773();
                break;
            default:
                super.mo8625(abstractC4570);
                break;
        }
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC4579
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8626(AbstractC4570 abstractC4570) {
        int iM5206;
        int iM52062;
        int i = this.f24882;
        Object obj = this.f24883;
        switch (i) {
            case 0:
                AbstractC9234.m14532("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                ((C9069) abstractC4570).getClass();
                C9555 c9555 = (C9555) obj;
                c9555.getClass();
                DialogXRecycleView dialogXRecycleView = c9555.f24937;
                AbstractC3352 layoutManager = dialogXRecycleView != null ? dialogXRecycleView.getLayoutManager() : null;
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager != null && (iM52062 = gridLayoutManager.m5206()) >= 0) {
                    View viewM5558 = gridLayoutManager.m5558(0);
                    C9517 c9517 = C9517.f24851;
                    String strM14531 = AbstractC9234.m14531(2722);
                    String strValueOf = String.valueOf(iM52062);
                    c9517.getClass();
                    C9517.m14974(strM14531, strValueOf);
                    C9517.m14974(AbstractC9234.m14531(2723), String.valueOf(viewM5558 != null ? viewM5558.getTop() : 0));
                }
                CustomRecycleView customRecycleView = c9555.f24936;
                AbstractC3352 layoutManager2 = customRecycleView != null ? customRecycleView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager != null && (iM5206 = linearLayoutManager.m5206()) >= 0) {
                    View viewM55582 = linearLayoutManager.m5558(0);
                    C9517 c95172 = C9517.f24851;
                    String strM145312 = AbstractC9234.m14531(2724);
                    String strValueOf2 = String.valueOf(iM5206);
                    c95172.getClass();
                    C9517.m14974(strM145312, strValueOf2);
                    C9517.m14974(AbstractC9234.m14531(2725), String.valueOf(viewM55582 != null ? viewM55582.getLeft() : 0));
                }
                c9555.f24937 = null;
                c9555.f24936 = null;
                try {
                    ComponentCallbacks2C3890.m7327(AbstractC7187.f17852).m7328();
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                ((C9069) abstractC4570).getClass();
                C6815 c6815 = (C6815) ((C3837) obj).f9883;
                c6815.f16649 = true;
                AbstractC6231.m11068(c6815.f16647, null);
                break;
            case 2:
                ((C9069) abstractC4570).getClass();
                C6637 c6637 = (C6637) ((C2086) obj).f3974;
                c6637.f16271 = true;
                AbstractC6231.m11068(c6637.f16270, null);
                break;
            case 3:
                ((C9069) abstractC4570).getClass();
                C9904 c9904 = (C9904) obj;
                RunnableC0909 runnableC0909 = c9904.f25781;
                if (runnableC0909 != null) {
                    c9904.f25780.removeCallbacks(runnableC0909);
                }
                c9904.f25781 = null;
                C6636 c6636 = c9904.f25775;
                c6636.f16267 = true;
                AbstractC6231.m11068(c6636.f16266, null);
                break;
            default:
                ((C9056) abstractC4570).getClass();
                C6635 c6635 = (C6635) ((C3837) obj).f9883;
                c6635.f16264 = true;
                AbstractC6231.m11068(c6635.f16262, null);
                break;
        }
    }
}
