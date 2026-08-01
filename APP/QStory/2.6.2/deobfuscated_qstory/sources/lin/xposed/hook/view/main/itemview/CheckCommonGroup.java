package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import net.bytebuddy.description.method.MethodDescription;
import p010.AbstractC6154;
import p257.C8227;
import p392.AbstractC9121;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llin/xposed/hook/view/main/itemview/CheckCommonGroup;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "Landroid/content/Context;", "context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "", "uin", "Lkotlin/飘花落叶言子楪兰苏哲世;", "openCommonGroupPage", "(Landroid/content/Context;J)V", "", "getLeftText", "()Ljava/lang/String;", "Landroid/view/View$OnClickListener;", "getOnClick", "()Landroid/view/View$OnClickListener;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class CheckCommonGroup extends OtherViewItemInfo {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckCommonGroup(Context context) {
        super(context);
        "context";
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(CheckCommonGroup checkCommonGroup, View view) {
        C8227 c8227 = new C8227();
        c8227.f22615 = "\u67e5\u627e\u5171\u540c\u7fa4";
        c8227.mo13704();
        c8227.f22627 = "\u8bf7\u8f93\u5165\u5bf9\u65b9QQ\u53f7";
        c8227.mo13704();
        c8227.f22630 = "\u53d6\u6d88";
        c8227.mo13704();
        c8227.f22626 = "\u67e5\u627e";
        c8227.mo13704();
        c8227.f22624 = new C5563(checkCommonGroup, view, 0);
        c8227.m13714();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOnClick$lambda$0$0(CheckCommonGroup checkCommonGroup, View view, C8227 c8227, View view2, String str) {
        str.getClass();
        String string = AbstractC5143.m10150(str).toString();
        if (string.length() == 0) {
            AbstractC6154.m11561("\u8bf7\u8f93\u5165QQ\u53f7");
            return false;
        }
        Long lM10135 = AbstractC5138.m10135(string);
        if (lM10135 == null || lM10135.longValue() < 10000) {
            AbstractC6154.m11561("\u8bf7\u8f93\u5165\u6709\u6548\u7684QQ\u53f7");
            return false;
        }
        Context context = view.getContext();
        "getContext(...)";
        context.getClass();
        checkCommonGroup.openCommonGroupPage(context, lM10135.longValue());
        return true;
    }

    private final void openCommonGroupPage(Context context, long uin) {
        try {
            Intent intent = new Intent(context, (Class<?>) AbstractC9121.f25497.loadClass("com.tencent.mobileqq.activity.QQBrowserDelegationActivity"));
            intent.putExtra("fling_action_key", 2);
            intent.putExtra("fling_code_key", context.hashCode());
            intent.putExtra("useDefBackText", true);
            intent.putExtra("param_force_internal_browser", true);
            intent.putExtra("url", "https://ti.qq.com/friends/recall?uin=" + uin);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            AbstractC6154.m11561("\u6253\u5f00\u5931\u8d25: " + e.getMessage());
        }
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "\u67e5\u627e\u5171\u540c\u7fa4";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5565(this, 1);
    }
}
