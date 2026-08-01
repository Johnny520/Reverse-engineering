package p039;

import androidx.compose.runtime.internal.C1245;
import bsh.C2633;
import com.bumptech.glide.AbstractC3056;
import com.google.gson.internal.C3224;
import java.lang.reflect.Method;
import p019.C6263;
import p026.AbstractC6311;
import p033.AbstractC6333;
import p033.AbstractC6337;
import p033.C6335;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6411 extends AbstractC6311 {
    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) throws ClassNotFoundException {
        Method methodM11855;
        boolean zM6696 = AbstractC3056.m6696();
        Class cls = Boolean.TYPE;
        Class cls2 = Void.TYPE;
        if (!zM6696) {
            m11831(AbstractC6333.m11850(AbstractC8405.m13972(122), AbstractC8405.m13972(123), cls2, new Class[]{AbstractC6337.m11866(AbstractC8405.m13972(124)), cls, cls}), new C6263(5));
            return;
        }
        Class<?> clsLoadClass = classLoader.loadClass(AbstractC8405.m13972(117));
        Class clsM11866 = AbstractC6337.m11866(AbstractC8405.m13972(118));
        Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(119));
        Class clsM118663 = AbstractC6337.m11866(AbstractC8405.m13972(120));
        C6335 c6335M11854 = C6335.m11854(clsLoadClass);
        C1245 c1245 = c6335M11854.f17458;
        c1245.f3617 = cls2;
        c1245.f3619 = new Class[]{clsM11866, Object.class, clsM118662};
        Method methodM118552 = null;
        try {
            methodM11855 = c6335M11854.m11855();
        } catch (Exception unused) {
            methodM11855 = null;
        }
        if (methodM11855 == null) {
            C6335 c6335M118542 = C6335.m11854(clsLoadClass);
            C1245 c12452 = c6335M118542.f17458;
            c12452.f3617 = cls2;
            c12452.f3619 = new Class[]{clsM11866, Object.class, clsM118662, clsM118663};
            try {
                methodM11855 = c6335M118542.m11855();
            } catch (Exception unused2) {
                methodM11855 = null;
            }
        }
        if (methodM11855 == null) {
            C6335 c6335M118543 = C6335.m11854(clsLoadClass);
            C1245 c12453 = c6335M118543.f17458;
            c12453.f3617 = cls2;
            c12453.f3619 = new Class[]{clsM11866, Object.class, clsM118662, clsM118663, cls};
            try {
                methodM11855 = c6335M118543.m11855();
            } catch (Exception unused3) {
                methodM11855 = null;
            }
        }
        if (methodM11855 == null) {
            C6335 c6335M118544 = C6335.m11854(clsLoadClass);
            C1245 c12454 = c6335M118544.f17458;
            c12454.f3617 = cls2;
            c12454.f3619 = new Class[]{clsM11866, clsM118663, clsM118662, cls};
            try {
                methodM118552 = c6335M118544.m11855();
            } catch (Exception unused4) {
            }
            methodM11855 = methodM118552;
        }
        if (methodM11855 != null) {
            m11831(methodM11855, new C3224(this, clsM118663));
        } else {
            C2633.m5339(AbstractC8405.m13972(121));
        }
    }
}
