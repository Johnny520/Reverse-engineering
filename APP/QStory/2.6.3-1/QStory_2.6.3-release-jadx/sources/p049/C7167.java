package p049;

import androidx.activity.AbstractC0900;
import java.lang.reflect.Array;
import java.util.HashMap;
import lin.util.ReflectUtils.ReflectException;

/* JADX INFO: renamed from: 飘花落叶言世哲子苏楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7167 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final HashMap f17808 = new HashMap();

    public C7167(ClassLoader classLoader) {
        super(classLoader);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a  */
    @Override // java.lang.ClassLoader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Class loadClass(String str) {
        Class<?> clsLoadClass;
        Class<?> clsLoadClass2;
        HashMap map = f17808;
        Class cls = (Class) map.get(str);
        if (cls != null) {
            return cls;
        }
        try {
            if (!str.startsWith("[")) {
                try {
                    clsLoadClass = AbstractC7166.m12426(str);
                } catch (Exception unused) {
                    clsLoadClass = super.loadClass(str);
                }
                map.put(str, clsLoadClass);
                return clsLoadClass;
            }
            int iLastIndexOf = str.lastIndexOf(91) + 1;
            try {
                clsLoadClass2 = AbstractC7166.m12426(str.substring(iLastIndexOf));
            } catch (Exception unused2) {
                clsLoadClass2 = super.loadClass(str.substring(iLastIndexOf));
            }
            for (int i = 0; i < str.length() && str.charAt(i) == '['; i++) {
                clsLoadClass2 = Array.newInstance(clsLoadClass2, 0).getClass();
            }
            map.put(str, clsLoadClass2);
            return clsLoadClass2;
        } catch (Throwable unused3) {
            if (str.startsWith("com.tencent.qqnt.kernel.nativeinterface.")) {
            }
        }
        if (str.startsWith("com.tencent.qqnt.kernel.nativeinterface.")) {
            throw new ReflectException("没有找到类: ".concat(str));
        }
        String strReplace = str.replace("com.tencent.qqnt.kernel.nativeinterface", "com.tencent.qqnt.kernelpublic.nativeinterface");
        try {
            Class<?> clsLoadClass3 = super.loadClass(strReplace);
            map.put(strReplace, clsLoadClass3);
            return clsLoadClass3;
        } catch (ClassNotFoundException unused4) {
            throw new ReflectException(AbstractC0900.m717("没有找到类: ", strReplace));
        }
    }
}
