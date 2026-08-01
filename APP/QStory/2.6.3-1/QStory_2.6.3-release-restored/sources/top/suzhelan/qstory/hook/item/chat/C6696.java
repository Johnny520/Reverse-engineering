package top.suzhelan.qstory.hook.item.chat;

import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;

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
                "param";
                methodHookParam.getClass();
                beforeHookedMethod(methodHookParam);
                Object obj = methodHookParam.args[0];
                "null cannot be cast to non-null type java.io.File";
                obj.getClass();
                String absolutePath = ((File) obj).getAbsolutePath();
                "getAbsolutePath(...)";
                absolutePath.getClass();
                if (AbstractC5976.m10735(absolutePath, "Android/data/com.tencent.mobileqq/files", false)) {
                    Field[] declaredFields = this.f16368.getDeclaredFields();
                    "getDeclaredFields(...)";
                    declaredFields.getClass();
                    for (Field field : declaredFields) {
                        field.setAccessible(true);
                        if (AbstractC5227.m9466(field.getType(), ArrayList.class)) {
                            Object obj2 = field.get(methodHookParam.thisObject);
                            ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
                            if (arrayList != null) {
                                Iterator it = arrayList.iterator();
                                "iterator(...)";
                                it.getClass();
                                while (it.hasNext()) {
                                    if (AbstractC5976.m10735(it.next().toString(), "QStory", false)) {
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
                "param";
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
