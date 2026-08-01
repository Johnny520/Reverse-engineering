package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5144;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5866 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Class f16023;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16024;

    public /* synthetic */ C5866(Class cls, int i) {
        this.f16024 = i;
        this.f16023 = cls;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        switch (this.f16024) {
            case 1:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                beforeHookedMethod(methodHookParam);
                Object obj = methodHookParam.args[0];
                AbstractC8405.m13972(2113);
                obj.getClass();
                String absolutePath = ((File) obj).getAbsolutePath();
                AbstractC8405.m13972(2114);
                absolutePath.getClass();
                if (AbstractC5144.m10176(absolutePath, AbstractC8405.m13972(2284), false)) {
                    Field[] declaredFields = this.f16023.getDeclaredFields();
                    AbstractC8405.m13972(1985);
                    declaredFields.getClass();
                    for (Field field : declaredFields) {
                        field.setAccessible(true);
                        if (AbstractC4395.m8907(field.getType(), ArrayList.class)) {
                            Object obj2 = field.get(methodHookParam.thisObject);
                            ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
                            if (arrayList != null) {
                                Iterator it = arrayList.iterator();
                                AbstractC8405.m13972(1253);
                                it.getClass();
                                while (it.hasNext()) {
                                    if (AbstractC5144.m10176(it.next().toString(), AbstractC8405.m13973("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜"), false)) {
                                        it.remove();
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            default:
                super.afterHookedMethod(methodHookParam);
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        switch (this.f16024) {
            case 0:
                AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                int length = methodHookParam.args.length;
                for (int i = 0; i < length; i++) {
                    Object obj = methodHookParam.args[i];
                    if (AbstractC4395.m8907(obj != null ? obj.getClass() : null, this.f16023)) {
                        methodHookParam.args[i] = null;
                    }
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }
}
