package top.suzhelan.qstory.hook.item;

import androidx.compose.runtime.internal.C2080;
import de.robv.android.xposed.XposedBridge;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p049.AbstractC7166;
import p049.C7164;
import p052.AbstractC7187;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪哲兰世;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6787 extends AbstractC7140 {
    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        "classLoader";
        classLoader.getClass();
        if (AbstractC7187.f17853 < 11820) {
            return;
        }
        try {
            Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.ai.avatar.api.impl.AIAvatarSwitchApiImpl");
            try {
                C7164 c7164M12413 = C7164.m12413(clsM12425);
                String strM14531 = "isQQShowEnableForAIO";
                C2080 c2080 = c7164M12413.f17803;
                c2080.f3963 = strM14531;
                c2080.f3964 = new Class[]{cls2, Integer.TYPE, cls2};
                c2080.f3962 = cls;
                XposedBridge.hookMethod(c7164M12413.m12414(), new C6745(17));
            } catch (Exception unused) {
            }
            C7164 c7164M124132 = C7164.m12413(clsM12425);
            String strM145312 = "isQQShowEnable";
            C2080 c20802 = c7164M124132.f17803;
            c20802.f3963 = strM145312;
            c20802.f3964 = new Class[]{cls2, String.class};
            c20802.f3962 = cls;
            XposedBridge.hookMethod(c7164M124132.m12414(), new C6745(18));
        } catch (Exception unused2) {
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "屏蔽聊天界面的超级QQ秀 此功能适用于9.2.25+ 重启生效";
    }
}
