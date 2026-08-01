package top.suzhelan.qstory.hook.item;

import android.content.Context;
import android.widget.TextView;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪兰世苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5900 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "loader";
        classLoader.getClass();
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists("com.tencent.mobileqq.filemanager.api.impl.QFileUtilsImpl", classLoader);
            if (clsFindClassIfExists == null) {
                return;
            }
            XposedHelpers.findAndHookMethod(clsFindClassIfExists, "setFileDescription", new Object[]{Context.class, TextView.class, String.class, String.class, String.class, String.class, String.class, Boolean.TYPE, Object.class, new C5811(this, 11)});
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u5728\u7fa4\u6587\u4ef6\u4e0b\u65b9\u663e\u793a\u6587\u4ef6\u4e0b\u8f7d\u6b21\u6570 \u4ec5\u652f\u6301 9.1.90 \u4ee5\u4e0b\u7248\u672c";
    }
}
