package p038;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.C1245;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p026.AbstractC6293;
import p026.InterfaceC6294;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p032.C6316;
import p394.C9127;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6395 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static Class f17542;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final AtomicReference f17543 = new AtomicReference();

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f17544;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static Class m11920() {
        Class<?> declaringClass;
        try {
            C9127 c9127 = new C9127();
            c9127.m14689("com.tencent.qqnt.chats.core.adapter.holder");
            c9127.m14688("chatSwipeLayout");
            declaringClass = c9127.m14693().getDeclaringClass();
        } catch (Exception unused) {
            declaringClass = null;
        }
        return declaringClass == null ? AbstractC6318.m11838("com.tencent.qqnt.chats.core.adapter.holder.RecentContactItemBinding") : declaringClass;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Class m11921(Object obj) {
        Class cls = f17542;
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
                        C6316 c6316M11826 = C6316.m11826(field.getType());
                        Class cls2 = Integer.TYPE;
                        Class[] clsArr = {cls2, Object.class, m11920(), cls2};
                        C1245 c1245 = c6316M11826.f17409;
                        c1245.f3618 = clsArr;
                        c1245.f3616 = Void.TYPE;
                        c6316M11826.m11827();
                        f17542 = field.getType();
                    } catch (Exception unused) {
                        if (obj2.getClass().getName().startsWith("com.tencent.qqnt.chats.core.ui.ChatsListVBS$")) {
                            f17542 = field.getType();
                            break;
                        }
                        i++;
                    }
                }
                i++;
            } catch (IllegalAccessException e) {
                C5919.m11252(e);
                return null;
            }
        }
        return f17542;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        final int i;
        Member member;
        Class<?> type;
        Field[] declaredFields = AbstractC6318.m11838("com.tencent.qqnt.chats.biz.guild.GuildDiscoveryItemBuilder").getSuperclass().getDeclaredFields();
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
        C6316 c6316M11826 = C6316.m11826(type);
        C1245 c1245 = c6316M11826.f17409;
        c1245.f3618 = new Class[]{ViewGroup.class, List.class};
        c1245.f3616 = List.class;
        m11802(c6316M11826.m11827(), new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6395 f17545;

            {
                this.f17545 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
                Method method;
                int i4 = i2;
                C6395 c6395 = this.f17545;
                switch (i4) {
                    case 0:
                        if (c6395.f17544 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals("\u5220\u9664")) {
                                        c6395.f17544 = textView.getId();
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        AtomicReference atomicReference = C6395.f17543;
                        Integer num = (Integer) methodHookParam.args[2];
                        num.getClass();
                        Object obj = methodHookParam.args[1];
                        if (String.valueOf(obj).replace("RecentContactChatItem", "").contains("contactType=16")) {
                            Object obj2 = methodHookParam.thisObject;
                            Object objM11830 = AbstractC6317.m11830(C6395.m11921(obj2), obj2);
                            Object obj3 = AbstractC6317.m11833(obj2.getClass(), C6395.m11920()).get(obj2);
                            int i5 = c6395.f17544;
                            AtomicReference atomicReference2 = C6395.f17543;
                            if (atomicReference2.get() == null) {
                                Class clsM11921 = C6395.m11921(obj2);
                                if (clsM11921 == null) {
                                    C2632.m5294("findClass is null");
                                } else {
                                    C6316 c6316M118262 = C6316.m11826(clsM11921);
                                    Class clsM11920 = C6395.m11920();
                                    Class cls = Integer.TYPE;
                                    Class[] clsArr = {cls, Object.class, clsM11920, cls};
                                    C1245 c12452 = c6316M118262.f17409;
                                    c12452.f3618 = clsArr;
                                    c12452.f3616 = Void.TYPE;
                                    atomicReference2.set(c6316M118262.m11827());
                                    method = (Method) atomicReference2.get();
                                }
                            } else {
                                method = (Method) atomicReference2.get();
                            }
                            method.invoke(objM11830, num, obj, obj3, Integer.valueOf(i5));
                        }
                        break;
                }
            }
        });
        Method[] declaredMethods = AbstractC6318.m11838("com.tencent.qqnt.chats.core.adapter.holder.RecentContactItemHolder").getDeclaredMethods();
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
        m11803(member, new InterfaceC6294(this) { // from class: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世哲苏兰

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C6395 f17545;

            {
                this.f17545 = this;
            }

            @Override // p026.InterfaceC6294
            /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
            public final void mo1469(XC_MethodHook.MethodHookParam methodHookParam) throws IllegalAccessException, InvocationTargetException {
                Method method2;
                int i42 = i;
                C6395 c6395 = this.f17545;
                switch (i42) {
                    case 0:
                        if (c6395.f17544 == 0) {
                            for (View view : (List) methodHookParam.getResult()) {
                                if (view instanceof TextView) {
                                    TextView textView = (TextView) view;
                                    if (textView.getText().toString().equals("\u5220\u9664")) {
                                        c6395.f17544 = textView.getId();
                                        break;
                                    }
                                }
                            }
                            break;
                        }
                        break;
                    default:
                        AtomicReference atomicReference = C6395.f17543;
                        Integer num = (Integer) methodHookParam.args[2];
                        num.getClass();
                        Object obj = methodHookParam.args[1];
                        if (String.valueOf(obj).replace("RecentContactChatItem", "").contains("contactType=16")) {
                            Object obj2 = methodHookParam.thisObject;
                            Object objM11830 = AbstractC6317.m11830(C6395.m11921(obj2), obj2);
                            Object obj3 = AbstractC6317.m11833(obj2.getClass(), C6395.m11920()).get(obj2);
                            int i5 = c6395.f17544;
                            AtomicReference atomicReference2 = C6395.f17543;
                            if (atomicReference2.get() == null) {
                                Class clsM11921 = C6395.m11921(obj2);
                                if (clsM11921 == null) {
                                    C2632.m5294("findClass is null");
                                } else {
                                    C6316 c6316M118262 = C6316.m11826(clsM11921);
                                    Class clsM11920 = C6395.m11920();
                                    Class cls = Integer.TYPE;
                                    Class[] clsArr = {cls, Object.class, clsM11920, cls};
                                    C1245 c12452 = c6316M118262.f17409;
                                    c12452.f3618 = clsArr;
                                    c12452.f3616 = Void.TYPE;
                                    atomicReference2.set(c6316M118262.m11827());
                                    method2 = (Method) atomicReference2.get();
                                }
                            } else {
                                method2 = (Method) atomicReference2.get();
                            }
                            method2.invoke(objM11830, num, obj, obj3, Integer.valueOf(i5));
                        }
                        break;
                }
            }
        });
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u91cd\u542f\u751f\u6548";
    }
}
