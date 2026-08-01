package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC7014;
import p273.C9034;
import p273.C9057;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m151d2 = {"Llin/xposed/hook/view/main/itemview/JumpDataCard;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "Landroid/content/Context;", "context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "", "uin", "Lkotlin/飘花落叶言子楪兰苏哲世;", "showTypeMenu", "(Landroid/content/Context;Ljava/lang/String;)V", "jumpGroup", "jumpPerson", "getLeftText", "()Ljava/lang/String;", "Landroid/view/View$OnClickListener;", "getOnClick", "()Landroid/view/View$OnClickListener;", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class JumpDataCard extends OtherViewItemInfo {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumpDataCard(Context context) {
        super(context);
        "context";
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(JumpDataCard jumpDataCard, View view) {
        C9057 c9057 = new C9057();
        c9057.f22959 = "跳转资料卡";
        c9057.mo14280();
        c9057.f22971 = "请输入QQ号或群号";
        c9057.mo14280();
        c9057.f22974 = "关闭";
        c9057.mo14280();
        c9057.f22970 = "确定";
        c9057.mo14280();
        c9057.f22968 = new C6394(jumpDataCard, view, 1);
        c9057.m14290();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOnClick$lambda$0$0(JumpDataCard jumpDataCard, View view, C9057 c9057, View view2, String str) {
        str.getClass();
        String string = AbstractC5976.m10714(str).toString();
        if (string.length() == 0) {
            AbstractC7014.m12151("输入不能为空");
            return false;
        }
        Context context = view.getContext();
        "getContext(...)";
        context.getClass();
        jumpDataCard.showTypeMenu(context, string);
        return false;
    }

    private final void jumpGroup(Context context, String uin) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mqqapi://card/show_pslcard?src_type=internal&version=1&uin=" + uin + "&card_type=group&source=qrcode"));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void jumpPerson(Context context, String uin) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("mqqapi://card/show_pslcard?uin=" + uin + "&card_type=profile&version=1"));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void showTypeMenu(Context context, String uin) {
        C9034 c9034M14277 = C9034.m14277();
        c9034M14277.f22959 = "选择资料卡类型";
        c9034M14277.m14286();
        c9034M14277.m14287(new String[]{"个人资料卡", "群聊资料卡"});
        c9034M14277.f22953 = new C6395(this, context, uin);
        c9034M14277.m14290();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTypeMenu$lambda$0(JumpDataCard jumpDataCard, Context context, String str, C9034 c9034, CharSequence charSequence, int i) {
        if (i == 0) {
            jumpDataCard.jumpPerson(context, str);
            return false;
        }
        jumpDataCard.jumpGroup(context, str);
        return false;
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "跳转资料卡";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC6396(this, 2);
    }
}
