package retrofit2;

import androidx.activity.AbstractC0900;
import com.bumptech.glide.AbstractC3889;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import p023.AbstractC6962;
import p023.C6980;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6604 extends AbstractC6615 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f16194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f16195;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f16196 = 1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Object f16197;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC6619 f16198;

    public C6604(Method method, int i, InterfaceC6619 interfaceC6619, String str) {
        this.f16195 = method;
        this.f16194 = i;
        this.f16198 = interfaceC6619;
        this.f16197 = str;
    }

    @Override // retrofit2.AbstractC6615
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11710(C6589 c6589, Object obj) {
        int i = this.f16196;
        InterfaceC6619 interfaceC6619 = this.f16198;
        Object obj2 = this.f16197;
        Method method = this.f16195;
        int i2 = this.f16194;
        switch (i) {
            case 0:
                if (obj == null) {
                    return;
                }
                try {
                    c6589.m11704((C6980) obj2, (AbstractC6962) interfaceC6619.mo4719(obj));
                    return;
                } catch (IOException e) {
                    throw AbstractC6615.m11740(method, i2, "Unable to convert " + obj + " to RequestBody", e);
                }
            default:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC6615.m11740(method, i2, "Part map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC6615.m11740(method, i2, "Part map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC6615.m11740(method, i2, AbstractC0900.m718("Part map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String[] strArr = {"Content-Disposition", AbstractC0900.m718("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2};
                    C6980 c6980 = C6980.f17237;
                    c6589.m11704(AbstractC3889.m7305(strArr), (AbstractC6962) interfaceC6619.mo4719(value));
                }
                return;
        }
    }

    public C6604(Method method, int i, C6980 c6980, InterfaceC6619 interfaceC6619) {
        this.f16195 = method;
        this.f16194 = i;
        this.f16197 = c6980;
        this.f16198 = interfaceC6619;
    }
}
