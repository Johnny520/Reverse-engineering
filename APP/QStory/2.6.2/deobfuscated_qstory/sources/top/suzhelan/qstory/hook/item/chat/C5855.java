package top.suzhelan.qstory.hook.item.chat;

import android.widget.EditText;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import kotlin.jvm.internal.AbstractC4394;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5855 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C5854 f16012;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16013;

    public /* synthetic */ C5855(C5854 c5854, int i) {
        this.f16013 = i;
        this.f16012 = c5854;
    }

    public final void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Field field;
        int i = this.f16013;
        C5854 c5854 = this.f16012;
        "param";
        methodHookParam.getClass();
        switch (i) {
            case 0:
                if (c5854.f17376.booleanValue()) {
                    try {
                        Field[] declaredFields = methodHookParam.thisObject.getClass().getDeclaredFields();
                        "getDeclaredFields(...)";
                        declaredFields.getClass();
                        int length = declaredFields.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                field = declaredFields[i2];
                                if (!AbstractC4394.m8917(field.getType(), EditText.class)) {
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
                                int i3 = C5854.f16010;
                                editText.setHint(c5854.m11202());
                            }
                        }
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                if (c5854.f17376.booleanValue()) {
                    try {
                        Object obj2 = methodHookParam.thisObject;
                        "thisObject";
                        obj2.getClass();
                        EditText editTextM11201 = C5854.m11201(obj2);
                        if (editTextM11201 != null) {
                            editTextM11201.setHint(c5854.m11202());
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
