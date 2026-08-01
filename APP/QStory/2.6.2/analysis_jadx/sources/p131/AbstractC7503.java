package p131;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.C1334;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.InterfaceC5168;
import kotlin.Result;
import p088.C7166;
import p142.InterfaceC7536;

/* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7503 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC1390 f20374;

    static {
        Object objM162;
        AbstractC1390 abstractC1390;
        try {
            ClassLoader classLoader = InterfaceC7536.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            annotations.getClass();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC1390) {
                        abstractC1390 = (AbstractC1390) objInvoke;
                    }
                } else if (annotations[i] instanceof InterfaceC5168) {
                    break;
                } else {
                    i++;
                }
            }
            abstractC1390 = null;
            objM162 = Result.m8755constructorimpl(abstractC1390);
        } catch (Throwable th) {
            objM162 = AbstractC0053.m162(th);
        }
        AbstractC1390 c1334 = (AbstractC1390) (Result.m8761isFailureimpl(objM162) ? null : objM162);
        if (c1334 == null) {
            c1334 = new C1334(new C7166(8));
        }
        f20374 = c1334;
    }
}
