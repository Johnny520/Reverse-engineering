package p131;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1390;
import androidx.compose.runtime.C1334;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.InterfaceC5169;
import kotlin.Result;
import p088.C7167;
import p142.InterfaceC7537;

/* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7504 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC1390 f20369;

    static {
        Object objM163;
        AbstractC1390 abstractC1390;
        try {
            ClassLoader classLoader = InterfaceC7537.class.getClassLoader();
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
                } else if (annotations[i] instanceof InterfaceC5169) {
                    break;
                } else {
                    i++;
                }
            }
            abstractC1390 = null;
            objM163 = Result.m8745constructorimpl(abstractC1390);
        } catch (Throwable th) {
            objM163 = AbstractC0053.m163(th);
        }
        AbstractC1390 c1334 = (AbstractC1390) (Result.m8751isFailureimpl(objM163) ? null : objM163);
        if (c1334 == null) {
            c1334 = new C1334(new C7167(8));
        }
        f20369 = c1334;
    }
}
