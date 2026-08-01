package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import kotlin.Metadata;
import kotlin.text.AbstractC5139;
import kotlin.text.AbstractC5144;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import net.bytebuddy.description.method.MethodDescription;
import p010.AbstractC6185;
import p257.C8228;
import p287.AbstractC8405;
import p389.AbstractC9090;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Llin/xposed/hook/view/main/itemview/CheckCommonGroup;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "Landroid/content/Context;", "context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "", "uin", "Lkotlin/飘花落叶言子楪兰苏哲世;", "openCommonGroupPage", "(Landroid/content/Context;J)V", "", "getLeftText", "()Ljava/lang/String;", "Landroid/view/View$OnClickListener;", "getOnClick", "()Landroid/view/View$OnClickListener;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class CheckCommonGroup extends OtherViewItemInfo {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckCommonGroup(Context context) {
        super(context);
        AbstractC8405.m13973("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(CheckCommonGroup checkCommonGroup, View view) {
        C8228 c8228 = new C8228();
        c8228.f22614 = AbstractC8405.m13972(1332);
        c8228.mo13721();
        c8228.f22626 = AbstractC8405.m13972(1342);
        c8228.mo13721();
        c8228.f22629 = AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵");
        c8228.mo13721();
        c8228.f22625 = AbstractC8405.m13973("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵呜喵~呜呜喵呜呜呜呜呜~呜喵喵喵呜呜呜喵~呜呜呜喵呜呜喵喵~呜呜喵呜喵喵呜喵");
        c8228.mo13721();
        c8228.f22623 = new C5564(checkCommonGroup, view, 0);
        c8228.m13731();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOnClick$lambda$0$0(CheckCommonGroup checkCommonGroup, View view, C8228 c8228, View view2, String str) {
        str.getClass();
        String string = AbstractC5144.m10155(str).toString();
        if (string.length() == 0) {
            AbstractC6185.m11592(AbstractC8405.m13972(1340));
            return false;
        }
        Long lM10138 = AbstractC5139.m10138(string);
        if (lM10138 == null || lM10138.longValue() < 10000) {
            AbstractC6185.m11592(AbstractC8405.m13972(1341));
            return false;
        }
        Context context = view.getContext();
        AbstractC8405.m13972(1309);
        context.getClass();
        checkCommonGroup.openCommonGroupPage(context, lM10138.longValue());
        return true;
    }

    private final void openCommonGroupPage(Context context, long uin) {
        try {
            Intent intent = new Intent(context, (Class<?>) AbstractC9090.f25477.loadClass(AbstractC8405.m13972(1333)));
            intent.putExtra(AbstractC8405.m13972(1334), 2);
            intent.putExtra(AbstractC8405.m13972(1335), context.hashCode());
            intent.putExtra(AbstractC8405.m13972(1336), true);
            intent.putExtra(AbstractC8405.m13972(1337), true);
            intent.putExtra(AbstractC8405.m13973("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"), AbstractC8405.m13972(1338) + uin);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            AbstractC6185.m11592(AbstractC8405.m13972(1339) + e.getMessage());
        }
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC8405.m13972(1332);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5566(this, 1);
    }
}
