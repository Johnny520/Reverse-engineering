package p322;

import android.content.Context;
import androidx.compose.runtime.internal.C1245;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6311;
import p033.AbstractC6337;
import p033.C6335;
import p034.AbstractC6347;
import p144.C7547;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子楪哲.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世兰子楪哲/飘花落叶言子楪世兰苏哲;", "L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8700 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final List f24526 = AbstractC6347.m11931(AbstractC8405.m13972(2657), AbstractC8405.m13972(2658), AbstractC8405.m13972(2659), AbstractC8405.m13972(2660), AbstractC8405.m13972(2661), AbstractC8405.m13972(2662));

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        AbstractC8405.m13972(1257);
        classLoader.getClass();
        Iterator it = f24526.iterator();
        while (it.hasNext()) {
            try {
                Class clsM11866 = AbstractC6337.m11866((String) it.next());
                if (clsM11866 != null) {
                    m11830(clsM11866.getDeclaredConstructor(Context.class), new C7547(17));
                }
            } catch (Throwable unused) {
            }
        }
        try {
            Class clsM118662 = AbstractC6337.m11866(AbstractC8405.m13972(2645));
            Class clsM118663 = AbstractC6337.m11866(AbstractC8405.m13972(2646));
            if (clsM118662 != null && clsM118663 != null) {
                C6335 c6335M11853 = C6335.m11853(clsM118662.getName());
                String strM13972 = AbstractC8405.m13972(2647);
                C1245 c1245 = c6335M11853.f17458;
                c1245.f3618 = strM13972;
                c1245.f3619 = new Class[]{clsM118663};
                m11831(c6335M11853.m11855(), new C7547(this, 19));
            }
        } catch (Throwable unused2) {
        }
        try {
            String strM139722 = AbstractC8405.m13972(2648);
            String strM139723 = AbstractC8405.m13972(2649);
            C6335 c6335M118532 = C6335.m11853(strM139722);
            c6335M118532.f17458.f3618 = AbstractC8405.m13972(2650);
            Class[] clsArr = {AbstractC6337.m11866(strM139723)};
            C1245 c12452 = c6335M118532.f17458;
            c12452.f3619 = clsArr;
            c12452.f3617 = Boolean.TYPE;
            m11831(c6335M118532.m11855(), new C7547(18));
        } catch (Throwable unused3) {
        }
    }
}
