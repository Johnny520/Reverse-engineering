package lin.xposed.hook.view.main.itemview;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3738;
import com.kongzue.dialogx.interfaces.InterfaceC3744;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p257.C8228;

/* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5564 implements InterfaceC3744 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ OtherViewItemInfo f15335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f15336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15337;

    public /* synthetic */ C5564(OtherViewItemInfo otherViewItemInfo, View view, int i) {
        this.f15337 = i;
        this.f15335 = otherViewItemInfo;
        this.f15336 = view;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3744
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8062(AbstractC3738 abstractC3738, View view, String str) {
        switch (this.f15337) {
            case 0:
                return CheckCommonGroup.getOnClick$lambda$0$0((CheckCommonGroup) this.f15335, this.f15336, (C8228) abstractC3738, view, str);
            default:
                return JumpDataCard.getOnClick$lambda$0$0((JumpDataCard) this.f15335, this.f15336, (C8228) abstractC3738, view, str);
        }
    }
}
