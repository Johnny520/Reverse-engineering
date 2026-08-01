package p331;

import android.app.Activity;
import android.view.View;
import android.widget.LinearLayout;
import de.robv.android.xposed.XposedHelpers;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6314;
import p038.C6373;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世子兰哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8781 extends AbstractC6314 {
    @Override // p026.AbstractC6314
    public final boolean isLoadedByDefault() {
        return true;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(1545));
        String strM13972 = AbstractC8405.m13972(1546);
        C6373 c6373 = new C6373(12);
        Class cls = Boolean.TYPE;
        XposedHelpers.findAndHookMethod(clsLoadClass, strM13972, new Object[]{Activity.class, List.class, LinearLayout.class, cls, c6373});
        XposedHelpers.findAndHookMethod(clsLoadClass, AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜呜喵喵呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵喵呜喵呜喵"), new Object[]{View.class, new C6373(13)});
        XposedHelpers.findAndHookMethod(clsLoadClass, AbstractC8405.m13972(1546), new Object[]{Activity.class, List.class, LinearLayout.class, cls, new C6373(25, 14)});
        XposedHelpers.findAndHookMethod(clsLoadClass, AbstractC8405.m13973("喵喵喵呜呜呜喵喵~喵喵喵呜呜喵呜呜~喵喵呜呜呜喵喵呜~喵喵喵喵喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵呜呜呜呜~喵喵喵喵呜喵呜喵"), new Object[]{View.class, new C6373(25, 15)});
    }
}
