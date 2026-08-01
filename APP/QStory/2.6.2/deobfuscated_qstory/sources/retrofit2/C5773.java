package retrofit2;

import androidx.activity.AbstractC0053;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import p015.AbstractC6206;
import p015.C6224;
import p251.AbstractC8174;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5773 extends AbstractC5784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f15849;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f15850;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15851 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f15852;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC5788 f15853;

    public C5773(Method method, int i, InterfaceC5788 interfaceC5788, String str) {
        this.f15850 = method;
        this.f15849 = i;
        this.f15853 = interfaceC5788;
        this.f15852 = str;
    }

    @Override // retrofit2.AbstractC5784
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11094(C5758 c5758, Object obj) {
        int i = this.f15851;
        InterfaceC5788 interfaceC5788 = this.f15853;
        Object obj2 = this.f15852;
        Method method = this.f15850;
        int i2 = this.f15849;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    c5758.m11088((C6224) obj2, (AbstractC6206) interfaceC5788.mo4149(obj));
                    return;
                } catch (IOException e) {
                    throw AbstractC5784.m11124(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC5784.m11124(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC5784.m11124(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC5784.m11124(method, i2, AbstractC0053.m156("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", AbstractC0053.m156("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    C6224 c6224 = C6224.f17131;
                    c5758.m11088(AbstractC8174.m13611(strArr), (AbstractC6206) interfaceC5788.mo4149(value));
                }
                return;
        }
    }

    public C5773(Method method, int i, C6224 c6224, InterfaceC5788 interfaceC5788) {
        this.f15850 = method;
        this.f15849 = i;
        this.f15852 = c6224;
        this.f15853 = interfaceC5788;
    }
}
