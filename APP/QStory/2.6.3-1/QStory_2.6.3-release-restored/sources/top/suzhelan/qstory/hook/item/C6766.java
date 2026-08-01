package top.suzhelan.qstory.hook.item;

import androidx.compose.runtime.internal.C2080;
import com.android.p002dx.p005io.Opcodes;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import lin.xposed.hook.view.main.itemview.C6395;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p042.C7142;
import p049.AbstractC7166;
import p049.C7164;
import p050.AbstractC7176;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲兰楪;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6766 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static Object f16473;

    static {
        "114514";
        "ptt_forward";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static void m11877(String str, int i, Object obj, Object obj2, Class cls, Class cls2) {
        try {
            Object objNewInstance = cls.newInstance();
            XposedHelpers.setIntField(objNewInstance, "elementType", 4);
            XposedHelpers.setIntField(obj, "voiceType", 2);
            XposedHelpers.setIntField(obj, "voiceChangeType", 0);
            XposedHelpers.setObjectField(objNewInstance, "pttElement", obj);
            XposedHelpers.callMethod(obj2, "sendMsg", new Object[]{cls2.getConstructor(Integer.TYPE, String.class, String.class).newInstance(Integer.valueOf(i == 0 ? 1 : 2), str, ""), AbstractC7176.m12471(objNewInstance), null});
        } catch (Exception e) {
            XposedBridge.log("PttForward: 发送至 " + str + " 失败: " + e.getMessage());
        }
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        Class clsM12425 = AbstractC7166.m12425("com.tencent.mobileqq.aio.msg.AIOMsgItem");
        String[] strArr = {"com.tencent.mobileqq.aio.msglist.holder.component.ptt.AIOPttContentComponent"};
        Class clsM124252 = AbstractC7166.m12425("com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent");
        C7164 c7164M12413 = C7164.m12413(clsM124252);
        c7164M12413.f17803.f3962 = clsM12425;
        Method methodM12414 = c7164M12413.m12414();
        C7164 c7164M124132 = C7164.m12413(clsM124252);
        c7164M124132.f17803.f3962 = List.class;
        Method methodM124142 = c7164M124132.m12414();
        C7164 c7164M12412 = C7164.m12412(strArr[0]);
        String name = methodM124142.getName();
        C2080 c2080 = c7164M12412.f17803;
        c2080.f3963 = name;
        c2080.f3962 = List.class;
        XposedBridge.hookMethod(c7164M12412.m12414(), new C7142(this, new C6395(methodM12414, clsM12425, this, 3)));
        try {
            Class clsM124253 = AbstractC7166.m12425("com.tencent.mobileqq.forward.ForwardBaseOption");
            Field declaredField = clsM124253.getDeclaredField("mExtraData");
            declaredField.setAccessible(true);
            String strM14531 = "isNeedShowToast";
            Class cls = Integer.TYPE;
            Method declaredMethod = clsM124253.getDeclaredMethod(strM14531, cls, String.class, cls);
            declaredMethod.setAccessible(true);
            XposedBridge.hookMethod(declaredMethod, new C6748(declaredField, this, classLoader));
        } catch (Exception e) {
            XposedBridge.log("PttForward: 转发逻辑 Hook 失败: " + e.getMessage());
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "长按语音消息显示转发按钮";
    }
}
