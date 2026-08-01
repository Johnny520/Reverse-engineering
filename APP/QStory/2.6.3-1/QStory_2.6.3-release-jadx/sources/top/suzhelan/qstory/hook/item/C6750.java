package top.suzhelan.qstory.hook.item;

import android.content.Context;
import com.android.p002dx.p005io.Opcodes;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.AbstractC5179;
import kotlin.text.AbstractC5971;
import net.bytebuddy.description.method.MethodDescription;
import p042.AbstractC7140;
import p052.AbstractC7187;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.api.C6642;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m151d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, m152k = 1, m153mv = {2, 3, 0}, m155xi = 50)
public final class C6750 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String[] f16454 = {AbstractC9234.m14531(1808), AbstractC9234.m14531(1809), AbstractC9234.m14531(1810), AbstractC9234.m14531(1811)};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m11859(ClassLoader classLoader) {
        String[] strArr = {AbstractC9234.m14531(160), AbstractC9234.m14531(1802), AbstractC9234.m14531(Opcodes.OR_INT_LIT16), AbstractC9234.m14531(872)};
        String[] strArr2 = {AbstractC9234.m14531(1803), AbstractC9234.m14531(1804), AbstractC9234.m14531(1805), AbstractC9234.m14531(1806), AbstractC9234.m14531(1799)};
        for (int i = 0; i < 4; i++) {
            try {
                Method[] declaredMethods = Class.forName(strArr[i], false, classLoader).getDeclaredMethods();
                AbstractC9234.m14531(1555);
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    String name = method.getName();
                    name.getClass();
                    if (AbstractC5971.m10698(name, AbstractC9234.m14532("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), false) && AbstractC5179.m9396(name, strArr2)) {
                        XposedBridge.hookMethod(method, new C6745(8));
                    }
                    if (name.equals(AbstractC9234.m14531(1799))) {
                        XposedBridge.hookMethod(method, new C6745(9));
                    }
                }
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m11860(C6750 c6750, Object obj, String str) {
        Field declaredField;
        try {
            Class<?> superclass = obj.getClass();
            while (true) {
                if (superclass == null) {
                    declaredField = null;
                    break;
                } else {
                    try {
                        declaredField = superclass.getDeclaredField(str);
                        break;
                    } catch (NoSuchFieldException unused) {
                        superclass = superclass.getSuperclass();
                    }
                }
            }
            if (declaredField == null) {
                return;
            }
            declaredField.setAccessible(true);
            declaredField.set(obj, 0);
        } catch (Exception unused2) {
        }
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        File filesDir;
        AbstractC9234.m14532("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            Context context = AbstractC7187.f17852;
            if (context != null && (filesDir = context.getFilesDir()) != null) {
                for (String str : f16454) {
                    File file = new File(filesDir.getAbsolutePath() + str);
                    if (file.exists()) {
                        boolean readable = file.setReadable(true, false);
                        boolean writable = file.setWritable(true, false);
                        boolean executable = file.setExecutable(true, false);
                        if (!readable || !writable || !executable) {
                            try {
                                Runtime.getRuntime().exec(AbstractC9234.m14531(1807) + file.getAbsolutePath());
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        if (this.f17770.booleanValue()) {
            try {
                try {
                    Class.forName(AbstractC9234.m14531(1798), false, classLoader);
                    m11861(classLoader);
                } catch (ClassNotFoundException unused3) {
                    m11859(classLoader);
                }
            } catch (Throwable unused4) {
            }
        }
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(105);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11861(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> cls = Class.forName(AbstractC9234.m14531(1798), false, classLoader);
        cls.getClass();
        try {
            XposedBridge.hookMethod(cls.getDeclaredMethod(AbstractC9234.m14531(1799), null), new C6745(10));
        } catch (Exception unused) {
        }
        try {
            XposedBridge.hookMethod(cls.getDeclaredMethod(AbstractC9234.m14531(1800), null), new C6745(10));
        } catch (Exception unused2) {
        }
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            AbstractC9234.m14531(1801);
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                XposedBridge.hookMethod(constructor, new C6642(this, 2));
            }
        } catch (Exception unused3) {
        }
    }
}
