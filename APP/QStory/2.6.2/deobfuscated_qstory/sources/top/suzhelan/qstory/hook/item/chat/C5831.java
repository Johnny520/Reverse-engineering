package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3069;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.description.method.MethodDescription;
import p009.InterfaceC6152;
import p026.AbstractC6293;
import p032.AbstractC6318;
import p035.AbstractC6340;
import p053.AbstractC6560;
import p394.C9131;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世楪兰苏哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世兰子楪苏哲/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5831 extends AbstractC6293 implements InterfaceC6152 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Class f15970;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Class f15971;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Class f15972;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m11186(Object obj) {
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            declaredFields.getClass();
            for (Field field : declaredFields) {
                if (AbstractC4394.m8917(field.getType(), Map.class)) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 == null || !obj2.getClass().equals(FakeMap.class)) {
                        field.set(obj, new FakeMap());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        "classLoader";
        classLoader.getClass();
        if (!AbstractC6560.m12011() && AbstractC6340.f17461 < 11820) {
            m11187();
            return;
        }
        try {
            C9131 c9131 = new C9131();
            c9131.m14699("ChatSelectorConfig");
            Class clsM14701 = c9131.m14701();
            "first(...)";
            clsM14701.getClass();
            Constructor<?>[] declaredConstructors = clsM14701.getDeclaredConstructors();
            "getDeclaredConstructors(...)";
            declaredConstructors.getClass();
            ArrayList arrayList = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor.getParameterCount() >= 3) {
                    arrayList.add(constructor);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m11803((Constructor) it.next(), new C5864(5));
            }
        } catch (Exception unused) {
            m11187();
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u89e3\u9664\u8f6c\u53d1\u8054\u7cfb\u4eba\u65f6\u6700\u591a\u9009\u62e99\u4eba\u7684\u9650\u5236";
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11179(C3069 c3069) {
        "finder";
    }

    @Override // p009.InterfaceC6152
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11180(C3069 c3069) throws ClassNotFoundException {
        "finder";
        if (AbstractC6560.m12011() || AbstractC6340.f17461 >= 11820) {
            C9131 c9131 = new C9131();
            c9131.m14699("ChatSelectorConfig");
            Class clsM14701 = c9131.m14701();
            "first(...)";
            clsM14701.getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11187() {
        try {
            Class clsM11838 = AbstractC6318.m11838("com.tencent.mobileqq.activity.ForwardRecentActivity");
            "getClass(...)";
            clsM11838.getClass();
            this.f15971 = clsM11838;
            Class clsM118382 = AbstractC6318.m11838("com.tencent.mobileqq.activity.ForwardFriendListActivity");
            "getClass(...)";
            clsM118382.getClass();
            this.f15972 = clsM118382;
            Class clsM118383 = AbstractC6318.m11838("com.tencent.mobileqq.activity.ForwardTroopListFragment");
            "getClass(...)";
            clsM118383.getClass();
            this.f15970 = clsM118383;
            Class cls = this.f15971;
            if (cls == null) {
                AbstractC4394.m8918("recentClass");
                throw null;
            }
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            "getDeclaredConstructors(...)";
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                m11802(constructor, new C5864(6));
            }
            Class cls2 = this.f15972;
            if (cls2 == null) {
                AbstractC4394.m8918("friendClass");
                throw null;
            }
            Constructor<?>[] declaredConstructors2 = cls2.getDeclaredConstructors();
            "getDeclaredConstructors(...)";
            declaredConstructors2.getClass();
            for (Constructor<?> constructor2 : declaredConstructors2) {
                m11802(constructor2, new C5864(this, 7));
            }
            Class cls3 = this.f15970;
            if (cls3 == null) {
                AbstractC4394.m8918("troopClass");
                throw null;
            }
            Constructor<?>[] declaredConstructors3 = cls3.getDeclaredConstructors();
            "getDeclaredConstructors(...)";
            declaredConstructors3.getClass();
            for (Constructor<?> constructor3 : declaredConstructors3) {
                m11802(constructor3, new C5864(this, 8));
            }
        } catch (Exception unused) {
        }
    }
}
