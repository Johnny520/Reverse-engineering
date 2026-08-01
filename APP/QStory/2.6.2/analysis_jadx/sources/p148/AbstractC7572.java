package p148;

import androidx.activity.compose.C0004;
import androidx.window.area.reflectionguard.ExtensionWindowAreaStatusRequirements;
import androidx.window.area.reflectionguard.WindowAreaComponentApi3Requirements;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import java.lang.reflect.Method;
import p033.AbstractC6325;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7572 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m12766(int i, Class cls) {
        if (i > 2) {
            Method[] methods = WindowAreaComponentApi3Requirements.class.getMethods();
            methods.getClass();
            for (Method method : methods) {
                if (AbstractC6325.m11840(cls.getName() + '#' + method.getName() + " is not valid", new C0004(cls, 18, method))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m12767(int i, Class cls) {
        if (i > 2) {
            Method[] methods = ExtensionWindowAreaStatusRequirements.class.getMethods();
            methods.getClass();
            for (Method method : methods) {
                if (AbstractC6325.m11840(cls.getName() + '#' + method.getName() + " is not valid", new C0004(cls, 18, method))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m12768(int i, Class cls) {
        if (i > 2) {
            Method[] methods = ExtensionWindowAreaPresentation.class.getMethods();
            methods.getClass();
            for (Method method : methods) {
                if (AbstractC6325.m11840(cls.getName() + '#' + method.getName() + " is not valid", new C0004(cls, 18, method))) {
                }
            }
            return true;
        }
        return false;
    }
}
