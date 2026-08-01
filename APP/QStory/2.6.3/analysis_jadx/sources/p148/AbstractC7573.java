package p148;

import androidx.activity.compose.C0004;
import androidx.window.area.reflectionguard.ExtensionWindowAreaStatusRequirements;
import androidx.window.area.reflectionguard.WindowAreaComponentApi3Requirements;
import androidx.window.extensions.area.ExtensionWindowAreaPresentation;
import java.lang.reflect.Method;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7573 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static boolean m12795(int i, Class cls) {
        if (i > 2) {
            Method[] methods = WindowAreaComponentApi3Requirements.class.getMethods();
            methods.getClass();
            for (Method method : methods) {
                if (AbstractC8190.m13682(cls.getName() + '#' + method.getName() + " is not valid", new C0004(cls, 18, method))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static boolean m12796(int i, Class cls) {
        if (i > 2) {
            Method[] methods = ExtensionWindowAreaStatusRequirements.class.getMethods();
            methods.getClass();
            for (Method method : methods) {
                if (AbstractC8190.m13682(cls.getName() + '#' + method.getName() + " is not valid", new C0004(cls, 18, method))) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m12797(int i, Class cls) {
        if (i > 2) {
            Method[] methods = ExtensionWindowAreaPresentation.class.getMethods();
            methods.getClass();
            for (Method method : methods) {
                if (AbstractC8190.m13682(cls.getName() + '#' + method.getName() + " is not valid", new C0004(cls, 18, method))) {
                }
            }
            return true;
        }
        return false;
    }
}
