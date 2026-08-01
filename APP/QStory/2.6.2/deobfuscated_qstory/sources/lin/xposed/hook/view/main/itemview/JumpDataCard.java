package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.AbstractC3056;
import kotlin.Metadata;
import kotlin.text.AbstractC5143;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import net.bytebuddy.description.method.MethodDescription;
import p010.AbstractC6154;
import p257.C8204;
import p257.C8227;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Llin/xposed/hook/view/main/itemview/JumpDataCard;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "Landroid/content/Context;", "context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "", "uin", "Lkotlin/飘花落叶言子楪兰苏哲世;", "showTypeMenu", "(Landroid/content/Context;Ljava/lang/String;)V", "jumpGroup", "jumpPerson", "getLeftText", "()Ljava/lang/String;", "Landroid/view/View$OnClickListener;", "getOnClick", "()Landroid/view/View$OnClickListener;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
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
        C8227 c8227 = new C8227();
        c8227.f22615 = "\u8df3\u8f6c\u8d44\u6599\u5361";
        c8227.mo13704();
        c8227.f22627 = "\u8bf7\u8f93\u5165QQ\u53f7\u6216\u7fa4\u53f7";
        c8227.mo13704();
        c8227.f22630 = "\u5173\u95ed";
        c8227.mo13704();
        c8227.f22626 = "\u786e\u5b9a";
        c8227.mo13704();
        c8227.f22624 = new C5563(jumpDataCard, view, 1);
        c8227.m13714();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOnClick$lambda$0$0(JumpDataCard jumpDataCard, View view, C8227 c8227, View view2, String str) {
        str.getClass();
        String string = AbstractC5143.m10150(str).toString();
        if (string.length() == 0) {
            AbstractC6154.m11561("\u8f93\u5165\u4e0d\u80fd\u4e3a\u7a7a");
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
        C8204 c8204M13701 = C8204.m13701();
        c8204M13701.f22615 = "\u9009\u62e9\u8d44\u6599\u5361\u7c7b\u578b";
        c8204M13701.m13710();
        c8204M13701.m13711(new String[]{"\u4e2a\u4eba\u8d44\u6599\u5361", "\u7fa4\u804a\u8d44\u6599\u5361"});
        c8204M13701.f22609 = new C5564(this, context, uin);
        c8204M13701.m13714();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTypeMenu$lambda$0(JumpDataCard jumpDataCard, Context context, String str, C8204 c8204, CharSequence charSequence, int i) {
        if (i == 0) {
            jumpDataCard.jumpPerson(context, str);
            return false;
        }
        jumpDataCard.jumpGroup(context, str);
        return false;
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return "\u8df3\u8f6c\u8d44\u6599\u5361";
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5565(this, 2);
    }
}
