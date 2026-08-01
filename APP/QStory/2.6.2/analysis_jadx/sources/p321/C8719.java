package p321;

import android.content.Context;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3056;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import p026.AbstractC6293;
import p032.AbstractC6318;
import p032.C6316;
import p144.C7546;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言苏世兰子哲楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"L飘花落叶言苏世兰子哲楪/飘花落叶言子楪世哲兰苏;", "L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V", "app_publishRelease"}, k = 1, mv = {2, 3, 0}, xi = 50)
public final class C8719 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final List f24583 = AbstractC8189.m13659(AbstractC3056.m6668(-3937820132399908263L), AbstractC3056.m6668(-3937819844637099431L), AbstractC3056.m6668(-3937819582644094375L), AbstractC3056.m6668(-3937819294881285543L), AbstractC3056.m6668(-3937818964168803751L), AbstractC3056.m6668(-3937818569031812519L));

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        AbstractC3056.m6668(-3937693744397288871L);
        classLoader.getClass();
        Iterator it = f24583.iterator();
        while (it.hasNext()) {
            try {
                Class clsM11838 = AbstractC6318.m11838((String) it.next());
                if (clsM11838 != null) {
                    m11802(clsM11838.getDeclaredConstructor(Context.class), new C7546(18));
                }
            } catch (Throwable unused) {
            }
        }
        try {
            Class clsM118382 = AbstractC6318.m11838(AbstractC3056.m6668(-3937821605573690791L));
            Class clsM118383 = AbstractC6318.m11838(AbstractC3056.m6668(-3937821352170620327L));
            if (clsM118382 != null && clsM118383 != null) {
                C6316 c6316M11825 = C6316.m11825(clsM118382.getName());
                String strM6668 = AbstractC3056.m6668(-3937821072997746087L);
                C1245 c1245 = c6316M11825.f17409;
                c1245.f3617 = strM6668;
                c1245.f3618 = new Class[]{clsM118383};
                m11803(c6316M11825.m11827(), new C7546(this, 20));
            }
        } catch (Throwable unused2) {
        }
        try {
            String strM66682 = AbstractC3056.m6668(-3937820978508465575L);
            String strM66683 = AbstractC3056.m6668(-3937820725105395111L);
            C6316 c6316M118252 = C6316.m11825(strM66682);
            c6316M118252.f17409.f3617 = AbstractC3056.m6668(-3937820506062063015L);
            Class[] clsArr = {AbstractC6318.m11838(strM66683)};
            C1245 c12452 = c6316M118252.f17409;
            c12452.f3618 = clsArr;
            c12452.f3616 = Boolean.TYPE;
            m11803(c6316M118252.m11827(), new C7546(19));
        } catch (Throwable unused3) {
        }
    }
}
