package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.C5175;
import p005.C6101;
import p015.AbstractC6201;
import p015.AbstractC6206;
import p015.C6202;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5780 implements InterfaceC5788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15868;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5780 f15866 = new C5780(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5780 f15867 = new C5780(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5780 f15863 = new C5780(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5780 f15862 = new C5780(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5780 f15864 = new C5780(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C5780 f15865 = new C5780(5);

    public /* synthetic */ C5780(int i) {
        this.f15868 = i;
    }

    /* JADX WARN: Finally extract failed */
    @Override // retrofit2.InterfaceC5788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4149(Object obj) {
        switch (this.f15868) {
            case 0:
                return obj.toString();
            case 1:
                AbstractC6201 abstractC6201 = (AbstractC6201) obj;
                try {
                    C6101 c6101 = new C6101();
                    abstractC6201.mo11110().mo11475(c6101);
                    C6202 c6202 = new C6202(abstractC6201.mo11108(), abstractC6201.mo11109(), c6101);
                    abstractC6201.close();
                    return c6202;
                } catch (Throwable th) {
                    abstractC6201.close();
                    throw th;
                }
            case 2:
                return (AbstractC6206) obj;
            case 3:
                return (AbstractC6201) obj;
            case 4:
                ((AbstractC6201) obj).close();
                return C5175.f14739;
            default:
                ((AbstractC6201) obj).close();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo11098(Method method) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo11099(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public String mo11100(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public List mo11112() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public List mo11113(Executor executor) {
        return Collections.singletonList(new C5793(executor));
    }
}
