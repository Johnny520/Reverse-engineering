package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p392.AbstractC9121;
import p392.C9125;
import p394.C9127;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5946 extends AbstractC6293 {
    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        Class clsM14657;
        Object next;
        "classLoader";
        classLoader.getClass();
        try {
            Class clsM146572 = AbstractC9121.m14657("com.tencent.qqnt.chats.view.MiniOldStyleHeaderNew");
            if (clsM146572 == null) {
                clsM146572 = AbstractC9121.m14657("com.tencent.qqnt.chats.view.MiniOldStyleHeader");
            }
            if (clsM146572 != null) {
                XposedBridge.hookAllConstructors(clsM146572, new C5947(this, 0));
                C9127 c9127 = new C9127();
                c9127.f25518 = clsM146572;
                c9127.m14688("refreshLayout", "oldState", "newState");
                ArrayList arrayListM14695 = c9127.m14695();
                "find(...)";
                Iterator it = arrayListM14695.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    } else {
                        next = it.next();
                        if (((Method) next).getParameterTypes().length == 3) {
                            break;
                        }
                    }
                }
                Method method = (Method) next;
                if (method != null) {
                    XposedBridge.hookMethod(method, new C5947(this, 1));
                }
            }
            Class clsM146573 = AbstractC9121.m14657("com.tencent.mobileqq.activity.home.Conversation");
            if (clsM146573 != null) {
                C9127 c91272 = new C9127();
                c91272.f25518 = clsM146573;
                c91272.m14688("initMiniAppEntryLayout.", "initMicroAppEntryLayout.", "init Mini App, cost=");
                Method methodM14693 = c91272.m14693();
                if (methodM14693 == null && (clsM14657 = AbstractC9121.m14657("com.tencent.mobileqq.mini.api.IMiniAppService")) != null) {
                    C9125 c9125M14680 = C9125.m14680(clsM14657);
                    c9125M14680.f25504 = "createMiniAppEntryManager";
                    Method method2 = (Method) c9125M14680.m14686();
                    if (method2 != null) {
                        C9127 c91273 = new C9127();
                        c91273.f25518 = clsM146573;
                        c91273.f25523.addAll(Arrays.asList(method2));
                        methodM14693 = c91273.m14693();
                    }
                }
                if (methodM14693 != null) {
                    XposedBridge.hookMethod(methodM14693, new C5947(this, 2));
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u9690\u85cf\u4e0b\u62c9\u5c0f\u7a0b\u5e8f";
    }
}
