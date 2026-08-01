package p039;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.C1245;
import bsh.C2633;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p026.AbstractC6311;
import p026.InterfaceC6312;
import p033.AbstractC6336;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;
import p392.C9098;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6412 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Class f17587;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final AtomicReference f17588 = new AtomicReference();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17589;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Class m11968() {
        Class<?> declaringClass;
        try {
            C9098 c9098 = new C9098();
            c9098.m14688(AbstractC8405.m13972(112));
            c9098.m14687(AbstractC8405.m13972(113));
            declaringClass = c9098.m14686().getDeclaringClass();
        } catch (Exception unused) {
            declaringClass = null;
        }
        return declaringClass == null ? AbstractC6337.m11866(AbstractC8405.m13972(114)) : declaringClass;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Class m11969(Object obj) {
        Class cls = f17587;
        if (cls != null) {
            return cls;
        }
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Field field = declaredFields[i];
            try {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                if (obj2 != null) {
                    try {
                        C6335 c6335M11854 = C6335.m11854(field.getType());
                        Class cls2 = Integer.TYPE;
                        Class[] clsArr = {cls2, Object.class, m11968(), cls2};
                        C1245 c1245 = c6335M11854.f17458;
                        c1245.f3619 = clsArr;
                        c1245.f3617 = Void.TYPE;
                        c6335M11854.m11855();
                        f17587 = field.getType();
                    } catch (Exception unused) {
                        if (obj2.getClass().getName().startsWith(AbstractC8405.m13972(110))) {
                            f17587 = field.getType();
                            break;
                        }
                        i++;
                    }
                }
                i++;
            } catch (IllegalAccessException e) {
                C5925.m11313(e);
                return null;
            }
        }
        return f17587;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        final int i;
        Member member;
        Class<?> type;
        Field[] declaredFields = AbstractC6337.m11866(AbstractC8405.m13972(106)).getSuperclass().getDeclaredFields();
        int length = declaredFields.length;
        final int i2 = 0;
        int i3 = 0;
        while (true) {
            i = 1;
            member = null;
            if (i3 >= length) {
                type = null;
                break;
            }
            Field field = declaredFields[i3];
            field.setAccessible(true);
            type = field.getType();
            if (type.getName().startsWith(AbstractC8405.m13972(107))) {
                break;
            } else {
                i3++;
            }
        }
        C6335 c6335M11854 = C6335.m11854(type);
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3619 = new Class[]{ViewGroup.class, List.class};
        c1245.f3617 = List.class;
        m11830(c6335M11854.m11855(), new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6412 f17590;

            {
                this.f17590 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
                Method method;
                int i4 = i2;
                C6412 c6412 = this.f17590;
                switch (i4) {
                    case 0:
                        if (c6412.f17589 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"))) {
                                        c6412.f17589 = textView.getId();
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        AtomicReference atomicReference = C6412.f17588;
                        Integer num = (Integer) methodHookParam.args[2];
                        num.getClass();
                        Object obj = methodHookParam.args[1];
                        if (String.valueOf(obj).replace(AbstractC8405.m13972(115), "").contains(AbstractC8405.m13972(116))) {
                            Object obj2 = methodHookParam.thisObject;
                            Object objM11858 = AbstractC6336.m11858(C6412.m11969(obj2), obj2);
                            Object obj3 = AbstractC6336.m11861(obj2.getClass(), C6412.m11968()).get(obj2);
                            int i5 = c6412.f17589;
                            AtomicReference atomicReference2 = C6412.f17588;
                            if (atomicReference2.get() == null) {
                                Class clsM11969 = C6412.m11969(obj2);
                                if (clsM11969 == null) {
                                    C2633.m5339(AbstractC8405.m13972(111));
                                } else {
                                    C6335 c6335M118542 = C6335.m11854(clsM11969);
                                    Class clsM11968 = C6412.m11968();
                                    Class cls = Integer.TYPE;
                                    Class[] clsArr = {cls, Object.class, clsM11968, cls};
                                    C1245 c12452 = c6335M118542.f17458;
                                    c12452.f3619 = clsArr;
                                    c12452.f3617 = Void.TYPE;
                                    atomicReference2.set(c6335M118542.m11855());
                                    method = (Method) atomicReference2.get();
                                }
                            } else {
                                method = (Method) atomicReference2.get();
                            }
                            method.invoke(objM11858, num, obj, obj3, Integer.valueOf(i5));
                        }
                        break;
                }
            }
        });
        Method[] declaredMethods = AbstractC6337.m11866(AbstractC8405.m13972(108)).getDeclaredMethods();
        int length2 = declaredMethods.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            Method method = declaredMethods[i4];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && parameterTypes[0].getName().startsWith(AbstractC8405.m13972(109)) && parameterTypes[1].getName().startsWith(AbstractC8405.m13972(107)) && parameterTypes[2] == Integer.TYPE) {
                method.setAccessible(true);
                member = method;
                break;
            }
            i4++;
        }
        m11831(member, new InterfaceC6312(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6412 f17590;

            {
                this.f17590 = this;
            }

            @Override // p026.InterfaceC6312
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1479(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
                Method method2;
                int i42 = i;
                C6412 c6412 = this.f17590;
                switch (i42) {
                    case 0:
                        if (c6412.f17589 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals(AbstractC8405.m13973("呜喵喵呜喵呜呜喵~呜呜呜呜呜呜喵呜~呜呜喵呜呜喵呜喵~呜喵喵喵喵喵喵呜~呜呜呜呜呜呜喵喵~呜呜喵喵呜喵喵喵"))) {
                                        c6412.f17589 = textView.getId();
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        AtomicReference atomicReference = C6412.f17588;
                        Integer num = (Integer) methodHookParam.args[2];
                        num.getClass();
                        Object obj = methodHookParam.args[1];
                        if (String.valueOf(obj).replace(AbstractC8405.m13972(115), "").contains(AbstractC8405.m13972(116))) {
                            Object obj2 = methodHookParam.thisObject;
                            Object objM11858 = AbstractC6336.m11858(C6412.m11969(obj2), obj2);
                            Object obj3 = AbstractC6336.m11861(obj2.getClass(), C6412.m11968()).get(obj2);
                            int i5 = c6412.f17589;
                            AtomicReference atomicReference2 = C6412.f17588;
                            if (atomicReference2.get() == null) {
                                Class clsM11969 = C6412.m11969(obj2);
                                if (clsM11969 == null) {
                                    C2633.m5339(AbstractC8405.m13972(111));
                                } else {
                                    C6335 c6335M118542 = C6335.m11854(clsM11969);
                                    Class clsM11968 = C6412.m11968();
                                    Class cls = Integer.TYPE;
                                    Class[] clsArr = {cls, Object.class, clsM11968, cls};
                                    C1245 c12452 = c6335M118542.f17458;
                                    c12452.f3619 = clsArr;
                                    c12452.f3617 = Void.TYPE;
                                    atomicReference2.set(c6335M118542.m11855());
                                    method2 = (Method) atomicReference2.get();
                                }
                            } else {
                                method2 = (Method) atomicReference2.get();
                            }
                            method2.invoke(objM11858, num, obj, obj3, Integer.valueOf(i5));
                        }
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(105);
    }
}
