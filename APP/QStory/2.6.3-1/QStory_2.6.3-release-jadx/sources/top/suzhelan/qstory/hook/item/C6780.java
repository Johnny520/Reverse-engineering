package top.suzhelan.qstory.hook.item;

import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.XposedHelpers;
import io.ktor.util.C5043;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.AbstractC5176;
import kotlin.random.AbstractC5233;
import kotlin.random.Random$Default;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p050.AbstractC7176;
import p303.AbstractC9234;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏哲楪世兰;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "top/suzhelan/qstory/hook/item/飘花落叶言子苏世兰楪哲", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6780 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile double f16492;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public volatile double f16493;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final CopyOnWriteArraySet f16490 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final CopyOnWriteArraySet f16489 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final List f16491 = AbstractC7176.m12490(new C6765(AbstractC9234.m14531(2027), 20.0d, 45.0d, 80.0d, 120.0d), new C6765(AbstractC9234.m14531(2028), 33.0d, 43.0d, 126.0d, 145.0d), new C6765(AbstractC9234.m14531(2029), -8.0d, 20.0d, 95.0d, 120.0d), new C6765(AbstractC9234.m14531(2030), 15.0d, 40.0d, 35.0d, 60.0d), new C6765(AbstractC9234.m14531(2031), 36.0d, 65.0d, -10.0d, 35.0d), new C6765(AbstractC9234.m14531(2032), 25.0d, 50.0d, -125.0d, -75.0d), new C6765(AbstractC9234.m14531(2033), -45.0d, -12.0d, 113.0d, 175.0d), new C6765(AbstractC9234.m14531(2034), -55.0d, 12.0d, -80.0d, -35.0d), new C6765(AbstractC9234.m14531(2035), -30.0d, 30.0d, -15.0d, 40.0d));

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        AbstractC9234.m14531(1257);
        classLoader.getClass();
        m11883();
        try {
            Class clsFindClassIfExists = XposedHelpers.findClassIfExists(AbstractC9234.m14531(2036), classLoader);
            if (clsFindClassIfExists != null) {
                m11882(clsFindClassIfExists);
            }
        } catch (Exception unused) {
        }
        try {
            Class clsFindClassIfExists2 = XposedHelpers.findClassIfExists(AbstractC9234.m14531(2037), classLoader);
            if (clsFindClassIfExists2 != null) {
                Method[] declaredMethods = clsFindClassIfExists2.getDeclaredMethods();
                AbstractC9234.m14531(1555);
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    AbstractC9234.m14531(1772);
                    parameterTypes.getClass();
                    int length = parameterTypes.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        if (parameterTypes[i].getName().equals(AbstractC9234.m14531(2026))) {
                            XposedBridge.hookMethod(method, new C6764(this, 0));
                            break;
                        }
                        i++;
                    }
                }
            }
        } catch (Exception unused2) {
        }
        try {
            Class clsFindClassIfExists3 = XposedHelpers.findClassIfExists(AbstractC9234.m14531(2040), classLoader);
            if (clsFindClassIfExists3 == null) {
                return;
            }
            XposedHelpers.findAndHookMethod(clsFindClassIfExists3, AbstractC9234.m14531(2038), new Object[]{AbstractC9234.m14531(2039), Integer.TYPE, String.class, new C6764(this, 4)});
        } catch (Exception unused3) {
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m11882(Class cls) {
        String name = cls.getName();
        CopyOnWriteArraySet copyOnWriteArraySet = this.f16490;
        if (copyOnWriteArraySet.add(name)) {
            try {
                XposedHelpers.findAndHookMethod(cls, AbstractC9234.m14531(2041), new Object[]{new C6764(this, 2)});
                XposedHelpers.findAndHookMethod(cls, AbstractC9234.m14531(2042), new Object[]{new C6764(this, 3)});
            } catch (Exception unused) {
                copyOnWriteArraySet.remove(cls.getName());
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m11883() {
        List list = this.f16491;
        Random$Default random$Default = AbstractC5233.Default;
        list.getClass();
        random$Default.getClass();
        if (list.isEmpty()) {
            C5043.m9176("Collection is empty.");
            return;
        }
        C6765 c6765 = (C6765) AbstractC5176.m9361(list, random$Default.nextInt(list.size()));
        this.f16493 = random$Default.nextDouble(c6765.f16471, c6765.f16470);
        this.f16492 = random$Default.nextDouble(c6765.f16469, c6765.f16468);
    }
}
