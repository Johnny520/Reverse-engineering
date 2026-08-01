package top.suzhelan.qstory.hook.item;

import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.util.C4210;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.AbstractC4343;
import kotlin.random.AbstractC4400;
import kotlin.random.Random$Default;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p253.AbstractC8189;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世兰哲楪;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "top/suzhelan/qstory/hook/item/飘花落叶言子苏世哲兰楪", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5928 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile double f16115;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile double f16116;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final CopyOnWriteArraySet f16113 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final CopyOnWriteArraySet f16112 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final List f16114 = AbstractC8189.m13659(new C5930(AbstractC3056.m6668(-3937769791088231847L), 20.0d, 45.0d, 80.0d, 120.0d), new C5930(AbstractC3056.m6668(-3937769816858035623L), 33.0d, 43.0d, 126.0d, 145.0d), new C5930(AbstractC3056.m6668(-3937769739548624295L), -8.0d, 20.0d, 95.0d, 120.0d), new C5930(AbstractC3056.m6668(-3937769756728493479L), 15.0d, 40.0d, 35.0d, 60.0d), new C5930(AbstractC3056.m6668(-3937769700893918631L), 36.0d, 65.0d, -10.0d, 35.0d), new C5930(AbstractC3056.m6668(-3937769688009016743L), 25.0d, 50.0d, -125.0d, -75.0d), new C5930(AbstractC3056.m6668(-3937769576339867047L), -45.0d, -12.0d, 113.0d, 175.0d), new C5930(AbstractC3056.m6668(-3937769606404638119L), -55.0d, 12.0d, -80.0d, -35.0d), new C5930(AbstractC3056.m6668(-3937769520505292199L), -30.0d, 30.0d, -15.0d, 40.0d));

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        m11260();
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937769507620390311L), classLoader);
            if (clsFindClassIfExists != null) {
                m11259(clsFindClassIfExists);
            }
        } catch (Exception unused) {
        }
        try {
            Class clsFindClassIfExists2 = XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937769340116665767L), classLoader);
            if (clsFindClassIfExists2 != null) {
                Method[] declaredMethods = clsFindClassIfExists2.getDeclaredMethods();
                AbstractC3056.m6668(-3937714304405734823L);
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC3056.m6668(-3937730724065707431L);
                    parameterTypes.getClass();
                    int length = parameterTypes.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (parameterTypes[i].getName().equals(AbstractC3056.m6668(-3937770014426531239L))) {
                            XposedBridge.hookMethod(method, new C5929(this, 0));
                            break;
                        }
                        i++;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        try {
            Class clsFindClassIfExists3 = XposedHelpers.findClassIfExists(AbstractC3056.m6668(-3937768863375295911L), classLoader);
            if (clsFindClassIfExists3 == null) {
                return;
            }
            XposedHelpers.findAndHookMethod(clsFindClassIfExists3, AbstractC3056.m6668(-3937769043763922343L), new Object[]{AbstractC3056.m6668(-3937768983634380199L), Integer.TYPE, String.class, new C5929(this, 4)});
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11259(Class cls) {
        String name = cls.getName();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f16113;
        if (copyOnWriteArraySet.add(name)) {
            try {
                XposedHelpers.findAndHookMethod(cls, AbstractC3056.m6668(-3937768489713141159L), new Object[]{new C5929(this, 2)});
                XposedHelpers.findAndHookMethod(cls, AbstractC3056.m6668(-3937768511187977639L), new Object[]{new C5929(this, 3)});
            } catch (Exception unused) {
                copyOnWriteArraySet.remove(cls.getName());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11260() {
        List list = this.f16114;
        Random$Default random$Default = AbstractC4400.Default;
        list.getClass();
        random$Default.getClass();
        if (list.isEmpty()) {
            C4210.m8627("Collection is empty.");
            return;
        }
        C5930 c5930 = (C5930) AbstractC4343.m8787(list, random$Default.nextInt(list.size()));
        this.f16116 = random$Default.nextDouble(c5930.f16122, c5930.f16121);
        this.f16115 = random$Default.nextDouble(c5930.f16120, c5930.f16119);
    }
}
