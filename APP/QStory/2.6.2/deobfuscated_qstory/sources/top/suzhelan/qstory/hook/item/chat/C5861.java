package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5143;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5861 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Class f16016;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16017;

    public /* synthetic */ C5861(Class cls, int i) {
        this.f16017 = i;
        this.f16016 = cls;
    }

    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        switch (this.f16017) {
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
                if (AbstractC5143.m10171(absolutePath, "Android/data/com.tencent.mobileqq/files", false)) {
                    Field[] declaredFields = this.f16016.getDeclaredFields();
                    "getDeclaredFields(...)";
                    declaredFields.getClass();
                    for (Field field : declaredFields) {
                        field.setAccessible(true);
                        if (AbstractC4394.m8917(field.getType(), ArrayList.class)) {
                            Object obj2 = field.get(methodHookParam.thisObject);
                            ArrayList arrayList = obj2 instanceof ArrayList ? (ArrayList) obj2 : null;
                            if (arrayList != null) {
                                Iterator it = arrayList.iterator();
                                "iterator(...)";
                                it.getClass();
                                while (it.hasNext()) {
                                    if (AbstractC5143.m10171(it.next().toString(), "QStory", false)) {
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
        switch (this.f16017) {
            case 0:
                "param";
                methodHookParam.getClass();
                int length = methodHookParam.args.length;
                for (int i = 0; i < length; i++) {
                    Object obj = methodHookParam.args[i];
                    if (AbstractC4394.m8917(obj != null ? obj.getClass() : null, this.f16016)) {
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
