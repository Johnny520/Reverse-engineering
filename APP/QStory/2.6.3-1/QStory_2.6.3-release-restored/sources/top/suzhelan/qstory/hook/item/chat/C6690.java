package top.suzhelan.qstory.hook.item.chat;

import android.widget.EditText;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6690 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C6689 f16364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16365;

    public /* synthetic */ C6690(C6689 c6689, int i) {
        this.f16365 = i;
        this.f16364 = c6689;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Field field;
        int i = this.f16365;
        C6689 c6689 = this.f16364;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c6689.f17770.booleanValue()) {
                    try {
                        Field[] declaredFields = methodHookParam.thisObject.getClass().getDeclaredFields();
                        "getDeclaredFields(...)";
                        declaredFields.getClass();
                        int length = declaredFields.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                field = declaredFields[i2];
                                if (!AbstractC5227.m9466(field.getType(), EditText.class)) {
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
                                int i3 = C6689.f16362;
                                editText.setHint(c6689.m11823());
                            }
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                if (c6689.f17770.booleanValue()) {
                    try {
                        Object obj2 = methodHookParam.thisObject;
                        "thisObject";
                        obj2.getClass();
                        EditText editTextM11822 = C6689.m11822(obj2);
                        if (editTextM11822 != null) {
                            editTextM11822.setHint(c6689.m11823());
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
