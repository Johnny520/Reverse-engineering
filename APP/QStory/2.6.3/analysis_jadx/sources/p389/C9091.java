package p389;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Array;
import java.util.HashMap;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲世兰子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9091 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f25479 = new HashMap();

    public C9091(ClassLoader classLoader) {
        super(classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str) throws ClassNotFoundException {
        Class<?> clsLoadClass;
        HashMap map = f25479;
        Class cls = (Class) map.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.endsWith(";") || str.contains("/") || str.contains("L")) {
            str = str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            if (str.startsWith("L")) {
                str = str.substring(1, str.endsWith(";") ? str.length() - 1 : str.length());
            } else if (str.endsWith(";")) {
                str = AbstractC0053.m161(1, 0, str);
            }
        }
        if (!str.startsWith("[")) {
            try {
                clsLoadClass = AbstractC9090.m14670(str);
            } catch (Exception unused) {
                clsLoadClass = super.loadClass(str);
            }
            map.put(str, clsLoadClass);
            return clsLoadClass;
        }
        int i = 0;
        while (str.charAt(i) == '[') {
            i++;
        }
        Class<?> clsLoadClass2 = loadClass(str.substring(i));
        for (int i2 = 0; i2 < i; i2++) {
            clsLoadClass2 = Array.newInstance(clsLoadClass2, 0).getClass();
        }
        map.put(str, clsLoadClass2);
        return clsLoadClass2;
    }
}
