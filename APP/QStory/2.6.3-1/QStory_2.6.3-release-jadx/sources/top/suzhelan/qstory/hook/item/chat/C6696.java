package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6696 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Class f16368;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16369;

    public /* synthetic */ C6696(Class cls, int i) {
        this.f16369 = i;
        this.f16368 = cls;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        switch (this.f16369) {
            case 1:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                beforeHookedMethod(methodHookParam);
                Object obj = methodHookParam.args[0];
                AbstractC9234.m14531(2113);
                obj.getClass();
                String absolutePath = ((File) obj).getAbsolutePath();
                AbstractC9234.m14531(2114);
                absolutePath.getClass();
                if (AbstractC5976.m10735(absolutePath, AbstractC9234.m14531(2284), false)) {
                    Field[] declaredFields = this.f16368.getDeclaredFields();
                    AbstractC9234.m14531(1985);
                    declaredFields.getClass();
                    for (Field field : declaredFields) {
                        field.setAccessible(true);
                        if (AbstractC5227.m9466(field.getType(), ArrayList.class)) {
                            Object obj2 = field.get(methodHookParam.thisObject);
                            ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
                            if (arrayList != null) {
                                Iterator it = arrayList.iterator();
                                AbstractC9234.m14531(1253);
                                it.getClass();
                                while (it.hasNext()) {
                                    if (AbstractC5976.m10735(it.next().toString(), AbstractC9234.m14532("喵喵呜喵喵喵呜喵~喵喵呜喵喵呜呜喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵呜呜呜~喵喵喵呜喵呜呜呜~喵喵喵呜喵呜喵呜"), false)) {
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
        switch (this.f16369) {
            case 0:
                AbstractC9234.m14532("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
                methodHookParam.getClass();
                int length = methodHookParam.args.length;
                for (int i = 0; i < length; i++) {
                    Object obj = methodHookParam.args[i];
                    if (AbstractC5227.m9466(obj != null ? obj.getClass() : null, this.f16368)) {
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
