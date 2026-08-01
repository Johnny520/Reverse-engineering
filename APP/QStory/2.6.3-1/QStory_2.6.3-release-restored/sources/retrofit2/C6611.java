package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.C6008;
import p020.C6921;
import p023.AbstractC6957;
import p023.AbstractC6962;
import p023.C6958;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6611 implements InterfaceC6619 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f16213;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C6611 f16211 = new C6611(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C6611 f16212 = new C6611(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C6611 f16208 = new C6611(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C6611 f16207 = new C6611(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C6611 f16209 = new C6611(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C6611 f16210 = new C6611(5);

    public /* synthetic */ C6611(int i) {
        this.f16213 = i;
    }

    /* JADX WARN: Finally extract failed */
    @Override // retrofit2.InterfaceC6619
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4719(Object obj) {
        switch (this.f16213) {
            case 0:
                return obj.toString();
            case 1:
                AbstractC6957 abstractC6957 = (AbstractC6957) obj;
                try {
                    C6921 c6921 = new C6921();
                    abstractC6957.mo11726().mo12048(c6921);
                    C6958 c6958 = new C6958(abstractC6957.mo11724(), abstractC6957.mo11725(), c6921);
                    abstractC6957.close();
                    return c6958;
                } catch (Throwable th) {
                    abstractC6957.close();
                    throw th;
                }
            case 2:
                return (AbstractC6962) obj;
            case 3:
                return (AbstractC6957) obj;
            case 4:
                ((AbstractC6957) obj).close();
                return C6008.f15084;
            default:
                ((AbstractC6957) obj).close();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo11714(Method method) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo11715(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public String mo11716(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public List mo11728() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public List mo11729(Executor executor) {
        return Collections.singletonList(new C6624(executor));
    }
}
