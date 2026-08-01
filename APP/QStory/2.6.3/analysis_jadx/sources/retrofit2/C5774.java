package retrofit2;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3057;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import p007.AbstractC6133;
import p007.C6151;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5774 extends AbstractC5785 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f15849;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f15850;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15851 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f15852;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC5789 f15853;

    public C5774(Method method, int i, InterfaceC5789 interfaceC5789, String str) {
        this.f15850 = method;
        this.f15849 = i;
        this.f15853 = interfaceC5789;
        this.f15852 = str;
    }

    @Override // retrofit2.AbstractC5785
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11151(C5759 c5759, Object obj) {
        int i = this.f15851;
        InterfaceC5789 interfaceC5789 = this.f15853;
        Object obj2 = this.f15852;
        Method method = this.f15850;
        int i2 = this.f15849;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    c5759.m11145((C6151) obj2, (AbstractC6133) interfaceC5789.mo4159(obj));
                    return;
                } catch (IOException e) {
                    throw AbstractC5785.m11181(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC5785.m11181(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC5785.m11181(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC5785.m11181(method, i2, AbstractC0053.m158("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", AbstractC0053.m158("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    C6151 c6151 = C6151.f16892;
                    c5759.m11145(AbstractC3057.m6745(strArr), (AbstractC6133) interfaceC5789.mo4159(value));
                }
                return;
        }
    }

    public C5774(Method method, int i, C6151 c6151, InterfaceC5789 interfaceC5789) {
        this.f15850 = method;
        this.f15849 = i;
        this.f15852 = c6151;
        this.f15853 = interfaceC5789;
    }
}
