package p056f0;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.widget.BaseAdapter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p007D0.C0146l;
import p009E0.AbstractC0179j;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: f0.Y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0813Y implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2955a;

    public /* synthetic */ C0813Y(int i2) {
        this.f2955a = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    @Override // p029P0.InterfaceC0286l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z2;
        switch (this.f2955a) {
            case 0:
                Activity activity = (Activity) obj;
                AbstractC0307g.m703e(activity, "act");
                C0810V.f2933a.m2106w(activity, C0802M.f2917b);
                return C0146l.f339a;
            case 1:
                Activity activity2 = (Activity) obj;
                AbstractC0307g.m703e(activity2, "act");
                C0810V.f2933a.m2106w(activity2, C0804O.f2919b);
                return C0146l.f339a;
            case 2:
                Activity activity3 = (Activity) obj;
                AbstractC0307g.m703e(activity3, "act");
                C0810V.f2933a.m2106w(activity3, new C0801L("virtual_location_enabled"));
                return C0146l.f339a;
            case 3:
                Activity activity4 = (Activity) obj;
                AbstractC0307g.m703e(activity4, "act");
                C0810V.f2933a.m2106w(activity4, new C0801L("bottom_tab_floating"));
                return C0146l.f339a;
            case 4:
                Activity activity5 = (Activity) obj;
                AbstractC0307g.m703e(activity5, "act");
                C0810V.f2933a.m2106w(activity5, new C0801L("theme_wallpaper_enabled"));
                return C0146l.f339a;
            case 5:
                Class cls = (Class) obj;
                AbstractC0307g.m703e(cls, "it");
                Method[] declaredMethods = cls.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods, "getDeclaredMethods(...)");
                return AbstractC0179j.m531h0(declaredMethods);
            case 6:
                Method method = (Method) obj;
                return Boolean.valueOf(AbstractC0307g.m699a(method.getName(), "getView") && method.getParameterTypes().length == 3 && View.class.isAssignableFrom(method.getReturnType()));
            case 7:
                Field field = (Field) obj;
                AbstractC0307g.m703e(field, "f");
                Class<?> type = field.getType();
                return Boolean.valueOf((type.isPrimitive() || type.equals(String.class) || type.equals(CharSequence.class) || type.isArray()) ? false : true);
            case 8:
                Class cls2 = (Class) obj;
                AbstractC0307g.m703e(cls2, "it");
                Method[] declaredMethods2 = cls2.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods2, "getDeclaredMethods(...)");
                return AbstractC0179j.m531h0(declaredMethods2);
            case 9:
                Method method2 = (Method) obj;
                boolean z3 = false;
                if (method2.getParameterTypes().length == 1 && AbstractC0307g.m699a(method2.getParameterTypes()[0], Boolean.TYPE) && AbstractC0307g.m699a(method2.getReturnType(), Void.TYPE)) {
                    z3 = true;
                }
                return Boolean.valueOf(z3);
            case 10:
                Class cls3 = (Class) obj;
                AbstractC0307g.m703e(cls3, "it");
                Field[] declaredFields = cls3.getDeclaredFields();
                AbstractC0307g.m702d(declaredFields, "getDeclaredFields(...)");
                return AbstractC0179j.m531h0(declaredFields);
            case 11:
                Field field2 = (Field) obj;
                Class<?> type2 = field2.getType();
                Class cls4 = Integer.TYPE;
                return Boolean.valueOf(AbstractC0307g.m699a(type2, cls4) || AbstractC0307g.m699a(field2.getType(), cls4));
            case 12:
                Field field3 = (Field) obj;
                AbstractC0307g.m703e(field3, "it");
                return Boolean.valueOf(SparseArray.class.isAssignableFrom(field3.getType()));
            case 13:
                Field field4 = (Field) obj;
                AbstractC0307g.m703e(field4, "it");
                return Boolean.valueOf(BaseAdapter.class.isAssignableFrom(field4.getType()));
            case 14:
                Class cls5 = (Class) obj;
                AbstractC0307g.m703e(cls5, "it");
                Method[] declaredMethods3 = cls5.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods3, "getDeclaredMethods(...)");
                return AbstractC0179j.m531h0(declaredMethods3);
            case 15:
                Class cls6 = (Class) obj;
                AbstractC0307g.m703e(cls6, "it");
                Field[] declaredFields2 = cls6.getDeclaredFields();
                AbstractC0307g.m702d(declaredFields2, "getDeclaredFields(...)");
                return AbstractC0179j.m531h0(declaredFields2);
            case 16:
                Method method3 = (Method) obj;
                Class<?>[] parameterTypes = method3.getParameterTypes();
                AbstractC0307g.m702d(parameterTypes, "getParameterTypes(...)");
                return Boolean.valueOf(parameterTypes.length == 0 && (AbstractC0307g.m699a(method3.getReturnType(), Boolean.TYPE) || AbstractC0307g.m699a(method3.getReturnType(), Void.TYPE)));
            case 17:
                Field field5 = (Field) obj;
                Class<?> type3 = field5.getType();
                Class cls7 = Integer.TYPE;
                return Boolean.valueOf(AbstractC0307g.m699a(type3, cls7) || AbstractC0307g.m699a(field5.getType(), cls7));
            case 18:
                Class cls8 = (Class) obj;
                AbstractC0307g.m703e(cls8, "it");
                Method[] declaredMethods4 = cls8.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods4, "getDeclaredMethods(...)");
                return AbstractC0179j.m531h0(declaredMethods4);
            case 19:
                Class cls9 = (Class) obj;
                AbstractC0307g.m703e(cls9, "it");
                Field[] declaredFields3 = cls9.getDeclaredFields();
                AbstractC0307g.m702d(declaredFields3, "getDeclaredFields(...)");
                return AbstractC0179j.m531h0(declaredFields3);
            case 20:
                Class cls10 = (Class) obj;
                AbstractC0307g.m703e(cls10, "it");
                Method[] declaredMethods5 = cls10.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods5, "getDeclaredMethods(...)");
                return AbstractC0179j.m531h0(declaredMethods5);
            case 21:
                Method method4 = (Method) obj;
                Class<?>[] parameterTypes2 = method4.getParameterTypes();
                AbstractC0307g.m702d(parameterTypes2, "getParameterTypes(...)");
                return Boolean.valueOf(parameterTypes2.length == 0 && BaseAdapter.class.isAssignableFrom(method4.getReturnType()));
            case 22:
                Field field6 = (Field) obj;
                AbstractC0307g.m703e(field6, "it");
                return Boolean.valueOf(Context.class.isAssignableFrom(field6.getType()));
            case 23:
                Class cls11 = (Class) obj;
                AbstractC0307g.m703e(cls11, "it");
                return cls11.getName();
            case 24:
                Class cls12 = (Class) obj;
                AbstractC0307g.m703e(cls12, "it");
                Method[] declaredMethods6 = cls12.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods6, "getDeclaredMethods(...)");
                return AbstractC0179j.m531h0(declaredMethods6);
            case 25:
                Method method5 = (Method) obj;
                if (AbstractC0307g.m699a(method5.getName(), "getCount")) {
                    Class<?>[] parameterTypes3 = method5.getParameterTypes();
                    AbstractC0307g.m702d(parameterTypes3, "getParameterTypes(...)");
                    z2 = parameterTypes3.length == 0;
                }
                return Boolean.valueOf(z2);
            default:
                Class cls13 = (Class) obj;
                AbstractC0307g.m703e(cls13, "it");
                Method[] declaredMethods7 = cls13.getDeclaredMethods();
                AbstractC0307g.m702d(declaredMethods7, "getDeclaredMethods(...)");
                return AbstractC0179j.m531h0(declaredMethods7);
        }
    }
}
