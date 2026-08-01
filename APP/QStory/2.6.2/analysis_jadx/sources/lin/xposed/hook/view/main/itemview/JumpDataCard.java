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
        AbstractC3056.m6668(-3937616005489231271L);
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(JumpDataCard jumpDataCard, View view) {
        C8227 c8227 = new C8227();
        c8227.f22615 = AbstractC3056.m6668(-3937686623341512103L);
        c8227.mo13704();
        c8227.f22627 = AbstractC3056.m6668(-3937686202434717095L);
        c8227.mo13704();
        c8227.f22630 = AbstractC3056.m6668(-3937581662930732455L);
        c8227.mo13704();
        c8227.f22626 = AbstractC3056.m6668(-3937640074485958055L);
        c8227.mo13704();
        c8227.f22624 = new C5563(jumpDataCard, view, 1);
        c8227.m13714();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOnClick$lambda$0$0(JumpDataCard jumpDataCard, View view, C8227 c8227, View view2, String str) {
        str.getClass();
        String string = AbstractC5143.m10150(str).toString();
        if (string.length() == 0) {
            AbstractC6154.m11561(AbstractC3056.m6668(-3937686172369946023L));
            return false;
        }
        Context context = view.getContext();
        AbstractC3056.m6668(-3937689067177903527L);
        context.getClass();
        jumpDataCard.showTypeMenu(context, string);
        return false;
    }

    private final void jumpGroup(Context context, String uin) {
        try {
            Intent intent = new Intent(AbstractC3056.m6668(-3937572549010130343L), Uri.parse(AbstractC3056.m6668(-3937587375237236135L) + uin + AbstractC3056.m6668(-3937587117539198375L)));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void jumpPerson(Context context, String uin) {
        try {
            Intent intent = new Intent(AbstractC3056.m6668(-3937572549010130343L), Uri.parse(AbstractC3056.m6668(-3937686425773016487L) + uin + AbstractC3056.m6668(-3937686288334063015L)));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void showTypeMenu(Context context, String uin) {
        C8204 c8204M13701 = C8204.m13701();
        c8204M13701.f22615 = AbstractC3056.m6668(-3937686511672362407L);
        c8204M13701.m13710();
        c8204M13701.m13711(new String[]{AbstractC3056.m6668(-3937686546032100775L), AbstractC3056.m6668(-3937686537442166183L)});
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
        return AbstractC3056.m6668(-3937686623341512103L);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5565(this, 2);
    }
}
