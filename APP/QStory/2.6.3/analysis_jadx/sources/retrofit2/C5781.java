package retrofit2;

import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.C5176;
import p004.C6092;
import p007.AbstractC6128;
import p007.AbstractC6133;
import p007.C6129;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5781 implements InterfaceC5789 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f15868;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5781 f15866 = new C5781(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5781 f15867 = new C5781(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5781 f15863 = new C5781(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5781 f15862 = new C5781(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5781 f15864 = new C5781(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C5781 f15865 = new C5781(5);

    public /* synthetic */ C5781(int i) {
        this.f15868 = i;
    }

    /* JADX WARN: Finally extract failed */
    @Override // retrofit2.InterfaceC5789
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public Object mo4159(Object obj) {
        switch (this.f15868) {
            case 0:
                return obj.toString();
            case 1:
                AbstractC6128 abstractC6128 = (AbstractC6128) obj;
                try {
                    C6092 c6092 = new C6092();
                    abstractC6128.mo11167().mo11489(c6092);
                    C6129 c6129 = new C6129(abstractC6128.mo11165(), abstractC6128.mo11166(), c6092);
                    abstractC6128.close();
                    return c6129;
                } catch (Throwable th) {
                    abstractC6128.close();
                    throw th;
                }
            case 2:
                return (AbstractC6133) obj;
            case 3:
                return (AbstractC6128) obj;
            case 4:
                ((AbstractC6128) obj).close();
                return C5176.f14739;
            default:
                ((AbstractC6128) obj).close();
                return null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public boolean mo11155(Method method) {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public Object mo11156(Method method, Class cls, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public String mo11157(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public List mo11169() {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public List mo11170(Executor executor) {
        return Collections.singletonList(new C5794(executor));
    }
}
