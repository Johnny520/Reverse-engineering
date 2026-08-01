package p339;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6296;
import p037.C6356;

/* JADX INFO: renamed from: 飘花落叶言苏世楪子哲兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世楪子哲兰/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世哲苏兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8811 extends AbstractC6296 {
    @Override // p026.AbstractC6296
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        "classLoader";
        classLoader.getClass();
        Class<?> clsLoadClass = classLoader.loadClass("com.tencent.widget.PopupMenuDialog");
        String strM6668 = "createAndAttachItemsView";
        C6356 c6356 = new C6356(13);
        Class cls = Boolean.TYPE;
        XposedHelpers.findAndHookMethod(clsLoadClass, strM6668, new Object[]{Activity.class, List.class, LinearLayout.class, cls, c6356});
        XposedHelpers.findAndHookMethod(clsLoadClass, "onClick", new Object[]{View.class, new C6356(14)});
        int i = 25;
        XposedHelpers.findAndHookMethod(clsLoadClass, "createAndAttachItemsView", new Object[]{Activity.class, List.class, LinearLayout.class, cls, new C6356(i, 15)});
        XposedHelpers.findAndHookMethod(clsLoadClass, "onClick", new Object[]{View.class, new C6356(i, 16)});
    }
}
