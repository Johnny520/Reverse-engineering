package p052;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.HandlerC0950;
import androidx.compose.p001ui.platform.RunnableC2733;
import com.android.p002dx.p005io.Opcodes;
import com.bumptech.glide.AbstractC3888;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.util.HashMap;
import lin.xposed.hook.util.p011qq.QQEnvTool;
import p040.AbstractC7137;
import p048.DialogC7161;
import p049.AbstractC7165;
import p049.C7164;
import p055.ViewOnClickListenerC7232;
import p303.AbstractC9234;
import p343.C9576;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世哲楪子兰苏.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC7186 implements Runnable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ XC_MethodHook.MethodHookParam f17850;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f17851;

    public /* synthetic */ RunnableC7186(C9576 c9576, XC_MethodHook.MethodHookParam methodHookParam) {
        this.f17851 = 2;
        this.f17850 = methodHookParam;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bd A[PHI: r1
  0x00bd: PHI (r1v26 java.lang.Object) = (r1v6 java.lang.Object), (r1v6 java.lang.Object), (r1v6 java.lang.Object), (r1v15 java.lang.Object) binds: [B:11:0x0062, B:53:0x00bd, B:19:0x008c, B:67:0x00bd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        CharSequence charSequence;
        Object obj;
        int i = this.f17851;
        int i2 = 0;
        XC_MethodHook.MethodHookParam methodHookParam = this.f17850;
        boolean z = true;
        switch (i) {
            case 0:
                Activity activity = (Activity) methodHookParam.thisObject;
                AbstractC3888.m7247(activity);
                if (!AbstractC7137.f17767.getAndSet(true)) {
                    DialogC7161 dialogC7161 = new DialogC7161(activity);
                    dialogC7161.f17800.setText(AbstractC9234.m14531(Opcodes.FILL_ARRAY_DATA_PAYLOAD));
                    AbstractC7137.f17766 = new HandlerC0950(Looper.getMainLooper(), dialogC7161);
                    new Thread(new RunnableC2733(8)).start();
                    break;
                }
                break;
            case 1:
                Object obj2 = methodHookParam.thisObject;
                C7164 c7164M12413 = C7164.m12413(obj2.getClass());
                c7164M12413.f17803.f3963 = AbstractC9234.m14531(82);
                Activity activity2 = (Activity) c7164M12413.m12415(obj2, new Object[0]);
                Field[] declaredFields = obj2.getClass().getDeclaredFields();
                int length = declaredFields.length;
                Button button = null;
                int i3 = 0;
                String str = null;
                while (i3 < length) {
                    Field field = declaredFields[i3];
                    field.setAccessible(z);
                    Class<?> type = field.getType();
                    if (type.getName().startsWith(AbstractC9234.m14531(Opcodes.SUB_DOUBLE_2ADDR))) {
                        try {
                            Object obj3 = field.get(obj2);
                            if (obj3 != null) {
                                try {
                                    HashMap map = AbstractC7165.f17804;
                                    charSequence = (CharSequence) AbstractC7165.m12420(obj3.getClass(), CharSequence.class).get(obj3);
                                    break;
                                } catch (Exception unused) {
                                }
                                if (charSequence != null) {
                                    if (charSequence.equals(AbstractC9234.m14531(199))) {
                                        Field[] declaredFields2 = obj3.getClass().getSuperclass().getDeclaredFields();
                                        int length2 = declaredFields2.length;
                                        int i4 = i2;
                                        while (i4 < length2) {
                                            Field field2 = declaredFields2[i4];
                                            obj = obj2;
                                            if (field2.getType() == View.class) {
                                                try {
                                                    field2.setAccessible(true);
                                                    button = (Button) field2.get(obj3);
                                                } catch (Exception unused2) {
                                                }
                                                if (type == String.class) {
                                                    try {
                                                        String str2 = (String) field.get(methodHookParam.thisObject);
                                                        if (QQEnvTool.checkQQ(str2)) {
                                                            str = str2;
                                                        }
                                                    } catch (IllegalAccessException e) {
                                                        C6755.m11872(e);
                                                        return;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            } else {
                                                i4++;
                                                obj2 = obj;
                                            }
                                        }
                                        obj = obj2;
                                        if (type == String.class) {
                                        }
                                    } else {
                                        obj = obj2;
                                        if (type == String.class) {
                                        }
                                    }
                                }
                            }
                            obj = obj2;
                        } catch (IllegalAccessException e2) {
                            C6755.m11872(e2);
                            return;
                        }
                    }
                    i3++;
                    obj2 = obj;
                    i2 = 0;
                    z = true;
                }
                if (button != null && str != null) {
                    button.setText(AbstractC9234.m14531(200));
                    Button button2 = new Button(activity2);
                    button2.setText(AbstractC9234.m14531(201));
                    button2.setBackground(button.getBackground());
                    button2.setTextSize(0, button.getTextSize());
                    button2.setTextColor(button.getTextColors());
                    button2.setOnClickListener(new ViewOnClickListenerC7232(str, activity2, 1));
                    ((LinearLayout) button.getParent()).addView(button2, r1.getChildCount() - 2, button.getLayoutParams());
                }
                break;
            default:
                HashMap map2 = C9576.f25006;
                if (((Boolean) methodHookParam.args[0]).booleanValue()) {
                    C9576.m14999((Activity) methodHookParam.thisObject, true);
                }
                break;
        }
    }

    public /* synthetic */ RunnableC7186(XC_MethodHook.MethodHookParam methodHookParam, int i) {
        this.f17851 = i;
        this.f17850 = methodHookParam;
    }
}
