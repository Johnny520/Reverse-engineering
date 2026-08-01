package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import net.bytebuddy.description.method.MethodDescription;
import p144.C7547;
import p257.C8198;
import p287.AbstractC8405;
import p352.RunnableC8867;
import p355.C8890;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Llin/xposed/hook/view/main/itemview/ManageFriends;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLeftText", "", "getOnClick", "Landroid/view/View$OnClickListener;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class ManageFriends extends OtherViewItemInfo {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManageFriends(Context context) {
        super(context);
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(View view) {
        C8890 c8890 = new C8890();
        C8198 c8198M13707 = C8198.m13707(AbstractC8405.m13972(3100));
        c8198M13707.f22575 = new C7547(21);
        c8198M13707.m13711();
        new Thread(new RunnableC8867(c8890, 1)).start();
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC8405.m13972(1353);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5533(4);
    }
}
