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
import p303.AbstractC9234;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m151d2 = {"Llin/xposed/hook/view/main/itemview/JumpDataCard;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "Landroid/content/Context;", "context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "", "uin", "Lkotlin/飘花落叶言子楪兰苏哲世;", "showTypeMenu", "(Landroid/content/Context;Ljava/lang/String;)V", "jumpGroup", "jumpPerson", "getLeftText", "()Ljava/lang/String;", "Landroid/view/View$OnClickListener;", "getOnClick", "()Landroid/view/View$OnClickListener;", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class JumpDataCard extends OtherViewItemInfo {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumpDataCard(Context context) {
        super(context);
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(JumpDataCard jumpDataCard, View view) {
        C9057 c9057 = new C9057();
        c9057.f22959 = AbstractC9234.m14531(1345);
        c9057.mo14280();
        c9057.f22971 = AbstractC9234.m14531(1352);
        c9057.mo14280();
        c9057.f22974 = AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜");
        c9057.mo14280();
        c9057.f22970 = AbstractC9234.m14532("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵");
        c9057.mo14280();
        c9057.f22968 = new C6394(jumpDataCard, view, 1);
        c9057.m14290();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOnClick$lambda$0$0(JumpDataCard jumpDataCard, View view, C9057 c9057, View view2, String str) {
        str.getClass();
        String string = AbstractC5976.m10714(str).toString();
        if (string.length() == 0) {
            AbstractC7014.m12151(AbstractC9234.m14531(1351));
            return false;
        }
        Context context = view.getContext();
        AbstractC9234.m14531(1309);
        context.getClass();
        jumpDataCard.showTypeMenu(context, string);
        return false;
    }

    private final void jumpGroup(Context context, String uin) {
        try {
            Intent intent = new Intent(AbstractC9234.m14531(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC9234.m14531(227) + uin + AbstractC9234.m14531(228)));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void jumpPerson(Context context, String uin) {
        try {
            Intent intent = new Intent(AbstractC9234.m14531(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC9234.m14531(1349) + uin + AbstractC9234.m14531(1350)));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void showTypeMenu(Context context, String uin) {
        C9034 c9034M14277 = C9034.m14277();
        c9034M14277.f22959 = AbstractC9234.m14531(1346);
        c9034M14277.m14286();
        c9034M14277.m14287(new String[]{AbstractC9234.m14531(1347), AbstractC9234.m14531(1348)});
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
        return AbstractC9234.m14531(1345);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC6396(this, 2);
    }
}
