package top.suzhelan.qstory.hook.item;

import android.content.Context;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedBridge;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.collections.AbstractC4346;
import kotlin.text.AbstractC5138;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p035.AbstractC6340;
import top.suzhelan.qstory.hook.api.C5811;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪兰苏世哲;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C5914 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final String[] f16100 = {AbstractC3056.m6668(-3937743398514197927L), AbstractC3056.m6668(-3937743351269557671L), AbstractC3056.m6668(-3937743261075244455L), AbstractC3056.m6668(-3937743248190342567L)};

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static void m11239(ClassLoader classLoader) {
        String[] strArr = {AbstractC3056.m6668(-3937564551781025191L), AbstractC3056.m6668(-3937743922500208039L), AbstractC3056.m6668(-3937588625072719271L), AbstractC3056.m6668(-3937646791814808999L)};
        String[] strArr2 = {AbstractC3056.m6668(-3937743669097137575L), AbstractC3056.m6668(-3937743626147464615L), AbstractC3056.m6668(-3937743643327333799L), AbstractC3056.m6668(-3937743570312889767L), AbstractC3056.m6668(-3937744094298899879L)};
        for (int i = 0; i < 4; i++) {
            try {
                Method[] declaredMethods = Class.forName(strArr[i], false, classLoader).getDeclaredMethods();
                AbstractC3056.m6668(-3937714304405734823L);
                declaredMethods.getClass();
                for (Method method : declaredMethods) {
                    String name = method.getName();
                    name.getClass();
                    if (AbstractC5138.m10125(name, AbstractC3056.m6668(-3937598920109327783L), false) && AbstractC4346.m8843(name, strArr2)) {
                        XposedBridge.hookMethod(method, new C5909(8));
                    }
                    if (name.equals(AbstractC3056.m6668(-3937744094298899879L))) {
                        XposedBridge.hookMethod(method, new C5909(9));
                    }
                }
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final void m11240(C5914 c5914, Object obj, String str) {
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

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        File filesDir;
        AbstractC3056.m6668(-3937615941064721831L);
        classLoader.getClass();
        try {
            Context context = AbstractC6340.f17460;
            if (context != null && (filesDir = context.getFilesDir()) != null) {
                for (String str : f16100) {
                    File file = new File(filesDir.getAbsolutePath() + str);
                    if (file.exists()) {
                        boolean readable = file.setReadable(true, false);
                        boolean writable = file.setWritable(true, false);
                        boolean executable = file.setExecutable(true, false);
                        if (!readable || !writable || !executable) {
                            try {
                                Runtime.getRuntime().exec(AbstractC3056.m6668(-3937743523068249511L) + file.getAbsolutePath());
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
        if (this.f17376.booleanValue()) {
            try {
                try {
                    Class.forName(AbstractC3056.m6668(-3937744416421447079L), false, classLoader);
                    m11241(classLoader);
                } catch (Throwable unused3) {
                }
            } catch (ClassNotFoundException unused4) {
                m11239(classLoader);
            }
        }
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return AbstractC3056.m6668(-3937568941237601703L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final void m11241(ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> cls = Class.forName(AbstractC3056.m6668(-3937744416421447079L), false, classLoader);
        cls.getClass();
        try {
            XposedBridge.hookMethod(cls.getDeclaredMethod(AbstractC3056.m6668(-3937744094298899879L), null), new C5909(10));
        } catch (Exception unused) {
        }
        try {
            XposedBridge.hookMethod(cls.getDeclaredMethod(AbstractC3056.m6668(-3937744111478769063L), null), new C5909(10));
        } catch (Exception unused2) {
        }
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            AbstractC3056.m6668(-3937744072824063399L);
            declaredConstructors.getClass();
            for (Constructor<?> constructor : declaredConstructors) {
                XposedBridge.hookMethod(constructor, new C5811(this, 2));
            }
        } catch (Exception unused3) {
        }
    }
}
