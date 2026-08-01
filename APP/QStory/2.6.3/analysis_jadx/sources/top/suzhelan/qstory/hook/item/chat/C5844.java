package top.suzhelan.qstory.hook.item.chat;

import com.bumptech.glide.AbstractC3056;
import com.bumptech.glide.C3070;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p027.InterfaceC6317;
import p033.AbstractC6337;
import p036.AbstractC6358;
import p287.AbstractC8405;
import p392.C9102;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲楪兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世苏哲兰;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5844 extends AbstractC6311 implements InterfaceC6317 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public Class f16005;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public Class f16006;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Class f16007;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m11254(Object obj) {
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            declaredFields.getClass();
            for (Field field : declaredFields) {
                if (AbstractC4395.m8907(field.getType(), Map.class)) {
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

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        if (!AbstractC3056.m6696() && AbstractC6358.f17508 < 11820) {
            m11255();
            return;
        }
        try {
            C9102 c9102 = new C9102();
            c9102.m14695(AbstractC8405.m13972(2205));
            Class clsM14696 = c9102.m14696();
            AbstractC8405.m13972(1549);
            clsM14696.getClass();
            Constructor<?>[] declaredConstructors = clsM14696.getDeclaredConstructors();
            AbstractC8405.m13972(1801);
            declaredConstructors.getClass();
            ArrayList arrayList = new ArrayList();
            for (Constructor<?> constructor : declaredConstructors) {
                if (constructor.getParameterCount() >= 3) {
                    arrayList.add(constructor);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m11831((Constructor) it.next(), new C5869(5));
            }
        } catch (Exception unused) {
            m11255();
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(2199);
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo11236(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
    }

    @Override // p027.InterfaceC6317
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11237(C3070 c3070) {
        AbstractC8405.m13973("喵喵喵呜喵呜喵呜~喵喵喵呜呜呜喵喵~喵喵喵呜喵呜喵喵~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        if (AbstractC3056.m6696() || AbstractC6358.f17508 >= 11820) {
            C9102 c9102 = new C9102();
            c9102.m14695(AbstractC8405.m13972(2205));
            Class clsM14696 = c9102.m14696();
            AbstractC8405.m13972(1549);
            clsM14696.getClass();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11255() {
        try {
            Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(548));
            AbstractC8405.m13972(2201);
            clsM11866.getClass();
            this.f16006 = clsM11866;
            Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(533));
            AbstractC8405.m13972(2201);
            clsM118662.getClass();
            this.f16007 = clsM118662;
            Class clsM118663 = AbstractC6337.m11866(AbstractC8405.m13972(536));
            AbstractC8405.m13972(2201);
            clsM118663.getClass();
            this.f16005 = clsM118663;
            Class cls = this.f16006;
            if (cls == null) {
                AbstractC4395.m8908(AbstractC8405.m13972(2202));
                throw null;
            }
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            AbstractC8405.m13972(1801);
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                m11830(constructor, new C5869(6));
            }
            Class cls2 = this.f16007;
            if (cls2 == null) {
                AbstractC4395.m8908(AbstractC8405.m13972(2203));
                throw null;
            }
            Constructor<?>[] declaredConstructors2 = cls2.getDeclaredConstructors();
            AbstractC8405.m13972(1801);
            declaredConstructors2.getClass();
            for (Constructor<?> constructor2 : declaredConstructors2) {
                m11830(constructor2, new C5869(this, 7));
            }
            Class cls3 = this.f16005;
            if (cls3 == null) {
                AbstractC4395.m8908(AbstractC8405.m13972(2204));
                throw null;
            }
            Constructor<?>[] declaredConstructors3 = cls3.getDeclaredConstructors();
            AbstractC8405.m13972(1801);
            declaredConstructors3.getClass();
            for (Constructor<?> constructor3 : declaredConstructors3) {
                m11830(constructor3, new C5869(this, 8));
            }
        } catch (Exception unused) {
        }
    }
}
