package lin.xposed.hook.view.main.itemview.base;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import lin.xposed.hook.view.main.itemview.AddQQGroup;
import lin.xposed.hook.view.main.itemview.AddTelegramChannel;
import lin.xposed.hook.view.main.itemview.AddTelegramGroup;
import lin.xposed.hook.view.main.itemview.CheckCommonGroup;
import lin.xposed.hook.view.main.itemview.ClearLoginInformation;
import lin.xposed.hook.view.main.itemview.DeleteMethodInfo;
import lin.xposed.hook.view.main.itemview.EndAllActivity;
import lin.xposed.hook.view.main.itemview.JumpDataCard;
import lin.xposed.hook.view.main.itemview.ManageFriends;
import lin.xposed.hook.view.main.itemview.ManageTroops;
import lin.xposed.hook.view.main.itemview.NoticeLog;
import lin.xposed.hook.view.main.itemview.Update;
import lin.xposed.hook.view.main.itemview.UpdateLog;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class OtherViewItemInfo {
    public static final List<Class<? extends OtherViewItemInfo>> OTHER_VIEW_ITEM_INFO_LIST;

    static {
        ArrayList arrayList = new ArrayList();
        OTHER_VIEW_ITEM_INFO_LIST = arrayList;
        arrayList.add(ManageFriends.class);
        arrayList.add(ManageTroops.class);
        arrayList.add(JumpDataCard.class);
        arrayList.add(NoticeLog.class);
        arrayList.add(UpdateLog.class);
        arrayList.add(AddQQGroup.class);
        arrayList.add(AddTelegramChannel.class);
        arrayList.add(AddTelegramGroup.class);
        arrayList.add(ClearLoginInformation.class);
        arrayList.add(EndAllActivity.class);
        arrayList.add(CheckCommonGroup.class);
        arrayList.add(Update.class);
        arrayList.add(DeleteMethodInfo.class);
    }

    public OtherViewItemInfo(Context context) {
    }

    public abstract String getLeftText();

    public abstract View.OnClickListener getOnClick();

    public String getTips() {
        return null;
    }
}
