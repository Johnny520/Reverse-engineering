package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子世兰楪哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5873 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String f16045 = "lin.xposed.hook.item.browser.EXTRA_BYPASS_FQB_HOOK";

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final String f16046 = "^(https?|ftp)://[^\\s/$.?#].[^\\s]*$|^www\\.[^.]+\\.[^.]+$|^[^.]+\\.[^.]+$";

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        C5811 c5811 = new C5811(this, 5);
        XposedBridge.hookAllMethods(classLoader.loadClass("android.content.ContextWrapper"), "startActivity", c5811);
        XposedBridge.hookAllMethods(classLoader.loadClass("android.content.ContextWrapper"), "startActivityForResult", c5811);
        XposedBridge.hookAllMethods(classLoader.loadClass("android.app.Activity"), "startActivity", c5811);
        XposedBridge.hookAllMethods(classLoader.loadClass("android.app.Activity"), "startActivityForResult", c5811);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u81f4\u656c \u7ecf\u5178\u6a21\u5757:\u53bb\u4f60\u5927\u7237\u7684QQ\u6d4f\u89c8\u5668";
    }
}
