package p055;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.C2080;
import bsh.C3466;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p042.AbstractC7140;
import p042.InterfaceC7141;
import p049.AbstractC7165;
import p049.AbstractC7166;
import p049.C7164;
import p408.C9927;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7241 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Class f17932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final AtomicReference f17933 = new AtomicReference();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17934;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Class m12527() {
        Class<?> declaringClass;
        try {
            C9927 c9927 = new C9927();
            c9927.m15247("com.tencent.qqnt.chats.core.adapter.holder");
            c9927.m15246("chatSwipeLayout");
            declaringClass = c9927.m15245().getDeclaringClass();
        } catch (Exception unused) {
            declaringClass = null;
        }
        return declaringClass == null ? AbstractC7166.m12425("com.tencent.qqnt.chats.core.adapter.holder.RecentContactItemBinding") : declaringClass;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Class m12528(Object obj) {
        Class cls = f17932;
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
                        C7164 c7164M12413 = C7164.m12413(field.getType());
                        Class cls2 = Integer.TYPE;
                        Class[] clsArr = {cls2, Object.class, m12527(), cls2};
                        C2080 c2080 = c7164M12413.f17803;
                        c2080.f3964 = clsArr;
                        c2080.f3962 = Void.TYPE;
                        c7164M12413.m12414();
                        f17932 = field.getType();
                    } catch (Exception unused) {
                        if (obj2.getClass().getName().startsWith("com.tencent.qqnt.chats.core.ui.ChatsListVBS$")) {
                            f17932 = field.getType();
                            break;
                        }
                        i++;
                    }
                }
                i++;
            } catch (IllegalAccessException e) {
                C6755.m11872(e);
                return null;
            }
        }
        return f17932;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        final int i;
        Member member;
        Class<?> type;
        Field[] declaredFields = AbstractC7166.m12425("com.tencent.qqnt.chats.biz.guild.GuildDiscoveryItemBuilder").getSuperclass().getDeclaredFields();
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
            if (type.getName().startsWith("com.tencent.qqnt.chats.core.adapter.")) {
                break;
            } else {
                i3++;
            }
        }
        C7164 c7164M12413 = C7164.m12413(type);
        C2080 c2080 = c7164M12413.f17803;
        c2080.f3964 = new Class[]{ViewGroup.class, List.class};
        c2080.f3962 = List.class;
        m12389(c7164M12413.m12414(), new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7241 f17935;

            {
                this.f17935 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
                Method method;
                int i4 = i2;
                C7241 c7241 = this.f17935;
                switch (i4) {
                    case 0:
                        if (c7241.f17934 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals("删除")) {
                                        c7241.f17934 = textView.getId();
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        AtomicReference atomicReference = C7241.f17933;
                        Integer num = (Integer) methodHookParam.args[2];
                        num.getClass();
                        Object obj = methodHookParam.args[1];
                        if (String.valueOf(obj).replace("RecentContactChatItem", "").contains("contactType=16")) {
                            Object obj2 = methodHookParam.thisObject;
                            Object objM12417 = AbstractC7165.m12417(C7241.m12528(obj2), obj2);
                            Object obj3 = AbstractC7165.m12420(obj2.getClass(), C7241.m12527()).get(obj2);
                            int i5 = c7241.f17934;
                            AtomicReference atomicReference2 = C7241.f17933;
                            if (atomicReference2.get() == null) {
                                Class clsM12528 = C7241.m12528(obj2);
                                if (clsM12528 == null) {
                                    C3466.m5899("findClass is null");
                                } else {
                                    C7164 c7164M124132 = C7164.m12413(clsM12528);
                                    Class clsM12527 = C7241.m12527();
                                    Class cls = Integer.TYPE;
                                    Class[] clsArr = {cls, Object.class, clsM12527, cls};
                                    C2080 c20802 = c7164M124132.f17803;
                                    c20802.f3964 = clsArr;
                                    c20802.f3962 = Void.TYPE;
                                    atomicReference2.set(c7164M124132.m12414());
                                    method = (Method) atomicReference2.get();
                                }
                            } else {
                                method = (Method) atomicReference2.get();
                            }
                            method.invoke(objM12417, num, obj, obj3, Integer.valueOf(i5));
                        }
                        break;
                }
            }
        });
        Method[] declaredMethods = AbstractC7166.m12425("com.tencent.qqnt.chats.core.adapter.holder.RecentContactItemHolder").getDeclaredMethods();
        int length2 = declaredMethods.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            Method method = declaredMethods[i4];
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (parameterTypes.length == 3 && parameterTypes[0].getName().startsWith("com.tencent.qqnt.chats.core.adapter.builder.") && parameterTypes[1].getName().startsWith("com.tencent.qqnt.chats.core.adapter.") && parameterTypes[2] == Integer.TYPE) {
                method.setAccessible(true);
                member = method;
                break;
            }
            i4++;
        }
        m12390(member, new InterfaceC7141(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7241 f17935;

            {
                this.f17935 = this;
            }

            @Override // p042.InterfaceC7141
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo2039(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
                Method method2;
                int i42 = i;
                C7241 c7241 = this.f17935;
                switch (i42) {
                    case 0:
                        if (c7241.f17934 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals("删除")) {
                                        c7241.f17934 = textView.getId();
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        AtomicReference atomicReference = C7241.f17933;
                        Integer num = (Integer) methodHookParam.args[2];
                        num.getClass();
                        Object obj = methodHookParam.args[1];
                        if (String.valueOf(obj).replace("RecentContactChatItem", "").contains("contactType=16")) {
                            Object obj2 = methodHookParam.thisObject;
                            Object objM12417 = AbstractC7165.m12417(C7241.m12528(obj2), obj2);
                            Object obj3 = AbstractC7165.m12420(obj2.getClass(), C7241.m12527()).get(obj2);
                            int i5 = c7241.f17934;
                            AtomicReference atomicReference2 = C7241.f17933;
                            if (atomicReference2.get() == null) {
                                Class clsM12528 = C7241.m12528(obj2);
                                if (clsM12528 == null) {
                                    C3466.m5899("findClass is null");
                                } else {
                                    C7164 c7164M124132 = C7164.m12413(clsM12528);
                                    Class clsM12527 = C7241.m12527();
                                    Class cls = Integer.TYPE;
                                    Class[] clsArr = {cls, Object.class, clsM12527, cls};
                                    C2080 c20802 = c7164M124132.f17803;
                                    c20802.f3964 = clsArr;
                                    c20802.f3962 = Void.TYPE;
                                    atomicReference2.set(c7164M124132.m12414());
                                    method2 = (Method) atomicReference2.get();
                                }
                            } else {
                                method2 = (Method) atomicReference2.get();
                            }
                            method2.invoke(objM12417, num, obj, obj3, Integer.valueOf(i5));
                        }
                        break;
                }
            }
        });
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return "重启生效";
    }
}
