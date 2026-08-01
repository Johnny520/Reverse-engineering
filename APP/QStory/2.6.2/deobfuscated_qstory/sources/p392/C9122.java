package p392;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Array;
import java.util.HashMap;
import net.bytebuddy.pool.TypePool;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9122 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f25499 = new HashMap();

    public C9122(ClassLoader classLoader) {
        super(classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str) throws ClassNotFoundException {
        Class<?> clsLoadClass;
        HashMap map = f25499;
        Class cls = (Class) map.get(str);
        if (cls != null) {
            return cls;
        }
        if (str.endsWith(";") || str.contains("/") || str.contains("L")) {
            str = str.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            if (str.startsWith("L")) {
                str = str.substring(1, str.endsWith(";") ? str.length() - 1 : str.length());
            } else if (str.endsWith(";")) {
                str = AbstractC0053.m160(1, 0, str);
            }
        }
        if (!str.startsWith("[")) {
            try {
                clsLoadClass = AbstractC9121.m14658(str);
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
