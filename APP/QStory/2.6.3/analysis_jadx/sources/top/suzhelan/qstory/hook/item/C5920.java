package top.suzhelan.qstory.hook.item;

import android.content.Context;
import com.android.dx.io.Opcodes;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.AbstractC4347;
import kotlin.text.AbstractC5139;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p036.AbstractC6358;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.api.C5812;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5920 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String[] f16109 = {AbstractC8405.m13972(1808), AbstractC8405.m13972(1809), AbstractC8405.m13972(1810), AbstractC8405.m13972(1811)};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m11300(ClassLoader classLoader) {
        String[] strArr = {AbstractC8405.m13972(160), AbstractC8405.m13972(1802), AbstractC8405.m13972(Opcodes.OR_INT_LIT16), AbstractC8405.m13972(872)};
        String[] strArr2 = {AbstractC8405.m13972(1803), AbstractC8405.m13972(1804), AbstractC8405.m13972(1805), AbstractC8405.m13972(1806), AbstractC8405.m13972(1799)};
        for (int i = 0; i < 4; i++) {
            try {
                Method[] declaredMethods = Class.forName(strArr[i], false, classLoader).getDeclaredMethods();
                AbstractC8405.m13972(1555);
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    String name = method.getName();
                    name.getClass();
                    if (AbstractC5139.m10139(name, AbstractC8405.m13973("喵喵喵喵喵喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵"), false) && AbstractC4347.m8837(name, strArr2)) {
                        XposedBridge.hookMethod(method, new C5915(8));
                    }
                    if (name.equals(AbstractC8405.m13972(1799))) {
                        XposedBridge.hookMethod(method, new C5915(9));
                    }
                }
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m11301(C5920 c5920, Object obj, String str) {
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

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        File filesDir;
        AbstractC8405.m13973("喵喵喵呜呜呜呜呜~喵喵喵呜呜喵呜喵~喵喵喵呜呜喵呜呜~喵喵喵喵呜呜喵喵~喵喵喵喵喵喵喵喵~喵喵喵呜呜呜呜喵");
        classLoader.getClass();
        try {
            Context context = AbstractC6358.f17507;
            if (context != null && (filesDir = context.getFilesDir()) != null) {
                for (String str : f16109) {
                    File file = new File(filesDir.getAbsolutePath() + str);
                    if (file.exists()) {
                        boolean readable = file.setReadable(true, false);
                        boolean writable = file.setWritable(true, false);
                        boolean executable = file.setExecutable(true, false);
                        if (!readable || !writable || !executable) {
                            try {
                                Runtime.getRuntime().exec(AbstractC8405.m13972(1807) + file.getAbsolutePath());
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        if (this.f17425.booleanValue()) {
            try {
                try {
                    Class.forName(AbstractC8405.m13972(1798), false, classLoader);
                    m11302(classLoader);
                } catch (ClassNotFoundException unused3) {
                    m11300(classLoader);
                }
            } catch (Throwable unused4) {
            }
        }
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(105);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11302(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> cls = Class.forName(AbstractC8405.m13972(1798), false, classLoader);
        cls.getClass();
        try {
            XposedBridge.hookMethod(cls.getDeclaredMethod(AbstractC8405.m13972(1799), null), new C5915(10));
        } catch (Exception unused) {
        }
        try {
            XposedBridge.hookMethod(cls.getDeclaredMethod(AbstractC8405.m13972(1800), null), new C5915(10));
        } catch (Exception unused2) {
        }
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            AbstractC8405.m13972(1801);
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                XposedBridge.hookMethod(constructor, new C5812(this, 2));
            }
        } catch (Exception unused3) {
        }
    }
}
