package top.suzhelan.qstory.hook.item.chat;

import android.widget.EditText;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC4395;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5860 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5859 f16019;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16020;

    public /* synthetic */ C5860(C5859 c5859, int i) {
        this.f16020 = i;
        this.f16019 = c5859;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Field field;
        int i = this.f16020;
        C5859 c5859 = this.f16019;
        AbstractC8405.m13973("喵喵喵喵喵喵呜呜~喵喵喵呜喵呜喵喵~喵喵喵喵呜喵喵喵~喵喵喵喵呜喵喵呜~喵喵喵喵呜喵喵喵");
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c5859.f17425.booleanValue()) {
                    try {
                        Field[] declaredFields = methodHookParam.thisObject.getClass().getDeclaredFields();
                        AbstractC8405.m13972(1985);
                        declaredFields.getClass();
                        int length = declaredFields.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                field = declaredFields[i2];
                                if (!AbstractC4395.m8907(field.getType(), EditText.class)) {
                                    i2++;
                                }
                            } else {
                                field = null;
                            }
                        }
                        if (field != null) {
                            field.setAccessible(true);
                            Object obj = field.get(methodHookParam.thisObject);
                            EditText editText = obj instanceof EditText ? (EditText) obj : null;
                            if (editText != null) {
                                int i3 = C5859.f16017;
                                editText.setHint(c5859.m11264());
                            }
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                if (c5859.f17425.booleanValue()) {
                    try {
                        Object obj2 = methodHookParam.thisObject;
                        AbstractC8405.m13972(1891);
                        obj2.getClass();
                        EditText editTextM11263 = C5859.m11263(obj2);
                        if (editTextM11263 != null) {
                            editTextM11263.setHint(c5859.m11264());
                        }
                    } catch (Exception unused2) {
                        return;
                    }
                    break;
                }
                break;
        }
    }
}
