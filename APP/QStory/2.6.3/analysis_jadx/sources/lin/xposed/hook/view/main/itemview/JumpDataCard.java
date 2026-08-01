package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import net.bytebuddy.description.method.MethodDescription;
import p010.AbstractC6185;
import p257.C8205;
import p257.C8228;
import p287.AbstractC8405;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Llin/xposed/hook/view/main/itemview/JumpDataCard;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "Landroid/content/Context;", "context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "", "uin", "Lkotlin/飘花落叶言子楪兰苏哲世;", "showTypeMenu", "(Landroid/content/Context;Ljava/lang/String;)V", "jumpGroup", "jumpPerson", "getLeftText", "()Ljava/lang/String;", "Landroid/view/View$OnClickListener;", "getOnClick", "()Landroid/view/View$OnClickListener;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class JumpDataCard extends OtherViewItemInfo {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JumpDataCard(Context context) {
        super(context);
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(JumpDataCard jumpDataCard, View view) {
        C8228 c8228 = new C8228();
        c8228.f22614 = AbstractC8405.m13972(1345);
        c8228.mo13721();
        c8228.f22626 = AbstractC8405.m13972(1352);
        c8228.mo13721();
        c8228.f22629 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜喵喵喵喵~呜呜喵喵呜喵喵呜~呜喵喵喵喵喵喵呜~呜呜呜呜喵喵呜喵~呜呜喵喵喵喵喵呜");
        c8228.mo13721();
        c8228.f22625 = AbstractC8405.m13973("呜喵喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜呜喵呜喵呜喵喵~呜喵喵喵呜呜喵呜~呜呜喵喵呜喵呜呜~呜呜呜呜喵呜呜喵");
        c8228.mo13721();
        c8228.f22623 = new C5564(jumpDataCard, view, 1);
        c8228.m13731();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOnClick$lambda$0$0(JumpDataCard jumpDataCard, View view, C8228 c8228, View view2, String str) {
        str.getClass();
        String string = AbstractC5144.m10155(str).toString();
        if (string.length() == 0) {
            AbstractC6185.m11592(AbstractC8405.m13972(1351));
            return false;
        }
        Context context = view.getContext();
        AbstractC8405.m13972(1309);
        context.getClass();
        jumpDataCard.showTypeMenu(context, string);
        return false;
    }

    private final void jumpGroup(Context context, String uin) {
        try {
            Intent intent = new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(227) + uin + AbstractC8405.m13972(228)));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void jumpPerson(Context context, String uin) {
        try {
            Intent intent = new Intent(AbstractC8405.m13972(Opcodes.ADD_DOUBLE_2ADDR), Uri.parse(AbstractC8405.m13972(1349) + uin + AbstractC8405.m13972(1350)));
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception unused) {
        }
    }

    private final void showTypeMenu(Context context, String uin) {
        C8205 c8205M13718 = C8205.m13718();
        c8205M13718.f22614 = AbstractC8405.m13972(1346);
        c8205M13718.m13727();
        c8205M13718.m13728(new String[]{AbstractC8405.m13972(1347), AbstractC8405.m13972(1348)});
        c8205M13718.f22608 = new C5565(this, context, uin);
        c8205M13718.m13731();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showTypeMenu$lambda$0(JumpDataCard jumpDataCard, Context context, String str, C8205 c8205, CharSequence charSequence, int i) {
        if (i == 0) {
            jumpDataCard.jumpPerson(context, str);
            return false;
        }
        jumpDataCard.jumpGroup(context, str);
        return false;
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC8405.m13972(1345);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5566(this, 2);
    }
}
