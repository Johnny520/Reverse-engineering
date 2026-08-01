package lin.xposed.hook.view.main.itemview;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.RunnableC1898;
import com.bumptech.glide.AbstractC3056;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo;
import net.bytebuddy.description.method.MethodDescription;
import p010.AbstractC6154;
import p035.AbstractC6340;
import p075.C6960;
import p175.AbstractC7738;
import p335.AbstractC8804;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Llin/xposed/hook/view/main/itemview/ClearLoginInformation;", "Llin/xposed/hook/view/main/itemview/base/OtherViewItemInfo;", "context", "Landroid/content/Context;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Landroid/content/Context;)V", "getLeftText", "", "getOnClick", "Landroid/view/View$OnClickListener;", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class ClearLoginInformation extends OtherViewItemInfo {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClearLoginInformation(Context context) {
        super(context);
        AbstractC3056.m6668(-3937616005489231271L);
        context.getClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0(View view) {
        AbstractC6154.m11561(AbstractC3056.m6668(-3937686679176086951L));
        ExecutorService executorService = AbstractC8804.f24777;
        AbstractC8804.f24777.execute(new RunnableC1898(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getOnClick$lambda$0$0() {
        try {
            Update.detectUpdates();
            C6960.m12246();
        } catch (Exception e) {
            e.printStackTrace();
        }
        AbstractC7738.m13038(AbstractC6340.f17460);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public String getLeftText() {
        return AbstractC3056.m6668(-3937686649111315879L);
    }

    @Override // lin.xposed.hook.view.main.itemview.base.OtherViewItemInfo
    public View.OnClickListener getOnClick() {
        return new ViewOnClickListenerC5532(3);
    }
}
