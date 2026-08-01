package androidx.lifecycle.compose;

import androidx.activity.AbstractC0900;
import androidx.activity.compose.C0858;
import androidx.compose.runtime.AbstractC2225;
import androidx.compose.runtime.C2169;
import androidx.lifecycle.InterfaceC3221;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.InterfaceC6001;
import kotlin.Result;

/* JADX INFO: renamed from: androidx.lifecycle.compose.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3195 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC2225 f7338;

    static {
        Object objM723;
        AbstractC2225 abstractC2225;
        try {
            ClassLoader classLoader = InterfaceC3221.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof AbstractC2225) {
                        abstractC2225 = (AbstractC2225) objInvoke;
                    }
                } else if (annotations[i] instanceof InterfaceC6001) {
                    break;
                } else {
                    i++;
                }
            }
            abstractC2225 = null;
            objM723 = Result.m9304constructorimpl(abstractC2225);
        } catch (Throwable th) {
            objM723 = AbstractC0900.m723(th);
        }
        AbstractC2225 c2169 = (AbstractC2225) (Result.m9310isFailureimpl(objM723) ? null : objM723);
        if (c2169 == null) {
            c2169 = new C2169(new C0858(28));
        }
        f7338 = c2169;
    }
}
