package lin.xposed.hook.view.main.itemview;

import android.view.View;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;

/* JADX INFO: renamed from: lin.xposed.hook.view.main.itemview.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC6396 implements View.OnClickListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ OtherViewItemInfo f15687;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15688;

    public /* synthetic */ ViewOnClickListenerC6396(OtherViewItemInfo otherViewItemInfo, int i) {
        this.f15688 = i;
        this.f15687 = otherViewItemInfo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f15688;
        OtherViewItemInfo otherViewItemInfo = this.f15687;
        switch (i) {
            case 0:
                ((AddQQGroup) otherViewItemInfo).lambda$getOnClick$0(view);
                break;
            case 1:
                CheckCommonGroup.getOnClick$lambda$0((CheckCommonGroup) otherViewItemInfo, view);
                break;
            case 2:
                JumpDataCard.getOnClick$lambda$0((JumpDataCard) otherViewItemInfo, view);
                break;
            default:
                ((Update) otherViewItemInfo).lambda$getOnClick$4(view);
                break;
        }
    }
}
