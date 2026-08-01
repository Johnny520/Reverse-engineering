package retrofit2;

import androidx.activity.AbstractC0053;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: renamed from: retrofit2.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5775 extends AbstractC5784 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f15857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Method f15858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f15859;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f15860;

    public /* synthetic */ C5775(int i, int i2, Method method, boolean z) {
        this.f15859 = i2;
        this.f15858 = method;
        this.f15857 = i;
        this.f15860 = z;
    }

    @Override // retrofit2.AbstractC5784
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11094(C5758 c5758, Object obj) {
        int i = this.f15859;
        boolean z = this.f15860;
        Method method = this.f15858;
        int i2 = this.f15857;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw AbstractC5784.m11124(method, i2, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw AbstractC5784.m11124(method, i2, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw AbstractC5784.m11124(method, i2, AbstractC0053.m156("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw AbstractC5784.m11124(method, i2, "Field map value '" + value + "' converted to null by " + C5780.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    c5758.m11090(str, string, z);
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw AbstractC5784.m11124(method, i2, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw AbstractC5784.m11124(method, i2, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw AbstractC5784.m11124(method, i2, AbstractC0053.m156("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    c5758.m11089(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw AbstractC5784.m11124(method, i2, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw AbstractC5784.m11124(method, i2, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw AbstractC5784.m11124(method, i2, AbstractC0053.m156("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw AbstractC5784.m11124(method, i2, "Query map value '" + value3 + "' converted to null by " + C5780.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    c5758.m11087(str3, string2, z);
                }
                return;
        }
    }
}
