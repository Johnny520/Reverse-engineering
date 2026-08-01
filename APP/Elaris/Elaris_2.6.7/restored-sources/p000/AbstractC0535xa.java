package p000;

import android.widget.TextView;
import com.p001mr.elaris.xposedcompat.XposedBridge;

/* JADX INFO: renamed from: xa */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0535xa {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m1139a(ClassLoader classLoader, String str, String str2) {
        try {
            Class clsM1091j = AbstractC0497v4.m1091j(classLoader, str);
            if (clsM1091j == null) {
                return 0;
            }
            XposedBridge.hookAllConstructors(clsM1091j, new C0503va(50));
            AbstractC0497v4.m1076C("hooked hide constructors: ".concat(str2));
            return 1;
        } catch (Throwable th) {
            AbstractC0497v4.m1076C("hookHideConstructors failed " + str + ": " + th);
            return 0;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static String m1140b(Object obj) {
        if (!(obj instanceof TextView)) {
            return obj == null ? "" : String.valueOf(obj);
        }
        CharSequence text = ((TextView) obj).getText();
        return text == null ? "" : text.toString();
    }
}
