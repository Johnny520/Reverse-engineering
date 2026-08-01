package top.suzhelan.qstory.hook.item.chat;

import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.ViewOnClickListenerC4015;
import de.robv.android.xposed.XposedBridge;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p407.C9924;
import p408.C9927;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6689 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final /* synthetic */ int f16362 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C9924 f16363 = new C9924("ChatInputHint", 0);

    static {
        "ChatInputHint";
        "hint_text";
        "Hello World.";
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf A[Catch: Exception -> 0x00d6, TRY_LEAVE, TryCatch #0 {Exception -> 0x00d6, blocks: (B:22:0x0093, B:24:0x009c, B:26:0x00a0, B:28:0x00a3, B:30:0x00ba, B:32:0x00cf), top: B:39:0x0093 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EditText m11822(Object obj) {
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        "getDeclaredFields(...)";
        declaredFields.getClass();
        for (Field field : declaredFields) {
            if (AbstractC5227.m9466(field.getType(), EditText.class)) {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                if (obj2 instanceof EditText) {
                    return (EditText) obj2;
                }
                return null;
            }
        }
        Field[] declaredFields2 = obj.getClass().getDeclaredFields();
        "getDeclaredFields(...)";
        declaredFields2.getClass();
        for (Field field2 : declaredFields2) {
            String name = field2.getName();
            "getName(...)";
            name.getClass();
            String lowerCase = name.toLowerCase(Locale.ROOT);
            "toLowerCase(...)";
            lowerCase.getClass();
            if (AbstractC5976.m10735(lowerCase, "input", false) || AbstractC5976.m10735(lowerCase, "edit", false) || AbstractC5976.m10735(lowerCase, "text", false) || AbstractC5976.m10735(lowerCase, "message", false)) {
                try {
                    field2.setAccessible(true);
                    Object obj3 = field2.get(obj);
                    if (obj3 == null) {
                        continue;
                    } else {
                        if (obj3 instanceof EditText) {
                            return (EditText) obj3;
                        }
                        String name2 = obj3.getClass().getName();
                        "getName(...)";
                        if (!AbstractC5976.m10735(name2, "aio", false)) {
                            String name3 = obj3.getClass().getName();
                            "getName(...)";
                            if (AbstractC5976.m10735(name3, "input", false)) {
                                EditText editTextM11822 = m11822(obj3);
                                if (editTextM11822 != null) {
                                    return editTextM11822;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return null;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        Method methodM15245;
        "classLoader";
        classLoader.getClass();
        Method methodM152452 = null;
        try {
            C9927 c9927 = new C9927();
            c9927.m15247("com.tencent.mobileqq.aio.input.simpleui");
            c9927.m15246("binding", "inputRoot");
            methodM15245 = c9927.m15245();
        } catch (Exception unused) {
            methodM15245 = null;
        }
        if (methodM15245 != null) {
            try {
                XposedBridge.hookMethod(methodM15245, new C6690(this, 0));
            } catch (Exception unused2) {
            }
        }
        try {
            C9927 c99272 = new C9927();
            c99272.m15247("com.tencent.mobileqq.activity.aio.core", "com.tencent.mobileqq.activity.aio");
            c99272.m15246("input set error");
            methodM152452 = c99272.m15245();
        } catch (Exception unused3) {
        }
        if (methodM152452 != null) {
            try {
                XposedBridge.hookMethod(methodM152452, new C6690(this, 1));
            } catch (Exception unused4) {
            }
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "自定义聊天输入框的提示文字";
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC4015(this, 5);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final String m11823() {
        return this.f16363.m15237("hint_text", "Hello World.");
    }
}
