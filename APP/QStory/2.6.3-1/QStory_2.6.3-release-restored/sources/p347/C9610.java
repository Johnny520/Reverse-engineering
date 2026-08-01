package p347;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import de.robv.android.xposed.XposedHelpers;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7143;
import p054.C7202;

/* JADX INFO: renamed from: 飘花落叶言苏世子兰哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C9610 extends AbstractC7143 {
    @Override // p042.AbstractC7143
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        "classLoader";
        classLoader.getClass();
        Class<?> clsLoadClass = classLoader.loadClass("com.tencent.widget.PopupMenuDialog");
        String strM14531 = "createAndAttachItemsView";
        C7202 c7202 = new C7202(12);
        Class cls = Boolean.TYPE;
        XposedHelpers.findAndHookMethod(clsLoadClass, strM14531, new Object[]{Activity.class, List.class, LinearLayout.class, cls, c7202});
        XposedHelpers.findAndHookMethod(clsLoadClass, "onClick", new Object[]{View.class, new C7202(13)});
        XposedHelpers.findAndHookMethod(clsLoadClass, "createAndAttachItemsView", new Object[]{Activity.class, List.class, LinearLayout.class, cls, new C7202(25, 14)});
        XposedHelpers.findAndHookMethod(clsLoadClass, "onClick", new Object[]{View.class, new C7202(25, 15)});
    }
}
