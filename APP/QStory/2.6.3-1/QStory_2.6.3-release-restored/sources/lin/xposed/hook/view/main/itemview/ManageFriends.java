package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import net.bytebuddy.description.method.MethodDescription;
import p160.C8376;
import p273.C9027;
import p368.RunnableC9696;
import p371.C9719;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m151d2 = {"Llin/xposed/hook/view/main/itemview/ManageFriends;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLeftText", "", "getOnClick", "Landroid/view/View$OnClickListener;", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class ManageFriends extends OtherViewItemInfo {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageFriends(Context context) {
        super(context);
        "context";
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(View view) {
        C9719 c9719 = new C9719();
        C9027 c9027M14266 = C9027.m14266("正在加载好友列表...");
        c9027M14266.f22920 = new C8376(21);
        c9027M14266.m14270();
        new Thread(new RunnableC9696(c9719, 1)).start();
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "批量管理好友";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC6365(4);
    }
}
