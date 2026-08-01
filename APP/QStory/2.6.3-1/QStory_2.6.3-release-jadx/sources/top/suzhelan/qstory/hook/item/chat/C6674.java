package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3888;
import com.bumptech.glide.C3902;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p043.InterfaceC7146;
import p049.AbstractC7166;
import p052.AbstractC7187;
import p303.AbstractC9234;
import p408.C9931;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲楪兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6674 extends AbstractC7140 implements InterfaceC7146 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Class f16350;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Class f16351;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Class f16352;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m11813(Object obj) {
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            declaredFields.getClass();
            for (Field field : declaredFields) {
                if (AbstractC5227.m9466(field.getType(), Map.class)) {
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

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        if (!AbstractC3888.m7256() && AbstractC7187.f17853 < 11820) {
            m11814();
            return;
        }
        try {
            C9931 c9931 = new C9931();
            c9931.m15254(AbstractC9234.m14531(2205));
            Class clsM15255 = c9931.m15255();
            AbstractC9234.m14531(1549);
            clsM15255.getClass();
            Constructor<?>[] declaredConstructors = clsM15255.getDeclaredConstructors();
            AbstractC9234.m14531(1801);
            declaredConstructors.getClass();
            ArrayList arrayList = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor.getParameterCount() >= 3) {
                    arrayList.add(constructor);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m12390((Constructor) it.next(), new C6699(5));
            }
        } catch (Exception unused) {
            m11814();
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(2199);
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11795(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p043.InterfaceC7146
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11796(C3902 c3902) {
        AbstractC9234.m14532("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        if (AbstractC3888.m7256() || AbstractC7187.f17853 >= 11820) {
            C9931 c9931 = new C9931();
            c9931.m15254(AbstractC9234.m14531(2205));
            Class clsM15255 = c9931.m15255();
            AbstractC9234.m14531(1549);
            clsM15255.getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11814() {
        try {
            Class clsM12425 = AbstractC7166.m12425(AbstractC9234.m14531(548));
            AbstractC9234.m14531(2201);
            clsM12425.getClass();
            this.f16351 = clsM12425;
            Class clsM124252 = AbstractC7166.m12425(AbstractC9234.m14531(533));
            AbstractC9234.m14531(2201);
            clsM124252.getClass();
            this.f16352 = clsM124252;
            Class clsM124253 = AbstractC7166.m12425(AbstractC9234.m14531(536));
            AbstractC9234.m14531(2201);
            clsM124253.getClass();
            this.f16350 = clsM124253;
            Class cls = this.f16351;
            if (cls == null) {
                AbstractC5227.m9467(AbstractC9234.m14531(2202));
                throw null;
            }
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            AbstractC9234.m14531(1801);
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                m12389(constructor, new C6699(6));
            }
            Class cls2 = this.f16352;
            if (cls2 == null) {
                AbstractC5227.m9467(AbstractC9234.m14531(2203));
                throw null;
            }
            Constructor<?>[] declaredConstructors2 = cls2.getDeclaredConstructors();
            AbstractC9234.m14531(1801);
            declaredConstructors2.getClass();
            for (Constructor<?> constructor2 : declaredConstructors2) {
                m12389(constructor2, new C6699(this, 7));
            }
            Class cls3 = this.f16350;
            if (cls3 == null) {
                AbstractC5227.m9467(AbstractC9234.m14531(2204));
                throw null;
            }
            Constructor<?>[] declaredConstructors3 = cls3.getDeclaredConstructors();
            AbstractC9234.m14531(1801);
            declaredConstructors3.getClass();
            for (Constructor<?> constructor3 : declaredConstructors3) {
                m12389(constructor3, new C6699(this, 8));
            }
        } catch (Exception unused) {
        }
    }
}
