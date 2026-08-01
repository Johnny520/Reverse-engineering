package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.view.View;
import androidx.compose.p001ui.platform.RunnableC2733;
import com.bumptech.glide.AbstractC3887;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC7014;
import p052.AbstractC7187;
import p091.C7790;
import p351.AbstractC9618;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m151d2 = {"Llin/xposed/hook/view/main/itemview/ClearLoginInformation;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLeftText", "", "getOnClick", "Landroid/view/View$OnClickListener;", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class ClearLoginInformation extends OtherViewItemInfo {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearLoginInformation(Context context) {
        super(context);
        "context";
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(View view) {
        AbstractC7014.m12151("正在刷新.... 可能会自动重启QQ");
        ExecutorService executorService = AbstractC9618.f25101;
        AbstractC9618.f25101.execute(new RunnableC2733(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0$0() {
        try {
            Update.detectUpdates();
            C7790.m12833();
        } catch (Exception e) {
            e.printStackTrace();
        }
        AbstractC3887.m7199(AbstractC7187.f17852);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "刷新登录信息";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC6365(3);
    }
}
