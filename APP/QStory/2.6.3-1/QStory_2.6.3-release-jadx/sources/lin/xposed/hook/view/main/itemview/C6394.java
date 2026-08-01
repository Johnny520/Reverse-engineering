package lin.xposed.hook.view.main.itemview;

import android.view.View;
import com.kongzue.dialogx.interfaces.AbstractC4570;
import com.kongzue.dialogx.interfaces.InterfaceC4576;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import p273.C9057;

/* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C6394 implements InterfaceC4576 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ OtherViewItemInfo f15680;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ View f15681;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f15682;

    public /* synthetic */ C6394(OtherViewItemInfo otherViewItemInfo, View view, int i) {
        this.f15682 = i;
        this.f15680 = otherViewItemInfo;
        this.f15681 = view;
    }

    @Override // com.kongzue.dialogx.interfaces.InterfaceC4576
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final boolean mo8621(AbstractC4570 abstractC4570, View view, String str) {
        switch (this.f15682) {
            case 0:
                return CheckCommonGroup.getOnClick$lambda$0$0((CheckCommonGroup) this.f15680, this.f15681, (C9057) abstractC4570, view, str);
            default:
                return JumpDataCard.getOnClick$lambda$0$0((JumpDataCard) this.f15680, this.f15681, (C9057) abstractC4570, view, str);
        }
    }
}
