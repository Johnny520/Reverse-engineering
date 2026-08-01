package p323;

import android.view.View;
import androidx.appcompat.app.RunnableC0062;
import androidx.compose.runtime.internal.C1251;
import androidx.recyclerview.widget.AbstractC2519;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.bumptech.glide.ComponentCallbacks2C3058;
import com.bumptech.glide.load.engine.C3005;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.AbstractC3747;
import kotlinx.coroutines.AbstractC5399;
import p036.AbstractC6358;
import p257.C8227;
import p257.C8240;
import p287.AbstractC8405;
import p321.C8688;
import p386.C9075;
import top.suzhelan.plugin.sdk.online.manager.AbstractC5804;
import top.suzhelan.plugin.sdk.online.presenter.C5805;
import top.suzhelan.plugin.sdk.online.presenter.C5806;
import top.suzhelan.plugin.sdk.online.presenter.C5807;
import top.suzhelan.qstory.ui.views.CustomRecycleView;
import top.suzhelan.qstory.ui.views.DialogXRecycleView;
import top.suzhelan.sticker.sdk.presenter.C5985;

/* JADX INFO: renamed from: 飘花落叶言苏世兰楪哲子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8708 extends AbstractC3747 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ int f24537;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ Object f24538;

    public /* synthetic */ C8708(Object obj, int i) {
        this.f24537 = i;
        this.f24538 = obj;
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3747
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo8066(AbstractC3738 abstractC3738) {
        switch (this.f24537) {
            case 0:
                AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                ((C8240) abstractC3738).getClass();
                ((C8726) this.f24538).getClass();
                break;
            case 4:
                ((C8227) abstractC3738).getClass();
                AbstractC5804.m11214();
                break;
            default:
                super.mo8066(abstractC3738);
                break;
        }
    }

    @Override // com.kongzue.dialogx.interfaces.AbstractC3747
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo8067(AbstractC3738 abstractC3738) {
        int iM4646;
        int iM46462;
        int i = this.f24537;
        Object obj = this.f24538;
        switch (i) {
            case 0:
                AbstractC8405.m13973("喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵呜呜");
                ((C8240) abstractC3738).getClass();
                C8726 c8726 = (C8726) obj;
                c8726.getClass();
                DialogXRecycleView dialogXRecycleView = c8726.f24592;
                AbstractC2519 layoutManager = dialogXRecycleView != null ? dialogXRecycleView.getLayoutManager() : null;
                GridLayoutManager gridLayoutManager = layoutManager instanceof GridLayoutManager ? (GridLayoutManager) layoutManager : null;
                if (gridLayoutManager != null && (iM46462 = gridLayoutManager.m4646()) >= 0) {
                    View viewM4998 = gridLayoutManager.m4998(0);
                    C8688 c8688 = C8688.f24506;
                    String strM13972 = AbstractC8405.m13972(2722);
                    String strValueOf = String.valueOf(iM46462);
                    c8688.getClass();
                    C8688.m14415(strM13972, strValueOf);
                    C8688.m14415(AbstractC8405.m13972(2723), String.valueOf(viewM4998 != null ? viewM4998.getTop() : 0));
                }
                CustomRecycleView customRecycleView = c8726.f24591;
                AbstractC2519 layoutManager2 = customRecycleView != null ? customRecycleView.getLayoutManager() : null;
                LinearLayoutManager linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                if (linearLayoutManager != null && (iM4646 = linearLayoutManager.m4646()) >= 0) {
                    View viewM49982 = linearLayoutManager.m4998(0);
                    C8688 c86882 = C8688.f24506;
                    String strM139722 = AbstractC8405.m13972(2724);
                    String strValueOf2 = String.valueOf(iM4646);
                    c86882.getClass();
                    C8688.m14415(strM139722, strValueOf2);
                    C8688.m14415(AbstractC8405.m13972(2725), String.valueOf(viewM49982 != null ? viewM49982.getLeft() : 0));
                }
                c8726.f24592 = null;
                c8726.f24591 = null;
                try {
                    ComponentCallbacks2C3058.m6767(AbstractC6358.f17507).m6768();
                } catch (Exception unused) {
                    return;
                }
                break;
            case 1:
                ((C8240) abstractC3738).getClass();
                C5985 c5985 = (C5985) ((C3005) obj).f9538;
                c5985.f16304 = true;
                AbstractC5399.m10509(c5985.f16302, null);
                break;
            case 2:
                ((C8240) abstractC3738).getClass();
                C5807 c5807 = (C5807) ((C1251) obj).f3629;
                c5807.f15926 = true;
                AbstractC5399.m10509(c5807.f15925, null);
                break;
            case 3:
                ((C8240) abstractC3738).getClass();
                C9075 c9075 = (C9075) obj;
                RunnableC0062 runnableC0062 = c9075.f25436;
                if (runnableC0062 != null) {
                    c9075.f25435.removeCallbacks(runnableC0062);
                }
                c9075.f25436 = null;
                C5806 c5806 = c9075.f25430;
                c5806.f15922 = true;
                AbstractC5399.m10509(c5806.f15921, null);
                break;
            default:
                ((C8227) abstractC3738).getClass();
                C5805 c5805 = (C5805) ((C3005) obj).f9538;
                c5805.f15919 = true;
                AbstractC5399.m10509(c5805.f15917, null);
                break;
        }
    }
}
