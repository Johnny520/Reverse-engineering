package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import kotlin.Metadata;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC7014;
import p273.C9057;
import p303.AbstractC9234;
import p405.AbstractC9919;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m151d2 = {"Llin/xposed/hook/view/main/itemview/CheckCommonGroup;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "Landroid/content/Context;", "context", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "", "uin", "Lkotlin/飘花落叶言子楪兰苏哲世;", "openCommonGroupPage", "(Landroid/content/Context;J)V", "", "getLeftText", "()Ljava/lang/String;", "Landroid/view/View$OnClickListener;", "getOnClick", "()Landroid/view/View$OnClickListener;", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class CheckCommonGroup extends OtherViewItemInfo {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckCommonGroup(Context context) {
        super(context);
        AbstractC9234.m14532("喵喵喵呜喵喵喵喵~喵喵喵呜呜喵呜喵~喵喵喵呜喵呜喵喵~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜喵呜喵喵~喵喵喵呜喵呜喵呜");
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(CheckCommonGroup checkCommonGroup, View view) {
        C9057 c9057 = new C9057();
        c9057.f22959 = AbstractC9234.m14531(1332);
        c9057.mo14280();
        c9057.f22971 = AbstractC9234.m14531(1342);
        c9057.mo14280();
        c9057.f22974 = AbstractC9234.m14532("呜喵喵呜喵呜呜喵~呜呜呜呜呜喵呜喵~呜呜呜喵呜呜喵喵~呜喵喵喵呜呜呜喵~呜呜喵呜喵喵呜呜~呜呜呜喵喵呜喵喵");
        c9057.mo14280();
        c9057.f22970 = AbstractC9234.m14532("呜喵喵呜喵呜喵呜~呜呜呜喵呜喵呜喵~呜呜喵呜呜呜呜呜~呜喵喵喵呜呜呜喵~呜呜呜喵呜呜喵喵~呜呜喵呜喵喵呜喵");
        c9057.mo14280();
        c9057.f22968 = new C6394(checkCommonGroup, view, 0);
        c9057.m14290();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean getOnClick$lambda$0$0(CheckCommonGroup checkCommonGroup, View view, C9057 c9057, View view2, String str) {
        str.getClass();
        String string = AbstractC5976.m10714(str).toString();
        if (string.length() == 0) {
            AbstractC7014.m12151(AbstractC9234.m14531(1340));
            return false;
        }
        Long lM10697 = AbstractC5971.m10697(string);
        if (lM10697 == null || lM10697.longValue() < 10000) {
            AbstractC7014.m12151(AbstractC9234.m14531(1341));
            return false;
        }
        Context context = view.getContext();
        AbstractC9234.m14531(1309);
        context.getClass();
        checkCommonGroup.openCommonGroupPage(context, lM10697.longValue());
        return true;
    }

    private final void openCommonGroupPage(Context context, long uin) {
        try {
            Intent intent = new Intent(context, (Class<?>) AbstractC9919.f25822.loadClass(AbstractC9234.m14531(1333)));
            intent.putExtra(AbstractC9234.m14531(1334), 2);
            intent.putExtra(AbstractC9234.m14531(1335), context.hashCode());
            intent.putExtra(AbstractC9234.m14531(1336), true);
            intent.putExtra(AbstractC9234.m14531(1337), true);
            intent.putExtra(AbstractC9234.m14532("喵喵喵喵喵呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜喵"), AbstractC9234.m14531(1338) + uin);
            intent.addFlags(268435456);
            context.startActivity(intent);
        } catch (Exception e) {
            AbstractC7014.m12151(AbstractC9234.m14531(1339) + e.getMessage());
        }
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC9234.m14531(1332);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC6396(this, 1);
    }
}
