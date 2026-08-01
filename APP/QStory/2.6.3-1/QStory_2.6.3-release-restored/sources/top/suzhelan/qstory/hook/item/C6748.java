package top.suzhelan.qstory.hook.item;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.RunnableC0946;
import androidx.compose.foundation.C1868;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5976;
import p035.C7092;
import p080.C7694;
import top.suzhelan.qstory.hook.item.chat.C6679;
import top.suzhelan.qstory.hook.item.chat.C6688;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6748 extends XC_MethodHook {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ Object f16451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f16452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f16453;

    public C6748(Class cls, C6783 c6783) {
        this.f16453 = 1;
        this.f16452 = cls;
        this.f16451 = c6783;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void afterHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
        int i = this.f16453;
        Method method = null;
        method = null;
        Object obj = this.f16452;
        Object obj2 = this.f16451;
        switch (i) {
            case 0:
                Class cls = (Class) obj;
                "param";
                methodHookParam.getClass();
                if (((C6749) obj2).f17770.booleanValue()) {
                    try {
                        Field declaredField = cls.getDeclaredField("fontId");
                        Field declaredField2 = cls.getDeclaredField("magicFontType");
                        declaredField.setAccessible(true);
                        declaredField2.setAccessible(true);
                        declaredField.set(methodHookParam.thisObject, 0);
                        declaredField2.set(methodHookParam.thisObject, 0);
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 1:
                "param";
                methodHookParam.getClass();
                Object obj3 = methodHookParam.thisObject;
                Field[] declaredFields = ((Class) obj).getDeclaredFields();
                declaredFields.getClass();
                LinearLayout linearLayout = null;
                for (Field field : declaredFields) {
                    if (LinearLayout.class.isAssignableFrom(field.getType())) {
                        field.setAccessible(true);
                        Object obj4 = field.get(obj3);
                        linearLayout = obj4 instanceof LinearLayout ? (LinearLayout) obj4 : null;
                        if (linearLayout != null) {
                            if (linearLayout == null) {
                                linearLayout.post(new RunnableC0946((C6783) obj2, 7, linearLayout));
                            }
                            break;
                        }
                    }
                }
                if (linearLayout == null) {
                }
                break;
            case 2:
            default:
                super.afterHookedMethod(methodHookParam);
                break;
            case 3:
                "param";
                methodHookParam.getClass();
                if (((C6679) obj2).f17770.booleanValue()) {
                    Method[] declaredMethods = ((Class) obj).getDeclaredMethods();
                    declaredMethods.getClass();
                    int length = declaredMethods.length - 1;
                    if (length >= 0) {
                        while (true) {
                            int i2 = length - 1;
                            Method method2 = declaredMethods[length];
                            if (method2.getParameterTypes().length == 1) {
                                Class<?> cls2 = method2.getParameterTypes()[0];
                                Class cls3 = Boolean.TYPE;
                                if ((AbstractC5227.m9466(cls2, cls3) || AbstractC5227.m9466(method2.getParameterTypes()[0], cls3)) && AbstractC5227.m9466(method2.getReturnType(), Void.TYPE)) {
                                    method = method2;
                                } else if (i2 >= 0) {
                                    length = i2;
                                }
                            }
                        }
                    }
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    if (method != null) {
                        method.invoke(methodHookParam.thisObject, Boolean.TRUE);
                    }
                    break;
                }
                break;
            case 4:
                "param";
                methodHookParam.getClass();
                try {
                    Object objInvoke = ((Method) obj2).invoke(methodHookParam.thisObject, null);
                    TextView textView = objInvoke instanceof TextView ? (TextView) objInvoke : null;
                    if (textView != null) {
                        String string = textView.getText().toString();
                        List list = ((C6688) obj).f16361;
                        if (list == null || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (AbstractC5976.m10735(string, (String) it.next(), false)) {
                                    ViewParent parent = textView.getParent();
                                    ViewParent parent2 = parent != null ? parent.getParent() : null;
                                    ViewGroup viewGroup = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
                                    if (viewGroup != null) {
                                        viewGroup.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                                    }
                                    break;
                                }
                            }
                        }
                    }
                } catch (Exception unused2) {
                    return;
                }
                break;
            case 5:
                XC_MethodHook.Unhook unhook = (XC_MethodHook.Unhook) ((AtomicReference) obj2).getAndSet(null);
                if (unhook != null) {
                    unhook.unhook();
                    ((C7092) obj).mo9180(methodHookParam);
                }
                break;
        }
    }

    public void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException {
        switch (this.f16453) {
            case 2:
                "param";
                methodHookParam.getClass();
                Object obj = ((Field) this.f16451).get(methodHookParam.thisObject);
                Bundle bundle = obj instanceof Bundle ? (Bundle) obj : null;
                if (bundle != null && AbstractC5227.m9466(bundle.getString("ptt_forward"), "114514") && C6766.f16473 != null) {
                    methodHookParam.setResult(Boolean.FALSE);
                    new C7694(new C1868(bundle, (C6766) this.f16452)).start();
                }
                break;
            default:
                super.beforeHookedMethod(methodHookParam);
                break;
        }
    }

    public /* synthetic */ C6748(Object obj, int i, Object obj2) {
        this.f16453 = i;
        this.f16451 = obj;
        this.f16452 = obj2;
    }

    public C6748(Field field, C6766 c6766, ClassLoader classLoader) {
        this.f16453 = 2;
        this.f16451 = field;
        this.f16452 = c6766;
    }
}
