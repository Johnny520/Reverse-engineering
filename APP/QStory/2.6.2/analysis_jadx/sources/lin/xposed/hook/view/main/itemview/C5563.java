package lin.xposed.hook.view.main.itemview;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC3737;
import com.kongzue.dialogx.interfaces.InterfaceC3743;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p257.C8227;

/* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C5563 implements InterfaceC3743 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ OtherViewItemInfo f15335;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f15336;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15337;

    public /* synthetic */ C5563(OtherViewItemInfo otherViewItemInfo, View view, int i) {
        this.f15337 = i;
        this.f15335 = otherViewItemInfo;
        this.f15336 = view;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC3743
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8075(AbstractC3737 abstractC3737, View view, String str) {
        switch (this.f15337) {
            case 0:
                return CheckCommonGroup.getOnClick$lambda$0$0((CheckCommonGroup) this.f15335, this.f15336, (C8227) abstractC3737, view, str);
            default:
                return JumpDataCard.getOnClick$lambda$0$0((JumpDataCard) this.f15335, this.f15336, (C8227) abstractC3737, view, str);
        }
    }
}
