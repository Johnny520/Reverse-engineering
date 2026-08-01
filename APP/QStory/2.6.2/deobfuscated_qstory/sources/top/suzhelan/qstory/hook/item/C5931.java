package top.suzhelan.qstory.hook.item;

import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import lin.xposed.hook.view.main.itemview.C5564;
import net.bytebuddy.description.method.MethodDescription;
import p007.AbstractC6136;
import p026.AbstractC6293;
import p026.C6295;
import p032.AbstractC6318;
import p032.C6316;
import p253.AbstractC8189;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5931 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Object f16124;

    static {
        "114514";
        "ptt_forward";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m11261(String str, int i, Object obj, Object obj2, Class cls, Class cls2) {
        try {
            Object objNewInstance = cls.newInstance();
            XposedHelpers.setIntField(objNewInstance, "elementType", 4);
            XposedHelpers.setIntField(obj, "voiceType", 2);
            XposedHelpers.setIntField(obj, "voiceChangeType", 0);
            XposedHelpers.setObjectField(objNewInstance, "pttElement", obj);
            XposedHelpers.callMethod(obj2, "sendMsg", new Object[]{cls2.getConstructor(Integer.TYPE, String.class, String.class).newInstance(Integer.valueOf(i == 0 ? 1 : 2), str, ""), AbstractC8189.m13670(objNewInstance), null});
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            AbstractC6136.m11544(-3937771290031818151L, sb, str);
            sb.append(" \u5931\u8d25: ");
            sb.append(e.getMessage());
            XposedBridge.log(sb.toString());
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        Class clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msg.AIOMsgItem");
        String[] strArr = {"com.tencent.mobileqq.aio.msglist.holder.component.ptt.AIOPttContentComponent"};
        Class clsM118382 = AbstractC6318.m11838("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent");
        C6316 c6316M11826 = C6316.m11826(clsM118382);
        c6316M11826.f17409.f3616 = clsM11838;
        Method methodM11827 = c6316M11826.m11827();
        C6316 c6316M118262 = C6316.m11826(clsM118382);
        c6316M118262.f17409.f3616 = List.class;
        Method methodM118272 = c6316M118262.m11827();
        C6316 c6316M11825 = C6316.m11825(strArr[0]);
        String name = methodM118272.getName();
        C1245 c1245 = c6316M11825.f17409;
        c1245.f3617 = name;
        c1245.f3616 = List.class;
        XposedBridge.hookMethod(c6316M11825.m11827(), new C6295(this, new C5564(methodM11827, clsM11838, this, 3)));
        try {
            Class clsM118383 = AbstractC6318.m11838("com.tencent.mobileqq.forward.ForwardBaseOption");
            Field declaredField = clsM118383.getDeclaredField("mExtraData");
            declaredField.setAccessible(true);
            String strM6668 = "isNeedShowToast";
            Class cls = Integer.TYPE;
            Method declaredMethod = clsM118383.getDeclaredMethod(strM6668, cls, String.class, cls);
            declaredMethod.setAccessible(true);
            XposedBridge.hookMethod(declaredMethod, new C5912(declaredField, this, classLoader));
        } catch (Exception e) {
            XposedBridge.log("PttForward: \u8f6c\u53d1\u903b\u8f91 Hook \u5931\u8d25: " + e.getMessage());
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u957f\u6309\u8bed\u97f3\u6d88\u606f\u663e\u793a\u8f6c\u53d1\u6309\u94ae";
    }
}
